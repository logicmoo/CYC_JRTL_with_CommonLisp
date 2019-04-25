package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class el_math_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.el_math_utilities";
  public static final String myFingerPrint = "2f12b0102c6e61515479ee7646c2846024ea7ba429a65bcafb3f00a0fd6be5ef";
  private static final SubLString $str0$A_KB_dependent_numerical_quantifi;
  private static final SubLObject $const1$IntervalMinFn;
  private static final SubLObject $const2$Unity;
  private static final SubLObject $const3$PlusInfinity;
  private static final SubLObject $const4$IntervalMaxFn;
  private static final SubLObject $const5$thereExistAtLeast;
  private static final SubLObject $const6$thereExistAtMost;
  private static final SubLObject $const7$thereExistExactly;

  @SubLTranslatedFile.SubL(source = "cycl/el-math-utilities.lisp", position = 752L)
  public static SubLObject el_minP(final SubLObject v_term)
  {
    if( NIL == kb_control_vars.quant_kb_loaded_p() )
    {
      Errors.error( $str0$A_KB_dependent_numerical_quantifi );
    }
    return makeBoolean( NIL != interval_minP( v_term ) || NIL != plus_infinity_unityP( v_term ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-math-utilities.lisp", position = 1270L)
  public static SubLObject interval_minP(final SubLObject v_term)
  {
    if( NIL == kb_control_vars.quant_kb_loaded_p() )
    {
      Errors.error( $str0$A_KB_dependent_numerical_quantifi );
    }
    return makeBoolean( NIL != el_utilities.el_formula_p( v_term ) && $const1$IntervalMinFn.eql( cycl_utilities.formula_arg0( v_term ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-math-utilities.lisp", position = 1660L)
  public static SubLObject plus_infinity_unityP(final SubLObject v_term)
  {
    if( NIL == kb_control_vars.quant_kb_loaded_p() )
    {
      Errors.error( $str0$A_KB_dependent_numerical_quantifi );
    }
    return makeBoolean( NIL != el_utilities.el_formula_p( v_term ) && $const2$Unity.eql( cycl_utilities.formula_arg0( v_term ) ) && $const3$PlusInfinity.eql( cycl_utilities.formula_arg2( v_term, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-math-utilities.lisp", position = 2107L)
  public static SubLObject el_min(final SubLObject v_term)
  {
    if( NIL == kb_control_vars.quant_kb_loaded_p() )
    {
      Errors.error( $str0$A_KB_dependent_numerical_quantifi );
    }
    if( NIL != interval_minP( v_term ) )
    {
      return cycl_utilities.formula_arg1( v_term, UNPROVIDED );
    }
    if( NIL != plus_infinity_unityP( v_term ) )
    {
      return cycl_utilities.formula_arg1( v_term, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-math-utilities.lisp", position = 2577L)
  public static SubLObject el_maxP(final SubLObject v_term)
  {
    if( NIL == kb_control_vars.quant_kb_loaded_p() )
    {
      Errors.error( $str0$A_KB_dependent_numerical_quantifi );
    }
    return makeBoolean( NIL != interval_maxP( v_term ) || NIL != unity_non_neg_maxP( v_term ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-math-utilities.lisp", position = 3029L)
  public static SubLObject interval_maxP(final SubLObject v_term)
  {
    if( NIL == kb_control_vars.quant_kb_loaded_p() )
    {
      Errors.error( $str0$A_KB_dependent_numerical_quantifi );
    }
    return makeBoolean( NIL != el_utilities.el_formula_p( v_term ) && $const4$IntervalMaxFn.eql( cycl_utilities.formula_arg0( v_term ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-math-utilities.lisp", position = 3419L)
  public static SubLObject unity_non_neg_maxP(final SubLObject v_term)
  {
    if( NIL == kb_control_vars.quant_kb_loaded_p() )
    {
      Errors.error( $str0$A_KB_dependent_numerical_quantifi );
    }
    return makeBoolean( NIL != el_utilities.el_formula_p( v_term ) && $const2$Unity.eql( cycl_utilities.formula_arg0( v_term ) ) && ZERO_INTEGER.eql( cycl_utilities.formula_arg1( v_term, UNPROVIDED ) )
        && NIL != cycl_utilities.formula_arg2( v_term, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-math-utilities.lisp", position = 3865L)
  public static SubLObject el_max(final SubLObject v_term)
  {
    if( NIL == kb_control_vars.quant_kb_loaded_p() )
    {
      Errors.error( $str0$A_KB_dependent_numerical_quantifi );
    }
    if( NIL != unity_non_neg_maxP( v_term ) )
    {
      return cycl_utilities.formula_arg2( v_term, UNPROVIDED );
    }
    if( NIL != interval_maxP( v_term ) )
    {
      return cycl_utilities.formula_arg1( v_term, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-math-utilities.lisp", position = 4320L)
  public static SubLObject quantified_interval(final SubLObject quant, final SubLObject num)
  {
    if( NIL == kb_control_vars.quant_kb_loaded_p() )
    {
      Errors.error( $str0$A_KB_dependent_numerical_quantifi );
    }
    if( $const5$thereExistAtLeast.eql( quant ) )
    {
      return el_utilities.make_unary_formula( $const1$IntervalMinFn, num );
    }
    if( $const6$thereExistAtMost.eql( quant ) )
    {
      return el_utilities.make_unary_formula( $const4$IntervalMaxFn, num );
    }
    if( $const7$thereExistExactly.eql( quant ) )
    {
      return num;
    }
    return NIL;
  }

  public static SubLObject declare_el_math_utilities_file()
  {
    SubLFiles.declareFunction( me, "el_minP", "EL-MIN?", 1, 0, false );
    SubLFiles.declareFunction( me, "interval_minP", "INTERVAL-MIN?", 1, 0, false );
    SubLFiles.declareFunction( me, "plus_infinity_unityP", "PLUS-INFINITY-UNITY?", 1, 0, false );
    SubLFiles.declareFunction( me, "el_min", "EL-MIN", 1, 0, false );
    SubLFiles.declareFunction( me, "el_maxP", "EL-MAX?", 1, 0, false );
    SubLFiles.declareFunction( me, "interval_maxP", "INTERVAL-MAX?", 1, 0, false );
    SubLFiles.declareFunction( me, "unity_non_neg_maxP", "UNITY-NON-NEG-MAX?", 1, 0, false );
    SubLFiles.declareFunction( me, "el_max", "EL-MAX", 1, 0, false );
    SubLFiles.declareFunction( me, "quantified_interval", "QUANTIFIED-INTERVAL", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_el_math_utilities_file()
  {
    return NIL;
  }

  public static SubLObject setup_el_math_utilities_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_el_math_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_el_math_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_el_math_utilities_file();
  }
  static
  {
    me = new el_math_utilities();
    $str0$A_KB_dependent_numerical_quantifi = makeString( "A KB-dependent numerical quantification function was called, but the current Cyc KB does not contain knowledge about numerical quantification." );
    $const1$IntervalMinFn = constant_handles.reader_make_constant_shell( makeString( "IntervalMinFn" ) );
    $const2$Unity = constant_handles.reader_make_constant_shell( makeString( "Unity" ) );
    $const3$PlusInfinity = constant_handles.reader_make_constant_shell( makeString( "PlusInfinity" ) );
    $const4$IntervalMaxFn = constant_handles.reader_make_constant_shell( makeString( "IntervalMaxFn" ) );
    $const5$thereExistAtLeast = constant_handles.reader_make_constant_shell( makeString( "thereExistAtLeast" ) );
    $const6$thereExistAtMost = constant_handles.reader_make_constant_shell( makeString( "thereExistAtMost" ) );
    $const7$thereExistExactly = constant_handles.reader_make_constant_shell( makeString( "thereExistExactly" ) );
  }
}
/*
 * 
 * Total time: 107 ms
 * 
 */