package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class properties extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.properties";
    public static final String myFingerPrint = "2f3e74ce010cddec1c42a7e43c611715b609546b428ee69c3b57b130903b1bd5";
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 13233L)
    private static SubLSymbol $too_big_places_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 20701L)
    public static SubLSymbol $property_types_problem_store$;
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 23848L)
    public static SubLSymbol $property_types$;
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 23848L)
    private static SubLSymbol $existential_rmps$;
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 23848L)
    private static SubLSymbol $simple_binary_property_type_preds$;
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 23848L)
    private static SubLSymbol $other_simple_binary_property_patterns$;
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 23848L)
    private static SubLSymbol $simple_binary_property_patterns_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 23848L)
    private static SubLSymbol $ternary_property_patterns$;
    private static final SubLSymbol $kw0$CONDITIONAL_SENTENCE_;
    private static final SubLSymbol $sym1$_TERM;
    private static final SubLList $list2;
    private static final SubLObject $const3$relationInstanceExistsCount;
    private static final SubLObject $const4$relationInstanceExists;
    private static final SubLObject $const5$dateOfEvent;
    private static final SubLSymbol $sym6$_VALUE;
    private static final SubLObject $const7$temporallySubsumes;
    private static final SubLObject $const8$situationLocation;
    private static final SubLObject $const9$geographicalSubRegions;
    private static final SubLObject $const10$isa;
    private static final SubLList $list11;
    private static final SubLSymbol $sym12$VALUE;
    private static final SubLSymbol $sym13$PRED;
    private static final SubLSymbol $kw14$TERM;
    private static final SubLList $list15;
    private static final SubLList $list16;
    private static final SubLSymbol $sym17$INSTANCE_NAMED_FN_NAT_P;
    private static final SubLInteger $int18$150000;
    private static final SubLSymbol $kw19$BREADTH;
    private static final SubLSymbol $kw20$DEPTH;
    private static final SubLSymbol $kw21$STACK;
    private static final SubLSymbol $kw22$QUEUE;
    private static final SubLSymbol $sym23$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static final SubLSymbol $kw24$ERROR;
    private static final SubLString $str25$_A_is_not_a__A;
    private static final SubLSymbol $sym26$SBHL_TRUE_TV_P;
    private static final SubLSymbol $kw27$CERROR;
    private static final SubLString $str28$continue_anyway;
    private static final SubLSymbol $kw29$WARN;
    private static final SubLString $str30$_A_is_not_a_valid__sbhl_type_erro;
    private static final SubLObject $const31$genlPreds;
    private static final SubLString $str32$_A_is_neither_SET_P_nor_LISTP_;
    private static final SubLString $str33$attempting_to_bind_direction_link;
    private static final SubLString $str34$Node__a_does_not_pass_sbhl_type_t;
    private static final SubLList $list35;
    private static final SubLObject $const36$genls;
    private static final SubLSymbol $sym37$EL_EXISTENTIAL_P;
    private static final SubLList $list38;
    private static final SubLSymbol $kw39$IGNORE;
    private static final SubLObject $const40$InstanceNamedFn;
    private static final SubLSymbol $sym41$INTEGERP;
    private static final SubLObject $const42$greaterThanOrEqualTo;
    private static final SubLSymbol $sym43$DATE_P;
    private static final SubLObject $const44$CityNamedFn;
    private static final SubLObject $const45$TerritoryFn;
    private static final SubLObject $const46$City;
    private static final SubLSymbol $sym47$_COUNTRY;
    private static final SubLObject $const48$countryOfCity;
    private static final SubLObject $const49$GeographicalAgent;
    private static final SubLObject $const50$GeographicalRegion;
    private static final SubLSymbol $sym51$_TERRITORY;
    private static final SubLObject $const52$territoryOf;
    private static final SubLList $list53;
    private static final SubLSymbol $sym54$_BIG;
    private static final SubLSymbol $sym55$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const56$EverythingPSC;
    private static final SubLSymbol $sym57$PLACE_TOO_BIG_;
    private static final SubLString $str58$Couldn_t_find_bigger_places_for__;
    private static final SubLSymbol $sym59$TOO_BIG_PLACES;
    private static final SubLList $list60;
    private static final SubLSymbol $sym61$_TOO_BIG_PLACES_CACHING_STATE_;
    private static final SubLList $list62;
    private static final SubLSymbol $sym63$TRANS_PRED;
    private static final SubLSymbol $sym64$BIN_PRED;
    private static final SubLList $list65;
    private static final SubLList $list66;
    private static final SubLSymbol $sym67$COLLECTION;
    private static final SubLObject $const68$IntervalMinFn;
    private static final SubLList $list69;
    private static final SubLObject $const70$IntervalMaxFn;
    private static final SubLList $list71;
    private static final SubLSymbol $sym72$TERN_PRED;
    private static final SubLList $list73;
    private static final SubLList $list74;
    private static final SubLList $list75;
    private static final SubLList $list76;
    private static final SubLSymbol $sym77$_VAR;
    private static final SubLList $list78;
    private static final SubLObject $const79$TheSetOf;
    private static final SubLSymbol $sym80$_CARDINALITY;
    private static final SubLObject $const81$extentCardinality;
    private static final SubLSymbol $kw82$RETURN;
    private static final SubLSymbol $kw83$TEMPLATE;
    private static final SubLSymbol $kw84$GAF;
    private static final SubLSymbol $kw85$TRUE;
    private static final SubLInteger $int86$100000;
    private static final SubLSymbol $sym87$REUSED_;
    private static final SubLSymbol $sym88$CMULTIPLE_VALUE_BIND;
    private static final SubLSymbol $sym89$_PROPERTY_TYPES_PROBLEM_STORE_;
    private static final SubLList $list90;
    private static final SubLSymbol $sym91$CUNWIND_PROTECT;
    private static final SubLSymbol $sym92$PROGN;
    private static final SubLSymbol $sym93$PUNLESS;
    private static final SubLList $list94;
    private static final SubLObject $const95$TypicalityReferenceSetPropertyTyp;
    private static final SubLSymbol $sym96$_PROPERTY_TYPE;
    private static final SubLSymbol $kw97$MAX_TRANSFORMATION_DEPTH;
    private static final SubLSymbol $kw98$MAX_NUMBER;
    private static final SubLSymbol $kw99$MAX_TIME;
    private static final SubLInteger $int100$60;
    private static final SubLSymbol $kw101$PROBLEM_STORE;
    private static final SubLSymbol $sym102$_STRING;
    private static final SubLObject $const103$termStrings;
    private static final SubLList $list104;
    private static final SubLObject $const105$EnglishMt;
    private static final SubLObject $const106$typicalityReferenceSetPropertyTyp;
    private static final SubLList $list107;
    private static final SubLList $list108;
    private static final SubLSymbol $kw109$SUPER_EVENT;
    private static final SubLList $list110;
    private static final SubLSymbol $kw111$CONTACT;
    private static final SubLSymbol $kw112$DATE;
    private static final SubLSymbol $sym113$PROPERTY_TYPE_P_OLD;
    private static final SubLString $str114$_S_is_not_a_list_of_property_type;
    private static final SubLList $list115;
    private static final SubLList $list116;
    private static final SubLList $list117;
    private static final SubLList $list118;
    private static final SubLSymbol $sym119$SIMPLE_BINARY_PROPERTY_PATTERNS;
    private static final SubLList $list120;
    private static final SubLSymbol $kw121$GENL_PRED;
    private static final SubLList $list122;
    private static final SubLSymbol $sym123$_SIMPLE_BINARY_PROPERTY_PATTERNS_CACHING_STATE_;
    private static final SubLSymbol $sym124$SIMPLE_BINARY_PROPERTY_P;
    private static final SubLObject $const125$InferencePSC;
    private static final SubLList $list126;
    private static final SubLList $list127;
    private static final SubLList $list128;
    private static final SubLSymbol $sym129$TYPE;
    private static final SubLSymbol $sym130$TERM;
    private static final SubLObject $const131$SomeFn;
    private static final SubLList $list132;
    private static final SubLList $list133;
    private static final SubLSymbol $sym134$EL_CONJUNCTION_P;
    private static final SubLList $list135;
    private static final SubLObject $const136$AttackType;
    private static final SubLObject $const137$AttackOnObject;
    private static final SubLObject $const138$HostileSocialAction;
    private static final SubLObject $const139$KillingByOrganism;
    private static final SubLObject $const140$CapturingSomething;
    private static final SubLObject $const141$IncurringDamage;
    private static final SubLObject $const142$ManMadeDisaster;
    private static final SubLObject $const143$ObstructionEvent;
    private static final SubLObject $const144$MilitaryEvent;
    private static final SubLObject $const145$ExposureToSubstance;
    private static final SubLObject $const146$ActsCommonlyConsideredCriminal;
    private static final SubLObject $const147$ShootingAProjectileWeapon;
    private static final SubLList $list148;
    private static final SubLSymbol $sym149$ACT_TYPE;
    private static final SubLObject $const150$True_JustificationTruth;
    private static final SubLObject $const151$functionalInArgs;
    private static final SubLObject $const152$unknownSentence;
    private static final SubLList $list153;
    
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 1188L)
    public static SubLObject genl_propertyP(final SubLObject property1, final SubLObject property2, final SubLObject mt, SubLObject query_properties) {
        if (query_properties == properties.UNPROVIDED) {
            query_properties = (SubLObject)properties.NIL;
        }
        SubLObject ans = (SubLObject)properties.NIL;
        query_properties = conses_high.putf(query_properties, (SubLObject)properties.$kw0$CONDITIONAL_SENTENCE_, (SubLObject)properties.T);
        final SubLObject var = (SubLObject)properties.$sym1$_TERM;
        final SubLObject sentence1 = property_to_sentence(property1, var);
        final SubLObject sentence2 = property_to_sentence(property2, var);
        final SubLObject query_sentence = el_utilities.make_implication(sentence1, sentence2);
        final SubLObject query_result = inference_kernel.new_cyc_query(query_sentence, mt, query_properties);
        ans = cyc_kernel.closed_query_success_result_p(query_result);
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 1819L)
    public static SubLObject more_general_properties(final SubLObject property, final SubLObject mt, SubLObject more_specifics) {
        if (more_specifics == properties.UNPROVIDED) {
            more_specifics = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)properties.EQUAL), (SubLObject)properties.UNPROVIDED);
        }
        SubLObject ans = (SubLObject)properties.NIL;
        if (properties.NIL != el_utilities.atomic_sentenceP(property)) {
            ans = add_existential_more_general_properties(ans, property, mt);
            final SubLObject property_pred = cycl_utilities.formula_arg0(property);
            if (properties.NIL != conses_high.member(property_pred, (SubLObject)properties.$list2, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED)) {
                final SubLObject number_comparison_clauses = number_comparison_clauses(property);
                if (property_pred.eql(properties.$const3$relationInstanceExistsCount) && !properties.ZERO_INTEGER.eql(cycl_utilities.formula_arg4(property, (SubLObject)properties.UNPROVIDED))) {
                    final SubLObject more_general = el_utilities.replace_formula_arg((SubLObject)properties.ZERO_INTEGER, properties.$const4$relationInstanceExists, conses_high.butlast(property, (SubLObject)properties.UNPROVIDED));
                    ans = (SubLObject)ConsesLow.cons(more_general, ans);
                    note_more_specific_property(more_specifics, more_general, property);
                    SubLObject cdolist_list_var = number_comparison_clauses;
                    SubLObject number_comparison_clause = (SubLObject)properties.NIL;
                    number_comparison_clause = cdolist_list_var.first();
                    while (properties.NIL != cdolist_list_var) {
                        note_more_specific_property(more_specifics, more_general, number_comparison_clause);
                        cdolist_list_var = cdolist_list_var.rest();
                        number_comparison_clause = cdolist_list_var.first();
                    }
                }
                SubLObject cdolist_list_var2 = number_comparison_clauses;
                SubLObject number_comparison_clause2 = (SubLObject)properties.NIL;
                number_comparison_clause2 = cdolist_list_var2.first();
                while (properties.NIL != cdolist_list_var2) {
                    ans = (SubLObject)ConsesLow.cons(number_comparison_clause2, ans);
                    dictionary_utilities.dictionary_push(more_specifics, number_comparison_clause2, property);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    number_comparison_clause2 = cdolist_list_var2.first();
                }
            }
            else if (property_pred.eql(properties.$const5$dateOfEvent)) {
                final SubLObject date = cycl_utilities.formula_arg2(property, (SubLObject)properties.UNPROVIDED);
                final SubLObject date_var = (SubLObject)properties.$sym6$_VALUE;
                SubLObject cdolist_list_var = subsuming_dates(date);
                SubLObject bigger_date = (SubLObject)properties.NIL;
                bigger_date = cdolist_list_var.first();
                while (properties.NIL != cdolist_list_var) {
                    final SubLObject more_general2 = el_utilities.make_existential(date_var, simplifier.conjoin((SubLObject)ConsesLow.list(el_utilities.replace_formula_arg((SubLObject)properties.TWO_INTEGER, date_var, property), (SubLObject)ConsesLow.list(properties.$const7$temporallySubsumes, bigger_date, date_var)), (SubLObject)properties.UNPROVIDED));
                    ans = (SubLObject)ConsesLow.cons(more_general2, ans);
                    note_more_specific_property(more_specifics, more_general2, property);
                    cdolist_list_var = cdolist_list_var.rest();
                    bigger_date = cdolist_list_var.first();
                }
            }
            else if (properties.NIL != genl_predicates.genl_predicateP(property_pred, properties.$const8$situationLocation, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED)) {
                final SubLObject place = cycl_utilities.formula_arg2(property, (SubLObject)properties.UNPROVIDED);
                final SubLObject place_var = (SubLObject)properties.$sym6$_VALUE;
                SubLObject cdolist_list_var = bigger_places(place, mt);
                SubLObject bigger_place = (SubLObject)properties.NIL;
                bigger_place = cdolist_list_var.first();
                while (properties.NIL != cdolist_list_var) {
                    final SubLObject more_general2 = el_utilities.make_existential(place_var, simplifier.conjoin((SubLObject)ConsesLow.list(el_utilities.replace_formula_arg((SubLObject)properties.TWO_INTEGER, place_var, property), (SubLObject)ConsesLow.list(properties.$const9$geographicalSubRegions, bigger_place, place_var)), (SubLObject)properties.UNPROVIDED));
                    ans = (SubLObject)ConsesLow.cons(more_general2, ans);
                    note_more_specific_property(more_specifics, more_general2, property);
                    cdolist_list_var = cdolist_list_var.rest();
                    bigger_place = cdolist_list_var.first();
                }
                cdolist_list_var = place_types(place);
                SubLObject place_type = (SubLObject)properties.NIL;
                place_type = cdolist_list_var.first();
                while (properties.NIL != cdolist_list_var) {
                    final SubLObject more_general2 = el_utilities.make_existential(place_var, simplifier.conjoin((SubLObject)ConsesLow.list(el_utilities.replace_formula_arg((SubLObject)properties.TWO_INTEGER, place_var, property), (SubLObject)ConsesLow.list(properties.$const10$isa, place_var, place_type)), (SubLObject)properties.UNPROVIDED));
                    ans = (SubLObject)ConsesLow.cons(more_general2, ans);
                    note_more_specific_property(more_specifics, more_general2, property);
                    cdolist_list_var = cdolist_list_var.rest();
                    place_type = cdolist_list_var.first();
                }
            }
            ans = add_other_more_general_properties(ans, property, mt, more_specifics);
            ans = Sequences.nreverse(ans);
        }
        else if (properties.NIL != el_utilities.el_existential_p(property)) {
            ans = add_less_constrained_existential_properties(ans, property, mt, more_specifics);
        }
        return Values.values(ans, more_specifics);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 4726L)
    public static SubLObject add_existential_more_general_properties(SubLObject ans, final SubLObject property, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject success = formula_pattern_match.formula_matches_pattern(property, (SubLObject)properties.$list11);
        SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (properties.NIL != success) {
            final SubLObject value = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)properties.$sym12$VALUE, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
            final SubLObject pred = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)properties.$sym13$PRED, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
            if (properties.NIL == genl_predicates.genl_predicateP(pred, properties.$const10$isa, mt, (SubLObject)properties.UNPROVIDED)) {
                final SubLObject var = (SubLObject)properties.$sym6$_VALUE;
                final SubLObject item_var;
                final SubLObject existential_property = item_var = el_utilities.make_existential(var, (SubLObject)ConsesLow.list(pred, (SubLObject)properties.$kw14$TERM, var));
                if (properties.NIL == conses_high.member(item_var, ans, Symbols.symbol_function((SubLObject)properties.EQUAL), Symbols.symbol_function((SubLObject)properties.IDENTITY))) {
                    ans = (SubLObject)ConsesLow.cons(item_var, ans);
                }
                SubLObject cdolist_list_var = isa.min_isa(value, mt, (SubLObject)properties.UNPROVIDED);
                SubLObject v_isa = (SubLObject)properties.NIL;
                v_isa = cdolist_list_var.first();
                while (properties.NIL != cdolist_list_var) {
                    final SubLObject item_var2;
                    final SubLObject existential_property_$1 = item_var2 = el_utilities.make_existential(var, simplifier.conjoin((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(properties.$const10$isa, var, v_isa), (SubLObject)ConsesLow.list(pred, (SubLObject)properties.$kw14$TERM, var)), (SubLObject)properties.UNPROVIDED));
                    if (properties.NIL == conses_high.member(item_var2, ans, Symbols.symbol_function((SubLObject)properties.EQUAL), Symbols.symbol_function((SubLObject)properties.IDENTITY))) {
                        ans = (SubLObject)ConsesLow.cons(item_var2, ans);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    v_isa = cdolist_list_var.first();
                }
            }
        }
        thread.resetMultipleValues();
        success = formula_pattern_match.formula_matches_pattern(property, (SubLObject)properties.$list15);
        v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (properties.NIL != success) {
            final SubLObject value = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)properties.$sym12$VALUE, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
            final SubLObject pred = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)properties.$sym13$PRED, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
            final SubLObject var = (SubLObject)properties.$sym6$_VALUE;
            final SubLObject item_var;
            final SubLObject existential_property = item_var = el_utilities.make_existential(var, (SubLObject)ConsesLow.listS(pred, var, (SubLObject)properties.$list16));
            if (properties.NIL == conses_high.member(item_var, ans, Symbols.symbol_function((SubLObject)properties.EQUAL), Symbols.symbol_function((SubLObject)properties.IDENTITY))) {
                ans = (SubLObject)ConsesLow.cons(item_var, ans);
            }
            SubLObject cdolist_list_var = isa.min_isa(value, mt, (SubLObject)properties.UNPROVIDED);
            SubLObject v_isa = (SubLObject)properties.NIL;
            v_isa = cdolist_list_var.first();
            while (properties.NIL != cdolist_list_var) {
                final SubLObject item_var2;
                final SubLObject existential_property_$2 = item_var2 = el_utilities.make_existential(var, simplifier.conjoin((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(properties.$const10$isa, var, v_isa), (SubLObject)ConsesLow.listS(pred, var, (SubLObject)properties.$list16)), (SubLObject)properties.UNPROVIDED));
                if (properties.NIL == conses_high.member(item_var2, ans, Symbols.symbol_function((SubLObject)properties.EQUAL), Symbols.symbol_function((SubLObject)properties.IDENTITY))) {
                    ans = (SubLObject)ConsesLow.cons(item_var2, ans);
                }
                cdolist_list_var = cdolist_list_var.rest();
                v_isa = cdolist_list_var.first();
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 5788L)
    public static SubLObject add_other_more_general_properties(SubLObject ans, final SubLObject property, final SubLObject mt, final SubLObject more_specifics) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        ans = add_instance_named_fn_properties(ans, property, mt, more_specifics);
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            ans = add_genl_preds_properties(ans, property, more_specifics, mt);
            ans = add_genls_properties(ans, property, more_specifics);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 6142L)
    public static SubLObject add_instance_named_fn_properties(SubLObject ans, final SubLObject property, final SubLObject mt, final SubLObject more_specifics) {
        final SubLObject infn_argnum = Sequences.position_if((SubLObject)properties.$sym17$INSTANCE_NAMED_FN_NAT_P, property, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
        if (properties.NIL != infn_argnum) {
            final SubLObject infn = cycl_utilities.formula_arg(property, infn_argnum, (SubLObject)properties.UNPROVIDED);
            final SubLObject type = cycl_utilities.nat_arg2(infn, (SubLObject)properties.UNPROVIDED);
            final SubLObject var = (SubLObject)properties.$sym6$_VALUE;
            final SubLObject more_general = el_utilities.make_existential(var, simplifier.conjoin((SubLObject)ConsesLow.list(el_utilities.replace_formula_arg(infn_argnum, var, property), (SubLObject)ConsesLow.list(properties.$const10$isa, var, type)), (SubLObject)properties.UNPROVIDED));
            ans = (SubLObject)ConsesLow.cons(more_general, ans);
            note_more_specific_property(more_specifics, more_general, property);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 6696L)
    public static SubLObject add_genl_preds_properties(SubLObject ans, final SubLObject property, final SubLObject more_specifics, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject property_pred = cycl_utilities.formula_arg0(property);
        SubLObject more = (SubLObject)properties.NIL;
        final SubLObject max = (SubLObject)properties.THREE_INTEGER;
        final SubLObject generality_estimate_cutoff = (SubLObject)properties.$int18$150000;
        SubLObject stopP = (SubLObject)properties.NIL;
        if (properties.NIL == stopP) {
            final SubLObject node_var = property_pred;
            final SubLObject deck_type = (SubLObject)((properties.$kw19$BREADTH == properties.$kw20$DEPTH) ? properties.$kw21$STACK : properties.$kw22$QUEUE);
            final SubLObject recur_deck = deck.create_deck(deck_type);
            SubLObject node_and_predicate_mode = (SubLObject)properties.NIL;
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject tv_var = (SubLObject)properties.NIL;
                    final SubLObject _prev_bind_0_$3 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_tv$.bind((properties.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((properties.NIL != tv_var) ? properties.$sym23$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                        if (properties.NIL != tv_var && properties.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && properties.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                            if (pcase_var.eql((SubLObject)properties.$kw24$ERROR)) {
                                sbhl_paranoia.sbhl_error((SubLObject)properties.ONE_INTEGER, (SubLObject)properties.$str25$_A_is_not_a__A, tv_var, (SubLObject)properties.$sym26$SBHL_TRUE_TV_P, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
                            }
                            else if (pcase_var.eql((SubLObject)properties.$kw27$CERROR)) {
                                sbhl_paranoia.sbhl_cerror((SubLObject)properties.ONE_INTEGER, (SubLObject)properties.$str28$continue_anyway, (SubLObject)properties.$str25$_A_is_not_a__A, tv_var, (SubLObject)properties.$sym26$SBHL_TRUE_TV_P, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
                            }
                            else if (pcase_var.eql((SubLObject)properties.$kw29$WARN)) {
                                Errors.warn((SubLObject)properties.$str25$_A_is_not_a__A, tv_var, (SubLObject)properties.$sym26$SBHL_TRUE_TV_P);
                            }
                            else {
                                Errors.warn((SubLObject)properties.$str30$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                Errors.cerror((SubLObject)properties.$str28$continue_anyway, (SubLObject)properties.$str25$_A_is_not_a__A, tv_var, (SubLObject)properties.$sym26$SBHL_TRUE_TV_P);
                            }
                        }
                        final SubLObject _prev_bind_0_$4 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$5 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(properties.$const31$genlPreds), thread);
                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(properties.$const31$genlPreds)), thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(properties.$const31$genlPreds)), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)properties.NIL, thread);
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(properties.$const31$genlPreds), thread);
                            if (properties.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || properties.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(property_pred, sbhl_module_vars.get_sbhl_module((SubLObject)properties.UNPROVIDED))) {
                                final SubLObject _prev_bind_0_$5 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$6 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$8 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(properties.$const31$genlPreds)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)properties.NIL, thread);
                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)properties.UNPROVIDED);
                                    for (node_and_predicate_mode = (SubLObject)ConsesLow.list(property_pred, sbhl_search_vars.genl_inverse_mode_p()); properties.NIL != node_and_predicate_mode && properties.NIL == stopP; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                        final SubLObject node_var_$9 = node_and_predicate_mode.first();
                                        final SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                        final SubLObject genl_pred = node_var_$9;
                                        final SubLObject _prev_bind_0_$6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                            if (properties.NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$9)) {
                                                stopP = Numbers.numG(cardinality_estimates.generality_estimate(genl_pred), generality_estimate_cutoff);
                                                if (properties.NIL == stopP && !genl_pred.eql(property_pred) && properties.NIL != constant_handles.constant_p(genl_pred)) {
                                                    final SubLObject more_general = el_utilities.replace_formula_arg((SubLObject)properties.ZERO_INTEGER, genl_pred, property);
                                                    more = (SubLObject)ConsesLow.cons(more_general, more);
                                                    stopP = list_utilities.lengthGE(more, max, (SubLObject)properties.UNPROVIDED);
                                                    if (properties.NIL == stopP) {
                                                        SubLObject csome_list_var = more_general_properties(more_general, mt, more_specifics);
                                                        SubLObject more_more_general = (SubLObject)properties.NIL;
                                                        more_more_general = csome_list_var.first();
                                                        while (properties.NIL == stopP && properties.NIL != csome_list_var) {
                                                            final SubLObject item_var = more_more_general;
                                                            if (properties.NIL == conses_high.member(item_var, more, Symbols.symbol_function((SubLObject)properties.EQUAL), Symbols.symbol_function((SubLObject)properties.IDENTITY))) {
                                                                more = (SubLObject)ConsesLow.cons(item_var, more);
                                                            }
                                                            stopP = list_utilities.lengthGE(more, max, (SubLObject)properties.UNPROVIDED);
                                                            csome_list_var = csome_list_var.rest();
                                                            more_more_general = csome_list_var.first();
                                                        }
                                                    }
                                                    note_more_specific_property(more_specifics, more_general, property);
                                                }
                                            }
                                            final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(properties.$const31$genlPreds));
                                            SubLObject rest;
                                            SubLObject module_var;
                                            SubLObject _prev_bind_0_$7;
                                            SubLObject _prev_bind_1_$7;
                                            SubLObject node;
                                            SubLObject d_link;
                                            SubLObject mt_links;
                                            SubLObject iteration_state;
                                            SubLObject mt_$13;
                                            SubLObject tv_links;
                                            SubLObject _prev_bind_0_$8;
                                            SubLObject iteration_state_$15;
                                            SubLObject tv;
                                            SubLObject link_nodes;
                                            SubLObject _prev_bind_0_$9;
                                            SubLObject sol;
                                            SubLObject set_contents_var;
                                            SubLObject basis_object;
                                            SubLObject state;
                                            SubLObject node_vars_link_node;
                                            SubLObject csome_list_var2;
                                            SubLObject node_vars_link_node2;
                                            SubLObject new_list;
                                            SubLObject rest_$17;
                                            SubLObject generating_fn;
                                            SubLObject _prev_bind_0_$10;
                                            SubLObject sol2;
                                            SubLObject link_nodes2;
                                            SubLObject set_contents_var2;
                                            SubLObject basis_object2;
                                            SubLObject state2;
                                            SubLObject node_vars_link_node3;
                                            SubLObject csome_list_var3;
                                            SubLObject node_vars_link_node4;
                                            for (rest = (SubLObject)properties.NIL, rest = accessible_modules; properties.NIL == stopP && properties.NIL != rest; rest = rest.rest()) {
                                                module_var = rest.first();
                                                _prev_bind_0_$7 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                _prev_bind_1_$7 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((properties.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(properties.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    node = function_terms.naut_to_nart(node_var_$9);
                                                    if (properties.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)properties.UNPROVIDED));
                                                        if (properties.NIL != d_link) {
                                                            mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)properties.UNPROVIDED));
                                                            if (properties.NIL != mt_links) {
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); properties.NIL == stopP && properties.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    mt_$13 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (properties.NIL != mt_relevance_macros.relevant_mtP(mt_$13)) {
                                                                        _prev_bind_0_$8 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_$13, thread);
                                                                            for (iteration_state_$15 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); properties.NIL == stopP && properties.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$15); iteration_state_$15 = dictionary_contents.do_dictionary_contents_next(iteration_state_$15)) {
                                                                                thread.resetMultipleValues();
                                                                                tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$15);
                                                                                link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (properties.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    _prev_bind_0_$9 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        sol = link_nodes;
                                                                                        if (properties.NIL != set.set_p(sol)) {
                                                                                            set_contents_var = set.do_set_internal(sol);
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)properties.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); properties.NIL == stopP && properties.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (properties.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && properties.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)properties.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)properties.UNPROVIDED);
                                                                                                    deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            if (properties.NIL == stopP) {
                                                                                                csome_list_var2 = sol;
                                                                                                node_vars_link_node2 = (SubLObject)properties.NIL;
                                                                                                node_vars_link_node2 = csome_list_var2.first();
                                                                                                while (properties.NIL == stopP && properties.NIL != csome_list_var2) {
                                                                                                    if (properties.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)properties.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)properties.UNPROVIDED);
                                                                                                        deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                                                    node_vars_link_node2 = csome_list_var2.first();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)properties.$str32$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$9, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$15);
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$8, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_error((SubLObject)properties.FIVE_INTEGER, (SubLObject)properties.$str33$attempting_to_bind_direction_link, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (properties.NIL != obsolete.cnat_p(node, (SubLObject)properties.UNPROVIDED)) {
                                                        new_list = ((properties.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)properties.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)properties.UNPROVIDED)));
                                                        for (rest_$17 = (SubLObject)properties.NIL, rest_$17 = new_list; properties.NIL == stopP && properties.NIL != rest_$17; rest_$17 = rest_$17.rest()) {
                                                            generating_fn = rest_$17.first();
                                                            _prev_bind_0_$10 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                link_nodes2 = (sol2 = Functions.funcall(generating_fn, node));
                                                                if (properties.NIL != set.set_p(sol2)) {
                                                                    set_contents_var2 = set.do_set_internal(sol2);
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)properties.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); properties.NIL == stopP && properties.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if (properties.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && properties.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)properties.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)properties.UNPROVIDED);
                                                                            deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol2.isList()) {
                                                                    if (properties.NIL == stopP) {
                                                                        csome_list_var3 = sol2;
                                                                        node_vars_link_node4 = (SubLObject)properties.NIL;
                                                                        node_vars_link_node4 = csome_list_var3.first();
                                                                        while (properties.NIL == stopP && properties.NIL != csome_list_var3) {
                                                                            if (properties.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)properties.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)properties.UNPROVIDED);
                                                                                deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                            csome_list_var3 = csome_list_var3.rest();
                                                                            node_vars_link_node4 = csome_list_var3.first();
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)properties.$str32$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$10, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$7, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$7, thread);
                                                }
                                            }
                                        }
                                        finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$6, thread);
                                        }
                                    }
                                }
                                finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$8, thread);
                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$6, thread);
                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$5, thread);
                                }
                            }
                            else {
                                sbhl_paranoia.sbhl_warn((SubLObject)properties.TWO_INTEGER, (SubLObject)properties.$str34$Node__a_does_not_pass_sbhl_type_t, property_pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)properties.UNPROVIDED)), (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
                            }
                        }
                        finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$5, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$4, thread);
                        }
                    }
                    finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$3, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)properties.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
            }
        }
        if (properties.NIL != more) {
            ans = ConsesLow.append(Sequences.nreverse(more), ans);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 7625L)
    public static SubLObject add_genls_properties(SubLObject ans, final SubLObject property, final SubLObject more_specifics) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject property_pred = cycl_utilities.formula_arg0(property);
        if (properties.NIL != formula_pattern_match.formula_matches_pattern(property, (SubLObject)properties.$list35) && properties.NIL != conses_high.member(properties.$const36$genls, ke_tools.transitive_via_arg_preds(property_pred, (SubLObject)properties.TWO_INTEGER, (SubLObject)properties.UNPROVIDED), (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED)) {
            SubLObject more = (SubLObject)properties.NIL;
            final SubLObject max = (SubLObject)properties.THREE_INTEGER;
            final SubLObject generality_estimate_cutoff = (SubLObject)properties.$int18$150000;
            SubLObject stopP = (SubLObject)properties.NIL;
            final SubLObject property_coll = cycl_utilities.atomic_sentence_arg2(property, (SubLObject)properties.UNPROVIDED);
            if (properties.NIL == stopP) {
                SubLObject node_var = property_coll;
                final SubLObject deck_type = (SubLObject)((properties.$kw19$BREADTH == properties.$kw19$BREADTH) ? properties.$kw22$QUEUE : properties.$kw21$STACK);
                final SubLObject recur_deck = deck.create_deck(deck_type);
                final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = (SubLObject)properties.NIL;
                        final SubLObject _prev_bind_0_$20 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind((properties.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((properties.NIL != tv_var) ? properties.$sym23$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                            if (properties.NIL != tv_var && properties.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && properties.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql((SubLObject)properties.$kw24$ERROR)) {
                                    sbhl_paranoia.sbhl_error((SubLObject)properties.ONE_INTEGER, (SubLObject)properties.$str25$_A_is_not_a__A, tv_var, (SubLObject)properties.$sym26$SBHL_TRUE_TV_P, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)properties.$kw27$CERROR)) {
                                    sbhl_paranoia.sbhl_cerror((SubLObject)properties.ONE_INTEGER, (SubLObject)properties.$str28$continue_anyway, (SubLObject)properties.$str25$_A_is_not_a__A, tv_var, (SubLObject)properties.$sym26$SBHL_TRUE_TV_P, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)properties.$kw29$WARN)) {
                                    Errors.warn((SubLObject)properties.$str25$_A_is_not_a__A, tv_var, (SubLObject)properties.$sym26$SBHL_TRUE_TV_P);
                                }
                                else {
                                    Errors.warn((SubLObject)properties.$str30$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror((SubLObject)properties.$str28$continue_anyway, (SubLObject)properties.$str25$_A_is_not_a__A, tv_var, (SubLObject)properties.$sym26$SBHL_TRUE_TV_P);
                                }
                            }
                            final SubLObject _prev_bind_0_$21 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$22 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(properties.$const36$genls), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(properties.$const36$genls)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(properties.$const36$genls)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)properties.NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(properties.$const36$genls), thread);
                                if (properties.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || properties.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(property_coll, sbhl_module_vars.get_sbhl_module((SubLObject)properties.UNPROVIDED))) {
                                    final SubLObject _prev_bind_0_$22 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$23 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$25 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(properties.$const36$genls)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)properties.NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)properties.UNPROVIDED);
                                        while (properties.NIL != node_var && properties.NIL == stopP) {
                                            final SubLObject genl = node_var;
                                            stopP = Numbers.numG(cardinality_estimates.generality_estimate(genl), generality_estimate_cutoff);
                                            if (properties.NIL == stopP && !genl.eql(property_coll)) {
                                                final SubLObject more_general = el_utilities.replace_formula_arg((SubLObject)properties.TWO_INTEGER, genl, property);
                                                more = (SubLObject)ConsesLow.cons(more_general, more);
                                                stopP = list_utilities.lengthGE(more, max, (SubLObject)properties.UNPROVIDED);
                                                note_more_specific_property(more_specifics, more_general, property);
                                            }
                                            final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(properties.$const36$genls));
                                            SubLObject rest;
                                            SubLObject module_var;
                                            SubLObject _prev_bind_0_$23;
                                            SubLObject _prev_bind_1_$24;
                                            SubLObject node;
                                            SubLObject d_link;
                                            SubLObject mt_links;
                                            SubLObject iteration_state;
                                            SubLObject mt;
                                            SubLObject tv_links;
                                            SubLObject _prev_bind_0_$24;
                                            SubLObject iteration_state_$29;
                                            SubLObject tv;
                                            SubLObject link_nodes;
                                            SubLObject _prev_bind_0_$25;
                                            SubLObject sol;
                                            SubLObject set_contents_var;
                                            SubLObject basis_object;
                                            SubLObject state;
                                            SubLObject node_vars_link_node;
                                            SubLObject csome_list_var;
                                            SubLObject node_vars_link_node2;
                                            SubLObject new_list;
                                            SubLObject rest_$31;
                                            SubLObject generating_fn;
                                            SubLObject _prev_bind_0_$26;
                                            SubLObject sol2;
                                            SubLObject link_nodes2;
                                            SubLObject set_contents_var2;
                                            SubLObject basis_object2;
                                            SubLObject state2;
                                            SubLObject node_vars_link_node3;
                                            SubLObject csome_list_var2;
                                            SubLObject node_vars_link_node4;
                                            for (rest = (SubLObject)properties.NIL, rest = accessible_modules; properties.NIL == stopP && properties.NIL != rest; rest = rest.rest()) {
                                                module_var = rest.first();
                                                _prev_bind_0_$23 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                _prev_bind_1_$24 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((properties.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(properties.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    node = function_terms.naut_to_nart(node_var);
                                                    if (properties.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)properties.UNPROVIDED));
                                                        if (properties.NIL != d_link) {
                                                            mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)properties.UNPROVIDED));
                                                            if (properties.NIL != mt_links) {
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); properties.NIL == stopP && properties.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (properties.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        _prev_bind_0_$24 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            for (iteration_state_$29 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); properties.NIL == stopP && properties.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$29); iteration_state_$29 = dictionary_contents.do_dictionary_contents_next(iteration_state_$29)) {
                                                                                thread.resetMultipleValues();
                                                                                tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$29);
                                                                                link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (properties.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    _prev_bind_0_$25 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        sol = link_nodes;
                                                                                        if (properties.NIL != set.set_p(sol)) {
                                                                                            set_contents_var = set.do_set_internal(sol);
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)properties.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); properties.NIL == stopP && properties.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (properties.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && properties.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)properties.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)properties.UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            if (properties.NIL == stopP) {
                                                                                                csome_list_var = sol;
                                                                                                node_vars_link_node2 = (SubLObject)properties.NIL;
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                                while (properties.NIL == stopP && properties.NIL != csome_list_var) {
                                                                                                    if (properties.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)properties.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)properties.UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)properties.$str32$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$25, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$29);
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$24, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_error((SubLObject)properties.FIVE_INTEGER, (SubLObject)properties.$str33$attempting_to_bind_direction_link, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (properties.NIL != obsolete.cnat_p(node, (SubLObject)properties.UNPROVIDED)) {
                                                        new_list = ((properties.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)properties.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)properties.UNPROVIDED)));
                                                        for (rest_$31 = (SubLObject)properties.NIL, rest_$31 = new_list; properties.NIL == stopP && properties.NIL != rest_$31; rest_$31 = rest_$31.rest()) {
                                                            generating_fn = rest_$31.first();
                                                            _prev_bind_0_$26 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                link_nodes2 = (sol2 = Functions.funcall(generating_fn, node));
                                                                if (properties.NIL != set.set_p(sol2)) {
                                                                    set_contents_var2 = set.do_set_internal(sol2);
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)properties.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); properties.NIL == stopP && properties.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if (properties.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && properties.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)properties.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)properties.UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node3, recur_deck);
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol2.isList()) {
                                                                    if (properties.NIL == stopP) {
                                                                        csome_list_var2 = sol2;
                                                                        node_vars_link_node4 = (SubLObject)properties.NIL;
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                        while (properties.NIL == stopP && properties.NIL != csome_list_var2) {
                                                                            if (properties.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)properties.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)properties.UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node4, recur_deck);
                                                                            }
                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)properties.$str32$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$26, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$24, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$23, thread);
                                                }
                                            }
                                            node_var = deck.deck_pop(recur_deck);
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$25, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$23, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$22, thread);
                                    }
                                }
                                else {
                                    sbhl_paranoia.sbhl_warn((SubLObject)properties.TWO_INTEGER, (SubLObject)properties.$str34$Node__a_does_not_pass_sbhl_type_t, property_coll, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)properties.UNPROVIDED)), (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
                                }
                            }
                            finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$22, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$21, thread);
                            }
                        }
                        finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$20, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$27 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)properties.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$27, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                }
            }
            if (properties.NIL != more) {
                ans = ConsesLow.append(Sequences.nreverse(more), ans);
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 8519L)
    public static SubLObject add_less_constrained_existential_properties(SubLObject ans, final SubLObject property, final SubLObject mt, final SubLObject more_specifics) {
        assert properties.NIL != el_utilities.el_existential_p(property) : property;
        SubLObject less_constrained_properties = (SubLObject)properties.NIL;
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_args(property, (SubLObject)properties.UNPROVIDED);
        SubLObject var = (SubLObject)properties.NIL;
        SubLObject body = (SubLObject)properties.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)properties.$list38);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)properties.$list38);
        body = current.first();
        current = current.rest();
        if (properties.NIL == current) {
            if (properties.NIL != el_utilities.el_conjunction_p(body)) {
                SubLObject term_conjuncts = (SubLObject)properties.NIL;
                SubLObject other_conjuncts = (SubLObject)properties.NIL;
                SubLObject cdolist_list_var;
                final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(body, (SubLObject)properties.$kw39$IGNORE);
                SubLObject conjunct = (SubLObject)properties.NIL;
                conjunct = cdolist_list_var.first();
                while (properties.NIL != cdolist_list_var) {
                    if (properties.NIL != cycl_utilities.expression_find((SubLObject)properties.$kw14$TERM, conjunct, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED)) {
                        term_conjuncts = (SubLObject)ConsesLow.cons(conjunct, term_conjuncts);
                    }
                    else {
                        other_conjuncts = (SubLObject)ConsesLow.cons(conjunct, other_conjuncts);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    conjunct = cdolist_list_var.first();
                }
                if (properties.NIL != other_conjuncts) {
                    SubLObject cdolist_list_var2 = list_utilities.powerset(other_conjuncts);
                    SubLObject sub_other_conjuncts = (SubLObject)properties.NIL;
                    sub_other_conjuncts = cdolist_list_var2.first();
                    while (properties.NIL != cdolist_list_var2) {
                        if (!sub_other_conjuncts.equal(other_conjuncts)) {
                            final SubLObject conjuncts_to_use = ConsesLow.append(term_conjuncts, sub_other_conjuncts);
                            final SubLObject new_body = (properties.NIL != list_utilities.singletonP(conjuncts_to_use)) ? conjuncts_to_use.first() : simplifier.conjoin(conjuncts_to_use, (SubLObject)properties.UNPROVIDED);
                            final SubLObject less_constrained_property = el_utilities.make_existential(var, new_body);
                            less_constrained_properties = (SubLObject)ConsesLow.cons(less_constrained_property, less_constrained_properties);
                            note_more_specific_property(more_specifics, less_constrained_property, property);
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        sub_other_conjuncts = cdolist_list_var2.first();
                    }
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)properties.$list38);
        }
        final SubLObject reformulated = reformulate_property_for_paraphrase(property);
        if (!reformulated.equal(property)) {
            SubLObject cdolist_list_var3 = more_general_properties(reformulated, mt, more_specifics);
            SubLObject more = (SubLObject)properties.NIL;
            more = cdolist_list_var3.first();
            while (properties.NIL != cdolist_list_var3) {
                final SubLObject item_var = more;
                if (properties.NIL == conses_high.member(item_var, less_constrained_properties, Symbols.symbol_function((SubLObject)properties.EQUAL), Symbols.symbol_function((SubLObject)properties.IDENTITY))) {
                    less_constrained_properties = (SubLObject)ConsesLow.cons(item_var, less_constrained_properties);
                }
                note_more_specific_property(more_specifics, more, property);
                cdolist_list_var3 = cdolist_list_var3.rest();
                more = cdolist_list_var3.first();
            }
        }
        if (properties.NIL != less_constrained_properties) {
            ans = ConsesLow.append(less_constrained_properties, ans);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 10027L)
    public static SubLObject note_more_specific_property(final SubLObject more_specifics, final SubLObject more_general, final SubLObject more_specific) {
        dictionary_utilities.dictionary_push(more_specifics, more_general, more_specific);
        return more_specifics;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 10205L)
    public static SubLObject instance_named_fn_nat_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(properties.NIL != el_utilities.possibly_nat_p(v_object) && cycl_utilities.nat_functor(v_object).eql(properties.$const40$InstanceNamedFn));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 10346L)
    public static SubLObject number_comparison_clauses(final SubLObject property) {
        final SubLObject number_argnum = Sequences.position_if((SubLObject)properties.$sym41$INTEGERP, property, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
        SubLObject ans = (SubLObject)properties.NIL;
        final SubLObject count = cycl_utilities.formula_arg(property, number_argnum, (SubLObject)properties.UNPROVIDED);
        final SubLObject var = (SubLObject)properties.$sym6$_VALUE;
        if (properties.NIL != subl_promotions.positive_integer_p(count)) {
            ans = (SubLObject)ConsesLow.list(el_utilities.make_existential(var, simplifier.conjoin((SubLObject)ConsesLow.list(el_utilities.replace_formula_arg(number_argnum, var, property), (SubLObject)ConsesLow.list(properties.$const42$greaterThanOrEqualTo, var, count)), (SubLObject)properties.UNPROVIDED)));
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 10975L)
    public static SubLObject subsuming_dates(final SubLObject date) {
        SubLObject bigger_dates = (SubLObject)properties.NIL;
        if (properties.NIL != date_utilities.date_p(date)) {
            bigger_dates = Sequences.remove(date, list_utilities.remove_if_not((SubLObject)properties.$sym43$DATE_P, (SubLObject)ConsesLow.list(date_utilities.century_of_date(date), date_utilities.decade_of_date(date), date_utilities.year_of_date(date), date_utilities.month_of_date(date), date_utilities.day_of_date(date)), (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED), Symbols.symbol_function((SubLObject)properties.EQUAL), (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
        }
        return bigger_dates;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 11538L)
    public static SubLObject bigger_places(final SubLObject place, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject bigger_places = (SubLObject)properties.NIL;
        if ((properties.NIL != narts_high.naut_p(place) || properties.NIL != nart_handles.nart_p(place)) && cycl_utilities.nat_functor(place).eql(properties.$const44$CityNamedFn)) {
            final SubLObject location = cycl_utilities.nat_arg2(place, (SubLObject)properties.UNPROVIDED);
            bigger_places = (SubLObject)ConsesLow.cons(location, bigger_places(location, mt));
        }
        else if (properties.NIL == kb_indexing_datastructures.indexed_term_p(place)) {
            bigger_places = (SubLObject)properties.NIL;
        }
        if (properties.NIL != nart_handles.nart_p(narts_high.find_nart((SubLObject)ConsesLow.list(properties.$const45$TerritoryFn, place)))) {
            bigger_places = ConsesLow.append(bigger_places, bigger_places(narts_high.find_nart((SubLObject)ConsesLow.list(properties.$const45$TerritoryFn, place)), mt));
        }
        if (properties.NIL != isa.isa_in_any_mtP(place, properties.$const46$City)) {
            final SubLObject country = ask_utilities.ask_variable((SubLObject)properties.$sym47$_COUNTRY, (SubLObject)ConsesLow.list(properties.$const48$countryOfCity, (SubLObject)properties.$sym47$_COUNTRY, place), mt, (SubLObject)properties.NIL, (SubLObject)properties.ONE_INTEGER, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED).first();
            if (properties.NIL != country) {
                bigger_places = ConsesLow.append(bigger_places, bigger_places(country, mt));
            }
        }
        if (properties.NIL != isa.isaP(place, properties.$const49$GeographicalAgent, mt, (SubLObject)properties.UNPROVIDED) && properties.NIL == isa.isaP(place, properties.$const50$GeographicalRegion, mt, (SubLObject)properties.UNPROVIDED)) {
            final SubLObject territory = ask_utilities.ask_variable((SubLObject)properties.$sym51$_TERRITORY, (SubLObject)ConsesLow.listS(properties.$const52$territoryOf, place, (SubLObject)properties.$list53), mt, (SubLObject)properties.NIL, (SubLObject)properties.ONE_INTEGER, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED).first();
            if (properties.NIL != territory) {
                bigger_places = ConsesLow.append(bigger_places, bigger_places(territory, mt));
            }
        }
        else {
            SubLObject all_answers = ask_utilities.ask_variable((SubLObject)properties.$sym54$_BIG, (SubLObject)ConsesLow.list(properties.$const9$geographicalSubRegions, (SubLObject)properties.$sym54$_BIG, place), mt, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)properties.$sym55$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(properties.$const56$EverythingPSC, thread);
                all_answers = Sequences.remove_if((SubLObject)properties.$sym57$PLACE_TOO_BIG_, all_answers, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            bigger_places = ConsesLow.append(bigger_places, all_answers);
        }
        if (properties.NIL == bigger_places) {
            Errors.warn((SubLObject)properties.$str58$Couldn_t_find_bigger_places_for__, place);
        }
        return Sequences.delete_duplicates(bigger_places, Symbols.symbol_function((SubLObject)properties.EQUAL), (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 13133L)
    public static SubLObject place_too_bigP(final SubLObject place) {
        return subl_promotions.memberP(narts_high.nart_substitute(place), too_big_places(), (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 13233L)
    public static SubLObject clear_too_big_places() {
        final SubLObject cs = properties.$too_big_places_caching_state$.getGlobalValue();
        if (properties.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)properties.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 13233L)
    public static SubLObject remove_too_big_places() {
        return memoization_state.caching_state_remove_function_results_with_args(properties.$too_big_places_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(properties.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 13233L)
    public static SubLObject too_big_places_internal() {
        SubLObject big_places = (SubLObject)properties.NIL;
        SubLObject cdolist_list_var = (SubLObject)properties.$list60;
        SubLObject place_type = (SubLObject)properties.NIL;
        place_type = cdolist_list_var.first();
        while (properties.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$34 = isa.all_fort_instances(place_type, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
            SubLObject place = (SubLObject)properties.NIL;
            place = cdolist_list_var_$34.first();
            while (properties.NIL != cdolist_list_var_$34) {
                big_places = (SubLObject)ConsesLow.cons(place, big_places);
                cdolist_list_var_$34 = cdolist_list_var_$34.rest();
                place = cdolist_list_var_$34.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            place_type = cdolist_list_var.first();
        }
        return big_places;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 13233L)
    public static SubLObject too_big_places() {
        SubLObject caching_state = properties.$too_big_places_caching_state$.getGlobalValue();
        if (properties.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)properties.$sym59$TOO_BIG_PLACES, (SubLObject)properties.$sym61$_TOO_BIG_PLACES_CACHING_STATE_, (SubLObject)properties.NIL, (SubLObject)properties.EQL, (SubLObject)properties.ZERO_INTEGER, (SubLObject)properties.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)properties.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(too_big_places_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)properties.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 13494L)
    public static SubLObject place_types(final SubLObject place) {
        if (properties.NIL == nart_handles.nart_p(place) && properties.NIL == narts_high.naut_p(place)) {
            return (SubLObject)properties.NIL;
        }
        final SubLObject pcase_var = cycl_utilities.nat_functor(place);
        if (pcase_var.eql(properties.$const40$InstanceNamedFn)) {
            return (SubLObject)ConsesLow.list(cycl_utilities.nat_arg2(place, (SubLObject)properties.UNPROVIDED));
        }
        return (SubLObject)properties.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 13716L)
    public static SubLObject reformulate_property_for_paraphrase(final SubLObject property) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject reformulated = (SubLObject)properties.NIL;
        thread.resetMultipleValues();
        SubLObject success = formula_pattern_match.formula_matches_pattern(property, (SubLObject)properties.$list62);
        SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (properties.NIL != success) {
            final SubLObject value = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)properties.$sym12$VALUE, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
            final SubLObject trans_pred = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)properties.$sym63$TRANS_PRED, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
            final SubLObject bin_pred = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)properties.$sym64$BIN_PRED, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)properties.$sym55$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(properties.$const56$EverythingPSC, thread);
                final SubLObject valid_trans_preds = ke_tools.transitive_via_arg_inverses(bin_pred, (SubLObject)properties.TWO_INTEGER, (SubLObject)properties.UNPROVIDED);
                if (properties.NIL != subl_promotions.memberP(trans_pred, valid_trans_preds, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED)) {
                    reformulated = (SubLObject)ConsesLow.list(bin_pred, (SubLObject)properties.$kw14$TERM, value);
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        if (properties.NIL == reformulated) {
            thread.resetMultipleValues();
            success = formula_pattern_match.formula_matches_pattern(property, (SubLObject)properties.$list65);
            v_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (properties.NIL != success) {
                final SubLObject value = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)properties.$sym12$VALUE, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
                final SubLObject trans_pred = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)properties.$sym63$TRANS_PRED, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
                final SubLObject bin_pred = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)properties.$sym64$BIN_PRED, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)properties.$sym55$RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind(properties.$const56$EverythingPSC, thread);
                    final SubLObject valid_trans_preds = ke_tools.transitive_via_arg_inverses(bin_pred, (SubLObject)properties.TWO_INTEGER, (SubLObject)properties.UNPROVIDED);
                    if (properties.NIL != subl_promotions.memberP(trans_pred, valid_trans_preds, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED)) {
                        reformulated = (SubLObject)ConsesLow.list(bin_pred, (SubLObject)properties.$kw14$TERM, value);
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
        }
        if (properties.NIL == reformulated) {
            thread.resetMultipleValues();
            success = formula_pattern_match.formula_matches_pattern(property, (SubLObject)properties.$list66);
            v_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (properties.NIL != success) {
                final SubLObject value = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)properties.$sym12$VALUE, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
                final SubLObject collection = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)properties.$sym67$COLLECTION, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
                final SubLObject bin_pred = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)properties.$sym64$BIN_PRED, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
                reformulated = (SubLObject)ConsesLow.list(properties.$const3$relationInstanceExistsCount, bin_pred, (SubLObject)properties.$kw14$TERM, collection, (SubLObject)ConsesLow.list(properties.$const68$IntervalMinFn, value));
            }
        }
        if (properties.NIL == reformulated) {
            thread.resetMultipleValues();
            success = formula_pattern_match.formula_matches_pattern(property, (SubLObject)properties.$list69);
            v_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (properties.NIL != success) {
                final SubLObject value = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)properties.$sym12$VALUE, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
                final SubLObject collection = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)properties.$sym67$COLLECTION, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
                final SubLObject bin_pred = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)properties.$sym64$BIN_PRED, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
                reformulated = (SubLObject)ConsesLow.list(properties.$const3$relationInstanceExistsCount, bin_pred, (SubLObject)properties.$kw14$TERM, collection, (SubLObject)ConsesLow.list(properties.$const70$IntervalMaxFn, value));
            }
        }
        if (properties.NIL == reformulated) {
            thread.resetMultipleValues();
            success = formula_pattern_match.formula_matches_pattern(property, (SubLObject)properties.$list71);
            v_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (properties.NIL != success) {
                final SubLObject value = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)properties.$sym12$VALUE, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
                final SubLObject collection = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)properties.$sym67$COLLECTION, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
                final SubLObject tern_pred = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)properties.$sym72$TERN_PRED, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
                reformulated = (SubLObject)ConsesLow.list(tern_pred, (SubLObject)properties.$kw14$TERM, collection, (SubLObject)ConsesLow.list(properties.$const70$IntervalMaxFn, value));
            }
        }
        if (properties.NIL == reformulated) {
            thread.resetMultipleValues();
            success = formula_pattern_match.formula_matches_pattern(property, (SubLObject)properties.$list73);
            v_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (properties.NIL != success) {
                final SubLObject value = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)properties.$sym12$VALUE, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
                final SubLObject collection = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)properties.$sym67$COLLECTION, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
                final SubLObject tern_pred = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)properties.$sym72$TERN_PRED, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
                reformulated = (SubLObject)ConsesLow.list(tern_pred, (SubLObject)properties.$kw14$TERM, collection, (SubLObject)ConsesLow.list(properties.$const70$IntervalMaxFn, value));
            }
        }
        if (properties.NIL == reformulated) {
            thread.resetMultipleValues();
            success = formula_pattern_match.formula_matches_pattern(property, (SubLObject)properties.$list74);
            v_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (properties.NIL != success) {
                final SubLObject value = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)properties.$sym12$VALUE, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
                final SubLObject collection = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)properties.$sym67$COLLECTION, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
                final SubLObject tern_pred = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)properties.$sym72$TERN_PRED, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
                reformulated = (SubLObject)ConsesLow.list(tern_pred, (SubLObject)properties.$kw14$TERM, collection, (SubLObject)ConsesLow.list(properties.$const68$IntervalMinFn, value));
            }
        }
        if (properties.NIL == reformulated) {
            thread.resetMultipleValues();
            success = formula_pattern_match.formula_matches_pattern(property, (SubLObject)properties.$list75);
            v_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (properties.NIL != success) {
                final SubLObject value = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)properties.$sym12$VALUE, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
                final SubLObject collection = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)properties.$sym67$COLLECTION, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
                final SubLObject tern_pred = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)properties.$sym72$TERN_PRED, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
                reformulated = (SubLObject)ConsesLow.list(tern_pred, (SubLObject)properties.$kw14$TERM, collection, (SubLObject)ConsesLow.list(properties.$const68$IntervalMinFn, value));
            }
        }
        if (properties.NIL == reformulated) {
            thread.resetMultipleValues();
            success = formula_pattern_match.formula_matches_pattern(property, (SubLObject)properties.$list76);
            v_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (properties.NIL != success) {
                final SubLObject value = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)properties.$sym12$VALUE, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
                final SubLObject collection = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)properties.$sym67$COLLECTION, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
                final SubLObject bin_pred = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)properties.$sym64$BIN_PRED, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
                reformulated = (SubLObject)ConsesLow.list(properties.$const3$relationInstanceExistsCount, bin_pred, (SubLObject)properties.$kw14$TERM, collection, (SubLObject)ConsesLow.list(properties.$const70$IntervalMaxFn, value));
            }
        }
        return (properties.NIL != reformulated) ? reformulated : property;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 17571L)
    public static SubLObject properties_to_sentences(final SubLObject v_properties, final SubLObject v_term) {
        SubLObject sentences = (SubLObject)properties.NIL;
        SubLObject cdolist_list_var = v_properties;
        SubLObject property = (SubLObject)properties.NIL;
        property = cdolist_list_var.first();
        while (properties.NIL != cdolist_list_var) {
            sentences = (SubLObject)ConsesLow.cons(property_to_sentence(property, v_term), sentences);
            cdolist_list_var = cdolist_list_var.rest();
            property = cdolist_list_var.first();
        }
        return Sequences.nreverse(sentences);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 17845L)
    public static SubLObject property_to_sentence(final SubLObject property, final SubLObject v_term) {
        return cycl_utilities.expression_subst(v_term, (SubLObject)properties.$kw14$TERM, property, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 17946L)
    public static SubLObject property_to_set_or_collection(final SubLObject property) {
        final SubLObject var = czer_utilities.unique_el_var_wrt_expression(property, (SubLObject)properties.$sym77$_VAR);
        final SubLObject property_sentence = property_to_sentence(property, var);
        if (properties.NIL != formula_pattern_match.formula_matches_pattern(property_sentence, (SubLObject)ConsesLow.listS(properties.$const10$isa, var, (SubLObject)properties.$list78))) {
            return cycl_utilities.formula_arg2(property_sentence, (SubLObject)properties.UNPROVIDED);
        }
        return el_utilities.make_binary_formula(properties.$const79$TheSetOf, var, property_sentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 18376L)
    public static SubLObject sentences_to_properties(final SubLObject sentences, final SubLObject v_term) {
        SubLObject v_properties = (SubLObject)properties.NIL;
        SubLObject cdolist_list_var = sentences;
        SubLObject sentence = (SubLObject)properties.NIL;
        sentence = cdolist_list_var.first();
        while (properties.NIL != cdolist_list_var) {
            v_properties = (SubLObject)ConsesLow.cons(sentence_to_property(sentence, v_term), v_properties);
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        }
        return Sequences.nreverse(v_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 18590L)
    public static SubLObject sentence_to_property(final SubLObject sentence, final SubLObject v_term) {
        return cycl_utilities.expression_subst((SubLObject)properties.$kw14$TERM, v_term, sentence, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 18691L)
    public static SubLObject property_extent(final SubLObject property, final SubLObject mt, SubLObject query_properties) {
        if (query_properties == properties.UNPROVIDED) {
            query_properties = (SubLObject)properties.NIL;
        }
        final SubLObject var = czer_utilities.unique_el_var_wrt_expression(property, (SubLObject)properties.$sym77$_VAR);
        final SubLObject sentence = property_to_sentence(property, var);
        return ask_utilities.query_variable(var, sentence, mt, query_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 19070L)
    public static SubLObject property_cardinality(final SubLObject property, final SubLObject mt, SubLObject query_properties) {
        if (query_properties == properties.UNPROVIDED) {
            query_properties = (SubLObject)properties.NIL;
        }
        final SubLObject v_set = property_to_set_or_collection(property);
        final SubLObject cardinality_var = czer_utilities.unique_el_var_wrt_expression(v_set, (SubLObject)properties.$sym80$_CARDINALITY);
        final SubLObject sentence = el_utilities.make_binary_formula(properties.$const81$extentCardinality, v_set, cardinality_var);
        final SubLObject q_properties = conses_high.putf(query_properties, (SubLObject)properties.$kw82$RETURN, (SubLObject)ConsesLow.list((SubLObject)properties.$kw83$TEMPLATE, cardinality_var));
        final SubLObject answers = inference_kernel.new_cyc_query(sentence, mt, q_properties);
        return (SubLObject)((properties.NIL != answers) ? answers.first() : properties.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 19647L)
    public static SubLObject term_has_propertyP(final SubLObject v_term, final SubLObject property, final SubLObject mt, SubLObject query_properties) {
        if (query_properties == properties.UNPROVIDED) {
            query_properties = (SubLObject)properties.NIL;
        }
        final SubLObject property_sentence = property_to_sentence(property, v_term);
        final SubLObject query_result = inference_kernel.new_cyc_query(property_sentence, mt, query_properties);
        return cyc_kernel.closed_query_success_result_p(query_result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 19928L)
    public static SubLObject asserted_gaf_properties_of_term_denot(final SubLObject v_term, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_properties = set.new_set(Symbols.symbol_function((SubLObject)properties.EQUAL), (SubLObject)properties.UNPROVIDED);
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject pred_var = (SubLObject)properties.NIL;
            if (properties.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)properties.NIL, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)properties.NIL, pred_var);
                SubLObject done_var = (SubLObject)properties.NIL;
                final SubLObject token_var = (SubLObject)properties.NIL;
                while (properties.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (properties.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)properties.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)properties.$kw84$GAF, (SubLObject)properties.$kw85$TRUE, (SubLObject)properties.NIL);
                            SubLObject done_var_$35 = (SubLObject)properties.NIL;
                            final SubLObject token_var_$36 = (SubLObject)properties.NIL;
                            while (properties.NIL == done_var_$35) {
                                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$36);
                                final SubLObject valid_$37 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$36.eql(gaf));
                                if (properties.NIL != valid_$37 && properties.NIL == term_quoted_in_gafP(gaf, v_term, mt)) {
                                    final SubLObject property = sentence_to_property(assertions_high.gaf_formula(gaf), v_term);
                                    set.set_add(property, v_properties);
                                }
                                done_var_$35 = (SubLObject)SubLObjectFactory.makeBoolean(properties.NIL == valid_$37);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$38 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)properties.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (properties.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$38, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(properties.NIL == valid);
                }
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return v_properties;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 20386L)
    public static SubLObject term_quoted_in_gafP(final SubLObject gaf, final SubLObject v_term, final SubLObject domain_mt) {
        final SubLObject pred = assertions_high.gaf_arg0(gaf);
        final SubLObject term_argnums = cycl_utilities.formula_arg_positions(gaf, v_term, (SubLObject)properties.UNPROVIDED);
        SubLObject quotedP = (SubLObject)properties.NIL;
        if (properties.NIL == quotedP) {
            SubLObject csome_list_var = term_argnums;
            SubLObject term_argnum = (SubLObject)properties.NIL;
            term_argnum = csome_list_var.first();
            while (properties.NIL == quotedP && properties.NIL != csome_list_var) {
                if (properties.NIL != kb_accessors.quoted_argumentP(pred, term_argnum)) {
                    quotedP = (SubLObject)properties.T;
                }
                csome_list_var = csome_list_var.rest();
                term_argnum = csome_list_var.first();
            }
        }
        return quotedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 20792L)
    public static SubLObject find_or_create_property_types_problem_store() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject reusedP = (SubLObject)properties.NIL;
        if (properties.NIL != inference_datastructures_problem_store.valid_problem_store_p(properties.$property_types_problem_store$.getDynamicValue(thread))) {
            if (properties.NIL != property_types_problem_store_size_okP()) {
                reusedP = (SubLObject)properties.T;
            }
            else {
                inference_datastructures_problem_store.destroy_problem_store(properties.$property_types_problem_store$.getDynamicValue(thread));
                properties.$property_types_problem_store$.setDynamicValue(inference_datastructures_problem_store.new_problem_store((SubLObject)properties.UNPROVIDED), thread);
            }
            return Values.values(properties.$property_types_problem_store$.getDynamicValue(thread), reusedP);
        }
        return Values.values(inference_datastructures_problem_store.new_problem_store((SubLObject)properties.UNPROVIDED), reusedP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 21265L)
    public static SubLObject property_types_problem_store_size_okP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Numbers.numL(inference_datastructures_problem_store.problem_store_size(properties.$property_types_problem_store$.getDynamicValue(thread)), (SubLObject)properties.$int86$100000);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 21395L)
    public static SubLObject with_property_types_problem_store_reuse(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        final SubLObject reusedP = (SubLObject)properties.$sym87$REUSED_;
        return (SubLObject)ConsesLow.list((SubLObject)properties.$sym88$CMULTIPLE_VALUE_BIND, (SubLObject)ConsesLow.list((SubLObject)properties.$sym89$_PROPERTY_TYPES_PROBLEM_STORE_, reusedP), (SubLObject)properties.$list90, (SubLObject)ConsesLow.list((SubLObject)properties.$sym91$CUNWIND_PROTECT, reader.bq_cons((SubLObject)properties.$sym92$PROGN, ConsesLow.append(body, (SubLObject)properties.NIL)), (SubLObject)ConsesLow.listS((SubLObject)properties.$sym93$PUNLESS, reusedP, (SubLObject)properties.$list94)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 21749L)
    public static SubLObject property_typeP(final SubLObject v_object) {
        return isa.isa_in_any_mtP(v_object, properties.$const95$TypicalityReferenceSetPropertyTyp);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 21860L)
    public static SubLObject property_types(final SubLObject property, final SubLObject mt) {
        final SubLObject var = (SubLObject)properties.$sym96$_PROPERTY_TYPE;
        SubLObject types = (SubLObject)properties.NIL;
        SubLObject cdolist_list_var = property_basic_properties(property);
        SubLObject query_property = (SubLObject)properties.NIL;
        query_property = cdolist_list_var.first();
        while (properties.NIL != cdolist_list_var) {
            final SubLObject query_sentence = property_type_query_sentence(query_property, var);
            final SubLObject v_properties = (SubLObject)ConsesLow.list(new SubLObject[] { properties.$kw82$RETURN, ConsesLow.list((SubLObject)properties.$kw83$TEMPLATE, var), properties.$kw97$MAX_TRANSFORMATION_DEPTH, properties.THREE_INTEGER, properties.$kw98$MAX_NUMBER, properties.ONE_INTEGER, properties.$kw99$MAX_TIME, properties.$int100$60, properties.$kw101$PROBLEM_STORE, find_or_create_property_types_problem_store() });
            SubLObject cdolist_list_var_$39;
            final SubLObject this_types = cdolist_list_var_$39 = inference_kernel.new_cyc_query(query_sentence, mt, v_properties);
            SubLObject this_type = (SubLObject)properties.NIL;
            this_type = cdolist_list_var_$39.first();
            while (properties.NIL != cdolist_list_var_$39) {
                final SubLObject item_var = this_type;
                if (properties.NIL == conses_high.member(item_var, types, Symbols.symbol_function((SubLObject)properties.EQUAL), Symbols.symbol_function((SubLObject)properties.IDENTITY))) {
                    types = (SubLObject)ConsesLow.cons(item_var, types);
                }
                cdolist_list_var_$39 = cdolist_list_var_$39.rest();
                this_type = cdolist_list_var_$39.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_property = cdolist_list_var.first();
        }
        return types;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 22521L)
    public static SubLObject property_type_string(final SubLObject property_type) {
        final SubLObject strings = ask_utilities.ask_variable((SubLObject)properties.$sym102$_STRING, (SubLObject)ConsesLow.listS(properties.$const103$termStrings, property_type, (SubLObject)properties.$list104), properties.$const105$EnglishMt, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
        if (properties.NIL != strings) {
            return strings.first();
        }
        return pph_main.generate_phrase(property_type, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 22860L)
    public static SubLObject property_type_query_sentence(final SubLObject property, final SubLObject var) {
        SubLObject query_sentence = (SubLObject)ConsesLow.list(properties.$const106$typicalityReferenceSetPropertyTyp, property, var);
        SubLObject cdolist_list_var;
        final SubLObject unbound_vars = cdolist_list_var = obsolete.formula_free_variables(property, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
        SubLObject unbound_var = (SubLObject)properties.NIL;
        unbound_var = cdolist_list_var.first();
        while (properties.NIL != cdolist_list_var) {
            query_sentence = el_utilities.make_existential(unbound_var, query_sentence);
            cdolist_list_var = cdolist_list_var.rest();
            unbound_var = cdolist_list_var.first();
        }
        return query_sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 23198L)
    public static SubLObject property_basic_properties(final SubLObject property) {
        if (properties.NIL != unknown_property_p(property)) {
            return property_basic_properties(unmake_unknown_property(property));
        }
        if (properties.NIL != el_utilities.el_existential_p(property)) {
            return property_basic_properties(cycl_utilities.formula_arg2(property, (SubLObject)properties.UNPROVIDED));
        }
        if (properties.NIL != el_utilities.el_conjunction_p(property)) {
            SubLObject basic_properties = (SubLObject)properties.NIL;
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(property, (SubLObject)properties.$kw39$IGNORE);
            SubLObject conjunct = (SubLObject)properties.NIL;
            conjunct = cdolist_list_var.first();
            while (properties.NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$40 = property_basic_properties(conjunct);
                SubLObject basic_property = (SubLObject)properties.NIL;
                basic_property = cdolist_list_var_$40.first();
                while (properties.NIL != cdolist_list_var_$40) {
                    if (properties.NIL != cycl_utilities.expression_find((SubLObject)properties.$kw14$TERM, basic_property, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED)) {
                        basic_properties = (SubLObject)ConsesLow.cons(basic_property, basic_properties);
                    }
                    cdolist_list_var_$40 = cdolist_list_var_$40.rest();
                    basic_property = cdolist_list_var_$40.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                conjunct = cdolist_list_var.first();
            }
            return basic_properties;
        }
        if (properties.NIL != cycl_utilities.expression_find((SubLObject)properties.$kw14$TERM, property, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED)) {
            return (SubLObject)ConsesLow.list(property);
        }
        return (SubLObject)properties.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 23848L)
    public static SubLObject property_type_p_old(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, properties.$property_types$.getGlobalValue(), (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 23848L)
    public static SubLObject property_types_old(final SubLObject property) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)properties.NIL;
        if (properties.NIL != unknown_property_p(property)) {
            return property_types_old(cycl_utilities.formula_arg1(property, (SubLObject)properties.UNPROVIDED));
        }
        if (properties.NIL != el_utilities.el_existential_p(property)) {
            ans = existential_property_types(property);
        }
        else if (properties.NIL != existential_rmp_p(cycl_utilities.formula_arg0(property))) {
            ans = rmp_existential_property_types(property);
        }
        else if (properties.NIL != el_utilities.el_conjunction_p(property)) {
            ans = conjunctive_property_types(property);
        }
        else if (properties.NIL != simple_binary_property_p(property)) {
            ans = simple_binary_property_types(property);
        }
        else if (properties.NIL != el_utilities.el_ternary_formula_p(property)) {
            ans = ternary_property_types(property);
        }
        else if (properties.NIL != formula_pattern_match.formula_matches_pattern(property, (SubLObject)properties.$list108)) {
            ans = (SubLObject)ConsesLow.list((SubLObject)properties.$kw109$SUPER_EVENT);
        }
        else if (properties.NIL != formula_pattern_match.formula_matches_pattern(property, (SubLObject)properties.$list110)) {
            ans = (SubLObject)ConsesLow.list((SubLObject)properties.$kw111$CONTACT);
        }
        else if (properties.NIL != cycl_utilities.expression_find_if((SubLObject)properties.$sym43$DATE_P, property, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED)) {
            ans = (SubLObject)ConsesLow.list((SubLObject)properties.$kw112$DATE);
        }
        if (properties.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && properties.NIL != ans && properties.NIL == list_utilities.list_of_type_p((SubLObject)properties.$sym113$PROPERTY_TYPE_P_OLD, ans)) {
            Errors.error((SubLObject)properties.$str114$_S_is_not_a_list_of_property_type, ans);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 23848L)
    public static SubLObject existential_rmp_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, properties.$existential_rmps$.getGlobalValue(), (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 23848L)
    public static SubLObject simple_binary_property_p(final SubLObject property) {
        return formula_pattern_match.formula_matches_pattern(property, (SubLObject)properties.$list116);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 23848L)
    public static SubLObject clear_simple_binary_property_patterns() {
        final SubLObject cs = properties.$simple_binary_property_patterns_caching_state$.getGlobalValue();
        if (properties.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)properties.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 23848L)
    public static SubLObject remove_simple_binary_property_patterns() {
        return memoization_state.caching_state_remove_function_results_with_args(properties.$simple_binary_property_patterns_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(properties.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 23848L)
    public static SubLObject simple_binary_property_patterns_internal() {
        SubLObject patterns = properties.$other_simple_binary_property_patterns$.getGlobalValue();
        SubLObject cdolist_list_var = properties.$simple_binary_property_type_preds$.getGlobalValue();
        SubLObject cons = (SubLObject)properties.NIL;
        cons = cdolist_list_var.first();
        while (properties.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject pred = (SubLObject)properties.NIL;
            SubLObject property_type = (SubLObject)properties.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)properties.$list120);
            pred = current.first();
            current = (property_type = current.rest());
            patterns = list_utilities.alist_enter(patterns, reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)properties.$kw121$GENL_PRED, pred), (SubLObject)properties.$list122), property_type, (SubLObject)properties.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        return patterns;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 23848L)
    public static SubLObject simple_binary_property_patterns() {
        SubLObject caching_state = properties.$simple_binary_property_patterns_caching_state$.getGlobalValue();
        if (properties.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)properties.$sym119$SIMPLE_BINARY_PROPERTY_PATTERNS, (SubLObject)properties.$sym123$_SIMPLE_BINARY_PROPERTY_PATTERNS_CACHING_STATE_, (SubLObject)properties.NIL, (SubLObject)properties.EQL, (SubLObject)properties.ZERO_INTEGER, (SubLObject)properties.ONE_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)properties.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(simple_binary_property_patterns_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)properties.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 23848L)
    public static SubLObject simple_binary_property_types(final SubLObject property) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)properties.NIL;
        assert properties.NIL != simple_binary_property_p(property) : property;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(properties.$const125$InferencePSC);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject cdolist_list_var = simple_binary_property_patterns();
            SubLObject cons = (SubLObject)properties.NIL;
            cons = cdolist_list_var.first();
            while (properties.NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = cons;
                SubLObject pattern = (SubLObject)properties.NIL;
                SubLObject property_type = (SubLObject)properties.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)properties.$list126);
                pattern = current.first();
                current = (property_type = current.rest());
                if (properties.NIL != formula_pattern_match.formula_matches_pattern(property, pattern)) {
                    ans = (SubLObject)ConsesLow.cons(property_type, ans);
                }
                cdolist_list_var = cdolist_list_var.rest();
                cons = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return Sequences.delete_duplicates(ans, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 23848L)
    public static SubLObject ternary_property_types(final SubLObject property) {
        SubLObject ans = (SubLObject)properties.NIL;
        SubLObject cdolist_list_var = properties.$ternary_property_patterns$.getGlobalValue();
        SubLObject cons = (SubLObject)properties.NIL;
        cons = cdolist_list_var.first();
        while (properties.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject pattern = (SubLObject)properties.NIL;
            SubLObject property_type = (SubLObject)properties.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)properties.$list126);
            pattern = current.first();
            current = (property_type = current.rest());
            if (properties.NIL != formula_pattern_match.formula_matches_pattern(property, pattern)) {
                ans = (SubLObject)ConsesLow.cons(property_type, ans);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 23848L)
    public static SubLObject rmp_existential_property_types(final SubLObject property) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pattern = (SubLObject)properties.$list128;
        thread.resetMultipleValues();
        final SubLObject success = formula_pattern_match.formula_matches_pattern(property, pattern);
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (properties.NIL != success) {
            final SubLObject type = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)properties.$sym129$TYPE, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
            final SubLObject v_term = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)properties.$sym130$TERM, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
            final SubLObject pred = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)properties.$sym13$PRED, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
            return property_types_old((SubLObject)ConsesLow.list(pred, v_term, (SubLObject)ConsesLow.list(properties.$const131$SomeFn, type)));
        }
        return (SubLObject)properties.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 23848L)
    public static SubLObject existential_property_types(final SubLObject property) {
        assert properties.NIL != el_utilities.el_existential_p(property) : property;
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_args(property, (SubLObject)properties.UNPROVIDED);
        SubLObject var = (SubLObject)properties.NIL;
        SubLObject v_core = (SubLObject)properties.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)properties.$list132);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)properties.$list132);
        v_core = current.first();
        current = current.rest();
        if (properties.NIL == current) {
            final SubLObject reformulated = cycl_utilities.expression_subst((SubLObject)properties.$list133, var, v_core, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
            return property_types_old(reformulated);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)properties.$list132);
        return (SubLObject)properties.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 23848L)
    public static SubLObject conjunctive_property_types(final SubLObject property) {
        assert properties.NIL != el_utilities.el_conjunction_p(property) : property;
        SubLObject types = (SubLObject)properties.NIL;
        SubLObject cdolist_list_var = cycl_utilities.formula_args(property, (SubLObject)properties.UNPROVIDED);
        SubLObject conjunct = (SubLObject)properties.NIL;
        conjunct = cdolist_list_var.first();
        while (properties.NIL != cdolist_list_var) {
            if (properties.NIL != collection_defns.cyc_typicality_reference_set_propertyP(conjunct)) {
                types = ConsesLow.append(property_types_old(conjunct), types);
            }
            cdolist_list_var = cdolist_list_var.rest();
            conjunct = cdolist_list_var.first();
        }
        return types;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 23848L)
    public static SubLObject possible_attack_typeP(final SubLObject arg2) {
        if (properties.NIL != formula_pattern_match.formula_matches_pattern(arg2, (SubLObject)properties.$list135)) {
            return (SubLObject)properties.T;
        }
        if (properties.NIL == term.el_fort_p(arg2)) {
            return (SubLObject)properties.NIL;
        }
        if (properties.NIL != attempted_possible_attack_typeP(arg2) || properties.NIL != isa.isaP(arg2, properties.$const136$AttackType, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED) || properties.NIL != genls.genlP(arg2, properties.$const137$AttackOnObject, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED) || properties.NIL != genls.genlP(arg2, properties.$const138$HostileSocialAction, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED) || properties.NIL != genls.genlP(arg2, properties.$const139$KillingByOrganism, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED) || properties.NIL != genls.genlP(arg2, properties.$const140$CapturingSomething, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED) || properties.NIL != genls.genlP(arg2, properties.$const141$IncurringDamage, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED) || properties.NIL != genls.genlP(arg2, properties.$const142$ManMadeDisaster, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED) || properties.NIL != genls.genlP(arg2, properties.$const143$ObstructionEvent, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED) || properties.NIL != genls.genlP(arg2, properties.$const144$MilitaryEvent, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED) || properties.NIL != genls.genlP(arg2, properties.$const145$ExposureToSubstance, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED) || properties.NIL != genls.genlP(arg2, properties.$const146$ActsCommonlyConsideredCriminal, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED) || properties.NIL != genls.genlP(arg2, properties.$const147$ShootingAProjectileWeapon, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED)) {
            return (SubLObject)properties.T;
        }
        return (SubLObject)properties.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 23848L)
    public static SubLObject attempted_possible_attack_typeP(final SubLObject arg2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)properties.NIL;
        if (properties.NIL != collection_defns.cycl_non_atomic_termP(arg2)) {
            thread.resetMultipleValues();
            final SubLObject success = formula_pattern_match.formula_matches_pattern(narts_high.nart_el_formula(arg2), (SubLObject)properties.$list148);
            final SubLObject v_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (properties.NIL != success) {
                final SubLObject act_type = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)properties.$sym149$ACT_TYPE, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
                ans = possible_attack_typeP(act_type);
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 31355L)
    public static SubLObject bad_fan_out_property_p(final SubLObject property, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = cycl_utilities.formula_arg0(property);
        final SubLObject term_positions = cycl_utilities.arg_positions_bfs((SubLObject)properties.$kw14$TERM, property, (SubLObject)properties.UNPROVIDED);
        SubLObject badP = (SubLObject)properties.NIL;
        if (properties.NIL == badP) {
            final SubLObject node_var = pred;
            final SubLObject deck_type = (SubLObject)((properties.$kw19$BREADTH == properties.$kw20$DEPTH) ? properties.$kw21$STACK : properties.$kw22$QUEUE);
            final SubLObject recur_deck = deck.create_deck(deck_type);
            SubLObject node_and_predicate_mode = (SubLObject)properties.NIL;
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject _prev_bind_0_$41 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
                        final SubLObject tv_var = properties.$const150$True_JustificationTruth;
                        final SubLObject _prev_bind_0_$42 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$43 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind((properties.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((properties.NIL != tv_var) ? properties.$sym23$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                            if (properties.NIL != tv_var && properties.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && properties.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql((SubLObject)properties.$kw24$ERROR)) {
                                    sbhl_paranoia.sbhl_error((SubLObject)properties.ONE_INTEGER, (SubLObject)properties.$str25$_A_is_not_a__A, tv_var, (SubLObject)properties.$sym26$SBHL_TRUE_TV_P, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)properties.$kw27$CERROR)) {
                                    sbhl_paranoia.sbhl_cerror((SubLObject)properties.ONE_INTEGER, (SubLObject)properties.$str28$continue_anyway, (SubLObject)properties.$str25$_A_is_not_a__A, tv_var, (SubLObject)properties.$sym26$SBHL_TRUE_TV_P, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)properties.$kw29$WARN)) {
                                    Errors.warn((SubLObject)properties.$str25$_A_is_not_a__A, tv_var, (SubLObject)properties.$sym26$SBHL_TRUE_TV_P);
                                }
                                else {
                                    Errors.warn((SubLObject)properties.$str30$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror((SubLObject)properties.$str28$continue_anyway, (SubLObject)properties.$str25$_A_is_not_a__A, tv_var, (SubLObject)properties.$sym26$SBHL_TRUE_TV_P);
                                }
                            }
                            final SubLObject _prev_bind_0_$43 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$44 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$46 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(properties.$const31$genlPreds), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(properties.$const31$genlPreds)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(properties.$const31$genlPreds)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)properties.NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(properties.$const31$genlPreds), thread);
                                if (properties.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || properties.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module((SubLObject)properties.UNPROVIDED))) {
                                    final SubLObject _prev_bind_0_$44 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$45 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$47 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(properties.$const31$genlPreds)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)properties.NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)properties.UNPROVIDED);
                                        for (node_and_predicate_mode = (SubLObject)ConsesLow.list(pred, sbhl_search_vars.genl_inverse_mode_p()); properties.NIL != node_and_predicate_mode && properties.NIL == badP; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                            final SubLObject node_var_$50 = node_and_predicate_mode.first();
                                            final SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                            final SubLObject genl_pred = node_var_$50;
                                            final SubLObject _prev_bind_0_$45 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                if (properties.NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$50)) {
                                                    final SubLObject fan_out_arg = kb_accessors.asserted_fan_out_arg(genl_pred, mt);
                                                    if (fan_out_arg.isInteger() && properties.NIL == subl_promotions.memberP((SubLObject)ConsesLow.list(fan_out_arg), term_positions, Symbols.symbol_function((SubLObject)properties.EQUAL), (SubLObject)properties.UNPROVIDED)) {
                                                        badP = (SubLObject)properties.T;
                                                    }
                                                    if (properties.NIL == badP) {
                                                        SubLObject csome_list_var = kb_mapping_utilities.pred_values_in_mt(genl_pred, properties.$const151$functionalInArgs, mt, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
                                                        SubLObject functional_arg = (SubLObject)properties.NIL;
                                                        functional_arg = csome_list_var.first();
                                                        while (properties.NIL == badP && properties.NIL != csome_list_var) {
                                                            if (properties.NIL != subl_promotions.memberP((SubLObject)ConsesLow.list(functional_arg), term_positions, Symbols.symbol_function((SubLObject)properties.EQUAL), (SubLObject)properties.UNPROVIDED)) {
                                                                badP = (SubLObject)properties.T;
                                                            }
                                                            csome_list_var = csome_list_var.rest();
                                                            functional_arg = csome_list_var.first();
                                                        }
                                                    }
                                                }
                                                final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(properties.$const31$genlPreds));
                                                SubLObject rest;
                                                SubLObject module_var;
                                                SubLObject _prev_bind_0_$46;
                                                SubLObject _prev_bind_1_$46;
                                                SubLObject node;
                                                SubLObject d_link;
                                                SubLObject mt_links;
                                                SubLObject iteration_state;
                                                SubLObject mt_$54;
                                                SubLObject tv_links;
                                                SubLObject _prev_bind_0_$47;
                                                SubLObject iteration_state_$56;
                                                SubLObject tv;
                                                SubLObject link_nodes;
                                                SubLObject _prev_bind_0_$48;
                                                SubLObject sol;
                                                SubLObject set_contents_var;
                                                SubLObject basis_object;
                                                SubLObject state;
                                                SubLObject node_vars_link_node;
                                                SubLObject csome_list_var2;
                                                SubLObject node_vars_link_node2;
                                                SubLObject new_list;
                                                SubLObject rest_$58;
                                                SubLObject generating_fn;
                                                SubLObject _prev_bind_0_$49;
                                                SubLObject sol2;
                                                SubLObject link_nodes2;
                                                SubLObject set_contents_var2;
                                                SubLObject basis_object2;
                                                SubLObject state2;
                                                SubLObject node_vars_link_node3;
                                                SubLObject csome_list_var3;
                                                SubLObject node_vars_link_node4;
                                                for (rest = (SubLObject)properties.NIL, rest = accessible_modules; properties.NIL == badP && properties.NIL != rest; rest = rest.rest()) {
                                                    module_var = rest.first();
                                                    _prev_bind_0_$46 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    _prev_bind_1_$46 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((properties.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(properties.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                        node = function_terms.naut_to_nart(node_var_$50);
                                                        if (properties.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)properties.UNPROVIDED));
                                                            if (properties.NIL != d_link) {
                                                                mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)properties.UNPROVIDED));
                                                                if (properties.NIL != mt_links) {
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); properties.NIL == badP && properties.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        mt_$54 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (properties.NIL != mt_relevance_macros.relevant_mtP(mt_$54)) {
                                                                            _prev_bind_0_$47 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt_$54, thread);
                                                                                for (iteration_state_$56 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); properties.NIL == badP && properties.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$56); iteration_state_$56 = dictionary_contents.do_dictionary_contents_next(iteration_state_$56)) {
                                                                                    thread.resetMultipleValues();
                                                                                    tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$56);
                                                                                    link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (properties.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        _prev_bind_0_$48 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            sol = link_nodes;
                                                                                            if (properties.NIL != set.set_p(sol)) {
                                                                                                set_contents_var = set.do_set_internal(sol);
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)properties.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); properties.NIL == badP && properties.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if (properties.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && properties.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)properties.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)properties.UNPROVIDED);
                                                                                                        deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol.isList()) {
                                                                                                if (properties.NIL == badP) {
                                                                                                    csome_list_var2 = sol;
                                                                                                    node_vars_link_node2 = (SubLObject)properties.NIL;
                                                                                                    node_vars_link_node2 = csome_list_var2.first();
                                                                                                    while (properties.NIL == badP && properties.NIL != csome_list_var2) {
                                                                                                        if (properties.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)properties.UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)properties.UNPROVIDED);
                                                                                                            deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                        }
                                                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                                                        node_vars_link_node2 = csome_list_var2.first();
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)properties.$str32$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$48, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$56);
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$47, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            }
                                                            else {
                                                                sbhl_paranoia.sbhl_error((SubLObject)properties.FIVE_INTEGER, (SubLObject)properties.$str33$attempting_to_bind_direction_link, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
                                                            }
                                                        }
                                                        else if (properties.NIL != obsolete.cnat_p(node, (SubLObject)properties.UNPROVIDED)) {
                                                            new_list = ((properties.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)properties.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)properties.UNPROVIDED)));
                                                            for (rest_$58 = (SubLObject)properties.NIL, rest_$58 = new_list; properties.NIL == badP && properties.NIL != rest_$58; rest_$58 = rest_$58.rest()) {
                                                                generating_fn = rest_$58.first();
                                                                _prev_bind_0_$49 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    link_nodes2 = (sol2 = Functions.funcall(generating_fn, node));
                                                                    if (properties.NIL != set.set_p(sol2)) {
                                                                        set_contents_var2 = set.do_set_internal(sol2);
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)properties.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); properties.NIL == badP && properties.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if (properties.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && properties.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)properties.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)properties.UNPROVIDED);
                                                                                deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (sol2.isList()) {
                                                                        if (properties.NIL == badP) {
                                                                            csome_list_var3 = sol2;
                                                                            node_vars_link_node4 = (SubLObject)properties.NIL;
                                                                            node_vars_link_node4 = csome_list_var3.first();
                                                                            while (properties.NIL == badP && properties.NIL != csome_list_var3) {
                                                                                if (properties.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)properties.UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)properties.UNPROVIDED);
                                                                                    deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                }
                                                                                csome_list_var3 = csome_list_var3.rest();
                                                                                node_vars_link_node4 = csome_list_var3.first();
                                                                            }
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)properties.$str32$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$49, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$46, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$46, thread);
                                                    }
                                                }
                                            }
                                            finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$45, thread);
                                            }
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$47, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$45, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$44, thread);
                                    }
                                }
                                else {
                                    sbhl_paranoia.sbhl_warn((SubLObject)properties.TWO_INTEGER, (SubLObject)properties.$str34$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)properties.UNPROVIDED)), (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED, (SubLObject)properties.UNPROVIDED);
                                }
                            }
                            finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$46, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$44, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$43, thread);
                            }
                        }
                        finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$43, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$42, thread);
                        }
                    }
                    finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_$41, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$50 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)properties.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$50, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
            }
        }
        return badP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 32108L)
    public static SubLObject make_unknown_property(final SubLObject property) {
        return el_utilities.make_unary_formula(properties.$const152$unknownSentence, property);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 32217L)
    public static SubLObject unmake_unknown_property(final SubLObject property) {
        return cycl_utilities.formula_arg1(property, (SubLObject)properties.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/properties.lisp", position = 32304L)
    public static SubLObject unknown_property_p(final SubLObject property) {
        return formula_pattern_match.formula_matches_pattern(property, (SubLObject)properties.$list153);
    }
    
    public static SubLObject declare_properties_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.properties", "genl_propertyP", "GENL-PROPERTY?", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.properties", "more_general_properties", "MORE-GENERAL-PROPERTIES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.properties", "add_existential_more_general_properties", "ADD-EXISTENTIAL-MORE-GENERAL-PROPERTIES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.properties", "add_other_more_general_properties", "ADD-OTHER-MORE-GENERAL-PROPERTIES", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.properties", "add_instance_named_fn_properties", "ADD-INSTANCE-NAMED-FN-PROPERTIES", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.properties", "add_genl_preds_properties", "ADD-GENL-PREDS-PROPERTIES", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.properties", "add_genls_properties", "ADD-GENLS-PROPERTIES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.properties", "add_less_constrained_existential_properties", "ADD-LESS-CONSTRAINED-EXISTENTIAL-PROPERTIES", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.properties", "note_more_specific_property", "NOTE-MORE-SPECIFIC-PROPERTY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.properties", "instance_named_fn_nat_p", "INSTANCE-NAMED-FN-NAT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.properties", "number_comparison_clauses", "NUMBER-COMPARISON-CLAUSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.properties", "subsuming_dates", "SUBSUMING-DATES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.properties", "bigger_places", "BIGGER-PLACES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.properties", "place_too_bigP", "PLACE-TOO-BIG?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.properties", "clear_too_big_places", "CLEAR-TOO-BIG-PLACES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.properties", "remove_too_big_places", "REMOVE-TOO-BIG-PLACES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.properties", "too_big_places_internal", "TOO-BIG-PLACES-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.properties", "too_big_places", "TOO-BIG-PLACES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.properties", "place_types", "PLACE-TYPES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.properties", "reformulate_property_for_paraphrase", "REFORMULATE-PROPERTY-FOR-PARAPHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.properties", "properties_to_sentences", "PROPERTIES-TO-SENTENCES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.properties", "property_to_sentence", "PROPERTY-TO-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.properties", "property_to_set_or_collection", "PROPERTY-TO-SET-OR-COLLECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.properties", "sentences_to_properties", "SENTENCES-TO-PROPERTIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.properties", "sentence_to_property", "SENTENCE-TO-PROPERTY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.properties", "property_extent", "PROPERTY-EXTENT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.properties", "property_cardinality", "PROPERTY-CARDINALITY", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.properties", "term_has_propertyP", "TERM-HAS-PROPERTY?", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.properties", "asserted_gaf_properties_of_term_denot", "ASSERTED-GAF-PROPERTIES-OF-TERM-DENOT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.properties", "term_quoted_in_gafP", "TERM-QUOTED-IN-GAF?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.properties", "find_or_create_property_types_problem_store", "FIND-OR-CREATE-PROPERTY-TYPES-PROBLEM-STORE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.properties", "property_types_problem_store_size_okP", "PROPERTY-TYPES-PROBLEM-STORE-SIZE-OK?", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.properties", "with_property_types_problem_store_reuse", "WITH-PROPERTY-TYPES-PROBLEM-STORE-REUSE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.properties", "property_typeP", "PROPERTY-TYPE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.properties", "property_types", "PROPERTY-TYPES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.properties", "property_type_string", "PROPERTY-TYPE-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.properties", "property_type_query_sentence", "PROPERTY-TYPE-QUERY-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.properties", "property_basic_properties", "PROPERTY-BASIC-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.properties", "property_type_p_old", "PROPERTY-TYPE-P-OLD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.properties", "property_types_old", "PROPERTY-TYPES-OLD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.properties", "existential_rmp_p", "EXISTENTIAL-RMP-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.properties", "simple_binary_property_p", "SIMPLE-BINARY-PROPERTY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.properties", "clear_simple_binary_property_patterns", "CLEAR-SIMPLE-BINARY-PROPERTY-PATTERNS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.properties", "remove_simple_binary_property_patterns", "REMOVE-SIMPLE-BINARY-PROPERTY-PATTERNS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.properties", "simple_binary_property_patterns_internal", "SIMPLE-BINARY-PROPERTY-PATTERNS-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.properties", "simple_binary_property_patterns", "SIMPLE-BINARY-PROPERTY-PATTERNS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.properties", "simple_binary_property_types", "SIMPLE-BINARY-PROPERTY-TYPES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.properties", "ternary_property_types", "TERNARY-PROPERTY-TYPES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.properties", "rmp_existential_property_types", "RMP-EXISTENTIAL-PROPERTY-TYPES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.properties", "existential_property_types", "EXISTENTIAL-PROPERTY-TYPES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.properties", "conjunctive_property_types", "CONJUNCTIVE-PROPERTY-TYPES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.properties", "possible_attack_typeP", "POSSIBLE-ATTACK-TYPE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.properties", "attempted_possible_attack_typeP", "ATTEMPTED-POSSIBLE-ATTACK-TYPE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.properties", "bad_fan_out_property_p", "BAD-FAN-OUT-PROPERTY-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.properties", "make_unknown_property", "MAKE-UNKNOWN-PROPERTY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.properties", "unmake_unknown_property", "UNMAKE-UNKNOWN-PROPERTY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.properties", "unknown_property_p", "UNKNOWN-PROPERTY-P", 1, 0, false);
        return (SubLObject)properties.NIL;
    }
    
    public static SubLObject init_properties_file() {
        properties.$too_big_places_caching_state$ = SubLFiles.deflexical("*TOO-BIG-PLACES-CACHING-STATE*", (SubLObject)properties.NIL);
        properties.$property_types_problem_store$ = SubLFiles.defparameter("*PROPERTY-TYPES-PROBLEM-STORE*", (SubLObject)properties.NIL);
        properties.$property_types$ = SubLFiles.deflexical("*PROPERTY-TYPES*", (SubLObject)properties.$list107);
        properties.$existential_rmps$ = SubLFiles.deflexical("*EXISTENTIAL-RMPS*", (SubLObject)properties.$list115);
        properties.$simple_binary_property_type_preds$ = SubLFiles.deflexical("*SIMPLE-BINARY-PROPERTY-TYPE-PREDS*", (SubLObject)properties.$list117);
        properties.$other_simple_binary_property_patterns$ = SubLFiles.deflexical("*OTHER-SIMPLE-BINARY-PROPERTY-PATTERNS*", (SubLObject)properties.$list118);
        properties.$simple_binary_property_patterns_caching_state$ = SubLFiles.deflexical("*SIMPLE-BINARY-PROPERTY-PATTERNS-CACHING-STATE*", (SubLObject)properties.NIL);
        properties.$ternary_property_patterns$ = SubLFiles.deflexical("*TERNARY-PROPERTY-PATTERNS*", (SubLObject)properties.$list127);
        return (SubLObject)properties.NIL;
    }
    
    public static SubLObject setup_properties_file() {
        memoization_state.note_globally_cached_function((SubLObject)properties.$sym59$TOO_BIG_PLACES);
        memoization_state.note_globally_cached_function((SubLObject)properties.$sym119$SIMPLE_BINARY_PROPERTY_PATTERNS);
        return (SubLObject)properties.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_properties_file();
    }
    
    @Override
	public void initializeVariables() {
        init_properties_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_properties_file();
    }
    
    static {
        me = (SubLFile)new properties();
        properties.$too_big_places_caching_state$ = null;
        properties.$property_types_problem_store$ = null;
        properties.$property_types$ = null;
        properties.$existential_rmps$ = null;
        properties.$simple_binary_property_type_preds$ = null;
        properties.$other_simple_binary_property_patterns$ = null;
        properties.$simple_binary_property_patterns_caching_state$ = null;
        properties.$ternary_property_patterns$ = null;
        $kw0$CONDITIONAL_SENTENCE_ = SubLObjectFactory.makeKeyword("CONDITIONAL-SENTENCE?");
        $sym1$_TERM = SubLObjectFactory.makeSymbol("?TERM");
        $list2 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("injuryCount")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("deathToll")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("casualtyCount")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numberOfHostagesTaken")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationInstanceExistsCount")));
        $const3$relationInstanceExistsCount = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationInstanceExistsCount"));
        $const4$relationInstanceExists = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationInstanceExists"));
        $const5$dateOfEvent = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dateOfEvent"));
        $sym6$_VALUE = SubLObjectFactory.makeSymbol("?VALUE");
        $const7$temporallySubsumes = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes"));
        $const8$situationLocation = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("situationLocation"));
        $const9$geographicalSubRegions = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("geographicalSubRegions"));
        $const10$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $list11 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("PRED")), (SubLObject)SubLObjectFactory.makeKeyword("TERM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE")));
        $sym12$VALUE = SubLObjectFactory.makeSymbol("VALUE");
        $sym13$PRED = SubLObjectFactory.makeSymbol("PRED");
        $kw14$TERM = SubLObjectFactory.makeKeyword("TERM");
        $list15 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("PRED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE")), (SubLObject)SubLObjectFactory.makeKeyword("TERM"));
        $list16 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM"));
        $sym17$INSTANCE_NAMED_FN_NAT_P = SubLObjectFactory.makeSymbol("INSTANCE-NAMED-FN-NAT-P");
        $int18$150000 = SubLObjectFactory.makeInteger(150000);
        $kw19$BREADTH = SubLObjectFactory.makeKeyword("BREADTH");
        $kw20$DEPTH = SubLObjectFactory.makeKeyword("DEPTH");
        $kw21$STACK = SubLObjectFactory.makeKeyword("STACK");
        $kw22$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $sym23$RELEVANT_SBHL_TV_IS_GENERAL_TV = SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $kw24$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str25$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym26$SBHL_TRUE_TV_P = SubLObjectFactory.makeSymbol("SBHL-TRUE-TV-P");
        $kw27$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str28$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw29$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str30$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $const31$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $str32$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $str33$attempting_to_bind_direction_link = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $str34$Node__a_does_not_pass_sbhl_type_t = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $list35 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("TERM"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"));
        $const36$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $sym37$EL_EXISTENTIAL_P = SubLObjectFactory.makeSymbol("EL-EXISTENTIAL-P");
        $list38 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $kw39$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $const40$InstanceNamedFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InstanceNamedFn"));
        $sym41$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $const42$greaterThanOrEqualTo = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("greaterThanOrEqualTo"));
        $sym43$DATE_P = SubLObjectFactory.makeSymbol("DATE-P");
        $const44$CityNamedFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CityNamedFn"));
        $const45$TerritoryFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TerritoryFn"));
        $const46$City = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("City"));
        $sym47$_COUNTRY = SubLObjectFactory.makeSymbol("?COUNTRY");
        $const48$countryOfCity = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("countryOfCity"));
        $const49$GeographicalAgent = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeographicalAgent"));
        $const50$GeographicalRegion = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeographicalRegion"));
        $sym51$_TERRITORY = SubLObjectFactory.makeSymbol("?TERRITORY");
        $const52$territoryOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("territoryOf"));
        $list53 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?TERRITORY"));
        $sym54$_BIG = SubLObjectFactory.makeSymbol("?BIG");
        $sym55$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const56$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $sym57$PLACE_TOO_BIG_ = SubLObjectFactory.makeSymbol("PLACE-TOO-BIG?");
        $str58$Couldn_t_find_bigger_places_for__ = SubLObjectFactory.makeString("Couldn't find bigger places for ~S");
        $sym59$TOO_BIG_PLACES = SubLObjectFactory.makeSymbol("TOO-BIG-PLACES");
        $list60 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Planet")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeographicalHemisphere")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Continent")));
        $sym61$_TOO_BIG_PLACES_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*TOO-BIG-PLACES-CACHING-STATE*");
        $list62 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("BIN-PRED")), (SubLObject)SubLObjectFactory.makeKeyword("TERM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("EL-VAR?"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("TRANS-PRED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))));
        $sym63$TRANS_PRED = SubLObjectFactory.makeSymbol("TRANS-PRED");
        $sym64$BIN_PRED = SubLObjectFactory.makeSymbol("BIN-PRED");
        $list65 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("TRANS-PRED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("BIN-PRED")), (SubLObject)SubLObjectFactory.makeKeyword("TERM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("EL-VAR?")))));
        $list66 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("greaterThanOrEqualTo")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("EL-VAR?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationInstanceExistsCount")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("BIN-PRED")), (SubLObject)SubLObjectFactory.makeKeyword("TERM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTION")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))));
        $sym67$COLLECTION = SubLObjectFactory.makeSymbol("COLLECTION");
        $const68$IntervalMinFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntervalMinFn"));
        $list69 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("greaterThanOrEqualTo")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("EL-VAR?"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationInstanceExistsCount")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("BIN-PRED")), (SubLObject)SubLObjectFactory.makeKeyword("TERM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTION")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))));
        $const70$IntervalMaxFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntervalMaxFn"));
        $list71 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("greaterThanOrEqualTo")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("EL-VAR?"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("TERN-PRED")), (SubLObject)SubLObjectFactory.makeKeyword("TERM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTION")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))));
        $sym72$TERN_PRED = SubLObjectFactory.makeSymbol("TERN-PRED");
        $list73 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("TERN-PRED")), (SubLObject)SubLObjectFactory.makeKeyword("TERM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTION")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("greaterThanOrEqualTo")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("EL-VAR?")))));
        $list74 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("greaterThanOrEqualTo")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("EL-VAR?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("TERN-PRED")), (SubLObject)SubLObjectFactory.makeKeyword("TERM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTION")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))));
        $list75 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("TERN-PRED")), (SubLObject)SubLObjectFactory.makeKeyword("TERM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTION")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("greaterThanOrEqualTo")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("EL-VAR?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE")))));
        $list76 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationInstanceExistsCount")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("BIN-PRED")), (SubLObject)SubLObjectFactory.makeKeyword("TERM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTION")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("greaterThanOrEqualTo")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("EL-VAR?")))));
        $sym77$_VAR = SubLObjectFactory.makeSymbol("?VAR");
        $list78 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $const79$TheSetOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSetOf"));
        $sym80$_CARDINALITY = SubLObjectFactory.makeSymbol("?CARDINALITY");
        $const81$extentCardinality = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("extentCardinality"));
        $kw82$RETURN = SubLObjectFactory.makeKeyword("RETURN");
        $kw83$TEMPLATE = SubLObjectFactory.makeKeyword("TEMPLATE");
        $kw84$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw85$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $int86$100000 = SubLObjectFactory.makeInteger(100000);
        $sym87$REUSED_ = SubLObjectFactory.makeUninternedSymbol("REUSED?");
        $sym88$CMULTIPLE_VALUE_BIND = SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-BIND");
        $sym89$_PROPERTY_TYPES_PROBLEM_STORE_ = SubLObjectFactory.makeSymbol("*PROPERTY-TYPES-PROBLEM-STORE*");
        $list90 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIND-OR-CREATE-PROPERTY-TYPES-PROBLEM-STORE"));
        $sym91$CUNWIND_PROTECT = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $sym92$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym93$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $list94 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DESTROY-PROBLEM-STORE"), (SubLObject)SubLObjectFactory.makeSymbol("*PROPERTY-TYPES-PROBLEM-STORE*")));
        $const95$TypicalityReferenceSetPropertyTyp = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TypicalityReferenceSetPropertyType"));
        $sym96$_PROPERTY_TYPE = SubLObjectFactory.makeSymbol("?PROPERTY-TYPE");
        $kw97$MAX_TRANSFORMATION_DEPTH = SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $kw98$MAX_NUMBER = SubLObjectFactory.makeKeyword("MAX-NUMBER");
        $kw99$MAX_TIME = SubLObjectFactory.makeKeyword("MAX-TIME");
        $int100$60 = SubLObjectFactory.makeInteger(60);
        $kw101$PROBLEM_STORE = SubLObjectFactory.makeKeyword("PROBLEM-STORE");
        $sym102$_STRING = SubLObjectFactory.makeSymbol("?STRING");
        $const103$termStrings = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termStrings"));
        $list104 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?STRING"));
        $const105$EnglishMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishMt"));
        $const106$typicalityReferenceSetPropertyTyp = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("typicalityReferenceSetPropertyTypes"));
        $list107 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("DATE"), SubLObjectFactory.makeKeyword("LOCATION"), SubLObjectFactory.makeKeyword("PERPETRATOR"), SubLObjectFactory.makeKeyword("ATTACK-TYPE"), SubLObjectFactory.makeKeyword("TARGET"), SubLObjectFactory.makeKeyword("INHABITANTS"), SubLObjectFactory.makeKeyword("ECONOMY"), SubLObjectFactory.makeKeyword("RELIGION"), SubLObjectFactory.makeKeyword("CONTROL"), SubLObjectFactory.makeKeyword("CAPABILITIES"), SubLObjectFactory.makeKeyword("PERSONAL"), SubLObjectFactory.makeKeyword("CONTACT"), SubLObjectFactory.makeKeyword("LANGUAGE"), SubLObjectFactory.makeKeyword("SUB-EVENT"), SubLObjectFactory.makeKeyword("SUPER-EVENT"), SubLObjectFactory.makeKeyword("MOTIVATION") });
        $list108 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("GENL-PRED"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subEvents"))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("TERM"));
        $kw109$SUPER_EVENT = SubLObjectFactory.makeKeyword("SUPER-EVENT");
        $list110 = ConsesLow.listS(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pointOfContactInfo")), (SubLObject)SubLObjectFactory.makeKeyword("TERM"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $kw111$CONTACT = SubLObjectFactory.makeKeyword("CONTACT");
        $kw112$DATE = SubLObjectFactory.makeKeyword("DATE");
        $sym113$PROPERTY_TYPE_P_OLD = SubLObjectFactory.makeSymbol("PROPERTY-TYPE-P-OLD");
        $str114$_S_is_not_a_list_of_property_type = SubLObjectFactory.makeString("~S is not a list of property types.");
        $list115 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationInstanceExistsCount")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationInstanceExists")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationInstanceExistsRange")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationInstanceExistsMany")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationInstanceExistsMax")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationInstanceExistsMin")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("num-GenQuantRelnFrom")));
        $list116 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("TERM"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $list117 = ConsesLow.list(new SubLObject[] { ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("startingDate")), (SubLObject)SubLObjectFactory.makeKeyword("DATE")), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("endingDate")), (SubLObject)SubLObjectFactory.makeKeyword("DATE")), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("age")), (SubLObject)SubLObjectFactory.makeKeyword("DATE")), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("situationLocation")), (SubLObject)SubLObjectFactory.makeKeyword("LOCATION")), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("eventPartiallyOccursAt")), (SubLObject)SubLObjectFactory.makeKeyword("LOCATION")), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("politiesBorderEachOther")), (SubLObject)SubLObjectFactory.makeKeyword("LOCATION")), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("comesFrom-Generic")), (SubLObject)SubLObjectFactory.makeKeyword("LOCATION")), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subEvents")), (SubLObject)SubLObjectFactory.makeKeyword("SUB-EVENT")), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("perpetrator")), (SubLObject)SubLObjectFactory.makeKeyword("PERPETRATOR")), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("directingAgent")), (SubLObject)SubLObjectFactory.makeKeyword("PERPETRATOR")), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("eventPlannedBy")), (SubLObject)SubLObjectFactory.makeKeyword("PERPETRATOR")), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("inReactionTo")), (SubLObject)SubLObjectFactory.makeKeyword("MOTIVATION")), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("imports")), (SubLObject)SubLObjectFactory.makeKeyword("ECONOMY")), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("regionProduces")), (SubLObject)SubLObjectFactory.makeKeyword("ECONOMY")), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("inhabitantTypes")), (SubLObject)SubLObjectFactory.makeKeyword("INHABITANTS")), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("residentsOfRegion")), (SubLObject)SubLObjectFactory.makeKeyword("INHABITANTS")), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("religionOfRule")), (SubLObject)SubLObjectFactory.makeKeyword("RELIGION")), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cultureReligions")), (SubLObject)SubLObjectFactory.makeKeyword("RELIGION")), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("majorReligions")), (SubLObject)SubLObjectFactory.makeKeyword("RELIGION")), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("minorReligions")), (SubLObject)SubLObjectFactory.makeKeyword("RELIGION")), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ableToControl")), (SubLObject)SubLObjectFactory.makeKeyword("CONTROL")), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("owns")), (SubLObject)SubLObjectFactory.makeKeyword("CONTROL")), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("personalFeatures")), (SubLObject)SubLObjectFactory.makeKeyword("PERSONAL")), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("likes-Generic")), (SubLObject)SubLObjectFactory.makeKeyword("PERSONAL")), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("eatsWillingly")), (SubLObject)SubLObjectFactory.makeKeyword("PERSONAL")), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relatives")), (SubLObject)SubLObjectFactory.makeKeyword("PERSONAL")), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("acquaintedWith")), (SubLObject)SubLObjectFactory.makeKeyword("PERSONAL")), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("eMailAddressText")), (SubLObject)SubLObjectFactory.makeKeyword("CONTACT")), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("programsIn")), (SubLObject)SubLObjectFactory.makeKeyword("CAPABILITIES")), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("educationLevel")), (SubLObject)SubLObjectFactory.makeKeyword("CAPABILITIES")), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("fieldsOfCompetence")), (SubLObject)SubLObjectFactory.makeKeyword("CAPABILITIES")), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("languagesSpokenHere")), (SubLObject)SubLObjectFactory.makeKeyword("LANGUAGE")), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("languageSpoken")), (SubLObject)SubLObjectFactory.makeKeyword("LANGUAGE")), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("organismKilled")), (SubLObject)SubLObjectFactory.makeKeyword("TARGET")), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thingHarmed")), (SubLObject)SubLObjectFactory.makeKeyword("TARGET")), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("instrumentalRole")), (SubLObject)SubLObjectFactory.makeKeyword("ATTACK-TYPE")) });
        $list118 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("GENL-PRED"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SPEC-PRED"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")))), (SubLObject)SubLObjectFactory.makeKeyword("TERM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("POSSIBLE-ATTACK-TYPE?"))), (SubLObject)SubLObjectFactory.makeKeyword("ATTACK-TYPE")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("GENL-PRED"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"))), (SubLObject)SubLObjectFactory.makeKeyword("TERM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("GENLS"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Graduate"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ISA"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PersonTypeByEducationLevel"))))), (SubLObject)SubLObjectFactory.makeKeyword("CAPABILITIES")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("GENL-PRED"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"))), (SubLObject)SubLObjectFactory.makeKeyword("TERM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ISA"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PersonTypeByCulture")))), (SubLObject)SubLObjectFactory.makeKeyword("PERSONAL")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SPEC-PRED"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("perpetrator"))), (SubLObject)SubLObjectFactory.makeKeyword("TERM"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)SubLObjectFactory.makeKeyword("PERPETRATOR")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("occursDuring")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallyIntersects"))), (SubLObject)SubLObjectFactory.makeKeyword("TERM"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)SubLObjectFactory.makeKeyword("DATE")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("intendedAttackTargets")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("intendedTargetTypeOfAttack")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("intendedVictim")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numberOfHostagesTaken")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("target")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("bodilyActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectAttacked"))), (SubLObject)SubLObjectFactory.makeKeyword("TERM"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)SubLObjectFactory.makeKeyword("TARGET")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("TERM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("DATE-P"))), (SubLObject)SubLObjectFactory.makeKeyword("DATE")));
        $sym119$SIMPLE_BINARY_PROPERTY_PATTERNS = SubLObjectFactory.makeSymbol("SIMPLE-BINARY-PROPERTY-PATTERNS");
        $list120 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("PROPERTY-TYPE"));
        $kw121$GENL_PRED = SubLObjectFactory.makeKeyword("GENL-PRED");
        $list122 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $sym123$_SIMPLE_BINARY_PROPERTY_PATTERNS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*SIMPLE-BINARY-PROPERTY-PATTERNS-CACHING-STATE*");
        $sym124$SIMPLE_BINARY_PROPERTY_P = SubLObjectFactory.makeSymbol("SIMPLE-BINARY-PROPERTY-P");
        $const125$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $list126 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("PATTERN"), (SubLObject)SubLObjectFactory.makeSymbol("PROPERTY-TYPE"));
        $list127 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("injuryCount")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("deathToll")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("casualtyCount"))), (SubLObject)SubLObjectFactory.makeKeyword("TERM"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)SubLObjectFactory.makeKeyword("TARGET")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subSceneOfType")), (SubLObject)SubLObjectFactory.makeKeyword("TERM"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)SubLObjectFactory.makeKeyword("SUB-EVENT")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("capableOf")), (SubLObject)SubLObjectFactory.makeKeyword("TERM"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)SubLObjectFactory.makeKeyword("CAPABILITIES")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sponsorsAgentInAction")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("TERM")), (SubLObject)SubLObjectFactory.makeKeyword("PERPETRATOR")));
        $list128 = ConsesLow.listS((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("EXISTENTIAL-RMP-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("PRED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("TERM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $sym129$TYPE = SubLObjectFactory.makeSymbol("TYPE");
        $sym130$TERM = SubLObjectFactory.makeSymbol("TERM");
        $const131$SomeFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SomeFn"));
        $list132 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("CORE"));
        $list133 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SomeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")));
        $sym134$EL_CONJUNCTION_P = SubLObjectFactory.makeSymbol("EL-CONJUNCTION-P");
        $list135 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InstanceNamedFn")), (SubLObject)SubLObjectFactory.makeKeyword("STRING"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AttackType")));
        $const136$AttackType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AttackType"));
        $const137$AttackOnObject = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AttackOnObject"));
        $const138$HostileSocialAction = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HostileSocialAction"));
        $const139$KillingByOrganism = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("KillingByOrganism"));
        $const140$CapturingSomething = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CapturingSomething"));
        $const141$IncurringDamage = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IncurringDamage"));
        $const142$ManMadeDisaster = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ManMadeDisaster"));
        $const143$ObstructionEvent = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ObstructionEvent"));
        $const144$MilitaryEvent = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MilitaryEvent"));
        $const145$ExposureToSubstance = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExposureToSubstance"));
        $const146$ActsCommonlyConsideredCriminal = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ActsCommonlyConsideredCriminal"));
        $const147$ShootingAProjectileWeapon = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ShootingAProjectileWeapon"));
        $list148 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AttemptingFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ACT-TYPE")));
        $sym149$ACT_TYPE = SubLObjectFactory.makeSymbol("ACT-TYPE");
        $const150$True_JustificationTruth = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True-JustificationTruth"));
        $const151$functionalInArgs = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("functionalInArgs"));
        $const152$unknownSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentence"));
        $list153 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentence")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
    }
}

/*

	Total time: 2571 ms
	
*/