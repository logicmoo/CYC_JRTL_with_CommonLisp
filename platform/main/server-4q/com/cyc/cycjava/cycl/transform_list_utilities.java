package com.cyc.cycjava.cycl;

import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class transform_list_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.transform_list_utilities";
  public static final String myFingerPrint = "95fe18de60efcdccdff48ce22c0909ded4a962986a339d6d8c3580d874f81114";
  @SubLTranslatedFile.SubL(source = "cycl/transform-list-utilities.lisp", position = 1490L)
  public static SubLSymbol $default_recursion_limit$;
  @SubLTranslatedFile.SubL(source = "cycl/transform-list-utilities.lisp", position = 1546L)
  public static SubLSymbol $default_transformation_max$;
  @SubLTranslatedFile.SubL(source = "cycl/transform-list-utilities.lisp", position = 1601L)
  public static SubLSymbol $default_quiescent_transformation_max$;
  private static final SubLInteger $int0$212;
  private static final SubLInteger $int1$1024;
  private static final SubLSymbol $sym2$TRANSFORM;
  private static final SubLSymbol $sym3$NTRANSFORM;
  private static final SubLSymbol $kw4$TRANSFORMATION_LIMIT_EXCEEDED;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$CAR;
  private static final SubLSymbol $sym7$CADR;
  private static final SubLSymbol $sym8$CDDR;
  private static final SubLList $list9;
  private static final SubLSymbol $sym10$RPLACA;
  private static final SubLList $list11;
  private static final SubLSymbol $sym12$CDR;
  private static final SubLList $list13;
  private static final SubLSymbol $sym14$RPLACD;
  private static final SubLSymbol $sym15$QUIESCENT_TRANSFORM;
  private static final SubLSymbol $sym16$QUIESCENT_NTRANSFORM;
  private static final SubLInteger $int17$1000;
  private static final SubLSymbol $kw18$ERROR;
  private static final SubLSymbol $kw19$TIMEOUT;
  private static final SubLSymbol $sym20$TEST_TRANSFORM;
  private static final SubLSymbol $kw21$TEST;
  private static final SubLSymbol $kw22$OWNER;
  private static final SubLSymbol $kw23$CLASSES;
  private static final SubLSymbol $kw24$KB;
  private static final SubLSymbol $kw25$TINY;
  private static final SubLSymbol $kw26$WORKING_;
  private static final SubLList $list27;

  @SubLTranslatedFile.SubL(source = "cycl/transform-list-utilities.lisp", position = 1667L)
  public static SubLObject transform_pred_funcall(final SubLObject pred, final SubLObject v_object)
  {
    return eval_in_api.possibly_cyc_api_funcall_1( pred, v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/transform-list-utilities.lisp", position = 1829L)
  public static SubLObject transform_key_funcall(final SubLObject key, final SubLObject v_object)
  {
    return eval_in_api.possibly_cyc_api_funcall_1( key, v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/transform-list-utilities.lisp", position = 1930L)
  public static SubLObject transform_transform_funcall(final SubLObject transform, final SubLObject v_object)
  {
    return eval_in_api.possibly_cyc_api_funcall_1( transform, v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/transform-list-utilities.lisp", position = 2049L)
  public static SubLObject transform_quiescence_funcall(final SubLObject quiescence, final SubLObject previous, final SubLObject v_new)
  {
    return eval_in_api.possibly_cyc_api_funcall_2( quiescence, previous, v_new );
  }

  @SubLTranslatedFile.SubL(source = "cycl/transform-list-utilities.lisp", position = 2183L)
  public static SubLObject transform(final SubLObject v_object, final SubLObject pred, final SubLObject transform, SubLObject key)
  {
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    return ntransform( conses_high.copy_tree( v_object ), pred, transform, key, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/transform-list-utilities.lisp", position = 2728L)
  public static SubLObject ntransform(final SubLObject v_object, final SubLObject pred, final SubLObject transform, SubLObject key, SubLObject recursion_limit, SubLObject transformation_max)
  {
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    if( recursion_limit == UNPROVIDED )
    {
      recursion_limit = $default_recursion_limit$.getDynamicValue();
    }
    if( transformation_max == UNPROVIDED )
    {
      transformation_max = $default_transformation_max$.getDynamicValue();
    }
    return ( NIL != transformation_max ) ? shy_ntransform_recursive( v_object, pred, transform, key, recursion_limit, ZERO_INTEGER, transformation_max, ZERO_INTEGER )
        : ntransform_recursive( v_object, pred, transform, key, recursion_limit, ZERO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/transform-list-utilities.lisp", position = 3986L)
  public static SubLObject ntransform_recursive(final SubLObject v_object, final SubLObject pred, final SubLObject transform, final SubLObject key, final SubLObject recursion_limit, final SubLObject recursion_level)
  {
    if( recursion_level.numGE( recursion_limit ) )
    {
      return ntransform_iterative( v_object, pred, transform, key );
    }
    SubLObject transformed_list_tail;
    SubLObject initial_transformed_object;
    for( initial_transformed_object = ( transformed_list_tail = ntransform_perform_transform( v_object, pred, transform, key ) ); !transformed_list_tail.isAtom(); transformed_list_tail = transformed_list_tail.rest() )
    {
      ConsesLow.rplaca( transformed_list_tail, ntransform_recursive( transformed_list_tail.first(), pred, transform, key, recursion_limit, Numbers.add( recursion_level, ONE_INTEGER ) ) );
      ConsesLow.rplacd( transformed_list_tail, ntransform_perform_transform( transformed_list_tail.rest(), pred, transform, key ) );
    }
    return initial_transformed_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/transform-list-utilities.lisp", position = 6182L)
  public static SubLObject shy_ntransform_recursive(final SubLObject v_object, final SubLObject pred, final SubLObject transform, final SubLObject key, final SubLObject recursion_limit, final SubLObject recursion_level,
      final SubLObject transformation_max, final SubLObject transformation_count)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( recursion_level.numGE( recursion_limit ) )
    {
      return shy_ntransform_iterative( v_object, pred, transform, key, transformation_max, transformation_count );
    }
    thread.resetMultipleValues();
    final SubLObject initial_transformed_object = shy_ntransform_perform_transform( v_object, pred, transform, key, transformation_max, transformation_count );
    SubLObject new_transformation_count = thread.secondMultipleValue();
    thread.resetMultipleValues();
    SubLObject transformed_list_tail = initial_transformed_object;
    SubLObject next_transformation = NIL;
    while ( !transformed_list_tail.isAtom())
    {
      thread.resetMultipleValues();
      final SubLObject next_transformation_$1 = shy_ntransform_recursive( transformed_list_tail.first(), pred, transform, key, recursion_limit, Numbers.add( recursion_level, ONE_INTEGER ), transformation_max,
          new_transformation_count );
      final SubLObject new_transformation_count_$2 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      next_transformation = next_transformation_$1;
      new_transformation_count = new_transformation_count_$2;
      ConsesLow.rplaca( transformed_list_tail, next_transformation );
      thread.resetMultipleValues();
      final SubLObject next_transformation_$2 = shy_ntransform_perform_transform( transformed_list_tail.rest(), pred, transform, key, transformation_max, new_transformation_count );
      final SubLObject new_transformation_count_$3 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      next_transformation = next_transformation_$2;
      new_transformation_count = new_transformation_count_$3;
      ConsesLow.rplacd( transformed_list_tail, next_transformation );
      transformed_list_tail = transformed_list_tail.rest();
    }
    return Values.values( initial_transformed_object, new_transformation_count );
  }

  @SubLTranslatedFile.SubL(source = "cycl/transform-list-utilities.lisp", position = 7909L)
  public static SubLObject ntransform_perform_transform(final SubLObject v_object, final SubLObject pred, final SubLObject transform, final SubLObject key)
  {
    if( key.eql( Symbols.symbol_function( IDENTITY ) ) || key.eql( IDENTITY ) )
    {
      SubLObject previous_transformation;
      SubLObject transformation;
      for( previous_transformation = v_object, transformation = NIL, transformation = ( ( NIL != transform_pred_funcall( pred, v_object ) ) ? conses_high.copy_tree( transform_transform_funcall( transform, v_object ) )
          : v_object ); !previous_transformation.eql( transformation ); previous_transformation = transformation, transformation = ( ( NIL != transform_pred_funcall( pred, transformation ) ) ? conses_high.copy_tree(
              transform_transform_funcall( transform, transformation ) ) : transformation ) )
      {
      }
      return transformation;
    }
    SubLObject previous_transformation;
    SubLObject transformation;
    for( previous_transformation = v_object, transformation = NIL, transformation = ( ( NIL != transform_pred_funcall( pred, v_object ) ) ? conses_high.copy_tree( transform_transform_funcall( transform,
        transform_key_funcall( key, v_object ) ) ) : v_object ); !previous_transformation.eql( transformation ); previous_transformation = transformation, transformation = ( ( NIL != transform_pred_funcall( pred,
            transformation ) ) ? conses_high.copy_tree( transform_transform_funcall( transform, transform_key_funcall( key, transformation ) ) ) : transformation ) )
    {
    }
    return transformation;
  }

  @SubLTranslatedFile.SubL(source = "cycl/transform-list-utilities.lisp", position = 9565L)
  public static SubLObject shy_ntransform_perform_transform(final SubLObject v_object, final SubLObject pred, final SubLObject transform, final SubLObject key, final SubLObject transformation_max,
      SubLObject transformation_count)
  {
    if( key.eql( Symbols.symbol_function( IDENTITY ) ) || key.eql( IDENTITY ) )
    {
      SubLObject previous_transformation;
      SubLObject transformation;
      for( previous_transformation = v_object, transformation = NIL, transformation = ( ( NIL != transform_pred_funcall( pred, v_object ) ) ? conses_high.copy_tree( transform_transform_funcall( transform, v_object ) )
          : v_object ); !previous_transformation.eql( transformation ); previous_transformation = transformation, transformation = ( ( NIL != transform_pred_funcall( pred, transformation ) ) ? conses_high.copy_tree(
              transform_transform_funcall( transform, transformation ) ) : transformation ) )
      {
        if( transformation_count.numGE( transformation_max ) )
        {
          Dynamic.sublisp_throw( $kw4$TRANSFORMATION_LIMIT_EXCEEDED, ConsesLow.list( $kw4$TRANSFORMATION_LIMIT_EXCEEDED, transformation_count, transformation_max ) );
        }
        transformation_count = Numbers.add( transformation_count, ONE_INTEGER );
      }
      return Values.values( transformation, transformation_count );
    }
    SubLObject previous_transformation;
    SubLObject transformation;
    for( previous_transformation = v_object, transformation = NIL, transformation = ( ( NIL != transform_pred_funcall( pred, v_object ) ) ? conses_high.copy_tree( transform_transform_funcall( transform,
        transform_key_funcall( key, v_object ) ) ) : v_object ); !previous_transformation.eql( transformation ); previous_transformation = transformation, transformation = ( ( NIL != transform_pred_funcall( pred,
            transformation ) ) ? conses_high.copy_tree( transform_transform_funcall( transform, transform_key_funcall( key, transformation ) ) ) : transformation ) )
    {
      if( transformation_count.numGE( transformation_max ) )
      {
        Dynamic.sublisp_throw( $kw4$TRANSFORMATION_LIMIT_EXCEEDED, ConsesLow.list( $kw4$TRANSFORMATION_LIMIT_EXCEEDED, transformation_count, transformation_max ) );
      }
      transformation_count = Numbers.add( transformation_count, ONE_INTEGER );
    }
    return Values.values( transformation, transformation_count );
  }

  @SubLTranslatedFile.SubL(source = "cycl/transform-list-utilities.lisp", position = 11425L)
  public static SubLObject make_ntransform_info(final SubLObject parent_cons, final SubLObject set_op, final SubLObject value)
  {
    return ConsesLow.listS( parent_cons, set_op, value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/transform-list-utilities.lisp", position = 11532L)
  public static SubLObject reuse_ntransform_info(final SubLObject info, final SubLObject parent_cons, final SubLObject set_op, final SubLObject value)
  {
    final SubLObject rest_of_info = info.rest();
    ConsesLow.rplaca( info, parent_cons );
    ConsesLow.rplaca( rest_of_info, set_op );
    ConsesLow.rplacd( rest_of_info, value );
    return info;
  }

  @SubLTranslatedFile.SubL(source = "cycl/transform-list-utilities.lisp", position = 11751L)
  public static SubLObject get_ntransform_info_parent_cons(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject ntransform_info = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    ntransform_info = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym6$CAR, ntransform_info );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list5 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/transform-list-utilities.lisp", position = 11851L)
  public static SubLObject get_ntransform_info_set_op(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject ntransform_info = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    ntransform_info = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym7$CADR, ntransform_info );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list5 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/transform-list-utilities.lisp", position = 11947L)
  public static SubLObject get_ntransform_info_value(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject ntransform_info = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    ntransform_info = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym8$CDDR, ntransform_info );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list5 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/transform-list-utilities.lisp", position = 12042L)
  public static SubLObject set_ntransform_info_parent_cons(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject ntransform_info = NIL;
    SubLObject new_parent_cons = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
    ntransform_info = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
    new_parent_cons = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym10$RPLACA, ntransform_info, new_parent_cons );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list9 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/transform-list-utilities.lisp", position = 12180L)
  public static SubLObject set_ntransform_info_set_op(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject ntransform_info = NIL;
    SubLObject new_set_op = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list11 );
    ntransform_info = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list11 );
    new_set_op = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym10$RPLACA, ConsesLow.list( $sym12$CDR, ntransform_info ), new_set_op );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list11 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/transform-list-utilities.lisp", position = 12309L)
  public static SubLObject set_ntransform_info_value(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject ntransform_info = NIL;
    SubLObject new_value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list13 );
    ntransform_info = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list13 );
    new_value = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym14$RPLACD, ConsesLow.list( $sym12$CDR, ntransform_info ), new_value );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list13 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/transform-list-utilities.lisp", position = 12435L)
  public static SubLObject ntransform_iterative(final SubLObject v_object, final SubLObject pred, final SubLObject transform, SubLObject key)
  {
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    SubLObject new_root = NIL;
    new_root = ntransform_perform_transform( v_object, pred, transform, key );
    if( new_root.isAtom() )
    {
      return new_root;
    }
    SubLObject parent_cons = NIL;
    SubLObject set_op = NIL;
    SubLObject value = NIL;
    SubLObject new_value = NIL;
    SubLObject old_cons = NIL;
    SubLObject queue = NIL;
    SubLObject current = NIL;
    queue = ConsesLow.list( make_ntransform_info( new_root, Symbols.symbol_function( $sym10$RPLACA ), new_root.first() ), make_ntransform_info( new_root, Symbols.symbol_function( $sym14$RPLACD ), new_root.rest() ) );
    current = queue.first();
    while ( NIL != queue)
    {
      old_cons = queue;
      queue = queue.rest();
      parent_cons = current.first();
      set_op = conses_high.cadr( current );
      value = conses_high.cddr( current );
      new_value = ntransform_perform_transform( value, pred, transform, key );
      Functions.funcall( set_op, parent_cons, new_value );
      if( !new_value.isAtom() )
      {
        queue = list_utilities.recons( make_ntransform_info( new_value, Symbols.symbol_function( $sym10$RPLACA ), new_value.first() ), ConsesLow.cons( reuse_ntransform_info( current, new_value, Symbols.symbol_function(
            $sym14$RPLACD ), new_value.rest() ), queue ), old_cons );
      }
      queue = queue;
      current = queue.first();
    }
    return new_root;
  }

  @SubLTranslatedFile.SubL(source = "cycl/transform-list-utilities.lisp", position = 14085L)
  public static SubLObject shy_ntransform_iterative(final SubLObject v_object, final SubLObject pred, final SubLObject transform, SubLObject key, SubLObject transformation_max, SubLObject transformation_count)
  {
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    if( transformation_max == UNPROVIDED )
    {
      transformation_max = $default_transformation_max$.getDynamicValue();
    }
    if( transformation_count == UNPROVIDED )
    {
      transformation_count = ZERO_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject new_root = shy_ntransform_perform_transform( v_object, pred, transform, key, transformation_max, transformation_count );
    SubLObject new_transformation_count = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( new_root.isAtom() )
    {
      return new_root;
    }
    SubLObject parent_cons = NIL;
    SubLObject set_op = NIL;
    SubLObject value = NIL;
    SubLObject new_value = NIL;
    SubLObject old_cons = NIL;
    SubLObject queue = NIL;
    SubLObject current = NIL;
    queue = ConsesLow.list( make_ntransform_info( new_root, Symbols.symbol_function( $sym10$RPLACA ), new_root.first() ), make_ntransform_info( new_root, Symbols.symbol_function( $sym14$RPLACD ), new_root.rest() ) );
    current = queue.first();
    while ( NIL != queue)
    {
      old_cons = queue;
      queue = queue.rest();
      parent_cons = current.first();
      set_op = conses_high.cadr( current );
      value = conses_high.cddr( current );
      thread.resetMultipleValues();
      final SubLObject new_value_$5 = shy_ntransform_perform_transform( value, pred, transform, key, transformation_max, new_transformation_count );
      final SubLObject new_transformation_count_$6 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      new_value = new_value_$5;
      new_transformation_count = new_transformation_count_$6;
      Functions.funcall( set_op, parent_cons, new_value );
      if( !new_value.isAtom() )
      {
        queue = list_utilities.recons( make_ntransform_info( new_value, Symbols.symbol_function( $sym10$RPLACA ), new_value.first() ), ConsesLow.cons( reuse_ntransform_info( current, new_value, Symbols.symbol_function(
            $sym14$RPLACD ), new_value.rest() ), queue ), old_cons );
      }
      queue = queue;
      current = queue.first();
    }
    return new_root;
  }

  @SubLTranslatedFile.SubL(source = "cycl/transform-list-utilities.lisp", position = 15762L)
  public static SubLObject quiescent_transform(final SubLObject v_object, final SubLObject pred, final SubLObject transform, SubLObject key, SubLObject quiescence)
  {
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    if( quiescence == UNPROVIDED )
    {
      quiescence = Symbols.symbol_function( EQUAL );
    }
    return quiescent_ntransform( conses_high.copy_tree( v_object ), pred, transform, key, quiescence, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/transform-list-utilities.lisp", position = 16049L)
  public static SubLObject quiescent_ntransform(final SubLObject v_object, final SubLObject pred, final SubLObject transform, SubLObject key, SubLObject quiescence, SubLObject recursion_limit,
      SubLObject transformation_max)
  {
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    if( quiescence == UNPROVIDED )
    {
      quiescence = Symbols.symbol_function( EQUAL );
    }
    if( recursion_limit == UNPROVIDED )
    {
      recursion_limit = $default_recursion_limit$.getDynamicValue();
    }
    if( transformation_max == UNPROVIDED )
    {
      transformation_max = $default_quiescent_transformation_max$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != transformation_max )
    {
      thread.resetMultipleValues();
      final SubLObject transformed_object = shy_quiescent_ntransform_recursive( v_object, pred, transform, key, quiescence, recursion_limit, ZERO_INTEGER, transformation_max, ZERO_INTEGER );
      final SubLObject transformation_count = thread.secondMultipleValue();
      thread.resetMultipleValues();
      return transformed_object;
    }
    return quiescent_ntransform_recursive( v_object, pred, transform, key, quiescence, recursion_limit, ZERO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/transform-list-utilities.lisp", position = 17842L)
  public static SubLObject quiescent_ntransform_recursive(final SubLObject v_object, final SubLObject pred, final SubLObject transform, final SubLObject key, final SubLObject quiescence, final SubLObject recursion_limit,
      final SubLObject recursion_level)
  {
    if( recursion_level.numGE( recursion_limit ) )
    {
      return quiescent_ntransform_iterative( v_object, pred, transform, key, quiescence );
    }
    SubLObject transformed_list_tail;
    SubLObject initial_transformed_object;
    for( initial_transformed_object = ( transformed_list_tail = ntransform_perform_quiescent_transform( v_object, pred, transform, key, quiescence ) ); !transformed_list_tail
        .isAtom(); transformed_list_tail = transformed_list_tail.rest() )
    {
      ConsesLow.rplaca( transformed_list_tail, quiescent_ntransform_recursive( transformed_list_tail.first(), pred, transform, key, quiescence, recursion_limit, Numbers.add( recursion_level, ONE_INTEGER ) ) );
      ConsesLow.rplacd( transformed_list_tail, ntransform_perform_quiescent_transform( transformed_list_tail.rest(), pred, transform, key, quiescence ) );
    }
    return initial_transformed_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/transform-list-utilities.lisp", position = 19749L)
  public static SubLObject shy_quiescent_ntransform_recursive(final SubLObject v_object, final SubLObject pred, final SubLObject transform, final SubLObject key, final SubLObject quiescence,
      final SubLObject recursion_limit, final SubLObject recursion_level, final SubLObject transformation_max, final SubLObject transformation_count)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( recursion_level.numGE( recursion_limit ) )
    {
      return shy_quiescent_ntransform_iterative( v_object, pred, transform, key, quiescence, transformation_max, transformation_count );
    }
    thread.resetMultipleValues();
    final SubLObject initial_transformed_object = shy_ntransform_perform_quiescent_transform( v_object, pred, transform, key, quiescence, transformation_max, transformation_count );
    SubLObject new_transformation_count = thread.secondMultipleValue();
    thread.resetMultipleValues();
    SubLObject transformed_list_tail = initial_transformed_object;
    SubLObject transformed_object = NIL;
    while ( !transformed_list_tail.isAtom())
    {
      thread.resetMultipleValues();
      final SubLObject transformed_object_$7 = shy_quiescent_ntransform_recursive( transformed_list_tail.first(), pred, transform, key, quiescence, recursion_limit, Numbers.add( recursion_level, ONE_INTEGER ),
          transformation_max, new_transformation_count );
      final SubLObject new_transformation_count_$8 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      transformed_object = transformed_object_$7;
      new_transformation_count = new_transformation_count_$8;
      ConsesLow.rplaca( transformed_list_tail, transformed_object );
      thread.resetMultipleValues();
      final SubLObject transformed_object_$8 = shy_ntransform_perform_quiescent_transform( transformed_list_tail.rest(), pred, transform, key, quiescence, transformation_max, new_transformation_count );
      final SubLObject new_transformation_count_$9 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      transformed_object = transformed_object_$8;
      new_transformation_count = new_transformation_count_$9;
      ConsesLow.rplacd( transformed_list_tail, transformed_object );
      transformed_list_tail = transformed_list_tail.rest();
    }
    return Values.values( initial_transformed_object, new_transformation_count );
  }

  @SubLTranslatedFile.SubL(source = "cycl/transform-list-utilities.lisp", position = 21351L)
  public static SubLObject quiescent_ntransform_iterative(final SubLObject v_object, final SubLObject pred, final SubLObject transform, SubLObject key, SubLObject quiescence)
  {
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    if( quiescence == UNPROVIDED )
    {
      quiescence = Symbols.symbol_function( EQUAL );
    }
    final SubLObject new_root = ntransform_perform_quiescent_transform( v_object, pred, transform, key, quiescence );
    if( new_root.isAtom() )
    {
      return new_root;
    }
    SubLObject parent_cons = NIL;
    SubLObject set_op = NIL;
    SubLObject value = NIL;
    SubLObject new_value = NIL;
    SubLObject old_cons = NIL;
    SubLObject queue = NIL;
    SubLObject current = NIL;
    queue = ConsesLow.list( make_ntransform_info( new_root, Symbols.symbol_function( $sym10$RPLACA ), new_root.first() ), make_ntransform_info( new_root, Symbols.symbol_function( $sym14$RPLACD ), new_root.rest() ) );
    current = queue.first();
    while ( NIL != queue)
    {
      old_cons = queue;
      queue = queue.rest();
      parent_cons = current.first();
      set_op = conses_high.cadr( current );
      value = conses_high.cddr( current );
      new_value = ntransform_perform_quiescent_transform( value, pred, transform, key, quiescence );
      Functions.funcall( set_op, parent_cons, new_value );
      if( !new_value.isAtom() )
      {
        queue = list_utilities.recons( make_ntransform_info( new_value, Symbols.symbol_function( $sym10$RPLACA ), new_value.first() ), ConsesLow.cons( reuse_ntransform_info( current, new_value, Symbols.symbol_function(
            $sym14$RPLACD ), new_value.rest() ), queue ), old_cons );
      }
      queue = queue;
      current = queue.first();
    }
    return new_root;
  }

  @SubLTranslatedFile.SubL(source = "cycl/transform-list-utilities.lisp", position = 22907L)
  public static SubLObject shy_quiescent_ntransform_iterative(final SubLObject v_object, final SubLObject pred, final SubLObject transform, SubLObject key, SubLObject quiescence, SubLObject transformation_max,
      SubLObject transformation_count)
  {
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    if( quiescence == UNPROVIDED )
    {
      quiescence = Symbols.symbol_function( EQUAL );
    }
    if( transformation_max == UNPROVIDED )
    {
      transformation_max = $default_quiescent_transformation_max$.getDynamicValue();
    }
    if( transformation_count == UNPROVIDED )
    {
      transformation_count = ZERO_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject new_root = shy_ntransform_perform_quiescent_transform( v_object, pred, transform, key, quiescence, transformation_max, transformation_count );
    SubLObject new_transformation_count = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( new_root.isAtom() )
    {
      return Values.values( new_root, new_transformation_count );
    }
    SubLObject parent_cons = NIL;
    SubLObject set_op = NIL;
    SubLObject value = NIL;
    SubLObject new_value = NIL;
    SubLObject old_cons = NIL;
    SubLObject queue = NIL;
    SubLObject current = NIL;
    queue = ConsesLow.list( make_ntransform_info( new_root, Symbols.symbol_function( $sym10$RPLACA ), new_root.first() ), make_ntransform_info( new_root, Symbols.symbol_function( $sym14$RPLACD ), new_root.rest() ) );
    current = queue.first();
    while ( NIL != queue)
    {
      old_cons = queue;
      queue = queue.rest();
      parent_cons = current.first();
      set_op = conses_high.cadr( current );
      value = conses_high.cddr( current );
      thread.resetMultipleValues();
      final SubLObject new_value_$11 = shy_ntransform_perform_quiescent_transform( value, pred, transform, key, quiescence, transformation_max, new_transformation_count );
      final SubLObject new_transformation_count_$12 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      new_value = new_value_$11;
      new_transformation_count = new_transformation_count_$12;
      Functions.funcall( set_op, parent_cons, new_value );
      if( !new_value.isAtom() )
      {
        queue = list_utilities.recons( make_ntransform_info( new_value, Symbols.symbol_function( $sym10$RPLACA ), new_value.first() ), ConsesLow.cons( reuse_ntransform_info( current, new_value, Symbols.symbol_function(
            $sym14$RPLACD ), new_value.rest() ), queue ), old_cons );
      }
      queue = queue;
      current = queue.first();
    }
    return new_root;
  }

  @SubLTranslatedFile.SubL(source = "cycl/transform-list-utilities.lisp", position = 24824L)
  public static SubLObject ntransform_perform_quiescent_transform(final SubLObject v_object, final SubLObject pred, final SubLObject transform, final SubLObject key, final SubLObject quiescence)
  {
    if( key.eql( Symbols.symbol_function( IDENTITY ) ) || key.eql( IDENTITY ) )
    {
      if( quiescence.eql( Symbols.symbol_function( EQUAL ) ) || quiescence.equal( EQUAL ) )
      {
        SubLObject previous_transformation;
        SubLObject transformation;
        for( previous_transformation = v_object, transformation = NIL, transformation = ( ( NIL != transform_pred_funcall( pred, v_object ) ) ? conses_high.copy_tree( transform_transform_funcall( transform, v_object ) )
            : v_object ); !previous_transformation.eql( transformation ) && !previous_transformation.equal( transformation ); previous_transformation = transformation, transformation = ( ( NIL != transform_pred_funcall(
                pred, transformation ) ) ? conses_high.copy_tree( transform_transform_funcall( transform, transformation ) ) : transformation ) )
        {
        }
        return transformation;
      }
      SubLObject previous_transformation;
      SubLObject transformation;
      for( previous_transformation = v_object, transformation = NIL, transformation = ( ( NIL != transform_pred_funcall( pred, v_object ) ) ? conses_high.copy_tree( transform_transform_funcall( transform, v_object ) )
          : v_object ); !previous_transformation.eql( transformation ) && NIL == transform_quiescence_funcall( quiescence, previous_transformation,
              transformation ); previous_transformation = transformation, transformation = ( ( NIL != transform_pred_funcall( pred, transformation ) ) ? conses_high.copy_tree( transform_transform_funcall( transform,
                  transformation ) ) : transformation ) )
      {
      }
      return transformation;
    }
    else
    {
      if( quiescence.eql( Symbols.symbol_function( EQUAL ) ) || quiescence.equal( EQUAL ) )
      {
        SubLObject previous_transformation;
        SubLObject transformation;
        for( previous_transformation = v_object, transformation = NIL, transformation = ( ( NIL != transform_pred_funcall( pred, v_object ) ) ? conses_high.copy_tree( transform_transform_funcall( transform,
            transform_key_funcall( key, v_object ) ) ) : v_object ); !previous_transformation.eql( transformation ) && !previous_transformation.equal(
                transformation ); previous_transformation = transformation, transformation = ( ( NIL != transform_pred_funcall( pred, transformation ) ) ? conses_high.copy_tree( transform_transform_funcall( transform,
                    transform_key_funcall( key, transformation ) ) ) : transformation ) )
        {
        }
        return transformation;
      }
      SubLObject previous_transformation;
      SubLObject transformation;
      for( previous_transformation = v_object, transformation = NIL, transformation = ( ( NIL != transform_pred_funcall( pred, v_object ) ) ? conses_high.copy_tree( transform_transform_funcall( transform,
          transform_key_funcall( key, v_object ) ) ) : v_object ); !previous_transformation.eql( transformation ) && NIL == transform_quiescence_funcall( quiescence, previous_transformation,
              transformation ); previous_transformation = transformation, transformation = ( ( NIL != transform_pred_funcall( pred, transformation ) ) ? conses_high.copy_tree( transform_transform_funcall( transform,
                  transform_key_funcall( key, transformation ) ) ) : transformation ) )
      {
      }
      return transformation;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/transform-list-utilities.lisp", position = 27679L)
  public static SubLObject shy_ntransform_perform_quiescent_transform(final SubLObject v_object, final SubLObject pred, final SubLObject transform, final SubLObject key, final SubLObject quiescence,
      final SubLObject transformation_max, SubLObject transformation_count)
  {
    if( key.eql( Symbols.symbol_function( IDENTITY ) ) || key.eql( IDENTITY ) )
    {
      if( quiescence.eql( Symbols.symbol_function( EQUAL ) ) || quiescence.equal( EQUAL ) )
      {
        SubLObject previous_transformation;
        SubLObject transformation;
        for( previous_transformation = v_object, transformation = NIL, transformation = ( ( NIL != transform_pred_funcall( pred, v_object ) ) ? conses_high.copy_tree( transform_transform_funcall( transform, v_object ) )
            : v_object ); !previous_transformation.eql( transformation ) && !previous_transformation.equal( transformation ); previous_transformation = transformation, transformation = ( ( NIL != transform_pred_funcall(
                pred, transformation ) ) ? conses_high.copy_tree( transform_transform_funcall( transform, transformation ) ) : transformation ) )
        {
          if( transformation_count.numGE( transformation_max ) )
          {
            Dynamic.sublisp_throw( $kw4$TRANSFORMATION_LIMIT_EXCEEDED, ConsesLow.list( $kw4$TRANSFORMATION_LIMIT_EXCEEDED, transformation_count, transformation_max ) );
          }
          transformation_count = Numbers.add( transformation_count, ONE_INTEGER );
        }
        return Values.values( transformation, transformation_count );
      }
      SubLObject previous_transformation;
      SubLObject transformation;
      for( previous_transformation = v_object, transformation = NIL, transformation = ( ( NIL != transform_pred_funcall( pred, v_object ) ) ? conses_high.copy_tree( transform_transform_funcall( transform, v_object ) )
          : v_object ); !previous_transformation.eql( transformation ) && NIL == transform_quiescence_funcall( quiescence, previous_transformation,
              transformation ); previous_transformation = transformation, transformation = ( ( NIL != transform_pred_funcall( pred, transformation ) ) ? conses_high.copy_tree( transform_transform_funcall( transform,
                  transformation ) ) : transformation ) )
      {
        if( transformation_count.numGE( transformation_max ) )
        {
          Dynamic.sublisp_throw( $kw4$TRANSFORMATION_LIMIT_EXCEEDED, ConsesLow.list( $kw4$TRANSFORMATION_LIMIT_EXCEEDED, transformation_count, transformation_max ) );
        }
        transformation_count = Numbers.add( transformation_count, ONE_INTEGER );
      }
      return Values.values( transformation, transformation_count );
    }
    else
    {
      if( quiescence.eql( Symbols.symbol_function( EQUAL ) ) || quiescence.equal( EQUAL ) )
      {
        SubLObject previous_transformation;
        SubLObject transformation;
        for( previous_transformation = v_object, transformation = NIL, transformation = ( ( NIL != transform_pred_funcall( pred, v_object ) ) ? conses_high.copy_tree( transform_transform_funcall( transform,
            transform_key_funcall( key, v_object ) ) ) : v_object ); !previous_transformation.eql( transformation ) && !previous_transformation.equal(
                transformation ); previous_transformation = transformation, transformation = ( ( NIL != transform_pred_funcall( pred, transformation ) ) ? conses_high.copy_tree( transform_transform_funcall( transform,
                    transform_key_funcall( key, transformation ) ) ) : transformation ) )
        {
          if( transformation_count.numGE( transformation_max ) )
          {
            Dynamic.sublisp_throw( $kw4$TRANSFORMATION_LIMIT_EXCEEDED, ConsesLow.list( $kw4$TRANSFORMATION_LIMIT_EXCEEDED, transformation_count, transformation_max ) );
          }
          transformation_count = Numbers.add( transformation_count, ONE_INTEGER );
        }
        return Values.values( transformation, transformation_count );
      }
      SubLObject previous_transformation;
      SubLObject transformation;
      for( previous_transformation = v_object, transformation = NIL, transformation = ( ( NIL != transform_pred_funcall( pred, v_object ) ) ? conses_high.copy_tree( transform_transform_funcall( transform,
          transform_key_funcall( key, v_object ) ) ) : v_object ); !previous_transformation.eql( transformation ) && NIL == transform_quiescence_funcall( quiescence, previous_transformation,
              transformation ); previous_transformation = transformation, transformation = ( ( NIL != transform_pred_funcall( pred, transformation ) ) ? conses_high.copy_tree( transform_transform_funcall( transform,
                  transform_key_funcall( key, transformation ) ) ) : transformation ) )
      {
        if( transformation_count.numGE( transformation_max ) )
        {
          Dynamic.sublisp_throw( $kw4$TRANSFORMATION_LIMIT_EXCEEDED, ConsesLow.list( $kw4$TRANSFORMATION_LIMIT_EXCEEDED, transformation_count, transformation_max ) );
        }
        transformation_count = Numbers.add( transformation_count, ONE_INTEGER );
      }
      return Values.values( transformation, transformation_count );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/transform-list-utilities.lisp", position = 31557L)
  public static SubLObject positive_integer_less_than_1000_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != subl_promotions.positive_integer_p( v_object ) && v_object.numL( $int17$1000 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/transform-list-utilities.lisp", position = 31557L)
  public static SubLObject test_transform(final SubLObject v_object, final SubLObject pred, final SubLObject transform)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject error = NIL;
    SubLObject timed_outP = NIL;
    try
    {
      thread.throwStack.push( $kw4$TRANSFORMATION_LIMIT_EXCEEDED );
      final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
      try
      {
        thread.throwStack.push( tag );
        final SubLObject _prev_bind_0 = subl_macro_promotions.$within_with_timeout$.currentBinding( thread );
        try
        {
          subl_macro_promotions.$within_with_timeout$.bind( T, thread );
          SubLObject timer = NIL;
          try
          {
            final SubLObject _prev_bind_0_$13 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding( thread );
            try
            {
              subl_macro_promotions.$with_timeout_nesting_depth$.bind( Numbers.add( ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue( thread ) ), thread );
              timer = subl_macro_promotions.with_timeout_start_timer( ONE_INTEGER, tag );
              result = transform( v_object, pred, transform, UNPROVIDED );
            }
            finally
            {
              subl_macro_promotions.$with_timeout_nesting_depth$.rebind( _prev_bind_0_$13, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$14 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              subl_macro_promotions.with_timeout_stop_timer( timer );
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$14, thread );
            }
          }
        }
        finally
        {
          subl_macro_promotions.$within_with_timeout$.rebind( _prev_bind_0, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        timed_outP = Errors.handleThrowable( ccatch_env_var, tag );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    catch( final Throwable ccatch_env_var2 )
    {
      error = Errors.handleThrowable( ccatch_env_var2, $kw4$TRANSFORMATION_LIMIT_EXCEEDED );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != error )
    {
      return $kw18$ERROR;
    }
    if( NIL != timed_outP )
    {
      return $kw19$TIMEOUT;
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/transform-list-utilities.lisp", position = 31557L)
  public static SubLObject test_quiescent_transform(final SubLObject v_object, final SubLObject pred, final SubLObject transform)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject error = NIL;
    SubLObject timed_outP = NIL;
    try
    {
      thread.throwStack.push( $kw4$TRANSFORMATION_LIMIT_EXCEEDED );
      final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
      try
      {
        thread.throwStack.push( tag );
        final SubLObject _prev_bind_0 = subl_macro_promotions.$within_with_timeout$.currentBinding( thread );
        try
        {
          subl_macro_promotions.$within_with_timeout$.bind( T, thread );
          SubLObject timer = NIL;
          try
          {
            final SubLObject _prev_bind_0_$15 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding( thread );
            try
            {
              subl_macro_promotions.$with_timeout_nesting_depth$.bind( Numbers.add( ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue( thread ) ), thread );
              timer = subl_macro_promotions.with_timeout_start_timer( ONE_INTEGER, tag );
              result = quiescent_transform( v_object, pred, transform, UNPROVIDED, UNPROVIDED );
            }
            finally
            {
              subl_macro_promotions.$with_timeout_nesting_depth$.rebind( _prev_bind_0_$15, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$16 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              subl_macro_promotions.with_timeout_stop_timer( timer );
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$16, thread );
            }
          }
        }
        finally
        {
          subl_macro_promotions.$within_with_timeout$.rebind( _prev_bind_0, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        timed_outP = Errors.handleThrowable( ccatch_env_var, tag );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    catch( final Throwable ccatch_env_var2 )
    {
      error = Errors.handleThrowable( ccatch_env_var2, $kw4$TRANSFORMATION_LIMIT_EXCEEDED );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != error )
    {
      return $kw18$ERROR;
    }
    if( NIL != timed_outP )
    {
      return $kw19$TIMEOUT;
    }
    return result;
  }

  public static SubLObject declare_transform_list_utilities_file()
  {
    SubLFiles.declareFunction( me, "transform_pred_funcall", "TRANSFORM-PRED-FUNCALL", 2, 0, false );
    SubLFiles.declareFunction( me, "transform_key_funcall", "TRANSFORM-KEY-FUNCALL", 2, 0, false );
    SubLFiles.declareFunction( me, "transform_transform_funcall", "TRANSFORM-TRANSFORM-FUNCALL", 2, 0, false );
    SubLFiles.declareFunction( me, "transform_quiescence_funcall", "TRANSFORM-QUIESCENCE-FUNCALL", 3, 0, false );
    SubLFiles.declareFunction( me, "transform", "TRANSFORM", 3, 1, false );
    SubLFiles.declareFunction( me, "ntransform", "NTRANSFORM", 3, 3, false );
    SubLFiles.declareFunction( me, "ntransform_recursive", "NTRANSFORM-RECURSIVE", 6, 0, false );
    SubLFiles.declareFunction( me, "shy_ntransform_recursive", "SHY-NTRANSFORM-RECURSIVE", 8, 0, false );
    SubLFiles.declareFunction( me, "ntransform_perform_transform", "NTRANSFORM-PERFORM-TRANSFORM", 4, 0, false );
    SubLFiles.declareFunction( me, "shy_ntransform_perform_transform", "SHY-NTRANSFORM-PERFORM-TRANSFORM", 6, 0, false );
    SubLFiles.declareFunction( me, "make_ntransform_info", "MAKE-NTRANSFORM-INFO", 3, 0, false );
    SubLFiles.declareFunction( me, "reuse_ntransform_info", "REUSE-NTRANSFORM-INFO", 4, 0, false );
    SubLFiles.declareMacro( me, "get_ntransform_info_parent_cons", "GET-NTRANSFORM-INFO-PARENT-CONS" );
    SubLFiles.declareMacro( me, "get_ntransform_info_set_op", "GET-NTRANSFORM-INFO-SET-OP" );
    SubLFiles.declareMacro( me, "get_ntransform_info_value", "GET-NTRANSFORM-INFO-VALUE" );
    SubLFiles.declareMacro( me, "set_ntransform_info_parent_cons", "SET-NTRANSFORM-INFO-PARENT-CONS" );
    SubLFiles.declareMacro( me, "set_ntransform_info_set_op", "SET-NTRANSFORM-INFO-SET-OP" );
    SubLFiles.declareMacro( me, "set_ntransform_info_value", "SET-NTRANSFORM-INFO-VALUE" );
    SubLFiles.declareFunction( me, "ntransform_iterative", "NTRANSFORM-ITERATIVE", 3, 1, false );
    SubLFiles.declareFunction( me, "shy_ntransform_iterative", "SHY-NTRANSFORM-ITERATIVE", 3, 3, false );
    SubLFiles.declareFunction( me, "quiescent_transform", "QUIESCENT-TRANSFORM", 3, 2, false );
    SubLFiles.declareFunction( me, "quiescent_ntransform", "QUIESCENT-NTRANSFORM", 3, 4, false );
    SubLFiles.declareFunction( me, "quiescent_ntransform_recursive", "QUIESCENT-NTRANSFORM-RECURSIVE", 7, 0, false );
    SubLFiles.declareFunction( me, "shy_quiescent_ntransform_recursive", "SHY-QUIESCENT-NTRANSFORM-RECURSIVE", 9, 0, false );
    SubLFiles.declareFunction( me, "quiescent_ntransform_iterative", "QUIESCENT-NTRANSFORM-ITERATIVE", 3, 2, false );
    SubLFiles.declareFunction( me, "shy_quiescent_ntransform_iterative", "SHY-QUIESCENT-NTRANSFORM-ITERATIVE", 3, 4, false );
    SubLFiles.declareFunction( me, "ntransform_perform_quiescent_transform", "NTRANSFORM-PERFORM-QUIESCENT-TRANSFORM", 5, 0, false );
    SubLFiles.declareFunction( me, "shy_ntransform_perform_quiescent_transform", "SHY-NTRANSFORM-PERFORM-QUIESCENT-TRANSFORM", 7, 0, false );
    SubLFiles.declareFunction( me, "positive_integer_less_than_1000_p", "POSITIVE-INTEGER-LESS-THAN-1000-P", 1, 0, false );
    SubLFiles.declareFunction( me, "test_transform", "TEST-TRANSFORM", 3, 0, false );
    SubLFiles.declareFunction( me, "test_quiescent_transform", "TEST-QUIESCENT-TRANSFORM", 3, 0, false );
    return NIL;
  }

  public static SubLObject init_transform_list_utilities_file()
  {
    $default_recursion_limit$ = SubLFiles.defparameter( "*DEFAULT-RECURSION-LIMIT*", $int0$212 );
    $default_transformation_max$ = SubLFiles.defparameter( "*DEFAULT-TRANSFORMATION-MAX*", NIL );
    $default_quiescent_transformation_max$ = SubLFiles.defparameter( "*DEFAULT-QUIESCENT-TRANSFORMATION-MAX*", $int1$1024 );
    return NIL;
  }

  public static SubLObject setup_transform_list_utilities_file()
  {
    access_macros.register_external_symbol( $sym2$TRANSFORM );
    access_macros.register_external_symbol( $sym3$NTRANSFORM );
    access_macros.register_external_symbol( $sym15$QUIESCENT_TRANSFORM );
    access_macros.register_external_symbol( $sym16$QUIESCENT_NTRANSFORM );
    generic_testing.define_test_case_table_int( $sym20$TEST_TRANSFORM, ConsesLow.list( new SubLObject[] { $kw21$TEST, NIL, $kw22$OWNER, NIL, $kw23$CLASSES, NIL, $kw24$KB, $kw25$TINY, $kw26$WORKING_, T
    } ), $list27 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_transform_list_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_transform_list_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_transform_list_utilities_file();
  }
  static
  {
    me = new transform_list_utilities();
    $default_recursion_limit$ = null;
    $default_transformation_max$ = null;
    $default_quiescent_transformation_max$ = null;
    $int0$212 = makeInteger( 212 );
    $int1$1024 = makeInteger( 1024 );
    $sym2$TRANSFORM = makeSymbol( "TRANSFORM" );
    $sym3$NTRANSFORM = makeSymbol( "NTRANSFORM" );
    $kw4$TRANSFORMATION_LIMIT_EXCEEDED = makeKeyword( "TRANSFORMATION-LIMIT-EXCEEDED" );
    $list5 = ConsesLow.list( makeSymbol( "NTRANSFORM-INFO" ) );
    $sym6$CAR = makeSymbol( "CAR" );
    $sym7$CADR = makeSymbol( "CADR" );
    $sym8$CDDR = makeSymbol( "CDDR" );
    $list9 = ConsesLow.list( makeSymbol( "NTRANSFORM-INFO" ), makeSymbol( "NEW-PARENT-CONS" ) );
    $sym10$RPLACA = makeSymbol( "RPLACA" );
    $list11 = ConsesLow.list( makeSymbol( "NTRANSFORM-INFO" ), makeSymbol( "NEW-SET-OP" ) );
    $sym12$CDR = makeSymbol( "CDR" );
    $list13 = ConsesLow.list( makeSymbol( "NTRANSFORM-INFO" ), makeSymbol( "NEW-VALUE" ) );
    $sym14$RPLACD = makeSymbol( "RPLACD" );
    $sym15$QUIESCENT_TRANSFORM = makeSymbol( "QUIESCENT-TRANSFORM" );
    $sym16$QUIESCENT_NTRANSFORM = makeSymbol( "QUIESCENT-NTRANSFORM" );
    $int17$1000 = makeInteger( 1000 );
    $kw18$ERROR = makeKeyword( "ERROR" );
    $kw19$TIMEOUT = makeKeyword( "TIMEOUT" );
    $sym20$TEST_TRANSFORM = makeSymbol( "TEST-TRANSFORM" );
    $kw21$TEST = makeKeyword( "TEST" );
    $kw22$OWNER = makeKeyword( "OWNER" );
    $kw23$CLASSES = makeKeyword( "CLASSES" );
    $kw24$KB = makeKeyword( "KB" );
    $kw25$TINY = makeKeyword( "TINY" );
    $kw26$WORKING_ = makeKeyword( "WORKING?" );
    $list27 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( ONE_INTEGER ), makeSymbol( "POSITIVE-INTEGER-LESS-THAN-1000-P" ), makeSymbol( "1+" ) ), ConsesLow.list( makeInteger( 1000 ) ) ), ConsesLow
        .list( ConsesLow.list( ConsesLow.list( ONE_INTEGER, TWO_INTEGER, THREE_INTEGER ), makeSymbol( "POSITIVE-INTEGER-LESS-THAN-1000-P" ), makeSymbol( "1+" ) ), ConsesLow.list( makeInteger( 1000 ), makeInteger( 1000 ),
            makeInteger( 1000 ) ) ) );
  }
}
/*
 * 
 * Total time: 248 ms
 * 
 */