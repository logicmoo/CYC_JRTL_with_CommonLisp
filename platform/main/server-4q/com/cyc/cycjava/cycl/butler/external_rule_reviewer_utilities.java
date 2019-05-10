package com.cyc.cycjava.cycl.butler;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.pph_main;
import com.cyc.cycjava.cycl.pph_vars;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class external_rule_reviewer_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.butler.external_rule_reviewer_utilities";
  public static final String myFingerPrint = "fb9cdeefc649aaa3fdc10e51f8798e2f0b21c58cfa96e5827520d683a00ce308";
  private static final SubLFloat $float0$0_5;
  private static final SubLObject $const1$suggestedRule;
  private static final SubLObject $const2$SuggestedRulesMt;
  private static final SubLSymbol $sym3$ASSERTION_FORMULA;
  private static final SubLSymbol $sym4$CADR;
  private static final SubLSymbol $sym5$EL_IMPLICATION_P;
  private static final SubLList $list6;
  private static final SubLString $str7$If_;
  private static final SubLString $str8$__;

  @SubLTranslatedFile.SubL(source = "cycl/butler/external-rule-reviewer-utilities.lisp", position = 1075L)
  public static SubLObject get_random_rule()
  {
    if( NIL != number_utilities.true_with_probability( $float0$0_5 ) )
    {
      return NIL;
    }
    Threads.sleep( TWO_INTEGER );
    final SubLObject assertions = kb_mapping.gather_predicate_extent_index( $const1$suggestedRule, $const2$SuggestedRulesMt, UNPROVIDED );
    final SubLObject assertion_lists = Mapping.mapcar( $sym3$ASSERTION_FORMULA, assertions );
    final SubLObject rules = Mapping.mapcar( $sym4$CADR, assertion_lists );
    return list_utilities.random_element( rules );
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/external-rule-reviewer-utilities.lisp", position = 1533L)
  public static SubLObject random_rule_validP(final SubLObject rule)
  {
    Threads.sleep( TWO_INTEGER );
    return number_utilities.true_with_probability( $float0$0_5 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/external-rule-reviewer-utilities.lisp", position = 1693L)
  public static SubLObject get_rule_synopsis(final SubLObject rule)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != el_utilities.el_implication_p( rule ) : rule;
    SubLObject result = NIL;
    final SubLObject first_clause = ( NIL != conses_high.member( list_utilities.caadr( rule ), $list6, UNPROVIDED, UNPROVIDED ) ) ? conses_high.cadr( conses_high.cadr( rule ) ) : conses_high.cadr( rule );
    final SubLObject _prev_bind_0 = pph_vars.$pph_quantify_varsP$.currentBinding( thread );
    try
    {
      pph_vars.$pph_quantify_varsP$.bind( NIL, thread );
      final SubLObject text = pph_main.generate_text( first_clause, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject synopsis = result = Sequences.cconcatenate( $str7$If_, new SubLObject[] { text, $str8$__
      } );
    }
    finally
    {
      pph_vars.$pph_quantify_varsP$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  public static SubLObject declare_external_rule_reviewer_utilities_file()
  {
    SubLFiles.declareFunction( me, "get_random_rule", "GET-RANDOM-RULE", 0, 0, false );
    SubLFiles.declareFunction( me, "random_rule_validP", "RANDOM-RULE-VALID?", 1, 0, false );
    SubLFiles.declareFunction( me, "get_rule_synopsis", "GET-RULE-SYNOPSIS", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_external_rule_reviewer_utilities_file()
  {
    return NIL;
  }

  public static SubLObject setup_external_rule_reviewer_utilities_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_external_rule_reviewer_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_external_rule_reviewer_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_external_rule_reviewer_utilities_file();
  }
  static
  {
    me = new external_rule_reviewer_utilities();
    $float0$0_5 = makeDouble( 0.5 );
    $const1$suggestedRule = constant_handles.reader_make_constant_shell( makeString( "suggestedRule" ) );
    $const2$SuggestedRulesMt = constant_handles.reader_make_constant_shell( makeString( "SuggestedRulesMt" ) );
    $sym3$ASSERTION_FORMULA = makeSymbol( "ASSERTION-FORMULA" );
    $sym4$CADR = makeSymbol( "CADR" );
    $sym5$EL_IMPLICATION_P = makeSymbol( "EL-IMPLICATION-P" );
    $list6 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), constant_handles.reader_make_constant_shell( makeString( "or" ) ) );
    $str7$If_ = makeString( "If " );
    $str8$__ = makeString( ".." );
  }
}
/*
 * 
 * Total time: 79 ms
 * 
 */