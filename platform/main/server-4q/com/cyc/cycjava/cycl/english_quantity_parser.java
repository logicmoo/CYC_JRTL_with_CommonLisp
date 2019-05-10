package com.cyc.cycjava.cycl;

import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class english_quantity_parser
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.english_quantity_parser";
  public static final String myFingerPrint = "9b742ef9edc09e5da9b632a148a55d2bb401a6f1450ec3911ccf50b013bd368c";
  @SubLTranslatedFile.SubL(source = "cycl/english-quantity-parser.lisp", position = 973L)
  private static SubLSymbol $english_units_of_measure$;
  @SubLTranslatedFile.SubL(source = "cycl/english-quantity-parser.lisp", position = 3810L)
  private static SubLSymbol $unit_of_measure$;
  @SubLTranslatedFile.SubL(source = "cycl/english-quantity-parser.lisp", position = 4512L)
  private static SubLSymbol $dollar_sign_plus_number$;
  @SubLTranslatedFile.SubL(source = "cycl/english-quantity-parser.lisp", position = 5290L)
  private static SubLSymbol $unary_quantity$;
  @SubLTranslatedFile.SubL(source = "cycl/english-quantity-parser.lisp", position = 6364L)
  private static SubLSymbol $binary_quantity$;
  @SubLTranslatedFile.SubL(source = "cycl/english-quantity-parser.lisp", position = 6635L)
  private static SubLSymbol $english_quantity_parser$;
  private static final SubLSymbol $sym0$_ENGLISH_UNITS_OF_MEASURE_;
  private static final SubLSymbol $kw1$UNINITIALIZED;
  private static final SubLSymbol $kw2$QUANTITY;
  private static final SubLSymbol $kw3$UNIT_OF_MEASURE;
  private static final SubLSymbol $sym4$NUMERAL_PARSER_STRING_;
  private static final SubLObject $const5$UnitOfMeasure;
  private static final SubLString $str6$Initializing_English_units_of_mea;
  private static final SubLObject $const7$isa;
  private static final SubLSymbol $kw8$BREADTH;
  private static final SubLSymbol $kw9$QUEUE;
  private static final SubLSymbol $kw10$STACK;
  private static final SubLSymbol $sym11$RELEVANT_SBHL_TV_IS_GENERAL_TV;
  private static final SubLSymbol $kw12$ERROR;
  private static final SubLString $str13$_A_is_not_a__A;
  private static final SubLSymbol $sym14$SBHL_TRUE_TV_P;
  private static final SubLSymbol $kw15$CERROR;
  private static final SubLString $str16$continue_anyway;
  private static final SubLSymbol $kw17$WARN;
  private static final SubLString $str18$_A_is_not_a_valid__sbhl_type_erro;
  private static final SubLString $str19$_A_is_neither_SET_P_nor_LISTP_;
  private static final SubLString $str20$attempting_to_bind_direction_link;
  private static final SubLList $list21;
  private static final SubLString $str22$Node__a_does_not_pass_sbhl_type_t;
  private static final SubLSymbol $kw23$NEW;
  private static final SubLSymbol $kw24$ALL;
  private static final SubLList $list25;
  private static final SubLSymbol $kw26$DONE;
  private static final SubLString $str27$_;
  private static final SubLSymbol $kw28$CATEGORY;
  private static final SubLSymbol $kw29$INFO;
  private static final SubLList $list30;
  private static final SubLSymbol $sym31$UNIT_OF_MEASURE_LITERAL_;
  private static final SubLList $list32;
  private static final SubLSymbol $sym33$BUILD_UNIT_OF_MEASURE;
  private static final SubLObject $const34$Dollar_UnitedStates;
  private static final SubLSymbol $kw35$STRING;
  private static final SubLSymbol $sym36$CCONCATENATE;
  private static final SubLSymbol $sym37$SIGN_STRING;
  private static final SubLSymbol $kw38$CONSTITUENTS;
  private static final SubLSymbol $sym39$VECTOR;
  private static final SubLList $list40;
  private static final SubLSymbol $sym41$DOLLAR_SIGN_LITERAL_;
  private static final SubLSymbol $sym42$NUMBER_SIGN_;
  private static final SubLList $list43;
  private static final SubLSymbol $sym44$BUILD_DOLLAR_SIGN_PLUS_NUMBER;
  private static final SubLSymbol $sym45$INTERVAL_SIGN_;
  private static final SubLSymbol $sym46$UNIT_OF_MEASURE_SIGN_;
  private static final SubLSymbol $sym47$BUILD_UNARY_QUANTITY_PHRASE;
  private static final SubLObject $const48$PlusFn;
  private static final SubLSymbol $sym49$QUANTITY_SIGN_;
  private static final SubLSymbol $sym50$BUILD_BINARY_QUANTITY_PHRASE;
  private static final SubLSymbol $sym51$STRINGP;
  private static final SubLSymbol $sym52$TEST_STRING_TO_QUANTITIES;
  private static final SubLSymbol $kw53$TEST;
  private static final SubLSymbol $sym54$EQUAL_QUANTITIES;
  private static final SubLSymbol $kw55$OWNER;
  private static final SubLSymbol $kw56$CLASSES;
  private static final SubLSymbol $kw57$KB;
  private static final SubLSymbol $kw58$FULL;
  private static final SubLSymbol $kw59$WORKING_;
  private static final SubLList $list60;

  @SubLTranslatedFile.SubL(source = "cycl/english-quantity-parser.lisp", position = 1086L)
  public static SubLObject quantity_signP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && NIL != conses_high.member( $kw2$QUANTITY, document.sign_category( v_object ), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/english-quantity-parser.lisp", position = 1266L)
  public static SubLObject unit_of_measure_signP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && NIL != conses_high.member( $kw3$UNIT_OF_MEASURE, document.sign_category( v_object ), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/english-quantity-parser.lisp", position = 1395L)
  public static SubLObject unit_of_measure_literalP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && NIL != conses_high.assoc( document.sign_string( v_object ), english_units_of_measure(), Symbols.symbol_function( $sym4$NUMERAL_PARSER_STRING_ ),
        UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/english-quantity-parser.lisp", position = 1567L)
  public static SubLObject clear_english_units_of_measure(SubLObject uom)
  {
    if( uom == UNPROVIDED )
    {
      uom = NIL;
    }
    $english_units_of_measure$.setGlobalValue( $kw1$UNINITIALIZED );
    return $english_units_of_measure$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/english-quantity-parser.lisp", position = 1790L)
  public static SubLObject english_units_of_measure()
  {
    ensure_english_units_of_measure_initialization();
    return $english_units_of_measure$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/english-quantity-parser.lisp", position = 1924L)
  public static SubLObject ensure_english_units_of_measure_initialization()
  {
    if( NIL == list_utilities.alist_p( $english_units_of_measure$.getGlobalValue() ) )
    {
      initialize_english_units_of_measure();
    }
    return $english_units_of_measure$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/english-quantity-parser.lisp", position = 2120L)
  public static SubLObject initialize_english_units_of_measure()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $english_units_of_measure$.setGlobalValue( NIL );
    final SubLObject total = isa.count_all_instances( $const5$UnitOfMeasure, UNPROVIDED, UNPROVIDED );
    SubLObject sofar = ZERO_INTEGER;
    final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding( thread );
    try
    {
      pph_macros.$free_pph_problem_store_pointers$.bind( NIL, thread );
      thread.resetMultipleValues();
      final SubLObject _prev_bind_0_$1 = pph_macros.$pph_problem_store_pointer$.currentBinding( thread );
      try
      {
        pph_macros.$pph_problem_store_pointer$.bind( pph_macros.find_or_create_pph_problem_store_pointer(), thread );
        final SubLObject reuseP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        try
        {
          thread.resetMultipleValues();
          final SubLObject _prev_bind_0_$2 = pph_macros.$pph_memoization_state$.currentBinding( thread );
          try
          {
            pph_macros.$pph_memoization_state$.bind( pph_macros.find_or_create_pph_memoization_state(), thread );
            final SubLObject new_or_reused = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$3 = pph_macros.$pph_external_memoization_state$.currentBinding( thread );
            try
            {
              pph_macros.$pph_external_memoization_state$.bind( pph_macros.find_or_create_pph_external_memoization_state(), thread );
              final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue( thread );
              final SubLObject _prev_bind_0_$4 = memoization_state.$memoization_state$.currentBinding( thread );
              try
              {
                memoization_state.$memoization_state$.bind( local_state, thread );
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
                try
                {
                  final SubLObject _prev_bind_0_$5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
                  final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
                  final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
                  final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
                  try
                  {
                    utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
                    utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
                    utilities_macros.$within_noting_percent_progress$.bind( T, thread );
                    utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
                    try
                    {
                      utilities_macros.noting_percent_progress_preamble( $str6$Initializing_English_units_of_mea );
                      final SubLObject node_var = $const5$UnitOfMeasure;
                      final SubLObject _prev_bind_0_$6 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$7 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
                      try
                      {
                        sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const7$isa ), thread );
                        sbhl_marking_vars.$sbhl_gather_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
                        try
                        {
                          SubLObject node_var_$8 = node_var;
                          final SubLObject deck_type = $kw10$STACK;
                          final SubLObject recur_deck = deck.create_deck( deck_type );
                          final SubLObject _prev_bind_0_$7 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
                          try
                          {
                            sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
                            try
                            {
                              final SubLObject tv_var = NIL;
                              final SubLObject _prev_bind_0_$8 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
                              final SubLObject _prev_bind_1_$8 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
                              try
                              {
                                sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym11$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ),
                                    thread );
                                if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
                                {
                                  final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                                  if( pcase_var.eql( $kw12$ERROR ) )
                                  {
                                    sbhl_paranoia.sbhl_error( ONE_INTEGER, $str13$_A_is_not_a__A, tv_var, $sym14$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                  }
                                  else if( pcase_var.eql( $kw15$CERROR ) )
                                  {
                                    sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str16$continue_anyway, $str13$_A_is_not_a__A, tv_var, $sym14$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                  }
                                  else if( pcase_var.eql( $kw17$WARN ) )
                                  {
                                    Errors.warn( $str13$_A_is_not_a__A, tv_var, $sym14$SBHL_TRUE_TV_P );
                                  }
                                  else
                                  {
                                    Errors.warn( $str18$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                                    Errors.cerror( $str16$continue_anyway, $str13$_A_is_not_a__A, tv_var, $sym14$SBHL_TRUE_TV_P );
                                  }
                                }
                                final SubLObject _prev_bind_0_$9 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                                final SubLObject _prev_bind_1_$9 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                                final SubLObject _prev_bind_2_$14 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                                final SubLObject _prev_bind_3_$15 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                                try
                                {
                                  sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const7$isa ) ), thread );
                                  sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                                      $const7$isa ) ) ), thread );
                                  sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars
                                      .get_sbhl_module( $const7$isa ) ) ), thread );
                                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                                  sbhl_module_vars.$sbhl_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const7$isa ) ), thread );
                                  if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( node_var, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                  {
                                    final SubLObject _prev_bind_0_$10 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                                    final SubLObject _prev_bind_1_$10 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                                    final SubLObject _prev_bind_2_$15 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                                    try
                                    {
                                      sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                                      sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities
                                          .get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const7$isa ) ) ), thread );
                                      sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_var_$8, UNPROVIDED );
                                      while ( NIL != node_var_$8)
                                      {
                                        final SubLObject tt_node_var = node_var_$8;
                                        SubLObject cdolist_list_var;
                                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const7$isa ) );
                                        SubLObject module_var = NIL;
                                        module_var = cdolist_list_var.first();
                                        while ( NIL != cdolist_list_var)
                                        {
                                          final SubLObject _prev_bind_0_$11 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                                          final SubLObject _prev_bind_1_$11 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean(
                                                NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                                            final SubLObject node = function_terms.naut_to_nart( tt_node_var );
                                            if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                                            {
                                              final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                              if( NIL != d_link )
                                              {
                                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module(
                                                    $const7$isa ) ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                                if( NIL != mt_links )
                                                {
                                                  SubLObject iteration_state;
                                                  for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents
                                                      .do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                                  {
                                                    thread.resetMultipleValues();
                                                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                                    {
                                                      final SubLObject _prev_bind_0_$12 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                                      try
                                                      {
                                                        sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                                        SubLObject iteration_state_$22;
                                                        for( iteration_state_$22 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents
                                                            .do_dictionary_contents_doneP( iteration_state_$22 ); iteration_state_$22 = dictionary_contents.do_dictionary_contents_next( iteration_state_$22 ) )
                                                        {
                                                          thread.resetMultipleValues();
                                                          final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$22 );
                                                          final SubLObject link_nodes = thread.secondMultipleValue();
                                                          thread.resetMultipleValues();
                                                          if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                                          {
                                                            final SubLObject _prev_bind_0_$13 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                                            try
                                                            {
                                                              sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                                              final SubLObject sol = link_nodes;
                                                              if( NIL != set.set_p( sol ) )
                                                              {
                                                                final SubLObject set_contents_var = set.do_set_internal( sol );
                                                                SubLObject basis_object;
                                                                SubLObject state;
                                                                SubLObject uom;
                                                                for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state(
                                                                    basis_object, set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state(
                                                                        state ) )
                                                                {
                                                                  uom = set_contents.do_set_contents_next( basis_object, state );
                                                                  if( NIL != set_contents.do_set_contents_element_validP( state, uom ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( uom,
                                                                      sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                                  {
                                                                    sbhl_marking_utilities.sbhl_mark_node_marked( uom, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                                    if( NIL != forts.fort_p( uom ) )
                                                                    {
                                                                      add_english_units_for_measure( uom );
                                                                      sofar = Numbers.add( sofar, ONE_INTEGER );
                                                                      utilities_macros.note_percent_progress( sofar, total );
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                              else if( sol.isList() )
                                                              {
                                                                SubLObject csome_list_var = sol;
                                                                SubLObject uom2 = NIL;
                                                                uom2 = csome_list_var.first();
                                                                while ( NIL != csome_list_var)
                                                                {
                                                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( uom2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                                  {
                                                                    sbhl_marking_utilities.sbhl_mark_node_marked( uom2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                                    if( NIL != forts.fort_p( uom2 ) )
                                                                    {
                                                                      add_english_units_for_measure( uom2 );
                                                                      sofar = Numbers.add( sofar, ONE_INTEGER );
                                                                      utilities_macros.note_percent_progress( sofar, total );
                                                                    }
                                                                  }
                                                                  csome_list_var = csome_list_var.rest();
                                                                  uom2 = csome_list_var.first();
                                                                }
                                                              }
                                                              else
                                                              {
                                                                Errors.error( $str19$_A_is_neither_SET_P_nor_LISTP_, sol );
                                                              }
                                                            }
                                                            finally
                                                            {
                                                              sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$13, thread );
                                                            }
                                                          }
                                                        }
                                                        dictionary_contents.do_dictionary_contents_finalize( iteration_state_$22 );
                                                      }
                                                      finally
                                                      {
                                                        sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$12, thread );
                                                      }
                                                    }
                                                  }
                                                  dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                                }
                                              }
                                              else
                                              {
                                                sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str20$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                              }
                                              if( NIL != sbhl_macros.do_sbhl_non_fort_linksP( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                              {
                                                SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup( node );
                                                SubLObject instance_tuple = NIL;
                                                instance_tuple = csome_list_var2.first();
                                                while ( NIL != csome_list_var2)
                                                {
                                                  SubLObject current;
                                                  final SubLObject datum = current = instance_tuple;
                                                  SubLObject link_node = NIL;
                                                  SubLObject mt2 = NIL;
                                                  SubLObject tv2 = NIL;
                                                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
                                                  link_node = current.first();
                                                  current = current.rest();
                                                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
                                                  mt2 = current.first();
                                                  current = current.rest();
                                                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
                                                  tv2 = current.first();
                                                  current = current.rest();
                                                  if( NIL == current )
                                                  {
                                                    if( NIL != mt_relevance_macros.relevant_mtP( mt2 ) )
                                                    {
                                                      final SubLObject _prev_bind_0_$14 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                                      try
                                                      {
                                                        sbhl_link_vars.$sbhl_link_mt$.bind( mt2, thread );
                                                        if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv2 ) )
                                                        {
                                                          final SubLObject _prev_bind_0_$15 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                                          try
                                                          {
                                                            sbhl_link_vars.$sbhl_link_tv$.bind( tv2, thread );
                                                            final SubLObject sol;
                                                            final SubLObject link_nodes2 = sol = ConsesLow.list( link_node );
                                                            if( NIL != set.set_p( sol ) )
                                                            {
                                                              final SubLObject set_contents_var = set.do_set_internal( sol );
                                                              SubLObject basis_object;
                                                              SubLObject state;
                                                              SubLObject uom;
                                                              for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state(
                                                                  basis_object, set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state(
                                                                      state ) )
                                                              {
                                                                uom = set_contents.do_set_contents_next( basis_object, state );
                                                                if( NIL != set_contents.do_set_contents_element_validP( state, uom ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( uom,
                                                                    sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                                {
                                                                  sbhl_marking_utilities.sbhl_mark_node_marked( uom, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                                  if( NIL != forts.fort_p( uom ) )
                                                                  {
                                                                    add_english_units_for_measure( uom );
                                                                    sofar = Numbers.add( sofar, ONE_INTEGER );
                                                                    utilities_macros.note_percent_progress( sofar, total );
                                                                  }
                                                                }
                                                              }
                                                            }
                                                            else if( sol.isList() )
                                                            {
                                                              SubLObject csome_list_var_$26 = sol;
                                                              SubLObject uom2 = NIL;
                                                              uom2 = csome_list_var_$26.first();
                                                              while ( NIL != csome_list_var_$26)
                                                              {
                                                                if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( uom2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                                {
                                                                  sbhl_marking_utilities.sbhl_mark_node_marked( uom2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                                  if( NIL != forts.fort_p( uom2 ) )
                                                                  {
                                                                    add_english_units_for_measure( uom2 );
                                                                    sofar = Numbers.add( sofar, ONE_INTEGER );
                                                                    utilities_macros.note_percent_progress( sofar, total );
                                                                  }
                                                                }
                                                                csome_list_var_$26 = csome_list_var_$26.rest();
                                                                uom2 = csome_list_var_$26.first();
                                                              }
                                                            }
                                                            else
                                                            {
                                                              Errors.error( $str19$_A_is_neither_SET_P_nor_LISTP_, sol );
                                                            }
                                                          }
                                                          finally
                                                          {
                                                            sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$15, thread );
                                                          }
                                                        }
                                                      }
                                                      finally
                                                      {
                                                        sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$14, thread );
                                                      }
                                                    }
                                                  }
                                                  else
                                                  {
                                                    cdestructuring_bind.cdestructuring_bind_error( datum, $list21 );
                                                  }
                                                  csome_list_var2 = csome_list_var2.rest();
                                                  instance_tuple = csome_list_var2.first();
                                                }
                                              }
                                            }
                                            else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                                            {
                                              SubLObject cdolist_list_var_$27;
                                              final SubLObject new_list = cdolist_list_var_$27 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                                  .get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const7$isa ) ),
                                                      sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                                  : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module(
                                                      $const7$isa ) ), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) );
                                              SubLObject generating_fn = NIL;
                                              generating_fn = cdolist_list_var_$27.first();
                                              while ( NIL != cdolist_list_var_$27)
                                              {
                                                final SubLObject _prev_bind_0_$16 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                                try
                                                {
                                                  sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                                  final SubLObject sol2;
                                                  final SubLObject link_nodes3 = sol2 = Functions.funcall( generating_fn, node );
                                                  if( NIL != set.set_p( sol2 ) )
                                                  {
                                                    final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                                    SubLObject basis_object2;
                                                    SubLObject state2;
                                                    SubLObject uom3;
                                                    for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                                        set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                                    {
                                                      uom3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                                      if( NIL != set_contents.do_set_contents_element_validP( state2, uom3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( uom3,
                                                          sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                      {
                                                        sbhl_marking_utilities.sbhl_mark_node_marked( uom3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                        if( NIL != forts.fort_p( uom3 ) )
                                                        {
                                                          add_english_units_for_measure( uom3 );
                                                          sofar = Numbers.add( sofar, ONE_INTEGER );
                                                          utilities_macros.note_percent_progress( sofar, total );
                                                        }
                                                      }
                                                    }
                                                  }
                                                  else if( sol2.isList() )
                                                  {
                                                    SubLObject csome_list_var3 = sol2;
                                                    SubLObject uom4 = NIL;
                                                    uom4 = csome_list_var3.first();
                                                    while ( NIL != csome_list_var3)
                                                    {
                                                      if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( uom4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                      {
                                                        sbhl_marking_utilities.sbhl_mark_node_marked( uom4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                        if( NIL != forts.fort_p( uom4 ) )
                                                        {
                                                          add_english_units_for_measure( uom4 );
                                                          sofar = Numbers.add( sofar, ONE_INTEGER );
                                                          utilities_macros.note_percent_progress( sofar, total );
                                                        }
                                                      }
                                                      csome_list_var3 = csome_list_var3.rest();
                                                      uom4 = csome_list_var3.first();
                                                    }
                                                  }
                                                  else
                                                  {
                                                    Errors.error( $str19$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                                  }
                                                }
                                                finally
                                                {
                                                  sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$16, thread );
                                                }
                                                cdolist_list_var_$27 = cdolist_list_var_$27.rest();
                                                generating_fn = cdolist_list_var_$27.first();
                                              }
                                            }
                                          }
                                          finally
                                          {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$11, thread );
                                            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$11, thread );
                                          }
                                          cdolist_list_var = cdolist_list_var.rest();
                                          module_var = cdolist_list_var.first();
                                        }
                                        SubLObject cdolist_list_var2;
                                        final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars
                                            .get_sbhl_module( $const7$isa ) ) );
                                        SubLObject module_var2 = NIL;
                                        module_var2 = cdolist_list_var2.first();
                                        while ( NIL != cdolist_list_var2)
                                        {
                                          final SubLObject _prev_bind_0_$17 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                                          final SubLObject _prev_bind_1_$12 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_module_vars.$sbhl_module$.bind( module_var2, thread );
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean(
                                                NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                                            final SubLObject node2 = function_terms.naut_to_nart( node_var_$8 );
                                            if( NIL != sbhl_link_vars.sbhl_node_object_p( node2 ) )
                                            {
                                              final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link( node2, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                              if( NIL != d_link2 )
                                              {
                                                final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links( d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                                if( NIL != mt_links2 )
                                                {
                                                  SubLObject iteration_state2;
                                                  for( iteration_state2 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links2 ) ); NIL == dictionary_contents
                                                      .do_dictionary_contents_doneP( iteration_state2 ); iteration_state2 = dictionary_contents.do_dictionary_contents_next( iteration_state2 ) )
                                                  {
                                                    thread.resetMultipleValues();
                                                    final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value( iteration_state2 );
                                                    final SubLObject tv_links2 = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if( NIL != mt_relevance_macros.relevant_mtP( mt3 ) )
                                                    {
                                                      final SubLObject _prev_bind_0_$18 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                                      try
                                                      {
                                                        sbhl_link_vars.$sbhl_link_mt$.bind( mt3, thread );
                                                        SubLObject iteration_state_$23;
                                                        for( iteration_state_$23 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links2 ) ); NIL == dictionary_contents
                                                            .do_dictionary_contents_doneP( iteration_state_$23 ); iteration_state_$23 = dictionary_contents.do_dictionary_contents_next( iteration_state_$23 ) )
                                                        {
                                                          thread.resetMultipleValues();
                                                          final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$23 );
                                                          final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                          thread.resetMultipleValues();
                                                          if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv2 ) )
                                                          {
                                                            final SubLObject _prev_bind_0_$19 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                                            try
                                                            {
                                                              sbhl_link_vars.$sbhl_link_tv$.bind( tv2, thread );
                                                              final SubLObject sol3 = link_nodes4;
                                                              if( NIL != set.set_p( sol3 ) )
                                                              {
                                                                final SubLObject set_contents_var3 = set.do_set_internal( sol3 );
                                                                SubLObject basis_object3;
                                                                SubLObject state3;
                                                                SubLObject node_vars_link_node;
                                                                for( basis_object3 = set_contents.do_set_contents_basis_object( set_contents_var3 ), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(
                                                                    basis_object3, set_contents_var3 ); NIL == set_contents.do_set_contents_doneP( basis_object3, state3 ); state3 = set_contents
                                                                        .do_set_contents_update_state( state3 ) )
                                                                {
                                                                  node_vars_link_node = set_contents.do_set_contents_next( basis_object3, state3 );
                                                                  if( NIL != set_contents.do_set_contents_element_validP( state3, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                                      node_vars_link_node, UNPROVIDED ) )
                                                                  {
                                                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                                    deck.deck_push( node_vars_link_node, recur_deck );
                                                                  }
                                                                }
                                                              }
                                                              else if( sol3.isList() )
                                                              {
                                                                SubLObject csome_list_var4 = sol3;
                                                                SubLObject node_vars_link_node2 = NIL;
                                                                node_vars_link_node2 = csome_list_var4.first();
                                                                while ( NIL != csome_list_var4)
                                                                {
                                                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                                  {
                                                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                                    deck.deck_push( node_vars_link_node2, recur_deck );
                                                                  }
                                                                  csome_list_var4 = csome_list_var4.rest();
                                                                  node_vars_link_node2 = csome_list_var4.first();
                                                                }
                                                              }
                                                              else
                                                              {
                                                                Errors.error( $str19$_A_is_neither_SET_P_nor_LISTP_, sol3 );
                                                              }
                                                            }
                                                            finally
                                                            {
                                                              sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$19, thread );
                                                            }
                                                          }
                                                        }
                                                        dictionary_contents.do_dictionary_contents_finalize( iteration_state_$23 );
                                                      }
                                                      finally
                                                      {
                                                        sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$18, thread );
                                                      }
                                                    }
                                                  }
                                                  dictionary_contents.do_dictionary_contents_finalize( iteration_state2 );
                                                }
                                              }
                                              else
                                              {
                                                sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str20$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                              }
                                            }
                                            else if( NIL != obsolete.cnat_p( node2, UNPROVIDED ) )
                                            {
                                              SubLObject cdolist_list_var_$28;
                                              final SubLObject new_list2 = cdolist_list_var_$28 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                                  .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                                      .get_sbhl_module( UNPROVIDED ) ) )
                                                  : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ),
                                                      sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) );
                                              SubLObject generating_fn2 = NIL;
                                              generating_fn2 = cdolist_list_var_$28.first();
                                              while ( NIL != cdolist_list_var_$28)
                                              {
                                                final SubLObject _prev_bind_0_$20 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                                try
                                                {
                                                  sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn2, thread );
                                                  final SubLObject sol4;
                                                  final SubLObject link_nodes5 = sol4 = Functions.funcall( generating_fn2, node2 );
                                                  if( NIL != set.set_p( sol4 ) )
                                                  {
                                                    final SubLObject set_contents_var4 = set.do_set_internal( sol4 );
                                                    SubLObject basis_object4;
                                                    SubLObject state4;
                                                    SubLObject node_vars_link_node3;
                                                    for( basis_object4 = set_contents.do_set_contents_basis_object( set_contents_var4 ), state4 = NIL, state4 = set_contents.do_set_contents_initial_state( basis_object4,
                                                        set_contents_var4 ); NIL == set_contents.do_set_contents_doneP( basis_object4, state4 ); state4 = set_contents.do_set_contents_update_state( state4 ) )
                                                    {
                                                      node_vars_link_node3 = set_contents.do_set_contents_next( basis_object4, state4 );
                                                      if( NIL != set_contents.do_set_contents_element_validP( state4, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                          node_vars_link_node3, UNPROVIDED ) )
                                                      {
                                                        sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                                        deck.deck_push( node_vars_link_node3, recur_deck );
                                                      }
                                                    }
                                                  }
                                                  else if( sol4.isList() )
                                                  {
                                                    SubLObject csome_list_var5 = sol4;
                                                    SubLObject node_vars_link_node4 = NIL;
                                                    node_vars_link_node4 = csome_list_var5.first();
                                                    while ( NIL != csome_list_var5)
                                                    {
                                                      if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                                      {
                                                        sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                                        deck.deck_push( node_vars_link_node4, recur_deck );
                                                      }
                                                      csome_list_var5 = csome_list_var5.rest();
                                                      node_vars_link_node4 = csome_list_var5.first();
                                                    }
                                                  }
                                                  else
                                                  {
                                                    Errors.error( $str19$_A_is_neither_SET_P_nor_LISTP_, sol4 );
                                                  }
                                                }
                                                finally
                                                {
                                                  sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$20, thread );
                                                }
                                                cdolist_list_var_$28 = cdolist_list_var_$28.rest();
                                                generating_fn2 = cdolist_list_var_$28.first();
                                              }
                                            }
                                          }
                                          finally
                                          {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$12, thread );
                                            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$17, thread );
                                          }
                                          cdolist_list_var2 = cdolist_list_var2.rest();
                                          module_var2 = cdolist_list_var2.first();
                                        }
                                        node_var_$8 = deck.deck_pop( recur_deck );
                                      }
                                    }
                                    finally
                                    {
                                      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$15, thread );
                                      sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$10, thread );
                                      sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$10, thread );
                                    }
                                  }
                                  else
                                  {
                                    sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str22$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ),
                                        UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                  }
                                }
                                finally
                                {
                                  sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_3_$15, thread );
                                  sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_2_$14, thread );
                                  sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$9, thread );
                                  sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$9, thread );
                                }
                              }
                              finally
                              {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$8, thread );
                                sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$8, thread );
                              }
                            }
                            finally
                            {
                              final SubLObject _prev_bind_0_$21 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                              try
                              {
                                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                final SubLObject _values = Values.getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
                                Values.restoreValuesFromVector( _values );
                              }
                              finally
                              {
                                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$21, thread );
                              }
                            }
                          }
                          finally
                          {
                            sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$7, thread );
                          }
                        }
                        finally
                        {
                          final SubLObject _prev_bind_0_$22 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                          try
                          {
                            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                            final SubLObject _values2 = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                            Values.restoreValuesFromVector( _values2 );
                          }
                          finally
                          {
                            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$22, thread );
                          }
                        }
                      }
                      finally
                      {
                        sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_1_$7, thread );
                        sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$6, thread );
                      }
                    }
                    finally
                    {
                      final SubLObject _prev_bind_0_$23 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                      try
                      {
                        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                        final SubLObject _values3 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector( _values3 );
                      }
                      finally
                      {
                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$23, thread );
                      }
                    }
                  }
                  finally
                  {
                    utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
                    utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
                    utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
                    utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$5, thread );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$24 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values4 = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
                    Values.restoreValuesFromVector( _values4 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$24, thread );
                  }
                }
              }
              finally
              {
                memoization_state.$memoization_state$.rebind( _prev_bind_0_$4, thread );
              }
            }
            finally
            {
              pph_macros.$pph_external_memoization_state$.rebind( _prev_bind_0_$3, thread );
            }
            if( new_or_reused == $kw23$NEW && NIL != memoization_state.memoization_state_p( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) ) )
            {
              memoization_state.clear_all_memoization( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) );
            }
          }
          finally
          {
            pph_macros.$pph_memoization_state$.rebind( _prev_bind_0_$2, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$25 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values5 = Values.getValuesAsVector();
            if( NIL == reuseP )
            {
              pph_macros.free_pph_problem_store_pointer( pph_macros.$pph_problem_store_pointer$.getDynamicValue( thread ) );
            }
            Values.restoreValuesFromVector( _values5 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$25, thread );
          }
        }
      }
      finally
      {
        pph_macros.$pph_problem_store_pointer$.rebind( _prev_bind_0_$1, thread );
      }
    }
    finally
    {
      pph_macros.$free_pph_problem_store_pointers$.rebind( _prev_bind_0, thread );
    }
    return $english_units_of_measure$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/english-quantity-parser.lisp", position = 2566L)
  public static SubLObject add_english_units_for_measure(final SubLObject unit_of_measure)
  {
    if( NIL != misc_utilities.initialized_p( $english_units_of_measure$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = pph_methods_lexicon.all_phrases_for_term( unit_of_measure, $kw24$ALL, $list25, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      SubLObject phrase = NIL;
      phrase = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != list_utilities.lengthE( document.string_wordify( phrase, UNPROVIDED ), ONE_INTEGER, UNPROVIDED ) )
        {
          $english_units_of_measure$.setGlobalValue( list_utilities.alist_push( $english_units_of_measure$.getGlobalValue(), phrase, unit_of_measure, Symbols.symbol_function( EQUALP ) ) );
        }
        cdolist_list_var = cdolist_list_var.rest();
        phrase = cdolist_list_var.first();
      }
    }
    return $kw26$DONE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/english-quantity-parser.lisp", position = 2989L)
  public static SubLObject dump_english_units_of_measure_to_stream(final SubLObject stream)
  {
    cfasl.cfasl_output( english_units_of_measure(), stream );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/english-quantity-parser.lisp", position = 3121L)
  public static SubLObject load_english_units_of_measure_from_stream(final SubLObject stream)
  {
    $english_units_of_measure$.setGlobalValue( cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/english-quantity-parser.lisp", position = 3262L)
  public static SubLObject dollar_signP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && NIL != Strings.stringE( document.sign_string( v_object ), $str27$_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/english-quantity-parser.lisp", position = 3368L)
  public static SubLObject dollar_sign_literalP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && NIL != dollar_signP( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/english-quantity-parser.lisp", position = 3476L)
  public static SubLObject build_unit_of_measure(final SubLObject fst)
  {
    final SubLObject word = finite_state_transducer.fst_output( fst ).first();
    final SubLObject uoms = list_utilities.alist_lookup( english_units_of_measure(), document.word_string( word ), Symbols.symbol_function( EQUALP ), UNPROVIDED );
    document.word_update( word, ConsesLow.list( $kw28$CATEGORY, conses_high.adjoin( $kw3$UNIT_OF_MEASURE, document.word_category( word ), UNPROVIDED, UNPROVIDED ), $kw29$INFO, uoms ) );
    return word;
  }

  @SubLTranslatedFile.SubL(source = "cycl/english-quantity-parser.lisp", position = 3979L)
  public static SubLObject unit_of_measure_fst()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $unit_of_measure$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/english-quantity-parser.lisp", position = 4046L)
  public static SubLObject build_dollar_sign_plus_number(final SubLObject fst)
  {
    final SubLObject phrase = document.new_phrase( UNPROVIDED );
    final SubLObject number = document.sign_info( conses_high.second( finite_state_transducer.fst_output( fst ) ) );
    final SubLObject dollar_amount = el_utilities.make_unary_formula( $const34$Dollar_UnitedStates, number );
    document.phrase_update( phrase, ConsesLow.list( $kw28$CATEGORY, conses_high.adjoin( $kw2$QUANTITY, document.phrase_category( phrase ), UNPROVIDED, UNPROVIDED ), $kw35$STRING, Functions.apply( $sym36$CCONCATENATE,
        Mapping.mapcar( Symbols.symbol_function( $sym37$SIGN_STRING ), finite_state_transducer.fst_output( fst ) ) ), $kw38$CONSTITUENTS, Functions.apply( Symbols.symbol_function( $sym39$VECTOR ), finite_state_transducer
            .fst_output( fst ) ), $kw29$INFO, ConsesLow.list( dollar_amount ) ) );
    return phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/english-quantity-parser.lisp", position = 4730L)
  public static SubLObject dollar_sign_plus_number_fst()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $dollar_sign_plus_number$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/english-quantity-parser.lisp", position = 4813L)
  public static SubLObject build_unary_quantity_phrase(final SubLObject fst)
  {
    final SubLObject phrase = document.new_phrase( UNPROVIDED );
    final SubLObject number = document.sign_info( finite_state_transducer.fst_output( fst ).first() );
    SubLObject v_quantities = NIL;
    SubLObject cdolist_list_var = document.sign_info( conses_high.second( finite_state_transducer.fst_output( fst ) ) );
    SubLObject uom = NIL;
    uom = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      v_quantities = ConsesLow.cons( el_utilities.make_unary_formula( uom, number ), v_quantities );
      cdolist_list_var = cdolist_list_var.rest();
      uom = cdolist_list_var.first();
    }
    document.phrase_update( phrase, ConsesLow.list( $kw28$CATEGORY, ConsesLow.list( $kw2$QUANTITY ), $kw35$STRING, string_utilities.bunge( Mapping.mapcar( Symbols.symbol_function( $sym37$SIGN_STRING ),
        finite_state_transducer.fst_output( fst ) ), UNPROVIDED ), $kw38$CONSTITUENTS, Functions.apply( Symbols.symbol_function( $sym39$VECTOR ), finite_state_transducer.fst_output( fst ) ), $kw29$INFO, v_quantities ) );
    return phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/english-quantity-parser.lisp", position = 5536L)
  public static SubLObject unary_quantity_fst()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $unary_quantity$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/english-quantity-parser.lisp", position = 5601L)
  public static SubLObject build_binary_quantity_phrase(final SubLObject fst)
  {
    final SubLObject phrase = document.new_phrase( UNPROVIDED );
    final SubLObject quantities1 = document.sign_info( finite_state_transducer.fst_output( fst ).first() );
    final SubLObject quantities2 = document.sign_info( conses_high.second( finite_state_transducer.fst_output( fst ) ) );
    SubLObject v_quantities = NIL;
    SubLObject cdolist_list_var = quantities1;
    SubLObject quantity1 = NIL;
    quantity1 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$41 = quantities2;
      SubLObject quantity2 = NIL;
      quantity2 = cdolist_list_var_$41.first();
      while ( NIL != cdolist_list_var_$41)
      {
        final SubLObject unit1 = quantities.explode_interval( quantity1 );
        final SubLObject unit2 = quantities.explode_interval( quantity2 );
        if( NIL != quantities.comparable_units( unit1, unit2 ) && NIL != quantities.smaller_unit_than( unit2, unit1 ) )
        {
          v_quantities = ConsesLow.cons( el_utilities.make_binary_formula( $const48$PlusFn, quantity1, quantity2 ), v_quantities );
        }
        cdolist_list_var_$41 = cdolist_list_var_$41.rest();
        quantity2 = cdolist_list_var_$41.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      quantity1 = cdolist_list_var.first();
    }
    document.phrase_update( phrase, ConsesLow.list( $kw28$CATEGORY, ConsesLow.list( $kw2$QUANTITY ), $kw35$STRING, string_utilities.bunge( Mapping.mapcar( Symbols.symbol_function( $sym37$SIGN_STRING ),
        finite_state_transducer.fst_output( fst ) ), UNPROVIDED ), $kw38$CONSTITUENTS, Functions.apply( Symbols.symbol_function( $sym39$VECTOR ), finite_state_transducer.fst_output( fst ) ), $kw29$INFO, v_quantities ) );
    return phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/english-quantity-parser.lisp", position = 6568L)
  public static SubLObject binary_quantity_fst()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $binary_quantity$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/english-quantity-parser.lisp", position = 6689L)
  public static SubLObject english_quantity_parser()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == finite_state_cascade_parser.finite_state_cascade_parser_p( $english_quantity_parser$.getDynamicValue( thread ) ) )
    {
      $english_quantity_parser$.setDynamicValue( finite_state_cascade_parser.new_finite_state_cascade_parser( ConsesLow.list( dollar_sign_plus_number_fst(), unit_of_measure_fst(), unary_quantity_fst(),
          binary_quantity_fst() ), UNPROVIDED ), thread );
    }
    return $english_quantity_parser$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/english-quantity-parser.lisp", position = 7036L)
  public static SubLObject string_to_quantities(final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( string ) : string;
    final SubLObject standardized_number_string = numeral_parser.standardize_number_string( string, UNPROVIDED );
    final SubLObject tokens = document.string_wordify( standardized_number_string, UNPROVIDED );
    final SubLObject numeric_parse = finite_state_cascade_parser.fscp_parse( numeral_parser.$english_interval_parser$.getDynamicValue( thread ), tokens );
    return numeric_parse_to_quantities( numeric_parse );
  }

  @SubLTranslatedFile.SubL(source = "cycl/english-quantity-parser.lisp", position = 7444L)
  public static SubLObject numeric_parse_to_quantities(final SubLObject numeric_parse)
  {
    final SubLObject quantity_parse = finite_state_cascade_parser.fscp_parse( english_quantity_parser(), numeric_parse );
    SubLObject ans = NIL;
    if( NIL != list_utilities.singletonP( quantity_parse ) )
    {
      final SubLObject quantity_phrase = quantity_parse.first();
      if( NIL != quantity_signP( quantity_phrase ) )
      {
        SubLObject cdolist_list_var = document.sign_info( quantity_phrase );
        SubLObject cycl = NIL;
        cycl = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject item_var = cycl;
          if( NIL == conses_high.member( item_var, ans, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            ans = ConsesLow.cons( item_var, ans );
          }
          cdolist_list_var = cdolist_list_var.rest();
          cycl = cdolist_list_var.first();
        }
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/english-quantity-parser.lisp", position = 8683L)
  public static SubLObject test_string_to_quantities(final SubLObject string)
  {
    final SubLObject raw_result = string_to_quantities( string );
    if( NIL == raw_result )
    {
      return raw_result;
    }
    return list_utilities.only_one( raw_result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/english-quantity-parser.lisp", position = 8683L)
  public static SubLObject equal_quantities(final SubLObject q1, final SubLObject q2)
  {
    return ( NIL == q1 ) ? Types.sublisp_null( q2 ) : arithmetic.cyc_numerically_equal( q1, q2 );
  }

  public static SubLObject declare_english_quantity_parser_file()
  {
    SubLFiles.declareFunction( me, "quantity_signP", "QUANTITY-SIGN?", 1, 0, false );
    SubLFiles.declareFunction( me, "unit_of_measure_signP", "UNIT-OF-MEASURE-SIGN?", 1, 0, false );
    SubLFiles.declareFunction( me, "unit_of_measure_literalP", "UNIT-OF-MEASURE-LITERAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_english_units_of_measure", "CLEAR-ENGLISH-UNITS-OF-MEASURE", 0, 1, false );
    SubLFiles.declareFunction( me, "english_units_of_measure", "ENGLISH-UNITS-OF-MEASURE", 0, 0, false );
    SubLFiles.declareFunction( me, "ensure_english_units_of_measure_initialization", "ENSURE-ENGLISH-UNITS-OF-MEASURE-INITIALIZATION", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_english_units_of_measure", "INITIALIZE-ENGLISH-UNITS-OF-MEASURE", 0, 0, false );
    SubLFiles.declareFunction( me, "add_english_units_for_measure", "ADD-ENGLISH-UNITS-FOR-MEASURE", 1, 0, false );
    SubLFiles.declareFunction( me, "dump_english_units_of_measure_to_stream", "DUMP-ENGLISH-UNITS-OF-MEASURE-TO-STREAM", 1, 0, false );
    SubLFiles.declareFunction( me, "load_english_units_of_measure_from_stream", "LOAD-ENGLISH-UNITS-OF-MEASURE-FROM-STREAM", 1, 0, false );
    SubLFiles.declareFunction( me, "dollar_signP", "DOLLAR-SIGN?", 1, 0, false );
    SubLFiles.declareFunction( me, "dollar_sign_literalP", "DOLLAR-SIGN-LITERAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "build_unit_of_measure", "BUILD-UNIT-OF-MEASURE", 1, 0, false );
    SubLFiles.declareFunction( me, "unit_of_measure_fst", "UNIT-OF-MEASURE-FST", 0, 0, false );
    SubLFiles.declareFunction( me, "build_dollar_sign_plus_number", "BUILD-DOLLAR-SIGN-PLUS-NUMBER", 1, 0, false );
    SubLFiles.declareFunction( me, "dollar_sign_plus_number_fst", "DOLLAR-SIGN-PLUS-NUMBER-FST", 0, 0, false );
    SubLFiles.declareFunction( me, "build_unary_quantity_phrase", "BUILD-UNARY-QUANTITY-PHRASE", 1, 0, false );
    SubLFiles.declareFunction( me, "unary_quantity_fst", "UNARY-QUANTITY-FST", 0, 0, false );
    SubLFiles.declareFunction( me, "build_binary_quantity_phrase", "BUILD-BINARY-QUANTITY-PHRASE", 1, 0, false );
    SubLFiles.declareFunction( me, "binary_quantity_fst", "BINARY-QUANTITY-FST", 0, 0, false );
    SubLFiles.declareFunction( me, "english_quantity_parser", "ENGLISH-QUANTITY-PARSER", 0, 0, false );
    SubLFiles.declareFunction( me, "string_to_quantities", "STRING-TO-QUANTITIES", 1, 0, false );
    SubLFiles.declareFunction( me, "numeric_parse_to_quantities", "NUMERIC-PARSE-TO-QUANTITIES", 1, 0, false );
    SubLFiles.declareFunction( me, "test_string_to_quantities", "TEST-STRING-TO-QUANTITIES", 1, 0, false );
    SubLFiles.declareFunction( me, "equal_quantities", "EQUAL-QUANTITIES", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_english_quantity_parser_file()
  {
    $english_units_of_measure$ = SubLFiles.deflexical( "*ENGLISH-UNITS-OF-MEASURE*", ( maybeDefault( $sym0$_ENGLISH_UNITS_OF_MEASURE_, $english_units_of_measure$, $kw1$UNINITIALIZED ) ) );
    $unit_of_measure$ = SubLFiles.defparameter( "*UNIT-OF-MEASURE*", finite_state_transducer.new_finite_state_transducer( ZERO_INTEGER, $list30, ConsesLow.list( ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function(
        $sym31$UNIT_OF_MEASURE_LITERAL_ ), $list32 ) ), Symbols.symbol_function( $sym33$BUILD_UNIT_OF_MEASURE ) ) );
    $dollar_sign_plus_number$ = SubLFiles.defparameter( "*DOLLAR-SIGN-PLUS-NUMBER*", finite_state_transducer.new_finite_state_transducer( ZERO_INTEGER, $list40, ConsesLow.list( ConsesLow.listS( ZERO_INTEGER, Symbols
        .symbol_function( $sym41$DOLLAR_SIGN_LITERAL_ ), $list32 ), ConsesLow.listS( ONE_INTEGER, Symbols.symbol_function( $sym42$NUMBER_SIGN_ ), $list43 ) ), Symbols.symbol_function(
            $sym44$BUILD_DOLLAR_SIGN_PLUS_NUMBER ) ) );
    $unary_quantity$ = SubLFiles.defparameter( "*UNARY-QUANTITY*", finite_state_transducer.new_finite_state_transducer( ZERO_INTEGER, $list40, ConsesLow.list( ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function(
        $sym45$INTERVAL_SIGN_ ), $list32 ), ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function( $sym42$NUMBER_SIGN_ ), $list32 ), ConsesLow.listS( ONE_INTEGER, Symbols.symbol_function( $sym46$UNIT_OF_MEASURE_SIGN_ ),
            $list43 ) ), Symbols.symbol_function( $sym47$BUILD_UNARY_QUANTITY_PHRASE ) ) );
    $binary_quantity$ = SubLFiles.defparameter( "*BINARY-QUANTITY*", finite_state_transducer.new_finite_state_transducer( ZERO_INTEGER, $list40, ConsesLow.list( ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function(
        $sym49$QUANTITY_SIGN_ ), $list32 ), ConsesLow.listS( ONE_INTEGER, Symbols.symbol_function( $sym49$QUANTITY_SIGN_ ), $list43 ) ), Symbols.symbol_function( $sym50$BUILD_BINARY_QUANTITY_PHRASE ) ) );
    $english_quantity_parser$ = SubLFiles.defparameter( "*ENGLISH-QUANTITY-PARSER*", NIL );
    return NIL;
  }

  public static SubLObject setup_english_quantity_parser_file()
  {
    subl_macro_promotions.declare_defglobal( $sym0$_ENGLISH_UNITS_OF_MEASURE_ );
    generic_testing.define_test_case_table_int( $sym52$TEST_STRING_TO_QUANTITIES, ConsesLow.list( new SubLObject[] { $kw53$TEST, $sym54$EQUAL_QUANTITIES, $kw55$OWNER, NIL, $kw56$CLASSES, NIL, $kw57$KB, $kw58$FULL,
      $kw59$WORKING_, T
    } ), $list60 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_english_quantity_parser_file();
  }

  @Override
  public void initializeVariables()
  {
    init_english_quantity_parser_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_english_quantity_parser_file();
  }
  static
  {
    me = new english_quantity_parser();
    $english_units_of_measure$ = null;
    $unit_of_measure$ = null;
    $dollar_sign_plus_number$ = null;
    $unary_quantity$ = null;
    $binary_quantity$ = null;
    $english_quantity_parser$ = null;
    $sym0$_ENGLISH_UNITS_OF_MEASURE_ = makeSymbol( "*ENGLISH-UNITS-OF-MEASURE*" );
    $kw1$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $kw2$QUANTITY = makeKeyword( "QUANTITY" );
    $kw3$UNIT_OF_MEASURE = makeKeyword( "UNIT-OF-MEASURE" );
    $sym4$NUMERAL_PARSER_STRING_ = makeSymbol( "NUMERAL-PARSER-STRING=" );
    $const5$UnitOfMeasure = constant_handles.reader_make_constant_shell( makeString( "UnitOfMeasure" ) );
    $str6$Initializing_English_units_of_mea = makeString( "Initializing English units of measure..." );
    $const7$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $kw8$BREADTH = makeKeyword( "BREADTH" );
    $kw9$QUEUE = makeKeyword( "QUEUE" );
    $kw10$STACK = makeKeyword( "STACK" );
    $sym11$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol( "RELEVANT-SBHL-TV-IS-GENERAL-TV" );
    $kw12$ERROR = makeKeyword( "ERROR" );
    $str13$_A_is_not_a__A = makeString( "~A is not a ~A" );
    $sym14$SBHL_TRUE_TV_P = makeSymbol( "SBHL-TRUE-TV-P" );
    $kw15$CERROR = makeKeyword( "CERROR" );
    $str16$continue_anyway = makeString( "continue anyway" );
    $kw17$WARN = makeKeyword( "WARN" );
    $str18$_A_is_not_a_valid__sbhl_type_erro = makeString( "~A is not a valid *sbhl-type-error-action* value" );
    $str19$_A_is_neither_SET_P_nor_LISTP_ = makeString( "~A is neither SET-P nor LISTP." );
    $str20$attempting_to_bind_direction_link = makeString( "attempting to bind direction link variable, to NIL. macro body not executed." );
    $list21 = ConsesLow.list( makeUninternedSymbol( "LINK-NODE" ), makeUninternedSymbol( "MT" ), makeUninternedSymbol( "TV" ) );
    $str22$Node__a_does_not_pass_sbhl_type_t = makeString( "Node ~a does not pass sbhl-type-test ~a~%" );
    $kw23$NEW = makeKeyword( "NEW" );
    $kw24$ALL = makeKeyword( "ALL" );
    $list25 = ConsesLow.list( makeKeyword( "ABBREVS" ), makeKeyword( "ACRONYMS" ) );
    $kw26$DONE = makeKeyword( "DONE" );
    $str27$_ = makeString( "$" );
    $kw28$CATEGORY = makeKeyword( "CATEGORY" );
    $kw29$INFO = makeKeyword( "INFO" );
    $list30 = ConsesLow.list( ONE_INTEGER );
    $sym31$UNIT_OF_MEASURE_LITERAL_ = makeSymbol( "UNIT-OF-MEASURE-LITERAL?" );
    $list32 = ConsesLow.list( ConsesLow.list( makeKeyword( "EMIT" ) ), ONE_INTEGER );
    $sym33$BUILD_UNIT_OF_MEASURE = makeSymbol( "BUILD-UNIT-OF-MEASURE" );
    $const34$Dollar_UnitedStates = constant_handles.reader_make_constant_shell( makeString( "Dollar-UnitedStates" ) );
    $kw35$STRING = makeKeyword( "STRING" );
    $sym36$CCONCATENATE = makeSymbol( "CCONCATENATE" );
    $sym37$SIGN_STRING = makeSymbol( "SIGN-STRING" );
    $kw38$CONSTITUENTS = makeKeyword( "CONSTITUENTS" );
    $sym39$VECTOR = makeSymbol( "VECTOR" );
    $list40 = ConsesLow.list( TWO_INTEGER );
    $sym41$DOLLAR_SIGN_LITERAL_ = makeSymbol( "DOLLAR-SIGN-LITERAL?" );
    $sym42$NUMBER_SIGN_ = makeSymbol( "NUMBER-SIGN?" );
    $list43 = ConsesLow.list( ConsesLow.list( makeKeyword( "EMIT" ) ), TWO_INTEGER );
    $sym44$BUILD_DOLLAR_SIGN_PLUS_NUMBER = makeSymbol( "BUILD-DOLLAR-SIGN-PLUS-NUMBER" );
    $sym45$INTERVAL_SIGN_ = makeSymbol( "INTERVAL-SIGN?" );
    $sym46$UNIT_OF_MEASURE_SIGN_ = makeSymbol( "UNIT-OF-MEASURE-SIGN?" );
    $sym47$BUILD_UNARY_QUANTITY_PHRASE = makeSymbol( "BUILD-UNARY-QUANTITY-PHRASE" );
    $const48$PlusFn = constant_handles.reader_make_constant_shell( makeString( "PlusFn" ) );
    $sym49$QUANTITY_SIGN_ = makeSymbol( "QUANTITY-SIGN?" );
    $sym50$BUILD_BINARY_QUANTITY_PHRASE = makeSymbol( "BUILD-BINARY-QUANTITY-PHRASE" );
    $sym51$STRINGP = makeSymbol( "STRINGP" );
    $sym52$TEST_STRING_TO_QUANTITIES = makeSymbol( "TEST-STRING-TO-QUANTITIES" );
    $kw53$TEST = makeKeyword( "TEST" );
    $sym54$EQUAL_QUANTITIES = makeSymbol( "EQUAL-QUANTITIES" );
    $kw55$OWNER = makeKeyword( "OWNER" );
    $kw56$CLASSES = makeKeyword( "CLASSES" );
    $kw57$KB = makeKeyword( "KB" );
    $kw58$FULL = makeKeyword( "FULL" );
    $kw59$WORKING_ = makeKeyword( "WORKING?" );
    $list60 = ConsesLow.list( new SubLObject[] { ConsesLow.list( ConsesLow.list( makeString( "two miles" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Mile" ) ), TWO_INTEGER ) ),
      ConsesLow.list( ConsesLow.list( makeString( "2 miles" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Mile" ) ), TWO_INTEGER ) ), ConsesLow.list( ConsesLow.list( makeString(
          "2.5 miles" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Mile" ) ), makeDouble( 2.5 ) ) ), ConsesLow.list( ConsesLow.list( makeString( "512 mph" ) ), ConsesLow.list(
              constant_handles.reader_make_constant_shell( makeString( "MilesPerHour" ) ), makeInteger( 512 ) ) ), ConsesLow.list( ConsesLow.list( makeString( "512 yrs" ) ), ConsesLow.list( constant_handles
                  .reader_make_constant_shell( makeString( "YearsDuration" ) ), makeInteger( 512 ) ) ), ConsesLow.list( ConsesLow.list( makeString( "$512" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                      makeString( "Dollar-UnitedStates" ) ), makeInteger( 512 ) ) ), ConsesLow.list( ConsesLow.list( makeString( "$512.3" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                          "Dollar-UnitedStates" ) ), makeDouble( 512.3 ) ) ), ConsesLow.list( ConsesLow.list( makeString( "$512.3 million" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                              "Dollar-UnitedStates" ) ), makeDouble( 5.123E8 ) ) ), ConsesLow.list( ConsesLow.list( makeString( "$" ) ), NIL )
    } );
  }
}
/*
 * 
 * Total time: 1591 ms
 * 
 */