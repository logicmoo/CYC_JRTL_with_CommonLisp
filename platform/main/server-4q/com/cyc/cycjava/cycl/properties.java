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

public final class properties
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.properties";
  public static final String myFingerPrint = "2f3e74ce010cddec1c42a7e43c611715b609546b428ee69c3b57b130903b1bd5";
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13233L)
  private static SubLSymbol $too_big_places_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20701L)
  public static SubLSymbol $property_types_problem_store$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23848L)
  public static SubLSymbol $property_types$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23848L)
  private static SubLSymbol $existential_rmps$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23848L)
  private static SubLSymbol $simple_binary_property_type_preds$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23848L)
  private static SubLSymbol $other_simple_binary_property_patterns$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23848L)
  private static SubLSymbol $simple_binary_property_patterns_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23848L)
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

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1188L)
  public static SubLObject genl_propertyP(final SubLObject property1, final SubLObject property2, final SubLObject mt, SubLObject query_properties)
  {
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    SubLObject ans = NIL;
    query_properties = conses_high.putf( query_properties, $kw0$CONDITIONAL_SENTENCE_, T );
    final SubLObject var = $sym1$_TERM;
    final SubLObject sentence1 = property_to_sentence( property1, var );
    final SubLObject sentence2 = property_to_sentence( property2, var );
    final SubLObject query_sentence = el_utilities.make_implication( sentence1, sentence2 );
    final SubLObject query_result = inference_kernel.new_cyc_query( query_sentence, mt, query_properties );
    ans = cyc_kernel.closed_query_success_result_p( query_result );
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1819L)
  public static SubLObject more_general_properties(final SubLObject property, final SubLObject mt, SubLObject more_specifics)
  {
    if( more_specifics == UNPROVIDED )
    {
      more_specifics = dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED );
    }
    SubLObject ans = NIL;
    if( NIL != el_utilities.atomic_sentenceP( property ) )
    {
      ans = add_existential_more_general_properties( ans, property, mt );
      final SubLObject property_pred = cycl_utilities.formula_arg0( property );
      if( NIL != conses_high.member( property_pred, $list2, UNPROVIDED, UNPROVIDED ) )
      {
        final SubLObject number_comparison_clauses = number_comparison_clauses( property );
        if( property_pred.eql( $const3$relationInstanceExistsCount ) && !ZERO_INTEGER.eql( cycl_utilities.formula_arg4( property, UNPROVIDED ) ) )
        {
          final SubLObject more_general = el_utilities.replace_formula_arg( ZERO_INTEGER, $const4$relationInstanceExists, conses_high.butlast( property, UNPROVIDED ) );
          ans = ConsesLow.cons( more_general, ans );
          note_more_specific_property( more_specifics, more_general, property );
          SubLObject cdolist_list_var = number_comparison_clauses;
          SubLObject number_comparison_clause = NIL;
          number_comparison_clause = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            note_more_specific_property( more_specifics, more_general, number_comparison_clause );
            cdolist_list_var = cdolist_list_var.rest();
            number_comparison_clause = cdolist_list_var.first();
          }
        }
        SubLObject cdolist_list_var2 = number_comparison_clauses;
        SubLObject number_comparison_clause2 = NIL;
        number_comparison_clause2 = cdolist_list_var2.first();
        while ( NIL != cdolist_list_var2)
        {
          ans = ConsesLow.cons( number_comparison_clause2, ans );
          dictionary_utilities.dictionary_push( more_specifics, number_comparison_clause2, property );
          cdolist_list_var2 = cdolist_list_var2.rest();
          number_comparison_clause2 = cdolist_list_var2.first();
        }
      }
      else if( property_pred.eql( $const5$dateOfEvent ) )
      {
        final SubLObject date = cycl_utilities.formula_arg2( property, UNPROVIDED );
        final SubLObject date_var = $sym6$_VALUE;
        SubLObject cdolist_list_var = subsuming_dates( date );
        SubLObject bigger_date = NIL;
        bigger_date = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject more_general2 = el_utilities.make_existential( date_var, simplifier.conjoin( ConsesLow.list( el_utilities.replace_formula_arg( TWO_INTEGER, date_var, property ), ConsesLow.list(
              $const7$temporallySubsumes, bigger_date, date_var ) ), UNPROVIDED ) );
          ans = ConsesLow.cons( more_general2, ans );
          note_more_specific_property( more_specifics, more_general2, property );
          cdolist_list_var = cdolist_list_var.rest();
          bigger_date = cdolist_list_var.first();
        }
      }
      else if( NIL != genl_predicates.genl_predicateP( property_pred, $const8$situationLocation, UNPROVIDED, UNPROVIDED ) )
      {
        final SubLObject place = cycl_utilities.formula_arg2( property, UNPROVIDED );
        final SubLObject place_var = $sym6$_VALUE;
        SubLObject cdolist_list_var = bigger_places( place, mt );
        SubLObject bigger_place = NIL;
        bigger_place = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject more_general2 = el_utilities.make_existential( place_var, simplifier.conjoin( ConsesLow.list( el_utilities.replace_formula_arg( TWO_INTEGER, place_var, property ), ConsesLow.list(
              $const9$geographicalSubRegions, bigger_place, place_var ) ), UNPROVIDED ) );
          ans = ConsesLow.cons( more_general2, ans );
          note_more_specific_property( more_specifics, more_general2, property );
          cdolist_list_var = cdolist_list_var.rest();
          bigger_place = cdolist_list_var.first();
        }
        cdolist_list_var = place_types( place );
        SubLObject place_type = NIL;
        place_type = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject more_general2 = el_utilities.make_existential( place_var, simplifier.conjoin( ConsesLow.list( el_utilities.replace_formula_arg( TWO_INTEGER, place_var, property ), ConsesLow.list( $const10$isa,
              place_var, place_type ) ), UNPROVIDED ) );
          ans = ConsesLow.cons( more_general2, ans );
          note_more_specific_property( more_specifics, more_general2, property );
          cdolist_list_var = cdolist_list_var.rest();
          place_type = cdolist_list_var.first();
        }
      }
      ans = add_other_more_general_properties( ans, property, mt, more_specifics );
      ans = Sequences.nreverse( ans );
    }
    else if( NIL != el_utilities.el_existential_p( property ) )
    {
      ans = add_less_constrained_existential_properties( ans, property, mt, more_specifics );
    }
    return Values.values( ans, more_specifics );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4726L)
  public static SubLObject add_existential_more_general_properties(SubLObject ans, final SubLObject property, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    SubLObject success = formula_pattern_match.formula_matches_pattern( property, $list11 );
    SubLObject v_bindings = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != success )
    {
      final SubLObject value = list_utilities.alist_lookup_without_values( v_bindings, $sym12$VALUE, UNPROVIDED, UNPROVIDED );
      final SubLObject pred = list_utilities.alist_lookup_without_values( v_bindings, $sym13$PRED, UNPROVIDED, UNPROVIDED );
      if( NIL == genl_predicates.genl_predicateP( pred, $const10$isa, mt, UNPROVIDED ) )
      {
        final SubLObject var = $sym6$_VALUE;
        final SubLObject item_var;
        final SubLObject existential_property = item_var = el_utilities.make_existential( var, ConsesLow.list( pred, $kw14$TERM, var ) );
        if( NIL == conses_high.member( item_var, ans, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          ans = ConsesLow.cons( item_var, ans );
        }
        SubLObject cdolist_list_var = isa.min_isa( value, mt, UNPROVIDED );
        SubLObject v_isa = NIL;
        v_isa = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject item_var2;
          final SubLObject existential_property_$1 = item_var2 = el_utilities.make_existential( var, simplifier.conjoin( ConsesLow.list( ConsesLow.list( $const10$isa, var, v_isa ), ConsesLow.list( pred, $kw14$TERM,
              var ) ), UNPROVIDED ) );
          if( NIL == conses_high.member( item_var2, ans, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            ans = ConsesLow.cons( item_var2, ans );
          }
          cdolist_list_var = cdolist_list_var.rest();
          v_isa = cdolist_list_var.first();
        }
      }
    }
    thread.resetMultipleValues();
    success = formula_pattern_match.formula_matches_pattern( property, $list15 );
    v_bindings = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != success )
    {
      final SubLObject value = list_utilities.alist_lookup_without_values( v_bindings, $sym12$VALUE, UNPROVIDED, UNPROVIDED );
      final SubLObject pred = list_utilities.alist_lookup_without_values( v_bindings, $sym13$PRED, UNPROVIDED, UNPROVIDED );
      final SubLObject var = $sym6$_VALUE;
      final SubLObject item_var;
      final SubLObject existential_property = item_var = el_utilities.make_existential( var, ConsesLow.listS( pred, var, $list16 ) );
      if( NIL == conses_high.member( item_var, ans, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        ans = ConsesLow.cons( item_var, ans );
      }
      SubLObject cdolist_list_var = isa.min_isa( value, mt, UNPROVIDED );
      SubLObject v_isa = NIL;
      v_isa = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject item_var2;
        final SubLObject existential_property_$2 = item_var2 = el_utilities.make_existential( var, simplifier.conjoin( ConsesLow.list( ConsesLow.list( $const10$isa, var, v_isa ), ConsesLow.listS( pred, var, $list16 ) ),
            UNPROVIDED ) );
        if( NIL == conses_high.member( item_var2, ans, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          ans = ConsesLow.cons( item_var2, ans );
        }
        cdolist_list_var = cdolist_list_var.rest();
        v_isa = cdolist_list_var.first();
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5788L)
  public static SubLObject add_other_more_general_properties(SubLObject ans, final SubLObject property, final SubLObject mt, final SubLObject more_specifics)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    ans = add_instance_named_fn_properties( ans, property, mt, more_specifics );
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      ans = add_genl_preds_properties( ans, property, more_specifics, mt );
      ans = add_genls_properties( ans, property, more_specifics );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6142L)
  public static SubLObject add_instance_named_fn_properties(SubLObject ans, final SubLObject property, final SubLObject mt, final SubLObject more_specifics)
  {
    final SubLObject infn_argnum = Sequences.position_if( $sym17$INSTANCE_NAMED_FN_NAT_P, property, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != infn_argnum )
    {
      final SubLObject infn = cycl_utilities.formula_arg( property, infn_argnum, UNPROVIDED );
      final SubLObject type = cycl_utilities.nat_arg2( infn, UNPROVIDED );
      final SubLObject var = $sym6$_VALUE;
      final SubLObject more_general = el_utilities.make_existential( var, simplifier.conjoin( ConsesLow.list( el_utilities.replace_formula_arg( infn_argnum, var, property ), ConsesLow.list( $const10$isa, var, type ) ),
          UNPROVIDED ) );
      ans = ConsesLow.cons( more_general, ans );
      note_more_specific_property( more_specifics, more_general, property );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6696L)
  public static SubLObject add_genl_preds_properties(SubLObject ans, final SubLObject property, final SubLObject more_specifics, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject property_pred = cycl_utilities.formula_arg0( property );
    SubLObject more = NIL;
    final SubLObject max = THREE_INTEGER;
    final SubLObject generality_estimate_cutoff = $int18$150000;
    SubLObject stopP = NIL;
    if( NIL == stopP )
    {
      final SubLObject node_var = property_pred;
      final SubLObject deck_type = ( $kw19$BREADTH == $kw20$DEPTH ) ? $kw21$STACK : $kw22$QUEUE;
      final SubLObject recur_deck = deck.create_deck( deck_type );
      SubLObject node_and_predicate_mode = NIL;
      final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
      try
      {
        sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
        try
        {
          final SubLObject tv_var = NIL;
          final SubLObject _prev_bind_0_$3 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
          final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
          try
          {
            sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
            sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym23$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
            if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
            {
              final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
              if( pcase_var.eql( $kw24$ERROR ) )
              {
                sbhl_paranoia.sbhl_error( ONE_INTEGER, $str25$_A_is_not_a__A, tv_var, $sym26$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              else if( pcase_var.eql( $kw27$CERROR ) )
              {
                sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str28$continue_anyway, $str25$_A_is_not_a__A, tv_var, $sym26$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              else if( pcase_var.eql( $kw29$WARN ) )
              {
                Errors.warn( $str25$_A_is_not_a__A, tv_var, $sym26$SBHL_TRUE_TV_P );
              }
              else
              {
                Errors.warn( $str30$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                Errors.cerror( $str28$continue_anyway, $str25$_A_is_not_a__A, tv_var, $sym26$SBHL_TRUE_TV_P );
              }
            }
            final SubLObject _prev_bind_0_$4 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
            final SubLObject _prev_bind_1_$5 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
            try
            {
              sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const31$genlPreds ), thread );
              sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const31$genlPreds ) ), thread );
              sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const31$genlPreds ) ), thread );
              sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
              sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const31$genlPreds ), thread );
              if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( property_pred, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
              {
                final SubLObject _prev_bind_0_$5 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                final SubLObject _prev_bind_1_$6 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                final SubLObject _prev_bind_2_$8 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_forward_search_direction(), thread );
                  sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(
                      $const31$genlPreds ) ), thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                  for( node_and_predicate_mode = ConsesLow.list( property_pred, sbhl_search_vars.genl_inverse_mode_p() ); NIL != node_and_predicate_mode && NIL == stopP; node_and_predicate_mode = deck.deck_pop(
                      recur_deck ) )
                  {
                    final SubLObject node_var_$9 = node_and_predicate_mode.first();
                    final SubLObject predicate_mode = conses_high.second( node_and_predicate_mode );
                    final SubLObject genl_pred = node_var_$9;
                    final SubLObject _prev_bind_0_$6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                    try
                    {
                      sbhl_search_vars.$genl_inverse_mode_p$.bind( predicate_mode, thread );
                      if( NIL != sbhl_search_utilities.apply_sbhl_add_node_test( sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$9 ) )
                      {
                        stopP = Numbers.numG( cardinality_estimates.generality_estimate( genl_pred ), generality_estimate_cutoff );
                        if( NIL == stopP && !genl_pred.eql( property_pred ) && NIL != constant_handles.constant_p( genl_pred ) )
                        {
                          final SubLObject more_general = el_utilities.replace_formula_arg( ZERO_INTEGER, genl_pred, property );
                          more = ConsesLow.cons( more_general, more );
                          stopP = list_utilities.lengthGE( more, max, UNPROVIDED );
                          if( NIL == stopP )
                          {
                            SubLObject csome_list_var = more_general_properties( more_general, mt, more_specifics );
                            SubLObject more_more_general = NIL;
                            more_more_general = csome_list_var.first();
                            while ( NIL == stopP && NIL != csome_list_var)
                            {
                              final SubLObject item_var = more_more_general;
                              if( NIL == conses_high.member( item_var, more, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
                              {
                                more = ConsesLow.cons( item_var, more );
                              }
                              stopP = list_utilities.lengthGE( more, max, UNPROVIDED );
                              csome_list_var = csome_list_var.rest();
                              more_more_general = csome_list_var.first();
                            }
                          }
                          note_more_specific_property( more_specifics, more_general, property );
                        }
                      }
                      final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const31$genlPreds ) );
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
                      for( rest = NIL, rest = accessible_modules; NIL == stopP && NIL != rest; rest = rest.rest() )
                      {
                        module_var = rest.first();
                        _prev_bind_0_$7 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                        _prev_bind_1_$7 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                        try
                        {
                          sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                          sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                              .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                          node = function_terms.naut_to_nart( node_var_$9 );
                          if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                          {
                            d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != d_link )
                            {
                              mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != mt_links )
                              {
                                for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == stopP && NIL == dictionary_contents
                                    .do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                {
                                  thread.resetMultipleValues();
                                  mt_$13 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                  tv_links = thread.secondMultipleValue();
                                  thread.resetMultipleValues();
                                  if( NIL != mt_relevance_macros.relevant_mtP( mt_$13 ) )
                                  {
                                    _prev_bind_0_$8 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                    try
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.bind( mt_$13, thread );
                                      for( iteration_state_$15 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == stopP && NIL == dictionary_contents
                                          .do_dictionary_contents_doneP( iteration_state_$15 ); iteration_state_$15 = dictionary_contents.do_dictionary_contents_next( iteration_state_$15 ) )
                                      {
                                        thread.resetMultipleValues();
                                        tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$15 );
                                        link_nodes = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                        {
                                          _prev_bind_0_$9 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                            sol = link_nodes;
                                            if( NIL != set.set_p( sol ) )
                                            {
                                              set_contents_var = set.do_set_internal( sol );
                                              for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                  set_contents_var ); NIL == stopP && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                              {
                                                node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                                if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                    UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                  deck.deck_push( ConsesLow.list( node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                                }
                                              }
                                            }
                                            else if( sol.isList() )
                                            {
                                              if( NIL == stopP )
                                              {
                                                csome_list_var2 = sol;
                                                node_vars_link_node2 = NIL;
                                                node_vars_link_node2 = csome_list_var2.first();
                                                while ( NIL == stopP && NIL != csome_list_var2)
                                                {
                                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                    deck.deck_push( ConsesLow.list( node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                                  }
                                                  csome_list_var2 = csome_list_var2.rest();
                                                  node_vars_link_node2 = csome_list_var2.first();
                                                }
                                              }
                                            }
                                            else
                                            {
                                              Errors.error( $str32$_A_is_neither_SET_P_nor_LISTP_, sol );
                                            }
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$9, thread );
                                          }
                                        }
                                      }
                                      dictionary_contents.do_dictionary_contents_finalize( iteration_state_$15 );
                                    }
                                    finally
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$8, thread );
                                    }
                                  }
                                }
                                dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                              }
                            }
                            else
                            {
                              sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str33$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                            }
                          }
                          else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                          {
                            new_list = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars
                                .get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                    .get_sbhl_module( UNPROVIDED ) ) );
                            for( rest_$17 = NIL, rest_$17 = new_list; NIL == stopP && NIL != rest_$17; rest_$17 = rest_$17.rest() )
                            {
                              generating_fn = rest_$17.first();
                              _prev_bind_0_$10 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                              try
                              {
                                sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                link_nodes2 = ( sol2 = Functions.funcall( generating_fn, node ) );
                                if( NIL != set.set_p( sol2 ) )
                                {
                                  set_contents_var2 = set.do_set_internal( sol2 );
                                  for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                      set_contents_var2 ); NIL == stopP && NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                  {
                                    node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                    if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                        UNPROVIDED ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                      deck.deck_push( ConsesLow.list( node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                    }
                                  }
                                }
                                else if( sol2.isList() )
                                {
                                  if( NIL == stopP )
                                  {
                                    csome_list_var3 = sol2;
                                    node_vars_link_node4 = NIL;
                                    node_vars_link_node4 = csome_list_var3.first();
                                    while ( NIL == stopP && NIL != csome_list_var3)
                                    {
                                      if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                        deck.deck_push( ConsesLow.list( node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                      }
                                      csome_list_var3 = csome_list_var3.rest();
                                      node_vars_link_node4 = csome_list_var3.first();
                                    }
                                  }
                                }
                                else
                                {
                                  Errors.error( $str32$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                }
                              }
                              finally
                              {
                                sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$10, thread );
                              }
                            }
                          }
                        }
                        finally
                        {
                          sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$7, thread );
                          sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$7, thread );
                        }
                      }
                    }
                    finally
                    {
                      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_0_$6, thread );
                    }
                  }
                }
                finally
                {
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$8, thread );
                  sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$6, thread );
                  sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$5, thread );
                }
              }
              else
              {
                sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str34$Node__a_does_not_pass_sbhl_type_t, property_pred, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED,
                    UNPROVIDED, UNPROVIDED );
              }
            }
            finally
            {
              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
              sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
              sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$5, thread );
              sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$4, thread );
            }
          }
          finally
          {
            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_2, thread );
            sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$3, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$11, thread );
          }
        }
      }
      finally
      {
        sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0, thread );
      }
    }
    if( NIL != more )
    {
      ans = ConsesLow.append( Sequences.nreverse( more ), ans );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7625L)
  public static SubLObject add_genls_properties(SubLObject ans, final SubLObject property, final SubLObject more_specifics)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject property_pred = cycl_utilities.formula_arg0( property );
    if( NIL != formula_pattern_match.formula_matches_pattern( property, $list35 ) && NIL != conses_high.member( $const36$genls, ke_tools.transitive_via_arg_preds( property_pred, TWO_INTEGER, UNPROVIDED ), UNPROVIDED,
        UNPROVIDED ) )
    {
      SubLObject more = NIL;
      final SubLObject max = THREE_INTEGER;
      final SubLObject generality_estimate_cutoff = $int18$150000;
      SubLObject stopP = NIL;
      final SubLObject property_coll = cycl_utilities.atomic_sentence_arg2( property, UNPROVIDED );
      if( NIL == stopP )
      {
        SubLObject node_var = property_coll;
        final SubLObject deck_type = ( $kw19$BREADTH == $kw19$BREADTH ) ? $kw22$QUEUE : $kw21$STACK;
        final SubLObject recur_deck = deck.create_deck( deck_type );
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
          try
          {
            final SubLObject tv_var = NIL;
            final SubLObject _prev_bind_0_$20 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
            final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
            try
            {
              sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
              sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym23$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
              if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
              {
                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                if( pcase_var.eql( $kw24$ERROR ) )
                {
                  sbhl_paranoia.sbhl_error( ONE_INTEGER, $str25$_A_is_not_a__A, tv_var, $sym26$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw27$CERROR ) )
                {
                  sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str28$continue_anyway, $str25$_A_is_not_a__A, tv_var, $sym26$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw29$WARN ) )
                {
                  Errors.warn( $str25$_A_is_not_a__A, tv_var, $sym26$SBHL_TRUE_TV_P );
                }
                else
                {
                  Errors.warn( $str30$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                  Errors.cerror( $str28$continue_anyway, $str25$_A_is_not_a__A, tv_var, $sym26$SBHL_TRUE_TV_P );
                }
              }
              final SubLObject _prev_bind_0_$21 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
              final SubLObject _prev_bind_1_$22 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
              final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
              final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
              final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const36$genls ), thread );
                sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const36$genls ) ), thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const36$genls ) ), thread );
                sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const36$genls ), thread );
                if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( property_coll, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                {
                  final SubLObject _prev_bind_0_$22 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$23 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_2_$25 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_forward_search_direction(), thread );
                    sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(
                        $const36$genls ) ), thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                    sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                    while ( NIL != node_var && NIL == stopP)
                    {
                      final SubLObject genl = node_var;
                      stopP = Numbers.numG( cardinality_estimates.generality_estimate( genl ), generality_estimate_cutoff );
                      if( NIL == stopP && !genl.eql( property_coll ) )
                      {
                        final SubLObject more_general = el_utilities.replace_formula_arg( TWO_INTEGER, genl, property );
                        more = ConsesLow.cons( more_general, more );
                        stopP = list_utilities.lengthGE( more, max, UNPROVIDED );
                        note_more_specific_property( more_specifics, more_general, property );
                      }
                      final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const36$genls ) );
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
                      for( rest = NIL, rest = accessible_modules; NIL == stopP && NIL != rest; rest = rest.rest() )
                      {
                        module_var = rest.first();
                        _prev_bind_0_$23 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                        _prev_bind_1_$24 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                        try
                        {
                          sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                          sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                              .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                          node = function_terms.naut_to_nart( node_var );
                          if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                          {
                            d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != d_link )
                            {
                              mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != mt_links )
                              {
                                for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == stopP && NIL == dictionary_contents
                                    .do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                {
                                  thread.resetMultipleValues();
                                  mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                  tv_links = thread.secondMultipleValue();
                                  thread.resetMultipleValues();
                                  if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                  {
                                    _prev_bind_0_$24 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                    try
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                      for( iteration_state_$29 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == stopP && NIL == dictionary_contents
                                          .do_dictionary_contents_doneP( iteration_state_$29 ); iteration_state_$29 = dictionary_contents.do_dictionary_contents_next( iteration_state_$29 ) )
                                      {
                                        thread.resetMultipleValues();
                                        tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$29 );
                                        link_nodes = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                        {
                                          _prev_bind_0_$25 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                            sol = link_nodes;
                                            if( NIL != set.set_p( sol ) )
                                            {
                                              set_contents_var = set.do_set_internal( sol );
                                              for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                  set_contents_var ); NIL == stopP && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                              {
                                                node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                                if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                    UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                  deck.deck_push( node_vars_link_node, recur_deck );
                                                }
                                              }
                                            }
                                            else if( sol.isList() )
                                            {
                                              if( NIL == stopP )
                                              {
                                                csome_list_var = sol;
                                                node_vars_link_node2 = NIL;
                                                node_vars_link_node2 = csome_list_var.first();
                                                while ( NIL == stopP && NIL != csome_list_var)
                                                {
                                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                    deck.deck_push( node_vars_link_node2, recur_deck );
                                                  }
                                                  csome_list_var = csome_list_var.rest();
                                                  node_vars_link_node2 = csome_list_var.first();
                                                }
                                              }
                                            }
                                            else
                                            {
                                              Errors.error( $str32$_A_is_neither_SET_P_nor_LISTP_, sol );
                                            }
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$25, thread );
                                          }
                                        }
                                      }
                                      dictionary_contents.do_dictionary_contents_finalize( iteration_state_$29 );
                                    }
                                    finally
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$24, thread );
                                    }
                                  }
                                }
                                dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                              }
                            }
                            else
                            {
                              sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str33$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                            }
                          }
                          else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                          {
                            new_list = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars
                                .get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                    .get_sbhl_module( UNPROVIDED ) ) );
                            for( rest_$31 = NIL, rest_$31 = new_list; NIL == stopP && NIL != rest_$31; rest_$31 = rest_$31.rest() )
                            {
                              generating_fn = rest_$31.first();
                              _prev_bind_0_$26 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                              try
                              {
                                sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                link_nodes2 = ( sol2 = Functions.funcall( generating_fn, node ) );
                                if( NIL != set.set_p( sol2 ) )
                                {
                                  set_contents_var2 = set.do_set_internal( sol2 );
                                  for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                      set_contents_var2 ); NIL == stopP && NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                  {
                                    node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                    if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                        UNPROVIDED ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                      deck.deck_push( node_vars_link_node3, recur_deck );
                                    }
                                  }
                                }
                                else if( sol2.isList() )
                                {
                                  if( NIL == stopP )
                                  {
                                    csome_list_var2 = sol2;
                                    node_vars_link_node4 = NIL;
                                    node_vars_link_node4 = csome_list_var2.first();
                                    while ( NIL == stopP && NIL != csome_list_var2)
                                    {
                                      if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                        deck.deck_push( node_vars_link_node4, recur_deck );
                                      }
                                      csome_list_var2 = csome_list_var2.rest();
                                      node_vars_link_node4 = csome_list_var2.first();
                                    }
                                  }
                                }
                                else
                                {
                                  Errors.error( $str32$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                }
                              }
                              finally
                              {
                                sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$26, thread );
                              }
                            }
                          }
                        }
                        finally
                        {
                          sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$24, thread );
                          sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$23, thread );
                        }
                      }
                      node_var = deck.deck_pop( recur_deck );
                    }
                  }
                  finally
                  {
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$25, thread );
                    sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$23, thread );
                    sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$22, thread );
                  }
                }
                else
                {
                  sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str34$Node__a_does_not_pass_sbhl_type_t, property_coll, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED,
                      UNPROVIDED, UNPROVIDED );
                }
              }
              finally
              {
                sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
                sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$22, thread );
                sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$21, thread );
              }
            }
            finally
            {
              sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_2, thread );
              sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$20, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$27 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$27, thread );
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0, thread );
        }
      }
      if( NIL != more )
      {
        ans = ConsesLow.append( Sequences.nreverse( more ), ans );
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8519L)
  public static SubLObject add_less_constrained_existential_properties(SubLObject ans, final SubLObject property, final SubLObject mt, final SubLObject more_specifics)
  {
    assert NIL != el_utilities.el_existential_p( property ) : property;
    SubLObject less_constrained_properties = NIL;
    SubLObject current;
    final SubLObject datum = current = cycl_utilities.formula_args( property, UNPROVIDED );
    SubLObject var = NIL;
    SubLObject body = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
    body = current.first();
    current = current.rest();
    if( NIL == current )
    {
      if( NIL != el_utilities.el_conjunction_p( body ) )
      {
        SubLObject term_conjuncts = NIL;
        SubLObject other_conjuncts = NIL;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( body, $kw39$IGNORE );
        SubLObject conjunct = NIL;
        conjunct = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != cycl_utilities.expression_find( $kw14$TERM, conjunct, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
          {
            term_conjuncts = ConsesLow.cons( conjunct, term_conjuncts );
          }
          else
          {
            other_conjuncts = ConsesLow.cons( conjunct, other_conjuncts );
          }
          cdolist_list_var = cdolist_list_var.rest();
          conjunct = cdolist_list_var.first();
        }
        if( NIL != other_conjuncts )
        {
          SubLObject cdolist_list_var2 = list_utilities.powerset( other_conjuncts );
          SubLObject sub_other_conjuncts = NIL;
          sub_other_conjuncts = cdolist_list_var2.first();
          while ( NIL != cdolist_list_var2)
          {
            if( !sub_other_conjuncts.equal( other_conjuncts ) )
            {
              final SubLObject conjuncts_to_use = ConsesLow.append( term_conjuncts, sub_other_conjuncts );
              final SubLObject new_body = ( NIL != list_utilities.singletonP( conjuncts_to_use ) ) ? conjuncts_to_use.first() : simplifier.conjoin( conjuncts_to_use, UNPROVIDED );
              final SubLObject less_constrained_property = el_utilities.make_existential( var, new_body );
              less_constrained_properties = ConsesLow.cons( less_constrained_property, less_constrained_properties );
              note_more_specific_property( more_specifics, less_constrained_property, property );
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            sub_other_conjuncts = cdolist_list_var2.first();
          }
        }
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list38 );
    }
    final SubLObject reformulated = reformulate_property_for_paraphrase( property );
    if( !reformulated.equal( property ) )
    {
      SubLObject cdolist_list_var3 = more_general_properties( reformulated, mt, more_specifics );
      SubLObject more = NIL;
      more = cdolist_list_var3.first();
      while ( NIL != cdolist_list_var3)
      {
        final SubLObject item_var = more;
        if( NIL == conses_high.member( item_var, less_constrained_properties, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          less_constrained_properties = ConsesLow.cons( item_var, less_constrained_properties );
        }
        note_more_specific_property( more_specifics, more, property );
        cdolist_list_var3 = cdolist_list_var3.rest();
        more = cdolist_list_var3.first();
      }
    }
    if( NIL != less_constrained_properties )
    {
      ans = ConsesLow.append( less_constrained_properties, ans );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10027L)
  public static SubLObject note_more_specific_property(final SubLObject more_specifics, final SubLObject more_general, final SubLObject more_specific)
  {
    dictionary_utilities.dictionary_push( more_specifics, more_general, more_specific );
    return more_specifics;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10205L)
  public static SubLObject instance_named_fn_nat_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_utilities.possibly_nat_p( v_object ) && cycl_utilities.nat_functor( v_object ).eql( $const40$InstanceNamedFn ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10346L)
  public static SubLObject number_comparison_clauses(final SubLObject property)
  {
    final SubLObject number_argnum = Sequences.position_if( $sym41$INTEGERP, property, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject ans = NIL;
    final SubLObject count = cycl_utilities.formula_arg( property, number_argnum, UNPROVIDED );
    final SubLObject var = $sym6$_VALUE;
    if( NIL != subl_promotions.positive_integer_p( count ) )
    {
      ans = ConsesLow.list( el_utilities.make_existential( var, simplifier.conjoin( ConsesLow.list( el_utilities.replace_formula_arg( number_argnum, var, property ), ConsesLow.list( $const42$greaterThanOrEqualTo, var,
          count ) ), UNPROVIDED ) ) );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10975L)
  public static SubLObject subsuming_dates(final SubLObject date)
  {
    SubLObject bigger_dates = NIL;
    if( NIL != date_utilities.date_p( date ) )
    {
      bigger_dates = Sequences.remove( date, list_utilities.remove_if_not( $sym43$DATE_P, ConsesLow.list( date_utilities.century_of_date( date ), date_utilities.decade_of_date( date ), date_utilities.year_of_date(
          date ), date_utilities.month_of_date( date ), date_utilities.day_of_date( date ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED,
          UNPROVIDED );
    }
    return bigger_dates;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11538L)
  public static SubLObject bigger_places(final SubLObject place, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject bigger_places = NIL;
    if( ( NIL != narts_high.naut_p( place ) || NIL != nart_handles.nart_p( place ) ) && cycl_utilities.nat_functor( place ).eql( $const44$CityNamedFn ) )
    {
      final SubLObject location = cycl_utilities.nat_arg2( place, UNPROVIDED );
      bigger_places = ConsesLow.cons( location, bigger_places( location, mt ) );
    }
    else if( NIL == kb_indexing_datastructures.indexed_term_p( place ) )
    {
      bigger_places = NIL;
    }
    if( NIL != nart_handles.nart_p( narts_high.find_nart( ConsesLow.list( $const45$TerritoryFn, place ) ) ) )
    {
      bigger_places = ConsesLow.append( bigger_places, bigger_places( narts_high.find_nart( ConsesLow.list( $const45$TerritoryFn, place ) ), mt ) );
    }
    if( NIL != isa.isa_in_any_mtP( place, $const46$City ) )
    {
      final SubLObject country = ask_utilities.ask_variable( $sym47$_COUNTRY, ConsesLow.list( $const48$countryOfCity, $sym47$_COUNTRY, place ), mt, NIL, ONE_INTEGER, UNPROVIDED, UNPROVIDED ).first();
      if( NIL != country )
      {
        bigger_places = ConsesLow.append( bigger_places, bigger_places( country, mt ) );
      }
    }
    if( NIL != isa.isaP( place, $const49$GeographicalAgent, mt, UNPROVIDED ) && NIL == isa.isaP( place, $const50$GeographicalRegion, mt, UNPROVIDED ) )
    {
      final SubLObject territory = ask_utilities.ask_variable( $sym51$_TERRITORY, ConsesLow.listS( $const52$territoryOf, place, $list53 ), mt, NIL, ONE_INTEGER, UNPROVIDED, UNPROVIDED ).first();
      if( NIL != territory )
      {
        bigger_places = ConsesLow.append( bigger_places, bigger_places( territory, mt ) );
      }
    }
    else
    {
      SubLObject all_answers = ask_utilities.ask_variable( $sym54$_BIG, ConsesLow.list( $const9$geographicalSubRegions, $sym54$_BIG, place ), mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym55$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const56$EverythingPSC, thread );
        all_answers = Sequences.remove_if( $sym57$PLACE_TOO_BIG_, all_answers, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
      bigger_places = ConsesLow.append( bigger_places, all_answers );
    }
    if( NIL == bigger_places )
    {
      Errors.warn( $str58$Couldn_t_find_bigger_places_for__, place );
    }
    return Sequences.delete_duplicates( bigger_places, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13133L)
  public static SubLObject place_too_bigP(final SubLObject place)
  {
    return subl_promotions.memberP( narts_high.nart_substitute( place ), too_big_places(), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13233L)
  public static SubLObject clear_too_big_places()
  {
    final SubLObject cs = $too_big_places_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13233L)
  public static SubLObject remove_too_big_places()
  {
    return memoization_state.caching_state_remove_function_results_with_args( $too_big_places_caching_state$.getGlobalValue(), ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13233L)
  public static SubLObject too_big_places_internal()
  {
    SubLObject big_places = NIL;
    SubLObject cdolist_list_var = $list60;
    SubLObject place_type = NIL;
    place_type = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$34 = isa.all_fort_instances( place_type, UNPROVIDED, UNPROVIDED );
      SubLObject place = NIL;
      place = cdolist_list_var_$34.first();
      while ( NIL != cdolist_list_var_$34)
      {
        big_places = ConsesLow.cons( place, big_places );
        cdolist_list_var_$34 = cdolist_list_var_$34.rest();
        place = cdolist_list_var_$34.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      place_type = cdolist_list_var.first();
    }
    return big_places;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13233L)
  public static SubLObject too_big_places()
  {
    SubLObject caching_state = $too_big_places_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym59$TOO_BIG_PLACES, $sym61$_TOO_BIG_PLACES_CACHING_STATE_, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_get_zero_arg_results( caching_state, UNPROVIDED );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( too_big_places_internal() ) );
      memoization_state.caching_state_set_zero_arg_results( caching_state, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13494L)
  public static SubLObject place_types(final SubLObject place)
  {
    if( NIL == nart_handles.nart_p( place ) && NIL == narts_high.naut_p( place ) )
    {
      return NIL;
    }
    final SubLObject pcase_var = cycl_utilities.nat_functor( place );
    if( pcase_var.eql( $const40$InstanceNamedFn ) )
    {
      return ConsesLow.list( cycl_utilities.nat_arg2( place, UNPROVIDED ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13716L)
  public static SubLObject reformulate_property_for_paraphrase(final SubLObject property)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject reformulated = NIL;
    thread.resetMultipleValues();
    SubLObject success = formula_pattern_match.formula_matches_pattern( property, $list62 );
    SubLObject v_bindings = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != success )
    {
      final SubLObject value = list_utilities.alist_lookup_without_values( v_bindings, $sym12$VALUE, UNPROVIDED, UNPROVIDED );
      final SubLObject trans_pred = list_utilities.alist_lookup_without_values( v_bindings, $sym63$TRANS_PRED, UNPROVIDED, UNPROVIDED );
      final SubLObject bin_pred = list_utilities.alist_lookup_without_values( v_bindings, $sym64$BIN_PRED, UNPROVIDED, UNPROVIDED );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym55$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const56$EverythingPSC, thread );
        final SubLObject valid_trans_preds = ke_tools.transitive_via_arg_inverses( bin_pred, TWO_INTEGER, UNPROVIDED );
        if( NIL != subl_promotions.memberP( trans_pred, valid_trans_preds, UNPROVIDED, UNPROVIDED ) )
        {
          reformulated = ConsesLow.list( bin_pred, $kw14$TERM, value );
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    if( NIL == reformulated )
    {
      thread.resetMultipleValues();
      success = formula_pattern_match.formula_matches_pattern( property, $list65 );
      v_bindings = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != success )
      {
        final SubLObject value = list_utilities.alist_lookup_without_values( v_bindings, $sym12$VALUE, UNPROVIDED, UNPROVIDED );
        final SubLObject trans_pred = list_utilities.alist_lookup_without_values( v_bindings, $sym63$TRANS_PRED, UNPROVIDED, UNPROVIDED );
        final SubLObject bin_pred = list_utilities.alist_lookup_without_values( v_bindings, $sym64$BIN_PRED, UNPROVIDED, UNPROVIDED );
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym55$RELEVANT_MT_IS_EVERYTHING, thread );
          mt_relevance_macros.$mt$.bind( $const56$EverythingPSC, thread );
          final SubLObject valid_trans_preds = ke_tools.transitive_via_arg_inverses( bin_pred, TWO_INTEGER, UNPROVIDED );
          if( NIL != subl_promotions.memberP( trans_pred, valid_trans_preds, UNPROVIDED, UNPROVIDED ) )
          {
            reformulated = ConsesLow.list( bin_pred, $kw14$TERM, value );
          }
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
        }
      }
    }
    if( NIL == reformulated )
    {
      thread.resetMultipleValues();
      success = formula_pattern_match.formula_matches_pattern( property, $list66 );
      v_bindings = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != success )
      {
        final SubLObject value = list_utilities.alist_lookup_without_values( v_bindings, $sym12$VALUE, UNPROVIDED, UNPROVIDED );
        final SubLObject collection = list_utilities.alist_lookup_without_values( v_bindings, $sym67$COLLECTION, UNPROVIDED, UNPROVIDED );
        final SubLObject bin_pred = list_utilities.alist_lookup_without_values( v_bindings, $sym64$BIN_PRED, UNPROVIDED, UNPROVIDED );
        reformulated = ConsesLow.list( $const3$relationInstanceExistsCount, bin_pred, $kw14$TERM, collection, ConsesLow.list( $const68$IntervalMinFn, value ) );
      }
    }
    if( NIL == reformulated )
    {
      thread.resetMultipleValues();
      success = formula_pattern_match.formula_matches_pattern( property, $list69 );
      v_bindings = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != success )
      {
        final SubLObject value = list_utilities.alist_lookup_without_values( v_bindings, $sym12$VALUE, UNPROVIDED, UNPROVIDED );
        final SubLObject collection = list_utilities.alist_lookup_without_values( v_bindings, $sym67$COLLECTION, UNPROVIDED, UNPROVIDED );
        final SubLObject bin_pred = list_utilities.alist_lookup_without_values( v_bindings, $sym64$BIN_PRED, UNPROVIDED, UNPROVIDED );
        reformulated = ConsesLow.list( $const3$relationInstanceExistsCount, bin_pred, $kw14$TERM, collection, ConsesLow.list( $const70$IntervalMaxFn, value ) );
      }
    }
    if( NIL == reformulated )
    {
      thread.resetMultipleValues();
      success = formula_pattern_match.formula_matches_pattern( property, $list71 );
      v_bindings = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != success )
      {
        final SubLObject value = list_utilities.alist_lookup_without_values( v_bindings, $sym12$VALUE, UNPROVIDED, UNPROVIDED );
        final SubLObject collection = list_utilities.alist_lookup_without_values( v_bindings, $sym67$COLLECTION, UNPROVIDED, UNPROVIDED );
        final SubLObject tern_pred = list_utilities.alist_lookup_without_values( v_bindings, $sym72$TERN_PRED, UNPROVIDED, UNPROVIDED );
        reformulated = ConsesLow.list( tern_pred, $kw14$TERM, collection, ConsesLow.list( $const70$IntervalMaxFn, value ) );
      }
    }
    if( NIL == reformulated )
    {
      thread.resetMultipleValues();
      success = formula_pattern_match.formula_matches_pattern( property, $list73 );
      v_bindings = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != success )
      {
        final SubLObject value = list_utilities.alist_lookup_without_values( v_bindings, $sym12$VALUE, UNPROVIDED, UNPROVIDED );
        final SubLObject collection = list_utilities.alist_lookup_without_values( v_bindings, $sym67$COLLECTION, UNPROVIDED, UNPROVIDED );
        final SubLObject tern_pred = list_utilities.alist_lookup_without_values( v_bindings, $sym72$TERN_PRED, UNPROVIDED, UNPROVIDED );
        reformulated = ConsesLow.list( tern_pred, $kw14$TERM, collection, ConsesLow.list( $const70$IntervalMaxFn, value ) );
      }
    }
    if( NIL == reformulated )
    {
      thread.resetMultipleValues();
      success = formula_pattern_match.formula_matches_pattern( property, $list74 );
      v_bindings = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != success )
      {
        final SubLObject value = list_utilities.alist_lookup_without_values( v_bindings, $sym12$VALUE, UNPROVIDED, UNPROVIDED );
        final SubLObject collection = list_utilities.alist_lookup_without_values( v_bindings, $sym67$COLLECTION, UNPROVIDED, UNPROVIDED );
        final SubLObject tern_pred = list_utilities.alist_lookup_without_values( v_bindings, $sym72$TERN_PRED, UNPROVIDED, UNPROVIDED );
        reformulated = ConsesLow.list( tern_pred, $kw14$TERM, collection, ConsesLow.list( $const68$IntervalMinFn, value ) );
      }
    }
    if( NIL == reformulated )
    {
      thread.resetMultipleValues();
      success = formula_pattern_match.formula_matches_pattern( property, $list75 );
      v_bindings = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != success )
      {
        final SubLObject value = list_utilities.alist_lookup_without_values( v_bindings, $sym12$VALUE, UNPROVIDED, UNPROVIDED );
        final SubLObject collection = list_utilities.alist_lookup_without_values( v_bindings, $sym67$COLLECTION, UNPROVIDED, UNPROVIDED );
        final SubLObject tern_pred = list_utilities.alist_lookup_without_values( v_bindings, $sym72$TERN_PRED, UNPROVIDED, UNPROVIDED );
        reformulated = ConsesLow.list( tern_pred, $kw14$TERM, collection, ConsesLow.list( $const68$IntervalMinFn, value ) );
      }
    }
    if( NIL == reformulated )
    {
      thread.resetMultipleValues();
      success = formula_pattern_match.formula_matches_pattern( property, $list76 );
      v_bindings = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != success )
      {
        final SubLObject value = list_utilities.alist_lookup_without_values( v_bindings, $sym12$VALUE, UNPROVIDED, UNPROVIDED );
        final SubLObject collection = list_utilities.alist_lookup_without_values( v_bindings, $sym67$COLLECTION, UNPROVIDED, UNPROVIDED );
        final SubLObject bin_pred = list_utilities.alist_lookup_without_values( v_bindings, $sym64$BIN_PRED, UNPROVIDED, UNPROVIDED );
        reformulated = ConsesLow.list( $const3$relationInstanceExistsCount, bin_pred, $kw14$TERM, collection, ConsesLow.list( $const70$IntervalMaxFn, value ) );
      }
    }
    return ( NIL != reformulated ) ? reformulated : property;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17571L)
  public static SubLObject properties_to_sentences(final SubLObject v_properties, final SubLObject v_term)
  {
    SubLObject sentences = NIL;
    SubLObject cdolist_list_var = v_properties;
    SubLObject property = NIL;
    property = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      sentences = ConsesLow.cons( property_to_sentence( property, v_term ), sentences );
      cdolist_list_var = cdolist_list_var.rest();
      property = cdolist_list_var.first();
    }
    return Sequences.nreverse( sentences );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17845L)
  public static SubLObject property_to_sentence(final SubLObject property, final SubLObject v_term)
  {
    return cycl_utilities.expression_subst( v_term, $kw14$TERM, property, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17946L)
  public static SubLObject property_to_set_or_collection(final SubLObject property)
  {
    final SubLObject var = czer_utilities.unique_el_var_wrt_expression( property, $sym77$_VAR );
    final SubLObject property_sentence = property_to_sentence( property, var );
    if( NIL != formula_pattern_match.formula_matches_pattern( property_sentence, ConsesLow.listS( $const10$isa, var, $list78 ) ) )
    {
      return cycl_utilities.formula_arg2( property_sentence, UNPROVIDED );
    }
    return el_utilities.make_binary_formula( $const79$TheSetOf, var, property_sentence );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18376L)
  public static SubLObject sentences_to_properties(final SubLObject sentences, final SubLObject v_term)
  {
    SubLObject v_properties = NIL;
    SubLObject cdolist_list_var = sentences;
    SubLObject sentence = NIL;
    sentence = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      v_properties = ConsesLow.cons( sentence_to_property( sentence, v_term ), v_properties );
      cdolist_list_var = cdolist_list_var.rest();
      sentence = cdolist_list_var.first();
    }
    return Sequences.nreverse( v_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18590L)
  public static SubLObject sentence_to_property(final SubLObject sentence, final SubLObject v_term)
  {
    return cycl_utilities.expression_subst( $kw14$TERM, v_term, sentence, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18691L)
  public static SubLObject property_extent(final SubLObject property, final SubLObject mt, SubLObject query_properties)
  {
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    final SubLObject var = czer_utilities.unique_el_var_wrt_expression( property, $sym77$_VAR );
    final SubLObject sentence = property_to_sentence( property, var );
    return ask_utilities.query_variable( var, sentence, mt, query_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19070L)
  public static SubLObject property_cardinality(final SubLObject property, final SubLObject mt, SubLObject query_properties)
  {
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    final SubLObject v_set = property_to_set_or_collection( property );
    final SubLObject cardinality_var = czer_utilities.unique_el_var_wrt_expression( v_set, $sym80$_CARDINALITY );
    final SubLObject sentence = el_utilities.make_binary_formula( $const81$extentCardinality, v_set, cardinality_var );
    final SubLObject q_properties = conses_high.putf( query_properties, $kw82$RETURN, ConsesLow.list( $kw83$TEMPLATE, cardinality_var ) );
    final SubLObject answers = inference_kernel.new_cyc_query( sentence, mt, q_properties );
    return ( NIL != answers ) ? answers.first() : ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19647L)
  public static SubLObject term_has_propertyP(final SubLObject v_term, final SubLObject property, final SubLObject mt, SubLObject query_properties)
  {
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    final SubLObject property_sentence = property_to_sentence( property, v_term );
    final SubLObject query_result = inference_kernel.new_cyc_query( property_sentence, mt, query_properties );
    return cyc_kernel.closed_query_success_result_p( query_result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19928L)
  public static SubLObject asserted_gaf_properties_of_term_denot(final SubLObject v_term, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_properties = set.new_set( Symbols.symbol_function( EQUAL ), UNPROVIDED );
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final SubLObject pred_var = NIL;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, NIL, pred_var ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, NIL, pred_var );
        SubLObject done_var = NIL;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
          if( NIL != valid )
          {
            SubLObject final_index_iterator = NIL;
            try
            {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw84$GAF, $kw85$TRUE, NIL );
              SubLObject done_var_$35 = NIL;
              final SubLObject token_var_$36 = NIL;
              while ( NIL == done_var_$35)
              {
                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$36 );
                final SubLObject valid_$37 = makeBoolean( !token_var_$36.eql( gaf ) );
                if( NIL != valid_$37 && NIL == term_quoted_in_gafP( gaf, v_term, mt ) )
                {
                  final SubLObject property = sentence_to_property( assertions_high.gaf_formula( gaf ), v_term );
                  set.set_add( property, v_properties );
                }
                done_var_$35 = makeBoolean( NIL == valid_$37 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$38 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$38, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return v_properties;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20386L)
  public static SubLObject term_quoted_in_gafP(final SubLObject gaf, final SubLObject v_term, final SubLObject domain_mt)
  {
    final SubLObject pred = assertions_high.gaf_arg0( gaf );
    final SubLObject term_argnums = cycl_utilities.formula_arg_positions( gaf, v_term, UNPROVIDED );
    SubLObject quotedP = NIL;
    if( NIL == quotedP )
    {
      SubLObject csome_list_var = term_argnums;
      SubLObject term_argnum = NIL;
      term_argnum = csome_list_var.first();
      while ( NIL == quotedP && NIL != csome_list_var)
      {
        if( NIL != kb_accessors.quoted_argumentP( pred, term_argnum ) )
        {
          quotedP = T;
        }
        csome_list_var = csome_list_var.rest();
        term_argnum = csome_list_var.first();
      }
    }
    return quotedP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20792L)
  public static SubLObject find_or_create_property_types_problem_store()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject reusedP = NIL;
    if( NIL != inference_datastructures_problem_store.valid_problem_store_p( $property_types_problem_store$.getDynamicValue( thread ) ) )
    {
      if( NIL != property_types_problem_store_size_okP() )
      {
        reusedP = T;
      }
      else
      {
        inference_datastructures_problem_store.destroy_problem_store( $property_types_problem_store$.getDynamicValue( thread ) );
        $property_types_problem_store$.setDynamicValue( inference_datastructures_problem_store.new_problem_store( UNPROVIDED ), thread );
      }
      return Values.values( $property_types_problem_store$.getDynamicValue( thread ), reusedP );
    }
    return Values.values( inference_datastructures_problem_store.new_problem_store( UNPROVIDED ), reusedP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21265L)
  public static SubLObject property_types_problem_store_size_okP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Numbers.numL( inference_datastructures_problem_store.problem_store_size( $property_types_problem_store$.getDynamicValue( thread ) ), $int86$100000 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21395L)
  public static SubLObject with_property_types_problem_store_reuse(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    final SubLObject reusedP = $sym87$REUSED_;
    return ConsesLow.list( $sym88$CMULTIPLE_VALUE_BIND, ConsesLow.list( $sym89$_PROPERTY_TYPES_PROBLEM_STORE_, reusedP ), $list90, ConsesLow.list( $sym91$CUNWIND_PROTECT, reader.bq_cons( $sym92$PROGN, ConsesLow.append(
        body, NIL ) ), ConsesLow.listS( $sym93$PUNLESS, reusedP, $list94 ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21749L)
  public static SubLObject property_typeP(final SubLObject v_object)
  {
    return isa.isa_in_any_mtP( v_object, $const95$TypicalityReferenceSetPropertyTyp );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21860L)
  public static SubLObject property_types(final SubLObject property, final SubLObject mt)
  {
    final SubLObject var = $sym96$_PROPERTY_TYPE;
    SubLObject types = NIL;
    SubLObject cdolist_list_var = property_basic_properties( property );
    SubLObject query_property = NIL;
    query_property = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject query_sentence = property_type_query_sentence( query_property, var );
      final SubLObject v_properties = ConsesLow.list( new SubLObject[] { $kw82$RETURN, ConsesLow.list( $kw83$TEMPLATE, var ), $kw97$MAX_TRANSFORMATION_DEPTH, THREE_INTEGER, $kw98$MAX_NUMBER, ONE_INTEGER, $kw99$MAX_TIME,
        $int100$60, $kw101$PROBLEM_STORE, find_or_create_property_types_problem_store()
      } );
      SubLObject cdolist_list_var_$39;
      final SubLObject this_types = cdolist_list_var_$39 = inference_kernel.new_cyc_query( query_sentence, mt, v_properties );
      SubLObject this_type = NIL;
      this_type = cdolist_list_var_$39.first();
      while ( NIL != cdolist_list_var_$39)
      {
        final SubLObject item_var = this_type;
        if( NIL == conses_high.member( item_var, types, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          types = ConsesLow.cons( item_var, types );
        }
        cdolist_list_var_$39 = cdolist_list_var_$39.rest();
        this_type = cdolist_list_var_$39.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      query_property = cdolist_list_var.first();
    }
    return types;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22521L)
  public static SubLObject property_type_string(final SubLObject property_type)
  {
    final SubLObject strings = ask_utilities.ask_variable( $sym102$_STRING, ConsesLow.listS( $const103$termStrings, property_type, $list104 ), $const105$EnglishMt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != strings )
    {
      return strings.first();
    }
    return pph_main.generate_phrase( property_type, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22860L)
  public static SubLObject property_type_query_sentence(final SubLObject property, final SubLObject var)
  {
    SubLObject query_sentence = ConsesLow.list( $const106$typicalityReferenceSetPropertyTyp, property, var );
    SubLObject cdolist_list_var;
    final SubLObject unbound_vars = cdolist_list_var = obsolete.formula_free_variables( property, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject unbound_var = NIL;
    unbound_var = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      query_sentence = el_utilities.make_existential( unbound_var, query_sentence );
      cdolist_list_var = cdolist_list_var.rest();
      unbound_var = cdolist_list_var.first();
    }
    return query_sentence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23198L)
  public static SubLObject property_basic_properties(final SubLObject property)
  {
    if( NIL != unknown_property_p( property ) )
    {
      return property_basic_properties( unmake_unknown_property( property ) );
    }
    if( NIL != el_utilities.el_existential_p( property ) )
    {
      return property_basic_properties( cycl_utilities.formula_arg2( property, UNPROVIDED ) );
    }
    if( NIL != el_utilities.el_conjunction_p( property ) )
    {
      SubLObject basic_properties = NIL;
      SubLObject cdolist_list_var;
      final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( property, $kw39$IGNORE );
      SubLObject conjunct = NIL;
      conjunct = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cdolist_list_var_$40 = property_basic_properties( conjunct );
        SubLObject basic_property = NIL;
        basic_property = cdolist_list_var_$40.first();
        while ( NIL != cdolist_list_var_$40)
        {
          if( NIL != cycl_utilities.expression_find( $kw14$TERM, basic_property, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
          {
            basic_properties = ConsesLow.cons( basic_property, basic_properties );
          }
          cdolist_list_var_$40 = cdolist_list_var_$40.rest();
          basic_property = cdolist_list_var_$40.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        conjunct = cdolist_list_var.first();
      }
      return basic_properties;
    }
    if( NIL != cycl_utilities.expression_find( $kw14$TERM, property, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return ConsesLow.list( property );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23848L)
  public static SubLObject property_type_p_old(final SubLObject v_object)
  {
    return subl_promotions.memberP( v_object, $property_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23848L)
  public static SubLObject property_types_old(final SubLObject property)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    if( NIL != unknown_property_p( property ) )
    {
      return property_types_old( cycl_utilities.formula_arg1( property, UNPROVIDED ) );
    }
    if( NIL != el_utilities.el_existential_p( property ) )
    {
      ans = existential_property_types( property );
    }
    else if( NIL != existential_rmp_p( cycl_utilities.formula_arg0( property ) ) )
    {
      ans = rmp_existential_property_types( property );
    }
    else if( NIL != el_utilities.el_conjunction_p( property ) )
    {
      ans = conjunctive_property_types( property );
    }
    else if( NIL != simple_binary_property_p( property ) )
    {
      ans = simple_binary_property_types( property );
    }
    else if( NIL != el_utilities.el_ternary_formula_p( property ) )
    {
      ans = ternary_property_types( property );
    }
    else if( NIL != formula_pattern_match.formula_matches_pattern( property, $list108 ) )
    {
      ans = ConsesLow.list( $kw109$SUPER_EVENT );
    }
    else if( NIL != formula_pattern_match.formula_matches_pattern( property, $list110 ) )
    {
      ans = ConsesLow.list( $kw111$CONTACT );
    }
    else if( NIL != cycl_utilities.expression_find_if( $sym43$DATE_P, property, UNPROVIDED, UNPROVIDED ) )
    {
      ans = ConsesLow.list( $kw112$DATE );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL != ans && NIL == list_utilities.list_of_type_p( $sym113$PROPERTY_TYPE_P_OLD, ans ) )
    {
      Errors.error( $str114$_S_is_not_a_list_of_property_type, ans );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23848L)
  public static SubLObject existential_rmp_p(final SubLObject v_object)
  {
    return subl_promotions.memberP( v_object, $existential_rmps$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23848L)
  public static SubLObject simple_binary_property_p(final SubLObject property)
  {
    return formula_pattern_match.formula_matches_pattern( property, $list116 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23848L)
  public static SubLObject clear_simple_binary_property_patterns()
  {
    final SubLObject cs = $simple_binary_property_patterns_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23848L)
  public static SubLObject remove_simple_binary_property_patterns()
  {
    return memoization_state.caching_state_remove_function_results_with_args( $simple_binary_property_patterns_caching_state$.getGlobalValue(), ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23848L)
  public static SubLObject simple_binary_property_patterns_internal()
  {
    SubLObject patterns = $other_simple_binary_property_patterns$.getGlobalValue();
    SubLObject cdolist_list_var = $simple_binary_property_type_preds$.getGlobalValue();
    SubLObject cons = NIL;
    cons = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = cons;
      SubLObject pred = NIL;
      SubLObject property_type = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list120 );
      pred = current.first();
      current = ( property_type = current.rest() );
      patterns = list_utilities.alist_enter( patterns, reader.bq_cons( ConsesLow.list( $kw121$GENL_PRED, pred ), $list122 ), property_type, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      cons = cdolist_list_var.first();
    }
    return patterns;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23848L)
  public static SubLObject simple_binary_property_patterns()
  {
    SubLObject caching_state = $simple_binary_property_patterns_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym119$SIMPLE_BINARY_PROPERTY_PATTERNS, $sym123$_SIMPLE_BINARY_PROPERTY_PATTERNS_CACHING_STATE_, NIL, EQL, ZERO_INTEGER, ONE_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_get_zero_arg_results( caching_state, UNPROVIDED );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( simple_binary_property_patterns_internal() ) );
      memoization_state.caching_state_set_zero_arg_results( caching_state, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23848L)
  public static SubLObject simple_binary_property_types(final SubLObject property)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    assert NIL != simple_binary_property_p( property ) : property;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( $const125$InferencePSC );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject cdolist_list_var = simple_binary_property_patterns();
      SubLObject cons = NIL;
      cons = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = cons;
        SubLObject pattern = NIL;
        SubLObject property_type = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list126 );
        pattern = current.first();
        current = ( property_type = current.rest() );
        if( NIL != formula_pattern_match.formula_matches_pattern( property, pattern ) )
        {
          ans = ConsesLow.cons( property_type, ans );
        }
        cdolist_list_var = cdolist_list_var.rest();
        cons = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return Sequences.delete_duplicates( ans, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23848L)
  public static SubLObject ternary_property_types(final SubLObject property)
  {
    SubLObject ans = NIL;
    SubLObject cdolist_list_var = $ternary_property_patterns$.getGlobalValue();
    SubLObject cons = NIL;
    cons = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = cons;
      SubLObject pattern = NIL;
      SubLObject property_type = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list126 );
      pattern = current.first();
      current = ( property_type = current.rest() );
      if( NIL != formula_pattern_match.formula_matches_pattern( property, pattern ) )
      {
        ans = ConsesLow.cons( property_type, ans );
      }
      cdolist_list_var = cdolist_list_var.rest();
      cons = cdolist_list_var.first();
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23848L)
  public static SubLObject rmp_existential_property_types(final SubLObject property)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pattern = $list128;
    thread.resetMultipleValues();
    final SubLObject success = formula_pattern_match.formula_matches_pattern( property, pattern );
    final SubLObject v_bindings = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != success )
    {
      final SubLObject type = list_utilities.alist_lookup_without_values( v_bindings, $sym129$TYPE, UNPROVIDED, UNPROVIDED );
      final SubLObject v_term = list_utilities.alist_lookup_without_values( v_bindings, $sym130$TERM, UNPROVIDED, UNPROVIDED );
      final SubLObject pred = list_utilities.alist_lookup_without_values( v_bindings, $sym13$PRED, UNPROVIDED, UNPROVIDED );
      return property_types_old( ConsesLow.list( pred, v_term, ConsesLow.list( $const131$SomeFn, type ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23848L)
  public static SubLObject existential_property_types(final SubLObject property)
  {
    assert NIL != el_utilities.el_existential_p( property ) : property;
    SubLObject current;
    final SubLObject datum = current = cycl_utilities.formula_args( property, UNPROVIDED );
    SubLObject var = NIL;
    SubLObject v_core = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list132 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list132 );
    v_core = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject reformulated = cycl_utilities.expression_subst( $list133, var, v_core, UNPROVIDED, UNPROVIDED );
      return property_types_old( reformulated );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list132 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23848L)
  public static SubLObject conjunctive_property_types(final SubLObject property)
  {
    assert NIL != el_utilities.el_conjunction_p( property ) : property;
    SubLObject types = NIL;
    SubLObject cdolist_list_var = cycl_utilities.formula_args( property, UNPROVIDED );
    SubLObject conjunct = NIL;
    conjunct = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != collection_defns.cyc_typicality_reference_set_propertyP( conjunct ) )
      {
        types = ConsesLow.append( property_types_old( conjunct ), types );
      }
      cdolist_list_var = cdolist_list_var.rest();
      conjunct = cdolist_list_var.first();
    }
    return types;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23848L)
  public static SubLObject possible_attack_typeP(final SubLObject arg2)
  {
    if( NIL != formula_pattern_match.formula_matches_pattern( arg2, $list135 ) )
    {
      return T;
    }
    if( NIL == term.el_fort_p( arg2 ) )
    {
      return NIL;
    }
    if( NIL != attempted_possible_attack_typeP( arg2 ) || NIL != isa.isaP( arg2, $const136$AttackType, UNPROVIDED, UNPROVIDED ) || NIL != genls.genlP( arg2, $const137$AttackOnObject, UNPROVIDED, UNPROVIDED )
        || NIL != genls.genlP( arg2, $const138$HostileSocialAction, UNPROVIDED, UNPROVIDED ) || NIL != genls.genlP( arg2, $const139$KillingByOrganism, UNPROVIDED, UNPROVIDED ) || NIL != genls.genlP( arg2,
            $const140$CapturingSomething, UNPROVIDED, UNPROVIDED ) || NIL != genls.genlP( arg2, $const141$IncurringDamage, UNPROVIDED, UNPROVIDED ) || NIL != genls.genlP( arg2, $const142$ManMadeDisaster, UNPROVIDED,
                UNPROVIDED ) || NIL != genls.genlP( arg2, $const143$ObstructionEvent, UNPROVIDED, UNPROVIDED ) || NIL != genls.genlP( arg2, $const144$MilitaryEvent, UNPROVIDED, UNPROVIDED ) || NIL != genls.genlP( arg2,
                    $const145$ExposureToSubstance, UNPROVIDED, UNPROVIDED ) || NIL != genls.genlP( arg2, $const146$ActsCommonlyConsideredCriminal, UNPROVIDED, UNPROVIDED ) || NIL != genls.genlP( arg2,
                        $const147$ShootingAProjectileWeapon, UNPROVIDED, UNPROVIDED ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23848L)
  public static SubLObject attempted_possible_attack_typeP(final SubLObject arg2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    if( NIL != collection_defns.cycl_non_atomic_termP( arg2 ) )
    {
      thread.resetMultipleValues();
      final SubLObject success = formula_pattern_match.formula_matches_pattern( narts_high.nart_el_formula( arg2 ), $list148 );
      final SubLObject v_bindings = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != success )
      {
        final SubLObject act_type = list_utilities.alist_lookup_without_values( v_bindings, $sym149$ACT_TYPE, UNPROVIDED, UNPROVIDED );
        ans = possible_attack_typeP( act_type );
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 31355L)
  public static SubLObject bad_fan_out_property_p(final SubLObject property, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pred = cycl_utilities.formula_arg0( property );
    final SubLObject term_positions = cycl_utilities.arg_positions_bfs( $kw14$TERM, property, UNPROVIDED );
    SubLObject badP = NIL;
    if( NIL == badP )
    {
      final SubLObject node_var = pred;
      final SubLObject deck_type = ( $kw19$BREADTH == $kw20$DEPTH ) ? $kw21$STACK : $kw22$QUEUE;
      final SubLObject recur_deck = deck.create_deck( deck_type );
      SubLObject node_and_predicate_mode = NIL;
      final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
      try
      {
        sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
        try
        {
          final SubLObject _prev_bind_0_$41 = mt_relevance_macros.$mt$.currentBinding( thread );
          final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
          final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
          try
          {
            mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt ), thread );
            mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt ), thread );
            mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt ), thread );
            final SubLObject tv_var = $const150$True_JustificationTruth;
            final SubLObject _prev_bind_0_$42 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
            final SubLObject _prev_bind_1_$43 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
            try
            {
              sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
              sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym23$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
              if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
              {
                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                if( pcase_var.eql( $kw24$ERROR ) )
                {
                  sbhl_paranoia.sbhl_error( ONE_INTEGER, $str25$_A_is_not_a__A, tv_var, $sym26$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw27$CERROR ) )
                {
                  sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str28$continue_anyway, $str25$_A_is_not_a__A, tv_var, $sym26$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw29$WARN ) )
                {
                  Errors.warn( $str25$_A_is_not_a__A, tv_var, $sym26$SBHL_TRUE_TV_P );
                }
                else
                {
                  Errors.warn( $str30$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                  Errors.cerror( $str28$continue_anyway, $str25$_A_is_not_a__A, tv_var, $sym26$SBHL_TRUE_TV_P );
                }
              }
              final SubLObject _prev_bind_0_$43 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
              final SubLObject _prev_bind_1_$44 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
              final SubLObject _prev_bind_2_$46 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
              final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
              final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const31$genlPreds ), thread );
                sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const31$genlPreds ) ), thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const31$genlPreds ) ), thread );
                sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const31$genlPreds ), thread );
                if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( pred, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                {
                  final SubLObject _prev_bind_0_$44 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$45 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_2_$47 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_forward_search_direction(), thread );
                    sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(
                        $const31$genlPreds ) ), thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                    sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                    for( node_and_predicate_mode = ConsesLow.list( pred, sbhl_search_vars.genl_inverse_mode_p() ); NIL != node_and_predicate_mode && NIL == badP; node_and_predicate_mode = deck.deck_pop( recur_deck ) )
                    {
                      final SubLObject node_var_$50 = node_and_predicate_mode.first();
                      final SubLObject predicate_mode = conses_high.second( node_and_predicate_mode );
                      final SubLObject genl_pred = node_var_$50;
                      final SubLObject _prev_bind_0_$45 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                      try
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.bind( predicate_mode, thread );
                        if( NIL != sbhl_search_utilities.apply_sbhl_add_node_test( sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$50 ) )
                        {
                          final SubLObject fan_out_arg = kb_accessors.asserted_fan_out_arg( genl_pred, mt );
                          if( fan_out_arg.isInteger() && NIL == subl_promotions.memberP( ConsesLow.list( fan_out_arg ), term_positions, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
                          {
                            badP = T;
                          }
                          if( NIL == badP )
                          {
                            SubLObject csome_list_var = kb_mapping_utilities.pred_values_in_mt( genl_pred, $const151$functionalInArgs, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                            SubLObject functional_arg = NIL;
                            functional_arg = csome_list_var.first();
                            while ( NIL == badP && NIL != csome_list_var)
                            {
                              if( NIL != subl_promotions.memberP( ConsesLow.list( functional_arg ), term_positions, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
                              {
                                badP = T;
                              }
                              csome_list_var = csome_list_var.rest();
                              functional_arg = csome_list_var.first();
                            }
                          }
                        }
                        final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const31$genlPreds ) );
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
                        for( rest = NIL, rest = accessible_modules; NIL == badP && NIL != rest; rest = rest.rest() )
                        {
                          module_var = rest.first();
                          _prev_bind_0_$46 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                          _prev_bind_1_$46 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                          try
                          {
                            sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                            sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                            node = function_terms.naut_to_nart( node_var_$50 );
                            if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                            {
                              d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != d_link )
                              {
                                mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != mt_links )
                                {
                                  for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == badP && NIL == dictionary_contents
                                      .do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                  {
                                    thread.resetMultipleValues();
                                    mt_$54 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                    tv_links = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if( NIL != mt_relevance_macros.relevant_mtP( mt_$54 ) )
                                    {
                                      _prev_bind_0_$47 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.bind( mt_$54, thread );
                                        for( iteration_state_$56 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == badP && NIL == dictionary_contents
                                            .do_dictionary_contents_doneP( iteration_state_$56 ); iteration_state_$56 = dictionary_contents.do_dictionary_contents_next( iteration_state_$56 ) )
                                        {
                                          thread.resetMultipleValues();
                                          tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$56 );
                                          link_nodes = thread.secondMultipleValue();
                                          thread.resetMultipleValues();
                                          if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                          {
                                            _prev_bind_0_$48 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                              sol = link_nodes;
                                              if( NIL != set.set_p( sol ) )
                                              {
                                                set_contents_var = set.do_set_internal( sol );
                                                for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                    set_contents_var ); NIL == badP && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                {
                                                  node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                                  if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                      UNPROVIDED ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                    deck.deck_push( ConsesLow.list( node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                                  }
                                                }
                                              }
                                              else if( sol.isList() )
                                              {
                                                if( NIL == badP )
                                                {
                                                  csome_list_var2 = sol;
                                                  node_vars_link_node2 = NIL;
                                                  node_vars_link_node2 = csome_list_var2.first();
                                                  while ( NIL == badP && NIL != csome_list_var2)
                                                  {
                                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                      deck.deck_push( ConsesLow.list( node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                                    }
                                                    csome_list_var2 = csome_list_var2.rest();
                                                    node_vars_link_node2 = csome_list_var2.first();
                                                  }
                                                }
                                              }
                                              else
                                              {
                                                Errors.error( $str32$_A_is_neither_SET_P_nor_LISTP_, sol );
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$48, thread );
                                            }
                                          }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize( iteration_state_$56 );
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$47, thread );
                                      }
                                    }
                                  }
                                  dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                }
                              }
                              else
                              {
                                sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str33$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                              }
                            }
                            else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                            {
                              new_list = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars
                                  .get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                  : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                      .get_sbhl_module( UNPROVIDED ) ) );
                              for( rest_$58 = NIL, rest_$58 = new_list; NIL == badP && NIL != rest_$58; rest_$58 = rest_$58.rest() )
                              {
                                generating_fn = rest_$58.first();
                                _prev_bind_0_$49 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                try
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                  link_nodes2 = ( sol2 = Functions.funcall( generating_fn, node ) );
                                  if( NIL != set.set_p( sol2 ) )
                                  {
                                    set_contents_var2 = set.do_set_internal( sol2 );
                                    for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                        set_contents_var2 ); NIL == badP && NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                    {
                                      node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                      if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                          UNPROVIDED ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                        deck.deck_push( ConsesLow.list( node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                      }
                                    }
                                  }
                                  else if( sol2.isList() )
                                  {
                                    if( NIL == badP )
                                    {
                                      csome_list_var3 = sol2;
                                      node_vars_link_node4 = NIL;
                                      node_vars_link_node4 = csome_list_var3.first();
                                      while ( NIL == badP && NIL != csome_list_var3)
                                      {
                                        if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                        {
                                          sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                          deck.deck_push( ConsesLow.list( node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                        }
                                        csome_list_var3 = csome_list_var3.rest();
                                        node_vars_link_node4 = csome_list_var3.first();
                                      }
                                    }
                                  }
                                  else
                                  {
                                    Errors.error( $str32$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                  }
                                }
                                finally
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$49, thread );
                                }
                              }
                            }
                          }
                          finally
                          {
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$46, thread );
                            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$46, thread );
                          }
                        }
                      }
                      finally
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_0_$45, thread );
                      }
                    }
                  }
                  finally
                  {
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$47, thread );
                    sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$45, thread );
                    sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$44, thread );
                  }
                }
                else
                {
                  sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str34$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED, UNPROVIDED,
                      UNPROVIDED );
                }
              }
              finally
              {
                sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_2_$46, thread );
                sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$44, thread );
                sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$43, thread );
              }
            }
            finally
            {
              sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$43, thread );
              sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$42, thread );
            }
          }
          finally
          {
            mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
            mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
            mt_relevance_macros.$mt$.rebind( _prev_bind_0_$41, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$50 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$50, thread );
          }
        }
      }
      finally
      {
        sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0, thread );
      }
    }
    return badP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 32108L)
  public static SubLObject make_unknown_property(final SubLObject property)
  {
    return el_utilities.make_unary_formula( $const152$unknownSentence, property );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 32217L)
  public static SubLObject unmake_unknown_property(final SubLObject property)
  {
    return cycl_utilities.formula_arg1( property, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 32304L)
  public static SubLObject unknown_property_p(final SubLObject property)
  {
    return formula_pattern_match.formula_matches_pattern( property, $list153 );
  }

  public static SubLObject declare_properties_file()
  {
    SubLFiles.declareFunction( me, "genl_propertyP", "GENL-PROPERTY?", 3, 1, false );
    SubLFiles.declareFunction( me, "more_general_properties", "MORE-GENERAL-PROPERTIES", 2, 1, false );
    SubLFiles.declareFunction( me, "add_existential_more_general_properties", "ADD-EXISTENTIAL-MORE-GENERAL-PROPERTIES", 3, 0, false );
    SubLFiles.declareFunction( me, "add_other_more_general_properties", "ADD-OTHER-MORE-GENERAL-PROPERTIES", 4, 0, false );
    SubLFiles.declareFunction( me, "add_instance_named_fn_properties", "ADD-INSTANCE-NAMED-FN-PROPERTIES", 4, 0, false );
    SubLFiles.declareFunction( me, "add_genl_preds_properties", "ADD-GENL-PREDS-PROPERTIES", 4, 0, false );
    SubLFiles.declareFunction( me, "add_genls_properties", "ADD-GENLS-PROPERTIES", 3, 0, false );
    SubLFiles.declareFunction( me, "add_less_constrained_existential_properties", "ADD-LESS-CONSTRAINED-EXISTENTIAL-PROPERTIES", 4, 0, false );
    SubLFiles.declareFunction( me, "note_more_specific_property", "NOTE-MORE-SPECIFIC-PROPERTY", 3, 0, false );
    SubLFiles.declareFunction( me, "instance_named_fn_nat_p", "INSTANCE-NAMED-FN-NAT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "number_comparison_clauses", "NUMBER-COMPARISON-CLAUSES", 1, 0, false );
    SubLFiles.declareFunction( me, "subsuming_dates", "SUBSUMING-DATES", 1, 0, false );
    SubLFiles.declareFunction( me, "bigger_places", "BIGGER-PLACES", 2, 0, false );
    SubLFiles.declareFunction( me, "place_too_bigP", "PLACE-TOO-BIG?", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_too_big_places", "CLEAR-TOO-BIG-PLACES", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_too_big_places", "REMOVE-TOO-BIG-PLACES", 0, 0, false );
    SubLFiles.declareFunction( me, "too_big_places_internal", "TOO-BIG-PLACES-INTERNAL", 0, 0, false );
    SubLFiles.declareFunction( me, "too_big_places", "TOO-BIG-PLACES", 0, 0, false );
    SubLFiles.declareFunction( me, "place_types", "PLACE-TYPES", 1, 0, false );
    SubLFiles.declareFunction( me, "reformulate_property_for_paraphrase", "REFORMULATE-PROPERTY-FOR-PARAPHRASE", 1, 0, false );
    SubLFiles.declareFunction( me, "properties_to_sentences", "PROPERTIES-TO-SENTENCES", 2, 0, false );
    SubLFiles.declareFunction( me, "property_to_sentence", "PROPERTY-TO-SENTENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "property_to_set_or_collection", "PROPERTY-TO-SET-OR-COLLECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "sentences_to_properties", "SENTENCES-TO-PROPERTIES", 2, 0, false );
    SubLFiles.declareFunction( me, "sentence_to_property", "SENTENCE-TO-PROPERTY", 2, 0, false );
    SubLFiles.declareFunction( me, "property_extent", "PROPERTY-EXTENT", 2, 1, false );
    SubLFiles.declareFunction( me, "property_cardinality", "PROPERTY-CARDINALITY", 2, 1, false );
    SubLFiles.declareFunction( me, "term_has_propertyP", "TERM-HAS-PROPERTY?", 3, 1, false );
    SubLFiles.declareFunction( me, "asserted_gaf_properties_of_term_denot", "ASSERTED-GAF-PROPERTIES-OF-TERM-DENOT", 2, 0, false );
    SubLFiles.declareFunction( me, "term_quoted_in_gafP", "TERM-QUOTED-IN-GAF?", 3, 0, false );
    SubLFiles.declareFunction( me, "find_or_create_property_types_problem_store", "FIND-OR-CREATE-PROPERTY-TYPES-PROBLEM-STORE", 0, 0, false );
    SubLFiles.declareFunction( me, "property_types_problem_store_size_okP", "PROPERTY-TYPES-PROBLEM-STORE-SIZE-OK?", 0, 0, false );
    SubLFiles.declareMacro( me, "with_property_types_problem_store_reuse", "WITH-PROPERTY-TYPES-PROBLEM-STORE-REUSE" );
    SubLFiles.declareFunction( me, "property_typeP", "PROPERTY-TYPE?", 1, 0, false );
    SubLFiles.declareFunction( me, "property_types", "PROPERTY-TYPES", 2, 0, false );
    SubLFiles.declareFunction( me, "property_type_string", "PROPERTY-TYPE-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "property_type_query_sentence", "PROPERTY-TYPE-QUERY-SENTENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "property_basic_properties", "PROPERTY-BASIC-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "property_type_p_old", "PROPERTY-TYPE-P-OLD", 1, 0, false );
    SubLFiles.declareFunction( me, "property_types_old", "PROPERTY-TYPES-OLD", 1, 0, false );
    SubLFiles.declareFunction( me, "existential_rmp_p", "EXISTENTIAL-RMP-P", 1, 0, false );
    SubLFiles.declareFunction( me, "simple_binary_property_p", "SIMPLE-BINARY-PROPERTY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_simple_binary_property_patterns", "CLEAR-SIMPLE-BINARY-PROPERTY-PATTERNS", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_simple_binary_property_patterns", "REMOVE-SIMPLE-BINARY-PROPERTY-PATTERNS", 0, 0, false );
    SubLFiles.declareFunction( me, "simple_binary_property_patterns_internal", "SIMPLE-BINARY-PROPERTY-PATTERNS-INTERNAL", 0, 0, false );
    SubLFiles.declareFunction( me, "simple_binary_property_patterns", "SIMPLE-BINARY-PROPERTY-PATTERNS", 0, 0, false );
    SubLFiles.declareFunction( me, "simple_binary_property_types", "SIMPLE-BINARY-PROPERTY-TYPES", 1, 0, false );
    SubLFiles.declareFunction( me, "ternary_property_types", "TERNARY-PROPERTY-TYPES", 1, 0, false );
    SubLFiles.declareFunction( me, "rmp_existential_property_types", "RMP-EXISTENTIAL-PROPERTY-TYPES", 1, 0, false );
    SubLFiles.declareFunction( me, "existential_property_types", "EXISTENTIAL-PROPERTY-TYPES", 1, 0, false );
    SubLFiles.declareFunction( me, "conjunctive_property_types", "CONJUNCTIVE-PROPERTY-TYPES", 1, 0, false );
    SubLFiles.declareFunction( me, "possible_attack_typeP", "POSSIBLE-ATTACK-TYPE?", 1, 0, false );
    SubLFiles.declareFunction( me, "attempted_possible_attack_typeP", "ATTEMPTED-POSSIBLE-ATTACK-TYPE?", 1, 0, false );
    SubLFiles.declareFunction( me, "bad_fan_out_property_p", "BAD-FAN-OUT-PROPERTY-P", 2, 0, false );
    SubLFiles.declareFunction( me, "make_unknown_property", "MAKE-UNKNOWN-PROPERTY", 1, 0, false );
    SubLFiles.declareFunction( me, "unmake_unknown_property", "UNMAKE-UNKNOWN-PROPERTY", 1, 0, false );
    SubLFiles.declareFunction( me, "unknown_property_p", "UNKNOWN-PROPERTY-P", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_properties_file()
  {
    $too_big_places_caching_state$ = SubLFiles.deflexical( "*TOO-BIG-PLACES-CACHING-STATE*", NIL );
    $property_types_problem_store$ = SubLFiles.defparameter( "*PROPERTY-TYPES-PROBLEM-STORE*", NIL );
    $property_types$ = SubLFiles.deflexical( "*PROPERTY-TYPES*", $list107 );
    $existential_rmps$ = SubLFiles.deflexical( "*EXISTENTIAL-RMPS*", $list115 );
    $simple_binary_property_type_preds$ = SubLFiles.deflexical( "*SIMPLE-BINARY-PROPERTY-TYPE-PREDS*", $list117 );
    $other_simple_binary_property_patterns$ = SubLFiles.deflexical( "*OTHER-SIMPLE-BINARY-PROPERTY-PATTERNS*", $list118 );
    $simple_binary_property_patterns_caching_state$ = SubLFiles.deflexical( "*SIMPLE-BINARY-PROPERTY-PATTERNS-CACHING-STATE*", NIL );
    $ternary_property_patterns$ = SubLFiles.deflexical( "*TERNARY-PROPERTY-PATTERNS*", $list127 );
    return NIL;
  }

  public static SubLObject setup_properties_file()
  {
    memoization_state.note_globally_cached_function( $sym59$TOO_BIG_PLACES );
    memoization_state.note_globally_cached_function( $sym119$SIMPLE_BINARY_PROPERTY_PATTERNS );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_properties_file();
  }

  @Override
  public void initializeVariables()
  {
    init_properties_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_properties_file();
  }
  static
  {
    me = new properties();
    $too_big_places_caching_state$ = null;
    $property_types_problem_store$ = null;
    $property_types$ = null;
    $existential_rmps$ = null;
    $simple_binary_property_type_preds$ = null;
    $other_simple_binary_property_patterns$ = null;
    $simple_binary_property_patterns_caching_state$ = null;
    $ternary_property_patterns$ = null;
    $kw0$CONDITIONAL_SENTENCE_ = makeKeyword( "CONDITIONAL-SENTENCE?" );
    $sym1$_TERM = makeSymbol( "?TERM" );
    $list2 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "injuryCount" ) ), constant_handles.reader_make_constant_shell( makeString( "deathToll" ) ), constant_handles
        .reader_make_constant_shell( makeString( "casualtyCount" ) ), constant_handles.reader_make_constant_shell( makeString( "numberOfHostagesTaken" ) ), constant_handles.reader_make_constant_shell( makeString(
            "relationInstanceExistsCount" ) ) );
    $const3$relationInstanceExistsCount = constant_handles.reader_make_constant_shell( makeString( "relationInstanceExistsCount" ) );
    $const4$relationInstanceExists = constant_handles.reader_make_constant_shell( makeString( "relationInstanceExists" ) );
    $const5$dateOfEvent = constant_handles.reader_make_constant_shell( makeString( "dateOfEvent" ) );
    $sym6$_VALUE = makeSymbol( "?VALUE" );
    $const7$temporallySubsumes = constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes" ) );
    $const8$situationLocation = constant_handles.reader_make_constant_shell( makeString( "situationLocation" ) );
    $const9$geographicalSubRegions = constant_handles.reader_make_constant_shell( makeString( "geographicalSubRegions" ) );
    $const10$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $list11 = ConsesLow.list( ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "PRED" ) ), makeKeyword( "TERM" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "VALUE" ) ) );
    $sym12$VALUE = makeSymbol( "VALUE" );
    $sym13$PRED = makeSymbol( "PRED" );
    $kw14$TERM = makeKeyword( "TERM" );
    $list15 = ConsesLow.list( ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "PRED" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "VALUE" ) ), makeKeyword( "TERM" ) );
    $list16 = ConsesLow.list( makeKeyword( "TERM" ) );
    $sym17$INSTANCE_NAMED_FN_NAT_P = makeSymbol( "INSTANCE-NAMED-FN-NAT-P" );
    $int18$150000 = makeInteger( 150000 );
    $kw19$BREADTH = makeKeyword( "BREADTH" );
    $kw20$DEPTH = makeKeyword( "DEPTH" );
    $kw21$STACK = makeKeyword( "STACK" );
    $kw22$QUEUE = makeKeyword( "QUEUE" );
    $sym23$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol( "RELEVANT-SBHL-TV-IS-GENERAL-TV" );
    $kw24$ERROR = makeKeyword( "ERROR" );
    $str25$_A_is_not_a__A = makeString( "~A is not a ~A" );
    $sym26$SBHL_TRUE_TV_P = makeSymbol( "SBHL-TRUE-TV-P" );
    $kw27$CERROR = makeKeyword( "CERROR" );
    $str28$continue_anyway = makeString( "continue anyway" );
    $kw29$WARN = makeKeyword( "WARN" );
    $str30$_A_is_not_a_valid__sbhl_type_erro = makeString( "~A is not a valid *sbhl-type-error-action* value" );
    $const31$genlPreds = constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) );
    $str32$_A_is_neither_SET_P_nor_LISTP_ = makeString( "~A is neither SET-P nor LISTP." );
    $str33$attempting_to_bind_direction_link = makeString( "attempting to bind direction link variable, to NIL. macro body not executed." );
    $str34$Node__a_does_not_pass_sbhl_type_t = makeString( "Node ~a does not pass sbhl-type-test ~a~%" );
    $list35 = ConsesLow.list( makeKeyword( "FORT" ), makeKeyword( "TERM" ), makeKeyword( "FORT" ) );
    $const36$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $sym37$EL_EXISTENTIAL_P = makeSymbol( "EL-EXISTENTIAL-P" );
    $list38 = ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "BODY" ) );
    $kw39$IGNORE = makeKeyword( "IGNORE" );
    $const40$InstanceNamedFn = constant_handles.reader_make_constant_shell( makeString( "InstanceNamedFn" ) );
    $sym41$INTEGERP = makeSymbol( "INTEGERP" );
    $const42$greaterThanOrEqualTo = constant_handles.reader_make_constant_shell( makeString( "greaterThanOrEqualTo" ) );
    $sym43$DATE_P = makeSymbol( "DATE-P" );
    $const44$CityNamedFn = constant_handles.reader_make_constant_shell( makeString( "CityNamedFn" ) );
    $const45$TerritoryFn = constant_handles.reader_make_constant_shell( makeString( "TerritoryFn" ) );
    $const46$City = constant_handles.reader_make_constant_shell( makeString( "City" ) );
    $sym47$_COUNTRY = makeSymbol( "?COUNTRY" );
    $const48$countryOfCity = constant_handles.reader_make_constant_shell( makeString( "countryOfCity" ) );
    $const49$GeographicalAgent = constant_handles.reader_make_constant_shell( makeString( "GeographicalAgent" ) );
    $const50$GeographicalRegion = constant_handles.reader_make_constant_shell( makeString( "GeographicalRegion" ) );
    $sym51$_TERRITORY = makeSymbol( "?TERRITORY" );
    $const52$territoryOf = constant_handles.reader_make_constant_shell( makeString( "territoryOf" ) );
    $list53 = ConsesLow.list( makeSymbol( "?TERRITORY" ) );
    $sym54$_BIG = makeSymbol( "?BIG" );
    $sym55$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const56$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $sym57$PLACE_TOO_BIG_ = makeSymbol( "PLACE-TOO-BIG?" );
    $str58$Couldn_t_find_bigger_places_for__ = makeString( "Couldn't find bigger places for ~S" );
    $sym59$TOO_BIG_PLACES = makeSymbol( "TOO-BIG-PLACES" );
    $list60 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Planet" ) ), constant_handles.reader_make_constant_shell( makeString( "GeographicalHemisphere" ) ), constant_handles
        .reader_make_constant_shell( makeString( "Continent" ) ) );
    $sym61$_TOO_BIG_PLACES_CACHING_STATE_ = makeSymbol( "*TOO-BIG-PLACES-CACHING-STATE*" );
    $list62 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "thereExists" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ),
        ConsesLow.list( ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "BIN-PRED" ) ), makeKeyword( "TERM" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "EL-VAR?" ) ) ), ConsesLow.list( ConsesLow.list(
            makeKeyword( "BIND" ), makeSymbol( "TRANS-PRED" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "VALUE" ) ), makeKeyword( "ANYTHING" ) ) ) );
    $sym63$TRANS_PRED = makeSymbol( "TRANS-PRED" );
    $sym64$BIN_PRED = makeSymbol( "BIN-PRED" );
    $list65 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "thereExists" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ),
        ConsesLow.list( ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TRANS-PRED" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "VALUE" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( ConsesLow.list(
            makeKeyword( "BIND" ), makeSymbol( "BIN-PRED" ) ), makeKeyword( "TERM" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "EL-VAR?" ) ) ) ) );
    $list66 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "thereExists" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ),
        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "greaterThanOrEqualTo" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "EL-VAR?" ) ), ConsesLow.list( makeKeyword( "BIND" ),
            makeSymbol( "VALUE" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "relationInstanceExistsCount" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "BIN-PRED" ) ),
                makeKeyword( "TERM" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "COLLECTION" ) ), makeKeyword( "ANYTHING" ) ) ) );
    $sym67$COLLECTION = makeSymbol( "COLLECTION" );
    $const68$IntervalMinFn = constant_handles.reader_make_constant_shell( makeString( "IntervalMinFn" ) );
    $list69 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "thereExists" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ),
        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "greaterThanOrEqualTo" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "VALUE" ) ), ConsesLow.list( makeKeyword( "TEST" ),
            makeSymbol( "EL-VAR?" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "relationInstanceExistsCount" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "BIN-PRED" ) ),
                makeKeyword( "TERM" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "COLLECTION" ) ), makeKeyword( "ANYTHING" ) ) ) );
    $const70$IntervalMaxFn = constant_handles.reader_make_constant_shell( makeString( "IntervalMaxFn" ) );
    $list71 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "thereExists" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ),
        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "greaterThanOrEqualTo" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "VALUE" ) ), ConsesLow.list( makeKeyword( "TEST" ),
            makeSymbol( "EL-VAR?" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TERN-PRED" ) ), makeKeyword( "TERM" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "COLLECTION" ) ),
                makeKeyword( "ANYTHING" ) ) ) );
    $sym72$TERN_PRED = makeSymbol( "TERN-PRED" );
    $list73 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "thereExists" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ),
        ConsesLow.list( ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TERN-PRED" ) ), makeKeyword( "TERM" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "COLLECTION" ) ), makeKeyword( "ANYTHING" ) ),
        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "greaterThanOrEqualTo" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "VALUE" ) ), ConsesLow.list( makeKeyword( "TEST" ),
            makeSymbol( "EL-VAR?" ) ) ) ) );
    $list74 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "thereExists" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ),
        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "greaterThanOrEqualTo" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "EL-VAR?" ) ), ConsesLow.list( makeKeyword( "BIND" ),
            makeSymbol( "VALUE" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TERN-PRED" ) ), makeKeyword( "TERM" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "COLLECTION" ) ),
                makeKeyword( "ANYTHING" ) ) ) );
    $list75 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "thereExists" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ),
        ConsesLow.list( ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TERN-PRED" ) ), makeKeyword( "TERM" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "COLLECTION" ) ), makeKeyword( "ANYTHING" ) ),
        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "greaterThanOrEqualTo" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "EL-VAR?" ) ), ConsesLow.list( makeKeyword( "BIND" ),
            makeSymbol( "VALUE" ) ) ) ) );
    $list76 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "thereExists" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ),
        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "relationInstanceExistsCount" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "BIN-PRED" ) ), makeKeyword( "TERM" ), ConsesLow
            .list( makeKeyword( "BIND" ), makeSymbol( "COLLECTION" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "greaterThanOrEqualTo" ) ), ConsesLow.list(
                makeKeyword( "BIND" ), makeSymbol( "VALUE" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "EL-VAR?" ) ) ) ) );
    $sym77$_VAR = makeSymbol( "?VAR" );
    $list78 = ConsesLow.list( makeKeyword( "ANYTHING" ) );
    $const79$TheSetOf = constant_handles.reader_make_constant_shell( makeString( "TheSetOf" ) );
    $sym80$_CARDINALITY = makeSymbol( "?CARDINALITY" );
    $const81$extentCardinality = constant_handles.reader_make_constant_shell( makeString( "extentCardinality" ) );
    $kw82$RETURN = makeKeyword( "RETURN" );
    $kw83$TEMPLATE = makeKeyword( "TEMPLATE" );
    $kw84$GAF = makeKeyword( "GAF" );
    $kw85$TRUE = makeKeyword( "TRUE" );
    $int86$100000 = makeInteger( 100000 );
    $sym87$REUSED_ = makeUninternedSymbol( "REUSED?" );
    $sym88$CMULTIPLE_VALUE_BIND = makeSymbol( "CMULTIPLE-VALUE-BIND" );
    $sym89$_PROPERTY_TYPES_PROBLEM_STORE_ = makeSymbol( "*PROPERTY-TYPES-PROBLEM-STORE*" );
    $list90 = ConsesLow.list( makeSymbol( "FIND-OR-CREATE-PROPERTY-TYPES-PROBLEM-STORE" ) );
    $sym91$CUNWIND_PROTECT = makeSymbol( "CUNWIND-PROTECT" );
    $sym92$PROGN = makeSymbol( "PROGN" );
    $sym93$PUNLESS = makeSymbol( "PUNLESS" );
    $list94 = ConsesLow.list( ConsesLow.list( makeSymbol( "DESTROY-PROBLEM-STORE" ), makeSymbol( "*PROPERTY-TYPES-PROBLEM-STORE*" ) ) );
    $const95$TypicalityReferenceSetPropertyTyp = constant_handles.reader_make_constant_shell( makeString( "TypicalityReferenceSetPropertyType" ) );
    $sym96$_PROPERTY_TYPE = makeSymbol( "?PROPERTY-TYPE" );
    $kw97$MAX_TRANSFORMATION_DEPTH = makeKeyword( "MAX-TRANSFORMATION-DEPTH" );
    $kw98$MAX_NUMBER = makeKeyword( "MAX-NUMBER" );
    $kw99$MAX_TIME = makeKeyword( "MAX-TIME" );
    $int100$60 = makeInteger( 60 );
    $kw101$PROBLEM_STORE = makeKeyword( "PROBLEM-STORE" );
    $sym102$_STRING = makeSymbol( "?STRING" );
    $const103$termStrings = constant_handles.reader_make_constant_shell( makeString( "termStrings" ) );
    $list104 = ConsesLow.list( makeSymbol( "?STRING" ) );
    $const105$EnglishMt = constant_handles.reader_make_constant_shell( makeString( "EnglishMt" ) );
    $const106$typicalityReferenceSetPropertyTyp = constant_handles.reader_make_constant_shell( makeString( "typicalityReferenceSetPropertyTypes" ) );
    $list107 = ConsesLow.list( new SubLObject[] { makeKeyword( "DATE" ), makeKeyword( "LOCATION" ), makeKeyword( "PERPETRATOR" ), makeKeyword( "ATTACK-TYPE" ), makeKeyword( "TARGET" ), makeKeyword( "INHABITANTS" ),
      makeKeyword( "ECONOMY" ), makeKeyword( "RELIGION" ), makeKeyword( "CONTROL" ), makeKeyword( "CAPABILITIES" ), makeKeyword( "PERSONAL" ), makeKeyword( "CONTACT" ), makeKeyword( "LANGUAGE" ), makeKeyword(
          "SUB-EVENT" ), makeKeyword( "SUPER-EVENT" ), makeKeyword( "MOTIVATION" )
    } );
    $list108 = ConsesLow.list( ConsesLow.list( makeKeyword( "GENL-PRED" ), constant_handles.reader_make_constant_shell( makeString( "subEvents" ) ) ), makeKeyword( "ANYTHING" ), makeKeyword( "TERM" ) );
    $kw109$SUPER_EVENT = makeKeyword( "SUPER-EVENT" );
    $list110 = ConsesLow.listS( constant_handles.reader_make_constant_shell( makeString( "pointOfContactInfo" ) ), makeKeyword( "TERM" ), makeKeyword( "ANYTHING" ) );
    $kw111$CONTACT = makeKeyword( "CONTACT" );
    $kw112$DATE = makeKeyword( "DATE" );
    $sym113$PROPERTY_TYPE_P_OLD = makeSymbol( "PROPERTY-TYPE-P-OLD" );
    $str114$_S_is_not_a_list_of_property_type = makeString( "~S is not a list of property types." );
    $list115 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "relationInstanceExistsCount" ) ), constant_handles.reader_make_constant_shell( makeString( "relationInstanceExists" ) ),
        constant_handles.reader_make_constant_shell( makeString( "relationInstanceExistsRange" ) ), constant_handles.reader_make_constant_shell( makeString( "relationInstanceExistsMany" ) ), constant_handles
            .reader_make_constant_shell( makeString( "relationInstanceExistsMax" ) ), constant_handles.reader_make_constant_shell( makeString( "relationInstanceExistsMin" ) ), constant_handles.reader_make_constant_shell(
                makeString( "num-GenQuantRelnFrom" ) ) );
    $list116 = ConsesLow.list( makeKeyword( "FORT" ), makeKeyword( "TERM" ), makeKeyword( "ANYTHING" ) );
    $list117 = ConsesLow.list( new SubLObject[] { ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "startingDate" ) ), makeKeyword( "DATE" ) ), ConsesLow.cons( constant_handles
        .reader_make_constant_shell( makeString( "endingDate" ) ), makeKeyword( "DATE" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "age" ) ), makeKeyword( "DATE" ) ), ConsesLow.cons(
            constant_handles.reader_make_constant_shell( makeString( "situationLocation" ) ), makeKeyword( "LOCATION" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString(
                "eventPartiallyOccursAt" ) ), makeKeyword( "LOCATION" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "politiesBorderEachOther" ) ), makeKeyword( "LOCATION" ) ), ConsesLow
                    .cons( constant_handles.reader_make_constant_shell( makeString( "comesFrom-Generic" ) ), makeKeyword( "LOCATION" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString(
                        "subEvents" ) ), makeKeyword( "SUB-EVENT" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "perpetrator" ) ), makeKeyword( "PERPETRATOR" ) ), ConsesLow.cons(
                            constant_handles.reader_make_constant_shell( makeString( "directingAgent" ) ), makeKeyword( "PERPETRATOR" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString(
                                "eventPlannedBy" ) ), makeKeyword( "PERPETRATOR" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "inReactionTo" ) ), makeKeyword( "MOTIVATION" ) ), ConsesLow
                                    .cons( constant_handles.reader_make_constant_shell( makeString( "imports" ) ), makeKeyword( "ECONOMY" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString(
                                        "regionProduces" ) ), makeKeyword( "ECONOMY" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "inhabitantTypes" ) ), makeKeyword( "INHABITANTS" ) ),
      ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "residentsOfRegion" ) ), makeKeyword( "INHABITANTS" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString(
          "religionOfRule" ) ), makeKeyword( "RELIGION" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "cultureReligions" ) ), makeKeyword( "RELIGION" ) ), ConsesLow.cons( constant_handles
              .reader_make_constant_shell( makeString( "majorReligions" ) ), makeKeyword( "RELIGION" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "minorReligions" ) ), makeKeyword(
                  "RELIGION" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "ableToControl" ) ), makeKeyword( "CONTROL" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell(
                      makeString( "owns" ) ), makeKeyword( "CONTROL" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "personalFeatures" ) ), makeKeyword( "PERSONAL" ) ), ConsesLow.cons(
                          constant_handles.reader_make_constant_shell( makeString( "likes-Generic" ) ), makeKeyword( "PERSONAL" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString(
                              "eatsWillingly" ) ), makeKeyword( "PERSONAL" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "relatives" ) ), makeKeyword( "PERSONAL" ) ), ConsesLow.cons(
                                  constant_handles.reader_make_constant_shell( makeString( "acquaintedWith" ) ), makeKeyword( "PERSONAL" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString(
                                      "eMailAddressText" ) ), makeKeyword( "CONTACT" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "programsIn" ) ), makeKeyword( "CAPABILITIES" ) ),
      ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "educationLevel" ) ), makeKeyword( "CAPABILITIES" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString(
          "fieldsOfCompetence" ) ), makeKeyword( "CAPABILITIES" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "languagesSpokenHere" ) ), makeKeyword( "LANGUAGE" ) ), ConsesLow.cons(
              constant_handles.reader_make_constant_shell( makeString( "languageSpoken" ) ), makeKeyword( "LANGUAGE" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "organismKilled" ) ),
                  makeKeyword( "TARGET" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "thingHarmed" ) ), makeKeyword( "TARGET" ) ), ConsesLow.cons( constant_handles
                      .reader_make_constant_shell( makeString( "instrumentalRole" ) ), makeKeyword( "ATTACK-TYPE" ) )
    } );
    $list118 = ConsesLow.list( ConsesLow.cons( ConsesLow.list( ConsesLow.list( makeKeyword( "OR" ), ConsesLow.list( makeKeyword( "GENL-PRED" ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ) ),
        ConsesLow.list( makeKeyword( "SPEC-PRED" ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ) ) ), makeKeyword( "TERM" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
            "POSSIBLE-ATTACK-TYPE?" ) ) ), makeKeyword( "ATTACK-TYPE" ) ), ConsesLow.cons( ConsesLow.list( ConsesLow.list( makeKeyword( "GENL-PRED" ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ) ),
                makeKeyword( "TERM" ), ConsesLow.list( makeKeyword( "OR" ), ConsesLow.list( makeKeyword( "GENLS" ), constant_handles.reader_make_constant_shell( makeString( "Graduate" ) ) ), ConsesLow.list( makeKeyword(
                    "ISA" ), constant_handles.reader_make_constant_shell( makeString( "PersonTypeByEducationLevel" ) ) ) ) ), makeKeyword( "CAPABILITIES" ) ), ConsesLow.cons( ConsesLow.list( ConsesLow.list( makeKeyword(
                        "GENL-PRED" ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ) ), makeKeyword( "TERM" ), ConsesLow.list( makeKeyword( "ISA" ), constant_handles.reader_make_constant_shell(
                            makeString( "PersonTypeByCulture" ) ) ) ), makeKeyword( "PERSONAL" ) ), ConsesLow.cons( ConsesLow.list( ConsesLow.list( makeKeyword( "SPEC-PRED" ), constant_handles.reader_make_constant_shell(
                                makeString( "perpetrator" ) ) ), makeKeyword( "TERM" ), makeKeyword( "ANYTHING" ) ), makeKeyword( "PERPETRATOR" ) ), ConsesLow.cons( ConsesLow.list( ConsesLow.list( makeKeyword( "OR" ),
                                    constant_handles.reader_make_constant_shell( makeString( "occursDuring" ) ), constant_handles.reader_make_constant_shell( makeString( "temporallyIntersects" ) ) ), makeKeyword(
                                        "TERM" ), makeKeyword( "ANYTHING" ) ), makeKeyword( "DATE" ) ), ConsesLow.cons( ConsesLow.list( ConsesLow.list( makeKeyword( "OR" ), constant_handles.reader_make_constant_shell(
                                            makeString( "intendedAttackTargets" ) ), constant_handles.reader_make_constant_shell( makeString( "intendedTargetTypeOfAttack" ) ), constant_handles.reader_make_constant_shell(
                                                makeString( "intendedVictim" ) ), constant_handles.reader_make_constant_shell( makeString( "numberOfHostagesTaken" ) ), constant_handles.reader_make_constant_shell(
                                                    makeString( "target" ) ), constant_handles.reader_make_constant_shell( makeString( "bodilyActedOn" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                        "objectAttacked" ) ) ), makeKeyword( "TERM" ), makeKeyword( "ANYTHING" ) ), makeKeyword( "TARGET" ) ), ConsesLow.cons( ConsesLow.list( makeKeyword( "ANYTHING" ),
                                                            makeKeyword( "TERM" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "DATE-P" ) ) ), makeKeyword( "DATE" ) ) );
    $sym119$SIMPLE_BINARY_PROPERTY_PATTERNS = makeSymbol( "SIMPLE-BINARY-PROPERTY-PATTERNS" );
    $list120 = ConsesLow.cons( makeSymbol( "PRED" ), makeSymbol( "PROPERTY-TYPE" ) );
    $kw121$GENL_PRED = makeKeyword( "GENL-PRED" );
    $list122 = ConsesLow.list( makeKeyword( "TERM" ), makeKeyword( "ANYTHING" ) );
    $sym123$_SIMPLE_BINARY_PROPERTY_PATTERNS_CACHING_STATE_ = makeSymbol( "*SIMPLE-BINARY-PROPERTY-PATTERNS-CACHING-STATE*" );
    $sym124$SIMPLE_BINARY_PROPERTY_P = makeSymbol( "SIMPLE-BINARY-PROPERTY-P" );
    $const125$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $list126 = ConsesLow.cons( makeSymbol( "PATTERN" ), makeSymbol( "PROPERTY-TYPE" ) );
    $list127 = ConsesLow.list( ConsesLow.cons( ConsesLow.listS( ConsesLow.list( makeKeyword( "OR" ), constant_handles.reader_make_constant_shell( makeString( "injuryCount" ) ), constant_handles
        .reader_make_constant_shell( makeString( "deathToll" ) ), constant_handles.reader_make_constant_shell( makeString( "casualtyCount" ) ) ), makeKeyword( "TERM" ), makeKeyword( "ANYTHING" ) ), makeKeyword(
            "TARGET" ) ), ConsesLow.cons( ConsesLow.listS( constant_handles.reader_make_constant_shell( makeString( "subSceneOfType" ) ), makeKeyword( "TERM" ), makeKeyword( "ANYTHING" ) ), makeKeyword( "SUB-EVENT" ) ),
        ConsesLow.cons( ConsesLow.listS( constant_handles.reader_make_constant_shell( makeString( "capableOf" ) ), makeKeyword( "TERM" ), makeKeyword( "ANYTHING" ) ), makeKeyword( "CAPABILITIES" ) ), ConsesLow.cons(
            ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "sponsorsAgentInAction" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "ANYTHING" ), makeKeyword( "TERM" ) ), makeKeyword(
                "PERPETRATOR" ) ) );
    $list128 = ConsesLow.listS( ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "EXISTENTIAL-RMP-P" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "PRED" ) ), ConsesLow.list( makeKeyword( "BIND" ),
        makeSymbol( "TERM" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TYPE" ) ), makeKeyword( "ANYTHING" ) );
    $sym129$TYPE = makeSymbol( "TYPE" );
    $sym130$TERM = makeSymbol( "TERM" );
    $const131$SomeFn = constant_handles.reader_make_constant_shell( makeString( "SomeFn" ) );
    $list132 = ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "CORE" ) );
    $list133 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SomeFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Thing" ) ) );
    $sym134$EL_CONJUNCTION_P = makeSymbol( "EL-CONJUNCTION-P" );
    $list135 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "InstanceNamedFn" ) ), makeKeyword( "STRING" ), constant_handles.reader_make_constant_shell( makeString( "AttackType" ) ) );
    $const136$AttackType = constant_handles.reader_make_constant_shell( makeString( "AttackType" ) );
    $const137$AttackOnObject = constant_handles.reader_make_constant_shell( makeString( "AttackOnObject" ) );
    $const138$HostileSocialAction = constant_handles.reader_make_constant_shell( makeString( "HostileSocialAction" ) );
    $const139$KillingByOrganism = constant_handles.reader_make_constant_shell( makeString( "KillingByOrganism" ) );
    $const140$CapturingSomething = constant_handles.reader_make_constant_shell( makeString( "CapturingSomething" ) );
    $const141$IncurringDamage = constant_handles.reader_make_constant_shell( makeString( "IncurringDamage" ) );
    $const142$ManMadeDisaster = constant_handles.reader_make_constant_shell( makeString( "ManMadeDisaster" ) );
    $const143$ObstructionEvent = constant_handles.reader_make_constant_shell( makeString( "ObstructionEvent" ) );
    $const144$MilitaryEvent = constant_handles.reader_make_constant_shell( makeString( "MilitaryEvent" ) );
    $const145$ExposureToSubstance = constant_handles.reader_make_constant_shell( makeString( "ExposureToSubstance" ) );
    $const146$ActsCommonlyConsideredCriminal = constant_handles.reader_make_constant_shell( makeString( "ActsCommonlyConsideredCriminal" ) );
    $const147$ShootingAProjectileWeapon = constant_handles.reader_make_constant_shell( makeString( "ShootingAProjectileWeapon" ) );
    $list148 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "AttemptingFn" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ACT-TYPE" ) ) );
    $sym149$ACT_TYPE = makeSymbol( "ACT-TYPE" );
    $const150$True_JustificationTruth = constant_handles.reader_make_constant_shell( makeString( "True-JustificationTruth" ) );
    $const151$functionalInArgs = constant_handles.reader_make_constant_shell( makeString( "functionalInArgs" ) );
    $const152$unknownSentence = constant_handles.reader_make_constant_shell( makeString( "unknownSentence" ) );
    $list153 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "unknownSentence" ) ), makeKeyword( "ANYTHING" ) );
  }
}
/*
 * 
 * Total time: 2571 ms
 * 
 */