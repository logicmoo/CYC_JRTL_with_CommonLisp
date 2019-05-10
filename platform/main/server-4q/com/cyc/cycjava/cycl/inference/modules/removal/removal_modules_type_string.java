package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.string_typing;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_type_string
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_string";
  public static final String myFingerPrint = "ac4a59849b6e02f3841ee7a5abc153a01252ab3569c7f17465e91ee62a27b027";
  private static final SubLObject $const0$typeFromString;
  private static final SubLSymbol $kw1$POS;
  private static final SubLSymbol $kw2$NEG;
  private static final SubLSymbol $kw3$REMOVAL_TYPE_STRING_UNIFY_ARG2;
  private static final SubLList $list4;
  private static final SubLSymbol $kw5$REMOVAL_TYPE_STRING_CHECK_POS;
  private static final SubLList $list6;
  private static final SubLSymbol $kw7$REMOVAL_TYPE_STRING_CHECK_POS_NEG;
  private static final SubLList $list8;
  private static final SubLSymbol $kw9$COLLECTION;
  private static final SubLObject $const10$Collection;
  private static final SubLSymbol $kw11$INDIVIDUAL;
  private static final SubLObject $const12$Individual;
  private static final SubLSymbol $kw13$OPAQUE;
  private static final SubLSymbol $sym14$REMOVAL_TYPE_STRING_ARG2_UNBOUND;
  private static final SubLList $list15;
  private static final SubLSymbol $sym16$REMOVAL_TYPE_STRING_ALL_BOUND;
  private static final SubLSymbol $sym17$REMOVAL_TYPE_STRING_ALL_BOUND_NEG;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-string.lisp", position = 2321L)
  public static SubLObject removal_type_string_arg2_unbound(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( cycl_utilities.formula_arg1( asent, UNPROVIDED ).isString() )
    {
      final SubLObject type0 = string_typing.type_string( cycl_utilities.formula_arg1( asent, UNPROVIDED ) );
      SubLObject type2 = NIL;
      final SubLObject pcase_var = type0;
      if( pcase_var.eql( $kw9$COLLECTION ) )
      {
        type2 = $const10$Collection;
      }
      else if( pcase_var.eql( $kw11$INDIVIDUAL ) )
      {
        type2 = $const12$Individual;
      }
      thread.resetMultipleValues();
      final SubLObject v_bindings = unification_utilities.term_unify( type2, cycl_utilities.formula_arg2( asent, UNPROVIDED ), T, T );
      final SubLObject justification = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != v_bindings )
      {
        final SubLObject bound_arg2 = bindings.subst_bindings( v_bindings, cycl_utilities.formula_arg2( asent, UNPROVIDED ) );
        final SubLObject unified_asent = el_utilities.replace_formula_arg( TWO_INTEGER, bound_arg2, asent );
        backward.removal_add_node( arguments.make_hl_support( $kw13$OPAQUE, unified_asent, UNPROVIDED, UNPROVIDED ), v_bindings, justification );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-string.lisp", position = 2978L)
  public static SubLObject removal_type_string_all_bound(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    if( cycl_utilities.formula_arg1( asent, UNPROVIDED ).isString() )
    {
      final SubLObject type0 = string_typing.type_string( cycl_utilities.formula_arg1( asent, UNPROVIDED ) );
      SubLObject type2 = NIL;
      final SubLObject pcase_var = type0;
      if( pcase_var.eql( $kw9$COLLECTION ) )
      {
        type2 = $const10$Collection;
      }
      else if( pcase_var.eql( $kw11$INDIVIDUAL ) )
      {
        type2 = $const12$Individual;
      }
      if( type2.eql( cycl_utilities.formula_arg2( asent, UNPROVIDED ) ) )
      {
        backward.removal_add_node( arguments.make_hl_support( $kw13$OPAQUE, asent, UNPROVIDED, UNPROVIDED ), $list15, NIL );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-string.lisp", position = 3408L)
  public static SubLObject removal_type_string_all_bound_neg(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    if( cycl_utilities.formula_arg1( asent, UNPROVIDED ).isString() )
    {
      final SubLObject type0 = string_typing.type_string( cycl_utilities.formula_arg1( asent, UNPROVIDED ) );
      SubLObject type2 = NIL;
      final SubLObject pcase_var = type0;
      if( pcase_var.eql( $kw9$COLLECTION ) )
      {
        type2 = $const10$Collection;
      }
      else if( pcase_var.eql( $kw11$INDIVIDUAL ) )
      {
        type2 = $const12$Individual;
      }
      if( !type2.eql( cycl_utilities.formula_arg2( asent, UNPROVIDED ) ) )
      {
        backward.removal_add_node( arguments.make_hl_support( $kw13$OPAQUE, cycl_utilities.negate( asent ), UNPROVIDED, UNPROVIDED ), $list15, NIL );
      }
    }
    return NIL;
  }

  public static SubLObject declare_removal_modules_type_string_file()
  {
    SubLFiles.declareFunction( me, "removal_type_string_arg2_unbound", "REMOVAL-TYPE-STRING-ARG2-UNBOUND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_type_string_all_bound", "REMOVAL-TYPE-STRING-ALL-BOUND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_type_string_all_bound_neg", "REMOVAL-TYPE-STRING-ALL-BOUND-NEG", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_type_string_file()
  {
    return NIL;
  }

  public static SubLObject setup_removal_modules_type_string_file()
  {
    inference_modules.register_solely_specific_removal_module_predicate( $const0$typeFromString );
    preference_modules.doomed_unless_arg_bindable( $kw1$POS, $const0$typeFromString, ONE_INTEGER );
    preference_modules.doomed_unless_all_args_bindable( $kw2$NEG, $const0$typeFromString );
    inference_modules.inference_removal_module( $kw3$REMOVAL_TYPE_STRING_UNIFY_ARG2, $list4 );
    inference_modules.inference_removal_module( $kw5$REMOVAL_TYPE_STRING_CHECK_POS, $list6 );
    inference_modules.inference_removal_module( $kw7$REMOVAL_TYPE_STRING_CHECK_POS_NEG, $list8 );
    utilities_macros.note_funcall_helper_function( $sym14$REMOVAL_TYPE_STRING_ARG2_UNBOUND );
    utilities_macros.note_funcall_helper_function( $sym16$REMOVAL_TYPE_STRING_ALL_BOUND );
    utilities_macros.note_funcall_helper_function( $sym17$REMOVAL_TYPE_STRING_ALL_BOUND_NEG );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_type_string_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_type_string_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_type_string_file();
  }
  static
  {
    me = new removal_modules_type_string();
    $const0$typeFromString = constant_handles.reader_make_constant_shell( makeString( "typeFromString" ) );
    $kw1$POS = makeKeyword( "POS" );
    $kw2$NEG = makeKeyword( "NEG" );
    $kw3$REMOVAL_TYPE_STRING_UNIFY_ARG2 = makeKeyword( "REMOVAL-TYPE-STRING-UNIFY-ARG2" );
    $list4 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "typeFromString" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "typeFromString" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword(
            "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-TYPE-STRING-ARG2-UNBOUND" ), makeKeyword( "DOCUMENTATION" ),
      makeString( "(#$typeFromString :fully-bound :not-fully-bound)" ), makeKeyword( "EXAMPLE" ), makeString( "(#$typeFromString \"Patrick AFB\" #$Individual)" )
    } );
    $kw5$REMOVAL_TYPE_STRING_CHECK_POS = makeKeyword( "REMOVAL-TYPE-STRING-CHECK-POS" );
    $list6 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "typeFromString" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "typeFromString" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ),
      ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-TYPE-STRING-ALL-BOUND" ), makeKeyword( "DOCUMENTATION" ), makeString(
          "(#$typeFromString :fully-bound :fully-bound)" ), makeKeyword( "EXAMPLE" ), makeString( "(#$typeFromString \"Patrick AFB\" #$Individual)" )
    } );
    $kw7$REMOVAL_TYPE_STRING_CHECK_POS_NEG = makeKeyword( "REMOVAL-TYPE-STRING-CHECK-POS-NEG" );
    $list8 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "typeFromString" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "typeFromString" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ),
      ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-TYPE-STRING-ALL-BOUND-NEG" ), makeKeyword( "DOCUMENTATION" ), makeString(
          "(#$not (#$typeFromString :fully-bound :fully-bound))" ), makeKeyword( "EXAMPLE" ), makeString( "(#$not (#$typeFromString \"Patrick AFB\" #$Individual))" )
    } );
    $kw9$COLLECTION = makeKeyword( "COLLECTION" );
    $const10$Collection = constant_handles.reader_make_constant_shell( makeString( "Collection" ) );
    $kw11$INDIVIDUAL = makeKeyword( "INDIVIDUAL" );
    $const12$Individual = constant_handles.reader_make_constant_shell( makeString( "Individual" ) );
    $kw13$OPAQUE = makeKeyword( "OPAQUE" );
    $sym14$REMOVAL_TYPE_STRING_ARG2_UNBOUND = makeSymbol( "REMOVAL-TYPE-STRING-ARG2-UNBOUND" );
    $list15 = ConsesLow.list( ConsesLow.cons( T, T ) );
    $sym16$REMOVAL_TYPE_STRING_ALL_BOUND = makeSymbol( "REMOVAL-TYPE-STRING-ALL-BOUND" );
    $sym17$REMOVAL_TYPE_STRING_ALL_BOUND_NEG = makeSymbol( "REMOVAL-TYPE-STRING-ALL-BOUND-NEG" );
  }
}
/*
 * 
 * Total time: 84 ms
 * 
 */