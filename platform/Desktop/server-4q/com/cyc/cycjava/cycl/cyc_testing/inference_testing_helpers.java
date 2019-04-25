package com.cyc.cycjava.cycl.cyc_testing;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.genls;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inference_testing_helpers
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cyc_testing.inference_testing_helpers";
  public static final String myFingerPrint = "62bdd879a552d7c3bc57d61618a8e59d101d8dda6bab9bafc8ede9f9625e77e2";
  private static final SubLObject $const0$Predicate;
  private static final SubLSymbol $sym1$PRED_SPEC_;
  private static final SubLSymbol $sym2$CSETQ;
  private static final SubLSymbol $sym3$PRINT_CREATE;
  private static final SubLSymbol $sym4$QUOTE;
  private static final SubLSymbol $sym5$APPEND;
  private static final SubLSymbol $sym6$LIST;
  private static final SubLObject $const7$isa;
  private static final SubLSymbol $sym8$DECLARE;
  private static final SubLSymbol $sym9$SPECIAL;

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing-helpers.lisp", position = 531L)
  public static SubLObject pred_specP(final SubLObject v_const)
  {
    return genls.genlsP( v_const, $const0$Predicate, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing-helpers.lisp", position = 603L)
  public static SubLObject make_var_spec(final SubLObject var, final SubLObject types)
  {
    return ConsesLow.cons( var, types );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing-helpers.lisp", position = 673L)
  public static SubLObject var_spec_var(final SubLObject var_spec)
  {
    return var_spec.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing-helpers.lisp", position = 738L)
  public static SubLObject var_const_name(final SubLObject var, SubLObject predP)
  {
    if( predP == UNPROVIDED )
    {
      predP = NIL;
    }
    final SubLObject res = Sequences.delete( Characters.CHAR_hyphen, Strings.string_capitalize( Symbols.symbol_name( var ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != predP )
    {
      Strings.nstring_downcase( res, ZERO_INTEGER, ONE_INTEGER );
    }
    return res;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing-helpers.lisp", position = 927L)
  public static SubLObject var_spec_const_name(final SubLObject var_spec)
  {
    final SubLObject predP = list_utilities.any_in_list( Symbols.symbol_function( $sym1$PRED_SPEC_ ), var_spec_types( var_spec ), UNPROVIDED );
    return var_const_name( var_spec_var( var_spec ), predP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing-helpers.lisp", position = 1117L)
  public static SubLObject var_spec_types(final SubLObject var_spec)
  {
    return var_spec.rest();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing-helpers.lisp", position = 1184L)
  public static SubLObject print_create_var_spec_constant(final SubLObject var_spec)
  {
    final SubLObject var = var_spec_var( var_spec );
    if( var.isCons() )
    {
      SubLObject result = NIL;
      SubLObject cdolist_list_var = Sequences.reverse( var );
      SubLObject var2 = NIL;
      var2 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        result = ConsesLow.cons( print_create_var_constant( var2 ), result );
        cdolist_list_var = cdolist_list_var.rest();
        var2 = cdolist_list_var.first();
      }
      return result;
    }
    return ConsesLow.list( print_create_var_constant( var ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing-helpers.lisp", position = 1433L)
  public static SubLObject print_create_var_constant(final SubLObject var)
  {
    return ConsesLow.list( $sym2$CSETQ, var, ConsesLow.list( $sym3$PRINT_CREATE, var_const_name( var, UNPROVIDED ), ConsesLow.list( $sym4$QUOTE, var ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing-helpers.lisp", position = 1556L)
  public static SubLObject var_spec_def(final SubLObject var_spec)
  {
    final SubLObject var = var_spec_var( var_spec );
    final SubLObject types = Sequences.reverse( var_spec_types( var_spec ) );
    if( var.isCons() )
    {
      SubLObject result = NIL;
      SubLObject cdolist_list_var = Sequences.reverse( var );
      SubLObject var2 = NIL;
      var2 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        result = ConsesLow.cons( var_spec_def( make_var_spec( var2, types ) ), result );
        cdolist_list_var = cdolist_list_var.rest();
        var2 = cdolist_list_var.first();
      }
      return Functions.apply( Symbols.symbol_function( $sym5$APPEND ), result );
    }
    SubLObject result = NIL;
    SubLObject cdolist_list_var = Sequences.reverse( types );
    SubLObject type = NIL;
    type = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      result = ConsesLow.cons( ConsesLow.list( $sym6$LIST, $const7$isa, var, type ), result );
      cdolist_list_var = cdolist_list_var.rest();
      type = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing-helpers.lisp", position = 1900L)
  public static SubLObject declare_special_vars(final SubLObject vars)
  {
    return ConsesLow.list( $sym8$DECLARE, reader.bq_cons( $sym9$SPECIAL, ConsesLow.append( vars, NIL ) ) );
  }

  public static SubLObject declare_inference_testing_helpers_file()
  {
    SubLFiles.declareFunction( me, "pred_specP", "PRED-SPEC?", 1, 0, false );
    SubLFiles.declareFunction( me, "make_var_spec", "MAKE-VAR-SPEC", 2, 0, false );
    SubLFiles.declareFunction( me, "var_spec_var", "VAR-SPEC-VAR", 1, 0, false );
    SubLFiles.declareFunction( me, "var_const_name", "VAR-CONST-NAME", 1, 1, false );
    SubLFiles.declareFunction( me, "var_spec_const_name", "VAR-SPEC-CONST-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "var_spec_types", "VAR-SPEC-TYPES", 1, 0, false );
    SubLFiles.declareFunction( me, "print_create_var_spec_constant", "PRINT-CREATE-VAR-SPEC-CONSTANT", 1, 0, false );
    SubLFiles.declareFunction( me, "print_create_var_constant", "PRINT-CREATE-VAR-CONSTANT", 1, 0, false );
    SubLFiles.declareFunction( me, "var_spec_def", "VAR-SPEC-DEF", 1, 0, false );
    SubLFiles.declareFunction( me, "declare_special_vars", "DECLARE-SPECIAL-VARS", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_inference_testing_helpers_file()
  {
    return NIL;
  }

  public static SubLObject setup_inference_testing_helpers_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_inference_testing_helpers_file();
  }

  @Override
  public void initializeVariables()
  {
    init_inference_testing_helpers_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_inference_testing_helpers_file();
  }
  static
  {
    me = new inference_testing_helpers();
    $const0$Predicate = constant_handles.reader_make_constant_shell( makeString( "Predicate" ) );
    $sym1$PRED_SPEC_ = makeSymbol( "PRED-SPEC?" );
    $sym2$CSETQ = makeSymbol( "CSETQ" );
    $sym3$PRINT_CREATE = makeSymbol( "PRINT-CREATE" );
    $sym4$QUOTE = makeSymbol( "QUOTE" );
    $sym5$APPEND = makeSymbol( "APPEND" );
    $sym6$LIST = makeSymbol( "LIST" );
    $const7$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $sym8$DECLARE = makeSymbol( "DECLARE" );
    $sym9$SPECIAL = makeSymbol( "SPECIAL" );
  }
}
/*
 * 
 * Total time: 75 ms
 * 
 */