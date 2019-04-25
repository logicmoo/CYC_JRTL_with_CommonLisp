package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class at_macros
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.at_macros";
  public static final String myFingerPrint = "cdfa3240a573a39d2132cbfd46cf1def86f515bb9ac9820be5b78b2a65f180b0";
  private static final SubLSymbol $sym0$CLET;
  private static final SubLList $list1;
  private static final SubLSymbol $sym2$CUNWIND_PROTECT;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLSymbol $sym5$MAKE_DEFN_FN_HISTORY_TABLE;
  private static final SubLSymbol $sym6$WITH_NEW_DEFN_SPACE;
  private static final SubLSymbol $sym7$MAKE_QUOTED_DEFN_FN_HISTORY_TABLE;
  private static final SubLSymbol $sym8$MAKE_DEFN_COL_HISTORY_TABLE;
  private static final SubLSymbol $sym9$MAKE_QUOTED_DEFN_COL_HISTORY_TABLE;
  private static final SubLSymbol $sym10$POSSIBLY_MAKE_DEFN_FN_HISTORY_TABLE;
  private static final SubLSymbol $sym11$WITH_POSSIBLY_NEW_DEFN_SPACE;
  private static final SubLSymbol $sym12$POSSIBLY_MAKE_QUOTED_DEFN_FN_HISTORY_TABLE;
  private static final SubLSymbol $sym13$POSSIBLY_MAKE_DEFN_COL_HISTORY_TABLE;
  private static final SubLSymbol $sym14$POSSIBLY_MAKE_QUOTED_DEFN_COL_HISTORY_TABLE;
  private static final SubLList $list15;
  private static final SubLSymbol $sym16$_AT_DEFNS_;
  private static final SubLList $list17;
  private static final SubLSymbol $sym18$_AT_DEFN_;
  private static final SubLSymbol $sym19$_AT_FUNCTIONS_;
  private static final SubLSymbol $sym20$_AT_FUNCTION_;
  private static final SubLList $list21;
  private static final SubLList $list22;
  private static final SubLSymbol $sym23$CSETQ;
  private static final SubLList $list24;
  private static final SubLList $list25;
  private static final SubLList $list26;
  private static final SubLSymbol $sym27$_AT_MODE_;
  private static final SubLList $list28;
  private static final SubLSymbol $sym29$_AT_IND_ISA_;
  private static final SubLList $list30;
  private static final SubLSymbol $sym31$_AT_IND_GENL_;
  private static final SubLList $list32;
  private static final SubLSymbol $sym33$_AT_PRED_;
  private static final SubLSymbol $sym34$PWHEN;
  private static final SubLSymbol $sym35$_AT_INVERSE_;
  private static final SubLList $list36;
  private static final SubLList $list37;
  private static final SubLList $list38;
  private static final SubLSymbol $sym39$GENL_SOMETHING_;
  private static final SubLSymbol $sym40$PROGN;
  private static final SubLSymbol $sym41$FWHEN;
  private static final SubLSymbol $sym42$FORT_P;
  private static final SubLSymbol $sym43$COR;
  private static final SubLSymbol $sym44$GENL_PREDICATES;
  private static final SubLSymbol $sym45$GENL_INVERSES;
  private static final SubLSymbol $sym46$_AT_RELN_;
  private static final SubLSymbol $sym47$_AT_SEARCH_GENL_PREDS__;
  private static final SubLSymbol $sym48$CAND;
  private static final SubLSymbol $sym49$_AT_CHECK_GENL_PREDS__;
  private static final SubLSymbol $sym50$_AT_SEARCH_GENL_INVERSES__;
  private static final SubLSymbol $sym51$_AT_CHECK_GENL_INVERSES__;
  private static final SubLSymbol $sym52$_AT_ARG_;
  private static final SubLList $list53;
  private static final SubLSymbol $sym54$_AT_ARG_TYPE_;
  private static final SubLList $list55;
  private static final SubLSymbol $sym56$CHECK_TYPE;
  private static final SubLList $list57;
  private static final SubLSymbol $sym58$_AT_ARGNUM_;
  private static final SubLSymbol $sym59$_AT_IND_ARG_;
  private static final SubLSymbol $sym60$_AT_IND_ARGNUM_;
  private static final SubLList $list61;
  private static final SubLList $list62;
  private static final SubLSymbol $sym63$_AT_ARG_ISA_;
  private static final SubLList $list64;
  private static final SubLList $list65;
  private static final SubLSymbol $sym66$_AT_BASE_FN_;
  private static final SubLSymbol $sym67$_AT_SOURCE_;
  private static final SubLList $list68;
  private static final SubLSymbol $sym69$_AT_CONSTRAINT_GAF_;
  private static final SubLList $list70;
  private static final SubLSymbol $sym71$__;
  private static final SubLSymbol $sym72$_AT_TEST_LEVEL_;
  private static final SubLSymbol $sym73$_AT_TRACE_LEVEL_;
  private static final SubLSymbol $sym74$_DEFN_TEST_LEVEL_;
  private static final SubLSymbol $sym75$_DEFN_TRACE_LEVEL_;
  private static final SubLList $list76;
  private static final SubLList $list77;
  private static final SubLList $list78;
  private static final SubLList $list79;
  private static final SubLList $list80;
  private static final SubLList $list81;
  private static final SubLList $list82;
  private static final SubLSymbol $sym83$CCATCH_IGNORE;
  private static final SubLSymbol $kw84$AT_MAPPING_DONE;
  private static final SubLList $list85;
  private static final SubLList $list86;
  private static final SubLSymbol $sym87$SYMBOLP;
  private static final SubLSymbol $sym88$QUOTE;
  private static final SubLSymbol $sym89$CPUSHNEW;
  private static final SubLList $list90;
  private static final SubLList $list91;
  private static final SubLString $str92$__a_METERS_;
  private static final SubLString $str93$_a_METERED;
  private static final SubLString $str94$RESET__a_METERS;
  private static final SubLSymbol $sym95$DEFVAR_DEFN;
  private static final SubLList $list96;
  private static final SubLString $str97$metering_cache_for_calls_to_defn_;
  private static final SubLSymbol $sym98$DEFINE;
  private static final SubLSymbol $sym99$CSETF;
  private static final SubLSymbol $sym100$GETHASH;
  private static final SubLSymbol $kw101$CALLS;
  private static final SubLList $list102;
  private static final SubLSymbol $kw103$TIMES;
  private static final SubLList $list104;
  private static final SubLSymbol $kw105$RESULTS;
  private static final SubLSymbol $kw106$ARGS;
  private static final SubLSymbol $sym107$SETHASH;
  private static final SubLSymbol $kw108$ARG_LIST;
  private static final SubLSymbol $kw109$FUNCTION;
  private static final SubLList $list110;
  private static final SubLSymbol $kw111$RESET;
  private static final SubLSymbol $sym112$CDOLIST;
  private static final SubLList $list113;
  private static final SubLList $list114;
  private static final SubLList $list115;
  private static final SubLSymbol $sym116$CPUSH;
  private static final SubLList $list117;
  private static final SubLSymbol $sym118$PIF;
  private static final SubLSymbol $sym119$_DEFN_METERS__;
  private static final SubLList $list120;
  private static final SubLSymbol $sym121$CTIME;
  private static final SubLSymbol $sym122$RUN_TIME;
  private static final SubLSymbol $sym123$RESULT;
  private static final SubLSymbol $sym124$CINC;
  private static final SubLSymbol $sym125$LIST;
  private static final SubLList $list126;
  private static final SubLSymbol $sym127$RET;
  private static final SubLList $list128;
  private static final SubLList $list129;
  private static final SubLSymbol $kw130$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw131$DONE_VAR;
  private static final SubLSymbol $sym132$ALL_ARG_CONSTRAINTS;
  private static final SubLSymbol $sym133$DTLAC_LIST_GENERATOR;
  private static final SubLSymbol $sym134$CSOME;
  private static final SubLSymbol $sym135$DO_ALL_TOP_LEVEL_ARG_CONSTRAINTS;
  private static final SubLSymbol $sym136$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const137$EverythingPSC;
  private static final SubLSymbol $sym138$ALL_ARG_CONSTRAINTS;
  private static final SubLSymbol $sym139$DAACIO_LIST_GENERATOR;
  private static final SubLSymbol $sym140$DO_ALL_ARG_CONSTRAINTS_INSIDE_OUT;
  private static final SubLList $list141;
  private static final SubLList $list142;
  private static final SubLList $list143;

  @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 515L)
  public static SubLObject with_new_defn_space(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym0$CLET, $list1, reader.bq_cons( $sym2$CUNWIND_PROTECT, ConsesLow.append( body, $list3 ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 1032L)
  public static SubLObject with_possibly_new_defn_space(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym0$CLET, $list4, reader.bq_cons( $sym2$CUNWIND_PROTECT, ConsesLow.append( body, $list3 ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 1540L)
  public static SubLObject make_defn_fn_history_table()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Hashtables.make_hash_table( at_vars.$defn_fn_history_default_size$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 1681L)
  public static SubLObject make_quoted_defn_fn_history_table()
  {
    return make_defn_fn_history_table();
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 1809L)
  public static SubLObject make_defn_col_history_table()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Hashtables.make_hash_table( at_vars.$defn_col_history_default_size$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 1952L)
  public static SubLObject make_quoted_defn_col_history_table()
  {
    return make_defn_col_history_table();
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 2082L)
  public static SubLObject possibly_make_defn_fn_history_table()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != misc_utilities.uninitialized_p( at_vars.$defn_fn_history$.getDynamicValue( thread ) ) )
    {
      return make_defn_fn_history_table();
    }
    return at_vars.$defn_fn_history$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 2301L)
  public static SubLObject possibly_make_quoted_defn_fn_history_table()
  {
    return possibly_make_defn_fn_history_table();
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 2456L)
  public static SubLObject possibly_make_defn_col_history_table()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != misc_utilities.uninitialized_p( at_vars.$defn_col_history$.getDynamicValue( thread ) ) )
    {
      return make_defn_col_history_table();
    }
    return at_vars.$defn_col_history$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 2679L)
  public static SubLObject possibly_make_quoted_defn_col_history_table()
  {
    return possibly_make_defn_col_history_table();
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 2836L)
  public static SubLObject with_at_defns(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject v_defns = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list15 );
    v_defns = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym0$CLET, ConsesLow.list( ConsesLow.list( $sym16$_AT_DEFNS_, v_defns ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 3004L)
  public static SubLObject with_at_defn(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject defn = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list17 );
    defn = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym0$CLET, ConsesLow.list( ConsesLow.list( $sym18$_AT_DEFN_, defn ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 3168L)
  public static SubLObject with_at_functions(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject v_defns = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list15 );
    v_defns = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym0$CLET, ConsesLow.list( ConsesLow.list( $sym19$_AT_FUNCTIONS_, v_defns ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 3344L)
  public static SubLObject with_at_function(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject defn = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list17 );
    defn = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym0$CLET, ConsesLow.list( ConsesLow.list( $sym20$_AT_FUNCTION_, defn ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 3516L)
  public static SubLObject with_at_result(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject result_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
    result_var = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym0$CLET, $list22, ConsesLow.append( body, ConsesLow.list( ConsesLow.listS( $sym23$CSETQ, result_var, $list22 ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 3714L)
  public static SubLObject with_some_at_arg_isa_var(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject boolean_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list24 );
    boolean_var = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym0$CLET, $list25, ConsesLow.append( body, ConsesLow.list( ConsesLow.listS( $sym23$CSETQ, boolean_var, $list25 ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 3969L)
  public static SubLObject with_at_mode(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject mode = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list26 );
    mode = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym0$CLET, ConsesLow.list( ConsesLow.list( $sym27$_AT_MODE_, mode ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 4133L)
  public static SubLObject with_at_ind_isa(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject col = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list28 );
    col = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym0$CLET, ConsesLow.list( ConsesLow.list( $sym29$_AT_IND_ISA_, col ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 4301L)
  public static SubLObject with_at_ind_genl(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject v_term = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list30 );
    v_term = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym0$CLET, ConsesLow.list( ConsesLow.list( $sym31$_AT_IND_GENL_, v_term ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 4473L)
  public static SubLObject with_at_pred(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject constraint_pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list32 );
    constraint_pred = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym0$CLET, ConsesLow.list( ConsesLow.list( $sym33$_AT_PRED_, constraint_pred ) ), ConsesLow.listS( $sym34$PWHEN, $sym33$_AT_PRED_, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 4725L)
  public static SubLObject with_at_inverse(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject constraint_pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list32 );
    constraint_pred = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym0$CLET, ConsesLow.list( ConsesLow.list( $sym35$_AT_INVERSE_, constraint_pred ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 4916L)
  public static SubLObject with_at_mapping_inverses(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym34$PWHEN, $list36, ConsesLow.listS( $sym0$CLET, $list37, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 5172L)
  public static SubLObject with_at_reln(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject reln = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
    reln = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    final SubLObject genl_somethingP = $sym39$GENL_SOMETHING_;
    return ConsesLow.list( $sym40$PROGN, ConsesLow.listS( $sym0$CLET, ConsesLow.list( ConsesLow.list( genl_somethingP, ConsesLow.list( $sym41$FWHEN, ConsesLow.list( $sym42$FORT_P, reln ), ConsesLow.list( $sym43$COR,
        ConsesLow.list( $sym44$GENL_PREDICATES, reln ), ConsesLow.list( $sym45$GENL_INVERSES, reln ) ) ) ), ConsesLow.list( $sym46$_AT_RELN_, reln ), ConsesLow.list( $sym47$_AT_SEARCH_GENL_PREDS__, ConsesLow.list(
            $sym48$CAND, $sym49$_AT_CHECK_GENL_PREDS__, genl_somethingP ) ), ConsesLow.list( $sym50$_AT_SEARCH_GENL_INVERSES__, ConsesLow.list( $sym48$CAND, $sym51$_AT_CHECK_GENL_INVERSES__, genl_somethingP ) ) ),
        ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 5665L)
  public static SubLObject with_at_arg(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject v_term = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list30 );
    v_term = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym0$CLET, ConsesLow.list( ConsesLow.list( $sym52$_AT_ARG_, v_term ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 5827L)
  public static SubLObject with_at_type(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject type = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list53 );
    type = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym0$CLET, ConsesLow.list( ConsesLow.list( $sym54$_AT_ARG_TYPE_, type ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 5995L)
  public static SubLObject with_at_argnum(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject integer = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list55 );
    integer = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym40$PROGN, ConsesLow.listS( $sym56$CHECK_TYPE, integer, $list57 ), ConsesLow.listS( $sym0$CLET, ConsesLow.list( ConsesLow.list( $sym58$_AT_ARGNUM_, integer ) ), ConsesLow.append( body,
        NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 6217L)
  public static SubLObject with_at_ind_arg(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject v_term = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list30 );
    v_term = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym0$CLET, ConsesLow.list( ConsesLow.list( $sym59$_AT_IND_ARG_, v_term ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 6387L)
  public static SubLObject with_at_ind_argnum(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject integer = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list55 );
    integer = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym40$PROGN, ConsesLow.listS( $sym56$CHECK_TYPE, integer, $list57 ), ConsesLow.listS( $sym0$CLET, ConsesLow.list( ConsesLow.list( $sym60$_AT_IND_ARGNUM_, integer ) ), ConsesLow.append( body,
        NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 6617L)
  public static SubLObject with_at_arg_isa(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject collection = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list61 );
    collection = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym40$PROGN, ConsesLow.listS( $sym56$CHECK_TYPE, collection, $list62 ), ConsesLow.listS( $sym0$CLET, ConsesLow.list( ConsesLow.list( $sym63$_AT_ARG_ISA_, collection ) ), ConsesLow.append(
        body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 6847L)
  public static SubLObject with_at_base_fn(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject fn = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list64 );
    fn = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym40$PROGN, ConsesLow.listS( $sym56$CHECK_TYPE, fn, $list65 ), ConsesLow.listS( $sym0$CLET, ConsesLow.list( ConsesLow.list( $sym66$_AT_BASE_FN_, fn ) ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 7066L)
  public static SubLObject with_at_source(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject v_term = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list30 );
    v_term = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym0$CLET, ConsesLow.list( ConsesLow.list( $sym67$_AT_SOURCE_, v_term ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 7234L)
  public static SubLObject with_at_constraint_gaf(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject gaf = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list68 );
    gaf = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym0$CLET, ConsesLow.list( ConsesLow.list( $sym69$_AT_CONSTRAINT_GAF_, gaf ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 7416L)
  public static SubLObject at_test(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject level = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list70 );
    level = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym34$PWHEN, ConsesLow.list( $sym71$__, $sym72$_AT_TEST_LEVEL_, level ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 7507L)
  public static SubLObject at_trace(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject level = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list70 );
    level = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym34$PWHEN, ConsesLow.list( $sym71$__, $sym73$_AT_TRACE_LEVEL_, level ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 7600L)
  public static SubLObject defn_test(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject level = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list70 );
    level = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym34$PWHEN, ConsesLow.list( $sym71$__, $sym74$_DEFN_TEST_LEVEL_, level ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 7695L)
  public static SubLObject defn_trace(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject level = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list70 );
    level = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym34$PWHEN, ConsesLow.list( $sym71$__, $sym75$_DEFN_TRACE_LEVEL_, level ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 7792L)
  public static SubLObject gathering_at_constraints(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym0$CLET, $list76, ConsesLow.append( body, $list77 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 8116L)
  public static SubLObject gathering_at_assertions(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym0$CLET, $list78, ConsesLow.append( body, $list79 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 8434L)
  public static SubLObject gathering_at_format_violations(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym0$CLET, $list80, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 8662L)
  public static SubLObject gathering_at_different_violations(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym0$CLET, $list81, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 8899L)
  public static SubLObject gathering_at_predicate_violations(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym0$CLET, $list82, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 9136L)
  public static SubLObject until_at_mapping_finished(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym83$CCATCH_IGNORE, $kw84$AT_MAPPING_DONE, ConsesLow.listS( $sym0$CLET, $list85, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 9278L)
  public static SubLObject declare_collection_specific_defn(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject symbol = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list86 );
    symbol = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym34$PWHEN, ConsesLow.list( $sym87$SYMBOLP, ConsesLow.list( $sym88$QUOTE, symbol ) ), ConsesLow.listS( $sym89$CPUSHNEW, ConsesLow.list( $sym88$QUOTE, symbol ), $list90 ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list86 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 9557L)
  public static SubLObject define_defn_metered(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list91 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list91 );
    final SubLObject temp = current.rest();
    final SubLObject arg_list;
    current = ( arg_list = current.first() );
    final SubLObject body;
    current = ( body = temp );
    final SubLObject meter_cache = Packages.intern( PrintLow.format( NIL, $str92$__a_METERS_, name ), UNPROVIDED );
    final SubLObject metered_function = Packages.intern( PrintLow.format( NIL, $str93$_a_METERED, name ), UNPROVIDED );
    final SubLObject reset_function = Packages.intern( PrintLow.format( NIL, $str94$RESET__a_METERS, name ), UNPROVIDED );
    final SubLObject args = list_utilities.args_from_arg_list( arg_list );
    return ConsesLow.list( new SubLObject[] { $sym40$PROGN, ConsesLow.list( $sym95$DEFVAR_DEFN, meter_cache, $list96, PrintLow.format( NIL, $str97$metering_cache_for_calls_to_defn_, name ) ), ConsesLow.listS(
        $sym98$DEFINE, new SubLObject[]
        { reset_function, NIL, ConsesLow.listS( $sym99$CSETF, ConsesLow.list( $sym100$GETHASH, $kw101$CALLS, meter_cache ), $list102 ), ConsesLow.listS( $sym99$CSETF, ConsesLow.list( $sym100$GETHASH, $kw103$TIMES,
            meter_cache ), $list104 ), ConsesLow.listS( $sym99$CSETF, ConsesLow.list( $sym100$GETHASH, $kw105$RESULTS, meter_cache ), $list104 ), ConsesLow.listS( $sym99$CSETF, ConsesLow.list( $sym100$GETHASH,
                $kw106$ARGS, meter_cache ), $list104 ), ConsesLow.list( $sym107$SETHASH, $kw108$ARG_LIST, meter_cache, ConsesLow.list( $sym88$QUOTE, args ) ), ConsesLow.list( $sym107$SETHASH, $kw109$FUNCTION,
                    meter_cache, ConsesLow.list( $sym88$QUOTE, name ) ), $list110
        } ), ConsesLow.list( reset_function ), ConsesLow.list( $sym107$SETHASH, $kw111$RESET, meter_cache, ConsesLow.list( $sym88$QUOTE, reset_function ) ), ConsesLow.listS( $sym98$DEFINE, metered_function, arg_list,
            ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym112$CDOLIST, $list113, ConsesLow.listS( $sym34$PWHEN, ConsesLow.listS( EQ, ConsesLow.list( $sym88$QUOTE, name ), $list114 ), $list115 ) ), ConsesLow.listS(
                $sym116$CPUSH, meter_cache, $list117 ), ConsesLow.list( $sym98$DEFINE, name, arg_list, ConsesLow.list( $sym118$PIF, $sym119$_DEFN_METERS__, ConsesLow.listS( $sym0$CLET, new SubLObject[]
                { $list120, ConsesLow.list( $sym121$CTIME, $sym122$RUN_TIME, ConsesLow.list( $sym23$CSETQ, $sym123$RESULT, reader.bq_cons( metered_function, ConsesLow.append( args, NIL ) ) ) ), ConsesLow.list(
                    $sym124$CINC, ConsesLow.list( $sym100$GETHASH, $kw101$CALLS, meter_cache ) ), ConsesLow.list( $sym116$CPUSH, $sym122$RUN_TIME, ConsesLow.list( $sym100$GETHASH, $kw103$TIMES, meter_cache ) ), ConsesLow
                        .list( $sym116$CPUSH, $sym123$RESULT, ConsesLow.list( $sym100$GETHASH, $kw105$RESULTS, meter_cache ) ), ConsesLow.list( $sym116$CPUSH, reader.bq_cons( $sym125$LIST, ConsesLow.append( args,
                            NIL ) ), ConsesLow.list( $sym100$GETHASH, $kw106$ARGS, meter_cache ) ), $list126
        } ), ConsesLow.list( $sym127$RET, reader.bq_cons( metered_function, ConsesLow.append( args, NIL ) ) ) ) )
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 11138L)
  public static SubLObject do_all_top_level_arg_constraints(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list128 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject constraint_var = NIL;
    SubLObject formula = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list128 );
    constraint_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list128 );
    formula = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list128 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list128 );
      if( NIL == conses_high.member( current_$1, $list129, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw130$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list128 );
    }
    final SubLObject done_var_tail = cdestructuring_bind.property_list_member( $kw131$DONE_VAR, current );
    final SubLObject done_var = ( NIL != done_var_tail ) ? conses_high.cadr( done_var_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject all_arg_constraints = $sym132$ALL_ARG_CONSTRAINTS;
    return ConsesLow.list( $sym0$CLET, ConsesLow.list( ConsesLow.list( all_arg_constraints, ConsesLow.list( $sym133$DTLAC_LIST_GENERATOR, formula ) ) ), ConsesLow.listS( $sym134$CSOME, ConsesLow.list( constraint_var,
        all_arg_constraints, done_var ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 11676L)
  public static SubLObject dtlac_list_generator(final SubLObject formula)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym136$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const137$EverythingPSC, thread );
      result = arg_type.sorted_top_level_arg_constraints_on_formula( formula );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 11903L)
  public static SubLObject do_all_arg_constraints_inside_out(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list128 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject constraint_var = NIL;
    SubLObject formula = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list128 );
    constraint_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list128 );
    formula = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$2 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list128 );
      current_$2 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list128 );
      if( NIL == conses_high.member( current_$2, $list129, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$2 == $kw130$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list128 );
    }
    final SubLObject done_var_tail = cdestructuring_bind.property_list_member( $kw131$DONE_VAR, current );
    final SubLObject done_var = ( NIL != done_var_tail ) ? conses_high.cadr( done_var_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject all_arg_constraints = $sym138$ALL_ARG_CONSTRAINTS;
    return ConsesLow.list( $sym0$CLET, ConsesLow.list( ConsesLow.list( all_arg_constraints, ConsesLow.list( $sym139$DAACIO_LIST_GENERATOR, formula ) ) ), ConsesLow.listS( $sym134$CSOME, ConsesLow.list( constraint_var,
        all_arg_constraints, done_var ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 12521L)
  public static SubLObject daacio_list_generator(final SubLObject formula)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym136$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const137$EverythingPSC, thread );
      result = arg_type.inside_out_arg_constraints_on_formula( formula );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 12744L)
  public static SubLObject gather_wff_violations(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym0$CLET, $list141, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 12979L)
  public static SubLObject dont_gather_wff_violations(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym0$CLET, $list142, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 13205L)
  public static SubLObject dont_gather_wff_violations_or_suggestions(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym0$CLET, $list143, ConsesLow.append( body, NIL ) );
  }

  public static SubLObject declare_at_macros_file()
  {
    SubLFiles.declareMacro( me, "with_new_defn_space", "WITH-NEW-DEFN-SPACE" );
    SubLFiles.declareMacro( me, "with_possibly_new_defn_space", "WITH-POSSIBLY-NEW-DEFN-SPACE" );
    SubLFiles.declareFunction( me, "make_defn_fn_history_table", "MAKE-DEFN-FN-HISTORY-TABLE", 0, 0, false );
    SubLFiles.declareFunction( me, "make_quoted_defn_fn_history_table", "MAKE-QUOTED-DEFN-FN-HISTORY-TABLE", 0, 0, false );
    SubLFiles.declareFunction( me, "make_defn_col_history_table", "MAKE-DEFN-COL-HISTORY-TABLE", 0, 0, false );
    SubLFiles.declareFunction( me, "make_quoted_defn_col_history_table", "MAKE-QUOTED-DEFN-COL-HISTORY-TABLE", 0, 0, false );
    SubLFiles.declareFunction( me, "possibly_make_defn_fn_history_table", "POSSIBLY-MAKE-DEFN-FN-HISTORY-TABLE", 0, 0, false );
    SubLFiles.declareFunction( me, "possibly_make_quoted_defn_fn_history_table", "POSSIBLY-MAKE-QUOTED-DEFN-FN-HISTORY-TABLE", 0, 0, false );
    SubLFiles.declareFunction( me, "possibly_make_defn_col_history_table", "POSSIBLY-MAKE-DEFN-COL-HISTORY-TABLE", 0, 0, false );
    SubLFiles.declareFunction( me, "possibly_make_quoted_defn_col_history_table", "POSSIBLY-MAKE-QUOTED-DEFN-COL-HISTORY-TABLE", 0, 0, false );
    SubLFiles.declareMacro( me, "with_at_defns", "WITH-AT-DEFNS" );
    SubLFiles.declareMacro( me, "with_at_defn", "WITH-AT-DEFN" );
    SubLFiles.declareMacro( me, "with_at_functions", "WITH-AT-FUNCTIONS" );
    SubLFiles.declareMacro( me, "with_at_function", "WITH-AT-FUNCTION" );
    SubLFiles.declareMacro( me, "with_at_result", "WITH-AT-RESULT" );
    SubLFiles.declareMacro( me, "with_some_at_arg_isa_var", "WITH-SOME-AT-ARG-ISA-VAR" );
    SubLFiles.declareMacro( me, "with_at_mode", "WITH-AT-MODE" );
    SubLFiles.declareMacro( me, "with_at_ind_isa", "WITH-AT-IND-ISA" );
    SubLFiles.declareMacro( me, "with_at_ind_genl", "WITH-AT-IND-GENL" );
    SubLFiles.declareMacro( me, "with_at_pred", "WITH-AT-PRED" );
    SubLFiles.declareMacro( me, "with_at_inverse", "WITH-AT-INVERSE" );
    SubLFiles.declareMacro( me, "with_at_mapping_inverses", "WITH-AT-MAPPING-INVERSES" );
    SubLFiles.declareMacro( me, "with_at_reln", "WITH-AT-RELN" );
    SubLFiles.declareMacro( me, "with_at_arg", "WITH-AT-ARG" );
    SubLFiles.declareMacro( me, "with_at_type", "WITH-AT-TYPE" );
    SubLFiles.declareMacro( me, "with_at_argnum", "WITH-AT-ARGNUM" );
    SubLFiles.declareMacro( me, "with_at_ind_arg", "WITH-AT-IND-ARG" );
    SubLFiles.declareMacro( me, "with_at_ind_argnum", "WITH-AT-IND-ARGNUM" );
    SubLFiles.declareMacro( me, "with_at_arg_isa", "WITH-AT-ARG-ISA" );
    SubLFiles.declareMacro( me, "with_at_base_fn", "WITH-AT-BASE-FN" );
    SubLFiles.declareMacro( me, "with_at_source", "WITH-AT-SOURCE" );
    SubLFiles.declareMacro( me, "with_at_constraint_gaf", "WITH-AT-CONSTRAINT-GAF" );
    SubLFiles.declareMacro( me, "at_test", "AT-TEST" );
    SubLFiles.declareMacro( me, "at_trace", "AT-TRACE" );
    SubLFiles.declareMacro( me, "defn_test", "DEFN-TEST" );
    SubLFiles.declareMacro( me, "defn_trace", "DEFN-TRACE" );
    SubLFiles.declareMacro( me, "gathering_at_constraints", "GATHERING-AT-CONSTRAINTS" );
    SubLFiles.declareMacro( me, "gathering_at_assertions", "GATHERING-AT-ASSERTIONS" );
    SubLFiles.declareMacro( me, "gathering_at_format_violations", "GATHERING-AT-FORMAT-VIOLATIONS" );
    SubLFiles.declareMacro( me, "gathering_at_different_violations", "GATHERING-AT-DIFFERENT-VIOLATIONS" );
    SubLFiles.declareMacro( me, "gathering_at_predicate_violations", "GATHERING-AT-PREDICATE-VIOLATIONS" );
    SubLFiles.declareMacro( me, "until_at_mapping_finished", "UNTIL-AT-MAPPING-FINISHED" );
    SubLFiles.declareMacro( me, "declare_collection_specific_defn", "DECLARE-COLLECTION-SPECIFIC-DEFN" );
    SubLFiles.declareMacro( me, "define_defn_metered", "DEFINE-DEFN-METERED" );
    SubLFiles.declareMacro( me, "do_all_top_level_arg_constraints", "DO-ALL-TOP-LEVEL-ARG-CONSTRAINTS" );
    SubLFiles.declareFunction( me, "dtlac_list_generator", "DTLAC-LIST-GENERATOR", 1, 0, false );
    SubLFiles.declareMacro( me, "do_all_arg_constraints_inside_out", "DO-ALL-ARG-CONSTRAINTS-INSIDE-OUT" );
    SubLFiles.declareFunction( me, "daacio_list_generator", "DAACIO-LIST-GENERATOR", 1, 0, false );
    SubLFiles.declareMacro( me, "gather_wff_violations", "GATHER-WFF-VIOLATIONS" );
    SubLFiles.declareMacro( me, "dont_gather_wff_violations", "DONT-GATHER-WFF-VIOLATIONS" );
    SubLFiles.declareMacro( me, "dont_gather_wff_violations_or_suggestions", "DONT-GATHER-WFF-VIOLATIONS-OR-SUGGESTIONS" );
    return NIL;
  }

  public static SubLObject init_at_macros_file()
  {
    return NIL;
  }

  public static SubLObject setup_at_macros_file()
  {
    access_macros.register_macro_helper( $sym5$MAKE_DEFN_FN_HISTORY_TABLE, $sym6$WITH_NEW_DEFN_SPACE );
    access_macros.register_macro_helper( $sym7$MAKE_QUOTED_DEFN_FN_HISTORY_TABLE, $sym6$WITH_NEW_DEFN_SPACE );
    access_macros.register_macro_helper( $sym8$MAKE_DEFN_COL_HISTORY_TABLE, $sym6$WITH_NEW_DEFN_SPACE );
    access_macros.register_macro_helper( $sym9$MAKE_QUOTED_DEFN_COL_HISTORY_TABLE, $sym6$WITH_NEW_DEFN_SPACE );
    access_macros.register_macro_helper( $sym10$POSSIBLY_MAKE_DEFN_FN_HISTORY_TABLE, $sym11$WITH_POSSIBLY_NEW_DEFN_SPACE );
    access_macros.register_macro_helper( $sym12$POSSIBLY_MAKE_QUOTED_DEFN_FN_HISTORY_TABLE, $sym11$WITH_POSSIBLY_NEW_DEFN_SPACE );
    access_macros.register_macro_helper( $sym13$POSSIBLY_MAKE_DEFN_COL_HISTORY_TABLE, $sym11$WITH_POSSIBLY_NEW_DEFN_SPACE );
    access_macros.register_macro_helper( $sym14$POSSIBLY_MAKE_QUOTED_DEFN_COL_HISTORY_TABLE, $sym11$WITH_POSSIBLY_NEW_DEFN_SPACE );
    access_macros.register_macro_helper( $sym133$DTLAC_LIST_GENERATOR, $sym135$DO_ALL_TOP_LEVEL_ARG_CONSTRAINTS );
    access_macros.register_macro_helper( $sym139$DAACIO_LIST_GENERATOR, $sym140$DO_ALL_ARG_CONSTRAINTS_INSIDE_OUT );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_at_macros_file();
  }

  @Override
  public void initializeVariables()
  {
    init_at_macros_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_at_macros_file();
  }
  static
  {
    me = new at_macros();
    $sym0$CLET = makeSymbol( "CLET" );
    $list1 = ConsesLow.list( ConsesLow.list( makeSymbol( "*DEFN-FN-HISTORY*" ), ConsesLow.list( makeSymbol( "MAKE-DEFN-FN-HISTORY-TABLE" ) ) ), ConsesLow.list( makeSymbol( "*QUOTED-DEFN-FN-HISTORY*" ), ConsesLow.list(
        makeSymbol( "MAKE-QUOTED-DEFN-FN-HISTORY-TABLE" ) ) ), ConsesLow.list( makeSymbol( "*DEFN-COL-HISTORY*" ), ConsesLow.list( makeSymbol( "MAKE-DEFN-COL-HISTORY-TABLE" ) ) ), ConsesLow.list( makeSymbol(
            "*QUOTED-DEFN-COL-HISTORY*" ), ConsesLow.list( makeSymbol( "MAKE-QUOTED-DEFN-COL-HISTORY-TABLE" ) ) ) );
    $sym2$CUNWIND_PROTECT = makeSymbol( "CUNWIND-PROTECT" );
    $list3 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLEAR-DEFN-SPACE" ) ) );
    $list4 = ConsesLow.list( ConsesLow.list( makeSymbol( "*DEFN-FN-HISTORY*" ), ConsesLow.list( makeSymbol( "POSSIBLY-MAKE-DEFN-FN-HISTORY-TABLE" ) ) ), ConsesLow.list( makeSymbol( "*QUOTED-DEFN-FN-HISTORY*" ), ConsesLow
        .list( makeSymbol( "POSSIBLY-MAKE-QUOTED-DEFN-FN-HISTORY-TABLE" ) ) ), ConsesLow.list( makeSymbol( "*DEFN-COL-HISTORY*" ), ConsesLow.list( makeSymbol( "POSSIBLY-MAKE-DEFN-COL-HISTORY-TABLE" ) ) ), ConsesLow.list(
            makeSymbol( "*QUOTED-DEFN-COL-HISTORY*" ), ConsesLow.list( makeSymbol( "POSSIBLY-MAKE-QUOTED-DEFN-COL-HISTORY-TABLE" ) ) ) );
    $sym5$MAKE_DEFN_FN_HISTORY_TABLE = makeSymbol( "MAKE-DEFN-FN-HISTORY-TABLE" );
    $sym6$WITH_NEW_DEFN_SPACE = makeSymbol( "WITH-NEW-DEFN-SPACE" );
    $sym7$MAKE_QUOTED_DEFN_FN_HISTORY_TABLE = makeSymbol( "MAKE-QUOTED-DEFN-FN-HISTORY-TABLE" );
    $sym8$MAKE_DEFN_COL_HISTORY_TABLE = makeSymbol( "MAKE-DEFN-COL-HISTORY-TABLE" );
    $sym9$MAKE_QUOTED_DEFN_COL_HISTORY_TABLE = makeSymbol( "MAKE-QUOTED-DEFN-COL-HISTORY-TABLE" );
    $sym10$POSSIBLY_MAKE_DEFN_FN_HISTORY_TABLE = makeSymbol( "POSSIBLY-MAKE-DEFN-FN-HISTORY-TABLE" );
    $sym11$WITH_POSSIBLY_NEW_DEFN_SPACE = makeSymbol( "WITH-POSSIBLY-NEW-DEFN-SPACE" );
    $sym12$POSSIBLY_MAKE_QUOTED_DEFN_FN_HISTORY_TABLE = makeSymbol( "POSSIBLY-MAKE-QUOTED-DEFN-FN-HISTORY-TABLE" );
    $sym13$POSSIBLY_MAKE_DEFN_COL_HISTORY_TABLE = makeSymbol( "POSSIBLY-MAKE-DEFN-COL-HISTORY-TABLE" );
    $sym14$POSSIBLY_MAKE_QUOTED_DEFN_COL_HISTORY_TABLE = makeSymbol( "POSSIBLY-MAKE-QUOTED-DEFN-COL-HISTORY-TABLE" );
    $list15 = ConsesLow.list( makeSymbol( "DEFNS" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym16$_AT_DEFNS_ = makeSymbol( "*AT-DEFNS*" );
    $list17 = ConsesLow.list( makeSymbol( "DEFN" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym18$_AT_DEFN_ = makeSymbol( "*AT-DEFN*" );
    $sym19$_AT_FUNCTIONS_ = makeSymbol( "*AT-FUNCTIONS*" );
    $sym20$_AT_FUNCTION_ = makeSymbol( "*AT-FUNCTION*" );
    $list21 = ConsesLow.list( makeSymbol( "RESULT-VAR" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list22 = ConsesLow.list( makeSymbol( "*AT-RESULT*" ) );
    $sym23$CSETQ = makeSymbol( "CSETQ" );
    $list24 = ConsesLow.list( makeSymbol( "BOOLEAN-VAR" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list25 = ConsesLow.list( makeSymbol( "*AT-SOME-ARG-ISA?*" ) );
    $list26 = ConsesLow.list( makeSymbol( "MODE" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym27$_AT_MODE_ = makeSymbol( "*AT-MODE*" );
    $list28 = ConsesLow.list( makeSymbol( "COL" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym29$_AT_IND_ISA_ = makeSymbol( "*AT-IND-ISA*" );
    $list30 = ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym31$_AT_IND_GENL_ = makeSymbol( "*AT-IND-GENL*" );
    $list32 = ConsesLow.list( makeSymbol( "CONSTRAINT-PRED" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym33$_AT_PRED_ = makeSymbol( "*AT-PRED*" );
    $sym34$PWHEN = makeSymbol( "PWHEN" );
    $sym35$_AT_INVERSE_ = makeSymbol( "*AT-INVERSE*" );
    $list36 = ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "*AT-CHECK-GENL-INVERSES?*" ), makeSymbol( "*AT-INVERSE*" ) );
    $list37 = ConsesLow.list( ConsesLow.list( makeSymbol( "*AT-MAPPING-GENL-INVERSES?*" ), T ) );
    $list38 = ConsesLow.list( makeSymbol( "RELN" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym39$GENL_SOMETHING_ = makeUninternedSymbol( "GENL-SOMETHING?" );
    $sym40$PROGN = makeSymbol( "PROGN" );
    $sym41$FWHEN = makeSymbol( "FWHEN" );
    $sym42$FORT_P = makeSymbol( "FORT-P" );
    $sym43$COR = makeSymbol( "COR" );
    $sym44$GENL_PREDICATES = makeSymbol( "GENL-PREDICATES" );
    $sym45$GENL_INVERSES = makeSymbol( "GENL-INVERSES" );
    $sym46$_AT_RELN_ = makeSymbol( "*AT-RELN*" );
    $sym47$_AT_SEARCH_GENL_PREDS__ = makeSymbol( "*AT-SEARCH-GENL-PREDS?*" );
    $sym48$CAND = makeSymbol( "CAND" );
    $sym49$_AT_CHECK_GENL_PREDS__ = makeSymbol( "*AT-CHECK-GENL-PREDS?*" );
    $sym50$_AT_SEARCH_GENL_INVERSES__ = makeSymbol( "*AT-SEARCH-GENL-INVERSES?*" );
    $sym51$_AT_CHECK_GENL_INVERSES__ = makeSymbol( "*AT-CHECK-GENL-INVERSES?*" );
    $sym52$_AT_ARG_ = makeSymbol( "*AT-ARG*" );
    $list53 = ConsesLow.list( makeSymbol( "TYPE" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym54$_AT_ARG_TYPE_ = makeSymbol( "*AT-ARG-TYPE*" );
    $list55 = ConsesLow.list( makeSymbol( "INTEGER" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym56$CHECK_TYPE = makeSymbol( "CHECK-TYPE" );
    $list57 = ConsesLow.list( makeSymbol( "INTEGERP" ) );
    $sym58$_AT_ARGNUM_ = makeSymbol( "*AT-ARGNUM*" );
    $sym59$_AT_IND_ARG_ = makeSymbol( "*AT-IND-ARG*" );
    $sym60$_AT_IND_ARGNUM_ = makeSymbol( "*AT-IND-ARGNUM*" );
    $list61 = ConsesLow.list( makeSymbol( "COLLECTION" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list62 = ConsesLow.list( makeSymbol( "FORT-P" ) );
    $sym63$_AT_ARG_ISA_ = makeSymbol( "*AT-ARG-ISA*" );
    $list64 = ConsesLow.list( makeSymbol( "FN" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list65 = ConsesLow.list( makeSymbol( "FUNCTION-SPEC-P" ) );
    $sym66$_AT_BASE_FN_ = makeSymbol( "*AT-BASE-FN*" );
    $sym67$_AT_SOURCE_ = makeSymbol( "*AT-SOURCE*" );
    $list68 = ConsesLow.list( makeSymbol( "GAF" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym69$_AT_CONSTRAINT_GAF_ = makeSymbol( "*AT-CONSTRAINT-GAF*" );
    $list70 = ConsesLow.list( makeSymbol( "LEVEL" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym71$__ = makeSymbol( ">=" );
    $sym72$_AT_TEST_LEVEL_ = makeSymbol( "*AT-TEST-LEVEL*" );
    $sym73$_AT_TRACE_LEVEL_ = makeSymbol( "*AT-TRACE-LEVEL*" );
    $sym74$_DEFN_TEST_LEVEL_ = makeSymbol( "*DEFN-TEST-LEVEL*" );
    $sym75$_DEFN_TRACE_LEVEL_ = makeSymbol( "*DEFN-TRACE-LEVEL*" );
    $list76 = ConsesLow.list( ConsesLow.list( makeSymbol( "*GATHER-AT-CONSTRAINTS?*" ), T ) );
    $list77 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLRHASH" ), makeSymbol( "*AT-ISA-CONSTRAINTS*" ) ), ConsesLow.list( makeSymbol( "CLRHASH" ), makeSymbol( "*AT-GENL-CONSTRAINTS*" ) ) );
    $list78 = ConsesLow.list( ConsesLow.list( makeSymbol( "*GATHER-AT-ASSERTIONS?*" ), T ) );
    $list79 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLRHASH" ), makeSymbol( "*AT-ISA-ASSERTIONS*" ) ), ConsesLow.list( makeSymbol( "CLRHASH" ), makeSymbol( "*AT-GENL-ASSERTIONS*" ) ) );
    $list80 = ConsesLow.list( ConsesLow.list( makeSymbol( "*GATHER-AT-FORMAT-VIOLATIONS?*" ), T ), makeSymbol( "*AT-FORMAT-VIOLATIONS*" ) );
    $list81 = ConsesLow.list( ConsesLow.list( makeSymbol( "*GATHER-AT-DIFFERENT-VIOLATIONS?*" ), T ), makeSymbol( "*AT-DIFFERENT-VIOLATIONS*" ) );
    $list82 = ConsesLow.list( ConsesLow.list( makeSymbol( "*GATHER-AT-PREDICATE-VIOLATIONS?*" ), T ), makeSymbol( "*AT-PREDICATE-VIOLATIONS*" ) );
    $sym83$CCATCH_IGNORE = makeSymbol( "CCATCH-IGNORE" );
    $kw84$AT_MAPPING_DONE = makeKeyword( "AT-MAPPING-DONE" );
    $list85 = ConsesLow.list( ConsesLow.list( makeSymbol( "*WITHIN-AT-MAPPING?*" ), T ) );
    $list86 = ConsesLow.list( makeSymbol( "SYMBOL" ) );
    $sym87$SYMBOLP = makeSymbol( "SYMBOLP" );
    $sym88$QUOTE = makeSymbol( "QUOTE" );
    $sym89$CPUSHNEW = makeSymbol( "CPUSHNEW" );
    $list90 = ConsesLow.list( makeSymbol( "*AT-COLLECTION-SPECIFIC-DEFNS*" ) );
    $list91 = ConsesLow.list( makeSymbol( "NAME" ), ConsesLow.list( makeSymbol( "&REST" ), makeSymbol( "ARG-LIST" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $str92$__a_METERS_ = makeString( "*~a-METERS*" );
    $str93$_a_METERED = makeString( "~a-METERED" );
    $str94$RESET__a_METERS = makeString( "RESET-~a-METERS" );
    $sym95$DEFVAR_DEFN = makeSymbol( "DEFVAR-DEFN" );
    $list96 = ConsesLow.list( makeSymbol( "MAKE-HASH-TABLE" ), EIGHT_INTEGER );
    $str97$metering_cache_for_calls_to_defn_ = makeString( "metering cache for calls to defn module function ~a" );
    $sym98$DEFINE = makeSymbol( "DEFINE" );
    $sym99$CSETF = makeSymbol( "CSETF" );
    $sym100$GETHASH = makeSymbol( "GETHASH" );
    $kw101$CALLS = makeKeyword( "CALLS" );
    $list102 = ConsesLow.list( ZERO_INTEGER );
    $kw103$TIMES = makeKeyword( "TIMES" );
    $list104 = ConsesLow.list( NIL );
    $kw105$RESULTS = makeKeyword( "RESULTS" );
    $kw106$ARGS = makeKeyword( "ARGS" );
    $sym107$SETHASH = makeSymbol( "SETHASH" );
    $kw108$ARG_LIST = makeKeyword( "ARG-LIST" );
    $kw109$FUNCTION = makeKeyword( "FUNCTION" );
    $list110 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $kw111$RESET = makeKeyword( "RESET" );
    $sym112$CDOLIST = makeSymbol( "CDOLIST" );
    $list113 = ConsesLow.list( makeSymbol( "CACHE" ), makeSymbol( "*DEFN-METER-CACHES*" ) );
    $list114 = ConsesLow.list( ConsesLow.list( makeSymbol( "GETHASH" ), makeKeyword( "FUNCTION" ), makeSymbol( "CACHE" ) ) );
    $list115 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "*DEFN-METER-CACHES*" ), ConsesLow.list( makeSymbol( "DELETE" ), makeSymbol( "CACHE" ), makeSymbol( "*DEFN-METER-CACHES*" ) ) ), ConsesLow
        .list( makeSymbol( "CLRHASH" ), makeSymbol( "CACHE" ) ) );
    $sym116$CPUSH = makeSymbol( "CPUSH" );
    $list117 = ConsesLow.list( makeSymbol( "*DEFN-METER-CACHES*" ) );
    $sym118$PIF = makeSymbol( "PIF" );
    $sym119$_DEFN_METERS__ = makeSymbol( "*DEFN-METERS?*" );
    $list120 = ConsesLow.list( makeSymbol( "RESULT" ), makeSymbol( "RUN-TIME" ) );
    $sym121$CTIME = makeSymbol( "CTIME" );
    $sym122$RUN_TIME = makeSymbol( "RUN-TIME" );
    $sym123$RESULT = makeSymbol( "RESULT" );
    $sym124$CINC = makeSymbol( "CINC" );
    $sym125$LIST = makeSymbol( "LIST" );
    $list126 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "RESULT" ) ) );
    $sym127$RET = makeSymbol( "RET" );
    $list128 = ConsesLow.list( ConsesLow.list( makeSymbol( "CONSTRAINT-VAR" ), makeSymbol( "FORMULA" ), makeSymbol( "&KEY" ), makeSymbol( "DONE-VAR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list129 = ConsesLow.list( makeKeyword( "DONE-VAR" ) );
    $kw130$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw131$DONE_VAR = makeKeyword( "DONE-VAR" );
    $sym132$ALL_ARG_CONSTRAINTS = makeUninternedSymbol( "ALL-ARG-CONSTRAINTS" );
    $sym133$DTLAC_LIST_GENERATOR = makeSymbol( "DTLAC-LIST-GENERATOR" );
    $sym134$CSOME = makeSymbol( "CSOME" );
    $sym135$DO_ALL_TOP_LEVEL_ARG_CONSTRAINTS = makeSymbol( "DO-ALL-TOP-LEVEL-ARG-CONSTRAINTS" );
    $sym136$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const137$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $sym138$ALL_ARG_CONSTRAINTS = makeUninternedSymbol( "ALL-ARG-CONSTRAINTS" );
    $sym139$DAACIO_LIST_GENERATOR = makeSymbol( "DAACIO-LIST-GENERATOR" );
    $sym140$DO_ALL_ARG_CONSTRAINTS_INSIDE_OUT = makeSymbol( "DO-ALL-ARG-CONSTRAINTS-INSIDE-OUT" );
    $list141 = ConsesLow.list( ConsesLow.list( makeSymbol( "*NOTING-AT-VIOLATIONS?*" ), T ), ConsesLow.list( makeSymbol( "*ACCUMULATING-AT-VIOLATIONS?*" ), T ), ConsesLow.list( makeSymbol( "*NOTING-WFF-VIOLATIONS?*" ),
        T ), ConsesLow.list( makeSymbol( "*ACCUMULATING-WFF-VIOLATIONS?*" ), T ) );
    $list142 = ConsesLow.list( makeSymbol( "*NOTING-AT-VIOLATIONS?*" ), makeSymbol( "*ACCUMULATING-AT-VIOLATIONS?*" ), makeSymbol( "*NOTING-WFF-VIOLATIONS?*" ), makeSymbol( "*ACCUMULATING-WFF-VIOLATIONS?*" ) );
    $list143 = ConsesLow.list( makeSymbol( "*NOTING-AT-VIOLATIONS?*" ), makeSymbol( "*ACCUMULATING-AT-VIOLATIONS?*" ), makeSymbol( "*NOTING-WFF-VIOLATIONS?*" ), makeSymbol( "*ACCUMULATING-WFF-VIOLATIONS?*" ), makeSymbol(
        "*PROVIDE-WFF-SUGGESTIONS?*" ) );
  }
}
/*
 * 
 * Total time: 260 ms
 * 
 */