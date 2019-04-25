package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class gt_macros
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.gt_macros";
  public static final String myFingerPrint = "98712826175262e07b5bd2ed5289c9f61addd0abe13d8e48c420f12492025132";
  @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 4592L)
  public static SubLSymbol $gt_recursion_cutoff$;
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$PROGN;
  private static final SubLSymbol $sym2$MUST;
  private static final SubLSymbol $sym3$GT_MODE_;
  private static final SubLString $str4$invalid_gt_mode___a;
  private static final SubLSymbol $sym5$CLET;
  private static final SubLSymbol $sym6$_GT_MODE_;
  private static final SubLSymbol $sym7$WITH_SBHL_READER_LOCK;
  private static final SubLList $list8;
  private static final SubLList $list9;
  private static final SubLSymbol $sym10$CHECK_TYPE;
  private static final SubLList $list11;
  private static final SubLSymbol $sym12$_GT_TRUTH_;
  private static final SubLList $list13;
  private static final SubLList $list14;
  private static final SubLSymbol $sym15$_GT_PRED_;
  private static final SubLList $list16;
  private static final SubLList $list17;
  private static final SubLSymbol $sym18$_GT_COMBINE_FN_;
  private static final SubLSymbol $sym19$_GT_BASE_FN_;
  private static final SubLSymbol $sym20$PWHEN;
  private static final SubLSymbol $sym21$_GT_STEP_FN_;
  private static final SubLSymbol $sym22$_TT_STEP_FN_;
  private static final SubLSymbol $sym23$FUNCTION_SPEC_P;
  private static final SubLString $str24$_a_is_not_a_function;
  private static final SubLSymbol $sym25$_GT_GATHER_FN_;
  private static final SubLSymbol $sym26$_GT_COMPOSE_FN_;
  private static final SubLSymbol $sym27$_GT_COMPARE_FN_;
  private static final SubLList $list28;
  private static final SubLSymbol $sym29$_GT_TARGET_;
  private static final SubLList $list30;
  private static final SubLSymbol $sym31$_GT_SEARCHER_;
  private static final SubLSymbol $sym32$_GT_COMPOSE_PRED_;
  private static final SubLList $list33;
  private static final SubLList $list34;
  private static final SubLSymbol $sym35$_GT_COMPOSE_INDEX_ARG_;
  private static final SubLSymbol $sym36$_GT_COMPOSE_GATHER_ARG_;
  private static final SubLList $list37;
  private static final SubLSymbol $sym38$_GT_LINK_SUPPORT_;
  private static final SubLSymbol $sym39$CCATCH_IGNORE;
  private static final SubLSymbol $kw40$GT_ERROR;
  private static final SubLList $list41;
  private static final SubLList $list42;
  private static final SubLSymbol $sym43$PUNLESS;
  private static final SubLList $list44;
  private static final SubLSymbol $sym45$GT_CHECK_TYPE_INTERNAL;
  private static final SubLInteger $int46$64;
  private static final SubLList $list47;
  private static final SubLList $list48;
  private static final SubLList $list49;
  private static final SubLList $list50;
  private static final SubLSymbol $sym51$CUTOFF_REACHED;
  private static final SubLList $list52;
  private static final SubLList $list53;
  private static final SubLSymbol $sym54$_GT_DEPTH_CUTOFF_;
  private static final SubLList $list55;
  private static final SubLList $list56;
  private static final SubLSymbol $sym57$_GT_TIME_CUTOFF_;
  private static final SubLList $list58;
  private static final SubLList $list59;
  private static final SubLSymbol $sym60$PIF;
  private static final SubLSymbol $sym61$_;
  private static final SubLList $list62;
  private static final SubLList $list63;
  private static final SubLList $list64;
  private static final SubLSymbol $sym65$_GT_ANSWERS_CUTOFF_;
  private static final SubLList $list66;
  private static final SubLList $list67;
  private static final SubLList $list68;
  private static final SubLList $list69;
  private static final SubLList $list70;
  private static final SubLSymbol $sym71$_GT_EDGE_LIST_RETURN__;
  private static final SubLSymbol $sym72$CPUSH;
  private static final SubLSymbol $sym73$LIST;
  private static final SubLSymbol $sym74$GAF_ARG1;
  private static final SubLSymbol $sym75$GAF_ARG2;
  private static final SubLList $list76;
  private static final SubLList $list77;
  private static final SubLList $list78;
  private static final SubLSymbol $sym79$_GT_MARKING_TABLE_;
  private static final SubLList $list80;
  private static final SubLList $list81;
  private static final SubLList $list82;
  private static final SubLList $list83;
  private static final SubLList $list84;

  @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 444L)
  public static SubLObject with_gt_mode(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject mode = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    mode = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym1$PROGN, ConsesLow.list( $sym2$MUST, ConsesLow.list( $sym3$GT_MODE_, mode ), $str4$invalid_gt_mode___a, mode ), ConsesLow.listS( $sym5$CLET, ConsesLow.list( ConsesLow.list( $sym6$_GT_MODE_,
        mode ) ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 712L)
  public static SubLObject with_gt_lock(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym1$PROGN, reader.bq_cons( $sym7$WITH_SBHL_READER_LOCK, ConsesLow.append( body, $list8 ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 1057L)
  public static SubLObject with_gt_truth(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject truth = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
    truth = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym1$PROGN, ConsesLow.listS( $sym10$CHECK_TYPE, truth, $list11 ), ConsesLow.listS( $sym5$CLET, ConsesLow.list( ConsesLow.list( $sym12$_GT_TRUTH_, truth ) ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 1273L)
  public static SubLObject with_gt_pred(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list13 );
    pred = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym1$PROGN, ConsesLow.listS( $sym10$CHECK_TYPE, pred, $list14 ), ConsesLow.listS( $sym5$CLET, ConsesLow.list( ConsesLow.list( $sym15$_GT_PRED_, pred ) ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 1482L)
  public static SubLObject with_gt_combine_fn(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject fn = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list16 );
    fn = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym1$PROGN, ConsesLow.listS( $sym10$CHECK_TYPE, fn, $list17 ), ConsesLow.listS( $sym5$CLET, ConsesLow.list( ConsesLow.list( $sym18$_GT_COMBINE_FN_, fn ) ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 1707L)
  public static SubLObject with_gt_base_fn(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject fn = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list16 );
    fn = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym1$PROGN, ConsesLow.listS( $sym10$CHECK_TYPE, fn, $list17 ), ConsesLow.listS( $sym5$CLET, ConsesLow.list( ConsesLow.list( $sym19$_GT_BASE_FN_, fn ) ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 1926L)
  public static SubLObject with_gt_step_fn(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject fn = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list16 );
    fn = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym1$PROGN, ConsesLow.list( $sym20$PWHEN, fn, ConsesLow.listS( $sym10$CHECK_TYPE, fn, $list17 ) ), ConsesLow.listS( $sym5$CLET, ConsesLow.list( ConsesLow.list( $sym21$_GT_STEP_FN_, fn ) ),
        ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 2156L)
  public static SubLObject with_tt_step_fn(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject fn = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list16 );
    fn = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym1$PROGN, ConsesLow.listS( $sym10$CHECK_TYPE, fn, $list17 ), ConsesLow.listS( $sym5$CLET, ConsesLow.list( ConsesLow.list( $sym22$_TT_STEP_FN_, fn ) ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 2375L)
  public static SubLObject with_gt_gather_fn(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject fn = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list16 );
    fn = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym1$PROGN, ConsesLow.list( $sym2$MUST, ConsesLow.list( $sym23$FUNCTION_SPEC_P, fn ), $str24$_a_is_not_a_function, fn ), ConsesLow.listS( $sym5$CLET, ConsesLow.list( ConsesLow.list(
        $sym25$_GT_GATHER_FN_, fn ) ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 2542L)
  public static SubLObject with_gt_compose_fn(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject fn = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list16 );
    fn = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym1$PROGN, ConsesLow.listS( $sym10$CHECK_TYPE, fn, $list17 ), ConsesLow.listS( $sym5$CLET, ConsesLow.list( ConsesLow.list( $sym26$_GT_COMPOSE_FN_, fn ) ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 2767L)
  public static SubLObject with_gt_compare_fn(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject fn = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list16 );
    fn = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym1$PROGN, ConsesLow.listS( $sym10$CHECK_TYPE, fn, $list17 ), ConsesLow.listS( $sym5$CLET, ConsesLow.list( ConsesLow.list( $sym27$_GT_COMPARE_FN_, fn ) ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 2992L)
  public static SubLObject with_gt_target(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject target = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list28 );
    target = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym5$CLET, ConsesLow.list( ConsesLow.list( $sym29$_GT_TARGET_, target ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 3164L)
  public static SubLObject with_gt_searcher(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject searcher = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list30 );
    searcher = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym5$CLET, ConsesLow.list( ConsesLow.list( $sym31$_GT_SEARCHER_, searcher ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 3344L)
  public static SubLObject with_gt_compose_pred(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list13 );
    pred = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym1$PROGN, ConsesLow.listS( $sym10$CHECK_TYPE, pred, $list14 ), ConsesLow.listS( $sym5$CLET, ConsesLow.list( ConsesLow.list( $sym32$_GT_COMPOSE_PRED_, pred ) ), ConsesLow.append( body,
        NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 3570L)
  public static SubLObject with_gt_compose_index_arg(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject arg = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list33 );
    arg = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym1$PROGN, ConsesLow.listS( $sym10$CHECK_TYPE, arg, $list34 ), ConsesLow.listS( $sym5$CLET, ConsesLow.list( ConsesLow.list( $sym35$_GT_COMPOSE_INDEX_ARG_, arg ) ), ConsesLow.append( body,
        NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 3804L)
  public static SubLObject with_gt_compose_gather_arg(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject arg = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list33 );
    arg = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym1$PROGN, ConsesLow.listS( $sym10$CHECK_TYPE, arg, $list34 ), ConsesLow.listS( $sym5$CLET, ConsesLow.list( ConsesLow.list( $sym36$_GT_COMPOSE_GATHER_ARG_, arg ) ), ConsesLow.append( body,
        NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 4040L)
  public static SubLObject with_gt_link_support(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject sup = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list37 );
    sup = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym5$CLET, ConsesLow.list( ConsesLow.list( $sym38$_GT_LINK_SUPPORT_, sup ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 4143L)
  public static SubLObject unless_gt_error(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym39$CCATCH_IGNORE, $kw40$GT_ERROR, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 4256L)
  public static SubLObject without_gt_type_checking(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym5$CLET, $list41, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 4373L)
  public static SubLObject gt_check_type(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject v_object = NIL;
    SubLObject type = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list42 );
    v_object = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list42 );
    type = current.first();
    current = current.rest();
    final SubLObject level = current.isCons() ? current.first() : THREE_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list42 );
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym43$PUNLESS, $list44, ConsesLow.list( $sym45$GT_CHECK_TYPE_INTERNAL, v_object, type, level ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list42 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 4694L)
  public static SubLObject possibly_with_gt_cutoff(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym5$CLET, $list47, $list48, $list49, $list50, ConsesLow.listS( $sym43$PUNLESS, $sym51$CUTOFF_REACHED, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 5627L)
  public static SubLObject with_gt_depth_cutoff(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject cutoff = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list52 );
    cutoff = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym5$CLET, ConsesLow.list( $list53, ConsesLow.list( $sym54$_GT_DEPTH_CUTOFF_, cutoff ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 5840L)
  public static SubLObject with_gt_time_cutoff(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject seconds = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list55 );
    seconds = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym5$CLET, ConsesLow.listS( $list56, ConsesLow.list( $sym57$_GT_TIME_CUTOFF_, seconds ), $list58 ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 6101L)
  public static SubLObject with_gt_answers_cutoff(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject num = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list59 );
    num = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym60$PIF, ConsesLow.listS( $sym61$_, num, $list62 ), $list63, ConsesLow.listS( $sym5$CLET, ConsesLow.listS( $list64, ConsesLow.list( $sym65$_GT_ANSWERS_CUTOFF_, num ), $list66 ), ConsesLow
        .append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 6447L)
  public static SubLObject possibly_with_number_of_answers_cutoff(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym5$CLET, $list67, $list68, ConsesLow.listS( $sym43$PUNLESS, $sym51$CUTOFF_REACHED, $list69, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 6840L)
  public static SubLObject possibly_with_gt_edge_list_accumulation(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject assertion = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list70 );
    assertion = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym1$PROGN, ConsesLow.list( $sym20$PWHEN, $sym71$_GT_EDGE_LIST_RETURN__, ConsesLow.listS( $sym72$CPUSH, ConsesLow.list( $sym73$LIST, ConsesLow.list( $sym74$GAF_ARG1, assertion ), ConsesLow
        .list( $sym75$GAF_ARG2, assertion ) ), $list76 ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 7090L)
  public static SubLObject with_gt_edge_list_return(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym5$CLET, $list77, reader.bq_cons( $sym1$PROGN, ConsesLow.append( body, $list76 ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 7324L)
  public static SubLObject gt_search_with_this_hashtable(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject table = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list78 );
    table = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym5$CLET, ConsesLow.list( ConsesLow.list( $sym79$_GT_MARKING_TABLE_, table ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 7538L)
  public static SubLObject gt_search_with_dynamic_hash(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym5$CLET, $list80, $list81, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 7828L)
  public static SubLObject gt_within_transitive_via_arg(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym5$CLET, $list82, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 8051L)
  public static SubLObject without_gt_sksi(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym5$CLET, $list83, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 8218L)
  public static SubLObject with_gt_sksi(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym5$CLET, $list84, ConsesLow.append( body, NIL ) );
  }

  public static SubLObject declare_gt_macros_file()
  {
    SubLFiles.declareMacro( me, "with_gt_mode", "WITH-GT-MODE" );
    SubLFiles.declareMacro( me, "with_gt_lock", "WITH-GT-LOCK" );
    SubLFiles.declareMacro( me, "with_gt_truth", "WITH-GT-TRUTH" );
    SubLFiles.declareMacro( me, "with_gt_pred", "WITH-GT-PRED" );
    SubLFiles.declareMacro( me, "with_gt_combine_fn", "WITH-GT-COMBINE-FN" );
    SubLFiles.declareMacro( me, "with_gt_base_fn", "WITH-GT-BASE-FN" );
    SubLFiles.declareMacro( me, "with_gt_step_fn", "WITH-GT-STEP-FN" );
    SubLFiles.declareMacro( me, "with_tt_step_fn", "WITH-TT-STEP-FN" );
    SubLFiles.declareMacro( me, "with_gt_gather_fn", "WITH-GT-GATHER-FN" );
    SubLFiles.declareMacro( me, "with_gt_compose_fn", "WITH-GT-COMPOSE-FN" );
    SubLFiles.declareMacro( me, "with_gt_compare_fn", "WITH-GT-COMPARE-FN" );
    SubLFiles.declareMacro( me, "with_gt_target", "WITH-GT-TARGET" );
    SubLFiles.declareMacro( me, "with_gt_searcher", "WITH-GT-SEARCHER" );
    SubLFiles.declareMacro( me, "with_gt_compose_pred", "WITH-GT-COMPOSE-PRED" );
    SubLFiles.declareMacro( me, "with_gt_compose_index_arg", "WITH-GT-COMPOSE-INDEX-ARG" );
    SubLFiles.declareMacro( me, "with_gt_compose_gather_arg", "WITH-GT-COMPOSE-GATHER-ARG" );
    SubLFiles.declareMacro( me, "with_gt_link_support", "WITH-GT-LINK-SUPPORT" );
    SubLFiles.declareMacro( me, "unless_gt_error", "UNLESS-GT-ERROR" );
    SubLFiles.declareMacro( me, "without_gt_type_checking", "WITHOUT-GT-TYPE-CHECKING" );
    SubLFiles.declareMacro( me, "gt_check_type", "GT-CHECK-TYPE" );
    SubLFiles.declareMacro( me, "possibly_with_gt_cutoff", "POSSIBLY-WITH-GT-CUTOFF" );
    SubLFiles.declareMacro( me, "with_gt_depth_cutoff", "WITH-GT-DEPTH-CUTOFF" );
    SubLFiles.declareMacro( me, "with_gt_time_cutoff", "WITH-GT-TIME-CUTOFF" );
    SubLFiles.declareMacro( me, "with_gt_answers_cutoff", "WITH-GT-ANSWERS-CUTOFF" );
    SubLFiles.declareMacro( me, "possibly_with_number_of_answers_cutoff", "POSSIBLY-WITH-NUMBER-OF-ANSWERS-CUTOFF" );
    SubLFiles.declareMacro( me, "possibly_with_gt_edge_list_accumulation", "POSSIBLY-WITH-GT-EDGE-LIST-ACCUMULATION" );
    SubLFiles.declareMacro( me, "with_gt_edge_list_return", "WITH-GT-EDGE-LIST-RETURN" );
    SubLFiles.declareMacro( me, "gt_search_with_this_hashtable", "GT-SEARCH-WITH-THIS-HASHTABLE" );
    SubLFiles.declareMacro( me, "gt_search_with_dynamic_hash", "GT-SEARCH-WITH-DYNAMIC-HASH" );
    SubLFiles.declareMacro( me, "gt_within_transitive_via_arg", "GT-WITHIN-TRANSITIVE-VIA-ARG" );
    SubLFiles.declareMacro( me, "without_gt_sksi", "WITHOUT-GT-SKSI" );
    SubLFiles.declareMacro( me, "with_gt_sksi", "WITH-GT-SKSI" );
    return NIL;
  }

  public static SubLObject init_gt_macros_file()
  {
    $gt_recursion_cutoff$ = SubLFiles.defparameter( "*GT-RECURSION-CUTOFF*", $int46$64 );
    return NIL;
  }

  public static SubLObject setup_gt_macros_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_gt_macros_file();
  }

  @Override
  public void initializeVariables()
  {
    init_gt_macros_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_gt_macros_file();
  }
  static
  {
    me = new gt_macros();
    $gt_recursion_cutoff$ = null;
    $list0 = ConsesLow.list( makeSymbol( "MODE" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym1$PROGN = makeSymbol( "PROGN" );
    $sym2$MUST = makeSymbol( "MUST" );
    $sym3$GT_MODE_ = makeSymbol( "GT-MODE?" );
    $str4$invalid_gt_mode___a = makeString( "invalid gt mode: ~a" );
    $sym5$CLET = makeSymbol( "CLET" );
    $sym6$_GT_MODE_ = makeSymbol( "*GT-MODE*" );
    $sym7$WITH_SBHL_READER_LOCK = makeSymbol( "WITH-SBHL-READER-LOCK" );
    $list8 = ConsesLow.list( ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( ">=" ), makeSymbol( "*GT-TEST-LEVEL*" ), FIVE_INTEGER ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow
        .list( makeSymbol( "SEARCHED" ), ConsesLow.list( makeSymbol( "SBHL-MARKED-NODES" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "SEARCHED" ), ConsesLow.list( makeSymbol( "GT-ERROR" ), THREE_INTEGER,
            makeString( "~s marked constants: ~s" ), ConsesLow.list( makeSymbol( "LENGTH" ), makeSymbol( "SEARCHED" ) ), makeSymbol( "SEARCHED" ) ) ) ) ) );
    $list9 = ConsesLow.list( makeSymbol( "TRUTH" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym10$CHECK_TYPE = makeSymbol( "CHECK-TYPE" );
    $list11 = ConsesLow.list( makeSymbol( "TRUTH-P" ) );
    $sym12$_GT_TRUTH_ = makeSymbol( "*GT-TRUTH*" );
    $list13 = ConsesLow.list( makeSymbol( "PRED" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list14 = ConsesLow.list( makeSymbol( "FORT-P" ) );
    $sym15$_GT_PRED_ = makeSymbol( "*GT-PRED*" );
    $list16 = ConsesLow.list( makeSymbol( "FN" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list17 = ConsesLow.list( makeSymbol( "FUNCTION-SPEC-P" ) );
    $sym18$_GT_COMBINE_FN_ = makeSymbol( "*GT-COMBINE-FN*" );
    $sym19$_GT_BASE_FN_ = makeSymbol( "*GT-BASE-FN*" );
    $sym20$PWHEN = makeSymbol( "PWHEN" );
    $sym21$_GT_STEP_FN_ = makeSymbol( "*GT-STEP-FN*" );
    $sym22$_TT_STEP_FN_ = makeSymbol( "*TT-STEP-FN*" );
    $sym23$FUNCTION_SPEC_P = makeSymbol( "FUNCTION-SPEC-P" );
    $str24$_a_is_not_a_function = makeString( "~a is not a function" );
    $sym25$_GT_GATHER_FN_ = makeSymbol( "*GT-GATHER-FN*" );
    $sym26$_GT_COMPOSE_FN_ = makeSymbol( "*GT-COMPOSE-FN*" );
    $sym27$_GT_COMPARE_FN_ = makeSymbol( "*GT-COMPARE-FN*" );
    $list28 = ConsesLow.list( makeSymbol( "TARGET" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym29$_GT_TARGET_ = makeSymbol( "*GT-TARGET*" );
    $list30 = ConsesLow.list( makeSymbol( "SEARCHER" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym31$_GT_SEARCHER_ = makeSymbol( "*GT-SEARCHER*" );
    $sym32$_GT_COMPOSE_PRED_ = makeSymbol( "*GT-COMPOSE-PRED*" );
    $list33 = ConsesLow.list( makeSymbol( "ARG" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list34 = ConsesLow.list( makeSymbol( "FIXNUMP" ) );
    $sym35$_GT_COMPOSE_INDEX_ARG_ = makeSymbol( "*GT-COMPOSE-INDEX-ARG*" );
    $sym36$_GT_COMPOSE_GATHER_ARG_ = makeSymbol( "*GT-COMPOSE-GATHER-ARG*" );
    $list37 = ConsesLow.list( makeSymbol( "SUP" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym38$_GT_LINK_SUPPORT_ = makeSymbol( "*GT-LINK-SUPPORT*" );
    $sym39$CCATCH_IGNORE = makeSymbol( "CCATCH-IGNORE" );
    $kw40$GT_ERROR = makeKeyword( "GT-ERROR" );
    $list41 = ConsesLow.list( ConsesLow.list( makeSymbol( "*SUSPEND-GT-TYPE-CHECKING?*" ), T ) );
    $list42 = ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol( "TYPE" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "LEVEL" ), THREE_INTEGER ) );
    $sym43$PUNLESS = makeSymbol( "PUNLESS" );
    $list44 = ConsesLow.list( makeSymbol( "COR" ), makeSymbol( "*SUSPEND-TYPE-CHECKING?*" ), makeSymbol( "*SUSPEND-GT-TYPE-CHECKING?*" ), makeSymbol( "*IGNORE-MUSTS?*" ) );
    $sym45$GT_CHECK_TYPE_INTERNAL = makeSymbol( "GT-CHECK-TYPE-INTERNAL" );
    $int46$64 = makeInteger( 64 );
    $list47 = ConsesLow.list( ConsesLow.list( makeSymbol( "CUTOFF-REACHED" ), NIL ), ConsesLow.list( makeSymbol( "*GT-RECURSION-CUTOFF*" ), ConsesLow.list( makeSymbol( "FWHEN" ), ConsesLow.list( makeSymbol( "INTEGERP" ),
        makeSymbol( "*GT-RECURSION-CUTOFF*" ) ), ConsesLow.list( makeSymbol( "-" ), makeSymbol( "*GT-RECURSION-CUTOFF*" ), ONE_INTEGER ) ) ), ConsesLow.list( makeSymbol( "*GT-DEPTH-CUTOFF*" ), ConsesLow.list( makeSymbol(
            "-" ), makeSymbol( "*GT-DEPTH-CUTOFF*" ), ONE_INTEGER ) ) );
    $list48 = ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "INTEGERP" ), makeSymbol( "*GT-RECURSION-CUTOFF*" ) ), ConsesLow.list( makeSymbol( "<" ), makeSymbol(
        "*GT-RECURSION-CUTOFF*" ), ZERO_INTEGER ) ), ConsesLow.list( makeSymbol( "PIF-FEATURE" ), makeKeyword( "CYC-MAINT" ), ConsesLow.list( makeSymbol( "ERROR" ), makeString(
            "GT recursion limit reached.  Please report this problem on bug 15244." ) ), ConsesLow.list( makeSymbol( "ERROR" ), makeString( "GT recursion limit reached." ) ) ) );
    $list49 = ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "*GT-DEPTH-CUTOFF?*" ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "<" ), makeSymbol( "*GT-DEPTH-CUTOFF*" ), ZERO_INTEGER ),
        ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CUTOFF-REACHED" ), T ) ) );
    $list50 = ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "*GT-TIME-CUTOFF?*" ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "<" ), makeSymbol( "*GT-TIME-CUTOFF*" ), ConsesLow.list(
        makeSymbol( "/" ), ConsesLow.list( makeSymbol( "-" ), ConsesLow.list( makeSymbol( "GET-INTERNAL-REAL-TIME" ) ), makeSymbol( "*GT-INITIAL-TIME*" ) ), makeSymbol( "*INTERNAL-TIME-UNITS-PER-SECOND*" ) ) ), ConsesLow
            .list( makeSymbol( "CSETQ" ), makeSymbol( "CUTOFF-REACHED" ), T ) ) );
    $sym51$CUTOFF_REACHED = makeSymbol( "CUTOFF-REACHED" );
    $list52 = ConsesLow.list( makeSymbol( "CUTOFF" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list53 = ConsesLow.list( makeSymbol( "*GT-DEPTH-CUTOFF?*" ), T );
    $sym54$_GT_DEPTH_CUTOFF_ = makeSymbol( "*GT-DEPTH-CUTOFF*" );
    $list55 = ConsesLow.list( makeSymbol( "SECONDS" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list56 = ConsesLow.list( makeSymbol( "*GT-TIME-CUTOFF?*" ), T );
    $sym57$_GT_TIME_CUTOFF_ = makeSymbol( "*GT-TIME-CUTOFF*" );
    $list58 = ConsesLow.list( ConsesLow.list( makeSymbol( "*GT-INITIAL-TIME*" ), ConsesLow.list( makeSymbol( "GET-INTERNAL-REAL-TIME" ) ) ) );
    $list59 = ConsesLow.list( makeSymbol( "NUM" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym60$PIF = makeSymbol( "PIF" );
    $sym61$_ = makeSymbol( "<" );
    $list62 = ConsesLow.list( ONE_INTEGER );
    $list63 = ConsesLow.list( makeSymbol( "GT-ERROR" ), THREE_INTEGER, makeString( "illegal value for number of answers cutoff. try a bigger one" ) );
    $list64 = ConsesLow.list( makeSymbol( "*GT-ANSWERS-CUTOFF?*" ), T );
    $sym65$_GT_ANSWERS_CUTOFF_ = makeSymbol( "*GT-ANSWERS-CUTOFF*" );
    $list66 = ConsesLow.list( ConsesLow.list( makeSymbol( "*GT-ANSWERS-SO-FAR*" ), ZERO_INTEGER ) );
    $list67 = ConsesLow.list( ConsesLow.list( makeSymbol( "CUTOFF-REACHED" ), NIL ) );
    $list68 = ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "*GT-ANSWERS-CUTOFF?*" ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( ">=" ), makeSymbol( "*GT-ANSWERS-SO-FAR*" ), makeSymbol(
        "*GT-ANSWERS-CUTOFF*" ) ), ConsesLow.list( makeSymbol( "MAPPING-FINISHED" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CUTOFF-REACHED" ), T ) ) );
    $list69 = ConsesLow.list( makeSymbol( "CINC" ), makeSymbol( "*GT-ANSWERS-SO-FAR*" ) );
    $list70 = ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym71$_GT_EDGE_LIST_RETURN__ = makeSymbol( "*GT-EDGE-LIST-RETURN?*" );
    $sym72$CPUSH = makeSymbol( "CPUSH" );
    $sym73$LIST = makeSymbol( "LIST" );
    $sym74$GAF_ARG1 = makeSymbol( "GAF-ARG1" );
    $sym75$GAF_ARG2 = makeSymbol( "GAF-ARG2" );
    $list76 = ConsesLow.list( makeSymbol( "*GT-EDGE-LIST*" ) );
    $list77 = ConsesLow.list( ConsesLow.list( makeSymbol( "*GT-EDGE-LIST-RETURN?*" ), T ), makeSymbol( "*GT-EDGE-LIST*" ) );
    $list78 = ConsesLow.list( makeSymbol( "TABLE" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym79$_GT_MARKING_TABLE_ = makeSymbol( "*GT-MARKING-TABLE*" );
    $list80 = ConsesLow.list( ConsesLow.list( makeSymbol( "*GT-TARGET-MARKING-TABLE*" ), makeSymbol( "*GT-MARKING-TABLE*" ) ), makeSymbol( "*GT-MARKING-TABLE*" ) );
    $list81 = ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "*GT-MARKING-TABLE*" ), ConsesLow.list( makeSymbol( "MAKE-HASH-TABLE" ), makeInteger( 128 ) ) );
    $list82 = ConsesLow.list( ConsesLow.list( makeSymbol( "*GT-WITHIN-TRANSITIVE-VIA-ARG?*" ), T ) );
    $list83 = ConsesLow.list( ConsesLow.list( makeSymbol( "*GT-USE-SKSI?*" ), NIL ) );
    $list84 = ConsesLow.list( ConsesLow.list( makeSymbol( "*GT-USE-SKSI?*" ), T ) );
  }
}
/*
 * 
 * Total time: 149 ms
 * 
 */