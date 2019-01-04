package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.transform_list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.unicode_nauts;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.evaluation_defns;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.cycl_string;
import com.cyc.cycjava.cycl.variables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_concatenate_strings extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_concatenate_strings";
    public static final String myFingerPrint = "51ee9128ac3ff1a799865d1f3aced9205608557bc7b9114b8f3878eee9c3e7ad";
    private static final SubLObject $const0$concatenateStrings;
    private static final SubLSymbol $kw1$POS;
    private static final SubLSymbol $kw2$NEG;
    private static final SubLSymbol $kw3$REMOVAL_CONCATENATE_STRINGS_CONCATENATE_ARG1_POS;
    private static final SubLList $list4;
    private static final SubLSymbol $sym5$REMOVAL_CONCATENATE_STRINGS_BOUND_ARGS_SUPPORTED_P;
    private static final SubLList $list6;
    private static final SubLSymbol $kw7$OPAQUE;
    private static final SubLSymbol $sym8$REMOVAL_CONCATENATE_STRINGS_CONCATENATE_ARG1_POS;
    private static final SubLSymbol $kw9$REMOVAL_CONCATENATE_STRINGS_CONCATENATE_NEG;
    private static final SubLList $list10;
    private static final SubLSymbol $sym11$REMOVAL_CONCATENATE_STRINGS_CONCATENATE_NEG;
    private static final SubLSymbol $kw12$REMOVAL_CONCATENATE_STRINGS_PERMUTE_POS;
    private static final SubLList $list13;
    private static final SubLSymbol $sym14$REMOVAL_CONCATENATE_STRINGS_PERMUTE_COST;
    private static final SubLSymbol $sym15$REMOVAL_CONCATENATE_STRINGS_PERMUTE_POS_OUTPUT_GENERATE;
    private static final SubLSymbol $sym16$CONCATENATE_STRINGS_PERMUTE_POS_ITERATOR_DONE;
    private static final SubLSymbol $sym17$CONCATENATE_STRINGS_PERMUTE_POS_ITERATOR_NEXT;
    private static final SubLSymbol $sym18$CONCATENATE_STRINGS_PERMUTE_POS_ITERATOR_FINALIZE;
    private static final SubLList $list19;
    private static final SubLSymbol $sym20$UNICODE_NAUT_P;
    private static final SubLSymbol $sym21$NAT_ARG1;
    private static final SubLList $list22;
    private static final SubLString $str23$;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-concatenate-strings.lisp", position = 2080L)
    public static SubLObject removal_concatenate_strings_bound_args_supported_p(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_concatenate_strings.UNPROVIDED) {
            sense = (SubLObject)removal_modules_concatenate_strings.NIL;
        }
        SubLObject badP = (SubLObject)removal_modules_concatenate_strings.NIL;
        if (removal_modules_concatenate_strings.NIL == badP) {
            SubLObject csome_list_var = cycl_utilities.atomic_sentence_args(asent, (SubLObject)removal_modules_concatenate_strings.UNPROVIDED);
            SubLObject arg = (SubLObject)removal_modules_concatenate_strings.NIL;
            arg = csome_list_var.first();
            while (removal_modules_concatenate_strings.NIL == badP && removal_modules_concatenate_strings.NIL != csome_list_var) {
                if (removal_modules_concatenate_strings.NIL == removal_concatenate_strings_arg_supported_p(arg)) {
                    badP = (SubLObject)removal_modules_concatenate_strings.T;
                }
                csome_list_var = csome_list_var.rest();
                arg = csome_list_var.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_concatenate_strings.NIL == badP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-concatenate-strings.lisp", position = 2376L)
    public static SubLObject removal_concatenate_strings_arg_supported_p(final SubLObject arg) {
        return (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_concatenate_strings.NIL == variables.fully_bound_p(arg) || removal_modules_concatenate_strings.NIL != cycl_string.cycl_string_p(arg));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-concatenate-strings.lisp", position = 2503L)
    public static SubLObject removal_concatenate_strings_concatenate_arg1_pos(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_concatenate_strings.UNPROVIDED) {
            sense = (SubLObject)removal_modules_concatenate_strings.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_args(asent, (SubLObject)removal_modules_concatenate_strings.UNPROVIDED);
        SubLObject arg1 = (SubLObject)removal_modules_concatenate_strings.NIL;
        SubLObject strings = (SubLObject)removal_modules_concatenate_strings.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_concatenate_strings.$list6);
        arg1 = current.first();
        current = (strings = current.rest());
        final SubLObject big_string = evaluation_defns.cyc_concatenate_strings(strings);
        thread.resetMultipleValues();
        final SubLObject v_bindings = unification_utilities.term_unify(big_string, arg1, (SubLObject)removal_modules_concatenate_strings.T, (SubLObject)removal_modules_concatenate_strings.T);
        final SubLObject unify_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (removal_modules_concatenate_strings.NIL != v_bindings) {
            final SubLObject bound_arg1 = bindings.subst_bindings(v_bindings, arg1);
            final SubLObject unified_asent = el_utilities.replace_formula_arg((SubLObject)removal_modules_concatenate_strings.ONE_INTEGER, bound_arg1, asent);
            return backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_concatenate_strings.$kw7$OPAQUE, unified_asent, (SubLObject)removal_modules_concatenate_strings.UNPROVIDED, (SubLObject)removal_modules_concatenate_strings.UNPROVIDED), v_bindings, unify_justification);
        }
        return (SubLObject)removal_modules_concatenate_strings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-concatenate-strings.lisp", position = 3753L)
    public static SubLObject removal_concatenate_strings_concatenate_neg(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_concatenate_strings.UNPROVIDED) {
            sense = (SubLObject)removal_modules_concatenate_strings.NIL;
        }
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_args(asent, (SubLObject)removal_modules_concatenate_strings.UNPROVIDED);
        SubLObject arg1 = (SubLObject)removal_modules_concatenate_strings.NIL;
        SubLObject strings = (SubLObject)removal_modules_concatenate_strings.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_concatenate_strings.$list6);
        arg1 = current.first();
        current = (strings = current.rest());
        final SubLObject big_string = evaluation_defns.cyc_concatenate_strings(strings);
        if (removal_modules_concatenate_strings.NIL == Strings.string_equal(big_string, arg1, (SubLObject)removal_modules_concatenate_strings.UNPROVIDED, (SubLObject)removal_modules_concatenate_strings.UNPROVIDED, (SubLObject)removal_modules_concatenate_strings.UNPROVIDED, (SubLObject)removal_modules_concatenate_strings.UNPROVIDED)) {
            return backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_concatenate_strings.$kw7$OPAQUE, cycl_utilities.negate(asent), (SubLObject)removal_modules_concatenate_strings.UNPROVIDED, (SubLObject)removal_modules_concatenate_strings.UNPROVIDED), (SubLObject)removal_modules_concatenate_strings.UNPROVIDED, (SubLObject)removal_modules_concatenate_strings.UNPROVIDED);
        }
        return (SubLObject)removal_modules_concatenate_strings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-concatenate-strings.lisp", position = 4750L)
    public static SubLObject removal_concatenate_strings_permute_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_concatenate_strings.UNPROVIDED) {
            sense = (SubLObject)removal_modules_concatenate_strings.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject big_string = preprocess_stringy_args(asent);
        final SubLObject stringy_items = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (big_string.isString()) {
            SubLObject result = (SubLObject)removal_modules_concatenate_strings.ONE_INTEGER;
            SubLObject number_of_strings_so_far = (SubLObject)removal_modules_concatenate_strings.ZERO_INTEGER;
            SubLObject cdolist_list_var = stringy_items;
            SubLObject item = (SubLObject)removal_modules_concatenate_strings.NIL;
            item = cdolist_list_var.first();
            while (removal_modules_concatenate_strings.NIL != cdolist_list_var) {
                if (item.isString()) {
                    number_of_strings_so_far = Numbers.add(number_of_strings_so_far, (SubLObject)removal_modules_concatenate_strings.ONE_INTEGER);
                    final SubLObject string = item;
                    final SubLObject count = string_utilities.count_matches(string, big_string, (SubLObject)removal_modules_concatenate_strings.UNPROVIDED, (SubLObject)removal_modules_concatenate_strings.UNPROVIDED);
                    final SubLObject adjusted_count = Numbers.divide(count, number_of_strings_so_far);
                    result = Numbers.multiply(result, adjusted_count);
                }
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            }
            return result;
        }
        return (SubLObject)removal_modules_concatenate_strings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-concatenate-strings.lisp", position = 5563L)
    public static SubLObject removal_concatenate_strings_permute_pos_output_generate(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_concatenate_strings.UNPROVIDED) {
            sense = (SubLObject)removal_modules_concatenate_strings.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject big_string_is_unicodeP = unicode_nauts.unicode_naut_p(cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_concatenate_strings.UNPROVIDED), (SubLObject)removal_modules_concatenate_strings.UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject stringy_big_string = preprocess_stringy_args(asent);
        final SubLObject stringy_items = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (!stringy_big_string.isString()) {
            return iteration.new_null_iterator();
        }
        if (removal_modules_concatenate_strings.NIL != list_utilities.singletonP(stringy_items)) {
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(stringy_items.first(), stringy_big_string, (SubLObject)removal_modules_concatenate_strings.UNPROVIDED, (SubLObject)removal_modules_concatenate_strings.UNPROVIDED);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return iteration.new_singleton_iterator(bindings.subst_bindings(v_bindings, asent));
        }
        thread.resetMultipleValues();
        final SubLObject permutation_iterator = generate_concatenate_strings_permutation_iterator(stringy_big_string, stringy_items);
        final SubLObject strings_list = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return new_concatenate_strings_permute_pos_iterator(stringy_big_string, stringy_items, strings_list, permutation_iterator, asent, big_string_is_unicodeP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-concatenate-strings.lisp", position = 6514L)
    public static SubLObject new_concatenate_strings_permute_pos_iterator(final SubLObject big_string, final SubLObject stringy_items, final SubLObject strings_list, final SubLObject permutations_iterator, final SubLObject asent, final SubLObject big_string_is_unicodeP) {
        return iteration.new_iterator(concatenate_strings_permute_pos_iterator_state(big_string, stringy_items, strings_list, permutations_iterator, asent, big_string_is_unicodeP), (SubLObject)removal_modules_concatenate_strings.$sym16$CONCATENATE_STRINGS_PERMUTE_POS_ITERATOR_DONE, (SubLObject)removal_modules_concatenate_strings.$sym17$CONCATENATE_STRINGS_PERMUTE_POS_ITERATOR_NEXT, (SubLObject)removal_modules_concatenate_strings.$sym18$CONCATENATE_STRINGS_PERMUTE_POS_ITERATOR_FINALIZE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-concatenate-strings.lisp", position = 6995L)
    public static SubLObject concatenate_strings_permute_pos_iterator_state(final SubLObject big_string, final SubLObject stringy_items, final SubLObject strings_list, final SubLObject permutations_iterator, final SubLObject asent, final SubLObject big_string_is_unicodeP) {
        return (SubLObject)ConsesLow.list(big_string, stringy_items, strings_list, permutations_iterator, asent, big_string_is_unicodeP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-concatenate-strings.lisp", position = 7255L)
    public static SubLObject concatenate_strings_permute_pos_iterator_done(final SubLObject state) {
        SubLObject big_string = (SubLObject)removal_modules_concatenate_strings.NIL;
        SubLObject stringy_items = (SubLObject)removal_modules_concatenate_strings.NIL;
        SubLObject strings_list = (SubLObject)removal_modules_concatenate_strings.NIL;
        SubLObject permutations_iterator = (SubLObject)removal_modules_concatenate_strings.NIL;
        SubLObject asent = (SubLObject)removal_modules_concatenate_strings.NIL;
        SubLObject big_string_is_unicodeP = (SubLObject)removal_modules_concatenate_strings.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)removal_modules_concatenate_strings.$list19);
        big_string = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)removal_modules_concatenate_strings.$list19);
        stringy_items = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)removal_modules_concatenate_strings.$list19);
        strings_list = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)removal_modules_concatenate_strings.$list19);
        permutations_iterator = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)removal_modules_concatenate_strings.$list19);
        asent = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)removal_modules_concatenate_strings.$list19);
        big_string_is_unicodeP = current.first();
        current = current.rest();
        if (removal_modules_concatenate_strings.NIL == current) {
            return iteration.iteration_done(permutations_iterator);
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)removal_modules_concatenate_strings.$list19);
        return (SubLObject)removal_modules_concatenate_strings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-concatenate-strings.lisp", position = 7579L)
    public static SubLObject concatenate_strings_permute_pos_iterator_next(final SubLObject state) {
        SubLObject big_string = (SubLObject)removal_modules_concatenate_strings.NIL;
        SubLObject stringy_items = (SubLObject)removal_modules_concatenate_strings.NIL;
        SubLObject strings_list = (SubLObject)removal_modules_concatenate_strings.NIL;
        SubLObject permutations_iterator = (SubLObject)removal_modules_concatenate_strings.NIL;
        SubLObject asent = (SubLObject)removal_modules_concatenate_strings.NIL;
        SubLObject big_string_is_unicodeP = (SubLObject)removal_modules_concatenate_strings.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)removal_modules_concatenate_strings.$list19);
        big_string = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)removal_modules_concatenate_strings.$list19);
        stringy_items = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)removal_modules_concatenate_strings.$list19);
        strings_list = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)removal_modules_concatenate_strings.$list19);
        permutations_iterator = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)removal_modules_concatenate_strings.$list19);
        asent = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)removal_modules_concatenate_strings.$list19);
        big_string_is_unicodeP = current.first();
        current = current.rest();
        if (removal_modules_concatenate_strings.NIL == current) {
            SubLObject result = (SubLObject)removal_modules_concatenate_strings.NIL;
            SubLObject premature_endP = (SubLObject)removal_modules_concatenate_strings.NIL;
            while (removal_modules_concatenate_strings.NIL == result && removal_modules_concatenate_strings.NIL == premature_endP) {
                if (removal_modules_concatenate_strings.NIL != iteration.iteration_done(permutations_iterator)) {
                    premature_endP = (SubLObject)removal_modules_concatenate_strings.T;
                }
                else {
                    final SubLObject permutation = iteration.iteration_next(permutations_iterator);
                    if (removal_modules_concatenate_strings.NIL == permutation_ordered_consistentlyP(permutation, strings_list)) {
                        continue;
                    }
                    final SubLObject v_bindings = concatenate_strings_permute_pos_iterator_next_int(big_string, stringy_items, permutation, big_string_is_unicodeP);
                    if (removal_modules_concatenate_strings.NIL == v_bindings) {
                        continue;
                    }
                    result = bindings.subst_bindings(v_bindings, asent);
                }
            }
            return Values.values(result, state, premature_endP);
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)removal_modules_concatenate_strings.$list19);
        return (SubLObject)removal_modules_concatenate_strings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-concatenate-strings.lisp", position = 8341L)
    public static SubLObject concatenate_strings_permute_pos_iterator_finalize(final SubLObject state) {
        SubLObject big_string = (SubLObject)removal_modules_concatenate_strings.NIL;
        SubLObject stringy_items = (SubLObject)removal_modules_concatenate_strings.NIL;
        SubLObject strings_list = (SubLObject)removal_modules_concatenate_strings.NIL;
        SubLObject permutations_iterator = (SubLObject)removal_modules_concatenate_strings.NIL;
        SubLObject asent = (SubLObject)removal_modules_concatenate_strings.NIL;
        SubLObject big_string_is_unicodeP = (SubLObject)removal_modules_concatenate_strings.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)removal_modules_concatenate_strings.$list19);
        big_string = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)removal_modules_concatenate_strings.$list19);
        stringy_items = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)removal_modules_concatenate_strings.$list19);
        strings_list = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)removal_modules_concatenate_strings.$list19);
        permutations_iterator = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)removal_modules_concatenate_strings.$list19);
        asent = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)removal_modules_concatenate_strings.$list19);
        big_string_is_unicodeP = current.first();
        current = current.rest();
        if (removal_modules_concatenate_strings.NIL == current) {
            return iteration.iteration_finalize(permutations_iterator);
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)removal_modules_concatenate_strings.$list19);
        return (SubLObject)removal_modules_concatenate_strings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-concatenate-strings.lisp", position = 8673L)
    public static SubLObject preprocess_stringy_args(final SubLObject asent) {
        final SubLObject args = cycl_utilities.formula_args(asent, (SubLObject)removal_modules_concatenate_strings.UNPROVIDED);
        final SubLObject stringy_args = transform_list_utilities.transform(args, (SubLObject)removal_modules_concatenate_strings.$sym20$UNICODE_NAUT_P, (SubLObject)removal_modules_concatenate_strings.$sym21$NAT_ARG1, (SubLObject)removal_modules_concatenate_strings.UNPROVIDED);
        SubLObject current;
        final SubLObject datum = current = stringy_args;
        SubLObject big_string = (SubLObject)removal_modules_concatenate_strings.NIL;
        SubLObject stringy_items = (SubLObject)removal_modules_concatenate_strings.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_concatenate_strings.$list22);
        big_string = current.first();
        current = (stringy_items = current.rest());
        stringy_items = string_utilities.concatenate_adjacent_strings(stringy_items);
        stringy_items = insert_empty_strings_between_adjacent_variables(stringy_items);
        return Values.values(big_string, stringy_items);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-concatenate-strings.lisp", position = 9214L)
    public static SubLObject generate_concatenate_strings_permutation_iterator(final SubLObject big_string, final SubLObject stringy_items) {
        SubLObject positions_iterators = (SubLObject)removal_modules_concatenate_strings.NIL;
        SubLObject strings_list = (SubLObject)removal_modules_concatenate_strings.NIL;
        if (stringy_items.first().isString() && removal_modules_concatenate_strings.NIL == string_utilities.starts_with(big_string, stringy_items.first())) {
            return Values.values(iteration.new_null_iterator(), (SubLObject)removal_modules_concatenate_strings.NIL);
        }
        SubLObject cdolist_list_var = stringy_items;
        SubLObject item = (SubLObject)removal_modules_concatenate_strings.NIL;
        item = cdolist_list_var.first();
        while (removal_modules_concatenate_strings.NIL != cdolist_list_var) {
            if (item.isString()) {
                final SubLObject string = item;
                final SubLObject positions = string_utilities.search_all(string, big_string, (SubLObject)removal_modules_concatenate_strings.UNPROVIDED, (SubLObject)removal_modules_concatenate_strings.UNPROVIDED);
                if (removal_modules_concatenate_strings.NIL == positions) {
                    return Values.values(iteration.new_null_iterator(), (SubLObject)removal_modules_concatenate_strings.NIL);
                }
                positions_iterators = (SubLObject)ConsesLow.cons(iteration.new_reusable_list_iterator(positions), positions_iterators);
                strings_list = (SubLObject)ConsesLow.cons(item, strings_list);
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        positions_iterators = Sequences.nreverse(positions_iterators);
        strings_list = Sequences.nreverse(strings_list);
        final SubLObject permutation_iterator = iteration.new_reusable_iterator_cartesian_iterator(positions_iterators);
        return Values.values(permutation_iterator, strings_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-concatenate-strings.lisp", position = 10095L)
    public static SubLObject permutation_ordered_consistentlyP(final SubLObject permutation, final SubLObject strings) {
        SubLObject previous_position = permutation.first();
        SubLObject previous_string = strings.first();
        SubLObject inconsistentP = (SubLObject)removal_modules_concatenate_strings.NIL;
        SubLObject position = (SubLObject)removal_modules_concatenate_strings.NIL;
        SubLObject position_$1 = (SubLObject)removal_modules_concatenate_strings.NIL;
        SubLObject string = (SubLObject)removal_modules_concatenate_strings.NIL;
        SubLObject string_$2 = (SubLObject)removal_modules_concatenate_strings.NIL;
        position = permutation.rest();
        position_$1 = position.first();
        string = strings.rest();
        string_$2 = string.first();
        while (removal_modules_concatenate_strings.NIL != string || removal_modules_concatenate_strings.NIL != position) {
            if (!position_$1.numGE(Numbers.add(previous_position, Sequences.length(previous_string)))) {
                inconsistentP = (SubLObject)removal_modules_concatenate_strings.T;
            }
            previous_position = position_$1;
            previous_string = string_$2;
            position = position.rest();
            position_$1 = position.first();
            string = string.rest();
            string_$2 = string.first();
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_concatenate_strings.NIL == inconsistentP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-concatenate-strings.lisp", position = 10569L)
    public static SubLObject concatenate_strings_permute_pos_iterator_next_int(final SubLObject big_string, final SubLObject stringy_items, final SubLObject permutation, final SubLObject big_string_is_unicodeP) {
        SubLObject rest_of_permutation = permutation;
        SubLObject next_permutation_element = rest_of_permutation.first();
        SubLObject start = (SubLObject)removal_modules_concatenate_strings.ZERO_INTEGER;
        SubLObject end = next_permutation_element;
        SubLObject v_bindings = (SubLObject)removal_modules_concatenate_strings.NIL;
        SubLObject cdolist_list_var = stringy_items;
        SubLObject item = (SubLObject)removal_modules_concatenate_strings.NIL;
        item = cdolist_list_var.first();
        while (removal_modules_concatenate_strings.NIL != cdolist_list_var) {
            if (item.isString()) {
                start = Numbers.add(start, Sequences.length(item));
                rest_of_permutation = rest_of_permutation.rest();
                next_permutation_element = rest_of_permutation.first();
                end = (SubLObject)((removal_modules_concatenate_strings.NIL != next_permutation_element) ? next_permutation_element : removal_modules_concatenate_strings.NIL);
            }
            else {
                v_bindings = ConsesLow.append(v_bindings, removal_concatenate_strings_partial_bindings(big_string, item, start, end, big_string_is_unicodeP));
                start = end;
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        return (SubLObject)((removal_modules_concatenate_strings.NIL != v_bindings) ? ((!start.isInteger() || removal_modules_concatenate_strings.NIL != list_utilities.lengthE(big_string, start, (SubLObject)removal_modules_concatenate_strings.UNPROVIDED)) ? v_bindings : removal_modules_concatenate_strings.NIL) : removal_modules_concatenate_strings.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-concatenate-strings.lisp", position = 11552L)
    public static SubLObject removal_concatenate_strings_partial_bindings(final SubLObject big_string, final SubLObject var, SubLObject start, SubLObject end, final SubLObject big_string_is_unicodeP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (end.isInteger() && end.numG(Sequences.length(big_string))) {
            end = (SubLObject)removal_modules_concatenate_strings.NIL;
        }
        if (start.isInteger() && end.isInteger() && start.numG(end)) {
            start = end;
        }
        final SubLObject substring = string_utilities.substring(big_string, start, end);
        final SubLObject substring_to_use = (removal_modules_concatenate_strings.NIL != big_string_is_unicodeP) ? unicode_nauts.display_vector_string_to_cycl_safe_string(substring) : substring;
        thread.resetMultipleValues();
        final SubLObject v_bindings = unification_utilities.term_unify(var, substring_to_use, (SubLObject)removal_modules_concatenate_strings.UNPROVIDED, (SubLObject)removal_modules_concatenate_strings.UNPROVIDED);
        final SubLObject unify_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return v_bindings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-concatenate-strings.lisp", position = 12157L)
    public static SubLObject insert_empty_strings_between_adjacent_variables(final SubLObject items) {
        SubLObject new_items = (SubLObject)removal_modules_concatenate_strings.NIL;
        SubLObject last_item_was_a_variableP = (SubLObject)removal_modules_concatenate_strings.NIL;
        SubLObject cdolist_list_var = items;
        SubLObject item = (SubLObject)removal_modules_concatenate_strings.NIL;
        item = cdolist_list_var.first();
        while (removal_modules_concatenate_strings.NIL != cdolist_list_var) {
            if (removal_modules_concatenate_strings.NIL != variables.not_fully_bound_p(item)) {
                if (removal_modules_concatenate_strings.NIL != last_item_was_a_variableP) {
                    new_items = (SubLObject)ConsesLow.cons((SubLObject)removal_modules_concatenate_strings.$str23$, new_items);
                    new_items = (SubLObject)ConsesLow.cons(item, new_items);
                }
                else {
                    new_items = (SubLObject)ConsesLow.cons(item, new_items);
                }
                last_item_was_a_variableP = (SubLObject)removal_modules_concatenate_strings.T;
            }
            else {
                new_items = (SubLObject)ConsesLow.cons(item, new_items);
                last_item_was_a_variableP = (SubLObject)removal_modules_concatenate_strings.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        return Sequences.nreverse(new_items);
    }
    
    public static SubLObject declare_removal_modules_concatenate_strings_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_concatenate_strings", "removal_concatenate_strings_bound_args_supported_p", "REMOVAL-CONCATENATE-STRINGS-BOUND-ARGS-SUPPORTED-P", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_concatenate_strings", "removal_concatenate_strings_arg_supported_p", "REMOVAL-CONCATENATE-STRINGS-ARG-SUPPORTED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_concatenate_strings", "removal_concatenate_strings_concatenate_arg1_pos", "REMOVAL-CONCATENATE-STRINGS-CONCATENATE-ARG1-POS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_concatenate_strings", "removal_concatenate_strings_concatenate_neg", "REMOVAL-CONCATENATE-STRINGS-CONCATENATE-NEG", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_concatenate_strings", "removal_concatenate_strings_permute_cost", "REMOVAL-CONCATENATE-STRINGS-PERMUTE-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_concatenate_strings", "removal_concatenate_strings_permute_pos_output_generate", "REMOVAL-CONCATENATE-STRINGS-PERMUTE-POS-OUTPUT-GENERATE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_concatenate_strings", "new_concatenate_strings_permute_pos_iterator", "NEW-CONCATENATE-STRINGS-PERMUTE-POS-ITERATOR", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_concatenate_strings", "concatenate_strings_permute_pos_iterator_state", "CONCATENATE-STRINGS-PERMUTE-POS-ITERATOR-STATE", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_concatenate_strings", "concatenate_strings_permute_pos_iterator_done", "CONCATENATE-STRINGS-PERMUTE-POS-ITERATOR-DONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_concatenate_strings", "concatenate_strings_permute_pos_iterator_next", "CONCATENATE-STRINGS-PERMUTE-POS-ITERATOR-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_concatenate_strings", "concatenate_strings_permute_pos_iterator_finalize", "CONCATENATE-STRINGS-PERMUTE-POS-ITERATOR-FINALIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_concatenate_strings", "preprocess_stringy_args", "PREPROCESS-STRINGY-ARGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_concatenate_strings", "generate_concatenate_strings_permutation_iterator", "GENERATE-CONCATENATE-STRINGS-PERMUTATION-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_concatenate_strings", "permutation_ordered_consistentlyP", "PERMUTATION-ORDERED-CONSISTENTLY?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_concatenate_strings", "concatenate_strings_permute_pos_iterator_next_int", "CONCATENATE-STRINGS-PERMUTE-POS-ITERATOR-NEXT-INT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_concatenate_strings", "removal_concatenate_strings_partial_bindings", "REMOVAL-CONCATENATE-STRINGS-PARTIAL-BINDINGS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_concatenate_strings", "insert_empty_strings_between_adjacent_variables", "INSERT-EMPTY-STRINGS-BETWEEN-ADJACENT-VARIABLES", 1, 0, false);
        return (SubLObject)removal_modules_concatenate_strings.NIL;
    }
    
    public static SubLObject init_removal_modules_concatenate_strings_file() {
        return (SubLObject)removal_modules_concatenate_strings.NIL;
    }
    
    public static SubLObject setup_removal_modules_concatenate_strings_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_concatenate_strings.$const0$concatenateStrings);
        preference_modules.doomed_unless_either_arg_bindable((SubLObject)removal_modules_concatenate_strings.$kw1$POS, removal_modules_concatenate_strings.$const0$concatenateStrings);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_concatenate_strings.$kw2$NEG, removal_modules_concatenate_strings.$const0$concatenateStrings);
        inference_modules.inference_removal_module((SubLObject)removal_modules_concatenate_strings.$kw3$REMOVAL_CONCATENATE_STRINGS_CONCATENATE_ARG1_POS, (SubLObject)removal_modules_concatenate_strings.$list4);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_concatenate_strings.$sym5$REMOVAL_CONCATENATE_STRINGS_BOUND_ARGS_SUPPORTED_P);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_concatenate_strings.$sym8$REMOVAL_CONCATENATE_STRINGS_CONCATENATE_ARG1_POS);
        inference_modules.inference_removal_module((SubLObject)removal_modules_concatenate_strings.$kw9$REMOVAL_CONCATENATE_STRINGS_CONCATENATE_NEG, (SubLObject)removal_modules_concatenate_strings.$list10);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_concatenate_strings.$sym11$REMOVAL_CONCATENATE_STRINGS_CONCATENATE_NEG);
        inference_modules.inference_removal_module((SubLObject)removal_modules_concatenate_strings.$kw12$REMOVAL_CONCATENATE_STRINGS_PERMUTE_POS, (SubLObject)removal_modules_concatenate_strings.$list13);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_concatenate_strings.$sym14$REMOVAL_CONCATENATE_STRINGS_PERMUTE_COST);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_concatenate_strings.$sym15$REMOVAL_CONCATENATE_STRINGS_PERMUTE_POS_OUTPUT_GENERATE);
        return (SubLObject)removal_modules_concatenate_strings.NIL;
    }
    
    public void declareFunctions() {
        declare_removal_modules_concatenate_strings_file();
    }
    
    public void initializeVariables() {
        init_removal_modules_concatenate_strings_file();
    }
    
    public void runTopLevelForms() {
        setup_removal_modules_concatenate_strings_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_concatenate_strings();
        $const0$concatenateStrings = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("concatenateStrings"));
        $kw1$POS = SubLObjectFactory.makeKeyword("POS");
        $kw2$NEG = SubLObjectFactory.makeKeyword("NEG");
        $kw3$REMOVAL_CONCATENATE_STRINGS_CONCATENATE_ARG1_POS = SubLObjectFactory.makeKeyword("REMOVAL-CONCATENATE-STRINGS-CONCATENATE-ARG1-POS");
        $list4 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("concatenateStrings")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.listS(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("concatenateStrings")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-CONCATENATE-STRINGS-BOUND-ARGS-SUPPORTED-P"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_concatenate_strings.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-CONCATENATE-STRINGS-CONCATENATE-ARG1-POS"), SubLObjectFactory.makeKeyword("SUPPORT-MT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$concatenateStrings :not-fully-bound . :fully-bound)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$concatenateStrings ?X \"foo\" \"bar\")\nwill bind ?X to \"foobar\"") });
        $sym5$REMOVAL_CONCATENATE_STRINGS_BOUND_ARGS_SUPPORTED_P = SubLObjectFactory.makeSymbol("REMOVAL-CONCATENATE-STRINGS-BOUND-ARGS-SUPPORTED-P");
        $list6 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("ARG1"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGS"));
        $kw7$OPAQUE = SubLObjectFactory.makeKeyword("OPAQUE");
        $sym8$REMOVAL_CONCATENATE_STRINGS_CONCATENATE_ARG1_POS = SubLObjectFactory.makeSymbol("REMOVAL-CONCATENATE-STRINGS-CONCATENATE-ARG1-POS");
        $kw9$REMOVAL_CONCATENATE_STRINGS_CONCATENATE_NEG = SubLObjectFactory.makeKeyword("REMOVAL-CONCATENATE-STRINGS-CONCATENATE-NEG");
        $list10 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("concatenateStrings")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.listS(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("concatenateStrings")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-CONCATENATE-STRINGS-BOUND-ARGS-SUPPORTED-P"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_concatenate_strings.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-CONCATENATE-STRINGS-CONCATENATE-NEG"), SubLObjectFactory.makeKeyword("SUPPORT-MT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$concatenateStrings :fully-bound . :fully-bound))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$concatenateStrings \"something unrelated\" \"foo\" \"bar\"))\nwill be provable\n    (#$not (#$concatenateStrings \"foobar\" \"foo\" \"bar\"))\nwill fail to be provable") });
        $sym11$REMOVAL_CONCATENATE_STRINGS_CONCATENATE_NEG = SubLObjectFactory.makeSymbol("REMOVAL-CONCATENATE-STRINGS-CONCATENATE-NEG");
        $kw12$REMOVAL_CONCATENATE_STRINGS_PERMUTE_POS = SubLObjectFactory.makeKeyword("REMOVAL-CONCATENATE-STRINGS-PERMUTE-POS");
        $list13 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("concatenateStrings")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.listS(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("concatenateStrings")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-CONCATENATE-STRINGS-PERMUTE-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-CONCATENATE-STRINGS-PERMUTE-POS-OUTPUT-GENERATE"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("OPAQUE"), SubLObjectFactory.makeKeyword("SUPPORT-MT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$concatenateStrings :fully-bound . :not-fully-bound)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$concatenateStrings \"foobar\" ?X \"o\" ?Z)\nwill bind ?X ?Z to both \"fo\" \"bar\"\nand \"f\" \"obar\".") });
        $sym14$REMOVAL_CONCATENATE_STRINGS_PERMUTE_COST = SubLObjectFactory.makeSymbol("REMOVAL-CONCATENATE-STRINGS-PERMUTE-COST");
        $sym15$REMOVAL_CONCATENATE_STRINGS_PERMUTE_POS_OUTPUT_GENERATE = SubLObjectFactory.makeSymbol("REMOVAL-CONCATENATE-STRINGS-PERMUTE-POS-OUTPUT-GENERATE");
        $sym16$CONCATENATE_STRINGS_PERMUTE_POS_ITERATOR_DONE = SubLObjectFactory.makeSymbol("CONCATENATE-STRINGS-PERMUTE-POS-ITERATOR-DONE");
        $sym17$CONCATENATE_STRINGS_PERMUTE_POS_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("CONCATENATE-STRINGS-PERMUTE-POS-ITERATOR-NEXT");
        $sym18$CONCATENATE_STRINGS_PERMUTE_POS_ITERATOR_FINALIZE = SubLObjectFactory.makeSymbol("CONCATENATE-STRINGS-PERMUTE-POS-ITERATOR-FINALIZE");
        $list19 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BIG-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGY-ITEMS"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGS-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("PERMUTATIONS-ITERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"), (SubLObject)SubLObjectFactory.makeSymbol("BIG-STRING-IS-UNICODE?"));
        $sym20$UNICODE_NAUT_P = SubLObjectFactory.makeSymbol("UNICODE-NAUT-P");
        $sym21$NAT_ARG1 = SubLObjectFactory.makeSymbol("NAT-ARG1");
        $list22 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("BIG-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGY-ITEMS"));
        $str23$ = SubLObjectFactory.makeString("");
    }
}

/*

	Total time: 76 ms
	
*/