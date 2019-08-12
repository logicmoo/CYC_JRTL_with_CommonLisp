/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SIMILARITY
 * source file: /cyc/top/cycl/similarity.lisp
 * created:     2019/07/03 17:38:12
 */
public final class similarity extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new similarity();

 public static final String myName = "com.cyc.cycjava.cycl.similarity";


    // defparameter
    @LispMethod(comment = "A hash table to store information about how constants are related to collections.  Keys are \"nodepairs\" (a two item list) and values are a list of attributes.  Current attributes are \'asserted, :implied, and :basis\ndefparameter")
    // Definitions
    /**
     * A hash table to store information about how constants are related to collections.  Keys are "nodepairs" (a two item list) and values are a list of attributes.  Current attributes are 'asserted, :implied, and :basis
     */
    public static final SubLSymbol $similarity_relation_hash$ = makeSymbol("*SIMILARITY-RELATION-HASH*");

    static private final SubLSymbol $sym2$ASSERTED_ASSERTION_ = makeSymbol("ASSERTED-ASSERTION?");

    static private final SubLSymbol $sym4$GENERALITY_ESTIMATE_ = makeSymbol("GENERALITY-ESTIMATE<");



    static private final SubLList $list12 = list(ONE_INTEGER);









    static private final SubLSymbol $sym17$ST_NODE_WITH_NUMBER_ = makeSymbol("ST-NODE-WITH-NUMBER<");

    /**
     * Adds RELATION to the value list for key NODEPAIR in hash table *similarity-relation-hash*
     */
    @LispMethod(comment = "Adds RELATION to the value list for key NODEPAIR in hash table *similarity-relation-hash*")
    public static final SubLObject sim_add_relation_alt(SubLObject nodepair, SubLObject relation) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            hash_table_utilities.pushnew_hash(nodepair, relation, $similarity_relation_hash$.getDynamicValue(thread), UNPROVIDED);
            return NIL;
        }
    }

    /**
     * Adds RELATION to the value list for key NODEPAIR in hash table *similarity-relation-hash*
     */
    @LispMethod(comment = "Adds RELATION to the value list for key NODEPAIR in hash table *similarity-relation-hash*")
    public static SubLObject sim_add_relation(final SubLObject nodepair, final SubLObject relation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        hash_table_utilities.pushnew_hash(nodepair, relation, $similarity_relation_hash$.getDynamicValue(thread), UNPROVIDED);
        return NIL;
    }

    /**
     * Simply looks up NODEPAIR in hash table *similarity-relation-hash* and returns the value.
     */
    @LispMethod(comment = "Simply looks up NODEPAIR in hash table *similarity-relation-hash* and returns the value.")
    public static final SubLObject sim_get_relations_alt(SubLObject nodepair) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return gethash(nodepair, $similarity_relation_hash$.getDynamicValue(thread), UNPROVIDED);
        }
    }

    /**
     * Simply looks up NODEPAIR in hash table *similarity-relation-hash* and returns the value.
     */
    @LispMethod(comment = "Simply looks up NODEPAIR in hash table *similarity-relation-hash* and returns the value.")
    public static SubLObject sim_get_relations(final SubLObject nodepair) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return gethash(nodepair, $similarity_relation_hash$.getDynamicValue(thread), UNPROVIDED);
    }

    /**
     * Looks up NODEPAIR in hash table *similarity-relation-hash* and returns t if RELATION is in the attribute list, otherwise returns nil.
     */
    @LispMethod(comment = "Looks up NODEPAIR in hash table *similarity-relation-hash* and returns t if RELATION is in the attribute list, otherwise returns nil.")
    public static final SubLObject sim_check_relation_alt(SubLObject nodepair, SubLObject relation) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject relation_list = gethash(nodepair, $similarity_relation_hash$.getDynamicValue(thread), UNPROVIDED);
                return subl_promotions.memberP(relation, relation_list, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    /**
     * Looks up NODEPAIR in hash table *similarity-relation-hash* and returns t if RELATION is in the attribute list, otherwise returns nil.
     */
    @LispMethod(comment = "Looks up NODEPAIR in hash table *similarity-relation-hash* and returns t if RELATION is in the attribute list, otherwise returns nil.")
    public static SubLObject sim_check_relation(final SubLObject nodepair, final SubLObject relation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject relation_list = gethash(nodepair, $similarity_relation_hash$.getDynamicValue(thread), UNPROVIDED);
        return subl_promotions.memberP(relation, relation_list, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Given a list of collections COLS, a predicate PRED, and a microtheory MT, build a similarity tree showing the relation between COLS.  The tree is a list of pairs of nodes representing a genls relation.  The first element of the pair is the superior, the second the inferior.  As a side effect, *similarity-relation-hash* is built with the relevant relations between nodepairs.
     */
    @LispMethod(comment = "Given a list of collections COLS, a predicate PRED, and a microtheory MT, build a similarity tree showing the relation between COLS.  The tree is a list of pairs of nodes representing a genls relation.  The first element of the pair is the superior, the second the inferior.  As a side effect, *similarity-relation-hash* is built with the relevant relations between nodepairs.")
    public static final SubLObject make_similarity_tree_alt(SubLObject cols, SubLObject pred, SubLObject mt) {
        {
            SubLObject superiors_list = NIL;
            {
                SubLObject cdolist_list_var = cols;
                SubLObject c = NIL;
                for (c = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , c = cdolist_list_var.first()) {
                    {
                        SubLObject assertion_list = com.cyc.cycjava.cycl.similarity.pred_term_gafs(c, pred, mt, UNPROVIDED, UNPROVIDED);
                        {
                            SubLObject cdolist_list_var_1 = assertion_list;
                            SubLObject assertion = NIL;
                            for (assertion = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , assertion = cdolist_list_var_1.first()) {
                                {
                                    SubLObject item_var = assertions_high.gaf_arg2(assertion);
                                    if (NIL == member(item_var, superiors_list, symbol_function(EQL), symbol_function(IDENTITY))) {
                                        superiors_list = cons(item_var, superiors_list);
                                    }
                                }
                            }
                        }
                        {
                            SubLObject cdolist_list_var_2 = list_utilities.remove_if_not(symbol_function($sym2$ASSERTED_ASSERTION_), assertion_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject assertion = NIL;
                            for (assertion = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , assertion = cdolist_list_var_2.first()) {
                                com.cyc.cycjava.cycl.similarity.sim_add_relation(list(c, assertions_high.gaf_arg2(assertion)), $ASSERTED);
                            }
                        }
                    }
                    {
                        SubLObject cdolist_list_var_3 = com.cyc.cycjava.cycl.similarity.st_find_basis_cols(c, pred, mt);
                        SubLObject col = NIL;
                        for (col = cdolist_list_var_3.first(); NIL != cdolist_list_var_3; cdolist_list_var_3 = cdolist_list_var_3.rest() , col = cdolist_list_var_3.first()) {
                            com.cyc.cycjava.cycl.similarity.sim_add_relation(list(c, col), $BASIS);
                        }
                    }
                }
            }
            {
                SubLObject simtree = nreverse(com.cyc.cycjava.cycl.similarity.make_relation_tree(Sort.sort(superiors_list, symbol_function($sym4$GENERALITY_ESTIMATE_), UNPROVIDED), mt, UNPROVIDED));
                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.similarity.edge_list_nodes(simtree);
                SubLObject n = NIL;
                for (n = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , n = cdolist_list_var.first()) {
                    {
                        SubLObject cdolist_list_var_4 = cols;
                        SubLObject c = NIL;
                        for (c = cdolist_list_var_4.first(); NIL != cdolist_list_var_4; cdolist_list_var_4 = cdolist_list_var_4.rest() , c = cdolist_list_var_4.first()) {
                            if (NIL != com.cyc.cycjava.cycl.similarity.st_check_implied(c, n, pred, mt)) {
                                com.cyc.cycjava.cycl.similarity.sim_add_relation(list(c, n), $IMPLIED);
                            }
                        }
                    }
                }
                return simtree;
            }
        }
    }

    /**
     * Given a list of collections COLS, a predicate PRED, and a microtheory MT, build a similarity tree showing the relation between COLS.  The tree is a list of pairs of nodes representing a genls relation.  The first element of the pair is the superior, the second the inferior.  As a side effect, *similarity-relation-hash* is built with the relevant relations between nodepairs.
     */
    @LispMethod(comment = "Given a list of collections COLS, a predicate PRED, and a microtheory MT, build a similarity tree showing the relation between COLS.  The tree is a list of pairs of nodes representing a genls relation.  The first element of the pair is the superior, the second the inferior.  As a side effect, *similarity-relation-hash* is built with the relevant relations between nodepairs.")
    public static SubLObject make_similarity_tree(final SubLObject cols, final SubLObject pred, final SubLObject mt) {
        SubLObject superiors_list = NIL;
        SubLObject cdolist_list_var = cols;
        SubLObject c = NIL;
        c = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$1;
            final SubLObject assertion_list = cdolist_list_var_$1 = pred_term_gafs(c, pred, mt, UNPROVIDED, UNPROVIDED);
            SubLObject assertion = NIL;
            assertion = cdolist_list_var_$1.first();
            while (NIL != cdolist_list_var_$1) {
                final SubLObject item_var = assertions_high.gaf_arg2(assertion);
                if (NIL == member(item_var, superiors_list, symbol_function(EQL), symbol_function(IDENTITY))) {
                    superiors_list = cons(item_var, superiors_list);
                }
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                assertion = cdolist_list_var_$1.first();
            } 
            SubLObject cdolist_list_var_$2 = list_utilities.remove_if_not(symbol_function($sym2$ASSERTED_ASSERTION_), assertion_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            assertion = NIL;
            assertion = cdolist_list_var_$2.first();
            while (NIL != cdolist_list_var_$2) {
                sim_add_relation(list(c, assertions_high.gaf_arg2(assertion)), $ASSERTED);
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                assertion = cdolist_list_var_$2.first();
            } 
            SubLObject cdolist_list_var_$3 = st_find_basis_cols(c, pred, mt);
            SubLObject col = NIL;
            col = cdolist_list_var_$3.first();
            while (NIL != cdolist_list_var_$3) {
                sim_add_relation(list(c, col), $BASIS);
                cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                col = cdolist_list_var_$3.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            c = cdolist_list_var.first();
        } 
        final SubLObject simtree = nreverse(make_relation_tree(Sort.sort(superiors_list, symbol_function($sym4$GENERALITY_ESTIMATE_), UNPROVIDED), mt, UNPROVIDED));
        SubLObject cdolist_list_var2 = edge_list_nodes(simtree);
        SubLObject n = NIL;
        n = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            SubLObject cdolist_list_var_$4 = cols;
            SubLObject c2 = NIL;
            c2 = cdolist_list_var_$4.first();
            while (NIL != cdolist_list_var_$4) {
                if (NIL != st_check_implied(c2, n, pred, mt)) {
                    sim_add_relation(list(c2, n), $IMPLIED);
                }
                cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                c2 = cdolist_list_var_$4.first();
            } 
            cdolist_list_var2 = cdolist_list_var2.rest();
            n = cdolist_list_var2.first();
        } 
        return simtree;
    }

    /**
     * Make a 'relation tree' -- a tree with elements of COLS as nodes, adding min-ceiling-collections for all pairs, and having one root node.  The tree is a minimum tree of the genls hierarchy just showing the relationships between COLS.  It's a list of pairs of nodes representing genls relations.  The first element of the pair is the superior, the second the inferior.  MT is the microtheory we use to find genls assertions.
     */
    @LispMethod(comment = "Make a \'relation tree\' -- a tree with elements of COLS as nodes, adding min-ceiling-collections for all pairs, and having one root node.  The tree is a minimum tree of the genls hierarchy just showing the relationships between COLS.  It\'s a list of pairs of nodes representing genls relations.  The first element of the pair is the superior, the second the inferior.  MT is the microtheory we use to find genls assertions.")
    public static final SubLObject make_relation_tree_alt(SubLObject cols, SubLObject mt, SubLObject recurse_entry) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (recurse_entry == UNPROVIDED) {
            recurse_entry = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == cols) {
                return NIL;
            }
            {
                SubLObject edge_list = NIL;
                SubLObject reprocess_list = NIL;
                SubLObject col_queue = make_hash_table($int$64, UNPROVIDED, UNPROVIDED);
                SubLObject first_col = cols.first();
                SubLObject col_more = cols.rest();
                SubLObject index_end = ZERO_INTEGER;
                SubLObject doneP = NIL;
                if ((NIL == recurse_entry) && ONE_INTEGER.equal(length(cols))) {
                    edge_list = cons(list(first_col, first_col), edge_list);
                }
                {
                    SubLObject cdolist_list_var = col_more;
                    SubLObject this_col = NIL;
                    for (this_col = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , this_col = cdolist_list_var.first()) {
                        sethash(index_end, col_queue, this_col);
                        index_end = add(index_end, ONE_INTEGER);
                        reprocess_list = cons(this_col, reprocess_list);
                    }
                }
                {
                    SubLObject count = NIL;
                    for (count = ZERO_INTEGER; NIL == doneP; count = add(count, ONE_INTEGER)) {
                        {
                            SubLObject this_col = gethash(count, col_queue, UNPROVIDED);
                            if (NIL == this_col) {
                                doneP = T;
                            } else {
                                {
                                    SubLObject ceiling_cols = NIL;
                                    if (NIL == mt) {
                                        {
                                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                            try {
                                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                                ceiling_cols = genls.min_ceiling_cols(list(first_col, this_col), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            } finally {
                                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                    } else {
                                        ceiling_cols = genls.min_ceiling_cols(list(first_col, this_col), NIL, mt, UNPROVIDED);
                                    }
                                    {
                                        SubLObject cdolist_list_var = ceiling_cols;
                                        SubLObject ceiling_col = NIL;
                                        for (ceiling_col = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ceiling_col = cdolist_list_var.first()) {
                                            if (ceiling_col.equal(first_col)) {
                                                edge_list = cons(list(first_col, this_col), edge_list);
                                            } else {
                                                if (ceiling_col.equal(this_col)) {
                                                    edge_list = cons(list(this_col, first_col), edge_list);
                                                } else {
                                                    if (NIL == subl_promotions.memberP(ceiling_col, reprocess_list, UNPROVIDED, UNPROVIDED)) {
                                                        edge_list = cons(list(ceiling_col, first_col), edge_list);
                                                        edge_list = cons(list(ceiling_col, this_col), edge_list);
                                                        sethash(index_end, col_queue, ceiling_col);
                                                        index_end = add(index_end, ONE_INTEGER);
                                                        reprocess_list = cons(ceiling_col, reprocess_list);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return com.cyc.cycjava.cycl.similarity.edge_list_remove_redundant(union(edge_list, com.cyc.cycjava.cycl.similarity.make_relation_tree(nreverse(reprocess_list), mt, T), UNPROVIDED, UNPROVIDED));
            }
        }
    }

    /**
     * Make a 'relation tree' -- a tree with elements of COLS as nodes, adding min-ceiling-collections for all pairs, and having one root node.  The tree is a minimum tree of the genls hierarchy just showing the relationships between COLS.  It's a list of pairs of nodes representing genls relations.  The first element of the pair is the superior, the second the inferior.  MT is the microtheory we use to find genls assertions.
     */
    @LispMethod(comment = "Make a \'relation tree\' -- a tree with elements of COLS as nodes, adding min-ceiling-collections for all pairs, and having one root node.  The tree is a minimum tree of the genls hierarchy just showing the relationships between COLS.  It\'s a list of pairs of nodes representing genls relations.  The first element of the pair is the superior, the second the inferior.  MT is the microtheory we use to find genls assertions.")
    public static SubLObject make_relation_tree(final SubLObject cols, SubLObject mt, SubLObject recurse_entry) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (recurse_entry == UNPROVIDED) {
            recurse_entry = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == cols) {
            return NIL;
        }
        SubLObject edge_list = NIL;
        SubLObject reprocess_list = NIL;
        final SubLObject col_queue = make_hash_table($int$64, UNPROVIDED, UNPROVIDED);
        final SubLObject first_col = cols.first();
        final SubLObject col_more = cols.rest();
        SubLObject index_end = ZERO_INTEGER;
        SubLObject doneP = NIL;
        if ((NIL == recurse_entry) && ONE_INTEGER.equal(length(cols))) {
            edge_list = cons(list(first_col, first_col), edge_list);
        }
        SubLObject cdolist_list_var = col_more;
        SubLObject this_col = NIL;
        this_col = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sethash(index_end, col_queue, this_col);
            index_end = add(index_end, ONE_INTEGER);
            reprocess_list = cons(this_col, reprocess_list);
            cdolist_list_var = cdolist_list_var.rest();
            this_col = cdolist_list_var.first();
        } 
        SubLObject count = NIL;
        count = ZERO_INTEGER;
        while (NIL == doneP) {
            this_col = gethash(count, col_queue, UNPROVIDED);
            if (NIL == this_col) {
                doneP = T;
            } else {
                SubLObject ceiling_cols = NIL;
                if (NIL == mt) {
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        ceiling_cols = genls.min_ceiling_cols(list(first_col, this_col), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                } else {
                    ceiling_cols = genls.min_ceiling_cols(list(first_col, this_col), NIL, mt, UNPROVIDED);
                }
                SubLObject cdolist_list_var2 = ceiling_cols;
                SubLObject ceiling_col = NIL;
                ceiling_col = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    if (ceiling_col.equal(first_col)) {
                        edge_list = cons(list(first_col, this_col), edge_list);
                    } else
                        if (ceiling_col.equal(this_col)) {
                            edge_list = cons(list(this_col, first_col), edge_list);
                        } else
                            if (NIL == subl_promotions.memberP(ceiling_col, reprocess_list, UNPROVIDED, UNPROVIDED)) {
                                edge_list = cons(list(ceiling_col, first_col), edge_list);
                                edge_list = cons(list(ceiling_col, this_col), edge_list);
                                sethash(index_end, col_queue, ceiling_col);
                                index_end = add(index_end, ONE_INTEGER);
                                reprocess_list = cons(ceiling_col, reprocess_list);
                            }


                    cdolist_list_var2 = cdolist_list_var2.rest();
                    ceiling_col = cdolist_list_var2.first();
                } 
            }
            count = add(count, ONE_INTEGER);
        } 
        return edge_list_remove_redundant(union(edge_list, make_relation_tree(nreverse(reprocess_list), mt, T), UNPROVIDED, UNPROVIDED));
    }

    /**
     * Find the assertions in the KB using predicate PRED with TERM in place INDEX-ARG in microtheory MT with truth value TRUTH.
     */
    @LispMethod(comment = "Find the assertions in the KB using predicate PRED with TERM in place INDEX-ARG in microtheory MT with truth value TRUTH.")
    public static final SubLObject pred_term_gafs_alt(SubLObject v_term, SubLObject pred, SubLObject mt, SubLObject index_arg, SubLObject truth) {
        if (index_arg == UNPROVIDED) {
            index_arg = ONE_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject assertion_list = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                        mt_relevance_macros.$mt$.bind(mt, thread);
                        {
                            SubLObject pred_var = pred;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, index_arg, pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, index_arg, pred_var);
                                    SubLObject done_var = NIL;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        {
                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                            if (NIL != valid) {
                                                {
                                                    SubLObject final_index_iterator = NIL;
                                                    try {
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                                                        {
                                                            SubLObject done_var_5 = NIL;
                                                            SubLObject token_var_6 = NIL;
                                                            while (NIL == done_var_5) {
                                                                {
                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_6);
                                                                    SubLObject valid_7 = makeBoolean(token_var_6 != assertion);
                                                                    if (NIL != valid_7) {
                                                                        {
                                                                            SubLObject item_var = assertion;
                                                                            if (NIL == member(item_var, assertion_list, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                assertion_list = cons(item_var, assertion_list);
                                                                            }
                                                                        }
                                                                    }
                                                                    done_var_5 = makeBoolean(NIL == valid_7);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_8, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            done_var = makeBoolean(NIL == valid);
                                        }
                                    } 
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return assertion_list;
            }
        }
    }

    /**
     * Find the assertions in the KB using predicate PRED with TERM in place INDEX-ARG in microtheory MT with truth value TRUTH.
     */
    @LispMethod(comment = "Find the assertions in the KB using predicate PRED with TERM in place INDEX-ARG in microtheory MT with truth value TRUTH.")
    public static SubLObject pred_term_gafs(final SubLObject v_term, final SubLObject pred, final SubLObject mt, SubLObject index_arg, SubLObject truth) {
        if (index_arg == UNPROVIDED) {
            index_arg = ONE_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertion_list = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, index_arg, pred)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, index_arg, pred);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                            SubLObject done_var_$5 = NIL;
                            final SubLObject token_var_$6 = NIL;
                            while (NIL == done_var_$5) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$6);
                                final SubLObject valid_$7 = makeBoolean(!token_var_$6.eql(assertion));
                                if (NIL != valid_$7) {
                                    final SubLObject item_var = assertion;
                                    if (NIL == member(item_var, assertion_list, symbol_function(EQL), symbol_function(IDENTITY))) {
                                        assertion_list = cons(item_var, assertion_list);
                                    }
                                }
                                done_var_$5 = makeBoolean(NIL == valid_$7);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return assertion_list;
    }

    /**
     * Given a list of CONSTANTS, and a predicate PRED, we find all the mts which have assertions of the form (PRED CONSTANT ?X), and return them in a list sorted by generality-estimate.
     */
    @LispMethod(comment = "Given a list of CONSTANTS, and a predicate PRED, we find all the mts which have assertions of the form (PRED CONSTANT ?X), and return them in a list sorted by generality-estimate.")
    public static final SubLObject find_relevant_mts_alt(SubLObject constants, SubLObject pred) {
        {
            SubLObject mts = NIL;
            SubLObject cdolist_list_var = constants;
            SubLObject c = NIL;
            for (c = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , c = cdolist_list_var.first()) {
                mts = append(mts, kb_accessors.pred_mts(c, pred, $list_alt12));
            }
            return nreverse(Sort.sort(remove_duplicates(mts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function($sym4$GENERALITY_ESTIMATE_), UNPROVIDED));
        }
    }

    @LispMethod(comment = "Given a list of CONSTANTS, and a predicate PRED, we find all the mts which have assertions of the form (PRED CONSTANT ?X), and return them in a list sorted by generality-estimate.")
    public static SubLObject find_relevant_mts(final SubLObject constants, final SubLObject pred) {
        SubLObject mts = NIL;
        SubLObject cdolist_list_var = constants;
        SubLObject c = NIL;
        c = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            mts = append(mts, kb_accessors.pred_mts(c, pred, $list12));
            cdolist_list_var = cdolist_list_var.rest();
            c = cdolist_list_var.first();
        } 
        return nreverse(Sort.sort(remove_duplicates(mts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function($sym4$GENERALITY_ESTIMATE_), UNPROVIDED));
    }/**
     * Given a list of CONSTANTS, and a predicate PRED, we find all the mts which have assertions of the form (PRED CONSTANT ?X), and return them in a list sorted by generality-estimate.
     */


    /**
     * Find all the collections that are a minimal definition of TERM through predicate PRED.
     */
    @LispMethod(comment = "Find all the collections that are a minimal definition of TERM through predicate PRED.")
    public static final SubLObject st_find_basis_cols_alt(SubLObject v_term, SubLObject pred, SubLObject mt) {
        if (pred.equal($$isa) || (NIL != genl_predicates.genl_predicateP(pred, $$isa, mt, UNPROVIDED))) {
            return isa.min_isa(v_term, mt, UNPROVIDED);
        }
        if (pred.equal($$genls) || (NIL != genl_predicates.genl_predicateP(pred, $$genls, mt, UNPROVIDED))) {
            return genls.min_cols(genls.min_genls(v_term, mt, UNPROVIDED), mt, UNPROVIDED);
        }
        if (pred.equal($$genlPreds) || (NIL != genl_predicates.genl_predicateP(pred, $$genlPreds, mt, UNPROVIDED))) {
            return genl_predicates.min_genl_predicates(v_term, mt, UNPROVIDED);
        }
        if (pred.equal($$genlMt) || (NIL != genl_predicates.genl_predicateP(pred, $$genlMt, mt, UNPROVIDED))) {
            return genl_mts.min_genl_mts(v_term, mt, UNPROVIDED);
        }
        return NIL;
    }

    @LispMethod(comment = "Find all the collections that are a minimal definition of TERM through predicate PRED.")
    public static SubLObject st_find_basis_cols(final SubLObject v_term, final SubLObject pred, final SubLObject mt) {
        if (pred.equal($$isa) || (NIL != genl_predicates.genl_predicateP(pred, $$isa, mt, UNPROVIDED))) {
            return isa.min_isa(v_term, mt, UNPROVIDED);
        }
        if (pred.equal($$genls) || (NIL != genl_predicates.genl_predicateP(pred, $$genls, mt, UNPROVIDED))) {
            return genls.min_cols(genls.min_genls(v_term, mt, UNPROVIDED), mt, UNPROVIDED);
        }
        if (pred.equal($$genlPreds) || (NIL != genl_predicates.genl_predicateP(pred, $$genlPreds, mt, UNPROVIDED))) {
            return genl_predicates.min_genl_predicates(v_term, mt, UNPROVIDED);
        }
        if (pred.equal($$genlMt) || (NIL != genl_predicates.genl_predicateP(pred, $$genlMt, mt, UNPROVIDED))) {
            return genl_mts.min_genl_mts(v_term, mt, UNPROVIDED);
        }
        return NIL;
    }/**
     * Find all the collections that are a minimal definition of TERM through predicate PRED.
     */


    /**
     * If (PRED C COL) is true in MT, then return t, o/w return nil.
     */
    @LispMethod(comment = "If (PRED C COL) is true in MT, then return t, o/w return nil.")
    public static final SubLObject st_check_implied_alt(SubLObject v_term, SubLObject col, SubLObject pred, SubLObject mt) {
        if (pred.equal($$isa) || (NIL != genl_predicates.genl_predicateP(pred, $$isa, mt, UNPROVIDED))) {
            return isa.isaP(v_term, col, mt, UNPROVIDED);
        }
        if (pred.equal($$genls) || (NIL != genl_predicates.genl_predicateP(pred, $$genls, mt, UNPROVIDED))) {
            return genls.genlsP(v_term, col, mt, UNPROVIDED);
        }
        if (pred.equal($$genlPreds) || (NIL != genl_predicates.genl_predicateP(pred, $$genlPreds, mt, UNPROVIDED))) {
            return genl_predicates.genl_predP(v_term, col, mt, UNPROVIDED);
        }
        if (pred.equal($$genlMt) || (NIL != genl_predicates.genl_predicateP(pred, $$genlMt, mt, UNPROVIDED))) {
            return genl_mts.genl_mtP(v_term, col, mt, UNPROVIDED);
        }
        return NIL;
    }

    @LispMethod(comment = "If (PRED C COL) is true in MT, then return t, o/w return nil.")
    public static SubLObject st_check_implied(final SubLObject v_term, final SubLObject col, final SubLObject pred, final SubLObject mt) {
        if (pred.equal($$isa) || (NIL != genl_predicates.genl_predicateP(pred, $$isa, mt, UNPROVIDED))) {
            return isa.isaP(v_term, col, mt, UNPROVIDED);
        }
        if (pred.equal($$genls) || (NIL != genl_predicates.genl_predicateP(pred, $$genls, mt, UNPROVIDED))) {
            return genls.genlsP(v_term, col, mt, UNPROVIDED);
        }
        if (pred.equal($$genlPreds) || (NIL != genl_predicates.genl_predicateP(pred, $$genlPreds, mt, UNPROVIDED))) {
            return genl_predicates.genl_predP(v_term, col, mt, UNPROVIDED);
        }
        if (pred.equal($$genlMt) || (NIL != genl_predicates.genl_predicateP(pred, $$genlMt, mt, UNPROVIDED))) {
            return genl_mts.genl_mtP(v_term, col, mt, UNPROVIDED);
        }
        return NIL;
    }/**
     * If (PRED C COL) is true in MT, then return t, o/w return nil.
     */


    /**
     * Given an EDGE-LIST, and optionally a starting NODE, a NODE-NUMBERING, an initial INDENT and a list of FORWARD-LINKS, calculate a NODE-ORDERING and a FORWARD-LINKS list and return them.
     */
    @LispMethod(comment = "Given an EDGE-LIST, and optionally a starting NODE, a NODE-NUMBERING, an initial INDENT and a list of FORWARD-LINKS, calculate a NODE-ORDERING and a FORWARD-LINKS list and return them.")
    public static final SubLObject st_order_nodes_in_dag_alt(SubLObject edge_list, SubLObject node, SubLObject indent, SubLObject node_numbering, SubLObject forward_links) {
        if (node == UNPROVIDED) {
            node = NIL;
        }
        if (indent == UNPROVIDED) {
            indent = ZERO_INTEGER;
        }
        if (node_numbering == UNPROVIDED) {
            node_numbering = NIL;
        }
        if (forward_links == UNPROVIDED) {
            forward_links = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == node) {
                node = com.cyc.cycjava.cycl.similarity.edge_list_roots(edge_list).first();
            }
            if (NIL == node_numbering) {
                node_numbering = com.cyc.cycjava.cycl.similarity.st_number_edge_list_nodes(edge_list, node);
            }
            {
                SubLObject node_ordering = NIL;
                SubLObject children = com.cyc.cycjava.cycl.similarity.st_node_number_sort(com.cyc.cycjava.cycl.similarity.edge_list_node_children(edge_list, node), node_numbering);
                node_ordering = cons(list(node, indent), node_ordering);
                {
                    SubLObject cdolist_list_var = children;
                    SubLObject child = NIL;
                    for (child = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , child = cdolist_list_var.first()) {
                        if (!node.equal(child)) {
                            if (NIL != com.cyc.cycjava.cycl.similarity.st_has_other_parents(edge_list, node, child, forward_links)) {
                                forward_links = cons(list(node, child), forward_links);
                            } else {
                                thread.resetMultipleValues();
                                {
                                    SubLObject child_node_ordering = com.cyc.cycjava.cycl.similarity.st_order_nodes_in_dag(edge_list, child, add(ONE_INTEGER, indent), node_numbering, forward_links);
                                    SubLObject child_forward_links = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    forward_links = union(forward_links, child_forward_links, symbol_function(EQUAL), UNPROVIDED);
                                    node_ordering = append(node_ordering, child_node_ordering);
                                }
                            }
                        }
                    }
                }
                return values(node_ordering, forward_links);
            }
        }
    }

    @LispMethod(comment = "Given an EDGE-LIST, and optionally a starting NODE, a NODE-NUMBERING, an initial INDENT and a list of FORWARD-LINKS, calculate a NODE-ORDERING and a FORWARD-LINKS list and return them.")
    public static SubLObject st_order_nodes_in_dag(final SubLObject edge_list, SubLObject node, SubLObject indent, SubLObject node_numbering, SubLObject forward_links) {
        if (node == UNPROVIDED) {
            node = NIL;
        }
        if (indent == UNPROVIDED) {
            indent = ZERO_INTEGER;
        }
        if (node_numbering == UNPROVIDED) {
            node_numbering = NIL;
        }
        if (forward_links == UNPROVIDED) {
            forward_links = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == node) {
            node = edge_list_roots(edge_list).first();
        }
        if (NIL == node_numbering) {
            node_numbering = st_number_edge_list_nodes(edge_list, node);
        }
        SubLObject node_ordering = NIL;
        final SubLObject children = st_node_number_sort(edge_list_node_children(edge_list, node), node_numbering);
        node_ordering = cons(list(node, indent), node_ordering);
        SubLObject cdolist_list_var = children;
        SubLObject child = NIL;
        child = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (!node.equal(child)) {
                if (NIL != st_has_other_parents(edge_list, node, child, forward_links)) {
                    forward_links = cons(list(node, child), forward_links);
                } else {
                    thread.resetMultipleValues();
                    final SubLObject child_node_ordering = st_order_nodes_in_dag(edge_list, child, add(ONE_INTEGER, indent), node_numbering, forward_links);
                    final SubLObject child_forward_links = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    forward_links = union(forward_links, child_forward_links, symbol_function(EQUAL), UNPROVIDED);
                    node_ordering = append(node_ordering, child_node_ordering);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            child = cdolist_list_var.first();
        } 
        return values(node_ordering, forward_links);
    }/**
     * Given an EDGE-LIST, and optionally a starting NODE, a NODE-NUMBERING, an initial INDENT and a list of FORWARD-LINKS, calculate a NODE-ORDERING and a FORWARD-LINKS list and return them.
     */


    /**
     * Look up the constant NODE in NUMBERING-LIST and return the integer found.
     */
    @LispMethod(comment = "Look up the constant NODE in NUMBERING-LIST and return the integer found.")
    public static final SubLObject st_get_node_number_alt(SubLObject numbering_list, SubLObject node) {
        {
            SubLObject cdolist_list_var = numbering_list;
            SubLObject numbering = NIL;
            for (numbering = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , numbering = cdolist_list_var.first()) {
                {
                    SubLObject this_node = numbering.first();
                    SubLObject this_number = second(numbering);
                    if (this_node.equal(node)) {
                        return this_number;
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Look up the constant NODE in NUMBERING-LIST and return the integer found.")
    public static SubLObject st_get_node_number(final SubLObject numbering_list, final SubLObject node) {
        SubLObject cdolist_list_var = numbering_list;
        SubLObject numbering = NIL;
        numbering = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject this_node = numbering.first();
            final SubLObject this_number = second(numbering);
            if (this_node.equal(node)) {
                return this_number;
            }
            cdolist_list_var = cdolist_list_var.rest();
            numbering = cdolist_list_var.first();
        } 
        return NIL;
    }/**
     * Look up the constant NODE in NUMBERING-LIST and return the integer found.
     */


    /**
     * Associate nodes in EDGE-LIST with the number of edges beneath them.
     */
    @LispMethod(comment = "Associate nodes in EDGE-LIST with the number of edges beneath them.")
    public static final SubLObject st_number_edge_list_nodes_alt(SubLObject edge_list, SubLObject node) {
        if (node == UNPROVIDED) {
            node = NIL;
        }
        if (NIL == node) {
            node = com.cyc.cycjava.cycl.similarity.edge_list_roots(edge_list).first();
        }
        {
            SubLObject numbering_list = NIL;
            SubLObject node_number = ZERO_INTEGER;
            SubLObject children = com.cyc.cycjava.cycl.similarity.edge_list_node_children(edge_list, node);
            if (NIL != children) {
                {
                    SubLObject cdolist_list_var = children;
                    SubLObject child = NIL;
                    for (child = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , child = cdolist_list_var.first()) {
                        {
                            SubLObject child_number = com.cyc.cycjava.cycl.similarity.st_get_node_number(numbering_list, child);
                            if (NIL == child_number) {
                                {
                                    SubLObject numbering_list_new_and_child_number = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.similarity.st_number_edge_list_nodes(edge_list, child)));
                                    SubLObject numbering_list_new = numbering_list_new_and_child_number.first();
                                    numbering_list = union(numbering_list, numbering_list_new, symbol_function(EQUAL), UNPROVIDED);
                                    child_number = second(numbering_list_new_and_child_number);
                                }
                            }
                            node_number = add(node_number, add(ONE_INTEGER, child_number));
                        }
                    }
                }
            }
            numbering_list = cons(list(node, node_number), numbering_list);
            return values(numbering_list, node_number);
        }
    }

    @LispMethod(comment = "Associate nodes in EDGE-LIST with the number of edges beneath them.")
    public static SubLObject st_number_edge_list_nodes(final SubLObject edge_list, SubLObject node) {
        if (node == UNPROVIDED) {
            node = NIL;
        }
        if (NIL == node) {
            node = edge_list_roots(edge_list).first();
        }
        SubLObject numbering_list = NIL;
        SubLObject node_number = ZERO_INTEGER;
        final SubLObject children = edge_list_node_children(edge_list, node);
        if (NIL != children) {
            SubLObject cdolist_list_var = children;
            SubLObject child = NIL;
            child = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject child_number = st_get_node_number(numbering_list, child);
                if (NIL == child_number) {
                    final SubLObject numbering_list_new_and_child_number = arg2(resetMultipleValues(), multiple_value_list(st_number_edge_list_nodes(edge_list, child)));
                    final SubLObject numbering_list_new = numbering_list_new_and_child_number.first();
                    numbering_list = union(numbering_list, numbering_list_new, symbol_function(EQUAL), UNPROVIDED);
                    child_number = second(numbering_list_new_and_child_number);
                }
                node_number = add(node_number, add(ONE_INTEGER, child_number));
                cdolist_list_var = cdolist_list_var.rest();
                child = cdolist_list_var.first();
            } 
        }
        numbering_list = cons(list(node, node_number), numbering_list);
        return values(numbering_list, node_number);
    }/**
     * Associate nodes in EDGE-LIST with the number of edges beneath them.
     */


    /**
     * Look at CHILD in EDGE-LIST and determine if CHILD has other parents other than PARENT and any parents specified in FORWARD-LINKS.
     */
    @LispMethod(comment = "Look at CHILD in EDGE-LIST and determine if CHILD has other parents other than PARENT and any parents specified in FORWARD-LINKS.")
    public static final SubLObject st_has_other_parents_alt(SubLObject edge_list, SubLObject parent, SubLObject child, SubLObject forward_links) {
        if (forward_links == UNPROVIDED) {
            forward_links = NIL;
        }
        return set_difference(com.cyc.cycjava.cycl.similarity.edge_list_node_parents(edge_list, child), union(list(parent), com.cyc.cycjava.cycl.similarity.edge_list_node_parents(forward_links, child), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
    }

    @LispMethod(comment = "Look at CHILD in EDGE-LIST and determine if CHILD has other parents other than PARENT and any parents specified in FORWARD-LINKS.")
    public static SubLObject st_has_other_parents(final SubLObject edge_list, final SubLObject parent, final SubLObject child, SubLObject forward_links) {
        if (forward_links == UNPROVIDED) {
            forward_links = NIL;
        }
        return set_difference(edge_list_node_parents(edge_list, child), union(list(parent), edge_list_node_parents(forward_links, child), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
    }/**
     * Look at CHILD in EDGE-LIST and determine if CHILD has other parents other than PARENT and any parents specified in FORWARD-LINKS.
     */


    public static final SubLObject st_node_with_numberL_alt(SubLObject node1_with_number, SubLObject node2_with_number) {
        {
            SubLObject node1 = node1_with_number.first();
            SubLObject node2 = node2_with_number.first();
            SubLObject number1 = second(node1_with_number);
            SubLObject number2 = second(node2_with_number);
            if (number1.numE(number2)) {
                if (NIL != Strings.stringL(string_utilities.str(node1), string_utilities.str(node2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    return T;
                } else {
                    return NIL;
                }
            } else {
                if (number1.numL(number2)) {
                    return T;
                } else {
                    return NIL;
                }
            }
        }
    }

    public static SubLObject st_node_with_numberL(final SubLObject node1_with_number, final SubLObject node2_with_number) {
        final SubLObject node1 = node1_with_number.first();
        final SubLObject node2 = node2_with_number.first();
        final SubLObject number1 = second(node1_with_number);
        final SubLObject number2 = second(node2_with_number);
        if (number1.numE(number2)) {
            if (NIL != Strings.stringL(string_utilities.str(node1), string_utilities.str(node2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                return T;
            }
            return NIL;
        } else {
            if (number1.numL(number2)) {
                return T;
            }
            return NIL;
        }
    }

    /**
     * Sort the nodes in NODE-LIST based on thier numbers in NODE-NUMBERING.
     */
    @LispMethod(comment = "Sort the nodes in NODE-LIST based on thier numbers in NODE-NUMBERING.")
    public static final SubLObject st_node_number_sort_alt(SubLObject node_list, SubLObject node_numbering) {
        {
            SubLObject node_with_number_list = NIL;
            SubLObject sorted_node_list = NIL;
            {
                SubLObject cdolist_list_var = node_list;
                SubLObject node = NIL;
                for (node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , node = cdolist_list_var.first()) {
                    {
                        SubLObject node_number = com.cyc.cycjava.cycl.similarity.st_get_node_number(node_numbering, node);
                        node_with_number_list = cons(list(node, node_number), node_with_number_list);
                    }
                }
            }
            {
                SubLObject cdolist_list_var = Sort.sort(node_with_number_list, symbol_function($sym17$ST_NODE_WITH_NUMBER_), UNPROVIDED);
                SubLObject node_with_number = NIL;
                for (node_with_number = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , node_with_number = cdolist_list_var.first()) {
                    sorted_node_list = cons(node_with_number.first(), sorted_node_list);
                }
            }
            return nreverse(sorted_node_list);
        }
    }

    @LispMethod(comment = "Sort the nodes in NODE-LIST based on thier numbers in NODE-NUMBERING.")
    public static SubLObject st_node_number_sort(final SubLObject node_list, final SubLObject node_numbering) {
        SubLObject node_with_number_list = NIL;
        SubLObject sorted_node_list = NIL;
        SubLObject cdolist_list_var = node_list;
        SubLObject node = NIL;
        node = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject node_number = st_get_node_number(node_numbering, node);
            node_with_number_list = cons(list(node, node_number), node_with_number_list);
            cdolist_list_var = cdolist_list_var.rest();
            node = cdolist_list_var.first();
        } 
        cdolist_list_var = Sort.sort(node_with_number_list, symbol_function($sym17$ST_NODE_WITH_NUMBER_), UNPROVIDED);
        SubLObject node_with_number = NIL;
        node_with_number = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sorted_node_list = cons(node_with_number.first(), sorted_node_list);
            cdolist_list_var = cdolist_list_var.rest();
            node_with_number = cdolist_list_var.first();
        } 
        return nreverse(sorted_node_list);
    }/**
     * Sort the nodes in NODE-LIST based on thier numbers in NODE-NUMBERING.
     */


    /**
     * Returns a list of all nodes in EDGE-LIST.
     */
    @LispMethod(comment = "Returns a list of all nodes in EDGE-LIST.")
    public static final SubLObject edge_list_nodes_alt(SubLObject edge_list) {
        {
            SubLObject nodelist = NIL;
            SubLObject cdolist_list_var = edge_list;
            SubLObject edge = NIL;
            for (edge = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , edge = cdolist_list_var.first()) {
                {
                    SubLObject node1 = edge.first();
                    SubLObject node2 = second(edge);
                    {
                        SubLObject item_var = node2;
                        if (NIL == member(item_var, nodelist, symbol_function(EQL), symbol_function(IDENTITY))) {
                            nodelist = cons(item_var, nodelist);
                        }
                    }
                    {
                        SubLObject item_var = node1;
                        if (NIL == member(item_var, nodelist, symbol_function(EQL), symbol_function(IDENTITY))) {
                            nodelist = cons(item_var, nodelist);
                        }
                    }
                }
            }
            return nreverse(nodelist);
        }
    }

    @LispMethod(comment = "Returns a list of all nodes in EDGE-LIST.")
    public static SubLObject edge_list_nodes(final SubLObject edge_list) {
        SubLObject nodelist = NIL;
        SubLObject cdolist_list_var = edge_list;
        SubLObject edge = NIL;
        edge = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject node1 = edge.first();
            SubLObject item_var;
            final SubLObject node2 = item_var = second(edge);
            if (NIL == member(item_var, nodelist, symbol_function(EQL), symbol_function(IDENTITY))) {
                nodelist = cons(item_var, nodelist);
            }
            item_var = node1;
            if (NIL == member(item_var, nodelist, symbol_function(EQL), symbol_function(IDENTITY))) {
                nodelist = cons(item_var, nodelist);
            }
            cdolist_list_var = cdolist_list_var.rest();
            edge = cdolist_list_var.first();
        } 
        return nreverse(nodelist);
    }/**
     * Returns a list of all nodes in EDGE-LIST.
     */


    /**
     * Returns the root of EDGE-LIST, where roots means the nodes that have no parents.
     */
    @LispMethod(comment = "Returns the root of EDGE-LIST, where roots means the nodes that have no parents.")
    public static final SubLObject edge_list_roots_alt(SubLObject edge_list) {
        {
            SubLObject roots = NIL;
            SubLObject notroots = NIL;
            SubLObject cdolist_list_var = edge_list;
            SubLObject edge = NIL;
            for (edge = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , edge = cdolist_list_var.first()) {
                {
                    SubLObject parent = edge.first();
                    SubLObject child = second(edge);
                    roots = cons(parent, roots);
                    if (!parent.equal(child)) {
                        notroots = cons(child, notroots);
                    }
                }
            }
            return remove_duplicates(set_difference(roots, notroots, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    @LispMethod(comment = "Returns the root of EDGE-LIST, where roots means the nodes that have no parents.")
    public static SubLObject edge_list_roots(final SubLObject edge_list) {
        SubLObject roots = NIL;
        SubLObject notroots = NIL;
        SubLObject cdolist_list_var = edge_list;
        SubLObject edge = NIL;
        edge = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject parent = edge.first();
            final SubLObject child = second(edge);
            roots = cons(parent, roots);
            if (!parent.equal(child)) {
                notroots = cons(child, notroots);
            }
            cdolist_list_var = cdolist_list_var.rest();
            edge = cdolist_list_var.first();
        } 
        return remove_duplicates(set_difference(roots, notroots, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }/**
     * Returns the root of EDGE-LIST, where roots means the nodes that have no parents.
     */


    /**
     * Returns the leaves of EDGE-LIST, where leaves means the nodes that have no children.
     */
    @LispMethod(comment = "Returns the leaves of EDGE-LIST, where leaves means the nodes that have no children.")
    public static final SubLObject edge_list_leaves_alt(SubLObject edge_list) {
        {
            SubLObject leaves = NIL;
            SubLObject notleaves = NIL;
            SubLObject cdolist_list_var = edge_list;
            SubLObject edge = NIL;
            for (edge = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , edge = cdolist_list_var.first()) {
                {
                    SubLObject parent = edge.first();
                    SubLObject child = second(edge);
                    leaves = cons(child, leaves);
                    if (!parent.equal(child)) {
                        notleaves = cons(parent, notleaves);
                    }
                }
            }
            return remove_duplicates(set_difference(leaves, notleaves, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    @LispMethod(comment = "Returns the leaves of EDGE-LIST, where leaves means the nodes that have no children.")
    public static SubLObject edge_list_leaves(final SubLObject edge_list) {
        SubLObject leaves = NIL;
        SubLObject notleaves = NIL;
        SubLObject cdolist_list_var = edge_list;
        SubLObject edge = NIL;
        edge = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject parent = edge.first();
            final SubLObject child = second(edge);
            leaves = cons(child, leaves);
            if (!parent.equal(child)) {
                notleaves = cons(parent, notleaves);
            }
            cdolist_list_var = cdolist_list_var.rest();
            edge = cdolist_list_var.first();
        } 
        return remove_duplicates(set_difference(leaves, notleaves, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }/**
     * Returns the leaves of EDGE-LIST, where leaves means the nodes that have no children.
     */


    /**
     * Returns the children of NODE in EDGE-LIST.
     */
    @LispMethod(comment = "Returns the children of NODE in EDGE-LIST.")
    public static final SubLObject edge_list_node_children_alt(SubLObject edge_list, SubLObject node) {
        {
            SubLObject children = NIL;
            SubLObject cdolist_list_var = edge_list;
            SubLObject edge = NIL;
            for (edge = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , edge = cdolist_list_var.first()) {
                {
                    SubLObject parent = edge.first();
                    SubLObject child = second(edge);
                    if (node.equal(parent)) {
                        if (!child.equal(parent)) {
                            children = cons(child, children);
                        }
                    }
                }
            }
            return children;
        }
    }

    @LispMethod(comment = "Returns the children of NODE in EDGE-LIST.")
    public static SubLObject edge_list_node_children(final SubLObject edge_list, final SubLObject node) {
        SubLObject children = NIL;
        SubLObject cdolist_list_var = edge_list;
        SubLObject edge = NIL;
        edge = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject parent = edge.first();
            final SubLObject child = second(edge);
            if (node.equal(parent) && (!child.equal(parent))) {
                children = cons(child, children);
            }
            cdolist_list_var = cdolist_list_var.rest();
            edge = cdolist_list_var.first();
        } 
        return children;
    }/**
     * Returns the children of NODE in EDGE-LIST.
     */


    /**
     * Returns the parents of NODE in EDGE-LIST.
     */
    @LispMethod(comment = "Returns the parents of NODE in EDGE-LIST.")
    public static final SubLObject edge_list_node_parents_alt(SubLObject edge_list, SubLObject node) {
        {
            SubLObject parents = NIL;
            SubLObject cdolist_list_var = edge_list;
            SubLObject edge = NIL;
            for (edge = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , edge = cdolist_list_var.first()) {
                {
                    SubLObject parent = edge.first();
                    SubLObject child = second(edge);
                    if (node.equal(child)) {
                        if (!child.equal(parent)) {
                            parents = cons(parent, parents);
                        }
                    }
                }
            }
            return parents;
        }
    }

    @LispMethod(comment = "Returns the parents of NODE in EDGE-LIST.")
    public static SubLObject edge_list_node_parents(final SubLObject edge_list, final SubLObject node) {
        SubLObject parents = NIL;
        SubLObject cdolist_list_var = edge_list;
        SubLObject edge = NIL;
        edge = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject parent = edge.first();
            final SubLObject child = second(edge);
            if (node.equal(child) && (!child.equal(parent))) {
                parents = cons(parent, parents);
            }
            cdolist_list_var = cdolist_list_var.rest();
            edge = cdolist_list_var.first();
        } 
        return parents;
    }/**
     * Returns the parents of NODE in EDGE-LIST.
     */


    /**
     * Returns a edge-list containing all the edges of EDGE-LIST but the self-edges.
     */
    @LispMethod(comment = "Returns a edge-list containing all the edges of EDGE-LIST but the self-edges.")
    public static final SubLObject remove_self_edges_alt(SubLObject edge_list) {
        {
            SubLObject out = NIL;
            SubLObject cdolist_list_var = edge_list;
            SubLObject edge = NIL;
            for (edge = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , edge = cdolist_list_var.first()) {
                {
                    SubLObject parent = edge.first();
                    SubLObject child = second(edge);
                    if (!parent.equal(child)) {
                        out = cons(edge, out);
                    }
                }
            }
            return nreverse(out);
        }
    }

    @LispMethod(comment = "Returns a edge-list containing all the edges of EDGE-LIST but the self-edges.")
    public static SubLObject remove_self_edges(final SubLObject edge_list) {
        SubLObject out = NIL;
        SubLObject cdolist_list_var = edge_list;
        SubLObject edge = NIL;
        edge = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject parent = edge.first();
            final SubLObject child = second(edge);
            if (!parent.equal(child)) {
                out = cons(edge, out);
            }
            cdolist_list_var = cdolist_list_var.rest();
            edge = cdolist_list_var.first();
        } 
        return nreverse(out);
    }/**
     * Returns a edge-list containing all the edges of EDGE-LIST but the self-edges.
     */


    /**
     * Removes all redundant edges from EDGE-LIST, when redundant edge (a, b) is redundant iff there are also edges (a, ?X) and (?X, b).
     */
    @LispMethod(comment = "Removes all redundant edges from EDGE-LIST, when redundant edge (a, b) is redundant iff there are also edges (a, ?X) and (?X, b).")
    public static final SubLObject edge_list_remove_redundant_alt(SubLObject edge_list) {
        {
            SubLObject removethese = NIL;
            SubLObject cdolist_list_var = edge_list;
            SubLObject edge1 = NIL;
            for (edge1 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , edge1 = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_9 = edge_list;
                    SubLObject edge2 = NIL;
                    for (edge2 = cdolist_list_var_9.first(); NIL != cdolist_list_var_9; cdolist_list_var_9 = cdolist_list_var_9.rest() , edge2 = cdolist_list_var_9.first()) {
                        {
                            SubLObject edge1_parent = edge1.first();
                            SubLObject edge1_child = second(edge1);
                            SubLObject edge2_parent = edge2.first();
                            SubLObject edge2_child = second(edge2);
                            if ((!edge1_parent.equal(edge1_child)) && (!edge2_parent.equal(edge2_child))) {
                                if (edge2_parent.equal(edge1_child)) {
                                    if (!edge1_parent.equal(edge2_child)) {
                                        removethese = cons(list(edge1_parent, edge2_child), removethese);
                                    }
                                }
                                if (edge1_parent.equal(edge2_child)) {
                                    if (!edge2_parent.equal(edge1_child)) {
                                        removethese = cons(list(edge2_parent, edge1_child), removethese);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return nreverse(remove_duplicates(set_difference(edge_list, removethese, symbol_function(EQUAL), UNPROVIDED), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED));
        }
    }

    @LispMethod(comment = "Removes all redundant edges from EDGE-LIST, when redundant edge (a, b) is redundant iff there are also edges (a, ?X) and (?X, b).")
    public static SubLObject edge_list_remove_redundant(final SubLObject edge_list) {
        SubLObject removethese = NIL;
        SubLObject cdolist_list_var = edge_list;
        SubLObject edge1 = NIL;
        edge1 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$9 = edge_list;
            SubLObject edge2 = NIL;
            edge2 = cdolist_list_var_$9.first();
            while (NIL != cdolist_list_var_$9) {
                final SubLObject edge1_parent = edge1.first();
                final SubLObject edge1_child = second(edge1);
                final SubLObject edge2_parent = edge2.first();
                final SubLObject edge2_child = second(edge2);
                if ((!edge1_parent.equal(edge1_child)) && (!edge2_parent.equal(edge2_child))) {
                    if (edge2_parent.equal(edge1_child) && (!edge1_parent.equal(edge2_child))) {
                        removethese = cons(list(edge1_parent, edge2_child), removethese);
                    }
                    if (edge1_parent.equal(edge2_child) && (!edge2_parent.equal(edge1_child))) {
                        removethese = cons(list(edge2_parent, edge1_child), removethese);
                    }
                }
                cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                edge2 = cdolist_list_var_$9.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            edge1 = cdolist_list_var.first();
        } 
        return nreverse(remove_duplicates(set_difference(edge_list, removethese, symbol_function(EQUAL), UNPROVIDED), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }/**
     * Removes all redundant edges from EDGE-LIST, when redundant edge (a, b) is redundant iff there are also edges (a, ?X) and (?X, b).
     */


    public static SubLObject declare_similarity_file() {
        declareFunction("sim_add_relation", "SIM-ADD-RELATION", 2, 0, false);
        declareFunction("sim_get_relations", "SIM-GET-RELATIONS", 1, 0, false);
        declareFunction("sim_check_relation", "SIM-CHECK-RELATION", 2, 0, false);
        declareFunction("make_similarity_tree", "MAKE-SIMILARITY-TREE", 3, 0, false);
        declareFunction("make_relation_tree", "MAKE-RELATION-TREE", 1, 2, false);
        declareFunction("pred_term_gafs", "PRED-TERM-GAFS", 3, 2, false);
        declareFunction("find_relevant_mts", "FIND-RELEVANT-MTS", 2, 0, false);
        declareFunction("st_find_basis_cols", "ST-FIND-BASIS-COLS", 3, 0, false);
        declareFunction("st_check_implied", "ST-CHECK-IMPLIED", 4, 0, false);
        declareFunction("st_order_nodes_in_dag", "ST-ORDER-NODES-IN-DAG", 1, 4, false);
        declareFunction("st_get_node_number", "ST-GET-NODE-NUMBER", 2, 0, false);
        declareFunction("st_number_edge_list_nodes", "ST-NUMBER-EDGE-LIST-NODES", 1, 1, false);
        declareFunction("st_has_other_parents", "ST-HAS-OTHER-PARENTS", 3, 1, false);
        declareFunction("st_node_with_numberL", "ST-NODE-WITH-NUMBER<", 2, 0, false);
        declareFunction("st_node_number_sort", "ST-NODE-NUMBER-SORT", 2, 0, false);
        declareFunction("edge_list_nodes", "EDGE-LIST-NODES", 1, 0, false);
        declareFunction("edge_list_roots", "EDGE-LIST-ROOTS", 1, 0, false);
        declareFunction("edge_list_leaves", "EDGE-LIST-LEAVES", 1, 0, false);
        declareFunction("edge_list_node_children", "EDGE-LIST-NODE-CHILDREN", 2, 0, false);
        declareFunction("edge_list_node_parents", "EDGE-LIST-NODE-PARENTS", 2, 0, false);
        declareFunction("remove_self_edges", "REMOVE-SELF-EDGES", 1, 0, false);
        declareFunction("edge_list_remove_redundant", "EDGE-LIST-REMOVE-REDUNDANT", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_similarity_file() {
        defparameter("*SIMILARITY-RELATION-HASH*", make_hash_table($int$512, symbol_function(EQUAL), UNPROVIDED));
        return NIL;
    }

    public static SubLObject setup_similarity_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_similarity_file();
    }

    @Override
    public void initializeVariables() {
        init_similarity_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_similarity_file();
    }

    static {
    }

    static private final SubLList $list_alt12 = list(ONE_INTEGER);
}

/**
 * Total time: 248 ms
 */
