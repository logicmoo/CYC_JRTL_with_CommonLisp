package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class simple_indexing extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.simple_indexing";
    public static final String myFingerPrint = "b6da513aeec436d0eba904976dffb1c18adbafd5687ba711f889ed0d9b0e44bf";
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 26357L)
    public static SubLSymbol $within_noting_terms_to_toggle_indexing_mode$;
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 26579L)
    public static SubLSymbol $terms_to_toggle_indexing_mode$;
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 27129L)
    private static SubLSymbol $index_convert_threshold$;
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 27182L)
    private static SubLSymbol $index_convert_range$;
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 27233L)
    private static SubLSymbol $index_convert_complex_threshold$;
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 27472L)
    private static SubLSymbol $index_convert_simple_threshold$;
    private static final SubLSymbol $sym0$ASSERTION_P;
    private static final SubLSymbol $sym1$HLMT_EQUAL;
    private static final SubLObject $const2$termOfUnit;
    private static final SubLSymbol $kw3$POS;
    private static final SubLSymbol $sym4$MATCHES_PREDICATE_RULE_INDEX_TEST;
    private static final SubLSymbol $sym5$MATCHES_IST_PREDICATE_RULE_INDEX_TEST;
    private static final SubLSymbol $sym6$MATCHES_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX_TEST;
    private static final SubLSymbol $sym7$MATCHES_ISA_RULE_INDEX_TEST;
    private static final SubLObject $const8$isa;
    private static final SubLSymbol $sym9$MATCHES_QUOTED_ISA_RULE_INDEX_TEST;
    private static final SubLObject $const10$quotedIsa;
    private static final SubLSymbol $sym11$MATCHES_GENLS_RULE_INDEX_TEST;
    private static final SubLObject $const12$genls;
    private static final SubLSymbol $sym13$MATCHES_GENL_MT_RULE_INDEX_TEST;
    private static final SubLObject $const14$genlMt;
    private static final SubLSymbol $sym15$MATCHES_FUNCTION_RULE_INDEX_TEST;
    private static final SubLSymbol $sym16$MATCHES_EXCEPTION_RULE_INDEX_TEST;
    private static final SubLObject $const17$abnormal;
    private static final SubLSymbol $sym18$MATCHES_PRAGMA_RULE_INDEX_TEST;
    private static final SubLObject $const19$meetsPragmaticRequirement;
    private static final SubLSymbol $sym20$CLET;
    private static final SubLList $list21;
    private static final SubLList $list22;
    private static final SubLSymbol $sym23$NOTING_TERMS_TO_TOGGLE_INDEXING_MODE_INTERNAL;
    private static final SubLSymbol $sym24$NOTING_TERMS_TO_TOGGLE_INDEXING_MODE;
    private static final SubLSymbol $sym25$POSSIBLY_TOGGLE_TERM_INDEX_MODE;
    private static final SubLSymbol $sym26$VALID_ASSERTION;
    private static final SubLString $str27$mapping_Cyc_FORTs;
    private static final SubLSymbol $kw28$SKIP;
    private static final SubLString $str29$mapping_Cyc_assertions;
    private static final SubLSymbol $sym30$STRINGP;
    private static final SubLString $str31$invalid_index_under__S;
    private static final SubLSymbol $kw32$INVALID;
    private static final SubLSymbol $sym33$CLEAN_TERM_INDEX_INTERNAL;
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 687L)
    public static SubLObject gaf_arg_index_simple_match_p(final SubLObject assertion, final SubLObject v_term, SubLObject argnum, SubLObject predicate, SubLObject mt) {
        if (argnum == simple_indexing.UNPROVIDED) {
            argnum = (SubLObject)simple_indexing.NIL;
        }
        if (predicate == simple_indexing.UNPROVIDED) {
            predicate = (SubLObject)simple_indexing.NIL;
        }
        if (mt == simple_indexing.UNPROVIDED) {
            mt = (SubLObject)simple_indexing.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(simple_indexing.NIL != assertions_high.gaf_assertionP(assertion) && (simple_indexing.NIL == predicate || predicate.equal(assertions_high.gaf_predicate(assertion))) && simple_indexing.NIL != ((simple_indexing.NIL != argnum) ? Equality.equal(v_term, assertions_high.gaf_arg(assertion, argnum)) : el_utilities.term_is_one_of_argsP(v_term, assertions_high.gaf_formula(assertion))) && (simple_indexing.NIL == mt || simple_indexing.NIL != hlmt.hlmt_equal(mt, assertions_high.assertion_mt(assertion))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 1659L)
    public static SubLObject matches_gaf_arg_index(final SubLObject assertion, final SubLObject v_term, SubLObject argnum, SubLObject pred, SubLObject mt) {
        if (argnum == simple_indexing.UNPROVIDED) {
            argnum = (SubLObject)simple_indexing.NIL;
        }
        if (pred == simple_indexing.UNPROVIDED) {
            pred = (SubLObject)simple_indexing.NIL;
        }
        if (mt == simple_indexing.UNPROVIDED) {
            mt = (SubLObject)simple_indexing.NIL;
        }
        assert simple_indexing.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (simple_indexing.NIL == assertions_high.gaf_assertionP(assertion)) {
            return (SubLObject)simple_indexing.NIL;
        }
        return matches_gaf_arg_index_internal(assertion, v_term, argnum, pred, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 1904L)
    public static SubLObject simple_key_gaf_arg_index(final SubLObject assertion, SubLObject accumulator, final SubLObject v_term, SubLObject arg, SubLObject pred) {
        if (arg == simple_indexing.UNPROVIDED) {
            arg = (SubLObject)simple_indexing.NIL;
        }
        if (pred == simple_indexing.UNPROVIDED) {
            pred = (SubLObject)simple_indexing.NIL;
        }
        if (simple_indexing.NIL != assertions_high.gaf_assertionP(assertion) && simple_indexing.NIL != matches_gaf_arg_index_internal(assertion, v_term, arg, pred, (SubLObject)simple_indexing.NIL)) {
            accumulator = simple_key_gaf_arg_index_internal(assertion, accumulator, v_term, arg, pred);
        }
        return accumulator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 2225L)
    public static SubLObject matches_gaf_arg_index_internal(final SubLObject assertion, final SubLObject v_term, final SubLObject arg, final SubLObject pred, final SubLObject mt) {
        if (simple_indexing.NIL == arg) {
            return list_utilities.sublisp_boolean(Sequences.find(v_term, assertions_high.gaf_args(assertion), (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED));
        }
        if (!assertions_high.gaf_arg(assertion, arg).equal(v_term)) {
            return (SubLObject)simple_indexing.NIL;
        }
        if (simple_indexing.NIL == pred) {
            return (SubLObject)simple_indexing.T;
        }
        if (simple_indexing.NIL == kb_utilities.kbeq(assertions_high.gaf_predicate(assertion), pred)) {
            return (SubLObject)simple_indexing.NIL;
        }
        if (simple_indexing.NIL == mt) {
            return (SubLObject)simple_indexing.T;
        }
        return hlmt.hlmt_equal(assertions_high.assertion_mt(assertion), mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 2618L)
    public static SubLObject simple_key_gaf_arg_index_internal(final SubLObject assertion, SubLObject accumulator, final SubLObject v_term, final SubLObject arg, final SubLObject pred) {
        if (simple_indexing.NIL != arg) {
            if (simple_indexing.NIL != pred) {
                final SubLObject item_var = assertions_high.assertion_mt(assertion);
                if (simple_indexing.NIL == conses_high.member(item_var, accumulator, (SubLObject)simple_indexing.$sym1$HLMT_EQUAL, Symbols.symbol_function((SubLObject)simple_indexing.IDENTITY))) {
                    accumulator = (SubLObject)ConsesLow.cons(item_var, accumulator);
                }
            }
            else {
                final SubLObject item_var = assertions_high.gaf_predicate(assertion);
                if (simple_indexing.NIL == conses_high.member(item_var, accumulator, Symbols.symbol_function((SubLObject)simple_indexing.EQL), Symbols.symbol_function((SubLObject)simple_indexing.IDENTITY))) {
                    accumulator = (SubLObject)ConsesLow.cons(item_var, accumulator);
                }
            }
        }
        else {
            SubLObject formula;
            SubLObject last_position;
            SubLObject position;
            SubLObject item_var2;
            for (formula = assertions_high.gaf_formula(assertion), last_position = (SubLObject)simple_indexing.NIL, position = (SubLObject)simple_indexing.NIL, last_position = (SubLObject)simple_indexing.NIL, position = Sequences.position(v_term, formula, Symbols.symbol_function((SubLObject)simple_indexing.EQL), Symbols.symbol_function((SubLObject)simple_indexing.IDENTITY), (SubLObject)simple_indexing.ONE_INTEGER, (SubLObject)simple_indexing.UNPROVIDED); simple_indexing.NIL != position; position = Sequences.position(v_term, formula, Symbols.symbol_function((SubLObject)simple_indexing.EQL), Symbols.symbol_function((SubLObject)simple_indexing.IDENTITY), Numbers.add(last_position, (SubLObject)simple_indexing.ONE_INTEGER), (SubLObject)simple_indexing.UNPROVIDED)) {
                item_var2 = position;
                if (simple_indexing.NIL == conses_high.member(item_var2, accumulator, Symbols.symbol_function((SubLObject)simple_indexing.EQL), Symbols.symbol_function((SubLObject)simple_indexing.IDENTITY))) {
                    accumulator = (SubLObject)ConsesLow.cons(item_var2, accumulator);
                }
                last_position = position;
            }
        }
        return accumulator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 3154L)
    public static SubLObject matches_nart_arg_index(final SubLObject assertion, final SubLObject v_term, SubLObject argnum, SubLObject func) {
        if (argnum == simple_indexing.UNPROVIDED) {
            argnum = (SubLObject)simple_indexing.NIL;
        }
        if (func == simple_indexing.UNPROVIDED) {
            func = (SubLObject)simple_indexing.NIL;
        }
        assert simple_indexing.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (simple_indexing.NIL == assertions_high.gaf_assertionP(assertion)) {
            return (SubLObject)simple_indexing.NIL;
        }
        return matches_nart_arg_index_internal(assertion, v_term, argnum, func);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 3506L)
    public static SubLObject simple_key_nart_arg_index(final SubLObject assertion, SubLObject accumulator, final SubLObject v_term, SubLObject arg, SubLObject func) {
        if (arg == simple_indexing.UNPROVIDED) {
            arg = (SubLObject)simple_indexing.NIL;
        }
        if (func == simple_indexing.UNPROVIDED) {
            func = (SubLObject)simple_indexing.NIL;
        }
        if (simple_indexing.NIL != assertions_high.gaf_assertionP(assertion) && simple_indexing.NIL != matches_nart_arg_index_internal(assertion, v_term, arg, func)) {
            accumulator = simple_key_nart_arg_index_internal(assertion, accumulator, v_term, arg, func);
        }
        return accumulator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 3826L)
    public static SubLObject matches_nart_arg_index_internal(final SubLObject assertion, final SubLObject v_term, final SubLObject arg, final SubLObject func) {
        if (simple_indexing.NIL == kb_utilities.kbeq(assertions_high.gaf_predicate(assertion), simple_indexing.$const2$termOfUnit)) {
            return (SubLObject)simple_indexing.NIL;
        }
        final SubLObject nat = assertions_high.gaf_arg2(assertion);
        if (simple_indexing.NIL != func && simple_indexing.NIL == kb_utilities.kbeq(cycl_utilities.nat_function(nat), func)) {
            return (SubLObject)simple_indexing.NIL;
        }
        if (simple_indexing.NIL != arg) {
            if (!cycl_utilities.nat_arg(nat, arg, (SubLObject)simple_indexing.UNPROVIDED).equal(v_term)) {
                return (SubLObject)simple_indexing.NIL;
            }
        }
        else if (simple_indexing.NIL == Sequences.find(v_term, cycl_utilities.nat_args(nat, (SubLObject)simple_indexing.UNPROVIDED), (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED)) {
            return (SubLObject)simple_indexing.NIL;
        }
        return (SubLObject)simple_indexing.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 4243L)
    public static SubLObject simple_key_nart_arg_index_internal(final SubLObject assertion, SubLObject accumulator, final SubLObject v_term, final SubLObject arg, final SubLObject func) {
        final SubLObject nat = assertions_high.gaf_arg2(assertion);
        if (simple_indexing.NIL != arg) {
            if (simple_indexing.NIL != func) {
                final SubLObject item_var = assertions_high.assertion_mt(assertion);
                if (simple_indexing.NIL == conses_high.member(item_var, accumulator, (SubLObject)simple_indexing.$sym1$HLMT_EQUAL, Symbols.symbol_function((SubLObject)simple_indexing.IDENTITY))) {
                    accumulator = (SubLObject)ConsesLow.cons(item_var, accumulator);
                }
            }
            else {
                final SubLObject item_var = cycl_utilities.nat_function(nat);
                if (simple_indexing.NIL == conses_high.member(item_var, accumulator, Symbols.symbol_function((SubLObject)simple_indexing.EQL), Symbols.symbol_function((SubLObject)simple_indexing.IDENTITY))) {
                    accumulator = (SubLObject)ConsesLow.cons(item_var, accumulator);
                }
            }
        }
        else {
            SubLObject last_position;
            SubLObject position;
            SubLObject item_var2;
            for (last_position = (SubLObject)simple_indexing.NIL, position = (SubLObject)simple_indexing.NIL, last_position = (SubLObject)simple_indexing.NIL, position = Sequences.position(v_term, nat, Symbols.symbol_function((SubLObject)simple_indexing.EQL), Symbols.symbol_function((SubLObject)simple_indexing.IDENTITY), (SubLObject)simple_indexing.ONE_INTEGER, (SubLObject)simple_indexing.UNPROVIDED); simple_indexing.NIL != position; position = Sequences.position(v_term, nat, Symbols.symbol_function((SubLObject)simple_indexing.EQL), Symbols.symbol_function((SubLObject)simple_indexing.IDENTITY), Numbers.add(last_position, (SubLObject)simple_indexing.ONE_INTEGER), (SubLObject)simple_indexing.UNPROVIDED)) {
                item_var2 = position;
                if (simple_indexing.NIL == conses_high.member(item_var2, accumulator, Symbols.symbol_function((SubLObject)simple_indexing.EQL), Symbols.symbol_function((SubLObject)simple_indexing.IDENTITY))) {
                    accumulator = (SubLObject)ConsesLow.cons(item_var2, accumulator);
                }
                last_position = position;
            }
        }
        return accumulator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 4754L)
    public static SubLObject matches_predicate_extent_index(final SubLObject assertion, final SubLObject v_term, SubLObject mt) {
        if (mt == simple_indexing.UNPROVIDED) {
            mt = (SubLObject)simple_indexing.NIL;
        }
        assert simple_indexing.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (simple_indexing.NIL == assertions_high.gaf_assertionP(assertion)) {
            return (SubLObject)simple_indexing.NIL;
        }
        return matches_predicate_extent_index_internal(assertion, v_term, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 5082L)
    public static SubLObject simple_key_predicate_extent_index(final SubLObject assertion, SubLObject accumulator, final SubLObject v_term) {
        if (simple_indexing.NIL != matches_predicate_extent_index(assertion, v_term, (SubLObject)simple_indexing.UNPROVIDED)) {
            final SubLObject item_var = assertions_high.assertion_mt(assertion);
            if (simple_indexing.NIL == conses_high.member(item_var, accumulator, (SubLObject)simple_indexing.$sym1$HLMT_EQUAL, Symbols.symbol_function((SubLObject)simple_indexing.IDENTITY))) {
                accumulator = (SubLObject)ConsesLow.cons(item_var, accumulator);
            }
        }
        return accumulator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 5307L)
    public static SubLObject matches_predicate_extent_index_internal(final SubLObject assertion, final SubLObject v_term, final SubLObject mt) {
        if (simple_indexing.NIL == kb_utilities.kbeq(assertions_high.gaf_predicate(assertion), v_term)) {
            return (SubLObject)simple_indexing.NIL;
        }
        if (simple_indexing.NIL == mt) {
            return (SubLObject)simple_indexing.T;
        }
        return hlmt.hlmt_equal(assertions_high.assertion_mt(assertion), mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 5539L)
    public static SubLObject matches_function_extent_index(final SubLObject assertion, final SubLObject v_term) {
        assert simple_indexing.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (simple_indexing.NIL == assertions_high.gaf_assertionP(assertion)) {
            return (SubLObject)simple_indexing.NIL;
        }
        return matches_function_extent_index_internal(assertion, v_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 5865L)
    public static SubLObject matches_function_extent_index_internal(final SubLObject assertion, final SubLObject func) {
        if (simple_indexing.NIL == kb_utilities.kbeq(assertions_high.gaf_predicate(assertion), simple_indexing.$const2$termOfUnit)) {
            return (SubLObject)simple_indexing.NIL;
        }
        final SubLObject nat = assertions_high.gaf_arg2(assertion);
        if (simple_indexing.NIL == kb_utilities.kbeq(cycl_utilities.nat_function(nat), func)) {
            return (SubLObject)simple_indexing.NIL;
        }
        return (SubLObject)simple_indexing.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 6120L)
    public static SubLObject matches_predicate_rule_index(final SubLObject assertion, final SubLObject pred, SubLObject sense, SubLObject mt, SubLObject direction) {
        if (sense == simple_indexing.UNPROVIDED) {
            sense = (SubLObject)simple_indexing.NIL;
        }
        if (mt == simple_indexing.UNPROVIDED) {
            mt = (SubLObject)simple_indexing.NIL;
        }
        if (direction == simple_indexing.UNPROVIDED) {
            direction = (SubLObject)simple_indexing.NIL;
        }
        assert simple_indexing.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (simple_indexing.NIL == assertions_high.rule_assertionP(assertion)) {
            return (SubLObject)simple_indexing.NIL;
        }
        if (simple_indexing.NIL == sense) {
            SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
            SubLObject sense_$1 = (SubLObject)simple_indexing.NIL;
            sense_$1 = cdolist_list_var.first();
            while (simple_indexing.NIL != cdolist_list_var) {
                if (simple_indexing.NIL != matches_predicate_rule_index(assertion, pred, sense_$1, (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED)) {
                    return (SubLObject)simple_indexing.T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                sense_$1 = cdolist_list_var.first();
            }
        }
        if (simple_indexing.NIL != mt) {
            if (simple_indexing.NIL == hlmt.hlmt_equal(assertions_high.assertion_mt(assertion), mt)) {
                return (SubLObject)simple_indexing.NIL;
            }
            if (simple_indexing.NIL != direction && !assertions_high.assertion_direction(assertion).eql(direction)) {
                return (SubLObject)simple_indexing.NIL;
            }
        }
        final SubLObject cnf = assertions_high.assertion_cnf(assertion);
        final SubLObject literals = (sense == simple_indexing.$kw3$POS) ? clauses.pos_lits(cnf) : clauses.neg_lits(cnf);
        return list_utilities.sublisp_boolean(Sequences.find(pred, literals, Symbols.symbol_function((SubLObject)simple_indexing.$sym4$MATCHES_PREDICATE_RULE_INDEX_TEST), (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 6920L)
    public static SubLObject simple_key_predicate_rule_index(final SubLObject assertion, SubLObject accumulator, final SubLObject pred, SubLObject sense, SubLObject mt) {
        if (sense == simple_indexing.UNPROVIDED) {
            sense = (SubLObject)simple_indexing.NIL;
        }
        if (mt == simple_indexing.UNPROVIDED) {
            mt = (SubLObject)simple_indexing.NIL;
        }
        assert simple_indexing.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (simple_indexing.NIL != matches_predicate_rule_index(assertion, pred, sense, mt, (SubLObject)simple_indexing.UNPROVIDED)) {
            if (simple_indexing.NIL != sense) {
                if (simple_indexing.NIL != mt) {
                    final SubLObject item_var = assertions_high.assertion_direction(assertion);
                    if (simple_indexing.NIL == conses_high.member(item_var, accumulator, Symbols.symbol_function((SubLObject)simple_indexing.EQL), Symbols.symbol_function((SubLObject)simple_indexing.IDENTITY))) {
                        accumulator = (SubLObject)ConsesLow.cons(item_var, accumulator);
                    }
                }
                else {
                    final SubLObject item_var = assertions_high.assertion_mt(assertion);
                    if (simple_indexing.NIL == conses_high.member(item_var, accumulator, (SubLObject)simple_indexing.$sym1$HLMT_EQUAL, Symbols.symbol_function((SubLObject)simple_indexing.IDENTITY))) {
                        accumulator = (SubLObject)ConsesLow.cons(item_var, accumulator);
                    }
                }
            }
            else {
                SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
                SubLObject sense_$2 = (SubLObject)simple_indexing.NIL;
                sense_$2 = cdolist_list_var.first();
                while (simple_indexing.NIL != cdolist_list_var) {
                    if (simple_indexing.NIL != matches_predicate_rule_index(assertion, pred, sense_$2, (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED)) {
                        final SubLObject item_var2 = sense_$2;
                        if (simple_indexing.NIL == conses_high.member(item_var2, accumulator, Symbols.symbol_function((SubLObject)simple_indexing.EQL), Symbols.symbol_function((SubLObject)simple_indexing.IDENTITY))) {
                            accumulator = (SubLObject)ConsesLow.cons(item_var2, accumulator);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    sense_$2 = cdolist_list_var.first();
                }
            }
        }
        return accumulator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 7432L)
    public static SubLObject matches_predicate_rule_index_test(final SubLObject pred, final SubLObject literal) {
        final SubLObject predicate = el_utilities.literal_predicate(literal, (SubLObject)simple_indexing.UNPROVIDED);
        if (simple_indexing.NIL == forts.fort_p(predicate)) {
            return (SubLObject)simple_indexing.NIL;
        }
        return kb_utilities.kbeq(pred, predicate);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 7665L)
    public static SubLObject matches_ist_predicate_rule_index(final SubLObject assertion, final SubLObject pred, SubLObject sense, SubLObject mt, SubLObject direction) {
        if (sense == simple_indexing.UNPROVIDED) {
            sense = (SubLObject)simple_indexing.NIL;
        }
        if (mt == simple_indexing.UNPROVIDED) {
            mt = (SubLObject)simple_indexing.NIL;
        }
        if (direction == simple_indexing.UNPROVIDED) {
            direction = (SubLObject)simple_indexing.NIL;
        }
        assert simple_indexing.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (simple_indexing.NIL == assertions_high.rule_assertionP(assertion)) {
            return (SubLObject)simple_indexing.NIL;
        }
        if (simple_indexing.NIL == sense) {
            SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
            SubLObject sense_$3 = (SubLObject)simple_indexing.NIL;
            sense_$3 = cdolist_list_var.first();
            while (simple_indexing.NIL != cdolist_list_var) {
                if (simple_indexing.NIL != matches_ist_predicate_rule_index(assertion, pred, sense_$3, (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED)) {
                    return (SubLObject)simple_indexing.T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                sense_$3 = cdolist_list_var.first();
            }
        }
        if (simple_indexing.NIL != mt) {
            if (simple_indexing.NIL == hlmt.hlmt_equal(assertions_high.assertion_mt(assertion), mt)) {
                return (SubLObject)simple_indexing.NIL;
            }
            if (simple_indexing.NIL != direction && !assertions_high.assertion_direction(assertion).eql(direction)) {
                return (SubLObject)simple_indexing.NIL;
            }
        }
        final SubLObject cnf = assertions_high.assertion_cnf(assertion);
        final SubLObject literals = (sense == simple_indexing.$kw3$POS) ? clauses.pos_lits(cnf) : clauses.neg_lits(cnf);
        return list_utilities.sublisp_boolean(Sequences.find(pred, literals, Symbols.symbol_function((SubLObject)simple_indexing.$sym5$MATCHES_IST_PREDICATE_RULE_INDEX_TEST), (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 8498L)
    public static SubLObject simple_key_ist_predicate_rule_index(final SubLObject assertion, SubLObject accumulator, final SubLObject pred, SubLObject sense, SubLObject mt) {
        if (sense == simple_indexing.UNPROVIDED) {
            sense = (SubLObject)simple_indexing.NIL;
        }
        if (mt == simple_indexing.UNPROVIDED) {
            mt = (SubLObject)simple_indexing.NIL;
        }
        assert simple_indexing.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (simple_indexing.NIL != matches_ist_predicate_rule_index(assertion, pred, sense, mt, (SubLObject)simple_indexing.UNPROVIDED)) {
            if (simple_indexing.NIL != sense) {
                if (simple_indexing.NIL != mt) {
                    final SubLObject item_var = assertions_high.assertion_direction(assertion);
                    if (simple_indexing.NIL == conses_high.member(item_var, accumulator, Symbols.symbol_function((SubLObject)simple_indexing.EQL), Symbols.symbol_function((SubLObject)simple_indexing.IDENTITY))) {
                        accumulator = (SubLObject)ConsesLow.cons(item_var, accumulator);
                    }
                }
                else {
                    final SubLObject item_var = assertions_high.assertion_mt(assertion);
                    if (simple_indexing.NIL == conses_high.member(item_var, accumulator, (SubLObject)simple_indexing.$sym1$HLMT_EQUAL, Symbols.symbol_function((SubLObject)simple_indexing.IDENTITY))) {
                        accumulator = (SubLObject)ConsesLow.cons(item_var, accumulator);
                    }
                }
            }
            else {
                SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
                SubLObject sense_$4 = (SubLObject)simple_indexing.NIL;
                sense_$4 = cdolist_list_var.first();
                while (simple_indexing.NIL != cdolist_list_var) {
                    if (simple_indexing.NIL != matches_ist_predicate_rule_index(assertion, pred, sense_$4, (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED)) {
                        final SubLObject item_var2 = sense_$4;
                        if (simple_indexing.NIL == conses_high.member(item_var2, accumulator, Symbols.symbol_function((SubLObject)simple_indexing.EQL), Symbols.symbol_function((SubLObject)simple_indexing.IDENTITY))) {
                            accumulator = (SubLObject)ConsesLow.cons(item_var2, accumulator);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    sense_$4 = cdolist_list_var.first();
                }
            }
        }
        return accumulator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 9022L)
    public static SubLObject matches_ist_predicate_rule_index_test(final SubLObject pred, final SubLObject literal) {
        return (SubLObject)SubLObjectFactory.makeBoolean(simple_indexing.NIL != el_utilities.ist_predicateP(el_utilities.literal_predicate(literal, (SubLObject)simple_indexing.UNPROVIDED), kb_indexing.spec_preds_of_ist_indexing_enabledP()) && simple_indexing.NIL != kb_utilities.kbeq(pred, el_utilities.literal_predicate(el_utilities.literal_arg2(literal, (SubLObject)simple_indexing.UNPROVIDED), (SubLObject)simple_indexing.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 9266L)
    public static SubLObject matches_decontextualized_ist_predicate_rule_index(final SubLObject assertion, final SubLObject pred, SubLObject sense, SubLObject direction) {
        if (sense == simple_indexing.UNPROVIDED) {
            sense = (SubLObject)simple_indexing.NIL;
        }
        if (direction == simple_indexing.UNPROVIDED) {
            direction = (SubLObject)simple_indexing.NIL;
        }
        assert simple_indexing.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (simple_indexing.NIL == assertions_high.rule_assertionP(assertion)) {
            return (SubLObject)simple_indexing.NIL;
        }
        if (simple_indexing.NIL == sense) {
            SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
            SubLObject sense_$5 = (SubLObject)simple_indexing.NIL;
            sense_$5 = cdolist_list_var.first();
            while (simple_indexing.NIL != cdolist_list_var) {
                if (simple_indexing.NIL != matches_decontextualized_ist_predicate_rule_index(assertion, pred, sense_$5, (SubLObject)simple_indexing.UNPROVIDED)) {
                    return (SubLObject)simple_indexing.T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                sense_$5 = cdolist_list_var.first();
            }
        }
        if (simple_indexing.NIL != direction && !assertions_high.assertion_direction(assertion).eql(direction)) {
            return (SubLObject)simple_indexing.NIL;
        }
        final SubLObject cnf = assertions_high.assertion_cnf(assertion);
        final SubLObject literals = (sense == simple_indexing.$kw3$POS) ? clauses.pos_lits(cnf) : clauses.neg_lits(cnf);
        return list_utilities.sublisp_boolean(Sequences.find(pred, literals, Symbols.symbol_function((SubLObject)simple_indexing.$sym6$MATCHES_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX_TEST), (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 10103L)
    public static SubLObject simple_key_decontextualized_ist_predicate_rule_index(final SubLObject assertion, SubLObject accumulator, final SubLObject pred, SubLObject sense) {
        if (sense == simple_indexing.UNPROVIDED) {
            sense = (SubLObject)simple_indexing.NIL;
        }
        assert simple_indexing.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (simple_indexing.NIL != matches_decontextualized_ist_predicate_rule_index(assertion, pred, sense, (SubLObject)simple_indexing.UNPROVIDED)) {
            if (simple_indexing.NIL != sense) {
                final SubLObject item_var = assertions_high.assertion_direction(assertion);
                if (simple_indexing.NIL == conses_high.member(item_var, accumulator, Symbols.symbol_function((SubLObject)simple_indexing.EQL), Symbols.symbol_function((SubLObject)simple_indexing.IDENTITY))) {
                    accumulator = (SubLObject)ConsesLow.cons(item_var, accumulator);
                }
            }
            else {
                SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
                SubLObject sense_$6 = (SubLObject)simple_indexing.NIL;
                sense_$6 = cdolist_list_var.first();
                while (simple_indexing.NIL != cdolist_list_var) {
                    if (simple_indexing.NIL != matches_decontextualized_ist_predicate_rule_index(assertion, pred, sense_$6, (SubLObject)simple_indexing.UNPROVIDED)) {
                        final SubLObject item_var2 = sense_$6;
                        if (simple_indexing.NIL == conses_high.member(item_var2, accumulator, Symbols.symbol_function((SubLObject)simple_indexing.EQL), Symbols.symbol_function((SubLObject)simple_indexing.IDENTITY))) {
                            accumulator = (SubLObject)ConsesLow.cons(item_var2, accumulator);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    sense_$6 = cdolist_list_var.first();
                }
            }
        }
        return accumulator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 10589L)
    public static SubLObject matches_decontextualized_ist_predicate_rule_index_test(final SubLObject pred, final SubLObject literal) {
        return (SubLObject)SubLObjectFactory.makeBoolean(simple_indexing.NIL != el_utilities.ist_predicateP(el_utilities.literal_predicate(literal, (SubLObject)simple_indexing.UNPROVIDED), kb_indexing.spec_preds_of_ist_indexing_enabledP()) && simple_indexing.NIL != kb_utilities.kbeq(pred, el_utilities.literal_predicate(el_utilities.literal_arg2(literal, (SubLObject)simple_indexing.UNPROVIDED), (SubLObject)simple_indexing.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 10850L)
    public static SubLObject matches_isa_rule_index(final SubLObject assertion, final SubLObject col, SubLObject sense, SubLObject mt, SubLObject direction) {
        if (sense == simple_indexing.UNPROVIDED) {
            sense = (SubLObject)simple_indexing.NIL;
        }
        if (mt == simple_indexing.UNPROVIDED) {
            mt = (SubLObject)simple_indexing.NIL;
        }
        if (direction == simple_indexing.UNPROVIDED) {
            direction = (SubLObject)simple_indexing.NIL;
        }
        assert simple_indexing.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (simple_indexing.NIL == assertions_high.rule_assertionP(assertion)) {
            return (SubLObject)simple_indexing.NIL;
        }
        if (simple_indexing.NIL == sense) {
            SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
            SubLObject sense_$7 = (SubLObject)simple_indexing.NIL;
            sense_$7 = cdolist_list_var.first();
            while (simple_indexing.NIL != cdolist_list_var) {
                if (simple_indexing.NIL != matches_isa_rule_index(assertion, col, sense_$7, (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED)) {
                    return (SubLObject)simple_indexing.T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                sense_$7 = cdolist_list_var.first();
            }
        }
        if (simple_indexing.NIL != mt) {
            if (simple_indexing.NIL == hlmt.hlmt_equal(assertions_high.assertion_mt(assertion), mt)) {
                return (SubLObject)simple_indexing.NIL;
            }
            if (simple_indexing.NIL != direction && !assertions_high.assertion_direction(assertion).eql(direction)) {
                return (SubLObject)simple_indexing.NIL;
            }
        }
        final SubLObject cnf = assertions_high.assertion_cnf(assertion);
        final SubLObject literals = (sense == simple_indexing.$kw3$POS) ? clauses.pos_lits(cnf) : clauses.neg_lits(cnf);
        return list_utilities.sublisp_boolean(Sequences.find(col, literals, Symbols.symbol_function((SubLObject)simple_indexing.$sym7$MATCHES_ISA_RULE_INDEX_TEST), (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 11623L)
    public static SubLObject simple_key_isa_rule_index(final SubLObject assertion, SubLObject accumulator, final SubLObject col, SubLObject sense, SubLObject mt) {
        if (sense == simple_indexing.UNPROVIDED) {
            sense = (SubLObject)simple_indexing.NIL;
        }
        if (mt == simple_indexing.UNPROVIDED) {
            mt = (SubLObject)simple_indexing.NIL;
        }
        assert simple_indexing.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (simple_indexing.NIL != matches_isa_rule_index(assertion, col, sense, mt, (SubLObject)simple_indexing.UNPROVIDED)) {
            if (simple_indexing.NIL != sense) {
                if (simple_indexing.NIL != mt) {
                    final SubLObject item_var = assertions_high.assertion_direction(assertion);
                    if (simple_indexing.NIL == conses_high.member(item_var, accumulator, Symbols.symbol_function((SubLObject)simple_indexing.EQL), Symbols.symbol_function((SubLObject)simple_indexing.IDENTITY))) {
                        accumulator = (SubLObject)ConsesLow.cons(item_var, accumulator);
                    }
                }
                else {
                    final SubLObject item_var = assertions_high.assertion_mt(assertion);
                    if (simple_indexing.NIL == conses_high.member(item_var, accumulator, (SubLObject)simple_indexing.$sym1$HLMT_EQUAL, Symbols.symbol_function((SubLObject)simple_indexing.IDENTITY))) {
                        accumulator = (SubLObject)ConsesLow.cons(item_var, accumulator);
                    }
                }
            }
            else {
                SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
                SubLObject sense_$8 = (SubLObject)simple_indexing.NIL;
                sense_$8 = cdolist_list_var.first();
                while (simple_indexing.NIL != cdolist_list_var) {
                    if (simple_indexing.NIL != matches_isa_rule_index(assertion, col, sense_$8, (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED)) {
                        final SubLObject item_var2 = sense_$8;
                        if (simple_indexing.NIL == conses_high.member(item_var2, accumulator, Symbols.symbol_function((SubLObject)simple_indexing.EQL), Symbols.symbol_function((SubLObject)simple_indexing.IDENTITY))) {
                            accumulator = (SubLObject)ConsesLow.cons(item_var2, accumulator);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    sense_$8 = cdolist_list_var.first();
                }
            }
        }
        return accumulator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 12114L)
    public static SubLObject matches_isa_rule_index_test(final SubLObject col, final SubLObject literal) {
        final SubLObject predicate = el_utilities.literal_predicate(literal, (SubLObject)simple_indexing.UNPROVIDED);
        if (simple_indexing.NIL != kb_utilities.kbeq(simple_indexing.$const8$isa, predicate)) {
            final SubLObject collection = el_utilities.literal_arg2(literal, (SubLObject)simple_indexing.UNPROVIDED);
            if (simple_indexing.NIL != forts.fort_p(collection)) {
                return kb_utilities.kbeq(col, collection);
            }
        }
        return (SubLObject)simple_indexing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 12383L)
    public static SubLObject matches_quoted_isa_rule_index(final SubLObject assertion, final SubLObject col, SubLObject sense, SubLObject mt, SubLObject direction) {
        if (sense == simple_indexing.UNPROVIDED) {
            sense = (SubLObject)simple_indexing.NIL;
        }
        if (mt == simple_indexing.UNPROVIDED) {
            mt = (SubLObject)simple_indexing.NIL;
        }
        if (direction == simple_indexing.UNPROVIDED) {
            direction = (SubLObject)simple_indexing.NIL;
        }
        assert simple_indexing.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (simple_indexing.NIL == assertions_high.rule_assertionP(assertion)) {
            return (SubLObject)simple_indexing.NIL;
        }
        if (simple_indexing.NIL == sense) {
            SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
            SubLObject sense_$9 = (SubLObject)simple_indexing.NIL;
            sense_$9 = cdolist_list_var.first();
            while (simple_indexing.NIL != cdolist_list_var) {
                if (simple_indexing.NIL != matches_quoted_isa_rule_index(assertion, col, sense_$9, (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED)) {
                    return (SubLObject)simple_indexing.T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                sense_$9 = cdolist_list_var.first();
            }
        }
        if (simple_indexing.NIL != mt) {
            if (simple_indexing.NIL == hlmt.hlmt_equal(assertions_high.assertion_mt(assertion), mt)) {
                return (SubLObject)simple_indexing.NIL;
            }
            if (simple_indexing.NIL != direction && !assertions_high.assertion_direction(assertion).eql(direction)) {
                return (SubLObject)simple_indexing.NIL;
            }
        }
        final SubLObject cnf = assertions_high.assertion_cnf(assertion);
        final SubLObject literals = (sense == simple_indexing.$kw3$POS) ? clauses.pos_lits(cnf) : clauses.neg_lits(cnf);
        return list_utilities.sublisp_boolean(Sequences.find(col, literals, Symbols.symbol_function((SubLObject)simple_indexing.$sym9$MATCHES_QUOTED_ISA_RULE_INDEX_TEST), (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 13200L)
    public static SubLObject simple_key_quoted_isa_rule_index(final SubLObject assertion, SubLObject accumulator, final SubLObject col, SubLObject sense, SubLObject mt) {
        if (sense == simple_indexing.UNPROVIDED) {
            sense = (SubLObject)simple_indexing.NIL;
        }
        if (mt == simple_indexing.UNPROVIDED) {
            mt = (SubLObject)simple_indexing.NIL;
        }
        assert simple_indexing.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (simple_indexing.NIL != matches_quoted_isa_rule_index(assertion, col, sense, mt, (SubLObject)simple_indexing.UNPROVIDED)) {
            if (simple_indexing.NIL != sense) {
                if (simple_indexing.NIL != mt) {
                    final SubLObject item_var = assertions_high.assertion_direction(assertion);
                    if (simple_indexing.NIL == conses_high.member(item_var, accumulator, Symbols.symbol_function((SubLObject)simple_indexing.EQL), Symbols.symbol_function((SubLObject)simple_indexing.IDENTITY))) {
                        accumulator = (SubLObject)ConsesLow.cons(item_var, accumulator);
                    }
                }
                else {
                    final SubLObject item_var = assertions_high.assertion_mt(assertion);
                    if (simple_indexing.NIL == conses_high.member(item_var, accumulator, (SubLObject)simple_indexing.$sym1$HLMT_EQUAL, Symbols.symbol_function((SubLObject)simple_indexing.IDENTITY))) {
                        accumulator = (SubLObject)ConsesLow.cons(item_var, accumulator);
                    }
                }
            }
            else {
                SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
                SubLObject sense_$10 = (SubLObject)simple_indexing.NIL;
                sense_$10 = cdolist_list_var.first();
                while (simple_indexing.NIL != cdolist_list_var) {
                    if (simple_indexing.NIL != matches_quoted_isa_rule_index(assertion, col, sense_$10, (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED)) {
                        final SubLObject item_var2 = sense_$10;
                        if (simple_indexing.NIL == conses_high.member(item_var2, accumulator, Symbols.symbol_function((SubLObject)simple_indexing.EQL), Symbols.symbol_function((SubLObject)simple_indexing.IDENTITY))) {
                            accumulator = (SubLObject)ConsesLow.cons(item_var2, accumulator);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    sense_$10 = cdolist_list_var.first();
                }
            }
        }
        return accumulator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 13712L)
    public static SubLObject matches_quoted_isa_rule_index_test(final SubLObject col, final SubLObject literal) {
        final SubLObject predicate = el_utilities.literal_predicate(literal, (SubLObject)simple_indexing.UNPROVIDED);
        if (simple_indexing.NIL != kb_utilities.kbeq(simple_indexing.$const10$quotedIsa, predicate)) {
            final SubLObject collection = el_utilities.literal_arg2(literal, (SubLObject)simple_indexing.UNPROVIDED);
            if (simple_indexing.NIL != forts.fort_p(collection)) {
                return kb_utilities.kbeq(col, collection);
            }
        }
        return (SubLObject)simple_indexing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 13994L)
    public static SubLObject matches_genls_rule_index(final SubLObject assertion, final SubLObject col, SubLObject sense, SubLObject mt, SubLObject direction) {
        if (sense == simple_indexing.UNPROVIDED) {
            sense = (SubLObject)simple_indexing.NIL;
        }
        if (mt == simple_indexing.UNPROVIDED) {
            mt = (SubLObject)simple_indexing.NIL;
        }
        if (direction == simple_indexing.UNPROVIDED) {
            direction = (SubLObject)simple_indexing.NIL;
        }
        assert simple_indexing.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (simple_indexing.NIL == assertions_high.rule_assertionP(assertion)) {
            return (SubLObject)simple_indexing.NIL;
        }
        if (simple_indexing.NIL == sense) {
            SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
            SubLObject sense_$11 = (SubLObject)simple_indexing.NIL;
            sense_$11 = cdolist_list_var.first();
            while (simple_indexing.NIL != cdolist_list_var) {
                if (simple_indexing.NIL != matches_genls_rule_index(assertion, col, sense_$11, (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED)) {
                    return (SubLObject)simple_indexing.T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                sense_$11 = cdolist_list_var.first();
            }
        }
        if (simple_indexing.NIL != mt) {
            if (simple_indexing.NIL == hlmt.hlmt_equal(assertions_high.assertion_mt(assertion), mt)) {
                return (SubLObject)simple_indexing.NIL;
            }
            if (simple_indexing.NIL != direction && !assertions_high.assertion_direction(assertion).eql(direction)) {
                return (SubLObject)simple_indexing.NIL;
            }
        }
        final SubLObject cnf = assertions_high.assertion_cnf(assertion);
        final SubLObject literals = (sense == simple_indexing.$kw3$POS) ? clauses.pos_lits(cnf) : clauses.neg_lits(cnf);
        return list_utilities.sublisp_boolean(Sequences.find(col, literals, Symbols.symbol_function((SubLObject)simple_indexing.$sym11$MATCHES_GENLS_RULE_INDEX_TEST), (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 14777L)
    public static SubLObject simple_key_genls_rule_index(final SubLObject assertion, SubLObject accumulator, final SubLObject col, SubLObject sense, SubLObject mt) {
        if (sense == simple_indexing.UNPROVIDED) {
            sense = (SubLObject)simple_indexing.NIL;
        }
        if (mt == simple_indexing.UNPROVIDED) {
            mt = (SubLObject)simple_indexing.NIL;
        }
        assert simple_indexing.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (simple_indexing.NIL != matches_genls_rule_index(assertion, col, sense, mt, (SubLObject)simple_indexing.UNPROVIDED)) {
            if (simple_indexing.NIL != sense) {
                if (simple_indexing.NIL != mt) {
                    final SubLObject item_var = assertions_high.assertion_direction(assertion);
                    if (simple_indexing.NIL == conses_high.member(item_var, accumulator, Symbols.symbol_function((SubLObject)simple_indexing.EQL), Symbols.symbol_function((SubLObject)simple_indexing.IDENTITY))) {
                        accumulator = (SubLObject)ConsesLow.cons(item_var, accumulator);
                    }
                }
                else {
                    final SubLObject item_var = assertions_high.assertion_mt(assertion);
                    if (simple_indexing.NIL == conses_high.member(item_var, accumulator, (SubLObject)simple_indexing.$sym1$HLMT_EQUAL, Symbols.symbol_function((SubLObject)simple_indexing.IDENTITY))) {
                        accumulator = (SubLObject)ConsesLow.cons(item_var, accumulator);
                    }
                }
            }
            else {
                SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
                SubLObject sense_$12 = (SubLObject)simple_indexing.NIL;
                sense_$12 = cdolist_list_var.first();
                while (simple_indexing.NIL != cdolist_list_var) {
                    if (simple_indexing.NIL != matches_genls_rule_index(assertion, col, sense_$12, (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED)) {
                        final SubLObject item_var2 = sense_$12;
                        if (simple_indexing.NIL == conses_high.member(item_var2, accumulator, Symbols.symbol_function((SubLObject)simple_indexing.EQL), Symbols.symbol_function((SubLObject)simple_indexing.IDENTITY))) {
                            accumulator = (SubLObject)ConsesLow.cons(item_var2, accumulator);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    sense_$12 = cdolist_list_var.first();
                }
            }
        }
        return accumulator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 15274L)
    public static SubLObject matches_genls_rule_index_test(final SubLObject col, final SubLObject literal) {
        final SubLObject predicate = el_utilities.literal_predicate(literal, (SubLObject)simple_indexing.UNPROVIDED);
        if (simple_indexing.NIL != kb_utilities.kbeq(simple_indexing.$const12$genls, predicate)) {
            final SubLObject collection = el_utilities.literal_arg2(literal, (SubLObject)simple_indexing.UNPROVIDED);
            if (simple_indexing.NIL != forts.fort_p(collection)) {
                return kb_utilities.kbeq(col, collection);
            }
        }
        return (SubLObject)simple_indexing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 15547L)
    public static SubLObject matches_genl_mt_rule_index(final SubLObject assertion, final SubLObject genl_mt, SubLObject sense, SubLObject mt, SubLObject direction) {
        if (sense == simple_indexing.UNPROVIDED) {
            sense = (SubLObject)simple_indexing.NIL;
        }
        if (mt == simple_indexing.UNPROVIDED) {
            mt = (SubLObject)simple_indexing.NIL;
        }
        if (direction == simple_indexing.UNPROVIDED) {
            direction = (SubLObject)simple_indexing.NIL;
        }
        assert simple_indexing.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (simple_indexing.NIL == assertions_high.rule_assertionP(assertion)) {
            return (SubLObject)simple_indexing.NIL;
        }
        if (simple_indexing.NIL == sense) {
            SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
            SubLObject sense_$13 = (SubLObject)simple_indexing.NIL;
            sense_$13 = cdolist_list_var.first();
            while (simple_indexing.NIL != cdolist_list_var) {
                if (simple_indexing.NIL != matches_genl_mt_rule_index(assertion, genl_mt, sense_$13, (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED)) {
                    return (SubLObject)simple_indexing.T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                sense_$13 = cdolist_list_var.first();
            }
        }
        if (simple_indexing.NIL != mt) {
            if (simple_indexing.NIL == hlmt.hlmt_equal(assertions_high.assertion_mt(assertion), mt)) {
                return (SubLObject)simple_indexing.NIL;
            }
            if (simple_indexing.NIL != direction && !assertions_high.assertion_direction(assertion).eql(direction)) {
                return (SubLObject)simple_indexing.NIL;
            }
        }
        final SubLObject cnf = assertions_high.assertion_cnf(assertion);
        final SubLObject literals = (sense == simple_indexing.$kw3$POS) ? clauses.pos_lits(cnf) : clauses.neg_lits(cnf);
        return list_utilities.sublisp_boolean(Sequences.find(genl_mt, literals, Symbols.symbol_function((SubLObject)simple_indexing.$sym13$MATCHES_GENL_MT_RULE_INDEX_TEST), (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 16360L)
    public static SubLObject simple_key_genl_mt_rule_index(final SubLObject assertion, SubLObject accumulator, final SubLObject genl_mt, SubLObject sense, SubLObject mt) {
        if (sense == simple_indexing.UNPROVIDED) {
            sense = (SubLObject)simple_indexing.NIL;
        }
        if (mt == simple_indexing.UNPROVIDED) {
            mt = (SubLObject)simple_indexing.NIL;
        }
        assert simple_indexing.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (simple_indexing.NIL != matches_genl_mt_rule_index(assertion, genl_mt, sense, mt, (SubLObject)simple_indexing.UNPROVIDED)) {
            if (simple_indexing.NIL != sense) {
                if (simple_indexing.NIL != mt) {
                    final SubLObject item_var = assertions_high.assertion_direction(assertion);
                    if (simple_indexing.NIL == conses_high.member(item_var, accumulator, Symbols.symbol_function((SubLObject)simple_indexing.EQL), Symbols.symbol_function((SubLObject)simple_indexing.IDENTITY))) {
                        accumulator = (SubLObject)ConsesLow.cons(item_var, accumulator);
                    }
                }
                else {
                    final SubLObject item_var = assertions_high.assertion_mt(assertion);
                    if (simple_indexing.NIL == conses_high.member(item_var, accumulator, (SubLObject)simple_indexing.$sym1$HLMT_EQUAL, Symbols.symbol_function((SubLObject)simple_indexing.IDENTITY))) {
                        accumulator = (SubLObject)ConsesLow.cons(item_var, accumulator);
                    }
                }
            }
            else {
                SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
                SubLObject sense_$14 = (SubLObject)simple_indexing.NIL;
                sense_$14 = cdolist_list_var.first();
                while (simple_indexing.NIL != cdolist_list_var) {
                    if (simple_indexing.NIL != matches_genl_mt_rule_index(assertion, genl_mt, sense_$14, (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED)) {
                        final SubLObject item_var2 = sense_$14;
                        if (simple_indexing.NIL == conses_high.member(item_var2, accumulator, Symbols.symbol_function((SubLObject)simple_indexing.EQL), Symbols.symbol_function((SubLObject)simple_indexing.IDENTITY))) {
                            accumulator = (SubLObject)ConsesLow.cons(item_var2, accumulator);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    sense_$14 = cdolist_list_var.first();
                }
            }
        }
        return accumulator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 16875L)
    public static SubLObject matches_genl_mt_rule_index_test(final SubLObject mt, final SubLObject literal) {
        final SubLObject predicate = el_utilities.literal_predicate(literal, (SubLObject)simple_indexing.UNPROVIDED);
        if (simple_indexing.NIL != kb_utilities.kbeq(simple_indexing.$const14$genlMt, predicate)) {
            final SubLObject genl_mt = el_utilities.literal_arg2(literal, (SubLObject)simple_indexing.UNPROVIDED);
            if (simple_indexing.NIL != hlmt.hlmt_p(genl_mt)) {
                return hlmt.hlmt_equal(mt, genl_mt);
            }
        }
        return (SubLObject)simple_indexing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 17146L)
    public static SubLObject matches_function_rule_index(final SubLObject assertion, final SubLObject func, SubLObject mt, SubLObject direction) {
        if (mt == simple_indexing.UNPROVIDED) {
            mt = (SubLObject)simple_indexing.NIL;
        }
        if (direction == simple_indexing.UNPROVIDED) {
            direction = (SubLObject)simple_indexing.NIL;
        }
        assert simple_indexing.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (simple_indexing.NIL == assertions_high.rule_assertionP(assertion)) {
            return (SubLObject)simple_indexing.NIL;
        }
        if (simple_indexing.NIL != mt) {
            if (simple_indexing.NIL == hlmt.hlmt_equal(assertions_high.assertion_mt(assertion), mt)) {
                return (SubLObject)simple_indexing.NIL;
            }
            if (simple_indexing.NIL != direction && !assertions_high.assertion_direction(assertion).eql(direction)) {
                return (SubLObject)simple_indexing.NIL;
            }
        }
        final SubLObject cnf = assertions_high.assertion_cnf(assertion);
        final SubLObject literals = clauses.neg_lits(cnf);
        return list_utilities.sublisp_boolean(Sequences.find(func, literals, Symbols.symbol_function((SubLObject)simple_indexing.$sym15$MATCHES_FUNCTION_RULE_INDEX_TEST), (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 17823L)
    public static SubLObject simple_key_function_rule_index(final SubLObject assertion, SubLObject accumulator, final SubLObject func, SubLObject mt) {
        if (mt == simple_indexing.UNPROVIDED) {
            mt = (SubLObject)simple_indexing.NIL;
        }
        assert simple_indexing.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (simple_indexing.NIL != matches_function_rule_index(assertion, func, mt, (SubLObject)simple_indexing.UNPROVIDED)) {
            if (simple_indexing.NIL != mt) {
                final SubLObject item_var = assertions_high.assertion_direction(assertion);
                if (simple_indexing.NIL == conses_high.member(item_var, accumulator, Symbols.symbol_function((SubLObject)simple_indexing.EQL), Symbols.symbol_function((SubLObject)simple_indexing.IDENTITY))) {
                    accumulator = (SubLObject)ConsesLow.cons(item_var, accumulator);
                }
            }
            else {
                final SubLObject item_var = assertions_high.assertion_mt(assertion);
                if (simple_indexing.NIL == conses_high.member(item_var, accumulator, (SubLObject)simple_indexing.$sym1$HLMT_EQUAL, Symbols.symbol_function((SubLObject)simple_indexing.IDENTITY))) {
                    accumulator = (SubLObject)ConsesLow.cons(item_var, accumulator);
                }
            }
        }
        return accumulator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 18163L)
    public static SubLObject matches_function_rule_index_test(final SubLObject func, final SubLObject literal) {
        final SubLObject predicate = el_utilities.literal_predicate(literal, (SubLObject)simple_indexing.UNPROVIDED);
        if (simple_indexing.NIL != kb_utilities.kbeq(simple_indexing.$const2$termOfUnit, predicate) && simple_indexing.NIL != variables.variable_p(el_utilities.literal_arg1(literal, (SubLObject)simple_indexing.UNPROVIDED))) {
            final SubLObject nat = el_utilities.literal_arg2(literal, (SubLObject)simple_indexing.UNPROVIDED);
            if (nat.isCons()) {
                final SubLObject function = cycl_utilities.nat_function(nat);
                if (simple_indexing.NIL != forts.fort_p(function)) {
                    return kb_utilities.kbeq(func, function);
                }
            }
        }
        return (SubLObject)simple_indexing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 18566L)
    public static SubLObject matches_exception_rule_index(final SubLObject assertion, final SubLObject rule, SubLObject mt, SubLObject direction) {
        if (mt == simple_indexing.UNPROVIDED) {
            mt = (SubLObject)simple_indexing.NIL;
        }
        if (direction == simple_indexing.UNPROVIDED) {
            direction = (SubLObject)simple_indexing.NIL;
        }
        assert simple_indexing.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (simple_indexing.NIL == assertions_high.rule_assertionP(assertion)) {
            return (SubLObject)simple_indexing.NIL;
        }
        if (simple_indexing.NIL != mt) {
            if (simple_indexing.NIL == hlmt.hlmt_equal(assertions_high.assertion_mt(assertion), mt)) {
                return (SubLObject)simple_indexing.NIL;
            }
            if (simple_indexing.NIL != direction && !assertions_high.assertion_direction(assertion).eql(direction)) {
                return (SubLObject)simple_indexing.NIL;
            }
        }
        final SubLObject cnf = assertions_high.assertion_cnf(assertion);
        final SubLObject literals = clauses.pos_lits(cnf);
        return list_utilities.sublisp_boolean(Sequences.find(rule, literals, Symbols.symbol_function((SubLObject)simple_indexing.$sym16$MATCHES_EXCEPTION_RULE_INDEX_TEST), (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 19245L)
    public static SubLObject simple_key_exception_rule_index(final SubLObject assertion, SubLObject accumulator, final SubLObject rule, SubLObject mt) {
        if (mt == simple_indexing.UNPROVIDED) {
            mt = (SubLObject)simple_indexing.NIL;
        }
        assert simple_indexing.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (simple_indexing.NIL != matches_exception_rule_index(assertion, rule, mt, (SubLObject)simple_indexing.UNPROVIDED)) {
            if (simple_indexing.NIL != mt) {
                final SubLObject item_var = assertions_high.assertion_direction(assertion);
                if (simple_indexing.NIL == conses_high.member(item_var, accumulator, Symbols.symbol_function((SubLObject)simple_indexing.EQL), Symbols.symbol_function((SubLObject)simple_indexing.IDENTITY))) {
                    accumulator = (SubLObject)ConsesLow.cons(item_var, accumulator);
                }
            }
            else {
                final SubLObject item_var = assertions_high.assertion_mt(assertion);
                if (simple_indexing.NIL == conses_high.member(item_var, accumulator, (SubLObject)simple_indexing.$sym1$HLMT_EQUAL, Symbols.symbol_function((SubLObject)simple_indexing.IDENTITY))) {
                    accumulator = (SubLObject)ConsesLow.cons(item_var, accumulator);
                }
            }
        }
        return accumulator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 19587L)
    public static SubLObject matches_exception_rule_index_test(final SubLObject rule, final SubLObject literal) {
        final SubLObject predicate = el_utilities.literal_predicate(literal, (SubLObject)simple_indexing.UNPROVIDED);
        if (simple_indexing.NIL == kb_utilities.kbeq(simple_indexing.$const17$abnormal, predicate)) {
            return (SubLObject)simple_indexing.NIL;
        }
        if (simple_indexing.NIL == assertion_handles.assertion_p(rule)) {
            return (SubLObject)simple_indexing.NIL;
        }
        return Equality.eq(el_utilities.literal_arg2(literal, (SubLObject)simple_indexing.UNPROVIDED), rule);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 19862L)
    public static SubLObject matches_pragma_rule_index(final SubLObject assertion, final SubLObject rule, SubLObject mt, SubLObject direction) {
        if (mt == simple_indexing.UNPROVIDED) {
            mt = (SubLObject)simple_indexing.NIL;
        }
        if (direction == simple_indexing.UNPROVIDED) {
            direction = (SubLObject)simple_indexing.NIL;
        }
        assert simple_indexing.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (simple_indexing.NIL == assertions_high.rule_assertionP(assertion)) {
            return (SubLObject)simple_indexing.NIL;
        }
        if (simple_indexing.NIL != mt) {
            if (simple_indexing.NIL == hlmt.hlmt_equal(assertions_high.assertion_mt(assertion), mt)) {
                return (SubLObject)simple_indexing.NIL;
            }
            if (simple_indexing.NIL != direction && !assertions_high.assertion_direction(assertion).eql(direction)) {
                return (SubLObject)simple_indexing.NIL;
            }
        }
        final SubLObject cnf = assertions_high.assertion_cnf(assertion);
        final SubLObject literals = clauses.pos_lits(cnf);
        return list_utilities.sublisp_boolean(Sequences.find(rule, literals, Symbols.symbol_function((SubLObject)simple_indexing.$sym18$MATCHES_PRAGMA_RULE_INDEX_TEST), (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 20539L)
    public static SubLObject simple_key_pragma_rule_index(final SubLObject assertion, SubLObject accumulator, final SubLObject rule, SubLObject mt) {
        if (mt == simple_indexing.UNPROVIDED) {
            mt = (SubLObject)simple_indexing.NIL;
        }
        assert simple_indexing.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (simple_indexing.NIL != matches_pragma_rule_index(assertion, rule, mt, (SubLObject)simple_indexing.UNPROVIDED)) {
            if (simple_indexing.NIL != mt) {
                final SubLObject item_var = assertions_high.assertion_direction(assertion);
                if (simple_indexing.NIL == conses_high.member(item_var, accumulator, Symbols.symbol_function((SubLObject)simple_indexing.EQL), Symbols.symbol_function((SubLObject)simple_indexing.IDENTITY))) {
                    accumulator = (SubLObject)ConsesLow.cons(item_var, accumulator);
                }
            }
            else {
                final SubLObject item_var = assertions_high.assertion_mt(assertion);
                if (simple_indexing.NIL == conses_high.member(item_var, accumulator, (SubLObject)simple_indexing.$sym1$HLMT_EQUAL, Symbols.symbol_function((SubLObject)simple_indexing.IDENTITY))) {
                    accumulator = (SubLObject)ConsesLow.cons(item_var, accumulator);
                }
            }
        }
        return accumulator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 20875L)
    public static SubLObject matches_pragma_rule_index_test(final SubLObject rule, final SubLObject literal) {
        final SubLObject predicate = el_utilities.literal_predicate(literal, (SubLObject)simple_indexing.UNPROVIDED);
        if (simple_indexing.NIL == kb_utilities.kbeq(simple_indexing.$const19$meetsPragmaticRequirement, predicate)) {
            return (SubLObject)simple_indexing.NIL;
        }
        if (simple_indexing.NIL == assertion_handles.assertion_p(rule)) {
            return (SubLObject)simple_indexing.NIL;
        }
        return Equality.eq(el_utilities.literal_arg2(literal, (SubLObject)simple_indexing.UNPROVIDED), rule);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 21164L)
    public static SubLObject matches_unbound_rule_index(final SubLObject assertion, SubLObject sense, SubLObject mt, SubLObject direction) {
        if (sense == simple_indexing.UNPROVIDED) {
            sense = (SubLObject)simple_indexing.NIL;
        }
        if (mt == simple_indexing.UNPROVIDED) {
            mt = (SubLObject)simple_indexing.NIL;
        }
        if (direction == simple_indexing.UNPROVIDED) {
            direction = (SubLObject)simple_indexing.NIL;
        }
        assert simple_indexing.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (simple_indexing.NIL == assertions_high.rule_assertionP(assertion)) {
            return (SubLObject)simple_indexing.NIL;
        }
        if (simple_indexing.NIL == sense) {
            SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
            SubLObject sense_$15 = (SubLObject)simple_indexing.NIL;
            sense_$15 = cdolist_list_var.first();
            while (simple_indexing.NIL != cdolist_list_var) {
                if (simple_indexing.NIL != matches_unbound_rule_index(assertion, sense_$15, (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED)) {
                    return (SubLObject)simple_indexing.T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                sense_$15 = cdolist_list_var.first();
            }
        }
        if (simple_indexing.NIL != mt) {
            if (simple_indexing.NIL == hlmt.hlmt_equal(assertions_high.assertion_mt(assertion), mt)) {
                return (SubLObject)simple_indexing.NIL;
            }
            if (simple_indexing.NIL != direction && !assertions_high.assertion_direction(assertion).eql(direction)) {
                return (SubLObject)simple_indexing.NIL;
            }
        }
        return (SubLObject)simple_indexing.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 21765L)
    public static SubLObject simple_key_unbound_rule_index(final SubLObject assertion, SubLObject accumulator, SubLObject sense, SubLObject mt) {
        if (sense == simple_indexing.UNPROVIDED) {
            sense = (SubLObject)simple_indexing.NIL;
        }
        if (mt == simple_indexing.UNPROVIDED) {
            mt = (SubLObject)simple_indexing.NIL;
        }
        assert simple_indexing.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (simple_indexing.NIL != matches_unbound_rule_index(assertion, sense, mt, (SubLObject)simple_indexing.UNPROVIDED)) {
            if (simple_indexing.NIL != sense) {
                if (simple_indexing.NIL != mt) {
                    final SubLObject item_var = assertions_high.assertion_direction(assertion);
                    if (simple_indexing.NIL == conses_high.member(item_var, accumulator, Symbols.symbol_function((SubLObject)simple_indexing.EQL), Symbols.symbol_function((SubLObject)simple_indexing.IDENTITY))) {
                        accumulator = (SubLObject)ConsesLow.cons(item_var, accumulator);
                    }
                }
                else {
                    final SubLObject item_var = assertions_high.assertion_mt(assertion);
                    if (simple_indexing.NIL == conses_high.member(item_var, accumulator, (SubLObject)simple_indexing.$sym1$HLMT_EQUAL, Symbols.symbol_function((SubLObject)simple_indexing.IDENTITY))) {
                        accumulator = (SubLObject)ConsesLow.cons(item_var, accumulator);
                    }
                }
            }
            else {
                SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
                SubLObject sense_$16 = (SubLObject)simple_indexing.NIL;
                sense_$16 = cdolist_list_var.first();
                while (simple_indexing.NIL != cdolist_list_var) {
                    if (simple_indexing.NIL != matches_unbound_rule_index(assertion, sense_$16, (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED)) {
                        final SubLObject item_var2 = sense_$16;
                        if (simple_indexing.NIL == conses_high.member(item_var2, accumulator, Symbols.symbol_function((SubLObject)simple_indexing.EQL), Symbols.symbol_function((SubLObject)simple_indexing.IDENTITY))) {
                            accumulator = (SubLObject)ConsesLow.cons(item_var2, accumulator);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    sense_$16 = cdolist_list_var.first();
                }
            }
        }
        return accumulator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 22256L)
    public static SubLObject matches_mt_index(final SubLObject assertion, final SubLObject mt) {
        assert simple_indexing.NIL != assertion_handles.assertion_p(assertion) : assertion;
        final SubLObject assertion_mt = assertions_high.assertion_mt(assertion);
        return (SubLObject)SubLObjectFactory.makeBoolean(simple_indexing.NIL != hlmt.hlmt_equal(assertion_mt, mt) && simple_indexing.NIL == kb_indexing.broad_mtP(hlmt.hlmt_monad_mt(mt)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 22546L)
    public static SubLObject matches_other_index(final SubLObject assertion, final SubLObject v_term) {
        assert simple_indexing.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (simple_indexing.NIL == list_utilities.tree_find(v_term, assertions_high.assertion_cnf(assertion), Symbols.symbol_function((SubLObject)simple_indexing.EQUAL), (SubLObject)simple_indexing.UNPROVIDED) && simple_indexing.NIL == list_utilities.tree_find(v_term, assertions_high.assertion_mt(assertion), Symbols.symbol_function((SubLObject)simple_indexing.EQUAL), (SubLObject)simple_indexing.UNPROVIDED)) {
            return (SubLObject)simple_indexing.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(simple_indexing.NIL == matches_gaf_arg_index(assertion, v_term, (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED) && simple_indexing.NIL == matches_nart_arg_index(assertion, v_term, (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED) && simple_indexing.NIL == matches_predicate_extent_index(assertion, v_term, (SubLObject)simple_indexing.UNPROVIDED) && simple_indexing.NIL == matches_function_extent_index(assertion, v_term) && simple_indexing.NIL == matches_predicate_rule_index(assertion, v_term, (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED) && simple_indexing.NIL == matches_ist_predicate_rule_index(assertion, v_term, (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED) && simple_indexing.NIL == matches_decontextualized_ist_predicate_rule_index(assertion, v_term, (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED) && simple_indexing.NIL == matches_isa_rule_index(assertion, v_term, (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED) && simple_indexing.NIL == matches_genls_rule_index(assertion, v_term, (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED) && simple_indexing.NIL == matches_genl_mt_rule_index(assertion, v_term, (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED) && simple_indexing.NIL == matches_function_rule_index(assertion, v_term, (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED) && simple_indexing.NIL == matches_exception_rule_index(assertion, v_term, (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED) && simple_indexing.NIL == matches_pragma_rule_index(assertion, v_term, (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 23776L)
    public static SubLObject add_simple_index(final SubLObject v_term, final SubLObject assertion) {
        final SubLObject old_index = kb_indexing_datastructures.simple_term_assertion_list(v_term);
        return add_simple_index_to_term_assertion_list(v_term, old_index, assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 24197L)
    public static SubLObject add_simple_index_to_term_assertion_list(final SubLObject v_term, final SubLObject old_index, final SubLObject assertion) {
        assert simple_indexing.NIL != assertion_handles.assertion_p(assertion) : assertion;
        final SubLObject new_index = conses_high.adjoin(assertion, old_index, (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED);
        if (!old_index.eql(new_index)) {
            kb_indexing_datastructures.reset_term_simple_index(v_term, new_index);
            possibly_toggle_term_index_mode(v_term);
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 24524L)
    public static SubLObject rem_simple_index(final SubLObject v_term, final SubLObject assertion) {
        final SubLObject old_index = kb_indexing_datastructures.simple_term_assertion_list(v_term);
        return rem_simple_index_from_term_assertion_list(v_term, old_index, assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 24704L)
    public static SubLObject rem_simple_index_from_term_assertion_list(final SubLObject v_term, final SubLObject old_index, final SubLObject assertion) {
        assert simple_indexing.NIL != assertion_handles.assertion_p(assertion) : assertion;
        final SubLObject new_index = list_utilities.delete_first(assertion, old_index, (SubLObject)simple_indexing.UNPROVIDED);
        if (!old_index.eql(new_index)) {
            kb_indexing_datastructures.reset_term_simple_index(v_term, new_index);
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 24994L)
    public static SubLObject assertion_property_match_p(final SubLObject assertion, SubLObject truth, SubLObject type, SubLObject direction) {
        if (truth == simple_indexing.UNPROVIDED) {
            truth = (SubLObject)simple_indexing.NIL;
        }
        if (type == simple_indexing.UNPROVIDED) {
            type = (SubLObject)simple_indexing.NIL;
        }
        if (direction == simple_indexing.UNPROVIDED) {
            direction = (SubLObject)simple_indexing.NIL;
        }
        assert simple_indexing.NIL != assertion_handles.assertion_p(assertion) : assertion;
        return (SubLObject)SubLObjectFactory.makeBoolean((simple_indexing.NIL == truth || simple_indexing.NIL != assertions_high.assertion_has_truth(assertion, truth)) && (simple_indexing.NIL == type || simple_indexing.NIL != assertions_high.assertion_has_type(assertion, type)) && (simple_indexing.NIL == direction || simple_indexing.NIL != assertions_high.assertion_has_direction(assertion, direction)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 26630L)
    public static SubLObject noting_terms_to_toggle_indexing_mode(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)simple_indexing.$sym20$CLET, (SubLObject)simple_indexing.$list21, ConsesLow.append(body, (SubLObject)simple_indexing.$list22));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 26912L)
    public static SubLObject noting_terms_to_toggle_indexing_mode_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = simple_indexing.$terms_to_toggle_indexing_mode$.getDynamicValue(thread);
        SubLObject v_term = (SubLObject)simple_indexing.NIL;
        v_term = cdolist_list_var.first();
        while (simple_indexing.NIL != cdolist_list_var) {
            toggle_term_index_mode(v_term);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        }
        return (SubLObject)simple_indexing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 27709L)
    public static SubLObject possibly_toggle_term_index_mode(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (simple_indexing.NIL != simple_indexing.$within_noting_terms_to_toggle_indexing_mode$.getDynamicValue(thread)) {
            final SubLObject total = kb_indexing.num_index(v_term);
            if (simple_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(v_term)) {
                if (total.numGE(simple_indexing.$index_convert_complex_threshold$.getDynamicValue(thread))) {
                    if (simple_indexing.NIL == conses_high.member(v_term, simple_indexing.$terms_to_toggle_indexing_mode$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)simple_indexing.EQL), Symbols.symbol_function((SubLObject)simple_indexing.IDENTITY))) {
                        simple_indexing.$terms_to_toggle_indexing_mode$.setDynamicValue((SubLObject)ConsesLow.cons(v_term, simple_indexing.$terms_to_toggle_indexing_mode$.getDynamicValue(thread)), thread);
                    }
                    return (SubLObject)simple_indexing.T;
                }
            }
            else if (total.numLE(simple_indexing.$index_convert_simple_threshold$.getDynamicValue(thread))) {
                if (simple_indexing.NIL == conses_high.member(v_term, simple_indexing.$terms_to_toggle_indexing_mode$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)simple_indexing.EQL), Symbols.symbol_function((SubLObject)simple_indexing.IDENTITY))) {
                    simple_indexing.$terms_to_toggle_indexing_mode$.setDynamicValue((SubLObject)ConsesLow.cons(v_term, simple_indexing.$terms_to_toggle_indexing_mode$.getDynamicValue(thread)), thread);
                }
                return (SubLObject)simple_indexing.T;
            }
        }
        return (SubLObject)simple_indexing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 28272L)
    public static SubLObject toggle_term_index_mode(final SubLObject v_term) {
        if (simple_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(v_term)) {
            convert_to_complex_index(v_term);
        }
        else {
            convert_to_simple_index(v_term);
        }
        return v_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 28461L)
    public static SubLObject convert_to_complex_index(final SubLObject v_term) {
        final SubLObject assertions = Sequences.reverse(kb_indexing_datastructures.simple_term_assertion_list(v_term));
        kb_indexing_datastructures.initialize_term_complex_index(v_term);
        SubLObject cdolist_list_var = assertions;
        SubLObject assertion = (SubLObject)simple_indexing.NIL;
        assertion = cdolist_list_var.first();
        while (simple_indexing.NIL != cdolist_list_var) {
            kb_indexing.add_assertion_indices(assertion, v_term);
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return v_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 28967L)
    public static SubLObject convert_to_simple_index(final SubLObject v_term) {
        SubLObject assertions = kb_mapping.gather_index_in_any_mt(v_term, (SubLObject)simple_indexing.T);
        assertions = list_utilities.delete_if_not(Symbols.symbol_function((SubLObject)simple_indexing.$sym26$VALID_ASSERTION), assertions, (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED);
        kb_indexing_datastructures.free_term_index(v_term);
        kb_indexing_datastructures.reset_term_simple_index(v_term, assertions);
        return v_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 29264L)
    public static SubLObject reconstruct_complex_index(final SubLObject v_term) {
        if (simple_indexing.NIL == kb_indexing_datastructures.simple_indexed_term_p(v_term)) {
            convert_to_simple_index(v_term);
            convert_to_complex_index(v_term);
            return v_term;
        }
        return (SubLObject)simple_indexing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 29443L)
    public static SubLObject clean_kb_indexing() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = (SubLObject)simple_indexing.$str27$mapping_Cyc_FORTs;
        final SubLObject total = forts.fort_count();
        SubLObject sofar = (SubLObject)simple_indexing.ZERO_INTEGER;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)simple_indexing.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)simple_indexing.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)simple_indexing.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(message);
                SubLObject cdolist_list_var = forts.do_forts_tables();
                SubLObject table_var = (SubLObject)simple_indexing.NIL;
                table_var = cdolist_list_var.first();
                while (simple_indexing.NIL != cdolist_list_var) {
                    final SubLObject idx = table_var;
                    if (simple_indexing.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)simple_indexing.$kw28$SKIP)) {
                        final SubLObject idx_$17 = idx;
                        if (simple_indexing.NIL == id_index.id_index_dense_objects_empty_p(idx_$17, (SubLObject)simple_indexing.$kw28$SKIP)) {
                            final SubLObject vector_var = id_index.id_index_dense_objects(idx_$17);
                            final SubLObject backwardP_var = (SubLObject)simple_indexing.NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject id;
                            SubLObject fort;
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)simple_indexing.NIL, v_iteration = (SubLObject)simple_indexing.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)simple_indexing.ONE_INTEGER)) {
                                id = ((simple_indexing.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)simple_indexing.ONE_INTEGER) : v_iteration);
                                fort = Vectors.aref(vector_var, id);
                                if (simple_indexing.NIL == id_index.id_index_tombstone_p(fort) || simple_indexing.NIL == id_index.id_index_skip_tombstones_p((SubLObject)simple_indexing.$kw28$SKIP)) {
                                    if (simple_indexing.NIL != id_index.id_index_tombstone_p(fort)) {
                                        fort = (SubLObject)simple_indexing.$kw28$SKIP;
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)simple_indexing.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                    clean_term_index(fort);
                                }
                            }
                        }
                        final SubLObject idx_$18 = idx;
                        if (simple_indexing.NIL == id_index.id_index_sparse_objects_empty_p(idx_$18) || simple_indexing.NIL == id_index.id_index_skip_tombstones_p((SubLObject)simple_indexing.$kw28$SKIP)) {
                            final SubLObject sparse = id_index.id_index_sparse_objects(idx_$18);
                            SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$18);
                            final SubLObject end_id = id_index.id_index_next_id(idx_$18);
                            final SubLObject v_default = (SubLObject)((simple_indexing.NIL != id_index.id_index_skip_tombstones_p((SubLObject)simple_indexing.$kw28$SKIP)) ? simple_indexing.NIL : simple_indexing.$kw28$SKIP);
                            while (id2.numL(end_id)) {
                                final SubLObject fort2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                                if (simple_indexing.NIL == id_index.id_index_skip_tombstones_p((SubLObject)simple_indexing.$kw28$SKIP) || simple_indexing.NIL == id_index.id_index_tombstone_p(fort2)) {
                                    sofar = Numbers.add(sofar, (SubLObject)simple_indexing.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                    clean_term_index(fort2);
                                }
                                id2 = Numbers.add(id2, (SubLObject)simple_indexing.ONE_INTEGER);
                            }
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    table_var = cdolist_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)simple_indexing.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        final SubLObject idx2 = assertion_handles.do_assertions_table();
        final SubLObject mess = (SubLObject)simple_indexing.$str29$mapping_Cyc_assertions;
        final SubLObject total2 = id_index.id_index_count(idx2);
        SubLObject sofar2 = (SubLObject)simple_indexing.ZERO_INTEGER;
        assert simple_indexing.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)simple_indexing.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)simple_indexing.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)simple_indexing.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$19 = idx2;
                if (simple_indexing.NIL == id_index.id_index_objects_empty_p(idx_$19, (SubLObject)simple_indexing.$kw28$SKIP)) {
                    final SubLObject idx_$20 = idx_$19;
                    if (simple_indexing.NIL == id_index.id_index_dense_objects_empty_p(idx_$20, (SubLObject)simple_indexing.$kw28$SKIP)) {
                        final SubLObject vector_var2 = id_index.id_index_dense_objects(idx_$20);
                        final SubLObject backwardP_var2 = (SubLObject)simple_indexing.NIL;
                        SubLObject length2;
                        SubLObject v_iteration2;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject assertion;
                        for (length2 = Sequences.length(vector_var2), v_iteration2 = (SubLObject)simple_indexing.NIL, v_iteration2 = (SubLObject)simple_indexing.ZERO_INTEGER; v_iteration2.numL(length2); v_iteration2 = Numbers.add(v_iteration2, (SubLObject)simple_indexing.ONE_INTEGER)) {
                            a_id = ((simple_indexing.NIL != backwardP_var2) ? Numbers.subtract(length2, v_iteration2, (SubLObject)simple_indexing.ONE_INTEGER) : v_iteration2);
                            a_handle = Vectors.aref(vector_var2, a_id);
                            if (simple_indexing.NIL == id_index.id_index_tombstone_p(a_handle) || simple_indexing.NIL == id_index.id_index_skip_tombstones_p((SubLObject)simple_indexing.$kw28$SKIP)) {
                                if (simple_indexing.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                    a_handle = (SubLObject)simple_indexing.$kw28$SKIP;
                                }
                                assertion = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                if (simple_indexing.NIL != assertion_utilities.assertion_has_meta_assertionsP(assertion)) {
                                    clean_term_index(assertion);
                                }
                                sofar2 = Numbers.add(sofar2, (SubLObject)simple_indexing.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar2, total2);
                            }
                        }
                    }
                    final SubLObject idx_$21 = idx_$19;
                    if (simple_indexing.NIL == id_index.id_index_sparse_objects_empty_p(idx_$21) || simple_indexing.NIL == id_index.id_index_skip_tombstones_p((SubLObject)simple_indexing.$kw28$SKIP)) {
                        final SubLObject sparse2 = id_index.id_index_sparse_objects(idx_$21);
                        SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$21);
                        final SubLObject end_id2 = id_index.id_index_next_id(idx_$21);
                        final SubLObject v_default2 = (SubLObject)((simple_indexing.NIL != id_index.id_index_skip_tombstones_p((SubLObject)simple_indexing.$kw28$SKIP)) ? simple_indexing.NIL : simple_indexing.$kw28$SKIP);
                        while (a_id2.numL(end_id2)) {
                            final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse2, v_default2);
                            if (simple_indexing.NIL == id_index.id_index_skip_tombstones_p((SubLObject)simple_indexing.$kw28$SKIP) || simple_indexing.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                final SubLObject assertion2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                if (simple_indexing.NIL != assertion_utilities.assertion_has_meta_assertionsP(assertion2)) {
                                    clean_term_index(assertion2);
                                }
                                sofar2 = Numbers.add(sofar2, (SubLObject)simple_indexing.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar2, total2);
                            }
                            a_id2 = Numbers.add(a_id2, (SubLObject)simple_indexing.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$20 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)simple_indexing.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
        }
        return (SubLObject)simple_indexing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 29774L)
    public static SubLObject clean_term_index(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (simple_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(v_term)) {
            SubLObject index = kb_indexing_datastructures.simple_term_assertion_list(v_term);
            if (simple_indexing.NIL != list_utilities.find_if_not(Symbols.symbol_function((SubLObject)simple_indexing.$sym26$VALID_ASSERTION), index, (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED)) {
                Errors.warn((SubLObject)simple_indexing.$str31$invalid_index_under__S, v_term);
                index = list_utilities.delete_if_not(Symbols.symbol_function((SubLObject)simple_indexing.$sym26$VALID_ASSERTION), index, (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED, (SubLObject)simple_indexing.UNPROVIDED);
                kb_indexing_datastructures.reset_term_simple_index(v_term, index);
            }
        }
        else {
            SubLObject invalid = (SubLObject)simple_indexing.NIL;
            try {
                thread.throwStack.push(simple_indexing.$kw32$INVALID);
                kb_mapping.map_term(Symbols.symbol_function((SubLObject)simple_indexing.$sym33$CLEAN_TERM_INDEX_INTERNAL), v_term);
                invalid = (SubLObject)simple_indexing.NIL;
            }
            catch (Throwable ccatch_env_var) {
                invalid = Errors.handleThrowable(ccatch_env_var, (SubLObject)simple_indexing.$kw32$INVALID);
            }
            finally {
                thread.throwStack.pop();
            }
            if (simple_indexing.NIL != invalid) {
                convert_to_simple_index(v_term);
                clean_term_index(v_term);
                convert_to_complex_index(v_term);
            }
        }
        return (SubLObject)simple_indexing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/simple-indexing.lisp", position = 30401L)
    public static SubLObject clean_term_index_internal(final SubLObject assertion) {
        if (simple_indexing.NIL == assertions_high.valid_assertion(assertion, (SubLObject)simple_indexing.UNPROVIDED)) {
            Dynamic.sublisp_throw((SubLObject)simple_indexing.$kw32$INVALID, (SubLObject)simple_indexing.T);
        }
        return (SubLObject)simple_indexing.NIL;
    }
    
    public static SubLObject declare_simple_indexing_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "gaf_arg_index_simple_match_p", "GAF-ARG-INDEX-SIMPLE-MATCH-P", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "matches_gaf_arg_index", "MATCHES-GAF-ARG-INDEX", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "simple_key_gaf_arg_index", "SIMPLE-KEY-GAF-ARG-INDEX", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "matches_gaf_arg_index_internal", "MATCHES-GAF-ARG-INDEX-INTERNAL", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "simple_key_gaf_arg_index_internal", "SIMPLE-KEY-GAF-ARG-INDEX-INTERNAL", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "matches_nart_arg_index", "MATCHES-NART-ARG-INDEX", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "simple_key_nart_arg_index", "SIMPLE-KEY-NART-ARG-INDEX", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "matches_nart_arg_index_internal", "MATCHES-NART-ARG-INDEX-INTERNAL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "simple_key_nart_arg_index_internal", "SIMPLE-KEY-NART-ARG-INDEX-INTERNAL", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "matches_predicate_extent_index", "MATCHES-PREDICATE-EXTENT-INDEX", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "simple_key_predicate_extent_index", "SIMPLE-KEY-PREDICATE-EXTENT-INDEX", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "matches_predicate_extent_index_internal", "MATCHES-PREDICATE-EXTENT-INDEX-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "matches_function_extent_index", "MATCHES-FUNCTION-EXTENT-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "matches_function_extent_index_internal", "MATCHES-FUNCTION-EXTENT-INDEX-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "matches_predicate_rule_index", "MATCHES-PREDICATE-RULE-INDEX", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "simple_key_predicate_rule_index", "SIMPLE-KEY-PREDICATE-RULE-INDEX", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "matches_predicate_rule_index_test", "MATCHES-PREDICATE-RULE-INDEX-TEST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "matches_ist_predicate_rule_index", "MATCHES-IST-PREDICATE-RULE-INDEX", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "simple_key_ist_predicate_rule_index", "SIMPLE-KEY-IST-PREDICATE-RULE-INDEX", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "matches_ist_predicate_rule_index_test", "MATCHES-IST-PREDICATE-RULE-INDEX-TEST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "matches_decontextualized_ist_predicate_rule_index", "MATCHES-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "simple_key_decontextualized_ist_predicate_rule_index", "SIMPLE-KEY-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "matches_decontextualized_ist_predicate_rule_index_test", "MATCHES-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX-TEST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "matches_isa_rule_index", "MATCHES-ISA-RULE-INDEX", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "simple_key_isa_rule_index", "SIMPLE-KEY-ISA-RULE-INDEX", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "matches_isa_rule_index_test", "MATCHES-ISA-RULE-INDEX-TEST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "matches_quoted_isa_rule_index", "MATCHES-QUOTED-ISA-RULE-INDEX", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "simple_key_quoted_isa_rule_index", "SIMPLE-KEY-QUOTED-ISA-RULE-INDEX", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "matches_quoted_isa_rule_index_test", "MATCHES-QUOTED-ISA-RULE-INDEX-TEST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "matches_genls_rule_index", "MATCHES-GENLS-RULE-INDEX", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "simple_key_genls_rule_index", "SIMPLE-KEY-GENLS-RULE-INDEX", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "matches_genls_rule_index_test", "MATCHES-GENLS-RULE-INDEX-TEST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "matches_genl_mt_rule_index", "MATCHES-GENL-MT-RULE-INDEX", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "simple_key_genl_mt_rule_index", "SIMPLE-KEY-GENL-MT-RULE-INDEX", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "matches_genl_mt_rule_index_test", "MATCHES-GENL-MT-RULE-INDEX-TEST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "matches_function_rule_index", "MATCHES-FUNCTION-RULE-INDEX", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "simple_key_function_rule_index", "SIMPLE-KEY-FUNCTION-RULE-INDEX", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "matches_function_rule_index_test", "MATCHES-FUNCTION-RULE-INDEX-TEST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "matches_exception_rule_index", "MATCHES-EXCEPTION-RULE-INDEX", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "simple_key_exception_rule_index", "SIMPLE-KEY-EXCEPTION-RULE-INDEX", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "matches_exception_rule_index_test", "MATCHES-EXCEPTION-RULE-INDEX-TEST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "matches_pragma_rule_index", "MATCHES-PRAGMA-RULE-INDEX", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "simple_key_pragma_rule_index", "SIMPLE-KEY-PRAGMA-RULE-INDEX", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "matches_pragma_rule_index_test", "MATCHES-PRAGMA-RULE-INDEX-TEST", 2, 0, false);
        new $matches_pragma_rule_index_test$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "matches_unbound_rule_index", "MATCHES-UNBOUND-RULE-INDEX", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "simple_key_unbound_rule_index", "SIMPLE-KEY-UNBOUND-RULE-INDEX", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "matches_mt_index", "MATCHES-MT-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "matches_other_index", "MATCHES-OTHER-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "add_simple_index", "ADD-SIMPLE-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "add_simple_index_to_term_assertion_list", "ADD-SIMPLE-INDEX-TO-TERM-ASSERTION-LIST", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "rem_simple_index", "REM-SIMPLE-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "rem_simple_index_from_term_assertion_list", "REM-SIMPLE-INDEX-FROM-TERM-ASSERTION-LIST", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "assertion_property_match_p", "ASSERTION-PROPERTY-MATCH-P", 1, 3, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.simple_indexing", "noting_terms_to_toggle_indexing_mode", "NOTING-TERMS-TO-TOGGLE-INDEXING-MODE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "noting_terms_to_toggle_indexing_mode_internal", "NOTING-TERMS-TO-TOGGLE-INDEXING-MODE-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "possibly_toggle_term_index_mode", "POSSIBLY-TOGGLE-TERM-INDEX-MODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "toggle_term_index_mode", "TOGGLE-TERM-INDEX-MODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "convert_to_complex_index", "CONVERT-TO-COMPLEX-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "convert_to_simple_index", "CONVERT-TO-SIMPLE-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "reconstruct_complex_index", "RECONSTRUCT-COMPLEX-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "clean_kb_indexing", "CLEAN-KB-INDEXING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "clean_term_index", "CLEAN-TERM-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.simple_indexing", "clean_term_index_internal", "CLEAN-TERM-INDEX-INTERNAL", 1, 0, false);
        return (SubLObject)simple_indexing.NIL;
    }
    
    public static SubLObject init_simple_indexing_file() {
        simple_indexing.$within_noting_terms_to_toggle_indexing_mode$ = SubLFiles.defparameter("*WITHIN-NOTING-TERMS-TO-TOGGLE-INDEXING-MODE*", (SubLObject)simple_indexing.NIL);
        simple_indexing.$terms_to_toggle_indexing_mode$ = SubLFiles.defparameter("*TERMS-TO-TOGGLE-INDEXING-MODE*", (SubLObject)simple_indexing.NIL);
        simple_indexing.$index_convert_threshold$ = SubLFiles.defparameter("*INDEX-CONVERT-THRESHOLD*", (SubLObject)simple_indexing.TWENTY_INTEGER);
        simple_indexing.$index_convert_range$ = SubLFiles.defparameter("*INDEX-CONVERT-RANGE*", (SubLObject)simple_indexing.FOUR_INTEGER);
        simple_indexing.$index_convert_complex_threshold$ = SubLFiles.defparameter("*INDEX-CONVERT-COMPLEX-THRESHOLD*", Numbers.add(simple_indexing.$index_convert_threshold$.getDynamicValue(), Numbers.integerDivide(simple_indexing.$index_convert_range$.getDynamicValue(), (SubLObject)simple_indexing.TWO_INTEGER)));
        simple_indexing.$index_convert_simple_threshold$ = SubLFiles.defparameter("*INDEX-CONVERT-SIMPLE-THRESHOLD*", Numbers.subtract(simple_indexing.$index_convert_threshold$.getDynamicValue(), Numbers.integerDivide(simple_indexing.$index_convert_range$.getDynamicValue(), (SubLObject)simple_indexing.TWO_INTEGER)));
        return (SubLObject)simple_indexing.NIL;
    }
    
    public static SubLObject setup_simple_indexing_file() {
        access_macros.register_macro_helper((SubLObject)simple_indexing.$sym23$NOTING_TERMS_TO_TOGGLE_INDEXING_MODE_INTERNAL, (SubLObject)simple_indexing.$sym24$NOTING_TERMS_TO_TOGGLE_INDEXING_MODE);
        access_macros.register_macro_helper((SubLObject)simple_indexing.$sym25$POSSIBLY_TOGGLE_TERM_INDEX_MODE, (SubLObject)simple_indexing.$sym24$NOTING_TERMS_TO_TOGGLE_INDEXING_MODE);
        return (SubLObject)simple_indexing.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_simple_indexing_file();
    }
    
    @Override
	public void initializeVariables() {
        init_simple_indexing_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_simple_indexing_file();
    }
    
    static {
        me = (SubLFile)new simple_indexing();
        simple_indexing.$within_noting_terms_to_toggle_indexing_mode$ = null;
        simple_indexing.$terms_to_toggle_indexing_mode$ = null;
        simple_indexing.$index_convert_threshold$ = null;
        simple_indexing.$index_convert_range$ = null;
        simple_indexing.$index_convert_complex_threshold$ = null;
        simple_indexing.$index_convert_simple_threshold$ = null;
        $sym0$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $sym1$HLMT_EQUAL = SubLObjectFactory.makeSymbol("HLMT-EQUAL");
        $const2$termOfUnit = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termOfUnit"));
        $kw3$POS = SubLObjectFactory.makeKeyword("POS");
        $sym4$MATCHES_PREDICATE_RULE_INDEX_TEST = SubLObjectFactory.makeSymbol("MATCHES-PREDICATE-RULE-INDEX-TEST");
        $sym5$MATCHES_IST_PREDICATE_RULE_INDEX_TEST = SubLObjectFactory.makeSymbol("MATCHES-IST-PREDICATE-RULE-INDEX-TEST");
        $sym6$MATCHES_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX_TEST = SubLObjectFactory.makeSymbol("MATCHES-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX-TEST");
        $sym7$MATCHES_ISA_RULE_INDEX_TEST = SubLObjectFactory.makeSymbol("MATCHES-ISA-RULE-INDEX-TEST");
        $const8$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $sym9$MATCHES_QUOTED_ISA_RULE_INDEX_TEST = SubLObjectFactory.makeSymbol("MATCHES-QUOTED-ISA-RULE-INDEX-TEST");
        $const10$quotedIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedIsa"));
        $sym11$MATCHES_GENLS_RULE_INDEX_TEST = SubLObjectFactory.makeSymbol("MATCHES-GENLS-RULE-INDEX-TEST");
        $const12$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $sym13$MATCHES_GENL_MT_RULE_INDEX_TEST = SubLObjectFactory.makeSymbol("MATCHES-GENL-MT-RULE-INDEX-TEST");
        $const14$genlMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt"));
        $sym15$MATCHES_FUNCTION_RULE_INDEX_TEST = SubLObjectFactory.makeSymbol("MATCHES-FUNCTION-RULE-INDEX-TEST");
        $sym16$MATCHES_EXCEPTION_RULE_INDEX_TEST = SubLObjectFactory.makeSymbol("MATCHES-EXCEPTION-RULE-INDEX-TEST");
        $const17$abnormal = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("abnormal"));
        $sym18$MATCHES_PRAGMA_RULE_INDEX_TEST = SubLObjectFactory.makeSymbol("MATCHES-PRAGMA-RULE-INDEX-TEST");
        $const19$meetsPragmaticRequirement = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("meetsPragmaticRequirement"));
        $sym20$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list21 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*WITHIN-NOTING-TERMS-TO-TOGGLE-INDEXING-MODE*"), (SubLObject)simple_indexing.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*TERMS-TO-TOGGLE-INDEXING-MODE*"), (SubLObject)simple_indexing.NIL));
        $list22 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("*TERMS-TO-TOGGLE-INDEXING-MODE*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NOTING-TERMS-TO-TOGGLE-INDEXING-MODE-INTERNAL"))));
        $sym23$NOTING_TERMS_TO_TOGGLE_INDEXING_MODE_INTERNAL = SubLObjectFactory.makeSymbol("NOTING-TERMS-TO-TOGGLE-INDEXING-MODE-INTERNAL");
        $sym24$NOTING_TERMS_TO_TOGGLE_INDEXING_MODE = SubLObjectFactory.makeSymbol("NOTING-TERMS-TO-TOGGLE-INDEXING-MODE");
        $sym25$POSSIBLY_TOGGLE_TERM_INDEX_MODE = SubLObjectFactory.makeSymbol("POSSIBLY-TOGGLE-TERM-INDEX-MODE");
        $sym26$VALID_ASSERTION = SubLObjectFactory.makeSymbol("VALID-ASSERTION");
        $str27$mapping_Cyc_FORTs = SubLObjectFactory.makeString("mapping Cyc FORTs");
        $kw28$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $str29$mapping_Cyc_assertions = SubLObjectFactory.makeString("mapping Cyc assertions");
        $sym30$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $str31$invalid_index_under__S = SubLObjectFactory.makeString("invalid index under ~S");
        $kw32$INVALID = SubLObjectFactory.makeKeyword("INVALID");
        $sym33$CLEAN_TERM_INDEX_INTERNAL = SubLObjectFactory.makeSymbol("CLEAN-TERM-INDEX-INTERNAL");
    }
    
    public static final class $matches_pragma_rule_index_test$BinaryFunction extends BinaryFunction
    {
        public $matches_pragma_rule_index_test$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("MATCHES-PRAGMA-RULE-INDEX-TEST"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return simple_indexing.matches_pragma_rule_index_test(arg1, arg2);
        }
    }
}

/*

	Total time: 471 ms
	
*/