package com.cyc.cycjava.cycl.sksi.sksi_widgets;


import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_widgets.misc_widgets;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.xml_parsing_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.sksi.sksi_widgets.misc_widgets.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class misc_widgets extends SubLTranslatedFile {
    public static final SubLFile me = new misc_widgets();

    public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_widgets.misc_widgets";

    public static final String myFingerPrint = "b552fc2624926929befe89fee265afa733b393b3d94c5644e914f9924e1c534e";

    // Internal Constants
    public static final SubLString $$$Bug_Processed = makeString("Bug Processed");

    public static final SubLString $$$Bug_ = makeString("Bug ");

    public static SubLObject bugzilla_update_result_page_parse(final SubLObject tokens) {
        return list_utilities.sublisp_boolean(xml_parsing_utilities.next_xml_token_position(tokens, $$$Bug_Processed, UNPROVIDED));
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
        declareFunction(me, "bugzilla_update_result_page_parse", "BUGZILLA-UPDATE-RESULT-PAGE-PARSE", 1, 0, false);
        declareFunction(me, "bugzilla_new_bug_result_page_parse", "BUGZILLA-NEW-BUG-RESULT-PAGE-PARSE", 1, 1, false);
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

    static {



    }
}

/**
 * Total time: 63 ms
 */
