package com.cyc.cycjava.cycl.rtp;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.pph_methods;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.cycjava.cycl.pph_functions;
import com.cyc.cycjava.cycl.pph_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.pph_vars;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.arity;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.set;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rtp_madlibs extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.rtp.rtp_madlibs";
    public static final String myFingerPrint = "0decf2a5592c6b7a21007505a46bc2b752058cdd8f8268b9143cc4fa2ed7c727";
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-madlibs.lisp", position = 4525L)
    private static SubLSymbol $madlib_get_instances_caching_state$;
    private static final SubLObject $const0$assertTemplate_Reln;
    private static final SubLObject $const1$queryTemplate_Reln;
    private static final SubLList $list2;
    private static final SubLString $str3$MAD_LIBS_NOTE__temporarily_puntin;
    private static final SubLSymbol $kw4$IGNORE;
    private static final SubLObject $const5$CycLSentence_Assertible;
    private static final SubLSymbol $sym6$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const7$EverythingPSC;
    private static final SubLInteger $int8$100;
    private static final SubLSymbol $sym9$MADLIB_GET_INSTANCES;
    private static final SubLObject $const10$PositiveInteger;
    private static final SubLObject $const11$PositiveNumber;
    private static final SubLInteger $int12$30;
    private static final SubLSymbol $sym13$GENERATE_RANDOM_NONZERO_NUMBER;
    private static final SubLInteger $int14$1000;
    private static final SubLObject $const15$NonNegativeInteger;
    private static final SubLObject $const16$NonNegativeNumber;
    private static final SubLSymbol $sym17$RANDOM;
    private static final SubLSymbol $kw18$ASCENDING;
    private static final SubLObject $const19$GenericInstanceFn;
    private static final SubLSymbol $sym20$_MADLIB_GET_INSTANCES_CACHING_STATE_;
    private static final SubLList $list21;
    private static final SubLObject $const22$NLPatternList;
    private static final SubLObject $const23$NPTemplate;
    private static final SubLObject $const24$City;
    private static final SubLObject $const25$County;
    private static final SubLObject $const26$STemplate;
    private static final SubLObject $const27$SomeExampleFn;
    private static final SubLObject $const28$NumberTemplate;
    private static final SubLObject $const29$NLPattern_Term;
    private static final SubLObject $const30$posPredForTemplateCategory;
    private static final SubLObject $const31$TemplateParsingMt;
    private static final SubLObject $const32$NLPattern_Word;
    private static final SubLObject $const33$TemplateSententialMarker;
    private static final SubLList $list34;
    private static final SubLList $list35;
    private static final SubLObject $const36$Verb;
    private static final SubLObject $const37$infinitive;
    private static final SubLObject $const38$SpeechPartPredicate;
    private static final SubLList $list39;
    private static final SubLObject $const40$ThirdPerson_NLAttr;
    private static final SubLObject $const41$Singular_NLAttr;
    private static final SubLObject $const42$thirdPersonSg_Generic;
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-madlibs.lisp", position = 1088L)
    public static SubLObject rtp_madlibs_formula_p(final SubLObject formula, SubLObject mt) {
        if (mt == rtp_madlibs.UNPROVIDED) {
            mt = (SubLObject)rtp_madlibs.NIL;
        }
        if (rtp_madlibs.NIL != el_utilities.el_formula_p(formula)) {
            final SubLObject operator = cycl_utilities.formula_operator(formula);
            return (SubLObject)SubLObjectFactory.makeBoolean(rtp_madlibs.NIL != forts.fort_p(operator) && (rtp_madlibs.NIL != genl_predicates.genl_predicateP(operator, rtp_madlibs.$const0$assertTemplate_Reln, mt, (SubLObject)rtp_madlibs.UNPROVIDED) || rtp_madlibs.NIL != genl_predicates.genl_predicateP(operator, rtp_madlibs.$const1$queryTemplate_Reln, mt, (SubLObject)rtp_madlibs.UNPROVIDED)));
        }
        return (SubLObject)rtp_madlibs.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-madlibs.lisp", position = 1501L)
    public static SubLObject rtp_generate_madlibs_via_defn(final SubLObject passed) {
        return rtp_generate_madlibs(cycl_utilities.formula_arg1(passed, (SubLObject)rtp_madlibs.UNPROVIDED), cycl_utilities.formula_arg2(passed, (SubLObject)rtp_madlibs.UNPROVIDED), (SubLObject)rtp_madlibs.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-madlibs.lisp", position = 1815L)
    public static SubLObject rtp_generate_madlibs(final SubLObject spec, final SubLObject this_many, SubLObject mt) {
        if (mt == rtp_madlibs.UNPROVIDED) {
            mt = (SubLObject)rtp_madlibs.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject formula = (rtp_madlibs.NIL != assertion_handles.assertion_p(spec)) ? assertions_high.assertion_formula(spec) : spec;
        if (rtp_madlibs.NIL == rtp_madlibs_formula_p(formula, mt)) {
            return (SubLObject)rtp_madlibs.NIL;
        }
        final SubLObject ret_pairs = set.new_set(Symbols.symbol_function((SubLObject)rtp_madlibs.EQUALP), this_many);
        SubLObject current;
        final SubLObject datum = current = formula;
        SubLObject pred = (SubLObject)rtp_madlibs.NIL;
        SubLObject template_type = (SubLObject)rtp_madlibs.NIL;
        SubLObject reln = (SubLObject)rtp_madlibs.NIL;
        SubLObject syntax = (SubLObject)rtp_madlibs.NIL;
        SubLObject semantics = (SubLObject)rtp_madlibs.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rtp_madlibs.$list2);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rtp_madlibs.$list2);
        template_type = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rtp_madlibs.$list2);
        reln = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rtp_madlibs.$list2);
        syntax = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rtp_madlibs.$list2);
        semantics = current.first();
        current = current.rest();
        if (rtp_madlibs.NIL == current) {
            if (!cycl_utilities.formula_arg0(semantics).equal(reln)) {
                Errors.warn((SubLObject)rtp_madlibs.$str3$MAD_LIBS_NOTE__temporarily_puntin);
                return (SubLObject)rtp_madlibs.NIL;
            }
            final SubLObject keywords_found = dictionary.new_dictionary((SubLObject)rtp_madlibs.UNPROVIDED, (SubLObject)rtp_madlibs.UNPROVIDED);
            SubLObject reln_arity = arity.arity(reln);
            SubLObject number = (SubLObject)rtp_madlibs.ZERO_INTEGER;
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(semantics, (SubLObject)rtp_madlibs.$kw4$IGNORE);
            SubLObject this_key = (SubLObject)rtp_madlibs.NIL;
            this_key = cdolist_list_var.first();
            while (rtp_madlibs.NIL != cdolist_list_var) {
                number = Numbers.add(number, (SubLObject)rtp_madlibs.ONE_INTEGER);
                if (this_key.isKeyword()) {
                    dictionary.dictionary_enter(keywords_found, number, this_key);
                }
                cdolist_list_var = cdolist_list_var.rest();
                this_key = cdolist_list_var.first();
            }
            if (reln_arity.numE((SubLObject)rtp_madlibs.ZERO_INTEGER)) {
                reln_arity = Numbers.max(dictionary.dictionary_keys(keywords_found), rtp_madlibs.EMPTY_SUBL_OBJECT_ARRAY);
            }
            SubLObject i;
            SubLObject synsem_pair;
            SubLObject this_arg;
            SubLObject the_syn;
            SubLObject the_sem;
            for (i = (SubLObject)rtp_madlibs.NIL, i = (SubLObject)rtp_madlibs.ZERO_INTEGER; i.numL(this_many); i = Numbers.add(i, (SubLObject)rtp_madlibs.ONE_INTEGER)) {
                synsem_pair = (SubLObject)ConsesLow.list(syntax, semantics);
                cdolist_list_var = dictionary.dictionary_keys(keywords_found);
                this_arg = (SubLObject)rtp_madlibs.NIL;
                this_arg = cdolist_list_var.first();
                while (rtp_madlibs.NIL != cdolist_list_var) {
                    thread.resetMultipleValues();
                    the_syn = madlib_prep(synsem_pair, dictionary.dictionary_lookup(keywords_found, this_arg, (SubLObject)rtp_madlibs.UNPROVIDED), (rtp_madlibs.NIL != subl_promotions.memberP(rtp_madlibs.$const5$CycLSentence_Assertible, kb_accessors.argn_isa(reln, this_arg, (SubLObject)rtp_madlibs.UNPROVIDED), (SubLObject)rtp_madlibs.UNPROVIDED, (SubLObject)rtp_madlibs.UNPROVIDED)) ? madlib_random_sentence_for_reln(reln, this_arg) : list_utilities.random_element(madlib_get_instances(kb_accessors.argn_isa(reln, this_arg, (SubLObject)rtp_madlibs.UNPROVIDED), kb_accessors.argn_genl(reln, this_arg, (SubLObject)rtp_madlibs.UNPROVIDED), mt)));
                    the_sem = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    synsem_pair = (SubLObject)ConsesLow.list(the_syn, the_sem);
                    cdolist_list_var = cdolist_list_var.rest();
                    this_arg = cdolist_list_var.first();
                }
                set.set_add((SubLObject)ConsesLow.list(madlib_complete(synsem_pair.first(), (SubLObject)rtp_madlibs.UNPROVIDED), conses_high.second(synsem_pair)), ret_pairs);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rtp_madlibs.$list2);
        }
        return ret_pairs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-madlibs.lisp", position = 3617L)
    public static SubLObject madlib_random_sentence_for_reln(final SubLObject reln, final SubLObject arg) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject the_extent = (SubLObject)rtp_madlibs.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)rtp_madlibs.$sym6$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(rtp_madlibs.$const7$EverythingPSC, thread);
            the_extent = kb_mapping.gather_predicate_extent_index(reln, (SubLObject)rtp_madlibs.UNPROVIDED, (SubLObject)rtp_madlibs.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (rtp_madlibs.NIL != list_utilities.proper_list_p(the_extent)) {
            return cycl_utilities.formula_arg(assertions_high.assertion_formula(list_utilities.random_element(the_extent)), arg, (SubLObject)rtp_madlibs.UNPROVIDED);
        }
        return (SubLObject)rtp_madlibs.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-madlibs.lisp", position = 4068L)
    public static SubLObject madlib_list_of_n_numbers_using(final SubLObject n, final SubLObject the_func, SubLObject limit) {
        if (limit == rtp_madlibs.UNPROVIDED) {
            limit = (SubLObject)rtp_madlibs.$int8$100;
        }
        SubLObject numbers = (SubLObject)rtp_madlibs.NIL;
        SubLObject i;
        for (i = (SubLObject)rtp_madlibs.NIL, i = (SubLObject)rtp_madlibs.ZERO_INTEGER; i.numL(n); i = Numbers.add(i, (SubLObject)rtp_madlibs.ONE_INTEGER)) {
            numbers = (SubLObject)ConsesLow.cons(Functions.funcall(the_func, limit), numbers);
        }
        return numbers;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-madlibs.lisp", position = 4525L)
    public static SubLObject clear_madlib_get_instances() {
        final SubLObject cs = rtp_madlibs.$madlib_get_instances_caching_state$.getGlobalValue();
        if (rtp_madlibs.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)rtp_madlibs.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-madlibs.lisp", position = 4525L)
    public static SubLObject remove_madlib_get_instances(final SubLObject isas, final SubLObject v_genls, SubLObject mt) {
        if (mt == rtp_madlibs.UNPROVIDED) {
            mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args(rtp_madlibs.$madlib_get_instances_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(isas, v_genls, mt), (SubLObject)rtp_madlibs.UNPROVIDED, (SubLObject)rtp_madlibs.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-madlibs.lisp", position = 4525L)
    public static SubLObject madlib_get_instances_internal(SubLObject isas, SubLObject v_genls, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rtp_madlibs.NIL != subl_promotions.memberP(rtp_madlibs.$const10$PositiveInteger, isas, (SubLObject)rtp_madlibs.UNPROVIDED, (SubLObject)rtp_madlibs.UNPROVIDED) || rtp_madlibs.NIL != subl_promotions.memberP(rtp_madlibs.$const11$PositiveNumber, isas, (SubLObject)rtp_madlibs.UNPROVIDED, (SubLObject)rtp_madlibs.UNPROVIDED)) {
            return list_utilities.flatten((SubLObject)ConsesLow.list(madlib_list_of_n_numbers_using((SubLObject)rtp_madlibs.$int12$30, Symbols.symbol_function((SubLObject)rtp_madlibs.$sym13$GENERATE_RANDOM_NONZERO_NUMBER), (SubLObject)rtp_madlibs.FIVE_INTEGER), madlib_list_of_n_numbers_using((SubLObject)rtp_madlibs.FIVE_INTEGER, Symbols.symbol_function((SubLObject)rtp_madlibs.$sym13$GENERATE_RANDOM_NONZERO_NUMBER), (SubLObject)rtp_madlibs.$int14$1000)));
        }
        if (rtp_madlibs.NIL != subl_promotions.memberP(rtp_madlibs.$const15$NonNegativeInteger, isas, (SubLObject)rtp_madlibs.UNPROVIDED, (SubLObject)rtp_madlibs.UNPROVIDED) || rtp_madlibs.NIL != subl_promotions.memberP(rtp_madlibs.$const16$NonNegativeNumber, isas, (SubLObject)rtp_madlibs.UNPROVIDED, (SubLObject)rtp_madlibs.UNPROVIDED)) {
            return list_utilities.flatten((SubLObject)ConsesLow.list(madlib_list_of_n_numbers_using((SubLObject)rtp_madlibs.$int12$30, Symbols.symbol_function((SubLObject)rtp_madlibs.$sym17$RANDOM), (SubLObject)rtp_madlibs.FIVE_INTEGER), madlib_list_of_n_numbers_using((SubLObject)rtp_madlibs.FIVE_INTEGER, Symbols.symbol_function((SubLObject)rtp_madlibs.$sym17$RANDOM), (SubLObject)rtp_madlibs.$int14$1000)));
        }
        isas = cardinality_estimates.sort_by_generality_estimate(isas, (SubLObject)rtp_madlibs.$kw18$ASCENDING);
        if (rtp_madlibs.NIL != v_genls) {
            v_genls = cardinality_estimates.sort_by_generality_estimate(v_genls, (SubLObject)rtp_madlibs.$kw18$ASCENDING);
        }
        final SubLObject tmp = (mt.eql(rtp_madlibs.$const7$EverythingPSC) || mt.eql(pph_vars.$pph_domain_mt$.getDynamicValue(thread))) ? isa.all_fort_instances_in_all_mts(isas.first()) : isa.instances(isas.first(), mt, (SubLObject)rtp_madlibs.UNPROVIDED);
        SubLObject tmp_list = (SubLObject)rtp_madlibs.NIL;
        final SubLObject single_isasP = Numbers.numE(Sequences.length(isas), (SubLObject)rtp_madlibs.ONE_INTEGER);
        SubLObject cdolist_list_var = tmp;
        SubLObject this_isa = (SubLObject)rtp_madlibs.NIL;
        this_isa = cdolist_list_var.first();
        while (rtp_madlibs.NIL != cdolist_list_var) {
            if ((rtp_madlibs.NIL != single_isasP || rtp_madlibs.NIL != isa.all_isaP(this_isa, isas.rest(), mt, (SubLObject)rtp_madlibs.UNPROVIDED)) && (rtp_madlibs.NIL == v_genls || rtp_madlibs.NIL != isa.all_isaP(this_isa, v_genls, mt, (SubLObject)rtp_madlibs.UNPROVIDED))) {
                tmp_list = (SubLObject)ConsesLow.cons(this_isa, tmp_list);
            }
            cdolist_list_var = cdolist_list_var.rest();
            this_isa = cdolist_list_var.first();
        }
        return (SubLObject)((rtp_madlibs.NIL != tmp_list) ? tmp_list : ConsesLow.list((SubLObject)ConsesLow.list(rtp_madlibs.$const19$GenericInstanceFn, (rtp_madlibs.NIL != list_utilities.proper_list_p(v_genls)) ? v_genls.first() : isas.first())));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-madlibs.lisp", position = 4525L)
    public static SubLObject madlib_get_instances(final SubLObject isas, final SubLObject v_genls, SubLObject mt) {
        if (mt == rtp_madlibs.UNPROVIDED) {
            mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        SubLObject caching_state = rtp_madlibs.$madlib_get_instances_caching_state$.getGlobalValue();
        if (rtp_madlibs.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)rtp_madlibs.$sym9$MADLIB_GET_INSTANCES, (SubLObject)rtp_madlibs.$sym20$_MADLIB_GET_INSTANCES_CACHING_STATE_, (SubLObject)rtp_madlibs.NIL, (SubLObject)rtp_madlibs.EQUALP, (SubLObject)rtp_madlibs.THREE_INTEGER, (SubLObject)rtp_madlibs.EIGHT_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(isas, v_genls, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)rtp_madlibs.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)rtp_madlibs.NIL;
            collision = cdolist_list_var.first();
            while (rtp_madlibs.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (isas.equalp(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (v_genls.equalp(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (rtp_madlibs.NIL != cached_args && rtp_madlibs.NIL == cached_args.rest() && mt.equalp(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(madlib_get_instances_internal(isas, v_genls, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(isas, v_genls, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-madlibs.lisp", position = 6060L)
    public static SubLObject madlib_prep(final SubLObject pair, final SubLObject keyword, final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!pair.isList() || !pair.first().isList()) {
            return pair;
        }
        SubLObject syntax = (SubLObject)rtp_madlibs.NIL;
        SubLObject semantics = (SubLObject)rtp_madlibs.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(pair, pair, (SubLObject)rtp_madlibs.$list21);
        syntax = pair.first();
        SubLObject current = pair.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, pair, (SubLObject)rtp_madlibs.$list21);
        semantics = current.first();
        current = current.rest();
        if (rtp_madlibs.NIL == current) {
            SubLObject result = (SubLObject)rtp_madlibs.NIL;
            SubLObject cdolist_list_var = syntax;
            SubLObject branch = (SubLObject)rtp_madlibs.NIL;
            branch = cdolist_list_var.first();
            while (rtp_madlibs.NIL != cdolist_list_var) {
                if (!branch.eql(rtp_madlibs.$const22$NLPatternList)) {
                    if (!branch.isList()) {
                        result = (SubLObject)ConsesLow.cons(branch, result);
                    }
                    else if (rtp_madlibs.NIL != rtp_type_checkers.valid_rtp_slotted_itemP(branch)) {
                        SubLObject cdolist_list_var_$1;
                        final SubLObject args = cdolist_list_var_$1 = cycl_utilities.formula_args(branch, (SubLObject)rtp_madlibs.$kw4$IGNORE);
                        SubLObject this_twig = (SubLObject)rtp_madlibs.NIL;
                        this_twig = cdolist_list_var_$1.first();
                        while (rtp_madlibs.NIL != cdolist_list_var_$1) {
                            thread.resetMultipleValues();
                            final SubLObject the_syn = madlib_prep((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(this_twig), semantics), keyword, v_term);
                            final SubLObject the_sem = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            SubLObject cdolist_list_var_$2 = the_syn;
                            SubLObject this_syn = (SubLObject)rtp_madlibs.NIL;
                            this_syn = cdolist_list_var_$2.first();
                            while (rtp_madlibs.NIL != cdolist_list_var_$2) {
                                result = (SubLObject)ConsesLow.cons(this_syn, result);
                                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                                this_syn = cdolist_list_var_$2.first();
                            }
                            semantics = the_sem;
                            cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                            this_twig = cdolist_list_var_$1.first();
                        }
                    }
                    else if (rtp_madlibs.NIL != rtp_type_checkers.valid_rtp_recursive_itemP(branch, keyword)) {
                        final SubLObject template = rtp_type_checkers.recursive_item_template_category(branch);
                        if (template.eql(rtp_madlibs.$const23$NPTemplate)) {
                            if (rtp_madlibs.NIL != pph_utilities.pph_isaP(v_term, rtp_madlibs.$const24$City, (SubLObject)rtp_madlibs.UNPROVIDED)) {
                                result = (SubLObject)ConsesLow.cons(el_utilities.make_unary_formula(pph_functions.termparaphrasefn_citywithstateorprovinceabbreviation(), v_term), result);
                            }
                            else if (rtp_madlibs.NIL != pph_utilities.pph_isaP(v_term, rtp_madlibs.$const25$County, (SubLObject)rtp_madlibs.UNPROVIDED)) {
                                result = (SubLObject)ConsesLow.cons(el_utilities.make_unary_formula(pph_functions.termparaphrasefn_countywithstateorprovincename(), v_term), result);
                            }
                            else {
                                result = (SubLObject)ConsesLow.cons(el_utilities.make_unary_formula(pph_functions.termparaphrasefn_np(), v_term), result);
                            }
                        }
                        else if (template.eql(rtp_madlibs.$const26$STemplate)) {
                            if (rtp_madlibs.NIL != v_term) {
                                result = (SubLObject)ConsesLow.cons(el_utilities.make_unary_formula(pph_functions.termparaphrasefn(), v_term), result);
                            }
                            else {
                                result = (SubLObject)ConsesLow.cons(el_utilities.make_unary_formula(pph_functions.termparaphrasefn(), (SubLObject)ConsesLow.list(rtp_madlibs.$const27$SomeExampleFn, rtp_madlibs.$const26$STemplate)), result);
                            }
                        }
                        else if (template.eql(rtp_madlibs.$const28$NumberTemplate)) {
                            result = (SubLObject)ConsesLow.cons(el_utilities.make_unary_formula(pph_functions.termparaphrasefn(), v_term), result);
                        }
                        else {
                            result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(rtp_madlibs.$const29$NLPattern_Term, (SubLObject)ConsesLow.list(v_term, cycl_utilities.formula_arg1(assertions_high.assertion_formula(kb_mapping.gather_gaf_arg_index(template, (SubLObject)rtp_madlibs.TWO_INTEGER, rtp_madlibs.$const30$posPredForTemplateCategory, rtp_madlibs.$const31$TemplateParsingMt, (SubLObject)rtp_madlibs.UNPROVIDED).first()), (SubLObject)rtp_madlibs.UNPROVIDED))), result);
                        }
                    }
                    else if (rtp_madlibs.NIL != rtp_type_checkers.rtp_word_itemP(branch)) {
                        result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(rtp_madlibs.$const32$NLPattern_Word, branch), result);
                    }
                    else if (cycl_utilities.formula_arg0(branch).eql(rtp_madlibs.$const32$NLPattern_Word)) {
                        result = (SubLObject)ConsesLow.cons(branch, result);
                    }
                    else if (rtp_madlibs.NIL != rtp_type_checkers.optional_template_item(branch)) {
                        SubLObject relevant = (SubLObject)rtp_madlibs.NIL;
                        SubLObject cdolist_list_var_$3 = cycl_utilities.formula_args(branch, (SubLObject)rtp_madlibs.UNPROVIDED);
                        SubLObject this_option = (SubLObject)rtp_madlibs.NIL;
                        this_option = cdolist_list_var_$3.first();
                        while (rtp_madlibs.NIL != cdolist_list_var_$3) {
                            if (rtp_madlibs.NIL == pph_utilities.pph_isaP(this_option, rtp_madlibs.$const33$TemplateSententialMarker, (SubLObject)rtp_madlibs.UNPROVIDED)) {
                                relevant = (SubLObject)ConsesLow.cons(this_option, relevant);
                            }
                            cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                            this_option = cdolist_list_var_$3.first();
                        }
                        if (rtp_madlibs.NIL != relevant) {
                            result = (SubLObject)ConsesLow.cons(madlib_prep((SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons(cycl_utilities.formula_arg0(branch), relevant), semantics), keyword, v_term), result);
                        }
                    }
                    else {
                        result = (SubLObject)ConsesLow.cons(branch, result);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                branch = cdolist_list_var.first();
            }
            return Values.values(Sequences.reverse(result), Sequences.substitute(v_term, keyword, semantics, (SubLObject)rtp_madlibs.UNPROVIDED, (SubLObject)rtp_madlibs.UNPROVIDED, (SubLObject)rtp_madlibs.UNPROVIDED, (SubLObject)rtp_madlibs.UNPROVIDED, (SubLObject)rtp_madlibs.UNPROVIDED));
        }
        cdestructuring_bind.cdestructuring_bind_error(pair, (SubLObject)rtp_madlibs.$list21);
        return (SubLObject)rtp_madlibs.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-madlibs.lisp", position = 8648L)
    public static SubLObject madlib_complete(final SubLObject this_template, SubLObject nested) {
        if (nested == rtp_madlibs.UNPROVIDED) {
            nested = (SubLObject)rtp_madlibs.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject for_gen = (SubLObject)((rtp_madlibs.NIL != nested) ? rtp_madlibs.NIL : ConsesLow.list(pph_functions.concatenatephrasesfn()));
        SubLObject found_tensed_verbP = (SubLObject)rtp_madlibs.NIL;
        SubLObject main_subject_guess = (SubLObject)rtp_madlibs.NIL;
        if (rtp_madlibs.NIL == nested) {
            final SubLObject terms = cycl_utilities.formula_terms(this_template, (SubLObject)rtp_madlibs.$kw4$IGNORE);
            SubLObject rest;
            SubLObject this_item;
            SubLObject current;
            SubLObject datum;
            SubLObject func;
            SubLObject v_term;
            for (rest = (SubLObject)rtp_madlibs.NIL, rest = terms; rtp_madlibs.NIL == main_subject_guess && rtp_madlibs.NIL != rest; rest = rest.rest()) {
                this_item = rest.first();
                if (this_item.isList() && rtp_madlibs.NIL != list_utilities.lengthE(this_item, (SubLObject)rtp_madlibs.TWO_INTEGER, (SubLObject)rtp_madlibs.UNPROVIDED)) {
                    datum = (current = this_item);
                    func = (SubLObject)rtp_madlibs.NIL;
                    v_term = (SubLObject)rtp_madlibs.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rtp_madlibs.$list34);
                    func = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rtp_madlibs.$list34);
                    v_term = current.first();
                    current = current.rest();
                    if (rtp_madlibs.NIL == current) {
                        if (func.eql(pph_functions.termparaphrasefn_np())) {
                            main_subject_guess = v_term;
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rtp_madlibs.$list34);
                    }
                }
            }
        }
        SubLObject cdolist_list_var = this_template;
        SubLObject this_item2 = (SubLObject)rtp_madlibs.NIL;
        this_item2 = cdolist_list_var.first();
        while (rtp_madlibs.NIL != cdolist_list_var) {
            if (this_item2.isString()) {
                if (rtp_madlibs.NIL == pph_utilities.pph_final_punctuation_string_p(this_item2)) {
                    for_gen = (SubLObject)ConsesLow.cons(el_utilities.make_unary_formula(pph_functions.bestnlphraseofstringfn(), this_item2), for_gen);
                }
            }
            else if (rtp_madlibs.NIL == pph_utilities.pph_isaP(this_item2, rtp_madlibs.$const33$TemplateSententialMarker, (SubLObject)rtp_madlibs.UNPROVIDED)) {
                if (rtp_madlibs.NIL != rtp_type_checkers.rtp_word_sequence_itemP(this_item2)) {
                    if (rtp_madlibs.NIL != nested) {
                        SubLObject the_sequence = (SubLObject)rtp_madlibs.NIL;
                        SubLObject the_completion = (SubLObject)rtp_madlibs.NIL;
                        SubLObject cdolist_list_var_$4 = cycl_utilities.formula_args(this_item2, (SubLObject)rtp_madlibs.UNPROVIDED);
                        SubLObject this_bit = (SubLObject)rtp_madlibs.NIL;
                        this_bit = cdolist_list_var_$4.first();
                        while (rtp_madlibs.NIL != cdolist_list_var_$4) {
                            the_completion = madlib_complete((SubLObject)((rtp_madlibs.NIL != rtp_type_checkers.rtp_word_itemP(this_bit)) ? ConsesLow.cons(rtp_madlibs.$const32$NLPattern_Word, this_bit) : ConsesLow.list(this_bit)), (SubLObject)rtp_madlibs.T).first();
                            if (rtp_madlibs.NIL != the_completion) {
                                the_sequence = (SubLObject)ConsesLow.cons(the_completion, the_sequence);
                            }
                            cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                            this_bit = cdolist_list_var_$4.first();
                        }
                        return the_sequence;
                    }
                    SubLObject the_completion2 = (SubLObject)rtp_madlibs.NIL;
                    SubLObject cdolist_list_var_$5 = cycl_utilities.formula_args(this_item2, (SubLObject)rtp_madlibs.UNPROVIDED);
                    SubLObject this_bit2 = (SubLObject)rtp_madlibs.NIL;
                    this_bit2 = cdolist_list_var_$5.first();
                    while (rtp_madlibs.NIL != cdolist_list_var_$5) {
                        the_completion2 = madlib_complete((SubLObject)((rtp_madlibs.NIL != rtp_type_checkers.rtp_word_itemP(this_bit2)) ? ConsesLow.cons(rtp_madlibs.$const32$NLPattern_Word, this_bit2) : ConsesLow.list(this_bit2)), (SubLObject)rtp_madlibs.T).first();
                        if (rtp_madlibs.NIL != the_completion2) {
                            for_gen = (SubLObject)ConsesLow.cons(the_completion2, for_gen);
                        }
                        cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                        this_bit2 = cdolist_list_var_$5.first();
                    }
                }
                else if (cycl_utilities.formula_arg0(this_item2).eql(pph_functions.termparaphrasefn_np())) {
                    for_gen = (SubLObject)ConsesLow.cons(this_item2, for_gen);
                }
                else if (rtp_madlibs.NIL != rtp_type_checkers.rtp_cyc_term_item(this_item2)) {
                    for_gen = (SubLObject)ConsesLow.cons(el_utilities.make_binary_formula(pph_functions.termparaphrasefn_constrained(), madlib_complete_choose_pospred(cycl_utilities.formula_arg2(this_item2, (SubLObject)rtp_madlibs.UNPROVIDED)), cycl_utilities.formula_arg1(this_item2, (SubLObject)rtp_madlibs.UNPROVIDED)), for_gen);
                }
                else if (cycl_utilities.formula_arg0(this_item2).eql(rtp_madlibs.$const32$NLPattern_Word)) {
                    SubLObject current2;
                    final SubLObject datum2 = current2 = this_item2;
                    SubLObject func2 = (SubLObject)rtp_madlibs.NIL;
                    SubLObject word = (SubLObject)rtp_madlibs.NIL;
                    SubLObject pos = (SubLObject)rtp_madlibs.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)rtp_madlibs.$list35);
                    func2 = current2.first();
                    current2 = current2.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)rtp_madlibs.$list35);
                    word = current2.first();
                    current2 = current2.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)rtp_madlibs.$list35);
                    pos = current2.first();
                    current2 = current2.rest();
                    if (rtp_madlibs.NIL == current2) {
                        final SubLObject the_pred = madlib_complete_choose_pospred(pos);
                        if (rtp_madlibs.NIL != found_tensed_verbP && rtp_madlibs.NIL != pph_utilities.pph_genlP(pos, rtp_madlibs.$const36$Verb, (SubLObject)rtp_madlibs.UNPROVIDED)) {
                            for_gen = (SubLObject)ConsesLow.cons(el_utilities.make_binary_formula(pph_functions.bestnlwordformoflexemefn_constrained(), rtp_madlibs.$const37$infinitive, word), for_gen);
                        }
                        else if (rtp_madlibs.NIL != pph_utilities.pph_genlP(pos, rtp_madlibs.$const36$Verb, (SubLObject)rtp_madlibs.UNPROVIDED)) {
                            for_gen = (SubLObject)ConsesLow.cons(el_utilities.make_binary_formula(pph_functions.bestnlwordformoflexemefn_constrained(), madlib_best_pred_for_term_and_tense(main_subject_guess, the_pred), word), for_gen);
                            found_tensed_verbP = (SubLObject)rtp_madlibs.T;
                        }
                        else {
                            for_gen = (SubLObject)ConsesLow.cons(el_utilities.make_binary_formula(pph_functions.bestnlwordformoflexemefn_constrained(), the_pred, cycl_utilities.formula_arg1(this_item2, (SubLObject)rtp_madlibs.UNPROVIDED)), for_gen);
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum2, (SubLObject)rtp_madlibs.$list35);
                    }
                }
                else if (rtp_madlibs.NIL != rtp_type_checkers.rtp_word_itemP(this_item2)) {
                    thread.resetMultipleValues();
                    final SubLObject main_result = madlib_complete((SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons(rtp_madlibs.$const32$NLPattern_Word, this_item2)), (SubLObject)rtp_madlibs.T);
                    final SubLObject found_verbP = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    for_gen = (SubLObject)ConsesLow.cons(main_result.first(), for_gen);
                    if (rtp_madlibs.NIL != found_verbP) {
                        found_tensed_verbP = (SubLObject)rtp_madlibs.T;
                    }
                }
                else if (rtp_madlibs.NIL != rtp_type_checkers.rtp_optional_template_itemP(this_item2)) {
                    if (random.random((SubLObject)rtp_madlibs.TWO_INTEGER).numE((SubLObject)rtp_madlibs.ZERO_INTEGER)) {
                        final SubLObject chosen = cycl_utilities.formula_arg(this_item2, number_utilities.f_1X(random.random(el_utilities.formula_arity(this_item2, (SubLObject)rtp_madlibs.UNPROVIDED))), (SubLObject)rtp_madlibs.UNPROVIDED);
                        thread.resetMultipleValues();
                        final SubLObject returned = madlib_complete((SubLObject)ConsesLow.list(chosen), (SubLObject)rtp_madlibs.T);
                        final SubLObject verbP = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (rtp_madlibs.NIL != rtp_type_checkers.rtp_word_sequence_itemP(chosen)) {
                            SubLObject cdolist_list_var_$6 = Sequences.reverse(returned);
                            SubLObject this_bit3 = (SubLObject)rtp_madlibs.NIL;
                            this_bit3 = cdolist_list_var_$6.first();
                            while (rtp_madlibs.NIL != cdolist_list_var_$6) {
                                for_gen = (SubLObject)ConsesLow.cons(this_bit3, for_gen);
                                cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                                this_bit3 = cdolist_list_var_$6.first();
                            }
                        }
                        else {
                            for_gen = (SubLObject)ConsesLow.cons(returned.first(), for_gen);
                        }
                        if (rtp_madlibs.NIL != verbP) {
                            found_tensed_verbP = (SubLObject)rtp_madlibs.T;
                        }
                    }
                }
                else if (rtp_madlibs.NIL != rtp_type_checkers.rtp_required_itemP(this_item2)) {
                    final SubLObject chosen = cycl_utilities.formula_arg(this_item2, number_utilities.f_1X(random.random(el_utilities.formula_arity(this_item2, (SubLObject)rtp_madlibs.UNPROVIDED))), (SubLObject)rtp_madlibs.UNPROVIDED);
                    thread.resetMultipleValues();
                    final SubLObject returned = madlib_complete((SubLObject)ConsesLow.list(chosen), (SubLObject)rtp_madlibs.T);
                    final SubLObject verbP = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (rtp_madlibs.NIL != rtp_type_checkers.rtp_word_sequence_itemP(chosen)) {
                        SubLObject cdolist_list_var_$7 = Sequences.reverse(returned);
                        SubLObject this_bit3 = (SubLObject)rtp_madlibs.NIL;
                        this_bit3 = cdolist_list_var_$7.first();
                        while (rtp_madlibs.NIL != cdolist_list_var_$7) {
                            for_gen = (SubLObject)ConsesLow.cons(this_bit3, for_gen);
                            cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                            this_bit3 = cdolist_list_var_$7.first();
                        }
                    }
                    else {
                        for_gen = (SubLObject)ConsesLow.cons(returned.first(), for_gen);
                    }
                    if (rtp_madlibs.NIL != verbP) {
                        found_tensed_verbP = (SubLObject)rtp_madlibs.T;
                    }
                }
                else {
                    for_gen = (SubLObject)ConsesLow.cons(this_item2, for_gen);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            this_item2 = cdolist_list_var.first();
        }
        if (rtp_madlibs.NIL == nested) {
            main_subject_guess = (SubLObject)rtp_madlibs.NIL;
        }
        return Values.values(Sequences.reverse(for_gen), found_tensed_verbP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-madlibs.lisp", position = 12982L)
    public static SubLObject madlib_complete_choose_pospred(final SubLObject pos) {
        if (rtp_madlibs.NIL != isa.isa_in_any_mtP(pos, rtp_madlibs.$const38$SpeechPartPredicate)) {
            return pos;
        }
        if (rtp_madlibs.NIL != pph_utilities.pph_genlP(pos, rtp_madlibs.$const36$Verb, (SubLObject)rtp_madlibs.UNPROVIDED)) {
            return list_utilities.random_element((SubLObject)rtp_madlibs.$list39);
        }
        return pos;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-madlibs.lisp", position = 13522L)
    public static SubLObject madlib_best_pred_for_term_and_tense(final SubLObject v_term, final SubLObject tense) {
        if (pph_methods.pph_person(v_term).eql(rtp_madlibs.$const40$ThirdPerson_NLAttr) && pph_methods.pph_number(v_term).eql(rtp_madlibs.$const41$Singular_NLAttr)) {
            return pph_utilities.pph_unify_speech_part_preds((SubLObject)ConsesLow.list(rtp_madlibs.$const42$thirdPersonSg_Generic, tense));
        }
        return tense;
    }
    
    public static SubLObject declare_rtp_madlibs_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_madlibs", "rtp_madlibs_formula_p", "RTP-MADLIBS-FORMULA-P", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_madlibs", "rtp_generate_madlibs_via_defn", "RTP-GENERATE-MADLIBS-VIA-DEFN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_madlibs", "rtp_generate_madlibs", "RTP-GENERATE-MADLIBS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_madlibs", "madlib_random_sentence_for_reln", "MADLIB-RANDOM-SENTENCE-FOR-RELN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_madlibs", "madlib_list_of_n_numbers_using", "MADLIB-LIST-OF-N-NUMBERS-USING", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_madlibs", "clear_madlib_get_instances", "CLEAR-MADLIB-GET-INSTANCES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_madlibs", "remove_madlib_get_instances", "REMOVE-MADLIB-GET-INSTANCES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_madlibs", "madlib_get_instances_internal", "MADLIB-GET-INSTANCES-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_madlibs", "madlib_get_instances", "MADLIB-GET-INSTANCES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_madlibs", "madlib_prep", "MADLIB-PREP", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_madlibs", "madlib_complete", "MADLIB-COMPLETE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_madlibs", "madlib_complete_choose_pospred", "MADLIB-COMPLETE-CHOOSE-POSPRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_madlibs", "madlib_best_pred_for_term_and_tense", "MADLIB-BEST-PRED-FOR-TERM-AND-TENSE", 2, 0, false);
        return (SubLObject)rtp_madlibs.NIL;
    }
    
    public static SubLObject init_rtp_madlibs_file() {
        rtp_madlibs.$madlib_get_instances_caching_state$ = SubLFiles.deflexical("*MADLIB-GET-INSTANCES-CACHING-STATE*", (SubLObject)rtp_madlibs.NIL);
        return (SubLObject)rtp_madlibs.NIL;
    }
    
    public static SubLObject setup_rtp_madlibs_file() {
        memoization_state.note_globally_cached_function((SubLObject)rtp_madlibs.$sym9$MADLIB_GET_INSTANCES);
        return (SubLObject)rtp_madlibs.NIL;
    }
    
    public void declareFunctions() {
        declare_rtp_madlibs_file();
    }
    
    public void initializeVariables() {
        init_rtp_madlibs_file();
    }
    
    public void runTopLevelForms() {
        setup_rtp_madlibs_file();
    }
    
    static {
        me = (SubLFile)new rtp_madlibs();
        rtp_madlibs.$madlib_get_instances_caching_state$ = null;
        $const0$assertTemplate_Reln = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertTemplate-Reln"));
        $const1$queryTemplate_Reln = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("queryTemplate-Reln"));
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("RELN"), (SubLObject)SubLObjectFactory.makeSymbol("SYNTAX"), (SubLObject)SubLObjectFactory.makeSymbol("SEMANTICS"));
        $str3$MAD_LIBS_NOTE__temporarily_puntin = SubLObjectFactory.makeString("MAD LIBS NOTE: temporarily punting cases where semantics' arg0 isn't the reln");
        $kw4$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $const5$CycLSentence_Assertible = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLSentence-Assertible"));
        $sym6$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const7$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $int8$100 = SubLObjectFactory.makeInteger(100);
        $sym9$MADLIB_GET_INSTANCES = SubLObjectFactory.makeSymbol("MADLIB-GET-INSTANCES");
        $const10$PositiveInteger = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PositiveInteger"));
        $const11$PositiveNumber = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PositiveNumber"));
        $int12$30 = SubLObjectFactory.makeInteger(30);
        $sym13$GENERATE_RANDOM_NONZERO_NUMBER = SubLObjectFactory.makeSymbol("GENERATE-RANDOM-NONZERO-NUMBER");
        $int14$1000 = SubLObjectFactory.makeInteger(1000);
        $const15$NonNegativeInteger = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NonNegativeInteger"));
        $const16$NonNegativeNumber = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NonNegativeNumber"));
        $sym17$RANDOM = SubLObjectFactory.makeSymbol("RANDOM");
        $kw18$ASCENDING = SubLObjectFactory.makeKeyword("ASCENDING");
        $const19$GenericInstanceFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GenericInstanceFn"));
        $sym20$_MADLIB_GET_INSTANCES_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*MADLIB-GET-INSTANCES-CACHING-STATE*");
        $list21 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYNTAX"), (SubLObject)SubLObjectFactory.makeSymbol("SEMANTICS"));
        $const22$NLPatternList = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLPatternList"));
        $const23$NPTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NPTemplate"));
        $const24$City = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("City"));
        $const25$County = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("County"));
        $const26$STemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("STemplate"));
        $const27$SomeExampleFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SomeExampleFn"));
        $const28$NumberTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NumberTemplate"));
        $const29$NLPattern_Term = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLPattern-Term"));
        $const30$posPredForTemplateCategory = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("posPredForTemplateCategory"));
        $const31$TemplateParsingMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TemplateParsingMt"));
        $const32$NLPattern_Word = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLPattern-Word"));
        $const33$TemplateSententialMarker = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TemplateSententialMarker"));
        $list34 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"));
        $list35 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)SubLObjectFactory.makeSymbol("POS"));
        $const36$Verb = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Verb"));
        $const37$infinitive = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("infinitive"));
        $const38$SpeechPartPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SpeechPartPredicate"));
        $list39 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("simplePresent-Generic")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("simplePast-Generic")));
        $const40$ThirdPerson_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ThirdPerson-NLAttr"));
        $const41$Singular_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Singular-NLAttr"));
        $const42$thirdPersonSg_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thirdPersonSg-Generic"));
    }
}

/*

	Total time: 137 ms
	
*/