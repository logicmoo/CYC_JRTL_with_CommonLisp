package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class common_optimization
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.common_optimization";
  public static final String myFingerPrint = "729311b8ee610dc53440994eeea119e8bc531df87ae40243b650225b0ad95a56";
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$PROGN;
  private static final SubLSymbol $sym2$CLET_LOCAL;
  private static final SubLSymbol $sym3$CLET_BIND;
  private static final SubLSymbol $sym4$PCOND;
  private static final SubLSymbol $sym5$FIF;
  private static final SubLSymbol $sym6$_DTB;
  private static final SubLSymbol $sym7$_BTD;
  private static final SubLSymbol $sym8$_NOT;
  private static final SubLSymbol $sym9$_AND;
  private static final SubLSymbol $sym10$_OR;
  private static final SubLSymbol $sym11$_TRY;
  private static final SubLSymbol $sym12$_CUNWIND_PROTECT;
  private static final SubLSymbol $sym13$_WITH_CURRENT_THREAD;
  private static final SubLSymbol $sym14$_FOR;
  private static final SubLList $list15;
  private static final SubLSymbol $sym16$RET;
  private static final SubLList $list17;
  private static final SubLList $list18;
  private static final SubLList $list19;
  private static final SubLList $list20;
  private static final SubLList $list21;
  private static final SubLList $list22;
  private static final SubLList $list23;
  private static final SubLList $list24;
  private static final SubLList $list25;
  private static final SubLList $list26;
  private static final SubLList $list27;
  private static final SubLList $list28;
  private static final SubLList $list29;
  private static final SubLList $list30;
  private static final SubLList $list31;
  private static final SubLList $list32;
  private static final SubLList $list33;
  private static final SubLList $list34;
  private static final SubLList $list35;
  private static final SubLList $list36;
  private static final SubLList $list37;
  private static final SubLSymbol $sym38$TRANSLATOR_RET_OPTIMIZE_BODY;
  private static final SubLList $list39;
  private static final SubLSymbol $sym40$CPROGV;
  private static final SubLSymbol $sym41$WHILE;
  private static final SubLList $list42;
  private static final SubLList $list43;
  private static final SubLList $list44;
  private static final SubLList $list45;
  private static final SubLList $list46;

  @SubLTranslatedFile.SubL(source = "cycl/common-optimization.lisp", position = 873L)
  public static SubLObject translator_optimize_form(final SubLObject form)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject operator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list0 );
    operator = form.first();
    final SubLObject args;
    final SubLObject current = args = form.rest();
    if( operator == $sym1$PROGN )
    {
      return translator_optimize_progn( form );
    }
    if( operator == $sym2$CLET_LOCAL )
    {
      return translator_optimize_clet_local( form );
    }
    if( operator == $sym3$CLET_BIND )
    {
      return translator_optimize_clet_bind( form );
    }
    if( operator == $sym4$PCOND )
    {
      return translator_optimize_pcond( form );
    }
    if( operator == $sym5$FIF )
    {
      return translator_optimize_fif( form );
    }
    if( operator == $sym6$_DTB )
    {
      return translator_optimize_Xdtb( form );
    }
    if( operator == $sym7$_BTD )
    {
      return translator_optimize_Xbtd( form );
    }
    if( operator == $sym8$_NOT )
    {
      return translator_optimize_Xnot( form );
    }
    if( operator == $sym9$_AND )
    {
      return translator_optimize_Xand( form );
    }
    if( operator == $sym10$_OR )
    {
      return translator_optimize_Xor( form );
    }
    if( operator == $sym11$_TRY )
    {
      return translator_optimize_Xtry( form );
    }
    if( operator == $sym12$_CUNWIND_PROTECT )
    {
      return translator_optimize_Xcunwind_protect( form );
    }
    if( operator == $sym13$_WITH_CURRENT_THREAD )
    {
      return translator_optimize_Xwith_current_thread( form );
    }
    if( operator == $sym14$_FOR )
    {
      return translator_optimize_Xfor( form );
    }
    return form;
  }

  @SubLTranslatedFile.SubL(source = "cycl/common-optimization.lisp", position = 2126L)
  public static SubLObject translator_optimize_body(final SubLObject body)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    SubLObject pre_body = translate_identify_sub_progn( body );
    final SubLObject sub_progn = thread.secondMultipleValue();
    SubLObject post_body = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != sub_progn )
    {
      SubLObject current;
      final SubLObject datum = current = sub_progn;
      SubLObject operator = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list15 );
      operator = current.first();
      final SubLObject sub_body;
      current = ( sub_body = current.rest() );
      list_utilities.verify_operator( operator, $sym1$PROGN );
      return translator_optimize_body( ConsesLow.append( pre_body, sub_body, post_body, NIL ) );
    }
    thread.resetMultipleValues();
    pre_body = translate_identify_sub_ret( body );
    final SubLObject sub_ret = thread.secondMultipleValue();
    post_body = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != sub_ret && NIL != post_body )
    {
      return translator_optimize_body( ConsesLow.append( pre_body, ConsesLow.list( sub_ret ) ) );
    }
    return body;
  }

  @SubLTranslatedFile.SubL(source = "cycl/common-optimization.lisp", position = 2904L)
  public static SubLObject translate_identify_sub_progn(final SubLObject forms)
  {
    SubLObject rest_forms;
    SubLObject subform;
    for( rest_forms = NIL, rest_forms = forms; !rest_forms.isAtom(); rest_forms = rest_forms.rest() )
    {
      subform = rest_forms.first();
      if( NIL != list_utilities.form_with_operator_p( subform, $sym1$PROGN ) )
      {
        return Values.values( conses_high.ldiff( forms, rest_forms ), subform, rest_forms.rest() );
      }
    }
    return Values.values( NIL, NIL, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/common-optimization.lisp", position = 3194L)
  public static SubLObject translate_identify_sub_ret(final SubLObject forms)
  {
    SubLObject rest_forms;
    SubLObject subform;
    for( rest_forms = NIL, rest_forms = forms; !rest_forms.isAtom(); rest_forms = rest_forms.rest() )
    {
      subform = rest_forms.first();
      if( NIL != list_utilities.form_with_operator_p( subform, $sym16$RET ) )
      {
        return Values.values( conses_high.ldiff( forms, rest_forms ), subform, rest_forms.rest() );
      }
    }
    return Values.values( NIL, NIL, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/common-optimization.lisp", position = 3480L)
  public static SubLObject translator_optimize_progn(final SubLObject form)
  {
    SubLObject operator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list17 );
    operator = form.first();
    SubLObject body;
    final SubLObject current = body = form.rest();
    list_utilities.verify_operator( operator, $sym1$PROGN );
    body = translator_optimize_body( body );
    if( NIL != body )
    {
      if( NIL != list_utilities.singletonP( body ) )
      {
        final SubLObject subform = body.first();
        return translator_optimize_form( subform );
      }
      SubLObject current_$2;
      final SubLObject datum_$1 = current_$2 = body;
      SubLObject subform2 = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current_$2, datum_$1, $list18 );
      subform2 = current_$2.first();
      final SubLObject rest_body;
      current_$2 = ( rest_body = current_$2.rest() );
      if( NIL != list_utilities.form_with_operator_p( subform2, $sym2$CLET_LOCAL ) )
      {
        SubLObject current_$3;
        final SubLObject datum_$2 = current_$3 = subform2;
        SubLObject operator_$5 = NIL;
        SubLObject v_bindings = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current_$3, datum_$2, $list19 );
        operator_$5 = current_$3.first();
        current_$3 = current_$3.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current_$3, datum_$2, $list19 );
        v_bindings = current_$3.first();
        final SubLObject sub_body;
        current_$3 = ( sub_body = current_$3.rest() );
        list_utilities.verify_operator( operator_$5, $sym2$CLET_LOCAL );
        if( NIL != translator_body_irrelevant_wrt_bindings( rest_body, v_bindings ) && NIL != translator_body_has_no_definers( rest_body ) )
        {
          return translator_optimize_clet_local( ConsesLow.listS( $sym2$CLET_LOCAL, v_bindings, ConsesLow.append( sub_body, rest_body, NIL ) ) );
        }
      }
    }
    return reader.bq_cons( $sym1$PROGN, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/common-optimization.lisp", position = 4487L)
  public static SubLObject translator_body_irrelevant_wrt_bindings(final SubLObject body, final SubLObject v_bindings)
  {
    SubLObject cdolist_list_var = v_bindings;
    SubLObject binding = NIL;
    binding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject variable = binding.first();
      if( NIL != list_utilities.simple_tree_findP( variable, body ) )
      {
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      binding = cdolist_list_var.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/common-optimization.lisp", position = 4701L)
  public static SubLObject translator_body_has_no_definers(final SubLObject body)
  {
    SubLObject cdolist_list_var = body;
    SubLObject statement = NIL;
    statement = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != definer_form_p( statement ) )
      {
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      statement = cdolist_list_var.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/common-optimization.lisp", position = 4852L)
  public static SubLObject definer_form_p(final SubLObject form)
  {
    if( form.isCons() )
    {
      final SubLObject operator = form.first();
      return list_utilities.member_eqP( operator, $list20 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/common-optimization.lisp", position = 5106L)
  public static SubLObject translator_optimize_clet_bind(final SubLObject form)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject operator = NIL;
    SubLObject v_bindings = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list21 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list21 );
    v_bindings = current.first();
    SubLObject body;
    current = ( body = current.rest() );
    list_utilities.verify_operator( operator, $sym3$CLET_BIND );
    body = translator_optimize_body( body );
    if( NIL != list_utilities.singletonP( body ) )
    {
      final SubLObject subform = body.first();
      if( NIL != list_utilities.form_with_operator_p( subform, $sym3$CLET_BIND ) )
      {
        SubLObject current_$7;
        final SubLObject datum_$6 = current_$7 = subform;
        SubLObject operator_$8 = NIL;
        SubLObject sub_bindings = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current_$7, datum_$6, $list22 );
        operator_$8 = current_$7.first();
        current_$7 = current_$7.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current_$7, datum_$6, $list22 );
        sub_bindings = current_$7.first();
        final SubLObject sub_body;
        current_$7 = ( sub_body = current_$7.rest() );
        list_utilities.verify_operator( operator_$8, $sym3$CLET_BIND );
        return translator_optimize_clet_bind( ConsesLow.listS( $sym3$CLET_BIND, ConsesLow.append( v_bindings, sub_bindings, NIL ), ConsesLow.append( sub_body, NIL ) ) );
      }
    }
    return ConsesLow.listS( $sym3$CLET_BIND, v_bindings, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/common-optimization.lisp", position = 5824L)
  public static SubLObject translator_optimize_clet_local(final SubLObject form)
  {
    SubLObject operator = NIL;
    SubLObject v_bindings = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list21 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list21 );
    v_bindings = current.first();
    SubLObject body;
    current = ( body = current.rest() );
    list_utilities.verify_operator( operator, $sym2$CLET_LOCAL );
    body = translator_optimize_body( body );
    if( NIL != list_utilities.singletonP( body ) )
    {
      final SubLObject subform = body.first();
      if( NIL != list_utilities.form_with_operator_p( subform, $sym2$CLET_LOCAL ) )
      {
        SubLObject current_$10;
        final SubLObject datum_$9 = current_$10 = subform;
        SubLObject operator_$11 = NIL;
        SubLObject sub_bindings = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current_$10, datum_$9, $list22 );
        operator_$11 = current_$10.first();
        current_$10 = current_$10.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current_$10, datum_$9, $list22 );
        sub_bindings = current_$10.first();
        final SubLObject sub_body;
        current_$10 = ( sub_body = current_$10.rest() );
        list_utilities.verify_operator( operator_$11, $sym2$CLET_LOCAL );
        if( NIL == translator_bindings_overlap( v_bindings, sub_bindings ) )
        {
          return translator_optimize_clet_local( ConsesLow.listS( $sym2$CLET_LOCAL, ConsesLow.append( v_bindings, sub_bindings, NIL ), ConsesLow.append( sub_body, NIL ) ) );
        }
      }
    }
    return ConsesLow.listS( $sym2$CLET_LOCAL, v_bindings, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/common-optimization.lisp", position = 6626L)
  public static SubLObject translator_bindings_overlap(final SubLObject v_bindings, final SubLObject sub_bindings)
  {
    SubLObject cdolist_list_var = v_bindings;
    SubLObject binding = NIL;
    binding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject variable1 = binding.first();
      SubLObject cdolist_list_var_$12 = sub_bindings;
      SubLObject sub_binding = NIL;
      sub_binding = cdolist_list_var_$12.first();
      while ( NIL != cdolist_list_var_$12)
      {
        final SubLObject variable2 = sub_binding.first();
        if( variable1.eql( variable2 ) )
        {
          return variable1;
        }
        cdolist_list_var_$12 = cdolist_list_var_$12.rest();
        sub_binding = cdolist_list_var_$12.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      binding = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/common-optimization.lisp", position = 6922L)
  public static SubLObject translator_optimize_pcond(final SubLObject form)
  {
    SubLObject operator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list23 );
    operator = form.first();
    final SubLObject v_clauses;
    final SubLObject current = v_clauses = form.rest();
    list_utilities.verify_operator( operator, $sym4$PCOND );
    SubLObject new_clauses = NIL;
    SubLObject doneP = NIL;
    if( NIL == doneP )
    {
      SubLObject csome_list_var = v_clauses;
      SubLObject clause = NIL;
      clause = csome_list_var.first();
      while ( NIL == doneP && NIL != csome_list_var)
      {
        SubLObject current_$14;
        final SubLObject datum_$13 = current_$14 = clause;
        SubLObject condition = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current_$14, datum_$13, $list24 );
        condition = current_$14.first();
        final SubLObject body;
        current_$14 = ( body = current_$14.rest() );
        final SubLObject optimized_body = translator_optimize_body( body );
        if( !condition.equal( $list25 ) )
        {
          if( condition.equal( $list26 ) )
          {
            new_clauses = ConsesLow.cons( reader.bq_cons( $list26, ConsesLow.append( optimized_body, NIL ) ), new_clauses );
            doneP = T;
          }
          else
          {
            new_clauses = ConsesLow.cons( reader.bq_cons( condition, ConsesLow.append( optimized_body, NIL ) ), new_clauses );
          }
        }
        csome_list_var = csome_list_var.rest();
        clause = csome_list_var.first();
      }
    }
    new_clauses = Sequences.nreverse( new_clauses );
    if( NIL == new_clauses )
    {
      return translator_optimize_progn( $list27 );
    }
    if( NIL == list_utilities.singletonP( new_clauses ) )
    {
      return reader.bq_cons( $sym4$PCOND, ConsesLow.append( new_clauses, NIL ) );
    }
    final SubLObject clause2 = new_clauses.first();
    SubLObject current_$15;
    final SubLObject datum_$14 = current_$15 = clause2;
    SubLObject condition2 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current_$15, datum_$14, $list24 );
    condition2 = current_$15.first();
    final SubLObject body2;
    current_$15 = ( body2 = current_$15.rest() );
    if( condition2.equal( $list26 ) )
    {
      return translator_optimize_progn( reader.bq_cons( $sym1$PROGN, ConsesLow.append( body2, NIL ) ) );
    }
    return reader.bq_cons( $sym4$PCOND, ConsesLow.append( new_clauses, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/common-optimization.lisp", position = 7971L)
  public static SubLObject translator_optimize_fif(final SubLObject form)
  {
    SubLObject operator = NIL;
    SubLObject condition = NIL;
    SubLObject true_value = NIL;
    SubLObject false_value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list28 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list28 );
    condition = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list28 );
    true_value = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list28 );
    false_value = current.first();
    current = current.rest();
    if( NIL == current )
    {
      list_utilities.verify_operator( operator, $sym5$FIF );
      if( condition.equal( $list26 ) )
      {
        return true_value;
      }
      if( condition.equal( $list25 ) )
      {
        return false_value;
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( form, $list28 );
    }
    return form;
  }

  @SubLTranslatedFile.SubL(source = "cycl/common-optimization.lisp", position = 8289L)
  public static SubLObject translator_optimize_Xdtb(final SubLObject form)
  {
    SubLObject operator = NIL;
    SubLObject condition = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list29 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list29 );
    condition = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( form, $list29 );
      return NIL;
    }
    list_utilities.verify_operator( operator, $sym6$_DTB );
    if( condition.equal( $list30 ) )
    {
      return $list26;
    }
    if( condition.equal( $list31 ) )
    {
      return $list25;
    }
    if( condition.isCons() && $sym7$_BTD == condition.first() )
    {
      return conses_high.second( condition );
    }
    return form;
  }

  @SubLTranslatedFile.SubL(source = "cycl/common-optimization.lisp", position = 8713L)
  public static SubLObject translator_optimize_Xbtd(final SubLObject form)
  {
    SubLObject operator = NIL;
    SubLObject condition = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list29 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list29 );
    condition = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( form, $list29 );
      return NIL;
    }
    list_utilities.verify_operator( operator, $sym7$_BTD );
    if( condition.equal( $list26 ) )
    {
      return $list30;
    }
    if( condition.equal( $list25 ) )
    {
      return $list31;
    }
    if( condition.isCons() && $sym6$_DTB == condition.first() )
    {
      return conses_high.second( condition );
    }
    return form;
  }

  @SubLTranslatedFile.SubL(source = "cycl/common-optimization.lisp", position = 9104L)
  public static SubLObject translator_optimize_Xnot(final SubLObject form)
  {
    SubLObject operator = NIL;
    SubLObject expression = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list32 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list32 );
    expression = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( form, $list32 );
      return NIL;
    }
    list_utilities.verify_operator( operator, $sym8$_NOT );
    if( expression.equal( $list26 ) )
    {
      return $list25;
    }
    if( expression.equal( $list25 ) )
    {
      return $list26;
    }
    if( expression.isCons() && $sym8$_NOT == expression.first() )
    {
      return conses_high.second( expression );
    }
    return form;
  }

  @SubLTranslatedFile.SubL(source = "cycl/common-optimization.lisp", position = 9508L)
  public static SubLObject translator_optimize_Xand(final SubLObject form)
  {
    SubLObject operator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list33 );
    operator = form.first();
    final SubLObject expressions;
    final SubLObject current = expressions = form.rest();
    list_utilities.verify_operator( operator, $sym9$_AND );
    SubLObject new_expressions = NIL;
    SubLObject cdolist_list_var = expressions;
    SubLObject expression = NIL;
    expression = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( !expression.equal( $list26 ) )
      {
        if( expression.equal( $list25 ) )
        {
          return expression;
        }
        if( expression.isCons() && $sym9$_AND == expression.first() )
        {
          SubLObject cdolist_list_var_$17 = expression.rest();
          SubLObject sub_expression = NIL;
          sub_expression = cdolist_list_var_$17.first();
          while ( NIL != cdolist_list_var_$17)
          {
            new_expressions = ConsesLow.cons( sub_expression, new_expressions );
            cdolist_list_var_$17 = cdolist_list_var_$17.rest();
            sub_expression = cdolist_list_var_$17.first();
          }
        }
        else
        {
          new_expressions = ConsesLow.cons( expression, new_expressions );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      expression = cdolist_list_var.first();
    }
    if( NIL == new_expressions )
    {
      return $list26;
    }
    if( NIL != list_utilities.singletonP( new_expressions ) )
    {
      return new_expressions.first();
    }
    return reader.bq_cons( $sym9$_AND, ConsesLow.append( Sequences.nreverse( new_expressions ), NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/common-optimization.lisp", position = 10270L)
  public static SubLObject translator_optimize_Xor(final SubLObject form)
  {
    SubLObject operator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list33 );
    operator = form.first();
    final SubLObject expressions;
    final SubLObject current = expressions = form.rest();
    list_utilities.verify_operator( operator, $sym10$_OR );
    SubLObject new_expressions = NIL;
    SubLObject cdolist_list_var = expressions;
    SubLObject expression = NIL;
    expression = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( !expression.equal( $list25 ) )
      {
        if( expression.equal( $list26 ) )
        {
          return expression;
        }
        if( expression.isCons() && $sym10$_OR == expression.first() )
        {
          SubLObject cdolist_list_var_$18 = expression.rest();
          SubLObject sub_expression = NIL;
          sub_expression = cdolist_list_var_$18.first();
          while ( NIL != cdolist_list_var_$18)
          {
            new_expressions = ConsesLow.cons( sub_expression, new_expressions );
            cdolist_list_var_$18 = cdolist_list_var_$18.rest();
            sub_expression = cdolist_list_var_$18.first();
          }
        }
        else
        {
          new_expressions = ConsesLow.cons( expression, new_expressions );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      expression = cdolist_list_var.first();
    }
    if( NIL == new_expressions )
    {
      return $list25;
    }
    if( NIL != list_utilities.singletonP( new_expressions ) )
    {
      return new_expressions.first();
    }
    return reader.bq_cons( $sym10$_OR, ConsesLow.append( Sequences.nreverse( new_expressions ), NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/common-optimization.lisp", position = 11028L)
  public static SubLObject translator_optimize_Xtry(final SubLObject form)
  {
    SubLObject operator = NIL;
    SubLObject try_form = NIL;
    SubLObject catch_clauses = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list34 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list34 );
    try_form = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list34 );
    catch_clauses = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    list_utilities.verify_operator( operator, $sym11$_TRY );
    final SubLObject optimized_try_form = translator_optimize_form( try_form );
    if( NIL == catch_clauses && NIL == body )
    {
      return optimized_try_form;
    }
    final SubLObject optimized_body = translator_optimize_body( body );
    final SubLObject optimized_catch_clauses = catch_clauses;
    return ConsesLow.list( $sym11$_TRY, optimized_try_form, optimized_catch_clauses, optimized_body );
  }

  @SubLTranslatedFile.SubL(source = "cycl/common-optimization.lisp", position = 11647L)
  public static SubLObject translator_optimize_Xcunwind_protect(final SubLObject form)
  {
    SubLObject operator = NIL;
    SubLObject env_var = NIL;
    SubLObject protected_form = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list35 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list35 );
    env_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list35 );
    protected_form = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    list_utilities.verify_operator( operator, $sym12$_CUNWIND_PROTECT );
    final SubLObject optimized_protected_form = translator_optimize_form( protected_form );
    final SubLObject optimized_body = translator_optimize_body( body );
    if( NIL == optimized_body )
    {
      return optimized_protected_form;
    }
    return ConsesLow.listS( $sym12$_CUNWIND_PROTECT, env_var, optimized_protected_form, ConsesLow.append( optimized_body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/common-optimization.lisp", position = 12173L)
  public static SubLObject translator_optimize_Xwith_current_thread(final SubLObject form)
  {
    SubLObject operator = NIL;
    SubLObject thread_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list36 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list36 );
    thread_var = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    list_utilities.verify_operator( operator, $sym13$_WITH_CURRENT_THREAD );
    final SubLObject optimized_body = translator_optimize_body( body );
    if( NIL == optimized_body )
    {
      return $list27;
    }
    return ConsesLow.listS( $sym13$_WITH_CURRENT_THREAD, thread_var, ConsesLow.append( optimized_body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/common-optimization.lisp", position = 12577L)
  public static SubLObject translator_optimize_Xfor(final SubLObject form)
  {
    SubLObject operator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list37 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list37 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject initializations = NIL;
    SubLObject test = NIL;
    SubLObject updates = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list37 );
    initializations = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list37 );
    test = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list37 );
    updates = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      list_utilities.verify_operator( operator, $sym14$_FOR );
      final SubLObject optimized_initializations = translator_optimize_body( initializations );
      final SubLObject optimized_test = translator_optimize_form( test );
      final SubLObject optimized_updates = translator_optimize_body( updates );
      final SubLObject optimized_body = translator_optimize_body( body );
      return ConsesLow.listS( $sym14$_FOR, ConsesLow.list( optimized_initializations, optimized_test, optimized_updates ), ConsesLow.append( optimized_body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( form, $list37 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/common-optimization.lisp", position = 13144L)
  public static SubLObject translator_unreachable_optimize_body(final SubLObject statements)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject optimized_statements;
    SubLObject trappedP;
    SubLObject rest;
    SubLObject statement;
    SubLObject optimized_statement;
    SubLObject optimized_statement_$19;
    SubLObject trappedP_$20;
    for( optimized_statements = NIL, trappedP = NIL, rest = NIL, rest = statements; NIL == trappedP && NIL != rest; trappedP = trappedP_$20, optimized_statements = ConsesLow.cons( optimized_statement,
        optimized_statements ), rest = rest.rest() )
    {
      statement = rest.first();
      optimized_statement = NIL;
      thread.resetMultipleValues();
      optimized_statement_$19 = translator_unreachable_optimize_statement( statement );
      trappedP_$20 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      optimized_statement = optimized_statement_$19;
    }
    optimized_statements = Sequences.nreverse( optimized_statements );
    return Values.values( optimized_statements, trappedP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/common-optimization.lisp", position = 13828L)
  public static SubLObject translator_ret_optimize_body(final SubLObject statements)
  {
    return translator_unreachable_optimize_body( statements );
  }

  @SubLTranslatedFile.SubL(source = "cycl/common-optimization.lisp", position = 14043L)
  public static SubLObject translator_unreachable_optimize_statement(final SubLObject statement)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject operator = statement.first();
    if( operator == $sym16$RET )
    {
      return Values.values( statement, T );
    }
    if( operator == $sym1$PROGN )
    {
      return translator_unreachable_optimize_progn( statement );
    }
    if( operator == $sym4$PCOND )
    {
      return translator_unreachable_optimize_pcond( statement );
    }
    if( operator == $sym2$CLET_LOCAL )
    {
      return translator_unreachable_optimize_clet_local( statement );
    }
    if( operator == $sym3$CLET_BIND )
    {
      return translator_unreachable_optimize_clet_bind( statement );
    }
    if( operator == $sym40$CPROGV )
    {
      return translator_unreachable_optimize_cprogv( statement );
    }
    if( operator == $sym12$_CUNWIND_PROTECT )
    {
      return translator_unreachable_optimize_Xcunwind_protect( statement );
    }
    if( operator == $sym41$WHILE )
    {
      return translator_unreachable_optimize_while( statement );
    }
    if( operator == $sym14$_FOR )
    {
      return translator_unreachable_optimize_Xfor( statement );
    }
    if( operator == $sym13$_WITH_CURRENT_THREAD )
    {
      return translator_unreachable_optimize_Xwith_current_thread( statement );
    }
    return Values.values( statement, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/common-optimization.lisp", position = 15321L)
  public static SubLObject translator_unreachable_optimize_progn(final SubLObject statement)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject operator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( statement, statement, $list17 );
    operator = statement.first();
    final SubLObject body;
    final SubLObject current = body = statement.rest();
    list_utilities.verify_operator( operator, $sym1$PROGN );
    thread.resetMultipleValues();
    final SubLObject optimized_body = translator_unreachable_optimize_body( body );
    final SubLObject returnsP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject optimized_statement = reader.bq_cons( $sym1$PROGN, ConsesLow.append( optimized_body, NIL ) );
    return Values.values( optimized_statement, returnsP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/common-optimization.lisp", position = 15699L)
  public static SubLObject translator_unreachable_optimize_pcond(final SubLObject statement)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject operator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( statement, statement, $list23 );
    operator = statement.first();
    final SubLObject v_clauses;
    final SubLObject current = v_clauses = statement.rest();
    list_utilities.verify_operator( operator, $sym4$PCOND );
    if( NIL == v_clauses )
    {
      return Values.values( statement, NIL );
    }
    SubLObject optimized_clauses = NIL;
    SubLObject trappedP = T;
    SubLObject last_clause_expression = NIL;
    SubLObject cdolist_list_var = v_clauses;
    SubLObject clause = NIL;
    clause = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current_$22;
      final SubLObject datum_$21 = current_$22 = clause;
      SubLObject clause_expression = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current_$22, datum_$21, $list42 );
      clause_expression = current_$22.first();
      final SubLObject clause_body;
      current_$22 = ( clause_body = current_$22.rest() );
      last_clause_expression = clause_expression;
      thread.resetMultipleValues();
      final SubLObject optimized_clause_body = translator_unreachable_optimize_body( clause_body );
      final SubLObject clause_body_trappedP = thread.secondMultipleValue();
      thread.resetMultipleValues();
      final SubLObject optimized_clause = reader.bq_cons( clause_expression, ConsesLow.append( optimized_clause_body, NIL ) );
      optimized_clauses = ConsesLow.cons( optimized_clause, optimized_clauses );
      trappedP = makeBoolean( NIL != trappedP && NIL != clause_body_trappedP );
      cdolist_list_var = cdolist_list_var.rest();
      clause = cdolist_list_var.first();
    }
    final SubLObject completeP = Equality.equal( last_clause_expression, $list26 );
    trappedP = makeBoolean( NIL != trappedP && NIL != completeP );
    final SubLObject optimized_statement = reader.bq_cons( $sym4$PCOND, ConsesLow.append( Sequences.nreverse( optimized_clauses ), NIL ) );
    return Values.values( optimized_statement, trappedP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/common-optimization.lisp", position = 16713L)
  public static SubLObject translator_unreachable_optimize_clet_local(final SubLObject statement)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject operator = NIL;
    SubLObject local_bindings = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( statement, statement, $list43 );
    operator = statement.first();
    SubLObject current = statement.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, statement, $list43 );
    local_bindings = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    list_utilities.verify_operator( operator, $sym2$CLET_LOCAL );
    thread.resetMultipleValues();
    final SubLObject optimized_body = translator_unreachable_optimize_body( body );
    final SubLObject trappedP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject optimized_statement = ConsesLow.listS( $sym2$CLET_LOCAL, local_bindings, ConsesLow.append( optimized_body, NIL ) );
    return Values.values( optimized_statement, trappedP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/common-optimization.lisp", position = 17137L)
  public static SubLObject translator_unreachable_optimize_clet_bind(final SubLObject statement)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject operator = NIL;
    SubLObject dynamic_bindings = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( statement, statement, $list44 );
    operator = statement.first();
    SubLObject current = statement.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, statement, $list44 );
    dynamic_bindings = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    list_utilities.verify_operator( operator, $sym3$CLET_BIND );
    thread.resetMultipleValues();
    final SubLObject optimized_body = translator_unreachable_optimize_body( body );
    final SubLObject trappedP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject optimized_statement = ConsesLow.listS( $sym3$CLET_BIND, dynamic_bindings, ConsesLow.append( optimized_body, NIL ) );
    return Values.values( optimized_statement, trappedP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/common-optimization.lisp", position = 17562L)
  public static SubLObject translator_unreachable_optimize_cprogv(final SubLObject statement)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject operator = NIL;
    SubLObject special_vars = NIL;
    SubLObject v_bindings = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( statement, statement, $list45 );
    operator = statement.first();
    SubLObject current = statement.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, statement, $list45 );
    special_vars = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, statement, $list45 );
    v_bindings = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    list_utilities.verify_operator( operator, $sym40$CPROGV );
    thread.resetMultipleValues();
    final SubLObject optimized_body = translator_unreachable_optimize_body( body );
    final SubLObject trappedP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject optimized_statement = ConsesLow.listS( $sym40$CPROGV, special_vars, v_bindings, ConsesLow.append( optimized_body, NIL ) );
    return Values.values( optimized_statement, trappedP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/common-optimization.lisp", position = 17989L)
  public static SubLObject translator_unreachable_optimize_Xcunwind_protect(final SubLObject statement)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject operator = NIL;
    SubLObject env_var = NIL;
    SubLObject protected_form = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( statement, statement, $list35 );
    operator = statement.first();
    SubLObject current = statement.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, statement, $list35 );
    env_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, statement, $list35 );
    protected_form = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    list_utilities.verify_operator( operator, $sym12$_CUNWIND_PROTECT );
    thread.resetMultipleValues();
    final SubLObject optimized_protected_form = translator_unreachable_optimize_statement( protected_form );
    final SubLObject protected_form_trappedP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    thread.resetMultipleValues();
    final SubLObject optimized_body = translator_unreachable_optimize_body( body );
    final SubLObject body_trappedP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject optimized_statement = ConsesLow.listS( $sym12$_CUNWIND_PROTECT, env_var, optimized_protected_form, ConsesLow.append( optimized_body, NIL ) );
    return Values.values( optimized_statement, protected_form_trappedP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/common-optimization.lisp", position = 18682L)
  public static SubLObject translator_unreachable_optimize_while(final SubLObject statement)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject operator = NIL;
    SubLObject test = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( statement, statement, $list46 );
    operator = statement.first();
    SubLObject current = statement.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, statement, $list46 );
    test = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    list_utilities.verify_operator( operator, $sym41$WHILE );
    final SubLObject optimized_test = translator_optimize_form( test );
    final SubLObject trappedP = Equality.equal( optimized_test, $list26 );
    thread.resetMultipleValues();
    final SubLObject optimized_body = translator_unreachable_optimize_body( body );
    final SubLObject body_trappedP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject optimized_statement = ConsesLow.listS( $sym41$WHILE, optimized_test, ConsesLow.append( optimized_body, NIL ) );
    return Values.values( optimized_statement, trappedP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/common-optimization.lisp", position = 19251L)
  public static SubLObject translator_unreachable_optimize_Xfor(final SubLObject statement)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject operator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( statement, statement, $list37 );
    operator = statement.first();
    SubLObject current = statement.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, statement, $list37 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject initializations = NIL;
    SubLObject test = NIL;
    SubLObject updates = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, statement, $list37 );
    initializations = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, statement, $list37 );
    test = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, statement, $list37 );
    updates = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      list_utilities.verify_operator( operator, $sym14$_FOR );
      final SubLObject optimized_test = translator_optimize_form( test );
      SubLObject trappedP = Equality.equal( optimized_test, $list26 );
      thread.resetMultipleValues();
      final SubLObject optimized_initializations = translator_unreachable_optimize_body( initializations );
      final SubLObject initializations_trappedP = thread.secondMultipleValue();
      thread.resetMultipleValues();
      trappedP = makeBoolean( NIL != trappedP || NIL != initializations_trappedP );
      thread.resetMultipleValues();
      final SubLObject optimized_updates = translator_unreachable_optimize_body( updates );
      final SubLObject updates_trappedP = thread.secondMultipleValue();
      thread.resetMultipleValues();
      thread.resetMultipleValues();
      final SubLObject optimized_body = translator_unreachable_optimize_body( body );
      final SubLObject body_trappedP = thread.secondMultipleValue();
      thread.resetMultipleValues();
      final SubLObject optimized_statement = ConsesLow.listS( $sym14$_FOR, ConsesLow.list( optimized_initializations, optimized_test, optimized_updates ), ConsesLow.append( optimized_body, NIL ) );
      return Values.values( optimized_statement, trappedP );
    }
    cdestructuring_bind.cdestructuring_bind_error( statement, $list37 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/common-optimization.lisp", position = 20282L)
  public static SubLObject translator_unreachable_optimize_Xwith_current_thread(final SubLObject statement)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject operator = NIL;
    SubLObject thread_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( statement, statement, $list36 );
    operator = statement.first();
    SubLObject current = statement.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, statement, $list36 );
    thread_var = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    list_utilities.verify_operator( operator, $sym13$_WITH_CURRENT_THREAD );
    thread.resetMultipleValues();
    final SubLObject optimized_body = translator_unreachable_optimize_body( body );
    final SubLObject returnsP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject optimized_statement = ConsesLow.listS( $sym13$_WITH_CURRENT_THREAD, thread_var, ConsesLow.append( optimized_body, NIL ) );
    return Values.values( optimized_statement, returnsP );
  }

  public static SubLObject declare_common_optimization_file()
  {
    SubLFiles.declareFunction( me, "translator_optimize_form", "TRANSLATOR-OPTIMIZE-FORM", 1, 0, false );
    SubLFiles.declareFunction( me, "translator_optimize_body", "TRANSLATOR-OPTIMIZE-BODY", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_identify_sub_progn", "TRANSLATE-IDENTIFY-SUB-PROGN", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_identify_sub_ret", "TRANSLATE-IDENTIFY-SUB-RET", 1, 0, false );
    SubLFiles.declareFunction( me, "translator_optimize_progn", "TRANSLATOR-OPTIMIZE-PROGN", 1, 0, false );
    SubLFiles.declareFunction( me, "translator_body_irrelevant_wrt_bindings", "TRANSLATOR-BODY-IRRELEVANT-WRT-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "translator_body_has_no_definers", "TRANSLATOR-BODY-HAS-NO-DEFINERS", 1, 0, false );
    SubLFiles.declareFunction( me, "definer_form_p", "DEFINER-FORM-P", 1, 0, false );
    SubLFiles.declareFunction( me, "translator_optimize_clet_bind", "TRANSLATOR-OPTIMIZE-CLET-BIND", 1, 0, false );
    SubLFiles.declareFunction( me, "translator_optimize_clet_local", "TRANSLATOR-OPTIMIZE-CLET-LOCAL", 1, 0, false );
    SubLFiles.declareFunction( me, "translator_bindings_overlap", "TRANSLATOR-BINDINGS-OVERLAP", 2, 0, false );
    SubLFiles.declareFunction( me, "translator_optimize_pcond", "TRANSLATOR-OPTIMIZE-PCOND", 1, 0, false );
    SubLFiles.declareFunction( me, "translator_optimize_fif", "TRANSLATOR-OPTIMIZE-FIF", 1, 0, false );
    SubLFiles.declareFunction( me, "translator_optimize_Xdtb", "TRANSLATOR-OPTIMIZE-%DTB", 1, 0, false );
    SubLFiles.declareFunction( me, "translator_optimize_Xbtd", "TRANSLATOR-OPTIMIZE-%BTD", 1, 0, false );
    SubLFiles.declareFunction( me, "translator_optimize_Xnot", "TRANSLATOR-OPTIMIZE-%NOT", 1, 0, false );
    SubLFiles.declareFunction( me, "translator_optimize_Xand", "TRANSLATOR-OPTIMIZE-%AND", 1, 0, false );
    SubLFiles.declareFunction( me, "translator_optimize_Xor", "TRANSLATOR-OPTIMIZE-%OR", 1, 0, false );
    SubLFiles.declareFunction( me, "translator_optimize_Xtry", "TRANSLATOR-OPTIMIZE-%TRY", 1, 0, false );
    SubLFiles.declareFunction( me, "translator_optimize_Xcunwind_protect", "TRANSLATOR-OPTIMIZE-%CUNWIND-PROTECT", 1, 0, false );
    SubLFiles.declareFunction( me, "translator_optimize_Xwith_current_thread", "TRANSLATOR-OPTIMIZE-%WITH-CURRENT-THREAD", 1, 0, false );
    SubLFiles.declareFunction( me, "translator_optimize_Xfor", "TRANSLATOR-OPTIMIZE-%FOR", 1, 0, false );
    SubLFiles.declareFunction( me, "translator_unreachable_optimize_body", "TRANSLATOR-UNREACHABLE-OPTIMIZE-BODY", 1, 0, false );
    SubLFiles.declareFunction( me, "translator_ret_optimize_body", "TRANSLATOR-RET-OPTIMIZE-BODY", 1, 0, false );
    SubLFiles.declareFunction( me, "translator_unreachable_optimize_statement", "TRANSLATOR-UNREACHABLE-OPTIMIZE-STATEMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "translator_unreachable_optimize_progn", "TRANSLATOR-UNREACHABLE-OPTIMIZE-PROGN", 1, 0, false );
    SubLFiles.declareFunction( me, "translator_unreachable_optimize_pcond", "TRANSLATOR-UNREACHABLE-OPTIMIZE-PCOND", 1, 0, false );
    SubLFiles.declareFunction( me, "translator_unreachable_optimize_clet_local", "TRANSLATOR-UNREACHABLE-OPTIMIZE-CLET-LOCAL", 1, 0, false );
    SubLFiles.declareFunction( me, "translator_unreachable_optimize_clet_bind", "TRANSLATOR-UNREACHABLE-OPTIMIZE-CLET-BIND", 1, 0, false );
    SubLFiles.declareFunction( me, "translator_unreachable_optimize_cprogv", "TRANSLATOR-UNREACHABLE-OPTIMIZE-CPROGV", 1, 0, false );
    SubLFiles.declareFunction( me, "translator_unreachable_optimize_Xcunwind_protect", "TRANSLATOR-UNREACHABLE-OPTIMIZE-%CUNWIND-PROTECT", 1, 0, false );
    SubLFiles.declareFunction( me, "translator_unreachable_optimize_while", "TRANSLATOR-UNREACHABLE-OPTIMIZE-WHILE", 1, 0, false );
    SubLFiles.declareFunction( me, "translator_unreachable_optimize_Xfor", "TRANSLATOR-UNREACHABLE-OPTIMIZE-%FOR", 1, 0, false );
    SubLFiles.declareFunction( me, "translator_unreachable_optimize_Xwith_current_thread", "TRANSLATOR-UNREACHABLE-OPTIMIZE-%WITH-CURRENT-THREAD", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_common_optimization_file()
  {
    return NIL;
  }

  public static SubLObject setup_common_optimization_file()
  {
    access_macros.define_obsolete_register( $sym38$TRANSLATOR_RET_OPTIMIZE_BODY, $list39 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_common_optimization_file();
  }

  @Override
  public void initializeVariables()
  {
    init_common_optimization_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_common_optimization_file();
  }
  static
  {
    me = new common_optimization();
    $list0 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "&REST" ), makeSymbol( "ARGS" ) );
    $sym1$PROGN = makeSymbol( "PROGN" );
    $sym2$CLET_LOCAL = makeSymbol( "CLET-LOCAL" );
    $sym3$CLET_BIND = makeSymbol( "CLET-BIND" );
    $sym4$PCOND = makeSymbol( "PCOND" );
    $sym5$FIF = makeSymbol( "FIF" );
    $sym6$_DTB = makeSymbol( "%DTB" );
    $sym7$_BTD = makeSymbol( "%BTD" );
    $sym8$_NOT = makeSymbol( "%NOT" );
    $sym9$_AND = makeSymbol( "%AND" );
    $sym10$_OR = makeSymbol( "%OR" );
    $sym11$_TRY = makeSymbol( "%TRY" );
    $sym12$_CUNWIND_PROTECT = makeSymbol( "%CUNWIND-PROTECT" );
    $sym13$_WITH_CURRENT_THREAD = makeSymbol( "%WITH-CURRENT-THREAD" );
    $sym14$_FOR = makeSymbol( "%FOR" );
    $list15 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "&BODY" ), makeSymbol( "SUB-BODY" ) );
    $sym16$RET = makeSymbol( "RET" );
    $list17 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list18 = ConsesLow.list( makeSymbol( "SUBFORM" ), makeSymbol( "&BODY" ), makeSymbol( "REST-BODY" ) );
    $list19 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "BINDINGS" ), makeSymbol( "&BODY" ), makeSymbol( "SUB-BODY" ) );
    $list20 = ConsesLow.list( makeSymbol( "DEFINE" ), makeSymbol( "DEFINE-MACROEXPANDER" ), makeSymbol( "DEFVAR" ), makeSymbol( "DEFPARAMETER" ), makeSymbol( "DEFLEXICAL" ), makeSymbol( "DEFCONSTANT" ) );
    $list21 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "BINDINGS" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list22 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "SUB-BINDINGS" ), makeSymbol( "&BODY" ), makeSymbol( "SUB-BODY" ) );
    $list23 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "&REST" ), makeSymbol( "CLAUSES" ) );
    $list24 = ConsesLow.list( makeSymbol( "CONDITION" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list25 = ConsesLow.list( makeSymbol( "%NC" ), makeSymbol( "%FALSE" ) );
    $list26 = ConsesLow.list( makeSymbol( "%NC" ), makeSymbol( "%TRUE" ) );
    $list27 = ConsesLow.list( makeSymbol( "PROGN" ) );
    $list28 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "CONDITION" ), makeSymbol( "TRUE-VALUE" ), makeSymbol( "FALSE-VALUE" ) );
    $list29 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "CONDITION" ) );
    $list30 = ConsesLow.list( makeSymbol( "%PC" ), T );
    $list31 = ConsesLow.list( makeSymbol( "%PC" ), NIL );
    $list32 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "EXPRESSION" ) );
    $list33 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "&REST" ), makeSymbol( "EXPRESSIONS" ) );
    $list34 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "TRY-FORM" ), makeSymbol( "CATCH-CLAUSES" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list35 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "ENV-VAR" ), makeSymbol( "PROTECTED-FORM" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list36 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "THREAD-VAR" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list37 = ConsesLow.list( makeSymbol( "OPERATOR" ), ConsesLow.list( makeSymbol( "INITIALIZATIONS" ), makeSymbol( "TEST" ), makeSymbol( "UPDATES" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym38$TRANSLATOR_RET_OPTIMIZE_BODY = makeSymbol( "TRANSLATOR-RET-OPTIMIZE-BODY" );
    $list39 = ConsesLow.list( makeSymbol( "TRANSLATOR-UNREACHABLE-OPTIMIZE-BODY" ) );
    $sym40$CPROGV = makeSymbol( "CPROGV" );
    $sym41$WHILE = makeSymbol( "WHILE" );
    $list42 = ConsesLow.list( makeSymbol( "CLAUSE-EXPRESSION" ), makeSymbol( "&BODY" ), makeSymbol( "CLAUSE-BODY" ) );
    $list43 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "LOCAL-BINDINGS" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list44 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "DYNAMIC-BINDINGS" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list45 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "SPECIAL-VARS" ), makeSymbol( "BINDINGS" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list46 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "TEST" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
  }
}
/*
 * 
 * Total time: 221 ms
 * 
 */