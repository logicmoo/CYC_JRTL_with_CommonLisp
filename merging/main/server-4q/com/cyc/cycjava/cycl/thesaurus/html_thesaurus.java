/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.thesaurus;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.min;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.rem;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.butlast;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.last;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.read_line;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.html_kernel;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.pph_main;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      HTML-THESAURUS
 *  source file: /cyc/top/cycl/thesaurus/html-thesaurus.lisp
 *  created:     2019/07/03 17:38:30
 */
public final class html_thesaurus extends SubLTranslatedFile implements V02 {
    // // Constructor
    private html_thesaurus() {
    }

    public static final SubLFile me = new html_thesaurus();

    public static final String myName = "com.cyc.cycjava.cycl.thesaurus.html_thesaurus";







    /**
     * Directory for TM images
     */
    // defparameter
    private static final SubLSymbol $tm_image_directory$ = makeSymbol("*TM-IMAGE-DIRECTORY*");

    public static final SubLObject tm_image_directory() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $tm_image_directory$.getDynamicValue(thread)) {
                $tm_image_directory$.setDynamicValue(format(NIL, $str_alt3$_Atm_img_, system_parameters.$html_image_directory$.getDynamicValue(thread)), thread);
            }
            return $tm_image_directory$.getDynamicValue(thread);
        }
    }

    /**
     * Basic html image for thesaurus icons.
     */
    public static final SubLObject html_thesaurus_image(SubLObject name, SubLObject alt, SubLObject align, SubLObject border) {
        if (alt == UNPROVIDED) {
            alt = name;
        }
        if (align == UNPROVIDED) {
            align = NIL;
        }
        if (border == UNPROVIDED) {
            border = $$$none;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = system_parameters.$html_image_directory$.currentBinding(thread);
                try {
                    system_parameters.$html_image_directory$.bind(tm_image_directory(), thread);
                    html_utilities.html_basic_image(name, alt, align, border);
                } finally {
                    system_parameters.$html_image_directory$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    /**
     * The URL directory pathname for HTML help files.  This should be set
     * in the thesaurus manager init file.
     */
    // defparameter
    public static final SubLSymbol $tm_help_directory_url$ = makeSymbol("*TM-HELP-DIRECTORY-URL*");

    // defparameter
    public static final SubLSymbol $tm_help_default_page$ = makeSymbol("*TM-HELP-DEFAULT-PAGE*");

    // defparameter
    public static final SubLSymbol $tm_help_image$ = makeSymbol("*TM-HELP-IMAGE*");

    // defparameter
    public static final SubLSymbol $tm_help_icon$ = makeSymbol("*TM-HELP-ICON*");

    // defparameter
    public static final SubLSymbol $tm_alphabetical_icon$ = makeSymbol("*TM-ALPHABETICAL-ICON*");

    // defparameter
    public static final SubLSymbol $tm_hierarchical_icon$ = makeSymbol("*TM-HIERARCHICAL-ICON*");

    // defparameter
    public static final SubLSymbol $tm_full_record_icon$ = makeSymbol("*TM-FULL-RECORD-ICON*");

    // defparameter
    public static final SubLSymbol $tm_audit_icon$ = makeSymbol("*TM-AUDIT-ICON*");

    // defparameter
    public static final SubLSymbol $tm_correlate_button$ = makeSymbol("*TM-CORRELATE-BUTTON*");

    // defparameter
    public static final SubLSymbol $tm_uncorrelate_button$ = makeSymbol("*TM-UNCORRELATE-BUTTON*");

    // defparameter
    public static final SubLSymbol $tm_swap_pt_uf_button$ = makeSymbol("*TM-SWAP-PT-UF-BUTTON*");

    // defparameter
    public static final SubLSymbol $tm_import_ufs_button$ = makeSymbol("*TM-IMPORT-UFS-BUTTON*");

    // defparameter
    public static final SubLSymbol $tm_cyc_icon$ = makeSymbol("*TM-CYC-ICON*");

    // defparameter
    public static final SubLSymbol $tm_alpha_pageup_icon$ = makeSymbol("*TM-ALPHA-PAGEUP-ICON*");

    // defparameter
    public static final SubLSymbol $tm_alpha_pagedn_icon$ = makeSymbol("*TM-ALPHA-PAGEDN-ICON*");

    // defparameter
    public static final SubLSymbol $tm_hd_relation_icon$ = makeSymbol("*TM-HD-RELATION-ICON*");

    // defparameter
    public static final SubLSymbol $tm_alpha_show_variants_icon$ = makeSymbol("*TM-ALPHA-SHOW-VARIANTS-ICON*");

    // defparameter
    public static final SubLSymbol $tm_alpha_dont_show_variants_icon$ = makeSymbol("*TM-ALPHA-DONT-SHOW-VARIANTS-ICON*");

    /**
     * A table for the simple kinds of thesaurus manager links only
     */
    // defparameter
    public static final SubLSymbol $tm_link_table$ = makeSymbol("*TM-LINK-TABLE*");

    /**
     * Produce a thesaurus link of TYPE.
     * The behavior of different types are parametrized via ARG1 ARG2 ...
     */
    public static final SubLObject tm_link(SubLObject type, SubLObject arg1, SubLObject arg2, SubLObject arg3) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject simple = assoc(type, $tm_link_table$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                SubLObject use_imagesP = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $USE_IMAGES);
                if (NIL != simple) {
                    if (NIL != member(type, $list_alt23, UNPROVIDED, UNPROVIDED)) {
                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt24$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        format(html_macros.$html_stream$.getDynamicValue(thread), second(simple), arg2);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_princ(arg1);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                    } else
                        if (NIL != member(type, $list_alt25, UNPROVIDED, UNPROVIDED)) {
                            {
                                SubLObject datum = simple;
                                SubLObject current = datum;
                                SubLObject kind = NIL;
                                SubLObject link_url = NIL;
                                SubLObject alt = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt26);
                                kind = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt26);
                                link_url = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt26);
                                alt = current.first();
                                current = current.rest();
                                {
                                    SubLObject image = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                                    destructuring_bind_must_listp(current, datum, $list_alt26);
                                    current = current.rest();
                                    if (NIL == current) {
                                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt24$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                        html_utilities.html_princ(link_url);
                                        html_utilities.html_princ($str_alt27$_);
                                        html_utilities.html_url_princ(arg1);
                                        if (NIL != arg2) {
                                            html_utilities.html_princ($str_alt27$_);
                                            html_utilities.html_url_princ(arg2);
                                        }
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                if ((NIL != use_imagesP) && (NIL != image)) {
                                                    html_thesaurus_image(image, alt, UNPROVIDED, UNPROVIDED);
                                                } else {
                                                    html_utilities.html_princ(alt);
                                                    html_utilities.html_indent(TWO_INTEGER);
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                    } else {
                                        cdestructuring_bind_error(datum, $list_alt26);
                                    }
                                }
                            }
                        } else
                            if (NIL != member(type, $list_alt28, UNPROVIDED, UNPROVIDED)) {
                                {
                                    SubLObject datum = simple;
                                    SubLObject current = datum;
                                    SubLObject kind = NIL;
                                    SubLObject link_url = NIL;
                                    destructuring_bind_must_consp(current, datum, $list_alt29);
                                    kind = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt29);
                                    link_url = current.first();
                                    current = current.rest();
                                    if (NIL == current) {
                                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt24$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                        html_utilities.html_princ(link_url);
                                        html_utilities.html_princ($str_alt27$_);
                                        html_utilities.html_url_princ(arg1);
                                        if (NIL != arg3) {
                                            html_utilities.html_princ($str_alt27$_);
                                            html_utilities.html_url_princ(arg3);
                                        }
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_princ(arg2);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                    } else {
                                        cdestructuring_bind_error(datum, $list_alt29);
                                    }
                                }
                            } else
                                if (NIL != member(type, $list_alt30, UNPROVIDED, UNPROVIDED)) {
                                    {
                                        SubLObject datum = simple;
                                        SubLObject current = datum;
                                        SubLObject kind = NIL;
                                        SubLObject link_url = NIL;
                                        SubLObject alt = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt26);
                                        kind = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt26);
                                        link_url = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt26);
                                        alt = current.first();
                                        current = current.rest();
                                        {
                                            SubLObject image = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                                            destructuring_bind_must_listp(current, datum, $list_alt26);
                                            current = current.rest();
                                            if (NIL == current) {
                                                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt24$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                html_utilities.html_princ(link_url);
                                                html_utilities.html_princ($str_alt27$_);
                                                html_utilities.html_url_princ(arg1);
                                                if (NIL != arg2) {
                                                    html_utilities.html_princ($str_alt27$_);
                                                    html_utilities.html_url_princ(arg2);
                                                }
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        if (((NIL != use_imagesP) && (NIL == arg3)) && (NIL != image)) {
                                                            html_thesaurus_image(image, alt, $TOP, UNPROVIDED);
                                                        } else {
                                                            if (NIL != arg3) {
                                                                html_utilities.html_princ(arg3);
                                                            } else {
                                                                html_utilities.html_princ(alt);
                                                            }
                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                            } else {
                                                cdestructuring_bind_error(datum, $list_alt26);
                                            }
                                        }
                                    }
                                } else {
                                    {
                                        SubLObject datum = simple;
                                        SubLObject current = datum;
                                        SubLObject kind = NIL;
                                        SubLObject link_url = NIL;
                                        SubLObject alt = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt26);
                                        kind = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt26);
                                        link_url = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt26);
                                        alt = current.first();
                                        current = current.rest();
                                        {
                                            SubLObject image = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                                            destructuring_bind_must_listp(current, datum, $list_alt26);
                                            current = current.rest();
                                            if (NIL == current) {
                                                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt24$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                html_utilities.html_url_princ(link_url);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        if ((NIL != use_imagesP) && (NIL != image)) {
                                                            if (NIL != arg1) {
                                                                html_thesaurus_image(image, arg1, UNPROVIDED, UNPROVIDED);
                                                            } else {
                                                                html_thesaurus_image(image, alt, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } else {
                                                            if (NIL != arg1) {
                                                                html_utilities.html_princ(arg1);
                                                            } else {
                                                                html_utilities.html_princ(alt);
                                                            }
                                                            html_utilities.html_indent(TWO_INTEGER);
                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                            } else {
                                                cdestructuring_bind_error(datum, $list_alt26);
                                            }
                                        }
                                    }
                                }



                } else {
                    {
                        SubLObject pcase_var = type;
                        if (pcase_var.eql($SHOW_FILE)) {
                            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt24$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                            html_utilities.html_princ($str_alt33$tm_show_file_);
                            html_utilities.html_url_princ(arg1);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_princ(arg2);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                        } else
                            if (pcase_var.eql($CONCEPT_DESCRIPTION)) {
                                {
                                    SubLObject cyc_name = (NIL != constant_handles.constant_p(arg1)) ? ((SubLObject) (constants_high.constant_name(arg1))) : string_utilities.object_to_string(narts_high.nart_el_formula(arg1));
                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt24$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt35$tm_concept_description_id__A, cb_utilities.cb_fort_identifier(arg1));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            if (cyc_name.isString()) {
                                                html_utilities.html_princ(cyc_name);
                                            } else {
                                                html_utilities.html_princ(pph_main.generate_text(arg1, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                }
                            } else
                                if (pcase_var.eql($CYC_CONCEPT)) {
                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt24$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt35$tm_concept_description_id__A, cb_utilities.cb_fort_identifier(arg1));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            if (NIL != use_imagesP) {
                                                html_thesaurus_image($tm_cyc_icon$.getDynamicValue(thread).first(), second($tm_cyc_icon$.getDynamicValue(thread)), $TOP, UNPROVIDED);
                                            } else {
                                                html_thesaurus_image(second($tm_cyc_icon$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                } else
                                    if (pcase_var.eql($ALPHABETICAL)) {
                                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt24$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                        html_utilities.html_princ($str_alt38$tm_ad_);
                                        html_utilities.html_url_princ(arg1);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                if (((NIL != use_imagesP) && (NIL == arg2)) && (NIL != $tm_alphabetical_icon$.getDynamicValue(thread))) {
                                                    html_thesaurus_image($tm_alphabetical_icon$.getDynamicValue(thread).first(), second($tm_alphabetical_icon$.getDynamicValue(thread)), $TOP, UNPROVIDED);
                                                } else {
                                                    if (NIL != arg2) {
                                                        html_utilities.html_princ(arg2);
                                                    } else {
                                                        html_utilities.html_princ(second($tm_alphabetical_icon$.getDynamicValue(thread)));
                                                    }
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                    } else
                                        if (pcase_var.eql($FULL_RECORD)) {
                                            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt24$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                            html_utilities.html_princ($str_alt40$tm_fd_);
                                            html_utilities.html_url_princ(arg1);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    if (((NIL != use_imagesP) && (NIL == arg2)) && (NIL != $tm_full_record_icon$.getDynamicValue(thread))) {
                                                        html_thesaurus_image($tm_full_record_icon$.getDynamicValue(thread).first(), second($tm_full_record_icon$.getDynamicValue(thread)), $TOP, UNPROVIDED);
                                                    } else {
                                                        if (NIL != arg2) {
                                                            html_utilities.html_princ(arg2);
                                                        } else {
                                                            html_utilities.html_princ(second($tm_full_record_icon$.getDynamicValue(thread)));
                                                        }
                                                    }
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                        } else
                                            if (pcase_var.eql($DUMP_THESAURUS)) {
                                                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt24$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                html_utilities.html_princ($str_alt42$tm_dump_thesaurus);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        format(html_macros.$html_stream$.getDynamicValue(thread), arg1);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                            } else
                                                if (pcase_var.eql($HD_RELATION)) {
                                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt24$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                    html_utilities.html_princ($str_alt44$tm_hd_relation_);
                                                    html_utilities.html_url_princ(arg1);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            if (((NIL != use_imagesP) && (NIL == arg2)) && (NIL != $tm_hd_relation_icon$.getDynamicValue(thread))) {
                                                                html_thesaurus_image($tm_hd_relation_icon$.getDynamicValue(thread).first(), second($tm_hd_relation_icon$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED);
                                                            } else {
                                                                if (NIL != arg2) {
                                                                    format(html_macros.$html_stream$.getDynamicValue(thread), arg2);
                                                                } else {
                                                                    format(html_macros.$html_stream$.getDynamicValue(thread), second($tm_hd_relation_icon$.getDynamicValue(thread)));
                                                                }
                                                            }
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                } else
                                                    if (pcase_var.eql($ALPHA_STATE_TOGGLE)) {
                                                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt24$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                        html_utilities.html_princ($str_alt46$tm_ad_toggle_);
                                                        html_utilities.html_url_princ(arg1);
                                                        {
                                                            SubLObject cdolist_list_var = arg2;
                                                            SubLObject arg = NIL;
                                                            for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                                                                html_utilities.html_princ($str_alt27$_);
                                                                html_utilities.html_url_princ(arg);
                                                            }
                                                        }
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                if (NIL != tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $ALPHABETICAL_SHOW_USE_FORS)) {
                                                                    if (NIL != tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $USE_IMAGES)) {
                                                                        html_thesaurus_image($tm_alpha_dont_show_variants_icon$.getDynamicValue(thread).first(), second($tm_alpha_dont_show_variants_icon$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED);
                                                                    } else {
                                                                        html_utilities.html_princ(second($tm_alpha_dont_show_variants_icon$.getDynamicValue(thread)));
                                                                    }
                                                                } else {
                                                                    if (NIL != tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $USE_IMAGES)) {
                                                                        html_thesaurus_image($tm_alpha_show_variants_icon$.getDynamicValue(thread).first(), second($tm_alpha_show_variants_icon$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED);
                                                                    } else {
                                                                        html_utilities.html_princ(second($tm_alpha_show_variants_icon$.getDynamicValue(thread)));
                                                                    }
                                                                }
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                    } else
                                                        if (pcase_var.eql($HELP)) {
                                                            {
                                                                SubLObject dir = $tm_help_directory_url$.getDynamicValue(thread);
                                                                SubLObject filename = arg1;
                                                                SubLObject ext = $str_alt49$_html;
                                                                SubLObject url = format(NIL, $str_alt50$_a_a_a, new SubLObject[]{ dir, filename, NIL != string_utilities.substringP(ext, filename, UNPROVIDED, UNPROVIDED, UNPROVIDED) ? ((SubLObject) ($str_alt51$)) : ext });
                                                                SubLObject name = $str_alt52$help_page;
                                                                SubLObject target = (NIL != tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $SEPARATE_HELP_PAGE)) ? ((SubLObject) ($str_alt52$help_page)) : html_macros.$html_self_target$.getGlobalValue();
                                                                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup(url);
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                if (NIL != name) {
                                                                    html_utilities.html_markup(html_macros.$html_anchor_name$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(name);
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                if (NIL != target) {
                                                                    html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(target);
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        if (NIL != arg2) {
                                                                            html_utilities.html_princ(arg2);
                                                                        } else {
                                                                            if (NIL != use_imagesP) {
                                                                                html_thesaurus_image($tm_help_icon$.getDynamicValue(thread).first(), second($tm_help_icon$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED);
                                                                            } else {
                                                                                html_utilities.html_princ(second($tm_help_icon$.getDynamicValue(thread)));
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                            }
                                                        } else
                                                            if (pcase_var.eql($USER)) {
                                                                if (NIL != arg1) {
                                                                    html_utilities.html_princ(arg1);
                                                                } else {
                                                                    html_utilities.html_princ($$$None);
                                                                }
                                                            } else
                                                                if (pcase_var.eql($THESAURUS)) {
                                                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt24$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt57$tm_at__a, cb_utilities.cb_fort_identifier(arg1));
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_princ(tm_internals.thesaurus_name(arg1));
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                                } else
                                                                    if (pcase_var.eql($SHOW_THESAURI)) {
                                                                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt24$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                                        html_utilities.html_princ($str_alt59$tm_show_thesauri);
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_utilities.html_princ(arg1);
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                                    } else
                                                                        if (pcase_var.eql($TERM_IN_THESAURUS)) {
                                                                            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                                            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt24$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                                            html_utilities.html_princ($str_alt61$tm_tit_);
                                                                            html_utilities.html_url_princ(arg1);
                                                                            html_utilities.html_princ($str_alt27$_);
                                                                            html_utilities.html_url_princ(arg3);
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    html_utilities.html_princ(arg2);
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                                        } else
                                                                            if (pcase_var.eql($RELATION)) {
                                                                                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                                                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt24$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                                                html_utilities.html_princ($str_alt63$tm_rel_);
                                                                                html_utilities.html_url_princ(arg1);
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                {
                                                                                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                    try {
                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                        html_utilities.html_princ(arg1);
                                                                                    } finally {
                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                                                                    }
                                                                                }
                                                                                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                                            } else
                                                                                if (pcase_var.eql($OUTPUT_FILTER)) {
                                                                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt24$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt65$tm_output_filter_page__A, cb_utilities.cb_fort_identifier(arg1));
                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                    {
                                                                                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                        try {
                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                            html_utilities.html_princ(tm_internals.tm_filter_name(arg1));
                                                                                        } finally {
                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                                                                        }
                                                                                    }
                                                                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                                                } else
                                                                                    if (pcase_var.eql($EDIT_FILTER)) {
                                                                                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                                                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt24$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt67$tm_edit_output_filter__a, arg1);
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                        {
                                                                                            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                            try {
                                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                                html_utilities.html_princ($$$Edit_this_Filter);
                                                                                            } finally {
                                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                                                                            }
                                                                                        }
                                                                                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                                                    } else
                                                                                        if (pcase_var.eql($DELETE_FILTER)) {
                                                                                            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                                                            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt24$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt70$tm_delete_output_filter__a, arg1);
                                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                            {
                                                                                                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                try {
                                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                                    html_utilities.html_princ($$$Delete_this_Filter);
                                                                                                } finally {
                                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                                                                                }
                                                                                            }
                                                                                            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                                                        } else
                                                                                            if (pcase_var.eql($ADD_OR_EDIT_COMMENT)) {
                                                                                                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                                                                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt24$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                                                                html_utilities.html_princ($str_alt73$tm_add_or_edit_comment_id_);
                                                                                                html_utilities.html_url_princ(arg1);
                                                                                                html_utilities.html_princ($str_alt74$_edit_);
                                                                                                html_utilities.html_url_princ(arg2);
                                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                {
                                                                                                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                    try {
                                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                                        if (NIL != arg2) {
                                                                                                            html_utilities.html_princ($str_alt75$_Edit_the_comment_);
                                                                                                        } else {
                                                                                                            html_utilities.html_princ($str_alt76$_Add_a_comment_);
                                                                                                        }
                                                                                                    } finally {
                                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                                                                                    }
                                                                                                }
                                                                                                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                                                            } else
                                                                                                if (pcase_var.eql($SET_FILTER)) {
                                                                                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                                                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt24$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt78$tm_change_filter__a__s, cb_utilities.cb_fort_identifier(arg1), arg2);
                                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                    {
                                                                                                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                        try {
                                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt79$_Set_the__A_Filter_, Strings.string_capitalize(format(NIL, $str_alt80$_a, arg2), UNPROVIDED, UNPROVIDED));
                                                                                                        } finally {
                                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                                                                                        }
                                                                                                    }
                                                                                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                                                                } else
                                                                                                    if (pcase_var.eql($SET_CASE_STYLE)) {
                                                                                                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                                                                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt24$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                                                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt82$tm_set_case_style__a, cb_utilities.cb_fort_identifier(arg1));
                                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                        {
                                                                                                            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                            try {
                                                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt83$_Set_the_Default_Case_Style_);
                                                                                                            } finally {
                                                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                                                                                            }
                                                                                                        }
                                                                                                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                                                                    } else
                                                                                                        if (pcase_var.eql($SET_OR_VIEW_INTEGRITY_RULES)) {
                                                                                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt85$_);
                                                                                                            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                                                                            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt24$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                                                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt86$tm_choose_integrity_modules_to_us, cb_utilities.cb_fort_identifier(arg1));
                                                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                            {
                                                                                                                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                                try {
                                                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $$$Choose);
                                                                                                                } finally {
                                                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                                                                                                }
                                                                                                            }
                                                                                                            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                                                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt88$___);
                                                                                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                                                            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                                                                            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt24$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                                                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt89$tm_integrity_module_info_page__a, cb_utilities.cb_fort_identifier(arg1));
                                                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                            {
                                                                                                                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                                try {
                                                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $$$View);
                                                                                                                } finally {
                                                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                                                                                                }
                                                                                                            }
                                                                                                            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                                                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt91$_Integrity_Rules_for_Thesaurus_);
                                                                                                        } else
                                                                                                            if (pcase_var.eql($SET_OR_VIEW_APPLICABLE_RELATIONS)) {
                                                                                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt85$_);
                                                                                                                if ((NIL != tm_internals.editing_allowedP()) && (NIL != member(tm_guess_fort(arg1), tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $EDIT_THESAURI), symbol_function(EQUALP), UNPROVIDED))) {
                                                                                                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                                                                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt24$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                                                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt94$tm_restrict_relations_for_thesaur, arg1);
                                                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                                    {
                                                                                                                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                                        try {
                                                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                            format(html_macros.$html_stream$.getDynamicValue(thread), $$$Choose);
                                                                                                                        } finally {
                                                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                                                                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt88$___);
                                                                                                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                                                                }
                                                                                                                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                                                                                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt24$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                                                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt95$tm_browse_restriction_relations_e, arg1);
                                                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                                {
                                                                                                                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                                    try {
                                                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                        format(html_macros.$html_stream$.getDynamicValue(thread), $$$View);
                                                                                                                    } finally {
                                                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                                                                                                    }
                                                                                                                }
                                                                                                                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                                                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt96$_Applicable_Relations_for_Thesaur);
                                                                                                            } else
                                                                                                                if (pcase_var.eql($TOGGLE_RELEASE_STATUS)) {
                                                                                                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                                                                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt24$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                                                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt98$tm_change_released_status__a, cb_utilities.cb_fort_identifier(arg1));
                                                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                                    {
                                                                                                                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                                        try {
                                                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                            if (NIL != arg2) {
                                                                                                                                html_utilities.html_princ($str_alt99$_Retract_the_Release_of_this_Thes);
                                                                                                                            } else {
                                                                                                                                html_utilities.html_princ($str_alt100$_Release_this_Thesaurus_);
                                                                                                                            }
                                                                                                                        } finally {
                                                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                                                                                } else {
                                                                                                                    html_utilities.html_princ(type);
                                                                                                                }






















                    }
                }
            }
            return NIL;
        }
    }

    /**
     * provide a help link for PAGE
     */
    public static final SubLObject tm_help_link(SubLObject page) {
        if (page == UNPROVIDED) {
            page = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == page) {
                page = $tm_help_default_page$.getDynamicValue(thread);
            }
            tm_link($HELP, page, NIL, UNPROVIDED);
            return NIL;
        }
    }

    public static final SubLObject tm_debug() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            tm_datastructures.$tm_debug$.setDynamicValue(T, thread);
            return tm_datastructures.$tm_debug$.getDynamicValue(thread);
        }
    }

    public static final SubLObject tm_no_debug() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            tm_datastructures.$tm_debug$.setDynamicValue(NIL, thread);
            return tm_datastructures.$tm_debug$.getDynamicValue(thread);
        }
    }

    public static final SubLObject tm_guess_fort(SubLObject identifier) {
        if (identifier.isSymbol()) {
            identifier = format(NIL, $str_alt101$_A, identifier);
        }
        if (identifier.isString()) {
            identifier = Strings.string_downcase(identifier, UNPROVIDED, UNPROVIDED);
        }
        return cb_utilities.cb_guess_fort(identifier, UNPROVIDED);
    }

    /**
     * Thesaurus status line, indicating user, active thesauri, and possibly
     * other info
     */
    public static final SubLObject tm_status_line() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $SHOW_STATUS_LINE)) {
                {
                    SubLObject size_val = TWO_INTEGER;
                    html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                    if (NIL != size_val) {
                        html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(size_val);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ($str_alt103$User__);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            tm_link($USER, tm_datastructures.$tm_user$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                            html_utilities.html_spaces(THREE_INTEGER);
                            {
                                SubLObject selected = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $SELECTED_THESAURUS);
                                SubLObject active = (NIL != selected) ? ((SubLObject) (list(selected))) : tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI);
                                SubLObject len = length(active);
                                SubLObject text = format(NIL, $str_alt106$Thesaur_a, len.numE(ONE_INTEGER) ? ((SubLObject) ($str_alt107$us_)) : $str_alt108$i_);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ(NIL != selected ? ((SubLObject) ($str_alt109$Selected_)) : $str_alt110$Browsing_);
                                tm_link($SHOW_THESAURI, text, UNPROVIDED, UNPROVIDED);
                                html_utilities.html_princ($str_alt111$_);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                if (NIL != active) {
                                    {
                                        SubLObject cdolist_list_var = active;
                                        SubLObject thesaurus = NIL;
                                        for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                                            if (!thesaurus.equal(active.first())) {
                                                html_utilities.html_princ($str_alt112$__);
                                            }
                                            tm_link($THESAURUS, thesaurus, UNPROVIDED, UNPROVIDED);
                                        }
                                    }
                                } else {
                                    html_utilities.html_princ($str_alt113$None__);
                                }
                            }
                            if (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $str_alt114$limited_editor)) {
                                html_utilities.html_spaces(THREE_INTEGER);
                                if (NIL != tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $EDITING_ENABLED)) {
                                    {
                                        SubLObject edit_thesauri = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $EDIT_THESAURI);
                                        SubLObject len = length(edit_thesauri);
                                        SubLObject text = format(NIL, $str_alt106$Thesaur_a, len.numE(ONE_INTEGER) ? ((SubLObject) ($str_alt107$us_)) : $str_alt108$i_);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($str_alt116$Editing_);
                                        tm_link($SHOW_THESAURI, text, UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_princ($str_alt111$_);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        if (NIL != edit_thesauri) {
                                            {
                                                SubLObject cdolist_list_var = edit_thesauri;
                                                SubLObject thesaurus = NIL;
                                                for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                                                    if (!thesaurus.equal(edit_thesauri.first())) {
                                                        html_utilities.html_princ($str_alt112$__);
                                                    }
                                                    tm_link($THESAURUS, thesaurus, UNPROVIDED, UNPROVIDED);
                                                }
                                            }
                                        } else {
                                            html_utilities.html_princ($str_alt113$None__);
                                        }
                                    }
                                } else {
                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_utilities.html_princ($$$Editing_Off);
                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                }
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                }
            }
            return NIL;
        }
    }

    /**
     * Prints link to info about the the tool.
     */
    public static final SubLObject tm_about_link() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt24$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
            html_utilities.html_princ($str_alt118$tm_about);
            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_princ($str_alt119$About_);
                    html_utilities.html_princ(tm_control_vars.$tool_name$.getDynamicValue(thread));
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            return NIL;
        }
    }

    public static final SubLObject tm_about(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ(format(NIL, $str_alt120$About__A, tm_control_vars.$tool_name$.getDynamicValue(thread)));
                html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (NIL != color_value) {
                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(color_value));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_1 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_2 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
                                                html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            if (true) {
                                                html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(ZERO_INTEGER);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_2, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                }
                                html_utilities.html_princ(format(NIL, $str_alt120$About__A, tm_control_vars.$tool_name$.getDynamicValue(thread)));
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                tm_logging.tm_enqueue_event(format(NIL, $str_alt120$About__A, tm_control_vars.$tool_name$.getDynamicValue(thread)));
                                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                {
                                    SubLObject size_val = SEVEN_INTEGER;
                                    html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                    if (NIL != size_val) {
                                        html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(size_val);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                            html_utilities.html_princ(tm_control_vars.$tool_name$.getDynamicValue(thread));
                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                }
                                html_utilities.html_br();
                                html_utilities.html_markup($str_alt121$Copyright__copy__1996___2002_);
                                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.$cycorp_homepage_url$.getDynamicValue(thread));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_5 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($str_alt122$Cycorp__Inc_);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_5, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                html_utilities.html_princ($str_alt123$___All_rights_reserved_);
                                html_utilities.html_br();
                                html_utilities.html_br();
                                {
                                    SubLObject size_val = FOUR_INTEGER;
                                    html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                    if (NIL != size_val) {
                                        html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(size_val);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_6 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ($str_alt124$The_);
                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                            html_utilities.html_princ(tm_control_vars.$application_name$.getDynamicValue(thread));
                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                            html_utilities.html_princ($str_alt125$_is_browsed_and_maintained_using_);
                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                            html_utilities.html_princ(tm_control_vars.$tool_name$.getDynamicValue(thread));
                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                            html_utilities.html_princ($str_alt126$__an_advanced_thesaurus_managemen);
                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt127$Cyc__reg_);
                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                            html_utilities.html_princ($str_alt128$_technology_);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                }
                                html_utilities.html_br();
                                html_utilities.html_br();
                                html_utilities.html_princ($str_alt129$Hit_your_browser_s__Back__button_);
                                html_utilities.html_br();
                                html_utilities.html_br();
                                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt130$This_computer_program_is_protecte);
                                html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                tm_footer();
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_1, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            }
            return NIL;
        }
    }

    public static final SubLObject tm_contacts_okP() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!tm_control_vars.$tm_contacts$.getDynamicValue(thread).isCons()) {
                return NIL;
            }
            if (NIL != remove_if(symbol_function(CONSP), tm_control_vars.$tm_contacts$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                return NIL;
            }
            {
                SubLObject bad = NIL;
                if (NIL == bad) {
                    {
                        SubLObject csome_list_var = tm_control_vars.$tm_contacts$.getDynamicValue(thread);
                        SubLObject contact = NIL;
                        for (contact = csome_list_var.first(); !((NIL != bad) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , contact = csome_list_var.first()) {
                            if (NIL != list_utilities.doubletonP(contact)) {
                                {
                                    SubLObject datum = contact;
                                    SubLObject current = datum;
                                    SubLObject name = NIL;
                                    SubLObject address = NIL;
                                    destructuring_bind_must_consp(current, datum, $list_alt133);
                                    name = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt133);
                                    address = current.first();
                                    current = current.rest();
                                    if (NIL == current) {
                                        if (!(name.isString() && address.isString())) {
                                            bad = T;
                                        }
                                    } else {
                                        cdestructuring_bind_error(datum, $list_alt133);
                                    }
                                }
                            } else {
                                bad = T;
                            }
                        }
                    }
                }
                return makeBoolean(NIL == bad);
            }
        }
    }

    /**
     * Standard footer for each thesaurus manager page.
     */
    public static final SubLObject tm_footer() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_br();
            html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
            html_utilities.html_princ($str_alt134$For_questions_or_comments__contac);
            if (NIL != tm_contacts_okP()) {
                {
                    SubLObject datum = tm_control_vars.$tm_contacts$.getDynamicValue(thread).first();
                    SubLObject current = datum;
                    SubLObject name = NIL;
                    SubLObject address = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt133);
                    name = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt133);
                    address = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_mailto_url(address);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_princ(name);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                    } else {
                        cdestructuring_bind_error(datum, $list_alt133);
                    }
                }
                {
                    SubLObject contacts = tm_control_vars.$tm_contacts$.getDynamicValue(thread).rest();
                    SubLObject cdolist_list_var = butlast(contacts, UNPROVIDED);
                    SubLObject contact = NIL;
                    for (contact = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , contact = cdolist_list_var.first()) {
                        html_utilities.html_princ($str_alt112$__);
                        {
                            SubLObject datum = contact;
                            SubLObject current = datum;
                            SubLObject name = NIL;
                            SubLObject address = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt133);
                            name = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt133);
                            address = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_mailto_url(address);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ(name);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                            } else {
                                cdestructuring_bind_error(datum, $list_alt133);
                            }
                        }
                    }
                    if (NIL != last(contacts, UNPROVIDED)) {
                        {
                            SubLObject datum = last(contacts, UNPROVIDED).first();
                            SubLObject current = datum;
                            SubLObject name = NIL;
                            SubLObject address = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt133);
                            name = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt133);
                            address = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                html_utilities.html_princ($str_alt135$_or_);
                                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_mailto_url(address);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ(name);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                            } else {
                                cdestructuring_bind_error(datum, $list_alt133);
                            }
                        }
                    }
                }
                html_utilities.html_princ($str_alt136$_);
            } else {
                html_utilities.html_princ($str_alt137$your_thesaurus_administrator_);
            }
            html_utilities.html_br();
            tm_about_link();
            html_utilities.html_princ($str_alt138$_gives_information_about_this_sof);
            html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
            return NIL;
        }
    }

    /**
     * A heading which appears on all or almost all Thesaurus-Manager pages
     */
    public static final SubLObject thesaurus_heading(SubLObject which) {
        if (which == UNPROVIDED) {
            which = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            tm_status_line();
            html_macros.verify_not_within_html_pre();
            html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
            {
                SubLObject _prev_bind_0 = html_macros.$within_html_pre$.currentBinding(thread);
                try {
                    html_macros.$within_html_pre$.bind(T, thread);
                    if (NIL != tm_thinking.tm_relevant_thinking_task_p()) {
                        tm_link($STATUS, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_utilities.html_terpri(UNPROVIDED);
                    }
                    if (NIL != subl_promotions.memberP(which, $list_alt140, symbol_function(EQUALP), UNPROVIDED)) {
                        tm_link($FIRST_CHOICES, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    if (!which.equalp($str_alt142$tm_set_preferences)) {
                        tm_link($GENERAL_PREFERENCES, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    if (!which.equalp($str_alt144$tm_utilities_page)) {
                        if (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $str_alt145$advanced_user)) {
                            tm_link($UTILITIES, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    }
                    tm_help_link(which);
                    if (!which.equalp($str_alt147$tm_search_page)) {
                        tm_link($SEARCH, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    if (NIL != tm_datastructures.$tm_basic_interface_availableP$.getDynamicValue(thread)) {
                        tm_link($BASIC_INTERFACE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    if ((NIL != tm_internals.editing_allowedP()) && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $str_alt114$limited_editor))) {
                        html_utilities.html_terpri(UNPROVIDED);
                        if (!(which.equalp($str_alt150$tm_advanced_page) || (NIL == tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $str_alt151$full_editor)))) {
                            tm_link($ADVANCED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        if (!which.equalp($str_alt153$tm_quick_edit_page)) {
                            tm_link($QUICK_EDIT, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        if (!which.equalp($str_alt155$tm_add_term)) {
                            tm_link($ADD_TERM, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        if (!which.equalp($str_alt157$tm_delete_term)) {
                            tm_link($DELETE_TERM, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        if (!which.equalp($str_alt159$tm_rename_term)) {
                            tm_link($RENAME_TERM, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    }
                    if (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $str_alt114$limited_editor)) {
                        tm_link($VIEW_RELATIONS, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    html_utilities.html_terpri(ONE_INTEGER);
                    if (NIL == subl_promotions.memberP(which, $list_alt162, symbol_function(EQUALP), UNPROVIDED)) {
                        tm_generic_display_box(UNPROVIDED);
                    }
                } finally {
                    html_macros.$within_html_pre$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
            return NIL;
        }
    }

    /**
     * This used to be called the advanced page, but now is called More Editing since the
     * first interface is now called the Advanced Interface, in contrast to the Basic Interface.
     */
    public static final SubLObject tm_advanced_page(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ($$$More_Editing);
                html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (NIL != color_value) {
                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(color_value));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
                                                html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            if (true) {
                                                html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(ZERO_INTEGER);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_9 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_9, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                }
                                html_utilities.html_princ($$$More_Editing);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                tm_logging.tm_enqueue_event($$$More_Editing);
                                if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $str_alt151$full_editor)))) {
                                    html_utilities.html_princ($str_alt164$Sorry__you_do_not_have_permission);
                                } else {
                                    thesaurus_heading($str_alt150$tm_advanced_page);
                                    html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                    if (NIL != tm_internals.editing_allowedP()) {
                                        if (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $str_alt151$full_editor)) {
                                            tm_link($CONVERT_PT_UF, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            if (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)) {
                                                tm_link($DEFINE_RELATION, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                tm_link($CORRELATE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            }
                                            tm_link($INTEGRITY_CHECK, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            tm_link($INTEGRITY_CHECK_CON, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            html_utilities.html_br();
                                            tm_link($CREATE_THESAURUS, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            tm_link($RENAME_THESAURUS, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            tm_link($DELETE_THESAURUS, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            tm_link($COPY_THESAURUS, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                    } else {
                                        tm_report_editing_disabled();
                                    }
                                }
                                tm_footer();
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            }
            return NIL;
        }
    }



    /**
     * Initialize *TM-MULTI-SUBMIT-MAP*.  Has to happen after parameters.lisp has loaded.
     */
    public static final SubLObject tm_init_multi_submit_map() {
        $tm_multi_submit_map$.setGlobalValue(list(format(NIL, $str_alt177$_Atm_multibutton_gif, tm_image_directory()), $$$mode, $$$hierarchy, $list_alt180));
        return NIL;
    }

    /**
     * a box which appears near the top of most Thesaurus-Manager pages; it accepts the input of a term, and, depending on the option selected to the right, jumps to a page displaying the term within the term hierarchy, the alphabetical index, the definition of the term or the siblings of the term
     */
    public static final SubLObject tm_generic_display_box(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject use_imagesP = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $USE_IMAGES);
                SubLObject v_term = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $TERM);
                SubLObject string_to_show = (NIL != v_term) ? ((SubLObject) (tm_internals.tm_string_for_constant(v_term, NIL, NIL, T))) : $str_alt51$;
                SubLObject length = max($int$40, length(string_to_show));
                html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                    html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_macros.$within_html_form$.bind(T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        html_utilities.html_hidden_input($str_alt183$tm_handle_generic_display_box, T, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(ONE_INTEGER);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_caption_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_caption_align$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($TOP));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($str_alt51$);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_11, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_caption_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_12 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_utilities.html_align($CENTER));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                if (NIL != use_imagesP) {
                                                    html_utilities.html_image_multi_submit($tm_multi_submit_map$.getGlobalValue(), $TOP);
                                                } else {
                                                    html_utilities.html_radio_input($$$mode, $$$hierarchy, T);
                                                    html_utilities.html_princ($$$HIER);
                                                    html_utilities.html_indent(ONE_INTEGER);
                                                    html_utilities.html_radio_input($$$mode, $$$alpha, UNPROVIDED);
                                                    html_utilities.html_princ($$$ALPHA);
                                                    html_utilities.html_indent(ONE_INTEGER);
                                                    html_utilities.html_radio_input($$$mode, $$$full, UNPROVIDED);
                                                    html_utilities.html_princ($$$FULL);
                                                    html_utilities.html_submit_input($$$Show, UNPROVIDED, UNPROVIDED);
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_utilities.html_align($CENTER));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_text_input($$$term, string_to_show, length);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_10, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    } finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject tm_handle_generic_display_box(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $SELECTED_THESAURUS, NIL, UNPROVIDED);
            {
                SubLObject thesauri = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI);
                if (NIL == thesauri) {
                    return tm_error($str_alt192$No_thesauri_are_currently_active_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                {
                    SubLObject term_string = html_utilities.html_extract_input($$$term, args);
                    SubLObject use_imagesP = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $USE_IMAGES);
                    SubLObject mode = html_utilities.html_extract_input($$$mode, args);
                    if (!term_string.isString()) {
                        return tm_error($str_alt193$You_must_enter_a_term_in_the_box_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    if (!((NIL == use_imagesP) || (NIL != mode))) {
                        mode = html_utilities.html_extract_multi_submit_input($tm_multi_submit_map$.getGlobalValue(), args);
                    }
                    if (NIL != find_if(symbol_function(WHITESPACEP), term_string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        term_string = tm_internals.canonicalize_lexical_term(term_string);
                    }
                    if (mode.equalp($$$alpha)) {
                        return html_tm_browsing.tm_ad(list(term_string));
                    } else {
                        if (term_string.equalp($str_alt51$) || (NIL == term_string)) {
                            return html_tm_browsing.tm_show_thesaurus_tops(thesauri, format(NIL, $str_alt195$No_term_was_specified_for__a__cli, mode.equalp($$$full) ? ((SubLObject) ($$$Full_Term_Display)) : $$$Hierarchy_Display));
                        }
                        {
                            SubLObject search_relations = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $SEARCH_RELATIONS);
                            SubLObject lexpreds = (search_relations == $ALL) ? ((SubLObject) (tm_lexical_index.all_lexpreds())) : search_relations;
                            SubLObject signs = tm_lexical_index.signs_of_lexpreds_in_thesauri(term_string, lexpreds, thesauri);
                            SubLObject concepts = NIL;
                            tm_datastructures.clear_utility_tables(tm_datastructures.$tm_user$.getDynamicValue(thread));
                            if (NIL != signs) {
                                concepts = remove_duplicates(Mapping.mapcar(symbol_function(SIGN_CONCEPT), signs), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                            if (NIL != list_utilities.singletonP(concepts)) {
                                if (mode.equalp($$$hierarchy)) {
                                    html_tm_browsing.tm_hierarchy_display(concepts.first(), signs);
                                } else
                                    if (mode.equalp($$$full)) {
                                        html_tm_browsing.tm_full_record_for_constant(concepts.first(), tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $kw201$FD_SEPARATE_), signs);
                                    }

                            } else
                                if (NIL == concepts) {
                                    html_tm_browsing.tm_ad_not_present(list(term_string));
                                } else {
                                    html_tm_browsing.tm_choose_constant(term_string, concepts, signs);
                                }

                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Default HTML handler for Thesaurus Manager.
     */
    public static final SubLObject tm_default_handler(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pcase_var = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $INTERFACE);
                if (pcase_var.eql($BASIC)) {
                    return html_basic_thesaurus.tm_basic_home_1(UNPROVIDED);
                } else {
                    return tm_first_choices(UNPROVIDED);
                }
            }
        }
    }

    /**
     * Prints out an explanation of why editing can't be done.
     */
    public static final SubLObject tm_report_editing_disabled() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != tm_control_vars.$tm_disable_editing_globally$.getDynamicValue(thread)) {
                html_utilities.html_princ($str_alt206$Sorry__thesaurus_editing_is_disab);
            } else {
                html_utilities.html_princ($str_alt207$Sorry__thesaurus_editing_is_curre);
                html_utilities.html_princ($str_alt208$If_you_have_editing_privileges__y);
            }
            return NIL;
        }
    }

    public static final SubLObject tm_note_edit_change(SubLObject message) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ($$$Edit_Notification);
                html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (NIL != color_value) {
                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(color_value));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_15 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_16 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
                                                html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            if (true) {
                                                html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(ZERO_INTEGER);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_17 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_16, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                }
                                html_utilities.html_princ($$$Edit_Notification);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                tm_logging.tm_enqueue_event($$$Edit_Notification);
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup(THREE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt210$_a_operation_completed, message);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup(THREE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                thesaurus_heading($str_alt211$tm_note_edit_change);
                                tm_footer();
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            }
            return NIL;
        }
    }

    public static final SubLObject tm_message_to_user(SubLObject title, SubLObject message) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ(title);
                html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (NIL != color_value) {
                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(color_value));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_18 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_19 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
                                                html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            if (true) {
                                                html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(ZERO_INTEGER);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_20 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_20, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_19, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                }
                                html_utilities.html_princ(title);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                tm_logging.tm_enqueue_event(title);
                                thesaurus_heading($str_alt212$tm_message_to_user);
                                html_utilities.html_princ(message);
                                tm_footer();
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_18, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            }
            return NIL;
        }
    }

    /**
     * Produce a page noting the type of operation given in MESSAGE, and explaining (via EXPLANATION)
     * what would have happened in a full implementation.
     */
    public static final SubLObject tm_note_unsupported_feature(SubLObject message, SubLObject explanation) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ($$$Unsupported_Feature);
                html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (NIL != color_value) {
                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(color_value));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_21 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_22 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
                                                html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            if (true) {
                                                html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(ZERO_INTEGER);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_23 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_23, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_22, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                }
                                html_utilities.html_princ($$$Unsupported_Feature);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                tm_logging.tm_enqueue_event($$$Unsupported_Feature);
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup(THREE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt214$_a_operation_noted, message);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup(THREE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                thesaurus_heading($str_alt215$tm_note_unsupported_feature);
                                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                html_utilities.html_princ(explanation);
                                tm_footer();
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_21, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            }
            return NIL;
        }
    }

    public static final SubLObject tm_note_unsupported_feature_handler(SubLObject args) {
        return tm_note_unsupported_feature(args.first(), second(args));
    }

    public static final SubLObject tm_error(SubLObject format_string, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5, SubLObject no_linksP) {
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
        if (no_linksP == UNPROVIDED) {
            no_linksP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ(format(NIL, $str_alt217$_A_Error, tm_control_vars.$application_name$.getDynamicValue(thread)));
                html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (NIL != color_value) {
                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(color_value));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_24 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_25 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
                                                html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            if (true) {
                                                html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(ZERO_INTEGER);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_26 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_26, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_25, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                }
                                html_utilities.html_princ(format(NIL, $str_alt217$_A_Error, tm_control_vars.$application_name$.getDynamicValue(thread)));
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                tm_logging.tm_enqueue_event(format(NIL, $str_alt217$_A_Error, tm_control_vars.$application_name$.getDynamicValue(thread)));
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup(THREE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                format(html_macros.$html_stream$.getDynamicValue(thread), format_string, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup(THREE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                if (NIL == no_linksP) {
                                    {
                                        SubLObject pcase_var = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $INTERFACE);
                                        if (pcase_var.eql($BASIC)) {
                                            html_basic_thesaurus.thesaurus_basic_heading($str_alt218$tm_basic_error);
                                        } else {
                                            thesaurus_heading($str_alt219$tm_error);
                                        }
                                    }
                                }
                                tm_footer();
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_24, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            }
            return NIL;
        }
    }

    /**
     * Generate a select box containing THESAURI.  If SELECTED-THESAURI are given, these
     * will be highlighted. NAME is used for HTML argument passing.  If MULTI?, it's a
     * multi-select box.
     */
    public static final SubLObject tm_thesaurus_selection(SubLObject thesauri, SubLObject selected_thesauri, SubLObject name, SubLObject multiP) {
        if (selected_thesauri == UNPROVIDED) {
            selected_thesauri = NIL;
        }
        if (name == UNPROVIDED) {
            name = $$$thesauri;
        }
        if (multiP == UNPROVIDED) {
            multiP = T;
        }
        return tm_thesaurus_selection_int(multiP, NIL, name, NIL, thesauri, selected_thesauri);
    }

    /**
     * Generate a select box of browsable thesauri with the active browse
     * thesauri selected.  If MULTI?, it's multi-select.  If  ALL?, one of
     * the selections in the select box is ALL, meaning all browsable thesauri.
     * NAME is used for HTML argument passing. If NONE-SELECTED?, none of the
     * thesauri will be selected.
     */
    public static final SubLObject tm_browse_thesaurus_selection(SubLObject multiP, SubLObject allP, SubLObject name, SubLObject none_selectedP) {
        if (multiP == UNPROVIDED) {
            multiP = NIL;
        }
        if (allP == UNPROVIDED) {
            allP = NIL;
        }
        if (name == UNPROVIDED) {
            name = $$$thesauri;
        }
        if (none_selectedP == UNPROVIDED) {
            none_selectedP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject all_thesauri = tm_internals.browsable_thesauri(tm_datastructures.$tm_user$.getDynamicValue(thread), UNPROVIDED);
                SubLObject active_browse_thesauri = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI);
                return tm_thesaurus_selection_int(multiP, allP, name, none_selectedP, all_thesauri, active_browse_thesauri);
            }
        }
    }

    /**
     * Generate a select box of editable thesauri with the active edit
     * thesauri selected.  If MULTI?, it's multi-select.  If  ALL?, one of
     * the selections in the select box is ALL, meaning all editable thesauri.
     * NAME is used for HTML argument passing. If NONE-SELECTED?, none of the
     * thesauri will be selected.
     */
    public static final SubLObject tm_edit_thesaurus_selection(SubLObject multiP, SubLObject allP, SubLObject name, SubLObject none_selectedP) {
        if (multiP == UNPROVIDED) {
            multiP = NIL;
        }
        if (allP == UNPROVIDED) {
            allP = NIL;
        }
        if (name == UNPROVIDED) {
            name = $$$thesauri;
        }
        if (none_selectedP == UNPROVIDED) {
            none_selectedP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject editable_thesauri = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $EDITABLE_THESAURI);
                SubLObject active_edit_thesauri = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $EDIT_THESAURI);
                SubLObject all_thesauri = (editable_thesauri == $ALL) ? ((SubLObject) (tm_internals.all_thesauri_sorted())) : editable_thesauri;
                return tm_thesaurus_selection_int(multiP, allP, name, none_selectedP, all_thesauri, active_edit_thesauri);
            }
        }
    }

    public static final SubLObject tm_thesaurus_selection_int(SubLObject multiP, SubLObject allP, SubLObject name, SubLObject none_selectedP, SubLObject all_thesauri, SubLObject active_thesauri) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject select_size = max(min(length(all_thesauri), SIX_INTEGER), FOUR_INTEGER);
                html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(name);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != multiP) {
                    html_utilities.html_simple_attribute(html_macros.$html_select_multiple$.getGlobalValue());
                }
                if (NIL != select_size) {
                    html_utilities.html_markup(html_macros.$html_select_size$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(select_size);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        if ((NIL != multiP) && (NIL != allP)) {
                            html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                            {
                                SubLObject _prev_bind_0_27 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(NIL, thread);
                                    if ((NIL == set_difference(all_thesauri, active_thesauri, UNPROVIDED, UNPROVIDED)) && (NIL == none_selectedP)) {
                                        html_utilities.html_princ(html_macros.$html_option_selected$.getGlobalValue());
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_28 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ($str_alt222$_ALL_);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_28, thread);
                                        }
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_27, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                        }
                        {
                            SubLObject cdolist_list_var = all_thesauri;
                            SubLObject thesaurus = NIL;
                            for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                                html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                {
                                    SubLObject _prev_bind_0_29 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(NIL, thread);
                                        if (((NIL != subl_promotions.memberP(thesaurus, active_thesauri, UNPROVIDED, UNPROVIDED)) && (NIL == none_selectedP)) && (((NIL == multiP) || (NIL == allP)) || (NIL != set_difference(all_thesauri, active_thesauri, UNPROVIDED, UNPROVIDED)))) {
                                            html_utilities.html_princ(html_macros.$html_option_selected$.getGlobalValue());
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_30 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_princ(tm_internals.thesaurus_name(thesaurus));
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_30, thread);
                                            }
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_29, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                            }
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    /**
     * Call inside HTML-SIMPLE-THESAURUS-DOCUMENT.
     */
    public static final SubLObject tm_show_file_guts(SubLObject pathname) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Filesys.probe_file(pathname)) {
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt223$File__A_not_found, pathname);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                return NIL;
            }
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ($str_alt224$File__);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_utilities.html_princ(pathname);
            html_utilities.html_br();
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ($str_alt225$Size__);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_utilities.html_princ(file_utilities.get_file_length(pathname));
            html_utilities.html_princ($str_alt226$_bytes);
            html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
            html_macros.verify_not_within_html_pre();
            html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
            {
                SubLObject _prev_bind_0 = html_macros.$within_html_pre$.currentBinding(thread);
                try {
                    html_macros.$within_html_pre$.bind(T, thread);
                    {
                        SubLObject stream = NIL;
                        try {
                            stream = compatibility.open_text(pathname, $INPUT, NIL);
                            if (!stream.isStream()) {
                                Errors.error($str_alt228$Unable_to_open__S, pathname);
                            }
                            {
                                SubLObject str = stream;
                                SubLObject line = NIL;
                                for (line = read_line(str, NIL, UNPROVIDED, UNPROVIDED); NIL != line; line = read_line(str, NIL, UNPROVIDED, UNPROVIDED)) {
                                    html_utilities.html_princ_doc_string(line, UNPROVIDED);
                                    html_utilities.html_terpri(UNPROVIDED);
                                }
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0_31 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    if (stream.isStream()) {
                                        close(stream, UNPROVIDED);
                                    }
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_31, thread);
                                }
                            }
                        }
                        html_utilities.html_terpri(UNPROVIDED);
                    }
                } finally {
                    html_macros.$within_html_pre$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
            return NIL;
        }
    }

    public static final SubLObject tm_show_file(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject pathname = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt229);
                pathname = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (pathname.isString() && (NIL != Filesys.probe_file(pathname))) {
                        {
                            SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                            html_macros.html_head_content_type();
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                            html_utilities.html_princ($$$File_Contents);
                            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            {
                                SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                                try {
                                    html_macros.$html_inside_bodyP$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                    if (NIL != color_value) {
                                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_color(color_value));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_32 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                            html_utilities.html_markup(ONE_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
                                                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_33 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
                                                            html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(ZERO_INTEGER);
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_34 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_34, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_33, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                            }
                                            html_utilities.html_princ($$$File_Contents);
                                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                            html_utilities.html_markup(ONE_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            tm_logging.tm_enqueue_event($$$File_Contents);
                                            thesaurus_heading($str_alt231$tm_show_file);
                                            tm_show_file_guts(pathname);
                                            tm_footer();
                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_32, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        }
                    } else {
                        tm_error($str_alt232$The_file__S_was_not_found_, pathname, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt229);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cyc_thesaurus_herald() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ(tm_control_vars.$application_name$.getDynamicValue(thread));
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt234$_reg_);
            html_utilities.html_princ($str_alt235$_is_an_advanced_information_produ);
            html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
            return NIL;
        }
    }

    public static final SubLObject client_herald() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(NIL, thread);
                    html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                    html_utilities.html_princ(tm_control_vars.$client_logo$.getDynamicValue(thread));
                    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                    html_utilities.html_princ($str_alt85$_);
                    html_utilities.html_princ(tm_control_vars.$client_name$.getDynamicValue(thread));
                    html_utilities.html_princ($str_alt236$_logo_);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
            html_utilities.html_princ($str_alt237$Visit_the_);
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(NIL, thread);
                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                    html_utilities.html_princ(tm_control_vars.$client_home_page$.getDynamicValue(thread));
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_35 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_princ(tm_control_vars.$client_name$.getDynamicValue(thread));
                            html_utilities.html_princ($str_alt238$_homepage_);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_35, thread);
                        }
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
            return NIL;
        }
    }

    public static final SubLObject fritz_credits() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != control_vars.$show_credits$.getDynamicValue(thread)) {
                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                html_utilities.html_princ($$$Fritz_Lehmann);
                html_utilities.html_terpri(UNPROVIDED);
                html_utilities.html_princ($str_alt240$fritz_cyc_com);
                html_utilities.html_terpri(UNPROVIDED);
            }
            return NIL;
        }
    }

    /**
     * Version of the welcome page that provides for login.
     */
    public static final SubLObject tm_welcome_page_login() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ(format(NIL, $str_alt241$Welcome_to__a_, tm_control_vars.$application_name$.getDynamicValue(thread)));
                html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (NIL != color_value) {
                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(color_value));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_36 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_37 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
                                                html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            if (true) {
                                                html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(ZERO_INTEGER);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_38 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_38, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_37, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                }
                                html_utilities.html_princ(format(NIL, $str_alt241$Welcome_to__a_, tm_control_vars.$application_name$.getDynamicValue(thread)));
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                tm_logging.tm_enqueue_event(format(NIL, $str_alt241$Welcome_to__a_, tm_control_vars.$application_name$.getDynamicValue(thread)));
                                set_password_page_title(UNPROVIDED);
                                {
                                    SubLObject size_val = FOUR_INTEGER;
                                    html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                    if (NIL != size_val) {
                                        html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(size_val);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_39 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_br();
                                            html_utilities.html_princ($str_alt242$Thesaurus_Login_ID__);
                                            html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                                html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_40 = html_macros.$html_safe_print$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_macros.$within_html_form$.bind(T, thread);
                                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                    html_utilities.html_hidden_input($str_alt243$tm_welcome_page_handler, T, UNPROVIDED);
                                                    html_utilities.html_text_input($$$username, $str_alt51$, TWENTY_INTEGER);
                                                    html_utilities.html_submit_input($$$Login, UNPROVIDED, UNPROVIDED);
                                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                } finally {
                                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_40, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_39, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                }
                                html_utilities.html_br();
                                tm_footer();
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_36, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            }
            return NIL;
        }
    }

    /**
     * Entry point for the thesaurus manager tool.  If we are using http authentication,
     * obtains user name from the environment and dumps the user at the main menu page.  Other-
     * wise, presents a logon screen so the user can enter their ID.
     */
    public static final SubLObject tm_welcome_page(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != tm_datastructures.$tm_init_file_loadedP$.getGlobalValue()) {
                if (NIL != tm_control_vars.$use_http_authentication$.getDynamicValue(thread)) {
                    tm_first_choices_login();
                } else {
                    tm_welcome_page_login();
                }
            } else {
                really_load_tm_init_file();
            }
            return NIL;
        }
    }

    public static final SubLObject really_load_tm_init_file() {
        {
            SubLObject name = Environment.get_machine_name(UNPROVIDED);
            SubLObject machine_name = (name.isString()) ? ((SubLObject) (Strings.string_upcase(name, UNPROVIDED, UNPROVIDED))) : $$$Your_Cyc_server_machine;
            if ((NIL != tm_internals.load_thesaurus_init_file(UNPROVIDED)) && (NIL != tm_datastructures.$tm_init_file_loadedP$.getGlobalValue())) {
                tm_welcome_page(UNPROVIDED);
            } else {
                tm_error($str_alt248$_a_is_unable_to_load_the_thesauru, machine_name, NIL, NIL, NIL, NIL, T);
            }
        }
        return NIL;
    }

    public static final SubLObject tm_login_sorry_message() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject message = format(NIL, $str_alt249$Sorry__you_are_not_a_recognized__, tm_control_vars.$application_name$.getDynamicValue(thread));
                SubLObject rest = format(NIL, $str_alt250$__Please_contact__A_for_more_info, tm_control_vars.$support_string$.getDynamicValue(thread));
                SubLObject whole = (NIL != tm_control_vars.$support_string$.getDynamicValue(thread)) ? ((SubLObject) (cconcatenate(message, rest))) : message;
                return tm_error(whole, NIL, NIL, NIL, NIL, NIL, T);
            }
        }
    }

    /**
     * Handles the input login name from the box in the initial welcome page,
     * by checking password if required, or else by jumping to the
     * First Choices (start menu) page
     */
    public static final SubLObject tm_welcome_page_handler(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject username = NIL;
                SubLObject user_constant = NIL;
                username = string_utilities.trim_whitespace(html_utilities.html_extract_input($$$username, args));
                user_constant = tm_internals.tm_recognized_userP(username);
                if (NIL != user_constant) {
                    tm_datastructures.$tm_user$.setDynamicValue(username, thread);
                    if (NIL != tm_control_vars.$tm_require_passwordP$.getDynamicValue(thread)) {
                        return tm_check_password(user_constant);
                    } else {
                        tm_datastructures.tm_init(tm_datastructures.$tm_user$.getDynamicValue(thread));
                        {
                            SubLObject pcase_var = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $INTERFACE);
                            if (pcase_var.eql($BASIC)) {
                                if (NIL != tm_datastructures.$tm_basic_interface_availableP$.getDynamicValue(thread)) {
                                    return html_basic_thesaurus.tm_basic_home(UNPROVIDED);
                                } else {
                                    return tm_first_choices(UNPROVIDED);
                                }
                            } else
                                if (pcase_var.eql($ADVANCED)) {
                                    return tm_first_choices(UNPROVIDED);
                                } else {
                                    Errors.error($str_alt251$Could_not_determine_the_interface);
                                }

                        }
                    }
                } else
                    if (NIL != tm_internals.valid_guest_name(username)) {
                        if (NIL != tm_datastructures.$tm_accept_only_known_usersP$.getDynamicValue(thread)) {
                            return tm_invalid_string(username);
                        } else {
                            tm_datastructures.$tm_user$.setDynamicValue(username, thread);
                            tm_datastructures.tm_guest_init(tm_datastructures.$tm_user$.getDynamicValue(thread));
                            {
                                SubLObject pcase_var = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $INTERFACE);
                                if (pcase_var.eql($BASIC)) {
                                    if (NIL != tm_datastructures.$tm_basic_interface_availableP$.getDynamicValue(thread)) {
                                        return html_basic_thesaurus.tm_basic_home(UNPROVIDED);
                                    } else {
                                        return tm_first_choices(UNPROVIDED);
                                    }
                                } else
                                    if (pcase_var.eql($ADVANCED)) {
                                        return tm_first_choices(UNPROVIDED);
                                    } else {
                                        Errors.error($str_alt251$Could_not_determine_the_interface);
                                    }

                            }
                        }
                    } else {
                        return tm_invalid_string(username);
                    }

            }
            return NIL;
        }
    }

    public static final SubLObject tm_first_choices_login() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject username = NIL;
                SubLObject user_constant = NIL;
                username = html_kernel.$http_remote_user$.getDynamicValue(thread);
                user_constant = tm_internals.tm_recognized_userP(username);
                if (NIL != user_constant) {
                    tm_datastructures.$tm_user$.setDynamicValue(username, thread);
                    tm_datastructures.tm_init(tm_datastructures.$tm_user$.getDynamicValue(thread));
                    {
                        SubLObject pcase_var = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $INTERFACE);
                        if (pcase_var.eql($BASIC)) {
                            if (NIL != tm_datastructures.$tm_basic_interface_availableP$.getDynamicValue(thread)) {
                                return html_basic_thesaurus.tm_basic_home(UNPROVIDED);
                            } else {
                                return tm_first_choices(UNPROVIDED);
                            }
                        } else
                            if (pcase_var.eql($ADVANCED)) {
                                return tm_first_choices(UNPROVIDED);
                            } else {
                                Errors.error($str_alt251$Could_not_determine_the_interface);
                            }

                    }
                } else
                    if (NIL != tm_internals.valid_guest_name(username)) {
                        if (NIL != tm_datastructures.$tm_accept_only_known_usersP$.getDynamicValue(thread)) {
                            return tm_login_sorry_message();
                        } else {
                            tm_datastructures.$tm_user$.setDynamicValue(username, thread);
                            tm_datastructures.tm_guest_init(tm_datastructures.$tm_user$.getDynamicValue(thread));
                            {
                                SubLObject pcase_var = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $INTERFACE);
                                if (pcase_var.eql($BASIC)) {
                                    if (NIL != tm_datastructures.$tm_basic_interface_availableP$.getDynamicValue(thread)) {
                                        return html_basic_thesaurus.tm_basic_home(UNPROVIDED);
                                    } else {
                                        return tm_first_choices(UNPROVIDED);
                                    }
                                } else
                                    if (pcase_var.eql($ADVANCED)) {
                                        return tm_first_choices(UNPROVIDED);
                                    } else {
                                        Errors.error($str_alt251$Could_not_determine_the_interface);
                                    }

                            }
                        }
                    } else {
                        return tm_error($str_alt253$External_authentication_is_in_pla, NIL, NIL, NIL, NIL, NIL, T);
                    }

            }
            return NIL;
        }
    }

    /**
     * Generates an HTML page refusing to accept an invalid string as a login name,
     * then allows user to try again with new login box, etc.
     */
    public static final SubLObject tm_invalid_string(SubLObject input_string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ(format(NIL, $str_alt254$_s_is_not_a_valid_user_name_, input_string));
                html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (NIL != color_value) {
                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(color_value));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_41 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_42 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
                                                html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            if (true) {
                                                html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(ZERO_INTEGER);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_43 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_43, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_42, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                }
                                html_utilities.html_princ(format(NIL, $str_alt254$_s_is_not_a_valid_user_name_, input_string));
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                tm_logging.tm_enqueue_event(format(NIL, $str_alt254$_s_is_not_a_valid_user_name_, input_string));
                                {
                                    SubLObject size_val = FOUR_INTEGER;
                                    html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                    if (NIL != size_val) {
                                        html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(size_val);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_44 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ($str_alt255$You_need_to_enter_your_personal_l);
                                            html_utilities.html_br();
                                            if (NIL != tm_control_vars.$client_special_login_instructions$.getDynamicValue(thread)) {
                                                html_utilities.html_princ(tm_control_vars.$client_special_login_instructions$.getDynamicValue(thread));
                                            }
                                            html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                            html_utilities.html_princ($str_alt256$To_try_again__type_your_personal_);
                                            html_utilities.html_br();
                                            html_utilities.html_br();
                                            html_utilities.html_princ($str_alt257$Your_login_name__);
                                            html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                                html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_45 = html_macros.$html_safe_print$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_macros.$within_html_form$.bind(T, thread);
                                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                    html_utilities.html_hidden_input($str_alt243$tm_welcome_page_handler, T, UNPROVIDED);
                                                    html_utilities.html_text_input($$$username, $str_alt51$, TWENTY_INTEGER);
                                                    html_utilities.html_submit_input($$$Login, UNPROVIDED, UNPROVIDED);
                                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                } finally {
                                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_45, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                            html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                            html_utilities.html_princ(tm_control_vars.$application_name$.getDynamicValue(thread));
                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt234$_reg_);
                                            html_utilities.html_princ($str_alt235$_is_an_advanced_information_produ);
                                            html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_44, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                }
                                tm_footer();
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_41, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            }
            return NIL;
        }
    }

    /**
     * this optional page asks for a password.  If it's good, go to the First Choices page; or else if it's bad go to the Bad-Password page
     */
    public static final SubLObject tm_check_password(SubLObject user_constant) {
        {
            SubLObject password = tm_internals.user_password(user_constant);
            if (NIL != password) {
                return tm_check_password_1(user_constant);
            } else {
                return tm_choose_password(user_constant);
            }
        }
    }

    public static final SubLObject set_password_page_title(SubLObject string) {
        if (string == UNPROVIDED) {
            string = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            tm_logging.$tm_password_page_title$.setDynamicValue(string.isString() ? ((SubLObject) (string)) : format(NIL, $str_alt258$Please_Enter_Your__a_Password, tm_control_vars.$application_name$.getDynamicValue(thread)), thread);
            return tm_logging.$tm_password_page_title$.getDynamicValue(thread);
        }
    }

    /**
     * Get and check the password of an established user.
     */
    public static final SubLObject tm_check_password_1(SubLObject user_constant) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            set_password_page_title(UNPROVIDED);
            {
                SubLObject username = tm_internals.user_name(user_constant);
                SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ(tm_logging.$tm_password_page_title$.getDynamicValue(thread));
                html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (NIL != color_value) {
                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(color_value));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_46 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_47 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
                                                html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            if (true) {
                                                html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(ZERO_INTEGER);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_48 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_48, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_47, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                }
                                html_utilities.html_princ(tm_logging.$tm_password_page_title$.getDynamicValue(thread));
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                tm_logging.tm_enqueue_event(tm_logging.$tm_password_page_title$.getDynamicValue(thread));
                                {
                                    SubLObject size_val = FOUR_INTEGER;
                                    html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                    if (NIL != size_val) {
                                        html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(size_val);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_49 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
                                            html_utilities.html_princ($str_alt259$_The_CHECK_PASSWORD_option_is_cur);
                                            html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
                                            html_utilities.html_princ($str_alt260$To_get_access_to_this_system_as_a);
                                            html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
                                            html_utilities.html_br();
                                            html_utilities.html_princ($str_alt261$Your_password__);
                                            html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                                html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_50 = html_macros.$html_safe_print$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_macros.$within_html_form$.bind(T, thread);
                                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                    html_utilities.html_hidden_input($str_alt262$tm_check_password_handler, T, UNPROVIDED);
                                                    html_utilities.html_hidden_input($$$username, username, UNPROVIDED);
                                                    html_utilities.html_password_input($$$password, $str_alt51$, TWENTY_INTEGER);
                                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                } finally {
                                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_50, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_49, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                }
                                tm_footer();
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_46, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            }
            return NIL;
        }
    }

    /**
     * handle input from check-password page
     */
    public static final SubLObject tm_check_password_handler(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject username = html_utilities.html_extract_input($$$username, args);
                SubLObject password = html_utilities.html_extract_input($$$password, args);
                SubLObject user_constant = tm_internals.tm_recognized_userP(username);
                SubLObject real_password = NIL;
                if (NIL == user_constant) {
                    return tm_error($str_alt264$_S_is_not_a_known_user, username, NIL, NIL, NIL, NIL, T);
                }
                real_password = tm_internals.user_password(user_constant);
                if (NIL == real_password) {
                    return tm_error($str_alt265$No_password_found_for__S__but_the, username, NIL, NIL, NIL, NIL, T);
                }
                if (password.equal(real_password)) {
                    tm_datastructures.tm_init(tm_datastructures.$tm_user$.getDynamicValue(thread));
                    {
                        SubLObject pcase_var = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $INTERFACE);
                        if (pcase_var.eql($BASIC)) {
                            if (NIL != tm_datastructures.$tm_basic_interface_availableP$.getDynamicValue(thread)) {
                                html_basic_thesaurus.tm_basic_home(UNPROVIDED);
                            } else {
                                tm_first_choices(UNPROVIDED);
                            }
                        } else
                            if (pcase_var.eql($ADVANCED)) {
                                tm_first_choices(UNPROVIDED);
                            } else {
                                Errors.error($str_alt266$Can_t_determine_the_interface_);
                            }

                    }
                } else {
                    tm_datastructures.$tm_user$.setDynamicValue(NIL, thread);
                    tm_bad_password(UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    /**
     * Get a password from a new user and store it.
     */
    public static final SubLObject tm_choose_password(SubLObject user_constant) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject username = tm_internals.user_name(user_constant);
                SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ($str_alt268$Please_Choose_Your_Password_);
                html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (NIL != color_value) {
                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(color_value));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_51 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_52 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
                                                html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            if (true) {
                                                html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(ZERO_INTEGER);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_53 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_53, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_52, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                }
                                html_utilities.html_princ($str_alt268$Please_Choose_Your_Password_);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                tm_logging.tm_enqueue_event($str_alt268$Please_Choose_Your_Password_);
                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt269$Welcome___A__to__A___You_are_logg, username, tm_control_vars.$application_name$.getDynamicValue(thread));
                                html_utilities.html_br();
                                html_utilities.html_br();
                                tm_choose_password_guts(user_constant);
                                tm_footer();
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_51, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            }
            return NIL;
        }
    }

    public static final SubLObject tm_choose_password_try_again(SubLObject user_constant) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ($str_alt270$Choose_Password__Try_Again);
                html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (NIL != color_value) {
                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(color_value));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_54 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_55 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
                                                html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            if (true) {
                                                html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(ZERO_INTEGER);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_56 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_56, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_55, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                }
                                html_utilities.html_princ($str_alt270$Choose_Password__Try_Again);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                tm_logging.tm_enqueue_event($str_alt270$Choose_Password__Try_Again);
                                {
                                    SubLObject size_val = FOUR_INTEGER;
                                    html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                    if (NIL != size_val) {
                                        html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(size_val);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_57 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ($str_alt271$The_passwords_you_entered_either_);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_57, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                    html_utilities.html_br();
                                    tm_choose_password_guts(user_constant);
                                }
                                tm_footer();
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_54, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            }
            return NIL;
        }
    }

    public static final SubLObject tm_choose_password_guts(SubLObject user_constant) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject username = tm_internals.user_name(user_constant);
                html_utilities.html_princ($str_alt272$Please_type_a_password_of_your_ch);
                html_utilities.html_br();
                html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                    html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_macros.$within_html_form$.bind(T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        html_utilities.html_hidden_input($str_alt273$tm_handle_choose_password, T, UNPROVIDED);
                        html_utilities.html_hidden_input($$$username, username, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(ZERO_INTEGER);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_58 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_59 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_60 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_princ($str_alt274$Enter_Password__);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_60, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_61 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_password_input($$$password1, $str_alt51$, TWENTY_INTEGER);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_61, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_59, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_62 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_63 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_princ($str_alt276$Enter_the_same_word_again__);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_63, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_64 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_password_input($$$password2, $str_alt51$, TWENTY_INTEGER);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_64, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_62, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_58, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        html_utilities.html_submit_input($$$Submit, UNPROVIDED, UNPROVIDED);
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    } finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject tm_handle_choose_password(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject username = html_utilities.html_extract_input($$$username, args);
                SubLObject password1 = html_utilities.html_extract_input($$$password1, args);
                SubLObject password2 = html_utilities.html_extract_input($$$password2, args);
                SubLObject user_constant = tm_internals.tm_recognized_userP(username);
                SubLObject result = NIL;
                if (!((password1.equal(password2) && length(password1).numGE(SIX_INTEGER)) && length(password1).numLE(TEN_INTEGER))) {
                    return tm_choose_password_try_again(user_constant);
                }
                if (NIL == user_constant) {
                    return tm_error($str_alt279$_S_is_not_a_known_user__but_shoul, username, NIL, NIL, NIL, NIL, T);
                }
                tm_datastructures.tm_init(tm_datastructures.$tm_user$.getDynamicValue(thread));
                result = tm_internals.do_add_password(user_constant, password1);
                if (NIL != result) {
                    {
                        SubLObject pcase_var = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $INTERFACE);
                        if (pcase_var.eql($BASIC)) {
                            if (NIL != tm_datastructures.$tm_basic_interface_availableP$.getDynamicValue(thread)) {
                                return html_basic_thesaurus.tm_basic_home(UNPROVIDED);
                            } else {
                                return tm_first_choices(UNPROVIDED);
                            }
                        } else
                            if (pcase_var.eql($ADVANCED)) {
                                return tm_first_choices(UNPROVIDED);
                            } else {
                                Errors.error($str_alt251$Could_not_determine_the_interface);
                            }

                    }
                } else {
                    return tm_error($str_alt280$Password_could_not_be_stored_for_, username, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    /**
     * This page appears if the entered password was bad.  It gives the user a chance
     * to re-try the login process, without another `Welcome'.
     */
    public static final SubLObject tm_bad_password(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ($str_alt282$That_Password_Failed_);
                html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (NIL != color_value) {
                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(color_value));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_65 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_66 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
                                                html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            if (true) {
                                                html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(ZERO_INTEGER);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_67 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_67, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_66, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                }
                                html_utilities.html_princ($str_alt282$That_Password_Failed_);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                tm_logging.tm_enqueue_event($str_alt282$That_Password_Failed_);
                                {
                                    SubLObject size_val = FIVE_INTEGER;
                                    html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                    if (NIL != size_val) {
                                        html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(size_val);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_68 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ($str_alt283$The_password_you_typed_is_not_cur);
                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                            html_utilities.html_princ(tm_control_vars.$application_name$.getDynamicValue(thread));
                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt234$_reg_);
                                            html_utilities.html_princ($str_alt284$_system___Access_is_blocked_unles);
                                            html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                            html_utilities.html_princ($str_alt285$To_try_again__type_your_personal_);
                                            html_utilities.html_br();
                                            html_utilities.html_br();
                                            html_utilities.html_princ($str_alt257$Your_login_name__);
                                            html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                                html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_69 = html_macros.$html_safe_print$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_macros.$within_html_form$.bind(T, thread);
                                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                    html_utilities.html_hidden_input($str_alt243$tm_welcome_page_handler, T, UNPROVIDED);
                                                    html_utilities.html_text_input($$$username, $str_alt51$, TWENTY_INTEGER);
                                                    html_utilities.html_submit_input($$$Login, UNPROVIDED, UNPROVIDED);
                                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                } finally {
                                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_69, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                            html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_68, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                }
                                tm_footer();
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_65, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            }
            return NIL;
        }
    }

    /**
     * This page allows user to select a main function.
     * After this, the user can hop around from page to page without going back up to
     * this menu.
     */
    public static final SubLObject tm_first_choices(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject use_imagesP = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $USE_IMAGES);
                SubLObject default_term = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $TERM);
                SubLObject string = (NIL != default_term) ? ((SubLObject) (NIL != tm_internals.tm_string_for_constant(default_term, NIL, NIL, T) ? ((SubLObject) (tm_internals.tm_string_for_constant(default_term, NIL, NIL, T))) : $str_alt51$)) : $str_alt51$;
                SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ(format(NIL, $str_alt286$_a_Main_Menu, tm_control_vars.$application_name$.getDynamicValue(thread)));
                html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (NIL != color_value) {
                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(color_value));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_70 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_71 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
                                                html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            if (true) {
                                                html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(ZERO_INTEGER);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_72 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_72, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_71, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                }
                                html_utilities.html_princ(format(NIL, $str_alt286$_a_Main_Menu, tm_control_vars.$application_name$.getDynamicValue(thread)));
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                tm_logging.tm_enqueue_event(format(NIL, $str_alt286$_a_Main_Menu, tm_control_vars.$application_name$.getDynamicValue(thread)));
                                thesaurus_heading($str_alt287$tm_first_choices);
                                html_utilities.html_br();
                                if (NIL == tm_internals.browsable_thesauri(tm_datastructures.$tm_user$.getDynamicValue(thread), UNPROVIDED)) {
                                    if (NIL == tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $LEVEL)) {
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt289$Could_not_determine_user_permissi, tm_datastructures.$tm_user$.getDynamicValue(thread));
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    } else {
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($str_alt290$Sorry__no_thesauri_are_available_);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    }
                                } else {
                                    html_utilities.html_princ($str_alt291$Enter_a_term_to_display_);
                                    html_utilities.html_br();
                                    html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_73 = html_macros.$html_safe_print$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_macros.$within_html_form$.bind(T, thread);
                                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                            html_utilities.html_hidden_input($str_alt183$tm_handle_generic_display_box, T, UNPROVIDED);
                                            html_utilities.html_text_input($$$term, string, $int$50);
                                            html_utilities.html_br();
                                            html_utilities.html_br();
                                            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                            if (true) {
                                                html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(ZERO_INTEGER);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_74 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_markup(html_macros.$html_caption_head$.getGlobalValue());
                                                    if (true) {
                                                        html_utilities.html_markup(html_macros.$html_caption_align$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(html_utilities.html_align($TOP));
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_75 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_princ($str_alt293$Choose_a_display_method_);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_75, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_caption_tail$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_76 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_77 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_radio_input($$$mode, $$$hierarchy, T);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_77, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            if ((NIL != use_imagesP) && (NIL != $tm_hierarchical_icon$.getDynamicValue(thread))) {
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_78 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_thesaurus_image($tm_hierarchical_icon$.getDynamicValue(thread).first(), second($tm_hierarchical_icon$.getDynamicValue(thread)), $TOP, UNPROVIDED);
                                                                        html_utilities.html_indent(ONE_INTEGER);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_78, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_79 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_princ($$$Hierarchical_Display);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_79, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_76, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_80 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_81 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_radio_input($$$mode, $$$alpha, UNPROVIDED);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_81, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            if ((NIL != use_imagesP) && (NIL != $tm_alphabetical_icon$.getDynamicValue(thread))) {
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_82 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_thesaurus_image($tm_alphabetical_icon$.getDynamicValue(thread).first(), second($tm_alphabetical_icon$.getDynamicValue(thread)), $TOP, UNPROVIDED);
                                                                        html_utilities.html_indent(ONE_INTEGER);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_82, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_83 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_princ($$$Alphabetical_Display);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_83, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_80, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_84 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_85 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_radio_input($$$mode, $$$full, UNPROVIDED);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_85, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            if ((NIL != use_imagesP) && (NIL != $tm_full_record_icon$.getDynamicValue(thread))) {
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_86 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_thesaurus_image($tm_full_record_icon$.getDynamicValue(thread).first(), second($tm_full_record_icon$.getDynamicValue(thread)), $TOP, UNPROVIDED);
                                                                        html_utilities.html_indent(ONE_INTEGER);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_86, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_87 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_princ($$$Full_Term_Display);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_87, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_84, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_74, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                            html_utilities.html_br();
                                            html_utilities.html_submit_input($$$Show, UNPROVIDED, UNPROVIDED);
                                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                        } finally {
                                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                            html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_73, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                }
                                if (NIL != tm_control_vars.$use_http_authentication$.getDynamicValue(thread)) {
                                    html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
                                    html_utilities.html_princ(tm_control_vars.$client_name$.getDynamicValue(thread));
                                    html_utilities.html_princ($str_alt296$_s_);
                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_utilities.html_princ(tm_control_vars.$application_name$.getDynamicValue(thread));
                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    html_utilities.html_princ($str_alt297$_is_maintained_with_);
                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_utilities.html_princ(tm_control_vars.$tool_name$.getDynamicValue(thread));
                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt234$_reg_);
                                    html_utilities.html_princ($str_alt298$__a_tool_for_managing_and_combini);
                                    html_utilities.html_princ($str_alt299$_enhanced_with_links_to_the_);
                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.$cycorp_homepage_url$.getDynamicValue(thread));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_88 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ($$$Cyc);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_88, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                    html_utilities.html_princ($str_alt301$_system_of_conceptual_meanings_);
                                    html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
                                }
                                tm_footer();
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_70, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            }
            return NIL;
        }
    }

    /**
     * Generates a page that notes a lack of active thesauri
     * and prompts user to pick some thesauri from a menu.
     */
    public static final SubLObject tm_ask_for_thesauri_page(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == tm_internals.browsable_thesauri(tm_datastructures.$tm_user$.getDynamicValue(thread), UNPROVIDED)) {
                if (NIL == tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $LEVEL)) {
                    return tm_message_to_user(format(NIL, $str_alt303$Could_not_determine_user_permissi, tm_datastructures.$tm_user$.getDynamicValue(thread)), $str_alt304$Please_contact_your_thesaurus_adm);
                }
                return tm_message_to_user($str_alt305$Sorry__no_available_thesauri_, $str_alt304$Please_contact_your_thesaurus_adm);
            }
            {
                SubLObject active = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI);
                SubLObject choose_multipleP = makeBoolean((NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $str_alt145$advanced_user)) || (NIL != tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $VIEW_MULTIPLE)));
                SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ(format(NIL, $str_alt307$Please_choose_one__a, NIL != choose_multipleP ? ((SubLObject) ($str_alt308$or_more_thesauri_)) : $str_alt309$thesaurus_));
                html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (NIL != color_value) {
                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(color_value));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_89 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_90 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
                                                html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            if (true) {
                                                html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(ZERO_INTEGER);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_91 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_91, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_90, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                }
                                html_utilities.html_princ(format(NIL, $str_alt307$Please_choose_one__a, NIL != choose_multipleP ? ((SubLObject) ($str_alt308$or_more_thesauri_)) : $str_alt309$thesaurus_));
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                tm_logging.tm_enqueue_event(format(NIL, $str_alt307$Please_choose_one__a, NIL != choose_multipleP ? ((SubLObject) ($str_alt308$or_more_thesauri_)) : $str_alt309$thesaurus_));
                                tm_status_line();
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                if (NIL != choose_multipleP) {
                                    html_utilities.html_princ($str_alt310$First_click_on_one_or_more_thesau);
                                } else {
                                    html_utilities.html_princ($str_alt311$Click_on_one_thesaurus_to_view__t);
                                }
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_br();
                                html_utilities.html_princ($str_alt312$For_information_on_thesauri_that_);
                                tm_link($HELP, $str_alt313$thesaurus_information, $$$here, UNPROVIDED);
                                html_utilities.html_princ($str_alt315$__then_return_to_this_page_afterw);
                                html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                    html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_92 = html_macros.$html_safe_print$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_macros.$within_html_form$.bind(T, thread);
                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                        html_utilities.html_hidden_input($str_alt316$tm_handle_ask_for_thesauri, $str_alt317$choice_of_thesauri, UNPROVIDED);
                                        {
                                            SubLObject thesauri = (NIL != choose_multipleP) ? ((SubLObject) (cons($$$ALL, tm_internals.browsable_thesauri(tm_datastructures.$tm_user$.getDynamicValue(thread), UNPROVIDED)))) : tm_internals.browsable_thesauri(tm_datastructures.$tm_user$.getDynamicValue(thread), UNPROVIDED);
                                            SubLObject select_size = max(min(length(thesauri), EIGHT_INTEGER), FOUR_INTEGER);
                                            html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup($str_alt319$set_thesauri);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            if (NIL != choose_multipleP) {
                                                html_utilities.html_simple_attribute(html_macros.$html_select_multiple$.getGlobalValue());
                                            }
                                            if (NIL != select_size) {
                                                html_utilities.html_markup(html_macros.$html_select_size$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(select_size);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_93 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    {
                                                        SubLObject cdolist_list_var = thesauri;
                                                        SubLObject thesaurus = NIL;
                                                        for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                                                            html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                            {
                                                                SubLObject _prev_bind_0_94 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(NIL, thread);
                                                                    if (thesaurus.equalp($$$all) && (NIL == set_difference(thesauri.rest(), active, UNPROVIDED, UNPROVIDED))) {
                                                                        html_utilities.html_princ(html_macros.$html_option_selected$.getGlobalValue());
                                                                    } else
                                                                        if ((NIL != subl_promotions.memberP(thesaurus, active, symbol_function(EQUAL), UNPROVIDED)) && (NIL != set_difference(thesauri.rest(), active, UNPROVIDED, UNPROVIDED))) {
                                                                            html_utilities.html_princ(html_macros.$html_option_selected$.getGlobalValue());
                                                                        } else
                                                                            if (NIL != list_utilities.singletonP(thesauri)) {
                                                                                html_utilities.html_princ(html_macros.$html_option_selected$.getGlobalValue());
                                                                            }


                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_95 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_princ(thesaurus.equalp($$$ALL) ? ((SubLObject) (thesaurus)) : tm_internals.thesaurus_name(thesaurus));
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_95, thread);
                                                                        }
                                                                    }
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_94, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                        }
                                                    }
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_93, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                        }
                                        html_utilities.html_br();
                                        html_utilities.html_reset_input($$$Reset);
                                        html_utilities.html_submit_input($$$Select, UNPROVIDED, UNPROVIDED);
                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                    } finally {
                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_92, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                tm_footer();
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_89, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            }
            return NIL;
        }
    }

    /**
     * Handle the intial choice of thesauri, when none had been chosen earlier.  Once thesauri are selected, go back to calling page.
     */
    public static final SubLObject tm_handle_ask_for_thesauri(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject thesauri = html_utilities.html_extract_input_values($str_alt319$set_thesauri, args);
                SubLObject browsable_thesauri = tm_internals.browsable_thesauri(tm_datastructures.$tm_user$.getDynamicValue(thread), UNPROVIDED);
                SubLObject thesauri_ans = NIL;
                if (NIL != subl_promotions.memberP($$$ALL, thesauri, symbol_function(EQUALP), UNPROVIDED)) {
                    thesauri_ans = browsable_thesauri;
                } else {
                    {
                        SubLObject cdolist_list_var = thesauri;
                        SubLObject thesaurus_short_name = NIL;
                        for (thesaurus_short_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus_short_name = cdolist_list_var.first()) {
                            {
                                SubLObject thesaurus_constant = tm_internals.thesaurus_constant_from_name(thesaurus_short_name);
                                if (NIL != tm_internals.thesaurusP(thesaurus_constant)) {
                                    thesauri_ans = cons(thesaurus_constant, thesauri_ans);
                                }
                            }
                        }
                    }
                }
                if (NIL != thesauri_ans) {
                    tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI, thesauri_ans, UNPROVIDED);
                    tm_internals.tm_save_preferences_from_vector(tm_datastructures.$tm_user$.getDynamicValue(thread));
                    tm_first_choices(UNPROVIDED);
                } else {
                    tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI, NIL, UNPROVIDED);
                    tm_ask_for_thesauri_page(UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_set_preferences(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ($$$Specify_Preferences);
                html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (NIL != color_value) {
                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(color_value));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_96 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_97 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
                                                html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            if (true) {
                                                html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(ZERO_INTEGER);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_98 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_98, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_97, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                }
                                html_utilities.html_princ($$$Specify_Preferences);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                tm_logging.tm_enqueue_event($$$Specify_Preferences);
                                thesaurus_heading($str_alt142$tm_set_preferences);
                                html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                    html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_99 = html_macros.$html_safe_print$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_macros.$within_html_form$.bind(T, thread);
                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                        html_utilities.html_hidden_input($str_alt325$tm_handle_preferences, $$$prefs, UNPROVIDED);
                                        html_utilities.html_reset_input($$$Reset);
                                        html_utilities.html_submit_input($$$Update_Preferences, UNPROVIDED, UNPROVIDED);
                                        if (NIL != tm_control_vars.$tm_testing$.getDynamicValue(thread)) {
                                            {
                                                SubLObject user_constant = tm_internals.tm_user_constant_from_user_name(tm_datastructures.$tm_user$.getDynamicValue(thread));
                                                if ((NIL != constant_handles.valid_constantP(user_constant, UNPROVIDED)) && tm_internals.user_level(user_constant).equal($$$administrator)) {
                                                    html_utilities.html_indent(FIVE_INTEGER);
                                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt24$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                    html_utilities.html_princ($str_alt328$tm_change_user_type);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_100 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_princ($$$Change_User_Permission_Level);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_100, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                }
                                            }
                                        }
                                        html_utilities.html_br();
                                        html_utilities.html_princ($str_alt330$Select_your_preference_changes_be);
                                        html_utilities.html_br();
                                        html_utilities.html_br();
                                        html_utilities.html_princ($str_alt312$For_information_on_thesauri_that_);
                                        tm_link($HELP, $str_alt313$thesaurus_information, $$$here, UNPROVIDED);
                                        html_utilities.html_princ($str_alt331$__then_return_to_this_page_afterw);
                                        html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                        html_utilities.html_princ($$$General_Preferences);
                                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                        html_utilities.html_br();
                                        html_utilities.html_br();
                                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(ZERO_INTEGER);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_101 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_102 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        if (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $str_alt114$limited_editor)) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_103 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_checkbox_input($str_alt333$editing_enabled, $$$T, tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $EDITING_ENABLED), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    html_utilities.html_princ($str_alt335$__Editing_enabled_);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_103, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_104 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_104, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_105 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_105, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_106 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_106, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_107 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_checkbox_input($str_alt336$filter_in_basic, $str_alt337$_ON, eql(tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $FILTER_IN_BASIC), $ON), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                html_utilities.html_princ($str_alt340$__Use_filtering_in_basic_mode_);
                                                                html_utilities.html_hidden_input($str_alt341$set_from, $str_alt342$_interface, UNPROVIDED);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_107, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_102, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                if (tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $LEVEL).equalp($str_alt343$end_user)) {
                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_108 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_109 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_checkbox_input($str_alt344$view_multiple, $$$T, tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $VIEW_MULTIPLE), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    html_utilities.html_princ($str_alt345$_Browse_multiple_thesauri_at_once);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_109, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_108, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_110 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($TOP));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_111 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_princ(format(NIL, $str_alt346$Browsing_thesaur_a___, (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $str_alt145$advanced_user)) || (NIL != tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $VIEW_MULTIPLE)) ? ((SubLObject) ($$$i)) : $$$us));
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_111, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        if (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $str_alt114$limited_editor)) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_112 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_indent(FIVE_INTEGER);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_112, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            if (true) {
                                                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            if (true) {
                                                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup(html_utilities.html_align($TOP));
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_113 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_princ($str_alt349$Editing_thesauri___);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_113, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_114 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_indent(FIVE_INTEGER);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_114, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($TOP));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_115 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_princ($str_alt350$Select_case_style___);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_115, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_116 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_indent(FIVE_INTEGER);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_116, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($LEFT));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($TOP));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_117 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_princ($str_alt352$Select_search_relations___);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_117, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_110, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_118 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($TOP));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_119 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                {
                                                                    SubLObject multiple_selectP = makeBoolean((NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $str_alt145$advanced_user)) || (NIL != tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $VIEW_MULTIPLE)));
                                                                    tm_browse_thesaurus_selection(multiple_selectP, T, $$$thesauri, UNPROVIDED);
                                                                }
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_119, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        if (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $str_alt114$limited_editor)) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_120 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_indent(FIVE_INTEGER);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_120, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            if (true) {
                                                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            if (true) {
                                                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup(html_utilities.html_align($TOP));
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_121 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    tm_edit_thesaurus_selection(T, T, $str_alt353$edit_thesauri, UNPROVIDED);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_121, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_122 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_indent(FIVE_INTEGER);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_122, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($TOP));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_123 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                {
                                                                    SubLObject v_case = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $DISPLAY_CASE);
                                                                    html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                                                    html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup($str_alt355$display_case);
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    if (true) {
                                                                        html_utilities.html_markup(html_macros.$html_select_size$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup(THREE_INTEGER);
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_124 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                            {
                                                                                SubLObject _prev_bind_0_125 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(NIL, thread);
                                                                                    if (v_case.equal($UPPER)) {
                                                                                        html_utilities.html_princ(html_macros.$html_option_selected$.getGlobalValue());
                                                                                    }
                                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                    {
                                                                                        SubLObject _prev_bind_0_126 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                        try {
                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                            html_utilities.html_princ($$$Uppercase);
                                                                                        } finally {
                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_126, thread);
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_125, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                                            html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                            {
                                                                                SubLObject _prev_bind_0_127 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(NIL, thread);
                                                                                    if (v_case.equal($LOWER)) {
                                                                                        html_utilities.html_princ(html_macros.$html_option_selected$.getGlobalValue());
                                                                                    }
                                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                    {
                                                                                        SubLObject _prev_bind_0_128 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                        try {
                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                            html_utilities.html_princ($$$Lowercase);
                                                                                        } finally {
                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_128, thread);
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_127, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                                            html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                            {
                                                                                SubLObject _prev_bind_0_129 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(NIL, thread);
                                                                                    if (v_case.equal($MIXED)) {
                                                                                        html_utilities.html_princ(html_macros.$html_option_selected$.getGlobalValue());
                                                                                    }
                                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                    {
                                                                                        SubLObject _prev_bind_0_130 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                        try {
                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                            html_utilities.html_princ($$$Mixed_Case);
                                                                                        } finally {
                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_130, thread);
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_129, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_124, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                                                }
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_123, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_131 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_indent(FIVE_INTEGER);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_131, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($LEFT));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($TOP));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_132 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                {
                                                                    SubLObject lexpreds = remove($$preferredTerm, tm_lexical_index.all_lexpreds(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    SubLObject selected_lexpreds = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $SEARCH_RELATIONS);
                                                                    html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                                                    html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup($str_alt363$search_relations);
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_simple_attribute(html_macros.$html_select_multiple$.getGlobalValue());
                                                                    if (true) {
                                                                        html_utilities.html_markup(html_macros.$html_select_size$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup(FIVE_INTEGER);
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_133 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                            {
                                                                                SubLObject _prev_bind_0_134 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(NIL, thread);
                                                                                    if (selected_lexpreds == $ALL) {
                                                                                        html_utilities.html_princ(html_macros.$html_option_selected$.getGlobalValue());
                                                                                    }
                                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                    {
                                                                                        SubLObject _prev_bind_0_135 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                        try {
                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                            html_utilities.html_princ($str_alt222$_ALL_);
                                                                                        } finally {
                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_135, thread);
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_134, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                                            {
                                                                                SubLObject cdolist_list_var = lexpreds;
                                                                                SubLObject lexpred = NIL;
                                                                                for (lexpred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lexpred = cdolist_list_var.first()) {
                                                                                    html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                                    {
                                                                                        SubLObject _prev_bind_0_136 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                        try {
                                                                                            html_macros.$html_safe_print$.bind(NIL, thread);
                                                                                            if (selected_lexpreds.isCons() && (NIL != member(lexpred, selected_lexpreds, UNPROVIDED, UNPROVIDED))) {
                                                                                                html_utilities.html_princ(html_macros.$html_option_selected$.getGlobalValue());
                                                                                            }
                                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                            {
                                                                                                SubLObject _prev_bind_0_137 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                try {
                                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                                    html_utilities.html_princ(tm_internals.tm_pred_arg_symbol(lexpred, ONE_INTEGER));
                                                                                                } finally {
                                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_137, thread);
                                                                                                }
                                                                                            }
                                                                                        } finally {
                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_136, thread);
                                                                                        }
                                                                                    }
                                                                                    html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_133, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                                                }
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_132, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_118, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_138 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(FOUR_INTEGER);
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_139 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                tm_link($COLOR_PREFERENCES, $$$Choose_background_colors, UNPROVIDED, UNPROVIDED);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_139, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_140 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_140, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_138, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_141 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(FOUR_INTEGER);
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_142 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_checkbox_input($str_alt366$separate_help_page, $$$T, tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $SEPARATE_HELP_PAGE), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt367$_Print_help_on_a_separate__floati);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_142, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_141, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_101, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                        html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                        html_utilities.html_princ($str_alt368$Browsing_Preferences___Hierarchic);
                                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                        html_utilities.html_br();
                                        html_utilities.html_br();
                                        html_utilities.html_checkbox_input($str_alt369$show_term_thesauri, $$$T, tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $SHOW_TERM_THESAURI), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_princ($str_alt371$__Show_thesauri_for_every_term_);
                                        html_utilities.html_br();
                                        html_utilities.html_checkbox_input($str_alt372$show_descendant_parms, $$$T, tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $SHOW_DESCENDANT_PARMS), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_princ($str_alt374$__Show_parameters_for_NTs_);
                                        html_utilities.html_br();
                                        html_utilities.html_checkbox_input($str_alt375$expand_parent_paths, $$$T, tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $EXPAND_PARENT_PATHS), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_princ($str_alt377$__Fully_expand_BT_and_NT_paths_);
                                        html_utilities.html_br();
                                        html_utilities.html_checkbox_input($str_alt378$detailed_hierarchy_term, $$$T, tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $DETAILED_HIERARCHY_TERM), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_princ($str_alt380$__Show_main_term_in_detail_);
                                        html_utilities.html_br();
                                        if (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $str_alt145$advanced_user)) {
                                            html_utilities.html_checkbox_input($str_alt381$show_hd_relation_links, $$$T, tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $SHOW_HD_RELATION_LINKS), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            html_utilities.html_princ($str_alt383$__Show_relation_links_);
                                            html_utilities.html_br();
                                        }
                                        html_utilities.html_princ($str_alt384$Indent_each_level_);
                                        html_utilities.html_text_input($str_alt385$depth_spacing, tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $DEPTH_SPACING), THREE_INTEGER);
                                        html_utilities.html_princ($str_alt387$_additional_spaces_);
                                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(ZERO_INTEGER);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_143 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_144 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_145 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_princ($str_alt388$Maximum_BT_height_);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_145, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_146 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_macros.verify_not_within_html_pre();
                                                                html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                                                                {
                                                                    SubLObject _prev_bind_0_147 = html_macros.$within_html_pre$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$within_html_pre$.bind(T, thread);
                                                                        html_utilities.html_princ($str_alt389$__);
                                                                    } finally {
                                                                        html_macros.$within_html_pre$.rebind(_prev_bind_0_147, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_146, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_148 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_princ($str_alt390$Maximum_NT_depth_);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_148, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_149 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_macros.verify_not_within_html_pre();
                                                                html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                                                                {
                                                                    SubLObject _prev_bind_0_150 = html_macros.$within_html_pre$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$within_html_pre$.bind(T, thread);
                                                                        html_utilities.html_princ($str_alt389$__);
                                                                    } finally {
                                                                        html_macros.$within_html_pre$.rebind(_prev_bind_0_150, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_149, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_151 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_princ($str_alt391$Maximum_NTs_);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_151, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_144, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_152 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($TOP));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_153 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                                                {
                                                                    SubLObject _prev_bind_0_154 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(NIL, thread);
                                                                        html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                                                        html_utilities.html_princ($str_alt392$parent_depth);
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_155 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                {
                                                                                    SubLObject current = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $PARENT_DEPTH);
                                                                                    if (NIL == current) {
                                                                                        current = ALL;
                                                                                    } else
                                                                                        if (current.equal(ZERO_INTEGER)) {
                                                                                            current = NONE;
                                                                                        }

                                                                                    {
                                                                                        SubLObject cdolist_list_var = $list_alt396;
                                                                                        SubLObject i = NIL;
                                                                                        for (i = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , i = cdolist_list_var.first()) {
                                                                                            html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                                            {
                                                                                                SubLObject _prev_bind_0_156 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                try {
                                                                                                    html_macros.$html_safe_print$.bind(NIL, thread);
                                                                                                    if (i.equal(current)) {
                                                                                                        html_utilities.html_princ(html_macros.$html_option_selected$.getGlobalValue());
                                                                                                    }
                                                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                    {
                                                                                                        SubLObject _prev_bind_0_157 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                        try {
                                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                                            html_utilities.html_princ(i);
                                                                                                        } finally {
                                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_157, thread);
                                                                                                        }
                                                                                                    }
                                                                                                } finally {
                                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_156, thread);
                                                                                                }
                                                                                            }
                                                                                            html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_155, thread);
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_154, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_153, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_158 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_158, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($TOP));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_159 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                                                {
                                                                    SubLObject _prev_bind_0_160 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(NIL, thread);
                                                                        html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                                                        html_utilities.html_princ($str_alt397$child_depth);
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_161 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                {
                                                                                    SubLObject current = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $CHILD_DEPTH);
                                                                                    if (NIL == current) {
                                                                                        current = ALL;
                                                                                    } else
                                                                                        if (current.equal(ZERO_INTEGER)) {
                                                                                            current = NONE;
                                                                                        }

                                                                                    {
                                                                                        SubLObject cdolist_list_var = $list_alt396;
                                                                                        SubLObject i = NIL;
                                                                                        for (i = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , i = cdolist_list_var.first()) {
                                                                                            html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                                            {
                                                                                                SubLObject _prev_bind_0_162 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                try {
                                                                                                    html_macros.$html_safe_print$.bind(NIL, thread);
                                                                                                    if (i.equal(current)) {
                                                                                                        html_utilities.html_princ(html_macros.$html_option_selected$.getGlobalValue());
                                                                                                    }
                                                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                    {
                                                                                                        SubLObject _prev_bind_0_163 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                        try {
                                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                                            html_utilities.html_princ(i);
                                                                                                        } finally {
                                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_163, thread);
                                                                                                        }
                                                                                                    }
                                                                                                } finally {
                                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_162, thread);
                                                                                                }
                                                                                            }
                                                                                            html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_161, thread);
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_160, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_159, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_164 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_164, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($TOP));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_165 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_text_input($str_alt399$max_children, tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $MAX_CHILDREN), SEVEN_INTEGER);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_165, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_152, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_143, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                        if (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $str_alt145$advanced_user)) {
                                            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                            if (true) {
                                                html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(ZERO_INTEGER);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_166 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_167 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            if (true) {
                                                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup(html_utilities.html_align($TOP));
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_168 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt401$Relation_to_use_when_printing_hie);
                                                                    html_utilities.html_br();
                                                                    html_utilities.html_br();
                                                                    html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                                                    html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup($str_alt402$graph_relation);
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    if (true) {
                                                                        html_utilities.html_markup(html_macros.$html_select_size$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup(FIVE_INTEGER);
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_169 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            {
                                                                                SubLObject cdolist_list_var = tm_internals.tm_transitive_active_relation_names();
                                                                                SubLObject name = NIL;
                                                                                for (name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , name = cdolist_list_var.first()) {
                                                                                    html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                                    {
                                                                                        SubLObject _prev_bind_0_170 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                        try {
                                                                                            html_macros.$html_safe_print$.bind(NIL, thread);
                                                                                            if (tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $GRAPH_RELATION).equal(tm_internals.thesaurus_constant_from_string(name))) {
                                                                                                html_utilities.html_princ(html_macros.$html_option_selected$.getGlobalValue());
                                                                                            }
                                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                            {
                                                                                                SubLObject _prev_bind_0_171 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                try {
                                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                                    format(html_macros.$html_stream$.getDynamicValue(thread), name);
                                                                                                } finally {
                                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_171, thread);
                                                                                                }
                                                                                            }
                                                                                        } finally {
                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_170, thread);
                                                                                        }
                                                                                    }
                                                                                    html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_169, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_168, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_167, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_166, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                        }
                                        html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                        if ((NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $str_alt145$advanced_user)) || (NIL != tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $VIEW_MULTIPLE))) {
                                            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                            html_utilities.html_princ($str_alt404$Browsing_preferences___Full_Term_);
                                            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                            html_utilities.html_br();
                                            html_utilities.html_br();
                                            html_utilities.html_checkbox_input($str_alt405$fd_separate_, $$$T, tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $kw201$FD_SEPARATE_), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            html_utilities.html_princ($str_alt406$__Show_a_separate_section_per_the);
                                            html_utilities.html_br();
                                            if (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)) {
                                                html_utilities.html_checkbox_input($str_alt407$show_reasons_, $$$T, tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $kw408$SHOW_REASONS_), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                html_utilities.html_princ($str_alt409$__Show_audit_trail_for_thesaurus_);
                                            }
                                            html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                        }
                                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                        html_utilities.html_princ($str_alt410$Browsing_preferences___Alphabetic);
                                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                        html_utilities.html_br();
                                        html_utilities.html_br();
                                        html_utilities.html_checkbox_input($str_alt411$alphabetical_show_use_fors, $$$T, tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $ALPHABETICAL_SHOW_USE_FORS), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_princ($str_alt412$__Show_alternative_terms_also_);
                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                    } finally {
                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_99, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                tm_footer();
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_96, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            }
            return NIL;
        }
    }

    /**
     * Stores preferences for *TM-USER* in a file, and returns a result page.
     */
    public static final SubLObject tm_store_preferences() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            tm_internals.tm_save_preferences_from_vector(tm_datastructures.$tm_user$.getDynamicValue(thread));
            tm_message_to_user($$$Update_Preferences_Results, $str_alt415$Your_preferences_have_been_update);
            return NIL;
        }
    }

    public static final SubLObject tm_handle_preferences(SubLObject args) {
        tm_update_preferences_from_list(args);
        tm_store_preferences();
        return NIL;
    }

    public static final SubLObject tm_update_preferences_from_list(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject editing_pref = html_utilities.html_extract_input($str_alt333$editing_enabled, args);
                SubLObject view_multiple = html_utilities.html_extract_input($str_alt344$view_multiple, args);
                SubLObject thesauri = html_utilities.html_extract_input_values($$$thesauri, args);
                SubLObject edit_thesauri = html_utilities.html_extract_input_values($str_alt353$edit_thesauri, args);
                SubLObject case_style = html_utilities.html_extract_input($str_alt355$display_case, args);
                SubLObject search_relations = html_utilities.html_extract_input_values($str_alt363$search_relations, args);
                SubLObject showthesauri = html_utilities.html_extract_input($str_alt369$show_term_thesauri, args);
                SubLObject show_desc_parms = html_utilities.html_extract_input($str_alt372$show_descendant_parms, args);
                SubLObject depth_spacing_ind = html_utilities.html_extract_input($str_alt385$depth_spacing, args);
                SubLObject depth_spacing = (depth_spacing_ind.isString() && length(depth_spacing_ind).numG(ZERO_INTEGER)) ? ((SubLObject) (read_from_string_ignoring_errors(depth_spacing_ind, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : depth_spacing_ind.isInteger() ? ((SubLObject) (depth_spacing_ind)) : NIL;
                SubLObject parent_depth_ind = html_utilities.html_extract_input($str_alt392$parent_depth, args);
                SubLObject parent_depth = (parent_depth_ind.isString() && length(parent_depth_ind).numG(ZERO_INTEGER)) ? ((SubLObject) (read_from_string_ignoring_errors(parent_depth_ind, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : parent_depth_ind.isInteger() ? ((SubLObject) (parent_depth_ind)) : NIL;
                SubLObject child_depth_ind = html_utilities.html_extract_input($str_alt397$child_depth, args);
                SubLObject child_depth = (child_depth_ind.isString() && length(child_depth_ind).numG(ZERO_INTEGER)) ? ((SubLObject) (read_from_string_ignoring_errors(child_depth_ind, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : child_depth_ind.isInteger() ? ((SubLObject) (child_depth_ind)) : NIL;
                SubLObject max_children_input = html_utilities.html_extract_input($str_alt399$max_children, args);
                SubLObject max_children_ind = (max_children_input.isString() && length(max_children_input).numG(ZERO_INTEGER)) ? ((SubLObject) (read_from_string_ignoring_errors(max_children_input, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : max_children_input.isInteger() ? ((SubLObject) (max_children_input)) : NIL;
                SubLObject max_children = (max_children_ind.isInteger()) ? ((SubLObject) (max_children_ind)) : NIL;
                SubLObject expand_parents = html_utilities.html_extract_input($str_alt375$expand_parent_paths, args);
                SubLObject detailed_hierarchy = html_utilities.html_extract_input($str_alt378$detailed_hierarchy_term, args);
                SubLObject separate = html_utilities.html_extract_input($str_alt405$fd_separate_, args);
                SubLObject show_reasons = html_utilities.html_extract_input($str_alt407$show_reasons_, args);
                SubLObject show_ufs = html_utilities.html_extract_input($str_alt411$alphabetical_show_use_fors, args);
                SubLObject help = html_utilities.html_extract_input($str_alt366$separate_help_page, args);
                SubLObject relation = html_utilities.html_extract_input($str_alt402$graph_relation, args);
                SubLObject show_rel_link = html_utilities.html_extract_input($str_alt381$show_hd_relation_links, args);
                SubLObject bg_color_default_input = html_utilities.html_extract_input($str_alt417$bg_color_default, args);
                SubLObject bg_color_default = (bg_color_default_input.isString() && read_from_string_ignoring_errors(bg_color_default_input, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).isKeyword()) ? ((SubLObject) (read_from_string_ignoring_errors(bg_color_default_input, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : bg_color_default_input.isString() && length(bg_color_default_input).numG(ZERO_INTEGER) ? ((SubLObject) (bg_color_default_input)) : tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $BG_COLOR_DEFAULT);
                SubLObject bg_color_hierarchical_input = html_utilities.html_extract_input($str_alt419$bg_color_hierarchical, args);
                SubLObject bg_color_hierarchical = (bg_color_hierarchical_input.isString() && read_from_string_ignoring_errors(bg_color_hierarchical_input, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).isKeyword()) ? ((SubLObject) (read_from_string_ignoring_errors(bg_color_hierarchical_input, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : bg_color_hierarchical_input.isString() && length(bg_color_hierarchical_input).numG(ZERO_INTEGER) ? ((SubLObject) (bg_color_hierarchical_input)) : tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $BG_COLOR_HIERARCHICAL);
                SubLObject bg_color_alphabetical_input = html_utilities.html_extract_input($str_alt421$bg_color_alphabetical, args);
                SubLObject bg_color_alphabetical = (bg_color_alphabetical_input.isString() && read_from_string_ignoring_errors(bg_color_alphabetical_input, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).isKeyword()) ? ((SubLObject) (read_from_string_ignoring_errors(bg_color_alphabetical_input, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : bg_color_alphabetical_input.isString() && length(bg_color_alphabetical_input).numG(ZERO_INTEGER) ? ((SubLObject) (bg_color_alphabetical_input)) : tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $BG_COLOR_ALPHABETICAL);
                SubLObject bg_color_full_record_input = html_utilities.html_extract_input($str_alt423$bg_color_full_record, args);
                SubLObject bg_color_full_record = (bg_color_full_record_input.isString() && read_from_string_ignoring_errors(bg_color_full_record_input, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).isKeyword()) ? ((SubLObject) (read_from_string_ignoring_errors(bg_color_full_record_input, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : bg_color_full_record_input.isString() && length(bg_color_full_record_input).numG(ZERO_INTEGER) ? ((SubLObject) (bg_color_full_record_input)) : tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $BG_COLOR_FULL_RECORD);
                SubLObject v_interface = html_utilities.html_extract_input($$$interface, args);
                SubLObject basic_filtering = html_utilities.html_extract_input($str_alt336$filter_in_basic, args);
                SubLObject set_from = html_utilities.html_extract_input($str_alt341$set_from, args);
                SubLObject thesauri_ans = NIL;
                SubLObject edit_thesauri_ans = NIL;
                if (v_interface.isString()) {
                    v_interface = read_from_string_ignoring_errors(v_interface, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (editing_pref.isString()) {
                    editing_pref = read_from_string_ignoring_errors(editing_pref, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (view_multiple.isString()) {
                    view_multiple = read_from_string_ignoring_errors(view_multiple, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (NIL != member($str_alt222$_ALL_, thesauri, symbol_function(EQUALP), UNPROVIDED)) {
                    thesauri_ans = tm_internals.browsable_thesauri(tm_datastructures.$tm_user$.getDynamicValue(thread), UNPROVIDED);
                } else {
                    {
                        SubLObject cdolist_list_var = thesauri;
                        SubLObject thesaurus_short_name = NIL;
                        for (thesaurus_short_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus_short_name = cdolist_list_var.first()) {
                            {
                                SubLObject thesaurus_constant = tm_internals.thesaurus_constant_from_name(thesaurus_short_name);
                                if (NIL != tm_internals.thesaurusP(thesaurus_constant)) {
                                    thesauri_ans = cons(thesaurus_constant, thesauri_ans);
                                }
                            }
                        }
                    }
                }
                if (NIL == tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $str_alt151$full_editor)) {
                    thesauri_ans = list_utilities.remove_if_not(symbol_function($sym426$BROWSABLE_THESAURUS_), thesauri_ans, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (!((((NIL != view_multiple) || (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $str_alt145$advanced_user))) || (NIL == thesauri_ans)) || (v_interface == $ADVANCED))) {
                    thesauri_ans = list(thesauri_ans.first());
                }
                if (NIL != member($str_alt222$_ALL_, edit_thesauri, symbol_function(EQUALP), UNPROVIDED)) {
                    {
                        SubLObject editable_thesauri = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $EDITABLE_THESAURI);
                        edit_thesauri_ans = (editable_thesauri == $ALL) ? ((SubLObject) (tm_internals.all_thesauri_sorted())) : editable_thesauri;
                    }
                } else {
                    {
                        SubLObject cdolist_list_var = edit_thesauri;
                        SubLObject thesaurus_short_name = NIL;
                        for (thesaurus_short_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus_short_name = cdolist_list_var.first()) {
                            {
                                SubLObject thesaurus_constant = tm_internals.thesaurus_constant_from_name(thesaurus_short_name);
                                if (NIL != tm_internals.thesaurusP(thesaurus_constant)) {
                                    edit_thesauri_ans = cons(thesaurus_constant, edit_thesauri_ans);
                                }
                            }
                        }
                    }
                }
                if (NIL == tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $str_alt151$full_editor)) {
                    edit_thesauri_ans = list_utilities.remove_if_not(symbol_function($sym427$EDITABLE_THESAURUS_), edit_thesauri_ans, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (!tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $INTERFACE).eql($BASIC)) {
                    {
                        SubLObject difference = set_difference(edit_thesauri_ans, thesauri_ans, UNPROVIDED, UNPROVIDED);
                        if (NIL != difference) {
                            thesauri_ans = nconc(thesauri_ans, difference);
                        }
                    }
                }
                thesauri_ans = Sort.sort(thesauri_ans, symbol_function(STRING_LESSP), symbol_function(THESAURUS_NAME));
                edit_thesauri_ans = Sort.sort(edit_thesauri_ans, symbol_function(STRING_LESSP), symbol_function(THESAURUS_NAME));
                if (case_style.equalp($$$Mixed_Case)) {
                    case_style = $MIXED;
                } else {
                    if (case_style.equalp($$$Lowercase)) {
                        case_style = $LOWER;
                    } else {
                        case_style = $UPPER;
                    }
                }
                if (NIL != member($str_alt222$_ALL_, search_relations, symbol_function(EQUALP), UNPROVIDED)) {
                    search_relations = $ALL;
                } else {
                    search_relations = Mapping.mapcar(symbol_function(RELATION_CONSTANT_FROM_ABBREVIATION), search_relations);
                    search_relations = remove_if(symbol_function(NULL), search_relations, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    search_relations = cons($$preferredTerm, search_relations);
                }
                if (NIL != view_multiple) {
                    showthesauri = T;
                } else
                    if (showthesauri.isString()) {
                        showthesauri = read_from_string_ignoring_errors(showthesauri, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }

                if (show_desc_parms.isString()) {
                    show_desc_parms = read_from_string_ignoring_errors(show_desc_parms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (expand_parents.isString()) {
                    expand_parents = read_from_string_ignoring_errors(expand_parents, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (detailed_hierarchy.isString()) {
                    detailed_hierarchy = read_from_string_ignoring_errors(detailed_hierarchy, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (!((depth_spacing.isInteger() && depth_spacing.numG(ZERO_INTEGER)) && depth_spacing.numL($int$50))) {
                    depth_spacing = TWO_INTEGER;
                }
                if (!parent_depth.isInteger()) {
                    if (parent_depth.equal(NONE)) {
                        parent_depth = ZERO_INTEGER;
                    } else {
                        parent_depth = NIL;
                    }
                }
                if (!child_depth.isInteger()) {
                    if (child_depth.equal(NONE)) {
                        child_depth = ZERO_INTEGER;
                    } else {
                        child_depth = NIL;
                    }
                }
                if (separate.isString()) {
                    separate = read_from_string_ignoring_errors(separate, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (show_reasons.isString()) {
                    show_reasons = read_from_string_ignoring_errors(show_reasons, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (show_ufs.isString()) {
                    show_ufs = read_from_string_ignoring_errors(show_ufs, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (help.isString()) {
                    help = read_from_string_ignoring_errors(help, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (NIL != assoc(relation, tm_datastructures.$tm_relation_predicate_map$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED)) {
                    relation = second(assoc(relation, tm_datastructures.$tm_relation_predicate_map$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED));
                } else {
                    relation = $$broaderTerm;
                }
                if (show_rel_link.isString()) {
                    show_rel_link = read_from_string_ignoring_errors(show_rel_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (set_from.isString()) {
                    set_from = read_from_string_ignoring_errors(set_from, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (basic_filtering.isString()) {
                    basic_filtering = read_from_string_ignoring_errors(basic_filtering, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if ((NIL == basic_filtering) && set_from.eql($INTERFACE)) {
                    basic_filtering = $OFF;
                }
                if (NIL == basic_filtering) {
                    if (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $str_alt114$limited_editor)) {
                        basic_filtering = $OFF;
                    } else {
                        basic_filtering = $ON;
                    }
                }
                tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $EDITING_ENABLED, editing_pref, UNPROVIDED);
                tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $VIEW_MULTIPLE, view_multiple, UNPROVIDED);
                tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI, thesauri_ans, UNPROVIDED);
                tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $EDIT_THESAURI, edit_thesauri_ans, UNPROVIDED);
                tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $DISPLAY_CASE, case_style, UNPROVIDED);
                tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $SEARCH_RELATIONS, search_relations, UNPROVIDED);
                tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $SHOW_TERM_THESAURI, showthesauri, UNPROVIDED);
                tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $SHOW_DESCENDANT_PARMS, show_desc_parms, UNPROVIDED);
                tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $DEPTH_SPACING, depth_spacing, UNPROVIDED);
                tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $PARENT_DEPTH, parent_depth, UNPROVIDED);
                tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $CHILD_DEPTH, child_depth, UNPROVIDED);
                tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $MAX_CHILDREN, max_children, UNPROVIDED);
                tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $kw201$FD_SEPARATE_, separate, UNPROVIDED);
                tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $kw408$SHOW_REASONS_, show_reasons, UNPROVIDED);
                tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $ALPHABETICAL_SHOW_USE_FORS, show_ufs, UNPROVIDED);
                tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $EXPAND_PARENT_PATHS, expand_parents, UNPROVIDED);
                tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $DETAILED_HIERARCHY_TERM, detailed_hierarchy, UNPROVIDED);
                tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $SEPARATE_HELP_PAGE, help, UNPROVIDED);
                tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $GRAPH_RELATION, relation, UNPROVIDED);
                tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $SHOW_HD_RELATION_LINKS, show_rel_link, UNPROVIDED);
                tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $BG_COLOR_DEFAULT, bg_color_default, UNPROVIDED);
                tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $BG_COLOR_HIERARCHICAL, bg_color_hierarchical, UNPROVIDED);
                tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $BG_COLOR_ALPHABETICAL, bg_color_alphabetical, UNPROVIDED);
                tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $BG_COLOR_FULL_RECORD, bg_color_full_record, UNPROVIDED);
                tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $FILTER_IN_BASIC, basic_filtering, UNPROVIDED);
                if (NIL != v_interface) {
                    tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $INTERFACE, v_interface, UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_color_preferences_handler(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject red_val = $int$100;
                SubLObject green_val = $int$100;
                SubLObject blue_val = $int$100;
                SubLObject red = html_utilities.html_extract_input($$$red, args);
                SubLObject green = html_utilities.html_extract_input($$$green, args);
                SubLObject blue = html_utilities.html_extract_input($$$blue, args);
                if (NIL != red) {
                    red = (red.isString()) ? ((SubLObject) (read_from_string_ignoring_errors(red, NIL, NIL, UNPROVIDED, UNPROVIDED))) : NIL;
                    if ((red.isInteger() && red.numGE(ZERO_INTEGER)) && red.numLE($int$100)) {
                        red_val = red;
                    }
                    green = (green.isString()) ? ((SubLObject) (read_from_string_ignoring_errors(green, NIL, NIL, UNPROVIDED, UNPROVIDED))) : NIL;
                    if ((green.isInteger() && green.numGE(ZERO_INTEGER)) && green.numLE($int$100)) {
                        green_val = green;
                    }
                    blue = (blue.isString()) ? ((SubLObject) (read_from_string_ignoring_errors(blue, NIL, NIL, UNPROVIDED, UNPROVIDED))) : NIL;
                    if ((blue.isInteger() && blue.numGE(ZERO_INTEGER)) && blue.numLE($int$100)) {
                        blue_val = blue;
                    }
                }
                {
                    SubLObject background_color = determine_rgb(red_val, green_val, blue_val);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ($$$Set_background_color);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    {
                        SubLObject color_value = background_color;
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                if (NIL != color_value) {
                                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_color(color_value));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_172 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                        html_utilities.html_markup(ONE_INTEGER);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        html_utilities.html_princ($$$Set_background_color);
                                        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                        html_utilities.html_markup(ONE_INTEGER);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        tm_help_link($str_alt439$tm_color_preferences_handler);
                                        html_utilities.html_br();
                                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                            html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_173 = html_macros.$html_safe_print$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_macros.$within_html_form$.bind(T, thread);
                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                html_utilities.html_hidden_input($str_alt439$tm_color_preferences_handler, T, UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(ZERO_INTEGER);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_174 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_caption_head$.getGlobalValue());
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_caption_align$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($TOP));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_175 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_princ($str_alt440$Choose_values_from_0_100);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_175, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_caption_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_176 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_177 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ($$$Red);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_177, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_178 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ($$$Green);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_178, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_179 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ($$$Blue);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_179, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_176, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_180 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_181 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_text_input($$$red, red_val, THREE_INTEGER);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_181, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_182 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_text_input($$$green, green_val, THREE_INTEGER);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_182, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_183 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_text_input($$$blue, blue_val, THREE_INTEGER);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_183, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_180, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_174, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                html_utilities.html_reset_input($$$Reset);
                                                html_utilities.html_submit_input($$$Change_Color, UNPROVIDED, UNPROVIDED);
                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                            } finally {
                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_173, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                        tm_link($BG_COLOR_DEFAULT, $str_alt445$Set_default_background_to_this_co, background_color, UNPROVIDED);
                                        html_utilities.html_br();
                                        tm_link($BG_COLOR_HIERARCHICAL, $str_alt446$Set_hierarchical_display_backgrou, background_color, UNPROVIDED);
                                        html_utilities.html_br();
                                        tm_link($BG_COLOR_ALPHABETICAL, $str_alt447$Set_alphabetical_display_backgrou, background_color, UNPROVIDED);
                                        html_utilities.html_br();
                                        tm_link($BG_COLOR_FULL_RECORD, $str_alt448$Set_full_record_display_backgroun, background_color, UNPROVIDED);
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        html_utilities.html_copyright_notice();
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_172, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_set_bg_color_default(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            tm_datastructures.$tm_bg_color_default$.setDynamicValue(args.first(), thread);
            tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $BG_COLOR_DEFAULT, tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread), UNPROVIDED);
            tm_internals.tm_save_preferences_from_vector(tm_datastructures.$tm_user$.getDynamicValue(thread));
            tm_note_edit_change($$$Default_background_color_change);
            return NIL;
        }
    }

    public static final SubLObject tm_set_bg_color_hierarchical(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $BG_COLOR_HIERARCHICAL, args.first(), UNPROVIDED);
            tm_internals.tm_save_preferences_from_vector(tm_datastructures.$tm_user$.getDynamicValue(thread));
            tm_note_edit_change($str_alt452$Hierarchical_display_background_c);
            return NIL;
        }
    }

    public static final SubLObject tm_set_bg_color_alphabetical(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $BG_COLOR_ALPHABETICAL, args.first(), UNPROVIDED);
            tm_internals.tm_save_preferences_from_vector(tm_datastructures.$tm_user$.getDynamicValue(thread));
            tm_note_edit_change($str_alt454$Alphabetical_display_background_c);
            return NIL;
        }
    }

    public static final SubLObject tm_set_bg_color_full_record(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $BG_COLOR_FULL_RECORD, args.first(), UNPROVIDED);
            tm_internals.tm_save_preferences_from_vector(tm_datastructures.$tm_user$.getDynamicValue(thread));
            tm_note_edit_change($str_alt456$Full_record_display_background_co);
            return NIL;
        }
    }

    // defparameter
    public static final SubLSymbol $hex_conversion_map$ = makeSymbol("*HEX-CONVERSION-MAP*");

    public static final SubLObject determine_rgb(SubLObject red, SubLObject green, SubLObject blue) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            red = integerDivide(multiply(red, $int$256), $int$100);
            green = integerDivide(multiply(green, $int$256), $int$100);
            blue = integerDivide(multiply(blue, $int$256), $int$100);
            if (red.numG($int$255)) {
                red = $int$255;
            }
            if (green.numG($int$255)) {
                green = $int$255;
            }
            if (blue.numG($int$255)) {
                blue = $int$255;
            }
            {
                SubLObject v_answer = Strings.make_string(SIX_INTEGER, UNPROVIDED);
                Strings.set_char(v_answer, ZERO_INTEGER, Strings.sublisp_char($hex_conversion_map$.getDynamicValue(thread), integerDivide(red, SIXTEEN_INTEGER)));
                Strings.set_char(v_answer, ONE_INTEGER, Strings.sublisp_char($hex_conversion_map$.getDynamicValue(thread), rem(red, SIXTEEN_INTEGER)));
                Strings.set_char(v_answer, TWO_INTEGER, Strings.sublisp_char($hex_conversion_map$.getDynamicValue(thread), integerDivide(green, SIXTEEN_INTEGER)));
                Strings.set_char(v_answer, THREE_INTEGER, Strings.sublisp_char($hex_conversion_map$.getDynamicValue(thread), rem(green, SIXTEEN_INTEGER)));
                Strings.set_char(v_answer, FOUR_INTEGER, Strings.sublisp_char($hex_conversion_map$.getDynamicValue(thread), integerDivide(blue, SIXTEEN_INTEGER)));
                Strings.set_char(v_answer, FIVE_INTEGER, Strings.sublisp_char($hex_conversion_map$.getDynamicValue(thread), rem(blue, SIXTEEN_INTEGER)));
                return v_answer;
            }
        }
    }

    /**
     * For testing purposes only.
     */
    public static final SubLObject tm_change_user_type(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject user_constant = tm_internals.tm_user_constant_from_user_name(tm_datastructures.$tm_user$.getDynamicValue(thread));
                if (!(((NIL != tm_control_vars.$tm_testing$.getDynamicValue(thread)) && (NIL != constant_handles.valid_constantP(user_constant, UNPROVIDED))) && tm_internals.user_level(user_constant).equal($$$administrator))) {
                    {
                        SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                        html_utilities.html_princ($str_alt461$Sorry_);
                        html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                if (NIL != color_value) {
                                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_color(color_value));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_184 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                        html_utilities.html_markup(ONE_INTEGER);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
                                            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_185 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
                                                        html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    if (true) {
                                                        html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(ZERO_INTEGER);
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_186 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_186, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_185, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                        }
                                        html_utilities.html_princ($str_alt461$Sorry_);
                                        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                        html_utilities.html_markup(ONE_INTEGER);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        tm_logging.tm_enqueue_event($str_alt461$Sorry_);
                                        tm_footer();
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_184, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    }
                    return NIL;
                }
            }
            {
                SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ($$$Change_User_Permission_Level);
                html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (NIL != color_value) {
                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(color_value));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_187 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_188 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
                                                html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            if (true) {
                                                html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(ZERO_INTEGER);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_189 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_189, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_188, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                }
                                html_utilities.html_princ($$$Change_User_Permission_Level);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                tm_logging.tm_enqueue_event($$$Change_User_Permission_Level);
                                html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                    html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_190 = html_macros.$html_safe_print$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_macros.$within_html_form$.bind(T, thread);
                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                        html_utilities.html_hidden_input($str_alt462$tm_handle_change_user_type, T, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(ZERO_INTEGER);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_191 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_192 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_193 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_princ($str_alt463$Select_User_Type_);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_193, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_194 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_194, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_195 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_princ($str_alt464$Select_Browse_Thesauri_);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_195, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_196 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_196, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_197 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_princ($str_alt465$Select_Edit_Thesauri_);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_197, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_192, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_198 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_199 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup($str_alt466$user_type);
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                if (true) {
                                                                    html_utilities.html_markup(html_macros.$html_select_size$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(FIVE_INTEGER);
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_200 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        {
                                                                            SubLObject current = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $LEVEL);
                                                                            SubLObject cdolist_list_var = tm_datastructures.$tm_user_levels$.getGlobalValue();
                                                                            SubLObject level = NIL;
                                                                            for (level = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , level = cdolist_list_var.first()) {
                                                                                html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                                {
                                                                                    SubLObject _prev_bind_0_201 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                    try {
                                                                                        html_macros.$html_safe_print$.bind(NIL, thread);
                                                                                        if (level.first().equalp(current)) {
                                                                                            html_utilities.html_princ(html_macros.$html_option_selected$.getGlobalValue());
                                                                                        }
                                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                        {
                                                                                            SubLObject _prev_bind_0_202 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                            try {
                                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                                html_utilities.html_princ(level.first());
                                                                                            } finally {
                                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_202, thread);
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_201, thread);
                                                                                    }
                                                                                }
                                                                                html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_200, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_199, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_203 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_macros.verify_not_within_html_pre();
                                                                html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                                                                {
                                                                    SubLObject _prev_bind_0_204 = html_macros.$within_html_pre$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$within_html_pre$.bind(T, thread);
                                                                        html_utilities.html_princ($str_alt467$___);
                                                                    } finally {
                                                                        html_macros.$within_html_pre$.rebind(_prev_bind_0_204, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_203, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_205 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup($str_alt468$browse_thesauri);
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_simple_attribute(html_macros.$html_select_multiple$.getGlobalValue());
                                                                if (true) {
                                                                    html_utilities.html_markup(html_macros.$html_select_size$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(FIVE_INTEGER);
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_206 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        {
                                                                            SubLObject current = tm_internals.browsable_thesauri(tm_datastructures.$tm_user$.getDynamicValue(thread), UNPROVIDED);
                                                                            SubLObject cdolist_list_var = tm_internals.all_thesauri_sorted();
                                                                            SubLObject thesaurus = NIL;
                                                                            for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                                                                                html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                                {
                                                                                    SubLObject _prev_bind_0_207 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                    try {
                                                                                        html_macros.$html_safe_print$.bind(NIL, thread);
                                                                                        if (NIL != subl_promotions.memberP(thesaurus, current, UNPROVIDED, UNPROVIDED)) {
                                                                                            html_utilities.html_princ(html_macros.$html_option_selected$.getGlobalValue());
                                                                                        }
                                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                        {
                                                                                            SubLObject _prev_bind_0_208 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                            try {
                                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                                html_utilities.html_princ(tm_internals.thesaurus_name(thesaurus));
                                                                                            } finally {
                                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_208, thread);
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_207, thread);
                                                                                    }
                                                                                }
                                                                                html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_206, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_205, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_209 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_macros.verify_not_within_html_pre();
                                                                html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                                                                {
                                                                    SubLObject _prev_bind_0_210 = html_macros.$within_html_pre$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$within_html_pre$.bind(T, thread);
                                                                        html_utilities.html_princ($str_alt469$_____);
                                                                    } finally {
                                                                        html_macros.$within_html_pre$.rebind(_prev_bind_0_210, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_209, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_211 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup($str_alt353$edit_thesauri);
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_simple_attribute(html_macros.$html_select_multiple$.getGlobalValue());
                                                                if (true) {
                                                                    html_utilities.html_markup(html_macros.$html_select_size$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(FIVE_INTEGER);
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_212 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        {
                                                                            SubLObject current = tm_internals.declarative_editable_thesauri(tm_internals.tm_user_constant_from_user_name(tm_datastructures.$tm_user$.getDynamicValue(thread)));
                                                                            SubLObject cdolist_list_var = tm_internals.all_thesauri_sorted();
                                                                            SubLObject thesaurus = NIL;
                                                                            for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                                                                                html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                                {
                                                                                    SubLObject _prev_bind_0_213 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                    try {
                                                                                        html_macros.$html_safe_print$.bind(NIL, thread);
                                                                                        if (NIL != subl_promotions.memberP(thesaurus, current, UNPROVIDED, UNPROVIDED)) {
                                                                                            html_utilities.html_princ(html_macros.$html_option_selected$.getGlobalValue());
                                                                                        }
                                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                        {
                                                                                            SubLObject _prev_bind_0_214 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                            try {
                                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                                html_utilities.html_princ(tm_internals.thesaurus_name(thesaurus));
                                                                                            } finally {
                                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_214, thread);
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_213, thread);
                                                                                    }
                                                                                }
                                                                                html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_212, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_211, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_198, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_191, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                        html_utilities.html_princ($str_alt470$Note__Here_you_may_edit_Browse_Th);
                                        html_utilities.html_br();
                                        html_utilities.html_submit_input($$$Change, UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_reset_input(UNPROVIDED);
                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                    } finally {
                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_190, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                tm_footer();
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_187, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            }
            return NIL;
        }
    }

    public static final SubLObject tm_handle_change_user_type(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject level = html_utilities.html_extract_input($str_alt466$user_type, args);
                SubLObject browse_thesauri_names = html_utilities.html_extract_input_values($str_alt468$browse_thesauri, args);
                SubLObject edit_thesauri_names = html_utilities.html_extract_input_values($str_alt353$edit_thesauri, args);
                SubLObject browse_thesauri = Mapping.mapcar(symbol_function(THESAURUS_CONSTANT_FROM_NAME), browse_thesauri_names);
                SubLObject edit_thesauri = Mapping.mapcar(symbol_function(THESAURUS_CONSTANT_FROM_NAME), edit_thesauri_names);
                SubLObject user_constant = tm_internals.tm_user_constant_from_user_name(tm_datastructures.$tm_user$.getDynamicValue(thread));
                if (((NIL == constant_handles.valid_constantP(user_constant, UNPROVIDED)) || ((NIL != edit_thesauri) && (NIL != remove_if(symbol_function($sym474$VALID_CONSTANT_), edit_thesauri, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) || ((NIL != browse_thesauri) && (NIL != remove_if(symbol_function($sym474$VALID_CONSTANT_), browse_thesauri, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) {
                    return tm_error($str_alt475$Error_changing_user_type_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                {
                    SubLObject old_browse_thesauri = tm_internals.declarative_browsable_thesauri(user_constant);
                    SubLObject old_edit_thesauri = tm_internals.declarative_editable_thesauri(user_constant);
                    SubLObject add_browse = set_difference(browse_thesauri, old_browse_thesauri, UNPROVIDED, UNPROVIDED);
                    SubLObject delete_browse = set_difference(old_browse_thesauri, browse_thesauri, UNPROVIDED, UNPROVIDED);
                    SubLObject add_edit = set_difference(edit_thesauri, old_edit_thesauri, UNPROVIDED, UNPROVIDED);
                    SubLObject delete_edit = set_difference(old_edit_thesauri, edit_thesauri, UNPROVIDED, UNPROVIDED);
                    if ((((NIL != add_browse) || (NIL != delete_browse)) || (NIL != add_edit)) || (NIL != delete_edit)) {
                        {
                            SubLObject ops = NIL;
                            {
                                SubLObject cdolist_list_var = add_browse;
                                SubLObject thesaurus = NIL;
                                for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                                    {
                                        SubLObject op = tm_datastructures.get_tm_op();
                                        SubLObject op_215 = op;
                                        tm_datastructures._csetf_tm_op_opcode(op_215, $ADD);
                                        tm_datastructures._csetf_tm_op_relation(op_215, $$tmBrowsableThesauri);
                                        tm_datastructures._csetf_tm_op_inverseP(op_215, NIL);
                                        tm_datastructures._csetf_tm_op_args(op_215, list(user_constant, thesaurus));
                                        tm_datastructures._csetf_tm_op_thesaurus(op_215, tm_datastructures.$tm_mt$.getGlobalValue());
                                        tm_datastructures._csetf_tm_op_status(op_215, NIL);
                                        tm_datastructures._csetf_tm_op_verifyP(op_215, NIL);
                                        tm_datastructures._csetf_tm_op_hiddenP(op_215, T);
                                        tm_datastructures._csetf_tm_op_description(op_215, NIL);
                                        tm_datastructures._csetf_tm_op_description_args(op_215, NIL);
                                        if (NIL.isString()) {
                                            html_tm_editing.set_op_english(op_215, NIL);
                                        } else {
                                            html_tm_editing.set_op_english(op_215, UNPROVIDED);
                                        }
                                        ops = cons(op, ops);
                                    }
                                }
                            }
                            {
                                SubLObject cdolist_list_var = delete_browse;
                                SubLObject thesaurus = NIL;
                                for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                                    {
                                        SubLObject op = tm_datastructures.get_tm_op();
                                        SubLObject op_216 = op;
                                        tm_datastructures._csetf_tm_op_opcode(op_216, $DELETE);
                                        tm_datastructures._csetf_tm_op_relation(op_216, $$tmBrowsableThesauri);
                                        tm_datastructures._csetf_tm_op_inverseP(op_216, NIL);
                                        tm_datastructures._csetf_tm_op_args(op_216, list(user_constant, thesaurus));
                                        tm_datastructures._csetf_tm_op_thesaurus(op_216, tm_datastructures.$tm_mt$.getGlobalValue());
                                        tm_datastructures._csetf_tm_op_status(op_216, NIL);
                                        tm_datastructures._csetf_tm_op_verifyP(op_216, NIL);
                                        tm_datastructures._csetf_tm_op_hiddenP(op_216, T);
                                        tm_datastructures._csetf_tm_op_description(op_216, NIL);
                                        tm_datastructures._csetf_tm_op_description_args(op_216, NIL);
                                        if (NIL.isString()) {
                                            html_tm_editing.set_op_english(op_216, NIL);
                                        } else {
                                            html_tm_editing.set_op_english(op_216, UNPROVIDED);
                                        }
                                        ops = cons(op, ops);
                                    }
                                }
                            }
                            {
                                SubLObject cdolist_list_var = add_edit;
                                SubLObject thesaurus = NIL;
                                for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                                    {
                                        SubLObject op = tm_datastructures.get_tm_op();
                                        SubLObject op_217 = op;
                                        tm_datastructures._csetf_tm_op_opcode(op_217, $ADD);
                                        tm_datastructures._csetf_tm_op_relation(op_217, $$tmEditorFor);
                                        tm_datastructures._csetf_tm_op_inverseP(op_217, NIL);
                                        tm_datastructures._csetf_tm_op_args(op_217, list(user_constant, thesaurus));
                                        tm_datastructures._csetf_tm_op_thesaurus(op_217, tm_datastructures.$tm_mt$.getGlobalValue());
                                        tm_datastructures._csetf_tm_op_status(op_217, NIL);
                                        tm_datastructures._csetf_tm_op_verifyP(op_217, NIL);
                                        tm_datastructures._csetf_tm_op_hiddenP(op_217, T);
                                        tm_datastructures._csetf_tm_op_description(op_217, NIL);
                                        tm_datastructures._csetf_tm_op_description_args(op_217, NIL);
                                        if (NIL.isString()) {
                                            html_tm_editing.set_op_english(op_217, NIL);
                                        } else {
                                            html_tm_editing.set_op_english(op_217, UNPROVIDED);
                                        }
                                        ops = cons(op, ops);
                                    }
                                }
                            }
                            {
                                SubLObject cdolist_list_var = delete_edit;
                                SubLObject thesaurus = NIL;
                                for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                                    {
                                        SubLObject op = tm_datastructures.get_tm_op();
                                        SubLObject op_218 = op;
                                        tm_datastructures._csetf_tm_op_opcode(op_218, $DELETE);
                                        tm_datastructures._csetf_tm_op_relation(op_218, $$tmEditorFor);
                                        tm_datastructures._csetf_tm_op_inverseP(op_218, NIL);
                                        tm_datastructures._csetf_tm_op_args(op_218, list(user_constant, thesaurus));
                                        tm_datastructures._csetf_tm_op_thesaurus(op_218, tm_datastructures.$tm_mt$.getGlobalValue());
                                        tm_datastructures._csetf_tm_op_status(op_218, NIL);
                                        tm_datastructures._csetf_tm_op_verifyP(op_218, NIL);
                                        tm_datastructures._csetf_tm_op_hiddenP(op_218, T);
                                        tm_datastructures._csetf_tm_op_description(op_218, NIL);
                                        tm_datastructures._csetf_tm_op_description_args(op_218, NIL);
                                        if (NIL.isString()) {
                                            html_tm_editing.set_op_english(op_218, NIL);
                                        } else {
                                            html_tm_editing.set_op_english(op_218, UNPROVIDED);
                                        }
                                        ops = cons(op, ops);
                                    }
                                }
                            }
                            ops = nreverse(ops);
                            {
                                SubLObject cdolist_list_var = ops;
                                SubLObject op = NIL;
                                for (op = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , op = cdolist_list_var.first()) {
                                    html_tm_editing.check_and_perform_operation(op);
                                }
                            }
                        }
                    }
                }
                tm_datastructures.tm_change_init(tm_datastructures.$tm_user$.getDynamicValue(thread), level);
                tm_first_choices(UNPROVIDED);
            }
            return NIL;
        }
    }

    public static final SubLObject declare_html_thesaurus_file() {
        declareFunction("tm_image_directory", "TM-IMAGE-DIRECTORY", 0, 0, false);
        declareFunction("html_thesaurus_image", "HTML-THESAURUS-IMAGE", 1, 3, false);
        declareFunction("tm_link", "TM-LINK", 1, 3, false);
        declareFunction("tm_help_link", "TM-HELP-LINK", 0, 1, false);
        declareFunction("tm_debug", "TM-DEBUG", 0, 0, false);
        declareFunction("tm_no_debug", "TM-NO-DEBUG", 0, 0, false);
        declareFunction("tm_guess_fort", "TM-GUESS-FORT", 1, 0, false);
        declareFunction("tm_status_line", "TM-STATUS-LINE", 0, 0, false);
        declareFunction("tm_about_link", "TM-ABOUT-LINK", 0, 0, false);
        declareFunction("tm_about", "TM-ABOUT", 0, 1, false);
        declareFunction("tm_contacts_okP", "TM-CONTACTS-OK?", 0, 0, false);
        declareFunction("tm_footer", "TM-FOOTER", 0, 0, false);
        declareFunction("thesaurus_heading", "THESAURUS-HEADING", 0, 1, false);
        declareFunction("tm_advanced_page", "TM-ADVANCED-PAGE", 1, 0, false);
        declareFunction("tm_init_multi_submit_map", "TM-INIT-MULTI-SUBMIT-MAP", 0, 0, false);
        declareFunction("tm_generic_display_box", "TM-GENERIC-DISPLAY-BOX", 0, 1, false);
        declareFunction("tm_handle_generic_display_box", "TM-HANDLE-GENERIC-DISPLAY-BOX", 1, 0, false);
        declareFunction("tm_default_handler", "TM-DEFAULT-HANDLER", 0, 1, false);
        declareFunction("tm_report_editing_disabled", "TM-REPORT-EDITING-DISABLED", 0, 0, false);
        declareFunction("tm_note_edit_change", "TM-NOTE-EDIT-CHANGE", 1, 0, false);
        declareFunction("tm_message_to_user", "TM-MESSAGE-TO-USER", 2, 0, false);
        declareFunction("tm_note_unsupported_feature", "TM-NOTE-UNSUPPORTED-FEATURE", 2, 0, false);
        declareFunction("tm_note_unsupported_feature_handler", "TM-NOTE-UNSUPPORTED-FEATURE-HANDLER", 1, 0, false);
        declareFunction("tm_error", "TM-ERROR", 1, 6, false);
        declareFunction("tm_thesaurus_selection", "TM-THESAURUS-SELECTION", 1, 3, false);
        declareFunction("tm_browse_thesaurus_selection", "TM-BROWSE-THESAURUS-SELECTION", 0, 4, false);
        declareFunction("tm_edit_thesaurus_selection", "TM-EDIT-THESAURUS-SELECTION", 0, 4, false);
        declareFunction("tm_thesaurus_selection_int", "TM-THESAURUS-SELECTION-INT", 6, 0, false);
        declareFunction("tm_show_file_guts", "TM-SHOW-FILE-GUTS", 1, 0, false);
        declareFunction("tm_show_file", "TM-SHOW-FILE", 1, 0, false);
        declareFunction("cyc_thesaurus_herald", "CYC-THESAURUS-HERALD", 0, 0, false);
        declareFunction("client_herald", "CLIENT-HERALD", 0, 0, false);
        declareFunction("fritz_credits", "FRITZ-CREDITS", 0, 0, false);
        declareFunction("tm_welcome_page_login", "TM-WELCOME-PAGE-LOGIN", 0, 0, false);
        declareFunction("tm_welcome_page", "TM-WELCOME-PAGE", 0, 1, false);
        declareFunction("really_load_tm_init_file", "REALLY-LOAD-TM-INIT-FILE", 0, 0, false);
        declareFunction("tm_login_sorry_message", "TM-LOGIN-SORRY-MESSAGE", 0, 0, false);
        declareFunction("tm_welcome_page_handler", "TM-WELCOME-PAGE-HANDLER", 1, 0, false);
        declareFunction("tm_first_choices_login", "TM-FIRST-CHOICES-LOGIN", 0, 0, false);
        declareFunction("tm_invalid_string", "TM-INVALID-STRING", 1, 0, false);
        declareFunction("tm_check_password", "TM-CHECK-PASSWORD", 1, 0, false);
        declareFunction("set_password_page_title", "SET-PASSWORD-PAGE-TITLE", 0, 1, false);
        declareFunction("tm_check_password_1", "TM-CHECK-PASSWORD-1", 1, 0, false);
        declareFunction("tm_check_password_handler", "TM-CHECK-PASSWORD-HANDLER", 1, 0, false);
        declareFunction("tm_choose_password", "TM-CHOOSE-PASSWORD", 1, 0, false);
        declareFunction("tm_choose_password_try_again", "TM-CHOOSE-PASSWORD-TRY-AGAIN", 1, 0, false);
        declareFunction("tm_choose_password_guts", "TM-CHOOSE-PASSWORD-GUTS", 1, 0, false);
        declareFunction("tm_handle_choose_password", "TM-HANDLE-CHOOSE-PASSWORD", 1, 0, false);
        declareFunction("tm_bad_password", "TM-BAD-PASSWORD", 0, 1, false);
        declareFunction("tm_first_choices", "TM-FIRST-CHOICES", 0, 1, false);
        declareFunction("tm_ask_for_thesauri_page", "TM-ASK-FOR-THESAURI-PAGE", 0, 1, false);
        declareFunction("tm_handle_ask_for_thesauri", "TM-HANDLE-ASK-FOR-THESAURI", 1, 0, false);
        declareFunction("tm_set_preferences", "TM-SET-PREFERENCES", 0, 1, false);
        declareFunction("tm_store_preferences", "TM-STORE-PREFERENCES", 0, 0, false);
        declareFunction("tm_handle_preferences", "TM-HANDLE-PREFERENCES", 1, 0, false);
        declareFunction("tm_update_preferences_from_list", "TM-UPDATE-PREFERENCES-FROM-LIST", 1, 0, false);
        declareFunction("tm_color_preferences_handler", "TM-COLOR-PREFERENCES-HANDLER", 1, 0, false);
        declareFunction("tm_set_bg_color_default", "TM-SET-BG-COLOR-DEFAULT", 1, 0, false);
        declareFunction("tm_set_bg_color_hierarchical", "TM-SET-BG-COLOR-HIERARCHICAL", 1, 0, false);
        declareFunction("tm_set_bg_color_alphabetical", "TM-SET-BG-COLOR-ALPHABETICAL", 1, 0, false);
        declareFunction("tm_set_bg_color_full_record", "TM-SET-BG-COLOR-FULL-RECORD", 1, 0, false);
        declareFunction("determine_rgb", "DETERMINE-RGB", 3, 0, false);
        declareFunction("tm_change_user_type", "TM-CHANGE-USER-TYPE", 0, 1, false);
        declareFunction("tm_handle_change_user_type", "TM-HANDLE-CHANGE-USER-TYPE", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_html_thesaurus_file() {
        defparameter("*CHILD-COUNTER*", ZERO_INTEGER);
        defparameter("*TM-EDITING-MT-STRING*", NIL);
        defparameter("*TM-CURRENT-RELATION-MAP*", NIL);
        defparameter("*TM-IMAGE-DIRECTORY*", NIL);
        defparameter("*TM-HELP-DIRECTORY-URL*", NIL);
        defparameter("*TM-HELP-DEFAULT-PAGE*", $str_alt5$tm_missing_help);
        defparameter("*TM-HELP-IMAGE*", $list_alt6);
        defparameter("*TM-HELP-ICON*", $list_alt6);
        defparameter("*TM-ALPHABETICAL-ICON*", $list_alt7);
        defparameter("*TM-HIERARCHICAL-ICON*", $list_alt8);
        defparameter("*TM-FULL-RECORD-ICON*", $list_alt9);
        defparameter("*TM-AUDIT-ICON*", $list_alt10);
        defparameter("*TM-CORRELATE-BUTTON*", $list_alt11);
        defparameter("*TM-UNCORRELATE-BUTTON*", $list_alt12);
        defparameter("*TM-SWAP-PT-UF-BUTTON*", $list_alt13);
        defparameter("*TM-IMPORT-UFS-BUTTON*", $list_alt14);
        defparameter("*TM-CYC-ICON*", $list_alt15);
        defparameter("*TM-ALPHA-PAGEUP-ICON*", $list_alt16);
        defparameter("*TM-ALPHA-PAGEDN-ICON*", $list_alt17);
        defparameter("*TM-HD-RELATION-ICON*", $list_alt18);
        defparameter("*TM-ALPHA-SHOW-VARIANTS-ICON*", $list_alt19);
        defparameter("*TM-ALPHA-DONT-SHOW-VARIANTS-ICON*", $list_alt20);
        defparameter("*TM-LINK-TABLE*", $list_alt21);
        deflexical("*TM-MULTI-SUBMIT-MAP*", NIL != boundp($tm_multi_submit_map$) ? ((SubLObject) ($tm_multi_submit_map$.getGlobalValue())) : NIL);
        defparameter("*HEX-CONVERSION-MAP*", $$$0123456789ABCDEF);
        return NIL;
    }

    public static final SubLObject setup_html_thesaurus_file() {
                utilities_macros.register_html_state_variable($child_counter$);
        utilities_macros.register_html_state_variable($tm_editing_mt_string$);
        utilities_macros.register_html_state_variable($tm_current_relation_map$);
        html_macros.note_html_handler_function(TM_ABOUT);
        html_macros.note_html_handler_function(TM_ADVANCED_PAGE);
        subl_macro_promotions.declare_defglobal($tm_multi_submit_map$);
        html_macros.note_html_handler_function(TM_HANDLE_GENERIC_DISPLAY_BOX);
        html_macros.note_html_handler_function(TM_DEFAULT_HANDLER);
        html_macros.note_html_handler_function(TM_NOTE_UNSUPPORTED_FEATURE_HANDLER);
        html_macros.note_html_handler_function(TM_SHOW_FILE);
        html_macros.note_html_handler_function(TM_WELCOME_PAGE);
        html_macros.note_html_handler_function(TM_WELCOME_PAGE_HANDLER);
        html_macros.note_html_handler_function(TM_CHECK_PASSWORD_HANDLER);
        html_macros.note_html_handler_function(TM_HANDLE_CHOOSE_PASSWORD);
        html_macros.note_html_handler_function(TM_FIRST_CHOICES);
        html_macros.note_html_handler_function(TM_HANDLE_ASK_FOR_THESAURI);
        html_macros.note_html_handler_function(TM_SET_PREFERENCES);
        html_macros.note_html_handler_function(TM_HANDLE_PREFERENCES);
        html_macros.note_html_handler_function(TM_COLOR_PREFERENCES_HANDLER);
        html_macros.note_html_handler_function(TM_SET_BG_COLOR_DEFAULT);
        html_macros.note_html_handler_function(TM_SET_BG_COLOR_HIERARCHICAL);
        html_macros.note_html_handler_function(TM_SET_BG_COLOR_ALPHABETICAL);
        html_macros.note_html_handler_function(TM_SET_BG_COLOR_FULL_RECORD);
        html_macros.note_html_handler_function(TM_CHANGE_USER_TYPE);
        html_macros.note_html_handler_function(TM_HANDLE_CHANGE_USER_TYPE);
        return NIL;
    }

    // // Internal Constants
    public static final SubLSymbol $child_counter$ = makeSymbol("*CHILD-COUNTER*");

    public static final SubLSymbol $tm_editing_mt_string$ = makeSymbol("*TM-EDITING-MT-STRING*");

    public static final SubLSymbol $tm_current_relation_map$ = makeSymbol("*TM-CURRENT-RELATION-MAP*");

    static private final SubLString $str_alt3$_Atm_img_ = makeString("~Atm-img/");

    static private final SubLString $$$none = makeString("none");

    static private final SubLString $str_alt5$tm_missing_help = makeString("tm-missing-help");

    static private final SubLList $list_alt6 = list(makeString("tm-help.gif"), makeString("[Help]"));

    static private final SubLList $list_alt7 = list(makeString("tm-alpha.gif"), makeString("[A]"));

    static private final SubLList $list_alt8 = list(makeString("tm-hier.gif"), makeString("[H]"));

    static private final SubLList $list_alt9 = list(makeString("tm-full.gif"), makeString("[+]"));

    static private final SubLList $list_alt10 = list(makeString("tm-audit.gif"), makeString("[?]"));

    static private final SubLList $list_alt11 = list(makeString("tm-correlate-concept.gif"), makeString("[Correlate Concept]"));

    static private final SubLList $list_alt12 = list(makeString("tm-uncorrelate.gif"), makeString("[Uncorrelate]"));

    static private final SubLList $list_alt13 = list(makeString("tm-swap-pt-uf.gif"), makeString("[Swap PT-UF]"));

    static private final SubLList $list_alt14 = list(makeString("tm-import-ufs.gif"), makeString("[Import UFs]"));

    static private final SubLList $list_alt15 = list(makeString("tm-cyc.gif"), makeString("[Cyc Concept]"));

    static private final SubLList $list_alt16 = list(makeString("tm-pageup.gif"), makeString("[Page Up]"));

    static private final SubLList $list_alt17 = list(makeString("tm-pagedn.gif"), makeString("[Page Down]"));

    static private final SubLList $list_alt18 = list(makeString("tm-rel.gif"), makeString("[R]"));

    static private final SubLList $list_alt19 = list(makeString("tm-show-alt.gif"), makeString("[Show Alternate Terms]"));

    static private final SubLList $list_alt20 = list(makeString("tm-no-alt.gif"), makeString("[Don't Show Alternate Terms]"));

    static private final SubLList $list_alt21 = list(new SubLObject[]{ list(makeKeyword("UTILITIES"), makeString("tm-utilities-page"), makeString("[Utilities]"), makeString("tm-utilities.gif")), list(makeKeyword("GENERAL-PREFERENCES"), makeString("tm-set-preferences"), makeString("[General Preferences]"), makeString("tm-preferences.gif")), list(makeKeyword("FIRST-CHOICES"), makeString("tm-first-choices"), makeString("[Main Menu]"), makeString("tm-main-menu.gif")), list(makeKeyword("DELETE-TERM"), makeString("tm-delete-term"), makeString("[Delete Term]"), makeString("tm-delete-term.gif")), list(makeKeyword("RENAME-TERM"), makeString("tm-rename-term"), makeString("[Rename Term]"), makeString("tm-rename-term.gif")), list(makeKeyword("OUTPUT-THESAURUS"), makeString("tm-output-thesaurus"), makeString("[Output Thesaurus]")), list(makeKeyword("STOPLIST-MANAGER"), makeString("tm-manage-stoplists"), makeString("[Stoplist Manager]")), list(makeKeyword("ADD-TERM"), makeString("tm-add-term"), makeString("[Add New Term]"), makeString("tm-add-term.gif")), list(makeKeyword("QUICK-EDIT"), makeString("tm-quick-edit-page"), makeString("[Quick Edit]"), makeString("tm-quick-edit.gif")), list(makeKeyword("DEFINE-RELATION"), makeString("tm-define-relation"), makeString("[Define Relation]"), makeString("tm-define-relation.gif")), list(makeKeyword("SEARCH"), makeString("tm-search-page"), makeString("[Search]"), makeString("tm-search.gif")), list(makeKeyword("ADVANCED"), makeString("tm-advanced-page"), makeString("[More ...]"), makeString("tm-more.gif")), list(makeKeyword("CONVERT-PT-UF"), makeString("tm-convert-pt-uf"), makeString("[Convert PT-UF]"), makeString("tm-convert-pt-uf.gif")), list(makeKeyword("PROMOTE-UF-PT"), makeString("tm-promote-uf-pt"), makeString("[Promote UF-PT]"), makeString("tm-promote-uf-pt.gif")), list(makeKeyword("CORRELATE"), makeString("tm-correlate"), makeString("[Correlate]"), makeString("tm-correlate.gif")), list(makeKeyword("CORRELATE-CONCEPT"), makeString("tm-correlate-concept-page"), makeString("[Correlate Concept]"), makeString("tm-correlate-concept.gif")), list(makeKeyword("UNCORRELATE"), makeString("tm-uncorrelate"), makeString("[Uncorrelate]"), makeString("tm-uncorrelate.gif")), list(makeKeyword("CREATE-THESAURUS"), makeString("tm-create-thesaurus"), makeString("[Create Thesaurus]"), makeString("tm-create-thesaurus.gif")), list(makeKeyword("RENAME-THESAURUS"), makeString("tm-rename-thesaurus"), makeString("[Rename Thesaurus]"), makeString("tm-rename-thesaurus.gif")), list(makeKeyword("DELETE-THESAURUS"), makeString("tm-delete-thesaurus"), makeString("[Delete Thesaurus]"), makeString("tm-delete-thesaurus.gif")), list(makeKeyword("COPY-THESAURUS"), makeString("tm-copy-thesaurus"), makeString("[Copy Thesaurus]"), makeString("tm-copy-thesaurus.gif")), list(makeKeyword("INTEGRITY-CHECK"), makeString("tm-integrity-check"), makeString("[Integrity Check]"), makeString("tm-integrity.gif")), list(makeKeyword("INTEGRITY-CHECK-CON"), makeString("tm-integrity-check-concept-chooser"), makeString("[Integrity Check Concept]"), makeString("tm-integrity-check-concept.gif")), list(makeKeyword("COLOR-PREFERENCES"), makeString("tm-color-preferences-handler"), makeString("[Set Color Preferences]")), list(makeKeyword("BG-COLOR-DEFAULT"), makeString("tm-set-bg-color-default&~a"), makeString("[Set Default BG Color]")), list(makeKeyword("BG-COLOR-HIERARCHICAL"), makeString("tm-set-bg-color-hierarchical&~a"), makeString("[Set Hierarchical BG Color]")), list(makeKeyword("BG-COLOR-ALPHABETICAL"), makeString("tm-set-bg-color-alphabetical&~a"), makeString("[Set Alphabetical BG Color]")), list(makeKeyword("BG-COLOR-FULL-RECORD"), makeString("tm-set-bg-color-full-record&~a"), makeString("[Set Full Record BG Color]")), list(makeKeyword("FULL-EDIT"), makeString("tm-full-record-with-editing"), makeString("[Full Term Edit]"), makeString("tm-full-edit.gif")), list(makeKeyword("THESAURI-MERGED"), makeString("tm-fd"), makeString("[Thesauri Merged]"), makeString("tm-thesauri-merged.gif")), list(makeKeyword("THESAURI-SEPARATE"), makeString("tm-fd"), makeString("[Thesauri Separate]"), makeString("tm-thesauri-separate.gif")), list(makeKeyword("VIEW-RELATIONS"), makeString("tm-browse-relations-entry"), makeString("[View Relations]"), makeString("tm-view-relations.gif")), list(makeKeyword("STATUS"), makeString("tm-show-all-thinking-status"), makeString("[Status]"), makeString("tm-status.gif")), list(makeKeyword("ABORT"), makeString("tm-thinking-abort"), makeString("[Abort]")), list(makeKeyword("FORGET"), makeString("tm-thinking-forget"), makeString("[Forget]")), list(makeKeyword("SWAP-PT-UF"), makeString("tm-swap-pt-uf"), makeString("[Swap PT-UF]"), makeString("tm-swap-pt-uf.gif")), list(makeKeyword("IMPORT-UFS"), makeString("tm-import-ufs"), makeString("[Import UFs]"), makeString("tm-import-ufs.gif")), list(makeKeyword("SOURCE"), makeString("tm-ssa"), makeString("[?]"), makeString("tm-audit.gif")), list(makeKeyword("ALPHA-PAGEUP"), makeString("tm-ad-pageup"), makeString("[Page Up]"), makeString("tm-pageup.gif")), list(makeKeyword("ALPHA-PAGEDN"), makeString("tm-ad-pagedn"), makeString("[Page Down]"), makeString("tm-pagedn.gif")), list(makeKeyword("HANDLE-DUMP-THESAURUS"), makeString("tm-handle-dump-thesaurus"), makeString("here")), list(makeKeyword("ADD-ACTIVE-REL"), makeString("tm-add-active-rel"), makeString("[Make Active]"), makeString("tm-add-active-rel.gif")), list(makeKeyword("REMOVE-ACTIVE-REL"), makeString("tm-remove-active-rel"), makeString("[Deactivate]"), makeString("tm-remove-active-rel.gif")), list(makeKeyword("EDIT-RELATION"), makeString("tm-edit-relation-page"), makeString("[Edit]"), makeString("tm-edit2.gif")), list(makeKeyword("KILL-RELATION"), makeString("tm-kill-rel"), makeString("[Kill]"), makeString("tm-kill-rel.gif")), list(makeKeyword("RESTRICT-THESAURI"), makeString("tm-restrict-individual-relation"), makeString("[Set Thesauri]"), makeString("tm-set-thesauri.gif")), list(makeKeyword("RELATION-USAGE"), makeString("tm-relation-usage"), makeString("[Show Usage]"), makeString("tm-relation-usage.gif")), list(makeKeyword("HIERARCHICAL"), makeString("tm-hd")), list(makeKeyword("SELECTED-HIERARCHICAL"), makeString("tm-selected-hierarchical-link")), list(makeKeyword("ADD-HIERARCHICAL"), makeString("tm-add-thesaurus-hierarchical-link")), list(makeKeyword("SWITCH-HIERARCHICAL"), makeString("tm-swh")), list($HOME, makeString("tm-basic-home-1"), makeString("[Home]"), makeString("tm-home.gif")), list(makeKeyword("READ-ME"), makeString("tm-basic-read-me"), makeString("[Introduction]"), makeString("tm-intro.gif")), list(makeKeyword("ADVANCED-INTERFACE"), makeString("tm-switch-to-advanced"), makeString("[Advanced Mode]"), makeString("tm-advanced-mode.gif")), list(makeKeyword("BASIC-INTERFACE"), makeString("tm-switch-to-basic"), makeString("[Basic Mode]"), makeString("tm-basic-mode.gif")), list(makeKeyword("CHOOSE-THESAURUS"), makeString("tm-basic-choose-thesaurus"), makeString("[Change Thesaurus]"), makeString("tm-change-thesaurus.gif")) });

    private static final SubLSymbol $USE_IMAGES = makeKeyword("USE-IMAGES");

    static private final SubLList $list_alt23 = list(makeKeyword("BG-COLOR-DEFAULT"), makeKeyword("BG-COLOR-HIERARCHICAL"), makeKeyword("BG-COLOR-ALPHABETICAL"), makeKeyword("BG-COLOR-FULL-RECORD"));

    static private final SubLString $str_alt24$_A_ = makeString("~A?");

    static private final SubLList $list_alt25 = list(new SubLObject[]{ makeKeyword("FULL-EDIT"), makeKeyword("THESAURI-MERGED"), makeKeyword("THESAURI-SEPARATE"), makeKeyword("UNCORRELATE"), makeKeyword("ADD-ACTIVE-REL"), makeKeyword("REMOVE-ACTIVE-REL"), makeKeyword("EDIT-RELATION"), makeKeyword("KILL-RELATION"), makeKeyword("RELATION-USAGE"), makeKeyword("SWAP-PT-UF"), makeKeyword("IMPORT-UFS"), makeKeyword("CORRELATE-CONCEPT"), makeKeyword("RESTRICT-THESAURI"), makeKeyword("FORGET"), makeKeyword("ABORT") });

    static private final SubLList $list_alt26 = list(makeSymbol("KIND"), makeSymbol("LINK-URL"), makeSymbol("ALT"), makeSymbol("&OPTIONAL"), makeSymbol("IMAGE"));

    static private final SubLString $str_alt27$_ = makeString("|");

    static private final SubLList $list_alt28 = list(makeKeyword("HIERARCHICAL"), makeKeyword("SELECTED-HIERARCHICAL"), makeKeyword("ADD-HIERARCHICAL"), makeKeyword("SWITCH-HIERARCHICAL"));

    static private final SubLList $list_alt29 = list(makeSymbol("KIND"), makeSymbol("LINK-URL"));

    static private final SubLList $list_alt30 = list(makeKeyword("SOURCE"), makeKeyword("ALPHA-PAGEUP"), makeKeyword("ALPHA-PAGEDN"));



    private static final SubLSymbol $SHOW_FILE = makeKeyword("SHOW-FILE");

    static private final SubLString $str_alt33$tm_show_file_ = makeString("tm-show-file|");

    private static final SubLSymbol $CONCEPT_DESCRIPTION = makeKeyword("CONCEPT-DESCRIPTION");

    static private final SubLString $str_alt35$tm_concept_description_id__A = makeString("tm-concept-description|id=~A");

    private static final SubLSymbol $CYC_CONCEPT = makeKeyword("CYC-CONCEPT");



    static private final SubLString $str_alt38$tm_ad_ = makeString("tm-ad|");

    private static final SubLSymbol $FULL_RECORD = makeKeyword("FULL-RECORD");

    static private final SubLString $str_alt40$tm_fd_ = makeString("tm-fd|");

    private static final SubLSymbol $DUMP_THESAURUS = makeKeyword("DUMP-THESAURUS");

    static private final SubLString $str_alt42$tm_dump_thesaurus = makeString("tm-dump-thesaurus");

    private static final SubLSymbol $HD_RELATION = makeKeyword("HD-RELATION");

    static private final SubLString $str_alt44$tm_hd_relation_ = makeString("tm-hd-relation|");

    private static final SubLSymbol $ALPHA_STATE_TOGGLE = makeKeyword("ALPHA-STATE-TOGGLE");

    static private final SubLString $str_alt46$tm_ad_toggle_ = makeString("tm-ad-toggle|");

    private static final SubLSymbol $ALPHABETICAL_SHOW_USE_FORS = makeKeyword("ALPHABETICAL-SHOW-USE-FORS");



    static private final SubLString $str_alt49$_html = makeString(".html");

    static private final SubLString $str_alt50$_a_a_a = makeString("~a~a~a");

    static private final SubLString $str_alt51$ = makeString("");

    static private final SubLString $str_alt52$help_page = makeString("help-page");

    private static final SubLSymbol $SEPARATE_HELP_PAGE = makeKeyword("SEPARATE-HELP-PAGE");



    static private final SubLString $$$None = makeString("None");

    private static final SubLSymbol $THESAURUS = makeKeyword("THESAURUS");

    static private final SubLString $str_alt57$tm_at__a = makeString("tm-at|~a");

    private static final SubLSymbol $SHOW_THESAURI = makeKeyword("SHOW-THESAURI");

    static private final SubLString $str_alt59$tm_show_thesauri = makeString("tm-show-thesauri");

    private static final SubLSymbol $TERM_IN_THESAURUS = makeKeyword("TERM-IN-THESAURUS");

    static private final SubLString $str_alt61$tm_tit_ = makeString("tm-tit|");



    static private final SubLString $str_alt63$tm_rel_ = makeString("tm-rel|");

    private static final SubLSymbol $OUTPUT_FILTER = makeKeyword("OUTPUT-FILTER");

    static private final SubLString $str_alt65$tm_output_filter_page__A = makeString("tm-output-filter-page|~A");

    private static final SubLSymbol $EDIT_FILTER = makeKeyword("EDIT-FILTER");

    static private final SubLString $str_alt67$tm_edit_output_filter__a = makeString("tm-edit-output-filter|~a");

    static private final SubLString $$$Edit_this_Filter = makeString("Edit this Filter");

    private static final SubLSymbol $DELETE_FILTER = makeKeyword("DELETE-FILTER");

    static private final SubLString $str_alt70$tm_delete_output_filter__a = makeString("tm-delete-output-filter|~a");

    static private final SubLString $$$Delete_this_Filter = makeString("Delete this Filter");

    private static final SubLSymbol $ADD_OR_EDIT_COMMENT = makeKeyword("ADD-OR-EDIT-COMMENT");

    static private final SubLString $str_alt73$tm_add_or_edit_comment_id_ = makeString("tm-add-or-edit-comment|id=");

    static private final SubLString $str_alt74$_edit_ = makeString("|edit=");

    static private final SubLString $str_alt75$_Edit_the_comment_ = makeString("[Edit the comment]");

    static private final SubLString $str_alt76$_Add_a_comment_ = makeString("[Add a comment]");

    private static final SubLSymbol $SET_FILTER = makeKeyword("SET-FILTER");

    static private final SubLString $str_alt78$tm_change_filter__a__s = makeString("tm-change-filter|~a|~s");

    static private final SubLString $str_alt79$_Set_the__A_Filter_ = makeString("[Set the ~A Filter]");

    static private final SubLString $str_alt80$_a = makeString("~a");

    private static final SubLSymbol $SET_CASE_STYLE = makeKeyword("SET-CASE-STYLE");

    static private final SubLString $str_alt82$tm_set_case_style__a = makeString("tm-set-case-style|~a");

    static private final SubLString $str_alt83$_Set_the_Default_Case_Style_ = makeString("[Set the Default Case Style]");

    private static final SubLSymbol $SET_OR_VIEW_INTEGRITY_RULES = makeKeyword("SET-OR-VIEW-INTEGRITY-RULES");

    static private final SubLString $str_alt85$_ = makeString("[");

    static private final SubLString $str_alt86$tm_choose_integrity_modules_to_us = makeString("tm-choose-integrity-modules-to-use|~a");

    static private final SubLString $$$Choose = makeString("Choose");

    static private final SubLString $str_alt88$___ = makeString(" / ");

    static private final SubLString $str_alt89$tm_integrity_module_info_page__a = makeString("tm-integrity-module-info-page|~a");

    static private final SubLString $$$View = makeString("View");

    static private final SubLString $str_alt91$_Integrity_Rules_for_Thesaurus_ = makeString(" Integrity Rules for Thesaurus]");

    private static final SubLSymbol $SET_OR_VIEW_APPLICABLE_RELATIONS = makeKeyword("SET-OR-VIEW-APPLICABLE-RELATIONS");

    private static final SubLSymbol $EDIT_THESAURI = makeKeyword("EDIT-THESAURI");

    static private final SubLString $str_alt94$tm_restrict_relations_for_thesaur = makeString("tm-restrict-relations-for-thesaurus|~a");

    static private final SubLString $str_alt95$tm_browse_restriction_relations_e = makeString("tm-browse-restriction-relations-entry|~a");

    static private final SubLString $str_alt96$_Applicable_Relations_for_Thesaur = makeString(" Applicable Relations for Thesaurus]");

    private static final SubLSymbol $TOGGLE_RELEASE_STATUS = makeKeyword("TOGGLE-RELEASE-STATUS");

    static private final SubLString $str_alt98$tm_change_released_status__a = makeString("tm-change-released-status|~a");

    static private final SubLString $str_alt99$_Retract_the_Release_of_this_Thes = makeString("[Retract the Release of this Thesaurus]");

    static private final SubLString $str_alt100$_Release_this_Thesaurus_ = makeString("[Release this Thesaurus]");

    static private final SubLString $str_alt101$_A = makeString("~A");

    private static final SubLSymbol $SHOW_STATUS_LINE = makeKeyword("SHOW-STATUS-LINE");

    static private final SubLString $str_alt103$User__ = makeString("User: ");

    private static final SubLSymbol $SELECTED_THESAURUS = makeKeyword("SELECTED-THESAURUS");

    private static final SubLSymbol $THESAURI = makeKeyword("THESAURI");

    static private final SubLString $str_alt106$Thesaur_a = makeString("Thesaur~a");

    static private final SubLString $str_alt107$us_ = makeString("us:");

    static private final SubLString $str_alt108$i_ = makeString("i:");

    static private final SubLString $str_alt109$Selected_ = makeString("Selected ");

    static private final SubLString $str_alt110$Browsing_ = makeString("Browsing ");

    static private final SubLString $str_alt111$_ = makeString(" ");

    static private final SubLString $str_alt112$__ = makeString(", ");

    static private final SubLString $str_alt113$None__ = makeString("None  ");

    static private final SubLString $str_alt114$limited_editor = makeString("limited-editor");

    private static final SubLSymbol $EDITING_ENABLED = makeKeyword("EDITING-ENABLED");

    static private final SubLString $str_alt116$Editing_ = makeString("Editing ");

    static private final SubLString $$$Editing_Off = makeString("Editing Off");

    static private final SubLString $str_alt118$tm_about = makeString("tm-about");

    static private final SubLString $str_alt119$About_ = makeString("About ");

    static private final SubLString $str_alt120$About__A = makeString("About ~A");

    static private final SubLString $str_alt121$Copyright__copy__1996___2002_ = makeString("Copyright &copy; 1996 - 2002 ");

    static private final SubLString $str_alt122$Cycorp__Inc_ = makeString("Cycorp, Inc.");

    static private final SubLString $str_alt123$___All_rights_reserved_ = makeString(".  All rights reserved.");

    static private final SubLString $str_alt124$The_ = makeString("The ");

    static private final SubLString $str_alt125$_is_browsed_and_maintained_using_ = makeString(" is browsed and maintained using ");

    static private final SubLString $str_alt126$__an_advanced_thesaurus_managemen = makeString(", an advanced thesaurus management tool based on the ");

    static private final SubLString $str_alt127$Cyc__reg_ = makeString("Cyc &reg;");

    static private final SubLString $str_alt128$_technology_ = makeString(" technology.");

    static private final SubLString $str_alt129$Hit_your_browser_s__Back__button_ = makeString("Hit your browser\'s \"Back\" button to return to the previous page.");

    static private final SubLString $str_alt130$This_computer_program_is_protecte = makeString("This computer program is protected by copyright laws and international treaties.  Unauthorized reproduction or distribution of this program, or any portion of it, may result in civil or criminal penalties, and will be prosecuted to the full extent of the law.");

    private static final SubLSymbol TM_ABOUT = makeSymbol("TM-ABOUT");



    static private final SubLList $list_alt133 = list(makeSymbol("NAME"), makeSymbol("ADDRESS"));

    static private final SubLString $str_alt134$For_questions_or_comments__contac = makeString("For questions or comments, contact ");

    static private final SubLString $str_alt135$_or_ = makeString(" or ");

    static private final SubLString $str_alt136$_ = makeString(".");

    static private final SubLString $str_alt137$your_thesaurus_administrator_ = makeString("your thesaurus administrator.");

    static private final SubLString $str_alt138$_gives_information_about_this_sof = makeString(" gives information about this software.");



    static private final SubLList $list_alt140 = list(makeString("tm-add-term"), makeString("tm-delete-term"));

    private static final SubLSymbol $FIRST_CHOICES = makeKeyword("FIRST-CHOICES");

    static private final SubLString $str_alt142$tm_set_preferences = makeString("tm-set-preferences");

    private static final SubLSymbol $GENERAL_PREFERENCES = makeKeyword("GENERAL-PREFERENCES");

    static private final SubLString $str_alt144$tm_utilities_page = makeString("tm-utilities-page");

    static private final SubLString $str_alt145$advanced_user = makeString("advanced-user");

    private static final SubLSymbol $UTILITIES = makeKeyword("UTILITIES");

    static private final SubLString $str_alt147$tm_search_page = makeString("tm-search-page");



    private static final SubLSymbol $BASIC_INTERFACE = makeKeyword("BASIC-INTERFACE");

    static private final SubLString $str_alt150$tm_advanced_page = makeString("tm-advanced-page");

    static private final SubLString $str_alt151$full_editor = makeString("full-editor");

    private static final SubLSymbol $ADVANCED = makeKeyword("ADVANCED");

    static private final SubLString $str_alt153$tm_quick_edit_page = makeString("tm-quick-edit-page");

    private static final SubLSymbol $QUICK_EDIT = makeKeyword("QUICK-EDIT");

    static private final SubLString $str_alt155$tm_add_term = makeString("tm-add-term");

    private static final SubLSymbol $ADD_TERM = makeKeyword("ADD-TERM");

    static private final SubLString $str_alt157$tm_delete_term = makeString("tm-delete-term");

    private static final SubLSymbol $DELETE_TERM = makeKeyword("DELETE-TERM");

    static private final SubLString $str_alt159$tm_rename_term = makeString("tm-rename-term");

    private static final SubLSymbol $RENAME_TERM = makeKeyword("RENAME-TERM");

    private static final SubLSymbol $VIEW_RELATIONS = makeKeyword("VIEW-RELATIONS");

    static private final SubLList $list_alt162 = list(makeString("tm-add-term"), makeString("tm-delete-term"), makeString("tm-first-choices"), makeString("tm-search-page"), makeString("tm-handle-search-page"));

    static private final SubLString $$$More_Editing = makeString("More Editing");

    static private final SubLString $str_alt164$Sorry__you_do_not_have_permission = makeString("Sorry, you do not have permission to access this page.");

    private static final SubLSymbol $CONVERT_PT_UF = makeKeyword("CONVERT-PT-UF");

    static private final SubLString $$$administrator = makeString("administrator");

    private static final SubLSymbol $DEFINE_RELATION = makeKeyword("DEFINE-RELATION");

    private static final SubLSymbol $CORRELATE = makeKeyword("CORRELATE");

    private static final SubLSymbol $INTEGRITY_CHECK = makeKeyword("INTEGRITY-CHECK");

    private static final SubLSymbol $INTEGRITY_CHECK_CON = makeKeyword("INTEGRITY-CHECK-CON");

    private static final SubLSymbol $CREATE_THESAURUS = makeKeyword("CREATE-THESAURUS");

    private static final SubLSymbol $RENAME_THESAURUS = makeKeyword("RENAME-THESAURUS");

    private static final SubLSymbol $DELETE_THESAURUS = makeKeyword("DELETE-THESAURUS");

    private static final SubLSymbol $COPY_THESAURUS = makeKeyword("COPY-THESAURUS");

    private static final SubLSymbol TM_ADVANCED_PAGE = makeSymbol("TM-ADVANCED-PAGE");

    public static final SubLSymbol $tm_multi_submit_map$ = makeSymbol("*TM-MULTI-SUBMIT-MAP*");

    static private final SubLString $str_alt177$_Atm_multibutton_gif = makeString("~Atm-multibutton.gif");

    static private final SubLString $$$mode = makeString("mode");

    static private final SubLString $$$hierarchy = makeString("hierarchy");

    static private final SubLList $list_alt180 = list(list(list(ONE_INTEGER, makeInteger(28)), NIL, makeString("hierarchy")), list(list(makeInteger(29), makeInteger(56)), NIL, makeString("alpha")), list(list(makeInteger(57), makeInteger(84)), NIL, makeString("full")));



    public static final SubLInteger $int$40 = makeInteger(40);

    static private final SubLString $str_alt183$tm_handle_generic_display_box = makeString("tm-handle-generic-display-box");



    static private final SubLString $$$HIER = makeString("HIER");

    static private final SubLString $$$alpha = makeString("alpha");

    static private final SubLString $$$ALPHA = makeString("ALPHA");

    static private final SubLString $$$full = makeString("full");

    static private final SubLString $$$FULL = makeString("FULL");

    static private final SubLString $$$Show = makeString("Show");

    static private final SubLString $$$term = makeString("term");

    static private final SubLString $str_alt192$No_thesauri_are_currently_active_ = makeString("No thesauri are currently active.  Please visit the Preferences page to choose browsing thesauri.");

    static private final SubLString $str_alt193$You_must_enter_a_term_in_the_box_ = makeString("You must enter a term in the box before hitting ENTER or RETURN, or clicking on a symbol.");



    static private final SubLString $str_alt195$No_term_was_specified_for__a__cli = makeString("No term was specified for ~a; click on one of the following top terms to browse the hierarchy.");

    static private final SubLString $$$Full_Term_Display = makeString("Full Term Display");

    static private final SubLString $$$Hierarchy_Display = makeString("Hierarchy Display");

    private static final SubLSymbol $SEARCH_RELATIONS = makeKeyword("SEARCH-RELATIONS");



    private static final SubLSymbol SIGN_CONCEPT = makeSymbol("SIGN-CONCEPT");

    public static final SubLSymbol $kw201$FD_SEPARATE_ = makeKeyword("FD-SEPARATE?");

    private static final SubLSymbol TM_HANDLE_GENERIC_DISPLAY_BOX = makeSymbol("TM-HANDLE-GENERIC-DISPLAY-BOX");

    private static final SubLSymbol $BASIC = makeKeyword("BASIC");

    private static final SubLSymbol $INTERFACE = makeKeyword("INTERFACE");

    private static final SubLSymbol TM_DEFAULT_HANDLER = makeSymbol("TM-DEFAULT-HANDLER");

    static private final SubLString $str_alt206$Sorry__thesaurus_editing_is_disab = makeString("Sorry, thesaurus editing is disabled globally.");

    static private final SubLString $str_alt207$Sorry__thesaurus_editing_is_curre = makeString("Sorry, thesaurus editing is currently disabled.");

    static private final SubLString $str_alt208$If_you_have_editing_privileges__y = makeString("If you have editing privileges, you may enable editing on the Preferences page.");

    static private final SubLString $$$Edit_Notification = makeString("Edit Notification");

    static private final SubLString $str_alt210$_a_operation_completed = makeString("~a operation completed");

    static private final SubLString $str_alt211$tm_note_edit_change = makeString("tm-note-edit-change");

    static private final SubLString $str_alt212$tm_message_to_user = makeString("tm-message-to-user");

    static private final SubLString $$$Unsupported_Feature = makeString("Unsupported Feature");

    static private final SubLString $str_alt214$_a_operation_noted = makeString("~a operation noted");

    static private final SubLString $str_alt215$tm_note_unsupported_feature = makeString("tm-note-unsupported-feature");

    private static final SubLSymbol TM_NOTE_UNSUPPORTED_FEATURE_HANDLER = makeSymbol("TM-NOTE-UNSUPPORTED-FEATURE-HANDLER");

    static private final SubLString $str_alt217$_A_Error = makeString("~A Error");

    static private final SubLString $str_alt218$tm_basic_error = makeString("tm-basic-error");

    static private final SubLString $str_alt219$tm_error = makeString("tm-error");

    static private final SubLString $$$thesauri = makeString("thesauri");

    private static final SubLSymbol $EDITABLE_THESAURI = makeKeyword("EDITABLE-THESAURI");

    static private final SubLString $str_alt222$_ALL_ = makeString("[ALL]");

    static private final SubLString $str_alt223$File__A_not_found = makeString("File ~A not found");

    static private final SubLString $str_alt224$File__ = makeString("File: ");

    static private final SubLString $str_alt225$Size__ = makeString("Size: ");

    static private final SubLString $str_alt226$_bytes = makeString(" bytes");



    static private final SubLString $str_alt228$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLList $list_alt229 = list(makeSymbol("PATHNAME"));

    static private final SubLString $$$File_Contents = makeString("File Contents");

    static private final SubLString $str_alt231$tm_show_file = makeString("tm-show-file");

    static private final SubLString $str_alt232$The_file__S_was_not_found_ = makeString("The file ~S was not found.");

    private static final SubLSymbol TM_SHOW_FILE = makeSymbol("TM-SHOW-FILE");

    static private final SubLString $str_alt234$_reg_ = makeString("&reg;");

    static private final SubLString $str_alt235$_is_an_advanced_information_produ = makeString(" is an advanced information product of ");

    static private final SubLString $str_alt236$_logo_ = makeString(" logo]");

    static private final SubLString $str_alt237$Visit_the_ = makeString("Visit the ");

    static private final SubLString $str_alt238$_homepage_ = makeString(" homepage.");

    static private final SubLString $$$Fritz_Lehmann = makeString("Fritz Lehmann");

    static private final SubLString $str_alt240$fritz_cyc_com = makeString("fritz@cyc.com");

    static private final SubLString $str_alt241$Welcome_to__a_ = makeString("Welcome to ~a!");

    static private final SubLString $str_alt242$Thesaurus_Login_ID__ = makeString("Thesaurus Login ID: ");

    static private final SubLString $str_alt243$tm_welcome_page_handler = makeString("tm-welcome-page-handler");

    static private final SubLString $$$username = makeString("username");

    static private final SubLString $$$Login = makeString("Login");

    private static final SubLSymbol TM_WELCOME_PAGE = makeSymbol("TM-WELCOME-PAGE");

    static private final SubLString $$$Your_Cyc_server_machine = makeString("Your Cyc server machine");

    static private final SubLString $str_alt248$_a_is_unable_to_load_the_thesauru = makeString("~a is unable to load the thesaurus manager init file.  Please report this problem to your system administrator.");

    static private final SubLString $str_alt249$Sorry__you_are_not_a_recognized__ = makeString("Sorry, you are not a recognized ~A user.");

    static private final SubLString $str_alt250$__Please_contact__A_for_more_info = makeString("  Please contact ~A for more information.");

    static private final SubLString $str_alt251$Could_not_determine_the_interface = makeString("Could not determine the interface!");

    private static final SubLSymbol TM_WELCOME_PAGE_HANDLER = makeSymbol("TM-WELCOME-PAGE-HANDLER");

    static private final SubLString $str_alt253$External_authentication_is_in_pla = makeString("External authentication is in place but the user ID could not be determined.");

    static private final SubLString $str_alt254$_s_is_not_a_valid_user_name_ = makeString("~s is not a valid user name.");

    static private final SubLString $str_alt255$You_need_to_enter_your_personal_l = makeString("You need to enter your personal login name.");

    static private final SubLString $str_alt256$To_try_again__type_your_personal_ = makeString("To try again, type your personal login name in the box below, and hit the ENTER key or click on the Login button.");

    static private final SubLString $str_alt257$Your_login_name__ = makeString("Your login name: ");

    static private final SubLString $str_alt258$Please_Enter_Your__a_Password = makeString("Please Enter Your ~a Password");

    static private final SubLString $str_alt259$_The_CHECK_PASSWORD_option_is_cur = makeString("[The CHECK-PASSWORD option is currently in force.]");

    static private final SubLString $str_alt260$To_get_access_to_this_system_as_a = makeString("To get access to this system as a known user, you must provide a password.  Please select the box below, type your password in it, and hit the RETURN or ENTER key.   (Your password will not be revealed in the box as you type.)");

    static private final SubLString $str_alt261$Your_password__ = makeString("Your password: ");

    static private final SubLString $str_alt262$tm_check_password_handler = makeString("tm-check-password-handler");

    static private final SubLString $$$password = makeString("password");

    static private final SubLString $str_alt264$_S_is_not_a_known_user = makeString("~S is not a known user");

    static private final SubLString $str_alt265$No_password_found_for__S__but_the = makeString("No password found for ~S, but there should be one.");

    static private final SubLString $str_alt266$Can_t_determine_the_interface_ = makeString("Can't determine the interface!");

    private static final SubLSymbol TM_CHECK_PASSWORD_HANDLER = makeSymbol("TM-CHECK-PASSWORD-HANDLER");

    static private final SubLString $str_alt268$Please_Choose_Your_Password_ = makeString("Please Choose Your Password.");

    static private final SubLString $str_alt269$Welcome___A__to__A___You_are_logg = makeString("Welcome, ~A, to ~A.  You are logging on for the first time.");

    static private final SubLString $str_alt270$Choose_Password__Try_Again = makeString("Choose Password: Try Again");

    static private final SubLString $str_alt271$The_passwords_you_entered_either_ = makeString("The passwords you entered either did not match exactly, or were too short or too long.  Please try again.");

    static private final SubLString $str_alt272$Please_type_a_password_of_your_ch = makeString("Please type a password of your choice, 6 to 10 characters long, in the two boxes below.  Remember it, because it will be required the next time you log in.  Do not give your password to anyone else!");

    static private final SubLString $str_alt273$tm_handle_choose_password = makeString("tm-handle-choose-password");

    static private final SubLString $str_alt274$Enter_Password__ = makeString("Enter Password: ");

    static private final SubLString $$$password1 = makeString("password1");

    static private final SubLString $str_alt276$Enter_the_same_word_again__ = makeString("Enter the same word again: ");

    static private final SubLString $$$password2 = makeString("password2");

    static private final SubLString $$$Submit = makeString("Submit");

    static private final SubLString $str_alt279$_S_is_not_a_known_user__but_shoul = makeString("~S is not a known user, but should be.");

    static private final SubLString $str_alt280$Password_could_not_be_stored_for_ = makeString("Password could not be stored for ~S");

    private static final SubLSymbol TM_HANDLE_CHOOSE_PASSWORD = makeSymbol("TM-HANDLE-CHOOSE-PASSWORD");

    static private final SubLString $str_alt282$That_Password_Failed_ = makeString("That Password Failed.");

    static private final SubLString $str_alt283$The_password_you_typed_is_not_cur = makeString("The password you typed is not currently accepted by this ");

    static private final SubLString $str_alt284$_system___Access_is_blocked_unles = makeString(" system.  Access is blocked unless you use a correct password.  You can try again, or you may apply for a new password.");

    static private final SubLString $str_alt285$To_try_again__type_your_personal_ = makeString("To try again, type your personal login name in the box below and hit ENTER or click on the Login button.");

    static private final SubLString $str_alt286$_a_Main_Menu = makeString("~a Main Menu");

    static private final SubLString $str_alt287$tm_first_choices = makeString("tm-first-choices");

    private static final SubLSymbol $LEVEL = makeKeyword("LEVEL");

    static private final SubLString $str_alt289$Could_not_determine_user_permissi = makeString("Could not determine user permissions for user ~A. Please contact your thesaurus administrator.");

    static private final SubLString $str_alt290$Sorry__no_thesauri_are_available_ = makeString("Sorry, no thesauri are available.  Please contact your thesaurus administrator.");

    static private final SubLString $str_alt291$Enter_a_term_to_display_ = makeString("Enter a term to display:");

    public static final SubLInteger $int$50 = makeInteger(50);

    static private final SubLString $str_alt293$Choose_a_display_method_ = makeString("Choose a display method:");

    static private final SubLString $$$Hierarchical_Display = makeString("Hierarchical Display");

    static private final SubLString $$$Alphabetical_Display = makeString("Alphabetical Display");

    static private final SubLString $str_alt296$_s_ = makeString("'s ");

    static private final SubLString $str_alt297$_is_maintained_with_ = makeString(" is maintained with ");

    static private final SubLString $str_alt298$__a_tool_for_managing_and_combini = makeString(", a tool for managing and combining multiple special-subject thesauri,");

    static private final SubLString $str_alt299$_enhanced_with_links_to_the_ = makeString(" enhanced with links to the ");

    static private final SubLString $$$Cyc = makeString("Cyc");

    static private final SubLString $str_alt301$_system_of_conceptual_meanings_ = makeString(" system of conceptual meanings.");

    private static final SubLSymbol TM_FIRST_CHOICES = makeSymbol("TM-FIRST-CHOICES");

    static private final SubLString $str_alt303$Could_not_determine_user_permissi = makeString("Could not determine user permissions for user ~A.");

    static private final SubLString $str_alt304$Please_contact_your_thesaurus_adm = makeString("Please contact your thesaurus administrator.");

    static private final SubLString $str_alt305$Sorry__no_available_thesauri_ = makeString("Sorry, no available thesauri.");

    private static final SubLSymbol $VIEW_MULTIPLE = makeKeyword("VIEW-MULTIPLE");

    static private final SubLString $str_alt307$Please_choose_one__a = makeString("Please choose one ~a");

    static private final SubLString $str_alt308$or_more_thesauri_ = makeString("or more thesauri.");

    static private final SubLString $str_alt309$thesaurus_ = makeString("thesaurus.");

    static private final SubLString $str_alt310$First_click_on_one_or_more_thesau = makeString("First click on one or more thesauri (as many as you wish, or ALL if you want them all), then click on the Select button to continue, or on the Reset button to start over.");

    static private final SubLString $str_alt311$Click_on_one_thesaurus_to_view__t = makeString("Click on one thesaurus to view, then Select.");

    static private final SubLString $str_alt312$For_information_on_thesauri_that_ = makeString("For information on thesauri that may be available, click ");

    static private final SubLString $str_alt313$thesaurus_information = makeString("thesaurus-information");

    static private final SubLString $$$here = makeString("here");

    static private final SubLString $str_alt315$__then_return_to_this_page_afterw = makeString(", then return to this page afterward to choose thesauri.");

    static private final SubLString $str_alt316$tm_handle_ask_for_thesauri = makeString("tm-handle-ask-for-thesauri");

    static private final SubLString $str_alt317$choice_of_thesauri = makeString("choice-of-thesauri");

    static private final SubLString $$$ALL = makeString("ALL");

    static private final SubLString $str_alt319$set_thesauri = makeString("set-thesauri");

    static private final SubLString $$$all = makeString("all");

    static private final SubLString $$$Reset = makeString("Reset");

    static private final SubLString $$$Select = makeString("Select");

    private static final SubLSymbol TM_HANDLE_ASK_FOR_THESAURI = makeSymbol("TM-HANDLE-ASK-FOR-THESAURI");

    static private final SubLString $$$Specify_Preferences = makeString("Specify Preferences");

    static private final SubLString $str_alt325$tm_handle_preferences = makeString("tm-handle-preferences");

    static private final SubLString $$$prefs = makeString("prefs");

    static private final SubLString $$$Update_Preferences = makeString("Update Preferences");

    static private final SubLString $str_alt328$tm_change_user_type = makeString("tm-change-user-type");

    static private final SubLString $$$Change_User_Permission_Level = makeString("Change User Permission Level");

    static private final SubLString $str_alt330$Select_your_preference_changes_be = makeString("Select your preference changes below, then click on Update Preferences to perform the changes.");

    static private final SubLString $str_alt331$__then_return_to_this_page_afterw = makeString(", then return to this page afterward to set your preferences.");

    static private final SubLString $$$General_Preferences = makeString("General Preferences");

    static private final SubLString $str_alt333$editing_enabled = makeString("editing-enabled");

    static private final SubLString $$$T = makeString("T");

    static private final SubLString $str_alt335$__Editing_enabled_ = makeString("  Editing enabled?");

    static private final SubLString $str_alt336$filter_in_basic = makeString("filter-in-basic");

    static private final SubLString $str_alt337$_ON = makeString(":ON");

    private static final SubLSymbol $FILTER_IN_BASIC = makeKeyword("FILTER-IN-BASIC");



    static private final SubLString $str_alt340$__Use_filtering_in_basic_mode_ = makeString("  Use filtering in basic mode?");

    static private final SubLString $str_alt341$set_from = makeString("set-from");

    static private final SubLString $str_alt342$_interface = makeString(":interface");

    static private final SubLString $str_alt343$end_user = makeString("end-user");

    static private final SubLString $str_alt344$view_multiple = makeString("view-multiple");

    static private final SubLString $str_alt345$_Browse_multiple_thesauri_at_once = makeString(" Browse multiple thesauri at once?");

    static private final SubLString $str_alt346$Browsing_thesaur_a___ = makeString("Browsing thesaur~a:  ");

    static private final SubLString $$$i = makeString("i");

    static private final SubLString $$$us = makeString("us");

    static private final SubLString $str_alt349$Editing_thesauri___ = makeString("Editing thesauri:  ");

    static private final SubLString $str_alt350$Select_case_style___ = makeString("Select case style:  ");



    static private final SubLString $str_alt352$Select_search_relations___ = makeString("Select search relations:  ");

    static private final SubLString $str_alt353$edit_thesauri = makeString("edit-thesauri");

    private static final SubLSymbol $DISPLAY_CASE = makeKeyword("DISPLAY-CASE");

    static private final SubLString $str_alt355$display_case = makeString("display-case");



    static private final SubLString $$$Uppercase = makeString("Uppercase");



    static private final SubLString $$$Lowercase = makeString("Lowercase");



    static private final SubLString $$$Mixed_Case = makeString("Mixed Case");

    public static final SubLObject $$preferredTerm = constant_handles.reader_make_constant_shell(makeString("preferredTerm"));

    static private final SubLString $str_alt363$search_relations = makeString("search-relations");

    private static final SubLSymbol $COLOR_PREFERENCES = makeKeyword("COLOR-PREFERENCES");

    static private final SubLString $$$Choose_background_colors = makeString("Choose background colors");

    static private final SubLString $str_alt366$separate_help_page = makeString("separate-help-page");

    static private final SubLString $str_alt367$_Print_help_on_a_separate__floati = makeString(" Print help on a separate (floating) page?");

    static private final SubLString $str_alt368$Browsing_Preferences___Hierarchic = makeString("Browsing Preferences - Hierarchical Display");

    static private final SubLString $str_alt369$show_term_thesauri = makeString("show-term-thesauri");

    private static final SubLSymbol $SHOW_TERM_THESAURI = makeKeyword("SHOW-TERM-THESAURI");

    static private final SubLString $str_alt371$__Show_thesauri_for_every_term_ = makeString("  Show thesauri for every term?");

    static private final SubLString $str_alt372$show_descendant_parms = makeString("show-descendant-parms");

    private static final SubLSymbol $SHOW_DESCENDANT_PARMS = makeKeyword("SHOW-DESCENDANT-PARMS");

    static private final SubLString $str_alt374$__Show_parameters_for_NTs_ = makeString("  Show parameters for NTs?");

    static private final SubLString $str_alt375$expand_parent_paths = makeString("expand-parent-paths");

    private static final SubLSymbol $EXPAND_PARENT_PATHS = makeKeyword("EXPAND-PARENT-PATHS");

    static private final SubLString $str_alt377$__Fully_expand_BT_and_NT_paths_ = makeString("  Fully expand BT and NT paths?");

    static private final SubLString $str_alt378$detailed_hierarchy_term = makeString("detailed-hierarchy-term");

    private static final SubLSymbol $DETAILED_HIERARCHY_TERM = makeKeyword("DETAILED-HIERARCHY-TERM");

    static private final SubLString $str_alt380$__Show_main_term_in_detail_ = makeString("  Show main term in detail?");

    static private final SubLString $str_alt381$show_hd_relation_links = makeString("show-hd-relation-links");

    private static final SubLSymbol $SHOW_HD_RELATION_LINKS = makeKeyword("SHOW-HD-RELATION-LINKS");

    static private final SubLString $str_alt383$__Show_relation_links_ = makeString("  Show relation links?");

    static private final SubLString $str_alt384$Indent_each_level_ = makeString("Indent each level ");

    static private final SubLString $str_alt385$depth_spacing = makeString("depth-spacing");

    private static final SubLSymbol $DEPTH_SPACING = makeKeyword("DEPTH-SPACING");

    static private final SubLString $str_alt387$_additional_spaces_ = makeString(" additional spaces.");

    static private final SubLString $str_alt388$Maximum_BT_height_ = makeString("Maximum BT height:");

    static private final SubLString $str_alt389$__ = makeString("  ");

    static private final SubLString $str_alt390$Maximum_NT_depth_ = makeString("Maximum NT depth:");

    static private final SubLString $str_alt391$Maximum_NTs_ = makeString("Maximum NTs:");

    static private final SubLString $str_alt392$parent_depth = makeString("parent-depth");

    private static final SubLSymbol $PARENT_DEPTH = makeKeyword("PARENT-DEPTH");





    static private final SubLList $list_alt396 = list(new SubLObject[]{ makeSymbol("NONE"), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, makeSymbol("ALL") });

    static private final SubLString $str_alt397$child_depth = makeString("child-depth");

    private static final SubLSymbol $CHILD_DEPTH = makeKeyword("CHILD-DEPTH");

    static private final SubLString $str_alt399$max_children = makeString("max-children");

    private static final SubLSymbol $MAX_CHILDREN = makeKeyword("MAX-CHILDREN");

    static private final SubLString $str_alt401$Relation_to_use_when_printing_hie = makeString("Relation to use when printing hierarchy display:");

    static private final SubLString $str_alt402$graph_relation = makeString("graph-relation");

    private static final SubLSymbol $GRAPH_RELATION = makeKeyword("GRAPH-RELATION");

    static private final SubLString $str_alt404$Browsing_preferences___Full_Term_ = makeString("Browsing preferences - Full Term Display");

    static private final SubLString $str_alt405$fd_separate_ = makeString("fd-separate?");

    static private final SubLString $str_alt406$__Show_a_separate_section_per_the = makeString("  Show a separate section per thesaurus?");

    static private final SubLString $str_alt407$show_reasons_ = makeString("show-reasons?");

    public static final SubLSymbol $kw408$SHOW_REASONS_ = makeKeyword("SHOW-REASONS?");

    static private final SubLString $str_alt409$__Show_audit_trail_for_thesaurus_ = makeString("  Show audit trail for thesaurus facts (when separate sections per thesaurus are shown)?");

    static private final SubLString $str_alt410$Browsing_preferences___Alphabetic = makeString("Browsing preferences - Alphabetical Index");

    static private final SubLString $str_alt411$alphabetical_show_use_fors = makeString("alphabetical-show-use-fors");

    static private final SubLString $str_alt412$__Show_alternative_terms_also_ = makeString("  Show alternative terms also?");

    private static final SubLSymbol TM_SET_PREFERENCES = makeSymbol("TM-SET-PREFERENCES");

    static private final SubLString $$$Update_Preferences_Results = makeString("Update Preferences Results");

    static private final SubLString $str_alt415$Your_preferences_have_been_update = makeString("Your preferences have been updated.");

    private static final SubLSymbol TM_HANDLE_PREFERENCES = makeSymbol("TM-HANDLE-PREFERENCES");

    static private final SubLString $str_alt417$bg_color_default = makeString("bg-color-default");

    private static final SubLSymbol $BG_COLOR_DEFAULT = makeKeyword("BG-COLOR-DEFAULT");

    static private final SubLString $str_alt419$bg_color_hierarchical = makeString("bg-color-hierarchical");

    private static final SubLSymbol $BG_COLOR_HIERARCHICAL = makeKeyword("BG-COLOR-HIERARCHICAL");

    static private final SubLString $str_alt421$bg_color_alphabetical = makeString("bg-color-alphabetical");

    private static final SubLSymbol $BG_COLOR_ALPHABETICAL = makeKeyword("BG-COLOR-ALPHABETICAL");

    static private final SubLString $str_alt423$bg_color_full_record = makeString("bg-color-full-record");

    private static final SubLSymbol $BG_COLOR_FULL_RECORD = makeKeyword("BG-COLOR-FULL-RECORD");

    static private final SubLString $$$interface = makeString("interface");

    static private final SubLSymbol $sym426$BROWSABLE_THESAURUS_ = makeSymbol("BROWSABLE-THESAURUS?");

    static private final SubLSymbol $sym427$EDITABLE_THESAURUS_ = makeSymbol("EDITABLE-THESAURUS?");





    private static final SubLSymbol RELATION_CONSTANT_FROM_ABBREVIATION = makeSymbol("RELATION-CONSTANT-FROM-ABBREVIATION");



    public static final SubLObject $$broaderTerm = constant_handles.reader_make_constant_shell(makeString("broaderTerm"));





    static private final SubLString $$$red = makeString("red");

    static private final SubLString $$$green = makeString("green");

    static private final SubLString $$$blue = makeString("blue");

    static private final SubLString $$$Set_background_color = makeString("Set background color");

    static private final SubLString $str_alt439$tm_color_preferences_handler = makeString("tm-color-preferences-handler");

    static private final SubLString $str_alt440$Choose_values_from_0_100 = makeString("Choose values from 0-100");

    static private final SubLString $$$Red = makeString("Red");

    static private final SubLString $$$Green = makeString("Green");

    static private final SubLString $$$Blue = makeString("Blue");

    static private final SubLString $$$Change_Color = makeString("Change Color");

    static private final SubLString $str_alt445$Set_default_background_to_this_co = makeString("Set default background to this color");

    static private final SubLString $str_alt446$Set_hierarchical_display_backgrou = makeString("Set hierarchical display background to this color");

    static private final SubLString $str_alt447$Set_alphabetical_display_backgrou = makeString("Set alphabetical display background to this color");

    static private final SubLString $str_alt448$Set_full_record_display_backgroun = makeString("Set full record display background to this color");

    private static final SubLSymbol TM_COLOR_PREFERENCES_HANDLER = makeSymbol("TM-COLOR-PREFERENCES-HANDLER");

    static private final SubLString $$$Default_background_color_change = makeString("Default background color change");

    private static final SubLSymbol TM_SET_BG_COLOR_DEFAULT = makeSymbol("TM-SET-BG-COLOR-DEFAULT");

    static private final SubLString $str_alt452$Hierarchical_display_background_c = makeString("Hierarchical display background color change");

    private static final SubLSymbol TM_SET_BG_COLOR_HIERARCHICAL = makeSymbol("TM-SET-BG-COLOR-HIERARCHICAL");

    static private final SubLString $str_alt454$Alphabetical_display_background_c = makeString("Alphabetical display background color change");

    private static final SubLSymbol TM_SET_BG_COLOR_ALPHABETICAL = makeSymbol("TM-SET-BG-COLOR-ALPHABETICAL");

    static private final SubLString $str_alt456$Full_record_display_background_co = makeString("Full record display background color change");

    private static final SubLSymbol TM_SET_BG_COLOR_FULL_RECORD = makeSymbol("TM-SET-BG-COLOR-FULL-RECORD");

    static private final SubLString $$$0123456789ABCDEF = makeString("0123456789ABCDEF");





    static private final SubLString $str_alt461$Sorry_ = makeString("Sorry!");

    static private final SubLString $str_alt462$tm_handle_change_user_type = makeString("tm-handle-change-user-type");

    static private final SubLString $str_alt463$Select_User_Type_ = makeString("Select User Type:");

    static private final SubLString $str_alt464$Select_Browse_Thesauri_ = makeString("Select Browse Thesauri:");

    static private final SubLString $str_alt465$Select_Edit_Thesauri_ = makeString("Select Edit Thesauri:");

    static private final SubLString $str_alt466$user_type = makeString("user-type");

    static private final SubLString $str_alt467$___ = makeString("   ");

    static private final SubLString $str_alt468$browse_thesauri = makeString("browse-thesauri");

    static private final SubLString $str_alt469$_____ = makeString("     ");

    static private final SubLString $str_alt470$Note__Here_you_may_edit_Browse_Th = makeString("Note: Here you may edit Browse Thesauri and Edit Thesauri regardless of your user level, but Browse Thesauri only matter if you are an Advanced User or Limited Editor, and Edit Thesauri only matter when you are a Limited Editor.  Any recorded value for these parameters are ignored for other user levels.");

    static private final SubLString $$$Change = makeString("Change");

    private static final SubLSymbol TM_CHANGE_USER_TYPE = makeSymbol("TM-CHANGE-USER-TYPE");

    private static final SubLSymbol THESAURUS_CONSTANT_FROM_NAME = makeSymbol("THESAURUS-CONSTANT-FROM-NAME");

    static private final SubLSymbol $sym474$VALID_CONSTANT_ = makeSymbol("VALID-CONSTANT?");

    static private final SubLString $str_alt475$Error_changing_user_type_ = makeString("Error changing user type.");



    public static final SubLObject $$tmBrowsableThesauri = constant_handles.reader_make_constant_shell(makeString("tmBrowsableThesauri"));



    public static final SubLObject $$tmEditorFor = constant_handles.reader_make_constant_shell(makeString("tmEditorFor"));

    private static final SubLSymbol TM_HANDLE_CHANGE_USER_TYPE = makeSymbol("TM-HANDLE-CHANGE-USER-TYPE");

    // // Initializers
    public void declareFunctions() {
        declare_html_thesaurus_file();
    }

    public void initializeVariables() {
        init_html_thesaurus_file();
    }

    public void runTopLevelForms() {
        setup_html_thesaurus_file();
    }
}

