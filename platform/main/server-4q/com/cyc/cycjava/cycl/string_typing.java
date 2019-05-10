package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class string_typing
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.string_typing";
  public static final String myFingerPrint = "1003f6b995c10650da85c94b0149c145d3a1436b6c364e4a2070217bd918ac45";
  private static final SubLSymbol $sym0$STRINGP;
  private static final SubLSymbol $kw1$UNKNOWN;
  private static final SubLSymbol $kw2$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym3$IGNORE_ERRORS_HANDLER;
  private static final SubLSymbol $sym4$_EXIT;
  private static final SubLSymbol $kw5$COLLECTION;
  private static final SubLSymbol $sym6$STANFORD_NER;
  private static final SubLSymbol $sym7$NEW;
  private static final SubLSymbol $sym8$RUN;
  private static final SubLSymbol $sym9$GET_TYPE;
  private static final SubLSymbol $sym10$QUOTE;
  private static final SubLSymbol $sym11$PERSON;
  private static final SubLSymbol $kw12$INDIVIDUAL;
  private static final SubLSymbol $sym13$ORGANIZATION;
  private static final SubLSymbol $sym14$LOCATION;
  private static final SubLSymbol $sym15$DATE;
  private static final SubLSymbol $sym16$GET_STRING;
  private static final SubLList $list17;
  private static final SubLSymbol $sym18$GET;
  private static final SubLSymbol $kw19$DENOT;
  private static final SubLObject $const20$InferencePSC;
  private static final SubLObject $const21$or;
  private static final SubLObject $const22$noNotableInstances;
  private static final SubLObject $const23$instancesDontNeedLexification;
  private static final SubLSymbol $kw24$IN;
  private static final SubLList $list25;
  private static final SubLList $list26;
  private static final SubLSymbol $sym27$CCONCATENATE;
  private static final SubLSymbol $sym28$NEW_LINIFY;
  private static final SubLString $str29$lynx;
  private static final SubLString $str30$_dump;
  private static final SubLString $str31$number_of_sample_elements__a_exce;
  private static final SubLObject $const32$EnglishMt;

  @SubLTranslatedFile.SubL(source = "cycl/string-typing.lisp", position = 1001L)
  public static SubLObject type_string(final SubLObject word)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( word ) : word;
    SubLObject type = type_string_cyc( word );
    if( !type.eql( $kw1$UNKNOWN ) )
    {
      return type;
    }
    type = type_string_ner( word );
    if( !type.eql( $kw1$UNKNOWN ) )
    {
      return type;
    }
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw2$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym3$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          if( NIL != phraseP( word ) )
          {
            final SubLObject head_word = get_np_head( word );
            if( NIL != string_utilities_lexical.every_word_starts_with_capitalP( word ) )
            {
              final SubLObject type2 = type_string_cyc( head_word );
              return type2;
            }
            if( NIL != head_only_admits_collectionsP( head_word, UNPROVIDED ) )
            {
              return $kw5$COLLECTION;
            }
            return $kw1$UNKNOWN;
          }
        }
        catch( final Throwable catch_var )
        {
          Errors.handleThrowable( catch_var, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw2$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return $kw1$UNKNOWN;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-typing.lisp", position = 1856L)
  public static SubLObject type_string_ner(final SubLObject word)
  {
    final SubLObject ner = methods.funcall_class_method_with_0_args( $sym6$STANFORD_NER, $sym7$NEW );
    final SubLObject named_entities = methods.funcall_instance_method_with_1_args( ner, $sym8$RUN, word );
    if( NIL != list_utilities.singletonP( named_entities ) )
    {
      final SubLObject pcase_var;
      final SubLObject type = pcase_var = methods.funcall_instance_method_with_0_args( named_entities.first().first(), $sym9$GET_TYPE );
      if( pcase_var.eql( $sym10$QUOTE ) || pcase_var.eql( $sym11$PERSON ) )
      {
        return $kw12$INDIVIDUAL;
      }
      if( pcase_var.eql( $sym10$QUOTE ) || pcase_var.eql( $sym13$ORGANIZATION ) )
      {
        return $kw12$INDIVIDUAL;
      }
      if( pcase_var.eql( $sym10$QUOTE ) || pcase_var.eql( $sym14$LOCATION ) )
      {
        return $kw12$INDIVIDUAL;
      }
      if( pcase_var.eql( $sym10$QUOTE ) || pcase_var.eql( $sym15$DATE ) )
      {
        return $kw12$INDIVIDUAL;
      }
      return $kw1$UNKNOWN;
    }
    else
    {
      if( NIL != list_utilities.doubletonP( named_entities ) && methods.funcall_instance_method_with_0_args( conses_high.second( named_entities ).first(), $sym9$GET_TYPE ).eql( $sym11$PERSON ) && NIL != conses_high
          .member( methods.funcall_instance_method_with_0_args( named_entities.first().first(), $sym16$GET_STRING ), $list17, EQUALP, UNPROVIDED ) )
      {
        return $kw12$INDIVIDUAL;
      }
      return $kw1$UNKNOWN;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-typing.lisp", position = 4021L)
  public static SubLObject type_string_cyc(final SubLObject word)
  {
    final SubLObject lexicon = term_lexicon.new_case_sensitivity_preferred_term_lexicon();
    SubLObject types = NIL;
    SubLObject denot = NIL;
    SubLObject cdolist_list_var = methods.funcall_instance_method_with_1_args( lexicon, $sym18$GET, word );
    SubLObject lex = NIL;
    lex = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      denot = methods.funcall_instance_method_with_1_args( lex, $sym18$GET, $kw19$DENOT );
      if( NIL != fort_types_interface.collection_in_any_mtP( denot ) )
      {
        types = ConsesLow.cons( $kw5$COLLECTION, types );
      }
      else if( NIL == fort_types_interface.functorP( denot ) )
      {
        if( NIL == fort_types_interface.predicateP( denot ) )
        {
          if( NIL != kb_accessors.individualP( denot ) )
          {
            types = ConsesLow.cons( $kw12$INDIVIDUAL, types );
          }
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      lex = cdolist_list_var.first();
    }
    if( NIL != types )
    {
      final SubLObject frequent = most_frequent( types );
      final SubLObject tag = ( NIL != list_utilities.singletonP( frequent ) ) ? frequent.first() : $kw1$UNKNOWN;
      return tag;
    }
    return $kw1$UNKNOWN;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-typing.lisp", position = 4650L)
  public static SubLObject head_only_admits_collectionsP(final SubLObject head, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const20$InferencePSC;
    }
    final SubLObject lexicon = term_lexicon.new_case_sensitivity_preferred_term_lexicon();
    SubLObject denot = NIL;
    final SubLObject value_set = T;
    SubLObject allows_individualsP = NIL;
    final SubLObject lex_entries = methods.funcall_instance_method_with_1_args( lexicon, $sym18$GET, head );
    if( NIL == lex_entries )
    {
      return NIL;
    }
    if( NIL == allows_individualsP )
    {
      SubLObject csome_list_var = methods.funcall_instance_method_with_1_args( lexicon, $sym18$GET, head );
      SubLObject lex = NIL;
      lex = csome_list_var.first();
      while ( NIL == allows_individualsP && NIL != csome_list_var)
      {
        denot = methods.funcall_instance_method_with_1_args( lex, $sym18$GET, $kw19$DENOT );
        if( NIL == builder_utilities.higher_order_collectionP( denot ) && NIL == dont_make_instancesP( denot, mt ) )
        {
          allows_individualsP = T;
        }
        csome_list_var = csome_list_var.rest();
        lex = csome_list_var.first();
      }
    }
    return ( NIL != value_set ) ? makeBoolean( NIL == allows_individualsP ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-typing.lisp", position = 5452L)
  public static SubLObject dont_make_instancesP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    return ask_utilities.query_boolean( ConsesLow.list( $const21$or, ConsesLow.list( $const22$noNotableInstances, v_term ), ConsesLow.list( $const23$instancesDontNeedLexification, v_term ) ), mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-typing.lisp", position = 5630L)
  public static SubLObject phraseP(final SubLObject word)
  {
    return Numbers.numG( Sequences.length( string_utilities.split_string( word, UNPROVIDED ) ), ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-typing.lisp", position = 5784L)
  public static SubLObject get_np_head(final SubLObject phrase)
  {
    final SubLObject head = get_np_head_tagged( pos_tagger.tagger_tag_sentence( pos_tagger.get_tagger(), document.new_sentence( phrase, UNPROVIDED ) ) );
    return ( NIL != head ) ? document.word_string( head ) : conses_high.last( string_utilities.split_string( phrase, UNPROVIDED ), UNPROVIDED ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-typing.lisp", position = 6044L)
  public static SubLObject get_np_head_tagged(final SubLObject tagged)
  {
    SubLObject nouns = NIL;
    SubLObject cdolist_list_var = document.sentence_yield_exhaustive( tagged );
    SubLObject word = NIL;
    word = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject cat = document.word_category( word );
      if( NIL != nouns && cat.eql( $kw24$IN ) )
      {
        return nouns.first();
      }
      if( NIL != conses_high.member( cat, $list25, UNPROVIDED, UNPROVIDED ) )
      {
        nouns = ConsesLow.cons( word, nouns );
      }
      cdolist_list_var = cdolist_list_var.rest();
      word = cdolist_list_var.first();
    }
    return nouns.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-typing.lisp", position = 6434L)
  public static SubLObject singularP(final SubLObject word)
  {
    final SubLObject ne = methods.funcall_instance_method_with_1_args( methods.funcall_class_method_with_0_args( $sym6$STANFORD_NER, $sym7$NEW ), $sym8$RUN, word ).first().first();
    if( NIL != subl_promotions.memberP( methods.funcall_instance_method_with_0_args( ne, $sym9$GET_TYPE ), $list26, UNPROVIDED, UNPROVIDED ) )
    {
      return T;
    }
    final SubLObject tokens = string_utilities.split_string( word, UNPROVIDED );
    final SubLObject head = ( NIL != list_utilities.lengthE( tokens, ONE_INTEGER, UNPROVIDED ) ) ? word : get_np_head( word );
    return Equality.equalp( head, morphology.singularize_string( head, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-typing.lisp", position = 6821L)
  public static SubLObject lynx(final SubLObject url)
  {
    assert NIL != Types.stringp( url ) : url;
    return Functions.apply( $sym27$CCONCATENATE, Mapping.mapcar( $sym28$NEW_LINIFY, os_process_utilities.os_process_evaluation_output_strings( $str29$lynx, ConsesLow.list( $str30$_dump, url ), UNPROVIDED,
        UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-typing.lisp", position = 7066L)
  public static SubLObject new_linify(final SubLObject string)
  {
    return Sequences.cconcatenate( string, string_utilities.$new_line_string$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-typing.lisp", position = 7195L)
  public static SubLObject random_sample(final SubLObject elements, final SubLObject n)
  {
    final SubLObject size = Sequences.length( elements );
    if( n.numG( size ) )
    {
      Errors.error( $str31$number_of_sample_elements__a_exce, n, size );
    }
    SubLObject sample = NIL;
    SubLObject member = NIL;
    SubLObject i;
    for( i = NIL, i = ZERO_INTEGER; i.numL( n ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      member = ConsesLow.nth( random.random( Sequences.length( elements ) ), elements );
      sample = ConsesLow.cons( member, sample );
      Sequences.delete( member, elements, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return sample;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-typing.lisp", position = 8276L)
  public static SubLObject most_frequent(final SubLObject elements)
  {
    SubLObject counts = NIL;
    SubLObject cdolist_list_var = elements;
    SubLObject element = NIL;
    element = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject old_entry = conses_high.assoc( element, counts, UNPROVIDED, UNPROVIDED );
      if( NIL == old_entry )
      {
        old_entry = ConsesLow.cons( element, ZERO_INTEGER );
        counts = ConsesLow.cons( old_entry, counts );
      }
      ConsesLow.rplacd( old_entry, number_utilities.f_1X( old_entry.rest() ) );
      cdolist_list_var = cdolist_list_var.rest();
      element = cdolist_list_var.first();
    }
    SubLObject max = ZERO_INTEGER;
    SubLObject max_elements = NIL;
    SubLObject cdolist_list_var2 = counts;
    SubLObject entry = NIL;
    entry = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      if( entry.rest().numG( max ) )
      {
        max = entry.rest();
      }
      cdolist_list_var2 = cdolist_list_var2.rest();
      entry = cdolist_list_var2.first();
    }
    cdolist_list_var2 = counts;
    entry = NIL;
    entry = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      if( entry.rest().numE( max ) )
      {
        max_elements = ConsesLow.cons( entry.first(), max_elements );
      }
      cdolist_list_var2 = cdolist_list_var2.rest();
      entry = cdolist_list_var2.first();
    }
    return max_elements;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-typing.lisp", position = 8873L)
  public static SubLObject plural_string(final SubLObject string, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const32$EnglishMt;
    }
    SubLObject ans = morphology.pluralize_string_wXlexicon( string, mt );
    if( NIL == ans )
    {
      final SubLObject tagged = pos_tagger.tagger_tag_sentence( pos_tagger.get_tagger(), document.new_sentence( string, UNPROVIDED ) );
      SubLObject head = get_np_head_tagged( tagged );
      final SubLObject words = document.sentence_yield( tagged );
      if( NIL == head )
      {
        head = vector_utilities.last_aref( words );
      }
      SubLObject plural_head = morphology.pluralize_string_wXlexicon( document.word_string( head ), mt );
      if( NIL == plural_head )
      {
        plural_head = morphology.plural_reg( document.word_string( head ) );
      }
      document.set_word_string( head, plural_head );
      ans = sentence_compute_string( tagged );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/string-typing.lisp", position = 9717L)
  public static SubLObject sentence_compute_string(final SubLObject sentence)
  {
    SubLObject strings = NIL;
    SubLObject cdolist_list_var = document.sentence_yield_exhaustive( sentence );
    SubLObject word = NIL;
    word = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      strings = ConsesLow.cons( document.word_string( word ), strings );
      cdolist_list_var = cdolist_list_var.rest();
      word = cdolist_list_var.first();
    }
    return string_utilities.bunge( Sequences.nreverse( strings ), UNPROVIDED );
  }

  public static SubLObject declare_string_typing_file()
  {
    SubLFiles.declareFunction( me, "type_string", "TYPE-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "type_string_ner", "TYPE-STRING-NER", 1, 0, false );
    SubLFiles.declareFunction( me, "type_string_cyc", "TYPE-STRING-CYC", 1, 0, false );
    SubLFiles.declareFunction( me, "head_only_admits_collectionsP", "HEAD-ONLY-ADMITS-COLLECTIONS?", 1, 1, false );
    SubLFiles.declareFunction( me, "dont_make_instancesP", "DONT-MAKE-INSTANCES?", 1, 1, false );
    SubLFiles.declareFunction( me, "phraseP", "PHRASE?", 1, 0, false );
    SubLFiles.declareFunction( me, "get_np_head", "GET-NP-HEAD", 1, 0, false );
    SubLFiles.declareFunction( me, "get_np_head_tagged", "GET-NP-HEAD-TAGGED", 1, 0, false );
    SubLFiles.declareFunction( me, "singularP", "SINGULAR?", 1, 0, false );
    SubLFiles.declareFunction( me, "lynx", "LYNX", 1, 0, false );
    SubLFiles.declareFunction( me, "new_linify", "NEW-LINIFY", 1, 0, false );
    SubLFiles.declareFunction( me, "random_sample", "RANDOM-SAMPLE", 2, 0, false );
    SubLFiles.declareFunction( me, "most_frequent", "MOST-FREQUENT", 1, 0, false );
    SubLFiles.declareFunction( me, "plural_string", "PLURAL-STRING", 1, 1, false );
    SubLFiles.declareFunction( me, "sentence_compute_string", "SENTENCE-COMPUTE-STRING", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_string_typing_file()
  {
    return NIL;
  }

  public static SubLObject setup_string_typing_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_string_typing_file();
  }

  @Override
  public void initializeVariables()
  {
    init_string_typing_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_string_typing_file();
  }
  static
  {
    me = new string_typing();
    $sym0$STRINGP = makeSymbol( "STRINGP" );
    $kw1$UNKNOWN = makeKeyword( "UNKNOWN" );
    $kw2$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym3$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $sym4$_EXIT = makeSymbol( "%EXIT" );
    $kw5$COLLECTION = makeKeyword( "COLLECTION" );
    $sym6$STANFORD_NER = makeSymbol( "STANFORD-NER" );
    $sym7$NEW = makeSymbol( "NEW" );
    $sym8$RUN = makeSymbol( "RUN" );
    $sym9$GET_TYPE = makeSymbol( "GET-TYPE" );
    $sym10$QUOTE = makeSymbol( "QUOTE" );
    $sym11$PERSON = makeSymbol( "PERSON" );
    $kw12$INDIVIDUAL = makeKeyword( "INDIVIDUAL" );
    $sym13$ORGANIZATION = makeSymbol( "ORGANIZATION" );
    $sym14$LOCATION = makeSymbol( "LOCATION" );
    $sym15$DATE = makeSymbol( "DATE" );
    $sym16$GET_STRING = makeSymbol( "GET-STRING" );
    $list17 = ConsesLow.list( new SubLObject[] { makeString( "Mr" ), makeString( "Mrs" ), makeString( "Miss" ), makeString( "Ms" ), makeString( "Sir" ), makeString( "Prof" ), makeString( "Colonel" ), makeString(
        "General" ), makeString( "Lieutenant" ), makeString( "Captain" ), makeString( "Major" ), makeString( "Seargant" ), makeString( "President" ), makeString( "Lady" )
    } );
    $sym18$GET = makeSymbol( "GET" );
    $kw19$DENOT = makeKeyword( "DENOT" );
    $const20$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $const21$or = constant_handles.reader_make_constant_shell( makeString( "or" ) );
    $const22$noNotableInstances = constant_handles.reader_make_constant_shell( makeString( "noNotableInstances" ) );
    $const23$instancesDontNeedLexification = constant_handles.reader_make_constant_shell( makeString( "instancesDontNeedLexification" ) );
    $kw24$IN = makeKeyword( "IN" );
    $list25 = ConsesLow.list( makeKeyword( "NN" ), makeKeyword( "NNS" ), makeKeyword( "NNP" ), makeKeyword( "NNPS" ), makeKeyword( "FW" ), makeKeyword( "VBG" ) );
    $list26 = ConsesLow.list( ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PERSON" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ORGANIZATION" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
        "LOCATION" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "DATE" ) ) );
    $sym27$CCONCATENATE = makeSymbol( "CCONCATENATE" );
    $sym28$NEW_LINIFY = makeSymbol( "NEW-LINIFY" );
    $str29$lynx = makeString( "lynx" );
    $str30$_dump = makeString( "-dump" );
    $str31$number_of_sample_elements__a_exce = makeString( "number of sample elements ~a exceeds list size ~a" );
    $const32$EnglishMt = constant_handles.reader_make_constant_shell( makeString( "EnglishMt" ) );
  }
}
/*
 * 
 * Total time: 207 ms
 * 
 */