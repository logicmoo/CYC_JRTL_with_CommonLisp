/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_A;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_B;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_C;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_D;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_E;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_F;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_G;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_H;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_I;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_J;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_K;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_L;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_M;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_N;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_O;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_P;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_Q;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_R;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_S;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_U;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_V;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_W;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_X;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_Y;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_Z;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_e;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_question;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_s;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.charE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.char_equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_decoded_time;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      VOCAB-PAGES
 *  source file: /cyc/top/cycl/vocab-pages.lisp
 *  created:     2019/07/03 17:38:14
 */
public final class vocab_pages extends SubLTranslatedFile implements V02 {
    // // Constructor
    private vocab_pages() {
    }

    public static final SubLFile me = new vocab_pages();


    // // Definitions
    /**
     * This gates whether the documentation generated is restricted to
     * #$PublicConstants. If not then all non-proprietary constants are used.
     */
    // defvar
    public static final SubLSymbol $vocab_public_documentationP$ = makeSymbol("*VOCAB-PUBLIC-DOCUMENTATION?*");

    /**
     * This gates whether pages are being generated dynamically or statically.
     * Links are generated differently for each.
     */
    // defvar
    public static final SubLSymbol $vocab_page_dynamic_contextP$ = makeSymbol("*VOCAB-PAGE-DYNAMIC-CONTEXT?*");

    /**
     * If this is useful to anyone else it should be moved to another file.
     * This is used to provide an alphabetical ordering of the links on the
     * table of contents to the vocab files.
     */
    // defconstant
    public static final SubLSymbol $alphabet$ = makeSymbol("*ALPHABET*");

    /**
     * This is the directory where static pages will be dumped out. If you don't
     * want them to go here bind this variable dynamically.
     */
    // deflexical
    public static final SubLSymbol $vocab_static_directory$ = makeSymbol("*VOCAB-STATIC-DIRECTORY*");

    /**
     * Generates all vocab files.
     *
     * @return t; nicely optimistic.
     */
    public static final SubLObject generate_vocab_files(SubLObject publicP) {
        if (publicP == UNPROVIDED) {
            publicP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject vocab_clumps = isa.all_fort_instances($$VocabClump, $$CycSubjectClumpsMt, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = $vocab_public_documentationP$.currentBinding(thread);
                    try {
                        $vocab_public_documentationP$.bind(publicP, thread);
                        print($$$Contents, UNPROVIDED);
                        generate_vocab_toc_file();
                        {
                            SubLObject cdolist_list_var = vocab_clumps;
                            SubLObject vocab_clump = NIL;
                            for (vocab_clump = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , vocab_clump = cdolist_list_var.first()) {
                                print(vocab_clump, UNPROVIDED);
                                generate_vocab_file(vocab_clump);
                            }
                        }
                    } finally {
                        $vocab_public_documentationP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return T;
        }
    }

    /**
     * Generates a file for the table of contents of the vocab files.
     *
     * @return nil.
     */
    public static final SubLObject generate_vocab_toc_file() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject filename = $str_alt16$toc_html;
                SubLObject pathname = cconcatenate($vocab_static_directory$.getGlobalValue(), filename);
                {
                    SubLObject _prev_bind_0 = $vocab_page_dynamic_contextP$.currentBinding(thread);
                    try {
                        $vocab_page_dynamic_contextP$.bind(NIL, thread);
                        print(pathname, UNPROVIDED);
                        {
                            SubLObject stream = NIL;
                            try {
                                {
                                    SubLObject _prev_bind_0_1 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                    try {
                                        stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                        stream = compatibility.open_text(pathname, $OUTPUT, NIL);
                                    } finally {
                                        stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_1, thread);
                                    }
                                }
                                if (!stream.isStream()) {
                                    Errors.error($str_alt18$Unable_to_open__S, pathname);
                                }
                                {
                                    SubLObject stream_2 = stream;
                                    {
                                        SubLObject _prev_bind_0_3 = html_macros.$html_stream$.currentBinding(thread);
                                        try {
                                            html_macros.$html_stream$.bind(stream_2, thread);
                                            generate_vocab_toc();
                                        } finally {
                                            html_macros.$html_stream$.rebind(_prev_bind_0_3, thread);
                                        }
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if (stream.isStream()) {
                                            close(stream, UNPROVIDED);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_4, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        $vocab_page_dynamic_contextP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Generates a vocab page for a specified #$VocabClump.
     *
     * @return nil.
     */
    public static final SubLObject generate_vocab_file(SubLObject clump) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject filename = kb_mapping_utilities.fpred_value_in_mt(clump, $$vocabFilename, $$CycSubjectClumpsMt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject pathname = cconcatenate($vocab_static_directory$.getGlobalValue(), filename);
                {
                    SubLObject _prev_bind_0 = $vocab_page_dynamic_contextP$.currentBinding(thread);
                    try {
                        $vocab_page_dynamic_contextP$.bind(NIL, thread);
                        if (NIL == filename) {
                            Errors.warn($str_alt20$Could_not_generate_file_for__A__N, clump);
                        }
                        print(pathname, UNPROVIDED);
                        {
                            SubLObject stream = NIL;
                            try {
                                {
                                    SubLObject _prev_bind_0_5 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                    try {
                                        stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                        stream = compatibility.open_text(pathname, $OUTPUT, NIL);
                                    } finally {
                                        stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_5, thread);
                                    }
                                }
                                if (!stream.isStream()) {
                                    Errors.error($str_alt18$Unable_to_open__S, pathname);
                                }
                                {
                                    SubLObject stream_6 = stream;
                                    {
                                        SubLObject _prev_bind_0_7 = html_macros.$html_stream$.currentBinding(thread);
                                        try {
                                            html_macros.$html_stream$.bind(stream_6, thread);
                                            generate_vocab_page(clump);
                                        } finally {
                                            html_macros.$html_stream$.rebind(_prev_bind_0_7, thread);
                                        }
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if (stream.isStream()) {
                                            close(stream, UNPROVIDED);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_8, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        $vocab_page_dynamic_contextP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Called from the adornment in the browser. Gets a vocab page or a list
     * of possible vocab pages for a term (list if more than one).
     *
     * @return nil.
     */
    public static final SubLObject cb_term_clumps(SubLObject args) {
        {
            SubLObject idstring = args.first();
            SubLObject v_term = cb_utilities.cb_guess_fort(idstring, UNPROVIDED);
            SubLObject clumps = vocab_clumps_for_term(v_term);
            if (NIL != list_utilities.lengthE(clumps, ONE_INTEGER, UNPROVIDED)) {
                generate_vocab_page(clumps.first());
            } else {
                html_clump_list(clumps);
            }
        }
        return NIL;
    }

    /**
     * Generates a table of contents page for the vocab pages. This is just
     * a wrapper for generate-vocab-toc which does all the work.
     *
     * @return nil.
     */
    public static final SubLObject cb_vocab_contents(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        return generate_vocab_toc();
    }

    /**
     * Generates a table of contents page for the vocab pages.
     *
     * @return nil.
     */
    public static final SubLObject generate_vocab_toc() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject namehash = get_vocab_name_hash();
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ($str_alt23$CYC_reg_Vocabulary);
                html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (NIL != html_macros.$html_color_white$.getDynamicValue(thread)) {
                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(html_macros.$html_color_white$.getDynamicValue(thread)));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_9 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                if (NIL != html_macros.$html_color_lighter_blue$.getDynamicValue(thread)) {
                                    html_utilities.html_markup(html_macros.$html_table_bgcolor$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_color_lighter_blue$.getDynamicValue(thread));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_width$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup($str_alt24$100_);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_12 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                        html_utilities.html_markup(TWO_INTEGER);
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        html_utilities.html_markup($str_alt23$CYC_reg_Vocabulary);
                                                        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                        html_utilities.html_markup(TWO_INTEGER);
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        html_utilities.html_terpri(UNPROVIDED);
                                                        if (NIL != $vocab_page_dynamic_contextP$.getDynamicValue(thread)) {
                                                            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup($str_alt25$http___localhost_cycdoc_upperont_);
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_markup($str_alt26$Diagram_of_Selected_Concepts_from);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                        } else {
                                                            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup($str_alt27$upperont_diagram_html);
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_markup($str_alt26$Diagram_of_Selected_Concepts_from);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                        }
                                                        html_utilities.html_br();
                                                        html_utilities.html_br();
                                                        html_utilities.html_terpri(UNPROVIDED);
                                                        html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                                        html_utilities.html_terpri(UNPROVIDED);
                                                        {
                                                            SubLObject temp_anchor = format(NIL, $str_alt28$__C, $alphabet$.getGlobalValue().first());
                                                            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(temp_anchor);
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_15 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_princ($alphabet$.getGlobalValue().first());
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                        }
                                                        {
                                                            SubLObject cdolist_list_var = $alphabet$.getGlobalValue().rest();
                                                            SubLObject letter = NIL;
                                                            for (letter = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , letter = cdolist_list_var.first()) {
                                                                {
                                                                    SubLObject temp_string = format(NIL, $str_alt29$_C, letter);
                                                                    SubLObject temp_anchor = format(NIL, $str_alt28$__C, letter);
                                                                    html_utilities.html_princ($str_alt30$____);
                                                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(temp_anchor);
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_16 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_princ(temp_string);
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_16, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                                }
                                                            }
                                                        }
                                                        html_utilities.html_br();
                                                        html_utilities.html_br();
                                                        html_utilities.html_terpri(UNPROVIDED);
                                                        {
                                                            SubLObject cdolist_list_var = $alphabet$.getGlobalValue();
                                                            SubLObject letter = NIL;
                                                            for (letter = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , letter = cdolist_list_var.first()) {
                                                                {
                                                                    SubLObject temp_string = format(NIL, $str_alt29$_C, letter);
                                                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                                    if (NIL != temp_string) {
                                                                        html_utilities.html_markup(html_macros.$html_anchor_name$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup(temp_string);
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_17 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                            html_utilities.html_princ(letter);
                                                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                            html_utilities.html_indent(UNPROVIDED);
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                                }
                                                                {
                                                                    SubLObject name_list = Sort.sort(gethash(letter, namehash, UNPROVIDED), symbol_function($sym31$STRING_), UNPROVIDED);
                                                                    if (NIL != name_list) {
                                                                        {
                                                                            SubLObject name = name_list.first();
                                                                            SubLObject clump = get_clump_from_title(name);
                                                                            if (NIL != clump) {
                                                                                html_clump_link(clump);
                                                                            } else {
                                                                                html_utilities.html_princ(name_list.first());
                                                                            }
                                                                        }
                                                                        {
                                                                            SubLObject cdolist_list_var_18 = name_list.rest();
                                                                            SubLObject name = NIL;
                                                                            for (name = cdolist_list_var_18.first(); NIL != cdolist_list_var_18; cdolist_list_var_18 = cdolist_list_var_18.rest() , name = cdolist_list_var_18.first()) {
                                                                                {
                                                                                    SubLObject clump = get_clump_from_title(name);
                                                                                    html_utilities.html_princ($str_alt30$____);
                                                                                    if (NIL != clump) {
                                                                                        html_clump_link(clump);
                                                                                    } else {
                                                                                        html_utilities.html_princ(name);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                html_utilities.html_br();
                                                                html_utilities.html_br();
                                                                html_utilities.html_terpri(UNPROVIDED);
                                                            }
                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_11, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_10, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                html_utilities.html_copyright_notice();
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_9, thread);
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
     * Generates a hash table of all #$VocabClump names. Table is indexed on
     * characters (capital letters). Values returned are unordered lists of all
     * #$clumpTitles of #$VocabClumps which begin alphabetically with that letter.
     *
     * @return hash.
     */
    public static final SubLObject get_vocab_name_hash() {
        {
            SubLObject vplist = isa.all_fort_instances($$VocabClump, $$CycSubjectClumpsMt, UNPROVIDED);
            SubLObject namelist = get_titles_from_clumps(vplist);
            SubLObject namehash = make_hash_table($int$26, UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var = namelist;
            SubLObject name = NIL;
            for (name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , name = cdolist_list_var.first()) {
                {
                    SubLObject key = Strings.sublisp_char(name, ZERO_INTEGER);
                    sethash(key, namehash, cons(name, gethash(key, namehash, UNPROVIDED)));
                }
            }
            return namehash;
        }
    }

    /**
     * Takes a list of clumps and returns a list of #$clumpTitles.
     *
     * @return list.
     */
    public static final SubLObject get_titles_from_clumps(SubLObject clumps) {
        {
            SubLObject returns = NIL;
            SubLObject cdolist_list_var = clumps;
            SubLObject clump = NIL;
            for (clump = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , clump = cdolist_list_var.first()) {
                {
                    SubLObject title = clump_title(clump);
                    if (NIL != title) {
                        returns = cons(title, returns);
                    } else {
                        returns = cons(constants_high.constant_name(clump), returns);
                    }
                }
            }
            returns = nreverse(returns);
            return returns;
        }
    }

    /**
     * Takes a clump and returns its title.
     *
     * @return string.
     */
    public static final SubLObject clump_title(SubLObject clump) {
        return kb_mapping_utilities.fpred_value_in_mt(clump, $$clumpTitle, $$CycSubjectClumpsMt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Takes a string and returns the clump (if any) whose #$clumpTitle is
     * that string.
     *
     * @return constant or nil.
     */
    public static final SubLObject get_clump_from_title(SubLObject title) {
        {
            SubLObject cdolist_list_var = kb_mapping.gather_predicate_extent_index($$clumpTitle, $$CycSubjectClumpsMt, UNPROVIDED);
            SubLObject ass = NIL;
            for (ass = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ass = cdolist_list_var.first()) {
                {
                    SubLObject form = assertions_high.assertion_formula(ass);
                    SubLObject string = third(form);
                    if (NIL != Strings.stringE(string, title, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        return second(form);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Generates an html document with links to dynamically generated vocab pages
     * from a list of clumps.
     *
     * @return nil.
     */
    public static final SubLObject html_clump_list(SubLObject clumps) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject title_var = $$$Possible_Subject_Clumps;
                {
                    SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                    try {
                        html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? ((SubLObject) (html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        cb_parameters.cb_head_shortcut_icon();
                        html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                        if (NIL != title_var) {
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                        }
                        html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_19 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup($str_alt37$yui_skin_sam);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_20 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != title_var) {
                                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                            html_utilities.html_markup(TWO_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            html_utilities.html_princ(title_var);
                                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                            html_utilities.html_markup(TWO_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        }
                                        {
                                            SubLObject cdolist_list_var = clumps;
                                            SubLObject clump = NIL;
                                            for (clump = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , clump = cdolist_list_var.first()) {
                                                html_clump_link(clump);
                                                html_utilities.html_br();
                                                html_utilities.html_terpri(UNPROVIDED);
                                            }
                                        }
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        html_utilities.html_copyright_notice();
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_20, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_19, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Generates a link to a vocab page for a clump. This link will point to a
     * static page or to a dynamically generated one depending on the context.
     * The text of this link will be the #$clumpTitle if there is one or the
     * constant name if not.
     *
     * @return nil
     */
    public static final SubLObject html_clump_link(SubLObject clump) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject clumptitle = kb_mapping_utilities.fpred_value_in_mt(clump, $$clumpTitle, $$CycSubjectClumpsMt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject clump_anchor = (NIL != $vocab_page_dynamic_contextP$.getDynamicValue(thread)) ? ((SubLObject) (cconcatenate($str_alt38$cg_cb_vocab_page_, constants_high.constant_name(clump)))) : kb_mapping_utilities.fpred_value_in_mt(clump, $$vocabFilename, $$CycSubjectClumpsMt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(clump_anchor);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        if (NIL != clumptitle) {
                            html_utilities.html_princ(clumptitle);
                        } else {
                            html_fort_markup(clump);
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                html_utilities.html_terpri(UNPROVIDED);
            }
            return NIL;
        }
    }

    /**
     * Takes input from the dynamic links in the browser, extracts the clump and
     * calls generate-vocab-page.
     *
     * @return nil.
     */
    public static final SubLObject cb_vocab_page(SubLObject args) {
        {
            SubLObject clumptitle = args.first();
            SubLObject clump = constants_high.find_constant(clumptitle);
            if (NIL != clump) {
                return generate_vocab_page(clump);
            } else {
                Errors.error($str_alt39$_A_is_not_the_name_of_a_constant, clumptitle);
            }
        }
        return NIL;
    }

    /**
     * Generates a vocab page for a specified #$VocabClump and prints it
     * to *html-stream*.
     *
     * @return nil.
     */
    public static final SubLObject generate_vocab_page(SubLObject clump) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == isa.isaP(clump, $$VocabClump, $$CycSubjectClumpsMt, UNPROVIDED)) {
                Errors.error($str_alt41$argument_is_not_a___VocabClump_);
            }
            {
                SubLObject syntaxlist = kb_mapping_utilities.fpred_value_in_mt(clump, $$clumpSyntaxList, $$CycSubjectClumpsMt, UNPROVIDED, UNPROVIDED, UNPROVIDED).rest();
                SubLObject clumptitle = kb_mapping_utilities.fpred_value_in_mt(clump, $$clumpTitle, $$CycSubjectClumpsMt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                if (NIL != clumptitle) {
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(clumptitle);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                {
                    SubLObject color_value = $WHITE;
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
                                    html_vocab_header(clumptitle);
                                    if (NIL != syntaxlist) {
                                        generate_syntax_list_html(syntaxlist);
                                    } else {
                                        generate_clump_terms_html(clump);
                                    }
                                    html_vocab_footer();
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    html_utilities.html_copyright_notice();
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
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            }
            return NIL;
        }
    }

    /**
     * Prints standard header for a vocab page.
     *
     * @return nil.
     */
    public static final SubLObject html_vocab_header(SubLObject title) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_terpri(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_comment_head$.getGlobalValue());
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_terpri(UNPROVIDED);
                    html_vocab_warning();
                    html_utilities.html_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_comment_tail$.getGlobalValue());
            html_utilities.html_terpri(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            if (true) {
                html_utilities.html_markup(html_macros.$html_anchor_name$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup($$$top);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            }
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            html_utilities.html_terpri(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
            html_utilities.html_markup(TWO_INTEGER);
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup(html_utilities.$cycorp_homepage_url$.getDynamicValue(thread));
            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    {
                        SubLObject image_src = cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src($CYCORP_SYMBOL_MEDIUM));
                        SubLObject align = $CENTER;
                        SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string($CYCORP_SYMBOL_MEDIUM);
                        SubLObject border = (true) ? ((SubLObject) (ZERO_INTEGER)) : ZERO_INTEGER;
                        html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(image_src);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        if (NIL != alt) {
                            html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(alt);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (NIL != align) {
                            html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align(align));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (NIL != border) {
                            html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(border);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_22 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_22, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            if (NIL != title) {
                html_utilities.html_markup(title);
            }
            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
            html_utilities.html_markup(TWO_INTEGER);
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            html_utilities.html_terpri(UNPROVIDED);
            html_utilities.html_markup($str_alt47$E_Mail_Comments_to__);
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            html_utilities.html_mailto_url($str_alt48$doc_cyc_com);
            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_markup($str_alt48$doc_cyc_com);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            thread.resetMultipleValues();
            {
                SubLObject second = get_decoded_time();
                SubLObject minute = thread.secondMultipleValue();
                SubLObject hour = thread.thirdMultipleValue();
                SubLObject day = thread.fourthMultipleValue();
                SubLObject month = thread.fifthMultipleValue();
                SubLObject year = thread.sixthMultipleValue();
                thread.resetMultipleValues();
                html_utilities.html_terpri(UNPROVIDED);
                html_utilities.html_br();
                if (NIL == $vocab_page_dynamic_contextP$.getDynamicValue(thread)) {
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt49$Last_Update___A__A__A__A__A__A, new SubLObject[]{ month, day, year, hour, minute, second });
                    html_utilities.html_terpri(UNPROVIDED);
                    html_utilities.html_br();
                }
                html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt50$Copyright__copy__A, year);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(html_utilities.$cycorp_homepage_url$.getDynamicValue(thread));
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup($str_alt51$Cycorp_);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                html_utilities.html_markup($str_alt52$__All_rights_reserved_);
                html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                html_utilities.html_terpri(UNPROVIDED);
            }
            html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
            html_utilities.html_terpri(UNPROVIDED);
            if (NIL != $vocab_page_dynamic_contextP$.getDynamicValue(thread)) {
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup($str_alt53$cg_cb_vocab_contents);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        {
                            SubLObject image_src = cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src($VOCAB_SMALL_BALL));
                            SubLObject align = $CENTER;
                            SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string($VOCAB_SMALL_BALL);
                            SubLObject border = ZERO_INTEGER;
                            html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(image_src);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            if (NIL != alt) {
                                html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(alt);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != align) {
                                html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align(align));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != border) {
                                html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(border);
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
                            html_utilities.html_markup($$$Go_to_Table_of_Contents);
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            } else {
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup($str_alt16$toc_html);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        {
                            SubLObject image_src = cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src($VOCAB_SMALL_BALL));
                            SubLObject align = $CENTER;
                            SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string($VOCAB_SMALL_BALL);
                            SubLObject border = (true) ? ((SubLObject) (ZERO_INTEGER)) : ZERO_INTEGER;
                            html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(image_src);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            if (NIL != alt) {
                                html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(alt);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != align) {
                                html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align(align));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != border) {
                                html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(border);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_24 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_24, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                            html_utilities.html_markup($$$Return_to_Table_of_Contents);
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            html_utilities.html_terpri(UNPROVIDED);
            html_utilities.html_br();
            html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
            return NIL;
        }
    }

    /**
     * Prints standard footer for a vocab page.
     *
     * @return nil.
     */
    public static final SubLObject html_vocab_footer() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_terpri(UNPROVIDED);
            html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
            html_utilities.html_terpri(UNPROVIDED);
            if (NIL == $vocab_page_dynamic_contextP$.getDynamicValue(thread)) {
                html_utilities.html_terpri(UNPROVIDED);
                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
            }
            html_utilities.html_terpri(UNPROVIDED);
            html_go_to_top();
            html_utilities.html_br();
            return NIL;
        }
    }

    /**
     * Prints standard warning for a vocab page.
     *
     * @return nil.
     */
    public static final SubLObject html_vocab_warning() {
        html_utilities.html_markup($str_alt56$This_HTML_file_has_been_generated);
        return NIL;
    }

    /**
     * Prints go to top link.
     *
     * @return nil.
     */
    public static final SubLObject html_go_to_top() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup($str_alt57$_top);
            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    {
                        SubLObject image_src = cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src($VOCAB_SMALL_BALL));
                        SubLObject align = $CENTER;
                        SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string($VOCAB_SMALL_BALL);
                        SubLObject border = ZERO_INTEGER;
                        html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(image_src);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        if (NIL != alt) {
                            html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(alt);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (NIL != align) {
                            html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align(align));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (NIL != border) {
                            html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(border);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_25 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_25, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                        html_utilities.html_markup($$$Go_to_Top);
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            html_utilities.html_terpri(UNPROVIDED);
            return NIL;
        }
    }

    /**
     * Prints link to find-constant script.
     *
     * @return nil.
     */
    public static final SubLObject html_vocab_find_constant() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup($str_alt59$find_constant_html);
            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    {
                        SubLObject image_src = cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src($VOCAB_SMALL_BALL));
                        SubLObject align = $CENTER;
                        SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string($VOCAB_SMALL_BALL);
                        SubLObject border = (true) ? ((SubLObject) (ZERO_INTEGER)) : ZERO_INTEGER;
                        html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(image_src);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        if (NIL != alt) {
                            html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(alt);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (NIL != align) {
                            html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align(align));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (NIL != border) {
                            html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(border);
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
                        html_utilities.html_markup($$$Search_for_Constants_by_Name);
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            html_utilities.html_markup($str_alt61$__In_all_files__not_just_this_one);
            html_utilities.html_terpri(UNPROVIDED);
            return NIL;
        }
    }

    /**
     * Generates html for all elements of a #$cycSubjectClumpSyntaxList.
     *
     * @return nil.
     */
    public static final SubLObject generate_syntax_list_html(SubLObject syntaxlist) {
        {
            SubLObject cdolist_list_var = syntaxlist;
            SubLObject syntax_element = NIL;
            for (syntax_element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , syntax_element = cdolist_list_var.first()) {
                if (NIL != isa.isaP(syntax_element, $$CycSubjectClump, $$CycSubjectClumpsMt, UNPROVIDED)) {
                    generate_sub_clump_html(syntax_element);
                } else
                    if (NIL != isa.isaP(syntax_element, $$CycSubjectClumpImageFile, $$CycSubjectClumpsMt, UNPROVIDED)) {
                        generate_image_html(syntax_element);
                    } else
                        if (NIL != isa.isaP(syntax_element, $$CycSubjectClumpTextBlock, $$CycSubjectClumpsMt, UNPROVIDED)) {
                            generate_text_block_html(syntax_element);
                        } else
                            if (NIL != isa.isaP(syntax_element, $$CycSubjectClumpHTMLBlock, $$CycSubjectClumpsMt, UNPROVIDED)) {
                                generate_html_block_html(syntax_element);
                            } else
                                if (NIL != forts.fort_p(syntax_element)) {
                                    generate_term_html(syntax_element);
                                } else {
                                    Errors.error($str_alt66$Unknown_object_in_syntax_list__, syntax_element);
                                }




            }
        }
        return NIL;
    }

    /**
     * Generates html for all terms in a clump. Only called for clumps which have
     * no syntax list.
     *
     * @return nil.
     */
    public static final SubLObject generate_clump_terms_html(SubLObject clump) {
        {
            SubLObject terms = kb_mapping_utilities.pred_values_in_mt(clump, $$cycSubjectClumps, $$CycSubjectClumpsMt, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
            SubLObject sub_clumps = kb_mapping_utilities.pred_values_in_mt(clump, $$superSubjectClump, $$CycSubjectClumpsMt, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
            {
                SubLObject cdolist_list_var = terms;
                SubLObject v_term = NIL;
                for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                    generate_term_html(v_term);
                }
            }
            {
                SubLObject cdolist_list_var = sub_clumps;
                SubLObject sub_clump = NIL;
                for (sub_clump = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sub_clump = cdolist_list_var.first()) {
                    generate_sub_clump_html(sub_clump);
                }
            }
        }
        return NIL;
    }

    /**
     * Generates html to include an image in the vocab page being generated.
     *
     * @return nil.
     */
    public static final SubLObject generate_image_html(SubLObject image) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject image_file = kb_mapping_utilities.fpred_value_in_mt(image, $$salientImagePathnamePrintString, $$CycSubjectClumpsMt, ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(image_file);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject generate_html_block_html(SubLObject text_block) {
        {
            SubLObject text = kb_mapping_utilities.fpred_value_in_mt(text_block, $$textOfTextGroup, $$CycSubjectClumpsMt, ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
            html_utilities.html_markup(text);
            html_utilities.html_br();
            html_utilities.html_br();
        }
        return NIL;
    }

    /**
     * Generates html to include a text block in the vocab page being generated.
     *
     * @return nil.
     */
    public static final SubLObject generate_text_block_html(SubLObject text_block) {
        {
            SubLObject text = kb_mapping_utilities.fpred_value_in_mt(text_block, $$textOfTextGroup, $$CycSubjectClumpsMt, ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
            html_utilities.html_princ(text);
            html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
        }
        return NIL;
    }

    /**
     * Generates the html for a sub-clump.
     *
     * @return nil.
     */
    public static final SubLObject generate_sub_clump_html(SubLObject clump) {
        if (NIL == isa.isaP(clump, $$CycSubjectClump, $$CycSubjectClumpsMt, UNPROVIDED)) {
            Errors.error($str_alt71$argument_passed_to_generate_sub_c);
        }
        html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
        {
            SubLObject syntaxlist = kb_mapping_utilities.fpred_value_in_mt(clump, $$clumpSyntaxList, $$CycSubjectClumpsMt, UNPROVIDED, UNPROVIDED, UNPROVIDED).rest();
            SubLObject clumptitle = kb_mapping_utilities.fpred_value_in_mt(clump, $$clumpTitle, $$CycSubjectClumpsMt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_utilities.html_terpri(UNPROVIDED);
            if (NIL != clumptitle) {
                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                html_utilities.html_markup(THREE_INTEGER);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                html_utilities.html_princ(clumptitle);
                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                html_utilities.html_markup(THREE_INTEGER);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
            }
            html_utilities.html_terpri(UNPROVIDED);
            if (NIL != syntaxlist) {
                generate_syntax_list_html(syntaxlist);
            } else {
                generate_clump_terms_html(clump);
            }
        }
        return NIL;
    }

    /**
     * Generates the html for a term mentioned in the vocab pages.
     *
     * @return nil.
     */
    public static final SubLObject generate_term_html(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(fort, FORT_P);
            html_utilities.html_terpri(UNPROVIDED);
            {
                SubLObject name = misc_kb_utilities.coerce_name(fort);
                SubLObject comment_strings = NIL;
                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                html_utilities.html_markup(FOUR_INTEGER);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                if (NIL != name) {
                    html_utilities.html_markup(html_macros.$html_anchor_name$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(name);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        if (NIL != isa.isa_in_any_mtP(fort, $$Relation)) {
                            html_utilities.html_markup(fort);
                            html_utilities.html_markup($str_alt74$_);
                            html_print_args(fort);
                        } else
                            if (NIL != constant_handles.constant_p(fort)) {
                                html_utilities.html_markup(fort);
                            } else {
                                html_utilities.html_markup(narts_high.nart_el_formula(fort));
                            }

                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                html_utilities.html_markup(FOUR_INTEGER);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                html_utilities.html_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        comment_strings = kb_mapping_utilities.pred_values_in_any_mt(fort, $$comment, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject cdolist_list_var = comment_strings;
                    SubLObject comment_string = NIL;
                    for (comment_string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , comment_string = cdolist_list_var.first()) {
                        html_print_vocab_string(comment_string);
                        html_utilities.html_terpri(UNPROVIDED);
                        html_utilities.html_br();
                        html_utilities.html_br();
                        html_utilities.html_terpri(UNPROVIDED);
                    }
                }
                html_print_shared_notes(fort);
                html_utilities.html_terpri(UNPROVIDED);
                html_print_isas(fort);
                html_utilities.html_terpri(UNPROVIDED);
                if (NIL != isa.isa_in_any_mtP(fort, $$Collection)) {
                    html_print_genls(fort);
                    html_utilities.html_terpri(UNPROVIDED);
                    html_print_some_specs(fort);
                    html_utilities.html_terpri(UNPROVIDED);
                } else
                    if (NIL != isa.isa_in_any_mtP(fort, $$Relation)) {
                        if (NIL != isa.isa_in_any_mtP(fort, $$Predicate)) {
                            html_print_genlpreds(fort);
                            html_utilities.html_terpri(UNPROVIDED);
                            html_print_some_specpreds(fort);
                            html_utilities.html_terpri(UNPROVIDED);
                        } else {
                            html_print_result_isa(fort);
                            html_utilities.html_terpri(UNPROVIDED);
                            html_print_result_genl(fort);
                            html_utilities.html_terpri(UNPROVIDED);
                        }
                        html_print_arg_genl(fort);
                        html_utilities.html_terpri(UNPROVIDED);
                    }

                html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    /**
     * Handles the formatting to print the various lists of forts wanted in the
     * vocab pages.
     *
     * @return nil.
     */
    public static final SubLObject html_print_list_of_forts(SubLObject v_forts, SubLObject string, SubLObject brP) {
        if (brP == UNPROVIDED) {
            brP = T;
        }
        if (NIL != v_forts) {
            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
            html_utilities.html_princ(string);
            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
            {
                SubLObject cdolist_list_var = v_forts;
                SubLObject fort = NIL;
                for (fort = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , fort = cdolist_list_var.first()) {
                    html_utilities.html_indent(TWO_INTEGER);
                    html_fort_href(fort);
                }
            }
            if (NIL != brP) {
                html_utilities.html_terpri(UNPROVIDED);
                html_utilities.html_br();
                html_utilities.html_terpri(UNPROVIDED);
            }
        }
        return NIL;
    }

    /**
     * Prints the shared-notes on fort for the vocab pages.
     *
     * @return nil.
     */
    public static final SubLObject html_print_shared_notes(SubLObject fort) {
        {
            SubLObject shared_notes = vocab_pred_values(fort, $$sharedNotes);
            if (NIL != shared_notes) {
                html_utilities.html_princ($$$See);
                html_print_list_of_forts(shared_notes, $str_alt82$, NIL);
                html_utilities.html_indent(TWO_INTEGER);
                html_utilities.html_princ($str_alt83$for_further_documentation_);
                html_utilities.html_terpri(UNPROVIDED);
                html_utilities.html_br();
                html_utilities.html_terpri(UNPROVIDED);
            }
        }
        return NIL;
    }

    /**
     * Prints the isas of fort for the vocab pages.
     *
     * @return nil.
     */
    public static final SubLObject html_print_isas(SubLObject fort) {
        html_print_list_of_forts(vocab_isas(fort), $str_alt84$isa_, UNPROVIDED);
        return NIL;
    }

    /**
     * Prints the genl-preds of fort for the vocab pages.
     *
     * @return nil.
     */
    public static final SubLObject html_print_genlpreds(SubLObject fort) {
        html_print_list_of_forts(vocab_pred_values(fort, $$genlPreds), $str_alt86$genlPreds_, UNPROVIDED);
        return NIL;
    }

    /**
     * Prints the genls of fort for the vocab pages.
     *
     * @return nil.
     */
    public static final SubLObject html_print_genls(SubLObject fort) {
        html_print_list_of_forts(vocab_pred_values(fort, $$genls), $str_alt88$genls_, UNPROVIDED);
        return NIL;
    }

    /**
     * Prints the result-isa of fort for the vocab pages.
     *
     * @return nil.
     */
    public static final SubLObject html_print_result_isa(SubLObject fort) {
        html_print_list_of_forts(vocab_pred_values(fort, $$resultIsa), $str_alt90$resultIsa_, UNPROVIDED);
        return NIL;
    }

    /**
     * Prints the result-genl of fort for the vocab pages.
     *
     * @return nil.
     */
    public static final SubLObject html_print_result_genl(SubLObject fort) {
        html_print_list_of_forts(vocab_pred_values(fort, $$resultGenl), $str_alt92$resultGenl_, UNPROVIDED);
        return NIL;
    }

    /**
     * Prints the arg-isas of fort for the vocab pages.
     *
     * @return nil.
     */
    public static final SubLObject html_print_args(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_arity = kb_mapping_utilities.fpred_value_in_any_mt(fort, $$arity, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject arg_assertions = NIL;
                if (NIL != v_arity) {
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            arg_assertions = kb_mapping.gather_gaf_arg_index(fort, ONE_INTEGER, $$argIsa, UNPROVIDED, UNPROVIDED);
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                    {
                        SubLObject count = NIL;
                        for (count = ONE_INTEGER; !count.numG(v_arity); count = add(count, ONE_INTEGER)) {
                            {
                                SubLObject arg = find_arg(arg_assertions, count);
                                html_print_arg(arg);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Print args of predicate.
     *
     * @return nil.
     */
    public static final SubLObject html_print_arg(SubLObject arg) {
        html_utilities.html_indent(TWO_INTEGER);
        html_utilities.html_markup($str_alt95$_lt);
        html_fort_href(arg);
        html_utilities.html_markup($str_alt96$_gt);
        return NIL;
    }

    /**
     * Print arg-genl assertions of fort for vocab pages.
     *
     * @return nil.
     */
    public static final SubLObject html_print_arg_genl(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_arity = kb_mapping_utilities.fpred_value_in_any_mt(fort, $$arity, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject arg_genl_assertions = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        arg_genl_assertions = kb_mapping.gather_gaf_arg_index(fort, ONE_INTEGER, $$argGenl, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL != v_arity) {
                    {
                        SubLObject count = NIL;
                        for (count = ZERO_INTEGER; count != v_arity; count = add(count, ONE_INTEGER)) {
                            {
                                SubLObject args = find_arg_genl(arg_genl_assertions, add(count, ONE_INTEGER));
                                html_print_arg_n_genl(args, add(count, ONE_INTEGER));
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Print arg-n-genls assertions for a fort in the vocab pages.
     *
     * @return nil.
     */
    public static final SubLObject html_print_arg_n_genl(SubLObject args, SubLObject index) {
        if (NIL != args) {
            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
            if (index == ONE_INTEGER) {
                html_utilities.html_markup($str_alt98$arg1Genl_);
            } else
                if (index == TWO_INTEGER) {
                    html_utilities.html_markup($str_alt99$arg2Genl_);
                } else
                    if (index == THREE_INTEGER) {
                        html_utilities.html_markup($str_alt100$arg3Genl_);
                    } else
                        if (index == FOUR_INTEGER) {
                            html_utilities.html_markup($str_alt101$arg4Genl_);
                        } else
                            if (index == FIVE_INTEGER) {
                                html_utilities.html_markup($str_alt102$arg5Genl_);
                            } else
                                if (index == SIX_INTEGER) {
                                    html_utilities.html_markup($str_alt103$arg6Genl_);
                                }





            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
            {
                SubLObject cdolist_list_var = args;
                SubLObject arg = NIL;
                for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                    html_utilities.html_indent(TWO_INTEGER);
                    html_utilities.html_markup(arg);
                }
            }
        }
        return NIL;
    }

    /**
     * Print 'some subsets' information for a fort in the vocab pages.
     *
     * @return nil.
     */
    public static final SubLObject html_print_some_specs(SubLObject fort) {
        html_print_list_of_forts(vocab_max_specs(fort), $str_alt104$Some_subsets_, UNPROVIDED);
        return NIL;
    }

    /**
     * Print 'some specpreds' info for a fort.
     *
     * @return nil.
     */
    public static final SubLObject html_print_some_specpreds(SubLObject fort) {
        html_print_list_of_forts(vocab_max_specpreds(fort), $str_alt105$Some_specPreds_, UNPROVIDED);
        return NIL;
    }

    /**
     * Identifies constants in a string and creates hyperlinks to them in the
     * vocab pages.
     *
     * @return nil.
     */
    public static final SubLObject html_print_vocab_string(SubLObject string) {
        {
            SubLObject string_length = length(string);
            SubLObject string_var = string;
            SubLObject end_var = length(string_var);
            SubLObject end_var_27 = end_var;
            SubLObject string_index = NIL;
            for (string_index = ZERO_INTEGER; !string_index.numGE(end_var_27); string_index = number_utilities.f_1X(string_index)) {
                {
                    SubLObject this_char = Strings.sublisp_char(string_var, string_index);
                    if ((NIL != charE(this_char, CHAR_hash)) && (NIL != charE(Strings.sublisp_char(string, add(string_index, ONE_INTEGER)), constant_reader.constant_reader_macro_char()))) {
                        {
                            SubLObject constant = get_constant_from_string(string, add(string_index, TWO_INTEGER));
                            if (NIL != constant) {
                                html_fort_href(constant);
                                string_index = add(string_index, add(TWO_INTEGER, length(constants_high.constant_name(constant))));
                            }
                        }
                    }
                    if (string_index.numL(string_length)) {
                        html_utilities.html_princ(Strings.sublisp_char(string, string_index));
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Gets the constants related to <fort> by <pred>.
     *
     * @return list.
     */
    public static final SubLObject vocab_pred_values(SubLObject fort, SubLObject pred) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject all_pred_values = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        all_pred_values = kb_mapping_utilities.pred_values(fort, pred, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return all_pred_values;
            }
        }
    }

    /**
     * Gets the isas to be listed for a fort in the vocab pages.
     *
     * @return list.
     */
    public static final SubLObject vocab_isas(SubLObject fort) {
        {
            SubLObject all_isas = NIL;
            all_isas = remove_if($sym106$QUOTED_COLLECTION_, vocab_pred_values(fort, $$isa), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return all_isas;
        }
    }

    /**
     * Gets the maximal specs of fort for display in the vocab pages.
     *
     * @return list.
     */
    public static final SubLObject vocab_max_specs(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject maxspecs = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        maxspecs = genls.max_specs(fort, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                maxspecs = remove_if(NART_P, maxspecs, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return maxspecs;
            }
        }
    }

    /**
     * Gets maximal spec-preds of fort for display in the vocab pages.
     *
     * @return list.
     */
    public static final SubLObject vocab_max_specpreds(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject maxspecpreds = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        maxspecpreds = genl_predicates.max_spec_predicates(fort, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return maxspecpreds;
            }
        }
    }

    /**
     * Gets the arg<index>Isa restriction on fort from the list of all argIsa
     * assertions.  Assumed to be functional (first value found is returned).
     *
     * @return fort or nil.
     */
    public static final SubLObject find_arg(SubLObject arg_assertions, SubLObject index) {
        {
            SubLObject cdolist_list_var = arg_assertions;
            SubLObject arg_ass = NIL;
            for (arg_ass = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg_ass = cdolist_list_var.first()) {
                {
                    SubLObject form = assertions_high.assertion_formula(arg_ass);
                    if (third(form) == index) {
                        return fourth(form);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Gets the arg-genl value for a particular place from the list of all
     * arg-genls assertions on a particular fort.  Value returned is not assumed
     * to be unique.
     *
     * @return list.
     */
    public static final SubLObject find_arg_genl(SubLObject arg_genl_assertions, SubLObject index) {
        {
            SubLObject returns = NIL;
            SubLObject cdolist_list_var = arg_genl_assertions;
            SubLObject arg_genl_ass = NIL;
            for (arg_genl_ass = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg_genl_ass = cdolist_list_var.first()) {
                {
                    SubLObject form = assertions_high.assertion_formula(arg_genl_ass);
                    if (third(form) == index) {
                        returns = cons(fourth(form), returns);
                    }
                }
            }
            return list_utilities.fast_delete_duplicates(returns, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    /**
     * Returns all vocab clumps containing fort.
     *
     * @return list.
     */
    public static final SubLObject vocab_clumps_for_term(SubLObject fort) {
        if (((NIL != forts.fort_p(fort)) && (NIL != constants_high.find_constant($$$cycSubjectClumps))) && (NIL != constants_high.find_constant($$$CycSubjectClumpsMt))) {
            {
                SubLObject clumps = kb_mapping_utilities.pred_values_in_mt(fort, $$cycSubjectClumps, $$CycSubjectClumpsMt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject vclumps = get_vclumps_for_clumps(clumps);
                return vclumps;
            }
        } else {
            return NIL;
        }
    }

    /**
     * Returns the list of vocab clumps containing all clumps in list.
     *
     * @return list.
     */
    public static final SubLObject get_vclumps_for_clumps(SubLObject clumps) {
        {
            SubLObject returns = NIL;
            SubLObject cdolist_list_var = clumps;
            SubLObject clump = NIL;
            for (clump = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , clump = cdolist_list_var.first()) {
                returns = cons(find_vocab_clump_for_clump(clump), returns);
            }
            return remove_duplicates(returns, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    /**
     * Gets the vocab-clump to which a fort belongs.
     *
     * @return fort (clump) or nil.
     */
    public static final SubLObject find_vocab_clump_for_term(SubLObject fort) {
        if (NIL != fort) {
            {
                SubLObject clumps = kb_mapping_utilities.pred_values_in_mt(fort, $$cycSubjectClumps, $$CycSubjectClumpsMt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != list_utilities.lengthE(clumps, ONE_INTEGER, UNPROVIDED)) {
                    return find_vocab_clump_for_clump(clumps.first());
                }
            }
            {
                SubLObject main_clump = kb_mapping_utilities.fpred_value_in_mt(fort, $$mainSubjectClump, $$CycSubjectClumpsMt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != main_clump) {
                    return find_vocab_clump_for_clump(main_clump);
                }
            }
        }
        return NIL;
    }

    /**
     * Finds the vocab-clump to which a clump belongs.
     *
     * @return fort (clump) or nil.
     */
    public static final SubLObject find_vocab_clump_for_clump(SubLObject clump) {
        if (NIL != clump) {
            if (NIL != isa.isaP(clump, $$VocabClump, $$CycSubjectClumpsMt, UNPROVIDED)) {
                return clump;
            }
            {
                SubLObject super_clump = kb_mapping_utilities.fpred_value_in_mt(clump, $$superSubjectClump, $$CycSubjectClumpsMt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != super_clump) {
                    return find_vocab_clump_for_clump(super_clump);
                }
            }
        }
        return NIL;
    }

    /**
     * Trims a list based on context to remove proprietary/non-public constants.
     *
     * @return list.
     */
    public static final SubLObject html_remove_private(SubLObject v_forts) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $vocab_public_documentationP$.getDynamicValue(thread)) {
                v_forts = list_utilities.remove_if_not($sym112$PUBLIC_CONSTANT_, v_forts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else {
                v_forts = remove_if($sym113$PROPRIETARY_CONSTANT_, v_forts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            return v_forts;
        }
    }

    /**
     * Create an html anchor for a fort in the vocab pages.
     *
     * @return nil.
     */
    public static final SubLObject html_fort_href(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != fort) {
                if (NIL != $vocab_page_dynamic_contextP$.getDynamicValue(thread)) {
                    html_fort_dynamic_href(fort);
                } else {
                    html_fort_static_href(fort);
                }
            }
            return NIL;
        }
    }

    /**
     * Handles the creation of html anchors for forts in vocab pages in a dynamic
     * environment (i.e. while browsing).
     *
     * @return t.
     */
    public static final SubLObject html_fort_dynamic_href(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_term = fort;
                SubLObject id = cb_utilities.cb_fort_identifier(fort);
                SubLObject idstring = format(NIL, $str_alt114$_A, id);
                SubLObject vtarget = cconcatenate($str_alt115$cg_cb_term_clumps_, idstring);
                cb_utilities.cb_form(fort, UNPROVIDED, UNPROVIDED);
                html_utilities.html_terpri(UNPROVIDED);
                html_utilities.html_indent(UNPROVIDED);
                if (NIL != vocab_clumps_for_term(v_term)) {
                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(vtarget);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            {
                                SubLObject image_src = cyc_file_dependencies.cb_icon_file_path($VOCAB_SMALL_LOGO);
                                SubLObject align = $TOP;
                                SubLObject alt = cyc_file_dependencies.cb_get_icon_alt_string($VOCAB_SMALL_LOGO);
                                SubLObject border = (true) ? ((SubLObject) (ZERO_INTEGER)) : ZERO_INTEGER;
                                html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(image_src);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                if (NIL != alt) {
                                    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(alt);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (NIL != align) {
                                    html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align(align));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (NIL != border) {
                                    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(border);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_28 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_28, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                    html_utilities.html_terpri(UNPROVIDED);
                }
                return T;
            }
        }
    }

    /**
     * Handles the creation of html anchors for forts in vocab pages in a static
     * environment (i.e. the pages are being written to files.
     *
     * @return t.
     */
    public static final SubLObject html_fort_static_href(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject vocab_clump = find_vocab_clump_for_term(fort);
                if (NIL != vocab_clump) {
                    {
                        SubLObject filename = kb_mapping_utilities.fpred_value_in_mt(vocab_clump, $$vocabFilename, $$CycSubjectClumpsMt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject name = misc_kb_utilities.coerce_name(fort);
                        SubLObject target = NIL;
                        if (NIL != filename) {
                            target = cconcatenate(filename, new SubLObject[]{ $str_alt117$_, name });
                            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(target);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_fort_markup(fort);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                            html_utilities.html_terpri(UNPROVIDED);
                            return T;
                        }
                    }
                }
                html_fort_markup(fort);
                return T;
            }
        }
    }

    /**
     * Print html for a fort.
     *
     * @return nil.
     */
    public static final SubLObject html_fort_markup(SubLObject fort) {
        SubLSystemTrampolineFile.checkType(fort, FORT_P);
        if (NIL != constant_handles.constant_p(fort)) {
            html_utilities.html_markup(fort);
        } else {
            html_utilities.html_markup(narts_high.nart_el_formula(fort));
        }
        return NIL;
    }

    /**
     * Reads in a constant from a chunk of a string.
     *
     * @return constant.
     */
    public static final SubLObject get_constant_from_string(SubLObject string, SubLObject start) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        {
            SubLObject constant = NIL;
            SubLObject l = length(string);
            SubLObject end = start;
            SubLObject token = NIL;
            SubLObject stop = NIL;
            if (!start.numGE(l)) {
                {
                    SubLObject i = NIL;
                    for (i = start; !(i.numGE(l) || (NIL != stop)); i = add(i, ONE_INTEGER)) {
                        if (NIL != constant_completion_high.valid_constant_name_char_p(Strings.sublisp_char(string, i))) {
                            end = add(end, ONE_INTEGER);
                        } else {
                            stop = T;
                        }
                    }
                }
                if (end.numG(start)) {
                    token = string_utilities.substring(string, start, end);
                }
                if (token.isString()) {
                    constant = constants_high.find_constant(token);
                    if (NIL == constant) {
                        constant = constant_completion_high.constant_complete(token, T, T, UNPROVIDED, UNPROVIDED).first();
                    }
                    if (NIL == constant) {
                        {
                            SubLObject qmark = ZERO_INTEGER;
                            if ((NIL != char_equal(CHAR_question, Strings.sublisp_char(string, subtract(end, ONE_INTEGER)))) && subtract(end, ONE_INTEGER).numG(start)) {
                                qmark = ONE_INTEGER;
                                token = string_utilities.substring(string, start, subtract(end, ONE_INTEGER));
                                constant = constant_completion_high.constant_complete(token, T, T, UNPROVIDED, UNPROVIDED).first();
                            }
                            if (NIL == constant) {
                                if ((NIL != char_equal(CHAR_s, Strings.sublisp_char(string, subtract(end, add(qmark, ONE_INTEGER))))) && subtract(end, add(qmark, ONE_INTEGER)).numG(start)) {
                                    token = string_utilities.substring(string, start, subtract(end, add(qmark, ONE_INTEGER)));
                                    constant = constant_completion_high.constant_complete(token, T, T, UNPROVIDED, UNPROVIDED).first();
                                    if (NIL == constant) {
                                        if ((NIL != char_equal(CHAR_e, Strings.sublisp_char(string, subtract(end, add(qmark, TWO_INTEGER))))) && subtract(end, add(qmark, TWO_INTEGER)).numG(start)) {
                                            token = string_utilities.substring(string, start, subtract(end, add(qmark, TWO_INTEGER)));
                                            constant = constant_completion_high.constant_complete(token, T, T, UNPROVIDED, UNPROVIDED).first();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return constant;
        }
    }

    public static final SubLObject declare_vocab_pages_file() {
        declareFunction("generate_vocab_files", "GENERATE-VOCAB-FILES", 0, 1, false);
        declareFunction("generate_vocab_toc_file", "GENERATE-VOCAB-TOC-FILE", 0, 0, false);
        declareFunction("generate_vocab_file", "GENERATE-VOCAB-FILE", 1, 0, false);
        declareFunction("cb_term_clumps", "CB-TERM-CLUMPS", 1, 0, false);
        declareFunction("cb_vocab_contents", "CB-VOCAB-CONTENTS", 0, 1, false);
        declareFunction("generate_vocab_toc", "GENERATE-VOCAB-TOC", 0, 0, false);
        declareFunction("get_vocab_name_hash", "GET-VOCAB-NAME-HASH", 0, 0, false);
        declareFunction("get_titles_from_clumps", "GET-TITLES-FROM-CLUMPS", 1, 0, false);
        declareFunction("clump_title", "CLUMP-TITLE", 1, 0, false);
        declareFunction("get_clump_from_title", "GET-CLUMP-FROM-TITLE", 1, 0, false);
        declareFunction("html_clump_list", "HTML-CLUMP-LIST", 1, 0, false);
        declareFunction("html_clump_link", "HTML-CLUMP-LINK", 1, 0, false);
        declareFunction("cb_vocab_page", "CB-VOCAB-PAGE", 1, 0, false);
        declareFunction("generate_vocab_page", "GENERATE-VOCAB-PAGE", 1, 0, false);
        declareFunction("html_vocab_header", "HTML-VOCAB-HEADER", 1, 0, false);
        declareFunction("html_vocab_footer", "HTML-VOCAB-FOOTER", 0, 0, false);
        declareFunction("html_vocab_warning", "HTML-VOCAB-WARNING", 0, 0, false);
        declareFunction("html_go_to_top", "HTML-GO-TO-TOP", 0, 0, false);
        declareFunction("html_vocab_find_constant", "HTML-VOCAB-FIND-CONSTANT", 0, 0, false);
        declareFunction("generate_syntax_list_html", "GENERATE-SYNTAX-LIST-HTML", 1, 0, false);
        declareFunction("generate_clump_terms_html", "GENERATE-CLUMP-TERMS-HTML", 1, 0, false);
        declareFunction("generate_image_html", "GENERATE-IMAGE-HTML", 1, 0, false);
        declareFunction("generate_html_block_html", "GENERATE-HTML-BLOCK-HTML", 1, 0, false);
        declareFunction("generate_text_block_html", "GENERATE-TEXT-BLOCK-HTML", 1, 0, false);
        declareFunction("generate_sub_clump_html", "GENERATE-SUB-CLUMP-HTML", 1, 0, false);
        declareFunction("generate_term_html", "GENERATE-TERM-HTML", 1, 0, false);
        declareFunction("html_print_list_of_forts", "HTML-PRINT-LIST-OF-FORTS", 2, 1, false);
        declareFunction("html_print_shared_notes", "HTML-PRINT-SHARED-NOTES", 1, 0, false);
        declareFunction("html_print_isas", "HTML-PRINT-ISAS", 1, 0, false);
        declareFunction("html_print_genlpreds", "HTML-PRINT-GENLPREDS", 1, 0, false);
        declareFunction("html_print_genls", "HTML-PRINT-GENLS", 1, 0, false);
        declareFunction("html_print_result_isa", "HTML-PRINT-RESULT-ISA", 1, 0, false);
        declareFunction("html_print_result_genl", "HTML-PRINT-RESULT-GENL", 1, 0, false);
        declareFunction("html_print_args", "HTML-PRINT-ARGS", 1, 0, false);
        declareFunction("html_print_arg", "HTML-PRINT-ARG", 1, 0, false);
        declareFunction("html_print_arg_genl", "HTML-PRINT-ARG-GENL", 1, 0, false);
        declareFunction("html_print_arg_n_genl", "HTML-PRINT-ARG-N-GENL", 2, 0, false);
        declareFunction("html_print_some_specs", "HTML-PRINT-SOME-SPECS", 1, 0, false);
        declareFunction("html_print_some_specpreds", "HTML-PRINT-SOME-SPECPREDS", 1, 0, false);
        declareFunction("html_print_vocab_string", "HTML-PRINT-VOCAB-STRING", 1, 0, false);
        declareFunction("vocab_pred_values", "VOCAB-PRED-VALUES", 2, 0, false);
        declareFunction("vocab_isas", "VOCAB-ISAS", 1, 0, false);
        declareFunction("vocab_max_specs", "VOCAB-MAX-SPECS", 1, 0, false);
        declareFunction("vocab_max_specpreds", "VOCAB-MAX-SPECPREDS", 1, 0, false);
        declareFunction("find_arg", "FIND-ARG", 2, 0, false);
        declareFunction("find_arg_genl", "FIND-ARG-GENL", 2, 0, false);
        declareFunction("vocab_clumps_for_term", "VOCAB-CLUMPS-FOR-TERM", 1, 0, false);
        declareFunction("get_vclumps_for_clumps", "GET-VCLUMPS-FOR-CLUMPS", 1, 0, false);
        declareFunction("find_vocab_clump_for_term", "FIND-VOCAB-CLUMP-FOR-TERM", 1, 0, false);
        declareFunction("find_vocab_clump_for_clump", "FIND-VOCAB-CLUMP-FOR-CLUMP", 1, 0, false);
        declareFunction("html_remove_private", "HTML-REMOVE-PRIVATE", 1, 0, false);
        declareFunction("html_fort_href", "HTML-FORT-HREF", 1, 0, false);
        declareFunction("html_fort_dynamic_href", "HTML-FORT-DYNAMIC-HREF", 1, 0, false);
        declareFunction("html_fort_static_href", "HTML-FORT-STATIC-HREF", 1, 0, false);
        declareFunction("html_fort_markup", "HTML-FORT-MARKUP", 1, 0, false);
        declareFunction("get_constant_from_string", "GET-CONSTANT-FROM-STRING", 1, 1, false);
        return NIL;
    }

    public static final SubLObject init_vocab_pages_file() {
        defvar("*VOCAB-PUBLIC-DOCUMENTATION?*", NIL);
        defvar("*VOCAB-PAGE-DYNAMIC-CONTEXT?*", T);
        defconstant("*ALPHABET*", $list_alt0);
        deflexical("*VOCAB-STATIC-DIRECTORY*", $str_alt1$_cyc_httpd_htdocs_cycdoc_new_voca);
        return NIL;
    }

    public static final SubLObject setup_vocab_pages_file() {
                sethash($VOCAB_SMALL_BALL, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), list($str_alt3$cyc_ball_sm_gif, NIL));
        sethash($VOCAB_SMALL_LOGO, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str_alt5$sm_clumps_gif, NIL));
        sethash($SUBJECTS_BROWSER, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str_alt7$subjects_browser_gif, NIL));
        sethash($SUBJECTS_BROWSER_DISABLED, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str_alt9$subjects_browser_disabled_gif, NIL));
        {
            SubLObject old = cb_adornments.$cb_adornment_table$.getGlobalValue();
            SubLObject v_new = cb_adornments.make_adornment($list_alt10);
            cb_adornments._csetf_adornment_name(v_new, VCLUMPS);
            cb_adornments.$cb_adornment_table$.setGlobalValue(cons(v_new, delete(VCLUMPS, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        }
        html_macros.note_html_handler_function(CB_TERM_CLUMPS);
        html_macros.note_html_handler_function(CB_VOCAB_CONTENTS);
        html_macros.note_html_handler_function(CB_VOCAB_PAGE);
        return NIL;
    }

    // // Internal Constants
    static private final SubLList $list_alt0 = list(new SubLObject[]{ CHAR_A, CHAR_B, CHAR_C, CHAR_D, CHAR_E, CHAR_F, CHAR_G, CHAR_H, CHAR_I, CHAR_J, CHAR_K, CHAR_L, CHAR_M, CHAR_N, CHAR_O, CHAR_P, CHAR_Q, CHAR_R, CHAR_S, CHAR_T, CHAR_U, CHAR_V, CHAR_W, CHAR_X, CHAR_Y, CHAR_Z });

    static private final SubLString $str_alt1$_cyc_httpd_htdocs_cycdoc_new_voca = makeString("/cyc/httpd/htdocs/cycdoc/new-vocab/");

    private static final SubLSymbol $VOCAB_SMALL_BALL = makeKeyword("VOCAB-SMALL-BALL");

    static private final SubLString $str_alt3$cyc_ball_sm_gif = makeString("cyc-ball-sm.gif");

    private static final SubLSymbol $VOCAB_SMALL_LOGO = makeKeyword("VOCAB-SMALL-LOGO");

    static private final SubLString $str_alt5$sm_clumps_gif = makeString("sm-clumps.gif");

    private static final SubLSymbol $SUBJECTS_BROWSER = makeKeyword("SUBJECTS-BROWSER");

    static private final SubLString $str_alt7$subjects_browser_gif = makeString("subjects-browser.gif");

    private static final SubLSymbol $SUBJECTS_BROWSER_DISABLED = makeKeyword("SUBJECTS-BROWSER-DISABLED");

    static private final SubLString $str_alt9$subjects_browser_disabled_gif = makeString("subjects-browser-disabled.gif");

    static private final SubLList $list_alt10 = list(new SubLObject[]{ $TYPE, makeKeyword("INDEX-FORT"), makeKeyword("ACTIVE-P"), T, makeKeyword("IMAGE"), makeKeyword("SUBJECTS-BROWSER"), makeKeyword("IMAGE-DISABLED"), makeKeyword("SUBJECTS-BROWSER-DISABLED"), makeKeyword("IMAGE-ALT"), makeString("[Clumps]"), makeKeyword("EFFECTIVE-FN"), makeSymbol("VOCAB-CLUMPS-FOR-TERM"), makeKeyword("HANDLER"), makeString("cb-term-clumps"), $TOOL, NIL, makeKeyword("TITLE"), makeString("Subjects Browser"), makeKeyword("COMMENT"), makeString("Link to vocab pages") });

    private static final SubLSymbol VCLUMPS = makeSymbol("VCLUMPS");

    private static final SubLSymbol ADORNMENT_NAME = makeSymbol("ADORNMENT-NAME");

    public static final SubLObject $$VocabClump = constant_handles.reader_make_constant_shell(makeString("VocabClump"));

    public static final SubLObject $$CycSubjectClumpsMt = constant_handles.reader_make_constant_shell(makeString("CycSubjectClumpsMt"));

    static private final SubLString $$$Contents = makeString("Contents");

    static private final SubLString $str_alt16$toc_html = makeString("toc.html");



    static private final SubLString $str_alt18$Unable_to_open__S = makeString("Unable to open ~S");

    public static final SubLObject $$vocabFilename = constant_handles.reader_make_constant_shell(makeString("vocabFilename"));

    static private final SubLString $str_alt20$Could_not_generate_file_for__A__N = makeString("Could not generate file for ~A. No filename found.~%");

    private static final SubLSymbol CB_TERM_CLUMPS = makeSymbol("CB-TERM-CLUMPS");

    private static final SubLSymbol CB_VOCAB_CONTENTS = makeSymbol("CB-VOCAB-CONTENTS");

    static private final SubLString $str_alt23$CYC_reg_Vocabulary = makeString("CYC&reg Vocabulary");

    static private final SubLString $str_alt24$100_ = makeString("100%");

    static private final SubLString $str_alt25$http___localhost_cycdoc_upperont_ = makeString("http://localhost/cycdoc/upperont-diagram.html");

    static private final SubLString $str_alt26$Diagram_of_Selected_Concepts_from = makeString("Diagram of Selected Concepts from the Upper CYC&reg Ontology");

    static private final SubLString $str_alt27$upperont_diagram_html = makeString("upperont-diagram.html");

    static private final SubLString $str_alt28$__C = makeString("#~C");

    static private final SubLString $str_alt29$_C = makeString("~C");

    static private final SubLString $str_alt30$____ = makeString(" :: ");

    static private final SubLSymbol $sym31$STRING_ = makeSymbol("STRING<");

    public static final SubLInteger $int$26 = makeInteger(26);

    public static final SubLObject $$clumpTitle = constant_handles.reader_make_constant_shell(makeString("clumpTitle"));

    static private final SubLString $$$Possible_Subject_Clumps = makeString("Possible Subject Clumps");



    static private final SubLString $str_alt36$text_javascript = makeString("text/javascript");

    static private final SubLString $str_alt37$yui_skin_sam = makeString("yui-skin-sam");

    static private final SubLString $str_alt38$cg_cb_vocab_page_ = makeString("cg?cb-vocab-page&");

    static private final SubLString $str_alt39$_A_is_not_the_name_of_a_constant = makeString("~A is not the name of a constant");

    private static final SubLSymbol CB_VOCAB_PAGE = makeSymbol("CB-VOCAB-PAGE");

    static private final SubLString $str_alt41$argument_is_not_a___VocabClump_ = makeString("argument is not a #$VocabClump!");

    public static final SubLObject $$clumpSyntaxList = constant_handles.reader_make_constant_shell(makeString("clumpSyntaxList"));



    static private final SubLString $$$top = makeString("top");

    private static final SubLSymbol $CYCORP_SYMBOL_MEDIUM = makeKeyword("CYCORP-SYMBOL-MEDIUM");



    static private final SubLString $str_alt47$E_Mail_Comments_to__ = makeString("E-Mail Comments to: ");

    static private final SubLString $str_alt48$doc_cyc_com = makeString("doc@cyc.com");

    static private final SubLString $str_alt49$Last_Update___A__A__A__A__A__A = makeString("Last Update: ~A/~A/~A ~A:~A:~A");

    static private final SubLString $str_alt50$Copyright__copy__A = makeString("Copyright &copy ~A");

    static private final SubLString $str_alt51$Cycorp_ = makeString("Cycorp.");

    static private final SubLString $str_alt52$__All_rights_reserved_ = makeString("  All rights reserved.");

    static private final SubLString $str_alt53$cg_cb_vocab_contents = makeString("cg?cb-vocab-contents");

    static private final SubLString $$$Go_to_Table_of_Contents = makeString("Go to Table of Contents");

    static private final SubLString $$$Return_to_Table_of_Contents = makeString("Return to Table of Contents");

    static private final SubLString $str_alt56$This_HTML_file_has_been_generated = makeString("This HTML file has been generated\nautomatically.  Any changes made to it will be lost when the file is updated.\nTo make permanent changes to this file refer to the #$CycSubjectClump\ndocumentation in the KB.");

    static private final SubLString $str_alt57$_top = makeString("#top");

    static private final SubLString $$$Go_to_Top = makeString("Go to Top");

    static private final SubLString $str_alt59$find_constant_html = makeString("find-constant.html");

    static private final SubLString $$$Search_for_Constants_by_Name = makeString("Search for Constants by Name");

    static private final SubLString $str_alt61$__In_all_files__not_just_this_one = makeString(" (In all files, not just this one.)");

    public static final SubLObject $$CycSubjectClump = constant_handles.reader_make_constant_shell(makeString("CycSubjectClump"));

    public static final SubLObject $$CycSubjectClumpImageFile = constant_handles.reader_make_constant_shell(makeString("CycSubjectClumpImageFile"));

    public static final SubLObject $$CycSubjectClumpTextBlock = constant_handles.reader_make_constant_shell(makeString("CycSubjectClumpTextBlock"));

    public static final SubLObject $$CycSubjectClumpHTMLBlock = constant_handles.reader_make_constant_shell(makeString("CycSubjectClumpHTMLBlock"));

    static private final SubLString $str_alt66$Unknown_object_in_syntax_list__ = makeString("Unknown object in syntax list: ");

    public static final SubLObject $$cycSubjectClumps = constant_handles.reader_make_constant_shell(makeString("cycSubjectClumps"));

    public static final SubLObject $$superSubjectClump = constant_handles.reader_make_constant_shell(makeString("superSubjectClump"));

    public static final SubLObject $$salientImagePathnamePrintString = constant_handles.reader_make_constant_shell(makeString("salientImagePathnamePrintString"));

    public static final SubLObject $$textOfTextGroup = constant_handles.reader_make_constant_shell(makeString("textOfTextGroup"));

    static private final SubLString $str_alt71$argument_passed_to_generate_sub_c = makeString("argument passed to generate-sub-clump-html was not a #$CycSubjectClump!");



    public static final SubLObject $$Relation = constant_handles.reader_make_constant_shell(makeString("Relation"));

    static private final SubLString $str_alt74$_ = makeString(":");



    public static final SubLObject $$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));

    public static final SubLObject $$comment = constant_handles.reader_make_constant_shell(makeString("comment"));

    public static final SubLObject $$Collection = constant_handles.reader_make_constant_shell(makeString("Collection"));

    public static final SubLObject $$Predicate = constant_handles.reader_make_constant_shell(makeString("Predicate"));

    public static final SubLObject $$sharedNotes = constant_handles.reader_make_constant_shell(makeString("sharedNotes"));

    static private final SubLString $$$See = makeString("See");

    static private final SubLString $str_alt82$ = makeString("");

    static private final SubLString $str_alt83$for_further_documentation_ = makeString("for further documentation.");

    static private final SubLString $str_alt84$isa_ = makeString("isa:");

    public static final SubLObject $$genlPreds = constant_handles.reader_make_constant_shell(makeString("genlPreds"));

    static private final SubLString $str_alt86$genlPreds_ = makeString("genlPreds:");

    public static final SubLObject $$genls = constant_handles.reader_make_constant_shell(makeString("genls"));

    static private final SubLString $str_alt88$genls_ = makeString("genls:");

    public static final SubLObject $$resultIsa = constant_handles.reader_make_constant_shell(makeString("resultIsa"));

    static private final SubLString $str_alt90$resultIsa_ = makeString("resultIsa:");

    public static final SubLObject $$resultGenl = constant_handles.reader_make_constant_shell(makeString("resultGenl"));

    static private final SubLString $str_alt92$resultGenl_ = makeString("resultGenl:");

    public static final SubLObject $$arity = constant_handles.reader_make_constant_shell(makeString("arity"));

    public static final SubLObject $$argIsa = constant_handles.reader_make_constant_shell(makeString("argIsa"));

    static private final SubLString $str_alt95$_lt = makeString("&lt");

    static private final SubLString $str_alt96$_gt = makeString("&gt");

    public static final SubLObject $$argGenl = constant_handles.reader_make_constant_shell(makeString("argGenl"));

    static private final SubLString $str_alt98$arg1Genl_ = makeString("arg1Genl:");

    static private final SubLString $str_alt99$arg2Genl_ = makeString("arg2Genl:");

    static private final SubLString $str_alt100$arg3Genl_ = makeString("arg3Genl:");

    static private final SubLString $str_alt101$arg4Genl_ = makeString("arg4Genl:");

    static private final SubLString $str_alt102$arg5Genl_ = makeString("arg5Genl:");

    static private final SubLString $str_alt103$arg6Genl_ = makeString("arg6Genl:");

    static private final SubLString $str_alt104$Some_subsets_ = makeString("Some subsets:");

    static private final SubLString $str_alt105$Some_specPreds_ = makeString("Some specPreds:");

    static private final SubLSymbol $sym106$QUOTED_COLLECTION_ = makeSymbol("QUOTED-COLLECTION?");

    public static final SubLObject $$isa = constant_handles.reader_make_constant_shell(makeString("isa"));



    static private final SubLString $$$cycSubjectClumps = makeString("cycSubjectClumps");

    static private final SubLString $$$CycSubjectClumpsMt = makeString("CycSubjectClumpsMt");

    public static final SubLObject $$mainSubjectClump = constant_handles.reader_make_constant_shell(makeString("mainSubjectClump"));

    static private final SubLSymbol $sym112$PUBLIC_CONSTANT_ = makeSymbol("PUBLIC-CONSTANT?");

    static private final SubLSymbol $sym113$PROPRIETARY_CONSTANT_ = makeSymbol("PROPRIETARY-CONSTANT?");

    static private final SubLString $str_alt114$_A = makeString("~A");

    static private final SubLString $str_alt115$cg_cb_term_clumps_ = makeString("cg?cb-term-clumps&");



    static private final SubLString $str_alt117$_ = makeString("#");

    // // Initializers
    public void declareFunctions() {
        declare_vocab_pages_file();
    }

    public void initializeVariables() {
        init_vocab_pages_file();
    }

    public void runTopLevelForms() {
        setup_vocab_pages_file();
    }
}

