package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class red_infrastructure_macros
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.red_infrastructure_macros";
  public static final String myFingerPrint = "63986bd00b5efd5da61d914c1d317bdab5ac4f0c4994314831c6f2c53a29176a";
  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 18844L)
  private static SubLSymbol $red_infrastructure_test_key$;
  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 20452L)
  private static SubLSymbol $red_infrastructure_test_default$;
  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 20515L)
  private static SubLSymbol $red_infrastructure_test_red_value$;
  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 20622L)
  private static SubLSymbol $reddef_lex_prvt_2$;
  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 20741L)
  private static SubLSymbol $reddef_lex_prvt$;
  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 20889L)
  public static SubLSymbol $reddef_lex_prot$;
  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 21034L)
  public static SubLSymbol $reddef_lex_publ$;
  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 21179L)
  private static SubLSymbol $reddef_par_prvt$;
  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 21321L)
  public static SubLSymbol $reddef_par_prot$;
  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 21468L)
  public static SubLSymbol $reddef_par_publ$;
  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 21615L)
  private static SubLSymbol $reddef_var_prvt$;
  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 21754L)
  public static SubLSymbol $reddef_var_prot$;
  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 21895L)
  public static SubLSymbol $reddef_var_publ$;
  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 22036L)
  private static SubLSymbol $reddef_gbl_prvt$;
  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 22178L)
  public static SubLSymbol $reddef_gbl_prot$;
  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 22322L)
  public static SubLSymbol $reddef_gbl_publ$;
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$DEFPARAMETER_PUBLIC;
  private static final SubLSymbol $sym2$RED_DEF_HELPER;
  private static final SubLSymbol $sym3$FIF;
  private static final SubLSymbol $sym4$SYMBOLP;
  private static final SubLSymbol $sym5$QUOTE;
  private static final SubLSymbol $sym6$SYMBOL_VALUE;
  private static final SubLList $list7;
  private static final SubLSymbol $sym8$DEFPARAMETER_PROTECTED;
  private static final SubLSymbol $sym9$DEFPARAMETER_PRIVATE;
  private static final SubLSymbol $sym10$DEFLEXICAL_PUBLIC;
  private static final SubLList $list11;
  private static final SubLSymbol $sym12$DEFLEXICAL_PROTECTED;
  private static final SubLSymbol $sym13$DEFLEXICAL_PRIVATE;
  private static final SubLSymbol $sym14$DEFGLOBAL_PUBLIC;
  private static final SubLList $list15;
  private static final SubLSymbol $sym16$DEFGLOBAL_PROTECTED;
  private static final SubLSymbol $sym17$DEFGLOBAL_PRIVATE;
  private static final SubLSymbol $sym18$DEFVAR_PUBLIC;
  private static final SubLList $list19;
  private static final SubLSymbol $sym20$DEFVAR_PROTECTED;
  private static final SubLSymbol $sym21$DEFVAR_PRIVATE;
  private static final SubLList $list22;
  private static final SubLList $list23;
  private static final SubLList $list24;
  private static final SubLList $list25;
  private static final SubLList $list26;
  private static final SubLSymbol $sym27$RED_REINITIALIZE_VARIABLE_HELPER;
  private static final SubLList $list28;
  private static final SubLSymbol $kw29$SIMPLE;
  private static final SubLSymbol $sym30$RED_REINITIALIZE_VARIABLE;
  private static final SubLList $list31;
  private static final SubLString $str32$dflt;
  private static final SubLString $str33$_cyc_CycC_Linux_head_run_world_la;
  private static final SubLSymbol $sym34$REDDEF_LEX_PRVT_2;
  private static final SubLSymbol $kw35$LEXICAL;
  private static final SubLSymbol $sym36$_RED_INFRASTRUCTURE_TEST_KEY_;
  private static final SubLSymbol $sym37$REDDEF_LEX_PRVT;
  private static final SubLSymbol $sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_;
  private static final SubLSymbol $sym39$REDDEF_LEX_PROT;
  private static final SubLSymbol $sym40$REDDEF_LEX_PUBL;
  private static final SubLSymbol $sym41$REDDEF_PAR_PRVT;
  private static final SubLSymbol $kw42$PARAMETER;
  private static final SubLSymbol $sym43$REDDEF_PAR_PROT;
  private static final SubLSymbol $sym44$REDDEF_PAR_PUBL;
  private static final SubLSymbol $sym45$REDDEF_VAR_PRVT;
  private static final SubLSymbol $kw46$VAR;
  private static final SubLSymbol $sym47$REDDEF_VAR_PROT;
  private static final SubLSymbol $sym48$REDDEF_VAR_PUBL;
  private static final SubLSymbol $sym49$REDDEF_GBL_PRVT;
  private static final SubLSymbol $kw50$GLOBAL;
  private static final SubLSymbol $sym51$REDDEF_GBL_PROT;
  private static final SubLSymbol $sym52$REDDEF_GBL_PUBL;
  private static final SubLString $str53$reddef_gbl_publ_didn_t_have_the_d;
  private static final SubLString $str54$reddef_gbl_prot_didn_t_have_the_d;
  private static final SubLString $str55$reddef_gbl_prvt_didn_t_have_the_d;
  private static final SubLString $str56$reddef_var_publ_didn_t_have_the_d;
  private static final SubLString $str57$reddef_var_prot_didn_t_have_the_d;
  private static final SubLString $str58$reddef_var_prvt_didn_t_have_the_d;
  private static final SubLString $str59$reddef_lex_publ_didn_t_have_the_d;
  private static final SubLString $str60$reddef_lex_prot_didn_t_have_the_d;
  private static final SubLString $str61$reddef_lex_prvt_didn_t_have_the_d;
  private static final SubLString $str62$reddef_lex_prvt_2_didn_t_have_the;
  private static final SubLString $str63$reddef_par_publ_didn_t_have_the_d;
  private static final SubLString $str64$reddef_par_prot_didn_t_have_the_d;
  private static final SubLString $str65$reddef_par_prvt_didn_t_have_the_d;
  private static final SubLString $str66$reddef_gbl_publ_didn_t_have_the_v;
  private static final SubLString $str67$reddef_gbl_prot_didn_t_have_the_v;
  private static final SubLString $str68$reddef_gbl_prvt_didn_t_have_the_v;
  private static final SubLString $str69$reddef_var_publ_didn_t_have_the_v;
  private static final SubLString $str70$reddef_var_prot_didn_t_have_the_v;
  private static final SubLString $str71$reddef_var_prvt_didn_t_have_the_v;
  private static final SubLString $str72$reddef_lex_publ_didn_t_have_the_v;
  private static final SubLString $str73$reddef_lex_prot_didn_t_have_the_v;
  private static final SubLString $str74$reddef_lex_prvt_didn_t_have_the_v;
  private static final SubLString $str75$reddef_lex_prvt_2_didn_t_have_the;
  private static final SubLString $str76$reddef_par_publ_didn_t_have_the_v;
  private static final SubLString $str77$reddef_par_prot_didn_t_have_the_v;
  private static final SubLString $str78$reddef_par_prvt_didn_t_have_the_v;

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 922L)
  public static SubLObject define_red_parameter_public(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject key = NIL;
    SubLObject name = NIL;
    SubLObject defaultvalue = NIL;
    SubLObject description = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    key = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    defaultvalue = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    description = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym1$DEFPARAMETER_PUBLIC, name, ConsesLow.listS( $sym2$RED_DEF_HELPER, ConsesLow.list( $sym3$FIF, ConsesLow.list( $sym4$SYMBOLP, ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list(
          $sym6$SYMBOL_VALUE, ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list( $sym5$QUOTE, name ), ConsesLow.list( $sym3$FIF, ConsesLow.list( $sym4$SYMBOLP, ConsesLow.list(
              $sym5$QUOTE, defaultvalue ) ), ConsesLow.list( $sym6$SYMBOL_VALUE, ConsesLow.list( $sym5$QUOTE, defaultvalue ) ), ConsesLow.list( $sym5$QUOTE, defaultvalue ) ), $list7 ), description );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 1908L)
  public static SubLObject define_red_parameter_protected(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject key = NIL;
    SubLObject name = NIL;
    SubLObject defaultvalue = NIL;
    SubLObject description = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    key = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    defaultvalue = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    description = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym8$DEFPARAMETER_PROTECTED, name, ConsesLow.listS( $sym2$RED_DEF_HELPER, ConsesLow.list( $sym3$FIF, ConsesLow.list( $sym4$SYMBOLP, ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list(
          $sym6$SYMBOL_VALUE, ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list( $sym5$QUOTE, name ), ConsesLow.list( $sym3$FIF, ConsesLow.list( $sym4$SYMBOLP, ConsesLow.list(
              $sym5$QUOTE, defaultvalue ) ), ConsesLow.list( $sym6$SYMBOL_VALUE, ConsesLow.list( $sym5$QUOTE, defaultvalue ) ), ConsesLow.list( $sym5$QUOTE, defaultvalue ) ), $list7 ), description );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 2567L)
  public static SubLObject define_red_parameter_private(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject key = NIL;
    SubLObject name = NIL;
    SubLObject defaultvalue = NIL;
    SubLObject description = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    key = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    defaultvalue = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    description = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym9$DEFPARAMETER_PRIVATE, name, ConsesLow.listS( $sym2$RED_DEF_HELPER, ConsesLow.list( $sym3$FIF, ConsesLow.list( $sym4$SYMBOLP, ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list(
          $sym6$SYMBOL_VALUE, ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list( $sym5$QUOTE, name ), ConsesLow.list( $sym3$FIF, ConsesLow.list( $sym4$SYMBOLP, ConsesLow.list(
              $sym5$QUOTE, defaultvalue ) ), ConsesLow.list( $sym6$SYMBOL_VALUE, ConsesLow.list( $sym5$QUOTE, defaultvalue ) ), ConsesLow.list( $sym5$QUOTE, defaultvalue ) ), $list7 ), description );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 3226L)
  public static SubLObject define_red_lexical_public(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject key = NIL;
    SubLObject name = NIL;
    SubLObject defaultvalue = NIL;
    SubLObject description = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    key = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    defaultvalue = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    description = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym10$DEFLEXICAL_PUBLIC, name, ConsesLow.listS( $sym2$RED_DEF_HELPER, ConsesLow.list( $sym3$FIF, ConsesLow.list( $sym4$SYMBOLP, ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list(
          $sym6$SYMBOL_VALUE, ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list( $sym5$QUOTE, name ), ConsesLow.list( $sym3$FIF, ConsesLow.list( $sym4$SYMBOLP, ConsesLow.list(
              $sym5$QUOTE, defaultvalue ) ), ConsesLow.list( $sym6$SYMBOL_VALUE, ConsesLow.list( $sym5$QUOTE, defaultvalue ) ), ConsesLow.list( $sym5$QUOTE, defaultvalue ) ), $list11 ), description );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 3893L)
  public static SubLObject define_red_lexical_protected(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject key = NIL;
    SubLObject name = NIL;
    SubLObject defaultvalue = NIL;
    SubLObject description = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    key = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    defaultvalue = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    description = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym12$DEFLEXICAL_PROTECTED, name, ConsesLow.listS( $sym2$RED_DEF_HELPER, ConsesLow.list( $sym3$FIF, ConsesLow.list( $sym4$SYMBOLP, ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list(
          $sym6$SYMBOL_VALUE, ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list( $sym5$QUOTE, name ), ConsesLow.list( $sym3$FIF, ConsesLow.list( $sym4$SYMBOLP, ConsesLow.list(
              $sym5$QUOTE, defaultvalue ) ), ConsesLow.list( $sym6$SYMBOL_VALUE, ConsesLow.list( $sym5$QUOTE, defaultvalue ) ), ConsesLow.list( $sym5$QUOTE, defaultvalue ) ), $list11 ), description );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 4546L)
  public static SubLObject define_red_lexical_private(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject key = NIL;
    SubLObject name = NIL;
    SubLObject defaultvalue = NIL;
    SubLObject description = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    key = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    defaultvalue = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    description = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym13$DEFLEXICAL_PRIVATE, name, ConsesLow.listS( $sym2$RED_DEF_HELPER, ConsesLow.list( $sym3$FIF, ConsesLow.list( $sym4$SYMBOLP, ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list(
          $sym6$SYMBOL_VALUE, ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list( $sym5$QUOTE, name ), ConsesLow.list( $sym3$FIF, ConsesLow.list( $sym4$SYMBOLP, ConsesLow.list(
              $sym5$QUOTE, defaultvalue ) ), ConsesLow.list( $sym6$SYMBOL_VALUE, ConsesLow.list( $sym5$QUOTE, defaultvalue ) ), ConsesLow.list( $sym5$QUOTE, defaultvalue ) ), $list11 ), description );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 5194L)
  public static SubLObject define_red_global_public(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject key = NIL;
    SubLObject name = NIL;
    SubLObject defaultvalue = NIL;
    SubLObject description = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    key = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    defaultvalue = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    description = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym14$DEFGLOBAL_PUBLIC, name, ConsesLow.listS( $sym2$RED_DEF_HELPER, ConsesLow.list( $sym3$FIF, ConsesLow.list( $sym4$SYMBOLP, ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list(
          $sym6$SYMBOL_VALUE, ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list( $sym5$QUOTE, name ), ConsesLow.list( $sym3$FIF, ConsesLow.list( $sym4$SYMBOLP, ConsesLow.list(
              $sym5$QUOTE, defaultvalue ) ), ConsesLow.list( $sym6$SYMBOL_VALUE, ConsesLow.list( $sym5$QUOTE, defaultvalue ) ), ConsesLow.list( $sym5$QUOTE, defaultvalue ) ), $list15 ), description );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 5856L)
  public static SubLObject define_red_global_protected(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject key = NIL;
    SubLObject name = NIL;
    SubLObject defaultvalue = NIL;
    SubLObject description = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    key = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    defaultvalue = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    description = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym16$DEFGLOBAL_PROTECTED, name, ConsesLow.listS( $sym2$RED_DEF_HELPER, ConsesLow.list( $sym3$FIF, ConsesLow.list( $sym4$SYMBOLP, ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list(
          $sym6$SYMBOL_VALUE, ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list( $sym5$QUOTE, name ), ConsesLow.list( $sym3$FIF, ConsesLow.list( $sym4$SYMBOLP, ConsesLow.list(
              $sym5$QUOTE, defaultvalue ) ), ConsesLow.list( $sym6$SYMBOL_VALUE, ConsesLow.list( $sym5$QUOTE, defaultvalue ) ), ConsesLow.list( $sym5$QUOTE, defaultvalue ) ), $list15 ), description );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 6507L)
  public static SubLObject define_red_global_private(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject key = NIL;
    SubLObject name = NIL;
    SubLObject defaultvalue = NIL;
    SubLObject description = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    key = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    defaultvalue = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    description = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym17$DEFGLOBAL_PRIVATE, name, ConsesLow.listS( $sym2$RED_DEF_HELPER, ConsesLow.list( $sym3$FIF, ConsesLow.list( $sym4$SYMBOLP, ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list(
          $sym6$SYMBOL_VALUE, ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list( $sym5$QUOTE, name ), ConsesLow.list( $sym3$FIF, ConsesLow.list( $sym4$SYMBOLP, ConsesLow.list(
              $sym5$QUOTE, defaultvalue ) ), ConsesLow.list( $sym6$SYMBOL_VALUE, ConsesLow.list( $sym5$QUOTE, defaultvalue ) ), ConsesLow.list( $sym5$QUOTE, defaultvalue ) ), $list15 ), description );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 7153L)
  public static SubLObject define_red_var_public(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject key = NIL;
    SubLObject name = NIL;
    SubLObject defaultvalue = NIL;
    SubLObject description = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    key = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    defaultvalue = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    description = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym18$DEFVAR_PUBLIC, name, ConsesLow.listS( $sym2$RED_DEF_HELPER, ConsesLow.list( $sym3$FIF, ConsesLow.list( $sym4$SYMBOLP, ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list(
          $sym6$SYMBOL_VALUE, ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list( $sym5$QUOTE, name ), ConsesLow.list( $sym3$FIF, ConsesLow.list( $sym4$SYMBOLP, ConsesLow.list(
              $sym5$QUOTE, defaultvalue ) ), ConsesLow.list( $sym6$SYMBOL_VALUE, ConsesLow.list( $sym5$QUOTE, defaultvalue ) ), ConsesLow.list( $sym5$QUOTE, defaultvalue ) ), $list19 ), description );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 7802L)
  public static SubLObject define_red_var_protected(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject key = NIL;
    SubLObject name = NIL;
    SubLObject defaultvalue = NIL;
    SubLObject description = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    key = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    defaultvalue = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    description = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym20$DEFVAR_PROTECTED, name, ConsesLow.listS( $sym2$RED_DEF_HELPER, ConsesLow.list( $sym3$FIF, ConsesLow.list( $sym4$SYMBOLP, ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list(
          $sym6$SYMBOL_VALUE, ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list( $sym5$QUOTE, name ), ConsesLow.list( $sym3$FIF, ConsesLow.list( $sym4$SYMBOLP, ConsesLow.list(
              $sym5$QUOTE, defaultvalue ) ), ConsesLow.list( $sym6$SYMBOL_VALUE, ConsesLow.list( $sym5$QUOTE, defaultvalue ) ), ConsesLow.list( $sym5$QUOTE, defaultvalue ) ), $list19 ), description );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 8441L)
  public static SubLObject define_red_var_private(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject key = NIL;
    SubLObject name = NIL;
    SubLObject defaultvalue = NIL;
    SubLObject description = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    key = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    defaultvalue = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    description = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym21$DEFVAR_PRIVATE, name, ConsesLow.listS( $sym2$RED_DEF_HELPER, ConsesLow.list( $sym3$FIF, ConsesLow.list( $sym4$SYMBOLP, ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list(
          $sym6$SYMBOL_VALUE, ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list( $sym5$QUOTE, name ), ConsesLow.list( $sym3$FIF, ConsesLow.list( $sym4$SYMBOLP, ConsesLow.list(
              $sym5$QUOTE, defaultvalue ) ), ConsesLow.list( $sym6$SYMBOL_VALUE, ConsesLow.list( $sym5$QUOTE, defaultvalue ) ), ConsesLow.list( $sym5$QUOTE, defaultvalue ) ), $list19 ), description );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 9076L)
  public static SubLObject define_red_list_parameter_public(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject key = NIL;
    SubLObject name = NIL;
    SubLObject defaultvalue = NIL;
    SubLObject description = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    key = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    defaultvalue = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    description = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym1$DEFPARAMETER_PUBLIC, name, ConsesLow.listS( $sym2$RED_DEF_HELPER, ConsesLow.list( $sym3$FIF, ConsesLow.list( $sym4$SYMBOLP, ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list(
          $sym6$SYMBOL_VALUE, ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list( $sym5$QUOTE, name ), ConsesLow.list( $sym3$FIF, ConsesLow.list( $sym4$SYMBOLP, ConsesLow.list(
              $sym5$QUOTE, defaultvalue ) ), ConsesLow.list( $sym6$SYMBOL_VALUE, ConsesLow.list( $sym5$QUOTE, defaultvalue ) ), ConsesLow.list( $sym5$QUOTE, defaultvalue ) ), $list22 ), description );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 9780L)
  public static SubLObject define_red_list_parameter_protected(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject key = NIL;
    SubLObject name = NIL;
    SubLObject defaultvalue = NIL;
    SubLObject description = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    key = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    defaultvalue = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    description = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym8$DEFPARAMETER_PROTECTED, name, ConsesLow.listS( $sym2$RED_DEF_HELPER, ConsesLow.list( $sym3$FIF, ConsesLow.list( $sym4$SYMBOLP, ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list(
          $sym6$SYMBOL_VALUE, ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list( $sym5$QUOTE, name ), ConsesLow.list( $sym3$FIF, ConsesLow.list( $sym4$SYMBOLP, ConsesLow.list(
              $sym5$QUOTE, defaultvalue ) ), ConsesLow.list( $sym6$SYMBOL_VALUE, ConsesLow.list( $sym5$QUOTE, defaultvalue ) ), ConsesLow.list( $sym5$QUOTE, defaultvalue ) ), $list22 ), description );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 10456L)
  public static SubLObject define_red_list_parameter_private(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject key = NIL;
    SubLObject name = NIL;
    SubLObject defaultvalue = NIL;
    SubLObject description = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    key = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    defaultvalue = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    description = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym9$DEFPARAMETER_PRIVATE, name, ConsesLow.listS( $sym2$RED_DEF_HELPER, ConsesLow.list( $sym3$FIF, ConsesLow.list( $sym4$SYMBOLP, ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list(
          $sym6$SYMBOL_VALUE, ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list( $sym5$QUOTE, name ), ConsesLow.list( $sym3$FIF, ConsesLow.list( $sym4$SYMBOLP, ConsesLow.list(
              $sym5$QUOTE, defaultvalue ) ), ConsesLow.list( $sym6$SYMBOL_VALUE, ConsesLow.list( $sym5$QUOTE, defaultvalue ) ), ConsesLow.list( $sym5$QUOTE, defaultvalue ) ), $list22 ), description );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 11132L)
  public static SubLObject define_red_list_lexical_public(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject key = NIL;
    SubLObject name = NIL;
    SubLObject defaultvalue = NIL;
    SubLObject description = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    key = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    defaultvalue = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    description = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym10$DEFLEXICAL_PUBLIC, name, ConsesLow.listS( $sym2$RED_DEF_HELPER, ConsesLow.list( $sym3$FIF, ConsesLow.list( $sym4$SYMBOLP, ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list(
          $sym6$SYMBOL_VALUE, ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list( $sym5$QUOTE, name ), ConsesLow.list( $sym3$FIF, ConsesLow.list( $sym4$SYMBOLP, ConsesLow.list(
              $sym5$QUOTE, defaultvalue ) ), ConsesLow.list( $sym6$SYMBOL_VALUE, ConsesLow.list( $sym5$QUOTE, defaultvalue ) ), ConsesLow.list( $sym5$QUOTE, defaultvalue ) ), $list23 ), description );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 11816L)
  public static SubLObject define_red_list_lexical_protected(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject key = NIL;
    SubLObject name = NIL;
    SubLObject defaultvalue = NIL;
    SubLObject description = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    key = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    defaultvalue = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    description = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym12$DEFLEXICAL_PROTECTED, name, ConsesLow.listS( $sym2$RED_DEF_HELPER, ConsesLow.list( $sym3$FIF, ConsesLow.list( $sym4$SYMBOLP, ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list(
          $sym6$SYMBOL_VALUE, ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list( $sym5$QUOTE, name ), ConsesLow.list( $sym3$FIF, ConsesLow.list( $sym4$SYMBOLP, ConsesLow.list(
              $sym5$QUOTE, defaultvalue ) ), ConsesLow.list( $sym6$SYMBOL_VALUE, ConsesLow.list( $sym5$QUOTE, defaultvalue ) ), ConsesLow.list( $sym5$QUOTE, defaultvalue ) ), $list23 ), description );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 12486L)
  public static SubLObject define_red_list_lexical_private(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject key = NIL;
    SubLObject name = NIL;
    SubLObject defaultvalue = NIL;
    SubLObject description = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    key = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    defaultvalue = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    description = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym13$DEFLEXICAL_PRIVATE, name, ConsesLow.listS( $sym2$RED_DEF_HELPER, ConsesLow.list( $sym3$FIF, ConsesLow.list( $sym4$SYMBOLP, ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list(
          $sym6$SYMBOL_VALUE, ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list( $sym5$QUOTE, name ), ConsesLow.list( $sym3$FIF, ConsesLow.list( $sym4$SYMBOLP, ConsesLow.list(
              $sym5$QUOTE, defaultvalue ) ), ConsesLow.list( $sym6$SYMBOL_VALUE, ConsesLow.list( $sym5$QUOTE, defaultvalue ) ), ConsesLow.list( $sym5$QUOTE, defaultvalue ) ), $list23 ), description );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 13151L)
  public static SubLObject define_red_list_global_public(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject key = NIL;
    SubLObject name = NIL;
    SubLObject defaultvalue = NIL;
    SubLObject description = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    key = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    defaultvalue = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    description = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym14$DEFGLOBAL_PUBLIC, name, ConsesLow.listS( $sym2$RED_DEF_HELPER, ConsesLow.list( $sym3$FIF, ConsesLow.list( $sym4$SYMBOLP, ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list(
          $sym6$SYMBOL_VALUE, ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list( $sym5$QUOTE, name ), ConsesLow.list( $sym3$FIF, ConsesLow.list( $sym4$SYMBOLP, ConsesLow.list(
              $sym5$QUOTE, defaultvalue ) ), ConsesLow.list( $sym6$SYMBOL_VALUE, ConsesLow.list( $sym5$QUOTE, defaultvalue ) ), ConsesLow.list( $sym5$QUOTE, defaultvalue ) ), $list24 ), description );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 13830L)
  public static SubLObject define_red_list_global_protected(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject key = NIL;
    SubLObject name = NIL;
    SubLObject defaultvalue = NIL;
    SubLObject description = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    key = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    defaultvalue = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    description = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym16$DEFGLOBAL_PROTECTED, name, ConsesLow.listS( $sym2$RED_DEF_HELPER, ConsesLow.list( $sym3$FIF, ConsesLow.list( $sym4$SYMBOLP, ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list(
          $sym6$SYMBOL_VALUE, ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list( $sym5$QUOTE, name ), ConsesLow.list( $sym3$FIF, ConsesLow.list( $sym4$SYMBOLP, ConsesLow.list(
              $sym5$QUOTE, defaultvalue ) ), ConsesLow.list( $sym6$SYMBOL_VALUE, ConsesLow.list( $sym5$QUOTE, defaultvalue ) ), ConsesLow.list( $sym5$QUOTE, defaultvalue ) ), $list24 ), description );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 14498L)
  public static SubLObject define_red_list_global_private(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject key = NIL;
    SubLObject name = NIL;
    SubLObject defaultvalue = NIL;
    SubLObject description = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    key = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    defaultvalue = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    description = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym17$DEFGLOBAL_PRIVATE, name, ConsesLow.listS( $sym2$RED_DEF_HELPER, ConsesLow.list( $sym3$FIF, ConsesLow.list( $sym4$SYMBOLP, ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list(
          $sym6$SYMBOL_VALUE, ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list( $sym5$QUOTE, name ), ConsesLow.list( $sym3$FIF, ConsesLow.list( $sym4$SYMBOLP, ConsesLow.list(
              $sym5$QUOTE, defaultvalue ) ), ConsesLow.list( $sym6$SYMBOL_VALUE, ConsesLow.list( $sym5$QUOTE, defaultvalue ) ), ConsesLow.list( $sym5$QUOTE, defaultvalue ) ), $list24 ), description );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 15161L)
  public static SubLObject define_red_list_var_public(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject key = NIL;
    SubLObject name = NIL;
    SubLObject defaultvalue = NIL;
    SubLObject description = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    key = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    defaultvalue = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    description = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym18$DEFVAR_PUBLIC, name, ConsesLow.listS( $sym2$RED_DEF_HELPER, ConsesLow.list( $sym3$FIF, ConsesLow.list( $sym4$SYMBOLP, ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list(
          $sym6$SYMBOL_VALUE, ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list( $sym5$QUOTE, name ), ConsesLow.list( $sym3$FIF, ConsesLow.list( $sym4$SYMBOLP, ConsesLow.list(
              $sym5$QUOTE, defaultvalue ) ), ConsesLow.list( $sym6$SYMBOL_VALUE, ConsesLow.list( $sym5$QUOTE, defaultvalue ) ), ConsesLow.list( $sym5$QUOTE, defaultvalue ) ), $list25 ), description );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 15827L)
  public static SubLObject define_red_list_var_protected(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject key = NIL;
    SubLObject name = NIL;
    SubLObject defaultvalue = NIL;
    SubLObject description = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    key = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    defaultvalue = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    description = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym20$DEFVAR_PROTECTED, name, ConsesLow.listS( $sym2$RED_DEF_HELPER, ConsesLow.list( $sym3$FIF, ConsesLow.list( $sym4$SYMBOLP, ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list(
          $sym6$SYMBOL_VALUE, ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list( $sym5$QUOTE, name ), ConsesLow.list( $sym3$FIF, ConsesLow.list( $sym4$SYMBOLP, ConsesLow.list(
              $sym5$QUOTE, defaultvalue ) ), ConsesLow.list( $sym6$SYMBOL_VALUE, ConsesLow.list( $sym5$QUOTE, defaultvalue ) ), ConsesLow.list( $sym5$QUOTE, defaultvalue ) ), $list25 ), description );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 16483L)
  public static SubLObject define_red_list_var_private(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject key = NIL;
    SubLObject name = NIL;
    SubLObject defaultvalue = NIL;
    SubLObject description = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    key = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    defaultvalue = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    description = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym21$DEFVAR_PRIVATE, name, ConsesLow.listS( $sym2$RED_DEF_HELPER, ConsesLow.list( $sym3$FIF, ConsesLow.list( $sym4$SYMBOLP, ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list(
          $sym6$SYMBOL_VALUE, ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list( $sym5$QUOTE, key ) ), ConsesLow.list( $sym5$QUOTE, name ), ConsesLow.list( $sym3$FIF, ConsesLow.list( $sym4$SYMBOLP, ConsesLow.list(
              $sym5$QUOTE, defaultvalue ) ), ConsesLow.list( $sym6$SYMBOL_VALUE, ConsesLow.list( $sym5$QUOTE, defaultvalue ) ), ConsesLow.list( $sym5$QUOTE, defaultvalue ) ), $list25 ), description );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 17135L)
  public static SubLObject red_reinitialize_variable(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list26 );
    name = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym27$RED_REINITIALIZE_VARIABLE_HELPER, ConsesLow.list( $sym5$QUOTE, name ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list26 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 17262L)
  public static SubLObject red_def_helper(final SubLObject key, final SubLObject name, final SubLObject defaultvalue, final SubLObject ltype, SubLObject valuetype)
  {
    if( valuetype == UNPROVIDED )
    {
      valuetype = $kw29$SIMPLE;
    }
    final SubLObject red_sym = red_infrastructure.new_red_symbol( key, name, defaultvalue, ltype, valuetype );
    red_infrastructure.register_red( red_sym );
    return red_infrastructure.red_value( red_sym );
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 18494L)
  public static SubLObject red_reinitialize_variable_helper(final SubLObject name)
  {
    final SubLObject red_sym = dictionary.dictionary_lookup( red_infrastructure.$red_variables_dictionary$.getGlobalValue(), name, UNPROVIDED );
    if( NIL != red_sym )
    {
      red_infrastructure._csetf_red_symbol_set_from_red( red_sym, NIL );
      Symbols.set( red_infrastructure.red_symbol_name( red_sym ), red_infrastructure.red_value( red_sym ) );
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 22466L)
  public static SubLObject red_infa_unit_test()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject save_red_variables_dictionary = NIL;
    SubLObject save_red_symbols_list = NIL;
    SubLObject save_repositories_loaded = NIL;
    SubLObject errors = NIL;
    save_red_variables_dictionary = red_infrastructure.$red_variables_dictionary$.getGlobalValue();
    red_infrastructure.$red_variables_dictionary$.setGlobalValue( dictionary.new_dictionary( UNPROVIDED, UNPROVIDED ) );
    save_red_symbols_list = red_infrastructure.$red_symbols_list$.getGlobalValue();
    red_infrastructure.$red_symbols_list$.setGlobalValue( NIL );
    save_repositories_loaded = red_infrastructure.$repositories_loaded$.getGlobalValue();
    red_infrastructure.$repositories_loaded$.setGlobalValue( NIL );
    $reddef_gbl_publ$.setGlobalValue( $red_infrastructure_test_default$.getGlobalValue() );
    $reddef_gbl_prot$.setGlobalValue( $red_infrastructure_test_default$.getGlobalValue() );
    $reddef_gbl_prvt$.setGlobalValue( $red_infrastructure_test_default$.getGlobalValue() );
    $reddef_lex_publ$.setGlobalValue( $red_infrastructure_test_default$.getGlobalValue() );
    $reddef_lex_prot$.setGlobalValue( $red_infrastructure_test_default$.getGlobalValue() );
    $reddef_lex_prvt$.setGlobalValue( $red_infrastructure_test_default$.getGlobalValue() );
    $reddef_lex_prvt_2$.setGlobalValue( $red_infrastructure_test_default$.getGlobalValue() );
    $reddef_par_publ$.setDynamicValue( $red_infrastructure_test_default$.getGlobalValue(), thread );
    $reddef_par_prot$.setDynamicValue( $red_infrastructure_test_default$.getGlobalValue(), thread );
    $reddef_par_prvt$.setDynamicValue( $red_infrastructure_test_default$.getGlobalValue(), thread );
    $reddef_var_publ$.setDynamicValue( $red_infrastructure_test_default$.getGlobalValue(), thread );
    $reddef_var_prot$.setDynamicValue( $red_infrastructure_test_default$.getGlobalValue(), thread );
    $reddef_var_prvt$.setDynamicValue( $red_infrastructure_test_default$.getGlobalValue(), thread );
    red_infrastructure.register_red( red_infrastructure.new_red_symbol( $red_infrastructure_test_key$.getGlobalValue(), $sym40$REDDEF_LEX_PUBL, $red_infrastructure_test_default$.getGlobalValue(), $kw35$LEXICAL,
        UNPROVIDED ) );
    red_infrastructure.register_red( red_infrastructure.new_red_symbol( $red_infrastructure_test_key$.getGlobalValue(), $sym39$REDDEF_LEX_PROT, $red_infrastructure_test_default$.getGlobalValue(), $kw35$LEXICAL,
        UNPROVIDED ) );
    red_infrastructure.register_red( red_infrastructure.new_red_symbol( $red_infrastructure_test_key$.getGlobalValue(), $sym37$REDDEF_LEX_PRVT, $red_infrastructure_test_default$.getGlobalValue(), $kw35$LEXICAL,
        UNPROVIDED ) );
    red_infrastructure.register_red( red_infrastructure.new_red_symbol( $red_infrastructure_test_key$.getGlobalValue(), $sym34$REDDEF_LEX_PRVT_2, $red_infrastructure_test_default$.getGlobalValue(), $kw35$LEXICAL,
        UNPROVIDED ) );
    red_infrastructure.register_red( red_infrastructure.new_red_symbol( $red_infrastructure_test_key$.getGlobalValue(), $sym52$REDDEF_GBL_PUBL, $red_infrastructure_test_default$.getGlobalValue(), $kw50$GLOBAL,
        UNPROVIDED ) );
    red_infrastructure.register_red( red_infrastructure.new_red_symbol( $red_infrastructure_test_key$.getGlobalValue(), $sym51$REDDEF_GBL_PROT, $red_infrastructure_test_default$.getGlobalValue(), $kw50$GLOBAL,
        UNPROVIDED ) );
    red_infrastructure.register_red( red_infrastructure.new_red_symbol( $red_infrastructure_test_key$.getGlobalValue(), $sym49$REDDEF_GBL_PRVT, $red_infrastructure_test_default$.getGlobalValue(), $kw50$GLOBAL,
        UNPROVIDED ) );
    red_infrastructure.register_red( red_infrastructure.new_red_symbol( $red_infrastructure_test_key$.getGlobalValue(), $sym44$REDDEF_PAR_PUBL, $red_infrastructure_test_default$.getGlobalValue(), $kw42$PARAMETER,
        UNPROVIDED ) );
    red_infrastructure.register_red( red_infrastructure.new_red_symbol( $red_infrastructure_test_key$.getGlobalValue(), $sym43$REDDEF_PAR_PROT, $red_infrastructure_test_default$.getGlobalValue(), $kw42$PARAMETER,
        UNPROVIDED ) );
    red_infrastructure.register_red( red_infrastructure.new_red_symbol( $red_infrastructure_test_key$.getGlobalValue(), $sym41$REDDEF_PAR_PRVT, $red_infrastructure_test_default$.getGlobalValue(), $kw42$PARAMETER,
        UNPROVIDED ) );
    red_infrastructure.register_red( red_infrastructure.new_red_symbol( $red_infrastructure_test_key$.getGlobalValue(), $sym48$REDDEF_VAR_PUBL, $red_infrastructure_test_default$.getGlobalValue(), $kw46$VAR,
        UNPROVIDED ) );
    red_infrastructure.register_red( red_infrastructure.new_red_symbol( $red_infrastructure_test_key$.getGlobalValue(), $sym47$REDDEF_VAR_PROT, $red_infrastructure_test_default$.getGlobalValue(), $kw46$VAR,
        UNPROVIDED ) );
    red_infrastructure.register_red( red_infrastructure.new_red_symbol( $red_infrastructure_test_key$.getGlobalValue(), $sym45$REDDEF_VAR_PRVT, $red_infrastructure_test_default$.getGlobalValue(), $kw46$VAR,
        UNPROVIDED ) );
    if( !$reddef_gbl_publ$.getGlobalValue().equal( $red_infrastructure_test_default$.getGlobalValue() ) )
    {
      errors = ConsesLow.cons( PrintLow.format( NIL, $str53$reddef_gbl_publ_didn_t_have_the_d, $red_infrastructure_test_default$.getGlobalValue(), $reddef_gbl_publ$.getGlobalValue() ), errors );
    }
    if( !$reddef_gbl_prot$.getGlobalValue().equal( $red_infrastructure_test_default$.getGlobalValue() ) )
    {
      errors = ConsesLow.cons( PrintLow.format( NIL, $str54$reddef_gbl_prot_didn_t_have_the_d, $red_infrastructure_test_default$.getGlobalValue(), $reddef_gbl_prot$.getGlobalValue() ), errors );
    }
    if( !$reddef_gbl_prvt$.getGlobalValue().equal( $red_infrastructure_test_default$.getGlobalValue() ) )
    {
      errors = ConsesLow.cons( PrintLow.format( NIL, $str55$reddef_gbl_prvt_didn_t_have_the_d, $red_infrastructure_test_default$.getGlobalValue(), $reddef_gbl_prvt$.getGlobalValue() ), errors );
    }
    if( !$reddef_var_publ$.getDynamicValue( thread ).equal( $red_infrastructure_test_default$.getGlobalValue() ) )
    {
      errors = ConsesLow.cons( PrintLow.format( NIL, $str56$reddef_var_publ_didn_t_have_the_d, $red_infrastructure_test_default$.getGlobalValue(), $reddef_var_publ$.getDynamicValue( thread ) ), errors );
    }
    if( !$reddef_var_prot$.getDynamicValue( thread ).equal( $red_infrastructure_test_default$.getGlobalValue() ) )
    {
      errors = ConsesLow.cons( PrintLow.format( NIL, $str57$reddef_var_prot_didn_t_have_the_d, $red_infrastructure_test_default$.getGlobalValue(), $reddef_var_prot$.getDynamicValue( thread ) ), errors );
    }
    if( !$reddef_var_prvt$.getDynamicValue( thread ).equal( $red_infrastructure_test_default$.getGlobalValue() ) )
    {
      errors = ConsesLow.cons( PrintLow.format( NIL, $str58$reddef_var_prvt_didn_t_have_the_d, $red_infrastructure_test_default$.getGlobalValue(), $reddef_var_prvt$.getDynamicValue( thread ) ), errors );
    }
    if( !$reddef_lex_publ$.getGlobalValue().equal( $red_infrastructure_test_default$.getGlobalValue() ) )
    {
      errors = ConsesLow.cons( PrintLow.format( NIL, $str59$reddef_lex_publ_didn_t_have_the_d, $red_infrastructure_test_default$.getGlobalValue(), $reddef_lex_publ$.getGlobalValue() ), errors );
    }
    if( !$reddef_lex_prot$.getGlobalValue().equal( $red_infrastructure_test_default$.getGlobalValue() ) )
    {
      errors = ConsesLow.cons( PrintLow.format( NIL, $str60$reddef_lex_prot_didn_t_have_the_d, $red_infrastructure_test_default$.getGlobalValue(), $reddef_lex_prot$.getGlobalValue() ), errors );
    }
    if( !$reddef_lex_prvt$.getGlobalValue().equal( $red_infrastructure_test_default$.getGlobalValue() ) )
    {
      errors = ConsesLow.cons( PrintLow.format( NIL, $str61$reddef_lex_prvt_didn_t_have_the_d, $red_infrastructure_test_default$.getGlobalValue(), $reddef_lex_prvt$.getGlobalValue() ), errors );
    }
    if( !$reddef_lex_prvt_2$.getGlobalValue().equal( $red_infrastructure_test_default$.getGlobalValue() ) )
    {
      errors = ConsesLow.cons( PrintLow.format( NIL, $str62$reddef_lex_prvt_2_didn_t_have_the, $red_infrastructure_test_default$.getGlobalValue(), $reddef_lex_prvt_2$.getGlobalValue() ), errors );
    }
    if( !$reddef_par_publ$.getDynamicValue( thread ).equal( $red_infrastructure_test_default$.getGlobalValue() ) )
    {
      errors = ConsesLow.cons( PrintLow.format( NIL, $str63$reddef_par_publ_didn_t_have_the_d, $red_infrastructure_test_default$.getGlobalValue(), $reddef_par_publ$.getDynamicValue( thread ) ), errors );
    }
    if( !$reddef_par_prot$.getDynamicValue( thread ).equal( $red_infrastructure_test_default$.getGlobalValue() ) )
    {
      errors = ConsesLow.cons( PrintLow.format( NIL, $str64$reddef_par_prot_didn_t_have_the_d, $red_infrastructure_test_default$.getGlobalValue(), $reddef_par_prot$.getDynamicValue( thread ) ), errors );
    }
    if( !$reddef_par_prvt$.getDynamicValue( thread ).equal( $red_infrastructure_test_default$.getGlobalValue() ) )
    {
      errors = ConsesLow.cons( PrintLow.format( NIL, $str65$reddef_par_prvt_didn_t_have_the_d, $red_infrastructure_test_default$.getGlobalValue(), $reddef_par_prvt$.getDynamicValue( thread ) ), errors );
    }
    red_infrastructure.set_red_symbols();
    if( !$reddef_gbl_publ$.getGlobalValue().equal( $red_infrastructure_test_red_value$.getGlobalValue() ) )
    {
      errors = ConsesLow.cons( PrintLow.format( NIL, $str66$reddef_gbl_publ_didn_t_have_the_v, $red_infrastructure_test_red_value$.getGlobalValue(), $reddef_gbl_publ$.getGlobalValue() ), errors );
    }
    if( !$reddef_gbl_prot$.getGlobalValue().equal( $red_infrastructure_test_red_value$.getGlobalValue() ) )
    {
      errors = ConsesLow.cons( PrintLow.format( NIL, $str67$reddef_gbl_prot_didn_t_have_the_v, $red_infrastructure_test_red_value$.getGlobalValue(), $reddef_gbl_prot$.getGlobalValue() ), errors );
    }
    if( !$reddef_gbl_prvt$.getGlobalValue().equal( $red_infrastructure_test_red_value$.getGlobalValue() ) )
    {
      errors = ConsesLow.cons( PrintLow.format( NIL, $str68$reddef_gbl_prvt_didn_t_have_the_v, $red_infrastructure_test_red_value$.getGlobalValue(), $reddef_gbl_prvt$.getGlobalValue() ), errors );
    }
    if( !$reddef_var_publ$.getDynamicValue( thread ).equal( $red_infrastructure_test_red_value$.getGlobalValue() ) )
    {
      errors = ConsesLow.cons( PrintLow.format( NIL, $str69$reddef_var_publ_didn_t_have_the_v, $red_infrastructure_test_red_value$.getGlobalValue(), $reddef_var_publ$.getDynamicValue( thread ) ), errors );
    }
    if( !$reddef_var_prot$.getDynamicValue( thread ).equal( $red_infrastructure_test_red_value$.getGlobalValue() ) )
    {
      errors = ConsesLow.cons( PrintLow.format( NIL, $str70$reddef_var_prot_didn_t_have_the_v, $red_infrastructure_test_red_value$.getGlobalValue(), $reddef_var_prot$.getDynamicValue( thread ) ), errors );
    }
    if( !$reddef_var_prvt$.getDynamicValue( thread ).equal( $red_infrastructure_test_red_value$.getGlobalValue() ) )
    {
      errors = ConsesLow.cons( PrintLow.format( NIL, $str71$reddef_var_prvt_didn_t_have_the_v, $red_infrastructure_test_red_value$.getGlobalValue(), $reddef_var_prvt$.getDynamicValue( thread ) ), errors );
    }
    if( !$reddef_lex_publ$.getGlobalValue().equal( $red_infrastructure_test_red_value$.getGlobalValue() ) )
    {
      errors = ConsesLow.cons( PrintLow.format( NIL, $str72$reddef_lex_publ_didn_t_have_the_v, $red_infrastructure_test_red_value$.getGlobalValue(), $reddef_lex_publ$.getGlobalValue() ), errors );
    }
    if( !$reddef_lex_prot$.getGlobalValue().equal( $red_infrastructure_test_red_value$.getGlobalValue() ) )
    {
      errors = ConsesLow.cons( PrintLow.format( NIL, $str73$reddef_lex_prot_didn_t_have_the_v, $red_infrastructure_test_red_value$.getGlobalValue(), $reddef_lex_prot$.getGlobalValue() ), errors );
    }
    if( !$reddef_lex_prvt$.getGlobalValue().equal( $red_infrastructure_test_red_value$.getGlobalValue() ) )
    {
      errors = ConsesLow.cons( PrintLow.format( NIL, $str74$reddef_lex_prvt_didn_t_have_the_v, $red_infrastructure_test_red_value$.getGlobalValue(), $reddef_lex_prvt$.getGlobalValue() ), errors );
    }
    if( !$reddef_lex_prvt_2$.getGlobalValue().equal( $red_infrastructure_test_red_value$.getGlobalValue() ) )
    {
      errors = ConsesLow.cons( PrintLow.format( NIL, $str75$reddef_lex_prvt_2_didn_t_have_the, $red_infrastructure_test_red_value$.getGlobalValue(), $reddef_lex_prvt_2$.getGlobalValue() ), errors );
    }
    if( !$reddef_par_publ$.getDynamicValue( thread ).equal( $red_infrastructure_test_red_value$.getGlobalValue() ) )
    {
      errors = ConsesLow.cons( PrintLow.format( NIL, $str76$reddef_par_publ_didn_t_have_the_v, $red_infrastructure_test_red_value$.getGlobalValue(), $reddef_par_publ$.getDynamicValue( thread ) ), errors );
    }
    if( !$reddef_par_prot$.getDynamicValue( thread ).equal( $red_infrastructure_test_red_value$.getGlobalValue() ) )
    {
      errors = ConsesLow.cons( PrintLow.format( NIL, $str77$reddef_par_prot_didn_t_have_the_v, $red_infrastructure_test_red_value$.getGlobalValue(), $reddef_par_prot$.getDynamicValue( thread ) ), errors );
    }
    if( !$reddef_par_prvt$.getDynamicValue( thread ).equal( $red_infrastructure_test_red_value$.getGlobalValue() ) )
    {
      errors = ConsesLow.cons( PrintLow.format( NIL, $str78$reddef_par_prvt_didn_t_have_the_v, $red_infrastructure_test_red_value$.getGlobalValue(), $reddef_par_prvt$.getDynamicValue( thread ) ), errors );
    }
    red_infrastructure.$red_variables_dictionary$.setGlobalValue( save_red_variables_dictionary );
    red_infrastructure.$red_symbols_list$.setGlobalValue( save_red_symbols_list );
    red_infrastructure.$repositories_loaded$.setGlobalValue( save_repositories_loaded );
    return Sequences.nreverse( errors );
  }

  public static SubLObject declare_red_infrastructure_macros_file()
  {
    SubLFiles.declareMacro( me, "define_red_parameter_public", "DEFINE-RED-PARAMETER-PUBLIC" );
    SubLFiles.declareMacro( me, "define_red_parameter_protected", "DEFINE-RED-PARAMETER-PROTECTED" );
    SubLFiles.declareMacro( me, "define_red_parameter_private", "DEFINE-RED-PARAMETER-PRIVATE" );
    SubLFiles.declareMacro( me, "define_red_lexical_public", "DEFINE-RED-LEXICAL-PUBLIC" );
    SubLFiles.declareMacro( me, "define_red_lexical_protected", "DEFINE-RED-LEXICAL-PROTECTED" );
    SubLFiles.declareMacro( me, "define_red_lexical_private", "DEFINE-RED-LEXICAL-PRIVATE" );
    SubLFiles.declareMacro( me, "define_red_global_public", "DEFINE-RED-GLOBAL-PUBLIC" );
    SubLFiles.declareMacro( me, "define_red_global_protected", "DEFINE-RED-GLOBAL-PROTECTED" );
    SubLFiles.declareMacro( me, "define_red_global_private", "DEFINE-RED-GLOBAL-PRIVATE" );
    SubLFiles.declareMacro( me, "define_red_var_public", "DEFINE-RED-VAR-PUBLIC" );
    SubLFiles.declareMacro( me, "define_red_var_protected", "DEFINE-RED-VAR-PROTECTED" );
    SubLFiles.declareMacro( me, "define_red_var_private", "DEFINE-RED-VAR-PRIVATE" );
    SubLFiles.declareMacro( me, "define_red_list_parameter_public", "DEFINE-RED-LIST-PARAMETER-PUBLIC" );
    SubLFiles.declareMacro( me, "define_red_list_parameter_protected", "DEFINE-RED-LIST-PARAMETER-PROTECTED" );
    SubLFiles.declareMacro( me, "define_red_list_parameter_private", "DEFINE-RED-LIST-PARAMETER-PRIVATE" );
    SubLFiles.declareMacro( me, "define_red_list_lexical_public", "DEFINE-RED-LIST-LEXICAL-PUBLIC" );
    SubLFiles.declareMacro( me, "define_red_list_lexical_protected", "DEFINE-RED-LIST-LEXICAL-PROTECTED" );
    SubLFiles.declareMacro( me, "define_red_list_lexical_private", "DEFINE-RED-LIST-LEXICAL-PRIVATE" );
    SubLFiles.declareMacro( me, "define_red_list_global_public", "DEFINE-RED-LIST-GLOBAL-PUBLIC" );
    SubLFiles.declareMacro( me, "define_red_list_global_protected", "DEFINE-RED-LIST-GLOBAL-PROTECTED" );
    SubLFiles.declareMacro( me, "define_red_list_global_private", "DEFINE-RED-LIST-GLOBAL-PRIVATE" );
    SubLFiles.declareMacro( me, "define_red_list_var_public", "DEFINE-RED-LIST-VAR-PUBLIC" );
    SubLFiles.declareMacro( me, "define_red_list_var_protected", "DEFINE-RED-LIST-VAR-PROTECTED" );
    SubLFiles.declareMacro( me, "define_red_list_var_private", "DEFINE-RED-LIST-VAR-PRIVATE" );
    SubLFiles.declareMacro( me, "red_reinitialize_variable", "RED-REINITIALIZE-VARIABLE" );
    SubLFiles.declareFunction( me, "red_def_helper", "RED-DEF-HELPER", 4, 1, false );
    SubLFiles.declareFunction( me, "red_reinitialize_variable_helper", "RED-REINITIALIZE-VARIABLE-HELPER", 1, 0, false );
    SubLFiles.declareFunction( me, "red_infa_unit_test", "RED-INFA-UNIT-TEST", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_red_infrastructure_macros_file()
  {
    $red_infrastructure_test_key$ = SubLFiles.defconstant( "*RED-INFRASTRUCTURE-TEST-KEY*", $list31 );
    $red_infrastructure_test_default$ = SubLFiles.defconstant( "*RED-INFRASTRUCTURE-TEST-DEFAULT*", $str32$dflt );
    $red_infrastructure_test_red_value$ = SubLFiles.defconstant( "*RED-INFRASTRUCTURE-TEST-RED-VALUE*", $str33$_cyc_CycC_Linux_head_run_world_la );
    $reddef_lex_prvt_2$ = SubLFiles.deflexical( "REDDEF-LEX-PRVT-2", red_def_helper( $list31.isSymbol() ? Symbols.symbol_value( $list31 ) : $list31, $sym34$REDDEF_LEX_PRVT_2, $str32$dflt.isSymbol() ? Symbols
        .symbol_value( $str32$dflt ) : $str32$dflt, $kw35$LEXICAL, UNPROVIDED ) );
    $reddef_lex_prvt$ = SubLFiles.deflexical( "REDDEF-LEX-PRVT", red_def_helper( $sym36$_RED_INFRASTRUCTURE_TEST_KEY_.isSymbol() ? Symbols.symbol_value( $sym36$_RED_INFRASTRUCTURE_TEST_KEY_ )
        : $sym36$_RED_INFRASTRUCTURE_TEST_KEY_, $sym37$REDDEF_LEX_PRVT, $sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_.isSymbol() ? Symbols.symbol_value( $sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_ )
            : $sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_, $kw35$LEXICAL, UNPROVIDED ) );
    $reddef_lex_prot$ = SubLFiles.deflexical( "REDDEF-LEX-PROT", red_def_helper( $sym36$_RED_INFRASTRUCTURE_TEST_KEY_.isSymbol() ? Symbols.symbol_value( $sym36$_RED_INFRASTRUCTURE_TEST_KEY_ )
        : $sym36$_RED_INFRASTRUCTURE_TEST_KEY_, $sym39$REDDEF_LEX_PROT, $sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_.isSymbol() ? Symbols.symbol_value( $sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_ )
            : $sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_, $kw35$LEXICAL, UNPROVIDED ) );
    $reddef_lex_publ$ = SubLFiles.deflexical( "REDDEF-LEX-PUBL", red_def_helper( $sym36$_RED_INFRASTRUCTURE_TEST_KEY_.isSymbol() ? Symbols.symbol_value( $sym36$_RED_INFRASTRUCTURE_TEST_KEY_ )
        : $sym36$_RED_INFRASTRUCTURE_TEST_KEY_, $sym40$REDDEF_LEX_PUBL, $sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_.isSymbol() ? Symbols.symbol_value( $sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_ )
            : $sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_, $kw35$LEXICAL, UNPROVIDED ) );
    $reddef_par_prvt$ = SubLFiles.defparameter( "REDDEF-PAR-PRVT", red_def_helper( $sym36$_RED_INFRASTRUCTURE_TEST_KEY_.isSymbol() ? Symbols.symbol_value( $sym36$_RED_INFRASTRUCTURE_TEST_KEY_ )
        : $sym36$_RED_INFRASTRUCTURE_TEST_KEY_, $sym41$REDDEF_PAR_PRVT, $sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_.isSymbol() ? Symbols.symbol_value( $sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_ )
            : $sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_, $kw42$PARAMETER, UNPROVIDED ) );
    $reddef_par_prot$ = SubLFiles.defparameter( "REDDEF-PAR-PROT", red_def_helper( $sym36$_RED_INFRASTRUCTURE_TEST_KEY_.isSymbol() ? Symbols.symbol_value( $sym36$_RED_INFRASTRUCTURE_TEST_KEY_ )
        : $sym36$_RED_INFRASTRUCTURE_TEST_KEY_, $sym43$REDDEF_PAR_PROT, $sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_.isSymbol() ? Symbols.symbol_value( $sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_ )
            : $sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_, $kw42$PARAMETER, UNPROVIDED ) );
    $reddef_par_publ$ = SubLFiles.defparameter( "REDDEF-PAR-PUBL", red_def_helper( $sym36$_RED_INFRASTRUCTURE_TEST_KEY_.isSymbol() ? Symbols.symbol_value( $sym36$_RED_INFRASTRUCTURE_TEST_KEY_ )
        : $sym36$_RED_INFRASTRUCTURE_TEST_KEY_, $sym44$REDDEF_PAR_PUBL, $sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_.isSymbol() ? Symbols.symbol_value( $sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_ )
            : $sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_, $kw42$PARAMETER, UNPROVIDED ) );
    $reddef_var_prvt$ = SubLFiles.defvar( "REDDEF-VAR-PRVT", red_def_helper( $sym36$_RED_INFRASTRUCTURE_TEST_KEY_.isSymbol() ? Symbols.symbol_value( $sym36$_RED_INFRASTRUCTURE_TEST_KEY_ )
        : $sym36$_RED_INFRASTRUCTURE_TEST_KEY_, $sym45$REDDEF_VAR_PRVT, $sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_.isSymbol() ? Symbols.symbol_value( $sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_ )
            : $sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_, $kw46$VAR, UNPROVIDED ) );
    $reddef_var_prot$ = SubLFiles.defvar( "REDDEF-VAR-PROT", red_def_helper( $sym36$_RED_INFRASTRUCTURE_TEST_KEY_.isSymbol() ? Symbols.symbol_value( $sym36$_RED_INFRASTRUCTURE_TEST_KEY_ )
        : $sym36$_RED_INFRASTRUCTURE_TEST_KEY_, $sym47$REDDEF_VAR_PROT, $sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_.isSymbol() ? Symbols.symbol_value( $sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_ )
            : $sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_, $kw46$VAR, UNPROVIDED ) );
    $reddef_var_publ$ = SubLFiles.defvar( "REDDEF-VAR-PUBL", red_def_helper( $sym36$_RED_INFRASTRUCTURE_TEST_KEY_.isSymbol() ? Symbols.symbol_value( $sym36$_RED_INFRASTRUCTURE_TEST_KEY_ )
        : $sym36$_RED_INFRASTRUCTURE_TEST_KEY_, $sym48$REDDEF_VAR_PUBL, $sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_.isSymbol() ? Symbols.symbol_value( $sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_ )
            : $sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_, $kw46$VAR, UNPROVIDED ) );
    $reddef_gbl_prvt$ = SubLFiles.deflexical( "REDDEF-GBL-PRVT", maybeDefault( $sym49$REDDEF_GBL_PRVT, $reddef_gbl_prvt$, () -> ( red_def_helper( $sym36$_RED_INFRASTRUCTURE_TEST_KEY_.isSymbol() ? Symbols.symbol_value(
        $sym36$_RED_INFRASTRUCTURE_TEST_KEY_ ) : $sym36$_RED_INFRASTRUCTURE_TEST_KEY_, $sym49$REDDEF_GBL_PRVT, $sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_.isSymbol() ? Symbols.symbol_value(
            $sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_ ) : $sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_, $kw50$GLOBAL, UNPROVIDED ) ) ) );
    $reddef_gbl_prot$ = SubLFiles.deflexical( "REDDEF-GBL-PROT", maybeDefault( $sym51$REDDEF_GBL_PROT, $reddef_gbl_prot$, () -> ( red_def_helper( $sym36$_RED_INFRASTRUCTURE_TEST_KEY_.isSymbol() ? Symbols.symbol_value(
        $sym36$_RED_INFRASTRUCTURE_TEST_KEY_ ) : $sym36$_RED_INFRASTRUCTURE_TEST_KEY_, $sym51$REDDEF_GBL_PROT, $sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_.isSymbol() ? Symbols.symbol_value(
            $sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_ ) : $sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_, $kw50$GLOBAL, UNPROVIDED ) ) ) );
    $reddef_gbl_publ$ = SubLFiles.deflexical( "REDDEF-GBL-PUBL", maybeDefault( $sym52$REDDEF_GBL_PUBL, $reddef_gbl_publ$, () -> ( red_def_helper( $sym36$_RED_INFRASTRUCTURE_TEST_KEY_.isSymbol() ? Symbols.symbol_value(
        $sym36$_RED_INFRASTRUCTURE_TEST_KEY_ ) : $sym36$_RED_INFRASTRUCTURE_TEST_KEY_, $sym52$REDDEF_GBL_PUBL, $sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_.isSymbol() ? Symbols.symbol_value(
            $sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_ ) : $sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_, $kw50$GLOBAL, UNPROVIDED ) ) ) );
    return NIL;
  }

  public static SubLObject setup_red_infrastructure_macros_file()
  {
    access_macros.register_macro_helper( $sym2$RED_DEF_HELPER, $list28 );
    access_macros.register_macro_helper( $sym27$RED_REINITIALIZE_VARIABLE_HELPER, $sym30$RED_REINITIALIZE_VARIABLE );
    subl_macro_promotions.declare_defglobal( $sym49$REDDEF_GBL_PRVT );
    subl_macro_promotions.declare_defglobal( $sym51$REDDEF_GBL_PROT );
    subl_macro_promotions.declare_defglobal( $sym52$REDDEF_GBL_PUBL );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_red_infrastructure_macros_file();
  }

  @Override
  public void initializeVariables()
  {
    init_red_infrastructure_macros_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_red_infrastructure_macros_file();
  }
  static
  {
    me = new red_infrastructure_macros();
    $red_infrastructure_test_key$ = null;
    $red_infrastructure_test_default$ = null;
    $red_infrastructure_test_red_value$ = null;
    $reddef_lex_prvt_2$ = null;
    $reddef_lex_prvt$ = null;
    $reddef_lex_prot$ = null;
    $reddef_lex_publ$ = null;
    $reddef_par_prvt$ = null;
    $reddef_par_prot$ = null;
    $reddef_par_publ$ = null;
    $reddef_var_prvt$ = null;
    $reddef_var_prot$ = null;
    $reddef_var_publ$ = null;
    $reddef_gbl_prvt$ = null;
    $reddef_gbl_prot$ = null;
    $reddef_gbl_publ$ = null;
    $list0 = ConsesLow.list( makeSymbol( "KEY" ), makeSymbol( "NAME" ), makeSymbol( "DEFAULTVALUE" ), makeSymbol( "DESCRIPTION" ) );
    $sym1$DEFPARAMETER_PUBLIC = makeSymbol( "DEFPARAMETER-PUBLIC" );
    $sym2$RED_DEF_HELPER = makeSymbol( "RED-DEF-HELPER" );
    $sym3$FIF = makeSymbol( "FIF" );
    $sym4$SYMBOLP = makeSymbol( "SYMBOLP" );
    $sym5$QUOTE = makeSymbol( "QUOTE" );
    $sym6$SYMBOL_VALUE = makeSymbol( "SYMBOL-VALUE" );
    $list7 = ConsesLow.list( makeKeyword( "PARAMETER" ) );
    $sym8$DEFPARAMETER_PROTECTED = makeSymbol( "DEFPARAMETER-PROTECTED" );
    $sym9$DEFPARAMETER_PRIVATE = makeSymbol( "DEFPARAMETER-PRIVATE" );
    $sym10$DEFLEXICAL_PUBLIC = makeSymbol( "DEFLEXICAL-PUBLIC" );
    $list11 = ConsesLow.list( makeKeyword( "LEXICAL" ) );
    $sym12$DEFLEXICAL_PROTECTED = makeSymbol( "DEFLEXICAL-PROTECTED" );
    $sym13$DEFLEXICAL_PRIVATE = makeSymbol( "DEFLEXICAL-PRIVATE" );
    $sym14$DEFGLOBAL_PUBLIC = makeSymbol( "DEFGLOBAL-PUBLIC" );
    $list15 = ConsesLow.list( makeKeyword( "GLOBAL" ) );
    $sym16$DEFGLOBAL_PROTECTED = makeSymbol( "DEFGLOBAL-PROTECTED" );
    $sym17$DEFGLOBAL_PRIVATE = makeSymbol( "DEFGLOBAL-PRIVATE" );
    $sym18$DEFVAR_PUBLIC = makeSymbol( "DEFVAR-PUBLIC" );
    $list19 = ConsesLow.list( makeKeyword( "VAR" ) );
    $sym20$DEFVAR_PROTECTED = makeSymbol( "DEFVAR-PROTECTED" );
    $sym21$DEFVAR_PRIVATE = makeSymbol( "DEFVAR-PRIVATE" );
    $list22 = ConsesLow.list( makeKeyword( "PARAMETER" ), makeKeyword( "LIST" ) );
    $list23 = ConsesLow.list( makeKeyword( "LEXICAL" ), makeKeyword( "LIST" ) );
    $list24 = ConsesLow.list( makeKeyword( "GLOBAL" ), makeKeyword( "LIST" ) );
    $list25 = ConsesLow.list( makeKeyword( "VAR" ), makeKeyword( "LIST" ) );
    $list26 = ConsesLow.list( makeSymbol( "NAME" ) );
    $sym27$RED_REINITIALIZE_VARIABLE_HELPER = makeSymbol( "RED-REINITIALIZE-VARIABLE-HELPER" );
    $list28 = ConsesLow.list( new SubLObject[] { makeSymbol( "DEFINE-RED-PARAMETER-PUBLIC" ), makeSymbol( "DEFINE-RED-PARAMETER-PROTECTED" ), makeSymbol( "DEFINE-RED-PARAMETER-PRIVATE" ), makeSymbol(
        "DEFINE-RED-LEXICAL-PUBLIC" ), makeSymbol( "DEFINE-RED-LEXICAL-PROTECTED" ), makeSymbol( "DEFINE-RED-LEXICAL-PRIVATE" ), makeSymbol( "DEFINE-RED-GLOBAL-PUBLIC" ), makeSymbol( "DEFINE-RED-GLOBAL-PROTECTED" ),
      makeSymbol( "DEFINE-RED-GLOBAL-PRIVATE" ), makeSymbol( "DEFINE-RED-VAR-PUBLIC" ), makeSymbol( "DEFINE-RED-VAR-PROTECTED" ), makeSymbol( "DEFINE-RED-VAR-PRIVATE" ), makeSymbol( "DEFINE-RED-LIST-PARAMETER-PUBLIC" ),
      makeSymbol( "DEFINE-RED-LIST-PARAMETER-PROTECTED" ), makeSymbol( "DEFINE-RED-LIST-PARAMETER-PRIVATE" ), makeSymbol( "DEFINE-RED-LIST-LEXICAL-PUBLIC" ), makeSymbol( "DEFINE-RED-LIST-LEXICAL-PROTECTED" ), makeSymbol(
          "DEFINE-RED-LIST-LEXICAL-PRIVATE" ), makeSymbol( "DEFINE-RED-LIST-GLOBAL-PUBLIC" ), makeSymbol( "DEFINE-RED-LIST-GLOBAL-PROTECTED" ), makeSymbol( "DEFINE-RED-LIST-GLOBAL-PRIVATE" ), makeSymbol(
              "DEFINE-RED-LIST-VAR-PUBLIC" ), makeSymbol( "DEFINE-RED-LIST-VAR-PROTECTED" ), makeSymbol( "DEFINE-RED-LIST-VAR-PRIVATE" )
    } );
    $kw29$SIMPLE = makeKeyword( "SIMPLE" );
    $sym30$RED_REINITIALIZE_VARIABLE = makeSymbol( "RED-REINITIALIZE-VARIABLE" );
    $list31 = ConsesLow.list( makeString( "redtest.crtl.worldfile" ) );
    $str32$dflt = makeString( "dflt" );
    $str33$_cyc_CycC_Linux_head_run_world_la = makeString( "/cyc/CycC/Linux/head/run/world/latest.load" );
    $sym34$REDDEF_LEX_PRVT_2 = makeSymbol( "REDDEF-LEX-PRVT-2" );
    $kw35$LEXICAL = makeKeyword( "LEXICAL" );
    $sym36$_RED_INFRASTRUCTURE_TEST_KEY_ = makeSymbol( "*RED-INFRASTRUCTURE-TEST-KEY*" );
    $sym37$REDDEF_LEX_PRVT = makeSymbol( "REDDEF-LEX-PRVT" );
    $sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_ = makeSymbol( "*RED-INFRASTRUCTURE-TEST-DEFAULT*" );
    $sym39$REDDEF_LEX_PROT = makeSymbol( "REDDEF-LEX-PROT" );
    $sym40$REDDEF_LEX_PUBL = makeSymbol( "REDDEF-LEX-PUBL" );
    $sym41$REDDEF_PAR_PRVT = makeSymbol( "REDDEF-PAR-PRVT" );
    $kw42$PARAMETER = makeKeyword( "PARAMETER" );
    $sym43$REDDEF_PAR_PROT = makeSymbol( "REDDEF-PAR-PROT" );
    $sym44$REDDEF_PAR_PUBL = makeSymbol( "REDDEF-PAR-PUBL" );
    $sym45$REDDEF_VAR_PRVT = makeSymbol( "REDDEF-VAR-PRVT" );
    $kw46$VAR = makeKeyword( "VAR" );
    $sym47$REDDEF_VAR_PROT = makeSymbol( "REDDEF-VAR-PROT" );
    $sym48$REDDEF_VAR_PUBL = makeSymbol( "REDDEF-VAR-PUBL" );
    $sym49$REDDEF_GBL_PRVT = makeSymbol( "REDDEF-GBL-PRVT" );
    $kw50$GLOBAL = makeKeyword( "GLOBAL" );
    $sym51$REDDEF_GBL_PROT = makeSymbol( "REDDEF-GBL-PROT" );
    $sym52$REDDEF_GBL_PUBL = makeSymbol( "REDDEF-GBL-PUBL" );
    $str53$reddef_gbl_publ_didn_t_have_the_d = makeString( "reddef-gbl-publ didn't have the default value(~s) ~s~%" );
    $str54$reddef_gbl_prot_didn_t_have_the_d = makeString( "reddef-gbl-prot didn't have the default value(~s) ~s~%" );
    $str55$reddef_gbl_prvt_didn_t_have_the_d = makeString( "reddef-gbl-prvt didn't have the default value(~s) ~s~%" );
    $str56$reddef_var_publ_didn_t_have_the_d = makeString( "reddef-var-publ didn't have the default value(~s) ~s~%" );
    $str57$reddef_var_prot_didn_t_have_the_d = makeString( "reddef-var-prot didn't have the default value(~s) ~s~%" );
    $str58$reddef_var_prvt_didn_t_have_the_d = makeString( "reddef-var-prvt didn't have the default value(~s) ~s~%" );
    $str59$reddef_lex_publ_didn_t_have_the_d = makeString( "reddef-lex-publ didn't have the default value(~s) ~s~%" );
    $str60$reddef_lex_prot_didn_t_have_the_d = makeString( "reddef-lex-prot didn't have the default value(~s) ~s~%" );
    $str61$reddef_lex_prvt_didn_t_have_the_d = makeString( "reddef-lex-prvt didn't have the default value(~s) ~s~%" );
    $str62$reddef_lex_prvt_2_didn_t_have_the = makeString( "reddef-lex-prvt-2 didn't have the default value(~s) ~s~%" );
    $str63$reddef_par_publ_didn_t_have_the_d = makeString( "reddef-par-publ didn't have the default value(~s) ~s~%" );
    $str64$reddef_par_prot_didn_t_have_the_d = makeString( "reddef-par-prot didn't have the default value(~s) ~s~%" );
    $str65$reddef_par_prvt_didn_t_have_the_d = makeString( "reddef-par-prvt didn't have the default value(~s) ~s~%" );
    $str66$reddef_gbl_publ_didn_t_have_the_v = makeString( "reddef-gbl-publ didn't have the value from the red repository(~s) ~s~%" );
    $str67$reddef_gbl_prot_didn_t_have_the_v = makeString( "reddef-gbl-prot didn't have the value from the red repository(~s) ~s~%" );
    $str68$reddef_gbl_prvt_didn_t_have_the_v = makeString( "reddef-gbl-prvt didn't have the value from the red repository(~s) ~s~%" );
    $str69$reddef_var_publ_didn_t_have_the_v = makeString( "reddef-var-publ didn't have the value from the red repository(~s) ~s~%" );
    $str70$reddef_var_prot_didn_t_have_the_v = makeString( "reddef-var-prot didn't have the value from the red repository(~s) ~s~%" );
    $str71$reddef_var_prvt_didn_t_have_the_v = makeString( "reddef-var-prvt didn't have the value from the red repository(~s) ~s~%" );
    $str72$reddef_lex_publ_didn_t_have_the_v = makeString( "reddef-lex-publ didn't have the value from the red repository(~s) ~s~%" );
    $str73$reddef_lex_prot_didn_t_have_the_v = makeString( "reddef-lex-prot didn't have the value from the red repository(~s) ~s~%" );
    $str74$reddef_lex_prvt_didn_t_have_the_v = makeString( "reddef-lex-prvt didn't have the value from the red repository(~s) ~s~%" );
    $str75$reddef_lex_prvt_2_didn_t_have_the = makeString( "reddef-lex-prvt-2 didn't have the value from the red repository(~s) ~s~%" );
    $str76$reddef_par_publ_didn_t_have_the_v = makeString( "reddef-par-publ didn't have the value from the red repository(~s) ~s~%" );
    $str77$reddef_par_prot_didn_t_have_the_v = makeString( "reddef-par-prot didn't have the value from the red repository(~s) ~s~%" );
    $str78$reddef_par_prvt_didn_t_have_the_v = makeString( "reddef-par-prvt didn't have the value from the red repository(~s) ~s~%" );
  }
}
/*
 * 
 * Total time: 328 ms
 * 
 */