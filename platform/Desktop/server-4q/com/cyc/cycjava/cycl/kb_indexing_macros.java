package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class kb_indexing_macros extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.kb_indexing_macros";
    public static final String myFingerPrint = "69229065429c80d66beaac88df5c91ed11ad4af0f9e68f45fed06149277dfee1";
    private static final SubLList $list0;
    private static final SubLSymbol $kw1$SIMPLE_MATCH_FUNCTION;
    private static final SubLSymbol $kw2$GET_SUBINDEX_FUNCTION;
    private static final SubLSymbol $sym3$COUNT;
    private static final SubLSymbol $sym4$ASS;
    private static final SubLSymbol $sym5$PIF;
    private static final SubLSymbol $sym6$SIMPLE_INDEXED_TERM_P;
    private static final SubLSymbol $sym7$CLET;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$DO_SIMPLE_INDEX;
    private static final SubLSymbol $sym10$PWHEN;
    private static final SubLSymbol $sym11$CINC;
    private static final SubLSymbol $sym12$CSETQ;
    private static final SubLSymbol $sym13$SUBINDEX;
    private static final SubLList $list14;
    private static final SubLSymbol $sym15$SET_RELEVANT_SIMPLE_INDEX_COUNT;
    private static final SubLSymbol $sym16$SET_RELEVANT_NUM_ARBITRARY_INDEX;
    private static final SubLList $list17;
    private static final SubLSymbol $sym18$ASS;
    private static final SubLList $list19;
    private static final SubLSymbol $sym20$SET_RELEVANT_COMPLEX_INDEX_COUNT;
    private static final SubLSymbol $kw21$KEY_FUNCTION;
    private static final SubLSymbol $kw22$RELEVANT_NUM_FUNCTION;
    private static final SubLString $str23$SET_RELEVANT_COMPLEX_INDEX_COUNT_;
    private static final SubLString $str24$SET_RELEVANT_COMPLEX_INDEX_COUNT_;
    private static final SubLSymbol $sym25$GOOD_KEY_COUNT;
    private static final SubLSymbol $sym26$GOOD_KEYS;
    private static final SubLSymbol $sym27$MT_SUBINDEX;
    private static final SubLSymbol $sym28$NEXT_LEVEL_KEYS;
    private static final SubLSymbol $sym29$NEXT_KEY;
    private static final SubLSymbol $sym30$NUMBER_OF_NON_NULL_ARGS_IN_ORDER;
    private static final SubLSymbol $sym31$_;
    private static final SubLSymbol $sym32$_;
    private static final SubLList $list33;
    private static final SubLSymbol $sym34$RELEVANT_MT_SUBINDEX_COUNT;
    private static final SubLSymbol $sym35$LIST_OF_FIRST_N_ARGS;
    private static final SubLSymbol $sym36$APPLY;
    private static final SubLSymbol $sym37$QUOTE;
    private static final SubLSymbol $sym38$CDOLIST;
    private static final SubLSymbol $sym39$APPEND;
    private static final SubLSymbol $sym40$LIST;
    private static final SubLSymbol $kw41$NUM_FUNCTION;
    private static final SubLList $list42;
    private static final SubLSymbol $sym43$SET_RELEVANT_SIMPLE_INDEX_COUNT_WITH_CUTOFF;
    private static final SubLList $list44;
    private static final SubLSymbol $sym45$PUNLESS;
    private static final SubLSymbol $sym46$NUMBER_HAS_REACHED_CUTOFF_;
    private static final SubLSymbol $sym47$SET_RELEVANT_COMPLEX_INDEX_COUNT_WITH_CUTOFF;
    private static final SubLList $list48;
    private static final SubLSymbol $kw49$RELEVANT_NUM_FUNCTION_WITH_CUTOFF;
    private static final SubLString $str50$SET_RELEVANT_COMPLEX_INDEX_COUNT_;
    private static final SubLString $str51$SET_RELEVANT_COMPLEX_INDEX_COUNT_;
    private static final SubLSymbol $sym52$GOOD_KEY_COUNT;
    private static final SubLSymbol $sym53$GOOD_KEYS;
    private static final SubLSymbol $sym54$MT_SUBINDEX;
    private static final SubLSymbol $sym55$NEXT_LEVEL_KEYS;
    private static final SubLSymbol $sym56$NEXT_KEY;
    private static final SubLSymbol $sym57$RELEVANT_MT_SUBINDEX_COUNT_WITH_CUTOFF;
    private static final SubLSymbol $sym58$PROGN;
    private static final SubLSymbol $kw59$SIMPLE_KEY_FUNCTION;
    private static final SubLSymbol $sym60$KEYS_ACCUM;
    private static final SubLSymbol $sym61$ASS;
    private static final SubLList $list62;
    private static final SubLSymbol $sym63$NEXT_LEVEL_SUBINDEX;
    private static final SubLList $list64;
    private static final SubLSymbol $sym65$SET_RELEVANT_KEY_SIMPLE_INDEX;
    private static final SubLSymbol $sym66$SET_RELEVANT_KEY_ARBITRARY_INDEX;
    private static final SubLSymbol $sym67$KEYS_ACCUM;
    private static final SubLSymbol $sym68$ASS;
    private static final SubLSymbol $sym69$RELEVANT_MT_;
    private static final SubLSymbol $sym70$ASSERTION_MT;
    private static final SubLSymbol $sym71$SET_RELEVANT_KEY_COMPLEX_INDEX;
    private static final SubLSymbol $sym72$GOOD_KEY_COUNT;
    private static final SubLSymbol $sym73$GOOD_KEYS;
    private static final SubLSymbol $sym74$MT_SUBINDEX;
    private static final SubLSymbol $sym75$NEXT_LEVEL_KEYS;
    private static final SubLSymbol $sym76$NEXT_KEY;
    private static final SubLSymbol $sym77$RELEVANT_MT_SUBINDEX_KEYS;
    private static final SubLSymbol $sym78$PLUSP;
    private static final SubLSymbol $sym79$CPUSH;
    private static final SubLSymbol $sym80$MT_KEY_LEVEL;
    private static final SubLSymbol $kw81$KEYS;
    private static final SubLSymbol $kw82$MT_;
    private static final SubLList $list83;
    private static final SubLList $list84;
    private static final SubLSymbol $kw85$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw86$DONE;
    private static final SubLSymbol $sym87$DO_INTERMEDIATE_INDEX;
    private static final SubLSymbol $sym88$TERM_GAF_ARG_INDEX;
    private static final SubLSymbol $sym89$VALID_GAF_ARG_INDEX_KEY_;
    private static final SubLList $list90;
    private static final SubLSymbol $sym91$SUBINDEX;
    private static final SubLSymbol $sym92$DO_GAF_ARG_INDICES;
    private static final SubLSymbol $sym93$IGNORE;
    private static final SubLSymbol $kw94$GAF_ARG;
    private static final SubLSymbol $sym95$TERM_NART_ARG_INDEX;
    private static final SubLSymbol $sym96$VALID_NART_ARG_INDEX_KEY_;
    private static final SubLSymbol $sym97$SUBINDEX;
    private static final SubLSymbol $sym98$DO_NART_ARG_INDICES;
    private static final SubLSymbol $kw99$NART_ARG;
    private static final SubLList $list100;
    private static final SubLSymbol $sym101$TERM_PREDICATE_RULE_INDEX;
    private static final SubLSymbol $sym102$VALID_PREDICATE_RULE_INDEX_KEY_;
    private static final SubLList $list103;
    private static final SubLSymbol $sym104$SUBINDEX;
    private static final SubLSymbol $sym105$DO_PREDICATE_RULE_INDICES;
    private static final SubLSymbol $kw106$PREDICATE_RULE;
    private static final SubLSymbol $sym107$TERM_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX;
    private static final SubLSymbol $sym108$SUBINDEX;
    private static final SubLSymbol $sym109$DO_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDICES;
    private static final SubLSymbol $kw110$DECONTEXTUALIZED_IST_PREDICATE_RULE;
    private static final SubLSymbol $sym111$VALID_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX_KEY_;
    private static final SubLList $list112;
    private static final SubLSymbol $sym113$TERM_ISA_RULE_INDEX;
    private static final SubLSymbol $sym114$VALID_ISA_RULE_INDEX_KEY_;
    private static final SubLList $list115;
    private static final SubLSymbol $sym116$SUBINDEX;
    private static final SubLSymbol $sym117$DO_ISA_RULE_INDICES;
    private static final SubLSymbol $kw118$ISA_RULE;
    private static final SubLSymbol $sym119$TERM_GENLS_RULE_INDEX;
    private static final SubLSymbol $sym120$VALID_GENLS_RULE_INDEX_KEY_;
    private static final SubLSymbol $sym121$SUBINDEX;
    private static final SubLSymbol $sym122$DO_GENLS_RULE_INDICES;
    private static final SubLSymbol $kw123$GENLS_RULE;
    private static final SubLSymbol $sym124$TERM_GENL_MT_RULE_INDEX;
    private static final SubLSymbol $sym125$VALID_GENL_MT_RULE_INDEX_KEY_;
    private static final SubLSymbol $sym126$SUBINDEX;
    private static final SubLSymbol $sym127$DO_GENL_MT_RULE_INDICES;
    private static final SubLSymbol $kw128$GENL_MT_RULE;
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 522L)
    public static SubLObject set_num_arbitrary_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject result = (SubLObject)kb_indexing_macros.NIL;
        SubLObject index = (SubLObject)kb_indexing_macros.NIL;
        SubLObject v_term = (SubLObject)kb_indexing_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list0);
        result = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list0);
        index = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list0);
        v_term = current.first();
        final SubLObject keys;
        current = (keys = current.rest());
        final SubLObject simple_match_function = kb_indexing_declarations.get_index_prop(index, (SubLObject)kb_indexing_macros.$kw1$SIMPLE_MATCH_FUNCTION);
        final SubLObject get_subindex_function = kb_indexing_declarations.get_index_prop(index, (SubLObject)kb_indexing_macros.$kw2$GET_SUBINDEX_FUNCTION);
        final SubLObject count = (SubLObject)kb_indexing_macros.$sym3$COUNT;
        final SubLObject ass = (SubLObject)kb_indexing_macros.$sym4$ASS;
        return (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym5$PIF, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym6$SIMPLE_INDEXED_TERM_P, v_term), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym7$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(count, (SubLObject)kb_indexing_macros.$list8)), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym9$DO_SIMPLE_INDEX, (SubLObject)ConsesLow.list(ass, v_term), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym10$PWHEN, (SubLObject)ConsesLow.listS(simple_match_function, ass, v_term, ConsesLow.append(keys, (SubLObject)kb_indexing_macros.NIL)), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym11$CINC, count))), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym12$CSETQ, result, count)), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym7$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym13$SUBINDEX, (SubLObject)ConsesLow.listS(get_subindex_function, v_term, ConsesLow.append(keys, (SubLObject)kb_indexing_macros.NIL)))), (SubLObject)ConsesLow.listS((SubLObject)kb_indexing_macros.$sym12$CSETQ, result, (SubLObject)kb_indexing_macros.$list14)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 1483L)
    public static SubLObject set_relevant_simple_index_count(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject count_var = (SubLObject)kb_indexing_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list17);
        count_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list17);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject function = (SubLObject)kb_indexing_macros.NIL;
        SubLObject v_term = (SubLObject)kb_indexing_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list17);
        function = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list17);
        v_term = current.first();
        final SubLObject args;
        current = (args = current.rest());
        current = temp;
        if (kb_indexing_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym9$DO_SIMPLE_INDEX, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym18$ASS, v_term), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym10$PWHEN, (SubLObject)ConsesLow.listS(function, (SubLObject)kb_indexing_macros.$sym18$ASS, v_term, ConsesLow.append(args, (SubLObject)kb_indexing_macros.NIL)), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym10$PWHEN, (SubLObject)kb_indexing_macros.$list19, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym11$CINC, count_var))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_indexing_macros.$list17);
        return (SubLObject)kb_indexing_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 2014L)
    public static SubLObject set_relevant_complex_index_count(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject result = (SubLObject)kb_indexing_macros.NIL;
        SubLObject index = (SubLObject)kb_indexing_macros.NIL;
        SubLObject v_term = (SubLObject)kb_indexing_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list0);
        result = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list0);
        index = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list0);
        v_term = current.first();
        final SubLObject keys;
        current = (keys = current.rest());
        final SubLObject get_subindex_function = kb_indexing_declarations.get_index_prop(index, (SubLObject)kb_indexing_macros.$kw2$GET_SUBINDEX_FUNCTION);
        final SubLObject key_function = kb_indexing_declarations.get_index_prop(index, (SubLObject)kb_indexing_macros.$kw21$KEY_FUNCTION);
        final SubLObject relevant_num_function = kb_indexing_declarations.get_index_prop(index, (SubLObject)kb_indexing_macros.$kw22$RELEVANT_NUM_FUNCTION);
        final SubLObject mt_key_level = mt_key_level(index);
        if (!mt_key_level.isInteger()) {
            Errors.error((SubLObject)kb_indexing_macros.$str23$SET_RELEVANT_COMPLEX_INDEX_COUNT_, index);
        }
        if (number_of_non_null_args_in_order(keys, (SubLObject)kb_indexing_macros.UNPROVIDED, (SubLObject)kb_indexing_macros.UNPROVIDED, (SubLObject)kb_indexing_macros.UNPROVIDED, (SubLObject)kb_indexing_macros.UNPROVIDED).numGE(mt_key_level)) {
            Errors.error((SubLObject)kb_indexing_macros.$str24$SET_RELEVANT_COMPLEX_INDEX_COUNT_);
        }
        final SubLObject good_key_count = (SubLObject)kb_indexing_macros.$sym25$GOOD_KEY_COUNT;
        final SubLObject good_keys = (SubLObject)kb_indexing_macros.$sym26$GOOD_KEYS;
        final SubLObject mt_subindex = (SubLObject)kb_indexing_macros.$sym27$MT_SUBINDEX;
        final SubLObject next_level_keys = (SubLObject)kb_indexing_macros.$sym28$NEXT_LEVEL_KEYS;
        final SubLObject next_key = (SubLObject)kb_indexing_macros.$sym29$NEXT_KEY;
        return (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym7$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(good_key_count, reader.bq_cons((SubLObject)kb_indexing_macros.$sym30$NUMBER_OF_NON_NULL_ARGS_IN_ORDER, ConsesLow.append(keys, (SubLObject)kb_indexing_macros.NIL)))), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym5$PIF, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym31$_, good_key_count, (SubLObject)ConsesLow.listS((SubLObject)kb_indexing_macros.$sym32$_, mt_key_level, (SubLObject)kb_indexing_macros.$list33)), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym7$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(mt_subindex, (SubLObject)ConsesLow.listS(get_subindex_function, v_term, ConsesLow.append(keys, (SubLObject)kb_indexing_macros.NIL)))), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym10$PWHEN, mt_subindex, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym12$CSETQ, result, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym34$RELEVANT_MT_SUBINDEX_COUNT, mt_subindex)))), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym7$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(good_keys, (SubLObject)ConsesLow.listS((SubLObject)kb_indexing_macros.$sym35$LIST_OF_FIRST_N_ARGS, good_key_count, ConsesLow.append(keys, (SubLObject)kb_indexing_macros.NIL))), (SubLObject)ConsesLow.list(next_level_keys, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym36$APPLY, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym37$QUOTE, key_function), v_term, good_keys))), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym38$CDOLIST, (SubLObject)ConsesLow.list(next_key, next_level_keys), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym11$CINC, result, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym36$APPLY, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym37$QUOTE, relevant_num_function), v_term, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym39$APPEND, good_keys, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym40$LIST, next_key))))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 3609L)
    public static SubLObject set_relevant_num_arbitrary_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject result = (SubLObject)kb_indexing_macros.NIL;
        SubLObject index = (SubLObject)kb_indexing_macros.NIL;
        SubLObject v_term = (SubLObject)kb_indexing_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list0);
        result = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list0);
        index = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list0);
        v_term = current.first();
        final SubLObject keys;
        current = (keys = current.rest());
        final SubLObject simple_match_function = kb_indexing_declarations.get_index_prop(index, (SubLObject)kb_indexing_macros.$kw1$SIMPLE_MATCH_FUNCTION);
        final SubLObject num_function = kb_indexing_declarations.get_index_prop(index, (SubLObject)kb_indexing_macros.$kw41$NUM_FUNCTION);
        return (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym5$PIF, (SubLObject)kb_indexing_macros.$list42, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym12$CSETQ, result, (SubLObject)ConsesLow.listS(num_function, v_term, ConsesLow.append(keys, (SubLObject)kb_indexing_macros.NIL))), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym5$PIF, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym6$SIMPLE_INDEXED_TERM_P, v_term), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym15$SET_RELEVANT_SIMPLE_INDEX_COUNT, result, (SubLObject)ConsesLow.listS(simple_match_function, v_term, ConsesLow.append(keys, (SubLObject)kb_indexing_macros.NIL))), (SubLObject)ConsesLow.listS((SubLObject)kb_indexing_macros.$sym20$SET_RELEVANT_COMPLEX_INDEX_COUNT, result, index, v_term, ConsesLow.append(keys, (SubLObject)kb_indexing_macros.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 4224L)
    public static SubLObject number_has_reached_cutoffP(final SubLObject number, final SubLObject cutoff) {
        return Numbers.numGE(number, cutoff);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 4343L)
    public static SubLObject set_relevant_simple_index_count_with_cutoff(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject count_var = (SubLObject)kb_indexing_macros.NIL;
        SubLObject cutoff = (SubLObject)kb_indexing_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list44);
        count_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list44);
        cutoff = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list44);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject function = (SubLObject)kb_indexing_macros.NIL;
        SubLObject v_term = (SubLObject)kb_indexing_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list44);
        function = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list44);
        v_term = current.first();
        final SubLObject args;
        current = (args = current.rest());
        current = temp;
        if (kb_indexing_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym9$DO_SIMPLE_INDEX, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym18$ASS, v_term), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym45$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym46$NUMBER_HAS_REACHED_CUTOFF_, count_var, cutoff), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym10$PWHEN, (SubLObject)ConsesLow.listS(function, (SubLObject)kb_indexing_macros.$sym18$ASS, v_term, ConsesLow.append(args, (SubLObject)kb_indexing_macros.NIL)), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym10$PWHEN, (SubLObject)kb_indexing_macros.$list19, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym11$CINC, count_var)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_indexing_macros.$list44);
        return (SubLObject)kb_indexing_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 5056L)
    public static SubLObject set_relevant_complex_index_count_with_cutoff(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject result = (SubLObject)kb_indexing_macros.NIL;
        SubLObject cutoff = (SubLObject)kb_indexing_macros.NIL;
        SubLObject index = (SubLObject)kb_indexing_macros.NIL;
        SubLObject v_term = (SubLObject)kb_indexing_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list48);
        result = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list48);
        cutoff = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list48);
        index = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list48);
        v_term = current.first();
        final SubLObject keys;
        current = (keys = current.rest());
        final SubLObject get_subindex_function = kb_indexing_declarations.get_index_prop(index, (SubLObject)kb_indexing_macros.$kw2$GET_SUBINDEX_FUNCTION);
        final SubLObject key_function = kb_indexing_declarations.get_index_prop(index, (SubLObject)kb_indexing_macros.$kw21$KEY_FUNCTION);
        final SubLObject relevant_num_function_with_cutoff = kb_indexing_declarations.get_index_prop(index, (SubLObject)kb_indexing_macros.$kw49$RELEVANT_NUM_FUNCTION_WITH_CUTOFF);
        final SubLObject mt_key_level = mt_key_level(index);
        if (!mt_key_level.isInteger()) {
            Errors.error((SubLObject)kb_indexing_macros.$str50$SET_RELEVANT_COMPLEX_INDEX_COUNT_, index);
        }
        if (number_of_non_null_args_in_order(keys, (SubLObject)kb_indexing_macros.UNPROVIDED, (SubLObject)kb_indexing_macros.UNPROVIDED, (SubLObject)kb_indexing_macros.UNPROVIDED, (SubLObject)kb_indexing_macros.UNPROVIDED).numGE(mt_key_level)) {
            Errors.error((SubLObject)kb_indexing_macros.$str51$SET_RELEVANT_COMPLEX_INDEX_COUNT_);
        }
        final SubLObject good_key_count = (SubLObject)kb_indexing_macros.$sym52$GOOD_KEY_COUNT;
        final SubLObject good_keys = (SubLObject)kb_indexing_macros.$sym53$GOOD_KEYS;
        final SubLObject mt_subindex = (SubLObject)kb_indexing_macros.$sym54$MT_SUBINDEX;
        final SubLObject next_level_keys = (SubLObject)kb_indexing_macros.$sym55$NEXT_LEVEL_KEYS;
        final SubLObject next_key = (SubLObject)kb_indexing_macros.$sym56$NEXT_KEY;
        return (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym7$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(good_key_count, reader.bq_cons((SubLObject)kb_indexing_macros.$sym30$NUMBER_OF_NON_NULL_ARGS_IN_ORDER, ConsesLow.append(keys, (SubLObject)kb_indexing_macros.NIL)))), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym5$PIF, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym31$_, good_key_count, (SubLObject)ConsesLow.listS((SubLObject)kb_indexing_macros.$sym32$_, mt_key_level, (SubLObject)kb_indexing_macros.$list33)), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym7$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(mt_subindex, (SubLObject)ConsesLow.listS(get_subindex_function, v_term, ConsesLow.append(keys, (SubLObject)kb_indexing_macros.NIL)))), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym10$PWHEN, mt_subindex, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym12$CSETQ, result, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym57$RELEVANT_MT_SUBINDEX_COUNT_WITH_CUTOFF, mt_subindex, cutoff)))), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym7$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(good_keys, (SubLObject)ConsesLow.listS((SubLObject)kb_indexing_macros.$sym35$LIST_OF_FIRST_N_ARGS, good_key_count, ConsesLow.append(keys, (SubLObject)kb_indexing_macros.NIL))), (SubLObject)ConsesLow.list(next_level_keys, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym36$APPLY, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym37$QUOTE, key_function), v_term, good_keys))), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym38$CDOLIST, (SubLObject)ConsesLow.list(next_key, next_level_keys), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym11$CINC, result, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym36$APPLY, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym37$QUOTE, relevant_num_function_with_cutoff), v_term, cutoff, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym39$APPEND, good_keys, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym40$LIST, next_key))))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 6878L)
    public static SubLObject set_relevant_num_arbitrary_index_with_cutoff(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject result = (SubLObject)kb_indexing_macros.NIL;
        SubLObject cutoff = (SubLObject)kb_indexing_macros.NIL;
        SubLObject index = (SubLObject)kb_indexing_macros.NIL;
        SubLObject v_term = (SubLObject)kb_indexing_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list48);
        result = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list48);
        cutoff = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list48);
        index = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list48);
        v_term = current.first();
        final SubLObject keys;
        current = (keys = current.rest());
        final SubLObject simple_match_function = kb_indexing_declarations.get_index_prop(index, (SubLObject)kb_indexing_macros.$kw1$SIMPLE_MATCH_FUNCTION);
        final SubLObject num_function = kb_indexing_declarations.get_index_prop(index, (SubLObject)kb_indexing_macros.$kw41$NUM_FUNCTION);
        return (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym5$PIF, (SubLObject)kb_indexing_macros.$list42, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym58$PROGN, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym12$CSETQ, result, (SubLObject)ConsesLow.listS(num_function, v_term, ConsesLow.append(keys, (SubLObject)kb_indexing_macros.NIL))), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym10$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym46$NUMBER_HAS_REACHED_CUTOFF_, result, cutoff), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym12$CSETQ, result, cutoff))), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym5$PIF, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym6$SIMPLE_INDEXED_TERM_P, v_term), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym43$SET_RELEVANT_SIMPLE_INDEX_COUNT_WITH_CUTOFF, result, cutoff, (SubLObject)ConsesLow.listS(simple_match_function, v_term, ConsesLow.append(keys, (SubLObject)kb_indexing_macros.NIL))), (SubLObject)ConsesLow.listS((SubLObject)kb_indexing_macros.$sym47$SET_RELEVANT_COMPLEX_INDEX_COUNT_WITH_CUTOFF, result, cutoff, index, v_term, ConsesLow.append(keys, (SubLObject)kb_indexing_macros.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 7648L)
    public static SubLObject set_key_arbitrary_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject result = (SubLObject)kb_indexing_macros.NIL;
        SubLObject index = (SubLObject)kb_indexing_macros.NIL;
        SubLObject v_term = (SubLObject)kb_indexing_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list0);
        result = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list0);
        index = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list0);
        v_term = current.first();
        final SubLObject keys;
        current = (keys = current.rest());
        final SubLObject simple_key_function = kb_indexing_declarations.get_index_prop(index, (SubLObject)kb_indexing_macros.$kw59$SIMPLE_KEY_FUNCTION);
        final SubLObject get_subindex_function = kb_indexing_declarations.get_index_prop(index, (SubLObject)kb_indexing_macros.$kw2$GET_SUBINDEX_FUNCTION);
        final SubLObject keys_accum = (SubLObject)kb_indexing_macros.$sym60$KEYS_ACCUM;
        final SubLObject ass = (SubLObject)kb_indexing_macros.$sym61$ASS;
        return (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym5$PIF, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym6$SIMPLE_INDEXED_TERM_P, v_term), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym7$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(keys_accum, (SubLObject)kb_indexing_macros.$list62)), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym9$DO_SIMPLE_INDEX, (SubLObject)ConsesLow.list(ass, v_term), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym12$CSETQ, keys_accum, (SubLObject)ConsesLow.listS(simple_key_function, ass, keys_accum, v_term, ConsesLow.append(keys, (SubLObject)kb_indexing_macros.NIL)))), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym12$CSETQ, result, keys_accum)), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym7$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym63$NEXT_LEVEL_SUBINDEX, (SubLObject)ConsesLow.listS(get_subindex_function, v_term, ConsesLow.append(keys, (SubLObject)kb_indexing_macros.NIL)))), (SubLObject)ConsesLow.listS((SubLObject)kb_indexing_macros.$sym12$CSETQ, result, (SubLObject)kb_indexing_macros.$list64)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 8595L)
    public static SubLObject set_relevant_key_simple_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject result = (SubLObject)kb_indexing_macros.NIL;
        SubLObject index = (SubLObject)kb_indexing_macros.NIL;
        SubLObject v_term = (SubLObject)kb_indexing_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list0);
        result = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list0);
        index = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list0);
        v_term = current.first();
        final SubLObject keys;
        current = (keys = current.rest());
        final SubLObject simple_match_function = kb_indexing_declarations.get_index_prop(index, (SubLObject)kb_indexing_macros.$kw1$SIMPLE_MATCH_FUNCTION);
        final SubLObject simple_key_function = kb_indexing_declarations.get_index_prop(index, (SubLObject)kb_indexing_macros.$kw59$SIMPLE_KEY_FUNCTION);
        final SubLObject keys_accum = (SubLObject)kb_indexing_macros.$sym67$KEYS_ACCUM;
        final SubLObject ass = (SubLObject)kb_indexing_macros.$sym68$ASS;
        return (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym7$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(keys_accum, (SubLObject)kb_indexing_macros.$list62)), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym9$DO_SIMPLE_INDEX, (SubLObject)ConsesLow.list(ass, v_term), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym10$PWHEN, (SubLObject)ConsesLow.listS(simple_match_function, ass, v_term, ConsesLow.append(keys, (SubLObject)kb_indexing_macros.NIL)), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym10$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym69$RELEVANT_MT_, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym70$ASSERTION_MT, ass)), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym12$CSETQ, keys_accum, (SubLObject)ConsesLow.listS(simple_key_function, ass, keys_accum, v_term, ConsesLow.append(keys, (SubLObject)kb_indexing_macros.NIL)))))), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym12$CSETQ, result, keys_accum));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 9221L)
    public static SubLObject set_relevant_key_complex_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject result = (SubLObject)kb_indexing_macros.NIL;
        SubLObject index = (SubLObject)kb_indexing_macros.NIL;
        SubLObject v_term = (SubLObject)kb_indexing_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list0);
        result = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list0);
        index = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list0);
        v_term = current.first();
        final SubLObject keys;
        current = (keys = current.rest());
        final SubLObject key_function = kb_indexing_declarations.get_index_prop(index, (SubLObject)kb_indexing_macros.$kw21$KEY_FUNCTION);
        final SubLObject get_subindex_function = kb_indexing_declarations.get_index_prop(index, (SubLObject)kb_indexing_macros.$kw2$GET_SUBINDEX_FUNCTION);
        final SubLObject relevant_num_function = kb_indexing_declarations.get_index_prop(index, (SubLObject)kb_indexing_macros.$kw22$RELEVANT_NUM_FUNCTION);
        final SubLObject mt_key_level = mt_key_level(index);
        if (!mt_key_level.isInteger()) {
            Errors.error((SubLObject)kb_indexing_macros.$str23$SET_RELEVANT_COMPLEX_INDEX_COUNT_, index);
        }
        if (number_of_non_null_args_in_order(keys, (SubLObject)kb_indexing_macros.UNPROVIDED, (SubLObject)kb_indexing_macros.UNPROVIDED, (SubLObject)kb_indexing_macros.UNPROVIDED, (SubLObject)kb_indexing_macros.UNPROVIDED).numGE(mt_key_level)) {
            Errors.error((SubLObject)kb_indexing_macros.$str24$SET_RELEVANT_COMPLEX_INDEX_COUNT_);
        }
        final SubLObject good_key_count = (SubLObject)kb_indexing_macros.$sym72$GOOD_KEY_COUNT;
        final SubLObject good_keys = (SubLObject)kb_indexing_macros.$sym73$GOOD_KEYS;
        final SubLObject mt_subindex = (SubLObject)kb_indexing_macros.$sym74$MT_SUBINDEX;
        final SubLObject next_level_keys = (SubLObject)kb_indexing_macros.$sym75$NEXT_LEVEL_KEYS;
        final SubLObject next_key = (SubLObject)kb_indexing_macros.$sym76$NEXT_KEY;
        return (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym7$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(good_key_count, reader.bq_cons((SubLObject)kb_indexing_macros.$sym30$NUMBER_OF_NON_NULL_ARGS_IN_ORDER, ConsesLow.append(keys, (SubLObject)kb_indexing_macros.NIL)))), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym5$PIF, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym31$_, good_key_count, (SubLObject)ConsesLow.listS((SubLObject)kb_indexing_macros.$sym32$_, mt_key_level, (SubLObject)kb_indexing_macros.$list33)), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym7$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(mt_subindex, (SubLObject)ConsesLow.listS(get_subindex_function, v_term, ConsesLow.append(keys, (SubLObject)kb_indexing_macros.NIL)))), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym10$PWHEN, mt_subindex, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym12$CSETQ, result, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym77$RELEVANT_MT_SUBINDEX_KEYS, mt_subindex)))), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym7$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(good_keys, (SubLObject)ConsesLow.listS((SubLObject)kb_indexing_macros.$sym35$LIST_OF_FIRST_N_ARGS, good_key_count, ConsesLow.append(keys, (SubLObject)kb_indexing_macros.NIL))), (SubLObject)ConsesLow.list(next_level_keys, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym36$APPLY, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym37$QUOTE, key_function), v_term, good_keys))), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym38$CDOLIST, (SubLObject)ConsesLow.list(next_key, next_level_keys), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym10$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym78$PLUSP, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym36$APPLY, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym37$QUOTE, relevant_num_function), v_term, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym39$APPEND, good_keys, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym40$LIST, next_key)))), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym79$CPUSH, next_key, result))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 10811L)
    public static SubLObject set_relevant_key_arbitrary_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject result = (SubLObject)kb_indexing_macros.NIL;
        SubLObject index = (SubLObject)kb_indexing_macros.NIL;
        SubLObject v_term = (SubLObject)kb_indexing_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list0);
        result = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list0);
        index = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list0);
        v_term = current.first();
        final SubLObject keys;
        current = (keys = current.rest());
        final SubLObject key_function = kb_indexing_declarations.get_index_prop(index, (SubLObject)kb_indexing_macros.$kw21$KEY_FUNCTION);
        return (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym5$PIF, (SubLObject)kb_indexing_macros.$list42, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym12$CSETQ, result, (SubLObject)ConsesLow.listS(key_function, v_term, ConsesLow.append(keys, (SubLObject)kb_indexing_macros.NIL))), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym5$PIF, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym6$SIMPLE_INDEXED_TERM_P, v_term), (SubLObject)ConsesLow.listS((SubLObject)kb_indexing_macros.$sym65$SET_RELEVANT_KEY_SIMPLE_INDEX, result, index, v_term, ConsesLow.append(keys, (SubLObject)kb_indexing_macros.NIL)), (SubLObject)ConsesLow.listS((SubLObject)kb_indexing_macros.$sym71$SET_RELEVANT_KEY_COMPLEX_INDEX, result, index, v_term, ConsesLow.append(keys, (SubLObject)kb_indexing_macros.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 11332L)
    public static SubLObject mt_key_level(final SubLObject index) {
        final SubLObject keys_declaration = kb_indexing_declarations.get_index_prop(index, (SubLObject)kb_indexing_macros.$kw81$KEYS);
        SubLObject level = (SubLObject)kb_indexing_macros.ONE_INTEGER;
        SubLObject cdolist_list_var = keys_declaration;
        SubLObject key_plist = (SubLObject)kb_indexing_macros.NIL;
        key_plist = cdolist_list_var.first();
        while (kb_indexing_macros.NIL != cdolist_list_var) {
            if (kb_indexing_macros.NIL != conses_high.getf(key_plist, (SubLObject)kb_indexing_macros.$kw82$MT_, (SubLObject)kb_indexing_macros.UNPROVIDED)) {
                return level;
            }
            level = Numbers.add(level, (SubLObject)kb_indexing_macros.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            key_plist = cdolist_list_var.first();
        }
        return (SubLObject)kb_indexing_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 11725L)
    public static SubLObject list_of_first_n_args(final SubLObject n, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == kb_indexing_macros.UNPROVIDED) {
            arg1 = (SubLObject)kb_indexing_macros.NIL;
        }
        if (arg2 == kb_indexing_macros.UNPROVIDED) {
            arg2 = (SubLObject)kb_indexing_macros.NIL;
        }
        if (arg3 == kb_indexing_macros.UNPROVIDED) {
            arg3 = (SubLObject)kb_indexing_macros.NIL;
        }
        if (arg4 == kb_indexing_macros.UNPROVIDED) {
            arg4 = (SubLObject)kb_indexing_macros.NIL;
        }
        if (arg5 == kb_indexing_macros.UNPROVIDED) {
            arg5 = (SubLObject)kb_indexing_macros.NIL;
        }
        SubLObject result = (SubLObject)kb_indexing_macros.NIL;
        if (n.numGE((SubLObject)kb_indexing_macros.ONE_INTEGER)) {
            result = (SubLObject)ConsesLow.cons(arg1, result);
        }
        if (n.numGE((SubLObject)kb_indexing_macros.TWO_INTEGER)) {
            result = (SubLObject)ConsesLow.cons(arg2, result);
        }
        if (n.numGE((SubLObject)kb_indexing_macros.THREE_INTEGER)) {
            result = (SubLObject)ConsesLow.cons(arg3, result);
        }
        if (n.numGE((SubLObject)kb_indexing_macros.FOUR_INTEGER)) {
            result = (SubLObject)ConsesLow.cons(arg4, result);
        }
        if (n.numGE((SubLObject)kb_indexing_macros.FIVE_INTEGER)) {
            result = (SubLObject)ConsesLow.cons(arg5, result);
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 12138L)
    public static SubLObject number_of_non_null_args_in_order(SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == kb_indexing_macros.UNPROVIDED) {
            arg1 = (SubLObject)kb_indexing_macros.NIL;
        }
        if (arg2 == kb_indexing_macros.UNPROVIDED) {
            arg2 = (SubLObject)kb_indexing_macros.NIL;
        }
        if (arg3 == kb_indexing_macros.UNPROVIDED) {
            arg3 = (SubLObject)kb_indexing_macros.NIL;
        }
        if (arg4 == kb_indexing_macros.UNPROVIDED) {
            arg4 = (SubLObject)kb_indexing_macros.NIL;
        }
        if (arg5 == kb_indexing_macros.UNPROVIDED) {
            arg5 = (SubLObject)kb_indexing_macros.NIL;
        }
        SubLObject count = (SubLObject)kb_indexing_macros.ZERO_INTEGER;
        if (kb_indexing_macros.NIL == arg1) {
            return count;
        }
        count = Numbers.add(count, (SubLObject)kb_indexing_macros.ONE_INTEGER);
        if (kb_indexing_macros.NIL == arg2) {
            return count;
        }
        count = Numbers.add(count, (SubLObject)kb_indexing_macros.ONE_INTEGER);
        if (kb_indexing_macros.NIL == arg3) {
            return count;
        }
        count = Numbers.add(count, (SubLObject)kb_indexing_macros.ONE_INTEGER);
        if (kb_indexing_macros.NIL == arg4) {
            return count;
        }
        count = Numbers.add(count, (SubLObject)kb_indexing_macros.ONE_INTEGER);
        if (kb_indexing_macros.NIL == arg5) {
            return count;
        }
        count = Numbers.add(count, (SubLObject)kb_indexing_macros.ONE_INTEGER);
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 12593L)
    public static SubLObject do_gaf_arg_indices(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list83);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject argnum = (SubLObject)kb_indexing_macros.NIL;
        SubLObject subindex = (SubLObject)kb_indexing_macros.NIL;
        SubLObject v_term = (SubLObject)kb_indexing_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list83);
        argnum = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list83);
        subindex = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list83);
        v_term = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_indexing_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_indexing_macros.NIL;
        SubLObject current_$1 = (SubLObject)kb_indexing_macros.NIL;
        while (kb_indexing_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_indexing_macros.$list83);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_indexing_macros.$list83);
            if (kb_indexing_macros.NIL == conses_high.member(current_$1, (SubLObject)kb_indexing_macros.$list84, (SubLObject)kb_indexing_macros.UNPROVIDED, (SubLObject)kb_indexing_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_indexing_macros.T;
            }
            if (current_$1 == kb_indexing_macros.$kw85$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_indexing_macros.NIL != bad && kb_indexing_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_indexing_macros.$list83);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_indexing_macros.$kw86$DONE, current);
        final SubLObject done = (SubLObject)((kb_indexing_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_indexing_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym87$DO_INTERMEDIATE_INDEX, (SubLObject)ConsesLow.list(argnum, subindex, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym88$TERM_GAF_ARG_INDEX, v_term), (SubLObject)kb_indexing_macros.$kw86$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)kb_indexing_macros.$sym10$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym89$VALID_GAF_ARG_INDEX_KEY_, argnum), ConsesLow.append(body, (SubLObject)kb_indexing_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 12960L)
    public static SubLObject do_gaf_arg_index_keys(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list90);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject argnum = (SubLObject)kb_indexing_macros.NIL;
        SubLObject v_term = (SubLObject)kb_indexing_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list90);
        argnum = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list90);
        v_term = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_indexing_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_indexing_macros.NIL;
        SubLObject current_$2 = (SubLObject)kb_indexing_macros.NIL;
        while (kb_indexing_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_indexing_macros.$list90);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_indexing_macros.$list90);
            if (kb_indexing_macros.NIL == conses_high.member(current_$2, (SubLObject)kb_indexing_macros.$list84, (SubLObject)kb_indexing_macros.UNPROVIDED, (SubLObject)kb_indexing_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_indexing_macros.T;
            }
            if (current_$2 == kb_indexing_macros.$kw85$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_indexing_macros.NIL != bad && kb_indexing_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_indexing_macros.$list90);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_indexing_macros.$kw86$DONE, current);
        final SubLObject done = (SubLObject)((kb_indexing_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_indexing_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject subindex = (SubLObject)kb_indexing_macros.$sym91$SUBINDEX;
        return (SubLObject)ConsesLow.listS((SubLObject)kb_indexing_macros.$sym92$DO_GAF_ARG_INDICES, (SubLObject)ConsesLow.list(argnum, subindex, v_term, (SubLObject)kb_indexing_macros.$kw86$DONE, done), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym93$IGNORE, subindex), ConsesLow.append(body, (SubLObject)kb_indexing_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 13177L)
    public static SubLObject term_gaf_arg_index(final SubLObject v_term) {
        return kb_indexing_datastructures.intermediate_index_lookup(kb_indexing_datastructures.term_index(v_term), (SubLObject)kb_indexing_macros.$kw94$GAF_ARG);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 13319L)
    public static SubLObject valid_gaf_arg_index_keyP(final SubLObject key) {
        return (SubLObject)kb_indexing_macros.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 13499L)
    public static SubLObject do_nart_arg_indices(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list83);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject argnum = (SubLObject)kb_indexing_macros.NIL;
        SubLObject subindex = (SubLObject)kb_indexing_macros.NIL;
        SubLObject v_term = (SubLObject)kb_indexing_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list83);
        argnum = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list83);
        subindex = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list83);
        v_term = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_indexing_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_indexing_macros.NIL;
        SubLObject current_$3 = (SubLObject)kb_indexing_macros.NIL;
        while (kb_indexing_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_indexing_macros.$list83);
            current_$3 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_indexing_macros.$list83);
            if (kb_indexing_macros.NIL == conses_high.member(current_$3, (SubLObject)kb_indexing_macros.$list84, (SubLObject)kb_indexing_macros.UNPROVIDED, (SubLObject)kb_indexing_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_indexing_macros.T;
            }
            if (current_$3 == kb_indexing_macros.$kw85$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_indexing_macros.NIL != bad && kb_indexing_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_indexing_macros.$list83);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_indexing_macros.$kw86$DONE, current);
        final SubLObject done = (SubLObject)((kb_indexing_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_indexing_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym87$DO_INTERMEDIATE_INDEX, (SubLObject)ConsesLow.list(argnum, subindex, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym95$TERM_NART_ARG_INDEX, v_term), (SubLObject)kb_indexing_macros.$kw86$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)kb_indexing_macros.$sym10$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym96$VALID_NART_ARG_INDEX_KEY_, argnum), ConsesLow.append(body, (SubLObject)kb_indexing_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 13767L)
    public static SubLObject do_nart_arg_index_keys(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list90);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject argnum = (SubLObject)kb_indexing_macros.NIL;
        SubLObject v_term = (SubLObject)kb_indexing_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list90);
        argnum = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list90);
        v_term = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_indexing_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_indexing_macros.NIL;
        SubLObject current_$4 = (SubLObject)kb_indexing_macros.NIL;
        while (kb_indexing_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_indexing_macros.$list90);
            current_$4 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_indexing_macros.$list90);
            if (kb_indexing_macros.NIL == conses_high.member(current_$4, (SubLObject)kb_indexing_macros.$list84, (SubLObject)kb_indexing_macros.UNPROVIDED, (SubLObject)kb_indexing_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_indexing_macros.T;
            }
            if (current_$4 == kb_indexing_macros.$kw85$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_indexing_macros.NIL != bad && kb_indexing_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_indexing_macros.$list90);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_indexing_macros.$kw86$DONE, current);
        final SubLObject done = (SubLObject)((kb_indexing_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_indexing_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject subindex = (SubLObject)kb_indexing_macros.$sym97$SUBINDEX;
        return (SubLObject)ConsesLow.listS((SubLObject)kb_indexing_macros.$sym98$DO_NART_ARG_INDICES, (SubLObject)ConsesLow.list(argnum, subindex, v_term, (SubLObject)kb_indexing_macros.$kw86$DONE, done), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym93$IGNORE, subindex), ConsesLow.append(body, (SubLObject)kb_indexing_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 13986L)
    public static SubLObject term_nart_arg_index(final SubLObject v_term) {
        return kb_indexing_datastructures.intermediate_index_lookup(kb_indexing_datastructures.term_index(v_term), (SubLObject)kb_indexing_macros.$kw99$NART_ARG);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 14131L)
    public static SubLObject valid_nart_arg_index_keyP(final SubLObject key) {
        return (SubLObject)kb_indexing_macros.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 14313L)
    public static SubLObject do_predicate_rule_indices(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list100);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sense = (SubLObject)kb_indexing_macros.NIL;
        SubLObject subindex = (SubLObject)kb_indexing_macros.NIL;
        SubLObject pred = (SubLObject)kb_indexing_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list100);
        sense = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list100);
        subindex = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list100);
        pred = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_indexing_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_indexing_macros.NIL;
        SubLObject current_$5 = (SubLObject)kb_indexing_macros.NIL;
        while (kb_indexing_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_indexing_macros.$list100);
            current_$5 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_indexing_macros.$list100);
            if (kb_indexing_macros.NIL == conses_high.member(current_$5, (SubLObject)kb_indexing_macros.$list84, (SubLObject)kb_indexing_macros.UNPROVIDED, (SubLObject)kb_indexing_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_indexing_macros.T;
            }
            if (current_$5 == kb_indexing_macros.$kw85$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_indexing_macros.NIL != bad && kb_indexing_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_indexing_macros.$list100);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_indexing_macros.$kw86$DONE, current);
        final SubLObject done = (SubLObject)((kb_indexing_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_indexing_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym87$DO_INTERMEDIATE_INDEX, (SubLObject)ConsesLow.list(sense, subindex, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym101$TERM_PREDICATE_RULE_INDEX, pred), (SubLObject)kb_indexing_macros.$kw86$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)kb_indexing_macros.$sym10$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym102$VALID_PREDICATE_RULE_INDEX_KEY_, sense), ConsesLow.append(body, (SubLObject)kb_indexing_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 14602L)
    public static SubLObject do_predicate_rule_index_keys(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list103);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sense = (SubLObject)kb_indexing_macros.NIL;
        SubLObject pred = (SubLObject)kb_indexing_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list103);
        sense = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list103);
        pred = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_indexing_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_indexing_macros.NIL;
        SubLObject current_$6 = (SubLObject)kb_indexing_macros.NIL;
        while (kb_indexing_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_indexing_macros.$list103);
            current_$6 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_indexing_macros.$list103);
            if (kb_indexing_macros.NIL == conses_high.member(current_$6, (SubLObject)kb_indexing_macros.$list84, (SubLObject)kb_indexing_macros.UNPROVIDED, (SubLObject)kb_indexing_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_indexing_macros.T;
            }
            if (current_$6 == kb_indexing_macros.$kw85$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_indexing_macros.NIL != bad && kb_indexing_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_indexing_macros.$list103);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_indexing_macros.$kw86$DONE, current);
        final SubLObject done = (SubLObject)((kb_indexing_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_indexing_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject subindex = (SubLObject)kb_indexing_macros.$sym104$SUBINDEX;
        return (SubLObject)ConsesLow.listS((SubLObject)kb_indexing_macros.$sym105$DO_PREDICATE_RULE_INDICES, (SubLObject)ConsesLow.list(sense, subindex, pred, (SubLObject)kb_indexing_macros.$kw86$DONE, done), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym93$IGNORE, subindex), ConsesLow.append(body, (SubLObject)kb_indexing_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 14831L)
    public static SubLObject term_predicate_rule_index(final SubLObject pred) {
        return kb_indexing_datastructures.intermediate_index_lookup(kb_indexing_datastructures.term_index(pred), (SubLObject)kb_indexing_macros.$kw106$PREDICATE_RULE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 14994L)
    public static SubLObject valid_predicate_rule_index_keyP(final SubLObject key) {
        return (SubLObject)kb_indexing_macros.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 15188L)
    public static SubLObject do_decontextualized_ist_predicate_rule_indices(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list100);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sense = (SubLObject)kb_indexing_macros.NIL;
        SubLObject subindex = (SubLObject)kb_indexing_macros.NIL;
        SubLObject pred = (SubLObject)kb_indexing_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list100);
        sense = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list100);
        subindex = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list100);
        pred = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_indexing_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_indexing_macros.NIL;
        SubLObject current_$7 = (SubLObject)kb_indexing_macros.NIL;
        while (kb_indexing_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_indexing_macros.$list100);
            current_$7 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_indexing_macros.$list100);
            if (kb_indexing_macros.NIL == conses_high.member(current_$7, (SubLObject)kb_indexing_macros.$list84, (SubLObject)kb_indexing_macros.UNPROVIDED, (SubLObject)kb_indexing_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_indexing_macros.T;
            }
            if (current_$7 == kb_indexing_macros.$kw85$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_indexing_macros.NIL != bad && kb_indexing_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_indexing_macros.$list100);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_indexing_macros.$kw86$DONE, current);
        final SubLObject done = (SubLObject)((kb_indexing_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_indexing_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym87$DO_INTERMEDIATE_INDEX, (SubLObject)ConsesLow.list(sense, subindex, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym107$TERM_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX, pred), (SubLObject)kb_indexing_macros.$kw86$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)kb_indexing_macros.$sym10$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym102$VALID_PREDICATE_RULE_INDEX_KEY_, sense), ConsesLow.append(body, (SubLObject)kb_indexing_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 15540L)
    public static SubLObject do_decontextualized_ist_predicate_rule_index_keys(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list103);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sense = (SubLObject)kb_indexing_macros.NIL;
        SubLObject pred = (SubLObject)kb_indexing_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list103);
        sense = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list103);
        pred = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_indexing_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_indexing_macros.NIL;
        SubLObject current_$8 = (SubLObject)kb_indexing_macros.NIL;
        while (kb_indexing_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_indexing_macros.$list103);
            current_$8 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_indexing_macros.$list103);
            if (kb_indexing_macros.NIL == conses_high.member(current_$8, (SubLObject)kb_indexing_macros.$list84, (SubLObject)kb_indexing_macros.UNPROVIDED, (SubLObject)kb_indexing_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_indexing_macros.T;
            }
            if (current_$8 == kb_indexing_macros.$kw85$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_indexing_macros.NIL != bad && kb_indexing_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_indexing_macros.$list103);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_indexing_macros.$kw86$DONE, current);
        final SubLObject done = (SubLObject)((kb_indexing_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_indexing_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject subindex = (SubLObject)kb_indexing_macros.$sym108$SUBINDEX;
        return (SubLObject)ConsesLow.listS((SubLObject)kb_indexing_macros.$sym109$DO_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDICES, (SubLObject)ConsesLow.list(sense, subindex, pred, (SubLObject)kb_indexing_macros.$kw86$DONE, done), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym93$IGNORE, subindex), ConsesLow.append(body, (SubLObject)kb_indexing_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 15811L)
    public static SubLObject term_decontextualized_ist_predicate_rule_index(final SubLObject pred) {
        return kb_indexing_datastructures.intermediate_index_lookup(kb_indexing_datastructures.term_index(pred), (SubLObject)kb_indexing_macros.$kw110$DECONTEXTUALIZED_IST_PREDICATE_RULE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 16037L)
    public static SubLObject valid_decontextualized_ist_predicate_rule_index_keyP(final SubLObject key) {
        return (SubLObject)kb_indexing_macros.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 16273L)
    public static SubLObject do_isa_rule_indices(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list112);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sense = (SubLObject)kb_indexing_macros.NIL;
        SubLObject subindex = (SubLObject)kb_indexing_macros.NIL;
        SubLObject col = (SubLObject)kb_indexing_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list112);
        sense = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list112);
        subindex = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list112);
        col = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_indexing_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_indexing_macros.NIL;
        SubLObject current_$9 = (SubLObject)kb_indexing_macros.NIL;
        while (kb_indexing_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_indexing_macros.$list112);
            current_$9 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_indexing_macros.$list112);
            if (kb_indexing_macros.NIL == conses_high.member(current_$9, (SubLObject)kb_indexing_macros.$list84, (SubLObject)kb_indexing_macros.UNPROVIDED, (SubLObject)kb_indexing_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_indexing_macros.T;
            }
            if (current_$9 == kb_indexing_macros.$kw85$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_indexing_macros.NIL != bad && kb_indexing_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_indexing_macros.$list112);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_indexing_macros.$kw86$DONE, current);
        final SubLObject done = (SubLObject)((kb_indexing_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_indexing_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym87$DO_INTERMEDIATE_INDEX, (SubLObject)ConsesLow.list(sense, subindex, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym113$TERM_ISA_RULE_INDEX, col), (SubLObject)kb_indexing_macros.$kw86$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)kb_indexing_macros.$sym10$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym114$VALID_ISA_RULE_INDEX_KEY_, sense), ConsesLow.append(body, (SubLObject)kb_indexing_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 16536L)
    public static SubLObject do_isa_rule_index_keys(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list115);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sense = (SubLObject)kb_indexing_macros.NIL;
        SubLObject col = (SubLObject)kb_indexing_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list115);
        sense = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list115);
        col = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_indexing_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_indexing_macros.NIL;
        SubLObject current_$10 = (SubLObject)kb_indexing_macros.NIL;
        while (kb_indexing_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_indexing_macros.$list115);
            current_$10 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_indexing_macros.$list115);
            if (kb_indexing_macros.NIL == conses_high.member(current_$10, (SubLObject)kb_indexing_macros.$list84, (SubLObject)kb_indexing_macros.UNPROVIDED, (SubLObject)kb_indexing_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_indexing_macros.T;
            }
            if (current_$10 == kb_indexing_macros.$kw85$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_indexing_macros.NIL != bad && kb_indexing_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_indexing_macros.$list115);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_indexing_macros.$kw86$DONE, current);
        final SubLObject done = (SubLObject)((kb_indexing_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_indexing_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject subindex = (SubLObject)kb_indexing_macros.$sym116$SUBINDEX;
        return (SubLObject)ConsesLow.listS((SubLObject)kb_indexing_macros.$sym117$DO_ISA_RULE_INDICES, (SubLObject)ConsesLow.list(sense, subindex, col, (SubLObject)kb_indexing_macros.$kw86$DONE, done), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym93$IGNORE, subindex), ConsesLow.append(body, (SubLObject)kb_indexing_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 16751L)
    public static SubLObject term_isa_rule_index(final SubLObject col) {
        return kb_indexing_datastructures.intermediate_index_lookup(kb_indexing_datastructures.term_index(col), (SubLObject)kb_indexing_macros.$kw118$ISA_RULE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 16894L)
    public static SubLObject valid_isa_rule_index_keyP(final SubLObject key) {
        return (SubLObject)kb_indexing_macros.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 17076L)
    public static SubLObject do_genls_rule_indices(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list112);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sense = (SubLObject)kb_indexing_macros.NIL;
        SubLObject subindex = (SubLObject)kb_indexing_macros.NIL;
        SubLObject col = (SubLObject)kb_indexing_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list112);
        sense = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list112);
        subindex = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list112);
        col = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_indexing_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_indexing_macros.NIL;
        SubLObject current_$11 = (SubLObject)kb_indexing_macros.NIL;
        while (kb_indexing_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_indexing_macros.$list112);
            current_$11 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_indexing_macros.$list112);
            if (kb_indexing_macros.NIL == conses_high.member(current_$11, (SubLObject)kb_indexing_macros.$list84, (SubLObject)kb_indexing_macros.UNPROVIDED, (SubLObject)kb_indexing_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_indexing_macros.T;
            }
            if (current_$11 == kb_indexing_macros.$kw85$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_indexing_macros.NIL != bad && kb_indexing_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_indexing_macros.$list112);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_indexing_macros.$kw86$DONE, current);
        final SubLObject done = (SubLObject)((kb_indexing_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_indexing_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym87$DO_INTERMEDIATE_INDEX, (SubLObject)ConsesLow.list(sense, subindex, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym119$TERM_GENLS_RULE_INDEX, col), (SubLObject)kb_indexing_macros.$kw86$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)kb_indexing_macros.$sym10$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym120$VALID_GENLS_RULE_INDEX_KEY_, sense), ConsesLow.append(body, (SubLObject)kb_indexing_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 17347L)
    public static SubLObject do_genls_rule_index_keys(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list115);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sense = (SubLObject)kb_indexing_macros.NIL;
        SubLObject col = (SubLObject)kb_indexing_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list115);
        sense = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list115);
        col = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_indexing_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_indexing_macros.NIL;
        SubLObject current_$12 = (SubLObject)kb_indexing_macros.NIL;
        while (kb_indexing_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_indexing_macros.$list115);
            current_$12 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_indexing_macros.$list115);
            if (kb_indexing_macros.NIL == conses_high.member(current_$12, (SubLObject)kb_indexing_macros.$list84, (SubLObject)kb_indexing_macros.UNPROVIDED, (SubLObject)kb_indexing_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_indexing_macros.T;
            }
            if (current_$12 == kb_indexing_macros.$kw85$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_indexing_macros.NIL != bad && kb_indexing_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_indexing_macros.$list115);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_indexing_macros.$kw86$DONE, current);
        final SubLObject done = (SubLObject)((kb_indexing_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_indexing_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject subindex = (SubLObject)kb_indexing_macros.$sym121$SUBINDEX;
        return (SubLObject)ConsesLow.listS((SubLObject)kb_indexing_macros.$sym122$DO_GENLS_RULE_INDICES, (SubLObject)ConsesLow.list(sense, subindex, col, (SubLObject)kb_indexing_macros.$kw86$DONE, done), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym93$IGNORE, subindex), ConsesLow.append(body, (SubLObject)kb_indexing_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 17566L)
    public static SubLObject term_genls_rule_index(final SubLObject col) {
        return kb_indexing_datastructures.intermediate_index_lookup(kb_indexing_datastructures.term_index(col), (SubLObject)kb_indexing_macros.$kw123$GENLS_RULE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 17715L)
    public static SubLObject valid_genls_rule_index_keyP(final SubLObject key) {
        return (SubLObject)kb_indexing_macros.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 17901L)
    public static SubLObject do_genl_mt_rule_indices(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list112);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sense = (SubLObject)kb_indexing_macros.NIL;
        SubLObject subindex = (SubLObject)kb_indexing_macros.NIL;
        SubLObject col = (SubLObject)kb_indexing_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list112);
        sense = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list112);
        subindex = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list112);
        col = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_indexing_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_indexing_macros.NIL;
        SubLObject current_$13 = (SubLObject)kb_indexing_macros.NIL;
        while (kb_indexing_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_indexing_macros.$list112);
            current_$13 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_indexing_macros.$list112);
            if (kb_indexing_macros.NIL == conses_high.member(current_$13, (SubLObject)kb_indexing_macros.$list84, (SubLObject)kb_indexing_macros.UNPROVIDED, (SubLObject)kb_indexing_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_indexing_macros.T;
            }
            if (current_$13 == kb_indexing_macros.$kw85$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_indexing_macros.NIL != bad && kb_indexing_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_indexing_macros.$list112);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_indexing_macros.$kw86$DONE, current);
        final SubLObject done = (SubLObject)((kb_indexing_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_indexing_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym87$DO_INTERMEDIATE_INDEX, (SubLObject)ConsesLow.list(sense, subindex, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym124$TERM_GENL_MT_RULE_INDEX, col), (SubLObject)kb_indexing_macros.$kw86$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)kb_indexing_macros.$sym10$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym125$VALID_GENL_MT_RULE_INDEX_KEY_, sense), ConsesLow.append(body, (SubLObject)kb_indexing_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 18180L)
    public static SubLObject do_genl_mt_rule_index_keys(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list115);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sense = (SubLObject)kb_indexing_macros.NIL;
        SubLObject col = (SubLObject)kb_indexing_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list115);
        sense = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_macros.$list115);
        col = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_indexing_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_indexing_macros.NIL;
        SubLObject current_$14 = (SubLObject)kb_indexing_macros.NIL;
        while (kb_indexing_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_indexing_macros.$list115);
            current_$14 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_indexing_macros.$list115);
            if (kb_indexing_macros.NIL == conses_high.member(current_$14, (SubLObject)kb_indexing_macros.$list84, (SubLObject)kb_indexing_macros.UNPROVIDED, (SubLObject)kb_indexing_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_indexing_macros.T;
            }
            if (current_$14 == kb_indexing_macros.$kw85$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_indexing_macros.NIL != bad && kb_indexing_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_indexing_macros.$list115);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_indexing_macros.$kw86$DONE, current);
        final SubLObject done = (SubLObject)((kb_indexing_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_indexing_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject subindex = (SubLObject)kb_indexing_macros.$sym126$SUBINDEX;
        return (SubLObject)ConsesLow.listS((SubLObject)kb_indexing_macros.$sym127$DO_GENL_MT_RULE_INDICES, (SubLObject)ConsesLow.list(sense, subindex, col, (SubLObject)kb_indexing_macros.$kw86$DONE, done), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_macros.$sym93$IGNORE, subindex), ConsesLow.append(body, (SubLObject)kb_indexing_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 18403L)
    public static SubLObject term_genl_mt_rule_index(final SubLObject col) {
        return kb_indexing_datastructures.intermediate_index_lookup(kb_indexing_datastructures.term_index(col), (SubLObject)kb_indexing_macros.$kw128$GENL_MT_RULE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-macros.lisp", position = 18558L)
    public static SubLObject valid_genl_mt_rule_index_keyP(final SubLObject key) {
        return (SubLObject)kb_indexing_macros.T;
    }
    
    public static SubLObject declare_kb_indexing_macros_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_indexing_macros", "set_num_arbitrary_index", "SET-NUM-ARBITRARY-INDEX");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_indexing_macros", "set_relevant_simple_index_count", "SET-RELEVANT-SIMPLE-INDEX-COUNT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_indexing_macros", "set_relevant_complex_index_count", "SET-RELEVANT-COMPLEX-INDEX-COUNT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_indexing_macros", "set_relevant_num_arbitrary_index", "SET-RELEVANT-NUM-ARBITRARY-INDEX");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_macros", "number_has_reached_cutoffP", "NUMBER-HAS-REACHED-CUTOFF?", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_indexing_macros", "set_relevant_simple_index_count_with_cutoff", "SET-RELEVANT-SIMPLE-INDEX-COUNT-WITH-CUTOFF");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_indexing_macros", "set_relevant_complex_index_count_with_cutoff", "SET-RELEVANT-COMPLEX-INDEX-COUNT-WITH-CUTOFF");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_indexing_macros", "set_relevant_num_arbitrary_index_with_cutoff", "SET-RELEVANT-NUM-ARBITRARY-INDEX-WITH-CUTOFF");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_indexing_macros", "set_key_arbitrary_index", "SET-KEY-ARBITRARY-INDEX");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_indexing_macros", "set_relevant_key_simple_index", "SET-RELEVANT-KEY-SIMPLE-INDEX");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_indexing_macros", "set_relevant_key_complex_index", "SET-RELEVANT-KEY-COMPLEX-INDEX");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_indexing_macros", "set_relevant_key_arbitrary_index", "SET-RELEVANT-KEY-ARBITRARY-INDEX");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_macros", "mt_key_level", "MT-KEY-LEVEL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_macros", "list_of_first_n_args", "LIST-OF-FIRST-N-ARGS", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_macros", "number_of_non_null_args_in_order", "NUMBER-OF-NON-NULL-ARGS-IN-ORDER", 0, 5, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_indexing_macros", "do_gaf_arg_indices", "DO-GAF-ARG-INDICES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_indexing_macros", "do_gaf_arg_index_keys", "DO-GAF-ARG-INDEX-KEYS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_macros", "term_gaf_arg_index", "TERM-GAF-ARG-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_macros", "valid_gaf_arg_index_keyP", "VALID-GAF-ARG-INDEX-KEY?", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_indexing_macros", "do_nart_arg_indices", "DO-NART-ARG-INDICES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_indexing_macros", "do_nart_arg_index_keys", "DO-NART-ARG-INDEX-KEYS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_macros", "term_nart_arg_index", "TERM-NART-ARG-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_macros", "valid_nart_arg_index_keyP", "VALID-NART-ARG-INDEX-KEY?", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_indexing_macros", "do_predicate_rule_indices", "DO-PREDICATE-RULE-INDICES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_indexing_macros", "do_predicate_rule_index_keys", "DO-PREDICATE-RULE-INDEX-KEYS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_macros", "term_predicate_rule_index", "TERM-PREDICATE-RULE-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_macros", "valid_predicate_rule_index_keyP", "VALID-PREDICATE-RULE-INDEX-KEY?", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_indexing_macros", "do_decontextualized_ist_predicate_rule_indices", "DO-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDICES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_indexing_macros", "do_decontextualized_ist_predicate_rule_index_keys", "DO-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX-KEYS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_macros", "term_decontextualized_ist_predicate_rule_index", "TERM-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_macros", "valid_decontextualized_ist_predicate_rule_index_keyP", "VALID-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX-KEY?", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_indexing_macros", "do_isa_rule_indices", "DO-ISA-RULE-INDICES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_indexing_macros", "do_isa_rule_index_keys", "DO-ISA-RULE-INDEX-KEYS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_macros", "term_isa_rule_index", "TERM-ISA-RULE-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_macros", "valid_isa_rule_index_keyP", "VALID-ISA-RULE-INDEX-KEY?", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_indexing_macros", "do_genls_rule_indices", "DO-GENLS-RULE-INDICES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_indexing_macros", "do_genls_rule_index_keys", "DO-GENLS-RULE-INDEX-KEYS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_macros", "term_genls_rule_index", "TERM-GENLS-RULE-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_macros", "valid_genls_rule_index_keyP", "VALID-GENLS-RULE-INDEX-KEY?", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_indexing_macros", "do_genl_mt_rule_indices", "DO-GENL-MT-RULE-INDICES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_indexing_macros", "do_genl_mt_rule_index_keys", "DO-GENL-MT-RULE-INDEX-KEYS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_macros", "term_genl_mt_rule_index", "TERM-GENL-MT-RULE-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_macros", "valid_genl_mt_rule_index_keyP", "VALID-GENL-MT-RULE-INDEX-KEY?", 1, 0, false);
        return (SubLObject)kb_indexing_macros.NIL;
    }
    
    public static SubLObject init_kb_indexing_macros_file() {
        return (SubLObject)kb_indexing_macros.NIL;
    }
    
    public static SubLObject setup_kb_indexing_macros_file() {
        access_macros.register_macro_helper((SubLObject)kb_indexing_macros.$sym15$SET_RELEVANT_SIMPLE_INDEX_COUNT, (SubLObject)kb_indexing_macros.$sym16$SET_RELEVANT_NUM_ARBITRARY_INDEX);
        access_macros.register_macro_helper((SubLObject)kb_indexing_macros.$sym20$SET_RELEVANT_COMPLEX_INDEX_COUNT, (SubLObject)kb_indexing_macros.$sym16$SET_RELEVANT_NUM_ARBITRARY_INDEX);
        access_macros.register_macro_helper((SubLObject)kb_indexing_macros.$sym43$SET_RELEVANT_SIMPLE_INDEX_COUNT_WITH_CUTOFF, (SubLObject)kb_indexing_macros.$sym16$SET_RELEVANT_NUM_ARBITRARY_INDEX);
        access_macros.register_macro_helper((SubLObject)kb_indexing_macros.$sym47$SET_RELEVANT_COMPLEX_INDEX_COUNT_WITH_CUTOFF, (SubLObject)kb_indexing_macros.$sym16$SET_RELEVANT_NUM_ARBITRARY_INDEX);
        access_macros.register_macro_helper((SubLObject)kb_indexing_macros.$sym65$SET_RELEVANT_KEY_SIMPLE_INDEX, (SubLObject)kb_indexing_macros.$sym66$SET_RELEVANT_KEY_ARBITRARY_INDEX);
        access_macros.register_macro_helper((SubLObject)kb_indexing_macros.$sym71$SET_RELEVANT_KEY_COMPLEX_INDEX, (SubLObject)kb_indexing_macros.$sym66$SET_RELEVANT_KEY_ARBITRARY_INDEX);
        access_macros.register_macro_helper((SubLObject)kb_indexing_macros.$sym80$MT_KEY_LEVEL, (SubLObject)kb_indexing_macros.$sym20$SET_RELEVANT_COMPLEX_INDEX_COUNT);
        access_macros.register_macro_helper((SubLObject)kb_indexing_macros.$sym35$LIST_OF_FIRST_N_ARGS, (SubLObject)kb_indexing_macros.$sym20$SET_RELEVANT_COMPLEX_INDEX_COUNT);
        access_macros.register_macro_helper((SubLObject)kb_indexing_macros.$sym30$NUMBER_OF_NON_NULL_ARGS_IN_ORDER, (SubLObject)kb_indexing_macros.$sym20$SET_RELEVANT_COMPLEX_INDEX_COUNT);
        access_macros.register_macro_helper((SubLObject)kb_indexing_macros.$sym88$TERM_GAF_ARG_INDEX, (SubLObject)kb_indexing_macros.$sym92$DO_GAF_ARG_INDICES);
        access_macros.register_macro_helper((SubLObject)kb_indexing_macros.$sym89$VALID_GAF_ARG_INDEX_KEY_, (SubLObject)kb_indexing_macros.$sym92$DO_GAF_ARG_INDICES);
        access_macros.register_macro_helper((SubLObject)kb_indexing_macros.$sym95$TERM_NART_ARG_INDEX, (SubLObject)kb_indexing_macros.$sym98$DO_NART_ARG_INDICES);
        access_macros.register_macro_helper((SubLObject)kb_indexing_macros.$sym96$VALID_NART_ARG_INDEX_KEY_, (SubLObject)kb_indexing_macros.$sym98$DO_NART_ARG_INDICES);
        access_macros.register_macro_helper((SubLObject)kb_indexing_macros.$sym101$TERM_PREDICATE_RULE_INDEX, (SubLObject)kb_indexing_macros.$sym105$DO_PREDICATE_RULE_INDICES);
        access_macros.register_macro_helper((SubLObject)kb_indexing_macros.$sym102$VALID_PREDICATE_RULE_INDEX_KEY_, (SubLObject)kb_indexing_macros.$sym105$DO_PREDICATE_RULE_INDICES);
        access_macros.register_macro_helper((SubLObject)kb_indexing_macros.$sym107$TERM_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX, (SubLObject)kb_indexing_macros.$sym109$DO_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDICES);
        access_macros.register_macro_helper((SubLObject)kb_indexing_macros.$sym111$VALID_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX_KEY_, (SubLObject)kb_indexing_macros.$sym109$DO_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDICES);
        access_macros.register_macro_helper((SubLObject)kb_indexing_macros.$sym113$TERM_ISA_RULE_INDEX, (SubLObject)kb_indexing_macros.$sym117$DO_ISA_RULE_INDICES);
        access_macros.register_macro_helper((SubLObject)kb_indexing_macros.$sym114$VALID_ISA_RULE_INDEX_KEY_, (SubLObject)kb_indexing_macros.$sym117$DO_ISA_RULE_INDICES);
        access_macros.register_macro_helper((SubLObject)kb_indexing_macros.$sym119$TERM_GENLS_RULE_INDEX, (SubLObject)kb_indexing_macros.$sym122$DO_GENLS_RULE_INDICES);
        access_macros.register_macro_helper((SubLObject)kb_indexing_macros.$sym120$VALID_GENLS_RULE_INDEX_KEY_, (SubLObject)kb_indexing_macros.$sym122$DO_GENLS_RULE_INDICES);
        access_macros.register_macro_helper((SubLObject)kb_indexing_macros.$sym124$TERM_GENL_MT_RULE_INDEX, (SubLObject)kb_indexing_macros.$sym127$DO_GENL_MT_RULE_INDICES);
        access_macros.register_macro_helper((SubLObject)kb_indexing_macros.$sym125$VALID_GENL_MT_RULE_INDEX_KEY_, (SubLObject)kb_indexing_macros.$sym127$DO_GENL_MT_RULE_INDICES);
        return (SubLObject)kb_indexing_macros.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_kb_indexing_macros_file();
    }
    
    @Override
	public void initializeVariables() {
        init_kb_indexing_macros_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_kb_indexing_macros_file();
    }
    
    static {
        me = (SubLFile)new kb_indexing_macros();
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("KEYS"));
        $kw1$SIMPLE_MATCH_FUNCTION = SubLObjectFactory.makeKeyword("SIMPLE-MATCH-FUNCTION");
        $kw2$GET_SUBINDEX_FUNCTION = SubLObjectFactory.makeKeyword("GET-SUBINDEX-FUNCTION");
        $sym3$COUNT = SubLObjectFactory.makeUninternedSymbol("COUNT");
        $sym4$ASS = SubLObjectFactory.makeUninternedSymbol("ASS");
        $sym5$PIF = SubLObjectFactory.makeSymbol("PIF");
        $sym6$SIMPLE_INDEXED_TERM_P = SubLObjectFactory.makeSymbol("SIMPLE-INDEXED-TERM-P");
        $sym7$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list8 = ConsesLow.list((SubLObject)kb_indexing_macros.ZERO_INTEGER);
        $sym9$DO_SIMPLE_INDEX = SubLObjectFactory.makeSymbol("DO-SIMPLE-INDEX");
        $sym10$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym11$CINC = SubLObjectFactory.makeSymbol("CINC");
        $sym12$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym13$SUBINDEX = SubLObjectFactory.makeSymbol("SUBINDEX");
        $list14 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)SubLObjectFactory.makeSymbol("SUBINDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBINDEX-LEAF-COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("SUBINDEX")), (SubLObject)kb_indexing_macros.ZERO_INTEGER));
        $sym15$SET_RELEVANT_SIMPLE_INDEX_COUNT = SubLObjectFactory.makeSymbol("SET-RELEVANT-SIMPLE-INDEX-COUNT");
        $sym16$SET_RELEVANT_NUM_ARBITRARY_INDEX = SubLObjectFactory.makeSymbol("SET-RELEVANT-NUM-ARBITRARY-INDEX");
        $list17 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COUNT-VAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS")));
        $sym18$ASS = SubLObjectFactory.makeSymbol("ASS");
        $list19 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RELEVANT-MT?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-MT"), (SubLObject)SubLObjectFactory.makeSymbol("ASS")));
        $sym20$SET_RELEVANT_COMPLEX_INDEX_COUNT = SubLObjectFactory.makeSymbol("SET-RELEVANT-COMPLEX-INDEX-COUNT");
        $kw21$KEY_FUNCTION = SubLObjectFactory.makeKeyword("KEY-FUNCTION");
        $kw22$RELEVANT_NUM_FUNCTION = SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION");
        $str23$SET_RELEVANT_COMPLEX_INDEX_COUNT_ = SubLObjectFactory.makeString("SET-RELEVANT-COMPLEX-INDEX-COUNT called on an index (~s) without an mt layer");
        $str24$SET_RELEVANT_COMPLEX_INDEX_COUNT_ = SubLObjectFactory.makeString("SET-RELEVANT-COMPLEX-INDEX-COUNT called with too many arguments");
        $sym25$GOOD_KEY_COUNT = SubLObjectFactory.makeUninternedSymbol("GOOD-KEY-COUNT");
        $sym26$GOOD_KEYS = SubLObjectFactory.makeUninternedSymbol("GOOD-KEYS");
        $sym27$MT_SUBINDEX = SubLObjectFactory.makeUninternedSymbol("MT-SUBINDEX");
        $sym28$NEXT_LEVEL_KEYS = SubLObjectFactory.makeUninternedSymbol("NEXT-LEVEL-KEYS");
        $sym29$NEXT_KEY = SubLObjectFactory.makeUninternedSymbol("NEXT-KEY");
        $sym30$NUMBER_OF_NON_NULL_ARGS_IN_ORDER = SubLObjectFactory.makeSymbol("NUMBER-OF-NON-NULL-ARGS-IN-ORDER");
        $sym31$_ = SubLObjectFactory.makeSymbol("=");
        $sym32$_ = SubLObjectFactory.makeSymbol("-");
        $list33 = ConsesLow.list((SubLObject)kb_indexing_macros.ONE_INTEGER);
        $sym34$RELEVANT_MT_SUBINDEX_COUNT = SubLObjectFactory.makeSymbol("RELEVANT-MT-SUBINDEX-COUNT");
        $sym35$LIST_OF_FIRST_N_ARGS = SubLObjectFactory.makeSymbol("LIST-OF-FIRST-N-ARGS");
        $sym36$APPLY = SubLObjectFactory.makeSymbol("APPLY");
        $sym37$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $sym38$CDOLIST = SubLObjectFactory.makeSymbol("CDOLIST");
        $sym39$APPEND = SubLObjectFactory.makeSymbol("APPEND");
        $sym40$LIST = SubLObjectFactory.makeSymbol("LIST");
        $kw41$NUM_FUNCTION = SubLObjectFactory.makeKeyword("NUM-FUNCTION");
        $list42 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALL-MT-SUBINDEX-KEYS-RELEVANT-P"));
        $sym43$SET_RELEVANT_SIMPLE_INDEX_COUNT_WITH_CUTOFF = SubLObjectFactory.makeSymbol("SET-RELEVANT-SIMPLE-INDEX-COUNT-WITH-CUTOFF");
        $list44 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COUNT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("CUTOFF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS")));
        $sym45$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $sym46$NUMBER_HAS_REACHED_CUTOFF_ = SubLObjectFactory.makeSymbol("NUMBER-HAS-REACHED-CUTOFF?");
        $sym47$SET_RELEVANT_COMPLEX_INDEX_COUNT_WITH_CUTOFF = SubLObjectFactory.makeSymbol("SET-RELEVANT-COMPLEX-INDEX-COUNT-WITH-CUTOFF");
        $list48 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)SubLObjectFactory.makeSymbol("CUTOFF"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("KEYS"));
        $kw49$RELEVANT_NUM_FUNCTION_WITH_CUTOFF = SubLObjectFactory.makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF");
        $str50$SET_RELEVANT_COMPLEX_INDEX_COUNT_ = SubLObjectFactory.makeString("SET-RELEVANT-COMPLEX-INDEX-COUNT-WITH-CUTOFF called on an index (~s) without an mt layer");
        $str51$SET_RELEVANT_COMPLEX_INDEX_COUNT_ = SubLObjectFactory.makeString("SET-RELEVANT-COMPLEX-INDEX-COUNT-WITH-CUTOFF called with too many arguments");
        $sym52$GOOD_KEY_COUNT = SubLObjectFactory.makeUninternedSymbol("GOOD-KEY-COUNT");
        $sym53$GOOD_KEYS = SubLObjectFactory.makeUninternedSymbol("GOOD-KEYS");
        $sym54$MT_SUBINDEX = SubLObjectFactory.makeUninternedSymbol("MT-SUBINDEX");
        $sym55$NEXT_LEVEL_KEYS = SubLObjectFactory.makeUninternedSymbol("NEXT-LEVEL-KEYS");
        $sym56$NEXT_KEY = SubLObjectFactory.makeUninternedSymbol("NEXT-KEY");
        $sym57$RELEVANT_MT_SUBINDEX_COUNT_WITH_CUTOFF = SubLObjectFactory.makeSymbol("RELEVANT-MT-SUBINDEX-COUNT-WITH-CUTOFF");
        $sym58$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $kw59$SIMPLE_KEY_FUNCTION = SubLObjectFactory.makeKeyword("SIMPLE-KEY-FUNCTION");
        $sym60$KEYS_ACCUM = SubLObjectFactory.makeUninternedSymbol("KEYS-ACCUM");
        $sym61$ASS = SubLObjectFactory.makeUninternedSymbol("ASS");
        $list62 = ConsesLow.list((SubLObject)kb_indexing_macros.NIL);
        $sym63$NEXT_LEVEL_SUBINDEX = SubLObjectFactory.makeSymbol("NEXT-LEVEL-SUBINDEX");
        $list64 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTERMEDIATE-INDEX-P"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT-LEVEL-SUBINDEX")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTERMEDIATE-INDEX-KEYS"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT-LEVEL-SUBINDEX"))));
        $sym65$SET_RELEVANT_KEY_SIMPLE_INDEX = SubLObjectFactory.makeSymbol("SET-RELEVANT-KEY-SIMPLE-INDEX");
        $sym66$SET_RELEVANT_KEY_ARBITRARY_INDEX = SubLObjectFactory.makeSymbol("SET-RELEVANT-KEY-ARBITRARY-INDEX");
        $sym67$KEYS_ACCUM = SubLObjectFactory.makeUninternedSymbol("KEYS-ACCUM");
        $sym68$ASS = SubLObjectFactory.makeUninternedSymbol("ASS");
        $sym69$RELEVANT_MT_ = SubLObjectFactory.makeSymbol("RELEVANT-MT?");
        $sym70$ASSERTION_MT = SubLObjectFactory.makeSymbol("ASSERTION-MT");
        $sym71$SET_RELEVANT_KEY_COMPLEX_INDEX = SubLObjectFactory.makeSymbol("SET-RELEVANT-KEY-COMPLEX-INDEX");
        $sym72$GOOD_KEY_COUNT = SubLObjectFactory.makeUninternedSymbol("GOOD-KEY-COUNT");
        $sym73$GOOD_KEYS = SubLObjectFactory.makeUninternedSymbol("GOOD-KEYS");
        $sym74$MT_SUBINDEX = SubLObjectFactory.makeUninternedSymbol("MT-SUBINDEX");
        $sym75$NEXT_LEVEL_KEYS = SubLObjectFactory.makeUninternedSymbol("NEXT-LEVEL-KEYS");
        $sym76$NEXT_KEY = SubLObjectFactory.makeUninternedSymbol("NEXT-KEY");
        $sym77$RELEVANT_MT_SUBINDEX_KEYS = SubLObjectFactory.makeSymbol("RELEVANT-MT-SUBINDEX-KEYS");
        $sym78$PLUSP = SubLObjectFactory.makeSymbol("PLUSP");
        $sym79$CPUSH = SubLObjectFactory.makeSymbol("CPUSH");
        $sym80$MT_KEY_LEVEL = SubLObjectFactory.makeSymbol("MT-KEY-LEVEL");
        $kw81$KEYS = SubLObjectFactory.makeKeyword("KEYS");
        $kw82$MT_ = SubLObjectFactory.makeKeyword("MT?");
        $list83 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARGNUM"), (SubLObject)SubLObjectFactory.makeSymbol("SUBINDEX"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list84 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw85$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw86$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym87$DO_INTERMEDIATE_INDEX = SubLObjectFactory.makeSymbol("DO-INTERMEDIATE-INDEX");
        $sym88$TERM_GAF_ARG_INDEX = SubLObjectFactory.makeSymbol("TERM-GAF-ARG-INDEX");
        $sym89$VALID_GAF_ARG_INDEX_KEY_ = SubLObjectFactory.makeSymbol("VALID-GAF-ARG-INDEX-KEY?");
        $list90 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARGNUM"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym91$SUBINDEX = SubLObjectFactory.makeUninternedSymbol("SUBINDEX");
        $sym92$DO_GAF_ARG_INDICES = SubLObjectFactory.makeSymbol("DO-GAF-ARG-INDICES");
        $sym93$IGNORE = SubLObjectFactory.makeSymbol("IGNORE");
        $kw94$GAF_ARG = SubLObjectFactory.makeKeyword("GAF-ARG");
        $sym95$TERM_NART_ARG_INDEX = SubLObjectFactory.makeSymbol("TERM-NART-ARG-INDEX");
        $sym96$VALID_NART_ARG_INDEX_KEY_ = SubLObjectFactory.makeSymbol("VALID-NART-ARG-INDEX-KEY?");
        $sym97$SUBINDEX = SubLObjectFactory.makeUninternedSymbol("SUBINDEX");
        $sym98$DO_NART_ARG_INDICES = SubLObjectFactory.makeSymbol("DO-NART-ARG-INDICES");
        $kw99$NART_ARG = SubLObjectFactory.makeKeyword("NART-ARG");
        $list100 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENSE"), (SubLObject)SubLObjectFactory.makeSymbol("SUBINDEX"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym101$TERM_PREDICATE_RULE_INDEX = SubLObjectFactory.makeSymbol("TERM-PREDICATE-RULE-INDEX");
        $sym102$VALID_PREDICATE_RULE_INDEX_KEY_ = SubLObjectFactory.makeSymbol("VALID-PREDICATE-RULE-INDEX-KEY?");
        $list103 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENSE"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym104$SUBINDEX = SubLObjectFactory.makeUninternedSymbol("SUBINDEX");
        $sym105$DO_PREDICATE_RULE_INDICES = SubLObjectFactory.makeSymbol("DO-PREDICATE-RULE-INDICES");
        $kw106$PREDICATE_RULE = SubLObjectFactory.makeKeyword("PREDICATE-RULE");
        $sym107$TERM_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX = SubLObjectFactory.makeSymbol("TERM-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX");
        $sym108$SUBINDEX = SubLObjectFactory.makeUninternedSymbol("SUBINDEX");
        $sym109$DO_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDICES = SubLObjectFactory.makeSymbol("DO-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDICES");
        $kw110$DECONTEXTUALIZED_IST_PREDICATE_RULE = SubLObjectFactory.makeKeyword("DECONTEXTUALIZED-IST-PREDICATE-RULE");
        $sym111$VALID_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX_KEY_ = SubLObjectFactory.makeSymbol("VALID-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX-KEY?");
        $list112 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENSE"), (SubLObject)SubLObjectFactory.makeSymbol("SUBINDEX"), (SubLObject)SubLObjectFactory.makeSymbol("COL"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym113$TERM_ISA_RULE_INDEX = SubLObjectFactory.makeSymbol("TERM-ISA-RULE-INDEX");
        $sym114$VALID_ISA_RULE_INDEX_KEY_ = SubLObjectFactory.makeSymbol("VALID-ISA-RULE-INDEX-KEY?");
        $list115 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENSE"), (SubLObject)SubLObjectFactory.makeSymbol("COL"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym116$SUBINDEX = SubLObjectFactory.makeUninternedSymbol("SUBINDEX");
        $sym117$DO_ISA_RULE_INDICES = SubLObjectFactory.makeSymbol("DO-ISA-RULE-INDICES");
        $kw118$ISA_RULE = SubLObjectFactory.makeKeyword("ISA-RULE");
        $sym119$TERM_GENLS_RULE_INDEX = SubLObjectFactory.makeSymbol("TERM-GENLS-RULE-INDEX");
        $sym120$VALID_GENLS_RULE_INDEX_KEY_ = SubLObjectFactory.makeSymbol("VALID-GENLS-RULE-INDEX-KEY?");
        $sym121$SUBINDEX = SubLObjectFactory.makeUninternedSymbol("SUBINDEX");
        $sym122$DO_GENLS_RULE_INDICES = SubLObjectFactory.makeSymbol("DO-GENLS-RULE-INDICES");
        $kw123$GENLS_RULE = SubLObjectFactory.makeKeyword("GENLS-RULE");
        $sym124$TERM_GENL_MT_RULE_INDEX = SubLObjectFactory.makeSymbol("TERM-GENL-MT-RULE-INDEX");
        $sym125$VALID_GENL_MT_RULE_INDEX_KEY_ = SubLObjectFactory.makeSymbol("VALID-GENL-MT-RULE-INDEX-KEY?");
        $sym126$SUBINDEX = SubLObjectFactory.makeUninternedSymbol("SUBINDEX");
        $sym127$DO_GENL_MT_RULE_INDICES = SubLObjectFactory.makeSymbol("DO-GENL-MT-RULE-INDICES");
        $kw128$GENL_MT_RULE = SubLObjectFactory.makeKeyword("GENL-MT-RULE");
    }
}

/*

	Total time: 339 ms
	
*/