package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.backward;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_genlmt extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlmt";
    public static final String myFingerPrint = "52c3b1afae129193be9aa85bd3cf1ef3f9f74ca81b8d6867c9e1a1fcbc2e40e1";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlmt.lisp", position = 1185L)
    private static SubLSymbol $default_genlmt_check_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlmt.lisp", position = 4349L)
    private static SubLSymbol $default_not_genlmt_check_cost$;
    private static final SubLObject $const0$genlMt;
    private static final SubLSymbol $kw1$POS;
    private static final SubLSymbol $kw2$NEG;
    private static final SubLList $list3;
    private static final SubLSymbol $kw4$GENLMT;
    private static final SubLList $list5;
    private static final SubLSymbol $kw6$REMOVAL_GENLMT_CHECK;
    private static final SubLList $list7;
    private static final SubLSymbol $kw8$REMOVAL_ALL_GENLMT;
    private static final SubLList $list9;
    private static final SubLSymbol $kw10$REMOVAL_ALL_SPEC_MTS;
    private static final SubLList $list11;
    private static final SubLSymbol $kw12$MINIMIZE;
    private static final SubLSymbol $kw13$REMOVAL_NOT_GENLMT_CHECK;
    private static final SubLList $list14;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlmt.lisp", position = 679L)
    public static SubLObject possibly_make_query_mt_support(final SubLObject query_mt, final SubLObject support_mt) {
        if (removal_modules_genlmt.NIL != query_mt && removal_modules_genlmt.NIL == subl_promotions.memberP(query_mt, (SubLObject)removal_modules_genlmt.$list3, (SubLObject)removal_modules_genlmt.UNPROVIDED, (SubLObject)removal_modules_genlmt.UNPROVIDED) && removal_modules_genlmt.NIL == subl_promotions.memberP(support_mt, (SubLObject)removal_modules_genlmt.$list3, (SubLObject)removal_modules_genlmt.UNPROVIDED, (SubLObject)removal_modules_genlmt.UNPROVIDED)) {
            final SubLObject genl_mt_support = make_genl_mt_support(query_mt, support_mt);
            return genl_mt_support;
        }
        return (SubLObject)removal_modules_genlmt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlmt.lisp", position = 1004L)
    public static SubLObject make_genl_mt_support(final SubLObject spec_mt, final SubLObject genl_mt) {
        final SubLObject sentence = el_utilities.make_binary_formula(removal_modules_genlmt.$const0$genlMt, spec_mt, genl_mt);
        return arguments.make_hl_support((SubLObject)removal_modules_genlmt.$kw4$GENLMT, sentence, mt_vars.$mt_mt$.getGlobalValue(), (SubLObject)removal_modules_genlmt.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlmt.lisp", position = 1336L)
    public static SubLObject removal_genlmt_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_genlmt.UNPROVIDED) {
            sense = (SubLObject)removal_modules_genlmt.NIL;
        }
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, (SubLObject)removal_modules_genlmt.UNPROVIDED);
        SubLObject spec_mt = (SubLObject)removal_modules_genlmt.NIL;
        SubLObject genl_mt = (SubLObject)removal_modules_genlmt.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_genlmt.$list5);
        spec_mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_genlmt.$list5);
        genl_mt = current.first();
        current = current.rest();
        if (removal_modules_genlmt.NIL == current) {
            if (removal_modules_genlmt.NIL != inference_genl_mtP(spec_mt, genl_mt)) {
                backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_genlmt.$kw4$GENLMT, asent, (SubLObject)removal_modules_genlmt.UNPROVIDED, (SubLObject)removal_modules_genlmt.UNPROVIDED), (SubLObject)removal_modules_genlmt.UNPROVIDED, (SubLObject)removal_modules_genlmt.UNPROVIDED);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_genlmt.$list5);
        }
        return (SubLObject)removal_modules_genlmt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlmt.lisp", position = 1944L)
    public static SubLObject inference_genl_mtP(final SubLObject spec_mt, final SubLObject genl_mt) {
        return (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlmt.NIL != hlmt.hlmtP(spec_mt) && removal_modules_genlmt.NIL != hlmt.hlmtP(genl_mt) && removal_modules_genlmt.NIL != genl_mts.genl_mtP(spec_mt, genl_mt, (SubLObject)removal_modules_genlmt.UNPROVIDED, (SubLObject)removal_modules_genlmt.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlmt.lisp", position = 2099L)
    public static SubLObject removal_all_genlmt_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_genlmt.UNPROVIDED) {
            sense = (SubLObject)removal_modules_genlmt.NIL;
        }
        return cardinality_estimates.genl_cardinality(cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_genlmt.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlmt.lisp", position = 2308L)
    public static SubLObject removal_all_genlmt_iterator(final SubLObject spec_hlmt) {
        return iteration.new_list_iterator(inference_all_genl_mts(spec_hlmt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlmt.lisp", position = 3113L)
    public static SubLObject inference_all_genl_mts(final SubLObject mt) {
        if (removal_modules_genlmt.NIL != hlmt.hlmtP(mt)) {
            return genl_mts.all_genl_mts(mt, (SubLObject)removal_modules_genlmt.UNPROVIDED, (SubLObject)removal_modules_genlmt.UNPROVIDED);
        }
        return (SubLObject)removal_modules_genlmt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlmt.lisp", position = 3222L)
    public static SubLObject removal_all_spec_mts_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_genlmt.UNPROVIDED) {
            sense = (SubLObject)removal_modules_genlmt.NIL;
        }
        return cardinality_estimates.spec_cardinality(cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_genlmt.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlmt.lisp", position = 3439L)
    public static SubLObject removal_all_spec_mts_iterator(final SubLObject genl_mt) {
        return iteration.new_list_iterator(inference_all_spec_mts(genl_mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlmt.lisp", position = 4240L)
    public static SubLObject inference_all_spec_mts(final SubLObject mt) {
        if (removal_modules_genlmt.NIL != hlmt.hlmtP(mt)) {
            return genl_mts.all_spec_mts(mt, (SubLObject)removal_modules_genlmt.UNPROVIDED, (SubLObject)removal_modules_genlmt.UNPROVIDED);
        }
        return (SubLObject)removal_modules_genlmt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlmt.lisp", position = 4495L)
    public static SubLObject removal_not_genlmt_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_genlmt.UNPROVIDED) {
            sense = (SubLObject)removal_modules_genlmt.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, (SubLObject)removal_modules_genlmt.UNPROVIDED);
        SubLObject spec_mt = (SubLObject)removal_modules_genlmt.NIL;
        SubLObject genl_mt = (SubLObject)removal_modules_genlmt.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_genlmt.$list5);
        spec_mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_genlmt.$list5);
        genl_mt = current.first();
        current = current.rest();
        if (removal_modules_genlmt.NIL == current) {
            if (removal_modules_genlmt.NIL != control_vars.$negation_by_failure$.getDynamicValue(thread) && removal_modules_genlmt.NIL == inference_genl_mtP(spec_mt, genl_mt)) {
                backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_genlmt.$kw12$MINIMIZE, cycl_utilities.negate(asent), (SubLObject)removal_modules_genlmt.UNPROVIDED, (SubLObject)removal_modules_genlmt.UNPROVIDED), (SubLObject)removal_modules_genlmt.UNPROVIDED, (SubLObject)removal_modules_genlmt.UNPROVIDED);
            }
            else if (removal_modules_genlmt.NIL != inference_not_genl_mtP(spec_mt, genl_mt)) {
                backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_genlmt.$kw4$GENLMT, cycl_utilities.negate(asent), (SubLObject)removal_modules_genlmt.UNPROVIDED, (SubLObject)removal_modules_genlmt.UNPROVIDED), (SubLObject)removal_modules_genlmt.UNPROVIDED, (SubLObject)removal_modules_genlmt.UNPROVIDED);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_genlmt.$list5);
        }
        return (SubLObject)removal_modules_genlmt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlmt.lisp", position = 5283L)
    public static SubLObject inference_not_genl_mtP(final SubLObject spec_mt, final SubLObject genl_mt) {
        return (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genlmt.NIL != hlmt.hlmtP(spec_mt) && removal_modules_genlmt.NIL != hlmt.hlmtP(genl_mt) && removal_modules_genlmt.NIL != genl_mts.not_genl_mtP(spec_mt, genl_mt, (SubLObject)removal_modules_genlmt.UNPROVIDED, (SubLObject)removal_modules_genlmt.UNPROVIDED));
    }
    
    public static SubLObject declare_removal_modules_genlmt_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlmt", "possibly_make_query_mt_support", "POSSIBLY-MAKE-QUERY-MT-SUPPORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlmt", "make_genl_mt_support", "MAKE-GENL-MT-SUPPORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlmt", "removal_genlmt_check_expand", "REMOVAL-GENLMT-CHECK-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlmt", "inference_genl_mtP", "INFERENCE-GENL-MT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlmt", "removal_all_genlmt_cost", "REMOVAL-ALL-GENLMT-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlmt", "removal_all_genlmt_iterator", "REMOVAL-ALL-GENLMT-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlmt", "inference_all_genl_mts", "INFERENCE-ALL-GENL-MTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlmt", "removal_all_spec_mts_cost", "REMOVAL-ALL-SPEC-MTS-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlmt", "removal_all_spec_mts_iterator", "REMOVAL-ALL-SPEC-MTS-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlmt", "inference_all_spec_mts", "INFERENCE-ALL-SPEC-MTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlmt", "removal_not_genlmt_check_expand", "REMOVAL-NOT-GENLMT-CHECK-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlmt", "inference_not_genl_mtP", "INFERENCE-NOT-GENL-MT?", 2, 0, false);
        return (SubLObject)removal_modules_genlmt.NIL;
    }
    
    public static SubLObject init_removal_modules_genlmt_file() {
        removal_modules_genlmt.$default_genlmt_check_cost$ = SubLFiles.defparameter("*DEFAULT-GENLMT-CHECK-COST*", control_vars.$hl_module_check_cost$.getDynamicValue());
        removal_modules_genlmt.$default_not_genlmt_check_cost$ = SubLFiles.defparameter("*DEFAULT-NOT-GENLMT-CHECK-COST*", (SubLObject)removal_modules_genlmt.TWO_INTEGER);
        return (SubLObject)removal_modules_genlmt.NIL;
    }
    
    public static SubLObject setup_removal_modules_genlmt_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_genlmt.$const0$genlMt);
        preference_modules.doomed_unless_either_arg_bindable((SubLObject)removal_modules_genlmt.$kw1$POS, removal_modules_genlmt.$const0$genlMt);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_genlmt.$kw2$NEG, removal_modules_genlmt.$const0$genlMt);
        inference_modules.inference_removal_module((SubLObject)removal_modules_genlmt.$kw6$REMOVAL_GENLMT_CHECK, (SubLObject)removal_modules_genlmt.$list7);
        inference_modules.inference_removal_module((SubLObject)removal_modules_genlmt.$kw8$REMOVAL_ALL_GENLMT, (SubLObject)removal_modules_genlmt.$list9);
        inference_modules.inference_removal_module((SubLObject)removal_modules_genlmt.$kw10$REMOVAL_ALL_SPEC_MTS, (SubLObject)removal_modules_genlmt.$list11);
        inference_modules.inference_removal_module((SubLObject)removal_modules_genlmt.$kw13$REMOVAL_NOT_GENLMT_CHECK, (SubLObject)removal_modules_genlmt.$list14);
        return (SubLObject)removal_modules_genlmt.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_removal_modules_genlmt_file();
    }
    
    @Override
	public void initializeVariables() {
        init_removal_modules_genlmt_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_removal_modules_genlmt_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_genlmt();
        removal_modules_genlmt.$default_genlmt_check_cost$ = null;
        removal_modules_genlmt.$default_not_genlmt_check_cost$ = null;
        $const0$genlMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt"));
        $kw1$POS = SubLObjectFactory.makeKeyword("POS");
        $kw2$NEG = SubLObjectFactory.makeKeyword("NEG");
        $list3 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC")));
        $kw4$GENLMT = SubLObjectFactory.makeKeyword("GENLMT");
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEC-MT"), (SubLObject)SubLObjectFactory.makeSymbol("GENL-MT"));
        $kw6$REMOVAL_GENLMT_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-GENLMT-CHECK");
        $list7 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt")), (SubLObject)SubLObjectFactory.makeKeyword("CLOSED-HLMT"), (SubLObject)SubLObjectFactory.makeKeyword("CLOSED-HLMT")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-GENLMT-CHECK-COST*"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-GENLMT-CHECK-EXPAND"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$genlMt #$GermanLexicalMt #$CrossLinguisticLexicalMt)") });
        $kw8$REMOVAL_ALL_GENLMT = SubLObjectFactory.makeKeyword("REMOVAL-ALL-GENLMT");
        $list9 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt")), (SubLObject)SubLObjectFactory.makeKeyword("CLOSED-HLMT"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-ALL-GENLMT-COST"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("SPEC-HLMT")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SPEC-HLMT"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-ALL-GENLMT-ITERATOR"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SPEC-HLMT")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("GENLMT"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("DEFAULT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$genlMt <closed-hlmt> <not-fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$genlMt #$GermanLexicalMt ?GENL-MT)") });
        $kw10$REMOVAL_ALL_SPEC_MTS = SubLObjectFactory.makeKeyword("REMOVAL-ALL-SPEC-MTS");
        $list11 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("CLOSED-HLMT")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-ALL-SPEC-MTS-COST"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("GENL-MT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("GENL-MT"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-ALL-SPEC-MTS-ITERATOR"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("GENL-MT"))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("GENLMT"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("DEFAULT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$genlMt <not-fully-bound> <closed-hlmt>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$genlMt ?SPEC-MT #$GermanLexicalMt)") });
        $kw12$MINIMIZE = SubLObjectFactory.makeKeyword("MINIMIZE");
        $kw13$REMOVAL_NOT_GENLMT_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-NOT-GENLMT-CHECK");
        $list14 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt")), (SubLObject)SubLObjectFactory.makeKeyword("CLOSED-HLMT"), (SubLObject)SubLObjectFactory.makeKeyword("CLOSED-HLMT")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-NOT-GENLMT-CHECK-COST*"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-NOT-GENLMT-CHECK-EXPAND") });
    }
}

/*

	Total time: 94 ms
	
*/