package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class wff_macros
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.wff_macros";
  public static final String myFingerPrint = "c3f289d81e78e3f1b1f096e63e3cdbeb2a983572ba9574570a0b29a89ac27a5e";
  private static final SubLSymbol $sym0$CLET;
  private static final SubLList $list1;
  private static final SubLList $list2;
  private static final SubLSymbol $sym3$_WFF_FORMULA_;
  private static final SubLSymbol $sym4$_WFF_ORIGINAL_FORMULA_;
  private static final SubLSymbol $sym5$FIF;
  private static final SubLList $list6;
  private static final SubLList $list7;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$_WFF_EXPANSION_FORMULA_;
  private static final SubLList $list10;
  private static final SubLList $list11;
  private static final SubLList $list12;
  private static final SubLSymbol $sym13$_WFF_MEMOIZATION_STATE_;
  private static final SubLSymbol $sym14$WITH_MEMOIZATION_STATE;
  private static final SubLList $list15;
  private static final SubLList $list16;
  private static final SubLSymbol $sym17$WITH_SPECIFIED_WFF_MEMOIZATION_STATE;
  private static final SubLList $list18;
  private static final SubLSymbol $sym19$POSSIBLY_NEW_WFF_MEMOIZATION_STATE;
  private static final SubLSymbol $sym20$WITH_WFF_MEMOIZATION_STATE;
  private static final SubLString $str21$wff_memoization_state;
  private static final SubLSymbol $sym22$_UNEXPANDED_FORMULA_;
  private static final SubLList $list23;
  private static final SubLList $list24;
  private static final SubLSymbol $sym25$VALIDATING_EXPANSION_OF;
  private static final SubLList $list26;
  private static final SubLSymbol $sym27$PROTECTED;
  private static final SubLSymbol $sym28$SYMBOLP;
  private static final SubLSymbol $sym29$KEYWORDP;
  private static final SubLSymbol $sym30$SELF_EVALUATING_FORM_P;
  private static final SubLSymbol $sym31$STRINGP;
  private static final SubLSymbol $sym32$PROGN;
  private static final SubLSymbol $sym33$PROCLAIM;
  private static final SubLSymbol $sym34$QUOTE;
  private static final SubLSymbol $sym35$VACCESS;
  private static final SubLSymbol $sym36$DEFPARAMETER;
  private static final SubLSymbol $sym37$NOTE_WFF_PROPERTY;
  private static final SubLList $list38;
  private static final SubLSymbol $sym39$WFF_SVS;
  private static final SubLSymbol $sym40$NEW_WFF_SPECIAL_VARIABLE_STATE;
  private static final SubLSymbol $sym41$WITH_WFF_SPECIAL_VARIABLE_STATE;
  private static final SubLSymbol $sym42$WITH_WFF_PROPERTIES;
  private static final SubLList $list43;
  private static final SubLList $list44;
  private static final SubLSymbol $sym45$SVS;
  private static final SubLSymbol $sym46$_WFF_PROPERTIES_;
  private static final SubLSymbol $sym47$WITH_SPECIAL_VARIABLE_STATE;
  private static final SubLList $list48;
  private static final SubLList $list49;
  private static final SubLList $list50;
  static boolean assertionsDisabledSynth = true;

  @SubLTranslatedFile.SubL(source = "cycl/wff-macros.lisp", position = 754L)
  public static SubLObject within_wff(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym0$CLET, $list1, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-macros.lisp", position = 910L)
  public static SubLObject within_wffP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return wff_vars.$within_wffP$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-macros.lisp", position = 1024L)
  public static SubLObject with_wff_formula(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject formula = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list2 );
    formula = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym0$CLET, ConsesLow.list( ConsesLow.list( $sym3$_WFF_FORMULA_, formula ), ConsesLow.list( $sym4$_WFF_ORIGINAL_FORMULA_, ConsesLow.list( $sym5$FIF, $list6, $list7, formula ) ) ), ConsesLow
        .append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-macros.lisp", position = 1242L)
  public static SubLObject with_wff_expansion(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject expansion = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list8 );
    expansion = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym0$CLET, ConsesLow.list( ConsesLow.list( $sym9$_WFF_EXPANSION_FORMULA_, ConsesLow.list( $sym5$FIF, $list10, $list11, expansion ) ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-macros.lisp", position = 1436L)
  public static SubLObject with_specified_wff_memoization_state(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject state = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list12 );
    state = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym0$CLET, ConsesLow.list( ConsesLow.list( $sym13$_WFF_MEMOIZATION_STATE_, state ) ), ConsesLow.listS( $sym14$WITH_MEMOIZATION_STATE, $list15, $list16, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-macros.lisp", position = 1668L)
  public static SubLObject with_wff_memoization_state(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym17$WITH_SPECIFIED_WFF_MEMOIZATION_STATE, $list18, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-macros.lisp", position = 1815L)
  public static SubLObject possibly_new_wff_memoization_state()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( NIL != wff_vars.$wff_memoization_state$.getDynamicValue( thread ) ) ? wff_vars.$wff_memoization_state$.getDynamicValue( thread )
        : memoization_state.new_memoization_state( $str21$wff_memoization_state, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-macros.lisp", position = 2035L)
  public static SubLObject validating_expansion_of(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject formula = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list2 );
    formula = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym0$CLET, reader.bq_cons( ConsesLow.list( $sym22$_UNEXPANDED_FORMULA_, formula ), $list23 ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-macros.lisp", position = 2382L)
  public static SubLObject validating_expansion_of_nat(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject formula = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list2 );
    formula = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym0$CLET, $list24, ConsesLow.listS( $sym25$VALIDATING_EXPANSION_OF, formula, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-macros.lisp", position = 2617L)
  public static SubLObject defparameter_wff(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject variable = NIL;
    SubLObject keyword = NIL;
    SubLObject initialization = NIL;
    SubLObject documentation = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list26 );
    variable = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list26 );
    keyword = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list26 );
    initialization = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list26 );
    documentation = current.first();
    current = current.rest();
    final SubLObject vaccess = current.isCons() ? current.first() : $sym27$PROTECTED;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list26 );
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list26 );
      return NIL;
    }
    if( NIL != variable && !assertionsDisabledSynth && NIL == Types.symbolp( variable ) )
    {
      throw new AssertionError( variable );
    }
    assert NIL != Types.keywordp( keyword ) : keyword;
    assert NIL != list_utilities.self_evaluating_form_p( initialization ) : initialization;
    assert NIL != Types.stringp( documentation ) : documentation;
    assert NIL != Types.symbolp( vaccess ) : vaccess;
    if( NIL != variable )
    {
      return ConsesLow.list( $sym32$PROGN, ConsesLow.list( $sym33$PROCLAIM, ConsesLow.list( $sym34$QUOTE, ConsesLow.list( $sym35$VACCESS, vaccess, variable ) ) ), ConsesLow.list( $sym36$DEFPARAMETER, variable,
          initialization, documentation ), ConsesLow.list( $sym37$NOTE_WFF_PROPERTY, keyword, ConsesLow.list( $sym34$QUOTE, variable ), initialization ) );
    }
    return ConsesLow.list( $sym37$NOTE_WFF_PROPERTY, keyword, NIL, initialization );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-macros.lisp", position = 3517L)
  public static SubLObject with_wff_properties(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject v_properties = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
    v_properties = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    final SubLObject wff_svs = $sym39$WFF_SVS;
    return ConsesLow.list( $sym0$CLET, ConsesLow.list( ConsesLow.list( wff_svs, ConsesLow.list( $sym40$NEW_WFF_SPECIAL_VARIABLE_STATE, v_properties ) ) ), ConsesLow.listS( $sym41$WITH_WFF_SPECIAL_VARIABLE_STATE, wff_svs,
        ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-macros.lisp", position = 3889L)
  public static SubLObject new_wff_special_variable_state(final SubLObject v_properties)
  {
    wff_vars.check_wff_properties( v_properties );
    final SubLObject svs = special_variable_state.new_special_variable_state( NIL );
    SubLObject remainder;
    SubLObject property;
    SubLObject desired_value;
    SubLObject data;
    SubLObject current;
    SubLObject datum;
    SubLObject var;
    SubLObject v_default;
    for( remainder = NIL, remainder = v_properties; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      property = remainder.first();
      desired_value = conses_high.cadr( remainder );
      data = dictionary.dictionary_lookup_without_values( wff_vars.wff_properties_table(), property, UNPROVIDED );
      datum = ( current = data );
      var = NIL;
      v_default = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list43 );
      var = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list43 );
      v_default = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( NIL != var )
        {
          special_variable_state.special_variable_state_push( svs, var, desired_value );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list43 );
      }
    }
    return svs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-macros.lisp", position = 4361L)
  public static SubLObject with_wff_special_variable_state(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject wff_svs = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list44 );
    wff_svs = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    final SubLObject svs = $sym45$SVS;
    return ConsesLow.list( $sym0$CLET, ConsesLow.list( ConsesLow.list( svs, wff_svs ), ConsesLow.list( $sym46$_WFF_PROPERTIES_, svs ) ), ConsesLow.listS( $sym47$WITH_SPECIAL_VARIABLE_STATE, svs, ConsesLow.append( body,
        NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-macros.lisp", position = 4578L)
  public static SubLObject with_strict_wff(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym0$CLET, $list48, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-macros.lisp", position = 4678L)
  public static SubLObject with_assertive_wff(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym0$CLET, $list49, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-macros.lisp", position = 4784L)
  public static SubLObject with_lenient_wff(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym0$CLET, $list50, ConsesLow.append( body, NIL ) );
  }

  public static SubLObject declare_wff_macros_file()
  {
    SubLFiles.declareMacro( me, "within_wff", "WITHIN-WFF" );
    SubLFiles.declareFunction( me, "within_wffP", "WITHIN-WFF?", 0, 0, false );
    SubLFiles.declareMacro( me, "with_wff_formula", "WITH-WFF-FORMULA" );
    SubLFiles.declareMacro( me, "with_wff_expansion", "WITH-WFF-EXPANSION" );
    SubLFiles.declareMacro( me, "with_specified_wff_memoization_state", "WITH-SPECIFIED-WFF-MEMOIZATION-STATE" );
    SubLFiles.declareMacro( me, "with_wff_memoization_state", "WITH-WFF-MEMOIZATION-STATE" );
    SubLFiles.declareFunction( me, "possibly_new_wff_memoization_state", "POSSIBLY-NEW-WFF-MEMOIZATION-STATE", 0, 0, false );
    SubLFiles.declareMacro( me, "validating_expansion_of", "VALIDATING-EXPANSION-OF" );
    SubLFiles.declareMacro( me, "validating_expansion_of_nat", "VALIDATING-EXPANSION-OF-NAT" );
    SubLFiles.declareMacro( me, "defparameter_wff", "DEFPARAMETER-WFF" );
    SubLFiles.declareMacro( me, "with_wff_properties", "WITH-WFF-PROPERTIES" );
    SubLFiles.declareFunction( me, "new_wff_special_variable_state", "NEW-WFF-SPECIAL-VARIABLE-STATE", 1, 0, false );
    SubLFiles.declareMacro( me, "with_wff_special_variable_state", "WITH-WFF-SPECIAL-VARIABLE-STATE" );
    SubLFiles.declareMacro( me, "with_strict_wff", "WITH-STRICT-WFF" );
    SubLFiles.declareMacro( me, "with_assertive_wff", "WITH-ASSERTIVE-WFF" );
    SubLFiles.declareMacro( me, "with_lenient_wff", "WITH-LENIENT-WFF" );
    return NIL;
  }

  public static SubLObject init_wff_macros_file()
  {
    return NIL;
  }

  public static SubLObject setup_wff_macros_file()
  {
    access_macros.register_macro_helper( $sym19$POSSIBLY_NEW_WFF_MEMOIZATION_STATE, $sym20$WITH_WFF_MEMOIZATION_STATE );
    access_macros.register_macro_helper( $sym40$NEW_WFF_SPECIAL_VARIABLE_STATE, $sym42$WITH_WFF_PROPERTIES );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_wff_macros_file();
  }

  @Override
  public void initializeVariables()
  {
    init_wff_macros_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_wff_macros_file();
  }
  static
  {
    me = new wff_macros();
    $sym0$CLET = makeSymbol( "CLET" );
    $list1 = ConsesLow.list( ConsesLow.list( makeSymbol( "*WITHIN-WFF?*" ), T ) );
    $list2 = ConsesLow.list( makeSymbol( "FORMULA" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym3$_WFF_FORMULA_ = makeSymbol( "*WFF-FORMULA*" );
    $sym4$_WFF_ORIGINAL_FORMULA_ = makeSymbol( "*WFF-ORIGINAL-FORMULA*" );
    $sym5$FIF = makeSymbol( "FIF" );
    $list6 = ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "WITHIN-WFF?" ) ), ConsesLow.list( makeSymbol( "WFF-ORIGINAL-FORMULA" ) ) );
    $list7 = ConsesLow.list( makeSymbol( "WFF-ORIGINAL-FORMULA" ) );
    $list8 = ConsesLow.list( makeSymbol( "EXPANSION" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym9$_WFF_EXPANSION_FORMULA_ = makeSymbol( "*WFF-EXPANSION-FORMULA*" );
    $list10 = ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "WITHIN-WFF?" ) ), ConsesLow.list( makeSymbol( "WFF-EXPANSION-FORMULA" ) ) );
    $list11 = ConsesLow.list( makeSymbol( "WFF-EXPANSION-FORMULA" ) );
    $list12 = ConsesLow.list( makeSymbol( "STATE" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym13$_WFF_MEMOIZATION_STATE_ = makeSymbol( "*WFF-MEMOIZATION-STATE*" );
    $sym14$WITH_MEMOIZATION_STATE = makeSymbol( "WITH-MEMOIZATION-STATE" );
    $list15 = ConsesLow.list( makeSymbol( "*WFF-MEMOIZATION-STATE*" ) );
    $list16 = ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "WITHIN-WFF?" ) ), ConsesLow.list( makeSymbol( "RESET-WFF-STATE" ) ) );
    $sym17$WITH_SPECIFIED_WFF_MEMOIZATION_STATE = makeSymbol( "WITH-SPECIFIED-WFF-MEMOIZATION-STATE" );
    $list18 = ConsesLow.list( makeSymbol( "POSSIBLY-NEW-WFF-MEMOIZATION-STATE" ) );
    $sym19$POSSIBLY_NEW_WFF_MEMOIZATION_STATE = makeSymbol( "POSSIBLY-NEW-WFF-MEMOIZATION-STATE" );
    $sym20$WITH_WFF_MEMOIZATION_STATE = makeSymbol( "WITH-WFF-MEMOIZATION-STATE" );
    $str21$wff_memoization_state = makeString( "wff memoization state" );
    $sym22$_UNEXPANDED_FORMULA_ = makeSymbol( "*UNEXPANDED-FORMULA*" );
    $list23 = ConsesLow.list( ConsesLow.list( makeSymbol( "*VALIDATE-EXPANSIONS?*" ), NIL ), ConsesLow.list( makeSymbol( "*VALIDATING-EXPANSION?*" ), T ) );
    $list24 = ConsesLow.list( ConsesLow.list( makeSymbol( "*RELAX-ARG-CONSTRAINTS-FOR-DISJUNCTIONS?*" ), NIL ) );
    $sym25$VALIDATING_EXPANSION_OF = makeSymbol( "VALIDATING-EXPANSION-OF" );
    $list26 = ConsesLow.list( makeSymbol( "VARIABLE" ), makeSymbol( "KEYWORD" ), makeSymbol( "INITIALIZATION" ), makeSymbol( "DOCUMENTATION" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "VACCESS" ),
        ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PROTECTED" ) ) ) );
    $sym27$PROTECTED = makeSymbol( "PROTECTED" );
    $sym28$SYMBOLP = makeSymbol( "SYMBOLP" );
    $sym29$KEYWORDP = makeSymbol( "KEYWORDP" );
    $sym30$SELF_EVALUATING_FORM_P = makeSymbol( "SELF-EVALUATING-FORM-P" );
    $sym31$STRINGP = makeSymbol( "STRINGP" );
    $sym32$PROGN = makeSymbol( "PROGN" );
    $sym33$PROCLAIM = makeSymbol( "PROCLAIM" );
    $sym34$QUOTE = makeSymbol( "QUOTE" );
    $sym35$VACCESS = makeSymbol( "VACCESS" );
    $sym36$DEFPARAMETER = makeSymbol( "DEFPARAMETER" );
    $sym37$NOTE_WFF_PROPERTY = makeSymbol( "NOTE-WFF-PROPERTY" );
    $list38 = ConsesLow.list( makeSymbol( "PROPERTIES" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym39$WFF_SVS = makeUninternedSymbol( "WFF-SVS" );
    $sym40$NEW_WFF_SPECIAL_VARIABLE_STATE = makeSymbol( "NEW-WFF-SPECIAL-VARIABLE-STATE" );
    $sym41$WITH_WFF_SPECIAL_VARIABLE_STATE = makeSymbol( "WITH-WFF-SPECIAL-VARIABLE-STATE" );
    $sym42$WITH_WFF_PROPERTIES = makeSymbol( "WITH-WFF-PROPERTIES" );
    $list43 = ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "DEFAULT" ) );
    $list44 = ConsesLow.list( makeSymbol( "WFF-SVS" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym45$SVS = makeUninternedSymbol( "SVS" );
    $sym46$_WFF_PROPERTIES_ = makeSymbol( "*WFF-PROPERTIES*" );
    $sym47$WITH_SPECIAL_VARIABLE_STATE = makeSymbol( "WITH-SPECIAL-VARIABLE-STATE" );
    $list48 = ConsesLow.list( ConsesLow.list( makeSymbol( "*WFF-MODE*" ), makeKeyword( "STRICT" ) ) );
    $list49 = ConsesLow.list( ConsesLow.list( makeSymbol( "*WFF-MODE*" ), makeKeyword( "ASSERTIVE" ) ) );
    $list50 = ConsesLow.list( ConsesLow.list( makeSymbol( "*WFF-MODE*" ), makeKeyword( "LENIENT" ) ) );
  }
}
/*
 * 
 * Total time: 140 ms synthetic
 */