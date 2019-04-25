package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_lat_long
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lat_long";
  public static final String myFingerPrint = "378342b7ce86eaaecab32ea924fb3e7fc211e7ae628fafdb56acb993b841ac94";
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lat-long.lisp", position = 873L)
  private static SubLSymbol $latitude_via_location_rule_formula$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lat-long.lisp", position = 1413L)
  private static SubLSymbol $latitude_via_location_rule_antecedent_template$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lat-long.lisp", position = 4498L)
  private static SubLSymbol $longitude_via_location_rule_formula$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lat-long.lisp", position = 5044L)
  private static SubLSymbol $longitude_via_location_rule_antecedent_template$;
  private static final SubLList $list0;
  private static final SubLSymbol $kw1$CODE;
  private static final SubLObject $const2$GeographyMt;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLSymbol $kw5$PROBLEM_STORE;
  private static final SubLSymbol $kw6$CONTINUABLE_;
  private static final SubLSymbol $kw7$ADD_RESTRICTION_LAYER_OF_INDIRECTION_;
  private static final SubLSymbol $kw8$TRANSFORMATION_ALLOWED_;
  private static final SubLSymbol $kw9$RETURN;
  private static final SubLSymbol $kw10$BINDINGS_AND_SUPPORTS;
  private static final SubLList $list11;
  private static final SubLSymbol $sym12$LOC;
  private static final SubLObject $const13$latitude;
  private static final SubLList $list14;
  private static final SubLSymbol $kw15$REMOVAL_LATITUDE_VIA_LOCATION_POS;
  private static final SubLList $list16;
  private static final SubLList $list17;
  private static final SubLList $list18;
  private static final SubLList $list19;
  private static final SubLObject $const20$longitude;
  private static final SubLSymbol $kw21$REMOVAL_LONGITUDE_VIA_LOCATION_POS;
  private static final SubLList $list22;
  private static final SubLSymbol $kw23$REMOVAL_LONGITUDE_FROM_LAT_LONG_POS;
  private static final SubLList $list24;
  private static final SubLSymbol $kw25$REMOVAL_LATITUDE_FROM_LAT_LONG_POS;
  private static final SubLList $list26;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lat-long.lisp", position = 1269L)
  public static SubLObject make_latitude_via_location_rule_support()
  {
    return arguments.make_hl_support( $kw1$CODE, $latitude_via_location_rule_formula$.getGlobalValue(), $const2$GeographyMt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lat-long.lisp", position = 1729L)
  public static SubLObject latitude_via_location_rule_antecedent_dnf(final SubLObject loc)
  {
    final SubLObject rule_antecedent_info = $latitude_via_location_rule_antecedent_template$.getGlobalValue();
    final SubLObject input_values = ConsesLow.list( loc );
    SubLObject current;
    final SubLObject datum = current = rule_antecedent_info;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject input_el_vars = NIL;
    SubLObject output_el_vars = NIL;
    SubLObject scoped_el_vars = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
    input_el_vars = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
    output_el_vars = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
    scoped_el_vars = current.first();
    current = current.rest();
    if( NIL == current )
    {
      current = temp;
      SubLObject el_dnf_template = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
      el_dnf_template = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject el_bindings = bindings.make_variable_bindings( input_el_vars, input_values );
        final SubLObject el_dnf = bindings.apply_bindings( el_bindings, el_dnf_template );
        final SubLObject hl_dnf = variables.subst_hl_variables( output_el_vars, el_dnf );
        final SubLObject scoped_hl_vars = variables.subst_hl_variables( output_el_vars, scoped_el_vars );
        return Values.values( hl_dnf, scoped_hl_vars );
      }
      cdestructuring_bind.cdestructuring_bind_error( datum, $list4 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list4 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lat-long.lisp", position = 2448L)
  public static SubLObject removal_latitude_via_location_antecedent_answers(final SubLObject loc, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject problem_store = inference_worker.currently_active_problem_store();
    thread.resetMultipleValues();
    final SubLObject rule_antecedent_dnf = latitude_via_location_rule_antecedent_dnf( loc );
    final SubLObject scoped_vars = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return inference_kernel.new_cyc_query_from_dnf( rule_antecedent_dnf, mt, scoped_vars, ConsesLow.list( new SubLObject[] { $kw5$PROBLEM_STORE, problem_store, $kw6$CONTINUABLE_, NIL,
      $kw7$ADD_RESTRICTION_LAYER_OF_INDIRECTION_, T, $kw8$TRANSFORMATION_ALLOWED_, NIL, $kw9$RETURN, $kw10$BINDINGS_AND_SUPPORTS
    } ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lat-long.lisp", position = 3079L)
  public static SubLObject removal_latitude_via_location_pos_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pattern = $list11;
    thread.resetMultipleValues();
    final SubLObject success = formula_pattern_match.formula_matches_pattern( asent, pattern );
    final SubLObject v_bindings = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != success )
    {
      final SubLObject loc = list_utilities.alist_lookup_without_values( v_bindings, $sym12$LOC, UNPROVIDED, UNPROVIDED );
      final SubLObject antecedent_answers = removal_latitude_via_location_antecedent_answers( loc, UNPROVIDED );
      if( NIL != antecedent_answers )
      {
        final SubLObject output_template = ConsesLow.list( $const13$latitude, loc, variables.find_variable_by_id( ZERO_INTEGER ) );
        final SubLObject rule_support = make_latitude_via_location_rule_support();
        SubLObject cdolist_list_var = antecedent_answers;
        SubLObject antecedent_answer = NIL;
        antecedent_answer = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject current;
          final SubLObject datum = current = antecedent_answer;
          SubLObject antecedent_bindings = NIL;
          SubLObject antecedent_supports = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list14 );
          antecedent_bindings = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list14 );
          antecedent_supports = current.first();
          current = current.rest();
          if( NIL == current )
          {
            final SubLObject proven_asent = bindings.apply_bindings( antecedent_bindings, output_template );
            thread.resetMultipleValues();
            final SubLObject v_bindings_$1 = unification_utilities.term_unify( proven_asent, asent, T, T );
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if( NIL != v_bindings_$1 )
            {
              backward.removal_add_node( rule_support, v_bindings_$1, ConsesLow.append( antecedent_supports, unify_justification ) );
            }
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list14 );
          }
          cdolist_list_var = cdolist_list_var.rest();
          antecedent_answer = cdolist_list_var.first();
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lat-long.lisp", position = 4898L)
  public static SubLObject make_longitude_via_location_rule_support()
  {
    return arguments.make_hl_support( $kw1$CODE, $longitude_via_location_rule_formula$.getGlobalValue(), $const2$GeographyMt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lat-long.lisp", position = 5360L)
  public static SubLObject longitude_via_location_rule_antecedent_dnf(final SubLObject loc)
  {
    final SubLObject rule_antecedent_info = $longitude_via_location_rule_antecedent_template$.getGlobalValue();
    final SubLObject input_values = ConsesLow.list( loc );
    SubLObject current;
    final SubLObject datum = current = rule_antecedent_info;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject input_el_vars = NIL;
    SubLObject output_el_vars = NIL;
    SubLObject scoped_el_vars = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
    input_el_vars = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
    output_el_vars = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
    scoped_el_vars = current.first();
    current = current.rest();
    if( NIL == current )
    {
      current = temp;
      SubLObject el_dnf_template = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
      el_dnf_template = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject el_bindings = bindings.make_variable_bindings( input_el_vars, input_values );
        final SubLObject el_dnf = bindings.apply_bindings( el_bindings, el_dnf_template );
        final SubLObject hl_dnf = variables.subst_hl_variables( output_el_vars, el_dnf );
        final SubLObject scoped_hl_vars = variables.subst_hl_variables( output_el_vars, scoped_el_vars );
        return Values.values( hl_dnf, scoped_hl_vars );
      }
      cdestructuring_bind.cdestructuring_bind_error( datum, $list4 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list4 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lat-long.lisp", position = 6082L)
  public static SubLObject removal_longitude_via_location_antecedent_answers(final SubLObject loc, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject problem_store = inference_worker.currently_active_problem_store();
    thread.resetMultipleValues();
    final SubLObject rule_antecedent_dnf = longitude_via_location_rule_antecedent_dnf( loc );
    final SubLObject scoped_vars = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return inference_kernel.new_cyc_query_from_dnf( rule_antecedent_dnf, mt, scoped_vars, ConsesLow.list( new SubLObject[] { $kw5$PROBLEM_STORE, problem_store, $kw6$CONTINUABLE_, NIL,
      $kw7$ADD_RESTRICTION_LAYER_OF_INDIRECTION_, T, $kw8$TRANSFORMATION_ALLOWED_, NIL, $kw9$RETURN, $kw10$BINDINGS_AND_SUPPORTS
    } ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lat-long.lisp", position = 6716L)
  public static SubLObject removal_longitude_via_location_pos_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pattern = $list19;
    thread.resetMultipleValues();
    final SubLObject success = formula_pattern_match.formula_matches_pattern( asent, pattern );
    final SubLObject v_bindings = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != success )
    {
      final SubLObject loc = list_utilities.alist_lookup_without_values( v_bindings, $sym12$LOC, UNPROVIDED, UNPROVIDED );
      final SubLObject antecedent_answers = removal_longitude_via_location_antecedent_answers( loc, UNPROVIDED );
      if( NIL != antecedent_answers )
      {
        final SubLObject output_template = ConsesLow.list( $const20$longitude, loc, variables.find_variable_by_id( ONE_INTEGER ) );
        final SubLObject rule_support = make_longitude_via_location_rule_support();
        SubLObject cdolist_list_var = antecedent_answers;
        SubLObject antecedent_answer = NIL;
        antecedent_answer = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject current;
          final SubLObject datum = current = antecedent_answer;
          SubLObject antecedent_bindings = NIL;
          SubLObject antecedent_supports = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list14 );
          antecedent_bindings = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list14 );
          antecedent_supports = current.first();
          current = current.rest();
          if( NIL == current )
          {
            final SubLObject proven_asent = bindings.apply_bindings( antecedent_bindings, output_template );
            thread.resetMultipleValues();
            final SubLObject v_bindings_$2 = unification_utilities.term_unify( proven_asent, asent, T, T );
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if( NIL != v_bindings_$2 )
            {
              backward.removal_add_node( rule_support, v_bindings_$2, ConsesLow.append( antecedent_supports, unify_justification ) );
            }
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list14 );
          }
          cdolist_list_var = cdolist_list_var.rest();
          antecedent_answer = cdolist_list_var.first();
        }
      }
    }
    return NIL;
  }

  public static SubLObject declare_removal_modules_lat_long_file()
  {
    SubLFiles.declareFunction( me, "make_latitude_via_location_rule_support", "MAKE-LATITUDE-VIA-LOCATION-RULE-SUPPORT", 0, 0, false );
    SubLFiles.declareFunction( me, "latitude_via_location_rule_antecedent_dnf", "LATITUDE-VIA-LOCATION-RULE-ANTECEDENT-DNF", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_latitude_via_location_antecedent_answers", "REMOVAL-LATITUDE-VIA-LOCATION-ANTECEDENT-ANSWERS", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_latitude_via_location_pos_expand", "REMOVAL-LATITUDE-VIA-LOCATION-POS-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "make_longitude_via_location_rule_support", "MAKE-LONGITUDE-VIA-LOCATION-RULE-SUPPORT", 0, 0, false );
    SubLFiles.declareFunction( me, "longitude_via_location_rule_antecedent_dnf", "LONGITUDE-VIA-LOCATION-RULE-ANTECEDENT-DNF", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_longitude_via_location_antecedent_answers", "REMOVAL-LONGITUDE-VIA-LOCATION-ANTECEDENT-ANSWERS", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_longitude_via_location_pos_expand", "REMOVAL-LONGITUDE-VIA-LOCATION-POS-EXPAND", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_lat_long_file()
  {
    $latitude_via_location_rule_formula$ = SubLFiles.deflexical( "*LATITUDE-VIA-LOCATION-RULE-FORMULA*", $list0 );
    $latitude_via_location_rule_antecedent_template$ = SubLFiles.deflexical( "*LATITUDE-VIA-LOCATION-RULE-ANTECEDENT-TEMPLATE*", $list3 );
    $longitude_via_location_rule_formula$ = SubLFiles.deflexical( "*LONGITUDE-VIA-LOCATION-RULE-FORMULA*", $list17 );
    $longitude_via_location_rule_antecedent_template$ = SubLFiles.deflexical( "*LONGITUDE-VIA-LOCATION-RULE-ANTECEDENT-TEMPLATE*", $list18 );
    return NIL;
  }

  public static SubLObject setup_removal_modules_lat_long_file()
  {
    inference_modules.inference_removal_module( $kw15$REMOVAL_LATITUDE_VIA_LOCATION_POS, $list16 );
    inference_modules.inference_removal_module( $kw21$REMOVAL_LONGITUDE_VIA_LOCATION_POS, $list22 );
    inference_modules.inference_removal_module( $kw23$REMOVAL_LONGITUDE_FROM_LAT_LONG_POS, $list24 );
    inference_modules.inference_removal_module( $kw25$REMOVAL_LATITUDE_FROM_LAT_LONG_POS, $list26 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_lat_long_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_lat_long_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_lat_long_file();
  }
  static
  {
    me = new removal_modules_lat_long();
    $latitude_via_location_rule_formula$ = null;
    $latitude_via_location_rule_antecedent_template$ = null;
    $longitude_via_location_rule_formula$ = null;
    $longitude_via_location_rule_antecedent_template$ = null;
    $list0 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "implies" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "locatedAtPoint-SurfaceGeographical" ) ),
        makeSymbol( "?PLACE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "LatLongFn" ) ), makeSymbol( "?LAT" ), makeSymbol( "?LONG" ) ) ), ConsesLow.list( constant_handles
            .reader_make_constant_shell( makeString( "latitude" ) ), makeSymbol( "?PLACE" ), makeSymbol( "?LAT" ) ) );
    $kw1$CODE = makeKeyword( "CODE" );
    $const2$GeographyMt = constant_handles.reader_make_constant_shell( makeString( "GeographyMt" ) );
    $list3 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeSymbol( "?PLACE" ) ), ConsesLow.list( makeSymbol( "?LAT" ), makeSymbol( "?LONG" ) ), ConsesLow.list( makeSymbol( "?LONG" ) ) ), ConsesLow.list( NIL,
        ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "locatedAtPoint-SurfaceGeographical" ) ), makeSymbol( "?PLACE" ), ConsesLow.list( constant_handles
            .reader_make_constant_shell( makeString( "LatLongFn" ) ), makeSymbol( "?LAT" ), makeSymbol( "?LONG" ) ) ) ) ) );
    $list4 = ConsesLow.list( ConsesLow.list( makeSymbol( "INPUT-EL-VARS" ), makeSymbol( "OUTPUT-EL-VARS" ), makeSymbol( "SCOPED-EL-VARS" ) ), makeSymbol( "EL-DNF-TEMPLATE" ) );
    $kw5$PROBLEM_STORE = makeKeyword( "PROBLEM-STORE" );
    $kw6$CONTINUABLE_ = makeKeyword( "CONTINUABLE?" );
    $kw7$ADD_RESTRICTION_LAYER_OF_INDIRECTION_ = makeKeyword( "ADD-RESTRICTION-LAYER-OF-INDIRECTION?" );
    $kw8$TRANSFORMATION_ALLOWED_ = makeKeyword( "TRANSFORMATION-ALLOWED?" );
    $kw9$RETURN = makeKeyword( "RETURN" );
    $kw10$BINDINGS_AND_SUPPORTS = makeKeyword( "BINDINGS-AND-SUPPORTS" );
    $list11 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "latitude" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "LOC" ) ), makeKeyword( "ANYTHING" ) );
    $sym12$LOC = makeSymbol( "LOC" );
    $const13$latitude = constant_handles.reader_make_constant_shell( makeString( "latitude" ) );
    $list14 = ConsesLow.list( makeSymbol( "ANTECEDENT-BINDINGS" ), makeSymbol( "ANTECEDENT-SUPPORTS" ) );
    $kw15$REMOVAL_LATITUDE_VIA_LOCATION_POS = makeKeyword( "REMOVAL-LATITUDE-VIA-LOCATION-POS" );
    $list16 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "latitude" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "latitude" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "ANYTHING" ) ), makeKeyword( "COST-EXPRESSION" ),
      ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "INCOMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-LATITUDE-VIA-LOCATION-POS-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
          "checks for #$locatedAtPoint-SurfaceGeographical and returns the latitude from that" ), makeKeyword( "EXAMPLE" ), makeString( "(#$latitude #$CityOfSanFranciscoCA ?LONG)" )
    } );
    $list17 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "implies" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "locatedAtPoint-SurfaceGeographical" ) ),
        makeSymbol( "?PLACE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "LatLongFn" ) ), makeSymbol( "?LAT" ), makeSymbol( "?LONG" ) ) ), ConsesLow.list( constant_handles
            .reader_make_constant_shell( makeString( "longitude" ) ), makeSymbol( "?PLACE" ), makeSymbol( "?LONG" ) ) );
    $list18 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeSymbol( "?PLACE" ) ), ConsesLow.list( makeSymbol( "?LAT" ), makeSymbol( "?LONG" ) ), ConsesLow.list( makeSymbol( "?LAT" ) ) ), ConsesLow.list( NIL,
        ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "locatedAtPoint-SurfaceGeographical" ) ), makeSymbol( "?PLACE" ), ConsesLow.list( constant_handles
            .reader_make_constant_shell( makeString( "LatLongFn" ) ), makeSymbol( "?LAT" ), makeSymbol( "?LONG" ) ) ) ) ) );
    $list19 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "longitude" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "LOC" ) ), makeKeyword( "ANYTHING" ) );
    $const20$longitude = constant_handles.reader_make_constant_shell( makeString( "longitude" ) );
    $kw21$REMOVAL_LONGITUDE_VIA_LOCATION_POS = makeKeyword( "REMOVAL-LONGITUDE-VIA-LOCATION-POS" );
    $list22 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "longitude" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "longitude" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "ANYTHING" ) ), makeKeyword( "COST-EXPRESSION" ),
      ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "INCOMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-LONGITUDE-VIA-LOCATION-POS-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
          "checks for #$locatedAtPoint-SurfaceGeographical and returns the longitude from that" ), makeKeyword( "EXAMPLE" ), makeString( "(#$longitude #$CityOfSanFranciscoCA ?LONG)" )
    } );
    $kw23$REMOVAL_LONGITUDE_FROM_LAT_LONG_POS = makeKeyword( "REMOVAL-LONGITUDE-FROM-LAT-LONG-POS" );
    $list24 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "longitude" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "longitude" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "LatLongFn" ) ),
            makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "ANYTHING" ) ), makeKeyword( "EXCLUSIVE" ), makeSymbol( "TRUE" ), makeKeyword( "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword(
                "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                    "longitude" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "LatLongFn" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "LAT" ) ), ConsesLow.list( makeKeyword(
                        "BIND" ), makeSymbol( "LONG" ) ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "LAT" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                            "LONG" ) ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow
                                .list( makeSymbol( "LAT" ), makeSymbol( "LONG" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "longitude" ) ), ConsesLow.list( constant_handles
                                    .reader_make_constant_shell( makeString( "LatLongFn" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "LAT" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                                        "LONG" ) ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "LONG" ) ) ) ), makeKeyword( "DOCUMENTATION" ), makeString(
                                            "(#$longitude (#$LatLongFn <fully-bound> <fully-bound>) :anything)" ), makeKeyword( "EXAMPLE" ), makeString(
                                                "(#$longitude \n  (#$LatLongFn (#$Degree-UnitOfAngularMeasure 30) (#$Degree-UnitOfAngularMeasure -97))\n  ?LONG)" )
    } );
    $kw25$REMOVAL_LATITUDE_FROM_LAT_LONG_POS = makeKeyword( "REMOVAL-LATITUDE-FROM-LAT-LONG-POS" );
    $list26 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "latitude" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "latitude" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "LatLongFn" ) ),
            makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "ANYTHING" ) ), makeKeyword( "EXCLUSIVE" ), makeSymbol( "TRUE" ), makeKeyword( "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword(
                "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                    "latitude" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "LatLongFn" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "LAT" ) ), ConsesLow.list( makeKeyword(
                        "BIND" ), makeSymbol( "LONG" ) ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "LAT" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                            "LONG" ) ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow
                                .list( makeSymbol( "LAT" ), makeSymbol( "LONG" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "latitude" ) ), ConsesLow.list( constant_handles
                                    .reader_make_constant_shell( makeString( "LatLongFn" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "LAT" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                                        "LONG" ) ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "LAT" ) ) ) ), makeKeyword( "DOCUMENTATION" ), makeString(
                                            "(#$latitude (#$LatLongFn <fully-bound> <fully-bound>) :anything)" ), makeKeyword( "EXAMPLE" ), makeString(
                                                "(#$latitude \n  (#$LatLongFn (#$Degree-UnitOfAngularMeasure 30) (#$Degree-UnitOfAngularMeasure -97))\n  ?LONG)" )
    } );
  }
}
/*
 * 
 * Total time: 125 ms
 * 
 */