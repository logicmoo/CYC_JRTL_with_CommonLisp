package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.simplifier;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_nearest_isa extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa";
    public static String myFingerPrint = "9e3f0a3e445d87b0f97e6721a343bfab5ed5e84fece6de986126c7a1325cb89a";
    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 3400L)
    private static SubLSymbol $default_nearest_isa_check_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 4900L)
    private static SubLSymbol $average_naut_nearest_isa_count$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 5100L)
    private static SubLSymbol $default_nearest_isa_naut_generate_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 9100L)
    private static SubLSymbol $default_nearest_genls_check_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 10800L)
    private static SubLSymbol $average_naut_nearest_genls_count$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 11000L)
    private static SubLSymbol $default_nearest_genls_naut_generate_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 14100L)
    private static SubLSymbol $default_nearest_genl_mts_check_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 20200L)
    private static SubLSymbol $default_nearest_genl_preds_check_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 23900L)
    private static SubLSymbol $default_nearest_common_isa_check_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 25100L)
    private static SubLSymbol $average_nearest_common_isa_count$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 27700L)
    private static SubLSymbol $default_nearest_common_genls_check_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 28800L)
    private static SubLSymbol $average_nearest_common_genls_count$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 33600L)
    private static SubLSymbol $default_nearest_common_specs_check_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 34800L)
    private static SubLSymbol $average_nearest_common_specs_count$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 36100L)
    private static SubLSymbol $default_nearest_common_genl_mts_check_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 37400L)
    private static SubLSymbol $average_nearest_common_genl_mts_count$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 38800L)
    private static SubLSymbol $default_nearest_common_spec_mts_check_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 39900L)
    private static SubLSymbol $average_nearest_common_spec_mts_count$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 41700L)
    private static SubLSymbol $default_nearest_different_isa_check_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 44700L)
    private static SubLSymbol $default_nearest_different_genls_check_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 69400L)
    public static SubLSymbol $near_narrow_specs_generality_cutoff$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 69600L)
    public static SubLSymbol $near_narrow_specs_completeness_cutoff$;
    private static SubLObject $$nearestIsa;
    private static SubLSymbol $POS;
    private static SubLSymbol $ISA;
    private static SubLList $list3;
    private static SubLObject $$isa;
    private static SubLObject $$thereExists;
    private static SubLSymbol $sym6$_NEARER;
    private static SubLObject $$and;
    private static SubLObject $$differentSymbols;
    private static SubLList $list9;
    private static SubLObject $$genls;
    private static SubLObject $$knownSentence;
    private static SubLObject $$unknownSentence;
    private static SubLSymbol $OPAQUE;
    private static SubLSymbol $REMOVAL_NEAREST_ISA_CHECK;
    private static SubLList $list15;
    private static SubLSymbol $REMOVAL_NEAREST_ISA_GENERATE;
    private static SubLList $list17;
    private static SubLSymbol $REMOVAL_NEAREST_INSTANCES_GENERATE;
    private static SubLList $list19;
    private static SubLObject $$nearestGenls;
    private static SubLSymbol $GENLS;
    private static SubLSymbol $REMOVAL_NEAREST_GENLS_FORT_CHECK;
    private static SubLList $list23;
    private static SubLSymbol $REMOVAL_NEAREST_GENLS_NAUT_CHECK;
    private static SubLList $list25;
    private static SubLSymbol $REMOVAL_NEAREST_GENLS_FORT_GENERATE;
    private static SubLList $list27;
    private static SubLSymbol $REMOVAL_NEAREST_GENLS_NAUT_GENERATE;
    private static SubLList $list29;
    private static SubLSymbol $REMOVAL_NEAREST_SPECS_GENERATE;
    private static SubLList $list31;
    private static SubLObject $$nearestGenlMt;
    private static SubLSymbol $REMOVAL_NEAREST_GENL_MTS_CHECK;
    private static SubLList $list34;
    private static SubLObject $$genlMt;
    private static SubLSymbol $REMOVAL_NEAREST_GENL_MTS_GENERATE;
    private static SubLList $list37;
    private static SubLSymbol $REMOVAL_NEAREST_SPEC_MTS_GENERATE;
    private static SubLList $list39;
    private static SubLList $list40;
    private static SubLList $list41;
    private static SubLList $list42;
    private static SubLObject $$nearestGenlPreds;
    private static SubLSymbol $REMOVAL_NEAREST_GENL_PREDS_CHECK;
    private static SubLList $list45;
    private static SubLObject $$genlPreds;
    private static SubLObject $$genlInverse;
    private static SubLSymbol $REMOVAL_NEAREST_GENL_PREDS_GENERATE;
    private static SubLList $list49;
    private static SubLSymbol $REMOVAL_NEAREST_SPEC_PREDS_GENERATE;
    private static SubLList $list51;
    private static SubLObject $$nearestCommonIsa;
    private static SubLSymbol $REMOVAL_NEAREST_COMMON_ISA_CHECK;
    private static SubLList $list54;
    private static SubLSymbol $REMOVAL_NEAREST_COMMON_ISA_GENERATE;
    private static SubLList $list56;
    private static SubLObject $$nearestCommonGenls;
    private static SubLList $list58;
    private static SubLSymbol $sym59$_COL;
    private static SubLObject $$different;
    private static SubLSymbol $CODE;
    private static SubLSymbol $sym62$MAKE_NEAREST_COMMON_GENLS_SUPPORT;
    private static SubLSymbol $REMOVAL_NEAREST_COMMON_GENLS_CHECK;
    private static SubLList $list64;
    private static SubLSymbol $REMOVAL_NEAREST_COMMON_GENLS_GENERATE;
    private static SubLList $list66;
    private static SubLObject $$nearestCommonGenlsOfSet;
    private static SubLList $list68;
    private static SubLSymbol $sym69$MAKE_NEAREST_COMMON_GENLS_OF_SET_SUPPORT;
    private static SubLSymbol $REMOVAL_NEAREST_COMMON_GENLS_OF_SET_CHECK;
    private static SubLList $list71;
    private static SubLSymbol $REMOVAL_NEAREST_COMMON_GENLS_OF_SET_GENERATE;
    private static SubLList $list73;
    private static SubLObject $$nearestCommonSpecs;
    private static SubLSymbol $REMOVAL_NEAREST_COMMON_SPECS_CHECK;
    private static SubLList $list76;
    private static SubLSymbol $REMOVAL_NEAREST_COMMON_SPECS_GENERATE;
    private static SubLList $list78;
    private static SubLObject $$nearestCommonGenlMt;
    private static SubLSymbol $REMOVAL_NEAREST_COMMON_GENL_MTS_CHECK;
    private static SubLList $list81;
    private static SubLSymbol $REMOVAL_NEAREST_COMMON_GENL_MTS_GENERATE;
    private static SubLList $list83;
    private static SubLObject $$nearestCommonSpecMt;
    private static SubLSymbol $REMOVAL_NEAREST_COMMON_SPEC_MTS_CHECK;
    private static SubLList $list86;
    private static SubLSymbol $REMOVAL_NEAREST_COMMON_SPEC_MTS_GENERATE;
    private static SubLList $list88;
    private static SubLObject $$nearestDifferentIsa;
    private static SubLSymbol $REMOVAL_NEAREST_DIFFERENT_ISA_CHECK;
    private static SubLList $list91;
    private static SubLSymbol $REMOVAL_NEAREST_DIFFERENT_ISA_GENERATE;
    private static SubLList $list93;
    private static SubLObject $$nearestDifferentGenls;
    private static SubLSymbol $REMOVAL_NEAREST_DIFFERENT_GENLS_CHECK;
    private static SubLList $list96;
    private static SubLSymbol $REMOVAL_NEAREST_DIFFERENT_GENLS_GENERATE;
    private static SubLList $list98;
    private static SubLObject $$nearestIsaOfType;
    private static SubLSymbol $REMOVAL_NEAREST_ISA_OF_TYPE_CHECK;
    private static SubLList $list101;
    private static SubLSymbol $REMOVAL_NEAREST_ISA_OF_TYPE_GENERATE;
    private static SubLList $list103;
    private static SubLObject $$nearestGenlsOfType;
    private static SubLSymbol $REMOVAL_NEAREST_GENLS_OF_TYPE_CHECK;
    private static SubLList $list106;
    private static SubLSymbol $REMOVAL_NEAREST_GENLS_OF_TYPE_GENERATE;
    private static SubLList $list108;
    private static SubLObject $$nearestArgIsa;
    private static SubLSymbol $NEAREST_ARG_ISA_UNBOUND_RELATION_AND_COLLECTION_POS;
    private static SubLList $list111;
    private static SubLSymbol $REMOVAL_NEAREST_ARG_ISA_CHECK;
    private static SubLList $list113;
    private static SubLSymbol $REMOVAL_NEAREST_ARG_ISA_GENERATE;
    private static SubLList $list115;
    private static SubLObject $$argIsa;
    private static SubLSymbol $GAF;
    private static SubLSymbol $REMOVAL_NEAREST_ARG_ISA_GENERATE_REVERSE;
    private static SubLList $list119;
    private static SubLSymbol $sym120$INFERENCE_NEAREST_ARG_ISA_REVERSE_ITERATOR_DONE;
    private static SubLSymbol $sym121$INFERENCE_NEAREST_ARG_ISA_REVERSE_ITERATOR_NEXT;
    private static SubLSymbol $sym122$INFERENCE_NEAREST_ARG_ISA_REVERSE_ITERATOR_FINALIZE;
    private static SubLObject $$Relation;
    private static SubLList $list124;
    private static SubLObject $$nearestArgGenl;
    private static SubLSymbol $NEAREST_ARG_GENL_UNBOUND_RELATION_AND_COLLECTION_POS;
    private static SubLList $list127;
    private static SubLSymbol $REMOVAL_NEAREST_ARG_GENL_CHECK;
    private static SubLList $list129;
    private static SubLSymbol $REMOVAL_NEAREST_ARG_GENL_GENERATE;
    private static SubLList $list131;
    private static SubLObject $$argGenl;
    private static SubLSymbol $REMOVAL_NEAREST_ARG_GENL_GENERATE_REVERSE;
    private static SubLList $list134;
    private static SubLSymbol $sym135$INFERENCE_NEAREST_ARG_GENL_REVERSE_ITERATOR_DONE;
    private static SubLSymbol $sym136$INFERENCE_NEAREST_ARG_GENL_REVERSE_ITERATOR_NEXT;
    private static SubLSymbol $sym137$INFERENCE_NEAREST_ARG_GENL_REVERSE_ITERATOR_FINALIZE;
    private static SubLInteger $int$10000;
    private static SubLInteger $int$212;
    private static SubLSymbol $sym140$NUMBERP;
    private static SubLObject $$nearNarrowSpecs;
    private static SubLSymbol $NEAR_NARROW_SPECS_GENERATE_POS;
    private static SubLList $list143;
    private static SubLList $list144;
    private static SubLSymbol $NEAR_NARROW_SPECS_CHECK_POS;
    private static SubLList $list146;
    private static SubLObject $$thresholdSpecs;
    private static SubLList $list148;
    private static SubLObject $$includeInThresholdSpecs;
    private static SubLObject $$excludeFromThresholdSpecs;
    private static SubLSymbol $THRESHOLD_SPECS_GENERATE_POS;
    private static SubLList $list152;
    private static SubLSymbol $THRESHOLD_SPECS_CHECK_POS;
    private static SubLList $list154;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 1400L)
    public static SubLObject inference_nearest_isa_check(SubLObject v_term, SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject nearest_items = inference_nearest_isa(v_term, mt);
        return subl_promotions.memberP(col, nearest_items, Symbols.symbol_function(EQUAL), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 1600L)
    public static SubLObject inference_nearest_isa(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return isa.min_isa(v_term, mt, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 1700L)
    public static SubLObject inference_nearest_instances(SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject nearest_instances = isa.instances(col, mt, UNPROVIDED);
        return nearest_instances;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 1900L)
    public static SubLObject make_nearest_isa_support(SubLObject support_sentence, SubLObject support_mt) {
        if (support_mt == UNPROVIDED) {
            support_mt = NIL;
        }
        SubLObject isa_support = arguments.make_hl_support($ISA, support_sentence, UNPROVIDED, UNPROVIDED);
        SubLObject more_supports = NIL;
        return Values.values(isa_support, more_supports);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 2100L)
    public static SubLObject hl_verify_nearest_isa(SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, $list3);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, $list3);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, $list3);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, $list3);
        tv = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(support, $list3);
            return NIL;
        }
        if (hl_module != $ISA) {
            return T;
        }
        SubLObject v_term = el_utilities.literal_arg1(literal, UNPROVIDED);
        SubLObject col = el_utilities.literal_arg2(literal, UNPROVIDED);
        return inference_nearest_isa_check(v_term, col, mt);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 2400L)
    public static SubLObject hl_justify_nearest_isa(SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, $list3);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, $list3);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, $list3);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, $list3);
        tv = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(support, $list3);
            return NIL;
        }
        if (hl_module != $ISA) {
            return list(support);
        }
        SubLObject arg1 = el_utilities.literal_arg1(literal, UNPROVIDED);
        SubLObject arg2 = el_utilities.literal_arg2(literal, UNPROVIDED);
        SubLObject isa_asent = el_utilities.make_binary_formula($$isa, arg1, arg2);
        SubLObject thereexists_literal = list($$thereExists, $sym6$_NEARER, list($$and, list($$differentSymbols, $sym6$_NEARER, arg2), listS($$isa, arg1, $list9), list($$genls, $sym6$_NEARER, arg2)));
        SubLObject code_literal = NIL;
        SubLObject support_$1 = NIL;
        SubLObject code_support = NIL;
        if (NIL != cycl_utilities.negatedP(literal)) {
            literal = cycl_utilities.negate(isa_asent);
            code_literal = list($$knownSentence, thereexists_literal);
        } else {
            literal = isa_asent;
            code_literal = list($$unknownSentence, thereexists_literal);
        }
        support_$1 = arguments.make_hl_support($ISA, literal, mt, tv);
        code_support = arguments.make_hl_support($OPAQUE, code_literal, mt, tv);
        return list(support_$1, code_support);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 3600L)
    public static SubLObject removal_nearest_isa_check(SubLObject asent) {
        SubLObject v_object = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        return inference_nearest_isa_check(v_object, collection, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 4400L)
    public static SubLObject removal_nearest_isa_generate_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return Numbers.add(removal_nearest_isa_generate_cost_via_indexing(asent, UNPROVIDED), (NIL != el_utilities.possibly_naut_p(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED))) ? $average_naut_nearest_isa_count$.getGlobalValue() : ZERO_INTEGER);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 4800L)
    public static SubLObject removal_nearest_isa_generate_cost_via_indexing(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return kb_indexing.relevant_num_gaf_arg_index(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED), ONE_INTEGER, $$isa);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 5800L)
    public static SubLObject removal_nearest_instances_generate_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return (NIL != variables.fully_bound_p(asent)) ? control_vars.$typical_hl_module_check_cost$.getGlobalValue() : kb_indexing.relevant_num_gaf_arg_index(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED), TWO_INTEGER, $$isa);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 7100L)
    public static SubLObject inference_nearest_genls_check(SubLObject spec, SubLObject genl, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject nearest_genls = inference_nearest_genls(spec, mt);
        return subl_promotions.memberP(genl, nearest_genls, Symbols.symbol_function(EQUAL), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 7300L)
    public static SubLObject inference_nearest_genls(SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return genls.min_genls(col, mt, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 7400L)
    public static SubLObject inference_nearest_specs(SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return genls.max_specs(col, mt, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 7500L)
    public static SubLObject make_nearest_genls_support(SubLObject support_sentence, SubLObject support_mt) {
        if (support_mt == UNPROVIDED) {
            support_mt = NIL;
        }
        SubLObject genls_support = arguments.make_hl_support($GENLS, support_sentence, UNPROVIDED, UNPROVIDED);
        SubLObject more_supports = NIL;
        return Values.values(genls_support, more_supports);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 7800L)
    public static SubLObject hl_verify_nearest_genls(SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, $list3);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, $list3);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, $list3);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, $list3);
        tv = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(support, $list3);
            return NIL;
        }
        if (hl_module != $GENLS) {
            return T;
        }
        SubLObject spec = el_utilities.literal_arg1(literal, UNPROVIDED);
        SubLObject genl = el_utilities.literal_arg2(literal, UNPROVIDED);
        return inference_nearest_genls_check(spec, genl, mt);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 8100L)
    public static SubLObject hl_justify_nearest_genls(SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, $list3);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, $list3);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, $list3);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, $list3);
        tv = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(support, $list3);
            return NIL;
        }
        if (hl_module != $GENLS) {
            return list(support);
        }
        SubLObject arg1 = el_utilities.literal_arg1(literal, UNPROVIDED);
        SubLObject arg2 = el_utilities.literal_arg2(literal, UNPROVIDED);
        SubLObject genls_asent = el_utilities.make_binary_formula($$genls, arg1, arg2);
        SubLObject thereexists_literal = list($$thereExists, $sym6$_NEARER, list($$and, list($$differentSymbols, $sym6$_NEARER, arg2), listS($$genls, arg1, $list9), list($$genls, $sym6$_NEARER, arg2)));
        SubLObject code_literal = NIL;
        SubLObject support_$2 = NIL;
        SubLObject code_support = NIL;
        if (NIL != cycl_utilities.negatedP(literal)) {
            literal = cycl_utilities.negate(genls_asent);
            code_literal = list($$knownSentence, thereexists_literal);
        } else {
            literal = genls_asent;
            code_literal = list($$unknownSentence, thereexists_literal);
        }
        support_$2 = arguments.make_hl_support($GENLS, literal, mt, tv);
        code_support = arguments.make_hl_support($OPAQUE, code_literal, mt, tv);
        return list(support_$2, code_support);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 9300L)
    public static SubLObject removal_nearest_genls_check(SubLObject asent) {
        SubLObject spec = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject genl = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        return inference_nearest_genls_check(spec, genl, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 10500L)
    public static SubLObject removal_nearest_genls_fort_generate_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return kb_indexing.relevant_num_gaf_arg_index(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED), ONE_INTEGER, $$genls);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 12400L)
    public static SubLObject removal_nearest_specs_generate_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return kb_indexing.relevant_num_gaf_arg_index(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED), TWO_INTEGER, $$genls);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 13600L)
    public static SubLObject inference_nearest_genl_mt_check(SubLObject spec_mt, SubLObject genl_mt, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        SubLObject all_nearest_genl_mts = inference_nearest_genl_mts(spec_mt, mt_mt);
        return subl_promotions.memberP(genl_mt, all_nearest_genl_mts, Symbols.symbol_function(EQUAL), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 13800L)
    public static SubLObject inference_nearest_genl_mts(SubLObject mt, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        return genl_mts.min_genl_mts(mt, mt_mt, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 13900L)
    public static SubLObject inference_nearest_spec_mts(SubLObject mt, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        return genl_mts.max_spec_mts(mt, mt_mt, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 14300L)
    public static SubLObject removal_nearest_genl_mt_check(SubLObject asent) {
        SubLObject spec_mt = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject genl_mt = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        return inference_nearest_genl_mt_check(spec_mt, genl_mt, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 14900L)
    public static SubLObject removal_nearest_genl_mts_generate_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return kb_indexing.relevant_num_gaf_arg_index(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED), ONE_INTEGER, $$genlMt);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 15800L)
    public static SubLObject removal_nearest_spec_mts_generate_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return kb_indexing.relevant_num_gaf_arg_index(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED), TWO_INTEGER, $$genlMt);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 16700L)
    public static SubLObject removal_nearest_genl_mts_check_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject spec = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject genl = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject nearest_items = inference_nearest_genl_mts(spec, UNPROVIDED);
        if (NIL != subl_promotions.memberP(genl, nearest_items, Symbols.symbol_function(EQUAL), UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($OPAQUE, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 17700L)
    public static SubLObject removal_nearest_genl_mts_generate_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject spec = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject cdolist_list_var;
        SubLObject nearest_items = cdolist_list_var = inference_nearest_genl_mts(spec, UNPROVIDED);
        SubLObject nearest_item = NIL;
        nearest_item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            SubLObject v_bindings = unification_utilities.term_unify(arg2, nearest_item, T, T);
            SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != v_bindings) {
                SubLObject support_formula = bindings.subst_bindings(v_bindings, asent);
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, support_formula, UNPROVIDED, UNPROVIDED), v_bindings, unify_justification);
            }
            cdolist_list_var = cdolist_list_var.rest();
            nearest_item = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 18800L)
    public static SubLObject removal_nearest_spec_mts_generate_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject genl = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject cdolist_list_var;
        SubLObject nearest_items = cdolist_list_var = inference_nearest_spec_mts(genl, UNPROVIDED);
        SubLObject nearest_item = NIL;
        nearest_item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            SubLObject v_bindings = unification_utilities.term_unify(arg1, nearest_item, T, T);
            SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != v_bindings) {
                SubLObject support_formula = bindings.subst_bindings(v_bindings, asent);
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, support_formula, UNPROVIDED, UNPROVIDED), v_bindings, unify_justification);
            }
            cdolist_list_var = cdolist_list_var.rest();
            nearest_item = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 20900L)
    public static SubLObject removal_nearest_genl_preds_generate_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return Numbers.add(kb_indexing.relevant_num_gaf_arg_index(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED), ONE_INTEGER, $$genlPreds), kb_indexing.relevant_num_gaf_arg_index(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED), ONE_INTEGER, $$genlInverse));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 21800L)
    public static SubLObject removal_nearest_genl_preds_check(SubLObject asent) {
        SubLObject spec = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject genl = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        return inference_nearest_genl_preds_check(spec, genl);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 22000L)
    public static SubLObject inference_nearest_genl_preds(SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject nearest_items = genl_predicates.min_genl_predicates(pred, mt, UNPROVIDED);
        return genl_predicates.min_predicates(nearest_items, mt, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 22200L)
    public static SubLObject inference_nearest_genl_preds_check(SubLObject spec, SubLObject genl) {
        SubLObject nearest_gps = inference_nearest_genl_preds(spec, UNPROVIDED);
        return subl_promotions.memberP(genl, nearest_gps, Symbols.symbol_function(EQUAL), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 22300L)
    public static SubLObject removal_nearest_spec_preds_generate_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return Numbers.add(kb_indexing.relevant_num_gaf_arg_index(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED), TWO_INTEGER, $$genlPreds), kb_indexing.relevant_num_gaf_arg_index(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED), TWO_INTEGER, $$genlInverse));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 23400L)
    public static SubLObject inference_nearest_spec_preds(SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return genl_predicates.max_spec_predicates(pred, mt, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 24600L)
    public static SubLObject removal_nearest_common_isa_check(SubLObject asent) {
        SubLObject object1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject object2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject collection = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        SubLObject nearest_items = inference_nearest_common_isa(object1, object2, UNPROVIDED);
        return subl_promotions.memberP(collection, nearest_items, Symbols.symbol_function(EQUAL), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 24900L)
    public static SubLObject inference_nearest_common_isa(SubLObject object1, SubLObject object2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return isa.min_ceiling_isa(list(object1, object2), NIL, mt, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 26600L)
    public static SubLObject make_nearest_common_genls_support(SubLObject support_sentence, SubLObject support_mt) {
        if (support_mt == UNPROVIDED) {
            support_mt = NIL;
        }
        SubLObject current;
        SubLObject datum = current = cycl_utilities.formula_args(support_sentence, UNPROVIDED);
        SubLObject col1 = NIL;
        SubLObject col2 = NIL;
        SubLObject col3 = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list58);
        col1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list58);
        col2 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list58);
        col3 = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject genl_sentence1 = el_utilities.make_binary_formula($$genls, col1, col3);
            SubLObject genl_support1 = arguments.make_hl_support($GENLS, genl_sentence1, support_mt, UNPROVIDED);
            SubLObject genl_sentence2 = el_utilities.make_binary_formula($$genls, col2, col3);
            SubLObject genl_support2 = arguments.make_hl_support($GENLS, genl_sentence2, support_mt, UNPROVIDED);
            SubLObject col_var = $sym59$_COL;
            SubLObject not_genl_sentences = list(el_utilities.make_binary_formula($$different, col_var, col3), el_utilities.make_binary_formula($$genls, col_var, col3), el_utilities.make_binary_formula($$genls, col1, col_var),
                    el_utilities.make_binary_formula($$genls, col2, col_var));
            SubLObject unknown_sentence = el_utilities.make_unary_formula($$unknownSentence, el_utilities.make_binary_formula($$thereExists, col_var, simplifier.conjoin(not_genl_sentences, UNPROVIDED)));
            SubLObject unknown_support = arguments.make_hl_support($CODE, unknown_sentence, support_mt, UNPROVIDED);
            return Values.values(unknown_support, list(genl_support1, genl_support2));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list58);
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 28400L)
    public static SubLObject removal_nearest_common_genls_check(SubLObject asent) {
        SubLObject col1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject col2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject common_genl = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        return subl_promotions.memberP(common_genl, inference_nearest_common_genls(col1, col2, UNPROVIDED), UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 28700L)
    public static SubLObject inference_nearest_common_genls(SubLObject col1, SubLObject col2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return genls.nearest_common_genls(list(col1, col2), NIL, mt, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 30200L)
    public static SubLObject make_nearest_common_genls_of_set_support(SubLObject support_sentence, SubLObject support_mt) {
        if (support_mt == UNPROVIDED) {
            support_mt = NIL;
        }
        SubLObject current;
        SubLObject datum = current = cycl_utilities.formula_args(support_sentence, UNPROVIDED);
        SubLObject v_set = NIL;
        SubLObject genl = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list68);
        v_set = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list68);
        genl = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject specs = el_utilities.el_extensional_set_elements(v_set);
            SubLObject col_var = $sym59$_COL;
            SubLObject not_genl_sentences = list(el_utilities.make_binary_formula($$genls, col_var, genl), el_utilities.make_binary_formula($$different, col_var, genl));
            SubLObject genl_supports = NIL;
            SubLObject cdolist_list_var = specs;
            SubLObject spec = NIL;
            spec = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject genl_support_sentence = el_utilities.make_binary_formula($$genls, spec, genl);
                genl_supports = cons(arguments.make_hl_support($GENLS, genl_support_sentence, support_mt, UNPROVIDED), genl_supports);
                SubLObject not_genl_sentence = el_utilities.make_binary_formula($$genls, spec, col_var);
                not_genl_sentences = cons(not_genl_sentence, not_genl_sentences);
                cdolist_list_var = cdolist_list_var.rest();
                spec = cdolist_list_var.first();
            }
            SubLObject not_genl_support_sentence = el_utilities.make_unary_formula($$unknownSentence, el_utilities.make_binary_formula($$thereExists, col_var, simplifier.conjoin(not_genl_sentences, UNPROVIDED)));
            SubLObject not_genl_support = arguments.make_hl_support($CODE, not_genl_support_sentence, support_mt, UNPROVIDED);
            return Values.values(not_genl_support, genl_supports);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list68);
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 32100L)
    public static SubLObject removal_nearest_common_genls_of_set_check(SubLObject v_set, SubLObject col) {
        return list_utilities.member_equalP(col, genls.nearest_common_genls(v_set, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 34300L)
    public static SubLObject removal_nearest_common_specs_check(SubLObject asent) {
        SubLObject col1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject col2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject common_spec = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        return subl_promotions.memberP(common_spec, inference_nearest_common_specs(col1, col2, UNPROVIDED), UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 34600L)
    public static SubLObject inference_nearest_common_specs(SubLObject col1, SubLObject col2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return genls.nearest_common_specs(list(col1, col2), NIL, mt, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 36900L)
    public static SubLObject removal_nearest_common_genl_mts_check_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject spec1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject spec2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject genl = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        SubLObject nearest_items = inference_nearest_common_genl_mts(spec1, spec2, UNPROVIDED);
        return subl_promotions.memberP(genl, nearest_items, Symbols.symbol_function(EQUAL), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 37200L)
    public static SubLObject inference_nearest_common_genl_mts(SubLObject mt1, SubLObject mt2, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        return genl_mts.min_ceiling_mts(list(mt1, mt2), NIL, mt_mt);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 39400L)
    public static SubLObject removal_nearest_common_spec_mts_check_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject genl1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject genl2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject spec = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        SubLObject nearest_items = inference_nearest_common_spec_mts(genl1, genl2, UNPROVIDED);
        return subl_promotions.memberP(spec, nearest_items, Symbols.symbol_function(EQUAL), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 39800L)
    public static SubLObject inference_nearest_common_spec_mts(SubLObject mt1, SubLObject mt2, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        return genl_mts.max_floor_mts(list(mt1, mt2), NIL, mt_mt);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 42400L)
    public static SubLObject removal_nearest_different_isa_check(SubLObject asent) {
        SubLObject obj = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject not_obj = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject collection = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        SubLObject nearest_items = inference_nearest_different_isa(obj, not_obj, UNPROVIDED);
        return subl_promotions.memberP(collection, nearest_items, Symbols.symbol_function(EQUAL), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 42800L)
    public static SubLObject inference_nearest_different_isa(SubLObject v_object, SubLObject not_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (v_object.equal(not_object)) {
            return NIL;
        }
        SubLObject include = isa.all_isa(v_object, mt, UNPROVIDED);
        SubLObject skip = isa.all_isa(not_object, mt, UNPROVIDED);
        SubLObject different = conses_high.set_difference(include, skip, Symbols.symbol_function(EQUAL), UNPROVIDED);
        if (NIL == different) {
            return NIL;
        }
        if (NIL != list_utilities.singletonP(different)) {
            return different;
        }
        SubLObject nearest = genls.min_cols(different, mt, UNPROVIDED);
        return nearest;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 43200L)
    public static SubLObject removal_nearest_different_isa_generate_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return kb_indexing.relevant_num_gaf_arg_index(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED), ONE_INTEGER, $$isa);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 45400L)
    public static SubLObject removal_nearest_different_genls_check(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject col = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject not_col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject genl = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        SubLObject nearest_items = inference_nearest_different_genls(col, not_col, UNPROVIDED);
        return subl_promotions.memberP(genl, nearest_items, Symbols.symbol_function(EQUAL), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 45800L)
    public static SubLObject inference_nearest_different_genls(SubLObject collection, SubLObject not_collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (collection.equal(not_collection)) {
            return NIL;
        }
        SubLObject include = genls.all_genls(collection, mt, UNPROVIDED);
        SubLObject skip = cons(collection, genls.all_genls(not_collection, mt, UNPROVIDED));
        SubLObject different = conses_high.set_difference(include, skip, Symbols.symbol_function(EQUAL), UNPROVIDED);
        if (NIL == different) {
            return NIL;
        }
        if (NIL != list_utilities.singletonP(different)) {
            return different;
        }
        SubLObject nearest = genls.min_cols(different, mt, UNPROVIDED);
        return nearest;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 46300L)
    public static SubLObject removal_nearest_different_genls_generate_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return kb_indexing.relevant_num_gaf_arg_index(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED), ONE_INTEGER, $$genls);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 48200L)
    public static SubLObject inference_nearest_isa_of_type_check(SubLObject v_term, SubLObject type, SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject nearest_isas_of_type = inference_nearest_isas_of_type(v_term, type, mt);
        return subl_promotions.memberP(col, nearest_isas_of_type, Symbols.symbol_function(EQUAL), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 48500L)
    public static SubLObject inference_nearest_isas_of_type(SubLObject v_term, SubLObject type, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return isa.min_isas_of_type(v_term, type, mt, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 48600L)
    public static SubLObject make_nearest_isa_of_type_support(SubLObject support_sentence, SubLObject support_mt) {
        if (support_mt == UNPROVIDED) {
            support_mt = NIL;
        }
        SubLObject isa_support = arguments.make_hl_support($ISA, support_sentence, support_mt, UNPROVIDED);
        SubLObject more_supports = NIL;
        return Values.values(isa_support, more_supports);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 48800L)
    public static SubLObject hl_verify_nearest_isa_of_type(SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, $list3);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, $list3);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, $list3);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, $list3);
        tv = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(support, $list3);
            return NIL;
        }
        if (hl_module != $ISA) {
            return T;
        }
        SubLObject v_term = el_utilities.literal_arg1(literal, UNPROVIDED);
        SubLObject type = el_utilities.literal_arg2(literal, UNPROVIDED);
        SubLObject col = el_utilities.literal_arg3(literal, UNPROVIDED);
        return inference_nearest_isa_of_type_check(v_term, type, col, mt);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 49200L)
    public static SubLObject hl_justify_nearest_isa_of_type(SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, $list3);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, $list3);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, $list3);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, $list3);
        tv = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(support, $list3);
            return NIL;
        }
        if (hl_module != $ISA) {
            return list(support);
        }
        SubLObject v_term = el_utilities.literal_arg1(literal, UNPROVIDED);
        SubLObject type = el_utilities.literal_arg2(literal, UNPROVIDED);
        SubLObject col = el_utilities.literal_arg3(literal, UNPROVIDED);
        SubLObject col_asent = el_utilities.make_binary_formula($$isa, v_term, col);
        SubLObject type_asent = el_utilities.make_binary_formula($$isa, col, type);
        SubLObject thereexists_literal = list($$thereExists, $sym6$_NEARER, list($$and, list($$differentSymbols, $sym6$_NEARER, col), listS($$isa, v_term, $list9), list($$genls, $sym6$_NEARER, col), list($$isa, $sym6$_NEARER, type)));
        SubLObject col_literal = NIL;
        SubLObject type_literal = NIL;
        SubLObject code_literal = NIL;
        if (NIL != cycl_utilities.negatedP(literal)) {
            col_literal = cycl_utilities.negate(col_asent);
            type_literal = cycl_utilities.negate(type_asent);
            code_literal = list($$knownSentence, thereexists_literal);
        } else {
            col_literal = col_asent;
            type_literal = type_asent;
            code_literal = list($$unknownSentence, thereexists_literal);
        }
        SubLObject col_support = arguments.make_hl_support($ISA, col_literal, mt, tv);
        SubLObject type_support = arguments.make_hl_support($ISA, type_literal, mt, tv);
        SubLObject code_support = arguments.make_hl_support($CODE, code_literal, mt, tv);
        return list(col_support, type_support, code_support);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 51400L)
    public static SubLObject removal_nearest_isa_of_type_generate_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        return (NIL != forts.fort_p(v_term)) ? removal_nearest_isa_generate_cost_via_indexing(asent, sense) : $default_nearest_isa_naut_generate_cost$.getGlobalValue();
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 53000L)
    public static SubLObject inference_nearest_genls_of_type_check(SubLObject spec, SubLObject type, SubLObject genl, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject nearest_genls_of_type = inference_nearest_genls_of_type(spec, type, mt, UNPROVIDED);
        return subl_promotions.memberP(genl, nearest_genls_of_type, Symbols.symbol_function(EQUAL), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 53300L)
    public static SubLObject inference_nearest_genls_of_type(SubLObject col, SubLObject type_col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLObject all_genls = Sequences.remove(col, genls.all_genls(col, mt, tv), Symbols.symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject genls_of_type = isa.all_instances_among(type_col, all_genls, mt, tv);
        return genls.min_cols(genls_of_type, mt, tv);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 53600L)
    public static SubLObject make_nearest_genls_of_type_support(SubLObject support_sentence, SubLObject support_mt) {
        if (support_mt == UNPROVIDED) {
            support_mt = NIL;
        }
        SubLObject genls_support = arguments.make_hl_support($GENLS, support_sentence, UNPROVIDED, UNPROVIDED);
        SubLObject more_supports = NIL;
        return Values.values(genls_support, more_supports);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 53800L)
    public static SubLObject hl_verify_nearest_genls_of_type(SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, $list3);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, $list3);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, $list3);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, $list3);
        tv = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(support, $list3);
            return NIL;
        }
        if (hl_module != $GENLS) {
            return T;
        }
        SubLObject spec = el_utilities.literal_arg1(literal, UNPROVIDED);
        SubLObject type = el_utilities.literal_arg2(literal, UNPROVIDED);
        SubLObject genl = el_utilities.literal_arg3(literal, UNPROVIDED);
        return inference_nearest_genls_of_type_check(spec, type, genl, mt);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 54200L)
    public static SubLObject hl_justify_nearest_genls_of_type(SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, $list3);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, $list3);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, $list3);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, $list3);
        tv = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(support, $list3);
            return NIL;
        }
        if (hl_module != $GENLS) {
            return list(support);
        }
        SubLObject spec = el_utilities.literal_arg1(literal, UNPROVIDED);
        SubLObject type = el_utilities.literal_arg2(literal, UNPROVIDED);
        SubLObject genl = el_utilities.literal_arg3(literal, UNPROVIDED);
        SubLObject genls_asent = el_utilities.make_binary_formula($$genls, spec, genl);
        SubLObject isa_asent = el_utilities.make_binary_formula($$isa, genl, type);
        SubLObject thereexists_literal = list($$thereExists, $sym6$_NEARER, list($$and, list($$differentSymbols, $sym6$_NEARER, genl), listS($$genls, spec, $list9), list($$genls, $sym6$_NEARER, genl), list($$isa, $sym6$_NEARER, type)));
        SubLObject genls_literal = NIL;
        SubLObject isa_literal = NIL;
        SubLObject code_literal = NIL;
        if (NIL != cycl_utilities.negatedP(literal)) {
            genls_literal = cycl_utilities.negate(genls_asent);
            isa_literal = cycl_utilities.negate(isa_asent);
            code_literal = list($$knownSentence, thereexists_literal);
        } else {
            genls_literal = genls_asent;
            isa_literal = isa_asent;
            code_literal = list($$unknownSentence, thereexists_literal);
        }
        SubLObject genls_support = arguments.make_hl_support($GENLS, genls_literal, mt, tv);
        SubLObject isa_support = arguments.make_hl_support($ISA, isa_literal, mt, tv);
        SubLObject code_support = arguments.make_hl_support($CODE, code_literal, mt, tv);
        return list(genls_support, isa_support, code_support);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 56400L)
    public static SubLObject removal_nearest_genls_of_type_generate_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject spec = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        return (NIL != forts.fort_p(spec)) ? removal_nearest_genls_fort_generate_cost(asent, sense) : $default_nearest_genls_naut_generate_cost$.getGlobalValue();
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 58900L)
    public static SubLObject inference_nearest_arg_isa_check(SubLObject relation, SubLObject arg_num, SubLObject arg_isa) {
        return subl_promotions.memberP(arg_isa, kb_accessors.min_argn_isa(relation, arg_num, UNPROVIDED), Symbols.symbol_function(EQUAL), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 60000L)
    public static SubLObject removal_nearest_arg_isa_generate_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject relation = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject arg_num = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject count = ZERO_INTEGER;
        SubLObject pred_var = $$argIsa;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(relation, ONE_INTEGER, pred_var)) {
            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(relation, ONE_INTEGER, pred_var);
            SubLObject done_var = NIL;
            SubLObject token_var = NIL;
            while (NIL == done_var) {
                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                        SubLObject done_var_$3 = NIL;
                        SubLObject token_var_$4 = NIL;
                        while (NIL == done_var_$3) {
                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                            SubLObject valid_$5 = makeBoolean(!token_var_$4.eql(assertion));
                            if (NIL != valid_$5 && NIL != assertions_high.gaf_assertionP(assertion) && arg_num.eql(assertions_high.gaf_arg2(assertion))) {
                                count = Numbers.add(count, ONE_INTEGER);
                            }
                            done_var_$3 = makeBoolean(NIL == valid_$5);
                        }
                    } finally {
                        SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
                            SubLObject _values = Values.getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        } finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = makeBoolean(NIL == valid);
            }
        }
        return Numbers.max(count, ONE_INTEGER);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 60400L)
    public static SubLObject inference_nearest_arg_isa(SubLObject relation, SubLObject arg_num) {
        return iteration.new_list_iterator(kb_accessors.min_argn_isa(relation, arg_num, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 60500L)
    public static SubLObject make_nearest_arg_isa_support(SubLObject support_sentence, SubLObject support_mt) {
        if (support_mt == UNPROVIDED) {
            support_mt = NIL;
        }
        return Values.values(arguments.make_hl_support($OPAQUE, support_sentence, support_mt, UNPROVIDED), NIL);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 61700L)
    public static SubLObject removal_nearest_arg_isa_generate_reverse_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject arg_num = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject col = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        SubLObject count = ZERO_INTEGER;
        SubLObject pred_var = $$argIsa;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(col, THREE_INTEGER, pred_var)) {
            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(col, THREE_INTEGER, pred_var);
            SubLObject done_var = NIL;
            SubLObject token_var = NIL;
            while (NIL == done_var) {
                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                        SubLObject done_var_$6 = NIL;
                        SubLObject token_var_$7 = NIL;
                        while (NIL == done_var_$6) {
                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$7);
                            SubLObject valid_$8 = makeBoolean(!token_var_$7.eql(assertion));
                            if (NIL != valid_$8 && NIL != assertions_high.gaf_assertionP(assertion) && arg_num.eql(assertions_high.gaf_arg2(assertion))) {
                                count = Numbers.add(count, ONE_INTEGER);
                            }
                            done_var_$6 = makeBoolean(NIL == valid_$8);
                        }
                    } finally {
                        SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
                            SubLObject _values = Values.getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        } finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = makeBoolean(NIL == valid);
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 62100L)
    public static SubLObject inference_nearest_arg_isa_reverse(SubLObject arg_num, SubLObject col) {
        return new_inference_nearest_arg_isa_reverse_iterator(arg_num, col);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 62200L)
    public static SubLObject new_inference_nearest_arg_isa_reverse_iterator(SubLObject arg_num, SubLObject col) {
        return iteration.new_iterator(inference_nearest_arg_isa_reverse_iterator_state(arg_num, col), $sym120$INFERENCE_NEAREST_ARG_ISA_REVERSE_ITERATOR_DONE, $sym121$INFERENCE_NEAREST_ARG_ISA_REVERSE_ITERATOR_NEXT, $sym122$INFERENCE_NEAREST_ARG_ISA_REVERSE_ITERATOR_FINALIZE);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 62500L)
    public static SubLObject inference_nearest_arg_isa_reverse_iterator_state(SubLObject arg_num, SubLObject col) {
        return list(iteration.new_list_iterator(isa.all_fort_instances($$Relation, UNPROVIDED, UNPROVIDED)), arg_num, col);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 62700L)
    public static SubLObject inference_nearest_arg_isa_reverse_iterator_done(SubLObject state) {
        SubLObject pred_iterator = NIL;
        SubLObject arg_num = NIL;
        SubLObject col = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, $list124);
        pred_iterator = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, $list124);
        arg_num = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, $list124);
        col = current.first();
        current = current.rest();
        if (NIL == current) {
            return iteration.iteration_done(pred_iterator);
        }
        cdestructuring_bind.cdestructuring_bind_error(state, $list124);
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 62900L)
    public static SubLObject inference_nearest_arg_isa_reverse_iterator_next(SubLObject state) {
        SubLObject result = NIL;
        SubLObject invalidP = NIL;
        SubLObject pred_iterator = NIL;
        SubLObject arg_num = NIL;
        SubLObject col = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, $list124);
        pred_iterator = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, $list124);
        arg_num = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, $list124);
        col = current.first();
        current = current.rest();
        if (NIL == current) {
            while (NIL == result && NIL == invalidP) {
                SubLObject pred = iteration.iteration_next(pred_iterator);
                if (NIL != pred) {
                    if (NIL == subl_promotions.memberP(col, kb_accessors.min_argn_isa(pred, arg_num, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
                        continue;
                    }
                    result = pred;
                } else {
                    invalidP = T;
                }
            }
        } else {
            cdestructuring_bind.cdestructuring_bind_error(state, $list124);
        }
        return Values.values(result, state, invalidP);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 63300L)
    public static SubLObject inference_nearest_arg_isa_reverse_iterator_finalize(SubLObject state) {
        SubLObject pred_iterator = NIL;
        SubLObject arg_num = NIL;
        SubLObject col = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, $list124);
        pred_iterator = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, $list124);
        arg_num = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, $list124);
        col = current.first();
        current = current.rest();
        if (NIL == current) {
            return iteration.iteration_finalize(pred_iterator);
        }
        cdestructuring_bind.cdestructuring_bind_error(state, $list124);
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 64800L)
    public static SubLObject inference_nearest_arg_genl_check(SubLObject relation, SubLObject arg_num, SubLObject arg_genl) {
        return subl_promotions.memberP(arg_genl, kb_accessors.min_argn_genl(relation, arg_num, UNPROVIDED), Symbols.symbol_function(EQUAL), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 65900L)
    public static SubLObject removal_nearest_arg_genl_generate_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject relation = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject arg_num = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject count = ZERO_INTEGER;
        SubLObject pred_var = $$argGenl;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(relation, ONE_INTEGER, pred_var)) {
            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(relation, ONE_INTEGER, pred_var);
            SubLObject done_var = NIL;
            SubLObject token_var = NIL;
            while (NIL == done_var) {
                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                        SubLObject done_var_$9 = NIL;
                        SubLObject token_var_$10 = NIL;
                        while (NIL == done_var_$9) {
                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$10);
                            SubLObject valid_$11 = makeBoolean(!token_var_$10.eql(assertion));
                            if (NIL != valid_$11 && NIL != assertions_high.gaf_assertionP(assertion) && arg_num.eql(assertions_high.gaf_arg2(assertion))) {
                                count = Numbers.add(count, ONE_INTEGER);
                            }
                            done_var_$9 = makeBoolean(NIL == valid_$11);
                        }
                    } finally {
                        SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
                            SubLObject _values = Values.getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        } finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = makeBoolean(NIL == valid);
            }
        }
        return Numbers.max(count, ONE_INTEGER);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 66300L)
    public static SubLObject inference_nearest_arg_genl(SubLObject relation, SubLObject arg_num) {
        return iteration.new_list_iterator(kb_accessors.min_argn_genl(relation, arg_num, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 66400L)
    public static SubLObject make_nearest_arg_genl_support(SubLObject support_sentence, SubLObject support_mt) {
        if (support_mt == UNPROVIDED) {
            support_mt = NIL;
        }
        return Values.values(arguments.make_hl_support($OPAQUE, support_sentence, support_mt, UNPROVIDED), NIL);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 67500L)
    public static SubLObject removal_nearest_arg_genl_generate_reverse_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject arg_num = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject col = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        SubLObject count = ZERO_INTEGER;
        SubLObject pred_var = $$argGenl;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(col, THREE_INTEGER, pred_var)) {
            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(col, THREE_INTEGER, pred_var);
            SubLObject done_var = NIL;
            SubLObject token_var = NIL;
            while (NIL == done_var) {
                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                        SubLObject done_var_$12 = NIL;
                        SubLObject token_var_$13 = NIL;
                        while (NIL == done_var_$12) {
                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$13);
                            SubLObject valid_$14 = makeBoolean(!token_var_$13.eql(assertion));
                            if (NIL != valid_$14 && NIL != assertions_high.gaf_assertionP(assertion) && arg_num.eql(assertions_high.gaf_arg2(assertion))) {
                                count = Numbers.add(count, ONE_INTEGER);
                            }
                            done_var_$12 = makeBoolean(NIL == valid_$14);
                        }
                    } finally {
                        SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
                            SubLObject _values = Values.getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        } finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = makeBoolean(NIL == valid);
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 67900L)
    public static SubLObject inference_nearest_arg_genl_reverse(SubLObject arg_num, SubLObject col) {
        return new_inference_nearest_arg_genl_reverse_iterator(arg_num, col);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 68100L)
    public static SubLObject new_inference_nearest_arg_genl_reverse_iterator(SubLObject arg_num, SubLObject col) {
        return iteration.new_iterator(inference_nearest_arg_genl_reverse_iterator_state(arg_num, col), $sym135$INFERENCE_NEAREST_ARG_GENL_REVERSE_ITERATOR_DONE, $sym136$INFERENCE_NEAREST_ARG_GENL_REVERSE_ITERATOR_NEXT, $sym137$INFERENCE_NEAREST_ARG_GENL_REVERSE_ITERATOR_FINALIZE);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 68400L)
    public static SubLObject inference_nearest_arg_genl_reverse_iterator_state(SubLObject arg_num, SubLObject col) {
        return list(iteration.new_list_iterator(isa.all_fort_instances($$Relation, UNPROVIDED, UNPROVIDED)), arg_num, col);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 68600L)
    public static SubLObject inference_nearest_arg_genl_reverse_iterator_done(SubLObject state) {
        SubLObject pred_iterator = NIL;
        SubLObject arg_num = NIL;
        SubLObject col = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, $list124);
        pred_iterator = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, $list124);
        arg_num = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, $list124);
        col = current.first();
        current = current.rest();
        if (NIL == current) {
            return iteration.iteration_done(pred_iterator);
        }
        cdestructuring_bind.cdestructuring_bind_error(state, $list124);
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 68800L)
    public static SubLObject inference_nearest_arg_genl_reverse_iterator_next(SubLObject state) {
        SubLObject result = NIL;
        SubLObject invalidP = NIL;
        SubLObject pred_iterator = NIL;
        SubLObject arg_num = NIL;
        SubLObject col = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, $list124);
        pred_iterator = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, $list124);
        arg_num = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, $list124);
        col = current.first();
        current = current.rest();
        if (NIL == current) {
            while (NIL == result && NIL == invalidP) {
                SubLObject pred = iteration.iteration_next(pred_iterator);
                if (NIL != pred) {
                    if (NIL == subl_promotions.memberP(col, kb_accessors.min_argn_genl(pred, arg_num, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
                        continue;
                    }
                    result = pred;
                } else {
                    invalidP = T;
                }
            }
        } else {
            cdestructuring_bind.cdestructuring_bind_error(state, $list124);
        }
        return Values.values(result, state, invalidP);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 69200L)
    public static SubLObject inference_nearest_arg_genl_reverse_iterator_finalize(SubLObject state) {
        SubLObject pred_iterator = NIL;
        SubLObject arg_num = NIL;
        SubLObject col = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, $list124);
        pred_iterator = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, $list124);
        arg_num = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, $list124);
        col = current.first();
        current = current.rest();
        if (NIL == current) {
            return iteration.iteration_finalize(pred_iterator);
        }
        cdestructuring_bind.cdestructuring_bind_error(state, $list124);
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 69800L)
    public static SubLObject near_narrow_specs(SubLObject v_term, SubLObject cutoff) {
        if (cutoff == UNPROVIDED) {
            cutoff = $near_narrow_specs_completeness_cutoff$.getDynamicValue();
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != Types.numberp(cutoff) : cutoff;
        if (NIL == fort_types_interface.collection_p(v_term)) {
            return NIL;
        }
        if (cutoff.numL(ONE_INTEGER)) {
            return NIL;
        }
        if (cutoff.numL(TWO_INTEGER)) {
            return list(v_term);
        }
        if (cardinality_estimates.generality_estimate(v_term).numG($near_narrow_specs_generality_cutoff$.getDynamicValue(thread))) {
            return NIL;
        }
        if (cardinality_estimates.generality_estimate(v_term).numL(cutoff)) {
            return genls.all_specs(v_term, UNPROVIDED, UNPROVIDED);
        }
        if (NIL == genls.asserted_specs(v_term, UNPROVIDED)) {
            return list(v_term);
        }
        SubLObject recurse_cutoff = Numbers.multiply(TWO_INTEGER, Numbers.divide(cutoff, Sequences.length(genls.max_specs(v_term, UNPROVIDED, UNPROVIDED))));
        SubLObject result = NIL;
        if (NIL == conses_high.member(v_term, result, Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY))) {
            result = cons(v_term, result);
        }
        SubLObject cdolist_list_var = genls.max_specs(v_term, UNPROVIDED, UNPROVIDED);
        SubLObject max_specs = NIL;
        max_specs = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$15 = near_narrow_specs(max_specs, recurse_cutoff);
            SubLObject near_narrow_spec = NIL;
            near_narrow_spec = cdolist_list_var_$15.first();
            while (NIL != cdolist_list_var_$15) {
                SubLObject item_var = near_narrow_spec;
                if (NIL == conses_high.member(item_var, result, Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY))) {
                    result = cons(item_var, result);
                }
                cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                near_narrow_spec = cdolist_list_var_$15.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            max_specs = cdolist_list_var.first();
        }
        return result;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 70900L)
    public static SubLObject removal_near_narrow_specs_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject collection = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        return Numbers.max(cardinality_estimates.spec_cardinality(collection), kb_indexing.relevant_num_gaf_arg_index(collection, TWO_INTEGER, $$genls));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 71200L)
    public static SubLObject removal_near_narrow_specs_iterator(SubLObject collection) {
        return iteration.new_list_iterator(near_narrow_specs(collection, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 72000L)
    public static SubLObject removal_near_narrow_specs_check_pos_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject genl = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject spec = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (NIL != subl_promotions.memberP(spec, near_narrow_specs(genl, UNPROVIDED), Symbols.symbol_function(EQUAL), UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($OPAQUE, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 73100L)
    public static SubLObject removal_threshold_specs_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject collection = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        return Numbers.max(cardinality_estimates.spec_cardinality(collection), kb_indexing.relevant_num_gaf_arg_index(collection, TWO_INTEGER, $$genls));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 73400L)
    public static SubLObject collection_below_specs_threshholdP(SubLObject collection) {
        SubLObject include_cols = kb_mapping_utilities.pred_refs($$includeInThresholdSpecs, ONE_INTEGER, UNPROVIDED);
        SubLObject exclude_cols = kb_mapping_utilities.pred_refs($$excludeFromThresholdSpecs, ONE_INTEGER, UNPROVIDED);
        if (NIL != subl_promotions.memberP(collection, include_cols, Symbols.symbol_function(EQUAL), UNPROVIDED)) {
            return T;
        }
        if (NIL != subl_promotions.memberP(collection, exclude_cols, Symbols.symbol_function(EQUAL), UNPROVIDED)) {
            return NIL;
        }
        if (NIL != genls.any_genlP(collection, include_cols, UNPROVIDED, UNPROVIDED) || NIL == genls.any_specP(collection, exclude_cols, UNPROVIDED, UNPROVIDED)) {
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 73900L)
    public static SubLObject removal_threshold_specs_iterator(SubLObject collection) {
        if (NIL != collection_below_specs_threshholdP(collection)) {
            return iteration.new_list_iterator(removal_modules_genls.inference_all_specs(collection, UNPROVIDED, UNPROVIDED));
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 74700L)
    public static SubLObject removal_threshold_specs_check_pos_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject genl = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject spec = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (NIL != collection_below_specs_threshholdP(genl) && NIL != genls.genlP(spec, genl, UNPROVIDED, UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($OPAQUE, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject declare_removal_modules_nearest_isa_file() {
        declareFunction(myName, "inference_nearest_isa_check", "INFERENCE-NEAREST-ISA-CHECK", 2, 1, false);
        declareFunction(myName, "inference_nearest_isa", "INFERENCE-NEAREST-ISA", 1, 1, false);
        declareFunction(myName, "inference_nearest_instances", "INFERENCE-NEAREST-INSTANCES", 1, 1, false);
        declareFunction(myName, "make_nearest_isa_support", "MAKE-NEAREST-ISA-SUPPORT", 1, 1, false);
        declareFunction(myName, "hl_verify_nearest_isa", "HL-VERIFY-NEAREST-ISA", 1, 0, false);
        declareFunction(myName, "hl_justify_nearest_isa", "HL-JUSTIFY-NEAREST-ISA", 1, 0, false);
        declareFunction(myName, "removal_nearest_isa_check", "REMOVAL-NEAREST-ISA-CHECK", 1, 0, false);
        declareFunction(myName, "removal_nearest_isa_generate_cost", "REMOVAL-NEAREST-ISA-GENERATE-COST", 1, 1, false);
        declareFunction(myName, "removal_nearest_isa_generate_cost_via_indexing", "REMOVAL-NEAREST-ISA-GENERATE-COST-VIA-INDEXING", 1, 1, false);
        declareFunction(myName, "removal_nearest_instances_generate_cost", "REMOVAL-NEAREST-INSTANCES-GENERATE-COST", 1, 1, false);
        declareFunction(myName, "inference_nearest_genls_check", "INFERENCE-NEAREST-GENLS-CHECK", 2, 1, false);
        declareFunction(myName, "inference_nearest_genls", "INFERENCE-NEAREST-GENLS", 1, 1, false);
        declareFunction(myName, "inference_nearest_specs", "INFERENCE-NEAREST-SPECS", 1, 1, false);
        declareFunction(myName, "make_nearest_genls_support", "MAKE-NEAREST-GENLS-SUPPORT", 1, 1, false);
        declareFunction(myName, "hl_verify_nearest_genls", "HL-VERIFY-NEAREST-GENLS", 1, 0, false);
        declareFunction(myName, "hl_justify_nearest_genls", "HL-JUSTIFY-NEAREST-GENLS", 1, 0, false);
        declareFunction(myName, "removal_nearest_genls_check", "REMOVAL-NEAREST-GENLS-CHECK", 1, 0, false);
        declareFunction(myName, "removal_nearest_genls_fort_generate_cost", "REMOVAL-NEAREST-GENLS-FORT-GENERATE-COST", 1, 1, false);
        declareFunction(myName, "removal_nearest_specs_generate_cost", "REMOVAL-NEAREST-SPECS-GENERATE-COST", 1, 1, false);
        declareFunction(myName, "inference_nearest_genl_mt_check", "INFERENCE-NEAREST-GENL-MT-CHECK", 2, 1, false);
        declareFunction(myName, "inference_nearest_genl_mts", "INFERENCE-NEAREST-GENL-MTS", 1, 1, false);
        declareFunction(myName, "inference_nearest_spec_mts", "INFERENCE-NEAREST-SPEC-MTS", 1, 1, false);
        declareFunction(myName, "removal_nearest_genl_mt_check", "REMOVAL-NEAREST-GENL-MT-CHECK", 1, 0, false);
        declareFunction(myName, "removal_nearest_genl_mts_generate_cost", "REMOVAL-NEAREST-GENL-MTS-GENERATE-COST", 1, 1, false);
        declareFunction(myName, "removal_nearest_spec_mts_generate_cost", "REMOVAL-NEAREST-SPEC-MTS-GENERATE-COST", 1, 1, false);
        declareFunction(myName, "removal_nearest_genl_mts_check_expand", "REMOVAL-NEAREST-GENL-MTS-CHECK-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_nearest_genl_mts_generate_expand", "REMOVAL-NEAREST-GENL-MTS-GENERATE-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_nearest_spec_mts_generate_expand", "REMOVAL-NEAREST-SPEC-MTS-GENERATE-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_nearest_genl_preds_generate_cost", "REMOVAL-NEAREST-GENL-PREDS-GENERATE-COST", 1, 1, false);
        declareFunction(myName, "removal_nearest_genl_preds_check", "REMOVAL-NEAREST-GENL-PREDS-CHECK", 1, 0, false);
        declareFunction(myName, "inference_nearest_genl_preds", "INFERENCE-NEAREST-GENL-PREDS", 1, 1, false);
        declareFunction(myName, "inference_nearest_genl_preds_check", "INFERENCE-NEAREST-GENL-PREDS-CHECK", 2, 0, false);
        declareFunction(myName, "removal_nearest_spec_preds_generate_cost", "REMOVAL-NEAREST-SPEC-PREDS-GENERATE-COST", 1, 1, false);
        declareFunction(myName, "inference_nearest_spec_preds", "INFERENCE-NEAREST-SPEC-PREDS", 1, 1, false);
        declareFunction(myName, "removal_nearest_common_isa_check", "REMOVAL-NEAREST-COMMON-ISA-CHECK", 1, 0, false);
        declareFunction(myName, "inference_nearest_common_isa", "INFERENCE-NEAREST-COMMON-ISA", 2, 1, false);
        declareFunction(myName, "make_nearest_common_genls_support", "MAKE-NEAREST-COMMON-GENLS-SUPPORT", 1, 1, false);
        declareFunction(myName, "removal_nearest_common_genls_check", "REMOVAL-NEAREST-COMMON-GENLS-CHECK", 1, 0, false);
        declareFunction(myName, "inference_nearest_common_genls", "INFERENCE-NEAREST-COMMON-GENLS", 2, 1, false);
        declareFunction(myName, "make_nearest_common_genls_of_set_support", "MAKE-NEAREST-COMMON-GENLS-OF-SET-SUPPORT", 1, 1, false);
        declareFunction(myName, "removal_nearest_common_genls_of_set_check", "REMOVAL-NEAREST-COMMON-GENLS-OF-SET-CHECK", 2, 0, false);
        declareFunction(myName, "removal_nearest_common_specs_check", "REMOVAL-NEAREST-COMMON-SPECS-CHECK", 1, 0, false);
        declareFunction(myName, "inference_nearest_common_specs", "INFERENCE-NEAREST-COMMON-SPECS", 2, 1, false);
        declareFunction(myName, "removal_nearest_common_genl_mts_check_expand", "REMOVAL-NEAREST-COMMON-GENL-MTS-CHECK-EXPAND", 1, 1, false);
        declareFunction(myName, "inference_nearest_common_genl_mts", "INFERENCE-NEAREST-COMMON-GENL-MTS", 2, 1, false);
        declareFunction(myName, "removal_nearest_common_spec_mts_check_expand", "REMOVAL-NEAREST-COMMON-SPEC-MTS-CHECK-EXPAND", 1, 1, false);
        declareFunction(myName, "inference_nearest_common_spec_mts", "INFERENCE-NEAREST-COMMON-SPEC-MTS", 2, 1, false);
        declareFunction(myName, "removal_nearest_different_isa_check", "REMOVAL-NEAREST-DIFFERENT-ISA-CHECK", 1, 0, false);
        declareFunction(myName, "inference_nearest_different_isa", "INFERENCE-NEAREST-DIFFERENT-ISA", 2, 1, false);
        declareFunction(myName, "removal_nearest_different_isa_generate_cost", "REMOVAL-NEAREST-DIFFERENT-ISA-GENERATE-COST", 1, 1, false);
        declareFunction(myName, "removal_nearest_different_genls_check", "REMOVAL-NEAREST-DIFFERENT-GENLS-CHECK", 1, 1, false);
        declareFunction(myName, "inference_nearest_different_genls", "INFERENCE-NEAREST-DIFFERENT-GENLS", 2, 1, false);
        declareFunction(myName, "removal_nearest_different_genls_generate_cost", "REMOVAL-NEAREST-DIFFERENT-GENLS-GENERATE-COST", 1, 1, false);
        declareFunction(myName, "inference_nearest_isa_of_type_check", "INFERENCE-NEAREST-ISA-OF-TYPE-CHECK", 3, 1, false);
        declareFunction(myName, "inference_nearest_isas_of_type", "INFERENCE-NEAREST-ISAS-OF-TYPE", 2, 1, false);
        declareFunction(myName, "make_nearest_isa_of_type_support", "MAKE-NEAREST-ISA-OF-TYPE-SUPPORT", 1, 1, false);
        declareFunction(myName, "hl_verify_nearest_isa_of_type", "HL-VERIFY-NEAREST-ISA-OF-TYPE", 1, 0, false);
        declareFunction(myName, "hl_justify_nearest_isa_of_type", "HL-JUSTIFY-NEAREST-ISA-OF-TYPE", 1, 0, false);
        declareFunction(myName, "removal_nearest_isa_of_type_generate_cost", "REMOVAL-NEAREST-ISA-OF-TYPE-GENERATE-COST", 1, 1, false);
        declareFunction(myName, "inference_nearest_genls_of_type_check", "INFERENCE-NEAREST-GENLS-OF-TYPE-CHECK", 3, 1, false);
        declareFunction(myName, "inference_nearest_genls_of_type", "INFERENCE-NEAREST-GENLS-OF-TYPE", 2, 2, false);
        declareFunction(myName, "make_nearest_genls_of_type_support", "MAKE-NEAREST-GENLS-OF-TYPE-SUPPORT", 1, 1, false);
        declareFunction(myName, "hl_verify_nearest_genls_of_type", "HL-VERIFY-NEAREST-GENLS-OF-TYPE", 1, 0, false);
        declareFunction(myName, "hl_justify_nearest_genls_of_type", "HL-JUSTIFY-NEAREST-GENLS-OF-TYPE", 1, 0, false);
        declareFunction(myName, "removal_nearest_genls_of_type_generate_cost", "REMOVAL-NEAREST-GENLS-OF-TYPE-GENERATE-COST", 1, 1, false);
        declareFunction(myName, "inference_nearest_arg_isa_check", "INFERENCE-NEAREST-ARG-ISA-CHECK", 3, 0, false);
        declareFunction(myName, "removal_nearest_arg_isa_generate_cost", "REMOVAL-NEAREST-ARG-ISA-GENERATE-COST", 1, 1, false);
        declareFunction(myName, "inference_nearest_arg_isa", "INFERENCE-NEAREST-ARG-ISA", 2, 0, false);
        declareFunction(myName, "make_nearest_arg_isa_support", "MAKE-NEAREST-ARG-ISA-SUPPORT", 1, 1, false);
        declareFunction(myName, "removal_nearest_arg_isa_generate_reverse_cost", "REMOVAL-NEAREST-ARG-ISA-GENERATE-REVERSE-COST", 1, 1, false);
        declareFunction(myName, "inference_nearest_arg_isa_reverse", "INFERENCE-NEAREST-ARG-ISA-REVERSE", 2, 0, false);
        declareFunction(myName, "new_inference_nearest_arg_isa_reverse_iterator", "NEW-INFERENCE-NEAREST-ARG-ISA-REVERSE-ITERATOR", 2, 0, false);
        declareFunction(myName, "inference_nearest_arg_isa_reverse_iterator_state", "INFERENCE-NEAREST-ARG-ISA-REVERSE-ITERATOR-STATE", 2, 0, false);
        declareFunction(myName, "inference_nearest_arg_isa_reverse_iterator_done", "INFERENCE-NEAREST-ARG-ISA-REVERSE-ITERATOR-DONE", 1, 0, false);
        declareFunction(myName, "inference_nearest_arg_isa_reverse_iterator_next", "INFERENCE-NEAREST-ARG-ISA-REVERSE-ITERATOR-NEXT", 1, 0, false);
        declareFunction(myName, "inference_nearest_arg_isa_reverse_iterator_finalize", "INFERENCE-NEAREST-ARG-ISA-REVERSE-ITERATOR-FINALIZE", 1, 0, false);
        declareFunction(myName, "inference_nearest_arg_genl_check", "INFERENCE-NEAREST-ARG-GENL-CHECK", 3, 0, false);
        declareFunction(myName, "removal_nearest_arg_genl_generate_cost", "REMOVAL-NEAREST-ARG-GENL-GENERATE-COST", 1, 1, false);
        declareFunction(myName, "inference_nearest_arg_genl", "INFERENCE-NEAREST-ARG-GENL", 2, 0, false);
        declareFunction(myName, "make_nearest_arg_genl_support", "MAKE-NEAREST-ARG-GENL-SUPPORT", 1, 1, false);
        declareFunction(myName, "removal_nearest_arg_genl_generate_reverse_cost", "REMOVAL-NEAREST-ARG-GENL-GENERATE-REVERSE-COST", 1, 1, false);
        declareFunction(myName, "inference_nearest_arg_genl_reverse", "INFERENCE-NEAREST-ARG-GENL-REVERSE", 2, 0, false);
        declareFunction(myName, "new_inference_nearest_arg_genl_reverse_iterator", "NEW-INFERENCE-NEAREST-ARG-GENL-REVERSE-ITERATOR", 2, 0, false);
        declareFunction(myName, "inference_nearest_arg_genl_reverse_iterator_state", "INFERENCE-NEAREST-ARG-GENL-REVERSE-ITERATOR-STATE", 2, 0, false);
        declareFunction(myName, "inference_nearest_arg_genl_reverse_iterator_done", "INFERENCE-NEAREST-ARG-GENL-REVERSE-ITERATOR-DONE", 1, 0, false);
        declareFunction(myName, "inference_nearest_arg_genl_reverse_iterator_next", "INFERENCE-NEAREST-ARG-GENL-REVERSE-ITERATOR-NEXT", 1, 0, false);
        declareFunction(myName, "inference_nearest_arg_genl_reverse_iterator_finalize", "INFERENCE-NEAREST-ARG-GENL-REVERSE-ITERATOR-FINALIZE", 1, 0, false);
        declareFunction(myName, "near_narrow_specs", "NEAR-NARROW-SPECS", 1, 1, false);
        declareFunction(myName, "removal_near_narrow_specs_cost", "REMOVAL-NEAR-NARROW-SPECS-COST", 1, 1, false);
        declareFunction(myName, "removal_near_narrow_specs_iterator", "REMOVAL-NEAR-NARROW-SPECS-ITERATOR", 1, 0, false);
        declareFunction(myName, "removal_near_narrow_specs_check_pos_expand", "REMOVAL-NEAR-NARROW-SPECS-CHECK-POS-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_threshold_specs_cost", "REMOVAL-THRESHOLD-SPECS-COST", 1, 1, false);
        declareFunction(myName, "collection_below_specs_threshholdP", "COLLECTION-BELOW-SPECS-THRESHHOLD?", 1, 0, false);
        declareFunction(myName, "removal_threshold_specs_iterator", "REMOVAL-THRESHOLD-SPECS-ITERATOR", 1, 0, false);
        declareFunction(myName, "removal_threshold_specs_check_pos_expand", "REMOVAL-THRESHOLD-SPECS-CHECK-POS-EXPAND", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_nearest_isa_file() {
        $default_nearest_isa_check_cost$ = defparameter("*DEFAULT-NEAREST-ISA-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        $average_naut_nearest_isa_count$ = deflexical("*AVERAGE-NAUT-NEAREST-ISA-COUNT*", ONE_INTEGER);
        $default_nearest_isa_naut_generate_cost$ = deflexical("*DEFAULT-NEAREST-ISA-NAUT-GENERATE-COST*", $average_naut_nearest_isa_count$.getGlobalValue());
        $default_nearest_genls_check_cost$ = defparameter("*DEFAULT-NEAREST-GENLS-CHECK-COST*", control_vars.$hl_module_check_cost$.getDynamicValue());
        $average_naut_nearest_genls_count$ = deflexical("*AVERAGE-NAUT-NEAREST-GENLS-COUNT*", ONE_INTEGER);
        $default_nearest_genls_naut_generate_cost$ = deflexical("*DEFAULT-NEAREST-GENLS-NAUT-GENERATE-COST*", $average_naut_nearest_genls_count$.getGlobalValue());
        $default_nearest_genl_mts_check_cost$ = defparameter("*DEFAULT-NEAREST-GENL-MTS-CHECK-COST*", control_vars.$hl_module_check_cost$.getDynamicValue());
        $default_nearest_genl_preds_check_cost$ = defparameter("*DEFAULT-NEAREST-GENL-PREDS-CHECK-COST*", control_vars.$hl_module_check_cost$.getDynamicValue());
        $default_nearest_common_isa_check_cost$ = defparameter("*DEFAULT-NEAREST-COMMON-ISA-CHECK-COST*", control_vars.$hl_module_check_cost$.getDynamicValue());
        $average_nearest_common_isa_count$ = defparameter("*AVERAGE-NEAREST-COMMON-ISA-COUNT*", ONE_INTEGER);
        $default_nearest_common_genls_check_cost$ = defparameter("*DEFAULT-NEAREST-COMMON-GENLS-CHECK-COST*", control_vars.$hl_module_check_cost$.getDynamicValue());
        $average_nearest_common_genls_count$ = defparameter("*AVERAGE-NEAREST-COMMON-GENLS-COUNT*", ONE_INTEGER);
        $default_nearest_common_specs_check_cost$ = defparameter("*DEFAULT-NEAREST-COMMON-SPECS-CHECK-COST*", control_vars.$hl_module_check_cost$.getDynamicValue());
        $average_nearest_common_specs_count$ = defparameter("*AVERAGE-NEAREST-COMMON-SPECS-COUNT*", TWO_INTEGER);
        $default_nearest_common_genl_mts_check_cost$ = defparameter("*DEFAULT-NEAREST-COMMON-GENL-MTS-CHECK-COST*", control_vars.$hl_module_check_cost$.getDynamicValue());
        $average_nearest_common_genl_mts_count$ = defparameter("*AVERAGE-NEAREST-COMMON-GENL-MTS-COUNT*", ONE_INTEGER);
        $default_nearest_common_spec_mts_check_cost$ = defparameter("*DEFAULT-NEAREST-COMMON-SPEC-MTS-CHECK-COST*", control_vars.$hl_module_check_cost$.getDynamicValue());
        $average_nearest_common_spec_mts_count$ = defparameter("*AVERAGE-NEAREST-COMMON-SPEC-MTS-COUNT*", ONE_INTEGER);
        $default_nearest_different_isa_check_cost$ = defparameter("*DEFAULT-NEAREST-DIFFERENT-ISA-CHECK-COST*", control_vars.$hl_module_check_cost$.getDynamicValue());
        $default_nearest_different_genls_check_cost$ = defparameter("*DEFAULT-NEAREST-DIFFERENT-GENLS-CHECK-COST*", control_vars.$hl_module_check_cost$.getDynamicValue());
        $near_narrow_specs_generality_cutoff$ = defparameter("*NEAR-NARROW-SPECS-GENERALITY-CUTOFF*", $int$10000);
        $near_narrow_specs_completeness_cutoff$ = defparameter("*NEAR-NARROW-SPECS-COMPLETENESS-CUTOFF*", $int$212);
        return NIL;
    }

    public static SubLObject setup_removal_modules_nearest_isa_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$nearestIsa);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$nearestIsa);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_ISA_CHECK, $list15);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_ISA_GENERATE, $list17);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_INSTANCES_GENERATE, $list19);
        inference_modules.register_solely_specific_removal_module_predicate($$nearestGenls);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$nearestGenls);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_GENLS_FORT_CHECK, $list23);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_GENLS_NAUT_CHECK, $list25);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_GENLS_FORT_GENERATE, $list27);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_GENLS_NAUT_GENERATE, $list29);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_SPECS_GENERATE, $list31);
        inference_modules.register_solely_specific_removal_module_predicate($$nearestGenlMt);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$nearestGenlMt);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_GENL_MTS_CHECK, $list34);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_GENL_MTS_GENERATE, $list37);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_SPEC_MTS_GENERATE, $list39);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_GENL_MTS_CHECK, $list40);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_GENL_MTS_GENERATE, $list41);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_SPEC_MTS_GENERATE, $list42);
        inference_modules.register_solely_specific_removal_module_predicate($$nearestGenlPreds);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$nearestGenlPreds);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_GENL_PREDS_CHECK, $list45);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_GENL_PREDS_GENERATE, $list49);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_SPEC_PREDS_GENERATE, $list51);
        inference_modules.register_solely_specific_removal_module_predicate($$nearestCommonIsa);
        preference_modules.doomed_unless_arg_bindable($POS, $$nearestCommonIsa, ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $$nearestCommonIsa, TWO_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_COMMON_ISA_CHECK, $list54);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_COMMON_ISA_GENERATE, $list56);
        inference_modules.register_solely_specific_removal_module_predicate($$nearestCommonGenls);
        preference_modules.doomed_unless_arg_bindable($POS, $$nearestCommonGenls, ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $$nearestCommonGenls, TWO_INTEGER);
        utilities_macros.note_funcall_helper_function($sym62$MAKE_NEAREST_COMMON_GENLS_SUPPORT);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_COMMON_GENLS_CHECK, $list64);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_COMMON_GENLS_GENERATE, $list66);
        inference_modules.register_solely_specific_removal_module_predicate($$nearestCommonGenlsOfSet);
        preference_modules.doomed_unless_arg_bindable($POS, $$nearestCommonGenlsOfSet, ONE_INTEGER);
        utilities_macros.note_funcall_helper_function($sym69$MAKE_NEAREST_COMMON_GENLS_OF_SET_SUPPORT);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_COMMON_GENLS_OF_SET_CHECK, $list71);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_COMMON_GENLS_OF_SET_GENERATE, $list73);
        inference_modules.register_solely_specific_removal_module_predicate($$nearestCommonSpecs);
        preference_modules.doomed_unless_arg_bindable($POS, $$nearestCommonSpecs, ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $$nearestCommonSpecs, TWO_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_COMMON_SPECS_CHECK, $list76);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_COMMON_SPECS_GENERATE, $list78);
        inference_modules.register_solely_specific_removal_module_predicate($$nearestCommonGenlMt);
        preference_modules.doomed_unless_arg_bindable($POS, $$nearestCommonGenlMt, ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $$nearestCommonGenlMt, TWO_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_COMMON_GENL_MTS_CHECK, $list81);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_COMMON_GENL_MTS_GENERATE, $list83);
        inference_modules.register_solely_specific_removal_module_predicate($$nearestCommonSpecMt);
        preference_modules.doomed_unless_arg_bindable($POS, $$nearestCommonSpecMt, ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $$nearestCommonSpecMt, TWO_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_COMMON_SPEC_MTS_CHECK, $list86);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_COMMON_SPEC_MTS_GENERATE, $list88);
        inference_modules.register_solely_specific_removal_module_predicate($$nearestDifferentIsa);
        preference_modules.doomed_unless_arg_bindable($POS, $$nearestDifferentIsa, ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $$nearestDifferentIsa, TWO_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_DIFFERENT_ISA_CHECK, $list91);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_DIFFERENT_ISA_GENERATE, $list93);
        inference_modules.register_solely_specific_removal_module_predicate($$nearestDifferentGenls);
        preference_modules.doomed_unless_arg_bindable($POS, $$nearestDifferentGenls, ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $$nearestDifferentGenls, TWO_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_DIFFERENT_GENLS_CHECK, $list96);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_DIFFERENT_GENLS_GENERATE, $list98);
        inference_modules.register_solely_specific_removal_module_predicate($$nearestIsaOfType);
        preference_modules.doomed_unless_arg_bindable($POS, $$nearestIsaOfType, ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $$nearestIsaOfType, TWO_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_ISA_OF_TYPE_CHECK, $list101);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_ISA_OF_TYPE_GENERATE, $list103);
        inference_modules.register_solely_specific_removal_module_predicate($$nearestGenlsOfType);
        preference_modules.doomed_unless_arg_bindable($POS, $$nearestGenlsOfType, ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $$nearestGenlsOfType, TWO_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_GENLS_OF_TYPE_CHECK, $list106);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_GENLS_OF_TYPE_GENERATE, $list108);
        inference_modules.register_solely_specific_removal_module_predicate($$nearestArgIsa);
        preference_modules.doomed_unless_arg_bindable($POS, $$nearestArgIsa, TWO_INTEGER);
        preference_modules.inference_preference_module($NEAREST_ARG_ISA_UNBOUND_RELATION_AND_COLLECTION_POS, $list111);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_ARG_ISA_CHECK, $list113);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_ARG_ISA_GENERATE, $list115);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_ARG_ISA_GENERATE_REVERSE, $list119);
        inference_modules.register_solely_specific_removal_module_predicate($$nearestArgGenl);
        preference_modules.doomed_unless_arg_bindable($POS, $$nearestArgGenl, TWO_INTEGER);
        preference_modules.inference_preference_module($NEAREST_ARG_GENL_UNBOUND_RELATION_AND_COLLECTION_POS, $list127);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_ARG_GENL_CHECK, $list129);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_ARG_GENL_GENERATE, $list131);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_ARG_GENL_GENERATE_REVERSE, $list134);
        inference_modules.register_solely_specific_removal_module_predicate($$nearNarrowSpecs);
        preference_modules.inference_preference_module($NEAR_NARROW_SPECS_GENERATE_POS, $list143);
        preference_modules.doomed_unless_arg_bindable($POS, $$nearNarrowSpecs, ONE_INTEGER);
        inference_modules.inference_removal_module($NEAR_NARROW_SPECS_GENERATE_POS, $list144);
        inference_modules.inference_removal_module($NEAR_NARROW_SPECS_CHECK_POS, $list146);
        inference_modules.register_solely_specific_removal_module_predicate($$thresholdSpecs);
        preference_modules.inference_preference_module($NEAR_NARROW_SPECS_GENERATE_POS, $list148);
        preference_modules.doomed_unless_arg_bindable($POS, $$thresholdSpecs, ONE_INTEGER);
        inference_modules.inference_removal_module($THRESHOLD_SPECS_GENERATE_POS, $list152);
        inference_modules.inference_removal_module($THRESHOLD_SPECS_CHECK_POS, $list154);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_nearest_isa_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_nearest_isa_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_nearest_isa_file();
    }

    static {
        me = new removal_modules_nearest_isa();
        $default_nearest_isa_check_cost$ = null;
        $average_naut_nearest_isa_count$ = null;
        $default_nearest_isa_naut_generate_cost$ = null;
        $default_nearest_genls_check_cost$ = null;
        $average_naut_nearest_genls_count$ = null;
        $default_nearest_genls_naut_generate_cost$ = null;
        $default_nearest_genl_mts_check_cost$ = null;
        $default_nearest_genl_preds_check_cost$ = null;
        $default_nearest_common_isa_check_cost$ = null;
        $average_nearest_common_isa_count$ = null;
        $default_nearest_common_genls_check_cost$ = null;
        $average_nearest_common_genls_count$ = null;
        $default_nearest_common_specs_check_cost$ = null;
        $average_nearest_common_specs_count$ = null;
        $default_nearest_common_genl_mts_check_cost$ = null;
        $average_nearest_common_genl_mts_count$ = null;
        $default_nearest_common_spec_mts_check_cost$ = null;
        $average_nearest_common_spec_mts_count$ = null;
        $default_nearest_different_isa_check_cost$ = null;
        $default_nearest_different_genls_check_cost$ = null;
        $near_narrow_specs_generality_cutoff$ = null;
        $near_narrow_specs_completeness_cutoff$ = null;
        $$nearestIsa = makeConstSym(("nearestIsa"));
        $POS = makeKeyword("POS");
        $ISA = makeKeyword("ISA");
        $list3 = list(makeSymbol("HL-MODULE"), makeSymbol("LITERAL"), makeSymbol("MT"), makeSymbol("TV"));
        $$isa = makeConstSym(("isa"));
        $$thereExists = makeConstSym(("thereExists"));
        $sym6$_NEARER = makeSymbol("?NEARER");
        $$and = makeConstSym(("and"));
        $$differentSymbols = makeConstSym(("differentSymbols"));
        $list9 = list(makeSymbol("?NEARER"));
        $$genls = makeConstSym(("genls"));
        $$knownSentence = makeConstSym(("knownSentence"));
        $$unknownSentence = makeConstSym(("unknownSentence"));
        $OPAQUE = makeKeyword("OPAQUE");
        $REMOVAL_NEAREST_ISA_CHECK = makeKeyword("REMOVAL-NEAREST-ISA-CHECK");
        $list15 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nearestIsa")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("nearestIsa")), makeKeyword("FULLY-BOUND"), makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"),
                makeSymbol("*DEFAULT-NEAREST-ISA-CHECK-COST*"), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-NEAREST-ISA-CHECK"), makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("MAKE-NEAREST-ISA-SUPPORT"), makeKeyword("DOCUMENTATION"),
                makeString("(#$nearestIsa <fully-bound> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestIsa #$Canada #$IndependentCountry)\n(#$nearestIsa (#$YearFn 2001) #$CalendarYear)") });
        $REMOVAL_NEAREST_ISA_GENERATE = makeKeyword("REMOVAL-NEAREST-ISA-GENERATE");
        $list17 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nearestIsa")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("nearestIsa")), makeKeyword("FULLY-BOUND"), list(makeKeyword("NOT"), makeKeyword("FORT"))),
                makeKeyword("COST"), makeSymbol("REMOVAL-NEAREST-ISA-GENERATE-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("nearestIsa")), list(makeKeyword("BIND"), makeSymbol("OBJECT")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("OBJECT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("INFERENCE-NEAREST-ISA"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("nearestIsa")), list(makeKeyword("VALUE"), makeSymbol("OBJECT")), makeKeyword("INPUT")), makeKeyword("SUPPORT"),
                makeSymbol("MAKE-NEAREST-ISA-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestIsa <fort> <non fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestIsa #$Canada ?WHAT)\n(#$nearestIsa (#$YearFn 2001) ?WHAT)") });
        $REMOVAL_NEAREST_INSTANCES_GENERATE = makeKeyword("REMOVAL-NEAREST-INSTANCES-GENERATE");
        $list19 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nearestIsa")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("nearestIsa")), list(makeKeyword("NOT"), makeKeyword("FORT")), makeKeyword("FORT")), makeKeyword("COST"),
                makeSymbol("REMOVAL-NEAREST-INSTANCES-GENERATE-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("nearestIsa")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("COLLECTION"))), list(makeKeyword("VALUE"), makeSymbol("COLLECTION"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("INFERENCE-NEAREST-INSTANCES"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("nearestIsa")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("COLLECTION"))), makeKeyword("SUPPORT"),
                makeSymbol("MAKE-NEAREST-ISA-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestIsa <whatever> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestIsa ?WHAT #$IndependentCountry)") });
        $$nearestGenls = makeConstSym(("nearestGenls"));
        $GENLS = makeKeyword("GENLS");
        $REMOVAL_NEAREST_GENLS_FORT_CHECK = makeKeyword("REMOVAL-NEAREST-GENLS-FORT-CHECK");
        $list23 = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nearestGenls")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("nearestGenls")), makeKeyword("FORT"), makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"),
                makeSymbol("*DEFAULT-NEAREST-GENLS-CHECK-COST*"), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-NEAREST-GENLS-CHECK"), makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("MAKE-NEAREST-GENLS-SUPPORT"), makeKeyword("DOCUMENTATION"),
                makeString("(#$nearestGenls <fort> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestGenls #$Wine #$AlcoholicBeverage)") });
        $REMOVAL_NEAREST_GENLS_NAUT_CHECK = makeKeyword("REMOVAL-NEAREST-GENLS-NAUT-CHECK");
        $list25 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nearestGenls")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("nearestGenls")), cons(makeKeyword("FORT"), makeKeyword("FULLY-BOUND")), makeKeyword("FORT")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NEAREST-GENLS-CHECK-COST*"), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-NEAREST-GENLS-CHECK"), makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("MAKE-NEAREST-GENLS-SUPPORT"),
                makeKeyword("DOCUMENTATION"), makeString("(#$nearestGenls (<fort> . <fully-bound>) <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestGenls (#$JuvenileFn #$Cougar) #$JuvenileAnimal)") });
        $REMOVAL_NEAREST_GENLS_FORT_GENERATE = makeKeyword("REMOVAL-NEAREST-GENLS-FORT-GENERATE");
        $list27 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nearestGenls")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("nearestGenls")), makeKeyword("FORT"), list(makeKeyword("NOT"), makeKeyword("FORT"))),
                makeKeyword("COST"), makeSymbol("REMOVAL-NEAREST-GENLS-FORT-GENERATE-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("nearestGenls")), list(makeKeyword("BIND"), makeSymbol("SPEC")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("SPEC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("INFERENCE-NEAREST-GENLS"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("nearestGenls")), list(makeKeyword("VALUE"), makeSymbol("SPEC")), makeKeyword("INPUT")), makeKeyword("SUPPORT"),
                makeSymbol("MAKE-NEAREST-GENLS-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestGenls <fort> <non-fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestGenls #$Wine ?WHAT)") });
        $REMOVAL_NEAREST_GENLS_NAUT_GENERATE = makeKeyword("REMOVAL-NEAREST-GENLS-NAUT-GENERATE");
        $list29 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nearestGenls")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("nearestGenls")), cons(makeKeyword("FORT"), makeKeyword("FULLY-BOUND")), list(makeKeyword("NOT"), makeKeyword("FORT"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NEAREST-GENLS-NAUT-GENERATE-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("nearestGenls")), list(makeKeyword("BIND"), makeSymbol("SPEC")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("SPEC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("INFERENCE-NEAREST-GENLS"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("nearestGenls")), list(makeKeyword("VALUE"), makeSymbol("SPEC")), makeKeyword("INPUT")), makeKeyword("SUPPORT"),
                makeSymbol("MAKE-NEAREST-GENLS-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestGenls (<fort> . <fully-bound>) <non-fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestGenls (#$JuvenileFn #$Cougar) ?WHAT)") });
        $REMOVAL_NEAREST_SPECS_GENERATE = makeKeyword("REMOVAL-NEAREST-SPECS-GENERATE");
        $list31 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nearestGenls")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("nearestGenls")), list(makeKeyword("NOT"), makeKeyword("FORT")), makeKeyword("FORT")),
                makeKeyword("COST"), makeSymbol("REMOVAL-NEAREST-SPECS-GENERATE-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("nearestGenls")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("GENL"))), list(makeKeyword("VALUE"), makeSymbol("GENL"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("INFERENCE-NEAREST-SPECS"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("nearestGenls")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("GENL"))), makeKeyword("SUPPORT"),
                makeSymbol("MAKE-NEAREST-GENLS-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestGenls <whatever> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestGenls ?SPEC #$AlcoholicBeverage)") });
        $$nearestGenlMt = makeConstSym(("nearestGenlMt"));
        $REMOVAL_NEAREST_GENL_MTS_CHECK = makeKeyword("REMOVAL-NEAREST-GENL-MTS-CHECK");
        $list34 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nearestGenlMt")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("nearestGenlMt")), makeKeyword("FORT"), makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"),
                makeSymbol("*DEFAULT-NEAREST-GENL-MTS-CHECK-COST*"), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-NEAREST-GENL-MT-CHECK"), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$nearestGenlMt <fort> <fort>)"), makeKeyword("EXAMPLE"),
                makeString("(#$nearestGenlMt #$HumanPerceptionMt #$PerceptionMt)") });
        $$genlMt = makeConstSym(("genlMt"));
        $REMOVAL_NEAREST_GENL_MTS_GENERATE = makeKeyword("REMOVAL-NEAREST-GENL-MTS-GENERATE");
        $list37 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nearestGenlMt")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("nearestGenlMt")), makeKeyword("FORT"), list(makeKeyword("NOT"), makeKeyword("FORT"))),
                makeKeyword("COST"), makeSymbol("REMOVAL-NEAREST-GENL-MTS-GENERATE-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("nearestGenlMt")), list(makeKeyword("BIND"), makeSymbol("SPEC-MT")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("SPEC-MT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("INFERENCE-NEAREST-GENL-MTS"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("nearestGenlMt")), list(makeKeyword("VALUE"), makeSymbol("SPEC-MT")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"),
                makeString("(#$nearestGenlMt <fort> <non-fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestGenlMt #$HumanPerceptionMt ?WHAT)") });
        $REMOVAL_NEAREST_SPEC_MTS_GENERATE = makeKeyword("REMOVAL-NEAREST-SPEC-MTS-GENERATE");
        $list39 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nearestGenlMt")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("nearestGenlMt")), list(makeKeyword("NOT"), makeKeyword("FORT")), makeKeyword("FORT")),
                makeKeyword("COST"), makeSymbol("REMOVAL-NEAREST-SPEC-MTS-GENERATE-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("nearestGenlMt")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("GENL-MT"))), list(makeKeyword("VALUE"), makeSymbol("GENL-MT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("INFERENCE-NEAREST-SPEC-MTS"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("nearestGenlMt")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("GENL-MT"))), makeKeyword("DOCUMENTATION"),
                makeString("(#$nearestGenlMt <non-fort> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestGenlMt ?SPEC #$PerceptionMt)") });
        $list40 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nearestGenlMt")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("nearestGenlMt")), makeKeyword("FORT"), makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"),
                makeSymbol("*DEFAULT-NEAREST-GENL-MTS-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NEAREST-GENL-MTS-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestGenlMt <fort> <fort>)"), makeKeyword("EXAMPLE"),
                makeString("(#$nearestGenlMt #$HumanPerceptionMt #$PerceptionMt)") });
        $list41 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nearestGenlMt")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("nearestGenlMt")), makeKeyword("FORT"), list(makeKeyword("NOT"), makeKeyword("FORT"))),
                makeKeyword("COST"), makeSymbol("REMOVAL-NEAREST-GENL-MTS-GENERATE-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NEAREST-GENL-MTS-GENERATE-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestGenlMt <fort> <whatever>)"), makeKeyword("EXAMPLE"),
                makeString("(#$nearestGenlMt #$HumanPerceptionMt ?WHAT)") });
        $list42 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nearestGenlMt")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("nearestGenlMt")), list(makeKeyword("NOT"), makeKeyword("FORT")), makeKeyword("FORT")),
                makeKeyword("COST"), makeSymbol("REMOVAL-NEAREST-SPEC-MTS-GENERATE-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NEAREST-SPEC-MTS-GENERATE-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestGenlMt <whatever> <fort>)"), makeKeyword("EXAMPLE"),
                makeString("(#$nearestGenlMt ?SPEC #$PerceptionMt)") });
        $$nearestGenlPreds = makeConstSym(("nearestGenlPreds"));
        $REMOVAL_NEAREST_GENL_PREDS_CHECK = makeKeyword("REMOVAL-NEAREST-GENL-PREDS-CHECK");
        $list45 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nearestGenlPreds")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("nearestGenlPreds")), makeKeyword("FORT"), makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"),
                makeSymbol("*DEFAULT-NEAREST-GENL-PREDS-CHECK-COST*"), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-NEAREST-GENL-PREDS-CHECK"), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$nearestGenlPreds <fort> <fort>)"),
                makeKeyword("EXAMPLE"), makeString("(#$nearestGenlPreds #$performedBy #$doneBy)") });
        $$genlPreds = makeConstSym(("genlPreds"));
        $$genlInverse = makeConstSym(("genlInverse"));
        $REMOVAL_NEAREST_GENL_PREDS_GENERATE = makeKeyword("REMOVAL-NEAREST-GENL-PREDS-GENERATE");
        $list49 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nearestGenlPreds")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("nearestGenlPreds")), makeKeyword("FORT"), list(makeKeyword("NOT"), makeKeyword("FORT"))),
                makeKeyword("COST"), makeSymbol("REMOVAL-NEAREST-GENL-PREDS-GENERATE-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("nearestGenlPreds")), list(makeKeyword("BIND"), makeSymbol("OBJECT")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("OBJECT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("INFERENCE-NEAREST-GENL-PREDS"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("nearestGenlPreds")), list(makeKeyword("VALUE"), makeSymbol("OBJECT")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"),
                makeString("(#$nearestGenlPreds <fort> <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestGenlPreds #$performedBy ?WHAT)") });
        $REMOVAL_NEAREST_SPEC_PREDS_GENERATE = makeKeyword("REMOVAL-NEAREST-SPEC-PREDS-GENERATE");
        $list51 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nearestGenlPreds")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("nearestGenlPreds")), list(makeKeyword("NOT"), makeKeyword("FORT")), makeKeyword("FORT")),
                makeKeyword("COST"), makeSymbol("REMOVAL-NEAREST-SPEC-PREDS-GENERATE-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("nearestGenlPreds")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("OBJECT"))), list(makeKeyword("VALUE"), makeSymbol("OBJECT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("INFERENCE-NEAREST-SPEC-PREDS"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("nearestGenlPreds")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("OBJECT"))), makeKeyword("DOCUMENTATION"),
                makeString("(#$nearestGenlPreds <whatever> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestGenlPreds ?WHAT #$doneBy)") });
        $$nearestCommonIsa = makeConstSym(("nearestCommonIsa"));
        $REMOVAL_NEAREST_COMMON_ISA_CHECK = makeKeyword("REMOVAL-NEAREST-COMMON-ISA-CHECK");
        $list54 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nearestCommonIsa")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("nearestCommonIsa")), makeKeyword("FORT"), makeKeyword("FORT"), makeKeyword("FORT")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NEAREST-COMMON-ISA-CHECK-COST*"), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-NEAREST-COMMON-ISA-CHECK"), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"),
                makeString("(#$nearestCommonIsa <fort> <fort> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestCommonIsa #$France #$Spain #$IndependentCountry)") });
        $REMOVAL_NEAREST_COMMON_ISA_GENERATE = makeKeyword("REMOVAL-NEAREST-COMMON-ISA-GENERATE");
        $list56 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nearestCommonIsa")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("nearestCommonIsa")), makeKeyword("FORT"), makeKeyword("FORT"), list(makeKeyword("NOT"), makeKeyword("FORT"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*AVERAGE-NEAREST-COMMON-ISA-COUNT*"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("nearestCommonIsa")), list(makeKeyword("BIND"), makeSymbol("OBJECT1")), list(makeKeyword("BIND"), makeSymbol("OBJECT2")), makeKeyword("ANYTHING")),
                        list(list(makeKeyword("VALUE"), makeSymbol("OBJECT1")), list(makeKeyword("VALUE"), makeSymbol("OBJECT2")))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("OBJECT1"), makeSymbol("OBJECT2")), list(makeKeyword("CALL"), makeSymbol("INFERENCE-NEAREST-COMMON-ISA"), list(makeKeyword("VALUE"), makeSymbol("OBJECT1")), list(makeKeyword("VALUE"), makeSymbol("OBJECT2")))),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("nearestCommonIsa")), list(makeKeyword("VALUE"), makeSymbol("OBJECT1")), list(makeKeyword("VALUE"), makeSymbol("OBJECT2")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"),
                makeString("(#$nearestCommonIsa <fort> <fort> <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestCommonIsa #$France #$Spain ?WHAT)") });
        $$nearestCommonGenls = makeConstSym(("nearestCommonGenls"));
        $list58 = list(makeSymbol("COL1"), makeSymbol("COL2"), makeSymbol("COL3"));
        $sym59$_COL = makeSymbol("?COL");
        $$different = makeConstSym(("different"));
        $CODE = makeKeyword("CODE");
        $sym62$MAKE_NEAREST_COMMON_GENLS_SUPPORT = makeSymbol("MAKE-NEAREST-COMMON-GENLS-SUPPORT");
        $REMOVAL_NEAREST_COMMON_GENLS_CHECK = makeKeyword("REMOVAL-NEAREST-COMMON-GENLS-CHECK");
        $list64 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nearestCommonGenls")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("nearestCommonGenls")), makeKeyword("FORT"), makeKeyword("FORT"), makeKeyword("FORT")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NEAREST-COMMON-GENLS-CHECK-COST*"), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-NEAREST-COMMON-GENLS-CHECK"), makeKeyword("INPUT")), makeKeyword("SUPPORT"),
                makeSymbol("MAKE-NEAREST-COMMON-GENLS-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestCommonGenls <fort> <fort> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestCommonGenls #$Beer #$Wine #$AlcoholicBeverage)") });
        $REMOVAL_NEAREST_COMMON_GENLS_GENERATE = makeKeyword("REMOVAL-NEAREST-COMMON-GENLS-GENERATE");
        $list66 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nearestCommonGenls")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("nearestCommonGenls")), makeKeyword("FORT"), makeKeyword("FORT"), list(makeKeyword("NOT"), makeKeyword("FORT"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*AVERAGE-NEAREST-COMMON-GENLS-COUNT*"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("nearestCommonGenls")), list(makeKeyword("BIND"), makeSymbol("COL1")), list(makeKeyword("BIND"), makeSymbol("COL2")), makeKeyword("ANYTHING")),
                        list(list(makeKeyword("VALUE"), makeSymbol("COL1")), list(makeKeyword("VALUE"), makeSymbol("COL2")))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("COL1"), makeSymbol("COL2")), list(makeKeyword("CALL"), makeSymbol("INFERENCE-NEAREST-COMMON-GENLS"), list(makeKeyword("VALUE"), makeSymbol("COL1")), list(makeKeyword("VALUE"), makeSymbol("COL2")))),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("nearestCommonGenls")), list(makeKeyword("VALUE"), makeSymbol("COL1")), list(makeKeyword("VALUE"), makeSymbol("COL2")), makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("MAKE-NEAREST-COMMON-GENLS-SUPPORT"),
                makeKeyword("DOCUMENTATION"), makeString("(#$nearestCommonGenls <fort> <fort> <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestCommonGenls #$Beer #$Wine ?WHAT)") });
        $$nearestCommonGenlsOfSet = makeConstSym(("nearestCommonGenlsOfSet"));
        $list68 = list(makeSymbol("SET"), makeSymbol("GENL"));
        $sym69$MAKE_NEAREST_COMMON_GENLS_OF_SET_SUPPORT = makeSymbol("MAKE-NEAREST-COMMON-GENLS-OF-SET-SUPPORT");
        $REMOVAL_NEAREST_COMMON_GENLS_OF_SET_CHECK = makeKeyword("REMOVAL-NEAREST-COMMON-GENLS-OF-SET-CHECK");
        $list71 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nearestCommonGenlsOfSet")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("nearestCommonGenlsOfSet")), list(makeKeyword("TEST"), makeSymbol("EL-EXTENSIONAL-SET-P")), makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NEAREST-COMMON-GENLS-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("nearestCommonGenlsOfSet")), list(makeKeyword("BIND"), makeSymbol("SET")), list(makeKeyword("BIND"), makeSymbol("COL"))), list(list(makeKeyword("VALUE"), makeSymbol("SET")), list(makeKeyword("VALUE"), makeSymbol("COL")))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("SET"), makeSymbol("COL")),
                        list(makeKeyword("CALL"), makeSymbol("REMOVAL-NEAREST-COMMON-GENLS-OF-SET-CHECK"), list(makeKeyword("CALL"), makeSymbol("EL-EXTENSIONAL-SET-ELEMENTS"), list(makeKeyword("VALUE"), makeSymbol("SET"))), list(makeKeyword("VALUE"), makeSymbol("COL")))),
                makeKeyword("SUPPORT"), makeSymbol("MAKE-NEAREST-COMMON-GENLS-OF-SET-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestCommonGenlsOfSet <set> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestCommonGenlsOfSet (#$TheSet #$Beer #$Wine) #$AlcoholicBeverage)") });
        $REMOVAL_NEAREST_COMMON_GENLS_OF_SET_GENERATE = makeKeyword("REMOVAL-NEAREST-COMMON-GENLS-OF-SET-GENERATE");
        $list73 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nearestCommonGenlsOfSet")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("nearestCommonGenlsOfSet")), list(makeKeyword("TEST"), makeSymbol("EL-EXTENSIONAL-SET-P")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*AVERAGE-NEAREST-COMMON-GENLS-COUNT*"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("nearestCommonGenlsOfSet")), list(makeKeyword("BIND"), makeSymbol("SET")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("SET"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("NEAREST-COMMON-GENLS"), list(makeKeyword("CALL"), makeSymbol("EL-EXTENSIONAL-SET-ELEMENTS"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("nearestCommonGenlsOfSet")), list(makeKeyword("VALUE"), makeSymbol("SET")), makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("MAKE-NEAREST-COMMON-GENLS-OF-SET-SUPPORT"), makeKeyword("DOCUMENTATION"),
                makeString("(#$nearestCommonGenlsOfSet <set> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestCommonGenlsOfSet (#$TheSet #$Beer #$Wine) ?WHAT)") });
        $$nearestCommonSpecs = makeConstSym(("nearestCommonSpecs"));
        $REMOVAL_NEAREST_COMMON_SPECS_CHECK = makeKeyword("REMOVAL-NEAREST-COMMON-SPECS-CHECK");
        $list76 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nearestCommonSpecs")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("nearestCommonSpecs")), makeKeyword("FORT"), makeKeyword("FORT"), makeKeyword("FORT")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NEAREST-COMMON-SPECS-CHECK-COST*"), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-NEAREST-COMMON-SPECS-CHECK"), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"),
                makeString("(#$nearestCommonSpecs <fort> <fort> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestCommonSpecs #$HumanAdult #$MaleAnimal #$AdultMalePerson)") });
        $REMOVAL_NEAREST_COMMON_SPECS_GENERATE = makeKeyword("REMOVAL-NEAREST-COMMON-SPECS-GENERATE");
        $list78 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nearestCommonSpecs")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("nearestCommonSpecs")), makeKeyword("FORT"), makeKeyword("FORT"), makeKeyword("ANYTHING")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*AVERAGE-NEAREST-COMMON-SPECS-COUNT*"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("nearestCommonSpecs")), list(makeKeyword("BIND"), makeSymbol("COL1")), list(makeKeyword("BIND"), makeSymbol("COL2")), makeKeyword("ANYTHING")),
                        list(list(makeKeyword("VALUE"), makeSymbol("COL1")), list(makeKeyword("VALUE"), makeSymbol("COL2")))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("COL1"), makeSymbol("COL2")), list(makeKeyword("CALL"), makeSymbol("INFERENCE-NEAREST-COMMON-SPECS"), list(makeKeyword("VALUE"), makeSymbol("COL1")), list(makeKeyword("VALUE"), makeSymbol("COL2")))),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("nearestCommonSpecs")), list(makeKeyword("VALUE"), makeSymbol("COL1")), list(makeKeyword("VALUE"), makeSymbol("COL2")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"),
                makeString("(#$nearestCommonSpecs <fort> <fort> <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestCommonSpecs #$HumanAdult #$MaleAnimal ?WHAT)") });
        $$nearestCommonGenlMt = makeConstSym(("nearestCommonGenlMt"));
        $REMOVAL_NEAREST_COMMON_GENL_MTS_CHECK = makeKeyword("REMOVAL-NEAREST-COMMON-GENL-MTS-CHECK");
        $list81 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nearestCommonGenlMt")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("nearestCommonGenlMt")), makeKeyword("FORT"), makeKeyword("FORT"), makeKeyword("FORT")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NEAREST-COMMON-GENL-MTS-CHECK-COST*"), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-NEAREST-COMMON-GENL-MTS-CHECK-EXPAND"), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"),
                makeString("(#$nearestCommonGenlMt <fort> <fort> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestCommonGenlMt #$FrenchLexicalMt #$GermanLexicalMt #$GeneralLexiconMt)") });
        $REMOVAL_NEAREST_COMMON_GENL_MTS_GENERATE = makeKeyword("REMOVAL-NEAREST-COMMON-GENL-MTS-GENERATE");
        $list83 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nearestCommonGenlMt")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("nearestCommonGenlMt")), makeKeyword("FORT"), makeKeyword("FORT"), list(makeKeyword("NOT"), makeKeyword("FORT"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*AVERAGE-NEAREST-COMMON-GENL-MTS-COUNT*"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("nearestCommonGenlMt")), list(makeKeyword("BIND"), makeSymbol("MT1")), list(makeKeyword("BIND"), makeSymbol("MT2")), makeKeyword("ANYTHING")),
                        list(list(makeKeyword("VALUE"), makeSymbol("MT1")), list(makeKeyword("VALUE"), makeSymbol("MT2")))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("MT1"), makeSymbol("MT2")), list(makeKeyword("CALL"), makeSymbol("INFERENCE-NEAREST-COMMON-GENL-MTS"), list(makeKeyword("VALUE"), makeSymbol("MT1")), list(makeKeyword("VALUE"), makeSymbol("MT2")))),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("nearestCommonGenlMt")), list(makeKeyword("VALUE"), makeSymbol("MT1")), list(makeKeyword("VALUE"), makeSymbol("MT2")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"),
                makeString("(#$nearestCommonGenlMt <fort> <fort> <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestCommonGenlMt #$FrenchLexicalMt #$GermanLexicalMt ?MT)") });
        $$nearestCommonSpecMt = makeConstSym(("nearestCommonSpecMt"));
        $REMOVAL_NEAREST_COMMON_SPEC_MTS_CHECK = makeKeyword("REMOVAL-NEAREST-COMMON-SPEC-MTS-CHECK");
        $list86 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nearestCommonSpecMt")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("nearestCommonSpecMt")), makeKeyword("FORT"), makeKeyword("FORT"), makeKeyword("FORT")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NEAREST-COMMON-SPEC-MTS-CHECK-COST*"), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-NEAREST-COMMON-SPEC-MTS-CHECK-EXPAND"), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"),
                makeString("(#$nearestCommonSpecMt <fort> <fort> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestCommonSpecMt #$FrenchLexicalMt #$GermanLexicalMt #$AllLexicalMicrotheoryPSC)") });
        $REMOVAL_NEAREST_COMMON_SPEC_MTS_GENERATE = makeKeyword("REMOVAL-NEAREST-COMMON-SPEC-MTS-GENERATE");
        $list88 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nearestCommonSpecMt")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("nearestCommonSpecMt")), makeKeyword("FORT"), makeKeyword("FORT"), list(makeKeyword("NOT"), makeKeyword("FORT"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*AVERAGE-NEAREST-COMMON-SPEC-MTS-COUNT*"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("nearestCommonSpecMt")), list(makeKeyword("BIND"), makeSymbol("MT1")), list(makeKeyword("BIND"), makeSymbol("MT2")), makeKeyword("ANYTHING")),
                        list(list(makeKeyword("VALUE"), makeSymbol("MT1")), list(makeKeyword("VALUE"), makeSymbol("MT2")))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("MT1"), makeSymbol("MT2")), list(makeKeyword("CALL"), makeSymbol("INFERENCE-NEAREST-COMMON-SPEC-MTS"), list(makeKeyword("VALUE"), makeSymbol("MT1")), list(makeKeyword("VALUE"), makeSymbol("MT2")))),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("nearestCommonSpecMt")), list(makeKeyword("VALUE"), makeSymbol("MT1")), list(makeKeyword("VALUE"), makeSymbol("MT2")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"),
                makeString("(#$nearestCommonSpecMt <fort> <fort> <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestCommonSpecMt #$FrenchLexicalMt #$GermanLexicalMt ?MT)") });
        $$nearestDifferentIsa = makeConstSym(("nearestDifferentIsa"));
        $REMOVAL_NEAREST_DIFFERENT_ISA_CHECK = makeKeyword("REMOVAL-NEAREST-DIFFERENT-ISA-CHECK");
        $list91 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nearestDifferentIsa")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("nearestDifferentIsa")), makeKeyword("FORT"), makeKeyword("FORT"), makeKeyword("FORT")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NEAREST-DIFFERENT-ISA-CHECK-COST*"), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-NEAREST-DIFFERENT-ISA-CHECK"), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"),
                makeString("(#$nearestDifferentIsa <fort> <fort> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestDifferentIsa #$Canada #$Minnesota-State #$IndependentCountry)") });
        $REMOVAL_NEAREST_DIFFERENT_ISA_GENERATE = makeKeyword("REMOVAL-NEAREST-DIFFERENT-ISA-GENERATE");
        $list93 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nearestDifferentIsa")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("nearestDifferentIsa")), makeKeyword("FORT"), makeKeyword("FORT"), list(makeKeyword("NOT"), makeKeyword("FORT"))), makeKeyword("COST"), makeSymbol("REMOVAL-NEAREST-DIFFERENT-ISA-GENERATE-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("nearestDifferentIsa")), list(makeKeyword("BIND"), makeSymbol("OBJ1")), list(makeKeyword("BIND"), makeSymbol("OBJ2")), makeKeyword("ANYTHING")),
                        list(list(makeKeyword("VALUE"), makeSymbol("OBJ1")), list(makeKeyword("VALUE"), makeSymbol("OBJ2")))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("OBJ1"), makeSymbol("OBJ2")), list(makeKeyword("CALL"), makeSymbol("INFERENCE-NEAREST-DIFFERENT-ISA"), list(makeKeyword("VALUE"), makeSymbol("OBJ1")), list(makeKeyword("VALUE"), makeSymbol("OBJ2")))),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("nearestDifferentIsa")), list(makeKeyword("VALUE"), makeSymbol("OBJ1")), list(makeKeyword("VALUE"), makeSymbol("OBJ2")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"),
                makeString("(#$nearestDifferentIsa <fort> <fort> <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestDifferentIsa #$Canada #$Minnesota-State ?WHAT)") });
        $$nearestDifferentGenls = makeConstSym(("nearestDifferentGenls"));
        $REMOVAL_NEAREST_DIFFERENT_GENLS_CHECK = makeKeyword("REMOVAL-NEAREST-DIFFERENT-GENLS-CHECK");
        $list96 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nearestDifferentGenls")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("nearestDifferentGenls")), makeKeyword("FORT"), makeKeyword("FORT"), makeKeyword("FORT")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NEAREST-DIFFERENT-GENLS-CHECK-COST*"), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-NEAREST-DIFFERENT-GENLS-CHECK"), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"),
                makeString("(#$nearestDifferentGenls <fort> <fort> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestDifferentGenls #$Wine #$Milk #$AlcoholicBeverage)") });
        $REMOVAL_NEAREST_DIFFERENT_GENLS_GENERATE = makeKeyword("REMOVAL-NEAREST-DIFFERENT-GENLS-GENERATE");
        $list98 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nearestDifferentGenls")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("nearestDifferentGenls")), makeKeyword("FORT"), makeKeyword("FORT"), list(makeKeyword("NOT"), makeKeyword("FORT"))), makeKeyword("COST"), makeSymbol("REMOVAL-NEAREST-DIFFERENT-GENLS-GENERATE-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("nearestDifferentGenls")), list(makeKeyword("BIND"), makeSymbol("OBJ1")), list(makeKeyword("BIND"), makeSymbol("OBJ2")), makeKeyword("ANYTHING")),
                        list(list(makeKeyword("VALUE"), makeSymbol("OBJ1")), list(makeKeyword("VALUE"), makeSymbol("OBJ2")))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("OBJ1"), makeSymbol("OBJ2")), list(makeKeyword("CALL"), makeSymbol("INFERENCE-NEAREST-DIFFERENT-GENLS"), list(makeKeyword("VALUE"), makeSymbol("OBJ1")), list(makeKeyword("VALUE"), makeSymbol("OBJ2")))),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("nearestDifferentGenls")), list(makeKeyword("VALUE"), makeSymbol("OBJ1")), list(makeKeyword("VALUE"), makeSymbol("OBJ2")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"),
                makeString("(#$nearestDifferentGenls <fort> <fort> <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestDifferentGenls #$Wine #$Milk ?WHAT)") });
        $$nearestIsaOfType = makeConstSym(("nearestIsaOfType"));
        $REMOVAL_NEAREST_ISA_OF_TYPE_CHECK = makeKeyword("REMOVAL-NEAREST-ISA-OF-TYPE-CHECK");
        $list101 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nearestIsaOfType")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("nearestIsaOfType")), list(makeKeyword("OR"), makeKeyword("FORT"), cons(makeKeyword("FORT"), makeKeyword("FULLY-BOUND"))), makeKeyword("FORT"), makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NEAREST-ISA-CHECK-COST*"),
                makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("nearestIsaOfType")), list(makeKeyword("BIND"), makeSymbol("TERM")), list(makeKeyword("BIND"), makeSymbol("TYPE")), list(makeKeyword("BIND"), makeSymbol("COL"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("TERM")), list(makeKeyword("VALUE"), makeSymbol("TYPE")), list(makeKeyword("VALUE"), makeSymbol("COL")))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("TERM"), makeSymbol("TYPE"), makeSymbol("COL")),
                        list(makeKeyword("CALL"), makeSymbol("INFERENCE-NEAREST-ISA-OF-TYPE-CHECK"), list(makeKeyword("VALUE"), makeSymbol("TERM")), list(makeKeyword("VALUE"), makeSymbol("TYPE")), list(makeKeyword("VALUE"), makeSymbol("COL")))),
                makeKeyword("SUPPORT"), makeSymbol("MAKE-NEAREST-ISA-OF-TYPE-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestIsaOfType <fort-or-naut> <fort-or-naut> <fort>)"), makeKeyword("EXAMPLE"),
                makeString("(#$nearestIsaOfType #$ThomasPynchon #$PersonTypeByOccupation #$Writer)") });
        $REMOVAL_NEAREST_ISA_OF_TYPE_GENERATE = makeKeyword("REMOVAL-NEAREST-ISA-OF-TYPE-GENERATE");
        $list103 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nearestIsaOfType")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("nearestIsaOfType")), list(makeKeyword("OR"), makeKeyword("FORT"), cons(makeKeyword("FORT"), makeKeyword("FULLY-BOUND"))), makeKeyword("FORT"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST"), makeSymbol("REMOVAL-NEAREST-ISA-OF-TYPE-GENERATE-COST"),
                makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("nearestIsaOfType")), list(makeKeyword("BIND"), makeSymbol("TERM")), list(makeKeyword("BIND"), makeSymbol("TYPE")), makeKeyword("ANYTHING")),
                        list(list(makeKeyword("VALUE"), makeSymbol("TERM")), list(makeKeyword("VALUE"), makeSymbol("TYPE")))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TERM"), makeSymbol("TYPE")), list(makeKeyword("CALL"), makeSymbol("INFERENCE-NEAREST-ISAS-OF-TYPE"), list(makeKeyword("VALUE"), makeSymbol("TERM")), list(makeKeyword("VALUE"), makeSymbol("TYPE")))),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("nearestIsaOfType")), list(makeKeyword("VALUE"), makeSymbol("TERM")), list(makeKeyword("VALUE"), makeSymbol("TYPE")), makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("MAKE-NEAREST-ISA-OF-TYPE-SUPPORT"),
                makeKeyword("DOCUMENTATION"), makeString("(#$nearestIsaOfType <fort-or-naut> <fort-or-naut> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestIsaOfType #$ThomasPynchon #$PersonTypeByOccupation ?WHAT)") });
        $$nearestGenlsOfType = makeConstSym(("nearestGenlsOfType"));
        $REMOVAL_NEAREST_GENLS_OF_TYPE_CHECK = makeKeyword("REMOVAL-NEAREST-GENLS-OF-TYPE-CHECK");
        $list106 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nearestGenlsOfType")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("nearestGenlsOfType")), list(makeKeyword("OR"), makeKeyword("FORT"), cons(makeKeyword("FORT"), makeKeyword("FULLY-BOUND"))), makeKeyword("FORT"), makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NEAREST-GENLS-CHECK-COST*"),
                makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("nearestGenlsOfType")), list(makeKeyword("BIND"), makeSymbol("SPEC")), list(makeKeyword("BIND"), makeSymbol("TYPE")), list(makeKeyword("BIND"), makeSymbol("GENL"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("SPEC")), list(makeKeyword("VALUE"), makeSymbol("TYPE")), list(makeKeyword("VALUE"), makeSymbol("GENL")))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("SPEC"), makeSymbol("TYPE"), makeSymbol("GENL")),
                        list(makeKeyword("CALL"), makeSymbol("INFERENCE-NEAREST-GENLS-OF-TYPE-CHECK"), list(makeKeyword("VALUE"), makeSymbol("SPEC")), list(makeKeyword("VALUE"), makeSymbol("TYPE")), list(makeKeyword("VALUE"), makeSymbol("GENL")))),
                makeKeyword("SUPPORT"), makeSymbol("MAKE-NEAREST-GENLS-OF-TYPE-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestGenlsOfType <fort-or-naut> <fort-or-naut> <fort>)"), makeKeyword("EXAMPLE"),
                makeString("(#$nearestGenlsOfType #$Wine #$TangibleStuffCompositionType #$AlcoholicBeverage)") });
        $REMOVAL_NEAREST_GENLS_OF_TYPE_GENERATE = makeKeyword("REMOVAL-NEAREST-GENLS-OF-TYPE-GENERATE");
        $list108 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nearestGenlsOfType")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("nearestGenlsOfType")), list(makeKeyword("OR"), makeKeyword("FORT"), cons(makeKeyword("FORT"), makeKeyword("FULLY-BOUND"))), makeKeyword("FORT"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST"), makeSymbol("REMOVAL-NEAREST-GENLS-OF-TYPE-GENERATE-COST"),
                makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("nearestGenlsOfType")), list(makeKeyword("BIND"), makeSymbol("SPEC")), list(makeKeyword("BIND"), makeSymbol("TYPE")), makeKeyword("ANYTHING")),
                        list(list(makeKeyword("VALUE"), makeSymbol("SPEC")), list(makeKeyword("VALUE"), makeSymbol("TYPE")))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("SPEC"), makeSymbol("TYPE")), list(makeKeyword("CALL"), makeSymbol("INFERENCE-NEAREST-GENLS-OF-TYPE"), list(makeKeyword("VALUE"), makeSymbol("SPEC")), list(makeKeyword("VALUE"), makeSymbol("TYPE")))),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("nearestGenlsOfType")), list(makeKeyword("VALUE"), makeSymbol("SPEC")), list(makeKeyword("VALUE"), makeSymbol("TYPE")), makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("MAKE-NEAREST-GENLS-OF-TYPE-SUPPORT"),
                makeKeyword("DOCUMENTATION"), makeString("(#$nearestGenlsOfType <fort-or-naut> <fort-or-naut> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestGenlsOfType #$Wine #$PharmacyProductType ?WHAT)") });
        $$nearestArgIsa = makeConstSym(("nearestArgIsa"));
        $NEAREST_ARG_ISA_UNBOUND_RELATION_AND_COLLECTION_POS = makeKeyword("NEAREST-ARG-ISA-UNBOUND-RELATION-AND-COLLECTION-POS");
        $list111 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nearestArgIsa")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("nearestArgIsa")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")),
                makeKeyword("PREFERENCE"), makeSymbol("MUST-BIND-ARG1-OR-ARG3"));
        $REMOVAL_NEAREST_ARG_ISA_CHECK = makeKeyword("REMOVAL-NEAREST-ARG-ISA-CHECK");
        $list113 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nearestArgIsa")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("nearestArgIsa")), makeKeyword("FORT"), makeKeyword("INTEGER"), makeKeyword("FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*HL-MODULE-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("nearestArgIsa")), list(makeKeyword("BIND"), makeSymbol("RELATION")), list(makeKeyword("BIND"), makeSymbol("ARG-NUM")), list(makeKeyword("BIND"), makeSymbol("ARG-ISA"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("RELATION")), list(makeKeyword("VALUE"), makeSymbol("ARG-NUM")), list(makeKeyword("VALUE"), makeSymbol("ARG-ISA")))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("RELATION"), makeSymbol("ARG-NUM"), makeSymbol("ARG-ISA")),
                        list(makeKeyword("CALL"), makeSymbol("INFERENCE-NEAREST-ARG-ISA-CHECK"), list(makeKeyword("VALUE"), makeSymbol("RELATION")), list(makeKeyword("VALUE"), makeSymbol("ARG-NUM")), list(makeKeyword("VALUE"), makeSymbol("ARG-ISA")))),
                makeKeyword("SUPPORT"), makeSymbol("MAKE-NEAREST-ARG-ISA-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestArgIsa <fort> <integer> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestArgIsa #$geographicallySubsumes 1 #$GeographicalThing)") });
        $REMOVAL_NEAREST_ARG_ISA_GENERATE = makeKeyword("REMOVAL-NEAREST-ARG-ISA-GENERATE");
        $list115 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nearestArgIsa")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("nearestArgIsa")), makeKeyword("FORT"), makeKeyword("INTEGER"), makeKeyword("NOT-FULLY-BOUND")),
                makeKeyword("COST"), makeSymbol("REMOVAL-NEAREST-ARG-ISA-GENERATE-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("nearestArgIsa")), list(makeKeyword("BIND"), makeSymbol("RELATION")), list(makeKeyword("BIND"), makeSymbol("ARG-NUM")), makeKeyword("ANYTHING")),
                        list(list(makeKeyword("VALUE"), makeSymbol("RELATION")), list(makeKeyword("VALUE"), makeSymbol("ARG-NUM")))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("RELATION"), makeSymbol("ARG-NUM")), list(makeKeyword("CALL"), makeSymbol("INFERENCE-NEAREST-ARG-ISA"), list(makeKeyword("VALUE"), makeSymbol("RELATION")), list(makeKeyword("VALUE"), makeSymbol("ARG-NUM")))),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("nearestArgIsa")), list(makeKeyword("VALUE"), makeSymbol("RELATION")), list(makeKeyword("VALUE"), makeSymbol("ARG-NUM")), makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("MAKE-NEAREST-ARG-ISA-SUPPORT"),
                makeKeyword("DOCUMENTATION"), makeString("(#$nearestArgIsa <fort> <integer> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestArgIsa #$geographicallySubsumes 1 ?WHAT)") });
        $$argIsa = makeConstSym(("argIsa"));
        $GAF = makeKeyword("GAF");
        $REMOVAL_NEAREST_ARG_ISA_GENERATE_REVERSE = makeKeyword("REMOVAL-NEAREST-ARG-ISA-GENERATE-REVERSE");
        $list119 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nearestArgIsa")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("nearestArgIsa")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("INTEGER"), makeKeyword("FORT")),
                makeKeyword("COST"), makeSymbol("REMOVAL-NEAREST-ARG-ISA-GENERATE-REVERSE-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("nearestArgIsa")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("ARG-NUM")), list(makeKeyword("BIND"), makeSymbol("COL"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("ARG-NUM")), list(makeKeyword("VALUE"), makeSymbol("COL")))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("ARG-NUM"), makeSymbol("COL")), list(makeKeyword("CALL"), makeSymbol("INFERENCE-NEAREST-ARG-ISA-REVERSE"), list(makeKeyword("VALUE"), makeSymbol("ARG-NUM")), list(makeKeyword("VALUE"), makeSymbol("COL")))),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("nearestArgIsa")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("ARG-NUM")), list(makeKeyword("VALUE"), makeSymbol("COL"))), makeKeyword("SUPPORT"), makeSymbol("MAKE-NEAREST-ARG-ISA-SUPPORT"),
                makeKeyword("DOCUMENTATION"), makeString("(#$nearestArgIsa <not-fully-bound> <integer> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestArgIsa ?WHAT 1 #$GeographicalThing)") });
        $sym120$INFERENCE_NEAREST_ARG_ISA_REVERSE_ITERATOR_DONE = makeSymbol("INFERENCE-NEAREST-ARG-ISA-REVERSE-ITERATOR-DONE");
        $sym121$INFERENCE_NEAREST_ARG_ISA_REVERSE_ITERATOR_NEXT = makeSymbol("INFERENCE-NEAREST-ARG-ISA-REVERSE-ITERATOR-NEXT");
        $sym122$INFERENCE_NEAREST_ARG_ISA_REVERSE_ITERATOR_FINALIZE = makeSymbol("INFERENCE-NEAREST-ARG-ISA-REVERSE-ITERATOR-FINALIZE");
        $$Relation = makeConstSym(("Relation"));
        $list124 = list(makeSymbol("PRED-ITERATOR"), makeSymbol("ARG-NUM"), makeSymbol("COL"));
        $$nearestArgGenl = makeConstSym(("nearestArgGenl"));
        $NEAREST_ARG_GENL_UNBOUND_RELATION_AND_COLLECTION_POS = makeKeyword("NEAREST-ARG-GENL-UNBOUND-RELATION-AND-COLLECTION-POS");
        $list127 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nearestArgGenl")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("nearestArgGenl")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")),
                makeKeyword("PREFERENCE"), makeSymbol("MUST-BIND-ARG1-OR-ARG3"));
        $REMOVAL_NEAREST_ARG_GENL_CHECK = makeKeyword("REMOVAL-NEAREST-ARG-GENL-CHECK");
        $list129 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nearestArgGenl")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("nearestArgGenl")), makeKeyword("FORT"), makeKeyword("INTEGER"), makeKeyword("FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*HL-MODULE-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("nearestArgGenl")), list(makeKeyword("BIND"), makeSymbol("RELATION")), list(makeKeyword("BIND"), makeSymbol("ARG-NUM")), list(makeKeyword("BIND"), makeSymbol("ARG-GENL"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("RELATION")), list(makeKeyword("VALUE"), makeSymbol("ARG-NUM")), list(makeKeyword("VALUE"), makeSymbol("ARG-GENL")))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("RELATION"), makeSymbol("ARG-NUM"), makeSymbol("ARG-GENL")),
                        list(makeKeyword("CALL"), makeSymbol("INFERENCE-NEAREST-ARG-GENL-CHECK"), list(makeKeyword("VALUE"), makeSymbol("RELATION")), list(makeKeyword("VALUE"), makeSymbol("ARG-NUM")), list(makeKeyword("VALUE"), makeSymbol("ARG-GENL")))),
                makeKeyword("SUPPORT"), makeSymbol("MAKE-NEAREST-ARG-GENL-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestArgGenl <fort> <integer> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestArgGenl #$transportees-Type 1 #$GeographicalThing)") });
        $REMOVAL_NEAREST_ARG_GENL_GENERATE = makeKeyword("REMOVAL-NEAREST-ARG-GENL-GENERATE");
        $list131 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nearestArgGenl")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("nearestArgGenl")), makeKeyword("FORT"), makeKeyword("INTEGER"), makeKeyword("NOT-FULLY-BOUND")),
                makeKeyword("COST"), makeSymbol("REMOVAL-NEAREST-ARG-GENL-GENERATE-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("nearestArgGenl")), list(makeKeyword("BIND"), makeSymbol("RELATION")), list(makeKeyword("BIND"), makeSymbol("ARG-NUM")), makeKeyword("ANYTHING")),
                        list(list(makeKeyword("VALUE"), makeSymbol("RELATION")), list(makeKeyword("VALUE"), makeSymbol("ARG-NUM")))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("RELATION"), makeSymbol("ARG-NUM")), list(makeKeyword("CALL"), makeSymbol("INFERENCE-NEAREST-ARG-GENL"), list(makeKeyword("VALUE"), makeSymbol("RELATION")), list(makeKeyword("VALUE"), makeSymbol("ARG-NUM")))),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("nearestArgGenl")), list(makeKeyword("VALUE"), makeSymbol("RELATION")), list(makeKeyword("VALUE"), makeSymbol("ARG-NUM")), makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("MAKE-NEAREST-ARG-GENL-SUPPORT"),
                makeKeyword("DOCUMENTATION"), makeString("(#$nearestArgGenl <fort> <integer> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestArgGenl #$transportees-Type 1 ?WHAT)") });
        $$argGenl = makeConstSym(("argGenl"));
        $REMOVAL_NEAREST_ARG_GENL_GENERATE_REVERSE = makeKeyword("REMOVAL-NEAREST-ARG-GENL-GENERATE-REVERSE");
        $list134 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nearestArgGenl")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("nearestArgGenl")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("INTEGER"), makeKeyword("FORT")),
                makeKeyword("COST"), makeSymbol("REMOVAL-NEAREST-ARG-GENL-GENERATE-REVERSE-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("nearestArgGenl")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("ARG-NUM")), list(makeKeyword("BIND"), makeSymbol("COL"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("ARG-NUM")), list(makeKeyword("VALUE"), makeSymbol("COL")))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("ARG-NUM"), makeSymbol("COL")), list(makeKeyword("CALL"), makeSymbol("INFERENCE-NEAREST-ARG-GENL-REVERSE"), list(makeKeyword("VALUE"), makeSymbol("ARG-NUM")), list(makeKeyword("VALUE"), makeSymbol("COL")))),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("nearestArgGenl")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("ARG-NUM")), list(makeKeyword("VALUE"), makeSymbol("COL"))), makeKeyword("SUPPORT"), makeSymbol("MAKE-NEAREST-ARG-GENL-SUPPORT"),
                makeKeyword("DOCUMENTATION"), makeString("(#$nearestArgGenl <not-fully-bound> <integer> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestArgGenl ?WHAT 1 #$GeographicalThing)") });
        $sym135$INFERENCE_NEAREST_ARG_GENL_REVERSE_ITERATOR_DONE = makeSymbol("INFERENCE-NEAREST-ARG-GENL-REVERSE-ITERATOR-DONE");
        $sym136$INFERENCE_NEAREST_ARG_GENL_REVERSE_ITERATOR_NEXT = makeSymbol("INFERENCE-NEAREST-ARG-GENL-REVERSE-ITERATOR-NEXT");
        $sym137$INFERENCE_NEAREST_ARG_GENL_REVERSE_ITERATOR_FINALIZE = makeSymbol("INFERENCE-NEAREST-ARG-GENL-REVERSE-ITERATOR-FINALIZE");
        $int$10000 = makeInteger(10000);
        $int$212 = makeInteger(212);
        $sym140$NUMBERP = makeSymbol("NUMBERP");
        $$nearNarrowSpecs = makeConstSym(("nearNarrowSpecs"));
        $NEAR_NARROW_SPECS_GENERATE_POS = makeKeyword("NEAR-NARROW-SPECS-GENERATE-POS");
        $list143 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nearNarrowSpecs")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("nearNarrowSpecs")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE"),
                makeSymbol("MUST-BIND-ARG1"));
        $list144 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nearNarrowSpecs")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("nearNarrowSpecs")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST"),
                makeSymbol("REMOVAL-NEAR-NARROW-SPECS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("nearNarrowSpecs")), list(makeKeyword("BIND"), makeSymbol("COLLECTION")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("COLLECTION"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("REMOVAL-NEAR-NARROW-SPECS-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("nearNarrowSpecs")), list(makeKeyword("VALUE"), makeSymbol("COLLECTION")), makeKeyword("INPUT")),
                makeKeyword("DOCUMENTATION"), makeString("(#$nearNarrowSpecs <fort> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$nearNarrowSpecs #$Animal ?WHAT)") });
        $NEAR_NARROW_SPECS_CHECK_POS = makeKeyword("NEAR-NARROW-SPECS-CHECK-POS");
        $list146 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("nearNarrowSpecs")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("nearNarrowSpecs")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NEAR-NARROW-SPECS-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$nearNarrowSpecs <fort> <fully-bound>)"), makeKeyword("EXAMPLE"),
                makeString("(#$nearNarrowSpecs #$Animal #$Dog)") });
        $$thresholdSpecs = makeConstSym(("thresholdSpecs"));
        $list148 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("thresholdSpecs")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("thresholdSpecs")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE"),
                makeSymbol("MUST-BIND-ARG1"));
        $$includeInThresholdSpecs = makeConstSym(("includeInThresholdSpecs"));
        $$excludeFromThresholdSpecs = makeConstSym(("excludeFromThresholdSpecs"));
        $THRESHOLD_SPECS_GENERATE_POS = makeKeyword("THRESHOLD-SPECS-GENERATE-POS");
        $list152 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("thresholdSpecs")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("thresholdSpecs")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST"),
                makeSymbol("REMOVAL-THRESHOLD-SPECS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("thresholdSpecs")), list(makeKeyword("BIND"), makeSymbol("COLLECTION")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("COLLECTION"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("REMOVAL-THRESHOLD-SPECS-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("thresholdSpecs")), list(makeKeyword("VALUE"), makeSymbol("COLLECTION")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"),
                makeString("(#$thresholdSpecs <fort> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$thresholdSpecs #$Animal ?WHAT)") });
        $THRESHOLD_SPECS_CHECK_POS = makeKeyword("THRESHOLD-SPECS-CHECK-POS");
        $list154 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("thresholdSpecs")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("thresholdSpecs")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-THRESHOLD-SPECS-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$thresholdSpecs <fort> <fully-bound>)"), makeKeyword("EXAMPLE"),
                makeString("(#$thresholdSpecs #$Animal #$Dog)") });
    }
}
/*
 *
 * Total time: 1008 ms
 *
 */