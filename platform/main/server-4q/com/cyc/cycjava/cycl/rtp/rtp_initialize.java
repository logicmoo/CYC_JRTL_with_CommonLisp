package com.cyc.cycjava.cycl.rtp;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class rtp_initialize extends SubLTranslatedFile {
    public static final SubLFile me = new rtp_initialize();

    public static final String myName = "com.cyc.cycjava.cycl.rtp.rtp_initialize";

    public static final String myFingerPrint = "1c6dc89ff417dd411bab235eee8170d8275d9604cf5ff268d71ac438ec67c90d";

    // deflexical
    // Definitions
    /**
     * A representative sample of the KB constants that the recursive template
     * parser depends on.
     */
    private static final SubLSymbol $rtp_core_constants$ = makeSymbol("*RTP-CORE-CONSTANTS*");



    // defparameter
    /**
     * What types of templates should be used by default? Each element of the
     * type-list is a list consisting of the template-predicate, followed any
     * specific template-categories that should be indexed. If no template
     * categories are listed, it is assumed that all should be used.
     *
     * @unknown (#$termTemplate) means that all termTemplate assertions in relevant
    Mts are part of the default. (#$termTemplate #$NPTemplate
    #$PPTemplate) would mean that only those termTemplate assertions
    that use the template category #$NPTemplate or #$PPTemplate should
    be considered a default type.
     */
    private static final SubLSymbol $rtp_default_template_types$ = makeSymbol("*RTP-DEFAULT-TEMPLATE-TYPES*");

    // Internal Constants
    public static final SubLList $list0 = list(reader_make_constant_shell(makeString("TemplateParsingMt")));

    public static final SubLSymbol $sym1$VALID_CONSTANT_ = makeSymbol("VALID-CONSTANT?");

    public static final SubLSymbol $rtp_initialized$ = makeSymbol("*RTP-INITIALIZED*");

    public static final SubLList $list3 = list(list(reader_make_constant_shell(makeString("termTemplate"))), list(reader_make_constant_shell(makeString("termTemplate-Reln"))), list(reader_make_constant_shell(makeString("assertTemplate-Reln")), reader_make_constant_shell(makeString("TemporalModifierTemplate"))));

    private static final SubLObject $$TemplateParsingMt = reader_make_constant_shell(makeString("TemplateParsingMt"));





    public static SubLObject initialize_rtp_kb_feature() {
        if (NIL != list_utilities.every_in_list($sym1$VALID_CONSTANT_, $rtp_core_constants$.getGlobalValue(), UNPROVIDED)) {
            kb_control_vars.set_rtp_kb_loaded();
        } else {
            kb_control_vars.unset_rtp_kb_loaded();
        }
        return kb_control_vars.rtp_kb_loaded_p();
    }

    public static SubLObject rtp_initializedP() {
        return $rtp_initialized$.getGlobalValue();
    }

    public static SubLObject possibly_initialize_and_populate_rtp(SubLObject mt, SubLObject template_types) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (template_types == UNPROVIDED) {
            template_types = $rtp_default_template_types$.getDynamicValue();
        }
        return NIL != rtp_initializedP() ? NIL : initialize_and_populate_rtp(mt, template_types);
    }

    public static SubLObject initialize_and_populate_rtp(SubLObject mt, SubLObject template_types) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (template_types == UNPROVIDED) {
            template_types = $rtp_default_template_types$.getDynamicValue();
        }
        recognition.ensure_sem_parse_initialized();
        rtp_datastructures.populate_meta_markers_from_mt($$TemplateParsingMt, UNPROVIDED);
        rtp_datastructures.populate_template_category_fill_words_from_mt($$TemplateParsingMt, UNPROVIDED);
        rtp_datastructures.populate_rtp_from_mt(mt, template_types);
        $rtp_initialized$.setGlobalValue(T);
        rtp_datastructures.$use_better_template_rule_sxhashP$.setGlobalValue(T);
        return $INITIALIZED;
    }

    public static SubLObject initialize_and_repopulate_rtp(SubLObject mt, SubLObject template_types) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (template_types == UNPROVIDED) {
            template_types = $rtp_default_template_types$.getDynamicValue();
        }
        recognition.ensure_sem_parse_initialized();
        rtp_datastructures.populate_meta_markers_from_mt($$TemplateParsingMt, UNPROVIDED);
        rtp_datastructures.populate_template_category_fill_words_from_mt($$TemplateParsingMt, UNPROVIDED);
        rtp_datastructures.repopulate_rtp_from_mt(mt, template_types);
        $rtp_initialized$.setGlobalValue(T);
        rtp_datastructures.$use_better_template_rule_sxhashP$.setGlobalValue(T);
        return $INITIALIZED;
    }

    public static SubLObject reset_rtp_completely() {
        rtp_datastructures.reset_all_rtp_datastructure_caches();
        recognition.reset_all_recognizer_caches();
        initialize_and_populate_rtp(UNPROVIDED, UNPROVIDED);
        return $RESET;
    }

    public static SubLObject declare_rtp_initialize_file() {
        declareFunction(me, "initialize_rtp_kb_feature", "INITIALIZE-RTP-KB-FEATURE", 0, 0, false);
        declareFunction(me, "rtp_initializedP", "RTP-INITIALIZED?", 0, 0, false);
        declareFunction(me, "possibly_initialize_and_populate_rtp", "POSSIBLY-INITIALIZE-AND-POPULATE-RTP", 0, 2, false);
        declareFunction(me, "initialize_and_populate_rtp", "INITIALIZE-AND-POPULATE-RTP", 0, 2, false);
        declareFunction(me, "initialize_and_repopulate_rtp", "INITIALIZE-AND-REPOPULATE-RTP", 0, 2, false);
        declareFunction(me, "reset_rtp_completely", "RESET-RTP-COMPLETELY", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_rtp_initialize_file() {
        deflexical("*RTP-CORE-CONSTANTS*", $list0);
        deflexical("*RTP-INITIALIZED*", SubLTrampolineFile.maybeDefault($rtp_initialized$, $rtp_initialized$, NIL));
        defparameter("*RTP-DEFAULT-TEMPLATE-TYPES*", $list3);
        return NIL;
    }

    public static SubLObject setup_rtp_initialize_file() {
        declare_defglobal($rtp_initialized$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_rtp_initialize_file();
    }

    @Override
    public void initializeVariables() {
        init_rtp_initialize_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rtp_initialize_file();
    }

    
}

/**
 * Total time: 21 ms
 */
