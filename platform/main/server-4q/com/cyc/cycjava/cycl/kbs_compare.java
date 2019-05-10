package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class kbs_compare
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.kbs_compare";
  public static final String myFingerPrint = "10f2511acb7138f60e4263b608847564c8d551c327f6df39b190a85b206a170a";
  @SubLTranslatedFile.SubL(source = "cycl/kbs-compare.lisp", position = 1028L)
  private static SubLSymbol $kbs_compare_instance_cols$;
  @SubLTranslatedFile.SubL(source = "cycl/kbs-compare.lisp", position = 1486L)
  private static SubLSymbol $kbs_compare_quoted_instance_cols$;
  @SubLTranslatedFile.SubL(source = "cycl/kbs-compare.lisp", position = 1728L)
  private static SubLSymbol $kbs_compare_spec_cols$;
  private static final SubLList $list0;
  private static final SubLList $list1;
  private static final SubLList $list2;
  private static final SubLSymbol $sym3$_MT;
  private static final SubLList $list4;
  private static final SubLSymbol $sym5$KBS_CONSTANT_P;
  private static final SubLObject $const6$EverythingPSC;
  private static final SubLString $str7$_A__A_A_A_A_A_ADifference__;
  private static final SubLString $str8$_A__A_A_A__;
  private static final SubLString $str9$_A_A_A_A_A_A_A_A__;
  private static final SubLString $str10$_A_A_A_A__;
  private static final SubLSymbol $sym11$DONE;
  private static final SubLSymbol $sym12$_;
  private static final SubLInteger $int13$100;
  private static final SubLSymbol $kw14$GAF;
  private static final SubLSymbol $kw15$RULE;
  private static final SubLString $str16$Collections__instance_count_;
  private static final SubLString $str17$Collections__quoted_instance_coun;
  private static final SubLString $str18$Collections__spec_count_;
  private static final SubLString $str19$Assertion_MT__gaf_count_;
  private static final SubLString $str20$Assertion_MT__rule_count_;

  @SubLTranslatedFile.SubL(source = "cycl/kbs-compare.lisp", position = 1912L)
  public static SubLObject kbs_compare_ensure_kbs_initialized(final SubLObject kbs, final SubLObject refresh_kbsP)
  {
    if( NIL != refresh_kbsP || NIL == kbs_identification.kbs_state_validP() || !kbs_utilities.get_kbs_name().equal( kbs ) )
    {
      kbs_utilities.set_kbs_definition( kbs );
      kbs_identification.identify_kbs_forts_and_assertions();
    }
    return kbs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kbs-compare.lisp", position = 2225L)
  public static SubLObject kbs_compare_assertion_mts()
  {
    return ask_utilities.query_variable( $sym3$_MT, $list4, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kbs-compare.lisp", position = 2403L)
  public static SubLObject kbs_compare_instance_counts(final SubLObject collections)
  {
    SubLObject instance_counts = NIL;
    SubLObject cdolist_list_var = collections;
    SubLObject collection = NIL;
    collection = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      instance_counts = ConsesLow.cons( isa.count_all_instances_if( collection, $sym5$KBS_CONSTANT_P, $const6$EverythingPSC, UNPROVIDED ), instance_counts );
      cdolist_list_var = cdolist_list_var.rest();
      collection = cdolist_list_var.first();
    }
    return Sequences.reverse( instance_counts );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kbs-compare.lisp", position = 2808L)
  public static SubLObject kbs_compare_quoted_instance_counts(final SubLObject collections)
  {
    SubLObject quoted_instance_counts = NIL;
    SubLObject cdolist_list_var = collections;
    SubLObject collection = NIL;
    collection = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      quoted_instance_counts = ConsesLow.cons( isa.count_all_quoted_instances_if( collection, $sym5$KBS_CONSTANT_P, $const6$EverythingPSC, UNPROVIDED ), quoted_instance_counts );
      cdolist_list_var = cdolist_list_var.rest();
      collection = cdolist_list_var.first();
    }
    return Sequences.reverse( quoted_instance_counts );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kbs-compare.lisp", position = 3277L)
  public static SubLObject kbs_compare_spec_counts(final SubLObject collections)
  {
    SubLObject spec_counts = NIL;
    SubLObject cdolist_list_var = collections;
    SubLObject collection = NIL;
    collection = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      spec_counts = ConsesLow.cons( genls.count_all_specs_if( collection, $sym5$KBS_CONSTANT_P, $const6$EverythingPSC, UNPROVIDED ), spec_counts );
      cdolist_list_var = cdolist_list_var.rest();
      collection = cdolist_list_var.first();
    }
    return Sequences.reverse( spec_counts );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kbs-compare.lisp", position = 3654L)
  public static SubLObject kbs_compare_assertion_counts(final SubLObject mts, SubLObject type)
  {
    if( type == UNPROVIDED )
    {
      type = NIL;
    }
    SubLObject assertion_counts = NIL;
    SubLObject cdolist_list_var = mts;
    SubLObject mt = NIL;
    mt = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assertion_counts = ConsesLow.cons( kbs_identification.count_all_kbs_assertions_in_mt( mt, type ), assertion_counts );
      cdolist_list_var = cdolist_list_var.rest();
      mt = cdolist_list_var.first();
    }
    return Sequences.reverse( assertion_counts );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kbs-compare.lisp", position = 4033L)
  public static SubLObject equal_length_lists_subtraction(final SubLObject list1, final SubLObject list2)
  {
    SubLObject list3 = NIL;
    SubLObject item1 = NIL;
    SubLObject item1_$1 = NIL;
    SubLObject item2 = NIL;
    SubLObject item2_$2 = NIL;
    item1 = list1;
    item1_$1 = item1.first();
    item2 = list2;
    item2_$2 = item2.first();
    while ( NIL != item2 || NIL != item1)
    {
      list3 = ConsesLow.cons( Numbers.subtract( item1_$1, item2_$2 ), list3 );
      item1 = item1.rest();
      item1_$1 = item1.first();
      item2 = item2.rest();
      item2_$2 = item2.first();
    }
    return Sequences.reverse( list3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kbs-compare.lisp", position = 4300L)
  public static SubLObject kbs_compare_print_header(final SubLObject count_type, final SubLObject kbs_big, final SubLObject kbs_small)
  {
    if( NIL != kbs_small )
    {
      return PrintLow.format( T, $str7$_A__A_A_A_A_A_ADifference__, new SubLObject[] { count_type, Characters.CHAR_tab, Characters.CHAR_tab, kbs_big, Characters.CHAR_tab, kbs_small, Characters.CHAR_tab
      } );
    }
    return PrintLow.format( T, $str8$_A__A_A_A__, new SubLObject[] { count_type, Characters.CHAR_tab, Characters.CHAR_tab, kbs_big
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kbs-compare.lisp", position = 4606L)
  public static SubLObject kbs_compare_print(final SubLObject names, final SubLObject values1, SubLObject values2)
  {
    if( values2 == UNPROVIDED )
    {
      values2 = NIL;
    }
    if( NIL != values2 )
    {
      final SubLObject diffs = equal_length_lists_subtraction( values1, values2 );
      SubLObject name = NIL;
      SubLObject name_$3 = NIL;
      SubLObject value1 = NIL;
      SubLObject value1_$4 = NIL;
      SubLObject value2 = NIL;
      SubLObject value2_$5 = NIL;
      SubLObject diff = NIL;
      SubLObject diff_$6 = NIL;
      name = names;
      name_$3 = name.first();
      value1 = values1;
      value1_$4 = value1.first();
      value2 = values2;
      value2_$5 = value2.first();
      diff = diffs;
      diff_$6 = diff.first();
      while ( NIL != diff || NIL != value2 || NIL != value1 || NIL != name)
      {
        PrintLow.format( T, $str9$_A_A_A_A_A_A_A_A__, new SubLObject[] { name_$3, Characters.CHAR_tab, Characters.CHAR_tab, value1_$4, Characters.CHAR_tab, value2_$5, Characters.CHAR_tab, diff_$6
        } );
        name = name.rest();
        name_$3 = name.first();
        value1 = value1.rest();
        value1_$4 = value1.first();
        value2 = value2.rest();
        value2_$5 = value2.first();
        diff = diff.rest();
        diff_$6 = diff.first();
      }
    }
    else
    {
      SubLObject name2 = NIL;
      SubLObject name_$4 = NIL;
      SubLObject value3 = NIL;
      SubLObject value_$8 = NIL;
      name2 = names;
      name_$4 = name2.first();
      value3 = values1;
      value_$8 = value3.first();
      while ( NIL != value3 || NIL != name2)
      {
        PrintLow.format( T, $str10$_A_A_A_A__, new SubLObject[] { name_$4, Characters.CHAR_tab, Characters.CHAR_tab, value_$8
        } );
        name2 = name2.rest();
        name_$4 = name2.first();
        value3 = value3.rest();
        value_$8 = value3.first();
      }
    }
    return $sym11$DONE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kbs-compare.lisp", position = 5125L)
  public static SubLObject kbs_compare(final SubLObject kbs_big, SubLObject kbs_small, SubLObject refresh_kbsP, SubLObject instance_cols, SubLObject quoted_instance_cols, SubLObject spec_cols, SubLObject assertion_mts)
  {
    if( kbs_small == UNPROVIDED )
    {
      kbs_small = NIL;
    }
    if( refresh_kbsP == UNPROVIDED )
    {
      refresh_kbsP = NIL;
    }
    if( instance_cols == UNPROVIDED )
    {
      instance_cols = $kbs_compare_instance_cols$.getGlobalValue();
    }
    if( quoted_instance_cols == UNPROVIDED )
    {
      quoted_instance_cols = $kbs_compare_quoted_instance_cols$.getGlobalValue();
    }
    if( spec_cols == UNPROVIDED )
    {
      spec_cols = $kbs_compare_spec_cols$.getGlobalValue();
    }
    if( assertion_mts == UNPROVIDED )
    {
      assertion_mts = kbs_compare_assertion_mts();
    }
    kbs_compare_ensure_kbs_initialized( kbs_big, refresh_kbsP );
    final SubLObject kbs_big_instance_counts = kbs_compare_instance_counts( instance_cols );
    final SubLObject kbs_big_quoted_instance_counts = kbs_compare_quoted_instance_counts( quoted_instance_cols );
    final SubLObject kbs_big_spec_counts = kbs_compare_spec_counts( spec_cols );
    SubLObject kbs_big_assertion_counts = NIL;
    SubLObject kbs_big_gaf_counts = NIL;
    SubLObject kbs_big_rule_counts = NIL;
    SubLObject kbs_small_instance_counts = NIL;
    SubLObject kbs_small_quoted_instance_counts = NIL;
    SubLObject kbs_small_spec_counts = NIL;
    SubLObject kbs_small_gaf_counts = NIL;
    SubLObject kbs_small_rule_counts = NIL;
    SubLObject cdolist_list_var = assertion_mts;
    SubLObject mt = NIL;
    mt = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      kbs_big_assertion_counts = conses_high.acons( mt, kbs_identification.count_all_kbs_assertions_in_mt( mt, UNPROVIDED ), kbs_big_assertion_counts );
      cdolist_list_var = cdolist_list_var.rest();
      mt = cdolist_list_var.first();
    }
    kbs_big_assertion_counts = list_utilities.sort_alist_by_values( kbs_big_assertion_counts, Symbols.symbol_function( $sym12$_ ) );
    if( Sequences.length( kbs_big_assertion_counts ).numG( $int13$100 ) )
    {
      kbs_big_assertion_counts = Sequences.subseq( kbs_big_assertion_counts, ZERO_INTEGER, $int13$100 );
    }
    assertion_mts = list_utilities.alist_keys( kbs_big_assertion_counts );
    kbs_big_gaf_counts = kbs_compare_assertion_counts( assertion_mts, $kw14$GAF );
    kbs_big_rule_counts = kbs_compare_assertion_counts( assertion_mts, $kw15$RULE );
    if( NIL != kbs_small )
    {
      kbs_compare_ensure_kbs_initialized( kbs_small, refresh_kbsP );
      kbs_small_instance_counts = kbs_compare_instance_counts( instance_cols );
      kbs_small_quoted_instance_counts = kbs_compare_quoted_instance_counts( quoted_instance_cols );
      kbs_small_spec_counts = kbs_compare_spec_counts( spec_cols );
      kbs_small_gaf_counts = kbs_compare_assertion_counts( assertion_mts, $kw14$GAF );
      kbs_small_rule_counts = kbs_compare_assertion_counts( assertion_mts, $kw15$RULE );
    }
    kbs_compare_print_header( $str16$Collections__instance_count_, kbs_big, kbs_small );
    kbs_compare_print( instance_cols, kbs_big_instance_counts, kbs_small_instance_counts );
    kbs_compare_print_header( $str17$Collections__quoted_instance_coun, kbs_big, kbs_small );
    kbs_compare_print( quoted_instance_cols, kbs_big_quoted_instance_counts, kbs_small_quoted_instance_counts );
    kbs_compare_print_header( $str18$Collections__spec_count_, kbs_big, kbs_small );
    kbs_compare_print( spec_cols, kbs_big_spec_counts, kbs_small_spec_counts );
    kbs_compare_print_header( $str19$Assertion_MT__gaf_count_, kbs_big, kbs_small );
    kbs_compare_print( assertion_mts, kbs_big_gaf_counts, kbs_small_gaf_counts );
    kbs_compare_print_header( $str20$Assertion_MT__rule_count_, kbs_big, kbs_small );
    kbs_compare_print( assertion_mts, kbs_big_rule_counts, kbs_small_rule_counts );
    return $sym11$DONE;
  }

  public static SubLObject declare_kbs_compare_file()
  {
    SubLFiles.declareFunction( me, "kbs_compare_ensure_kbs_initialized", "KBS-COMPARE-ENSURE-KBS-INITIALIZED", 2, 0, false );
    SubLFiles.declareFunction( me, "kbs_compare_assertion_mts", "KBS-COMPARE-ASSERTION-MTS", 0, 0, false );
    SubLFiles.declareFunction( me, "kbs_compare_instance_counts", "KBS-COMPARE-INSTANCE-COUNTS", 1, 0, false );
    SubLFiles.declareFunction( me, "kbs_compare_quoted_instance_counts", "KBS-COMPARE-QUOTED-INSTANCE-COUNTS", 1, 0, false );
    SubLFiles.declareFunction( me, "kbs_compare_spec_counts", "KBS-COMPARE-SPEC-COUNTS", 1, 0, false );
    SubLFiles.declareFunction( me, "kbs_compare_assertion_counts", "KBS-COMPARE-ASSERTION-COUNTS", 1, 1, false );
    SubLFiles.declareFunction( me, "equal_length_lists_subtraction", "EQUAL-LENGTH-LISTS-SUBTRACTION", 2, 0, false );
    SubLFiles.declareFunction( me, "kbs_compare_print_header", "KBS-COMPARE-PRINT-HEADER", 3, 0, false );
    SubLFiles.declareFunction( me, "kbs_compare_print", "KBS-COMPARE-PRINT", 2, 1, false );
    SubLFiles.declareFunction( me, "kbs_compare", "KBS-COMPARE", 1, 6, false );
    return NIL;
  }

  public static SubLObject init_kbs_compare_file()
  {
    $kbs_compare_instance_cols$ = SubLFiles.deflexical( "*KBS-COMPARE-INSTANCE-COLS*", $list0 );
    $kbs_compare_quoted_instance_cols$ = SubLFiles.deflexical( "*KBS-COMPARE-QUOTED-INSTANCE-COLS*", $list1 );
    $kbs_compare_spec_cols$ = SubLFiles.deflexical( "*KBS-COMPARE-SPEC-COLS*", $list2 );
    return NIL;
  }

  public static SubLObject setup_kbs_compare_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_kbs_compare_file();
  }

  @Override
  public void initializeVariables()
  {
    init_kbs_compare_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_kbs_compare_file();
  }
  static
  {
    me = new kbs_compare();
    $kbs_compare_instance_cols$ = null;
    $kbs_compare_quoted_instance_cols$ = null;
    $kbs_compare_spec_cols$ = null;
    $list0 = ConsesLow.list( new SubLObject[] { constant_handles.reader_make_constant_shell( makeString( "Individual" ) ), constant_handles.reader_make_constant_shell( makeString( "Relation" ) ), constant_handles
        .reader_make_constant_shell( makeString( "TruthFunction" ) ), constant_handles.reader_make_constant_shell( makeString( "Predicate" ) ), constant_handles.reader_make_constant_shell( makeString(
            "Function-Denotational" ) ), constant_handles.reader_make_constant_shell( makeString( "LinguisticObject" ) ), constant_handles.reader_make_constant_shell( makeString( "Event" ) ), constant_handles
                .reader_make_constant_shell( makeString( "Agent-Generic" ) ), constant_handles.reader_make_constant_shell( makeString( "Place-NonAgent" ) ), constant_handles.reader_make_constant_shell( makeString(
                    "SetOrCollection" ) ), constant_handles.reader_make_constant_shell( makeString( "Collection" ) ), constant_handles.reader_make_constant_shell( makeString( "FirstOrderCollection" ) ), constant_handles
                        .reader_make_constant_shell( makeString( "CollectionType" ) ), constant_handles.reader_make_constant_shell( makeString( "FacetingCollectionType" ) ), constant_handles.reader_make_constant_shell(
                            makeString( "Set-Mathematical" ) )
    } );
    $list1 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DocumentationConstant" ) ), constant_handles.reader_make_constant_shell( makeString( "ImplementationConstant" ) ), constant_handles
        .reader_make_constant_shell( makeString( "TimeDimensionRelatedConstant" ) ) );
    $list2 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Agent-Generic" ) ), constant_handles.reader_make_constant_shell( makeString( "Event" ) ), constant_handles
        .reader_make_constant_shell( makeString( "Place-NonAgent" ) ), constant_handles.reader_make_constant_shell( makeString( "Collection" ) ) );
    $sym3$_MT = makeSymbol( "?MT" );
    $list4 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?MT" ), constant_handles.reader_make_constant_shell( makeString( "Microtheory" ) ) );
    $sym5$KBS_CONSTANT_P = makeSymbol( "KBS-CONSTANT-P" );
    $const6$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $str7$_A__A_A_A_A_A_ADifference__ = makeString( "~A:~A~A~A~A~A~ADifference~%" );
    $str8$_A__A_A_A__ = makeString( "~A:~A~A~A~%" );
    $str9$_A_A_A_A_A_A_A_A__ = makeString( "~A~A~A~A~A~A~A~A~%" );
    $str10$_A_A_A_A__ = makeString( "~A~A~A~A~%" );
    $sym11$DONE = makeSymbol( "DONE" );
    $sym12$_ = makeSymbol( ">" );
    $int13$100 = makeInteger( 100 );
    $kw14$GAF = makeKeyword( "GAF" );
    $kw15$RULE = makeKeyword( "RULE" );
    $str16$Collections__instance_count_ = makeString( "Collections (instance-count)" );
    $str17$Collections__quoted_instance_coun = makeString( "Collections (quoted-instance-count)" );
    $str18$Collections__spec_count_ = makeString( "Collections (spec-count)" );
    $str19$Assertion_MT__gaf_count_ = makeString( "Assertion MT (gaf-count)" );
    $str20$Assertion_MT__rule_count_ = makeString( "Assertion MT (rule-count)" );
  }
}
/*
 * 
 * Total time: 148 ms
 * 
 */