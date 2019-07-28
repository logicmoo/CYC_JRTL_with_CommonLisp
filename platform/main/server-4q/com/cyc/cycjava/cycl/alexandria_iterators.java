package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.alexandria_iterators;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.alexandria_iterators.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.MINUS_ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class alexandria_iterators extends SubLTranslatedFile {
    public static final SubLFile me = new alexandria_iterators();

    public static final String myName = "com.cyc.cycjava.cycl.alexandria_iterators";

    public static final String myFingerPrint = "b3cf0b913421dd98f5515670cd813777bbb66dfcb31f642d9248bc9ee59373f2";

    private static final SubLSymbol ALEXANDRIA_KB_STORE_ITERATOR_DONE = makeSymbol("ALEXANDRIA-KB-STORE-ITERATOR-DONE");

    private static final SubLSymbol ALEXANDRIA_KB_STORE_ITERATOR_NEXT = makeSymbol("ALEXANDRIA-KB-STORE-ITERATOR-NEXT");

    private static final SubLSymbol ALEXANDRIA_KB_STORE_ITERATOR_FINALIZE = makeSymbol("ALEXANDRIA-KB-STORE-ITERATOR-FINALIZE");

    private static final SubLSymbol CREATE_ALEXANDRIA_GAFS_MATCHING_FORMULA_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-GAFS-MATCHING-FORMULA-ITERATOR-STATE");

    private static final SubLSymbol $sym4$CREATE_ALEXANDRIA_GAFS_MATCHING_FORMULA_RELEVANT_MT_AND_PRED_ITER = makeSymbol("CREATE-ALEXANDRIA-GAFS-MATCHING-FORMULA-RELEVANT-MT-AND-PRED-ITERATOR-STATE");

    private static final SubLSymbol CREATE_ALEXANDRIA_NATS_MATCHING_FORMULA_ITERATOR = makeSymbol("CREATE-ALEXANDRIA-NATS-MATCHING-FORMULA-ITERATOR");

    private static final SubLSymbol CREATE_ALEXANDRIA_REIFIABLE_FUNCTION_EXTENT_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-REIFIABLE-FUNCTION-EXTENT-ITERATOR-STATE");

    private static final SubLSymbol CREATE_ALEXANDRIA_ALL_FORTS_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-ALL-FORTS-ITERATOR-STATE");

    private static final SubLSymbol CREATE_ALEXANDRIA_ALL_GAFS_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-ALL-GAFS-ITERATOR-STATE");

    private static final SubLSymbol CREATE_ALEXANDRIA_ALL_RULES_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-ALL-RULES-ITERATOR-STATE");

    private static final SubLSymbol CREATE_ALEXANDRIA_ALL_UNBOUND_RULES_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-ALL-UNBOUND-RULES-ITERATOR-STATE");

    private static final SubLSymbol CREATE_ALEXANDRIA_ALL_UNBOUND_RULES_RELEVANT_MT_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-ALL-UNBOUND-RULES-RELEVANT-MT-ITERATOR-STATE");

    private static final SubLSymbol CREATE_ALEXANDRIA_ALL_ASSERTIONS_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-ALL-ASSERTIONS-ITERATOR-STATE");

    private static final SubLSymbol CREATE_ALEXANDRIA_ALL_BIG_INTEGERS_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-ALL-BIG-INTEGERS-ITERATOR-STATE");

    private static final SubLSymbol CREATE_ALEXANDRIA_ALL_INTEGERS_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-ALL-INTEGERS-ITERATOR-STATE");

    private static final SubLSymbol CREATE_ALEXANDRIA_ALL_BOOKKEEPING_GAFS_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-ALL-BOOKKEEPING-GAFS-ITERATOR-STATE");

    private static final SubLSymbol CREATE_ALEXANDRIA_ALL_CONSTANTS_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-ALL-CONSTANTS-ITERATOR-STATE");

    private static final SubLSymbol CREATE_ALEXANDRIA_ALL_NARTS_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-ALL-NARTS-ITERATOR-STATE");

    private static final SubLSymbol CREATE_ALEXANDRIA_ALL_DEDUCTIONS_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-ALL-DEDUCTIONS-ITERATOR-STATE");

    private static final SubLSymbol CREATE_ALEXANDRIA_ALL_FLOATS_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-ALL-FLOATS-ITERATOR-STATE");

    private static final SubLSymbol CREATE_ALEXANDRIA_ALL_FORMULAS_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-ALL-FORMULAS-ITERATOR-STATE");

    private static final SubLSymbol CREATE_ALEXANDRIA_ALL_HL_SUPPORTS_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-ALL-HL-SUPPORTS-ITERATOR-STATE");

    private static final SubLSymbol CREATE_ALEXANDRIA_ALL_KB_HL_SUPPORTS_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-ALL-KB-HL-SUPPORTS-ITERATOR-STATE");

    private static final SubLSymbol CREATE_ALEXANDRIA_ALL_ITEMS_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-ALL-ITEMS-ITERATOR-STATE");

    private static final SubLSymbol CREATE_ALEXANDRIA_ALL_STRINGS_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-ALL-STRINGS-ITERATOR-STATE");

    private static final SubLSymbol CREATE_ALEXANDRIA_ALL_NUMBERS_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-ALL-NUMBERS-ITERATOR-STATE");

    private static final SubLSymbol CREATE_ALEXANDRIA_ALL_SUBL_EXPRESSIONS_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-ALL-SUBL-EXPRESSIONS-ITERATOR-STATE");

    private static final SubLSymbol CREATE_ALEXANDRIA_ALL_VARIABLES_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-ALL-VARIABLES-ITERATOR-STATE");

    private static final SubLSymbol CREATE_ALEXANDRIA_ALL_UNREPRESENTED_TERMS_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-ALL-UNREPRESENTED-TERMS-ITERATOR-STATE");

    private static final SubLSymbol CREATE_ALEXANDRIA_TERM_ASSERTIONS_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-TERM-ASSERTIONS-ITERATOR-STATE");

    private static final SubLSymbol CREATE_ALEXANDRIA_GAF_ARG0_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-GAF-ARG0-ITERATOR-STATE");

    private static final SubLSymbol CREATE_ALEXANDRIA_GAF_ARG0_RELEVANT_MT_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-GAF-ARG0-RELEVANT-MT-ITERATOR-STATE");

    private static final SubLSymbol CREATE_ALEXANDRIA_GAF_ARG_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-GAF-ARG-ITERATOR-STATE");

    private static final SubLSymbol CREATE_ALEXANDRIA_GAF_ARG_RELEVANT_MT_AND_PRED_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-GAF-ARG-RELEVANT-MT-AND-PRED-ITERATOR-STATE");

    private static final SubLSymbol CREATE_ALEXANDRIA_GAF_ARG_RELEVANT_MT_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-GAF-ARG-RELEVANT-MT-ITERATOR-STATE");

    private static final SubLSymbol CREATE_ALEXANDRIA_GAF_ARG_FORMULA_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-GAF-ARG-FORMULA-ITERATOR-STATE");

    private static final SubLSymbol $sym36$CREATE_ALEXANDRIA_GAF_ARG_FORMULA_RELEVANT_MT_AND_PRED_ITERATOR_S = makeSymbol("CREATE-ALEXANDRIA-GAF-ARG-FORMULA-RELEVANT-MT-AND-PRED-ITERATOR-STATE");

    private static final SubLSymbol CREATE_ALEXANDRIA_GAF_ARG_FORMULA_RELEVANT_MT_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-GAF-ARG-FORMULA-RELEVANT-MT-ITERATOR-STATE");

    private static final SubLSymbol CREATE_ALEXANDRIA_GAF_ARG_VALUES_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-GAF-ARG-VALUES-ITERATOR-STATE");

    private static final SubLSymbol $sym39$CREATE_ALEXANDRIA_GAF_ARG_VALUES_RELEVANT_MT_AND_PRED_ITERATOR_ST = makeSymbol("CREATE-ALEXANDRIA-GAF-ARG-VALUES-RELEVANT-MT-AND-PRED-ITERATOR-STATE");

    private static final SubLSymbol CREATE_ALEXANDRIA_GAF_ARG_VALUES_RELEVANT_MT_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-GAF-ARG-VALUES-RELEVANT-MT-ITERATOR-STATE");

    private static final SubLSymbol CREATE_ALEXANDRIA_GAF_ARG_ARG_RELEVANT_MT_AND_PRED_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-GAF-ARG-ARG-RELEVANT-MT-AND-PRED-ITERATOR-STATE");

    private static final SubLSymbol CREATE_ALEXANDRIA_MT_CONTENTS_ITERATOR_STATE_RELEVANT_MT = makeSymbol("CREATE-ALEXANDRIA-MT-CONTENTS-ITERATOR-STATE-RELEVANT-MT");

    private static final SubLSymbol CREATE_ALEXANDRIA_MT_CONTENTS_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-MT-CONTENTS-ITERATOR-STATE");

    private static final SubLSymbol CREATE_ALEXANDRIA_OTHER_INDEX_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-OTHER-INDEX-ITERATOR-STATE");

    private static final SubLSymbol CREATE_ALEXANDRIA_OTHER_INDEX_RELEVANT_MT_AND_PRED_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-OTHER-INDEX-RELEVANT-MT-AND-PRED-ITERATOR-STATE");

    private static final SubLSymbol CREATE_ALEXANDRIA_OTHER_INDEX_RELEVANT_MT_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-OTHER-INDEX-RELEVANT-MT-ITERATOR-STATE");

    private static final SubLSymbol CREATE_ALEXANDRIA_RULES_WITH_PRED_RELEVANT_MT_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-RULES-WITH-PRED-RELEVANT-MT-ITERATOR-STATE");

    private static final SubLSymbol CREATE_ALEXANDRIA_RULES_WITH_PRED_AND_ARG2_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-RULES-WITH-PRED-AND-ARG2-ITERATOR-STATE");

    private static final SubLSymbol $sym49$CREATE_ALEXANDRIA_RULES_WITH_PRED_AND_ARG2_RELEVANT_MT_ITERATOR_S = makeSymbol("CREATE-ALEXANDRIA-RULES-WITH-PRED-AND-ARG2-RELEVANT-MT-ITERATOR-STATE");

    private static final SubLSymbol CREATE_ALEXANDRIA_NESTED_FORMULA_RULES_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-NESTED-FORMULA-RULES-ITERATOR-STATE");

    private static final SubLSymbol CREATE_ALEXANDRIA_NESTED_FORMULA_RULES_RELEVANT_MT_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-NESTED-FORMULA-RULES-RELEVANT-MT-ITERATOR-STATE");

    private static final SubLSymbol CREATE_ALEXANDRIA_FUNCTION_EXTENT_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-FUNCTION-EXTENT-ITERATOR-STATE");

    private static final SubLSymbol CREATE_ALEXANDRIA_NART_ARG_INDEX_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-NART-ARG-INDEX-ITERATOR-STATE");





    private static final SubLSymbol CREATE_ALEXANDRIA_ASSERTION_ASSERTED_BY_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-ASSERTION-ASSERTED-BY-ITERATOR-STATE");

    private static final SubLSymbol CREATE_ALEXANDRIA_ASSERTION_ASSERTED_WHY_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-ASSERTION-ASSERTED-WHY-ITERATOR-STATE");

    private static final SubLSymbol CREATE_ALEXANDRIA_ASSERTION_ASSERTED_ON_ITERATOR_STATE = makeSymbol("CREATE-ALEXANDRIA-ASSERTION-ASSERTED-ON-ITERATOR-STATE");

    public static SubLObject new_alexandria_iterator(final SubLObject iterator_state_creation_func, final SubLObject args_list) {
        final SubLObject iterator_state = apply(iterator_state_creation_func, args_list);
        if (NIL != iterator_state) {
            return iteration.new_iterator(iterator_state, ALEXANDRIA_KB_STORE_ITERATOR_DONE, ALEXANDRIA_KB_STORE_ITERATOR_NEXT, ALEXANDRIA_KB_STORE_ITERATOR_FINALIZE);
        }
        return iteration.new_null_iterator();
    }

    public static SubLObject alexandria_kb_store_iterator_done(final SubLObject state) {
        return NIL;
    }

    public static SubLObject alexandria_kb_store_iterator_next(final SubLObject state) {
        return NIL;
    }

    public static SubLObject alexandria_kb_store_iterator_finalize(final SubLObject state) {
        return NIL;
    }

    public static SubLObject count_alexandria_gafs_matching_formula(final SubLObject formula, SubLObject mt, SubLObject truth, SubLObject direction, SubLObject strength) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (strength == UNPROVIDED) {
            strength = NIL;
        }
        return NIL;
    }

    public static SubLObject count_alexandria_gafs_matching_formula_relevant_mt_and_pred(final SubLObject formula, SubLObject truth, SubLObject direction, SubLObject strength) {
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (strength == UNPROVIDED) {
            strength = NIL;
        }
        return NIL;
    }

    public static SubLObject create_alexandria_gafs_matching_formula_iterator_state(final SubLObject formula, SubLObject mt, SubLObject truth, SubLObject direction, SubLObject strength) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (strength == UNPROVIDED) {
            strength = NIL;
        }
        return NIL;
    }

    public static SubLObject new_alexandria_gafs_matching_formula_iterator(final SubLObject formula, SubLObject mt, SubLObject truth, SubLObject direction, SubLObject strength) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (strength == UNPROVIDED) {
            strength = NIL;
        }
        return new_alexandria_iterator(CREATE_ALEXANDRIA_GAFS_MATCHING_FORMULA_ITERATOR_STATE, list(formula, mt, truth, direction, strength));
    }

    public static SubLObject create_alexandria_gafs_matching_formula_relevant_mt_and_pred_iterator_state(final SubLObject formula, SubLObject truth, SubLObject direction, SubLObject strength) {
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (strength == UNPROVIDED) {
            strength = NIL;
        }
        return NIL;
    }

    public static SubLObject new_alexandria_gafs_matching_formula_relevant_mt_and_pred_iterator(final SubLObject formula, SubLObject truth, SubLObject direction, SubLObject strength) {
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (strength == UNPROVIDED) {
            strength = NIL;
        }
        return new_alexandria_iterator($sym4$CREATE_ALEXANDRIA_GAFS_MATCHING_FORMULA_RELEVANT_MT_AND_PRED_ITER, list(formula, truth, direction, strength));
    }

    public static SubLObject create_alexandria_nats_matching_formula_iterator(final SubLObject formula, final SubLObject type) {
        return NIL;
    }

    public static SubLObject new_alexandria_nats_matching_formula_iterator(final SubLObject formula, final SubLObject type) {
        return new_alexandria_iterator(CREATE_ALEXANDRIA_NATS_MATCHING_FORMULA_ITERATOR, list(formula, type));
    }

    public static SubLObject count_alexandria_nats_matching_formula(final SubLObject formula, final SubLObject type) {
        return NIL;
    }

    public static SubLObject count_alexandria_reifiable_function_extent(final SubLObject function) {
        return NIL;
    }

    public static SubLObject create_alexandria_reifiable_function_extent_iterator_state(final SubLObject function) {
        return NIL;
    }

    public static SubLObject new_alexandria_reifiable_function_extent_iterator(final SubLObject function) {
        return new_alexandria_iterator(CREATE_ALEXANDRIA_REIFIABLE_FUNCTION_EXTENT_ITERATOR_STATE, list(function));
    }

    public static SubLObject create_alexandria_all_forts_iterator_state() {
        return NIL;
    }

    public static SubLObject new_alexandria_all_forts_iterator() {
        return new_alexandria_iterator(CREATE_ALEXANDRIA_ALL_FORTS_ITERATOR_STATE, NIL);
    }

    public static SubLObject create_alexandria_all_gafs_iterator_state() {
        return NIL;
    }

    public static SubLObject new_alexandria_all_gafs_iterator() {
        return new_alexandria_iterator(CREATE_ALEXANDRIA_ALL_GAFS_ITERATOR_STATE, NIL);
    }

    public static SubLObject create_alexandria_all_rules_iterator_state() {
        return NIL;
    }

    public static SubLObject new_alexandria_all_rules_iterator() {
        return new_alexandria_iterator(CREATE_ALEXANDRIA_ALL_RULES_ITERATOR_STATE, NIL);
    }

    public static SubLObject create_alexandria_all_unbound_rules_iterator_state(SubLObject sense, SubLObject direction) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return NIL;
    }

    public static SubLObject new_alexandria_all_unbound_rules_iterator(SubLObject sense, SubLObject direction) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return new_alexandria_iterator(CREATE_ALEXANDRIA_ALL_UNBOUND_RULES_ITERATOR_STATE, list(sense, direction));
    }

    public static SubLObject create_alexandria_all_unbound_rules_relevant_mt_iterator_state(SubLObject sense, SubLObject direction) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return NIL;
    }

    public static SubLObject new_alexandria_all_unbound_rules_relevant_mt_iterator(SubLObject sense, SubLObject direction) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return new_alexandria_iterator(CREATE_ALEXANDRIA_ALL_UNBOUND_RULES_RELEVANT_MT_ITERATOR_STATE, list(sense, direction));
    }

    public static SubLObject create_alexandria_all_assertions_iterator_state() {
        return NIL;
    }

    public static SubLObject new_alexandria_all_assertions_iterator() {
        return new_alexandria_iterator(CREATE_ALEXANDRIA_ALL_ASSERTIONS_ITERATOR_STATE, NIL);
    }

    public static SubLObject create_alexandria_all_big_integers_iterator_state() {
        return NIL;
    }

    public static SubLObject new_alexandria_all_big_integers_iterator() {
        return new_alexandria_iterator(CREATE_ALEXANDRIA_ALL_BIG_INTEGERS_ITERATOR_STATE, NIL);
    }

    public static SubLObject create_alexandria_all_integers_iterator_state() {
        return NIL;
    }

    public static SubLObject new_alexandria_all_integers_iterator() {
        return new_alexandria_iterator(CREATE_ALEXANDRIA_ALL_INTEGERS_ITERATOR_STATE, NIL);
    }

    public static SubLObject create_alexandria_all_bookkeeping_gafs_iterator_state() {
        return NIL;
    }

    public static SubLObject new_alexandria_all_bookkeeping_gafs_iterator() {
        return new_alexandria_iterator(CREATE_ALEXANDRIA_ALL_BOOKKEEPING_GAFS_ITERATOR_STATE, NIL);
    }

    public static SubLObject create_alexandria_all_constants_iterator_state() {
        return NIL;
    }

    public static SubLObject new_alexandria_all_constants_iterator() {
        return new_alexandria_iterator(CREATE_ALEXANDRIA_ALL_CONSTANTS_ITERATOR_STATE, NIL);
    }

    public static SubLObject create_alexandria_all_narts_iterator_state() {
        return NIL;
    }

    public static SubLObject new_alexandria_all_narts_iterator() {
        return new_alexandria_iterator(CREATE_ALEXANDRIA_ALL_NARTS_ITERATOR_STATE, NIL);
    }

    public static SubLObject create_alexandria_all_deductions_iterator_state() {
        return NIL;
    }

    public static SubLObject new_alexandria_all_deductions_iterator() {
        return new_alexandria_iterator(CREATE_ALEXANDRIA_ALL_DEDUCTIONS_ITERATOR_STATE, NIL);
    }

    public static SubLObject create_alexandria_all_floats_iterator_state() {
        return NIL;
    }

    public static SubLObject new_alexandria_all_floats_iterator() {
        return new_alexandria_iterator(CREATE_ALEXANDRIA_ALL_FLOATS_ITERATOR_STATE, NIL);
    }

    public static SubLObject create_alexandria_all_formulas_iterator_state() {
        return NIL;
    }

    public static SubLObject new_alexandria_all_formulas_iterator() {
        return new_alexandria_iterator(CREATE_ALEXANDRIA_ALL_FORMULAS_ITERATOR_STATE, NIL);
    }

    public static SubLObject create_alexandria_all_hl_supports_iterator_state() {
        return NIL;
    }

    public static SubLObject new_alexandria_all_hl_supports_iterator() {
        return new_alexandria_iterator(CREATE_ALEXANDRIA_ALL_HL_SUPPORTS_ITERATOR_STATE, NIL);
    }

    public static SubLObject create_alexandria_all_kb_hl_supports_iterator_state() {
        return NIL;
    }

    public static SubLObject new_alexandria_all_kb_hl_supports_iterator() {
        return new_alexandria_iterator(CREATE_ALEXANDRIA_ALL_KB_HL_SUPPORTS_ITERATOR_STATE, NIL);
    }

    public static SubLObject create_alexandria_all_items_iterator_state() {
        return NIL;
    }

    public static SubLObject new_alexandria_all_items_iterator() {
        return new_alexandria_iterator(CREATE_ALEXANDRIA_ALL_ITEMS_ITERATOR_STATE, NIL);
    }

    public static SubLObject create_alexandria_all_strings_iterator_state() {
        return NIL;
    }

    public static SubLObject new_alexandria_all_strings_iterator() {
        return new_alexandria_iterator(CREATE_ALEXANDRIA_ALL_STRINGS_ITERATOR_STATE, NIL);
    }

    public static SubLObject create_alexandria_all_numbers_iterator_state() {
        return NIL;
    }

    public static SubLObject new_alexandria_all_numbers_iterator() {
        return new_alexandria_iterator(CREATE_ALEXANDRIA_ALL_NUMBERS_ITERATOR_STATE, NIL);
    }

    public static SubLObject create_alexandria_all_subl_expressions_iterator_state() {
        return NIL;
    }

    public static SubLObject new_alexandria_all_subl_expressions_iterator() {
        return new_alexandria_iterator(CREATE_ALEXANDRIA_ALL_SUBL_EXPRESSIONS_ITERATOR_STATE, NIL);
    }

    public static SubLObject create_alexandria_all_variables_iterator_state() {
        return NIL;
    }

    public static SubLObject new_alexandria_all_variables_iterator() {
        return new_alexandria_iterator(CREATE_ALEXANDRIA_ALL_VARIABLES_ITERATOR_STATE, NIL);
    }

    public static SubLObject create_alexandria_all_unrepresented_terms_iterator_state() {
        return NIL;
    }

    public static SubLObject new_alexandria_all_unrepresented_terms_iterator() {
        return new_alexandria_iterator(CREATE_ALEXANDRIA_ALL_UNREPRESENTED_TERMS_ITERATOR_STATE, NIL);
    }

    public static SubLObject create_alexandria_term_assertions_relevant_mt_pred_iterator_state(final SubLObject v_term, SubLObject type, SubLObject truth, SubLObject direction, SubLObject nesting_level) {
        if (type == UNPROVIDED) {
            type = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (nesting_level == UNPROVIDED) {
            nesting_level = NIL;
        }
        return NIL;
    }

    public static SubLObject new_alexandria_term_assertions_relevant_mt_pred_iterator(final SubLObject v_term, SubLObject type, SubLObject truth, SubLObject direction, SubLObject nesting_level) {
        if (type == UNPROVIDED) {
            type = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (nesting_level == UNPROVIDED) {
            nesting_level = NIL;
        }
        return new_alexandria_iterator(CREATE_ALEXANDRIA_TERM_ASSERTIONS_ITERATOR_STATE, list(v_term, type, truth, direction, nesting_level));
    }

    public static SubLObject count_alexandria_term_assertions_relevant_mt_pred(final SubLObject v_term, SubLObject type, SubLObject truth, SubLObject direction, SubLObject nesting_level) {
        if (type == UNPROVIDED) {
            type = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (nesting_level == UNPROVIDED) {
            nesting_level = NIL;
        }
        return NIL;
    }

    public static SubLObject create_alexandria_term_assertions_iterator_state(final SubLObject v_term, SubLObject type, SubLObject truth, SubLObject direction, SubLObject nesting_level) {
        if (type == UNPROVIDED) {
            type = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (nesting_level == UNPROVIDED) {
            nesting_level = NIL;
        }
        return NIL;
    }

    public static SubLObject new_alexandria_term_assertions_iterator(final SubLObject v_term, SubLObject type, SubLObject truth, SubLObject direction, SubLObject nesting_level) {
        if (type == UNPROVIDED) {
            type = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (nesting_level == UNPROVIDED) {
            nesting_level = NIL;
        }
        return new_alexandria_iterator(CREATE_ALEXANDRIA_TERM_ASSERTIONS_ITERATOR_STATE, list(v_term, type, truth, direction, nesting_level));
    }

    public static SubLObject count_alexandria_term_assertions(final SubLObject v_term, SubLObject type, SubLObject truth, SubLObject direction, SubLObject nesting_level) {
        if (type == UNPROVIDED) {
            type = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (nesting_level == UNPROVIDED) {
            nesting_level = NIL;
        }
        return NIL;
    }

    public static SubLObject create_alexandria_gaf_arg0_iterator_state(final SubLObject predicate, SubLObject truth, SubLObject direction, SubLObject mt) {
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return NIL;
    }

    public static SubLObject new_alexandria_gaf_arg0_iterator(final SubLObject predicate, SubLObject truth, SubLObject direction, SubLObject mt) {
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return new_alexandria_iterator(CREATE_ALEXANDRIA_GAF_ARG0_ITERATOR_STATE, list(predicate, truth, direction, mt));
    }

    public static SubLObject count_alexandria_gaf_arg0(final SubLObject predicate, SubLObject truth, SubLObject direction, SubLObject mt) {
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return NIL;
    }

    public static SubLObject create_alexandria_gaf_arg0_relevant_mt_iterator_state(final SubLObject predicate, SubLObject truth, SubLObject direction) {
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return NIL;
    }

    public static SubLObject new_alexandria_gaf_arg0_iterator_relevant_mt(final SubLObject predicate, SubLObject truth, SubLObject direction) {
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return new_alexandria_iterator(CREATE_ALEXANDRIA_GAF_ARG0_RELEVANT_MT_ITERATOR_STATE, list(predicate, truth, direction));
    }

    public static SubLObject count_alexandria_gaf_arg0_relevant_mt(final SubLObject predicate, SubLObject truth, SubLObject direction, SubLObject max_count) {
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (max_count == UNPROVIDED) {
            max_count = NIL;
        }
        return NIL;
    }

    public static SubLObject create_alexandria_gaf_arg_iterator_state(final SubLObject v_term, SubLObject index, SubLObject predicate, SubLObject truth, SubLObject direction) {
        if (index == UNPROVIDED) {
            index = NIL;
        }
        if (predicate == UNPROVIDED) {
            predicate = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return NIL;
    }

    public static SubLObject new_alexandria_gaf_arg_iterator(final SubLObject v_term, SubLObject index, SubLObject predicate, SubLObject truth, SubLObject direction) {
        if (index == UNPROVIDED) {
            index = NIL;
        }
        if (predicate == UNPROVIDED) {
            predicate = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return new_alexandria_iterator(CREATE_ALEXANDRIA_GAF_ARG_ITERATOR_STATE, list(v_term, index, predicate, truth, direction));
    }

    public static SubLObject create_alexandria_gaf_arg_relevant_mt_and_pred_iterator_state(final SubLObject v_term, SubLObject index, SubLObject predicate, SubLObject truth, SubLObject direction) {
        if (index == UNPROVIDED) {
            index = NIL;
        }
        if (predicate == UNPROVIDED) {
            predicate = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return NIL;
    }

    public static SubLObject new_alexandria_gaf_arg_relevant_mt_and_pred_iterator(final SubLObject v_term, SubLObject index, SubLObject predicate, SubLObject truth, SubLObject direction) {
        if (index == UNPROVIDED) {
            index = NIL;
        }
        if (predicate == UNPROVIDED) {
            predicate = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return new_alexandria_iterator(CREATE_ALEXANDRIA_GAF_ARG_RELEVANT_MT_AND_PRED_ITERATOR_STATE, list(v_term, index, predicate, truth, direction));
    }

    public static SubLObject create_alexandria_gaf_arg_relevant_mt_iterator_state(final SubLObject v_term, SubLObject index, SubLObject predicate, SubLObject truth, SubLObject direction) {
        if (index == UNPROVIDED) {
            index = NIL;
        }
        if (predicate == UNPROVIDED) {
            predicate = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return NIL;
    }

    public static SubLObject new_alexandria_gaf_arg_relevant_mt_iterator(final SubLObject v_term, SubLObject index, SubLObject predicate, SubLObject truth, SubLObject direction) {
        if (index == UNPROVIDED) {
            index = NIL;
        }
        if (predicate == UNPROVIDED) {
            predicate = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return new_alexandria_iterator(CREATE_ALEXANDRIA_GAF_ARG_RELEVANT_MT_ITERATOR_STATE, list(v_term, index, predicate, truth, direction));
    }

    public static SubLObject create_alexandria_gaf_arg_formula_iterator_state(final SubLObject v_term, SubLObject index, SubLObject predicate, SubLObject truth, SubLObject direction) {
        if (index == UNPROVIDED) {
            index = NIL;
        }
        if (predicate == UNPROVIDED) {
            predicate = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return NIL;
    }

    public static SubLObject new_alexandria_gaf_arg_formula_iterator(final SubLObject v_term, SubLObject index, SubLObject predicate, SubLObject truth, SubLObject direction) {
        if (index == UNPROVIDED) {
            index = NIL;
        }
        if (predicate == UNPROVIDED) {
            predicate = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return new_alexandria_iterator(CREATE_ALEXANDRIA_GAF_ARG_FORMULA_ITERATOR_STATE, list(v_term, index, predicate, truth, direction));
    }

    public static SubLObject create_alexandria_gaf_arg_formula_relevant_mt_and_pred_iterator_state(final SubLObject v_term, SubLObject index, SubLObject predicate, SubLObject truth, SubLObject direction) {
        if (index == UNPROVIDED) {
            index = NIL;
        }
        if (predicate == UNPROVIDED) {
            predicate = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return NIL;
    }

    public static SubLObject new_alexandria_gaf_arg_formula_relevant_mt_and_pred_iterator(final SubLObject v_term, SubLObject index, SubLObject predicate, SubLObject truth, SubLObject direction) {
        if (index == UNPROVIDED) {
            index = NIL;
        }
        if (predicate == UNPROVIDED) {
            predicate = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return new_alexandria_iterator($sym36$CREATE_ALEXANDRIA_GAF_ARG_FORMULA_RELEVANT_MT_AND_PRED_ITERATOR_S, list(v_term, index, predicate, truth, direction));
    }

    public static SubLObject create_alexandria_gaf_arg_formula_relevant_mt_iterator_state(final SubLObject v_term, SubLObject index, SubLObject predicate, SubLObject truth, SubLObject direction) {
        if (index == UNPROVIDED) {
            index = NIL;
        }
        if (predicate == UNPROVIDED) {
            predicate = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return NIL;
    }

    public static SubLObject new_alexandria_gaf_arg_formula_relevant_mt_iterator(final SubLObject v_term, SubLObject index, SubLObject predicate, SubLObject truth, SubLObject direction) {
        if (index == UNPROVIDED) {
            index = NIL;
        }
        if (predicate == UNPROVIDED) {
            predicate = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return new_alexandria_iterator(CREATE_ALEXANDRIA_GAF_ARG_FORMULA_RELEVANT_MT_ITERATOR_STATE, list(v_term, index, predicate, truth, direction));
    }

    public static SubLObject create_alexandria_gaf_arg_values_iterator_state(final SubLObject v_term, final SubLObject gather_index, SubLObject index, SubLObject predicate, SubLObject truth, SubLObject direction) {
        if (index == UNPROVIDED) {
            index = NIL;
        }
        if (predicate == UNPROVIDED) {
            predicate = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return NIL;
    }

    public static SubLObject new_alexandria_gaf_arg_values_iterator(final SubLObject v_term, final SubLObject gather_index, SubLObject index, SubLObject predicate, SubLObject truth, SubLObject direction) {
        if (index == UNPROVIDED) {
            index = NIL;
        }
        if (predicate == UNPROVIDED) {
            predicate = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return new_alexandria_iterator(CREATE_ALEXANDRIA_GAF_ARG_VALUES_ITERATOR_STATE, list(v_term, gather_index, index, predicate, truth, direction));
    }

    public static SubLObject create_alexandria_gaf_arg_values_relevant_mt_and_pred_iterator_state(final SubLObject v_term, final SubLObject gather_index, SubLObject index, SubLObject predicate, SubLObject truth, SubLObject direction) {
        if (index == UNPROVIDED) {
            index = NIL;
        }
        if (predicate == UNPROVIDED) {
            predicate = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return NIL;
    }

    public static SubLObject new_alexandria_gaf_arg_values_relevant_mt_and_pred_iterator(final SubLObject v_term, final SubLObject gather_index, SubLObject index, SubLObject predicate, SubLObject truth, SubLObject direction) {
        if (index == UNPROVIDED) {
            index = NIL;
        }
        if (predicate == UNPROVIDED) {
            predicate = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return new_alexandria_iterator($sym39$CREATE_ALEXANDRIA_GAF_ARG_VALUES_RELEVANT_MT_AND_PRED_ITERATOR_ST, list(v_term, gather_index, index, predicate, truth, direction));
    }

    public static SubLObject create_alexandria_gaf_arg_values_relevant_mt_iterator_state(final SubLObject v_term, final SubLObject gather_index, SubLObject index, SubLObject predicate, SubLObject truth, SubLObject direction) {
        if (index == UNPROVIDED) {
            index = NIL;
        }
        if (predicate == UNPROVIDED) {
            predicate = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return NIL;
    }

    public static SubLObject new_alexandria_gaf_arg_values_relevant_mt_iterator(final SubLObject v_term, final SubLObject gather_index, SubLObject index, SubLObject predicate, SubLObject truth, SubLObject direction) {
        if (index == UNPROVIDED) {
            index = NIL;
        }
        if (predicate == UNPROVIDED) {
            predicate = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return new_alexandria_iterator(CREATE_ALEXANDRIA_GAF_ARG_VALUES_RELEVANT_MT_ITERATOR_STATE, list(v_term, gather_index, index, predicate, truth, direction));
    }

    public static SubLObject count_alexandria_gaf_arg_relevant_mt_and_pred(final SubLObject v_term, SubLObject index, SubLObject predicate, SubLObject truth, SubLObject direction) {
        if (index == UNPROVIDED) {
            index = NIL;
        }
        if (predicate == UNPROVIDED) {
            predicate = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return NIL;
    }

    public static SubLObject count_alexandria_gaf_arg(final SubLObject v_term, SubLObject index, SubLObject predicate, SubLObject mt, SubLObject truth, SubLObject direction) {
        if (index == UNPROVIDED) {
            index = NIL;
        }
        if (predicate == UNPROVIDED) {
            predicate = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return NIL;
    }

    public static SubLObject new_alexandria_gaf_arg_arg_relevant_mt_and_pred_iterator(final SubLObject term1, final SubLObject term2, SubLObject index1, SubLObject index2, SubLObject predicate, SubLObject truth, SubLObject direction) {
        if (index1 == UNPROVIDED) {
            index1 = NIL;
        }
        if (index2 == UNPROVIDED) {
            index2 = NIL;
        }
        if (predicate == UNPROVIDED) {
            predicate = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return new_alexandria_iterator(CREATE_ALEXANDRIA_GAF_ARG_ARG_RELEVANT_MT_AND_PRED_ITERATOR_STATE, list(term1, term2, index1, index2, predicate, truth, direction));
    }

    public static SubLObject create_alexandria_gaf_arg_arg_relevant_mt_and_pred_iterator_state(final SubLObject term1, final SubLObject term2, SubLObject index1, SubLObject index2, SubLObject predicate, SubLObject truth, SubLObject direction) {
        if (index1 == UNPROVIDED) {
            index1 = NIL;
        }
        if (index2 == UNPROVIDED) {
            index2 = NIL;
        }
        if (predicate == UNPROVIDED) {
            predicate = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return NIL;
    }

    public static SubLObject count_alexandria_gaf_arg_arg_relevant_mt_and_pred(final SubLObject term1, final SubLObject term2, SubLObject index1, SubLObject index2, SubLObject predicate, SubLObject truth, SubLObject direction) {
        if (index1 == UNPROVIDED) {
            index1 = NIL;
        }
        if (index2 == UNPROVIDED) {
            index2 = NIL;
        }
        if (predicate == UNPROVIDED) {
            predicate = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return NIL;
    }

    public static SubLObject create_alexandria_mt_contents_iterator_state_relevant_pred(final SubLObject mt, SubLObject type, SubLObject truth, SubLObject direction) {
        if (type == UNPROVIDED) {
            type = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return NIL;
    }

    public static SubLObject new_alexandria_mt_contents_iterator_relevant_pred(final SubLObject mt, SubLObject type, SubLObject truth, SubLObject direction) {
        if (type == UNPROVIDED) {
            type = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return new_alexandria_iterator(CREATE_ALEXANDRIA_MT_CONTENTS_ITERATOR_STATE_RELEVANT_MT, list(mt, type, truth, direction));
    }

    public static SubLObject count_alexandria_mt_contents_relevant_pred(final SubLObject mt, SubLObject type, SubLObject truth, SubLObject direction) {
        if (type == UNPROVIDED) {
            type = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return NIL;
    }

    public static SubLObject create_alexandria_mt_contents_iterator_state(final SubLObject mt, SubLObject type, SubLObject truth, SubLObject direction) {
        if (type == UNPROVIDED) {
            type = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return NIL;
    }

    public static SubLObject new_alexandria_mt_contents_iterator(final SubLObject mt, SubLObject type, SubLObject truth, SubLObject direction) {
        if (type == UNPROVIDED) {
            type = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return new_alexandria_iterator(CREATE_ALEXANDRIA_MT_CONTENTS_ITERATOR_STATE, list(mt, type, truth, direction));
    }

    public static SubLObject count_alexandria_mt_contents(final SubLObject mt, SubLObject type, SubLObject truth, SubLObject direction) {
        if (type == UNPROVIDED) {
            type = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return NIL;
    }

    public static SubLObject create_alexandria_other_index_iterator_state(final SubLObject v_term, SubLObject type, SubLObject truth, SubLObject direction) {
        if (type == UNPROVIDED) {
            type = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return NIL;
    }

    public static SubLObject new_alexandria_other_index_iterator(final SubLObject v_term, SubLObject type, SubLObject truth, SubLObject direction) {
        if (type == UNPROVIDED) {
            type = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return new_alexandria_iterator(CREATE_ALEXANDRIA_OTHER_INDEX_ITERATOR_STATE, list(v_term, type, truth, direction));
    }

    public static SubLObject create_alexandria_other_index_relevant_mt_and_pred_iterator_state(final SubLObject v_term, SubLObject type, SubLObject truth, SubLObject direction) {
        if (type == UNPROVIDED) {
            type = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return NIL;
    }

    public static SubLObject new_alexandria_other_index_relevant_mt_and_pred_iterator(final SubLObject v_term, SubLObject type, SubLObject truth, SubLObject direction) {
        if (type == UNPROVIDED) {
            type = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return new_alexandria_iterator(CREATE_ALEXANDRIA_OTHER_INDEX_RELEVANT_MT_AND_PRED_ITERATOR_STATE, list(v_term, type, truth, direction));
    }

    public static SubLObject create_alexandria_other_index_relevant_mt_iterator_state(final SubLObject v_term, SubLObject type, SubLObject truth, SubLObject direction) {
        if (type == UNPROVIDED) {
            type = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return NIL;
    }

    public static SubLObject new_alexandria_other_index_relevant_mt_iterator(final SubLObject v_term, SubLObject type, SubLObject truth, SubLObject direction) {
        if (type == UNPROVIDED) {
            type = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return new_alexandria_iterator(CREATE_ALEXANDRIA_OTHER_INDEX_RELEVANT_MT_ITERATOR_STATE, list(v_term, type, truth, direction));
    }

    public static SubLObject create_alexandria_rules_with_pred_iterator_state(final SubLObject pred, SubLObject sense, SubLObject direction) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return NIL;
    }

    public static SubLObject new_alexandria_rules_with_pred_iterator(final SubLObject pred, SubLObject sense, SubLObject direction) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return new_alexandria_iterator(CREATE_ALEXANDRIA_RULES_WITH_PRED_RELEVANT_MT_ITERATOR_STATE, list(pred, sense, direction));
    }

    public static SubLObject count_alexandria_rules_with_pred(final SubLObject pred, SubLObject sense, SubLObject direction, SubLObject mt) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return NIL;
    }

    public static SubLObject create_alexandria_rules_with_pred_relevant_mt_iterator_state(final SubLObject pred, SubLObject sense, SubLObject direction) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return NIL;
    }

    public static SubLObject new_alexandria_rules_with_pred_relevant_mt_iterator(final SubLObject pred, SubLObject sense, SubLObject direction) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return new_alexandria_iterator(CREATE_ALEXANDRIA_RULES_WITH_PRED_RELEVANT_MT_ITERATOR_STATE, list(pred, sense, direction));
    }

    public static SubLObject count_alexandria_rules_with_pred_relevant_mt(final SubLObject pred, SubLObject sense, SubLObject direction) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return NIL;
    }

    public static SubLObject create_alexandria_rules_with_pred_and_arg2_iterator_state(final SubLObject pred, final SubLObject arg2, SubLObject sense, SubLObject direction) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return NIL;
    }

    public static SubLObject new_alexandria_rules_with_pred_and_arg2_iterator(final SubLObject pred, final SubLObject arg2, SubLObject sense, SubLObject direction) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return new_alexandria_iterator(CREATE_ALEXANDRIA_RULES_WITH_PRED_AND_ARG2_ITERATOR_STATE, list(pred, arg2, sense, direction));
    }

    public static SubLObject count_alexandria_rules_with_pred_and_arg2(final SubLObject pred, final SubLObject arg2, SubLObject sense, SubLObject direction, SubLObject mt) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return NIL;
    }

    public static SubLObject create_alexandria_rules_with_pred_and_arg2_relevant_mt_iterator_state(final SubLObject pred, final SubLObject arg2, SubLObject sense, SubLObject direction) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return NIL;
    }

    public static SubLObject new_alexandria_rules_with_pred_and_arg2_relevant_mt_iterator(final SubLObject pred, final SubLObject arg2, SubLObject sense, SubLObject direction) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return new_alexandria_iterator($sym49$CREATE_ALEXANDRIA_RULES_WITH_PRED_AND_ARG2_RELEVANT_MT_ITERATOR_S, list(pred, arg2, sense, direction));
    }

    public static SubLObject count_alexandria_rules_with_pred_and_arg2_relevant_mt(final SubLObject pred, final SubLObject arg2, SubLObject sense, SubLObject direction) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return NIL;
    }

    public static SubLObject create_alexandria_nested_formula_rules_iterator_state(final SubLObject outer_pred, final SubLObject inner_pred, SubLObject sense, SubLObject direction) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return NIL;
    }

    public static SubLObject new_alexandria_nested_formula_rules_iterator(final SubLObject outer_pred, final SubLObject inner_pred, SubLObject sense, SubLObject direction) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return new_alexandria_iterator(CREATE_ALEXANDRIA_NESTED_FORMULA_RULES_ITERATOR_STATE, list(outer_pred, inner_pred, sense, direction));
    }

    public static SubLObject count_alexandria_nested_formula_rules(final SubLObject outer_pred, final SubLObject inner_pred, SubLObject sense, SubLObject direction, SubLObject mt) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return NIL;
    }

    public static SubLObject create_alexandria_nested_formula_rules_relevant_mt_iterator_state(final SubLObject outer_pred, final SubLObject inner_pred, SubLObject sense, SubLObject direction) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return NIL;
    }

    public static SubLObject new_alexandria_nested_formula_rules_relevant_mt_iterator(final SubLObject outer_pred, final SubLObject inner_pred, SubLObject sense, SubLObject direction) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return new_alexandria_iterator(CREATE_ALEXANDRIA_NESTED_FORMULA_RULES_RELEVANT_MT_ITERATOR_STATE, list(outer_pred, inner_pred, sense, direction));
    }

    public static SubLObject count_alexandria_nested_formula_rules_relevant_mt(final SubLObject outer_pred, final SubLObject inner_pred, SubLObject sense, SubLObject direction) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return NIL;
    }

    public static SubLObject create_alexandria_function_extent_iterator_state(final SubLObject function, SubLObject truth, SubLObject direction) {
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return NIL;
    }

    public static SubLObject new_alexandria_function_extent_iterator(final SubLObject function, SubLObject truth, SubLObject direction) {
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return new_alexandria_iterator(CREATE_ALEXANDRIA_FUNCTION_EXTENT_ITERATOR_STATE, list(function, truth, direction));
    }

    public static SubLObject count_alexandria_nart_arg_index(final SubLObject v_term, SubLObject index, SubLObject function) {
        if (index == UNPROVIDED) {
            index = NIL;
        }
        if (function == UNPROVIDED) {
            function = NIL;
        }
        return NIL;
    }

    public static SubLObject create_alexandria_nart_arg_index_iterator_state(final SubLObject v_term, SubLObject index, SubLObject function) {
        if (index == UNPROVIDED) {
            index = NIL;
        }
        if (function == UNPROVIDED) {
            function = NIL;
        }
        return NIL;
    }

    public static SubLObject new_alexandria_nart_arg_index_iterator(final SubLObject v_term, SubLObject index, SubLObject function) {
        if (index == UNPROVIDED) {
            index = NIL;
        }
        if (function == UNPROVIDED) {
            function = NIL;
        }
        return new_alexandria_iterator(CREATE_ALEXANDRIA_NART_ARG_INDEX_ITERATOR_STATE, list(v_term, index, function));
    }

    public static SubLObject create_alexandria_rules_with_cnf_iterator_state(final SubLObject cnf) {
        return NIL;
    }

    public static SubLObject new_alexandria_rules_with_cnf_iterator(final SubLObject cnf) {
        return new_alexandria_iterator(CREATE_ALEXANDRIA_NART_ARG_INDEX_ITERATOR_STATE, list(cnf));
    }

    public static SubLObject does_constant_exist_with_name_or_guid(final SubLObject name, final SubLObject guid, SubLObject require_case_insensitive_name_uniquenessP) {
        if (require_case_insensitive_name_uniquenessP == UNPROVIDED) {
            require_case_insensitive_name_uniquenessP = NIL;
        }
        return NIL;
    }

    public static SubLObject clear_alexandria_caches() {
        return NIL;
    }

    public static SubLObject term_assertion_usage_count_estimate(final SubLObject cycl_term) {
        return $UNKNOWN;
    }

    public static SubLObject estimated_cost_for_indexing_on_term(final SubLObject cycl_term) {
        return MINUS_ONE_INTEGER;
    }

    public static SubLObject create_alexandria_assertion_asserted_by_iterator_state(final SubLObject user, SubLObject optimization) {
        if (optimization == UNPROVIDED) {
            optimization = $LATENCY;
        }
        return NIL;
    }

    public static SubLObject new_alexandria_assertion_asserted_by_iterator(final SubLObject user, SubLObject optimization) {
        if (optimization == UNPROVIDED) {
            optimization = $LATENCY;
        }
        return new_alexandria_iterator(CREATE_ALEXANDRIA_ASSERTION_ASSERTED_BY_ITERATOR_STATE, list(user, optimization));
    }

    public static SubLObject count_alexandria_rules_assertion_asserted_by(final SubLObject user) {
        return NIL;
    }

    public static SubLObject create_alexandria_assertion_asserted_why_iterator_state(final SubLObject reason, SubLObject optimization) {
        if (optimization == UNPROVIDED) {
            optimization = $LATENCY;
        }
        return NIL;
    }

    public static SubLObject new_alexandria_assertion_asserted_why_iterator(final SubLObject reason, SubLObject optimization) {
        if (optimization == UNPROVIDED) {
            optimization = $LATENCY;
        }
        return new_alexandria_iterator(CREATE_ALEXANDRIA_ASSERTION_ASSERTED_WHY_ITERATOR_STATE, list(reason, optimization));
    }

    public static SubLObject count_alexandria_rules_assertion_asserted_why(final SubLObject reason) {
        return NIL;
    }

    public static SubLObject create_alexandria_assertion_asserted_on_iterator_state(final SubLObject universal_date, SubLObject seconds) {
        if (seconds == UNPROVIDED) {
            seconds = NIL;
        }
        return NIL;
    }

    public static SubLObject new_alexandria_assertion_asserted_on_iterator(final SubLObject universal_date, SubLObject seconds) {
        if (seconds == UNPROVIDED) {
            seconds = NIL;
        }
        return new_alexandria_iterator(CREATE_ALEXANDRIA_ASSERTION_ASSERTED_ON_ITERATOR_STATE, list(universal_date, seconds));
    }

    public static SubLObject count_alexandria_rules_assertion_asserted_on(final SubLObject universal_date, SubLObject seconds) {
        if (seconds == UNPROVIDED) {
            seconds = NIL;
        }
        return NIL;
    }

    public static SubLObject all_genl_mts_alexandria(final SubLObject mt, final SubLObject mt_mt, final SubLObject tv) {
        return genl_mts.all_genl_mts_internal(mt, mt_mt, tv, NIL);
    }

    public static SubLObject all_spec_mts_alexandria(final SubLObject mt, final SubLObject mt_mt, final SubLObject tv) {
        return genl_mts.all_spec_mts_internal(mt, mt_mt, tv, NIL);
    }

    public static SubLObject create_alexandria_defns_cache_iterator_state(final SubLObject defns_cache_name) {
        return NIL;
    }

    public static SubLObject new_alexandria_defns_cache_iterator(final SubLObject defn_cache_name) {
        return NIL;
    }

    public static SubLObject declare_alexandria_iterators_file() {
        declareFunction(me, "new_alexandria_iterator", "NEW-ALEXANDRIA-ITERATOR", 2, 0, false);
        declareFunction(me, "alexandria_kb_store_iterator_done", "ALEXANDRIA-KB-STORE-ITERATOR-DONE", 1, 0, false);
        declareFunction(me, "alexandria_kb_store_iterator_next", "ALEXANDRIA-KB-STORE-ITERATOR-NEXT", 1, 0, false);
        declareFunction(me, "alexandria_kb_store_iterator_finalize", "ALEXANDRIA-KB-STORE-ITERATOR-FINALIZE", 1, 0, false);
        declareFunction(me, "count_alexandria_gafs_matching_formula", "COUNT-ALEXANDRIA-GAFS-MATCHING-FORMULA", 1, 4, false);
        declareFunction(me, "count_alexandria_gafs_matching_formula_relevant_mt_and_pred", "COUNT-ALEXANDRIA-GAFS-MATCHING-FORMULA-RELEVANT-MT-AND-PRED", 1, 3, false);
        declareFunction(me, "create_alexandria_gafs_matching_formula_iterator_state", "CREATE-ALEXANDRIA-GAFS-MATCHING-FORMULA-ITERATOR-STATE", 1, 4, false);
        declareFunction(me, "new_alexandria_gafs_matching_formula_iterator", "NEW-ALEXANDRIA-GAFS-MATCHING-FORMULA-ITERATOR", 1, 4, false);
        declareFunction(me, "create_alexandria_gafs_matching_formula_relevant_mt_and_pred_iterator_state", "CREATE-ALEXANDRIA-GAFS-MATCHING-FORMULA-RELEVANT-MT-AND-PRED-ITERATOR-STATE", 1, 3, false);
        declareFunction(me, "new_alexandria_gafs_matching_formula_relevant_mt_and_pred_iterator", "NEW-ALEXANDRIA-GAFS-MATCHING-FORMULA-RELEVANT-MT-AND-PRED-ITERATOR", 1, 3, false);
        declareFunction(me, "create_alexandria_nats_matching_formula_iterator", "CREATE-ALEXANDRIA-NATS-MATCHING-FORMULA-ITERATOR", 2, 0, false);
        declareFunction(me, "new_alexandria_nats_matching_formula_iterator", "NEW-ALEXANDRIA-NATS-MATCHING-FORMULA-ITERATOR", 2, 0, false);
        declareFunction(me, "count_alexandria_nats_matching_formula", "COUNT-ALEXANDRIA-NATS-MATCHING-FORMULA", 2, 0, false);
        declareFunction(me, "count_alexandria_reifiable_function_extent", "COUNT-ALEXANDRIA-REIFIABLE-FUNCTION-EXTENT", 1, 0, false);
        declareFunction(me, "create_alexandria_reifiable_function_extent_iterator_state", "CREATE-ALEXANDRIA-REIFIABLE-FUNCTION-EXTENT-ITERATOR-STATE", 1, 0, false);
        declareFunction(me, "new_alexandria_reifiable_function_extent_iterator", "NEW-ALEXANDRIA-REIFIABLE-FUNCTION-EXTENT-ITERATOR", 1, 0, false);
        declareFunction(me, "create_alexandria_all_forts_iterator_state", "CREATE-ALEXANDRIA-ALL-FORTS-ITERATOR-STATE", 0, 0, false);
        declareFunction(me, "new_alexandria_all_forts_iterator", "NEW-ALEXANDRIA-ALL-FORTS-ITERATOR", 0, 0, false);
        declareFunction(me, "create_alexandria_all_gafs_iterator_state", "CREATE-ALEXANDRIA-ALL-GAFS-ITERATOR-STATE", 0, 0, false);
        declareFunction(me, "new_alexandria_all_gafs_iterator", "NEW-ALEXANDRIA-ALL-GAFS-ITERATOR", 0, 0, false);
        declareFunction(me, "create_alexandria_all_rules_iterator_state", "CREATE-ALEXANDRIA-ALL-RULES-ITERATOR-STATE", 0, 0, false);
        declareFunction(me, "new_alexandria_all_rules_iterator", "NEW-ALEXANDRIA-ALL-RULES-ITERATOR", 0, 0, false);
        declareFunction(me, "create_alexandria_all_unbound_rules_iterator_state", "CREATE-ALEXANDRIA-ALL-UNBOUND-RULES-ITERATOR-STATE", 0, 2, false);
        declareFunction(me, "new_alexandria_all_unbound_rules_iterator", "NEW-ALEXANDRIA-ALL-UNBOUND-RULES-ITERATOR", 0, 2, false);
        declareFunction(me, "create_alexandria_all_unbound_rules_relevant_mt_iterator_state", "CREATE-ALEXANDRIA-ALL-UNBOUND-RULES-RELEVANT-MT-ITERATOR-STATE", 0, 2, false);
        declareFunction(me, "new_alexandria_all_unbound_rules_relevant_mt_iterator", "NEW-ALEXANDRIA-ALL-UNBOUND-RULES-RELEVANT-MT-ITERATOR", 0, 2, false);
        declareFunction(me, "create_alexandria_all_assertions_iterator_state", "CREATE-ALEXANDRIA-ALL-ASSERTIONS-ITERATOR-STATE", 0, 0, false);
        declareFunction(me, "new_alexandria_all_assertions_iterator", "NEW-ALEXANDRIA-ALL-ASSERTIONS-ITERATOR", 0, 0, false);
        declareFunction(me, "create_alexandria_all_big_integers_iterator_state", "CREATE-ALEXANDRIA-ALL-BIG-INTEGERS-ITERATOR-STATE", 0, 0, false);
        declareFunction(me, "new_alexandria_all_big_integers_iterator", "NEW-ALEXANDRIA-ALL-BIG-INTEGERS-ITERATOR", 0, 0, false);
        declareFunction(me, "create_alexandria_all_integers_iterator_state", "CREATE-ALEXANDRIA-ALL-INTEGERS-ITERATOR-STATE", 0, 0, false);
        declareFunction(me, "new_alexandria_all_integers_iterator", "NEW-ALEXANDRIA-ALL-INTEGERS-ITERATOR", 0, 0, false);
        declareFunction(me, "create_alexandria_all_bookkeeping_gafs_iterator_state", "CREATE-ALEXANDRIA-ALL-BOOKKEEPING-GAFS-ITERATOR-STATE", 0, 0, false);
        declareFunction(me, "new_alexandria_all_bookkeeping_gafs_iterator", "NEW-ALEXANDRIA-ALL-BOOKKEEPING-GAFS-ITERATOR", 0, 0, false);
        declareFunction(me, "create_alexandria_all_constants_iterator_state", "CREATE-ALEXANDRIA-ALL-CONSTANTS-ITERATOR-STATE", 0, 0, false);
        declareFunction(me, "new_alexandria_all_constants_iterator", "NEW-ALEXANDRIA-ALL-CONSTANTS-ITERATOR", 0, 0, false);
        declareFunction(me, "create_alexandria_all_narts_iterator_state", "CREATE-ALEXANDRIA-ALL-NARTS-ITERATOR-STATE", 0, 0, false);
        declareFunction(me, "new_alexandria_all_narts_iterator", "NEW-ALEXANDRIA-ALL-NARTS-ITERATOR", 0, 0, false);
        declareFunction(me, "create_alexandria_all_deductions_iterator_state", "CREATE-ALEXANDRIA-ALL-DEDUCTIONS-ITERATOR-STATE", 0, 0, false);
        declareFunction(me, "new_alexandria_all_deductions_iterator", "NEW-ALEXANDRIA-ALL-DEDUCTIONS-ITERATOR", 0, 0, false);
        declareFunction(me, "create_alexandria_all_floats_iterator_state", "CREATE-ALEXANDRIA-ALL-FLOATS-ITERATOR-STATE", 0, 0, false);
        declareFunction(me, "new_alexandria_all_floats_iterator", "NEW-ALEXANDRIA-ALL-FLOATS-ITERATOR", 0, 0, false);
        declareFunction(me, "create_alexandria_all_formulas_iterator_state", "CREATE-ALEXANDRIA-ALL-FORMULAS-ITERATOR-STATE", 0, 0, false);
        declareFunction(me, "new_alexandria_all_formulas_iterator", "NEW-ALEXANDRIA-ALL-FORMULAS-ITERATOR", 0, 0, false);
        declareFunction(me, "create_alexandria_all_hl_supports_iterator_state", "CREATE-ALEXANDRIA-ALL-HL-SUPPORTS-ITERATOR-STATE", 0, 0, false);
        declareFunction(me, "new_alexandria_all_hl_supports_iterator", "NEW-ALEXANDRIA-ALL-HL-SUPPORTS-ITERATOR", 0, 0, false);
        declareFunction(me, "create_alexandria_all_kb_hl_supports_iterator_state", "CREATE-ALEXANDRIA-ALL-KB-HL-SUPPORTS-ITERATOR-STATE", 0, 0, false);
        declareFunction(me, "new_alexandria_all_kb_hl_supports_iterator", "NEW-ALEXANDRIA-ALL-KB-HL-SUPPORTS-ITERATOR", 0, 0, false);
        declareFunction(me, "create_alexandria_all_items_iterator_state", "CREATE-ALEXANDRIA-ALL-ITEMS-ITERATOR-STATE", 0, 0, false);
        declareFunction(me, "new_alexandria_all_items_iterator", "NEW-ALEXANDRIA-ALL-ITEMS-ITERATOR", 0, 0, false);
        declareFunction(me, "create_alexandria_all_strings_iterator_state", "CREATE-ALEXANDRIA-ALL-STRINGS-ITERATOR-STATE", 0, 0, false);
        declareFunction(me, "new_alexandria_all_strings_iterator", "NEW-ALEXANDRIA-ALL-STRINGS-ITERATOR", 0, 0, false);
        declareFunction(me, "create_alexandria_all_numbers_iterator_state", "CREATE-ALEXANDRIA-ALL-NUMBERS-ITERATOR-STATE", 0, 0, false);
        declareFunction(me, "new_alexandria_all_numbers_iterator", "NEW-ALEXANDRIA-ALL-NUMBERS-ITERATOR", 0, 0, false);
        declareFunction(me, "create_alexandria_all_subl_expressions_iterator_state", "CREATE-ALEXANDRIA-ALL-SUBL-EXPRESSIONS-ITERATOR-STATE", 0, 0, false);
        declareFunction(me, "new_alexandria_all_subl_expressions_iterator", "NEW-ALEXANDRIA-ALL-SUBL-EXPRESSIONS-ITERATOR", 0, 0, false);
        declareFunction(me, "create_alexandria_all_variables_iterator_state", "CREATE-ALEXANDRIA-ALL-VARIABLES-ITERATOR-STATE", 0, 0, false);
        declareFunction(me, "new_alexandria_all_variables_iterator", "NEW-ALEXANDRIA-ALL-VARIABLES-ITERATOR", 0, 0, false);
        declareFunction(me, "create_alexandria_all_unrepresented_terms_iterator_state", "CREATE-ALEXANDRIA-ALL-UNREPRESENTED-TERMS-ITERATOR-STATE", 0, 0, false);
        declareFunction(me, "new_alexandria_all_unrepresented_terms_iterator", "NEW-ALEXANDRIA-ALL-UNREPRESENTED-TERMS-ITERATOR", 0, 0, false);
        declareFunction(me, "create_alexandria_term_assertions_relevant_mt_pred_iterator_state", "CREATE-ALEXANDRIA-TERM-ASSERTIONS-RELEVANT-MT-PRED-ITERATOR-STATE", 1, 4, false);
        declareFunction(me, "new_alexandria_term_assertions_relevant_mt_pred_iterator", "NEW-ALEXANDRIA-TERM-ASSERTIONS-RELEVANT-MT-PRED-ITERATOR", 1, 4, false);
        declareFunction(me, "count_alexandria_term_assertions_relevant_mt_pred", "COUNT-ALEXANDRIA-TERM-ASSERTIONS-RELEVANT-MT-PRED", 1, 4, false);
        declareFunction(me, "create_alexandria_term_assertions_iterator_state", "CREATE-ALEXANDRIA-TERM-ASSERTIONS-ITERATOR-STATE", 1, 4, false);
        declareFunction(me, "new_alexandria_term_assertions_iterator", "NEW-ALEXANDRIA-TERM-ASSERTIONS-ITERATOR", 1, 4, false);
        declareFunction(me, "count_alexandria_term_assertions", "COUNT-ALEXANDRIA-TERM-ASSERTIONS", 1, 4, false);
        declareFunction(me, "create_alexandria_gaf_arg0_iterator_state", "CREATE-ALEXANDRIA-GAF-ARG0-ITERATOR-STATE", 1, 3, false);
        declareFunction(me, "new_alexandria_gaf_arg0_iterator", "NEW-ALEXANDRIA-GAF-ARG0-ITERATOR", 1, 3, false);
        declareFunction(me, "count_alexandria_gaf_arg0", "COUNT-ALEXANDRIA-GAF-ARG0", 1, 3, false);
        declareFunction(me, "create_alexandria_gaf_arg0_relevant_mt_iterator_state", "CREATE-ALEXANDRIA-GAF-ARG0-RELEVANT-MT-ITERATOR-STATE", 1, 2, false);
        declareFunction(me, "new_alexandria_gaf_arg0_iterator_relevant_mt", "NEW-ALEXANDRIA-GAF-ARG0-ITERATOR-RELEVANT-MT", 1, 2, false);
        declareFunction(me, "count_alexandria_gaf_arg0_relevant_mt", "COUNT-ALEXANDRIA-GAF-ARG0-RELEVANT-MT", 1, 3, false);
        declareFunction(me, "create_alexandria_gaf_arg_iterator_state", "CREATE-ALEXANDRIA-GAF-ARG-ITERATOR-STATE", 1, 4, false);
        declareFunction(me, "new_alexandria_gaf_arg_iterator", "NEW-ALEXANDRIA-GAF-ARG-ITERATOR", 1, 4, false);
        declareFunction(me, "create_alexandria_gaf_arg_relevant_mt_and_pred_iterator_state", "CREATE-ALEXANDRIA-GAF-ARG-RELEVANT-MT-AND-PRED-ITERATOR-STATE", 1, 4, false);
        declareFunction(me, "new_alexandria_gaf_arg_relevant_mt_and_pred_iterator", "NEW-ALEXANDRIA-GAF-ARG-RELEVANT-MT-AND-PRED-ITERATOR", 1, 4, false);
        declareFunction(me, "create_alexandria_gaf_arg_relevant_mt_iterator_state", "CREATE-ALEXANDRIA-GAF-ARG-RELEVANT-MT-ITERATOR-STATE", 1, 4, false);
        declareFunction(me, "new_alexandria_gaf_arg_relevant_mt_iterator", "NEW-ALEXANDRIA-GAF-ARG-RELEVANT-MT-ITERATOR", 1, 4, false);
        declareFunction(me, "create_alexandria_gaf_arg_formula_iterator_state", "CREATE-ALEXANDRIA-GAF-ARG-FORMULA-ITERATOR-STATE", 1, 4, false);
        declareFunction(me, "new_alexandria_gaf_arg_formula_iterator", "NEW-ALEXANDRIA-GAF-ARG-FORMULA-ITERATOR", 1, 4, false);
        declareFunction(me, "create_alexandria_gaf_arg_formula_relevant_mt_and_pred_iterator_state", "CREATE-ALEXANDRIA-GAF-ARG-FORMULA-RELEVANT-MT-AND-PRED-ITERATOR-STATE", 1, 4, false);
        declareFunction(me, "new_alexandria_gaf_arg_formula_relevant_mt_and_pred_iterator", "NEW-ALEXANDRIA-GAF-ARG-FORMULA-RELEVANT-MT-AND-PRED-ITERATOR", 1, 4, false);
        declareFunction(me, "create_alexandria_gaf_arg_formula_relevant_mt_iterator_state", "CREATE-ALEXANDRIA-GAF-ARG-FORMULA-RELEVANT-MT-ITERATOR-STATE", 1, 4, false);
        declareFunction(me, "new_alexandria_gaf_arg_formula_relevant_mt_iterator", "NEW-ALEXANDRIA-GAF-ARG-FORMULA-RELEVANT-MT-ITERATOR", 1, 4, false);
        declareFunction(me, "create_alexandria_gaf_arg_values_iterator_state", "CREATE-ALEXANDRIA-GAF-ARG-VALUES-ITERATOR-STATE", 2, 4, false);
        declareFunction(me, "new_alexandria_gaf_arg_values_iterator", "NEW-ALEXANDRIA-GAF-ARG-VALUES-ITERATOR", 2, 4, false);
        declareFunction(me, "create_alexandria_gaf_arg_values_relevant_mt_and_pred_iterator_state", "CREATE-ALEXANDRIA-GAF-ARG-VALUES-RELEVANT-MT-AND-PRED-ITERATOR-STATE", 2, 4, false);
        declareFunction(me, "new_alexandria_gaf_arg_values_relevant_mt_and_pred_iterator", "NEW-ALEXANDRIA-GAF-ARG-VALUES-RELEVANT-MT-AND-PRED-ITERATOR", 2, 4, false);
        declareFunction(me, "create_alexandria_gaf_arg_values_relevant_mt_iterator_state", "CREATE-ALEXANDRIA-GAF-ARG-VALUES-RELEVANT-MT-ITERATOR-STATE", 2, 4, false);
        declareFunction(me, "new_alexandria_gaf_arg_values_relevant_mt_iterator", "NEW-ALEXANDRIA-GAF-ARG-VALUES-RELEVANT-MT-ITERATOR", 2, 4, false);
        declareFunction(me, "count_alexandria_gaf_arg_relevant_mt_and_pred", "COUNT-ALEXANDRIA-GAF-ARG-RELEVANT-MT-AND-PRED", 1, 4, false);
        declareFunction(me, "count_alexandria_gaf_arg", "COUNT-ALEXANDRIA-GAF-ARG", 1, 5, false);
        declareFunction(me, "new_alexandria_gaf_arg_arg_relevant_mt_and_pred_iterator", "NEW-ALEXANDRIA-GAF-ARG-ARG-RELEVANT-MT-AND-PRED-ITERATOR", 2, 5, false);
        declareFunction(me, "create_alexandria_gaf_arg_arg_relevant_mt_and_pred_iterator_state", "CREATE-ALEXANDRIA-GAF-ARG-ARG-RELEVANT-MT-AND-PRED-ITERATOR-STATE", 2, 5, false);
        declareFunction(me, "count_alexandria_gaf_arg_arg_relevant_mt_and_pred", "COUNT-ALEXANDRIA-GAF-ARG-ARG-RELEVANT-MT-AND-PRED", 2, 5, false);
        declareFunction(me, "create_alexandria_mt_contents_iterator_state_relevant_pred", "CREATE-ALEXANDRIA-MT-CONTENTS-ITERATOR-STATE-RELEVANT-PRED", 1, 3, false);
        declareFunction(me, "new_alexandria_mt_contents_iterator_relevant_pred", "NEW-ALEXANDRIA-MT-CONTENTS-ITERATOR-RELEVANT-PRED", 1, 3, false);
        declareFunction(me, "count_alexandria_mt_contents_relevant_pred", "COUNT-ALEXANDRIA-MT-CONTENTS-RELEVANT-PRED", 1, 3, false);
        declareFunction(me, "create_alexandria_mt_contents_iterator_state", "CREATE-ALEXANDRIA-MT-CONTENTS-ITERATOR-STATE", 1, 3, false);
        declareFunction(me, "new_alexandria_mt_contents_iterator", "NEW-ALEXANDRIA-MT-CONTENTS-ITERATOR", 1, 3, false);
        declareFunction(me, "count_alexandria_mt_contents", "COUNT-ALEXANDRIA-MT-CONTENTS", 1, 3, false);
        declareFunction(me, "create_alexandria_other_index_iterator_state", "CREATE-ALEXANDRIA-OTHER-INDEX-ITERATOR-STATE", 1, 3, false);
        declareFunction(me, "new_alexandria_other_index_iterator", "NEW-ALEXANDRIA-OTHER-INDEX-ITERATOR", 1, 3, false);
        declareFunction(me, "create_alexandria_other_index_relevant_mt_and_pred_iterator_state", "CREATE-ALEXANDRIA-OTHER-INDEX-RELEVANT-MT-AND-PRED-ITERATOR-STATE", 1, 3, false);
        declareFunction(me, "new_alexandria_other_index_relevant_mt_and_pred_iterator", "NEW-ALEXANDRIA-OTHER-INDEX-RELEVANT-MT-AND-PRED-ITERATOR", 1, 3, false);
        declareFunction(me, "create_alexandria_other_index_relevant_mt_iterator_state", "CREATE-ALEXANDRIA-OTHER-INDEX-RELEVANT-MT-ITERATOR-STATE", 1, 3, false);
        declareFunction(me, "new_alexandria_other_index_relevant_mt_iterator", "NEW-ALEXANDRIA-OTHER-INDEX-RELEVANT-MT-ITERATOR", 1, 3, false);
        declareFunction(me, "create_alexandria_rules_with_pred_iterator_state", "CREATE-ALEXANDRIA-RULES-WITH-PRED-ITERATOR-STATE", 1, 2, false);
        declareFunction(me, "new_alexandria_rules_with_pred_iterator", "NEW-ALEXANDRIA-RULES-WITH-PRED-ITERATOR", 1, 2, false);
        declareFunction(me, "count_alexandria_rules_with_pred", "COUNT-ALEXANDRIA-RULES-WITH-PRED", 1, 3, false);
        declareFunction(me, "create_alexandria_rules_with_pred_relevant_mt_iterator_state", "CREATE-ALEXANDRIA-RULES-WITH-PRED-RELEVANT-MT-ITERATOR-STATE", 1, 2, false);
        declareFunction(me, "new_alexandria_rules_with_pred_relevant_mt_iterator", "NEW-ALEXANDRIA-RULES-WITH-PRED-RELEVANT-MT-ITERATOR", 1, 2, false);
        declareFunction(me, "count_alexandria_rules_with_pred_relevant_mt", "COUNT-ALEXANDRIA-RULES-WITH-PRED-RELEVANT-MT", 1, 2, false);
        declareFunction(me, "create_alexandria_rules_with_pred_and_arg2_iterator_state", "CREATE-ALEXANDRIA-RULES-WITH-PRED-AND-ARG2-ITERATOR-STATE", 2, 2, false);
        declareFunction(me, "new_alexandria_rules_with_pred_and_arg2_iterator", "NEW-ALEXANDRIA-RULES-WITH-PRED-AND-ARG2-ITERATOR", 2, 2, false);
        declareFunction(me, "count_alexandria_rules_with_pred_and_arg2", "COUNT-ALEXANDRIA-RULES-WITH-PRED-AND-ARG2", 2, 3, false);
        declareFunction(me, "create_alexandria_rules_with_pred_and_arg2_relevant_mt_iterator_state", "CREATE-ALEXANDRIA-RULES-WITH-PRED-AND-ARG2-RELEVANT-MT-ITERATOR-STATE", 2, 2, false);
        declareFunction(me, "new_alexandria_rules_with_pred_and_arg2_relevant_mt_iterator", "NEW-ALEXANDRIA-RULES-WITH-PRED-AND-ARG2-RELEVANT-MT-ITERATOR", 2, 2, false);
        declareFunction(me, "count_alexandria_rules_with_pred_and_arg2_relevant_mt", "COUNT-ALEXANDRIA-RULES-WITH-PRED-AND-ARG2-RELEVANT-MT", 2, 2, false);
        declareFunction(me, "create_alexandria_nested_formula_rules_iterator_state", "CREATE-ALEXANDRIA-NESTED-FORMULA-RULES-ITERATOR-STATE", 2, 2, false);
        declareFunction(me, "new_alexandria_nested_formula_rules_iterator", "NEW-ALEXANDRIA-NESTED-FORMULA-RULES-ITERATOR", 2, 2, false);
        declareFunction(me, "count_alexandria_nested_formula_rules", "COUNT-ALEXANDRIA-NESTED-FORMULA-RULES", 2, 3, false);
        declareFunction(me, "create_alexandria_nested_formula_rules_relevant_mt_iterator_state", "CREATE-ALEXANDRIA-NESTED-FORMULA-RULES-RELEVANT-MT-ITERATOR-STATE", 2, 2, false);
        declareFunction(me, "new_alexandria_nested_formula_rules_relevant_mt_iterator", "NEW-ALEXANDRIA-NESTED-FORMULA-RULES-RELEVANT-MT-ITERATOR", 2, 2, false);
        declareFunction(me, "count_alexandria_nested_formula_rules_relevant_mt", "COUNT-ALEXANDRIA-NESTED-FORMULA-RULES-RELEVANT-MT", 2, 2, false);
        declareFunction(me, "create_alexandria_function_extent_iterator_state", "CREATE-ALEXANDRIA-FUNCTION-EXTENT-ITERATOR-STATE", 1, 2, false);
        declareFunction(me, "new_alexandria_function_extent_iterator", "NEW-ALEXANDRIA-FUNCTION-EXTENT-ITERATOR", 1, 2, false);
        declareFunction(me, "count_alexandria_nart_arg_index", "COUNT-ALEXANDRIA-NART-ARG-INDEX", 1, 2, false);
        declareFunction(me, "create_alexandria_nart_arg_index_iterator_state", "CREATE-ALEXANDRIA-NART-ARG-INDEX-ITERATOR-STATE", 1, 2, false);
        declareFunction(me, "new_alexandria_nart_arg_index_iterator", "NEW-ALEXANDRIA-NART-ARG-INDEX-ITERATOR", 1, 2, false);
        declareFunction(me, "create_alexandria_rules_with_cnf_iterator_state", "CREATE-ALEXANDRIA-RULES-WITH-CNF-ITERATOR-STATE", 1, 0, false);
        declareFunction(me, "new_alexandria_rules_with_cnf_iterator", "NEW-ALEXANDRIA-RULES-WITH-CNF-ITERATOR", 1, 0, false);
        declareFunction(me, "does_constant_exist_with_name_or_guid", "DOES-CONSTANT-EXIST-WITH-NAME-OR-GUID", 2, 1, false);
        declareFunction(me, "clear_alexandria_caches", "CLEAR-ALEXANDRIA-CACHES", 0, 0, false);
        declareFunction(me, "term_assertion_usage_count_estimate", "TERM-ASSERTION-USAGE-COUNT-ESTIMATE", 1, 0, false);
        declareFunction(me, "estimated_cost_for_indexing_on_term", "ESTIMATED-COST-FOR-INDEXING-ON-TERM", 1, 0, false);
        declareFunction(me, "create_alexandria_assertion_asserted_by_iterator_state", "CREATE-ALEXANDRIA-ASSERTION-ASSERTED-BY-ITERATOR-STATE", 1, 1, false);
        declareFunction(me, "new_alexandria_assertion_asserted_by_iterator", "NEW-ALEXANDRIA-ASSERTION-ASSERTED-BY-ITERATOR", 1, 1, false);
        declareFunction(me, "count_alexandria_rules_assertion_asserted_by", "COUNT-ALEXANDRIA-RULES-ASSERTION-ASSERTED-BY", 1, 0, false);
        declareFunction(me, "create_alexandria_assertion_asserted_why_iterator_state", "CREATE-ALEXANDRIA-ASSERTION-ASSERTED-WHY-ITERATOR-STATE", 1, 1, false);
        declareFunction(me, "new_alexandria_assertion_asserted_why_iterator", "NEW-ALEXANDRIA-ASSERTION-ASSERTED-WHY-ITERATOR", 1, 1, false);
        declareFunction(me, "count_alexandria_rules_assertion_asserted_why", "COUNT-ALEXANDRIA-RULES-ASSERTION-ASSERTED-WHY", 1, 0, false);
        declareFunction(me, "create_alexandria_assertion_asserted_on_iterator_state", "CREATE-ALEXANDRIA-ASSERTION-ASSERTED-ON-ITERATOR-STATE", 1, 1, false);
        declareFunction(me, "new_alexandria_assertion_asserted_on_iterator", "NEW-ALEXANDRIA-ASSERTION-ASSERTED-ON-ITERATOR", 1, 1, false);
        declareFunction(me, "count_alexandria_rules_assertion_asserted_on", "COUNT-ALEXANDRIA-RULES-ASSERTION-ASSERTED-ON", 1, 1, false);
        declareFunction(me, "all_genl_mts_alexandria", "ALL-GENL-MTS-ALEXANDRIA", 3, 0, false);
        declareFunction(me, "all_spec_mts_alexandria", "ALL-SPEC-MTS-ALEXANDRIA", 3, 0, false);
        declareFunction(me, "create_alexandria_defns_cache_iterator_state", "CREATE-ALEXANDRIA-DEFNS-CACHE-ITERATOR-STATE", 1, 0, false);
        declareFunction(me, "new_alexandria_defns_cache_iterator", "NEW-ALEXANDRIA-DEFNS-CACHE-ITERATOR", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_alexandria_iterators_file() {
        return NIL;
    }

    public static SubLObject setup_alexandria_iterators_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_alexandria_iterators_file();
    }

    @Override
    public void initializeVariables() {
        init_alexandria_iterators_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_alexandria_iterators_file();
    }

    static {




























































    }
}

/**
 * Total time: 192 ms
 */
