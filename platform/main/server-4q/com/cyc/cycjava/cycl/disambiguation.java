package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class disambiguation
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.disambiguation";
  public static final String myFingerPrint = "69e8f22d236bc99d21380dba861e8087abf02d74be2f46cdf258bacef19d58f4";
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1497L)
  public static SubLSymbol $disambiguation_term_counts$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1554L)
  public static SubLSymbol $disambiguation_term_counts_load_attempted$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1625L)
  private static SubLSymbol $disambiguation_term_counts_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1725L)
  public static SubLSymbol $disambiguation_term_counts_file$;
  private static final SubLSymbol $sym0$_DISAMBIGUATION_TERM_COUNTS_LOCK_;
  private static final SubLString $str1$Disambiguation_Term_Counts_Lock;
  private static final SubLString $str2$data_sense_disambiguation_disambi;
  private static final SubLSymbol $kw3$IMAGE_INDEPENDENT_CFASL;
  private static final SubLInteger $int4$3000;
  private static final SubLString $str5$Unable_to_create_disambiguation_h;
  private static final SubLString $str6$Disambiguation_training_data_file;
  private static final SubLSymbol $kw7$INPUT;
  private static final SubLString $str8$Unable_to_open__S;
  private static final SubLString $str9$processing_line__S__;
  private static final SubLList $list10;
  private static final SubLSymbol $sym11$CYCL_FROM_STRING;
  private static final SubLString $str12$_NONE;
  private static final SubLString $str13$;
  private static final SubLString $str14$d;
  private static final SubLString $str15$p;
  private static final SubLString $str16$w;
  private static final SubLSymbol $kw17$WEIGHT;
  private static final SubLSymbol $sym18$STRINGP;
  private static final SubLString $str19$___________________________;
  private static final SubLString $str20$___1__2;
  private static final SubLSymbol $sym21$HASH_TABLE_P;
  private static final SubLString $str22$Labelled_file__A_does_not_exist_;
  private static final SubLSymbol $kw23$OUTPUT;
  private static final SubLString $str24$d__;
  private static final SubLString $str25$p__;
  private static final SubLString $str26$s;
  private static final SubLString $str27$s__;
  private static final SubLString $str28$w_A_A_A_A;
  private static final SubLSymbol $sym29$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLString $str30$_A_S;
  private static final SubLString $str31$_A__S;
  private static final SubLString $str32$_A_in_term__S;
  private static final SubLString $str33$__;
  private static final SubLString $str34$Unable_to_understand_line___S;
  private static final SubLString $str35$_A__A;
  private static final SubLString $str36$Processing__A__;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1843L)
  public static SubLObject init_disambiguation_model(SubLObject forceP)
  {
    if( forceP == UNPROVIDED )
    {
      forceP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject loaded = NIL;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $disambiguation_term_counts_lock$.getGlobalValue() );
      if( NIL != $disambiguation_term_counts$.getGlobalValue() )
      {
        loaded = T;
      }
      if( NIL != forceP || NIL == $disambiguation_term_counts_load_attempted$.getGlobalValue() )
      {
        $disambiguation_term_counts_load_attempted$.setGlobalValue( T );
        if( NIL != Filesys.probe_file( $disambiguation_term_counts_file$.getDynamicValue( thread ) ) )
        {
          $disambiguation_term_counts$.setGlobalValue( file_hash_table.open_file_hash_table_read_only( $disambiguation_term_counts_file$.getDynamicValue( thread ), Symbols.symbol_function( EQUALP ),
              $kw3$IMAGE_INDEPENDENT_CFASL ) );
          if( NIL != $disambiguation_term_counts$.getGlobalValue() )
          {
            loaded = T;
          }
        }
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $disambiguation_term_counts_lock$.getGlobalValue() );
      }
    }
    return loaded;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2465L)
  public static SubLObject clear_disambiguation_model()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $disambiguation_term_counts_lock$.getGlobalValue() );
      $disambiguation_term_counts$.setGlobalValue( NIL );
      if( NIL != Filesys.probe_file( $disambiguation_term_counts_file$.getDynamicValue( thread ) ) )
      {
        Filesys.delete_file( $disambiguation_term_counts_file$.getDynamicValue( thread ) );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $disambiguation_term_counts_lock$.getGlobalValue() );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2807L)
  public static SubLObject update_disambiguation_model(final SubLObject train_filename)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject disambiguation_term_counts_fht = NIL;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $disambiguation_term_counts_lock$.getGlobalValue() );
      if( NIL != Filesys.probe_file( $disambiguation_term_counts_file$.getDynamicValue( thread ) ) )
      {
        disambiguation_term_counts_fht = file_hash_table.open_file_hash_table( $disambiguation_term_counts_file$.getDynamicValue( thread ), Symbols.symbol_function( EQUALP ), $kw3$IMAGE_INDEPENDENT_CFASL );
      }
      else
      {
        disambiguation_term_counts_fht = file_hash_table.create_file_hash_table( $disambiguation_term_counts_file$.getDynamicValue( thread ), $int4$3000, $int4$3000, Symbols.symbol_function( EQUALP ),
            $kw3$IMAGE_INDEPENDENT_CFASL );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $disambiguation_term_counts_lock$.getGlobalValue() );
      }
    }
    if( NIL == disambiguation_term_counts_fht )
    {
      Errors.error( $str5$Unable_to_create_disambiguation_h, $disambiguation_term_counts_file$.getDynamicValue( thread ) );
    }
    if( NIL == Filesys.probe_file( train_filename ) )
    {
      Errors.error( $str6$Disambiguation_training_data_file, train_filename );
    }
    final SubLObject file = StreamsLow.open( train_filename, EMPTY_SUBL_OBJECT_ARRAY );
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_text( file, $kw7$INPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str8$Unable_to_open__S, file );
      }
      final SubLObject infile = stream;
      if( infile.isStream() )
      {
        SubLObject line;
        SubLObject parts;
        SubLObject filepath;
        SubLObject v_document;
        SubLObject paragraph;
        SubLObject word;
        SubLObject labels;
        SubLObject stream_$1;
        SubLObject datafile;
        SubLObject current_document;
        SubLObject current_paragraph;
        SubLObject current_word;
        SubLObject line_$2;
        SubLObject word_parts;
        SubLObject token;
        SubLObject pos;
        SubLObject cdolist_list_var;
        SubLObject tags;
        SubLObject tag;
        SubLObject release_$3;
        SubLObject old_pair;
        SubLObject old_correct;
        SubLObject old_total;
        SubLObject new_total;
        SubLObject token_term;
        SubLObject old_pair2;
        SubLObject old_correct2;
        SubLObject old_total2;
        SubLObject new_total2;
        SubLObject _prev_bind_2;
        SubLObject _values;
        for( line = NIL, line = file_utilities.cdolines_get_next_line( infile ); NIL != line; line = file_utilities.cdolines_get_next_line( infile ) )
        {
          PrintLow.format( T, $str9$processing_line__S__, line );
          parts = string_utilities.split_string( line, $list10 );
          filepath = parts.first();
          v_document = string_utilities.string_to_integer( conses_high.second( parts ) );
          paragraph = string_utilities.string_to_integer( conses_high.third( parts ) );
          word = string_utilities.string_to_integer( conses_high.fourth( parts ) );
          labels = Mapping.mapcar( $sym11$CYCL_FROM_STRING, conses_high.fifth( parts ).equal( $str12$_NONE ) ? NIL : conses_high.nthcdr( FOUR_INTEGER, parts ) );
          stream_$1 = NIL;
          try
          {
            stream_$1 = compatibility.open_text( filepath, $kw7$INPUT );
            if( !stream_$1.isStream() )
            {
              Errors.error( $str8$Unable_to_open__S, filepath );
            }
            datafile = stream_$1;
            current_document = MINUS_ONE_INTEGER;
            current_paragraph = MINUS_ONE_INTEGER;
            current_word = MINUS_ONE_INTEGER;
            line_$2 = $str13$;
            while ( current_document.numL( v_document ))
            {
              line_$2 = string_utilities.network_read_line( datafile, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              if( line_$2.equal( $str14$d ) )
              {
                current_document = Numbers.add( ONE_INTEGER, current_document );
              }
            }
            while ( current_paragraph.numL( paragraph ))
            {
              line_$2 = string_utilities.network_read_line( datafile, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              if( line_$2.equal( $str15$p ) )
              {
                current_paragraph = Numbers.add( ONE_INTEGER, current_paragraph );
              }
            }
            while ( current_word.numL( word ))
            {
              line_$2 = string_utilities.network_read_line( datafile, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              if( NIL != string_utilities.starts_with( line_$2, $str16$w ) )
              {
                current_word = Numbers.add( ONE_INTEGER, current_word );
              }
            }
            word_parts = string_utilities.split_string( line_$2, $list10 );
            token = conses_high.second( word_parts );
            pos = conses_high.third( word_parts );
            tags = ( cdolist_list_var = Mapping.mapcar( $sym11$CYCL_FROM_STRING, conses_high.nthcdr( THREE_INTEGER, word_parts ) ) );
            tag = NIL;
            tag = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              release_$3 = NIL;
              try
              {
                release_$3 = Locks.seize_lock( $disambiguation_term_counts_lock$.getGlobalValue() );
                old_pair = file_hash_table.get_file_hash_table( tag, disambiguation_term_counts_fht, ConsesLow.list( ZERO_INTEGER, ZERO_INTEGER ) );
                old_correct = old_pair.first();
                old_total = conses_high.second( old_pair );
                new_total = Numbers.add( ONE_INTEGER, old_total );
                if( NIL != subl_promotions.memberP( tag, labels, EQUAL, UNPROVIDED ) )
                {
                  file_hash_table.put_file_hash_table( tag, disambiguation_term_counts_fht, ConsesLow.list( Numbers.add( ONE_INTEGER, old_correct ), new_total ) );
                }
                else
                {
                  file_hash_table.put_file_hash_table( tag, disambiguation_term_counts_fht, ConsesLow.list( old_correct, new_total ) );
                }
                token_term = ConsesLow.list( token, tag );
                old_pair2 = file_hash_table.get_file_hash_table( token_term, disambiguation_term_counts_fht, ConsesLow.list( ZERO_INTEGER, ZERO_INTEGER ) );
                old_correct2 = old_pair2.first();
                old_total2 = conses_high.second( old_pair2 );
                new_total2 = Numbers.add( ONE_INTEGER, old_total2 );
                if( NIL != subl_promotions.memberP( tag, labels, EQUAL, UNPROVIDED ) )
                {
                  file_hash_table.put_file_hash_table( token_term, disambiguation_term_counts_fht, ConsesLow.list( Numbers.add( ONE_INTEGER, old_correct2 ), new_total2 ) );
                }
                else
                {
                  file_hash_table.put_file_hash_table( token_term, disambiguation_term_counts_fht, ConsesLow.list( old_correct2, new_total2 ) );
                }
              }
              finally
              {
                if( NIL != release_$3 )
                {
                  Locks.release_lock( $disambiguation_term_counts_lock$.getGlobalValue() );
                }
              }
              cdolist_list_var = cdolist_list_var.rest();
              tag = cdolist_list_var.first();
            }
          }
          finally
          {
            _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              _values = Values.getValuesAsVector();
              if( stream_$1.isStream() )
              {
                streams_high.close( stream_$1, UNPROVIDED );
              }
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
            }
          }
        }
      }
    }
    finally
    {
      final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values2 = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values2 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6083L)
  public static SubLObject get_disambiguation_prior(final SubLObject v_term)
  {
    if( NIL == init_disambiguation_model( NIL ) )
    {
      return NIL;
    }
    SubLObject probability = NIL;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $disambiguation_term_counts_lock$.getGlobalValue() );
      final SubLObject pair = file_hash_table.get_file_hash_table( v_term, $disambiguation_term_counts$.getGlobalValue(), ConsesLow.list( ZERO_INTEGER, ZERO_INTEGER ) );
      final SubLObject correct = pair.first();
      final SubLObject total = conses_high.second( pair );
      if( total.numG( ZERO_INTEGER ) )
      {
        probability = Numbers.divide( correct, total );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $disambiguation_term_counts_lock$.getGlobalValue() );
      }
    }
    return probability;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6614L)
  public static SubLObject get_disambiguation_probability(final SubLObject v_term, final SubLObject token)
  {
    if( NIL == init_disambiguation_model( NIL ) )
    {
      return NIL;
    }
    SubLObject probability = NIL;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $disambiguation_term_counts_lock$.getGlobalValue() );
      final SubLObject pair = file_hash_table.get_file_hash_table( ConsesLow.list( token, v_term ), $disambiguation_term_counts$.getGlobalValue(), ConsesLow.list( ZERO_INTEGER, ZERO_INTEGER ) );
      final SubLObject correct = pair.first();
      final SubLObject total = conses_high.second( pair );
      if( total.numG( ZERO_INTEGER ) )
      {
        probability = Numbers.divide( correct, total );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $disambiguation_term_counts_lock$.getGlobalValue() );
      }
    }
    return probability;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7154L)
  public static SubLObject disambiguate_word(final SubLObject word)
  {
    SubLObject cdolist_list_var = document.word_interps( word );
    SubLObject interp = NIL;
    interp = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject cycl = nl_api_datastructures.get_nl_interp_cycl( interp );
      final SubLObject prior = get_disambiguation_prior( cycl );
      if( NIL != prior )
      {
        interp = conses_high.putf( interp, $kw17$WEIGHT, prior );
      }
      cdolist_list_var = cdolist_list_var.rest();
      interp = cdolist_list_var.first();
    }
    return word;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7533L)
  public static SubLObject disambiguate_sentence(final SubLObject sentence)
  {
    SubLObject cdolist_list_var = document.sentence_yield_exhaustive( sentence );
    SubLObject word = NIL;
    word = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      disambiguate_word( word );
      cdolist_list_var = cdolist_list_var.rest();
      word = cdolist_list_var.first();
    }
    return sentence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7830L)
  public static SubLObject disambiguate_paragraph(final SubLObject paragraph)
  {
    final SubLObject vector_var = document.paragraph_sentences( paragraph );
    final SubLObject backwardP_var = NIL;
    SubLObject length;
    SubLObject v_iteration;
    SubLObject element_num;
    SubLObject sentence;
    SubLObject cdolist_list_var;
    SubLObject word;
    for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      sentence = Vectors.aref( vector_var, element_num );
      cdolist_list_var = document.sentence_yield_exhaustive( sentence );
      word = NIL;
      word = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        disambiguate_word( word );
        cdolist_list_var = cdolist_list_var.rest();
        word = cdolist_list_var.first();
      }
    }
    return paragraph;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8136L)
  public static SubLObject disambiguate_document(final SubLObject v_document)
  {
    final SubLObject vector_var = document.document_paragraphs( v_document );
    final SubLObject backwardP_var = NIL;
    SubLObject length;
    SubLObject v_iteration;
    SubLObject element_num;
    SubLObject paragraph;
    SubLObject vector_var_$4;
    SubLObject backwardP_var_$5;
    SubLObject length_$6;
    SubLObject v_iteration_$7;
    SubLObject element_num_$8;
    SubLObject sentence;
    SubLObject cdolist_list_var;
    SubLObject word;
    for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      paragraph = Vectors.aref( vector_var, element_num );
      vector_var_$4 = document.paragraph_sentences( paragraph );
      backwardP_var_$5 = NIL;
      for( length_$6 = Sequences.length( vector_var_$4 ), v_iteration_$7 = NIL, v_iteration_$7 = ZERO_INTEGER; v_iteration_$7.numL( length_$6 ); v_iteration_$7 = Numbers.add( v_iteration_$7, ONE_INTEGER ) )
      {
        element_num_$8 = ( ( NIL != backwardP_var_$5 ) ? Numbers.subtract( length_$6, v_iteration_$7, ONE_INTEGER ) : v_iteration_$7 );
        sentence = Vectors.aref( vector_var_$4, element_num_$8 );
        cdolist_list_var = document.sentence_yield_exhaustive( sentence );
        word = NIL;
        word = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          disambiguate_word( word );
          cdolist_list_var = cdolist_list_var.rest();
          word = cdolist_list_var.first();
        }
      }
    }
    return v_document;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8433L)
  public static SubLObject fix_missing_quotes(final SubLObject term_string)
  {
    assert NIL != Types.stringp( term_string ) : term_string;
    final SubLObject regex = regular_expressions.compile_regular_expression( $str19$___________________________, UNPROVIDED );
    return regular_expression_utilities.regex_subst( regex, $str20$___1__2, term_string, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8722L)
  public static SubLObject add_upward_closure_to_labelled_file(final SubLObject input_filename, final SubLObject output_filename, SubLObject missing_terms)
  {
    if( missing_terms == UNPROVIDED )
    {
      missing_terms = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != missing_terms && !assertionsDisabledInClass && NIL == Types.hash_table_p( missing_terms ) )
    {
      throw new AssertionError( missing_terms );
    }
    if( NIL == Filesys.probe_file( input_filename ) )
    {
      Errors.error( $str22$Labelled_file__A_does_not_exist_, input_filename );
    }
    SubLObject stream = NIL;
    try
    {
      stream = compatibility.open_text( input_filename, $kw7$INPUT );
      if( !stream.isStream() )
      {
        Errors.error( $str8$Unable_to_open__S, input_filename );
      }
      final SubLObject in = stream;
      SubLObject stream_$9 = NIL;
      try
      {
        stream_$9 = compatibility.open_text( output_filename, $kw23$OUTPUT );
        if( !stream_$9.isStream() )
        {
          Errors.error( $str8$Unable_to_open__S, output_filename );
        }
        final SubLObject out = stream_$9;
        SubLObject stream_$10 = NIL;
        try
        {
          final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
          try
          {
            stream_macros.$stream_requires_locking$.bind( NIL, thread );
            stream_$10 = compatibility.open_text( in, $kw7$INPUT );
          }
          finally
          {
            stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
          }
          if( !stream_$10.isStream() )
          {
            Errors.error( $str8$Unable_to_open__S, in );
          }
          final SubLObject infile = stream_$10;
          if( infile.isStream() )
          {
            SubLObject line;
            SubLObject parts;
            SubLObject cdolist_list_var;
            SubLObject term_string;
            SubLObject error_string;
            SubLObject _prev_bind_2;
            SubLObject v_term;
            SubLObject upward_closure;
            SubLObject cdolist_list_var_$11;
            SubLObject parent;
            for( line = NIL, line = file_utilities.cdolines_get_next_line( infile ); NIL != line; line = file_utilities.cdolines_get_next_line( infile ) )
            {
              parts = string_utilities.split_string( line, $list10 );
              if( line.equal( $str14$d ) )
              {
                PrintLow.format( out, $str24$d__ );
              }
              else if( line.equal( $str15$p ) )
              {
                PrintLow.format( out, $str25$p__ );
              }
              else if( line.equal( $str26$s ) )
              {
                PrintLow.format( out, $str27$s__ );
              }
              else if( parts.first().equal( $str16$w ) )
              {
                PrintLow.format( out, $str28$w_A_A_A_A, new SubLObject[] { Characters.CHAR_tab, conses_high.second( parts ), Characters.CHAR_tab, conses_high.third( parts )
                } );
                cdolist_list_var = conses_high.nthcdr( THREE_INTEGER, parts );
                term_string = NIL;
                term_string = cdolist_list_var.first();
                while ( NIL != cdolist_list_var)
                {
                  error_string = NIL;
                  try
                  {
                    thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                    _prev_bind_2 = Errors.$error_handler$.currentBinding( thread );
                    try
                    {
                      Errors.$error_handler$.bind( $sym29$CATCH_ERROR_MESSAGE_HANDLER, thread );
                      try
                      {
                        v_term = reader.read_from_string( fix_missing_quotes( term_string ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                        upward_closure = ( ( NIL != fort_types_interface.collectionP( v_term ) ) ? genls.all_genls( v_term, UNPROVIDED, UNPROVIDED ) : isa.all_isa( v_term, UNPROVIDED, UNPROVIDED ) );
                        PrintLow.format( out, $str30$_A_S, Characters.CHAR_tab, cycl_utilities.hl_to_el( v_term ) );
                        cdolist_list_var_$11 = upward_closure;
                        parent = NIL;
                        parent = cdolist_list_var_$11.first();
                        while ( NIL != cdolist_list_var_$11)
                        {
                          PrintLow.format( out, $str31$_A__S, Characters.CHAR_tab, cycl_utilities.hl_to_el( parent ) );
                          cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                          parent = cdolist_list_var_$11.first();
                        }
                      }
                      catch( final Throwable catch_var )
                      {
                        Errors.handleThrowable( catch_var, NIL );
                      }
                    }
                    finally
                    {
                      Errors.$error_handler$.rebind( _prev_bind_2, thread );
                    }
                  }
                  catch( final Throwable ccatch_env_var )
                  {
                    error_string = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                  }
                  finally
                  {
                    thread.throwStack.pop();
                  }
                  if( NIL != error_string )
                  {
                    if( NIL != missing_terms )
                    {
                      Hashtables.sethash( term_string, missing_terms, T );
                    }
                    else
                    {
                      Errors.warn( $str32$_A_in_term__S, error_string, term_string );
                    }
                  }
                  cdolist_list_var = cdolist_list_var.rest();
                  term_string = cdolist_list_var.first();
                }
                PrintLow.format( out, $str33$__ );
              }
              else
              {
                Errors.error( $str34$Unable_to_understand_line___S, line );
              }
            }
          }
        }
        finally
        {
          final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            if( stream_$10.isStream() )
            {
              streams_high.close( stream_$10, UNPROVIDED );
            }
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          if( stream_$9.isStream() )
          {
            streams_high.close( stream_$9, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_4, thread );
        }
      }
    }
    finally
    {
      final SubLObject _prev_bind_5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values3 = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values3 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_5, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10057L)
  public static SubLObject add_upward_closure_to_labelled_directory(final SubLObject input_directory, final SubLObject output_directory, SubLObject missing_terms)
  {
    if( missing_terms == UNPROVIDED )
    {
      missing_terms = NIL;
    }
    SubLObject cdolist_list_var = Filesys.directory( input_directory, UNPROVIDED );
    SubLObject filename = NIL;
    filename = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject input_filename = PrintLow.format( NIL, $str35$_A__A, input_directory, filename );
      final SubLObject output_filename = PrintLow.format( NIL, $str35$_A__A, output_directory, filename );
      PrintLow.format( T, $str36$Processing__A__, input_filename );
      add_upward_closure_to_labelled_file( input_filename, output_filename, missing_terms );
      cdolist_list_var = cdolist_list_var.rest();
      filename = cdolist_list_var.first();
    }
    return NIL;
  }

  public static SubLObject declare_disambiguation_file()
  {
    SubLFiles.declareFunction( me, "init_disambiguation_model", "INIT-DISAMBIGUATION-MODEL", 0, 1, false );
    SubLFiles.declareFunction( me, "clear_disambiguation_model", "CLEAR-DISAMBIGUATION-MODEL", 0, 0, false );
    SubLFiles.declareFunction( me, "update_disambiguation_model", "UPDATE-DISAMBIGUATION-MODEL", 1, 0, false );
    SubLFiles.declareFunction( me, "get_disambiguation_prior", "GET-DISAMBIGUATION-PRIOR", 1, 0, false );
    SubLFiles.declareFunction( me, "get_disambiguation_probability", "GET-DISAMBIGUATION-PROBABILITY", 2, 0, false );
    SubLFiles.declareFunction( me, "disambiguate_word", "DISAMBIGUATE-WORD", 1, 0, false );
    SubLFiles.declareFunction( me, "disambiguate_sentence", "DISAMBIGUATE-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "disambiguate_paragraph", "DISAMBIGUATE-PARAGRAPH", 1, 0, false );
    SubLFiles.declareFunction( me, "disambiguate_document", "DISAMBIGUATE-DOCUMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "fix_missing_quotes", "FIX-MISSING-QUOTES", 1, 0, false );
    SubLFiles.declareFunction( me, "add_upward_closure_to_labelled_file", "ADD-UPWARD-CLOSURE-TO-LABELLED-FILE", 2, 1, false );
    SubLFiles.declareFunction( me, "add_upward_closure_to_labelled_directory", "ADD-UPWARD-CLOSURE-TO-LABELLED-DIRECTORY", 2, 1, false );
    return NIL;
  }

  public static SubLObject init_disambiguation_file()
  {
    $disambiguation_term_counts$ = SubLFiles.deflexical( "*DISAMBIGUATION-TERM-COUNTS*", NIL );
    $disambiguation_term_counts_load_attempted$ = SubLFiles.deflexical( "*DISAMBIGUATION-TERM-COUNTS-LOAD-ATTEMPTED*", NIL );
    $disambiguation_term_counts_lock$ = SubLFiles.deflexical( "*DISAMBIGUATION-TERM-COUNTS-LOCK*", maybeDefault( $sym0$_DISAMBIGUATION_TERM_COUNTS_LOCK_, $disambiguation_term_counts_lock$, () -> ( Locks.make_lock(
        $str1$Disambiguation_Term_Counts_Lock ) ) ) );
    $disambiguation_term_counts_file$ = SubLFiles.defparameter( "*DISAMBIGUATION-TERM-COUNTS-FILE*", $str2$data_sense_disambiguation_disambi );
    return NIL;
  }

  public static SubLObject setup_disambiguation_file()
  {
    subl_macro_promotions.declare_defglobal( $sym0$_DISAMBIGUATION_TERM_COUNTS_LOCK_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_disambiguation_file();
  }

  @Override
  public void initializeVariables()
  {
    init_disambiguation_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_disambiguation_file();
  }
  static
  {
    me = new disambiguation();
    $disambiguation_term_counts$ = null;
    $disambiguation_term_counts_load_attempted$ = null;
    $disambiguation_term_counts_lock$ = null;
    $disambiguation_term_counts_file$ = null;
    $sym0$_DISAMBIGUATION_TERM_COUNTS_LOCK_ = makeSymbol( "*DISAMBIGUATION-TERM-COUNTS-LOCK*" );
    $str1$Disambiguation_Term_Counts_Lock = makeString( "Disambiguation Term Counts Lock" );
    $str2$data_sense_disambiguation_disambi = makeString( "data/sense-disambiguation/disambiguation-term-counts.fht" );
    $kw3$IMAGE_INDEPENDENT_CFASL = makeKeyword( "IMAGE-INDEPENDENT-CFASL" );
    $int4$3000 = makeInteger( 3000 );
    $str5$Unable_to_create_disambiguation_h = makeString( "Unable to create disambiguation hash table (~A)." );
    $str6$Disambiguation_training_data_file = makeString( "Disambiguation training data file (~A) does not exist." );
    $kw7$INPUT = makeKeyword( "INPUT" );
    $str8$Unable_to_open__S = makeString( "Unable to open ~S" );
    $str9$processing_line__S__ = makeString( "processing line ~S~%" );
    $list10 = ConsesLow.list( Characters.CHAR_tab );
    $sym11$CYCL_FROM_STRING = makeSymbol( "CYCL-FROM-STRING" );
    $str12$_NONE = makeString( ":NONE" );
    $str13$ = makeString( "" );
    $str14$d = makeString( "d" );
    $str15$p = makeString( "p" );
    $str16$w = makeString( "w" );
    $kw17$WEIGHT = makeKeyword( "WEIGHT" );
    $sym18$STRINGP = makeSymbol( "STRINGP" );
    $str19$___________________________ = makeString( " ([^#()?]*[^#() ])( *[#()])" );
    $str20$___1__2 = makeString( " \"\\1\"\\2" );
    $sym21$HASH_TABLE_P = makeSymbol( "HASH-TABLE-P" );
    $str22$Labelled_file__A_does_not_exist_ = makeString( "Labelled file ~A does not exist." );
    $kw23$OUTPUT = makeKeyword( "OUTPUT" );
    $str24$d__ = makeString( "d~%" );
    $str25$p__ = makeString( "p~%" );
    $str26$s = makeString( "s" );
    $str27$s__ = makeString( "s~%" );
    $str28$w_A_A_A_A = makeString( "w~A~A~A~A" );
    $sym29$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $str30$_A_S = makeString( "~A~S" );
    $str31$_A__S = makeString( "~A^~S" );
    $str32$_A_in_term__S = makeString( "~A in term ~S" );
    $str33$__ = makeString( "~%" );
    $str34$Unable_to_understand_line___S = makeString( "Unable to understand line: ~S" );
    $str35$_A__A = makeString( "~A/~A" );
    $str36$Processing__A__ = makeString( "Processing ~A~%" );
  }
}
/*
 * 
 * Total time: 436 ms synthetic
 */