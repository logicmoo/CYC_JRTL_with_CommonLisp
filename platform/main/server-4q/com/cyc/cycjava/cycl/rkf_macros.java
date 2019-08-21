package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.rkf_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.rkf_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class rkf_macros extends SubLTranslatedFile {
    public static final SubLFile me = new rkf_macros();

    public static final String myName = "com.cyc.cycjava.cycl.rkf_macros";

    public static final String myFingerPrint = "78f3abfc327bfc08533df7d6e0a387867f39cdd51b08dd06f7920f33b1e1ccd8";



    // defconstant
    // LISTP of *SELECT-STRING-METHODS* to skip.
    private static final SubLSymbol $rkf_paraphrase_methods_to_skip$ = makeSymbol("*RKF-PARAPHRASE-METHODS-TO-SKIP*");

    // defparameter
    public static final SubLSymbol $rkf_speaker$ = makeSymbol("*RKF-SPEAKER*");

    // defparameter
    public static final SubLSymbol $rkf_addressee$ = makeSymbol("*RKF-ADDRESSEE*");

    // defparameter
    // Should we generate examples even when the user hasn't requested any?
    public static final SubLSymbol $rkf_always_generate_examplesP$ = makeSymbol("*RKF-ALWAYS-GENERATE-EXAMPLES?*");

    // defparameter
    // Are we in a context where we should generate examples?
    public static final SubLSymbol $rkf_ok_to_generate_examplesP$ = makeSymbol("*RKF-OK-TO-GENERATE-EXAMPLES?*");

    // Internal Constants
    public static final SubLList $list0 = list(list(makeSymbol("TOOL-CYCL")), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLSymbol $rkf_asserting_tool$ = makeSymbol("*RKF-ASSERTING-TOOL*");

    public static final SubLList $list3 = list(makeSymbol("GENITIVE-PARAPHRASE-METHOD"));

    private static final SubLObject $$Cyc = reader_make_constant_shell(makeString("Cyc"));



    public static final SubLList $list6 = list(list(makeSymbol("*PPH-GUESS-NAMES-FOR-UNLEXIFIED-TERMS?*"), list(makeSymbol("CNOT"), makeSymbol("*RKF-USE-CYCL-FOR-UNLEXIFIED-TERMS?*"))), list(makeSymbol("*PPH-SEARCH-LIMIT*"), list(makeSymbol("FIF"), makeSymbol("*RKF-USE-GENL-PREDS-FOR-PARAPHRASE?*"), TWO_INTEGER, ZERO_INTEGER)), list(makeSymbol("*PPH-SPEAKER*"), list(makeSymbol("RKF-SPEAKER"))), list(makeSymbol("*PPH-ADDRESSEE*"), list(makeSymbol("RKF-ADDRESSEE"))), list(makeSymbol("*SELECT-STRING-METHODS-TO-OMIT*"), list(makeSymbol("RKF-PARAPHRASE-METHODS-TO-SKIP"))), list(makeSymbol("*PPH-LINK-ARG0?*"), T));

    public static final SubLSymbol RKF_SPEAKER = makeSymbol("RKF-SPEAKER");

    public static final SubLSymbol WITH_RKF_PARAPHRASE_PARAMETERS = makeSymbol("WITH-RKF-PARAPHRASE-PARAMETERS");

    public static final SubLSymbol RKF_ADDRESSEE = makeSymbol("RKF-ADDRESSEE");



    public static final SubLSymbol RKF_PARAPHRASE_METHODS_TO_SKIP = makeSymbol("RKF-PARAPHRASE-METHODS-TO-SKIP");

    public static final SubLList $list12 = list(list(makeSymbol("PROMPT"), makeSymbol("SEED-TERM"), makeSymbol("MT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym13$PROMPTER = makeUninternedSymbol("PROMPTER");

    public static final SubLSymbol NEW_RKF_SALIENT_DESCRIPTOR_PROMPTER = makeSymbol("NEW-RKF-SALIENT-DESCRIPTOR-PROMPTER");

    public static final SubLSymbol RKF_SALIENT_DESCRIPTOR_PROMPTER_NEXT = makeSymbol("RKF-SALIENT-DESCRIPTOR-PROMPTER-NEXT");



    public static final SubLSymbol RKF_SALIENT_DESCRIPTOR_PROMPT_P = makeSymbol("RKF-SALIENT-DESCRIPTOR-PROMPT-P");



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

    public static SubLObject with_rkf_paraphrase_parameters(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list6, append(body, NIL));
    }

    public static SubLObject rkf_speaker() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $rkf_speaker$.getDynamicValue(thread);
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

    public static SubLObject rkf_paraphrase_methods_to_skip() {
        return $rkf_paraphrase_methods_to_skip$.getGlobalValue();
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

    public static SubLObject rkf_generate_examplesP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != $rkf_always_generate_examplesP$.getDynamicValue(thread)) || (NIL != $rkf_ok_to_generate_examplesP$.getDynamicValue(thread)));
    }

    public static SubLObject declare_rkf_macros_file() {
        declareMacro(me, "rkf_with_asserting_tool_cycl", "RKF-WITH-ASSERTING-TOOL-CYCL");
        declareMacro(me, "with_rkf_paraphrase_parameters", "WITH-RKF-PARAPHRASE-PARAMETERS");
        declareFunction(me, "rkf_speaker", "RKF-SPEAKER", 0, 0, false);
        declareFunction(me, "rkf_addressee", "RKF-ADDRESSEE", 0, 0, false);
        declareFunction(me, "rkf_paraphrase_methods_to_skip", "RKF-PARAPHRASE-METHODS-TO-SKIP", 0, 0, false);
        declareMacro(me, "do_rkf_salient_descriptor_prompts", "DO-RKF-SALIENT-DESCRIPTOR-PROMPTS");
        declareFunction(me, "rkf_generate_examplesP", "RKF-GENERATE-EXAMPLES?", 0, 0, false);
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

    public static SubLObject setup_rkf_macros_file() {
        register_macro_helper(RKF_SPEAKER, WITH_RKF_PARAPHRASE_PARAMETERS);
        register_macro_helper(RKF_ADDRESSEE, WITH_RKF_PARAPHRASE_PARAMETERS);
        register_macro_helper(RKF_PARAPHRASE_METHODS_TO_SKIP, WITH_RKF_PARAPHRASE_PARAMETERS);
        return NIL;
    }

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
}

/**
 * Total time: 29 ms
 */
