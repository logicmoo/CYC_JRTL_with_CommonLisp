/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class rkf_macros extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new rkf_macros();



    // defconstant
    // LISTP of *SELECT-STRING-METHODS* to skip.
    /**
     * LISTP of *SELECT-STRING-METHODS* to skip.
     */
    @LispMethod(comment = "LISTP of *SELECT-STRING-METHODS* to skip.\ndefconstant")
    private static final SubLSymbol $rkf_paraphrase_methods_to_skip$ = makeSymbol("*RKF-PARAPHRASE-METHODS-TO-SKIP*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $rkf_speaker$ = makeSymbol("*RKF-SPEAKER*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $rkf_addressee$ = makeSymbol("*RKF-ADDRESSEE*");

    // defparameter
    // Should we generate examples even when the user hasn't requested any?
    /**
     * Should we generate examples even when the user hasn't requested any?
     */
    @LispMethod(comment = "Should we generate examples even when the user hasn\'t requested any?\ndefparameter")
    public static final SubLSymbol $rkf_always_generate_examplesP$ = makeSymbol("*RKF-ALWAYS-GENERATE-EXAMPLES?*");

    // defparameter
    // Are we in a context where we should generate examples?
    /**
     * Are we in a context where we should generate examples?
     */
    @LispMethod(comment = "Are we in a context where we should generate examples?\ndefparameter")
    public static final SubLSymbol $rkf_ok_to_generate_examplesP$ = makeSymbol("*RKF-OK-TO-GENERATE-EXAMPLES?*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(list(makeSymbol("TOOL-CYCL")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $rkf_asserting_tool$ = makeSymbol("*RKF-ASSERTING-TOOL*");

    static private final SubLList $list3 = list(makeSymbol("GENITIVE-PARAPHRASE-METHOD"));



    static private final SubLList $list6 = list(list(makeSymbol("*PPH-GUESS-NAMES-FOR-UNLEXIFIED-TERMS?*"), list(makeSymbol("CNOT"), makeSymbol("*RKF-USE-CYCL-FOR-UNLEXIFIED-TERMS?*"))), list(makeSymbol("*PPH-SEARCH-LIMIT*"), list(makeSymbol("FIF"), makeSymbol("*RKF-USE-GENL-PREDS-FOR-PARAPHRASE?*"), TWO_INTEGER, ZERO_INTEGER)), list(makeSymbol("*PPH-SPEAKER*"), list(makeSymbol("RKF-SPEAKER"))), list(makeSymbol("*PPH-ADDRESSEE*"), list(makeSymbol("RKF-ADDRESSEE"))), list(makeSymbol("*SELECT-STRING-METHODS-TO-OMIT*"), list(makeSymbol("RKF-PARAPHRASE-METHODS-TO-SKIP"))), list(makeSymbol("*PPH-LINK-ARG0?*"), T));

    private static final SubLSymbol RKF_SPEAKER = makeSymbol("RKF-SPEAKER");

    private static final SubLSymbol WITH_RKF_PARAPHRASE_PARAMETERS = makeSymbol("WITH-RKF-PARAPHRASE-PARAMETERS");

    private static final SubLSymbol RKF_ADDRESSEE = makeSymbol("RKF-ADDRESSEE");

    private static final SubLSymbol RKF_PARAPHRASE_METHODS_TO_SKIP = makeSymbol("RKF-PARAPHRASE-METHODS-TO-SKIP");

    static private final SubLList $list12 = list(list(makeSymbol("PROMPT"), makeSymbol("SEED-TERM"), makeSymbol("MT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym13$PROMPTER = makeUninternedSymbol("PROMPTER");

    private static final SubLSymbol NEW_RKF_SALIENT_DESCRIPTOR_PROMPTER = makeSymbol("NEW-RKF-SALIENT-DESCRIPTOR-PROMPTER");

    private static final SubLSymbol RKF_SALIENT_DESCRIPTOR_PROMPTER_NEXT = makeSymbol("RKF-SALIENT-DESCRIPTOR-PROMPTER-NEXT");

    private static final SubLSymbol RKF_SALIENT_DESCRIPTOR_PROMPT_P = makeSymbol("RKF-SALIENT-DESCRIPTOR-PROMPT-P");

    public static final SubLObject rkf_with_asserting_tool_cycl_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject tool_cycl = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    tool_cycl = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CLET, list(list($rkf_asserting_tool$, tool_cycl)), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt0);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject rkf_with_asserting_tool_cycl(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject tool_cycl = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        tool_cycl = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list(list($rkf_asserting_tool$, tool_cycl)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    /**
     * Execute BODY with paraphrase parameters bound for RKF purposes.
     */
    @LispMethod(comment = "Execute BODY with paraphrase parameters bound for RKF purposes.")
    public static final SubLObject with_rkf_paraphrase_parameters_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt6, append(body, NIL));
        }
    }

    /**
     * Execute BODY with paraphrase parameters bound for RKF purposes.
     */
    @LispMethod(comment = "Execute BODY with paraphrase parameters bound for RKF purposes.")
    public static SubLObject with_rkf_paraphrase_parameters(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list6, append(body, NIL));
    }

    public static final SubLObject rkf_speaker_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $rkf_speaker$.getDynamicValue(thread);
        }
    }

    public static SubLObject rkf_speaker() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $rkf_speaker$.getDynamicValue(thread);
    }

    public static final SubLObject rkf_addressee_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pcase_var = $rkf_addressee$.getDynamicValue(thread);
                if (pcase_var.eql($NONE)) {
                    return NIL;
                } else {
                    if (pcase_var.eql($THE_CYCLIST)) {
                        return operation_communication.the_cyclist();
                    } else {
                        return $rkf_addressee$.getDynamicValue(thread);
                    }
                }
            }
        }
    }

    public static SubLObject rkf_addressee() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = $rkf_addressee$.getDynamicValue(thread);
        if (pcase_var.eql($NONE)) {
            return NIL;
        }
        if (pcase_var.eql($THE_CYCLIST)) {
            return operation_communication.the_cyclist();
        }
        return $rkf_addressee$.getDynamicValue(thread);
    }

    public static final SubLObject rkf_paraphrase_methods_to_skip_alt() {
        return $rkf_paraphrase_methods_to_skip$.getGlobalValue();
    }

    public static SubLObject rkf_paraphrase_methods_to_skip() {
        return $rkf_paraphrase_methods_to_skip$.getGlobalValue();
    }

    public static final SubLObject do_rkf_salient_descriptor_prompts_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt12);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject prompt = NIL;
                    SubLObject seed_term = NIL;
                    SubLObject mt = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt12);
                    prompt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt12);
                    seed_term = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt12);
                    mt = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject prompter = $sym13$PROMPTER;
                            return list(CLET, list(list(prompter, list(NEW_RKF_SALIENT_DESCRIPTOR_PROMPTER, seed_term, mt)), list(prompt, list(RKF_SALIENT_DESCRIPTOR_PROMPTER_NEXT, prompter))), listS(WHILE, list(RKF_SALIENT_DESCRIPTOR_PROMPT_P, prompt), append(body, list(list(CSETQ, prompt, list(RKF_SALIENT_DESCRIPTOR_PROMPTER_NEXT, prompter))))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt12);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject do_rkf_salient_descriptor_prompts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list12);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject prompt = NIL;
        SubLObject seed_term = NIL;
        SubLObject mt = NIL;
        destructuring_bind_must_consp(current, datum, $list12);
        prompt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list12);
        seed_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list12);
        mt = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject prompter = $sym13$PROMPTER;
            return list(CLET, list(list(prompter, list(NEW_RKF_SALIENT_DESCRIPTOR_PROMPTER, seed_term, mt)), list(prompt, list(RKF_SALIENT_DESCRIPTOR_PROMPTER_NEXT, prompter))), listS(WHILE, list(RKF_SALIENT_DESCRIPTOR_PROMPT_P, prompt), append(body, list(list(CSETQ, prompt, list(RKF_SALIENT_DESCRIPTOR_PROMPTER_NEXT, prompter))))));
        }
        cdestructuring_bind_error(datum, $list12);
        return NIL;
    }

    public static final SubLObject rkf_generate_examplesP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL != $rkf_always_generate_examplesP$.getDynamicValue(thread)) || (NIL != $rkf_ok_to_generate_examplesP$.getDynamicValue(thread)));
        }
    }

    public static SubLObject rkf_generate_examplesP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != $rkf_always_generate_examplesP$.getDynamicValue(thread)) || (NIL != $rkf_ok_to_generate_examplesP$.getDynamicValue(thread)));
    }

    public static SubLObject declare_rkf_macros_file() {
        declareMacro("rkf_with_asserting_tool_cycl", "RKF-WITH-ASSERTING-TOOL-CYCL");
        declareMacro("with_rkf_paraphrase_parameters", "WITH-RKF-PARAPHRASE-PARAMETERS");
        declareFunction("rkf_speaker", "RKF-SPEAKER", 0, 0, false);
        declareFunction("rkf_addressee", "RKF-ADDRESSEE", 0, 0, false);
        declareFunction("rkf_paraphrase_methods_to_skip", "RKF-PARAPHRASE-METHODS-TO-SKIP", 0, 0, false);
        declareMacro("do_rkf_salient_descriptor_prompts", "DO-RKF-SALIENT-DESCRIPTOR-PROMPTS");
        declareFunction("rkf_generate_examplesP", "RKF-GENERATE-EXAMPLES?", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_rkf_macros_file() {
        defparameter("*RKF-ASSERTING-TOOL*", NIL);
        defconstant("*RKF-PARAPHRASE-METHODS-TO-SKIP*", $list3);
        defparameter("*RKF-SPEAKER*", $$Cyc);
        defparameter("*RKF-ADDRESSEE*", $THE_CYCLIST);
        defparameter("*RKF-ALWAYS-GENERATE-EXAMPLES?*", NIL);
        defparameter("*RKF-OK-TO-GENERATE-EXAMPLES?*", NIL);
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(list(makeSymbol("TOOL-CYCL")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt3 = list(makeSymbol("GENITIVE-PARAPHRASE-METHOD"));

    public static SubLObject setup_rkf_macros_file() {
        register_macro_helper(RKF_SPEAKER, WITH_RKF_PARAPHRASE_PARAMETERS);
        register_macro_helper(RKF_ADDRESSEE, WITH_RKF_PARAPHRASE_PARAMETERS);
        register_macro_helper(RKF_PARAPHRASE_METHODS_TO_SKIP, WITH_RKF_PARAPHRASE_PARAMETERS);
        return NIL;
    }

    static private final SubLList $list_alt6 = list(list(makeSymbol("*PPH-GUESS-NAMES-FOR-UNLEXIFIED-TERMS?*"), list(makeSymbol("CNOT"), makeSymbol("*RKF-USE-CYCL-FOR-UNLEXIFIED-TERMS?*"))), list(makeSymbol("*PPH-SEARCH-LIMIT*"), list(makeSymbol("FIF"), makeSymbol("*RKF-USE-GENL-PREDS-FOR-PARAPHRASE?*"), TWO_INTEGER, ZERO_INTEGER)), list(makeSymbol("*PPH-SPEAKER*"), list(makeSymbol("RKF-SPEAKER"))), list(makeSymbol("*PPH-ADDRESSEE*"), list(makeSymbol("RKF-ADDRESSEE"))), list(makeSymbol("*SELECT-STRING-METHODS-TO-OMIT*"), list(makeSymbol("RKF-PARAPHRASE-METHODS-TO-SKIP"))), list(makeSymbol("*PPH-LINK-ARG0?*"), T));

    @Override
    public void declareFunctions() {
        declare_rkf_macros_file();
    }

    @Override
    public void initializeVariables() {
        init_rkf_macros_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rkf_macros_file();
    }

    static {
    }

    static private final SubLList $list_alt12 = list(list(makeSymbol("PROMPT"), makeSymbol("SEED-TERM"), makeSymbol("MT")), makeSymbol("&BODY"), makeSymbol("BODY"));
}

/**
 * Total time: 29 ms
 */
