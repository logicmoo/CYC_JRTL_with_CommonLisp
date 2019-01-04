package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.clause_utilities;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.cycjava.cycl.set;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.dictionary;
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

public final class inference_worker_join extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_worker_join";
    public static final String myFingerPrint = "ee705e0de1f70499905065f678070bdeb8d30ba466df94af23aea7f4064116db";
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 1718L)
    public static SubLSymbol $dtp_join_link_data$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 16518L)
    private static SubLSymbol $join_module$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 21758L)
    private static SubLSymbol $join_productivity_scaling_factor$;
    private static final SubLSymbol $sym0$JOIN_LINK_DATA;
    private static final SubLSymbol $sym1$JOIN_LINK_DATA_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym7$JOIN_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$J_LINK_DATA_JOIN_VARS;
    private static final SubLSymbol $sym10$_CSETF_J_LINK_DATA_JOIN_VARS;
    private static final SubLSymbol $sym11$J_LINK_DATA_FIRST_PROOF_INDEX;
    private static final SubLSymbol $sym12$_CSETF_J_LINK_DATA_FIRST_PROOF_INDEX;
    private static final SubLSymbol $sym13$J_LINK_DATA_SECOND_PROOF_INDEX;
    private static final SubLSymbol $sym14$_CSETF_J_LINK_DATA_SECOND_PROOF_INDEX;
    private static final SubLSymbol $kw15$JOIN_VARS;
    private static final SubLSymbol $kw16$FIRST_PROOF_INDEX;
    private static final SubLSymbol $kw17$SECOND_PROOF_INDEX;
    private static final SubLString $str18$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw19$BEGIN;
    private static final SubLSymbol $sym20$MAKE_JOIN_LINK_DATA;
    private static final SubLSymbol $kw21$SLOT;
    private static final SubLSymbol $kw22$END;
    private static final SubLSymbol $sym23$VISIT_DEFSTRUCT_OBJECT_JOIN_LINK_DATA_METHOD;
    private static final SubLSymbol $kw24$JOIN;
    private static final SubLSymbol $sym25$MAPPED_PROBLEM_P;
    private static final SubLSymbol $kw26$FREE;
    private static final SubLList $list27;
    private static final SubLSymbol $sym28$INDEX;
    private static final SubLSymbol $sym29$PROOF_LIST_VAR;
    private static final SubLSymbol $sym30$CLET;
    private static final SubLSymbol $sym31$JOIN_LINK_FIRST_PROOF_INDEX;
    private static final SubLSymbol $sym32$DO_DICTIONARY;
    private static final SubLSymbol $sym33$DO_LIST;
    private static final SubLSymbol $sym34$INDEX;
    private static final SubLSymbol $sym35$PROOF_LIST_VAR;
    private static final SubLSymbol $sym36$JOIN_LINK_SECOND_PROOF_INDEX;
    private static final SubLSymbol $sym37$DO_JOIN_LINK_FIRST_PROOFS;
    private static final SubLSymbol $sym38$DO_JOIN_LINK_SECOND_PROOFS;
    private static final SubLString $str39$couldn_t_find_the_join_tactic_for;
    private static final SubLSymbol $sym40$JOIN_LINK_P;
    private static final SubLSymbol $sym41$PROOF_P;
    private static final SubLString $str42$_a_was_a_rejected_proof;
    private static final SubLSymbol $sym43$HL_VAR_;
    private static final SubLSymbol $sym44$VARIABLE_BINDING_VALUE;
    private static final SubLSymbol $kw45$SKIP;
    private static final SubLSymbol $kw46$NEG;
    private static final SubLSymbol $kw47$POS;
    private static final SubLSymbol $sym48$SUBCLAUSE_SPEC_P;
    private static final SubLSymbol $sym49$JOIN_TACTIC_P;
    private static final SubLSymbol $sym50$STRATEGY_P;
    private static final SubLSymbol $kw51$TACTICAL;
    private static final SubLSymbol $kw52$DOOMED;
    private static final SubLSymbol $sym53$STRATEGIC_CONTEXT_P;
    private static final SubLSymbol $kw54$DISPREFERRED;
    private static final SubLString $str55$TVA_POS;
    private static final SubLSymbol $kw56$GROSSLY_DISPREFERRED;
    private static final SubLString $str57$DOUBLE_TVA_POS;
    private static final SubLString $str58$first_problem__;
    private static final SubLString $str59$second_problem__;
    private static final SubLString $str60$Join_tactics_like__a_must_only_ap;
    private static final SubLSymbol $sym61$PROOF_PROVEN_;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 1718L)
    public static SubLObject join_link_data_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)inference_worker_join.ZERO_INTEGER);
        return (SubLObject)inference_worker_join.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 1718L)
    public static SubLObject join_link_data_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $join_link_data_native.class) ? inference_worker_join.T : inference_worker_join.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 1718L)
    public static SubLObject j_link_data_join_vars(final SubLObject v_object) {
        assert inference_worker_join.NIL != join_link_data_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 1718L)
    public static SubLObject j_link_data_first_proof_index(final SubLObject v_object) {
        assert inference_worker_join.NIL != join_link_data_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 1718L)
    public static SubLObject j_link_data_second_proof_index(final SubLObject v_object) {
        assert inference_worker_join.NIL != join_link_data_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 1718L)
    public static SubLObject _csetf_j_link_data_join_vars(final SubLObject v_object, final SubLObject value) {
        assert inference_worker_join.NIL != join_link_data_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 1718L)
    public static SubLObject _csetf_j_link_data_first_proof_index(final SubLObject v_object, final SubLObject value) {
        assert inference_worker_join.NIL != join_link_data_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 1718L)
    public static SubLObject _csetf_j_link_data_second_proof_index(final SubLObject v_object, final SubLObject value) {
        assert inference_worker_join.NIL != join_link_data_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 1718L)
    public static SubLObject make_join_link_data(SubLObject arglist) {
        if (arglist == inference_worker_join.UNPROVIDED) {
            arglist = (SubLObject)inference_worker_join.NIL;
        }
        final SubLObject v_new = (SubLObject)new $join_link_data_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)inference_worker_join.NIL, next = arglist; inference_worker_join.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)inference_worker_join.$kw15$JOIN_VARS)) {
                _csetf_j_link_data_join_vars(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_worker_join.$kw16$FIRST_PROOF_INDEX)) {
                _csetf_j_link_data_first_proof_index(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_worker_join.$kw17$SECOND_PROOF_INDEX)) {
                _csetf_j_link_data_second_proof_index(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)inference_worker_join.$str18$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 1718L)
    public static SubLObject visit_defstruct_join_link_data(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_worker_join.$kw19$BEGIN, (SubLObject)inference_worker_join.$sym20$MAKE_JOIN_LINK_DATA, (SubLObject)inference_worker_join.THREE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_worker_join.$kw21$SLOT, (SubLObject)inference_worker_join.$kw15$JOIN_VARS, j_link_data_join_vars(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_worker_join.$kw21$SLOT, (SubLObject)inference_worker_join.$kw16$FIRST_PROOF_INDEX, j_link_data_first_proof_index(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_worker_join.$kw21$SLOT, (SubLObject)inference_worker_join.$kw17$SECOND_PROOF_INDEX, j_link_data_second_proof_index(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_worker_join.$kw22$END, (SubLObject)inference_worker_join.$sym20$MAKE_JOIN_LINK_DATA, (SubLObject)inference_worker_join.THREE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 1718L)
    public static SubLObject visit_defstruct_object_join_link_data_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_join_link_data(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 2404L)
    public static SubLObject valid_join_link_data_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker_join.NIL != join_link_data_p(v_object) && inference_worker_join.NIL != dictionary.dictionary_p(j_link_data_first_proof_index(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 2570L)
    public static SubLObject new_join_link_data(final SubLObject first_mapped_problem, final SubLObject second_mapped_problem) {
        final SubLObject data = make_join_link_data((SubLObject)inference_worker_join.UNPROVIDED);
        _csetf_j_link_data_join_vars(data, shared_sibling_vars(first_mapped_problem, second_mapped_problem));
        _csetf_j_link_data_first_proof_index(data, dictionary.new_dictionary(Symbols.symbol_function((SubLObject)inference_worker_join.EQUAL), (SubLObject)inference_worker_join.UNPROVIDED));
        _csetf_j_link_data_second_proof_index(data, dictionary.new_dictionary(Symbols.symbol_function((SubLObject)inference_worker_join.EQUAL), (SubLObject)inference_worker_join.UNPROVIDED));
        return data;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 3222L)
    public static SubLObject join_link_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker_join.NIL != inference_datastructures_problem_link.problem_link_p(v_object) && inference_worker_join.$kw24$JOIN == inference_datastructures_problem_link.problem_link_type(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 3397L)
    public static SubLObject maybe_new_join_link(final SubLObject supported_problem, final SubLObject first_supporting_mapped_problem, final SubLObject second_supporting_mapped_problem) {
        final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(supported_problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject candidate_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker_join.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker_join.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            candidate_link = set_contents.do_set_contents_next(basis_object, state);
            if (inference_worker_join.NIL != set_contents.do_set_contents_element_validP(state, candidate_link) && inference_worker_join.NIL != inference_datastructures_problem_link.problem_link_has_typeP(candidate_link, (SubLObject)inference_worker_join.$kw24$JOIN) && inference_worker_join.NIL != inference_datastructures_problem_link.mapped_problem_equal(first_supporting_mapped_problem, join_link_first_mapped_problem(candidate_link)) && inference_worker_join.NIL != inference_datastructures_problem_link.mapped_problem_equal(second_supporting_mapped_problem, join_link_second_mapped_problem(candidate_link))) {
                return candidate_link;
            }
        }
        return new_join_link(supported_problem, first_supporting_mapped_problem, second_supporting_mapped_problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 4067L)
    public static SubLObject new_join_link(final SubLObject supported_problem, final SubLObject first_supporting_mapped_problem, final SubLObject second_supporting_mapped_problem) {
        assert inference_worker_join.NIL != inference_datastructures_problem_link.mapped_problem_p(first_supporting_mapped_problem) : first_supporting_mapped_problem;
        assert inference_worker_join.NIL != inference_datastructures_problem_link.mapped_problem_p(second_supporting_mapped_problem) : second_supporting_mapped_problem;
        final SubLObject link = inference_datastructures_problem_link.new_problem_link((SubLObject)inference_worker_join.$kw24$JOIN, supported_problem);
        final SubLObject data = new_join_link_data(first_supporting_mapped_problem, second_supporting_mapped_problem);
        inference_datastructures_problem_link.set_problem_link_data(link, data);
        inference_datastructures_problem_link.connect_supporting_mapped_problem_with_dependent_link(second_supporting_mapped_problem, link);
        inference_datastructures_problem_link.connect_supporting_mapped_problem_with_dependent_link(first_supporting_mapped_problem, link);
        inference_worker.propagate_problem_link(link);
        return link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 4863L)
    public static SubLObject destroy_join_link(final SubLObject join_link) {
        final SubLObject tactic = join_link_tactic_int(join_link);
        if (inference_worker_join.NIL != inference_datastructures_tactic.valid_tactic_p(tactic)) {
            inference_datastructures_tactic.destroy_problem_tactic_and_backpointers(tactic);
        }
        final SubLObject data = inference_datastructures_problem_link.problem_link_data(join_link);
        if (inference_worker_join.NIL != valid_join_link_data_p(data)) {
            _csetf_j_link_data_join_vars(data, (SubLObject)inference_worker_join.$kw26$FREE);
            dictionary.clear_dictionary(j_link_data_first_proof_index(data));
            _csetf_j_link_data_first_proof_index(data, (SubLObject)inference_worker_join.$kw26$FREE);
            dictionary.clear_dictionary(j_link_data_second_proof_index(data));
            _csetf_j_link_data_second_proof_index(data, (SubLObject)inference_worker_join.$kw26$FREE);
        }
        return join_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 5510L)
    public static SubLObject do_join_link_first_proofs(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker_join.$list27);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject bindings_var = (SubLObject)inference_worker_join.NIL;
        SubLObject proof_var = (SubLObject)inference_worker_join.NIL;
        SubLObject join_link = (SubLObject)inference_worker_join.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker_join.$list27);
        bindings_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker_join.$list27);
        proof_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker_join.$list27);
        join_link = current.first();
        current = current.rest();
        if (inference_worker_join.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject index = (SubLObject)inference_worker_join.$sym28$INDEX;
            final SubLObject proof_list_var = (SubLObject)inference_worker_join.$sym29$PROOF_LIST_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)inference_worker_join.$sym30$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(index, (SubLObject)ConsesLow.list((SubLObject)inference_worker_join.$sym31$JOIN_LINK_FIRST_PROOF_INDEX, join_link))), (SubLObject)ConsesLow.list((SubLObject)inference_worker_join.$sym32$DO_DICTIONARY, (SubLObject)ConsesLow.list(bindings_var, proof_list_var, index), (SubLObject)ConsesLow.listS((SubLObject)inference_worker_join.$sym33$DO_LIST, (SubLObject)ConsesLow.list(proof_var, proof_list_var), ConsesLow.append(body, (SubLObject)inference_worker_join.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_worker_join.$list27);
        return (SubLObject)inference_worker_join.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 5847L)
    public static SubLObject do_join_link_second_proofs(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker_join.$list27);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject bindings_var = (SubLObject)inference_worker_join.NIL;
        SubLObject proof_var = (SubLObject)inference_worker_join.NIL;
        SubLObject join_link = (SubLObject)inference_worker_join.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker_join.$list27);
        bindings_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker_join.$list27);
        proof_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker_join.$list27);
        join_link = current.first();
        current = current.rest();
        if (inference_worker_join.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject index = (SubLObject)inference_worker_join.$sym34$INDEX;
            final SubLObject proof_list_var = (SubLObject)inference_worker_join.$sym35$PROOF_LIST_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)inference_worker_join.$sym30$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(index, (SubLObject)ConsesLow.list((SubLObject)inference_worker_join.$sym36$JOIN_LINK_SECOND_PROOF_INDEX, join_link))), (SubLObject)ConsesLow.list((SubLObject)inference_worker_join.$sym32$DO_DICTIONARY, (SubLObject)ConsesLow.list(bindings_var, proof_list_var, index), (SubLObject)ConsesLow.listS((SubLObject)inference_worker_join.$sym33$DO_LIST, (SubLObject)ConsesLow.list(proof_var, proof_list_var), ConsesLow.append(body, (SubLObject)inference_worker_join.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_worker_join.$list27);
        return (SubLObject)inference_worker_join.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 6172L)
    public static SubLObject join_link_join_vars(final SubLObject join_link) {
        return j_link_data_join_vars(inference_datastructures_problem_link.problem_link_data(join_link));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 6298L)
    public static SubLObject join_link_first_proof_index(final SubLObject join_link) {
        return j_link_data_first_proof_index(inference_datastructures_problem_link.problem_link_data(join_link));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 6468L)
    public static SubLObject join_link_second_proof_index(final SubLObject join_link) {
        return j_link_data_second_proof_index(inference_datastructures_problem_link.problem_link_data(join_link));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 6641L)
    public static SubLObject join_link_first_mapped_problem(final SubLObject join_link) {
        return inference_datastructures_problem_link.problem_link_supporting_mapped_problems(join_link).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 6798L)
    public static SubLObject join_link_second_mapped_problem(final SubLObject join_link) {
        return conses_high.second(inference_datastructures_problem_link.problem_link_supporting_mapped_problems(join_link));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 6931L)
    public static SubLObject join_link_first_problem(final SubLObject join_link) {
        return inference_datastructures_problem_link.mapped_problem_problem(join_link_first_mapped_problem(join_link));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 7063L)
    public static SubLObject join_link_second_problem(final SubLObject join_link) {
        return inference_datastructures_problem_link.mapped_problem_problem(join_link_second_mapped_problem(join_link));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 7197L)
    public static SubLObject join_link_trigger_variable_map(final SubLObject join_link, final SubLObject trigger_is_firstP) {
        return inference_datastructures_problem_link.mapped_problem_variable_map(join_link_trigger_mapped_problem(join_link, trigger_is_firstP));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 7378L)
    public static SubLObject join_link_trigger_mapped_problem(final SubLObject join_link, final SubLObject trigger_is_firstP) {
        return (inference_worker_join.NIL != trigger_is_firstP) ? join_link_first_mapped_problem(join_link) : join_link_second_mapped_problem(join_link);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 7588L)
    public static SubLObject join_link_sibling_mapped_problem(final SubLObject join_link, final SubLObject trigger_is_firstP) {
        return (inference_worker_join.NIL != trigger_is_firstP) ? join_link_second_mapped_problem(join_link) : join_link_first_mapped_problem(join_link);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 7798L)
    public static SubLObject join_link_first_proofs_lookup(final SubLObject join_link, final SubLObject proof_bindings) {
        final SubLObject index = join_link_first_proof_index(join_link);
        final SubLObject canonical_proof_bindings = inference_worker.canonicalize_proof_bindings(proof_bindings);
        final SubLObject first_proofs = dictionary.dictionary_lookup(index, canonical_proof_bindings, (SubLObject)inference_worker_join.UNPROVIDED);
        return first_proofs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 8100L)
    public static SubLObject join_link_second_proofs_lookup(final SubLObject join_link, final SubLObject proof_bindings) {
        final SubLObject index = join_link_second_proof_index(join_link);
        final SubLObject canonical_proof_bindings = inference_worker.canonicalize_proof_bindings(proof_bindings);
        final SubLObject second_proofs = dictionary.dictionary_lookup(index, canonical_proof_bindings, (SubLObject)inference_worker_join.UNPROVIDED);
        return second_proofs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 8405L)
    public static SubLObject join_link_sibling_proofs_lookup(final SubLObject join_link, final SubLObject trigger_proof_bindings_wrt_supported, final SubLObject trigger_is_firstP) {
        return (inference_worker_join.NIL != trigger_is_firstP) ? join_link_second_proofs_lookup(join_link, trigger_proof_bindings_wrt_supported) : join_link_first_proofs_lookup(join_link, trigger_proof_bindings_wrt_supported);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 8724L)
    public static SubLObject join_link_shared_proof_bindings(final SubLObject join_link, final SubLObject trigger_proof_bindings, final SubLObject trigger_is_firstP) {
        final SubLObject shared_supported_vars = join_link_join_vars(join_link);
        final SubLObject trigger_to_supported_variable_map = join_link_trigger_variable_map(join_link, trigger_is_firstP);
        final SubLObject trigger_proof_bindings_wrt_supported = bindings.transfer_variable_map_to_bindings_filtered(trigger_to_supported_variable_map, trigger_proof_bindings);
        final SubLObject shared_trigger_proof_bindings_wrt_supported = bindings.filter_bindings_by_variables(trigger_proof_bindings_wrt_supported, shared_supported_vars);
        return shared_trigger_proof_bindings_wrt_supported;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 9605L)
    public static SubLObject join_link_tactic(final SubLObject join_link) {
        final SubLObject join_tactic = join_link_tactic_int(join_link);
        if (inference_worker_join.NIL != join_tactic) {
            return join_tactic;
        }
        if (inference_worker_join.NIL == inference_datastructures_problem.tactically_unexamined_problem_p(inference_datastructures_problem_link.problem_link_supported_problem(join_link))) {
            return Errors.error((SubLObject)inference_worker_join.$str39$couldn_t_find_the_join_tactic_for, join_link);
        }
        return (SubLObject)inference_worker_join.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 9910L)
    public static SubLObject join_link_tactic_int(final SubLObject join_link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(join_link);
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(supported_problem);
        SubLObject join_tactic = (SubLObject)inference_worker_join.NIL;
        join_tactic = cdolist_list_var.first();
        while (inference_worker_join.NIL != cdolist_list_var) {
            if (inference_worker_join.NIL != inference_datastructures_problem.do_problem_tactics_hl_module_match(join_tactic, inference_worker_join.$join_module$.getDynamicValue(thread)) && join_link.eql(join_tactic_link(join_tactic))) {
                return join_tactic;
            }
            cdolist_list_var = cdolist_list_var.rest();
            join_tactic = cdolist_list_var.first();
        }
        return (SubLObject)inference_worker_join.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 10196L)
    public static SubLObject add_join_link_first_proof(final SubLObject join_link, final SubLObject v_bindings, final SubLObject proof) {
        assert inference_worker_join.NIL != join_link_p(join_link) : join_link;
        assert inference_worker_join.NIL != inference_datastructures_proof.proof_p(proof) : proof;
        final SubLObject index = join_link_first_proof_index(join_link);
        final SubLObject canonical_bindings = inference_worker.canonicalize_proof_bindings(v_bindings);
        dictionary_utilities.dictionary_push(index, canonical_bindings, proof);
        return join_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 10611L)
    public static SubLObject remove_join_link_first_proof(final SubLObject join_link, final SubLObject v_bindings, final SubLObject proof) {
        assert inference_worker_join.NIL != join_link_p(join_link) : join_link;
        assert inference_worker_join.NIL != inference_datastructures_proof.proof_p(proof) : proof;
        final SubLObject index = join_link_first_proof_index(join_link);
        final SubLObject canonical_bindings = inference_worker.canonicalize_proof_bindings(v_bindings);
        dictionary_utilities.dictionary_delete_from_value(index, canonical_bindings, proof, (SubLObject)inference_worker_join.UNPROVIDED, (SubLObject)inference_worker_join.UNPROVIDED);
        return join_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 11020L)
    public static SubLObject add_join_link_second_proof(final SubLObject join_link, final SubLObject v_bindings, final SubLObject proof) {
        assert inference_worker_join.NIL != join_link_p(join_link) : join_link;
        assert inference_worker_join.NIL != inference_datastructures_proof.proof_p(proof) : proof;
        final SubLObject index = join_link_second_proof_index(join_link);
        final SubLObject canonical_bindings = inference_worker.canonicalize_proof_bindings(v_bindings);
        dictionary_utilities.dictionary_push(index, canonical_bindings, proof);
        return join_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 11414L)
    public static SubLObject remove_join_link_second_proof(final SubLObject join_link, final SubLObject v_bindings, final SubLObject proof) {
        assert inference_worker_join.NIL != join_link_p(join_link) : join_link;
        assert inference_worker_join.NIL != inference_datastructures_proof.proof_p(proof) : proof;
        final SubLObject index = join_link_second_proof_index(join_link);
        final SubLObject canonical_bindings = inference_worker.canonicalize_proof_bindings(v_bindings);
        dictionary_utilities.dictionary_delete_from_value(index, canonical_bindings, proof, (SubLObject)inference_worker_join.UNPROVIDED, (SubLObject)inference_worker_join.UNPROVIDED);
        return join_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 11826L)
    public static SubLObject add_join_link_proof(final SubLObject join_link, final SubLObject trigger_proof, final SubLObject trigger_is_firstP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_worker_join.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && inference_worker_join.NIL == inference_datastructures_proof.proof_provenP(trigger_proof)) {
            Errors.error((SubLObject)inference_worker_join.$str42$_a_was_a_rejected_proof, trigger_proof);
        }
        final SubLObject shared_trigger_proof_bindings = join_link_shared_proof_bindings(join_link, inference_datastructures_proof.proof_bindings(trigger_proof), trigger_is_firstP);
        if (inference_worker_join.NIL != trigger_is_firstP) {
            add_join_link_first_proof(join_link, shared_trigger_proof_bindings, trigger_proof);
        }
        else {
            add_join_link_second_proof(join_link, shared_trigger_proof_bindings, trigger_proof);
        }
        return (SubLObject)inference_worker_join.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 12603L)
    public static SubLObject remove_join_link_proof_both_ways(final SubLObject join_link, final SubLObject proof, final SubLObject v_bindings) {
        remove_join_link_proof(join_link, proof, v_bindings, (SubLObject)inference_worker_join.T);
        remove_join_link_proof(join_link, proof, v_bindings, (SubLObject)inference_worker_join.NIL);
        return (SubLObject)inference_worker_join.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 12805L)
    public static SubLObject remove_join_link_proof(final SubLObject join_link, final SubLObject trigger_proof, final SubLObject trigger_proof_bindings, final SubLObject trigger_is_firstP) {
        final SubLObject shared_trigger_proof_bindings = join_link_shared_proof_bindings(join_link, trigger_proof_bindings, trigger_is_firstP);
        if (inference_worker_join.NIL != trigger_is_firstP) {
            remove_join_link_first_proof(join_link, shared_trigger_proof_bindings, trigger_proof);
        }
        else {
            remove_join_link_second_proof(join_link, shared_trigger_proof_bindings, trigger_proof);
        }
        return (SubLObject)inference_worker_join.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 13402L)
    public static SubLObject find_or_create_join_link_supporting_mapped_problems(final SubLObject store, final SubLObject dnf_clause, final SubLObject first_supporting_problem_spec, final SubLObject supported_problem) {
        final SubLObject first_mapped_query = inference_datastructures_problem_query.new_problem_query_from_subclause_spec(dnf_clause, first_supporting_problem_spec);
        final SubLObject second_mapped_query = inference_datastructures_problem_query.new_problem_query_without_subclause_spec(dnf_clause, first_supporting_problem_spec);
        final SubLObject first_mapped_query_vars = cycl_utilities.expression_gather(first_mapped_query, (SubLObject)inference_worker_join.$sym43$HL_VAR_, (SubLObject)inference_worker_join.UNPROVIDED, (SubLObject)inference_worker_join.UNPROVIDED, (SubLObject)inference_worker_join.UNPROVIDED, (SubLObject)inference_worker_join.UNPROVIDED);
        final SubLObject second_mapped_query_vars = cycl_utilities.expression_gather(second_mapped_query, (SubLObject)inference_worker_join.$sym43$HL_VAR_, (SubLObject)inference_worker_join.UNPROVIDED, (SubLObject)inference_worker_join.UNPROVIDED, (SubLObject)inference_worker_join.UNPROVIDED, (SubLObject)inference_worker_join.UNPROVIDED);
        final SubLObject free_hl_vars = (SubLObject)((inference_worker_join.NIL != inference_datastructures_problem_store.problem_store_allows_problem_hl_free_vars_optimizationP(store)) ? conses_high.union(inference_datastructures_problem.problem_free_hl_vars(supported_problem), conses_high.intersection(first_mapped_query_vars, second_mapped_query_vars, (SubLObject)inference_worker_join.UNPROVIDED, (SubLObject)inference_worker_join.UNPROVIDED), (SubLObject)inference_worker_join.UNPROVIDED, (SubLObject)inference_worker_join.UNPROVIDED) : inference_worker_join.NIL);
        final SubLObject first_mapped_query_free_vars = conses_high.intersection(free_hl_vars, first_mapped_query_vars, (SubLObject)inference_worker_join.UNPROVIDED, (SubLObject)inference_worker_join.UNPROVIDED);
        final SubLObject second_mapped_query_free_vars = conses_high.intersection(free_hl_vars, second_mapped_query_vars, (SubLObject)inference_worker_join.UNPROVIDED, (SubLObject)inference_worker_join.UNPROVIDED);
        final SubLObject first_mapped_problem = inference_worker.find_or_create_problem(store, first_mapped_query, first_mapped_query_free_vars, (SubLObject)inference_worker_join.UNPROVIDED);
        final SubLObject second_mapped_problem = inference_worker.find_or_create_problem(store, second_mapped_query, second_mapped_query_free_vars, (SubLObject)inference_worker_join.UNPROVIDED);
        return Values.values(first_mapped_problem, second_mapped_problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 14598L)
    public static SubLObject first_problem_shared_vars(final SubLObject first_mapped_problem, final SubLObject second_mapped_problem) {
        final SubLObject shared_sibling_vars = shared_sibling_vars(first_mapped_problem, second_mapped_problem);
        return bindings.apply_bindings_backwards(inference_datastructures_problem_link.mapped_problem_variable_map(first_mapped_problem), shared_sibling_vars);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 15093L)
    public static SubLObject second_problem_shared_vars(final SubLObject first_mapped_problem, final SubLObject second_mapped_problem) {
        final SubLObject shared_sibling_vars = shared_sibling_vars(first_mapped_problem, second_mapped_problem);
        return bindings.apply_bindings_backwards(inference_datastructures_problem_link.mapped_problem_variable_map(second_mapped_problem), shared_sibling_vars);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 15590L)
    public static SubLObject shared_sibling_vars(final SubLObject first_mapped_problem, final SubLObject second_mapped_problem) {
        SubLObject shared_vars = (SubLObject)inference_worker_join.NIL;
        final SubLObject first_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(first_mapped_problem);
        final SubLObject second_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(second_mapped_problem);
        SubLObject cdolist_list_var = first_variable_map;
        SubLObject variable_binding = (SubLObject)inference_worker_join.NIL;
        variable_binding = cdolist_list_var.first();
        while (inference_worker_join.NIL != cdolist_list_var) {
            final SubLObject supported_var = bindings.variable_binding_value(variable_binding);
            if (inference_worker_join.NIL != subl_promotions.memberP(supported_var, second_variable_map, Symbols.symbol_function((SubLObject)inference_worker_join.EQL), Symbols.symbol_function((SubLObject)inference_worker_join.$sym44$VARIABLE_BINDING_VALUE))) {
                shared_vars = (SubLObject)ConsesLow.cons(supported_var, shared_vars);
            }
            cdolist_list_var = cdolist_list_var.rest();
            variable_binding = cdolist_list_var.first();
        }
        return variables.sort_hl_variable_list(shared_vars);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 16638L)
    public static SubLObject join_tactic_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker_join.NIL != inference_datastructures_tactic.tactic_p(v_object) && inference_worker_join.$join_module$.getDynamicValue(thread).eql(inference_datastructures_tactic.tactic_hl_module(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 16776L)
    public static SubLObject new_join_tactic(final SubLObject join_link, final SubLObject first_supporting_problem_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(join_link);
        final SubLObject data = (SubLObject)ConsesLow.list(join_link, first_supporting_problem_spec);
        final SubLObject tactic = inference_datastructures_tactic.new_tactic(problem, inference_worker_join.$join_module$.getDynamicValue(thread), data);
        final SubLObject prob = problem;
        final SubLObject store = inference_datastructures_problem.problem_store(prob);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (inference_worker_join.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_worker_join.$kw45$SKIP)) {
            final SubLObject idx_$1 = idx;
            if (inference_worker_join.NIL == id_index.id_index_dense_objects_empty_p(idx_$1, (SubLObject)inference_worker_join.$kw45$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$1);
                final SubLObject backwardP_var = (SubLObject)inference_worker_join.NIL;
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
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_worker_join.NIL, v_iteration = (SubLObject)inference_worker_join.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_worker_join.ONE_INTEGER)) {
                    id = ((inference_worker_join.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_worker_join.ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (inference_worker_join.NIL == id_index.id_index_tombstone_p(inference) || inference_worker_join.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_worker_join.$kw45$SKIP)) {
                        if (inference_worker_join.NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = (SubLObject)inference_worker_join.$kw45$SKIP;
                        }
                        if (inference_worker_join.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference)) {
                            inference_var = inference;
                            set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                            set_contents_var = set.do_set_internal(set_var);
                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker_join.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker_join.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                strategy = set_contents.do_set_contents_next(basis_object, state);
                                if (inference_worker_join.NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                    inference_tactician.strategy_note_new_tactic(strategy, tactic);
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject idx_$2 = idx;
            if (inference_worker_join.NIL == id_index.id_index_sparse_objects_empty_p(idx_$2)) {
                final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$2);
                SubLObject id2 = (SubLObject)inference_worker_join.NIL;
                SubLObject inference2 = (SubLObject)inference_worker_join.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        if (inference_worker_join.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference2)) {
                            final SubLObject inference_var2 = inference2;
                            final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                            final SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject strategy2;
                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)inference_worker_join.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); inference_worker_join.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                if (inference_worker_join.NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
                                    inference_tactician.strategy_note_new_tactic(strategy2, tactic);
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
        return tactic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 17165L)
    public static SubLObject join_tactic_link(final SubLObject join_tactic) {
        return inference_datastructures_tactic.tactic_data(join_tactic).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 17393L)
    public static SubLObject join_tactic_first_supporting_problem_spec(final SubLObject tactic) {
        return conses_high.second(inference_datastructures_tactic.tactic_data(tactic));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 17531L)
    public static SubLObject join_tactic_first_problem(final SubLObject join_tactic) {
        final SubLObject link = join_tactic_link(join_tactic);
        if (inference_worker_join.NIL != link) {
            return join_link_first_problem(link);
        }
        return (SubLObject)inference_worker_join.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 17726L)
    public static SubLObject join_tactic_second_problem(final SubLObject join_tactic) {
        final SubLObject link = join_tactic_link(join_tactic);
        if (inference_worker_join.NIL != link) {
            return join_link_second_problem(link);
        }
        return (SubLObject)inference_worker_join.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 17909L)
    public static SubLObject join_tactic_lookahead_problems(final SubLObject join_tactic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject first_problem = join_tactic_first_problem(join_tactic);
        SubLObject second_problem = join_tactic_second_problem(join_tactic);
        if (inference_worker_join.NIL == first_problem || inference_worker_join.NIL == second_problem) {
            thread.resetMultipleValues();
            final SubLObject first_mapped_problem = find_or_create_join_tactic_supporting_mapped_problems(join_tactic);
            final SubLObject second_mapped_problem = thread.secondMultipleValue();
            thread.resetMultipleValues();
            first_problem = inference_datastructures_problem_link.mapped_problem_problem(first_mapped_problem);
            second_problem = inference_datastructures_problem_link.mapped_problem_problem(second_mapped_problem);
        }
        return Values.values(first_problem, second_problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 18532L)
    public static SubLObject determine_new_join_tactics(final SubLObject supported_problem, final SubLObject dnf_clause) {
        if (inference_worker_join.NIL != clause_utilities.binary_clause_p(dnf_clause) && inference_worker_join.NIL == inference_trampolines.inference_some_backchain_required_asent_in_clauseP(dnf_clause)) {
            SubLObject doneP = (SubLObject)inference_worker_join.NIL;
            SubLObject index = (SubLObject)inference_worker_join.ZERO_INTEGER;
            SubLObject cdolist_list_var = clauses.neg_lits(dnf_clause);
            SubLObject contextualized_asent = (SubLObject)inference_worker_join.NIL;
            contextualized_asent = cdolist_list_var.first();
            while (inference_worker_join.NIL != cdolist_list_var) {
                final SubLObject sense = (SubLObject)inference_worker_join.$kw46$NEG;
                if (inference_worker_join.NIL == doneP) {
                    final SubLObject first_supporting_problem_spec = clause_utilities.new_single_literal_subclause_spec(sense, index);
                    possibly_determine_new_join_tactic(supported_problem, first_supporting_problem_spec, dnf_clause);
                    doneP = (SubLObject)inference_worker_join.T;
                }
                index = Numbers.add(index, (SubLObject)inference_worker_join.ONE_INTEGER);
                cdolist_list_var = cdolist_list_var.rest();
                contextualized_asent = cdolist_list_var.first();
            }
            index = (SubLObject)inference_worker_join.ZERO_INTEGER;
            cdolist_list_var = clauses.pos_lits(dnf_clause);
            contextualized_asent = (SubLObject)inference_worker_join.NIL;
            contextualized_asent = cdolist_list_var.first();
            while (inference_worker_join.NIL != cdolist_list_var) {
                final SubLObject sense = (SubLObject)inference_worker_join.$kw47$POS;
                if (inference_worker_join.NIL == doneP) {
                    final SubLObject first_supporting_problem_spec = clause_utilities.new_single_literal_subclause_spec(sense, index);
                    possibly_determine_new_join_tactic(supported_problem, first_supporting_problem_spec, dnf_clause);
                    doneP = (SubLObject)inference_worker_join.T;
                }
                index = Numbers.add(index, (SubLObject)inference_worker_join.ONE_INTEGER);
                cdolist_list_var = cdolist_list_var.rest();
                contextualized_asent = cdolist_list_var.first();
            }
        }
        return (SubLObject)inference_worker_join.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 19617L)
    public static SubLObject possibly_determine_new_join_tactic(final SubLObject supported_problem, final SubLObject first_supporting_problem_spec, final SubLObject dnf_clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert inference_worker_join.NIL != clause_utilities.subclause_spec_p(first_supporting_problem_spec) : first_supporting_problem_spec;
        final SubLObject store = inference_datastructures_problem.problem_store(supported_problem);
        thread.resetMultipleValues();
        final SubLObject first_mapped_problem = find_or_create_join_link_supporting_mapped_problems(store, dnf_clause, first_supporting_problem_spec, supported_problem);
        final SubLObject second_mapped_problem = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject join_link = maybe_new_join_link(supported_problem, first_mapped_problem, second_mapped_problem);
        return new_join_tactic(join_link, first_supporting_problem_spec);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 20463L)
    public static SubLObject compute_strategic_properties_of_join_tactic(final SubLObject tactic, final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert inference_worker_join.NIL != join_tactic_p(tactic) : tactic;
        assert inference_worker_join.NIL != inference_datastructures_strategy.strategy_p(strategy) : strategy;
        final SubLObject join_link = join_tactic_link(tactic);
        final SubLObject first_mapped_problem = join_link_first_mapped_problem(join_link);
        final SubLObject second_mapped_problem = join_link_second_mapped_problem(join_link);
        if (inference_worker_join.NIL == preference_modules.preference_level_p(inference_datastructures_tactic.tactic_preference_level(tactic))) {
            thread.resetMultipleValues();
            final SubLObject preference_level = compute_join_tactic_preference_level(first_mapped_problem, second_mapped_problem, (SubLObject)inference_worker_join.$kw51$TACTICAL);
            final SubLObject justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            inference_datastructures_tactic.set_tactic_preference_level(tactic, preference_level, justification);
            if (inference_worker_join.$kw52$DOOMED == preference_level) {
                inference_worker.note_tactic_doomed(tactic, (SubLObject)inference_worker_join.$kw51$TACTICAL);
            }
        }
        thread.resetMultipleValues();
        final SubLObject preference_level = compute_join_tactic_preference_level(first_mapped_problem, second_mapped_problem, strategy);
        final SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        inference_datastructures_strategy.set_tactic_strategic_preference_level(tactic, strategy, preference_level, justification);
        if (inference_worker_join.$kw52$DOOMED == preference_level) {
            inference_worker.note_tactic_doomed(tactic, strategy);
        }
        final SubLObject productivity = compute_join_tactic_productivity(first_mapped_problem, second_mapped_problem, strategy);
        inference_datastructures_strategy.set_tactic_strategic_productivity(tactic, strategy, productivity);
        return tactic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 22028L)
    public static SubLObject compute_join_tactic_productivity(final SubLObject first_mapped_problem, final SubLObject second_mapped_problem, final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert inference_worker_join.NIL != inference_datastructures_problem_link.mapped_problem_p(first_mapped_problem) : first_mapped_problem;
        assert inference_worker_join.NIL != inference_datastructures_problem_link.mapped_problem_p(second_mapped_problem) : second_mapped_problem;
        assert inference_worker_join.NIL != inference_datastructures_strategy.strategy_p(strategy) : strategy;
        final SubLObject first_problem = inference_datastructures_problem_link.mapped_problem_problem(first_mapped_problem);
        final SubLObject second_problem = inference_datastructures_problem_link.mapped_problem_problem(second_mapped_problem);
        final SubLObject first_productivity = inference_lookahead_productivity.memoized_problem_max_removal_productivity(first_problem, strategy);
        final SubLObject second_productivity = inference_lookahead_productivity.memoized_problem_max_removal_productivity(second_problem, strategy);
        final SubLObject raw_join_productivity = inference_datastructures_enumerated_types.productivity_max(first_productivity, second_productivity);
        final SubLObject join_productivity = inference_datastructures_enumerated_types.productivity_divide_number(raw_join_productivity, inference_worker_join.$join_productivity_scaling_factor$.getDynamicValue(thread));
        return join_productivity;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 22930L)
    public static SubLObject compute_join_tactic_preference_level(final SubLObject first_mapped_problem, final SubLObject second_mapped_problem, final SubLObject strategic_context) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert inference_worker_join.NIL != inference_datastructures_problem_link.mapped_problem_p(first_mapped_problem) : first_mapped_problem;
        assert inference_worker_join.NIL != inference_datastructures_problem_link.mapped_problem_p(second_mapped_problem) : second_mapped_problem;
        assert inference_worker_join.NIL != inference_worker.strategic_context_p(strategic_context) : strategic_context;
        final SubLObject first_problem = inference_datastructures_problem_link.mapped_problem_problem(first_mapped_problem);
        final SubLObject first_problem_shared_vars = first_problem_shared_vars(first_mapped_problem, second_mapped_problem);
        final SubLObject second_problem = inference_datastructures_problem_link.mapped_problem_problem(second_mapped_problem);
        final SubLObject second_problem_shared_vars = second_problem_shared_vars(first_mapped_problem, second_mapped_problem);
        thread.resetMultipleValues();
        final SubLObject first_preference_level = inference_tactician_utilities.memoized_problem_global_preference_level(first_problem, strategic_context, first_problem_shared_vars);
        final SubLObject first_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject second_preference_level = inference_tactician_utilities.memoized_problem_global_preference_level(second_problem, strategic_context, second_problem_shared_vars);
        final SubLObject second_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (first_preference_level == inference_worker_join.$kw54$DISPREFERRED && inference_worker_join.NIL != Strings.stringE(first_justification, (SubLObject)inference_worker_join.$str55$TVA_POS, (SubLObject)inference_worker_join.UNPROVIDED, (SubLObject)inference_worker_join.UNPROVIDED, (SubLObject)inference_worker_join.UNPROVIDED, (SubLObject)inference_worker_join.UNPROVIDED) && second_preference_level == inference_worker_join.$kw54$DISPREFERRED && inference_worker_join.NIL != Strings.stringE(second_justification, (SubLObject)inference_worker_join.$str55$TVA_POS, (SubLObject)inference_worker_join.UNPROVIDED, (SubLObject)inference_worker_join.UNPROVIDED, (SubLObject)inference_worker_join.UNPROVIDED, (SubLObject)inference_worker_join.UNPROVIDED)) {
            return Values.values((SubLObject)inference_worker_join.$kw56$GROSSLY_DISPREFERRED, (SubLObject)inference_worker_join.$str57$DOUBLE_TVA_POS);
        }
        if (inference_worker_join.NIL != preference_modules.preference_level_L(first_preference_level, second_preference_level)) {
            final SubLObject justification = Sequences.cconcatenate((SubLObject)inference_worker_join.$str58$first_problem__, first_justification);
            return Values.values(first_preference_level, justification);
        }
        final SubLObject justification = Sequences.cconcatenate((SubLObject)inference_worker_join.$str59$second_problem__, second_justification);
        return Values.values(second_preference_level, justification);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 24640L)
    public static SubLObject execute_join_tactic(final SubLObject tactic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject first_mapped_problem = find_or_create_join_tactic_supporting_mapped_problems(tactic);
        final SubLObject second_mapped_problem = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject join_link = join_tactic_link(tactic);
        inference_worker.problem_link_open_and_repropagate_supporting_mapped_problem(join_link, first_mapped_problem);
        inference_worker.problem_link_open_and_repropagate_supporting_mapped_problem(join_link, second_mapped_problem);
        if (inference_worker_join.NIL != inference_tactician_strategic_uninterestingness.tactic_preferredP(tactic, (SubLObject)inference_worker_join.$kw51$TACTICAL)) {
            inference_worker.possibly_discard_all_other_possible_structural_conjunctive_tactics(tactic);
        }
        inference_worker_join_ordered.consider_strategic_ramifications_of_tactic_preference_level(tactic);
        return tactic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 25594L)
    public static SubLObject find_or_create_join_tactic_supporting_mapped_problems(final SubLObject tactic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
        final SubLObject query = inference_datastructures_problem.problem_query(problem);
        if (inference_worker_join.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && inference_worker_join.NIL == list_utilities.singletonP(query)) {
            Errors.error((SubLObject)inference_worker_join.$str60$Join_tactics_like__a_must_only_ap, tactic, query);
        }
        final SubLObject store = inference_datastructures_problem.problem_store(problem);
        final SubLObject dnf_clause = query.first();
        final SubLObject first_supporting_problem_spec = join_tactic_first_supporting_problem_spec(tactic);
        return find_or_create_join_link_supporting_mapped_problems(store, dnf_clause, first_supporting_problem_spec, problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 26195L)
    public static SubLObject new_join_proof(final SubLObject join_link, final SubLObject subproofs_with_sub_bindings) {
        return inference_worker_join_ordered.new_conjunctive_proof(join_link, subproofs_with_sub_bindings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 26475L)
    public static SubLObject join_proof_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker_join.NIL != inference_datastructures_proof.proof_p(v_object) && inference_worker_join.$kw24$JOIN == inference_datastructures_proof.proof_type(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 26600L)
    public static SubLObject bubble_up_proof_to_join_link(final SubLObject trigger_subproof, final SubLObject variable_map, final SubLObject join_link) {
        final SubLObject trigger_is_firstP = mapped_proof_is_firstP(trigger_subproof, variable_map, join_link);
        add_join_link_proof(join_link, trigger_subproof, trigger_is_firstP);
        bubble_up_proof_to_join_link_int(trigger_subproof, variable_map, join_link, trigger_is_firstP);
        return (SubLObject)inference_worker_join.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 26987L)
    public static SubLObject mapped_proof_is_firstP(final SubLObject subproof, final SubLObject proof_variable_map, final SubLObject join_link) {
        final SubLObject first_mapped_problem = join_link_first_mapped_problem(join_link);
        final SubLObject first_problem = inference_datastructures_problem_link.mapped_problem_problem(first_mapped_problem);
        final SubLObject subproof_supported_problem = inference_datastructures_proof.proof_supported_problem(subproof);
        if (first_problem.eql(subproof_supported_problem)) {
            final SubLObject first_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(first_mapped_problem);
            if (inference_worker_join.NIL != bindings.bindings_equalP(first_variable_map, proof_variable_map)) {
                return (SubLObject)inference_worker_join.T;
            }
        }
        return (SubLObject)inference_worker_join.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 27527L)
    public static SubLObject bubble_up_proof_to_join_link_int(final SubLObject trigger_subproof, final SubLObject variable_map, final SubLObject join_link, final SubLObject trigger_is_firstP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject proofs = (SubLObject)inference_worker_join.NIL;
        final SubLObject trigger_proof_bindings = inference_datastructures_proof.proof_bindings(trigger_subproof);
        final SubLObject join_bindings = join_link_shared_proof_bindings(join_link, trigger_proof_bindings, trigger_is_firstP);
        final SubLObject sibling_proofs = list_utilities.remove_if_not((SubLObject)inference_worker_join.$sym61$PROOF_PROVEN_, join_link_sibling_proofs_lookup(join_link, join_bindings, trigger_is_firstP), (SubLObject)inference_worker_join.UNPROVIDED, (SubLObject)inference_worker_join.UNPROVIDED, (SubLObject)inference_worker_join.UNPROVIDED, (SubLObject)inference_worker_join.UNPROVIDED);
        if (inference_worker_join.NIL != sibling_proofs) {
            final SubLObject sibling_mapped_problem = join_link_sibling_mapped_problem(join_link, trigger_is_firstP);
            final SubLObject sibling_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(sibling_mapped_problem);
            SubLObject sibling_proofs_with_bindings = (SubLObject)inference_worker_join.NIL;
            SubLObject cdolist_list_var = sibling_proofs;
            SubLObject sibling_proof = (SubLObject)inference_worker_join.NIL;
            sibling_proof = cdolist_list_var.first();
            while (inference_worker_join.NIL != cdolist_list_var) {
                final SubLObject sibling_sub_proof_bindings = bindings.transfer_variable_map_to_bindings(sibling_variable_map, inference_datastructures_proof.proof_bindings(sibling_proof));
                sibling_proofs_with_bindings = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(sibling_proof, sibling_sub_proof_bindings), sibling_proofs_with_bindings);
                cdolist_list_var = cdolist_list_var.rest();
                sibling_proof = cdolist_list_var.first();
            }
            sibling_proofs_with_bindings = Sequences.nreverse(sibling_proofs_with_bindings);
            final SubLObject trigger_sub_proof_bindings = bindings.transfer_variable_map_to_bindings(variable_map, trigger_proof_bindings);
            final SubLObject supporting_mapped_proof_lists_by_supporting_problem = (SubLObject)((inference_worker_join.NIL != trigger_is_firstP) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons(trigger_subproof, trigger_sub_proof_bindings)), sibling_proofs_with_bindings) : ConsesLow.list(sibling_proofs_with_bindings, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons(trigger_subproof, trigger_sub_proof_bindings))));
            SubLObject cdolist_list_var2;
            final SubLObject mapped_subproof_lists = cdolist_list_var2 = list_utilities.cartesian_product(supporting_mapped_proof_lists_by_supporting_problem, (SubLObject)inference_worker_join.UNPROVIDED, (SubLObject)inference_worker_join.UNPROVIDED, (SubLObject)inference_worker_join.UNPROVIDED);
            SubLObject mapped_subproof_list = (SubLObject)inference_worker_join.NIL;
            mapped_subproof_list = cdolist_list_var2.first();
            while (inference_worker_join.NIL != cdolist_list_var2) {
                thread.resetMultipleValues();
                final SubLObject proof = new_join_proof(join_link, mapped_subproof_list);
                final SubLObject newP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (inference_worker_join.NIL != newP) {
                    proofs = (SubLObject)ConsesLow.cons(proof, proofs);
                }
                else {
                    inference_worker.possibly_note_proof_processed(trigger_subproof);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                mapped_subproof_list = cdolist_list_var2.first();
            }
            SubLObject cdolist_list_var3;
            proofs = (cdolist_list_var3 = Sequences.nreverse(proofs));
            SubLObject proof2 = (SubLObject)inference_worker_join.NIL;
            proof2 = cdolist_list_var3.first();
            while (inference_worker_join.NIL != cdolist_list_var3) {
                inference_worker.bubble_up_proof(proof2);
                cdolist_list_var3 = cdolist_list_var3.rest();
                proof2 = cdolist_list_var3.first();
            }
        }
        return (SubLObject)inference_worker_join.NIL;
    }
    
    public static SubLObject declare_inference_worker_join_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "join_link_data_print_function_trampoline", "JOIN-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "join_link_data_p", "JOIN-LINK-DATA-P", 1, 0, false);
        new $join_link_data_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "j_link_data_join_vars", "J-LINK-DATA-JOIN-VARS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "j_link_data_first_proof_index", "J-LINK-DATA-FIRST-PROOF-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "j_link_data_second_proof_index", "J-LINK-DATA-SECOND-PROOF-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "_csetf_j_link_data_join_vars", "_CSETF-J-LINK-DATA-JOIN-VARS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "_csetf_j_link_data_first_proof_index", "_CSETF-J-LINK-DATA-FIRST-PROOF-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "_csetf_j_link_data_second_proof_index", "_CSETF-J-LINK-DATA-SECOND-PROOF-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "make_join_link_data", "MAKE-JOIN-LINK-DATA", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "visit_defstruct_join_link_data", "VISIT-DEFSTRUCT-JOIN-LINK-DATA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "visit_defstruct_object_join_link_data_method", "VISIT-DEFSTRUCT-OBJECT-JOIN-LINK-DATA-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "valid_join_link_data_p", "VALID-JOIN-LINK-DATA-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "new_join_link_data", "NEW-JOIN-LINK-DATA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "join_link_p", "JOIN-LINK-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "maybe_new_join_link", "MAYBE-NEW-JOIN-LINK", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "new_join_link", "NEW-JOIN-LINK", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "destroy_join_link", "DESTROY-JOIN-LINK", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "do_join_link_first_proofs", "DO-JOIN-LINK-FIRST-PROOFS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "do_join_link_second_proofs", "DO-JOIN-LINK-SECOND-PROOFS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "join_link_join_vars", "JOIN-LINK-JOIN-VARS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "join_link_first_proof_index", "JOIN-LINK-FIRST-PROOF-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "join_link_second_proof_index", "JOIN-LINK-SECOND-PROOF-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "join_link_first_mapped_problem", "JOIN-LINK-FIRST-MAPPED-PROBLEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "join_link_second_mapped_problem", "JOIN-LINK-SECOND-MAPPED-PROBLEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "join_link_first_problem", "JOIN-LINK-FIRST-PROBLEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "join_link_second_problem", "JOIN-LINK-SECOND-PROBLEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "join_link_trigger_variable_map", "JOIN-LINK-TRIGGER-VARIABLE-MAP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "join_link_trigger_mapped_problem", "JOIN-LINK-TRIGGER-MAPPED-PROBLEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "join_link_sibling_mapped_problem", "JOIN-LINK-SIBLING-MAPPED-PROBLEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "join_link_first_proofs_lookup", "JOIN-LINK-FIRST-PROOFS-LOOKUP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "join_link_second_proofs_lookup", "JOIN-LINK-SECOND-PROOFS-LOOKUP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "join_link_sibling_proofs_lookup", "JOIN-LINK-SIBLING-PROOFS-LOOKUP", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "join_link_shared_proof_bindings", "JOIN-LINK-SHARED-PROOF-BINDINGS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "join_link_tactic", "JOIN-LINK-TACTIC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "join_link_tactic_int", "JOIN-LINK-TACTIC-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "add_join_link_first_proof", "ADD-JOIN-LINK-FIRST-PROOF", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "remove_join_link_first_proof", "REMOVE-JOIN-LINK-FIRST-PROOF", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "add_join_link_second_proof", "ADD-JOIN-LINK-SECOND-PROOF", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "remove_join_link_second_proof", "REMOVE-JOIN-LINK-SECOND-PROOF", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "add_join_link_proof", "ADD-JOIN-LINK-PROOF", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "remove_join_link_proof_both_ways", "REMOVE-JOIN-LINK-PROOF-BOTH-WAYS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "remove_join_link_proof", "REMOVE-JOIN-LINK-PROOF", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "find_or_create_join_link_supporting_mapped_problems", "FIND-OR-CREATE-JOIN-LINK-SUPPORTING-MAPPED-PROBLEMS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "first_problem_shared_vars", "FIRST-PROBLEM-SHARED-VARS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "second_problem_shared_vars", "SECOND-PROBLEM-SHARED-VARS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "shared_sibling_vars", "SHARED-SIBLING-VARS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "join_tactic_p", "JOIN-TACTIC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "new_join_tactic", "NEW-JOIN-TACTIC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "join_tactic_link", "JOIN-TACTIC-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "join_tactic_first_supporting_problem_spec", "JOIN-TACTIC-FIRST-SUPPORTING-PROBLEM-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "join_tactic_first_problem", "JOIN-TACTIC-FIRST-PROBLEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "join_tactic_second_problem", "JOIN-TACTIC-SECOND-PROBLEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "join_tactic_lookahead_problems", "JOIN-TACTIC-LOOKAHEAD-PROBLEMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "determine_new_join_tactics", "DETERMINE-NEW-JOIN-TACTICS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "possibly_determine_new_join_tactic", "POSSIBLY-DETERMINE-NEW-JOIN-TACTIC", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "compute_strategic_properties_of_join_tactic", "COMPUTE-STRATEGIC-PROPERTIES-OF-JOIN-TACTIC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "compute_join_tactic_productivity", "COMPUTE-JOIN-TACTIC-PRODUCTIVITY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "compute_join_tactic_preference_level", "COMPUTE-JOIN-TACTIC-PREFERENCE-LEVEL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "execute_join_tactic", "EXECUTE-JOIN-TACTIC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "find_or_create_join_tactic_supporting_mapped_problems", "FIND-OR-CREATE-JOIN-TACTIC-SUPPORTING-MAPPED-PROBLEMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "new_join_proof", "NEW-JOIN-PROOF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "join_proof_p", "JOIN-PROOF-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "bubble_up_proof_to_join_link", "BUBBLE-UP-PROOF-TO-JOIN-LINK", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "mapped_proof_is_firstP", "MAPPED-PROOF-IS-FIRST?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_join", "bubble_up_proof_to_join_link_int", "BUBBLE-UP-PROOF-TO-JOIN-LINK-INT", 4, 0, false);
        return (SubLObject)inference_worker_join.NIL;
    }
    
    public static SubLObject init_inference_worker_join_file() {
        inference_worker_join.$dtp_join_link_data$ = SubLFiles.defconstant("*DTP-JOIN-LINK-DATA*", (SubLObject)inference_worker_join.$sym0$JOIN_LINK_DATA);
        inference_worker_join.$join_module$ = SubLFiles.defparameter("*JOIN-MODULE*", inference_modules.inference_structural_module((SubLObject)inference_worker_join.$kw24$JOIN, (SubLObject)inference_worker_join.UNPROVIDED));
        inference_worker_join.$join_productivity_scaling_factor$ = SubLFiles.defparameter("*JOIN-PRODUCTIVITY-SCALING-FACTOR*", (SubLObject)inference_worker_join.EIGHT_INTEGER);
        return (SubLObject)inference_worker_join.NIL;
    }
    
    public static SubLObject setup_inference_worker_join_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), inference_worker_join.$dtp_join_link_data$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_worker_join.$sym7$JOIN_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)inference_worker_join.$list8);
        Structures.def_csetf((SubLObject)inference_worker_join.$sym9$J_LINK_DATA_JOIN_VARS, (SubLObject)inference_worker_join.$sym10$_CSETF_J_LINK_DATA_JOIN_VARS);
        Structures.def_csetf((SubLObject)inference_worker_join.$sym11$J_LINK_DATA_FIRST_PROOF_INDEX, (SubLObject)inference_worker_join.$sym12$_CSETF_J_LINK_DATA_FIRST_PROOF_INDEX);
        Structures.def_csetf((SubLObject)inference_worker_join.$sym13$J_LINK_DATA_SECOND_PROOF_INDEX, (SubLObject)inference_worker_join.$sym14$_CSETF_J_LINK_DATA_SECOND_PROOF_INDEX);
        Equality.identity((SubLObject)inference_worker_join.$sym0$JOIN_LINK_DATA);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), inference_worker_join.$dtp_join_link_data$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_worker_join.$sym23$VISIT_DEFSTRUCT_OBJECT_JOIN_LINK_DATA_METHOD));
        access_macros.register_macro_helper((SubLObject)inference_worker_join.$sym31$JOIN_LINK_FIRST_PROOF_INDEX, (SubLObject)inference_worker_join.$sym37$DO_JOIN_LINK_FIRST_PROOFS);
        access_macros.register_macro_helper((SubLObject)inference_worker_join.$sym36$JOIN_LINK_SECOND_PROOF_INDEX, (SubLObject)inference_worker_join.$sym38$DO_JOIN_LINK_SECOND_PROOFS);
        return (SubLObject)inference_worker_join.NIL;
    }
    
    public void declareFunctions() {
        declare_inference_worker_join_file();
    }
    
    public void initializeVariables() {
        init_inference_worker_join_file();
    }
    
    public void runTopLevelForms() {
        setup_inference_worker_join_file();
    }
    
    static {
        me = (SubLFile)new inference_worker_join();
        inference_worker_join.$dtp_join_link_data$ = null;
        inference_worker_join.$join_module$ = null;
        inference_worker_join.$join_productivity_scaling_factor$ = null;
        $sym0$JOIN_LINK_DATA = SubLObjectFactory.makeSymbol("JOIN-LINK-DATA");
        $sym1$JOIN_LINK_DATA_P = SubLObjectFactory.makeSymbol("JOIN-LINK-DATA-P");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("JOIN-VARS"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST-PROOF-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("SECOND-PROOF-INDEX"));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("JOIN-VARS"), (SubLObject)SubLObjectFactory.makeKeyword("FIRST-PROOF-INDEX"), (SubLObject)SubLObjectFactory.makeKeyword("SECOND-PROOF-INDEX"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("J-LINK-DATA-JOIN-VARS"), (SubLObject)SubLObjectFactory.makeSymbol("J-LINK-DATA-FIRST-PROOF-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("J-LINK-DATA-SECOND-PROOF-INDEX"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-J-LINK-DATA-JOIN-VARS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-J-LINK-DATA-FIRST-PROOF-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-J-LINK-DATA-SECOND-PROOF-INDEX"));
        $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym7$JOIN_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("JOIN-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("JOIN-LINK-DATA-P"));
        $sym9$J_LINK_DATA_JOIN_VARS = SubLObjectFactory.makeSymbol("J-LINK-DATA-JOIN-VARS");
        $sym10$_CSETF_J_LINK_DATA_JOIN_VARS = SubLObjectFactory.makeSymbol("_CSETF-J-LINK-DATA-JOIN-VARS");
        $sym11$J_LINK_DATA_FIRST_PROOF_INDEX = SubLObjectFactory.makeSymbol("J-LINK-DATA-FIRST-PROOF-INDEX");
        $sym12$_CSETF_J_LINK_DATA_FIRST_PROOF_INDEX = SubLObjectFactory.makeSymbol("_CSETF-J-LINK-DATA-FIRST-PROOF-INDEX");
        $sym13$J_LINK_DATA_SECOND_PROOF_INDEX = SubLObjectFactory.makeSymbol("J-LINK-DATA-SECOND-PROOF-INDEX");
        $sym14$_CSETF_J_LINK_DATA_SECOND_PROOF_INDEX = SubLObjectFactory.makeSymbol("_CSETF-J-LINK-DATA-SECOND-PROOF-INDEX");
        $kw15$JOIN_VARS = SubLObjectFactory.makeKeyword("JOIN-VARS");
        $kw16$FIRST_PROOF_INDEX = SubLObjectFactory.makeKeyword("FIRST-PROOF-INDEX");
        $kw17$SECOND_PROOF_INDEX = SubLObjectFactory.makeKeyword("SECOND-PROOF-INDEX");
        $str18$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw19$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym20$MAKE_JOIN_LINK_DATA = SubLObjectFactory.makeSymbol("MAKE-JOIN-LINK-DATA");
        $kw21$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw22$END = SubLObjectFactory.makeKeyword("END");
        $sym23$VISIT_DEFSTRUCT_OBJECT_JOIN_LINK_DATA_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-JOIN-LINK-DATA-METHOD");
        $kw24$JOIN = SubLObjectFactory.makeKeyword("JOIN");
        $sym25$MAPPED_PROBLEM_P = SubLObjectFactory.makeSymbol("MAPPED-PROBLEM-P");
        $kw26$FREE = SubLObjectFactory.makeKeyword("FREE");
        $list27 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BINDINGS-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PROOF-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("JOIN-LINK")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym28$INDEX = SubLObjectFactory.makeUninternedSymbol("INDEX");
        $sym29$PROOF_LIST_VAR = SubLObjectFactory.makeUninternedSymbol("PROOF-LIST-VAR");
        $sym30$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym31$JOIN_LINK_FIRST_PROOF_INDEX = SubLObjectFactory.makeSymbol("JOIN-LINK-FIRST-PROOF-INDEX");
        $sym32$DO_DICTIONARY = SubLObjectFactory.makeSymbol("DO-DICTIONARY");
        $sym33$DO_LIST = SubLObjectFactory.makeSymbol("DO-LIST");
        $sym34$INDEX = SubLObjectFactory.makeUninternedSymbol("INDEX");
        $sym35$PROOF_LIST_VAR = SubLObjectFactory.makeUninternedSymbol("PROOF-LIST-VAR");
        $sym36$JOIN_LINK_SECOND_PROOF_INDEX = SubLObjectFactory.makeSymbol("JOIN-LINK-SECOND-PROOF-INDEX");
        $sym37$DO_JOIN_LINK_FIRST_PROOFS = SubLObjectFactory.makeSymbol("DO-JOIN-LINK-FIRST-PROOFS");
        $sym38$DO_JOIN_LINK_SECOND_PROOFS = SubLObjectFactory.makeSymbol("DO-JOIN-LINK-SECOND-PROOFS");
        $str39$couldn_t_find_the_join_tactic_for = SubLObjectFactory.makeString("couldn't find the join tactic for ~s");
        $sym40$JOIN_LINK_P = SubLObjectFactory.makeSymbol("JOIN-LINK-P");
        $sym41$PROOF_P = SubLObjectFactory.makeSymbol("PROOF-P");
        $str42$_a_was_a_rejected_proof = SubLObjectFactory.makeString("~a was a rejected proof");
        $sym43$HL_VAR_ = SubLObjectFactory.makeSymbol("HL-VAR?");
        $sym44$VARIABLE_BINDING_VALUE = SubLObjectFactory.makeSymbol("VARIABLE-BINDING-VALUE");
        $kw45$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $kw46$NEG = SubLObjectFactory.makeKeyword("NEG");
        $kw47$POS = SubLObjectFactory.makeKeyword("POS");
        $sym48$SUBCLAUSE_SPEC_P = SubLObjectFactory.makeSymbol("SUBCLAUSE-SPEC-P");
        $sym49$JOIN_TACTIC_P = SubLObjectFactory.makeSymbol("JOIN-TACTIC-P");
        $sym50$STRATEGY_P = SubLObjectFactory.makeSymbol("STRATEGY-P");
        $kw51$TACTICAL = SubLObjectFactory.makeKeyword("TACTICAL");
        $kw52$DOOMED = SubLObjectFactory.makeKeyword("DOOMED");
        $sym53$STRATEGIC_CONTEXT_P = SubLObjectFactory.makeSymbol("STRATEGIC-CONTEXT-P");
        $kw54$DISPREFERRED = SubLObjectFactory.makeKeyword("DISPREFERRED");
        $str55$TVA_POS = SubLObjectFactory.makeString("TVA-POS");
        $kw56$GROSSLY_DISPREFERRED = SubLObjectFactory.makeKeyword("GROSSLY-DISPREFERRED");
        $str57$DOUBLE_TVA_POS = SubLObjectFactory.makeString("DOUBLE TVA-POS");
        $str58$first_problem__ = SubLObjectFactory.makeString("first problem: ");
        $str59$second_problem__ = SubLObjectFactory.makeString("second problem: ");
        $str60$Join_tactics_like__a_must_only_ap = SubLObjectFactory.makeString("Join tactics like ~a must only apply to singleton problem queries, but ~s was not a singleton");
        $sym61$PROOF_PROVEN_ = SubLObjectFactory.makeSymbol("PROOF-PROVEN?");
    }
    
    public static final class $join_link_data_native extends SubLStructNative
    {
        public SubLObject $join_vars;
        public SubLObject $first_proof_index;
        public SubLObject $second_proof_index;
        private static final SubLStructDeclNative structDecl;
        
        public $join_link_data_native() {
            this.$join_vars = (SubLObject)CommonSymbols.NIL;
            this.$first_proof_index = (SubLObject)CommonSymbols.NIL;
            this.$second_proof_index = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$join_link_data_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$join_vars;
        }
        
        public SubLObject getField3() {
            return this.$first_proof_index;
        }
        
        public SubLObject getField4() {
            return this.$second_proof_index;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$join_vars = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$first_proof_index = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$second_proof_index = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$join_link_data_native.class, inference_worker_join.$sym0$JOIN_LINK_DATA, inference_worker_join.$sym1$JOIN_LINK_DATA_P, inference_worker_join.$list2, inference_worker_join.$list3, new String[] { "$join_vars", "$first_proof_index", "$second_proof_index" }, inference_worker_join.$list4, inference_worker_join.$list5, inference_worker_join.$sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $join_link_data_p$UnaryFunction extends UnaryFunction
    {
        public $join_link_data_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("JOIN-LINK-DATA-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return inference_worker_join.join_link_data_p(arg1);
        }
    }
}

/*

	Total time: 246 ms
	
*/