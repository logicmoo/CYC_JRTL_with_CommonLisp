/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.rtp;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      RTP-INITIALIZE
 * source file: /cyc/top/cycl/rtp/rtp-initialize.lisp
 * created:     2019/07/03 17:38:40
 */
public final class rtp_initialize extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new rtp_initialize();

 public static final String myName = "com.cyc.cycjava.cycl.rtp.rtp_initialize";


    // deflexical
    // Definitions
    /**
     * A representative sample of the KB constants that the recursive template
     * parser depends on.
     */
    @LispMethod(comment = "A representative sample of the KB constants that the recursive template\r\nparser depends on.\ndeflexical\nA representative sample of the KB constants that the recursive template\nparser depends on.")
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
    @LispMethod(comment = "What types of templates should be used by default? Each element of the\r\ntype-list is a list consisting of the template-predicate, followed any\r\nspecific template-categories that should be indexed. If no template\r\ncategories are listed, it is assumed that all should be used.\r\n\r\n@unknown (#$termTemplate) means that all termTemplate assertions in relevant\r\nMts are part of the default. (#$termTemplate #$NPTemplate\r\n#$PPTemplate) would mean that only those termTemplate assertions\r\nthat use the template category #$NPTemplate or #$PPTemplate should\r\nbe considered a default type.\ndefparameter\nWhat types of templates should be used by default? Each element of the\ntype-list is a list consisting of the template-predicate, followed any\nspecific template-categories that should be indexed. If no template\ncategories are listed, it is assumed that all should be used.")
    private static final SubLSymbol $rtp_default_template_types$ = makeSymbol("*RTP-DEFAULT-TEMPLATE-TYPES*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(reader_make_constant_shell("TemplateParsingMt"));

    static private final SubLSymbol $sym1$VALID_CONSTANT_ = makeSymbol("VALID-CONSTANT?");

    public static final SubLSymbol $rtp_initialized$ = makeSymbol("*RTP-INITIALIZED*");

    static private final SubLList $list3 = list(list(reader_make_constant_shell("termTemplate")), list(reader_make_constant_shell("termTemplate-Reln")), list(reader_make_constant_shell("assertTemplate-Reln"), reader_make_constant_shell("TemporalModifierTemplate")));



    /**
     * Determines whether the portion of the KB necessary for the operation of the recursive template parser is loaded.
     * This is the KB analogue of the #+Cyc-RTP feature.
     */
    @LispMethod(comment = "Determines whether the portion of the KB necessary for the operation of the recursive template parser is loaded.\r\nThis is the KB analogue of the #+Cyc-RTP feature.\nDetermines whether the portion of the KB necessary for the operation of the recursive template parser is loaded.\nThis is the KB analogue of the #+Cyc-RTP feature.")
    public static final SubLObject initialize_rtp_kb_feature_alt() {
        if (NIL != list_utilities.every_in_list($sym1$VALID_CONSTANT_, $rtp_core_constants$.getGlobalValue(), UNPROVIDED)) {
            kb_control_vars.set_rtp_kb_loaded();
        } else {
            kb_control_vars.unset_rtp_kb_loaded();
        }
        return kb_control_vars.rtp_kb_loaded_p();
    }

    /**
     * Determines whether the portion of the KB necessary for the operation of the recursive template parser is loaded.
     * This is the KB analogue of the #+Cyc-RTP feature.
     */
    @LispMethod(comment = "Determines whether the portion of the KB necessary for the operation of the recursive template parser is loaded.\r\nThis is the KB analogue of the #+Cyc-RTP feature.\nDetermines whether the portion of the KB necessary for the operation of the recursive template parser is loaded.\nThis is the KB analogue of the #+Cyc-RTP feature.")
    public static SubLObject initialize_rtp_kb_feature() {
        if (NIL != list_utilities.every_in_list($sym1$VALID_CONSTANT_, $rtp_core_constants$.getGlobalValue(), UNPROVIDED)) {
            kb_control_vars.set_rtp_kb_loaded();
        } else {
            kb_control_vars.unset_rtp_kb_loaded();
        }
        return kb_control_vars.rtp_kb_loaded_p();
    }

    public static final SubLObject rtp_initializedP_alt() {
        return $rtp_initialized$.getGlobalValue();
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

    public static final SubLObject initialize_and_populate_rtp_alt(SubLObject mt, SubLObject template_types) {
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

    public static final SubLObject initialize_and_repopulate_rtp_alt(SubLObject mt, SubLObject template_types) {
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

    public static final SubLObject reset_rtp_completely_alt() {
        rtp_datastructures.reset_all_rtp_datastructure_caches();
        recognition.reset_all_recognizer_caches();
        com.cyc.cycjava.cycl.rtp.rtp_initialize.initialize_and_populate_rtp(UNPROVIDED, UNPROVIDED);
        return $RESET;
    }

    public static SubLObject reset_rtp_completely() {
        rtp_datastructures.reset_all_rtp_datastructure_caches();
        recognition.reset_all_recognizer_caches();
        initialize_and_populate_rtp(UNPROVIDED, UNPROVIDED);
        return $RESET;
    }

    public static SubLObject declare_rtp_initialize_file() {
        declareFunction("initialize_rtp_kb_feature", "INITIALIZE-RTP-KB-FEATURE", 0, 0, false);
        declareFunction("rtp_initializedP", "RTP-INITIALIZED?", 0, 0, false);
        declareFunction("possibly_initialize_and_populate_rtp", "POSSIBLY-INITIALIZE-AND-POPULATE-RTP", 0, 2, false);
        declareFunction("initialize_and_populate_rtp", "INITIALIZE-AND-POPULATE-RTP", 0, 2, false);
        declareFunction("initialize_and_repopulate_rtp", "INITIALIZE-AND-REPOPULATE-RTP", 0, 2, false);
        declareFunction("reset_rtp_completely", "RESET-RTP-COMPLETELY", 0, 0, false);
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(reader_make_constant_shell("TemplateParsingMt"));

    public static final SubLObject init_rtp_initialize_file_alt() {
        deflexical("*RTP-CORE-CONSTANTS*", $list_alt0);
        deflexical("*RTP-INITIALIZED*", NIL != boundp($rtp_initialized$) ? ((SubLObject) ($rtp_initialized$.getGlobalValue())) : NIL);
        defparameter("*RTP-DEFAULT-TEMPLATE-TYPES*", $list_alt3);
        return NIL;
    }

    public static SubLObject init_rtp_initialize_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*RTP-CORE-CONSTANTS*", $list0);
            deflexical("*RTP-INITIALIZED*", SubLTrampolineFile.maybeDefault($rtp_initialized$, $rtp_initialized$, NIL));
            defparameter("*RTP-DEFAULT-TEMPLATE-TYPES*", $list3);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*RTP-INITIALIZED*", NIL != boundp($rtp_initialized$) ? ((SubLObject) ($rtp_initialized$.getGlobalValue())) : NIL);
        }
        return NIL;
    }

    public static SubLObject init_rtp_initialize_file_Previous() {
        deflexical("*RTP-CORE-CONSTANTS*", $list0);
        deflexical("*RTP-INITIALIZED*", SubLTrampolineFile.maybeDefault($rtp_initialized$, $rtp_initialized$, NIL));
        defparameter("*RTP-DEFAULT-TEMPLATE-TYPES*", $list3);
        return NIL;
    }

    static private final SubLList $list_alt3 = list(list(reader_make_constant_shell("termTemplate")), list(reader_make_constant_shell("termTemplate-Reln")), list(reader_make_constant_shell("assertTemplate")), list(reader_make_constant_shell("assertTemplate-Reln"), reader_make_constant_shell("TemporalModifierTemplate")));

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
