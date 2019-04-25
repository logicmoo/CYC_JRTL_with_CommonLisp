package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class alexandria_iterators extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.alexandria_iterators";
    public static final String myFingerPrint = "b3cf0b913421dd98f5515670cd813777bbb66dfcb31f642d9248bc9ee59373f2";
    private static final SubLSymbol $sym0$ALEXANDRIA_KB_STORE_ITERATOR_DONE;
    private static final SubLSymbol $sym1$ALEXANDRIA_KB_STORE_ITERATOR_NEXT;
    private static final SubLSymbol $sym2$ALEXANDRIA_KB_STORE_ITERATOR_FINALIZE;
    private static final SubLSymbol $sym3$CREATE_ALEXANDRIA_GAFS_MATCHING_FORMULA_ITERATOR_STATE;
    private static final SubLSymbol $sym4$CREATE_ALEXANDRIA_GAFS_MATCHING_FORMULA_RELEVANT_MT_AND_PRED_ITER;
    private static final SubLSymbol $sym5$CREATE_ALEXANDRIA_NATS_MATCHING_FORMULA_ITERATOR;
    private static final SubLSymbol $sym6$CREATE_ALEXANDRIA_REIFIABLE_FUNCTION_EXTENT_ITERATOR_STATE;
    private static final SubLSymbol $sym7$CREATE_ALEXANDRIA_ALL_FORTS_ITERATOR_STATE;
    private static final SubLSymbol $sym8$CREATE_ALEXANDRIA_ALL_GAFS_ITERATOR_STATE;
    private static final SubLSymbol $sym9$CREATE_ALEXANDRIA_ALL_RULES_ITERATOR_STATE;
    private static final SubLSymbol $sym10$CREATE_ALEXANDRIA_ALL_UNBOUND_RULES_ITERATOR_STATE;
    private static final SubLSymbol $sym11$CREATE_ALEXANDRIA_ALL_UNBOUND_RULES_RELEVANT_MT_ITERATOR_STATE;
    private static final SubLSymbol $sym12$CREATE_ALEXANDRIA_ALL_ASSERTIONS_ITERATOR_STATE;
    private static final SubLSymbol $sym13$CREATE_ALEXANDRIA_ALL_BIG_INTEGERS_ITERATOR_STATE;
    private static final SubLSymbol $sym14$CREATE_ALEXANDRIA_ALL_INTEGERS_ITERATOR_STATE;
    private static final SubLSymbol $sym15$CREATE_ALEXANDRIA_ALL_BOOKKEEPING_GAFS_ITERATOR_STATE;
    private static final SubLSymbol $sym16$CREATE_ALEXANDRIA_ALL_CONSTANTS_ITERATOR_STATE;
    private static final SubLSymbol $sym17$CREATE_ALEXANDRIA_ALL_NARTS_ITERATOR_STATE;
    private static final SubLSymbol $sym18$CREATE_ALEXANDRIA_ALL_DEDUCTIONS_ITERATOR_STATE;
    private static final SubLSymbol $sym19$CREATE_ALEXANDRIA_ALL_FLOATS_ITERATOR_STATE;
    private static final SubLSymbol $sym20$CREATE_ALEXANDRIA_ALL_FORMULAS_ITERATOR_STATE;
    private static final SubLSymbol $sym21$CREATE_ALEXANDRIA_ALL_HL_SUPPORTS_ITERATOR_STATE;
    private static final SubLSymbol $sym22$CREATE_ALEXANDRIA_ALL_KB_HL_SUPPORTS_ITERATOR_STATE;
    private static final SubLSymbol $sym23$CREATE_ALEXANDRIA_ALL_ITEMS_ITERATOR_STATE;
    private static final SubLSymbol $sym24$CREATE_ALEXANDRIA_ALL_STRINGS_ITERATOR_STATE;
    private static final SubLSymbol $sym25$CREATE_ALEXANDRIA_ALL_NUMBERS_ITERATOR_STATE;
    private static final SubLSymbol $sym26$CREATE_ALEXANDRIA_ALL_SUBL_EXPRESSIONS_ITERATOR_STATE;
    private static final SubLSymbol $sym27$CREATE_ALEXANDRIA_ALL_VARIABLES_ITERATOR_STATE;
    private static final SubLSymbol $sym28$CREATE_ALEXANDRIA_ALL_UNREPRESENTED_TERMS_ITERATOR_STATE;
    private static final SubLSymbol $sym29$CREATE_ALEXANDRIA_TERM_ASSERTIONS_ITERATOR_STATE;
    private static final SubLSymbol $sym30$CREATE_ALEXANDRIA_GAF_ARG0_ITERATOR_STATE;
    private static final SubLSymbol $sym31$CREATE_ALEXANDRIA_GAF_ARG0_RELEVANT_MT_ITERATOR_STATE;
    private static final SubLSymbol $sym32$CREATE_ALEXANDRIA_GAF_ARG_ITERATOR_STATE;
    private static final SubLSymbol $sym33$CREATE_ALEXANDRIA_GAF_ARG_RELEVANT_MT_AND_PRED_ITERATOR_STATE;
    private static final SubLSymbol $sym34$CREATE_ALEXANDRIA_GAF_ARG_RELEVANT_MT_ITERATOR_STATE;
    private static final SubLSymbol $sym35$CREATE_ALEXANDRIA_GAF_ARG_FORMULA_ITERATOR_STATE;
    private static final SubLSymbol $sym36$CREATE_ALEXANDRIA_GAF_ARG_FORMULA_RELEVANT_MT_AND_PRED_ITERATOR_S;
    private static final SubLSymbol $sym37$CREATE_ALEXANDRIA_GAF_ARG_FORMULA_RELEVANT_MT_ITERATOR_STATE;
    private static final SubLSymbol $sym38$CREATE_ALEXANDRIA_GAF_ARG_VALUES_ITERATOR_STATE;
    private static final SubLSymbol $sym39$CREATE_ALEXANDRIA_GAF_ARG_VALUES_RELEVANT_MT_AND_PRED_ITERATOR_ST;
    private static final SubLSymbol $sym40$CREATE_ALEXANDRIA_GAF_ARG_VALUES_RELEVANT_MT_ITERATOR_STATE;
    private static final SubLSymbol $sym41$CREATE_ALEXANDRIA_GAF_ARG_ARG_RELEVANT_MT_AND_PRED_ITERATOR_STATE;
    private static final SubLSymbol $sym42$CREATE_ALEXANDRIA_MT_CONTENTS_ITERATOR_STATE_RELEVANT_MT;
    private static final SubLSymbol $sym43$CREATE_ALEXANDRIA_MT_CONTENTS_ITERATOR_STATE;
    private static final SubLSymbol $sym44$CREATE_ALEXANDRIA_OTHER_INDEX_ITERATOR_STATE;
    private static final SubLSymbol $sym45$CREATE_ALEXANDRIA_OTHER_INDEX_RELEVANT_MT_AND_PRED_ITERATOR_STATE;
    private static final SubLSymbol $sym46$CREATE_ALEXANDRIA_OTHER_INDEX_RELEVANT_MT_ITERATOR_STATE;
    private static final SubLSymbol $sym47$CREATE_ALEXANDRIA_RULES_WITH_PRED_RELEVANT_MT_ITERATOR_STATE;
    private static final SubLSymbol $sym48$CREATE_ALEXANDRIA_RULES_WITH_PRED_AND_ARG2_ITERATOR_STATE;
    private static final SubLSymbol $sym49$CREATE_ALEXANDRIA_RULES_WITH_PRED_AND_ARG2_RELEVANT_MT_ITERATOR_S;
    private static final SubLSymbol $sym50$CREATE_ALEXANDRIA_NESTED_FORMULA_RULES_ITERATOR_STATE;
    private static final SubLSymbol $sym51$CREATE_ALEXANDRIA_NESTED_FORMULA_RULES_RELEVANT_MT_ITERATOR_STATE;
    private static final SubLSymbol $sym52$CREATE_ALEXANDRIA_FUNCTION_EXTENT_ITERATOR_STATE;
    private static final SubLSymbol $sym53$CREATE_ALEXANDRIA_NART_ARG_INDEX_ITERATOR_STATE;
    private static final SubLSymbol $kw54$UNKNOWN;
    private static final SubLSymbol $kw55$LATENCY;
    private static final SubLSymbol $sym56$CREATE_ALEXANDRIA_ASSERTION_ASSERTED_BY_ITERATOR_STATE;
    private static final SubLSymbol $sym57$CREATE_ALEXANDRIA_ASSERTION_ASSERTED_WHY_ITERATOR_STATE;
    private static final SubLSymbol $sym58$CREATE_ALEXANDRIA_ASSERTION_ASSERTED_ON_ITERATOR_STATE;
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 710L)
    public static SubLObject new_alexandria_iterator(final SubLObject iterator_state_creation_func, final SubLObject args_list) {
        final SubLObject iterator_state = Functions.apply(iterator_state_creation_func, args_list);
        if (alexandria_iterators.NIL != iterator_state) {
            return iteration.new_iterator(iterator_state, (SubLObject)alexandria_iterators.$sym0$ALEXANDRIA_KB_STORE_ITERATOR_DONE, (SubLObject)alexandria_iterators.$sym1$ALEXANDRIA_KB_STORE_ITERATOR_NEXT, (SubLObject)alexandria_iterators.$sym2$ALEXANDRIA_KB_STORE_ITERATOR_FINALIZE);
        }
        return iteration.new_null_iterator();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 1088L)
    public static SubLObject alexandria_kb_store_iterator_done(final SubLObject state) {
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 1366L)
    public static SubLObject alexandria_kb_store_iterator_next(final SubLObject state) {
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 1663L)
    public static SubLObject alexandria_kb_store_iterator_finalize(final SubLObject state) {
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 1949L)
    public static SubLObject count_alexandria_gafs_matching_formula(final SubLObject formula, SubLObject mt, SubLObject truth, SubLObject direction, SubLObject strength) {
        if (mt == alexandria_iterators.UNPROVIDED) {
            mt = (SubLObject)alexandria_iterators.NIL;
        }
        if (truth == alexandria_iterators.UNPROVIDED) {
            truth = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        if (strength == alexandria_iterators.UNPROVIDED) {
            strength = (SubLObject)alexandria_iterators.NIL;
        }
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 2419L)
    public static SubLObject count_alexandria_gafs_matching_formula_relevant_mt_and_pred(final SubLObject formula, SubLObject truth, SubLObject direction, SubLObject strength) {
        if (truth == alexandria_iterators.UNPROVIDED) {
            truth = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        if (strength == alexandria_iterators.UNPROVIDED) {
            strength = (SubLObject)alexandria_iterators.NIL;
        }
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 2840L)
    public static SubLObject create_alexandria_gafs_matching_formula_iterator_state(final SubLObject formula, SubLObject mt, SubLObject truth, SubLObject direction, SubLObject strength) {
        if (mt == alexandria_iterators.UNPROVIDED) {
            mt = (SubLObject)alexandria_iterators.NIL;
        }
        if (truth == alexandria_iterators.UNPROVIDED) {
            truth = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        if (strength == alexandria_iterators.UNPROVIDED) {
            strength = (SubLObject)alexandria_iterators.NIL;
        }
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 3342L)
    public static SubLObject new_alexandria_gafs_matching_formula_iterator(final SubLObject formula, SubLObject mt, SubLObject truth, SubLObject direction, SubLObject strength) {
        if (mt == alexandria_iterators.UNPROVIDED) {
            mt = (SubLObject)alexandria_iterators.NIL;
        }
        if (truth == alexandria_iterators.UNPROVIDED) {
            truth = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        if (strength == alexandria_iterators.UNPROVIDED) {
            strength = (SubLObject)alexandria_iterators.NIL;
        }
        return new_alexandria_iterator((SubLObject)alexandria_iterators.$sym3$CREATE_ALEXANDRIA_GAFS_MATCHING_FORMULA_ITERATOR_STATE, (SubLObject)ConsesLow.list(formula, mt, truth, direction, strength));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 3586L)
    public static SubLObject create_alexandria_gafs_matching_formula_relevant_mt_and_pred_iterator_state(final SubLObject formula, SubLObject truth, SubLObject direction, SubLObject strength) {
        if (truth == alexandria_iterators.UNPROVIDED) {
            truth = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        if (strength == alexandria_iterators.UNPROVIDED) {
            strength = (SubLObject)alexandria_iterators.NIL;
        }
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 4121L)
    public static SubLObject new_alexandria_gafs_matching_formula_relevant_mt_and_pred_iterator(final SubLObject formula, SubLObject truth, SubLObject direction, SubLObject strength) {
        if (truth == alexandria_iterators.UNPROVIDED) {
            truth = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        if (strength == alexandria_iterators.UNPROVIDED) {
            strength = (SubLObject)alexandria_iterators.NIL;
        }
        return new_alexandria_iterator((SubLObject)alexandria_iterators.$sym4$CREATE_ALEXANDRIA_GAFS_MATCHING_FORMULA_RELEVANT_MT_AND_PRED_ITER, (SubLObject)ConsesLow.list(formula, truth, direction, strength));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 4401L)
    public static SubLObject create_alexandria_nats_matching_formula_iterator(final SubLObject formula, final SubLObject type) {
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 4812L)
    public static SubLObject new_alexandria_nats_matching_formula_iterator(final SubLObject formula, final SubLObject type) {
        return new_alexandria_iterator((SubLObject)alexandria_iterators.$sym5$CREATE_ALEXANDRIA_NATS_MATCHING_FORMULA_ITERATOR, (SubLObject)ConsesLow.list(formula, type));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 4994L)
    public static SubLObject count_alexandria_nats_matching_formula(final SubLObject formula, final SubLObject type) {
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 5304L)
    public static SubLObject count_alexandria_reifiable_function_extent(final SubLObject function) {
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 5691L)
    public static SubLObject create_alexandria_reifiable_function_extent_iterator_state(final SubLObject function) {
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 6012L)
    public static SubLObject new_alexandria_reifiable_function_extent_iterator(final SubLObject function) {
        return new_alexandria_iterator((SubLObject)alexandria_iterators.$sym6$CREATE_ALEXANDRIA_REIFIABLE_FUNCTION_EXTENT_ITERATOR_STATE, (SubLObject)ConsesLow.list(function));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 6200L)
    public static SubLObject create_alexandria_all_forts_iterator_state() {
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 6550L)
    public static SubLObject new_alexandria_all_forts_iterator() {
        return new_alexandria_iterator((SubLObject)alexandria_iterators.$sym7$CREATE_ALEXANDRIA_ALL_FORTS_ITERATOR_STATE, (SubLObject)alexandria_iterators.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 6686L)
    public static SubLObject create_alexandria_all_gafs_iterator_state() {
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 7034L)
    public static SubLObject new_alexandria_all_gafs_iterator() {
        return new_alexandria_iterator((SubLObject)alexandria_iterators.$sym8$CREATE_ALEXANDRIA_ALL_GAFS_ITERATOR_STATE, (SubLObject)alexandria_iterators.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 7168L)
    public static SubLObject create_alexandria_all_rules_iterator_state() {
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 7518L)
    public static SubLObject new_alexandria_all_rules_iterator() {
        return new_alexandria_iterator((SubLObject)alexandria_iterators.$sym9$CREATE_ALEXANDRIA_ALL_RULES_ITERATOR_STATE, (SubLObject)alexandria_iterators.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 7654L)
    public static SubLObject create_alexandria_all_unbound_rules_iterator_state(SubLObject sense, SubLObject direction) {
        if (sense == alexandria_iterators.UNPROVIDED) {
            sense = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 8072L)
    public static SubLObject new_alexandria_all_unbound_rules_iterator(SubLObject sense, SubLObject direction) {
        if (sense == alexandria_iterators.UNPROVIDED) {
            sense = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        return new_alexandria_iterator((SubLObject)alexandria_iterators.$sym10$CREATE_ALEXANDRIA_ALL_UNBOUND_RULES_ITERATOR_STATE, (SubLObject)ConsesLow.list(sense, direction));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 8268L)
    public static SubLObject create_alexandria_all_unbound_rules_relevant_mt_iterator_state(SubLObject sense, SubLObject direction) {
        if (sense == alexandria_iterators.UNPROVIDED) {
            sense = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 8726L)
    public static SubLObject new_alexandria_all_unbound_rules_relevant_mt_iterator(SubLObject sense, SubLObject direction) {
        if (sense == alexandria_iterators.UNPROVIDED) {
            sense = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        return new_alexandria_iterator((SubLObject)alexandria_iterators.$sym11$CREATE_ALEXANDRIA_ALL_UNBOUND_RULES_RELEVANT_MT_ITERATOR_STATE, (SubLObject)ConsesLow.list(sense, direction));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 8946L)
    public static SubLObject create_alexandria_all_assertions_iterator_state() {
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 9306L)
    public static SubLObject new_alexandria_all_assertions_iterator() {
        return new_alexandria_iterator((SubLObject)alexandria_iterators.$sym12$CREATE_ALEXANDRIA_ALL_ASSERTIONS_ITERATOR_STATE, (SubLObject)alexandria_iterators.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 9452L)
    public static SubLObject create_alexandria_all_big_integers_iterator_state() {
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 9816L)
    public static SubLObject new_alexandria_all_big_integers_iterator() {
        return new_alexandria_iterator((SubLObject)alexandria_iterators.$sym13$CREATE_ALEXANDRIA_ALL_BIG_INTEGERS_ITERATOR_STATE, (SubLObject)alexandria_iterators.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 9966L)
    public static SubLObject create_alexandria_all_integers_iterator_state() {
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 10322L)
    public static SubLObject new_alexandria_all_integers_iterator() {
        return new_alexandria_iterator((SubLObject)alexandria_iterators.$sym14$CREATE_ALEXANDRIA_ALL_INTEGERS_ITERATOR_STATE, (SubLObject)alexandria_iterators.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 10464L)
    public static SubLObject create_alexandria_all_bookkeeping_gafs_iterator_state() {
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 10827L)
    public static SubLObject new_alexandria_all_bookkeeping_gafs_iterator() {
        return new_alexandria_iterator((SubLObject)alexandria_iterators.$sym15$CREATE_ALEXANDRIA_ALL_BOOKKEEPING_GAFS_ITERATOR_STATE, (SubLObject)alexandria_iterators.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 10985L)
    public static SubLObject create_alexandria_all_constants_iterator_state() {
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 11343L)
    public static SubLObject new_alexandria_all_constants_iterator() {
        return new_alexandria_iterator((SubLObject)alexandria_iterators.$sym16$CREATE_ALEXANDRIA_ALL_CONSTANTS_ITERATOR_STATE, (SubLObject)alexandria_iterators.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 11487L)
    public static SubLObject create_alexandria_all_narts_iterator_state() {
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 11837L)
    public static SubLObject new_alexandria_all_narts_iterator() {
        return new_alexandria_iterator((SubLObject)alexandria_iterators.$sym17$CREATE_ALEXANDRIA_ALL_NARTS_ITERATOR_STATE, (SubLObject)alexandria_iterators.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 11973L)
    public static SubLObject create_alexandria_all_deductions_iterator_state() {
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 12333L)
    public static SubLObject new_alexandria_all_deductions_iterator() {
        return new_alexandria_iterator((SubLObject)alexandria_iterators.$sym18$CREATE_ALEXANDRIA_ALL_DEDUCTIONS_ITERATOR_STATE, (SubLObject)alexandria_iterators.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 12479L)
    public static SubLObject create_alexandria_all_floats_iterator_state() {
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 12831L)
    public static SubLObject new_alexandria_all_floats_iterator() {
        return new_alexandria_iterator((SubLObject)alexandria_iterators.$sym19$CREATE_ALEXANDRIA_ALL_FLOATS_ITERATOR_STATE, (SubLObject)alexandria_iterators.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 12969L)
    public static SubLObject create_alexandria_all_formulas_iterator_state() {
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 13325L)
    public static SubLObject new_alexandria_all_formulas_iterator() {
        return new_alexandria_iterator((SubLObject)alexandria_iterators.$sym20$CREATE_ALEXANDRIA_ALL_FORMULAS_ITERATOR_STATE, (SubLObject)alexandria_iterators.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 13467L)
    public static SubLObject create_alexandria_all_hl_supports_iterator_state() {
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 13829L)
    public static SubLObject new_alexandria_all_hl_supports_iterator() {
        return new_alexandria_iterator((SubLObject)alexandria_iterators.$sym21$CREATE_ALEXANDRIA_ALL_HL_SUPPORTS_ITERATOR_STATE, (SubLObject)alexandria_iterators.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 13977L)
    public static SubLObject create_alexandria_all_kb_hl_supports_iterator_state() {
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 14345L)
    public static SubLObject new_alexandria_all_kb_hl_supports_iterator() {
        return new_alexandria_iterator((SubLObject)alexandria_iterators.$sym22$CREATE_ALEXANDRIA_ALL_KB_HL_SUPPORTS_ITERATOR_STATE, (SubLObject)alexandria_iterators.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 14499L)
    public static SubLObject create_alexandria_all_items_iterator_state() {
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 14849L)
    public static SubLObject new_alexandria_all_items_iterator() {
        return new_alexandria_iterator((SubLObject)alexandria_iterators.$sym23$CREATE_ALEXANDRIA_ALL_ITEMS_ITERATOR_STATE, (SubLObject)alexandria_iterators.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 14985L)
    public static SubLObject create_alexandria_all_strings_iterator_state() {
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 15338L)
    public static SubLObject new_alexandria_all_strings_iterator() {
        return new_alexandria_iterator((SubLObject)alexandria_iterators.$sym24$CREATE_ALEXANDRIA_ALL_STRINGS_ITERATOR_STATE, (SubLObject)alexandria_iterators.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 15478L)
    public static SubLObject create_alexandria_all_numbers_iterator_state() {
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 15832L)
    public static SubLObject new_alexandria_all_numbers_iterator() {
        return new_alexandria_iterator((SubLObject)alexandria_iterators.$sym25$CREATE_ALEXANDRIA_ALL_NUMBERS_ITERATOR_STATE, (SubLObject)alexandria_iterators.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 15972L)
    public static SubLObject create_alexandria_all_subl_expressions_iterator_state() {
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 16344L)
    public static SubLObject new_alexandria_all_subl_expressions_iterator() {
        return new_alexandria_iterator((SubLObject)alexandria_iterators.$sym26$CREATE_ALEXANDRIA_ALL_SUBL_EXPRESSIONS_ITERATOR_STATE, (SubLObject)alexandria_iterators.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 16502L)
    public static SubLObject create_alexandria_all_variables_iterator_state() {
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 16860L)
    public static SubLObject new_alexandria_all_variables_iterator() {
        return new_alexandria_iterator((SubLObject)alexandria_iterators.$sym27$CREATE_ALEXANDRIA_ALL_VARIABLES_ITERATOR_STATE, (SubLObject)alexandria_iterators.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 17004L)
    public static SubLObject create_alexandria_all_unrepresented_terms_iterator_state() {
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 17382L)
    public static SubLObject new_alexandria_all_unrepresented_terms_iterator() {
        return new_alexandria_iterator((SubLObject)alexandria_iterators.$sym28$CREATE_ALEXANDRIA_ALL_UNREPRESENTED_TERMS_ITERATOR_STATE, (SubLObject)alexandria_iterators.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 17546L)
    public static SubLObject create_alexandria_term_assertions_relevant_mt_pred_iterator_state(final SubLObject v_term, SubLObject type, SubLObject truth, SubLObject direction, SubLObject nesting_level) {
        if (type == alexandria_iterators.UNPROVIDED) {
            type = (SubLObject)alexandria_iterators.NIL;
        }
        if (truth == alexandria_iterators.UNPROVIDED) {
            truth = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        if (nesting_level == alexandria_iterators.UNPROVIDED) {
            nesting_level = (SubLObject)alexandria_iterators.NIL;
        }
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 18082L)
    public static SubLObject new_alexandria_term_assertions_relevant_mt_pred_iterator(final SubLObject v_term, SubLObject type, SubLObject truth, SubLObject direction, SubLObject nesting_level) {
        if (type == alexandria_iterators.UNPROVIDED) {
            type = (SubLObject)alexandria_iterators.NIL;
        }
        if (truth == alexandria_iterators.UNPROVIDED) {
            truth = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        if (nesting_level == alexandria_iterators.UNPROVIDED) {
            nesting_level = (SubLObject)alexandria_iterators.NIL;
        }
        return new_alexandria_iterator((SubLObject)alexandria_iterators.$sym29$CREATE_ALEXANDRIA_TERM_ASSERTIONS_ITERATOR_STATE, (SubLObject)ConsesLow.list(v_term, type, truth, direction, nesting_level));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 18339L)
    public static SubLObject count_alexandria_term_assertions_relevant_mt_pred(final SubLObject v_term, SubLObject type, SubLObject truth, SubLObject direction, SubLObject nesting_level) {
        if (type == alexandria_iterators.UNPROVIDED) {
            type = (SubLObject)alexandria_iterators.NIL;
        }
        if (truth == alexandria_iterators.UNPROVIDED) {
            truth = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        if (nesting_level == alexandria_iterators.UNPROVIDED) {
            nesting_level = (SubLObject)alexandria_iterators.NIL;
        }
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 18521L)
    public static SubLObject create_alexandria_term_assertions_iterator_state(final SubLObject v_term, SubLObject type, SubLObject truth, SubLObject direction, SubLObject nesting_level) {
        if (type == alexandria_iterators.UNPROVIDED) {
            type = (SubLObject)alexandria_iterators.NIL;
        }
        if (truth == alexandria_iterators.UNPROVIDED) {
            truth = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        if (nesting_level == alexandria_iterators.UNPROVIDED) {
            nesting_level = (SubLObject)alexandria_iterators.NIL;
        }
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 19023L)
    public static SubLObject new_alexandria_term_assertions_iterator(final SubLObject v_term, SubLObject type, SubLObject truth, SubLObject direction, SubLObject nesting_level) {
        if (type == alexandria_iterators.UNPROVIDED) {
            type = (SubLObject)alexandria_iterators.NIL;
        }
        if (truth == alexandria_iterators.UNPROVIDED) {
            truth = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        if (nesting_level == alexandria_iterators.UNPROVIDED) {
            nesting_level = (SubLObject)alexandria_iterators.NIL;
        }
        return new_alexandria_iterator((SubLObject)alexandria_iterators.$sym29$CREATE_ALEXANDRIA_TERM_ASSERTIONS_ITERATOR_STATE, (SubLObject)ConsesLow.list(v_term, type, truth, direction, nesting_level));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 19263L)
    public static SubLObject count_alexandria_term_assertions(final SubLObject v_term, SubLObject type, SubLObject truth, SubLObject direction, SubLObject nesting_level) {
        if (type == alexandria_iterators.UNPROVIDED) {
            type = (SubLObject)alexandria_iterators.NIL;
        }
        if (truth == alexandria_iterators.UNPROVIDED) {
            truth = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        if (nesting_level == alexandria_iterators.UNPROVIDED) {
            nesting_level = (SubLObject)alexandria_iterators.NIL;
        }
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 19428L)
    public static SubLObject create_alexandria_gaf_arg0_iterator_state(final SubLObject predicate, SubLObject truth, SubLObject direction, SubLObject mt) {
        if (truth == alexandria_iterators.UNPROVIDED) {
            truth = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        if (mt == alexandria_iterators.UNPROVIDED) {
            mt = (SubLObject)alexandria_iterators.NIL;
        }
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 19883L)
    public static SubLObject new_alexandria_gaf_arg0_iterator(final SubLObject predicate, SubLObject truth, SubLObject direction, SubLObject mt) {
        if (truth == alexandria_iterators.UNPROVIDED) {
            truth = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        if (mt == alexandria_iterators.UNPROVIDED) {
            mt = (SubLObject)alexandria_iterators.NIL;
        }
        return new_alexandria_iterator((SubLObject)alexandria_iterators.$sym30$CREATE_ALEXANDRIA_GAF_ARG0_ITERATOR_STATE, (SubLObject)ConsesLow.list(predicate, truth, direction, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 20087L)
    public static SubLObject count_alexandria_gaf_arg0(final SubLObject predicate, SubLObject truth, SubLObject direction, SubLObject mt) {
        if (truth == alexandria_iterators.UNPROVIDED) {
            truth = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        if (mt == alexandria_iterators.UNPROVIDED) {
            mt = (SubLObject)alexandria_iterators.NIL;
        }
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 20428L)
    public static SubLObject create_alexandria_gaf_arg0_relevant_mt_iterator_state(final SubLObject predicate, SubLObject truth, SubLObject direction) {
        if (truth == alexandria_iterators.UNPROVIDED) {
            truth = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 20898L)
    public static SubLObject new_alexandria_gaf_arg0_iterator_relevant_mt(final SubLObject predicate, SubLObject truth, SubLObject direction) {
        if (truth == alexandria_iterators.UNPROVIDED) {
            truth = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        return new_alexandria_iterator((SubLObject)alexandria_iterators.$sym31$CREATE_ALEXANDRIA_GAF_ARG0_RELEVANT_MT_ITERATOR_STATE, (SubLObject)ConsesLow.list(predicate, truth, direction));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 21120L)
    public static SubLObject count_alexandria_gaf_arg0_relevant_mt(final SubLObject predicate, SubLObject truth, SubLObject direction, SubLObject max_count) {
        if (truth == alexandria_iterators.UNPROVIDED) {
            truth = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        if (max_count == alexandria_iterators.UNPROVIDED) {
            max_count = (SubLObject)alexandria_iterators.NIL;
        }
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 21506L)
    public static SubLObject create_alexandria_gaf_arg_iterator_state(final SubLObject v_term, SubLObject index, SubLObject predicate, SubLObject truth, SubLObject direction) {
        if (index == alexandria_iterators.UNPROVIDED) {
            index = (SubLObject)alexandria_iterators.NIL;
        }
        if (predicate == alexandria_iterators.UNPROVIDED) {
            predicate = (SubLObject)alexandria_iterators.NIL;
        }
        if (truth == alexandria_iterators.UNPROVIDED) {
            truth = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 22004L)
    public static SubLObject new_alexandria_gaf_arg_iterator(final SubLObject v_term, SubLObject index, SubLObject predicate, SubLObject truth, SubLObject direction) {
        if (index == alexandria_iterators.UNPROVIDED) {
            index = (SubLObject)alexandria_iterators.NIL;
        }
        if (predicate == alexandria_iterators.UNPROVIDED) {
            predicate = (SubLObject)alexandria_iterators.NIL;
        }
        if (truth == alexandria_iterators.UNPROVIDED) {
            truth = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        return new_alexandria_iterator((SubLObject)alexandria_iterators.$sym32$CREATE_ALEXANDRIA_GAF_ARG_ITERATOR_STATE, (SubLObject)ConsesLow.list(v_term, index, predicate, truth, direction));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 22222L)
    public static SubLObject create_alexandria_gaf_arg_relevant_mt_and_pred_iterator_state(final SubLObject v_term, SubLObject index, SubLObject predicate, SubLObject truth, SubLObject direction) {
        if (index == alexandria_iterators.UNPROVIDED) {
            index = (SubLObject)alexandria_iterators.NIL;
        }
        if (predicate == alexandria_iterators.UNPROVIDED) {
            predicate = (SubLObject)alexandria_iterators.NIL;
        }
        if (truth == alexandria_iterators.UNPROVIDED) {
            truth = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 22659L)
    public static SubLObject new_alexandria_gaf_arg_relevant_mt_and_pred_iterator(final SubLObject v_term, SubLObject index, SubLObject predicate, SubLObject truth, SubLObject direction) {
        if (index == alexandria_iterators.UNPROVIDED) {
            index = (SubLObject)alexandria_iterators.NIL;
        }
        if (predicate == alexandria_iterators.UNPROVIDED) {
            predicate = (SubLObject)alexandria_iterators.NIL;
        }
        if (truth == alexandria_iterators.UNPROVIDED) {
            truth = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        return new_alexandria_iterator((SubLObject)alexandria_iterators.$sym33$CREATE_ALEXANDRIA_GAF_ARG_RELEVANT_MT_AND_PRED_ITERATOR_STATE, (SubLObject)ConsesLow.list(v_term, index, predicate, truth, direction));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 22919L)
    public static SubLObject create_alexandria_gaf_arg_relevant_mt_iterator_state(final SubLObject v_term, SubLObject index, SubLObject predicate, SubLObject truth, SubLObject direction) {
        if (index == alexandria_iterators.UNPROVIDED) {
            index = (SubLObject)alexandria_iterators.NIL;
        }
        if (predicate == alexandria_iterators.UNPROVIDED) {
            predicate = (SubLObject)alexandria_iterators.NIL;
        }
        if (truth == alexandria_iterators.UNPROVIDED) {
            truth = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 23338L)
    public static SubLObject new_alexandria_gaf_arg_relevant_mt_iterator(final SubLObject v_term, SubLObject index, SubLObject predicate, SubLObject truth, SubLObject direction) {
        if (index == alexandria_iterators.UNPROVIDED) {
            index = (SubLObject)alexandria_iterators.NIL;
        }
        if (predicate == alexandria_iterators.UNPROVIDED) {
            predicate = (SubLObject)alexandria_iterators.NIL;
        }
        if (truth == alexandria_iterators.UNPROVIDED) {
            truth = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        return new_alexandria_iterator((SubLObject)alexandria_iterators.$sym34$CREATE_ALEXANDRIA_GAF_ARG_RELEVANT_MT_ITERATOR_STATE, (SubLObject)ConsesLow.list(v_term, index, predicate, truth, direction));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 23580L)
    public static SubLObject create_alexandria_gaf_arg_formula_iterator_state(final SubLObject v_term, SubLObject index, SubLObject predicate, SubLObject truth, SubLObject direction) {
        if (index == alexandria_iterators.UNPROVIDED) {
            index = (SubLObject)alexandria_iterators.NIL;
        }
        if (predicate == alexandria_iterators.UNPROVIDED) {
            predicate = (SubLObject)alexandria_iterators.NIL;
        }
        if (truth == alexandria_iterators.UNPROVIDED) {
            truth = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 24073L)
    public static SubLObject new_alexandria_gaf_arg_formula_iterator(final SubLObject v_term, SubLObject index, SubLObject predicate, SubLObject truth, SubLObject direction) {
        if (index == alexandria_iterators.UNPROVIDED) {
            index = (SubLObject)alexandria_iterators.NIL;
        }
        if (predicate == alexandria_iterators.UNPROVIDED) {
            predicate = (SubLObject)alexandria_iterators.NIL;
        }
        if (truth == alexandria_iterators.UNPROVIDED) {
            truth = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        return new_alexandria_iterator((SubLObject)alexandria_iterators.$sym35$CREATE_ALEXANDRIA_GAF_ARG_FORMULA_ITERATOR_STATE, (SubLObject)ConsesLow.list(v_term, index, predicate, truth, direction));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 24307L)
    public static SubLObject create_alexandria_gaf_arg_formula_relevant_mt_and_pred_iterator_state(final SubLObject v_term, SubLObject index, SubLObject predicate, SubLObject truth, SubLObject direction) {
        if (index == alexandria_iterators.UNPROVIDED) {
            index = (SubLObject)alexandria_iterators.NIL;
        }
        if (predicate == alexandria_iterators.UNPROVIDED) {
            predicate = (SubLObject)alexandria_iterators.NIL;
        }
        if (truth == alexandria_iterators.UNPROVIDED) {
            truth = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 24760L)
    public static SubLObject new_alexandria_gaf_arg_formula_relevant_mt_and_pred_iterator(final SubLObject v_term, SubLObject index, SubLObject predicate, SubLObject truth, SubLObject direction) {
        if (index == alexandria_iterators.UNPROVIDED) {
            index = (SubLObject)alexandria_iterators.NIL;
        }
        if (predicate == alexandria_iterators.UNPROVIDED) {
            predicate = (SubLObject)alexandria_iterators.NIL;
        }
        if (truth == alexandria_iterators.UNPROVIDED) {
            truth = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        return new_alexandria_iterator((SubLObject)alexandria_iterators.$sym36$CREATE_ALEXANDRIA_GAF_ARG_FORMULA_RELEVANT_MT_AND_PRED_ITERATOR_S, (SubLObject)ConsesLow.list(v_term, index, predicate, truth, direction));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 25036L)
    public static SubLObject create_alexandria_gaf_arg_formula_relevant_mt_iterator_state(final SubLObject v_term, SubLObject index, SubLObject predicate, SubLObject truth, SubLObject direction) {
        if (index == alexandria_iterators.UNPROVIDED) {
            index = (SubLObject)alexandria_iterators.NIL;
        }
        if (predicate == alexandria_iterators.UNPROVIDED) {
            predicate = (SubLObject)alexandria_iterators.NIL;
        }
        if (truth == alexandria_iterators.UNPROVIDED) {
            truth = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 25471L)
    public static SubLObject new_alexandria_gaf_arg_formula_relevant_mt_iterator(final SubLObject v_term, SubLObject index, SubLObject predicate, SubLObject truth, SubLObject direction) {
        if (index == alexandria_iterators.UNPROVIDED) {
            index = (SubLObject)alexandria_iterators.NIL;
        }
        if (predicate == alexandria_iterators.UNPROVIDED) {
            predicate = (SubLObject)alexandria_iterators.NIL;
        }
        if (truth == alexandria_iterators.UNPROVIDED) {
            truth = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        return new_alexandria_iterator((SubLObject)alexandria_iterators.$sym37$CREATE_ALEXANDRIA_GAF_ARG_FORMULA_RELEVANT_MT_ITERATOR_STATE, (SubLObject)ConsesLow.list(v_term, index, predicate, truth, direction));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 25729L)
    public static SubLObject create_alexandria_gaf_arg_values_iterator_state(final SubLObject v_term, final SubLObject gather_index, SubLObject index, SubLObject predicate, SubLObject truth, SubLObject direction) {
        if (index == alexandria_iterators.UNPROVIDED) {
            index = (SubLObject)alexandria_iterators.NIL;
        }
        if (predicate == alexandria_iterators.UNPROVIDED) {
            predicate = (SubLObject)alexandria_iterators.NIL;
        }
        if (truth == alexandria_iterators.UNPROVIDED) {
            truth = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 26259L)
    public static SubLObject new_alexandria_gaf_arg_values_iterator(final SubLObject v_term, final SubLObject gather_index, SubLObject index, SubLObject predicate, SubLObject truth, SubLObject direction) {
        if (index == alexandria_iterators.UNPROVIDED) {
            index = (SubLObject)alexandria_iterators.NIL;
        }
        if (predicate == alexandria_iterators.UNPROVIDED) {
            predicate = (SubLObject)alexandria_iterators.NIL;
        }
        if (truth == alexandria_iterators.UNPROVIDED) {
            truth = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        return new_alexandria_iterator((SubLObject)alexandria_iterators.$sym38$CREATE_ALEXANDRIA_GAF_ARG_VALUES_ITERATOR_STATE, (SubLObject)ConsesLow.list(v_term, gather_index, index, predicate, truth, direction));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 26517L)
    public static SubLObject create_alexandria_gaf_arg_values_relevant_mt_and_pred_iterator_state(final SubLObject v_term, final SubLObject gather_index, SubLObject index, SubLObject predicate, SubLObject truth, SubLObject direction) {
        if (index == alexandria_iterators.UNPROVIDED) {
            index = (SubLObject)alexandria_iterators.NIL;
        }
        if (predicate == alexandria_iterators.UNPROVIDED) {
            predicate = (SubLObject)alexandria_iterators.NIL;
        }
        if (truth == alexandria_iterators.UNPROVIDED) {
            truth = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 27007L)
    public static SubLObject new_alexandria_gaf_arg_values_relevant_mt_and_pred_iterator(final SubLObject v_term, final SubLObject gather_index, SubLObject index, SubLObject predicate, SubLObject truth, SubLObject direction) {
        if (index == alexandria_iterators.UNPROVIDED) {
            index = (SubLObject)alexandria_iterators.NIL;
        }
        if (predicate == alexandria_iterators.UNPROVIDED) {
            predicate = (SubLObject)alexandria_iterators.NIL;
        }
        if (truth == alexandria_iterators.UNPROVIDED) {
            truth = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        return new_alexandria_iterator((SubLObject)alexandria_iterators.$sym39$CREATE_ALEXANDRIA_GAF_ARG_VALUES_RELEVANT_MT_AND_PRED_ITERATOR_ST, (SubLObject)ConsesLow.list(v_term, gather_index, index, predicate, truth, direction));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 27307L)
    public static SubLObject create_alexandria_gaf_arg_values_relevant_mt_iterator_state(final SubLObject v_term, final SubLObject gather_index, SubLObject index, SubLObject predicate, SubLObject truth, SubLObject direction) {
        if (index == alexandria_iterators.UNPROVIDED) {
            index = (SubLObject)alexandria_iterators.NIL;
        }
        if (predicate == alexandria_iterators.UNPROVIDED) {
            predicate = (SubLObject)alexandria_iterators.NIL;
        }
        if (truth == alexandria_iterators.UNPROVIDED) {
            truth = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 27779L)
    public static SubLObject new_alexandria_gaf_arg_values_relevant_mt_iterator(final SubLObject v_term, final SubLObject gather_index, SubLObject index, SubLObject predicate, SubLObject truth, SubLObject direction) {
        if (index == alexandria_iterators.UNPROVIDED) {
            index = (SubLObject)alexandria_iterators.NIL;
        }
        if (predicate == alexandria_iterators.UNPROVIDED) {
            predicate = (SubLObject)alexandria_iterators.NIL;
        }
        if (truth == alexandria_iterators.UNPROVIDED) {
            truth = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        return new_alexandria_iterator((SubLObject)alexandria_iterators.$sym40$CREATE_ALEXANDRIA_GAF_ARG_VALUES_RELEVANT_MT_ITERATOR_STATE, (SubLObject)ConsesLow.list(v_term, gather_index, index, predicate, truth, direction));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 28061L)
    public static SubLObject count_alexandria_gaf_arg_relevant_mt_and_pred(final SubLObject v_term, SubLObject index, SubLObject predicate, SubLObject truth, SubLObject direction) {
        if (index == alexandria_iterators.UNPROVIDED) {
            index = (SubLObject)alexandria_iterators.NIL;
        }
        if (predicate == alexandria_iterators.UNPROVIDED) {
            predicate = (SubLObject)alexandria_iterators.NIL;
        }
        if (truth == alexandria_iterators.UNPROVIDED) {
            truth = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 28548L)
    public static SubLObject count_alexandria_gaf_arg(final SubLObject v_term, SubLObject index, SubLObject predicate, SubLObject mt, SubLObject truth, SubLObject direction) {
        if (index == alexandria_iterators.UNPROVIDED) {
            index = (SubLObject)alexandria_iterators.NIL;
        }
        if (predicate == alexandria_iterators.UNPROVIDED) {
            predicate = (SubLObject)alexandria_iterators.NIL;
        }
        if (mt == alexandria_iterators.UNPROVIDED) {
            mt = (SubLObject)alexandria_iterators.NIL;
        }
        if (truth == alexandria_iterators.UNPROVIDED) {
            truth = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 28921L)
    public static SubLObject new_alexandria_gaf_arg_arg_relevant_mt_and_pred_iterator(final SubLObject term1, final SubLObject term2, SubLObject index1, SubLObject index2, SubLObject predicate, SubLObject truth, SubLObject direction) {
        if (index1 == alexandria_iterators.UNPROVIDED) {
            index1 = (SubLObject)alexandria_iterators.NIL;
        }
        if (index2 == alexandria_iterators.UNPROVIDED) {
            index2 = (SubLObject)alexandria_iterators.NIL;
        }
        if (predicate == alexandria_iterators.UNPROVIDED) {
            predicate = (SubLObject)alexandria_iterators.NIL;
        }
        if (truth == alexandria_iterators.UNPROVIDED) {
            truth = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        return new_alexandria_iterator((SubLObject)alexandria_iterators.$sym41$CREATE_ALEXANDRIA_GAF_ARG_ARG_RELEVANT_MT_AND_PRED_ITERATOR_STATE, (SubLObject)ConsesLow.list(term1, term2, index1, index2, predicate, truth, direction));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 29301L)
    public static SubLObject create_alexandria_gaf_arg_arg_relevant_mt_and_pred_iterator_state(final SubLObject term1, final SubLObject term2, SubLObject index1, SubLObject index2, SubLObject predicate, SubLObject truth, SubLObject direction) {
        if (index1 == alexandria_iterators.UNPROVIDED) {
            index1 = (SubLObject)alexandria_iterators.NIL;
        }
        if (index2 == alexandria_iterators.UNPROVIDED) {
            index2 = (SubLObject)alexandria_iterators.NIL;
        }
        if (predicate == alexandria_iterators.UNPROVIDED) {
            predicate = (SubLObject)alexandria_iterators.NIL;
        }
        if (truth == alexandria_iterators.UNPROVIDED) {
            truth = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 29523L)
    public static SubLObject count_alexandria_gaf_arg_arg_relevant_mt_and_pred(final SubLObject term1, final SubLObject term2, SubLObject index1, SubLObject index2, SubLObject predicate, SubLObject truth, SubLObject direction) {
        if (index1 == alexandria_iterators.UNPROVIDED) {
            index1 = (SubLObject)alexandria_iterators.NIL;
        }
        if (index2 == alexandria_iterators.UNPROVIDED) {
            index2 = (SubLObject)alexandria_iterators.NIL;
        }
        if (predicate == alexandria_iterators.UNPROVIDED) {
            predicate = (SubLObject)alexandria_iterators.NIL;
        }
        if (truth == alexandria_iterators.UNPROVIDED) {
            truth = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 29729L)
    public static SubLObject create_alexandria_mt_contents_iterator_state_relevant_pred(final SubLObject mt, SubLObject type, SubLObject truth, SubLObject direction) {
        if (type == alexandria_iterators.UNPROVIDED) {
            type = (SubLObject)alexandria_iterators.NIL;
        }
        if (truth == alexandria_iterators.UNPROVIDED) {
            truth = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 29970L)
    public static SubLObject new_alexandria_mt_contents_iterator_relevant_pred(final SubLObject mt, SubLObject type, SubLObject truth, SubLObject direction) {
        if (type == alexandria_iterators.UNPROVIDED) {
            type = (SubLObject)alexandria_iterators.NIL;
        }
        if (truth == alexandria_iterators.UNPROVIDED) {
            truth = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        return new_alexandria_iterator((SubLObject)alexandria_iterators.$sym42$CREATE_ALEXANDRIA_MT_CONTENTS_ITERATOR_STATE_RELEVANT_MT, (SubLObject)ConsesLow.list(mt, type, truth, direction));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 30197L)
    public static SubLObject count_alexandria_mt_contents_relevant_pred(final SubLObject mt, SubLObject type, SubLObject truth, SubLObject direction) {
        if (type == alexandria_iterators.UNPROVIDED) {
            type = (SubLObject)alexandria_iterators.NIL;
        }
        if (truth == alexandria_iterators.UNPROVIDED) {
            truth = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 30340L)
    public static SubLObject create_alexandria_mt_contents_iterator_state(final SubLObject mt, SubLObject type, SubLObject truth, SubLObject direction) {
        if (type == alexandria_iterators.UNPROVIDED) {
            type = (SubLObject)alexandria_iterators.NIL;
        }
        if (truth == alexandria_iterators.UNPROVIDED) {
            truth = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 30567L)
    public static SubLObject new_alexandria_mt_contents_iterator(final SubLObject mt, SubLObject type, SubLObject truth, SubLObject direction) {
        if (type == alexandria_iterators.UNPROVIDED) {
            type = (SubLObject)alexandria_iterators.NIL;
        }
        if (truth == alexandria_iterators.UNPROVIDED) {
            truth = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        return new_alexandria_iterator((SubLObject)alexandria_iterators.$sym43$CREATE_ALEXANDRIA_MT_CONTENTS_ITERATOR_STATE, (SubLObject)ConsesLow.list(mt, type, truth, direction));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 30768L)
    public static SubLObject count_alexandria_mt_contents(final SubLObject mt, SubLObject type, SubLObject truth, SubLObject direction) {
        if (type == alexandria_iterators.UNPROVIDED) {
            type = (SubLObject)alexandria_iterators.NIL;
        }
        if (truth == alexandria_iterators.UNPROVIDED) {
            truth = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 30897L)
    public static SubLObject create_alexandria_other_index_iterator_state(final SubLObject v_term, SubLObject type, SubLObject truth, SubLObject direction) {
        if (type == alexandria_iterators.UNPROVIDED) {
            type = (SubLObject)alexandria_iterators.NIL;
        }
        if (truth == alexandria_iterators.UNPROVIDED) {
            truth = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 31370L)
    public static SubLObject new_alexandria_other_index_iterator(final SubLObject v_term, SubLObject type, SubLObject truth, SubLObject direction) {
        if (type == alexandria_iterators.UNPROVIDED) {
            type = (SubLObject)alexandria_iterators.NIL;
        }
        if (truth == alexandria_iterators.UNPROVIDED) {
            truth = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        return new_alexandria_iterator((SubLObject)alexandria_iterators.$sym44$CREATE_ALEXANDRIA_OTHER_INDEX_ITERATOR_STATE, (SubLObject)ConsesLow.list(v_term, type, truth, direction));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 31574L)
    public static SubLObject create_alexandria_other_index_relevant_mt_and_pred_iterator_state(final SubLObject v_term, SubLObject type, SubLObject truth, SubLObject direction) {
        if (type == alexandria_iterators.UNPROVIDED) {
            type = (SubLObject)alexandria_iterators.NIL;
        }
        if (truth == alexandria_iterators.UNPROVIDED) {
            truth = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 31986L)
    public static SubLObject new_alexandria_other_index_relevant_mt_and_pred_iterator(final SubLObject v_term, SubLObject type, SubLObject truth, SubLObject direction) {
        if (type == alexandria_iterators.UNPROVIDED) {
            type = (SubLObject)alexandria_iterators.NIL;
        }
        if (truth == alexandria_iterators.UNPROVIDED) {
            truth = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        return new_alexandria_iterator((SubLObject)alexandria_iterators.$sym45$CREATE_ALEXANDRIA_OTHER_INDEX_RELEVANT_MT_AND_PRED_ITERATOR_STATE, (SubLObject)ConsesLow.list(v_term, type, truth, direction));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 32232L)
    public static SubLObject create_alexandria_other_index_relevant_mt_iterator_state(final SubLObject v_term, SubLObject type, SubLObject truth, SubLObject direction) {
        if (type == alexandria_iterators.UNPROVIDED) {
            type = (SubLObject)alexandria_iterators.NIL;
        }
        if (truth == alexandria_iterators.UNPROVIDED) {
            truth = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 32626L)
    public static SubLObject new_alexandria_other_index_relevant_mt_iterator(final SubLObject v_term, SubLObject type, SubLObject truth, SubLObject direction) {
        if (type == alexandria_iterators.UNPROVIDED) {
            type = (SubLObject)alexandria_iterators.NIL;
        }
        if (truth == alexandria_iterators.UNPROVIDED) {
            truth = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        return new_alexandria_iterator((SubLObject)alexandria_iterators.$sym46$CREATE_ALEXANDRIA_OTHER_INDEX_RELEVANT_MT_ITERATOR_STATE, (SubLObject)ConsesLow.list(v_term, type, truth, direction));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 32854L)
    public static SubLObject create_alexandria_rules_with_pred_iterator_state(final SubLObject pred, SubLObject sense, SubLObject direction) {
        if (sense == alexandria_iterators.UNPROVIDED) {
            sense = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 33299L)
    public static SubLObject new_alexandria_rules_with_pred_iterator(final SubLObject pred, SubLObject sense, SubLObject direction) {
        if (sense == alexandria_iterators.UNPROVIDED) {
            sense = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        return new_alexandria_iterator((SubLObject)alexandria_iterators.$sym47$CREATE_ALEXANDRIA_RULES_WITH_PRED_RELEVANT_MT_ITERATOR_STATE, (SubLObject)ConsesLow.list(pred, sense, direction));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 33513L)
    public static SubLObject count_alexandria_rules_with_pred(final SubLObject pred, SubLObject sense, SubLObject direction, SubLObject mt) {
        if (sense == alexandria_iterators.UNPROVIDED) {
            sense = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        if (mt == alexandria_iterators.UNPROVIDED) {
            mt = (SubLObject)alexandria_iterators.NIL;
        }
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 33646L)
    public static SubLObject create_alexandria_rules_with_pred_relevant_mt_iterator_state(final SubLObject pred, SubLObject sense, SubLObject direction) {
        if (sense == alexandria_iterators.UNPROVIDED) {
            sense = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 34115L)
    public static SubLObject new_alexandria_rules_with_pred_relevant_mt_iterator(final SubLObject pred, SubLObject sense, SubLObject direction) {
        if (sense == alexandria_iterators.UNPROVIDED) {
            sense = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        return new_alexandria_iterator((SubLObject)alexandria_iterators.$sym47$CREATE_ALEXANDRIA_RULES_WITH_PRED_RELEVANT_MT_ITERATOR_STATE, (SubLObject)ConsesLow.list(pred, sense, direction));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 34341L)
    public static SubLObject count_alexandria_rules_with_pred_relevant_mt(final SubLObject pred, SubLObject sense, SubLObject direction) {
        if (sense == alexandria_iterators.UNPROVIDED) {
            sense = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 34480L)
    public static SubLObject create_alexandria_rules_with_pred_and_arg2_iterator_state(final SubLObject pred, final SubLObject arg2, SubLObject sense, SubLObject direction) {
        if (sense == alexandria_iterators.UNPROVIDED) {
            sense = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 34958L)
    public static SubLObject new_alexandria_rules_with_pred_and_arg2_iterator(final SubLObject pred, final SubLObject arg2, SubLObject sense, SubLObject direction) {
        if (sense == alexandria_iterators.UNPROVIDED) {
            sense = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        return new_alexandria_iterator((SubLObject)alexandria_iterators.$sym48$CREATE_ALEXANDRIA_RULES_WITH_PRED_AND_ARG2_ITERATOR_STATE, (SubLObject)ConsesLow.list(pred, arg2, sense, direction));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 35188L)
    public static SubLObject count_alexandria_rules_with_pred_and_arg2(final SubLObject pred, final SubLObject arg2, SubLObject sense, SubLObject direction, SubLObject mt) {
        if (sense == alexandria_iterators.UNPROVIDED) {
            sense = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        if (mt == alexandria_iterators.UNPROVIDED) {
            mt = (SubLObject)alexandria_iterators.NIL;
        }
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 35340L)
    public static SubLObject create_alexandria_rules_with_pred_and_arg2_relevant_mt_iterator_state(final SubLObject pred, final SubLObject arg2, SubLObject sense, SubLObject direction) {
        if (sense == alexandria_iterators.UNPROVIDED) {
            sense = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 35842L)
    public static SubLObject new_alexandria_rules_with_pred_and_arg2_relevant_mt_iterator(final SubLObject pred, final SubLObject arg2, SubLObject sense, SubLObject direction) {
        if (sense == alexandria_iterators.UNPROVIDED) {
            sense = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        return new_alexandria_iterator((SubLObject)alexandria_iterators.$sym49$CREATE_ALEXANDRIA_RULES_WITH_PRED_AND_ARG2_RELEVANT_MT_ITERATOR_S, (SubLObject)ConsesLow.list(pred, arg2, sense, direction));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 36096L)
    public static SubLObject count_alexandria_rules_with_pred_and_arg2_relevant_mt(final SubLObject pred, final SubLObject arg2, SubLObject sense, SubLObject direction) {
        if (sense == alexandria_iterators.UNPROVIDED) {
            sense = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 36254L)
    public static SubLObject create_alexandria_nested_formula_rules_iterator_state(final SubLObject outer_pred, final SubLObject inner_pred, SubLObject sense, SubLObject direction) {
        if (sense == alexandria_iterators.UNPROVIDED) {
            sense = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 36760L)
    public static SubLObject new_alexandria_nested_formula_rules_iterator(final SubLObject outer_pred, final SubLObject inner_pred, SubLObject sense, SubLObject direction) {
        if (sense == alexandria_iterators.UNPROVIDED) {
            sense = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        return new_alexandria_iterator((SubLObject)alexandria_iterators.$sym50$CREATE_ALEXANDRIA_NESTED_FORMULA_RULES_ITERATOR_STATE, (SubLObject)ConsesLow.list(outer_pred, inner_pred, sense, direction));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 37006L)
    public static SubLObject count_alexandria_nested_formula_rules(final SubLObject outer_pred, final SubLObject inner_pred, SubLObject sense, SubLObject direction, SubLObject mt) {
        if (sense == alexandria_iterators.UNPROVIDED) {
            sense = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        if (mt == alexandria_iterators.UNPROVIDED) {
            mt = (SubLObject)alexandria_iterators.NIL;
        }
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 37178L)
    public static SubLObject create_alexandria_nested_formula_rules_relevant_mt_iterator_state(final SubLObject outer_pred, final SubLObject inner_pred, SubLObject sense, SubLObject direction) {
        if (sense == alexandria_iterators.UNPROVIDED) {
            sense = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 37708L)
    public static SubLObject new_alexandria_nested_formula_rules_relevant_mt_iterator(final SubLObject outer_pred, final SubLObject inner_pred, SubLObject sense, SubLObject direction) {
        if (sense == alexandria_iterators.UNPROVIDED) {
            sense = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        return new_alexandria_iterator((SubLObject)alexandria_iterators.$sym51$CREATE_ALEXANDRIA_NESTED_FORMULA_RULES_RELEVANT_MT_ITERATOR_STATE, (SubLObject)ConsesLow.list(outer_pred, inner_pred, sense, direction));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 37978L)
    public static SubLObject count_alexandria_nested_formula_rules_relevant_mt(final SubLObject outer_pred, final SubLObject inner_pred, SubLObject sense, SubLObject direction) {
        if (sense == alexandria_iterators.UNPROVIDED) {
            sense = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 38156L)
    public static SubLObject create_alexandria_function_extent_iterator_state(final SubLObject function, SubLObject truth, SubLObject direction) {
        if (truth == alexandria_iterators.UNPROVIDED) {
            truth = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 38613L)
    public static SubLObject new_alexandria_function_extent_iterator(final SubLObject function, SubLObject truth, SubLObject direction) {
        if (truth == alexandria_iterators.UNPROVIDED) {
            truth = (SubLObject)alexandria_iterators.NIL;
        }
        if (direction == alexandria_iterators.UNPROVIDED) {
            direction = (SubLObject)alexandria_iterators.NIL;
        }
        return new_alexandria_iterator((SubLObject)alexandria_iterators.$sym52$CREATE_ALEXANDRIA_FUNCTION_EXTENT_ITERATOR_STATE, (SubLObject)ConsesLow.list(function, truth, direction));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 38823L)
    public static SubLObject count_alexandria_nart_arg_index(final SubLObject v_term, SubLObject index, SubLObject function) {
        if (index == alexandria_iterators.UNPROVIDED) {
            index = (SubLObject)alexandria_iterators.NIL;
        }
        if (function == alexandria_iterators.UNPROVIDED) {
            function = (SubLObject)alexandria_iterators.NIL;
        }
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 39231L)
    public static SubLObject create_alexandria_nart_arg_index_iterator_state(final SubLObject v_term, SubLObject index, SubLObject function) {
        if (index == alexandria_iterators.UNPROVIDED) {
            index = (SubLObject)alexandria_iterators.NIL;
        }
        if (function == alexandria_iterators.UNPROVIDED) {
            function = (SubLObject)alexandria_iterators.NIL;
        }
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 39671L)
    public static SubLObject new_alexandria_nart_arg_index_iterator(final SubLObject v_term, SubLObject index, SubLObject function) {
        if (index == alexandria_iterators.UNPROVIDED) {
            index = (SubLObject)alexandria_iterators.NIL;
        }
        if (function == alexandria_iterators.UNPROVIDED) {
            function = (SubLObject)alexandria_iterators.NIL;
        }
        return new_alexandria_iterator((SubLObject)alexandria_iterators.$sym53$CREATE_ALEXANDRIA_NART_ARG_INDEX_ITERATOR_STATE, (SubLObject)ConsesLow.list(v_term, index, function));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 39869L)
    public static SubLObject create_alexandria_rules_with_cnf_iterator_state(final SubLObject cnf) {
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 40172L)
    public static SubLObject new_alexandria_rules_with_cnf_iterator(final SubLObject cnf) {
        return new_alexandria_iterator((SubLObject)alexandria_iterators.$sym53$CREATE_ALEXANDRIA_NART_ARG_INDEX_ITERATOR_STATE, (SubLObject)ConsesLow.list(cnf));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 40329L)
    public static SubLObject does_constant_exist_with_name_or_guid(final SubLObject name, final SubLObject guid, SubLObject require_case_insensitive_name_uniquenessP) {
        if (require_case_insensitive_name_uniquenessP == alexandria_iterators.UNPROVIDED) {
            require_case_insensitive_name_uniquenessP = (SubLObject)alexandria_iterators.NIL;
        }
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 40819L)
    public static SubLObject clear_alexandria_caches() {
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 41051L)
    public static SubLObject term_assertion_usage_count_estimate(final SubLObject cycl_term) {
        return (SubLObject)alexandria_iterators.$kw54$UNKNOWN;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 41524L)
    public static SubLObject estimated_cost_for_indexing_on_term(final SubLObject cycl_term) {
        return (SubLObject)alexandria_iterators.MINUS_ONE_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 41906L)
    public static SubLObject create_alexandria_assertion_asserted_by_iterator_state(final SubLObject user, SubLObject optimization) {
        if (optimization == alexandria_iterators.UNPROVIDED) {
            optimization = (SubLObject)alexandria_iterators.$kw55$LATENCY;
        }
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 42161L)
    public static SubLObject new_alexandria_assertion_asserted_by_iterator(final SubLObject user, SubLObject optimization) {
        if (optimization == alexandria_iterators.UNPROVIDED) {
            optimization = (SubLObject)alexandria_iterators.$kw55$LATENCY;
        }
        return new_alexandria_iterator((SubLObject)alexandria_iterators.$sym56$CREATE_ALEXANDRIA_ASSERTION_ASSERTED_BY_ITERATOR_STATE, (SubLObject)ConsesLow.list(user, optimization));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 42380L)
    public static SubLObject count_alexandria_rules_assertion_asserted_by(final SubLObject user) {
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 42477L)
    public static SubLObject create_alexandria_assertion_asserted_why_iterator_state(final SubLObject reason, SubLObject optimization) {
        if (optimization == alexandria_iterators.UNPROVIDED) {
            optimization = (SubLObject)alexandria_iterators.$kw55$LATENCY;
        }
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 42636L)
    public static SubLObject new_alexandria_assertion_asserted_why_iterator(final SubLObject reason, SubLObject optimization) {
        if (optimization == alexandria_iterators.UNPROVIDED) {
            optimization = (SubLObject)alexandria_iterators.$kw55$LATENCY;
        }
        return new_alexandria_iterator((SubLObject)alexandria_iterators.$sym57$CREATE_ALEXANDRIA_ASSERTION_ASSERTED_WHY_ITERATOR_STATE, (SubLObject)ConsesLow.list(reason, optimization));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 42861L)
    public static SubLObject count_alexandria_rules_assertion_asserted_why(final SubLObject reason) {
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 42963L)
    public static SubLObject create_alexandria_assertion_asserted_on_iterator_state(final SubLObject universal_date, SubLObject seconds) {
        if (seconds == alexandria_iterators.UNPROVIDED) {
            seconds = (SubLObject)alexandria_iterators.NIL;
        }
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 43116L)
    public static SubLObject new_alexandria_assertion_asserted_on_iterator(final SubLObject universal_date, SubLObject seconds) {
        if (seconds == alexandria_iterators.UNPROVIDED) {
            seconds = (SubLObject)alexandria_iterators.NIL;
        }
        return new_alexandria_iterator((SubLObject)alexandria_iterators.$sym58$CREATE_ALEXANDRIA_ASSERTION_ASSERTED_ON_ITERATOR_STATE, (SubLObject)ConsesLow.list(universal_date, seconds));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 43334L)
    public static SubLObject count_alexandria_rules_assertion_asserted_on(final SubLObject universal_date, SubLObject seconds) {
        if (seconds == alexandria_iterators.UNPROVIDED) {
            seconds = (SubLObject)alexandria_iterators.NIL;
        }
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 43477L)
    public static SubLObject all_genl_mts_alexandria(final SubLObject mt, final SubLObject mt_mt, final SubLObject tv) {
        return genl_mts.all_genl_mts_internal(mt, mt_mt, tv, (SubLObject)alexandria_iterators.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 43670L)
    public static SubLObject all_spec_mts_alexandria(final SubLObject mt, final SubLObject mt_mt, final SubLObject tv) {
        return genl_mts.all_spec_mts_internal(mt, mt_mt, tv, (SubLObject)alexandria_iterators.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 43862L)
    public static SubLObject create_alexandria_defns_cache_iterator_state(final SubLObject defns_cache_name) {
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-iterators.lisp", position = 43983L)
    public static SubLObject new_alexandria_defns_cache_iterator(final SubLObject defn_cache_name) {
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    public static SubLObject declare_alexandria_iterators_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_iterator", "NEW-ALEXANDRIA-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "alexandria_kb_store_iterator_done", "ALEXANDRIA-KB-STORE-ITERATOR-DONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "alexandria_kb_store_iterator_next", "ALEXANDRIA-KB-STORE-ITERATOR-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "alexandria_kb_store_iterator_finalize", "ALEXANDRIA-KB-STORE-ITERATOR-FINALIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "count_alexandria_gafs_matching_formula", "COUNT-ALEXANDRIA-GAFS-MATCHING-FORMULA", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "count_alexandria_gafs_matching_formula_relevant_mt_and_pred", "COUNT-ALEXANDRIA-GAFS-MATCHING-FORMULA-RELEVANT-MT-AND-PRED", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "create_alexandria_gafs_matching_formula_iterator_state", "CREATE-ALEXANDRIA-GAFS-MATCHING-FORMULA-ITERATOR-STATE", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_gafs_matching_formula_iterator", "NEW-ALEXANDRIA-GAFS-MATCHING-FORMULA-ITERATOR", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "create_alexandria_gafs_matching_formula_relevant_mt_and_pred_iterator_state", "CREATE-ALEXANDRIA-GAFS-MATCHING-FORMULA-RELEVANT-MT-AND-PRED-ITERATOR-STATE", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_gafs_matching_formula_relevant_mt_and_pred_iterator", "NEW-ALEXANDRIA-GAFS-MATCHING-FORMULA-RELEVANT-MT-AND-PRED-ITERATOR", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "create_alexandria_nats_matching_formula_iterator", "CREATE-ALEXANDRIA-NATS-MATCHING-FORMULA-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_nats_matching_formula_iterator", "NEW-ALEXANDRIA-NATS-MATCHING-FORMULA-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "count_alexandria_nats_matching_formula", "COUNT-ALEXANDRIA-NATS-MATCHING-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "count_alexandria_reifiable_function_extent", "COUNT-ALEXANDRIA-REIFIABLE-FUNCTION-EXTENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "create_alexandria_reifiable_function_extent_iterator_state", "CREATE-ALEXANDRIA-REIFIABLE-FUNCTION-EXTENT-ITERATOR-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_reifiable_function_extent_iterator", "NEW-ALEXANDRIA-REIFIABLE-FUNCTION-EXTENT-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "create_alexandria_all_forts_iterator_state", "CREATE-ALEXANDRIA-ALL-FORTS-ITERATOR-STATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_all_forts_iterator", "NEW-ALEXANDRIA-ALL-FORTS-ITERATOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "create_alexandria_all_gafs_iterator_state", "CREATE-ALEXANDRIA-ALL-GAFS-ITERATOR-STATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_all_gafs_iterator", "NEW-ALEXANDRIA-ALL-GAFS-ITERATOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "create_alexandria_all_rules_iterator_state", "CREATE-ALEXANDRIA-ALL-RULES-ITERATOR-STATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_all_rules_iterator", "NEW-ALEXANDRIA-ALL-RULES-ITERATOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "create_alexandria_all_unbound_rules_iterator_state", "CREATE-ALEXANDRIA-ALL-UNBOUND-RULES-ITERATOR-STATE", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_all_unbound_rules_iterator", "NEW-ALEXANDRIA-ALL-UNBOUND-RULES-ITERATOR", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "create_alexandria_all_unbound_rules_relevant_mt_iterator_state", "CREATE-ALEXANDRIA-ALL-UNBOUND-RULES-RELEVANT-MT-ITERATOR-STATE", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_all_unbound_rules_relevant_mt_iterator", "NEW-ALEXANDRIA-ALL-UNBOUND-RULES-RELEVANT-MT-ITERATOR", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "create_alexandria_all_assertions_iterator_state", "CREATE-ALEXANDRIA-ALL-ASSERTIONS-ITERATOR-STATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_all_assertions_iterator", "NEW-ALEXANDRIA-ALL-ASSERTIONS-ITERATOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "create_alexandria_all_big_integers_iterator_state", "CREATE-ALEXANDRIA-ALL-BIG-INTEGERS-ITERATOR-STATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_all_big_integers_iterator", "NEW-ALEXANDRIA-ALL-BIG-INTEGERS-ITERATOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "create_alexandria_all_integers_iterator_state", "CREATE-ALEXANDRIA-ALL-INTEGERS-ITERATOR-STATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_all_integers_iterator", "NEW-ALEXANDRIA-ALL-INTEGERS-ITERATOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "create_alexandria_all_bookkeeping_gafs_iterator_state", "CREATE-ALEXANDRIA-ALL-BOOKKEEPING-GAFS-ITERATOR-STATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_all_bookkeeping_gafs_iterator", "NEW-ALEXANDRIA-ALL-BOOKKEEPING-GAFS-ITERATOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "create_alexandria_all_constants_iterator_state", "CREATE-ALEXANDRIA-ALL-CONSTANTS-ITERATOR-STATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_all_constants_iterator", "NEW-ALEXANDRIA-ALL-CONSTANTS-ITERATOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "create_alexandria_all_narts_iterator_state", "CREATE-ALEXANDRIA-ALL-NARTS-ITERATOR-STATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_all_narts_iterator", "NEW-ALEXANDRIA-ALL-NARTS-ITERATOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "create_alexandria_all_deductions_iterator_state", "CREATE-ALEXANDRIA-ALL-DEDUCTIONS-ITERATOR-STATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_all_deductions_iterator", "NEW-ALEXANDRIA-ALL-DEDUCTIONS-ITERATOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "create_alexandria_all_floats_iterator_state", "CREATE-ALEXANDRIA-ALL-FLOATS-ITERATOR-STATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_all_floats_iterator", "NEW-ALEXANDRIA-ALL-FLOATS-ITERATOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "create_alexandria_all_formulas_iterator_state", "CREATE-ALEXANDRIA-ALL-FORMULAS-ITERATOR-STATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_all_formulas_iterator", "NEW-ALEXANDRIA-ALL-FORMULAS-ITERATOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "create_alexandria_all_hl_supports_iterator_state", "CREATE-ALEXANDRIA-ALL-HL-SUPPORTS-ITERATOR-STATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_all_hl_supports_iterator", "NEW-ALEXANDRIA-ALL-HL-SUPPORTS-ITERATOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "create_alexandria_all_kb_hl_supports_iterator_state", "CREATE-ALEXANDRIA-ALL-KB-HL-SUPPORTS-ITERATOR-STATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_all_kb_hl_supports_iterator", "NEW-ALEXANDRIA-ALL-KB-HL-SUPPORTS-ITERATOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "create_alexandria_all_items_iterator_state", "CREATE-ALEXANDRIA-ALL-ITEMS-ITERATOR-STATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_all_items_iterator", "NEW-ALEXANDRIA-ALL-ITEMS-ITERATOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "create_alexandria_all_strings_iterator_state", "CREATE-ALEXANDRIA-ALL-STRINGS-ITERATOR-STATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_all_strings_iterator", "NEW-ALEXANDRIA-ALL-STRINGS-ITERATOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "create_alexandria_all_numbers_iterator_state", "CREATE-ALEXANDRIA-ALL-NUMBERS-ITERATOR-STATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_all_numbers_iterator", "NEW-ALEXANDRIA-ALL-NUMBERS-ITERATOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "create_alexandria_all_subl_expressions_iterator_state", "CREATE-ALEXANDRIA-ALL-SUBL-EXPRESSIONS-ITERATOR-STATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_all_subl_expressions_iterator", "NEW-ALEXANDRIA-ALL-SUBL-EXPRESSIONS-ITERATOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "create_alexandria_all_variables_iterator_state", "CREATE-ALEXANDRIA-ALL-VARIABLES-ITERATOR-STATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_all_variables_iterator", "NEW-ALEXANDRIA-ALL-VARIABLES-ITERATOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "create_alexandria_all_unrepresented_terms_iterator_state", "CREATE-ALEXANDRIA-ALL-UNREPRESENTED-TERMS-ITERATOR-STATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_all_unrepresented_terms_iterator", "NEW-ALEXANDRIA-ALL-UNREPRESENTED-TERMS-ITERATOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "create_alexandria_term_assertions_relevant_mt_pred_iterator_state", "CREATE-ALEXANDRIA-TERM-ASSERTIONS-RELEVANT-MT-PRED-ITERATOR-STATE", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_term_assertions_relevant_mt_pred_iterator", "NEW-ALEXANDRIA-TERM-ASSERTIONS-RELEVANT-MT-PRED-ITERATOR", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "count_alexandria_term_assertions_relevant_mt_pred", "COUNT-ALEXANDRIA-TERM-ASSERTIONS-RELEVANT-MT-PRED", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "create_alexandria_term_assertions_iterator_state", "CREATE-ALEXANDRIA-TERM-ASSERTIONS-ITERATOR-STATE", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_term_assertions_iterator", "NEW-ALEXANDRIA-TERM-ASSERTIONS-ITERATOR", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "count_alexandria_term_assertions", "COUNT-ALEXANDRIA-TERM-ASSERTIONS", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "create_alexandria_gaf_arg0_iterator_state", "CREATE-ALEXANDRIA-GAF-ARG0-ITERATOR-STATE", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_gaf_arg0_iterator", "NEW-ALEXANDRIA-GAF-ARG0-ITERATOR", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "count_alexandria_gaf_arg0", "COUNT-ALEXANDRIA-GAF-ARG0", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "create_alexandria_gaf_arg0_relevant_mt_iterator_state", "CREATE-ALEXANDRIA-GAF-ARG0-RELEVANT-MT-ITERATOR-STATE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_gaf_arg0_iterator_relevant_mt", "NEW-ALEXANDRIA-GAF-ARG0-ITERATOR-RELEVANT-MT", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "count_alexandria_gaf_arg0_relevant_mt", "COUNT-ALEXANDRIA-GAF-ARG0-RELEVANT-MT", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "create_alexandria_gaf_arg_iterator_state", "CREATE-ALEXANDRIA-GAF-ARG-ITERATOR-STATE", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_gaf_arg_iterator", "NEW-ALEXANDRIA-GAF-ARG-ITERATOR", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "create_alexandria_gaf_arg_relevant_mt_and_pred_iterator_state", "CREATE-ALEXANDRIA-GAF-ARG-RELEVANT-MT-AND-PRED-ITERATOR-STATE", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_gaf_arg_relevant_mt_and_pred_iterator", "NEW-ALEXANDRIA-GAF-ARG-RELEVANT-MT-AND-PRED-ITERATOR", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "create_alexandria_gaf_arg_relevant_mt_iterator_state", "CREATE-ALEXANDRIA-GAF-ARG-RELEVANT-MT-ITERATOR-STATE", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_gaf_arg_relevant_mt_iterator", "NEW-ALEXANDRIA-GAF-ARG-RELEVANT-MT-ITERATOR", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "create_alexandria_gaf_arg_formula_iterator_state", "CREATE-ALEXANDRIA-GAF-ARG-FORMULA-ITERATOR-STATE", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_gaf_arg_formula_iterator", "NEW-ALEXANDRIA-GAF-ARG-FORMULA-ITERATOR", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "create_alexandria_gaf_arg_formula_relevant_mt_and_pred_iterator_state", "CREATE-ALEXANDRIA-GAF-ARG-FORMULA-RELEVANT-MT-AND-PRED-ITERATOR-STATE", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_gaf_arg_formula_relevant_mt_and_pred_iterator", "NEW-ALEXANDRIA-GAF-ARG-FORMULA-RELEVANT-MT-AND-PRED-ITERATOR", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "create_alexandria_gaf_arg_formula_relevant_mt_iterator_state", "CREATE-ALEXANDRIA-GAF-ARG-FORMULA-RELEVANT-MT-ITERATOR-STATE", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_gaf_arg_formula_relevant_mt_iterator", "NEW-ALEXANDRIA-GAF-ARG-FORMULA-RELEVANT-MT-ITERATOR", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "create_alexandria_gaf_arg_values_iterator_state", "CREATE-ALEXANDRIA-GAF-ARG-VALUES-ITERATOR-STATE", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_gaf_arg_values_iterator", "NEW-ALEXANDRIA-GAF-ARG-VALUES-ITERATOR", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "create_alexandria_gaf_arg_values_relevant_mt_and_pred_iterator_state", "CREATE-ALEXANDRIA-GAF-ARG-VALUES-RELEVANT-MT-AND-PRED-ITERATOR-STATE", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_gaf_arg_values_relevant_mt_and_pred_iterator", "NEW-ALEXANDRIA-GAF-ARG-VALUES-RELEVANT-MT-AND-PRED-ITERATOR", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "create_alexandria_gaf_arg_values_relevant_mt_iterator_state", "CREATE-ALEXANDRIA-GAF-ARG-VALUES-RELEVANT-MT-ITERATOR-STATE", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_gaf_arg_values_relevant_mt_iterator", "NEW-ALEXANDRIA-GAF-ARG-VALUES-RELEVANT-MT-ITERATOR", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "count_alexandria_gaf_arg_relevant_mt_and_pred", "COUNT-ALEXANDRIA-GAF-ARG-RELEVANT-MT-AND-PRED", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "count_alexandria_gaf_arg", "COUNT-ALEXANDRIA-GAF-ARG", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_gaf_arg_arg_relevant_mt_and_pred_iterator", "NEW-ALEXANDRIA-GAF-ARG-ARG-RELEVANT-MT-AND-PRED-ITERATOR", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "create_alexandria_gaf_arg_arg_relevant_mt_and_pred_iterator_state", "CREATE-ALEXANDRIA-GAF-ARG-ARG-RELEVANT-MT-AND-PRED-ITERATOR-STATE", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "count_alexandria_gaf_arg_arg_relevant_mt_and_pred", "COUNT-ALEXANDRIA-GAF-ARG-ARG-RELEVANT-MT-AND-PRED", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "create_alexandria_mt_contents_iterator_state_relevant_pred", "CREATE-ALEXANDRIA-MT-CONTENTS-ITERATOR-STATE-RELEVANT-PRED", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_mt_contents_iterator_relevant_pred", "NEW-ALEXANDRIA-MT-CONTENTS-ITERATOR-RELEVANT-PRED", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "count_alexandria_mt_contents_relevant_pred", "COUNT-ALEXANDRIA-MT-CONTENTS-RELEVANT-PRED", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "create_alexandria_mt_contents_iterator_state", "CREATE-ALEXANDRIA-MT-CONTENTS-ITERATOR-STATE", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_mt_contents_iterator", "NEW-ALEXANDRIA-MT-CONTENTS-ITERATOR", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "count_alexandria_mt_contents", "COUNT-ALEXANDRIA-MT-CONTENTS", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "create_alexandria_other_index_iterator_state", "CREATE-ALEXANDRIA-OTHER-INDEX-ITERATOR-STATE", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_other_index_iterator", "NEW-ALEXANDRIA-OTHER-INDEX-ITERATOR", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "create_alexandria_other_index_relevant_mt_and_pred_iterator_state", "CREATE-ALEXANDRIA-OTHER-INDEX-RELEVANT-MT-AND-PRED-ITERATOR-STATE", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_other_index_relevant_mt_and_pred_iterator", "NEW-ALEXANDRIA-OTHER-INDEX-RELEVANT-MT-AND-PRED-ITERATOR", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "create_alexandria_other_index_relevant_mt_iterator_state", "CREATE-ALEXANDRIA-OTHER-INDEX-RELEVANT-MT-ITERATOR-STATE", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_other_index_relevant_mt_iterator", "NEW-ALEXANDRIA-OTHER-INDEX-RELEVANT-MT-ITERATOR", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "create_alexandria_rules_with_pred_iterator_state", "CREATE-ALEXANDRIA-RULES-WITH-PRED-ITERATOR-STATE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_rules_with_pred_iterator", "NEW-ALEXANDRIA-RULES-WITH-PRED-ITERATOR", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "count_alexandria_rules_with_pred", "COUNT-ALEXANDRIA-RULES-WITH-PRED", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "create_alexandria_rules_with_pred_relevant_mt_iterator_state", "CREATE-ALEXANDRIA-RULES-WITH-PRED-RELEVANT-MT-ITERATOR-STATE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_rules_with_pred_relevant_mt_iterator", "NEW-ALEXANDRIA-RULES-WITH-PRED-RELEVANT-MT-ITERATOR", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "count_alexandria_rules_with_pred_relevant_mt", "COUNT-ALEXANDRIA-RULES-WITH-PRED-RELEVANT-MT", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "create_alexandria_rules_with_pred_and_arg2_iterator_state", "CREATE-ALEXANDRIA-RULES-WITH-PRED-AND-ARG2-ITERATOR-STATE", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_rules_with_pred_and_arg2_iterator", "NEW-ALEXANDRIA-RULES-WITH-PRED-AND-ARG2-ITERATOR", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "count_alexandria_rules_with_pred_and_arg2", "COUNT-ALEXANDRIA-RULES-WITH-PRED-AND-ARG2", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "create_alexandria_rules_with_pred_and_arg2_relevant_mt_iterator_state", "CREATE-ALEXANDRIA-RULES-WITH-PRED-AND-ARG2-RELEVANT-MT-ITERATOR-STATE", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_rules_with_pred_and_arg2_relevant_mt_iterator", "NEW-ALEXANDRIA-RULES-WITH-PRED-AND-ARG2-RELEVANT-MT-ITERATOR", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "count_alexandria_rules_with_pred_and_arg2_relevant_mt", "COUNT-ALEXANDRIA-RULES-WITH-PRED-AND-ARG2-RELEVANT-MT", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "create_alexandria_nested_formula_rules_iterator_state", "CREATE-ALEXANDRIA-NESTED-FORMULA-RULES-ITERATOR-STATE", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_nested_formula_rules_iterator", "NEW-ALEXANDRIA-NESTED-FORMULA-RULES-ITERATOR", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "count_alexandria_nested_formula_rules", "COUNT-ALEXANDRIA-NESTED-FORMULA-RULES", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "create_alexandria_nested_formula_rules_relevant_mt_iterator_state", "CREATE-ALEXANDRIA-NESTED-FORMULA-RULES-RELEVANT-MT-ITERATOR-STATE", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_nested_formula_rules_relevant_mt_iterator", "NEW-ALEXANDRIA-NESTED-FORMULA-RULES-RELEVANT-MT-ITERATOR", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "count_alexandria_nested_formula_rules_relevant_mt", "COUNT-ALEXANDRIA-NESTED-FORMULA-RULES-RELEVANT-MT", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "create_alexandria_function_extent_iterator_state", "CREATE-ALEXANDRIA-FUNCTION-EXTENT-ITERATOR-STATE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_function_extent_iterator", "NEW-ALEXANDRIA-FUNCTION-EXTENT-ITERATOR", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "count_alexandria_nart_arg_index", "COUNT-ALEXANDRIA-NART-ARG-INDEX", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "create_alexandria_nart_arg_index_iterator_state", "CREATE-ALEXANDRIA-NART-ARG-INDEX-ITERATOR-STATE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_nart_arg_index_iterator", "NEW-ALEXANDRIA-NART-ARG-INDEX-ITERATOR", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "create_alexandria_rules_with_cnf_iterator_state", "CREATE-ALEXANDRIA-RULES-WITH-CNF-ITERATOR-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_rules_with_cnf_iterator", "NEW-ALEXANDRIA-RULES-WITH-CNF-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "does_constant_exist_with_name_or_guid", "DOES-CONSTANT-EXIST-WITH-NAME-OR-GUID", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "clear_alexandria_caches", "CLEAR-ALEXANDRIA-CACHES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "term_assertion_usage_count_estimate", "TERM-ASSERTION-USAGE-COUNT-ESTIMATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "estimated_cost_for_indexing_on_term", "ESTIMATED-COST-FOR-INDEXING-ON-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "create_alexandria_assertion_asserted_by_iterator_state", "CREATE-ALEXANDRIA-ASSERTION-ASSERTED-BY-ITERATOR-STATE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_assertion_asserted_by_iterator", "NEW-ALEXANDRIA-ASSERTION-ASSERTED-BY-ITERATOR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "count_alexandria_rules_assertion_asserted_by", "COUNT-ALEXANDRIA-RULES-ASSERTION-ASSERTED-BY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "create_alexandria_assertion_asserted_why_iterator_state", "CREATE-ALEXANDRIA-ASSERTION-ASSERTED-WHY-ITERATOR-STATE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_assertion_asserted_why_iterator", "NEW-ALEXANDRIA-ASSERTION-ASSERTED-WHY-ITERATOR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "count_alexandria_rules_assertion_asserted_why", "COUNT-ALEXANDRIA-RULES-ASSERTION-ASSERTED-WHY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "create_alexandria_assertion_asserted_on_iterator_state", "CREATE-ALEXANDRIA-ASSERTION-ASSERTED-ON-ITERATOR-STATE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_assertion_asserted_on_iterator", "NEW-ALEXANDRIA-ASSERTION-ASSERTED-ON-ITERATOR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "count_alexandria_rules_assertion_asserted_on", "COUNT-ALEXANDRIA-RULES-ASSERTION-ASSERTED-ON", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "all_genl_mts_alexandria", "ALL-GENL-MTS-ALEXANDRIA", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "all_spec_mts_alexandria", "ALL-SPEC-MTS-ALEXANDRIA", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "create_alexandria_defns_cache_iterator_state", "CREATE-ALEXANDRIA-DEFNS-CACHE-ITERATOR-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_iterators", "new_alexandria_defns_cache_iterator", "NEW-ALEXANDRIA-DEFNS-CACHE-ITERATOR", 1, 0, false);
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    public static SubLObject init_alexandria_iterators_file() {
        return (SubLObject)alexandria_iterators.NIL;
    }
    
    public static SubLObject setup_alexandria_iterators_file() {
        return (SubLObject)alexandria_iterators.NIL;
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
        me = (SubLFile)new alexandria_iterators();
        $sym0$ALEXANDRIA_KB_STORE_ITERATOR_DONE = SubLObjectFactory.makeSymbol("ALEXANDRIA-KB-STORE-ITERATOR-DONE");
        $sym1$ALEXANDRIA_KB_STORE_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("ALEXANDRIA-KB-STORE-ITERATOR-NEXT");
        $sym2$ALEXANDRIA_KB_STORE_ITERATOR_FINALIZE = SubLObjectFactory.makeSymbol("ALEXANDRIA-KB-STORE-ITERATOR-FINALIZE");
        $sym3$CREATE_ALEXANDRIA_GAFS_MATCHING_FORMULA_ITERATOR_STATE = SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-GAFS-MATCHING-FORMULA-ITERATOR-STATE");
        $sym4$CREATE_ALEXANDRIA_GAFS_MATCHING_FORMULA_RELEVANT_MT_AND_PRED_ITER = SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-GAFS-MATCHING-FORMULA-RELEVANT-MT-AND-PRED-ITERATOR-STATE");
        $sym5$CREATE_ALEXANDRIA_NATS_MATCHING_FORMULA_ITERATOR = SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-NATS-MATCHING-FORMULA-ITERATOR");
        $sym6$CREATE_ALEXANDRIA_REIFIABLE_FUNCTION_EXTENT_ITERATOR_STATE = SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-REIFIABLE-FUNCTION-EXTENT-ITERATOR-STATE");
        $sym7$CREATE_ALEXANDRIA_ALL_FORTS_ITERATOR_STATE = SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-ALL-FORTS-ITERATOR-STATE");
        $sym8$CREATE_ALEXANDRIA_ALL_GAFS_ITERATOR_STATE = SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-ALL-GAFS-ITERATOR-STATE");
        $sym9$CREATE_ALEXANDRIA_ALL_RULES_ITERATOR_STATE = SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-ALL-RULES-ITERATOR-STATE");
        $sym10$CREATE_ALEXANDRIA_ALL_UNBOUND_RULES_ITERATOR_STATE = SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-ALL-UNBOUND-RULES-ITERATOR-STATE");
        $sym11$CREATE_ALEXANDRIA_ALL_UNBOUND_RULES_RELEVANT_MT_ITERATOR_STATE = SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-ALL-UNBOUND-RULES-RELEVANT-MT-ITERATOR-STATE");
        $sym12$CREATE_ALEXANDRIA_ALL_ASSERTIONS_ITERATOR_STATE = SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-ALL-ASSERTIONS-ITERATOR-STATE");
        $sym13$CREATE_ALEXANDRIA_ALL_BIG_INTEGERS_ITERATOR_STATE = SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-ALL-BIG-INTEGERS-ITERATOR-STATE");
        $sym14$CREATE_ALEXANDRIA_ALL_INTEGERS_ITERATOR_STATE = SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-ALL-INTEGERS-ITERATOR-STATE");
        $sym15$CREATE_ALEXANDRIA_ALL_BOOKKEEPING_GAFS_ITERATOR_STATE = SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-ALL-BOOKKEEPING-GAFS-ITERATOR-STATE");
        $sym16$CREATE_ALEXANDRIA_ALL_CONSTANTS_ITERATOR_STATE = SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-ALL-CONSTANTS-ITERATOR-STATE");
        $sym17$CREATE_ALEXANDRIA_ALL_NARTS_ITERATOR_STATE = SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-ALL-NARTS-ITERATOR-STATE");
        $sym18$CREATE_ALEXANDRIA_ALL_DEDUCTIONS_ITERATOR_STATE = SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-ALL-DEDUCTIONS-ITERATOR-STATE");
        $sym19$CREATE_ALEXANDRIA_ALL_FLOATS_ITERATOR_STATE = SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-ALL-FLOATS-ITERATOR-STATE");
        $sym20$CREATE_ALEXANDRIA_ALL_FORMULAS_ITERATOR_STATE = SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-ALL-FORMULAS-ITERATOR-STATE");
        $sym21$CREATE_ALEXANDRIA_ALL_HL_SUPPORTS_ITERATOR_STATE = SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-ALL-HL-SUPPORTS-ITERATOR-STATE");
        $sym22$CREATE_ALEXANDRIA_ALL_KB_HL_SUPPORTS_ITERATOR_STATE = SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-ALL-KB-HL-SUPPORTS-ITERATOR-STATE");
        $sym23$CREATE_ALEXANDRIA_ALL_ITEMS_ITERATOR_STATE = SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-ALL-ITEMS-ITERATOR-STATE");
        $sym24$CREATE_ALEXANDRIA_ALL_STRINGS_ITERATOR_STATE = SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-ALL-STRINGS-ITERATOR-STATE");
        $sym25$CREATE_ALEXANDRIA_ALL_NUMBERS_ITERATOR_STATE = SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-ALL-NUMBERS-ITERATOR-STATE");
        $sym26$CREATE_ALEXANDRIA_ALL_SUBL_EXPRESSIONS_ITERATOR_STATE = SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-ALL-SUBL-EXPRESSIONS-ITERATOR-STATE");
        $sym27$CREATE_ALEXANDRIA_ALL_VARIABLES_ITERATOR_STATE = SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-ALL-VARIABLES-ITERATOR-STATE");
        $sym28$CREATE_ALEXANDRIA_ALL_UNREPRESENTED_TERMS_ITERATOR_STATE = SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-ALL-UNREPRESENTED-TERMS-ITERATOR-STATE");
        $sym29$CREATE_ALEXANDRIA_TERM_ASSERTIONS_ITERATOR_STATE = SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-TERM-ASSERTIONS-ITERATOR-STATE");
        $sym30$CREATE_ALEXANDRIA_GAF_ARG0_ITERATOR_STATE = SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-GAF-ARG0-ITERATOR-STATE");
        $sym31$CREATE_ALEXANDRIA_GAF_ARG0_RELEVANT_MT_ITERATOR_STATE = SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-GAF-ARG0-RELEVANT-MT-ITERATOR-STATE");
        $sym32$CREATE_ALEXANDRIA_GAF_ARG_ITERATOR_STATE = SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-GAF-ARG-ITERATOR-STATE");
        $sym33$CREATE_ALEXANDRIA_GAF_ARG_RELEVANT_MT_AND_PRED_ITERATOR_STATE = SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-GAF-ARG-RELEVANT-MT-AND-PRED-ITERATOR-STATE");
        $sym34$CREATE_ALEXANDRIA_GAF_ARG_RELEVANT_MT_ITERATOR_STATE = SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-GAF-ARG-RELEVANT-MT-ITERATOR-STATE");
        $sym35$CREATE_ALEXANDRIA_GAF_ARG_FORMULA_ITERATOR_STATE = SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-GAF-ARG-FORMULA-ITERATOR-STATE");
        $sym36$CREATE_ALEXANDRIA_GAF_ARG_FORMULA_RELEVANT_MT_AND_PRED_ITERATOR_S = SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-GAF-ARG-FORMULA-RELEVANT-MT-AND-PRED-ITERATOR-STATE");
        $sym37$CREATE_ALEXANDRIA_GAF_ARG_FORMULA_RELEVANT_MT_ITERATOR_STATE = SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-GAF-ARG-FORMULA-RELEVANT-MT-ITERATOR-STATE");
        $sym38$CREATE_ALEXANDRIA_GAF_ARG_VALUES_ITERATOR_STATE = SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-GAF-ARG-VALUES-ITERATOR-STATE");
        $sym39$CREATE_ALEXANDRIA_GAF_ARG_VALUES_RELEVANT_MT_AND_PRED_ITERATOR_ST = SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-GAF-ARG-VALUES-RELEVANT-MT-AND-PRED-ITERATOR-STATE");
        $sym40$CREATE_ALEXANDRIA_GAF_ARG_VALUES_RELEVANT_MT_ITERATOR_STATE = SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-GAF-ARG-VALUES-RELEVANT-MT-ITERATOR-STATE");
        $sym41$CREATE_ALEXANDRIA_GAF_ARG_ARG_RELEVANT_MT_AND_PRED_ITERATOR_STATE = SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-GAF-ARG-ARG-RELEVANT-MT-AND-PRED-ITERATOR-STATE");
        $sym42$CREATE_ALEXANDRIA_MT_CONTENTS_ITERATOR_STATE_RELEVANT_MT = SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-MT-CONTENTS-ITERATOR-STATE-RELEVANT-MT");
        $sym43$CREATE_ALEXANDRIA_MT_CONTENTS_ITERATOR_STATE = SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-MT-CONTENTS-ITERATOR-STATE");
        $sym44$CREATE_ALEXANDRIA_OTHER_INDEX_ITERATOR_STATE = SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-OTHER-INDEX-ITERATOR-STATE");
        $sym45$CREATE_ALEXANDRIA_OTHER_INDEX_RELEVANT_MT_AND_PRED_ITERATOR_STATE = SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-OTHER-INDEX-RELEVANT-MT-AND-PRED-ITERATOR-STATE");
        $sym46$CREATE_ALEXANDRIA_OTHER_INDEX_RELEVANT_MT_ITERATOR_STATE = SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-OTHER-INDEX-RELEVANT-MT-ITERATOR-STATE");
        $sym47$CREATE_ALEXANDRIA_RULES_WITH_PRED_RELEVANT_MT_ITERATOR_STATE = SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-RULES-WITH-PRED-RELEVANT-MT-ITERATOR-STATE");
        $sym48$CREATE_ALEXANDRIA_RULES_WITH_PRED_AND_ARG2_ITERATOR_STATE = SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-RULES-WITH-PRED-AND-ARG2-ITERATOR-STATE");
        $sym49$CREATE_ALEXANDRIA_RULES_WITH_PRED_AND_ARG2_RELEVANT_MT_ITERATOR_S = SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-RULES-WITH-PRED-AND-ARG2-RELEVANT-MT-ITERATOR-STATE");
        $sym50$CREATE_ALEXANDRIA_NESTED_FORMULA_RULES_ITERATOR_STATE = SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-NESTED-FORMULA-RULES-ITERATOR-STATE");
        $sym51$CREATE_ALEXANDRIA_NESTED_FORMULA_RULES_RELEVANT_MT_ITERATOR_STATE = SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-NESTED-FORMULA-RULES-RELEVANT-MT-ITERATOR-STATE");
        $sym52$CREATE_ALEXANDRIA_FUNCTION_EXTENT_ITERATOR_STATE = SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-FUNCTION-EXTENT-ITERATOR-STATE");
        $sym53$CREATE_ALEXANDRIA_NART_ARG_INDEX_ITERATOR_STATE = SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-NART-ARG-INDEX-ITERATOR-STATE");
        $kw54$UNKNOWN = SubLObjectFactory.makeKeyword("UNKNOWN");
        $kw55$LATENCY = SubLObjectFactory.makeKeyword("LATENCY");
        $sym56$CREATE_ALEXANDRIA_ASSERTION_ASSERTED_BY_ITERATOR_STATE = SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-ASSERTION-ASSERTED-BY-ITERATOR-STATE");
        $sym57$CREATE_ALEXANDRIA_ASSERTION_ASSERTED_WHY_ITERATOR_STATE = SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-ASSERTION-ASSERTED-WHY-ITERATOR-STATE");
        $sym58$CREATE_ALEXANDRIA_ASSERTION_ASSERTED_ON_ITERATOR_STATE = SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-ASSERTION-ASSERTED-ON-ITERATOR-STATE");
    }
}

/*

	Total time: 192 ms
	
*/