package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class rkf_user_modeler extends SubLTranslatedFile {
    public static final SubLFile me = new rkf_user_modeler();

    public static final String myName = "com.cyc.cycjava.cycl.rkf_user_modeler";

    public static final String myFingerPrint = "05c73f81acc1a5e4156d9e72de767dc5e7e322ab827c444863c4d3b89edc0692";

    // deflexical
    // Definitions
    private static final SubLSymbol $rkf_user_definition_mt$ = makeSymbol("*RKF-USER-DEFINITION-MT*");

    private static final SubLObject $$CyclistsMt = reader_make_constant_shell(makeString("CyclistsMt"));

    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));

    public static final SubLList $list2 = list(makeSymbol("?LANGUAGE"), makeSymbol("?PROMPT-STRING"));

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    public static final SubLList $list4 = list(reader_make_constant_shell(makeString("languagePostedOnUIA")), makeSymbol("?LANGUAGE"));

    private static final SubLObject $$languageSpoken = reader_make_constant_shell(makeString("languageSpoken"));

    public static final SubLList $list6 = list(makeSymbol("?LANGUAGE"));

    public static final SubLList $list7 = list(list(reader_make_constant_shell(makeString("languagePromptForUIA")), makeSymbol("?LANGUAGE"), makeSymbol("?PROMPT-STRING")));

    public static final SubLList $list8 = list(makeSymbol("LANGUAGE"), makeSymbol("PROMPT-STRING"));

    private static final SubLObject $const9$languageAvailableForUIAInteractio = reader_make_constant_shell(makeString("languageAvailableForUIAInteractions"));



    public static SubLObject rkf_user_modeler_supported_language_prompts_for_user(final SubLObject user) {
        final SubLObject mt = $$InferencePSC;
        final SubLObject pairs = ask_utilities.ask_template($list2, listS($$and, $list4, listS($$languageSpoken, user, $list6), $list7), mt, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject supported_prompts = NIL;
        SubLObject all_prompts = NIL;
        SubLObject cdolist_list_var = pairs;
        SubLObject pair = NIL;
        pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = pair;
            SubLObject language = NIL;
            SubLObject prompt_string = NIL;
            destructuring_bind_must_consp(current, datum, $list8);
            language = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list8);
            prompt_string = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != backward.removal_ask(list($const9$languageAvailableForUIAInteractio, language), mt, UNPROVIDED, UNPROVIDED)) {
                    supported_prompts = cons(list(language, prompt_string, $SUPPORTED), supported_prompts);
                } else {
                    all_prompts = cons(pair, all_prompts);
                }
            } else {
                cdestructuring_bind_error(datum, $list8);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        } 
        return append(supported_prompts, all_prompts);
    }

    public static SubLObject rkf_user_modeler_language_prompt_language(final SubLObject language_prompt) {
        return language_prompt.first();
    }

    public static SubLObject declare_rkf_user_modeler_file() {
        declareFunction(me, "rkf_user_modeler_supported_language_prompts_for_user", "RKF-USER-MODELER-SUPPORTED-LANGUAGE-PROMPTS-FOR-USER", 1, 0, false);
        declareFunction(me, "rkf_user_modeler_language_prompt_language", "RKF-USER-MODELER-LANGUAGE-PROMPT-LANGUAGE", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_rkf_user_modeler_file() {
        deflexical("*RKF-USER-DEFINITION-MT*", $$CyclistsMt);
        return NIL;
    }

    public static SubLObject setup_rkf_user_modeler_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_rkf_user_modeler_file();
    }

    @Override
    public void initializeVariables() {
        init_rkf_user_modeler_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rkf_user_modeler_file();
    }

    
}

/**
 * Total time: 72 ms
 */
