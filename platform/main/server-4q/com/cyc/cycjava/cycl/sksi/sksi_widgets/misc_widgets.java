/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sksi.sksi_widgets;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.cycjava.cycl.xml_parsing_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      MISC-WIDGETS
 * source file: /cyc/top/cycl/sksi/sksi-widgets/misc-widgets.lisp
 * created:     2019/07/03 17:38:35
 */
public final class misc_widgets extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new misc_widgets();

 public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_widgets.misc_widgets";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $$$Bug_Processed = makeString("Bug Processed");

    static private final SubLString $$$Bug_ = makeString("Bug ");

    // Definitions
    public static final SubLObject bugzilla_update_result_page_parse_alt(SubLObject tokens) {
        return list_utilities.sublisp_boolean(web_utilities.next_xml_token_position(tokens, $$$Bug_Processed, UNPROVIDED));
    }

    // Definitions
    public static SubLObject bugzilla_update_result_page_parse(final SubLObject tokens) {
        return list_utilities.sublisp_boolean(xml_parsing_utilities.next_xml_token_position(tokens, $$$Bug_Processed, UNPROVIDED));
    }

    public static final SubLObject bugzilla_new_bug_result_page_parse_alt(SubLObject tokens, SubLObject query) {
        if (query == UNPROVIDED) {
            query = NIL;
        }
        tokens = web_utilities.advance_xml_tokens_to(tokens, $str_alt1$Bug_, UNPROVIDED);
        tokens = web_utilities.advance_xml_tokens(tokens, UNPROVIDED);
        tokens = web_utilities.advance_xml_tokens_to(tokens, $str_alt1$Bug_, UNPROVIDED);
        return list(list(ZERO_INTEGER, cadr(string_utilities.split_string(tokens.first(), UNPROVIDED))));
    }

    public static SubLObject bugzilla_new_bug_result_page_parse(SubLObject tokens, SubLObject query) {
        if (query == UNPROVIDED) {
            query = NIL;
        }
        tokens = xml_parsing_utilities.advance_xml_tokens_to(tokens, $$$Bug_, UNPROVIDED);
        tokens = xml_parsing_utilities.advance_xml_tokens(tokens, UNPROVIDED);
        tokens = xml_parsing_utilities.advance_xml_tokens_to(tokens, $$$Bug_, UNPROVIDED);
        return list(list(ZERO_INTEGER, cadr(string_utilities.split_string(tokens.first(), UNPROVIDED))));
    }

    public static SubLObject declare_misc_widgets_file() {
        declareFunction("bugzilla_update_result_page_parse", "BUGZILLA-UPDATE-RESULT-PAGE-PARSE", 1, 0, false);
        declareFunction("bugzilla_new_bug_result_page_parse", "BUGZILLA-NEW-BUG-RESULT-PAGE-PARSE", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_misc_widgets_file() {
        return NIL;
    }

    public static SubLObject setup_misc_widgets_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_misc_widgets_file();
    }

    @Override
    public void initializeVariables() {
        init_misc_widgets_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_misc_widgets_file();
    }

    static private final SubLString $str_alt1$Bug_ = makeString("Bug ");

    static {
    }
}

/**
 * Total time: 63 ms
 */
