package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class pos_tagger
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.pos_tagger";
  public static final String myFingerPrint = "d8038c5ea89358ced6c1867bfd7724c821416c62d5452c15fce87ded9336632b";
  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 3117L)
  private static SubLSymbol $tagger_data_path$;
  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 3390L)
  private static SubLSymbol $exclude_from_normalization$;
  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 3541L)
  private static SubLSymbol $initial_state_resource$;
  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 3656L)
  private static SubLSymbol $state_resource$;
  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 3761L)
  private static SubLSymbol $transition_resource$;
  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 3873L)
  private static SubLSymbol $open_states_resource$;
  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 3987L)
  private static SubLSymbol $suffixes_resource$;
  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 4090L)
  private static SubLSymbol $unknown_word_resource$;
  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 4197L)
  private static SubLSymbol $suffix_resource$;
  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 4296L)
  private static SubLSymbol $hyphen_resource$;
  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 4395L)
  private static SubLSymbol $number_resource$;
  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 4494L)
  private static SubLSymbol $capitalization_resource$;
  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 4617L)
  private static SubLSymbol $state_interpretation_resource$;
  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 4762L)
  private static SubLSymbol $token_delimiters$;
  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 5050L)
  public static SubLSymbol $impossibility$;
  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 5198L)
  public static SubLSymbol $certainty$;
  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 5260L)
  public static SubLSymbol $low_probability$;
  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 5339L)
  private static SubLSymbol $state_set_cache_capacity$;
  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 5509L)
  public static SubLSymbol $pos_tagger$;
  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 16236L)
  public static SubLSymbol $dtp_tagger$;
  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 19299L)
  private static SubLSymbol $word_tag_patches$;
  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 22838L)
  public static SubLSymbol $dtp_hmm$;
  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 26217L)
  public static SubLSymbol $dtp_state_set$;
  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 28716L)
  public static SubLSymbol $dtp_transition_set$;
  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 30815L)
  public static SubLSymbol $dtp_emission_probability_estimator$;
  private static final SubLString $str0$data;
  private static final SubLString $str1$pos_tagging;
  private static final SubLList $list2;
  private static final SubLString $str3$initial_state;
  private static final SubLString $str4$states;
  private static final SubLString $str5$transitions;
  private static final SubLString $str6$open_states;
  private static final SubLString $str7$suffixes;
  private static final SubLString $str8$unknown;
  private static final SubLString $str9$suffix;
  private static final SubLString $str10$hyphen;
  private static final SubLString $str11$number;
  private static final SubLString $str12$capitalization;
  private static final SubLString $str13$index_to_state;
  private static final SubLList $list14;
  private static final SubLFloat $float15$_3_4028232e38;
  private static final SubLFloat $float16$0_0;
  private static final SubLInteger $int17$_20;
  private static final SubLInteger $int18$2000;
  private static final SubLSymbol $kw19$INPUT;
  private static final SubLString $str20$Unable_to_open__S;
  private static final SubLList $list21;
  private static final SubLList $list22;
  private static final SubLSymbol $sym23$AREF;
  private static final SubLInteger $int24$256;
  private static final SubLSymbol $kw25$IMAGE_INDEPENDENT_CFASL;
  private static final SubLString $str26$Unable_to_initialize_file_hashtab;
  private static final SubLString $str27$Building_conditional_probability_;
  private static final SubLList $list28;
  private static final SubLSymbol $sym29$CONS;
  private static final SubLList $list30;
  private static final SubLSymbol $sym31$CAR;
  private static final SubLSymbol $sym32$CDR;
  private static final SubLList $list33;
  private static final SubLSymbol $sym34$PROGN;
  private static final SubLSymbol $sym35$CSETF;
  private static final SubLList $list36;
  private static final SubLSymbol $sym37$CPUSH;
  private static final SubLList $list38;
  private static final SubLSymbol $sym39$ASSOC;
  private static final SubLSymbol $sym40$TRELLIS_CURRENT_COLUMN;
  private static final SubLList $list41;
  private static final SubLList $list42;
  private static final SubLSymbol $sym43$RPLACA;
  private static final SubLSymbol $sym44$ACONS;
  private static final SubLSymbol $sym45$CPOP;
  private static final SubLSymbol $sym46$TAGGER;
  private static final SubLSymbol $sym47$TAGGER_P;
  private static final SubLList $list48;
  private static final SubLList $list49;
  private static final SubLList $list50;
  private static final SubLList $list51;
  private static final SubLSymbol $sym52$DEFAULT_STRUCT_PRINT_FUNCTION;
  private static final SubLSymbol $sym53$TAGGER_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list54;
  private static final SubLSymbol $sym55$TAGGER_HMM;
  private static final SubLSymbol $sym56$_CSETF_TAGGER_HMM;
  private static final SubLSymbol $sym57$TAGGER_STATE_INTERPRETATION;
  private static final SubLSymbol $sym58$_CSETF_TAGGER_STATE_INTERPRETATION;
  private static final SubLSymbol $kw59$HMM;
  private static final SubLSymbol $kw60$STATE_INTERPRETATION;
  private static final SubLString $str61$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw62$BEGIN;
  private static final SubLSymbol $sym63$MAKE_TAGGER;
  private static final SubLSymbol $kw64$SLOT;
  private static final SubLSymbol $kw65$END;
  private static final SubLSymbol $sym66$VISIT_DEFSTRUCT_OBJECT_TAGGER_METHOD;
  private static final SubLSymbol $sym67$LISTP;
  private static final SubLInteger $int68$50;
  private static final SubLSymbol $sym69$DOCUMENT_P;
  private static final SubLSymbol $sym70$SENTENCE_P;
  private static final SubLSymbol $kw71$STRING;
  private static final SubLSymbol $kw72$CATEGORY;
  private static final SubLList $list73;
  private static final SubLSymbol $sym74$VECTORP;
  private static final SubLList $list75;
  private static final SubLString $str76$txt;
  private static final SubLString $str77$Unable_to_initialize_pos_tagger_s;
  private static final SubLSymbol $sym78$HMM;
  private static final SubLSymbol $sym79$HMM_P;
  private static final SubLList $list80;
  private static final SubLList $list81;
  private static final SubLList $list82;
  private static final SubLList $list83;
  private static final SubLSymbol $sym84$HMM_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list85;
  private static final SubLSymbol $sym86$HMM_INITIAL_STATE;
  private static final SubLSymbol $sym87$_CSETF_HMM_INITIAL_STATE;
  private static final SubLSymbol $sym88$HMM_STATES;
  private static final SubLSymbol $sym89$_CSETF_HMM_STATES;
  private static final SubLSymbol $sym90$HMM_TRANSITIONS;
  private static final SubLSymbol $sym91$_CSETF_HMM_TRANSITIONS;
  private static final SubLSymbol $kw92$INITIAL_STATE;
  private static final SubLSymbol $kw93$STATES;
  private static final SubLSymbol $kw94$TRANSITIONS;
  private static final SubLSymbol $sym95$MAKE_HMM;
  private static final SubLSymbol $sym96$VISIT_DEFSTRUCT_OBJECT_HMM_METHOD;
  private static final SubLString $str97$Unable_to_initialize_pos_tagger_H;
  private static final SubLSymbol $sym98$STATE_SET;
  private static final SubLSymbol $sym99$STATE_SET_P;
  private static final SubLList $list100;
  private static final SubLList $list101;
  private static final SubLList $list102;
  private static final SubLList $list103;
  private static final SubLSymbol $sym104$STATE_SET_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list105;
  private static final SubLSymbol $sym106$STATE_SET_STORE;
  private static final SubLSymbol $sym107$_CSETF_STATE_SET_STORE;
  private static final SubLSymbol $sym108$STATE_SET_ESTIMATOR;
  private static final SubLSymbol $sym109$_CSETF_STATE_SET_ESTIMATOR;
  private static final SubLSymbol $sym110$STATE_SET_CACHE;
  private static final SubLSymbol $sym111$_CSETF_STATE_SET_CACHE;
  private static final SubLSymbol $kw112$STORE;
  private static final SubLSymbol $kw113$ESTIMATOR;
  private static final SubLSymbol $kw114$CACHE;
  private static final SubLSymbol $sym115$MAKE_STATE_SET;
  private static final SubLSymbol $sym116$VISIT_DEFSTRUCT_OBJECT_STATE_SET_METHOD;
  private static final SubLString $str117$fht;
  private static final SubLString $str118$Unable_to_initialize_pos_tagger_s;
  private static final SubLSymbol $sym119$TRANSITION_SET;
  private static final SubLSymbol $sym120$TRANSITION_SET_P;
  private static final SubLList $list121;
  private static final SubLList $list122;
  private static final SubLList $list123;
  private static final SubLList $list124;
  private static final SubLSymbol $sym125$TRANSITION_SET_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list126;
  private static final SubLSymbol $sym127$TRANSITION_SET_KNOWN_PROBABILITIES;
  private static final SubLSymbol $sym128$_CSETF_TRANSITION_SET_KNOWN_PROBABILITIES;
  private static final SubLSymbol $sym129$TRANSITION_SET_ESTIMATED_PROBABILITIES;
  private static final SubLSymbol $sym130$_CSETF_TRANSITION_SET_ESTIMATED_PROBABILITIES;
  private static final SubLSymbol $kw131$KNOWN_PROBABILITIES;
  private static final SubLSymbol $kw132$ESTIMATED_PROBABILITIES;
  private static final SubLSymbol $sym133$MAKE_TRANSITION_SET;
  private static final SubLSymbol $sym134$VISIT_DEFSTRUCT_OBJECT_TRANSITION_SET_METHOD;
  private static final SubLSymbol $sym135$READ_FROM_STRING;
  private static final SubLString $str136$Unable_to_initialize_pos_tagger_H;
  private static final SubLSymbol $sym137$EMISSION_PROBABILITY_ESTIMATOR;
  private static final SubLSymbol $sym138$EMISSION_PROBABILITY_ESTIMATOR_P;
  private static final SubLList $list139;
  private static final SubLList $list140;
  private static final SubLList $list141;
  private static final SubLList $list142;
  private static final SubLSymbol $sym143$EMISSION_PROBABILITY_ESTIMATOR_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list144;
  private static final SubLSymbol $sym145$EPE_OPEN_STATES;
  private static final SubLSymbol $sym146$_CSETF_EPE_OPEN_STATES;
  private static final SubLSymbol $sym147$EPE_SUFFIXES;
  private static final SubLSymbol $sym148$_CSETF_EPE_SUFFIXES;
  private static final SubLSymbol $sym149$EPE_UNKNOWN_WORD;
  private static final SubLSymbol $sym150$_CSETF_EPE_UNKNOWN_WORD;
  private static final SubLSymbol $sym151$EPE_SUFFIX;
  private static final SubLSymbol $sym152$_CSETF_EPE_SUFFIX;
  private static final SubLSymbol $sym153$EPE_HYPHEN;
  private static final SubLSymbol $sym154$_CSETF_EPE_HYPHEN;
  private static final SubLSymbol $sym155$EPE_NUMBER;
  private static final SubLSymbol $sym156$_CSETF_EPE_NUMBER;
  private static final SubLSymbol $sym157$EPE_CAPITALIZATION;
  private static final SubLSymbol $sym158$_CSETF_EPE_CAPITALIZATION;
  private static final SubLSymbol $kw159$OPEN_STATES;
  private static final SubLSymbol $kw160$SUFFIXES;
  private static final SubLSymbol $kw161$UNKNOWN_WORD;
  private static final SubLSymbol $kw162$SUFFIX;
  private static final SubLSymbol $kw163$HYPHEN;
  private static final SubLSymbol $kw164$NUMBER;
  private static final SubLSymbol $kw165$CAPITALIZATION;
  private static final SubLSymbol $sym166$MAKE_EMISSION_PROBABILITY_ESTIMATOR;
  private static final SubLSymbol $sym167$VISIT_DEFSTRUCT_OBJECT_EMISSION_PROBABILITY_ESTIMATOR_METHOD;
  private static final SubLString $str168$Unable_to_initialize_pos_tagger_p;
  private static final SubLString $str169$_UNKNOWN;
  private static final SubLString $str170$_NOSUFF;
  private static final SubLString $str171$_CAP;
  private static final SubLString $str172$_NOCAP;
  private static final SubLString $str173$_HYP;
  private static final SubLString $str174$_NOHYP;
  private static final SubLString $str175$_DIGIT;
  private static final SubLString $str176$_NODIGIT;
  private static final SubLSymbol $sym177$STRINGP;
  private static final SubLString $str178$Unable_to_load_file__;

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 5587L)
  public static SubLObject new_cpm(final SubLObject size, SubLObject source_path, SubLObject testfn)
  {
    if( source_path == UNPROVIDED )
    {
      source_path = NIL;
    }
    if( testfn == UNPROVIDED )
    {
      testfn = Symbols.symbol_function( EQUAL );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject cpm = Hashtables.make_hash_table( size, testfn, UNPROVIDED );
    if( NIL != source_path )
    {
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_text( source_path, $kw19$INPUT );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str20$Unable_to_open__S, source_path );
        }
        final SubLObject infile = stream;
        if( infile.isStream() )
        {
          SubLObject line;
          SubLObject current;
          SubLObject datum;
          SubLObject conditioned;
          SubLObject conditioning;
          SubLObject probability;
          for( line = NIL, line = file_utilities.cdolines_get_next_line( infile ); NIL != line; line = file_utilities.cdolines_get_next_line( infile ) )
          {
            datum = ( current = string_utilities.split_string( line, $token_delimiters$.getGlobalValue() ) );
            conditioned = NIL;
            conditioning = NIL;
            probability = NIL;
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
            conditioned = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
            conditioning = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
            probability = current.first();
            current = current.rest();
            if( NIL == current )
            {
              cpm_set( cpm, conditioned, reader.parse_integer( conditioning, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), Numbers.sublisp_float( reader.read_from_string( probability, UNPROVIDED, UNPROVIDED,
                  UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED ) );
            }
            else
            {
              cdestructuring_bind.cdestructuring_bind_error( datum, $list21 );
            }
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    return cpm;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 6615L)
  public static SubLObject cpm_get_distribution(final SubLObject cpm, final SubLObject conditioned)
  {
    return Hashtables.gethash_without_values( conditioned, cpm, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 6957L)
  public static SubLObject cpm_get(final SubLObject cpm, final SubLObject conditioned, final SubLObject conditioning, SubLObject testfn, SubLObject v_default)
  {
    if( testfn == UNPROVIDED )
    {
      testfn = Symbols.symbol_function( EQL );
    }
    if( v_default == UNPROVIDED )
    {
      v_default = $impossibility$.getGlobalValue();
    }
    final SubLObject probability = conses_high.assoc( conditioning, cpm_get_distribution( cpm, conditioned ), testfn, UNPROVIDED ).rest();
    return ( NIL != probability ) ? probability : v_default;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 7387L)
  public static SubLObject cpm_set(final SubLObject cpm, final SubLObject conditioned, final SubLObject conditioning, final SubLObject probability)
  {
    SubLObject distribution = cpm_get_distribution( cpm, conditioned );
    distribution = ConsesLow.cons( ConsesLow.cons( conditioning, probability ), distribution );
    Hashtables.sethash( conditioned, cpm, distribution );
    return cpm;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 7937L)
  public static SubLObject new_cpa(final SubLObject x_dimension, final SubLObject y_dimension, SubLObject source_path, SubLObject parsefn)
  {
    if( source_path == UNPROVIDED )
    {
      source_path = NIL;
    }
    if( parsefn == UNPROVIDED )
    {
      parsefn = Symbols.symbol_function( IDENTITY );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject cpa = Vectors.make_vector( x_dimension, UNPROVIDED );
    SubLObject i;
    for( i = NIL, i = ZERO_INTEGER; i.numL( x_dimension ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      Vectors.set_aref( cpa, i, Vectors.make_vector( y_dimension, $low_probability$.getGlobalValue() ) );
    }
    if( NIL != source_path )
    {
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_text( source_path, $kw19$INPUT );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str20$Unable_to_open__S, source_path );
        }
        final SubLObject infile = stream;
        if( infile.isStream() )
        {
          SubLObject line;
          SubLObject current;
          SubLObject datum;
          SubLObject conditioned;
          SubLObject conditioning;
          SubLObject probability;
          for( line = NIL, line = file_utilities.cdolines_get_next_line( infile ); NIL != line; line = file_utilities.cdolines_get_next_line( infile ) )
          {
            datum = ( current = string_utilities.split_string( line, $token_delimiters$.getGlobalValue() ) );
            conditioned = NIL;
            conditioning = NIL;
            probability = NIL;
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
            conditioned = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
            conditioning = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
            probability = current.first();
            current = current.rest();
            if( NIL == current )
            {
              cpa_set( cpa, reader.read_from_string( conditioned, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), reader.read_from_string( conditioning, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
                  UNPROVIDED ), Functions.funcall( parsefn, probability ) );
            }
            else
            {
              cdestructuring_bind.cdestructuring_bind_error( datum, $list21 );
            }
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    return cpa;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 9062L)
  public static SubLObject cpa_get(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject cpa = NIL;
    SubLObject conditioned = NIL;
    SubLObject conditioning = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list22 );
    cpa = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list22 );
    conditioned = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list22 );
    conditioning = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym23$AREF, ConsesLow.list( $sym23$AREF, cpa, conditioned ), conditioning );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list22 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 9342L)
  public static SubLObject cpa_set(final SubLObject cpa, final SubLObject conditioned, final SubLObject conditioning, final SubLObject probability)
  {
    Vectors.set_aref( Vectors.aref( cpa, conditioned ), conditioning, probability );
    return cpa;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 9777L)
  public static SubLObject create_cpf(final SubLObject filename, final SubLObject size, SubLObject testfn, SubLObject avg_size)
  {
    if( testfn == UNPROVIDED )
    {
      testfn = Symbols.symbol_function( EQUAL );
    }
    if( avg_size == UNPROVIDED )
    {
      avg_size = $int24$256;
    }
    return file_hash_table.create_file_hash_table( filename, size, avg_size, testfn, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 10472L)
  public static SubLObject new_cpf(final SubLObject source_path, SubLObject testfn)
  {
    if( testfn == UNPROVIDED )
    {
      testfn = Symbols.symbol_function( EQUAL );
    }
    return file_hash_table.open_file_hash_table_read_only( source_path, testfn, $kw25$IMAGE_INDEPENDENT_CFASL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 10894L)
  public static SubLObject finalize_cpf(final SubLObject cpf)
  {
    return file_hash_table.finalize_file_hash_table( cpf );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 10988L)
  public static SubLObject cpf_get_distribution(final SubLObject cpf, final SubLObject conditioned)
  {
    return file_hash_table.get_file_hash_table( conditioned, cpf, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 11328L)
  public static SubLObject cpf_get(final SubLObject cpf, final SubLObject conditioned, final SubLObject conditioning, SubLObject testfn, SubLObject v_default)
  {
    if( testfn == UNPROVIDED )
    {
      testfn = Symbols.symbol_function( EQL );
    }
    if( v_default == UNPROVIDED )
    {
      v_default = $impossibility$.getGlobalValue();
    }
    final SubLObject probability = conses_high.assoc( conditioning, cpf_get_distribution( cpf, conditioned ), testfn, UNPROVIDED ).rest();
    return ( NIL != probability ) ? probability : v_default;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 11798L)
  public static SubLObject cpf_set(final SubLObject cpf, final SubLObject conditioned, final SubLObject conditioning, final SubLObject probability)
  {
    SubLObject distribution = cpf_get_distribution( cpf, conditioned );
    distribution = ConsesLow.cons( ConsesLow.cons( conditioning, probability ), distribution );
    file_hash_table.put_file_hash_table( conditioned, cpf, distribution );
    return cpf;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 12390L)
  public static SubLObject cpf_finalize(final SubLObject cpf)
  {
    file_hash_table.finalize_file_hash_table( cpf );
    return cpf;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 12632L)
  public static SubLObject cpf_create_backing_store(final SubLObject source_path, final SubLObject backing_store, final SubLObject size, SubLObject avg_size)
  {
    if( avg_size == UNPROVIDED )
    {
      avg_size = $int24$256;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Filesys.probe_file( source_path ) )
    {
      Errors.error( Sequences.cconcatenate( $str26$Unable_to_initialize_file_hashtab, file_utilities.why_not_probe_fileP( source_path ) ) );
    }
    final SubLObject cpf = create_cpf( backing_store, size, EQUAL, avg_size );
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
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
        utilities_macros.noting_percent_progress_preamble( $str27$Building_conditional_probability_ );
        SubLObject stream = NIL;
        try
        {
          final SubLObject _prev_bind_0_$1 = stream_macros.$stream_requires_locking$.currentBinding( thread );
          try
          {
            stream_macros.$stream_requires_locking$.bind( NIL, thread );
            stream = compatibility.open_text( source_path, $kw19$INPUT );
          }
          finally
          {
            stream_macros.$stream_requires_locking$.rebind( _prev_bind_0_$1, thread );
          }
          if( !stream.isStream() )
          {
            Errors.error( $str20$Unable_to_open__S, source_path );
          }
          final SubLObject stream_var = stream;
          if( stream_var.isStream() )
          {
            final SubLObject length_var = streams_high.file_length( stream_var );
            final SubLObject stream_var_$2 = stream_var;
            SubLObject line_number_var = NIL;
            SubLObject line = NIL;
            line_number_var = ZERO_INTEGER;
            for( line = file_utilities.do_stream_lines_get_next_line( stream_var_$2 ); NIL != line; line = file_utilities.do_stream_lines_get_next_line( stream_var_$2 ) )
            {
              SubLObject current;
              final SubLObject datum = current = string_utilities.split_string( line, $token_delimiters$.getGlobalValue() );
              SubLObject conditioned = NIL;
              SubLObject conditioning = NIL;
              SubLObject probability = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
              conditioned = current.first();
              current = current.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
              conditioning = current.first();
              current = current.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
              probability = current.first();
              current = current.rest();
              if( NIL == current )
              {
                cpf_set( cpf, conditioned, reader.parse_integer( conditioning, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), Numbers.sublisp_float( reader.read_from_string( probability, UNPROVIDED, UNPROVIDED,
                    UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED ) );
              }
              else
              {
                cdestructuring_bind.cdestructuring_bind_error( datum, $list21 );
              }
              utilities_macros.note_percent_progress( streams_high.file_position( stream_var, UNPROVIDED ), length_var );
              line_number_var = number_utilities.f_1X( line_number_var );
            }
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            if( stream.isStream() )
            {
              streams_high.close( stream, UNPROVIDED );
            }
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$2, thread );
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$3, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    return cpf_finalize( cpf );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 13851L)
  public static SubLObject new_trellis_entry(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject probability = NIL;
    SubLObject source = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list28 );
    probability = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list28 );
    source = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym29$CONS, probability, source );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list28 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 14158L)
  public static SubLObject trellis_entry_probability(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject entry = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list30 );
    entry = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym31$CAR, entry );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list30 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 14299L)
  public static SubLObject trellis_entry_source(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject entry = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list30 );
    entry = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym32$CDR, entry );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list30 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 14430L)
  public static SubLObject trellis_entry_update(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject entry = NIL;
    SubLObject probability = NIL;
    SubLObject source = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list33 );
    entry = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list33 );
    probability = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list33 );
    source = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym34$PROGN, ConsesLow.list( $sym35$CSETF, ConsesLow.list( $sym31$CAR, entry ), probability ), ConsesLow.list( $sym35$CSETF, ConsesLow.list( $sym32$CDR, entry ), source ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list33 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 14790L)
  public static SubLObject new_trellis()
  {
    return ConsesLow.list( NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 14910L)
  public static SubLObject trellis_new_column(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject trellis = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list36 );
    trellis = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym37$CPUSH, NIL, trellis );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list36 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 15039L)
  public static SubLObject trellis_current_column(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject trellis = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list36 );
    trellis = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym31$CAR, trellis );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list36 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 15146L)
  public static SubLObject trellis_get(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject trellis = NIL;
    SubLObject key = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
    trellis = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
    key = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym32$CDR, ConsesLow.listS( $sym39$ASSOC, key, ConsesLow.list( $sym40$TRELLIS_CURRENT_COLUMN, trellis ), $list41 ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list38 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 15336L)
  public static SubLObject trellis_set(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject trellis = NIL;
    SubLObject key = NIL;
    SubLObject value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list42 );
    trellis = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list42 );
    key = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list42 );
    value = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym43$RPLACA, trellis, ConsesLow.list( $sym44$ACONS, key, value, ConsesLow.list( $sym31$CAR, trellis ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list42 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 15510L)
  public static SubLObject trellis_finalize_column(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject trellis = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list36 );
    trellis = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym45$CPOP, trellis );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list36 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 15658L)
  public static SubLObject trellis_get_max_entry(final SubLObject trellis)
  {
    SubLObject max_probability = $impossibility$.getGlobalValue();
    SubLObject result = NIL;
    SubLObject probability = NIL;
    SubLObject cdolist_list_var = trellis.first();
    SubLObject stateXentry = NIL;
    stateXentry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      probability = stateXentry.rest().first();
      if( probability.numGE( max_probability ) )
      {
        result = stateXentry;
        max_probability = probability;
      }
      cdolist_list_var = cdolist_list_var.rest();
      stateXentry = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 16236L)
  public static SubLObject tagger_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 16236L)
  public static SubLObject tagger_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $tagger_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 16236L)
  public static SubLObject tagger_hmm(final SubLObject v_object)
  {
    assert NIL != tagger_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 16236L)
  public static SubLObject tagger_state_interpretation(final SubLObject v_object)
  {
    assert NIL != tagger_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 16236L)
  public static SubLObject _csetf_tagger_hmm(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != tagger_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 16236L)
  public static SubLObject _csetf_tagger_state_interpretation(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != tagger_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 16236L)
  public static SubLObject make_tagger(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $tagger_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw59$HMM ) )
      {
        _csetf_tagger_hmm( v_new, current_value );
      }
      else if( pcase_var.eql( $kw60$STATE_INTERPRETATION ) )
      {
        _csetf_tagger_state_interpretation( v_new, current_value );
      }
      else
      {
        Errors.error( $str61$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 16236L)
  public static SubLObject visit_defstruct_tagger(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw62$BEGIN, $sym63$MAKE_TAGGER, TWO_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw64$SLOT, $kw59$HMM, tagger_hmm( obj ) );
    Functions.funcall( visitor_fn, obj, $kw64$SLOT, $kw60$STATE_INTERPRETATION, tagger_state_interpretation( obj ) );
    Functions.funcall( visitor_fn, obj, $kw65$END, $sym63$MAKE_TAGGER, TWO_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 16236L)
  public static SubLObject visit_defstruct_object_tagger_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_tagger( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 16417L)
  public static SubLObject new_tagger(SubLObject source_path)
  {
    if( source_path == UNPROVIDED )
    {
      source_path = $tagger_data_path$.getDynamicValue();
    }
    assert NIL != Types.listp( source_path ) : source_path;
    final SubLObject tagger = make_tagger( UNPROVIDED );
    _csetf_tagger_hmm( tagger, new_hmm( source_path ) );
    _csetf_tagger_state_interpretation( tagger, new_state_interpretation( $int68$50, source_path ) );
    return tagger;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 16953L)
  public static SubLObject finalize_tagger(final SubLObject tagger)
  {
    assert NIL != tagger_p( tagger ) : tagger;
    return finalize_hmm( tagger_hmm( tagger ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 17134L)
  public static SubLObject tagger_tag_document(final SubLObject tagger, final SubLObject v_document)
  {
    assert NIL != tagger_p( tagger ) : tagger;
    assert NIL != document.document_p( v_document ) : v_document;
    final SubLObject vector_var = document.document_paragraphs( v_document );
    final SubLObject backwardP_var = NIL;
    SubLObject length;
    SubLObject v_iteration;
    SubLObject element_num;
    SubLObject paragraph;
    SubLObject vector_var_$5;
    SubLObject backwardP_var_$6;
    SubLObject length_$7;
    SubLObject v_iteration_$8;
    SubLObject element_num_$9;
    SubLObject sentence;
    for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      paragraph = Vectors.aref( vector_var, element_num );
      vector_var_$5 = document.paragraph_sentences( paragraph );
      backwardP_var_$6 = NIL;
      for( length_$7 = Sequences.length( vector_var_$5 ), v_iteration_$8 = NIL, v_iteration_$8 = ZERO_INTEGER; v_iteration_$8.numL( length_$7 ); v_iteration_$8 = Numbers.add( v_iteration_$8, ONE_INTEGER ) )
      {
        element_num_$9 = ( ( NIL != backwardP_var_$6 ) ? Numbers.subtract( length_$7, v_iteration_$8, ONE_INTEGER ) : v_iteration_$8 );
        sentence = Vectors.aref( vector_var_$5, element_num_$9 );
        tagger_tag_sentence( tagger, sentence );
      }
    }
    return v_document;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 17764L)
  public static SubLObject tagger_tag_sentence(final SubLObject tagger, final SubLObject sentence)
  {
    assert NIL != tagger_p( tagger ) : tagger;
    assert NIL != document.sentence_p( sentence ) : sentence;
    final SubLObject words = document.sentence_yield( sentence );
    if( Sequences.length( words ).isPositive() )
    {
      final SubLObject initial_spelling = document.word_string( Vectors.aref( words, ZERO_INTEGER ) );
      tagger_normalize_initial_capitalization( tagger, words );
      hmm_most_likely_path_probability( tagger_hmm( tagger ), words );
      document.word_update( Vectors.aref( words, ZERO_INTEGER ), ConsesLow.list( $kw71$STRING, initial_spelling ) );
      SubLObject word = NIL;
      SubLObject cdotimes_end_var;
      SubLObject i;
      for( cdotimes_end_var = Sequences.length( words ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        word = Vectors.aref( words, i );
        patch_word_tag( word );
        document.word_update( word, ConsesLow.list( $kw72$CATEGORY, state_interpretation_get( tagger_state_interpretation( tagger ), document.word_category( word ) ) ) );
      }
    }
    return sentence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 19458L)
  public static SubLObject patch_word_tag(final SubLObject word)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject new_integer = conses_high.assoc( ConsesLow.cons( document.word_string( word ), document.word_category( word ) ), $word_tag_patches$.getDynamicValue( thread ), EQUAL, UNPROVIDED ).rest();
    return ( NIL != new_integer ) ? document.word_update( word, ConsesLow.list( $kw72$CATEGORY, new_integer ) ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 19779L)
  public static SubLObject tagger_normalize_initial_capitalization(final SubLObject tagger, final SubLObject words)
  {
    assert NIL != tagger_p( tagger ) : tagger;
    assert NIL != Types.vectorp( words ) : words;
    if( NIL == exclude_from_normalizationP( document.word_string( Vectors.aref( words, ZERO_INTEGER ) ) ) )
    {
      final SubLObject orig_first = document.new_word( ConsesLow.list( $kw71$STRING, document.word_string( Vectors.aref( words, ZERO_INTEGER ) ) ) );
      final SubLObject second_word = Sequences.length( words ).numG( ONE_INTEGER ) ? document.new_word( ConsesLow.list( $kw71$STRING, document.word_string( Vectors.aref( words, ONE_INTEGER ) ) ) )
          : document.new_word( $list75 );
      final SubLObject downcase_first = document.new_word( ConsesLow.list( $kw71$STRING, Strings.string_downcase( document.word_string( orig_first ), UNPROVIDED, UNPROVIDED ) ) );
      SubLObject orig_prob = $impossibility$.getGlobalValue();
      SubLObject downcase_prob = $impossibility$.getGlobalValue();
      final SubLObject orig_sentence = Vectors.vector( new SubLObject[] { orig_first, second_word
      } );
      final SubLObject downcase_sentence = Vectors.vector( new SubLObject[] { downcase_first, second_word
      } );
      final SubLObject hmm = tagger_hmm( tagger );
      if( NIL != state_set_known_word( hmm_states( hmm ), orig_first ) )
      {
        orig_prob = hmm_most_likely_path_probability( hmm, orig_sentence );
      }
      if( NIL != state_set_known_word( hmm_states( hmm ), downcase_first ) )
      {
        downcase_prob = hmm_most_likely_path_probability( hmm, downcase_sentence );
      }
      if( downcase_prob.numG( orig_prob ) )
      {
        document.word_update( Vectors.aref( words, ZERO_INTEGER ), ConsesLow.list( $kw71$STRING, document.word_string( downcase_first ) ) );
      }
    }
    return words;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 21419L)
  public static SubLObject exclude_from_normalizationP(final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return conses_high.member( string, $exclude_from_normalization$.getDynamicValue( thread ), EQUAL, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 21655L)
  public static SubLObject new_state_interpretation(final SubLObject size, final SubLObject source_path)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject state_interpretation = Vectors.make_vector( size, UNPROVIDED );
    final SubLObject state_interpretation_path = file_utilities.cyc_home_filename( source_path, $state_interpretation_resource$.getGlobalValue(), $str76$txt );
    SubLObject tokens = NIL;
    SubLObject state = NIL;
    SubLObject interpretation = NIL;
    if( NIL != Filesys.probe_file( state_interpretation_path ) )
    {
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_text( state_interpretation_path, $kw19$INPUT );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str20$Unable_to_open__S, state_interpretation_path );
        }
        final SubLObject infile = stream;
        if( infile.isStream() )
        {
          SubLObject line;
          for( line = NIL, line = file_utilities.cdolines_get_next_line( infile ); NIL != line; line = file_utilities.cdolines_get_next_line( infile ) )
          {
            tokens = string_utilities.split_string( line, $token_delimiters$.getGlobalValue() );
            state = reader.parse_integer( tokens.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            interpretation = ( Sequences.length( tokens.rest() ).numG( ONE_INTEGER ) ? tokens.rest() : conses_high.second( tokens ) );
            Vectors.set_aref( state_interpretation, state, Symbols.make_keyword( interpretation ) );
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    else
    {
      Errors.error( $str77$Unable_to_initialize_pos_tagger_s, state_interpretation_path );
    }
    return state_interpretation;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 22666L)
  public static SubLObject state_interpretation_get(final SubLObject si, final SubLObject state)
  {
    return Vectors.aref( si, state );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 22838L)
  public static SubLObject hmm_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 22838L)
  public static SubLObject hmm_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $hmm_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 22838L)
  public static SubLObject hmm_initial_state(final SubLObject v_object)
  {
    assert NIL != hmm_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 22838L)
  public static SubLObject hmm_states(final SubLObject v_object)
  {
    assert NIL != hmm_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 22838L)
  public static SubLObject hmm_transitions(final SubLObject v_object)
  {
    assert NIL != hmm_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 22838L)
  public static SubLObject _csetf_hmm_initial_state(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != hmm_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 22838L)
  public static SubLObject _csetf_hmm_states(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != hmm_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 22838L)
  public static SubLObject _csetf_hmm_transitions(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != hmm_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 22838L)
  public static SubLObject make_hmm(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $hmm_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw92$INITIAL_STATE ) )
      {
        _csetf_hmm_initial_state( v_new, current_value );
      }
      else if( pcase_var.eql( $kw93$STATES ) )
      {
        _csetf_hmm_states( v_new, current_value );
      }
      else if( pcase_var.eql( $kw94$TRANSITIONS ) )
      {
        _csetf_hmm_transitions( v_new, current_value );
      }
      else
      {
        Errors.error( $str61$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 22838L)
  public static SubLObject visit_defstruct_hmm(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw62$BEGIN, $sym95$MAKE_HMM, THREE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw64$SLOT, $kw92$INITIAL_STATE, hmm_initial_state( obj ) );
    Functions.funcall( visitor_fn, obj, $kw64$SLOT, $kw93$STATES, hmm_states( obj ) );
    Functions.funcall( visitor_fn, obj, $kw64$SLOT, $kw94$TRANSITIONS, hmm_transitions( obj ) );
    Functions.funcall( visitor_fn, obj, $kw65$END, $sym95$MAKE_HMM, THREE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 22838L)
  public static SubLObject visit_defstruct_object_hmm_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_hmm( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 23030L)
  public static SubLObject new_hmm(final SubLObject source_path)
  {
    final SubLObject path = file_utilities.cyc_home_filename( source_path, $initial_state_resource$.getGlobalValue(), $str76$txt );
    final SubLObject hmm = make_hmm( UNPROVIDED );
    if( NIL != Filesys.probe_file( path ) )
    {
      _csetf_hmm_initial_state( hmm, reader.parse_integer( load_list( path ).first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    }
    else
    {
      Errors.error( $str97$Unable_to_initialize_pos_tagger_H, path );
    }
    _csetf_hmm_states( hmm, new_state_set( source_path, UNPROVIDED ) );
    _csetf_hmm_transitions( hmm, new_transition_set( source_path ) );
    return hmm;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 23727L)
  public static SubLObject finalize_hmm(final SubLObject hmm)
  {
    return finalize_state_set( hmm_states( hmm ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 23828L)
  public static SubLObject hmm_most_likely_path_probability(final SubLObject hmm, final SubLObject words)
  {
    SubLObject trellis = new_trellis();
    final SubLObject states = hmm_states( hmm );
    final SubLObject transitions = hmm_transitions( hmm );
    SubLObject word_cond_state_prob = NIL;
    SubLObject state = NIL;
    SubLObject probability = NIL;
    SubLObject max_entry = NIL;
    SubLObject prev_column = NIL;
    SubLObject prev_state = NIL;
    SubLObject transition_distribution = NIL;
    SubLObject word = NIL;
    ConsesLow.rplaca( trellis, conses_high.acons( hmm_initial_state( hmm ), ConsesLow.cons( $certainty$.getGlobalValue(), NIL ), trellis.first() ) );
    SubLObject cdotimes_end_var;
    SubLObject j;
    SubLObject cdolist_list_var;
    SubLObject stateXprob;
    SubLObject cdolist_list_var_$10;
    SubLObject prev_stateXtrellis_entry;
    for( cdotimes_end_var = Sequences.length( words ), j = NIL, j = ZERO_INTEGER; j.numL( cdotimes_end_var ); j = Numbers.add( j, ONE_INTEGER ) )
    {
      word = Vectors.aref( words, j );
      prev_column = trellis.first();
      trellis = ConsesLow.cons( NIL, trellis );
      cdolist_list_var = state_set_get_distribution( states, word );
      stateXprob = NIL;
      stateXprob = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        state = stateXprob.first();
        word_cond_state_prob = stateXprob.rest();
        max_entry = ConsesLow.cons( $impossibility$.getGlobalValue(), ZERO_INTEGER );
        transition_distribution = transition_set_get_distribution( transitions, state );
        cdolist_list_var_$10 = prev_column;
        prev_stateXtrellis_entry = NIL;
        prev_stateXtrellis_entry = cdolist_list_var_$10.first();
        while ( NIL != cdolist_list_var_$10)
        {
          prev_state = prev_stateXtrellis_entry.first();
          probability = Numbers.add( prev_stateXtrellis_entry.rest().first(), Vectors.aref( transition_distribution, prev_state ), word_cond_state_prob );
          if( probability.numG( max_entry.first() ) )
          {
            ConsesLow.rplaca( max_entry, probability );
            ConsesLow.rplacd( max_entry, prev_state );
          }
          cdolist_list_var_$10 = cdolist_list_var_$10.rest();
          prev_stateXtrellis_entry = cdolist_list_var_$10.first();
        }
        ConsesLow.rplaca( trellis, conses_high.acons( state, max_entry, trellis.first() ) );
        cdolist_list_var = cdolist_list_var.rest();
        stateXprob = cdolist_list_var.first();
      }
    }
    SubLObject word_index = Numbers.subtract( Sequences.length( words ), ONE_INTEGER );
    final SubLObject maxstateXentry = trellis_get_max_entry( trellis );
    SubLObject max_state = maxstateXentry.first();
    while ( !word_index.isNegative())
    {
      document.word_update( Vectors.aref( words, word_index ), ConsesLow.list( $kw72$CATEGORY, max_state ) );
      max_state = conses_high.assoc( max_state, trellis.first(), Symbols.symbol_function( EQL ), UNPROVIDED ).rest().rest();
      word_index = Numbers.subtract( word_index, ONE_INTEGER );
      trellis = trellis.rest();
    }
    return maxstateXentry.rest().first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 26217L)
  public static SubLObject state_set_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 26217L)
  public static SubLObject state_set_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $state_set_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 26217L)
  public static SubLObject state_set_store(final SubLObject v_object)
  {
    assert NIL != state_set_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 26217L)
  public static SubLObject state_set_estimator(final SubLObject v_object)
  {
    assert NIL != state_set_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 26217L)
  public static SubLObject state_set_cache(final SubLObject v_object)
  {
    assert NIL != state_set_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 26217L)
  public static SubLObject _csetf_state_set_store(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != state_set_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 26217L)
  public static SubLObject _csetf_state_set_estimator(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != state_set_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 26217L)
  public static SubLObject _csetf_state_set_cache(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != state_set_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 26217L)
  public static SubLObject make_state_set(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $state_set_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw112$STORE ) )
      {
        _csetf_state_set_store( v_new, current_value );
      }
      else if( pcase_var.eql( $kw113$ESTIMATOR ) )
      {
        _csetf_state_set_estimator( v_new, current_value );
      }
      else if( pcase_var.eql( $kw114$CACHE ) )
      {
        _csetf_state_set_cache( v_new, current_value );
      }
      else
      {
        Errors.error( $str61$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 26217L)
  public static SubLObject visit_defstruct_state_set(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw62$BEGIN, $sym115$MAKE_STATE_SET, THREE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw64$SLOT, $kw112$STORE, state_set_store( obj ) );
    Functions.funcall( visitor_fn, obj, $kw64$SLOT, $kw113$ESTIMATOR, state_set_estimator( obj ) );
    Functions.funcall( visitor_fn, obj, $kw64$SLOT, $kw114$CACHE, state_set_cache( obj ) );
    Functions.funcall( visitor_fn, obj, $kw65$END, $sym115$MAKE_STATE_SET, THREE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 26217L)
  public static SubLObject visit_defstruct_object_state_set_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_state_set( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 26506L)
  public static SubLObject new_state_set(final SubLObject source_path, SubLObject cache_capacity)
  {
    if( cache_capacity == UNPROVIDED )
    {
      cache_capacity = $state_set_cache_capacity$.getDynamicValue();
    }
    final SubLObject path = file_utilities.cyc_home_filename( source_path, $state_resource$.getGlobalValue(), $str117$fht );
    final SubLObject state_set = make_state_set( UNPROVIDED );
    if( NIL != Filesys.probe_file( path ) )
    {
      _csetf_state_set_store( state_set, new_cpf( path, Symbols.symbol_function( EQUAL ) ) );
    }
    else
    {
      Errors.error( $str118$Unable_to_initialize_pos_tagger_s, path );
    }
    _csetf_state_set_estimator( state_set, new_emission_probability_estimator( source_path ) );
    _csetf_state_set_cache( state_set, cache.new_cache( cache_capacity, Symbols.symbol_function( EQUAL ) ) );
    return state_set;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 27246L)
  public static SubLObject finalize_state_set(final SubLObject state_set)
  {
    return finalize_cpf( state_set_store( state_set ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 27370L)
  public static SubLObject state_set_get_distribution(final SubLObject state_set, final SubLObject word)
  {
    final SubLObject string = document.word_string( word );
    SubLObject distribution = cache.cache_get( state_set_cache( state_set ), string );
    if( NIL == distribution )
    {
      distribution = cpf_get_distribution( state_set_store( state_set ), string );
      if( NIL == distribution )
      {
        distribution = epe_get_distribution( state_set_estimator( state_set ), string );
      }
      cache.cache_set( state_set_cache( state_set ), string, distribution );
    }
    return distribution;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 28323L)
  public static SubLObject state_set_known_word(final SubLObject states, final SubLObject word)
  {
    final SubLObject distribution = cache.cache_get( state_set_cache( states ), document.word_string( word ) );
    return ( NIL != distribution ) ? distribution : cpf_get_distribution( state_set_store( states ), document.word_string( word ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 28716L)
  public static SubLObject transition_set_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 28716L)
  public static SubLObject transition_set_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $transition_set_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 28716L)
  public static SubLObject transition_set_known_probabilities(final SubLObject v_object)
  {
    assert NIL != transition_set_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 28716L)
  public static SubLObject transition_set_estimated_probabilities(final SubLObject v_object)
  {
    assert NIL != transition_set_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 28716L)
  public static SubLObject _csetf_transition_set_known_probabilities(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != transition_set_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 28716L)
  public static SubLObject _csetf_transition_set_estimated_probabilities(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != transition_set_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 28716L)
  public static SubLObject make_transition_set(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $transition_set_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw131$KNOWN_PROBABILITIES ) )
      {
        _csetf_transition_set_known_probabilities( v_new, current_value );
      }
      else if( pcase_var.eql( $kw132$ESTIMATED_PROBABILITIES ) )
      {
        _csetf_transition_set_estimated_probabilities( v_new, current_value );
      }
      else
      {
        Errors.error( $str61$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 28716L)
  public static SubLObject visit_defstruct_transition_set(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw62$BEGIN, $sym133$MAKE_TRANSITION_SET, TWO_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw64$SLOT, $kw131$KNOWN_PROBABILITIES, transition_set_known_probabilities( obj ) );
    Functions.funcall( visitor_fn, obj, $kw64$SLOT, $kw132$ESTIMATED_PROBABILITIES, transition_set_estimated_probabilities( obj ) );
    Functions.funcall( visitor_fn, obj, $kw65$END, $sym133$MAKE_TRANSITION_SET, TWO_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 28716L)
  public static SubLObject visit_defstruct_object_transition_set_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_transition_set( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 28903L)
  public static SubLObject new_transition_set(final SubLObject source_path)
  {
    final SubLObject transition_set = make_transition_set( UNPROVIDED );
    final SubLObject transition_path = file_utilities.cyc_home_filename( source_path, $transition_resource$.getGlobalValue(), $str76$txt );
    if( NIL != Filesys.probe_file( transition_path ) )
    {
      _csetf_transition_set_known_probabilities( transition_set, new_cpa( $int68$50, $int68$50, transition_path, Symbols.symbol_function( $sym135$READ_FROM_STRING ) ) );
    }
    else
    {
      Errors.error( $str136$Unable_to_initialize_pos_tagger_H, transition_path );
    }
    _csetf_transition_set_estimated_probabilities( transition_set, NIL );
    return transition_set;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 29681L)
  public static SubLObject transition_set_get(final SubLObject transition_set, final SubLObject conditioned, final SubLObject conditioning)
  {
    return Vectors.aref( Vectors.aref( transition_set_known_probabilities( transition_set ), conditioned ), conditioning );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 30071L)
  public static SubLObject transition_set_get_distribution(final SubLObject transition_set, final SubLObject conditioned)
  {
    return Vectors.aref( transition_set_known_probabilities( transition_set ), conditioned );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 30229L)
  public static SubLObject transition_set_set(final SubLObject transition_set, final SubLObject conditioned, final SubLObject conditioning, final SubLObject probability)
  {
    cpa_set( transition_set_known_probabilities( transition_set ), conditioned, conditioning, probability );
    return transition_set;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 30815L)
  public static SubLObject emission_probability_estimator_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 30815L)
  public static SubLObject emission_probability_estimator_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $emission_probability_estimator_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 30815L)
  public static SubLObject epe_open_states(final SubLObject v_object)
  {
    assert NIL != emission_probability_estimator_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 30815L)
  public static SubLObject epe_suffixes(final SubLObject v_object)
  {
    assert NIL != emission_probability_estimator_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 30815L)
  public static SubLObject epe_unknown_word(final SubLObject v_object)
  {
    assert NIL != emission_probability_estimator_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 30815L)
  public static SubLObject epe_suffix(final SubLObject v_object)
  {
    assert NIL != emission_probability_estimator_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 30815L)
  public static SubLObject epe_hyphen(final SubLObject v_object)
  {
    assert NIL != emission_probability_estimator_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 30815L)
  public static SubLObject epe_number(final SubLObject v_object)
  {
    assert NIL != emission_probability_estimator_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 30815L)
  public static SubLObject epe_capitalization(final SubLObject v_object)
  {
    assert NIL != emission_probability_estimator_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 30815L)
  public static SubLObject _csetf_epe_open_states(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != emission_probability_estimator_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 30815L)
  public static SubLObject _csetf_epe_suffixes(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != emission_probability_estimator_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 30815L)
  public static SubLObject _csetf_epe_unknown_word(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != emission_probability_estimator_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 30815L)
  public static SubLObject _csetf_epe_suffix(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != emission_probability_estimator_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 30815L)
  public static SubLObject _csetf_epe_hyphen(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != emission_probability_estimator_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 30815L)
  public static SubLObject _csetf_epe_number(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != emission_probability_estimator_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 30815L)
  public static SubLObject _csetf_epe_capitalization(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != emission_probability_estimator_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 30815L)
  public static SubLObject make_emission_probability_estimator(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $emission_probability_estimator_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw159$OPEN_STATES ) )
      {
        _csetf_epe_open_states( v_new, current_value );
      }
      else if( pcase_var.eql( $kw160$SUFFIXES ) )
      {
        _csetf_epe_suffixes( v_new, current_value );
      }
      else if( pcase_var.eql( $kw161$UNKNOWN_WORD ) )
      {
        _csetf_epe_unknown_word( v_new, current_value );
      }
      else if( pcase_var.eql( $kw162$SUFFIX ) )
      {
        _csetf_epe_suffix( v_new, current_value );
      }
      else if( pcase_var.eql( $kw163$HYPHEN ) )
      {
        _csetf_epe_hyphen( v_new, current_value );
      }
      else if( pcase_var.eql( $kw164$NUMBER ) )
      {
        _csetf_epe_number( v_new, current_value );
      }
      else if( pcase_var.eql( $kw165$CAPITALIZATION ) )
      {
        _csetf_epe_capitalization( v_new, current_value );
      }
      else
      {
        Errors.error( $str61$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 30815L)
  public static SubLObject visit_defstruct_emission_probability_estimator(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw62$BEGIN, $sym166$MAKE_EMISSION_PROBABILITY_ESTIMATOR, SEVEN_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw64$SLOT, $kw159$OPEN_STATES, epe_open_states( obj ) );
    Functions.funcall( visitor_fn, obj, $kw64$SLOT, $kw160$SUFFIXES, epe_suffixes( obj ) );
    Functions.funcall( visitor_fn, obj, $kw64$SLOT, $kw161$UNKNOWN_WORD, epe_unknown_word( obj ) );
    Functions.funcall( visitor_fn, obj, $kw64$SLOT, $kw162$SUFFIX, epe_suffix( obj ) );
    Functions.funcall( visitor_fn, obj, $kw64$SLOT, $kw163$HYPHEN, epe_hyphen( obj ) );
    Functions.funcall( visitor_fn, obj, $kw64$SLOT, $kw164$NUMBER, epe_number( obj ) );
    Functions.funcall( visitor_fn, obj, $kw64$SLOT, $kw165$CAPITALIZATION, epe_capitalization( obj ) );
    Functions.funcall( visitor_fn, obj, $kw65$END, $sym166$MAKE_EMISSION_PROBABILITY_ESTIMATOR, SEVEN_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 30815L)
  public static SubLObject visit_defstruct_object_emission_probability_estimator_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_emission_probability_estimator( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 31531L)
  public static SubLObject new_emission_probability_estimator(final SubLObject source_path)
  {
    final SubLObject open_states_path = file_utilities.cyc_home_filename( source_path, $open_states_resource$.getGlobalValue(), $str76$txt );
    final SubLObject suffixes_path = file_utilities.cyc_home_filename( source_path, $suffixes_resource$.getGlobalValue(), $str76$txt );
    final SubLObject unknown_word_path = file_utilities.cyc_home_filename( source_path, $unknown_word_resource$.getGlobalValue(), $str76$txt );
    final SubLObject suffix_path = file_utilities.cyc_home_filename( source_path, $suffix_resource$.getGlobalValue(), $str76$txt );
    final SubLObject hyphen_path = file_utilities.cyc_home_filename( source_path, $hyphen_resource$.getGlobalValue(), $str76$txt );
    final SubLObject number_path = file_utilities.cyc_home_filename( source_path, $number_resource$.getGlobalValue(), $str76$txt );
    final SubLObject capitalization_path = file_utilities.cyc_home_filename( source_path, $capitalization_resource$.getGlobalValue(), $str76$txt );
    final SubLObject estimator = make_emission_probability_estimator( UNPROVIDED );
    final SubLObject suffix_trie = strie.new_strie( Symbols.symbol_function( EQL ) );
    if( NIL != Filesys.probe_file( open_states_path ) )
    {
      SubLObject cdolist_list_var = load_list( open_states_path );
      SubLObject state = NIL;
      state = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        _csetf_epe_open_states( estimator, ConsesLow.cons( reader.parse_integer( state, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), epe_open_states( estimator ) ) );
        cdolist_list_var = cdolist_list_var.rest();
        state = cdolist_list_var.first();
      }
    }
    else
    {
      Errors.error( $str168$Unable_to_initialize_pos_tagger_p, open_states_path );
    }
    if( NIL != Filesys.probe_file( suffixes_path ) )
    {
      SubLObject cdolist_list_var = load_list( suffixes_path );
      SubLObject suffix = NIL;
      suffix = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        strie.strie_insert( suffix_trie, Sequences.reverse( suffix ), suffix );
        cdolist_list_var = cdolist_list_var.rest();
        suffix = cdolist_list_var.first();
      }
    }
    else
    {
      Errors.error( $str168$Unable_to_initialize_pos_tagger_p, suffixes_path );
    }
    _csetf_epe_suffixes( estimator, suffix_trie );
    if( NIL != Filesys.probe_file( unknown_word_path ) )
    {
      _csetf_epe_unknown_word( estimator, new_cpm( TWO_INTEGER, unknown_word_path, UNPROVIDED ) );
    }
    else
    {
      Errors.error( $str168$Unable_to_initialize_pos_tagger_p, unknown_word_path );
    }
    if( NIL != Filesys.probe_file( suffix_path ) )
    {
      _csetf_epe_suffix( estimator, new_cpm( TWO_INTEGER, suffix_path, UNPROVIDED ) );
    }
    else
    {
      Errors.error( $str168$Unable_to_initialize_pos_tagger_p, suffix_path );
    }
    if( NIL != Filesys.probe_file( hyphen_path ) )
    {
      _csetf_epe_hyphen( estimator, new_cpm( TWO_INTEGER, hyphen_path, UNPROVIDED ) );
    }
    else
    {
      Errors.error( $str168$Unable_to_initialize_pos_tagger_p, hyphen_path );
    }
    if( NIL != Filesys.probe_file( number_path ) )
    {
      _csetf_epe_number( estimator, new_cpm( TWO_INTEGER, number_path, UNPROVIDED ) );
    }
    else
    {
      Errors.error( $str168$Unable_to_initialize_pos_tagger_p, number_path );
    }
    if( NIL != Filesys.probe_file( capitalization_path ) )
    {
      _csetf_epe_capitalization( estimator, new_cpm( TWO_INTEGER, capitalization_path, UNPROVIDED ) );
    }
    else
    {
      Errors.error( $str168$Unable_to_initialize_pos_tagger_p, capitalization_path );
    }
    return estimator;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 33933L)
  public static SubLObject epe_get_distribution(final SubLObject epe, final SubLObject word)
  {
    final SubLObject suffix = suffix( epe, word );
    final SubLObject hyphen = hyphen( word );
    final SubLObject number = number( word );
    final SubLObject capitalization = capitalization( word );
    SubLObject distribution = NIL;
    SubLObject cdolist_list_var = epe_open_states( epe );
    SubLObject open_state = NIL;
    open_state = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      distribution = ConsesLow.cons( ConsesLow.cons( open_state, Numbers.add( new SubLObject[] { cpm_get( epe_unknown_word( epe ), $str169$_UNKNOWN, open_state, Symbols.symbol_function( EQL ), UNPROVIDED ), cpm_get(
          epe_suffix( epe ), suffix, open_state, Symbols.symbol_function( EQL ), UNPROVIDED ), cpm_get( epe_hyphen( epe ), hyphen, open_state, Symbols.symbol_function( EQL ), UNPROVIDED ), cpm_get( epe_capitalization(
              epe ), capitalization, open_state, Symbols.symbol_function( EQL ), UNPROVIDED ), cpm_get( epe_number( epe ), number, open_state, Symbols.symbol_function( EQL ), UNPROVIDED )
      } ) ), distribution );
      cdolist_list_var = cdolist_list_var.rest();
      open_state = cdolist_list_var.first();
    }
    return distribution;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 34771L)
  public static SubLObject suffix(final SubLObject epe, final SubLObject word)
  {
    if( NIL != string_utilities.char_position( strie.$strie_null_key$.getGlobalValue(), word, UNPROVIDED ) )
    {
      return $str170$_NOSUFF;
    }
    final SubLObject suffixes = strie.strie_prefixes( epe_suffixes( epe ), Sequences.reverse( word ) );
    return ( NIL != suffixes ) ? suffixes.first().rest().first() : $str170$_NOSUFF;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 35194L)
  public static SubLObject capitalization(final SubLObject word)
  {
    return ( NIL != Characters.upper_case_p( Strings.sublisp_char( word, ZERO_INTEGER ) ) ) ? $str171$_CAP : $str172$_NOCAP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 35404L)
  public static SubLObject hyphen(final SubLObject word)
  {
    return ( NIL != string_utilities.contains_charP( word, Characters.CHAR_hyphen ) ) ? $str173$_HYP : $str174$_NOHYP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 35578L)
  public static SubLObject number(final SubLObject word)
  {
    return ( NIL != Characters.digit_char_p( Strings.sublisp_char( word, ZERO_INTEGER ), UNPROVIDED ) ) ? $str175$_DIGIT : $str176$_NODIGIT;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 35763L)
  public static SubLObject load_list(final SubLObject source_path)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( source_path ) : source_path;
    if( NIL == Filesys.probe_file( source_path ) )
    {
      Errors.error( Sequences.cconcatenate( $str178$Unable_to_load_file__, file_utilities.why_not_probe_fileP( source_path ) ) );
    }
    SubLObject strings = NIL;
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_text( source_path, $kw19$INPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str20$Unable_to_open__S, source_path );
      }
      final SubLObject infile = stream;
      if( infile.isStream() )
      {
        SubLObject line;
        for( line = NIL, line = file_utilities.cdolines_get_next_line( infile ); NIL != line; line = file_utilities.cdolines_get_next_line( infile ) )
        {
          strings = ConsesLow.cons( line, strings );
        }
      }
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    return strings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 36277L)
  public static SubLObject get_tagger()
  {
    if( NIL == $pos_tagger$.getGlobalValue() )
    {
      $pos_tagger$.setGlobalValue( new_tagger( UNPROVIDED ) );
    }
    return $pos_tagger$.getGlobalValue();
  }

  public static SubLObject declare_pos_tagger_file()
  {
    SubLFiles.declareFunction( me, "new_cpm", "NEW-CPM", 1, 2, false );
    SubLFiles.declareFunction( me, "cpm_get_distribution", "CPM-GET-DISTRIBUTION", 2, 0, false );
    SubLFiles.declareFunction( me, "cpm_get", "CPM-GET", 3, 2, false );
    SubLFiles.declareFunction( me, "cpm_set", "CPM-SET", 4, 0, false );
    SubLFiles.declareFunction( me, "new_cpa", "NEW-CPA", 2, 2, false );
    SubLFiles.declareMacro( me, "cpa_get", "CPA-GET" );
    SubLFiles.declareFunction( me, "cpa_set", "CPA-SET", 4, 0, false );
    SubLFiles.declareFunction( me, "create_cpf", "CREATE-CPF", 2, 2, false );
    SubLFiles.declareFunction( me, "new_cpf", "NEW-CPF", 1, 1, false );
    SubLFiles.declareFunction( me, "finalize_cpf", "FINALIZE-CPF", 1, 0, false );
    SubLFiles.declareFunction( me, "cpf_get_distribution", "CPF-GET-DISTRIBUTION", 2, 0, false );
    SubLFiles.declareFunction( me, "cpf_get", "CPF-GET", 3, 2, false );
    SubLFiles.declareFunction( me, "cpf_set", "CPF-SET", 4, 0, false );
    SubLFiles.declareFunction( me, "cpf_finalize", "CPF-FINALIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "cpf_create_backing_store", "CPF-CREATE-BACKING-STORE", 3, 1, false );
    SubLFiles.declareMacro( me, "new_trellis_entry", "NEW-TRELLIS-ENTRY" );
    SubLFiles.declareMacro( me, "trellis_entry_probability", "TRELLIS-ENTRY-PROBABILITY" );
    SubLFiles.declareMacro( me, "trellis_entry_source", "TRELLIS-ENTRY-SOURCE" );
    SubLFiles.declareMacro( me, "trellis_entry_update", "TRELLIS-ENTRY-UPDATE" );
    SubLFiles.declareFunction( me, "new_trellis", "NEW-TRELLIS", 0, 0, false );
    SubLFiles.declareMacro( me, "trellis_new_column", "TRELLIS-NEW-COLUMN" );
    SubLFiles.declareMacro( me, "trellis_current_column", "TRELLIS-CURRENT-COLUMN" );
    SubLFiles.declareMacro( me, "trellis_get", "TRELLIS-GET" );
    SubLFiles.declareMacro( me, "trellis_set", "TRELLIS-SET" );
    SubLFiles.declareMacro( me, "trellis_finalize_column", "TRELLIS-FINALIZE-COLUMN" );
    SubLFiles.declareFunction( me, "trellis_get_max_entry", "TRELLIS-GET-MAX-ENTRY", 1, 0, false );
    SubLFiles.declareFunction( me, "tagger_print_function_trampoline", "TAGGER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "tagger_p", "TAGGER-P", 1, 0, false );
    new $tagger_p$UnaryFunction();
    SubLFiles.declareFunction( me, "tagger_hmm", "TAGGER-HMM", 1, 0, false );
    SubLFiles.declareFunction( me, "tagger_state_interpretation", "TAGGER-STATE-INTERPRETATION", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tagger_hmm", "_CSETF-TAGGER-HMM", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tagger_state_interpretation", "_CSETF-TAGGER-STATE-INTERPRETATION", 2, 0, false );
    SubLFiles.declareFunction( me, "make_tagger", "MAKE-TAGGER", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_tagger", "VISIT-DEFSTRUCT-TAGGER", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_tagger_method", "VISIT-DEFSTRUCT-OBJECT-TAGGER-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_tagger", "NEW-TAGGER", 0, 1, false );
    SubLFiles.declareFunction( me, "finalize_tagger", "FINALIZE-TAGGER", 1, 0, false );
    SubLFiles.declareFunction( me, "tagger_tag_document", "TAGGER-TAG-DOCUMENT", 2, 0, false );
    SubLFiles.declareFunction( me, "tagger_tag_sentence", "TAGGER-TAG-SENTENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "patch_word_tag", "PATCH-WORD-TAG", 1, 0, false );
    SubLFiles.declareFunction( me, "tagger_normalize_initial_capitalization", "TAGGER-NORMALIZE-INITIAL-CAPITALIZATION", 2, 0, false );
    SubLFiles.declareFunction( me, "exclude_from_normalizationP", "EXCLUDE-FROM-NORMALIZATION?", 1, 0, false );
    SubLFiles.declareFunction( me, "new_state_interpretation", "NEW-STATE-INTERPRETATION", 2, 0, false );
    SubLFiles.declareFunction( me, "state_interpretation_get", "STATE-INTERPRETATION-GET", 2, 0, false );
    SubLFiles.declareFunction( me, "hmm_print_function_trampoline", "HMM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "hmm_p", "HMM-P", 1, 0, false );
    new $hmm_p$UnaryFunction();
    SubLFiles.declareFunction( me, "hmm_initial_state", "HMM-INITIAL-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "hmm_states", "HMM-STATES", 1, 0, false );
    SubLFiles.declareFunction( me, "hmm_transitions", "HMM-TRANSITIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_hmm_initial_state", "_CSETF-HMM-INITIAL-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_hmm_states", "_CSETF-HMM-STATES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_hmm_transitions", "_CSETF-HMM-TRANSITIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "make_hmm", "MAKE-HMM", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_hmm", "VISIT-DEFSTRUCT-HMM", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_hmm_method", "VISIT-DEFSTRUCT-OBJECT-HMM-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_hmm", "NEW-HMM", 1, 0, false );
    SubLFiles.declareFunction( me, "finalize_hmm", "FINALIZE-HMM", 1, 0, false );
    SubLFiles.declareFunction( me, "hmm_most_likely_path_probability", "HMM-MOST-LIKELY-PATH-PROBABILITY", 2, 0, false );
    SubLFiles.declareFunction( me, "state_set_print_function_trampoline", "STATE-SET-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "state_set_p", "STATE-SET-P", 1, 0, false );
    new $state_set_p$UnaryFunction();
    SubLFiles.declareFunction( me, "state_set_store", "STATE-SET-STORE", 1, 0, false );
    SubLFiles.declareFunction( me, "state_set_estimator", "STATE-SET-ESTIMATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "state_set_cache", "STATE-SET-CACHE", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_state_set_store", "_CSETF-STATE-SET-STORE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_state_set_estimator", "_CSETF-STATE-SET-ESTIMATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_state_set_cache", "_CSETF-STATE-SET-CACHE", 2, 0, false );
    SubLFiles.declareFunction( me, "make_state_set", "MAKE-STATE-SET", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_state_set", "VISIT-DEFSTRUCT-STATE-SET", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_state_set_method", "VISIT-DEFSTRUCT-OBJECT-STATE-SET-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_state_set", "NEW-STATE-SET", 1, 1, false );
    SubLFiles.declareFunction( me, "finalize_state_set", "FINALIZE-STATE-SET", 1, 0, false );
    SubLFiles.declareFunction( me, "state_set_get_distribution", "STATE-SET-GET-DISTRIBUTION", 2, 0, false );
    SubLFiles.declareFunction( me, "state_set_known_word", "STATE-SET-KNOWN-WORD", 2, 0, false );
    SubLFiles.declareFunction( me, "transition_set_print_function_trampoline", "TRANSITION-SET-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "transition_set_p", "TRANSITION-SET-P", 1, 0, false );
    new $transition_set_p$UnaryFunction();
    SubLFiles.declareFunction( me, "transition_set_known_probabilities", "TRANSITION-SET-KNOWN-PROBABILITIES", 1, 0, false );
    SubLFiles.declareFunction( me, "transition_set_estimated_probabilities", "TRANSITION-SET-ESTIMATED-PROBABILITIES", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_transition_set_known_probabilities", "_CSETF-TRANSITION-SET-KNOWN-PROBABILITIES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_transition_set_estimated_probabilities", "_CSETF-TRANSITION-SET-ESTIMATED-PROBABILITIES", 2, 0, false );
    SubLFiles.declareFunction( me, "make_transition_set", "MAKE-TRANSITION-SET", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_transition_set", "VISIT-DEFSTRUCT-TRANSITION-SET", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_transition_set_method", "VISIT-DEFSTRUCT-OBJECT-TRANSITION-SET-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_transition_set", "NEW-TRANSITION-SET", 1, 0, false );
    SubLFiles.declareFunction( me, "transition_set_get", "TRANSITION-SET-GET", 3, 0, false );
    SubLFiles.declareFunction( me, "transition_set_get_distribution", "TRANSITION-SET-GET-DISTRIBUTION", 2, 0, false );
    SubLFiles.declareFunction( me, "transition_set_set", "TRANSITION-SET-SET", 4, 0, false );
    SubLFiles.declareFunction( me, "emission_probability_estimator_print_function_trampoline", "EMISSION-PROBABILITY-ESTIMATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "emission_probability_estimator_p", "EMISSION-PROBABILITY-ESTIMATOR-P", 1, 0, false );
    new $emission_probability_estimator_p$UnaryFunction();
    SubLFiles.declareFunction( me, "epe_open_states", "EPE-OPEN-STATES", 1, 0, false );
    SubLFiles.declareFunction( me, "epe_suffixes", "EPE-SUFFIXES", 1, 0, false );
    SubLFiles.declareFunction( me, "epe_unknown_word", "EPE-UNKNOWN-WORD", 1, 0, false );
    SubLFiles.declareFunction( me, "epe_suffix", "EPE-SUFFIX", 1, 0, false );
    SubLFiles.declareFunction( me, "epe_hyphen", "EPE-HYPHEN", 1, 0, false );
    SubLFiles.declareFunction( me, "epe_number", "EPE-NUMBER", 1, 0, false );
    SubLFiles.declareFunction( me, "epe_capitalization", "EPE-CAPITALIZATION", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_epe_open_states", "_CSETF-EPE-OPEN-STATES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_epe_suffixes", "_CSETF-EPE-SUFFIXES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_epe_unknown_word", "_CSETF-EPE-UNKNOWN-WORD", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_epe_suffix", "_CSETF-EPE-SUFFIX", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_epe_hyphen", "_CSETF-EPE-HYPHEN", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_epe_number", "_CSETF-EPE-NUMBER", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_epe_capitalization", "_CSETF-EPE-CAPITALIZATION", 2, 0, false );
    SubLFiles.declareFunction( me, "make_emission_probability_estimator", "MAKE-EMISSION-PROBABILITY-ESTIMATOR", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_emission_probability_estimator", "VISIT-DEFSTRUCT-EMISSION-PROBABILITY-ESTIMATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_emission_probability_estimator_method", "VISIT-DEFSTRUCT-OBJECT-EMISSION-PROBABILITY-ESTIMATOR-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_emission_probability_estimator", "NEW-EMISSION-PROBABILITY-ESTIMATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "epe_get_distribution", "EPE-GET-DISTRIBUTION", 2, 0, false );
    SubLFiles.declareFunction( me, "suffix", "SUFFIX", 2, 0, false );
    SubLFiles.declareFunction( me, "capitalization", "CAPITALIZATION", 1, 0, false );
    SubLFiles.declareFunction( me, "hyphen", "HYPHEN", 1, 0, false );
    SubLFiles.declareFunction( me, "number", "NUMBER", 1, 0, false );
    SubLFiles.declareFunction( me, "load_list", "LOAD-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "get_tagger", "GET-TAGGER", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_pos_tagger_file()
  {
    $tagger_data_path$ = SubLFiles.defparameter( "*TAGGER-DATA-PATH*", ConsesLow.list( $str0$data, $str1$pos_tagging ) );
    $exclude_from_normalization$ = SubLFiles.defparameter( "*EXCLUDE-FROM-NORMALIZATION*", $list2 );
    $initial_state_resource$ = SubLFiles.defconstant( "*INITIAL-STATE-RESOURCE*", $str3$initial_state );
    $state_resource$ = SubLFiles.defconstant( "*STATE-RESOURCE*", $str4$states );
    $transition_resource$ = SubLFiles.defconstant( "*TRANSITION-RESOURCE*", $str5$transitions );
    $open_states_resource$ = SubLFiles.defconstant( "*OPEN-STATES-RESOURCE*", $str6$open_states );
    $suffixes_resource$ = SubLFiles.defconstant( "*SUFFIXES-RESOURCE*", $str7$suffixes );
    $unknown_word_resource$ = SubLFiles.defconstant( "*UNKNOWN-WORD-RESOURCE*", $str8$unknown );
    $suffix_resource$ = SubLFiles.defconstant( "*SUFFIX-RESOURCE*", $str9$suffix );
    $hyphen_resource$ = SubLFiles.defconstant( "*HYPHEN-RESOURCE*", $str10$hyphen );
    $number_resource$ = SubLFiles.defconstant( "*NUMBER-RESOURCE*", $str11$number );
    $capitalization_resource$ = SubLFiles.defconstant( "*CAPITALIZATION-RESOURCE*", $str12$capitalization );
    $state_interpretation_resource$ = SubLFiles.defconstant( "*STATE-INTERPRETATION-RESOURCE*", $str13$index_to_state );
    $token_delimiters$ = SubLFiles.defconstant( "*TOKEN-DELIMITERS*", $list14 );
    $impossibility$ = SubLFiles.deflexical( "*IMPOSSIBILITY*", $float15$_3_4028232e38 );
    $certainty$ = SubLFiles.deflexical( "*CERTAINTY*", $float16$0_0 );
    $low_probability$ = SubLFiles.deflexical( "*LOW-PROBABILITY*", $int17$_20 );
    $state_set_cache_capacity$ = SubLFiles.defparameter( "*STATE-SET-CACHE-CAPACITY*", $int18$2000 );
    $pos_tagger$ = SubLFiles.deflexical( "*POS-TAGGER*", NIL );
    $dtp_tagger$ = SubLFiles.defconstant( "*DTP-TAGGER*", $sym46$TAGGER );
    $word_tag_patches$ = SubLFiles.defparameter( "*WORD-TAG-PATCHES*", $list73 );
    $dtp_hmm$ = SubLFiles.defconstant( "*DTP-HMM*", $sym78$HMM );
    $dtp_state_set$ = SubLFiles.defconstant( "*DTP-STATE-SET*", $sym98$STATE_SET );
    $dtp_transition_set$ = SubLFiles.defconstant( "*DTP-TRANSITION-SET*", $sym119$TRANSITION_SET );
    $dtp_emission_probability_estimator$ = SubLFiles.defconstant( "*DTP-EMISSION-PROBABILITY-ESTIMATOR*", $sym137$EMISSION_PROBABILITY_ESTIMATOR );
    return NIL;
  }

  public static SubLObject setup_pos_tagger_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_tagger$.getGlobalValue(), Symbols.symbol_function( $sym53$TAGGER_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list54 );
    Structures.def_csetf( $sym55$TAGGER_HMM, $sym56$_CSETF_TAGGER_HMM );
    Structures.def_csetf( $sym57$TAGGER_STATE_INTERPRETATION, $sym58$_CSETF_TAGGER_STATE_INTERPRETATION );
    Equality.identity( $sym46$TAGGER );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_tagger$.getGlobalValue(), Symbols.symbol_function( $sym66$VISIT_DEFSTRUCT_OBJECT_TAGGER_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_hmm$.getGlobalValue(), Symbols.symbol_function( $sym84$HMM_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list85 );
    Structures.def_csetf( $sym86$HMM_INITIAL_STATE, $sym87$_CSETF_HMM_INITIAL_STATE );
    Structures.def_csetf( $sym88$HMM_STATES, $sym89$_CSETF_HMM_STATES );
    Structures.def_csetf( $sym90$HMM_TRANSITIONS, $sym91$_CSETF_HMM_TRANSITIONS );
    Equality.identity( $sym78$HMM );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_hmm$.getGlobalValue(), Symbols.symbol_function( $sym96$VISIT_DEFSTRUCT_OBJECT_HMM_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_state_set$.getGlobalValue(), Symbols.symbol_function( $sym104$STATE_SET_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list105 );
    Structures.def_csetf( $sym106$STATE_SET_STORE, $sym107$_CSETF_STATE_SET_STORE );
    Structures.def_csetf( $sym108$STATE_SET_ESTIMATOR, $sym109$_CSETF_STATE_SET_ESTIMATOR );
    Structures.def_csetf( $sym110$STATE_SET_CACHE, $sym111$_CSETF_STATE_SET_CACHE );
    Equality.identity( $sym98$STATE_SET );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_state_set$.getGlobalValue(), Symbols.symbol_function( $sym116$VISIT_DEFSTRUCT_OBJECT_STATE_SET_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_transition_set$.getGlobalValue(), Symbols.symbol_function( $sym125$TRANSITION_SET_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list126 );
    Structures.def_csetf( $sym127$TRANSITION_SET_KNOWN_PROBABILITIES, $sym128$_CSETF_TRANSITION_SET_KNOWN_PROBABILITIES );
    Structures.def_csetf( $sym129$TRANSITION_SET_ESTIMATED_PROBABILITIES, $sym130$_CSETF_TRANSITION_SET_ESTIMATED_PROBABILITIES );
    Equality.identity( $sym119$TRANSITION_SET );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_transition_set$.getGlobalValue(), Symbols.symbol_function( $sym134$VISIT_DEFSTRUCT_OBJECT_TRANSITION_SET_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_emission_probability_estimator$.getGlobalValue(), Symbols.symbol_function(
        $sym143$EMISSION_PROBABILITY_ESTIMATOR_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list144 );
    Structures.def_csetf( $sym145$EPE_OPEN_STATES, $sym146$_CSETF_EPE_OPEN_STATES );
    Structures.def_csetf( $sym147$EPE_SUFFIXES, $sym148$_CSETF_EPE_SUFFIXES );
    Structures.def_csetf( $sym149$EPE_UNKNOWN_WORD, $sym150$_CSETF_EPE_UNKNOWN_WORD );
    Structures.def_csetf( $sym151$EPE_SUFFIX, $sym152$_CSETF_EPE_SUFFIX );
    Structures.def_csetf( $sym153$EPE_HYPHEN, $sym154$_CSETF_EPE_HYPHEN );
    Structures.def_csetf( $sym155$EPE_NUMBER, $sym156$_CSETF_EPE_NUMBER );
    Structures.def_csetf( $sym157$EPE_CAPITALIZATION, $sym158$_CSETF_EPE_CAPITALIZATION );
    Equality.identity( $sym137$EMISSION_PROBABILITY_ESTIMATOR );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_emission_probability_estimator$.getGlobalValue(), Symbols.symbol_function(
        $sym167$VISIT_DEFSTRUCT_OBJECT_EMISSION_PROBABILITY_ESTIMATOR_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_pos_tagger_file();
  }

  @Override
  public void initializeVariables()
  {
    init_pos_tagger_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_pos_tagger_file();
  }
  static
  {
    me = new pos_tagger();
    $tagger_data_path$ = null;
    $exclude_from_normalization$ = null;
    $initial_state_resource$ = null;
    $state_resource$ = null;
    $transition_resource$ = null;
    $open_states_resource$ = null;
    $suffixes_resource$ = null;
    $unknown_word_resource$ = null;
    $suffix_resource$ = null;
    $hyphen_resource$ = null;
    $number_resource$ = null;
    $capitalization_resource$ = null;
    $state_interpretation_resource$ = null;
    $token_delimiters$ = null;
    $impossibility$ = null;
    $certainty$ = null;
    $low_probability$ = null;
    $state_set_cache_capacity$ = null;
    $pos_tagger$ = null;
    $dtp_tagger$ = null;
    $word_tag_patches$ = null;
    $dtp_hmm$ = null;
    $dtp_state_set$ = null;
    $dtp_transition_set$ = null;
    $dtp_emission_probability_estimator$ = null;
    $str0$data = makeString( "data" );
    $str1$pos_tagging = makeString( "pos-tagging" );
    $list2 = ConsesLow.list( makeString( "WWII" ) );
    $str3$initial_state = makeString( "initial-state" );
    $str4$states = makeString( "states" );
    $str5$transitions = makeString( "transitions" );
    $str6$open_states = makeString( "open-states" );
    $str7$suffixes = makeString( "suffixes" );
    $str8$unknown = makeString( "unknown" );
    $str9$suffix = makeString( "suffix" );
    $str10$hyphen = makeString( "hyphen" );
    $str11$number = makeString( "number" );
    $str12$capitalization = makeString( "capitalization" );
    $str13$index_to_state = makeString( "index-to-state" );
    $list14 = ConsesLow.list( Characters.CHAR_caret );
    $float15$_3_4028232e38 = makeDouble( -3.4028232E38 );
    $float16$0_0 = makeDouble( 0.0 );
    $int17$_20 = makeInteger( -20 );
    $int18$2000 = makeInteger( 2000 );
    $kw19$INPUT = makeKeyword( "INPUT" );
    $str20$Unable_to_open__S = makeString( "Unable to open ~S" );
    $list21 = ConsesLow.list( makeSymbol( "CONDITIONED" ), makeSymbol( "CONDITIONING" ), makeSymbol( "PROBABILITY" ) );
    $list22 = ConsesLow.list( makeSymbol( "CPA" ), makeSymbol( "CONDITIONED" ), makeSymbol( "CONDITIONING" ) );
    $sym23$AREF = makeSymbol( "AREF" );
    $int24$256 = makeInteger( 256 );
    $kw25$IMAGE_INDEPENDENT_CFASL = makeKeyword( "IMAGE-INDEPENDENT-CFASL" );
    $str26$Unable_to_initialize_file_hashtab = makeString( "Unable to initialize file hashtable. " );
    $str27$Building_conditional_probability_ = makeString( "Building conditional probability file..." );
    $list28 = ConsesLow.list( makeSymbol( "PROBABILITY" ), makeSymbol( "SOURCE" ) );
    $sym29$CONS = makeSymbol( "CONS" );
    $list30 = ConsesLow.list( makeSymbol( "ENTRY" ) );
    $sym31$CAR = makeSymbol( "CAR" );
    $sym32$CDR = makeSymbol( "CDR" );
    $list33 = ConsesLow.list( makeSymbol( "ENTRY" ), makeSymbol( "PROBABILITY" ), makeSymbol( "SOURCE" ) );
    $sym34$PROGN = makeSymbol( "PROGN" );
    $sym35$CSETF = makeSymbol( "CSETF" );
    $list36 = ConsesLow.list( makeSymbol( "TRELLIS" ) );
    $sym37$CPUSH = makeSymbol( "CPUSH" );
    $list38 = ConsesLow.list( makeSymbol( "TRELLIS" ), makeSymbol( "KEY" ) );
    $sym39$ASSOC = makeSymbol( "ASSOC" );
    $sym40$TRELLIS_CURRENT_COLUMN = makeSymbol( "TRELLIS-CURRENT-COLUMN" );
    $list41 = ConsesLow.list( ConsesLow.list( makeSymbol( "FUNCTION" ), EQL ) );
    $list42 = ConsesLow.list( makeSymbol( "TRELLIS" ), makeSymbol( "KEY" ), makeSymbol( "VALUE" ) );
    $sym43$RPLACA = makeSymbol( "RPLACA" );
    $sym44$ACONS = makeSymbol( "ACONS" );
    $sym45$CPOP = makeSymbol( "CPOP" );
    $sym46$TAGGER = makeSymbol( "TAGGER" );
    $sym47$TAGGER_P = makeSymbol( "TAGGER-P" );
    $list48 = ConsesLow.list( makeSymbol( "HMM" ), makeSymbol( "STATE-INTERPRETATION" ) );
    $list49 = ConsesLow.list( makeKeyword( "HMM" ), makeKeyword( "STATE-INTERPRETATION" ) );
    $list50 = ConsesLow.list( makeSymbol( "TAGGER-HMM" ), makeSymbol( "TAGGER-STATE-INTERPRETATION" ) );
    $list51 = ConsesLow.list( makeSymbol( "_CSETF-TAGGER-HMM" ), makeSymbol( "_CSETF-TAGGER-STATE-INTERPRETATION" ) );
    $sym52$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $sym53$TAGGER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "TAGGER-PRINT-FUNCTION-TRAMPOLINE" );
    $list54 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "TAGGER-P" ) );
    $sym55$TAGGER_HMM = makeSymbol( "TAGGER-HMM" );
    $sym56$_CSETF_TAGGER_HMM = makeSymbol( "_CSETF-TAGGER-HMM" );
    $sym57$TAGGER_STATE_INTERPRETATION = makeSymbol( "TAGGER-STATE-INTERPRETATION" );
    $sym58$_CSETF_TAGGER_STATE_INTERPRETATION = makeSymbol( "_CSETF-TAGGER-STATE-INTERPRETATION" );
    $kw59$HMM = makeKeyword( "HMM" );
    $kw60$STATE_INTERPRETATION = makeKeyword( "STATE-INTERPRETATION" );
    $str61$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw62$BEGIN = makeKeyword( "BEGIN" );
    $sym63$MAKE_TAGGER = makeSymbol( "MAKE-TAGGER" );
    $kw64$SLOT = makeKeyword( "SLOT" );
    $kw65$END = makeKeyword( "END" );
    $sym66$VISIT_DEFSTRUCT_OBJECT_TAGGER_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-TAGGER-METHOD" );
    $sym67$LISTP = makeSymbol( "LISTP" );
    $int68$50 = makeInteger( 50 );
    $sym69$DOCUMENT_P = makeSymbol( "DOCUMENT-P" );
    $sym70$SENTENCE_P = makeSymbol( "SENTENCE-P" );
    $kw71$STRING = makeKeyword( "STRING" );
    $kw72$CATEGORY = makeKeyword( "CATEGORY" );
    $list73 = ConsesLow.list( ConsesLow.cons( ConsesLow.cons( makeString( "German" ), EIGHTEEN_INTEGER ), FIVE_INTEGER ), ConsesLow.cons( ConsesLow.cons( makeString( "Germans" ), makeInteger( 38 ) ), makeInteger( 25 ) ),
        ConsesLow.cons( ConsesLow.cons( makeString( "French" ), EIGHTEEN_INTEGER ), FIVE_INTEGER ), ConsesLow.cons( ConsesLow.cons( makeString( "French" ), makeInteger( 38 ) ), makeInteger( 25 ) ) );
    $sym74$VECTORP = makeSymbol( "VECTORP" );
    $list75 = ConsesLow.list( makeKeyword( "STRING" ), makeString( "." ) );
    $str76$txt = makeString( "txt" );
    $str77$Unable_to_initialize_pos_tagger_s = makeString( "Unable to initialize pos tagger state interpretation from ~a" );
    $sym78$HMM = makeSymbol( "HMM" );
    $sym79$HMM_P = makeSymbol( "HMM-P" );
    $list80 = ConsesLow.list( makeSymbol( "INITIAL-STATE" ), makeSymbol( "STATES" ), makeSymbol( "TRANSITIONS" ) );
    $list81 = ConsesLow.list( makeKeyword( "INITIAL-STATE" ), makeKeyword( "STATES" ), makeKeyword( "TRANSITIONS" ) );
    $list82 = ConsesLow.list( makeSymbol( "HMM-INITIAL-STATE" ), makeSymbol( "HMM-STATES" ), makeSymbol( "HMM-TRANSITIONS" ) );
    $list83 = ConsesLow.list( makeSymbol( "_CSETF-HMM-INITIAL-STATE" ), makeSymbol( "_CSETF-HMM-STATES" ), makeSymbol( "_CSETF-HMM-TRANSITIONS" ) );
    $sym84$HMM_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "HMM-PRINT-FUNCTION-TRAMPOLINE" );
    $list85 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "HMM-P" ) );
    $sym86$HMM_INITIAL_STATE = makeSymbol( "HMM-INITIAL-STATE" );
    $sym87$_CSETF_HMM_INITIAL_STATE = makeSymbol( "_CSETF-HMM-INITIAL-STATE" );
    $sym88$HMM_STATES = makeSymbol( "HMM-STATES" );
    $sym89$_CSETF_HMM_STATES = makeSymbol( "_CSETF-HMM-STATES" );
    $sym90$HMM_TRANSITIONS = makeSymbol( "HMM-TRANSITIONS" );
    $sym91$_CSETF_HMM_TRANSITIONS = makeSymbol( "_CSETF-HMM-TRANSITIONS" );
    $kw92$INITIAL_STATE = makeKeyword( "INITIAL-STATE" );
    $kw93$STATES = makeKeyword( "STATES" );
    $kw94$TRANSITIONS = makeKeyword( "TRANSITIONS" );
    $sym95$MAKE_HMM = makeSymbol( "MAKE-HMM" );
    $sym96$VISIT_DEFSTRUCT_OBJECT_HMM_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-HMM-METHOD" );
    $str97$Unable_to_initialize_pos_tagger_H = makeString( "Unable to initialize pos tagger HMM initial state from ~a" );
    $sym98$STATE_SET = makeSymbol( "STATE-SET" );
    $sym99$STATE_SET_P = makeSymbol( "STATE-SET-P" );
    $list100 = ConsesLow.list( makeSymbol( "STORE" ), makeSymbol( "ESTIMATOR" ), makeSymbol( "CACHE" ) );
    $list101 = ConsesLow.list( makeKeyword( "STORE" ), makeKeyword( "ESTIMATOR" ), makeKeyword( "CACHE" ) );
    $list102 = ConsesLow.list( makeSymbol( "STATE-SET-STORE" ), makeSymbol( "STATE-SET-ESTIMATOR" ), makeSymbol( "STATE-SET-CACHE" ) );
    $list103 = ConsesLow.list( makeSymbol( "_CSETF-STATE-SET-STORE" ), makeSymbol( "_CSETF-STATE-SET-ESTIMATOR" ), makeSymbol( "_CSETF-STATE-SET-CACHE" ) );
    $sym104$STATE_SET_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "STATE-SET-PRINT-FUNCTION-TRAMPOLINE" );
    $list105 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "STATE-SET-P" ) );
    $sym106$STATE_SET_STORE = makeSymbol( "STATE-SET-STORE" );
    $sym107$_CSETF_STATE_SET_STORE = makeSymbol( "_CSETF-STATE-SET-STORE" );
    $sym108$STATE_SET_ESTIMATOR = makeSymbol( "STATE-SET-ESTIMATOR" );
    $sym109$_CSETF_STATE_SET_ESTIMATOR = makeSymbol( "_CSETF-STATE-SET-ESTIMATOR" );
    $sym110$STATE_SET_CACHE = makeSymbol( "STATE-SET-CACHE" );
    $sym111$_CSETF_STATE_SET_CACHE = makeSymbol( "_CSETF-STATE-SET-CACHE" );
    $kw112$STORE = makeKeyword( "STORE" );
    $kw113$ESTIMATOR = makeKeyword( "ESTIMATOR" );
    $kw114$CACHE = makeKeyword( "CACHE" );
    $sym115$MAKE_STATE_SET = makeSymbol( "MAKE-STATE-SET" );
    $sym116$VISIT_DEFSTRUCT_OBJECT_STATE_SET_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-STATE-SET-METHOD" );
    $str117$fht = makeString( "fht" );
    $str118$Unable_to_initialize_pos_tagger_s = makeString( "Unable to initialize pos tagger state set from ~a" );
    $sym119$TRANSITION_SET = makeSymbol( "TRANSITION-SET" );
    $sym120$TRANSITION_SET_P = makeSymbol( "TRANSITION-SET-P" );
    $list121 = ConsesLow.list( makeSymbol( "KNOWN-PROBABILITIES" ), makeSymbol( "ESTIMATED-PROBABILITIES" ) );
    $list122 = ConsesLow.list( makeKeyword( "KNOWN-PROBABILITIES" ), makeKeyword( "ESTIMATED-PROBABILITIES" ) );
    $list123 = ConsesLow.list( makeSymbol( "TRANSITION-SET-KNOWN-PROBABILITIES" ), makeSymbol( "TRANSITION-SET-ESTIMATED-PROBABILITIES" ) );
    $list124 = ConsesLow.list( makeSymbol( "_CSETF-TRANSITION-SET-KNOWN-PROBABILITIES" ), makeSymbol( "_CSETF-TRANSITION-SET-ESTIMATED-PROBABILITIES" ) );
    $sym125$TRANSITION_SET_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "TRANSITION-SET-PRINT-FUNCTION-TRAMPOLINE" );
    $list126 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "TRANSITION-SET-P" ) );
    $sym127$TRANSITION_SET_KNOWN_PROBABILITIES = makeSymbol( "TRANSITION-SET-KNOWN-PROBABILITIES" );
    $sym128$_CSETF_TRANSITION_SET_KNOWN_PROBABILITIES = makeSymbol( "_CSETF-TRANSITION-SET-KNOWN-PROBABILITIES" );
    $sym129$TRANSITION_SET_ESTIMATED_PROBABILITIES = makeSymbol( "TRANSITION-SET-ESTIMATED-PROBABILITIES" );
    $sym130$_CSETF_TRANSITION_SET_ESTIMATED_PROBABILITIES = makeSymbol( "_CSETF-TRANSITION-SET-ESTIMATED-PROBABILITIES" );
    $kw131$KNOWN_PROBABILITIES = makeKeyword( "KNOWN-PROBABILITIES" );
    $kw132$ESTIMATED_PROBABILITIES = makeKeyword( "ESTIMATED-PROBABILITIES" );
    $sym133$MAKE_TRANSITION_SET = makeSymbol( "MAKE-TRANSITION-SET" );
    $sym134$VISIT_DEFSTRUCT_OBJECT_TRANSITION_SET_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-TRANSITION-SET-METHOD" );
    $sym135$READ_FROM_STRING = makeSymbol( "READ-FROM-STRING" );
    $str136$Unable_to_initialize_pos_tagger_H = makeString( "Unable to initialize pos tagger HMM transition set from ~a" );
    $sym137$EMISSION_PROBABILITY_ESTIMATOR = makeSymbol( "EMISSION-PROBABILITY-ESTIMATOR" );
    $sym138$EMISSION_PROBABILITY_ESTIMATOR_P = makeSymbol( "EMISSION-PROBABILITY-ESTIMATOR-P" );
    $list139 = ConsesLow.list( makeSymbol( "OPEN-STATES" ), makeSymbol( "SUFFIXES" ), makeSymbol( "UNKNOWN-WORD" ), makeSymbol( "SUFFIX" ), makeSymbol( "HYPHEN" ), makeSymbol( "NUMBER" ), makeSymbol(
        "CAPITALIZATION" ) );
    $list140 = ConsesLow.list( makeKeyword( "OPEN-STATES" ), makeKeyword( "SUFFIXES" ), makeKeyword( "UNKNOWN-WORD" ), makeKeyword( "SUFFIX" ), makeKeyword( "HYPHEN" ), makeKeyword( "NUMBER" ), makeKeyword(
        "CAPITALIZATION" ) );
    $list141 = ConsesLow.list( makeSymbol( "EPE-OPEN-STATES" ), makeSymbol( "EPE-SUFFIXES" ), makeSymbol( "EPE-UNKNOWN-WORD" ), makeSymbol( "EPE-SUFFIX" ), makeSymbol( "EPE-HYPHEN" ), makeSymbol( "EPE-NUMBER" ),
        makeSymbol( "EPE-CAPITALIZATION" ) );
    $list142 = ConsesLow.list( makeSymbol( "_CSETF-EPE-OPEN-STATES" ), makeSymbol( "_CSETF-EPE-SUFFIXES" ), makeSymbol( "_CSETF-EPE-UNKNOWN-WORD" ), makeSymbol( "_CSETF-EPE-SUFFIX" ), makeSymbol( "_CSETF-EPE-HYPHEN" ),
        makeSymbol( "_CSETF-EPE-NUMBER" ), makeSymbol( "_CSETF-EPE-CAPITALIZATION" ) );
    $sym143$EMISSION_PROBABILITY_ESTIMATOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "EMISSION-PROBABILITY-ESTIMATOR-PRINT-FUNCTION-TRAMPOLINE" );
    $list144 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "EMISSION-PROBABILITY-ESTIMATOR-P" ) );
    $sym145$EPE_OPEN_STATES = makeSymbol( "EPE-OPEN-STATES" );
    $sym146$_CSETF_EPE_OPEN_STATES = makeSymbol( "_CSETF-EPE-OPEN-STATES" );
    $sym147$EPE_SUFFIXES = makeSymbol( "EPE-SUFFIXES" );
    $sym148$_CSETF_EPE_SUFFIXES = makeSymbol( "_CSETF-EPE-SUFFIXES" );
    $sym149$EPE_UNKNOWN_WORD = makeSymbol( "EPE-UNKNOWN-WORD" );
    $sym150$_CSETF_EPE_UNKNOWN_WORD = makeSymbol( "_CSETF-EPE-UNKNOWN-WORD" );
    $sym151$EPE_SUFFIX = makeSymbol( "EPE-SUFFIX" );
    $sym152$_CSETF_EPE_SUFFIX = makeSymbol( "_CSETF-EPE-SUFFIX" );
    $sym153$EPE_HYPHEN = makeSymbol( "EPE-HYPHEN" );
    $sym154$_CSETF_EPE_HYPHEN = makeSymbol( "_CSETF-EPE-HYPHEN" );
    $sym155$EPE_NUMBER = makeSymbol( "EPE-NUMBER" );
    $sym156$_CSETF_EPE_NUMBER = makeSymbol( "_CSETF-EPE-NUMBER" );
    $sym157$EPE_CAPITALIZATION = makeSymbol( "EPE-CAPITALIZATION" );
    $sym158$_CSETF_EPE_CAPITALIZATION = makeSymbol( "_CSETF-EPE-CAPITALIZATION" );
    $kw159$OPEN_STATES = makeKeyword( "OPEN-STATES" );
    $kw160$SUFFIXES = makeKeyword( "SUFFIXES" );
    $kw161$UNKNOWN_WORD = makeKeyword( "UNKNOWN-WORD" );
    $kw162$SUFFIX = makeKeyword( "SUFFIX" );
    $kw163$HYPHEN = makeKeyword( "HYPHEN" );
    $kw164$NUMBER = makeKeyword( "NUMBER" );
    $kw165$CAPITALIZATION = makeKeyword( "CAPITALIZATION" );
    $sym166$MAKE_EMISSION_PROBABILITY_ESTIMATOR = makeSymbol( "MAKE-EMISSION-PROBABILITY-ESTIMATOR" );
    $sym167$VISIT_DEFSTRUCT_OBJECT_EMISSION_PROBABILITY_ESTIMATOR_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-EMISSION-PROBABILITY-ESTIMATOR-METHOD" );
    $str168$Unable_to_initialize_pos_tagger_p = makeString( "Unable to initialize pos tagger pos estimator from ~a" );
    $str169$_UNKNOWN = makeString( ":UNKNOWN" );
    $str170$_NOSUFF = makeString( ":NOSUFF" );
    $str171$_CAP = makeString( ":CAP" );
    $str172$_NOCAP = makeString( ":NOCAP" );
    $str173$_HYP = makeString( ":HYP" );
    $str174$_NOHYP = makeString( ":NOHYP" );
    $str175$_DIGIT = makeString( ":DIGIT" );
    $str176$_NODIGIT = makeString( ":NODIGIT" );
    $sym177$STRINGP = makeSymbol( "STRINGP" );
    $str178$Unable_to_load_file__ = makeString( "Unable to load file. " );
  }

  public static final class $tagger_native
      extends
        SubLStructNative
  {
    public SubLObject $hmm;
    public SubLObject $state_interpretation;
    private static final SubLStructDeclNative structDecl;

    public $tagger_native()
    {
      this.$hmm = CommonSymbols.NIL;
      this.$state_interpretation = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $tagger_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$hmm;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$state_interpretation;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$hmm = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$state_interpretation = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $tagger_native.class, $sym46$TAGGER, $sym47$TAGGER_P, $list48, $list49, new String[] { "$hmm", "$state_interpretation"
      }, $list50, $list51, $sym52$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $tagger_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $tagger_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "TAGGER-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return tagger_p( arg1 );
    }
  }

  public static final class $hmm_native
      extends
        SubLStructNative
  {
    public SubLObject $initial_state;
    public SubLObject $states;
    public SubLObject $transitions;
    private static final SubLStructDeclNative structDecl;

    public $hmm_native()
    {
      this.$initial_state = CommonSymbols.NIL;
      this.$states = CommonSymbols.NIL;
      this.$transitions = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $hmm_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$initial_state;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$states;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$transitions;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$initial_state = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$states = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$transitions = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $hmm_native.class, $sym78$HMM, $sym79$HMM_P, $list80, $list81, new String[] { "$initial_state", "$states", "$transitions"
      }, $list82, $list83, $sym52$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $hmm_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $hmm_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "HMM-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return hmm_p( arg1 );
    }
  }

  public static final class $state_set_native
      extends
        SubLStructNative
  {
    public SubLObject $store;
    public SubLObject $estimator;
    public SubLObject $cache;
    private static final SubLStructDeclNative structDecl;

    public $state_set_native()
    {
      this.$store = CommonSymbols.NIL;
      this.$estimator = CommonSymbols.NIL;
      this.$cache = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $state_set_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$store;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$estimator;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$cache;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$store = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$estimator = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$cache = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $state_set_native.class, $sym98$STATE_SET, $sym99$STATE_SET_P, $list100, $list101, new String[] { "$store", "$estimator", "$cache"
      }, $list102, $list103, $sym52$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $state_set_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $state_set_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "STATE-SET-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return state_set_p( arg1 );
    }
  }

  public static final class $transition_set_native
      extends
        SubLStructNative
  {
    public SubLObject $known_probabilities;
    public SubLObject $estimated_probabilities;
    private static final SubLStructDeclNative structDecl;

    public $transition_set_native()
    {
      this.$known_probabilities = CommonSymbols.NIL;
      this.$estimated_probabilities = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $transition_set_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$known_probabilities;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$estimated_probabilities;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$known_probabilities = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$estimated_probabilities = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $transition_set_native.class, $sym119$TRANSITION_SET, $sym120$TRANSITION_SET_P, $list121, $list122, new String[] { "$known_probabilities", "$estimated_probabilities"
      }, $list123, $list124, $sym52$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $transition_set_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $transition_set_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "TRANSITION-SET-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return transition_set_p( arg1 );
    }
  }

  public static final class $emission_probability_estimator_native
      extends
        SubLStructNative
  {
    public SubLObject $open_states;
    public SubLObject $suffixes;
    public SubLObject $unknown_word;
    public SubLObject $suffix;
    public SubLObject $hyphen;
    public SubLObject $number;
    public SubLObject $capitalization;
    private static final SubLStructDeclNative structDecl;

    public $emission_probability_estimator_native()
    {
      this.$open_states = CommonSymbols.NIL;
      this.$suffixes = CommonSymbols.NIL;
      this.$unknown_word = CommonSymbols.NIL;
      this.$suffix = CommonSymbols.NIL;
      this.$hyphen = CommonSymbols.NIL;
      this.$number = CommonSymbols.NIL;
      this.$capitalization = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $emission_probability_estimator_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$open_states;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$suffixes;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$unknown_word;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$suffix;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$hyphen;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$number;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$capitalization;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$open_states = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$suffixes = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$unknown_word = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$suffix = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$hyphen = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$number = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$capitalization = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $emission_probability_estimator_native.class, $sym137$EMISSION_PROBABILITY_ESTIMATOR, $sym138$EMISSION_PROBABILITY_ESTIMATOR_P, $list139, $list140, new String[] {
        "$open_states", "$suffixes", "$unknown_word", "$suffix", "$hyphen", "$number", "$capitalization"
      }, $list141, $list142, $sym52$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $emission_probability_estimator_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $emission_probability_estimator_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "EMISSION-PROBABILITY-ESTIMATOR-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return emission_probability_estimator_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 636 ms
 * 
 */