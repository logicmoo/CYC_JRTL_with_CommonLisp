/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.format_nil.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class pph_scripts extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new pph_scripts();

 public static final String myName = "com.cyc.cycjava.cycl.pph_scripts";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol GENERATE_SCRIPT_EXPANSION = makeSymbol("GENERATE-SCRIPT-EXPANSION");

    static private final SubLString $str3$The_steps_in_the_script__S_____ = makeString("The steps in the script ~S:~%~%");



    static private final SubLString $str6$PPH_HASH_ONE_ARG_KEYWORD__Hashing = makeString("PPH-HASH-ONE-ARG-KEYWORD: Hashing ~S -> ~S.~%");



    static private final SubLString $str8$_PPH_error_level_ = makeString("(PPH error level ");

    static private final SubLString $str9$__ = makeString(") ");

    static private final SubLString $str10$__PPH_ADD_CONSTRAINTS__Non_binary = makeString("~&PPH-ADD-CONSTRAINTS: Non-binary constraint: ~S.~%");

    static private final SubLList $list11 = list(makeSymbol("PRED"), makeSymbol("ARG1"), makeSymbol("ARG2"));





    private static final SubLObject $$Agent_Generic = reader_make_constant_shell("Agent-Generic");

    static private final SubLString $str16$PPH_ISA_CONSTRAINT_ON_ARG_KEYWORD = makeString("PPH-ISA-CONSTRAINT-ON-ARG-KEYWORD: ~D #$isa constraints on ~S.~%");



    static private final SubLString $str18$_D___A = makeString("~D. ~A");

    static private final SubLString $str19$__PPH_REPHRASE_CLAUSE__Substituti = makeString("~&PPH-REPHRASE-CLAUSE: Substituting ~S for~% ~S.~%");

    static private final SubLString $str20$__PPH_REPHRASE_CLAUSE__Replacing_ = makeString("~&PPH-REPHRASE-CLAUSE: Replacing ~s with ~s.~%");



    // Definitions
    /**
     * Paraphrase EXP, which is the #$expansion formula for a #$ScriptPredicate.
     */
    @LispMethod(comment = "Paraphrase EXP, which is the #$expansion formula for a #$ScriptPredicate.")
    public static final SubLObject generate_script_expansion_alt(SubLObject exp, SubLObject nl_preds, SubLObject determiner) {
        {
            SubLObject arg_keyword_hash = com.cyc.cycjava.cycl.pph_scripts.pph_hash_arg_keywords(exp);
            SubLObject event_sequence = com.cyc.cycjava.cycl.pph_scripts.pph_find_event_sequence(exp);
            SubLObject intro_string = format(NIL, $str_alt3$The_steps_in_the_script__S_____, cycl_utilities.formula_arg1(exp, UNPROVIDED));
            SubLObject seq_string = com.cyc.cycjava.cycl.pph_scripts.generate_event_sequence(event_sequence, arg_keyword_hash);
            return cconcatenate(intro_string, seq_string);
        }
    }

    // Definitions
    /**
     * Paraphrase EXP, which is the #$expansion formula for a #$ScriptPredicate.
     */
    @LispMethod(comment = "Paraphrase EXP, which is the #$expansion formula for a #$ScriptPredicate.")
    public static SubLObject generate_script_expansion(final SubLObject exp, final SubLObject nl_preds, final SubLObject determiner) {
        final SubLObject arg_keyword_hash = pph_hash_arg_keywords(exp);
        final SubLObject event_sequence = pph_find_event_sequence(exp);
        final SubLObject intro_string = format(NIL, $str3$The_steps_in_the_script__S_____, cycl_utilities.formula_arg1(exp, UNPROVIDED));
        final SubLObject seq_string = generate_event_sequence(event_sequence, arg_keyword_hash);
        return cconcatenate(intro_string, seq_string);
    }

    /**
     *
     *
     * @param FORMULA;
     * 		the #$expansion formula for a #$ScriptPredicate.
     * @return HASH-TABLE-P; keys: generic argument keywords in FORMULA
    vals: their expansions
     */
    @LispMethod(comment = "@param FORMULA;\r\n\t\tthe #$expansion formula for a #$ScriptPredicate.\r\n@return HASH-TABLE-P; keys: generic argument keywords in FORMULA\r\nvals: their expansions")
    public static final SubLObject pph_hash_arg_keywords_alt(SubLObject formula) {
        {
            SubLObject table = make_hash_table(SIXTEEN_INTEGER, UNPROVIDED, UNPROVIDED);
            SubLObject arg_keywords = com.cyc.cycjava.cycl.pph_scripts.pph_find_arg_keywords(formula);
            SubLObject cdolist_list_var = arg_keywords;
            SubLObject arg_keyword = NIL;
            for (arg_keyword = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg_keyword = cdolist_list_var.first()) {
                com.cyc.cycjava.cycl.pph_scripts.pph_hash_one_arg_keyword(arg_keyword, table, formula);
            }
            return table;
        }
    }

    /**
     *
     *
     * @param FORMULA;
     * 		the #$expansion formula for a #$ScriptPredicate.
     * @return HASH-TABLE-P; keys: generic argument keywords in FORMULA
    vals: their expansions
     */
    @LispMethod(comment = "@param FORMULA;\r\n\t\tthe #$expansion formula for a #$ScriptPredicate.\r\n@return HASH-TABLE-P; keys: generic argument keywords in FORMULA\r\nvals: their expansions")
    public static SubLObject pph_hash_arg_keywords(final SubLObject formula) {
        final SubLObject table = make_hash_table(SIXTEEN_INTEGER, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject arg_keywords = cdolist_list_var = pph_find_arg_keywords(formula);
        SubLObject arg_keyword = NIL;
        arg_keyword = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            pph_hash_one_arg_keyword(arg_keyword, table, formula);
            cdolist_list_var = cdolist_list_var.rest();
            arg_keyword = cdolist_list_var.first();
        } 
        return table;
    }

    /**
     *
     *
     * @return LISTP; of the generic arg keywords in FORMULA
     */
    @LispMethod(comment = "@return LISTP; of the generic arg keywords in FORMULA")
    public static final SubLObject pph_find_arg_keywords_alt(SubLObject formula) {
        return list_utilities.tree_gather(formula, symbol_function(GENERIC_ARG_P), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return LISTP; of the generic arg keywords in FORMULA
     */
    @LispMethod(comment = "@return LISTP; of the generic arg keywords in FORMULA")
    public static SubLObject pph_find_arg_keywords(final SubLObject formula) {
        return list_utilities.tree_gather(formula, symbol_function(GENERIC_ARG_P), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Set the value for ARG-KEYWORD in TABLE to be an expression incorporating
     * all constraints on ARG-KEYWORD in FORMULA
     */
    @LispMethod(comment = "Set the value for ARG-KEYWORD in TABLE to be an expression incorporating\r\nall constraints on ARG-KEYWORD in FORMULA\nSet the value for ARG-KEYWORD in TABLE to be an expression incorporating\nall constraints on ARG-KEYWORD in FORMULA")
    public static final SubLObject pph_hash_one_arg_keyword_alt(SubLObject arg_keyword, SubLObject table, SubLObject formula) {
        {
            SubLObject isa_col = com.cyc.cycjava.cycl.pph_scripts.pph_isa_constraint_on_arg_keyword(arg_keyword, formula);
            SubLObject new_value = NIL;
            SubLObject constraints = com.cyc.cycjava.cycl.pph_scripts.pph_non_isa_constraints_on_arg_keyword(arg_keyword, formula, table);
            if (NIL != constraints) {
                new_value = list($$SomeFn, com.cyc.cycjava.cycl.pph_scripts.pph_add_constraints(isa_col, arg_keyword, constraints, table));
            } else {
                new_value = list($$SomeFn, isa_col);
            }
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                format(T, $str_alt6$PPH_HASH_ONE_ARG_KEYWORD__Hashing, arg_keyword, new_value);
            }
            sethash(arg_keyword, table, new_value);
            {
                SubLObject key = NIL;
                SubLObject old_value = NIL;
                {
                    final Iterator cdohash_iterator = getEntrySetIterator(table);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            key = getEntryKey(cdohash_entry);
                            old_value = getEntryValue(cdohash_entry);
                            sethash(key, table, subst(new_value, arg_keyword, old_value, UNPROVIDED, UNPROVIDED));
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
            return new_value;
        }
    }

    /**
     * Set the value for ARG-KEYWORD in TABLE to be an expression incorporating
     * all constraints on ARG-KEYWORD in FORMULA
     */
    @LispMethod(comment = "Set the value for ARG-KEYWORD in TABLE to be an expression incorporating\r\nall constraints on ARG-KEYWORD in FORMULA\nSet the value for ARG-KEYWORD in TABLE to be an expression incorporating\nall constraints on ARG-KEYWORD in FORMULA")
    public static SubLObject pph_hash_one_arg_keyword(final SubLObject arg_keyword, final SubLObject table, final SubLObject formula) {
        final SubLObject isa_col = pph_isa_constraint_on_arg_keyword(arg_keyword, formula);
        SubLObject new_value = NIL;
        final SubLObject constraints = pph_non_isa_constraints_on_arg_keyword(arg_keyword, formula, table);
        if (NIL != constraints) {
            new_value = list($$SomeFn, pph_add_constraints(isa_col, arg_keyword, constraints, table));
        } else {
            new_value = list($$SomeFn, isa_col);
        }
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
            format_nil.force_format(T, $str6$PPH_HASH_ONE_ARG_KEYWORD__Hashing, arg_keyword, new_value, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        sethash(arg_keyword, table, new_value);
        SubLObject key = NIL;
        SubLObject old_value = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                key = getEntryKey(cdohash_entry);
                old_value = getEntryValue(cdohash_entry);
                sethash(key, table, subst(new_value, arg_keyword, old_value, UNPROVIDED, UNPROVIDED));
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return new_value;
    }

    public static final SubLObject pph_non_isa_constraints_on_arg_keyword_alt(SubLObject arg_keyword, SubLObject formula, SubLObject table) {
        {
            SubLObject constraints = NIL;
            SubLObject cdolist_list_var = cycl_utilities.formula_args(cycl_utilities.formula_arg2(formula, UNPROVIDED), UNPROVIDED);
            SubLObject conjunct = NIL;
            for (conjunct = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , conjunct = cdolist_list_var.first()) {
                if ((NIL == el_formula_with_operator_p(conjunct, $$isa)) && (NIL != member(arg_keyword, conjunct, UNPROVIDED, UNPROVIDED))) {
                    {
                        SubLObject new_refP = NIL;
                        if (NIL == new_refP) {
                            {
                                SubLObject csome_list_var = cycl_utilities.formula_args(conjunct, UNPROVIDED);
                                SubLObject arg = NIL;
                                for (arg = csome_list_var.first(); !((NIL != new_refP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , arg = csome_list_var.first()) {
                                    if ((arg.isKeyword() && (!arg.eql(arg_keyword))) && (NIL == gethash(arg, table, UNPROVIDED))) {
                                        new_refP = T;
                                    }
                                }
                            }
                        }
                        if (NIL == new_refP) {
                            {
                                SubLObject item_var = conjunct;
                                if (NIL == member(item_var, constraints, symbol_function(EQL), symbol_function(IDENTITY))) {
                                    constraints = cons(item_var, constraints);
                                }
                            }
                        }
                    }
                }
            }
            return constraints;
        }
    }

    public static SubLObject pph_non_isa_constraints_on_arg_keyword(final SubLObject arg_keyword, final SubLObject formula, final SubLObject table) {
        SubLObject constraints = NIL;
        SubLObject cdolist_list_var = cycl_utilities.formula_args(cycl_utilities.formula_arg2(formula, UNPROVIDED), UNPROVIDED);
        SubLObject conjunct = NIL;
        conjunct = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL == el_formula_with_operator_p(conjunct, $$isa)) && (NIL != member(arg_keyword, conjunct, UNPROVIDED, UNPROVIDED))) {
                SubLObject new_refP = NIL;
                if (NIL == new_refP) {
                    SubLObject csome_list_var = cycl_utilities.formula_args(conjunct, UNPROVIDED);
                    SubLObject arg = NIL;
                    arg = csome_list_var.first();
                    while ((NIL == new_refP) && (NIL != csome_list_var)) {
                        if ((arg.isKeyword() && (!arg.eql(arg_keyword))) && (NIL == gethash(arg, table, UNPROVIDED))) {
                            new_refP = T;
                        }
                        csome_list_var = csome_list_var.rest();
                        arg = csome_list_var.first();
                    } 
                }
                if (NIL == new_refP) {
                    final SubLObject item_var = conjunct;
                    if (NIL == member(item_var, constraints, symbol_function(EQL), symbol_function(IDENTITY))) {
                        constraints = cons(item_var, constraints);
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            conjunct = cdolist_list_var.first();
        } 
        return constraints;
    }

    public static final SubLObject pph_add_constraints_alt(SubLObject isa_col, SubLObject arg_keyword, SubLObject constraints, SubLObject table) {
        {
            SubLObject ans = isa_col;
            SubLObject cdolist_list_var = constraints;
            SubLObject constraint = NIL;
            for (constraint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint = cdolist_list_var.first()) {
                if (NIL == el_binary_formula_p(constraint)) {
                    {
                        SubLObject new_format_string = cconcatenate($str_alt8$_PPH_error_level_, new SubLObject[]{ format_nil_s_no_copy(ONE_INTEGER), $str_alt9$__, format_nil_a_no_copy($str_alt10$__PPH_ADD_CONSTRAINTS__Non_binary) });
                        pph_error.pph_handle_error(new_format_string, list(constraint));
                    }
                }
                {
                    SubLObject datum = constraint;
                    SubLObject current = datum;
                    SubLObject pred = NIL;
                    SubLObject arg1 = NIL;
                    SubLObject arg2 = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt11);
                    pred = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt11);
                    arg1 = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt11);
                    arg2 = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (arg1 == arg_keyword) {
                            ans = list($$SubcollectionOfWithRelationToFn, ans, pred, arg2);
                        } else {
                            ans = list($$SubcollectionOfWithRelationFromFn, ans, pred, arg1);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt11);
                    }
                }
            }
            return ans;
        }
    }

    public static SubLObject pph_add_constraints(final SubLObject isa_col, final SubLObject arg_keyword, final SubLObject constraints, final SubLObject table) {
        SubLObject ans = isa_col;
        SubLObject cdolist_list_var = constraints;
        SubLObject constraint = NIL;
        constraint = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == el_binary_formula_p(constraint)) {
                final SubLObject new_format_string = cconcatenate($str8$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str9$__, format_nil.format_nil_a_no_copy($str10$__PPH_ADD_CONSTRAINTS__Non_binary) });
                pph_error.pph_handle_error(new_format_string, list(constraint));
            }
            SubLObject current;
            final SubLObject datum = current = constraint;
            SubLObject pred = NIL;
            SubLObject arg1 = NIL;
            SubLObject arg2 = NIL;
            destructuring_bind_must_consp(current, datum, $list11);
            pred = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list11);
            arg1 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list11);
            arg2 = current.first();
            current = current.rest();
            if (NIL == current) {
                if (arg1.eql(arg_keyword)) {
                    ans = list($$SubcollectionOfWithRelationToFn, ans, pred, arg2);
                } else {
                    ans = list($$SubcollectionOfWithRelationFromFn, ans, pred, arg1);
                }
            } else {
                cdestructuring_bind_error(datum, $list11);
            }
            cdolist_list_var = cdolist_list_var.rest();
            constraint = cdolist_list_var.first();
        } 
        return ans;
    }

    public static final SubLObject pph_isa_constraint_on_arg_keyword_alt(SubLObject arg_keyword, SubLObject formula) {
        {
            SubLObject cols = NIL;
            SubLObject cdolist_list_var = cycl_utilities.formula_args(cycl_utilities.formula_arg2(formula, UNPROVIDED), UNPROVIDED);
            SubLObject conjunct = NIL;
            for (conjunct = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , conjunct = cdolist_list_var.first()) {
                if ((NIL != el_formula_with_operator_p(conjunct, $$isa)) && (cycl_utilities.formula_arg1(conjunct, UNPROVIDED) == arg_keyword)) {
                    {
                        SubLObject item_var = cycl_utilities.formula_arg2(conjunct, UNPROVIDED);
                        if (NIL == member(item_var, cols, symbol_function(EQL), symbol_function(IDENTITY))) {
                            cols = cons(item_var, cols);
                        }
                    }
                }
            }
            if (NIL != list_utilities.lengthE(cols, ONE_INTEGER, UNPROVIDED)) {
                return cols.first();
            } else {
                if ((NIL == cols) && (arg_keyword == $ARG1)) {
                    return $$Agent_Generic;
                } else {
                    {
                        SubLObject new_format_string = cconcatenate($str_alt8$_PPH_error_level_, new SubLObject[]{ format_nil_s_no_copy(ONE_INTEGER), $str_alt9$__, format_nil_a_no_copy($str_alt16$PPH_ISA_CONSTRAINT_ON_ARG_KEYWORD) });
                        pph_error.pph_handle_error(new_format_string, list(length(cols), arg_keyword));
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject pph_isa_constraint_on_arg_keyword(final SubLObject arg_keyword, final SubLObject formula) {
        SubLObject cols = NIL;
        SubLObject cdolist_list_var = cycl_utilities.formula_args(cycl_utilities.formula_arg2(formula, UNPROVIDED), UNPROVIDED);
        SubLObject conjunct = NIL;
        conjunct = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != el_formula_with_operator_p(conjunct, $$isa)) && cycl_utilities.formula_arg1(conjunct, UNPROVIDED).eql(arg_keyword)) {
                final SubLObject item_var = cycl_utilities.formula_arg2(conjunct, UNPROVIDED);
                if (NIL == member(item_var, cols, symbol_function(EQL), symbol_function(IDENTITY))) {
                    cols = cons(item_var, cols);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            conjunct = cdolist_list_var.first();
        } 
        if (NIL != list_utilities.lengthE(cols, ONE_INTEGER, UNPROVIDED)) {
            return cols.first();
        }
        if ((NIL == cols) && (arg_keyword == $ARG1)) {
            return $$Agent_Generic;
        }
        final SubLObject new_format_string = cconcatenate($str8$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str9$__, format_nil.format_nil_a_no_copy($str16$PPH_ISA_CONSTRAINT_ON_ARG_KEYWORD) });
        pph_error.pph_handle_error(new_format_string, list(length(cols), arg_keyword));
        return NIL;
    }

    /**
     *
     *
     * @param FORMULA;
     * 		the #$expansion formula for a #$ScriptPredicate.
     * @return EL-FORMULA-P; the #$actionSequence clause of FORMULA
     */
    @LispMethod(comment = "@param FORMULA;\r\n\t\tthe #$expansion formula for a #$ScriptPredicate.\r\n@return EL-FORMULA-P; the #$actionSequence clause of FORMULA")
    public static final SubLObject pph_find_event_sequence_alt(SubLObject formula) {
        {
            SubLObject event_seq = NIL;
            if (NIL == event_seq) {
                {
                    SubLObject csome_list_var = cycl_utilities.formula_args(cycl_utilities.formula_arg2(formula, UNPROVIDED), UNPROVIDED);
                    SubLObject arg = NIL;
                    for (arg = csome_list_var.first(); !((NIL != event_seq) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , arg = csome_list_var.first()) {
                        if ((NIL != el_formula_p(arg)) && (NIL != pph_utilities.pph_genl_predicateP(cycl_utilities.formula_operator(arg), $$eventSequence, UNPROVIDED))) {
                            event_seq = arg;
                        }
                    }
                }
            }
            return event_seq;
        }
    }

    /**
     *
     *
     * @param FORMULA;
     * 		the #$expansion formula for a #$ScriptPredicate.
     * @return EL-FORMULA-P; the #$actionSequence clause of FORMULA
     */
    @LispMethod(comment = "@param FORMULA;\r\n\t\tthe #$expansion formula for a #$ScriptPredicate.\r\n@return EL-FORMULA-P; the #$actionSequence clause of FORMULA")
    public static SubLObject pph_find_event_sequence(final SubLObject formula) {
        SubLObject event_seq = NIL;
        if (NIL == event_seq) {
            SubLObject csome_list_var = cycl_utilities.formula_args(cycl_utilities.formula_arg2(formula, UNPROVIDED), UNPROVIDED);
            SubLObject arg = NIL;
            arg = csome_list_var.first();
            while ((NIL == event_seq) && (NIL != csome_list_var)) {
                if ((NIL != el_formula_p(arg)) && (NIL != pph_utilities.pph_genl_predicateP(cycl_utilities.formula_operator(arg), $$eventSequence, UNPROVIDED))) {
                    event_seq = arg;
                }
                csome_list_var = csome_list_var.rest();
                arg = csome_list_var.first();
            } 
        }
        return event_seq;
    }

    public static final SubLObject generate_event_sequence_alt(SubLObject event_sequence, SubLObject arg_keyword_hash) {
        {
            SubLObject action_list = cycl_utilities.formula_args(cycl_utilities.formula_arg1(event_sequence, UNPROVIDED), UNPROVIDED);
            SubLObject stack = NIL;
            SubLObject cdotimes_end_var = length(action_list);
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                {
                    SubLObject item = nth(i, action_list);
                    SubLObject rephrase = com.cyc.cycjava.cycl.pph_scripts.pph_rephrase_clause(item, arg_keyword_hash);
                    stack = cons(format(NIL, $str_alt18$_D___A, add(i, ONE_INTEGER), pph_main.generate_text(rephrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), stack);
                }
            }
            return string_utilities.bunge(nreverse(stack), CHAR_newline);
        }
    }

    public static SubLObject generate_event_sequence(final SubLObject event_sequence, final SubLObject arg_keyword_hash) {
        final SubLObject action_list = cycl_utilities.formula_args(cycl_utilities.formula_arg1(event_sequence, UNPROVIDED), UNPROVIDED);
        SubLObject stack = NIL;
        SubLObject cdotimes_end_var;
        SubLObject i;
        SubLObject item;
        SubLObject rephrase;
        for (cdotimes_end_var = length(action_list), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
            item = nth(i, action_list);
            rephrase = pph_rephrase_clause(item, arg_keyword_hash);
            stack = cons(format(NIL, $str18$_D___A, add(i, ONE_INTEGER), pph_main.generate_text(rephrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), stack);
        }
        return string_utilities.bunge(nreverse(stack), CHAR_newline);
    }

    public static final SubLObject pph_rephrase_clause_alt(SubLObject clause, SubLObject arg_keyword_hash) {
        if (NIL == el_formula_p(clause)) {
            return clause;
        }
        {
            SubLObject arg_stack = NIL;
            SubLObject cdolist_list_var = clause;
            SubLObject arg = NIL;
            for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                {
                    SubLObject rephrased_arg = arg;
                    if (arg.isKeyword()) {
                        {
                            SubLObject raw_value = gethash(arg, arg_keyword_hash, UNPROVIDED);
                            SubLObject value = raw_value;
                            if (raw_value.isCons()) {
                                {
                                    SubLObject stack = NIL;
                                    SubLObject cdolist_list_var_1 = raw_value;
                                    SubLObject item = NIL;
                                    for (item = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , item = cdolist_list_var_1.first()) {
                                        stack = cons(com.cyc.cycjava.cycl.pph_scripts.pph_rephrase_clause(item, arg_keyword_hash), stack);
                                    }
                                    value = reverse(stack);
                                }
                            }
                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                format(T, $str_alt19$__PPH_REPHRASE_CLAUSE__Substituti, value, arg);
                            }
                            rephrased_arg = value;
                            if ((NIL != list_utilities.tree_find(arg, clause, UNPROVIDED, UNPROVIDED)) && (NIL != el_formula_with_operator_p(value, $$SomeFn))) {
                                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                    format(T, $str_alt20$__PPH_REPHRASE_CLAUSE__Replacing_, value, list($$TheInstance, cycl_utilities.formula_arg1(value, UNPROVIDED)));
                                }
                                sethash(arg, arg_keyword_hash, list($$TheInstance, cycl_utilities.formula_arg1(value, UNPROVIDED)));
                            }
                        }
                    }
                    arg_stack = cons(rephrased_arg, arg_stack);
                }
            }
            return reverse(arg_stack);
        }
    }

    public static SubLObject pph_rephrase_clause(final SubLObject clause, final SubLObject arg_keyword_hash) {
        if (NIL == el_formula_p(clause)) {
            return clause;
        }
        SubLObject arg_stack = NIL;
        SubLObject cdolist_list_var = clause;
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject rephrased_arg = arg;
            if (arg.isKeyword()) {
                SubLObject value;
                final SubLObject raw_value = value = gethash(arg, arg_keyword_hash, UNPROVIDED);
                if (raw_value.isCons()) {
                    SubLObject stack = NIL;
                    SubLObject cdolist_list_var_$1 = raw_value;
                    SubLObject item = NIL;
                    item = cdolist_list_var_$1.first();
                    while (NIL != cdolist_list_var_$1) {
                        stack = cons(pph_rephrase_clause(item, arg_keyword_hash), stack);
                        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                        item = cdolist_list_var_$1.first();
                    } 
                    value = reverse(stack);
                }
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                    format_nil.force_format(T, $str19$__PPH_REPHRASE_CLAUSE__Substituti, value, arg, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                rephrased_arg = value;
                if ((NIL != list_utilities.tree_find(arg, clause, UNPROVIDED, UNPROVIDED)) && (NIL != el_formula_with_operator_p(value, $$SomeFn))) {
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                        format_nil.force_format(T, $str20$__PPH_REPHRASE_CLAUSE__Replacing_, value, list($$TheInstance, cycl_utilities.formula_arg1(value, UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    sethash(arg, arg_keyword_hash, list($$TheInstance, cycl_utilities.formula_arg1(value, UNPROVIDED)));
                }
            }
            arg_stack = cons(rephrased_arg, arg_stack);
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        return reverse(arg_stack);
    }

    public static SubLObject declare_pph_scripts_file() {
        declareFunction("generate_script_expansion", "GENERATE-SCRIPT-EXPANSION", 3, 0, false);
        declareFunction("pph_hash_arg_keywords", "PPH-HASH-ARG-KEYWORDS", 1, 0, false);
        declareFunction("pph_find_arg_keywords", "PPH-FIND-ARG-KEYWORDS", 1, 0, false);
        declareFunction("pph_hash_one_arg_keyword", "PPH-HASH-ONE-ARG-KEYWORD", 3, 0, false);
        declareFunction("pph_non_isa_constraints_on_arg_keyword", "PPH-NON-ISA-CONSTRAINTS-ON-ARG-KEYWORD", 3, 0, false);
        declareFunction("pph_add_constraints", "PPH-ADD-CONSTRAINTS", 4, 0, false);
        declareFunction("pph_isa_constraint_on_arg_keyword", "PPH-ISA-CONSTRAINT-ON-ARG-KEYWORD", 2, 0, false);
        declareFunction("pph_find_event_sequence", "PPH-FIND-EVENT-SEQUENCE", 1, 0, false);
        declareFunction("generate_event_sequence", "GENERATE-EVENT-SEQUENCE", 2, 0, false);
        declareFunction("pph_rephrase_clause", "PPH-REPHRASE-CLAUSE", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_pph_scripts_file() {
        return NIL;
    }

    public static SubLObject setup_pph_scripts_file() {
        pph_types.pph_register_method(GENERATE_SCRIPT_EXPANSION, $SCRIPT_EXPANSION, $DECENT);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_pph_scripts_file();
    }

    @Override
    public void initializeVariables() {
        init_pph_scripts_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_pph_scripts_file();
    }

    static {
    }

    static private final SubLString $str_alt3$The_steps_in_the_script__S_____ = makeString("The steps in the script ~S:~%~%");

    static private final SubLString $str_alt6$PPH_HASH_ONE_ARG_KEYWORD__Hashing = makeString("PPH-HASH-ONE-ARG-KEYWORD: Hashing ~S -> ~S.~%");

    static private final SubLString $str_alt8$_PPH_error_level_ = makeString("(PPH error level ");

    static private final SubLString $str_alt9$__ = makeString(") ");

    static private final SubLString $str_alt10$__PPH_ADD_CONSTRAINTS__Non_binary = makeString("~&PPH-ADD-CONSTRAINTS: Non-binary constraint: ~S.~%");

    static private final SubLList $list_alt11 = list(makeSymbol("PRED"), makeSymbol("ARG1"), makeSymbol("ARG2"));

    static private final SubLString $str_alt16$PPH_ISA_CONSTRAINT_ON_ARG_KEYWORD = makeString("PPH-ISA-CONSTRAINT-ON-ARG-KEYWORD: ~D #$isa constraints on ~S.~%");

    static private final SubLString $str_alt18$_D___A = makeString("~D. ~A");

    static private final SubLString $str_alt19$__PPH_REPHRASE_CLAUSE__Substituti = makeString("~&PPH-REPHRASE-CLAUSE: Substituting ~S for~% ~S.~%");

    static private final SubLString $str_alt20$__PPH_REPHRASE_CLAUSE__Replacing_ = makeString("~&PPH-REPHRASE-CLAUSE: Replacing ~s with ~s.~%");
}

/**
 * Total time: 117 ms
 */
