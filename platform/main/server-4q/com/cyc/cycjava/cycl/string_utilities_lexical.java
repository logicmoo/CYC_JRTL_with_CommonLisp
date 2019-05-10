package com.cyc.cycjava.cycl;

import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class string_utilities_lexical
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.string_utilities_lexical";
  public static final String myFingerPrint = "0bd1d4edd54d80a8c0c3b999fe69d9527d5fe17de9e819143ec2bbf53cd3e414";
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$NOT_TEST_CHAR;
  private static final SubLSymbol $sym2$EVERY_WORD_STARTS_WITH_CAPITAL_;
  private static final SubLSymbol $kw3$TEST;
  private static final SubLSymbol $kw4$OWNER;
  private static final SubLSymbol $kw5$CLASSES;
  private static final SubLSymbol $kw6$KB;
  private static final SubLSymbol $kw7$FULL;
  private static final SubLSymbol $kw8$WORKING_;
  private static final SubLList $list9;

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities-lexical.lisp", position = 880L)
  public static SubLObject denots_english_number_p(final SubLObject string)
  {
    return makeBoolean( NIL != number_utilities.number_string_p( string ) || NIL != string_utilities.english_ordinal_number_string_p( string ) || NIL != english_number_word_p( string )
        || NIL != english_ordinal_word_string_p( string ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities-lexical.lisp", position = 1153L)
  public static SubLObject english_number_word_p(final SubLObject string)
  {
    SubLObject cdolist_list_var;
    final SubLObject denots = cdolist_list_var = lexicon_accessors.all_parsing_denots_of_string( string, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject denot = NIL;
    denot = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( denot.isNumber() )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      denot = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities-lexical.lisp", position = 1453L)
  public static SubLObject english_ordinal_word_string_p(final SubLObject string)
  {
    final SubLObject possibly_ordinal_numberP = string_utilities.ends_with_one_of( string, $list0 );
    return ( NIL != possibly_ordinal_numberP ) ? english_number_word_p( string_utilities.english_ordinal_string_to_cardinal_string( string ) ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities-lexical.lisp", position = 1785L)
  public static SubLObject find_head_noun_of_string(final SubLObject string)
  {
    SubLObject head_noun_pos = NIL;
    final SubLObject final_pos = Numbers.subtract( string_utilities.number_of_words( string ), ONE_INTEGER );
    final SubLObject prep_pos = where_is_first_prepositionP( string );
    if( NIL != subl_promotions.positive_integer_p( prep_pos ) )
    {
      head_noun_pos = Numbers.subtract( prep_pos, ONE_INTEGER );
    }
    else
    {
      head_noun_pos = final_pos;
    }
    return string_utilities.nth_word_of_string( head_noun_pos, string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities-lexical.lisp", position = 2511L)
  public static SubLObject where_is_first_prepositionP(final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject doneP = NIL;
    SubLObject location = ZERO_INTEGER;
    final SubLObject _prev_bind_0 = string_utilities.$test_char$.currentBinding( thread );
    try
    {
      string_utilities.$test_char$.bind( string_utilities.$space_char$.getGlobalValue(), thread );
      SubLObject cdolist_list_var;
      final SubLObject word_list_var = cdolist_list_var = string_utilities.break_words( string, $sym1$NOT_TEST_CHAR, UNPROVIDED );
      SubLObject word = NIL;
      word = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != doneP || NIL != lexicon_accessors.preposition_stringP( word, UNPROVIDED ) )
        {
          doneP = T;
        }
        else
        {
          location = Numbers.add( location, ONE_INTEGER );
        }
        cdolist_list_var = cdolist_list_var.rest();
        word = cdolist_list_var.first();
      }
    }
    finally
    {
      string_utilities.$test_char$.rebind( _prev_bind_0, thread );
    }
    return ( NIL != doneP ) ? location : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-utilities-lexical.lisp", position = 2915L)
  public static SubLObject every_word_starts_with_capitalP(final SubLObject string)
  {
    final SubLObject tokens = nl_trie.nl_trie_string_tokenize( string );
    SubLObject non_capital_seenP = NIL;
    if( NIL == non_capital_seenP )
    {
      SubLObject csome_list_var = tokens;
      SubLObject token = NIL;
      token = csome_list_var.first();
      while ( NIL == non_capital_seenP && NIL != csome_list_var)
      {
        if( NIL != Characters.alpha_char_p( Strings.sublisp_char( token, ZERO_INTEGER ) ) && NIL == Characters.upper_case_p( Strings.sublisp_char( token, ZERO_INTEGER ) ) )
        {
          non_capital_seenP = T;
        }
        csome_list_var = csome_list_var.rest();
        token = csome_list_var.first();
      }
    }
    return makeBoolean( NIL == non_capital_seenP );
  }

  public static SubLObject declare_string_utilities_lexical_file()
  {
    SubLFiles.declareFunction( me, "denots_english_number_p", "DENOTS-ENGLISH-NUMBER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "english_number_word_p", "ENGLISH-NUMBER-WORD-P", 1, 0, false );
    SubLFiles.declareFunction( me, "english_ordinal_word_string_p", "ENGLISH-ORDINAL-WORD-STRING-P", 1, 0, false );
    SubLFiles.declareFunction( me, "find_head_noun_of_string", "FIND-HEAD-NOUN-OF-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "where_is_first_prepositionP", "WHERE-IS-FIRST-PREPOSITION?", 1, 0, false );
    SubLFiles.declareFunction( me, "every_word_starts_with_capitalP", "EVERY-WORD-STARTS-WITH-CAPITAL?", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_string_utilities_lexical_file()
  {
    return NIL;
  }

  public static SubLObject setup_string_utilities_lexical_file()
  {
    generic_testing.define_test_case_table_int( $sym2$EVERY_WORD_STARTS_WITH_CAPITAL_, ConsesLow.list( new SubLObject[] { $kw3$TEST, NIL, $kw4$OWNER, NIL, $kw5$CLASSES, NIL, $kw6$KB, $kw7$FULL, $kw8$WORKING_, T
    } ), $list9 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_string_utilities_lexical_file();
  }

  @Override
  public void initializeVariables()
  {
    init_string_utilities_lexical_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_string_utilities_lexical_file();
  }
  static
  {
    me = new string_utilities_lexical();
    $list0 = ConsesLow.list( makeString( "st" ), makeString( "nd" ), makeString( "rd" ), makeString( "th" ) );
    $sym1$NOT_TEST_CHAR = makeSymbol( "NOT-TEST-CHAR" );
    $sym2$EVERY_WORD_STARTS_WITH_CAPITAL_ = makeSymbol( "EVERY-WORD-STARTS-WITH-CAPITAL?" );
    $kw3$TEST = makeKeyword( "TEST" );
    $kw4$OWNER = makeKeyword( "OWNER" );
    $kw5$CLASSES = makeKeyword( "CLASSES" );
    $kw6$KB = makeKeyword( "KB" );
    $kw7$FULL = makeKeyword( "FULL" );
    $kw8$WORKING_ = makeKeyword( "WORKING?" );
    $list9 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "Atheroembolic renal disease" ) ), NIL ), ConsesLow.list( ConsesLow.list( makeString( "Atheroembolic Renal Disease" ) ), T ), ConsesLow.list(
        ConsesLow.list( makeString( "atheroembolic renal disease" ) ), NIL ), ConsesLow.list( ConsesLow.list( makeString( "disease" ) ), NIL ), ConsesLow.list( ConsesLow.list( makeString( "Disease" ) ), T ) );
  }
}
/*
 * 
 * Total time: 130 ms
 * 
 */