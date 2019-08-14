/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      RKF-USER-MODELER
 * source file: /cyc/top/cycl/rkf-user-modeler.lisp
 * created:     2019/07/03 17:37:59
 */
public final class rkf_user_modeler extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new rkf_user_modeler();

 public static final String myName = "com.cyc.cycjava.cycl.rkf_user_modeler";


    // deflexical
    // Definitions
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $rkf_user_definition_mt$ = makeSymbol("*RKF-USER-DEFINITION-MT*");





    static private final SubLList $list2 = list(makeSymbol("?LANGUAGE"), makeSymbol("?PROMPT-STRING"));



    static private final SubLList $list4 = list(reader_make_constant_shell("languagePostedOnUIA"), makeSymbol("?LANGUAGE"));



    static private final SubLList $list6 = list(makeSymbol("?LANGUAGE"));

    static private final SubLList $list7 = list(list(reader_make_constant_shell("languagePromptForUIA"), makeSymbol("?LANGUAGE"), makeSymbol("?PROMPT-STRING")));

    static private final SubLList $list8 = list(makeSymbol("LANGUAGE"), makeSymbol("PROMPT-STRING"));

    private static final SubLObject $const9$languageAvailableForUIAInteractio = reader_make_constant_shell("languageAvailableForUIAInteractions");

    /**
     * Return a list of language prompts to present the user, based on
     * the ones we know the user speaks.
     * Each is of the form : (language-name prompt-string &optional supported)
     */
    @LispMethod(comment = "Return a list of language prompts to present the user, based on\r\nthe ones we know the user speaks.\r\nEach is of the form : (language-name prompt-string &optional supported)\nReturn a list of language prompts to present the user, based on\nthe ones we know the user speaks.\nEach is of the form : (language-name prompt-string &optional supported)")
    public static final SubLObject rkf_user_modeler_supported_language_prompts_for_user_alt(SubLObject user) {
        {
            SubLObject mt = $$InferencePSC;
            SubLObject pairs = ask_utilities.ask_template($list_alt2, listS($$and, $list_alt4, listS($$languageSpoken, user, $list_alt6), $list_alt7), mt, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject supported_prompts = NIL;
            SubLObject all_prompts = NIL;
            SubLObject cdolist_list_var = pairs;
            SubLObject pair = NIL;
            for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                {
                    SubLObject datum = pair;
                    SubLObject current = datum;
                    SubLObject language = NIL;
                    SubLObject prompt_string = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt8);
                    language = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt8);
                    prompt_string = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (NIL != backward.removal_ask(list($const9$languageAvailableForUIAInteractio, language), mt, UNPROVIDED, UNPROVIDED)) {
                            supported_prompts = cons(list(language, prompt_string, $SUPPORTED), supported_prompts);
                        } else {
                            all_prompts = cons(pair, all_prompts);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt8);
                    }
                }
            }
            return append(supported_prompts, all_prompts);
        }
    }

    /**
     * Return a list of language prompts to present the user, based on
     * the ones we know the user speaks.
     * Each is of the form : (language-name prompt-string &optional supported)
     */
    @LispMethod(comment = "Return a list of language prompts to present the user, based on\r\nthe ones we know the user speaks.\r\nEach is of the form : (language-name prompt-string &optional supported)\nReturn a list of language prompts to present the user, based on\nthe ones we know the user speaks.\nEach is of the form : (language-name prompt-string &optional supported)")
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

    public static final SubLObject rkf_user_modeler_language_prompt_language_alt(SubLObject language_prompt) {
        return language_prompt.first();
    }

    public static SubLObject rkf_user_modeler_language_prompt_language(final SubLObject language_prompt) {
        return language_prompt.first();
    }

    public static SubLObject declare_rkf_user_modeler_file() {
        declareFunction("rkf_user_modeler_supported_language_prompts_for_user", "RKF-USER-MODELER-SUPPORTED-LANGUAGE-PROMPTS-FOR-USER", 1, 0, false);
        declareFunction("rkf_user_modeler_language_prompt_language", "RKF-USER-MODELER-LANGUAGE-PROMPT-LANGUAGE", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_rkf_user_modeler_file() {
        deflexical("*RKF-USER-DEFINITION-MT*", $$CyclistsMt);
        return NIL;
    }

    static private final SubLList $list_alt2 = list(makeSymbol("?LANGUAGE"), makeSymbol("?PROMPT-STRING"));

    public static SubLObject setup_rkf_user_modeler_file() {
        return NIL;
    }

    static private final SubLList $list_alt4 = list(reader_make_constant_shell("languagePostedOnUIA"), makeSymbol("?LANGUAGE"));

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

    static private final SubLList $list_alt6 = list(makeSymbol("?LANGUAGE"));

    static {
    }

    static private final SubLList $list_alt7 = list(list(reader_make_constant_shell("languagePromptForUIA"), makeSymbol("?LANGUAGE"), makeSymbol("?PROMPT-STRING")));

    static private final SubLList $list_alt8 = list(makeSymbol("LANGUAGE"), makeSymbol("PROMPT-STRING"));
}

/**
 * Total time: 72 ms
 */
