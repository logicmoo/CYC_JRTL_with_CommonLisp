package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing;
import com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class narts_high extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.narts_high";
    public static final String myFingerPrint = "1f3c93da4de9c6ad82d396a9e3101f6b79209582eb2aea100664a70978618a8d";
    @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 9340L)
    public static SubLSymbol $nart_dump_id_table$;
    private static final SubLList $list0;
    private static final SubLList $list1;
    private static final SubLSymbol $kw2$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw3$NUM;
    private static final SubLSymbol $kw4$PROGRESS_MESSAGE;
    private static final SubLString $str5$mapping_narts_for_sweep;
    private static final SubLSymbol $kw6$DONE;
    private static final SubLSymbol $sym7$PIF;
    private static final SubLSymbol $sym8$POSITIVE_INTEGER_P;
    private static final SubLSymbol $sym9$PROGRESS_CSOME;
    private static final SubLSymbol $sym10$NARTS_AROUND;
    private static final SubLList $list11;
    private static final SubLSymbol $sym12$DO_NARTS;
    private static final SubLSymbol $sym13$NART_P;
    private static final SubLSymbol $sym14$NART_HL_FORMULA;
    private static final SubLList $list15;
    private static final SubLString $str16$Return_the_hl_formula_of_this_NAR;
    private static final SubLList $list17;
    private static final SubLList $list18;
    private static final SubLSymbol $sym19$NAUT_P;
    private static final SubLList $list20;
    private static final SubLString $str21$Return_T_iff_OBJECT_is_a_datastru;
    private static final SubLList $list22;
    private static final SubLSymbol $sym23$NART_EL_FORMULA;
    private static final SubLString $str24$Return_the_el_formula_of_this_NAR;
    private static final SubLSymbol $sym25$POSSIBLY_NAUT_P;
    private static final SubLSymbol $sym26$TRUE;
    private static final SubLSymbol $sym27$RANDOM_NART;
    private static final SubLList $list28;
    private static final SubLString $str29$Return_a_randomly_chosen_NART_tha;
    private static final SubLList $list30;
    private static final SubLInteger $int31$500;
    private static final SubLSymbol $sym32$NON_NEGATIVE_INTEGER_P;
    private static final SubLSymbol $sym33$HL_FIND_OR_CREATE_NART;
    private static final SubLList $list34;
    private static final SubLSymbol $sym35$FIND_OR_CREATE_NART;
    private static final SubLList $list36;
    private static final SubLSymbol $sym37$FORT_P;
    private static final SubLString $str38$A_horrible_and_gross_circularity_;
    private static final SubLSymbol $sym39$REMOVE_NART;
    private static final SubLString $str40$Remove_NART_from_the_KB_;
    private static final SubLList $list41;
    private static final SubLList $list42;
    private static final SubLSymbol $sym43$CLET;
    private static final SubLList $list44;
    private static final SubLSymbol $sym45$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const46$EverythingPSC;
    private static final SubLSymbol $kw47$RULE;
    private static final SubLObject $const48$forwardReificationRule;
    private static final SubLSymbol $sym49$_EXIT;
    private static final SubLSymbol $sym50$NART_INDEPENDENT_ASSERTIONS_INTERNAL;
    private static final SubLString $str51$Looking_for_bad_narts;
    private static final SubLSymbol $sym52$STRINGP;
    private static final SubLSymbol $kw53$SKIP;
    private static final SubLList $list54;
    private static final SubLSymbol $kw55$NART_ARG;
    private static final SubLSymbol $kw56$GAF;
    private static final SubLSymbol $kw57$FUNCTION_EXTENT;
    private static final SubLSymbol $kw58$OVERLAP;
    private static final SubLInteger $int59$100;
    private static final SubLSymbol $sym60$FIND_NART_BY_ID;
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 879L)
    public static SubLObject do_recent_narts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)narts_high.$list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)narts_high.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)narts_high.$list0);
        var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)narts_high.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)narts_high.NIL;
        SubLObject current_$1 = (SubLObject)narts_high.NIL;
        while (narts_high.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)narts_high.$list0);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)narts_high.$list0);
            if (narts_high.NIL == conses_high.member(current_$1, (SubLObject)narts_high.$list1, (SubLObject)narts_high.UNPROVIDED, (SubLObject)narts_high.UNPROVIDED)) {
                bad = (SubLObject)narts_high.T;
            }
            if (current_$1 == narts_high.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (narts_high.NIL != bad && narts_high.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)narts_high.$list0);
        }
        final SubLObject num_tail = cdestructuring_bind.property_list_member((SubLObject)narts_high.$kw3$NUM, current);
        final SubLObject num = (SubLObject)((narts_high.NIL != num_tail) ? conses_high.cadr(num_tail) : narts_high.NIL);
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)narts_high.$kw4$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((narts_high.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : narts_high.$str5$mapping_narts_for_sweep);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)narts_high.$kw6$DONE, current);
        final SubLObject done = (SubLObject)((narts_high.NIL != done_tail) ? conses_high.cadr(done_tail) : narts_high.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)narts_high.$sym7$PIF, (SubLObject)ConsesLow.list((SubLObject)narts_high.$sym8$POSITIVE_INTEGER_P, num), (SubLObject)ConsesLow.listS((SubLObject)narts_high.$sym9$PROGRESS_CSOME, (SubLObject)ConsesLow.list(var, (SubLObject)ConsesLow.list((SubLObject)narts_high.$sym10$NARTS_AROUND, (SubLObject)narts_high.$list11, num, num), progress_message, done), ConsesLow.append(body, (SubLObject)narts_high.NIL)), (SubLObject)ConsesLow.listS((SubLObject)narts_high.$sym12$DO_NARTS, (SubLObject)ConsesLow.list(var, progress_message, (SubLObject)narts_high.$kw6$DONE, done), ConsesLow.append(body, (SubLObject)narts_high.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 1416L)
    public static SubLObject nart_hl_formula(final SubLObject nart) {
        enforceType(nart, narts_high.$sym13$NART_P);
        return (SubLObject)((narts_high.NIL != nart_handles.nart_handle_validP(nart)) ? narts_interface.kb_nart_hl_formula(nart) : narts_high.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 1785L)
    public static SubLObject nart_lookup(final SubLObject nart_hl_formula) {
        return narts_interface.kb_lookup_nart(nart_hl_formula);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 1999L)
    public static SubLObject naut_p(final SubLObject v_object) {
        if (narts_high.NIL != el_utilities.possibly_naut_p(v_object)) {
            return cycl_grammar.cycl_nat_p(v_object);
        }
        return (SubLObject)narts_high.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 2332L)
    public static SubLObject invalid_nartP(final SubLObject nart, SubLObject robust) {
        if (robust == narts_high.UNPROVIDED) {
            robust = (SubLObject)narts_high.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(narts_high.NIL != nart_handles.nart_p(nart) && narts_high.NIL == nart_handles.valid_nartP(nart, (SubLObject)narts_high.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 2485L)
    public static SubLObject invalid_nart_robustP(final SubLObject nart) {
        SubLObject invalidP = (SubLObject)SubLObjectFactory.makeBoolean(narts_high.NIL != nart_handles.nart_p(nart) && narts_high.NIL == nart_handles.valid_nart_robustP(nart));
        if (narts_high.NIL == invalidP) {
            final SubLObject tou = function_terms.term_of_unit_assertion(nart);
            if (narts_high.NIL == tou) {
                return (SubLObject)narts_high.T;
            }
            invalidP = (SubLObject)SubLObjectFactory.makeBoolean(!assertions_high.gaf_arg2(tou).equal(nart_hl_formula(nart)));
        }
        return invalidP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 2843L)
    public static SubLObject nart_el_formula(final SubLObject nart) {
        enforceType(nart, narts_high.$sym13$NART_P);
        return transform_list_utilities.transform(nart, Symbols.symbol_function((SubLObject)narts_high.$sym13$NART_P), Symbols.symbol_function((SubLObject)narts_high.$sym14$NART_HL_FORMULA), (SubLObject)narts_high.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 3060L)
    public static SubLObject find_nart(final SubLObject nart_hl_formula) {
        assert narts_high.NIL != el_utilities.possibly_naut_p(nart_hl_formula) : nart_hl_formula;
        final SubLObject nart = nart_substitute(nart_hl_formula);
        return (SubLObject)((narts_high.NIL != nart_handles.nart_p(nart)) ? nart : narts_high.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 3368L)
    public static SubLObject random_nart(SubLObject test) {
        if (test == narts_high.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)narts_high.$sym26$TRUE);
        }
        if (nart_handles.nart_count().numG((SubLObject)narts_high.ZERO_INTEGER)) {
            final SubLObject max_id = nart_handles.next_nart_id();
            SubLObject v_answer;
            SubLObject candidate;
            for (v_answer = (SubLObject)narts_high.NIL; narts_high.NIL == v_answer; v_answer = candidate) {
                candidate = nart_handles.find_nart_by_id(random.random(max_id));
                if (narts_high.NIL != candidate && narts_high.NIL != Functions.funcall(test, candidate)) {}
            }
            return v_answer;
        }
        return (SubLObject)narts_high.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 3757L)
    public static SubLObject sample_narts(SubLObject n, SubLObject allow_repeatsP, SubLObject test) {
        if (n == narts_high.UNPROVIDED) {
            n = (SubLObject)narts_high.$int31$500;
        }
        if (allow_repeatsP == narts_high.UNPROVIDED) {
            allow_repeatsP = (SubLObject)narts_high.NIL;
        }
        if (test == narts_high.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)narts_high.$sym26$TRUE);
        }
        assert narts_high.NIL != subl_promotions.non_negative_integer_p(n) : n;
        if (narts_high.NIL != allow_repeatsP) {
            SubLObject result = (SubLObject)narts_high.NIL;
            SubLObject i;
            for (i = (SubLObject)narts_high.NIL, i = (SubLObject)narts_high.ZERO_INTEGER; i.numL(n); i = Numbers.add(i, (SubLObject)narts_high.ONE_INTEGER)) {
                result = (SubLObject)ConsesLow.cons(random_nart(test), result);
            }
            return result;
        }
        SubLObject result;
        for (result = set_contents.new_set_contents(n, Symbols.symbol_function((SubLObject)narts_high.EQL)); set_contents.set_contents_size(result).numL(n); result = set_contents.set_contents_add(random_nart(test), result, Symbols.symbol_function((SubLObject)narts_high.EQL))) {}
        return set_contents.set_contents_element_list(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 4326L)
    public static SubLObject hl_find_or_create_nart(final SubLObject nart_hl_formula) {
        assert narts_high.NIL != el_utilities.possibly_naut_p(nart_hl_formula) : nart_hl_formula;
        return czer_main.cyc_find_or_create_nart(nart_hl_formula, (SubLObject)narts_high.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 4672L)
    public static SubLObject tl_find_or_create_nart(final SubLObject canonical_naut) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)narts_high.NIL;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_enabledP$.bind((SubLObject)narts_high.NIL, thread);
            result = czer_main.cyc_find_or_create_nart(canon_tl.transform_tl_terms_to_hl(canonical_naut), (SubLObject)narts_high.UNPROVIDED);
        }
        finally {
            kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 4976L)
    public static SubLObject find_or_create_nart(final SubLObject nart_hl_formula) {
        return hl_find_or_create_nart(nart_hl_formula);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 5187L)
    public static SubLObject remove_dependent_narts(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert narts_high.NIL != forts.fort_p(fort) : fort;
        SubLObject cdolist_list_var;
        final SubLObject dependencies = cdolist_list_var = indexing_utilities.dependent_narts(fort);
        SubLObject dependent = (SubLObject)narts_high.NIL;
        dependent = cdolist_list_var.first();
        while (narts_high.NIL != cdolist_list_var) {
            if (narts_high.NIL != nart_handles.valid_nartP(dependent, (SubLObject)narts_high.UNPROVIDED)) {
                if (narts_high.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && fort.eql(dependent)) {
                    Errors.error((SubLObject)narts_high.$str38$A_horrible_and_gross_circularity_, fort);
                }
                cyc_kernel.cyc_kill(dependent);
            }
            cdolist_list_var = cdolist_list_var.rest();
            dependent = cdolist_list_var.first();
        }
        return (SubLObject)narts_high.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 5621L)
    public static SubLObject remove_nart(final SubLObject nart) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(nart, narts_high.$sym13$NART_P);
        final SubLObject _prev_bind_0 = hl_macros.$forts_being_removed$.currentBinding(thread);
        try {
            hl_macros.$forts_being_removed$.bind((SubLObject)ConsesLow.cons(nart, hl_macros.$forts_being_removed$.getDynamicValue(thread)), thread);
            if (narts_high.NIL != kb_control_vars.time_kb_loaded_p() && narts_high.NIL != sbhl_time_utilities.sbhl_temporality_term_p(nart)) {
                sbhl_time_assertion_processing.remove_fort_from_sbhl_temporality_structures(nart);
            }
            remove_dependent_narts(nart);
            kb_indexing.remove_term_indices(nart);
            kb_hl_supports_high.tms_remove_kb_hl_supports_mentioning_term(nart);
            cardinality_estimates.clear_cardinality_estimates(nart);
        }
        finally {
            hl_macros.$forts_being_removed$.rebind(_prev_bind_0, thread);
        }
        if (narts_high.NIL != tms.tms_please_kill_this_term_for_me(nart)) {
            return nart;
        }
        return narts_interface.kb_remove_nart(nart);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 6623L)
    public static SubLObject nart_expand(SubLObject v_object) {
        if (narts_high.NIL != list_utilities.tree_find_if(Symbols.symbol_function((SubLObject)narts_high.$sym13$NART_P), v_object, (SubLObject)narts_high.UNPROVIDED)) {
            v_object = transform_list_utilities.transform(v_object, Symbols.symbol_function((SubLObject)narts_high.$sym13$NART_P), Symbols.symbol_function((SubLObject)narts_high.$sym23$NART_EL_FORMULA), (SubLObject)narts_high.UNPROVIDED);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 6913L)
    public static SubLObject nart_substitute(final SubLObject v_object) {
        if (narts_high.NIL == el_utilities.possibly_naut_p(v_object)) {
            return v_object;
        }
        return nart_substitute_recursive(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 7311L)
    public static SubLObject nart_substitute_recursive(final SubLObject tree) {
        if (narts_high.NIL != el_utilities.subl_escape_p(tree)) {
            return tree;
        }
        SubLObject result = (SubLObject)narts_high.NIL;
        if (narts_high.NIL != contains_nat_formula_as_elementP(tree)) {
            final SubLObject new_tree = conses_high.copy_list(tree);
            SubLObject list;
            SubLObject arg;
            SubLObject sub_nart;
            for (list = (SubLObject)narts_high.NIL, list = new_tree; !list.isAtom(); list = list.rest()) {
                arg = list.first();
                if (narts_high.NIL != function_terms.nat_formula_p(arg)) {
                    sub_nart = nart_substitute_recursive(arg);
                    if (narts_high.NIL != sub_nart) {
                        ConsesLow.rplaca(list, sub_nart);
                    }
                }
            }
            result = new_tree;
        }
        else {
            result = tree;
        }
        final SubLObject nart = nart_lookup(result);
        return (narts_high.NIL != nart_handles.nart_p(nart)) ? nart : result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 7897L)
    public static SubLObject contains_nat_formula_as_elementP(final SubLObject list) {
        SubLObject rest;
        SubLObject arg;
        for (rest = (SubLObject)narts_high.NIL, rest = list; !rest.isAtom(); rest = rest.rest()) {
            arg = rest.first();
            if (narts_high.NIL != function_terms.nat_formula_p(arg)) {
                return (SubLObject)narts_high.T;
            }
        }
        return (SubLObject)narts_high.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 8327L)
    public static SubLObject nart_with_functor_p(final SubLObject functor, final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(narts_high.NIL != nart_handles.nart_p(v_object) && functor.eql(cycl_utilities.nat_functor(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 8569L)
    public static SubLObject nart_checkpoint_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(narts_high.NIL != list_utilities.proper_list_p(v_object) && narts_high.NIL != list_utilities.lengthE(v_object, (SubLObject)narts_high.TWO_INTEGER, (SubLObject)narts_high.UNPROVIDED) && narts_high.NIL != list_utilities.every_in_list((SubLObject)narts_high.$sym32$NON_NEGATIVE_INTEGER_P, v_object, (SubLObject)narts_high.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 8835L)
    public static SubLObject new_nart_checkpoint() {
        final SubLObject nart_count = nart_handles.nart_count();
        final SubLObject next_nart_id = nart_handles.next_nart_id();
        return (SubLObject)ConsesLow.list(nart_count, next_nart_id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 9047L)
    public static SubLObject nart_checkpoint_currentP(final SubLObject nart_checkpoint) {
        SubLObject checkpoint_count = (SubLObject)narts_high.NIL;
        SubLObject checkpoint_next_id = (SubLObject)narts_high.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(nart_checkpoint, nart_checkpoint, (SubLObject)narts_high.$list42);
        checkpoint_count = nart_checkpoint.first();
        SubLObject current = nart_checkpoint.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, nart_checkpoint, (SubLObject)narts_high.$list42);
        checkpoint_next_id = current.first();
        current = current.rest();
        if (narts_high.NIL == current) {
            return (SubLObject)SubLObjectFactory.makeBoolean(checkpoint_count.numE(nart_handles.nart_count()) && checkpoint_next_id.numE(nart_handles.next_nart_id()));
        }
        cdestructuring_bind.cdestructuring_bind_error(nart_checkpoint, (SubLObject)narts_high.$list42);
        return (SubLObject)narts_high.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 9443L)
    public static SubLObject nart_dump_id(final SubLObject nart) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject id = nart_handles.nart_id(nart);
        final SubLObject dump_table = narts_high.$nart_dump_id_table$.getDynamicValue(thread);
        if (narts_high.NIL != dump_table) {
            id = id_index.id_index_lookup(dump_table, id, (SubLObject)narts_high.UNPROVIDED);
        }
        return id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 9683L)
    public static SubLObject find_nart_by_dump_id(final SubLObject dump_id) {
        return nart_handles.find_nart_by_id(dump_id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 9816L)
    public static SubLObject with_nart_dump_id_table(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)narts_high.$sym43$CLET, (SubLObject)narts_high.$list44, ConsesLow.append(body, (SubLObject)narts_high.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 10003L)
    public static SubLObject useful_nartP(final SubLObject nart) {
        return (SubLObject)SubLObjectFactory.makeBoolean(narts_high.NIL != nart_handles.nart_p(nart) && narts_high.NIL != function_terms.nat_formula_p(nart_hl_formula(nart)) && (narts_high.NIL != nart_specified_to_be_retainedP(nart) || narts_high.NIL != skolemize_forward_nartP(nart) || narts_high.NIL != nart_independent_assertions(nart)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 10469L)
    public static SubLObject useless_nartP(final SubLObject nart) {
        return (SubLObject)SubLObjectFactory.makeBoolean(narts_high.NIL != nart_handles.nart_p(nart) && narts_high.NIL == useful_nartP(nart));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 10643L)
    public static SubLObject nart_specified_to_be_retainedP(final SubLObject nart) {
        return kb_accessors.term_specified_to_be_retainedP(nart);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 10746L)
    public static SubLObject skolemize_forward_nartP(final SubLObject nart) {
        return (SubLObject)SubLObjectFactory.makeBoolean(narts_high.NIL != kb_accessors.skolemize_forward_somewhereP(cycl_utilities.nat_functor(nart)) || narts_high.NIL != appears_in_forward_reification_ruleP(cycl_utilities.nat_functor(nart)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 10992L)
    public static SubLObject appears_in_forward_reification_ruleP(final SubLObject functor) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)narts_high.$sym45$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(narts_high.$const46$EverythingPSC, thread);
            if (narts_high.NIL != kb_mapping_macros.do_function_rule_index_key_validator(functor, (SubLObject)narts_high.NIL)) {
                final SubLObject iterator_var = kb_mapping_macros.new_function_rule_final_index_spec_iterator(functor, (SubLObject)narts_high.NIL);
                SubLObject done_var = (SubLObject)narts_high.NIL;
                final SubLObject token_var = (SubLObject)narts_high.NIL;
                while (narts_high.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (narts_high.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)narts_high.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)narts_high.$kw47$RULE, (SubLObject)narts_high.NIL, (SubLObject)narts_high.NIL);
                            SubLObject done_var_$2 = (SubLObject)narts_high.NIL;
                            final SubLObject token_var_$3 = (SubLObject)narts_high.NIL;
                            while (narts_high.NIL == done_var_$2) {
                                final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$3);
                                final SubLObject valid_$4 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$3.eql(rule));
                                if (narts_high.NIL != valid_$4 && narts_high.NIL != kb_mapping_utilities.pred_u_v_holds(narts_high.$const48$forwardReificationRule, functor, rule, (SubLObject)narts_high.UNPROVIDED, (SubLObject)narts_high.UNPROVIDED, (SubLObject)narts_high.UNPROVIDED)) {
                                    return (SubLObject)narts_high.T;
                                }
                                done_var_$2 = (SubLObject)SubLObjectFactory.makeBoolean(narts_high.NIL == valid_$4);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)narts_high.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (narts_high.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(narts_high.NIL == valid);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)narts_high.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 11338L)
    public static SubLObject nart_dependent_assertions(final SubLObject nart) {
        assert narts_high.NIL != nart_handles.nart_p(nart) : nart;
        return assertions_interface.all_dependent_assertions(function_terms.term_of_unit_assertion(nart));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 11584L)
    public static SubLObject nart_independent_assertions(final SubLObject nart) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert narts_high.NIL != nart_handles.nart_p(nart) : nart;
        final SubLObject term_of_unit = function_terms.term_of_unit_assertion(nart);
        if (narts_high.NIL != term_of_unit) {
            SubLObject independent_assertions = (SubLObject)narts_high.NIL;
            final SubLObject _prev_bind_0 = control_vars.$mapping_target$.currentBinding(thread);
            final SubLObject _prev_bind_2 = control_vars.$mapping_answer$.currentBinding(thread);
            try {
                control_vars.$mapping_target$.bind(assertions_low.assertion_dependencies(term_of_unit), thread);
                control_vars.$mapping_answer$.bind(Hashtables.make_hash_table(Numbers.integerDivide(kb_indexing.num_index(nart), (SubLObject)narts_high.FOUR_INTEGER), (SubLObject)narts_high.UNPROVIDED, (SubLObject)narts_high.UNPROVIDED), thread);
                final SubLObject _prev_bind_0_$6 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$7 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)narts_high.$sym45$RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind(narts_high.$const46$EverythingPSC, thread);
                    kb_mapping.map_term(Symbols.symbol_function((SubLObject)narts_high.$sym50$NART_INDEPENDENT_ASSERTIONS_INTERNAL), nart);
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$7, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$6, thread);
                }
                independent_assertions = hash_table_utilities.hash_table_keys(control_vars.$mapping_answer$.getDynamicValue(thread));
            }
            finally {
                control_vars.$mapping_answer$.rebind(_prev_bind_2, thread);
                control_vars.$mapping_target$.rebind(_prev_bind_0, thread);
            }
            return independent_assertions;
        }
        return (SubLObject)narts_high.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 12166L)
    public static SubLObject nart_independent_assertions_internal(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (narts_high.NIL == Hashtables.gethash(assertion, control_vars.$mapping_target$.getDynamicValue(thread), (SubLObject)narts_high.UNPROVIDED)) {
            Hashtables.sethash(assertion, control_vars.$mapping_answer$.getDynamicValue(thread), (SubLObject)narts_high.T);
        }
        return (SubLObject)narts_high.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 12359L)
    public static SubLObject nart_id_from_recipe(final SubLObject nart_hl_formula) {
        final SubLObject nart = nart_lookup(nart_hl_formula);
        return (SubLObject)((narts_high.NIL != nart_handles.nart_p(nart)) ? nart_handles.nart_id(nart) : narts_high.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 12509L)
    public static SubLObject nart_knows_its_hl_formulaP(final SubLObject nart) {
        return el_utilities.el_formula_p(nart_hl_formula(nart));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 12647L)
    public static SubLObject all_narts_know_their_hl_formulasP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject badP = (SubLObject)narts_high.NIL;
        final SubLObject idx = nart_handles.do_narts_table();
        final SubLObject mess = (SubLObject)narts_high.$str51$Looking_for_bad_narts;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)narts_high.ZERO_INTEGER;
        assert narts_high.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)narts_high.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)narts_high.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)narts_high.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$8 = idx;
                if (narts_high.NIL == id_index.id_index_objects_empty_p(idx_$8, (SubLObject)narts_high.$kw53$SKIP)) {
                    final SubLObject idx_$9 = idx_$8;
                    if (narts_high.NIL == id_index.id_index_dense_objects_empty_p(idx_$9, (SubLObject)narts_high.$kw53$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$9);
                        final SubLObject backwardP_var = (SubLObject)narts_high.NIL;
                        final SubLObject length = Sequences.length(vector_var);
                        SubLObject current;
                        final SubLObject datum = current = (SubLObject)((narts_high.NIL != backwardP_var) ? ConsesLow.list(Numbers.subtract(length, (SubLObject)narts_high.ONE_INTEGER), (SubLObject)narts_high.MINUS_ONE_INTEGER, (SubLObject)narts_high.MINUS_ONE_INTEGER) : ConsesLow.list((SubLObject)narts_high.ZERO_INTEGER, length, (SubLObject)narts_high.ONE_INTEGER));
                        SubLObject start = (SubLObject)narts_high.NIL;
                        SubLObject end = (SubLObject)narts_high.NIL;
                        SubLObject delta = (SubLObject)narts_high.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)narts_high.$list54);
                        start = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)narts_high.$list54);
                        end = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)narts_high.$list54);
                        delta = current.first();
                        current = current.rest();
                        if (narts_high.NIL == current) {
                            if (narts_high.NIL == badP) {
                                SubLObject end_var;
                                SubLObject id;
                                SubLObject nart;
                                for (end_var = end, id = (SubLObject)narts_high.NIL, id = start; narts_high.NIL == badP && narts_high.NIL == subl_macros.do_numbers_endtest(id, delta, end_var); id = Numbers.add(id, delta)) {
                                    nart = Vectors.aref(vector_var, id);
                                    if (narts_high.NIL == id_index.id_index_tombstone_p(nart) || narts_high.NIL == id_index.id_index_skip_tombstones_p((SubLObject)narts_high.$kw53$SKIP)) {
                                        if (narts_high.NIL != id_index.id_index_tombstone_p(nart)) {
                                            nart = (SubLObject)narts_high.$kw53$SKIP;
                                        }
                                        if (narts_high.NIL == nart_knows_its_hl_formulaP(nart)) {
                                            badP = (SubLObject)narts_high.T;
                                        }
                                        sofar = Numbers.add(sofar, (SubLObject)narts_high.ONE_INTEGER);
                                        utilities_macros.note_percent_progress(sofar, total);
                                    }
                                }
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)narts_high.$list54);
                        }
                    }
                    final SubLObject idx_$10 = idx_$8;
                    if (narts_high.NIL == id_index.id_index_sparse_objects_empty_p(idx_$10) || narts_high.NIL == id_index.id_index_skip_tombstones_p((SubLObject)narts_high.$kw53$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$10);
                        SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$10);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$10);
                        final SubLObject v_default = (SubLObject)((narts_high.NIL != id_index.id_index_skip_tombstones_p((SubLObject)narts_high.$kw53$SKIP)) ? narts_high.NIL : narts_high.$kw53$SKIP);
                        while (id2.numL(end_id) && narts_high.NIL == badP) {
                            final SubLObject nart2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                            if (narts_high.NIL == id_index.id_index_skip_tombstones_p((SubLObject)narts_high.$kw53$SKIP) || narts_high.NIL == id_index.id_index_tombstone_p(nart2)) {
                                if (narts_high.NIL == nart_knows_its_hl_formulaP(nart2)) {
                                    badP = (SubLObject)narts_high.T;
                                }
                                sofar = Numbers.add(sofar, (SubLObject)narts_high.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            id2 = Numbers.add(id2, (SubLObject)narts_high.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)narts_high.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(narts_high.NIL == badP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 12869L)
    public static SubLObject narts_that_dont_know_their_hl_formulas() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject bad_narts = (SubLObject)narts_high.NIL;
        final SubLObject idx = nart_handles.do_narts_table();
        final SubLObject mess = (SubLObject)narts_high.$str51$Looking_for_bad_narts;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)narts_high.ZERO_INTEGER;
        assert narts_high.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)narts_high.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)narts_high.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)narts_high.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$12 = idx;
                if (narts_high.NIL == id_index.id_index_objects_empty_p(idx_$12, (SubLObject)narts_high.$kw53$SKIP)) {
                    final SubLObject idx_$13 = idx_$12;
                    if (narts_high.NIL == id_index.id_index_dense_objects_empty_p(idx_$13, (SubLObject)narts_high.$kw53$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$13);
                        final SubLObject backwardP_var = (SubLObject)narts_high.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject nart;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)narts_high.NIL, v_iteration = (SubLObject)narts_high.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)narts_high.ONE_INTEGER)) {
                            id = ((narts_high.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)narts_high.ONE_INTEGER) : v_iteration);
                            nart = Vectors.aref(vector_var, id);
                            if (narts_high.NIL == id_index.id_index_tombstone_p(nart) || narts_high.NIL == id_index.id_index_skip_tombstones_p((SubLObject)narts_high.$kw53$SKIP)) {
                                if (narts_high.NIL != id_index.id_index_tombstone_p(nart)) {
                                    nart = (SubLObject)narts_high.$kw53$SKIP;
                                }
                                if (narts_high.NIL == nart_knows_its_hl_formulaP(nart)) {
                                    bad_narts = (SubLObject)ConsesLow.cons(nart, bad_narts);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)narts_high.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$14 = idx_$12;
                    if (narts_high.NIL == id_index.id_index_sparse_objects_empty_p(idx_$14) || narts_high.NIL == id_index.id_index_skip_tombstones_p((SubLObject)narts_high.$kw53$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$14);
                        SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$14);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$14);
                        final SubLObject v_default = (SubLObject)((narts_high.NIL != id_index.id_index_skip_tombstones_p((SubLObject)narts_high.$kw53$SKIP)) ? narts_high.NIL : narts_high.$kw53$SKIP);
                        while (id2.numL(end_id)) {
                            final SubLObject nart2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                            if (narts_high.NIL == id_index.id_index_skip_tombstones_p((SubLObject)narts_high.$kw53$SKIP) || narts_high.NIL == id_index.id_index_tombstone_p(nart2)) {
                                if (narts_high.NIL == nart_knows_its_hl_formulaP(nart2)) {
                                    bad_narts = (SubLObject)ConsesLow.cons(nart2, bad_narts);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)narts_high.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            id2 = Numbers.add(id2, (SubLObject)narts_high.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$15 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)narts_high.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return bad_narts;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 13096L)
    public static SubLObject nart_findable_by_hl_formulaP(final SubLObject nart) {
        final SubLObject nart_hl_formula = nart_hl_formula(nart);
        final SubLObject found_nart = find_nart(nart_hl_formula);
        return Equality.eql(nart, found_nart);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 13276L)
    public static SubLObject cleanup_invalid_nart(final SubLObject nart_hl_formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (narts_high.NIL != el_utilities.possibly_naut_p(nart_hl_formula)) {
            final SubLObject ans = (SubLObject)narts_high.NIL;
            final SubLObject l_index = kb_indexing.best_nat_lookup_index(nart_hl_formula, (SubLObject)narts_high.NIL);
            final SubLObject pcase_var;
            final SubLObject method = pcase_var = kb_mapping_macros.do_nli_extract_method(l_index);
            if (pcase_var.eql((SubLObject)narts_high.$kw55$NART_ARG)) {
                thread.resetMultipleValues();
                final SubLObject v_term = kb_mapping_macros.do_nli_vna_extract_keys(l_index);
                final SubLObject argnum = thread.secondMultipleValue();
                final SubLObject functor = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (narts_high.NIL != argnum) {
                    if (narts_high.NIL != functor) {
                        if (narts_high.NIL != kb_mapping_macros.do_nart_arg_index_key_validator(v_term, argnum, functor)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(v_term, argnum, functor);
                            SubLObject done_var = ans;
                            final SubLObject token_var = (SubLObject)narts_high.NIL;
                            while (narts_high.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (narts_high.NIL != valid) {
                                    SubLObject final_index_iterator = (SubLObject)narts_high.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)narts_high.$kw56$GAF, (SubLObject)narts_high.NIL, (SubLObject)narts_high.NIL);
                                        SubLObject done_var_$16 = ans;
                                        final SubLObject token_var_$17 = (SubLObject)narts_high.NIL;
                                        while (narts_high.NIL == done_var_$16) {
                                            final SubLObject tou_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$17);
                                            final SubLObject valid_$18 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$17.eql(tou_assertion));
                                            if (narts_high.NIL != valid_$18 && narts_high.NIL != assertion_handles.valid_assertionP(tou_assertion, (SubLObject)narts_high.UNPROVIDED)) {
                                                final SubLObject naut = assertions_high.gaf_arg2(tou_assertion);
                                                if (narts_high.NIL != el_utilities.possibly_naut_p(naut) && narts_high.NIL != Functions.funcall(control_vars.$nat_matching_predicate$.getDynamicValue(thread), naut, nart_hl_formula)) {
                                                    final SubLObject nart = assertions_high.gaf_arg1(tou_assertion);
                                                    if (narts_high.NIL == nart_handles.valid_nartP(nart, (SubLObject)narts_high.UNPROVIDED)) {
                                                        return tms.tms_remove_assertion(tou_assertion);
                                                    }
                                                }
                                            }
                                            done_var_$16 = (SubLObject)SubLObjectFactory.makeBoolean(narts_high.NIL == valid_$18 || narts_high.NIL != ans);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)narts_high.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            if (narts_high.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(narts_high.NIL == valid || narts_high.NIL != ans);
                            }
                        }
                    }
                    else if (narts_high.NIL != kb_mapping_macros.do_nart_arg_index_key_validator(v_term, argnum, (SubLObject)narts_high.NIL)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(v_term, argnum, (SubLObject)narts_high.NIL);
                        SubLObject done_var = ans;
                        final SubLObject token_var = (SubLObject)narts_high.NIL;
                        while (narts_high.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (narts_high.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)narts_high.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)narts_high.$kw56$GAF, (SubLObject)narts_high.NIL, (SubLObject)narts_high.NIL);
                                    SubLObject done_var_$17 = ans;
                                    final SubLObject token_var_$18 = (SubLObject)narts_high.NIL;
                                    while (narts_high.NIL == done_var_$17) {
                                        final SubLObject tou_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$18);
                                        final SubLObject valid_$19 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$18.eql(tou_assertion));
                                        if (narts_high.NIL != valid_$19 && narts_high.NIL != assertion_handles.valid_assertionP(tou_assertion, (SubLObject)narts_high.UNPROVIDED)) {
                                            final SubLObject naut = assertions_high.gaf_arg2(tou_assertion);
                                            if (narts_high.NIL != el_utilities.possibly_naut_p(naut) && narts_high.NIL != Functions.funcall(control_vars.$nat_matching_predicate$.getDynamicValue(thread), naut, nart_hl_formula)) {
                                                final SubLObject nart = assertions_high.gaf_arg1(tou_assertion);
                                                if (narts_high.NIL == nart_handles.valid_nartP(nart, (SubLObject)narts_high.UNPROVIDED)) {
                                                    return tms.tms_remove_assertion(tou_assertion);
                                                }
                                            }
                                        }
                                        done_var_$17 = (SubLObject)SubLObjectFactory.makeBoolean(narts_high.NIL == valid_$19 || narts_high.NIL != ans);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)narts_high.T, thread);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        if (narts_high.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(narts_high.NIL == valid || narts_high.NIL != ans);
                        }
                    }
                }
                else if (narts_high.NIL != functor) {
                    if (narts_high.NIL != kb_mapping_macros.do_nart_arg_index_key_validator(v_term, (SubLObject)narts_high.NIL, functor)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(v_term, (SubLObject)narts_high.NIL, functor);
                        SubLObject done_var = ans;
                        final SubLObject token_var = (SubLObject)narts_high.NIL;
                        while (narts_high.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (narts_high.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)narts_high.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)narts_high.$kw56$GAF, (SubLObject)narts_high.NIL, (SubLObject)narts_high.NIL);
                                    SubLObject done_var_$18 = ans;
                                    final SubLObject token_var_$19 = (SubLObject)narts_high.NIL;
                                    while (narts_high.NIL == done_var_$18) {
                                        final SubLObject tou_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$19);
                                        final SubLObject valid_$20 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$19.eql(tou_assertion));
                                        if (narts_high.NIL != valid_$20 && narts_high.NIL != assertion_handles.valid_assertionP(tou_assertion, (SubLObject)narts_high.UNPROVIDED)) {
                                            final SubLObject naut = assertions_high.gaf_arg2(tou_assertion);
                                            if (narts_high.NIL != el_utilities.possibly_naut_p(naut) && narts_high.NIL != Functions.funcall(control_vars.$nat_matching_predicate$.getDynamicValue(thread), naut, nart_hl_formula)) {
                                                final SubLObject nart = assertions_high.gaf_arg1(tou_assertion);
                                                if (narts_high.NIL == nart_handles.valid_nartP(nart, (SubLObject)narts_high.UNPROVIDED)) {
                                                    return tms.tms_remove_assertion(tou_assertion);
                                                }
                                            }
                                        }
                                        done_var_$18 = (SubLObject)SubLObjectFactory.makeBoolean(narts_high.NIL == valid_$20 || narts_high.NIL != ans);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)narts_high.T, thread);
                                        final SubLObject _values3 = Values.getValuesAsVector();
                                        if (narts_high.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values3);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(narts_high.NIL == valid || narts_high.NIL != ans);
                        }
                    }
                }
                else if (narts_high.NIL != kb_mapping_macros.do_nart_arg_index_key_validator(v_term, (SubLObject)narts_high.NIL, (SubLObject)narts_high.NIL)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(v_term, (SubLObject)narts_high.NIL, (SubLObject)narts_high.NIL);
                    SubLObject done_var = ans;
                    final SubLObject token_var = (SubLObject)narts_high.NIL;
                    while (narts_high.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (narts_high.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)narts_high.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)narts_high.$kw56$GAF, (SubLObject)narts_high.NIL, (SubLObject)narts_high.NIL);
                                SubLObject done_var_$19 = ans;
                                final SubLObject token_var_$20 = (SubLObject)narts_high.NIL;
                                while (narts_high.NIL == done_var_$19) {
                                    final SubLObject tou_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$20);
                                    final SubLObject valid_$21 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$20.eql(tou_assertion));
                                    if (narts_high.NIL != valid_$21 && narts_high.NIL != assertion_handles.valid_assertionP(tou_assertion, (SubLObject)narts_high.UNPROVIDED)) {
                                        final SubLObject naut = assertions_high.gaf_arg2(tou_assertion);
                                        if (narts_high.NIL != el_utilities.possibly_naut_p(naut) && narts_high.NIL != Functions.funcall(control_vars.$nat_matching_predicate$.getDynamicValue(thread), naut, nart_hl_formula)) {
                                            final SubLObject nart = assertions_high.gaf_arg1(tou_assertion);
                                            if (narts_high.NIL == nart_handles.valid_nartP(nart, (SubLObject)narts_high.UNPROVIDED)) {
                                                return tms.tms_remove_assertion(tou_assertion);
                                            }
                                        }
                                    }
                                    done_var_$19 = (SubLObject)SubLObjectFactory.makeBoolean(narts_high.NIL == valid_$21 || narts_high.NIL != ans);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)narts_high.T, thread);
                                    final SubLObject _values4 = Values.getValuesAsVector();
                                    if (narts_high.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values4);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(narts_high.NIL == valid || narts_high.NIL != ans);
                    }
                }
            }
            else if (pcase_var.eql((SubLObject)narts_high.$kw57$FUNCTION_EXTENT)) {
                if (narts_high.NIL != kb_mapping_macros.do_function_extent_index_key_validator(kb_mapping_macros.do_nli_vfe_extract_key(l_index))) {
                    final SubLObject final_index_spec2 = kb_mapping_macros.function_extent_final_index_spec(kb_mapping_macros.do_nli_vfe_extract_key(l_index));
                    SubLObject final_index_iterator2 = (SubLObject)narts_high.NIL;
                    try {
                        final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)narts_high.$kw56$GAF, (SubLObject)narts_high.NIL, (SubLObject)narts_high.NIL);
                        SubLObject done_var2 = ans;
                        final SubLObject token_var2 = (SubLObject)narts_high.NIL;
                        while (narts_high.NIL == done_var2) {
                            final SubLObject tou_assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var2);
                            final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(tou_assertion2));
                            if (narts_high.NIL != valid2 && narts_high.NIL != assertion_handles.valid_assertionP(tou_assertion2, (SubLObject)narts_high.UNPROVIDED)) {
                                final SubLObject naut2 = assertions_high.gaf_arg2(tou_assertion2);
                                if (narts_high.NIL != el_utilities.possibly_naut_p(naut2) && narts_high.NIL != Functions.funcall(control_vars.$nat_matching_predicate$.getDynamicValue(thread), naut2, nart_hl_formula)) {
                                    final SubLObject nart2 = assertions_high.gaf_arg1(tou_assertion2);
                                    if (narts_high.NIL == nart_handles.valid_nartP(nart2, (SubLObject)narts_high.UNPROVIDED)) {
                                        return tms.tms_remove_assertion(tou_assertion2);
                                    }
                                }
                            }
                            done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(narts_high.NIL == valid2 || narts_high.NIL != ans);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)narts_high.T, thread);
                            final SubLObject _values5 = Values.getValuesAsVector();
                            if (narts_high.NIL != final_index_iterator2) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                            }
                            Values.restoreValuesFromVector(_values5);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
                        }
                    }
                }
            }
            else if (pcase_var.eql((SubLObject)narts_high.$kw58$OVERLAP)) {
                SubLObject rest;
                SubLObject tou_assertion3;
                SubLObject naut3;
                SubLObject nart3;
                for (rest = (SubLObject)narts_high.NIL, rest = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_nli_vo_extract_key(l_index), (SubLObject)narts_high.UNPROVIDED); narts_high.NIL == ans && narts_high.NIL != rest; rest = rest.rest()) {
                    tou_assertion3 = rest.first();
                    if (narts_high.NIL != assertion_handles.valid_assertionP(tou_assertion3, (SubLObject)narts_high.UNPROVIDED)) {
                        naut3 = assertions_high.gaf_arg2(tou_assertion3);
                        if (narts_high.NIL != el_utilities.possibly_naut_p(naut3) && narts_high.NIL != Functions.funcall(control_vars.$nat_matching_predicate$.getDynamicValue(thread), naut3, nart_hl_formula)) {
                            nart3 = assertions_high.gaf_arg1(tou_assertion3);
                            if (narts_high.NIL == nart_handles.valid_nartP(nart3, (SubLObject)narts_high.UNPROVIDED)) {
                                return tms.tms_remove_assertion(tou_assertion3);
                            }
                        }
                    }
                }
            }
            else {
                kb_mapping_macros.do_nli_method_error(l_index, method);
            }
            return ans;
        }
        return (SubLObject)narts_high.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 14001L)
    public static SubLObject narts_around_nart(final SubLObject nart, SubLObject total, SubLObject before, SubLObject after) {
        if (total == narts_high.UNPROVIDED) {
            total = (SubLObject)narts_high.$int59$100;
        }
        if (before == narts_high.UNPROVIDED) {
            before = (SubLObject)narts_high.ZERO_INTEGER;
        }
        if (after == narts_high.UNPROVIDED) {
            after = Numbers.subtract(total, before);
        }
        assert narts_high.NIL != nart_handles.nart_p(nart) : nart;
        return narts_around(nart_handles.nart_id(nart), total, before, after);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 14386L)
    public static SubLObject narts_around(final SubLObject nart_id, SubLObject total, SubLObject before, SubLObject after) {
        if (total == narts_high.UNPROVIDED) {
            total = (SubLObject)narts_high.$int59$100;
        }
        if (before == narts_high.UNPROVIDED) {
            before = (SubLObject)narts_high.ZERO_INTEGER;
        }
        if (after == narts_high.UNPROVIDED) {
            after = Numbers.subtract(total, before);
        }
        assert narts_high.NIL != subl_promotions.non_negative_integer_p(nart_id) : nart_id;
        return assertions_high.kb_objects_around_id((SubLObject)narts_high.$sym60$FIND_NART_BY_ID, (SubLObject)narts_high.ZERO_INTEGER, nart_id, nart_handles.next_nart_id(), total, before, after);
    }
    
    public static SubLObject declare_narts_high_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.narts_high", "do_recent_narts", "DO-RECENT-NARTS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_high", "nart_hl_formula", "NART-HL-FORMULA", 1, 0, false);
        new $nart_hl_formula$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_high", "nart_lookup", "NART-LOOKUP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_high", "naut_p", "NAUT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_high", "invalid_nartP", "INVALID-NART?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_high", "invalid_nart_robustP", "INVALID-NART-ROBUST?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_high", "nart_el_formula", "NART-EL-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_high", "find_nart", "FIND-NART", 1, 0, false);
        new $find_nart$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_high", "random_nart", "RANDOM-NART", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_high", "sample_narts", "SAMPLE-NARTS", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_high", "hl_find_or_create_nart", "HL-FIND-OR-CREATE-NART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_high", "tl_find_or_create_nart", "TL-FIND-OR-CREATE-NART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_high", "find_or_create_nart", "FIND-OR-CREATE-NART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_high", "remove_dependent_narts", "REMOVE-DEPENDENT-NARTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_high", "remove_nart", "REMOVE-NART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_high", "nart_expand", "NART-EXPAND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_high", "nart_substitute", "NART-SUBSTITUTE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_high", "nart_substitute_recursive", "NART-SUBSTITUTE-RECURSIVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_high", "contains_nat_formula_as_elementP", "CONTAINS-NAT-FORMULA-AS-ELEMENT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_high", "nart_with_functor_p", "NART-WITH-FUNCTOR-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_high", "nart_checkpoint_p", "NART-CHECKPOINT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_high", "new_nart_checkpoint", "NEW-NART-CHECKPOINT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_high", "nart_checkpoint_currentP", "NART-CHECKPOINT-CURRENT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_high", "nart_dump_id", "NART-DUMP-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_high", "find_nart_by_dump_id", "FIND-NART-BY-DUMP-ID", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.narts_high", "with_nart_dump_id_table", "WITH-NART-DUMP-ID-TABLE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_high", "useful_nartP", "USEFUL-NART?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_high", "useless_nartP", "USELESS-NART?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_high", "nart_specified_to_be_retainedP", "NART-SPECIFIED-TO-BE-RETAINED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_high", "skolemize_forward_nartP", "SKOLEMIZE-FORWARD-NART?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_high", "appears_in_forward_reification_ruleP", "APPEARS-IN-FORWARD-REIFICATION-RULE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_high", "nart_dependent_assertions", "NART-DEPENDENT-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_high", "nart_independent_assertions", "NART-INDEPENDENT-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_high", "nart_independent_assertions_internal", "NART-INDEPENDENT-ASSERTIONS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_high", "nart_id_from_recipe", "NART-ID-FROM-RECIPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_high", "nart_knows_its_hl_formulaP", "NART-KNOWS-ITS-HL-FORMULA?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_high", "all_narts_know_their_hl_formulasP", "ALL-NARTS-KNOW-THEIR-HL-FORMULAS?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_high", "narts_that_dont_know_their_hl_formulas", "NARTS-THAT-DONT-KNOW-THEIR-HL-FORMULAS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_high", "nart_findable_by_hl_formulaP", "NART-FINDABLE-BY-HL-FORMULA?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_high", "cleanup_invalid_nart", "CLEANUP-INVALID-NART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_high", "narts_around_nart", "NARTS-AROUND-NART", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_high", "narts_around", "NARTS-AROUND", 1, 3, false);
        return (SubLObject)narts_high.NIL;
    }
    
    public static SubLObject init_narts_high_file() {
        narts_high.$nart_dump_id_table$ = SubLFiles.defparameter("*NART-DUMP-ID-TABLE*", (SubLObject)narts_high.NIL);
        return (SubLObject)narts_high.NIL;
    }
    
    public static SubLObject setup_narts_high_file() {
        utilities_macros.register_cyc_api_function((SubLObject)narts_high.$sym14$NART_HL_FORMULA, (SubLObject)narts_high.$list15, (SubLObject)narts_high.$str16$Return_the_hl_formula_of_this_NAR, (SubLObject)narts_high.$list17, (SubLObject)narts_high.$list18);
        utilities_macros.register_cyc_api_function((SubLObject)narts_high.$sym19$NAUT_P, (SubLObject)narts_high.$list20, (SubLObject)narts_high.$str21$Return_T_iff_OBJECT_is_a_datastru, (SubLObject)narts_high.NIL, (SubLObject)narts_high.$list22);
        utilities_macros.register_cyc_api_function((SubLObject)narts_high.$sym23$NART_EL_FORMULA, (SubLObject)narts_high.$list15, (SubLObject)narts_high.$str24$Return_the_el_formula_of_this_NAR, (SubLObject)narts_high.$list17, (SubLObject)narts_high.$list18);
        utilities_macros.register_cyc_api_function((SubLObject)narts_high.$sym27$RANDOM_NART, (SubLObject)narts_high.$list28, (SubLObject)narts_high.$str29$Return_a_randomly_chosen_NART_tha, (SubLObject)narts_high.NIL, (SubLObject)narts_high.$list30);
        access_macros.define_obsolete_register((SubLObject)narts_high.$sym33$HL_FIND_OR_CREATE_NART, (SubLObject)narts_high.$list34);
        access_macros.define_obsolete_register((SubLObject)narts_high.$sym35$FIND_OR_CREATE_NART, (SubLObject)narts_high.$list36);
        utilities_macros.register_cyc_api_function((SubLObject)narts_high.$sym39$REMOVE_NART, (SubLObject)narts_high.$list15, (SubLObject)narts_high.$str40$Remove_NART_from_the_KB_, (SubLObject)narts_high.$list17, (SubLObject)narts_high.$list41);
        return (SubLObject)narts_high.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_narts_high_file();
    }
    
    @Override
	public void initializeVariables() {
        init_narts_high_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_narts_high_file();
    }
    
    static {
        me = (SubLFile)new narts_high();
        narts_high.$nart_dump_id_table$ = null;
        $list0 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("NUM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeString("mapping narts for sweep")), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NUM"), (SubLObject)SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw2$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw3$NUM = SubLObjectFactory.makeKeyword("NUM");
        $kw4$PROGRESS_MESSAGE = SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE");
        $str5$mapping_narts_for_sweep = SubLObjectFactory.makeString("mapping narts for sweep");
        $kw6$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym7$PIF = SubLObjectFactory.makeSymbol("PIF");
        $sym8$POSITIVE_INTEGER_P = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $sym9$PROGRESS_CSOME = SubLObjectFactory.makeSymbol("PROGRESS-CSOME");
        $sym10$NARTS_AROUND = SubLObjectFactory.makeSymbol("NARTS-AROUND");
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEXT-NART-ID"));
        $sym12$DO_NARTS = SubLObjectFactory.makeSymbol("DO-NARTS");
        $sym13$NART_P = SubLObjectFactory.makeSymbol("NART-P");
        $sym14$NART_HL_FORMULA = SubLObjectFactory.makeSymbol("NART-HL-FORMULA");
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NART"));
        $str16$Return_the_hl_formula_of_this_NAR = SubLObjectFactory.makeString("Return the hl formula of this NART.");
        $list17 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NART"), (SubLObject)SubLObjectFactory.makeSymbol("NART-P")));
        $list18 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NIL-OR"), (SubLObject)SubLObjectFactory.makeSymbol("CONSP")));
        $sym19$NAUT_P = SubLObjectFactory.makeSymbol("NAUT-P");
        $list20 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT"));
        $str21$Return_T_iff_OBJECT_is_a_datastru = SubLObjectFactory.makeString("Return T iff OBJECT is a datastructure implementing a non-atomic unreified term (NAUT).\n   By definition, this satisies @xref CYCL-NAT-P but not @xref NART-P.");
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"));
        $sym23$NART_EL_FORMULA = SubLObjectFactory.makeSymbol("NART-EL-FORMULA");
        $str24$Return_the_el_formula_of_this_NAR = SubLObjectFactory.makeString("Return the el formula of this NART.");
        $sym25$POSSIBLY_NAUT_P = SubLObjectFactory.makeSymbol("POSSIBLY-NAUT-P");
        $sym26$TRUE = SubLObjectFactory.makeSymbol("TRUE");
        $sym27$RANDOM_NART = SubLObjectFactory.makeSymbol("RANDOM-NART");
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("TRUE"))));
        $str29$Return_a_randomly_chosen_NART_tha = SubLObjectFactory.makeString("Return a randomly chosen NART that satisfies TEST");
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NART-P"));
        $int31$500 = SubLObjectFactory.makeInteger(500);
        $sym32$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $sym33$HL_FIND_OR_CREATE_NART = SubLObjectFactory.makeSymbol("HL-FIND-OR-CREATE-NART");
        $list34 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYC-FIND-OR-CREATE-NART"));
        $sym35$FIND_OR_CREATE_NART = SubLObjectFactory.makeSymbol("FIND-OR-CREATE-NART");
        $list36 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-FIND-OR-CREATE-NART"));
        $sym37$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $str38$A_horrible_and_gross_circularity_ = SubLObjectFactory.makeString("A horrible and gross circularity has occurred -- ~s is a dependent of itself!");
        $sym39$REMOVE_NART = SubLObjectFactory.makeSymbol("REMOVE-NART");
        $str40$Remove_NART_from_the_KB_ = SubLObjectFactory.makeString("Remove NART from the KB.");
        $list41 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"));
        $list42 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECKPOINT-COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("CHECKPOINT-NEXT-ID"));
        $sym43$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list44 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*NART-DUMP-ID-TABLE*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CREATE-NART-DUMP-ID-TABLE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CFASL-NART-HANDLE-FUNC*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NART-DUMP-ID"))));
        $sym45$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const46$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $kw47$RULE = SubLObjectFactory.makeKeyword("RULE");
        $const48$forwardReificationRule = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("forwardReificationRule"));
        $sym49$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $sym50$NART_INDEPENDENT_ASSERTIONS_INTERNAL = SubLObjectFactory.makeSymbol("NART-INDEPENDENT-ASSERTIONS-INTERNAL");
        $str51$Looking_for_bad_narts = SubLObjectFactory.makeString("Looking for bad narts");
        $sym52$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $kw53$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $list54 = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("START"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("END"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("DELTA"));
        $kw55$NART_ARG = SubLObjectFactory.makeKeyword("NART-ARG");
        $kw56$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw57$FUNCTION_EXTENT = SubLObjectFactory.makeKeyword("FUNCTION-EXTENT");
        $kw58$OVERLAP = SubLObjectFactory.makeKeyword("OVERLAP");
        $int59$100 = SubLObjectFactory.makeInteger(100);
        $sym60$FIND_NART_BY_ID = SubLObjectFactory.makeSymbol("FIND-NART-BY-ID");
    }
    
    public static final class $nart_hl_formula$UnaryFunction extends UnaryFunction
    {
        public $nart_hl_formula$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("NART-HL-FORMULA"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return narts_high.nart_hl_formula(arg1);
        }
    }
    
    public static final class $find_nart$UnaryFunction extends UnaryFunction
    {
        public $find_nart$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("FIND-NART"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return narts_high.find_nart(arg1);
        }
    }
}

/*

	Total time: 598 ms
	
*/