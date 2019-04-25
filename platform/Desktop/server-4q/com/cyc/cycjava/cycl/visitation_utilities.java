package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class visitation_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.visitation_utilities";
  public static final String myFingerPrint = "17bdb2db9cd3d77a03027441c4d9c5c85e236bc8993805bcd3b70c23c8ea6a16";
  @SubLTranslatedFile.SubL(source = "cycl/visitation-utilities.lisp", position = 1018L)
  public static SubLSymbol $defstruct_recipe_constructor$;
  @SubLTranslatedFile.SubL(source = "cycl/visitation-utilities.lisp", position = 2049L)
  private static SubLSymbol $current_defstruct_recipe$;
  private static final SubLSymbol $kw0$__CONSTRUCTOR;
  private static final SubLSymbol $sym1$DEFSTRUCT_RECIPE_P;
  private static final SubLSymbol $sym2$FUNCTION_SPEC_P;
  private static final SubLSymbol $sym3$DEFSTRUCT_RECIPE_VISITORFN;
  private static final SubLSymbol $kw4$BEGIN;
  private static final SubLSymbol $kw5$SLOT;
  private static final SubLSymbol $kw6$END;

  @SubLTranslatedFile.SubL(source = "cycl/visitation-utilities.lisp", position = 1133L)
  public static SubLObject defstruct_recipe_p(final SubLObject obj)
  {
    return makeBoolean( obj.isCons() && obj.first().eql( $defstruct_recipe_constructor$.getGlobalValue() ) && conses_high.second( obj ).isFunctionSpec() && NIL != list_utilities.property_list_p( obj ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/visitation-utilities.lisp", position = 1342L)
  public static SubLObject get_defstruct_recipe_constructor(final SubLObject recipe)
  {
    if( !recipe.first().eql( $defstruct_recipe_constructor$.getGlobalValue() ) && !assertionsDisabledInClass && NIL == defstruct_recipe_p( recipe ) )
    {
      throw new AssertionError( recipe );
    }
    final SubLObject constructor = conses_high.second( recipe );
    assert NIL != Types.function_spec_p( constructor ) : constructor;
    return constructor;
  }

  @SubLTranslatedFile.SubL(source = "cycl/visitation-utilities.lisp", position = 1729L)
  public static SubLObject get_defstruct_recipe_parameters(final SubLObject recipe)
  {
    assert NIL != defstruct_recipe_p( recipe ) : recipe;
    final SubLObject past_constructor_tag = recipe.rest();
    final SubLObject past_func_spec = past_constructor_tag.rest();
    return past_func_spec;
  }

  @SubLTranslatedFile.SubL(source = "cycl/visitation-utilities.lisp", position = 2167L)
  public static SubLObject defstruct_recipe(final SubLObject struct)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject recipe = NIL;
    final SubLObject _prev_bind_0 = $current_defstruct_recipe$.currentBinding( thread );
    try
    {
      $current_defstruct_recipe$.bind( NIL, thread );
      visitation.visit_defstruct( struct, Symbols.symbol_function( $sym3$DEFSTRUCT_RECIPE_VISITORFN ) );
      recipe = $current_defstruct_recipe$.getDynamicValue( thread );
    }
    finally
    {
      $current_defstruct_recipe$.rebind( _prev_bind_0, thread );
    }
    return recipe;
  }

  @SubLTranslatedFile.SubL(source = "cycl/visitation-utilities.lisp", position = 2416L)
  public static SubLObject defstruct_recipe_visitorfn(final SubLObject obj, final SubLObject phase, final SubLObject param_a, final SubLObject param_b)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( phase.eql( $kw4$BEGIN ) )
    {
      $current_defstruct_recipe$.setDynamicValue( NIL, thread );
    }
    else if( phase.eql( $kw5$SLOT ) )
    {
      $current_defstruct_recipe$.setDynamicValue( ConsesLow.cons( param_a, ConsesLow.cons( param_b, $current_defstruct_recipe$.getDynamicValue( thread ) ) ), thread );
    }
    else if( phase.eql( $kw6$END ) )
    {
      $current_defstruct_recipe$.setDynamicValue( ConsesLow.cons( $defstruct_recipe_constructor$.getGlobalValue(), ConsesLow.cons( param_a, $current_defstruct_recipe$.getDynamicValue( thread ) ) ), thread );
    }
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/visitation-utilities.lisp", position = 2987L)
  public static SubLObject instantiate_defstruct_recipe(final SubLObject recipe)
  {
    assert NIL != defstruct_recipe_p( recipe ) : recipe;
    final SubLObject constructor = get_defstruct_recipe_constructor( recipe );
    final SubLObject parameters = get_defstruct_recipe_parameters( recipe );
    return Functions.funcall( constructor, parameters );
  }

  public static SubLObject declare_visitation_utilities_file()
  {
    SubLFiles.declareFunction( me, "defstruct_recipe_p", "DEFSTRUCT-RECIPE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "get_defstruct_recipe_constructor", "GET-DEFSTRUCT-RECIPE-CONSTRUCTOR", 1, 0, false );
    SubLFiles.declareFunction( me, "get_defstruct_recipe_parameters", "GET-DEFSTRUCT-RECIPE-PARAMETERS", 1, 0, false );
    SubLFiles.declareFunction( me, "defstruct_recipe", "DEFSTRUCT-RECIPE", 1, 0, false );
    SubLFiles.declareFunction( me, "defstruct_recipe_visitorfn", "DEFSTRUCT-RECIPE-VISITORFN", 4, 0, false );
    SubLFiles.declareFunction( me, "instantiate_defstruct_recipe", "INSTANTIATE-DEFSTRUCT-RECIPE", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_visitation_utilities_file()
  {
    $defstruct_recipe_constructor$ = SubLFiles.defconstant( "*DEFSTRUCT-RECIPE-CONSTRUCTOR*", $kw0$__CONSTRUCTOR );
    $current_defstruct_recipe$ = SubLFiles.defparameter( "*CURRENT-DEFSTRUCT-RECIPE*", NIL );
    return NIL;
  }

  public static SubLObject setup_visitation_utilities_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_visitation_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_visitation_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_visitation_utilities_file();
  }
  static
  {
    me = new visitation_utilities();
    $defstruct_recipe_constructor$ = null;
    $current_defstruct_recipe$ = null;
    $kw0$__CONSTRUCTOR = makeKeyword( "%%CONSTRUCTOR" );
    $sym1$DEFSTRUCT_RECIPE_P = makeSymbol( "DEFSTRUCT-RECIPE-P" );
    $sym2$FUNCTION_SPEC_P = makeSymbol( "FUNCTION-SPEC-P" );
    $sym3$DEFSTRUCT_RECIPE_VISITORFN = makeSymbol( "DEFSTRUCT-RECIPE-VISITORFN" );
    $kw4$BEGIN = makeKeyword( "BEGIN" );
    $kw5$SLOT = makeKeyword( "SLOT" );
    $kw6$END = makeKeyword( "END" );
  }
}
/*
 * 
 * Total time: 32 ms synthetic
 */