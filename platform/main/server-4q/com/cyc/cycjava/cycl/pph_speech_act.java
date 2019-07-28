package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.pph_speech_act;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.pph_speech_act.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class pph_speech_act extends SubLTranslatedFile {
    public static final SubLFile me = new pph_speech_act();

    public static final String myName = "com.cyc.cycjava.cycl.pph_speech_act";

    public static final String myFingerPrint = "c368fcaa825558eef44601a6dbe00d15a0ffe16986e462a86f538549d223665c";

    // defconstant
    // Definitions
    private static final SubLSymbol $pph_forces$ = makeSymbol("*PPH-FORCES*");

    // Internal Constants
    public static final SubLList $list0 = list(makeKeyword("NONE"), makeKeyword("DECLARATIVE"), makeKeyword("INTERROGATIVE"), makeKeyword("QUESTION"), makeKeyword("IMPERATIVE"), makeKeyword("DEFAULT"));









    public static SubLObject get_pph_forces_list() {
        return copy_list($pph_forces$.getGlobalValue());
    }

    public static SubLObject pph_force_p(final SubLObject obj) {
        return subl_promotions.memberP(obj, $pph_forces$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject generate_speech_act(final SubLObject cycl, final SubLObject speaker, final SubLObject addressee, SubLObject force, SubLObject agr_pred, SubLObject language_mt, SubLObject domain_mt, SubLObject mode) {
        if (force == UNPROVIDED) {
            force = $DECLARATIVE;
        }
        if (agr_pred == UNPROVIDED) {
            agr_pred = pph_utilities.pph_present_tense_pred();
        }
        if (language_mt == UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        if (mode == UNPROVIDED) {
            mode = $TEXT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = pph_vars.$pph_speaker$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_addressee$.currentBinding(thread);
        try {
            pph_vars.$pph_speaker$.bind(speaker, thread);
            pph_vars.$pph_addressee$.bind(addressee, thread);
            final SubLObject nl_preds = (NIL != agr_pred) ? list(agr_pred) : $ANY;
            ans = pph_main.generate_text_wXsentential_force(cycl, force, nl_preds, language_mt, domain_mt, mode, UNPROVIDED);
        } finally {
            pph_vars.$pph_addressee$.rebind(_prev_bind_2, thread);
            pph_vars.$pph_speaker$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject pph_current_addressee_p(final SubLObject cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return equal(cycl, pph_vars.$pph_addressee$.getDynamicValue(thread));
    }

    public static SubLObject pph_current_addressee() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return pph_vars.$pph_addressee$.getDynamicValue(thread);
    }

    public static SubLObject pph_current_speaker_p(final SubLObject cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return equal(cycl, pph_vars.$pph_speaker$.getDynamicValue(thread));
    }

    public static SubLObject pph_addressee_known_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return forts.fort_p(pph_vars.$pph_addressee$.getDynamicValue(thread));
    }

    public static SubLObject pph_speaker_known_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return forts.fort_p(pph_vars.$pph_speaker$.getDynamicValue(thread));
    }

    public static SubLObject pph_discourse_participant_p(final SubLObject cycl) {
        return makeBoolean((NIL != pph_current_addressee_p(cycl)) || (NIL != pph_current_speaker_p(cycl)));
    }

    public static SubLObject pph_discourse_participants_knownP(SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = $EITHER;
        }
        final SubLObject addressee_knownP = pph_addressee_known_p();
        final SubLObject speaker_knownP = pph_speaker_known_p();
        if ((NIL != addressee_knownP) && (NIL != speaker_knownP)) {
            return T;
        }
        if (($EITHER == mode) && ((NIL != addressee_knownP) || (NIL != speaker_knownP))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject declare_pph_speech_act_file() {
        declareFunction(me, "get_pph_forces_list", "GET-PPH-FORCES-LIST", 0, 0, false);
        declareFunction(me, "pph_force_p", "PPH-FORCE-P", 1, 0, false);
        declareFunction(me, "generate_speech_act", "GENERATE-SPEECH-ACT", 3, 5, false);
        declareFunction(me, "pph_current_addressee_p", "PPH-CURRENT-ADDRESSEE-P", 1, 0, false);
        declareFunction(me, "pph_current_addressee", "PPH-CURRENT-ADDRESSEE", 0, 0, false);
        declareFunction(me, "pph_current_speaker_p", "PPH-CURRENT-SPEAKER-P", 1, 0, false);
        declareFunction(me, "pph_addressee_known_p", "PPH-ADDRESSEE-KNOWN-P", 0, 0, false);
        declareFunction(me, "pph_speaker_known_p", "PPH-SPEAKER-KNOWN-P", 0, 0, false);
        declareFunction(me, "pph_discourse_participant_p", "PPH-DISCOURSE-PARTICIPANT-P", 1, 0, false);
        new pph_speech_act.$pph_discourse_participant_p$UnaryFunction();
        declareFunction(me, "pph_discourse_participants_knownP", "PPH-DISCOURSE-PARTICIPANTS-KNOWN?", 0, 1, false);
        return NIL;
    }

    public static SubLObject init_pph_speech_act_file() {
        defconstant("*PPH-FORCES*", $list0);
        return NIL;
    }

    public static SubLObject setup_pph_speech_act_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_pph_speech_act_file();
    }

    @Override
    public void initializeVariables() {
        init_pph_speech_act_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_pph_speech_act_file();
    }

    static {







    }

    public static final class $pph_discourse_participant_p$UnaryFunction extends UnaryFunction {
        public $pph_discourse_participant_p$UnaryFunction() {
            super(extractFunctionNamed("PPH-DISCOURSE-PARTICIPANT-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return pph_discourse_participant_p(arg1);
        }
    }
}

/**
 * Total time: 29 ms
 */
