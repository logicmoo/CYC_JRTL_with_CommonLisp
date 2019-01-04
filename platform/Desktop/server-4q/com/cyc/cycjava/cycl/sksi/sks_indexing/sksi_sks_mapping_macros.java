package com.cyc.cycjava.cycl.sksi.sks_indexing;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_sks_mapping_macros extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mapping_macros";
    public static final String myFingerPrint = "95961196cd0f300f13e5286acf659fbca59c1e5013058135cdaa700fd1b747af";
    private static final SubLList $list0;
    private static final SubLList $list1;
    private static final SubLSymbol $kw2$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw3$DONE;
    private static final SubLSymbol $sym4$SUPPORT;
    private static final SubLSymbol $sym5$DO_LIST;
    private static final SubLSymbol $sym6$GATHER_SKSI_GAF_LOOKUP_INDEX;
    private static final SubLSymbol $sym7$CLET;
    private static final SubLList $list8;
    private static final SubLList $list9;
    private static final SubLSymbol $kw10$TRUTH;
    private static final SubLSymbol $kw11$TRUE;
    private static final SubLSymbol $sym12$GATHER_SENTENCE_MT_PAIR;
    private static final SubLSymbol $sym13$GATHER_SKSI_PREDICATE_EXTENT_INDEX;
    private static final SubLSymbol $sym14$CDESTRUCTURING_BIND;
    private static final SubLList $list15;
    private static final SubLList $list16;
    private static final SubLSymbol $kw17$GATHER_ARGNUM;
    private static final SubLSymbol $kw18$INDEX_ARGNUM;
    private static final SubLSymbol $sym19$GATHER_ARG_MT_PAIR;
    private static final SubLSymbol $sym20$GATHER_SKSI_GAF_ARG_INDEX_VALUES;
    private static final SubLList $list21;
    private static final SubLList $list22;
    private static final SubLSymbol $sym23$GATHER_SENTENCE_MT_PAIR;
    private static final SubLSymbol $sym24$GATHER_SKSI_GAF_ARG_INDEX;
    private static final SubLSymbol $sym25$GATHER_SENTENCE_MT_PAIR;
    private static final SubLSymbol $sym26$WITH_ALL_SPEC_PREDICATES_AND_INVERSES;
    private static final SubLSymbol $sym27$SPEC_PRED;
    private static final SubLSymbol $sym28$INVERSE_MODE_;
    private static final SubLSymbol $sym29$NEW_GATHER_ARGNUM;
    private static final SubLSymbol $sym30$NEW_INDEX_ARGNUM;
    private static final SubLSymbol $sym31$PROGN;
    private static final SubLSymbol $sym32$DO_ALL_SPEC_PREDICATES_AND_INVERSES;
    private static final SubLSymbol $sym33$FIF;
    private static final SubLSymbol $sym34$DO_SKSI_GAF_ARG_INDEX_VALUES;
    private static final SubLList $list35;
    private static final SubLSymbol $sym36$GATHER_ARG_MT_PRED_TUPLE;
    private static final SubLSymbol $sym37$GATHER_SKSI_GAF_ARG_INDEX_VALUES_RELEVANT_PRED;
    private static final SubLList $list38;
    private static final SubLSymbol $sym39$GATHER_SENTENCE_MT_PAIR;
    private static final SubLSymbol $sym40$GATHER_SKSI_GAF_ARG_INDEX_RELEVANT_PRED;
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mapping-macros.lisp", position = 948L)
    public static SubLObject do_sksi_gaf_lookup_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_mapping_macros.$list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject support_var = (SubLObject)sksi_sks_mapping_macros.NIL;
        SubLObject asent = (SubLObject)sksi_sks_mapping_macros.NIL;
        SubLObject sense = (SubLObject)sksi_sks_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_mapping_macros.$list0);
        support_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_mapping_macros.$list0);
        asent = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_mapping_macros.$list0);
        sense = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)sksi_sks_mapping_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)sksi_sks_mapping_macros.NIL;
        SubLObject current_$1 = (SubLObject)sksi_sks_mapping_macros.NIL;
        while (sksi_sks_mapping_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sksi_sks_mapping_macros.$list0);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sksi_sks_mapping_macros.$list0);
            if (sksi_sks_mapping_macros.NIL == conses_high.member(current_$1, (SubLObject)sksi_sks_mapping_macros.$list1, (SubLObject)sksi_sks_mapping_macros.UNPROVIDED, (SubLObject)sksi_sks_mapping_macros.UNPROVIDED)) {
                bad = (SubLObject)sksi_sks_mapping_macros.T;
            }
            if (current_$1 == sksi_sks_mapping_macros.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (sksi_sks_mapping_macros.NIL != bad && sksi_sks_mapping_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_sks_mapping_macros.$list0);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)sksi_sks_mapping_macros.$kw3$DONE, current);
        final SubLObject done = (SubLObject)((sksi_sks_mapping_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : sksi_sks_mapping_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject support = (SubLObject)sksi_sks_mapping_macros.$sym4$SUPPORT;
        return (SubLObject)ConsesLow.list((SubLObject)sksi_sks_mapping_macros.$sym5$DO_LIST, (SubLObject)ConsesLow.list(support, (SubLObject)ConsesLow.list((SubLObject)sksi_sks_mapping_macros.$sym6$GATHER_SKSI_GAF_LOOKUP_INDEX, asent, sense), (SubLObject)sksi_sks_mapping_macros.$kw3$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)sksi_sks_mapping_macros.$sym7$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(support_var, support)), ConsesLow.append(body, (SubLObject)sksi_sks_mapping_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mapping-macros.lisp", position = 1212L)
    public static SubLObject do_sksi_predicate_extent_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_mapping_macros.$list8);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject gather_sentence = (SubLObject)sksi_sks_mapping_macros.NIL;
        SubLObject gather_mt = (SubLObject)sksi_sks_mapping_macros.NIL;
        SubLObject predicate = (SubLObject)sksi_sks_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_mapping_macros.$list8);
        gather_sentence = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_mapping_macros.$list8);
        gather_mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_mapping_macros.$list8);
        predicate = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)sksi_sks_mapping_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)sksi_sks_mapping_macros.NIL;
        SubLObject current_$2 = (SubLObject)sksi_sks_mapping_macros.NIL;
        while (sksi_sks_mapping_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sksi_sks_mapping_macros.$list8);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sksi_sks_mapping_macros.$list8);
            if (sksi_sks_mapping_macros.NIL == conses_high.member(current_$2, (SubLObject)sksi_sks_mapping_macros.$list9, (SubLObject)sksi_sks_mapping_macros.UNPROVIDED, (SubLObject)sksi_sks_mapping_macros.UNPROVIDED)) {
                bad = (SubLObject)sksi_sks_mapping_macros.T;
            }
            if (current_$2 == sksi_sks_mapping_macros.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (sksi_sks_mapping_macros.NIL != bad && sksi_sks_mapping_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_sks_mapping_macros.$list8);
        }
        final SubLObject truth_tail = cdestructuring_bind.property_list_member((SubLObject)sksi_sks_mapping_macros.$kw10$TRUTH, current);
        final SubLObject truth = (SubLObject)((sksi_sks_mapping_macros.NIL != truth_tail) ? conses_high.cadr(truth_tail) : sksi_sks_mapping_macros.$kw11$TRUE);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)sksi_sks_mapping_macros.$kw3$DONE, current);
        final SubLObject done = (SubLObject)((sksi_sks_mapping_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : sksi_sks_mapping_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject gather_sentence_mt_pair = (SubLObject)sksi_sks_mapping_macros.$sym12$GATHER_SENTENCE_MT_PAIR;
        return (SubLObject)ConsesLow.list((SubLObject)sksi_sks_mapping_macros.$sym5$DO_LIST, (SubLObject)ConsesLow.list(gather_sentence_mt_pair, (SubLObject)ConsesLow.list((SubLObject)sksi_sks_mapping_macros.$sym13$GATHER_SKSI_PREDICATE_EXTENT_INDEX, predicate, truth), (SubLObject)sksi_sks_mapping_macros.$kw3$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)sksi_sks_mapping_macros.$sym14$CDESTRUCTURING_BIND, (SubLObject)ConsesLow.list(gather_sentence, gather_mt), gather_sentence_mt_pair, ConsesLow.append(body, (SubLObject)sksi_sks_mapping_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mapping-macros.lisp", position = 2048L)
    public static SubLObject do_sksi_gaf_arg_index_values(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_mapping_macros.$list15);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject gather_arg = (SubLObject)sksi_sks_mapping_macros.NIL;
        SubLObject gather_mt = (SubLObject)sksi_sks_mapping_macros.NIL;
        SubLObject index_arg = (SubLObject)sksi_sks_mapping_macros.NIL;
        SubLObject predicate = (SubLObject)sksi_sks_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_mapping_macros.$list15);
        gather_arg = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_mapping_macros.$list15);
        gather_mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_mapping_macros.$list15);
        index_arg = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_mapping_macros.$list15);
        predicate = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)sksi_sks_mapping_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)sksi_sks_mapping_macros.NIL;
        SubLObject current_$3 = (SubLObject)sksi_sks_mapping_macros.NIL;
        while (sksi_sks_mapping_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sksi_sks_mapping_macros.$list15);
            current_$3 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sksi_sks_mapping_macros.$list15);
            if (sksi_sks_mapping_macros.NIL == conses_high.member(current_$3, (SubLObject)sksi_sks_mapping_macros.$list16, (SubLObject)sksi_sks_mapping_macros.UNPROVIDED, (SubLObject)sksi_sks_mapping_macros.UNPROVIDED)) {
                bad = (SubLObject)sksi_sks_mapping_macros.T;
            }
            if (current_$3 == sksi_sks_mapping_macros.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (sksi_sks_mapping_macros.NIL != bad && sksi_sks_mapping_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_sks_mapping_macros.$list15);
        }
        final SubLObject gather_argnum_tail = cdestructuring_bind.property_list_member((SubLObject)sksi_sks_mapping_macros.$kw17$GATHER_ARGNUM, current);
        final SubLObject gather_argnum = (SubLObject)((sksi_sks_mapping_macros.NIL != gather_argnum_tail) ? conses_high.cadr(gather_argnum_tail) : sksi_sks_mapping_macros.TWO_INTEGER);
        final SubLObject index_argnum_tail = cdestructuring_bind.property_list_member((SubLObject)sksi_sks_mapping_macros.$kw18$INDEX_ARGNUM, current);
        final SubLObject index_argnum = (SubLObject)((sksi_sks_mapping_macros.NIL != index_argnum_tail) ? conses_high.cadr(index_argnum_tail) : sksi_sks_mapping_macros.ONE_INTEGER);
        final SubLObject truth_tail = cdestructuring_bind.property_list_member((SubLObject)sksi_sks_mapping_macros.$kw10$TRUTH, current);
        final SubLObject truth = (SubLObject)((sksi_sks_mapping_macros.NIL != truth_tail) ? conses_high.cadr(truth_tail) : sksi_sks_mapping_macros.$kw11$TRUE);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)sksi_sks_mapping_macros.$kw3$DONE, current);
        final SubLObject done = (SubLObject)((sksi_sks_mapping_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : sksi_sks_mapping_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject gather_arg_mt_pair = (SubLObject)sksi_sks_mapping_macros.$sym19$GATHER_ARG_MT_PAIR;
        return (SubLObject)ConsesLow.list((SubLObject)sksi_sks_mapping_macros.$sym5$DO_LIST, (SubLObject)ConsesLow.list(gather_arg_mt_pair, (SubLObject)ConsesLow.list((SubLObject)sksi_sks_mapping_macros.$sym20$GATHER_SKSI_GAF_ARG_INDEX_VALUES, index_arg, index_argnum, gather_argnum, predicate, truth), (SubLObject)sksi_sks_mapping_macros.$kw3$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)sksi_sks_mapping_macros.$sym14$CDESTRUCTURING_BIND, (SubLObject)ConsesLow.list(gather_arg, gather_mt), gather_arg_mt_pair, ConsesLow.append(body, (SubLObject)sksi_sks_mapping_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mapping-macros.lisp", position = 3082L)
    public static SubLObject do_sksi_gaf_arg_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_mapping_macros.$list21);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject gather_sentence = (SubLObject)sksi_sks_mapping_macros.NIL;
        SubLObject gather_mt = (SubLObject)sksi_sks_mapping_macros.NIL;
        SubLObject index_arg = (SubLObject)sksi_sks_mapping_macros.NIL;
        SubLObject predicate = (SubLObject)sksi_sks_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_mapping_macros.$list21);
        gather_sentence = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_mapping_macros.$list21);
        gather_mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_mapping_macros.$list21);
        index_arg = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_mapping_macros.$list21);
        predicate = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)sksi_sks_mapping_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)sksi_sks_mapping_macros.NIL;
        SubLObject current_$4 = (SubLObject)sksi_sks_mapping_macros.NIL;
        while (sksi_sks_mapping_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sksi_sks_mapping_macros.$list21);
            current_$4 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sksi_sks_mapping_macros.$list21);
            if (sksi_sks_mapping_macros.NIL == conses_high.member(current_$4, (SubLObject)sksi_sks_mapping_macros.$list22, (SubLObject)sksi_sks_mapping_macros.UNPROVIDED, (SubLObject)sksi_sks_mapping_macros.UNPROVIDED)) {
                bad = (SubLObject)sksi_sks_mapping_macros.T;
            }
            if (current_$4 == sksi_sks_mapping_macros.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (sksi_sks_mapping_macros.NIL != bad && sksi_sks_mapping_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_sks_mapping_macros.$list21);
        }
        final SubLObject index_argnum_tail = cdestructuring_bind.property_list_member((SubLObject)sksi_sks_mapping_macros.$kw18$INDEX_ARGNUM, current);
        final SubLObject index_argnum = (SubLObject)((sksi_sks_mapping_macros.NIL != index_argnum_tail) ? conses_high.cadr(index_argnum_tail) : sksi_sks_mapping_macros.ONE_INTEGER);
        final SubLObject truth_tail = cdestructuring_bind.property_list_member((SubLObject)sksi_sks_mapping_macros.$kw10$TRUTH, current);
        final SubLObject truth = (SubLObject)((sksi_sks_mapping_macros.NIL != truth_tail) ? conses_high.cadr(truth_tail) : sksi_sks_mapping_macros.$kw11$TRUE);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)sksi_sks_mapping_macros.$kw3$DONE, current);
        final SubLObject done = (SubLObject)((sksi_sks_mapping_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : sksi_sks_mapping_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject gather_sentence_mt_pair = (SubLObject)sksi_sks_mapping_macros.$sym23$GATHER_SENTENCE_MT_PAIR;
        return (SubLObject)ConsesLow.list((SubLObject)sksi_sks_mapping_macros.$sym5$DO_LIST, (SubLObject)ConsesLow.list(gather_sentence_mt_pair, (SubLObject)ConsesLow.list((SubLObject)sksi_sks_mapping_macros.$sym24$GATHER_SKSI_GAF_ARG_INDEX, index_arg, index_argnum, predicate, truth), (SubLObject)sksi_sks_mapping_macros.$kw3$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)sksi_sks_mapping_macros.$sym14$CDESTRUCTURING_BIND, (SubLObject)ConsesLow.list(gather_sentence, gather_mt), gather_sentence_mt_pair, ConsesLow.append(body, (SubLObject)sksi_sks_mapping_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mapping-macros.lisp", position = 3604L)
    public static SubLObject do_sksi_gaf_arg_index_gp(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_mapping_macros.$list21);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject gather_sentence = (SubLObject)sksi_sks_mapping_macros.NIL;
        SubLObject gather_mt = (SubLObject)sksi_sks_mapping_macros.NIL;
        SubLObject index_arg = (SubLObject)sksi_sks_mapping_macros.NIL;
        SubLObject predicate = (SubLObject)sksi_sks_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_mapping_macros.$list21);
        gather_sentence = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_mapping_macros.$list21);
        gather_mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_mapping_macros.$list21);
        index_arg = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_mapping_macros.$list21);
        predicate = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)sksi_sks_mapping_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)sksi_sks_mapping_macros.NIL;
        SubLObject current_$5 = (SubLObject)sksi_sks_mapping_macros.NIL;
        while (sksi_sks_mapping_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sksi_sks_mapping_macros.$list21);
            current_$5 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sksi_sks_mapping_macros.$list21);
            if (sksi_sks_mapping_macros.NIL == conses_high.member(current_$5, (SubLObject)sksi_sks_mapping_macros.$list22, (SubLObject)sksi_sks_mapping_macros.UNPROVIDED, (SubLObject)sksi_sks_mapping_macros.UNPROVIDED)) {
                bad = (SubLObject)sksi_sks_mapping_macros.T;
            }
            if (current_$5 == sksi_sks_mapping_macros.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (sksi_sks_mapping_macros.NIL != bad && sksi_sks_mapping_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_sks_mapping_macros.$list21);
        }
        final SubLObject index_argnum_tail = cdestructuring_bind.property_list_member((SubLObject)sksi_sks_mapping_macros.$kw18$INDEX_ARGNUM, current);
        final SubLObject index_argnum = (SubLObject)((sksi_sks_mapping_macros.NIL != index_argnum_tail) ? conses_high.cadr(index_argnum_tail) : sksi_sks_mapping_macros.ONE_INTEGER);
        final SubLObject truth_tail = cdestructuring_bind.property_list_member((SubLObject)sksi_sks_mapping_macros.$kw10$TRUTH, current);
        final SubLObject truth = (SubLObject)((sksi_sks_mapping_macros.NIL != truth_tail) ? conses_high.cadr(truth_tail) : sksi_sks_mapping_macros.$kw11$TRUE);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)sksi_sks_mapping_macros.$kw3$DONE, current);
        final SubLObject done = (SubLObject)((sksi_sks_mapping_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : sksi_sks_mapping_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject gather_sentence_mt_pair = (SubLObject)sksi_sks_mapping_macros.$sym25$GATHER_SENTENCE_MT_PAIR;
        return (SubLObject)ConsesLow.list((SubLObject)sksi_sks_mapping_macros.$sym26$WITH_ALL_SPEC_PREDICATES_AND_INVERSES, predicate, (SubLObject)ConsesLow.list((SubLObject)sksi_sks_mapping_macros.$sym5$DO_LIST, (SubLObject)ConsesLow.list(gather_sentence_mt_pair, (SubLObject)ConsesLow.list((SubLObject)sksi_sks_mapping_macros.$sym24$GATHER_SKSI_GAF_ARG_INDEX, index_arg, index_argnum, predicate, truth), (SubLObject)sksi_sks_mapping_macros.$kw3$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)sksi_sks_mapping_macros.$sym14$CDESTRUCTURING_BIND, (SubLObject)ConsesLow.list(gather_sentence, gather_mt), gather_sentence_mt_pair, ConsesLow.append(body, (SubLObject)sksi_sks_mapping_macros.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mapping-macros.lisp", position = 4192L)
    public static SubLObject do_sksi_gaf_arg_index_values_gp(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_mapping_macros.$list15);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject gather_arg = (SubLObject)sksi_sks_mapping_macros.NIL;
        SubLObject gather_mt = (SubLObject)sksi_sks_mapping_macros.NIL;
        SubLObject index_arg = (SubLObject)sksi_sks_mapping_macros.NIL;
        SubLObject predicate = (SubLObject)sksi_sks_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_mapping_macros.$list15);
        gather_arg = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_mapping_macros.$list15);
        gather_mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_mapping_macros.$list15);
        index_arg = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_mapping_macros.$list15);
        predicate = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)sksi_sks_mapping_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)sksi_sks_mapping_macros.NIL;
        SubLObject current_$6 = (SubLObject)sksi_sks_mapping_macros.NIL;
        while (sksi_sks_mapping_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sksi_sks_mapping_macros.$list15);
            current_$6 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sksi_sks_mapping_macros.$list15);
            if (sksi_sks_mapping_macros.NIL == conses_high.member(current_$6, (SubLObject)sksi_sks_mapping_macros.$list16, (SubLObject)sksi_sks_mapping_macros.UNPROVIDED, (SubLObject)sksi_sks_mapping_macros.UNPROVIDED)) {
                bad = (SubLObject)sksi_sks_mapping_macros.T;
            }
            if (current_$6 == sksi_sks_mapping_macros.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (sksi_sks_mapping_macros.NIL != bad && sksi_sks_mapping_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_sks_mapping_macros.$list15);
        }
        final SubLObject gather_argnum_tail = cdestructuring_bind.property_list_member((SubLObject)sksi_sks_mapping_macros.$kw17$GATHER_ARGNUM, current);
        final SubLObject gather_argnum = (SubLObject)((sksi_sks_mapping_macros.NIL != gather_argnum_tail) ? conses_high.cadr(gather_argnum_tail) : sksi_sks_mapping_macros.TWO_INTEGER);
        final SubLObject index_argnum_tail = cdestructuring_bind.property_list_member((SubLObject)sksi_sks_mapping_macros.$kw18$INDEX_ARGNUM, current);
        final SubLObject index_argnum = (SubLObject)((sksi_sks_mapping_macros.NIL != index_argnum_tail) ? conses_high.cadr(index_argnum_tail) : sksi_sks_mapping_macros.ONE_INTEGER);
        final SubLObject truth_tail = cdestructuring_bind.property_list_member((SubLObject)sksi_sks_mapping_macros.$kw10$TRUTH, current);
        final SubLObject truth = (SubLObject)((sksi_sks_mapping_macros.NIL != truth_tail) ? conses_high.cadr(truth_tail) : sksi_sks_mapping_macros.$kw11$TRUE);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)sksi_sks_mapping_macros.$kw3$DONE, current);
        final SubLObject done = (SubLObject)((sksi_sks_mapping_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : sksi_sks_mapping_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject spec_pred = (SubLObject)sksi_sks_mapping_macros.$sym27$SPEC_PRED;
        final SubLObject inverse_modeP = (SubLObject)sksi_sks_mapping_macros.$sym28$INVERSE_MODE_;
        final SubLObject new_gather_argnum = (SubLObject)sksi_sks_mapping_macros.$sym29$NEW_GATHER_ARGNUM;
        final SubLObject new_index_argnum = (SubLObject)sksi_sks_mapping_macros.$sym30$NEW_INDEX_ARGNUM;
        return (SubLObject)ConsesLow.list((SubLObject)sksi_sks_mapping_macros.$sym31$PROGN, (SubLObject)ConsesLow.list((SubLObject)sksi_sks_mapping_macros.$sym32$DO_ALL_SPEC_PREDICATES_AND_INVERSES, (SubLObject)ConsesLow.list(spec_pred, inverse_modeP, predicate), (SubLObject)ConsesLow.list((SubLObject)sksi_sks_mapping_macros.$sym7$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new_gather_argnum, (SubLObject)ConsesLow.list((SubLObject)sksi_sks_mapping_macros.$sym33$FIF, inverse_modeP, index_argnum, gather_argnum)), (SubLObject)ConsesLow.list(new_index_argnum, (SubLObject)ConsesLow.list((SubLObject)sksi_sks_mapping_macros.$sym33$FIF, inverse_modeP, gather_argnum, index_argnum))), (SubLObject)ConsesLow.listS((SubLObject)sksi_sks_mapping_macros.$sym34$DO_SKSI_GAF_ARG_INDEX_VALUES, (SubLObject)ConsesLow.list(new SubLObject[] { gather_arg, gather_mt, index_arg, spec_pred, sksi_sks_mapping_macros.$kw17$GATHER_ARGNUM, new_gather_argnum, sksi_sks_mapping_macros.$kw18$INDEX_ARGNUM, new_index_argnum, sksi_sks_mapping_macros.$kw10$TRUTH, truth, sksi_sks_mapping_macros.$kw3$DONE, done }), ConsesLow.append(body, (SubLObject)sksi_sks_mapping_macros.NIL)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mapping-macros.lisp", position = 5028L)
    public static SubLObject do_sksi_gaf_arg_index_values_relevant_pred(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_mapping_macros.$list35);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject gather_arg = (SubLObject)sksi_sks_mapping_macros.NIL;
        SubLObject gather_mt = (SubLObject)sksi_sks_mapping_macros.NIL;
        SubLObject gather_pred = (SubLObject)sksi_sks_mapping_macros.NIL;
        SubLObject index_arg = (SubLObject)sksi_sks_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_mapping_macros.$list35);
        gather_arg = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_mapping_macros.$list35);
        gather_mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_mapping_macros.$list35);
        gather_pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_mapping_macros.$list35);
        index_arg = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)sksi_sks_mapping_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)sksi_sks_mapping_macros.NIL;
        SubLObject current_$7 = (SubLObject)sksi_sks_mapping_macros.NIL;
        while (sksi_sks_mapping_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sksi_sks_mapping_macros.$list35);
            current_$7 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sksi_sks_mapping_macros.$list35);
            if (sksi_sks_mapping_macros.NIL == conses_high.member(current_$7, (SubLObject)sksi_sks_mapping_macros.$list16, (SubLObject)sksi_sks_mapping_macros.UNPROVIDED, (SubLObject)sksi_sks_mapping_macros.UNPROVIDED)) {
                bad = (SubLObject)sksi_sks_mapping_macros.T;
            }
            if (current_$7 == sksi_sks_mapping_macros.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (sksi_sks_mapping_macros.NIL != bad && sksi_sks_mapping_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_sks_mapping_macros.$list35);
        }
        final SubLObject gather_argnum_tail = cdestructuring_bind.property_list_member((SubLObject)sksi_sks_mapping_macros.$kw17$GATHER_ARGNUM, current);
        final SubLObject gather_argnum = (SubLObject)((sksi_sks_mapping_macros.NIL != gather_argnum_tail) ? conses_high.cadr(gather_argnum_tail) : sksi_sks_mapping_macros.TWO_INTEGER);
        final SubLObject index_argnum_tail = cdestructuring_bind.property_list_member((SubLObject)sksi_sks_mapping_macros.$kw18$INDEX_ARGNUM, current);
        final SubLObject index_argnum = (SubLObject)((sksi_sks_mapping_macros.NIL != index_argnum_tail) ? conses_high.cadr(index_argnum_tail) : sksi_sks_mapping_macros.ONE_INTEGER);
        final SubLObject truth_tail = cdestructuring_bind.property_list_member((SubLObject)sksi_sks_mapping_macros.$kw10$TRUTH, current);
        final SubLObject truth = (SubLObject)((sksi_sks_mapping_macros.NIL != truth_tail) ? conses_high.cadr(truth_tail) : sksi_sks_mapping_macros.$kw11$TRUE);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)sksi_sks_mapping_macros.$kw3$DONE, current);
        final SubLObject done = (SubLObject)((sksi_sks_mapping_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : sksi_sks_mapping_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject gather_arg_mt_pred_tuple = (SubLObject)sksi_sks_mapping_macros.$sym36$GATHER_ARG_MT_PRED_TUPLE;
        return (SubLObject)ConsesLow.list((SubLObject)sksi_sks_mapping_macros.$sym5$DO_LIST, (SubLObject)ConsesLow.list(gather_arg_mt_pred_tuple, (SubLObject)ConsesLow.list((SubLObject)sksi_sks_mapping_macros.$sym37$GATHER_SKSI_GAF_ARG_INDEX_VALUES_RELEVANT_PRED, index_arg, index_argnum, gather_argnum, truth), (SubLObject)sksi_sks_mapping_macros.$kw3$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)sksi_sks_mapping_macros.$sym14$CDESTRUCTURING_BIND, (SubLObject)ConsesLow.list(gather_arg, gather_mt, gather_pred), gather_arg_mt_pred_tuple, ConsesLow.append(body, (SubLObject)sksi_sks_mapping_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mapping-macros.lisp", position = 5631L)
    public static SubLObject do_sksi_gaf_arg_index_relevant_pred(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_mapping_macros.$list38);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject gather_sentence = (SubLObject)sksi_sks_mapping_macros.NIL;
        SubLObject gather_mt = (SubLObject)sksi_sks_mapping_macros.NIL;
        SubLObject index_arg = (SubLObject)sksi_sks_mapping_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_mapping_macros.$list38);
        gather_sentence = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_mapping_macros.$list38);
        gather_mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_mapping_macros.$list38);
        index_arg = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)sksi_sks_mapping_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)sksi_sks_mapping_macros.NIL;
        SubLObject current_$8 = (SubLObject)sksi_sks_mapping_macros.NIL;
        while (sksi_sks_mapping_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sksi_sks_mapping_macros.$list38);
            current_$8 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sksi_sks_mapping_macros.$list38);
            if (sksi_sks_mapping_macros.NIL == conses_high.member(current_$8, (SubLObject)sksi_sks_mapping_macros.$list22, (SubLObject)sksi_sks_mapping_macros.UNPROVIDED, (SubLObject)sksi_sks_mapping_macros.UNPROVIDED)) {
                bad = (SubLObject)sksi_sks_mapping_macros.T;
            }
            if (current_$8 == sksi_sks_mapping_macros.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (sksi_sks_mapping_macros.NIL != bad && sksi_sks_mapping_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_sks_mapping_macros.$list38);
        }
        final SubLObject index_argnum_tail = cdestructuring_bind.property_list_member((SubLObject)sksi_sks_mapping_macros.$kw18$INDEX_ARGNUM, current);
        final SubLObject index_argnum = (SubLObject)((sksi_sks_mapping_macros.NIL != index_argnum_tail) ? conses_high.cadr(index_argnum_tail) : sksi_sks_mapping_macros.ONE_INTEGER);
        final SubLObject truth_tail = cdestructuring_bind.property_list_member((SubLObject)sksi_sks_mapping_macros.$kw10$TRUTH, current);
        final SubLObject truth = (SubLObject)((sksi_sks_mapping_macros.NIL != truth_tail) ? conses_high.cadr(truth_tail) : sksi_sks_mapping_macros.$kw11$TRUE);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)sksi_sks_mapping_macros.$kw3$DONE, current);
        final SubLObject done = (SubLObject)((sksi_sks_mapping_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : sksi_sks_mapping_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject gather_sentence_mt_pair = (SubLObject)sksi_sks_mapping_macros.$sym39$GATHER_SENTENCE_MT_PAIR;
        return (SubLObject)ConsesLow.list((SubLObject)sksi_sks_mapping_macros.$sym5$DO_LIST, (SubLObject)ConsesLow.list(gather_sentence_mt_pair, (SubLObject)ConsesLow.list((SubLObject)sksi_sks_mapping_macros.$sym40$GATHER_SKSI_GAF_ARG_INDEX_RELEVANT_PRED, index_arg, index_argnum, truth), (SubLObject)sksi_sks_mapping_macros.$kw3$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)sksi_sks_mapping_macros.$sym14$CDESTRUCTURING_BIND, (SubLObject)ConsesLow.list(gather_sentence, gather_mt), gather_sentence_mt_pair, ConsesLow.append(body, (SubLObject)sksi_sks_mapping_macros.NIL)));
    }
    
    public static SubLObject declare_sksi_sks_mapping_macros_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mapping_macros", "do_sksi_gaf_lookup_index", "DO-SKSI-GAF-LOOKUP-INDEX");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mapping_macros", "do_sksi_predicate_extent_index", "DO-SKSI-PREDICATE-EXTENT-INDEX");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mapping_macros", "do_sksi_gaf_arg_index_values", "DO-SKSI-GAF-ARG-INDEX-VALUES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mapping_macros", "do_sksi_gaf_arg_index", "DO-SKSI-GAF-ARG-INDEX");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mapping_macros", "do_sksi_gaf_arg_index_gp", "DO-SKSI-GAF-ARG-INDEX-GP");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mapping_macros", "do_sksi_gaf_arg_index_values_gp", "DO-SKSI-GAF-ARG-INDEX-VALUES-GP");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mapping_macros", "do_sksi_gaf_arg_index_values_relevant_pred", "DO-SKSI-GAF-ARG-INDEX-VALUES-RELEVANT-PRED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mapping_macros", "do_sksi_gaf_arg_index_relevant_pred", "DO-SKSI-GAF-ARG-INDEX-RELEVANT-PRED");
        return (SubLObject)sksi_sks_mapping_macros.NIL;
    }
    
    public static SubLObject init_sksi_sks_mapping_macros_file() {
        return (SubLObject)sksi_sks_mapping_macros.NIL;
    }
    
    public static SubLObject setup_sksi_sks_mapping_macros_file() {
        return (SubLObject)sksi_sks_mapping_macros.NIL;
    }
    
    public void declareFunctions() {
        declare_sksi_sks_mapping_macros_file();
    }
    
    public void initializeVariables() {
        init_sksi_sks_mapping_macros_file();
    }
    
    public void runTopLevelForms() {
        setup_sksi_sks_mapping_macros_file();
    }
    
    static {
        me = (SubLFile)new sksi_sks_mapping_macros();
        $list0 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUPPORT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"), (SubLObject)SubLObjectFactory.makeSymbol("SENSE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw2$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw3$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym4$SUPPORT = SubLObjectFactory.makeUninternedSymbol("SUPPORT");
        $sym5$DO_LIST = SubLObjectFactory.makeSymbol("DO-LIST");
        $sym6$GATHER_SKSI_GAF_LOOKUP_INDEX = SubLObjectFactory.makeSymbol("GATHER-SKSI-GAF-LOOKUP-INDEX");
        $sym7$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list8 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GATHER-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("GATHER-MT"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE")), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TRUTH"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw10$TRUTH = SubLObjectFactory.makeKeyword("TRUTH");
        $kw11$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $sym12$GATHER_SENTENCE_MT_PAIR = SubLObjectFactory.makeUninternedSymbol("GATHER-SENTENCE-MT-PAIR");
        $sym13$GATHER_SKSI_PREDICATE_EXTENT_INDEX = SubLObjectFactory.makeSymbol("GATHER-SKSI-PREDICATE-EXTENT-INDEX");
        $sym14$CDESTRUCTURING_BIND = SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND");
        $list15 = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("GATHER-ARG"), SubLObjectFactory.makeSymbol("GATHER-MT"), SubLObjectFactory.makeSymbol("INDEX-ARG"), SubLObjectFactory.makeSymbol("PREDICATE"), SubLObjectFactory.makeSymbol("&KEY"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GATHER-ARGNUM"), (SubLObject)sksi_sks_mapping_macros.TWO_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-ARGNUM"), (SubLObject)sksi_sks_mapping_macros.ONE_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE")), SubLObjectFactory.makeSymbol("DONE") }), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list16 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("GATHER-ARGNUM"), (SubLObject)SubLObjectFactory.makeKeyword("INDEX-ARGNUM"), (SubLObject)SubLObjectFactory.makeKeyword("TRUTH"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw17$GATHER_ARGNUM = SubLObjectFactory.makeKeyword("GATHER-ARGNUM");
        $kw18$INDEX_ARGNUM = SubLObjectFactory.makeKeyword("INDEX-ARGNUM");
        $sym19$GATHER_ARG_MT_PAIR = SubLObjectFactory.makeUninternedSymbol("GATHER-ARG-MT-PAIR");
        $sym20$GATHER_SKSI_GAF_ARG_INDEX_VALUES = SubLObjectFactory.makeSymbol("GATHER-SKSI-GAF-ARG-INDEX-VALUES");
        $list21 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GATHER-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("GATHER-MT"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX-ARG"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-ARGNUM"), (SubLObject)sksi_sks_mapping_macros.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE")), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INDEX-ARGNUM"), (SubLObject)SubLObjectFactory.makeKeyword("TRUTH"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $sym23$GATHER_SENTENCE_MT_PAIR = SubLObjectFactory.makeUninternedSymbol("GATHER-SENTENCE-MT-PAIR");
        $sym24$GATHER_SKSI_GAF_ARG_INDEX = SubLObjectFactory.makeSymbol("GATHER-SKSI-GAF-ARG-INDEX");
        $sym25$GATHER_SENTENCE_MT_PAIR = SubLObjectFactory.makeUninternedSymbol("GATHER-SENTENCE-MT-PAIR");
        $sym26$WITH_ALL_SPEC_PREDICATES_AND_INVERSES = SubLObjectFactory.makeSymbol("WITH-ALL-SPEC-PREDICATES-AND-INVERSES");
        $sym27$SPEC_PRED = SubLObjectFactory.makeUninternedSymbol("SPEC-PRED");
        $sym28$INVERSE_MODE_ = SubLObjectFactory.makeUninternedSymbol("INVERSE-MODE?");
        $sym29$NEW_GATHER_ARGNUM = SubLObjectFactory.makeUninternedSymbol("NEW-GATHER-ARGNUM");
        $sym30$NEW_INDEX_ARGNUM = SubLObjectFactory.makeUninternedSymbol("NEW-INDEX-ARGNUM");
        $sym31$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym32$DO_ALL_SPEC_PREDICATES_AND_INVERSES = SubLObjectFactory.makeSymbol("DO-ALL-SPEC-PREDICATES-AND-INVERSES");
        $sym33$FIF = SubLObjectFactory.makeSymbol("FIF");
        $sym34$DO_SKSI_GAF_ARG_INDEX_VALUES = SubLObjectFactory.makeSymbol("DO-SKSI-GAF-ARG-INDEX-VALUES");
        $list35 = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("GATHER-ARG"), SubLObjectFactory.makeSymbol("GATHER-MT"), SubLObjectFactory.makeSymbol("GATHER-PRED"), SubLObjectFactory.makeSymbol("INDEX-ARG"), SubLObjectFactory.makeSymbol("&KEY"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GATHER-ARGNUM"), (SubLObject)sksi_sks_mapping_macros.TWO_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-ARGNUM"), (SubLObject)sksi_sks_mapping_macros.ONE_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE")), SubLObjectFactory.makeSymbol("DONE") }), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym36$GATHER_ARG_MT_PRED_TUPLE = SubLObjectFactory.makeUninternedSymbol("GATHER-ARG-MT-PRED-TUPLE");
        $sym37$GATHER_SKSI_GAF_ARG_INDEX_VALUES_RELEVANT_PRED = SubLObjectFactory.makeSymbol("GATHER-SKSI-GAF-ARG-INDEX-VALUES-RELEVANT-PRED");
        $list38 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GATHER-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("GATHER-MT"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX-ARG"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-ARGNUM"), (SubLObject)sksi_sks_mapping_macros.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE")), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym39$GATHER_SENTENCE_MT_PAIR = SubLObjectFactory.makeUninternedSymbol("GATHER-SENTENCE-MT-PAIR");
        $sym40$GATHER_SKSI_GAF_ARG_INDEX_RELEVANT_PRED = SubLObjectFactory.makeSymbol("GATHER-SKSI-GAF-ARG-INDEX-RELEVANT-PRED");
    }
}

/*

	Total time: 125 ms
	
*/