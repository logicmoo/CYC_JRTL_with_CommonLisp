/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.el_utilities.elify;
import static com.cyc.cycjava.cycl.el_utilities.hlify;
import static com.cyc.cycjava.cycl.utilities_macros.register_kb_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nthcdr;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.inference.modules.after_adding_modules;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      NEGATION-MT
 * source file: /cyc/top/cycl/negation-mt.lisp
 * created:     2019/07/03 17:37:28
 */
public final class negation_mt extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new negation_mt();



    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $no_of_ext_incompatiable_mt_assertions_to_be_unasserted$ = makeSymbol("*NO-OF-EXT-INCOMPATIABLE-MT-ASSERTIONS-TO-BE-UNASSERTED*");





    private static final SubLSymbol INCOMPATIBLE_MT_AFTER_ADDING = makeSymbol("INCOMPATIBLE-MT-AFTER-ADDING");

    private static final SubLSymbol INCOMPATIBLE_MT_AFTER_REMOVING = makeSymbol("INCOMPATIBLE-MT-AFTER-REMOVING");

    private static final SubLSymbol PROPAGATE_TO_INCOMPATIBLE_MT = makeSymbol("PROPAGATE-TO-INCOMPATIBLE-MT");



    private static final SubLSymbol INTENSIONALLY_INCOMPATIBLE_MT_AFTER_ADDING = makeSymbol("INTENSIONALLY-INCOMPATIBLE-MT-AFTER-ADDING");

    private static final SubLSymbol INTENSIONALLY_INCOMPATIBLE_MT_AFTER_REMOVING = makeSymbol("INTENSIONALLY-INCOMPATIBLE-MT-AFTER-REMOVING");

    private static final SubLSymbol UPDATE_EXTENSIONALLY_INCOMPATIBLE_MT_ASSERTIONS = makeSymbol("UPDATE-EXTENSIONALLY-INCOMPATIBLE-MT-ASSERTIONS");



    private static final SubLList $list11 = list(makeSymbol("GAF"), makeSymbol("TRUTH"));



    private static final SubLSymbol $sym13$_EXIT = makeSymbol("%EXIT");

    private static final SubLString $str14$The_function_update_extensionally = makeString("The function update-extensionally-incompatible-mt-assertions-int was terminated prematurely.");

    // Definitions
    /**
     * the microtheories delcared to be disjoint with <mt>
     */
    @LispMethod(comment = "the microtheories delcared to be disjoint with <mt>")
    public static final SubLObject local_negation_mts_alt(SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_link_methods.sbhl_forward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$negationMt), mt, mt_mt, tv, UNPROVIDED);
    }

    // Definitions
    /**
     * the microtheories delcared to be disjoint with <mt>
     */
    @LispMethod(comment = "the microtheories delcared to be disjoint with <mt>")
    public static SubLObject local_negation_mts(final SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_link_methods.sbhl_forward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$negationMt), mt, mt_mt, tv, UNPROVIDED);
    }

    /**
     * the most-general among the microtheories delcared to be disjoint with <mt>
     */
    @LispMethod(comment = "the most-general among the microtheories delcared to be disjoint with <mt>")
    public static final SubLObject local_max_negation_mts_alt(SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_max_forward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$negationMt), mt, mt_mt, tv);
    }

    /**
     * the most-general among the microtheories delcared to be disjoint with <mt>
     */
    @LispMethod(comment = "the most-general among the microtheories delcared to be disjoint with <mt>")
    public static SubLObject local_max_negation_mts(final SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_max_forward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$negationMt), mt, mt_mt, tv);
    }

    /**
     * the microtheories delcared to not be disjoint with <mt>
     */
    @LispMethod(comment = "the microtheories delcared to not be disjoint with <mt>")
    public static final SubLObject local_not_negation_mts_alt(SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_link_methods.sbhl_forward_false_link_nodes(sbhl_module_vars.get_sbhl_module($$negationMt), mt, mt_mt, tv, UNPROVIDED);
    }

    /**
     * the microtheories delcared to not be disjoint with <mt>
     */
    @LispMethod(comment = "the microtheories delcared to not be disjoint with <mt>")
    public static SubLObject local_not_negation_mts(final SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_link_methods.sbhl_forward_false_link_nodes(sbhl_module_vars.get_sbhl_module($$negationMt), mt, mt_mt, tv, UNPROVIDED);
    }

    /**
     * the least general among the microtheories delcared to not be disjoint with <mt>
     */
    @LispMethod(comment = "the least general among the microtheories delcared to not be disjoint with <mt>")
    public static final SubLObject local_min_not_negation_mts_alt(SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_min_forward_false_link_nodes(sbhl_module_vars.get_sbhl_module($$negationMt), mt, mt_mt, tv);
    }

    /**
     * the least general among the microtheories delcared to not be disjoint with <mt>
     */
    @LispMethod(comment = "the least general among the microtheories delcared to not be disjoint with <mt>")
    public static SubLObject local_min_not_negation_mts(final SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_min_forward_false_link_nodes(sbhl_module_vars.get_sbhl_module($$negationMt), mt, mt_mt, tv);
    }

    /**
     * all negation microtheories of <mt>
     */
    @LispMethod(comment = "all negation microtheories of <mt>")
    public static final SubLObject all_negation_mts_alt(SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_implied_relations.sbhl_all_implied_disjoins(sbhl_module_vars.get_sbhl_module($$negationMt), mt, mt_mt, tv);
    }

    /**
     * all negation microtheories of <mt>
     */
    @LispMethod(comment = "all negation microtheories of <mt>")
    public static SubLObject all_negation_mts(final SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_implied_relations.sbhl_all_implied_disjoins(sbhl_module_vars.get_sbhl_module($$negationMt), mt, mt_mt, tv);
    }

    /**
     * all negated negation microtheories of <mt>
     */
    @LispMethod(comment = "all negated negation microtheories of <mt>")
    public static final SubLObject all_not_negation_mts_alt(SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_all_forward_false_nodes(sbhl_module_vars.get_sbhl_module($$negationMt), mt, mt_mt, tv);
    }

    /**
     * all negated negation microtheories of <mt>
     */
    @LispMethod(comment = "all negated negation microtheories of <mt>")
    public static SubLObject all_not_negation_mts(final SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_all_forward_false_nodes(sbhl_module_vars.get_sbhl_module($$negationMt), mt, mt_mt, tv);
    }

    /**
     * most-general negation microtheories of <mt>
     */
    @LispMethod(comment = "most-general negation microtheories of <mt>")
    public static final SubLObject max_negation_mts_alt(SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_implied_relations.sbhl_implied_max_disjoins(sbhl_module_vars.get_sbhl_module($$negationMt), mt, mt_mt, tv);
    }

    /**
     * most-general negation microtheories of <mt>
     */
    @LispMethod(comment = "most-general negation microtheories of <mt>")
    public static SubLObject max_negation_mts(final SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_implied_relations.sbhl_implied_max_disjoins(sbhl_module_vars.get_sbhl_module($$negationMt), mt, mt_mt, tv);
    }

    public static final SubLObject negation_mts_alt(SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return com.cyc.cycjava.cycl.negation_mt.max_negation_mts(mt, mt_mt, tv);
    }

    public static SubLObject negation_mts(final SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return max_negation_mts(mt, mt_mt, tv);
    }

    /**
     * most subordinate of all spec-microtheories not disjoint with <mt>
     */
    @LispMethod(comment = "most subordinate of all spec-microtheories not disjoint with <mt>")
    public static final SubLObject min_all_not_negation_mts_alt(SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_implied_min_false_disjoins(sbhl_module_vars.get_sbhl_module($$negationMt), mt, mt_mt, tv);
    }

    /**
     * most subordinate of all spec-microtheories not disjoint with <mt>
     */
    @LispMethod(comment = "most subordinate of all spec-microtheories not disjoint with <mt>")
    public static SubLObject min_all_not_negation_mts(final SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_implied_min_false_disjoins(sbhl_module_vars.get_sbhl_module($$negationMt), mt, mt_mt, tv);
    }

    /**
     * most subordinate of the microtheories of <mt>
     */
    @LispMethod(comment = "most subordinate of the microtheories of <mt>")
    public static final SubLObject min_implied_not_negation_mts_alt(SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_leaf_nodes(sbhl_module_utilities.get_sbhl_reductions_module(sbhl_module_vars.get_sbhl_module($$negationMt)), mt, mt_mt, tv);
    }

    /**
     * most subordinate of the microtheories of <mt>
     */
    @LispMethod(comment = "most subordinate of the microtheories of <mt>")
    public static SubLObject min_implied_not_negation_mts(final SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_leaf_nodes(sbhl_module_utilities.get_sbhl_reductions_module(sbhl_module_vars.get_sbhl_module($$negationMt)), mt, mt_mt, tv);
    }

    /**
     * most subordinate of the asserted not-negation-mts of the spec-microtheories of <mt>
     */
    @LispMethod(comment = "most subordinate of the asserted not-negation-mts of the spec-microtheories of <mt>")
    public static final SubLObject min_all_asserted_not_negation_mts_alt(SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_min_asserted_false_disjoins(sbhl_module_vars.get_sbhl_module($$negationMt), mt, mt_mt, tv);
    }

    /**
     * most subordinate of the asserted not-negation-mts of the spec-microtheories of <mt>
     */
    @LispMethod(comment = "most subordinate of the asserted not-negation-mts of the spec-microtheories of <mt>")
    public static SubLObject min_all_asserted_not_negation_mts(final SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_min_asserted_false_disjoins(sbhl_module_vars.get_sbhl_module($$negationMt), mt, mt_mt, tv);
    }

    /**
     * returns a pair of disjoint elements of <mts> (if any exist)
     */
    @LispMethod(comment = "returns a pair of disjoint elements of <mts> (if any exist)")
    public static final SubLObject any_disjoint_mt_pair_alt(SubLObject mts, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        {
            SubLObject disjoint = NIL;
            SubLObject n = ZERO_INTEGER;
            if (NIL == disjoint) {
                {
                    SubLObject csome_list_var = mts;
                    SubLObject mt1 = NIL;
                    for (mt1 = csome_list_var.first(); !((NIL != disjoint) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , mt1 = csome_list_var.first()) {
                        n = add(n, ONE_INTEGER);
                        if (NIL == disjoint) {
                            {
                                SubLObject csome_list_var_1 = nthcdr(n, mts);
                                SubLObject mt2 = NIL;
                                for (mt2 = csome_list_var_1.first(); !((NIL != disjoint) || (NIL == csome_list_var_1)); csome_list_var_1 = csome_list_var_1.rest() , mt2 = csome_list_var_1.first()) {
                                    if (NIL != com.cyc.cycjava.cycl.negation_mt.negation_mtP(mt1, mt2, mt_mt, UNPROVIDED)) {
                                        disjoint = list(mt1, mt2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return disjoint;
        }
    }

    /**
     * returns a pair of disjoint elements of <mts> (if any exist)
     */
    @LispMethod(comment = "returns a pair of disjoint elements of <mts> (if any exist)")
    public static SubLObject any_disjoint_mt_pair(final SubLObject mts, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        SubLObject disjoint = NIL;
        SubLObject n = ZERO_INTEGER;
        if (NIL == disjoint) {
            SubLObject csome_list_var = mts;
            SubLObject mt1 = NIL;
            mt1 = csome_list_var.first();
            while ((NIL == disjoint) && (NIL != csome_list_var)) {
                n = add(n, ONE_INTEGER);
                if (NIL == disjoint) {
                    SubLObject csome_list_var_$1 = nthcdr(n, mts);
                    SubLObject mt2 = NIL;
                    mt2 = csome_list_var_$1.first();
                    while ((NIL == disjoint) && (NIL != csome_list_var_$1)) {
                        if (NIL != negation_mtP(mt1, mt2, mt_mt, UNPROVIDED)) {
                            disjoint = list(mt1, mt2);
                        }
                        csome_list_var_$1 = csome_list_var_$1.rest();
                        mt2 = csome_list_var_$1.first();
                    } 
                }
                csome_list_var = csome_list_var.rest();
                mt1 = csome_list_var.first();
            } 
        }
        return disjoint;
    }

    /**
     * are microtheories <mt1> and <mt2> disjoint?
     */
    @LispMethod(comment = "are microtheories <mt1> and <mt2> disjoint?")
    public static final SubLObject negation_mtP_alt(SubLObject mt1, SubLObject mt2, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_implied_relations.sbhl_implied_disjoins_relation_p(sbhl_module_vars.get_sbhl_module($$negationMt), mt1, mt2, mt_mt, tv);
    }

    /**
     * are microtheories <mt1> and <mt2> disjoint?
     */
    @LispMethod(comment = "are microtheories <mt1> and <mt2> disjoint?")
    public static SubLObject negation_mtP(final SubLObject mt1, final SubLObject mt2, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_implied_relations.sbhl_implied_disjoins_relation_p(sbhl_module_vars.get_sbhl_module($$negationMt), mt1, mt2, mt_mt, tv);
    }

    /**
     * is any mt1 in <mt1s> disjoint with mt2?
     */
    @LispMethod(comment = "is any mt1 in <mt1s> disjoint with mt2?")
    public static final SubLObject any_negation_mtP_alt(SubLObject mt1s, SubLObject mt2, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_implied_relations.sbhl_any_with_implied_disjoins_relation_p(sbhl_module_vars.get_sbhl_module($$negationMt), mt1s, mt2, mt_mt, tv);
    }

    @LispMethod(comment = "is any mt1 in <mt1s> disjoint with mt2?")
    public static SubLObject any_negation_mtP(final SubLObject mt1s, final SubLObject mt2, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_implied_relations.sbhl_any_with_implied_disjoins_relation_p(sbhl_module_vars.get_sbhl_module($$negationMt), mt1s, mt2, mt_mt, tv);
    }

    /**
     * is any mt1 in <mt1s> disjoint with any mt2 in <mt2s>?
     */
    @LispMethod(comment = "is any mt1 in <mt1s> disjoint with any mt2 in <mt2s>?")
    public static final SubLObject any_negation_mt_anyP_alt(SubLObject mt1s, SubLObject mt2s, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_implied_relations.sbhl_implied_disjoins_relation_between_any_p(sbhl_module_vars.get_sbhl_module($$negationMt), mt1s, mt2s, mt_mt, tv);
    }

    @LispMethod(comment = "is any mt1 in <mt1s> disjoint with any mt2 in <mt2s>?")
    public static SubLObject any_negation_mt_anyP(final SubLObject mt1s, final SubLObject mt2s, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_implied_relations.sbhl_implied_disjoins_relation_between_any_p(sbhl_module_vars.get_sbhl_module($$negationMt), mt1s, mt2s, mt_mt, tv);
    }

    /**
     * are microtheories <mt1> and <mt2> not disjoint?
     */
    @LispMethod(comment = "are microtheories <mt1> and <mt2> not disjoint?")
    public static final SubLObject not_negation_mtP_alt(SubLObject mt1, SubLObject mt2, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_false_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$negationMt), mt1, mt2, mt_mt, tv);
    }

    @LispMethod(comment = "are microtheories <mt1> and <mt2> not disjoint?")
    public static SubLObject not_negation_mtP(final SubLObject mt1, final SubLObject mt2, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_false_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$negationMt), mt1, mt2, mt_mt, tv);
    }

    /**
     * are microtheories <mt1> and <mt2> disjoint?
     * (uses only sbhl graphs: their extensions are not searched
     * nor are their necessary conditions analyzed)
     */
    @LispMethod(comment = "are microtheories <mt1> and <mt2> disjoint?\r\n(uses only sbhl graphs: their extensions are not searched\r\nnor are their necessary conditions analyzed)\nare microtheories <mt1> and <mt2> disjoint?\n(uses only sbhl graphs: their extensions are not searched\nnor are their necessary conditions analyzed)")
    public static final SubLObject mts_disjointP_alt(SubLObject mt1, SubLObject mt2, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        return com.cyc.cycjava.cycl.negation_mt.negation_mtP(mt1, mt2, mt_mt, UNPROVIDED);
    }

    @LispMethod(comment = "are microtheories <mt1> and <mt2> disjoint?\r\n(uses only sbhl graphs: their extensions are not searched\r\nnor are their necessary conditions analyzed)\nare microtheories <mt1> and <mt2> disjoint?\n(uses only sbhl graphs: their extensions are not searched\nnor are their necessary conditions analyzed)")
    public static SubLObject mts_disjointP(final SubLObject mt1, final SubLObject mt2, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        return negation_mtP(mt1, mt2, mt_mt, UNPROVIDED);
    }

    public static final SubLObject disjoint_mtsP_alt(SubLObject mt1, SubLObject mt2, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        return com.cyc.cycjava.cycl.negation_mt.negation_mtP(mt1, mt2, mt_mt, UNPROVIDED);
    }

    public static SubLObject disjoint_mtsP(final SubLObject mt1, final SubLObject mt2, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        return negation_mtP(mt1, mt2, mt_mt, UNPROVIDED);
    }

    /**
     * is the intersection of microtheories <mts> empty?
     */
    @LispMethod(comment = "is the intersection of microtheories <mts> empty?")
    public static final SubLObject any_disjoint_mtsP_alt(SubLObject mts, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        {
            SubLObject disjointP = NIL;
            SubLObject n = ZERO_INTEGER;
            if (NIL == disjointP) {
                {
                    SubLObject csome_list_var = mts;
                    SubLObject mt1 = NIL;
                    for (mt1 = csome_list_var.first(); !((NIL != disjointP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , mt1 = csome_list_var.first()) {
                        n = add(n, ONE_INTEGER);
                        if (NIL == disjointP) {
                            {
                                SubLObject csome_list_var_2 = nthcdr(n, mts);
                                SubLObject mt2 = NIL;
                                for (mt2 = csome_list_var_2.first(); !((NIL != disjointP) || (NIL == csome_list_var_2)); csome_list_var_2 = csome_list_var_2.rest() , mt2 = csome_list_var_2.first()) {
                                    if (NIL != com.cyc.cycjava.cycl.negation_mt.negation_mtP(mt1, mt2, mt_mt, UNPROVIDED)) {
                                        disjointP = T;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return disjointP;
        }
    }

    @LispMethod(comment = "is the intersection of microtheories <mts> empty?")
    public static SubLObject any_disjoint_mtsP(final SubLObject mts, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        SubLObject disjointP = NIL;
        SubLObject n = ZERO_INTEGER;
        if (NIL == disjointP) {
            SubLObject csome_list_var = mts;
            SubLObject mt1 = NIL;
            mt1 = csome_list_var.first();
            while ((NIL == disjointP) && (NIL != csome_list_var)) {
                n = add(n, ONE_INTEGER);
                if (NIL == disjointP) {
                    SubLObject csome_list_var_$2 = nthcdr(n, mts);
                    SubLObject mt2 = NIL;
                    mt2 = csome_list_var_$2.first();
                    while ((NIL == disjointP) && (NIL != csome_list_var_$2)) {
                        if (NIL != negation_mtP(mt1, mt2, mt_mt, UNPROVIDED)) {
                            disjointP = T;
                        }
                        csome_list_var_$2 = csome_list_var_$2.rest();
                        mt2 = csome_list_var_$2.first();
                    } 
                }
                csome_list_var = csome_list_var.rest();
                mt1 = csome_list_var.first();
            } 
        }
        return disjointP;
    }

    /**
     * If mt1 and mt2 are the same, returns T if there is a _known_
     * (i.e. not assumed) reason for believing they are not negation-mt.
     * If they are not the same, then it considers assumed reasons
     * as well, and returns T if there is some reason for believing
     * they are not negation-mt with all reasons considered.
     */
    @LispMethod(comment = "If mt1 and mt2 are the same, returns T if there is a _known_\r\n(i.e. not assumed) reason for believing they are not negation-mt.\r\nIf they are not the same, then it considers assumed reasons\r\nas well, and returns T if there is some reason for believing\r\nthey are not negation-mt with all reasons considered.\nIf mt1 and mt2 are the same, returns T if there is a _known_\n(i.e. not assumed) reason for believing they are not negation-mt.\nIf they are not the same, then it considers assumed reasons\nas well, and returns T if there is some reason for believing\nthey are not negation-mt with all reasons considered.")
    public static final SubLObject basis_for_not_negation_mtP_alt(SubLObject mt1, SubLObject mt2, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject known_not_negation_mtP = NIL;
                if (mt1 == mt2) {
                    {
                        SubLObject _prev_bind_0 = sbhl_module_vars.$assume_sbhl_extensions_nonempty$.currentBinding(thread);
                        try {
                            sbhl_module_vars.$assume_sbhl_extensions_nonempty$.bind(NIL, thread);
                            known_not_negation_mtP = com.cyc.cycjava.cycl.negation_mt.not_negation_mtP(mt1, mt2, mt_mt, UNPROVIDED);
                        } finally {
                            sbhl_module_vars.$assume_sbhl_extensions_nonempty$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return makeBoolean(((mt1 == mt2) && (NIL != known_not_negation_mtP)) || ((mt1 != mt2) && (NIL != com.cyc.cycjava.cycl.negation_mt.not_negation_mtP(mt1, mt2, mt_mt, UNPROVIDED))));
            }
        }
    }

    @LispMethod(comment = "If mt1 and mt2 are the same, returns T if there is a _known_\r\n(i.e. not assumed) reason for believing they are not negation-mt.\r\nIf they are not the same, then it considers assumed reasons\r\nas well, and returns T if there is some reason for believing\r\nthey are not negation-mt with all reasons considered.\nIf mt1 and mt2 are the same, returns T if there is a _known_\n(i.e. not assumed) reason for believing they are not negation-mt.\nIf they are not the same, then it considers assumed reasons\nas well, and returns T if there is some reason for believing\nthey are not negation-mt with all reasons considered.")
    public static SubLObject basis_for_not_negation_mtP(final SubLObject mt1, final SubLObject mt2, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject known_not_negation_mtP = NIL;
        if (mt1.eql(mt2)) {
            final SubLObject _prev_bind_0 = sbhl_module_vars.$assume_sbhl_extensions_nonempty$.currentBinding(thread);
            try {
                sbhl_module_vars.$assume_sbhl_extensions_nonempty$.bind(NIL, thread);
                known_not_negation_mtP = not_negation_mtP(mt1, mt2, mt_mt, UNPROVIDED);
            } finally {
                sbhl_module_vars.$assume_sbhl_extensions_nonempty$.rebind(_prev_bind_0, thread);
            }
        }
        return makeBoolean((mt1.eql(mt2) && (NIL != known_not_negation_mtP)) || ((!mt1.eql(mt2)) && (NIL != not_negation_mtP(mt1, mt2, mt_mt, UNPROVIDED))));
    }

    /**
     * justification of (negation-pred? <p1> <p2>)
     */
    @LispMethod(comment = "justification of (negation-pred? <p1> <p2>)")
    public static final SubLObject why_negation_mtP_alt(SubLObject mt1, SubLObject mt2, SubLObject mt_mt, SubLObject tv, SubLObject behavior) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (behavior == UNPROVIDED) {
            behavior = NIL;
        }
        return sbhl_search_implied_relations.why_sbhl_implied_disjoins_relation_p(sbhl_module_vars.get_sbhl_module($$negationMt), mt1, mt2, mt_mt, tv, behavior);
    }

    @LispMethod(comment = "justification of (negation-pred? <p1> <p2>)")
    public static SubLObject why_negation_mtP(final SubLObject mt1, final SubLObject mt2, SubLObject mt_mt, SubLObject tv, SubLObject behavior) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (behavior == UNPROVIDED) {
            behavior = NIL;
        }
        return sbhl_search_implied_relations.why_sbhl_implied_disjoins_relation_p(sbhl_module_vars.get_sbhl_module($$negationMt), mt1, mt2, mt_mt, tv, behavior);
    }

    /**
     *
     *
     * @return listp; the microtheories in which MT has negation-mt assertions.
     */
    @LispMethod(comment = "@return listp; the microtheories in which MT has negation-mt assertions.")
    public static final SubLObject negation_mt_mts_alt(SubLObject mt) {
        return kb_accessors.pred_mts(mt, sbhl_module_vars.get_sbhl_module($$negationMt), UNPROVIDED);
    }

    /**
     *
     *
     * @return listp; the microtheories in which MT has negation-mt assertions.
     */
    @LispMethod(comment = "@return listp; the microtheories in which MT has negation-mt assertions.")
    public static SubLObject negation_mt_mts(final SubLObject mt) {
        return kb_accessors.pred_mts(mt, sbhl_module_vars.get_sbhl_module($$negationMt), UNPROVIDED);
    }

    /**
     *
     *
     * @return listp; the asserted true links for MT in MT-MT / *mt* via negation-mt.
     */
    @LispMethod(comment = "@return listp; the asserted true links for MT in MT-MT / *mt* via negation-mt.")
    public static final SubLObject asserted_negation_mts_alt(SubLObject mt, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_true_links(sbhl_module_vars.get_sbhl_module($$negationMt), mt, mt_mt);
    }

    /**
     *
     *
     * @return listp; the asserted true links for MT in MT-MT / *mt* via negation-mt.
     */
    @LispMethod(comment = "@return listp; the asserted true links for MT in MT-MT / *mt* via negation-mt.")
    public static SubLObject asserted_negation_mts(final SubLObject mt, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_true_links(sbhl_module_vars.get_sbhl_module($$negationMt), mt, mt_mt);
    }

    /**
     *
     *
     * @return listp; the asserted false links for MT in MT-MT / *mt* via negation-mt.
     */
    @LispMethod(comment = "@return listp; the asserted false links for MT in MT-MT / *mt* via negation-mt.")
    public static final SubLObject asserted_not_negation_mts_alt(SubLObject mt, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_false_links(sbhl_module_vars.get_sbhl_module($$negationMt), mt, mt_mt);
    }

    /**
     *
     *
     * @return listp; the asserted false links for MT in MT-MT / *mt* via negation-mt.
     */
    @LispMethod(comment = "@return listp; the asserted false links for MT in MT-MT / *mt* via negation-mt.")
    public static SubLObject asserted_not_negation_mts(final SubLObject mt, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_false_links(sbhl_module_vars.get_sbhl_module($$negationMt), mt, mt_mt);
    }

    /**
     *
     *
     * @return listp; the supported true links for MT in MT-MT / *mt* via negation-mt.
     */
    @LispMethod(comment = "@return listp; the supported true links for MT in MT-MT / *mt* via negation-mt.")
    public static final SubLObject supported_negation_mts_alt(SubLObject mt, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_true_links(sbhl_module_vars.get_sbhl_module($$negationMt), mt, mt_mt);
    }

    /**
     *
     *
     * @return listp; the supported true links for MT in MT-MT / *mt* via negation-mt.
     */
    @LispMethod(comment = "@return listp; the supported true links for MT in MT-MT / *mt* via negation-mt.")
    public static SubLObject supported_negation_mts(final SubLObject mt, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_true_links(sbhl_module_vars.get_sbhl_module($$negationMt), mt, mt_mt);
    }

    /**
     *
     *
     * @return listp; the supported false links for MT in MT-MT / *mt* via negation-mt.
     */
    @LispMethod(comment = "@return listp; the supported false links for MT in MT-MT / *mt* via negation-mt.")
    public static final SubLObject supported_not_negation_mts_alt(SubLObject mt, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_false_links(sbhl_module_vars.get_sbhl_module($$negationMt), mt, mt_mt);
    }

    /**
     *
     *
     * @return listp; the supported false links for MT in MT-MT / *mt* via negation-mt.
     */
    @LispMethod(comment = "@return listp; the supported false links for MT in MT-MT / *mt* via negation-mt.")
    public static SubLObject supported_not_negation_mts(final SubLObject mt, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_false_links(sbhl_module_vars.get_sbhl_module($$negationMt), mt, mt_mt);
    }

    /**
     * Modifier. Adds sbhl links with @see sbhl-after-adding.
     */
    @LispMethod(comment = "Modifier. Adds sbhl links with @see sbhl-after-adding.")
    public static final SubLObject negation_mt_after_adding_alt(SubLObject source, SubLObject assertion) {
        sbhl_link_methods.sbhl_after_adding(source, assertion, sbhl_module_vars.get_sbhl_module($$negationMt));
        return NIL;
    }

    @LispMethod(comment = "Modifier. Adds sbhl links with @see sbhl-after-adding.")
    public static SubLObject negation_mt_after_adding(SubLObject source, final SubLObject assertion) {
        sbhl_link_methods.sbhl_after_adding(source, assertion, sbhl_module_vars.get_sbhl_module($$negationMt));
        return NIL;
    }/**
     * Modifier. Adds sbhl links with @see sbhl-after-adding.
     */


    /**
     * Modifier. Removes sbhl links with @see sbhl-after-removing.
     */
    @LispMethod(comment = "Modifier. Removes sbhl links with @see sbhl-after-removing.")
    public static final SubLObject negation_mt_after_removing_alt(SubLObject source, SubLObject assertion) {
        sbhl_link_methods.sbhl_after_removing(source, assertion, sbhl_module_vars.get_sbhl_module($$negationMt));
        return NIL;
    }

    @LispMethod(comment = "Modifier. Removes sbhl links with @see sbhl-after-removing.")
    public static SubLObject negation_mt_after_removing(SubLObject source, final SubLObject assertion) {
        sbhl_link_methods.sbhl_after_removing(source, assertion, sbhl_module_vars.get_sbhl_module($$negationMt));
        return NIL;
    }/**
     * Modifier. Removes sbhl links with @see sbhl-after-removing.
     */


    /**
     * Modifier. Clears all negation-mt links.
     */
    @LispMethod(comment = "Modifier. Clears all negation-mt links.")
    public static final SubLObject clear_negation_mt_graph_alt() {
        sbhl_link_methods.clear_sbhl_module_graph(sbhl_module_vars.get_sbhl_module($$negationMt));
        return NIL;
    }

    @LispMethod(comment = "Modifier. Clears all negation-mt links.")
    public static SubLObject clear_negation_mt_graph() {
        sbhl_link_methods.clear_sbhl_module_graph(sbhl_module_vars.get_sbhl_module($$negationMt));
        return NIL;
    }/**
     * Modifier. Clears all negation-mt links.
     */


    /**
     * Modifier. Removes NODE from all negation-mt links
     */
    @LispMethod(comment = "Modifier. Removes NODE from all negation-mt links")
    public static final SubLObject clear_node_negation_mt_links_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$negationMt), thread);
                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$negationMt)), thread);
                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$negationMt)), thread);
                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$negationMt), thread);
                    if (NIL != fort_types_interface.mtP(node)) {
                        {
                            SubLObject cdolist_list_var = sbhl_link_methods.sbhl_link_mts(sbhl_module_vars.get_sbhl_module($$negationMt), node);
                            SubLObject mt_mt = NIL;
                            for (mt_mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt_mt = cdolist_list_var.first()) {
                                sbhl_link_methods.clear_sbhl_links_within_mt(node, mt_mt, UNPROVIDED);
                            }
                        }
                    }
                } finally {
                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1, thread);
                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    /**
     * Modifier. Removes NODE from all negation-mt links
     */
    @LispMethod(comment = "Modifier. Removes NODE from all negation-mt links")
    public static SubLObject clear_node_negation_mt_links(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$negationMt), thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$negationMt)), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$negationMt)), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$negationMt), thread);
            if (NIL != fort_types_interface.mtP(node)) {
                SubLObject cdolist_list_var = sbhl_link_methods.sbhl_link_mts(sbhl_module_vars.get_sbhl_module($$negationMt), node);
                SubLObject mt_mt = NIL;
                mt_mt = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    sbhl_link_methods.clear_sbhl_links_within_mt(node, mt_mt, UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    mt_mt = cdolist_list_var.first();
                } 
            }
        } finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    /**
     * Modifier. Clears negation-mt links for MT, and recomputes them.
     */
    @LispMethod(comment = "Modifier. Clears negation-mt links for MT, and recomputes them.")
    public static final SubLObject reset_negation_mt_links_alt(SubLObject mt) {
        {
            SubLObject mt_mts = com.cyc.cycjava.cycl.negation_mt.negation_mt_mts(mt);
            com.cyc.cycjava.cycl.negation_mt.clear_node_negation_mt_links(mt);
            if (NIL != fort_types_interface.mtP(mt)) {
                {
                    SubLObject cdolist_list_var = mt_mts;
                    SubLObject mt_mt = NIL;
                    for (mt_mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt_mt = cdolist_list_var.first()) {
                        com.cyc.cycjava.cycl.negation_mt.reset_negation_mt_links_in_mt(mt, mt_mt);
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Modifier. Clears negation-mt links for MT, and recomputes them.")
    public static SubLObject reset_negation_mt_links(final SubLObject mt) {
        final SubLObject mt_mts = negation_mt_mts(mt);
        clear_node_negation_mt_links(mt);
        if (NIL != fort_types_interface.mtP(mt)) {
            SubLObject cdolist_list_var = mt_mts;
            SubLObject mt_mt = NIL;
            mt_mt = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                reset_negation_mt_links_in_mt(mt, mt_mt);
                cdolist_list_var = cdolist_list_var.rest();
                mt_mt = cdolist_list_var.first();
            } 
        }
        return NIL;
    }/**
     * Modifier. Clears negation-mt links for MT, and recomputes them.
     */


    /**
     * Modifier. Recomputes negation-mts links for MT within MT-MT with @see sbhl-recompute-links
     */
    @LispMethod(comment = "Modifier. Recomputes negation-mts links for MT within MT-MT with @see sbhl-recompute-links")
    public static final SubLObject reset_negation_mt_links_in_mt_alt(SubLObject mt, SubLObject mt_mt) {
        sbhl_link_methods.sbhl_recompute_links(mt, mt_mt, sbhl_module_vars.get_sbhl_module($$negationMt));
        return NIL;
    }

    @LispMethod(comment = "Modifier. Recomputes negation-mts links for MT within MT-MT with @see sbhl-recompute-links")
    public static SubLObject reset_negation_mt_links_in_mt(final SubLObject mt, final SubLObject mt_mt) {
        sbhl_link_methods.sbhl_recompute_links(mt, mt_mt, sbhl_module_vars.get_sbhl_module($$negationMt));
        return NIL;
    }/**
     * Modifier. Recomputes negation-mts links for MT within MT-MT with @see sbhl-recompute-links
     */


    /**
     * Modifier. Recomputes all negation-mt links.
     */
    @LispMethod(comment = "Modifier. Recomputes all negation-mt links.")
    public static final SubLObject reset_negation_mt_graph_alt(SubLObject clearP) {
        if (clearP == UNPROVIDED) {
            clearP = T;
        }
        if (NIL != clearP) {
            com.cyc.cycjava.cycl.negation_mt.clear_negation_mt_graph();
        }
        sbhl_link_methods.sbhl_recompute_graph_links(sbhl_module_vars.get_sbhl_module($$negationMt));
        return NIL;
    }

    @LispMethod(comment = "Modifier. Recomputes all negation-mt links.")
    public static SubLObject reset_negation_mt_graph(SubLObject clearP) {
        if (clearP == UNPROVIDED) {
            clearP = T;
        }
        if (NIL != clearP) {
            clear_negation_mt_graph();
        }
        sbhl_link_methods.sbhl_recompute_graph_links(sbhl_module_vars.get_sbhl_module($$negationMt));
        return NIL;
    }/**
     * Modifier. Recomputes all negation-mt links.
     */


    public static SubLObject incompatible_mtsP(final SubLObject mt1, final SubLObject mt2, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_implied_relations.sbhl_implied_disjoins_relation_p(sbhl_module_vars.get_sbhl_module($$incompatibleMt), mt1, mt2, mt, tv);
    }

    public static SubLObject incompatible_mt_after_adding(SubLObject source, final SubLObject assertion) {
        sbhl_link_methods.sbhl_after_adding(source, assertion, sbhl_module_vars.get_sbhl_module($$incompatibleMt));
        return NIL;
    }

    public static SubLObject incompatible_mt_after_removing(SubLObject source, final SubLObject assertion) {
        sbhl_link_methods.sbhl_after_removing(source, assertion, sbhl_module_vars.get_sbhl_module($$incompatibleMt));
        return NIL;
    }

    public static SubLObject propagate_to_incompatible_mt(final SubLObject argument, final SubLObject assertion) {
        return after_adding_modules.propagate_sbhl_spec_pred_uses($$incompatibleMt, assertion);
    }

    public static SubLObject why_incompatible_mtsP(final SubLObject mt_1, final SubLObject mt_2, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (behavior == UNPROVIDED) {
            behavior = NIL;
        }
        return sbhl_search_implied_relations.why_sbhl_implied_disjoins_relation_p(sbhl_module_vars.get_sbhl_module($$incompatibleMt), mt_1, mt_2, mt, tv, behavior);
    }

    public static SubLObject clear_incompatible_mt_graph() {
        sbhl_link_methods.clear_sbhl_module_graph(sbhl_module_vars.get_sbhl_module($$incompatibleMt));
        return NIL;
    }

    public static SubLObject intensionally_incompatible_mtsP(final SubLObject mt1, final SubLObject mt2, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_implied_relations.sbhl_implied_disjoins_relation_p(sbhl_module_vars.get_sbhl_module($$intensionallyIncompatibleMt), mt1, mt2, mt, tv);
    }

    public static SubLObject intensionally_incompatible_mt_after_adding(SubLObject source, final SubLObject assertion) {
        sbhl_link_methods.sbhl_after_adding(source, assertion, sbhl_module_vars.get_sbhl_module($$intensionallyIncompatibleMt));
        return NIL;
    }

    public static SubLObject intensionally_incompatible_mt_after_removing(SubLObject source, final SubLObject assertion) {
        sbhl_link_methods.sbhl_after_removing(source, assertion, sbhl_module_vars.get_sbhl_module($$intensionallyIncompatibleMt));
        return NIL;
    }

    public static SubLObject why_intensionally_incompatible_mtsP(final SubLObject mt_1, final SubLObject mt_2, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (behavior == UNPROVIDED) {
            behavior = NIL;
        }
        return sbhl_search_implied_relations.why_sbhl_implied_disjoins_relation_p(sbhl_module_vars.get_sbhl_module($$intensionallyIncompatibleMt), mt_1, mt_2, mt, tv, behavior);
    }

    public static SubLObject clear_intensionally_incompatible_mt_graph() {
        sbhl_link_methods.clear_sbhl_module_graph(sbhl_module_vars.get_sbhl_module($$intensionallyIncompatibleMt));
        return NIL;
    }

    public static SubLObject generalize_mt_pairs_for_incompatible_mt_assertions(final SubLObject mt_1, final SubLObject mt_2, SubLObject visited_nodes) {
        if (visited_nodes == UNPROVIDED) {
            visited_nodes = NIL;
        }
        if ((NIL != genl_mts.genl_mtP(mt_1, mt_2, UNPROVIDED, UNPROVIDED)) || (NIL != genl_mts.genl_mtP(mt_2, mt_1, UNPROVIDED, UNPROVIDED))) {
            return NIL;
        }
        if (NIL == member(elify(list(mt_1, mt_2)), visited_nodes, symbol_function(EQUAL), UNPROVIDED)) {
            SubLObject genl_mt_list_1 = genl_mts.genl_mts(mt_1, UNPROVIDED, UNPROVIDED);
            SubLObject genl_mt_list_2 = genl_mts.genl_mts(mt_2, UNPROVIDED, UNPROVIDED);
            genl_mt_list_1 = cons(mt_1, genl_mt_list_1);
            genl_mt_list_2 = cons(mt_2, genl_mt_list_2);
            SubLObject cdolist_list_var = genl_mt_list_1;
            SubLObject genl_mt_of_mt_1 = NIL;
            genl_mt_of_mt_1 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$3 = genl_mt_list_2;
                SubLObject genl_mt_of_mt_2 = NIL;
                genl_mt_of_mt_2 = cdolist_list_var_$3.first();
                while (NIL != cdolist_list_var_$3) {
                    if (((!genl_mt_of_mt_1.equal(mt_1)) || (!genl_mt_of_mt_2.equal(mt_2))) && (NIL == common_spec_mt_existsP(genl_mt_of_mt_1, genl_mt_of_mt_2))) {
                        return generalize_mt_pairs_for_incompatible_mt_assertions(genl_mt_of_mt_1, genl_mt_of_mt_2, append(visited_nodes, list(elify(list(mt_1, mt_2)))));
                    }
                    cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                    genl_mt_of_mt_2 = cdolist_list_var_$3.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                genl_mt_of_mt_1 = cdolist_list_var.first();
            } 
        }
        return list(mt_1, mt_2);
    }

    public static SubLObject common_spec_mt_existsP(final SubLObject mt_1, final SubLObject mt_2) {
        return genl_mts.max_floor_mts(hlify(list(mt_1, mt_2)), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject update_extensionally_incompatible_mt_assertions(SubLObject source, final SubLObject genl_mt_assertion) {
        if (NIL != hl_transcript_tracing.within_hl_evalP()) {
            return NIL;
        }
        final SubLObject gaf = assertions_high.gaf_formula(genl_mt_assertion);
        final SubLObject mt_1 = cycl_utilities.formula_arg1(gaf, UNPROVIDED);
        final SubLObject mt_2 = cycl_utilities.formula_arg2(gaf, UNPROVIDED);
        return update_extensionally_incompatible_mt_assertions_int(mt_1, mt_2);
    }

    public static SubLObject update_extensionally_incompatible_mt_assertions_int(final SubLObject mt_1, final SubLObject mt_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject number_of_iterations = ZERO_INTEGER;
            while (NIL != incompatible_mtsP(mt_1, mt_2, UNPROVIDED, UNPROVIDED)) {
                number_of_iterations = add(number_of_iterations, ONE_INTEGER);
                final SubLObject justifications = sbhl_search_implied_relations.why_sbhl_implied_disjoins_relation_p(sbhl_module_vars.get_sbhl_module($$incompatibleMt), mt_1, mt_2, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject any_assertion_foundP = NIL;
                SubLObject cdolist_list_var = justifications;
                SubLObject justification = NIL;
                justification = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = justification;
                    SubLObject gaf = NIL;
                    SubLObject truth = NIL;
                    destructuring_bind_must_consp(current, datum, $list11);
                    gaf = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list11);
                    truth = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        final SubLObject pred = cycl_utilities.formula_arg0(gaf);
                        if (pred.eql($$incompatibleMt)) {
                            final SubLObject assertion = czer_meta.find_assertion_cycl(gaf, UNPROVIDED);
                            SubLObject cdolist_list_var_$4 = assertions_high.assertion_arguments(assertion);
                            SubLObject argument = NIL;
                            argument = cdolist_list_var_$4.first();
                            while (NIL != cdolist_list_var_$4) {
                                if (NIL != deduction_handles.deduction_p(argument)) {
                                    SubLObject cdolist_list_var_$5 = dictionary.dictionary_contents(assertion_utilities.deduction_asserted_assertion_supports(argument, FIVE_INTEGER));
                                    SubLObject content = NIL;
                                    content = cdolist_list_var_$5.first();
                                    while (NIL != cdolist_list_var_$5) {
                                        final SubLObject support = content.first();
                                        if ((NIL != assertion_handles.assertion_p(support)) && (NIL == assertions_high.rule_assertionP(support))) {
                                            final SubLObject support_pred = cycl_utilities.formula_arg0(support);
                                            if (NIL != genl_predicates.genl_predP(support_pred, $$extensionallyIncompatibleMt, UNPROVIDED, UNPROVIDED)) {
                                                tms.tms_remove_assertion(support);
                                                any_assertion_foundP = T;
                                            }
                                        }
                                        cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                                        content = cdolist_list_var_$5.first();
                                    } 
                                }
                                cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                                argument = cdolist_list_var_$4.first();
                            } 
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list11);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    justification = cdolist_list_var.first();
                } 
                if (NIL == any_assertion_foundP) {
                    return NIL;
                }
                if (number_of_iterations.numG($no_of_ext_incompatiable_mt_assertions_to_be_unasserted$.getDynamicValue(thread))) {
                    Errors.warn($str14$The_function_update_extensionally);
                    return NIL;
                }
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject declare_negation_mt_file() {
        declareFunction("local_negation_mts", "LOCAL-NEGATION-MTS", 1, 2, false);
        declareFunction("local_max_negation_mts", "LOCAL-MAX-NEGATION-MTS", 1, 2, false);
        declareFunction("local_not_negation_mts", "LOCAL-NOT-NEGATION-MTS", 1, 2, false);
        declareFunction("local_min_not_negation_mts", "LOCAL-MIN-NOT-NEGATION-MTS", 1, 2, false);
        declareFunction("all_negation_mts", "ALL-NEGATION-MTS", 1, 2, false);
        declareFunction("all_not_negation_mts", "ALL-NOT-NEGATION-MTS", 1, 2, false);
        declareFunction("max_negation_mts", "MAX-NEGATION-MTS", 1, 2, false);
        declareFunction("negation_mts", "NEGATION-MTS", 1, 2, false);
        declareFunction("min_all_not_negation_mts", "MIN-ALL-NOT-NEGATION-MTS", 1, 2, false);
        declareFunction("min_implied_not_negation_mts", "MIN-IMPLIED-NOT-NEGATION-MTS", 1, 2, false);
        declareFunction("min_all_asserted_not_negation_mts", "MIN-ALL-ASSERTED-NOT-NEGATION-MTS", 1, 2, false);
        declareFunction("any_disjoint_mt_pair", "ANY-DISJOINT-MT-PAIR", 1, 1, false);
        declareFunction("negation_mtP", "NEGATION-MT?", 2, 2, false);
        declareFunction("any_negation_mtP", "ANY-NEGATION-MT?", 2, 2, false);
        declareFunction("any_negation_mt_anyP", "ANY-NEGATION-MT-ANY?", 2, 2, false);
        declareFunction("not_negation_mtP", "NOT-NEGATION-MT?", 2, 2, false);
        declareFunction("mts_disjointP", "MTS-DISJOINT?", 2, 1, false);
        declareFunction("disjoint_mtsP", "DISJOINT-MTS?", 2, 1, false);
        declareFunction("any_disjoint_mtsP", "ANY-DISJOINT-MTS?", 1, 1, false);
        declareFunction("basis_for_not_negation_mtP", "BASIS-FOR-NOT-NEGATION-MT?", 2, 1, false);
        declareFunction("why_negation_mtP", "WHY-NEGATION-MT?", 2, 3, false);
        declareFunction("negation_mt_mts", "NEGATION-MT-MTS", 1, 0, false);
        declareFunction("asserted_negation_mts", "ASSERTED-NEGATION-MTS", 1, 1, false);
        declareFunction("asserted_not_negation_mts", "ASSERTED-NOT-NEGATION-MTS", 1, 1, false);
        declareFunction("supported_negation_mts", "SUPPORTED-NEGATION-MTS", 1, 1, false);
        declareFunction("supported_not_negation_mts", "SUPPORTED-NOT-NEGATION-MTS", 1, 1, false);
        declareFunction("negation_mt_after_adding", "NEGATION-MT-AFTER-ADDING", 2, 0, false);
        declareFunction("negation_mt_after_removing", "NEGATION-MT-AFTER-REMOVING", 2, 0, false);
        declareFunction("clear_negation_mt_graph", "CLEAR-NEGATION-MT-GRAPH", 0, 0, false);
        declareFunction("clear_node_negation_mt_links", "CLEAR-NODE-NEGATION-MT-LINKS", 1, 0, false);
        declareFunction("reset_negation_mt_links", "RESET-NEGATION-MT-LINKS", 1, 0, false);
        declareFunction("reset_negation_mt_links_in_mt", "RESET-NEGATION-MT-LINKS-IN-MT", 2, 0, false);
        declareFunction("reset_negation_mt_graph", "RESET-NEGATION-MT-GRAPH", 0, 1, false);
        declareFunction("incompatible_mtsP", "INCOMPATIBLE-MTS?", 2, 2, false);
        declareFunction("incompatible_mt_after_adding", "INCOMPATIBLE-MT-AFTER-ADDING", 2, 0, false);
        declareFunction("incompatible_mt_after_removing", "INCOMPATIBLE-MT-AFTER-REMOVING", 2, 0, false);
        declareFunction("propagate_to_incompatible_mt", "PROPAGATE-TO-INCOMPATIBLE-MT", 2, 0, false);
        declareFunction("why_incompatible_mtsP", "WHY-INCOMPATIBLE-MTS?", 2, 3, false);
        declareFunction("clear_incompatible_mt_graph", "CLEAR-INCOMPATIBLE-MT-GRAPH", 0, 0, false);
        declareFunction("intensionally_incompatible_mtsP", "INTENSIONALLY-INCOMPATIBLE-MTS?", 2, 2, false);
        declareFunction("intensionally_incompatible_mt_after_adding", "INTENSIONALLY-INCOMPATIBLE-MT-AFTER-ADDING", 2, 0, false);
        declareFunction("intensionally_incompatible_mt_after_removing", "INTENSIONALLY-INCOMPATIBLE-MT-AFTER-REMOVING", 2, 0, false);
        declareFunction("why_intensionally_incompatible_mtsP", "WHY-INTENSIONALLY-INCOMPATIBLE-MTS?", 2, 3, false);
        declareFunction("clear_intensionally_incompatible_mt_graph", "CLEAR-INTENSIONALLY-INCOMPATIBLE-MT-GRAPH", 0, 0, false);
        declareFunction("generalize_mt_pairs_for_incompatible_mt_assertions", "GENERALIZE-MT-PAIRS-FOR-INCOMPATIBLE-MT-ASSERTIONS", 2, 1, false);
        declareFunction("common_spec_mt_existsP", "COMMON-SPEC-MT-EXISTS?", 2, 0, false);
        declareFunction("update_extensionally_incompatible_mt_assertions", "UPDATE-EXTENSIONALLY-INCOMPATIBLE-MT-ASSERTIONS", 2, 0, false);
        declareFunction("update_extensionally_incompatible_mt_assertions_int", "UPDATE-EXTENSIONALLY-INCOMPATIBLE-MT-ASSERTIONS-INT", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_negation_mt_file() {
        defparameter("*NO-OF-EXT-INCOMPATIABLE-MT-ASSERTIONS-TO-BE-UNASSERTED*", TWENTY_INTEGER);
        return NIL;
    }

    public static SubLObject setup_negation_mt_file() {
        register_kb_function(INCOMPATIBLE_MT_AFTER_ADDING);
        register_kb_function(INCOMPATIBLE_MT_AFTER_REMOVING);
        register_kb_function(PROPAGATE_TO_INCOMPATIBLE_MT);
        register_kb_function(INTENSIONALLY_INCOMPATIBLE_MT_AFTER_ADDING);
        register_kb_function(INTENSIONALLY_INCOMPATIBLE_MT_AFTER_REMOVING);
        register_kb_function(UPDATE_EXTENSIONALLY_INCOMPATIBLE_MT_ASSERTIONS);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_negation_mt_file();
    }

    @Override
    public void initializeVariables() {
        init_negation_mt_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_negation_mt_file();
    }

    static {
    }
}

/**
 * Total time: 205 ms
 */
