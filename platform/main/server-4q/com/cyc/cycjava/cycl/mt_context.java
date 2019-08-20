package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numG;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.creduce;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cdar;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.intersection;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class mt_context extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new mt_context();













    public static final SubLSymbol $mt_vectors$ = makeSymbol("*MT-VECTORS*");

    public static final SubLSymbol $too_general_cols$ = makeSymbol("*TOO-GENERAL-COLS*");

    public static final SubLSymbol $score_threshold$ = makeSymbol("*SCORE-THRESHOLD*");

    private static final SubLFloat $float$1_0e_5 = makeDouble(1.0E-5);

    private static final SubLSymbol FIND_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING = makeSymbol("FIND-OBJECT-BY-COMPACT-HL-EXTERNAL-ID-STRING");



    private static final SubLInteger $int$_3 = makeInteger(-3);



    private static final SubLObject $$thereExists = reader_make_constant_shell(makeString("thereExists"));

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    private static final SubLObject $$or = reader_make_constant_shell(makeString("or"));



    private static final SubLObject $$Collection = reader_make_constant_shell(makeString("Collection"));

    private static final SubLObject $$Individual = reader_make_constant_shell(makeString("Individual"));

    private static final SubLObject $$Predicate = reader_make_constant_shell(makeString("Predicate"));

    private static final SubLObject $$assertedSentence = reader_make_constant_shell(makeString("assertedSentence"));

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    private static final SubLList $list17 = list(makeSymbol("?X"));

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));





    private static final SubLSymbol $kw22$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?");

    private static final SubLSymbol $kw23$ALLOW_INDETERMINATE_RESULTS_ = makeKeyword("ALLOW-INDETERMINATE-RESULTS?");

    private static final SubLSymbol $DISJUNCTION_FREE_EL_VARS_POLICY = makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY");



    private static final SubLSymbol $kw26$ADD_RESTRICTION_LAYER_OF_INDIRECTION_ = makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?");

    private static final SubLSymbol $kw27$NEW_TERMS_ALLOWED_ = makeKeyword("NEW-TERMS-ALLOWED?");

    private static final SubLSymbol $kw28$COMPUTE_ANSWER_JUSTIFICATIONS_ = makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?");



    private static final SubLSymbol $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");

    private static final SubLSymbol $PROBABLY_APPROXIMATELY_DONE = makeKeyword("PROBABLY-APPROXIMATELY-DONE");

    private static final SubLFloat $float$1_0 = makeDouble(1.0);









    private static final SubLInteger $int$20000000 = makeInteger(20000000);





    private static final SubLList $list40 = list(reader_make_constant_shell(makeString("Terrorism-Topic")));

    private static final SubLSymbol $sym41$_ = makeSymbol(">");







    private static final SubLObject $$Terrorism_Topic = reader_make_constant_shell(makeString("Terrorism-Topic"));



    private static final SubLObject $$mtTopic = reader_make_constant_shell(makeString("mtTopic"));

    private static final SubLList $list48 = list(makeSymbol("?M"));

    private static final SubLObject $$TKBSourceSpindle = reader_make_constant_shell(makeString("TKBSourceSpindle"));

    private static final SubLObject $$mtSpindleMember = reader_make_constant_shell(makeString("mtSpindleMember"));

    private static final SubLObject $$salientSpecForCollectionInTopic = reader_make_constant_shell(makeString("salientSpecForCollectionInTopic"));

    private static final SubLObject $$salientPredicateSpaceForTopic = reader_make_constant_shell(makeString("salientPredicateSpaceForTopic"));

    private static final SubLObject $$salientCollectionSpaceForTopic = reader_make_constant_shell(makeString("salientCollectionSpaceForTopic"));

    private static final SubLObject $$salientIndividualForMt = reader_make_constant_shell(makeString("salientIndividualForMt"));





    private static final SubLString $str57$____a__a_ = makeString("~% ~a ~a ");

    private static final SubLObject $$MtUnionFn = reader_make_constant_shell(makeString("MtUnionFn"));

    private static final SubLSymbol $sym59$_ = makeSymbol("+");

    public static final SubLSymbol $mt_vector_files$ = makeSymbol("*MT-VECTOR-FILES*");

    private static final SubLList $list61 = list(makeString("/cyc/top/data/mt-vectors/mt-vectors-1.txt"), makeString("/cyc/top/data/mt-vectors/mt-vectors-2.txt"), makeString("/cyc/top/data/mt-vectors/mt-vectors-3.txt"), makeString("/cyc/top/data/mt-vectors/mt-vectors-4.txt"));

    public static final SubLSymbol $mt_vectors_general_cols_file$ = makeSymbol("*MT-VECTORS-GENERAL-COLS-FILE*");

    private static final SubLString $str63$_cyc_top_data_mt_vectors_too_gene = makeString("/cyc/top/data/mt-vectors/too-general-cols.txt");

    public static SubLObject useful_mt_for_queryP(final SubLObject query, final SubLObject mt) {
        if ((NIL == query) || (NIL == mt)) {
            return NIL;
        }
        init_mt_vectors();
        final SubLObject query_context = find_context_of_complex_query(query);
        final SubLObject predicates_in_query = find_predicates_in_query(query);
        SubLObject score = NIL;
        final SubLObject mt_id = (mt.isList()) ? kb_utilities.compact_hl_external_id_string(narts_high.find_nart(mt)) : kb_utilities.compact_hl_external_id_string(mt);
        SubLObject cdolist_list_var = $mt_vectors$.getGlobalValue();
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (entry.first().equal(mt_id)) {
                score = cosine_similarity(query_context, second(entry));
                return check_topic_compatibility(query_context, predicates_in_query, score, mt_id);
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        } 
        return T;
    }

    public static SubLObject check_topic_compatibility(final SubLObject v_context, final SubLObject preds, SubLObject score, final SubLObject mt_id) {
        final SubLObject cols = Mapping.mapcar(symbol_function(FIND_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING), Mapping.mapcar(symbol_function(CAR), v_context));
        final SubLObject topic_of_mt = find_topic_of_mt(mt_id);
        final SubLObject topic_membership = add(check_membership_in_topic_cols(cols, topic_of_mt, mt_id), check_membership_in_topic_preds(preds, topic_of_mt));
        if (topic_membership.numG(ZERO_INTEGER)) {
            score = multiply(score, FIFTEEN_INTEGER);
        }
        if (topic_membership.numE($int$_3)) {
            score = divide(score, $int$1000);
        }
        if (topic_membership.numL(ZERO_INTEGER)) {
            score = divide(score, TEN_INTEGER);
        }
        if ((NIL != topic_of_mt) && topic_membership.numE(ZERO_INTEGER)) {
            score = divide(score, TEN_INTEGER);
        }
        return numG(score, $score_threshold$.getGlobalValue());
    }

    public static SubLObject find_context_of_complex_query(final SubLObject query) {
        if (query.first().equal($$thereExists)) {
            return find_context_of_complex_query(nth(TWO_INTEGER, query));
        }
        if (query.first().eql($$and) || query.first().eql($$or)) {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = query.rest();
            SubLObject q = NIL;
            q = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                result = append(result, find_context_of_query(q));
                cdolist_list_var = cdolist_list_var.rest();
                q = cdolist_list_var.first();
            } 
            return aggregate_results(result);
        }
        return find_context_of_query(query);
    }

    public static SubLObject find_predicates_in_query(final SubLObject query) {
        if (query.first().equal($$thereExists)) {
            return find_predicates_in_query(nth(TWO_INTEGER, query));
        }
        if (query.first().eql($$and) || query.first().eql($$or)) {
            return Mapping.mapcar(symbol_function(CAR), query.rest());
        }
        return list(query.first());
    }

    public static SubLObject find_context_of_query(final SubLObject query) {
        final SubLObject non_variables = remove_if(symbol_function(EL_VARIABLE_P), query.rest(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject v_context = NIL;
        SubLObject cdolist_list_var = non_variables;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != isa.isa_in_any_mtP(v_term, $$Collection)) {
                SubLObject lst = NIL;
                lst = cons(list(kb_utilities.compact_hl_external_id_string(v_term), ONE_INTEGER), lst);
                SubLObject cdolist_list_var_$1 = get_context_for_collection(v_term);
                SubLObject cols = NIL;
                cols = cdolist_list_var_$1.first();
                while (NIL != cdolist_list_var_$1) {
                    final SubLObject col = cdar(cols);
                    if (NIL == member(col, $too_general_cols$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) {
                        lst = cons(list(kb_utilities.compact_hl_external_id_string(cdar(cols)), ONE_INTEGER), lst);
                    }
                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                    cols = cdolist_list_var_$1.first();
                } 
                v_context = append(v_context, lst);
            }
            if ((NIL != isa.isa_in_any_mtP(v_term, $$Individual)) && (NIL == isa.isa_in_any_mtP(v_term, $$Predicate))) {
                SubLObject lst = NIL;
                lst = cons(list(kb_utilities.compact_hl_external_id_string(v_term), ONE_INTEGER), lst);
                SubLObject cdolist_list_var_$2 = get_context_for_individual(v_term);
                SubLObject cols = NIL;
                cols = cdolist_list_var_$2.first();
                while (NIL != cdolist_list_var_$2) {
                    final SubLObject col = cdar(cols);
                    if (NIL == member(col, $too_general_cols$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) {
                        lst = cons(list(kb_utilities.compact_hl_external_id_string(cdar(cols)), ONE_INTEGER), lst);
                    }
                    cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                    cols = cdolist_list_var_$2.first();
                } 
                v_context = append(v_context, lst);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return aggregate_results(v_context);
    }

    public static SubLObject get_context_for_collection(final SubLObject collection) {
        return ask_mt_query(list($$assertedSentence, listS($$genls, collection, $list17)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_context_for_individual(final SubLObject individual) {
        return ask_mt_query(list($$assertedSentence, listS($$isa, individual, $list17)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject ask_mt_query(final SubLObject query, SubLObject max_time, SubLObject mt, SubLObject indeterminate_terms) {
        if (max_time == UNPROVIDED) {
            max_time = FIVE_INTEGER;
        }
        if (mt == UNPROVIDED) {
            mt = $$EverythingPSC;
        }
        if (indeterminate_terms == UNPROVIDED) {
            indeterminate_terms = NIL;
        }
        return inference_kernel.new_cyc_query(query, mt, list(new SubLObject[]{ $INFERENCE_MODE, $MINIMAL, $kw22$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_, T, $kw23$ALLOW_INDETERMINATE_RESULTS_, indeterminate_terms, $DISJUNCTION_FREE_EL_VARS_POLICY, $COMPUTE_INTERSECTION, $kw26$ADD_RESTRICTION_LAYER_OF_INDIRECTION_, T, $kw27$NEW_TERMS_ALLOWED_, NIL, $kw28$COMPUTE_ANSWER_JUSTIFICATIONS_, T, $MAX_TIME, max_time, $MAX_TRANSFORMATION_DEPTH, ZERO_INTEGER, $PROBABLY_APPROXIMATELY_DONE, $float$1_0, $ANSWER_LANGUAGE, $HL, $CONTINUABLE_, T, $PRODUCTIVITY_LIMIT, $int$20000000 }));
    }

    public static SubLObject cosine_similarity(final SubLObject vector_1, final SubLObject vector_2) {
        SubLObject result = ZERO_INTEGER;
        SubLObject cdolist_list_var = vector_1;
        SubLObject x = NIL;
        x = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$3 = vector_2;
            SubLObject y = NIL;
            y = cdolist_list_var_$3.first();
            while (NIL != cdolist_list_var_$3) {
                if (x.first().equal(y.first()) && (NIL == member(x.first(), $too_general_cols$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED))) {
                    result = add(result, multiply(second(x), second(y)));
                }
                cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                y = cdolist_list_var_$3.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            x = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject get_mt_information_from_file(final SubLObject filename) {
        SubLObject result = NIL;
        SubLObject stream_var = NIL;
        try {
            SubLObject stream;
            SubLObject line;
            for (stream_var = stream = StreamsLow.open(filename, new SubLObject[]{ $DIRECTION, $INPUT }), line = NIL, line = read(stream, NIL, UNPROVIDED, UNPROVIDED); NIL != line; line = read(stream, NIL, UNPROVIDED, UNPROVIDED)) {
                result = cons(line, result);
            }
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                if (NIL != stream_var) {
                    close(stream_var, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return result;
    }

    public static SubLObject find_useful_mts_for_query(final SubLObject query) {
        final SubLObject query_context = find_context_of_complex_query(query);
        final SubLObject predicates_in_query = find_predicates_in_query(query);
        SubLObject results = NIL;
        final SubLObject tkb_related_queryP = check_tkb_related_query(query_context, predicates_in_query);
        SubLObject cdolist_list_var = $mt_vectors$.getGlobalValue();
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL == terrorism_related_mtP(entry.first())) || (NIL != tkb_related_queryP)) {
                results = cons(list(entry.first(), cosine_similarity(query_context, second(entry))), results);
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        } 
        return sort_similarity_estimates(check_mt_topics(results, query_context, predicates_in_query));
    }

    public static SubLObject check_tkb_related_query(final SubLObject query_context, final SubLObject preds) {
        final SubLObject cols = Mapping.mapcar(symbol_function(FIND_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING), Mapping.mapcar(symbol_function(CAR), query_context));
        return makeBoolean(check_membership_in_topic_cols(cols, $list40, UNPROVIDED).numG(ZERO_INTEGER) || check_membership_in_topic_preds(preds, $list40).numG(ZERO_INTEGER));
    }

    public static SubLObject check_mt_topics(final SubLObject lst, final SubLObject v_context, final SubLObject preds) {
        final SubLObject sorted_lst = Sort.sort(lst, symbol_function($sym41$_), symbol_function(SECOND));
        SubLObject result = NIL;
        final SubLObject cols = Mapping.mapcar(symbol_function(FIND_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING), Mapping.mapcar(symbol_function(CAR), v_context));
        SubLObject count;
        SubLObject entry;
        SubLObject topic_of_mt;
        SubLObject topic_membership;
        for (count = NIL, count = ZERO_INTEGER; count.numL(TWENTY_INTEGER); count = add(count, ONE_INTEGER)) {
            entry = nth(count, sorted_lst);
            topic_of_mt = find_topic_of_mt(entry.first());
            topic_membership = add(check_membership_in_topic_cols(cols, topic_of_mt, entry.first()), check_membership_in_topic_preds(preds, topic_of_mt));
            if ((NIL != topic_of_mt) && topic_membership.numG(ZERO_INTEGER)) {
                result = cons(list(entry.first(), multiply(second(entry), FIFTEEN_INTEGER)), result);
            }
            if ((NIL != topic_of_mt) && topic_membership.numE($int$_2)) {
                result = cons(list(entry.first(), divide(second(entry), $int$100)), result);
            }
            if ((NIL != topic_of_mt) && topic_membership.numL(ZERO_INTEGER)) {
                result = cons(list(entry.first(), divide(second(entry), TEN_INTEGER)), result);
            }
            if ((NIL != topic_of_mt) && topic_membership.numE(ZERO_INTEGER)) {
                result = cons(list(entry.first(), divide(second(entry), TEN_INTEGER)), result);
            }
            if (NIL == topic_of_mt) {
                result = cons(list(entry.first(), second(entry)), result);
            }
        }
        SubLObject cdotimes_end_var;
        SubLObject count2;
        SubLObject entry2;
        for (cdotimes_end_var = subtract(length(sorted_lst), TEN_INTEGER), count2 = NIL, count2 = ZERO_INTEGER; count2.numL(cdotimes_end_var); count2 = add(count2, ONE_INTEGER)) {
            entry2 = nth(add(count2, TEN_INTEGER), sorted_lst);
            result = cons(list(entry2.first(), second(entry2)), result);
        }
        return result;
    }

    public static SubLObject find_topic_of_mt(final SubLObject mt_id) {
        if (NIL != terrorism_related_mtP(mt_id)) {
            return list($$Terrorism_Topic);
        }
        final SubLObject mt = kb_utilities.find_object_by_compact_hl_external_id_string(mt_id);
        return Mapping.mapcar(symbol_function(CDAR), ask_mt_query(listS($$mtTopic, mt, $list48), UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject terrorism_related_mtP(final SubLObject mt_id) {
        final SubLObject mt = kb_utilities.find_object_by_compact_hl_external_id_string(mt_id);
        return eql($$TKBSourceSpindle, kb_mapping_utilities.fpred_value_in_any_mt(mt, $$mtSpindleMember, TWO_INTEGER, ONE_INTEGER, UNPROVIDED));
    }

    public static SubLObject find_cols_for_topic_1(final SubLObject topic) {
        final SubLObject gafs = kb_mapping_utilities.pred_value_gafs_in_any_mt(topic, $$salientSpecForCollectionInTopic, THREE_INTEGER, UNPROVIDED);
        SubLObject result = NIL;
        if (NIL != gafs) {
            SubLObject cdolist_list_var = gafs;
            SubLObject gaf = NIL;
            gaf = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject formula = assertions_high.gaf_formula(gaf);
                result = cons(third(formula), result);
                cdolist_list_var = cdolist_list_var.rest();
                gaf = cdolist_list_var.first();
            } 
        }
        return result;
    }

    public static SubLObject find_preds_for_topic(final SubLObject topic) {
        final SubLObject gafs = kb_mapping_utilities.pred_value_gafs_in_any_mt(topic, $$salientPredicateSpaceForTopic, THREE_INTEGER, UNPROVIDED);
        SubLObject result = NIL;
        if (NIL != gafs) {
            SubLObject cdolist_list_var = gafs;
            SubLObject gaf = NIL;
            gaf = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject formula = assertions_high.gaf_formula(gaf);
                result = cons(list(second(formula), third(formula)), result);
                cdolist_list_var = cdolist_list_var.rest();
                gaf = cdolist_list_var.first();
            } 
        }
        return result;
    }

    public static SubLObject find_cols_for_topic_2(final SubLObject topic) {
        final SubLObject gafs = kb_mapping_utilities.pred_value_gafs_in_any_mt(topic, $$salientCollectionSpaceForTopic, THREE_INTEGER, UNPROVIDED);
        SubLObject result = NIL;
        if (NIL != gafs) {
            SubLObject cdolist_list_var = gafs;
            SubLObject gaf = NIL;
            gaf = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject formula = assertions_high.gaf_formula(gaf);
                result = cons(list(second(formula), third(formula)), result);
                cdolist_list_var = cdolist_list_var.rest();
                gaf = cdolist_list_var.first();
            } 
        }
        return result;
    }

    public static SubLObject check_membership_in_topic_cols(final SubLObject lst, final SubLObject lst_of_topics, SubLObject mt_id) {
        if (mt_id == UNPROVIDED) {
            mt_id = NIL;
        }
        if (NIL != mt_id) {
            final SubLObject mt = kb_utilities.find_object_by_compact_hl_external_id_string(mt_id);
            final SubLObject individuals = find_individual_for_mt(mt);
            if (NIL != individuals) {
                if (NIL != intersection(individuals, lst, symbol_function(EQUAL), UNPROVIDED)) {
                    return ONE_INTEGER;
                }
                return $int$_3;
            }
        }
        if (NIL == lst_of_topics) {
            return ZERO_INTEGER;
        }
        SubLObject lst_of_cols = NIL;
        SubLObject cdolist_list_var = lst_of_topics;
        SubLObject topic = NIL;
        topic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            lst_of_cols = append(lst_of_cols, find_cols_for_topic_1(topic));
            cdolist_list_var = cdolist_list_var.rest();
            topic = cdolist_list_var.first();
        } 
        cdolist_list_var = lst_of_cols;
        SubLObject topic_col = NIL;
        topic_col = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$4 = lst;
            SubLObject col = NIL;
            col = cdolist_list_var_$4.first();
            while (NIL != cdolist_list_var_$4) {
                if (NIL != genls.genlP(col, topic_col, UNPROVIDED, UNPROVIDED)) {
                    return ONE_INTEGER;
                }
                if (NIL != disjoint_with.disjoint_withP(col, topic_col, $$EverythingPSC, UNPROVIDED)) {
                    return MINUS_ONE_INTEGER;
                }
                cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                col = cdolist_list_var_$4.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            topic_col = cdolist_list_var.first();
        } 
        cdolist_list_var = lst;
        SubLObject col2 = NIL;
        col2 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$5 = lst_of_topics;
            SubLObject topic2 = NIL;
            topic2 = cdolist_list_var_$5.first();
            while (NIL != cdolist_list_var_$5) {
                SubLObject cdolist_list_var_$6;
                final SubLObject cols_spaces = cdolist_list_var_$6 = find_cols_for_topic_2(topic2);
                SubLObject cols_space = NIL;
                cols_space = cdolist_list_var_$6.first();
                while (NIL != cdolist_list_var_$6) {
                    final SubLObject lower = cols_space.first();
                    final SubLObject upper = second(cols_space);
                    if ((NIL != genls.genlP(col2, upper, UNPROVIDED, UNPROVIDED)) && (NIL != genls.genlP(lower, col2, UNPROVIDED, UNPROVIDED))) {
                        return ONE_INTEGER;
                    }
                    cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                    cols_space = cdolist_list_var_$6.first();
                } 
                cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                topic2 = cdolist_list_var_$5.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            col2 = cdolist_list_var.first();
        } 
        return ZERO_INTEGER;
    }

    public static SubLObject find_individual_for_mt(final SubLObject mt) {
        final SubLObject gafs = kb_mapping_utilities.pred_value_gafs_in_any_mt(mt, $$salientIndividualForMt, ONE_INTEGER, UNPROVIDED);
        if (NIL != gafs) {
            return Mapping.mapcar(symbol_function(THIRD), Mapping.mapcar(symbol_function(GAF_FORMULA), gafs));
        }
        return NIL;
    }

    public static SubLObject check_membership_in_topic_preds(final SubLObject lst, final SubLObject lst_of_topics) {
        if (NIL == lst_of_topics) {
            return ZERO_INTEGER;
        }
        SubLObject cdolist_list_var = lst;
        SubLObject pred = NIL;
        pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$7 = lst_of_topics;
            SubLObject topic = NIL;
            topic = cdolist_list_var_$7.first();
            while (NIL != cdolist_list_var_$7) {
                SubLObject cdolist_list_var_$8;
                final SubLObject pred_spaces = cdolist_list_var_$8 = find_preds_for_topic(topic);
                SubLObject pred_space = NIL;
                pred_space = cdolist_list_var_$8.first();
                while (NIL != cdolist_list_var_$8) {
                    final SubLObject lower = pred_space.first();
                    final SubLObject upper = second(pred_space);
                    if ((NIL != genl_predicates.genl_predicate_in_any_mtP(pred, upper)) && (NIL != genl_predicates.genl_predicate_in_any_mtP(lower, pred))) {
                        return ONE_INTEGER;
                    }
                    cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                    pred_space = cdolist_list_var_$8.first();
                } 
                cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                topic = cdolist_list_var_$7.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        } 
        return ZERO_INTEGER;
    }

    public static SubLObject get_all_mt_vectors() {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = $mt_vector_files$.getGlobalValue();
        SubLObject file = NIL;
        file = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$9 = get_mt_information_from_file(file);
            SubLObject entry = NIL;
            entry = cdolist_list_var_$9.first();
            while (NIL != cdolist_list_var_$9) {
                result = cons(entry, result);
                cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                entry = cdolist_list_var_$9.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            file = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject sort_similarity_estimates(final SubLObject lst) {
        final SubLObject result = Sort.sort(lst, symbol_function($sym41$_), symbol_function(SECOND));
        SubLObject ret_value = NIL;
        final SubLObject max_val = second(result.first());
        SubLObject cdolist_list_var = result;
        SubLObject x = NIL;
        x = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (second(x).numG(ZERO_INTEGER) && second(x).numG(divide(max_val, TEN_INTEGER))) {
                format(T, $str57$____a__a_, kb_utilities.find_object_by_compact_hl_external_id_string(x.first()), second(x));
                ret_value = cons(kb_utilities.find_object_by_compact_hl_external_id_string(x.first()), ret_value);
            }
            cdolist_list_var = cdolist_list_var.rest();
            x = cdolist_list_var.first();
        } 
        if (length(ret_value).numG(ONE_INTEGER)) {
            ret_value = cons($$MtUnionFn, ret_value);
        }
        return ret_value;
    }

    public static SubLObject aggregate_results(final SubLObject lst) {
        final SubLObject all_collections = Mapping.mapcar(symbol_function(CAR), lst);
        SubLObject result = NIL;
        final SubLObject sum = creduce(symbol_function($sym59$_), Mapping.mapcar(symbol_function(SECOND), lst), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = remove_duplicates(all_collections, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject col = NIL;
        col = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject freq = ZERO_INTEGER;
            SubLObject cdolist_list_var_$10 = lst;
            SubLObject entry = NIL;
            entry = cdolist_list_var_$10.first();
            while (NIL != cdolist_list_var_$10) {
                if (entry.first().equal(col)) {
                    freq = add(freq, second(entry));
                }
                cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                entry = cdolist_list_var_$10.first();
            } 
            result = cons(list(col, divide(freq, sum)), result);
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject init_mt_vectors() {
        if (NIL == $mt_vectors$.getGlobalValue()) {
            $mt_vectors$.setGlobalValue(get_all_mt_vectors());
            $too_general_cols$.setGlobalValue(get_mt_information_from_file($mt_vectors_general_cols_file$.getGlobalValue()));
        }
        return NIL;
    }

    public static SubLObject declare_mt_context_file() {
        declareFunction("useful_mt_for_queryP", "USEFUL-MT-FOR-QUERY?", 2, 0, false);
        declareFunction("check_topic_compatibility", "CHECK-TOPIC-COMPATIBILITY", 4, 0, false);
        declareFunction("find_context_of_complex_query", "FIND-CONTEXT-OF-COMPLEX-QUERY", 1, 0, false);
        declareFunction("find_predicates_in_query", "FIND-PREDICATES-IN-QUERY", 1, 0, false);
        declareFunction("find_context_of_query", "FIND-CONTEXT-OF-QUERY", 1, 0, false);
        declareFunction("get_context_for_collection", "GET-CONTEXT-FOR-COLLECTION", 1, 0, false);
        declareFunction("get_context_for_individual", "GET-CONTEXT-FOR-INDIVIDUAL", 1, 0, false);
        declareFunction("ask_mt_query", "ASK-MT-QUERY", 1, 3, false);
        declareFunction("cosine_similarity", "COSINE-SIMILARITY", 2, 0, false);
        declareFunction("get_mt_information_from_file", "GET-MT-INFORMATION-FROM-FILE", 1, 0, false);
        declareFunction("find_useful_mts_for_query", "FIND-USEFUL-MTS-FOR-QUERY", 1, 0, false);
        declareFunction("check_tkb_related_query", "CHECK-TKB-RELATED-QUERY", 2, 0, false);
        declareFunction("check_mt_topics", "CHECK-MT-TOPICS", 3, 0, false);
        declareFunction("find_topic_of_mt", "FIND-TOPIC-OF-MT", 1, 0, false);
        declareFunction("terrorism_related_mtP", "TERRORISM-RELATED-MT?", 1, 0, false);
        declareFunction("find_cols_for_topic_1", "FIND-COLS-FOR-TOPIC-1", 1, 0, false);
        declareFunction("find_preds_for_topic", "FIND-PREDS-FOR-TOPIC", 1, 0, false);
        declareFunction("find_cols_for_topic_2", "FIND-COLS-FOR-TOPIC-2", 1, 0, false);
        declareFunction("check_membership_in_topic_cols", "CHECK-MEMBERSHIP-IN-TOPIC-COLS", 2, 1, false);
        declareFunction("find_individual_for_mt", "FIND-INDIVIDUAL-FOR-MT", 1, 0, false);
        declareFunction("check_membership_in_topic_preds", "CHECK-MEMBERSHIP-IN-TOPIC-PREDS", 2, 0, false);
        declareFunction("get_all_mt_vectors", "GET-ALL-MT-VECTORS", 0, 0, false);
        declareFunction("sort_similarity_estimates", "SORT-SIMILARITY-ESTIMATES", 1, 0, false);
        declareFunction("aggregate_results", "AGGREGATE-RESULTS", 1, 0, false);
        declareFunction("init_mt_vectors", "INIT-MT-VECTORS", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_mt_context_file() {
        deflexical("*MT-VECTORS*", SubLTrampolineFile.maybeDefault($mt_vectors$, $mt_vectors$, NIL));
        deflexical("*TOO-GENERAL-COLS*", SubLTrampolineFile.maybeDefault($too_general_cols$, $too_general_cols$, NIL));
        deflexical("*SCORE-THRESHOLD*", SubLTrampolineFile.maybeDefault($score_threshold$, $score_threshold$, $float$1_0e_5));
        deflexical("*MT-VECTOR-FILES*", SubLTrampolineFile.maybeDefault($mt_vector_files$, $mt_vector_files$, $list61));
        deflexical("*MT-VECTORS-GENERAL-COLS-FILE*", SubLTrampolineFile.maybeDefault($mt_vectors_general_cols_file$, $mt_vectors_general_cols_file$, $str63$_cyc_top_data_mt_vectors_too_gene));
        return NIL;
    }

    public static SubLObject setup_mt_context_file() {
        declare_defglobal($mt_vectors$);
        declare_defglobal($too_general_cols$);
        declare_defglobal($score_threshold$);
        declare_defglobal($mt_vector_files$);
        declare_defglobal($mt_vectors_general_cols_file$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_mt_context_file();
    }

    @Override
    public void initializeVariables() {
        init_mt_context_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_mt_context_file();
    }

    static {






































































    }
}

/**
 * Total time: 209 ms
 */
