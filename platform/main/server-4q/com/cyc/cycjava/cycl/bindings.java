package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class bindings
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.bindings";
  public static final String myFingerPrint = "702c04017a90169619700dc168954a43e9477a7ff0ab30105c411ed52c8c9b2a";
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 809L)
  private static SubLSymbol $hl_identity_binding_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1017L)
  private static SubLSymbol $hl_identity_bindings_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7376L)
  public static SubLSymbol $dont_care_variable_binding_value$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20858L)
  private static SubLSymbol $dummy_binding$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21652L)
  private static SubLSymbol $unification_success_token$;
  private static final SubLSymbol $sym0$HL_IDENTITY_BINDING;
  private static final SubLSymbol $sym1$NON_NEGATIVE_INTEGER_P;
  private static final SubLSymbol $sym2$_HL_IDENTITY_BINDING_CACHING_STATE_;
  private static final SubLSymbol $sym3$HL_IDENTITY_BINDINGS;
  private static final SubLSymbol $sym4$_HL_IDENTITY_BINDINGS_CACHING_STATE_;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$BINDING_P;
  private static final SubLSymbol $sym7$BINDING_LIST_P;
  private static final SubLSymbol $sym8$VARIABLE_TO_VARIABLE_BINDING_P;
  private static final SubLSymbol $sym9$INFERENCE_BINDING_P;
  private static final SubLSymbol $sym10$INFERENCE_BINDING_SET_P;
  private static final SubLObject $const11$ELInferenceBindingFn;
  private static final SubLObject $const12$TheTermBindingFn;
  private static final SubLSymbol $sym13$KB_BINDING_P;
  private static final SubLSymbol $sym14$KB_BINDING_SET_P;
  private static final SubLSymbol $sym15$BINDING_EQUAL_MODULO_EL_VAR_NAMES_;
  private static final SubLSymbol $sym16$BINDINGS_EQUAL_;
  private static final SubLSymbol $kw17$DONT_CARE;
  private static final SubLSymbol $sym18$VARIABLE_BINDING_VARIABLE;
  private static final SubLSymbol $sym19$VARIABLE_BINDING_VALUE;
  private static final SubLList $list20;
  private static final SubLSymbol $sym21$BINDINGS_P;
  private static final SubLSymbol $sym22$VARIABLE_MAP_P;
  private static final SubLList $list23;
  private static final SubLString $str24$Incomplete_variable_map__a_applie;
  private static final SubLList $list25;
  private static final SubLList $list26;
  private static final SubLList $list27;
  private static final SubLSymbol $sym28$FULLY_BOUND_P;
  private static final SubLSymbol $sym29$_DUMMY_BINDING_;
  private static final SubLSymbol $sym30$LISTP;
  private static final SubLSymbol $sym31$KB_SET_OF_BINDING_SETS_P;
  private static final SubLSymbol $sym32$BINDING_LISTS_P;
  private static final SubLList $list33;
  private static final SubLSymbol $sym34$INFERENCE_SET_OF_BINDING_SETS_P;
  private static final SubLSymbol $sym35$KB_BINDING_VARIABLE;
  private static final SubLSymbol $sym36$KB_BINDING_VALUE;
  private static final SubLSymbol $sym37$EL_VAR_;
  private static final SubLSymbol $sym38$KB_BINDING_SET_VALUES;
  private static final SubLString $str39$_A_is_neither_EL_VAR__nor_FORT_P_;
  private static final SubLSymbol $sym40$FORT_P;
  private static final SubLString $str41$Some_element_of__A_is_not_a_KB_BI;
  private static final SubLString $str42$Some_element_of__A_is_not_a_KB_BI;
  private static final SubLSymbol $sym43$TRANSFER_VARIABLE_MAP_TO_BINDINGS;
  private static final SubLSymbol $kw44$TEST;
  private static final SubLSymbol $kw45$OWNER;
  private static final SubLSymbol $kw46$CLASSES;
  private static final SubLSymbol $kw47$KB;
  private static final SubLSymbol $kw48$TINY;
  private static final SubLSymbol $kw49$WORKING_;
  private static final SubLList $list50;
  private static final SubLSymbol $sym51$TRANSFER_VARIABLE_MAP_TO_BINDINGS_FILTERED;
  private static final SubLList $list52;
  private static final SubLSymbol $sym53$TRANSFER_VARIABLE_MAP_TO_BINDINGS_BACKWARDS;
  private static final SubLList $list54;
  private static final SubLSymbol $sym55$COMPOSE_BINDINGS;
  private static final SubLList $list56;
  private static final SubLSymbol $sym57$COMPOSE_BINDINGS_FILTERED;
  private static final SubLList $list58;
  private static final SubLSymbol $kw59$FULL;
  private static final SubLList $list60;
  private static final SubLList $list61;
  private static final SubLList $list62;
  private static final SubLSymbol $sym63$INFERENCIFY_KB_SET_OF_BINDING_SETS;
  private static final SubLList $list64;
  private static final SubLSymbol $sym65$KBIFY_SET_OF_BINDING_SETS;
  private static final SubLSymbol $sym66$TEST_KBIFIED_SET_OF_BINDING_SETS;
  private static final SubLList $list67;
  private static final SubLSymbol $sym68$KBIFY_INFERENCE_SET_OF_BINDING_SETS;
  private static final SubLList $list69;
  private static final SubLSymbol $sym70$KB_BINDING_SET_VARIABLES;
  private static final SubLList $list71;
  private static final SubLList $list72;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 809L)
  public static SubLObject clear_hl_identity_binding()
  {
    final SubLObject cs = $hl_identity_binding_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 809L)
  public static SubLObject remove_hl_identity_binding(final SubLObject n)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $hl_identity_binding_caching_state$.getGlobalValue(), ConsesLow.list( n ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 809L)
  public static SubLObject hl_identity_binding_internal(final SubLObject n)
  {
    assert NIL != subl_promotions.non_negative_integer_p( n ) : n;
    final SubLObject variable = variables.find_variable_by_id( n );
    return make_variable_binding( variable, variable );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 809L)
  public static SubLObject hl_identity_binding(final SubLObject n)
  {
    SubLObject caching_state = $hl_identity_binding_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym0$HL_IDENTITY_BINDING, $sym2$_HL_IDENTITY_BINDING_CACHING_STATE_, NIL, EQL, ONE_INTEGER, TEN_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, n, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( hl_identity_binding_internal( n ) ) );
      memoization_state.caching_state_put( caching_state, n, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1017L)
  public static SubLObject clear_hl_identity_bindings()
  {
    final SubLObject cs = $hl_identity_bindings_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1017L)
  public static SubLObject remove_hl_identity_bindings(final SubLObject n)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $hl_identity_bindings_caching_state$.getGlobalValue(), ConsesLow.list( n ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1017L)
  public static SubLObject hl_identity_bindings_internal(final SubLObject n)
  {
    assert NIL != subl_promotions.non_negative_integer_p( n ) : n;
    if( n.isZero() )
    {
      return NIL;
    }
    final SubLObject n_1 = number_utilities.f_1_( n );
    final SubLObject variable = variables.find_variable_by_id( n_1 );
    return add_variable_binding( variable, variable, hl_identity_bindings( n_1 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1017L)
  public static SubLObject hl_identity_bindings(final SubLObject n)
  {
    SubLObject caching_state = $hl_identity_bindings_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym3$HL_IDENTITY_BINDINGS, $sym4$_HL_IDENTITY_BINDINGS_CACHING_STATE_, NIL, EQL, ONE_INTEGER, TEN_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, n, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( hl_identity_bindings_internal( n ) ) );
      memoization_state.caching_state_put( caching_state, n, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1394L)
  public static SubLObject binding_p(final SubLObject v_object)
  {
    return Types.consp( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1563L)
  public static SubLObject variable_to_variable_binding_p(final SubLObject v_object)
  {
    if( NIL != binding_p( v_object ) )
    {
      SubLObject a = NIL;
      SubLObject b = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( v_object, v_object, $list5 );
      a = v_object.first();
      final SubLObject current = b = v_object.rest();
      return makeBoolean( NIL != cycl_variables.cyc_varP( a ) && NIL != cycl_variables.cyc_varP( b ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1753L)
  public static SubLObject bindings_p(final SubLObject v_object)
  {
    return binding_list_p( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1822L)
  public static SubLObject binding_list_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != list_utilities.non_dotted_list_p( v_object ) && NIL != list_utilities.every_in_list( $sym6$BINDING_P, v_object, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1997L)
  public static SubLObject non_empty_binding_list_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != v_object && NIL != binding_list_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2190L)
  public static SubLObject binding_lists_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != list_utilities.non_dotted_list_p( v_object ) && NIL != list_utilities.every_in_list( $sym7$BINDING_LIST_P, v_object, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2380L)
  public static SubLObject variable_map_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != binding_list_p( v_object ) && NIL != list_utilities.every_in_list( $sym8$VARIABLE_TO_VARIABLE_BINDING_P, v_object, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2521L)
  public static SubLObject inference_binding_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != binding_p( v_object ) && NIL != cycl_variables.el_varP( variable_binding_variable( v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2781L)
  public static SubLObject inference_binding_set_p(final SubLObject v_object)
  {
    return makeBoolean( NIL == v_object || ( NIL != list_utilities.non_dotted_list_p( v_object ) && NIL != list_utilities.every_in_list( Symbols.symbol_function( $sym9$INFERENCE_BINDING_P ), v_object, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3008L)
  public static SubLObject inference_set_of_binding_sets_p(final SubLObject v_object)
  {
    return makeBoolean( NIL == v_object || ( NIL != list_utilities.non_dotted_list_p( v_object ) && NIL != list_utilities.every_in_list( Symbols.symbol_function( $sym10$INFERENCE_BINDING_SET_P ), v_object,
        UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3251L)
  public static SubLObject kb_binding_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != kb_inference_binding_p( v_object ) || NIL != kb_the_term_binding_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3508L)
  public static SubLObject kb_inference_binding_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != cycl_utilities.naut_with_functor_p( v_object, $const11$ELInferenceBindingFn ) && NIL != cycl_variables.el_varP( cycl_utilities.nat_arg1( v_object, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3734L)
  public static SubLObject kb_the_term_binding_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != cycl_utilities.naut_with_functor_p( v_object, $const12$TheTermBindingFn ) && NIL != forts.fort_p( cycl_utilities.nat_arg1( v_object, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3957L)
  public static SubLObject kb_binding_set_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_utilities.el_empty_set_p( v_object ) || ( NIL != el_utilities.possibly_naut_p( v_object ) && NIL != el_utilities.el_extensional_set_p( v_object ) && NIL != list_utilities.every_in_list(
        Symbols.symbol_function( $sym13$KB_BINDING_P ), el_utilities.extensional_set_elements( v_object ), UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4240L)
  public static SubLObject kb_set_of_binding_sets_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_utilities.el_empty_set_p( v_object ) || ( NIL != el_utilities.possibly_naut_p( v_object ) && NIL != el_utilities.el_extensional_set_p( v_object ) && NIL != list_utilities.every_in_list(
        Symbols.symbol_function( $sym14$KB_BINDING_SET_P ), el_utilities.extensional_set_elements( v_object ), UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4539L)
  public static SubLObject subst_bindings(final SubLObject v_bindings, final SubLObject v_object)
  {
    return ( NIL != binding_list_p( v_bindings ) ) ? apply_bindings( v_bindings, v_object ) : v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4873L)
  public static SubLObject equal_bindings(final SubLObject bindings_1, final SubLObject bindings_2)
  {
    return bindings_equalP( bindings_1, bindings_2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5053L)
  public static SubLObject bindings_equalP(final SubLObject bindings_1, final SubLObject bindings_2)
  {
    return list_utilities.fast_sets_equalP( bindings_1, bindings_2, Symbols.symbol_function( EQUAL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5243L)
  public static SubLObject bindings_equal_modulo_el_var_namesP(final SubLObject bindings_1, final SubLObject bindings_2)
  {
    return list_utilities.fast_sets_equalP( bindings_1, bindings_2, $sym15$BINDING_EQUAL_MODULO_EL_VAR_NAMES_ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5481L)
  public static SubLObject binding_equal_modulo_el_var_namesP(final SubLObject binding1, final SubLObject binding2)
  {
    return makeBoolean( variable_binding_variable( binding1 ).equal( variable_binding_variable( binding2 ) ) && NIL != czer_utilities.equal_modulo_el_var_names( variable_binding_value( binding1 ), variable_binding_value(
        binding2 ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5764L)
  public static SubLObject lists_of_binding_lists_equalP(final SubLObject blists_1, final SubLObject blists_2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != list_utilities.lengthL( blists_1, list_utilities.$magic_hashing_cutoff$.getDynamicValue( thread ), UNPROVIDED ) && NIL != list_utilities.lengthL( blists_2, list_utilities.$magic_hashing_cutoff$
        .getDynamicValue( thread ), UNPROVIDED ) )
    {
      return list_utilities.sets_equalP( blists_1, blists_2, $sym16$BINDINGS_EQUAL_ );
    }
    final SubLObject equal_bindings = keyhash_utilities.fast_intersection( blists_1, blists_2, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED );
    final SubLObject diff_1 = list_utilities.fast_set_difference( blists_1, equal_bindings, Symbols.symbol_function( EQUAL ) );
    final SubLObject diff_2 = list_utilities.fast_set_difference( blists_2, equal_bindings, Symbols.symbol_function( EQUAL ) );
    return list_utilities.sets_equalP( diff_1, diff_2, $sym16$BINDINGS_EQUAL_ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6326L)
  public static SubLObject compare_lists_of_binding_lists(final SubLObject blists_1, final SubLObject blists_2)
  {
    final SubLObject equal_bindings = keyhash_utilities.fast_intersection( blists_1, blists_2, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED );
    final SubLObject diff_1 = list_utilities.fast_set_difference( blists_1, equal_bindings, Symbols.symbol_function( EQUAL ) );
    final SubLObject diff_2 = list_utilities.fast_set_difference( blists_2, equal_bindings, Symbols.symbol_function( EQUAL ) );
    return Values.values( conses_high.set_difference( diff_1, diff_2, $sym16$BINDINGS_EQUAL_, UNPROVIDED ), conses_high.set_difference( diff_2, diff_1, $sym16$BINDINGS_EQUAL_, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6767L)
  public static SubLObject variable_bound_p(final SubLObject variable, final SubLObject v_bindings)
  {
    return list_utilities.sublisp_boolean( get_variable_binding( variable, v_bindings ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7002L)
  public static SubLObject variable_lookup(final SubLObject variable, final SubLObject v_bindings)
  {
    return variable_binding_value( get_variable_binding( variable, v_bindings ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7187L)
  public static SubLObject add_variable_binding(final SubLObject variable, final SubLObject value, final SubLObject v_bindings)
  {
    return ConsesLow.cons( make_variable_binding( variable, value ), v_bindings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7447L)
  public static SubLObject add_dont_care_variable_binding(final SubLObject variable, final SubLObject v_bindings)
  {
    return add_variable_binding( variable, $dont_care_variable_binding_value$.getGlobalValue(), v_bindings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7727L)
  public static SubLObject make_variable_binding(final SubLObject variable, final SubLObject value)
  {
    return ConsesLow.cons( variable, value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7820L)
  public static SubLObject variable_binding_variable(final SubLObject binding)
  {
    return binding.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7932L)
  public static SubLObject variable_binding_value(final SubLObject binding)
  {
    return binding.rest();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8041L)
  public static SubLObject get_variable_binding(final SubLObject variable, final SubLObject v_bindings)
  {
    return conses_high.assoc( variable, v_bindings, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8200L)
  public static SubLObject get_value_binding(final SubLObject value, final SubLObject v_bindings, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    return conses_high.rassoc( value, v_bindings, test, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8416L)
  public static SubLObject make_variable_bindings(final SubLObject v_variables, final SubLObject values)
  {
    SubLObject v_bindings = NIL;
    SubLObject variable = NIL;
    SubLObject variable_$1 = NIL;
    SubLObject value = NIL;
    SubLObject value_$2 = NIL;
    variable = v_variables;
    variable_$1 = variable.first();
    value = values;
    value_$2 = value.first();
    while ( NIL != value || NIL != variable)
    {
      v_bindings = add_variable_binding( variable_$1, value_$2, v_bindings );
      variable = variable.rest();
      variable_$1 = variable.first();
      value = value.rest();
      value_$2 = value.first();
    }
    return Sequences.nreverse( v_bindings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8736L)
  public static SubLObject bindings_variables(final SubLObject v_bindings)
  {
    return Mapping.mapcar( $sym18$VARIABLE_BINDING_VARIABLE, v_bindings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8847L)
  public static SubLObject bindings_values(final SubLObject v_bindings)
  {
    return Mapping.mapcar( $sym19$VARIABLE_BINDING_VALUE, v_bindings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8941L)
  public static SubLObject apply_binding(final SubLObject binding, final SubLObject tree)
  {
    assert NIL != binding_p( binding ) : binding;
    SubLObject variable = NIL;
    SubLObject value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( binding, binding, $list20 );
    variable = binding.first();
    final SubLObject current = value = binding.rest();
    return conses_high.subst( value, variable, tree, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9636L)
  public static SubLObject apply_bindings(final SubLObject v_bindings, final SubLObject tree)
  {
    assert NIL != bindings_p( v_bindings ) : v_bindings;
    return conses_high.sublis( v_bindings, tree, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9876L)
  public static SubLObject apply_bindings_to_values(final SubLObject bindings_to_apply, final SubLObject target_bindings)
  {
    assert NIL != bindings_p( bindings_to_apply ) : bindings_to_apply;
    assert NIL != bindings_p( target_bindings ) : target_bindings;
    SubLObject modified_target_bindings = NIL;
    SubLObject cdolist_list_var = target_bindings;
    SubLObject target_binding = NIL;
    target_binding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = target_binding;
      SubLObject variable = NIL;
      SubLObject value = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
      variable = current.first();
      current = ( value = current.rest() );
      final SubLObject modified_value = apply_bindings( bindings_to_apply, value );
      final SubLObject modified_target_binding = make_variable_binding( variable, modified_value );
      modified_target_bindings = ConsesLow.cons( modified_target_binding, modified_target_bindings );
      cdolist_list_var = cdolist_list_var.rest();
      target_binding = cdolist_list_var.first();
    }
    return Sequences.nreverse( modified_target_bindings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10618L)
  public static SubLObject apply_bindings_backwards(final SubLObject v_bindings, final SubLObject tree)
  {
    assert NIL != bindings_p( v_bindings ) : v_bindings;
    return subl_promotions.rsublis( v_bindings, tree, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10869L)
  public static SubLObject apply_bindings_backwards_to_values(final SubLObject bindings_to_apply, final SubLObject target_bindings)
  {
    assert NIL != bindings_p( bindings_to_apply ) : bindings_to_apply;
    assert NIL != bindings_p( target_bindings ) : target_bindings;
    SubLObject modified_target_bindings = NIL;
    SubLObject cdolist_list_var = target_bindings;
    SubLObject target_binding = NIL;
    target_binding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = target_binding;
      SubLObject variable = NIL;
      SubLObject value = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
      variable = current.first();
      current = ( value = current.rest() );
      final SubLObject modified_value = apply_bindings_backwards( bindings_to_apply, value );
      final SubLObject modified_target_binding = make_variable_binding( variable, modified_value );
      modified_target_bindings = ConsesLow.cons( modified_target_binding, modified_target_bindings );
      cdolist_list_var = cdolist_list_var.rest();
      target_binding = cdolist_list_var.first();
    }
    return Sequences.nreverse( modified_target_bindings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11631L)
  public static SubLObject napply_binding(final SubLObject binding, final SubLObject tree)
  {
    assert NIL != binding_p( binding ) : binding;
    SubLObject variable = NIL;
    SubLObject value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( binding, binding, $list20 );
    variable = binding.first();
    final SubLObject current = value = binding.rest();
    return conses_high.nsubst( value, variable, tree, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11799L)
  public static SubLObject napply_bindings(final SubLObject v_bindings, final SubLObject tree)
  {
    assert NIL != bindings_p( v_bindings ) : v_bindings;
    return conses_high.nsublis( v_bindings, tree, Symbols.symbol_function( EQ ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12022L)
  public static SubLObject napply_bindings_backwards(final SubLObject v_bindings, final SubLObject tree)
  {
    assert NIL != bindings_p( v_bindings ) : v_bindings;
    return subl_promotions.nrsublis( v_bindings, tree, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12210L)
  public static SubLObject napply_bindings_backwards_to_list(final SubLObject v_bindings, final SubLObject list)
  {
    assert NIL != bindings_p( v_bindings ) : v_bindings;
    SubLObject cons;
    for( cons = NIL, cons = list; !cons.isAtom(); cons = cons.rest() )
    {
      ConsesLow.rplaca( cons, subl_promotions.nrsublis( v_bindings, cons.first(), UNPROVIDED, UNPROVIDED ) );
    }
    return list;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12532L)
  public static SubLObject transfer_variable_map_to_bindings(final SubLObject a_to_b_variable_map, final SubLObject a_to_c_bindings)
  {
    return transfer_variable_map_to_bindings_int( a_to_b_variable_map, a_to_c_bindings, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13042L)
  public static SubLObject transfer_variable_map_to_bindings_filtered(final SubLObject a_to_b_variable_map, final SubLObject a_to_c_bindings)
  {
    return transfer_variable_map_to_bindings_int( a_to_b_variable_map, a_to_c_bindings, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13552L)
  public static SubLObject transfer_variable_map_to_bindings_backwards(final SubLObject b_to_a_variable_map, final SubLObject a_to_c_bindings)
  {
    return transfer_variable_map_to_bindings( invert_bindings( b_to_a_variable_map ), a_to_c_bindings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14070L)
  public static SubLObject transfer_variable_map_to_bindings_backwards_filtered(final SubLObject b_to_a_variable_map, final SubLObject a_to_c_bindings)
  {
    return transfer_variable_map_to_bindings_filtered( invert_bindings( b_to_a_variable_map ), a_to_c_bindings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14506L)
  public static SubLObject transfer_variable_map_to_bindings_int(final SubLObject a_to_b_variable_map, final SubLObject a_to_c_bindings, final SubLObject error_if_incompleteP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != variable_map_p( a_to_b_variable_map ) : a_to_b_variable_map;
    assert NIL != bindings_p( a_to_c_bindings ) : a_to_c_bindings;
    SubLObject result = NIL;
    SubLObject cdolist_list_var = a_to_c_bindings;
    SubLObject a_to_c_binding = NIL;
    a_to_c_binding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = a_to_c_binding;
      SubLObject a_var = NIL;
      SubLObject c_value = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
      a_var = current.first();
      current = ( c_value = current.rest() );
      final SubLObject a_to_b_binding = get_variable_binding( a_var, a_to_b_variable_map );
      if( NIL != error_if_incompleteP && NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == a_to_b_binding )
      {
        Errors.error( $str24$Incomplete_variable_map__a_applie, a_to_b_variable_map, a_to_c_bindings );
      }
      if( NIL != a_to_b_binding )
      {
        final SubLObject b_var = variable_binding_value( a_to_b_binding );
        result = add_variable_binding( b_var, c_value, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      a_to_c_binding = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15354L)
  public static SubLObject compose_bindings(final SubLObject a_to_b_variable_map, final SubLObject b_to_c_bindings)
  {
    return compose_bindings_int( a_to_b_variable_map, b_to_c_bindings, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15916L)
  public static SubLObject compose_bindings_filtered(final SubLObject a_to_b_variable_map, final SubLObject b_to_c_bindings)
  {
    return compose_bindings_int( a_to_b_variable_map, b_to_c_bindings, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16426L)
  public static SubLObject compose_bindings_int(final SubLObject a_to_b_variable_map, final SubLObject b_to_c_bindings, final SubLObject error_if_incompleteP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != variable_map_p( a_to_b_variable_map ) : a_to_b_variable_map;
    assert NIL != bindings_p( b_to_c_bindings ) : b_to_c_bindings;
    SubLObject result = NIL;
    SubLObject cdolist_list_var = b_to_c_bindings;
    SubLObject b_to_c_binding = NIL;
    b_to_c_binding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = b_to_c_binding;
      SubLObject b_var = NIL;
      SubLObject c_value = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list25 );
      b_var = current.first();
      current = ( c_value = current.rest() );
      final SubLObject a_to_b_binding = get_value_binding( b_var, a_to_b_variable_map, UNPROVIDED );
      if( NIL != error_if_incompleteP && NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == a_to_b_binding )
      {
        Errors.error( $str24$Incomplete_variable_map__a_applie, a_to_b_variable_map, b_to_c_bindings );
      }
      if( NIL != a_to_b_binding )
      {
        final SubLObject a_var = variable_binding_variable( a_to_b_binding );
        result = add_variable_binding( a_var, c_value, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      b_to_c_binding = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17141L)
  public static SubLObject invert_bindings(final SubLObject v_bindings)
  {
    return list_utilities.flip_alist( v_bindings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17274L)
  public static SubLObject filter_bindings_by_variables(final SubLObject v_bindings, final SubLObject variable_keep_list)
  {
    SubLObject filtered_bindings = NIL;
    SubLObject cdolist_list_var = v_bindings;
    SubLObject binding = NIL;
    binding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = binding;
      SubLObject variable = NIL;
      SubLObject value = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
      variable = current.first();
      current = ( value = current.rest() );
      if( NIL != subl_promotions.memberP( variable, variable_keep_list, UNPROVIDED, UNPROVIDED ) )
      {
        filtered_bindings = ConsesLow.cons( make_variable_binding( variable, value ), filtered_bindings );
      }
      cdolist_list_var = cdolist_list_var.rest();
      binding = cdolist_list_var.first();
    }
    filtered_bindings = Sequences.nreverse( filtered_bindings );
    return filtered_bindings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17766L)
  public static SubLObject inference_simplify_unification_bindings(SubLObject v_bindings)
  {
    if( NIL != Sequences.find_if( $sym9$INFERENCE_BINDING_P, v_bindings, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      v_bindings = Sequences.remove_if( $sym9$INFERENCE_BINDING_P, v_bindings, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != unification_success_token_p( v_bindings ) )
    {
      v_bindings = NIL;
    }
    return v_bindings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18176L)
  public static SubLObject possibly_optimize_bindings_wrt_equivalence(SubLObject old_bindings)
  {
    if( NIL == old_bindings || NIL != list_utilities.singletonP( old_bindings ) )
    {
      return old_bindings;
    }
    while ( true)
    {
      SubLObject new_bindings = NIL;
      SubLObject cdolist_list_var = old_bindings;
      SubLObject binding = NIL;
      binding = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject old_value = variable_binding_value( binding );
        if( NIL == variables.fully_bound_p( old_value ) )
        {
          final SubLObject new_value = apply_bindings_backwards( old_bindings, old_value );
          final SubLObject variable = variable_binding_variable( binding );
          if( NIL == list_utilities.simple_tree_findP( variable, new_value ) && !new_value.equal( old_value ) )
          {
            binding = make_variable_binding( variable, new_value );
          }
        }
        new_bindings = ConsesLow.cons( binding, new_bindings );
        cdolist_list_var = cdolist_list_var.rest();
        binding = cdolist_list_var.first();
      }
      new_bindings = Sequences.nreverse( new_bindings );
      if( new_bindings.equal( old_bindings ) )
      {
        break;
      }
      old_bindings = new_bindings;
    }
    return old_bindings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19206L)
  public static SubLObject possibly_stitch_up_bindings_loop(final SubLObject v_bindings)
  {
    SubLObject cdolist_list_var = v_bindings;
    SubLObject binding = NIL;
    binding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != loopy_bindingP( binding, v_bindings ) )
      {
        return stitch_up_loopy_binding( v_bindings, binding );
      }
      cdolist_list_var = cdolist_list_var.rest();
      binding = cdolist_list_var.first();
    }
    return v_bindings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19442L)
  public static SubLObject loopy_bindingP(final SubLObject potentially_loopy_binding, final SubLObject v_bindings)
  {
    SubLObject potentially_loopy_variable = NIL;
    SubLObject potentially_loopy_value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( potentially_loopy_binding, potentially_loopy_binding, $list26 );
    potentially_loopy_variable = potentially_loopy_binding.first();
    final SubLObject current = potentially_loopy_value = potentially_loopy_binding.rest();
    if( NIL != unification.base_variable_p( potentially_loopy_variable ) )
    {
      SubLObject cdolist_list_var = v_bindings;
      SubLObject binding = NIL;
      binding = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject var = variable_binding_variable( binding );
        if( NIL != list_utilities.simple_tree_findP( var, potentially_loopy_value ) )
        {
          return T;
        }
        cdolist_list_var = cdolist_list_var.rest();
        binding = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19992L)
  public static SubLObject stitch_up_loopy_binding(final SubLObject v_bindings, final SubLObject loopy_binding)
  {
    SubLObject new_bindings = NIL;
    SubLObject cdolist_list_var = v_bindings;
    SubLObject binding = NIL;
    binding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( binding.eql( loopy_binding ) )
      {
        SubLObject current;
        final SubLObject datum = current = binding;
        SubLObject var = NIL;
        SubLObject loopy_value = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list27 );
        var = current.first();
        current = ( loopy_value = current.rest() );
        final SubLObject stitched_value = apply_bindings( v_bindings, loopy_value );
        final SubLObject stitched_binding = make_variable_binding( var, stitched_value );
        new_bindings = ConsesLow.cons( stitched_binding, new_bindings );
      }
      else
      {
        new_bindings = ConsesLow.cons( binding, new_bindings );
      }
      cdolist_list_var = cdolist_list_var.rest();
      binding = cdolist_list_var.first();
    }
    return Sequences.nreverse( new_bindings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20463L)
  public static SubLObject bindings_to_closed(final SubLObject v_bindings)
  {
    return list_utilities.remove_if_not( Symbols.symbol_function( $sym28$FULLY_BOUND_P ), v_bindings, Symbols.symbol_function( $sym19$VARIABLE_BINDING_VALUE ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20658L)
  public static SubLObject stable_sort_bindings(final SubLObject v_bindings, final SubLObject v_variables)
  {
    return list_utilities.stable_sort_via_position( v_bindings, v_variables, Symbols.symbol_function( EQ ), Symbols.symbol_function( $sym18$VARIABLE_BINDING_VARIABLE ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21088L)
  public static SubLObject remove_dummy_binding(final SubLObject v_bindings)
  {
    assert NIL != Types.listp( v_bindings ) : v_bindings;
    if( NIL != list_utilities.singletonP( v_bindings ) )
    {
      return v_bindings;
    }
    return Sequences.remove( $dummy_binding$.getGlobalValue(), v_bindings, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21316L)
  public static SubLObject delete_dummy_binding(final SubLObject v_bindings)
  {
    assert NIL != Types.listp( v_bindings ) : v_bindings;
    if( NIL != list_utilities.singletonP( v_bindings ) )
    {
      return v_bindings;
    }
    return Sequences.delete( $dummy_binding$.getGlobalValue(), v_bindings, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21544L)
  public static SubLObject tree_find_dummy_bindingP(final SubLObject tree)
  {
    return list_utilities.sublisp_boolean( list_utilities.tree_find( $dummy_binding$.getGlobalValue(), tree, Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21942L)
  public static SubLObject unification_success_token()
  {
    return $unification_success_token$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22112L)
  public static SubLObject unification_success_token_p(final SubLObject v_bindings)
  {
    return Equality.equal( v_bindings, $unification_success_token$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22327L)
  public static SubLObject variables_with_conflicting_bindings(final SubLObject bindings1, final SubLObject bindings2)
  {
    assert NIL != Types.listp( bindings1 ) : bindings1;
    assert NIL != Types.listp( bindings2 ) : bindings2;
    SubLObject conflicting_variables = NIL;
    SubLObject cdolist_list_var = bindings1;
    SubLObject binding = NIL;
    binding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject variable = variable_binding_variable( binding );
      if( NIL != variable_bound_p( variable, bindings2 ) && !variable_binding_value( binding ).equal( variable_lookup( variable, bindings2 ) ) )
      {
        final SubLObject item_var = variable;
        if( NIL == conses_high.member( item_var, conflicting_variables, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          conflicting_variables = ConsesLow.cons( item_var, conflicting_variables );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      binding = cdolist_list_var.first();
    }
    return conflicting_variables;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23082L)
  public static SubLObject some_variable_with_conflicting_bindings(final SubLObject bindings1, final SubLObject bindings2)
  {
    assert NIL != Types.listp( bindings1 ) : bindings1;
    assert NIL != Types.listp( bindings2 ) : bindings2;
    SubLObject conflict_foundP = NIL;
    if( NIL == conflict_foundP )
    {
      SubLObject csome_list_var = bindings1;
      SubLObject binding = NIL;
      binding = csome_list_var.first();
      while ( NIL == conflict_foundP && NIL != csome_list_var)
      {
        final SubLObject variable = variable_binding_variable( binding );
        if( NIL != variable_bound_p( variable, bindings2 ) && !variable_binding_value( binding ).equal( variable_lookup( variable, bindings2 ) ) )
        {
          conflict_foundP = T;
        }
        csome_list_var = csome_list_var.rest();
        binding = csome_list_var.first();
      }
    }
    return conflict_foundP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23704L)
  public static SubLObject inferencify_kb_set_of_binding_sets(final SubLObject kb_set_of_binding_sets)
  {
    assert NIL != kb_set_of_binding_sets_p( kb_set_of_binding_sets ) : kb_set_of_binding_sets;
    if( NIL != el_utilities.el_empty_set_p( kb_set_of_binding_sets ) )
    {
      return NIL;
    }
    return inferencify_kb_set_of_binding_sets_internal( el_utilities.extensional_set_elements( kb_set_of_binding_sets ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24338L)
  public static SubLObject inferencify_kb_set_of_binding_sets_internal(final SubLObject kb_set_of_binding_sets_args)
  {
    if( NIL == kb_set_of_binding_sets_args )
    {
      return NIL;
    }
    return ConsesLow.cons( inferencify_kb_binding_set( kb_set_of_binding_sets_args.first() ), inferencify_kb_set_of_binding_sets_internal( kb_set_of_binding_sets_args.rest() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24665L)
  public static SubLObject inferencify_kb_binding_set(final SubLObject kb_binding_set)
  {
    assert NIL != kb_binding_set_p( kb_binding_set ) : kb_binding_set;
    if( NIL != el_utilities.el_empty_set_p( kb_binding_set ) )
    {
      return NIL;
    }
    return inferencify_kb_binding_set_internal( el_utilities.extensional_set_elements( kb_binding_set ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24926L)
  public static SubLObject inferencify_kb_binding_set_internal(final SubLObject kb_binding_set_args)
  {
    if( NIL == kb_binding_set_args )
    {
      return NIL;
    }
    return ConsesLow.cons( inferencify_kb_binding( kb_binding_set_args.first() ), inferencify_kb_binding_set_internal( kb_binding_set_args.rest() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25197L)
  public static SubLObject inferencify_kb_binding(final SubLObject kb_binding)
  {
    assert NIL != kb_binding_p( kb_binding ) : kb_binding;
    SubLObject var = cycl_utilities.nat_arg1( kb_binding, UNPROVIDED );
    final SubLObject value = cycl_utilities.nat_arg2( kb_binding, UNPROVIDED );
    if( NIL != forts.fort_p( var ) )
    {
      var = czer_main.canonicalize_term( var, UNPROVIDED );
    }
    return make_variable_binding( var, czer_main.canonicalize_term( value, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25490L)
  public static SubLObject kbify_set_of_binding_sets(final SubLObject set_of_binding_sets)
  {
    assert NIL != binding_lists_p( set_of_binding_sets ) : set_of_binding_sets;
    return make_kb_set_of_binding_sets( kbify_set_of_binding_sets_internal( set_of_binding_sets ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26162L)
  public static SubLObject kbify_set_of_binding_sets_internal(final SubLObject set_of_binding_sets)
  {
    if( NIL == set_of_binding_sets )
    {
      return NIL;
    }
    return ConsesLow.cons( kbify_binding_set( set_of_binding_sets.first() ), kbify_set_of_binding_sets_internal( set_of_binding_sets.rest() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26436L)
  public static SubLObject kbify_binding_set(final SubLObject binding_set)
  {
    assert NIL != binding_list_p( binding_set ) : binding_set;
    return make_kb_binding_set( kbify_binding_set_internal( binding_set ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26602L)
  public static SubLObject kbify_binding_set_internal(final SubLObject binding_set)
  {
    if( NIL == binding_set )
    {
      return NIL;
    }
    return ConsesLow.cons( kbify_binding( binding_set.first() ), kbify_binding_set_internal( binding_set.rest() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26815L)
  public static SubLObject kbify_binding(final SubLObject binding)
  {
    assert NIL != binding_p( binding ) : binding;
    SubLObject var = NIL;
    SubLObject value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( binding, binding, $list33 );
    var = binding.first();
    final SubLObject current = value = binding.rest();
    return make_kb_binding( var, value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26974L)
  public static SubLObject kbify_inference_set_of_binding_sets(final SubLObject inference_set_of_binding_sets)
  {
    assert NIL != inference_set_of_binding_sets_p( inference_set_of_binding_sets ) : inference_set_of_binding_sets;
    return kbify_set_of_binding_sets( inference_set_of_binding_sets );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27518L)
  public static SubLObject kbify_inference_binding_set(final SubLObject inference_binding_set)
  {
    assert NIL != inference_binding_set_p( inference_binding_set ) : inference_binding_set;
    return kbify_binding_set( inference_binding_set );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27701L)
  public static SubLObject kbify_inference_binding(final SubLObject inference_binding)
  {
    assert NIL != inference_binding_p( inference_binding ) : inference_binding;
    return kbify_binding( inference_binding );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27860L)
  public static SubLObject kb_binding_variable(final SubLObject kb_binding)
  {
    assert NIL != kb_binding_p( kb_binding ) : kb_binding;
    return cycl_utilities.nat_arg1( kb_binding, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28093L)
  public static SubLObject kb_binding_value(final SubLObject kb_binding)
  {
    assert NIL != kb_binding_p( kb_binding ) : kb_binding;
    return cycl_utilities.nat_arg2( kb_binding, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28212L)
  public static SubLObject kb_binding_set_variables(final SubLObject kb_binding_set)
  {
    assert NIL != kb_binding_set_p( kb_binding_set ) : kb_binding_set;
    return Mapping.mapcar( Symbols.symbol_function( $sym35$KB_BINDING_VARIABLE ), el_utilities.extensional_set_elements( kb_binding_set ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28402L)
  public static SubLObject kb_binding_set_values(final SubLObject kb_binding_set)
  {
    assert NIL != kb_binding_set_p( kb_binding_set ) : kb_binding_set;
    return Mapping.mapcar( Symbols.symbol_function( $sym36$KB_BINDING_VALUE ), el_utilities.extensional_set_elements( kb_binding_set ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28586L)
  public static SubLObject kb_binding_set_value_for_variable(final SubLObject kb_binding_set, final SubLObject variable)
  {
    assert NIL != kb_binding_set_p( kb_binding_set ) : kb_binding_set;
    assert NIL != cycl_variables.el_varP( variable ) : variable;
    SubLObject value = NIL;
    if( NIL == value )
    {
      SubLObject csome_list_var = el_utilities.extensional_set_elements( kb_binding_set );
      SubLObject kb_binding = NIL;
      kb_binding = csome_list_var.first();
      while ( NIL == value && NIL != csome_list_var)
      {
        if( kb_binding_variable( kb_binding ).eql( variable ) )
        {
          value = kb_binding_value( kb_binding );
        }
        csome_list_var = csome_list_var.rest();
        kb_binding = csome_list_var.first();
      }
    }
    return value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28957L)
  public static SubLObject kb_set_of_binding_sets_values(final SubLObject kb_set_of_binding_sets)
  {
    assert NIL != kb_set_of_binding_sets_p( kb_set_of_binding_sets ) : kb_set_of_binding_sets;
    return Mapping.mapcar( Symbols.symbol_function( $sym38$KB_BINDING_SET_VALUES ), el_utilities.extensional_set_elements( kb_set_of_binding_sets ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29186L)
  public static SubLObject kb_set_of_binding_sets_size(final SubLObject kb_set_of_binding_sets)
  {
    assert NIL != kb_set_of_binding_sets_p( kb_set_of_binding_sets ) : kb_set_of_binding_sets;
    return Sequences.length( kb_set_of_binding_sets_binding_sets( kb_set_of_binding_sets ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29400L)
  public static SubLObject kb_set_of_binding_sets_binding_sets(final SubLObject kb_set_of_binding_sets)
  {
    assert NIL != kb_set_of_binding_sets_p( kb_set_of_binding_sets ) : kb_set_of_binding_sets;
    return el_utilities.extensional_set_elements( kb_set_of_binding_sets );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29602L)
  public static SubLObject make_kb_binding(final SubLObject variable, final SubLObject value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == cycl_variables.el_varP( variable ) && NIL == forts.fort_p( variable ) )
    {
      Errors.error( $str39$_A_is_neither_EL_VAR__nor_FORT_P_, variable );
    }
    if( NIL != cycl_variables.el_varP( variable ) )
    {
      return make_inference_kb_binding( variable, value );
    }
    return make_the_term_kb_binding( variable, value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30078L)
  public static SubLObject make_inference_kb_binding(final SubLObject variable, final SubLObject value)
  {
    assert NIL != cycl_variables.el_varP( variable ) : variable;
    return el_utilities.make_el_formula( $const11$ELInferenceBindingFn, ConsesLow.list( variable, value ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30244L)
  public static SubLObject make_the_term_kb_binding(final SubLObject the_term, final SubLObject value)
  {
    assert NIL != forts.fort_p( the_term ) : the_term;
    return el_utilities.make_el_formula( $const12$TheTermBindingFn, ConsesLow.list( the_term, value ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30404L)
  public static SubLObject make_kb_binding_set(final SubLObject v_bindings)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == list_utilities.every_in_list( $sym13$KB_BINDING_P, v_bindings, UNPROVIDED ) )
    {
      Errors.error( $str41$Some_element_of__A_is_not_a_KB_BI, v_bindings );
    }
    return el_utilities.make_el_extensional_set( v_bindings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30655L)
  public static SubLObject make_kb_set_of_binding_sets(final SubLObject binding_sets)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == list_utilities.every_in_list( $sym14$KB_BINDING_SET_P, binding_sets, UNPROVIDED ) )
    {
      Errors.error( $str42$Some_element_of__A_is_not_a_KB_BI, binding_sets );
    }
    return el_utilities.make_el_extensional_set( binding_sets );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30949L)
  public static SubLObject no_answers_kb_set_of_binding_sets()
  {
    return make_kb_set_of_binding_sets( NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 31172L)
  public static SubLObject proven_kb_binding_set()
  {
    return make_kb_binding_set( NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 31360L)
  public static SubLObject proven_kb_set_of_binding_sets()
  {
    return make_kb_set_of_binding_sets( ConsesLow.list( make_kb_binding_set( NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 31619L)
  public static SubLObject test_kbified_set_of_binding_sets(final SubLObject input, final SubLObject output)
  {
    return czer_utilities.equals_elP( input, output, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  public static SubLObject declare_bindings_file()
  {
    SubLFiles.declareFunction( me, "clear_hl_identity_binding", "CLEAR-HL-IDENTITY-BINDING", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_hl_identity_binding", "REMOVE-HL-IDENTITY-BINDING", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_identity_binding_internal", "HL-IDENTITY-BINDING-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_identity_binding", "HL-IDENTITY-BINDING", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_hl_identity_bindings", "CLEAR-HL-IDENTITY-BINDINGS", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_hl_identity_bindings", "REMOVE-HL-IDENTITY-BINDINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_identity_bindings_internal", "HL-IDENTITY-BINDINGS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_identity_bindings", "HL-IDENTITY-BINDINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "binding_p", "BINDING-P", 1, 0, false );
    new $binding_p$UnaryFunction();
    SubLFiles.declareFunction( me, "variable_to_variable_binding_p", "VARIABLE-TO-VARIABLE-BINDING-P", 1, 0, false );
    SubLFiles.declareFunction( me, "bindings_p", "BINDINGS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "binding_list_p", "BINDING-LIST-P", 1, 0, false );
    SubLFiles.declareFunction( me, "non_empty_binding_list_p", "NON-EMPTY-BINDING-LIST-P", 1, 0, false );
    SubLFiles.declareFunction( me, "binding_lists_p", "BINDING-LISTS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "variable_map_p", "VARIABLE-MAP-P", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_binding_p", "INFERENCE-BINDING-P", 1, 0, false );
    new $inference_binding_p$UnaryFunction();
    SubLFiles.declareFunction( me, "inference_binding_set_p", "INFERENCE-BINDING-SET-P", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_set_of_binding_sets_p", "INFERENCE-SET-OF-BINDING-SETS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_binding_p", "KB-BINDING-P", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_inference_binding_p", "KB-INFERENCE-BINDING-P", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_the_term_binding_p", "KB-THE-TERM-BINDING-P", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_binding_set_p", "KB-BINDING-SET-P", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_set_of_binding_sets_p", "KB-SET-OF-BINDING-SETS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "subst_bindings", "SUBST-BINDINGS", 2, 0, false );
    new $subst_bindings$BinaryFunction();
    SubLFiles.declareFunction( me, "equal_bindings", "EQUAL-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "bindings_equalP", "BINDINGS-EQUAL?", 2, 0, false );
    SubLFiles.declareFunction( me, "bindings_equal_modulo_el_var_namesP", "BINDINGS-EQUAL-MODULO-EL-VAR-NAMES?", 2, 0, false );
    SubLFiles.declareFunction( me, "binding_equal_modulo_el_var_namesP", "BINDING-EQUAL-MODULO-EL-VAR-NAMES?", 2, 0, false );
    SubLFiles.declareFunction( me, "lists_of_binding_lists_equalP", "LISTS-OF-BINDING-LISTS-EQUAL?", 2, 0, false );
    SubLFiles.declareFunction( me, "compare_lists_of_binding_lists", "COMPARE-LISTS-OF-BINDING-LISTS", 2, 0, false );
    SubLFiles.declareFunction( me, "variable_bound_p", "VARIABLE-BOUND-P", 2, 0, false );
    SubLFiles.declareFunction( me, "variable_lookup", "VARIABLE-LOOKUP", 2, 0, false );
    SubLFiles.declareFunction( me, "add_variable_binding", "ADD-VARIABLE-BINDING", 3, 0, false );
    SubLFiles.declareFunction( me, "add_dont_care_variable_binding", "ADD-DONT-CARE-VARIABLE-BINDING", 2, 0, false );
    SubLFiles.declareFunction( me, "make_variable_binding", "MAKE-VARIABLE-BINDING", 2, 0, false );
    SubLFiles.declareFunction( me, "variable_binding_variable", "VARIABLE-BINDING-VARIABLE", 1, 0, false );
    new $variable_binding_variable$UnaryFunction();
    SubLFiles.declareFunction( me, "variable_binding_value", "VARIABLE-BINDING-VALUE", 1, 0, false );
    new $variable_binding_value$UnaryFunction();
    SubLFiles.declareFunction( me, "get_variable_binding", "GET-VARIABLE-BINDING", 2, 0, false );
    SubLFiles.declareFunction( me, "get_value_binding", "GET-VALUE-BINDING", 2, 1, false );
    SubLFiles.declareFunction( me, "make_variable_bindings", "MAKE-VARIABLE-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "bindings_variables", "BINDINGS-VARIABLES", 1, 0, false );
    SubLFiles.declareFunction( me, "bindings_values", "BINDINGS-VALUES", 1, 0, false );
    SubLFiles.declareFunction( me, "apply_binding", "APPLY-BINDING", 2, 0, false );
    SubLFiles.declareFunction( me, "apply_bindings", "APPLY-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "apply_bindings_to_values", "APPLY-BINDINGS-TO-VALUES", 2, 0, false );
    SubLFiles.declareFunction( me, "apply_bindings_backwards", "APPLY-BINDINGS-BACKWARDS", 2, 0, false );
    SubLFiles.declareFunction( me, "apply_bindings_backwards_to_values", "APPLY-BINDINGS-BACKWARDS-TO-VALUES", 2, 0, false );
    SubLFiles.declareFunction( me, "napply_binding", "NAPPLY-BINDING", 2, 0, false );
    SubLFiles.declareFunction( me, "napply_bindings", "NAPPLY-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "napply_bindings_backwards", "NAPPLY-BINDINGS-BACKWARDS", 2, 0, false );
    SubLFiles.declareFunction( me, "napply_bindings_backwards_to_list", "NAPPLY-BINDINGS-BACKWARDS-TO-LIST", 2, 0, false );
    SubLFiles.declareFunction( me, "transfer_variable_map_to_bindings", "TRANSFER-VARIABLE-MAP-TO-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "transfer_variable_map_to_bindings_filtered", "TRANSFER-VARIABLE-MAP-TO-BINDINGS-FILTERED", 2, 0, false );
    SubLFiles.declareFunction( me, "transfer_variable_map_to_bindings_backwards", "TRANSFER-VARIABLE-MAP-TO-BINDINGS-BACKWARDS", 2, 0, false );
    SubLFiles.declareFunction( me, "transfer_variable_map_to_bindings_backwards_filtered", "TRANSFER-VARIABLE-MAP-TO-BINDINGS-BACKWARDS-FILTERED", 2, 0, false );
    SubLFiles.declareFunction( me, "transfer_variable_map_to_bindings_int", "TRANSFER-VARIABLE-MAP-TO-BINDINGS-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "compose_bindings", "COMPOSE-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "compose_bindings_filtered", "COMPOSE-BINDINGS-FILTERED", 2, 0, false );
    SubLFiles.declareFunction( me, "compose_bindings_int", "COMPOSE-BINDINGS-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "invert_bindings", "INVERT-BINDINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "filter_bindings_by_variables", "FILTER-BINDINGS-BY-VARIABLES", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_simplify_unification_bindings", "INFERENCE-SIMPLIFY-UNIFICATION-BINDINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_optimize_bindings_wrt_equivalence", "POSSIBLY-OPTIMIZE-BINDINGS-WRT-EQUIVALENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_stitch_up_bindings_loop", "POSSIBLY-STITCH-UP-BINDINGS-LOOP", 1, 0, false );
    SubLFiles.declareFunction( me, "loopy_bindingP", "LOOPY-BINDING?", 2, 0, false );
    SubLFiles.declareFunction( me, "stitch_up_loopy_binding", "STITCH-UP-LOOPY-BINDING", 2, 0, false );
    SubLFiles.declareFunction( me, "bindings_to_closed", "BINDINGS-TO-CLOSED", 1, 0, false );
    SubLFiles.declareFunction( me, "stable_sort_bindings", "STABLE-SORT-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_dummy_binding", "REMOVE-DUMMY-BINDING", 1, 0, false );
    SubLFiles.declareFunction( me, "delete_dummy_binding", "DELETE-DUMMY-BINDING", 1, 0, false );
    SubLFiles.declareFunction( me, "tree_find_dummy_bindingP", "TREE-FIND-DUMMY-BINDING?", 1, 0, false );
    SubLFiles.declareFunction( me, "unification_success_token", "UNIFICATION-SUCCESS-TOKEN", 0, 0, false );
    SubLFiles.declareFunction( me, "unification_success_token_p", "UNIFICATION-SUCCESS-TOKEN-P", 1, 0, false );
    SubLFiles.declareFunction( me, "variables_with_conflicting_bindings", "VARIABLES-WITH-CONFLICTING-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "some_variable_with_conflicting_bindings", "SOME-VARIABLE-WITH-CONFLICTING-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "inferencify_kb_set_of_binding_sets", "INFERENCIFY-KB-SET-OF-BINDING-SETS", 1, 0, false );
    SubLFiles.declareFunction( me, "inferencify_kb_set_of_binding_sets_internal", "INFERENCIFY-KB-SET-OF-BINDING-SETS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "inferencify_kb_binding_set", "INFERENCIFY-KB-BINDING-SET", 1, 0, false );
    SubLFiles.declareFunction( me, "inferencify_kb_binding_set_internal", "INFERENCIFY-KB-BINDING-SET-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "inferencify_kb_binding", "INFERENCIFY-KB-BINDING", 1, 0, false );
    SubLFiles.declareFunction( me, "kbify_set_of_binding_sets", "KBIFY-SET-OF-BINDING-SETS", 1, 0, false );
    SubLFiles.declareFunction( me, "kbify_set_of_binding_sets_internal", "KBIFY-SET-OF-BINDING-SETS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "kbify_binding_set", "KBIFY-BINDING-SET", 1, 0, false );
    SubLFiles.declareFunction( me, "kbify_binding_set_internal", "KBIFY-BINDING-SET-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "kbify_binding", "KBIFY-BINDING", 1, 0, false );
    SubLFiles.declareFunction( me, "kbify_inference_set_of_binding_sets", "KBIFY-INFERENCE-SET-OF-BINDING-SETS", 1, 0, false );
    SubLFiles.declareFunction( me, "kbify_inference_binding_set", "KBIFY-INFERENCE-BINDING-SET", 1, 0, false );
    SubLFiles.declareFunction( me, "kbify_inference_binding", "KBIFY-INFERENCE-BINDING", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_binding_variable", "KB-BINDING-VARIABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_binding_value", "KB-BINDING-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_binding_set_variables", "KB-BINDING-SET-VARIABLES", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_binding_set_values", "KB-BINDING-SET-VALUES", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_binding_set_value_for_variable", "KB-BINDING-SET-VALUE-FOR-VARIABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "kb_set_of_binding_sets_values", "KB-SET-OF-BINDING-SETS-VALUES", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_set_of_binding_sets_size", "KB-SET-OF-BINDING-SETS-SIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_set_of_binding_sets_binding_sets", "KB-SET-OF-BINDING-SETS-BINDING-SETS", 1, 0, false );
    SubLFiles.declareFunction( me, "make_kb_binding", "MAKE-KB-BINDING", 2, 0, false );
    SubLFiles.declareFunction( me, "make_inference_kb_binding", "MAKE-INFERENCE-KB-BINDING", 2, 0, false );
    SubLFiles.declareFunction( me, "make_the_term_kb_binding", "MAKE-THE-TERM-KB-BINDING", 2, 0, false );
    SubLFiles.declareFunction( me, "make_kb_binding_set", "MAKE-KB-BINDING-SET", 1, 0, false );
    SubLFiles.declareFunction( me, "make_kb_set_of_binding_sets", "MAKE-KB-SET-OF-BINDING-SETS", 1, 0, false );
    SubLFiles.declareFunction( me, "no_answers_kb_set_of_binding_sets", "NO-ANSWERS-KB-SET-OF-BINDING-SETS", 0, 0, false );
    SubLFiles.declareFunction( me, "proven_kb_binding_set", "PROVEN-KB-BINDING-SET", 0, 0, false );
    SubLFiles.declareFunction( me, "proven_kb_set_of_binding_sets", "PROVEN-KB-SET-OF-BINDING-SETS", 0, 0, false );
    SubLFiles.declareFunction( me, "test_kbified_set_of_binding_sets", "TEST-KBIFIED-SET-OF-BINDING-SETS", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_bindings_file()
  {
    $hl_identity_binding_caching_state$ = SubLFiles.deflexical( "*HL-IDENTITY-BINDING-CACHING-STATE*", NIL );
    $hl_identity_bindings_caching_state$ = SubLFiles.deflexical( "*HL-IDENTITY-BINDINGS-CACHING-STATE*", NIL );
    $dont_care_variable_binding_value$ = SubLFiles.defconstant( "*DONT-CARE-VARIABLE-BINDING-VALUE*", $kw17$DONT_CARE );
    $dummy_binding$ = SubLFiles.deflexical( "*DUMMY-BINDING*", maybeDefault( $sym29$_DUMMY_BINDING_, $dummy_binding$, () -> ( make_variable_binding( T, T ) ) ) );
    $unification_success_token$ = SubLFiles.deflexical( "*UNIFICATION-SUCCESS-TOKEN*", ConsesLow.list( $dummy_binding$.getGlobalValue() ) );
    return NIL;
  }

  public static SubLObject setup_bindings_file()
  {
    memoization_state.note_globally_cached_function( $sym0$HL_IDENTITY_BINDING );
    memoization_state.note_globally_cached_function( $sym3$HL_IDENTITY_BINDINGS );
    subl_macro_promotions.declare_defglobal( $sym29$_DUMMY_BINDING_ );
    generic_testing.define_test_case_table_int( $sym43$TRANSFER_VARIABLE_MAP_TO_BINDINGS, ConsesLow.list( new SubLObject[] { $kw44$TEST, NIL, $kw45$OWNER, NIL, $kw46$CLASSES, NIL, $kw47$KB, $kw48$TINY, $kw49$WORKING_, T
    } ), $list50 );
    generic_testing.define_test_case_table_int( $sym51$TRANSFER_VARIABLE_MAP_TO_BINDINGS_FILTERED, ConsesLow.list( new SubLObject[] { $kw44$TEST, NIL, $kw45$OWNER, NIL, $kw46$CLASSES, NIL, $kw47$KB, $kw48$TINY,
      $kw49$WORKING_, T
    } ), $list52 );
    generic_testing.define_test_case_table_int( $sym53$TRANSFER_VARIABLE_MAP_TO_BINDINGS_BACKWARDS, ConsesLow.list( new SubLObject[] { $kw44$TEST, NIL, $kw45$OWNER, NIL, $kw46$CLASSES, NIL, $kw47$KB, $kw48$TINY,
      $kw49$WORKING_, T
    } ), $list54 );
    generic_testing.define_test_case_table_int( $sym55$COMPOSE_BINDINGS, ConsesLow.list( new SubLObject[] { $kw44$TEST, NIL, $kw45$OWNER, NIL, $kw46$CLASSES, NIL, $kw47$KB, $kw48$TINY, $kw49$WORKING_, T
    } ), $list56 );
    generic_testing.define_test_case_table_int( $sym57$COMPOSE_BINDINGS_FILTERED, ConsesLow.list( new SubLObject[] { $kw44$TEST, NIL, $kw45$OWNER, NIL, $kw46$CLASSES, NIL, $kw47$KB, $kw48$TINY, $kw49$WORKING_, T
    } ), $list58 );
    generic_testing.define_test_case_table_int( $sym13$KB_BINDING_P, ConsesLow.list( new SubLObject[] { $kw44$TEST, NIL, $kw45$OWNER, NIL, $kw46$CLASSES, NIL, $kw47$KB, $kw59$FULL, $kw49$WORKING_, T
    } ), $list60 );
    generic_testing.define_test_case_table_int( $sym14$KB_BINDING_SET_P, ConsesLow.list( new SubLObject[] { $kw44$TEST, NIL, $kw45$OWNER, NIL, $kw46$CLASSES, NIL, $kw47$KB, $kw59$FULL, $kw49$WORKING_, T
    } ), $list61 );
    generic_testing.define_test_case_table_int( $sym31$KB_SET_OF_BINDING_SETS_P, ConsesLow.list( new SubLObject[] { $kw44$TEST, NIL, $kw45$OWNER, NIL, $kw46$CLASSES, NIL, $kw47$KB, $kw59$FULL, $kw49$WORKING_, T
    } ), $list62 );
    generic_testing.define_test_case_table_int( $sym63$INFERENCIFY_KB_SET_OF_BINDING_SETS, ConsesLow.list( new SubLObject[] { $kw44$TEST, NIL, $kw45$OWNER, NIL, $kw46$CLASSES, NIL, $kw47$KB, $kw59$FULL, $kw49$WORKING_, T
    } ), $list64 );
    generic_testing.define_test_case_table_int( $sym65$KBIFY_SET_OF_BINDING_SETS, ConsesLow.list( new SubLObject[] { $kw44$TEST, $sym66$TEST_KBIFIED_SET_OF_BINDING_SETS, $kw45$OWNER, NIL, $kw46$CLASSES, NIL, $kw47$KB,
      $kw59$FULL, $kw49$WORKING_, T
    } ), $list67 );
    generic_testing.define_test_case_table_int( $sym68$KBIFY_INFERENCE_SET_OF_BINDING_SETS, ConsesLow.list( new SubLObject[] { $kw44$TEST, $sym66$TEST_KBIFIED_SET_OF_BINDING_SETS, $kw45$OWNER, NIL, $kw46$CLASSES, NIL,
      $kw47$KB, $kw59$FULL, $kw49$WORKING_, T
    } ), $list69 );
    generic_testing.define_test_case_table_int( $sym70$KB_BINDING_SET_VARIABLES, ConsesLow.list( new SubLObject[] { $kw44$TEST, NIL, $kw45$OWNER, NIL, $kw46$CLASSES, NIL, $kw47$KB, $kw59$FULL, $kw49$WORKING_, T
    } ), $list71 );
    generic_testing.define_test_case_table_int( $sym38$KB_BINDING_SET_VALUES, ConsesLow.list( new SubLObject[] { $kw44$TEST, NIL, $kw45$OWNER, NIL, $kw46$CLASSES, NIL, $kw47$KB, $kw59$FULL, $kw49$WORKING_, T
    } ), $list72 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_bindings_file();
  }

  @Override
  public void initializeVariables()
  {
    init_bindings_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_bindings_file();
  }
  static
  {
    me = new bindings();
    $hl_identity_binding_caching_state$ = null;
    $hl_identity_bindings_caching_state$ = null;
    $dont_care_variable_binding_value$ = null;
    $dummy_binding$ = null;
    $unification_success_token$ = null;
    $sym0$HL_IDENTITY_BINDING = makeSymbol( "HL-IDENTITY-BINDING" );
    $sym1$NON_NEGATIVE_INTEGER_P = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $sym2$_HL_IDENTITY_BINDING_CACHING_STATE_ = makeSymbol( "*HL-IDENTITY-BINDING-CACHING-STATE*" );
    $sym3$HL_IDENTITY_BINDINGS = makeSymbol( "HL-IDENTITY-BINDINGS" );
    $sym4$_HL_IDENTITY_BINDINGS_CACHING_STATE_ = makeSymbol( "*HL-IDENTITY-BINDINGS-CACHING-STATE*" );
    $list5 = ConsesLow.cons( makeSymbol( "A" ), makeSymbol( "B" ) );
    $sym6$BINDING_P = makeSymbol( "BINDING-P" );
    $sym7$BINDING_LIST_P = makeSymbol( "BINDING-LIST-P" );
    $sym8$VARIABLE_TO_VARIABLE_BINDING_P = makeSymbol( "VARIABLE-TO-VARIABLE-BINDING-P" );
    $sym9$INFERENCE_BINDING_P = makeSymbol( "INFERENCE-BINDING-P" );
    $sym10$INFERENCE_BINDING_SET_P = makeSymbol( "INFERENCE-BINDING-SET-P" );
    $const11$ELInferenceBindingFn = constant_handles.reader_make_constant_shell( makeString( "ELInferenceBindingFn" ) );
    $const12$TheTermBindingFn = constant_handles.reader_make_constant_shell( makeString( "TheTermBindingFn" ) );
    $sym13$KB_BINDING_P = makeSymbol( "KB-BINDING-P" );
    $sym14$KB_BINDING_SET_P = makeSymbol( "KB-BINDING-SET-P" );
    $sym15$BINDING_EQUAL_MODULO_EL_VAR_NAMES_ = makeSymbol( "BINDING-EQUAL-MODULO-EL-VAR-NAMES?" );
    $sym16$BINDINGS_EQUAL_ = makeSymbol( "BINDINGS-EQUAL?" );
    $kw17$DONT_CARE = makeKeyword( "DONT-CARE" );
    $sym18$VARIABLE_BINDING_VARIABLE = makeSymbol( "VARIABLE-BINDING-VARIABLE" );
    $sym19$VARIABLE_BINDING_VALUE = makeSymbol( "VARIABLE-BINDING-VALUE" );
    $list20 = ConsesLow.cons( makeSymbol( "VARIABLE" ), makeSymbol( "VALUE" ) );
    $sym21$BINDINGS_P = makeSymbol( "BINDINGS-P" );
    $sym22$VARIABLE_MAP_P = makeSymbol( "VARIABLE-MAP-P" );
    $list23 = ConsesLow.cons( makeSymbol( "A-VAR" ), makeSymbol( "C-VALUE" ) );
    $str24$Incomplete_variable_map__a_applie = makeString( "Incomplete variable map ~a applied to ~a" );
    $list25 = ConsesLow.cons( makeSymbol( "B-VAR" ), makeSymbol( "C-VALUE" ) );
    $list26 = ConsesLow.cons( makeSymbol( "POTENTIALLY-LOOPY-VARIABLE" ), makeSymbol( "POTENTIALLY-LOOPY-VALUE" ) );
    $list27 = ConsesLow.cons( makeSymbol( "VAR" ), makeSymbol( "LOOPY-VALUE" ) );
    $sym28$FULLY_BOUND_P = makeSymbol( "FULLY-BOUND-P" );
    $sym29$_DUMMY_BINDING_ = makeSymbol( "*DUMMY-BINDING*" );
    $sym30$LISTP = makeSymbol( "LISTP" );
    $sym31$KB_SET_OF_BINDING_SETS_P = makeSymbol( "KB-SET-OF-BINDING-SETS-P" );
    $sym32$BINDING_LISTS_P = makeSymbol( "BINDING-LISTS-P" );
    $list33 = ConsesLow.cons( makeSymbol( "VAR" ), makeSymbol( "VALUE" ) );
    $sym34$INFERENCE_SET_OF_BINDING_SETS_P = makeSymbol( "INFERENCE-SET-OF-BINDING-SETS-P" );
    $sym35$KB_BINDING_VARIABLE = makeSymbol( "KB-BINDING-VARIABLE" );
    $sym36$KB_BINDING_VALUE = makeSymbol( "KB-BINDING-VALUE" );
    $sym37$EL_VAR_ = makeSymbol( "EL-VAR?" );
    $sym38$KB_BINDING_SET_VALUES = makeSymbol( "KB-BINDING-SET-VALUES" );
    $str39$_A_is_neither_EL_VAR__nor_FORT_P_ = makeString( "~A is neither EL-VAR? nor FORT-P." );
    $sym40$FORT_P = makeSymbol( "FORT-P" );
    $str41$Some_element_of__A_is_not_a_KB_BI = makeString( "Some element of ~A is not a KB-BINDING-P" );
    $str42$Some_element_of__A_is_not_a_KB_BI = makeString( "Some element of ~A is not a KB-BINDING-SET-P" );
    $sym43$TRANSFER_VARIABLE_MAP_TO_BINDINGS = makeSymbol( "TRANSFER-VARIABLE-MAP-TO-BINDINGS" );
    $kw44$TEST = makeKeyword( "TEST" );
    $kw45$OWNER = makeKeyword( "OWNER" );
    $kw46$CLASSES = makeKeyword( "CLASSES" );
    $kw47$KB = makeKeyword( "KB" );
    $kw48$TINY = makeKeyword( "TINY" );
    $kw49$WORKING_ = makeKeyword( "WORKING?" );
    $list50 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.cons( makeSymbol( "?X" ), makeSymbol( "?Y" ) ) ), ConsesLow.list( ConsesLow.cons( makeSymbol( "?X" ), constant_handles
        .reader_make_constant_shell( makeString( "December" ) ) ) ) ), ConsesLow.list( ConsesLow.cons( makeSymbol( "?Y" ), constant_handles.reader_make_constant_shell( makeString( "December" ) ) ) ) ) );
    $sym51$TRANSFER_VARIABLE_MAP_TO_BINDINGS_FILTERED = makeSymbol( "TRANSFER-VARIABLE-MAP-TO-BINDINGS-FILTERED" );
    $list52 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.cons( makeSymbol( "?X" ), makeSymbol( "?Y" ) ) ), ConsesLow.list( ConsesLow.cons( makeSymbol( "?X" ), constant_handles
        .reader_make_constant_shell( makeString( "December" ) ) ), ConsesLow.cons( makeSymbol( "?Z" ), constant_handles.reader_make_constant_shell( makeString( "February" ) ) ) ) ), ConsesLow.list( ConsesLow.cons(
            makeSymbol( "?Y" ), constant_handles.reader_make_constant_shell( makeString( "December" ) ) ) ) ) );
    $sym53$TRANSFER_VARIABLE_MAP_TO_BINDINGS_BACKWARDS = makeSymbol( "TRANSFER-VARIABLE-MAP-TO-BINDINGS-BACKWARDS" );
    $list54 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.cons( makeSymbol( "?Y" ), makeSymbol( "?X" ) ) ), ConsesLow.list( ConsesLow.cons( makeSymbol( "?X" ), constant_handles
        .reader_make_constant_shell( makeString( "December" ) ) ) ) ), ConsesLow.list( ConsesLow.cons( makeSymbol( "?Y" ), constant_handles.reader_make_constant_shell( makeString( "December" ) ) ) ) ) );
    $sym55$COMPOSE_BINDINGS = makeSymbol( "COMPOSE-BINDINGS" );
    $list56 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.cons( makeSymbol( "?X" ), makeSymbol( "?A" ) ), ConsesLow.cons( makeSymbol( "?Y" ), makeSymbol( "?B" ) ), ConsesLow.cons(
        makeSymbol( "?Z" ), makeSymbol( "?C" ) ) ), ConsesLow.list( ConsesLow.cons( makeSymbol( "?A" ), constant_handles.reader_make_constant_shell( makeString( "January" ) ) ), ConsesLow.cons( makeSymbol( "?C" ),
            constant_handles.reader_make_constant_shell( makeString( "February" ) ) ) ) ), ConsesLow.list( ConsesLow.cons( makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "January" ) ) ),
                ConsesLow.cons( makeSymbol( "?Z" ), constant_handles.reader_make_constant_shell( makeString( "February" ) ) ) ) ) );
    $sym57$COMPOSE_BINDINGS_FILTERED = makeSymbol( "COMPOSE-BINDINGS-FILTERED" );
    $list58 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.cons( makeSymbol( "?X" ), makeSymbol( "?A" ) ), ConsesLow.cons( makeSymbol( "?Y" ), makeSymbol( "?B" ) ), ConsesLow.cons(
        makeSymbol( "?Z" ), makeSymbol( "?C" ) ) ), ConsesLow.list( ConsesLow.cons( makeSymbol( "?A" ), constant_handles.reader_make_constant_shell( makeString( "January" ) ) ), ConsesLow.cons( makeSymbol( "?C" ),
            constant_handles.reader_make_constant_shell( makeString( "February" ) ) ), ConsesLow.cons( makeSymbol( "?D" ), constant_handles.reader_make_constant_shell( makeString( "March" ) ) ) ) ), ConsesLow.list(
                ConsesLow.cons( makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "January" ) ) ), ConsesLow.cons( makeSymbol( "?Z" ), constant_handles.reader_make_constant_shell( makeString(
                    "February" ) ) ) ) ) );
    $kw59$FULL = makeKeyword( "FULL" );
    $list60 = ConsesLow.list( new SubLObject[] { ConsesLow.list( ConsesLow.list( FIVE_INTEGER ), NIL ), ConsesLow.list( ConsesLow.list( makeString( "xyz" ) ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
        constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), constant_handles.reader_make_constant_shell( makeString( "TheEmptySet" ) ) ) ), NIL ), ConsesLow.list( ConsesLow.list( constant_handles
            .reader_make_constant_shell( makeString( "Collection" ) ) ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ELInferenceBindingFn" ) ),
                constant_handles.reader_make_constant_shell( makeString( "Collection" ) ), makeSymbol( "?X" ) ) ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell(
                    makeString( "ELInferenceBindingFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Collection" ) ), constant_handles.reader_make_constant_shell( makeString( "Thing" ) ),
                    constant_handles.reader_make_constant_shell( makeString( "Predicate" ) ) ) ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                        "ELInferenceBindingFn" ) ), constant_handles.reader_make_constant_shell( makeString( "TheAssertionSentence" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ),
                            constant_handles.reader_make_constant_shell( makeString( "Predicate" ) ), constant_handles.reader_make_constant_shell( makeString( "Collection" ) ) ) ) ), NIL ), ConsesLow.list( ConsesLow
                                .list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ELInferenceBindingFn" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString(
                                    "Predicate" ) ) ) ), T ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ELInferenceBindingFn" ) ), makeSymbol( "?Y" ),
                                        makeString( "whatever" ) ) ), T ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheTermBindingFn" ) ), constant_handles
                                            .reader_make_constant_shell( makeString( "TheAssertionSentence" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles
                                                .reader_make_constant_shell( makeString( "Predicate" ) ), constant_handles.reader_make_constant_shell( makeString( "Collection" ) ) ) ) ), T ), ConsesLow.list( ConsesLow
                                                    .list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheTermBindingFn" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell(
                                                        makeString( "Predicate" ) ) ) ), NIL )
    } );
    $list61 = ConsesLow.list( new SubLObject[] { ConsesLow.list( ConsesLow.list( FIVE_INTEGER ), NIL ), ConsesLow.list( ConsesLow.list( makeString( "xyz" ) ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
        constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), constant_handles.reader_make_constant_shell( makeString( "TheEmptySet" ) ) ) ), NIL ), ConsesLow.list( ConsesLow.list( constant_handles
            .reader_make_constant_shell( makeString( "Collection" ) ) ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), ConsesLow.list(
                constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER ) ) ), NIL ), ConsesLow.list( ConsesLow.list( NIL ), NIL ), ConsesLow.list( ConsesLow.list(
                    constant_handles.reader_make_constant_shell( makeString( "TheEmptySet" ) ) ), T ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                        "TheSet" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ELInferenceBindingFn" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString(
                            "Collection" ) ) ) ) ), T ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), ConsesLow.list( constant_handles
                                .reader_make_constant_shell( makeString( "ELInferenceBindingFn" ) ), makeSymbol( "?Y" ), makeString( "hello" ) ) ) ), T ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                                    .reader_make_constant_shell( makeString( "TheSet" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ELInferenceBindingFn" ) ), makeSymbol( "?Y" ),
                                        makeString( "hello" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ELInferenceBindingFn" ) ), makeSymbol( "?X" ), constant_handles
                                            .reader_make_constant_shell( makeString( "February" ) ) ) ) ), T ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                "TheSet" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheTermBindingFn" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                    "TheCurrentKBNumber" ) ), makeInteger( 1180 ) ) ) ), T ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                        "TheSet" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheTermBindingFn" ) ), constant_handles.reader_make_constant_shell(
                                                            makeString( "TheCurrentKBNumber" ) ), makeInteger( 1180 ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheTermBindingFn" ) ),
                                                                constant_handles.reader_make_constant_shell( makeString( "TheAssertionSentence" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                    makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "Predicate" ) ), constant_handles.reader_make_constant_shell(
                                                                        makeString( "Collection" ) ) ) ) ) ), T )
    } );
    $list62 = ConsesLow.list( new SubLObject[] { ConsesLow.list( ConsesLow.list( FIVE_INTEGER ), NIL ), ConsesLow.list( ConsesLow.list( makeString( "xyz" ) ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
        constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), constant_handles.reader_make_constant_shell( makeString( "TheEmptySet" ) ) ) ), T ), ConsesLow.list( ConsesLow.list( constant_handles
            .reader_make_constant_shell( makeString( "Collection" ) ) ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), ConsesLow.list(
                constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), constant_handles.reader_make_constant_shell( makeString( "TheEmptySet" ) ) ) ) ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow
                    .list( constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), FIVE_INTEGER, SIX_INTEGER,
                        SEVEN_INTEGER ) ) ), NIL ), ConsesLow.list( ConsesLow.list( NIL ), NIL ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheEmptySet" ) ) ), T ),
      ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheEmptySet" ) ) ) ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
          .reader_make_constant_shell( makeString( "TheSet" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ELInferenceBindingFn" ) ), makeSymbol( "?X" ), constant_handles
              .reader_make_constant_shell( makeString( "Collection" ) ) ) ) ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), ConsesLow.list(
                  constant_handles.reader_make_constant_shell( makeString( "TheTermBindingFn" ) ), constant_handles.reader_make_constant_shell( makeString( "TheAssertionSentence" ) ), ConsesLow.list( constant_handles
                      .reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "Predicate" ) ), constant_handles.reader_make_constant_shell( makeString(
                          "Collection" ) ) ) ) ) ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), ConsesLow.list( constant_handles
                              .reader_make_constant_shell( makeString( "TheSet" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ELInferenceBindingFn" ) ), makeSymbol( "?X" ),
                                  constant_handles.reader_make_constant_shell( makeString( "Collection" ) ) ) ) ) ), T ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell(
                                      makeString( "TheSet" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                          makeString( "TheTermBindingFn" ) ), constant_handles.reader_make_constant_shell( makeString( "TheAssertionSentence" ) ), ConsesLow.list( constant_handles
                                              .reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "Predicate" ) ), constant_handles.reader_make_constant_shell(
                                                  makeString( "Collection" ) ) ) ) ) ) ), T )
    } );
    $sym63$INFERENCIFY_KB_SET_OF_BINDING_SETS = makeSymbol( "INFERENCIFY-KB-SET-OF-BINDING-SETS" );
    $list64 = ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheEmptySet" ) ) ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "TheSet" ) ), constant_handles.reader_make_constant_shell( makeString( "TheEmptySet" ) ) ) ), ConsesLow.list( NIL ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
            constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), ConsesLow.list( constant_handles
                .reader_make_constant_shell( makeString( "ELInferenceBindingFn" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "Collection" ) ) ) ) ) ), ConsesLow.list( ConsesLow.list(
                    ConsesLow.cons( makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "Collection" ) ) ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                        .reader_make_constant_shell( makeString( "TheSet" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), ConsesLow.list( constant_handles
                            .reader_make_constant_shell( makeString( "ELInferenceBindingFn" ) ), makeSymbol( "?Y" ), makeString( "hello" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                "ELInferenceBindingFn" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "Predicate" ) ) ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.cons(
                                    makeSymbol( "?Y" ), makeString( "hello" ) ), ConsesLow.cons( makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "Predicate" ) ) ) ) ) ), ConsesLow.list(
                                        ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                            "TheSet" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ELInferenceBindingFn" ) ), makeSymbol( "?Y" ), makeString( "hello" ) ) ), ConsesLow
                                                .list( constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                    "ELInferenceBindingFn" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "Predicate" ) ) ) ) ) ), ConsesLow.list( ConsesLow.list(
                                                        ConsesLow.cons( makeSymbol( "?Y" ), makeString( "hello" ) ) ), ConsesLow.list( ConsesLow.cons( makeSymbol( "?X" ), constant_handles.reader_make_constant_shell(
                                                            makeString( "Predicate" ) ) ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ),
                                                                ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                    makeString( "TheTermBindingFn" ) ), constant_handles.reader_make_constant_shell( makeString( "TheCurrentKBNumber" ) ), makeInteger( 1180 ) ) ) ) ),
                                                                ConsesLow.list( ConsesLow.list( ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "TheCurrentKBNumber" ) ), makeInteger(
                                                                    1180 ) ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), ConsesLow.list(
                                                                        constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                            "TheTermBindingFn" ) ), constant_handles.reader_make_constant_shell( makeString( "TheCurrentKBNumber" ) ), makeInteger( 1180 ) ), ConsesLow
                                                                                .list( constant_handles.reader_make_constant_shell( makeString( "TheTermBindingFn" ) ), constant_handles.reader_make_constant_shell(
                                                                                    makeString( "TheAssertionSentence" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ),
                                                                                        constant_handles.reader_make_constant_shell( makeString( "Predicate" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                            "Collection" ) ) ) ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.cons( constant_handles.reader_make_constant_shell(
                                                                                                makeString( "TheCurrentKBNumber" ) ), makeInteger( 1180 ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                    makeString( "TheAssertionSentence" ) ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ),
                                                                                                    constant_handles.reader_make_constant_shell( makeString( "Predicate" ) ), constant_handles.reader_make_constant_shell(
                                                                                                        makeString( "Collection" ) ) ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                                                                                                            .reader_make_constant_shell( makeString( "TheSet" ) ), ConsesLow.list( constant_handles
                                                                                                                .reader_make_constant_shell( makeString( "TheSet" ) ), ConsesLow.list( constant_handles
                                                                                                                    .reader_make_constant_shell( makeString( "TheTermBindingFn" ) ), constant_handles
                                                                                                                        .reader_make_constant_shell( makeString( "TheCurrentKBNumber" ) ), makeInteger( 1180 ) ) ),
                                                                                                            ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), ConsesLow.list(
                                                                                                                constant_handles.reader_make_constant_shell( makeString( "TheTermBindingFn" ) ), constant_handles
                                                                                                                    .reader_make_constant_shell( makeString( "TheAssertionSentence" ) ), ConsesLow.list( constant_handles
                                                                                                                        .reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell(
                                                                                                                            makeString( "Predicate" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                "Collection" ) ) ) ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.cons( constant_handles
                                                                                                                                    .reader_make_constant_shell( makeString( "TheCurrentKBNumber" ) ), makeInteger(
                                                                                                                                        1180 ) ) ), ConsesLow.list( ConsesLow.list( constant_handles
                                                                                                                                            .reader_make_constant_shell( makeString( "TheAssertionSentence" ) ),
                                                                                                                                            constant_handles.reader_make_constant_shell( makeString( "isa" ) ),
                                                                                                                                            constant_handles.reader_make_constant_shell( makeString( "Predicate" ) ),
                                                                                                                                            constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                "Collection" ) ) ) ) ) ) );
    $sym65$KBIFY_SET_OF_BINDING_SETS = makeSymbol( "KBIFY-SET-OF-BINDING-SETS" );
    $sym66$TEST_KBIFIED_SET_OF_BINDING_SETS = makeSymbol( "TEST-KBIFIED-SET-OF-BINDING-SETS" );
    $list67 = ConsesLow.list( ConsesLow.list( ConsesLow.list( NIL ), constant_handles.reader_make_constant_shell( makeString( "TheEmptySet" ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( NIL ) ), ConsesLow.list(
        constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), constant_handles.reader_make_constant_shell( makeString( "TheEmptySet" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow
            .list( ConsesLow.cons( makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "Collection" ) ) ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                "TheSet" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ELInferenceBindingFn" ) ),
                    makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "Collection" ) ) ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.cons( makeSymbol(
                        "?Y" ), makeString( "hello" ) ), ConsesLow.cons( makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "Predicate" ) ) ) ) ) ), ConsesLow.list( constant_handles
                            .reader_make_constant_shell( makeString( "TheSet" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), ConsesLow.list( constant_handles
                                .reader_make_constant_shell( makeString( "ELInferenceBindingFn" ) ), makeSymbol( "?Y" ), makeString( "hello" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                    "ELInferenceBindingFn" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "Predicate" ) ) ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                                        ConsesLow.list( ConsesLow.cons( makeSymbol( "?Y" ), makeString( "hello" ) ) ), ConsesLow.list( ConsesLow.cons( makeSymbol( "?X" ), constant_handles.reader_make_constant_shell(
                                            makeString( "Predicate" ) ) ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), ConsesLow.list( constant_handles
                                                .reader_make_constant_shell( makeString( "TheSet" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ELInferenceBindingFn" ) ), makeSymbol(
                                                    "?Y" ), makeString( "hello" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), ConsesLow.list( constant_handles
                                                        .reader_make_constant_shell( makeString( "ELInferenceBindingFn" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString(
                                                            "Predicate" ) ) ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.cons( constant_handles.reader_make_constant_shell(
                                                                makeString( "TheCurrentKBNumber" ) ), makeInteger( 1180 ) ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ),
                                                                    ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                        makeString( "TheTermBindingFn" ) ), constant_handles.reader_make_constant_shell( makeString( "TheCurrentKBNumber" ) ), makeInteger( 1180 ) ) ) ) ),
        ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "TheCurrentKBNumber" ) ), makeInteger( 1180 ) ), ConsesLow.list(
            constant_handles.reader_make_constant_shell( makeString( "TheAssertionSentence" ) ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell(
                makeString( "Predicate" ) ), constant_handles.reader_make_constant_shell( makeString( "Collection" ) ) ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ),
                    ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheTermBindingFn" ) ), constant_handles
                        .reader_make_constant_shell( makeString( "TheCurrentKBNumber" ) ), makeInteger( 1180 ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheTermBindingFn" ) ),
                            constant_handles.reader_make_constant_shell( makeString( "TheAssertionSentence" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles
                                .reader_make_constant_shell( makeString( "Predicate" ) ), constant_handles.reader_make_constant_shell( makeString( "Collection" ) ) ) ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow
                                    .list( ConsesLow.list( ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "TheCurrentKBNumber" ) ), makeInteger( 1180 ) ) ), ConsesLow.list( ConsesLow.list(
                                        constant_handles.reader_make_constant_shell( makeString( "TheAssertionSentence" ) ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles
                                            .reader_make_constant_shell( makeString( "Predicate" ) ), constant_handles.reader_make_constant_shell( makeString( "Collection" ) ) ) ) ) ), ConsesLow.list( constant_handles
                                                .reader_make_constant_shell( makeString( "TheSet" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), ConsesLow.list(
                                                    constant_handles.reader_make_constant_shell( makeString( "TheTermBindingFn" ) ), constant_handles.reader_make_constant_shell( makeString( "TheCurrentKBNumber" ) ),
                                                    makeInteger( 1180 ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), ConsesLow.list( constant_handles
                                                        .reader_make_constant_shell( makeString( "TheTermBindingFn" ) ), constant_handles.reader_make_constant_shell( makeString( "TheAssertionSentence" ) ), ConsesLow
                                                            .list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "Predicate" ) ),
                                                                constant_handles.reader_make_constant_shell( makeString( "Collection" ) ) ) ) ) ) ) );
    $sym68$KBIFY_INFERENCE_SET_OF_BINDING_SETS = makeSymbol( "KBIFY-INFERENCE-SET-OF-BINDING-SETS" );
    $list69 = ConsesLow.list( ConsesLow.list( ConsesLow.list( NIL ), constant_handles.reader_make_constant_shell( makeString( "TheEmptySet" ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( NIL ) ), ConsesLow.list(
        constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), constant_handles.reader_make_constant_shell( makeString( "TheEmptySet" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow
            .list( ConsesLow.cons( makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "Collection" ) ) ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                "TheSet" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ELInferenceBindingFn" ) ),
                    makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "Collection" ) ) ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.cons( makeSymbol(
                        "?Y" ), makeString( "hello" ) ), ConsesLow.cons( makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "Predicate" ) ) ) ) ) ), ConsesLow.list( constant_handles
                            .reader_make_constant_shell( makeString( "TheSet" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), ConsesLow.list( constant_handles
                                .reader_make_constant_shell( makeString( "ELInferenceBindingFn" ) ), makeSymbol( "?Y" ), makeString( "hello" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                    "ELInferenceBindingFn" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "Predicate" ) ) ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                                        ConsesLow.list( ConsesLow.cons( makeSymbol( "?Y" ), makeString( "hello" ) ) ), ConsesLow.list( ConsesLow.cons( makeSymbol( "?X" ), constant_handles.reader_make_constant_shell(
                                            makeString( "Predicate" ) ) ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), ConsesLow.list( constant_handles
                                                .reader_make_constant_shell( makeString( "TheSet" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ELInferenceBindingFn" ) ), makeSymbol(
                                                    "?Y" ), makeString( "hello" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), ConsesLow.list( constant_handles
                                                        .reader_make_constant_shell( makeString( "ELInferenceBindingFn" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString(
                                                            "Predicate" ) ) ) ) ) ) );
    $sym70$KB_BINDING_SET_VARIABLES = makeSymbol( "KB-BINDING-SET-VARIABLES" );
    $list71 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
        makeString( "ELInferenceBindingFn" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "Collection" ) ) ) ) ), ConsesLow.list( makeSymbol( "?X" ) ) ), ConsesLow.list( ConsesLow.list(
            ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ELInferenceBindingFn" ) ), makeSymbol( "?Y" ),
                makeString( "hello" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ELInferenceBindingFn" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString(
                    "Predicate" ) ) ) ) ), ConsesLow.list( makeSymbol( "?Y" ), makeSymbol( "?X" ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                        "TheSet" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheTermBindingFn" ) ), constant_handles.reader_make_constant_shell( makeString( "TheCurrentKBNumber" ) ),
                            makeInteger( 1180 ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheCurrentKBNumber" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                                constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheTermBindingFn" ) ), constant_handles
                                    .reader_make_constant_shell( makeString( "TheCurrentKBNumber" ) ), makeInteger( 1180 ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                        "TheTermBindingFn" ) ), constant_handles.reader_make_constant_shell( makeString( "TheAssertionSentence" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                            makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "Predicate" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                "Collection" ) ) ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheCurrentKBNumber" ) ), constant_handles.reader_make_constant_shell(
                                                    makeString( "TheAssertionSentence" ) ) ) ) );
    $list72 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
        makeString( "ELInferenceBindingFn" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "Collection" ) ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
            makeString( "Collection" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), ConsesLow.list( constant_handles
                .reader_make_constant_shell( makeString( "ELInferenceBindingFn" ) ), makeSymbol( "?Y" ), makeString( "hello" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                    "ELInferenceBindingFn" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "Predicate" ) ) ) ) ), ConsesLow.list( makeString( "hello" ), constant_handles
                        .reader_make_constant_shell( makeString( "Predicate" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), ConsesLow.list(
                            constant_handles.reader_make_constant_shell( makeString( "TheTermBindingFn" ) ), constant_handles.reader_make_constant_shell( makeString( "TheCurrentKBNumber" ) ), makeInteger( 1180 ) ) ) ),
                            ConsesLow.list( makeInteger( 1180 ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), ConsesLow.list( constant_handles
                                .reader_make_constant_shell( makeString( "TheTermBindingFn" ) ), constant_handles.reader_make_constant_shell( makeString( "TheCurrentKBNumber" ) ), makeInteger( 1180 ) ), ConsesLow.list(
                                    constant_handles.reader_make_constant_shell( makeString( "TheTermBindingFn" ) ), constant_handles.reader_make_constant_shell( makeString( "TheAssertionSentence" ) ), ConsesLow.list(
                                        constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "Predicate" ) ), constant_handles
                                            .reader_make_constant_shell( makeString( "Collection" ) ) ) ) ) ), ConsesLow.list( makeInteger( 1180 ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "Predicate" ) ), constant_handles.reader_make_constant_shell( makeString( "Collection" ) ) ) ) ) );
  }

  public static final class $binding_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $binding_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "BINDING-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return binding_p( arg1 );
    }
  }

  public static final class $inference_binding_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $inference_binding_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "INFERENCE-BINDING-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return inference_binding_p( arg1 );
    }
  }

  public static final class $subst_bindings$BinaryFunction
      extends
        BinaryFunction
  {
    public $subst_bindings$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SUBST-BINDINGS" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return subst_bindings( arg1, arg2 );
    }
  }

  public static final class $variable_binding_variable$UnaryFunction
      extends
        UnaryFunction
  {
    public $variable_binding_variable$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "VARIABLE-BINDING-VARIABLE" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return variable_binding_variable( arg1 );
    }
  }

  public static final class $variable_binding_value$UnaryFunction
      extends
        UnaryFunction
  {
    public $variable_binding_value$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "VARIABLE-BINDING-VALUE" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return variable_binding_value( arg1 );
    }
  }
}
/*
 * 
 * Total time: 495 ms
 * 
 */