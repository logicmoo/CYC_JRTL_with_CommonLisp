/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.el_utilities.closedP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.intersection;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.union;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class ke_coherence extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new ke_coherence();

 public static final String myName = "com.cyc.cycjava.cycl.ke_coherence";


    static private final SubLSymbol $sym1$EL_VAR_ = makeSymbol("EL-VAR?");





    private static final SubLSymbol ALL_LITERAL_TERMS = makeSymbol("ALL-LITERAL-TERMS");

    // Definitions
    public static final SubLObject connected_kb_formulaP_alt(SubLObject formula) {
        return com.cyc.cycjava.cycl.ke_coherence.connected_formulaP(formula, symbol_function(VARIABLE_P));
    }

    // Definitions
    public static SubLObject connected_kb_formulaP(final SubLObject formula) {
        return connected_formulaP(formula, symbol_function(VARIABLE_P));
    }

    public static final SubLObject connected_formulaP_alt(SubLObject formula, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym1$EL_VAR_);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject cnfs = clausifier.cnf_clausal_form(formula, mt_relevance_macros.$mt$.getDynamicValue(thread));
                SubLObject mt = thread.secondMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject unconnectedP = NIL;
                    SubLObject pcase_var = cnfs;
                    if (pcase_var.eql($$True)) {
                    } else {
                        if (pcase_var.eql($$False)) {
                        } else {
                            if (NIL == unconnectedP) {
                                {
                                    SubLObject csome_list_var = cnfs;
                                    SubLObject cnf = NIL;
                                    for (cnf = csome_list_var.first(); !((NIL != unconnectedP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , cnf = csome_list_var.first()) {
                                        unconnectedP = makeBoolean(NIL == com.cyc.cycjava.cycl.ke_coherence.connected_cnfP(cnf, varP));
                                    }
                                }
                            }
                        }
                    }
                    return makeBoolean(NIL == unconnectedP);
                }
            }
        }
    }

    public static SubLObject connected_formulaP(final SubLObject formula, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym1$EL_VAR_);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject cnfs = clausifier.cnf_clausal_form(formula, mt_relevance_macros.$mt$.getDynamicValue(thread));
        final SubLObject mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject unconnectedP = NIL;
        final SubLObject pcase_var = cnfs;
        if (!pcase_var.eql($$True)) {
            if (!pcase_var.eql($$False)) {
                if (NIL == unconnectedP) {
                    SubLObject csome_list_var;
                    SubLObject cnf;
                    for (csome_list_var = cnfs, cnf = NIL, cnf = csome_list_var.first(); (NIL == unconnectedP) && (NIL != csome_list_var); unconnectedP = makeBoolean(NIL == connected_cnfP(cnf, varP)) , csome_list_var = csome_list_var.rest() , cnf = csome_list_var.first()) {
                    }
                }
            }
        }
        return makeBoolean(NIL == unconnectedP);
    }

    public static final SubLObject connected_cnfP_alt(SubLObject cnf, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym1$EL_VAR_);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject unconnectedP = NIL;
                if (!((NIL != closedP(cnf, varP)) || (NIL != com.cyc.cycjava.cycl.ke_coherence.connected_cnf_intP(cnf, varP)))) {
                    unconnectedP = T;
                }
                if (((NIL != unconnectedP) && (NIL != wff_vars.$within_wffP$.getDynamicValue(thread))) && (NIL != wff_utilities.$check_wff_coherenceP$.getDynamicValue(thread))) {
                    com.cyc.cycjava.cycl.ke_coherence.note_unconnected_cnf(cnf, UNPROVIDED);
                }
                return makeBoolean(NIL == unconnectedP);
            }
        }
    }

    public static SubLObject connected_cnfP(final SubLObject cnf, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym1$EL_VAR_);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject unconnectedP = NIL;
        if ((NIL == closedP(cnf, varP)) && (NIL == connected_cnf_intP(cnf, varP))) {
            unconnectedP = T;
        }
        if (((NIL != unconnectedP) && (NIL != wff_vars.$within_wffP$.getDynamicValue(thread))) && (NIL != wff_utilities.$check_wff_coherenceP$.getDynamicValue(thread))) {
            note_unconnected_cnf(cnf, UNPROVIDED);
        }
        return makeBoolean(NIL == unconnectedP);
    }

    public static final SubLObject note_unconnected_cnfs_alt(SubLObject cnfs, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym1$EL_VAR_);
        }
        {
            SubLObject cdolist_list_var = cnfs;
            SubLObject cnf = NIL;
            for (cnf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cnf = cdolist_list_var.first()) {
                com.cyc.cycjava.cycl.ke_coherence.note_unconnected_cnf(cnf, varP);
            }
        }
        return NIL;
    }

    public static SubLObject note_unconnected_cnfs(final SubLObject cnfs, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym1$EL_VAR_);
        }
        SubLObject cdolist_list_var = cnfs;
        SubLObject cnf = NIL;
        cnf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            note_unconnected_cnf(cnf, varP);
            cdolist_list_var = cdolist_list_var.rest();
            cnf = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject note_unconnected_cnf_alt(SubLObject cnf, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym1$EL_VAR_);
        }
        {
            SubLObject isolated = com.cyc.cycjava.cycl.ke_coherence.unconnected_cnf_terms(cnf, varP);
            if (NIL != isolated) {
                wff.note_coherence_violation(list($ISOLATED_TERMS, clauses.cnf_formula(cnf, UNPROVIDED), isolated));
            }
        }
        return NIL;
    }

    public static SubLObject note_unconnected_cnf(final SubLObject cnf, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym1$EL_VAR_);
        }
        final SubLObject isolated = unconnected_cnf_terms(cnf, varP);
        if (NIL != isolated) {
            wff.note_coherence_violation(list($ISOLATED_TERMS, clauses.cnf_formula(cnf, UNPROVIDED), isolated));
        }
        return NIL;
    }

    public static final SubLObject ground_cnfP_alt(SubLObject cnf, SubLObject var, SubLObject dummy) {
        if (var == UNPROVIDED) {
            var = symbol_function(VARIABLE_P);
        }
        if (dummy == UNPROVIDED) {
            dummy = NIL;
        }
        return NIL;
    }

    public static SubLObject ground_cnfP(final SubLObject cnf, SubLObject var, SubLObject dummy) {
        if (var == UNPROVIDED) {
            var = symbol_function(VARIABLE_P);
        }
        if (dummy == UNPROVIDED) {
            dummy = NIL;
        }
        return NIL;
    }

    public static final SubLObject connected_cnf_intP_alt(SubLObject cnf, SubLObject termP) {
        if (termP == UNPROVIDED) {
            termP = NIL;
        }
        {
            SubLObject connectedP = NIL;
            SubLObject literals = clause_utilities.cnf_literals(cnf);
            SubLObject unconnected = NIL;
            SubLObject connected = NIL;
            SubLObject reachable = NIL;
            for (unconnected = com.cyc.cycjava.cycl.ke_coherence.selected_literals_terms(literals, termP), connected = list(unconnected.first()), reachable = connected; !((NIL != connectedP) || (NIL == connected)); unconnected = set_difference(unconnected, reachable, symbol_function(EQUAL), UNPROVIDED) , connected = com.cyc.cycjava.cycl.ke_coherence.connected_nodes(reachable, literals, termP, symbol_function(EQUAL)) , reachable = union(reachable, connected, symbol_function(EQUAL), UNPROVIDED)) {
            }
            connectedP = sublisp_null(unconnected);
            return connectedP;
        }
    }

    public static SubLObject connected_cnf_intP(final SubLObject cnf, SubLObject termP) {
        if (termP == UNPROVIDED) {
            termP = NIL;
        }
        SubLObject connectedP = NIL;
        final SubLObject literals = clause_utilities.cnf_literals(cnf);
        SubLObject unconnected = NIL;
        SubLObject connected = NIL;
        SubLObject reachable = NIL;
        unconnected = selected_literals_terms(literals, termP);
        for (connected = reachable = list(unconnected.first()); (NIL == connectedP) && (NIL != connected); connected = connected_nodes(reachable, literals, termP, symbol_function(EQUAL)) , reachable = union(reachable, connected, symbol_function(EQUAL), UNPROVIDED)) {
            unconnected = set_difference(unconnected, reachable, symbol_function(EQUAL), UNPROVIDED);
        }
        connectedP = sublisp_null(unconnected);
        return connectedP;
    }

    public static final SubLObject selected_literals_terms_alt(SubLObject literals, SubLObject termP) {
        if (termP == UNPROVIDED) {
            termP = NIL;
        }
        if (NIL != termP) {
            return list_utilities.remove_if_not(termP, list_utilities.mapunion(ALL_LITERAL_TERMS, literals, symbol_function(EQUAL)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else {
            return list_utilities.mapunion(ALL_LITERAL_TERMS, literals, symbol_function(EQUAL));
        }
    }

    public static SubLObject selected_literals_terms(final SubLObject literals, SubLObject termP) {
        if (termP == UNPROVIDED) {
            termP = NIL;
        }
        if (NIL != termP) {
            return list_utilities.remove_if_not(termP, list_utilities.mapunion(ALL_LITERAL_TERMS, literals, symbol_function(EQUAL)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return list_utilities.mapunion(ALL_LITERAL_TERMS, literals, symbol_function(EQUAL));
    }

    public static final SubLObject connected_nodes_alt(SubLObject nodes, SubLObject links, SubLObject accessor, SubLObject test) {
        if (accessor == UNPROVIDED) {
            accessor = symbol_function(CDR);
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = links;
            SubLObject link = NIL;
            for (link = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , link = cdolist_list_var.first()) {
                if (NIL != com.cyc.cycjava.cycl.ke_coherence.connected_linkP(nodes, link, test)) {
                    result = union(result, list_utilities.cons_tree_gather(link, accessor, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                }
            }
            return set_difference(result, nodes, test, UNPROVIDED);
        }
    }

    public static SubLObject connected_nodes(final SubLObject nodes, final SubLObject links, SubLObject accessor, SubLObject test) {
        if (accessor == UNPROVIDED) {
            accessor = symbol_function(CDR);
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        SubLObject result = NIL;
        SubLObject cdolist_list_var = links;
        SubLObject link = NIL;
        link = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != connected_linkP(nodes, link, test)) {
                result = union(result, list_utilities.cons_tree_gather(link, accessor, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            link = cdolist_list_var.first();
        } 
        return set_difference(result, nodes, test, UNPROVIDED);
    }

    public static final SubLObject connected_linkP_alt(SubLObject nodes, SubLObject link, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        {
            SubLObject connectedP = NIL;
            if (NIL == connectedP) {
                {
                    SubLObject csome_list_var = nodes;
                    SubLObject node = NIL;
                    for (node = csome_list_var.first(); !((NIL != connectedP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , node = csome_list_var.first()) {
                        connectedP = list_utilities.cons_tree_find(node, link, test, UNPROVIDED);
                    }
                }
            }
            return connectedP;
        }
    }

    public static SubLObject connected_linkP(final SubLObject nodes, final SubLObject link, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        SubLObject connectedP = NIL;
        if (NIL == connectedP) {
            SubLObject csome_list_var;
            SubLObject node;
            for (csome_list_var = nodes, node = NIL, node = csome_list_var.first(); (NIL == connectedP) && (NIL != csome_list_var); connectedP = list_utilities.cons_tree_find(node, link, test, UNPROVIDED) , csome_list_var = csome_list_var.rest() , node = csome_list_var.first()) {
            }
        }
        return connectedP;
    }

    public static final SubLObject old_connected_nodes_alt(SubLObject nodes, SubLObject links, SubLObject accessor, SubLObject test) {
        if (accessor == UNPROVIDED) {
            accessor = symbol_function(CDR);
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = links;
            SubLObject link = NIL;
            for (link = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , link = cdolist_list_var.first()) {
                {
                    SubLObject link_nodes = funcall(accessor, link);
                    if (NIL != list_utilities.intersectP(nodes, link_nodes, test, UNPROVIDED)) {
                        result = union(result, link_nodes, UNPROVIDED, UNPROVIDED);
                    }
                }
            }
            return set_difference(result, nodes, test, UNPROVIDED);
        }
    }

    public static SubLObject old_connected_nodes(final SubLObject nodes, final SubLObject links, SubLObject accessor, SubLObject test) {
        if (accessor == UNPROVIDED) {
            accessor = symbol_function(CDR);
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        SubLObject result = NIL;
        SubLObject cdolist_list_var = links;
        SubLObject link = NIL;
        link = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject link_nodes = funcall(accessor, link);
            if (NIL != list_utilities.intersectP(nodes, link_nodes, test, UNPROVIDED)) {
                result = union(result, link_nodes, UNPROVIDED, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            link = cdolist_list_var.first();
        } 
        return set_difference(result, nodes, test, UNPROVIDED);
    }

    public static final SubLObject unconnected_cnf_terms_alt(SubLObject cnf, SubLObject termP) {
        if (termP == UNPROVIDED) {
            termP = NIL;
        }
        {
            SubLObject result = NIL;
            SubLObject literals = clause_utilities.cnf_literals(cnf);
            SubLObject unconnected = NIL;
            SubLObject connected = NIL;
            SubLObject reachable = NIL;
            for (unconnected = com.cyc.cycjava.cycl.ke_coherence.selected_literals_terms(literals, termP), connected = list(unconnected.first()), reachable = connected; !((NIL == unconnected) || (NIL == connected)); unconnected = set_difference(unconnected, reachable, symbol_function(EQUAL), UNPROVIDED) , connected = com.cyc.cycjava.cycl.ke_coherence.connected_nodes(reachable, literals, termP, symbol_function(EQUAL)) , reachable = union(reachable, connected, symbol_function(EQUAL), UNPROVIDED)) {
            }
            result = unconnected;
            return result;
        }
    }

    public static SubLObject unconnected_cnf_terms(final SubLObject cnf, SubLObject termP) {
        if (termP == UNPROVIDED) {
            termP = NIL;
        }
        SubLObject result = NIL;
        SubLObject literals;
        SubLObject unconnected;
        SubLObject connected;
        SubLObject reachable;
        for (literals = clause_utilities.cnf_literals(cnf), unconnected = NIL, connected = NIL, reachable = NIL, unconnected = selected_literals_terms(literals, termP), connected = reachable = list(unconnected.first()); (NIL != unconnected) && (NIL != connected); unconnected = set_difference(unconnected, reachable, symbol_function(EQUAL), UNPROVIDED) , connected = connected_nodes(reachable, literals, termP, symbol_function(EQUAL)) , reachable = union(reachable, connected, symbol_function(EQUAL), UNPROVIDED)) {
        }
        result = unconnected;
        return result;
    }

    public static final SubLObject formula_relevant_only_literalsP_alt(SubLObject formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject cnfs = clausifier.cnf_clausal_form(formula, mt_relevance_macros.$mt$.getDynamicValue(thread));
                SubLObject mt = thread.secondMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject irrelevantP = NIL;
                    SubLObject pcase_var = cnfs;
                    if (pcase_var.eql($$True)) {
                    } else {
                        if (pcase_var.eql($$False)) {
                        } else {
                            if (NIL == irrelevantP) {
                                {
                                    SubLObject csome_list_var = cnfs;
                                    SubLObject cnf = NIL;
                                    for (cnf = csome_list_var.first(); !((NIL != irrelevantP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , cnf = csome_list_var.first()) {
                                        irrelevantP = com.cyc.cycjava.cycl.ke_coherence.cnf_irrelevant_literalsP(cnf);
                                    }
                                }
                            }
                        }
                    }
                    return makeBoolean(NIL == irrelevantP);
                }
            }
        }
    }

    public static SubLObject formula_relevant_only_literalsP(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject cnfs = clausifier.cnf_clausal_form(formula, mt_relevance_macros.$mt$.getDynamicValue(thread));
        final SubLObject mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject irrelevantP = NIL;
        final SubLObject pcase_var = cnfs;
        if (!pcase_var.eql($$True)) {
            if (!pcase_var.eql($$False)) {
                if (NIL == irrelevantP) {
                    SubLObject csome_list_var;
                    SubLObject cnf;
                    for (csome_list_var = cnfs, cnf = NIL, cnf = csome_list_var.first(); (NIL == irrelevantP) && (NIL != csome_list_var); irrelevantP = cnf_irrelevant_literalsP(cnf) , csome_list_var = csome_list_var.rest() , cnf = csome_list_var.first()) {
                    }
                }
            }
        }
        return makeBoolean(NIL == irrelevantP);
    }

    public static final SubLObject cnf_relevant_only_literalsP_alt(SubLObject cnf) {
        return makeBoolean(NIL == com.cyc.cycjava.cycl.ke_coherence.cnf_irrelevant_literalsP(cnf));
    }

    public static SubLObject cnf_relevant_only_literalsP(final SubLObject cnf) {
        return makeBoolean(NIL == cnf_irrelevant_literalsP(cnf));
    }

    public static final SubLObject cnf_irrelevant_literalsP_alt(SubLObject cnf) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject irrelevantP = com.cyc.cycjava.cycl.ke_coherence.cnf_irrelevant_literals_intP(cnf);
                if (((NIL != irrelevantP) && (NIL != wff_vars.$within_wffP$.getDynamicValue(thread))) && (NIL != wff_utilities.$check_wff_coherenceP$.getDynamicValue(thread))) {
                    com.cyc.cycjava.cycl.ke_coherence.note_irrelevant_cnf(cnf);
                }
                return irrelevantP;
            }
        }
    }

    public static SubLObject cnf_irrelevant_literalsP(final SubLObject cnf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject irrelevantP = cnf_irrelevant_literals_intP(cnf);
        if (((NIL != irrelevantP) && (NIL != wff_vars.$within_wffP$.getDynamicValue(thread))) && (NIL != wff_utilities.$check_wff_coherenceP$.getDynamicValue(thread))) {
            note_irrelevant_cnf(cnf);
        }
        return irrelevantP;
    }

    public static final SubLObject note_irrelevant_cnfs_alt(SubLObject cnfs) {
        {
            SubLObject cdolist_list_var = cnfs;
            SubLObject cnf = NIL;
            for (cnf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cnf = cdolist_list_var.first()) {
                com.cyc.cycjava.cycl.ke_coherence.note_irrelevant_cnf(cnf);
            }
        }
        return NIL;
    }

    public static SubLObject note_irrelevant_cnfs(final SubLObject cnfs) {
        SubLObject cdolist_list_var = cnfs;
        SubLObject cnf = NIL;
        cnf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            note_irrelevant_cnf(cnf);
            cdolist_list_var = cdolist_list_var.rest();
            cnf = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject note_irrelevant_cnf_alt(SubLObject cnf) {
        {
            SubLObject irrelevant = com.cyc.cycjava.cycl.ke_coherence.cnf_irrelevant_literals(cnf);
            if (NIL != irrelevant) {
                wff.note_coherence_violation(list($IRRELEVANT_LITERALS, clauses.cnf_formula(cnf, UNPROVIDED), irrelevant));
            }
        }
        return NIL;
    }

    public static SubLObject note_irrelevant_cnf(final SubLObject cnf) {
        final SubLObject irrelevant = cnf_irrelevant_literals(cnf);
        if (NIL != irrelevant) {
            wff.note_coherence_violation(list($IRRELEVANT_LITERALS, clauses.cnf_formula(cnf, UNPROVIDED), irrelevant));
        }
        return NIL;
    }

    public static final SubLObject cnf_irrelevant_literals_intP_alt(SubLObject cnf) {
        return list_utilities.intersectP(clauses.pos_lits(cnf), clauses.neg_lits(cnf), symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject cnf_irrelevant_literals_intP(final SubLObject cnf) {
        return list_utilities.intersectP(clauses.pos_lits(cnf), clauses.neg_lits(cnf), symbol_function(EQUAL), UNPROVIDED);
    }

    public static final SubLObject cnf_irrelevant_literals_alt(SubLObject cnf) {
        return intersection(clauses.pos_lits(cnf), clauses.neg_lits(cnf), symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject cnf_irrelevant_literals(final SubLObject cnf) {
        return intersection(clauses.pos_lits(cnf), clauses.neg_lits(cnf), symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject declare_ke_coherence_file() {
        declareFunction("connected_kb_formulaP", "CONNECTED-KB-FORMULA?", 1, 0, false);
        declareFunction("connected_formulaP", "CONNECTED-FORMULA?", 1, 1, false);
        declareFunction("connected_cnfP", "CONNECTED-CNF?", 1, 1, false);
        declareFunction("note_unconnected_cnfs", "NOTE-UNCONNECTED-CNFS", 1, 1, false);
        declareFunction("note_unconnected_cnf", "NOTE-UNCONNECTED-CNF", 1, 1, false);
        declareFunction("ground_cnfP", "GROUND-CNF?", 1, 2, false);
        declareFunction("connected_cnf_intP", "CONNECTED-CNF-INT?", 1, 1, false);
        declareFunction("selected_literals_terms", "SELECTED-LITERALS-TERMS", 1, 1, false);
        declareFunction("connected_nodes", "CONNECTED-NODES", 2, 2, false);
        declareFunction("connected_linkP", "CONNECTED-LINK?", 2, 1, false);
        declareFunction("old_connected_nodes", "OLD-CONNECTED-NODES", 2, 2, false);
        declareFunction("unconnected_cnf_terms", "UNCONNECTED-CNF-TERMS", 1, 1, false);
        declareFunction("formula_relevant_only_literalsP", "FORMULA-RELEVANT-ONLY-LITERALS?", 1, 0, false);
        declareFunction("cnf_relevant_only_literalsP", "CNF-RELEVANT-ONLY-LITERALS?", 1, 0, false);
        declareFunction("cnf_irrelevant_literalsP", "CNF-IRRELEVANT-LITERALS?", 1, 0, false);
        declareFunction("note_irrelevant_cnfs", "NOTE-IRRELEVANT-CNFS", 1, 0, false);
        declareFunction("note_irrelevant_cnf", "NOTE-IRRELEVANT-CNF", 1, 0, false);
        declareFunction("cnf_irrelevant_literals_intP", "CNF-IRRELEVANT-LITERALS-INT?", 1, 0, false);
        declareFunction("cnf_irrelevant_literals", "CNF-IRRELEVANT-LITERALS", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_ke_coherence_file() {
        return NIL;
    }

    public static SubLObject setup_ke_coherence_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_ke_coherence_file();
    }

    @Override
    public void initializeVariables() {
        init_ke_coherence_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_ke_coherence_file();
    }

    
}

/**
 * Total time: 99 ms
 */
