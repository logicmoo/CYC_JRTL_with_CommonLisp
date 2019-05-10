package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class matrix_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.matrix_utilities";
  public static final String myFingerPrint = "f3cb86c084b70ca6be5ca0252a85902baac50a0c30b2b24a22403d6f1da1465d";
  private static final SubLSymbol $sym0$MATRIX_P;
  private static final SubLString $str1$__;
  private static final SubLString $str2$__;
  private static final SubLString $str3$___;
  private static final SubLString $str4$___;
  private static final SubLSymbol $sym5$NON_NEGATIVE_INTEGER_P;
  private static final SubLString $str6$Row_index__A_is_out_of_bounds;
  private static final SubLString $str7$Column_index__A_is_out_of_bounds;
  private static final SubLString $str8$In_method_swap_rows__index__A_out;
  private static final SubLSymbol $sym9$MATRIX_OF_INTEGER_OR_FRACTION_P;
  private static final SubLSymbol $sym10$TRIANGULAR_MATRIX_OF_INTEGER_OR_FRACTION_P;

  @SubLTranslatedFile.SubL(source = "cycl/matrix-utilities.lisp", position = 643L)
  public static SubLObject matrix_of_integer_or_fraction_p(final SubLObject v_object)
  {
    if( NIL == list_utilities.non_dotted_list_p( v_object ) )
    {
      return NIL;
    }
    final SubLObject first_row = v_object.first();
    if( NIL != fraction_utilities.list_of_integer_or_fraction_p( first_row ) )
    {
      final SubLObject num_cols = Sequences.length( first_row );
      SubLObject cdolist_list_var = v_object.rest();
      SubLObject row = NIL;
      row = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == fraction_utilities.list_of_integer_or_fraction_p( row ) )
        {
          return NIL;
        }
        if( NIL == list_utilities.lengthE( row, num_cols, UNPROVIDED ) )
        {
          return NIL;
        }
        cdolist_list_var = cdolist_list_var.rest();
        row = cdolist_list_var.first();
      }
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/matrix-utilities.lisp", position = 1335L)
  public static SubLObject matrix_p(final SubLObject v_object)
  {
    return matrix_of_integer_or_fraction_p( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/matrix-utilities.lisp", position = 1712L)
  public static SubLObject triangular_matrix_of_integer_or_fraction_p(final SubLObject v_object)
  {
    if( NIL == matrix_of_integer_or_fraction_p( v_object ) )
    {
      return NIL;
    }
    final SubLObject num_rows = matrix_row_count( v_object );
    final SubLObject num_cols = matrix_column_count( v_object );
    if( !num_cols.numE( Numbers.add( num_rows, ONE_INTEGER ) ) )
    {
      return NIL;
    }
    SubLObject list_var = NIL;
    SubLObject row = NIL;
    SubLObject index = NIL;
    list_var = v_object;
    row = list_var.first();
    for( index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), row = list_var.first(), index = Numbers.add( ONE_INTEGER, index ) )
    {
      SubLObject index_prime;
      for( index_prime = NIL, index_prime = ZERO_INTEGER; index_prime.numL( index ); index_prime = Numbers.add( index_prime, ONE_INTEGER ) )
      {
        if( NIL == fraction_utilities.fractionE( ZERO_INTEGER, ConsesLow.nth( index_prime, row ) ) )
        {
          return NIL;
        }
      }
      if( NIL != fraction_utilities.fractionE( ZERO_INTEGER, ConsesLow.nth( index, row ) ) )
      {
        return NIL;
      }
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/matrix-utilities.lisp", position = 2346L)
  public static SubLObject new_matrix(final SubLObject list_of_lists)
  {
    assert NIL != matrix_p( list_of_lists ) : list_of_lists;
    return list_of_lists;
  }

  @SubLTranslatedFile.SubL(source = "cycl/matrix-utilities.lisp", position = 2450L)
  public static SubLObject print_matrix(final SubLObject matrix, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    assert NIL != matrix_p( matrix ) : matrix;
    PrintLow.format( stream, $str1$__ );
    SubLObject cdolist_list_var = matrix;
    SubLObject row = NIL;
    row = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      print_high.princ( $str2$__, stream );
      SubLObject cdolist_list_var_$1 = row;
      SubLObject value = NIL;
      value = cdolist_list_var_$1.first();
      while ( NIL != cdolist_list_var_$1)
      {
        print_high.princ( value, stream );
        print_high.princ( $str3$___, stream );
        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
        value = cdolist_list_var_$1.first();
      }
      PrintLow.format( stream, $str4$___ );
      cdolist_list_var = cdolist_list_var.rest();
      row = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/matrix-utilities.lisp", position = 2810L)
  public static SubLObject copy_matrix(final SubLObject matrix)
  {
    assert NIL != matrix_p( matrix ) : matrix;
    return conses_high.copy_tree( matrix );
  }

  @SubLTranslatedFile.SubL(source = "cycl/matrix-utilities.lisp", position = 2906L)
  public static SubLObject matrix_row_count(final SubLObject matrix)
  {
    assert NIL != matrix_p( matrix ) : matrix;
    return Sequences.length( matrix );
  }

  @SubLTranslatedFile.SubL(source = "cycl/matrix-utilities.lisp", position = 3083L)
  public static SubLObject matrix_column_count(final SubLObject matrix)
  {
    assert NIL != matrix_p( matrix ) : matrix;
    return Sequences.length( matrix.first() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/matrix-utilities.lisp", position = 3274L)
  public static SubLObject matrix_ij(final SubLObject matrix, final SubLObject i, final SubLObject j)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != matrix_p( matrix ) : matrix;
    assert NIL != subl_promotions.non_negative_integer_p( i ) : i;
    assert NIL != subl_promotions.non_negative_integer_p( j ) : j;
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !i.numL( matrix_row_count( matrix ) ) )
    {
      Errors.error( $str6$Row_index__A_is_out_of_bounds, i );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !j.numL( matrix_column_count( matrix ) ) )
    {
      Errors.error( $str7$Column_index__A_is_out_of_bounds, j );
    }
    return ConsesLow.nth( j, ConsesLow.nth( i, matrix ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/matrix-utilities.lisp", position = 3849L)
  public static SubLObject swap_rows(final SubLObject matrix, final SubLObject row1, final SubLObject row2)
  {
    return swap_rows_internal( matrix, row1, row2, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/matrix-utilities.lisp", position = 4134L)
  public static SubLObject nswap_rows(final SubLObject matrix, final SubLObject row1, final SubLObject row2)
  {
    return swap_rows_internal( matrix, row1, row2, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/matrix-utilities.lisp", position = 4430L)
  public static SubLObject swap_rows_internal(final SubLObject matrix, final SubLObject row1, final SubLObject row2, final SubLObject destructiveP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != matrix_p( matrix ) : matrix;
    assert NIL != subl_promotions.non_negative_integer_p( row1 ) : row1;
    assert NIL != subl_promotions.non_negative_integer_p( row2 ) : row2;
    final SubLObject num_rows = matrix_row_count( matrix );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !row1.numL( num_rows ) )
    {
      Errors.error( $str8$In_method_swap_rows__index__A_out, row1 );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !row2.numL( num_rows ) )
    {
      Errors.error( $str8$In_method_swap_rows__index__A_out, row2 );
    }
    final SubLObject new_matrix = ( NIL != destructiveP ) ? matrix : copy_matrix( matrix );
    ConsesLow.set_nth( row1, new_matrix, ConsesLow.nth( row2, matrix ) );
    ConsesLow.set_nth( row2, new_matrix, ConsesLow.nth( row1, matrix ) );
    return new_matrix;
  }

  @SubLTranslatedFile.SubL(source = "cycl/matrix-utilities.lisp", position = 5045L)
  public static SubLObject solve_triangular_matrix(final SubLObject matrix)
  {
    assert NIL != matrix_of_integer_or_fraction_p( matrix ) : matrix;
    final SubLObject clean_matrix = remove_allzero_rows( matrix );
    assert NIL != triangular_matrix_of_integer_or_fraction_p( clean_matrix ) : clean_matrix;
    final SubLObject reverse_matrix = Sequences.nreverse( clean_matrix );
    SubLObject solution = NIL;
    SubLObject cdolist_list_var = reverse_matrix;
    SubLObject row = NIL;
    row = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      row = remove_extraneous_zeroes( row );
      solution = ConsesLow.cons( solve_row( row, solution ), solution );
      cdolist_list_var = cdolist_list_var.rest();
      row = cdolist_list_var.first();
    }
    return solution;
  }

  @SubLTranslatedFile.SubL(source = "cycl/matrix-utilities.lisp", position = 5962L)
  public static SubLObject remove_allzero_rows(final SubLObject matrix)
  {
    SubLObject new_matrix = copy_matrix( matrix );
    SubLObject list_var = NIL;
    SubLObject row = NIL;
    SubLObject index = NIL;
    list_var = Sequences.reverse( new_matrix );
    row = list_var.first();
    for( index = number_utilities.f_1_( Sequences.length( new_matrix ) ); NIL != list_var; list_var = list_var.rest(), row = list_var.first(), index = number_utilities.f_1_( index ) )
    {
      if( NIL != allzero_row_p( row ) )
      {
        new_matrix = list_utilities.delete_nth( index, new_matrix );
      }
    }
    return new_matrix;
  }

  @SubLTranslatedFile.SubL(source = "cycl/matrix-utilities.lisp", position = 6247L)
  public static SubLObject allzero_row_p(final SubLObject row)
  {
    SubLObject cdolist_list_var = row;
    SubLObject element = NIL;
    element = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == fraction_utilities.fractionE( ZERO_INTEGER, element ) )
      {
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      element = cdolist_list_var.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/matrix-utilities.lisp", position = 6386L)
  public static SubLObject remove_extraneous_zeroes(SubLObject row)
  {
    while ( NIL != fraction_utilities.fractionE( ZERO_INTEGER, row.first() ))
    {
      row = row.rest();
    }
    return row;
  }

  @SubLTranslatedFile.SubL(source = "cycl/matrix-utilities.lisp", position = 6510L)
  public static SubLObject solve_row(final SubLObject row, final SubLObject partial_solution)
  {
    SubLObject result = conses_high.last( row, UNPROVIDED ).first();
    SubLObject solved_vars = NIL;
    SubLObject solutions = NIL;
    solved_vars = conses_high.butlast( row, UNPROVIDED ).rest();
    for( solutions = partial_solution; NIL != solutions; solutions = solutions.rest() )
    {
      result = fraction_utilities.fraction_minus( result, fraction_utilities.fraction_times2( solutions.first(), solved_vars.first() ) );
      solved_vars = solved_vars.rest();
    }
    result = fraction_utilities.fraction_divide( result, row.first() );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/matrix-utilities.lisp", position = 6915L)
  public static SubLObject gaussian_elimination(final SubLObject matrix)
  {
    assert NIL != matrix_of_integer_or_fraction_p( matrix ) : matrix;
    final SubLObject num_rows = matrix_row_count( matrix );
    final SubLObject num_cols = matrix_column_count( matrix );
    SubLObject new_matrix = copy_matrix( matrix );
    SubLObject iterations;
    SubLObject column;
    SubLObject baseline;
    SubLObject row;
    SubLObject factor;
    SubLObject value;
    for( iterations = Numbers.subtract( Numbers.min( num_cols, num_rows ), ONE_INTEGER ), column = NIL, column = ZERO_INTEGER; column.numL( iterations ); column = Numbers.add( column, ONE_INTEGER ) )
    {
      baseline = column;
      while ( NIL != fraction_utilities.fractionE( ZERO_INTEGER, matrix_ij( new_matrix, baseline, column ) ))
      {
        baseline = number_utilities.f_1X( baseline );
        if( baseline.numGE( num_rows ) )
        {
          return NIL;
        }
      }
      if( baseline.numG( column ) )
      {
        new_matrix = swap_rows( new_matrix, column, baseline );
      }
      for( row = NIL, row = Numbers.add( column, ONE_INTEGER ); !row.numGE( num_rows ); row = Numbers.add( row, ONE_INTEGER ) )
      {
        factor = fraction_utilities.fraction_divide( matrix_ij( new_matrix, row, column ), matrix_ij( new_matrix, column, column ) );
        for( value = NIL, value = ZERO_INTEGER; value.numL( num_cols ); value = Numbers.add( value, ONE_INTEGER ) )
        {
          ConsesLow.set_nth( value, ConsesLow.nth( row, new_matrix ), fraction_utilities.fraction_minus( matrix_ij( new_matrix, row, value ), fraction_utilities.fraction_times2( matrix_ij( new_matrix, column, value ),
              factor ) ) );
        }
      }
    }
    return new_matrix;
  }

  public static SubLObject declare_matrix_utilities_file()
  {
    SubLFiles.declareFunction( me, "matrix_of_integer_or_fraction_p", "MATRIX-OF-INTEGER-OR-FRACTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "matrix_p", "MATRIX-P", 1, 0, false );
    SubLFiles.declareFunction( me, "triangular_matrix_of_integer_or_fraction_p", "TRIANGULAR-MATRIX-OF-INTEGER-OR-FRACTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_matrix", "NEW-MATRIX", 1, 0, false );
    SubLFiles.declareFunction( me, "print_matrix", "PRINT-MATRIX", 1, 1, false );
    SubLFiles.declareFunction( me, "copy_matrix", "COPY-MATRIX", 1, 0, false );
    SubLFiles.declareFunction( me, "matrix_row_count", "MATRIX-ROW-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "matrix_column_count", "MATRIX-COLUMN-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "matrix_ij", "MATRIX-IJ", 3, 0, false );
    SubLFiles.declareFunction( me, "swap_rows", "SWAP-ROWS", 3, 0, false );
    SubLFiles.declareFunction( me, "nswap_rows", "NSWAP-ROWS", 3, 0, false );
    SubLFiles.declareFunction( me, "swap_rows_internal", "SWAP-ROWS-INTERNAL", 4, 0, false );
    SubLFiles.declareFunction( me, "solve_triangular_matrix", "SOLVE-TRIANGULAR-MATRIX", 1, 0, false );
    SubLFiles.declareFunction( me, "remove_allzero_rows", "REMOVE-ALLZERO-ROWS", 1, 0, false );
    SubLFiles.declareFunction( me, "allzero_row_p", "ALLZERO-ROW-P", 1, 0, false );
    SubLFiles.declareFunction( me, "remove_extraneous_zeroes", "REMOVE-EXTRANEOUS-ZEROES", 1, 0, false );
    SubLFiles.declareFunction( me, "solve_row", "SOLVE-ROW", 2, 0, false );
    SubLFiles.declareFunction( me, "gaussian_elimination", "GAUSSIAN-ELIMINATION", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_matrix_utilities_file()
  {
    return NIL;
  }

  public static SubLObject setup_matrix_utilities_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_matrix_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_matrix_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_matrix_utilities_file();
  }
  static
  {
    me = new matrix_utilities();
    $sym0$MATRIX_P = makeSymbol( "MATRIX-P" );
    $str1$__ = makeString( "~%" );
    $str2$__ = makeString( "| " );
    $str3$___ = makeString( "   " );
    $str4$___ = makeString( "|~%" );
    $sym5$NON_NEGATIVE_INTEGER_P = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $str6$Row_index__A_is_out_of_bounds = makeString( "Row-index ~A is out of bounds" );
    $str7$Column_index__A_is_out_of_bounds = makeString( "Column-index ~A is out of bounds" );
    $str8$In_method_swap_rows__index__A_out = makeString( "In method swap-rows: index ~A out of bounds" );
    $sym9$MATRIX_OF_INTEGER_OR_FRACTION_P = makeSymbol( "MATRIX-OF-INTEGER-OR-FRACTION-P" );
    $sym10$TRIANGULAR_MATRIX_OF_INTEGER_OR_FRACTION_P = makeSymbol( "TRIANGULAR-MATRIX-OF-INTEGER-OR-FRACTION-P" );
  }
}
/*
 * 
 * Total time: 86 ms
 * 
 */