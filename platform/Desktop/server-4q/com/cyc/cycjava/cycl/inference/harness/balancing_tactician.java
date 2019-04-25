package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.cycjava.cycl.backward;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.assertion_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class balancing_tactician extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.balancing_tactician";
    public static final String myFingerPrint = "c0814c0b2dbac93f18034e1301faa03e86f47885d2ab7c11b10d789f1257e929";
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 4248L)
    public static SubLSymbol $dtp_balancing_tactician_data$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 20246L)
    private static SubLSymbol $balancing_tactician_early_removal_productivity_limit$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 24847L)
    private static SubLSymbol $balancing_tactician_self_looping_rule_fix_enabledP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 25134L)
    public static SubLSymbol $balancing_tactician_new_roots_check_for_t_on_jo_linkP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 28083L)
    private static SubLSymbol $balancing_tactician_new_roots_triggered_by_t_on_jo_linkP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 35103L)
    private static SubLSymbol $balancing_tactician_is_tactically_hardcoreP$;
    private static final SubLSymbol $kw0$BALANCING;
    private static final SubLList $list1;
    private static final SubLSymbol $sym2$BALANCING_TACTICIAN_DATA;
    private static final SubLSymbol $sym3$BALANCING_TACTICIAN_DATA_P;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLList $list7;
    private static final SubLSymbol $sym8$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym9$BALANCING_TACTICIAN_DATA_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list10;
    private static final SubLSymbol $sym11$BAL_TAC_DATA_NEW_ROOT_SUBSTRATEGY;
    private static final SubLSymbol $sym12$_CSETF_BAL_TAC_DATA_NEW_ROOT_SUBSTRATEGY;
    private static final SubLSymbol $sym13$BAL_TAC_DATA_TRANSFORMATION_SUBSTRATEGY;
    private static final SubLSymbol $sym14$_CSETF_BAL_TAC_DATA_TRANSFORMATION_SUBSTRATEGY;
    private static final SubLSymbol $sym15$BAL_TAC_DATA_REMOVAL_SUBSTRATEGIES;
    private static final SubLSymbol $sym16$_CSETF_BAL_TAC_DATA_REMOVAL_SUBSTRATEGIES;
    private static final SubLSymbol $kw17$NEW_ROOT_SUBSTRATEGY;
    private static final SubLSymbol $kw18$TRANSFORMATION_SUBSTRATEGY;
    private static final SubLSymbol $kw19$REMOVAL_SUBSTRATEGIES;
    private static final SubLString $str20$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw21$BEGIN;
    private static final SubLSymbol $sym22$MAKE_BALANCING_TACTICIAN_DATA;
    private static final SubLSymbol $kw23$SLOT;
    private static final SubLSymbol $kw24$END;
    private static final SubLSymbol $sym25$VISIT_DEFSTRUCT_OBJECT_BALANCING_TACTICIAN_DATA_METHOD;
    private static final SubLList $list26;
    private static final SubLList $list27;
    private static final SubLList $list28;
    private static final SubLSymbol $kw29$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw30$DONE;
    private static final SubLSymbol $sym31$CSOME;
    private static final SubLSymbol $sym32$BALANCING_TACTICIAN_ALL_SUBSTRATEGIES;
    private static final SubLSymbol $sym33$DO_BALANCING_TACTICIAN_SUBSTRATEGIES;
    private static final SubLSymbol $sym34$PUNLESS;
    private static final SubLSymbol $sym35$BALANCING_TACTICIAN_SPINELESS_SUBSTRATEGY_P;
    private static final SubLSymbol $sym36$BALANCING_TACTICIAN_INITIALIZE;
    private static final SubLSymbol $kw37$NEW_ROOT;
    private static final SubLSymbol $kw38$TRANSFORMATION;
    private static final SubLSymbol $kw39$REMOVAL;
    private static final SubLSymbol $sym40$BALANCING_TACTICIAN_P;
    private static final SubLSymbol $sym41$BALANCING_TACTICIAN_DONE_;
    private static final SubLSymbol $kw42$UNINTERESTING;
    private static final SubLSymbol $sym43$BALANCING_TACTICIAN_DO_ONE_STEP;
    private static final SubLSymbol $kw44$RECONSIDER_SET_ASIDES;
    private static final SubLSymbol $kw45$PROPAGATE_ANSWER_LINK;
    private static final SubLSymbol $kw46$INTERESTING;
    private static final SubLSymbol $kw47$MOTIVATION;
    private static final SubLString $str48$_a_do_one_step___a__;
    private static final SubLSymbol $sym49$BALANCING_TACTICIAN_CONTINUATION_POSSIBLE_;
    private static final SubLSymbol $sym50$BALANCING_TACTICIAN_CHOOSES_TO_THROW_AWAY_PROBLEM_;
    private static final SubLSymbol $sym51$BALANCING_TACTICIAN_CHOOSES_TO_SET_ASIDE_PROBLEM_;
    private static final SubLSymbol $sym52$BALANCING_TACTICIAN_CHOOSES_TO_THROW_AWAY_TACTIC_;
    private static final SubLSymbol $sym53$BALANCING_TACTICIAN_CHOOSES_TO_SET_ASIDE_TACTIC_;
    private static final SubLSymbol $sym54$BALANCING_TACTICIAN_THROW_AWAY_UNINTERESTING_SET_ASIDES;
    private static final SubLSymbol $sym55$BALANCING_TACTICIAN_NOTE_INFERENCE_DYNAMIC_PROPERTIES_UPDATED;
    private static final SubLSymbol $sym56$BALANCING_TACTICIAN_INITIALIZE_PROPERTIES;
    private static final SubLSymbol $sym57$BALANCING_TACTICIAN_UPDATE_PROPERTIES;
    private static final SubLSymbol $sym58$BALANCING_TACTICIAN_INITIAL_RELEVANT_STRATEGIES;
    private static final SubLSymbol $sym59$BALANCING_TACTICIAN_POSSIBLY_ACTIVATE_PROBLEM;
    private static final SubLSymbol $kw60$RESTRICTION;
    private static final SubLSymbol $kw61$JOIN_ORDERED;
    private static final SubLSymbol $sym62$PROBLEM_LINK_P;
    private static final SubLSymbol $kw63$COMPLETE;
    private static final SubLSymbol $kw64$SIMPLIFICATION;
    private static final SubLSymbol $sym65$BALANCING_TACTICIAN_NOTE_ARGUMENT_LINK;
    private static final SubLSymbol $sym66$BALANCING_TACTICIAN_EARLY_REMOVAL_PRODUCTIVITY_LIMIT;
    private static final SubLSymbol $sym67$BALANCING_TACTICIAN_SUBSTRATEGY_STRATEGEM_MOTIVATED;
    private static final SubLSymbol $kw68$SPLIT;
    private static final SubLSymbol $kw69$UNION;
    private static final SubLSymbol $sym70$TRANSFORMATION_STRATEGY_P;
    private static final SubLSymbol $kw71$RESIDUAL_TRANSFORMATION;
    private static final SubLSymbol $sym72$CONNECTED_CONJUNCTION_TACTIC_P;
    private static final SubLSymbol $sym73$SPLIT_TACTIC_P;
    private static final SubLSymbol $sym74$REMOVAL_STRATEGY_P;
    private static final SubLSymbol $sym75$BALANCING_TACTICIAN_ALLOWS_SPLIT_TACTIC_TO_BE_SET_ASIDE_WRT_REMOV;
    private static final SubLSymbol $sym76$BALANCING_TACTICIAN_CHOOSES_TO_TOTALLY_THROW_AWAY_TACTIC_;
    private static final SubLSymbol $kw77$COMPLETE_REMOVAL_TACTIC_NO_GOOD;
    private static final SubLSymbol $sym78$BALANCING_TACTICIAN_SUBSTRATEGY_PROBLEM_STATUS_CHANGE;
    private static final SubLSymbol $kw79$FINISHED;
    private static final SubLSymbol $kw80$NO_GOOD;
    private static final SubLSymbol $kw81$GOOD;
    private static final SubLSymbol $kw82$NEUTRAL;
    private static final SubLSymbol $kw83$POSSIBLE;
    private static final SubLSymbol $kw84$PENDING;
    private static final SubLSymbol $kw85$TACTICAL;
    private static final SubLSymbol $kw86$CONNECTED_CONJUNCTION;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 4248L)
    public static SubLObject balancing_tactician_data_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)balancing_tactician.ZERO_INTEGER);
        return (SubLObject)balancing_tactician.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 4248L)
    public static SubLObject balancing_tactician_data_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $balancing_tactician_data_native.class) ? balancing_tactician.T : balancing_tactician.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 4248L)
    public static SubLObject bal_tac_data_new_root_substrategy(final SubLObject v_object) {
        assert balancing_tactician.NIL != balancing_tactician_data_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 4248L)
    public static SubLObject bal_tac_data_transformation_substrategy(final SubLObject v_object) {
        assert balancing_tactician.NIL != balancing_tactician_data_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 4248L)
    public static SubLObject bal_tac_data_removal_substrategies(final SubLObject v_object) {
        assert balancing_tactician.NIL != balancing_tactician_data_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 4248L)
    public static SubLObject _csetf_bal_tac_data_new_root_substrategy(final SubLObject v_object, final SubLObject value) {
        assert balancing_tactician.NIL != balancing_tactician_data_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 4248L)
    public static SubLObject _csetf_bal_tac_data_transformation_substrategy(final SubLObject v_object, final SubLObject value) {
        assert balancing_tactician.NIL != balancing_tactician_data_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 4248L)
    public static SubLObject _csetf_bal_tac_data_removal_substrategies(final SubLObject v_object, final SubLObject value) {
        assert balancing_tactician.NIL != balancing_tactician_data_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 4248L)
    public static SubLObject make_balancing_tactician_data(SubLObject arglist) {
        if (arglist == balancing_tactician.UNPROVIDED) {
            arglist = (SubLObject)balancing_tactician.NIL;
        }
        final SubLObject v_new = (SubLObject)new $balancing_tactician_data_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)balancing_tactician.NIL, next = arglist; balancing_tactician.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)balancing_tactician.$kw17$NEW_ROOT_SUBSTRATEGY)) {
                _csetf_bal_tac_data_new_root_substrategy(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)balancing_tactician.$kw18$TRANSFORMATION_SUBSTRATEGY)) {
                _csetf_bal_tac_data_transformation_substrategy(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)balancing_tactician.$kw19$REMOVAL_SUBSTRATEGIES)) {
                _csetf_bal_tac_data_removal_substrategies(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)balancing_tactician.$str20$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 4248L)
    public static SubLObject visit_defstruct_balancing_tactician_data(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)balancing_tactician.$kw21$BEGIN, (SubLObject)balancing_tactician.$sym22$MAKE_BALANCING_TACTICIAN_DATA, (SubLObject)balancing_tactician.THREE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)balancing_tactician.$kw23$SLOT, (SubLObject)balancing_tactician.$kw17$NEW_ROOT_SUBSTRATEGY, bal_tac_data_new_root_substrategy(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)balancing_tactician.$kw23$SLOT, (SubLObject)balancing_tactician.$kw18$TRANSFORMATION_SUBSTRATEGY, bal_tac_data_transformation_substrategy(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)balancing_tactician.$kw23$SLOT, (SubLObject)balancing_tactician.$kw19$REMOVAL_SUBSTRATEGIES, bal_tac_data_removal_substrategies(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)balancing_tactician.$kw24$END, (SubLObject)balancing_tactician.$sym22$MAKE_BALANCING_TACTICIAN_DATA, (SubLObject)balancing_tactician.THREE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 4248L)
    public static SubLObject visit_defstruct_object_balancing_tactician_data_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_balancing_tactician_data(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 4506L)
    public static SubLObject balancing_tactician_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(balancing_tactician.NIL != inference_datastructures_strategy.strategy_p(v_object) && balancing_tactician.NIL != list_utilities.member_eqP(inference_datastructures_strategy.strategy_type(v_object), (SubLObject)balancing_tactician.$list26));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 4753L)
    public static SubLObject do_balancing_tactician_substrategies(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)balancing_tactician.$list27);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject substrategy_var = (SubLObject)balancing_tactician.NIL;
        SubLObject strategy = (SubLObject)balancing_tactician.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)balancing_tactician.$list27);
        substrategy_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)balancing_tactician.$list27);
        strategy = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)balancing_tactician.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)balancing_tactician.NIL;
        SubLObject current_$1 = (SubLObject)balancing_tactician.NIL;
        while (balancing_tactician.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)balancing_tactician.$list27);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)balancing_tactician.$list27);
            if (balancing_tactician.NIL == conses_high.member(current_$1, (SubLObject)balancing_tactician.$list28, (SubLObject)balancing_tactician.UNPROVIDED, (SubLObject)balancing_tactician.UNPROVIDED)) {
                bad = (SubLObject)balancing_tactician.T;
            }
            if (current_$1 == balancing_tactician.$kw29$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (balancing_tactician.NIL != bad && balancing_tactician.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)balancing_tactician.$list27);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)balancing_tactician.$kw30$DONE, current);
        final SubLObject done = (SubLObject)((balancing_tactician.NIL != done_tail) ? conses_high.cadr(done_tail) : balancing_tactician.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)balancing_tactician.$sym31$CSOME, (SubLObject)ConsesLow.list(substrategy_var, (SubLObject)ConsesLow.list((SubLObject)balancing_tactician.$sym32$BALANCING_TACTICIAN_ALL_SUBSTRATEGIES, strategy), done), ConsesLow.append(body, (SubLObject)balancing_tactician.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 4975L)
    public static SubLObject do_balancing_tactician_spineful_substrategies(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)balancing_tactician.$list27);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject substrategy_var = (SubLObject)balancing_tactician.NIL;
        SubLObject strategy = (SubLObject)balancing_tactician.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)balancing_tactician.$list27);
        substrategy_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)balancing_tactician.$list27);
        strategy = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)balancing_tactician.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)balancing_tactician.NIL;
        SubLObject current_$2 = (SubLObject)balancing_tactician.NIL;
        while (balancing_tactician.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)balancing_tactician.$list27);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)balancing_tactician.$list27);
            if (balancing_tactician.NIL == conses_high.member(current_$2, (SubLObject)balancing_tactician.$list28, (SubLObject)balancing_tactician.UNPROVIDED, (SubLObject)balancing_tactician.UNPROVIDED)) {
                bad = (SubLObject)balancing_tactician.T;
            }
            if (current_$2 == balancing_tactician.$kw29$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (balancing_tactician.NIL != bad && balancing_tactician.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)balancing_tactician.$list27);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)balancing_tactician.$kw30$DONE, current);
        final SubLObject done = (SubLObject)((balancing_tactician.NIL != done_tail) ? conses_high.cadr(done_tail) : balancing_tactician.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)balancing_tactician.$sym33$DO_BALANCING_TACTICIAN_SUBSTRATEGIES, (SubLObject)ConsesLow.list(substrategy_var, strategy, (SubLObject)balancing_tactician.$kw30$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)balancing_tactician.$sym34$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)balancing_tactician.$sym35$BALANCING_TACTICIAN_SPINELESS_SUBSTRATEGY_P, substrategy_var), ConsesLow.append(body, (SubLObject)balancing_tactician.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 5270L)
    public static SubLObject new_balancing_tactician_data(final SubLObject new_root_substrategy, final SubLObject transformation_substrategy, final SubLObject removal_substrategies) {
        final SubLObject data = make_balancing_tactician_data((SubLObject)balancing_tactician.UNPROVIDED);
        _csetf_bal_tac_data_new_root_substrategy(data, new_root_substrategy);
        _csetf_bal_tac_data_transformation_substrategy(data, transformation_substrategy);
        _csetf_bal_tac_data_removal_substrategies(data, removal_substrategies);
        return data;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 5708L)
    public static SubLObject balancing_tactician_initialize(final SubLObject strategy) {
        inference_datastructures_strategy.set_strategy_data(strategy, new_balancing_tactician_data_from_inference(inference_datastructures_strategy.strategy_inference(strategy)));
        return strategy;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 5919L)
    public static SubLObject new_balancing_tactician_data_from_inference(final SubLObject inference) {
        final SubLObject new_root_substrategy = inference_datastructures_strategy.new_strategy((SubLObject)balancing_tactician.$kw37$NEW_ROOT, inference);
        final SubLObject transformation_substrategy = inference_datastructures_strategy.new_strategy((SubLObject)balancing_tactician.$kw38$TRANSFORMATION, inference);
        final SubLObject sole_removal_substrategy = inference_datastructures_strategy.new_strategy((SubLObject)balancing_tactician.$kw39$REMOVAL, inference);
        return new_balancing_tactician_data(new_root_substrategy, transformation_substrategy, (SubLObject)ConsesLow.list(sole_removal_substrategy));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 6336L)
    public static SubLObject balancing_tactician_new_root_substrategy(final SubLObject strategy) {
        assert balancing_tactician.NIL != balancing_tactician_p(strategy) : strategy;
        final SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
        return bal_tac_data_new_root_substrategy(data);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 6583L)
    public static SubLObject balancing_tactician_transformation_substrategy(final SubLObject strategy) {
        assert balancing_tactician.NIL != balancing_tactician_p(strategy) : strategy;
        final SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
        return bal_tac_data_transformation_substrategy(data);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 6818L)
    public static SubLObject balancing_tactician_removal_substrategies(final SubLObject strategy) {
        assert balancing_tactician.NIL != balancing_tactician_p(strategy) : strategy;
        final SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
        return bal_tac_data_removal_substrategies(data);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 7041L)
    public static SubLObject balancing_tactician_sole_removal_substrategy(final SubLObject strategy) {
        assert balancing_tactician.NIL != balancing_tactician_p(strategy) : strategy;
        return list_utilities.only_one(balancing_tactician_removal_substrategies(strategy));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 7270L)
    public static SubLObject balancing_tactician_all_substrategies(final SubLObject strategy) {
        return (SubLObject)ConsesLow.listS(balancing_tactician_new_root_substrategy(strategy), balancing_tactician_transformation_substrategy(strategy), balancing_tactician_removal_substrategies(strategy));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 7569L)
    public static SubLObject balancing_tactician_problem_motivated_wrt_nP(final SubLObject strategy, final SubLObject problem) {
        return inference_datastructures_strategy.problem_motivatedP(problem, balancing_tactician_new_root_substrategy(strategy));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 7742L)
    public static SubLObject balancing_tactician_problem_motivated_wrt_rP(final SubLObject strategy, final SubLObject problem) {
        return inference_datastructures_strategy.problem_motivatedP(problem, balancing_tactician_sole_removal_substrategy(strategy));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 7929L)
    public static SubLObject balancing_tactician_problem_motivated_wrt_tP(final SubLObject strategy, final SubLObject problem) {
        return inference_datastructures_strategy.problem_motivatedP(problem, balancing_tactician_transformation_substrategy(strategy));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 8108L)
    public static SubLObject balancing_tactician_link_head_motivated_wrt_rP(final SubLObject strategy, final SubLObject link_head) {
        return inference_tactician.substrategy_link_head_motivatedP(balancing_tactician_sole_removal_substrategy(strategy), link_head);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 8305L)
    public static SubLObject balancing_tactician_substrategy_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(balancing_tactician.NIL != inference_datastructures_strategy.strategy_p(v_object) && balancing_tactician.NIL != balancing_tactician_p(inference_tactician.controlling_strategy(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 8463L)
    public static SubLObject balancing_tactician_proper_substrategy_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(balancing_tactician.NIL != inference_datastructures_strategy.strategy_p(v_object) && balancing_tactician.NIL == balancing_tactician_p(v_object) && balancing_tactician.NIL != balancing_tactician_p(inference_tactician.controlling_strategy(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 8672L)
    public static SubLObject balancing_tactician_spineless_substrategy_p(final SubLObject v_object) {
        return new_root_tactician.new_root_strategy_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 8829L)
    public static SubLObject balancing_tactician_doneP(final SubLObject strategy) {
        SubLObject not_yet_doneP = (SubLObject)balancing_tactician.NIL;
        if (balancing_tactician.NIL == not_yet_doneP) {
            SubLObject csome_list_var = balancing_tactician_all_substrategies(strategy);
            SubLObject substrategy = (SubLObject)balancing_tactician.NIL;
            substrategy = csome_list_var.first();
            while (balancing_tactician.NIL == not_yet_doneP && balancing_tactician.NIL != csome_list_var) {
                if (balancing_tactician.NIL == inference_tactician.strategy_doneP(substrategy)) {
                    not_yet_doneP = (SubLObject)balancing_tactician.T;
                }
                csome_list_var = csome_list_var.rest();
                substrategy = csome_list_var.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(balancing_tactician.NIL == not_yet_doneP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 9294L)
    public static SubLObject balancing_tactician_do_one_step(final SubLObject strategy) {
        SubLObject result;
        for (result = (SubLObject)balancing_tactician.$kw42$UNINTERESTING; balancing_tactician.$kw42$UNINTERESTING == result; result = balancing_tactician_do_one_step_int(strategy)) {}
        return Equality.eq((SubLObject)balancing_tactician.$kw30$DONE, result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 9579L)
    public static SubLObject balancing_tactician_do_one_step_int(final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)balancing_tactician.NIL;
        SubLObject action = (SubLObject)balancing_tactician.NIL;
        if (balancing_tactician.NIL != balancing_tactician_should_reconsider_set_asidesP(strategy)) {
            balancing_tactician_reconsider_set_asides(strategy);
            action = (SubLObject)balancing_tactician.$kw44$RECONSIDER_SET_ASIDES;
            result = (SubLObject)balancing_tactician.$kw42$UNINTERESTING;
        }
        else if (balancing_tactician.NIL != inference_datastructures_strategy.strategy_should_propagate_answer_linkP(strategy)) {
            final SubLObject answer_link = inference_datastructures_inference.inference_root_link(inference_datastructures_strategy.strategy_inference(strategy));
            final SubLObject root_problem = inference_worker_answer.answer_link_supporting_problem(answer_link);
            final SubLObject n_strategy = balancing_tactician_new_root_substrategy(strategy);
            inference_tactician.substrategy_motivate_strategem(n_strategy, root_problem);
            inference_worker.possibly_propagate_answer_link(answer_link);
            action = (SubLObject)balancing_tactician.$kw45$PROPAGATE_ANSWER_LINK;
            result = (SubLObject)balancing_tactician.$kw46$INTERESTING;
        }
        else if (balancing_tactician.NIL == inference_tactician.strategy_doneP(balancing_tactician_sole_removal_substrategy(strategy))) {
            action = balancing_tactician_sole_removal_substrategy(strategy);
            result = substrategy_do_one_step_interestingness(inference_tactician.substrategy_do_one_step(balancing_tactician_sole_removal_substrategy(strategy)));
        }
        else if (balancing_tactician.NIL == inference_tactician.strategy_doneP(balancing_tactician_new_root_substrategy(strategy))) {
            final SubLObject n_strategy2 = balancing_tactician_new_root_substrategy(strategy);
            final SubLObject r_strategy = balancing_tactician_sole_removal_substrategy(strategy);
            final SubLObject t_strategy = balancing_tactician_transformation_substrategy(strategy);
            final SubLObject new_root = inference_tactician.substrategy_peek_next_strategem(n_strategy2);
            action = n_strategy2;
            result = inference_tactician.substrategy_do_one_step(n_strategy2);
            SubLObject re_addP = (SubLObject)balancing_tactician.NIL;
            if (balancing_tactician.NIL == balancing_tactician_problem_motivated_wrt_rP(strategy, new_root)) {
                re_addP = (SubLObject)balancing_tactician.T;
                action = (SubLObject)ConsesLow.list((SubLObject)balancing_tactician.$kw47$MOTIVATION, r_strategy, new_root);
                inference_tactician.substrategy_motivate_strategem(r_strategy, new_root);
            }
            else if (balancing_tactician.NIL == balancing_tactician_problem_motivated_wrt_tP(strategy, new_root) && balancing_tactician.NIL == inference_tactician.strategy_throws_away_all_transformationP(t_strategy)) {
                re_addP = (SubLObject)balancing_tactician.T;
                action = (SubLObject)ConsesLow.list((SubLObject)balancing_tactician.$kw47$MOTIVATION, t_strategy, new_root);
                inference_tactician.substrategy_motivate_strategem(t_strategy, new_root);
            }
            if (balancing_tactician.NIL != re_addP) {
                inference_tactician.substrategy_activate_strategem(n_strategy2, new_root);
            }
        }
        else if (balancing_tactician.NIL == inference_tactician.strategy_doneP(balancing_tactician_transformation_substrategy(strategy))) {
            action = balancing_tactician_transformation_substrategy(strategy);
            result = substrategy_do_one_step_interestingness(inference_tactician.substrategy_do_one_step(balancing_tactician_transformation_substrategy(strategy)));
        }
        if (control_vars.$inference_trace_level$.getDynamicValue(thread).numGE((SubLObject)balancing_tactician.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)balancing_tactician.T, (SubLObject)balancing_tactician.$str48$_a_do_one_step___a__, strategy, action, (SubLObject)balancing_tactician.NIL, (SubLObject)balancing_tactician.NIL, (SubLObject)balancing_tactician.NIL, (SubLObject)balancing_tactician.NIL, (SubLObject)balancing_tactician.NIL, (SubLObject)balancing_tactician.NIL);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 12149L)
    public static SubLObject balancing_tactician_should_reconsider_set_asidesP(final SubLObject strategy) {
        SubLObject csome_list_var = balancing_tactician_all_substrategies(strategy);
        SubLObject substrategy = (SubLObject)balancing_tactician.NIL;
        substrategy = csome_list_var.first();
        while (balancing_tactician.NIL != csome_list_var) {
            if (balancing_tactician.NIL != inference_datastructures_strategy.strategy_should_reconsider_set_asidesP(substrategy)) {
                return (SubLObject)balancing_tactician.T;
            }
            csome_list_var = csome_list_var.rest();
            substrategy = csome_list_var.first();
        }
        return (SubLObject)balancing_tactician.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 12389L)
    public static SubLObject balancing_tactician_reconsider_set_asides(final SubLObject strategy) {
        SubLObject count = (SubLObject)balancing_tactician.ZERO_INTEGER;
        SubLObject csome_list_var = balancing_tactician_all_substrategies(strategy);
        SubLObject substrategy = (SubLObject)balancing_tactician.NIL;
        substrategy = csome_list_var.first();
        while (balancing_tactician.NIL != csome_list_var) {
            count = Numbers.add(count, inference_tactician.strategy_reconsider_set_asides(substrategy));
            csome_list_var = csome_list_var.rest();
            substrategy = csome_list_var.first();
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 12627L)
    public static SubLObject substrategy_do_one_step_interestingness(final SubLObject substrategy_return_value) {
        return (SubLObject)((balancing_tactician.NIL != substrategy_return_value) ? balancing_tactician.$kw42$UNINTERESTING : balancing_tactician.$kw46$INTERESTING);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 12975L)
    public static SubLObject balancing_tactician_continuation_possibleP(final SubLObject strategy) {
        SubLObject continuation_possibleP = (SubLObject)balancing_tactician.NIL;
        if (balancing_tactician.NIL == continuation_possibleP) {
            SubLObject csome_list_var = balancing_tactician_all_substrategies(strategy);
            SubLObject substrategy = (SubLObject)balancing_tactician.NIL;
            substrategy = csome_list_var.first();
            while (balancing_tactician.NIL == continuation_possibleP && balancing_tactician.NIL != csome_list_var) {
                if (balancing_tactician.NIL != inference_tactician.strategy_continuation_possibleP(substrategy)) {
                    continuation_possibleP = (SubLObject)balancing_tactician.T;
                }
                csome_list_var = csome_list_var.rest();
                substrategy = csome_list_var.first();
            }
        }
        return continuation_possibleP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 13396L)
    public static SubLObject balancing_tactician_chooses_to_throw_away_problemP(final SubLObject strategy, final SubLObject problem) {
        SubLObject dont_throw_awayP = (SubLObject)balancing_tactician.NIL;
        if (balancing_tactician.NIL == dont_throw_awayP) {
            SubLObject csome_list_var = balancing_tactician_all_substrategies(strategy);
            SubLObject sub_strategy = (SubLObject)balancing_tactician.NIL;
            sub_strategy = csome_list_var.first();
            while (balancing_tactician.NIL == dont_throw_awayP && balancing_tactician.NIL != csome_list_var) {
                if (balancing_tactician.NIL == balancing_tactician_spineless_substrategy_p(sub_strategy)) {
                    dont_throw_awayP = (SubLObject)SubLObjectFactory.makeBoolean(balancing_tactician.NIL == inference_tactician_strategic_uninterestingness.strategy_chooses_to_throw_away_problemP(sub_strategy, problem, (SubLObject)balancing_tactician.UNPROVIDED));
                }
                csome_list_var = csome_list_var.rest();
                sub_strategy = csome_list_var.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(balancing_tactician.NIL == dont_throw_awayP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 13827L)
    public static SubLObject balancing_tactician_chooses_to_set_aside_problemP(final SubLObject strategy, final SubLObject problem) {
        SubLObject dont_set_asideP = (SubLObject)balancing_tactician.NIL;
        if (balancing_tactician.NIL == dont_set_asideP) {
            SubLObject csome_list_var = balancing_tactician_all_substrategies(strategy);
            SubLObject sub_strategy = (SubLObject)balancing_tactician.NIL;
            sub_strategy = csome_list_var.first();
            while (balancing_tactician.NIL == dont_set_asideP && balancing_tactician.NIL != csome_list_var) {
                if (balancing_tactician.NIL == balancing_tactician_spineless_substrategy_p(sub_strategy)) {
                    dont_set_asideP = (SubLObject)SubLObjectFactory.makeBoolean(balancing_tactician.NIL == inference_tactician_strategic_uninterestingness.strategy_chooses_to_set_aside_problemP(sub_strategy, problem));
                }
                csome_list_var = csome_list_var.rest();
                sub_strategy = csome_list_var.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(balancing_tactician.NIL == dont_set_asideP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 14249L)
    public static SubLObject balancing_tactician_chooses_to_throw_away_tacticP(final SubLObject strategy, final SubLObject tactic, final SubLObject problem_already_consideredP, final SubLObject siblings_already_consideredP) {
        SubLObject dont_throw_awayP = (SubLObject)balancing_tactician.NIL;
        if (balancing_tactician.NIL == dont_throw_awayP) {
            SubLObject csome_list_var = balancing_tactician_all_substrategies(strategy);
            SubLObject sub_strategy = (SubLObject)balancing_tactician.NIL;
            sub_strategy = csome_list_var.first();
            while (balancing_tactician.NIL == dont_throw_awayP && balancing_tactician.NIL != csome_list_var) {
                if (balancing_tactician.NIL == balancing_tactician_spineless_substrategy_p(sub_strategy)) {
                    dont_throw_awayP = (SubLObject)SubLObjectFactory.makeBoolean(balancing_tactician.NIL == inference_tactician_strategic_uninterestingness.strategy_chooses_to_throw_away_tacticP(sub_strategy, tactic, problem_already_consideredP, siblings_already_consideredP));
                }
                csome_list_var = csome_list_var.rest();
                sub_strategy = csome_list_var.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(balancing_tactician.NIL == dont_throw_awayP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 14787L)
    public static SubLObject balancing_tactician_chooses_to_set_aside_tacticP(final SubLObject strategy, final SubLObject tactic, final SubLObject problem_already_consideredP, final SubLObject siblings_already_consideredP) {
        SubLObject dont_set_asideP = (SubLObject)balancing_tactician.NIL;
        if (balancing_tactician.NIL == dont_set_asideP) {
            SubLObject csome_list_var = balancing_tactician_all_substrategies(strategy);
            SubLObject sub_strategy = (SubLObject)balancing_tactician.NIL;
            sub_strategy = csome_list_var.first();
            while (balancing_tactician.NIL == dont_set_asideP && balancing_tactician.NIL != csome_list_var) {
                if (balancing_tactician.NIL == balancing_tactician_spineless_substrategy_p(sub_strategy)) {
                    dont_set_asideP = (SubLObject)SubLObjectFactory.makeBoolean(balancing_tactician.NIL == inference_tactician_strategic_uninterestingness.strategy_chooses_to_set_aside_tacticP(sub_strategy, tactic, problem_already_consideredP, siblings_already_consideredP));
                }
                csome_list_var = csome_list_var.rest();
                sub_strategy = csome_list_var.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(balancing_tactician.NIL == dont_set_asideP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 15316L)
    public static SubLObject balancing_tactician_throw_away_uninteresting_set_asides(final SubLObject strategy) {
        SubLObject count = (SubLObject)balancing_tactician.ZERO_INTEGER;
        SubLObject csome_list_var = balancing_tactician_all_substrategies(strategy);
        SubLObject substrategy = (SubLObject)balancing_tactician.NIL;
        substrategy = csome_list_var.first();
        while (balancing_tactician.NIL != csome_list_var) {
            count = Numbers.add(count, inference_tactician.strategy_throw_away_uninteresting_set_asides(substrategy));
            csome_list_var = csome_list_var.rest();
            substrategy = csome_list_var.first();
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 15708L)
    public static SubLObject balancing_tactician_note_inference_dynamic_properties_updated(final SubLObject strategy) {
        SubLObject csome_list_var = balancing_tactician_all_substrategies(strategy);
        SubLObject substrategy = (SubLObject)balancing_tactician.NIL;
        substrategy = csome_list_var.first();
        while (balancing_tactician.NIL != csome_list_var) {
            inference_tactician.strategy_note_inference_dynamic_properties_updated(substrategy);
            csome_list_var = csome_list_var.rest();
            substrategy = csome_list_var.first();
        }
        return (SubLObject)balancing_tactician.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 16073L)
    public static SubLObject balancing_tactician_initialize_properties(final SubLObject strategy, final SubLObject strategy_static_properties) {
        inference_datastructures_strategy.set_strategy_properties(strategy, strategy_static_properties);
        SubLObject csome_list_var = balancing_tactician_all_substrategies(strategy);
        SubLObject substrategy = (SubLObject)balancing_tactician.NIL;
        substrategy = csome_list_var.first();
        while (balancing_tactician.NIL != csome_list_var) {
            inference_tactician.strategy_initialize_properties(substrategy, strategy_static_properties);
            csome_list_var = csome_list_var.rest();
            substrategy = csome_list_var.first();
        }
        return (SubLObject)balancing_tactician.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 16504L)
    public static SubLObject balancing_tactician_update_properties(final SubLObject strategy, final SubLObject strategy_dynamic_properties) {
        inference_datastructures_strategy.set_strategy_properties(strategy, strategy_dynamic_properties);
        SubLObject csome_list_var = balancing_tactician_all_substrategies(strategy);
        SubLObject substrategy = (SubLObject)balancing_tactician.NIL;
        substrategy = csome_list_var.first();
        while (balancing_tactician.NIL != csome_list_var) {
            inference_tactician.strategy_update_properties(substrategy, strategy_dynamic_properties);
            csome_list_var = csome_list_var.rest();
            substrategy = csome_list_var.first();
        }
        return (SubLObject)balancing_tactician.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 16885L)
    public static SubLObject balancing_tactician_initial_relevant_strategies(final SubLObject strategy) {
        return balancing_tactician_all_substrategies(strategy);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 17121L)
    public static SubLObject balancing_tactician_possibly_activate_problem(final SubLObject strategy, final SubLObject problem) {
        if (balancing_tactician.NIL == inference_tactician.strategy_throws_away_all_transformationP(strategy)) {
            if (balancing_tactician.NIL != balancing_tactician_problem_is_the_rest_of_an_early_removalP(strategy, problem)) {
                balancing_tactician_possibly_make_new_root(strategy, problem);
            }
            else if (balancing_tactician.NIL != balancing_tactician_problem_is_the_result_of_a_simplificationP(strategy, problem)) {
                balancing_tactician_possibly_make_new_root(strategy, problem);
            }
        }
        return (SubLObject)balancing_tactician.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 17853L)
    public static SubLObject balancing_tactician_problem_is_the_rest_of_an_early_removalP(final SubLObject strategy, final SubLObject problem) {
        final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject restriction_link;
        SubLObject non_focal_problem;
        SubLObject set_contents_var_$3;
        SubLObject basis_object_$4;
        SubLObject state_$5;
        SubLObject join_ordered_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)balancing_tactician.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); balancing_tactician.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            restriction_link = set_contents.do_set_contents_next(basis_object, state);
            if (balancing_tactician.NIL != set_contents.do_set_contents_element_validP(state, restriction_link) && balancing_tactician.NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link, (SubLObject)balancing_tactician.$kw60$RESTRICTION)) {
                non_focal_problem = inference_datastructures_problem_link.problem_link_supported_problem(restriction_link);
                set_contents_var_$3 = inference_datastructures_problem.problem_dependent_links(non_focal_problem);
                for (basis_object_$4 = set_contents.do_set_contents_basis_object(set_contents_var_$3), state_$5 = (SubLObject)balancing_tactician.NIL, state_$5 = set_contents.do_set_contents_initial_state(basis_object_$4, set_contents_var_$3); balancing_tactician.NIL == set_contents.do_set_contents_doneP(basis_object_$4, state_$5); state_$5 = set_contents.do_set_contents_update_state(state_$5)) {
                    join_ordered_link = set_contents.do_set_contents_next(basis_object_$4, state_$5);
                    if (balancing_tactician.NIL != set_contents.do_set_contents_element_validP(state_$5, join_ordered_link) && balancing_tactician.NIL != inference_datastructures_problem_link.problem_link_has_typeP(join_ordered_link, (SubLObject)balancing_tactician.$kw61$JOIN_ORDERED) && balancing_tactician.NIL != inference_worker_join_ordered.join_ordered_link_restricted_non_focal_linkP(join_ordered_link, restriction_link) && non_focal_problem.eql(inference_worker_join_ordered.join_ordered_link_non_focal_problem(join_ordered_link)) && balancing_tactician.NIL != balancing_tactician_chooses_to_propagate_new_root_motivation_to_restricted_non_focal_problemP(strategy, problem, join_ordered_link)) {
                        return (SubLObject)balancing_tactician.T;
                    }
                }
            }
        }
        return (SubLObject)balancing_tactician.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 18306L)
    public static SubLObject balancing_tactician_chooses_to_propagate_new_root_motivation_to_restricted_non_focal_problemP(final SubLObject strategy, final SubLObject problem, final SubLObject join_ordered_link) {
        if (balancing_tactician.NIL != balancing_tactician_treats_restricted_non_focal_as_new_rootP(strategy, join_ordered_link)) {
            return (SubLObject)balancing_tactician.T;
        }
        if (balancing_tactician.NIL != balancing_tactician_early_removal_linkP(strategy, join_ordered_link)) {
            return (SubLObject)balancing_tactician.T;
        }
        return (SubLObject)balancing_tactician.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 18742L)
    public static SubLObject balancing_tactician_treats_restricted_non_focal_as_new_rootP(final SubLObject strategy, final SubLObject join_ordered_link) {
        return (SubLObject)SubLObjectFactory.makeBoolean(balancing_tactician.NIL != inference_worker_join_ordered.join_ordered_link_with_non_focal_unbound_predicateP(join_ordered_link) || balancing_tactician.NIL != inference_worker_join_ordered.join_ordered_link_with_non_focal_isa_unbound_unbound_where_arg2_is_restrictedP(join_ordered_link));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 19060L)
    public static SubLObject balancing_tactician_early_removal_linkP(final SubLObject strategy, final SubLObject link) {
        assert balancing_tactician.NIL != balancing_tactician_p(strategy) : strategy;
        assert balancing_tactician.NIL != inference_datastructures_problem_link.problem_link_p(link) : link;
        final SubLObject r_strategy = balancing_tactician_sole_removal_substrategy(strategy);
        return (SubLObject)SubLObjectFactory.makeBoolean(balancing_tactician.NIL != inference_worker_join_ordered.join_ordered_link_p(link) && balancing_tactician.NIL != inference_datastructures_problem_link.problem_link_openP(link) && balancing_tactician.NIL != substrategy_connected_conjunction_link_motivatedP(r_strategy, link) && balancing_tactician.NIL != balancing_tactician_problem_motivated_wrt_nP(strategy, inference_datastructures_problem_link.problem_link_supported_problem(link)) && balancing_tactician.$kw63$COMPLETE == inference_worker.problem_generalized_removal_completeness(inference_worker_join_ordered.join_ordered_tactic_lookahead_problem(inference_worker_join_ordered.join_ordered_link_tactic(link)), r_strategy) && balancing_tactician.NIL != inference_tactician.join_ordered_link_early_removal_cheapP(link, strategy));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 19982L)
    public static SubLObject substrategy_connected_conjunction_link_motivatedP(final SubLObject substrategy, final SubLObject connected_conjunction_link) {
        final SubLObject link_head = inference_worker.connected_conjunction_link_tactic(connected_conjunction_link);
        return inference_tactician.substrategy_link_head_motivatedP(substrategy, link_head);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 20402L)
    public static SubLObject balancing_tactician_problem_is_the_result_of_a_simplificationP(final SubLObject strategy, final SubLObject problem) {
        if (balancing_tactician.NIL != inference_worker_restriction.problem_is_a_simplificationP(problem)) {
            final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject simplification_link;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)balancing_tactician.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); balancing_tactician.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                simplification_link = set_contents.do_set_contents_next(basis_object, state);
                if (balancing_tactician.NIL != set_contents.do_set_contents_element_validP(state, simplification_link) && balancing_tactician.NIL != inference_datastructures_problem_link.problem_link_has_typeP(simplification_link, (SubLObject)balancing_tactician.$kw64$SIMPLIFICATION) && balancing_tactician.NIL != balancing_tactician_problem_motivated_wrt_nP(strategy, inference_datastructures_problem_link.problem_link_supported_problem(simplification_link))) {
                    return (SubLObject)balancing_tactician.T;
                }
            }
        }
        return (SubLObject)balancing_tactician.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 20768L)
    public static SubLObject balancing_tactician_note_argument_link(final SubLObject strategy, final SubLObject link) {
        if (balancing_tactician.NIL != inference_worker_residual_transformation.residual_transformation_link_p(link)) {
            final SubLObject t_strategy = balancing_tactician_transformation_substrategy(strategy);
            final SubLObject t_link = inference_worker_residual_transformation.residual_transformation_link_motivating_transformation_link(link);
            if (balancing_tactician.NIL != inference_tactician.substrategy_link_head_motivatedP(t_strategy, t_link)) {
                balancing_tactician_substrategy_link_motivated(strategy, t_strategy, t_link);
            }
            return (SubLObject)balancing_tactician.NIL;
        }
        return (SubLObject)balancing_tactician.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 21414L)
    public static SubLObject balancing_tactician_early_removal_productivity_limit(final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return balancing_tactician.$balancing_tactician_early_removal_productivity_limit$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 21783L)
    public static SubLObject balancing_tactician_substrategy_strategem_motivated(final SubLObject strategy, final SubLObject substrategy, final SubLObject strategem) {
        if (balancing_tactician.NIL != inference_datastructures_problem.problem_p(strategem)) {
            return balancing_tactician_substrategy_problem_motivated(strategy, substrategy, strategem);
        }
        if (balancing_tactician.NIL != inference_datastructures_problem_link.problem_link_p(strategem)) {
            return balancing_tactician_substrategy_link_motivated(strategy, substrategy, strategem);
        }
        if (balancing_tactician.NIL != inference_datastructures_tactic.tactic_p(strategem)) {
            return balancing_tactician_substrategy_tactic_motivated(strategy, substrategy, strategem);
        }
        return (SubLObject)balancing_tactician.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 22542L)
    public static SubLObject balancing_tactician_substrategy_problem_motivated(final SubLObject strategy, final SubLObject substrategy, final SubLObject problem) {
        inference_datastructures_strategy.strategy_note_problem_motivated(strategy, problem);
        if (balancing_tactician.NIL != new_root_tactician.new_root_strategy_p(substrategy)) {
            SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject split_link;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)balancing_tactician.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); balancing_tactician.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                split_link = set_contents.do_set_contents_next(basis_object, state);
                if (balancing_tactician.NIL != set_contents.do_set_contents_element_validP(state, split_link) && balancing_tactician.NIL != inference_datastructures_problem_link.problem_link_has_typeP(split_link, (SubLObject)balancing_tactician.$kw68$SPLIT)) {
                    balancing_tactician_possibly_propagate_new_root_motivation_down_split_link(strategy, split_link);
                }
            }
            set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
            SubLObject union_link;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)balancing_tactician.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); balancing_tactician.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                union_link = set_contents.do_set_contents_next(basis_object, state);
                if (balancing_tactician.NIL != set_contents.do_set_contents_element_validP(state, union_link) && balancing_tactician.NIL != inference_datastructures_problem_link.problem_link_has_typeP(union_link, (SubLObject)balancing_tactician.$kw69$UNION)) {
                    balancing_tactician_possibly_propagate_new_root_motivation_down_union_link(strategy, union_link);
                }
            }
            set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
            SubLObject link;
            SubLObject link_var;
            SubLObject set_contents_var_$6;
            SubLObject basis_object_$7;
            SubLObject state_$8;
            SubLObject restriction_link;
            SubLObject restricted_non_focal_problem;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)balancing_tactician.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); balancing_tactician.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                link = set_contents.do_set_contents_next(basis_object, state);
                if (balancing_tactician.NIL != set_contents.do_set_contents_element_validP(state, link) && balancing_tactician.NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, (SubLObject)balancing_tactician.$kw61$JOIN_ORDERED) && balancing_tactician.NIL != balancing_tactician_early_removal_linkP(strategy, link)) {
                    link_var = link;
                    set_contents_var_$6 = inference_datastructures_problem.problem_argument_links(inference_worker_join_ordered.join_ordered_link_non_focal_problem(link_var));
                    for (basis_object_$7 = set_contents.do_set_contents_basis_object(set_contents_var_$6), state_$8 = (SubLObject)balancing_tactician.NIL, state_$8 = set_contents.do_set_contents_initial_state(basis_object_$7, set_contents_var_$6); balancing_tactician.NIL == set_contents.do_set_contents_doneP(basis_object_$7, state_$8); state_$8 = set_contents.do_set_contents_update_state(state_$8)) {
                        restriction_link = set_contents.do_set_contents_next(basis_object_$7, state_$8);
                        if (balancing_tactician.NIL != set_contents.do_set_contents_element_validP(state_$8, restriction_link) && balancing_tactician.NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link, (SubLObject)balancing_tactician.$kw60$RESTRICTION) && balancing_tactician.NIL != inference_worker_join_ordered.non_focal_restriction_link_with_corresponding_focal_proofP(restriction_link, link_var)) {
                            restricted_non_focal_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(restriction_link);
                            balancing_tactician_possibly_make_new_root(strategy, restricted_non_focal_problem);
                        }
                    }
                }
            }
        }
        return (SubLObject)balancing_tactician.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 23709L)
    public static SubLObject balancing_tactician_substrategy_link_motivated(final SubLObject strategy, final SubLObject substrategy, final SubLObject link) {
        assert balancing_tactician.NIL != transformation_tactician_datastructures.transformation_strategy_p(substrategy) : substrategy;
        assert balancing_tactician.NIL != inference_datastructures_problem_link.problem_link_p(link) : link;
        if (balancing_tactician.NIL != inference_worker_transformation.transformation_link_p(link)) {
            if (balancing_tactician.NIL == balancing_tactician_chooses_to_make_d_a_new_rootP(strategy, link)) {
                SubLObject count = (SubLObject)balancing_tactician.ZERO_INTEGER;
                SubLObject cdolist_list_var = balancing_tactician_transformation_new_root_candidates(strategy, link);
                SubLObject new_root = (SubLObject)balancing_tactician.NIL;
                new_root = cdolist_list_var.first();
                while (balancing_tactician.NIL != cdolist_list_var) {
                    if (balancing_tactician.NIL != balancing_tactician_possibly_make_new_root(strategy, new_root)) {
                        count = Numbers.add(count, (SubLObject)balancing_tactician.ONE_INTEGER);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    new_root = cdolist_list_var.first();
                }
                return count;
            }
            if (balancing_tactician.NIL != balancing_tactician_problem_motivated_wrt_rP(strategy, inference_datastructures_problem_link.problem_link_supported_problem(link))) {
                final SubLObject residual_problem = inference_worker_transformation.transformation_link_supporting_problem(link);
                return balancing_tactician_possibly_make_new_root(strategy, residual_problem);
            }
        }
        return (SubLObject)balancing_tactician.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 25496L)
    public static SubLObject balancing_tactician_chooses_to_make_d_a_new_rootP(final SubLObject strategy, final SubLObject t_link) {
        return Types.sublisp_null(balancing_tactician_residual_conjunction_new_root_candidates(strategy, t_link));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 25930L)
    public static SubLObject balancing_tactician_residual_conjunction_new_root_candidates(final SubLObject strategy, final SubLObject t_link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject t_strategy = balancing_tactician_transformation_substrategy(strategy);
        SubLObject new_roots = (SubLObject)balancing_tactician.NIL;
        if (balancing_tactician.NIL == balancing_tactician.$balancing_tactician_self_looping_rule_fix_enabledP$.getDynamicValue(thread) || balancing_tactician.NIL == assertion_utilities.self_expanding_ruleP(inference_worker_transformation.transformation_link_rule_assertion(t_link))) {
            final SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(t_link);
            final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(supported_problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject jo_link_var;
            SubLObject jo_link_var_$9;
            SubLObject motivating_conjunction_problem;
            SubLObject set_contents_var_$10;
            SubLObject basis_object_$11;
            SubLObject state_$12;
            SubLObject rt_link;
            SubLObject candidate_new_root;
            SubLObject jo_link;
            SubLObject jo_tactic;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)balancing_tactician.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); balancing_tactician.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                jo_link_var = set_contents.do_set_contents_next(basis_object, state);
                if (balancing_tactician.NIL != set_contents.do_set_contents_element_validP(state, jo_link_var) && balancing_tactician.NIL != inference_datastructures_problem_link.problem_link_has_typeP(jo_link_var, (SubLObject)balancing_tactician.$kw61$JOIN_ORDERED)) {
                    jo_link_var_$9 = jo_link_var;
                    motivating_conjunction_problem = inference_datastructures_problem_link.problem_link_supported_problem(jo_link_var_$9);
                    set_contents_var_$10 = inference_datastructures_problem.problem_argument_links(motivating_conjunction_problem);
                    for (basis_object_$11 = set_contents.do_set_contents_basis_object(set_contents_var_$10), state_$12 = (SubLObject)balancing_tactician.NIL, state_$12 = set_contents.do_set_contents_initial_state(basis_object_$11, set_contents_var_$10); balancing_tactician.NIL == set_contents.do_set_contents_doneP(basis_object_$11, state_$12); state_$12 = set_contents.do_set_contents_update_state(state_$12)) {
                        rt_link = set_contents.do_set_contents_next(basis_object_$11, state_$12);
                        if (balancing_tactician.NIL != set_contents.do_set_contents_element_validP(state_$12, rt_link) && balancing_tactician.NIL != inference_datastructures_problem_link.problem_link_has_typeP(rt_link, (SubLObject)balancing_tactician.$kw71$RESIDUAL_TRANSFORMATION) && balancing_tactician.NIL != inference_worker_residual_transformation.residual_transformation_link_motivated_by_join_ordered_linkP(rt_link, jo_link_var_$9) && balancing_tactician.NIL != inference_worker_residual_transformation.residual_transformation_link_motivated_by_transformation_linkP(rt_link, t_link)) {
                            candidate_new_root = inference_worker_residual_transformation.residual_transformation_link_supporting_problem(rt_link);
                            if (balancing_tactician.NIL != inference_datastructures_problem.problem_relevant_to_strategyP(candidate_new_root, t_strategy) || balancing_tactician.NIL != inference_datastructures_strategy.problem_motivatedP(candidate_new_root, t_strategy)) {
                                jo_link = inference_worker_residual_transformation.residual_transformation_link_motivating_join_ordered_link(rt_link);
                                jo_tactic = inference_worker_join_ordered.join_ordered_link_tactic(jo_link);
                                if (balancing_tactician.NIL == balancing_tactician.$balancing_tactician_new_roots_check_for_t_on_jo_linkP$.getDynamicValue(thread) || balancing_tactician.NIL != inference_tactician.substrategy_link_head_motivatedP(t_strategy, jo_tactic)) {
                                    new_roots = (SubLObject)ConsesLow.cons(candidate_new_root, new_roots);
                                }
                            }
                        }
                    }
                }
            }
        }
        return Sequences.nreverse(new_roots);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 27028L)
    public static SubLObject balancing_tactician_transformation_new_root_candidates(final SubLObject strategy, final SubLObject t_link) {
        if (balancing_tactician.NIL != inference_tactician.transformation_link_leads_to_term_chosen_dead_endP(t_link)) {
            return inference_tactician.all_restricted_non_focals_around_transformation_link(t_link);
        }
        return balancing_tactician_residual_conjunction_new_root_candidates(strategy, t_link);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 27354L)
    public static SubLObject balancing_tactician_possibly_make_new_root(final SubLObject strategy, final SubLObject problem) {
        return inference_tactician.substrategy_motivate_strategem(balancing_tactician_new_root_substrategy(strategy), problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 27535L)
    public static SubLObject balancing_tactician_substrategy_tactic_motivated(final SubLObject strategy, final SubLObject substrategy, final SubLObject tactic) {
        if (balancing_tactician.NIL != inference_worker.connected_conjunction_tactic_p(tactic)) {
            return balancing_tactician_substrategy_connected_conjunction_tactic_motivated(strategy, substrategy, tactic);
        }
        if (balancing_tactician.NIL != inference_worker_split.split_tactic_p(tactic)) {
            return balancing_tactician_substrategy_split_tactic_motivated(strategy, substrategy, tactic);
        }
        return (SubLObject)balancing_tactician.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 28564L)
    public static SubLObject balancing_tactician_substrategy_connected_conjunction_tactic_motivated(final SubLObject strategy, final SubLObject substrategy, final SubLObject cc_tactic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert balancing_tactician.NIL != transformation_tactician_datastructures.transformation_strategy_p(substrategy) : substrategy;
        assert balancing_tactician.NIL != inference_worker.connected_conjunction_tactic_p(cc_tactic) : cc_tactic;
        if (balancing_tactician.NIL != balancing_tactician.$balancing_tactician_new_roots_triggered_by_t_on_jo_linkP$.getDynamicValue(thread)) {
            final SubLObject link = inference_worker.connected_conjunction_tactic_link(cc_tactic);
            if (balancing_tactician.NIL != inference_worker_join_ordered.join_ordered_link_p(link)) {
                final SubLObject jo_link_var = link;
                final SubLObject motivating_conjunction_problem = inference_datastructures_problem_link.problem_link_supported_problem(jo_link_var);
                final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(motivating_conjunction_problem);
                SubLObject basis_object;
                SubLObject state;
                SubLObject rt_link;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)balancing_tactician.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); balancing_tactician.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    rt_link = set_contents.do_set_contents_next(basis_object, state);
                    if (balancing_tactician.NIL != set_contents.do_set_contents_element_validP(state, rt_link) && balancing_tactician.NIL != inference_datastructures_problem_link.problem_link_has_typeP(rt_link, (SubLObject)balancing_tactician.$kw71$RESIDUAL_TRANSFORMATION) && balancing_tactician.NIL != inference_worker_residual_transformation.residual_transformation_link_motivated_by_join_ordered_linkP(rt_link, jo_link_var)) {
                        balancing_tactician_possibly_motivate_new_root_via_residual_transformation_link(strategy, rt_link);
                    }
                }
            }
        }
        return (SubLObject)balancing_tactician.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 29164L)
    public static SubLObject balancing_tactician_possibly_motivate_new_root_via_residual_transformation_link(final SubLObject strategy, final SubLObject rt_link) {
        final SubLObject t_strategy = balancing_tactician_transformation_substrategy(strategy);
        final SubLObject t_link = inference_worker_residual_transformation.residual_transformation_link_motivating_transformation_link(rt_link);
        if (balancing_tactician.NIL != inference_tactician.substrategy_link_head_motivatedP(t_strategy, t_link)) {
            return balancing_tactician_substrategy_link_motivated(strategy, t_strategy, t_link);
        }
        return (SubLObject)balancing_tactician.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 30307L)
    public static SubLObject balancing_tactician_substrategy_split_tactic_motivated(final SubLObject strategy, final SubLObject substrategy, final SubLObject split_tactic) {
        assert balancing_tactician.NIL != transformation_tactician_datastructures.transformation_strategy_p(substrategy) : substrategy;
        assert balancing_tactician.NIL != inference_worker_split.split_tactic_p(split_tactic) : split_tactic;
        balancing_tactician_possibly_propagate_new_root_motivation_down_split_link(strategy, inference_worker_split.split_tactic_link(split_tactic));
        final SubLObject r_strategy = balancing_tactician_sole_removal_substrategy(strategy);
        if (balancing_tactician.NIL != inference_datastructures_strategy.problem_motivatedP(inference_datastructures_tactic.tactic_problem(split_tactic), r_strategy)) {
            return inference_tactician.substrategy_reconsider_split_set_asides(r_strategy, split_tactic);
        }
        return (SubLObject)balancing_tactician.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 30892L)
    public static SubLObject balancing_tactician_possibly_propagate_new_root_motivation_down_split_link(final SubLObject strategy, final SubLObject split_link) {
        SubLObject count = (SubLObject)balancing_tactician.ZERO_INTEGER;
        if (balancing_tactician.NIL != balancing_tactician_problem_motivated_wrt_nP(strategy, inference_datastructures_problem_link.problem_link_supported_problem(split_link))) {
            SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(split_link);
            SubLObject supporting_mapped_problem = (SubLObject)balancing_tactician.NIL;
            supporting_mapped_problem = cdolist_list_var.first();
            while (balancing_tactician.NIL != cdolist_list_var) {
                if (balancing_tactician.NIL != inference_macros.do_problem_link_open_matchP((SubLObject)balancing_tactician.NIL, split_link, supporting_mapped_problem)) {
                    final SubLObject supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                    final SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
                    if (balancing_tactician.NIL != balancing_tactician_problem_motivated_wrt_tP(strategy, supporting_problem) && balancing_tactician.NIL != inference_tactician.substrategy_motivate_strategem(balancing_tactician_new_root_substrategy(strategy), supporting_problem)) {
                        count = Numbers.add(count, (SubLObject)balancing_tactician.ONE_INTEGER);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                supporting_mapped_problem = cdolist_list_var.first();
            }
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 31920L)
    public static SubLObject balancing_tactician_substrategy_union_tactic_motivated(final SubLObject strategy, final SubLObject substrategy, final SubLObject union_tactic) {
        if (balancing_tactician.NIL != transformation_tactician_datastructures.transformation_strategy_p(substrategy)) {
            return balancing_tactician_possibly_propagate_new_root_motivation_down_union_link(strategy, inference_worker_union.union_tactic_link(union_tactic));
        }
        return (SubLObject)balancing_tactician.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 32235L)
    public static SubLObject balancing_tactician_possibly_propagate_new_root_motivation_down_union_link(final SubLObject strategy, final SubLObject union_link) {
        if (balancing_tactician.NIL != balancing_tactician_problem_motivated_wrt_nP(strategy, inference_datastructures_problem_link.problem_link_supported_problem(union_link))) {
            final SubLObject supporting_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(union_link);
            if (balancing_tactician.NIL != balancing_tactician_problem_motivated_wrt_tP(strategy, supporting_problem)) {
                return balancing_tactician_possibly_make_new_root(strategy, supporting_problem);
            }
        }
        return (SubLObject)balancing_tactician.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 33156L)
    public static SubLObject balancing_tactician_allows_split_tactic_to_be_set_aside_wrt_removalP(final SubLObject strategy, final SubLObject substrategy, final SubLObject split_tactic) {
        assert balancing_tactician.NIL != removal_tactician.removal_strategy_p(substrategy) : substrategy;
        return (SubLObject)SubLObjectFactory.makeBoolean(balancing_tactician.NIL == inference_tactician.substrategy_link_head_motivatedP(balancing_tactician_transformation_substrategy(strategy), split_tactic));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 33646L)
    public static SubLObject balancing_tactician_chooses_to_totally_throw_away_tacticP(final SubLObject strategy, final SubLObject substrategy, final SubLObject tactic, final SubLObject problem_already_consideredP, final SubLObject siblings_already_consideredP) {
        return balancing_tactician_chooses_to_throw_away_tacticP(strategy, tactic, problem_already_consideredP, siblings_already_consideredP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 34097L)
    public static SubLObject balancing_tactician_substrategy_problem_status_change(final SubLObject strategy, final SubLObject substrategy, final SubLObject problem, final SubLObject old_status, final SubLObject new_status) {
        balancing_tactician_recompute_problem_status(strategy, problem);
        if (balancing_tactician.NIL != removal_tactician.removal_strategy_p(substrategy) && balancing_tactician.NIL != inference_tactician_strategic_uninterestingness.problem_has_executed_a_complete_removal_tacticP(problem, substrategy) && balancing_tactician.NIL == inference_datastructures_enumerated_types.no_good_problem_status_p(old_status) && balancing_tactician.NIL != inference_datastructures_enumerated_types.no_good_problem_status_p(new_status)) {
            balancing_tactician_make_problem_no_good(strategy, problem);
            return (SubLObject)balancing_tactician.$kw77$COMPLETE_REMOVAL_TACTIC_NO_GOOD;
        }
        return (SubLObject)balancing_tactician.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 35177L)
    public static SubLObject balancing_tactician_recompute_problem_status(final SubLObject strategy, final SubLObject problem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject weakest_strategic_status = (SubLObject)balancing_tactician.$kw79$FINISHED;
        SubLObject most_sensible_provability_status = (SubLObject)balancing_tactician.$kw80$NO_GOOD;
        SubLObject csome_list_var = balancing_tactician_all_substrategies(strategy);
        SubLObject substrategy = (SubLObject)balancing_tactician.NIL;
        substrategy = csome_list_var.first();
        while (balancing_tactician.NIL != csome_list_var) {
            if (balancing_tactician.NIL == balancing_tactician_spineless_substrategy_p(substrategy)) {
                final SubLObject strategic_status = inference_datastructures_strategy.problem_strategic_status(problem, substrategy);
                if (balancing_tactician.NIL != inference_datastructures_enumerated_types.tactical_status_unionP(strategic_status, weakest_strategic_status)) {
                    weakest_strategic_status = strategic_status;
                }
                final SubLObject pcase_var;
                final SubLObject provability_status = pcase_var = inference_datastructures_strategy.problem_provability_status(problem, substrategy);
                if (!pcase_var.eql((SubLObject)balancing_tactician.$kw80$NO_GOOD)) {
                    if (pcase_var.eql((SubLObject)balancing_tactician.$kw81$GOOD)) {
                        most_sensible_provability_status = (SubLObject)balancing_tactician.$kw82$NEUTRAL;
                    }
                    else if (pcase_var.eql((SubLObject)balancing_tactician.$kw82$NEUTRAL)) {
                        most_sensible_provability_status = (SubLObject)balancing_tactician.$kw82$NEUTRAL;
                    }
                }
            }
            csome_list_var = csome_list_var.rest();
            substrategy = csome_list_var.first();
        }
        if (balancing_tactician.$kw83$POSSIBLE == weakest_strategic_status && balancing_tactician.$kw80$NO_GOOD == most_sensible_provability_status) {
            weakest_strategic_status = (SubLObject)balancing_tactician.$kw84$PENDING;
        }
        final SubLObject status = inference_datastructures_enumerated_types.problem_status_from_tactical_status_and_provability_status(weakest_strategic_status, most_sensible_provability_status);
        inference_datastructures_strategy.set_problem_raw_strategic_status(problem, strategy, status);
        if (balancing_tactician.NIL != balancing_tactician.$balancing_tactician_is_tactically_hardcoreP$.getDynamicValue(thread) && balancing_tactician.NIL != inference_tactician.strategy_controls_problem_storeP(strategy) && balancing_tactician.NIL == inference_datastructures_strategy.strategy_continuableP(strategy) && balancing_tactician.NIL != inference_tactician.strategy_set_aside_non_continuable_implies_throw_awayP(strategy)) {
            balancing_tactician_possibly_propagate_strategic_status_to_tactical_status(problem, most_sensible_provability_status, weakest_strategic_status);
        }
        return status;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 36773L)
    public static SubLObject balancing_tactician_possibly_propagate_strategic_status_to_tactical_status(final SubLObject problem, final SubLObject most_sensible_provability_status, final SubLObject weakest_strategic_status) {
        if (balancing_tactician.$kw80$NO_GOOD == most_sensible_provability_status) {
            inference_worker.make_problem_no_good(problem, (SubLObject)balancing_tactician.NIL, (SubLObject)balancing_tactician.$kw85$TACTICAL);
        }
        if (balancing_tactician.$kw84$PENDING == weakest_strategic_status) {
            inference_worker.discard_all_possible_tactics(problem);
            inference_worker.possibly_note_problem_pending(problem, (SubLObject)balancing_tactician.$kw85$TACTICAL);
        }
        if (balancing_tactician.$kw79$FINISHED == weakest_strategic_status) {
            inference_worker.possibly_note_problem_finished(problem, (SubLObject)balancing_tactician.$kw85$TACTICAL);
        }
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 37309L)
    public static SubLObject balancing_tactician_make_problem_no_good(final SubLObject strategy, final SubLObject problem) {
        inference_worker.make_problem_no_good(problem, (SubLObject)balancing_tactician.NIL, strategy);
        SubLObject csome_list_var = balancing_tactician_all_substrategies(strategy);
        SubLObject sub_strategy = (SubLObject)balancing_tactician.NIL;
        sub_strategy = csome_list_var.first();
        while (balancing_tactician.NIL != csome_list_var) {
            inference_worker.make_problem_no_good(problem, (SubLObject)balancing_tactician.NIL, sub_strategy);
            csome_list_var = csome_list_var.rest();
            sub_strategy = csome_list_var.first();
        }
        return (SubLObject)balancing_tactician.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 37562L)
    public static SubLObject balancing_tactician_make_problem_pending(final SubLObject strategy, final SubLObject problem) {
        SubLObject csome_list_var = balancing_tactician_all_substrategies(strategy);
        SubLObject sub_strategy = (SubLObject)balancing_tactician.NIL;
        sub_strategy = csome_list_var.first();
        while (balancing_tactician.NIL != csome_list_var) {
            inference_worker.possibly_note_problem_pending(problem, sub_strategy);
            csome_list_var = csome_list_var.rest();
            sub_strategy = csome_list_var.first();
        }
        final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)balancing_tactician.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); balancing_tactician.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            link = set_contents.do_set_contents_next(basis_object, state);
            if (balancing_tactician.NIL != set_contents.do_set_contents_element_validP(state, link) && balancing_tactician.NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, (SubLObject)balancing_tactician.$kw86$CONNECTED_CONJUNCTION)) {
                balancing_tactician_make_problem_pending(strategy, inference_datastructures_problem_link.problem_link_supported_problem(link));
            }
        }
        return (SubLObject)balancing_tactician.NIL;
    }
    
    public static SubLObject declare_balancing_tactician_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_data_print_function_trampoline", "BALANCING-TACTICIAN-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_data_p", "BALANCING-TACTICIAN-DATA-P", 1, 0, false);
        new $balancing_tactician_data_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "bal_tac_data_new_root_substrategy", "BAL-TAC-DATA-NEW-ROOT-SUBSTRATEGY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "bal_tac_data_transformation_substrategy", "BAL-TAC-DATA-TRANSFORMATION-SUBSTRATEGY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "bal_tac_data_removal_substrategies", "BAL-TAC-DATA-REMOVAL-SUBSTRATEGIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "_csetf_bal_tac_data_new_root_substrategy", "_CSETF-BAL-TAC-DATA-NEW-ROOT-SUBSTRATEGY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "_csetf_bal_tac_data_transformation_substrategy", "_CSETF-BAL-TAC-DATA-TRANSFORMATION-SUBSTRATEGY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "_csetf_bal_tac_data_removal_substrategies", "_CSETF-BAL-TAC-DATA-REMOVAL-SUBSTRATEGIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "make_balancing_tactician_data", "MAKE-BALANCING-TACTICIAN-DATA", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "visit_defstruct_balancing_tactician_data", "VISIT-DEFSTRUCT-BALANCING-TACTICIAN-DATA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "visit_defstruct_object_balancing_tactician_data_method", "VISIT-DEFSTRUCT-OBJECT-BALANCING-TACTICIAN-DATA-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_p", "BALANCING-TACTICIAN-P", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "do_balancing_tactician_substrategies", "DO-BALANCING-TACTICIAN-SUBSTRATEGIES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "do_balancing_tactician_spineful_substrategies", "DO-BALANCING-TACTICIAN-SPINEFUL-SUBSTRATEGIES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "new_balancing_tactician_data", "NEW-BALANCING-TACTICIAN-DATA", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_initialize", "BALANCING-TACTICIAN-INITIALIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "new_balancing_tactician_data_from_inference", "NEW-BALANCING-TACTICIAN-DATA-FROM-INFERENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_new_root_substrategy", "BALANCING-TACTICIAN-NEW-ROOT-SUBSTRATEGY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_transformation_substrategy", "BALANCING-TACTICIAN-TRANSFORMATION-SUBSTRATEGY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_removal_substrategies", "BALANCING-TACTICIAN-REMOVAL-SUBSTRATEGIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_sole_removal_substrategy", "BALANCING-TACTICIAN-SOLE-REMOVAL-SUBSTRATEGY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_all_substrategies", "BALANCING-TACTICIAN-ALL-SUBSTRATEGIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_problem_motivated_wrt_nP", "BALANCING-TACTICIAN-PROBLEM-MOTIVATED-WRT-N?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_problem_motivated_wrt_rP", "BALANCING-TACTICIAN-PROBLEM-MOTIVATED-WRT-R?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_problem_motivated_wrt_tP", "BALANCING-TACTICIAN-PROBLEM-MOTIVATED-WRT-T?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_link_head_motivated_wrt_rP", "BALANCING-TACTICIAN-LINK-HEAD-MOTIVATED-WRT-R?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_substrategy_p", "BALANCING-TACTICIAN-SUBSTRATEGY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_proper_substrategy_p", "BALANCING-TACTICIAN-PROPER-SUBSTRATEGY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_spineless_substrategy_p", "BALANCING-TACTICIAN-SPINELESS-SUBSTRATEGY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_doneP", "BALANCING-TACTICIAN-DONE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_do_one_step", "BALANCING-TACTICIAN-DO-ONE-STEP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_do_one_step_int", "BALANCING-TACTICIAN-DO-ONE-STEP-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_should_reconsider_set_asidesP", "BALANCING-TACTICIAN-SHOULD-RECONSIDER-SET-ASIDES?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_reconsider_set_asides", "BALANCING-TACTICIAN-RECONSIDER-SET-ASIDES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "substrategy_do_one_step_interestingness", "SUBSTRATEGY-DO-ONE-STEP-INTERESTINGNESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_continuation_possibleP", "BALANCING-TACTICIAN-CONTINUATION-POSSIBLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_chooses_to_throw_away_problemP", "BALANCING-TACTICIAN-CHOOSES-TO-THROW-AWAY-PROBLEM?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_chooses_to_set_aside_problemP", "BALANCING-TACTICIAN-CHOOSES-TO-SET-ASIDE-PROBLEM?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_chooses_to_throw_away_tacticP", "BALANCING-TACTICIAN-CHOOSES-TO-THROW-AWAY-TACTIC?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_chooses_to_set_aside_tacticP", "BALANCING-TACTICIAN-CHOOSES-TO-SET-ASIDE-TACTIC?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_throw_away_uninteresting_set_asides", "BALANCING-TACTICIAN-THROW-AWAY-UNINTERESTING-SET-ASIDES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_note_inference_dynamic_properties_updated", "BALANCING-TACTICIAN-NOTE-INFERENCE-DYNAMIC-PROPERTIES-UPDATED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_initialize_properties", "BALANCING-TACTICIAN-INITIALIZE-PROPERTIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_update_properties", "BALANCING-TACTICIAN-UPDATE-PROPERTIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_initial_relevant_strategies", "BALANCING-TACTICIAN-INITIAL-RELEVANT-STRATEGIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_possibly_activate_problem", "BALANCING-TACTICIAN-POSSIBLY-ACTIVATE-PROBLEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_problem_is_the_rest_of_an_early_removalP", "BALANCING-TACTICIAN-PROBLEM-IS-THE-REST-OF-AN-EARLY-REMOVAL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_chooses_to_propagate_new_root_motivation_to_restricted_non_focal_problemP", "BALANCING-TACTICIAN-CHOOSES-TO-PROPAGATE-NEW-ROOT-MOTIVATION-TO-RESTRICTED-NON-FOCAL-PROBLEM?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_treats_restricted_non_focal_as_new_rootP", "BALANCING-TACTICIAN-TREATS-RESTRICTED-NON-FOCAL-AS-NEW-ROOT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_early_removal_linkP", "BALANCING-TACTICIAN-EARLY-REMOVAL-LINK?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "substrategy_connected_conjunction_link_motivatedP", "SUBSTRATEGY-CONNECTED-CONJUNCTION-LINK-MOTIVATED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_problem_is_the_result_of_a_simplificationP", "BALANCING-TACTICIAN-PROBLEM-IS-THE-RESULT-OF-A-SIMPLIFICATION?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_note_argument_link", "BALANCING-TACTICIAN-NOTE-ARGUMENT-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_early_removal_productivity_limit", "BALANCING-TACTICIAN-EARLY-REMOVAL-PRODUCTIVITY-LIMIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_substrategy_strategem_motivated", "BALANCING-TACTICIAN-SUBSTRATEGY-STRATEGEM-MOTIVATED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_substrategy_problem_motivated", "BALANCING-TACTICIAN-SUBSTRATEGY-PROBLEM-MOTIVATED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_substrategy_link_motivated", "BALANCING-TACTICIAN-SUBSTRATEGY-LINK-MOTIVATED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_chooses_to_make_d_a_new_rootP", "BALANCING-TACTICIAN-CHOOSES-TO-MAKE-D-A-NEW-ROOT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_residual_conjunction_new_root_candidates", "BALANCING-TACTICIAN-RESIDUAL-CONJUNCTION-NEW-ROOT-CANDIDATES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_transformation_new_root_candidates", "BALANCING-TACTICIAN-TRANSFORMATION-NEW-ROOT-CANDIDATES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_possibly_make_new_root", "BALANCING-TACTICIAN-POSSIBLY-MAKE-NEW-ROOT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_substrategy_tactic_motivated", "BALANCING-TACTICIAN-SUBSTRATEGY-TACTIC-MOTIVATED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_substrategy_connected_conjunction_tactic_motivated", "BALANCING-TACTICIAN-SUBSTRATEGY-CONNECTED-CONJUNCTION-TACTIC-MOTIVATED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_possibly_motivate_new_root_via_residual_transformation_link", "BALANCING-TACTICIAN-POSSIBLY-MOTIVATE-NEW-ROOT-VIA-RESIDUAL-TRANSFORMATION-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_substrategy_split_tactic_motivated", "BALANCING-TACTICIAN-SUBSTRATEGY-SPLIT-TACTIC-MOTIVATED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_possibly_propagate_new_root_motivation_down_split_link", "BALANCING-TACTICIAN-POSSIBLY-PROPAGATE-NEW-ROOT-MOTIVATION-DOWN-SPLIT-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_substrategy_union_tactic_motivated", "BALANCING-TACTICIAN-SUBSTRATEGY-UNION-TACTIC-MOTIVATED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_possibly_propagate_new_root_motivation_down_union_link", "BALANCING-TACTICIAN-POSSIBLY-PROPAGATE-NEW-ROOT-MOTIVATION-DOWN-UNION-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_allows_split_tactic_to_be_set_aside_wrt_removalP", "BALANCING-TACTICIAN-ALLOWS-SPLIT-TACTIC-TO-BE-SET-ASIDE-WRT-REMOVAL?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_chooses_to_totally_throw_away_tacticP", "BALANCING-TACTICIAN-CHOOSES-TO-TOTALLY-THROW-AWAY-TACTIC?", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_substrategy_problem_status_change", "BALANCING-TACTICIAN-SUBSTRATEGY-PROBLEM-STATUS-CHANGE", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_recompute_problem_status", "BALANCING-TACTICIAN-RECOMPUTE-PROBLEM-STATUS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_possibly_propagate_strategic_status_to_tactical_status", "BALANCING-TACTICIAN-POSSIBLY-PROPAGATE-STRATEGIC-STATUS-TO-TACTICAL-STATUS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_make_problem_no_good", "BALANCING-TACTICIAN-MAKE-PROBLEM-NO-GOOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.balancing_tactician", "balancing_tactician_make_problem_pending", "BALANCING-TACTICIAN-MAKE-PROBLEM-PENDING", 2, 0, false);
        return (SubLObject)balancing_tactician.NIL;
    }
    
    public static SubLObject init_balancing_tactician_file() {
        balancing_tactician.$dtp_balancing_tactician_data$ = SubLFiles.defconstant("*DTP-BALANCING-TACTICIAN-DATA*", (SubLObject)balancing_tactician.$sym2$BALANCING_TACTICIAN_DATA);
        balancing_tactician.$balancing_tactician_early_removal_productivity_limit$ = SubLFiles.defvar("*BALANCING-TACTICIAN-EARLY-REMOVAL-PRODUCTIVITY-LIMIT*", inference_datastructures_enumerated_types.productivity_for_number_of_children(backward.$transformation_early_removal_threshold$.getDynamicValue()));
        balancing_tactician.$balancing_tactician_self_looping_rule_fix_enabledP$ = SubLFiles.defparameter("*BALANCING-TACTICIAN-SELF-LOOPING-RULE-FIX-ENABLED?*", (SubLObject)balancing_tactician.T);
        balancing_tactician.$balancing_tactician_new_roots_check_for_t_on_jo_linkP$ = SubLFiles.defvar("*BALANCING-TACTICIAN-NEW-ROOTS-CHECK-FOR-T-ON-JO-LINK?*", (SubLObject)balancing_tactician.T);
        balancing_tactician.$balancing_tactician_new_roots_triggered_by_t_on_jo_linkP$ = SubLFiles.defparameter("*BALANCING-TACTICIAN-NEW-ROOTS-TRIGGERED-BY-T-ON-JO-LINK?*", (SubLObject)balancing_tactician.T);
        balancing_tactician.$balancing_tactician_is_tactically_hardcoreP$ = SubLFiles.defparameter("*BALANCING-TACTICIAN-IS-TACTICALLY-HARDCORE?*", (SubLObject)balancing_tactician.NIL);
        return (SubLObject)balancing_tactician.NIL;
    }
    
    public static SubLObject setup_balancing_tactician_file() {
        inference_tactician.inference_strategy_type((SubLObject)balancing_tactician.$kw0$BALANCING, (SubLObject)balancing_tactician.$list1);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), balancing_tactician.$dtp_balancing_tactician_data$.getGlobalValue(), Symbols.symbol_function((SubLObject)balancing_tactician.$sym9$BALANCING_TACTICIAN_DATA_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)balancing_tactician.$list10);
        Structures.def_csetf((SubLObject)balancing_tactician.$sym11$BAL_TAC_DATA_NEW_ROOT_SUBSTRATEGY, (SubLObject)balancing_tactician.$sym12$_CSETF_BAL_TAC_DATA_NEW_ROOT_SUBSTRATEGY);
        Structures.def_csetf((SubLObject)balancing_tactician.$sym13$BAL_TAC_DATA_TRANSFORMATION_SUBSTRATEGY, (SubLObject)balancing_tactician.$sym14$_CSETF_BAL_TAC_DATA_TRANSFORMATION_SUBSTRATEGY);
        Structures.def_csetf((SubLObject)balancing_tactician.$sym15$BAL_TAC_DATA_REMOVAL_SUBSTRATEGIES, (SubLObject)balancing_tactician.$sym16$_CSETF_BAL_TAC_DATA_REMOVAL_SUBSTRATEGIES);
        Equality.identity((SubLObject)balancing_tactician.$sym2$BALANCING_TACTICIAN_DATA);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), balancing_tactician.$dtp_balancing_tactician_data$.getGlobalValue(), Symbols.symbol_function((SubLObject)balancing_tactician.$sym25$VISIT_DEFSTRUCT_OBJECT_BALANCING_TACTICIAN_DATA_METHOD));
        utilities_macros.note_funcall_helper_function((SubLObject)balancing_tactician.$sym36$BALANCING_TACTICIAN_INITIALIZE);
        utilities_macros.note_funcall_helper_function((SubLObject)balancing_tactician.$sym41$BALANCING_TACTICIAN_DONE_);
        utilities_macros.note_funcall_helper_function((SubLObject)balancing_tactician.$sym43$BALANCING_TACTICIAN_DO_ONE_STEP);
        utilities_macros.note_funcall_helper_function((SubLObject)balancing_tactician.$sym49$BALANCING_TACTICIAN_CONTINUATION_POSSIBLE_);
        utilities_macros.note_funcall_helper_function((SubLObject)balancing_tactician.$sym50$BALANCING_TACTICIAN_CHOOSES_TO_THROW_AWAY_PROBLEM_);
        utilities_macros.note_funcall_helper_function((SubLObject)balancing_tactician.$sym51$BALANCING_TACTICIAN_CHOOSES_TO_SET_ASIDE_PROBLEM_);
        utilities_macros.note_funcall_helper_function((SubLObject)balancing_tactician.$sym52$BALANCING_TACTICIAN_CHOOSES_TO_THROW_AWAY_TACTIC_);
        utilities_macros.note_funcall_helper_function((SubLObject)balancing_tactician.$sym53$BALANCING_TACTICIAN_CHOOSES_TO_SET_ASIDE_TACTIC_);
        utilities_macros.note_funcall_helper_function((SubLObject)balancing_tactician.$sym54$BALANCING_TACTICIAN_THROW_AWAY_UNINTERESTING_SET_ASIDES);
        utilities_macros.note_funcall_helper_function((SubLObject)balancing_tactician.$sym55$BALANCING_TACTICIAN_NOTE_INFERENCE_DYNAMIC_PROPERTIES_UPDATED);
        utilities_macros.note_funcall_helper_function((SubLObject)balancing_tactician.$sym56$BALANCING_TACTICIAN_INITIALIZE_PROPERTIES);
        utilities_macros.note_funcall_helper_function((SubLObject)balancing_tactician.$sym57$BALANCING_TACTICIAN_UPDATE_PROPERTIES);
        utilities_macros.note_funcall_helper_function((SubLObject)balancing_tactician.$sym58$BALANCING_TACTICIAN_INITIAL_RELEVANT_STRATEGIES);
        utilities_macros.note_funcall_helper_function((SubLObject)balancing_tactician.$sym59$BALANCING_TACTICIAN_POSSIBLY_ACTIVATE_PROBLEM);
        utilities_macros.note_funcall_helper_function((SubLObject)balancing_tactician.$sym65$BALANCING_TACTICIAN_NOTE_ARGUMENT_LINK);
        utilities_macros.note_funcall_helper_function((SubLObject)balancing_tactician.$sym66$BALANCING_TACTICIAN_EARLY_REMOVAL_PRODUCTIVITY_LIMIT);
        utilities_macros.note_funcall_helper_function((SubLObject)balancing_tactician.$sym67$BALANCING_TACTICIAN_SUBSTRATEGY_STRATEGEM_MOTIVATED);
        utilities_macros.note_funcall_helper_function((SubLObject)balancing_tactician.$sym75$BALANCING_TACTICIAN_ALLOWS_SPLIT_TACTIC_TO_BE_SET_ASIDE_WRT_REMOV);
        utilities_macros.note_funcall_helper_function((SubLObject)balancing_tactician.$sym76$BALANCING_TACTICIAN_CHOOSES_TO_TOTALLY_THROW_AWAY_TACTIC_);
        utilities_macros.note_funcall_helper_function((SubLObject)balancing_tactician.$sym78$BALANCING_TACTICIAN_SUBSTRATEGY_PROBLEM_STATUS_CHANGE);
        return (SubLObject)balancing_tactician.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_balancing_tactician_file();
    }
    
    @Override
	public void initializeVariables() {
        init_balancing_tactician_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_balancing_tactician_file();
    }
    
    static {
        me = (SubLFile)new balancing_tactician();
        balancing_tactician.$dtp_balancing_tactician_data$ = null;
        balancing_tactician.$balancing_tactician_early_removal_productivity_limit$ = null;
        balancing_tactician.$balancing_tactician_self_looping_rule_fix_enabledP$ = null;
        balancing_tactician.$balancing_tactician_new_roots_check_for_t_on_jo_linkP$ = null;
        balancing_tactician.$balancing_tactician_new_roots_triggered_by_t_on_jo_linkP$ = null;
        balancing_tactician.$balancing_tactician_is_tactically_hardcoreP$ = null;
        $kw0$BALANCING = SubLObjectFactory.makeKeyword("BALANCING");
        $list1 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("Balancing Tactician"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeString("A balancing tactician type which delegates to a new-root tactician,\n a transformation tactician, and a single removal tactician."), SubLObjectFactory.makeKeyword("CONSTRUCTOR"), SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-INITIALIZE"), SubLObjectFactory.makeKeyword("DONE?"), SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-DONE?"), SubLObjectFactory.makeKeyword("DO-ONE-STEP"), SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-DO-ONE-STEP"), SubLObjectFactory.makeKeyword("INITIAL-RELEVANT-STRATEGIES"), SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-INITIAL-RELEVANT-STRATEGIES"), SubLObjectFactory.makeKeyword("INITIALIZE-PROPERTIES"), SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-INITIALIZE-PROPERTIES"), SubLObjectFactory.makeKeyword("UPDATE-PROPERTIES"), SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-UPDATE-PROPERTIES"), SubLObjectFactory.makeKeyword("INFERENCE-DYNAMIC-PROPERTIES-UPDATED"), SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-NOTE-INFERENCE-DYNAMIC-PROPERTIES-UPDATED"), SubLObjectFactory.makeKeyword("CONTINUATION-POSSIBLE?"), SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-CONTINUATION-POSSIBLE?"), SubLObjectFactory.makeKeyword("THROW-AWAY-UNINTERESTING-SET-ASIDES"), SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-THROW-AWAY-UNINTERESTING-SET-ASIDES"), SubLObjectFactory.makeKeyword("EARLY-REMOVAL-PRODUCTIVITY-LIMIT"), SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-EARLY-REMOVAL-PRODUCTIVITY-LIMIT"), SubLObjectFactory.makeKeyword("POSSIBLY-ACTIVATE-PROBLEM"), SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-POSSIBLY-ACTIVATE-PROBLEM"), SubLObjectFactory.makeKeyword("THROW-AWAY-PROBLEM"), SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-CHOOSES-TO-THROW-AWAY-PROBLEM?"), SubLObjectFactory.makeKeyword("SET-ASIDE-PROBLEM"), SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-CHOOSES-TO-SET-ASIDE-PROBLEM?"), SubLObjectFactory.makeKeyword("THROW-AWAY-TACTIC"), SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-CHOOSES-TO-THROW-AWAY-TACTIC?"), SubLObjectFactory.makeKeyword("SET-ASIDE-TACTIC"), SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-CHOOSES-TO-SET-ASIDE-TACTIC?"), SubLObjectFactory.makeKeyword("NEW-ARGUMENT-LINK"), SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-NOTE-ARGUMENT-LINK"), SubLObjectFactory.makeKeyword("NEW-TACTIC"), SubLObjectFactory.makeSymbol("IGNORE"), SubLObjectFactory.makeKeyword("SPLIT-TACTICS-POSSIBLE"), SubLObjectFactory.makeSymbol("IGNORE"), SubLObjectFactory.makeKeyword("PROBLEM-COULD-BE-PENDING"), SubLObjectFactory.makeSymbol("IGNORE"), SubLObjectFactory.makeKeyword("LINK-HEAD-MOTIVATED?"), SubLObjectFactory.makeSymbol("FALSE"), SubLObjectFactory.makeKeyword("PROBLEM-NOTHING-TO-DO?"), SubLObjectFactory.makeSymbol("FALSE"), SubLObjectFactory.makeKeyword("SUBSTRATEGY-STRATEGEM-MOTIVATED"), SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-SUBSTRATEGY-STRATEGEM-MOTIVATED"), SubLObjectFactory.makeKeyword("SUBSTRATEGY-TOTALLY-THROW-AWAY-TACTIC"), SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-CHOOSES-TO-TOTALLY-THROW-AWAY-TACTIC?"), SubLObjectFactory.makeKeyword("SUBSTRATEGY-ALLOW-SPLIT-TACTIC-SET-ASIDE-WRT-REMOVAL"), SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-ALLOWS-SPLIT-TACTIC-TO-BE-SET-ASIDE-WRT-REMOVAL?"), SubLObjectFactory.makeKeyword("SUBSTRATEGY-PROBLEM-STATUS-CHANGE"), SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-SUBSTRATEGY-PROBLEM-STATUS-CHANGE") });
        $sym2$BALANCING_TACTICIAN_DATA = SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-DATA");
        $sym3$BALANCING_TACTICIAN_DATA_P = SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-DATA-P");
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ROOT-SUBSTRATEGY"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSFORMATION-SUBSTRATEGY"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-SUBSTRATEGIES"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NEW-ROOT-SUBSTRATEGY"), (SubLObject)SubLObjectFactory.makeKeyword("TRANSFORMATION-SUBSTRATEGY"), (SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-SUBSTRATEGIES"));
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BAL-TAC-DATA-NEW-ROOT-SUBSTRATEGY"), (SubLObject)SubLObjectFactory.makeSymbol("BAL-TAC-DATA-TRANSFORMATION-SUBSTRATEGY"), (SubLObject)SubLObjectFactory.makeSymbol("BAL-TAC-DATA-REMOVAL-SUBSTRATEGIES"));
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-BAL-TAC-DATA-NEW-ROOT-SUBSTRATEGY"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-BAL-TAC-DATA-TRANSFORMATION-SUBSTRATEGY"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-BAL-TAC-DATA-REMOVAL-SUBSTRATEGIES"));
        $sym8$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym9$BALANCING_TACTICIAN_DATA_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-DATA-PRINT-FUNCTION-TRAMPOLINE");
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-DATA-P"));
        $sym11$BAL_TAC_DATA_NEW_ROOT_SUBSTRATEGY = SubLObjectFactory.makeSymbol("BAL-TAC-DATA-NEW-ROOT-SUBSTRATEGY");
        $sym12$_CSETF_BAL_TAC_DATA_NEW_ROOT_SUBSTRATEGY = SubLObjectFactory.makeSymbol("_CSETF-BAL-TAC-DATA-NEW-ROOT-SUBSTRATEGY");
        $sym13$BAL_TAC_DATA_TRANSFORMATION_SUBSTRATEGY = SubLObjectFactory.makeSymbol("BAL-TAC-DATA-TRANSFORMATION-SUBSTRATEGY");
        $sym14$_CSETF_BAL_TAC_DATA_TRANSFORMATION_SUBSTRATEGY = SubLObjectFactory.makeSymbol("_CSETF-BAL-TAC-DATA-TRANSFORMATION-SUBSTRATEGY");
        $sym15$BAL_TAC_DATA_REMOVAL_SUBSTRATEGIES = SubLObjectFactory.makeSymbol("BAL-TAC-DATA-REMOVAL-SUBSTRATEGIES");
        $sym16$_CSETF_BAL_TAC_DATA_REMOVAL_SUBSTRATEGIES = SubLObjectFactory.makeSymbol("_CSETF-BAL-TAC-DATA-REMOVAL-SUBSTRATEGIES");
        $kw17$NEW_ROOT_SUBSTRATEGY = SubLObjectFactory.makeKeyword("NEW-ROOT-SUBSTRATEGY");
        $kw18$TRANSFORMATION_SUBSTRATEGY = SubLObjectFactory.makeKeyword("TRANSFORMATION-SUBSTRATEGY");
        $kw19$REMOVAL_SUBSTRATEGIES = SubLObjectFactory.makeKeyword("REMOVAL-SUBSTRATEGIES");
        $str20$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw21$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym22$MAKE_BALANCING_TACTICIAN_DATA = SubLObjectFactory.makeSymbol("MAKE-BALANCING-TACTICIAN-DATA");
        $kw23$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw24$END = SubLObjectFactory.makeKeyword("END");
        $sym25$VISIT_DEFSTRUCT_OBJECT_BALANCING_TACTICIAN_DATA_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-BALANCING-TACTICIAN-DATA-METHOD");
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BALANCING"), (SubLObject)SubLObjectFactory.makeKeyword("STRIPING"), (SubLObject)SubLObjectFactory.makeKeyword("ABDUCTIVE"));
        $list27 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBSTRATEGY-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("STRATEGY"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw29$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw30$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym31$CSOME = SubLObjectFactory.makeSymbol("CSOME");
        $sym32$BALANCING_TACTICIAN_ALL_SUBSTRATEGIES = SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-ALL-SUBSTRATEGIES");
        $sym33$DO_BALANCING_TACTICIAN_SUBSTRATEGIES = SubLObjectFactory.makeSymbol("DO-BALANCING-TACTICIAN-SUBSTRATEGIES");
        $sym34$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $sym35$BALANCING_TACTICIAN_SPINELESS_SUBSTRATEGY_P = SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-SPINELESS-SUBSTRATEGY-P");
        $sym36$BALANCING_TACTICIAN_INITIALIZE = SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-INITIALIZE");
        $kw37$NEW_ROOT = SubLObjectFactory.makeKeyword("NEW-ROOT");
        $kw38$TRANSFORMATION = SubLObjectFactory.makeKeyword("TRANSFORMATION");
        $kw39$REMOVAL = SubLObjectFactory.makeKeyword("REMOVAL");
        $sym40$BALANCING_TACTICIAN_P = SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-P");
        $sym41$BALANCING_TACTICIAN_DONE_ = SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-DONE?");
        $kw42$UNINTERESTING = SubLObjectFactory.makeKeyword("UNINTERESTING");
        $sym43$BALANCING_TACTICIAN_DO_ONE_STEP = SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-DO-ONE-STEP");
        $kw44$RECONSIDER_SET_ASIDES = SubLObjectFactory.makeKeyword("RECONSIDER-SET-ASIDES");
        $kw45$PROPAGATE_ANSWER_LINK = SubLObjectFactory.makeKeyword("PROPAGATE-ANSWER-LINK");
        $kw46$INTERESTING = SubLObjectFactory.makeKeyword("INTERESTING");
        $kw47$MOTIVATION = SubLObjectFactory.makeKeyword("MOTIVATION");
        $str48$_a_do_one_step___a__ = SubLObjectFactory.makeString("~a do-one-step: ~a~%");
        $sym49$BALANCING_TACTICIAN_CONTINUATION_POSSIBLE_ = SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-CONTINUATION-POSSIBLE?");
        $sym50$BALANCING_TACTICIAN_CHOOSES_TO_THROW_AWAY_PROBLEM_ = SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-CHOOSES-TO-THROW-AWAY-PROBLEM?");
        $sym51$BALANCING_TACTICIAN_CHOOSES_TO_SET_ASIDE_PROBLEM_ = SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-CHOOSES-TO-SET-ASIDE-PROBLEM?");
        $sym52$BALANCING_TACTICIAN_CHOOSES_TO_THROW_AWAY_TACTIC_ = SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-CHOOSES-TO-THROW-AWAY-TACTIC?");
        $sym53$BALANCING_TACTICIAN_CHOOSES_TO_SET_ASIDE_TACTIC_ = SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-CHOOSES-TO-SET-ASIDE-TACTIC?");
        $sym54$BALANCING_TACTICIAN_THROW_AWAY_UNINTERESTING_SET_ASIDES = SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-THROW-AWAY-UNINTERESTING-SET-ASIDES");
        $sym55$BALANCING_TACTICIAN_NOTE_INFERENCE_DYNAMIC_PROPERTIES_UPDATED = SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-NOTE-INFERENCE-DYNAMIC-PROPERTIES-UPDATED");
        $sym56$BALANCING_TACTICIAN_INITIALIZE_PROPERTIES = SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-INITIALIZE-PROPERTIES");
        $sym57$BALANCING_TACTICIAN_UPDATE_PROPERTIES = SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-UPDATE-PROPERTIES");
        $sym58$BALANCING_TACTICIAN_INITIAL_RELEVANT_STRATEGIES = SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-INITIAL-RELEVANT-STRATEGIES");
        $sym59$BALANCING_TACTICIAN_POSSIBLY_ACTIVATE_PROBLEM = SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-POSSIBLY-ACTIVATE-PROBLEM");
        $kw60$RESTRICTION = SubLObjectFactory.makeKeyword("RESTRICTION");
        $kw61$JOIN_ORDERED = SubLObjectFactory.makeKeyword("JOIN-ORDERED");
        $sym62$PROBLEM_LINK_P = SubLObjectFactory.makeSymbol("PROBLEM-LINK-P");
        $kw63$COMPLETE = SubLObjectFactory.makeKeyword("COMPLETE");
        $kw64$SIMPLIFICATION = SubLObjectFactory.makeKeyword("SIMPLIFICATION");
        $sym65$BALANCING_TACTICIAN_NOTE_ARGUMENT_LINK = SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-NOTE-ARGUMENT-LINK");
        $sym66$BALANCING_TACTICIAN_EARLY_REMOVAL_PRODUCTIVITY_LIMIT = SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-EARLY-REMOVAL-PRODUCTIVITY-LIMIT");
        $sym67$BALANCING_TACTICIAN_SUBSTRATEGY_STRATEGEM_MOTIVATED = SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-SUBSTRATEGY-STRATEGEM-MOTIVATED");
        $kw68$SPLIT = SubLObjectFactory.makeKeyword("SPLIT");
        $kw69$UNION = SubLObjectFactory.makeKeyword("UNION");
        $sym70$TRANSFORMATION_STRATEGY_P = SubLObjectFactory.makeSymbol("TRANSFORMATION-STRATEGY-P");
        $kw71$RESIDUAL_TRANSFORMATION = SubLObjectFactory.makeKeyword("RESIDUAL-TRANSFORMATION");
        $sym72$CONNECTED_CONJUNCTION_TACTIC_P = SubLObjectFactory.makeSymbol("CONNECTED-CONJUNCTION-TACTIC-P");
        $sym73$SPLIT_TACTIC_P = SubLObjectFactory.makeSymbol("SPLIT-TACTIC-P");
        $sym74$REMOVAL_STRATEGY_P = SubLObjectFactory.makeSymbol("REMOVAL-STRATEGY-P");
        $sym75$BALANCING_TACTICIAN_ALLOWS_SPLIT_TACTIC_TO_BE_SET_ASIDE_WRT_REMOV = SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-ALLOWS-SPLIT-TACTIC-TO-BE-SET-ASIDE-WRT-REMOVAL?");
        $sym76$BALANCING_TACTICIAN_CHOOSES_TO_TOTALLY_THROW_AWAY_TACTIC_ = SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-CHOOSES-TO-TOTALLY-THROW-AWAY-TACTIC?");
        $kw77$COMPLETE_REMOVAL_TACTIC_NO_GOOD = SubLObjectFactory.makeKeyword("COMPLETE-REMOVAL-TACTIC-NO-GOOD");
        $sym78$BALANCING_TACTICIAN_SUBSTRATEGY_PROBLEM_STATUS_CHANGE = SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-SUBSTRATEGY-PROBLEM-STATUS-CHANGE");
        $kw79$FINISHED = SubLObjectFactory.makeKeyword("FINISHED");
        $kw80$NO_GOOD = SubLObjectFactory.makeKeyword("NO-GOOD");
        $kw81$GOOD = SubLObjectFactory.makeKeyword("GOOD");
        $kw82$NEUTRAL = SubLObjectFactory.makeKeyword("NEUTRAL");
        $kw83$POSSIBLE = SubLObjectFactory.makeKeyword("POSSIBLE");
        $kw84$PENDING = SubLObjectFactory.makeKeyword("PENDING");
        $kw85$TACTICAL = SubLObjectFactory.makeKeyword("TACTICAL");
        $kw86$CONNECTED_CONJUNCTION = SubLObjectFactory.makeKeyword("CONNECTED-CONJUNCTION");
    }
    
    public static final class $balancing_tactician_data_native extends SubLStructNative
    {
        public SubLObject $new_root_substrategy;
        public SubLObject $transformation_substrategy;
        public SubLObject $removal_substrategies;
        private static final SubLStructDeclNative structDecl;
        
        public $balancing_tactician_data_native() {
            this.$new_root_substrategy = (SubLObject)CommonSymbols.NIL;
            this.$transformation_substrategy = (SubLObject)CommonSymbols.NIL;
            this.$removal_substrategies = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$balancing_tactician_data_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$new_root_substrategy;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$transformation_substrategy;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$removal_substrategies;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$new_root_substrategy = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$transformation_substrategy = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$removal_substrategies = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$balancing_tactician_data_native.class, balancing_tactician.$sym2$BALANCING_TACTICIAN_DATA, balancing_tactician.$sym3$BALANCING_TACTICIAN_DATA_P, balancing_tactician.$list4, balancing_tactician.$list5, new String[] { "$new_root_substrategy", "$transformation_substrategy", "$removal_substrategies" }, balancing_tactician.$list6, balancing_tactician.$list7, balancing_tactician.$sym8$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $balancing_tactician_data_p$UnaryFunction extends UnaryFunction
    {
        public $balancing_tactician_data_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("BALANCING-TACTICIAN-DATA-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return balancing_tactician.balancing_tactician_data_p(arg1);
        }
    }
}

/*

	Total time: 232 ms
	
*/