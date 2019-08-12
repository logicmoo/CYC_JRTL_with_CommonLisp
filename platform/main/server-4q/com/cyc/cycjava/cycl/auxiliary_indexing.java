/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cfasl.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
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
 * module:      AUXILIARY-INDEXING
 * source file: /cyc/top/cycl/auxiliary-indexing.lisp
 * created:     2019/07/03 17:37:24
 */
public final class auxiliary_indexing extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new auxiliary_indexing();

 public static final String myName = "com.cyc.cycjava.cycl.auxiliary_indexing";


    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $auxiliary_indices$ = makeSymbol("*AUXILIARY-INDICES*");

    private static final SubLSymbol $UNBOUND_RULE_INDEX = makeKeyword("UNBOUND-RULE-INDEX");

    static private final SubLString $$$Unbound_Rule_Index = makeString("Unbound Rule Index");

    private static final SubLSymbol $UNBOUND_RULE_INDEX_POS = makeKeyword("UNBOUND-RULE-INDEX-POS");

    static private final SubLList $list7 = list(new SubLObject[]{ $NAME, makeString("Unbound positive rule index"), makeKeyword("DOMAIN"), list($NAME, makeString("term"), makeKeyword("VALIDITY-TEST"), makeSymbol("AUXILIARY-INDEX-P")), makeKeyword("TOP-LEVEL-KEY"), makeKeyword("POS"), $KEYS, list(list($NAME, makeString("sense"), makeKeyword("VALIDITY-TEST"), makeSymbol("SENSE-P"), makeKeyword("EQUAL-TEST"), EQ), list(new SubLObject[]{ $NAME, makeString("mt"), makeKeyword("MT?"), T, makeKeyword("VALIDITY-TEST"), makeSymbol("HLMT-P"), makeKeyword("RELEVANCE-TEST"), makeSymbol("RELEVANT-MT?"), makeKeyword("EQUAL-TEST"), EQUAL }), list($NAME, makeString("direction"), makeKeyword("VALIDITY-TEST"), makeSymbol("DIRECTION-P"), makeKeyword("EQUAL-TEST"), EQ)), makeKeyword("RANGE"), list($NAME, makeString("rule"), makeKeyword("VALIDITY-TEST"), makeSymbol("RULE-ASSERTION?"), makeKeyword("DOCUMENTATION"), makeString("A rule assertion in mt MT with direction DIRECTION,\nwhich contains a pos-lit with a variable in the predicate position.")) });

    private static final SubLSymbol $UNBOUND_RULE_INDEX_NEG = makeKeyword("UNBOUND-RULE-INDEX-NEG");

    static private final SubLList $list9 = list(new SubLObject[]{ $NAME, makeString("Unbound negative rule index"), makeKeyword("DOMAIN"), list($NAME, makeString("term"), makeKeyword("VALIDITY-TEST"), makeSymbol("AUXILIARY-INDEX-P")), makeKeyword("TOP-LEVEL-KEY"), makeKeyword("NEG"), $KEYS, list(list($NAME, makeString("sense"), makeKeyword("VALIDITY-TEST"), makeSymbol("SENSE-P"), makeKeyword("EQUAL-TEST"), EQ), list(new SubLObject[]{ $NAME, makeString("mt"), makeKeyword("MT?"), T, makeKeyword("VALIDITY-TEST"), makeSymbol("HLMT-P"), makeKeyword("RELEVANCE-TEST"), makeSymbol("RELEVANT-MT?"), makeKeyword("EQUAL-TEST"), EQUAL }), list($NAME, makeString("direction"), makeKeyword("VALIDITY-TEST"), makeSymbol("DIRECTION-P"), makeKeyword("EQUAL-TEST"), EQ)), makeKeyword("RANGE"), list($NAME, makeString("rule"), makeKeyword("VALIDITY-TEST"), makeSymbol("RULE-ASSERTION?"), makeKeyword("DOCUMENTATION"), makeString("A rule assertion in mt MT with direction DIRECTION,\nwhich contains a neg-lit with a variable in the predicate position.")) });

    static private final SubLSymbol $sym10$RELEVANT_MT_ = makeSymbol("RELEVANT-MT?");

    private static final SubLSymbol UNBOUND_PREDICATE_LITERAL = makeSymbol("UNBOUND-PREDICATE-LITERAL");

    private static final SubLString $str18$Rebuilding_unbound_rule_index_str = makeString("Rebuilding unbound rule index structure");

    public static final SubLObject auxiliary_indices_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return copy_list($auxiliary_indices$.getDynamicValue(thread));
        }
    }

    public static SubLObject auxiliary_indices() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return copy_list($auxiliary_indices$.getDynamicValue(thread));
    }

    public static final SubLObject declare_auxiliary_index_alt(SubLObject aux_index, SubLObject name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(aux_index, SYMBOLP);
            SubLTrampolineFile.checkType(name, STRINGP);
            {
                SubLObject item_var = aux_index;
                if (NIL == member(item_var, $auxiliary_indices$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $auxiliary_indices$.setDynamicValue(cons(item_var, $auxiliary_indices$.getDynamicValue(thread)), thread);
                }
            }
            put(aux_index, $INDEX_NAME, name);
            return aux_index;
        }
    }

    public static SubLObject declare_auxiliary_index(final SubLObject aux_index, final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != symbolp(aux_index) : "! symbolp(aux_index) " + ("Types.symbolp(aux_index) " + "CommonSymbols.NIL != Types.symbolp(aux_index) ") + aux_index;
        assert NIL != stringp(name) : "! stringp(name) " + ("Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) ") + name;
        if (NIL == member(aux_index, $auxiliary_indices$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
            $auxiliary_indices$.setDynamicValue(cons(aux_index, $auxiliary_indices$.getDynamicValue(thread)), thread);
        }
        put(aux_index, $INDEX_NAME, name);
        return aux_index;
    }

    public static final SubLObject auxiliary_index_p_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return subl_promotions.memberP(v_object, $auxiliary_indices$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject auxiliary_index_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(v_object, $auxiliary_indices$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject get_auxiliary_index_alt(SubLObject aux_index) {
        return get(aux_index, $INDEX, NIL);
    }

    public static SubLObject get_auxiliary_index(final SubLObject aux_index) {
        return get(aux_index, $INDEX, NIL);
    }

    public static SubLObject auxiliary_index_swapped_inP(final SubLObject aux_index) {
        return T;
    }

    public static final SubLObject reset_auxiliary_index_alt(SubLObject aux_index, SubLObject new_index) {
        if (NIL != new_index) {
            put(aux_index, $INDEX, new_index);
        } else {
            remprop(aux_index, $INDEX);
        }
        return aux_index;
    }

    public static SubLObject reset_auxiliary_index(final SubLObject aux_index, final SubLObject new_index) {
        if (NIL != new_index) {
            put(aux_index, $INDEX, new_index);
        } else {
            remprop(aux_index, $INDEX);
        }
        return aux_index;
    }

    public static final SubLObject clear_auxiliary_index_alt(SubLObject aux_index) {
        return com.cyc.cycjava.cycl.auxiliary_indexing.reset_auxiliary_index(aux_index, new_simple_index());
    }

    public static SubLObject clear_auxiliary_index(final SubLObject aux_index) {
        return reset_auxiliary_index(aux_index, new_simple_index());
    }

    public static final SubLObject auxiliary_index_name_alt(SubLObject aux_index) {
        return get(aux_index, $INDEX_NAME, UNPROVIDED);
    }

    public static SubLObject auxiliary_index_name(final SubLObject aux_index) {
        return get(aux_index, $INDEX_NAME, UNPROVIDED);
    }

    /**
     * Return the unbound rule count at SENSE MT DIRECTION
     */
    @LispMethod(comment = "Return the unbound rule count at SENSE MT DIRECTION")
    public static final SubLObject num_unbound_rule_index_alt(SubLObject sense, SubLObject mt, SubLObject direction) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (NIL != simple_indexed_term_p(com.cyc.cycjava.cycl.auxiliary_indexing.unbound_rule_index())) {
            {
                SubLObject count = ZERO_INTEGER;
                SubLObject cdolist_list_var = do_simple_index_term_assertion_list(com.cyc.cycjava.cycl.auxiliary_indexing.unbound_rule_index());
                SubLObject ass = NIL;
                for (ass = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ass = cdolist_list_var.first()) {
                    if (NIL != simple_indexing.matches_unbound_rule_index(ass, sense, mt, direction)) {
                        count = add(count, ONE_INTEGER);
                    }
                }
                return count;
            }
        } else {
            if (NIL == sense) {
                {
                    SubLObject count = ZERO_INTEGER;
                    SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
                    SubLObject sense_1 = NIL;
                    for (sense_1 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sense_1 = cdolist_list_var.first()) {
                        count = add(count, com.cyc.cycjava.cycl.auxiliary_indexing.num_unbound_rule_index(sense_1, UNPROVIDED, UNPROVIDED));
                    }
                    return count;
                }
            } else {
                {
                    SubLObject unbound_rule_subindex = com.cyc.cycjava.cycl.auxiliary_indexing.get_unbound_rule_subindex(sense, mt, direction);
                    return NIL != unbound_rule_subindex ? ((SubLObject) (subindex_leaf_count(unbound_rule_subindex))) : ZERO_INTEGER;
                }
            }
        }
    }

    /**
     * Return the unbound rule count at SENSE MT DIRECTION
     */
    @LispMethod(comment = "Return the unbound rule count at SENSE MT DIRECTION")
    public static SubLObject num_unbound_rule_index(SubLObject sense, SubLObject mt, SubLObject direction) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (NIL != simple_indexed_term_p(unbound_rule_index())) {
            SubLObject count = ZERO_INTEGER;
            SubLObject cdolist_list_var = do_simple_index_term_assertion_list(unbound_rule_index());
            SubLObject ass = NIL;
            ass = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != simple_indexing.matches_unbound_rule_index(ass, sense, mt, direction)) {
                    count = add(count, ONE_INTEGER);
                }
                cdolist_list_var = cdolist_list_var.rest();
                ass = cdolist_list_var.first();
            } 
            return count;
        }
        if (NIL == sense) {
            SubLObject count = ZERO_INTEGER;
            SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
            SubLObject sense_$1 = NIL;
            sense_$1 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                count = add(count, num_unbound_rule_index(sense_$1, UNPROVIDED, UNPROVIDED));
                cdolist_list_var = cdolist_list_var.rest();
                sense_$1 = cdolist_list_var.first();
            } 
            return count;
        }
        final SubLObject unbound_rule_subindex = get_unbound_rule_subindex(sense, mt, direction);
        return NIL != unbound_rule_subindex ? subindex_leaf_count(unbound_rule_subindex) : ZERO_INTEGER;
    }

    /**
     * Return the unbound rule count at relevant mts under SENSE.
     */
    @LispMethod(comment = "Return the unbound rule count at relevant mts under SENSE.")
    public static final SubLObject relevant_num_unbound_rule_index_alt(SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject count = ZERO_INTEGER;
            if (NIL != simple_indexed_term_p(com.cyc.cycjava.cycl.auxiliary_indexing.unbound_rule_index())) {
                {
                    SubLObject cdolist_list_var = do_simple_index_term_assertion_list(com.cyc.cycjava.cycl.auxiliary_indexing.unbound_rule_index());
                    SubLObject ass = NIL;
                    for (ass = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ass = cdolist_list_var.first()) {
                        if (NIL != simple_indexing.matches_unbound_rule_index(ass, sense, UNPROVIDED, UNPROVIDED)) {
                            if (NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(ass))) {
                                count = add(count, ONE_INTEGER);
                            }
                        }
                    }
                }
            } else {
                if (NIL == sense) {
                    {
                        SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
                        SubLObject sense_2 = NIL;
                        for (sense_2 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sense_2 = cdolist_list_var.first()) {
                            count = add(count, com.cyc.cycjava.cycl.auxiliary_indexing.relevant_num_unbound_rule_index(sense_2));
                        }
                    }
                } else {
                    {
                        SubLObject mts = com.cyc.cycjava.cycl.auxiliary_indexing.key_unbound_rule_index(sense, UNPROVIDED);
                        SubLObject cdolist_list_var = mts;
                        SubLObject mt = NIL;
                        for (mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt = cdolist_list_var.first()) {
                            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                count = add(count, com.cyc.cycjava.cycl.auxiliary_indexing.num_unbound_rule_index(sense, mt, UNPROVIDED));
                            }
                        }
                    }
                }
            }
            return count;
        }
    }

    /**
     * Return the unbound rule count at relevant mts under SENSE.
     */
    @LispMethod(comment = "Return the unbound rule count at relevant mts under SENSE.")
    public static SubLObject relevant_num_unbound_rule_index(SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject count = ZERO_INTEGER;
        if (NIL != simple_indexed_term_p(unbound_rule_index())) {
            SubLObject cdolist_list_var = do_simple_index_term_assertion_list(unbound_rule_index());
            SubLObject ass = NIL;
            ass = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((NIL != simple_indexing.matches_unbound_rule_index(ass, sense, UNPROVIDED, UNPROVIDED)) && (NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(ass)))) {
                    count = add(count, ONE_INTEGER);
                }
                cdolist_list_var = cdolist_list_var.rest();
                ass = cdolist_list_var.first();
            } 
        } else
            if (NIL == sense) {
                SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
                SubLObject sense_$2 = NIL;
                sense_$2 = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    count = add(count, relevant_num_unbound_rule_index(sense_$2));
                    cdolist_list_var = cdolist_list_var.rest();
                    sense_$2 = cdolist_list_var.first();
                } 
            } else {
                SubLObject cdolist_list_var2;
                final SubLObject mts = cdolist_list_var2 = key_unbound_rule_index(sense, UNPROVIDED);
                SubLObject mt = NIL;
                mt = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                        count = add(count, num_unbound_rule_index(sense, mt, UNPROVIDED));
                    }
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    mt = cdolist_list_var2.first();
                } 
            }

        return count;
    }

    /**
     * Return a list of the keys to the next unbound rule index level below SENSE MT.
     */
    @LispMethod(comment = "Return a list of the keys to the next unbound rule index level below SENSE MT.")
    public static final SubLObject key_unbound_rule_index_alt(SubLObject sense, SubLObject mt) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != simple_indexed_term_p(com.cyc.cycjava.cycl.auxiliary_indexing.unbound_rule_index())) {
            {
                SubLObject v_answer = NIL;
                SubLObject cdolist_list_var = do_simple_index_term_assertion_list(com.cyc.cycjava.cycl.auxiliary_indexing.unbound_rule_index());
                SubLObject ass = NIL;
                for (ass = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ass = cdolist_list_var.first()) {
                    v_answer = simple_indexing.simple_key_unbound_rule_index(ass, v_answer, sense, mt);
                }
                return v_answer;
            }
        } else {
            if (NIL == sense) {
                {
                    SubLObject keys = NIL;
                    SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
                    SubLObject sense_3 = NIL;
                    for (sense_3 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sense_3 = cdolist_list_var.first()) {
                        if (com.cyc.cycjava.cycl.auxiliary_indexing.num_unbound_rule_index(sense_3, UNPROVIDED, UNPROVIDED).isPositive()) {
                            keys = cons(sense_3, keys);
                        }
                    }
                    return keys;
                }
            } else {
                {
                    SubLObject subindex = com.cyc.cycjava.cycl.auxiliary_indexing.get_unbound_rule_subindex(sense, mt, UNPROVIDED);
                    return NIL != intermediate_index_p(subindex) ? ((SubLObject) (intermediate_index_keys(subindex))) : NIL;
                }
            }
        }
    }

    /**
     * Return a list of the keys to the next unbound rule index level below SENSE MT.
     */
    @LispMethod(comment = "Return a list of the keys to the next unbound rule index level below SENSE MT.")
    public static SubLObject key_unbound_rule_index(SubLObject sense, SubLObject mt) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != simple_indexed_term_p(unbound_rule_index())) {
            SubLObject v_answer = NIL;
            SubLObject cdolist_list_var = do_simple_index_term_assertion_list(unbound_rule_index());
            SubLObject ass = NIL;
            ass = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                v_answer = simple_indexing.simple_key_unbound_rule_index(ass, v_answer, sense, mt);
                cdolist_list_var = cdolist_list_var.rest();
                ass = cdolist_list_var.first();
            } 
            return v_answer;
        }
        if (NIL == sense) {
            SubLObject keys = NIL;
            SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
            SubLObject sense_$3 = NIL;
            sense_$3 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (num_unbound_rule_index(sense_$3, UNPROVIDED, UNPROVIDED).isPositive()) {
                    keys = cons(sense_$3, keys);
                }
                cdolist_list_var = cdolist_list_var.rest();
                sense_$3 = cdolist_list_var.first();
            } 
            return keys;
        }
        final SubLObject subindex = get_unbound_rule_subindex(sense, mt, UNPROVIDED);
        return NIL != intermediate_index_p(subindex) ? intermediate_index_keys(subindex) : NIL;
    }

    /**
     * Return a list of the mt-relevant keys to the next unbound rule index level below SENSE.
     */
    @LispMethod(comment = "Return a list of the mt-relevant keys to the next unbound rule index level below SENSE.")
    public static final SubLObject relevant_key_unbound_rule_index_alt(SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != simple_indexed_term_p(com.cyc.cycjava.cycl.auxiliary_indexing.unbound_rule_index())) {
            {
                SubLObject keys = NIL;
                SubLObject cdolist_list_var = do_simple_index_term_assertion_list(com.cyc.cycjava.cycl.auxiliary_indexing.unbound_rule_index());
                SubLObject ass = NIL;
                for (ass = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ass = cdolist_list_var.first()) {
                    if (NIL != simple_indexing.matches_unbound_rule_index(ass, sense, UNPROVIDED, UNPROVIDED)) {
                        if (NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(ass))) {
                            keys = simple_indexing.simple_key_unbound_rule_index(ass, keys, sense, UNPROVIDED);
                        }
                    }
                }
                return keys;
            }
        } else {
            if (NIL == sense) {
                {
                    SubLObject keys = NIL;
                    SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
                    SubLObject sense_4 = NIL;
                    for (sense_4 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sense_4 = cdolist_list_var.first()) {
                        if (com.cyc.cycjava.cycl.auxiliary_indexing.relevant_num_unbound_rule_index(sense_4).isPositive()) {
                            keys = cons(sense_4, keys);
                        }
                    }
                    return keys;
                }
            } else {
                return list_utilities.delete_if_not(symbol_function($sym10$RELEVANT_MT_), com.cyc.cycjava.cycl.auxiliary_indexing.key_unbound_rule_index(sense, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    /**
     * Return a list of the mt-relevant keys to the next unbound rule index level below SENSE.
     */
    @LispMethod(comment = "Return a list of the mt-relevant keys to the next unbound rule index level below SENSE.")
    public static SubLObject relevant_key_unbound_rule_index(SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != simple_indexed_term_p(unbound_rule_index())) {
            SubLObject keys = NIL;
            SubLObject cdolist_list_var = do_simple_index_term_assertion_list(unbound_rule_index());
            SubLObject ass = NIL;
            ass = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((NIL != simple_indexing.matches_unbound_rule_index(ass, sense, UNPROVIDED, UNPROVIDED)) && (NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(ass)))) {
                    keys = simple_indexing.simple_key_unbound_rule_index(ass, keys, sense, UNPROVIDED);
                }
                cdolist_list_var = cdolist_list_var.rest();
                ass = cdolist_list_var.first();
            } 
            return keys;
        }
        if (NIL == sense) {
            SubLObject keys = NIL;
            SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
            SubLObject sense_$4 = NIL;
            sense_$4 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (relevant_num_unbound_rule_index(sense_$4).isPositive()) {
                    keys = cons(sense_$4, keys);
                }
                cdolist_list_var = cdolist_list_var.rest();
                sense_$4 = cdolist_list_var.first();
            } 
            return keys;
        }
        return list_utilities.delete_if_not(symbol_function($sym10$RELEVANT_MT_), key_unbound_rule_index(sense, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject add_unbound_rule_index_alt(SubLObject sense, SubLObject mt, SubLObject direction, SubLObject assertion) {
        return kb_indexing.term_add_indexing_leaf(com.cyc.cycjava.cycl.auxiliary_indexing.unbound_rule_index(), list(sense, mt, direction), assertion);
    }

    public static SubLObject add_unbound_rule_index(final SubLObject sense, final SubLObject mt, final SubLObject direction, final SubLObject assertion) {
        return kb_indexing.term_add_indexing_leaf(unbound_rule_index(), list(sense, mt, direction), assertion);
    }

    public static final SubLObject rem_unbound_rule_index_alt(SubLObject sense, SubLObject mt, SubLObject direction, SubLObject assertion) {
        return kb_indexing.term_rem_indexing_leaf(com.cyc.cycjava.cycl.auxiliary_indexing.unbound_rule_index(), list(sense, mt, direction), assertion);
    }

    public static SubLObject rem_unbound_rule_index(final SubLObject sense, final SubLObject mt, final SubLObject direction, final SubLObject assertion) {
        return kb_indexing.term_rem_indexing_leaf(unbound_rule_index(), list(sense, mt, direction), assertion);
    }

    /**
     *
     *
     * @return nil or subindex-p
     */
    @LispMethod(comment = "@return nil or subindex-p")
    public static final SubLObject get_unbound_rule_subindex_alt(SubLObject sense, SubLObject mt, SubLObject direction) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return kb_indexing.get_subindex(com.cyc.cycjava.cycl.auxiliary_indexing.unbound_rule_index(), list(sense, mt, direction));
    }

    /**
     *
     *
     * @return nil or subindex-p
     */
    @LispMethod(comment = "@return nil or subindex-p")
    public static SubLObject get_unbound_rule_subindex(final SubLObject sense, SubLObject mt, SubLObject direction) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return kb_indexing.get_subindex(unbound_rule_index(), list(sense, mt, direction));
    }

    public static final SubLObject map_unbound_rule_index_alt(SubLObject function, SubLObject sense, SubLObject direction) {
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(function, FUNCTION_SPEC_P);
            SubLTrampolineFile.checkType(sense, SENSE_P);
            {
                SubLObject catch_var = NIL;
                try {
                    if (NIL != simple_indexed_term_p(com.cyc.cycjava.cycl.auxiliary_indexing.unbound_rule_index())) {
                        {
                            SubLObject cdolist_list_var = do_simple_index_term_assertion_list(com.cyc.cycjava.cycl.auxiliary_indexing.unbound_rule_index());
                            SubLObject ass = NIL;
                            for (ass = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ass = cdolist_list_var.first()) {
                                if (NIL != simple_indexing.matches_unbound_rule_index(ass, sense, direction, UNPROVIDED)) {
                                    funcall(function, ass);
                                }
                            }
                        }
                    } else {
                        {
                            SubLObject direction_subindex = com.cyc.cycjava.cycl.auxiliary_indexing.get_unbound_rule_subindex(sense, UNPROVIDED, UNPROVIDED);
                            if (NIL != direction_subindex) {
                                {
                                    SubLObject index = direction_subindex;
                                    if (NIL != do_intermediate_index_valid_index_p(index)) {
                                        {
                                            SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(intermediate_index_dictionary(index)));
                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject candidate_direction = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                    SubLObject final_index = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if ((NIL == direction) || (candidate_direction == direction)) {
                                                        {
                                                            SubLObject index_5 = final_index;
                                                            if (NIL != do_final_index_valid_index_p(index_5)) {
                                                                {
                                                                    SubLObject set_contents_var = set.do_set_internal(final_index_set(index_5));
                                                                    SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                                                    SubLObject state = NIL;
                                                                    for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                        {
                                                                            SubLObject ass = set_contents.do_set_contents_next(basis_object, state);
                                                                            if (NIL != set_contents.do_set_contents_element_validP(state, ass)) {
                                                                                funcall(function, ass);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                }
                                            } 
                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
                }
            }
            return NIL;
        }
    }

    public static SubLObject map_unbound_rule_index(final SubLObject function, final SubLObject sense, SubLObject direction) {
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != function_spec_p(function) : "! function_spec_p(function) " + ("Types.function_spec_p(function) " + "CommonSymbols.NIL != Types.function_spec_p(function) ") + function;
        assert NIL != enumeration_types.sense_p(sense) : "! enumeration_types.sense_p(sense) " + ("enumeration_types.sense_p(sense) " + "CommonSymbols.NIL != enumeration_types.sense_p(sense) ") + sense;
        SubLObject catch_var = NIL;
        try {
            thread.throwStack.push($MAPPING_DONE);
            if (NIL != kb_mapping_macros.do_unbound_predicate_rule_index_key_validator(sense, direction)) {
                final SubLObject iterator_var = kb_mapping_macros.new_unbound_predicate_rule_final_index_spec_iterator(sense, direction);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                            SubLObject done_var_$5 = NIL;
                            final SubLObject token_var_$6 = NIL;
                            while (NIL == done_var_$5) {
                                final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$6);
                                final SubLObject valid_$7 = makeBoolean(!token_var_$6.eql(ass));
                                if ((NIL != valid_$7) && (NIL != simple_indexing.matches_unbound_rule_index(ass, sense, NIL, direction))) {
                                    funcall(function, ass);
                                }
                                done_var_$5 = makeBoolean(NIL == valid_$7);
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
        } catch (final Throwable ccatch_env_var) {
            catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
        } finally {
            thread.throwStack.pop();
        }
        return NIL;
    }

    public static final SubLObject map_unbound_rule_mt_index_alt(SubLObject function, SubLObject sense, SubLObject mt, SubLObject direction) {
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(function, FUNCTION_SPEC_P);
            SubLTrampolineFile.checkType(sense, SENSE_P);
            SubLTrampolineFile.checkType(mt, HLMT_P);
            {
                SubLObject catch_var = NIL;
                try {
                    if (NIL != simple_indexed_term_p(com.cyc.cycjava.cycl.auxiliary_indexing.unbound_rule_index())) {
                        {
                            SubLObject cdolist_list_var = do_simple_index_term_assertion_list(com.cyc.cycjava.cycl.auxiliary_indexing.unbound_rule_index());
                            SubLObject ass = NIL;
                            for (ass = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ass = cdolist_list_var.first()) {
                                if (NIL != simple_indexing.matches_unbound_rule_index(ass, sense, mt, direction)) {
                                    funcall(function, ass);
                                }
                            }
                        }
                    } else {
                        {
                            SubLObject direction_subindex = com.cyc.cycjava.cycl.auxiliary_indexing.get_unbound_rule_subindex(sense, mt, UNPROVIDED);
                            if (NIL != direction_subindex) {
                                {
                                    SubLObject index = direction_subindex;
                                    if (NIL != do_intermediate_index_valid_index_p(index)) {
                                        {
                                            SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(intermediate_index_dictionary(index)));
                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject candidate_direction = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                    SubLObject final_index = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if ((NIL == direction) || (candidate_direction == direction)) {
                                                        {
                                                            SubLObject index_6 = final_index;
                                                            if (NIL != do_final_index_valid_index_p(index_6)) {
                                                                {
                                                                    SubLObject set_contents_var = set.do_set_internal(final_index_set(index_6));
                                                                    SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                                                    SubLObject state = NIL;
                                                                    for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                        {
                                                                            SubLObject ass = set_contents.do_set_contents_next(basis_object, state);
                                                                            if (NIL != set_contents.do_set_contents_element_validP(state, ass)) {
                                                                                funcall(function, ass);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                }
                                            } 
                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
                }
            }
            return NIL;
        }
    }

    public static SubLObject map_unbound_rule_mt_index(final SubLObject function, final SubLObject sense, final SubLObject mt, SubLObject direction) {
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != function_spec_p(function) : "! function_spec_p(function) " + ("Types.function_spec_p(function) " + "CommonSymbols.NIL != Types.function_spec_p(function) ") + function;
        assert NIL != enumeration_types.sense_p(sense) : "! enumeration_types.sense_p(sense) " + ("enumeration_types.sense_p(sense) " + "CommonSymbols.NIL != enumeration_types.sense_p(sense) ") + sense;
        assert NIL != hlmt.hlmt_p(mt) : "! hlmt.hlmt_p(mt) " + ("hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) ") + mt;
        SubLObject catch_var = NIL;
        try {
            thread.throwStack.push($MAPPING_DONE);
            if (NIL != kb_mapping_macros.do_unbound_predicate_rule_index_key_validator(sense, direction)) {
                final SubLObject iterator_var = kb_mapping_macros.new_unbound_predicate_rule_final_index_spec_iterator(sense, direction);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                            SubLObject done_var_$8 = NIL;
                            final SubLObject token_var_$9 = NIL;
                            while (NIL == done_var_$8) {
                                final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$9);
                                final SubLObject valid_$10 = makeBoolean(!token_var_$9.eql(ass));
                                if ((NIL != valid_$10) && (NIL != simple_indexing.matches_unbound_rule_index(ass, sense, mt, direction))) {
                                    funcall(function, ass);
                                }
                                done_var_$8 = makeBoolean(NIL == valid_$10);
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
        } catch (final Throwable ccatch_env_var) {
            catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
        } finally {
            thread.throwStack.pop();
        }
        return NIL;
    }

    public static final SubLObject unbound_rule_index_alt() {
        return $UNBOUND_RULE_INDEX;
    }

    public static SubLObject unbound_rule_index() {
        return $UNBOUND_RULE_INDEX;
    }

    public static final SubLObject add_unbound_rule_indices_alt(SubLObject assertion) {
        {
            SubLObject cnf = assertions_high.assertion_cnf(assertion);
            SubLObject mt = assertions_high.assertion_mt(assertion);
            SubLObject direction = assertions_high.assertion_direction(assertion);
            SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
            SubLObject sense = NIL;
            for (sense = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sense = cdolist_list_var.first()) {
                if (NIL != com.cyc.cycjava.cycl.auxiliary_indexing.some_unbound_predicate_literal(cnf, sense)) {
                    com.cyc.cycjava.cycl.auxiliary_indexing.add_unbound_rule_index(sense, mt, direction, assertion);
                }
            }
        }
        return assertion;
    }

    public static SubLObject add_unbound_rule_indices(final SubLObject assertion) {
        final SubLObject cnf = assertions_high.assertion_cnf(assertion);
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        final SubLObject direction = assertions_high.assertion_direction(assertion);
        SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
        SubLObject sense = NIL;
        sense = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != some_unbound_predicate_literal(cnf, sense)) {
                add_unbound_rule_index(sense, mt, direction, assertion);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sense = cdolist_list_var.first();
        } 
        return assertion;
    }

    public static final SubLObject rem_unbound_rule_indices_alt(SubLObject assertion) {
        {
            SubLObject cnf = assertions_high.assertion_cnf(assertion);
            SubLObject mt = assertions_high.assertion_mt(assertion);
            SubLObject direction = assertions_high.assertion_direction(assertion);
            SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
            SubLObject sense = NIL;
            for (sense = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sense = cdolist_list_var.first()) {
                if (NIL != com.cyc.cycjava.cycl.auxiliary_indexing.some_unbound_predicate_literal(cnf, sense)) {
                    com.cyc.cycjava.cycl.auxiliary_indexing.rem_unbound_rule_index(sense, mt, direction, assertion);
                }
            }
        }
        return assertion;
    }

    public static SubLObject rem_unbound_rule_indices(final SubLObject assertion) {
        final SubLObject cnf = assertions_high.assertion_cnf(assertion);
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        final SubLObject direction = assertions_high.assertion_direction(assertion);
        SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
        SubLObject sense = NIL;
        sense = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != some_unbound_predicate_literal(cnf, sense)) {
                rem_unbound_rule_index(sense, mt, direction, assertion);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sense = cdolist_list_var.first();
        } 
        return assertion;
    }

    public static final SubLObject unbound_predicate_rule_p_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.auxiliary_indexing.unbound_rule_assertion_p(v_object);
    }

    public static SubLObject unbound_predicate_rule_p(final SubLObject v_object) {
        return unbound_rule_assertion_p(v_object);
    }

    public static final SubLObject clear_unbound_rule_index_alt() {
        com.cyc.cycjava.cycl.auxiliary_indexing.clear_auxiliary_index(com.cyc.cycjava.cycl.auxiliary_indexing.unbound_rule_index());
        return NIL;
    }

    public static SubLObject clear_unbound_rule_index() {
        clear_auxiliary_index(unbound_rule_index());
        return NIL;
    }

    public static final SubLObject unbound_rule_assertion_p_alt(SubLObject assertion) {
        if (NIL != assertions_high.rule_assertionP(assertion)) {
            {
                SubLObject cnf = assertions_high.assertion_cnf(assertion);
                SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
                SubLObject sense = NIL;
                for (sense = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sense = cdolist_list_var.first()) {
                    if (NIL != com.cyc.cycjava.cycl.auxiliary_indexing.some_unbound_predicate_literal(cnf, sense)) {
                        return T;
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject unbound_rule_assertion_p(final SubLObject assertion) {
        if (NIL != assertions_high.rule_assertionP(assertion)) {
            final SubLObject cnf = assertions_high.assertion_cnf(assertion);
            SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
            SubLObject sense = NIL;
            sense = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != some_unbound_predicate_literal(cnf, sense)) {
                    return T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                sense = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static final SubLObject unbound_predicate_literal_alt(SubLObject literal) {
        return makeBoolean(literal.isCons() && (NIL != variables.variable_p(literal_predicate(literal, UNPROVIDED))));
    }

    public static SubLObject unbound_predicate_literal(final SubLObject literal) {
        return makeBoolean(literal.isCons() && (NIL != variables.variable_p(literal_predicate(literal, UNPROVIDED))));
    }

    public static final SubLObject some_unbound_predicate_literal_alt(SubLObject clause, SubLObject sense) {
        {
            SubLObject literals = (sense == $POS) ? ((SubLObject) (clauses.pos_lits(clause))) : clauses.neg_lits(clause);
            return list_utilities.sublisp_boolean(find_if(symbol_function(UNBOUND_PREDICATE_LITERAL), literals, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        }
    }

    public static SubLObject some_unbound_predicate_literal(final SubLObject clause, final SubLObject sense) {
        final SubLObject literals = (sense == $POS) ? clauses.pos_lits(clause) : clauses.neg_lits(clause);
        return list_utilities.sublisp_boolean(find_if(symbol_function(UNBOUND_PREDICATE_LITERAL), literals, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    /**
     * Reconstruct all the auxiliary indices in the KB.
     */
    @LispMethod(comment = "Reconstruct all the auxiliary indices in the KB.")
    public static final SubLObject reconstruct_auxiliary_indices_alt() {
        com.cyc.cycjava.cycl.auxiliary_indexing.reconstruct_unbound_rule_indices();
        return NIL;
    }

    @LispMethod(comment = "Reconstruct all the auxiliary indices in the KB.")
    public static SubLObject reconstruct_auxiliary_indices() {
        reconstruct_unbound_rule_indices();
        return NIL;
    }/**
     * Reconstruct all the auxiliary indices in the KB.
     */


    public static final SubLObject reconstruct_unbound_rule_indices_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.auxiliary_indexing.clear_unbound_rule_index();
            {
                SubLObject idx = assertion_handles.do_assertions_table();
                SubLObject total = id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                SubLTrampolineFile.checkType($str_alt17$Rebuilding_unbound_rule_index_str, STRINGP);
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($str_alt17$Rebuilding_unbound_rule_index_str);
                        if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                            {
                                SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                SubLObject assertion = NIL;
                                while (NIL != id) {
                                    assertion = do_id_index_state_object(idx, $SKIP, id, state_var);
                                    if (NIL != do_id_index_id_and_object_validP(id, assertion, $SKIP)) {
                                        note_percent_progress(sofar, total);
                                        sofar = add(sofar, ONE_INTEGER);
                                        if (NIL != com.cyc.cycjava.cycl.auxiliary_indexing.unbound_rule_assertion_p(assertion)) {
                                            {
                                                SubLObject _prev_bind_0_7 = simple_indexing.$within_noting_terms_to_toggle_indexing_mode$.currentBinding(thread);
                                                SubLObject _prev_bind_1_8 = simple_indexing.$terms_to_toggle_indexing_mode$.currentBinding(thread);
                                                try {
                                                    simple_indexing.$within_noting_terms_to_toggle_indexing_mode$.bind(T, thread);
                                                    simple_indexing.$terms_to_toggle_indexing_mode$.bind(NIL, thread);
                                                    com.cyc.cycjava.cycl.auxiliary_indexing.add_unbound_rule_indices(assertion);
                                                    if (NIL != simple_indexing.$terms_to_toggle_indexing_mode$.getDynamicValue(thread)) {
                                                        simple_indexing.noting_terms_to_toggle_indexing_mode_internal();
                                                    }
                                                } finally {
                                                    simple_indexing.$terms_to_toggle_indexing_mode$.rebind(_prev_bind_1_8, thread);
                                                    simple_indexing.$within_noting_terms_to_toggle_indexing_mode$.rebind(_prev_bind_0_7, thread);
                                                }
                                            }
                                        }
                                    }
                                    id = do_id_index_next_id(idx, T, id, state_var);
                                    state_var = do_id_index_next_state(idx, T, id, state_var);
                                } 
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return com.cyc.cycjava.cycl.auxiliary_indexing.num_unbound_rule_index(UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject reconstruct_unbound_rule_indices() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        clear_unbound_rule_index();
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = $str18$Rebuilding_unbound_rule_index_str;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$11 = idx;
                if (NIL == id_index_objects_empty_p(idx_$11, $SKIP)) {
                    final SubLObject idx_$12 = idx_$11;
                    if (NIL == id_index_dense_objects_empty_p(idx_$12, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$12);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject assertion;
                        SubLObject _prev_bind_0_$13;
                        SubLObject _prev_bind_1_$14;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            a_handle = aref(vector_var, a_id);
                            if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(a_handle)) {
                                    a_handle = $SKIP;
                                }
                                assertion = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                if (NIL != unbound_rule_assertion_p(assertion)) {
                                    _prev_bind_0_$13 = simple_indexing.$within_noting_terms_to_toggle_indexing_mode$.currentBinding(thread);
                                    _prev_bind_1_$14 = simple_indexing.$terms_to_toggle_indexing_mode$.currentBinding(thread);
                                    try {
                                        simple_indexing.$within_noting_terms_to_toggle_indexing_mode$.bind(T, thread);
                                        simple_indexing.$terms_to_toggle_indexing_mode$.bind(NIL, thread);
                                        add_unbound_rule_indices(assertion);
                                        if (NIL != simple_indexing.$terms_to_toggle_indexing_mode$.getDynamicValue(thread)) {
                                            simple_indexing.noting_terms_to_toggle_indexing_mode_internal();
                                        }
                                    } finally {
                                        simple_indexing.$terms_to_toggle_indexing_mode$.rebind(_prev_bind_1_$14, thread);
                                        simple_indexing.$within_noting_terms_to_toggle_indexing_mode$.rebind(_prev_bind_0_$13, thread);
                                    }
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$13 = idx_$11;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$13)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$13);
                        SubLObject a_id2 = id_index_sparse_id_threshold(idx_$13);
                        final SubLObject end_id = id_index_next_id(idx_$13);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                final SubLObject assertion2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                if (NIL != unbound_rule_assertion_p(assertion2)) {
                                    final SubLObject _prev_bind_0_$14 = simple_indexing.$within_noting_terms_to_toggle_indexing_mode$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$15 = simple_indexing.$terms_to_toggle_indexing_mode$.currentBinding(thread);
                                    try {
                                        simple_indexing.$within_noting_terms_to_toggle_indexing_mode$.bind(T, thread);
                                        simple_indexing.$terms_to_toggle_indexing_mode$.bind(NIL, thread);
                                        add_unbound_rule_indices(assertion2);
                                        if (NIL != simple_indexing.$terms_to_toggle_indexing_mode$.getDynamicValue(thread)) {
                                            simple_indexing.noting_terms_to_toggle_indexing_mode_internal();
                                        }
                                    } finally {
                                        simple_indexing.$terms_to_toggle_indexing_mode$.rebind(_prev_bind_1_$15, thread);
                                        simple_indexing.$within_noting_terms_to_toggle_indexing_mode$.rebind(_prev_bind_0_$14, thread);
                                    }
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            a_id2 = add(a_id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return num_unbound_rule_index(UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject dump_auxiliary_indices_alt(SubLObject stream) {
        com.cyc.cycjava.cycl.auxiliary_indexing.dump_unbound_rule_index(stream);
        cfasl_output(NIL, stream);
        return NIL;
    }

    public static SubLObject dump_auxiliary_indices(final SubLObject stream) {
        dump_unbound_rule_index(stream);
        cfasl_output(NIL, stream);
        return NIL;
    }

    public static final SubLObject load_auxiliary_indices_alt(SubLObject stream) {
        com.cyc.cycjava.cycl.auxiliary_indexing.load_unbound_rule_index(stream);
        cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject load_auxiliary_indices(final SubLObject stream) {
        load_unbound_rule_index(stream);
        cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject dump_unbound_rule_index_alt(SubLObject stream) {
        cfasl_output(com.cyc.cycjava.cycl.auxiliary_indexing.get_auxiliary_index(com.cyc.cycjava.cycl.auxiliary_indexing.unbound_rule_index()), stream);
        return NIL;
    }

    public static SubLObject dump_unbound_rule_index(final SubLObject stream) {
        cfasl_output(get_auxiliary_index(unbound_rule_index()), stream);
        return NIL;
    }

    public static final SubLObject load_unbound_rule_index_alt(SubLObject stream) {
        com.cyc.cycjava.cycl.auxiliary_indexing.reset_auxiliary_index(com.cyc.cycjava.cycl.auxiliary_indexing.unbound_rule_index(), cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    public static SubLObject load_unbound_rule_index(final SubLObject stream) {
        reset_auxiliary_index(unbound_rule_index(), cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    public static SubLObject declare_auxiliary_indexing_file() {
        declareFunction("auxiliary_indices", "AUXILIARY-INDICES", 0, 0, false);
        declareFunction("declare_auxiliary_index", "DECLARE-AUXILIARY-INDEX", 2, 0, false);
        declareFunction("auxiliary_index_p", "AUXILIARY-INDEX-P", 1, 0, false);
        declareFunction("get_auxiliary_index", "GET-AUXILIARY-INDEX", 1, 0, false);
        declareFunction("auxiliary_index_swapped_inP", "AUXILIARY-INDEX-SWAPPED-IN?", 1, 0, false);
        declareFunction("reset_auxiliary_index", "RESET-AUXILIARY-INDEX", 2, 0, false);
        declareFunction("clear_auxiliary_index", "CLEAR-AUXILIARY-INDEX", 1, 0, false);
        declareFunction("auxiliary_index_name", "AUXILIARY-INDEX-NAME", 1, 0, false);
        declareFunction("num_unbound_rule_index", "NUM-UNBOUND-RULE-INDEX", 0, 3, false);
        declareFunction("relevant_num_unbound_rule_index", "RELEVANT-NUM-UNBOUND-RULE-INDEX", 0, 1, false);
        declareFunction("key_unbound_rule_index", "KEY-UNBOUND-RULE-INDEX", 0, 2, false);
        declareFunction("relevant_key_unbound_rule_index", "RELEVANT-KEY-UNBOUND-RULE-INDEX", 0, 1, false);
        declareFunction("add_unbound_rule_index", "ADD-UNBOUND-RULE-INDEX", 4, 0, false);
        declareFunction("rem_unbound_rule_index", "REM-UNBOUND-RULE-INDEX", 4, 0, false);
        declareFunction("get_unbound_rule_subindex", "GET-UNBOUND-RULE-SUBINDEX", 1, 2, false);
        declareFunction("map_unbound_rule_index", "MAP-UNBOUND-RULE-INDEX", 2, 1, false);
        declareFunction("map_unbound_rule_mt_index", "MAP-UNBOUND-RULE-MT-INDEX", 3, 1, false);
        declareFunction("unbound_rule_index", "UNBOUND-RULE-INDEX", 0, 0, false);
        declareFunction("add_unbound_rule_indices", "ADD-UNBOUND-RULE-INDICES", 1, 0, false);
        declareFunction("rem_unbound_rule_indices", "REM-UNBOUND-RULE-INDICES", 1, 0, false);
        declareFunction("unbound_predicate_rule_p", "UNBOUND-PREDICATE-RULE-P", 1, 0, false);
        declareFunction("clear_unbound_rule_index", "CLEAR-UNBOUND-RULE-INDEX", 0, 0, false);
        declareFunction("unbound_rule_assertion_p", "UNBOUND-RULE-ASSERTION-P", 1, 0, false);
        declareFunction("unbound_predicate_literal", "UNBOUND-PREDICATE-LITERAL", 1, 0, false);
        declareFunction("some_unbound_predicate_literal", "SOME-UNBOUND-PREDICATE-LITERAL", 2, 0, false);
        declareFunction("reconstruct_auxiliary_indices", "RECONSTRUCT-AUXILIARY-INDICES", 0, 0, false);
        declareFunction("reconstruct_unbound_rule_indices", "RECONSTRUCT-UNBOUND-RULE-INDICES", 0, 0, false);
        declareFunction("dump_auxiliary_indices", "DUMP-AUXILIARY-INDICES", 1, 0, false);
        declareFunction("load_auxiliary_indices", "LOAD-AUXILIARY-INDICES", 1, 0, false);
        declareFunction("dump_unbound_rule_index", "DUMP-UNBOUND-RULE-INDEX", 1, 0, false);
        declareFunction("load_unbound_rule_index", "LOAD-UNBOUND-RULE-INDEX", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt7 = list(new SubLObject[]{ $NAME, makeString("Unbound positive rule index"), makeKeyword("DOMAIN"), list($NAME, makeString("term"), makeKeyword("VALIDITY-TEST"), makeSymbol("AUXILIARY-INDEX-P")), makeKeyword("TOP-LEVEL-KEY"), makeKeyword("POS"), $KEYS, list(list($NAME, makeString("sense"), makeKeyword("VALIDITY-TEST"), makeSymbol("SENSE-P"), makeKeyword("EQUAL-TEST"), EQ), list(new SubLObject[]{ $NAME, makeString("mt"), makeKeyword("MT?"), T, makeKeyword("VALIDITY-TEST"), makeSymbol("HLMT-P"), makeKeyword("RELEVANCE-TEST"), makeSymbol("RELEVANT-MT?"), makeKeyword("EQUAL-TEST"), EQUAL }), list($NAME, makeString("direction"), makeKeyword("VALIDITY-TEST"), makeSymbol("DIRECTION-P"), makeKeyword("EQUAL-TEST"), EQ)), makeKeyword("RANGE"), list($NAME, makeString("rule"), makeKeyword("VALIDITY-TEST"), makeSymbol("RULE-ASSERTION?"), makeKeyword("DOCUMENTATION"), makeString("A rule assertion in mt MT with direction DIRECTION,\nwhich contains a pos-lit with a variable in the predicate position.")) });

    public static SubLObject init_auxiliary_indexing_file() {
        defparameter("*AUXILIARY-INDICES*", NIL);
        return NIL;
    }

    public static SubLObject setup_auxiliary_indexing_file() {
        declare_auxiliary_index($UNBOUND_RULE_INDEX, $$$Unbound_Rule_Index);
        kb_indexing_declarations.declare_index($UNBOUND_RULE_INDEX_POS, $list7);
        kb_indexing_declarations.declare_index($UNBOUND_RULE_INDEX_NEG, $list9);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_auxiliary_indexing_file();
    }

    @Override
    public void initializeVariables() {
        init_auxiliary_indexing_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_auxiliary_indexing_file();
    }

    static {
    }

    static private final SubLList $list_alt9 = list(new SubLObject[]{ $NAME, makeString("Unbound negative rule index"), makeKeyword("DOMAIN"), list($NAME, makeString("term"), makeKeyword("VALIDITY-TEST"), makeSymbol("AUXILIARY-INDEX-P")), makeKeyword("TOP-LEVEL-KEY"), makeKeyword("NEG"), $KEYS, list(list($NAME, makeString("sense"), makeKeyword("VALIDITY-TEST"), makeSymbol("SENSE-P"), makeKeyword("EQUAL-TEST"), EQ), list(new SubLObject[]{ $NAME, makeString("mt"), makeKeyword("MT?"), T, makeKeyword("VALIDITY-TEST"), makeSymbol("HLMT-P"), makeKeyword("RELEVANCE-TEST"), makeSymbol("RELEVANT-MT?"), makeKeyword("EQUAL-TEST"), EQUAL }), list($NAME, makeString("direction"), makeKeyword("VALIDITY-TEST"), makeSymbol("DIRECTION-P"), makeKeyword("EQUAL-TEST"), EQ)), makeKeyword("RANGE"), list($NAME, makeString("rule"), makeKeyword("VALIDITY-TEST"), makeSymbol("RULE-ASSERTION?"), makeKeyword("DOCUMENTATION"), makeString("A rule assertion in mt MT with direction DIRECTION,\nwhich contains a neg-lit with a variable in the predicate position.")) });

    static private final SubLString $str_alt17$Rebuilding_unbound_rule_index_str = makeString("Rebuilding unbound rule index structure");
}

/**
 * Total time: 350 ms
 */
