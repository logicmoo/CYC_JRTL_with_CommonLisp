/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      REMOVAL-MODULES-RELATION-ALL-EXISTS
 * source file: /cyc/top/cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp
 * created:     2019/07/03 17:37:44
 */
public final class removal_modules_relation_all_exists extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new removal_modules_relation_all_exists();

 public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists";


    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $estimated_per_collection_relation_all_exists_count$ = makeSymbol("*ESTIMATED-PER-COLLECTION-RELATION-ALL-EXISTS-COUNT*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $relation_all_exists_rule$ = makeSymbol("*RELATION-ALL-EXISTS-RULE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $default_relation_all_exists_check_cost$ = makeSymbol("*DEFAULT-RELATION-ALL-EXISTS-CHECK-COST*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $minimum_relation_all_exists_unify_cost$ = makeSymbol("*MINIMUM-RELATION-ALL-EXISTS-UNIFY-COST*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $estimated_per_collection_relation_exists_all_count$ = makeSymbol("*ESTIMATED-PER-COLLECTION-RELATION-EXISTS-ALL-COUNT*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $relation_exists_all_rule$ = makeSymbol("*RELATION-EXISTS-ALL-RULE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $default_relation_exists_all_check_cost$ = makeSymbol("*DEFAULT-RELATION-EXISTS-ALL-CHECK-COST*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $minimum_relation_exists_all_unify_cost$ = makeSymbol("*MINIMUM-RELATION-EXISTS-ALL-UNIFY-COST*");

    @LispMethod(comment = "Internal Constants")
    // Internal Constants
    private static final SubLSymbol $RELATION_ALL_EXISTS_POS = makeKeyword("RELATION-ALL-EXISTS-POS");

    static private final SubLList $list1 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE"), makeSymbol("RELATION-ALL-EXISTS-POS-PREFERENCE"));

    static private final SubLList $list2 = list(makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"));

    static private final SubLList $list4 = list(makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), cons(reader_make_constant_shell("RelationAllExistsFn"), makeKeyword("FULLY-BOUND")));

    static private final SubLList $list6 = list(makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND"));

    static private final SubLList $list7 = list(makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"));

    static private final SubLList $list8 = list(makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"));







    static private final SubLList $list12 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("relationAllExists"), makeSymbol("?PRED"), makeSymbol("?INDEP-COL"), makeSymbol("?DEP-COL")), list(reader_make_constant_shell("isa"), makeSymbol("?TERM"), makeSymbol("?INDEP-COL"))), list(makeSymbol("?PRED"), makeSymbol("?TERM"), list(reader_make_constant_shell("RelationAllExistsFn"), makeSymbol("?TERM"), makeSymbol("?PRED"), makeSymbol("?INDEP-COL"), makeSymbol("?DEP-COL"))));

    public static final SubLSymbol $relation_all_exists_defining_mt$ = makeSymbol("*RELATION-ALL-EXISTS-DEFINING-MT*");



    private static final SubLSymbol $REMOVAL_RELATION_ALL_EXISTS_PRUNE = makeKeyword("REMOVAL-RELATION-ALL-EXISTS-PRUNE");

    static private final SubLList $list18 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), cons($FORT, makeKeyword("ANYTHING")), list(makeKeyword("TREE-FIND"), reader_make_constant_shell("RelationAllExistsFn"))), makeKeyword("EXCLUSIVE"), makeSymbol("REMOVAL-RELATION-ALL-EXISTS-PRUNE"), makeKeyword("COST-EXPRESSION"), ZERO_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString(""), makeKeyword("EXAMPLE"), makeString("") });

    static private final SubLList $list19 = list($FORT, makeKeyword("ANYTHING"), list(reader_make_constant_shell("RelationAllExistsFn"), makeKeyword("ANYTHING"), $FORT, makeKeyword("ANYTHING"), makeKeyword("ANYTHING")));

    static private final SubLList $list20 = list(list($BIND, makeSymbol("PREDICATE")), list($BIND, makeSymbol("TERM")), list(reader_make_constant_shell("RelationAllExistsFn"), list($BIND, makeSymbol("RAE-TERM")), list($BIND, makeSymbol("RAE-PRED")), list($BIND, makeSymbol("IND-COL")), list($BIND, makeSymbol("DEP-COL"))));

    private static final SubLSymbol DEP_COL = makeSymbol("DEP-COL");

    private static final SubLSymbol IND_COL = makeSymbol("IND-COL");

    private static final SubLSymbol RAE_PRED = makeSymbol("RAE-PRED");

    private static final SubLSymbol RAE_TERM = makeSymbol("RAE-TERM");

    private static final SubLList $list27 = list($FORT, list(reader_make_constant_shell("RelationAllExistsFn"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), $FORT, makeKeyword("FULLY-BOUND")), makeKeyword("ANYTHING"));

    private static final SubLSymbol $REMOVAL_RELATION_ALL_EXISTS_CHECK = makeKeyword("REMOVAL-RELATION-ALL-EXISTS-CHECK");

    private static final SubLList $list34 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list($FORT, makeKeyword("FULLY-BOUND"), list(reader_make_constant_shell("RelationAllExistsFn"), makeKeyword("FULLY-BOUND"), $FORT, makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"))), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-RELATION-ALL-EXISTS-CHECK-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-RELATION-ALL-EXISTS-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RELATION-ALL-EXISTS-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <object>\n  (#$RelationAllExistsFn <object> <predicate> <indep-col> <dep-col>)) \nwhere <object> is a TERM\nfrom (#$relationAllExists <predicate> <indep-col> <dep-col>)\nand  (#$isa <object> <indep-col>)"), makeKeyword("EXAMPLE"), makeString("(#$grandfathers #$AbrahamLincoln \n  (#$RelationAllExistsFn #$AbrahamLincoln #$grandfathers #$Animal #$MaleAnimal))\nfrom (#$relationAllExists #$grandfathers #$Animal #$MaleAnimal)\nand (#$isa #$AbrahamLincoln #$Animal)") });

    private static final SubLSymbol $REMOVAL_RELATION_ALL_EXISTS_UNIFY = makeKeyword("REMOVAL-RELATION-ALL-EXISTS-UNIFY");

    private static final SubLList $list38 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list($FORT, makeKeyword("FULLY-BOUND"), makeKeyword("VARIABLE")), list($FORT, makeKeyword("FULLY-BOUND"), list(makeKeyword("NAT"), cons(reader_make_constant_shell("RelationAllExistsFn"), makeKeyword("NOT-FULLY-BOUND"))))), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-RELATION-ALL-EXISTS-UNIFY-REQUIRED"), $COST, makeSymbol("REMOVAL-RELATION-ALL-EXISTS-UNIFY-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RELATION-ALL-EXISTS-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <object> <not fully-bound>)\nwhere <object> is a TERM\nfrom (#$relationAllExists <predicate> <indep-col> <dep-col>) \nand (#$isa <object> <indep-col>)"), makeKeyword("EXAMPLE"), makeString("(#$grandfathers #$AbrahamLincoln ?RELATIVE)\nfrom (#$relationAllExists #$grandfathers #$Animal #$MaleAnimal)\nand (#$isa #$AbrahamLincoln #$Animal)") });

    private static final SubLSymbol $RELATION_EXISTS_ALL_POS = makeKeyword("RELATION-EXISTS-ALL-POS");

    static private final SubLList $list40 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE"), makeSymbol("RELATION-EXISTS-ALL-POS-PREFERENCE"));

    private static final SubLList $list41 = list(makeKeyword("FULLY-BOUND"), cons(reader_make_constant_shell("RelationExistsAllFn"), makeKeyword("FULLY-BOUND")), makeKeyword("NOT-FULLY-BOUND"));





    private static final SubLList $list44 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("relationExistsAll"), makeSymbol("?PRED"), makeSymbol("?DEP-COL"), makeSymbol("?INDEP-COL")), list(reader_make_constant_shell("isa"), makeSymbol("?TERM"), makeSymbol("?INDEP-COL"))), list(makeSymbol("?PRED"), list(reader_make_constant_shell("RelationExistsAllFn"), makeSymbol("?TERM"), makeSymbol("?PRED"), makeSymbol("?DEP-COL"), makeSymbol("?INDEP-COL")), makeSymbol("?TERM")));

    public static final SubLSymbol $relation_exists_all_defining_mt$ = makeSymbol("*RELATION-EXISTS-ALL-DEFINING-MT*");

    private static final SubLSymbol $REMOVAL_RELATION_EXISTS_ALL_PRUNE = makeKeyword("REMOVAL-RELATION-EXISTS-ALL-PRUNE");

    static private final SubLList $list47 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), cons($FORT, makeKeyword("ANYTHING")), list(makeKeyword("TREE-FIND"), reader_make_constant_shell("RelationExistsAllFn"))), makeKeyword("EXCLUSIVE"), makeSymbol("REMOVAL-RELATION-EXISTS-ALL-PRUNE"), makeKeyword("COST-EXPRESSION"), ZERO_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString(""), makeKeyword("EXAMPLE"), makeString("") });

    static private final SubLList $list48 = list($FORT, list(reader_make_constant_shell("RelationExistsAllFn"), makeKeyword("ANYTHING"), $FORT, makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), makeKeyword("ANYTHING"));

    private static final SubLList $list49 = list(list($BIND, makeSymbol("PREDICATE")), list(reader_make_constant_shell("RelationExistsAllFn"), list($BIND, makeSymbol("REA-TERM")), list($BIND, makeSymbol("REA-PRED")), list($BIND, makeSymbol("DEP-COL")), list($BIND, makeSymbol("IND-COL"))), list($BIND, makeSymbol("TERM")));

    private static final SubLSymbol REA_PRED = makeSymbol("REA-PRED");

    private static final SubLSymbol REA_TERM = makeSymbol("REA-TERM");

    static private final SubLList $list52 = list($FORT, makeKeyword("ANYTHING"), list(reader_make_constant_shell("RelationExistsAllFn"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), $FORT));

    private static final SubLSymbol $REMOVAL_RELATION_EXISTS_ALL_CHECK = makeKeyword("REMOVAL-RELATION-EXISTS-ALL-CHECK");

    static private final SubLList $list54 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list($FORT, list(reader_make_constant_shell("RelationExistsAllFn"), makeKeyword("FULLY-BOUND"), $FORT, makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-RELATION-EXISTS-ALL-CHECK-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-RELATION-EXISTS-ALL-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RELATION-EXISTS-ALL-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> (#$RelationExistsAllFn <object> <predicate> <dep-col> <indep-col>) <object>) \nwhere <object> is a TERM\nfrom (#$relationExistsAll <predicate> <dep-col> <indep-col>)\nand (#$isa <object> <indep-col>)"), makeKeyword("EXAMPLE"), makeString("(#$citizens (#$RelationExistsAllFn #$AbrahamLincoln #$citizens #$Country #$Person)\n  #$AbrahamLincoln)\nfrom (#$relationExistsAll #$citizens #$Country #$Person)\nand (#$isa #$AbrahamLincoln #$Person)") });

    private static final SubLSymbol $REMOVAL_RELATION_EXISTS_ALL_UNIFY = makeKeyword("REMOVAL-RELATION-EXISTS-ALL-UNIFY");

    private static final SubLList $list56 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list($FORT, makeKeyword("VARIABLE"), makeKeyword("FULLY-BOUND")), list($FORT, list(makeKeyword("NAT"), cons(reader_make_constant_shell("RelationExistsAllFn"), makeKeyword("NOT-FULLY-BOUND"))), makeKeyword("FULLY-BOUND"))), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-RELATION-EXISTS-ALL-UNIFY-REQUIRED"), $COST, makeSymbol("REMOVAL-RELATION-EXISTS-ALL-UNIFY-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RELATION-EXISTS-ALL-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <not fully-bound> <object>) \nwhere <object> is a TERM\nfrom (#$relationExistsAll <predicate> <dep-col> <indep-col>)\nand (#$isa <object> <indep-col>)"), makeKeyword("EXAMPLE"), makeString("(#$citizens ?WHERE #$AbrahamLincoln)\nfrom (#$relationExistsAll #$citizens #$Country #$Person)\nand (#$isa #$AbrahamLincoln #$Person)") });

    // Definitions
    /**
     * return T iff OBJECT is supported by the SBHL for starting an #$isa search.
     *
     * @unknown hagen
     */
    @LispMethod(comment = "return T iff OBJECT is supported by the SBHL for starting an #$isa search.\r\n\r\n@unknown hagen")
    public static final SubLObject sbhl_isa_source_object_p_alt(SubLObject v_object) {
        return possibly_fo_represented_term_p(v_object);
    }

    // Definitions
    /**
     * return T iff OBJECT is supported by the SBHL for starting an #$isa search.
     *
     * @unknown hagen
     */
    @LispMethod(comment = "return T iff OBJECT is supported by the SBHL for starting an #$isa search.\r\n\r\n@unknown hagen")
    public static SubLObject sbhl_isa_source_object_p(final SubLObject v_object) {
        return possibly_fo_represented_term_p(v_object);
    }

    public static final SubLObject relation_all_exists_pos_preference_alt(SubLObject asent, SubLObject bindable_vars, SubLObject strategic_context) {
        if (NIL == removal_module_utilities.current_query_allows_new_termsP()) {
            return NIL;
        } else {
            if (NIL == com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists.removal_relation_all_exists_required(asent, T)) {
                return NIL;
            } else {
                if (NIL != formula_pattern_match.formula_matches_pattern(asent, $list_alt2)) {
                    return $PREFERRED;
                } else {
                    if (NIL != formula_pattern_match.formula_matches_pattern(asent, $list_alt4)) {
                        return $DISPREFERRED;
                    } else {
                        if (NIL != formula_pattern_match.formula_matches_pattern(asent, $list_alt6)) {
                            return $PREFERRED;
                        } else {
                            if (NIL != formula_pattern_match.formula_matches_pattern(asent, $list_alt7)) {
                                return $PREFERRED;
                            } else {
                                if (NIL != formula_pattern_match.formula_matches_pattern(asent, $list_alt8)) {
                                    return $DISPREFERRED;
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject relation_all_exists_pos_preference(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context) {
        if (NIL == removal_module_utilities.current_query_allows_new_termsP()) {
            return NIL;
        }
        if (NIL == removal_relation_all_exists_required(asent, T)) {
            return NIL;
        }
        if (NIL != formula_pattern_match.formula_matches_pattern(asent, $list2)) {
            return $PREFERRED;
        }
        if (NIL != formula_pattern_match.formula_matches_pattern(asent, $list4)) {
            return $DISPREFERRED;
        }
        if (NIL != formula_pattern_match.formula_matches_pattern(asent, $list6)) {
            return $PREFERRED;
        }
        if (NIL != formula_pattern_match.formula_matches_pattern(asent, $list7)) {
            return $PREFERRED;
        }
        if (NIL != formula_pattern_match.formula_matches_pattern(asent, $list8)) {
            return $DISPREFERRED;
        }
        return NIL;
    }

    public static final SubLObject removal_some_relation_all_exists_for_predicate_alt(SubLObject predicate, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(predicate)) {
            return kb_mapping_utilities.some_pred_value_in_relevant_mts(predicate, $$relationAllExists, mt, ONE_INTEGER, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject removal_some_relation_all_exists_for_predicate(final SubLObject predicate, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(predicate)) {
            return kb_mapping_utilities.some_pred_value_in_relevant_mts(predicate, $$relationAllExists, mt, ONE_INTEGER, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject removal_some_relation_all_exists_for_collection_alt(SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(collection)) {
            if (NIL != somewhere_cache.some_pred_assertion_somewhereP($$relationAllExists, collection, TWO_INTEGER, UNPROVIDED)) {
                return kb_mapping_utilities.some_pred_value_in_relevant_mts(collection, $$relationAllExists, mt, TWO_INTEGER, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject removal_some_relation_all_exists_for_collection(final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if ((NIL != forts.fort_p(collection)) && (NIL != somewhere_cache.some_pred_assertion_somewhereP($$relationAllExists, collection, TWO_INTEGER, UNPROVIDED))) {
            return kb_mapping_utilities.some_pred_value_in_relevant_mts(collection, $$relationAllExists, mt, TWO_INTEGER, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject relation_all_exists_predicate_cost_estimate_alt(SubLObject predicate) {
        return kb_indexing.relevant_num_gaf_arg_index(predicate, ONE_INTEGER, $$relationAllExists);
    }

    public static SubLObject relation_all_exists_predicate_cost_estimate(final SubLObject predicate) {
        return kb_indexing.relevant_num_gaf_arg_index(predicate, ONE_INTEGER, $$relationAllExists);
    }

    public static final SubLObject relation_all_exists_collection_cost_estimate_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return multiply($estimated_per_collection_relation_all_exists_count$.getGlobalValue(), $average_all_isa_count$.getDynamicValue(thread));
        }
    }

    public static SubLObject relation_all_exists_collection_cost_estimate(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return multiply($estimated_per_collection_relation_all_exists_count$.getGlobalValue(), $average_all_isa_count$.getDynamicValue(thread));
    }

    public static final SubLObject removal_relation_all_exists_required_alt(SubLObject asent, SubLObject require_new_terms_allowedP) {
        if ((NIL != require_new_terms_allowedP) && (NIL == removal_module_utilities.current_query_allows_new_termsP())) {
            return NIL;
        }
        {
            SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
            return makeBoolean(((($$isa == predicate) || (NIL == hl_supports.hl_predicate_p(predicate))) && ((NIL == require_new_terms_allowedP) || (NIL != removal_modules_termofunit.skolemization_allowed($$RelationAllExistsFn)))) && (NIL != com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists.removal_some_relation_all_exists_for_predicate(predicate, NIL)));
        }
    }

    public static SubLObject removal_relation_all_exists_required(final SubLObject asent, final SubLObject require_new_terms_allowedP) {
        if ((NIL != require_new_terms_allowedP) && (NIL == removal_module_utilities.current_query_allows_new_termsP())) {
            return NIL;
        }
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        return makeBoolean((($$isa.eql(predicate) || (NIL == hl_supports.hl_predicate_p(predicate))) && ((NIL == require_new_terms_allowedP) || (NIL != removal_modules_termofunit.skolemization_allowed($$RelationAllExistsFn)))) && (NIL != removal_some_relation_all_exists_for_predicate(predicate, NIL)));
    }

    public static final SubLObject make_relation_all_exists_support_alt() {
        return arguments.make_hl_support($CODE, $relation_all_exists_rule$.getGlobalValue(), $relation_all_exists_defining_mt$.getGlobalValue(), $TRUE_MON);
    }

    public static SubLObject make_relation_all_exists_support() {
        return arguments.make_hl_support($CODE, $relation_all_exists_rule$.getGlobalValue(), $relation_all_exists_defining_mt$.getGlobalValue(), $TRUE_MON);
    }

    public static final SubLObject make_relation_all_exists_term_alt(SubLObject v_object, SubLObject predicate, SubLObject indep_col, SubLObject dep_col) {
        return list_to_elf(list($$RelationAllExistsFn, v_object, predicate, indep_col, dep_col));
    }

    public static SubLObject make_relation_all_exists_term(final SubLObject v_object, final SubLObject predicate, final SubLObject indep_col, final SubLObject dep_col) {
        return list_to_elf(list($$RelationAllExistsFn, v_object, predicate, indep_col, dep_col));
    }

    public static final SubLObject removal_relation_all_exists_prune_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != formula_pattern_match.pattern_matches_formula($list_alt19, asent)) {
                {
                    SubLObject pattern = $list_alt20;
                    thread.resetMultipleValues();
                    {
                        SubLObject success = formula_pattern_match.formula_matches_pattern(asent, pattern);
                        SubLObject v_bindings = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != success) {
                            {
                                SubLObject dep_col = list_utilities.alist_lookup_without_values(v_bindings, DEP_COL, UNPROVIDED, UNPROVIDED);
                                SubLObject ind_col = list_utilities.alist_lookup_without_values(v_bindings, IND_COL, UNPROVIDED, UNPROVIDED);
                                SubLObject rae_pred = list_utilities.alist_lookup_without_values(v_bindings, RAE_PRED, UNPROVIDED, UNPROVIDED);
                                SubLObject rae_term = list_utilities.alist_lookup_without_values(v_bindings, RAE_TERM, UNPROVIDED, UNPROVIDED);
                                SubLObject v_term = list_utilities.alist_lookup_without_values(v_bindings, TERM, UNPROVIDED, UNPROVIDED);
                                SubLObject predicate = list_utilities.alist_lookup_without_values(v_bindings, PREDICATE, UNPROVIDED, UNPROVIDED);
                                if (rae_pred != predicate) {
                                    return T;
                                }
                                if (NIL == unification.unify_possible(rae_term, v_term)) {
                                    return T;
                                }
                            }
                        }
                    }
                }
            } else {
                return T;
            }
            return NIL;
        }
    }

    public static SubLObject removal_relation_all_exists_prune(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != formula_pattern_match.pattern_matches_formula($list19, asent)) {
            final SubLObject pattern = $list20;
            thread.resetMultipleValues();
            final SubLObject success = formula_pattern_match.formula_matches_pattern(asent, pattern);
            final SubLObject v_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != success) {
                final SubLObject dep_col = list_utilities.alist_lookup_without_values(v_bindings, DEP_COL, UNPROVIDED, UNPROVIDED);
                final SubLObject ind_col = list_utilities.alist_lookup_without_values(v_bindings, IND_COL, UNPROVIDED, UNPROVIDED);
                final SubLObject rae_pred = list_utilities.alist_lookup_without_values(v_bindings, RAE_PRED, UNPROVIDED, UNPROVIDED);
                final SubLObject rae_term = list_utilities.alist_lookup_without_values(v_bindings, RAE_TERM, UNPROVIDED, UNPROVIDED);
                final SubLObject v_term = list_utilities.alist_lookup_without_values(v_bindings, TERM, UNPROVIDED, UNPROVIDED);
                final SubLObject predicate = list_utilities.alist_lookup_without_values(v_bindings, PREDICATE, UNPROVIDED, UNPROVIDED);
                if (!rae_pred.eql(predicate)) {
                    return T;
                }
                if (NIL == unification.unify_possible(rae_term, v_term)) {
                    return T;
                }
            }
            return NIL;
        }
        if (NIL != formula_pattern_match.pattern_matches_formula($list27, asent)) {
            return NIL;
        }
        return T;
    }

    public static final SubLObject removal_relation_all_exists_check_required_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists.removal_relation_all_exists_required(asent, NIL)) {
                {
                    SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                    SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                    thread.resetMultipleValues();
                    {
                        SubLObject functor = unmake_quaternary_formula(arg2);
                        SubLObject v_term = thread.secondMultipleValue();
                        SubLObject pred = thread.thirdMultipleValue();
                        SubLObject indep_col = thread.fourthMultipleValue();
                        SubLObject dep_col = thread.fifthMultipleValue();
                        thread.resetMultipleValues();
                        return makeBoolean((pred == cycl_utilities.atomic_sentence_predicate(asent)) && arg1.equal(v_term));
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_relation_all_exists_check_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != removal_relation_all_exists_required(asent, NIL)) {
            final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            thread.resetMultipleValues();
            final SubLObject functor = unmake_quaternary_formula(arg2);
            final SubLObject v_term = thread.secondMultipleValue();
            final SubLObject pred = thread.thirdMultipleValue();
            final SubLObject indep_col = thread.fourthMultipleValue();
            final SubLObject dep_col = thread.fifthMultipleValue();
            thread.resetMultipleValues();
            return makeBoolean(pred.eql(cycl_utilities.atomic_sentence_predicate(asent)) && arg1.equal(v_term));
        }
        return NIL;
    }

    public static final SubLObject removal_relation_all_exists_check_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                thread.resetMultipleValues();
                {
                    SubLObject functor = unmake_quaternary_formula(arg2);
                    SubLObject v_term = thread.secondMultipleValue();
                    SubLObject pred = thread.thirdMultipleValue();
                    SubLObject indep_col = thread.fourthMultipleValue();
                    SubLObject dep_col = thread.fifthMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject rae_sentence = list_to_elf(list($$relationAllExists, pred, indep_col, dep_col));
                        SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(rae_sentence, $POS);
                        SubLObject method = kb_mapping_macros.do_gli_extract_method(l_index);
                        SubLObject pcase_var = method;
                        if (pcase_var.eql($GAF_ARG)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject v_term_1 = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                                SubLObject argnum = thread.secondMultipleValue();
                                SubLObject predicate = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != argnum) {
                                    if (NIL != predicate) {
                                        {
                                            SubLObject pred_var = predicate;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_1, argnum, pred_var)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_1, argnum, pred_var);
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
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                                        {
                                                                            SubLObject done_var_2 = NIL;
                                                                            SubLObject token_var_3 = NIL;
                                                                            while (NIL == done_var_2) {
                                                                                {
                                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_3);
                                                                                    SubLObject valid_4 = makeBoolean(token_var_3 != assertion);
                                                                                    if (NIL != valid_4) {
                                                                                        com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists.removal_relation_all_exists_check_expand_internal(asent, assertion);
                                                                                    }
                                                                                    done_var_2 = makeBoolean(NIL == valid_4);
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
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
                                    } else {
                                        {
                                            SubLObject pred_var = NIL;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_1, argnum, pred_var)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_1, argnum, pred_var);
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
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                                        {
                                                                            SubLObject done_var_5 = NIL;
                                                                            SubLObject token_var_6 = NIL;
                                                                            while (NIL == done_var_5) {
                                                                                {
                                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_6);
                                                                                    SubLObject valid_7 = makeBoolean(token_var_6 != assertion);
                                                                                    if (NIL != valid_7) {
                                                                                        com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists.removal_relation_all_exists_check_expand_internal(asent, assertion);
                                                                                    }
                                                                                    done_var_5 = makeBoolean(NIL == valid_7);
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
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
                                    }
                                } else {
                                    if (NIL != predicate) {
                                        {
                                            SubLObject pred_var = predicate;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_1, NIL, pred_var)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_1, NIL, pred_var);
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
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                                        {
                                                                            SubLObject done_var_8 = NIL;
                                                                            SubLObject token_var_9 = NIL;
                                                                            while (NIL == done_var_8) {
                                                                                {
                                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_9);
                                                                                    SubLObject valid_10 = makeBoolean(token_var_9 != assertion);
                                                                                    if (NIL != valid_10) {
                                                                                        com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists.removal_relation_all_exists_check_expand_internal(asent, assertion);
                                                                                    }
                                                                                    done_var_8 = makeBoolean(NIL == valid_10);
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
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
                                    } else {
                                        {
                                            SubLObject pred_var = NIL;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_1, NIL, pred_var)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_1, NIL, pred_var);
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
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                                        {
                                                                            SubLObject done_var_11 = NIL;
                                                                            SubLObject token_var_12 = NIL;
                                                                            while (NIL == done_var_11) {
                                                                                {
                                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_12);
                                                                                    SubLObject valid_13 = makeBoolean(token_var_12 != assertion);
                                                                                    if (NIL != valid_13) {
                                                                                        com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists.removal_relation_all_exists_check_expand_internal(asent, assertion);
                                                                                    }
                                                                                    done_var_11 = makeBoolean(NIL == valid_13);
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
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
                                    }
                                }
                            }
                        } else {
                            if (pcase_var.eql($PREDICATE_EXTENT)) {
                                {
                                    SubLObject pred_var = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                                    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
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
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                                {
                                                                    SubLObject done_var_14 = NIL;
                                                                    SubLObject token_var_15 = NIL;
                                                                    while (NIL == done_var_14) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_15);
                                                                            SubLObject valid_16 = makeBoolean(token_var_15 != assertion);
                                                                            if (NIL != valid_16) {
                                                                                com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists.removal_relation_all_exists_check_expand_internal(asent, assertion);
                                                                            }
                                                                            done_var_14 = makeBoolean(NIL == valid_16);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
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
                            } else {
                                if (pcase_var.eql($OVERLAP)) {
                                    {
                                        SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
                                        SubLObject assertion = NIL;
                                        for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                                            if ((NIL == enumeration_types.sense_truth($POS)) || (NIL != assertions_high.assertion_has_truth(assertion, enumeration_types.sense_truth($POS)))) {
                                                com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists.removal_relation_all_exists_check_expand_internal(asent, assertion);
                                            }
                                        }
                                    }
                                } else {
                                    kb_mapping_macros.do_gli_method_error(l_index, method);
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_relation_all_exists_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject functor = unmake_quaternary_formula(arg2);
        final SubLObject v_term = thread.secondMultipleValue();
        final SubLObject pred = thread.thirdMultipleValue();
        final SubLObject indep_col = thread.fourthMultipleValue();
        final SubLObject dep_col = thread.fifthMultipleValue();
        thread.resetMultipleValues();
        final SubLObject rae_sentence = list_to_elf(list($$relationAllExists, pred, indep_col, dep_col));
        final SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(rae_sentence, $POS);
        final SubLObject pcase_var;
        final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
        if (pcase_var.eql($GAF_ARG)) {
            thread.resetMultipleValues();
            final SubLObject v_term_$1 = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
            final SubLObject argnum = thread.secondMultipleValue();
            final SubLObject predicate = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL != argnum) {
                if (NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$1, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$1, argnum, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                    SubLObject done_var_$2 = NIL;
                                    final SubLObject token_var_$3 = NIL;
                                    while (NIL == done_var_$2) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$3);
                                        final SubLObject valid_$4 = makeBoolean(!token_var_$3.eql(assertion));
                                        if (NIL != valid_$4) {
                                            removal_relation_all_exists_check_expand_internal(asent, assertion);
                                        }
                                        done_var_$2 = makeBoolean(NIL == valid_$4);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                } else {
                    final SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$1, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$1, argnum, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                    SubLObject done_var_$3 = NIL;
                                    final SubLObject token_var_$4 = NIL;
                                    while (NIL == done_var_$3) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                                        final SubLObject valid_$5 = makeBoolean(!token_var_$4.eql(assertion));
                                        if (NIL != valid_$5) {
                                            removal_relation_all_exists_check_expand_internal(asent, assertion);
                                        }
                                        done_var_$3 = makeBoolean(NIL == valid_$5);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                }
            } else
                if (NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$1, NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$1, NIL, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                    SubLObject done_var_$4 = NIL;
                                    final SubLObject token_var_$5 = NIL;
                                    while (NIL == done_var_$4) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                        final SubLObject valid_$6 = makeBoolean(!token_var_$5.eql(assertion));
                                        if (NIL != valid_$6) {
                                            removal_relation_all_exists_check_expand_internal(asent, assertion);
                                        }
                                        done_var_$4 = makeBoolean(NIL == valid_$6);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values3 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values3);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                } else {
                    final SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$1, NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$1, NIL, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                    SubLObject done_var_$5 = NIL;
                                    final SubLObject token_var_$6 = NIL;
                                    while (NIL == done_var_$5) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$6);
                                        final SubLObject valid_$7 = makeBoolean(!token_var_$6.eql(assertion));
                                        if (NIL != valid_$7) {
                                            removal_relation_all_exists_check_expand_internal(asent, assertion);
                                        }
                                        done_var_$5 = makeBoolean(NIL == valid_$7);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values4 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values4);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                }

        } else
            if (pcase_var.eql($PREDICATE_EXTENT)) {
                final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                    final SubLObject str = NIL;
                    final SubLObject _prev_bind_5 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = $progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = $progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = $is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_12 = $silent_progressP$.currentBinding(thread);
                    try {
                        $progress_start_time$.bind(get_universal_time(), thread);
                        $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                        $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        $progress_notification_count$.bind(ZERO_INTEGER, thread);
                        $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                        $progress_count$.bind(ZERO_INTEGER, thread);
                        $is_noting_progressP$.bind(T, thread);
                        $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                        noting_progress_preamble(str);
                        final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                        SubLObject done_var2 = NIL;
                        final SubLObject token_var2 = NIL;
                        while (NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                            if (NIL != valid2) {
                                note_progress();
                                SubLObject final_index_iterator2 = NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, enumeration_types.sense_truth($POS), NIL);
                                    SubLObject done_var_$6 = NIL;
                                    final SubLObject token_var_$7 = NIL;
                                    while (NIL == done_var_$6) {
                                        final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$7);
                                        final SubLObject valid_$8 = makeBoolean(!token_var_$7.eql(assertion2));
                                        if (NIL != valid_$8) {
                                            removal_relation_all_exists_check_expand_internal(asent, assertion2);
                                        }
                                        done_var_$6 = makeBoolean(NIL == valid_$8);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$17 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values5 = getValuesAsVector();
                                        if (NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        restoreValuesFromVector(_values5);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                                    }
                                }
                            }
                            done_var2 = makeBoolean(NIL == valid2);
                        } 
                        noting_progress_postamble();
                    } finally {
                        $silent_progressP$.rebind(_prev_bind_12, thread);
                        $is_noting_progressP$.rebind(_prev_bind_11, thread);
                        $progress_count$.rebind(_prev_bind_10, thread);
                        $progress_pacifications_since_last_nl$.rebind(_prev_bind_9, thread);
                        $progress_notification_count$.rebind(_prev_bind_8, thread);
                        $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_7, thread);
                        $progress_last_pacification_time$.rebind(_prev_bind_6, thread);
                        $progress_start_time$.rebind(_prev_bind_5, thread);
                    }
                }
            } else
                if (pcase_var.eql($OVERLAP)) {
                    SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
                    SubLObject assertion3 = NIL;
                    assertion3 = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if ((NIL == enumeration_types.sense_truth($POS)) || (NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth($POS)))) {
                            removal_relation_all_exists_check_expand_internal(asent, assertion3);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        assertion3 = cdolist_list_var.first();
                    } 
                } else {
                    kb_mapping_macros.do_gli_method_error(l_index, method);
                }


        return NIL;
    }

    public static final SubLObject removal_relation_all_exists_check_expand_internal_alt(SubLObject asent, SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                {
                    SubLObject gaf_formula = assertions_high.gaf_formula(assertion);
                    if (NIL != formula_arityE(gaf_formula, THREE_INTEGER, UNPROVIDED)) {
                        {
                            SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                            thread.resetMultipleValues();
                            {
                                SubLObject functor = unmake_quaternary_formula(arg2);
                                SubLObject v_term = thread.secondMultipleValue();
                                SubLObject pred = thread.thirdMultipleValue();
                                SubLObject indep_col = thread.fourthMultipleValue();
                                SubLObject dep_col = thread.fifthMultipleValue();
                                thread.resetMultipleValues();
                                thread.resetMultipleValues();
                                {
                                    SubLObject relation_all_exists = unmake_ternary_formula(assertions_high.gaf_formula(assertion));
                                    SubLObject gaf_pred = thread.secondMultipleValue();
                                    SubLObject gaf_indep_col = thread.thirdMultipleValue();
                                    SubLObject gaf_dep_col = thread.fourthMultipleValue();
                                    thread.resetMultipleValues();
                                    if ((((pred == gaf_pred) && indep_col.equal(gaf_indep_col)) && dep_col.equal(gaf_dep_col)) && (NIL != isa.isaP(v_term, indep_col, NIL, UNPROVIDED))) {
                                        {
                                            SubLObject rule_support = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists.make_relation_all_exists_support();
                                            SubLObject isa_support = arguments.make_hl_support($ISA, list($$isa, v_term, indep_col), UNPROVIDED, UNPROVIDED);
                                            SubLObject more_supports = list(rule_support, isa_support);
                                            backward.removal_add_node(assertion, NIL, more_supports);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_relation_all_exists_check_expand_internal(final SubLObject asent, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != backward_utilities.direction_is_relevant(assertion)) {
            final SubLObject gaf_formula = assertions_high.gaf_formula(assertion);
            if (NIL != formula_arityE(gaf_formula, THREE_INTEGER, UNPROVIDED)) {
                final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                thread.resetMultipleValues();
                final SubLObject functor = unmake_quaternary_formula(arg2);
                final SubLObject v_term = thread.secondMultipleValue();
                final SubLObject pred = thread.thirdMultipleValue();
                final SubLObject indep_col = thread.fourthMultipleValue();
                final SubLObject dep_col = thread.fifthMultipleValue();
                thread.resetMultipleValues();
                thread.resetMultipleValues();
                final SubLObject relation_all_exists = unmake_ternary_formula(assertions_high.gaf_formula(assertion));
                final SubLObject gaf_pred = thread.secondMultipleValue();
                final SubLObject gaf_indep_col = thread.thirdMultipleValue();
                final SubLObject gaf_dep_col = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                if (((pred.eql(gaf_pred) && indep_col.equal(gaf_indep_col)) && dep_col.equal(gaf_dep_col)) && (NIL != isa.isaP(v_term, indep_col, NIL, UNPROVIDED))) {
                    final SubLObject rule_support = make_relation_all_exists_support();
                    final SubLObject isa_support = arguments.make_hl_support($ISA, list($$isa, v_term, indep_col), UNPROVIDED, UNPROVIDED);
                    final SubLObject more_supports = list(rule_support, isa_support);
                    backward.removal_add_node(assertion, NIL, more_supports);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject removal_relation_all_exists_unify_required_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists.removal_relation_all_exists_required(asent, T)) {
            {
                SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists.sbhl_isa_source_object_p(arg1);
            }
        }
        return NIL;
    }

    public static SubLObject removal_relation_all_exists_unify_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != removal_relation_all_exists_required(asent, T)) {
            final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            return sbhl_isa_source_object_p(arg1);
        }
        return NIL;
    }

    public static final SubLObject removal_relation_all_exists_unify_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
            SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject predicate_cost_estimate = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists.relation_all_exists_predicate_cost_estimate(predicate);
            SubLObject collection_cost_estimate = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists.relation_all_exists_collection_cost_estimate(v_term);
            return max($minimum_relation_all_exists_unify_cost$.getGlobalValue(), min(predicate_cost_estimate, collection_cost_estimate));
        }
    }

    public static SubLObject removal_relation_all_exists_unify_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject predicate_cost_estimate = relation_all_exists_predicate_cost_estimate(predicate);
        final SubLObject adjusted_predicate_cost_estimate = round(sqrt(predicate_cost_estimate), UNPROVIDED);
        return max($minimum_relation_all_exists_unify_cost$.getGlobalValue(), adjusted_predicate_cost_estimate);
    }

    public static final SubLObject removal_relation_all_exists_unify_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
            SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject predicate_cost_estimate = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists.relation_all_exists_predicate_cost_estimate(predicate);
            SubLObject collection_cost_estimate = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists.relation_all_exists_collection_cost_estimate(v_term);
            if (predicate_cost_estimate.numLE(collection_cost_estimate)) {
                {
                    SubLObject pred_var = $$relationAllExists;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(predicate, ONE_INTEGER, pred_var)) {
                        {
                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(predicate, ONE_INTEGER, pred_var);
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
                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                {
                                                    SubLObject done_var_17 = NIL;
                                                    SubLObject token_var_18 = NIL;
                                                    while (NIL == done_var_17) {
                                                        {
                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_18);
                                                            SubLObject valid_19 = makeBoolean(token_var_18 != assertion);
                                                            if (NIL != valid_19) {
                                                                com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists.removal_relation_all_exists_unify_via_predicate_expand(asent, assertion);
                                                            }
                                                            done_var_17 = makeBoolean(NIL == valid_19);
                                                        }
                                                    } 
                                                }
                                            } finally {
                                                {
                                                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                                    try {
                                                        bind($is_thread_performing_cleanupP$, T);
                                                        if (NIL != final_index_iterator) {
                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                        }
                                                    } finally {
                                                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
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
            } else {
                {
                    SubLObject all_isa = isa.all_isa(v_term, NIL, UNPROVIDED);
                    SubLObject cdolist_list_var = all_isa;
                    SubLObject collection = NIL;
                    for (collection = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collection = cdolist_list_var.first()) {
                        if (NIL != com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists.removal_some_relation_all_exists_for_collection(collection, NIL)) {
                            {
                                SubLObject pred_var = $$relationAllExists;
                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(collection, TWO_INTEGER, pred_var)) {
                                    {
                                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(collection, TWO_INTEGER, pred_var);
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
                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                            {
                                                                SubLObject done_var_20 = NIL;
                                                                SubLObject token_var_21 = NIL;
                                                                while (NIL == done_var_20) {
                                                                    {
                                                                        SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_21);
                                                                        SubLObject valid_22 = makeBoolean(token_var_21 != assertion);
                                                                        if (NIL != valid_22) {
                                                                            com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists.removal_relation_all_exists_unify_via_collection_expand(asent, assertion);
                                                                        }
                                                                        done_var_20 = makeBoolean(NIL == valid_22);
                                                                    }
                                                                } 
                                                            }
                                                        } finally {
                                                            {
                                                                SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                                                try {
                                                                    bind($is_thread_performing_cleanupP$, T);
                                                                    if (NIL != final_index_iterator) {
                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                    }
                                                                } finally {
                                                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
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
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject removal_relation_all_exists_unify_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject predicate_cost_estimate = relation_all_exists_predicate_cost_estimate(predicate);
        final SubLObject collection_cost_estimate = relation_all_exists_collection_cost_estimate(v_term);
        if (predicate_cost_estimate.numLE(collection_cost_estimate)) {
            final SubLObject pred_var = $$relationAllExists;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(predicate, ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(predicate, ONE_INTEGER, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$18 = NIL;
                            final SubLObject token_var_$19 = NIL;
                            while (NIL == done_var_$18) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$19);
                                final SubLObject valid_$20 = makeBoolean(!token_var_$19.eql(assertion));
                                if (NIL != valid_$20) {
                                    removal_relation_all_exists_unify_via_predicate_expand(asent, assertion);
                                }
                                done_var_$18 = makeBoolean(NIL == valid_$20);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } else {
            SubLObject cdolist_list_var;
            final SubLObject all_isa = cdolist_list_var = isa.all_isa(v_term, NIL, UNPROVIDED);
            SubLObject collection = NIL;
            collection = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != removal_some_relation_all_exists_for_collection(collection, NIL)) {
                    final SubLObject pred_var2 = $$relationAllExists;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(collection, TWO_INTEGER, pred_var2)) {
                        final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(collection, TWO_INTEGER, pred_var2);
                        SubLObject done_var2 = NIL;
                        final SubLObject token_var2 = NIL;
                        while (NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                            if (NIL != valid2) {
                                SubLObject final_index_iterator2 = NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$19 = NIL;
                                    final SubLObject token_var_$20 = NIL;
                                    while (NIL == done_var_$19) {
                                        final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$20);
                                        final SubLObject valid_$21 = makeBoolean(!token_var_$20.eql(assertion2));
                                        if (NIL != valid_$21) {
                                            removal_relation_all_exists_unify_via_collection_expand(asent, assertion2);
                                        }
                                        done_var_$19 = makeBoolean(NIL == valid_$21);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_2 = currentBinding($is_thread_performing_cleanupP$);
                                    try {
                                        bind($is_thread_performing_cleanupP$, T);
                                        final SubLObject _values2 = getValuesAsVector();
                                        if (NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        rebind($is_thread_performing_cleanupP$, _prev_bind_2);
                                    }
                                }
                            }
                            done_var2 = makeBoolean(NIL == valid2);
                        } 
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collection = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static final SubLObject removal_relation_all_exists_unify_via_predicate_expand_alt(SubLObject asent, SubLObject assertion) {
        {
            SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject collection = assertions_high.gaf_arg2(assertion);
            if (NIL == isa.isaP(arg1, collection, NIL, UNPROVIDED)) {
                return NIL;
            }
            return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists.removal_relation_all_exists_unify_expand_guts(asent, assertion);
        }
    }

    public static SubLObject removal_relation_all_exists_unify_via_predicate_expand(final SubLObject asent, final SubLObject assertion) {
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject collection = assertions_high.gaf_arg2(assertion);
        if (NIL == isa.isaP(arg1, collection, NIL, UNPROVIDED)) {
            return NIL;
        }
        return removal_relation_all_exists_unify_expand_guts(asent, assertion);
    }

    public static final SubLObject removal_relation_all_exists_unify_via_collection_expand_alt(SubLObject asent, SubLObject assertion) {
        {
            SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
            if (predicate != assertions_high.gaf_arg1(assertion)) {
                return NIL;
            }
            return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists.removal_relation_all_exists_unify_expand_guts(asent, assertion);
        }
    }

    public static SubLObject removal_relation_all_exists_unify_via_collection_expand(final SubLObject asent, final SubLObject assertion) {
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        if (!predicate.eql(assertions_high.gaf_arg1(assertion))) {
            return NIL;
        }
        return removal_relation_all_exists_unify_expand_guts(asent, assertion);
    }

    public static final SubLObject removal_relation_all_exists_unify_expand_guts_alt(SubLObject asent, SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                {
                    SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
                    SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                    SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                    SubLObject indep_col = assertions_high.gaf_arg2(assertion);
                    SubLObject dep_col = assertions_high.gaf_arg3(assertion);
                    SubLObject exists_term = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists.make_relation_all_exists_term(v_term, predicate, indep_col, dep_col);
                    if (NIL != function_terms.within_term_functional_complexity_cutoffP(exists_term)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject v_bindings = unification_utilities.term_unify(arg2, exists_term, T, T);
                            SubLObject unify_justification = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != v_bindings) {
                                {
                                    SubLObject rule_support = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists.make_relation_all_exists_support();
                                    SubLObject isa_support = arguments.make_hl_support($ISA, list($$isa, v_term, indep_col), UNPROVIDED, UNPROVIDED);
                                    SubLObject more_supports = append(list(rule_support, isa_support), unify_justification);
                                    backward.removal_add_node(assertion, v_bindings, more_supports);
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_relation_all_exists_unify_expand_guts(final SubLObject asent, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != backward_utilities.direction_is_relevant(assertion)) {
            final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
            final SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            final SubLObject indep_col = assertions_high.gaf_arg2(assertion);
            final SubLObject dep_col = assertions_high.gaf_arg3(assertion);
            final SubLObject exists_term = make_relation_all_exists_term(v_term, predicate, indep_col, dep_col);
            if (NIL != function_terms.within_term_functional_complexity_cutoffP(exists_term)) {
                thread.resetMultipleValues();
                final SubLObject v_bindings = unification_utilities.term_unify(arg2, exists_term, T, T);
                final SubLObject unify_justification = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != v_bindings) {
                    final SubLObject rule_support = make_relation_all_exists_support();
                    final SubLObject isa_support = arguments.make_hl_support($ISA, list($$isa, v_term, indep_col), UNPROVIDED, UNPROVIDED);
                    final SubLObject more_supports = append(list(rule_support, isa_support), unify_justification);
                    backward.removal_add_node(assertion, v_bindings, more_supports);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject relation_exists_all_pos_preference_alt(SubLObject asent, SubLObject bindable_vars, SubLObject strategic_context) {
        if (NIL == removal_module_utilities.current_query_allows_new_termsP()) {
            return NIL;
        } else {
            if (NIL == com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists.removal_relation_exists_all_required(asent, T)) {
                return NIL;
            } else {
                if (NIL != formula_pattern_match.formula_matches_pattern(asent, $list_alt2)) {
                    return $PREFERRED;
                } else {
                    if (NIL != formula_pattern_match.formula_matches_pattern(asent, $list_alt40)) {
                        return $DISPREFERRED;
                    } else {
                        if (NIL != formula_pattern_match.formula_matches_pattern(asent, $list_alt7)) {
                            return $PREFERRED;
                        } else {
                            if (NIL != formula_pattern_match.formula_matches_pattern(asent, $list_alt6)) {
                                return $PREFERRED;
                            } else {
                                if (NIL != formula_pattern_match.formula_matches_pattern(asent, $list_alt8)) {
                                    return $DISPREFERRED;
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject relation_exists_all_pos_preference(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context) {
        if (NIL == removal_module_utilities.current_query_allows_new_termsP()) {
            return NIL;
        }
        if (NIL == removal_relation_exists_all_required(asent, T)) {
            return NIL;
        }
        if (NIL != formula_pattern_match.formula_matches_pattern(asent, $list2)) {
            return $PREFERRED;
        }
        if (NIL != formula_pattern_match.formula_matches_pattern(asent, $list41)) {
            return $DISPREFERRED;
        }
        if (NIL != formula_pattern_match.formula_matches_pattern(asent, $list7)) {
            return $PREFERRED;
        }
        if (NIL != formula_pattern_match.formula_matches_pattern(asent, $list6)) {
            return $PREFERRED;
        }
        if (NIL != formula_pattern_match.formula_matches_pattern(asent, $list8)) {
            return $DISPREFERRED;
        }
        return NIL;
    }

    public static final SubLObject removal_some_relation_exists_all_for_predicate_alt(SubLObject predicate, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(predicate)) {
            return kb_mapping_utilities.some_pred_value_in_relevant_mts(predicate, $$relationExistsAll, mt, ONE_INTEGER, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject removal_some_relation_exists_all_for_predicate(final SubLObject predicate, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(predicate)) {
            return kb_mapping_utilities.some_pred_value_in_relevant_mts(predicate, $$relationExistsAll, mt, ONE_INTEGER, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject removal_some_relation_exists_all_for_collection_alt(SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(collection)) {
            return kb_mapping_utilities.some_pred_value_in_relevant_mts(collection, $$relationExistsAll, mt, THREE_INTEGER, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject removal_some_relation_exists_all_for_collection(final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(collection)) {
            return kb_mapping_utilities.some_pred_value_in_relevant_mts(collection, $$relationExistsAll, mt, THREE_INTEGER, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject relation_exists_all_predicate_cost_estimate_alt(SubLObject predicate) {
        return kb_indexing.relevant_num_gaf_arg_index(predicate, ONE_INTEGER, $$relationExistsAll);
    }

    public static SubLObject relation_exists_all_predicate_cost_estimate(final SubLObject predicate) {
        return kb_indexing.relevant_num_gaf_arg_index(predicate, ONE_INTEGER, $$relationExistsAll);
    }

    public static final SubLObject relation_exists_all_collection_cost_estimate_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return multiply($estimated_per_collection_relation_exists_all_count$.getGlobalValue(), $average_all_isa_count$.getDynamicValue(thread));
        }
    }

    public static SubLObject relation_exists_all_collection_cost_estimate(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return multiply($estimated_per_collection_relation_exists_all_count$.getGlobalValue(), $average_all_isa_count$.getDynamicValue(thread));
    }

    public static final SubLObject removal_relation_exists_all_required_alt(SubLObject asent, SubLObject require_new_terms_allowedP) {
        if ((NIL != require_new_terms_allowedP) && (NIL == removal_module_utilities.current_query_allows_new_termsP())) {
            return NIL;
        }
        {
            SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
            return makeBoolean(((($$isa == predicate) || (NIL == hl_supports.hl_predicate_p(predicate))) && ((NIL == require_new_terms_allowedP) || (NIL != removal_modules_termofunit.skolemization_allowed($$RelationExistsAllFn)))) && (NIL != com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists.removal_some_relation_exists_all_for_predicate(predicate, NIL)));
        }
    }

    public static SubLObject removal_relation_exists_all_required(final SubLObject asent, final SubLObject require_new_terms_allowedP) {
        if ((NIL != require_new_terms_allowedP) && (NIL == removal_module_utilities.current_query_allows_new_termsP())) {
            return NIL;
        }
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        return makeBoolean((($$isa.eql(predicate) || (NIL == hl_supports.hl_predicate_p(predicate))) && ((NIL == require_new_terms_allowedP) || (NIL != removal_modules_termofunit.skolemization_allowed($$RelationExistsAllFn)))) && (NIL != removal_some_relation_exists_all_for_predicate(predicate, NIL)));
    }

    public static final SubLObject make_relation_exists_all_support_alt() {
        return arguments.make_hl_support($CODE, $relation_exists_all_rule$.getGlobalValue(), $relation_exists_all_defining_mt$.getGlobalValue(), $TRUE_MON);
    }

    public static SubLObject make_relation_exists_all_support() {
        return arguments.make_hl_support($CODE, $relation_exists_all_rule$.getGlobalValue(), $relation_exists_all_defining_mt$.getGlobalValue(), $TRUE_MON);
    }

    public static final SubLObject make_relation_exists_all_term_alt(SubLObject v_object, SubLObject predicate, SubLObject dep_col, SubLObject indep_col) {
        return list_to_elf(list($$RelationExistsAllFn, v_object, predicate, dep_col, indep_col));
    }

    public static SubLObject make_relation_exists_all_term(final SubLObject v_object, final SubLObject predicate, final SubLObject dep_col, final SubLObject indep_col) {
        return list_to_elf(list($$RelationExistsAllFn, v_object, predicate, dep_col, indep_col));
    }

    public static final SubLObject removal_relation_exists_all_prune_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != formula_pattern_match.pattern_matches_formula($list_alt47, asent)) {
                {
                    SubLObject pattern = $list_alt48;
                    thread.resetMultipleValues();
                    {
                        SubLObject success = formula_pattern_match.formula_matches_pattern(asent, pattern);
                        SubLObject v_bindings = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != success) {
                            {
                                SubLObject dep_col = list_utilities.alist_lookup_without_values(v_bindings, DEP_COL, UNPROVIDED, UNPROVIDED);
                                SubLObject ind_col = list_utilities.alist_lookup_without_values(v_bindings, IND_COL, UNPROVIDED, UNPROVIDED);
                                SubLObject rea_pred = list_utilities.alist_lookup_without_values(v_bindings, REA_PRED, UNPROVIDED, UNPROVIDED);
                                SubLObject rea_term = list_utilities.alist_lookup_without_values(v_bindings, REA_TERM, UNPROVIDED, UNPROVIDED);
                                SubLObject v_term = list_utilities.alist_lookup_without_values(v_bindings, TERM, UNPROVIDED, UNPROVIDED);
                                SubLObject predicate = list_utilities.alist_lookup_without_values(v_bindings, PREDICATE, UNPROVIDED, UNPROVIDED);
                                if (rea_pred != predicate) {
                                    return T;
                                }
                                if (NIL == unification.unify_possible(rea_term, v_term)) {
                                    return T;
                                }
                            }
                        }
                    }
                }
            } else {
                return T;
            }
            return NIL;
        }
    }

    public static SubLObject removal_relation_exists_all_prune(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != formula_pattern_match.pattern_matches_formula($list48, asent)) {
            final SubLObject pattern = $list49;
            thread.resetMultipleValues();
            final SubLObject success = formula_pattern_match.formula_matches_pattern(asent, pattern);
            final SubLObject v_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != success) {
                final SubLObject dep_col = list_utilities.alist_lookup_without_values(v_bindings, DEP_COL, UNPROVIDED, UNPROVIDED);
                final SubLObject ind_col = list_utilities.alist_lookup_without_values(v_bindings, IND_COL, UNPROVIDED, UNPROVIDED);
                final SubLObject rea_pred = list_utilities.alist_lookup_without_values(v_bindings, REA_PRED, UNPROVIDED, UNPROVIDED);
                final SubLObject rea_term = list_utilities.alist_lookup_without_values(v_bindings, REA_TERM, UNPROVIDED, UNPROVIDED);
                final SubLObject v_term = list_utilities.alist_lookup_without_values(v_bindings, TERM, UNPROVIDED, UNPROVIDED);
                final SubLObject predicate = list_utilities.alist_lookup_without_values(v_bindings, PREDICATE, UNPROVIDED, UNPROVIDED);
                if (!rea_pred.eql(predicate)) {
                    return T;
                }
                if (NIL == unification.unify_possible(rea_term, v_term)) {
                    return T;
                }
            }
            return NIL;
        }
        if (NIL != formula_pattern_match.pattern_matches_formula($list52, asent)) {
            return NIL;
        }
        return T;
    }

    public static final SubLObject removal_relation_exists_all_check_required_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists.removal_relation_exists_all_required(asent, NIL)) {
                {
                    SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                    if (NIL != com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists.sbhl_isa_source_object_p(arg2)) {
                        {
                            SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                            thread.resetMultipleValues();
                            {
                                SubLObject functor = unmake_quaternary_formula(arg1);
                                SubLObject v_term = thread.secondMultipleValue();
                                SubLObject pred = thread.thirdMultipleValue();
                                SubLObject dep_col = thread.fourthMultipleValue();
                                SubLObject indep_col = thread.fifthMultipleValue();
                                thread.resetMultipleValues();
                                return makeBoolean((pred == cycl_utilities.atomic_sentence_predicate(asent)) && arg2.equal(v_term));
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_relation_exists_all_check_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != removal_relation_exists_all_required(asent, NIL)) {
            final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            if (NIL != sbhl_isa_source_object_p(arg2)) {
                final SubLObject arg3 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                thread.resetMultipleValues();
                final SubLObject functor = unmake_quaternary_formula(arg3);
                final SubLObject v_term = thread.secondMultipleValue();
                final SubLObject pred = thread.thirdMultipleValue();
                final SubLObject dep_col = thread.fourthMultipleValue();
                final SubLObject indep_col = thread.fifthMultipleValue();
                thread.resetMultipleValues();
                return makeBoolean(pred.eql(cycl_utilities.atomic_sentence_predicate(asent)) && arg2.equal(v_term));
            }
        }
        return NIL;
    }

    public static final SubLObject removal_relation_exists_all_check_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                thread.resetMultipleValues();
                {
                    SubLObject functor = unmake_quaternary_formula(arg1);
                    SubLObject v_term = thread.secondMultipleValue();
                    SubLObject pred = thread.thirdMultipleValue();
                    SubLObject dep_col = thread.fourthMultipleValue();
                    SubLObject indep_col = thread.fifthMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject rea_sentence = list_to_elf(list($$relationExistsAll, pred, dep_col, indep_col));
                        SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(rea_sentence, $POS);
                        SubLObject method = kb_mapping_macros.do_gli_extract_method(l_index);
                        SubLObject pcase_var = method;
                        if (pcase_var.eql($GAF_ARG)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject v_term_23 = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                                SubLObject argnum = thread.secondMultipleValue();
                                SubLObject predicate = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != argnum) {
                                    if (NIL != predicate) {
                                        {
                                            SubLObject pred_var = predicate;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_23, argnum, pred_var)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_23, argnum, pred_var);
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
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                                        {
                                                                            SubLObject done_var_24 = NIL;
                                                                            SubLObject token_var_25 = NIL;
                                                                            while (NIL == done_var_24) {
                                                                                {
                                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_25);
                                                                                    SubLObject valid_26 = makeBoolean(token_var_25 != assertion);
                                                                                    if (NIL != valid_26) {
                                                                                        com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists.removal_relation_exists_all_check_expand_internal(asent, assertion);
                                                                                    }
                                                                                    done_var_24 = makeBoolean(NIL == valid_26);
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
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
                                    } else {
                                        {
                                            SubLObject pred_var = NIL;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_23, argnum, pred_var)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_23, argnum, pred_var);
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
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                                        {
                                                                            SubLObject done_var_27 = NIL;
                                                                            SubLObject token_var_28 = NIL;
                                                                            while (NIL == done_var_27) {
                                                                                {
                                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_28);
                                                                                    SubLObject valid_29 = makeBoolean(token_var_28 != assertion);
                                                                                    if (NIL != valid_29) {
                                                                                        com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists.removal_relation_exists_all_check_expand_internal(asent, assertion);
                                                                                    }
                                                                                    done_var_27 = makeBoolean(NIL == valid_29);
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
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
                                    }
                                } else {
                                    if (NIL != predicate) {
                                        {
                                            SubLObject pred_var = predicate;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_23, NIL, pred_var)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_23, NIL, pred_var);
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
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                                        {
                                                                            SubLObject done_var_30 = NIL;
                                                                            SubLObject token_var_31 = NIL;
                                                                            while (NIL == done_var_30) {
                                                                                {
                                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_31);
                                                                                    SubLObject valid_32 = makeBoolean(token_var_31 != assertion);
                                                                                    if (NIL != valid_32) {
                                                                                        com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists.removal_relation_exists_all_check_expand_internal(asent, assertion);
                                                                                    }
                                                                                    done_var_30 = makeBoolean(NIL == valid_32);
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
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
                                    } else {
                                        {
                                            SubLObject pred_var = NIL;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_23, NIL, pred_var)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_23, NIL, pred_var);
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
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                                        {
                                                                            SubLObject done_var_33 = NIL;
                                                                            SubLObject token_var_34 = NIL;
                                                                            while (NIL == done_var_33) {
                                                                                {
                                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_34);
                                                                                    SubLObject valid_35 = makeBoolean(token_var_34 != assertion);
                                                                                    if (NIL != valid_35) {
                                                                                        com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists.removal_relation_exists_all_check_expand_internal(asent, assertion);
                                                                                    }
                                                                                    done_var_33 = makeBoolean(NIL == valid_35);
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
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
                                    }
                                }
                            }
                        } else {
                            if (pcase_var.eql($PREDICATE_EXTENT)) {
                                {
                                    SubLObject pred_var = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                                    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
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
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                                {
                                                                    SubLObject done_var_36 = NIL;
                                                                    SubLObject token_var_37 = NIL;
                                                                    while (NIL == done_var_36) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_37);
                                                                            SubLObject valid_38 = makeBoolean(token_var_37 != assertion);
                                                                            if (NIL != valid_38) {
                                                                                com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists.removal_relation_exists_all_check_expand_internal(asent, assertion);
                                                                            }
                                                                            done_var_36 = makeBoolean(NIL == valid_38);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
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
                            } else {
                                if (pcase_var.eql($OVERLAP)) {
                                    {
                                        SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
                                        SubLObject assertion = NIL;
                                        for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                                            if ((NIL == enumeration_types.sense_truth($POS)) || (NIL != assertions_high.assertion_has_truth(assertion, enumeration_types.sense_truth($POS)))) {
                                                com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists.removal_relation_exists_all_check_expand_internal(asent, assertion);
                                            }
                                        }
                                    }
                                } else {
                                    kb_mapping_macros.do_gli_method_error(l_index, method);
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_relation_exists_all_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject functor = unmake_quaternary_formula(arg1);
        final SubLObject v_term = thread.secondMultipleValue();
        final SubLObject pred = thread.thirdMultipleValue();
        final SubLObject dep_col = thread.fourthMultipleValue();
        final SubLObject indep_col = thread.fifthMultipleValue();
        thread.resetMultipleValues();
        final SubLObject rea_sentence = list_to_elf(list($$relationExistsAll, pred, dep_col, indep_col));
        final SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(rea_sentence, $POS);
        final SubLObject pcase_var;
        final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
        if (pcase_var.eql($GAF_ARG)) {
            thread.resetMultipleValues();
            final SubLObject v_term_$24 = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
            final SubLObject argnum = thread.secondMultipleValue();
            final SubLObject predicate = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL != argnum) {
                if (NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$24, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$24, argnum, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                    SubLObject done_var_$25 = NIL;
                                    final SubLObject token_var_$26 = NIL;
                                    while (NIL == done_var_$25) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$26);
                                        final SubLObject valid_$27 = makeBoolean(!token_var_$26.eql(assertion));
                                        if (NIL != valid_$27) {
                                            removal_relation_exists_all_check_expand_internal(asent, assertion);
                                        }
                                        done_var_$25 = makeBoolean(NIL == valid_$27);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                } else {
                    final SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$24, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$24, argnum, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                    SubLObject done_var_$26 = NIL;
                                    final SubLObject token_var_$27 = NIL;
                                    while (NIL == done_var_$26) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$27);
                                        final SubLObject valid_$28 = makeBoolean(!token_var_$27.eql(assertion));
                                        if (NIL != valid_$28) {
                                            removal_relation_exists_all_check_expand_internal(asent, assertion);
                                        }
                                        done_var_$26 = makeBoolean(NIL == valid_$28);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                }
            } else
                if (NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$24, NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$24, NIL, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                    SubLObject done_var_$27 = NIL;
                                    final SubLObject token_var_$28 = NIL;
                                    while (NIL == done_var_$27) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$28);
                                        final SubLObject valid_$29 = makeBoolean(!token_var_$28.eql(assertion));
                                        if (NIL != valid_$29) {
                                            removal_relation_exists_all_check_expand_internal(asent, assertion);
                                        }
                                        done_var_$27 = makeBoolean(NIL == valid_$29);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values3 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values3);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                } else {
                    final SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$24, NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$24, NIL, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                    SubLObject done_var_$28 = NIL;
                                    final SubLObject token_var_$29 = NIL;
                                    while (NIL == done_var_$28) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$29);
                                        final SubLObject valid_$30 = makeBoolean(!token_var_$29.eql(assertion));
                                        if (NIL != valid_$30) {
                                            removal_relation_exists_all_check_expand_internal(asent, assertion);
                                        }
                                        done_var_$28 = makeBoolean(NIL == valid_$30);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values4 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values4);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                }

        } else
            if (pcase_var.eql($PREDICATE_EXTENT)) {
                final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                    final SubLObject str = NIL;
                    final SubLObject _prev_bind_5 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = $progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = $progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = $is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_12 = $silent_progressP$.currentBinding(thread);
                    try {
                        $progress_start_time$.bind(get_universal_time(), thread);
                        $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                        $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        $progress_notification_count$.bind(ZERO_INTEGER, thread);
                        $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                        $progress_count$.bind(ZERO_INTEGER, thread);
                        $is_noting_progressP$.bind(T, thread);
                        $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                        noting_progress_preamble(str);
                        final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                        SubLObject done_var2 = NIL;
                        final SubLObject token_var2 = NIL;
                        while (NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                            if (NIL != valid2) {
                                note_progress();
                                SubLObject final_index_iterator2 = NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, enumeration_types.sense_truth($POS), NIL);
                                    SubLObject done_var_$29 = NIL;
                                    final SubLObject token_var_$30 = NIL;
                                    while (NIL == done_var_$29) {
                                        final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$30);
                                        final SubLObject valid_$31 = makeBoolean(!token_var_$30.eql(assertion2));
                                        if (NIL != valid_$31) {
                                            removal_relation_exists_all_check_expand_internal(asent, assertion2);
                                        }
                                        done_var_$29 = makeBoolean(NIL == valid_$31);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$40 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values5 = getValuesAsVector();
                                        if (NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        restoreValuesFromVector(_values5);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$40, thread);
                                    }
                                }
                            }
                            done_var2 = makeBoolean(NIL == valid2);
                        } 
                        noting_progress_postamble();
                    } finally {
                        $silent_progressP$.rebind(_prev_bind_12, thread);
                        $is_noting_progressP$.rebind(_prev_bind_11, thread);
                        $progress_count$.rebind(_prev_bind_10, thread);
                        $progress_pacifications_since_last_nl$.rebind(_prev_bind_9, thread);
                        $progress_notification_count$.rebind(_prev_bind_8, thread);
                        $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_7, thread);
                        $progress_last_pacification_time$.rebind(_prev_bind_6, thread);
                        $progress_start_time$.rebind(_prev_bind_5, thread);
                    }
                }
            } else
                if (pcase_var.eql($OVERLAP)) {
                    SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
                    SubLObject assertion3 = NIL;
                    assertion3 = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if ((NIL == enumeration_types.sense_truth($POS)) || (NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth($POS)))) {
                            removal_relation_exists_all_check_expand_internal(asent, assertion3);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        assertion3 = cdolist_list_var.first();
                    } 
                } else {
                    kb_mapping_macros.do_gli_method_error(l_index, method);
                }


        return NIL;
    }

    public static final SubLObject removal_relation_exists_all_check_expand_internal_alt(SubLObject asent, SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                {
                    SubLObject gaf_formula = assertions_high.gaf_formula(assertion);
                    if (NIL != formula_arityE(gaf_formula, THREE_INTEGER, UNPROVIDED)) {
                        {
                            SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                            thread.resetMultipleValues();
                            {
                                SubLObject functor = unmake_quaternary_formula(arg1);
                                SubLObject v_term = thread.secondMultipleValue();
                                SubLObject pred = thread.thirdMultipleValue();
                                SubLObject dep_col = thread.fourthMultipleValue();
                                SubLObject indep_col = thread.fifthMultipleValue();
                                thread.resetMultipleValues();
                                thread.resetMultipleValues();
                                {
                                    SubLObject relation_exists_all = unmake_ternary_formula(assertions_high.gaf_formula(assertion));
                                    SubLObject gaf_pred = thread.secondMultipleValue();
                                    SubLObject gaf_dep_col = thread.thirdMultipleValue();
                                    SubLObject gaf_indep_col = thread.fourthMultipleValue();
                                    thread.resetMultipleValues();
                                    if ((((pred == gaf_pred) && indep_col.equal(gaf_indep_col)) && dep_col.equal(gaf_dep_col)) && (NIL != isa.isaP(v_term, indep_col, NIL, UNPROVIDED))) {
                                        {
                                            SubLObject rule_support = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists.make_relation_exists_all_support();
                                            SubLObject isa_support = arguments.make_hl_support($ISA, list($$isa, v_term, indep_col), UNPROVIDED, UNPROVIDED);
                                            SubLObject more_supports = list(rule_support, isa_support);
                                            backward.removal_add_node(assertion, NIL, more_supports);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_relation_exists_all_check_expand_internal(final SubLObject asent, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != backward_utilities.direction_is_relevant(assertion)) {
            final SubLObject gaf_formula = assertions_high.gaf_formula(assertion);
            if (NIL != formula_arityE(gaf_formula, THREE_INTEGER, UNPROVIDED)) {
                final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                thread.resetMultipleValues();
                final SubLObject functor = unmake_quaternary_formula(arg1);
                final SubLObject v_term = thread.secondMultipleValue();
                final SubLObject pred = thread.thirdMultipleValue();
                final SubLObject dep_col = thread.fourthMultipleValue();
                final SubLObject indep_col = thread.fifthMultipleValue();
                thread.resetMultipleValues();
                thread.resetMultipleValues();
                final SubLObject relation_exists_all = unmake_ternary_formula(assertions_high.gaf_formula(assertion));
                final SubLObject gaf_pred = thread.secondMultipleValue();
                final SubLObject gaf_dep_col = thread.thirdMultipleValue();
                final SubLObject gaf_indep_col = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                if (((pred.eql(gaf_pred) && indep_col.equal(gaf_indep_col)) && dep_col.equal(gaf_dep_col)) && (NIL != isa.isaP(v_term, indep_col, NIL, UNPROVIDED))) {
                    final SubLObject rule_support = make_relation_exists_all_support();
                    final SubLObject isa_support = arguments.make_hl_support($ISA, list($$isa, v_term, indep_col), UNPROVIDED, UNPROVIDED);
                    final SubLObject more_supports = list(rule_support, isa_support);
                    backward.removal_add_node(assertion, NIL, more_supports);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject removal_relation_exists_all_unify_required_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists.removal_relation_exists_all_required(asent, T)) {
            {
                SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists.sbhl_isa_source_object_p(arg2);
            }
        }
        return NIL;
    }

    public static SubLObject removal_relation_exists_all_unify_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != removal_relation_exists_all_required(asent, T)) {
            final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            return sbhl_isa_source_object_p(arg2);
        }
        return NIL;
    }

    public static final SubLObject removal_relation_exists_all_unify_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
            SubLObject v_term = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            SubLObject predicate_cost_estimate = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists.relation_exists_all_predicate_cost_estimate(predicate);
            SubLObject collection_cost_estimate = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists.relation_exists_all_collection_cost_estimate(v_term);
            return max($minimum_relation_exists_all_unify_cost$.getGlobalValue(), min(predicate_cost_estimate, collection_cost_estimate));
        }
    }

    public static SubLObject removal_relation_exists_all_unify_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject predicate_cost_estimate = relation_exists_all_predicate_cost_estimate(predicate);
        final SubLObject adjusted_predicate_cost_estimate = round(sqrt(predicate_cost_estimate), UNPROVIDED);
        return max($minimum_relation_exists_all_unify_cost$.getGlobalValue(), adjusted_predicate_cost_estimate);
    }

    public static final SubLObject removal_relation_exists_all_unify_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
            SubLObject v_term = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            SubLObject predicate_cost_estimate = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists.relation_exists_all_predicate_cost_estimate(predicate);
            SubLObject collection_cost_estimate = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists.relation_exists_all_collection_cost_estimate(v_term);
            if (predicate_cost_estimate.numLE(collection_cost_estimate)) {
                {
                    SubLObject pred_var = $$relationExistsAll;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(predicate, ONE_INTEGER, pred_var)) {
                        {
                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(predicate, ONE_INTEGER, pred_var);
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
                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                {
                                                    SubLObject done_var_39 = NIL;
                                                    SubLObject token_var_40 = NIL;
                                                    while (NIL == done_var_39) {
                                                        {
                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_40);
                                                            SubLObject valid_41 = makeBoolean(token_var_40 != assertion);
                                                            if (NIL != valid_41) {
                                                                com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists.removal_relation_exists_all_unify_via_predicate_expand(asent, assertion);
                                                            }
                                                            done_var_39 = makeBoolean(NIL == valid_41);
                                                        }
                                                    } 
                                                }
                                            } finally {
                                                {
                                                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                                    try {
                                                        bind($is_thread_performing_cleanupP$, T);
                                                        if (NIL != final_index_iterator) {
                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                        }
                                                    } finally {
                                                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
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
            } else {
                {
                    SubLObject all_isa = isa.all_isa(v_term, NIL, UNPROVIDED);
                    SubLObject cdolist_list_var = all_isa;
                    SubLObject collection = NIL;
                    for (collection = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collection = cdolist_list_var.first()) {
                        if (NIL != com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists.removal_some_relation_exists_all_for_collection(collection, NIL)) {
                            {
                                SubLObject pred_var = $$relationExistsAll;
                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(collection, THREE_INTEGER, pred_var)) {
                                    {
                                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(collection, THREE_INTEGER, pred_var);
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
                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                            {
                                                                SubLObject done_var_42 = NIL;
                                                                SubLObject token_var_43 = NIL;
                                                                while (NIL == done_var_42) {
                                                                    {
                                                                        SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_43);
                                                                        SubLObject valid_44 = makeBoolean(token_var_43 != assertion);
                                                                        if (NIL != valid_44) {
                                                                            com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists.removal_relation_exists_all_unify_via_collection_expand(asent, assertion);
                                                                        }
                                                                        done_var_42 = makeBoolean(NIL == valid_44);
                                                                    }
                                                                } 
                                                            }
                                                        } finally {
                                                            {
                                                                SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                                                try {
                                                                    bind($is_thread_performing_cleanupP$, T);
                                                                    if (NIL != final_index_iterator) {
                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                    }
                                                                } finally {
                                                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
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
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject removal_relation_exists_all_unify_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject predicate_cost_estimate = relation_exists_all_predicate_cost_estimate(predicate);
        final SubLObject collection_cost_estimate = relation_exists_all_collection_cost_estimate(v_term);
        if (predicate_cost_estimate.numLE(collection_cost_estimate)) {
            final SubLObject pred_var = $$relationExistsAll;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(predicate, ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(predicate, ONE_INTEGER, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$41 = NIL;
                            final SubLObject token_var_$42 = NIL;
                            while (NIL == done_var_$41) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$42);
                                final SubLObject valid_$43 = makeBoolean(!token_var_$42.eql(assertion));
                                if (NIL != valid_$43) {
                                    removal_relation_exists_all_unify_via_predicate_expand(asent, assertion);
                                }
                                done_var_$41 = makeBoolean(NIL == valid_$43);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } else {
            SubLObject cdolist_list_var;
            final SubLObject all_isa = cdolist_list_var = isa.all_isa(v_term, NIL, UNPROVIDED);
            SubLObject collection = NIL;
            collection = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != removal_some_relation_exists_all_for_collection(collection, NIL)) {
                    final SubLObject pred_var2 = $$relationExistsAll;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(collection, THREE_INTEGER, pred_var2)) {
                        final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(collection, THREE_INTEGER, pred_var2);
                        SubLObject done_var2 = NIL;
                        final SubLObject token_var2 = NIL;
                        while (NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                            if (NIL != valid2) {
                                SubLObject final_index_iterator2 = NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$42 = NIL;
                                    final SubLObject token_var_$43 = NIL;
                                    while (NIL == done_var_$42) {
                                        final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$43);
                                        final SubLObject valid_$44 = makeBoolean(!token_var_$43.eql(assertion2));
                                        if (NIL != valid_$44) {
                                            removal_relation_exists_all_unify_via_collection_expand(asent, assertion2);
                                        }
                                        done_var_$42 = makeBoolean(NIL == valid_$44);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_2 = currentBinding($is_thread_performing_cleanupP$);
                                    try {
                                        bind($is_thread_performing_cleanupP$, T);
                                        final SubLObject _values2 = getValuesAsVector();
                                        if (NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        rebind($is_thread_performing_cleanupP$, _prev_bind_2);
                                    }
                                }
                            }
                            done_var2 = makeBoolean(NIL == valid2);
                        } 
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collection = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static final SubLObject removal_relation_exists_all_unify_via_predicate_expand_alt(SubLObject asent, SubLObject assertion) {
        {
            SubLObject v_object = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            SubLObject collection = assertions_high.gaf_arg3(assertion);
            if (NIL == isa.isaP(v_object, collection, NIL, UNPROVIDED)) {
                return NIL;
            }
            return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists.removal_relation_exists_all_unify_expand_guts(asent, assertion);
        }
    }

    public static SubLObject removal_relation_exists_all_unify_via_predicate_expand(final SubLObject asent, final SubLObject assertion) {
        final SubLObject v_object = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject collection = assertions_high.gaf_arg3(assertion);
        if (NIL == isa.isaP(v_object, collection, NIL, UNPROVIDED)) {
            return NIL;
        }
        return removal_relation_exists_all_unify_expand_guts(asent, assertion);
    }

    public static final SubLObject removal_relation_exists_all_unify_via_collection_expand_alt(SubLObject asent, SubLObject assertion) {
        {
            SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
            if (predicate != assertions_high.gaf_arg1(assertion)) {
                return NIL;
            }
            return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists.removal_relation_exists_all_unify_expand_guts(asent, assertion);
        }
    }

    public static SubLObject removal_relation_exists_all_unify_via_collection_expand(final SubLObject asent, final SubLObject assertion) {
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        if (!predicate.eql(assertions_high.gaf_arg1(assertion))) {
            return NIL;
        }
        return removal_relation_exists_all_unify_expand_guts(asent, assertion);
    }

    public static final SubLObject removal_relation_exists_all_unify_expand_guts_alt(SubLObject asent, SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                {
                    SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
                    SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                    SubLObject v_term = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                    SubLObject dep_col = assertions_high.gaf_arg2(assertion);
                    SubLObject indep_col = assertions_high.gaf_arg3(assertion);
                    SubLObject exists_term = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists.make_relation_exists_all_term(v_term, predicate, dep_col, indep_col);
                    if (NIL != function_terms.within_term_functional_complexity_cutoffP(exists_term)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject v_bindings = unification_utilities.term_unify(arg1, exists_term, T, T);
                            SubLObject unify_justification = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != v_bindings) {
                                {
                                    SubLObject rule_support = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists.make_relation_exists_all_support();
                                    SubLObject isa_support = arguments.make_hl_support($ISA, list($$isa, v_term, indep_col), UNPROVIDED, UNPROVIDED);
                                    SubLObject more_supports = append(list(rule_support, isa_support), unify_justification);
                                    backward.removal_add_node(assertion, v_bindings, more_supports);
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_relation_exists_all_unify_expand_guts(final SubLObject asent, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != backward_utilities.direction_is_relevant(assertion)) {
            final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
            final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            final SubLObject v_term = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            final SubLObject dep_col = assertions_high.gaf_arg2(assertion);
            final SubLObject indep_col = assertions_high.gaf_arg3(assertion);
            final SubLObject exists_term = make_relation_exists_all_term(v_term, predicate, dep_col, indep_col);
            if (NIL != function_terms.within_term_functional_complexity_cutoffP(exists_term)) {
                thread.resetMultipleValues();
                final SubLObject v_bindings = unification_utilities.term_unify(arg1, exists_term, T, T);
                final SubLObject unify_justification = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != v_bindings) {
                    final SubLObject rule_support = make_relation_exists_all_support();
                    final SubLObject isa_support = arguments.make_hl_support($ISA, list($$isa, v_term, indep_col), UNPROVIDED, UNPROVIDED);
                    final SubLObject more_supports = append(list(rule_support, isa_support), unify_justification);
                    backward.removal_add_node(assertion, v_bindings, more_supports);
                }
            }
        }
        return NIL;
    }

    public static SubLObject declare_removal_modules_relation_all_exists_file() {
        declareFunction("sbhl_isa_source_object_p", "SBHL-ISA-SOURCE-OBJECT-P", 1, 0, false);
        declareFunction("relation_all_exists_pos_preference", "RELATION-ALL-EXISTS-POS-PREFERENCE", 3, 0, false);
        declareFunction("removal_some_relation_all_exists_for_predicate", "REMOVAL-SOME-RELATION-ALL-EXISTS-FOR-PREDICATE", 1, 1, false);
        declareFunction("removal_some_relation_all_exists_for_collection", "REMOVAL-SOME-RELATION-ALL-EXISTS-FOR-COLLECTION", 1, 1, false);
        declareFunction("relation_all_exists_predicate_cost_estimate", "RELATION-ALL-EXISTS-PREDICATE-COST-ESTIMATE", 1, 0, false);
        declareFunction("relation_all_exists_collection_cost_estimate", "RELATION-ALL-EXISTS-COLLECTION-COST-ESTIMATE", 1, 0, false);
        declareFunction("removal_relation_all_exists_required", "REMOVAL-RELATION-ALL-EXISTS-REQUIRED", 2, 0, false);
        declareFunction("make_relation_all_exists_support", "MAKE-RELATION-ALL-EXISTS-SUPPORT", 0, 0, false);
        declareFunction("make_relation_all_exists_term", "MAKE-RELATION-ALL-EXISTS-TERM", 4, 0, false);
        declareFunction("removal_relation_all_exists_prune", "REMOVAL-RELATION-ALL-EXISTS-PRUNE", 1, 1, false);
        declareFunction("removal_relation_all_exists_check_required", "REMOVAL-RELATION-ALL-EXISTS-CHECK-REQUIRED", 1, 1, false);
        declareFunction("removal_relation_all_exists_check_expand", "REMOVAL-RELATION-ALL-EXISTS-CHECK-EXPAND", 1, 1, false);
        declareFunction("removal_relation_all_exists_check_expand_internal", "REMOVAL-RELATION-ALL-EXISTS-CHECK-EXPAND-INTERNAL", 2, 0, false);
        declareFunction("removal_relation_all_exists_unify_required", "REMOVAL-RELATION-ALL-EXISTS-UNIFY-REQUIRED", 1, 1, false);
        new removal_modules_relation_all_exists.$removal_relation_all_exists_unify_required$UnaryFunction();
        new removal_modules_relation_all_exists.$removal_relation_all_exists_unify_required$BinaryFunction();
        declareFunction("removal_relation_all_exists_unify_cost", "REMOVAL-RELATION-ALL-EXISTS-UNIFY-COST", 1, 1, false);
        declareFunction("removal_relation_all_exists_unify_expand", "REMOVAL-RELATION-ALL-EXISTS-UNIFY-EXPAND", 1, 1, false);
        declareFunction("removal_relation_all_exists_unify_via_predicate_expand", "REMOVAL-RELATION-ALL-EXISTS-UNIFY-VIA-PREDICATE-EXPAND", 2, 0, false);
        declareFunction("removal_relation_all_exists_unify_via_collection_expand", "REMOVAL-RELATION-ALL-EXISTS-UNIFY-VIA-COLLECTION-EXPAND", 2, 0, false);
        declareFunction("removal_relation_all_exists_unify_expand_guts", "REMOVAL-RELATION-ALL-EXISTS-UNIFY-EXPAND-GUTS", 2, 0, false);
        declareFunction("relation_exists_all_pos_preference", "RELATION-EXISTS-ALL-POS-PREFERENCE", 3, 0, false);
        declareFunction("removal_some_relation_exists_all_for_predicate", "REMOVAL-SOME-RELATION-EXISTS-ALL-FOR-PREDICATE", 1, 1, false);
        declareFunction("removal_some_relation_exists_all_for_collection", "REMOVAL-SOME-RELATION-EXISTS-ALL-FOR-COLLECTION", 1, 1, false);
        declareFunction("relation_exists_all_predicate_cost_estimate", "RELATION-EXISTS-ALL-PREDICATE-COST-ESTIMATE", 1, 0, false);
        declareFunction("relation_exists_all_collection_cost_estimate", "RELATION-EXISTS-ALL-COLLECTION-COST-ESTIMATE", 1, 0, false);
        declareFunction("removal_relation_exists_all_required", "REMOVAL-RELATION-EXISTS-ALL-REQUIRED", 2, 0, false);
        declareFunction("make_relation_exists_all_support", "MAKE-RELATION-EXISTS-ALL-SUPPORT", 0, 0, false);
        declareFunction("make_relation_exists_all_term", "MAKE-RELATION-EXISTS-ALL-TERM", 4, 0, false);
        declareFunction("removal_relation_exists_all_prune", "REMOVAL-RELATION-EXISTS-ALL-PRUNE", 1, 1, false);
        declareFunction("removal_relation_exists_all_check_required", "REMOVAL-RELATION-EXISTS-ALL-CHECK-REQUIRED", 1, 1, false);
        declareFunction("removal_relation_exists_all_check_expand", "REMOVAL-RELATION-EXISTS-ALL-CHECK-EXPAND", 1, 1, false);
        declareFunction("removal_relation_exists_all_check_expand_internal", "REMOVAL-RELATION-EXISTS-ALL-CHECK-EXPAND-INTERNAL", 2, 0, false);
        declareFunction("removal_relation_exists_all_unify_required", "REMOVAL-RELATION-EXISTS-ALL-UNIFY-REQUIRED", 1, 1, false);
        new removal_modules_relation_all_exists.$removal_relation_exists_all_unify_required$UnaryFunction();
        new removal_modules_relation_all_exists.$removal_relation_exists_all_unify_required$BinaryFunction();
        declareFunction("removal_relation_exists_all_unify_cost", "REMOVAL-RELATION-EXISTS-ALL-UNIFY-COST", 1, 1, false);
        declareFunction("removal_relation_exists_all_unify_expand", "REMOVAL-RELATION-EXISTS-ALL-UNIFY-EXPAND", 1, 1, false);
        declareFunction("removal_relation_exists_all_unify_via_predicate_expand", "REMOVAL-RELATION-EXISTS-ALL-UNIFY-VIA-PREDICATE-EXPAND", 2, 0, false);
        declareFunction("removal_relation_exists_all_unify_via_collection_expand", "REMOVAL-RELATION-EXISTS-ALL-UNIFY-VIA-COLLECTION-EXPAND", 2, 0, false);
        declareFunction("removal_relation_exists_all_unify_expand_guts", "REMOVAL-RELATION-EXISTS-ALL-UNIFY-EXPAND-GUTS", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_removal_modules_relation_all_exists_file_alt() {
        deflexical("*ESTIMATED-PER-COLLECTION-RELATION-ALL-EXISTS-COUNT*", TWO_INTEGER);
        deflexical("*RELATION-ALL-EXISTS-RULE*", list_to_elf($list_alt12));
        deflexical("*RELATION-ALL-EXISTS-DEFINING-MT*", NIL != boundp($relation_all_exists_defining_mt$) ? ((SubLObject) ($relation_all_exists_defining_mt$.getGlobalValue())) : $$BaseKB);
        deflexical("*DEFAULT-RELATION-ALL-EXISTS-CHECK-COST*", $expensive_hl_module_check_cost$.getGlobalValue());
        deflexical("*MINIMUM-RELATION-ALL-EXISTS-UNIFY-COST*", $expensive_hl_module_check_cost$.getGlobalValue());
        deflexical("*ESTIMATED-PER-COLLECTION-RELATION-EXISTS-ALL-COUNT*", TWO_INTEGER);
        deflexical("*RELATION-EXISTS-ALL-RULE*", list_to_elf($list_alt43));
        deflexical("*RELATION-EXISTS-ALL-DEFINING-MT*", NIL != boundp($relation_exists_all_defining_mt$) ? ((SubLObject) ($relation_exists_all_defining_mt$.getGlobalValue())) : $$BaseKB);
        deflexical("*DEFAULT-RELATION-EXISTS-ALL-CHECK-COST*", $expensive_hl_module_check_cost$.getGlobalValue());
        deflexical("*MINIMUM-RELATION-EXISTS-ALL-UNIFY-COST*", $expensive_hl_module_check_cost$.getGlobalValue());
        return NIL;
    }

    public static SubLObject init_removal_modules_relation_all_exists_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*ESTIMATED-PER-COLLECTION-RELATION-ALL-EXISTS-COUNT*", TWO_INTEGER);
            deflexical("*RELATION-ALL-EXISTS-RULE*", list_to_elf($list12));
            deflexical("*RELATION-ALL-EXISTS-DEFINING-MT*", SubLTrampolineFile.maybeDefault($relation_all_exists_defining_mt$, $relation_all_exists_defining_mt$, $$BaseKB));
            deflexical("*DEFAULT-RELATION-ALL-EXISTS-CHECK-COST*", $expensive_hl_module_check_cost$.getGlobalValue());
            deflexical("*MINIMUM-RELATION-ALL-EXISTS-UNIFY-COST*", $expensive_hl_module_check_cost$.getGlobalValue());
            deflexical("*ESTIMATED-PER-COLLECTION-RELATION-EXISTS-ALL-COUNT*", TWO_INTEGER);
            deflexical("*RELATION-EXISTS-ALL-RULE*", list_to_elf($list44));
            deflexical("*RELATION-EXISTS-ALL-DEFINING-MT*", SubLTrampolineFile.maybeDefault($relation_exists_all_defining_mt$, $relation_exists_all_defining_mt$, $$BaseKB));
            deflexical("*DEFAULT-RELATION-EXISTS-ALL-CHECK-COST*", $expensive_hl_module_check_cost$.getGlobalValue());
            deflexical("*MINIMUM-RELATION-EXISTS-ALL-UNIFY-COST*", $expensive_hl_module_check_cost$.getGlobalValue());
        }
        if (SubLFiles.USE_V2) {
            deflexical("*RELATION-ALL-EXISTS-DEFINING-MT*", NIL != boundp($relation_all_exists_defining_mt$) ? ((SubLObject) ($relation_all_exists_defining_mt$.getGlobalValue())) : $$BaseKB);
            deflexical("*RELATION-EXISTS-ALL-RULE*", list_to_elf($list_alt43));
            deflexical("*RELATION-EXISTS-ALL-DEFINING-MT*", NIL != boundp($relation_exists_all_defining_mt$) ? ((SubLObject) ($relation_exists_all_defining_mt$.getGlobalValue())) : $$BaseKB);
        }
        return NIL;
    }

    public static SubLObject init_removal_modules_relation_all_exists_file_Previous() {
        deflexical("*ESTIMATED-PER-COLLECTION-RELATION-ALL-EXISTS-COUNT*", TWO_INTEGER);
        deflexical("*RELATION-ALL-EXISTS-RULE*", list_to_elf($list12));
        deflexical("*RELATION-ALL-EXISTS-DEFINING-MT*", SubLTrampolineFile.maybeDefault($relation_all_exists_defining_mt$, $relation_all_exists_defining_mt$, $$BaseKB));
        deflexical("*DEFAULT-RELATION-ALL-EXISTS-CHECK-COST*", $expensive_hl_module_check_cost$.getGlobalValue());
        deflexical("*MINIMUM-RELATION-ALL-EXISTS-UNIFY-COST*", $expensive_hl_module_check_cost$.getGlobalValue());
        deflexical("*ESTIMATED-PER-COLLECTION-RELATION-EXISTS-ALL-COUNT*", TWO_INTEGER);
        deflexical("*RELATION-EXISTS-ALL-RULE*", list_to_elf($list44));
        deflexical("*RELATION-EXISTS-ALL-DEFINING-MT*", SubLTrampolineFile.maybeDefault($relation_exists_all_defining_mt$, $relation_exists_all_defining_mt$, $$BaseKB));
        deflexical("*DEFAULT-RELATION-EXISTS-ALL-CHECK-COST*", $expensive_hl_module_check_cost$.getGlobalValue());
        deflexical("*MINIMUM-RELATION-EXISTS-ALL-UNIFY-COST*", $expensive_hl_module_check_cost$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject setup_removal_modules_relation_all_exists_file_alt() {
        preference_modules.inference_preference_module($RELATION_ALL_EXISTS_POS, $list_alt1);
        declare_defglobal($relation_all_exists_defining_mt$);
        mt_vars.note_mt_var($relation_all_exists_defining_mt$, $$relationAllExists);
        inference_modules.inference_removal_module($REMOVAL_RELATION_ALL_EXISTS_PRUNE, $list_alt18);
        inference_modules.inference_removal_module($REMOVAL_RELATION_ALL_EXISTS_CHECK, $list_alt33);
        inference_modules.inference_removal_module($REMOVAL_RELATION_ALL_EXISTS_UNIFY, $list_alt37);
        preference_modules.inference_preference_module($RELATION_EXISTS_ALL_POS, $list_alt39);
        declare_defglobal($relation_exists_all_defining_mt$);
        mt_vars.note_mt_var($relation_exists_all_defining_mt$, $$relationExistsAll);
        inference_modules.inference_removal_module($REMOVAL_RELATION_EXISTS_ALL_PRUNE, $list_alt46);
        inference_modules.inference_removal_module($REMOVAL_RELATION_EXISTS_ALL_CHECK, $list_alt52);
        inference_modules.inference_removal_module($REMOVAL_RELATION_EXISTS_ALL_UNIFY, $list_alt54);
        return NIL;
    }

    public static SubLObject setup_removal_modules_relation_all_exists_file() {
        if (SubLFiles.USE_V1) {
            preference_modules.inference_preference_module($RELATION_ALL_EXISTS_POS, $list1);
            declare_defglobal($relation_all_exists_defining_mt$);
            mt_vars.note_mt_var($relation_all_exists_defining_mt$, $$relationAllExists);
            inference_modules.inference_removal_module($REMOVAL_RELATION_ALL_EXISTS_PRUNE, $list18);
            inference_modules.inference_removal_module($REMOVAL_RELATION_ALL_EXISTS_CHECK, $list34);
            inference_modules.inference_removal_module($REMOVAL_RELATION_ALL_EXISTS_UNIFY, $list38);
            preference_modules.inference_preference_module($RELATION_EXISTS_ALL_POS, $list40);
            declare_defglobal($relation_exists_all_defining_mt$);
            mt_vars.note_mt_var($relation_exists_all_defining_mt$, $$relationExistsAll);
            inference_modules.inference_removal_module($REMOVAL_RELATION_EXISTS_ALL_PRUNE, $list47);
            inference_modules.inference_removal_module($REMOVAL_RELATION_EXISTS_ALL_CHECK, $list54);
            inference_modules.inference_removal_module($REMOVAL_RELATION_EXISTS_ALL_UNIFY, $list56);
        }
        if (SubLFiles.USE_V2) {
            inference_modules.inference_removal_module($REMOVAL_RELATION_ALL_EXISTS_CHECK, $list_alt33);
            inference_modules.inference_removal_module($REMOVAL_RELATION_ALL_EXISTS_UNIFY, $list_alt37);
            preference_modules.inference_preference_module($RELATION_EXISTS_ALL_POS, $list_alt39);
            inference_modules.inference_removal_module($REMOVAL_RELATION_EXISTS_ALL_PRUNE, $list_alt46);
            inference_modules.inference_removal_module($REMOVAL_RELATION_EXISTS_ALL_CHECK, $list_alt52);
            inference_modules.inference_removal_module($REMOVAL_RELATION_EXISTS_ALL_UNIFY, $list_alt54);
        }
        return NIL;
    }

    public static SubLObject setup_removal_modules_relation_all_exists_file_Previous() {
        preference_modules.inference_preference_module($RELATION_ALL_EXISTS_POS, $list1);
        declare_defglobal($relation_all_exists_defining_mt$);
        mt_vars.note_mt_var($relation_all_exists_defining_mt$, $$relationAllExists);
        inference_modules.inference_removal_module($REMOVAL_RELATION_ALL_EXISTS_PRUNE, $list18);
        inference_modules.inference_removal_module($REMOVAL_RELATION_ALL_EXISTS_CHECK, $list34);
        inference_modules.inference_removal_module($REMOVAL_RELATION_ALL_EXISTS_UNIFY, $list38);
        preference_modules.inference_preference_module($RELATION_EXISTS_ALL_POS, $list40);
        declare_defglobal($relation_exists_all_defining_mt$);
        mt_vars.note_mt_var($relation_exists_all_defining_mt$, $$relationExistsAll);
        inference_modules.inference_removal_module($REMOVAL_RELATION_EXISTS_ALL_PRUNE, $list47);
        inference_modules.inference_removal_module($REMOVAL_RELATION_EXISTS_ALL_CHECK, $list54);
        inference_modules.inference_removal_module($REMOVAL_RELATION_EXISTS_ALL_UNIFY, $list56);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_relation_all_exists_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_relation_all_exists_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_relation_all_exists_file();
    }

    static {
    }

    public static final class $removal_relation_all_exists_unify_required$UnaryFunction extends UnaryFunction {
        public $removal_relation_all_exists_unify_required$UnaryFunction() {
            super(extractFunctionNamed("REMOVAL-RELATION-ALL-EXISTS-UNIFY-REQUIRED"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return removal_relation_all_exists_unify_required(arg1, removal_modules_relation_all_exists.$removal_relation_all_exists_unify_required$UnaryFunction.UNPROVIDED);
        }
    }

    public static final class $removal_relation_all_exists_unify_required$BinaryFunction extends BinaryFunction {
        public $removal_relation_all_exists_unify_required$BinaryFunction() {
            super(extractFunctionNamed("REMOVAL-RELATION-ALL-EXISTS-UNIFY-REQUIRED"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return removal_relation_all_exists_unify_required(arg1, arg2);
        }
    }

    public static final class $removal_relation_exists_all_unify_required$UnaryFunction extends UnaryFunction {
        public $removal_relation_exists_all_unify_required$UnaryFunction() {
            super(extractFunctionNamed("REMOVAL-RELATION-EXISTS-ALL-UNIFY-REQUIRED"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return removal_relation_exists_all_unify_required(arg1, removal_modules_relation_all_exists.$removal_relation_exists_all_unify_required$UnaryFunction.UNPROVIDED);
        }
    }

    public static final class $removal_relation_exists_all_unify_required$BinaryFunction extends BinaryFunction {
        public $removal_relation_exists_all_unify_required$BinaryFunction() {
            super(extractFunctionNamed("REMOVAL-RELATION-EXISTS-ALL-UNIFY-REQUIRED"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return removal_relation_exists_all_unify_required(arg1, arg2);
        }
    }

    static private final SubLList $list_alt1 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE"), makeSymbol("RELATION-ALL-EXISTS-POS-PREFERENCE"));

    static private final SubLList $list_alt2 = list(makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"));

    static private final SubLList $list_alt4 = list(makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), cons(reader_make_constant_shell("RelationAllExistsFn"), makeKeyword("FULLY-BOUND")));

    static private final SubLList $list_alt6 = list(makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND"));

    static private final SubLList $list_alt7 = list(makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"));

    static private final SubLList $list_alt8 = list(makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"));

    static private final SubLList $list_alt12 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("relationAllExists"), makeSymbol("?PRED"), makeSymbol("?INDEP-COL"), makeSymbol("?DEP-COL")), list(reader_make_constant_shell("isa"), makeSymbol("?TERM"), makeSymbol("?INDEP-COL"))), list(makeSymbol("?PRED"), makeSymbol("?TERM"), list(reader_make_constant_shell("RelationAllExistsFn"), makeSymbol("?TERM"), makeSymbol("?PRED"), makeSymbol("?INDEP-COL"), makeSymbol("?DEP-COL"))));

    static private final SubLList $list_alt18 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), cons($FORT, makeKeyword("ANYTHING")), list(makeKeyword("TREE-FIND"), reader_make_constant_shell("RelationAllExistsFn"))), makeKeyword("EXCLUSIVE"), makeSymbol("REMOVAL-RELATION-ALL-EXISTS-PRUNE"), makeKeyword("COST-EXPRESSION"), ZERO_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString(""), makeKeyword("EXAMPLE"), makeString("") });

    static private final SubLList $list_alt19 = list($FORT, makeKeyword("ANYTHING"), list(reader_make_constant_shell("RelationAllExistsFn"), makeKeyword("ANYTHING"), $FORT, makeKeyword("ANYTHING"), makeKeyword("ANYTHING")));

    static private final SubLList $list_alt20 = list(list($BIND, makeSymbol("PREDICATE")), list($BIND, makeSymbol("TERM")), list(reader_make_constant_shell("RelationAllExistsFn"), list($BIND, makeSymbol("RAE-TERM")), list($BIND, makeSymbol("RAE-PRED")), list($BIND, makeSymbol("IND-COL")), list($BIND, makeSymbol("DEP-COL"))));

    static private final SubLList $list_alt33 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list($FORT, makeKeyword("FULLY-BOUND"), list(reader_make_constant_shell("RelationAllExistsFn"), makeKeyword("FULLY-BOUND"), $FORT, makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"))), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-RELATION-ALL-EXISTS-CHECK-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-RELATION-ALL-EXISTS-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RELATION-ALL-EXISTS-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <object>\n  (#$RelationAllExistsFn <object> <predicate> <indep-col> <dep-col>)) \nwhere <object> is a TERM\nfrom (#$relationAllExists <predicate> <indep-col> <dep-col>)\nand  (#$isa <object> <indep-col>)"), makeKeyword("EXAMPLE"), makeString("(#$grandfathers #$AbrahamLincoln \n  (#$RelationAllExistsFn #$AbrahamLincoln #$grandfathers #$Animal #$MaleAnimal))\nfrom (#$relationAllExists #$grandfathers #$Animal #$MaleAnimal)\nand (#$isa #$AbrahamLincoln #$Animal)") });

    static private final SubLList $list_alt37 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list($FORT, makeKeyword("FULLY-BOUND"), makeKeyword("VARIABLE")), list($FORT, makeKeyword("FULLY-BOUND"), list(makeKeyword("NAT"), cons(reader_make_constant_shell("RelationAllExistsFn"), makeKeyword("NOT-FULLY-BOUND"))))), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-RELATION-ALL-EXISTS-UNIFY-REQUIRED"), $COST, makeSymbol("REMOVAL-RELATION-ALL-EXISTS-UNIFY-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RELATION-ALL-EXISTS-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <object> <not fully-bound>)\nwhere <object> is a TERM\nfrom (#$relationAllExists <predicate> <indep-col> <dep-col>) \nand (#$isa <object> <indep-col>)"), makeKeyword("EXAMPLE"), makeString("(#$grandfathers #$AbrahamLincoln ?RELATIVE)\nfrom (#$relationAllExists #$grandfathers #$Animal #$MaleAnimal)\nand (#$isa #$AbrahamLincoln #$Animal)") });

    static private final SubLList $list_alt39 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE"), makeSymbol("RELATION-EXISTS-ALL-POS-PREFERENCE"));

    static private final SubLList $list_alt40 = list(makeKeyword("FULLY-BOUND"), cons(reader_make_constant_shell("RelationExistsAllFn"), makeKeyword("FULLY-BOUND")), makeKeyword("NOT-FULLY-BOUND"));

    static private final SubLList $list_alt43 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("relationExistsAll"), makeSymbol("?PRED"), makeSymbol("?DEP-COL"), makeSymbol("?INDEP-COL")), list(reader_make_constant_shell("isa"), makeSymbol("?TERM"), makeSymbol("?INDEP-COL"))), list(makeSymbol("?PRED"), list(reader_make_constant_shell("RelationExistsAllFn"), makeSymbol("?TERM"), makeSymbol("?PRED"), makeSymbol("?DEP-COL"), makeSymbol("?INDEP-COL")), makeSymbol("?TERM")));

    static private final SubLList $list_alt46 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), cons($FORT, makeKeyword("ANYTHING")), list(makeKeyword("TREE-FIND"), reader_make_constant_shell("RelationExistsAllFn"))), makeKeyword("EXCLUSIVE"), makeSymbol("REMOVAL-RELATION-EXISTS-ALL-PRUNE"), makeKeyword("COST-EXPRESSION"), ZERO_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString(""), makeKeyword("EXAMPLE"), makeString("") });

    static private final SubLList $list_alt47 = list($FORT, list(reader_make_constant_shell("RelationExistsAllFn"), makeKeyword("ANYTHING"), $FORT, makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), makeKeyword("ANYTHING"));

    static private final SubLList $list_alt48 = list(list($BIND, makeSymbol("PREDICATE")), list(reader_make_constant_shell("RelationExistsAllFn"), list($BIND, makeSymbol("REA-TERM")), list($BIND, makeSymbol("REA-PRED")), list($BIND, makeSymbol("DEP-COL")), list($BIND, makeSymbol("IND-COL"))), list($BIND, makeSymbol("TERM")));

    static private final SubLList $list_alt52 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list($FORT, list(reader_make_constant_shell("RelationExistsAllFn"), makeKeyword("FULLY-BOUND"), $FORT, makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-RELATION-EXISTS-ALL-CHECK-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-RELATION-EXISTS-ALL-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RELATION-EXISTS-ALL-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> (#$RelationExistsAllFn <object> <predicate> <dep-col> <indep-col>) <object>) \nwhere <object> is a TERM\nfrom (#$relationExistsAll <predicate> <dep-col> <indep-col>)\nand (#$isa <object> <indep-col>)"), makeKeyword("EXAMPLE"), makeString("(#$citizens (#$RelationExistsAllFn #$AbrahamLincoln #$citizens #$Country #$Person)\n  #$AbrahamLincoln)\nfrom (#$relationExistsAll #$citizens #$Country #$Person)\nand (#$isa #$AbrahamLincoln #$Person)") });

    static private final SubLList $list_alt54 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list($FORT, makeKeyword("VARIABLE"), makeKeyword("FULLY-BOUND")), list($FORT, list(makeKeyword("NAT"), cons(reader_make_constant_shell("RelationExistsAllFn"), makeKeyword("NOT-FULLY-BOUND"))), makeKeyword("FULLY-BOUND"))), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-RELATION-EXISTS-ALL-UNIFY-REQUIRED"), $COST, makeSymbol("REMOVAL-RELATION-EXISTS-ALL-UNIFY-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RELATION-EXISTS-ALL-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <not fully-bound> <object>) \nwhere <object> is a TERM\nfrom (#$relationExistsAll <predicate> <dep-col> <indep-col>)\nand (#$isa <object> <indep-col>)"), makeKeyword("EXAMPLE"), makeString("(#$citizens ?WHERE #$AbrahamLincoln)\nfrom (#$relationExistsAll #$citizens #$Country #$Person)\nand (#$isa #$AbrahamLincoln #$Person)") });
}

/**
 * Total time: 749 ms
 */
