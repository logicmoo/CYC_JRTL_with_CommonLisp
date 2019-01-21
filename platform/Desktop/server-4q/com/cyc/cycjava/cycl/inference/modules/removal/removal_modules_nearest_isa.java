package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.forts;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.simplifier;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_nearest_isa extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa";
    public static final String myFingerPrint = "9e3f0a3e445d87b0f97e6721a343bfab5ed5e84fece6de986126c7a1325cb89a";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 3464L)
    private static SubLSymbol $default_nearest_isa_check_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 4999L)
    private static SubLSymbol $average_naut_nearest_isa_count$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 5124L)
    private static SubLSymbol $default_nearest_isa_naut_generate_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 9141L)
    private static SubLSymbol $default_nearest_genls_check_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 10886L)
    private static SubLSymbol $average_naut_nearest_genls_count$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 11015L)
    private static SubLSymbol $default_nearest_genls_naut_generate_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 14106L)
    private static SubLSymbol $default_nearest_genl_mts_check_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 20267L)
    private static SubLSymbol $default_nearest_genl_preds_check_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 23958L)
    private static SubLSymbol $default_nearest_common_isa_check_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 25100L)
    private static SubLSymbol $average_nearest_common_isa_count$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 27701L)
    private static SubLSymbol $default_nearest_common_genls_check_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 28858L)
    private static SubLSymbol $average_nearest_common_genls_count$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 33670L)
    private static SubLSymbol $default_nearest_common_specs_check_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 34810L)
    private static SubLSymbol $average_nearest_common_specs_count$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 36175L)
    private static SubLSymbol $default_nearest_common_genl_mts_check_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 37431L)
    private static SubLSymbol $average_nearest_common_genl_mts_count$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 38819L)
    private static SubLSymbol $default_nearest_common_spec_mts_check_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 39955L)
    private static SubLSymbol $average_nearest_common_spec_mts_count$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 41780L)
    private static SubLSymbol $default_nearest_different_isa_check_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 44762L)
    private static SubLSymbol $default_nearest_different_genls_check_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 69430L)
    public static SubLSymbol $near_narrow_specs_generality_cutoff$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 69684L)
    public static SubLSymbol $near_narrow_specs_completeness_cutoff$;
    private static final SubLObject $const0$nearestIsa;
    private static final SubLSymbol $kw1$POS;
    private static final SubLSymbol $kw2$ISA;
    private static final SubLList $list3;
    private static final SubLObject $const4$isa;
    private static final SubLObject $const5$thereExists;
    private static final SubLSymbol $sym6$_NEARER;
    private static final SubLObject $const7$and;
    private static final SubLObject $const8$differentSymbols;
    private static final SubLList $list9;
    private static final SubLObject $const10$genls;
    private static final SubLObject $const11$knownSentence;
    private static final SubLObject $const12$unknownSentence;
    private static final SubLSymbol $kw13$OPAQUE;
    private static final SubLSymbol $kw14$REMOVAL_NEAREST_ISA_CHECK;
    private static final SubLList $list15;
    private static final SubLSymbol $kw16$REMOVAL_NEAREST_ISA_GENERATE;
    private static final SubLList $list17;
    private static final SubLSymbol $kw18$REMOVAL_NEAREST_INSTANCES_GENERATE;
    private static final SubLList $list19;
    private static final SubLObject $const20$nearestGenls;
    private static final SubLSymbol $kw21$GENLS;
    private static final SubLSymbol $kw22$REMOVAL_NEAREST_GENLS_FORT_CHECK;
    private static final SubLList $list23;
    private static final SubLSymbol $kw24$REMOVAL_NEAREST_GENLS_NAUT_CHECK;
    private static final SubLList $list25;
    private static final SubLSymbol $kw26$REMOVAL_NEAREST_GENLS_FORT_GENERATE;
    private static final SubLList $list27;
    private static final SubLSymbol $kw28$REMOVAL_NEAREST_GENLS_NAUT_GENERATE;
    private static final SubLList $list29;
    private static final SubLSymbol $kw30$REMOVAL_NEAREST_SPECS_GENERATE;
    private static final SubLList $list31;
    private static final SubLObject $const32$nearestGenlMt;
    private static final SubLSymbol $kw33$REMOVAL_NEAREST_GENL_MTS_CHECK;
    private static final SubLList $list34;
    private static final SubLObject $const35$genlMt;
    private static final SubLSymbol $kw36$REMOVAL_NEAREST_GENL_MTS_GENERATE;
    private static final SubLList $list37;
    private static final SubLSymbol $kw38$REMOVAL_NEAREST_SPEC_MTS_GENERATE;
    private static final SubLList $list39;
    private static final SubLList $list40;
    private static final SubLList $list41;
    private static final SubLList $list42;
    private static final SubLObject $const43$nearestGenlPreds;
    private static final SubLSymbol $kw44$REMOVAL_NEAREST_GENL_PREDS_CHECK;
    private static final SubLList $list45;
    private static final SubLObject $const46$genlPreds;
    private static final SubLObject $const47$genlInverse;
    private static final SubLSymbol $kw48$REMOVAL_NEAREST_GENL_PREDS_GENERATE;
    private static final SubLList $list49;
    private static final SubLSymbol $kw50$REMOVAL_NEAREST_SPEC_PREDS_GENERATE;
    private static final SubLList $list51;
    private static final SubLObject $const52$nearestCommonIsa;
    private static final SubLSymbol $kw53$REMOVAL_NEAREST_COMMON_ISA_CHECK;
    private static final SubLList $list54;
    private static final SubLSymbol $kw55$REMOVAL_NEAREST_COMMON_ISA_GENERATE;
    private static final SubLList $list56;
    private static final SubLObject $const57$nearestCommonGenls;
    private static final SubLList $list58;
    private static final SubLSymbol $sym59$_COL;
    private static final SubLObject $const60$different;
    private static final SubLSymbol $kw61$CODE;
    private static final SubLSymbol $sym62$MAKE_NEAREST_COMMON_GENLS_SUPPORT;
    private static final SubLSymbol $kw63$REMOVAL_NEAREST_COMMON_GENLS_CHECK;
    private static final SubLList $list64;
    private static final SubLSymbol $kw65$REMOVAL_NEAREST_COMMON_GENLS_GENERATE;
    private static final SubLList $list66;
    private static final SubLObject $const67$nearestCommonGenlsOfSet;
    private static final SubLList $list68;
    private static final SubLSymbol $sym69$MAKE_NEAREST_COMMON_GENLS_OF_SET_SUPPORT;
    private static final SubLSymbol $kw70$REMOVAL_NEAREST_COMMON_GENLS_OF_SET_CHECK;
    private static final SubLList $list71;
    private static final SubLSymbol $kw72$REMOVAL_NEAREST_COMMON_GENLS_OF_SET_GENERATE;
    private static final SubLList $list73;
    private static final SubLObject $const74$nearestCommonSpecs;
    private static final SubLSymbol $kw75$REMOVAL_NEAREST_COMMON_SPECS_CHECK;
    private static final SubLList $list76;
    private static final SubLSymbol $kw77$REMOVAL_NEAREST_COMMON_SPECS_GENERATE;
    private static final SubLList $list78;
    private static final SubLObject $const79$nearestCommonGenlMt;
    private static final SubLSymbol $kw80$REMOVAL_NEAREST_COMMON_GENL_MTS_CHECK;
    private static final SubLList $list81;
    private static final SubLSymbol $kw82$REMOVAL_NEAREST_COMMON_GENL_MTS_GENERATE;
    private static final SubLList $list83;
    private static final SubLObject $const84$nearestCommonSpecMt;
    private static final SubLSymbol $kw85$REMOVAL_NEAREST_COMMON_SPEC_MTS_CHECK;
    private static final SubLList $list86;
    private static final SubLSymbol $kw87$REMOVAL_NEAREST_COMMON_SPEC_MTS_GENERATE;
    private static final SubLList $list88;
    private static final SubLObject $const89$nearestDifferentIsa;
    private static final SubLSymbol $kw90$REMOVAL_NEAREST_DIFFERENT_ISA_CHECK;
    private static final SubLList $list91;
    private static final SubLSymbol $kw92$REMOVAL_NEAREST_DIFFERENT_ISA_GENERATE;
    private static final SubLList $list93;
    private static final SubLObject $const94$nearestDifferentGenls;
    private static final SubLSymbol $kw95$REMOVAL_NEAREST_DIFFERENT_GENLS_CHECK;
    private static final SubLList $list96;
    private static final SubLSymbol $kw97$REMOVAL_NEAREST_DIFFERENT_GENLS_GENERATE;
    private static final SubLList $list98;
    private static final SubLObject $const99$nearestIsaOfType;
    private static final SubLSymbol $kw100$REMOVAL_NEAREST_ISA_OF_TYPE_CHECK;
    private static final SubLList $list101;
    private static final SubLSymbol $kw102$REMOVAL_NEAREST_ISA_OF_TYPE_GENERATE;
    private static final SubLList $list103;
    private static final SubLObject $const104$nearestGenlsOfType;
    private static final SubLSymbol $kw105$REMOVAL_NEAREST_GENLS_OF_TYPE_CHECK;
    private static final SubLList $list106;
    private static final SubLSymbol $kw107$REMOVAL_NEAREST_GENLS_OF_TYPE_GENERATE;
    private static final SubLList $list108;
    private static final SubLObject $const109$nearestArgIsa;
    private static final SubLSymbol $kw110$NEAREST_ARG_ISA_UNBOUND_RELATION_AND_COLLECTION_POS;
    private static final SubLList $list111;
    private static final SubLSymbol $kw112$REMOVAL_NEAREST_ARG_ISA_CHECK;
    private static final SubLList $list113;
    private static final SubLSymbol $kw114$REMOVAL_NEAREST_ARG_ISA_GENERATE;
    private static final SubLList $list115;
    private static final SubLObject $const116$argIsa;
    private static final SubLSymbol $kw117$GAF;
    private static final SubLSymbol $kw118$REMOVAL_NEAREST_ARG_ISA_GENERATE_REVERSE;
    private static final SubLList $list119;
    private static final SubLSymbol $sym120$INFERENCE_NEAREST_ARG_ISA_REVERSE_ITERATOR_DONE;
    private static final SubLSymbol $sym121$INFERENCE_NEAREST_ARG_ISA_REVERSE_ITERATOR_NEXT;
    private static final SubLSymbol $sym122$INFERENCE_NEAREST_ARG_ISA_REVERSE_ITERATOR_FINALIZE;
    private static final SubLObject $const123$Relation;
    private static final SubLList $list124;
    private static final SubLObject $const125$nearestArgGenl;
    private static final SubLSymbol $kw126$NEAREST_ARG_GENL_UNBOUND_RELATION_AND_COLLECTION_POS;
    private static final SubLList $list127;
    private static final SubLSymbol $kw128$REMOVAL_NEAREST_ARG_GENL_CHECK;
    private static final SubLList $list129;
    private static final SubLSymbol $kw130$REMOVAL_NEAREST_ARG_GENL_GENERATE;
    private static final SubLList $list131;
    private static final SubLObject $const132$argGenl;
    private static final SubLSymbol $kw133$REMOVAL_NEAREST_ARG_GENL_GENERATE_REVERSE;
    private static final SubLList $list134;
    private static final SubLSymbol $sym135$INFERENCE_NEAREST_ARG_GENL_REVERSE_ITERATOR_DONE;
    private static final SubLSymbol $sym136$INFERENCE_NEAREST_ARG_GENL_REVERSE_ITERATOR_NEXT;
    private static final SubLSymbol $sym137$INFERENCE_NEAREST_ARG_GENL_REVERSE_ITERATOR_FINALIZE;
    private static final SubLInteger $int138$10000;
    private static final SubLInteger $int139$212;
    private static final SubLSymbol $sym140$NUMBERP;
    private static final SubLObject $const141$nearNarrowSpecs;
    private static final SubLSymbol $kw142$NEAR_NARROW_SPECS_GENERATE_POS;
    private static final SubLList $list143;
    private static final SubLList $list144;
    private static final SubLSymbol $kw145$NEAR_NARROW_SPECS_CHECK_POS;
    private static final SubLList $list146;
    private static final SubLObject $const147$thresholdSpecs;
    private static final SubLList $list148;
    private static final SubLObject $const149$includeInThresholdSpecs;
    private static final SubLObject $const150$excludeFromThresholdSpecs;
    private static final SubLSymbol $kw151$THRESHOLD_SPECS_GENERATE_POS;
    private static final SubLList $list152;
    private static final SubLSymbol $kw153$THRESHOLD_SPECS_CHECK_POS;
    private static final SubLList $list154;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 1491L)
    public static SubLObject inference_nearest_isa_check(final SubLObject v_term, final SubLObject col, SubLObject mt) {
        if (mt == removal_modules_nearest_isa.UNPROVIDED) {
            mt = (SubLObject)removal_modules_nearest_isa.NIL;
        }
        final SubLObject nearest_items = inference_nearest_isa(v_term, mt);
        return subl_promotions.memberP(col, nearest_items, Symbols.symbol_function((SubLObject)removal_modules_nearest_isa.EQUAL), (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 1687L)
    public static SubLObject inference_nearest_isa(final SubLObject v_term, SubLObject mt) {
        if (mt == removal_modules_nearest_isa.UNPROVIDED) {
            mt = (SubLObject)removal_modules_nearest_isa.NIL;
        }
        return isa.min_isa(v_term, mt, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 1773L)
    public static SubLObject inference_nearest_instances(final SubLObject col, SubLObject mt) {
        if (mt == removal_modules_nearest_isa.UNPROVIDED) {
            mt = (SubLObject)removal_modules_nearest_isa.NIL;
        }
        final SubLObject nearest_instances = isa.instances(col, mt, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        return nearest_instances;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 1926L)
    public static SubLObject make_nearest_isa_support(final SubLObject support_sentence, SubLObject support_mt) {
        if (support_mt == removal_modules_nearest_isa.UNPROVIDED) {
            support_mt = (SubLObject)removal_modules_nearest_isa.NIL;
        }
        final SubLObject isa_support = arguments.make_hl_support((SubLObject)removal_modules_nearest_isa.$kw2$ISA, support_sentence, (SubLObject)removal_modules_nearest_isa.UNPROVIDED, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        final SubLObject more_supports = (SubLObject)removal_modules_nearest_isa.NIL;
        return Values.values(isa_support, more_supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 2157L)
    public static SubLObject hl_verify_nearest_isa(final SubLObject support) {
        SubLObject hl_module = (SubLObject)removal_modules_nearest_isa.NIL;
        SubLObject literal = (SubLObject)removal_modules_nearest_isa.NIL;
        SubLObject mt = (SubLObject)removal_modules_nearest_isa.NIL;
        SubLObject tv = (SubLObject)removal_modules_nearest_isa.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)removal_modules_nearest_isa.$list3);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)removal_modules_nearest_isa.$list3);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)removal_modules_nearest_isa.$list3);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)removal_modules_nearest_isa.$list3);
        tv = current.first();
        current = current.rest();
        if (removal_modules_nearest_isa.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)removal_modules_nearest_isa.$list3);
            return (SubLObject)removal_modules_nearest_isa.NIL;
        }
        if (hl_module != removal_modules_nearest_isa.$kw2$ISA) {
            return (SubLObject)removal_modules_nearest_isa.T;
        }
        final SubLObject v_term = el_utilities.literal_arg1(literal, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        final SubLObject col = el_utilities.literal_arg2(literal, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        return inference_nearest_isa_check(v_term, col, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 2466L)
    public static SubLObject hl_justify_nearest_isa(final SubLObject support) {
        SubLObject hl_module = (SubLObject)removal_modules_nearest_isa.NIL;
        SubLObject literal = (SubLObject)removal_modules_nearest_isa.NIL;
        SubLObject mt = (SubLObject)removal_modules_nearest_isa.NIL;
        SubLObject tv = (SubLObject)removal_modules_nearest_isa.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)removal_modules_nearest_isa.$list3);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)removal_modules_nearest_isa.$list3);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)removal_modules_nearest_isa.$list3);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)removal_modules_nearest_isa.$list3);
        tv = current.first();
        current = current.rest();
        if (removal_modules_nearest_isa.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)removal_modules_nearest_isa.$list3);
            return (SubLObject)removal_modules_nearest_isa.NIL;
        }
        if (hl_module != removal_modules_nearest_isa.$kw2$ISA) {
            return (SubLObject)ConsesLow.list(support);
        }
        final SubLObject arg1 = el_utilities.literal_arg1(literal, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        final SubLObject arg2 = el_utilities.literal_arg2(literal, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        final SubLObject isa_asent = el_utilities.make_binary_formula(removal_modules_nearest_isa.$const4$isa, arg1, arg2);
        final SubLObject thereexists_literal = (SubLObject)ConsesLow.list(removal_modules_nearest_isa.$const5$thereExists, (SubLObject)removal_modules_nearest_isa.$sym6$_NEARER, (SubLObject)ConsesLow.list(removal_modules_nearest_isa.$const7$and, (SubLObject)ConsesLow.list(removal_modules_nearest_isa.$const8$differentSymbols, (SubLObject)removal_modules_nearest_isa.$sym6$_NEARER, arg2), (SubLObject)ConsesLow.listS(removal_modules_nearest_isa.$const4$isa, arg1, (SubLObject)removal_modules_nearest_isa.$list9), (SubLObject)ConsesLow.list(removal_modules_nearest_isa.$const10$genls, (SubLObject)removal_modules_nearest_isa.$sym6$_NEARER, arg2)));
        SubLObject code_literal = (SubLObject)removal_modules_nearest_isa.NIL;
        SubLObject support_$1 = (SubLObject)removal_modules_nearest_isa.NIL;
        SubLObject code_support = (SubLObject)removal_modules_nearest_isa.NIL;
        if (removal_modules_nearest_isa.NIL != cycl_utilities.negatedP(literal)) {
            literal = cycl_utilities.negate(isa_asent);
            code_literal = (SubLObject)ConsesLow.list(removal_modules_nearest_isa.$const11$knownSentence, thereexists_literal);
        }
        else {
            literal = isa_asent;
            code_literal = (SubLObject)ConsesLow.list(removal_modules_nearest_isa.$const12$unknownSentence, thereexists_literal);
        }
        support_$1 = arguments.make_hl_support((SubLObject)removal_modules_nearest_isa.$kw2$ISA, literal, mt, tv);
        code_support = arguments.make_hl_support((SubLObject)removal_modules_nearest_isa.$kw13$OPAQUE, code_literal, mt, tv);
        return (SubLObject)ConsesLow.list(support_$1, code_support);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 3699L)
    public static SubLObject removal_nearest_isa_check(final SubLObject asent) {
        final SubLObject v_object = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        final SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        return inference_nearest_isa_check(v_object, collection, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 4404L)
    public static SubLObject removal_nearest_isa_generate_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_nearest_isa.UNPROVIDED) {
            sense = (SubLObject)removal_modules_nearest_isa.NIL;
        }
        return Numbers.add(removal_nearest_isa_generate_cost_via_indexing(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED), (SubLObject)((removal_modules_nearest_isa.NIL != el_utilities.possibly_naut_p(cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED))) ? removal_modules_nearest_isa.$average_naut_nearest_isa_count$.getGlobalValue() : removal_modules_nearest_isa.ZERO_INTEGER));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 4819L)
    public static SubLObject removal_nearest_isa_generate_cost_via_indexing(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_nearest_isa.UNPROVIDED) {
            sense = (SubLObject)removal_modules_nearest_isa.NIL;
        }
        return kb_indexing.relevant_num_gaf_arg_index(cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED), (SubLObject)removal_modules_nearest_isa.ONE_INTEGER, removal_modules_nearest_isa.$const4$isa);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 5876L)
    public static SubLObject removal_nearest_instances_generate_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_nearest_isa.UNPROVIDED) {
            sense = (SubLObject)removal_modules_nearest_isa.NIL;
        }
        return (removal_modules_nearest_isa.NIL != variables.fully_bound_p(asent)) ? control_vars.$typical_hl_module_check_cost$.getGlobalValue() : kb_indexing.relevant_num_gaf_arg_index(cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED), (SubLObject)removal_modules_nearest_isa.TWO_INTEGER, removal_modules_nearest_isa.$const4$isa);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 7195L)
    public static SubLObject inference_nearest_genls_check(final SubLObject spec, final SubLObject genl, SubLObject mt) {
        if (mt == removal_modules_nearest_isa.UNPROVIDED) {
            mt = (SubLObject)removal_modules_nearest_isa.NIL;
        }
        final SubLObject nearest_genls = inference_nearest_genls(spec, mt);
        return subl_promotions.memberP(genl, nearest_genls, Symbols.symbol_function((SubLObject)removal_modules_nearest_isa.EQUAL), (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 7397L)
    public static SubLObject inference_nearest_genls(final SubLObject col, SubLObject mt) {
        if (mt == removal_modules_nearest_isa.UNPROVIDED) {
            mt = (SubLObject)removal_modules_nearest_isa.NIL;
        }
        return genls.min_genls(col, mt, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 7485L)
    public static SubLObject inference_nearest_specs(final SubLObject col, SubLObject mt) {
        if (mt == removal_modules_nearest_isa.UNPROVIDED) {
            mt = (SubLObject)removal_modules_nearest_isa.NIL;
        }
        return genls.max_specs(col, mt, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 7573L)
    public static SubLObject make_nearest_genls_support(final SubLObject support_sentence, SubLObject support_mt) {
        if (support_mt == removal_modules_nearest_isa.UNPROVIDED) {
            support_mt = (SubLObject)removal_modules_nearest_isa.NIL;
        }
        final SubLObject genls_support = arguments.make_hl_support((SubLObject)removal_modules_nearest_isa.$kw21$GENLS, support_sentence, (SubLObject)removal_modules_nearest_isa.UNPROVIDED, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        final SubLObject more_supports = (SubLObject)removal_modules_nearest_isa.NIL;
        return Values.values(genls_support, more_supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 7812L)
    public static SubLObject hl_verify_nearest_genls(final SubLObject support) {
        SubLObject hl_module = (SubLObject)removal_modules_nearest_isa.NIL;
        SubLObject literal = (SubLObject)removal_modules_nearest_isa.NIL;
        SubLObject mt = (SubLObject)removal_modules_nearest_isa.NIL;
        SubLObject tv = (SubLObject)removal_modules_nearest_isa.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)removal_modules_nearest_isa.$list3);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)removal_modules_nearest_isa.$list3);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)removal_modules_nearest_isa.$list3);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)removal_modules_nearest_isa.$list3);
        tv = current.first();
        current = current.rest();
        if (removal_modules_nearest_isa.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)removal_modules_nearest_isa.$list3);
            return (SubLObject)removal_modules_nearest_isa.NIL;
        }
        if (hl_module != removal_modules_nearest_isa.$kw21$GENLS) {
            return (SubLObject)removal_modules_nearest_isa.T;
        }
        final SubLObject spec = el_utilities.literal_arg1(literal, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        final SubLObject genl = el_utilities.literal_arg2(literal, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        return inference_nearest_genls_check(spec, genl, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 8128L)
    public static SubLObject hl_justify_nearest_genls(final SubLObject support) {
        SubLObject hl_module = (SubLObject)removal_modules_nearest_isa.NIL;
        SubLObject literal = (SubLObject)removal_modules_nearest_isa.NIL;
        SubLObject mt = (SubLObject)removal_modules_nearest_isa.NIL;
        SubLObject tv = (SubLObject)removal_modules_nearest_isa.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)removal_modules_nearest_isa.$list3);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)removal_modules_nearest_isa.$list3);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)removal_modules_nearest_isa.$list3);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)removal_modules_nearest_isa.$list3);
        tv = current.first();
        current = current.rest();
        if (removal_modules_nearest_isa.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)removal_modules_nearest_isa.$list3);
            return (SubLObject)removal_modules_nearest_isa.NIL;
        }
        if (hl_module != removal_modules_nearest_isa.$kw21$GENLS) {
            return (SubLObject)ConsesLow.list(support);
        }
        final SubLObject arg1 = el_utilities.literal_arg1(literal, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        final SubLObject arg2 = el_utilities.literal_arg2(literal, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        final SubLObject genls_asent = el_utilities.make_binary_formula(removal_modules_nearest_isa.$const10$genls, arg1, arg2);
        final SubLObject thereexists_literal = (SubLObject)ConsesLow.list(removal_modules_nearest_isa.$const5$thereExists, (SubLObject)removal_modules_nearest_isa.$sym6$_NEARER, (SubLObject)ConsesLow.list(removal_modules_nearest_isa.$const7$and, (SubLObject)ConsesLow.list(removal_modules_nearest_isa.$const8$differentSymbols, (SubLObject)removal_modules_nearest_isa.$sym6$_NEARER, arg2), (SubLObject)ConsesLow.listS(removal_modules_nearest_isa.$const10$genls, arg1, (SubLObject)removal_modules_nearest_isa.$list9), (SubLObject)ConsesLow.list(removal_modules_nearest_isa.$const10$genls, (SubLObject)removal_modules_nearest_isa.$sym6$_NEARER, arg2)));
        SubLObject code_literal = (SubLObject)removal_modules_nearest_isa.NIL;
        SubLObject support_$2 = (SubLObject)removal_modules_nearest_isa.NIL;
        SubLObject code_support = (SubLObject)removal_modules_nearest_isa.NIL;
        if (removal_modules_nearest_isa.NIL != cycl_utilities.negatedP(literal)) {
            literal = cycl_utilities.negate(genls_asent);
            code_literal = (SubLObject)ConsesLow.list(removal_modules_nearest_isa.$const11$knownSentence, thereexists_literal);
        }
        else {
            literal = genls_asent;
            code_literal = (SubLObject)ConsesLow.list(removal_modules_nearest_isa.$const12$unknownSentence, thereexists_literal);
        }
        support_$2 = arguments.make_hl_support((SubLObject)removal_modules_nearest_isa.$kw21$GENLS, literal, mt, tv);
        code_support = arguments.make_hl_support((SubLObject)removal_modules_nearest_isa.$kw13$OPAQUE, code_literal, mt, tv);
        return (SubLObject)ConsesLow.list(support_$2, code_support);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 9381L)
    public static SubLObject removal_nearest_genls_check(final SubLObject asent) {
        final SubLObject spec = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        final SubLObject genl = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        return inference_nearest_genls_check(spec, genl, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 10549L)
    public static SubLObject removal_nearest_genls_fort_generate_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_nearest_isa.UNPROVIDED) {
            sense = (SubLObject)removal_modules_nearest_isa.NIL;
        }
        return kb_indexing.relevant_num_gaf_arg_index(cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED), (SubLObject)removal_modules_nearest_isa.ONE_INTEGER, removal_modules_nearest_isa.$const10$genls);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 12433L)
    public static SubLObject removal_nearest_specs_generate_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_nearest_isa.UNPROVIDED) {
            sense = (SubLObject)removal_modules_nearest_isa.NIL;
        }
        return kb_indexing.relevant_num_gaf_arg_index(cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED), (SubLObject)removal_modules_nearest_isa.TWO_INTEGER, removal_modules_nearest_isa.$const10$genls);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 13652L)
    public static SubLObject inference_nearest_genl_mt_check(final SubLObject spec_mt, final SubLObject genl_mt, SubLObject mt_mt) {
        if (mt_mt == removal_modules_nearest_isa.UNPROVIDED) {
            mt_mt = (SubLObject)removal_modules_nearest_isa.NIL;
        }
        final SubLObject all_nearest_genl_mts = inference_nearest_genl_mts(spec_mt, mt_mt);
        return subl_promotions.memberP(genl_mt, all_nearest_genl_mts, Symbols.symbol_function((SubLObject)removal_modules_nearest_isa.EQUAL), (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 13870L)
    public static SubLObject inference_nearest_genl_mts(final SubLObject mt, SubLObject mt_mt) {
        if (mt_mt == removal_modules_nearest_isa.UNPROVIDED) {
            mt_mt = (SubLObject)removal_modules_nearest_isa.NIL;
        }
        return genl_mts.min_genl_mts(mt, mt_mt, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 13968L)
    public static SubLObject inference_nearest_spec_mts(final SubLObject mt, SubLObject mt_mt) {
        if (mt_mt == removal_modules_nearest_isa.UNPROVIDED) {
            mt_mt = (SubLObject)removal_modules_nearest_isa.NIL;
        }
        return genl_mts.max_spec_mts(mt, mt_mt, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 14302L)
    public static SubLObject removal_nearest_genl_mt_check(final SubLObject asent) {
        final SubLObject spec_mt = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        final SubLObject genl_mt = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        return inference_nearest_genl_mt_check(spec_mt, genl_mt, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 14951L)
    public static SubLObject removal_nearest_genl_mts_generate_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_nearest_isa.UNPROVIDED) {
            sense = (SubLObject)removal_modules_nearest_isa.NIL;
        }
        return kb_indexing.relevant_num_gaf_arg_index(cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED), (SubLObject)removal_modules_nearest_isa.ONE_INTEGER, removal_modules_nearest_isa.$const35$genlMt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 15865L)
    public static SubLObject removal_nearest_spec_mts_generate_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_nearest_isa.UNPROVIDED) {
            sense = (SubLObject)removal_modules_nearest_isa.NIL;
        }
        return kb_indexing.relevant_num_gaf_arg_index(cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED), (SubLObject)removal_modules_nearest_isa.TWO_INTEGER, removal_modules_nearest_isa.$const35$genlMt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 16773L)
    public static SubLObject removal_nearest_genl_mts_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_nearest_isa.UNPROVIDED) {
            sense = (SubLObject)removal_modules_nearest_isa.NIL;
        }
        final SubLObject spec = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        final SubLObject genl = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        final SubLObject nearest_items = inference_nearest_genl_mts(spec, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        if (removal_modules_nearest_isa.NIL != subl_promotions.memberP(genl, nearest_items, Symbols.symbol_function((SubLObject)removal_modules_nearest_isa.EQUAL), (SubLObject)removal_modules_nearest_isa.UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_nearest_isa.$kw13$OPAQUE, asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED, (SubLObject)removal_modules_nearest_isa.UNPROVIDED), (SubLObject)removal_modules_nearest_isa.UNPROVIDED, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        }
        return (SubLObject)removal_modules_nearest_isa.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 17727L)
    public static SubLObject removal_nearest_genl_mts_generate_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_nearest_isa.UNPROVIDED) {
            sense = (SubLObject)removal_modules_nearest_isa.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject spec = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject nearest_items = cdolist_list_var = inference_nearest_genl_mts(spec, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        SubLObject nearest_item = (SubLObject)removal_modules_nearest_isa.NIL;
        nearest_item = cdolist_list_var.first();
        while (removal_modules_nearest_isa.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(arg2, nearest_item, (SubLObject)removal_modules_nearest_isa.T, (SubLObject)removal_modules_nearest_isa.T);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (removal_modules_nearest_isa.NIL != v_bindings) {
                final SubLObject support_formula = bindings.subst_bindings(v_bindings, asent);
                backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_nearest_isa.$kw13$OPAQUE, support_formula, (SubLObject)removal_modules_nearest_isa.UNPROVIDED, (SubLObject)removal_modules_nearest_isa.UNPROVIDED), v_bindings, unify_justification);
            }
            cdolist_list_var = cdolist_list_var.rest();
            nearest_item = cdolist_list_var.first();
        }
        return (SubLObject)removal_modules_nearest_isa.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 18839L)
    public static SubLObject removal_nearest_spec_mts_generate_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_nearest_isa.UNPROVIDED) {
            sense = (SubLObject)removal_modules_nearest_isa.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        final SubLObject genl = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject nearest_items = cdolist_list_var = inference_nearest_spec_mts(genl, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        SubLObject nearest_item = (SubLObject)removal_modules_nearest_isa.NIL;
        nearest_item = cdolist_list_var.first();
        while (removal_modules_nearest_isa.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(arg1, nearest_item, (SubLObject)removal_modules_nearest_isa.T, (SubLObject)removal_modules_nearest_isa.T);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (removal_modules_nearest_isa.NIL != v_bindings) {
                final SubLObject support_formula = bindings.subst_bindings(v_bindings, asent);
                backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_nearest_isa.$kw13$OPAQUE, support_formula, (SubLObject)removal_modules_nearest_isa.UNPROVIDED, (SubLObject)removal_modules_nearest_isa.UNPROVIDED), v_bindings, unify_justification);
            }
            cdolist_list_var = cdolist_list_var.rest();
            nearest_item = cdolist_list_var.first();
        }
        return (SubLObject)removal_modules_nearest_isa.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 20928L)
    public static SubLObject removal_nearest_genl_preds_generate_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_nearest_isa.UNPROVIDED) {
            sense = (SubLObject)removal_modules_nearest_isa.NIL;
        }
        return Numbers.add(kb_indexing.relevant_num_gaf_arg_index(cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED), (SubLObject)removal_modules_nearest_isa.ONE_INTEGER, removal_modules_nearest_isa.$const46$genlPreds), kb_indexing.relevant_num_gaf_arg_index(cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED), (SubLObject)removal_modules_nearest_isa.ONE_INTEGER, removal_modules_nearest_isa.$const47$genlInverse));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 21835L)
    public static SubLObject removal_nearest_genl_preds_check(final SubLObject asent) {
        final SubLObject spec = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        final SubLObject genl = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        return inference_nearest_genl_preds_check(spec, genl);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 22050L)
    public static SubLObject inference_nearest_genl_preds(final SubLObject pred, SubLObject mt) {
        if (mt == removal_modules_nearest_isa.UNPROVIDED) {
            mt = (SubLObject)removal_modules_nearest_isa.NIL;
        }
        final SubLObject nearest_items = genl_predicates.min_genl_predicates(pred, mt, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        return genl_predicates.min_predicates(nearest_items, mt, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 22218L)
    public static SubLObject inference_nearest_genl_preds_check(final SubLObject spec, final SubLObject genl) {
        final SubLObject nearest_gps = inference_nearest_genl_preds(spec, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        return subl_promotions.memberP(genl, nearest_gps, Symbols.symbol_function((SubLObject)removal_modules_nearest_isa.EQUAL), (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 22389L)
    public static SubLObject removal_nearest_spec_preds_generate_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_nearest_isa.UNPROVIDED) {
            sense = (SubLObject)removal_modules_nearest_isa.NIL;
        }
        return Numbers.add(kb_indexing.relevant_num_gaf_arg_index(cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED), (SubLObject)removal_modules_nearest_isa.TWO_INTEGER, removal_modules_nearest_isa.$const46$genlPreds), kb_indexing.relevant_num_gaf_arg_index(cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED), (SubLObject)removal_modules_nearest_isa.TWO_INTEGER, removal_modules_nearest_isa.$const47$genlInverse));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 23413L)
    public static SubLObject inference_nearest_spec_preds(final SubLObject pred, SubLObject mt) {
        if (mt == removal_modules_nearest_isa.UNPROVIDED) {
            mt = (SubLObject)removal_modules_nearest_isa.NIL;
        }
        return genl_predicates.max_spec_predicates(pred, mt, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 24640L)
    public static SubLObject removal_nearest_common_isa_check(final SubLObject asent) {
        final SubLObject object1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        final SubLObject object2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        final SubLObject collection = cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        final SubLObject nearest_items = inference_nearest_common_isa(object1, object2, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        return subl_promotions.memberP(collection, nearest_items, Symbols.symbol_function((SubLObject)removal_modules_nearest_isa.EQUAL), (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 24966L)
    public static SubLObject inference_nearest_common_isa(final SubLObject object1, final SubLObject object2, SubLObject mt) {
        if (mt == removal_modules_nearest_isa.UNPROVIDED) {
            mt = (SubLObject)removal_modules_nearest_isa.NIL;
        }
        return isa.min_ceiling_isa((SubLObject)ConsesLow.list(object1, object2), (SubLObject)removal_modules_nearest_isa.NIL, mt, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 26679L)
    public static SubLObject make_nearest_common_genls_support(final SubLObject support_sentence, SubLObject support_mt) {
        if (support_mt == removal_modules_nearest_isa.UNPROVIDED) {
            support_mt = (SubLObject)removal_modules_nearest_isa.NIL;
        }
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_args(support_sentence, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        SubLObject col1 = (SubLObject)removal_modules_nearest_isa.NIL;
        SubLObject col2 = (SubLObject)removal_modules_nearest_isa.NIL;
        SubLObject col3 = (SubLObject)removal_modules_nearest_isa.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_nearest_isa.$list58);
        col1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_nearest_isa.$list58);
        col2 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_nearest_isa.$list58);
        col3 = current.first();
        current = current.rest();
        if (removal_modules_nearest_isa.NIL == current) {
            final SubLObject genl_sentence1 = el_utilities.make_binary_formula(removal_modules_nearest_isa.$const10$genls, col1, col3);
            final SubLObject genl_support1 = arguments.make_hl_support((SubLObject)removal_modules_nearest_isa.$kw21$GENLS, genl_sentence1, support_mt, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
            final SubLObject genl_sentence2 = el_utilities.make_binary_formula(removal_modules_nearest_isa.$const10$genls, col2, col3);
            final SubLObject genl_support2 = arguments.make_hl_support((SubLObject)removal_modules_nearest_isa.$kw21$GENLS, genl_sentence2, support_mt, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
            final SubLObject col_var = (SubLObject)removal_modules_nearest_isa.$sym59$_COL;
            final SubLObject not_genl_sentences = (SubLObject)ConsesLow.list(el_utilities.make_binary_formula(removal_modules_nearest_isa.$const60$different, col_var, col3), el_utilities.make_binary_formula(removal_modules_nearest_isa.$const10$genls, col_var, col3), el_utilities.make_binary_formula(removal_modules_nearest_isa.$const10$genls, col1, col_var), el_utilities.make_binary_formula(removal_modules_nearest_isa.$const10$genls, col2, col_var));
            final SubLObject unknown_sentence = el_utilities.make_unary_formula(removal_modules_nearest_isa.$const12$unknownSentence, el_utilities.make_binary_formula(removal_modules_nearest_isa.$const5$thereExists, col_var, simplifier.conjoin(not_genl_sentences, (SubLObject)removal_modules_nearest_isa.UNPROVIDED)));
            final SubLObject unknown_support = arguments.make_hl_support((SubLObject)removal_modules_nearest_isa.$kw61$CODE, unknown_sentence, support_mt, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
            return Values.values(unknown_support, (SubLObject)ConsesLow.list(genl_support1, genl_support2));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_nearest_isa.$list58);
        return (SubLObject)removal_modules_nearest_isa.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 28449L)
    public static SubLObject removal_nearest_common_genls_check(final SubLObject asent) {
        final SubLObject col1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        final SubLObject col2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        final SubLObject common_genl = cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        return subl_promotions.memberP(common_genl, inference_nearest_common_genls(col1, col2, (SubLObject)removal_modules_nearest_isa.UNPROVIDED), (SubLObject)removal_modules_nearest_isa.UNPROVIDED, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 28729L)
    public static SubLObject inference_nearest_common_genls(final SubLObject col1, final SubLObject col2, SubLObject mt) {
        if (mt == removal_modules_nearest_isa.UNPROVIDED) {
            mt = (SubLObject)removal_modules_nearest_isa.NIL;
        }
        return genls.nearest_common_genls((SubLObject)ConsesLow.list(col1, col2), (SubLObject)removal_modules_nearest_isa.NIL, mt, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 30208L)
    public static SubLObject make_nearest_common_genls_of_set_support(final SubLObject support_sentence, SubLObject support_mt) {
        if (support_mt == removal_modules_nearest_isa.UNPROVIDED) {
            support_mt = (SubLObject)removal_modules_nearest_isa.NIL;
        }
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_args(support_sentence, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        SubLObject v_set = (SubLObject)removal_modules_nearest_isa.NIL;
        SubLObject genl = (SubLObject)removal_modules_nearest_isa.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_nearest_isa.$list68);
        v_set = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_nearest_isa.$list68);
        genl = current.first();
        current = current.rest();
        if (removal_modules_nearest_isa.NIL == current) {
            final SubLObject specs = el_utilities.el_extensional_set_elements(v_set);
            final SubLObject col_var = (SubLObject)removal_modules_nearest_isa.$sym59$_COL;
            SubLObject not_genl_sentences = (SubLObject)ConsesLow.list(el_utilities.make_binary_formula(removal_modules_nearest_isa.$const10$genls, col_var, genl), el_utilities.make_binary_formula(removal_modules_nearest_isa.$const60$different, col_var, genl));
            SubLObject genl_supports = (SubLObject)removal_modules_nearest_isa.NIL;
            SubLObject cdolist_list_var = specs;
            SubLObject spec = (SubLObject)removal_modules_nearest_isa.NIL;
            spec = cdolist_list_var.first();
            while (removal_modules_nearest_isa.NIL != cdolist_list_var) {
                final SubLObject genl_support_sentence = el_utilities.make_binary_formula(removal_modules_nearest_isa.$const10$genls, spec, genl);
                genl_supports = (SubLObject)ConsesLow.cons(arguments.make_hl_support((SubLObject)removal_modules_nearest_isa.$kw21$GENLS, genl_support_sentence, support_mt, (SubLObject)removal_modules_nearest_isa.UNPROVIDED), genl_supports);
                final SubLObject not_genl_sentence = el_utilities.make_binary_formula(removal_modules_nearest_isa.$const10$genls, spec, col_var);
                not_genl_sentences = (SubLObject)ConsesLow.cons(not_genl_sentence, not_genl_sentences);
                cdolist_list_var = cdolist_list_var.rest();
                spec = cdolist_list_var.first();
            }
            final SubLObject not_genl_support_sentence = el_utilities.make_unary_formula(removal_modules_nearest_isa.$const12$unknownSentence, el_utilities.make_binary_formula(removal_modules_nearest_isa.$const5$thereExists, col_var, simplifier.conjoin(not_genl_sentences, (SubLObject)removal_modules_nearest_isa.UNPROVIDED)));
            final SubLObject not_genl_support = arguments.make_hl_support((SubLObject)removal_modules_nearest_isa.$kw61$CODE, not_genl_support_sentence, support_mt, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
            return Values.values(not_genl_support, genl_supports);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_nearest_isa.$list68);
        return (SubLObject)removal_modules_nearest_isa.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 32184L)
    public static SubLObject removal_nearest_common_genls_of_set_check(final SubLObject v_set, final SubLObject col) {
        return list_utilities.member_equalP(col, genls.nearest_common_genls(v_set, (SubLObject)removal_modules_nearest_isa.UNPROVIDED, (SubLObject)removal_modules_nearest_isa.UNPROVIDED, (SubLObject)removal_modules_nearest_isa.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 34376L)
    public static SubLObject removal_nearest_common_specs_check(final SubLObject asent) {
        final SubLObject col1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        final SubLObject col2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        final SubLObject common_spec = cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        return subl_promotions.memberP(common_spec, inference_nearest_common_specs(col1, col2, (SubLObject)removal_modules_nearest_isa.UNPROVIDED), (SubLObject)removal_modules_nearest_isa.UNPROVIDED, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 34656L)
    public static SubLObject inference_nearest_common_specs(final SubLObject col1, final SubLObject col2, SubLObject mt) {
        if (mt == removal_modules_nearest_isa.UNPROVIDED) {
            mt = (SubLObject)removal_modules_nearest_isa.NIL;
        }
        return genls.nearest_common_specs((SubLObject)ConsesLow.list(col1, col2), (SubLObject)removal_modules_nearest_isa.NIL, mt, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 36926L)
    public static SubLObject removal_nearest_common_genl_mts_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_nearest_isa.UNPROVIDED) {
            sense = (SubLObject)removal_modules_nearest_isa.NIL;
        }
        final SubLObject spec1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        final SubLObject spec2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        final SubLObject genl = cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        final SubLObject nearest_items = inference_nearest_common_genl_mts(spec1, spec2, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        return subl_promotions.memberP(genl, nearest_items, Symbols.symbol_function((SubLObject)removal_modules_nearest_isa.EQUAL), (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 37282L)
    public static SubLObject inference_nearest_common_genl_mts(final SubLObject mt1, final SubLObject mt2, SubLObject mt_mt) {
        if (mt_mt == removal_modules_nearest_isa.UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        return genl_mts.min_ceiling_mts((SubLObject)ConsesLow.list(mt1, mt2), (SubLObject)removal_modules_nearest_isa.NIL, mt_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 39452L)
    public static SubLObject removal_nearest_common_spec_mts_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_nearest_isa.UNPROVIDED) {
            sense = (SubLObject)removal_modules_nearest_isa.NIL;
        }
        final SubLObject genl1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        final SubLObject genl2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        final SubLObject spec = cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        final SubLObject nearest_items = inference_nearest_common_spec_mts(genl1, genl2, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        return subl_promotions.memberP(spec, nearest_items, Symbols.symbol_function((SubLObject)removal_modules_nearest_isa.EQUAL), (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 39808L)
    public static SubLObject inference_nearest_common_spec_mts(final SubLObject mt1, final SubLObject mt2, SubLObject mt_mt) {
        if (mt_mt == removal_modules_nearest_isa.UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        return genl_mts.max_floor_mts((SubLObject)ConsesLow.list(mt1, mt2), (SubLObject)removal_modules_nearest_isa.NIL, mt_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 42494L)
    public static SubLObject removal_nearest_different_isa_check(final SubLObject asent) {
        final SubLObject obj = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        final SubLObject not_obj = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        final SubLObject collection = cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        final SubLObject nearest_items = inference_nearest_different_isa(obj, not_obj, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        return subl_promotions.memberP(collection, nearest_items, Symbols.symbol_function((SubLObject)removal_modules_nearest_isa.EQUAL), (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 42828L)
    public static SubLObject inference_nearest_different_isa(final SubLObject v_object, final SubLObject not_object, SubLObject mt) {
        if (mt == removal_modules_nearest_isa.UNPROVIDED) {
            mt = (SubLObject)removal_modules_nearest_isa.NIL;
        }
        if (v_object.equal(not_object)) {
            return (SubLObject)removal_modules_nearest_isa.NIL;
        }
        final SubLObject include = isa.all_isa(v_object, mt, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        final SubLObject skip = isa.all_isa(not_object, mt, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        final SubLObject different = conses_high.set_difference(include, skip, Symbols.symbol_function((SubLObject)removal_modules_nearest_isa.EQUAL), (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        if (removal_modules_nearest_isa.NIL == different) {
            return (SubLObject)removal_modules_nearest_isa.NIL;
        }
        if (removal_modules_nearest_isa.NIL != list_utilities.singletonP(different)) {
            return different;
        }
        final SubLObject nearest = genls.min_cols(different, mt, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        return nearest;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 43277L)
    public static SubLObject removal_nearest_different_isa_generate_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_nearest_isa.UNPROVIDED) {
            sense = (SubLObject)removal_modules_nearest_isa.NIL;
        }
        return kb_indexing.relevant_num_gaf_arg_index(cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED), (SubLObject)removal_modules_nearest_isa.ONE_INTEGER, removal_modules_nearest_isa.$const4$isa);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 45491L)
    public static SubLObject removal_nearest_different_genls_check(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_nearest_isa.UNPROVIDED) {
            sense = (SubLObject)removal_modules_nearest_isa.NIL;
        }
        final SubLObject col = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        final SubLObject not_col = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        final SubLObject genl = cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        final SubLObject nearest_items = inference_nearest_different_genls(col, not_col, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        return subl_promotions.memberP(genl, nearest_items, Symbols.symbol_function((SubLObject)removal_modules_nearest_isa.EQUAL), (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 45847L)
    public static SubLObject inference_nearest_different_genls(final SubLObject collection, final SubLObject not_collection, SubLObject mt) {
        if (mt == removal_modules_nearest_isa.UNPROVIDED) {
            mt = (SubLObject)removal_modules_nearest_isa.NIL;
        }
        if (collection.equal(not_collection)) {
            return (SubLObject)removal_modules_nearest_isa.NIL;
        }
        final SubLObject include = genls.all_genls(collection, mt, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        final SubLObject skip = (SubLObject)ConsesLow.cons(collection, genls.all_genls(not_collection, mt, (SubLObject)removal_modules_nearest_isa.UNPROVIDED));
        final SubLObject different = conses_high.set_difference(include, skip, Symbols.symbol_function((SubLObject)removal_modules_nearest_isa.EQUAL), (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        if (removal_modules_nearest_isa.NIL == different) {
            return (SubLObject)removal_modules_nearest_isa.NIL;
        }
        if (removal_modules_nearest_isa.NIL != list_utilities.singletonP(different)) {
            return different;
        }
        final SubLObject nearest = genls.min_cols(different, mt, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        return nearest;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 46348L)
    public static SubLObject removal_nearest_different_genls_generate_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_nearest_isa.UNPROVIDED) {
            sense = (SubLObject)removal_modules_nearest_isa.NIL;
        }
        return kb_indexing.relevant_num_gaf_arg_index(cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED), (SubLObject)removal_modules_nearest_isa.ONE_INTEGER, removal_modules_nearest_isa.$const10$genls);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 48270L)
    public static SubLObject inference_nearest_isa_of_type_check(final SubLObject v_term, final SubLObject type, final SubLObject col, SubLObject mt) {
        if (mt == removal_modules_nearest_isa.UNPROVIDED) {
            mt = (SubLObject)removal_modules_nearest_isa.NIL;
        }
        final SubLObject nearest_isas_of_type = inference_nearest_isas_of_type(v_term, type, mt);
        return subl_promotions.memberP(col, nearest_isas_of_type, Symbols.symbol_function((SubLObject)removal_modules_nearest_isa.EQUAL), (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 48509L)
    public static SubLObject inference_nearest_isas_of_type(final SubLObject v_term, final SubLObject type, SubLObject mt) {
        if (mt == removal_modules_nearest_isa.UNPROVIDED) {
            mt = (SubLObject)removal_modules_nearest_isa.NIL;
        }
        return isa.min_isas_of_type(v_term, type, mt, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 48625L)
    public static SubLObject make_nearest_isa_of_type_support(final SubLObject support_sentence, SubLObject support_mt) {
        if (support_mt == removal_modules_nearest_isa.UNPROVIDED) {
            support_mt = (SubLObject)removal_modules_nearest_isa.NIL;
        }
        final SubLObject isa_support = arguments.make_hl_support((SubLObject)removal_modules_nearest_isa.$kw2$ISA, support_sentence, support_mt, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        final SubLObject more_supports = (SubLObject)removal_modules_nearest_isa.NIL;
        return Values.values(isa_support, more_supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 48853L)
    public static SubLObject hl_verify_nearest_isa_of_type(final SubLObject support) {
        SubLObject hl_module = (SubLObject)removal_modules_nearest_isa.NIL;
        SubLObject literal = (SubLObject)removal_modules_nearest_isa.NIL;
        SubLObject mt = (SubLObject)removal_modules_nearest_isa.NIL;
        SubLObject tv = (SubLObject)removal_modules_nearest_isa.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)removal_modules_nearest_isa.$list3);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)removal_modules_nearest_isa.$list3);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)removal_modules_nearest_isa.$list3);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)removal_modules_nearest_isa.$list3);
        tv = current.first();
        current = current.rest();
        if (removal_modules_nearest_isa.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)removal_modules_nearest_isa.$list3);
            return (SubLObject)removal_modules_nearest_isa.NIL;
        }
        if (hl_module != removal_modules_nearest_isa.$kw2$ISA) {
            return (SubLObject)removal_modules_nearest_isa.T;
        }
        final SubLObject v_term = el_utilities.literal_arg1(literal, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        final SubLObject type = el_utilities.literal_arg2(literal, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        final SubLObject col = el_utilities.literal_arg3(literal, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        return inference_nearest_isa_of_type_check(v_term, type, col, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 49213L)
    public static SubLObject hl_justify_nearest_isa_of_type(final SubLObject support) {
        SubLObject hl_module = (SubLObject)removal_modules_nearest_isa.NIL;
        SubLObject literal = (SubLObject)removal_modules_nearest_isa.NIL;
        SubLObject mt = (SubLObject)removal_modules_nearest_isa.NIL;
        SubLObject tv = (SubLObject)removal_modules_nearest_isa.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)removal_modules_nearest_isa.$list3);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)removal_modules_nearest_isa.$list3);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)removal_modules_nearest_isa.$list3);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)removal_modules_nearest_isa.$list3);
        tv = current.first();
        current = current.rest();
        if (removal_modules_nearest_isa.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)removal_modules_nearest_isa.$list3);
            return (SubLObject)removal_modules_nearest_isa.NIL;
        }
        if (hl_module != removal_modules_nearest_isa.$kw2$ISA) {
            return (SubLObject)ConsesLow.list(support);
        }
        final SubLObject v_term = el_utilities.literal_arg1(literal, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        final SubLObject type = el_utilities.literal_arg2(literal, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        final SubLObject col = el_utilities.literal_arg3(literal, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        final SubLObject col_asent = el_utilities.make_binary_formula(removal_modules_nearest_isa.$const4$isa, v_term, col);
        final SubLObject type_asent = el_utilities.make_binary_formula(removal_modules_nearest_isa.$const4$isa, col, type);
        final SubLObject thereexists_literal = (SubLObject)ConsesLow.list(removal_modules_nearest_isa.$const5$thereExists, (SubLObject)removal_modules_nearest_isa.$sym6$_NEARER, (SubLObject)ConsesLow.list(removal_modules_nearest_isa.$const7$and, (SubLObject)ConsesLow.list(removal_modules_nearest_isa.$const8$differentSymbols, (SubLObject)removal_modules_nearest_isa.$sym6$_NEARER, col), (SubLObject)ConsesLow.listS(removal_modules_nearest_isa.$const4$isa, v_term, (SubLObject)removal_modules_nearest_isa.$list9), (SubLObject)ConsesLow.list(removal_modules_nearest_isa.$const10$genls, (SubLObject)removal_modules_nearest_isa.$sym6$_NEARER, col), (SubLObject)ConsesLow.list(removal_modules_nearest_isa.$const4$isa, (SubLObject)removal_modules_nearest_isa.$sym6$_NEARER, type)));
        SubLObject col_literal = (SubLObject)removal_modules_nearest_isa.NIL;
        SubLObject type_literal = (SubLObject)removal_modules_nearest_isa.NIL;
        SubLObject code_literal = (SubLObject)removal_modules_nearest_isa.NIL;
        if (removal_modules_nearest_isa.NIL != cycl_utilities.negatedP(literal)) {
            col_literal = cycl_utilities.negate(col_asent);
            type_literal = cycl_utilities.negate(type_asent);
            code_literal = (SubLObject)ConsesLow.list(removal_modules_nearest_isa.$const11$knownSentence, thereexists_literal);
        }
        else {
            col_literal = col_asent;
            type_literal = type_asent;
            code_literal = (SubLObject)ConsesLow.list(removal_modules_nearest_isa.$const12$unknownSentence, thereexists_literal);
        }
        final SubLObject col_support = arguments.make_hl_support((SubLObject)removal_modules_nearest_isa.$kw2$ISA, col_literal, mt, tv);
        final SubLObject type_support = arguments.make_hl_support((SubLObject)removal_modules_nearest_isa.$kw2$ISA, type_literal, mt, tv);
        final SubLObject code_support = arguments.make_hl_support((SubLObject)removal_modules_nearest_isa.$kw61$CODE, code_literal, mt, tv);
        return (SubLObject)ConsesLow.list(col_support, type_support, code_support);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 51421L)
    public static SubLObject removal_nearest_isa_of_type_generate_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_nearest_isa.UNPROVIDED) {
            sense = (SubLObject)removal_modules_nearest_isa.NIL;
        }
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        return (removal_modules_nearest_isa.NIL != forts.fort_p(v_term)) ? removal_nearest_isa_generate_cost_via_indexing(asent, sense) : removal_modules_nearest_isa.$default_nearest_isa_naut_generate_cost$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 53069L)
    public static SubLObject inference_nearest_genls_of_type_check(final SubLObject spec, final SubLObject type, final SubLObject genl, SubLObject mt) {
        if (mt == removal_modules_nearest_isa.UNPROVIDED) {
            mt = (SubLObject)removal_modules_nearest_isa.NIL;
        }
        final SubLObject nearest_genls_of_type = inference_nearest_genls_of_type(spec, type, mt, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        return subl_promotions.memberP(genl, nearest_genls_of_type, Symbols.symbol_function((SubLObject)removal_modules_nearest_isa.EQUAL), (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 53315L)
    public static SubLObject inference_nearest_genls_of_type(final SubLObject col, final SubLObject type_col, SubLObject mt, SubLObject tv) {
        if (mt == removal_modules_nearest_isa.UNPROVIDED) {
            mt = (SubLObject)removal_modules_nearest_isa.NIL;
        }
        if (tv == removal_modules_nearest_isa.UNPROVIDED) {
            tv = (SubLObject)removal_modules_nearest_isa.NIL;
        }
        final SubLObject all_genls = Sequences.remove(col, genls.all_genls(col, mt, tv), Symbols.symbol_function((SubLObject)removal_modules_nearest_isa.EQUAL), (SubLObject)removal_modules_nearest_isa.UNPROVIDED, (SubLObject)removal_modules_nearest_isa.UNPROVIDED, (SubLObject)removal_modules_nearest_isa.UNPROVIDED, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        final SubLObject genls_of_type = isa.all_instances_among(type_col, all_genls, mt, tv);
        return genls.min_cols(genls_of_type, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 53620L)
    public static SubLObject make_nearest_genls_of_type_support(final SubLObject support_sentence, SubLObject support_mt) {
        if (support_mt == removal_modules_nearest_isa.UNPROVIDED) {
            support_mt = (SubLObject)removal_modules_nearest_isa.NIL;
        }
        final SubLObject genls_support = arguments.make_hl_support((SubLObject)removal_modules_nearest_isa.$kw21$GENLS, support_sentence, (SubLObject)removal_modules_nearest_isa.UNPROVIDED, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        final SubLObject more_supports = (SubLObject)removal_modules_nearest_isa.NIL;
        return Values.values(genls_support, more_supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 53867L)
    public static SubLObject hl_verify_nearest_genls_of_type(final SubLObject support) {
        SubLObject hl_module = (SubLObject)removal_modules_nearest_isa.NIL;
        SubLObject literal = (SubLObject)removal_modules_nearest_isa.NIL;
        SubLObject mt = (SubLObject)removal_modules_nearest_isa.NIL;
        SubLObject tv = (SubLObject)removal_modules_nearest_isa.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)removal_modules_nearest_isa.$list3);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)removal_modules_nearest_isa.$list3);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)removal_modules_nearest_isa.$list3);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)removal_modules_nearest_isa.$list3);
        tv = current.first();
        current = current.rest();
        if (removal_modules_nearest_isa.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)removal_modules_nearest_isa.$list3);
            return (SubLObject)removal_modules_nearest_isa.NIL;
        }
        if (hl_module != removal_modules_nearest_isa.$kw21$GENLS) {
            return (SubLObject)removal_modules_nearest_isa.T;
        }
        final SubLObject spec = el_utilities.literal_arg1(literal, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        final SubLObject type = el_utilities.literal_arg2(literal, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        final SubLObject genl = el_utilities.literal_arg3(literal, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        return inference_nearest_genls_of_type_check(spec, type, genl, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 54234L)
    public static SubLObject hl_justify_nearest_genls_of_type(final SubLObject support) {
        SubLObject hl_module = (SubLObject)removal_modules_nearest_isa.NIL;
        SubLObject literal = (SubLObject)removal_modules_nearest_isa.NIL;
        SubLObject mt = (SubLObject)removal_modules_nearest_isa.NIL;
        SubLObject tv = (SubLObject)removal_modules_nearest_isa.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)removal_modules_nearest_isa.$list3);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)removal_modules_nearest_isa.$list3);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)removal_modules_nearest_isa.$list3);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)removal_modules_nearest_isa.$list3);
        tv = current.first();
        current = current.rest();
        if (removal_modules_nearest_isa.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)removal_modules_nearest_isa.$list3);
            return (SubLObject)removal_modules_nearest_isa.NIL;
        }
        if (hl_module != removal_modules_nearest_isa.$kw21$GENLS) {
            return (SubLObject)ConsesLow.list(support);
        }
        final SubLObject spec = el_utilities.literal_arg1(literal, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        final SubLObject type = el_utilities.literal_arg2(literal, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        final SubLObject genl = el_utilities.literal_arg3(literal, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        final SubLObject genls_asent = el_utilities.make_binary_formula(removal_modules_nearest_isa.$const10$genls, spec, genl);
        final SubLObject isa_asent = el_utilities.make_binary_formula(removal_modules_nearest_isa.$const4$isa, genl, type);
        final SubLObject thereexists_literal = (SubLObject)ConsesLow.list(removal_modules_nearest_isa.$const5$thereExists, (SubLObject)removal_modules_nearest_isa.$sym6$_NEARER, (SubLObject)ConsesLow.list(removal_modules_nearest_isa.$const7$and, (SubLObject)ConsesLow.list(removal_modules_nearest_isa.$const8$differentSymbols, (SubLObject)removal_modules_nearest_isa.$sym6$_NEARER, genl), (SubLObject)ConsesLow.listS(removal_modules_nearest_isa.$const10$genls, spec, (SubLObject)removal_modules_nearest_isa.$list9), (SubLObject)ConsesLow.list(removal_modules_nearest_isa.$const10$genls, (SubLObject)removal_modules_nearest_isa.$sym6$_NEARER, genl), (SubLObject)ConsesLow.list(removal_modules_nearest_isa.$const4$isa, (SubLObject)removal_modules_nearest_isa.$sym6$_NEARER, type)));
        SubLObject genls_literal = (SubLObject)removal_modules_nearest_isa.NIL;
        SubLObject isa_literal = (SubLObject)removal_modules_nearest_isa.NIL;
        SubLObject code_literal = (SubLObject)removal_modules_nearest_isa.NIL;
        if (removal_modules_nearest_isa.NIL != cycl_utilities.negatedP(literal)) {
            genls_literal = cycl_utilities.negate(genls_asent);
            isa_literal = cycl_utilities.negate(isa_asent);
            code_literal = (SubLObject)ConsesLow.list(removal_modules_nearest_isa.$const11$knownSentence, thereexists_literal);
        }
        else {
            genls_literal = genls_asent;
            isa_literal = isa_asent;
            code_literal = (SubLObject)ConsesLow.list(removal_modules_nearest_isa.$const12$unknownSentence, thereexists_literal);
        }
        final SubLObject genls_support = arguments.make_hl_support((SubLObject)removal_modules_nearest_isa.$kw21$GENLS, genls_literal, mt, tv);
        final SubLObject isa_support = arguments.make_hl_support((SubLObject)removal_modules_nearest_isa.$kw2$ISA, isa_literal, mt, tv);
        final SubLObject code_support = arguments.make_hl_support((SubLObject)removal_modules_nearest_isa.$kw61$CODE, code_literal, mt, tv);
        return (SubLObject)ConsesLow.list(genls_support, isa_support, code_support);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 56455L)
    public static SubLObject removal_nearest_genls_of_type_generate_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_nearest_isa.UNPROVIDED) {
            sense = (SubLObject)removal_modules_nearest_isa.NIL;
        }
        final SubLObject spec = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        return (removal_modules_nearest_isa.NIL != forts.fort_p(spec)) ? removal_nearest_genls_fort_generate_cost(asent, sense) : removal_modules_nearest_isa.$default_nearest_genls_naut_generate_cost$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 58989L)
    public static SubLObject inference_nearest_arg_isa_check(final SubLObject relation, final SubLObject arg_num, final SubLObject arg_isa) {
        return subl_promotions.memberP(arg_isa, kb_accessors.min_argn_isa(relation, arg_num, (SubLObject)removal_modules_nearest_isa.UNPROVIDED), Symbols.symbol_function((SubLObject)removal_modules_nearest_isa.EQUAL), (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 60056L)
    public static SubLObject removal_nearest_arg_isa_generate_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_nearest_isa.UNPROVIDED) {
            sense = (SubLObject)removal_modules_nearest_isa.NIL;
        }
        final SubLObject relation = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        final SubLObject arg_num = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        SubLObject count = (SubLObject)removal_modules_nearest_isa.ZERO_INTEGER;
        final SubLObject pred_var = removal_modules_nearest_isa.$const116$argIsa;
        if (removal_modules_nearest_isa.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(relation, (SubLObject)removal_modules_nearest_isa.ONE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(relation, (SubLObject)removal_modules_nearest_isa.ONE_INTEGER, pred_var);
            SubLObject done_var = (SubLObject)removal_modules_nearest_isa.NIL;
            final SubLObject token_var = (SubLObject)removal_modules_nearest_isa.NIL;
            while (removal_modules_nearest_isa.NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                if (removal_modules_nearest_isa.NIL != valid) {
                    SubLObject final_index_iterator = (SubLObject)removal_modules_nearest_isa.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_nearest_isa.$kw117$GAF, (SubLObject)removal_modules_nearest_isa.NIL, (SubLObject)removal_modules_nearest_isa.NIL);
                        SubLObject done_var_$3 = (SubLObject)removal_modules_nearest_isa.NIL;
                        final SubLObject token_var_$4 = (SubLObject)removal_modules_nearest_isa.NIL;
                        while (removal_modules_nearest_isa.NIL == done_var_$3) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                            final SubLObject valid_$5 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$4.eql(assertion));
                            if (removal_modules_nearest_isa.NIL != valid_$5 && removal_modules_nearest_isa.NIL != assertions_high.gaf_assertionP(assertion) && arg_num.eql(assertions_high.gaf_arg2(assertion))) {
                                count = Numbers.add(count, (SubLObject)removal_modules_nearest_isa.ONE_INTEGER);
                            }
                            done_var_$3 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_nearest_isa.NIL == valid_$5);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)removal_modules_nearest_isa.T);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (removal_modules_nearest_isa.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_nearest_isa.NIL == valid);
            }
        }
        return Numbers.max(count, (SubLObject)removal_modules_nearest_isa.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 60462L)
    public static SubLObject inference_nearest_arg_isa(final SubLObject relation, final SubLObject arg_num) {
        return iteration.new_list_iterator(kb_accessors.min_argn_isa(relation, arg_num, (SubLObject)removal_modules_nearest_isa.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 60587L)
    public static SubLObject make_nearest_arg_isa_support(final SubLObject support_sentence, SubLObject support_mt) {
        if (support_mt == removal_modules_nearest_isa.UNPROVIDED) {
            support_mt = (SubLObject)removal_modules_nearest_isa.NIL;
        }
        return Values.values(arguments.make_hl_support((SubLObject)removal_modules_nearest_isa.$kw13$OPAQUE, support_sentence, support_mt, (SubLObject)removal_modules_nearest_isa.UNPROVIDED), (SubLObject)removal_modules_nearest_isa.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 61702L)
    public static SubLObject removal_nearest_arg_isa_generate_reverse_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_nearest_isa.UNPROVIDED) {
            sense = (SubLObject)removal_modules_nearest_isa.NIL;
        }
        final SubLObject arg_num = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        final SubLObject col = cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        SubLObject count = (SubLObject)removal_modules_nearest_isa.ZERO_INTEGER;
        final SubLObject pred_var = removal_modules_nearest_isa.$const116$argIsa;
        if (removal_modules_nearest_isa.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(col, (SubLObject)removal_modules_nearest_isa.THREE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(col, (SubLObject)removal_modules_nearest_isa.THREE_INTEGER, pred_var);
            SubLObject done_var = (SubLObject)removal_modules_nearest_isa.NIL;
            final SubLObject token_var = (SubLObject)removal_modules_nearest_isa.NIL;
            while (removal_modules_nearest_isa.NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                if (removal_modules_nearest_isa.NIL != valid) {
                    SubLObject final_index_iterator = (SubLObject)removal_modules_nearest_isa.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_nearest_isa.$kw117$GAF, (SubLObject)removal_modules_nearest_isa.NIL, (SubLObject)removal_modules_nearest_isa.NIL);
                        SubLObject done_var_$6 = (SubLObject)removal_modules_nearest_isa.NIL;
                        final SubLObject token_var_$7 = (SubLObject)removal_modules_nearest_isa.NIL;
                        while (removal_modules_nearest_isa.NIL == done_var_$6) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$7);
                            final SubLObject valid_$8 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$7.eql(assertion));
                            if (removal_modules_nearest_isa.NIL != valid_$8 && removal_modules_nearest_isa.NIL != assertions_high.gaf_assertionP(assertion) && arg_num.eql(assertions_high.gaf_arg2(assertion))) {
                                count = Numbers.add(count, (SubLObject)removal_modules_nearest_isa.ONE_INTEGER);
                            }
                            done_var_$6 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_nearest_isa.NIL == valid_$8);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)removal_modules_nearest_isa.T);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (removal_modules_nearest_isa.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_nearest_isa.NIL == valid);
            }
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 62100L)
    public static SubLObject inference_nearest_arg_isa_reverse(final SubLObject arg_num, final SubLObject col) {
        return new_inference_nearest_arg_isa_reverse_iterator(arg_num, col);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 62237L)
    public static SubLObject new_inference_nearest_arg_isa_reverse_iterator(final SubLObject arg_num, final SubLObject col) {
        return iteration.new_iterator(inference_nearest_arg_isa_reverse_iterator_state(arg_num, col), (SubLObject)removal_modules_nearest_isa.$sym120$INFERENCE_NEAREST_ARG_ISA_REVERSE_ITERATOR_DONE, (SubLObject)removal_modules_nearest_isa.$sym121$INFERENCE_NEAREST_ARG_ISA_REVERSE_ITERATOR_NEXT, (SubLObject)removal_modules_nearest_isa.$sym122$INFERENCE_NEAREST_ARG_ISA_REVERSE_ITERATOR_FINALIZE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 62574L)
    public static SubLObject inference_nearest_arg_isa_reverse_iterator_state(final SubLObject arg_num, final SubLObject col) {
        return (SubLObject)ConsesLow.list(iteration.new_list_iterator(isa.all_fort_instances(removal_modules_nearest_isa.$const123$Relation, (SubLObject)removal_modules_nearest_isa.UNPROVIDED, (SubLObject)removal_modules_nearest_isa.UNPROVIDED)), arg_num, col);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 62734L)
    public static SubLObject inference_nearest_arg_isa_reverse_iterator_done(final SubLObject state) {
        SubLObject pred_iterator = (SubLObject)removal_modules_nearest_isa.NIL;
        SubLObject arg_num = (SubLObject)removal_modules_nearest_isa.NIL;
        SubLObject col = (SubLObject)removal_modules_nearest_isa.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)removal_modules_nearest_isa.$list124);
        pred_iterator = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)removal_modules_nearest_isa.$list124);
        arg_num = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)removal_modules_nearest_isa.$list124);
        col = current.first();
        current = current.rest();
        if (removal_modules_nearest_isa.NIL == current) {
            return iteration.iteration_done(pred_iterator);
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)removal_modules_nearest_isa.$list124);
        return (SubLObject)removal_modules_nearest_isa.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 62934L)
    public static SubLObject inference_nearest_arg_isa_reverse_iterator_next(final SubLObject state) {
        SubLObject result = (SubLObject)removal_modules_nearest_isa.NIL;
        SubLObject invalidP = (SubLObject)removal_modules_nearest_isa.NIL;
        SubLObject pred_iterator = (SubLObject)removal_modules_nearest_isa.NIL;
        SubLObject arg_num = (SubLObject)removal_modules_nearest_isa.NIL;
        SubLObject col = (SubLObject)removal_modules_nearest_isa.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)removal_modules_nearest_isa.$list124);
        pred_iterator = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)removal_modules_nearest_isa.$list124);
        arg_num = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)removal_modules_nearest_isa.$list124);
        col = current.first();
        current = current.rest();
        if (removal_modules_nearest_isa.NIL == current) {
            while (removal_modules_nearest_isa.NIL == result && removal_modules_nearest_isa.NIL == invalidP) {
                final SubLObject pred = iteration.iteration_next(pred_iterator);
                if (removal_modules_nearest_isa.NIL != pred) {
                    if (removal_modules_nearest_isa.NIL == subl_promotions.memberP(col, kb_accessors.min_argn_isa(pred, arg_num, (SubLObject)removal_modules_nearest_isa.UNPROVIDED), (SubLObject)removal_modules_nearest_isa.UNPROVIDED, (SubLObject)removal_modules_nearest_isa.UNPROVIDED)) {
                        continue;
                    }
                    result = pred;
                }
                else {
                    invalidP = (SubLObject)removal_modules_nearest_isa.T;
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)removal_modules_nearest_isa.$list124);
        }
        return Values.values(result, state, invalidP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 63346L)
    public static SubLObject inference_nearest_arg_isa_reverse_iterator_finalize(final SubLObject state) {
        SubLObject pred_iterator = (SubLObject)removal_modules_nearest_isa.NIL;
        SubLObject arg_num = (SubLObject)removal_modules_nearest_isa.NIL;
        SubLObject col = (SubLObject)removal_modules_nearest_isa.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)removal_modules_nearest_isa.$list124);
        pred_iterator = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)removal_modules_nearest_isa.$list124);
        arg_num = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)removal_modules_nearest_isa.$list124);
        col = current.first();
        current = current.rest();
        if (removal_modules_nearest_isa.NIL == current) {
            return iteration.iteration_finalize(pred_iterator);
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)removal_modules_nearest_isa.$list124);
        return (SubLObject)removal_modules_nearest_isa.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 64821L)
    public static SubLObject inference_nearest_arg_genl_check(final SubLObject relation, final SubLObject arg_num, final SubLObject arg_genl) {
        return subl_promotions.memberP(arg_genl, kb_accessors.min_argn_genl(relation, arg_num, (SubLObject)removal_modules_nearest_isa.UNPROVIDED), Symbols.symbol_function((SubLObject)removal_modules_nearest_isa.EQUAL), (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 65900L)
    public static SubLObject removal_nearest_arg_genl_generate_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_nearest_isa.UNPROVIDED) {
            sense = (SubLObject)removal_modules_nearest_isa.NIL;
        }
        final SubLObject relation = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        final SubLObject arg_num = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        SubLObject count = (SubLObject)removal_modules_nearest_isa.ZERO_INTEGER;
        final SubLObject pred_var = removal_modules_nearest_isa.$const132$argGenl;
        if (removal_modules_nearest_isa.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(relation, (SubLObject)removal_modules_nearest_isa.ONE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(relation, (SubLObject)removal_modules_nearest_isa.ONE_INTEGER, pred_var);
            SubLObject done_var = (SubLObject)removal_modules_nearest_isa.NIL;
            final SubLObject token_var = (SubLObject)removal_modules_nearest_isa.NIL;
            while (removal_modules_nearest_isa.NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                if (removal_modules_nearest_isa.NIL != valid) {
                    SubLObject final_index_iterator = (SubLObject)removal_modules_nearest_isa.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_nearest_isa.$kw117$GAF, (SubLObject)removal_modules_nearest_isa.NIL, (SubLObject)removal_modules_nearest_isa.NIL);
                        SubLObject done_var_$9 = (SubLObject)removal_modules_nearest_isa.NIL;
                        final SubLObject token_var_$10 = (SubLObject)removal_modules_nearest_isa.NIL;
                        while (removal_modules_nearest_isa.NIL == done_var_$9) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$10);
                            final SubLObject valid_$11 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$10.eql(assertion));
                            if (removal_modules_nearest_isa.NIL != valid_$11 && removal_modules_nearest_isa.NIL != assertions_high.gaf_assertionP(assertion) && arg_num.eql(assertions_high.gaf_arg2(assertion))) {
                                count = Numbers.add(count, (SubLObject)removal_modules_nearest_isa.ONE_INTEGER);
                            }
                            done_var_$9 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_nearest_isa.NIL == valid_$11);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)removal_modules_nearest_isa.T);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (removal_modules_nearest_isa.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_nearest_isa.NIL == valid);
            }
        }
        return Numbers.max(count, (SubLObject)removal_modules_nearest_isa.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 66308L)
    public static SubLObject inference_nearest_arg_genl(final SubLObject relation, final SubLObject arg_num) {
        return iteration.new_list_iterator(kb_accessors.min_argn_genl(relation, arg_num, (SubLObject)removal_modules_nearest_isa.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 66435L)
    public static SubLObject make_nearest_arg_genl_support(final SubLObject support_sentence, SubLObject support_mt) {
        if (support_mt == removal_modules_nearest_isa.UNPROVIDED) {
            support_mt = (SubLObject)removal_modules_nearest_isa.NIL;
        }
        return Values.values(arguments.make_hl_support((SubLObject)removal_modules_nearest_isa.$kw13$OPAQUE, support_sentence, support_mt, (SubLObject)removal_modules_nearest_isa.UNPROVIDED), (SubLObject)removal_modules_nearest_isa.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 67564L)
    public static SubLObject removal_nearest_arg_genl_generate_reverse_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_nearest_isa.UNPROVIDED) {
            sense = (SubLObject)removal_modules_nearest_isa.NIL;
        }
        final SubLObject arg_num = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        final SubLObject col = cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        SubLObject count = (SubLObject)removal_modules_nearest_isa.ZERO_INTEGER;
        final SubLObject pred_var = removal_modules_nearest_isa.$const132$argGenl;
        if (removal_modules_nearest_isa.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(col, (SubLObject)removal_modules_nearest_isa.THREE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(col, (SubLObject)removal_modules_nearest_isa.THREE_INTEGER, pred_var);
            SubLObject done_var = (SubLObject)removal_modules_nearest_isa.NIL;
            final SubLObject token_var = (SubLObject)removal_modules_nearest_isa.NIL;
            while (removal_modules_nearest_isa.NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                if (removal_modules_nearest_isa.NIL != valid) {
                    SubLObject final_index_iterator = (SubLObject)removal_modules_nearest_isa.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_nearest_isa.$kw117$GAF, (SubLObject)removal_modules_nearest_isa.NIL, (SubLObject)removal_modules_nearest_isa.NIL);
                        SubLObject done_var_$12 = (SubLObject)removal_modules_nearest_isa.NIL;
                        final SubLObject token_var_$13 = (SubLObject)removal_modules_nearest_isa.NIL;
                        while (removal_modules_nearest_isa.NIL == done_var_$12) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$13);
                            final SubLObject valid_$14 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$13.eql(assertion));
                            if (removal_modules_nearest_isa.NIL != valid_$14 && removal_modules_nearest_isa.NIL != assertions_high.gaf_assertionP(assertion) && arg_num.eql(assertions_high.gaf_arg2(assertion))) {
                                count = Numbers.add(count, (SubLObject)removal_modules_nearest_isa.ONE_INTEGER);
                            }
                            done_var_$12 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_nearest_isa.NIL == valid_$14);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)removal_modules_nearest_isa.T);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (removal_modules_nearest_isa.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_nearest_isa.NIL == valid);
            }
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 67964L)
    public static SubLObject inference_nearest_arg_genl_reverse(final SubLObject arg_num, final SubLObject col) {
        return new_inference_nearest_arg_genl_reverse_iterator(arg_num, col);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 68103L)
    public static SubLObject new_inference_nearest_arg_genl_reverse_iterator(final SubLObject arg_num, final SubLObject col) {
        return iteration.new_iterator(inference_nearest_arg_genl_reverse_iterator_state(arg_num, col), (SubLObject)removal_modules_nearest_isa.$sym135$INFERENCE_NEAREST_ARG_GENL_REVERSE_ITERATOR_DONE, (SubLObject)removal_modules_nearest_isa.$sym136$INFERENCE_NEAREST_ARG_GENL_REVERSE_ITERATOR_NEXT, (SubLObject)removal_modules_nearest_isa.$sym137$INFERENCE_NEAREST_ARG_GENL_REVERSE_ITERATOR_FINALIZE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 68445L)
    public static SubLObject inference_nearest_arg_genl_reverse_iterator_state(final SubLObject arg_num, final SubLObject col) {
        return (SubLObject)ConsesLow.list(iteration.new_list_iterator(isa.all_fort_instances(removal_modules_nearest_isa.$const123$Relation, (SubLObject)removal_modules_nearest_isa.UNPROVIDED, (SubLObject)removal_modules_nearest_isa.UNPROVIDED)), arg_num, col);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 68606L)
    public static SubLObject inference_nearest_arg_genl_reverse_iterator_done(final SubLObject state) {
        SubLObject pred_iterator = (SubLObject)removal_modules_nearest_isa.NIL;
        SubLObject arg_num = (SubLObject)removal_modules_nearest_isa.NIL;
        SubLObject col = (SubLObject)removal_modules_nearest_isa.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)removal_modules_nearest_isa.$list124);
        pred_iterator = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)removal_modules_nearest_isa.$list124);
        arg_num = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)removal_modules_nearest_isa.$list124);
        col = current.first();
        current = current.rest();
        if (removal_modules_nearest_isa.NIL == current) {
            return iteration.iteration_done(pred_iterator);
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)removal_modules_nearest_isa.$list124);
        return (SubLObject)removal_modules_nearest_isa.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 68807L)
    public static SubLObject inference_nearest_arg_genl_reverse_iterator_next(final SubLObject state) {
        SubLObject result = (SubLObject)removal_modules_nearest_isa.NIL;
        SubLObject invalidP = (SubLObject)removal_modules_nearest_isa.NIL;
        SubLObject pred_iterator = (SubLObject)removal_modules_nearest_isa.NIL;
        SubLObject arg_num = (SubLObject)removal_modules_nearest_isa.NIL;
        SubLObject col = (SubLObject)removal_modules_nearest_isa.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)removal_modules_nearest_isa.$list124);
        pred_iterator = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)removal_modules_nearest_isa.$list124);
        arg_num = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)removal_modules_nearest_isa.$list124);
        col = current.first();
        current = current.rest();
        if (removal_modules_nearest_isa.NIL == current) {
            while (removal_modules_nearest_isa.NIL == result && removal_modules_nearest_isa.NIL == invalidP) {
                final SubLObject pred = iteration.iteration_next(pred_iterator);
                if (removal_modules_nearest_isa.NIL != pred) {
                    if (removal_modules_nearest_isa.NIL == subl_promotions.memberP(col, kb_accessors.min_argn_genl(pred, arg_num, (SubLObject)removal_modules_nearest_isa.UNPROVIDED), (SubLObject)removal_modules_nearest_isa.UNPROVIDED, (SubLObject)removal_modules_nearest_isa.UNPROVIDED)) {
                        continue;
                    }
                    result = pred;
                }
                else {
                    invalidP = (SubLObject)removal_modules_nearest_isa.T;
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)removal_modules_nearest_isa.$list124);
        }
        return Values.values(result, state, invalidP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 69221L)
    public static SubLObject inference_nearest_arg_genl_reverse_iterator_finalize(final SubLObject state) {
        SubLObject pred_iterator = (SubLObject)removal_modules_nearest_isa.NIL;
        SubLObject arg_num = (SubLObject)removal_modules_nearest_isa.NIL;
        SubLObject col = (SubLObject)removal_modules_nearest_isa.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)removal_modules_nearest_isa.$list124);
        pred_iterator = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)removal_modules_nearest_isa.$list124);
        arg_num = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)removal_modules_nearest_isa.$list124);
        col = current.first();
        current = current.rest();
        if (removal_modules_nearest_isa.NIL == current) {
            return iteration.iteration_finalize(pred_iterator);
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)removal_modules_nearest_isa.$list124);
        return (SubLObject)removal_modules_nearest_isa.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 69824L)
    public static SubLObject near_narrow_specs(final SubLObject v_term, SubLObject cutoff) {
        if (cutoff == removal_modules_nearest_isa.UNPROVIDED) {
            cutoff = removal_modules_nearest_isa.$near_narrow_specs_completeness_cutoff$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert removal_modules_nearest_isa.NIL != Types.numberp(cutoff) : cutoff;
        if (removal_modules_nearest_isa.NIL == fort_types_interface.collection_p(v_term)) {
            return (SubLObject)removal_modules_nearest_isa.NIL;
        }
        if (cutoff.numL((SubLObject)removal_modules_nearest_isa.ONE_INTEGER)) {
            return (SubLObject)removal_modules_nearest_isa.NIL;
        }
        if (cutoff.numL((SubLObject)removal_modules_nearest_isa.TWO_INTEGER)) {
            return (SubLObject)ConsesLow.list(v_term);
        }
        if (cardinality_estimates.generality_estimate(v_term).numG(removal_modules_nearest_isa.$near_narrow_specs_generality_cutoff$.getDynamicValue(thread))) {
            return (SubLObject)removal_modules_nearest_isa.NIL;
        }
        if (cardinality_estimates.generality_estimate(v_term).numL(cutoff)) {
            return genls.all_specs(v_term, (SubLObject)removal_modules_nearest_isa.UNPROVIDED, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        }
        if (removal_modules_nearest_isa.NIL == genls.asserted_specs(v_term, (SubLObject)removal_modules_nearest_isa.UNPROVIDED)) {
            return (SubLObject)ConsesLow.list(v_term);
        }
        final SubLObject recurse_cutoff = Numbers.multiply((SubLObject)removal_modules_nearest_isa.TWO_INTEGER, Numbers.divide(cutoff, Sequences.length(genls.max_specs(v_term, (SubLObject)removal_modules_nearest_isa.UNPROVIDED, (SubLObject)removal_modules_nearest_isa.UNPROVIDED))));
        SubLObject result = (SubLObject)removal_modules_nearest_isa.NIL;
        if (removal_modules_nearest_isa.NIL == conses_high.member(v_term, result, Symbols.symbol_function((SubLObject)removal_modules_nearest_isa.EQL), Symbols.symbol_function((SubLObject)removal_modules_nearest_isa.IDENTITY))) {
            result = (SubLObject)ConsesLow.cons(v_term, result);
        }
        SubLObject cdolist_list_var = genls.max_specs(v_term, (SubLObject)removal_modules_nearest_isa.UNPROVIDED, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        SubLObject max_specs = (SubLObject)removal_modules_nearest_isa.NIL;
        max_specs = cdolist_list_var.first();
        while (removal_modules_nearest_isa.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$15 = near_narrow_specs(max_specs, recurse_cutoff);
            SubLObject near_narrow_spec = (SubLObject)removal_modules_nearest_isa.NIL;
            near_narrow_spec = cdolist_list_var_$15.first();
            while (removal_modules_nearest_isa.NIL != cdolist_list_var_$15) {
                final SubLObject item_var = near_narrow_spec;
                if (removal_modules_nearest_isa.NIL == conses_high.member(item_var, result, Symbols.symbol_function((SubLObject)removal_modules_nearest_isa.EQL), Symbols.symbol_function((SubLObject)removal_modules_nearest_isa.IDENTITY))) {
                    result = (SubLObject)ConsesLow.cons(item_var, result);
                }
                cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                near_narrow_spec = cdolist_list_var_$15.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            max_specs = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 70948L)
    public static SubLObject removal_near_narrow_specs_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_nearest_isa.UNPROVIDED) {
            sense = (SubLObject)removal_modules_nearest_isa.NIL;
        }
        final SubLObject collection = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        return Numbers.max(cardinality_estimates.spec_cardinality(collection), kb_indexing.relevant_num_gaf_arg_index(collection, (SubLObject)removal_modules_nearest_isa.TWO_INTEGER, removal_modules_nearest_isa.$const10$genls));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 71217L)
    public static SubLObject removal_near_narrow_specs_iterator(final SubLObject collection) {
        return iteration.new_list_iterator(near_narrow_specs(collection, (SubLObject)removal_modules_nearest_isa.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 72010L)
    public static SubLObject removal_near_narrow_specs_check_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_nearest_isa.UNPROVIDED) {
            sense = (SubLObject)removal_modules_nearest_isa.NIL;
        }
        final SubLObject genl = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        final SubLObject spec = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        if (removal_modules_nearest_isa.NIL != subl_promotions.memberP(spec, near_narrow_specs(genl, (SubLObject)removal_modules_nearest_isa.UNPROVIDED), Symbols.symbol_function((SubLObject)removal_modules_nearest_isa.EQUAL), (SubLObject)removal_modules_nearest_isa.UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_nearest_isa.$kw13$OPAQUE, asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED, (SubLObject)removal_modules_nearest_isa.UNPROVIDED), (SubLObject)removal_modules_nearest_isa.UNPROVIDED, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        }
        return (SubLObject)removal_modules_nearest_isa.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 73175L)
    public static SubLObject removal_threshold_specs_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_nearest_isa.UNPROVIDED) {
            sense = (SubLObject)removal_modules_nearest_isa.NIL;
        }
        final SubLObject collection = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        return Numbers.max(cardinality_estimates.spec_cardinality(collection), kb_indexing.relevant_num_gaf_arg_index(collection, (SubLObject)removal_modules_nearest_isa.TWO_INTEGER, removal_modules_nearest_isa.$const10$genls));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 73442L)
    public static SubLObject collection_below_specs_threshholdP(final SubLObject collection) {
        final SubLObject include_cols = kb_mapping_utilities.pred_refs(removal_modules_nearest_isa.$const149$includeInThresholdSpecs, (SubLObject)removal_modules_nearest_isa.ONE_INTEGER, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        final SubLObject exclude_cols = kb_mapping_utilities.pred_refs(removal_modules_nearest_isa.$const150$excludeFromThresholdSpecs, (SubLObject)removal_modules_nearest_isa.ONE_INTEGER, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        if (removal_modules_nearest_isa.NIL != subl_promotions.memberP(collection, include_cols, Symbols.symbol_function((SubLObject)removal_modules_nearest_isa.EQUAL), (SubLObject)removal_modules_nearest_isa.UNPROVIDED)) {
            return (SubLObject)removal_modules_nearest_isa.T;
        }
        if (removal_modules_nearest_isa.NIL != subl_promotions.memberP(collection, exclude_cols, Symbols.symbol_function((SubLObject)removal_modules_nearest_isa.EQUAL), (SubLObject)removal_modules_nearest_isa.UNPROVIDED)) {
            return (SubLObject)removal_modules_nearest_isa.NIL;
        }
        if (removal_modules_nearest_isa.NIL != genls.any_genlP(collection, include_cols, (SubLObject)removal_modules_nearest_isa.UNPROVIDED, (SubLObject)removal_modules_nearest_isa.UNPROVIDED) || removal_modules_nearest_isa.NIL == genls.any_specP(collection, exclude_cols, (SubLObject)removal_modules_nearest_isa.UNPROVIDED, (SubLObject)removal_modules_nearest_isa.UNPROVIDED)) {
            return (SubLObject)removal_modules_nearest_isa.T;
        }
        return (SubLObject)removal_modules_nearest_isa.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 73908L)
    public static SubLObject removal_threshold_specs_iterator(final SubLObject collection) {
        if (removal_modules_nearest_isa.NIL != collection_below_specs_threshholdP(collection)) {
            return iteration.new_list_iterator(removal_modules_genls.inference_all_specs(collection, (SubLObject)removal_modules_nearest_isa.UNPROVIDED, (SubLObject)removal_modules_nearest_isa.UNPROVIDED));
        }
        return (SubLObject)removal_modules_nearest_isa.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nearest-isa.lisp", position = 74767L)
    public static SubLObject removal_threshold_specs_check_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_nearest_isa.UNPROVIDED) {
            sense = (SubLObject)removal_modules_nearest_isa.NIL;
        }
        final SubLObject genl = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        final SubLObject spec = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        if (removal_modules_nearest_isa.NIL != collection_below_specs_threshholdP(genl) && removal_modules_nearest_isa.NIL != genls.genlP(spec, genl, (SubLObject)removal_modules_nearest_isa.UNPROVIDED, (SubLObject)removal_modules_nearest_isa.UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_nearest_isa.$kw13$OPAQUE, asent, (SubLObject)removal_modules_nearest_isa.UNPROVIDED, (SubLObject)removal_modules_nearest_isa.UNPROVIDED), (SubLObject)removal_modules_nearest_isa.UNPROVIDED, (SubLObject)removal_modules_nearest_isa.UNPROVIDED);
        }
        return (SubLObject)removal_modules_nearest_isa.NIL;
    }
    
    public static SubLObject declare_removal_modules_nearest_isa_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "inference_nearest_isa_check", "INFERENCE-NEAREST-ISA-CHECK", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "inference_nearest_isa", "INFERENCE-NEAREST-ISA", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "inference_nearest_instances", "INFERENCE-NEAREST-INSTANCES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "make_nearest_isa_support", "MAKE-NEAREST-ISA-SUPPORT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "hl_verify_nearest_isa", "HL-VERIFY-NEAREST-ISA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "hl_justify_nearest_isa", "HL-JUSTIFY-NEAREST-ISA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "removal_nearest_isa_check", "REMOVAL-NEAREST-ISA-CHECK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "removal_nearest_isa_generate_cost", "REMOVAL-NEAREST-ISA-GENERATE-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "removal_nearest_isa_generate_cost_via_indexing", "REMOVAL-NEAREST-ISA-GENERATE-COST-VIA-INDEXING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "removal_nearest_instances_generate_cost", "REMOVAL-NEAREST-INSTANCES-GENERATE-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "inference_nearest_genls_check", "INFERENCE-NEAREST-GENLS-CHECK", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "inference_nearest_genls", "INFERENCE-NEAREST-GENLS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "inference_nearest_specs", "INFERENCE-NEAREST-SPECS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "make_nearest_genls_support", "MAKE-NEAREST-GENLS-SUPPORT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "hl_verify_nearest_genls", "HL-VERIFY-NEAREST-GENLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "hl_justify_nearest_genls", "HL-JUSTIFY-NEAREST-GENLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "removal_nearest_genls_check", "REMOVAL-NEAREST-GENLS-CHECK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "removal_nearest_genls_fort_generate_cost", "REMOVAL-NEAREST-GENLS-FORT-GENERATE-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "removal_nearest_specs_generate_cost", "REMOVAL-NEAREST-SPECS-GENERATE-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "inference_nearest_genl_mt_check", "INFERENCE-NEAREST-GENL-MT-CHECK", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "inference_nearest_genl_mts", "INFERENCE-NEAREST-GENL-MTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "inference_nearest_spec_mts", "INFERENCE-NEAREST-SPEC-MTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "removal_nearest_genl_mt_check", "REMOVAL-NEAREST-GENL-MT-CHECK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "removal_nearest_genl_mts_generate_cost", "REMOVAL-NEAREST-GENL-MTS-GENERATE-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "removal_nearest_spec_mts_generate_cost", "REMOVAL-NEAREST-SPEC-MTS-GENERATE-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "removal_nearest_genl_mts_check_expand", "REMOVAL-NEAREST-GENL-MTS-CHECK-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "removal_nearest_genl_mts_generate_expand", "REMOVAL-NEAREST-GENL-MTS-GENERATE-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "removal_nearest_spec_mts_generate_expand", "REMOVAL-NEAREST-SPEC-MTS-GENERATE-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "removal_nearest_genl_preds_generate_cost", "REMOVAL-NEAREST-GENL-PREDS-GENERATE-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "removal_nearest_genl_preds_check", "REMOVAL-NEAREST-GENL-PREDS-CHECK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "inference_nearest_genl_preds", "INFERENCE-NEAREST-GENL-PREDS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "inference_nearest_genl_preds_check", "INFERENCE-NEAREST-GENL-PREDS-CHECK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "removal_nearest_spec_preds_generate_cost", "REMOVAL-NEAREST-SPEC-PREDS-GENERATE-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "inference_nearest_spec_preds", "INFERENCE-NEAREST-SPEC-PREDS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "removal_nearest_common_isa_check", "REMOVAL-NEAREST-COMMON-ISA-CHECK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "inference_nearest_common_isa", "INFERENCE-NEAREST-COMMON-ISA", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "make_nearest_common_genls_support", "MAKE-NEAREST-COMMON-GENLS-SUPPORT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "removal_nearest_common_genls_check", "REMOVAL-NEAREST-COMMON-GENLS-CHECK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "inference_nearest_common_genls", "INFERENCE-NEAREST-COMMON-GENLS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "make_nearest_common_genls_of_set_support", "MAKE-NEAREST-COMMON-GENLS-OF-SET-SUPPORT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "removal_nearest_common_genls_of_set_check", "REMOVAL-NEAREST-COMMON-GENLS-OF-SET-CHECK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "removal_nearest_common_specs_check", "REMOVAL-NEAREST-COMMON-SPECS-CHECK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "inference_nearest_common_specs", "INFERENCE-NEAREST-COMMON-SPECS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "removal_nearest_common_genl_mts_check_expand", "REMOVAL-NEAREST-COMMON-GENL-MTS-CHECK-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "inference_nearest_common_genl_mts", "INFERENCE-NEAREST-COMMON-GENL-MTS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "removal_nearest_common_spec_mts_check_expand", "REMOVAL-NEAREST-COMMON-SPEC-MTS-CHECK-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "inference_nearest_common_spec_mts", "INFERENCE-NEAREST-COMMON-SPEC-MTS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "removal_nearest_different_isa_check", "REMOVAL-NEAREST-DIFFERENT-ISA-CHECK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "inference_nearest_different_isa", "INFERENCE-NEAREST-DIFFERENT-ISA", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "removal_nearest_different_isa_generate_cost", "REMOVAL-NEAREST-DIFFERENT-ISA-GENERATE-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "removal_nearest_different_genls_check", "REMOVAL-NEAREST-DIFFERENT-GENLS-CHECK", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "inference_nearest_different_genls", "INFERENCE-NEAREST-DIFFERENT-GENLS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "removal_nearest_different_genls_generate_cost", "REMOVAL-NEAREST-DIFFERENT-GENLS-GENERATE-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "inference_nearest_isa_of_type_check", "INFERENCE-NEAREST-ISA-OF-TYPE-CHECK", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "inference_nearest_isas_of_type", "INFERENCE-NEAREST-ISAS-OF-TYPE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "make_nearest_isa_of_type_support", "MAKE-NEAREST-ISA-OF-TYPE-SUPPORT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "hl_verify_nearest_isa_of_type", "HL-VERIFY-NEAREST-ISA-OF-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "hl_justify_nearest_isa_of_type", "HL-JUSTIFY-NEAREST-ISA-OF-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "removal_nearest_isa_of_type_generate_cost", "REMOVAL-NEAREST-ISA-OF-TYPE-GENERATE-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "inference_nearest_genls_of_type_check", "INFERENCE-NEAREST-GENLS-OF-TYPE-CHECK", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "inference_nearest_genls_of_type", "INFERENCE-NEAREST-GENLS-OF-TYPE", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "make_nearest_genls_of_type_support", "MAKE-NEAREST-GENLS-OF-TYPE-SUPPORT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "hl_verify_nearest_genls_of_type", "HL-VERIFY-NEAREST-GENLS-OF-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "hl_justify_nearest_genls_of_type", "HL-JUSTIFY-NEAREST-GENLS-OF-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "removal_nearest_genls_of_type_generate_cost", "REMOVAL-NEAREST-GENLS-OF-TYPE-GENERATE-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "inference_nearest_arg_isa_check", "INFERENCE-NEAREST-ARG-ISA-CHECK", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "removal_nearest_arg_isa_generate_cost", "REMOVAL-NEAREST-ARG-ISA-GENERATE-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "inference_nearest_arg_isa", "INFERENCE-NEAREST-ARG-ISA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "make_nearest_arg_isa_support", "MAKE-NEAREST-ARG-ISA-SUPPORT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "removal_nearest_arg_isa_generate_reverse_cost", "REMOVAL-NEAREST-ARG-ISA-GENERATE-REVERSE-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "inference_nearest_arg_isa_reverse", "INFERENCE-NEAREST-ARG-ISA-REVERSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "new_inference_nearest_arg_isa_reverse_iterator", "NEW-INFERENCE-NEAREST-ARG-ISA-REVERSE-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "inference_nearest_arg_isa_reverse_iterator_state", "INFERENCE-NEAREST-ARG-ISA-REVERSE-ITERATOR-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "inference_nearest_arg_isa_reverse_iterator_done", "INFERENCE-NEAREST-ARG-ISA-REVERSE-ITERATOR-DONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "inference_nearest_arg_isa_reverse_iterator_next", "INFERENCE-NEAREST-ARG-ISA-REVERSE-ITERATOR-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "inference_nearest_arg_isa_reverse_iterator_finalize", "INFERENCE-NEAREST-ARG-ISA-REVERSE-ITERATOR-FINALIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "inference_nearest_arg_genl_check", "INFERENCE-NEAREST-ARG-GENL-CHECK", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "removal_nearest_arg_genl_generate_cost", "REMOVAL-NEAREST-ARG-GENL-GENERATE-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "inference_nearest_arg_genl", "INFERENCE-NEAREST-ARG-GENL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "make_nearest_arg_genl_support", "MAKE-NEAREST-ARG-GENL-SUPPORT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "removal_nearest_arg_genl_generate_reverse_cost", "REMOVAL-NEAREST-ARG-GENL-GENERATE-REVERSE-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "inference_nearest_arg_genl_reverse", "INFERENCE-NEAREST-ARG-GENL-REVERSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "new_inference_nearest_arg_genl_reverse_iterator", "NEW-INFERENCE-NEAREST-ARG-GENL-REVERSE-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "inference_nearest_arg_genl_reverse_iterator_state", "INFERENCE-NEAREST-ARG-GENL-REVERSE-ITERATOR-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "inference_nearest_arg_genl_reverse_iterator_done", "INFERENCE-NEAREST-ARG-GENL-REVERSE-ITERATOR-DONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "inference_nearest_arg_genl_reverse_iterator_next", "INFERENCE-NEAREST-ARG-GENL-REVERSE-ITERATOR-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "inference_nearest_arg_genl_reverse_iterator_finalize", "INFERENCE-NEAREST-ARG-GENL-REVERSE-ITERATOR-FINALIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "near_narrow_specs", "NEAR-NARROW-SPECS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "removal_near_narrow_specs_cost", "REMOVAL-NEAR-NARROW-SPECS-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "removal_near_narrow_specs_iterator", "REMOVAL-NEAR-NARROW-SPECS-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "removal_near_narrow_specs_check_pos_expand", "REMOVAL-NEAR-NARROW-SPECS-CHECK-POS-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "removal_threshold_specs_cost", "REMOVAL-THRESHOLD-SPECS-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "collection_below_specs_threshholdP", "COLLECTION-BELOW-SPECS-THRESHHOLD?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "removal_threshold_specs_iterator", "REMOVAL-THRESHOLD-SPECS-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa", "removal_threshold_specs_check_pos_expand", "REMOVAL-THRESHOLD-SPECS-CHECK-POS-EXPAND", 1, 1, false);
        return (SubLObject)removal_modules_nearest_isa.NIL;
    }
    
    public static SubLObject init_removal_modules_nearest_isa_file() {
        removal_modules_nearest_isa.$default_nearest_isa_check_cost$ = SubLFiles.defparameter("*DEFAULT-NEAREST-ISA-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        removal_modules_nearest_isa.$average_naut_nearest_isa_count$ = SubLFiles.deflexical("*AVERAGE-NAUT-NEAREST-ISA-COUNT*", (SubLObject)removal_modules_nearest_isa.ONE_INTEGER);
        removal_modules_nearest_isa.$default_nearest_isa_naut_generate_cost$ = SubLFiles.deflexical("*DEFAULT-NEAREST-ISA-NAUT-GENERATE-COST*", removal_modules_nearest_isa.$average_naut_nearest_isa_count$.getGlobalValue());
        removal_modules_nearest_isa.$default_nearest_genls_check_cost$ = SubLFiles.defparameter("*DEFAULT-NEAREST-GENLS-CHECK-COST*", control_vars.$hl_module_check_cost$.getDynamicValue());
        removal_modules_nearest_isa.$average_naut_nearest_genls_count$ = SubLFiles.deflexical("*AVERAGE-NAUT-NEAREST-GENLS-COUNT*", (SubLObject)removal_modules_nearest_isa.ONE_INTEGER);
        removal_modules_nearest_isa.$default_nearest_genls_naut_generate_cost$ = SubLFiles.deflexical("*DEFAULT-NEAREST-GENLS-NAUT-GENERATE-COST*", removal_modules_nearest_isa.$average_naut_nearest_genls_count$.getGlobalValue());
        removal_modules_nearest_isa.$default_nearest_genl_mts_check_cost$ = SubLFiles.defparameter("*DEFAULT-NEAREST-GENL-MTS-CHECK-COST*", control_vars.$hl_module_check_cost$.getDynamicValue());
        removal_modules_nearest_isa.$default_nearest_genl_preds_check_cost$ = SubLFiles.defparameter("*DEFAULT-NEAREST-GENL-PREDS-CHECK-COST*", control_vars.$hl_module_check_cost$.getDynamicValue());
        removal_modules_nearest_isa.$default_nearest_common_isa_check_cost$ = SubLFiles.defparameter("*DEFAULT-NEAREST-COMMON-ISA-CHECK-COST*", control_vars.$hl_module_check_cost$.getDynamicValue());
        removal_modules_nearest_isa.$average_nearest_common_isa_count$ = SubLFiles.defparameter("*AVERAGE-NEAREST-COMMON-ISA-COUNT*", (SubLObject)removal_modules_nearest_isa.ONE_INTEGER);
        removal_modules_nearest_isa.$default_nearest_common_genls_check_cost$ = SubLFiles.defparameter("*DEFAULT-NEAREST-COMMON-GENLS-CHECK-COST*", control_vars.$hl_module_check_cost$.getDynamicValue());
        removal_modules_nearest_isa.$average_nearest_common_genls_count$ = SubLFiles.defparameter("*AVERAGE-NEAREST-COMMON-GENLS-COUNT*", (SubLObject)removal_modules_nearest_isa.ONE_INTEGER);
        removal_modules_nearest_isa.$default_nearest_common_specs_check_cost$ = SubLFiles.defparameter("*DEFAULT-NEAREST-COMMON-SPECS-CHECK-COST*", control_vars.$hl_module_check_cost$.getDynamicValue());
        removal_modules_nearest_isa.$average_nearest_common_specs_count$ = SubLFiles.defparameter("*AVERAGE-NEAREST-COMMON-SPECS-COUNT*", (SubLObject)removal_modules_nearest_isa.TWO_INTEGER);
        removal_modules_nearest_isa.$default_nearest_common_genl_mts_check_cost$ = SubLFiles.defparameter("*DEFAULT-NEAREST-COMMON-GENL-MTS-CHECK-COST*", control_vars.$hl_module_check_cost$.getDynamicValue());
        removal_modules_nearest_isa.$average_nearest_common_genl_mts_count$ = SubLFiles.defparameter("*AVERAGE-NEAREST-COMMON-GENL-MTS-COUNT*", (SubLObject)removal_modules_nearest_isa.ONE_INTEGER);
        removal_modules_nearest_isa.$default_nearest_common_spec_mts_check_cost$ = SubLFiles.defparameter("*DEFAULT-NEAREST-COMMON-SPEC-MTS-CHECK-COST*", control_vars.$hl_module_check_cost$.getDynamicValue());
        removal_modules_nearest_isa.$average_nearest_common_spec_mts_count$ = SubLFiles.defparameter("*AVERAGE-NEAREST-COMMON-SPEC-MTS-COUNT*", (SubLObject)removal_modules_nearest_isa.ONE_INTEGER);
        removal_modules_nearest_isa.$default_nearest_different_isa_check_cost$ = SubLFiles.defparameter("*DEFAULT-NEAREST-DIFFERENT-ISA-CHECK-COST*", control_vars.$hl_module_check_cost$.getDynamicValue());
        removal_modules_nearest_isa.$default_nearest_different_genls_check_cost$ = SubLFiles.defparameter("*DEFAULT-NEAREST-DIFFERENT-GENLS-CHECK-COST*", control_vars.$hl_module_check_cost$.getDynamicValue());
        removal_modules_nearest_isa.$near_narrow_specs_generality_cutoff$ = SubLFiles.defparameter("*NEAR-NARROW-SPECS-GENERALITY-CUTOFF*", (SubLObject)removal_modules_nearest_isa.$int138$10000);
        removal_modules_nearest_isa.$near_narrow_specs_completeness_cutoff$ = SubLFiles.defparameter("*NEAR-NARROW-SPECS-COMPLETENESS-CUTOFF*", (SubLObject)removal_modules_nearest_isa.$int139$212);
        return (SubLObject)removal_modules_nearest_isa.NIL;
    }
    
    public static SubLObject setup_removal_modules_nearest_isa_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_nearest_isa.$const0$nearestIsa);
        preference_modules.doomed_unless_either_arg_bindable((SubLObject)removal_modules_nearest_isa.$kw1$POS, removal_modules_nearest_isa.$const0$nearestIsa);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nearest_isa.$kw14$REMOVAL_NEAREST_ISA_CHECK, (SubLObject)removal_modules_nearest_isa.$list15);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nearest_isa.$kw16$REMOVAL_NEAREST_ISA_GENERATE, (SubLObject)removal_modules_nearest_isa.$list17);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nearest_isa.$kw18$REMOVAL_NEAREST_INSTANCES_GENERATE, (SubLObject)removal_modules_nearest_isa.$list19);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_nearest_isa.$const20$nearestGenls);
        preference_modules.doomed_unless_either_arg_bindable((SubLObject)removal_modules_nearest_isa.$kw1$POS, removal_modules_nearest_isa.$const20$nearestGenls);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nearest_isa.$kw22$REMOVAL_NEAREST_GENLS_FORT_CHECK, (SubLObject)removal_modules_nearest_isa.$list23);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nearest_isa.$kw24$REMOVAL_NEAREST_GENLS_NAUT_CHECK, (SubLObject)removal_modules_nearest_isa.$list25);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nearest_isa.$kw26$REMOVAL_NEAREST_GENLS_FORT_GENERATE, (SubLObject)removal_modules_nearest_isa.$list27);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nearest_isa.$kw28$REMOVAL_NEAREST_GENLS_NAUT_GENERATE, (SubLObject)removal_modules_nearest_isa.$list29);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nearest_isa.$kw30$REMOVAL_NEAREST_SPECS_GENERATE, (SubLObject)removal_modules_nearest_isa.$list31);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_nearest_isa.$const32$nearestGenlMt);
        preference_modules.doomed_unless_either_arg_bindable((SubLObject)removal_modules_nearest_isa.$kw1$POS, removal_modules_nearest_isa.$const32$nearestGenlMt);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nearest_isa.$kw33$REMOVAL_NEAREST_GENL_MTS_CHECK, (SubLObject)removal_modules_nearest_isa.$list34);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nearest_isa.$kw36$REMOVAL_NEAREST_GENL_MTS_GENERATE, (SubLObject)removal_modules_nearest_isa.$list37);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nearest_isa.$kw38$REMOVAL_NEAREST_SPEC_MTS_GENERATE, (SubLObject)removal_modules_nearest_isa.$list39);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nearest_isa.$kw33$REMOVAL_NEAREST_GENL_MTS_CHECK, (SubLObject)removal_modules_nearest_isa.$list40);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nearest_isa.$kw36$REMOVAL_NEAREST_GENL_MTS_GENERATE, (SubLObject)removal_modules_nearest_isa.$list41);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nearest_isa.$kw38$REMOVAL_NEAREST_SPEC_MTS_GENERATE, (SubLObject)removal_modules_nearest_isa.$list42);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_nearest_isa.$const43$nearestGenlPreds);
        preference_modules.doomed_unless_either_arg_bindable((SubLObject)removal_modules_nearest_isa.$kw1$POS, removal_modules_nearest_isa.$const43$nearestGenlPreds);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nearest_isa.$kw44$REMOVAL_NEAREST_GENL_PREDS_CHECK, (SubLObject)removal_modules_nearest_isa.$list45);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nearest_isa.$kw48$REMOVAL_NEAREST_GENL_PREDS_GENERATE, (SubLObject)removal_modules_nearest_isa.$list49);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nearest_isa.$kw50$REMOVAL_NEAREST_SPEC_PREDS_GENERATE, (SubLObject)removal_modules_nearest_isa.$list51);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_nearest_isa.$const52$nearestCommonIsa);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_nearest_isa.$kw1$POS, removal_modules_nearest_isa.$const52$nearestCommonIsa, (SubLObject)removal_modules_nearest_isa.ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_nearest_isa.$kw1$POS, removal_modules_nearest_isa.$const52$nearestCommonIsa, (SubLObject)removal_modules_nearest_isa.TWO_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nearest_isa.$kw53$REMOVAL_NEAREST_COMMON_ISA_CHECK, (SubLObject)removal_modules_nearest_isa.$list54);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nearest_isa.$kw55$REMOVAL_NEAREST_COMMON_ISA_GENERATE, (SubLObject)removal_modules_nearest_isa.$list56);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_nearest_isa.$const57$nearestCommonGenls);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_nearest_isa.$kw1$POS, removal_modules_nearest_isa.$const57$nearestCommonGenls, (SubLObject)removal_modules_nearest_isa.ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_nearest_isa.$kw1$POS, removal_modules_nearest_isa.$const57$nearestCommonGenls, (SubLObject)removal_modules_nearest_isa.TWO_INTEGER);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_nearest_isa.$sym62$MAKE_NEAREST_COMMON_GENLS_SUPPORT);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nearest_isa.$kw63$REMOVAL_NEAREST_COMMON_GENLS_CHECK, (SubLObject)removal_modules_nearest_isa.$list64);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nearest_isa.$kw65$REMOVAL_NEAREST_COMMON_GENLS_GENERATE, (SubLObject)removal_modules_nearest_isa.$list66);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_nearest_isa.$const67$nearestCommonGenlsOfSet);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_nearest_isa.$kw1$POS, removal_modules_nearest_isa.$const67$nearestCommonGenlsOfSet, (SubLObject)removal_modules_nearest_isa.ONE_INTEGER);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_nearest_isa.$sym69$MAKE_NEAREST_COMMON_GENLS_OF_SET_SUPPORT);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nearest_isa.$kw70$REMOVAL_NEAREST_COMMON_GENLS_OF_SET_CHECK, (SubLObject)removal_modules_nearest_isa.$list71);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nearest_isa.$kw72$REMOVAL_NEAREST_COMMON_GENLS_OF_SET_GENERATE, (SubLObject)removal_modules_nearest_isa.$list73);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_nearest_isa.$const74$nearestCommonSpecs);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_nearest_isa.$kw1$POS, removal_modules_nearest_isa.$const74$nearestCommonSpecs, (SubLObject)removal_modules_nearest_isa.ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_nearest_isa.$kw1$POS, removal_modules_nearest_isa.$const74$nearestCommonSpecs, (SubLObject)removal_modules_nearest_isa.TWO_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nearest_isa.$kw75$REMOVAL_NEAREST_COMMON_SPECS_CHECK, (SubLObject)removal_modules_nearest_isa.$list76);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nearest_isa.$kw77$REMOVAL_NEAREST_COMMON_SPECS_GENERATE, (SubLObject)removal_modules_nearest_isa.$list78);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_nearest_isa.$const79$nearestCommonGenlMt);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_nearest_isa.$kw1$POS, removal_modules_nearest_isa.$const79$nearestCommonGenlMt, (SubLObject)removal_modules_nearest_isa.ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_nearest_isa.$kw1$POS, removal_modules_nearest_isa.$const79$nearestCommonGenlMt, (SubLObject)removal_modules_nearest_isa.TWO_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nearest_isa.$kw80$REMOVAL_NEAREST_COMMON_GENL_MTS_CHECK, (SubLObject)removal_modules_nearest_isa.$list81);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nearest_isa.$kw82$REMOVAL_NEAREST_COMMON_GENL_MTS_GENERATE, (SubLObject)removal_modules_nearest_isa.$list83);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_nearest_isa.$const84$nearestCommonSpecMt);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_nearest_isa.$kw1$POS, removal_modules_nearest_isa.$const84$nearestCommonSpecMt, (SubLObject)removal_modules_nearest_isa.ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_nearest_isa.$kw1$POS, removal_modules_nearest_isa.$const84$nearestCommonSpecMt, (SubLObject)removal_modules_nearest_isa.TWO_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nearest_isa.$kw85$REMOVAL_NEAREST_COMMON_SPEC_MTS_CHECK, (SubLObject)removal_modules_nearest_isa.$list86);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nearest_isa.$kw87$REMOVAL_NEAREST_COMMON_SPEC_MTS_GENERATE, (SubLObject)removal_modules_nearest_isa.$list88);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_nearest_isa.$const89$nearestDifferentIsa);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_nearest_isa.$kw1$POS, removal_modules_nearest_isa.$const89$nearestDifferentIsa, (SubLObject)removal_modules_nearest_isa.ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_nearest_isa.$kw1$POS, removal_modules_nearest_isa.$const89$nearestDifferentIsa, (SubLObject)removal_modules_nearest_isa.TWO_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nearest_isa.$kw90$REMOVAL_NEAREST_DIFFERENT_ISA_CHECK, (SubLObject)removal_modules_nearest_isa.$list91);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nearest_isa.$kw92$REMOVAL_NEAREST_DIFFERENT_ISA_GENERATE, (SubLObject)removal_modules_nearest_isa.$list93);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_nearest_isa.$const94$nearestDifferentGenls);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_nearest_isa.$kw1$POS, removal_modules_nearest_isa.$const94$nearestDifferentGenls, (SubLObject)removal_modules_nearest_isa.ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_nearest_isa.$kw1$POS, removal_modules_nearest_isa.$const94$nearestDifferentGenls, (SubLObject)removal_modules_nearest_isa.TWO_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nearest_isa.$kw95$REMOVAL_NEAREST_DIFFERENT_GENLS_CHECK, (SubLObject)removal_modules_nearest_isa.$list96);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nearest_isa.$kw97$REMOVAL_NEAREST_DIFFERENT_GENLS_GENERATE, (SubLObject)removal_modules_nearest_isa.$list98);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_nearest_isa.$const99$nearestIsaOfType);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_nearest_isa.$kw1$POS, removal_modules_nearest_isa.$const99$nearestIsaOfType, (SubLObject)removal_modules_nearest_isa.ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_nearest_isa.$kw1$POS, removal_modules_nearest_isa.$const99$nearestIsaOfType, (SubLObject)removal_modules_nearest_isa.TWO_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nearest_isa.$kw100$REMOVAL_NEAREST_ISA_OF_TYPE_CHECK, (SubLObject)removal_modules_nearest_isa.$list101);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nearest_isa.$kw102$REMOVAL_NEAREST_ISA_OF_TYPE_GENERATE, (SubLObject)removal_modules_nearest_isa.$list103);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_nearest_isa.$const104$nearestGenlsOfType);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_nearest_isa.$kw1$POS, removal_modules_nearest_isa.$const104$nearestGenlsOfType, (SubLObject)removal_modules_nearest_isa.ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_nearest_isa.$kw1$POS, removal_modules_nearest_isa.$const104$nearestGenlsOfType, (SubLObject)removal_modules_nearest_isa.TWO_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nearest_isa.$kw105$REMOVAL_NEAREST_GENLS_OF_TYPE_CHECK, (SubLObject)removal_modules_nearest_isa.$list106);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nearest_isa.$kw107$REMOVAL_NEAREST_GENLS_OF_TYPE_GENERATE, (SubLObject)removal_modules_nearest_isa.$list108);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_nearest_isa.$const109$nearestArgIsa);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_nearest_isa.$kw1$POS, removal_modules_nearest_isa.$const109$nearestArgIsa, (SubLObject)removal_modules_nearest_isa.TWO_INTEGER);
        preference_modules.inference_preference_module((SubLObject)removal_modules_nearest_isa.$kw110$NEAREST_ARG_ISA_UNBOUND_RELATION_AND_COLLECTION_POS, (SubLObject)removal_modules_nearest_isa.$list111);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nearest_isa.$kw112$REMOVAL_NEAREST_ARG_ISA_CHECK, (SubLObject)removal_modules_nearest_isa.$list113);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nearest_isa.$kw114$REMOVAL_NEAREST_ARG_ISA_GENERATE, (SubLObject)removal_modules_nearest_isa.$list115);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nearest_isa.$kw118$REMOVAL_NEAREST_ARG_ISA_GENERATE_REVERSE, (SubLObject)removal_modules_nearest_isa.$list119);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_nearest_isa.$const125$nearestArgGenl);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_nearest_isa.$kw1$POS, removal_modules_nearest_isa.$const125$nearestArgGenl, (SubLObject)removal_modules_nearest_isa.TWO_INTEGER);
        preference_modules.inference_preference_module((SubLObject)removal_modules_nearest_isa.$kw126$NEAREST_ARG_GENL_UNBOUND_RELATION_AND_COLLECTION_POS, (SubLObject)removal_modules_nearest_isa.$list127);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nearest_isa.$kw128$REMOVAL_NEAREST_ARG_GENL_CHECK, (SubLObject)removal_modules_nearest_isa.$list129);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nearest_isa.$kw130$REMOVAL_NEAREST_ARG_GENL_GENERATE, (SubLObject)removal_modules_nearest_isa.$list131);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nearest_isa.$kw133$REMOVAL_NEAREST_ARG_GENL_GENERATE_REVERSE, (SubLObject)removal_modules_nearest_isa.$list134);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_nearest_isa.$const141$nearNarrowSpecs);
        preference_modules.inference_preference_module((SubLObject)removal_modules_nearest_isa.$kw142$NEAR_NARROW_SPECS_GENERATE_POS, (SubLObject)removal_modules_nearest_isa.$list143);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_nearest_isa.$kw1$POS, removal_modules_nearest_isa.$const141$nearNarrowSpecs, (SubLObject)removal_modules_nearest_isa.ONE_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nearest_isa.$kw142$NEAR_NARROW_SPECS_GENERATE_POS, (SubLObject)removal_modules_nearest_isa.$list144);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nearest_isa.$kw145$NEAR_NARROW_SPECS_CHECK_POS, (SubLObject)removal_modules_nearest_isa.$list146);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_nearest_isa.$const147$thresholdSpecs);
        preference_modules.inference_preference_module((SubLObject)removal_modules_nearest_isa.$kw142$NEAR_NARROW_SPECS_GENERATE_POS, (SubLObject)removal_modules_nearest_isa.$list148);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_nearest_isa.$kw1$POS, removal_modules_nearest_isa.$const147$thresholdSpecs, (SubLObject)removal_modules_nearest_isa.ONE_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nearest_isa.$kw151$THRESHOLD_SPECS_GENERATE_POS, (SubLObject)removal_modules_nearest_isa.$list152);
        inference_modules.inference_removal_module((SubLObject)removal_modules_nearest_isa.$kw153$THRESHOLD_SPECS_CHECK_POS, (SubLObject)removal_modules_nearest_isa.$list154);
        return (SubLObject)removal_modules_nearest_isa.NIL;
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
        me = (SubLFile)new removal_modules_nearest_isa();
        removal_modules_nearest_isa.$default_nearest_isa_check_cost$ = null;
        removal_modules_nearest_isa.$average_naut_nearest_isa_count$ = null;
        removal_modules_nearest_isa.$default_nearest_isa_naut_generate_cost$ = null;
        removal_modules_nearest_isa.$default_nearest_genls_check_cost$ = null;
        removal_modules_nearest_isa.$average_naut_nearest_genls_count$ = null;
        removal_modules_nearest_isa.$default_nearest_genls_naut_generate_cost$ = null;
        removal_modules_nearest_isa.$default_nearest_genl_mts_check_cost$ = null;
        removal_modules_nearest_isa.$default_nearest_genl_preds_check_cost$ = null;
        removal_modules_nearest_isa.$default_nearest_common_isa_check_cost$ = null;
        removal_modules_nearest_isa.$average_nearest_common_isa_count$ = null;
        removal_modules_nearest_isa.$default_nearest_common_genls_check_cost$ = null;
        removal_modules_nearest_isa.$average_nearest_common_genls_count$ = null;
        removal_modules_nearest_isa.$default_nearest_common_specs_check_cost$ = null;
        removal_modules_nearest_isa.$average_nearest_common_specs_count$ = null;
        removal_modules_nearest_isa.$default_nearest_common_genl_mts_check_cost$ = null;
        removal_modules_nearest_isa.$average_nearest_common_genl_mts_count$ = null;
        removal_modules_nearest_isa.$default_nearest_common_spec_mts_check_cost$ = null;
        removal_modules_nearest_isa.$average_nearest_common_spec_mts_count$ = null;
        removal_modules_nearest_isa.$default_nearest_different_isa_check_cost$ = null;
        removal_modules_nearest_isa.$default_nearest_different_genls_check_cost$ = null;
        removal_modules_nearest_isa.$near_narrow_specs_generality_cutoff$ = null;
        removal_modules_nearest_isa.$near_narrow_specs_completeness_cutoff$ = null;
        $const0$nearestIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestIsa"));
        $kw1$POS = SubLObjectFactory.makeKeyword("POS");
        $kw2$ISA = SubLObjectFactory.makeKeyword("ISA");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("LITERAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"));
        $const4$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $const5$thereExists = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists"));
        $sym6$_NEARER = SubLObjectFactory.makeSymbol("?NEARER");
        $const7$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $const8$differentSymbols = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("differentSymbols"));
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?NEARER"));
        $const10$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $const11$knownSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("knownSentence"));
        $const12$unknownSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentence"));
        $kw13$OPAQUE = SubLObjectFactory.makeKeyword("OPAQUE");
        $kw14$REMOVAL_NEAREST_ISA_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-NEAREST-ISA-CHECK");
        $list15 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestIsa")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestIsa")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-NEAREST-ISA-CHECK-COST*"), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-NEAREST-ISA-CHECK"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeSymbol("MAKE-NEAREST-ISA-SUPPORT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nearestIsa <fully-bound> <fort>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nearestIsa #$Canada #$IndependentCountry)\n(#$nearestIsa (#$YearFn 2001) #$CalendarYear)") });
        $kw16$REMOVAL_NEAREST_ISA_GENERATE = SubLObjectFactory.makeKeyword("REMOVAL-NEAREST-ISA-GENERATE");
        $list17 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestIsa")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestIsa")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-NEAREST-ISA-GENERATE-COST"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestIsa")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-NEAREST-ISA"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestIsa")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeSymbol("MAKE-NEAREST-ISA-SUPPORT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nearestIsa <fort> <non fort>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nearestIsa #$Canada ?WHAT)\n(#$nearestIsa (#$YearFn 2001) ?WHAT)") });
        $kw18$REMOVAL_NEAREST_INSTANCES_GENERATE = SubLObjectFactory.makeKeyword("REMOVAL-NEAREST-INSTANCES-GENERATE");
        $list19 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestIsa")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestIsa")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-NEAREST-INSTANCES-GENERATE-COST"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestIsa")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTION"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTION"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-NEAREST-INSTANCES"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestIsa")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTION"))), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeSymbol("MAKE-NEAREST-ISA-SUPPORT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nearestIsa <whatever> <fort>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nearestIsa ?WHAT #$IndependentCountry)") });
        $const20$nearestGenls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestGenls"));
        $kw21$GENLS = SubLObjectFactory.makeKeyword("GENLS");
        $kw22$REMOVAL_NEAREST_GENLS_FORT_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-NEAREST-GENLS-FORT-CHECK");
        $list23 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestGenls")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestGenls")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-NEAREST-GENLS-CHECK-COST*"), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-NEAREST-GENLS-CHECK"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeSymbol("MAKE-NEAREST-GENLS-SUPPORT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nearestGenls <fort> <fort>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nearestGenls #$Wine #$AlcoholicBeverage)") });
        $kw24$REMOVAL_NEAREST_GENLS_NAUT_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-NEAREST-GENLS-NAUT-CHECK");
        $list25 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestGenls")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestGenls")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-NEAREST-GENLS-CHECK-COST*"), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-NEAREST-GENLS-CHECK"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeSymbol("MAKE-NEAREST-GENLS-SUPPORT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nearestGenls (<fort> . <fully-bound>) <fort>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nearestGenls (#$JuvenileFn #$Cougar) #$JuvenileAnimal)") });
        $kw26$REMOVAL_NEAREST_GENLS_FORT_GENERATE = SubLObjectFactory.makeKeyword("REMOVAL-NEAREST-GENLS-FORT-GENERATE");
        $list27 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestGenls")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestGenls")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-NEAREST-GENLS-FORT-GENERATE-COST"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestGenls")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("SPEC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SPEC"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-NEAREST-GENLS"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestGenls")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SPEC")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeSymbol("MAKE-NEAREST-GENLS-SUPPORT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nearestGenls <fort> <non-fort>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nearestGenls #$Wine ?WHAT)") });
        $kw28$REMOVAL_NEAREST_GENLS_NAUT_GENERATE = SubLObjectFactory.makeKeyword("REMOVAL-NEAREST-GENLS-NAUT-GENERATE");
        $list29 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestGenls")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestGenls")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-NEAREST-GENLS-NAUT-GENERATE-COST*"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestGenls")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("SPEC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SPEC"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-NEAREST-GENLS"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestGenls")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SPEC")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeSymbol("MAKE-NEAREST-GENLS-SUPPORT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nearestGenls (<fort> . <fully-bound>) <non-fort>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nearestGenls (#$JuvenileFn #$Cougar) ?WHAT)") });
        $kw30$REMOVAL_NEAREST_SPECS_GENERATE = SubLObjectFactory.makeKeyword("REMOVAL-NEAREST-SPECS-GENERATE");
        $list31 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestGenls")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestGenls")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-NEAREST-SPECS-GENERATE-COST"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestGenls")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("GENL"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("GENL"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-NEAREST-SPECS"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestGenls")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("GENL"))), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeSymbol("MAKE-NEAREST-GENLS-SUPPORT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nearestGenls <whatever> <fort>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nearestGenls ?SPEC #$AlcoholicBeverage)") });
        $const32$nearestGenlMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestGenlMt"));
        $kw33$REMOVAL_NEAREST_GENL_MTS_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-NEAREST-GENL-MTS-CHECK");
        $list34 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestGenlMt")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestGenlMt")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-NEAREST-GENL-MTS-CHECK-COST*"), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-NEAREST-GENL-MT-CHECK"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nearestGenlMt <fort> <fort>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nearestGenlMt #$HumanPerceptionMt #$PerceptionMt)") });
        $const35$genlMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt"));
        $kw36$REMOVAL_NEAREST_GENL_MTS_GENERATE = SubLObjectFactory.makeKeyword("REMOVAL-NEAREST-GENL-MTS-GENERATE");
        $list37 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestGenlMt")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestGenlMt")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-NEAREST-GENL-MTS-GENERATE-COST"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestGenlMt")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("SPEC-MT")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SPEC-MT"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-NEAREST-GENL-MTS"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestGenlMt")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SPEC-MT")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nearestGenlMt <fort> <non-fort>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nearestGenlMt #$HumanPerceptionMt ?WHAT)") });
        $kw38$REMOVAL_NEAREST_SPEC_MTS_GENERATE = SubLObjectFactory.makeKeyword("REMOVAL-NEAREST-SPEC-MTS-GENERATE");
        $list39 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestGenlMt")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestGenlMt")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-NEAREST-SPEC-MTS-GENERATE-COST"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestGenlMt")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("GENL-MT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("GENL-MT"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-NEAREST-SPEC-MTS"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestGenlMt")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("GENL-MT"))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nearestGenlMt <non-fort> <fort>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nearestGenlMt ?SPEC #$PerceptionMt)") });
        $list40 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestGenlMt")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestGenlMt")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-NEAREST-GENL-MTS-CHECK-COST*"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-NEAREST-GENL-MTS-CHECK-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nearestGenlMt <fort> <fort>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nearestGenlMt #$HumanPerceptionMt #$PerceptionMt)") });
        $list41 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestGenlMt")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestGenlMt")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-NEAREST-GENL-MTS-GENERATE-COST"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-NEAREST-GENL-MTS-GENERATE-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nearestGenlMt <fort> <whatever>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nearestGenlMt #$HumanPerceptionMt ?WHAT)") });
        $list42 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestGenlMt")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestGenlMt")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-NEAREST-SPEC-MTS-GENERATE-COST"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-NEAREST-SPEC-MTS-GENERATE-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nearestGenlMt <whatever> <fort>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nearestGenlMt ?SPEC #$PerceptionMt)") });
        $const43$nearestGenlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestGenlPreds"));
        $kw44$REMOVAL_NEAREST_GENL_PREDS_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-NEAREST-GENL-PREDS-CHECK");
        $list45 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestGenlPreds")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestGenlPreds")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-NEAREST-GENL-PREDS-CHECK-COST*"), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-NEAREST-GENL-PREDS-CHECK"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nearestGenlPreds <fort> <fort>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nearestGenlPreds #$performedBy #$doneBy)") });
        $const46$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $const47$genlInverse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse"));
        $kw48$REMOVAL_NEAREST_GENL_PREDS_GENERATE = SubLObjectFactory.makeKeyword("REMOVAL-NEAREST-GENL-PREDS-GENERATE");
        $list49 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestGenlPreds")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestGenlPreds")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-NEAREST-GENL-PREDS-GENERATE-COST"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestGenlPreds")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-NEAREST-GENL-PREDS"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestGenlPreds")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nearestGenlPreds <fort> <whatever>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nearestGenlPreds #$performedBy ?WHAT)") });
        $kw50$REMOVAL_NEAREST_SPEC_PREDS_GENERATE = SubLObjectFactory.makeKeyword("REMOVAL-NEAREST-SPEC-PREDS-GENERATE");
        $list51 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestGenlPreds")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestGenlPreds")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-NEAREST-SPEC-PREDS-GENERATE-COST"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestGenlPreds")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-NEAREST-SPEC-PREDS"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestGenlPreds")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nearestGenlPreds <whatever> <fort>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nearestGenlPreds ?WHAT #$doneBy)") });
        $const52$nearestCommonIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestCommonIsa"));
        $kw53$REMOVAL_NEAREST_COMMON_ISA_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-NEAREST-COMMON-ISA-CHECK");
        $list54 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestCommonIsa")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestCommonIsa")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-NEAREST-COMMON-ISA-CHECK-COST*"), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-NEAREST-COMMON-ISA-CHECK"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nearestCommonIsa <fort> <fort> <fort>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nearestCommonIsa #$France #$Spain #$IndependentCountry)") });
        $kw55$REMOVAL_NEAREST_COMMON_ISA_GENERATE = SubLObjectFactory.makeKeyword("REMOVAL-NEAREST-COMMON-ISA-GENERATE");
        $list56 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestCommonIsa")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestCommonIsa")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*AVERAGE-NEAREST-COMMON-ISA-COUNT*"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestCommonIsa")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT1")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT2")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT1")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT2")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT1"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT2")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-NEAREST-COMMON-ISA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT1")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT2")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestCommonIsa")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT1")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT2")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nearestCommonIsa <fort> <fort> <whatever>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nearestCommonIsa #$France #$Spain ?WHAT)") });
        $const57$nearestCommonGenls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestCommonGenls"));
        $list58 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COL1"), (SubLObject)SubLObjectFactory.makeSymbol("COL2"), (SubLObject)SubLObjectFactory.makeSymbol("COL3"));
        $sym59$_COL = SubLObjectFactory.makeSymbol("?COL");
        $const60$different = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("different"));
        $kw61$CODE = SubLObjectFactory.makeKeyword("CODE");
        $sym62$MAKE_NEAREST_COMMON_GENLS_SUPPORT = SubLObjectFactory.makeSymbol("MAKE-NEAREST-COMMON-GENLS-SUPPORT");
        $kw63$REMOVAL_NEAREST_COMMON_GENLS_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-NEAREST-COMMON-GENLS-CHECK");
        $list64 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestCommonGenls")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestCommonGenls")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-NEAREST-COMMON-GENLS-CHECK-COST*"), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-NEAREST-COMMON-GENLS-CHECK"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeSymbol("MAKE-NEAREST-COMMON-GENLS-SUPPORT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nearestCommonGenls <fort> <fort> <fort>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nearestCommonGenls #$Beer #$Wine #$AlcoholicBeverage)") });
        $kw65$REMOVAL_NEAREST_COMMON_GENLS_GENERATE = SubLObjectFactory.makeKeyword("REMOVAL-NEAREST-COMMON-GENLS-GENERATE");
        $list66 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestCommonGenls")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestCommonGenls")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*AVERAGE-NEAREST-COMMON-GENLS-COUNT*"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestCommonGenls")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("COL1")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("COL2")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("COL1")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("COL2")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COL1"), (SubLObject)SubLObjectFactory.makeSymbol("COL2")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-NEAREST-COMMON-GENLS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("COL1")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("COL2")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestCommonGenls")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("COL1")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("COL2")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeSymbol("MAKE-NEAREST-COMMON-GENLS-SUPPORT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nearestCommonGenls <fort> <fort> <whatever>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nearestCommonGenls #$Beer #$Wine ?WHAT)") });
        $const67$nearestCommonGenlsOfSet = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestCommonGenlsOfSet"));
        $list68 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET"), (SubLObject)SubLObjectFactory.makeSymbol("GENL"));
        $sym69$MAKE_NEAREST_COMMON_GENLS_OF_SET_SUPPORT = SubLObjectFactory.makeSymbol("MAKE-NEAREST-COMMON-GENLS-OF-SET-SUPPORT");
        $kw70$REMOVAL_NEAREST_COMMON_GENLS_OF_SET_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-NEAREST-COMMON-GENLS-OF-SET-CHECK");
        $list71 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestCommonGenlsOfSet")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestCommonGenlsOfSet")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("EL-EXTENSIONAL-SET-P")), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-NEAREST-COMMON-GENLS-CHECK-COST*"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestCommonGenlsOfSet")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("COL"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("COL")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET"), (SubLObject)SubLObjectFactory.makeSymbol("COL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-NEAREST-COMMON-GENLS-OF-SET-CHECK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("EL-EXTENSIONAL-SET-ELEMENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SET"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("COL")))), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeSymbol("MAKE-NEAREST-COMMON-GENLS-OF-SET-SUPPORT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nearestCommonGenlsOfSet <set> <fort>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nearestCommonGenlsOfSet (#$TheSet #$Beer #$Wine) #$AlcoholicBeverage)") });
        $kw72$REMOVAL_NEAREST_COMMON_GENLS_OF_SET_GENERATE = SubLObjectFactory.makeKeyword("REMOVAL-NEAREST-COMMON-GENLS-OF-SET-GENERATE");
        $list73 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestCommonGenlsOfSet")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestCommonGenlsOfSet")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("EL-EXTENSIONAL-SET-P")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*AVERAGE-NEAREST-COMMON-GENLS-COUNT*"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestCommonGenlsOfSet")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SET"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("NEAREST-COMMON-GENLS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("EL-EXTENSIONAL-SET-ELEMENTS"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestCommonGenlsOfSet")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeSymbol("MAKE-NEAREST-COMMON-GENLS-OF-SET-SUPPORT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nearestCommonGenlsOfSet <set> <not-fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nearestCommonGenlsOfSet (#$TheSet #$Beer #$Wine) ?WHAT)") });
        $const74$nearestCommonSpecs = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestCommonSpecs"));
        $kw75$REMOVAL_NEAREST_COMMON_SPECS_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-NEAREST-COMMON-SPECS-CHECK");
        $list76 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestCommonSpecs")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestCommonSpecs")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-NEAREST-COMMON-SPECS-CHECK-COST*"), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-NEAREST-COMMON-SPECS-CHECK"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nearestCommonSpecs <fort> <fort> <fort>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nearestCommonSpecs #$HumanAdult #$MaleAnimal #$AdultMalePerson)") });
        $kw77$REMOVAL_NEAREST_COMMON_SPECS_GENERATE = SubLObjectFactory.makeKeyword("REMOVAL-NEAREST-COMMON-SPECS-GENERATE");
        $list78 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestCommonSpecs")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestCommonSpecs")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*AVERAGE-NEAREST-COMMON-SPECS-COUNT*"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestCommonSpecs")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("COL1")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("COL2")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("COL1")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("COL2")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COL1"), (SubLObject)SubLObjectFactory.makeSymbol("COL2")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-NEAREST-COMMON-SPECS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("COL1")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("COL2")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestCommonSpecs")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("COL1")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("COL2")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nearestCommonSpecs <fort> <fort> <whatever>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nearestCommonSpecs #$HumanAdult #$MaleAnimal ?WHAT)") });
        $const79$nearestCommonGenlMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestCommonGenlMt"));
        $kw80$REMOVAL_NEAREST_COMMON_GENL_MTS_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-NEAREST-COMMON-GENL-MTS-CHECK");
        $list81 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestCommonGenlMt")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestCommonGenlMt")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-NEAREST-COMMON-GENL-MTS-CHECK-COST*"), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-NEAREST-COMMON-GENL-MTS-CHECK-EXPAND"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nearestCommonGenlMt <fort> <fort> <fort>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nearestCommonGenlMt #$FrenchLexicalMt #$GermanLexicalMt #$GeneralLexiconMt)") });
        $kw82$REMOVAL_NEAREST_COMMON_GENL_MTS_GENERATE = SubLObjectFactory.makeKeyword("REMOVAL-NEAREST-COMMON-GENL-MTS-GENERATE");
        $list83 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestCommonGenlMt")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestCommonGenlMt")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*AVERAGE-NEAREST-COMMON-GENL-MTS-COUNT*"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestCommonGenlMt")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("MT1")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("MT2")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("MT1")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("MT2")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT1"), (SubLObject)SubLObjectFactory.makeSymbol("MT2")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-NEAREST-COMMON-GENL-MTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("MT1")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("MT2")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestCommonGenlMt")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("MT1")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("MT2")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nearestCommonGenlMt <fort> <fort> <whatever>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nearestCommonGenlMt #$FrenchLexicalMt #$GermanLexicalMt ?MT)") });
        $const84$nearestCommonSpecMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestCommonSpecMt"));
        $kw85$REMOVAL_NEAREST_COMMON_SPEC_MTS_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-NEAREST-COMMON-SPEC-MTS-CHECK");
        $list86 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestCommonSpecMt")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestCommonSpecMt")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-NEAREST-COMMON-SPEC-MTS-CHECK-COST*"), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-NEAREST-COMMON-SPEC-MTS-CHECK-EXPAND"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nearestCommonSpecMt <fort> <fort> <fort>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nearestCommonSpecMt #$FrenchLexicalMt #$GermanLexicalMt #$AllLexicalMicrotheoryPSC)") });
        $kw87$REMOVAL_NEAREST_COMMON_SPEC_MTS_GENERATE = SubLObjectFactory.makeKeyword("REMOVAL-NEAREST-COMMON-SPEC-MTS-GENERATE");
        $list88 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestCommonSpecMt")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestCommonSpecMt")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*AVERAGE-NEAREST-COMMON-SPEC-MTS-COUNT*"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestCommonSpecMt")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("MT1")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("MT2")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("MT1")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("MT2")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT1"), (SubLObject)SubLObjectFactory.makeSymbol("MT2")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-NEAREST-COMMON-SPEC-MTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("MT1")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("MT2")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestCommonSpecMt")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("MT1")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("MT2")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nearestCommonSpecMt <fort> <fort> <whatever>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nearestCommonSpecMt #$FrenchLexicalMt #$GermanLexicalMt ?MT)") });
        $const89$nearestDifferentIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestDifferentIsa"));
        $kw90$REMOVAL_NEAREST_DIFFERENT_ISA_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-NEAREST-DIFFERENT-ISA-CHECK");
        $list91 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestDifferentIsa")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestDifferentIsa")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-NEAREST-DIFFERENT-ISA-CHECK-COST*"), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-NEAREST-DIFFERENT-ISA-CHECK"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nearestDifferentIsa <fort> <fort> <fort>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nearestDifferentIsa #$Canada #$Minnesota-State #$IndependentCountry)") });
        $kw92$REMOVAL_NEAREST_DIFFERENT_ISA_GENERATE = SubLObjectFactory.makeKeyword("REMOVAL-NEAREST-DIFFERENT-ISA-GENERATE");
        $list93 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestDifferentIsa")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestDifferentIsa")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-NEAREST-DIFFERENT-ISA-GENERATE-COST"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestDifferentIsa")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("OBJ1")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("OBJ2")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJ1")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJ2")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJ1"), (SubLObject)SubLObjectFactory.makeSymbol("OBJ2")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-NEAREST-DIFFERENT-ISA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJ1")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJ2")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestDifferentIsa")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJ1")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJ2")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nearestDifferentIsa <fort> <fort> <whatever>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nearestDifferentIsa #$Canada #$Minnesota-State ?WHAT)") });
        $const94$nearestDifferentGenls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestDifferentGenls"));
        $kw95$REMOVAL_NEAREST_DIFFERENT_GENLS_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-NEAREST-DIFFERENT-GENLS-CHECK");
        $list96 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestDifferentGenls")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestDifferentGenls")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-NEAREST-DIFFERENT-GENLS-CHECK-COST*"), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-NEAREST-DIFFERENT-GENLS-CHECK"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nearestDifferentGenls <fort> <fort> <fort>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nearestDifferentGenls #$Wine #$Milk #$AlcoholicBeverage)") });
        $kw97$REMOVAL_NEAREST_DIFFERENT_GENLS_GENERATE = SubLObjectFactory.makeKeyword("REMOVAL-NEAREST-DIFFERENT-GENLS-GENERATE");
        $list98 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestDifferentGenls")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestDifferentGenls")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-NEAREST-DIFFERENT-GENLS-GENERATE-COST"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestDifferentGenls")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("OBJ1")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("OBJ2")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJ1")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJ2")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJ1"), (SubLObject)SubLObjectFactory.makeSymbol("OBJ2")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-NEAREST-DIFFERENT-GENLS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJ1")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJ2")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestDifferentGenls")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJ1")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJ2")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nearestDifferentGenls <fort> <fort> <whatever>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nearestDifferentGenls #$Wine #$Milk ?WHAT)") });
        $const99$nearestIsaOfType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestIsaOfType"));
        $kw100$REMOVAL_NEAREST_ISA_OF_TYPE_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-NEAREST-ISA-OF-TYPE-CHECK");
        $list101 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestIsaOfType")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestIsaOfType")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-NEAREST-ISA-CHECK-COST*"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestIsaOfType")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("TERM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("COL"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TERM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("COL")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("COL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-NEAREST-ISA-OF-TYPE-CHECK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TERM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("COL")))), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeSymbol("MAKE-NEAREST-ISA-OF-TYPE-SUPPORT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nearestIsaOfType <fort-or-naut> <fort-or-naut> <fort>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nearestIsaOfType #$ThomasPynchon #$PersonTypeByOccupation #$Writer)") });
        $kw102$REMOVAL_NEAREST_ISA_OF_TYPE_GENERATE = SubLObjectFactory.makeKeyword("REMOVAL-NEAREST-ISA-OF-TYPE-GENERATE");
        $list103 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestIsaOfType")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestIsaOfType")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-NEAREST-ISA-OF-TYPE-GENERATE-COST"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestIsaOfType")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("TERM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TERM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-NEAREST-ISAS-OF-TYPE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TERM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestIsaOfType")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TERM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeSymbol("MAKE-NEAREST-ISA-OF-TYPE-SUPPORT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nearestIsaOfType <fort-or-naut> <fort-or-naut> <not-fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nearestIsaOfType #$ThomasPynchon #$PersonTypeByOccupation ?WHAT)") });
        $const104$nearestGenlsOfType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestGenlsOfType"));
        $kw105$REMOVAL_NEAREST_GENLS_OF_TYPE_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-NEAREST-GENLS-OF-TYPE-CHECK");
        $list106 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestGenlsOfType")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestGenlsOfType")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-NEAREST-GENLS-CHECK-COST*"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestGenlsOfType")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("SPEC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("GENL"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SPEC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("GENL")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("GENL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-NEAREST-GENLS-OF-TYPE-CHECK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SPEC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("GENL")))), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeSymbol("MAKE-NEAREST-GENLS-OF-TYPE-SUPPORT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nearestGenlsOfType <fort-or-naut> <fort-or-naut> <fort>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nearestGenlsOfType #$Wine #$TangibleStuffCompositionType #$AlcoholicBeverage)") });
        $kw107$REMOVAL_NEAREST_GENLS_OF_TYPE_GENERATE = SubLObjectFactory.makeKeyword("REMOVAL-NEAREST-GENLS-OF-TYPE-GENERATE");
        $list108 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestGenlsOfType")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestGenlsOfType")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-NEAREST-GENLS-OF-TYPE-GENERATE-COST"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestGenlsOfType")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("SPEC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SPEC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-NEAREST-GENLS-OF-TYPE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SPEC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestGenlsOfType")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SPEC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeSymbol("MAKE-NEAREST-GENLS-OF-TYPE-SUPPORT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nearestGenlsOfType <fort-or-naut> <fort-or-naut> <not-fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nearestGenlsOfType #$Wine #$PharmacyProductType ?WHAT)") });
        $const109$nearestArgIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestArgIsa"));
        $kw110$NEAREST_ARG_ISA_UNBOUND_RELATION_AND_COLLECTION_POS = SubLObjectFactory.makeKeyword("NEAREST-ARG-ISA-UNBOUND-RELATION-AND-COLLECTION-POS");
        $list111 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestArgIsa")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestArgIsa")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE"), (SubLObject)SubLObjectFactory.makeSymbol("MUST-BIND-ARG1-OR-ARG3"));
        $kw112$REMOVAL_NEAREST_ARG_ISA_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-NEAREST-ARG-ISA-CHECK");
        $list113 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestArgIsa")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestArgIsa")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*HL-MODULE-CHECK-COST*"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestArgIsa")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("RELATION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-NUM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-ISA"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("RELATION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-NUM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-ISA")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RELATION"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-NUM"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-ISA")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-NEAREST-ARG-ISA-CHECK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("RELATION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-NUM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-ISA")))), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeSymbol("MAKE-NEAREST-ARG-ISA-SUPPORT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nearestArgIsa <fort> <integer> <fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nearestArgIsa #$geographicallySubsumes 1 #$GeographicalThing)") });
        $kw114$REMOVAL_NEAREST_ARG_ISA_GENERATE = SubLObjectFactory.makeKeyword("REMOVAL-NEAREST-ARG-ISA-GENERATE");
        $list115 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestArgIsa")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestArgIsa")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-NEAREST-ARG-ISA-GENERATE-COST"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestArgIsa")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("RELATION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-NUM")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("RELATION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-NUM")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RELATION"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-NUM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-NEAREST-ARG-ISA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("RELATION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-NUM")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestArgIsa")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("RELATION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-NUM")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeSymbol("MAKE-NEAREST-ARG-ISA-SUPPORT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nearestArgIsa <fort> <integer> <not-fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nearestArgIsa #$geographicallySubsumes 1 ?WHAT)") });
        $const116$argIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argIsa"));
        $kw117$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw118$REMOVAL_NEAREST_ARG_ISA_GENERATE_REVERSE = SubLObjectFactory.makeKeyword("REMOVAL-NEAREST-ARG-ISA-GENERATE-REVERSE");
        $list119 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestArgIsa")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestArgIsa")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-NEAREST-ARG-ISA-GENERATE-REVERSE-COST"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestArgIsa")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-NUM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("COL"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-NUM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("COL")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARG-NUM"), (SubLObject)SubLObjectFactory.makeSymbol("COL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-NEAREST-ARG-ISA-REVERSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-NUM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("COL")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestArgIsa")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-NUM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("COL"))), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeSymbol("MAKE-NEAREST-ARG-ISA-SUPPORT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nearestArgIsa <not-fully-bound> <integer> <fort>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nearestArgIsa ?WHAT 1 #$GeographicalThing)") });
        $sym120$INFERENCE_NEAREST_ARG_ISA_REVERSE_ITERATOR_DONE = SubLObjectFactory.makeSymbol("INFERENCE-NEAREST-ARG-ISA-REVERSE-ITERATOR-DONE");
        $sym121$INFERENCE_NEAREST_ARG_ISA_REVERSE_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("INFERENCE-NEAREST-ARG-ISA-REVERSE-ITERATOR-NEXT");
        $sym122$INFERENCE_NEAREST_ARG_ISA_REVERSE_ITERATOR_FINALIZE = SubLObjectFactory.makeSymbol("INFERENCE-NEAREST-ARG-ISA-REVERSE-ITERATOR-FINALIZE");
        $const123$Relation = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Relation"));
        $list124 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED-ITERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-NUM"), (SubLObject)SubLObjectFactory.makeSymbol("COL"));
        $const125$nearestArgGenl = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestArgGenl"));
        $kw126$NEAREST_ARG_GENL_UNBOUND_RELATION_AND_COLLECTION_POS = SubLObjectFactory.makeKeyword("NEAREST-ARG-GENL-UNBOUND-RELATION-AND-COLLECTION-POS");
        $list127 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestArgGenl")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestArgGenl")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE"), (SubLObject)SubLObjectFactory.makeSymbol("MUST-BIND-ARG1-OR-ARG3"));
        $kw128$REMOVAL_NEAREST_ARG_GENL_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-NEAREST-ARG-GENL-CHECK");
        $list129 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestArgGenl")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestArgGenl")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*HL-MODULE-CHECK-COST*"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestArgGenl")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("RELATION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-NUM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-GENL"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("RELATION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-NUM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-GENL")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RELATION"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-NUM"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-GENL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-NEAREST-ARG-GENL-CHECK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("RELATION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-NUM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-GENL")))), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeSymbol("MAKE-NEAREST-ARG-GENL-SUPPORT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nearestArgGenl <fort> <integer> <fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nearestArgGenl #$transportees-Type 1 #$GeographicalThing)") });
        $kw130$REMOVAL_NEAREST_ARG_GENL_GENERATE = SubLObjectFactory.makeKeyword("REMOVAL-NEAREST-ARG-GENL-GENERATE");
        $list131 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestArgGenl")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestArgGenl")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-NEAREST-ARG-GENL-GENERATE-COST"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestArgGenl")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("RELATION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-NUM")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("RELATION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-NUM")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RELATION"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-NUM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-NEAREST-ARG-GENL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("RELATION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-NUM")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestArgGenl")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("RELATION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-NUM")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeSymbol("MAKE-NEAREST-ARG-GENL-SUPPORT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nearestArgGenl <fort> <integer> <not-fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nearestArgGenl #$transportees-Type 1 ?WHAT)") });
        $const132$argGenl = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argGenl"));
        $kw133$REMOVAL_NEAREST_ARG_GENL_GENERATE_REVERSE = SubLObjectFactory.makeKeyword("REMOVAL-NEAREST-ARG-GENL-GENERATE-REVERSE");
        $list134 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestArgGenl")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestArgGenl")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-NEAREST-ARG-GENL-GENERATE-REVERSE-COST"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestArgGenl")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-NUM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("COL"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-NUM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("COL")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARG-NUM"), (SubLObject)SubLObjectFactory.makeSymbol("COL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-NEAREST-ARG-GENL-REVERSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-NUM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("COL")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestArgGenl")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-NUM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("COL"))), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeSymbol("MAKE-NEAREST-ARG-GENL-SUPPORT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nearestArgGenl <not-fully-bound> <integer> <fort>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nearestArgGenl ?WHAT 1 #$GeographicalThing)") });
        $sym135$INFERENCE_NEAREST_ARG_GENL_REVERSE_ITERATOR_DONE = SubLObjectFactory.makeSymbol("INFERENCE-NEAREST-ARG-GENL-REVERSE-ITERATOR-DONE");
        $sym136$INFERENCE_NEAREST_ARG_GENL_REVERSE_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("INFERENCE-NEAREST-ARG-GENL-REVERSE-ITERATOR-NEXT");
        $sym137$INFERENCE_NEAREST_ARG_GENL_REVERSE_ITERATOR_FINALIZE = SubLObjectFactory.makeSymbol("INFERENCE-NEAREST-ARG-GENL-REVERSE-ITERATOR-FINALIZE");
        $int138$10000 = SubLObjectFactory.makeInteger(10000);
        $int139$212 = SubLObjectFactory.makeInteger(212);
        $sym140$NUMBERP = SubLObjectFactory.makeSymbol("NUMBERP");
        $const141$nearNarrowSpecs = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearNarrowSpecs"));
        $kw142$NEAR_NARROW_SPECS_GENERATE_POS = SubLObjectFactory.makeKeyword("NEAR-NARROW-SPECS-GENERATE-POS");
        $list143 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearNarrowSpecs")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearNarrowSpecs")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE"), (SubLObject)SubLObjectFactory.makeSymbol("MUST-BIND-ARG1"));
        $list144 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearNarrowSpecs")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearNarrowSpecs")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-NEAR-NARROW-SPECS-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("GROSSLY-INCOMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearNarrowSpecs")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTION")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTION"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-NEAR-NARROW-SPECS-ITERATOR"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearNarrowSpecs")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTION")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nearNarrowSpecs <fort> <not-fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nearNarrowSpecs #$Animal ?WHAT)") });
        $kw145$NEAR_NARROW_SPECS_CHECK_POS = SubLObjectFactory.makeKeyword("NEAR-NARROW-SPECS-CHECK-POS");
        $list146 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearNarrowSpecs")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearNarrowSpecs")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-NEAR-NARROW-SPECS-CHECK-POS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$nearNarrowSpecs <fort> <fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nearNarrowSpecs #$Animal #$Dog)") });
        $const147$thresholdSpecs = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thresholdSpecs"));
        $list148 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thresholdSpecs")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thresholdSpecs")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE"), (SubLObject)SubLObjectFactory.makeSymbol("MUST-BIND-ARG1"));
        $const149$includeInThresholdSpecs = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("includeInThresholdSpecs"));
        $const150$excludeFromThresholdSpecs = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("excludeFromThresholdSpecs"));
        $kw151$THRESHOLD_SPECS_GENERATE_POS = SubLObjectFactory.makeKeyword("THRESHOLD-SPECS-GENERATE-POS");
        $list152 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thresholdSpecs")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thresholdSpecs")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-THRESHOLD-SPECS-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("GROSSLY-INCOMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thresholdSpecs")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTION")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTION"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-THRESHOLD-SPECS-ITERATOR"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thresholdSpecs")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTION")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$thresholdSpecs <fort> <not-fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$thresholdSpecs #$Animal ?WHAT)") });
        $kw153$THRESHOLD_SPECS_CHECK_POS = SubLObjectFactory.makeKeyword("THRESHOLD-SPECS-CHECK-POS");
        $list154 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thresholdSpecs")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thresholdSpecs")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-THRESHOLD-SPECS-CHECK-POS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$thresholdSpecs <fort> <fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$thresholdSpecs #$Animal #$Dog)") });
    }
}

/*

	Total time: 1008 ms
	
*/