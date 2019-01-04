package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import java.util.Map;
import java.util.Iterator;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.vector_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inference_datastructures_strategy extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy";
    public static final String myFingerPrint = "acfc3b6e921153d7bd731030e625c4d800c4e3d0fee004e0fd0d73204ebf5fed";
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
    public static SubLSymbol $dtp_strategy$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 13708L)
    public static SubLSymbol $current_strategy_wrt_memoization$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 26417L)
    private static SubLSymbol $strategy_type_store$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 27759L)
    private static SubLSymbol $uninterestingness_cache_lookup_enabledP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 28314L)
    public static SubLSymbol $dtp_problem_strategic_properties$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 42838L)
    public static SubLSymbol $dtp_tactic_strategic_properties$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 62643L)
    private static SubLSymbol $default_uninterestingness_cache_value$;
    private static final SubLSymbol $sym0$STRATEGY;
    private static final SubLSymbol $sym1$STRATEGY_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$PRINT_STRATEGY;
    private static final SubLSymbol $sym7$STRATEGY_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$STRAT_SUID;
    private static final SubLSymbol $sym10$_CSETF_STRAT_SUID;
    private static final SubLSymbol $sym11$STRAT_INFERENCE;
    private static final SubLSymbol $sym12$_CSETF_STRAT_INFERENCE;
    private static final SubLSymbol $sym13$STRAT_RESULT_UNIQUENESS_CRITERION;
    private static final SubLSymbol $sym14$_CSETF_STRAT_RESULT_UNIQUENESS_CRITERION;
    private static final SubLSymbol $sym15$STRAT_ACTIVE_PROBLEMS;
    private static final SubLSymbol $sym16$_CSETF_STRAT_ACTIVE_PROBLEMS;
    private static final SubLSymbol $sym17$STRAT_MOTIVATED_PROBLEMS;
    private static final SubLSymbol $sym18$_CSETF_STRAT_MOTIVATED_PROBLEMS;
    private static final SubLSymbol $sym19$STRAT_SET_ASIDE_PROBLEMS;
    private static final SubLSymbol $sym20$_CSETF_STRAT_SET_ASIDE_PROBLEMS;
    private static final SubLSymbol $sym21$STRAT_SHOULD_RECONSIDER_SET_ASIDES_;
    private static final SubLSymbol $sym22$_CSETF_STRAT_SHOULD_RECONSIDER_SET_ASIDES_;
    private static final SubLSymbol $sym23$STRAT_PRODUCTIVITY_LIMIT;
    private static final SubLSymbol $sym24$_CSETF_STRAT_PRODUCTIVITY_LIMIT;
    private static final SubLSymbol $sym25$STRAT_REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT;
    private static final SubLSymbol $sym26$_CSETF_STRAT_REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT;
    private static final SubLSymbol $sym27$STRAT_PROOF_SPEC;
    private static final SubLSymbol $sym28$_CSETF_STRAT_PROOF_SPEC;
    private static final SubLSymbol $sym29$STRAT_PROBLEM_PROOF_SPEC_INDEX;
    private static final SubLSymbol $sym30$_CSETF_STRAT_PROBLEM_PROOF_SPEC_INDEX;
    private static final SubLSymbol $sym31$STRAT_PROBLEM_STRATEGIC_INDEX;
    private static final SubLSymbol $sym32$_CSETF_STRAT_PROBLEM_STRATEGIC_INDEX;
    private static final SubLSymbol $sym33$STRAT_MEMOIZATION_STATE;
    private static final SubLSymbol $sym34$_CSETF_STRAT_MEMOIZATION_STATE;
    private static final SubLSymbol $sym35$STRAT_STEP_COUNT;
    private static final SubLSymbol $sym36$_CSETF_STRAT_STEP_COUNT;
    private static final SubLSymbol $sym37$STRAT_TYPE;
    private static final SubLSymbol $sym38$_CSETF_STRAT_TYPE;
    private static final SubLSymbol $sym39$STRAT_DATA;
    private static final SubLSymbol $sym40$_CSETF_STRAT_DATA;
    private static final SubLSymbol $kw41$SUID;
    private static final SubLSymbol $kw42$INFERENCE;
    private static final SubLSymbol $kw43$RESULT_UNIQUENESS_CRITERION;
    private static final SubLSymbol $kw44$ACTIVE_PROBLEMS;
    private static final SubLSymbol $kw45$MOTIVATED_PROBLEMS;
    private static final SubLSymbol $kw46$SET_ASIDE_PROBLEMS;
    private static final SubLSymbol $kw47$SHOULD_RECONSIDER_SET_ASIDES_;
    private static final SubLSymbol $kw48$PRODUCTIVITY_LIMIT;
    private static final SubLSymbol $kw49$REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT;
    private static final SubLSymbol $kw50$PROOF_SPEC;
    private static final SubLSymbol $kw51$PROBLEM_PROOF_SPEC_INDEX;
    private static final SubLSymbol $kw52$PROBLEM_STRATEGIC_INDEX;
    private static final SubLSymbol $kw53$MEMOIZATION_STATE;
    private static final SubLSymbol $kw54$STEP_COUNT;
    private static final SubLSymbol $kw55$TYPE;
    private static final SubLSymbol $kw56$DATA;
    private static final SubLString $str57$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw58$BEGIN;
    private static final SubLSymbol $sym59$MAKE_STRATEGY;
    private static final SubLSymbol $kw60$SLOT;
    private static final SubLSymbol $kw61$END;
    private static final SubLSymbol $sym62$VISIT_DEFSTRUCT_OBJECT_STRATEGY_METHOD;
    private static final SubLSymbol $kw63$FREE;
    private static final SubLString $str64$_Invalid_STRATEGY__s_;
    private static final SubLString $str65$__a_STRATEGY__a__a_for_inference_;
    private static final SubLSymbol $sym66$SXHASH_STRATEGY_METHOD;
    private static final SubLSymbol $sym67$STRATEGY_TYPE_P;
    private static final SubLSymbol $sym68$INFERENCE_P;
    private static final SubLString $str69$strategy_memoization_state;
    private static final SubLSymbol $kw70$CONSTRUCTOR;
    private static final SubLSymbol $sym71$STRATEGY_ACTIVE_PROBLEMS;
    private static final SubLSymbol $sym72$DO_STRATEGY_ACTIVE_PROBLEMS;
    private static final SubLSymbol $sym73$STRATEGY_MOTIVATED_PROBLEMS;
    private static final SubLSymbol $sym74$DO_STRATEGY_MOTIVATED_PROBLEMS;
    private static final SubLSymbol $sym75$STRATEGY_SET_ASIDE_PROBLEMS;
    private static final SubLSymbol $sym76$DO_STRATEGY_SET_ASIDE_PROBLEMS;
    private static final SubLSymbol $sym77$RESULT_UNIQUENESS_CRITERION_P;
    private static final SubLSymbol $sym78$PRODUCTIVITY_P;
    private static final SubLSymbol $sym79$PROOF_SPEC_P;
    private static final SubLList $list80;
    private static final SubLList $list81;
    private static final SubLSymbol $kw82$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw83$DONE;
    private static final SubLSymbol $sym84$DO_SET;
    private static final SubLSymbol $sym85$DO_SET_CONTENTS;
    private static final SubLList $list86;
    private static final SubLSymbol $sym87$STRATEGY_VAR;
    private static final SubLSymbol $sym88$STATE_VAR;
    private static final SubLSymbol $sym89$CLET;
    private static final SubLSymbol $sym90$STRATEGY_MEMOIZATION_STATE;
    private static final SubLSymbol $sym91$_CURRENT_STRATEGY_WRT_MEMOIZATION_;
    private static final SubLSymbol $sym92$WITH_MEMOIZATION_STATE;
    private static final SubLSymbol $sym93$WITH_STRATEGY_MEMOIZATION_STATE;
    private static final SubLSymbol $sym94$CURRENT_STRATEGY_WRT_MEMOIZATION;
    private static final SubLSymbol $sym95$VALID_PROBLEM_P;
    private static final SubLSymbol $kw96$PROOF;
    private static final SubLSymbol $kw97$BINDINGS;
    private static final SubLSymbol $sym98$PROBLEM_P;
    private static final SubLSymbol $kw99$ANYTHING;
    private static final SubLSymbol $sym100$STRATEGY_PROPERTY_P;
    private static final SubLString $str101$Unexpected_strategy_property__s_w;
    private static final SubLSymbol $sym102$STRATEGY_PROPERTIES_P;
    private static final SubLSymbol $kw103$SUBSTRATEGY_STRATEGEM_MOTIVATED;
    private static final SubLList $list104;
    private static final SubLSymbol $sym105$STRATEGY_VAR;
    private static final SubLSymbol $sym106$PROBLEM_VAR;
    private static final SubLSymbol $sym107$STRATEGY_NOTE_PROBLEM_ACTIVE;
    private static final SubLSymbol $sym108$STRATEGY_NOTE_PROBLEM_INACTIVE;
    private static final SubLSymbol $sym109$POSSIBLY_REACTIVATE_PROBLEM;
    private static final SubLSymbol $kw110$NOTHING;
    private static final SubLString $str111$balancing_tactician_does_not_impl;
    private static final SubLString $str112$Unexpected_strategy_type__a;
    private static final SubLSymbol $sym113$_STRATEGY_TYPE_STORE_;
    private static final SubLSymbol $sym114$PROPERTY_LIST_P;
    private static final SubLSymbol $sym115$STRATEGY_TYPE_PROPERTY_P;
    private static final SubLSymbol $kw116$RECOMPUTE;
    private static final SubLSymbol $sym117$PROBLEM_STRATEGIC_PROPERTIES;
    private static final SubLSymbol $sym118$PROBLEM_STRATEGIC_PROPERTIES_P;
    private static final SubLList $list119;
    private static final SubLList $list120;
    private static final SubLList $list121;
    private static final SubLList $list122;
    private static final SubLSymbol $sym123$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym124$PROBLEM_STRATEGIC_PROPERTIES_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list125;
    private static final SubLSymbol $sym126$PROB_STRATEGIC_PROPERTIES_STATUS;
    private static final SubLSymbol $sym127$_CSETF_PROB_STRATEGIC_PROPERTIES_STATUS;
    private static final SubLSymbol $sym128$PROB_STRATEGIC_PROPERTIES_TACTIC_STRATEGIC_PROPERTY_INDEX;
    private static final SubLSymbol $sym129$_CSETF_PROB_STRATEGIC_PROPERTIES_TACTIC_STRATEGIC_PROPERTY_INDEX;
    private static final SubLSymbol $sym130$PROB_STRATEGIC_PROPERTIES_POSSIBLE_TACTIC_COUNT;
    private static final SubLSymbol $sym131$_CSETF_PROB_STRATEGIC_PROPERTIES_POSSIBLE_TACTIC_COUNT;
    private static final SubLSymbol $sym132$PROB_STRATEGIC_PROPERTIES_UNINTERESTINGNESS;
    private static final SubLSymbol $sym133$_CSETF_PROB_STRATEGIC_PROPERTIES_UNINTERESTINGNESS;
    private static final SubLSymbol $kw134$STATUS;
    private static final SubLSymbol $kw135$TACTIC_STRATEGIC_PROPERTY_INDEX;
    private static final SubLSymbol $kw136$POSSIBLE_TACTIC_COUNT;
    private static final SubLSymbol $kw137$UNINTERESTINGNESS;
    private static final SubLSymbol $sym138$MAKE_PROBLEM_STRATEGIC_PROPERTIES;
    private static final SubLSymbol $sym139$VISIT_DEFSTRUCT_OBJECT_PROBLEM_STRATEGIC_PROPERTIES_METHOD;
    private static final SubLSymbol $kw140$NEW;
    private static final SubLSymbol $kw141$UNEXAMINED;
    private static final SubLSymbol $kw142$FINISHED;
    private static final SubLSymbol $kw143$NEUTRAL;
    private static final SubLSymbol $kw144$NO_GOOD;
    private static final SubLSymbol $sym145$STRATEGIC_CONTEXT_P;
    private static final SubLString $str146$poking_good_status__s_into_proble;
    private static final SubLSymbol $kw147$POSSIBLE_NO_GOOD;
    private static final SubLString $str148$_possible_no_good__s_wrt__s;
    private static final SubLSymbol $kw149$EXAMINED;
    private static final SubLSymbol $kw150$POSSIBLE;
    private static final SubLSymbol $kw151$PENDING;
    private static final SubLSymbol $sym152$UNINTERESTINGNESS_CACHE_VALUE_P;
    private static final SubLSymbol $kw153$ALL;
    private static final SubLSymbol $sym154$TACTIC_STRATEGIC_PROPERTIES;
    private static final SubLSymbol $sym155$TACTIC_STRATEGIC_PROPERTIES_P;
    private static final SubLList $list156;
    private static final SubLList $list157;
    private static final SubLList $list158;
    private static final SubLList $list159;
    private static final SubLSymbol $sym160$TACTIC_STRATEGIC_PROPERTIES_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list161;
    private static final SubLSymbol $sym162$TACT_STRATEGIC_PROPERTIES_PREFERENCE_LEVEL;
    private static final SubLSymbol $sym163$_CSETF_TACT_STRATEGIC_PROPERTIES_PREFERENCE_LEVEL;
    private static final SubLSymbol $sym164$TACT_STRATEGIC_PROPERTIES_PREFERENCE_LEVEL_JUSTIFICATION;
    private static final SubLSymbol $sym165$_CSETF_TACT_STRATEGIC_PROPERTIES_PREFERENCE_LEVEL_JUSTIFICATION;
    private static final SubLSymbol $sym166$TACT_STRATEGIC_PROPERTIES_PRODUCTIVITY;
    private static final SubLSymbol $sym167$_CSETF_TACT_STRATEGIC_PROPERTIES_PRODUCTIVITY;
    private static final SubLSymbol $sym168$TACT_STRATEGIC_PROPERTIES_UNINTERESTINGNESS;
    private static final SubLSymbol $sym169$_CSETF_TACT_STRATEGIC_PROPERTIES_UNINTERESTINGNESS;
    private static final SubLSymbol $kw170$PREFERENCE_LEVEL;
    private static final SubLSymbol $kw171$PREFERENCE_LEVEL_JUSTIFICATION;
    private static final SubLSymbol $kw172$PRODUCTIVITY;
    private static final SubLSymbol $sym173$MAKE_TACTIC_STRATEGIC_PROPERTIES;
    private static final SubLSymbol $sym174$VISIT_DEFSTRUCT_OBJECT_TACTIC_STRATEGIC_PROPERTIES_METHOD;
    private static final SubLString $str175$;
    private static final SubLSymbol $sym176$TACTIC_P;
    private static final SubLSymbol $kw177$TACTICAL;
    private static final SubLString $str178$structural_tactic__s_cannot_have_;
    private static final SubLString $str179$content_tactic__s_cannot_have_a_p;
    private static final SubLString $str180$content_tactic__s_cannot_have_a_p;
    private static final SubLSymbol $sym181$GENERALIZED_CONJUNCTIVE_TACTIC_P;
    private static final SubLSymbol $kw182$PREFERRED;
    private static final SubLSymbol $sym183$PREFERENCE_LEVEL_P;
    private static final SubLSymbol $sym184$UNINTERESTINGNESS_CACHE_CONDITIONS_P;
    private static final SubLSymbol $sym185$BOOLEANP;
    private static final SubLSymbol $kw186$SKIP;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
    public static SubLObject strategy_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_strategy(v_object, stream, (SubLObject)inference_datastructures_strategy.ZERO_INTEGER);
        return (SubLObject)inference_datastructures_strategy.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
    public static SubLObject strategy_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $strategy_native.class) ? inference_datastructures_strategy.T : inference_datastructures_strategy.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
    public static SubLObject strat_suid(final SubLObject v_object) {
        assert inference_datastructures_strategy.NIL != strategy_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
    public static SubLObject strat_inference(final SubLObject v_object) {
        assert inference_datastructures_strategy.NIL != strategy_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
    public static SubLObject strat_result_uniqueness_criterion(final SubLObject v_object) {
        assert inference_datastructures_strategy.NIL != strategy_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
    public static SubLObject strat_active_problems(final SubLObject v_object) {
        assert inference_datastructures_strategy.NIL != strategy_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
    public static SubLObject strat_motivated_problems(final SubLObject v_object) {
        assert inference_datastructures_strategy.NIL != strategy_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
    public static SubLObject strat_set_aside_problems(final SubLObject v_object) {
        assert inference_datastructures_strategy.NIL != strategy_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
    public static SubLObject strat_should_reconsider_set_asidesP(final SubLObject v_object) {
        assert inference_datastructures_strategy.NIL != strategy_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
    public static SubLObject strat_productivity_limit(final SubLObject v_object) {
        assert inference_datastructures_strategy.NIL != strategy_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
    public static SubLObject strat_removal_backtracking_productivity_limit(final SubLObject v_object) {
        assert inference_datastructures_strategy.NIL != strategy_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
    public static SubLObject strat_proof_spec(final SubLObject v_object) {
        assert inference_datastructures_strategy.NIL != strategy_p(v_object) : v_object;
        return v_object.getField11();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
    public static SubLObject strat_problem_proof_spec_index(final SubLObject v_object) {
        assert inference_datastructures_strategy.NIL != strategy_p(v_object) : v_object;
        return v_object.getField12();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
    public static SubLObject strat_problem_strategic_index(final SubLObject v_object) {
        assert inference_datastructures_strategy.NIL != strategy_p(v_object) : v_object;
        return v_object.getField13();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
    public static SubLObject strat_memoization_state(final SubLObject v_object) {
        assert inference_datastructures_strategy.NIL != strategy_p(v_object) : v_object;
        return v_object.getField14();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
    public static SubLObject strat_step_count(final SubLObject v_object) {
        assert inference_datastructures_strategy.NIL != strategy_p(v_object) : v_object;
        return v_object.getField15();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
    public static SubLObject strat_type(final SubLObject v_object) {
        assert inference_datastructures_strategy.NIL != strategy_p(v_object) : v_object;
        return v_object.getField16();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
    public static SubLObject strat_data(final SubLObject v_object) {
        assert inference_datastructures_strategy.NIL != strategy_p(v_object) : v_object;
        return v_object.getField17();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
    public static SubLObject _csetf_strat_suid(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_strategy.NIL != strategy_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
    public static SubLObject _csetf_strat_inference(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_strategy.NIL != strategy_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
    public static SubLObject _csetf_strat_result_uniqueness_criterion(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_strategy.NIL != strategy_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
    public static SubLObject _csetf_strat_active_problems(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_strategy.NIL != strategy_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
    public static SubLObject _csetf_strat_motivated_problems(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_strategy.NIL != strategy_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
    public static SubLObject _csetf_strat_set_aside_problems(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_strategy.NIL != strategy_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
    public static SubLObject _csetf_strat_should_reconsider_set_asidesP(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_strategy.NIL != strategy_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
    public static SubLObject _csetf_strat_productivity_limit(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_strategy.NIL != strategy_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
    public static SubLObject _csetf_strat_removal_backtracking_productivity_limit(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_strategy.NIL != strategy_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
    public static SubLObject _csetf_strat_proof_spec(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_strategy.NIL != strategy_p(v_object) : v_object;
        return v_object.setField11(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
    public static SubLObject _csetf_strat_problem_proof_spec_index(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_strategy.NIL != strategy_p(v_object) : v_object;
        return v_object.setField12(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
    public static SubLObject _csetf_strat_problem_strategic_index(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_strategy.NIL != strategy_p(v_object) : v_object;
        return v_object.setField13(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
    public static SubLObject _csetf_strat_memoization_state(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_strategy.NIL != strategy_p(v_object) : v_object;
        return v_object.setField14(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
    public static SubLObject _csetf_strat_step_count(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_strategy.NIL != strategy_p(v_object) : v_object;
        return v_object.setField15(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
    public static SubLObject _csetf_strat_type(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_strategy.NIL != strategy_p(v_object) : v_object;
        return v_object.setField16(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
    public static SubLObject _csetf_strat_data(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_strategy.NIL != strategy_p(v_object) : v_object;
        return v_object.setField17(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
    public static SubLObject make_strategy(SubLObject arglist) {
        if (arglist == inference_datastructures_strategy.UNPROVIDED) {
            arglist = (SubLObject)inference_datastructures_strategy.NIL;
        }
        final SubLObject v_new = (SubLObject)new $strategy_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)inference_datastructures_strategy.NIL, next = arglist; inference_datastructures_strategy.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)inference_datastructures_strategy.$kw41$SUID)) {
                _csetf_strat_suid(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_strategy.$kw42$INFERENCE)) {
                _csetf_strat_inference(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_strategy.$kw43$RESULT_UNIQUENESS_CRITERION)) {
                _csetf_strat_result_uniqueness_criterion(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_strategy.$kw44$ACTIVE_PROBLEMS)) {
                _csetf_strat_active_problems(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_strategy.$kw45$MOTIVATED_PROBLEMS)) {
                _csetf_strat_motivated_problems(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_strategy.$kw46$SET_ASIDE_PROBLEMS)) {
                _csetf_strat_set_aside_problems(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_strategy.$kw47$SHOULD_RECONSIDER_SET_ASIDES_)) {
                _csetf_strat_should_reconsider_set_asidesP(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_strategy.$kw48$PRODUCTIVITY_LIMIT)) {
                _csetf_strat_productivity_limit(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_strategy.$kw49$REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT)) {
                _csetf_strat_removal_backtracking_productivity_limit(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_strategy.$kw50$PROOF_SPEC)) {
                _csetf_strat_proof_spec(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_strategy.$kw51$PROBLEM_PROOF_SPEC_INDEX)) {
                _csetf_strat_problem_proof_spec_index(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_strategy.$kw52$PROBLEM_STRATEGIC_INDEX)) {
                _csetf_strat_problem_strategic_index(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_strategy.$kw53$MEMOIZATION_STATE)) {
                _csetf_strat_memoization_state(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_strategy.$kw54$STEP_COUNT)) {
                _csetf_strat_step_count(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_strategy.$kw55$TYPE)) {
                _csetf_strat_type(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_strategy.$kw56$DATA)) {
                _csetf_strat_data(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)inference_datastructures_strategy.$str57$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
    public static SubLObject visit_defstruct_strategy(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_strategy.$kw58$BEGIN, (SubLObject)inference_datastructures_strategy.$sym59$MAKE_STRATEGY, (SubLObject)inference_datastructures_strategy.SIXTEEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_strategy.$kw60$SLOT, (SubLObject)inference_datastructures_strategy.$kw41$SUID, strat_suid(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_strategy.$kw60$SLOT, (SubLObject)inference_datastructures_strategy.$kw42$INFERENCE, strat_inference(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_strategy.$kw60$SLOT, (SubLObject)inference_datastructures_strategy.$kw43$RESULT_UNIQUENESS_CRITERION, strat_result_uniqueness_criterion(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_strategy.$kw60$SLOT, (SubLObject)inference_datastructures_strategy.$kw44$ACTIVE_PROBLEMS, strat_active_problems(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_strategy.$kw60$SLOT, (SubLObject)inference_datastructures_strategy.$kw45$MOTIVATED_PROBLEMS, strat_motivated_problems(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_strategy.$kw60$SLOT, (SubLObject)inference_datastructures_strategy.$kw46$SET_ASIDE_PROBLEMS, strat_set_aside_problems(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_strategy.$kw60$SLOT, (SubLObject)inference_datastructures_strategy.$kw47$SHOULD_RECONSIDER_SET_ASIDES_, strat_should_reconsider_set_asidesP(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_strategy.$kw60$SLOT, (SubLObject)inference_datastructures_strategy.$kw48$PRODUCTIVITY_LIMIT, strat_productivity_limit(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_strategy.$kw60$SLOT, (SubLObject)inference_datastructures_strategy.$kw49$REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT, strat_removal_backtracking_productivity_limit(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_strategy.$kw60$SLOT, (SubLObject)inference_datastructures_strategy.$kw50$PROOF_SPEC, strat_proof_spec(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_strategy.$kw60$SLOT, (SubLObject)inference_datastructures_strategy.$kw51$PROBLEM_PROOF_SPEC_INDEX, strat_problem_proof_spec_index(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_strategy.$kw60$SLOT, (SubLObject)inference_datastructures_strategy.$kw52$PROBLEM_STRATEGIC_INDEX, strat_problem_strategic_index(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_strategy.$kw60$SLOT, (SubLObject)inference_datastructures_strategy.$kw53$MEMOIZATION_STATE, strat_memoization_state(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_strategy.$kw60$SLOT, (SubLObject)inference_datastructures_strategy.$kw54$STEP_COUNT, strat_step_count(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_strategy.$kw60$SLOT, (SubLObject)inference_datastructures_strategy.$kw55$TYPE, strat_type(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_strategy.$kw60$SLOT, (SubLObject)inference_datastructures_strategy.$kw56$DATA, strat_data(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_strategy.$kw61$END, (SubLObject)inference_datastructures_strategy.$sym59$MAKE_STRATEGY, (SubLObject)inference_datastructures_strategy.SIXTEEN_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
    public static SubLObject visit_defstruct_object_strategy_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_strategy(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 4140L)
    public static SubLObject valid_strategy_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_strategy.NIL != strategy_p(v_object) && inference_datastructures_strategy.NIL == strategy_invalid_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 4262L)
    public static SubLObject strategy_invalid_p(final SubLObject strategy) {
        return Equality.eq((SubLObject)inference_datastructures_strategy.$kw63$FREE, strategy_type(strategy));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 4392L)
    public static SubLObject print_strategy(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        if (inference_datastructures_strategy.NIL != strategy_invalid_p(v_object)) {
            PrintLow.format(stream, (SubLObject)inference_datastructures_strategy.$str64$_Invalid_STRATEGY__s_, strat_suid(v_object));
        }
        else {
            final SubLObject strategy_type = strategy_type(v_object);
            final SubLObject strategy_id = strategy_suid(v_object);
            final SubLObject inference = strategy_inference(v_object);
            final SubLObject inference_id = (SubLObject)((inference_datastructures_strategy.NIL != inference) ? inference_datastructures_inference.inference_suid(inference) : inference_datastructures_strategy.NIL);
            final SubLObject store = (SubLObject)((inference_datastructures_strategy.NIL != inference) ? inference_datastructures_inference.inference_problem_store(inference) : inference_datastructures_strategy.NIL);
            final SubLObject store_id = (SubLObject)((inference_datastructures_strategy.NIL != store) ? inference_datastructures_problem_store.problem_store_suid(store) : inference_datastructures_strategy.NIL);
            PrintLow.format(stream, (SubLObject)inference_datastructures_strategy.$str65$__a_STRATEGY__a__a_for_inference_, new SubLObject[] { strategy_type, store_id, strategy_id, store_id, inference_id });
        }
        return (SubLObject)inference_datastructures_strategy.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 5080L)
    public static SubLObject sxhash_strategy_method(final SubLObject v_object) {
        return strat_suid(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 5152L)
    public static SubLObject new_strategy(final SubLObject type, final SubLObject inference) {
        assert inference_datastructures_strategy.NIL != strategy_type_p(type) : type;
        assert inference_datastructures_strategy.NIL != inference_datastructures_inference.inference_p(inference) : inference;
        final SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
        final SubLObject suid = inference_datastructures_problem_store.problem_store_new_strategy_id(store);
        final SubLObject strategy = make_strategy((SubLObject)inference_datastructures_strategy.UNPROVIDED);
        _csetf_strat_suid(strategy, suid);
        _csetf_strat_inference(strategy, inference);
        _csetf_strat_result_uniqueness_criterion(strategy, (SubLObject)inference_datastructures_strategy.NIL);
        _csetf_strat_active_problems(strategy, set.new_set(Symbols.symbol_function((SubLObject)inference_datastructures_strategy.EQ), (SubLObject)inference_datastructures_strategy.UNPROVIDED));
        _csetf_strat_motivated_problems(strategy, set_contents.new_set_contents((SubLObject)inference_datastructures_strategy.ZERO_INTEGER, Symbols.symbol_function((SubLObject)inference_datastructures_strategy.EQ)));
        _csetf_strat_set_aside_problems(strategy, set.new_set(Symbols.symbol_function((SubLObject)inference_datastructures_strategy.EQ), (SubLObject)inference_datastructures_strategy.UNPROVIDED));
        _csetf_strat_problem_proof_spec_index(strategy, dictionary.new_dictionary(Symbols.symbol_function((SubLObject)inference_datastructures_strategy.EQ), (SubLObject)inference_datastructures_strategy.UNPROVIDED));
        _csetf_strat_should_reconsider_set_asidesP(strategy, (SubLObject)inference_datastructures_strategy.NIL);
        _csetf_strat_productivity_limit(strategy, inference_datastructures_enumerated_types.$default_productivity_limit$.getGlobalValue());
        _csetf_strat_removal_backtracking_productivity_limit(strategy, inference_datastructures_enumerated_types.$default_removal_backtracking_productivity_limit$.getGlobalValue());
        _csetf_strat_proof_spec(strategy, inference_datastructures_enumerated_types.$default_proof_spec$.getGlobalValue());
        _csetf_strat_problem_strategic_index(strategy, Hashtables.make_hash_table((SubLObject)inference_datastructures_strategy.ONE_INTEGER, Symbols.symbol_function((SubLObject)inference_datastructures_strategy.EQ), (SubLObject)inference_datastructures_strategy.UNPROVIDED));
        _csetf_strat_memoization_state(strategy, memoization_state.new_memoization_state((SubLObject)inference_datastructures_strategy.$str69$strategy_memoization_state, (SubLObject)inference_datastructures_strategy.UNPROVIDED, (SubLObject)inference_datastructures_strategy.UNPROVIDED, (SubLObject)inference_datastructures_strategy.UNPROVIDED));
        _csetf_strat_step_count(strategy, (SubLObject)inference_datastructures_strategy.ZERO_INTEGER);
        _csetf_strat_type(strategy, type);
        _csetf_strat_data(strategy, (SubLObject)inference_datastructures_strategy.NIL);
        final SubLObject subconstructor = strategy_type_property(type, (SubLObject)inference_datastructures_strategy.$kw70$CONSTRUCTOR);
        Functions.funcall(subconstructor, strategy);
        inference_datastructures_problem_store.add_problem_store_strategy(store, strategy);
        inference_datastructures_inference.add_inference_strategy(inference, strategy);
        return strategy;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 6770L)
    public static SubLObject destroy_strategy(final SubLObject strategy) {
        if (inference_datastructures_strategy.NIL != valid_strategy_p(strategy)) {
            note_strategy_invalid(strategy);
            inference_datastructures_problem_store.remove_problem_store_strategy(strategy_problem_store(strategy), strategy);
            inference_datastructures_inference.remove_inference_strategy(strategy_inference(strategy), strategy);
            return destroy_strategy_int(strategy);
        }
        return (SubLObject)inference_datastructures_strategy.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 7155L)
    public static SubLObject destroy_problem_store_strategy(final SubLObject strategy) {
        if (inference_datastructures_strategy.NIL != valid_strategy_p(strategy)) {
            note_strategy_invalid(strategy);
            return destroy_strategy_int(strategy);
        }
        return (SubLObject)inference_datastructures_strategy.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 7420L)
    public static SubLObject destroy_inference_strategy(final SubLObject strategy) {
        if (inference_datastructures_strategy.NIL != valid_strategy_p(strategy)) {
            note_strategy_invalid(strategy);
            inference_datastructures_problem_store.remove_problem_store_strategy(strategy_problem_store(strategy), strategy);
            return destroy_strategy_int(strategy);
        }
        return (SubLObject)inference_datastructures_strategy.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 7745L)
    public static SubLObject destroy_strategy_int(final SubLObject strategy) {
        _csetf_strat_data(strategy, (SubLObject)inference_datastructures_strategy.$kw63$FREE);
        _csetf_strat_proof_spec(strategy, (SubLObject)inference_datastructures_strategy.$kw63$FREE);
        _csetf_strat_removal_backtracking_productivity_limit(strategy, (SubLObject)inference_datastructures_strategy.$kw63$FREE);
        _csetf_strat_productivity_limit(strategy, (SubLObject)inference_datastructures_strategy.$kw63$FREE);
        _csetf_strat_should_reconsider_set_asidesP(strategy, (SubLObject)inference_datastructures_strategy.$kw63$FREE);
        memoization_state.clear_all_memoization(strategy_memoization_state(strategy));
        _csetf_strat_memoization_state(strategy, (SubLObject)inference_datastructures_strategy.$kw63$FREE);
        dictionary.clear_dictionary(strat_problem_proof_spec_index(strategy));
        _csetf_strat_problem_proof_spec_index(strategy, (SubLObject)inference_datastructures_strategy.$kw63$FREE);
        Hashtables.clrhash(strat_problem_strategic_index(strategy));
        _csetf_strat_problem_strategic_index(strategy, (SubLObject)inference_datastructures_strategy.$kw63$FREE);
        set.clear_set(strat_set_aside_problems(strategy));
        _csetf_strat_set_aside_problems(strategy, (SubLObject)inference_datastructures_strategy.$kw63$FREE);
        set.clear_set(strat_active_problems(strategy));
        _csetf_strat_active_problems(strategy, (SubLObject)inference_datastructures_strategy.$kw63$FREE);
        set_contents.clear_set_contents(strat_motivated_problems(strategy));
        _csetf_strat_motivated_problems(strategy, (SubLObject)inference_datastructures_strategy.$kw63$FREE);
        _csetf_strat_result_uniqueness_criterion(strategy, (SubLObject)inference_datastructures_strategy.$kw63$FREE);
        _csetf_strat_inference(strategy, (SubLObject)inference_datastructures_strategy.$kw63$FREE);
        return (SubLObject)inference_datastructures_strategy.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 8964L)
    public static SubLObject note_strategy_invalid(final SubLObject strategy) {
        _csetf_strat_type(strategy, (SubLObject)inference_datastructures_strategy.$kw63$FREE);
        return strategy;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 9070L)
    public static SubLObject remove_strategy_problem(final SubLObject strategy, final SubLObject problem) {
        strategy_note_problem_inactive(strategy, problem);
        strategy_note_problem_unmotivated(strategy, problem);
        strategy_clear_problem_set_aside(strategy, problem);
        remove_problem_strategic_properties(problem, strategy);
        return (SubLObject)inference_datastructures_strategy.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 9363L)
    public static SubLObject strategy_suid(final SubLObject strategy) {
        assert inference_datastructures_strategy.NIL != strategy_p(strategy) : strategy;
        return strat_suid(strategy);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 9485L)
    public static SubLObject strategy_inference(final SubLObject strategy) {
        assert inference_datastructures_strategy.NIL != strategy_p(strategy) : strategy;
        return strat_inference(strategy);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 9605L)
    public static SubLObject strategy_local_result_uniqueness_criterion(final SubLObject strategy) {
        assert inference_datastructures_strategy.NIL != strategy_p(strategy) : strategy;
        return strat_result_uniqueness_criterion(strategy);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 9765L)
    public static SubLObject strategy_problem_strategic_index(final SubLObject strategy) {
        return strat_problem_strategic_index(strategy);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 9876L)
    public static SubLObject strategy_type(final SubLObject strategy) {
        return strat_type(strategy);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 9987L)
    public static SubLObject strategy_data(final SubLObject strategy) {
        assert inference_datastructures_strategy.NIL != strategy_p(strategy) : strategy;
        return strat_data(strategy);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 10097L)
    public static SubLObject strategy_active_problems(final SubLObject strategy) {
        assert inference_datastructures_strategy.NIL != strategy_p(strategy) : strategy;
        return strat_active_problems(strategy);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 10271L)
    public static SubLObject strategy_motivated_problems(final SubLObject strategy) {
        assert inference_datastructures_strategy.NIL != strategy_p(strategy) : strategy;
        return strat_motivated_problems(strategy);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 10454L)
    public static SubLObject strategy_set_aside_problems(final SubLObject strategy) {
        assert inference_datastructures_strategy.NIL != strategy_p(strategy) : strategy;
        return strat_set_aside_problems(strategy);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 10637L)
    public static SubLObject strategy_should_reconsider_set_asidesP(final SubLObject strategy) {
        assert inference_datastructures_strategy.NIL != strategy_p(strategy) : strategy;
        return strat_should_reconsider_set_asidesP(strategy);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 10797L)
    public static SubLObject strategy_productivity_limit(final SubLObject strategy) {
        assert inference_datastructures_strategy.NIL != strategy_p(strategy) : strategy;
        return strat_productivity_limit(strategy);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 11058L)
    public static SubLObject strategy_removal_backtracking_productivity_limit(final SubLObject strategy) {
        assert inference_datastructures_strategy.NIL != strategy_p(strategy) : strategy;
        return strat_removal_backtracking_productivity_limit(strategy);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 11373L)
    public static SubLObject strategy_proof_spec(final SubLObject strategy) {
        assert inference_datastructures_strategy.NIL != strategy_p(strategy) : strategy;
        return strat_proof_spec(strategy);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 11575L)
    public static SubLObject strategy_problem_proof_spec_index(final SubLObject strategy) {
        assert inference_datastructures_strategy.NIL != strategy_p(strategy) : strategy;
        return strat_problem_proof_spec_index(strategy);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 11782L)
    public static SubLObject strategy_step_count(final SubLObject strategy) {
        assert inference_datastructures_strategy.NIL != strategy_p(strategy) : strategy;
        return strat_step_count(strategy);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 11904L)
    public static SubLObject set_strategy_result_uniqueness_criterion(final SubLObject strategy, final SubLObject result_uniqueness_criterion) {
        assert inference_datastructures_strategy.NIL != strategy_p(strategy) : strategy;
        assert inference_datastructures_strategy.NIL != inference_datastructures_enumerated_types.result_uniqueness_criterion_p(result_uniqueness_criterion) : result_uniqueness_criterion;
        _csetf_strat_result_uniqueness_criterion(strategy, result_uniqueness_criterion);
        return strategy;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 12222L)
    public static SubLObject set_strategy_productivity_limit(final SubLObject strategy, final SubLObject productivity_limit) {
        assert inference_datastructures_strategy.NIL != strategy_p(strategy) : strategy;
        assert inference_datastructures_strategy.NIL != inference_datastructures_enumerated_types.productivity_p(productivity_limit) : productivity_limit;
        _csetf_strat_productivity_limit(strategy, productivity_limit);
        return strategy;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 12470L)
    public static SubLObject set_strategy_removal_backtracking_productivity_limit(final SubLObject strategy, final SubLObject productivity_limit) {
        assert inference_datastructures_strategy.NIL != strategy_p(strategy) : strategy;
        assert inference_datastructures_strategy.NIL != inference_datastructures_enumerated_types.productivity_p(productivity_limit) : productivity_limit;
        _csetf_strat_removal_backtracking_productivity_limit(strategy, productivity_limit);
        return strategy;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 12760L)
    public static SubLObject set_strategy_proof_spec(final SubLObject strategy, final SubLObject proof_spec) {
        assert inference_datastructures_strategy.NIL != strategy_p(strategy) : strategy;
        assert inference_datastructures_strategy.NIL != inference_proof_spec.proof_spec_p(proof_spec) : proof_spec;
        _csetf_strat_proof_spec(strategy, proof_spec);
        return strategy;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 12966L)
    public static SubLObject set_strategy_data(final SubLObject strategy, final SubLObject data) {
        assert inference_datastructures_strategy.NIL != strategy_p(strategy) : strategy;
        _csetf_strat_data(strategy, data);
        return strategy;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 13109L)
    public static SubLObject do_strategy_active_problems(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_strategy.$list80);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject problem_var = (SubLObject)inference_datastructures_strategy.NIL;
        SubLObject strategy = (SubLObject)inference_datastructures_strategy.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_strategy.$list80);
        problem_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_strategy.$list80);
        strategy = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)inference_datastructures_strategy.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)inference_datastructures_strategy.NIL;
        SubLObject current_$1 = (SubLObject)inference_datastructures_strategy.NIL;
        while (inference_datastructures_strategy.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_datastructures_strategy.$list80);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_datastructures_strategy.$list80);
            if (inference_datastructures_strategy.NIL == conses_high.member(current_$1, (SubLObject)inference_datastructures_strategy.$list81, (SubLObject)inference_datastructures_strategy.UNPROVIDED, (SubLObject)inference_datastructures_strategy.UNPROVIDED)) {
                bad = (SubLObject)inference_datastructures_strategy.T;
            }
            if (current_$1 == inference_datastructures_strategy.$kw82$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (inference_datastructures_strategy.NIL != bad && inference_datastructures_strategy.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_datastructures_strategy.$list80);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)inference_datastructures_strategy.$kw83$DONE, current);
        final SubLObject done = (SubLObject)((inference_datastructures_strategy.NIL != done_tail) ? conses_high.cadr(done_tail) : inference_datastructures_strategy.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)inference_datastructures_strategy.$sym84$DO_SET, (SubLObject)ConsesLow.list(problem_var, (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_strategy.$sym71$STRATEGY_ACTIVE_PROBLEMS, strategy), (SubLObject)inference_datastructures_strategy.$kw83$DONE, done), ConsesLow.append(body, (SubLObject)inference_datastructures_strategy.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 13311L)
    public static SubLObject do_strategy_motivated_problems(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_strategy.$list80);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject problem_var = (SubLObject)inference_datastructures_strategy.NIL;
        SubLObject strategy = (SubLObject)inference_datastructures_strategy.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_strategy.$list80);
        problem_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_strategy.$list80);
        strategy = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)inference_datastructures_strategy.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)inference_datastructures_strategy.NIL;
        SubLObject current_$2 = (SubLObject)inference_datastructures_strategy.NIL;
        while (inference_datastructures_strategy.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_datastructures_strategy.$list80);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_datastructures_strategy.$list80);
            if (inference_datastructures_strategy.NIL == conses_high.member(current_$2, (SubLObject)inference_datastructures_strategy.$list81, (SubLObject)inference_datastructures_strategy.UNPROVIDED, (SubLObject)inference_datastructures_strategy.UNPROVIDED)) {
                bad = (SubLObject)inference_datastructures_strategy.T;
            }
            if (current_$2 == inference_datastructures_strategy.$kw82$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (inference_datastructures_strategy.NIL != bad && inference_datastructures_strategy.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_datastructures_strategy.$list80);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)inference_datastructures_strategy.$kw83$DONE, current);
        final SubLObject done = (SubLObject)((inference_datastructures_strategy.NIL != done_tail) ? conses_high.cadr(done_tail) : inference_datastructures_strategy.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)inference_datastructures_strategy.$sym85$DO_SET_CONTENTS, (SubLObject)ConsesLow.list(problem_var, (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_strategy.$sym73$STRATEGY_MOTIVATED_PROBLEMS, strategy), (SubLObject)inference_datastructures_strategy.$kw83$DONE, done), ConsesLow.append(body, (SubLObject)inference_datastructures_strategy.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 13514L)
    public static SubLObject do_strategy_set_aside_problems(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_strategy.$list80);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject problem_var = (SubLObject)inference_datastructures_strategy.NIL;
        SubLObject strategy = (SubLObject)inference_datastructures_strategy.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_strategy.$list80);
        problem_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_strategy.$list80);
        strategy = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)inference_datastructures_strategy.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)inference_datastructures_strategy.NIL;
        SubLObject current_$3 = (SubLObject)inference_datastructures_strategy.NIL;
        while (inference_datastructures_strategy.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_datastructures_strategy.$list80);
            current_$3 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_datastructures_strategy.$list80);
            if (inference_datastructures_strategy.NIL == conses_high.member(current_$3, (SubLObject)inference_datastructures_strategy.$list81, (SubLObject)inference_datastructures_strategy.UNPROVIDED, (SubLObject)inference_datastructures_strategy.UNPROVIDED)) {
                bad = (SubLObject)inference_datastructures_strategy.T;
            }
            if (current_$3 == inference_datastructures_strategy.$kw82$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (inference_datastructures_strategy.NIL != bad && inference_datastructures_strategy.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_datastructures_strategy.$list80);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)inference_datastructures_strategy.$kw83$DONE, current);
        final SubLObject done = (SubLObject)((inference_datastructures_strategy.NIL != done_tail) ? conses_high.cadr(done_tail) : inference_datastructures_strategy.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)inference_datastructures_strategy.$sym84$DO_SET, (SubLObject)ConsesLow.list(problem_var, (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_strategy.$sym75$STRATEGY_SET_ASIDE_PROBLEMS, strategy), (SubLObject)inference_datastructures_strategy.$kw83$DONE, done), ConsesLow.append(body, (SubLObject)inference_datastructures_strategy.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 13898L)
    public static SubLObject with_strategy_memoization_state(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject strategy = (SubLObject)inference_datastructures_strategy.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_strategy.$list86);
        strategy = current.first();
        final SubLObject body;
        current = (body = current.rest());
        final SubLObject strategy_var = (SubLObject)inference_datastructures_strategy.$sym87$STRATEGY_VAR;
        final SubLObject state_var = (SubLObject)inference_datastructures_strategy.$sym88$STATE_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_strategy.$sym89$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(strategy_var, strategy), (SubLObject)ConsesLow.list(state_var, (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_strategy.$sym90$STRATEGY_MEMOIZATION_STATE, strategy_var)), (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_strategy.$sym91$_CURRENT_STRATEGY_WRT_MEMOIZATION_, strategy_var)), (SubLObject)ConsesLow.listS((SubLObject)inference_datastructures_strategy.$sym92$WITH_MEMOIZATION_STATE, (SubLObject)ConsesLow.list(state_var), ConsesLow.append(body, (SubLObject)inference_datastructures_strategy.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 14234L)
    public static SubLObject strategy_memoization_state(final SubLObject strategy) {
        return strat_memoization_state(strategy);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 14417L)
    public static SubLObject current_strategy_wrt_memoization() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return inference_datastructures_strategy.$current_strategy_wrt_memoization$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 14562L)
    public static SubLObject strategic_context_inference(final SubLObject strategic_context) {
        return (SubLObject)((inference_datastructures_strategy.NIL != strategy_p(strategic_context)) ? strategy_inference(strategic_context) : inference_datastructures_strategy.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 14730L)
    public static SubLObject strategy_answer_link(final SubLObject strategy) {
        return inference_datastructures_inference.inference_root_link(strategy_inference(strategy));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 14951L)
    public static SubLObject strategy_answer_link_propagatedP(final SubLObject strategy) {
        return inference_worker_answer.answer_link_propagatedP(strategy_answer_link(strategy));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 15238L)
    public static SubLObject strategy_should_propagate_answer_linkP(final SubLObject strategy) {
        if (inference_datastructures_strategy.NIL != strategy_answer_link_propagatedP(strategy)) {
            return (SubLObject)inference_datastructures_strategy.NIL;
        }
        if (inference_datastructures_strategy.NIL != inference_worker.inference_deems_answer_link_should_be_closedP(strategy_inference(strategy), strategy_answer_link(strategy)) && inference_datastructures_strategy.NIL != inference_datastructures_inference.inference_has_some_answerP(strategy_inference(strategy))) {
            return (SubLObject)inference_datastructures_strategy.NIL;
        }
        return (SubLObject)inference_datastructures_strategy.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 16020L)
    public static SubLObject strategy_root_problem(final SubLObject strategy) {
        return inference_datastructures_inference.inference_root_problem(strategy_inference(strategy));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 16242L)
    public static SubLObject strategy_continuableP(final SubLObject strategy) {
        return inference_datastructures_inference.inference_continuableP(strategy_inference(strategy));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 16358L)
    public static SubLObject problem_active_in_strategyP(final SubLObject problem, final SubLObject strategy) {
        return set.set_memberP(problem, strategy_active_problems(strategy));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 16491L)
    public static SubLObject problem_motivatedP(final SubLObject problem, final SubLObject strategy) {
        return set_contents.set_contents_memberP(problem, strategy_motivated_problems(strategy), Symbols.symbol_function((SubLObject)inference_datastructures_strategy.EQ));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 16632L)
    public static SubLObject problem_set_aside_in_strategyP(final SubLObject problem, final SubLObject strategy) {
        return set.set_memberP(problem, strategy_set_aside_problems(strategy));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 16772L)
    public static SubLObject strategy_has_some_set_aside_problemsP(final SubLObject strategy) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_strategy.NIL == set.set_emptyP(strategy_set_aside_problems(strategy)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 16908L)
    public static SubLObject strategy_all_valid_set_aside_problems(final SubLObject strategy) {
        return list_utilities.delete_if_not((SubLObject)inference_datastructures_strategy.$sym95$VALID_PROBLEM_P, set.set_element_list(strategy_set_aside_problems(strategy)), (SubLObject)inference_datastructures_strategy.UNPROVIDED, (SubLObject)inference_datastructures_strategy.UNPROVIDED, (SubLObject)inference_datastructures_strategy.UNPROVIDED, (SubLObject)inference_datastructures_strategy.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 17076L)
    public static SubLObject strategy_problem_store(final SubLObject strategy) {
        return inference_datastructures_inference.inference_problem_store(strategy_inference(strategy));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 17195L)
    public static SubLObject strategy_result_uniqueness_criterion(final SubLObject strategy) {
        final SubLObject local_criterion = strategy_local_result_uniqueness_criterion(strategy);
        if (inference_datastructures_strategy.NIL != local_criterion) {
            return local_criterion;
        }
        final SubLObject inference = strategy_inference(strategy);
        return inference_datastructures_inference.inference_result_uniqueness_criterion(inference);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 17618L)
    public static SubLObject strategy_unique_wrt_proofsP(final SubLObject strategy) {
        return Equality.eq((SubLObject)inference_datastructures_strategy.$kw96$PROOF, strategy_result_uniqueness_criterion(strategy));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 17745L)
    public static SubLObject strategy_unique_wrt_bindingsP(final SubLObject strategy) {
        return Equality.eq((SubLObject)inference_datastructures_strategy.$kw97$BINDINGS, strategy_result_uniqueness_criterion(strategy));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 17877L)
    public static SubLObject strategy_wants_one_answerP(final SubLObject strategy) {
        return (SubLObject)inference_datastructures_strategy.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 18049L)
    public static SubLObject strategy_active_problem_count(final SubLObject strategy) {
        return set.set_size(strategy_active_problems(strategy));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 18165L)
    public static SubLObject strategy_motivated_problem_count(final SubLObject strategy) {
        return set_contents.set_contents_size(strategy_motivated_problems(strategy));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 18296L)
    public static SubLObject strategy_set_aside_problem_count(final SubLObject strategy) {
        return set.set_size(strategy_set_aside_problems(strategy));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 18418L)
    public static SubLObject strategy_problem_proof_spec(final SubLObject strategy, final SubLObject problem) {
        assert inference_datastructures_strategy.NIL != strategy_p(strategy) : strategy;
        assert inference_datastructures_strategy.NIL != inference_datastructures_problem.problem_p(problem) : problem;
        return dictionary.dictionary_lookup_without_values(strategy_problem_proof_spec_index(strategy), problem, (SubLObject)inference_datastructures_strategy.$kw99$ANYTHING);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 18683L)
    public static SubLObject set_strategy_property(final SubLObject strategy, final SubLObject property, final SubLObject value) {
        assert inference_datastructures_strategy.NIL != strategy_p(strategy) : strategy;
        assert inference_datastructures_strategy.NIL != inference_datastructures_enumerated_types.strategy_property_p(property) : property;
        if (property.eql((SubLObject)inference_datastructures_strategy.$kw48$PRODUCTIVITY_LIMIT)) {
            set_strategy_productivity_limit(strategy, value);
        }
        else if (property.eql((SubLObject)inference_datastructures_strategy.$kw49$REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT)) {
            set_strategy_removal_backtracking_productivity_limit(strategy, value);
        }
        else if (property.eql((SubLObject)inference_datastructures_strategy.$kw50$PROOF_SPEC)) {
            set_strategy_proof_spec(strategy, value);
        }
        else {
            Errors.error((SubLObject)inference_datastructures_strategy.$str101$Unexpected_strategy_property__s_w, property, value);
        }
        return strategy;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 19246L)
    public static SubLObject copy_strategy_properties(final SubLObject source_strategy, final SubLObject target_strategy) {
        set_strategy_productivity_limit(target_strategy, strategy_productivity_limit(source_strategy));
        set_strategy_removal_backtracking_productivity_limit(target_strategy, strategy_removal_backtracking_productivity_limit(source_strategy));
        set_strategy_proof_spec(target_strategy, strategy_proof_spec(source_strategy));
        return target_strategy;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 19728L)
    public static SubLObject set_strategy_properties(final SubLObject strategy, final SubLObject strategy_properties) {
        assert inference_datastructures_strategy.NIL != inference_datastructures_enumerated_types.strategy_properties_p(strategy_properties) : strategy_properties;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = (SubLObject)inference_datastructures_strategy.NIL, remainder = strategy_properties; inference_datastructures_strategy.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            property = remainder.first();
            value = conses_high.cadr(remainder);
            set_strategy_property(strategy, property, value);
        }
        return strategy;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 19979L)
    public static SubLObject strategy_note_problem_active(final SubLObject strategy, final SubLObject problem) {
        set.set_add(problem, strategy_active_problems(strategy));
        return strategy;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 20152L)
    public static SubLObject strategy_note_problem_inactive(final SubLObject strategy, final SubLObject problem) {
        set.set_remove(problem, strategy_active_problems(strategy));
        return strategy;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 20298L)
    public static SubLObject strategy_note_problem_motivated(final SubLObject strategy, final SubLObject problem) {
        final SubLObject motivated_problems = strategy_motivated_problems(strategy);
        _csetf_strat_motivated_problems(strategy, set_contents.set_contents_add(problem, motivated_problems, Symbols.symbol_function((SubLObject)inference_datastructures_strategy.EQ)));
        controlling_strategy_callback(strategy, (SubLObject)inference_datastructures_strategy.$kw103$SUBSTRATEGY_STRATEGEM_MOTIVATED, problem, (SubLObject)inference_datastructures_strategy.UNPROVIDED, (SubLObject)inference_datastructures_strategy.UNPROVIDED, (SubLObject)inference_datastructures_strategy.UNPROVIDED);
        return strategy;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 20640L)
    public static SubLObject strategy_note_problem_unmotivated(final SubLObject strategy, final SubLObject problem) {
        set_contents.set_contents_delete(problem, strategy_motivated_problems(strategy), Symbols.symbol_function((SubLObject)inference_datastructures_strategy.EQ));
        return strategy;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 20806L)
    public static SubLObject strategy_note_problem_set_aside(final SubLObject strategy, final SubLObject problem) {
        set.set_add(problem, strategy_set_aside_problems(strategy));
        return strategy;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 20954L)
    public static SubLObject strategy_clear_problem_set_aside(final SubLObject strategy, final SubLObject problem) {
        set.set_remove(problem, strategy_set_aside_problems(strategy));
        return strategy;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 21105L)
    public static SubLObject strategy_clear_set_asides(final SubLObject strategy) {
        set.clear_set(strategy_set_aside_problems(strategy));
        return strategy;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 21232L)
    public static SubLObject note_strategy_should_reconsider_set_asides(final SubLObject strategy) {
        _csetf_strat_should_reconsider_set_asidesP(strategy, (SubLObject)inference_datastructures_strategy.T);
        return strategy;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 21383L)
    public static SubLObject clear_strategy_should_reconsider_set_asides(final SubLObject strategy) {
        _csetf_strat_should_reconsider_set_asidesP(strategy, (SubLObject)inference_datastructures_strategy.NIL);
        return strategy;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 21536L)
    public static SubLObject with_strategically_active_problem(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_strategy.$list104);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject strategy = (SubLObject)inference_datastructures_strategy.NIL;
        SubLObject problem = (SubLObject)inference_datastructures_strategy.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_strategy.$list104);
        strategy = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_strategy.$list104);
        problem = current.first();
        current = current.rest();
        if (inference_datastructures_strategy.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject strategy_var = (SubLObject)inference_datastructures_strategy.$sym105$STRATEGY_VAR;
            final SubLObject problem_var = (SubLObject)inference_datastructures_strategy.$sym106$PROBLEM_VAR;
            return (SubLObject)ConsesLow.listS((SubLObject)inference_datastructures_strategy.$sym89$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(strategy_var, strategy), (SubLObject)ConsesLow.list(problem_var, problem)), (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_strategy.$sym107$STRATEGY_NOTE_PROBLEM_ACTIVE, strategy_var, problem_var), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)inference_datastructures_strategy.$sym108$STRATEGY_NOTE_PROBLEM_INACTIVE, strategy_var, problem_var), (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_strategy.$sym109$POSSIBLY_REACTIVATE_PROBLEM, strategy_var, problem_var))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_datastructures_strategy.$list104);
        return (SubLObject)inference_datastructures_strategy.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 22094L)
    public static SubLObject strategy_note_problem_proof_spec(final SubLObject strategy, final SubLObject problem, final SubLObject proof_spec) {
        assert inference_datastructures_strategy.NIL != inference_datastructures_problem.problem_p(problem) : problem;
        final SubLObject old_value = dictionary.dictionary_lookup_without_values(strategy_problem_proof_spec_index(strategy), problem, (SubLObject)inference_datastructures_strategy.$kw110$NOTHING);
        final SubLObject new_value = inference_proof_spec.merge_2_proof_specs(old_value, proof_spec);
        if (!new_value.equal(old_value)) {
            dictionary.dictionary_enter(strategy_problem_proof_spec_index(strategy), problem, new_value);
            set_problem_recompute_thrown_away(problem, strategy);
            return (SubLObject)inference_datastructures_strategy.T;
        }
        return (SubLObject)inference_datastructures_strategy.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 22853L)
    public static SubLObject increment_strategy_step_count(final SubLObject strategy) {
        SubLObject step_count = strat_step_count(strategy);
        step_count = Numbers.add(step_count, (SubLObject)inference_datastructures_strategy.ONE_INTEGER);
        _csetf_strat_step_count(strategy, step_count);
        return step_count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 23060L)
    public static SubLObject strategy_dispatch(final SubLObject strategy, final SubLObject method_type, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        final SubLObject arg1_providedP = (SubLObject)SubLObjectFactory.makeBoolean(arg1 != inference_datastructures_strategy.UNPROVIDED);
        final SubLObject arg2_providedP = (SubLObject)SubLObjectFactory.makeBoolean(arg2 != inference_datastructures_strategy.UNPROVIDED);
        final SubLObject arg3_providedP = (SubLObject)SubLObjectFactory.makeBoolean(arg3 != inference_datastructures_strategy.UNPROVIDED);
        final SubLObject arg4_providedP = (SubLObject)SubLObjectFactory.makeBoolean(arg4 != inference_datastructures_strategy.UNPROVIDED);
        final SubLObject arg5_providedP = (SubLObject)SubLObjectFactory.makeBoolean(arg5 != inference_datastructures_strategy.UNPROVIDED);
        if (arg1 == inference_datastructures_strategy.UNPROVIDED) {
            arg1 = (SubLObject)inference_datastructures_strategy.NIL;
        }
        if (arg2 == inference_datastructures_strategy.UNPROVIDED) {
            arg2 = (SubLObject)inference_datastructures_strategy.NIL;
        }
        if (arg3 == inference_datastructures_strategy.UNPROVIDED) {
            arg3 = (SubLObject)inference_datastructures_strategy.NIL;
        }
        if (arg4 == inference_datastructures_strategy.UNPROVIDED) {
            arg4 = (SubLObject)inference_datastructures_strategy.NIL;
        }
        if (arg5 == inference_datastructures_strategy.UNPROVIDED) {
            arg5 = (SubLObject)inference_datastructures_strategy.NIL;
        }
        SubLObject handler_func = strategy_dispatch_handler(strategy, method_type);
        if (inference_datastructures_strategy.NIL == handler_func) {
            handler_func = inference_datastructures_enumerated_types.strategy_default_method_handler(method_type);
        }
        if (inference_datastructures_strategy.NIL == handler_func && inference_datastructures_strategy.NIL != balancing_tactician.balancing_tactician_p(strategy)) {
            return Errors.error((SubLObject)inference_datastructures_strategy.$str111$balancing_tactician_does_not_impl, method_type);
        }
        if (inference_datastructures_strategy.NIL != arg5_providedP) {
            return strategy_dispatch_funcall_5(handler_func, strategy, arg1, arg2, arg3, arg4, arg5);
        }
        if (inference_datastructures_strategy.NIL != arg4_providedP) {
            return strategy_dispatch_funcall_4(handler_func, strategy, arg1, arg2, arg3, arg4);
        }
        if (inference_datastructures_strategy.NIL != arg3_providedP) {
            return strategy_dispatch_funcall_3(handler_func, strategy, arg1, arg2, arg3);
        }
        if (inference_datastructures_strategy.NIL != arg2_providedP) {
            return strategy_dispatch_funcall_2(handler_func, strategy, arg1, arg2);
        }
        if (inference_datastructures_strategy.NIL != arg1_providedP) {
            return strategy_dispatch_funcall_1(handler_func, strategy, arg1);
        }
        return strategy_dispatch_funcall_0(handler_func, strategy);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 24236L)
    public static SubLObject strategy_dispatch_handler(final SubLObject strategy, final SubLObject method_type) {
        final SubLObject strategy_type = strategy_type(strategy);
        return inference_tactician.strategy_type_dispatch_handler(strategy_type, method_type);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 24424L)
    public static SubLObject strategy_dispatch_funcall_0(final SubLObject func, final SubLObject strategy) {
        return Functions.funcall(func, strategy);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 24546L)
    public static SubLObject strategy_dispatch_funcall_1(final SubLObject func, final SubLObject strategy, final SubLObject arg1) {
        return Functions.funcall(func, strategy, arg1);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 24678L)
    public static SubLObject strategy_dispatch_funcall_2(final SubLObject func, final SubLObject strategy, final SubLObject arg1, final SubLObject arg2) {
        return Functions.funcall(func, strategy, arg1, arg2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 24826L)
    public static SubLObject strategy_dispatch_funcall_3(final SubLObject func, final SubLObject strategy, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3) {
        return Functions.funcall(func, strategy, arg1, arg2, arg3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 24984L)
    public static SubLObject strategy_dispatch_funcall_4(final SubLObject func, final SubLObject strategy, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4) {
        return Functions.funcall(func, strategy, arg1, arg2, arg3, arg4);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 25152L)
    public static SubLObject strategy_dispatch_funcall_5(final SubLObject func, final SubLObject strategy, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5) {
        return Functions.funcall(func, strategy, arg1, arg2, arg3, arg4, arg5);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 25330L)
    public static SubLObject strategy_dispatch_unexpected_strategy_type_error(final SubLObject strategy) {
        return Errors.error((SubLObject)inference_datastructures_strategy.$str112$Unexpected_strategy_type__a, strategy);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 25498L)
    public static SubLObject controlling_strategy_callback(final SubLObject substrategy, final SubLObject method_type, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4) {
        final SubLObject arg1_providedP = (SubLObject)SubLObjectFactory.makeBoolean(arg1 != inference_datastructures_strategy.UNPROVIDED);
        final SubLObject arg2_providedP = (SubLObject)SubLObjectFactory.makeBoolean(arg2 != inference_datastructures_strategy.UNPROVIDED);
        final SubLObject arg3_providedP = (SubLObject)SubLObjectFactory.makeBoolean(arg3 != inference_datastructures_strategy.UNPROVIDED);
        final SubLObject arg4_providedP = (SubLObject)SubLObjectFactory.makeBoolean(arg4 != inference_datastructures_strategy.UNPROVIDED);
        if (arg1 == inference_datastructures_strategy.UNPROVIDED) {
            arg1 = (SubLObject)inference_datastructures_strategy.NIL;
        }
        if (arg2 == inference_datastructures_strategy.UNPROVIDED) {
            arg2 = (SubLObject)inference_datastructures_strategy.NIL;
        }
        if (arg3 == inference_datastructures_strategy.UNPROVIDED) {
            arg3 = (SubLObject)inference_datastructures_strategy.NIL;
        }
        if (arg4 == inference_datastructures_strategy.UNPROVIDED) {
            arg4 = (SubLObject)inference_datastructures_strategy.NIL;
        }
        final SubLObject controlling_strategy = inference_tactician.controlling_strategy(substrategy);
        if (substrategy.eql(controlling_strategy)) {
            return (SubLObject)inference_datastructures_strategy.NIL;
        }
        if (inference_datastructures_strategy.NIL != arg4_providedP) {
            return strategy_dispatch(controlling_strategy, method_type, substrategy, arg1, arg2, arg3, arg4);
        }
        if (inference_datastructures_strategy.NIL != arg3_providedP) {
            return strategy_dispatch(controlling_strategy, method_type, substrategy, arg1, arg2, arg3, (SubLObject)inference_datastructures_strategy.UNPROVIDED);
        }
        if (inference_datastructures_strategy.NIL != arg2_providedP) {
            return strategy_dispatch(controlling_strategy, method_type, substrategy, arg1, arg2, (SubLObject)inference_datastructures_strategy.UNPROVIDED, (SubLObject)inference_datastructures_strategy.UNPROVIDED);
        }
        if (inference_datastructures_strategy.NIL != arg1_providedP) {
            return strategy_dispatch(controlling_strategy, method_type, substrategy, arg1, (SubLObject)inference_datastructures_strategy.UNPROVIDED, (SubLObject)inference_datastructures_strategy.UNPROVIDED, (SubLObject)inference_datastructures_strategy.UNPROVIDED);
        }
        return strategy_dispatch(controlling_strategy, method_type, substrategy, (SubLObject)inference_datastructures_strategy.UNPROVIDED, (SubLObject)inference_datastructures_strategy.UNPROVIDED, (SubLObject)inference_datastructures_strategy.UNPROVIDED, (SubLObject)inference_datastructures_strategy.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 26754L)
    public static SubLObject strategy_type_p(final SubLObject v_object) {
        return dictionary.dictionary_lookup(inference_datastructures_strategy.$strategy_type_store$.getGlobalValue(), v_object, (SubLObject)inference_datastructures_strategy.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 26856L)
    public static SubLObject new_strategy_type(final SubLObject type, final SubLObject plist) {
        assert inference_datastructures_strategy.NIL != list_utilities.property_list_p(plist) : plist;
        deregister_strategy_type(type);
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = (SubLObject)inference_datastructures_strategy.NIL, remainder = plist; inference_datastructures_strategy.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            property = remainder.first();
            value = conses_high.cadr(remainder);
            set_strategy_type_property(type, property, value);
        }
        return type;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 27104L)
    public static SubLObject deregister_strategy_type(final SubLObject type) {
        return dictionary.dictionary_remove(inference_datastructures_strategy.$strategy_type_store$.getGlobalValue(), type);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 27225L)
    public static SubLObject clear_strategy_type_store() {
        dictionary.clear_dictionary(inference_datastructures_strategy.$strategy_type_store$.getGlobalValue());
        return (SubLObject)inference_datastructures_strategy.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 27327L)
    public static SubLObject strategy_type_property(final SubLObject type, final SubLObject property) {
        return dictionary_utilities.dictionary_getf(inference_datastructures_strategy.$strategy_type_store$.getGlobalValue(), type, property, (SubLObject)inference_datastructures_strategy.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 27549L)
    public static SubLObject set_strategy_type_property(final SubLObject type, final SubLObject property, final SubLObject value) {
        assert inference_datastructures_strategy.NIL != inference_datastructures_enumerated_types.strategy_type_property_p(property) : property;
        return dictionary_utilities.dictionary_putf(inference_datastructures_strategy.$strategy_type_store$.getGlobalValue(), type, property, value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 27861L)
    public static SubLObject default_uninterestingness_cache_value() {
        return Vectors.make_vector((SubLObject)inference_datastructures_strategy.TWO_INTEGER, (SubLObject)inference_datastructures_strategy.$kw116$RECOMPUTE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 28314L)
    public static SubLObject problem_strategic_properties_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)inference_datastructures_strategy.ZERO_INTEGER);
        return (SubLObject)inference_datastructures_strategy.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 28314L)
    public static SubLObject problem_strategic_properties_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $problem_strategic_properties_native.class) ? inference_datastructures_strategy.T : inference_datastructures_strategy.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 28314L)
    public static SubLObject prob_strategic_properties_status(final SubLObject v_object) {
        assert inference_datastructures_strategy.NIL != problem_strategic_properties_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 28314L)
    public static SubLObject prob_strategic_properties_tactic_strategic_property_index(final SubLObject v_object) {
        assert inference_datastructures_strategy.NIL != problem_strategic_properties_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 28314L)
    public static SubLObject prob_strategic_properties_possible_tactic_count(final SubLObject v_object) {
        assert inference_datastructures_strategy.NIL != problem_strategic_properties_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 28314L)
    public static SubLObject prob_strategic_properties_uninterestingness(final SubLObject v_object) {
        assert inference_datastructures_strategy.NIL != problem_strategic_properties_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 28314L)
    public static SubLObject _csetf_prob_strategic_properties_status(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_strategy.NIL != problem_strategic_properties_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 28314L)
    public static SubLObject _csetf_prob_strategic_properties_tactic_strategic_property_index(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_strategy.NIL != problem_strategic_properties_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 28314L)
    public static SubLObject _csetf_prob_strategic_properties_possible_tactic_count(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_strategy.NIL != problem_strategic_properties_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 28314L)
    public static SubLObject _csetf_prob_strategic_properties_uninterestingness(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_strategy.NIL != problem_strategic_properties_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 28314L)
    public static SubLObject make_problem_strategic_properties(SubLObject arglist) {
        if (arglist == inference_datastructures_strategy.UNPROVIDED) {
            arglist = (SubLObject)inference_datastructures_strategy.NIL;
        }
        final SubLObject v_new = (SubLObject)new $problem_strategic_properties_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)inference_datastructures_strategy.NIL, next = arglist; inference_datastructures_strategy.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)inference_datastructures_strategy.$kw134$STATUS)) {
                _csetf_prob_strategic_properties_status(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_strategy.$kw135$TACTIC_STRATEGIC_PROPERTY_INDEX)) {
                _csetf_prob_strategic_properties_tactic_strategic_property_index(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_strategy.$kw136$POSSIBLE_TACTIC_COUNT)) {
                _csetf_prob_strategic_properties_possible_tactic_count(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_strategy.$kw137$UNINTERESTINGNESS)) {
                _csetf_prob_strategic_properties_uninterestingness(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)inference_datastructures_strategy.$str57$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 28314L)
    public static SubLObject visit_defstruct_problem_strategic_properties(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_strategy.$kw58$BEGIN, (SubLObject)inference_datastructures_strategy.$sym138$MAKE_PROBLEM_STRATEGIC_PROPERTIES, (SubLObject)inference_datastructures_strategy.FOUR_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_strategy.$kw60$SLOT, (SubLObject)inference_datastructures_strategy.$kw134$STATUS, prob_strategic_properties_status(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_strategy.$kw60$SLOT, (SubLObject)inference_datastructures_strategy.$kw135$TACTIC_STRATEGIC_PROPERTY_INDEX, prob_strategic_properties_tactic_strategic_property_index(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_strategy.$kw60$SLOT, (SubLObject)inference_datastructures_strategy.$kw136$POSSIBLE_TACTIC_COUNT, prob_strategic_properties_possible_tactic_count(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_strategy.$kw60$SLOT, (SubLObject)inference_datastructures_strategy.$kw137$UNINTERESTINGNESS, prob_strategic_properties_uninterestingness(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_strategy.$kw61$END, (SubLObject)inference_datastructures_strategy.$sym138$MAKE_PROBLEM_STRATEGIC_PROPERTIES, (SubLObject)inference_datastructures_strategy.FOUR_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 28314L)
    public static SubLObject visit_defstruct_object_problem_strategic_properties_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_problem_strategic_properties(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 28899L)
    public static SubLObject new_problem_strategic_properties() {
        final SubLObject problem_strategic_properties = make_problem_strategic_properties((SubLObject)inference_datastructures_strategy.UNPROVIDED);
        _csetf_prob_strategic_properties_status(problem_strategic_properties, (SubLObject)inference_datastructures_strategy.$kw140$NEW);
        _csetf_prob_strategic_properties_tactic_strategic_property_index(problem_strategic_properties, (SubLObject)inference_datastructures_strategy.NIL);
        _csetf_prob_strategic_properties_possible_tactic_count(problem_strategic_properties, (SubLObject)inference_datastructures_strategy.ZERO_INTEGER);
        _csetf_prob_strategic_properties_uninterestingness(problem_strategic_properties, default_uninterestingness_cache_value());
        return problem_strategic_properties;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 29560L)
    public static SubLObject problem_strategic_properties_int(final SubLObject problem, final SubLObject strategy) {
        assert inference_datastructures_strategy.NIL != inference_datastructures_problem.problem_p(problem) : problem;
        assert inference_datastructures_strategy.NIL != strategy_p(strategy) : strategy;
        final SubLObject problem_strategic_properties = Hashtables.gethash_without_values(problem, strategy_problem_strategic_index(strategy), (SubLObject)inference_datastructures_strategy.UNPROVIDED);
        return problem_strategic_properties;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 29938L)
    public static SubLObject set_problem_strategic_properties(final SubLObject problem, final SubLObject strategy, final SubLObject v_properties) {
        assert inference_datastructures_strategy.NIL != inference_datastructures_problem.problem_p(problem) : problem;
        assert inference_datastructures_strategy.NIL != strategy_p(strategy) : strategy;
        assert inference_datastructures_strategy.NIL != problem_strategic_properties_p(v_properties) : v_properties;
        final SubLObject hash = strategy_problem_strategic_index(strategy);
        Hashtables.sethash(problem, hash, v_properties);
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 30272L)
    public static SubLObject remove_problem_strategic_properties(final SubLObject problem, final SubLObject strategy) {
        final SubLObject hash = strategy_problem_strategic_index(strategy);
        Hashtables.remhash(problem, hash);
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 30450L)
    public static SubLObject problem_strategic_properties(final SubLObject problem, final SubLObject strategy) {
        SubLObject problem_strategic_properties = problem_strategic_properties_int(problem, strategy);
        if (inference_datastructures_strategy.NIL == problem_strategic_properties_p(problem_strategic_properties)) {
            problem_strategic_properties = new_problem_strategic_properties();
            set_problem_strategic_properties(problem, strategy, problem_strategic_properties);
        }
        return problem_strategic_properties;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 31006L)
    public static SubLObject problem_strategic_properties_tactic_strategic_property_index(final SubLObject problem, final SubLObject problem_strategic_properties) {
        SubLObject tactic_properties_vector = prob_strategic_properties_tactic_strategic_property_index(problem_strategic_properties);
        if (!tactic_properties_vector.isVector()) {
            tactic_properties_vector = Vectors.make_vector(inference_datastructures_problem.problem_tactic_count(problem), (SubLObject)inference_datastructures_strategy.UNPROVIDED);
            _csetf_prob_strategic_properties_tactic_strategic_property_index(problem_strategic_properties, tactic_properties_vector);
        }
        if (Sequences.length(tactic_properties_vector).numL(inference_datastructures_problem.problem_tactic_count(problem))) {
            tactic_properties_vector = vector_utilities.extend_vector_to(tactic_properties_vector, inference_datastructures_problem.problem_tactic_count(problem), (SubLObject)inference_datastructures_strategy.UNPROVIDED);
            _csetf_prob_strategic_properties_tactic_strategic_property_index(problem_strategic_properties, tactic_properties_vector);
        }
        return tactic_properties_vector;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 32428L)
    public static SubLObject problem_dwimmed_strategic_status(final SubLObject problem, final SubLObject strategy) {
        final SubLObject strategic_status = problem_raw_strategic_status(problem, strategy);
        if (inference_datastructures_strategy.NIL != inference_worker.problem_goodP(problem)) {
            final SubLObject dwimmed_status = inference_worker.good_version_of_problem_status(strategic_status);
            return dwimmed_status;
        }
        return strategic_status;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 32773L)
    public static SubLObject problem_raw_strategic_status(final SubLObject problem, final SubLObject strategy) {
        final SubLObject problem_strategic_properties = problem_strategic_properties(problem, strategy);
        final SubLObject strategic_status = prob_strategic_properties_status(problem_strategic_properties);
        if (inference_datastructures_strategy.$kw140$NEW == strategic_status && inference_datastructures_strategy.$kw140$NEW != inference_datastructures_problem.problem_status(problem)) {
            return (SubLObject)inference_datastructures_strategy.$kw141$UNEXAMINED;
        }
        return strategic_status;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 33236L)
    public static SubLObject problem_weak_strategic_status(final SubLObject problem, final SubLObject strategy) {
        final SubLObject status = problem_raw_strategic_status(problem, strategy);
        final SubLObject weak_tactical_status = inference_datastructures_enumerated_types.tactical_status_from_problem_status(status);
        return weak_tactical_status;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 33474L)
    public static SubLObject problem_strategic_status(final SubLObject problem, final SubLObject strategy) {
        final SubLObject weak_tactical_status = problem_weak_strategic_status(problem, strategy);
        if (inference_datastructures_strategy.NIL != inference_datastructures_problem.tactically_finished_problem_p(problem)) {
            return (SubLObject)inference_datastructures_strategy.$kw142$FINISHED;
        }
        return weak_tactical_status;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 33798L)
    public static SubLObject problem_strategic_provability_status(final SubLObject problem, final SubLObject strategy) {
        final SubLObject status = problem_dwimmed_strategic_status(problem, strategy);
        final SubLObject weak_provability_status = inference_datastructures_enumerated_types.provability_status_from_problem_status(status);
        if (inference_datastructures_strategy.$kw143$NEUTRAL == weak_provability_status && inference_datastructures_strategy.NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem)) {
            return (SubLObject)inference_datastructures_strategy.$kw144$NO_GOOD;
        }
        return weak_provability_status;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 34248L)
    public static SubLObject problem_tactical_or_strategic_status(final SubLObject problem, final SubLObject strategic_context) {
        assert inference_datastructures_strategy.NIL != inference_worker.strategic_context_p(strategic_context) : strategic_context;
        return (inference_datastructures_strategy.NIL != strategy_p(strategic_context)) ? problem_strategic_status(problem, strategic_context) : inference_datastructures_problem.problem_tactical_status(problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 34685L)
    public static SubLObject problem_provability_status(final SubLObject problem, final SubLObject strategic_context) {
        assert inference_datastructures_strategy.NIL != inference_worker.strategic_context_p(strategic_context) : strategic_context;
        return (inference_datastructures_strategy.NIL != strategy_p(strategic_context)) ? problem_strategic_provability_status(problem, strategic_context) : inference_datastructures_problem.problem_tactical_provability_status(problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 35160L)
    public static SubLObject set_problem_raw_strategic_status(final SubLObject problem, final SubLObject strategy, final SubLObject status) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_datastructures_strategy.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && inference_datastructures_strategy.NIL != inference_datastructures_enumerated_types.good_problem_status_p(status)) {
            Errors.error((SubLObject)inference_datastructures_strategy.$str146$poking_good_status__s_into_proble, status, problem, strategy);
        }
        if (inference_datastructures_strategy.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && inference_datastructures_strategy.$kw147$POSSIBLE_NO_GOOD == status) {
            Errors.error((SubLObject)inference_datastructures_strategy.$str148$_possible_no_good__s_wrt__s, problem, strategy);
        }
        final SubLObject problem_strategic_properties = problem_strategic_properties(problem, strategy);
        _csetf_prob_strategic_properties_status(problem_strategic_properties, status);
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 35754L)
    public static SubLObject strategically_unexamined_problem_p(final SubLObject problem, final SubLObject strategy) {
        return Equality.eq((SubLObject)inference_datastructures_strategy.$kw141$UNEXAMINED, problem_strategic_status(problem, strategy));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 35911L)
    public static SubLObject strategically_examined_problem_p(final SubLObject problem, final SubLObject strategy) {
        return Equality.eq((SubLObject)inference_datastructures_strategy.$kw149$EXAMINED, problem_strategic_status(problem, strategy));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 36050L)
    public static SubLObject strategically_possible_problem_p(final SubLObject problem, final SubLObject strategy) {
        return Equality.eq((SubLObject)inference_datastructures_strategy.$kw150$POSSIBLE, problem_strategic_status(problem, strategy));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 36189L)
    public static SubLObject strategically_pending_problem_p(final SubLObject problem, final SubLObject strategy) {
        return Equality.eq((SubLObject)inference_datastructures_strategy.$kw151$PENDING, problem_strategic_status(problem, strategy));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 36326L)
    public static SubLObject strategically_finished_problem_p(final SubLObject problem, final SubLObject strategy) {
        return Equality.eq((SubLObject)inference_datastructures_strategy.$kw142$FINISHED, problem_strategic_status(problem, strategy));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 36465L)
    public static SubLObject strategically_no_good_problem_p(final SubLObject problem, final SubLObject strategy) {
        return Equality.eq((SubLObject)inference_datastructures_strategy.$kw144$NO_GOOD, problem_strategic_provability_status(problem, strategy));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 36614L)
    public static SubLObject strategically_neutral_problem_p(final SubLObject problem, final SubLObject strategy) {
        return Equality.eq((SubLObject)inference_datastructures_strategy.$kw143$NEUTRAL, problem_strategic_provability_status(problem, strategy));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 36763L)
    public static SubLObject strategically_good_problem_p(final SubLObject problem, final SubLObject strategy) {
        return inference_worker.problem_goodP(problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 36883L)
    public static SubLObject strategically_potentially_possible_problem_p(final SubLObject problem, final SubLObject strategy) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_strategy.NIL != strategically_possible_problem_p(problem, strategy) || inference_datastructures_strategy.NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 37080L)
    public static SubLObject strategically_not_potentially_possible_problem_p(final SubLObject problem, final SubLObject strategy) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_strategy.NIL != strategically_examined_problem_p(problem, strategy) || inference_datastructures_strategy.NIL != strategically_pending_problem_p(problem, strategy) || inference_datastructures_strategy.NIL != strategically_finished_problem_p(problem, strategy));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 37348L)
    public static SubLObject strategically_totally_no_good_problem_p(final SubLObject problem, final SubLObject strategy) {
        return strategically_no_good_problem_p(problem, inference_tactician.controlling_strategy(strategy));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 37509L)
    public static SubLObject problem_strategic_uninterestingness(final SubLObject problem, final SubLObject strategy) {
        final SubLObject problem_strategic_properties = problem_strategic_properties(problem, strategy);
        return prob_strategic_properties_uninterestingness(problem_strategic_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 37821L)
    public static SubLObject set_problem_strategic_uninterestingness(final SubLObject problem, final SubLObject strategy, final SubLObject uninterestingness) {
        assert inference_datastructures_strategy.NIL != uninterestingness_cache_value_p(uninterestingness) : uninterestingness;
        final SubLObject problem_strategic_properties = problem_strategic_properties(problem, strategy);
        _csetf_prob_strategic_properties_uninterestingness(problem_strategic_properties, uninterestingness);
        return uninterestingness;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 38202L)
    public static SubLObject set_just_problem_thrown_away(final SubLObject problem, final SubLObject strategy, final SubLObject conditions) {
        final SubLObject uninterestingness = problem_strategic_uninterestingness(problem, strategy);
        final SubLObject new_uninterestingness = note_uninterestingness_cache_thrown_away_value(uninterestingness, (SubLObject)inference_datastructures_strategy.T, conditions);
        return set_problem_strategic_uninterestingness(problem, strategy, new_uninterestingness);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 38562L)
    public static SubLObject set_just_problem_not_thrown_away(final SubLObject problem, final SubLObject strategy, final SubLObject conditions) {
        final SubLObject uninterestingness = problem_strategic_uninterestingness(problem, strategy);
        final SubLObject new_uninterestingness = note_uninterestingness_cache_thrown_away_value(uninterestingness, (SubLObject)inference_datastructures_strategy.NIL, conditions);
        return set_problem_strategic_uninterestingness(problem, strategy, new_uninterestingness);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 38928L)
    public static SubLObject set_just_problem_recompute_thrown_away(final SubLObject problem, final SubLObject strategy) {
        final SubLObject uninterestingness = problem_strategic_uninterestingness(problem, strategy);
        final SubLObject new_uninterestingness = note_uninterestingness_cache_thrown_away_value(uninterestingness, (SubLObject)inference_datastructures_strategy.$kw116$RECOMPUTE, (SubLObject)inference_datastructures_strategy.$kw153$ALL);
        return set_problem_strategic_uninterestingness(problem, strategy, new_uninterestingness);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 39338L)
    public static SubLObject set_just_problem_set_aside(final SubLObject problem, final SubLObject strategy, final SubLObject conditions) {
        final SubLObject uninterestingness = problem_strategic_uninterestingness(problem, strategy);
        final SubLObject new_uninterestingness = note_uninterestingness_cache_set_aside_value(uninterestingness, (SubLObject)inference_datastructures_strategy.T, conditions);
        return set_problem_strategic_uninterestingness(problem, strategy, new_uninterestingness);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 39694L)
    public static SubLObject set_just_problem_not_set_aside(final SubLObject problem, final SubLObject strategy, final SubLObject conditions) {
        final SubLObject uninterestingness = problem_strategic_uninterestingness(problem, strategy);
        final SubLObject new_uninterestingness = note_uninterestingness_cache_set_aside_value(uninterestingness, (SubLObject)inference_datastructures_strategy.NIL, conditions);
        return set_problem_strategic_uninterestingness(problem, strategy, new_uninterestingness);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 40056L)
    public static SubLObject set_just_problem_recompute_set_aside(final SubLObject problem, final SubLObject strategy) {
        final SubLObject uninterestingness = problem_strategic_uninterestingness(problem, strategy);
        final SubLObject new_uninterestingness = note_uninterestingness_cache_set_aside_value(uninterestingness, (SubLObject)inference_datastructures_strategy.$kw116$RECOMPUTE, (SubLObject)inference_datastructures_strategy.$kw153$ALL);
        return set_problem_strategic_uninterestingness(problem, strategy, new_uninterestingness);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 40414L)
    public static SubLObject problem_thrown_away_cache_status(final SubLObject problem, final SubLObject strategy, SubLObject conditions) {
        if (conditions == inference_datastructures_strategy.UNPROVIDED) {
            conditions = (SubLObject)inference_datastructures_strategy.$kw153$ALL;
        }
        return thrown_away_cache_status_from_uninterestingness(problem_strategic_uninterestingness(problem, strategy), conditions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 40686L)
    public static SubLObject problem_set_aside_cache_status(final SubLObject problem, final SubLObject strategy, SubLObject conditions) {
        if (conditions == inference_datastructures_strategy.UNPROVIDED) {
            conditions = (SubLObject)inference_datastructures_strategy.$kw153$ALL;
        }
        return set_aside_cache_status_from_uninterestingness(problem_strategic_uninterestingness(problem, strategy), conditions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 40940L)
    public static SubLObject set_problem_thrown_away(final SubLObject problem, final SubLObject strategy, SubLObject conditions) {
        if (conditions == inference_datastructures_strategy.UNPROVIDED) {
            conditions = (SubLObject)inference_datastructures_strategy.$kw153$ALL;
        }
        return set_just_problem_thrown_away(problem, strategy, conditions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 41545L)
    public static SubLObject set_problem_not_thrown_away(final SubLObject problem, final SubLObject strategy, SubLObject conditions) {
        if (conditions == inference_datastructures_strategy.UNPROVIDED) {
            conditions = (SubLObject)inference_datastructures_strategy.$kw153$ALL;
        }
        return set_just_problem_not_thrown_away(problem, strategy, conditions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 41711L)
    public static SubLObject set_problem_set_aside(final SubLObject problem, final SubLObject strategy, SubLObject conditions) {
        if (conditions == inference_datastructures_strategy.UNPROVIDED) {
            conditions = (SubLObject)inference_datastructures_strategy.$kw153$ALL;
        }
        set_just_problem_set_aside(problem, strategy, conditions);
        return (SubLObject)inference_datastructures_strategy.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 42041L)
    public static SubLObject set_problem_not_set_aside(final SubLObject problem, final SubLObject strategy, SubLObject conditions) {
        if (conditions == inference_datastructures_strategy.UNPROVIDED) {
            conditions = (SubLObject)inference_datastructures_strategy.$kw153$ALL;
        }
        return set_just_problem_not_set_aside(problem, strategy, conditions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 42203L)
    public static SubLObject set_problem_recompute_thrown_away(final SubLObject problem, final SubLObject strategy) {
        return set_just_problem_recompute_thrown_away(problem, strategy);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 42342L)
    public static SubLObject set_problem_recompute_set_aside(final SubLObject problem, final SubLObject strategy) {
        return set_just_problem_recompute_set_aside(problem, strategy);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 42838L)
    public static SubLObject tactic_strategic_properties_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)inference_datastructures_strategy.ZERO_INTEGER);
        return (SubLObject)inference_datastructures_strategy.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 42838L)
    public static SubLObject tactic_strategic_properties_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $tactic_strategic_properties_native.class) ? inference_datastructures_strategy.T : inference_datastructures_strategy.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 42838L)
    public static SubLObject tact_strategic_properties_preference_level(final SubLObject v_object) {
        assert inference_datastructures_strategy.NIL != tactic_strategic_properties_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 42838L)
    public static SubLObject tact_strategic_properties_preference_level_justification(final SubLObject v_object) {
        assert inference_datastructures_strategy.NIL != tactic_strategic_properties_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 42838L)
    public static SubLObject tact_strategic_properties_productivity(final SubLObject v_object) {
        assert inference_datastructures_strategy.NIL != tactic_strategic_properties_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 42838L)
    public static SubLObject tact_strategic_properties_uninterestingness(final SubLObject v_object) {
        assert inference_datastructures_strategy.NIL != tactic_strategic_properties_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 42838L)
    public static SubLObject _csetf_tact_strategic_properties_preference_level(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_strategy.NIL != tactic_strategic_properties_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 42838L)
    public static SubLObject _csetf_tact_strategic_properties_preference_level_justification(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_strategy.NIL != tactic_strategic_properties_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 42838L)
    public static SubLObject _csetf_tact_strategic_properties_productivity(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_strategy.NIL != tactic_strategic_properties_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 42838L)
    public static SubLObject _csetf_tact_strategic_properties_uninterestingness(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_strategy.NIL != tactic_strategic_properties_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 42838L)
    public static SubLObject make_tactic_strategic_properties(SubLObject arglist) {
        if (arglist == inference_datastructures_strategy.UNPROVIDED) {
            arglist = (SubLObject)inference_datastructures_strategy.NIL;
        }
        final SubLObject v_new = (SubLObject)new $tactic_strategic_properties_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)inference_datastructures_strategy.NIL, next = arglist; inference_datastructures_strategy.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)inference_datastructures_strategy.$kw170$PREFERENCE_LEVEL)) {
                _csetf_tact_strategic_properties_preference_level(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_strategy.$kw171$PREFERENCE_LEVEL_JUSTIFICATION)) {
                _csetf_tact_strategic_properties_preference_level_justification(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_strategy.$kw172$PRODUCTIVITY)) {
                _csetf_tact_strategic_properties_productivity(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_strategy.$kw137$UNINTERESTINGNESS)) {
                _csetf_tact_strategic_properties_uninterestingness(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)inference_datastructures_strategy.$str57$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 42838L)
    public static SubLObject visit_defstruct_tactic_strategic_properties(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_strategy.$kw58$BEGIN, (SubLObject)inference_datastructures_strategy.$sym173$MAKE_TACTIC_STRATEGIC_PROPERTIES, (SubLObject)inference_datastructures_strategy.FOUR_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_strategy.$kw60$SLOT, (SubLObject)inference_datastructures_strategy.$kw170$PREFERENCE_LEVEL, tact_strategic_properties_preference_level(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_strategy.$kw60$SLOT, (SubLObject)inference_datastructures_strategy.$kw171$PREFERENCE_LEVEL_JUSTIFICATION, tact_strategic_properties_preference_level_justification(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_strategy.$kw60$SLOT, (SubLObject)inference_datastructures_strategy.$kw172$PRODUCTIVITY, tact_strategic_properties_productivity(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_strategy.$kw60$SLOT, (SubLObject)inference_datastructures_strategy.$kw137$UNINTERESTINGNESS, tact_strategic_properties_uninterestingness(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_strategy.$kw61$END, (SubLObject)inference_datastructures_strategy.$sym173$MAKE_TACTIC_STRATEGIC_PROPERTIES, (SubLObject)inference_datastructures_strategy.FOUR_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 42838L)
    public static SubLObject visit_defstruct_object_tactic_strategic_properties_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_tactic_strategic_properties(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 43453L)
    public static SubLObject new_tactic_strategic_properties() {
        final SubLObject tactic_strategic_properties = make_tactic_strategic_properties((SubLObject)inference_datastructures_strategy.UNPROVIDED);
        _csetf_tact_strategic_properties_preference_level(tactic_strategic_properties, preference_modules.$default_preference_level$.getGlobalValue());
        _csetf_tact_strategic_properties_preference_level_justification(tactic_strategic_properties, (SubLObject)inference_datastructures_strategy.$str175$);
        _csetf_tact_strategic_properties_productivity(tactic_strategic_properties, number_utilities.positive_infinity());
        _csetf_tact_strategic_properties_uninterestingness(tactic_strategic_properties, default_uninterestingness_cache_value());
        return tactic_strategic_properties;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 44123L)
    public static SubLObject tactic_strategic_properties_int(final SubLObject tactic, final SubLObject strategy) {
        assert inference_datastructures_strategy.NIL != inference_datastructures_tactic.tactic_p(tactic) : tactic;
        assert inference_datastructures_strategy.NIL != strategy_p(strategy) : strategy;
        final SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
        final SubLObject problem_strategic_properties = problem_strategic_properties(problem, strategy);
        if (inference_datastructures_strategy.NIL != problem_strategic_properties_p(problem_strategic_properties)) {
            final SubLObject tactic_properties_vector = problem_strategic_properties_tactic_strategic_property_index(problem, problem_strategic_properties);
            if (tactic_properties_vector.isVector()) {
                final SubLObject tactic_suid = inference_datastructures_tactic.tactic_suid(tactic);
                return Vectors.aref(tactic_properties_vector, tactic_suid);
            }
        }
        return (SubLObject)inference_datastructures_strategy.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 44835L)
    public static SubLObject set_tactic_strategic_properties(final SubLObject tactic, final SubLObject strategy, final SubLObject v_properties) {
        assert inference_datastructures_strategy.NIL != inference_datastructures_tactic.tactic_p(tactic) : tactic;
        assert inference_datastructures_strategy.NIL != strategy_p(strategy) : strategy;
        assert inference_datastructures_strategy.NIL != tactic_strategic_properties_p(v_properties) : v_properties;
        final SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
        final SubLObject problem_strategic_properties = problem_strategic_properties(problem, strategy);
        final SubLObject tactic_properties_vector = problem_strategic_properties_tactic_strategic_property_index(problem, problem_strategic_properties);
        final SubLObject tactic_suid = inference_datastructures_tactic.tactic_suid(tactic);
        Vectors.set_aref(tactic_properties_vector, tactic_suid, v_properties);
        return tactic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 45437L)
    public static SubLObject tactic_strategic_properties(final SubLObject tactic, final SubLObject strategy) {
        SubLObject tactic_strategic_properties = tactic_strategic_properties_int(tactic, strategy);
        if (inference_datastructures_strategy.NIL == tactic_strategic_properties_p(tactic_strategic_properties)) {
            tactic_strategic_properties = new_tactic_strategic_properties();
            set_tactic_strategic_properties(tactic, strategy, tactic_strategic_properties);
        }
        return tactic_strategic_properties;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 45979L)
    public static SubLObject tactic_strategic_completeness(final SubLObject tactic, final SubLObject strategic_context) {
        assert inference_datastructures_strategy.NIL != inference_worker.strategic_context_p(strategic_context) : strategic_context;
        if (inference_datastructures_strategy.$kw177$TACTICAL == strategic_context) {
            return inference_datastructures_tactic.tactic_completeness(tactic);
        }
        if (inference_datastructures_strategy.NIL != inference_worker.content_tactic_p(tactic)) {
            return inference_datastructures_tactic.tactic_completeness(tactic);
        }
        return Errors.error((SubLObject)inference_datastructures_strategy.$str178$structural_tactic__s_cannot_have_, tactic);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 46498L)
    public static SubLObject tactic_strategic_preference_level(final SubLObject tactic, final SubLObject strategic_context) {
        assert inference_datastructures_strategy.NIL != inference_worker.strategic_context_p(strategic_context) : strategic_context;
        if (inference_datastructures_strategy.$kw177$TACTICAL == strategic_context) {
            return inference_datastructures_tactic.tactic_preference_level(tactic);
        }
        if (inference_datastructures_strategy.NIL != inference_worker.generalized_structural_tactic_p(tactic)) {
            final SubLObject tactic_strategic_properties = tactic_strategic_properties(tactic, strategic_context);
            return tact_strategic_properties_preference_level(tactic_strategic_properties);
        }
        return Errors.error((SubLObject)inference_datastructures_strategy.$str179$content_tactic__s_cannot_have_a_p, tactic);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 47106L)
    public static SubLObject tactic_strategic_preference_level_justification(final SubLObject tactic, final SubLObject strategic_context) {
        assert inference_datastructures_strategy.NIL != inference_worker.strategic_context_p(strategic_context) : strategic_context;
        if (inference_datastructures_strategy.$kw177$TACTICAL == strategic_context) {
            return inference_datastructures_tactic.tactic_preference_level_justification(tactic);
        }
        if (inference_datastructures_strategy.NIL != inference_worker.generalized_structural_tactic_p(tactic)) {
            final SubLObject tactic_strategic_properties = tactic_strategic_properties(tactic, strategic_context);
            return tact_strategic_properties_preference_level_justification(tactic_strategic_properties);
        }
        return Errors.error((SubLObject)inference_datastructures_strategy.$str180$content_tactic__s_cannot_have_a_p, tactic);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 47770L)
    public static SubLObject tactic_strategic_dwimmed_completeness(final SubLObject tactic, final SubLObject strategic_context) {
        if (inference_datastructures_strategy.NIL != inference_worker.content_tactic_p(tactic)) {
            return tactic_strategic_completeness(tactic, strategic_context);
        }
        return preference_modules.preference_level_to_completeness(tactic_strategic_preference_level(tactic, strategic_context));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 48078L)
    public static SubLObject conjunctive_tactic_strategic_preference_level(final SubLObject tactic, final SubLObject strategic_context) {
        assert inference_datastructures_strategy.NIL != inference_worker.generalized_conjunctive_tactic_p(tactic) : tactic;
        if (inference_datastructures_strategy.NIL != inference_worker_removal.conjunctive_removal_tactic_p(tactic)) {
            return preference_modules.completeness_to_preference_level(tactic_strategic_completeness(tactic, strategic_context));
        }
        return tactic_strategic_preference_level(tactic, strategic_context);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 48451L)
    public static SubLObject conjunctive_tactic_strategic_preference_level_justification(final SubLObject tactic, final SubLObject strategic_context) {
        assert inference_datastructures_strategy.NIL != inference_worker.generalized_conjunctive_tactic_p(tactic) : tactic;
        if (inference_datastructures_strategy.NIL != inference_worker_removal.conjunctive_removal_tactic_p(tactic)) {
            return string_utilities.str(tactic_strategic_completeness(tactic, strategic_context));
        }
        return tactic_strategic_preference_level_justification(tactic, strategic_context);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 48823L)
    public static SubLObject tactic_strategic_productivity(final SubLObject tactic, final SubLObject strategic_context) {
        if (inference_datastructures_strategy.$kw177$TACTICAL == strategic_context) {
            return inference_datastructures_tactic.tactic_productivity(tactic);
        }
        if (inference_datastructures_strategy.NIL != inference_worker.content_tactic_p(tactic)) {
            return inference_datastructures_tactic.tactic_productivity(tactic);
        }
        final SubLObject tactic_strategic_properties = tactic_strategic_properties(tactic, strategic_context);
        return tact_strategic_properties_productivity(tactic_strategic_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 49393L)
    public static SubLObject tactic_strategically_preferredP(final SubLObject tactic, final SubLObject strategy) {
        return Equality.eq((SubLObject)inference_datastructures_strategy.$kw182$PREFERRED, tactic_strategic_preference_level(tactic, strategy));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 49539L)
    public static SubLObject set_tactic_strategic_preference_level(final SubLObject tactic, final SubLObject strategy, final SubLObject preference_level, final SubLObject justification) {
        assert inference_datastructures_strategy.NIL != preference_modules.preference_level_p(preference_level) : preference_level;
        final SubLObject tactic_strategic_properties = tactic_strategic_properties(tactic, strategy);
        _csetf_tact_strategic_properties_preference_level(tactic_strategic_properties, preference_level);
        _csetf_tact_strategic_properties_preference_level_justification(tactic_strategic_properties, justification);
        return tactic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 50501L)
    public static SubLObject set_tactic_strategic_productivity(final SubLObject tactic, final SubLObject strategy, final SubLObject productivity) {
        final SubLObject tactic_strategic_properties = tactic_strategic_properties(tactic, strategy);
        _csetf_tact_strategic_properties_productivity(tactic_strategic_properties, productivity);
        return tactic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 51253L)
    public static SubLObject problem_strategically_possible_tactic_count(final SubLObject problem, final SubLObject strategy) {
        assert inference_datastructures_strategy.NIL != inference_datastructures_problem.problem_p(problem) : problem;
        assert inference_datastructures_strategy.NIL != strategy_p(strategy) : strategy;
        final SubLObject problem_strategic_properties = problem_strategic_properties(problem, strategy);
        return prob_strategic_properties_possible_tactic_count(problem_strategic_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 51644L)
    public static SubLObject problem_note_tactic_strategically_possible(final SubLObject problem, final SubLObject tactic, final SubLObject strategy) {
        assert inference_datastructures_strategy.NIL != inference_datastructures_problem.problem_p(problem) : problem;
        assert inference_datastructures_strategy.NIL != inference_datastructures_tactic.tactic_p(tactic) : tactic;
        assert inference_datastructures_strategy.NIL != strategy_p(strategy) : strategy;
        final SubLObject problem_strategic_properties = problem_strategic_properties(problem, strategy);
        _csetf_prob_strategic_properties_possible_tactic_count(problem_strategic_properties, Numbers.add(prob_strategic_properties_possible_tactic_count(problem_strategic_properties), (SubLObject)inference_datastructures_strategy.ONE_INTEGER));
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 52055L)
    public static SubLObject problem_note_tactic_not_strategically_possible(final SubLObject problem, final SubLObject tactic, final SubLObject strategy) {
        assert inference_datastructures_strategy.NIL != inference_datastructures_problem.problem_p(problem) : problem;
        assert inference_datastructures_strategy.NIL != inference_datastructures_tactic.tactic_p(tactic) : tactic;
        assert inference_datastructures_strategy.NIL != strategy_p(strategy) : strategy;
        final SubLObject problem_strategic_properties = problem_strategic_properties(problem, strategy);
        _csetf_prob_strategic_properties_possible_tactic_count(problem_strategic_properties, Numbers.subtract(prob_strategic_properties_possible_tactic_count(problem_strategic_properties), (SubLObject)inference_datastructures_strategy.ONE_INTEGER));
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 52446L)
    public static SubLObject problem_note_all_tactics_not_strategically_possible(final SubLObject problem, final SubLObject strategy) {
        final SubLObject problem_strategic_properties = problem_strategic_properties(problem, strategy);
        _csetf_prob_strategic_properties_possible_tactic_count(problem_strategic_properties, (SubLObject)inference_datastructures_strategy.ZERO_INTEGER);
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 52736L)
    public static SubLObject tactic_strategic_uninterestingness(final SubLObject tactic, final SubLObject strategy) {
        final SubLObject tactic_strategic_properties = tactic_strategic_properties(tactic, strategy);
        return tact_strategic_properties_uninterestingness(tactic_strategic_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 53041L)
    public static SubLObject set_tactic_strategic_uninterestingness(final SubLObject tactic, final SubLObject strategy, final SubLObject uninterestingness) {
        assert inference_datastructures_strategy.NIL != uninterestingness_cache_value_p(uninterestingness) : uninterestingness;
        final SubLObject tactic_strategic_properties = tactic_strategic_properties(tactic, strategy);
        _csetf_tact_strategic_properties_uninterestingness(tactic_strategic_properties, uninterestingness);
        return uninterestingness;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 53416L)
    public static SubLObject thrown_away_cache_status_from_uninterestingness(final SubLObject uninterestingness, final SubLObject conditions) {
        return cache_status_for_conditions(Vectors.aref(uninterestingness, (SubLObject)inference_datastructures_strategy.ZERO_INTEGER), conditions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 53706L)
    public static SubLObject set_aside_cache_status_from_uninterestingness(final SubLObject uninterestingness, final SubLObject conditions) {
        return cache_status_for_conditions(Vectors.aref(uninterestingness, (SubLObject)inference_datastructures_strategy.ONE_INTEGER), conditions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 53877L)
    public static SubLObject note_uninterestingness_cache_thrown_away_value(final SubLObject uninterestingness, final SubLObject value, final SubLObject conditions) {
        assert inference_datastructures_strategy.NIL != uninterestingness_cache_conditions_p(conditions) : conditions;
        SubLObject cache_status = Vectors.aref(uninterestingness, (SubLObject)inference_datastructures_strategy.ZERO_INTEGER);
        cache_status = modify_cache_status_for_value_and_conditions(cache_status, value, conditions);
        Vectors.set_aref(uninterestingness, (SubLObject)inference_datastructures_strategy.ZERO_INTEGER, cache_status);
        return uninterestingness;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 54316L)
    public static SubLObject note_uninterestingness_cache_set_aside_value(final SubLObject uninterestingness, final SubLObject value, final SubLObject conditions) {
        assert inference_datastructures_strategy.NIL != uninterestingness_cache_conditions_p(conditions) : conditions;
        SubLObject cache_status = Vectors.aref(uninterestingness, (SubLObject)inference_datastructures_strategy.ONE_INTEGER);
        cache_status = modify_cache_status_for_value_and_conditions(cache_status, value, conditions);
        Vectors.set_aref(uninterestingness, (SubLObject)inference_datastructures_strategy.ONE_INTEGER, cache_status);
        return uninterestingness;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 54710L)
    public static SubLObject uninterestingness_cache_value_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isVector() && inference_datastructures_strategy.NIL != list_utilities.lengthE(v_object, (SubLObject)inference_datastructures_strategy.TWO_INTEGER, (SubLObject)inference_datastructures_strategy.UNPROVIDED) && inference_datastructures_strategy.NIL != thrown_away_cache_value_p(Vectors.aref(v_object, (SubLObject)inference_datastructures_strategy.ZERO_INTEGER)) && inference_datastructures_strategy.NIL != set_aside_cache_value_p(Vectors.aref(v_object, (SubLObject)inference_datastructures_strategy.ONE_INTEGER)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 54924L)
    public static SubLObject uninterestingness_cache_conditions_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_strategy.$kw153$ALL == v_object || (v_object.isCons() && inference_datastructures_strategy.NIL != list_utilities.every_in_list((SubLObject)inference_datastructures_strategy.$sym185$BOOLEANP, v_object, (SubLObject)inference_datastructures_strategy.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 55083L)
    public static SubLObject uninterestingness_cache_conditions_list_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isList() && inference_datastructures_strategy.NIL != list_utilities.every_in_list((SubLObject)inference_datastructures_strategy.$sym184$UNINTERESTINGNESS_CACHE_CONDITIONS_P, v_object, (SubLObject)inference_datastructures_strategy.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 55249L)
    public static SubLObject thrown_away_cache_value_p(final SubLObject v_object) {
        return ignore_cache_value_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 55340L)
    public static SubLObject set_aside_cache_value_p(final SubLObject v_object) {
        return ignore_cache_value_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 55429L)
    public static SubLObject ignore_cache_value_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_strategy.$kw116$RECOMPUTE == v_object || (inference_datastructures_strategy.NIL != list_utilities.doubletonP(v_object) && inference_datastructures_strategy.NIL != uninterestingness_cache_conditions_list_p(v_object.first()) && inference_datastructures_strategy.NIL != uninterestingness_cache_conditions_list_p(conses_high.second(v_object))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 55673L)
    public static SubLObject set_just_tactic_thrown_away(final SubLObject tactic, final SubLObject strategy, final SubLObject conditions) {
        final SubLObject uninterestingness = tactic_strategic_uninterestingness(tactic, strategy);
        final SubLObject new_uninterestingness = note_uninterestingness_cache_thrown_away_value(uninterestingness, (SubLObject)inference_datastructures_strategy.T, conditions);
        return set_tactic_strategic_uninterestingness(tactic, strategy, new_uninterestingness);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 56027L)
    public static SubLObject set_just_tactic_not_thrown_away(final SubLObject tactic, final SubLObject strategy, final SubLObject conditions) {
        final SubLObject uninterestingness = tactic_strategic_uninterestingness(tactic, strategy);
        final SubLObject new_uninterestingness = note_uninterestingness_cache_thrown_away_value(uninterestingness, (SubLObject)inference_datastructures_strategy.NIL, conditions);
        return set_tactic_strategic_uninterestingness(tactic, strategy, new_uninterestingness);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 56387L)
    public static SubLObject set_just_tactic_recompute_thrown_away(final SubLObject tactic, final SubLObject strategy) {
        final SubLObject uninterestingness = tactic_strategic_uninterestingness(tactic, strategy);
        final SubLObject new_uninterestingness = note_uninterestingness_cache_thrown_away_value(uninterestingness, (SubLObject)inference_datastructures_strategy.$kw116$RECOMPUTE, (SubLObject)inference_datastructures_strategy.$kw153$ALL);
        return set_tactic_strategic_uninterestingness(tactic, strategy, new_uninterestingness);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 56791L)
    public static SubLObject set_just_tactic_set_aside(final SubLObject tactic, final SubLObject strategy, final SubLObject conditions) {
        final SubLObject uninterestingness = tactic_strategic_uninterestingness(tactic, strategy);
        final SubLObject new_uninterestingness = note_uninterestingness_cache_set_aside_value(uninterestingness, (SubLObject)inference_datastructures_strategy.T, conditions);
        return set_tactic_strategic_uninterestingness(tactic, strategy, new_uninterestingness);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 57141L)
    public static SubLObject set_just_tactic_not_set_aside(final SubLObject tactic, final SubLObject strategy, final SubLObject conditions) {
        final SubLObject uninterestingness = tactic_strategic_uninterestingness(tactic, strategy);
        final SubLObject new_uninterestingness = note_uninterestingness_cache_set_aside_value(uninterestingness, (SubLObject)inference_datastructures_strategy.NIL, conditions);
        return set_tactic_strategic_uninterestingness(tactic, strategy, new_uninterestingness);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 57497L)
    public static SubLObject set_just_tactic_recompute_set_aside(final SubLObject tactic, final SubLObject strategy) {
        final SubLObject uninterestingness = tactic_strategic_uninterestingness(tactic, strategy);
        final SubLObject new_uninterestingness = note_uninterestingness_cache_set_aside_value(uninterestingness, (SubLObject)inference_datastructures_strategy.$kw116$RECOMPUTE, (SubLObject)inference_datastructures_strategy.$kw153$ALL);
        return set_tactic_strategic_uninterestingness(tactic, strategy, new_uninterestingness);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 57849L)
    public static SubLObject tactic_thrown_away_cache_status(final SubLObject tactic, final SubLObject strategy, SubLObject conditions) {
        if (conditions == inference_datastructures_strategy.UNPROVIDED) {
            conditions = (SubLObject)inference_datastructures_strategy.$kw153$ALL;
        }
        return thrown_away_cache_status_from_uninterestingness(tactic_strategic_uninterestingness(tactic, strategy), conditions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 58117L)
    public static SubLObject tactic_set_aside_cache_status(final SubLObject tactic, final SubLObject strategy, SubLObject conditions) {
        if (conditions == inference_datastructures_strategy.UNPROVIDED) {
            conditions = (SubLObject)inference_datastructures_strategy.$kw153$ALL;
        }
        return set_aside_cache_status_from_uninterestingness(tactic_strategic_uninterestingness(tactic, strategy), conditions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 58367L)
    public static SubLObject set_tactic_thrown_away(final SubLObject tactic, final SubLObject strategy, SubLObject conditions) {
        if (conditions == inference_datastructures_strategy.UNPROVIDED) {
            conditions = (SubLObject)inference_datastructures_strategy.$kw153$ALL;
        }
        set_just_tactic_thrown_away(tactic, strategy, conditions);
        return (SubLObject)inference_datastructures_strategy.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 58918L)
    public static SubLObject set_tactic_not_thrown_away(final SubLObject tactic, final SubLObject strategy, SubLObject conditions) {
        if (conditions == inference_datastructures_strategy.UNPROVIDED) {
            conditions = (SubLObject)inference_datastructures_strategy.$kw153$ALL;
        }
        return set_just_tactic_not_thrown_away(tactic, strategy, conditions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 59080L)
    public static SubLObject set_tactic_recompute_thrown_away(final SubLObject tactic, final SubLObject strategy) {
        set_just_tactic_recompute_thrown_away(tactic, strategy);
        set_just_problem_recompute_thrown_away(inference_datastructures_tactic.tactic_problem(tactic), strategy);
        return (SubLObject)inference_datastructures_strategy.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 59607L)
    public static SubLObject set_tactic_set_aside(final SubLObject tactic, final SubLObject strategy, SubLObject conditions) {
        if (conditions == inference_datastructures_strategy.UNPROVIDED) {
            conditions = (SubLObject)inference_datastructures_strategy.$kw153$ALL;
        }
        set_just_tactic_set_aside(tactic, strategy, conditions);
        return (SubLObject)inference_datastructures_strategy.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 59931L)
    public static SubLObject set_tactic_not_set_aside(final SubLObject tactic, final SubLObject strategy, SubLObject conditions) {
        if (conditions == inference_datastructures_strategy.UNPROVIDED) {
            conditions = (SubLObject)inference_datastructures_strategy.$kw153$ALL;
        }
        return set_just_tactic_not_set_aside(tactic, strategy, conditions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 60089L)
    public static SubLObject set_tactic_recompute_set_aside(final SubLObject tactic, final SubLObject strategy) {
        set_just_tactic_recompute_set_aside(tactic, strategy);
        if (inference_datastructures_strategy.NIL == strategy_continuableP(strategy) && inference_datastructures_strategy.NIL != inference_tactician.strategy_set_aside_non_continuable_implies_throw_awayP(strategy)) {
            set_just_tactic_recompute_thrown_away(tactic, strategy);
        }
        set_just_problem_recompute_set_aside(inference_datastructures_tactic.tactic_problem(tactic), strategy);
        return (SubLObject)inference_datastructures_strategy.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 60831L)
    public static SubLObject set_problem_recompute_thrown_away_wrt_all_relevant_strategies(final SubLObject problem) {
        final SubLObject store = inference_datastructures_problem.problem_store(problem);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (inference_datastructures_strategy.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_datastructures_strategy.$kw186$SKIP)) {
            final SubLObject idx_$4 = idx;
            if (inference_datastructures_strategy.NIL == id_index.id_index_dense_objects_empty_p(idx_$4, (SubLObject)inference_datastructures_strategy.$kw186$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$4);
                final SubLObject backwardP_var = (SubLObject)inference_datastructures_strategy.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference;
                SubLObject inference_var;
                SubLObject set_var;
                SubLObject set_contents_var;
                SubLObject basis_object;
                SubLObject state;
                SubLObject strategy;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_datastructures_strategy.NIL, v_iteration = (SubLObject)inference_datastructures_strategy.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_datastructures_strategy.ONE_INTEGER)) {
                    id = ((inference_datastructures_strategy.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_datastructures_strategy.ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (inference_datastructures_strategy.NIL == id_index.id_index_tombstone_p(inference) || inference_datastructures_strategy.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_datastructures_strategy.$kw186$SKIP)) {
                        if (inference_datastructures_strategy.NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = (SubLObject)inference_datastructures_strategy.$kw186$SKIP;
                        }
                        if (inference_datastructures_strategy.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
                            inference_var = inference;
                            set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                            set_contents_var = set.do_set_internal(set_var);
                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_datastructures_strategy.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_datastructures_strategy.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                strategy = set_contents.do_set_contents_next(basis_object, state);
                                if (inference_datastructures_strategy.NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                    set_problem_recompute_thrown_away(problem, strategy);
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject idx_$5 = idx;
            if (inference_datastructures_strategy.NIL == id_index.id_index_sparse_objects_empty_p(idx_$5)) {
                final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$5);
                SubLObject id2 = (SubLObject)inference_datastructures_strategy.NIL;
                SubLObject inference2 = (SubLObject)inference_datastructures_strategy.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        if (inference_datastructures_strategy.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference2)) {
                            final SubLObject inference_var2 = inference2;
                            final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                            final SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject strategy2;
                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)inference_datastructures_strategy.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); inference_datastructures_strategy.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                if (inference_datastructures_strategy.NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
                                    set_problem_recompute_thrown_away(problem, strategy2);
                                }
                            }
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return (SubLObject)inference_datastructures_strategy.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 61060L)
    public static SubLObject set_problem_recompute_set_aside_wrt_all_relevant_strategies(final SubLObject problem) {
        final SubLObject store = inference_datastructures_problem.problem_store(problem);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (inference_datastructures_strategy.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_datastructures_strategy.$kw186$SKIP)) {
            final SubLObject idx_$6 = idx;
            if (inference_datastructures_strategy.NIL == id_index.id_index_dense_objects_empty_p(idx_$6, (SubLObject)inference_datastructures_strategy.$kw186$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$6);
                final SubLObject backwardP_var = (SubLObject)inference_datastructures_strategy.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference;
                SubLObject inference_var;
                SubLObject set_var;
                SubLObject set_contents_var;
                SubLObject basis_object;
                SubLObject state;
                SubLObject strategy;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_datastructures_strategy.NIL, v_iteration = (SubLObject)inference_datastructures_strategy.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_datastructures_strategy.ONE_INTEGER)) {
                    id = ((inference_datastructures_strategy.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_datastructures_strategy.ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (inference_datastructures_strategy.NIL == id_index.id_index_tombstone_p(inference) || inference_datastructures_strategy.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_datastructures_strategy.$kw186$SKIP)) {
                        if (inference_datastructures_strategy.NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = (SubLObject)inference_datastructures_strategy.$kw186$SKIP;
                        }
                        if (inference_datastructures_strategy.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
                            inference_var = inference;
                            set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                            set_contents_var = set.do_set_internal(set_var);
                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_datastructures_strategy.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_datastructures_strategy.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                strategy = set_contents.do_set_contents_next(basis_object, state);
                                if (inference_datastructures_strategy.NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                    set_problem_recompute_set_aside(problem, strategy);
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject idx_$7 = idx;
            if (inference_datastructures_strategy.NIL == id_index.id_index_sparse_objects_empty_p(idx_$7)) {
                final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$7);
                SubLObject id2 = (SubLObject)inference_datastructures_strategy.NIL;
                SubLObject inference2 = (SubLObject)inference_datastructures_strategy.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        if (inference_datastructures_strategy.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference2)) {
                            final SubLObject inference_var2 = inference2;
                            final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                            final SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject strategy2;
                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)inference_datastructures_strategy.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); inference_datastructures_strategy.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                if (inference_datastructures_strategy.NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
                                    set_problem_recompute_set_aside(problem, strategy2);
                                }
                            }
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return (SubLObject)inference_datastructures_strategy.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 61271L)
    public static SubLObject set_tactic_recompute_thrown_away_wrt_all_relevant_strategies(final SubLObject tactic) {
        final SubLObject prob = inference_datastructures_tactic.tactic_problem(tactic);
        final SubLObject store = inference_datastructures_problem.problem_store(prob);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (inference_datastructures_strategy.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_datastructures_strategy.$kw186$SKIP)) {
            final SubLObject idx_$8 = idx;
            if (inference_datastructures_strategy.NIL == id_index.id_index_dense_objects_empty_p(idx_$8, (SubLObject)inference_datastructures_strategy.$kw186$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$8);
                final SubLObject backwardP_var = (SubLObject)inference_datastructures_strategy.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference;
                SubLObject inference_var;
                SubLObject set_var;
                SubLObject set_contents_var;
                SubLObject basis_object;
                SubLObject state;
                SubLObject strategy;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_datastructures_strategy.NIL, v_iteration = (SubLObject)inference_datastructures_strategy.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_datastructures_strategy.ONE_INTEGER)) {
                    id = ((inference_datastructures_strategy.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_datastructures_strategy.ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (inference_datastructures_strategy.NIL == id_index.id_index_tombstone_p(inference) || inference_datastructures_strategy.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_datastructures_strategy.$kw186$SKIP)) {
                        if (inference_datastructures_strategy.NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = (SubLObject)inference_datastructures_strategy.$kw186$SKIP;
                        }
                        if (inference_datastructures_strategy.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference)) {
                            inference_var = inference;
                            set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                            set_contents_var = set.do_set_internal(set_var);
                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_datastructures_strategy.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_datastructures_strategy.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                strategy = set_contents.do_set_contents_next(basis_object, state);
                                if (inference_datastructures_strategy.NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                    set_tactic_recompute_thrown_away(tactic, strategy);
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject idx_$9 = idx;
            if (inference_datastructures_strategy.NIL == id_index.id_index_sparse_objects_empty_p(idx_$9)) {
                final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$9);
                SubLObject id2 = (SubLObject)inference_datastructures_strategy.NIL;
                SubLObject inference2 = (SubLObject)inference_datastructures_strategy.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        if (inference_datastructures_strategy.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference2)) {
                            final SubLObject inference_var2 = inference2;
                            final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                            final SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject strategy2;
                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)inference_datastructures_strategy.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); inference_datastructures_strategy.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                if (inference_datastructures_strategy.NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
                                    set_tactic_recompute_thrown_away(tactic, strategy2);
                                }
                            }
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return (SubLObject)inference_datastructures_strategy.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 61480L)
    public static SubLObject set_tactic_recompute_set_aside_wrt_all_relevant_strategies(final SubLObject tactic) {
        final SubLObject prob = inference_datastructures_tactic.tactic_problem(tactic);
        final SubLObject store = inference_datastructures_problem.problem_store(prob);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (inference_datastructures_strategy.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_datastructures_strategy.$kw186$SKIP)) {
            final SubLObject idx_$10 = idx;
            if (inference_datastructures_strategy.NIL == id_index.id_index_dense_objects_empty_p(idx_$10, (SubLObject)inference_datastructures_strategy.$kw186$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$10);
                final SubLObject backwardP_var = (SubLObject)inference_datastructures_strategy.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference;
                SubLObject inference_var;
                SubLObject set_var;
                SubLObject set_contents_var;
                SubLObject basis_object;
                SubLObject state;
                SubLObject strategy;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_datastructures_strategy.NIL, v_iteration = (SubLObject)inference_datastructures_strategy.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_datastructures_strategy.ONE_INTEGER)) {
                    id = ((inference_datastructures_strategy.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_datastructures_strategy.ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (inference_datastructures_strategy.NIL == id_index.id_index_tombstone_p(inference) || inference_datastructures_strategy.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_datastructures_strategy.$kw186$SKIP)) {
                        if (inference_datastructures_strategy.NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = (SubLObject)inference_datastructures_strategy.$kw186$SKIP;
                        }
                        if (inference_datastructures_strategy.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference)) {
                            inference_var = inference;
                            set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                            set_contents_var = set.do_set_internal(set_var);
                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_datastructures_strategy.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_datastructures_strategy.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                strategy = set_contents.do_set_contents_next(basis_object, state);
                                if (inference_datastructures_strategy.NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                    set_tactic_recompute_set_aside(tactic, strategy);
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject idx_$11 = idx;
            if (inference_datastructures_strategy.NIL == id_index.id_index_sparse_objects_empty_p(idx_$11)) {
                final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$11);
                SubLObject id2 = (SubLObject)inference_datastructures_strategy.NIL;
                SubLObject inference2 = (SubLObject)inference_datastructures_strategy.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        if (inference_datastructures_strategy.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference2)) {
                            final SubLObject inference_var2 = inference2;
                            final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                            final SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject strategy2;
                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)inference_datastructures_strategy.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); inference_datastructures_strategy.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                if (inference_datastructures_strategy.NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
                                    set_tactic_recompute_set_aside(tactic, strategy2);
                                }
                            }
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return (SubLObject)inference_datastructures_strategy.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 61685L)
    public static SubLObject set_problem_tactics_recompute_thrown_away_wrt_all_relevant_strategies(final SubLObject problem) {
        final SubLObject store = inference_datastructures_problem.problem_store(problem);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (inference_datastructures_strategy.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_datastructures_strategy.$kw186$SKIP)) {
            final SubLObject idx_$12 = idx;
            if (inference_datastructures_strategy.NIL == id_index.id_index_dense_objects_empty_p(idx_$12, (SubLObject)inference_datastructures_strategy.$kw186$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$12);
                final SubLObject backwardP_var = (SubLObject)inference_datastructures_strategy.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference;
                SubLObject inference_var;
                SubLObject set_var;
                SubLObject set_contents_var;
                SubLObject basis_object;
                SubLObject state;
                SubLObject strategy;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_datastructures_strategy.NIL, v_iteration = (SubLObject)inference_datastructures_strategy.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_datastructures_strategy.ONE_INTEGER)) {
                    id = ((inference_datastructures_strategy.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_datastructures_strategy.ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (inference_datastructures_strategy.NIL == id_index.id_index_tombstone_p(inference) || inference_datastructures_strategy.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_datastructures_strategy.$kw186$SKIP)) {
                        if (inference_datastructures_strategy.NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = (SubLObject)inference_datastructures_strategy.$kw186$SKIP;
                        }
                        if (inference_datastructures_strategy.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
                            inference_var = inference;
                            set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                            set_contents_var = set.do_set_internal(set_var);
                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_datastructures_strategy.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_datastructures_strategy.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                strategy = set_contents.do_set_contents_next(basis_object, state);
                                if (inference_datastructures_strategy.NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                    set_problem_tactics_recompute_thrown_away(problem, strategy);
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject idx_$13 = idx;
            if (inference_datastructures_strategy.NIL == id_index.id_index_sparse_objects_empty_p(idx_$13)) {
                final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$13);
                SubLObject id2 = (SubLObject)inference_datastructures_strategy.NIL;
                SubLObject inference2 = (SubLObject)inference_datastructures_strategy.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        if (inference_datastructures_strategy.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference2)) {
                            final SubLObject inference_var2 = inference2;
                            final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                            final SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject strategy2;
                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)inference_datastructures_strategy.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); inference_datastructures_strategy.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                if (inference_datastructures_strategy.NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
                                    set_problem_tactics_recompute_thrown_away(problem, strategy2);
                                }
                            }
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return (SubLObject)inference_datastructures_strategy.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 61916L)
    public static SubLObject set_problem_tactics_recompute_set_aside_wrt_all_relevant_strategies(final SubLObject problem) {
        final SubLObject store = inference_datastructures_problem.problem_store(problem);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (inference_datastructures_strategy.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_datastructures_strategy.$kw186$SKIP)) {
            final SubLObject idx_$14 = idx;
            if (inference_datastructures_strategy.NIL == id_index.id_index_dense_objects_empty_p(idx_$14, (SubLObject)inference_datastructures_strategy.$kw186$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$14);
                final SubLObject backwardP_var = (SubLObject)inference_datastructures_strategy.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference;
                SubLObject inference_var;
                SubLObject set_var;
                SubLObject set_contents_var;
                SubLObject basis_object;
                SubLObject state;
                SubLObject strategy;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_datastructures_strategy.NIL, v_iteration = (SubLObject)inference_datastructures_strategy.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_datastructures_strategy.ONE_INTEGER)) {
                    id = ((inference_datastructures_strategy.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_datastructures_strategy.ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (inference_datastructures_strategy.NIL == id_index.id_index_tombstone_p(inference) || inference_datastructures_strategy.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_datastructures_strategy.$kw186$SKIP)) {
                        if (inference_datastructures_strategy.NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = (SubLObject)inference_datastructures_strategy.$kw186$SKIP;
                        }
                        if (inference_datastructures_strategy.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
                            inference_var = inference;
                            set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                            set_contents_var = set.do_set_internal(set_var);
                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_datastructures_strategy.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_datastructures_strategy.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                strategy = set_contents.do_set_contents_next(basis_object, state);
                                if (inference_datastructures_strategy.NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                    set_problem_tactics_recompute_set_aside(problem, strategy);
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject idx_$15 = idx;
            if (inference_datastructures_strategy.NIL == id_index.id_index_sparse_objects_empty_p(idx_$15)) {
                final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$15);
                SubLObject id2 = (SubLObject)inference_datastructures_strategy.NIL;
                SubLObject inference2 = (SubLObject)inference_datastructures_strategy.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        if (inference_datastructures_strategy.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference2)) {
                            final SubLObject inference_var2 = inference2;
                            final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                            final SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject strategy2;
                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)inference_datastructures_strategy.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); inference_datastructures_strategy.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                if (inference_datastructures_strategy.NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
                                    set_problem_tactics_recompute_set_aside(problem, strategy2);
                                }
                            }
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return (SubLObject)inference_datastructures_strategy.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 62143L)
    public static SubLObject set_problem_tactics_recompute_thrown_away(final SubLObject problem, final SubLObject strategy) {
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject tactic = (SubLObject)inference_datastructures_strategy.NIL;
        tactic = cdolist_list_var.first();
        while (inference_datastructures_strategy.NIL != cdolist_list_var) {
            set_just_tactic_recompute_thrown_away(tactic, strategy);
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        set_just_problem_recompute_thrown_away(problem, strategy);
        return (SubLObject)inference_datastructures_strategy.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 62396L)
    public static SubLObject set_problem_tactics_recompute_set_aside(final SubLObject problem, final SubLObject strategy) {
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject tactic = (SubLObject)inference_datastructures_strategy.NIL;
        tactic = cdolist_list_var.first();
        while (inference_datastructures_strategy.NIL != cdolist_list_var) {
            set_just_tactic_recompute_set_aside(tactic, strategy);
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        set_just_problem_recompute_set_aside(problem, strategy);
        return (SubLObject)inference_datastructures_strategy.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 62906L)
    public static SubLObject cache_status_known_for_conditionsP(final SubLObject cache_status, final SubLObject value, final SubLObject conditions) {
        return Equality.eq(value, cache_status_for_conditions(cache_status, conditions));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 63150L)
    public static SubLObject cache_status_for_conditions(final SubLObject cache_status, final SubLObject conditions) {
        if (cache_status == inference_datastructures_strategy.$kw116$RECOMPUTE) {
            return (SubLObject)inference_datastructures_strategy.$kw116$RECOMPUTE;
        }
        if (cache_status.eql(inference_datastructures_strategy.$default_uninterestingness_cache_value$.getGlobalValue())) {
            return (SubLObject)inference_datastructures_strategy.$kw116$RECOMPUTE;
        }
        if (inference_datastructures_strategy.NIL != any_conditions_implyP(ConsesLow.nth((SubLObject)inference_datastructures_strategy.ZERO_INTEGER, cache_status), conditions, (SubLObject)inference_datastructures_strategy.NIL)) {
            return (SubLObject)inference_datastructures_strategy.T;
        }
        if (inference_datastructures_strategy.NIL != any_conditions_implyP(ConsesLow.nth((SubLObject)inference_datastructures_strategy.ONE_INTEGER, cache_status), conditions, (SubLObject)inference_datastructures_strategy.T)) {
            return (SubLObject)inference_datastructures_strategy.NIL;
        }
        return (SubLObject)inference_datastructures_strategy.$kw116$RECOMPUTE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 63624L)
    public static SubLObject modify_cache_status_for_value_and_conditions(SubLObject cache_status, final SubLObject value, final SubLObject conditions) {
        if (value == inference_datastructures_strategy.$kw116$RECOMPUTE) {
            cache_status = inference_datastructures_strategy.$default_uninterestingness_cache_value$.getGlobalValue();
        }
        else if (inference_datastructures_strategy.NIL == cache_status_known_for_conditionsP(cache_status, value, conditions)) {
            if (cache_status == inference_datastructures_strategy.$kw116$RECOMPUTE || cache_status.eql(inference_datastructures_strategy.$default_uninterestingness_cache_value$.getGlobalValue())) {
                cache_status = conses_high.copy_list(inference_datastructures_strategy.$default_uninterestingness_cache_value$.getGlobalValue());
            }
            final SubLObject conditions_nth = (SubLObject)((inference_datastructures_strategy.NIL != value) ? inference_datastructures_strategy.ZERO_INTEGER : inference_datastructures_strategy.ONE_INTEGER);
            final SubLObject current_conditions_list = ConsesLow.nth(conditions_nth, cache_status);
            SubLObject new_conditions_list = (SubLObject)inference_datastructures_strategy.NIL;
            if (conditions == inference_datastructures_strategy.$kw153$ALL) {
                new_conditions_list = (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_strategy.$kw153$ALL);
            }
            else {
                new_conditions_list = (SubLObject)ConsesLow.cons(conditions, new_conditions_list);
                SubLObject cdolist_list_var = current_conditions_list;
                SubLObject current_conditions = (SubLObject)inference_datastructures_strategy.NIL;
                current_conditions = cdolist_list_var.first();
                while (inference_datastructures_strategy.NIL != cdolist_list_var) {
                    if (inference_datastructures_strategy.NIL == conditions_implyP(conditions, current_conditions, (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_strategy.NIL == value))) {
                        new_conditions_list = (SubLObject)ConsesLow.cons(current_conditions, new_conditions_list);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    current_conditions = cdolist_list_var.first();
                }
            }
            ConsesLow.set_nth(conditions_nth, cache_status, new_conditions_list);
        }
        return cache_status;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 64845L)
    public static SubLObject any_conditions_implyP(final SubLObject p_conditions_list, final SubLObject q_conditions, final SubLObject negP) {
        SubLObject cdolist_list_var = p_conditions_list;
        SubLObject p_conditions = (SubLObject)inference_datastructures_strategy.NIL;
        p_conditions = cdolist_list_var.first();
        while (inference_datastructures_strategy.NIL != cdolist_list_var) {
            if (inference_datastructures_strategy.NIL != conditions_implyP(p_conditions, q_conditions, negP)) {
                return (SubLObject)inference_datastructures_strategy.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            p_conditions = cdolist_list_var.first();
        }
        return (SubLObject)inference_datastructures_strategy.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 65277L)
    public static SubLObject conditions_implyP(final SubLObject p_conditions, final SubLObject q_conditions, SubLObject negP) {
        if (negP == inference_datastructures_strategy.UNPROVIDED) {
            negP = (SubLObject)inference_datastructures_strategy.NIL;
        }
        if (p_conditions == inference_datastructures_strategy.$kw153$ALL) {
            return (SubLObject)inference_datastructures_strategy.T;
        }
        if (q_conditions == inference_datastructures_strategy.$kw153$ALL) {
            return (SubLObject)inference_datastructures_strategy.NIL;
        }
        return (inference_datastructures_strategy.NIL == negP) ? conditions_booleanly_implyP(p_conditions, q_conditions) : conditions_booleanly_implyP(q_conditions, p_conditions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 66074L)
    public static SubLObject conditions_booleanly_implyP(final SubLObject p_conditions, final SubLObject q_conditions) {
        SubLObject p_condition = (SubLObject)inference_datastructures_strategy.NIL;
        SubLObject p_condition_$16 = (SubLObject)inference_datastructures_strategy.NIL;
        SubLObject q_condition = (SubLObject)inference_datastructures_strategy.NIL;
        SubLObject q_condition_$17 = (SubLObject)inference_datastructures_strategy.NIL;
        p_condition = p_conditions;
        p_condition_$16 = p_condition.first();
        q_condition = q_conditions;
        q_condition_$17 = q_condition.first();
        while (inference_datastructures_strategy.NIL != q_condition || inference_datastructures_strategy.NIL != p_condition) {
            if (inference_datastructures_strategy.NIL != p_condition_$16 && inference_datastructures_strategy.NIL == q_condition_$17) {
                return (SubLObject)inference_datastructures_strategy.NIL;
            }
            p_condition = p_condition.rest();
            p_condition_$16 = p_condition.first();
            q_condition = q_condition.rest();
            q_condition_$17 = q_condition.first();
        }
        return (SubLObject)inference_datastructures_strategy.T;
    }
    
    public static SubLObject declare_inference_datastructures_strategy_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategy_print_function_trampoline", "STRATEGY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategy_p", "STRATEGY-P", 1, 0, false);
        new $strategy_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strat_suid", "STRAT-SUID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strat_inference", "STRAT-INFERENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strat_result_uniqueness_criterion", "STRAT-RESULT-UNIQUENESS-CRITERION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strat_active_problems", "STRAT-ACTIVE-PROBLEMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strat_motivated_problems", "STRAT-MOTIVATED-PROBLEMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strat_set_aside_problems", "STRAT-SET-ASIDE-PROBLEMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strat_should_reconsider_set_asidesP", "STRAT-SHOULD-RECONSIDER-SET-ASIDES?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strat_productivity_limit", "STRAT-PRODUCTIVITY-LIMIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strat_removal_backtracking_productivity_limit", "STRAT-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strat_proof_spec", "STRAT-PROOF-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strat_problem_proof_spec_index", "STRAT-PROBLEM-PROOF-SPEC-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strat_problem_strategic_index", "STRAT-PROBLEM-STRATEGIC-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strat_memoization_state", "STRAT-MEMOIZATION-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strat_step_count", "STRAT-STEP-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strat_type", "STRAT-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strat_data", "STRAT-DATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "_csetf_strat_suid", "_CSETF-STRAT-SUID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "_csetf_strat_inference", "_CSETF-STRAT-INFERENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "_csetf_strat_result_uniqueness_criterion", "_CSETF-STRAT-RESULT-UNIQUENESS-CRITERION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "_csetf_strat_active_problems", "_CSETF-STRAT-ACTIVE-PROBLEMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "_csetf_strat_motivated_problems", "_CSETF-STRAT-MOTIVATED-PROBLEMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "_csetf_strat_set_aside_problems", "_CSETF-STRAT-SET-ASIDE-PROBLEMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "_csetf_strat_should_reconsider_set_asidesP", "_CSETF-STRAT-SHOULD-RECONSIDER-SET-ASIDES?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "_csetf_strat_productivity_limit", "_CSETF-STRAT-PRODUCTIVITY-LIMIT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "_csetf_strat_removal_backtracking_productivity_limit", "_CSETF-STRAT-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "_csetf_strat_proof_spec", "_CSETF-STRAT-PROOF-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "_csetf_strat_problem_proof_spec_index", "_CSETF-STRAT-PROBLEM-PROOF-SPEC-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "_csetf_strat_problem_strategic_index", "_CSETF-STRAT-PROBLEM-STRATEGIC-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "_csetf_strat_memoization_state", "_CSETF-STRAT-MEMOIZATION-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "_csetf_strat_step_count", "_CSETF-STRAT-STEP-COUNT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "_csetf_strat_type", "_CSETF-STRAT-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "_csetf_strat_data", "_CSETF-STRAT-DATA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "make_strategy", "MAKE-STRATEGY", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "visit_defstruct_strategy", "VISIT-DEFSTRUCT-STRATEGY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "visit_defstruct_object_strategy_method", "VISIT-DEFSTRUCT-OBJECT-STRATEGY-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "valid_strategy_p", "VALID-STRATEGY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategy_invalid_p", "STRATEGY-INVALID-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "print_strategy", "PRINT-STRATEGY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "sxhash_strategy_method", "SXHASH-STRATEGY-METHOD", 1, 0, false);
        new $sxhash_strategy_method$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "new_strategy", "NEW-STRATEGY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "destroy_strategy", "DESTROY-STRATEGY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "destroy_problem_store_strategy", "DESTROY-PROBLEM-STORE-STRATEGY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "destroy_inference_strategy", "DESTROY-INFERENCE-STRATEGY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "destroy_strategy_int", "DESTROY-STRATEGY-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "note_strategy_invalid", "NOTE-STRATEGY-INVALID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "remove_strategy_problem", "REMOVE-STRATEGY-PROBLEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategy_suid", "STRATEGY-SUID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategy_inference", "STRATEGY-INFERENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategy_local_result_uniqueness_criterion", "STRATEGY-LOCAL-RESULT-UNIQUENESS-CRITERION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategy_problem_strategic_index", "STRATEGY-PROBLEM-STRATEGIC-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategy_type", "STRATEGY-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategy_data", "STRATEGY-DATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategy_active_problems", "STRATEGY-ACTIVE-PROBLEMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategy_motivated_problems", "STRATEGY-MOTIVATED-PROBLEMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategy_set_aside_problems", "STRATEGY-SET-ASIDE-PROBLEMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategy_should_reconsider_set_asidesP", "STRATEGY-SHOULD-RECONSIDER-SET-ASIDES?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategy_productivity_limit", "STRATEGY-PRODUCTIVITY-LIMIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategy_removal_backtracking_productivity_limit", "STRATEGY-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategy_proof_spec", "STRATEGY-PROOF-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategy_problem_proof_spec_index", "STRATEGY-PROBLEM-PROOF-SPEC-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategy_step_count", "STRATEGY-STEP-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "set_strategy_result_uniqueness_criterion", "SET-STRATEGY-RESULT-UNIQUENESS-CRITERION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "set_strategy_productivity_limit", "SET-STRATEGY-PRODUCTIVITY-LIMIT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "set_strategy_removal_backtracking_productivity_limit", "SET-STRATEGY-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "set_strategy_proof_spec", "SET-STRATEGY-PROOF-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "set_strategy_data", "SET-STRATEGY-DATA", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "do_strategy_active_problems", "DO-STRATEGY-ACTIVE-PROBLEMS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "do_strategy_motivated_problems", "DO-STRATEGY-MOTIVATED-PROBLEMS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "do_strategy_set_aside_problems", "DO-STRATEGY-SET-ASIDE-PROBLEMS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "with_strategy_memoization_state", "WITH-STRATEGY-MEMOIZATION-STATE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategy_memoization_state", "STRATEGY-MEMOIZATION-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "current_strategy_wrt_memoization", "CURRENT-STRATEGY-WRT-MEMOIZATION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategic_context_inference", "STRATEGIC-CONTEXT-INFERENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategy_answer_link", "STRATEGY-ANSWER-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategy_answer_link_propagatedP", "STRATEGY-ANSWER-LINK-PROPAGATED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategy_should_propagate_answer_linkP", "STRATEGY-SHOULD-PROPAGATE-ANSWER-LINK?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategy_root_problem", "STRATEGY-ROOT-PROBLEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategy_continuableP", "STRATEGY-CONTINUABLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "problem_active_in_strategyP", "PROBLEM-ACTIVE-IN-STRATEGY?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "problem_motivatedP", "PROBLEM-MOTIVATED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "problem_set_aside_in_strategyP", "PROBLEM-SET-ASIDE-IN-STRATEGY?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategy_has_some_set_aside_problemsP", "STRATEGY-HAS-SOME-SET-ASIDE-PROBLEMS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategy_all_valid_set_aside_problems", "STRATEGY-ALL-VALID-SET-ASIDE-PROBLEMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategy_problem_store", "STRATEGY-PROBLEM-STORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategy_result_uniqueness_criterion", "STRATEGY-RESULT-UNIQUENESS-CRITERION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategy_unique_wrt_proofsP", "STRATEGY-UNIQUE-WRT-PROOFS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategy_unique_wrt_bindingsP", "STRATEGY-UNIQUE-WRT-BINDINGS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategy_wants_one_answerP", "STRATEGY-WANTS-ONE-ANSWER?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategy_active_problem_count", "STRATEGY-ACTIVE-PROBLEM-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategy_motivated_problem_count", "STRATEGY-MOTIVATED-PROBLEM-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategy_set_aside_problem_count", "STRATEGY-SET-ASIDE-PROBLEM-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategy_problem_proof_spec", "STRATEGY-PROBLEM-PROOF-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "set_strategy_property", "SET-STRATEGY-PROPERTY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "copy_strategy_properties", "COPY-STRATEGY-PROPERTIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "set_strategy_properties", "SET-STRATEGY-PROPERTIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategy_note_problem_active", "STRATEGY-NOTE-PROBLEM-ACTIVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategy_note_problem_inactive", "STRATEGY-NOTE-PROBLEM-INACTIVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategy_note_problem_motivated", "STRATEGY-NOTE-PROBLEM-MOTIVATED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategy_note_problem_unmotivated", "STRATEGY-NOTE-PROBLEM-UNMOTIVATED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategy_note_problem_set_aside", "STRATEGY-NOTE-PROBLEM-SET-ASIDE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategy_clear_problem_set_aside", "STRATEGY-CLEAR-PROBLEM-SET-ASIDE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategy_clear_set_asides", "STRATEGY-CLEAR-SET-ASIDES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "note_strategy_should_reconsider_set_asides", "NOTE-STRATEGY-SHOULD-RECONSIDER-SET-ASIDES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "clear_strategy_should_reconsider_set_asides", "CLEAR-STRATEGY-SHOULD-RECONSIDER-SET-ASIDES", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "with_strategically_active_problem", "WITH-STRATEGICALLY-ACTIVE-PROBLEM");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategy_note_problem_proof_spec", "STRATEGY-NOTE-PROBLEM-PROOF-SPEC", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "increment_strategy_step_count", "INCREMENT-STRATEGY-STEP-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategy_dispatch", "STRATEGY-DISPATCH", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategy_dispatch_handler", "STRATEGY-DISPATCH-HANDLER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategy_dispatch_funcall_0", "STRATEGY-DISPATCH-FUNCALL-0", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategy_dispatch_funcall_1", "STRATEGY-DISPATCH-FUNCALL-1", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategy_dispatch_funcall_2", "STRATEGY-DISPATCH-FUNCALL-2", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategy_dispatch_funcall_3", "STRATEGY-DISPATCH-FUNCALL-3", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategy_dispatch_funcall_4", "STRATEGY-DISPATCH-FUNCALL-4", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategy_dispatch_funcall_5", "STRATEGY-DISPATCH-FUNCALL-5", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategy_dispatch_unexpected_strategy_type_error", "STRATEGY-DISPATCH-UNEXPECTED-STRATEGY-TYPE-ERROR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "controlling_strategy_callback", "CONTROLLING-STRATEGY-CALLBACK", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategy_type_p", "STRATEGY-TYPE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "new_strategy_type", "NEW-STRATEGY-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "deregister_strategy_type", "DEREGISTER-STRATEGY-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "clear_strategy_type_store", "CLEAR-STRATEGY-TYPE-STORE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategy_type_property", "STRATEGY-TYPE-PROPERTY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "set_strategy_type_property", "SET-STRATEGY-TYPE-PROPERTY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "default_uninterestingness_cache_value", "DEFAULT-UNINTERESTINGNESS-CACHE-VALUE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "problem_strategic_properties_print_function_trampoline", "PROBLEM-STRATEGIC-PROPERTIES-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "problem_strategic_properties_p", "PROBLEM-STRATEGIC-PROPERTIES-P", 1, 0, false);
        new $problem_strategic_properties_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "prob_strategic_properties_status", "PROB-STRATEGIC-PROPERTIES-STATUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "prob_strategic_properties_tactic_strategic_property_index", "PROB-STRATEGIC-PROPERTIES-TACTIC-STRATEGIC-PROPERTY-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "prob_strategic_properties_possible_tactic_count", "PROB-STRATEGIC-PROPERTIES-POSSIBLE-TACTIC-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "prob_strategic_properties_uninterestingness", "PROB-STRATEGIC-PROPERTIES-UNINTERESTINGNESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "_csetf_prob_strategic_properties_status", "_CSETF-PROB-STRATEGIC-PROPERTIES-STATUS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "_csetf_prob_strategic_properties_tactic_strategic_property_index", "_CSETF-PROB-STRATEGIC-PROPERTIES-TACTIC-STRATEGIC-PROPERTY-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "_csetf_prob_strategic_properties_possible_tactic_count", "_CSETF-PROB-STRATEGIC-PROPERTIES-POSSIBLE-TACTIC-COUNT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "_csetf_prob_strategic_properties_uninterestingness", "_CSETF-PROB-STRATEGIC-PROPERTIES-UNINTERESTINGNESS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "make_problem_strategic_properties", "MAKE-PROBLEM-STRATEGIC-PROPERTIES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "visit_defstruct_problem_strategic_properties", "VISIT-DEFSTRUCT-PROBLEM-STRATEGIC-PROPERTIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "visit_defstruct_object_problem_strategic_properties_method", "VISIT-DEFSTRUCT-OBJECT-PROBLEM-STRATEGIC-PROPERTIES-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "new_problem_strategic_properties", "NEW-PROBLEM-STRATEGIC-PROPERTIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "problem_strategic_properties_int", "PROBLEM-STRATEGIC-PROPERTIES-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "set_problem_strategic_properties", "SET-PROBLEM-STRATEGIC-PROPERTIES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "remove_problem_strategic_properties", "REMOVE-PROBLEM-STRATEGIC-PROPERTIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "problem_strategic_properties", "PROBLEM-STRATEGIC-PROPERTIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "problem_strategic_properties_tactic_strategic_property_index", "PROBLEM-STRATEGIC-PROPERTIES-TACTIC-STRATEGIC-PROPERTY-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "problem_dwimmed_strategic_status", "PROBLEM-DWIMMED-STRATEGIC-STATUS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "problem_raw_strategic_status", "PROBLEM-RAW-STRATEGIC-STATUS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "problem_weak_strategic_status", "PROBLEM-WEAK-STRATEGIC-STATUS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "problem_strategic_status", "PROBLEM-STRATEGIC-STATUS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "problem_strategic_provability_status", "PROBLEM-STRATEGIC-PROVABILITY-STATUS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "problem_tactical_or_strategic_status", "PROBLEM-TACTICAL-OR-STRATEGIC-STATUS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "problem_provability_status", "PROBLEM-PROVABILITY-STATUS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "set_problem_raw_strategic_status", "SET-PROBLEM-RAW-STRATEGIC-STATUS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategically_unexamined_problem_p", "STRATEGICALLY-UNEXAMINED-PROBLEM-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategically_examined_problem_p", "STRATEGICALLY-EXAMINED-PROBLEM-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategically_possible_problem_p", "STRATEGICALLY-POSSIBLE-PROBLEM-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategically_pending_problem_p", "STRATEGICALLY-PENDING-PROBLEM-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategically_finished_problem_p", "STRATEGICALLY-FINISHED-PROBLEM-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategically_no_good_problem_p", "STRATEGICALLY-NO-GOOD-PROBLEM-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategically_neutral_problem_p", "STRATEGICALLY-NEUTRAL-PROBLEM-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategically_good_problem_p", "STRATEGICALLY-GOOD-PROBLEM-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategically_potentially_possible_problem_p", "STRATEGICALLY-POTENTIALLY-POSSIBLE-PROBLEM-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategically_not_potentially_possible_problem_p", "STRATEGICALLY-NOT-POTENTIALLY-POSSIBLE-PROBLEM-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "strategically_totally_no_good_problem_p", "STRATEGICALLY-TOTALLY-NO-GOOD-PROBLEM-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "problem_strategic_uninterestingness", "PROBLEM-STRATEGIC-UNINTERESTINGNESS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "set_problem_strategic_uninterestingness", "SET-PROBLEM-STRATEGIC-UNINTERESTINGNESS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "set_just_problem_thrown_away", "SET-JUST-PROBLEM-THROWN-AWAY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "set_just_problem_not_thrown_away", "SET-JUST-PROBLEM-NOT-THROWN-AWAY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "set_just_problem_recompute_thrown_away", "SET-JUST-PROBLEM-RECOMPUTE-THROWN-AWAY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "set_just_problem_set_aside", "SET-JUST-PROBLEM-SET-ASIDE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "set_just_problem_not_set_aside", "SET-JUST-PROBLEM-NOT-SET-ASIDE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "set_just_problem_recompute_set_aside", "SET-JUST-PROBLEM-RECOMPUTE-SET-ASIDE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "problem_thrown_away_cache_status", "PROBLEM-THROWN-AWAY-CACHE-STATUS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "problem_set_aside_cache_status", "PROBLEM-SET-ASIDE-CACHE-STATUS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "set_problem_thrown_away", "SET-PROBLEM-THROWN-AWAY", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "set_problem_not_thrown_away", "SET-PROBLEM-NOT-THROWN-AWAY", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "set_problem_set_aside", "SET-PROBLEM-SET-ASIDE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "set_problem_not_set_aside", "SET-PROBLEM-NOT-SET-ASIDE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "set_problem_recompute_thrown_away", "SET-PROBLEM-RECOMPUTE-THROWN-AWAY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "set_problem_recompute_set_aside", "SET-PROBLEM-RECOMPUTE-SET-ASIDE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "tactic_strategic_properties_print_function_trampoline", "TACTIC-STRATEGIC-PROPERTIES-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "tactic_strategic_properties_p", "TACTIC-STRATEGIC-PROPERTIES-P", 1, 0, false);
        new $tactic_strategic_properties_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "tact_strategic_properties_preference_level", "TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "tact_strategic_properties_preference_level_justification", "TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL-JUSTIFICATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "tact_strategic_properties_productivity", "TACT-STRATEGIC-PROPERTIES-PRODUCTIVITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "tact_strategic_properties_uninterestingness", "TACT-STRATEGIC-PROPERTIES-UNINTERESTINGNESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "_csetf_tact_strategic_properties_preference_level", "_CSETF-TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "_csetf_tact_strategic_properties_preference_level_justification", "_CSETF-TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL-JUSTIFICATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "_csetf_tact_strategic_properties_productivity", "_CSETF-TACT-STRATEGIC-PROPERTIES-PRODUCTIVITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "_csetf_tact_strategic_properties_uninterestingness", "_CSETF-TACT-STRATEGIC-PROPERTIES-UNINTERESTINGNESS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "make_tactic_strategic_properties", "MAKE-TACTIC-STRATEGIC-PROPERTIES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "visit_defstruct_tactic_strategic_properties", "VISIT-DEFSTRUCT-TACTIC-STRATEGIC-PROPERTIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "visit_defstruct_object_tactic_strategic_properties_method", "VISIT-DEFSTRUCT-OBJECT-TACTIC-STRATEGIC-PROPERTIES-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "new_tactic_strategic_properties", "NEW-TACTIC-STRATEGIC-PROPERTIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "tactic_strategic_properties_int", "TACTIC-STRATEGIC-PROPERTIES-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "set_tactic_strategic_properties", "SET-TACTIC-STRATEGIC-PROPERTIES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "tactic_strategic_properties", "TACTIC-STRATEGIC-PROPERTIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "tactic_strategic_completeness", "TACTIC-STRATEGIC-COMPLETENESS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "tactic_strategic_preference_level", "TACTIC-STRATEGIC-PREFERENCE-LEVEL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "tactic_strategic_preference_level_justification", "TACTIC-STRATEGIC-PREFERENCE-LEVEL-JUSTIFICATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "tactic_strategic_dwimmed_completeness", "TACTIC-STRATEGIC-DWIMMED-COMPLETENESS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "conjunctive_tactic_strategic_preference_level", "CONJUNCTIVE-TACTIC-STRATEGIC-PREFERENCE-LEVEL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "conjunctive_tactic_strategic_preference_level_justification", "CONJUNCTIVE-TACTIC-STRATEGIC-PREFERENCE-LEVEL-JUSTIFICATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "tactic_strategic_productivity", "TACTIC-STRATEGIC-PRODUCTIVITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "tactic_strategically_preferredP", "TACTIC-STRATEGICALLY-PREFERRED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "set_tactic_strategic_preference_level", "SET-TACTIC-STRATEGIC-PREFERENCE-LEVEL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "set_tactic_strategic_productivity", "SET-TACTIC-STRATEGIC-PRODUCTIVITY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "problem_strategically_possible_tactic_count", "PROBLEM-STRATEGICALLY-POSSIBLE-TACTIC-COUNT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "problem_note_tactic_strategically_possible", "PROBLEM-NOTE-TACTIC-STRATEGICALLY-POSSIBLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "problem_note_tactic_not_strategically_possible", "PROBLEM-NOTE-TACTIC-NOT-STRATEGICALLY-POSSIBLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "problem_note_all_tactics_not_strategically_possible", "PROBLEM-NOTE-ALL-TACTICS-NOT-STRATEGICALLY-POSSIBLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "tactic_strategic_uninterestingness", "TACTIC-STRATEGIC-UNINTERESTINGNESS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "set_tactic_strategic_uninterestingness", "SET-TACTIC-STRATEGIC-UNINTERESTINGNESS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "thrown_away_cache_status_from_uninterestingness", "THROWN-AWAY-CACHE-STATUS-FROM-UNINTERESTINGNESS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "set_aside_cache_status_from_uninterestingness", "SET-ASIDE-CACHE-STATUS-FROM-UNINTERESTINGNESS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "note_uninterestingness_cache_thrown_away_value", "NOTE-UNINTERESTINGNESS-CACHE-THROWN-AWAY-VALUE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "note_uninterestingness_cache_set_aside_value", "NOTE-UNINTERESTINGNESS-CACHE-SET-ASIDE-VALUE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "uninterestingness_cache_value_p", "UNINTERESTINGNESS-CACHE-VALUE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "uninterestingness_cache_conditions_p", "UNINTERESTINGNESS-CACHE-CONDITIONS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "uninterestingness_cache_conditions_list_p", "UNINTERESTINGNESS-CACHE-CONDITIONS-LIST-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "thrown_away_cache_value_p", "THROWN-AWAY-CACHE-VALUE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "set_aside_cache_value_p", "SET-ASIDE-CACHE-VALUE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "ignore_cache_value_p", "IGNORE-CACHE-VALUE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "set_just_tactic_thrown_away", "SET-JUST-TACTIC-THROWN-AWAY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "set_just_tactic_not_thrown_away", "SET-JUST-TACTIC-NOT-THROWN-AWAY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "set_just_tactic_recompute_thrown_away", "SET-JUST-TACTIC-RECOMPUTE-THROWN-AWAY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "set_just_tactic_set_aside", "SET-JUST-TACTIC-SET-ASIDE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "set_just_tactic_not_set_aside", "SET-JUST-TACTIC-NOT-SET-ASIDE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "set_just_tactic_recompute_set_aside", "SET-JUST-TACTIC-RECOMPUTE-SET-ASIDE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "tactic_thrown_away_cache_status", "TACTIC-THROWN-AWAY-CACHE-STATUS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "tactic_set_aside_cache_status", "TACTIC-SET-ASIDE-CACHE-STATUS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "set_tactic_thrown_away", "SET-TACTIC-THROWN-AWAY", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "set_tactic_not_thrown_away", "SET-TACTIC-NOT-THROWN-AWAY", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "set_tactic_recompute_thrown_away", "SET-TACTIC-RECOMPUTE-THROWN-AWAY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "set_tactic_set_aside", "SET-TACTIC-SET-ASIDE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "set_tactic_not_set_aside", "SET-TACTIC-NOT-SET-ASIDE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "set_tactic_recompute_set_aside", "SET-TACTIC-RECOMPUTE-SET-ASIDE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "set_problem_recompute_thrown_away_wrt_all_relevant_strategies", "SET-PROBLEM-RECOMPUTE-THROWN-AWAY-WRT-ALL-RELEVANT-STRATEGIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "set_problem_recompute_set_aside_wrt_all_relevant_strategies", "SET-PROBLEM-RECOMPUTE-SET-ASIDE-WRT-ALL-RELEVANT-STRATEGIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "set_tactic_recompute_thrown_away_wrt_all_relevant_strategies", "SET-TACTIC-RECOMPUTE-THROWN-AWAY-WRT-ALL-RELEVANT-STRATEGIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "set_tactic_recompute_set_aside_wrt_all_relevant_strategies", "SET-TACTIC-RECOMPUTE-SET-ASIDE-WRT-ALL-RELEVANT-STRATEGIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "set_problem_tactics_recompute_thrown_away_wrt_all_relevant_strategies", "SET-PROBLEM-TACTICS-RECOMPUTE-THROWN-AWAY-WRT-ALL-RELEVANT-STRATEGIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "set_problem_tactics_recompute_set_aside_wrt_all_relevant_strategies", "SET-PROBLEM-TACTICS-RECOMPUTE-SET-ASIDE-WRT-ALL-RELEVANT-STRATEGIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "set_problem_tactics_recompute_thrown_away", "SET-PROBLEM-TACTICS-RECOMPUTE-THROWN-AWAY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "set_problem_tactics_recompute_set_aside", "SET-PROBLEM-TACTICS-RECOMPUTE-SET-ASIDE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "cache_status_known_for_conditionsP", "CACHE-STATUS-KNOWN-FOR-CONDITIONS?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "cache_status_for_conditions", "CACHE-STATUS-FOR-CONDITIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "modify_cache_status_for_value_and_conditions", "MODIFY-CACHE-STATUS-FOR-VALUE-AND-CONDITIONS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "any_conditions_implyP", "ANY-CONDITIONS-IMPLY?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "conditions_implyP", "CONDITIONS-IMPLY?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy", "conditions_booleanly_implyP", "CONDITIONS-BOOLEANLY-IMPLY?", 2, 0, false);
        return (SubLObject)inference_datastructures_strategy.NIL;
    }
    
    public static SubLObject init_inference_datastructures_strategy_file() {
        inference_datastructures_strategy.$dtp_strategy$ = SubLFiles.defconstant("*DTP-STRATEGY*", (SubLObject)inference_datastructures_strategy.$sym0$STRATEGY);
        inference_datastructures_strategy.$current_strategy_wrt_memoization$ = SubLFiles.defparameter("*CURRENT-STRATEGY-WRT-MEMOIZATION*", (SubLObject)inference_datastructures_strategy.NIL);
        inference_datastructures_strategy.$strategy_type_store$ = SubLFiles.deflexical("*STRATEGY-TYPE-STORE*", (inference_datastructures_strategy.NIL != Symbols.boundp((SubLObject)inference_datastructures_strategy.$sym113$_STRATEGY_TYPE_STORE_)) ? inference_datastructures_strategy.$strategy_type_store$.getGlobalValue() : dictionary.new_dictionary(Symbols.symbol_function((SubLObject)inference_datastructures_strategy.EQ), (SubLObject)inference_datastructures_strategy.FIVE_INTEGER));
        inference_datastructures_strategy.$uninterestingness_cache_lookup_enabledP$ = SubLFiles.defparameter("*UNINTERESTINGNESS-CACHE-LOOKUP-ENABLED?*", (SubLObject)inference_datastructures_strategy.T);
        inference_datastructures_strategy.$dtp_problem_strategic_properties$ = SubLFiles.defconstant("*DTP-PROBLEM-STRATEGIC-PROPERTIES*", (SubLObject)inference_datastructures_strategy.$sym117$PROBLEM_STRATEGIC_PROPERTIES);
        inference_datastructures_strategy.$dtp_tactic_strategic_properties$ = SubLFiles.defconstant("*DTP-TACTIC-STRATEGIC-PROPERTIES*", (SubLObject)inference_datastructures_strategy.$sym154$TACTIC_STRATEGIC_PROPERTIES);
        inference_datastructures_strategy.$default_uninterestingness_cache_value$ = SubLFiles.deflexical("*DEFAULT-UNINTERESTINGNESS-CACHE-VALUE*", (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_strategy.NIL, (SubLObject)inference_datastructures_strategy.NIL));
        return (SubLObject)inference_datastructures_strategy.NIL;
    }
    
    public static SubLObject setup_inference_datastructures_strategy_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), inference_datastructures_strategy.$dtp_strategy$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_datastructures_strategy.$sym7$STRATEGY_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)inference_datastructures_strategy.$list8);
        Structures.def_csetf((SubLObject)inference_datastructures_strategy.$sym9$STRAT_SUID, (SubLObject)inference_datastructures_strategy.$sym10$_CSETF_STRAT_SUID);
        Structures.def_csetf((SubLObject)inference_datastructures_strategy.$sym11$STRAT_INFERENCE, (SubLObject)inference_datastructures_strategy.$sym12$_CSETF_STRAT_INFERENCE);
        Structures.def_csetf((SubLObject)inference_datastructures_strategy.$sym13$STRAT_RESULT_UNIQUENESS_CRITERION, (SubLObject)inference_datastructures_strategy.$sym14$_CSETF_STRAT_RESULT_UNIQUENESS_CRITERION);
        Structures.def_csetf((SubLObject)inference_datastructures_strategy.$sym15$STRAT_ACTIVE_PROBLEMS, (SubLObject)inference_datastructures_strategy.$sym16$_CSETF_STRAT_ACTIVE_PROBLEMS);
        Structures.def_csetf((SubLObject)inference_datastructures_strategy.$sym17$STRAT_MOTIVATED_PROBLEMS, (SubLObject)inference_datastructures_strategy.$sym18$_CSETF_STRAT_MOTIVATED_PROBLEMS);
        Structures.def_csetf((SubLObject)inference_datastructures_strategy.$sym19$STRAT_SET_ASIDE_PROBLEMS, (SubLObject)inference_datastructures_strategy.$sym20$_CSETF_STRAT_SET_ASIDE_PROBLEMS);
        Structures.def_csetf((SubLObject)inference_datastructures_strategy.$sym21$STRAT_SHOULD_RECONSIDER_SET_ASIDES_, (SubLObject)inference_datastructures_strategy.$sym22$_CSETF_STRAT_SHOULD_RECONSIDER_SET_ASIDES_);
        Structures.def_csetf((SubLObject)inference_datastructures_strategy.$sym23$STRAT_PRODUCTIVITY_LIMIT, (SubLObject)inference_datastructures_strategy.$sym24$_CSETF_STRAT_PRODUCTIVITY_LIMIT);
        Structures.def_csetf((SubLObject)inference_datastructures_strategy.$sym25$STRAT_REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT, (SubLObject)inference_datastructures_strategy.$sym26$_CSETF_STRAT_REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT);
        Structures.def_csetf((SubLObject)inference_datastructures_strategy.$sym27$STRAT_PROOF_SPEC, (SubLObject)inference_datastructures_strategy.$sym28$_CSETF_STRAT_PROOF_SPEC);
        Structures.def_csetf((SubLObject)inference_datastructures_strategy.$sym29$STRAT_PROBLEM_PROOF_SPEC_INDEX, (SubLObject)inference_datastructures_strategy.$sym30$_CSETF_STRAT_PROBLEM_PROOF_SPEC_INDEX);
        Structures.def_csetf((SubLObject)inference_datastructures_strategy.$sym31$STRAT_PROBLEM_STRATEGIC_INDEX, (SubLObject)inference_datastructures_strategy.$sym32$_CSETF_STRAT_PROBLEM_STRATEGIC_INDEX);
        Structures.def_csetf((SubLObject)inference_datastructures_strategy.$sym33$STRAT_MEMOIZATION_STATE, (SubLObject)inference_datastructures_strategy.$sym34$_CSETF_STRAT_MEMOIZATION_STATE);
        Structures.def_csetf((SubLObject)inference_datastructures_strategy.$sym35$STRAT_STEP_COUNT, (SubLObject)inference_datastructures_strategy.$sym36$_CSETF_STRAT_STEP_COUNT);
        Structures.def_csetf((SubLObject)inference_datastructures_strategy.$sym37$STRAT_TYPE, (SubLObject)inference_datastructures_strategy.$sym38$_CSETF_STRAT_TYPE);
        Structures.def_csetf((SubLObject)inference_datastructures_strategy.$sym39$STRAT_DATA, (SubLObject)inference_datastructures_strategy.$sym40$_CSETF_STRAT_DATA);
        Equality.identity((SubLObject)inference_datastructures_strategy.$sym0$STRATEGY);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), inference_datastructures_strategy.$dtp_strategy$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_datastructures_strategy.$sym62$VISIT_DEFSTRUCT_OBJECT_STRATEGY_METHOD));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), inference_datastructures_strategy.$dtp_strategy$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_datastructures_strategy.$sym66$SXHASH_STRATEGY_METHOD));
        access_macros.register_macro_helper((SubLObject)inference_datastructures_strategy.$sym71$STRATEGY_ACTIVE_PROBLEMS, (SubLObject)inference_datastructures_strategy.$sym72$DO_STRATEGY_ACTIVE_PROBLEMS);
        access_macros.register_macro_helper((SubLObject)inference_datastructures_strategy.$sym73$STRATEGY_MOTIVATED_PROBLEMS, (SubLObject)inference_datastructures_strategy.$sym74$DO_STRATEGY_MOTIVATED_PROBLEMS);
        access_macros.register_macro_helper((SubLObject)inference_datastructures_strategy.$sym75$STRATEGY_SET_ASIDE_PROBLEMS, (SubLObject)inference_datastructures_strategy.$sym76$DO_STRATEGY_SET_ASIDE_PROBLEMS);
        access_macros.register_macro_helper((SubLObject)inference_datastructures_strategy.$sym90$STRATEGY_MEMOIZATION_STATE, (SubLObject)inference_datastructures_strategy.$sym93$WITH_STRATEGY_MEMOIZATION_STATE);
        access_macros.register_macro_helper((SubLObject)inference_datastructures_strategy.$sym94$CURRENT_STRATEGY_WRT_MEMOIZATION, (SubLObject)inference_datastructures_strategy.$sym93$WITH_STRATEGY_MEMOIZATION_STATE);
        subl_macro_promotions.declare_defglobal((SubLObject)inference_datastructures_strategy.$sym113$_STRATEGY_TYPE_STORE_);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), inference_datastructures_strategy.$dtp_problem_strategic_properties$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_datastructures_strategy.$sym124$PROBLEM_STRATEGIC_PROPERTIES_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)inference_datastructures_strategy.$list125);
        Structures.def_csetf((SubLObject)inference_datastructures_strategy.$sym126$PROB_STRATEGIC_PROPERTIES_STATUS, (SubLObject)inference_datastructures_strategy.$sym127$_CSETF_PROB_STRATEGIC_PROPERTIES_STATUS);
        Structures.def_csetf((SubLObject)inference_datastructures_strategy.$sym128$PROB_STRATEGIC_PROPERTIES_TACTIC_STRATEGIC_PROPERTY_INDEX, (SubLObject)inference_datastructures_strategy.$sym129$_CSETF_PROB_STRATEGIC_PROPERTIES_TACTIC_STRATEGIC_PROPERTY_INDEX);
        Structures.def_csetf((SubLObject)inference_datastructures_strategy.$sym130$PROB_STRATEGIC_PROPERTIES_POSSIBLE_TACTIC_COUNT, (SubLObject)inference_datastructures_strategy.$sym131$_CSETF_PROB_STRATEGIC_PROPERTIES_POSSIBLE_TACTIC_COUNT);
        Structures.def_csetf((SubLObject)inference_datastructures_strategy.$sym132$PROB_STRATEGIC_PROPERTIES_UNINTERESTINGNESS, (SubLObject)inference_datastructures_strategy.$sym133$_CSETF_PROB_STRATEGIC_PROPERTIES_UNINTERESTINGNESS);
        Equality.identity((SubLObject)inference_datastructures_strategy.$sym117$PROBLEM_STRATEGIC_PROPERTIES);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), inference_datastructures_strategy.$dtp_problem_strategic_properties$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_datastructures_strategy.$sym139$VISIT_DEFSTRUCT_OBJECT_PROBLEM_STRATEGIC_PROPERTIES_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), inference_datastructures_strategy.$dtp_tactic_strategic_properties$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_datastructures_strategy.$sym160$TACTIC_STRATEGIC_PROPERTIES_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)inference_datastructures_strategy.$list161);
        Structures.def_csetf((SubLObject)inference_datastructures_strategy.$sym162$TACT_STRATEGIC_PROPERTIES_PREFERENCE_LEVEL, (SubLObject)inference_datastructures_strategy.$sym163$_CSETF_TACT_STRATEGIC_PROPERTIES_PREFERENCE_LEVEL);
        Structures.def_csetf((SubLObject)inference_datastructures_strategy.$sym164$TACT_STRATEGIC_PROPERTIES_PREFERENCE_LEVEL_JUSTIFICATION, (SubLObject)inference_datastructures_strategy.$sym165$_CSETF_TACT_STRATEGIC_PROPERTIES_PREFERENCE_LEVEL_JUSTIFICATION);
        Structures.def_csetf((SubLObject)inference_datastructures_strategy.$sym166$TACT_STRATEGIC_PROPERTIES_PRODUCTIVITY, (SubLObject)inference_datastructures_strategy.$sym167$_CSETF_TACT_STRATEGIC_PROPERTIES_PRODUCTIVITY);
        Structures.def_csetf((SubLObject)inference_datastructures_strategy.$sym168$TACT_STRATEGIC_PROPERTIES_UNINTERESTINGNESS, (SubLObject)inference_datastructures_strategy.$sym169$_CSETF_TACT_STRATEGIC_PROPERTIES_UNINTERESTINGNESS);
        Equality.identity((SubLObject)inference_datastructures_strategy.$sym154$TACTIC_STRATEGIC_PROPERTIES);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), inference_datastructures_strategy.$dtp_tactic_strategic_properties$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_datastructures_strategy.$sym174$VISIT_DEFSTRUCT_OBJECT_TACTIC_STRATEGIC_PROPERTIES_METHOD));
        return (SubLObject)inference_datastructures_strategy.NIL;
    }
    
    public void declareFunctions() {
        declare_inference_datastructures_strategy_file();
    }
    
    public void initializeVariables() {
        init_inference_datastructures_strategy_file();
    }
    
    public void runTopLevelForms() {
        setup_inference_datastructures_strategy_file();
    }
    
    static {
        me = (SubLFile)new inference_datastructures_strategy();
        inference_datastructures_strategy.$dtp_strategy$ = null;
        inference_datastructures_strategy.$current_strategy_wrt_memoization$ = null;
        inference_datastructures_strategy.$strategy_type_store$ = null;
        inference_datastructures_strategy.$uninterestingness_cache_lookup_enabledP$ = null;
        inference_datastructures_strategy.$dtp_problem_strategic_properties$ = null;
        inference_datastructures_strategy.$dtp_tactic_strategic_properties$ = null;
        inference_datastructures_strategy.$default_uninterestingness_cache_value$ = null;
        $sym0$STRATEGY = SubLObjectFactory.makeSymbol("STRATEGY");
        $sym1$STRATEGY_P = SubLObjectFactory.makeSymbol("STRATEGY-P");
        $list2 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("SUID"), SubLObjectFactory.makeSymbol("INFERENCE"), SubLObjectFactory.makeSymbol("RESULT-UNIQUENESS-CRITERION"), SubLObjectFactory.makeSymbol("ACTIVE-PROBLEMS"), SubLObjectFactory.makeSymbol("MOTIVATED-PROBLEMS"), SubLObjectFactory.makeSymbol("SET-ASIDE-PROBLEMS"), SubLObjectFactory.makeSymbol("SHOULD-RECONSIDER-SET-ASIDES?"), SubLObjectFactory.makeSymbol("PRODUCTIVITY-LIMIT"), SubLObjectFactory.makeSymbol("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), SubLObjectFactory.makeSymbol("PROOF-SPEC"), SubLObjectFactory.makeSymbol("PROBLEM-PROOF-SPEC-INDEX"), SubLObjectFactory.makeSymbol("PROBLEM-STRATEGIC-INDEX"), SubLObjectFactory.makeSymbol("MEMOIZATION-STATE"), SubLObjectFactory.makeSymbol("STEP-COUNT"), SubLObjectFactory.makeSymbol("TYPE"), SubLObjectFactory.makeSymbol("DATA") });
        $list3 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SUID"), SubLObjectFactory.makeKeyword("INFERENCE"), SubLObjectFactory.makeKeyword("RESULT-UNIQUENESS-CRITERION"), SubLObjectFactory.makeKeyword("ACTIVE-PROBLEMS"), SubLObjectFactory.makeKeyword("MOTIVATED-PROBLEMS"), SubLObjectFactory.makeKeyword("SET-ASIDE-PROBLEMS"), SubLObjectFactory.makeKeyword("SHOULD-RECONSIDER-SET-ASIDES?"), SubLObjectFactory.makeKeyword("PRODUCTIVITY-LIMIT"), SubLObjectFactory.makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), SubLObjectFactory.makeKeyword("PROOF-SPEC"), SubLObjectFactory.makeKeyword("PROBLEM-PROOF-SPEC-INDEX"), SubLObjectFactory.makeKeyword("PROBLEM-STRATEGIC-INDEX"), SubLObjectFactory.makeKeyword("MEMOIZATION-STATE"), SubLObjectFactory.makeKeyword("STEP-COUNT"), SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("DATA") });
        $list4 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("STRAT-SUID"), SubLObjectFactory.makeSymbol("STRAT-INFERENCE"), SubLObjectFactory.makeSymbol("STRAT-RESULT-UNIQUENESS-CRITERION"), SubLObjectFactory.makeSymbol("STRAT-ACTIVE-PROBLEMS"), SubLObjectFactory.makeSymbol("STRAT-MOTIVATED-PROBLEMS"), SubLObjectFactory.makeSymbol("STRAT-SET-ASIDE-PROBLEMS"), SubLObjectFactory.makeSymbol("STRAT-SHOULD-RECONSIDER-SET-ASIDES?"), SubLObjectFactory.makeSymbol("STRAT-PRODUCTIVITY-LIMIT"), SubLObjectFactory.makeSymbol("STRAT-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), SubLObjectFactory.makeSymbol("STRAT-PROOF-SPEC"), SubLObjectFactory.makeSymbol("STRAT-PROBLEM-PROOF-SPEC-INDEX"), SubLObjectFactory.makeSymbol("STRAT-PROBLEM-STRATEGIC-INDEX"), SubLObjectFactory.makeSymbol("STRAT-MEMOIZATION-STATE"), SubLObjectFactory.makeSymbol("STRAT-STEP-COUNT"), SubLObjectFactory.makeSymbol("STRAT-TYPE"), SubLObjectFactory.makeSymbol("STRAT-DATA") });
        $list5 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-STRAT-SUID"), SubLObjectFactory.makeSymbol("_CSETF-STRAT-INFERENCE"), SubLObjectFactory.makeSymbol("_CSETF-STRAT-RESULT-UNIQUENESS-CRITERION"), SubLObjectFactory.makeSymbol("_CSETF-STRAT-ACTIVE-PROBLEMS"), SubLObjectFactory.makeSymbol("_CSETF-STRAT-MOTIVATED-PROBLEMS"), SubLObjectFactory.makeSymbol("_CSETF-STRAT-SET-ASIDE-PROBLEMS"), SubLObjectFactory.makeSymbol("_CSETF-STRAT-SHOULD-RECONSIDER-SET-ASIDES?"), SubLObjectFactory.makeSymbol("_CSETF-STRAT-PRODUCTIVITY-LIMIT"), SubLObjectFactory.makeSymbol("_CSETF-STRAT-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), SubLObjectFactory.makeSymbol("_CSETF-STRAT-PROOF-SPEC"), SubLObjectFactory.makeSymbol("_CSETF-STRAT-PROBLEM-PROOF-SPEC-INDEX"), SubLObjectFactory.makeSymbol("_CSETF-STRAT-PROBLEM-STRATEGIC-INDEX"), SubLObjectFactory.makeSymbol("_CSETF-STRAT-MEMOIZATION-STATE"), SubLObjectFactory.makeSymbol("_CSETF-STRAT-STEP-COUNT"), SubLObjectFactory.makeSymbol("_CSETF-STRAT-TYPE"), SubLObjectFactory.makeSymbol("_CSETF-STRAT-DATA") });
        $sym6$PRINT_STRATEGY = SubLObjectFactory.makeSymbol("PRINT-STRATEGY");
        $sym7$STRATEGY_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("STRATEGY-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("STRATEGY-P"));
        $sym9$STRAT_SUID = SubLObjectFactory.makeSymbol("STRAT-SUID");
        $sym10$_CSETF_STRAT_SUID = SubLObjectFactory.makeSymbol("_CSETF-STRAT-SUID");
        $sym11$STRAT_INFERENCE = SubLObjectFactory.makeSymbol("STRAT-INFERENCE");
        $sym12$_CSETF_STRAT_INFERENCE = SubLObjectFactory.makeSymbol("_CSETF-STRAT-INFERENCE");
        $sym13$STRAT_RESULT_UNIQUENESS_CRITERION = SubLObjectFactory.makeSymbol("STRAT-RESULT-UNIQUENESS-CRITERION");
        $sym14$_CSETF_STRAT_RESULT_UNIQUENESS_CRITERION = SubLObjectFactory.makeSymbol("_CSETF-STRAT-RESULT-UNIQUENESS-CRITERION");
        $sym15$STRAT_ACTIVE_PROBLEMS = SubLObjectFactory.makeSymbol("STRAT-ACTIVE-PROBLEMS");
        $sym16$_CSETF_STRAT_ACTIVE_PROBLEMS = SubLObjectFactory.makeSymbol("_CSETF-STRAT-ACTIVE-PROBLEMS");
        $sym17$STRAT_MOTIVATED_PROBLEMS = SubLObjectFactory.makeSymbol("STRAT-MOTIVATED-PROBLEMS");
        $sym18$_CSETF_STRAT_MOTIVATED_PROBLEMS = SubLObjectFactory.makeSymbol("_CSETF-STRAT-MOTIVATED-PROBLEMS");
        $sym19$STRAT_SET_ASIDE_PROBLEMS = SubLObjectFactory.makeSymbol("STRAT-SET-ASIDE-PROBLEMS");
        $sym20$_CSETF_STRAT_SET_ASIDE_PROBLEMS = SubLObjectFactory.makeSymbol("_CSETF-STRAT-SET-ASIDE-PROBLEMS");
        $sym21$STRAT_SHOULD_RECONSIDER_SET_ASIDES_ = SubLObjectFactory.makeSymbol("STRAT-SHOULD-RECONSIDER-SET-ASIDES?");
        $sym22$_CSETF_STRAT_SHOULD_RECONSIDER_SET_ASIDES_ = SubLObjectFactory.makeSymbol("_CSETF-STRAT-SHOULD-RECONSIDER-SET-ASIDES?");
        $sym23$STRAT_PRODUCTIVITY_LIMIT = SubLObjectFactory.makeSymbol("STRAT-PRODUCTIVITY-LIMIT");
        $sym24$_CSETF_STRAT_PRODUCTIVITY_LIMIT = SubLObjectFactory.makeSymbol("_CSETF-STRAT-PRODUCTIVITY-LIMIT");
        $sym25$STRAT_REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT = SubLObjectFactory.makeSymbol("STRAT-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT");
        $sym26$_CSETF_STRAT_REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT = SubLObjectFactory.makeSymbol("_CSETF-STRAT-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT");
        $sym27$STRAT_PROOF_SPEC = SubLObjectFactory.makeSymbol("STRAT-PROOF-SPEC");
        $sym28$_CSETF_STRAT_PROOF_SPEC = SubLObjectFactory.makeSymbol("_CSETF-STRAT-PROOF-SPEC");
        $sym29$STRAT_PROBLEM_PROOF_SPEC_INDEX = SubLObjectFactory.makeSymbol("STRAT-PROBLEM-PROOF-SPEC-INDEX");
        $sym30$_CSETF_STRAT_PROBLEM_PROOF_SPEC_INDEX = SubLObjectFactory.makeSymbol("_CSETF-STRAT-PROBLEM-PROOF-SPEC-INDEX");
        $sym31$STRAT_PROBLEM_STRATEGIC_INDEX = SubLObjectFactory.makeSymbol("STRAT-PROBLEM-STRATEGIC-INDEX");
        $sym32$_CSETF_STRAT_PROBLEM_STRATEGIC_INDEX = SubLObjectFactory.makeSymbol("_CSETF-STRAT-PROBLEM-STRATEGIC-INDEX");
        $sym33$STRAT_MEMOIZATION_STATE = SubLObjectFactory.makeSymbol("STRAT-MEMOIZATION-STATE");
        $sym34$_CSETF_STRAT_MEMOIZATION_STATE = SubLObjectFactory.makeSymbol("_CSETF-STRAT-MEMOIZATION-STATE");
        $sym35$STRAT_STEP_COUNT = SubLObjectFactory.makeSymbol("STRAT-STEP-COUNT");
        $sym36$_CSETF_STRAT_STEP_COUNT = SubLObjectFactory.makeSymbol("_CSETF-STRAT-STEP-COUNT");
        $sym37$STRAT_TYPE = SubLObjectFactory.makeSymbol("STRAT-TYPE");
        $sym38$_CSETF_STRAT_TYPE = SubLObjectFactory.makeSymbol("_CSETF-STRAT-TYPE");
        $sym39$STRAT_DATA = SubLObjectFactory.makeSymbol("STRAT-DATA");
        $sym40$_CSETF_STRAT_DATA = SubLObjectFactory.makeSymbol("_CSETF-STRAT-DATA");
        $kw41$SUID = SubLObjectFactory.makeKeyword("SUID");
        $kw42$INFERENCE = SubLObjectFactory.makeKeyword("INFERENCE");
        $kw43$RESULT_UNIQUENESS_CRITERION = SubLObjectFactory.makeKeyword("RESULT-UNIQUENESS-CRITERION");
        $kw44$ACTIVE_PROBLEMS = SubLObjectFactory.makeKeyword("ACTIVE-PROBLEMS");
        $kw45$MOTIVATED_PROBLEMS = SubLObjectFactory.makeKeyword("MOTIVATED-PROBLEMS");
        $kw46$SET_ASIDE_PROBLEMS = SubLObjectFactory.makeKeyword("SET-ASIDE-PROBLEMS");
        $kw47$SHOULD_RECONSIDER_SET_ASIDES_ = SubLObjectFactory.makeKeyword("SHOULD-RECONSIDER-SET-ASIDES?");
        $kw48$PRODUCTIVITY_LIMIT = SubLObjectFactory.makeKeyword("PRODUCTIVITY-LIMIT");
        $kw49$REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT = SubLObjectFactory.makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT");
        $kw50$PROOF_SPEC = SubLObjectFactory.makeKeyword("PROOF-SPEC");
        $kw51$PROBLEM_PROOF_SPEC_INDEX = SubLObjectFactory.makeKeyword("PROBLEM-PROOF-SPEC-INDEX");
        $kw52$PROBLEM_STRATEGIC_INDEX = SubLObjectFactory.makeKeyword("PROBLEM-STRATEGIC-INDEX");
        $kw53$MEMOIZATION_STATE = SubLObjectFactory.makeKeyword("MEMOIZATION-STATE");
        $kw54$STEP_COUNT = SubLObjectFactory.makeKeyword("STEP-COUNT");
        $kw55$TYPE = SubLObjectFactory.makeKeyword("TYPE");
        $kw56$DATA = SubLObjectFactory.makeKeyword("DATA");
        $str57$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw58$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym59$MAKE_STRATEGY = SubLObjectFactory.makeSymbol("MAKE-STRATEGY");
        $kw60$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw61$END = SubLObjectFactory.makeKeyword("END");
        $sym62$VISIT_DEFSTRUCT_OBJECT_STRATEGY_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-STRATEGY-METHOD");
        $kw63$FREE = SubLObjectFactory.makeKeyword("FREE");
        $str64$_Invalid_STRATEGY__s_ = SubLObjectFactory.makeString("<Invalid STRATEGY ~s>");
        $str65$__a_STRATEGY__a__a_for_inference_ = SubLObjectFactory.makeString("<~a STRATEGY ~a.~a for inference ~a.~a>");
        $sym66$SXHASH_STRATEGY_METHOD = SubLObjectFactory.makeSymbol("SXHASH-STRATEGY-METHOD");
        $sym67$STRATEGY_TYPE_P = SubLObjectFactory.makeSymbol("STRATEGY-TYPE-P");
        $sym68$INFERENCE_P = SubLObjectFactory.makeSymbol("INFERENCE-P");
        $str69$strategy_memoization_state = SubLObjectFactory.makeString("strategy memoization state");
        $kw70$CONSTRUCTOR = SubLObjectFactory.makeKeyword("CONSTRUCTOR");
        $sym71$STRATEGY_ACTIVE_PROBLEMS = SubLObjectFactory.makeSymbol("STRATEGY-ACTIVE-PROBLEMS");
        $sym72$DO_STRATEGY_ACTIVE_PROBLEMS = SubLObjectFactory.makeSymbol("DO-STRATEGY-ACTIVE-PROBLEMS");
        $sym73$STRATEGY_MOTIVATED_PROBLEMS = SubLObjectFactory.makeSymbol("STRATEGY-MOTIVATED-PROBLEMS");
        $sym74$DO_STRATEGY_MOTIVATED_PROBLEMS = SubLObjectFactory.makeSymbol("DO-STRATEGY-MOTIVATED-PROBLEMS");
        $sym75$STRATEGY_SET_ASIDE_PROBLEMS = SubLObjectFactory.makeSymbol("STRATEGY-SET-ASIDE-PROBLEMS");
        $sym76$DO_STRATEGY_SET_ASIDE_PROBLEMS = SubLObjectFactory.makeSymbol("DO-STRATEGY-SET-ASIDE-PROBLEMS");
        $sym77$RESULT_UNIQUENESS_CRITERION_P = SubLObjectFactory.makeSymbol("RESULT-UNIQUENESS-CRITERION-P");
        $sym78$PRODUCTIVITY_P = SubLObjectFactory.makeSymbol("PRODUCTIVITY-P");
        $sym79$PROOF_SPEC_P = SubLObjectFactory.makeSymbol("PROOF-SPEC-P");
        $list80 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROBLEM-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("STRATEGY"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list81 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw82$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw83$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym84$DO_SET = SubLObjectFactory.makeSymbol("DO-SET");
        $sym85$DO_SET_CONTENTS = SubLObjectFactory.makeSymbol("DO-SET-CONTENTS");
        $list86 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRATEGY"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym87$STRATEGY_VAR = SubLObjectFactory.makeUninternedSymbol("STRATEGY-VAR");
        $sym88$STATE_VAR = SubLObjectFactory.makeUninternedSymbol("STATE-VAR");
        $sym89$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym90$STRATEGY_MEMOIZATION_STATE = SubLObjectFactory.makeSymbol("STRATEGY-MEMOIZATION-STATE");
        $sym91$_CURRENT_STRATEGY_WRT_MEMOIZATION_ = SubLObjectFactory.makeSymbol("*CURRENT-STRATEGY-WRT-MEMOIZATION*");
        $sym92$WITH_MEMOIZATION_STATE = SubLObjectFactory.makeSymbol("WITH-MEMOIZATION-STATE");
        $sym93$WITH_STRATEGY_MEMOIZATION_STATE = SubLObjectFactory.makeSymbol("WITH-STRATEGY-MEMOIZATION-STATE");
        $sym94$CURRENT_STRATEGY_WRT_MEMOIZATION = SubLObjectFactory.makeSymbol("CURRENT-STRATEGY-WRT-MEMOIZATION");
        $sym95$VALID_PROBLEM_P = SubLObjectFactory.makeSymbol("VALID-PROBLEM-P");
        $kw96$PROOF = SubLObjectFactory.makeKeyword("PROOF");
        $kw97$BINDINGS = SubLObjectFactory.makeKeyword("BINDINGS");
        $sym98$PROBLEM_P = SubLObjectFactory.makeSymbol("PROBLEM-P");
        $kw99$ANYTHING = SubLObjectFactory.makeKeyword("ANYTHING");
        $sym100$STRATEGY_PROPERTY_P = SubLObjectFactory.makeSymbol("STRATEGY-PROPERTY-P");
        $str101$Unexpected_strategy_property__s_w = SubLObjectFactory.makeString("Unexpected strategy property ~s with value ~s");
        $sym102$STRATEGY_PROPERTIES_P = SubLObjectFactory.makeSymbol("STRATEGY-PROPERTIES-P");
        $kw103$SUBSTRATEGY_STRATEGEM_MOTIVATED = SubLObjectFactory.makeKeyword("SUBSTRATEGY-STRATEGEM-MOTIVATED");
        $list104 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRATEGY"), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEM")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym105$STRATEGY_VAR = SubLObjectFactory.makeUninternedSymbol("STRATEGY-VAR");
        $sym106$PROBLEM_VAR = SubLObjectFactory.makeUninternedSymbol("PROBLEM-VAR");
        $sym107$STRATEGY_NOTE_PROBLEM_ACTIVE = SubLObjectFactory.makeSymbol("STRATEGY-NOTE-PROBLEM-ACTIVE");
        $sym108$STRATEGY_NOTE_PROBLEM_INACTIVE = SubLObjectFactory.makeSymbol("STRATEGY-NOTE-PROBLEM-INACTIVE");
        $sym109$POSSIBLY_REACTIVATE_PROBLEM = SubLObjectFactory.makeSymbol("POSSIBLY-REACTIVATE-PROBLEM");
        $kw110$NOTHING = SubLObjectFactory.makeKeyword("NOTHING");
        $str111$balancing_tactician_does_not_impl = SubLObjectFactory.makeString("balancing tactician does not implement ~a");
        $str112$Unexpected_strategy_type__a = SubLObjectFactory.makeString("Unexpected strategy type ~a");
        $sym113$_STRATEGY_TYPE_STORE_ = SubLObjectFactory.makeSymbol("*STRATEGY-TYPE-STORE*");
        $sym114$PROPERTY_LIST_P = SubLObjectFactory.makeSymbol("PROPERTY-LIST-P");
        $sym115$STRATEGY_TYPE_PROPERTY_P = SubLObjectFactory.makeSymbol("STRATEGY-TYPE-PROPERTY-P");
        $kw116$RECOMPUTE = SubLObjectFactory.makeKeyword("RECOMPUTE");
        $sym117$PROBLEM_STRATEGIC_PROPERTIES = SubLObjectFactory.makeSymbol("PROBLEM-STRATEGIC-PROPERTIES");
        $sym118$PROBLEM_STRATEGIC_PROPERTIES_P = SubLObjectFactory.makeSymbol("PROBLEM-STRATEGIC-PROPERTIES-P");
        $list119 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STATUS"), (SubLObject)SubLObjectFactory.makeSymbol("TACTIC-STRATEGIC-PROPERTY-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("POSSIBLE-TACTIC-COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("UNINTERESTINGNESS"));
        $list120 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("STATUS"), (SubLObject)SubLObjectFactory.makeKeyword("TACTIC-STRATEGIC-PROPERTY-INDEX"), (SubLObject)SubLObjectFactory.makeKeyword("POSSIBLE-TACTIC-COUNT"), (SubLObject)SubLObjectFactory.makeKeyword("UNINTERESTINGNESS"));
        $list121 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROB-STRATEGIC-PROPERTIES-STATUS"), (SubLObject)SubLObjectFactory.makeSymbol("PROB-STRATEGIC-PROPERTIES-TACTIC-STRATEGIC-PROPERTY-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("PROB-STRATEGIC-PROPERTIES-POSSIBLE-TACTIC-COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("PROB-STRATEGIC-PROPERTIES-UNINTERESTINGNESS"));
        $list122 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PROB-STRATEGIC-PROPERTIES-STATUS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PROB-STRATEGIC-PROPERTIES-TACTIC-STRATEGIC-PROPERTY-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PROB-STRATEGIC-PROPERTIES-POSSIBLE-TACTIC-COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PROB-STRATEGIC-PROPERTIES-UNINTERESTINGNESS"));
        $sym123$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym124$PROBLEM_STRATEGIC_PROPERTIES_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("PROBLEM-STRATEGIC-PROPERTIES-PRINT-FUNCTION-TRAMPOLINE");
        $list125 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEM-STRATEGIC-PROPERTIES-P"));
        $sym126$PROB_STRATEGIC_PROPERTIES_STATUS = SubLObjectFactory.makeSymbol("PROB-STRATEGIC-PROPERTIES-STATUS");
        $sym127$_CSETF_PROB_STRATEGIC_PROPERTIES_STATUS = SubLObjectFactory.makeSymbol("_CSETF-PROB-STRATEGIC-PROPERTIES-STATUS");
        $sym128$PROB_STRATEGIC_PROPERTIES_TACTIC_STRATEGIC_PROPERTY_INDEX = SubLObjectFactory.makeSymbol("PROB-STRATEGIC-PROPERTIES-TACTIC-STRATEGIC-PROPERTY-INDEX");
        $sym129$_CSETF_PROB_STRATEGIC_PROPERTIES_TACTIC_STRATEGIC_PROPERTY_INDEX = SubLObjectFactory.makeSymbol("_CSETF-PROB-STRATEGIC-PROPERTIES-TACTIC-STRATEGIC-PROPERTY-INDEX");
        $sym130$PROB_STRATEGIC_PROPERTIES_POSSIBLE_TACTIC_COUNT = SubLObjectFactory.makeSymbol("PROB-STRATEGIC-PROPERTIES-POSSIBLE-TACTIC-COUNT");
        $sym131$_CSETF_PROB_STRATEGIC_PROPERTIES_POSSIBLE_TACTIC_COUNT = SubLObjectFactory.makeSymbol("_CSETF-PROB-STRATEGIC-PROPERTIES-POSSIBLE-TACTIC-COUNT");
        $sym132$PROB_STRATEGIC_PROPERTIES_UNINTERESTINGNESS = SubLObjectFactory.makeSymbol("PROB-STRATEGIC-PROPERTIES-UNINTERESTINGNESS");
        $sym133$_CSETF_PROB_STRATEGIC_PROPERTIES_UNINTERESTINGNESS = SubLObjectFactory.makeSymbol("_CSETF-PROB-STRATEGIC-PROPERTIES-UNINTERESTINGNESS");
        $kw134$STATUS = SubLObjectFactory.makeKeyword("STATUS");
        $kw135$TACTIC_STRATEGIC_PROPERTY_INDEX = SubLObjectFactory.makeKeyword("TACTIC-STRATEGIC-PROPERTY-INDEX");
        $kw136$POSSIBLE_TACTIC_COUNT = SubLObjectFactory.makeKeyword("POSSIBLE-TACTIC-COUNT");
        $kw137$UNINTERESTINGNESS = SubLObjectFactory.makeKeyword("UNINTERESTINGNESS");
        $sym138$MAKE_PROBLEM_STRATEGIC_PROPERTIES = SubLObjectFactory.makeSymbol("MAKE-PROBLEM-STRATEGIC-PROPERTIES");
        $sym139$VISIT_DEFSTRUCT_OBJECT_PROBLEM_STRATEGIC_PROPERTIES_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-PROBLEM-STRATEGIC-PROPERTIES-METHOD");
        $kw140$NEW = SubLObjectFactory.makeKeyword("NEW");
        $kw141$UNEXAMINED = SubLObjectFactory.makeKeyword("UNEXAMINED");
        $kw142$FINISHED = SubLObjectFactory.makeKeyword("FINISHED");
        $kw143$NEUTRAL = SubLObjectFactory.makeKeyword("NEUTRAL");
        $kw144$NO_GOOD = SubLObjectFactory.makeKeyword("NO-GOOD");
        $sym145$STRATEGIC_CONTEXT_P = SubLObjectFactory.makeSymbol("STRATEGIC-CONTEXT-P");
        $str146$poking_good_status__s_into_proble = SubLObjectFactory.makeString("poking good status ~s into problem ~s wrt strategy ~s");
        $kw147$POSSIBLE_NO_GOOD = SubLObjectFactory.makeKeyword("POSSIBLE-NO-GOOD");
        $str148$_possible_no_good__s_wrt__s = SubLObjectFactory.makeString(":possible-no-good ~s wrt ~s");
        $kw149$EXAMINED = SubLObjectFactory.makeKeyword("EXAMINED");
        $kw150$POSSIBLE = SubLObjectFactory.makeKeyword("POSSIBLE");
        $kw151$PENDING = SubLObjectFactory.makeKeyword("PENDING");
        $sym152$UNINTERESTINGNESS_CACHE_VALUE_P = SubLObjectFactory.makeSymbol("UNINTERESTINGNESS-CACHE-VALUE-P");
        $kw153$ALL = SubLObjectFactory.makeKeyword("ALL");
        $sym154$TACTIC_STRATEGIC_PROPERTIES = SubLObjectFactory.makeSymbol("TACTIC-STRATEGIC-PROPERTIES");
        $sym155$TACTIC_STRATEGIC_PROPERTIES_P = SubLObjectFactory.makeSymbol("TACTIC-STRATEGIC-PROPERTIES-P");
        $list156 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeSymbol("PREFERENCE-LEVEL-JUSTIFICATION"), (SubLObject)SubLObjectFactory.makeSymbol("PRODUCTIVITY"), (SubLObject)SubLObjectFactory.makeSymbol("UNINTERESTINGNESS"));
        $list157 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL-JUSTIFICATION"), (SubLObject)SubLObjectFactory.makeKeyword("PRODUCTIVITY"), (SubLObject)SubLObjectFactory.makeKeyword("UNINTERESTINGNESS"));
        $list158 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeSymbol("TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL-JUSTIFICATION"), (SubLObject)SubLObjectFactory.makeSymbol("TACT-STRATEGIC-PROPERTIES-PRODUCTIVITY"), (SubLObject)SubLObjectFactory.makeSymbol("TACT-STRATEGIC-PROPERTIES-UNINTERESTINGNESS"));
        $list159 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL-JUSTIFICATION"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TACT-STRATEGIC-PROPERTIES-PRODUCTIVITY"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TACT-STRATEGIC-PROPERTIES-UNINTERESTINGNESS"));
        $sym160$TACTIC_STRATEGIC_PROPERTIES_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("TACTIC-STRATEGIC-PROPERTIES-PRINT-FUNCTION-TRAMPOLINE");
        $list161 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("TACTIC-STRATEGIC-PROPERTIES-P"));
        $sym162$TACT_STRATEGIC_PROPERTIES_PREFERENCE_LEVEL = SubLObjectFactory.makeSymbol("TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL");
        $sym163$_CSETF_TACT_STRATEGIC_PROPERTIES_PREFERENCE_LEVEL = SubLObjectFactory.makeSymbol("_CSETF-TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL");
        $sym164$TACT_STRATEGIC_PROPERTIES_PREFERENCE_LEVEL_JUSTIFICATION = SubLObjectFactory.makeSymbol("TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL-JUSTIFICATION");
        $sym165$_CSETF_TACT_STRATEGIC_PROPERTIES_PREFERENCE_LEVEL_JUSTIFICATION = SubLObjectFactory.makeSymbol("_CSETF-TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL-JUSTIFICATION");
        $sym166$TACT_STRATEGIC_PROPERTIES_PRODUCTIVITY = SubLObjectFactory.makeSymbol("TACT-STRATEGIC-PROPERTIES-PRODUCTIVITY");
        $sym167$_CSETF_TACT_STRATEGIC_PROPERTIES_PRODUCTIVITY = SubLObjectFactory.makeSymbol("_CSETF-TACT-STRATEGIC-PROPERTIES-PRODUCTIVITY");
        $sym168$TACT_STRATEGIC_PROPERTIES_UNINTERESTINGNESS = SubLObjectFactory.makeSymbol("TACT-STRATEGIC-PROPERTIES-UNINTERESTINGNESS");
        $sym169$_CSETF_TACT_STRATEGIC_PROPERTIES_UNINTERESTINGNESS = SubLObjectFactory.makeSymbol("_CSETF-TACT-STRATEGIC-PROPERTIES-UNINTERESTINGNESS");
        $kw170$PREFERENCE_LEVEL = SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL");
        $kw171$PREFERENCE_LEVEL_JUSTIFICATION = SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL-JUSTIFICATION");
        $kw172$PRODUCTIVITY = SubLObjectFactory.makeKeyword("PRODUCTIVITY");
        $sym173$MAKE_TACTIC_STRATEGIC_PROPERTIES = SubLObjectFactory.makeSymbol("MAKE-TACTIC-STRATEGIC-PROPERTIES");
        $sym174$VISIT_DEFSTRUCT_OBJECT_TACTIC_STRATEGIC_PROPERTIES_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-TACTIC-STRATEGIC-PROPERTIES-METHOD");
        $str175$ = SubLObjectFactory.makeString("");
        $sym176$TACTIC_P = SubLObjectFactory.makeSymbol("TACTIC-P");
        $kw177$TACTICAL = SubLObjectFactory.makeKeyword("TACTICAL");
        $str178$structural_tactic__s_cannot_have_ = SubLObjectFactory.makeString("structural tactic ~s cannot have a completeness");
        $str179$content_tactic__s_cannot_have_a_p = SubLObjectFactory.makeString("content tactic ~s cannot have a preference level");
        $str180$content_tactic__s_cannot_have_a_p = SubLObjectFactory.makeString("content tactic ~s cannot have a preference level justification");
        $sym181$GENERALIZED_CONJUNCTIVE_TACTIC_P = SubLObjectFactory.makeSymbol("GENERALIZED-CONJUNCTIVE-TACTIC-P");
        $kw182$PREFERRED = SubLObjectFactory.makeKeyword("PREFERRED");
        $sym183$PREFERENCE_LEVEL_P = SubLObjectFactory.makeSymbol("PREFERENCE-LEVEL-P");
        $sym184$UNINTERESTINGNESS_CACHE_CONDITIONS_P = SubLObjectFactory.makeSymbol("UNINTERESTINGNESS-CACHE-CONDITIONS-P");
        $sym185$BOOLEANP = SubLObjectFactory.makeSymbol("BOOLEANP");
        $kw186$SKIP = SubLObjectFactory.makeKeyword("SKIP");
    }
    
    public static final class $strategy_native extends SubLStructNative
    {
        public SubLObject $suid;
        public SubLObject $inference;
        public SubLObject $result_uniqueness_criterion;
        public SubLObject $active_problems;
        public SubLObject $motivated_problems;
        public SubLObject $set_aside_problems;
        public SubLObject $should_reconsider_set_asidesP;
        public SubLObject $productivity_limit;
        public SubLObject $removal_backtracking_productivity_limit;
        public SubLObject $proof_spec;
        public SubLObject $problem_proof_spec_index;
        public SubLObject $problem_strategic_index;
        public SubLObject $memoization_state;
        public SubLObject $step_count;
        public SubLObject $type;
        public SubLObject $data;
        private static final SubLStructDeclNative structDecl;
        
        public $strategy_native() {
            this.$suid = (SubLObject)CommonSymbols.NIL;
            this.$inference = (SubLObject)CommonSymbols.NIL;
            this.$result_uniqueness_criterion = (SubLObject)CommonSymbols.NIL;
            this.$active_problems = (SubLObject)CommonSymbols.NIL;
            this.$motivated_problems = (SubLObject)CommonSymbols.NIL;
            this.$set_aside_problems = (SubLObject)CommonSymbols.NIL;
            this.$should_reconsider_set_asidesP = (SubLObject)CommonSymbols.NIL;
            this.$productivity_limit = (SubLObject)CommonSymbols.NIL;
            this.$removal_backtracking_productivity_limit = (SubLObject)CommonSymbols.NIL;
            this.$proof_spec = (SubLObject)CommonSymbols.NIL;
            this.$problem_proof_spec_index = (SubLObject)CommonSymbols.NIL;
            this.$problem_strategic_index = (SubLObject)CommonSymbols.NIL;
            this.$memoization_state = (SubLObject)CommonSymbols.NIL;
            this.$step_count = (SubLObject)CommonSymbols.NIL;
            this.$type = (SubLObject)CommonSymbols.NIL;
            this.$data = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$strategy_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$suid;
        }
        
        public SubLObject getField3() {
            return this.$inference;
        }
        
        public SubLObject getField4() {
            return this.$result_uniqueness_criterion;
        }
        
        public SubLObject getField5() {
            return this.$active_problems;
        }
        
        public SubLObject getField6() {
            return this.$motivated_problems;
        }
        
        public SubLObject getField7() {
            return this.$set_aside_problems;
        }
        
        public SubLObject getField8() {
            return this.$should_reconsider_set_asidesP;
        }
        
        public SubLObject getField9() {
            return this.$productivity_limit;
        }
        
        public SubLObject getField10() {
            return this.$removal_backtracking_productivity_limit;
        }
        
        public SubLObject getField11() {
            return this.$proof_spec;
        }
        
        public SubLObject getField12() {
            return this.$problem_proof_spec_index;
        }
        
        public SubLObject getField13() {
            return this.$problem_strategic_index;
        }
        
        public SubLObject getField14() {
            return this.$memoization_state;
        }
        
        public SubLObject getField15() {
            return this.$step_count;
        }
        
        public SubLObject getField16() {
            return this.$type;
        }
        
        public SubLObject getField17() {
            return this.$data;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$suid = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$inference = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$result_uniqueness_criterion = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$active_problems = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$motivated_problems = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$set_aside_problems = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$should_reconsider_set_asidesP = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$productivity_limit = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$removal_backtracking_productivity_limit = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$proof_spec = value;
        }
        
        public SubLObject setField12(final SubLObject value) {
            return this.$problem_proof_spec_index = value;
        }
        
        public SubLObject setField13(final SubLObject value) {
            return this.$problem_strategic_index = value;
        }
        
        public SubLObject setField14(final SubLObject value) {
            return this.$memoization_state = value;
        }
        
        public SubLObject setField15(final SubLObject value) {
            return this.$step_count = value;
        }
        
        public SubLObject setField16(final SubLObject value) {
            return this.$type = value;
        }
        
        public SubLObject setField17(final SubLObject value) {
            return this.$data = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$strategy_native.class, inference_datastructures_strategy.$sym0$STRATEGY, inference_datastructures_strategy.$sym1$STRATEGY_P, inference_datastructures_strategy.$list2, inference_datastructures_strategy.$list3, new String[] { "$suid", "$inference", "$result_uniqueness_criterion", "$active_problems", "$motivated_problems", "$set_aside_problems", "$should_reconsider_set_asidesP", "$productivity_limit", "$removal_backtracking_productivity_limit", "$proof_spec", "$problem_proof_spec_index", "$problem_strategic_index", "$memoization_state", "$step_count", "$type", "$data" }, inference_datastructures_strategy.$list4, inference_datastructures_strategy.$list5, inference_datastructures_strategy.$sym6$PRINT_STRATEGY);
        }
    }
    
    public static final class $strategy_p$UnaryFunction extends UnaryFunction
    {
        public $strategy_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("STRATEGY-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return inference_datastructures_strategy.strategy_p(arg1);
        }
    }
    
    public static final class $sxhash_strategy_method$UnaryFunction extends UnaryFunction
    {
        public $sxhash_strategy_method$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SXHASH-STRATEGY-METHOD"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return inference_datastructures_strategy.sxhash_strategy_method(arg1);
        }
    }
    
    public static final class $problem_strategic_properties_native extends SubLStructNative
    {
        public SubLObject $status;
        public SubLObject $tactic_strategic_property_index;
        public SubLObject $possible_tactic_count;
        public SubLObject $uninterestingness;
        private static final SubLStructDeclNative structDecl;
        
        public $problem_strategic_properties_native() {
            this.$status = (SubLObject)CommonSymbols.NIL;
            this.$tactic_strategic_property_index = (SubLObject)CommonSymbols.NIL;
            this.$possible_tactic_count = (SubLObject)CommonSymbols.NIL;
            this.$uninterestingness = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$problem_strategic_properties_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$status;
        }
        
        public SubLObject getField3() {
            return this.$tactic_strategic_property_index;
        }
        
        public SubLObject getField4() {
            return this.$possible_tactic_count;
        }
        
        public SubLObject getField5() {
            return this.$uninterestingness;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$status = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$tactic_strategic_property_index = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$possible_tactic_count = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$uninterestingness = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$problem_strategic_properties_native.class, inference_datastructures_strategy.$sym117$PROBLEM_STRATEGIC_PROPERTIES, inference_datastructures_strategy.$sym118$PROBLEM_STRATEGIC_PROPERTIES_P, inference_datastructures_strategy.$list119, inference_datastructures_strategy.$list120, new String[] { "$status", "$tactic_strategic_property_index", "$possible_tactic_count", "$uninterestingness" }, inference_datastructures_strategy.$list121, inference_datastructures_strategy.$list122, inference_datastructures_strategy.$sym123$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $problem_strategic_properties_p$UnaryFunction extends UnaryFunction
    {
        public $problem_strategic_properties_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PROBLEM-STRATEGIC-PROPERTIES-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return inference_datastructures_strategy.problem_strategic_properties_p(arg1);
        }
    }
    
    public static final class $tactic_strategic_properties_native extends SubLStructNative
    {
        public SubLObject $preference_level;
        public SubLObject $preference_level_justification;
        public SubLObject $productivity;
        public SubLObject $uninterestingness;
        private static final SubLStructDeclNative structDecl;
        
        public $tactic_strategic_properties_native() {
            this.$preference_level = (SubLObject)CommonSymbols.NIL;
            this.$preference_level_justification = (SubLObject)CommonSymbols.NIL;
            this.$productivity = (SubLObject)CommonSymbols.NIL;
            this.$uninterestingness = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$tactic_strategic_properties_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$preference_level;
        }
        
        public SubLObject getField3() {
            return this.$preference_level_justification;
        }
        
        public SubLObject getField4() {
            return this.$productivity;
        }
        
        public SubLObject getField5() {
            return this.$uninterestingness;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$preference_level = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$preference_level_justification = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$productivity = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$uninterestingness = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$tactic_strategic_properties_native.class, inference_datastructures_strategy.$sym154$TACTIC_STRATEGIC_PROPERTIES, inference_datastructures_strategy.$sym155$TACTIC_STRATEGIC_PROPERTIES_P, inference_datastructures_strategy.$list156, inference_datastructures_strategy.$list157, new String[] { "$preference_level", "$preference_level_justification", "$productivity", "$uninterestingness" }, inference_datastructures_strategy.$list158, inference_datastructures_strategy.$list159, inference_datastructures_strategy.$sym123$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $tactic_strategic_properties_p$UnaryFunction extends UnaryFunction
    {
        public $tactic_strategic_properties_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TACTIC-STRATEGIC-PROPERTIES-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return inference_datastructures_strategy.tactic_strategic_properties_p(arg1);
        }
    }
}

/*

	Total time: 824 ms
	
*/