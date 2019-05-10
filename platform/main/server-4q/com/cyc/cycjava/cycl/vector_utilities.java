package com.cyc.cycjava.cycl;

import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.bytes;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class vector_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.vector_utilities";
  public static final String myFingerPrint = "c7ff162ca119e0df0c49244291f78e9a3c02a92695b428731e0de2c94bdfa846";
  private static final SubLSymbol $sym0$VECTORP;
  private static final SubLSymbol $sym1$INTEGERP;
  private static final SubLSymbol $sym2$PROPER_LIST_P;
  private static final SubLSymbol $sym3$VECTOR;
  private static final SubLSymbol $sym4$CLEAR_VECTOR;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$TRUE;
  private static final SubLSymbol $sym7$SEQUENCEP;
  private static final SubLSymbol $sym8$POSITIVE_INTEGER_P;
  private static final SubLInteger $int9$500;
  private static final SubLSymbol $sym10$NON_NEGATIVE_INTEGER_P;
  private static final SubLInteger $int11$100000;
  private static final SubLSymbol $sym12$STRINGP;
  private static final SubLSymbol $kw13$INPUT;
  private static final SubLString $str14$Unable_to_open__S;
  private static final SubLSymbol $sym15$BYTE_VECTOR_P;
  private static final SubLInteger $int16$32;
  private static final SubLString $str17$Did_not_fill_up_all_the_expected_;
  private static final SubLSymbol $sym18$HEX_CHAR_STRING_P;
  private static final SubLSymbol $sym19$EVENP;
  private static final SubLSymbol $sym20$64_BIT_STRING_P;
  private static final SubLSymbol $sym21$64_BIT_STRING_TUPLES_LENGTH;
  private static final SubLSymbol $kw22$TEST;
  private static final SubLSymbol $kw23$OWNER;
  private static final SubLSymbol $kw24$CLASSES;
  private static final SubLSymbol $kw25$KB;
  private static final SubLSymbol $kw26$TINY;
  private static final SubLSymbol $kw27$WORKING_;
  private static final SubLList $list28;
  private static final SubLSymbol $sym29$64_BIT_STRING_BYTE_VECTOR_LENGTH;
  private static final SubLList $list30;
  private static final SubLSymbol $sym31$TEST_BINARY_SEARCH_VECTOR_SUBRANGE_W_DUPLICATES;
  private static final SubLList $list32;
  private static final SubLSymbol $sym33$TEST_BINARY_SEARCH_VECTOR_SUBRANGE_W_DUPLICATE_STRUCTURES;
  private static final SubLList $list34;
  private static final SubLString $str35$Failure_on__S__S__S;
  private static final SubLString $str36$Failure_on__S__S__S__S;
  private static final SubLString $str37$cdotimes;
  private static final SubLInteger $int38$256;

  @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 777L)
  public static SubLObject vector_elements(final SubLObject vector, SubLObject start_index)
  {
    if( start_index == UNPROVIDED )
    {
      start_index = ZERO_INTEGER;
    }
    assert NIL != Types.vectorp( vector ) : vector;
    assert NIL != Types.integerp( start_index ) : start_index;
    final SubLObject length = Numbers.subtract( Sequences.length( vector ), start_index );
    final SubLObject list = ConsesLow.make_list( length, UNPROVIDED );
    SubLObject index = start_index;
    SubLObject rest;
    for( rest = NIL, rest = list; NIL != rest; rest = rest.rest() )
    {
      ConsesLow.rplaca( rest, Vectors.aref( vector, index ) );
      index = Numbers.add( index, ONE_INTEGER );
    }
    return list;
  }

  @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 1176L)
  public static SubLObject list_to_vector(final SubLObject proper_list)
  {
    assert NIL != list_utilities.proper_list_p( proper_list ) : proper_list;
    return Functions.apply( Symbols.symbol_function( $sym3$VECTOR ), proper_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 1346L)
  public static SubLObject copy_vector(final SubLObject vector)
  {
    assert NIL != Types.vectorp( vector ) : vector;
    return Sequences.copy_seq( vector );
  }

  @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 1433L)
  public static SubLObject first_aref(final SubLObject vector)
  {
    return Vectors.aref( vector, ZERO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 1494L)
  public static SubLObject last_aref(final SubLObject vector)
  {
    return Vectors.aref( vector, Numbers.subtract( Sequences.length( vector ), ONE_INTEGER ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 1574L)
  public static SubLObject num_vector(final SubLObject length)
  {
    final SubLObject vec = Vectors.make_vector( length, UNPROVIDED );
    SubLObject i;
    for( i = NIL, i = ZERO_INTEGER; i.numL( length ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      Vectors.set_aref( vec, i, i );
    }
    return vec;
  }

  @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 1795L)
  public static SubLObject extend_vector(final SubLObject vector, final SubLObject delta, SubLObject initial_value)
  {
    if( initial_value == UNPROVIDED )
    {
      initial_value = NIL;
    }
    final SubLObject old_length = Sequences.length( vector );
    final SubLObject new_vector = Vectors.make_vector( Numbers.add( old_length, delta ), initial_value );
    Sequences.replace( new_vector, vector, ZERO_INTEGER, old_length, ZERO_INTEGER, old_length );
    return new_vector;
  }

  @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 2151L)
  public static SubLObject extend_vector_to(final SubLObject vector, final SubLObject new_length, SubLObject initial_value)
  {
    if( initial_value == UNPROVIDED )
    {
      initial_value = NIL;
    }
    final SubLObject old_length = Sequences.length( vector );
    final SubLObject new_vector = Vectors.make_vector( new_length, initial_value );
    Sequences.replace( new_vector, vector, ZERO_INTEGER, old_length, ZERO_INTEGER, old_length );
    return new_vector;
  }

  @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 2527L)
  public static SubLObject grow_vector(final SubLObject vector, SubLObject initial_value, SubLObject multiple)
  {
    if( initial_value == UNPROVIDED )
    {
      initial_value = NIL;
    }
    if( multiple == UNPROVIDED )
    {
      multiple = TWO_INTEGER;
    }
    assert NIL != Types.vectorp( vector ) : vector;
    final SubLObject old_length = Sequences.length( vector );
    final SubLObject new_vector = Vectors.make_vector( Numbers.multiply( old_length, multiple ), initial_value );
    Sequences.replace( new_vector, vector, ZERO_INTEGER, old_length, ZERO_INTEGER, old_length );
    return new_vector;
  }

  @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 2922L)
  public static SubLObject reset_vector(final SubLObject vector, SubLObject element)
  {
    if( element == UNPROVIDED )
    {
      element = NIL;
    }
    return Sequences.fill( vector, element, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 3042L)
  public static SubLObject clear_vector(final SubLObject vector, SubLObject fill_obj)
  {
    if( fill_obj == UNPROVIDED )
    {
      fill_obj = NIL;
    }
    SubLObject len;
    SubLObject i;
    for( len = Sequences.length( vector ), i = NIL, i = ZERO_INTEGER; i.numL( len ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      Vectors.set_aref( vector, i, fill_obj );
    }
    return vector;
  }

  @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 3243L)
  public static SubLObject percolate_vector(final SubLObject vector, final SubLObject item)
  {
    SubLObject back = item;
    SubLObject temp = NIL;
    SubLObject cdotimes_end_var;
    SubLObject i;
    for( cdotimes_end_var = Sequences.length( vector ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      temp = Vectors.aref( vector, i );
      Vectors.set_aref( vector, i, back );
      back = temp;
    }
    return vector;
  }

  @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 3577L)
  public static SubLObject vector_nreplace_subsequence(final SubLObject v_new, final SubLObject old, SubLObject vector, SubLObject test, SubLObject key)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    assert NIL != Types.vectorp( v_new ) : v_new;
    assert NIL != Types.vectorp( old ) : old;
    assert NIL != Types.vectorp( vector ) : vector;
    for( SubLObject pos = Sequences.search( old, vector, test, key, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ); NIL != pos; pos = Sequences.search( vector, old, test, key, UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED ) )
    {
      vector = vector_nreplace_subsequence_int( v_new, pos, Sequences.length( old ), vector );
    }
    return vector;
  }

  @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 4087L)
  public static SubLObject vector_nreplace_subsequence_int(final SubLObject v_new, final SubLObject pos, final SubLObject old_length, final SubLObject vector)
  {
    if( NIL != list_utilities.lengthE( v_new, old_length, UNPROVIDED ) )
    {
      Sequences.replace( vector, v_new, pos, Numbers.add( pos, old_length ), UNPROVIDED, UNPROVIDED );
      return vector;
    }
    final SubLObject new_vector = Vectors.make_vector( Numbers.add( Sequences.length( vector ), Numbers.subtract( Sequences.length( v_new ), old_length ) ), UNPROVIDED );
    Sequences.replace( new_vector, vector, ZERO_INTEGER, pos, UNPROVIDED, UNPROVIDED );
    Sequences.replace( new_vector, v_new, pos, Numbers.add( pos, Sequences.length( v_new ) ), UNPROVIDED, UNPROVIDED );
    Sequences.replace( new_vector, vector, Numbers.add( pos, Sequences.length( v_new ) ), NIL, Numbers.add( pos, old_length ), UNPROVIDED );
    return new_vector;
  }

  @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 4544L)
  public static SubLObject print_vector_readably(final SubLObject vector, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = print_high.$print_readably$.currentBinding( thread );
    try
    {
      print_high.$print_readably$.bind( T, thread );
      print_high.prin1( vector, stream );
    }
    finally
    {
      print_high.$print_readably$.rebind( _prev_bind_0, thread );
    }
    return vector;
  }

  @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 4679L)
  public static SubLObject print_vector_as_delimited_line(final SubLObject vector, SubLObject delimiter, SubLObject stream)
  {
    if( delimiter == UNPROVIDED )
    {
      delimiter = Characters.CHAR_comma;
    }
    if( stream == UNPROVIDED )
    {
      stream = T;
    }
    final SubLObject backwardP_var = NIL;
    SubLObject length;
    SubLObject v_iteration;
    SubLObject i;
    SubLObject value;
    for( length = Sequences.length( vector ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      i = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      value = Vectors.aref( vector, i );
      if( !i.numE( ZERO_INTEGER ) )
      {
        print_high.princ( delimiter, stream );
      }
      print_high.prin1( value, stream );
    }
    return vector;
  }

  @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 4977L)
  public static SubLObject max_element(final SubLObject vector)
  {
    SubLObject max = NIL;
    final SubLObject backwardP_var = NIL;
    SubLObject length;
    SubLObject v_iteration;
    SubLObject element_num;
    SubLObject value;
    for( length = Sequences.length( vector ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      value = Vectors.aref( vector, element_num );
      if( NIL == max || value.numG( max ) )
      {
        max = value;
      }
    }
    return max;
  }

  @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 5151L)
  public static SubLObject min_element(final SubLObject vector)
  {
    SubLObject min = NIL;
    final SubLObject backwardP_var = NIL;
    SubLObject length;
    SubLObject v_iteration;
    SubLObject element_num;
    SubLObject value;
    for( length = Sequences.length( vector ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      value = Vectors.aref( vector, element_num );
      if( NIL == min || value.numL( min ) )
      {
        min = value;
      }
    }
    return min;
  }

  @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 5317L)
  public static SubLObject extremal_element(final SubLObject vector, final SubLObject key)
  {
    SubLObject extremal = NIL;
    final SubLObject backwardP_var = NIL;
    SubLObject length;
    SubLObject v_iteration;
    SubLObject element_num;
    SubLObject value;
    for( length = Sequences.length( vector ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      value = Vectors.aref( vector, element_num );
      if( NIL == extremal || NIL != Functions.funcall( key, value, extremal ) )
      {
        extremal = value;
      }
    }
    return extremal;
  }

  @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 5527L)
  public static SubLObject random_elt(final SubLObject sequence, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( $sym6$TRUE );
    }
    assert NIL != Types.sequencep( sequence ) : sequence;
    final SubLObject length = Sequences.length( sequence );
    enforceType( length, $sym8$POSITIVE_INTEGER_P );
    SubLObject witness = NIL;
    for( SubLObject foundP = NIL; NIL == foundP; foundP = Functions.funcall( test, witness ) )
    {
      final SubLObject index = random.random( length );
      witness = Sequences.elt( sequence, index );
    }
    return witness;
  }

  @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 6035L)
  public static SubLObject sample_list(final SubLObject list, SubLObject n, SubLObject allow_repeatsP, SubLObject test)
  {
    if( n == UNPROVIDED )
    {
      n = $int9$500;
    }
    if( allow_repeatsP == UNPROVIDED )
    {
      allow_repeatsP = NIL;
    }
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( $sym6$TRUE );
    }
    assert NIL != list_utilities.proper_list_p( list ) : list;
    return sample_sequence( list, n, allow_repeatsP, test );
  }

  @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 6344L)
  public static SubLObject sample_sequence(final SubLObject sequence, SubLObject n, SubLObject allow_repeatsP, SubLObject test)
  {
    if( n == UNPROVIDED )
    {
      n = $int9$500;
    }
    if( allow_repeatsP == UNPROVIDED )
    {
      allow_repeatsP = NIL;
    }
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( $sym6$TRUE );
    }
    assert NIL != Types.sequencep( sequence ) : sequence;
    assert NIL != subl_promotions.non_negative_integer_p( n ) : n;
    SubLObject sample_sequence = sequence;
    SubLObject sampled_items = NIL;
    if( sequence.isList() && Numbers.multiply( n, Sequences.length( sequence ) ).numGE( $int11$100000 ) )
    {
      sample_sequence = Functions.apply( Symbols.symbol_function( $sym3$VECTOR ), sequence );
    }
    if( NIL != allow_repeatsP )
    {
      SubLObject i;
      for( i = NIL, i = ZERO_INTEGER; i.numL( n ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        sampled_items = ConsesLow.cons( random_elt( sample_sequence, test ), sampled_items );
      }
    }
    else
    {
      SubLObject sampled_set;
      for( sampled_set = set_contents.new_set_contents( n, Symbols.symbol_function( EQL ) ); set_contents.set_contents_size( sampled_set ).numL( n ); sampled_set = set_contents.set_contents_add( random_elt(
          sample_sequence, test ), sampled_set, Symbols.symbol_function( EQL ) ) )
      {
      }
      sampled_items = set_contents.set_contents_element_list( sampled_set );
    }
    if( sequence.isVector() )
    {
      sampled_items = Functions.apply( Symbols.symbol_function( $sym3$VECTOR ), sampled_items );
    }
    return sampled_items;
  }

  @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 7378L)
  public static SubLObject make_ndim_array(final SubLObject dim_x, final SubLObject dim_y)
  {
    final SubLObject base_vector = Vectors.make_vector( dim_x, UNPROVIDED );
    SubLObject i;
    for( i = NIL, i = ZERO_INTEGER; i.numL( dim_x ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      Vectors.set_aref( base_vector, i, Vectors.make_vector( dim_y, UNPROVIDED ) );
    }
    return base_vector;
  }

  @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 7683L)
  public static SubLObject aref_ndim(final SubLObject base_vector, final SubLObject x, final SubLObject y)
  {
    return Vectors.aref( Vectors.aref( base_vector, x ), y );
  }

  @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 7818L)
  public static SubLObject set_aref_ndim(final SubLObject base_vector, final SubLObject x, final SubLObject y, final SubLObject value)
  {
    return Vectors.set_aref( Vectors.aref( base_vector, x ), y, value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 7976L)
  public static SubLObject f_2d_array_elements(final SubLObject v_2d_array)
  {
    SubLObject elements = NIL;
    final SubLObject backwardP_var = NIL;
    SubLObject length;
    SubLObject v_iteration;
    SubLObject element_num;
    SubLObject items_var;
    SubLObject subarray;
    SubLObject vector_var_$1;
    SubLObject backwardP_var_$2;
    SubLObject length_$3;
    SubLObject v_iteration_$4;
    SubLObject element_num_$5;
    SubLObject item;
    SubLObject cdolist_list_var;
    SubLObject item2;
    for( length = Sequences.length( v_2d_array ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      subarray = ( items_var = Vectors.aref( v_2d_array, element_num ) );
      if( items_var.isVector() )
      {
        vector_var_$1 = items_var;
        backwardP_var_$2 = NIL;
        for( length_$3 = Sequences.length( vector_var_$1 ), v_iteration_$4 = NIL, v_iteration_$4 = ZERO_INTEGER; v_iteration_$4.numL( length_$3 ); v_iteration_$4 = Numbers.add( v_iteration_$4, ONE_INTEGER ) )
        {
          element_num_$5 = ( ( NIL != backwardP_var_$2 ) ? Numbers.subtract( length_$3, v_iteration_$4, ONE_INTEGER ) : v_iteration_$4 );
          item = Vectors.aref( vector_var_$1, element_num_$5 );
          elements = ConsesLow.cons( item, elements );
        }
      }
      else
      {
        cdolist_list_var = items_var;
        item2 = NIL;
        item2 = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          elements = ConsesLow.cons( item2, elements );
          cdolist_list_var = cdolist_list_var.rest();
          item2 = cdolist_list_var.first();
        }
      }
    }
    return elements;
  }

  @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 8138L)
  public static SubLObject f_3d_array_elements(final SubLObject v_3d_array)
  {
    SubLObject elements = NIL;
    final SubLObject backwardP_var = NIL;
    SubLObject length;
    SubLObject v_iteration;
    SubLObject element_num;
    SubLObject vector_var_$6;
    SubLObject v_2d_array;
    SubLObject backwardP_var_$7;
    SubLObject length_$8;
    SubLObject v_iteration_$9;
    SubLObject element_num_$10;
    SubLObject items_var;
    SubLObject array;
    SubLObject vector_var_$7;
    SubLObject backwardP_var_$8;
    SubLObject length_$9;
    SubLObject v_iteration_$10;
    SubLObject element_num_$11;
    SubLObject item;
    SubLObject cdolist_list_var;
    SubLObject item2;
    for( length = Sequences.length( v_3d_array ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      v_2d_array = ( vector_var_$6 = Vectors.aref( v_3d_array, element_num ) );
      backwardP_var_$7 = NIL;
      for( length_$8 = Sequences.length( vector_var_$6 ), v_iteration_$9 = NIL, v_iteration_$9 = ZERO_INTEGER; v_iteration_$9.numL( length_$8 ); v_iteration_$9 = Numbers.add( v_iteration_$9, ONE_INTEGER ) )
      {
        element_num_$10 = ( ( NIL != backwardP_var_$7 ) ? Numbers.subtract( length_$8, v_iteration_$9, ONE_INTEGER ) : v_iteration_$9 );
        array = ( items_var = Vectors.aref( vector_var_$6, element_num_$10 ) );
        if( items_var.isVector() )
        {
          vector_var_$7 = items_var;
          backwardP_var_$8 = NIL;
          for( length_$9 = Sequences.length( vector_var_$7 ), v_iteration_$10 = NIL, v_iteration_$10 = ZERO_INTEGER; v_iteration_$10.numL( length_$9 ); v_iteration_$10 = Numbers.add( v_iteration_$10, ONE_INTEGER ) )
          {
            element_num_$11 = ( ( NIL != backwardP_var_$8 ) ? Numbers.subtract( length_$9, v_iteration_$10, ONE_INTEGER ) : v_iteration_$10 );
            item = Vectors.aref( vector_var_$7, element_num_$11 );
            elements = ConsesLow.cons( item, elements );
          }
        }
        else
        {
          cdolist_list_var = items_var;
          item2 = NIL;
          item2 = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            elements = ConsesLow.cons( item2, elements );
            cdolist_list_var = cdolist_list_var.rest();
            item2 = cdolist_list_var.first();
          }
        }
      }
    }
    return elements;
  }

  @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 8327L)
  public static SubLObject byte_vector_p(final SubLObject v_object)
  {
    if( v_object.isVector() )
    {
      final SubLObject backwardP_var = NIL;
      SubLObject length;
      SubLObject v_iteration;
      SubLObject element_num;
      SubLObject item;
      for( length = Sequences.length( v_object ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
      {
        element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
        item = Vectors.aref( v_object, element_num );
        if( NIL == number_utilities.bytep( item ) )
        {
          return NIL;
        }
      }
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 8571L)
  public static SubLObject new_byte_vector_from_file(final SubLObject filename)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( filename ) : filename;
    SubLObject byte_vector = NIL;
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_binary( filename, $kw13$INPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str14$Unable_to_open__S, filename );
      }
      final SubLObject stream_$16 = stream;
      final SubLObject length = streams_high.file_length( stream_$16 );
      byte_vector = Vectors.make_vector( length, UNPROVIDED );
      SubLObject i;
      for( i = NIL, i = ZERO_INTEGER; i.numL( length ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        Vectors.set_aref( byte_vector, i, streams_high.read_byte( stream_$16, T, UNPROVIDED ) );
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
    return byte_vector;
  }

  @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 8992L)
  public static SubLObject byte_vector_to_hex_char_string(final SubLObject byte_vector)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != byte_vector_p( byte_vector ) : byte_vector;
    SubLObject hex_char_string = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      final SubLObject backwardP_var = NIL;
      SubLObject length;
      SubLObject v_iteration;
      SubLObject element_num;
      SubLObject v_byte;
      SubLObject high_char;
      SubLObject low_char;
      for( length = Sequences.length( byte_vector ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
      {
        element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
        v_byte = Vectors.aref( byte_vector, element_num );
        thread.resetMultipleValues();
        high_char = byte_to_hex_chars( v_byte );
        low_char = thread.secondMultipleValue();
        thread.resetMultipleValues();
        streams_high.write_char( high_char, stream );
        streams_high.write_char( low_char, stream );
      }
      hex_char_string = streams_high.get_output_stream_string( stream );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( stream, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
      }
    }
    return hex_char_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 9542L)
  public static SubLObject byte_vector_to_formatted_hex_char_string(final SubLObject byte_vector)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject byte_vector_length = Sequences.length( byte_vector );
    final SubLObject hex_string_length = Numbers.add( ONE_INTEGER, number_utilities.f_2X( byte_vector_length ), Numbers.floor( number_utilities.f_1_( byte_vector_length ), FOUR_INTEGER ) );
    final SubLObject hex_string = Strings.make_string( hex_string_length, UNPROVIDED );
    SubLObject j = ZERO_INTEGER;
    final SubLObject backwardP_var = NIL;
    SubLObject length;
    SubLObject v_iteration;
    SubLObject i;
    SubLObject v_byte;
    SubLObject high_char;
    SubLObject low_char;
    for( length = Sequences.length( byte_vector ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      i = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      v_byte = Vectors.aref( byte_vector, i );
      if( Numbers.mod( i, $int16$32 ).isZero() )
      {
        Vectors.set_aref( hex_string, j, Characters.CHAR_newline );
        j = Numbers.add( j, ONE_INTEGER );
      }
      else if( Numbers.mod( i, FOUR_INTEGER ).isZero() )
      {
        Vectors.set_aref( hex_string, j, Characters.CHAR_space );
        j = Numbers.add( j, ONE_INTEGER );
      }
      thread.resetMultipleValues();
      high_char = byte_to_hex_chars( v_byte );
      low_char = thread.secondMultipleValue();
      thread.resetMultipleValues();
      Vectors.set_aref( hex_string, j, high_char );
      j = Numbers.add( j, ONE_INTEGER );
      Vectors.set_aref( hex_string, j, low_char );
      j = Numbers.add( j, ONE_INTEGER );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !j.numE( hex_string_length ) )
    {
      Errors.error( $str17$Did_not_fill_up_all_the_expected_, j, hex_string_length );
    }
    return hex_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 10896L)
  public static SubLObject byte_vector_to_string(final SubLObject byte_vector)
  {
    assert NIL != byte_vector_p( byte_vector ) : byte_vector;
    final SubLObject length = Sequences.length( byte_vector );
    final SubLObject string = Strings.make_string( length, UNPROVIDED );
    final SubLObject backwardP_var = NIL;
    SubLObject length_$17;
    SubLObject v_iteration;
    SubLObject index;
    SubLObject v_byte;
    for( length_$17 = Sequences.length( byte_vector ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length_$17 ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      index = ( ( NIL != backwardP_var ) ? Numbers.subtract( length_$17, v_iteration, ONE_INTEGER ) : v_iteration );
      v_byte = Vectors.aref( byte_vector, index );
      Strings.set_char( string, index, Characters.code_char( v_byte ) );
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 11297L)
  public static SubLObject hex_char_string_to_byte_vector(final SubLObject hex_char_string)
  {
    assert NIL != string_utilities.hex_char_string_p( hex_char_string ) : hex_char_string;
    final SubLObject string_length = Sequences.length( hex_char_string );
    assert NIL != Numbers.evenp( string_length ) : string_length;
    final SubLObject byte_vector_length = Numbers.integerDivide( string_length, TWO_INTEGER );
    final SubLObject byte_vector = Vectors.make_vector( byte_vector_length, UNPROVIDED );
    SubLObject i;
    SubLObject string_index;
    SubLObject high_char;
    SubLObject low_char;
    SubLObject v_byte;
    for( i = NIL, i = ZERO_INTEGER; i.numL( byte_vector_length ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      string_index = Numbers.multiply( TWO_INTEGER, i );
      high_char = Strings.sublisp_char( hex_char_string, string_index );
      low_char = Strings.sublisp_char( hex_char_string, Numbers.add( ONE_INTEGER, string_index ) );
      v_byte = hex_chars_to_byte( high_char, low_char );
      Vectors.set_aref( byte_vector, i, v_byte );
    }
    return byte_vector;
  }

  @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 12019L)
  public static SubLObject byte_to_hex_chars(final SubLObject v_byte)
  {
    final SubLObject high_nybble = Numbers.integerDivide( v_byte, SIXTEEN_INTEGER );
    final SubLObject low_nybble = Numbers.mod( v_byte, SIXTEEN_INTEGER );
    return Values.values( string_utilities.hex_char( high_nybble ), string_utilities.hex_char( low_nybble ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 12216L)
  public static SubLObject hex_chars_to_byte(final SubLObject high_char, final SubLObject low_char)
  {
    final SubLObject high_nybble = string_utilities.hex_char_value( high_char );
    final SubLObject low_nybble = string_utilities.hex_char_value( low_char );
    return Numbers.add( Numbers.multiply( SIXTEEN_INTEGER, high_nybble ), low_nybble );
  }

  @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 12418L)
  public static SubLObject byte_vector_to_64_bit_char_string(final SubLObject byte_vector)
  {
    assert NIL != byte_vector_p( byte_vector ) : byte_vector;
    SubLObject i = ZERO_INTEGER;
    SubLObject v_64_bit_char_string = NIL;
    SubLObject high_byte = NIL;
    SubLObject middle_byte = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      final SubLObject backwardP_var = NIL;
      SubLObject length;
      SubLObject v_iteration;
      SubLObject element_num;
      SubLObject v_byte;
      SubLObject pcase_var;
      SubLObject low_byte;
      for( length = Sequences.length( byte_vector ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
      {
        element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
        v_byte = Vectors.aref( byte_vector, element_num );
        pcase_var = i;
        if( pcase_var.eql( ZERO_INTEGER ) )
        {
          high_byte = v_byte;
        }
        else if( pcase_var.eql( ONE_INTEGER ) )
        {
          middle_byte = v_byte;
        }
        else if( pcase_var.eql( TWO_INTEGER ) )
        {
          low_byte = v_byte;
          write_bytes_as_64_bit_chars( high_byte, middle_byte, low_byte, stream );
          i = MINUS_ONE_INTEGER;
        }
        i = Numbers.add( i, ONE_INTEGER );
      }
      final SubLObject pcase_var2 = i;
      if( !pcase_var2.eql( ZERO_INTEGER ) )
      {
        if( pcase_var2.eql( ONE_INTEGER ) )
        {
          middle_byte = NIL;
          final SubLObject low_byte2 = NIL;
          write_bytes_as_64_bit_chars( high_byte, middle_byte, low_byte2, stream );
        }
        else if( pcase_var2.eql( TWO_INTEGER ) )
        {
          final SubLObject low_byte2 = NIL;
          write_bytes_as_64_bit_chars( high_byte, middle_byte, low_byte2, stream );
        }
      }
      v_64_bit_char_string = streams_high.get_output_stream_string( stream );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( stream, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return v_64_bit_char_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 13244L)
  public static SubLObject write_bytes_as_64_bit_chars(final SubLObject high_byte, final SubLObject middle_byte, final SubLObject low_byte, final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject highest_char = bytes_to_64_bit_chars( high_byte, middle_byte, low_byte );
    final SubLObject high_char = thread.secondMultipleValue();
    final SubLObject low_char = thread.thirdMultipleValue();
    final SubLObject lowest_char = thread.fourthMultipleValue();
    thread.resetMultipleValues();
    streams_high.write_char( highest_char, stream );
    streams_high.write_char( high_char, stream );
    if( NIL != low_char )
    {
      streams_high.write_char( low_char, stream );
    }
    if( NIL != lowest_char )
    {
      streams_high.write_char( lowest_char, stream );
    }
    return stream;
  }

  @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 13663L)
  public static SubLObject bytes_to_64_bit_chars(final SubLObject high_byte, SubLObject middle_byte, SubLObject low_byte)
  {
    SubLObject nil_count = ZERO_INTEGER;
    if( NIL == low_byte )
    {
      low_byte = ZERO_INTEGER;
      nil_count = Numbers.add( nil_count, ONE_INTEGER );
    }
    if( NIL == middle_byte )
    {
      middle_byte = ZERO_INTEGER;
      nil_count = Numbers.add( nil_count, ONE_INTEGER );
    }
    final SubLObject aaaaaa = bytes.ldb( bytes.sublisp_byte( SIX_INTEGER, TWO_INTEGER ), high_byte );
    final SubLObject bb = bytes.ldb( bytes.sublisp_byte( TWO_INTEGER, ZERO_INTEGER ), high_byte );
    final SubLObject bbbb = bytes.ldb( bytes.sublisp_byte( FOUR_INTEGER, FOUR_INTEGER ), middle_byte );
    final SubLObject cccc = bytes.ldb( bytes.sublisp_byte( FOUR_INTEGER, ZERO_INTEGER ), middle_byte );
    final SubLObject cc = bytes.ldb( bytes.sublisp_byte( TWO_INTEGER, SIX_INTEGER ), low_byte );
    final SubLObject dddddd = bytes.ldb( bytes.sublisp_byte( SIX_INTEGER, ZERO_INTEGER ), low_byte );
    final SubLObject bbbbbb = Numbers.add( Numbers.ash( bb, FOUR_INTEGER ), bbbb );
    final SubLObject cccccc = Numbers.add( Numbers.ash( cccc, TWO_INTEGER ), cc );
    final SubLObject highest_char = string_utilities.f_64_bit_char( aaaaaa );
    final SubLObject high_char = string_utilities.f_64_bit_char( bbbbbb );
    SubLObject low_char = string_utilities.f_64_bit_char( cccccc );
    SubLObject lowest_char = string_utilities.f_64_bit_char( dddddd );
    if( nil_count.numG( ZERO_INTEGER ) )
    {
      lowest_char = NIL;
      if( nil_count.numG( ONE_INTEGER ) )
      {
        low_char = NIL;
      }
    }
    return Values.values( highest_char, high_char, low_char, lowest_char );
  }

  @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 14829L)
  public static SubLObject f_64_bit_chars_to_bytes(final SubLObject highest_char, final SubLObject high_char, SubLObject low_char, SubLObject lowest_char)
  {
    SubLObject nil_count = ZERO_INTEGER;
    if( NIL == lowest_char || NIL != Characters.charE( Characters.CHAR_equal, lowest_char ) )
    {
      lowest_char = Characters.CHAR_A;
      nil_count = Numbers.add( nil_count, ONE_INTEGER );
    }
    if( NIL == low_char || NIL != Characters.charE( Characters.CHAR_equal, low_char ) )
    {
      low_char = Characters.CHAR_A;
      nil_count = Numbers.add( nil_count, ONE_INTEGER );
    }
    final SubLObject aaaaaa = string_utilities.f_64_bit_char_value( highest_char );
    final SubLObject bbbbbb = string_utilities.f_64_bit_char_value( high_char );
    final SubLObject cccccc = string_utilities.f_64_bit_char_value( low_char );
    final SubLObject dddddd = string_utilities.f_64_bit_char_value( lowest_char );
    final SubLObject bb = bytes.ldb( bytes.sublisp_byte( TWO_INTEGER, FOUR_INTEGER ), bbbbbb );
    final SubLObject bbbb = bytes.ldb( bytes.sublisp_byte( FOUR_INTEGER, ZERO_INTEGER ), bbbbbb );
    final SubLObject cccc = bytes.ldb( bytes.sublisp_byte( FOUR_INTEGER, TWO_INTEGER ), cccccc );
    final SubLObject cc = bytes.ldb( bytes.sublisp_byte( TWO_INTEGER, ZERO_INTEGER ), cccccc );
    final SubLObject high_byte = Numbers.add( Numbers.ash( aaaaaa, TWO_INTEGER ), bb );
    SubLObject middle_byte = Numbers.add( Numbers.ash( bbbb, FOUR_INTEGER ), cccc );
    SubLObject low_byte = Numbers.add( Numbers.ash( cc, SIX_INTEGER ), dddddd );
    if( nil_count.numG( ZERO_INTEGER ) )
    {
      low_byte = NIL;
      if( nil_count.numG( ONE_INTEGER ) )
      {
        middle_byte = NIL;
      }
    }
    return Values.values( high_byte, middle_byte, low_byte );
  }

  @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 16111L)
  public static SubLObject f_64_bit_char_string_to_byte_vector(final SubLObject v_64_bit_string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != string_utilities.f_64_bit_string_p( v_64_bit_string ) : v_64_bit_string;
    final SubLObject string_length = Sequences.length( v_64_bit_string );
    final SubLObject tuples_length = f_64_bit_string_tuples_length( v_64_bit_string );
    final SubLObject vector_length = f_64_bit_string_byte_vector_length( v_64_bit_string );
    final SubLObject byte_vector = Vectors.make_vector( vector_length, UNPROVIDED );
    SubLObject string_index = ZERO_INTEGER;
    SubLObject vector_index = ZERO_INTEGER;
    SubLObject highest_char = NIL;
    SubLObject high_char = NIL;
    SubLObject low_char = NIL;
    SubLObject lowest_char = NIL;
    SubLObject i;
    SubLObject high_byte;
    SubLObject middle_byte;
    SubLObject low_byte;
    for( i = NIL, i = ZERO_INTEGER; i.numL( tuples_length ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      highest_char = Strings.sublisp_char( v_64_bit_string, string_index );
      string_index = Numbers.add( string_index, ONE_INTEGER );
      high_char = Strings.sublisp_char( v_64_bit_string, string_index );
      string_index = Numbers.add( string_index, ONE_INTEGER );
      low_char = string_index.numL( string_length ) ? Strings.sublisp_char( v_64_bit_string, string_index ) : NIL;
      string_index = Numbers.add( string_index, ONE_INTEGER );
      lowest_char = string_index.numL( string_length ) ? Strings.sublisp_char( v_64_bit_string, string_index ) : NIL;
      string_index = Numbers.add( string_index, ONE_INTEGER );
      thread.resetMultipleValues();
      high_byte = f_64_bit_chars_to_bytes( highest_char, high_char, low_char, lowest_char );
      middle_byte = thread.secondMultipleValue();
      low_byte = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      Vectors.set_aref( byte_vector, vector_index, high_byte );
      vector_index = Numbers.add( vector_index, ONE_INTEGER );
      if( NIL != middle_byte )
      {
        Vectors.set_aref( byte_vector, vector_index, middle_byte );
        vector_index = Numbers.add( vector_index, ONE_INTEGER );
      }
      if( NIL != low_byte )
      {
        Vectors.set_aref( byte_vector, vector_index, low_byte );
        vector_index = Numbers.add( vector_index, ONE_INTEGER );
      }
    }
    return byte_vector;
  }

  @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 17481L)
  public static SubLObject f_64_bit_string_tuples_length(final SubLObject v_64_bit_string)
  {
    assert NIL != Types.stringp( v_64_bit_string ) : v_64_bit_string;
    final SubLObject string_length = Sequences.length( v_64_bit_string );
    return Numbers.ceiling( string_length, FOUR_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 17666L)
  public static SubLObject f_64_bit_string_byte_vector_length(final SubLObject v_64_bit_string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( v_64_bit_string ) : v_64_bit_string;
    final SubLObject string_length = Sequences.length( v_64_bit_string );
    if( string_length.isZero() )
    {
      return ZERO_INTEGER;
    }
    thread.resetMultipleValues();
    final SubLObject tuples_length = f_64_bit_string_tuples_length( v_64_bit_string );
    final SubLObject excess = thread.secondMultipleValue();
    thread.resetMultipleValues();
    SubLObject vector_length = Numbers.multiply( THREE_INTEGER, number_utilities.f_1_( tuples_length ) );
    if( !excess.isZero() )
    {
      vector_length = Numbers.add( vector_length, Numbers.add( excess, THREE_INTEGER ) );
    }
    else if( NIL == Characters.charE( Characters.CHAR_equal, Strings.sublisp_char( v_64_bit_string, Numbers.subtract( string_length, ONE_INTEGER ) ) ) )
    {
      vector_length = Numbers.add( vector_length, THREE_INTEGER );
    }
    else if( NIL == Characters.charE( Characters.CHAR_equal, Strings.sublisp_char( v_64_bit_string, Numbers.subtract( string_length, TWO_INTEGER ) ) ) )
    {
      vector_length = Numbers.add( vector_length, TWO_INTEGER );
    }
    else
    {
      vector_length = Numbers.add( vector_length, ONE_INTEGER );
    }
    return vector_length;
  }

  @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 18807L)
  public static SubLObject binary_search_vector_subrange_wXduplicates(final SubLObject item, final SubLObject vector, final SubLObject start, final SubLObject end, final SubLObject compare, SubLObject test,
      SubLObject key, SubLObject deleted_test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    if( deleted_test == UNPROVIDED )
    {
      deleted_test = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    SubLObject low = binary_search_vector_subrange( item, vector, start, end, compare, test, key, deleted_test );
    SubLObject high = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( low.numE( high ) )
    {
      final SubLObject exemplar = Functions.funcall( key, Vectors.aref( vector, low ) );
      for( SubLObject doneP = makeBoolean( !low.isPositive() ); NIL == doneP; doneP = makeBoolean( NIL != doneP || !low.isPositive() ) )
      {
        final SubLObject lower = Numbers.subtract( low, ONE_INTEGER );
        final SubLObject candidate = Functions.funcall( key, Vectors.aref( vector, lower ) );
        if( NIL != Functions.funcall( test, exemplar, candidate ) )
        {
          low = lower;
        }
        else
        {
          doneP = T;
        }
      }
      for( SubLObject last = Numbers.subtract( end, ONE_INTEGER ), doneP = makeBoolean( !high.numL( last ) ); NIL == doneP; doneP = makeBoolean( NIL != doneP || !high.numL( last ) ) )
      {
        final SubLObject higher = Numbers.add( high, ONE_INTEGER );
        final SubLObject candidate2 = Functions.funcall( key, Vectors.aref( vector, higher ) );
        if( NIL != Functions.funcall( test, exemplar, candidate2 ) )
        {
          high = higher;
        }
        else
        {
          doneP = T;
        }
      }
      return Values.values( low, high, T );
    }
    if( low.numE( end ) )
    {
      return Values.values( low, high, NIL );
    }
    final SubLObject low_elt = Functions.funcall( key, Vectors.aref( vector, low ) );
    if( NIL != Functions.funcall( compare, item, low_elt ) )
    {
      return Values.values( Numbers.subtract( low, ONE_INTEGER ), Numbers.subtract( high, ONE_INTEGER ), NIL );
    }
    return Values.values( low, high, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 21468L)
  public static SubLObject test_binary_search_vector_subrange_wXduplicate_structures(final SubLObject item, final SubLObject vector, final SubLObject start, final SubLObject end, final SubLObject compare,
      final SubLObject key)
  {
    return Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( binary_search_vector_subrange_wXduplicates( item, vector, start, end, compare, EQL, key, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 21708L)
  public static SubLObject test_binary_search_vector_subrange_wXduplicates(final SubLObject item, final SubLObject vector, final SubLObject start, final SubLObject end, final SubLObject compare)
  {
    return Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( binary_search_vector_subrange_wXduplicates( item, vector, start, end, compare, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 21925L)
  public static SubLObject binary_search_vector_subrange(final SubLObject item, final SubLObject vector, final SubLObject start, final SubLObject end, final SubLObject compare, SubLObject test, SubLObject key,
      SubLObject deleted_test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    if( deleted_test == UNPROVIDED )
    {
      deleted_test = NIL;
    }
    return binary_search_vector_int( item, vector, start, end, compare, test, key, deleted_test );
  }

  @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 22340L)
  public static SubLObject binary_search_vector_range(final SubLObject item, final SubLObject vector, final SubLObject compare, SubLObject test, SubLObject key, SubLObject deleted_test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    if( deleted_test == UNPROVIDED )
    {
      deleted_test = NIL;
    }
    return binary_search_vector_int( item, vector, ZERO_INTEGER, Sequences.length( vector ), compare, test, key, deleted_test );
  }

  @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 22747L)
  public static SubLObject binary_search_vector(final SubLObject item, final SubLObject vector, final SubLObject compare, SubLObject test, SubLObject key, SubLObject deleted_test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    if( deleted_test == UNPROVIDED )
    {
      deleted_test = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject low = binary_search_vector_int( item, vector, ZERO_INTEGER, Sequences.length( vector ), compare, test, key, deleted_test );
    final SubLObject high = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( low.numE( high ) )
    {
      return low;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 23092L)
  public static SubLObject binary_search_vector_int(final SubLObject item, final SubLObject vector, SubLObject start, SubLObject end, final SubLObject compare, final SubLObject test, final SubLObject key,
      final SubLObject deleted_test)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    while ( !start.numE( end ))
    {
      if( !start.numL( end ) )
      {
        return Values.values( end, start );
      }
      final SubLObject mid = Numbers.integerDivide( Numbers.add( start, end ), TWO_INTEGER );
      final SubLObject elt = Vectors.aref( vector, mid );
      if( NIL == deleted_test || NIL == Functions.funcall( deleted_test, elt ) )
      {
        final SubLObject value = Functions.funcall( key, elt );
        if( NIL != Functions.funcall( test, item, value ) )
        {
          return Values.values( mid, mid );
        }
        if( NIL != Functions.funcall( compare, item, value ) )
        {
          end = mid;
        }
        else
        {
          start = Numbers.add( mid, ONE_INTEGER );
        }
      }
      else
      {
        thread.resetMultipleValues();
        final SubLObject low = binary_search_vector_int( item, vector, start, mid, compare, test, key, deleted_test );
        final SubLObject high = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( low.numE( high ) )
        {
          return Values.values( low, high );
        }
        return binary_search_vector_int( item, vector, Numbers.add( mid, ONE_INTEGER ), end, compare, test, key, deleted_test );
      }
    }
    return Values.values( start, Numbers.add( end, ONE_INTEGER ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 24038L)
  public static SubLObject test_bytes_to_64_bit_chars_once(final SubLObject high_byte, final SubLObject middle_byte, final SubLObject low_byte)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject highest_char = bytes_to_64_bit_chars( high_byte, middle_byte, low_byte );
    final SubLObject high_char = thread.secondMultipleValue();
    final SubLObject low_char = thread.thirdMultipleValue();
    final SubLObject lowest_char = thread.fourthMultipleValue();
    thread.resetMultipleValues();
    thread.resetMultipleValues();
    final SubLObject new_high_byte = f_64_bit_chars_to_bytes( highest_char, high_char, low_char, lowest_char );
    final SubLObject new_middle_byte = thread.secondMultipleValue();
    final SubLObject new_low_byte = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( high_byte.eql( new_high_byte ) && middle_byte.eql( new_middle_byte ) && low_byte.eql( new_low_byte ) )
    {
      return T;
    }
    return Errors.error( $str35$Failure_on__S__S__S, high_byte, middle_byte, low_byte );
  }

  @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 24038L)
  public static SubLObject test_64_bit_chars_to_bytes_once(final SubLObject highest_char, final SubLObject high_char, final SubLObject low_char, final SubLObject lowest_char)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject high_byte = f_64_bit_chars_to_bytes( highest_char, high_char, low_char, lowest_char );
    final SubLObject middle_byte = thread.secondMultipleValue();
    final SubLObject low_byte = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    thread.resetMultipleValues();
    final SubLObject new_highest_char = bytes_to_64_bit_chars( high_byte, middle_byte, low_byte );
    final SubLObject new_high_char = thread.secondMultipleValue();
    final SubLObject new_low_char = thread.thirdMultipleValue();
    final SubLObject new_lowest_char = thread.fourthMultipleValue();
    thread.resetMultipleValues();
    if( NIL != Characters.charE( highest_char, new_highest_char ) && NIL != Characters.charE( high_char, new_high_char ) && NIL != Characters.charE( low_char, new_low_char ) && NIL != Characters.charE( lowest_char,
        new_lowest_char ) )
    {
      return T;
    }
    return Errors.error( $str36$Failure_on__S__S__S__S, new SubLObject[] { highest_char, high_char, low_char, lowest_char
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 24038L)
  public static SubLObject test_bytes_to_64_bit_chars(SubLObject n)
  {
    if( n == UNPROVIDED )
    {
      n = $int11$100000;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( $str37$cdotimes, thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( n, thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject i;
        SubLObject nil_count;
        SubLObject high_byte;
        SubLObject middle_byte;
        SubLObject low_byte;
        for( i = NIL, i = ZERO_INTEGER; i.numL( utilities_macros.$progress_total$.getDynamicValue( thread ) ); i = Numbers.add( i, ONE_INTEGER ) )
        {
          nil_count = random.random( THREE_INTEGER );
          high_byte = random.random( $int38$256 );
          middle_byte = nil_count.numG( ONE_INTEGER ) ? NIL : random.random( $int38$256 );
          low_byte = nil_count.numG( ZERO_INTEGER ) ? NIL : random.random( $int38$256 );
          test_bytes_to_64_bit_chars_once( high_byte, middle_byte, low_byte );
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$18, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/vector-utilities.lisp", position = 24038L)
  public static SubLObject test_64_bit_chars_to_bytes(SubLObject n)
  {
    if( n == UNPROVIDED )
    {
      n = $int11$100000;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( $str37$cdotimes, thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( n, thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject i;
        SubLObject nil_count;
        SubLObject high_byte;
        SubLObject middle_byte;
        SubLObject low_byte;
        SubLObject highest_char;
        SubLObject high_char;
        SubLObject low_char;
        SubLObject lowest_char;
        for( i = NIL, i = ZERO_INTEGER; i.numL( utilities_macros.$progress_total$.getDynamicValue( thread ) ); i = Numbers.add( i, ONE_INTEGER ) )
        {
          nil_count = random.random( THREE_INTEGER );
          high_byte = random.random( $int38$256 );
          middle_byte = nil_count.numG( ONE_INTEGER ) ? NIL : random.random( $int38$256 );
          low_byte = nil_count.numG( ZERO_INTEGER ) ? NIL : random.random( $int38$256 );
          thread.resetMultipleValues();
          highest_char = bytes_to_64_bit_chars( high_byte, middle_byte, low_byte );
          high_char = thread.secondMultipleValue();
          low_char = thread.thirdMultipleValue();
          lowest_char = thread.fourthMultipleValue();
          thread.resetMultipleValues();
          test_64_bit_chars_to_bytes_once( highest_char, high_char, low_char, lowest_char );
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$19, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
    }
    return T;
  }

  public static SubLObject declare_vector_utilities_file()
  {
    SubLFiles.declareFunction( me, "vector_elements", "VECTOR-ELEMENTS", 1, 1, false );
    SubLFiles.declareFunction( me, "list_to_vector", "LIST-TO-VECTOR", 1, 0, false );
    SubLFiles.declareFunction( me, "copy_vector", "COPY-VECTOR", 1, 0, false );
    SubLFiles.declareFunction( me, "first_aref", "FIRST-AREF", 1, 0, false );
    SubLFiles.declareFunction( me, "last_aref", "LAST-AREF", 1, 0, false );
    SubLFiles.declareFunction( me, "num_vector", "NUM-VECTOR", 1, 0, false );
    SubLFiles.declareFunction( me, "extend_vector", "EXTEND-VECTOR", 2, 1, false );
    SubLFiles.declareFunction( me, "extend_vector_to", "EXTEND-VECTOR-TO", 2, 1, false );
    SubLFiles.declareFunction( me, "grow_vector", "GROW-VECTOR", 1, 2, false );
    SubLFiles.declareFunction( me, "reset_vector", "RESET-VECTOR", 1, 1, false );
    SubLFiles.declareFunction( me, "clear_vector", "CLEAR-VECTOR", 1, 1, false );
    SubLFiles.declareFunction( me, "percolate_vector", "PERCOLATE-VECTOR", 2, 0, false );
    SubLFiles.declareFunction( me, "vector_nreplace_subsequence", "VECTOR-NREPLACE-SUBSEQUENCE", 3, 2, false );
    SubLFiles.declareFunction( me, "vector_nreplace_subsequence_int", "VECTOR-NREPLACE-SUBSEQUENCE-INT", 4, 0, false );
    SubLFiles.declareFunction( me, "print_vector_readably", "PRINT-VECTOR-READABLY", 1, 1, false );
    SubLFiles.declareFunction( me, "print_vector_as_delimited_line", "PRINT-VECTOR-AS-DELIMITED-LINE", 1, 2, false );
    SubLFiles.declareFunction( me, "max_element", "MAX-ELEMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "min_element", "MIN-ELEMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "extremal_element", "EXTREMAL-ELEMENT", 2, 0, false );
    SubLFiles.declareFunction( me, "random_elt", "RANDOM-ELT", 1, 1, false );
    SubLFiles.declareFunction( me, "sample_list", "SAMPLE-LIST", 1, 3, false );
    SubLFiles.declareFunction( me, "sample_sequence", "SAMPLE-SEQUENCE", 1, 3, false );
    SubLFiles.declareFunction( me, "make_ndim_array", "MAKE-NDIM-ARRAY", 2, 0, false );
    SubLFiles.declareFunction( me, "aref_ndim", "AREF-NDIM", 3, 0, false );
    SubLFiles.declareFunction( me, "set_aref_ndim", "SET-AREF-NDIM", 4, 0, false );
    SubLFiles.declareFunction( me, "f_2d_array_elements", "2D-ARRAY-ELEMENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "f_3d_array_elements", "3D-ARRAY-ELEMENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "byte_vector_p", "BYTE-VECTOR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_byte_vector_from_file", "NEW-BYTE-VECTOR-FROM-FILE", 1, 0, false );
    SubLFiles.declareFunction( me, "byte_vector_to_hex_char_string", "BYTE-VECTOR-TO-HEX-CHAR-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "byte_vector_to_formatted_hex_char_string", "BYTE-VECTOR-TO-FORMATTED-HEX-CHAR-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "byte_vector_to_string", "BYTE-VECTOR-TO-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "hex_char_string_to_byte_vector", "HEX-CHAR-STRING-TO-BYTE-VECTOR", 1, 0, false );
    SubLFiles.declareFunction( me, "byte_to_hex_chars", "BYTE-TO-HEX-CHARS", 1, 0, false );
    SubLFiles.declareFunction( me, "hex_chars_to_byte", "HEX-CHARS-TO-BYTE", 2, 0, false );
    SubLFiles.declareFunction( me, "byte_vector_to_64_bit_char_string", "BYTE-VECTOR-TO-64-BIT-CHAR-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "write_bytes_as_64_bit_chars", "WRITE-BYTES-AS-64-BIT-CHARS", 4, 0, false );
    SubLFiles.declareFunction( me, "bytes_to_64_bit_chars", "BYTES-TO-64-BIT-CHARS", 3, 0, false );
    SubLFiles.declareFunction( me, "f_64_bit_chars_to_bytes", "64-BIT-CHARS-TO-BYTES", 4, 0, false );
    SubLFiles.declareFunction( me, "f_64_bit_char_string_to_byte_vector", "64-BIT-CHAR-STRING-TO-BYTE-VECTOR", 1, 0, false );
    SubLFiles.declareFunction( me, "f_64_bit_string_tuples_length", "64-BIT-STRING-TUPLES-LENGTH", 1, 0, false );
    SubLFiles.declareFunction( me, "f_64_bit_string_byte_vector_length", "64-BIT-STRING-BYTE-VECTOR-LENGTH", 1, 0, false );
    SubLFiles.declareFunction( me, "binary_search_vector_subrange_wXduplicates", "BINARY-SEARCH-VECTOR-SUBRANGE-W/DUPLICATES", 5, 3, false );
    SubLFiles.declareFunction( me, "test_binary_search_vector_subrange_wXduplicate_structures", "TEST-BINARY-SEARCH-VECTOR-SUBRANGE-W/DUPLICATE-STRUCTURES", 6, 0, false );
    SubLFiles.declareFunction( me, "test_binary_search_vector_subrange_wXduplicates", "TEST-BINARY-SEARCH-VECTOR-SUBRANGE-W/DUPLICATES", 5, 0, false );
    SubLFiles.declareFunction( me, "binary_search_vector_subrange", "BINARY-SEARCH-VECTOR-SUBRANGE", 5, 3, false );
    SubLFiles.declareFunction( me, "binary_search_vector_range", "BINARY-SEARCH-VECTOR-RANGE", 3, 3, false );
    SubLFiles.declareFunction( me, "binary_search_vector", "BINARY-SEARCH-VECTOR", 3, 3, false );
    SubLFiles.declareFunction( me, "binary_search_vector_int", "BINARY-SEARCH-VECTOR-INT", 8, 0, false );
    SubLFiles.declareFunction( me, "test_bytes_to_64_bit_chars_once", "TEST-BYTES-TO-64-BIT-CHARS-ONCE", 3, 0, false );
    SubLFiles.declareFunction( me, "test_64_bit_chars_to_bytes_once", "TEST-64-BIT-CHARS-TO-BYTES-ONCE", 4, 0, false );
    SubLFiles.declareFunction( me, "test_bytes_to_64_bit_chars", "TEST-BYTES-TO-64-BIT-CHARS", 0, 1, false );
    SubLFiles.declareFunction( me, "test_64_bit_chars_to_bytes", "TEST-64-BIT-CHARS-TO-BYTES", 0, 1, false );
    return NIL;
  }

  public static SubLObject init_vector_utilities_file()
  {
    return NIL;
  }

  public static SubLObject setup_vector_utilities_file()
  {
    access_macros.define_obsolete_register( $sym4$CLEAR_VECTOR, $list5 );
    generic_testing.define_test_case_table_int( $sym21$64_BIT_STRING_TUPLES_LENGTH, ConsesLow.list( new SubLObject[] { $kw22$TEST, NIL, $kw23$OWNER, NIL, $kw24$CLASSES, NIL, $kw25$KB, $kw26$TINY, $kw27$WORKING_, T
    } ), $list28 );
    generic_testing.define_test_case_table_int( $sym29$64_BIT_STRING_BYTE_VECTOR_LENGTH, ConsesLow.list( new SubLObject[] { $kw22$TEST, NIL, $kw23$OWNER, NIL, $kw24$CLASSES, NIL, $kw25$KB, $kw26$TINY, $kw27$WORKING_, T
    } ), $list30 );
    generic_testing.define_test_case_table_int( $sym31$TEST_BINARY_SEARCH_VECTOR_SUBRANGE_W_DUPLICATES, ConsesLow.list( new SubLObject[] { $kw22$TEST, NIL, $kw23$OWNER, NIL, $kw24$CLASSES, NIL, $kw25$KB, $kw26$TINY,
      $kw27$WORKING_, T
    } ), $list32 );
    generic_testing.define_test_case_table_int( $sym33$TEST_BINARY_SEARCH_VECTOR_SUBRANGE_W_DUPLICATE_STRUCTURES, ConsesLow.list( new SubLObject[] { $kw22$TEST, NIL, $kw23$OWNER, NIL, $kw24$CLASSES, NIL, $kw25$KB,
      $kw26$TINY, $kw27$WORKING_, T
    } ), $list34 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_vector_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_vector_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_vector_utilities_file();
  }
  static
  {
    me = new vector_utilities();
    $sym0$VECTORP = makeSymbol( "VECTORP" );
    $sym1$INTEGERP = makeSymbol( "INTEGERP" );
    $sym2$PROPER_LIST_P = makeSymbol( "PROPER-LIST-P" );
    $sym3$VECTOR = makeSymbol( "VECTOR" );
    $sym4$CLEAR_VECTOR = makeSymbol( "CLEAR-VECTOR" );
    $list5 = ConsesLow.list( makeSymbol( "RESET-VECTOR" ) );
    $sym6$TRUE = makeSymbol( "TRUE" );
    $sym7$SEQUENCEP = makeSymbol( "SEQUENCEP" );
    $sym8$POSITIVE_INTEGER_P = makeSymbol( "POSITIVE-INTEGER-P" );
    $int9$500 = makeInteger( 500 );
    $sym10$NON_NEGATIVE_INTEGER_P = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $int11$100000 = makeInteger( 100000 );
    $sym12$STRINGP = makeSymbol( "STRINGP" );
    $kw13$INPUT = makeKeyword( "INPUT" );
    $str14$Unable_to_open__S = makeString( "Unable to open ~S" );
    $sym15$BYTE_VECTOR_P = makeSymbol( "BYTE-VECTOR-P" );
    $int16$32 = makeInteger( 32 );
    $str17$Did_not_fill_up_all_the_expected_ = makeString( "Did not fill up all the expected characters of the hex string: ~s != ~s~%" );
    $sym18$HEX_CHAR_STRING_P = makeSymbol( "HEX-CHAR-STRING-P" );
    $sym19$EVENP = makeSymbol( "EVENP" );
    $sym20$64_BIT_STRING_P = makeSymbol( "64-BIT-STRING-P" );
    $sym21$64_BIT_STRING_TUPLES_LENGTH = makeSymbol( "64-BIT-STRING-TUPLES-LENGTH" );
    $kw22$TEST = makeKeyword( "TEST" );
    $kw23$OWNER = makeKeyword( "OWNER" );
    $kw24$CLASSES = makeKeyword( "CLASSES" );
    $kw25$KB = makeKeyword( "KB" );
    $kw26$TINY = makeKeyword( "TINY" );
    $kw27$WORKING_ = makeKeyword( "WORKING?" );
    $list28 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "" ) ), ZERO_INTEGER ), ConsesLow.list( ConsesLow.list( makeString( "AA" ) ), ONE_INTEGER ), ConsesLow.list( ConsesLow.list( makeString(
        "AAA" ) ), ONE_INTEGER ), ConsesLow.list( ConsesLow.list( makeString( "AA==" ) ), ONE_INTEGER ), ConsesLow.list( ConsesLow.list( makeString( "AAA=" ) ), ONE_INTEGER ), ConsesLow.list( ConsesLow.list( makeString(
            "AAAA" ) ), ONE_INTEGER ), ConsesLow.list( ConsesLow.list( makeString( "AAAAAA" ) ), TWO_INTEGER ), ConsesLow.list( ConsesLow.list( makeString( "AAAAAA==" ) ), TWO_INTEGER ) );
    $sym29$64_BIT_STRING_BYTE_VECTOR_LENGTH = makeSymbol( "64-BIT-STRING-BYTE-VECTOR-LENGTH" );
    $list30 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "" ) ), ZERO_INTEGER ), ConsesLow.list( ConsesLow.list( makeString( "AA" ) ), ONE_INTEGER ), ConsesLow.list( ConsesLow.list( makeString(
        "AA==" ) ), ONE_INTEGER ), ConsesLow.list( ConsesLow.list( makeString( "AAA" ) ), TWO_INTEGER ), ConsesLow.list( ConsesLow.list( makeString( "AAA=" ) ), TWO_INTEGER ), ConsesLow.list( ConsesLow.list( makeString(
            "AAAA" ) ), THREE_INTEGER ), ConsesLow.list( ConsesLow.list( makeString( "AAAAAA" ) ), FOUR_INTEGER ), ConsesLow.list( ConsesLow.list( makeString( "AAAAAA==" ) ), FOUR_INTEGER ) );
    $sym31$TEST_BINARY_SEARCH_VECTOR_SUBRANGE_W_DUPLICATES = makeSymbol( "TEST-BINARY-SEARCH-VECTOR-SUBRANGE-W/DUPLICATES" );
    $list32 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ZERO_INTEGER, Vectors.vector( new SubLObject[] { ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, THREE_INTEGER, THREE_INTEGER, FOUR_INTEGER
    } ), ZERO_INTEGER, SIX_INTEGER, makeSymbol( "<" ) ), ConsesLow.list( MINUS_ONE_INTEGER, ZERO_INTEGER, NIL ) ), ConsesLow.list( ConsesLow.list( ONE_INTEGER, Vectors.vector( new SubLObject[] { ONE_INTEGER, TWO_INTEGER,
      THREE_INTEGER, THREE_INTEGER, THREE_INTEGER, FOUR_INTEGER
    } ), ZERO_INTEGER, SIX_INTEGER, makeSymbol( "<" ) ), ConsesLow.list( ZERO_INTEGER, ZERO_INTEGER, T ) ), ConsesLow.list( ConsesLow.list( makeDouble( 1.2 ), Vectors.vector( new SubLObject[] { ONE_INTEGER, TWO_INTEGER,
      THREE_INTEGER, THREE_INTEGER, THREE_INTEGER, FOUR_INTEGER
    } ), ZERO_INTEGER, SIX_INTEGER, makeSymbol( "<" ) ), ConsesLow.list( ZERO_INTEGER, ONE_INTEGER, NIL ) ), ConsesLow.list( ConsesLow.list( TWO_INTEGER, Vectors.vector( new SubLObject[] { ONE_INTEGER, TWO_INTEGER,
      THREE_INTEGER, THREE_INTEGER, THREE_INTEGER, FOUR_INTEGER
    } ), ZERO_INTEGER, SIX_INTEGER, makeSymbol( "<" ) ), ConsesLow.list( ONE_INTEGER, ONE_INTEGER, T ) ), ConsesLow.list( ConsesLow.list( THREE_INTEGER, Vectors.vector( new SubLObject[] { ONE_INTEGER, TWO_INTEGER,
      THREE_INTEGER, THREE_INTEGER, THREE_INTEGER, FOUR_INTEGER
    } ), ZERO_INTEGER, SIX_INTEGER, makeSymbol( "<" ) ), ConsesLow.list( TWO_INTEGER, FOUR_INTEGER, T ) ), ConsesLow.list( ConsesLow.list( FOUR_INTEGER, Vectors.vector( new SubLObject[] { ONE_INTEGER, TWO_INTEGER,
      THREE_INTEGER, THREE_INTEGER, THREE_INTEGER, FOUR_INTEGER
    } ), ZERO_INTEGER, SIX_INTEGER, makeSymbol( "<" ) ), ConsesLow.list( FIVE_INTEGER, FIVE_INTEGER, T ) ), ConsesLow.list( ConsesLow.list( FIVE_INTEGER, Vectors.vector( new SubLObject[] { ONE_INTEGER, TWO_INTEGER,
      THREE_INTEGER, THREE_INTEGER, THREE_INTEGER, FOUR_INTEGER
    } ), ZERO_INTEGER, SIX_INTEGER, makeSymbol( "<" ) ), ConsesLow.list( SIX_INTEGER, SEVEN_INTEGER, NIL ) ) );
    $sym33$TEST_BINARY_SEARCH_VECTOR_SUBRANGE_W_DUPLICATE_STRUCTURES = makeSymbol( "TEST-BINARY-SEARCH-VECTOR-SUBRANGE-W/DUPLICATE-STRUCTURES" );
    $list34 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ZERO_INTEGER, Vectors.vector( new SubLObject[] { ConsesLow.list( ONE_INTEGER ), ConsesLow.list( TWO_INTEGER ), ConsesLow.list( THREE_INTEGER ), ConsesLow
        .list( THREE_INTEGER ), ConsesLow.list( THREE_INTEGER ), ConsesLow.list( FOUR_INTEGER )
    } ), ZERO_INTEGER, SIX_INTEGER, makeSymbol( "<" ), makeSymbol( "FIRST" ) ), ConsesLow.list( MINUS_ONE_INTEGER, ZERO_INTEGER, NIL ) ), ConsesLow.list( ConsesLow.list( ONE_INTEGER, Vectors.vector( new SubLObject[] {
      ConsesLow.list( ONE_INTEGER ), ConsesLow.list( TWO_INTEGER ), ConsesLow.list( THREE_INTEGER ), ConsesLow.list( THREE_INTEGER ), ConsesLow.list( THREE_INTEGER ), ConsesLow.list( FOUR_INTEGER )
    } ), ZERO_INTEGER, SIX_INTEGER, makeSymbol( "<" ), makeSymbol( "FIRST" ) ), ConsesLow.list( ZERO_INTEGER, ZERO_INTEGER, T ) ), ConsesLow.list( ConsesLow.list( TWO_INTEGER, Vectors.vector( new SubLObject[] { ConsesLow
        .list( ONE_INTEGER ), ConsesLow.list( TWO_INTEGER ), ConsesLow.list( THREE_INTEGER ), ConsesLow.list( THREE_INTEGER ), ConsesLow.list( THREE_INTEGER ), ConsesLow.list( FOUR_INTEGER )
    } ), ZERO_INTEGER, SIX_INTEGER, makeSymbol( "<" ), makeSymbol( "FIRST" ) ), ConsesLow.list( ONE_INTEGER, ONE_INTEGER, T ) ), ConsesLow.list( ConsesLow.list( makeDouble( 2.6 ), Vectors.vector( new SubLObject[] {
      ConsesLow.list( ONE_INTEGER ), ConsesLow.list( TWO_INTEGER ), ConsesLow.list( THREE_INTEGER ), ConsesLow.list( THREE_INTEGER ), ConsesLow.list( THREE_INTEGER ), ConsesLow.list( FOUR_INTEGER )
    } ), ZERO_INTEGER, SIX_INTEGER, makeSymbol( "<" ), makeSymbol( "FIRST" ) ), ConsesLow.list( ONE_INTEGER, TWO_INTEGER, NIL ) ), ConsesLow.list( ConsesLow.list( THREE_INTEGER, Vectors.vector( new SubLObject[] {
      ConsesLow.list( ONE_INTEGER ), ConsesLow.list( TWO_INTEGER ), ConsesLow.list( THREE_INTEGER ), ConsesLow.list( THREE_INTEGER ), ConsesLow.list( THREE_INTEGER ), ConsesLow.list( FOUR_INTEGER )
    } ), ZERO_INTEGER, SIX_INTEGER, makeSymbol( "<" ), makeSymbol( "FIRST" ) ), ConsesLow.list( TWO_INTEGER, FOUR_INTEGER, T ) ) );
    $str35$Failure_on__S__S__S = makeString( "Failure on ~S ~S ~S" );
    $str36$Failure_on__S__S__S__S = makeString( "Failure on ~S ~S ~S ~S" );
    $str37$cdotimes = makeString( "cdotimes" );
    $int38$256 = makeInteger( 256 );
  }
}
/*
 * 
 * Total time: 426 ms
 * 
 */