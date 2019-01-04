package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class mt_vars extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.mt_vars";
    public static final String myFingerPrint = "c8287c48409ed3a8f507cd9ca0c0edf59042fe6e2f6a254799f980503958c33d";
    @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 858L)
    public static SubLSymbol $mt_var_basis_table$;
    @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 1969L)
    public static SubLSymbol $mt_root$;
    @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 2099L)
    public static SubLSymbol $theory_mt_root$;
    @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 2259L)
    public static SubLSymbol $assertible_mt_root$;
    @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 2400L)
    public static SubLSymbol $assertible_theory_mt_root$;
    @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 2559L)
    public static SubLSymbol $core_mt_floor$;
    @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 2673L)
    public static SubLSymbol $mt_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 3218L)
    public static SubLSymbol $defining_mt_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 3389L)
    public static SubLSymbol $decontextualized_predicate_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 3545L)
    public static SubLSymbol $decontextualized_collection_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 3704L)
    public static SubLSymbol $ephemeral_term_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 3819L)
    public static SubLSymbol $ist_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 4070L)
    public static SubLSymbol $inference_related_bookkeeping_predicate_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 4307L)
    public static SubLSymbol $anect_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 4670L)
    public static SubLSymbol $broad_mt_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 4822L)
    public static SubLSymbol $psc_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 4951L)
    public static SubLSymbol $tou_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 5122L)
    public static SubLSymbol $skolem_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 5220L)
    public static SubLSymbol $thing_defining_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 5362L)
    public static SubLSymbol $relation_defining_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 5490L)
    public static SubLSymbol $equals_defining_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 5616L)
    public static SubLSymbol $element_of_defining_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 5738L)
    public static SubLSymbol $subset_of_defining_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 5855L)
    public static SubLSymbol $arity_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 6053L)
    public static SubLSymbol $sublid_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 6220L)
    public static SubLSymbol $not_assertible_mt_convention_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 6371L)
    public static SubLSymbol $default_ask_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 6482L)
    public static SubLSymbol $default_assert_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 6564L)
    public static SubLSymbol $default_clone_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 6702L)
    public static SubLSymbol $default_support_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 6852L)
    public static SubLSymbol $default_comment_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 6963L)
    public static SubLSymbol $default_convention_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 7269L)
    public static SubLSymbol $core_mt_optimization_enabledP$;
    @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 7551L)
    private static SubLSymbol $core_mts$;
    @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 8332L)
    private static SubLSymbol $ordered_core_mts$;
    @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 9929L)
    private static SubLSymbol $special_loop_core_mts$;
    private static final SubLList $list0;
    private static final SubLString $str1$Illegal_basis_argument_to_defglob;
    private static final SubLSymbol $sym2$PROGN;
    private static final SubLSymbol $sym3$DEFGLOBAL_PROTECTED;
    private static final SubLSymbol $sym4$NOTE_MT_VAR;
    private static final SubLSymbol $sym5$QUOTE;
    private static final SubLSymbol $sym6$_MT_ROOT_;
    private static final SubLObject $const7$BaseKB;
    private static final SubLSymbol $sym8$_THEORY_MT_ROOT_;
    private static final SubLSymbol $sym9$_ASSERTIBLE_MT_ROOT_;
    private static final SubLSymbol $sym10$_ASSERTIBLE_THEORY_MT_ROOT_;
    private static final SubLSymbol $sym11$_CORE_MT_FLOOR_;
    private static final SubLSymbol $sym12$_MT_MT_;
    private static final SubLObject $const13$UniversalVocabularyMt;
    private static final SubLObject $const14$Microtheory;
    private static final SubLSymbol $sym15$_DEFINING_MT_MT_;
    private static final SubLObject $const16$definingMt;
    private static final SubLSymbol $sym17$_DECONTEXTUALIZED_PREDICATE_MT_;
    private static final SubLObject $const18$decontextualizedPredicate;
    private static final SubLSymbol $sym19$_DECONTEXTUALIZED_COLLECTION_MT_;
    private static final SubLObject $const20$decontextualizedCollection;
    private static final SubLSymbol $sym21$_EPHEMERAL_TERM_MT_;
    private static final SubLObject $const22$ephemeralTerm;
    private static final SubLSymbol $sym23$_IST_MT_;
    private static final SubLObject $const24$ist;
    private static final SubLSymbol $sym25$_INFERENCE_RELATED_BOOKKEEPING_PREDICATE_MT_;
    private static final SubLObject $const26$InferenceRelatedBookkeepingPredic;
    private static final SubLSymbol $sym27$_ANECT_MT_;
    private static final SubLObject $const28$AtemporalNecessarilyEssentialColl;
    private static final SubLSymbol $sym29$_BROAD_MT_MT_;
    private static final SubLObject $const30$BroadMicrotheory;
    private static final SubLSymbol $sym31$_PSC_MT_;
    private static final SubLObject $const32$ProblemSolvingCntxt;
    private static final SubLSymbol $sym33$_TOU_MT_;
    private static final SubLObject $const34$termOfUnit;
    private static final SubLSymbol $sym35$_SKOLEM_MT_;
    private static final SubLObject $const36$skolem;
    private static final SubLSymbol $sym37$_THING_DEFINING_MT_;
    private static final SubLObject $const38$Thing;
    private static final SubLSymbol $sym39$_RELATION_DEFINING_MT_;
    private static final SubLObject $const40$Relation;
    private static final SubLSymbol $sym41$_EQUALS_DEFINING_MT_;
    private static final SubLObject $const42$equals;
    private static final SubLSymbol $sym43$_ELEMENT_OF_DEFINING_MT_;
    private static final SubLObject $const44$elementOf;
    private static final SubLSymbol $sym45$_SUBSET_OF_DEFINING_MT_;
    private static final SubLObject $const46$subsetOf;
    private static final SubLSymbol $sym47$_ARITY_MT_;
    private static final SubLObject $const48$arity;
    private static final SubLSymbol $sym49$_SUBLID_MT_;
    private static final SubLObject $const50$CycAPIMt;
    private static final SubLObject $const51$subLIdentifier;
    private static final SubLSymbol $sym52$_NOT_ASSERTIBLE_MT_CONVENTION_MT_;
    private static final SubLObject $const53$notAssertibleMt;
    private static final SubLSymbol $sym54$_DEFAULT_ASK_MT_;
    private static final SubLSymbol $sym55$_DEFAULT_ASSERT_MT_;
    private static final SubLSymbol $sym56$_DEFAULT_CLONE_MT_;
    private static final SubLSymbol $sym57$_DEFAULT_SUPPORT_MT_;
    private static final SubLSymbol $sym58$_DEFAULT_COMMENT_MT_;
    private static final SubLSymbol $sym59$_DEFAULT_CONVENTION_MT_;
    private static final SubLList $list60;
    private static final SubLList $list61;
    private static final SubLList $list62;
    private static final SubLSymbol $sym63$CORE_MICROTHEORY_P;
    private static final SubLSymbol $sym64$CORE_MICROTHEORY__;
    private static final SubLSymbol $sym65$CORE_MICROTHEORY__;
    private static final SubLSymbol $sym66$SETS_EQUAL_;
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 956L)
    public static SubLObject defglobal_mt_var(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject var = (SubLObject)mt_vars.NIL;
        SubLObject v_default = (SubLObject)mt_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mt_vars.$list0);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mt_vars.$list0);
        v_default = current.first();
        current = current.rest();
        final SubLObject basis = (SubLObject)(current.isCons() ? current.first() : mt_vars.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)mt_vars.$list0);
        current = current.rest();
        final SubLObject comment = (SubLObject)(current.isCons() ? current.first() : mt_vars.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)mt_vars.$list0);
        current = current.rest();
        if (mt_vars.NIL == current) {
            if (mt_vars.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && basis.isString()) {
                Errors.error((SubLObject)mt_vars.$str1$Illegal_basis_argument_to_defglob, basis);
            }
            return (SubLObject)ConsesLow.list((SubLObject)mt_vars.$sym2$PROGN, (SubLObject)ConsesLow.list((SubLObject)mt_vars.$sym3$DEFGLOBAL_PROTECTED, var, v_default, comment), (SubLObject)ConsesLow.list((SubLObject)mt_vars.$sym4$NOTE_MT_VAR, (SubLObject)ConsesLow.list((SubLObject)mt_vars.$sym5$QUOTE, var), basis));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)mt_vars.$list0);
        return (SubLObject)mt_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 1679L)
    public static SubLObject note_mt_var(final SubLObject var, SubLObject basis) {
        if (basis == mt_vars.UNPROVIDED) {
            basis = (SubLObject)mt_vars.NIL;
        }
        if (mt_vars.NIL != basis) {
            note_mt_var_basis(var, basis);
        }
        return (SubLObject)mt_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 1863L)
    public static SubLObject note_mt_var_basis(final SubLObject var, final SubLObject basis) {
        return dictionary.dictionary_enter(mt_vars.$mt_var_basis_table$.getGlobalValue(), var, basis);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 7162L)
    public static SubLObject mt_mt_relevantP(final SubLObject mt) {
        return genl_mts.genl_mtP(mt_vars.$mt_mt$.getGlobalValue(), mt, (SubLObject)mt_vars.UNPROVIDED, (SubLObject)mt_vars.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 8700L)
    public static SubLObject core_microtheory_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, mt_vars.$core_mts$.getGlobalValue(), (SubLObject)mt_vars.UNPROVIDED, (SubLObject)mt_vars.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 8831L)
    public static SubLObject core_microtheory_L(final SubLObject mt1, final SubLObject mt2) {
        final SubLObject level1 = list_utilities.alist_lookup_without_values(mt_vars.$ordered_core_mts$.getGlobalValue(), mt1, (SubLObject)mt_vars.UNPROVIDED, (SubLObject)mt_vars.UNPROVIDED);
        final SubLObject level2 = list_utilities.alist_lookup_without_values(mt_vars.$ordered_core_mts$.getGlobalValue(), mt2, (SubLObject)mt_vars.UNPROVIDED, (SubLObject)mt_vars.UNPROVIDED);
        if (level1.isInteger() && level2.isInteger()) {
            return Numbers.numLE(level2, level1);
        }
        return (SubLObject)mt_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 9198L)
    public static SubLObject core_microtheory_G(final SubLObject mt1, final SubLObject mt2) {
        final SubLObject level1 = list_utilities.alist_lookup_without_values(mt_vars.$ordered_core_mts$.getGlobalValue(), mt1, (SubLObject)mt_vars.UNPROVIDED, (SubLObject)mt_vars.UNPROVIDED);
        final SubLObject level2 = list_utilities.alist_lookup_without_values(mt_vars.$ordered_core_mts$.getGlobalValue(), mt2, (SubLObject)mt_vars.UNPROVIDED, (SubLObject)mt_vars.UNPROVIDED);
        if (level1.isInteger() && level2.isInteger()) {
            return Numbers.numLE(level1, level2);
        }
        return (SubLObject)mt_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 9566L)
    public static SubLObject core_genl_mtP(final SubLObject mt1, final SubLObject mt2) {
        if (mt_vars.NIL != special_core_loop_mt_p(mt1) && mt_vars.NIL != special_core_loop_mt_p(mt2)) {
            return (SubLObject)mt_vars.T;
        }
        return core_microtheory_G(mt1, mt2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 9789L)
    public static SubLObject core_any_genl_mtP(final SubLObject spec, final SubLObject v_genls) {
        SubLObject cdolist_list_var = v_genls;
        SubLObject genl = (SubLObject)mt_vars.NIL;
        genl = cdolist_list_var.first();
        while (mt_vars.NIL != cdolist_list_var) {
            if (mt_vars.NIL != core_genl_mtP(spec, genl)) {
                return (SubLObject)mt_vars.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            genl = cdolist_list_var.first();
        }
        return (SubLObject)mt_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 10015L)
    public static SubLObject special_core_loop_mt_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, mt_vars.$special_loop_core_mts$.getGlobalValue(), (SubLObject)mt_vars.UNPROVIDED, (SubLObject)mt_vars.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 10116L)
    public static SubLObject minimize_mts_wrt_core(final SubLObject mts) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject core_mts = list_utilities.partition_list(mts, (SubLObject)mt_vars.$sym63$CORE_MICROTHEORY_P);
        final SubLObject non_core_mts = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (mt_vars.NIL != non_core_mts) {
            return non_core_mts;
        }
        final SubLObject min_core_mt = list_utilities.extremal(core_mts, (SubLObject)mt_vars.$sym64$CORE_MICROTHEORY__, (SubLObject)mt_vars.UNPROVIDED);
        return removal_module_utilities.non_null_answer_to_singleton(min_core_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 10524L)
    public static SubLObject maximize_mts_wrt_core(final SubLObject mts) {
        final SubLObject core_mts = list_utilities.remove_if_not((SubLObject)mt_vars.$sym63$CORE_MICROTHEORY_P, mts, (SubLObject)mt_vars.UNPROVIDED, (SubLObject)mt_vars.UNPROVIDED, (SubLObject)mt_vars.UNPROVIDED, (SubLObject)mt_vars.UNPROVIDED);
        if (mt_vars.NIL != core_mts) {
            final SubLObject max_core_mt = list_utilities.extremal(core_mts, (SubLObject)mt_vars.$sym65$CORE_MICROTHEORY__, (SubLObject)mt_vars.UNPROVIDED);
            return (SubLObject)ConsesLow.list(max_core_mt);
        }
        return mts;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 10899L)
    public static SubLObject minimize_mt_sets_wrt_core(final SubLObject mt_sets) {
        SubLObject reduced_mt_sets = (SubLObject)mt_vars.NIL;
        SubLObject cdolist_list_var = mt_sets;
        SubLObject mt_set = (SubLObject)mt_vars.NIL;
        mt_set = cdolist_list_var.first();
        while (mt_vars.NIL != cdolist_list_var) {
            final SubLObject item_var;
            final SubLObject reduced_mt_set = item_var = minimize_mts_wrt_core(mt_set);
            if (mt_vars.NIL == conses_high.member(item_var, reduced_mt_sets, Symbols.symbol_function((SubLObject)mt_vars.$sym66$SETS_EQUAL_), Symbols.symbol_function((SubLObject)mt_vars.IDENTITY))) {
                reduced_mt_sets = (SubLObject)ConsesLow.cons(item_var, reduced_mt_sets);
            }
            cdolist_list_var = cdolist_list_var.rest();
            mt_set = cdolist_list_var.first();
        }
        return Sequences.nreverse(reduced_mt_sets);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 11286L)
    public static SubLObject push_core_mts_to_beginning(final SubLObject mts) {
        final SubLObject core_mts = list_utilities.remove_if_not((SubLObject)mt_vars.$sym63$CORE_MICROTHEORY_P, mts, (SubLObject)mt_vars.UNPROVIDED, (SubLObject)mt_vars.UNPROVIDED, (SubLObject)mt_vars.UNPROVIDED, (SubLObject)mt_vars.UNPROVIDED);
        if (mt_vars.NIL != core_mts) {
            final SubLObject non_core_mts = list_utilities.ordered_set_difference(mts, core_mts, (SubLObject)mt_vars.UNPROVIDED, (SubLObject)mt_vars.UNPROVIDED);
            final SubLObject sorted_core_mts = Sort.sort(core_mts, (SubLObject)mt_vars.$sym65$CORE_MICROTHEORY__, (SubLObject)mt_vars.UNPROVIDED);
            final SubLObject sorted_mts = ConsesLow.nconc(sorted_core_mts, non_core_mts);
            return sorted_mts;
        }
        return mts;
    }
    
    public static SubLObject declare_mt_vars_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.mt_vars", "defglobal_mt_var", "DEFGLOBAL-MT-VAR");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_vars", "note_mt_var", "NOTE-MT-VAR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_vars", "note_mt_var_basis", "NOTE-MT-VAR-BASIS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_vars", "mt_mt_relevantP", "MT-MT-RELEVANT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_vars", "core_microtheory_p", "CORE-MICROTHEORY-P", 1, 0, false);
        new $core_microtheory_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_vars", "core_microtheory_L", "CORE-MICROTHEORY-<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_vars", "core_microtheory_G", "CORE-MICROTHEORY->", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_vars", "core_genl_mtP", "CORE-GENL-MT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_vars", "core_any_genl_mtP", "CORE-ANY-GENL-MT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_vars", "special_core_loop_mt_p", "SPECIAL-CORE-LOOP-MT-P", 1, 0, false);
        new $special_core_loop_mt_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_vars", "minimize_mts_wrt_core", "MINIMIZE-MTS-WRT-CORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_vars", "maximize_mts_wrt_core", "MAXIMIZE-MTS-WRT-CORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_vars", "minimize_mt_sets_wrt_core", "MINIMIZE-MT-SETS-WRT-CORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_vars", "push_core_mts_to_beginning", "PUSH-CORE-MTS-TO-BEGINNING", 1, 0, false);
        return (SubLObject)mt_vars.NIL;
    }
    
    public static SubLObject init_mt_vars_file() {
        mt_vars.$mt_var_basis_table$ = SubLFiles.deflexical("*MT-VAR-BASIS-TABLE*", dictionary.new_dictionary(Symbols.symbol_function((SubLObject)mt_vars.EQL), (SubLObject)mt_vars.UNPROVIDED));
        mt_vars.$mt_root$ = SubLFiles.deflexical("*MT-ROOT*", (mt_vars.NIL != Symbols.boundp((SubLObject)mt_vars.$sym6$_MT_ROOT_)) ? mt_vars.$mt_root$.getGlobalValue() : mt_vars.$const7$BaseKB);
        mt_vars.$theory_mt_root$ = SubLFiles.deflexical("*THEORY-MT-ROOT*", (mt_vars.NIL != Symbols.boundp((SubLObject)mt_vars.$sym8$_THEORY_MT_ROOT_)) ? mt_vars.$theory_mt_root$.getGlobalValue() : mt_vars.$const7$BaseKB);
        mt_vars.$assertible_mt_root$ = SubLFiles.deflexical("*ASSERTIBLE-MT-ROOT*", (mt_vars.NIL != Symbols.boundp((SubLObject)mt_vars.$sym9$_ASSERTIBLE_MT_ROOT_)) ? mt_vars.$assertible_mt_root$.getGlobalValue() : mt_vars.$const7$BaseKB);
        mt_vars.$assertible_theory_mt_root$ = SubLFiles.deflexical("*ASSERTIBLE-THEORY-MT-ROOT*", (mt_vars.NIL != Symbols.boundp((SubLObject)mt_vars.$sym10$_ASSERTIBLE_THEORY_MT_ROOT_)) ? mt_vars.$assertible_theory_mt_root$.getGlobalValue() : mt_vars.$const7$BaseKB);
        mt_vars.$core_mt_floor$ = SubLFiles.deflexical("*CORE-MT-FLOOR*", (mt_vars.NIL != Symbols.boundp((SubLObject)mt_vars.$sym11$_CORE_MT_FLOOR_)) ? mt_vars.$core_mt_floor$.getGlobalValue() : mt_vars.$const7$BaseKB);
        mt_vars.$mt_mt$ = SubLFiles.deflexical("*MT-MT*", (mt_vars.NIL != Symbols.boundp((SubLObject)mt_vars.$sym12$_MT_MT_)) ? mt_vars.$mt_mt$.getGlobalValue() : mt_vars.$const13$UniversalVocabularyMt);
        mt_vars.$defining_mt_mt$ = SubLFiles.deflexical("*DEFINING-MT-MT*", (mt_vars.NIL != Symbols.boundp((SubLObject)mt_vars.$sym15$_DEFINING_MT_MT_)) ? mt_vars.$defining_mt_mt$.getGlobalValue() : mt_vars.$const7$BaseKB);
        mt_vars.$decontextualized_predicate_mt$ = SubLFiles.deflexical("*DECONTEXTUALIZED-PREDICATE-MT*", (mt_vars.NIL != Symbols.boundp((SubLObject)mt_vars.$sym17$_DECONTEXTUALIZED_PREDICATE_MT_)) ? mt_vars.$decontextualized_predicate_mt$.getGlobalValue() : mt_vars.$const7$BaseKB);
        mt_vars.$decontextualized_collection_mt$ = SubLFiles.deflexical("*DECONTEXTUALIZED-COLLECTION-MT*", (mt_vars.NIL != Symbols.boundp((SubLObject)mt_vars.$sym19$_DECONTEXTUALIZED_COLLECTION_MT_)) ? mt_vars.$decontextualized_collection_mt$.getGlobalValue() : mt_vars.$const7$BaseKB);
        mt_vars.$ephemeral_term_mt$ = SubLFiles.deflexical("*EPHEMERAL-TERM-MT*", (mt_vars.NIL != Symbols.boundp((SubLObject)mt_vars.$sym21$_EPHEMERAL_TERM_MT_)) ? mt_vars.$ephemeral_term_mt$.getGlobalValue() : mt_vars.$const7$BaseKB);
        mt_vars.$ist_mt$ = SubLFiles.deflexical("*IST-MT*", (mt_vars.NIL != Symbols.boundp((SubLObject)mt_vars.$sym23$_IST_MT_)) ? mt_vars.$ist_mt$.getGlobalValue() : mt_vars.$const7$BaseKB);
        mt_vars.$inference_related_bookkeeping_predicate_mt$ = SubLFiles.deflexical("*INFERENCE-RELATED-BOOKKEEPING-PREDICATE-MT*", (mt_vars.NIL != Symbols.boundp((SubLObject)mt_vars.$sym25$_INFERENCE_RELATED_BOOKKEEPING_PREDICATE_MT_)) ? mt_vars.$inference_related_bookkeeping_predicate_mt$.getGlobalValue() : mt_vars.$const7$BaseKB);
        mt_vars.$anect_mt$ = SubLFiles.deflexical("*ANECT-MT*", (mt_vars.NIL != Symbols.boundp((SubLObject)mt_vars.$sym27$_ANECT_MT_)) ? mt_vars.$anect_mt$.getGlobalValue() : mt_vars.$const13$UniversalVocabularyMt);
        mt_vars.$broad_mt_mt$ = SubLFiles.deflexical("*BROAD-MT-MT*", (mt_vars.NIL != Symbols.boundp((SubLObject)mt_vars.$sym29$_BROAD_MT_MT_)) ? mt_vars.$broad_mt_mt$.getGlobalValue() : mt_vars.$const7$BaseKB);
        mt_vars.$psc_mt$ = SubLFiles.deflexical("*PSC-MT*", (mt_vars.NIL != Symbols.boundp((SubLObject)mt_vars.$sym31$_PSC_MT_)) ? mt_vars.$psc_mt$.getGlobalValue() : mt_vars.$const7$BaseKB);
        mt_vars.$tou_mt$ = SubLFiles.deflexical("*TOU-MT*", (mt_vars.NIL != Symbols.boundp((SubLObject)mt_vars.$sym33$_TOU_MT_)) ? mt_vars.$tou_mt$.getGlobalValue() : mt_vars.$const7$BaseKB);
        mt_vars.$skolem_mt$ = SubLFiles.deflexical("*SKOLEM-MT*", (mt_vars.NIL != Symbols.boundp((SubLObject)mt_vars.$sym35$_SKOLEM_MT_)) ? mt_vars.$skolem_mt$.getGlobalValue() : mt_vars.$const7$BaseKB);
        mt_vars.$thing_defining_mt$ = SubLFiles.deflexical("*THING-DEFINING-MT*", (mt_vars.NIL != Symbols.boundp((SubLObject)mt_vars.$sym37$_THING_DEFINING_MT_)) ? mt_vars.$thing_defining_mt$.getGlobalValue() : mt_vars.$const7$BaseKB);
        mt_vars.$relation_defining_mt$ = SubLFiles.deflexical("*RELATION-DEFINING-MT*", (mt_vars.NIL != Symbols.boundp((SubLObject)mt_vars.$sym39$_RELATION_DEFINING_MT_)) ? mt_vars.$relation_defining_mt$.getGlobalValue() : mt_vars.$const7$BaseKB);
        mt_vars.$equals_defining_mt$ = SubLFiles.deflexical("*EQUALS-DEFINING-MT*", (mt_vars.NIL != Symbols.boundp((SubLObject)mt_vars.$sym41$_EQUALS_DEFINING_MT_)) ? mt_vars.$equals_defining_mt$.getGlobalValue() : mt_vars.$const7$BaseKB);
        mt_vars.$element_of_defining_mt$ = SubLFiles.deflexical("*ELEMENT-OF-DEFINING-MT*", (mt_vars.NIL != Symbols.boundp((SubLObject)mt_vars.$sym43$_ELEMENT_OF_DEFINING_MT_)) ? mt_vars.$element_of_defining_mt$.getGlobalValue() : mt_vars.$const7$BaseKB);
        mt_vars.$subset_of_defining_mt$ = SubLFiles.deflexical("*SUBSET-OF-DEFINING-MT*", (mt_vars.NIL != Symbols.boundp((SubLObject)mt_vars.$sym45$_SUBSET_OF_DEFINING_MT_)) ? mt_vars.$subset_of_defining_mt$.getGlobalValue() : mt_vars.$const7$BaseKB);
        mt_vars.$arity_mt$ = SubLFiles.deflexical("*ARITY-MT*", (mt_vars.NIL != Symbols.boundp((SubLObject)mt_vars.$sym47$_ARITY_MT_)) ? mt_vars.$arity_mt$.getGlobalValue() : mt_vars.$const13$UniversalVocabularyMt);
        mt_vars.$sublid_mt$ = SubLFiles.deflexical("*SUBLID-MT*", (mt_vars.NIL != Symbols.boundp((SubLObject)mt_vars.$sym49$_SUBLID_MT_)) ? mt_vars.$sublid_mt$.getGlobalValue() : mt_vars.$const50$CycAPIMt);
        mt_vars.$not_assertible_mt_convention_mt$ = SubLFiles.deflexical("*NOT-ASSERTIBLE-MT-CONVENTION-MT*", (mt_vars.NIL != Symbols.boundp((SubLObject)mt_vars.$sym52$_NOT_ASSERTIBLE_MT_CONVENTION_MT_)) ? mt_vars.$not_assertible_mt_convention_mt$.getGlobalValue() : mt_vars.$const13$UniversalVocabularyMt);
        mt_vars.$default_ask_mt$ = SubLFiles.deflexical("*DEFAULT-ASK-MT*", (mt_vars.NIL != Symbols.boundp((SubLObject)mt_vars.$sym54$_DEFAULT_ASK_MT_)) ? mt_vars.$default_ask_mt$.getGlobalValue() : mt_vars.$const7$BaseKB);
        mt_vars.$default_assert_mt$ = SubLFiles.deflexical("*DEFAULT-ASSERT-MT*", (mt_vars.NIL != Symbols.boundp((SubLObject)mt_vars.$sym55$_DEFAULT_ASSERT_MT_)) ? mt_vars.$default_assert_mt$.getGlobalValue() : mt_vars.$const7$BaseKB);
        mt_vars.$default_clone_mt$ = SubLFiles.deflexical("*DEFAULT-CLONE-MT*", (mt_vars.NIL != Symbols.boundp((SubLObject)mt_vars.$sym56$_DEFAULT_CLONE_MT_)) ? mt_vars.$default_clone_mt$.getGlobalValue() : mt_vars.$const7$BaseKB);
        mt_vars.$default_support_mt$ = SubLFiles.deflexical("*DEFAULT-SUPPORT-MT*", (mt_vars.NIL != Symbols.boundp((SubLObject)mt_vars.$sym57$_DEFAULT_SUPPORT_MT_)) ? mt_vars.$default_support_mt$.getGlobalValue() : mt_vars.$const7$BaseKB);
        mt_vars.$default_comment_mt$ = SubLFiles.deflexical("*DEFAULT-COMMENT-MT*", (mt_vars.NIL != Symbols.boundp((SubLObject)mt_vars.$sym58$_DEFAULT_COMMENT_MT_)) ? mt_vars.$default_comment_mt$.getGlobalValue() : mt_vars.$const7$BaseKB);
        mt_vars.$default_convention_mt$ = SubLFiles.deflexical("*DEFAULT-CONVENTION-MT*", (mt_vars.NIL != Symbols.boundp((SubLObject)mt_vars.$sym59$_DEFAULT_CONVENTION_MT_)) ? mt_vars.$default_convention_mt$.getGlobalValue() : mt_vars.$const13$UniversalVocabularyMt);
        mt_vars.$core_mt_optimization_enabledP$ = SubLFiles.defparameter("*CORE-MT-OPTIMIZATION-ENABLED?*", (SubLObject)mt_vars.T);
        mt_vars.$core_mts$ = SubLFiles.deflexical("*CORE-MTS*", (SubLObject)mt_vars.$list60);
        mt_vars.$ordered_core_mts$ = SubLFiles.deflexical("*ORDERED-CORE-MTS*", (SubLObject)mt_vars.$list61);
        mt_vars.$special_loop_core_mts$ = SubLFiles.deflexical("*SPECIAL-LOOP-CORE-MTS*", (SubLObject)mt_vars.$list62);
        return (SubLObject)mt_vars.NIL;
    }
    
    public static SubLObject setup_mt_vars_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)mt_vars.$sym6$_MT_ROOT_);
        note_mt_var((SubLObject)mt_vars.$sym6$_MT_ROOT_, (SubLObject)mt_vars.NIL);
        subl_macro_promotions.declare_defglobal((SubLObject)mt_vars.$sym8$_THEORY_MT_ROOT_);
        note_mt_var((SubLObject)mt_vars.$sym8$_THEORY_MT_ROOT_, (SubLObject)mt_vars.NIL);
        subl_macro_promotions.declare_defglobal((SubLObject)mt_vars.$sym9$_ASSERTIBLE_MT_ROOT_);
        note_mt_var((SubLObject)mt_vars.$sym9$_ASSERTIBLE_MT_ROOT_, (SubLObject)mt_vars.NIL);
        subl_macro_promotions.declare_defglobal((SubLObject)mt_vars.$sym10$_ASSERTIBLE_THEORY_MT_ROOT_);
        note_mt_var((SubLObject)mt_vars.$sym10$_ASSERTIBLE_THEORY_MT_ROOT_, (SubLObject)mt_vars.NIL);
        subl_macro_promotions.declare_defglobal((SubLObject)mt_vars.$sym11$_CORE_MT_FLOOR_);
        note_mt_var((SubLObject)mt_vars.$sym11$_CORE_MT_FLOOR_, (SubLObject)mt_vars.NIL);
        subl_macro_promotions.declare_defglobal((SubLObject)mt_vars.$sym12$_MT_MT_);
        note_mt_var((SubLObject)mt_vars.$sym12$_MT_MT_, mt_vars.$const14$Microtheory);
        subl_macro_promotions.declare_defglobal((SubLObject)mt_vars.$sym15$_DEFINING_MT_MT_);
        note_mt_var((SubLObject)mt_vars.$sym15$_DEFINING_MT_MT_, mt_vars.$const16$definingMt);
        subl_macro_promotions.declare_defglobal((SubLObject)mt_vars.$sym17$_DECONTEXTUALIZED_PREDICATE_MT_);
        note_mt_var((SubLObject)mt_vars.$sym17$_DECONTEXTUALIZED_PREDICATE_MT_, mt_vars.$const18$decontextualizedPredicate);
        subl_macro_promotions.declare_defglobal((SubLObject)mt_vars.$sym19$_DECONTEXTUALIZED_COLLECTION_MT_);
        note_mt_var((SubLObject)mt_vars.$sym19$_DECONTEXTUALIZED_COLLECTION_MT_, mt_vars.$const20$decontextualizedCollection);
        subl_macro_promotions.declare_defglobal((SubLObject)mt_vars.$sym21$_EPHEMERAL_TERM_MT_);
        note_mt_var((SubLObject)mt_vars.$sym21$_EPHEMERAL_TERM_MT_, mt_vars.$const22$ephemeralTerm);
        subl_macro_promotions.declare_defglobal((SubLObject)mt_vars.$sym23$_IST_MT_);
        note_mt_var((SubLObject)mt_vars.$sym23$_IST_MT_, mt_vars.$const24$ist);
        subl_macro_promotions.declare_defglobal((SubLObject)mt_vars.$sym25$_INFERENCE_RELATED_BOOKKEEPING_PREDICATE_MT_);
        note_mt_var((SubLObject)mt_vars.$sym25$_INFERENCE_RELATED_BOOKKEEPING_PREDICATE_MT_, mt_vars.$const26$InferenceRelatedBookkeepingPredic);
        subl_macro_promotions.declare_defglobal((SubLObject)mt_vars.$sym27$_ANECT_MT_);
        note_mt_var((SubLObject)mt_vars.$sym27$_ANECT_MT_, mt_vars.$const28$AtemporalNecessarilyEssentialColl);
        subl_macro_promotions.declare_defglobal((SubLObject)mt_vars.$sym29$_BROAD_MT_MT_);
        note_mt_var((SubLObject)mt_vars.$sym29$_BROAD_MT_MT_, mt_vars.$const30$BroadMicrotheory);
        subl_macro_promotions.declare_defglobal((SubLObject)mt_vars.$sym31$_PSC_MT_);
        note_mt_var((SubLObject)mt_vars.$sym31$_PSC_MT_, mt_vars.$const32$ProblemSolvingCntxt);
        subl_macro_promotions.declare_defglobal((SubLObject)mt_vars.$sym33$_TOU_MT_);
        note_mt_var((SubLObject)mt_vars.$sym33$_TOU_MT_, mt_vars.$const34$termOfUnit);
        subl_macro_promotions.declare_defglobal((SubLObject)mt_vars.$sym35$_SKOLEM_MT_);
        note_mt_var((SubLObject)mt_vars.$sym35$_SKOLEM_MT_, mt_vars.$const36$skolem);
        subl_macro_promotions.declare_defglobal((SubLObject)mt_vars.$sym37$_THING_DEFINING_MT_);
        note_mt_var((SubLObject)mt_vars.$sym37$_THING_DEFINING_MT_, mt_vars.$const38$Thing);
        subl_macro_promotions.declare_defglobal((SubLObject)mt_vars.$sym39$_RELATION_DEFINING_MT_);
        note_mt_var((SubLObject)mt_vars.$sym39$_RELATION_DEFINING_MT_, mt_vars.$const40$Relation);
        subl_macro_promotions.declare_defglobal((SubLObject)mt_vars.$sym41$_EQUALS_DEFINING_MT_);
        note_mt_var((SubLObject)mt_vars.$sym41$_EQUALS_DEFINING_MT_, mt_vars.$const42$equals);
        subl_macro_promotions.declare_defglobal((SubLObject)mt_vars.$sym43$_ELEMENT_OF_DEFINING_MT_);
        note_mt_var((SubLObject)mt_vars.$sym43$_ELEMENT_OF_DEFINING_MT_, mt_vars.$const44$elementOf);
        subl_macro_promotions.declare_defglobal((SubLObject)mt_vars.$sym45$_SUBSET_OF_DEFINING_MT_);
        note_mt_var((SubLObject)mt_vars.$sym45$_SUBSET_OF_DEFINING_MT_, mt_vars.$const46$subsetOf);
        subl_macro_promotions.declare_defglobal((SubLObject)mt_vars.$sym47$_ARITY_MT_);
        note_mt_var((SubLObject)mt_vars.$sym47$_ARITY_MT_, mt_vars.$const48$arity);
        subl_macro_promotions.declare_defglobal((SubLObject)mt_vars.$sym49$_SUBLID_MT_);
        note_mt_var((SubLObject)mt_vars.$sym49$_SUBLID_MT_, mt_vars.$const51$subLIdentifier);
        subl_macro_promotions.declare_defglobal((SubLObject)mt_vars.$sym52$_NOT_ASSERTIBLE_MT_CONVENTION_MT_);
        note_mt_var((SubLObject)mt_vars.$sym52$_NOT_ASSERTIBLE_MT_CONVENTION_MT_, mt_vars.$const53$notAssertibleMt);
        subl_macro_promotions.declare_defglobal((SubLObject)mt_vars.$sym54$_DEFAULT_ASK_MT_);
        note_mt_var((SubLObject)mt_vars.$sym54$_DEFAULT_ASK_MT_, (SubLObject)mt_vars.NIL);
        subl_macro_promotions.declare_defglobal((SubLObject)mt_vars.$sym55$_DEFAULT_ASSERT_MT_);
        note_mt_var((SubLObject)mt_vars.$sym55$_DEFAULT_ASSERT_MT_, (SubLObject)mt_vars.NIL);
        subl_macro_promotions.declare_defglobal((SubLObject)mt_vars.$sym56$_DEFAULT_CLONE_MT_);
        note_mt_var((SubLObject)mt_vars.$sym56$_DEFAULT_CLONE_MT_, (SubLObject)mt_vars.NIL);
        subl_macro_promotions.declare_defglobal((SubLObject)mt_vars.$sym57$_DEFAULT_SUPPORT_MT_);
        note_mt_var((SubLObject)mt_vars.$sym57$_DEFAULT_SUPPORT_MT_, (SubLObject)mt_vars.NIL);
        subl_macro_promotions.declare_defglobal((SubLObject)mt_vars.$sym58$_DEFAULT_COMMENT_MT_);
        note_mt_var((SubLObject)mt_vars.$sym58$_DEFAULT_COMMENT_MT_, (SubLObject)mt_vars.NIL);
        subl_macro_promotions.declare_defglobal((SubLObject)mt_vars.$sym59$_DEFAULT_CONVENTION_MT_);
        note_mt_var((SubLObject)mt_vars.$sym59$_DEFAULT_CONVENTION_MT_, (SubLObject)mt_vars.NIL);
        return (SubLObject)mt_vars.NIL;
    }
    
    public void declareFunctions() {
        declare_mt_vars_file();
    }
    
    public void initializeVariables() {
        init_mt_vars_file();
    }
    
    public void runTopLevelForms() {
        setup_mt_vars_file();
    }
    
    static {
        me = (SubLFile)new mt_vars();
        mt_vars.$mt_var_basis_table$ = null;
        mt_vars.$mt_root$ = null;
        mt_vars.$theory_mt_root$ = null;
        mt_vars.$assertible_mt_root$ = null;
        mt_vars.$assertible_theory_mt_root$ = null;
        mt_vars.$core_mt_floor$ = null;
        mt_vars.$mt_mt$ = null;
        mt_vars.$defining_mt_mt$ = null;
        mt_vars.$decontextualized_predicate_mt$ = null;
        mt_vars.$decontextualized_collection_mt$ = null;
        mt_vars.$ephemeral_term_mt$ = null;
        mt_vars.$ist_mt$ = null;
        mt_vars.$inference_related_bookkeeping_predicate_mt$ = null;
        mt_vars.$anect_mt$ = null;
        mt_vars.$broad_mt_mt$ = null;
        mt_vars.$psc_mt$ = null;
        mt_vars.$tou_mt$ = null;
        mt_vars.$skolem_mt$ = null;
        mt_vars.$thing_defining_mt$ = null;
        mt_vars.$relation_defining_mt$ = null;
        mt_vars.$equals_defining_mt$ = null;
        mt_vars.$element_of_defining_mt$ = null;
        mt_vars.$subset_of_defining_mt$ = null;
        mt_vars.$arity_mt$ = null;
        mt_vars.$sublid_mt$ = null;
        mt_vars.$not_assertible_mt_convention_mt$ = null;
        mt_vars.$default_ask_mt$ = null;
        mt_vars.$default_assert_mt$ = null;
        mt_vars.$default_clone_mt$ = null;
        mt_vars.$default_support_mt$ = null;
        mt_vars.$default_comment_mt$ = null;
        mt_vars.$default_convention_mt$ = null;
        mt_vars.$core_mt_optimization_enabledP$ = null;
        mt_vars.$core_mts$ = null;
        mt_vars.$ordered_core_mts$ = null;
        mt_vars.$special_loop_core_mts$ = null;
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("DEFAULT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("BASIS"), (SubLObject)SubLObjectFactory.makeSymbol("COMMENT"));
        $str1$Illegal_basis_argument_to_defglob = SubLObjectFactory.makeString("Illegal basis argument to defglobal-mt-var: ~s");
        $sym2$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym3$DEFGLOBAL_PROTECTED = SubLObjectFactory.makeSymbol("DEFGLOBAL-PROTECTED");
        $sym4$NOTE_MT_VAR = SubLObjectFactory.makeSymbol("NOTE-MT-VAR");
        $sym5$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $sym6$_MT_ROOT_ = SubLObjectFactory.makeSymbol("*MT-ROOT*");
        $const7$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $sym8$_THEORY_MT_ROOT_ = SubLObjectFactory.makeSymbol("*THEORY-MT-ROOT*");
        $sym9$_ASSERTIBLE_MT_ROOT_ = SubLObjectFactory.makeSymbol("*ASSERTIBLE-MT-ROOT*");
        $sym10$_ASSERTIBLE_THEORY_MT_ROOT_ = SubLObjectFactory.makeSymbol("*ASSERTIBLE-THEORY-MT-ROOT*");
        $sym11$_CORE_MT_FLOOR_ = SubLObjectFactory.makeSymbol("*CORE-MT-FLOOR*");
        $sym12$_MT_MT_ = SubLObjectFactory.makeSymbol("*MT-MT*");
        $const13$UniversalVocabularyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $const14$Microtheory = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Microtheory"));
        $sym15$_DEFINING_MT_MT_ = SubLObjectFactory.makeSymbol("*DEFINING-MT-MT*");
        $const16$definingMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("definingMt"));
        $sym17$_DECONTEXTUALIZED_PREDICATE_MT_ = SubLObjectFactory.makeSymbol("*DECONTEXTUALIZED-PREDICATE-MT*");
        $const18$decontextualizedPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("decontextualizedPredicate"));
        $sym19$_DECONTEXTUALIZED_COLLECTION_MT_ = SubLObjectFactory.makeSymbol("*DECONTEXTUALIZED-COLLECTION-MT*");
        $const20$decontextualizedCollection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("decontextualizedCollection"));
        $sym21$_EPHEMERAL_TERM_MT_ = SubLObjectFactory.makeSymbol("*EPHEMERAL-TERM-MT*");
        $const22$ephemeralTerm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ephemeralTerm"));
        $sym23$_IST_MT_ = SubLObjectFactory.makeSymbol("*IST-MT*");
        $const24$ist = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist"));
        $sym25$_INFERENCE_RELATED_BOOKKEEPING_PREDICATE_MT_ = SubLObjectFactory.makeSymbol("*INFERENCE-RELATED-BOOKKEEPING-PREDICATE-MT*");
        $const26$InferenceRelatedBookkeepingPredic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferenceRelatedBookkeepingPredicate"));
        $sym27$_ANECT_MT_ = SubLObjectFactory.makeSymbol("*ANECT-MT*");
        $const28$AtemporalNecessarilyEssentialColl = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtemporalNecessarilyEssentialCollectionType"));
        $sym29$_BROAD_MT_MT_ = SubLObjectFactory.makeSymbol("*BROAD-MT-MT*");
        $const30$BroadMicrotheory = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BroadMicrotheory"));
        $sym31$_PSC_MT_ = SubLObjectFactory.makeSymbol("*PSC-MT*");
        $const32$ProblemSolvingCntxt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProblemSolvingCntxt"));
        $sym33$_TOU_MT_ = SubLObjectFactory.makeSymbol("*TOU-MT*");
        $const34$termOfUnit = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termOfUnit"));
        $sym35$_SKOLEM_MT_ = SubLObjectFactory.makeSymbol("*SKOLEM-MT*");
        $const36$skolem = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("skolem"));
        $sym37$_THING_DEFINING_MT_ = SubLObjectFactory.makeSymbol("*THING-DEFINING-MT*");
        $const38$Thing = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"));
        $sym39$_RELATION_DEFINING_MT_ = SubLObjectFactory.makeSymbol("*RELATION-DEFINING-MT*");
        $const40$Relation = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Relation"));
        $sym41$_EQUALS_DEFINING_MT_ = SubLObjectFactory.makeSymbol("*EQUALS-DEFINING-MT*");
        $const42$equals = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals"));
        $sym43$_ELEMENT_OF_DEFINING_MT_ = SubLObjectFactory.makeSymbol("*ELEMENT-OF-DEFINING-MT*");
        $const44$elementOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("elementOf"));
        $sym45$_SUBSET_OF_DEFINING_MT_ = SubLObjectFactory.makeSymbol("*SUBSET-OF-DEFINING-MT*");
        $const46$subsetOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subsetOf"));
        $sym47$_ARITY_MT_ = SubLObjectFactory.makeSymbol("*ARITY-MT*");
        $const48$arity = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arity"));
        $sym49$_SUBLID_MT_ = SubLObjectFactory.makeSymbol("*SUBLID-MT*");
        $const50$CycAPIMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycAPIMt"));
        $const51$subLIdentifier = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subLIdentifier"));
        $sym52$_NOT_ASSERTIBLE_MT_CONVENTION_MT_ = SubLObjectFactory.makeSymbol("*NOT-ASSERTIBLE-MT-CONVENTION-MT*");
        $const53$notAssertibleMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("notAssertibleMt"));
        $sym54$_DEFAULT_ASK_MT_ = SubLObjectFactory.makeSymbol("*DEFAULT-ASK-MT*");
        $sym55$_DEFAULT_ASSERT_MT_ = SubLObjectFactory.makeSymbol("*DEFAULT-ASSERT-MT*");
        $sym56$_DEFAULT_CLONE_MT_ = SubLObjectFactory.makeSymbol("*DEFAULT-CLONE-MT*");
        $sym57$_DEFAULT_SUPPORT_MT_ = SubLObjectFactory.makeSymbol("*DEFAULT-SUPPORT-MT*");
        $sym58$_DEFAULT_COMMENT_MT_ = SubLObjectFactory.makeSymbol("*DEFAULT-COMMENT-MT*");
        $sym59$_DEFAULT_CONVENTION_MT_ = SubLObjectFactory.makeSymbol("*DEFAULT-CONVENTION-MT*");
        $list60 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LogicalTruthMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LogicalTruthImplementationMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoreCycLMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoreCycLImplementationMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyImplementationMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB")));
        $list61 = ConsesLow.list((SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LogicalTruthMt")), (SubLObject)mt_vars.ZERO_INTEGER), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LogicalTruthImplementationMt")), (SubLObject)mt_vars.ZERO_INTEGER), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoreCycLMt")), (SubLObject)mt_vars.ONE_INTEGER), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoreCycLImplementationMt")), (SubLObject)mt_vars.ONE_INTEGER), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt")), (SubLObject)mt_vars.TWO_INTEGER), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyImplementationMt")), (SubLObject)mt_vars.TWO_INTEGER), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB")), (SubLObject)mt_vars.THREE_INTEGER));
        $list62 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB")));
        $sym63$CORE_MICROTHEORY_P = SubLObjectFactory.makeSymbol("CORE-MICROTHEORY-P");
        $sym64$CORE_MICROTHEORY__ = SubLObjectFactory.makeSymbol("CORE-MICROTHEORY-<");
        $sym65$CORE_MICROTHEORY__ = SubLObjectFactory.makeSymbol("CORE-MICROTHEORY->");
        $sym66$SETS_EQUAL_ = SubLObjectFactory.makeSymbol("SETS-EQUAL?");
    }
    
    public static final class $core_microtheory_p$UnaryFunction extends UnaryFunction
    {
        public $core_microtheory_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CORE-MICROTHEORY-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return mt_vars.core_microtheory_p(arg1);
        }
    }
    
    public static final class $special_core_loop_mt_p$UnaryFunction extends UnaryFunction
    {
        public $special_core_loop_mt_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SPECIAL-CORE-LOOP-MT-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return mt_vars.special_core_loop_mt_p(arg1);
        }
    }
}

/*

	Total time: 174 ms
	
*/