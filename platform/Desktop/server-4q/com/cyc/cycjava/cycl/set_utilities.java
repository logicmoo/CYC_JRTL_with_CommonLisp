package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class set_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.set_utilities";
  public static final String myFingerPrint = "b192466ff655771fc9f9edd0f26129a63a1cd68173b7b2fb4eb2e1b1a29e03ba";
  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 734L)
  public static SubLSymbol $empty_set$;
  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 14687L)
  public static SubLSymbol $dtp_sliding_window$;
  private static final SubLSymbol $sym0$_EMPTY_SET_;
  private static final SubLSymbol $sym1$SET_P;
  private static final SubLSymbol $sym2$LISTP;
  private static final SubLSymbol $sym3$VALID_HASH_TEST_P;
  private static final SubLSymbol $sym4$SET_SIZE;
  private static final SubLSymbol $sym5$NON_DOTTED_LIST_P;
  private static final SubLSymbol $sym6$SET_CONTENTS_P;
  private static final SubLSymbol $sym7$SET_CONTENTS_SIZE;
  private static final SubLSymbol $sym8$_;
  private static final SubLSymbol $sym9$SET_TEST;
  private static final SubLSymbol $sym10$MAKE_SET_FROM_LIST;
  private static final SubLList $list11;
  private static final SubLString $str12$_A__;
  private static final SubLList $list13;
  private static final SubLList $list14;
  private static final SubLSymbol $kw15$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw16$DONE;
  private static final SubLSymbol $sym17$CLET;
  private static final SubLList $list18;
  private static final SubLSymbol $sym19$DO_SET;
  private static final SubLSymbol $sym20$CINC;
  private static final SubLSymbol $sym21$SLIDING_WINDOW;
  private static final SubLSymbol $sym22$SLIDING_WINDOW_P;
  private static final SubLList $list23;
  private static final SubLList $list24;
  private static final SubLList $list25;
  private static final SubLList $list26;
  private static final SubLSymbol $sym27$DEFAULT_STRUCT_PRINT_FUNCTION;
  private static final SubLSymbol $sym28$SLIDING_WINDOW_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list29;
  private static final SubLSymbol $sym30$SLDWND_WINDOW;
  private static final SubLSymbol $sym31$_CSETF_SLDWND_WINDOW;
  private static final SubLSymbol $sym32$SLDWND_SET_A;
  private static final SubLSymbol $sym33$_CSETF_SLDWND_SET_A;
  private static final SubLSymbol $sym34$SLDWND_SET_B;
  private static final SubLSymbol $sym35$_CSETF_SLDWND_SET_B;
  private static final SubLSymbol $sym36$SLDWND_WINDOW_A;
  private static final SubLSymbol $sym37$_CSETF_SLDWND_WINDOW_A;
  private static final SubLSymbol $sym38$SLDWND_WINDOW_B;
  private static final SubLSymbol $sym39$_CSETF_SLDWND_WINDOW_B;
  private static final SubLSymbol $kw40$WINDOW;
  private static final SubLSymbol $kw41$SET_A;
  private static final SubLSymbol $kw42$SET_B;
  private static final SubLSymbol $kw43$WINDOW_A;
  private static final SubLSymbol $kw44$WINDOW_B;
  private static final SubLString $str45$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw46$BEGIN;
  private static final SubLSymbol $sym47$MAKE_SLIDING_WINDOW;
  private static final SubLSymbol $kw48$SLOT;
  private static final SubLSymbol $kw49$END;
  private static final SubLSymbol $sym50$VISIT_DEFSTRUCT_OBJECT_SLIDING_WINDOW_METHOD;
  private static final SubLSymbol $sym51$TEST_SLIDING_WINDOWS;
  private static final SubLSymbol $kw52$TEST;
  private static final SubLSymbol $kw53$OWNER;
  private static final SubLSymbol $kw54$CLASSES;
  private static final SubLSymbol $kw55$KB;
  private static final SubLSymbol $kw56$TINY;
  private static final SubLSymbol $kw57$WORKING_;
  private static final SubLList $list58;
  private static final SubLSymbol $kw59$SUCCESS;
  private static final SubLString $str60$Set__A_is_not_co_extensional_with;
  private static final SubLSymbol $kw61$FAILURE;

  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 783L)
  public static SubLObject set_arbitrary_element(final SubLObject v_set)
  {
    SubLObject result = NIL;
    SubLObject foundP = NIL;
    final SubLObject set_contents_var = set.do_set_internal( v_set );
    SubLObject basis_object;
    SubLObject state;
    SubLObject element;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == foundP
        && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      element = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, element ) )
      {
        result = element;
        foundP = T;
      }
    }
    return Values.values( result, foundP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 1021L)
  public static SubLObject set_arbitrary_element_without_values(final SubLObject v_set, SubLObject v_default)
  {
    if( v_default == UNPROVIDED )
    {
      v_default = NIL;
    }
    final SubLObject set_contents_var = set.do_set_internal( v_set );
    SubLObject basis_object;
    SubLObject state;
    SubLObject element;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      element = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, element ) )
      {
        return element;
      }
    }
    return v_default;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 1232L)
  public static SubLObject set_contents_arbitrary_element(final SubLObject v_set_contents)
  {
    SubLObject result = NIL;
    SubLObject foundP;
    SubLObject basis_object;
    SubLObject state;
    SubLObject element;
    for( foundP = NIL, basis_object = set_contents.do_set_contents_basis_object( v_set_contents ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, v_set_contents ); NIL == foundP
        && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      element = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, element ) )
      {
        result = element;
        foundP = T;
      }
    }
    return Values.values( result, foundP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 1515L)
  public static SubLObject set_contents_arbitrary_element_without_values(final SubLObject v_set_contents, SubLObject v_default)
  {
    if( v_default == UNPROVIDED )
    {
      v_default = NIL;
    }
    SubLObject basis_object;
    SubLObject state;
    SubLObject element;
    for( basis_object = set_contents.do_set_contents_basis_object( v_set_contents ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, v_set_contents ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      element = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, element ) )
      {
        return element;
      }
    }
    return v_default;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 1771L)
  public static SubLObject set_remove_random_element(final SubLObject v_set)
  {
    assert NIL != set.set_p( v_set ) : v_set;
    final SubLObject element = set.set_random_element( v_set );
    set.set_remove( element, v_set );
    return element;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 2148L)
  public static SubLObject set_union(final SubLObject sets, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = NIL;
    }
    assert NIL != Types.listp( sets ) : sets;
    if( NIL == test )
    {
      test = default_test_function_for_sets( sets );
    }
    assert NIL != hash_table_utilities.valid_hash_test_p( test ) : test;
    if( NIL != list_utilities.find_if_not( $sym1$SET_P, sets, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return NIL;
    }
    if( NIL == sets )
    {
      return set.new_set( test, UNPROVIDED );
    }
    final SubLObject size = number_utilities.maximum( Mapping.mapcar( $sym4$SET_SIZE, sets ), UNPROVIDED );
    final SubLObject result = set.new_set( test, size );
    SubLObject cdolist_list_var = sets;
    SubLObject v_set = NIL;
    v_set = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject set_contents_var = set.do_set_internal( v_set );
      SubLObject basis_object;
      SubLObject state;
      SubLObject elem;
      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
          .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
      {
        elem = set_contents.do_set_contents_next( basis_object, state );
        if( NIL != set_contents.do_set_contents_element_validP( state, elem ) )
        {
          set.set_add( elem, result );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_set = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 2767L)
  public static SubLObject set_contents_union(final SubLObject set_contents_list, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    assert NIL != list_utilities.non_dotted_list_p( set_contents_list ) : set_contents_list;
    SubLObject cdolist_list_var = set_contents_list;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != set_contents.set_contents_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    if( NIL == set_contents_list )
    {
      return set_contents.new_set_contents( ZERO_INTEGER, test );
    }
    if( NIL != list_utilities.singletonP( set_contents_list ) )
    {
      return set_contents.copy_set_contents( set_contents_list.first() );
    }
    final SubLObject size = number_utilities.maximum( Mapping.mapcar( $sym7$SET_CONTENTS_SIZE, set_contents_list ), UNPROVIDED );
    SubLObject union = set_contents.new_set_contents( size, test );
    SubLObject cdolist_list_var2 = set_contents_list;
    SubLObject v_set_contents = NIL;
    v_set_contents = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      final SubLObject set_contents_var = v_set_contents;
      SubLObject basis_object;
      SubLObject state;
      SubLObject element;
      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
          .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
      {
        element = set_contents.do_set_contents_next( basis_object, state );
        if( NIL != set_contents.do_set_contents_element_validP( state, element ) )
        {
          union = set_contents.set_contents_add( element, union, UNPROVIDED );
        }
      }
      cdolist_list_var2 = cdolist_list_var2.rest();
      v_set_contents = cdolist_list_var2.first();
    }
    return union;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 3345L)
  public static SubLObject set_intersection(final SubLObject sets, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = NIL;
    }
    assert NIL != Types.listp( sets ) : sets;
    if( NIL == test )
    {
      test = default_test_function_for_sets( sets );
    }
    assert NIL != hash_table_utilities.valid_hash_test_p( test ) : test;
    if( NIL != list_utilities.find_if_not( $sym1$SET_P, sets, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return NIL;
    }
    if( NIL == sets )
    {
      return set.new_set( test, UNPROVIDED );
    }
    final SubLObject smallest_set = list_utilities.extremal( sets, Symbols.symbol_function( $sym8$_ ), $sym4$SET_SIZE );
    final SubLObject size = set.set_size( smallest_set );
    final SubLObject result = set.new_set( test, size );
    final SubLObject set_contents_var = set.do_set_internal( smallest_set );
    SubLObject basis_object;
    SubLObject state;
    SubLObject elem;
    SubLObject not_in_intersectionP;
    SubLObject csome_list_var;
    SubLObject v_set;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      elem = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, elem ) )
      {
        not_in_intersectionP = NIL;
        if( NIL == not_in_intersectionP )
        {
          csome_list_var = sets;
          v_set = NIL;
          v_set = csome_list_var.first();
          while ( NIL == not_in_intersectionP && NIL != csome_list_var)
          {
            if( !v_set.eql( smallest_set ) && NIL == set.set_memberP( elem, v_set ) )
            {
              not_in_intersectionP = T;
            }
            csome_list_var = csome_list_var.rest();
            v_set = csome_list_var.first();
          }
        }
        if( NIL == not_in_intersectionP )
        {
          set.set_add( elem, result );
        }
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 4230L)
  public static SubLObject set_contents_intersection(final SubLObject set_contents_list, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    assert NIL != list_utilities.non_dotted_list_p( set_contents_list ) : set_contents_list;
    SubLObject cdolist_list_var = set_contents_list;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != set_contents.set_contents_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    if( NIL == set_contents_list )
    {
      return set_contents.new_set_contents( ZERO_INTEGER, test );
    }
    if( NIL != list_utilities.singletonP( set_contents_list ) )
    {
      return set_contents.copy_set_contents( set_contents_list.first() );
    }
    SubLObject intersection = set_contents.new_set_contents( ZERO_INTEGER, test );
    if( NIL != set_contents_list )
    {
      final SubLObject set_contents_var;
      final SubLObject smallest = set_contents_var = list_utilities.extremal( set_contents_list, Symbols.symbol_function( $sym8$_ ), $sym7$SET_CONTENTS_SIZE );
      SubLObject basis_object;
      SubLObject state;
      SubLObject element;
      SubLObject not_in_intersectionP;
      SubLObject csome_list_var;
      SubLObject v_set_contents;
      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
          .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
      {
        element = set_contents.do_set_contents_next( basis_object, state );
        if( NIL != set_contents.do_set_contents_element_validP( state, element ) )
        {
          not_in_intersectionP = NIL;
          if( NIL == not_in_intersectionP )
          {
            csome_list_var = set_contents_list;
            v_set_contents = NIL;
            v_set_contents = csome_list_var.first();
            while ( NIL == not_in_intersectionP && NIL != csome_list_var)
            {
              if( !v_set_contents.eql( smallest ) && NIL == set_contents.set_contents_memberP( element, v_set_contents, test ) )
              {
                not_in_intersectionP = T;
              }
              csome_list_var = csome_list_var.rest();
              v_set_contents = csome_list_var.first();
            }
          }
          if( NIL == not_in_intersectionP )
          {
            intersection = set_contents.set_contents_add( element, intersection, test );
          }
        }
      }
    }
    return intersection;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 5118L)
  public static SubLObject sets_intersectP(final SubLObject sets)
  {
    assert NIL != Types.listp( sets ) : sets;
    if( NIL == sets )
    {
      return NIL;
    }
    final SubLObject smallest_set = list_utilities.extremal( sets, Symbols.symbol_function( $sym8$_ ), $sym4$SET_SIZE );
    final SubLObject set_contents_var = set.do_set_internal( smallest_set );
    SubLObject basis_object;
    SubLObject state;
    SubLObject elem;
    SubLObject cdolist_list_var;
    SubLObject v_set;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      elem = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, elem ) )
      {
        cdolist_list_var = sets;
        v_set = NIL;
        v_set = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( !v_set.eql( smallest_set ) && NIL != set.set_memberP( elem, v_set ) )
          {
            return T;
          }
          cdolist_list_var = cdolist_list_var.rest();
          v_set = cdolist_list_var.first();
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 5512L)
  public static SubLObject set_intersection_fraction(final SubLObject set1, final SubLObject set2)
  {
    final SubLObject smaller_set = set.set_size( set1 ).numLE( set.set_size( set2 ) ) ? set1 : set2;
    final SubLObject larger_set = set.set_size( set1 ).numLE( set.set_size( set2 ) ) ? set2 : set1;
    final SubLObject total = set.set_size( smaller_set );
    SubLObject common = ZERO_INTEGER;
    if( total.numE( ZERO_INTEGER ) )
    {
      return ZERO_INTEGER;
    }
    final SubLObject set_contents_var = set.do_set_internal( smaller_set );
    SubLObject basis_object;
    SubLObject state;
    SubLObject element;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      element = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, element ) && NIL != set.set_memberP( element, larger_set ) )
      {
        common = Numbers.add( common, ONE_INTEGER );
      }
    }
    return Numbers.divide( common, total );
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 5985L)
  public static SubLObject sets_intersect_by(final SubLObject set1, final SubLObject set2, final SubLObject amount)
  {
    if( set.set_size( set1 ).numL( amount ) )
    {
      return NIL;
    }
    if( set.set_size( set2 ).numL( amount ) )
    {
      return NIL;
    }
    final SubLObject smaller_set = set.set_size( set1 ).numLE( set.set_size( set2 ) ) ? set1 : set2;
    final SubLObject larger_set = set.set_size( set1 ).numLE( set.set_size( set2 ) ) ? set2 : set1;
    SubLObject match_count = amount;
    final SubLObject set_contents_var = set.do_set_internal( smaller_set );
    SubLObject basis_object;
    SubLObject state;
    SubLObject element;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      element = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, element ) && NIL != set.set_memberP( element, larger_set ) )
      {
        match_count = Numbers.subtract( match_count, ONE_INTEGER );
        if( match_count.isZero() )
        {
          return T;
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 6691L)
  public static SubLObject set_minus(final SubLObject set1, final SubLObject set2, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = NIL;
    }
    assert NIL != set.set_p( set1 ) : set1;
    assert NIL != set.set_p( set2 ) : set2;
    if( NIL == test )
    {
      test = default_test_function_for_sets( ConsesLow.list( set1, set2 ) );
    }
    assert NIL != hash_table_utilities.valid_hash_test_p( test ) : test;
    final SubLObject v_set = set.new_set( test, UNPROVIDED );
    final SubLObject set_contents_var = set.do_set_internal( set1 );
    SubLObject basis_object;
    SubLObject state;
    SubLObject element;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      element = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, element ) && NIL == set.set_memberP( element, set2 ) )
      {
        set.set_add( element, v_set );
      }
    }
    return v_set;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 7232L)
  public static SubLObject set_nprune(final SubLObject keepers, final SubLObject goners)
  {
    final SubLObject set_contents_var = set.do_set_internal( goners );
    SubLObject basis_object;
    SubLObject state;
    SubLObject goner;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      goner = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, goner ) )
      {
        set.set_remove( goner, keepers );
      }
    }
    return keepers;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 7495L)
  public static SubLObject set_prune(final SubLObject keepers, final SubLObject goners)
  {
    return set_nprune( set.copy_set( keepers ), goners );
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 7719L)
  public static SubLObject sets_coextensionalP(final SubLObject set1, final SubLObject set2)
  {
    assert NIL != set.set_p( set1 ) : set1;
    assert NIL != set.set_p( set2 ) : set2;
    if( set1.eql( set2 ) )
    {
      return T;
    }
    if( !set.set_size( set1 ).eql( set.set_size( set2 ) ) )
    {
      return NIL;
    }
    SubLObject failP = NIL;
    SubLObject set_contents_var = set.do_set_internal( set1 );
    SubLObject basis_object;
    SubLObject state;
    SubLObject element_of_set1;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == failP
        && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      element_of_set1 = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, element_of_set1 ) && NIL == set.set_memberP( element_of_set1, set2 ) )
      {
        failP = T;
      }
    }
    if( NIL == failP && !set.set_test( set1 ).eql( set.set_test( set2 ) ) )
    {
      set_contents_var = set.do_set_internal( set2 );
      SubLObject element_of_set2;
      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == failP
          && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
      {
        element_of_set2 = set_contents.do_set_contents_next( basis_object, state );
        if( NIL != set_contents.do_set_contents_element_validP( state, element_of_set2 ) && NIL == set.set_memberP( element_of_set2, set1 ) )
        {
          failP = T;
        }
      }
    }
    return makeBoolean( NIL == failP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 8397L)
  public static SubLObject default_test_function_for_sets(final SubLObject sets)
  {
    final SubLObject first_set_test = set.set_test( sets.first() );
    if( NIL == Sequences.remove( first_set_test, sets, Symbols.symbol_function( EQ ), $sym9$SET_TEST, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return first_set_test;
    }
    return set.$new_set_default_test_function$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 8764L)
  public static SubLObject set_subsetP(final SubLObject small, final SubLObject large)
  {
    assert NIL != set.set_p( small ) : small;
    assert NIL != set.set_p( large ) : large;
    SubLObject failP = NIL;
    if( set.set_size( small ).numG( set.set_size( large ) ) && set.set_test( small ).eql( set.set_test( large ) ) )
    {
      failP = T;
    }
    final SubLObject set_contents_var = set.do_set_internal( small );
    SubLObject basis_object;
    SubLObject state;
    SubLObject elem;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == failP
        && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      elem = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, elem ) && NIL == set.set_memberP( elem, large ) )
      {
        failP = T;
      }
    }
    return makeBoolean( NIL == failP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 9266L)
  public static SubLObject set_subset_anyP(final SubLObject small, final SubLObject large_sets)
  {
    SubLObject cdolist_list_var = large_sets;
    SubLObject large = NIL;
    large = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != set_subsetP( small, large ) )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      large = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 9481L)
  public static SubLObject set_find(final SubLObject item, final SubLObject v_set, SubLObject test, SubLObject key)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    assert NIL != set.set_p( v_set ) : v_set;
    SubLObject found = NIL;
    final SubLObject set_contents_var = set.do_set_internal( v_set );
    SubLObject basis_object;
    SubLObject state;
    SubLObject element;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == found
        && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      element = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, element ) && NIL != Functions.funcall( test, item, Functions.funcall( key, element ) ) )
      {
        found = element;
      }
    }
    return found;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 9788L)
  public static SubLObject set_find_if(final SubLObject test, final SubLObject v_set, SubLObject key)
  {
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    assert NIL != set.set_p( v_set ) : v_set;
    SubLObject found = NIL;
    final SubLObject set_contents_var = set.do_set_internal( v_set );
    SubLObject basis_object;
    SubLObject state;
    SubLObject element;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == found
        && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      element = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, element ) && NIL != Functions.funcall( test, Functions.funcall( key, element ) ) )
      {
        found = element;
      }
    }
    return found;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 10086L)
  public static SubLObject set_find_if_not(final SubLObject test, final SubLObject v_set, SubLObject key)
  {
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    assert NIL != set.set_p( v_set ) : v_set;
    SubLObject found = NIL;
    final SubLObject set_contents_var = set.do_set_internal( v_set );
    SubLObject basis_object;
    SubLObject state;
    SubLObject element;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == found
        && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      element = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, element ) && NIL == Functions.funcall( test, Functions.funcall( key, element ) ) )
      {
        found = element;
      }
    }
    return found;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 10389L)
  public static SubLObject set_remove_if(final SubLObject test, final SubLObject v_set, SubLObject key)
  {
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    assert NIL != set.set_p( v_set ) : v_set;
    SubLObject doomed = NIL;
    final SubLObject set_contents_var = set.do_set_internal( v_set );
    SubLObject basis_object;
    SubLObject state;
    SubLObject element;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      element = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, element ) && NIL != Functions.funcall( test, Functions.funcall( key, element ) ) )
      {
        doomed = ConsesLow.cons( element, doomed );
      }
    }
    SubLObject cdolist_list_var = doomed;
    SubLObject element2 = NIL;
    element2 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      set.set_remove( element2, v_set );
      cdolist_list_var = cdolist_list_var.rest();
      element2 = cdolist_list_var.first();
    }
    return Values.values( v_set, list_utilities.non_empty_list_p( doomed ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 10868L)
  public static SubLObject set_remove_if_not(final SubLObject test, final SubLObject v_set, SubLObject key)
  {
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    assert NIL != set.set_p( v_set ) : v_set;
    SubLObject doomed = NIL;
    final SubLObject set_contents_var = set.do_set_internal( v_set );
    SubLObject basis_object;
    SubLObject state;
    SubLObject element;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      element = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, element ) && NIL == Functions.funcall( test, Functions.funcall( key, element ) ) )
      {
        doomed = ConsesLow.cons( element, doomed );
      }
    }
    SubLObject cdolist_list_var = doomed;
    SubLObject element2 = NIL;
    element2 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      set.set_remove( element2, v_set );
      cdolist_list_var = cdolist_list_var.rest();
      element2 = cdolist_list_var.first();
    }
    return Values.values( v_set, list_utilities.non_empty_list_p( doomed ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 11353L)
  public static SubLObject construct_set_from_list(final SubLObject list, SubLObject test, SubLObject size)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    if( size == UNPROVIDED )
    {
      size = Sequences.length( list );
    }
    final SubLObject v_set = set.new_set( test, size );
    SubLObject cdolist_list_var = list;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      set.set_add( elem, v_set );
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    return v_set;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 11591L)
  public static SubLObject construct_set_contents_from_list(final SubLObject list, SubLObject test, SubLObject size)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    if( size == UNPROVIDED )
    {
      size = Sequences.length( list );
    }
    SubLObject v_set_contents = set_contents.new_set_contents( size, test );
    SubLObject cdolist_list_var = list;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      v_set_contents = set_contents.set_contents_add( elem, v_set_contents, test );
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    return v_set_contents;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 11937L)
  public static SubLObject new_singleton_set(final SubLObject element, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    final SubLObject v_set = set.new_set( test, ONE_INTEGER );
    set.set_add( element, v_set );
    return v_set;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 12132L)
  public static SubLObject make_set_from_list(final SubLObject list, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = set.$new_set_default_test_function$.getGlobalValue();
    }
    return construct_set_from_list( list, test, Sequences.length( list ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 12412L)
  public static SubLObject any_in_set(final SubLObject func, final SubLObject v_set, SubLObject key)
  {
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    SubLObject result = NIL;
    if( key.eql( Symbols.symbol_function( IDENTITY ) ) || key == IDENTITY )
    {
      final SubLObject set_contents_var = set.do_set_internal( v_set );
      SubLObject basis_object;
      SubLObject state;
      SubLObject item;
      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == result
          && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
      {
        item = set_contents.do_set_contents_next( basis_object, state );
        if( NIL != set_contents.do_set_contents_element_validP( state, item ) )
        {
          result = Functions.funcall( func, item );
        }
      }
    }
    else
    {
      final SubLObject set_contents_var = set.do_set_internal( v_set );
      SubLObject basis_object;
      SubLObject state;
      SubLObject item;
      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == result
          && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
      {
        item = set_contents.do_set_contents_next( basis_object, state );
        if( NIL != set_contents.do_set_contents_element_validP( state, item ) )
        {
          result = Functions.funcall( func, Functions.funcall( key, item ) );
        }
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 12730L)
  public static SubLObject every_in_set(final SubLObject func, final SubLObject v_set, SubLObject key)
  {
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    SubLObject result = NIL;
    if( key.eql( Symbols.symbol_function( IDENTITY ) ) || key == IDENTITY )
    {
      final SubLObject set_contents_var = set.do_set_internal( v_set );
      SubLObject basis_object;
      SubLObject state;
      SubLObject item;
      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == result
          && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
      {
        item = set_contents.do_set_contents_next( basis_object, state );
        if( NIL != set_contents.do_set_contents_element_validP( state, item ) )
        {
          result = makeBoolean( NIL == Functions.funcall( func, item ) );
        }
      }
    }
    else
    {
      final SubLObject set_contents_var = set.do_set_internal( v_set );
      SubLObject basis_object;
      SubLObject state;
      SubLObject item;
      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == result
          && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
      {
        item = set_contents.do_set_contents_next( basis_object, state );
        if( NIL != set_contents.do_set_contents_element_validP( state, item ) )
        {
          result = makeBoolean( NIL == Functions.funcall( func, Functions.funcall( key, item ) ) );
        }
      }
    }
    return makeBoolean( NIL == result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 13071L)
  public static SubLObject print_set_contents(final SubLObject v_set, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = T;
    }
    final SubLObject set_contents_var = set.do_set_internal( v_set );
    SubLObject basis_object;
    SubLObject state;
    SubLObject item;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      item = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, item ) )
      {
        PrintLow.format( stream, $str12$_A__, item );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 13200L)
  public static SubLObject set_add_all(final SubLObject elements, final SubLObject v_set)
  {
    SubLObject cdolist_list_var = elements;
    SubLObject element = NIL;
    element = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      set.set_add( element, v_set );
      cdolist_list_var = cdolist_list_var.rest();
      element = cdolist_list_var.first();
    }
    return v_set;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 13313L)
  public static SubLObject set_add_set(final SubLObject v_set, final SubLObject resulting_set)
  {
    final SubLObject set_contents_var = set.do_set_internal( v_set );
    SubLObject basis_object;
    SubLObject state;
    SubLObject elt;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      elt = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, elt ) )
      {
        set.set_add( elt, resulting_set );
      }
    }
    return resulting_set;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 13508L)
  public static SubLObject set_remove_all(final SubLObject elements, final SubLObject v_set)
  {
    SubLObject cdolist_list_var = elements;
    SubLObject element = NIL;
    element = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      set.set_remove( element, v_set );
      cdolist_list_var = cdolist_list_var.rest();
      element = cdolist_list_var.first();
    }
    return v_set;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 13627L)
  public static SubLObject set_nmerge(final SubLObject target_set, final SubLObject source_set)
  {
    assert NIL != set.set_p( target_set ) : target_set;
    assert NIL != set.set_p( source_set ) : source_set;
    final SubLObject set_contents_var = set.do_set_internal( source_set );
    SubLObject basis_object;
    SubLObject state;
    SubLObject element;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      element = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, element ) )
      {
        set.set_add( element, target_set );
      }
    }
    return target_set;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 13904L)
  public static SubLObject do_set_numbered(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list13 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject elem = NIL;
    SubLObject counter = NIL;
    SubLObject v_set = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list13 );
    elem = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list13 );
    counter = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list13 );
    v_set = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list13 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list13 );
      if( NIL == conses_high.member( current_$1, $list14, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw15$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list13 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw16$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.list( $sym17$CLET, ConsesLow.list( reader.bq_cons( counter, $list18 ) ), ConsesLow.listS( $sym19$DO_SET, ConsesLow.list( elem, v_set, $kw16$DONE, done ), ConsesLow.append( body, ConsesLow.list(
        ConsesLow.list( $sym20$CINC, counter ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 14687L)
  public static SubLObject sliding_window_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 14687L)
  public static SubLObject sliding_window_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $sliding_window_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 14687L)
  public static SubLObject sldwnd_window(final SubLObject v_object)
  {
    assert NIL != sliding_window_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 14687L)
  public static SubLObject sldwnd_set_a(final SubLObject v_object)
  {
    assert NIL != sliding_window_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 14687L)
  public static SubLObject sldwnd_set_b(final SubLObject v_object)
  {
    assert NIL != sliding_window_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 14687L)
  public static SubLObject sldwnd_window_a(final SubLObject v_object)
  {
    assert NIL != sliding_window_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 14687L)
  public static SubLObject sldwnd_window_b(final SubLObject v_object)
  {
    assert NIL != sliding_window_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 14687L)
  public static SubLObject _csetf_sldwnd_window(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sliding_window_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 14687L)
  public static SubLObject _csetf_sldwnd_set_a(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sliding_window_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 14687L)
  public static SubLObject _csetf_sldwnd_set_b(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sliding_window_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 14687L)
  public static SubLObject _csetf_sldwnd_window_a(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sliding_window_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 14687L)
  public static SubLObject _csetf_sldwnd_window_b(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sliding_window_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 14687L)
  public static SubLObject make_sliding_window(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $sliding_window_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw40$WINDOW ) )
      {
        _csetf_sldwnd_window( v_new, current_value );
      }
      else if( pcase_var.eql( $kw41$SET_A ) )
      {
        _csetf_sldwnd_set_a( v_new, current_value );
      }
      else if( pcase_var.eql( $kw42$SET_B ) )
      {
        _csetf_sldwnd_set_b( v_new, current_value );
      }
      else if( pcase_var.eql( $kw43$WINDOW_A ) )
      {
        _csetf_sldwnd_window_a( v_new, current_value );
      }
      else if( pcase_var.eql( $kw44$WINDOW_B ) )
      {
        _csetf_sldwnd_window_b( v_new, current_value );
      }
      else
      {
        Errors.error( $str45$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 14687L)
  public static SubLObject visit_defstruct_sliding_window(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw46$BEGIN, $sym47$MAKE_SLIDING_WINDOW, FIVE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw48$SLOT, $kw40$WINDOW, sldwnd_window( obj ) );
    Functions.funcall( visitor_fn, obj, $kw48$SLOT, $kw41$SET_A, sldwnd_set_a( obj ) );
    Functions.funcall( visitor_fn, obj, $kw48$SLOT, $kw42$SET_B, sldwnd_set_b( obj ) );
    Functions.funcall( visitor_fn, obj, $kw48$SLOT, $kw43$WINDOW_A, sldwnd_window_a( obj ) );
    Functions.funcall( visitor_fn, obj, $kw48$SLOT, $kw44$WINDOW_B, sldwnd_window_b( obj ) );
    Functions.funcall( visitor_fn, obj, $kw49$END, $sym47$MAKE_SLIDING_WINDOW, FIVE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 14687L)
  public static SubLObject visit_defstruct_object_sliding_window_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_sliding_window( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 14934L)
  public static SubLObject new_sliding_window(final SubLObject window_size, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    final SubLObject slw = make_sliding_window( UNPROVIDED );
    _csetf_sldwnd_window( slw, window_size );
    _csetf_sldwnd_set_a( slw, set.new_set( test, window_size ) );
    _csetf_sldwnd_set_b( slw, set.new_set( test, window_size ) );
    _csetf_sldwnd_window_a( slw, queues.create_queue( UNPROVIDED ) );
    _csetf_sldwnd_window_b( slw, queues.create_queue( UNPROVIDED ) );
    return slw;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 15563L)
  public static SubLObject sliding_window_add_a(final SubLObject element, final SubLObject slw)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_set = sldwnd_set_a( slw );
    final SubLObject window = sldwnd_window_a( slw );
    final SubLObject window_size = sldwnd_window( slw );
    thread.resetMultipleValues();
    final SubLObject newP = sliding_window_add_element( element, v_set, window, window_size );
    final SubLObject old_element = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return Values.values( newP, old_element );
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 16055L)
  public static SubLObject sliding_window_add_b(final SubLObject element, final SubLObject slw)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_set = sldwnd_set_b( slw );
    final SubLObject window = sldwnd_window_b( slw );
    final SubLObject window_size = sldwnd_window( slw );
    thread.resetMultipleValues();
    final SubLObject newP = sliding_window_add_element( element, v_set, window, window_size );
    final SubLObject old_element = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return Values.values( newP, old_element );
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 16545L)
  public static SubLObject sliding_window_overlapP(final SubLObject slw, final SubLObject amount)
  {
    return sets_intersect_by( sldwnd_set_a( slw ), sldwnd_set_b( slw ), amount );
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 16834L)
  public static SubLObject sliding_window_intersection(final SubLObject slw)
  {
    final SubLObject set_a = sldwnd_set_a( slw );
    final SubLObject set_b = sldwnd_set_b( slw );
    final SubLObject test = set.set_test( set_a );
    return set_intersection( ConsesLow.list( set_a, set_b ), test );
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 17110L)
  public static SubLObject sliding_window_add_element(final SubLObject element, final SubLObject v_set, final SubLObject window, final SubLObject window_size)
  {
    final SubLObject new_comer = set.set_add( element, v_set );
    if( NIL == list_utilities.sublisp_boolean( new_comer ) )
    {
      queues.remqueue( element, window, set.set_test( v_set ) );
      queues.enqueue( element, window );
      return Values.values( NIL, NIL );
    }
    queues.enqueue( element, window );
    if( window_size.numL( set.set_size( v_set ) ) )
    {
      final SubLObject loser = queues.dequeue( window );
      set.set_remove( loser, v_set );
      return Values.values( T, loser );
    }
    return Values.values( T, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-utilities.lisp", position = 18100L)
  public static SubLObject test_sliding_windows(final SubLObject list_a, final SubLObject list_b, final SubLObject window, final SubLObject shared)
  {
    final SubLObject test = EQUAL;
    final SubLObject amount = Sequences.length( shared );
    final SubLObject shared_set = construct_set_from_list( shared, test, amount );
    final SubLObject slw = new_sliding_window( window, test );
    for( SubLObject cursor_a = list_a, cursor_b = list_b; NIL != list_utilities.sublisp_boolean( cursor_a ) || NIL != list_utilities.sublisp_boolean( cursor_b ); cursor_a = cursor_a.rest(), cursor_b = cursor_b.rest() )
    {
      sliding_window_add_a( cursor_a.first(), slw );
      sliding_window_add_b( cursor_b.first(), slw );
      if( NIL != sliding_window_overlapP( slw, amount ) )
      {
        final SubLObject intersection = sliding_window_intersection( slw );
        if( NIL != sets_coextensionalP( intersection, shared_set ) )
        {
          return $kw59$SUCCESS;
        }
        Errors.error( $str60$Set__A_is_not_co_extensional_with, intersection, shared_set );
      }
    }
    return $kw61$FAILURE;
  }

  public static SubLObject declare_set_utilities_file()
  {
    SubLFiles.declareFunction( me, "set_arbitrary_element", "SET-ARBITRARY-ELEMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "set_arbitrary_element_without_values", "SET-ARBITRARY-ELEMENT-WITHOUT-VALUES", 1, 1, false );
    SubLFiles.declareFunction( me, "set_contents_arbitrary_element", "SET-CONTENTS-ARBITRARY-ELEMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "set_contents_arbitrary_element_without_values", "SET-CONTENTS-ARBITRARY-ELEMENT-WITHOUT-VALUES", 1, 1, false );
    SubLFiles.declareFunction( me, "set_remove_random_element", "SET-REMOVE-RANDOM-ELEMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "set_union", "SET-UNION", 1, 1, false );
    SubLFiles.declareFunction( me, "set_contents_union", "SET-CONTENTS-UNION", 1, 1, false );
    SubLFiles.declareFunction( me, "set_intersection", "SET-INTERSECTION", 1, 1, false );
    SubLFiles.declareFunction( me, "set_contents_intersection", "SET-CONTENTS-INTERSECTION", 1, 1, false );
    SubLFiles.declareFunction( me, "sets_intersectP", "SETS-INTERSECT?", 1, 0, false );
    SubLFiles.declareFunction( me, "set_intersection_fraction", "SET-INTERSECTION-FRACTION", 2, 0, false );
    SubLFiles.declareFunction( me, "sets_intersect_by", "SETS-INTERSECT-BY", 3, 0, false );
    SubLFiles.declareFunction( me, "set_minus", "SET-MINUS", 2, 1, false );
    SubLFiles.declareFunction( me, "set_nprune", "SET-NPRUNE", 2, 0, false );
    SubLFiles.declareFunction( me, "set_prune", "SET-PRUNE", 2, 0, false );
    SubLFiles.declareFunction( me, "sets_coextensionalP", "SETS-COEXTENSIONAL?", 2, 0, false );
    SubLFiles.declareFunction( me, "default_test_function_for_sets", "DEFAULT-TEST-FUNCTION-FOR-SETS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_subsetP", "SET-SUBSET?", 2, 0, false );
    SubLFiles.declareFunction( me, "set_subset_anyP", "SET-SUBSET-ANY?", 2, 0, false );
    SubLFiles.declareFunction( me, "set_find", "SET-FIND", 2, 2, false );
    SubLFiles.declareFunction( me, "set_find_if", "SET-FIND-IF", 2, 1, false );
    SubLFiles.declareFunction( me, "set_find_if_not", "SET-FIND-IF-NOT", 2, 1, false );
    SubLFiles.declareFunction( me, "set_remove_if", "SET-REMOVE-IF", 2, 1, false );
    SubLFiles.declareFunction( me, "set_remove_if_not", "SET-REMOVE-IF-NOT", 2, 1, false );
    SubLFiles.declareFunction( me, "construct_set_from_list", "CONSTRUCT-SET-FROM-LIST", 1, 2, false );
    SubLFiles.declareFunction( me, "construct_set_contents_from_list", "CONSTRUCT-SET-CONTENTS-FROM-LIST", 1, 2, false );
    SubLFiles.declareFunction( me, "new_singleton_set", "NEW-SINGLETON-SET", 1, 1, false );
    SubLFiles.declareFunction( me, "make_set_from_list", "MAKE-SET-FROM-LIST", 1, 1, false );
    SubLFiles.declareFunction( me, "any_in_set", "ANY-IN-SET", 2, 1, false );
    SubLFiles.declareFunction( me, "every_in_set", "EVERY-IN-SET", 2, 1, false );
    SubLFiles.declareFunction( me, "print_set_contents", "PRINT-SET-CONTENTS", 1, 1, false );
    SubLFiles.declareFunction( me, "set_add_all", "SET-ADD-ALL", 2, 0, false );
    SubLFiles.declareFunction( me, "set_add_set", "SET-ADD-SET", 2, 0, false );
    SubLFiles.declareFunction( me, "set_remove_all", "SET-REMOVE-ALL", 2, 0, false );
    SubLFiles.declareFunction( me, "set_nmerge", "SET-NMERGE", 2, 0, false );
    SubLFiles.declareMacro( me, "do_set_numbered", "DO-SET-NUMBERED" );
    SubLFiles.declareFunction( me, "sliding_window_print_function_trampoline", "SLIDING-WINDOW-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "sliding_window_p", "SLIDING-WINDOW-P", 1, 0, false );
    new $sliding_window_p$UnaryFunction();
    SubLFiles.declareFunction( me, "sldwnd_window", "SLDWND-WINDOW", 1, 0, false );
    SubLFiles.declareFunction( me, "sldwnd_set_a", "SLDWND-SET-A", 1, 0, false );
    SubLFiles.declareFunction( me, "sldwnd_set_b", "SLDWND-SET-B", 1, 0, false );
    SubLFiles.declareFunction( me, "sldwnd_window_a", "SLDWND-WINDOW-A", 1, 0, false );
    SubLFiles.declareFunction( me, "sldwnd_window_b", "SLDWND-WINDOW-B", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sldwnd_window", "_CSETF-SLDWND-WINDOW", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sldwnd_set_a", "_CSETF-SLDWND-SET-A", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sldwnd_set_b", "_CSETF-SLDWND-SET-B", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sldwnd_window_a", "_CSETF-SLDWND-WINDOW-A", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sldwnd_window_b", "_CSETF-SLDWND-WINDOW-B", 2, 0, false );
    SubLFiles.declareFunction( me, "make_sliding_window", "MAKE-SLIDING-WINDOW", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_sliding_window", "VISIT-DEFSTRUCT-SLIDING-WINDOW", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_sliding_window_method", "VISIT-DEFSTRUCT-OBJECT-SLIDING-WINDOW-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_sliding_window", "NEW-SLIDING-WINDOW", 1, 1, false );
    SubLFiles.declareFunction( me, "sliding_window_add_a", "SLIDING-WINDOW-ADD-A", 2, 0, false );
    SubLFiles.declareFunction( me, "sliding_window_add_b", "SLIDING-WINDOW-ADD-B", 2, 0, false );
    SubLFiles.declareFunction( me, "sliding_window_overlapP", "SLIDING-WINDOW-OVERLAP?", 2, 0, false );
    SubLFiles.declareFunction( me, "sliding_window_intersection", "SLIDING-WINDOW-INTERSECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "sliding_window_add_element", "SLIDING-WINDOW-ADD-ELEMENT", 4, 0, false );
    SubLFiles.declareFunction( me, "test_sliding_windows", "TEST-SLIDING-WINDOWS", 4, 0, false );
    return NIL;
  }

  public static SubLObject init_set_utilities_file()
  {
    $empty_set$ = SubLFiles.deflexical( "*EMPTY-SET*", maybeDefault( $sym0$_EMPTY_SET_, $empty_set$, () -> ( set.new_set( Symbols.symbol_function( EQ ), ZERO_INTEGER ) ) ) );
    $dtp_sliding_window$ = SubLFiles.defconstant( "*DTP-SLIDING-WINDOW*", $sym21$SLIDING_WINDOW );
    return NIL;
  }

  public static SubLObject setup_set_utilities_file()
  {
    subl_macro_promotions.declare_defglobal( $sym0$_EMPTY_SET_ );
    access_macros.define_obsolete_register( $sym10$MAKE_SET_FROM_LIST, $list11 );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_sliding_window$.getGlobalValue(), Symbols.symbol_function( $sym28$SLIDING_WINDOW_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list29 );
    Structures.def_csetf( $sym30$SLDWND_WINDOW, $sym31$_CSETF_SLDWND_WINDOW );
    Structures.def_csetf( $sym32$SLDWND_SET_A, $sym33$_CSETF_SLDWND_SET_A );
    Structures.def_csetf( $sym34$SLDWND_SET_B, $sym35$_CSETF_SLDWND_SET_B );
    Structures.def_csetf( $sym36$SLDWND_WINDOW_A, $sym37$_CSETF_SLDWND_WINDOW_A );
    Structures.def_csetf( $sym38$SLDWND_WINDOW_B, $sym39$_CSETF_SLDWND_WINDOW_B );
    Equality.identity( $sym21$SLIDING_WINDOW );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sliding_window$.getGlobalValue(), Symbols.symbol_function( $sym50$VISIT_DEFSTRUCT_OBJECT_SLIDING_WINDOW_METHOD ) );
    generic_testing.define_test_case_table_int( $sym51$TEST_SLIDING_WINDOWS, ConsesLow.list( new SubLObject[] { $kw52$TEST, EQL, $kw53$OWNER, NIL, $kw54$CLASSES, NIL, $kw55$KB, $kw56$TINY, $kw57$WORKING_, T
    } ), $list58 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_set_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_set_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_set_utilities_file();
  }
  static
  {
    me = new set_utilities();
    $empty_set$ = null;
    $dtp_sliding_window$ = null;
    $sym0$_EMPTY_SET_ = makeSymbol( "*EMPTY-SET*" );
    $sym1$SET_P = makeSymbol( "SET-P" );
    $sym2$LISTP = makeSymbol( "LISTP" );
    $sym3$VALID_HASH_TEST_P = makeSymbol( "VALID-HASH-TEST-P" );
    $sym4$SET_SIZE = makeSymbol( "SET-SIZE" );
    $sym5$NON_DOTTED_LIST_P = makeSymbol( "NON-DOTTED-LIST-P" );
    $sym6$SET_CONTENTS_P = makeSymbol( "SET-CONTENTS-P" );
    $sym7$SET_CONTENTS_SIZE = makeSymbol( "SET-CONTENTS-SIZE" );
    $sym8$_ = makeSymbol( "<" );
    $sym9$SET_TEST = makeSymbol( "SET-TEST" );
    $sym10$MAKE_SET_FROM_LIST = makeSymbol( "MAKE-SET-FROM-LIST" );
    $list11 = ConsesLow.list( makeSymbol( "CONSTRUCT-SET-FROM-LIST" ) );
    $str12$_A__ = makeString( "~A~%" );
    $list13 = ConsesLow.list( ConsesLow.list( makeSymbol( "ELEM" ), makeSymbol( "COUNTER" ), makeSymbol( "SET" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list14 = ConsesLow.list( makeKeyword( "DONE" ) );
    $kw15$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw16$DONE = makeKeyword( "DONE" );
    $sym17$CLET = makeSymbol( "CLET" );
    $list18 = ConsesLow.list( ZERO_INTEGER );
    $sym19$DO_SET = makeSymbol( "DO-SET" );
    $sym20$CINC = makeSymbol( "CINC" );
    $sym21$SLIDING_WINDOW = makeSymbol( "SLIDING-WINDOW" );
    $sym22$SLIDING_WINDOW_P = makeSymbol( "SLIDING-WINDOW-P" );
    $list23 = ConsesLow.list( makeSymbol( "WINDOW" ), makeSymbol( "SET-A" ), makeSymbol( "SET-B" ), makeSymbol( "WINDOW-A" ), makeSymbol( "WINDOW-B" ) );
    $list24 = ConsesLow.list( makeKeyword( "WINDOW" ), makeKeyword( "SET-A" ), makeKeyword( "SET-B" ), makeKeyword( "WINDOW-A" ), makeKeyword( "WINDOW-B" ) );
    $list25 = ConsesLow.list( makeSymbol( "SLDWND-WINDOW" ), makeSymbol( "SLDWND-SET-A" ), makeSymbol( "SLDWND-SET-B" ), makeSymbol( "SLDWND-WINDOW-A" ), makeSymbol( "SLDWND-WINDOW-B" ) );
    $list26 = ConsesLow.list( makeSymbol( "_CSETF-SLDWND-WINDOW" ), makeSymbol( "_CSETF-SLDWND-SET-A" ), makeSymbol( "_CSETF-SLDWND-SET-B" ), makeSymbol( "_CSETF-SLDWND-WINDOW-A" ), makeSymbol(
        "_CSETF-SLDWND-WINDOW-B" ) );
    $sym27$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $sym28$SLIDING_WINDOW_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "SLIDING-WINDOW-PRINT-FUNCTION-TRAMPOLINE" );
    $list29 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "SLIDING-WINDOW-P" ) );
    $sym30$SLDWND_WINDOW = makeSymbol( "SLDWND-WINDOW" );
    $sym31$_CSETF_SLDWND_WINDOW = makeSymbol( "_CSETF-SLDWND-WINDOW" );
    $sym32$SLDWND_SET_A = makeSymbol( "SLDWND-SET-A" );
    $sym33$_CSETF_SLDWND_SET_A = makeSymbol( "_CSETF-SLDWND-SET-A" );
    $sym34$SLDWND_SET_B = makeSymbol( "SLDWND-SET-B" );
    $sym35$_CSETF_SLDWND_SET_B = makeSymbol( "_CSETF-SLDWND-SET-B" );
    $sym36$SLDWND_WINDOW_A = makeSymbol( "SLDWND-WINDOW-A" );
    $sym37$_CSETF_SLDWND_WINDOW_A = makeSymbol( "_CSETF-SLDWND-WINDOW-A" );
    $sym38$SLDWND_WINDOW_B = makeSymbol( "SLDWND-WINDOW-B" );
    $sym39$_CSETF_SLDWND_WINDOW_B = makeSymbol( "_CSETF-SLDWND-WINDOW-B" );
    $kw40$WINDOW = makeKeyword( "WINDOW" );
    $kw41$SET_A = makeKeyword( "SET-A" );
    $kw42$SET_B = makeKeyword( "SET-B" );
    $kw43$WINDOW_A = makeKeyword( "WINDOW-A" );
    $kw44$WINDOW_B = makeKeyword( "WINDOW-B" );
    $str45$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw46$BEGIN = makeKeyword( "BEGIN" );
    $sym47$MAKE_SLIDING_WINDOW = makeSymbol( "MAKE-SLIDING-WINDOW" );
    $kw48$SLOT = makeKeyword( "SLOT" );
    $kw49$END = makeKeyword( "END" );
    $sym50$VISIT_DEFSTRUCT_OBJECT_SLIDING_WINDOW_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-SLIDING-WINDOW-METHOD" );
    $sym51$TEST_SLIDING_WINDOWS = makeSymbol( "TEST-SLIDING-WINDOWS" );
    $kw52$TEST = makeKeyword( "TEST" );
    $kw53$OWNER = makeKeyword( "OWNER" );
    $kw54$CLASSES = makeKeyword( "CLASSES" );
    $kw55$KB = makeKeyword( "KB" );
    $kw56$TINY = makeKeyword( "TINY" );
    $kw57$WORKING_ = makeKeyword( "WORKING?" );
    $list58 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( new SubLObject[] { TEN_INTEGER, NINE_INTEGER, EIGHT_INTEGER, SEVEN_INTEGER, SIX_INTEGER, FIVE_INTEGER, FOUR_INTEGER, THREE_INTEGER,
      TWO_INTEGER, ONE_INTEGER
    } ), ConsesLow.list( EIGHT_INTEGER, SEVEN_INTEGER, SIX_INTEGER, FIVE_INTEGER, FOUR_INTEGER, THREE_INTEGER, TWO_INTEGER, ONE_INTEGER ), FIVE_INTEGER, ConsesLow.list( EIGHT_INTEGER, SEVEN_INTEGER, SIX_INTEGER ) ),
        makeKeyword( "SUCCESS" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( new SubLObject[]
        { TWELVE_INTEGER, ELEVEN_INTEGER, TEN_INTEGER, EIGHT_INTEGER, SEVEN_INTEGER, FIVE_INTEGER, FOUR_INTEGER, THREE_INTEGER, TWO_INTEGER, ONE_INTEGER
    } ), ConsesLow.list( new SubLObject[] { TEN_INTEGER, NINE_INTEGER, EIGHT_INTEGER, SEVEN_INTEGER, SIX_INTEGER, FIVE_INTEGER, FOUR_INTEGER, THREE_INTEGER, TWO_INTEGER, ONE_INTEGER
    } ), FOUR_INTEGER, ConsesLow.list( EIGHT_INTEGER, SEVEN_INTEGER, FIVE_INTEGER ) ), makeKeyword( "SUCCESS" ) ) );
    $kw59$SUCCESS = makeKeyword( "SUCCESS" );
    $str60$Set__A_is_not_co_extensional_with = makeString( "Set ~A is not co-extensional with expected set ~A." );
    $kw61$FAILURE = makeKeyword( "FAILURE" );
  }

  public static final class $sliding_window_native
      extends
        SubLStructNative
  {
    public SubLObject $window;
    public SubLObject $set_a;
    public SubLObject $set_b;
    public SubLObject $window_a;
    public SubLObject $window_b;
    private static final SubLStructDeclNative structDecl;

    public $sliding_window_native()
    {
      this.$window = CommonSymbols.NIL;
      this.$set_a = CommonSymbols.NIL;
      this.$set_b = CommonSymbols.NIL;
      this.$window_a = CommonSymbols.NIL;
      this.$window_b = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $sliding_window_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$window;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$set_a;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$set_b;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$window_a;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$window_b;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$window = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$set_a = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$set_b = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$window_a = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$window_b = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $sliding_window_native.class, $sym21$SLIDING_WINDOW, $sym22$SLIDING_WINDOW_P, $list23, $list24, new String[] { "$window", "$set_a", "$set_b", "$window_a", "$window_b"
      }, $list25, $list26, $sym27$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $sliding_window_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $sliding_window_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SLIDING-WINDOW-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return sliding_window_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 335 ms
 * 
 */