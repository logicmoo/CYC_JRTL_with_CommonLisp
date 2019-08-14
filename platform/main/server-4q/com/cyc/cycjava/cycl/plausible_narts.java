package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_unary_formula;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.char_equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.expt;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.floor;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.log;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.min;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.creduce;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.vector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.intersection;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class plausible_narts extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new plausible_narts();

    public static final String myName = "com.cyc.cycjava_2.cycl.plausible_narts";








    // defparameter
    private static final SubLSymbol $default_plausibility_mt$ = makeSymbol("*DEFAULT-PLAUSIBILITY-MT*");

    // defparameter
    private static final SubLSymbol $not_useful_cols_for_similarity_computations$ = makeSymbol("*NOT-USEFUL-COLS-FOR-SIMILARITY-COMPUTATIONS*");





    private static final SubLSymbol $default_nart_plausibility$ = makeSymbol("*DEFAULT-NART-PLAUSIBILITY*");

    private static final SubLList $list1 = list(reader_make_constant_shell(makeString("NumericLikelihoodFn")), makeDouble(0.5));

    private static final SubLSymbol $too_general_cols_for_plausibility$ = makeSymbol("*TOO-GENERAL-COLS-FOR-PLAUSIBILITY*");

    private static final SubLList $list3 = list(reader_make_constant_shell(makeString("Situation")));

    private static final SubLSymbol $nart_functions$ = makeSymbol("*NART-FUNCTIONS*");

    private static final SubLList $list5 = list(reader_make_constant_shell(makeString("SitTypeSpecWithTypeRestrictionOnRolePlayerFn")), reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("SubcollectionOfWithRelationFromTypeFn")), reader_make_constant_shell(makeString("SubcollectionOfWithRelationFromFn")), reader_make_constant_shell(makeString("CompositeActivityFn")), reader_make_constant_shell(makeString("CollectionIntersection2Fn")), reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")));

    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLList $list7 = list(reader_make_constant_shell(makeString("owl:Thing")), reader_make_constant_shell(makeString("BiologySCGTemplateAdmittedIndividual")), reader_make_constant_shell(makeString("PartiallyIntangibleIndividual")), reader_make_constant_shell(makeString("differentSymbols")), reader_make_constant_shell(makeString("different")), list(reader_make_constant_shell(makeString("CollectionUnionFn")), list(reader_make_constant_shell(makeString("TheSet")), reader_make_constant_shell(makeString("Action")), vector(new SubLObject[]{ reader_make_constant_shell(makeString("CollectionUnionFn")), list(reader_make_constant_shell(makeString("TheSet")), reader_make_constant_shell(makeString("Person")), reader_make_constant_shell(makeString("MultiPersonAgent"))) }))));



    private static final SubLObject $$sentencePlausibilityScore = reader_make_constant_shell(makeString("sentencePlausibilityScore"));

    private static final SubLObject $$NumericLikelihoodFn = reader_make_constant_shell(makeString("NumericLikelihoodFn"));

    private static final SubLFloat $float$0_5 = makeDouble(0.5);

    private static final SubLObject $$equalSymbols = reader_make_constant_shell(makeString("equalSymbols"));

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLSymbol $sym15$_X = makeSymbol("?X");



    private static final SubLObject $$relationInstanceExists = reader_make_constant_shell(makeString("relationInstanceExists"));

    private static final SubLObject $$biologicalFunction = reader_make_constant_shell(makeString("biologicalFunction"));

    private static final SubLObject $$definitionalDisplaySentence = reader_make_constant_shell(makeString("definitionalDisplaySentence"));

    private static final SubLList $list20 = list(reader_make_constant_shell(makeString("TypeCapableFn")), reader_make_constant_shell(makeString("behaviorCapable")));

    private static final SubLObject $const21$sentenceJustifications_ProofViewS = reader_make_constant_shell(makeString("sentenceJustifications-ProofViewSummary"));

    private static final SubLObject $$relationExistsInstance = reader_make_constant_shell(makeString("relationExistsInstance"));

    private static final SubLObject $$thereExists = reader_make_constant_shell(makeString("thereExists"));

    private static final SubLObject $$GroupFn = reader_make_constant_shell(makeString("GroupFn"));

    private static final SubLObject $$Thing = reader_make_constant_shell(makeString("Thing"));

    private static final SubLObject $const26$SitTypeSpecWithTypeRestrictionOnR = reader_make_constant_shell(makeString("SitTypeSpecWithTypeRestrictionOnRolePlayerFn"));

    private static final SubLObject $const27$SubcollectionOfWithRelationToType = reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn"));

    private static final SubLObject $const28$SubcollectionOfWithRelationFromTy = reader_make_constant_shell(makeString("SubcollectionOfWithRelationFromTypeFn"));

    private static final SubLObject $$SubcollectionOfWithRelationFromFn = reader_make_constant_shell(makeString("SubcollectionOfWithRelationFromFn"));

    private static final SubLObject $$CompositeActivityFn = reader_make_constant_shell(makeString("CompositeActivityFn"));

    private static final SubLObject $$CollectionIntersection2Fn = reader_make_constant_shell(makeString("CollectionIntersection2Fn"));

    private static final SubLObject $$SubcollectionOfWithRelationToFn = reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn"));

    private static final SubLObject $$compositeActivities = reader_make_constant_shell(makeString("compositeActivities"));

    private static final SubLObject $$plausibleCollectionIntersections = reader_make_constant_shell(makeString("plausibleCollectionIntersections"));

    private static final SubLObject $$VeryHighAmountFn = reader_make_constant_shell(makeString("VeryHighAmountFn"));

    private static final SubLFloat $float$0_95 = makeDouble(0.95);

    private static final SubLObject $$HighToVeryHighAmountFn = reader_make_constant_shell(makeString("HighToVeryHighAmountFn"));

    private static final SubLFloat $float$0_85 = makeDouble(0.85);

    private static final SubLObject $$HighAmountFn = reader_make_constant_shell(makeString("HighAmountFn"));

    private static final SubLFloat $float$0_75 = makeDouble(0.75);

    private static final SubLObject $$MediumToVeryHighAmountFn = reader_make_constant_shell(makeString("MediumToVeryHighAmountFn"));

    private static final SubLFloat $float$0_65 = makeDouble(0.65);

    private static final SubLObject $$MediumToHighAmountFn = reader_make_constant_shell(makeString("MediumToHighAmountFn"));

    private static final SubLFloat $float$0_55 = makeDouble(0.55);

    private static final SubLObject $$MediumAmountFn = reader_make_constant_shell(makeString("MediumAmountFn"));

    private static final SubLObject $$LowToMediumAmountFn = reader_make_constant_shell(makeString("LowToMediumAmountFn"));

    private static final SubLFloat $float$0_45 = makeDouble(0.45);

    private static final SubLObject $$LowAmountFn = reader_make_constant_shell(makeString("LowAmountFn"));

    private static final SubLFloat $float$0_35 = makeDouble(0.35);

    private static final SubLObject $$VeryLowToLowAmountFn = reader_make_constant_shell(makeString("VeryLowToLowAmountFn"));

    private static final SubLFloat $float$0_25 = makeDouble(0.25);

    private static final SubLObject $$VeryLowAmountFn = reader_make_constant_shell(makeString("VeryLowAmountFn"));

    private static final SubLFloat $float$0_15 = makeDouble(0.15);

    private static final SubLObject $$NoAmountFn = reader_make_constant_shell(makeString("NoAmountFn"));

    private static final SubLSymbol $sym55$_ = makeSymbol("*");



    private static final SubLSymbol DO_TVA_QUERY_TYPE_TYPE = makeSymbol("DO-TVA-QUERY-TYPE-TYPE");

    private static final SubLObject $$likelihoodOfArguments_TypeType = reader_make_constant_shell(makeString("likelihoodOfArguments-TypeType"));

    private static final SubLSymbol $do_tva_query_type_type_caching_state$ = makeSymbol("*DO-TVA-QUERY-TYPE-TYPE-CACHING-STATE*");



    private static final SubLSymbol CLEAR_DO_TVA_QUERY_TYPE_TYPE = makeSymbol("CLEAR-DO-TVA-QUERY-TYPE-TYPE");

    private static final SubLSymbol DO_TVA_QUERY_TYPE_DISJOINT_WITH = makeSymbol("DO-TVA-QUERY-TYPE-DISJOINT-WITH");

    private static final SubLObject $const63$likelihoodOfArgumentsWhenArg2NotI = reader_make_constant_shell(makeString("likelihoodOfArgumentsWhenArg2NotInCollection"));



    private static final SubLList $list65 = list(makeSymbol("BINDINGS"), makeSymbol("JUSTIFICATION"));

    private static final SubLSymbol $do_tva_query_type_disjoint_with_caching_state$ = makeSymbol("*DO-TVA-QUERY-TYPE-DISJOINT-WITH-CACHING-STATE*");

    private static final SubLSymbol CLEAR_DO_TVA_QUERY_TYPE_DISJOINT_WITH = makeSymbol("CLEAR-DO-TVA-QUERY-TYPE-DISJOINT-WITH");

    private static final SubLString $str68$____a__a_ = makeString("~% ~a ~a ");

    private static final SubLString $str69$____a_ = makeString("~% ~a ");

    private static final SubLString $str70$___Detected_Feature___a__a_ = makeString("~% Detected Feature: ~a ~a ");

    private static final SubLString $str71$_________ = makeString("~& ------");

    private static final SubLFloat $float$19403_06 = makeDouble(19403.06);

    private static final SubLObject $$Collection = reader_make_constant_shell(makeString("Collection"));

    private static final SubLObject $$Individual = reader_make_constant_shell(makeString("Individual"));

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    private static final SubLObject $$nearestCommonGenls = reader_make_constant_shell(makeString("nearestCommonGenls"));

    private static final SubLList $list77 = list(makeSymbol("?X"));

    private static final SubLList $list78 = list(reader_make_constant_shell(makeString("MtSpace")), reader_make_constant_shell(makeString("EverythingPSC")), reader_make_constant_shell(makeString("AnytimePSC")));





    private static final SubLSymbol $kw81$ALLOW_INDETERMINATE_RESULTS_ = makeKeyword("ALLOW-INDETERMINATE-RESULTS?");

    private static final SubLSymbol $DISJUNCTION_FREE_EL_VARS_POLICY = makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY");



    private static final SubLSymbol $kw84$TRANSFORMATION_ALLOWED_ = makeKeyword("TRANSFORMATION-ALLOWED?");

    private static final SubLSymbol $kw85$ADD_RESTRICTION_LAYER_OF_INDIRECTION_ = makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?");

    private static final SubLSymbol $kw86$NEW_TERMS_ALLOWED_ = makeKeyword("NEW-TERMS-ALLOWED?");

    private static final SubLSymbol $kw87$COMPUTE_ANSWER_JUSTIFICATIONS_ = makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?");



    private static final SubLSymbol $PROBABLY_APPROXIMATELY_DONE = makeKeyword("PROBABLY-APPROXIMATELY-DONE");

    private static final SubLFloat $float$1_0 = makeDouble(1.0);

    private static final SubLSymbol $MAX_PROOF_DEPTH = makeKeyword("MAX-PROOF-DEPTH");









    private static final SubLInteger $int$20000000 = makeInteger(20000000);

    private static final SubLObject $$evaluate = reader_make_constant_shell(makeString("evaluate"));

    private static final SubLSymbol $sym98$_ABC = makeSymbol("?ABC");

    private static final SubLObject $$SetExtentFn = reader_make_constant_shell(makeString("SetExtentFn"));

    private static final SubLObject $$Predicate = reader_make_constant_shell(makeString("Predicate"));



    private static final SubLString $str102$ = makeString("");

    private static final SubLSymbol $sym103$STRING_ = makeSymbol("STRING=");

    private static final SubLInteger $int$_5 = makeInteger(-5);

    private static final SubLString $str105$____a__a__a__a = makeString("~% ~a ~a ~a ~a");

    private static final SubLFloat $float$0_8 = makeDouble(0.8);

    private static final SubLObject $$IntelligentAgent = reader_make_constant_shell(makeString("IntelligentAgent"));

    private static final SubLObject $const108$owl_Class = reader_make_constant_shell(makeString("owl:Class"));

    private static final SubLObject $$definiteDescriptions = reader_make_constant_shell(makeString("definiteDescriptions"));

    private static final SubLObject $$BiologySCGTemplateAdmittedThing = reader_make_constant_shell(makeString("BiologySCGTemplateAdmittedThing"));

    private static final SubLSymbol $sym111$_ = makeSymbol("<");



    private static final SubLList $list113 = list(reader_make_constant_shell(makeString("TermFromOntologyFn")), reader_make_constant_shell(makeString("TheAURABiologyOntology")));

    private static final SubLObject $$quotedIsa = reader_make_constant_shell(makeString("quotedIsa"));

    private static final SubLObject $$nameString = reader_make_constant_shell(makeString("nameString"));

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $$$_does_ = makeString(" does ");

    private static final SubLString $$$_with_ = makeString(" with ");

    private static final SubLString $$$_where_ = makeString(" where ");

    private static final SubLString $$$_and_ = makeString(" and ");

    private static final SubLString $$$_do_ = makeString(" do ");

    private static final SubLString $str122$_ = makeString("?");

    private static final SubLString $$$_why_ = makeString(" why ");

    private static final SubLString $$$_how_ = makeString(" how ");

    private static final SubLString $$$_what_ = makeString(" what ");

    private static final SubLString $$$_to_ = makeString(" to ");

    private static final SubLString $$$_of_ = makeString(" of ");

    private static final SubLString $$$_is_ = makeString(" is ");

    private static final SubLString $$$_the_ = makeString(" the ");

    private static final SubLString $$$_a_ = makeString(" a ");

    private static final SubLString $$$_an_ = makeString(" an ");

    public static SubLObject default_plausubility_justification(final SubLObject sentence, final SubLObject likelihood) {
        return list(arguments.make_hl_support($OPAQUE, make_binary_formula($$sentencePlausibilityScore, sentence, make_unary_formula($$NumericLikelihoodFn, likelihood)), UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject plausibility_of_sentence(final SubLObject expr, SubLObject justifyP, SubLObject mt) {
        if (justifyP == UNPROVIDED) {
            justifyP = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = $default_plausibility_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject likelihood = NIL;
        SubLObject justification = NIL;
        if ((NIL == likelihood) && (!expr.isList())) {
            likelihood = make_unary_formula($$NumericLikelihoodFn, $float$0_5);
        }
        if (NIL == likelihood) {
            SubLObject col = NIL;
            if (cycl_utilities.formula_arg0(expr).eql($$equalSymbols)) {
                col = cycl_utilities.formula_arg2(expr, UNPROVIDED);
            } else {
                col = expr;
            }
            if ((NIL == likelihood) && (NIL != simple_nartP(col))) {
                thread.resetMultipleValues();
                final SubLObject likelihood_$1 = find_plausibility_of_collection(col, justifyP, mt);
                final SubLObject justification_$2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                likelihood = likelihood_$1;
                justification = justification_$2;
            }
            if ((NIL == likelihood) && cycl_utilities.formula_arg0(col).eql($$and)) {
                thread.resetMultipleValues();
                final SubLObject likelihood_$2 = handle_arbitrary_expression(col, justifyP, mt);
                final SubLObject justification_$3 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                likelihood = likelihood_$2;
                justification = justification_$3;
            }
            if (((NIL == likelihood) && col.isList()) && (NIL == member(cycl_utilities.formula_arg0(col), $nart_functions$.getGlobalValue(), UNPROVIDED, UNPROVIDED))) {
                thread.resetMultipleValues();
                final SubLObject likelihood_$3 = find_plausibility_of_sentences(list(col), mt, UNPROVIDED);
                final SubLObject justification_$4 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                likelihood = likelihood_$3;
                justification = justification_$4;
            }
            if (NIL == likelihood) {
                final SubLObject query = list($$isa, $sym15$_X, col);
                final SubLObject unwound_form = subcollection_unwinder.scg_subcol_expand_signature(query);
                thread.resetMultipleValues();
                final SubLObject likelihood_$4 = find_plausibility_of_sentences(unwound_form, justifyP, mt);
                final SubLObject justification_$5 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                likelihood = likelihood_$4;
                justification = justification_$5;
            }
        }
        if (NIL == likelihood) {
            likelihood = make_unary_formula($$NumericLikelihoodFn, $float$0_5);
        }
        if (NIL == justification) {
            justification = default_plausubility_justification(expr, cycl_utilities.formula_arg1(likelihood, UNPROVIDED));
        }
        return values(cycl_utilities.formula_arg1(likelihood, UNPROVIDED), justification);
    }

    public static SubLObject handle_arbitrary_expression(final SubLObject expression, SubLObject justifyP, SubLObject mt) {
        if (justifyP == UNPROVIDED) {
            justifyP = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cols = NIL;
        SubLObject sentences = NIL;
        SubLObject results = NIL;
        SubLObject justifications = NIL;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(expression, $IGNORE);
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (cycl_utilities.formula_arg0(arg).eql($$equalSymbols)) {
                cols = cons(cycl_utilities.formula_arg2(arg, UNPROVIDED), cols);
            } else {
                sentences = cons(arg, sentences);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        SubLObject cdolist_list_var2 = cols;
        SubLObject col = NIL;
        col = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            thread.resetMultipleValues();
            final SubLObject result = find_plausibility_of_collection(col, justifyP, mt);
            final SubLObject justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            results = cons(result, results);
            justifications = append(justifications, justification);
            cdolist_list_var2 = cdolist_list_var2.rest();
            col = cdolist_list_var2.first();
        } 
        thread.resetMultipleValues();
        final SubLObject result2 = find_plausibility_of_sentences(sentences, mt, UNPROVIDED);
        final SubLObject justification2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        results = cons(result2, results);
        justifications = append(justifications, justification2);
        if (NIL != justifyP) {
            return values(combine_plausibility_scores(results), justifications);
        }
        return combine_plausibility_scores(results);
    }

    public static SubLObject find_plausibility_of_collection(final SubLObject collection, SubLObject justifyP, SubLObject mt) {
        if (justifyP == UNPROVIDED) {
            justifyP = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = $default_plausibility_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!collection.isList()) {
            return $default_nart_plausibility$.getGlobalValue();
        }
        if (NIL == simple_nartP(collection)) {
            thread.resetMultipleValues();
            final SubLObject result = handle_nested_nart(collection, justifyP, mt);
            final SubLObject justifications = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return values(result, justifications);
        }
        thread.resetMultipleValues();
        final SubLObject ret_value = handle_simple_nart(collection, mt, justifyP);
        final SubLObject justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject score = map_likelihood_to_numbers(ret_value);
        final SubLObject likelihood = list($$NumericLikelihoodFn, score);
        if (NIL == score) {
            return $default_nart_plausibility$.getGlobalValue();
        }
        if (NIL != justifyP) {
            return values(likelihood, justifications);
        }
        return likelihood;
    }

    public static SubLObject handle_nested_nart(final SubLObject collection, SubLObject justifyP, SubLObject mt) {
        if (justifyP == UNPROVIDED) {
            justifyP = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = $default_plausibility_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query = list($$isa, $sym15$_X, collection);
        final SubLObject unwound_form = subcollection_unwinder.scg_subcol_expand_signature(query);
        thread.resetMultipleValues();
        final SubLObject results = find_plausibility_of_sentences(unwound_form, justifyP, mt);
        final SubLObject justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != justifyP) {
            return values(results, justifications);
        }
        return results;
    }

    public static SubLObject find_plausibility_of_sentences(final SubLObject list_of_sentences, SubLObject justifyP, SubLObject mt) {
        if (justifyP == UNPROVIDED) {
            justifyP = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = $default_plausibility_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = NIL;
        SubLObject sentences = list_of_sentences;
        SubLObject justifications = NIL;
        if (!list_of_sentences.isList()) {
            return $default_nart_plausibility$.getGlobalValue();
        }
        if (cycl_utilities.formula_arg0(list_of_sentences).eql($$and)) {
            sentences = cycl_utilities.formula_args(list_of_sentences, UNPROVIDED);
        }
        SubLObject cdolist_list_var = sentences;
        SubLObject sentence = NIL;
        sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject result = assess_plausibility_of_sentence(sentence, sentences, mt, justifyP);
            final SubLObject justification_of_sentence = thread.secondMultipleValue();
            thread.resetMultipleValues();
            results = cons(result, results);
            if (NIL != justifyP) {
                justifications = append(justifications, justification_of_sentence);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        } 
        if (NIL != justifyP) {
            return values(combine_plausibility_scores(results), justifications);
        }
        return combine_plausibility_scores(results);
    }

    public static SubLObject combine_plausibility_scores(final SubLObject results) {
        SubLObject lst_of_scores = NIL;
        SubLObject cdolist_list_var = results;
        SubLObject result = NIL;
        result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject score = map_likelihood_to_numbers(result);
            if (NIL != score) {
                lst_of_scores = cons(score, lst_of_scores);
            }
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        } 
        if (NIL != lst_of_scores) {
            final SubLObject combined_score = combined_evidence(lst_of_scores);
            return list($$NumericLikelihoodFn, combined_score);
        }
        return $default_nart_plausibility$.getGlobalValue();
    }

    public static SubLObject assess_plausibility_of_sentence(final SubLObject sentence, final SubLObject sentences, final SubLObject mt, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!sentence.isList()) {
            return $default_nart_plausibility$.getGlobalValue();
        }
        if (cycl_utilities.formula_arg0(sentence).eql($$relationInstanceExists)) {
            thread.resetMultipleValues();
            final SubLObject result = assess_plausibility_of_relation_instance_exists(sentence, sentences, mt, justifyP);
            final SubLObject justifications = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return values(result, justifications);
        }
        if (cycl_utilities.formula_arg0(sentence).eql($$biologicalFunction)) {
            thread.resetMultipleValues();
            final SubLObject result2 = handle_nested_nart(cycl_utilities.formula_arg2(sentence, UNPROVIDED), justifyP, mt);
            final SubLObject justifications2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            thread.resetMultipleValues();
            final SubLObject result3 = handle_nested_nart(cycl_utilities.formula_arg1(sentence, UNPROVIDED), justifyP, mt);
            final SubLObject justifications3 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return values(combine_plausibility_scores(list(result2, result3)), append(justifications2, justifications3));
        }
        if (cycl_utilities.formula_arg0(sentence).eql($$definitionalDisplaySentence)) {
            thread.resetMultipleValues();
            final SubLObject result = handle_nested_nart(cycl_utilities.formula_arg1(sentence, UNPROVIDED), justifyP, mt);
            final SubLObject justifications = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return values(result, justifications);
        }
        if (cycl_utilities.formula_arg0(sentence).equal($list20)) {
            thread.resetMultipleValues();
            final SubLObject result = handle_nested_nart(cycl_utilities.formula_arg2(sentence, UNPROVIDED), justifyP, mt);
            final SubLObject justifications = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return values(result, justifications);
        }
        if (cycl_utilities.formula_arg0(sentence).eql($const21$sentenceJustifications_ProofViewS)) {
            thread.resetMultipleValues();
            final SubLObject result = assess_plausibility_of_sentence(cycl_utilities.formula_arg1(sentence, UNPROVIDED), sentences, mt, justifyP);
            final SubLObject justifications = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return values(result, justifications);
        }
        if (cycl_utilities.formula_arg0(sentence).eql($$isa)) {
            thread.resetMultipleValues();
            final SubLObject result = assess_plausibility_of_isa_sentence(sentence, sentences, mt, justifyP);
            final SubLObject justifications = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return values(result, justifications);
        }
        if (cycl_utilities.formula_arg0(sentence).eql($$relationExistsInstance)) {
            thread.resetMultipleValues();
            final SubLObject result = assess_plausibility_of_relation_instance_exists(sentence, sentences, mt, justifyP);
            final SubLObject justifications = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return values(result, justifications);
        }
        if (cycl_utilities.formula_arg0(sentence).eql($$thereExists)) {
            thread.resetMultipleValues();
            final SubLObject result = find_plausibility_of_sentences(cycl_utilities.formula_arg2(sentence, UNPROVIDED), justifyP, mt);
            final SubLObject justifications = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return values(result, justifications);
        }
        thread.resetMultipleValues();
        final SubLObject result = assess_plausibility_of_binary_predicate(sentence, sentences, mt, justifyP);
        final SubLObject justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(result, justifications);
    }

    public static SubLObject assess_plausibility_of_isa_sentence(final SubLObject sentence, final SubLObject sentences, final SubLObject mt, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject col = cycl_utilities.formula_arg2(sentence, UNPROVIDED);
        final SubLObject var = cycl_utilities.formula_arg1(sentence, UNPROVIDED);
        final SubLObject all_collections_for_variable = gather_collections_for_variable(var, sentences);
        if (NIL != member(col, $too_general_cols_for_plausibility$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) {
            return $default_nart_plausibility$.getGlobalValue();
        }
        if (col.isList() && cycl_utilities.formula_arg0(col).eql($$GroupFn)) {
            thread.resetMultipleValues();
            final SubLObject result = handle_nested_nart(cycl_utilities.formula_arg1(col, UNPROVIDED), justifyP, mt);
            final SubLObject justifications = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return values(result, justifications);
        }
        thread.resetMultipleValues();
        final SubLObject result = handle_plausibility_of_isa_sentence(list(col), all_collections_for_variable, mt, justifyP);
        final SubLObject justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(result, justifications);
    }

    public static SubLObject assess_plausibility_of_binary_predicate(final SubLObject sentence, final SubLObject sentences, final SubLObject mt, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = cycl_utilities.formula_arg0(sentence);
        final SubLObject arg1 = cycl_utilities.formula_arg1(sentence, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.formula_arg2(sentence, UNPROVIDED);
        if ((NIL != collection_defns.el_variableP(arg1)) && (NIL == collection_defns.el_variableP(arg2))) {
            thread.resetMultipleValues();
            final SubLObject result = handle_plausibility_of_binary_predicate_types_ins(predicate, gather_collections_for_variable(arg1, sentences), arg2, mt, justifyP);
            final SubLObject justifications = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return values(result, justifications);
        }
        if ((NIL == collection_defns.el_variableP(arg1)) && (NIL != collection_defns.el_variableP(arg2))) {
            thread.resetMultipleValues();
            final SubLObject result = handle_plausibility_of_binary_predicate_ins_types(predicate, arg1, gather_collections_for_variable(arg2, sentences), mt, justifyP);
            final SubLObject justifications = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return values(result, justifications);
        }
        if ((NIL != collection_defns.el_variableP(arg1)) && (NIL != collection_defns.el_variableP(arg2))) {
            thread.resetMultipleValues();
            final SubLObject result = handle_plausibility_of_binary_predicate_types_types(predicate, gather_collections_for_variable(arg1, sentences), gather_collections_for_variable(arg2, sentences), mt, justifyP);
            final SubLObject justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return values(result, justification);
        }
        return $default_nart_plausibility$.getGlobalValue();
    }

    public static SubLObject handle_plausibility_of_binary_predicate_types_ins(final SubLObject predicate, final SubLObject list_of_cols, final SubLObject instance, final SubLObject mt, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = NIL;
        SubLObject justifications = NIL;
        SubLObject cdolist_list_var = list_of_cols;
        SubLObject type = NIL;
        type = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject answer_1 = do_tva_query_ins_not_in_col(predicate, type, instance, mt, justifyP);
            final SubLObject justification_1 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != answer_1) {
                results = cons(answer_1, results);
            }
            if ((NIL != justifyP) && justification_1.isList()) {
                justifications = append(justifications, justification_1);
            }
            cdolist_list_var = cdolist_list_var.rest();
            type = cdolist_list_var.first();
        } 
        cdolist_list_var = list_of_cols;
        type = NIL;
        type = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject answer_2 = do_tva_query_type_ins(predicate, type, instance, mt, justifyP);
            final SubLObject justification_2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != answer_2) {
                results = cons(answer_2, results);
            }
            if ((NIL != justifyP) && justification_2.isList()) {
                justifications = append(justifications, justification_2);
            }
            cdolist_list_var = cdolist_list_var.rest();
            type = cdolist_list_var.first();
        } 
        if (NIL == results) {
            return $default_nart_plausibility$.getGlobalValue();
        }
        if (NIL != justifyP) {
            return values(find_min_likelihood(results), justifications);
        }
        return find_min_likelihood(results);
    }

    public static SubLObject handle_plausibility_of_binary_predicate_ins_types(final SubLObject predicate, final SubLObject instance, final SubLObject list_of_cols, final SubLObject mt, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = NIL;
        SubLObject justifications = NIL;
        SubLObject cdolist_list_var = list_of_cols;
        SubLObject type = NIL;
        type = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject v_answer = do_tva_query_ins_type(predicate, instance, type, mt, justifyP);
            final SubLObject justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != v_answer) {
                results = cons(v_answer, results);
            }
            if ((NIL != justifyP) && justification.isList()) {
                justifications = append(justifications, justification);
            }
            cdolist_list_var = cdolist_list_var.rest();
            type = cdolist_list_var.first();
        } 
        if (NIL == results) {
            return $default_nart_plausibility$.getGlobalValue();
        }
        if (NIL != justifyP) {
            return values(find_min_likelihood(results), justifications);
        }
        return find_min_likelihood(results);
    }

    public static SubLObject handle_plausibility_of_binary_predicate_types_types(final SubLObject predicate, final SubLObject list_of_cols_1, final SubLObject list_of_cols_2, final SubLObject mt, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = NIL;
        SubLObject justifications = NIL;
        SubLObject cdolist_list_var = list_of_cols_1;
        SubLObject col_1 = NIL;
        col_1 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$9 = list_of_cols_2;
            SubLObject col_2 = NIL;
            col_2 = cdolist_list_var_$9.first();
            while (NIL != cdolist_list_var_$9) {
                thread.resetMultipleValues();
                final SubLObject v_answer = do_tva_query_type_type(predicate, col_1, col_2, mt, justifyP);
                final SubLObject justification_1 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if ((NIL != justifyP) && justification_1.isList()) {
                    justifications = append(justifications, justification_1);
                }
                if (NIL != v_answer) {
                    results = cons(v_answer, results);
                }
                thread.resetMultipleValues();
                final SubLObject answer_2 = do_tva_query_type_disjoint_with(predicate, col_1, col_2, mt, justifyP);
                final SubLObject justifications_2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (justifications_2.isList()) {
                    justifications = append(justifications, justifications_2);
                }
                if (NIL != answer_2) {
                    results = cons(answer_2, results);
                }
                cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                col_2 = cdolist_list_var_$9.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            col_1 = cdolist_list_var.first();
        } 
        if (NIL == results) {
            return $default_nart_plausibility$.getGlobalValue();
        }
        return values(find_min_likelihood(results), justifications);
    }

    public static SubLObject assess_plausibility_of_relation_instance_exists(final SubLObject sentence, final SubLObject sentences, final SubLObject mt, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = cycl_utilities.formula_arg1(sentence, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.formula_arg2(sentence, UNPROVIDED);
        final SubLObject arg3 = cycl_utilities.formula_arg3(sentence, UNPROVIDED);
        SubLObject all_collections_for_arg2 = list(arg2);
        SubLObject all_collections_for_arg3 = list(arg3);
        if (NIL != collection_defns.el_variableP(arg2)) {
            all_collections_for_arg2 = gather_collections_for_variable(arg2, sentences);
        }
        if (NIL != collection_defns.el_variableP(arg3)) {
            all_collections_for_arg3 = gather_collections_for_variable(arg3, sentences);
        }
        thread.resetMultipleValues();
        final SubLObject result = assess_plausibility_of_collections(predicate, all_collections_for_arg2, all_collections_for_arg3, mt, justifyP);
        final SubLObject justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(result, justifications);
    }

    public static SubLObject assess_plausibility_of_collections(final SubLObject predicate, final SubLObject cols_list_1, final SubLObject cols_list_2, final SubLObject mt, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = NIL;
        SubLObject justifications = NIL;
        SubLObject cdolist_list_var = cols_list_1;
        SubLObject col_1 = NIL;
        col_1 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$10 = cols_list_2;
            SubLObject col_2 = NIL;
            col_2 = cdolist_list_var_$10.first();
            while (NIL != cdolist_list_var_$10) {
                thread.resetMultipleValues();
                final SubLObject result = get_plausibility_of_binary_predicate_type_type(predicate, col_1, col_2, mt, justifyP);
                final SubLObject justification = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != result) {
                    results = cons(result, results);
                }
                if ((NIL != justifyP) && justification.isList()) {
                    justifications = append(justifications, justification);
                }
                cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                col_2 = cdolist_list_var_$10.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            col_1 = cdolist_list_var.first();
        } 
        if (NIL == results) {
            return $default_nart_plausibility$.getGlobalValue();
        }
        return values(find_min_likelihood(results), justifications);
    }

    public static SubLObject gather_collections_for_variable(final SubLObject variable, final SubLObject sentences) {
        SubLObject list_of_collections = NIL;
        SubLObject cdolist_list_var = sentences;
        SubLObject sentence = NIL;
        sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject col = cycl_utilities.formula_arg2(sentence, UNPROVIDED);
            if ((cycl_utilities.formula_arg0(sentence).eql($$isa) && variable.eql(cycl_utilities.formula_arg1(sentence, UNPROVIDED))) && (NIL == member(col, $too_general_cols_for_plausibility$.getGlobalValue(), UNPROVIDED, UNPROVIDED))) {
                list_of_collections = cons(col, list_of_collections);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        } 
        if (NIL == list_of_collections) {
            return list($$Thing);
        }
        return list_of_collections;
    }

    public static SubLObject handle_simple_nart(final SubLObject collection, final SubLObject mt, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cycl_utilities.formula_arg0(collection).eql($const26$SitTypeSpecWithTypeRestrictionOnR)) {
            thread.resetMultipleValues();
            final SubLObject results = get_plausibility_of_binary_predicate_type_type(cycl_utilities.formula_arg2(collection, UNPROVIDED), cycl_utilities.formula_arg1(collection, UNPROVIDED), cycl_utilities.formula_arg3(collection, UNPROVIDED), mt, justifyP);
            final SubLObject justifications = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return values(results, justifications);
        }
        if (cycl_utilities.formula_arg0(collection).eql($const27$SubcollectionOfWithRelationToType)) {
            thread.resetMultipleValues();
            final SubLObject results = get_plausibility_of_binary_predicate_type_type(cycl_utilities.formula_arg2(collection, UNPROVIDED), cycl_utilities.formula_arg1(collection, UNPROVIDED), cycl_utilities.formula_arg3(collection, UNPROVIDED), mt, justifyP);
            final SubLObject justifications = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return values(results, justifications);
        }
        if (cycl_utilities.formula_arg0(collection).eql($const28$SubcollectionOfWithRelationFromTy)) {
            thread.resetMultipleValues();
            final SubLObject results = get_plausibility_of_binary_predicate_type_type(cycl_utilities.formula_arg2(collection, UNPROVIDED), cycl_utilities.formula_arg3(collection, UNPROVIDED), cycl_utilities.formula_arg1(collection, UNPROVIDED), mt, justifyP);
            final SubLObject justifications = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return values(results, justifications);
        }
        if (cycl_utilities.formula_arg0(collection).eql($$SubcollectionOfWithRelationFromFn)) {
            thread.resetMultipleValues();
            final SubLObject results = handle_plausibility_of_binary_predicate_ins_types(cycl_utilities.formula_arg2(collection, UNPROVIDED), cycl_utilities.formula_arg3(collection, UNPROVIDED), list(cycl_utilities.formula_arg1(collection, UNPROVIDED)), mt, justifyP);
            final SubLObject justifications = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return values(results, justifications);
        }
        if (cycl_utilities.formula_arg0(collection).eql($$CompositeActivityFn)) {
            thread.resetMultipleValues();
            final SubLObject results = handle_composite_activity_fn(collection, mt, justifyP);
            final SubLObject justifications = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return values(results, justifications);
        }
        if (cycl_utilities.formula_arg0(collection).eql($$CollectionIntersection2Fn)) {
            thread.resetMultipleValues();
            final SubLObject results = handle_collection_intersection_2_fn(collection, mt, justifyP);
            final SubLObject justifications = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return values(results, justifications);
        }
        if (cycl_utilities.formula_arg0(collection).eql($$SubcollectionOfWithRelationToFn)) {
            thread.resetMultipleValues();
            final SubLObject results = get_plausibility_of_binary_predicate_type_ins(cycl_utilities.formula_arg2(collection, UNPROVIDED), cycl_utilities.formula_arg1(collection, UNPROVIDED), cycl_utilities.formula_arg3(collection, UNPROVIDED), mt, justifyP);
            final SubLObject justifications = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return values(results, justifications);
        }
        return $default_nart_plausibility$.getGlobalValue();
    }

    public static SubLObject get_plausibility_of_binary_predicate_type_type(final SubLObject predicate, final SubLObject type_1, final SubLObject type_2, final SubLObject mt, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = NIL;
        SubLObject justifications = NIL;
        thread.resetMultipleValues();
        SubLObject v_answer = do_tva_query_type_disjoint_with(predicate, type_1, type_2, mt, justifyP);
        SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_answer) {
            results = cons(v_answer, results);
        }
        if (justification.isList()) {
            justifications = append(justifications, justification);
        }
        thread.resetMultipleValues();
        v_answer = do_tva_query_type_type(predicate, type_1, type_2, mt, justifyP);
        justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_answer) {
            results = cons(v_answer, results);
        }
        if (justification.isList()) {
            justifications = append(justifications, justification);
        }
        if (NIL == results) {
            return $default_nart_plausibility$.getGlobalValue();
        }
        return values(find_min_likelihood(results), justifications);
    }

    public static SubLObject get_plausibility_of_binary_predicate_type_ins(final SubLObject predicate, final SubLObject type, final SubLObject ins, final SubLObject mt, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = NIL;
        SubLObject justifications = NIL;
        thread.resetMultipleValues();
        SubLObject v_answer = do_tva_query_ins_not_in_col(predicate, type, ins, mt, justifyP);
        SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_answer) {
            results = cons(v_answer, results);
        }
        if (justification.isList()) {
            justifications = append(justifications, justification);
        }
        thread.resetMultipleValues();
        v_answer = do_tva_query_type_ins(predicate, type, ins, mt, justifyP);
        justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_answer) {
            results = cons(v_answer, results);
        }
        if (justification.isList()) {
            justifications = append(justifications, justification);
        }
        if (NIL == results) {
            return $default_nart_plausibility$.getGlobalValue();
        }
        return values(find_min_likelihood(results), justifications);
    }

    public static SubLObject handle_composite_activity_fn(final SubLObject collection, final SubLObject mt, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject all_cols = cycl_utilities.formula_arg1(collection, UNPROVIDED);
        SubLObject results = NIL;
        SubLObject justifications = NIL;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(all_cols, $IGNORE);
        SubLObject col_1 = NIL;
        col_1 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$12;
            final SubLObject args_$11 = cdolist_list_var_$12 = cycl_utilities.formula_args(all_cols, $IGNORE);
            SubLObject col_2 = NIL;
            col_2 = cdolist_list_var_$12.first();
            while (NIL != cdolist_list_var_$12) {
                if (!col_1.equal(col_2)) {
                    thread.resetMultipleValues();
                    SubLObject v_answer = do_tva_query_type_type($$compositeActivities, col_1, col_2, mt, justifyP);
                    final SubLObject justification_1 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != v_answer) {
                        results = cons(v_answer, results);
                    }
                    if (justification_1.isList()) {
                        justifications = append(justifications, justification_1);
                    }
                    thread.resetMultipleValues();
                    v_answer = do_tva_query_type_type($$compositeActivities, col_2, col_1, mt, justifyP);
                    final SubLObject justification_2 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (justification_2.isList()) {
                        justifications = append(justifications, justification_2);
                    }
                    if (NIL != v_answer) {
                        results = cons(v_answer, results);
                    }
                }
                cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                col_2 = cdolist_list_var_$12.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            col_1 = cdolist_list_var.first();
        } 
        if (NIL == results) {
            return $default_nart_plausibility$.getGlobalValue();
        }
        return values(find_min_likelihood(results), justifications);
    }

    public static SubLObject handle_collection_intersection_2_fn(final SubLObject collection, final SubLObject mt, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = NIL;
        SubLObject justifications = NIL;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(collection, $IGNORE);
        SubLObject col_1 = NIL;
        col_1 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$14;
            final SubLObject args_$13 = cdolist_list_var_$14 = cycl_utilities.formula_args(collection, $IGNORE);
            SubLObject col_2 = NIL;
            col_2 = cdolist_list_var_$14.first();
            while (NIL != cdolist_list_var_$14) {
                if (!col_1.equal(col_2)) {
                    thread.resetMultipleValues();
                    SubLObject v_answer = do_tva_query_type_type($$plausibleCollectionIntersections, col_1, col_2, mt, justifyP);
                    SubLObject justification = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (justification.isList()) {
                        justifications = append(justifications, justification);
                    }
                    if (NIL != v_answer) {
                        results = cons(v_answer, results);
                    }
                    thread.resetMultipleValues();
                    v_answer = do_tva_query_type_type($$plausibleCollectionIntersections, col_2, col_1, mt, justifyP);
                    justification = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (justification.isList()) {
                        justifications = append(justifications, justification);
                    }
                    if (NIL != v_answer) {
                        results = cons(v_answer, results);
                    }
                }
                cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                col_2 = cdolist_list_var_$14.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            col_1 = cdolist_list_var.first();
        } 
        if (NIL == results) {
            return $default_nart_plausibility$.getGlobalValue();
        }
        return values(find_min_likelihood(results), justifications);
    }

    public static SubLObject handle_plausibility_of_isa_sentence(final SubLObject list_of_cols_1, final SubLObject list_of_cols_2, final SubLObject mt, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (list_of_cols_1.equal(list_of_cols_2)) {
            return $default_nart_plausibility$.getGlobalValue();
        }
        SubLObject results = NIL;
        SubLObject justifications = NIL;
        SubLObject cdolist_list_var = list_of_cols_1;
        SubLObject col_1 = NIL;
        col_1 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$15 = list_of_cols_2;
            SubLObject col_2 = NIL;
            col_2 = cdolist_list_var_$15.first();
            while (NIL != cdolist_list_var_$15) {
                if (!col_1.equal(col_2)) {
                    thread.resetMultipleValues();
                    final SubLObject v_answer = do_tva_query_type_type($$plausibleCollectionIntersections, col_1, col_2, mt, justifyP);
                    final SubLObject justification = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (justification.isList()) {
                        justifications = append(justifications, justification);
                    }
                    if (NIL != v_answer) {
                        results = cons(v_answer, results);
                    }
                }
                cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                col_2 = cdolist_list_var_$15.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            col_1 = cdolist_list_var.first();
        } 
        if (NIL == results) {
            return $default_nart_plausibility$.getGlobalValue();
        }
        return values(find_min_likelihood(results), justifications);
    }

    public static SubLObject map_likelihood_to_numbers(final SubLObject likelihood) {
        final SubLObject level = cycl_utilities.formula_arg0(likelihood);
        if (level.eql($$NumericLikelihoodFn)) {
            return cycl_utilities.formula_arg1(likelihood, UNPROVIDED);
        }
        if (level.eql($$VeryHighAmountFn)) {
            return $float$0_95;
        }
        if (level.eql($$HighToVeryHighAmountFn)) {
            return $float$0_85;
        }
        if (level.eql($$HighAmountFn)) {
            return $float$0_75;
        }
        if (level.eql($$MediumToVeryHighAmountFn)) {
            return $float$0_65;
        }
        if (level.eql($$MediumToHighAmountFn)) {
            return $float$0_55;
        }
        if (level.eql($$MediumAmountFn)) {
            return $float$0_5;
        }
        if (level.eql($$LowToMediumAmountFn)) {
            return $float$0_45;
        }
        if (level.eql($$LowAmountFn)) {
            return $float$0_35;
        }
        if (level.eql($$VeryLowToLowAmountFn)) {
            return $float$0_25;
        }
        if (level.eql($$VeryLowAmountFn)) {
            return $float$0_15;
        }
        if (level.eql($$NoAmountFn)) {
            return ZERO_INTEGER;
        }
        return NIL;
    }

    public static SubLObject combined_evidence(final SubLObject lst) {
        if (NIL == lst) {
            return NIL;
        }
        final SubLObject product = creduce(symbol_function($sym55$_), lst, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject product_of_complements = subtract(ONE_INTEGER, cycl_utilities.formula_arg0(lst));
        SubLObject cdolist_list_var = cycl_utilities.formula_args(lst, UNPROVIDED);
        SubLObject x = NIL;
        x = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            product_of_complements = multiply(product_of_complements, subtract(ONE_INTEGER, x));
            cdolist_list_var = cdolist_list_var.rest();
            x = cdolist_list_var.first();
        } 
        return divide(product, add(product, product_of_complements));
    }

    public static SubLObject find_min_likelihood(final SubLObject lst) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = lst;
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cons(map_likelihood_to_numbers(entry), result);
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        } 
        final SubLObject min_entry = creduce(symbol_function(MIN), result, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != min_entry) {
            return make_unary_formula($$NumericLikelihoodFn, min_entry);
        }
        return $default_nart_plausibility$.getGlobalValue();
    }

    public static SubLObject clear_do_tva_query_type_type() {
        final SubLObject cs = $do_tva_query_type_type_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_do_tva_query_type_type(final SubLObject pred, final SubLObject col_1, final SubLObject col_2, final SubLObject mt, final SubLObject justifyP) {
        return memoization_state.caching_state_remove_function_results_with_args($do_tva_query_type_type_caching_state$.getGlobalValue(), list(pred, col_1, col_2, mt, justifyP), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject do_tva_query_type_type_internal(final SubLObject pred, final SubLObject col_1, final SubLObject col_2, final SubLObject mt, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject col_3 = plausibility_utilities.possibly_find_nart(possibly_get_atomic_collection(col_1));
        final SubLObject col_4 = plausibility_utilities.possibly_find_nart(possibly_get_atomic_collection(col_2));
        final SubLObject var0 = variables.get_variable(ZERO_INTEGER);
        SubLObject lst_of_justifications = NIL;
        thread.resetMultipleValues();
        final SubLObject result = plausibility_utilities.tva_unify_with_variable_lookup_and_values(list($$likelihoodOfArguments_TypeType, pred, col_3, col_4, var0), var0, mt, NIL, justifyP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        lst_of_justifications = cycl_utilities.formula_arg0(justifications);
        if (NIL != result) {
            return values(narts_high.nart_hl_formula(cycl_utilities.formula_arg0(result)), lst_of_justifications);
        }
        return NIL;
    }

    public static SubLObject do_tva_query_type_type(final SubLObject pred, final SubLObject col_1, final SubLObject col_2, final SubLObject mt, final SubLObject justifyP) {
        SubLObject caching_state = $do_tva_query_type_type_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(DO_TVA_QUERY_TYPE_TYPE, $do_tva_query_type_type_caching_state$, $int$4096, EQUAL, FIVE_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_DO_TVA_QUERY_TYPE_TYPE);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_5(pred, col_1, col_2, mt, justifyP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (pred.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (col_1.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (col_2.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (mt.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && justifyP.equal(cached_args.first())) {
                                    return memoization_state.caching_results(results2);
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(do_tva_query_type_type_internal(pred, col_1, col_2, mt, justifyP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pred, col_1, col_2, mt, justifyP));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject clear_do_tva_query_type_disjoint_with() {
        final SubLObject cs = $do_tva_query_type_disjoint_with_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_do_tva_query_type_disjoint_with(final SubLObject pred, final SubLObject col_1, final SubLObject col_2, final SubLObject mt, final SubLObject justifyP) {
        return memoization_state.caching_state_remove_function_results_with_args($do_tva_query_type_disjoint_with_caching_state$.getGlobalValue(), list(pred, col_1, col_2, mt, justifyP), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject do_tva_query_type_disjoint_with_internal(final SubLObject pred, final SubLObject col_1, final SubLObject col_2, final SubLObject mt, final SubLObject justifyP) {
        final SubLObject col_3 = plausibility_utilities.possibly_find_nart(possibly_get_atomic_collection(col_1));
        final SubLObject var0 = variables.get_variable(ZERO_INTEGER);
        final SubLObject var2 = variables.get_variable(ONE_INTEGER);
        SubLObject cdolist_list_var;
        final SubLObject bindings_justifications = cdolist_list_var = tva_inference.tva_unify(list($const63$likelihoodOfArgumentsWhenArg2NotI, pred, col_3, var0, var2), mt, NIL, justifyP, $NONE, T, NIL);
        SubLObject bindings_justification = NIL;
        bindings_justification = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = bindings_justification;
            SubLObject v_bindings = NIL;
            SubLObject justification = NIL;
            destructuring_bind_must_consp(current, datum, $list65);
            v_bindings = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list65);
            justification = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != disjoint_with.disjoint_withP(bindings.variable_lookup(var0, v_bindings), col_2, mt, UNPROVIDED)) {
                    return values(narts_high.nart_hl_formula(bindings.variable_lookup(var2, v_bindings)), justification);
                }
            } else {
                cdestructuring_bind_error(datum, $list65);
            }
            cdolist_list_var = cdolist_list_var.rest();
            bindings_justification = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject do_tva_query_type_disjoint_with(final SubLObject pred, final SubLObject col_1, final SubLObject col_2, final SubLObject mt, final SubLObject justifyP) {
        SubLObject caching_state = $do_tva_query_type_disjoint_with_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(DO_TVA_QUERY_TYPE_DISJOINT_WITH, $do_tva_query_type_disjoint_with_caching_state$, $int$4096, EQUAL, FIVE_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_DO_TVA_QUERY_TYPE_DISJOINT_WITH);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_5(pred, col_1, col_2, mt, justifyP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (pred.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (col_1.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (col_2.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (mt.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && justifyP.equal(cached_args.first())) {
                                    return memoization_state.caching_results(results2);
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(do_tva_query_type_disjoint_with_internal(pred, col_1, col_2, mt, justifyP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pred, col_1, col_2, mt, justifyP));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject do_tva_query_ins_not_in_col(final SubLObject pred, final SubLObject col_1, final SubLObject ins, final SubLObject mt, final SubLObject justifyP) {
        final SubLObject col_2 = plausibility_utilities.possibly_find_nart(col_1);
        final SubLObject var0 = variables.get_variable(ZERO_INTEGER);
        final SubLObject var2 = variables.get_variable(ONE_INTEGER);
        SubLObject cdolist_list_var;
        final SubLObject bindings_justifications = cdolist_list_var = tva_inference.tva_unify(list($const63$likelihoodOfArgumentsWhenArg2NotI, pred, col_2, var0, var2), mt, NIL, justifyP, $NONE, T, NIL);
        SubLObject bindings_justification = NIL;
        bindings_justification = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = bindings_justification;
            SubLObject v_bindings = NIL;
            SubLObject justification = NIL;
            destructuring_bind_must_consp(current, datum, $list65);
            v_bindings = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list65);
            justification = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != isa.not_isaP(ins, bindings.variable_lookup(var0, v_bindings), mt, UNPROVIDED)) {
                    return values(narts_high.nart_hl_formula(bindings.variable_lookup(var2, v_bindings)), justification);
                }
            } else {
                cdestructuring_bind_error(datum, $list65);
            }
            cdolist_list_var = cdolist_list_var.rest();
            bindings_justification = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject do_tva_query_type_ins(final SubLObject pred, final SubLObject col_1, final SubLObject ins, final SubLObject mt, final SubLObject justifyP) {
        final SubLObject col_2 = plausibility_utilities.possibly_find_nart(col_1);
        final SubLObject var0 = variables.get_variable(ZERO_INTEGER);
        final SubLObject var2 = variables.get_variable(ONE_INTEGER);
        SubLObject cdolist_list_var;
        final SubLObject bindings_justifications = cdolist_list_var = tva_inference.tva_unify(list($$likelihoodOfArguments_TypeType, pred, col_2, var0, var2), mt, NIL, justifyP, $NONE, T, NIL);
        SubLObject bindings_justification = NIL;
        bindings_justification = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = bindings_justification;
            SubLObject v_bindings = NIL;
            SubLObject justification = NIL;
            destructuring_bind_must_consp(current, datum, $list65);
            v_bindings = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list65);
            justification = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != isa.isaP(ins, bindings.variable_lookup(var0, v_bindings), mt, UNPROVIDED)) {
                    return values(narts_high.nart_hl_formula(bindings.variable_lookup(var2, v_bindings)), justification);
                }
            } else {
                cdestructuring_bind_error(datum, $list65);
            }
            cdolist_list_var = cdolist_list_var.rest();
            bindings_justification = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject do_tva_query_ins_type(final SubLObject pred, final SubLObject ins, final SubLObject col, final SubLObject mt, final SubLObject justifyP) {
        final SubLObject col_1 = plausibility_utilities.possibly_find_nart(col);
        final SubLObject var0 = variables.get_variable(ZERO_INTEGER);
        final SubLObject var2 = variables.get_variable(ONE_INTEGER);
        SubLObject cdolist_list_var;
        final SubLObject bindings_justifications = cdolist_list_var = tva_inference.tva_unify(list($$likelihoodOfArguments_TypeType, pred, var0, col_1, var2), mt, NIL, justifyP, $NONE, T, NIL);
        SubLObject bindings_justification = NIL;
        bindings_justification = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = bindings_justification;
            SubLObject v_bindings = NIL;
            SubLObject justification = NIL;
            destructuring_bind_must_consp(current, datum, $list65);
            v_bindings = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list65);
            justification = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != isa.isaP(ins, bindings.variable_lookup(var0, v_bindings), mt, UNPROVIDED)) {
                    return values(narts_high.nart_hl_formula(bindings.variable_lookup(var2, v_bindings)), justification);
                }
            } else {
                cdestructuring_bind_error(datum, $list65);
            }
            cdolist_list_var = cdolist_list_var.rest();
            bindings_justification = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject simple_nartP(final SubLObject col) {
        if (col.isList() && cycl_utilities.formula_arg0(col).eql($$and)) {
            return NIL;
        }
        if (NIL == member(cycl_utilities.formula_arg0(col), $nart_functions$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(col, $IGNORE);
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (v_term.isList() && (NIL != member(cycl_utilities.formula_arg0(v_term), $nart_functions$.getGlobalValue(), UNPROVIDED, UNPROVIDED))) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return T;
    }

    public static SubLObject possibly_get_atomic_collection(final SubLObject col) {
        if (col.isList()) {
            final SubLObject arg_0 = cycl_utilities.formula_arg0(col);
            if (NIL != member(arg_0, $nart_functions$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) {
                return cycl_utilities.formula_arg1(col, UNPROVIDED);
            }
        }
        return col;
    }

    public static SubLObject answers_for(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_answer = plausibility_utilities.implausible_sentenceP(col, $$EverythingPSC, T, UNPROVIDED);
        final SubLObject justify = thread.secondMultipleValue();
        thread.resetMultipleValues();
        format(T, $str68$____a__a_, v_answer, justify);
        format(T, $str69$____a_, plausibility_of_sentence(col, UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    public static SubLObject find_distance_between_term_sets(final SubLObject set_1, final SubLObject set_2, final SubLObject mt, SubLObject verbose) {
        if (verbose == UNPROVIDED) {
            verbose = NIL;
        }
        final SubLObject elements_1 = get_elements_of_set(set_1);
        final SubLObject elements_2 = get_elements_of_set(set_2);
        if ((NIL != elements_1) && (NIL != elements_2)) {
            final SubLObject score = find_distance_between_detected_and_predicted_features(elements_1, elements_2, mt, verbose);
            if (((NIL != score) && (!score.numL(ZERO_INTEGER))) && (!score.numG(ONE_INTEGER))) {
                return subtract(ONE_INTEGER, score);
            }
        }
        return NIL;
    }

    public static SubLObject find_distance_between_detected_and_predicted_features(final SubLObject features_1, final SubLObject features_2, final SubLObject mt, SubLObject verbose) {
        if (verbose == UNPROVIDED) {
            verbose = NIL;
        }
        SubLObject total = ZERO_INTEGER;
        final SubLObject len = length(features_1);
        SubLObject cdolist_list_var = features_1;
        SubLObject parse_feature = NIL;
        parse_feature = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject score = find_distance_between_parse_features_and_features(parse_feature, features_2, mt, verbose);
            if (NIL != verbose) {
                format(T, $str70$___Detected_Feature___a__a_, parse_feature, score);
                format(T, $str71$_________);
            }
            total = add(total, score);
            cdolist_list_var = cdolist_list_var.rest();
            parse_feature = cdolist_list_var.first();
        } 
        if (len.numG(ZERO_INTEGER)) {
            return divide(total, len);
        }
        return NIL;
    }

    public static SubLObject find_distance_between_parse_features_and_features(final SubLObject parse_feature, final SubLObject features, final SubLObject mt, final SubLObject verbose) {
        SubLObject lst_of_scores = NIL;
        SubLObject cdolist_list_var = features;
        SubLObject feature = NIL;
        feature = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject score = find_distance_between_collections(parse_feature, feature, mt, verbose);
            if (NIL != score) {
                lst_of_scores = cons(score, lst_of_scores);
            } else {
                lst_of_scores = cons(ONE_INTEGER, lst_of_scores);
            }
            cdolist_list_var = cdolist_list_var.rest();
            feature = cdolist_list_var.first();
        } 
        if (NIL != lst_of_scores) {
            return apply(symbol_function(MIN), lst_of_scores);
        }
        return ONE_INTEGER;
    }

    public static SubLObject find_apriori_score_for_collection(final SubLObject col_1) {
        SubLObject col = NIL;
        if (col_1.isList()) {
            col = narts_high.find_nart(col_1);
        } else {
            col = col_1;
        }
        if (NIL != col) {
            final SubLObject number_of_specs = cardinality_estimates.spec_cardinality(col);
            if (number_of_specs.isNumber()) {
                return divide(ONE_INTEGER, add(number_of_specs, TWO_INTEGER));
            }
        }
        return NIL;
    }

    public static SubLObject find_apriori_score_for_predicate(final SubLObject pred) {
        final SubLObject num = genl_predicates.count_all_spec_predicates(pred, $$EverythingPSC, UNPROVIDED);
        if (NIL != num) {
            return divide(ONE_INTEGER, add(num, TWO_INTEGER));
        }
        return NIL;
    }

    public static SubLObject coefficient_of_generalization(final SubLObject spec, final SubLObject genl) {
        final SubLObject coeff_of_generalization_of_parent = find_apriori_score_for_collection(genl);
        final SubLObject coeff_of_generalization_of_child = find_apriori_score_for_collection(spec);
        if ((NIL != coeff_of_generalization_of_parent) && (NIL != coeff_of_generalization_of_child)) {
            return divide(coeff_of_generalization_of_parent, coeff_of_generalization_of_child);
        }
        return NIL;
    }

    public static SubLObject coefficient_of_generalization_pred(final SubLObject spec, final SubLObject genl) {
        final SubLObject coeff_of_generalization_of_parent = find_apriori_score_for_predicate(spec);
        final SubLObject coeff_of_generalization_of_child = find_apriori_score_for_predicate(genl);
        if ((NIL != coeff_of_generalization_of_parent) && (NIL != coeff_of_generalization_of_child)) {
            return divide(coeff_of_generalization_of_parent, coeff_of_generalization_of_child);
        }
        return NIL;
    }

    public static SubLObject coefficient_of_specialization(final SubLObject spec, final SubLObject genl) {
        final SubLObject coeff_of_generalization_of_parent = find_apriori_score_for_collection(genl);
        final SubLObject coeff_of_generalization_of_child = find_apriori_score_for_collection(spec);
        if ((NIL != coeff_of_generalization_of_parent) && (NIL != coeff_of_generalization_of_child)) {
            return subtract(coeff_of_generalization_of_child, coeff_of_generalization_of_parent);
        }
        return NIL;
    }

    public static SubLObject find_lowest_common_ancestor(final SubLObject col_1, final SubLObject col_2, final SubLObject mt, SubLObject verbose) {
        if (verbose == UNPROVIDED) {
            verbose = NIL;
        }
        final SubLObject all_common_ancestors = find_common_genls(col_1, col_2);
        SubLObject scores_of_parent = NIL;
        SubLObject current_min = NIL;
        SubLObject cdolist_list_var = all_common_ancestors;
        SubLObject parent = NIL;
        parent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject depth = floor(divide(cardinality_estimates.generality_estimate(parent), $float$19403_06), UNPROVIDED);
            if (NIL != depth) {
                scores_of_parent = cons(list(parent, depth), scores_of_parent);
            }
            cdolist_list_var = cdolist_list_var.rest();
            parent = cdolist_list_var.first();
        } 
        current_min = cycl_utilities.formula_arg0(scores_of_parent);
        cdolist_list_var = scores_of_parent;
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (cycl_utilities.formula_arg1(entry, UNPROVIDED).numL(cycl_utilities.formula_arg1(current_min, UNPROVIDED))) {
                current_min = entry;
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        } 
        return cycl_utilities.formula_arg0(current_min);
    }

    public static SubLObject find_lowest_common_ancestor_of_predicates(final SubLObject pred_1, final SubLObject pred_2, final SubLObject mt, SubLObject verbose) {
        if (verbose == UNPROVIDED) {
            verbose = NIL;
        }
        final SubLObject all_common_ancestors = find_common_genlpreds(pred_1, pred_2);
        SubLObject scores_of_parent = NIL;
        SubLObject current_min = NIL;
        SubLObject cdolist_list_var = all_common_ancestors;
        SubLObject parent = NIL;
        parent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject depth = floor(divide(cardinality_estimates.generality_estimate(parent), $float$19403_06), UNPROVIDED);
            if (NIL != depth) {
                scores_of_parent = cons(list(parent, depth), scores_of_parent);
            }
            cdolist_list_var = cdolist_list_var.rest();
            parent = cdolist_list_var.first();
        } 
        current_min = cycl_utilities.formula_arg0(scores_of_parent);
        cdolist_list_var = scores_of_parent;
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (cycl_utilities.formula_arg1(entry, UNPROVIDED).numL(cycl_utilities.formula_arg1(current_min, UNPROVIDED))) {
                current_min = entry;
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        } 
        return cycl_utilities.formula_arg0(current_min);
    }

    public static SubLObject find_associations_between_objects(final SubLObject thing_1, final SubLObject thing_2) {
        if (thing_1.equal(thing_2)) {
            return ZERO_INTEGER;
        }
        if ((NIL != isa.isaP(thing_1, $$Collection, $$EverythingPSC, UNPROVIDED)) && (NIL != isa.isaP(thing_2, $$Collection, $$EverythingPSC, UNPROVIDED))) {
            return check_genl_associations(thing_1, thing_2);
        }
        if ((NIL != isa.isaP(thing_2, $$Individual, $$EverythingPSC, UNPROVIDED)) && (NIL != isa.isaP(thing_1, $$Collection, $$EverythingPSC, UNPROVIDED))) {
            return check_isa_associations(thing_1, thing_2);
        }
        return ONE_INTEGER;
    }

    public static SubLObject find_distance_between_collections(final SubLObject col_1, final SubLObject col_2, final SubLObject mt, SubLObject verbose) {
        if (verbose == UNPROVIDED) {
            verbose = NIL;
        }
        SubLObject score_1 = NIL;
        final SubLObject event_association_score = find_associations_between_objects(col_1, col_2);
        if (NIL != event_association_score) {
            score_1 = multiply($float$0_5, event_association_score);
        } else {
            score_1 = ONE_INTEGER;
        }
        return score_1;
    }

    public static SubLObject find_distance_between_collections_hierarchy(final SubLObject col_1, final SubLObject col_2, final SubLObject mt, SubLObject verbose) {
        if (verbose == UNPROVIDED) {
            verbose = NIL;
        }
        final SubLObject common_ancestor = find_lowest_common_ancestor(col_1, col_2, mt, verbose);
        if (NIL != common_ancestor) {
            final SubLObject specialization_score = coefficient_of_specialization(col_1, common_ancestor);
            final SubLObject generalization_score = coefficient_of_generalization(col_2, common_ancestor);
            if ((NIL != specialization_score) && (NIL != generalization_score)) {
                final SubLObject score = divide(add(log(add(ONE_INTEGER, multiply(TWO_INTEGER, specialization_score)), UNPROVIDED), subtract(ZERO_INTEGER, log(generalization_score, UNPROVIDED))), TWELVE_INTEGER);
                return score;
            }
        }
        return NIL;
    }

    public static SubLObject find_reinforcement_of_node(final SubLObject parent, final SubLObject col_1, final SubLObject col_2, final SubLObject mt) {
        final SubLObject no_of_paths_1 = length(gt_methods.gt_all_paths($$genls, col_1, parent, mt));
        final SubLObject no_of_paths_2 = length(gt_methods.gt_all_paths($$genls, col_2, parent, mt));
        if ((NIL != no_of_paths_1) && (NIL != no_of_paths_2)) {
            return add(no_of_paths_1, no_of_paths_2);
        }
        return NIL;
    }

    public static SubLObject find_common_genls(final SubLObject col_1, final SubLObject col_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject all = inference_kernel.new_cyc_query(listS($$nearestCommonGenls, col_1, col_2, $list77), $list78, list(new SubLObject[]{ $INFERENCE_MODE, $MINIMAL, $kw81$ALLOW_INDETERMINATE_RESULTS_, NIL, $DISJUNCTION_FREE_EL_VARS_POLICY, $COMPUTE_INTERSECTION, $kw84$TRANSFORMATION_ALLOWED_, NIL, $kw85$ADD_RESTRICTION_LAYER_OF_INDIRECTION_, T, $kw86$NEW_TERMS_ALLOWED_, NIL, $kw87$COMPUTE_ANSWER_JUSTIFICATIONS_, T, $MAX_TIME, FIVE_INTEGER, $PROBABLY_APPROXIMATELY_DONE, $float$1_0, $MAX_PROOF_DEPTH, FIFTEEN_INTEGER, $ANSWER_LANGUAGE, $HL, $CONTINUABLE_, T, $PRODUCTIVITY_LIMIT, $int$20000000 }));
        SubLObject answers = NIL;
        SubLObject cdolist_list_var = all;
        SubLObject x = NIL;
        x = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject col = bindings.variable_lookup($sym15$_X, x);
            SubLObject col_1_$16 = NIL;
            if (NIL != nart_handles.nart_p(col)) {
                col_1_$16 = narts_high.nart_hl_formula(plausibility_utilities.possibly_find_nart(col));
            } else {
                col_1_$16 = col;
            }
            if (NIL == member(col_1_$16, $not_useful_cols_for_similarity_computations$.getDynamicValue(thread), symbol_function(EQUAL), UNPROVIDED)) {
                answers = cons(bindings.variable_lookup($sym15$_X, x), answers);
            }
            cdolist_list_var = cdolist_list_var.rest();
            x = cdolist_list_var.first();
        } 
        return answers;
    }

    public static SubLObject find_common_genlpreds(final SubLObject pred_1, final SubLObject pred_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return set_difference(intersection(genl_predicates.all_genl_predicates(pred_1, $$EverythingPSC, UNPROVIDED), genl_predicates.all_genl_predicates(pred_2, $$EverythingPSC, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED), $not_useful_cols_for_similarity_computations$.getDynamicValue(thread), symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject check_genl_associations(final SubLObject event_1, final SubLObject event_2) {
        if (NIL != genls.genlP(event_1, event_2, $$EverythingPSC, UNPROVIDED)) {
            return ZERO_INTEGER;
        }
        if (NIL != genls.genlP(event_2, event_1, $$EverythingPSC, UNPROVIDED)) {
            return subtract(ONE_INTEGER, expt(coefficient_of_generalization(event_2, event_1), $float$0_25));
        }
        return NIL;
    }

    public static SubLObject check_genlpred_associations(final SubLObject pred_1, final SubLObject pred_2) {
        if (NIL != genl_predicates.genl_predicateP(pred_1, pred_2, $$EverythingPSC, UNPROVIDED)) {
            return subtract(ONE_INTEGER, expt(coefficient_of_generalization_pred(pred_2, pred_1), $float$0_25));
        }
        return subtract(ONE_INTEGER, expt(coefficient_of_generalization_pred(pred_1, pred_2), $float$0_25));
    }

    public static SubLObject check_isa_associations(final SubLObject thing_1, final SubLObject thing_2) {
        SubLObject lst_of_scores = NIL;
        SubLObject cdolist_list_var = isa.isa(thing_2, $$EverythingPSC, UNPROVIDED);
        SubLObject col = NIL;
        col = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject genl_association_score = check_genl_associations(thing_1, col);
            if (NIL != genl_association_score) {
                lst_of_scores = cons(genl_association_score, lst_of_scores);
            } else {
                lst_of_scores = cons(ONE_INTEGER, lst_of_scores);
            }
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        } 
        if (NIL != lst_of_scores) {
            return apply(symbol_function(MIN), lst_of_scores);
        }
        return ONE_INTEGER;
    }

    public static SubLObject get_elements_of_set(final SubLObject v_set) {
        final SubLObject all_answers = inference_kernel.new_cyc_query(list($$evaluate, $sym98$_ABC, list($$SetExtentFn, v_set)), UNPROVIDED, UNPROVIDED);
        if (NIL != all_answers) {
            return remove_duplicates(cycl_utilities.formula_args(bindings.variable_lookup($sym98$_ABC, cycl_utilities.formula_arg0(all_answers)), UNPROVIDED), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject find_distance_between_collections_sym(final SubLObject col_1, final SubLObject col_2, final SubLObject mt) {
        final SubLObject common_ancestor = find_lowest_common_ancestor(col_1, col_2, mt, UNPROVIDED);
        final SubLObject score_1 = check_genl_associations(common_ancestor, col_1);
        final SubLObject score_2 = check_genl_associations(common_ancestor, col_2);
        if ((NIL != score_1) && (NIL != score_2)) {
            return divide(add(score_1, score_2), TWO_INTEGER);
        }
        return ONE_INTEGER;
    }

    public static SubLObject find_distance_between_predicates_sym(final SubLObject pred_1, final SubLObject pred_2, final SubLObject mt) {
        final SubLObject common_ancestor = find_lowest_common_ancestor_of_predicates(pred_1, pred_2, mt, UNPROVIDED);
        final SubLObject score_1 = check_genlpred_associations(common_ancestor, pred_1);
        final SubLObject score_2 = check_genlpred_associations(common_ancestor, pred_2);
        if ((NIL != score_1) && (NIL != score_2)) {
            return divide(add(score_1, score_2), TWO_INTEGER);
        }
        return ONE_INTEGER;
    }

    public static SubLObject find_distance_between_individuals_sym(final SubLObject ind_1, final SubLObject ind_2, final SubLObject mt) {
        SubLObject lst_of_scores = NIL;
        SubLObject cdolist_list_var = isa.min_isa(ind_1, $$EverythingPSC, UNPROVIDED);
        SubLObject col_1 = NIL;
        col_1 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$17 = isa.min_isa(ind_2, $$EverythingPSC, UNPROVIDED);
            SubLObject col_2 = NIL;
            col_2 = cdolist_list_var_$17.first();
            while (NIL != cdolist_list_var_$17) {
                lst_of_scores = cons(find_distance_between_collections_sym(col_1, col_2, mt), lst_of_scores);
                cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                col_2 = cdolist_list_var_$17.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            col_1 = cdolist_list_var.first();
        } 
        return apply(symbol_function(MIN), lst_of_scores);
    }

    public static SubLObject find_distance_between_assertions(final SubLObject assertion_1, final SubLObject assertion_2, final SubLObject mt) {
        final SubLObject count_1 = length(assertion_1);
        final SubLObject count_2 = length(assertion_2);
        SubLObject sum_of_scores = ZERO_INTEGER;
        final SubLObject count = min(count_1, count_2);
        if ((NIL == assertion_1) || (NIL == assertion_2)) {
            return NIL;
        }
        SubLObject c;
        for (c = NIL, c = ZERO_INTEGER; c.numL(count); c = add(c, ONE_INTEGER)) {
            sum_of_scores = add(sum_of_scores, find_distance_between_terms_sym(nth(c, assertion_1), nth(c, assertion_2), mt));
        }
        if (NIL != sum_of_scores) {
            return divide(sum_of_scores, count);
        }
        return NIL;
    }

    public static SubLObject find_distance_between_terms_sym(final SubLObject term_1, final SubLObject term_2, final SubLObject mt) {
        if ((NIL != isa.isaP(term_1, $$Predicate, UNPROVIDED, UNPROVIDED)) && (NIL != isa.isaP(term_2, $$Predicate, UNPROVIDED, UNPROVIDED))) {
            return find_distance_between_predicates_sym(term_1, term_2, mt);
        }
        if ((NIL != isa.isaP(term_1, $$Collection, UNPROVIDED, UNPROVIDED)) && (NIL != isa.isaP(term_2, $$Collection, UNPROVIDED, UNPROVIDED))) {
            return find_distance_between_collections_sym(term_1, term_2, mt);
        }
        if ((NIL != isa.isaP(term_1, $$Individual, UNPROVIDED, UNPROVIDED)) && (NIL != isa.isaP(term_2, $$Individual, UNPROVIDED, UNPROVIDED))) {
            return find_distance_between_individuals_sym(term_1, term_2, mt);
        }
        return ONE_INTEGER;
    }

    public static SubLObject distance_between_two_strings(final SubLObject str1, final SubLObject str2) {
        if ((!str1.isString()) || (!str2.isString())) {
            return $int$1000;
        }
        final SubLObject m = length(str1);
        final SubLObject n = length(str2);
        SubLObject weight_due_to_common_terms = multiply(TEN_INTEGER, length(remove($str102$, intersection(string_utilities.split_string(str1, UNPROVIDED), string_utilities.split_string(str2, UNPROVIDED), symbol_function($sym103$STRING_), UNPROVIDED), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        if (m.numE(ZERO_INTEGER)) {
            return n;
        }
        if (n.numE(ZERO_INTEGER)) {
            return m;
        }
        final SubLObject distance_vector = vector_utilities.make_ndim_array(add(n, ONE_INTEGER), add(m, ONE_INTEGER));
        vector_utilities.set_aref_ndim(distance_vector, ZERO_INTEGER, ZERO_INTEGER, ZERO_INTEGER);
        SubLObject count;
        for (count = NIL, count = ZERO_INTEGER; count.numL(n); count = add(count, ONE_INTEGER)) {
            vector_utilities.set_aref_ndim(distance_vector, add(count, ONE_INTEGER), ZERO_INTEGER, add(vector_utilities.aref_ndim(distance_vector, count, ZERO_INTEGER), ONE_INTEGER));
        }
        for (count = NIL, count = ZERO_INTEGER; count.numL(m); count = add(count, ONE_INTEGER)) {
            vector_utilities.set_aref_ndim(distance_vector, ZERO_INTEGER, add(count, ONE_INTEGER), add(vector_utilities.aref_ndim(distance_vector, ZERO_INTEGER, count), ONE_INTEGER));
        }
        SubLObject x;
        SubLObject y;
        SubLObject same_character;
        SubLObject third_term;
        for (x = NIL, x = ZERO_INTEGER; x.numL(n); x = add(x, ONE_INTEGER)) {
            for (y = NIL, y = ZERO_INTEGER; y.numL(m); y = add(y, ONE_INTEGER)) {
                same_character = char_equal(aref(str1, y), aref(str2, x));
                third_term = NIL;
                if (NIL != same_character) {
                    third_term = vector_utilities.aref_ndim(distance_vector, x, y);
                } else {
                    third_term = add(ONE_INTEGER, vector_utilities.aref_ndim(distance_vector, x, y));
                }
                vector_utilities.set_aref_ndim(distance_vector, add(x, ONE_INTEGER), add(y, ONE_INTEGER), min(third_term, new SubLObject[]{ add(vector_utilities.aref_ndim(distance_vector, x, add(y, ONE_INTEGER)), ONE_INTEGER), add(ONE_INTEGER, vector_utilities.aref_ndim(distance_vector, add(x, ONE_INTEGER), y)) }));
            }
        }
        if (weight_due_to_common_terms.numE(ZERO_INTEGER)) {
            weight_due_to_common_terms = $int$_5;
        }
        return subtract(vector_utilities.aref_ndim(distance_vector, n, m), weight_due_to_common_terms);
    }

    public static SubLObject best_concept_match_for_string(final SubLObject str, SubLObject verbose) {
        if (verbose == UNPROVIDED) {
            verbose = NIL;
        }
        final SubLObject definite_description_match = find_definite_descriptions_match(str);
        final SubLObject length_of_input = length(replace_too_common_strings(str));
        if (NIL == definite_description_match) {
            return NIL;
        }
        final SubLObject gaf = cycl_utilities.formula_arg0(definite_description_match);
        final SubLObject distance = cycl_utilities.formula_arg1(definite_description_match, UNPROVIDED);
        final SubLObject length_of_closest_match = length(replace_too_common_strings(cycl_utilities.formula_arg2(gaf, UNPROVIDED)));
        if (NIL != verbose) {
            format(T, $str105$____a__a__a__a, new SubLObject[]{ length_of_closest_match, distance, length_of_input, definite_description_match });
        }
        if (distance.numL(ZERO_INTEGER) || distance.numE(ZERO_INTEGER)) {
            return cycl_utilities.formula_arg1(gaf, UNPROVIDED);
        }
        if (divide(distance, length_of_closest_match).numG($float$0_8)) {
            return NIL;
        }
        if (divide(distance, length_of_input).numG($float$0_8)) {
            return NIL;
        }
        return cycl_utilities.formula_arg1(gaf, UNPROVIDED);
    }

    public static SubLObject find_definite_descriptions_match(final SubLObject str1) {
        SubLObject list_of_assertions_and_their_distance = NIL;
        final SubLObject str2 = replace_too_common_strings(str1);
        SubLObject cdolist_list_var = genls.all_specs($$BiologySCGTemplateAdmittedThing, $$EverythingPSC, UNPROVIDED);
        SubLObject thing = NIL;
        thing = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL == genls.genlP(thing, $$IntelligentAgent, $$EverythingPSC, UNPROVIDED)) && (NIL == isa.isaP(thing, $const108$owl_Class, $$EverythingPSC, UNPROVIDED))) {
                SubLObject cdolist_list_var_$18;
                final SubLObject all_definite_description_assertions = cdolist_list_var_$18 = kb_mapping_utilities.pred_value_gafs_in_any_mt(thing, $$definiteDescriptions, ONE_INTEGER, UNPROVIDED);
                SubLObject definite_description_assertion = NIL;
                definite_description_assertion = cdolist_list_var_$18.first();
                while (NIL != cdolist_list_var_$18) {
                    final SubLObject gaf = assertions_high.gaf_formula(definite_description_assertion);
                    final SubLObject string_in_gaf = cycl_utilities.formula_arg2(gaf, UNPROVIDED);
                    list_of_assertions_and_their_distance = cons(list(gaf, distance_between_two_strings(str2, replace_too_common_strings(string_in_gaf))), list_of_assertions_and_their_distance);
                    cdolist_list_var_$18 = cdolist_list_var_$18.rest();
                    definite_description_assertion = cdolist_list_var_$18.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            thing = cdolist_list_var.first();
        } 
        return cycl_utilities.formula_arg0(Sort.sort(list_of_assertions_and_their_distance, symbol_function($sym111$_), FORMULA_ARG1));
    }

    public static SubLObject find_all_aura_concepts() {
        final SubLObject nat = narts_high.find_nart($list113);
        final SubLObject all_assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt(nat, $$quotedIsa, TWO_INTEGER, UNPROVIDED);
        SubLObject all = NIL;
        SubLObject cdolist_list_var = all_assertions;
        SubLObject x = NIL;
        x = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            all = cons(cycl_utilities.formula_arg1(assertions_high.gaf_formula(x), UNPROVIDED), all);
            cdolist_list_var = cdolist_list_var.rest();
            x = cdolist_list_var.first();
        } 
        return all;
    }

    public static SubLObject find_namestring_match(final SubLObject str1) {
        SubLObject list_of_assertions_and_their_distance = NIL;
        final SubLObject str2 = replace_too_common_strings(str1);
        SubLObject cdolist_list_var = genls.all_specs($$BiologySCGTemplateAdmittedThing, $$EverythingPSC, UNPROVIDED);
        SubLObject thing = NIL;
        thing = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == genls.genlP(thing, $$IntelligentAgent, $$EverythingPSC, UNPROVIDED)) {
                SubLObject cdolist_list_var_$19;
                final SubLObject all_name_string_assertions = cdolist_list_var_$19 = kb_mapping_utilities.pred_value_gafs_in_any_mt(thing, $$nameString, ONE_INTEGER, UNPROVIDED);
                SubLObject name_string_assertion = NIL;
                name_string_assertion = cdolist_list_var_$19.first();
                while (NIL != cdolist_list_var_$19) {
                    final SubLObject gaf = assertions_high.gaf_formula(name_string_assertion);
                    final SubLObject string_in_gaf = cycl_utilities.formula_arg2(gaf, UNPROVIDED);
                    list_of_assertions_and_their_distance = cons(list(gaf, distance_between_two_strings(str2, replace_too_common_strings(string_in_gaf))), list_of_assertions_and_their_distance);
                    cdolist_list_var_$19 = cdolist_list_var_$19.rest();
                    name_string_assertion = cdolist_list_var_$19.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            thing = cdolist_list_var.first();
        } 
        return cycl_utilities.formula_arg0(cycl_utilities.formula_arg0(Sort.sort(list_of_assertions_and_their_distance, symbol_function($sym111$_), FORMULA_ARG1)));
    }

    public static SubLObject replace_too_common_strings(final SubLObject str) {
        if (str.isString()) {
            return string_utilities.string_subst($$$_, $$$_does_, string_utilities.string_subst($$$_, $$$_with_, string_utilities.string_subst($$$_, $$$_where_, string_utilities.string_subst($$$_, $$$_and_, string_utilities.string_subst($$$_, $$$_do_, string_utilities.string_subst($$$_, $str122$_, string_utilities.string_subst($$$_, $$$_why_, string_utilities.string_subst($$$_, $$$_how_, string_utilities.string_subst($$$_, $$$_what_, string_utilities.string_subst($$$_, $$$_to_, string_utilities.string_subst($$$_, $$$_of_, string_utilities.string_subst($$$_, $$$_is_, string_utilities.string_subst($$$_, $$$_the_, string_utilities.string_subst($$$_, $$$_a_, string_utilities.string_subst($$$_, $$$_an_, Strings.string_downcase(string_utilities.concatenate_strings(list($$$_, str, $$$_)), UNPROVIDED, UNPROVIDED), UNPROVIDED), UNPROVIDED), UNPROVIDED), UNPROVIDED), UNPROVIDED), UNPROVIDED), UNPROVIDED), UNPROVIDED), UNPROVIDED), UNPROVIDED), UNPROVIDED), UNPROVIDED), UNPROVIDED), UNPROVIDED), UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject declare_plausible_narts_file() {
        declareFunction("default_plausubility_justification", "DEFAULT-PLAUSUBILITY-JUSTIFICATION", 2, 0, false);
        declareFunction("plausibility_of_sentence", "PLAUSIBILITY-OF-SENTENCE", 1, 2, false);
        declareFunction("handle_arbitrary_expression", "HANDLE-ARBITRARY-EXPRESSION", 1, 2, false);
        declareFunction("find_plausibility_of_collection", "FIND-PLAUSIBILITY-OF-COLLECTION", 1, 2, false);
        declareFunction("handle_nested_nart", "HANDLE-NESTED-NART", 1, 2, false);
        declareFunction("find_plausibility_of_sentences", "FIND-PLAUSIBILITY-OF-SENTENCES", 1, 2, false);
        declareFunction("combine_plausibility_scores", "COMBINE-PLAUSIBILITY-SCORES", 1, 0, false);
        declareFunction("assess_plausibility_of_sentence", "ASSESS-PLAUSIBILITY-OF-SENTENCE", 4, 0, false);
        declareFunction("assess_plausibility_of_isa_sentence", "ASSESS-PLAUSIBILITY-OF-ISA-SENTENCE", 4, 0, false);
        declareFunction("assess_plausibility_of_binary_predicate", "ASSESS-PLAUSIBILITY-OF-BINARY-PREDICATE", 4, 0, false);
        declareFunction("handle_plausibility_of_binary_predicate_types_ins", "HANDLE-PLAUSIBILITY-OF-BINARY-PREDICATE-TYPES-INS", 5, 0, false);
        declareFunction("handle_plausibility_of_binary_predicate_ins_types", "HANDLE-PLAUSIBILITY-OF-BINARY-PREDICATE-INS-TYPES", 5, 0, false);
        declareFunction("handle_plausibility_of_binary_predicate_types_types", "HANDLE-PLAUSIBILITY-OF-BINARY-PREDICATE-TYPES-TYPES", 5, 0, false);
        declareFunction("assess_plausibility_of_relation_instance_exists", "ASSESS-PLAUSIBILITY-OF-RELATION-INSTANCE-EXISTS", 4, 0, false);
        declareFunction("assess_plausibility_of_collections", "ASSESS-PLAUSIBILITY-OF-COLLECTIONS", 5, 0, false);
        declareFunction("gather_collections_for_variable", "GATHER-COLLECTIONS-FOR-VARIABLE", 2, 0, false);
        declareFunction("handle_simple_nart", "HANDLE-SIMPLE-NART", 3, 0, false);
        declareFunction("get_plausibility_of_binary_predicate_type_type", "GET-PLAUSIBILITY-OF-BINARY-PREDICATE-TYPE-TYPE", 5, 0, false);
        declareFunction("get_plausibility_of_binary_predicate_type_ins", "GET-PLAUSIBILITY-OF-BINARY-PREDICATE-TYPE-INS", 5, 0, false);
        declareFunction("handle_composite_activity_fn", "HANDLE-COMPOSITE-ACTIVITY-FN", 3, 0, false);
        declareFunction("handle_collection_intersection_2_fn", "HANDLE-COLLECTION-INTERSECTION-2-FN", 3, 0, false);
        declareFunction("handle_plausibility_of_isa_sentence", "HANDLE-PLAUSIBILITY-OF-ISA-SENTENCE", 4, 0, false);
        declareFunction("map_likelihood_to_numbers", "MAP-LIKELIHOOD-TO-NUMBERS", 1, 0, false);
        declareFunction("combined_evidence", "COMBINED-EVIDENCE", 1, 0, false);
        declareFunction("find_min_likelihood", "FIND-MIN-LIKELIHOOD", 1, 0, false);
        declareFunction("clear_do_tva_query_type_type", "CLEAR-DO-TVA-QUERY-TYPE-TYPE", 0, 0, false);
        declareFunction("remove_do_tva_query_type_type", "REMOVE-DO-TVA-QUERY-TYPE-TYPE", 5, 0, false);
        declareFunction("do_tva_query_type_type_internal", "DO-TVA-QUERY-TYPE-TYPE-INTERNAL", 5, 0, false);
        declareFunction("do_tva_query_type_type", "DO-TVA-QUERY-TYPE-TYPE", 5, 0, false);
        declareFunction("clear_do_tva_query_type_disjoint_with", "CLEAR-DO-TVA-QUERY-TYPE-DISJOINT-WITH", 0, 0, false);
        declareFunction("remove_do_tva_query_type_disjoint_with", "REMOVE-DO-TVA-QUERY-TYPE-DISJOINT-WITH", 5, 0, false);
        declareFunction("do_tva_query_type_disjoint_with_internal", "DO-TVA-QUERY-TYPE-DISJOINT-WITH-INTERNAL", 5, 0, false);
        declareFunction("do_tva_query_type_disjoint_with", "DO-TVA-QUERY-TYPE-DISJOINT-WITH", 5, 0, false);
        declareFunction("do_tva_query_ins_not_in_col", "DO-TVA-QUERY-INS-NOT-IN-COL", 5, 0, false);
        declareFunction("do_tva_query_type_ins", "DO-TVA-QUERY-TYPE-INS", 5, 0, false);
        declareFunction("do_tva_query_ins_type", "DO-TVA-QUERY-INS-TYPE", 5, 0, false);
        declareFunction("simple_nartP", "SIMPLE-NART?", 1, 0, false);
        declareFunction("possibly_get_atomic_collection", "POSSIBLY-GET-ATOMIC-COLLECTION", 1, 0, false);
        declareFunction("answers_for", "ANSWERS-FOR", 1, 0, false);
        declareFunction("find_distance_between_term_sets", "FIND-DISTANCE-BETWEEN-TERM-SETS", 3, 1, false);
        declareFunction("find_distance_between_detected_and_predicted_features", "FIND-DISTANCE-BETWEEN-DETECTED-AND-PREDICTED-FEATURES", 3, 1, false);
        declareFunction("find_distance_between_parse_features_and_features", "FIND-DISTANCE-BETWEEN-PARSE-FEATURES-AND-FEATURES", 4, 0, false);
        declareFunction("find_apriori_score_for_collection", "FIND-APRIORI-SCORE-FOR-COLLECTION", 1, 0, false);
        declareFunction("find_apriori_score_for_predicate", "FIND-APRIORI-SCORE-FOR-PREDICATE", 1, 0, false);
        declareFunction("coefficient_of_generalization", "COEFFICIENT-OF-GENERALIZATION", 2, 0, false);
        declareFunction("coefficient_of_generalization_pred", "COEFFICIENT-OF-GENERALIZATION-PRED", 2, 0, false);
        declareFunction("coefficient_of_specialization", "COEFFICIENT-OF-SPECIALIZATION", 2, 0, false);
        declareFunction("find_lowest_common_ancestor", "FIND-LOWEST-COMMON-ANCESTOR", 3, 1, false);
        declareFunction("find_lowest_common_ancestor_of_predicates", "FIND-LOWEST-COMMON-ANCESTOR-OF-PREDICATES", 3, 1, false);
        declareFunction("find_associations_between_objects", "FIND-ASSOCIATIONS-BETWEEN-OBJECTS", 2, 0, false);
        declareFunction("find_distance_between_collections", "FIND-DISTANCE-BETWEEN-COLLECTIONS", 3, 1, false);
        declareFunction("find_distance_between_collections_hierarchy", "FIND-DISTANCE-BETWEEN-COLLECTIONS-HIERARCHY", 3, 1, false);
        declareFunction("find_reinforcement_of_node", "FIND-REINFORCEMENT-OF-NODE", 4, 0, false);
        declareFunction("find_common_genls", "FIND-COMMON-GENLS", 2, 0, false);
        declareFunction("find_common_genlpreds", "FIND-COMMON-GENLPREDS", 2, 0, false);
        declareFunction("check_genl_associations", "CHECK-GENL-ASSOCIATIONS", 2, 0, false);
        declareFunction("check_genlpred_associations", "CHECK-GENLPRED-ASSOCIATIONS", 2, 0, false);
        declareFunction("check_isa_associations", "CHECK-ISA-ASSOCIATIONS", 2, 0, false);
        declareFunction("get_elements_of_set", "GET-ELEMENTS-OF-SET", 1, 0, false);
        declareFunction("find_distance_between_collections_sym", "FIND-DISTANCE-BETWEEN-COLLECTIONS-SYM", 3, 0, false);
        declareFunction("find_distance_between_predicates_sym", "FIND-DISTANCE-BETWEEN-PREDICATES-SYM", 3, 0, false);
        declareFunction("find_distance_between_individuals_sym", "FIND-DISTANCE-BETWEEN-INDIVIDUALS-SYM", 3, 0, false);
        declareFunction("find_distance_between_assertions", "FIND-DISTANCE-BETWEEN-ASSERTIONS", 3, 0, false);
        declareFunction("find_distance_between_terms_sym", "FIND-DISTANCE-BETWEEN-TERMS-SYM", 3, 0, false);
        declareFunction("distance_between_two_strings", "DISTANCE-BETWEEN-TWO-STRINGS", 2, 0, false);
        declareFunction("best_concept_match_for_string", "BEST-CONCEPT-MATCH-FOR-STRING", 1, 1, false);
        declareFunction("find_definite_descriptions_match", "FIND-DEFINITE-DESCRIPTIONS-MATCH", 1, 0, false);
        declareFunction("find_all_aura_concepts", "FIND-ALL-AURA-CONCEPTS", 0, 0, false);
        declareFunction("find_namestring_match", "FIND-NAMESTRING-MATCH", 1, 0, false);
        declareFunction("replace_too_common_strings", "REPLACE-TOO-COMMON-STRINGS", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_plausible_narts_file() {
        deflexical("*DEFAULT-NART-PLAUSIBILITY*", SubLTrampolineFile.maybeDefault($default_nart_plausibility$, $default_nart_plausibility$, $list1));
        deflexical("*TOO-GENERAL-COLS-FOR-PLAUSIBILITY*", SubLTrampolineFile.maybeDefault($too_general_cols_for_plausibility$, $too_general_cols_for_plausibility$, $list3));
        deflexical("*NART-FUNCTIONS*", SubLTrampolineFile.maybeDefault($nart_functions$, $nart_functions$, $list5));
        defparameter("*DEFAULT-PLAUSIBILITY-MT*", $$EverythingPSC);
        defparameter("*NOT-USEFUL-COLS-FOR-SIMILARITY-COMPUTATIONS*", $list7);
        deflexical("*DO-TVA-QUERY-TYPE-TYPE-CACHING-STATE*", NIL);
        deflexical("*DO-TVA-QUERY-TYPE-DISJOINT-WITH-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_plausible_narts_file() {
        declare_defglobal($default_nart_plausibility$);
        declare_defglobal($too_general_cols_for_plausibility$);
        declare_defglobal($nart_functions$);
        memoization_state.note_globally_cached_function(DO_TVA_QUERY_TYPE_TYPE);
        memoization_state.note_globally_cached_function(DO_TVA_QUERY_TYPE_DISJOINT_WITH);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_plausible_narts_file();
    }

    @Override
    public void initializeVariables() {
        init_plausible_narts_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_plausible_narts_file();
    }

    static {












































































































































    }
}

/**
 * Total time: 586 ms
 */
