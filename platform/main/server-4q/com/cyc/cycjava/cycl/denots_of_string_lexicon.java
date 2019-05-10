package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class denots_of_string_lexicon
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.denots_of_string_lexicon";
  public static final String myFingerPrint = "aa0d0a70de10a580ca916bc4f60653a6c49a9be8f60281722e9c5d7e89482dbb";
  private static final SubLSymbol $sym0$LEXICON_FOR_DENOTS_OF_STRING;
  private static final SubLSymbol $kw1$DENOT;
  private static final SubLSymbol $sym2$SET_CASE_SENSITIVITY;
  private static final SubLSymbol $sym3$CONVERT_TO_EL_;
  private static final SubLSymbol $sym4$DEFAULT_EXCLUDE_MTS;
  private static final SubLSymbol $sym5$SET_BASE_MT;
  private static final SubLSymbol $sym6$INITIALIZE_ALLOWED_MTS;
  private static final SubLSymbol $sym7$ALLOW_MT;
  private static final SubLObject $const8$CommonEnglishMisspellingsMt;
  private static final SubLSymbol $sym9$FORBID_MT;
  private static final SubLSymbol $sym10$INITIALIZE_EXCLUDED_PREDS;
  private static final SubLList $list11;
  private static final SubLSymbol $sym12$EXCLUDE_PREDICATE;
  private static final SubLSymbol $kw13$ACRONYMS;
  private static final SubLSymbol $kw14$ABBREVS;
  private static final SubLSymbol $kw15$ANY;
  private static final SubLSymbol $sym16$ALLOW_PREDICATE;
  private static final SubLSymbol $sym17$GET;
  private static final SubLSymbol $kw18$PREDICATE;
  private static final SubLSymbol $kw19$INFLECTIONS;

  @SubLTranslatedFile.SubL(source = "cycl/denots-of-string-lexicon.lisp", position = 897L)
  public static SubLObject lexicon_for_denots_of_string_internal(SubLObject abbrev_types, SubLObject denot_type, SubLObject misspellingsP, SubLObject skip_namestringsP, SubLObject lookup_mt, SubLObject case_sensitivity)
  {
    if( abbrev_types == UNPROVIDED )
    {
      abbrev_types = NIL;
    }
    if( denot_type == UNPROVIDED )
    {
      denot_type = $kw1$DENOT;
    }
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = T;
    }
    if( skip_namestringsP == UNPROVIDED )
    {
      skip_namestringsP = NIL;
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( case_sensitivity == UNPROVIDED )
    {
      case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject lexicon = term_lexicon.new_term_lexicon();
    methods.funcall_instance_method_with_1_args( lexicon, $sym2$SET_CASE_SENSITIVITY, case_sensitivity );
    instances.set_slot( lexicon, $sym3$CONVERT_TO_EL_, NIL );
    instances.set_slot( lexicon, $sym4$DEFAULT_EXCLUDE_MTS, NIL );
    methods.funcall_instance_method_with_1_args( lexicon, $sym5$SET_BASE_MT, lookup_mt );
    methods.funcall_instance_method_with_0_args( lexicon, $sym6$INITIALIZE_ALLOWED_MTS );
    if( NIL != misspellingsP )
    {
      methods.funcall_instance_method_with_1_args( lexicon, $sym7$ALLOW_MT, $const8$CommonEnglishMisspellingsMt );
    }
    else
    {
      methods.funcall_instance_method_with_1_args( lexicon, $sym9$FORBID_MT, $const8$CommonEnglishMisspellingsMt );
    }
    methods.funcall_instance_method_with_1_args( lexicon, $sym10$INITIALIZE_EXCLUDED_PREDS, NIL );
    if( NIL != skip_namestringsP )
    {
      SubLObject iterator = map_utilities.new_map_iterator( lexicon_vars.name_string_preds_set( UNPROVIDED ) );
      SubLObject valid;
      for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
      {
        thread.resetMultipleValues();
        final SubLObject var = iteration.iteration_next( iterator );
        valid = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != valid )
        {
          SubLObject current;
          final SubLObject datum = current = var;
          SubLObject pred = NIL;
          SubLObject value = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list11 );
          pred = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list11 );
          value = current.first();
          current = current.rest();
          if( NIL == current )
          {
            methods.funcall_instance_method_with_1_args( lexicon, $sym12$EXCLUDE_PREDICATE, pred );
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list11 );
          }
        }
      }
      iterator = map_utilities.new_map_iterator( lexicon_vars.term_strings_preds_set( UNPROVIDED ) );
      for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
      {
        thread.resetMultipleValues();
        final SubLObject var = iteration.iteration_next( iterator );
        valid = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != valid )
        {
          SubLObject current;
          final SubLObject datum = current = var;
          SubLObject pred = NIL;
          SubLObject value = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list11 );
          pred = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list11 );
          value = current.first();
          current = current.rest();
          if( NIL == current )
          {
            methods.funcall_instance_method_with_1_args( lexicon, $sym12$EXCLUDE_PREDICATE, pred );
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list11 );
          }
        }
      }
    }
    if( NIL == subl_promotions.memberP( $kw13$ACRONYMS, abbrev_types, UNPROVIDED, UNPROVIDED ) )
    {
      SubLObject cdolist_list_var = lexicon_vars.acronym_predicates();
      SubLObject pred2 = NIL;
      pred2 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        methods.funcall_instance_method_with_1_args( lexicon, $sym12$EXCLUDE_PREDICATE, pred2 );
        cdolist_list_var = cdolist_list_var.rest();
        pred2 = cdolist_list_var.first();
      }
    }
    if( NIL == subl_promotions.memberP( $kw14$ABBREVS, abbrev_types, UNPROVIDED, UNPROVIDED ) )
    {
      SubLObject cdolist_list_var = lexicon_vars.abbreviation_predicates();
      SubLObject pred2 = NIL;
      pred2 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        methods.funcall_instance_method_with_1_args( lexicon, $sym12$EXCLUDE_PREDICATE, pred2 );
        cdolist_list_var = cdolist_list_var.rest();
        pred2 = cdolist_list_var.first();
      }
    }
    SubLObject cdolist_list_var = lexicon_accessors.determine_denotation_preds( $kw15$ANY );
    SubLObject denotation_pred = NIL;
    denotation_pred = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      methods.funcall_instance_method_with_1_args( lexicon, $sym12$EXCLUDE_PREDICATE, denotation_pred );
      cdolist_list_var = cdolist_list_var.rest();
      denotation_pred = cdolist_list_var.first();
    }
    cdolist_list_var = lexicon_accessors.determine_denotation_preds( denot_type );
    denotation_pred = NIL;
    denotation_pred = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      methods.funcall_instance_method_with_1_args( lexicon, $sym16$ALLOW_PREDICATE, denotation_pred );
      cdolist_list_var = cdolist_list_var.rest();
      denotation_pred = cdolist_list_var.first();
    }
    return lexicon;
  }

  @SubLTranslatedFile.SubL(source = "cycl/denots-of-string-lexicon.lisp", position = 897L)
  public static SubLObject lexicon_for_denots_of_string(SubLObject abbrev_types, SubLObject denot_type, SubLObject misspellingsP, SubLObject skip_namestringsP, SubLObject lookup_mt, SubLObject case_sensitivity)
  {
    if( abbrev_types == UNPROVIDED )
    {
      abbrev_types = NIL;
    }
    if( denot_type == UNPROVIDED )
    {
      denot_type = $kw1$DENOT;
    }
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = T;
    }
    if( skip_namestringsP == UNPROVIDED )
    {
      skip_namestringsP = NIL;
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( case_sensitivity == UNPROVIDED )
    {
      case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return lexicon_for_denots_of_string_internal( abbrev_types, denot_type, misspellingsP, skip_namestringsP, lookup_mt, case_sensitivity );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym0$LEXICON_FOR_DENOTS_OF_STRING, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym0$LEXICON_FOR_DENOTS_OF_STRING, SIX_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym0$LEXICON_FOR_DENOTS_OF_STRING, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_6( abbrev_types, denot_type, misspellingsP, skip_namestringsP, lookup_mt, case_sensitivity );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( abbrev_types.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( denot_type.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( misspellingsP.equal( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( skip_namestringsP.equal( cached_args.first() ) )
              {
                cached_args = cached_args.rest();
                if( lookup_mt.equal( cached_args.first() ) )
                {
                  cached_args = cached_args.rest();
                  if( NIL != cached_args && NIL == cached_args.rest() && case_sensitivity.equal( cached_args.first() ) )
                  {
                    return memoization_state.caching_results( results2 );
                  }
                }
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( lexicon_for_denots_of_string_internal( abbrev_types, denot_type, misspellingsP, skip_namestringsP, lookup_mt,
        case_sensitivity ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( abbrev_types, denot_type, misspellingsP, skip_namestringsP, lookup_mt, case_sensitivity ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/denots-of-string-lexicon.lisp", position = 2987L)
  public static SubLObject lexicon_denots_of_string(final SubLObject string, final SubLObject lexicon)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject denots = NIL;
    SubLObject pred_lists = NIL;
    final SubLObject results_dictionary = dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED );
    SubLObject cdolist_list_var = methods.funcall_instance_method_with_1_args( lexicon, $sym17$GET, string );
    SubLObject lex_entry = NIL;
    lex_entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject denot = methods.funcall_instance_method_with_1_args( lex_entry, $sym17$GET, $kw1$DENOT );
      if( NIL != denot )
      {
        final SubLObject predicate = methods.funcall_instance_method_with_1_args( lex_entry, $sym17$GET, $kw18$PREDICATE );
        if( NIL != lexicon_vars.name_string_predP( predicate ) || NIL != lexicon_vars.term_strings_predP( predicate ) )
        {
          dictionary_utilities.dictionary_pushnew( results_dictionary, denot, predicate, UNPROVIDED, UNPROVIDED );
        }
        else
        {
          SubLObject cdolist_list_var_$1 = methods.funcall_instance_method_with_1_args( lex_entry, $sym17$GET, $kw19$INFLECTIONS );
          SubLObject pred = NIL;
          pred = cdolist_list_var_$1.first();
          while ( NIL != cdolist_list_var_$1)
          {
            dictionary_utilities.dictionary_pushnew( results_dictionary, denot, pred, UNPROVIDED, UNPROVIDED );
            cdolist_list_var_$1 = cdolist_list_var_$1.rest();
            pred = cdolist_list_var_$1.first();
          }
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      lex_entry = cdolist_list_var.first();
    }
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( results_dictionary ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject denot2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject preds = thread.secondMultipleValue();
      thread.resetMultipleValues();
      denots = ConsesLow.cons( denot2, denots );
      pred_lists = ConsesLow.cons( preds, pred_lists );
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return Values.values( denots, pred_lists );
  }

  public static SubLObject declare_denots_of_string_lexicon_file()
  {
    SubLFiles.declareFunction( me, "lexicon_for_denots_of_string_internal", "LEXICON-FOR-DENOTS-OF-STRING-INTERNAL", 0, 6, false );
    SubLFiles.declareFunction( me, "lexicon_for_denots_of_string", "LEXICON-FOR-DENOTS-OF-STRING", 0, 6, false );
    SubLFiles.declareFunction( me, "lexicon_denots_of_string", "LEXICON-DENOTS-OF-STRING", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_denots_of_string_lexicon_file()
  {
    return NIL;
  }

  public static SubLObject setup_denots_of_string_lexicon_file()
  {
    memoization_state.note_memoized_function( $sym0$LEXICON_FOR_DENOTS_OF_STRING );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_denots_of_string_lexicon_file();
  }

  @Override
  public void initializeVariables()
  {
    init_denots_of_string_lexicon_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_denots_of_string_lexicon_file();
  }
  static
  {
    me = new denots_of_string_lexicon();
    $sym0$LEXICON_FOR_DENOTS_OF_STRING = makeSymbol( "LEXICON-FOR-DENOTS-OF-STRING" );
    $kw1$DENOT = makeKeyword( "DENOT" );
    $sym2$SET_CASE_SENSITIVITY = makeSymbol( "SET-CASE-SENSITIVITY" );
    $sym3$CONVERT_TO_EL_ = makeSymbol( "CONVERT-TO-EL?" );
    $sym4$DEFAULT_EXCLUDE_MTS = makeSymbol( "DEFAULT-EXCLUDE-MTS" );
    $sym5$SET_BASE_MT = makeSymbol( "SET-BASE-MT" );
    $sym6$INITIALIZE_ALLOWED_MTS = makeSymbol( "INITIALIZE-ALLOWED-MTS" );
    $sym7$ALLOW_MT = makeSymbol( "ALLOW-MT" );
    $const8$CommonEnglishMisspellingsMt = constant_handles.reader_make_constant_shell( makeString( "CommonEnglishMisspellingsMt" ) );
    $sym9$FORBID_MT = makeSymbol( "FORBID-MT" );
    $sym10$INITIALIZE_EXCLUDED_PREDS = makeSymbol( "INITIALIZE-EXCLUDED-PREDS" );
    $list11 = ConsesLow.list( makeSymbol( "PRED" ), makeSymbol( "VALUE" ) );
    $sym12$EXCLUDE_PREDICATE = makeSymbol( "EXCLUDE-PREDICATE" );
    $kw13$ACRONYMS = makeKeyword( "ACRONYMS" );
    $kw14$ABBREVS = makeKeyword( "ABBREVS" );
    $kw15$ANY = makeKeyword( "ANY" );
    $sym16$ALLOW_PREDICATE = makeSymbol( "ALLOW-PREDICATE" );
    $sym17$GET = makeSymbol( "GET" );
    $kw18$PREDICATE = makeKeyword( "PREDICATE" );
    $kw19$INFLECTIONS = makeKeyword( "INFLECTIONS" );
  }
}
/*
 * 
 * Total time: 117 ms
 * 
 */