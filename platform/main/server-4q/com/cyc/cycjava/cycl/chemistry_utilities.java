/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_lparen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.digit_char_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.lower_case_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.set_nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.minus;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.pairlis;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CHEMISTRY-UTILITIES
 *  source file: /cyc/top/cycl/chemistry-utilities.lisp
 *  created:     2019/07/03 17:37:47
 */
public final class chemistry_utilities extends SubLTranslatedFile implements V02 {
    // // Constructor
    private chemistry_utilities() {
    }

    public static final SubLFile me = new chemistry_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.chemistry_utilities";





    public static final SubLObject new_atomic_composition(SubLObject element_list, SubLObject subscript_list) {
        return list(element_list, subscript_list);
    }

    /**
     * An atomic-composition is a list of two lists, the first a list of chemical
     * elements or nested atomic-compositions, the second a list of corresponding
     * subscripts, s.t. together they represent the atomic composition of some
     * chemical compound.
     */
    public static final SubLObject atomic_composition_p(SubLObject v_object) {
        if ((NIL != list_utilities.proper_list_p(v_object)) && (NIL != list_utilities.doubletonP(v_object))) {
            {
                SubLObject element_list = v_object.first();
                SubLObject subscript_list = second(v_object);
                return makeBoolean(((NIL != list_utilities.list_of_type_p(symbol_function(CHEMICAL_ELEMENT_OR_ATOMIC_COMPOSITION_P), element_list)) && (NIL != number_utilities.list_of_integer_p(subscript_list))) && (NIL != list_utilities.same_length_p(element_list, subscript_list)));
            }
        } else {
            return NIL;
        }
    }

    /**
     * A flat-atomic-composition is an atomic-composition with no nested
     * atomic-compositions and in which any chemical-element appears at most once.
     */
    public static final SubLObject flat_atomic_composition_p(SubLObject v_object) {
        if ((NIL != list_utilities.proper_list_p(v_object)) && (NIL != list_utilities.doubletonP(v_object))) {
            {
                SubLObject element_list = v_object.first();
                SubLObject subscript_list = second(v_object);
                return makeBoolean((((NIL != list_utilities.list_of_type_p(symbol_function(CHEMICAL_ELEMENT_P), element_list)) && (NIL != number_utilities.list_of_integer_p(subscript_list))) && (NIL != list_utilities.same_length_p(element_list, subscript_list))) && (NIL == list_utilities.duplicatesP(element_list, UNPROVIDED, UNPROVIDED)));
            }
        } else {
            return NIL;
        }
    }

    public static final SubLObject chemical_element_p(SubLObject v_object) {
        return isa.isaP(v_object, $$ElementStuffTypeByNumberOfProtons, $$InferencePSC, UNPROVIDED);
    }

    public static final SubLObject chemical_element_or_atomic_composition_p(SubLObject v_object) {
        return makeBoolean((NIL != chemical_element_p(v_object)) || (NIL != atomic_composition_p(v_object)));
    }

    /**
     *
     *
     * @param COMP1;
     * 		flat-atomic-composition-p
     * @param COMP2;
     * 		flat-atomic-composition-p
     * @return boolean; whether COMP1 and COMP2 represent the same atomic composition.
     */
    public static final SubLObject compositions_equalP(SubLObject comp1, SubLObject comp2) {
        {
            SubLObject element_list1 = atomic_composition_elements(comp1);
            SubLObject element_list2 = atomic_composition_elements(comp2);
            if (NIL != list_utilities.sets_equalP(element_list1, element_list2, UNPROVIDED)) {
                {
                    SubLObject cdolist_list_var = element_list1;
                    SubLObject element = NIL;
                    for (element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , element = cdolist_list_var.first()) {
                        if (!subscript_of(element, comp1).equal(subscript_of(element, comp2))) {
                            return NIL;
                        }
                    }
                }
            } else {
                return NIL;
            }
        }
        return T;
    }

    public static final SubLObject atomic_composition_elements(SubLObject composition) {
        return composition.first();
    }

    public static final SubLObject atomic_composition_subscripts(SubLObject composition) {
        return second(composition);
    }

    /**
     *
     *
     * @param ATOMIC-SYMBOL;
     * 		stringp; the atomic symbol of an element, e.g.``Na''
     * @return fort-p or NIL; the reified term representing that element, if any
     */
    public static final SubLObject kb_constant_for_element(SubLObject atomic_symbol) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mt = (NIL != mt_relevance_macros.relevant_mtP($chemistry_lexical_mt$.getGlobalValue())) ? ((SubLObject) (mt_relevance_macros.$mt$.getDynamicValue(thread))) : $chemistry_lexical_mt$.getGlobalValue();
                return backward.removal_ask_variable($sym8$_X, list($$atomicSymbol, $sym8$_X, atomic_symbol), mt, UNPROVIDED, UNPROVIDED).first();
            }
        }
    }

    /**
     *
     *
     * @param COMPOSITION;
     * 		flat-atomic-composition-p
     * @return fort-p or NIL; the reified term representing the chemical substance type
    having that atomic composition, if any
     */
    public static final SubLObject kb_constant_for_composition(SubLObject composition, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            SubLObject element_list = atomic_composition_elements(composition);
            SubLObject element_permutations = list_utilities.permute_list(element_list, UNPROVIDED);
            SubLObject cdolist_list_var = element_permutations;
            SubLObject permutation = NIL;
            for (permutation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , permutation = cdolist_list_var.first()) {
                {
                    SubLObject el_permutation = el_utilities.make_el_list(permutation, UNPROVIDED);
                    SubLObject query_args = listS($sym10$_COMPOUND, el_permutation, $list_alt11);
                    SubLObject query = el_utilities.make_el_formula($$completeAtomicComposition_List, query_args, UNPROVIDED);
                    SubLObject binding_sets = inference_kernel.new_cyc_query(query, mt, UNPROVIDED);
                    SubLObject cdolist_list_var_1 = binding_sets;
                    SubLObject binding_set = NIL;
                    for (binding_set = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , binding_set = cdolist_list_var_1.first()) {
                        {
                            SubLObject compound_type_subscripts = el_utilities.el_list_items(bindings.variable_lookup($sym13$_SUBSCRIPTS, binding_set));
                            SubLObject compound_type_composition = new_atomic_composition(permutation, compound_type_subscripts);
                            if (NIL != compositions_equalP(composition, compound_type_composition)) {
                                {
                                    SubLObject compound_type = bindings.variable_lookup($sym10$_COMPOUND, binding_set);
                                    if (NIL != function_terms.nat_formula_p(compound_type)) {
                                        compound_type = narts_high.find_nart(compound_type);
                                    }
                                    return compound_type;
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject kb_constant_for_cation(SubLObject cation_string, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $chemistry_mt$.getGlobalValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject denots = lexicon_accessors.denots_of_stringXspeech_part(cation_string, $$MassNoun, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject element = isa.find_if_isaP($$ElementStuffTypeByNumberOfProtons, denots);
                if (NIL != element) {
                    {
                        SubLObject ions_of_element = kb_ions_of_element(element, mt);
                        if (NIL != list_utilities.singletonP(ions_of_element)) {
                            return ions_of_element.first();
                        } else {
                            Errors.error($str_alt15$_A_does_not_have_precisely_one_io, element);
                        }
                    }
                }
            }
            thread.resetMultipleValues();
            {
                SubLObject valid_suffixP = decompose_cation_string(cation_string);
                SubLObject base = thread.secondMultipleValue();
                SubLObject suffix = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != valid_suffixP) {
                    {
                        SubLObject element = element_with_base_form(base);
                        if (NIL != element) {
                            {
                                SubLObject possible_valences = possible_valences(element, UNPROVIDED);
                                if (NIL != list_utilities.doubletonP(possible_valences)) {
                                    {
                                        SubLObject lesser_valence = apply(symbol_function(MIN), possible_valences);
                                        SubLObject greater_valence = apply(symbol_function(MAX), possible_valences);
                                        SubLObject valence = NIL;
                                        if (NIL != Strings.string_equal(suffix, $$$ous, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                            valence = lesser_valence;
                                        } else
                                            if (NIL != Strings.string_equal(suffix, $$$ic, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                                valence = greater_valence;
                                            } else {
                                                Errors.error($str_alt20$_S_is_not_a_recognized_cation_suf, suffix);
                                            }

                                        {
                                            SubLObject ion = kb_ion_of_element_with_valence(element, valence, mt);
                                            if (NIL != ion) {
                                                return ion;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            {
                SubLObject full_string = cconcatenate(cation_string, $str_alt21$_ion);
                SubLObject denots_full = lexicon_accessors.denots_of_stringXspeech_part(full_string, $$CountNoun, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != denots_full) {
                    return denots_full.first();
                }
            }
            Errors.error($str_alt23$Cannot_parse__S_as_a_cation_name, cation_string);
            return NIL;
        }
    }

    /**
     *
     *
     * @return 0: boolean; whether a valid ion suffix was found
     * @return 1: stringp or NIL; the word minus the suffix, if it had a valid suffix
     * @return 2: stringp or NIL; the suffix, if there was a valid suffix
     */
    public static final SubLObject decompose_cation_string(SubLObject cation_string) {
        {
            SubLObject ion_suffixes = $list_alt24;
            SubLObject ion_suffix_max_length = apply(symbol_function(MAX), Mapping.mapcar(symbol_function(LENGTH), ion_suffixes));
            SubLObject base = cation_string;
            SubLObject suffix = $str_alt26$;
            SubLObject suffix_length = NIL;
            for (suffix_length = ZERO_INTEGER; suffix_length.numL(ion_suffix_max_length); suffix_length = add(suffix_length, ONE_INTEGER)) {
                suffix = string_utilities.pre_add_character_to_string(string_utilities.last_char(base), suffix);
                base = string_utilities.string_butlast(base);
                if (NIL != subl_promotions.memberP(suffix, ion_suffixes, symbol_function(STRING_EQUAL), UNPROVIDED)) {
                    return values(T, base, suffix);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject kb_constant_for_anion(SubLObject anion_string) {
        {
            SubLObject full_string = cconcatenate(anion_string, $str_alt21$_ion);
            SubLObject denots_full = lexicon_accessors.denots_of_stringXspeech_part(full_string, $$CountNoun, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != denots_full) {
                return denots_full.first();
            }
        }
        Errors.error($str_alt28$Cannot_parse__S_as_an_anion_name, anion_string);
        return NIL;
    }

    /**
     *
     *
     * @return fort-p or NIL; the first (if any) ion it finds in the KB that is composed
    of ELEMENT only.  If VALENCE is non-nil, then
    the ion must have the valence VALENCE
     */
    public static final SubLObject kb_ion_of_element_with_valence(SubLObject element, SubLObject valence, SubLObject mt) {
        if (valence == UNPROVIDED) {
            valence = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = $chemistry_mt$.getGlobalValue();
        }
        {
            SubLObject valence_clause = (NIL != valence) ? ((SubLObject) (list($$relationAllInstance, $$chargeOfObject, $sym8$_X, list($$ElectronicCharge, valence)))) : $$True;
            return ask_utilities.ask_variable($sym8$_X, list($$thereExists, $sym34$_SUBSCRIPT_LIST, list($$and, $list_alt36, listS($$completeAtomicComposition_List, $list_alt37, list($$TheList, element), $list_alt39), valence_clause)), mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).first();
        }
    }

    /**
     *
     *
     * @return listp of fort-p; all ions it finds in the KB that are composed
    of ELEMENT only, i.e. they are monoelemental.
     */
    public static final SubLObject kb_ions_of_element(SubLObject element, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $chemistry_mt$.getGlobalValue();
        }
        return ask_utilities.ask_variable($sym8$_X, list($$thereExists, $sym34$_SUBSCRIPT_LIST, list($$and, $list_alt36, listS($$completeAtomicComposition_List, $list_alt37, list($$TheList, element), $list_alt39))), mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return fort-p or NIL; the reified term representing the ionic compound type
    having the ions CATION and ANION, if any
     */
    public static final SubLObject kb_compound_of_ions(SubLObject cation, SubLObject anion, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return backward.removal_ask_variable($sym8$_X, list($$ionicDecomposition, $sym8$_X, cation, variables.get_variable(ONE_INTEGER), anion, variables.get_variable(TWO_INTEGER)), mt, UNPROVIDED, UNPROVIDED).first();
    }

    public static final SubLObject element_with_base_form(SubLObject base) {
        if (NIL != Strings.string_equal(base, $$$cupr, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return $$Copper;
        } else
            if (NIL != Strings.string_equal(base, $$$ferr, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                return $$Iron;
            } else
                if (NIL != Strings.string_equal(base, $$$mercur, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    return $$Mercury;
                } else
                    if (NIL != Strings.string_equal(base, $$$plumb, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        return $$Lead;
                    } else
                        if (NIL != Strings.string_equal(base, $$$stann, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            return $$Tin;
                        } else
                            if (NIL != Strings.string_equal(base, $$$wolfr, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                return $$Tungsten;
                            } else
                                if (NIL != Strings.string_equal(base, $$$aur, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                    return $$Gold;
                                }






        return NIL;
    }

    public static final SubLObject possible_valences(SubLObject element, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $chemistry_mt$.getGlobalValue();
        }
        return kb_mapping_utilities.pred_values_in_mt(element, $$valence_Possible, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject reaction_type_in_aqueous_solutionP(SubLObject reaction_type, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return inference_kernel.new_cyc_query(list($$thereExists, $sym56$_SOLUTION, listS($$and, list($$reactionTypeInMixture, $sym56$_SOLUTION, reaction_type), $list_alt58)), NIL != mt ? ((SubLObject) (mt)) : mt_relevance_macros.$mt$.getDynamicValue(thread), UNPROVIDED);
        }
    }

    public static final SubLObject generate_matrix(SubLObject reaction_type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject missing_gafsP = reaction_type_relevant_knowledge(reaction_type);
                SubLObject chemical_equation_unbalanced_gaf = thread.secondMultipleValue();
                SubLObject atomic_composition_of_reactant_gafs = thread.thirdMultipleValue();
                SubLObject atomic_composition_of_product_gafs = thread.fourthMultipleValue();
                SubLObject num_products = thread.fifthMultipleValue();
                SubLObject element_list = thread.sixthMultipleValue();
                thread.resetMultipleValues();
                if (NIL != missing_gafsP) {
                    return NIL;
                } else {
                    {
                        SubLObject list_of_atomic_compositions_of_reactants = extract_atomic_compositions(atomic_composition_of_reactant_gafs);
                        SubLObject list_of_atomic_compositions_of_products = extract_atomic_compositions(atomic_composition_of_product_gafs);
                        return generate_matrix_int(list_of_atomic_compositions_of_reactants, list_of_atomic_compositions_of_products, element_list, num_products);
                    }
                }
            }
        }
    }

    public static final SubLObject chemical_formula_matrix(SubLObject formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject list_of_atomic_compositions_of_reactants = NIL;
                SubLObject list_of_atomic_compositions_of_products = NIL;
                SubLObject element_list = NIL;
                SubLObject num_products = NIL;
                SubLObject pcase_var = cycl_utilities.formula_arg0(formula);
                if (pcase_var.eql($$chemicalEquation_Balanced)) {
                    {
                        SubLObject datum = cycl_utilities.formula_args(formula, UNPROVIDED);
                        SubLObject current = datum;
                        SubLObject reaction_type = NIL;
                        SubLObject el_reactants = NIL;
                        SubLObject el_reactant_coeffs = NIL;
                        SubLObject el_products = NIL;
                        SubLObject el_product_coeffs = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt60);
                        reaction_type = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt60);
                        el_reactants = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt60);
                        el_reactant_coeffs = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt60);
                        el_products = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt60);
                        el_product_coeffs = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                    {
                                        SubLObject atomic_composition_of_reactant_gafs = atomic_composition_gafs(el_reactants);
                                        SubLObject atomic_composition_of_product_gafs = atomic_composition_gafs(el_products);
                                        if (atomic_composition_of_reactant_gafs.isList() && atomic_composition_of_product_gafs.isList()) {
                                            list_of_atomic_compositions_of_reactants = extract_atomic_compositions(atomic_composition_of_reactant_gafs);
                                            list_of_atomic_compositions_of_products = extract_atomic_compositions(atomic_composition_of_product_gafs);
                                            element_list = element_list_for_reaction_type(reaction_type);
                                            num_products = el_utilities.formula_arity(el_products, UNPROVIDED);
                                        }
                                    }
                                } finally {
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt60);
                        }
                    }
                }
                return (((NIL != list_utilities.proper_list_p(list_of_atomic_compositions_of_reactants)) && (NIL != list_utilities.proper_list_p(list_of_atomic_compositions_of_products))) && (NIL != list_utilities.proper_list_p(element_list))) && (NIL != subl_promotions.positive_integer_p(num_products)) ? ((SubLObject) (generate_matrix_int(list_of_atomic_compositions_of_reactants, list_of_atomic_compositions_of_products, element_list, num_products))) : NIL;
            }
        }
    }

    public static final SubLObject generate_matrix_int(SubLObject list_of_atomic_compositions_of_reactants, SubLObject list_of_atomic_compositions_of_products, SubLObject element_list, SubLObject num_products) {
        {
            SubLObject matrix = NIL;
            SubLObject cdolist_list_var = element_list;
            SubLObject element = NIL;
            for (element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , element = cdolist_list_var.first()) {
                {
                    SubLObject row = NIL;
                    {
                        SubLObject cdolist_list_var_2 = list_of_atomic_compositions_of_reactants;
                        SubLObject atomic_composition = NIL;
                        for (atomic_composition = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , atomic_composition = cdolist_list_var_2.first()) {
                            {
                                SubLObject subscript = subscript_of(element, atomic_composition);
                                row = cons(subscript, row);
                            }
                        }
                    }
                    {
                        SubLObject list_var = NIL;
                        SubLObject atomic_composition = NIL;
                        SubLObject index = NIL;
                        for (list_var = list_of_atomic_compositions_of_products, atomic_composition = list_var.first(), index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , atomic_composition = list_var.first() , index = add(ONE_INTEGER, index)) {
                            {
                                SubLObject subscript = subscript_of(element, atomic_composition);
                                if (index.numL(number_utilities.f_1_(num_products))) {
                                    row = cons(minus(subscript), row);
                                } else {
                                    row = cons(subscript, row);
                                }
                            }
                        }
                    }
                    {
                        SubLObject el_row = el_utilities.make_el_list(nreverse(row), UNPROVIDED);
                        matrix = cons(el_row, matrix);
                    }
                }
            }
            return el_utilities.make_el_list(nreverse(matrix), UNPROVIDED);
        }
    }

    /**
     * Returns all of the assertions that are required in order to generate
     * the matrix of REACTION-TYPE, as well as lists of the reactants,
     * products and elements involved in REACTION-TYPE,
     * or T if any assertions are missing.
     */
    public static final SubLObject reaction_type_relevant_knowledge(SubLObject reaction_type) {
        {
            SubLObject chemical_equation_unbalanced_gaf = kb_mapping_utilities.fpred_value_gaf(reaction_type, $$chemicalEquation_Unbalanced, UNPROVIDED, UNPROVIDED);
            if (NIL == assertion_handles.assertion_p(chemical_equation_unbalanced_gaf)) {
                return T;
            }
            {
                SubLObject cycl_reactant_list = assertions_high.gaf_arg2(chemical_equation_unbalanced_gaf);
                SubLObject cycl_product_list = assertions_high.gaf_arg3(chemical_equation_unbalanced_gaf);
                SubLObject element_list = element_list_for_reaction_type(reaction_type);
                SubLObject atomic_composition_of_reactant_gafs = atomic_composition_gafs(cycl_reactant_list);
                SubLObject atomic_composition_of_product_gafs = atomic_composition_gafs(cycl_product_list);
                if (!((atomic_composition_of_reactant_gafs.isList() && atomic_composition_of_product_gafs.isList()) && element_list.isList())) {
                    return T;
                }
                return values(NIL, chemical_equation_unbalanced_gaf, atomic_composition_of_reactant_gafs, atomic_composition_of_product_gafs, el_utilities.el_list_length(cycl_product_list), element_list);
            }
        }
    }

    public static final SubLObject element_list_for_reaction_type(SubLObject reaction_type) {
        {
            SubLObject element_types_in_reaction_gaf = kb_mapping_utilities.fpred_value_gaf(reaction_type, $$elementTypesInReaction_List, UNPROVIDED, UNPROVIDED);
            if (NIL != assertion_handles.assertion_p(element_types_in_reaction_gaf)) {
                {
                    SubLObject cycl_element_list = assertions_high.gaf_arg2(element_types_in_reaction_gaf);
                    SubLObject element_list = el_utilities.el_list_items(cycl_element_list);
                    return element_list;
                }
            } else {
                return $MISSING;
            }
        }
    }

    public static final SubLObject atomic_composition_gafs(SubLObject cycl_reactant_or_product_list) {
        {
            SubLObject reactant_or_product_list = el_utilities.el_list_items(cycl_reactant_or_product_list);
            SubLObject atomic_composition_gafs = NIL;
            SubLObject cdolist_list_var = reactant_or_product_list;
            SubLObject reactant_or_product = NIL;
            for (reactant_or_product = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , reactant_or_product = cdolist_list_var.first()) {
                if (NIL != el_utilities.possibly_naut_p(reactant_or_product)) {
                    reactant_or_product = narts_high.find_nart(reactant_or_product);
                }
                if (NIL != kb_indexing_datastructures.indexed_term_p(reactant_or_product)) {
                    {
                        SubLObject gaf = kb_mapping_utilities.fpred_value_gaf(reactant_or_product, $$completeAtomicComposition_List, UNPROVIDED, UNPROVIDED);
                        if (NIL != gaf) {
                            atomic_composition_gafs = cons(gaf, atomic_composition_gafs);
                        } else {
                            return $MISSING;
                        }
                    }
                }
            }
            atomic_composition_gafs = nreverse(atomic_composition_gafs);
            return atomic_composition_gafs;
        }
    }

    public static final SubLObject extract_atomic_compositions(SubLObject gafs) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = gafs;
            SubLObject gaf = NIL;
            for (gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , gaf = cdolist_list_var.first()) {
                {
                    SubLObject cycl_list_of_elements = assertions_high.gaf_arg2(gaf);
                    SubLObject cycl_list_of_subscripts = assertions_high.gaf_arg3(gaf);
                    SubLObject list_of_elements = el_utilities.el_list_items(cycl_list_of_elements);
                    SubLObject list_of_subscripts = el_utilities.el_list_items(cycl_list_of_subscripts);
                    result = cons(new_atomic_composition(list_of_elements, list_of_subscripts), result);
                }
            }
            return nreverse(result);
        }
    }

    public static final SubLObject ionic_equation(SubLObject reaction_type, SubLObject mt, SubLObject transformation_depth) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (transformation_depth == UNPROVIDED) {
            transformation_depth = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == transformation_depth) {
                {
                    SubLObject inference = inference_macros.current_controlling_inference();
                    if (NIL != inference) {
                        transformation_depth = inference_datastructures_inference.inference_max_transformation_depth(inference);
                    } else {
                        transformation_depth = ONE_INTEGER;
                    }
                }
            }
            {
                SubLObject chemical_equation_balanced = inference_kernel.new_cyc_query(listS($$chemicalEquation_Balanced, reaction_type, $list_alt66), NIL != mt ? ((SubLObject) (mt)) : mt_relevance_macros.$mt$.getDynamicValue(thread), listS($MAX_TRANSFORMATION_DEPTH, transformation_depth, $list_alt68)).first();
                if (NIL == chemical_equation_balanced) {
                    return NIL;
                }
                {
                    SubLObject cycl_reactant_list = bindings.variable_lookup($sym69$_REACTANTS, chemical_equation_balanced);
                    SubLObject cycl_reactant_subscript_list = bindings.variable_lookup($sym70$_REACTANT_COEFFS, chemical_equation_balanced);
                    SubLObject cycl_product_list = bindings.variable_lookup($sym71$_PRODUCTS, chemical_equation_balanced);
                    SubLObject cycl_product_subscript_list = bindings.variable_lookup($sym72$_PRODUCT_COEFFS, chemical_equation_balanced);
                    SubLObject reactant_list = el_utilities.el_list_items(cycl_reactant_list);
                    SubLObject reactant_subscript_list = el_utilities.el_list_items(cycl_reactant_subscript_list);
                    SubLObject product_list = el_utilities.el_list_items(cycl_product_list);
                    SubLObject product_subscript_list = el_utilities.el_list_items(cycl_product_subscript_list);
                    SubLObject in_aqueous_solutionP = reaction_type_in_aqueous_solutionP(reaction_type, mt);
                    SubLObject reactant_set = ionic_equation_set(reactant_list, reactant_subscript_list, in_aqueous_solutionP, mt);
                    SubLObject product_set = ionic_equation_set(product_list, product_subscript_list, in_aqueous_solutionP, mt);
                    if (!((NIL != reactant_set) && (NIL != product_set))) {
                        return NIL;
                    }
                    return el_utilities.make_el_formula($$ionicEquation_Complete, list(reaction_type, reactant_set, product_set), UNPROVIDED);
                }
            }
        }
    }

    public static final SubLObject ionic_equation_set(SubLObject compound_list, SubLObject subscript_list, SubLObject reaction_type_in_aqueous_solutionP, SubLObject mt) {
        {
            SubLObject v_set = NIL;
            SubLObject compound = NIL;
            SubLObject compound_3 = NIL;
            SubLObject subscript = NIL;
            SubLObject subscript_4 = NIL;
            for (compound = compound_list, compound_3 = compound.first(), subscript = subscript_list, subscript_4 = subscript.first(); !((NIL == subscript) && (NIL == compound)); compound = compound.rest() , compound_3 = compound.first() , subscript = subscript.rest() , subscript_4 = subscript.first()) {
                if ((NIL != reaction_type_in_aqueous_solutionP) && (NIL != genls.genlsP(compound_3, $$StrongElectrolyte, mt, UNPROVIDED))) {
                    {
                        SubLObject ionic_decomposition_gaf = kb_mapping_utilities.fpred_value_gaf(compound_3, $$ionicDecomposition, UNPROVIDED, UNPROVIDED);
                        if (NIL == ionic_decomposition_gaf) {
                            return NIL;
                        }
                        {
                            SubLObject cation = assertions_high.gaf_arg2(ionic_decomposition_gaf);
                            SubLObject cation_stuff = kb_mapping_utilities.fpred_value(cation, $$granuleOfChemicalSubstanceType, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
                            SubLObject cation_subscript = assertions_high.gaf_arg3(ionic_decomposition_gaf);
                            SubLObject cation_stuff_subscript = multiply(subscript_4, cation_subscript);
                            SubLObject anion = assertions_high.gaf_arg4(ionic_decomposition_gaf);
                            SubLObject anion_stuff = kb_mapping_utilities.fpred_value(anion, $$granuleOfChemicalSubstanceType, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
                            SubLObject anion_subscript = assertions_high.gaf_arg5(ionic_decomposition_gaf);
                            SubLObject anion_stuff_subscript = multiply(subscript_4, anion_subscript);
                            if (!((NIL != cation_stuff) && (NIL != anion_stuff))) {
                                return NIL;
                            }
                            v_set = cons(list(cation_stuff, cation_stuff_subscript), v_set);
                            v_set = cons(list(anion_stuff, anion_stuff_subscript), v_set);
                        }
                    }
                } else {
                    v_set = cons(list(compound_3, subscript_4), v_set);
                }
            }
            v_set = consolidate_object_counts_pair_list(v_set, UNPROVIDED);
            v_set = nreverse(v_set);
            {
                SubLObject cdotimes_end_var = length(v_set);
                SubLObject index = NIL;
                for (index = ZERO_INTEGER; index.numL(cdotimes_end_var); index = add(index, ONE_INTEGER)) {
                    set_nth(index, v_set, el_utilities.make_el_list(nth(index, v_set), UNPROVIDED));
                }
            }
            return el_utilities.make_nat_formula($$TheSet, v_set);
        }
    }

    /**
     * Return T iff string contains a chemical formula.
     *
     * @param string
     * 		; stringp
     * @return booeanp
     */
    public static final SubLObject chem_parseP(SubLObject string) {
        SubLTrampolineFile.checkType(string, STRINGP);
        if (NIL != string_utilities.empty_string_p(string)) {
            return NIL;
        }
        {
            SubLObject composition = chem_parse(string, T);
            SubLObject cdolist_list_var = composition.first();
            SubLObject compound = NIL;
            for (compound = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , compound = cdolist_list_var.first()) {
                if (NIL == constant_handles.constant_p(compound)) {
                    return NIL;
                }
            }
            return T;
        }
    }

    /**
     *
     *
     * @return listp of listp; list of elements and list of subscripts

    If FLATTEN? is non-nil, then the function returns a flat list of the elements
    in FORMULA-STRING with any given element appearing at most once, and a list of
    the number of atoms of each element.
    Otherwise, returns a nested list structure corresponding to the structure of
    FORMULA-STRING.  This is the default behaviour.
     */
    public static final SubLObject chem_parse(SubLObject formula_string, SubLObject flattenP) {
        if (flattenP == UNPROVIDED) {
            flattenP = NIL;
        }
        {
            SubLObject result = chem_parse_int(formula_string);
            if (NIL != flattenP) {
                result = chem_flatten(result);
            }
            return result;
        }
    }

    public static final SubLObject chem_parse_int(SubLObject formula_string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != string_utilities.empty_string_p(formula_string)) {
                return $list_alt78;
            } else {
                thread.resetMultipleValues();
                {
                    SubLObject first_element_of_string = chem_extract_first_element_subscript_pair(formula_string);
                    SubLObject first_subscript_of_string = thread.secondMultipleValue();
                    SubLObject rest_of_string = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject first_of_compound = chem_parse_int_one(first_element_of_string, first_subscript_of_string);
                        SubLObject rest_of_compound = chem_parse_int(rest_of_string);
                        return nreverse(pairlis(first_of_compound, rest_of_compound, UNPROVIDED));
                    }
                }
            }
        }
    }

    public static final SubLObject chem_parse_int_one(SubLObject element_string, SubLObject subscript_string) {
        {
            SubLObject element = (CHAR_lparen == string_utilities.first_char(element_string)) ? ((SubLObject) (chem_parse(string_utilities.rest_of_string(string_utilities.string_butlast(element_string)), UNPROVIDED))) : kb_constant_for_element(element_string);
            SubLObject subscript = (NIL != string_utilities.empty_string_p(subscript_string)) ? ((SubLObject) (ONE_INTEGER)) : string_utilities.string_to_integer(subscript_string);
            return list(element, subscript);
        }
    }

    /**
     * Returns 3 substrings of FORMULA-STRING;
     * e.g. ``Na6H4P2'' => (values ``Na'' ``6'' ``H4P2'')
     */
    public static final SubLObject chem_extract_first_element_subscript_pair(SubLObject formula_string) {
        {
            SubLObject first_element_of_string = string_utilities.first_of_string(formula_string);
            SubLObject rest_of_string = string_utilities.rest_of_string(formula_string);
            if ($str_alt79$_.equal(first_element_of_string)) {
                {
                    SubLObject tree_depth = ONE_INTEGER;
                    while (!tree_depth.isZero()) {
                        {
                            SubLObject first_of_rest = string_utilities.first_of_string(rest_of_string);
                            first_element_of_string = cconcatenate(first_element_of_string, first_of_rest);
                            rest_of_string = string_utilities.rest_of_string(rest_of_string);
                            if ($str_alt79$_.equal(first_of_rest)) {
                                tree_depth = number_utilities.f_1X(tree_depth);
                            }
                            if ($str_alt80$_.equal(first_of_rest)) {
                                tree_depth = number_utilities.f_1_(tree_depth);
                            }
                        }
                    } 
                }
            } else {
                if (NIL == string_utilities.empty_string_p(rest_of_string)) {
                    {
                        SubLObject first_char_of_rest = string_utilities.first_char(rest_of_string);
                        if (NIL != lower_case_p(first_char_of_rest)) {
                            first_element_of_string = string_utilities.post_add_character_to_string(first_char_of_rest, first_element_of_string);
                            rest_of_string = string_utilities.rest_of_string(rest_of_string);
                        }
                    }
                }
            }
            {
                SubLObject first_subscript_of_string = $str_alt26$;
                while ((NIL == string_utilities.empty_string_p(rest_of_string)) && (NIL != digit_char_p(string_utilities.first_char(rest_of_string), UNPROVIDED))) {
                    first_subscript_of_string = string_utilities.post_add_character_to_string(string_utilities.first_char(rest_of_string), first_subscript_of_string);
                    rest_of_string = string_utilities.rest_of_string(rest_of_string);
                } 
                return values(first_element_of_string, first_subscript_of_string, rest_of_string);
            }
        }
    }

    /**
     * Given the atomic-composition-p COMPOSITION,
     * Returns the corresponding flat-atomic-composition-p.
     */
    public static final SubLObject chem_flatten(SubLObject composition) {
        {
            SubLObject element_list = atomic_composition_elements(composition);
            SubLObject subscript_list = atomic_composition_subscripts(composition);
            SubLObject new_element_list = NIL;
            SubLObject new_subscript_list = NIL;
            SubLObject list_var = NIL;
            SubLObject element = NIL;
            SubLObject index = NIL;
            for (list_var = element_list, element = list_var.first(), index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , element = list_var.first() , index = add(ONE_INTEGER, index)) {
                if (NIL != list_utilities.proper_list_p(element)) {
                    {
                        SubLObject flattened_element = chem_flatten(element);
                        SubLObject nested_element_list = flattened_element.first();
                        SubLObject nested_subscript_list = second(flattened_element);
                        SubLObject list_var_5 = NIL;
                        SubLObject nested_element = NIL;
                        SubLObject nested_index = NIL;
                        for (list_var_5 = nested_element_list, nested_element = list_var_5.first(), nested_index = ZERO_INTEGER; NIL != list_var_5; list_var_5 = list_var_5.rest() , nested_element = list_var_5.first() , nested_index = add(ONE_INTEGER, nested_index)) {
                            new_element_list = cons(nested_element, new_element_list);
                            new_subscript_list = cons(multiply(nth(nested_index, nested_subscript_list), nth(index, subscript_list)), new_subscript_list);
                        }
                    }
                } else {
                    new_element_list = cons(element, new_element_list);
                    new_subscript_list = cons(nth(index, subscript_list), new_subscript_list);
                }
            }
            return chem_delete_duplicate_elements(nreverse(new_element_list), nreverse(new_subscript_list));
        }
    }

    /**
     *
     *
     * @unknown Destructive
     */
    public static final SubLObject chem_delete_duplicate_elements(SubLObject element_list, SubLObject subscript_list) {
        if (NIL != list_utilities.lengthLE(element_list, ONE_INTEGER, UNPROVIDED)) {
            return new_atomic_composition(element_list, subscript_list);
        } else {
            {
                SubLObject first_element = element_list.first();
                SubLObject first_subscript = subscript_list.first();
                SubLObject rest_of_elements = element_list.rest();
                SubLObject rest_of_subscripts = subscript_list.rest();
                SubLObject rest_no_duplicates = chem_delete_duplicate_elements(rest_of_elements, rest_of_subscripts);
                SubLObject rest_of_elements_no_duplicates = rest_no_duplicates.first();
                SubLObject rest_of_subscripts_no_duplicates = second(rest_no_duplicates);
                SubLObject position_in_rest = position(first_element, rest_of_elements_no_duplicates, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != position_in_rest) {
                    set_nth(position_in_rest, rest_of_subscripts_no_duplicates, add(first_subscript, nth(position_in_rest, rest_of_subscripts_no_duplicates)));
                    return new_atomic_composition(rest_of_elements_no_duplicates, rest_of_subscripts_no_duplicates);
                } else {
                    return new_atomic_composition(cons(first_element, rest_of_elements_no_duplicates), cons(first_subscript, rest_of_subscripts_no_duplicates));
                }
            }
        }
    }

    /**
     *
     *
     * @unknown Destructive
    Like consolidate-object-counts, but takes a pair list as its arg instead of paired lists.
     */
    public static final SubLObject consolidate_object_counts_pair_list(SubLObject pair_list, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUALP);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject paired_lists = list_utilities.make_paired_lists(pair_list);
                thread.resetMultipleValues();
                {
                    SubLObject object_list = consolidate_object_counts(paired_lists.first(), second(paired_lists), test);
                    SubLObject count_list = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    return list_utilities.make_pair_list(object_list, count_list);
                }
            }
        }
    }

    /**
     *
     *
     * @unknown Destructive
     * @param OBJECT-LIST;
     * 		listp of whatever, possibly with duplicates
     * @param COUNT-LIST;
     * 		listp of numberp, whose nth element is interpreted as an
     * 		indication of how much of the nth element of OBJECT-LIST is present
     * 		Returns its args, but with duplicates deleted from OBJECT-LIST and their corresponding
     * 		counts summed.
     * 		e.g. (#$Apple #$Orange #$Apple) (5 7 1) => (#$Orange #$Apple) (7 6)
     */
    public static final SubLObject consolidate_object_counts(SubLObject object_list, SubLObject count_list, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUALP);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != list_utilities.lengthLE(object_list, ONE_INTEGER, UNPROVIDED)) {
                return values(object_list, count_list);
            } else {
                {
                    SubLObject first_object = object_list.first();
                    SubLObject first_count = count_list.first();
                    SubLObject rest_of_objects = object_list.rest();
                    SubLObject rest_of_counts = count_list.rest();
                    thread.resetMultipleValues();
                    {
                        SubLObject rest_of_objects_no_duplicates = consolidate_object_counts(rest_of_objects, rest_of_counts, UNPROVIDED);
                        SubLObject rest_of_counts_no_duplicates = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject position_in_rest = position(first_object, rest_of_objects_no_duplicates, test, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            if (NIL != position_in_rest) {
                                set_nth(position_in_rest, rest_of_counts_no_duplicates, add(first_count, nth(position_in_rest, rest_of_counts_no_duplicates)));
                                return values(rest_of_objects_no_duplicates, rest_of_counts_no_duplicates);
                            } else {
                                return values(cons(first_object, rest_of_objects_no_duplicates), cons(first_count, rest_of_counts_no_duplicates));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @param ELEMENT
     * 		; chemical-element-p
     * @param ATOMIC-COMPOSITION;
     * 		flat-atomic-composition-p
     * @unknown integerp; the number of atoms of ELEMENT in ATOMIC-COMPOSITION.
     */
    public static final SubLObject subscript_of(SubLObject element, SubLObject atomic_composition) {
        {
            SubLObject elements = atomic_composition_elements(atomic_composition);
            SubLObject subscripts = atomic_composition_subscripts(atomic_composition);
            SubLObject index = position(element, elements, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL != index ? ((SubLObject) (nth(index, subscripts))) : ZERO_INTEGER;
        }
    }

    public static final SubLObject declare_chemistry_utilities_file() {
        declareFunction("new_atomic_composition", "NEW-ATOMIC-COMPOSITION", 2, 0, false);
        declareFunction("atomic_composition_p", "ATOMIC-COMPOSITION-P", 1, 0, false);
        declareFunction("flat_atomic_composition_p", "FLAT-ATOMIC-COMPOSITION-P", 1, 0, false);
        declareFunction("chemical_element_p", "CHEMICAL-ELEMENT-P", 1, 0, false);
        declareFunction("chemical_element_or_atomic_composition_p", "CHEMICAL-ELEMENT-OR-ATOMIC-COMPOSITION-P", 1, 0, false);
        declareFunction("compositions_equalP", "COMPOSITIONS-EQUAL?", 2, 0, false);
        declareFunction("atomic_composition_elements", "ATOMIC-COMPOSITION-ELEMENTS", 1, 0, false);
        declareFunction("atomic_composition_subscripts", "ATOMIC-COMPOSITION-SUBSCRIPTS", 1, 0, false);
        declareFunction("kb_constant_for_element", "KB-CONSTANT-FOR-ELEMENT", 1, 0, false);
        declareFunction("kb_constant_for_composition", "KB-CONSTANT-FOR-COMPOSITION", 1, 1, false);
        declareFunction("kb_constant_for_cation", "KB-CONSTANT-FOR-CATION", 1, 1, false);
        declareFunction("decompose_cation_string", "DECOMPOSE-CATION-STRING", 1, 0, false);
        declareFunction("kb_constant_for_anion", "KB-CONSTANT-FOR-ANION", 1, 0, false);
        declareFunction("kb_ion_of_element_with_valence", "KB-ION-OF-ELEMENT-WITH-VALENCE", 1, 2, false);
        declareFunction("kb_ions_of_element", "KB-IONS-OF-ELEMENT", 1, 1, false);
        declareFunction("kb_compound_of_ions", "KB-COMPOUND-OF-IONS", 2, 1, false);
        declareFunction("element_with_base_form", "ELEMENT-WITH-BASE-FORM", 1, 0, false);
        declareFunction("possible_valences", "POSSIBLE-VALENCES", 1, 1, false);
        declareFunction("reaction_type_in_aqueous_solutionP", "REACTION-TYPE-IN-AQUEOUS-SOLUTION?", 1, 1, false);
        declareFunction("generate_matrix", "GENERATE-MATRIX", 1, 0, false);
        declareFunction("chemical_formula_matrix", "CHEMICAL-FORMULA-MATRIX", 1, 0, false);
        declareFunction("generate_matrix_int", "GENERATE-MATRIX-INT", 4, 0, false);
        declareFunction("reaction_type_relevant_knowledge", "REACTION-TYPE-RELEVANT-KNOWLEDGE", 1, 0, false);
        declareFunction("element_list_for_reaction_type", "ELEMENT-LIST-FOR-REACTION-TYPE", 1, 0, false);
        declareFunction("atomic_composition_gafs", "ATOMIC-COMPOSITION-GAFS", 1, 0, false);
        declareFunction("extract_atomic_compositions", "EXTRACT-ATOMIC-COMPOSITIONS", 1, 0, false);
        declareFunction("ionic_equation", "IONIC-EQUATION", 1, 2, false);
        declareFunction("ionic_equation_set", "IONIC-EQUATION-SET", 4, 0, false);
        declareFunction("chem_parseP", "CHEM-PARSE?", 1, 0, false);
        declareFunction("chem_parse", "CHEM-PARSE", 1, 1, false);
        declareFunction("chem_parse_int", "CHEM-PARSE-INT", 1, 0, false);
        declareFunction("chem_parse_int_one", "CHEM-PARSE-INT-ONE", 2, 0, false);
        declareFunction("chem_extract_first_element_subscript_pair", "CHEM-EXTRACT-FIRST-ELEMENT-SUBSCRIPT-PAIR", 1, 0, false);
        declareFunction("chem_flatten", "CHEM-FLATTEN", 1, 0, false);
        declareFunction("chem_delete_duplicate_elements", "CHEM-DELETE-DUPLICATE-ELEMENTS", 2, 0, false);
        declareFunction("consolidate_object_counts_pair_list", "CONSOLIDATE-OBJECT-COUNTS-PAIR-LIST", 1, 1, false);
        declareFunction("consolidate_object_counts", "CONSOLIDATE-OBJECT-COUNTS", 2, 1, false);
        declareFunction("subscript_of", "SUBSCRIPT-OF", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_chemistry_utilities_file() {
        deflexical("*CHEMISTRY-MT*", NIL != boundp($chemistry_mt$) ? ((SubLObject) ($chemistry_mt$.getGlobalValue())) : $$ChemistryMt);
        deflexical("*CHEMISTRY-LEXICAL-MT*", NIL != boundp($chemistry_lexical_mt$) ? ((SubLObject) ($chemistry_lexical_mt$.getGlobalValue())) : $$CrossLinguisticLexicalMt);
        return NIL;
    }

    public static final SubLObject setup_chemistry_utilities_file() {
                subl_macro_promotions.declare_defglobal($chemistry_mt$);
        mt_vars.note_mt_var($chemistry_mt$, NIL);
        subl_macro_promotions.declare_defglobal($chemistry_lexical_mt$);
        mt_vars.note_mt_var($chemistry_lexical_mt$, NIL);
        return NIL;
    }

    // // Internal Constants
    public static final SubLSymbol $chemistry_mt$ = makeSymbol("*CHEMISTRY-MT*");

    public static final SubLObject $$ChemistryMt = constant_handles.reader_make_constant_shell(makeString("ChemistryMt"));

    public static final SubLSymbol $chemistry_lexical_mt$ = makeSymbol("*CHEMISTRY-LEXICAL-MT*");

    public static final SubLObject $$CrossLinguisticLexicalMt = constant_handles.reader_make_constant_shell(makeString("CrossLinguisticLexicalMt"));

    private static final SubLSymbol CHEMICAL_ELEMENT_OR_ATOMIC_COMPOSITION_P = makeSymbol("CHEMICAL-ELEMENT-OR-ATOMIC-COMPOSITION-P");

    private static final SubLSymbol CHEMICAL_ELEMENT_P = makeSymbol("CHEMICAL-ELEMENT-P");

    public static final SubLObject $$ElementStuffTypeByNumberOfProtons = constant_handles.reader_make_constant_shell(makeString("ElementStuffTypeByNumberOfProtons"));

    public static final SubLObject $$InferencePSC = constant_handles.reader_make_constant_shell(makeString("InferencePSC"));

    static private final SubLSymbol $sym8$_X = makeSymbol("?X");

    public static final SubLObject $$atomicSymbol = constant_handles.reader_make_constant_shell(makeString("atomicSymbol"));

    static private final SubLSymbol $sym10$_COMPOUND = makeSymbol("?COMPOUND");

    static private final SubLList $list_alt11 = list(makeSymbol("?SUBSCRIPTS"));

    public static final SubLObject $$completeAtomicComposition_List = constant_handles.reader_make_constant_shell(makeString("completeAtomicComposition-List"));

    static private final SubLSymbol $sym13$_SUBSCRIPTS = makeSymbol("?SUBSCRIPTS");

    public static final SubLObject $$MassNoun = constant_handles.reader_make_constant_shell(makeString("MassNoun"));

    static private final SubLString $str_alt15$_A_does_not_have_precisely_one_io = makeString("~A does not have precisely one ion");





    static private final SubLString $$$ous = makeString("ous");

    static private final SubLString $$$ic = makeString("ic");

    static private final SubLString $str_alt20$_S_is_not_a_recognized_cation_suf = makeString("~S is not a recognized cation suffix");

    static private final SubLString $str_alt21$_ion = makeString(" ion");

    public static final SubLObject $$CountNoun = constant_handles.reader_make_constant_shell(makeString("CountNoun"));

    static private final SubLString $str_alt23$Cannot_parse__S_as_a_cation_name = makeString("Cannot parse ~S as a cation name");

    static private final SubLList $list_alt24 = list(makeString("ic"), makeString("ous"));



    static private final SubLString $str_alt26$ = makeString("");



    static private final SubLString $str_alt28$Cannot_parse__S_as_an_anion_name = makeString("Cannot parse ~S as an anion name");

    public static final SubLObject $$relationAllInstance = constant_handles.reader_make_constant_shell(makeString("relationAllInstance"));

    public static final SubLObject $$chargeOfObject = constant_handles.reader_make_constant_shell(makeString("chargeOfObject"));

    public static final SubLObject $$ElectronicCharge = constant_handles.reader_make_constant_shell(makeString("ElectronicCharge"));

    public static final SubLObject $$True = constant_handles.reader_make_constant_shell(makeString("True"));

    public static final SubLObject $$thereExists = constant_handles.reader_make_constant_shell(makeString("thereExists"));

    static private final SubLSymbol $sym34$_SUBSCRIPT_LIST = makeSymbol("?SUBSCRIPT-LIST");

    public static final SubLObject $$and = constant_handles.reader_make_constant_shell(makeString("and"));

    static private final SubLList $list_alt36 = list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), constant_handles.reader_make_constant_shell(makeString("IonTypeByChemicalSpecies")));

    static private final SubLList $list_alt37 = list(constant_handles.reader_make_constant_shell(makeString("ChemicalSubstanceFn")), makeSymbol("?X"));

    public static final SubLObject $$TheList = constant_handles.reader_make_constant_shell(makeString("TheList"));

    static private final SubLList $list_alt39 = list(makeSymbol("?SUBSCRIPT-LIST"));

    public static final SubLObject $$ionicDecomposition = constant_handles.reader_make_constant_shell(makeString("ionicDecomposition"));

    static private final SubLString $$$cupr = makeString("cupr");

    public static final SubLObject $$Copper = constant_handles.reader_make_constant_shell(makeString("Copper"));

    static private final SubLString $$$ferr = makeString("ferr");

    public static final SubLObject $$Iron = constant_handles.reader_make_constant_shell(makeString("Iron"));

    static private final SubLString $$$mercur = makeString("mercur");

    public static final SubLObject $$Mercury = constant_handles.reader_make_constant_shell(makeString("Mercury"));

    static private final SubLString $$$plumb = makeString("plumb");

    public static final SubLObject $$Lead = constant_handles.reader_make_constant_shell(makeString("Lead"));

    static private final SubLString $$$stann = makeString("stann");

    public static final SubLObject $$Tin = constant_handles.reader_make_constant_shell(makeString("Tin"));

    static private final SubLString $$$wolfr = makeString("wolfr");

    public static final SubLObject $$Tungsten = constant_handles.reader_make_constant_shell(makeString("Tungsten"));

    static private final SubLString $$$aur = makeString("aur");

    public static final SubLObject $$Gold = constant_handles.reader_make_constant_shell(makeString("Gold"));

    public static final SubLObject $$valence_Possible = constant_handles.reader_make_constant_shell(makeString("valence-Possible"));

    static private final SubLSymbol $sym56$_SOLUTION = makeSymbol("?SOLUTION");

    public static final SubLObject $$reactionTypeInMixture = constant_handles.reader_make_constant_shell(makeString("reactionTypeInMixture"));

    static private final SubLList $list_alt58 = list(list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?SOLUTION"), constant_handles.reader_make_constant_shell(makeString("AqueousSolution"))));

    public static final SubLObject $$chemicalEquation_Balanced = constant_handles.reader_make_constant_shell(makeString("chemicalEquation-Balanced"));

    static private final SubLList $list_alt60 = list(makeSymbol("REACTION-TYPE"), makeSymbol("EL-REACTANTS"), makeSymbol("EL-REACTANT-COEFFS"), makeSymbol("EL-PRODUCTS"), makeSymbol("EL-PRODUCT-COEFFS"));



    public static final SubLObject $$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));

    public static final SubLObject $$chemicalEquation_Unbalanced = constant_handles.reader_make_constant_shell(makeString("chemicalEquation-Unbalanced"));

    public static final SubLObject $$elementTypesInReaction_List = constant_handles.reader_make_constant_shell(makeString("elementTypesInReaction-List"));



    static private final SubLList $list_alt66 = list(makeSymbol("?REACTANTS"), makeSymbol("?REACTANT-COEFFS"), makeSymbol("?PRODUCTS"), makeSymbol("?PRODUCT-COEFFS"));

    private static final SubLSymbol $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");

    static private final SubLList $list_alt68 = list(makeKeyword("MAX-TIME"), makeInteger(30), makeKeyword("MAX-NUMBER"), ONE_INTEGER);

    static private final SubLSymbol $sym69$_REACTANTS = makeSymbol("?REACTANTS");

    static private final SubLSymbol $sym70$_REACTANT_COEFFS = makeSymbol("?REACTANT-COEFFS");

    static private final SubLSymbol $sym71$_PRODUCTS = makeSymbol("?PRODUCTS");

    static private final SubLSymbol $sym72$_PRODUCT_COEFFS = makeSymbol("?PRODUCT-COEFFS");

    public static final SubLObject $$ionicEquation_Complete = constant_handles.reader_make_constant_shell(makeString("ionicEquation-Complete"));

    public static final SubLObject $$StrongElectrolyte = constant_handles.reader_make_constant_shell(makeString("StrongElectrolyte"));

    public static final SubLObject $$granuleOfChemicalSubstanceType = constant_handles.reader_make_constant_shell(makeString("granuleOfChemicalSubstanceType"));

    public static final SubLObject $$TheSet = constant_handles.reader_make_constant_shell(makeString("TheSet"));



    static private final SubLList $list_alt78 = list(NIL, NIL);

    static private final SubLString $str_alt79$_ = makeString("(");

    static private final SubLString $str_alt80$_ = makeString(")");

    // // Initializers
    public void declareFunctions() {
        declare_chemistry_utilities_file();
    }

    public void initializeVariables() {
        init_chemistry_utilities_file();
    }

    public void runTopLevelForms() {
        setup_chemistry_utilities_file();
    }
}

