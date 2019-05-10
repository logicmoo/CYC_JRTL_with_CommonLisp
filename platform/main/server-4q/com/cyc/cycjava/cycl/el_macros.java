package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class el_macros
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.el_macros";
  public static final String myFingerPrint = "73bd8e7f8016851e62e076ec451c07e0d9b0e2f5cebd7dc2fd1d33bfb749b99b";
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$TEMPFORMULA;
  private static final SubLSymbol $sym2$CLET;
  private static final SubLSymbol $sym3$FIF;
  private static final SubLSymbol $sym4$SEQUENCE_VAR;
  private static final SubLSymbol $sym5$STRIP_SEQUENCE_VAR;
  private static final SubLSymbol $sym6$SEQVAR;
  private static final SubLSymbol $sym7$TEMPFORMULA;
  private static final SubLSymbol $sym8$APPEND;
  private static final SubLSymbol $sym9$LIST;
  private static final SubLList $list10;
  private static final SubLSymbol $sym11$SEQVAR;
  private static final SubLSymbol $sym12$TEMPFORMULA;
  private static final SubLList $list13;
  private static final SubLSymbol $sym14$PIF;
  private static final SubLSymbol $sym15$RET;
  private static final SubLSymbol $sym16$NADD_SEQUENCE_VAR_TO_END;
  private static final SubLSymbol $sym17$SEQVAR;
  private static final SubLSymbol $sym18$TEMPFORMULA;
  private static final SubLList $list19;
  private static final SubLList $list20;
  private static final SubLSymbol $kw21$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw22$ARGNUM;
  private static final SubLSymbol $kw23$SEQVAR_HANDLING;
  private static final SubLSymbol $kw24$IGNORE;
  private static final SubLSymbol $kw25$DONE;
  private static final SubLList $list26;
  private static final SubLSymbol $sym27$DO_FORMULA_ARGS;
  private static final SubLSymbol $sym28$CINC;
  private static final SubLSymbol $sym29$ARGS;
  private static final SubLSymbol $sym30$FORMULA_ARGS;
  private static final SubLSymbol $sym31$DO_LIST;
  private static final SubLList $list32;
  private static final SubLList $list33;
  private static final SubLList $list34;
  private static final SubLList $list35;
  private static final SubLSymbol $sym36$DO_FORMULA_ARGS_NUMBERED;
  private static final SubLList $list37;
  private static final SubLSymbol $sym38$TERMS;
  private static final SubLSymbol $sym39$FORMULA_TERMS;
  private static final SubLSymbol $sym40$DO_LIST_INDEX;
  private static final SubLSymbol $sym41$TERMS;
  private static final SubLList $list42;
  private static final SubLSymbol $sym43$DO_FORMULA_TERMS;
  private static final SubLList $list44;
  private static final SubLList $list45;
  private static final SubLSymbol $sym46$DO_FORMULA_TERMS_NUMBERED;
  private static final SubLList $list47;
  private static final SubLSymbol $sym48$ARGS;
  private static final SubLSymbol $sym49$LITERAL_ARGS;
  private static final SubLList $list50;
  private static final SubLSymbol $sym51$ARGS;
  private static final SubLSymbol $sym52$LIST_VAR;
  private static final SubLSymbol $sym53$CDO;
  private static final SubLSymbol $sym54$CDR;
  private static final SubLSymbol $sym55$CAR;
  private static final SubLSymbol $sym56$_;
  private static final SubLSymbol $sym57$COR;
  private static final SubLSymbol $sym58$NULL;
  private static final SubLList $list59;
  private static final SubLSymbol $sym60$TERMS;
  private static final SubLSymbol $sym61$LITERAL_TERMS;
  private static final SubLList $list62;
  private static final SubLSymbol $sym63$TERMS;
  private static final SubLSymbol $sym64$LIST_VAR;
  private static final SubLList $list65;
  private static final SubLSymbol $sym66$STACK;
  private static final SubLSymbol $sym67$ENTRY;
  private static final SubLList $list68;
  private static final SubLSymbol $sym69$STACK_PUSH;
  private static final SubLSymbol $sym70$UNTIL;
  private static final SubLSymbol $sym71$STACK_EMPTY_P;
  private static final SubLSymbol $sym72$STACK_POP;
  private static final SubLSymbol $sym73$PWHEN;
  private static final SubLSymbol $sym74$LITERAL_;
  private static final SubLSymbol $sym75$PROGN;
  private static final SubLSymbol $sym76$CSETQ;
  private static final SubLSymbol $sym77$CDOLIST;
  private static final SubLSymbol $sym78$ARG;
  private static final SubLList $list79;
  private static final SubLSymbol $sym80$STACK;
  private static final SubLSymbol $sym81$ENTRY;
  private static final SubLList $list82;
  private static final SubLSymbol $sym83$ARG_STACK;
  private static final SubLSymbol $sym84$POS_STACK;
  private static final SubLSymbol $sym85$ENTRY;
  private static final SubLSymbol $sym86$POS_ENTRY;
  private static final SubLSymbol $sym87$ARG_NUM;
  private static final SubLSymbol $sym88$SNOC;
  private static final SubLList $list89;
  private static final SubLList $list90;
  private static final SubLSymbol $sym91$WITHOUT_WFF_SEMANTICS;
  private static final SubLList $list92;
  private static final SubLSymbol $sym93$WITHOUT_WFF_SEMANTICS_OR_ARITY;
  private static final SubLSymbol $sym94$WITHOUT_GRAMMAR_USING_KB;
  private static final SubLList $list95;
  private static final SubLList $list96;
  private static final SubLList $list97;
  private static final SubLList $list98;
  private static final SubLList $list99;
  private static final SubLList $list100;
  private static final SubLSymbol $sym101$NEG_LITS;
  private static final SubLList $list102;
  private static final SubLSymbol $sym103$DO_NEG_LITS;
  private static final SubLSymbol $sym104$POS_LITS;
  private static final SubLSymbol $sym105$DO_POS_LITS;
  private static final SubLList $list106;
  private static final SubLList $list107;
  private static final SubLSymbol $kw108$SENSE;
  private static final SubLSymbol $kw109$POS;
  private static final SubLSymbol $kw110$NEG;
  private static final SubLSymbol $sym111$DO_ALL_LITS_AS_ASENTS;
  private static final SubLSymbol $sym112$PCOND;
  private static final SubLSymbol $sym113$ERROR;
  private static final SubLString $str114$Invalid_sense__s;
  private static final SubLList $list115;
  private static final SubLSymbol $sym116$DO_NEG_LITS_NUMBERED;
  private static final SubLList $list117;
  private static final SubLSymbol $sym118$DO_POS_LITS_NUMBERED;
  private static final SubLList $list119;
  private static final SubLList $list120;
  private static final SubLSymbol $sym121$INDEX_VAR;
  private static final SubLSymbol $sym122$DO_LITERALS_NUMBERED;
  private static final SubLSymbol $sym123$IGNORE;
  private static final SubLList $list124;
  private static final SubLList $list125;
  private static final SubLSymbol $kw126$SENSE_VAR;
  private static final SubLSymbol $sym127$CLAUSE;
  private static final SubLList $list128;
  private static final SubLSymbol $sym129$CLAUSE;
  private static final SubLSymbol $sym130$CDOLIST_NUMBERED;
  private static final SubLList $list131;
  private static final SubLSymbol $sym132$CDESTRUCTURING_BIND;

  @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 791L)
  public static SubLObject ignoring_sequence_vars(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject formula = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    formula = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject tempformula = $sym1$TEMPFORMULA;
      return ConsesLow.listS( $sym2$CLET, ConsesLow.list( ConsesLow.list( tempformula, ConsesLow.list( $sym3$FIF, ConsesLow.list( $sym4$SEQUENCE_VAR, formula ), ConsesLow.list( $sym5$STRIP_SEQUENCE_VAR, formula ),
          formula ) ), ConsesLow.list( formula, tempformula ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 1231L)
  public static SubLObject regularizing_sequence_vars(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject formula = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    formula = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject seqvar = $sym6$SEQVAR;
      final SubLObject tempformula = $sym7$TEMPFORMULA;
      return ConsesLow.listS( $sym2$CLET, ConsesLow.list( ConsesLow.list( seqvar, ConsesLow.list( $sym4$SEQUENCE_VAR, formula ) ), ConsesLow.list( tempformula, ConsesLow.list( $sym3$FIF, seqvar, ConsesLow.list(
          $sym8$APPEND, ConsesLow.list( $sym5$STRIP_SEQUENCE_VAR, formula ), ConsesLow.list( $sym9$LIST, seqvar ) ), formula ) ), ConsesLow.list( formula, tempformula ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 1739L)
  public static SubLObject return_after_ignoring_sequence_vars(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list10 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject formula = NIL;
    SubLObject result = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list10 );
    formula = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list10 );
    result = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject seqvar = $sym11$SEQVAR;
      final SubLObject tempformula = $sym12$TEMPFORMULA;
      return ConsesLow.listS( $sym2$CLET, ConsesLow.list( ConsesLow.list( seqvar, ConsesLow.list( $sym4$SEQUENCE_VAR, formula ) ), ConsesLow.list( tempformula, formula ), ConsesLow.list( formula, ConsesLow.list(
          $sym3$FIF, seqvar, ConsesLow.list( $sym5$STRIP_SEQUENCE_VAR, tempformula ), tempformula ) ), reader.bq_cons( result, $list13 ) ), ConsesLow.append( body, ConsesLow.list( ConsesLow.list( $sym14$PIF, seqvar,
              ConsesLow.list( $sym15$RET, ConsesLow.list( $sym16$NADD_SEQUENCE_VAR_TO_END, seqvar, result ) ), ConsesLow.list( $sym15$RET, result ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list10 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 2252L)
  public static SubLObject return_after_regularizing_sequence_vars(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list10 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject formula = NIL;
    SubLObject result = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list10 );
    formula = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list10 );
    result = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject seqvar = $sym17$SEQVAR;
      final SubLObject tempformula = $sym18$TEMPFORMULA;
      return ConsesLow.listS( $sym2$CLET, ConsesLow.list( ConsesLow.list( seqvar, ConsesLow.list( $sym4$SEQUENCE_VAR, formula ) ), ConsesLow.list( tempformula, ConsesLow.list( $sym3$FIF, seqvar, ConsesLow.list(
          $sym8$APPEND, ConsesLow.list( $sym5$STRIP_SEQUENCE_VAR, formula ), ConsesLow.list( $sym9$LIST, seqvar ) ), formula ) ), ConsesLow.list( formula, tempformula ), reader.bq_cons( result, $list13 ) ), ConsesLow
              .append( body, ConsesLow.list( ConsesLow.list( $sym14$PIF, seqvar, ConsesLow.list( $sym15$RET, ConsesLow.list( $sym16$NADD_SEQUENCE_VAR_TO_END, seqvar, ConsesLow.list( $sym5$STRIP_SEQUENCE_VAR,
                  result ) ) ), ConsesLow.list( $sym15$RET, result ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list10 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 2813L)
  public static SubLObject do_formula_args(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list19 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject arg_var = NIL;
    SubLObject formula = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list19 );
    arg_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list19 );
    formula = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list19 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list19 );
      if( NIL == conses_high.member( current_$1, $list20, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw21$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list19 );
    }
    final SubLObject argnum_tail = cdestructuring_bind.property_list_member( $kw22$ARGNUM, current );
    final SubLObject argnum = ( NIL != argnum_tail ) ? conses_high.cadr( argnum_tail ) : NIL;
    final SubLObject seqvar_handling_tail = cdestructuring_bind.property_list_member( $kw23$SEQVAR_HANDLING, current );
    final SubLObject seqvar_handling = ( NIL != seqvar_handling_tail ) ? conses_high.cadr( seqvar_handling_tail ) : $kw24$IGNORE;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw25$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    if( NIL != argnum )
    {
      return ConsesLow.list( $sym2$CLET, ConsesLow.list( reader.bq_cons( argnum, $list26 ) ), ConsesLow.listS( $sym27$DO_FORMULA_ARGS, ConsesLow.list( arg_var, formula, $kw23$SEQVAR_HANDLING, seqvar_handling, $kw25$DONE,
          done ), ConsesLow.list( $sym28$CINC, argnum ), ConsesLow.append( body, NIL ) ) );
    }
    final SubLObject args = $sym29$ARGS;
    return ConsesLow.list( $sym2$CLET, ConsesLow.list( ConsesLow.list( args, ConsesLow.list( $sym30$FORMULA_ARGS, formula, seqvar_handling ) ) ), ConsesLow.listS( $sym31$DO_LIST, ConsesLow.list( arg_var, args,
        $kw25$DONE, done ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 3535L)
  public static SubLObject do_formula_args_numbered(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list32 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject arg_var = NIL;
    SubLObject argnum_var = NIL;
    SubLObject formula = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list32 );
    arg_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list32 );
    argnum_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list32 );
    formula = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$2 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list32 );
      current_$2 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list32 );
      if( NIL == conses_high.member( current_$2, $list33, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$2 == $kw21$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list32 );
    }
    final SubLObject seqvar_handling_tail = cdestructuring_bind.property_list_member( $kw23$SEQVAR_HANDLING, current );
    final SubLObject seqvar_handling = ( NIL != seqvar_handling_tail ) ? conses_high.cadr( seqvar_handling_tail ) : $kw24$IGNORE;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw25$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym27$DO_FORMULA_ARGS, ConsesLow.list( arg_var, formula, $kw22$ARGNUM, argnum_var, $kw23$SEQVAR_HANDLING, seqvar_handling, $kw25$DONE, done ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 3970L)
  public static SubLObject some_el_formula_args(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list34 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject arg_var = NIL;
    SubLObject formula = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list34 );
    arg_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list34 );
    formula = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list34 );
    current = current.rest();
    final SubLObject seqvar_handling = current.isCons() ? current.first() : $kw24$IGNORE;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list34 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym27$DO_FORMULA_ARGS, ConsesLow.list( arg_var, formula, $kw23$SEQVAR_HANDLING, seqvar_handling, $kw25$DONE, done_var ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list34 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 4361L)
  public static SubLObject some_el_formula_args_numbered(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject arg_var = NIL;
    SubLObject argnum_var = NIL;
    SubLObject formula = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
    arg_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
    argnum_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
    formula = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list35 );
    current = current.rest();
    final SubLObject seqvar_handling = current.isCons() ? current.first() : $kw24$IGNORE;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list35 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym36$DO_FORMULA_ARGS_NUMBERED, ConsesLow.list( arg_var, argnum_var, formula, $kw23$SEQVAR_HANDLING, seqvar_handling, $kw25$DONE, done_var ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list35 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 4876L)
  public static SubLObject do_formula_terms(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list37 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject term_var = NIL;
    SubLObject formula = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list37 );
    term_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list37 );
    formula = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$3 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list37 );
      current_$3 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list37 );
      if( NIL == conses_high.member( current_$3, $list20, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$3 == $kw21$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list37 );
    }
    final SubLObject argnum_tail = cdestructuring_bind.property_list_member( $kw22$ARGNUM, current );
    final SubLObject argnum = ( NIL != argnum_tail ) ? conses_high.cadr( argnum_tail ) : NIL;
    final SubLObject seqvar_handling_tail = cdestructuring_bind.property_list_member( $kw23$SEQVAR_HANDLING, current );
    final SubLObject seqvar_handling = ( NIL != seqvar_handling_tail ) ? conses_high.cadr( seqvar_handling_tail ) : $kw24$IGNORE;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw25$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    if( NIL != argnum )
    {
      final SubLObject terms = $sym38$TERMS;
      return ConsesLow.list( $sym2$CLET, ConsesLow.list( ConsesLow.list( terms, ConsesLow.list( $sym39$FORMULA_TERMS, formula, seqvar_handling ) ) ), ConsesLow.listS( $sym40$DO_LIST_INDEX, ConsesLow.list( argnum,
          term_var, terms, $kw25$DONE, done ), ConsesLow.append( body, NIL ) ) );
    }
    final SubLObject terms = $sym41$TERMS;
    return ConsesLow.list( $sym2$CLET, ConsesLow.list( ConsesLow.list( terms, ConsesLow.list( $sym39$FORMULA_TERMS, formula, seqvar_handling ) ) ), ConsesLow.listS( $sym31$DO_LIST, ConsesLow.list( term_var, terms,
        $kw25$DONE, done ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 5601L)
  public static SubLObject do_formula_terms_numbered(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list42 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject term_var = NIL;
    SubLObject argnum_var = NIL;
    SubLObject formula = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list42 );
    term_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list42 );
    argnum_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list42 );
    formula = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$4 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list42 );
      current_$4 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list42 );
      if( NIL == conses_high.member( current_$4, $list33, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$4 == $kw21$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list42 );
    }
    final SubLObject seqvar_handling_tail = cdestructuring_bind.property_list_member( $kw23$SEQVAR_HANDLING, current );
    final SubLObject seqvar_handling = ( NIL != seqvar_handling_tail ) ? conses_high.cadr( seqvar_handling_tail ) : $kw24$IGNORE;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw25$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym43$DO_FORMULA_TERMS, ConsesLow.list( term_var, formula, $kw22$ARGNUM, argnum_var, $kw23$SEQVAR_HANDLING, seqvar_handling, $kw25$DONE, done ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 6047L)
  public static SubLObject some_el_formula_terms(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list44 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject term_var = NIL;
    SubLObject formula = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list44 );
    term_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list44 );
    formula = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list44 );
    current = current.rest();
    final SubLObject seqvar_handling = current.isCons() ? current.first() : $kw24$IGNORE;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list44 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym43$DO_FORMULA_TERMS, ConsesLow.list( term_var, formula, $kw23$SEQVAR_HANDLING, seqvar_handling, $kw25$DONE, done_var ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list44 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 6450L)
  public static SubLObject some_el_formula_terms_numbered(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list45 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject term_var = NIL;
    SubLObject argnum_var = NIL;
    SubLObject formula = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list45 );
    term_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list45 );
    argnum_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list45 );
    formula = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list45 );
    current = current.rest();
    final SubLObject seqvar_handling = current.isCons() ? current.first() : $kw24$IGNORE;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list45 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym46$DO_FORMULA_TERMS_NUMBERED, ConsesLow.list( term_var, argnum_var, formula, $kw23$SEQVAR_HANDLING, seqvar_handling, $kw25$DONE, done_var ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list45 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 6978L)
  public static SubLObject some_el_literal_args(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list47 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject arg_var = NIL;
    SubLObject literal = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list47 );
    arg_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list47 );
    literal = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list47 );
    current = current.rest();
    final SubLObject seqvar_handling = current.isCons() ? current.first() : $kw24$IGNORE;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list47 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject args = $sym48$ARGS;
      return ConsesLow.list( $sym2$CLET, ConsesLow.list( ConsesLow.list( args, ConsesLow.list( $sym49$LITERAL_ARGS, literal, seqvar_handling ) ) ), ConsesLow.listS( $sym31$DO_LIST, ConsesLow.list( arg_var, args,
          $kw25$DONE, done_var ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list47 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 7423L)
  public static SubLObject some_el_literal_args_numbered(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list50 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject arg_var = NIL;
    SubLObject argnum_var = NIL;
    SubLObject literal = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list50 );
    arg_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list50 );
    argnum_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list50 );
    literal = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list50 );
    current = current.rest();
    final SubLObject seqvar_handling = current.isCons() ? current.first() : $kw24$IGNORE;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list50 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject args = $sym51$ARGS;
      final SubLObject list_var = $sym52$LIST_VAR;
      return ConsesLow.list( $sym2$CLET, ConsesLow.list( ConsesLow.list( args, ConsesLow.list( $sym49$LITERAL_ARGS, literal, seqvar_handling ) ) ), ConsesLow.listS( $sym53$CDO, ConsesLow.list( ConsesLow.list( list_var,
          args, ConsesLow.list( $sym54$CDR, list_var ) ), ConsesLow.list( arg_var, ConsesLow.list( $sym55$CAR, list_var ), ConsesLow.list( $sym55$CAR, list_var ) ), ConsesLow.list( argnum_var, ONE_INTEGER, ConsesLow
              .list( $sym56$_, ONE_INTEGER, argnum_var ) ) ), ConsesLow.list( ConsesLow.list( $sym57$COR, done_var, ConsesLow.list( $sym58$NULL, list_var ) ) ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list50 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 8016L)
  public static SubLObject some_el_literal_terms(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list59 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject term_var = NIL;
    SubLObject literal = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list59 );
    term_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list59 );
    literal = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list59 );
    current = current.rest();
    final SubLObject seqvar_handling = current.isCons() ? current.first() : $kw24$IGNORE;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list59 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject terms = $sym60$TERMS;
      return ConsesLow.list( $sym2$CLET, ConsesLow.list( ConsesLow.list( terms, ConsesLow.list( $sym61$LITERAL_TERMS, literal, seqvar_handling ) ) ), ConsesLow.listS( $sym31$DO_LIST, ConsesLow.list( term_var, terms,
          $kw25$DONE, done_var ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list59 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 8477L)
  public static SubLObject some_el_literal_terms_numbered(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list62 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject term_var = NIL;
    SubLObject argnum_var = NIL;
    SubLObject literal = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list62 );
    term_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list62 );
    argnum_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list62 );
    literal = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list62 );
    current = current.rest();
    final SubLObject seqvar_handling = current.isCons() ? current.first() : $kw24$IGNORE;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list62 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject terms = $sym63$TERMS;
      final SubLObject list_var = $sym64$LIST_VAR;
      return ConsesLow.list( $sym2$CLET, ConsesLow.list( ConsesLow.list( terms, ConsesLow.list( $sym61$LITERAL_TERMS, literal, seqvar_handling ) ) ), ConsesLow.listS( $sym53$CDO, ConsesLow.list( ConsesLow.list( list_var,
          terms, ConsesLow.list( $sym54$CDR, list_var ) ), ConsesLow.list( term_var, ConsesLow.list( $sym55$CAR, list_var ), ConsesLow.list( $sym55$CAR, list_var ) ), ConsesLow.list( argnum_var, ZERO_INTEGER, ConsesLow
              .list( $sym56$_, ONE_INTEGER, argnum_var ) ) ), ConsesLow.list( ConsesLow.list( $sym57$COR, done_var, ConsesLow.list( $sym58$NULL, list_var ) ) ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list62 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 9084L)
  public static SubLObject do_el_formula_literals(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list65 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject literal = NIL;
    SubLObject formula = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list65 );
    literal = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list65 );
    formula = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject stack = $sym66$STACK;
      final SubLObject entry = $sym67$ENTRY;
      return ConsesLow.list( $sym2$CLET, ConsesLow.list( reader.bq_cons( stack, $list68 ), literal ), ConsesLow.list( $sym69$STACK_PUSH, formula, stack ), ConsesLow.list( $sym70$UNTIL, ConsesLow.list(
          $sym71$STACK_EMPTY_P, stack ), ConsesLow.list( $sym2$CLET, ConsesLow.list( ConsesLow.list( entry, ConsesLow.list( $sym72$STACK_POP, stack ) ) ), ConsesLow.list( $sym73$PWHEN, ConsesLow.list( $sym74$LITERAL_,
              entry ), ConsesLow.listS( $sym75$PROGN, ConsesLow.list( $sym76$CSETQ, literal, entry ), ConsesLow.append( body, NIL ) ) ), ConsesLow.list( $sym77$CDOLIST, ConsesLow.list( $sym78$ARG, ConsesLow.list(
                  $sym30$FORMULA_ARGS, entry ) ), ConsesLow.list( $sym69$STACK_PUSH, $sym78$ARG, stack ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list65 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 9643L)
  public static SubLObject do_el_formula_args_recursive(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list79 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject arg = NIL;
    SubLObject formula = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list79 );
    arg = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list79 );
    formula = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject stack = $sym80$STACK;
      final SubLObject entry = $sym81$ENTRY;
      return ConsesLow.list( $sym2$CLET, ConsesLow.list( reader.bq_cons( stack, $list68 ), arg ), ConsesLow.list( $sym69$STACK_PUSH, formula, stack ), ConsesLow.list( $sym70$UNTIL, ConsesLow.list( $sym71$STACK_EMPTY_P,
          stack ), ConsesLow.list( $sym2$CLET, ConsesLow.list( ConsesLow.list( entry, ConsesLow.list( $sym72$STACK_POP, stack ) ) ), ConsesLow.listS( $sym75$PROGN, ConsesLow.list( $sym76$CSETQ, arg, entry ), ConsesLow
              .append( body, NIL ) ), ConsesLow.list( $sym77$CDOLIST, ConsesLow.list( $sym78$ARG, ConsesLow.list( $sym30$FORMULA_ARGS, entry ) ), ConsesLow.list( $sym69$STACK_PUSH, $sym78$ARG, stack ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list79 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 10191L)
  public static SubLObject do_formula_terms_and_positions_recursive(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list82 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject arg = NIL;
    SubLObject argpos = NIL;
    SubLObject formula = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list82 );
    arg = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list82 );
    argpos = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list82 );
    formula = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject arg_stack = $sym83$ARG_STACK;
      final SubLObject pos_stack = $sym84$POS_STACK;
      final SubLObject entry = $sym85$ENTRY;
      final SubLObject pos_entry = $sym86$POS_ENTRY;
      final SubLObject arg_num = $sym87$ARG_NUM;
      return ConsesLow.list( $sym2$CLET, ConsesLow.list( reader.bq_cons( arg_stack, $list68 ), reader.bq_cons( pos_stack, $list68 ), arg, argpos ), ConsesLow.list( $sym69$STACK_PUSH, formula, arg_stack ), ConsesLow.list(
          $sym69$STACK_PUSH, argpos, pos_stack ), ConsesLow.list( $sym70$UNTIL, ConsesLow.list( $sym71$STACK_EMPTY_P, arg_stack ), ConsesLow.list( $sym2$CLET, ConsesLow.list( ConsesLow.list( entry, ConsesLow.list(
              $sym72$STACK_POP, arg_stack ) ), ConsesLow.list( pos_entry, ConsesLow.list( $sym72$STACK_POP, pos_stack ) ) ), ConsesLow.listS( $sym75$PROGN, ConsesLow.list( $sym76$CSETQ, arg, entry ), ConsesLow.list(
                  $sym76$CSETQ, argpos, pos_entry ), ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym46$DO_FORMULA_TERMS_NUMBERED, ConsesLow.list( $sym78$ARG, arg_num, entry ), ConsesLow.list( $sym69$STACK_PUSH,
                      $sym78$ARG, arg_stack ), ConsesLow.list( $sym69$STACK_PUSH, ConsesLow.list( $sym88$SNOC, arg_num, argpos ), pos_stack ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list82 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 11067L)
  public static SubLObject without_wff_semantics(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym2$CLET, $list89, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 11659L)
  public static SubLObject with_wff_semantics(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym2$CLET, $list90, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 11877L)
  public static SubLObject without_wff_semantics_or_arity(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym91$WITHOUT_WFF_SEMANTICS, ConsesLow.listS( $sym2$CLET, $list92, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 12109L)
  public static SubLObject without_wff_semantics_or_arity_or_kb(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym93$WITHOUT_WFF_SEMANTICS_OR_ARITY, reader.bq_cons( $sym94$WITHOUT_GRAMMAR_USING_KB, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 12422L)
  public static SubLObject with_el_var_namespace(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym2$CLET, $list95, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 12827L)
  public static SubLObject with_clean_el_var_namespace(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym2$CLET, $list96, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 13137L)
  public static SubLObject without_encapsulation(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym2$CLET, $list97, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 13362L)
  public static SubLObject do_clauses(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list98 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject clause_var = NIL;
    SubLObject v_clauses = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list98 );
    clause_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list98 );
    v_clauses = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$5 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list98 );
      current_$5 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list98 );
      if( NIL == conses_high.member( current_$5, $list99, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$5 == $kw21$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list98 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw25$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym31$DO_LIST, ConsesLow.list( clause_var, v_clauses, $kw25$DONE, done ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 13524L)
  public static SubLObject do_neg_lits(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list100 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject lit_var = NIL;
    SubLObject cnf = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list100 );
    lit_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list100 );
    cnf = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$6 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list100 );
      current_$6 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list100 );
      if( NIL == conses_high.member( current_$6, $list99, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$6 == $kw21$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list100 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw25$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym31$DO_LIST, ConsesLow.list( lit_var, ConsesLow.list( $sym101$NEG_LITS, cnf ), $kw25$DONE, done ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 13699L)
  public static SubLObject do_neg_lits_numbered(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list102 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject lit_var = NIL;
    SubLObject index = NIL;
    SubLObject cnf = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list102 );
    lit_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list102 );
    index = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list102 );
    cnf = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$7 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list102 );
      current_$7 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list102 );
      if( NIL == conses_high.member( current_$7, $list99, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$7 == $kw21$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list102 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw25$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.list( $sym2$CLET, ConsesLow.list( reader.bq_cons( index, $list26 ) ), ConsesLow.listS( $sym103$DO_NEG_LITS, ConsesLow.list( lit_var, cnf, $kw25$DONE, done ), ConsesLow.append( body, ConsesLow.list(
        ConsesLow.list( $sym28$CINC, index ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 13926L)
  public static SubLObject do_pos_lits(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list100 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject lit_var = NIL;
    SubLObject cnf = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list100 );
    lit_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list100 );
    cnf = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$8 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list100 );
      current_$8 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list100 );
      if( NIL == conses_high.member( current_$8, $list99, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$8 == $kw21$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list100 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw25$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym31$DO_LIST, ConsesLow.list( lit_var, ConsesLow.list( $sym104$POS_LITS, cnf ), $kw25$DONE, done ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 14101L)
  public static SubLObject do_pos_lits_numbered(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list102 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject lit_var = NIL;
    SubLObject index = NIL;
    SubLObject cnf = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list102 );
    lit_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list102 );
    index = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list102 );
    cnf = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$9 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list102 );
      current_$9 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list102 );
      if( NIL == conses_high.member( current_$9, $list99, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$9 == $kw21$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list102 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw25$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.list( $sym2$CLET, ConsesLow.list( reader.bq_cons( index, $list26 ) ), ConsesLow.listS( $sym105$DO_POS_LITS, ConsesLow.list( lit_var, cnf, $kw25$DONE, done ), ConsesLow.append( body, ConsesLow.list(
        ConsesLow.list( $sym28$CINC, index ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 14328L)
  public static SubLObject do_all_lits_as_asents(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list106 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject lit_var = NIL;
    SubLObject clause = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list106 );
    lit_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list106 );
    clause = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$10 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list106 );
      current_$10 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list106 );
      if( NIL == conses_high.member( current_$10, $list107, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$10 == $kw21$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list106 );
    }
    final SubLObject sense_tail = cdestructuring_bind.property_list_member( $kw108$SENSE, current );
    final SubLObject sense = ( NIL != sense_tail ) ? conses_high.cadr( sense_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw25$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    if( $kw109$POS == sense )
    {
      return ConsesLow.listS( $sym105$DO_POS_LITS, ConsesLow.list( lit_var, clause, $kw25$DONE, done ), ConsesLow.append( body, NIL ) );
    }
    if( $kw110$NEG == sense )
    {
      return ConsesLow.listS( $sym103$DO_NEG_LITS, ConsesLow.list( lit_var, clause, $kw25$DONE, done ), ConsesLow.append( body, NIL ) );
    }
    if( NIL == sense )
    {
      return ConsesLow.list( $sym75$PROGN, ConsesLow.listS( $sym111$DO_ALL_LITS_AS_ASENTS, ConsesLow.list( lit_var, clause, $kw108$SENSE, $kw110$NEG, $kw25$DONE, done ), ConsesLow.append( body, NIL ) ), ConsesLow.listS(
          $sym111$DO_ALL_LITS_AS_ASENTS, ConsesLow.list( lit_var, clause, $kw108$SENSE, $kw109$POS, $kw25$DONE, done ), ConsesLow.append( body, NIL ) ) );
    }
    return ConsesLow.list( $sym112$PCOND, ConsesLow.list( ConsesLow.list( EQ, $kw109$POS, sense ), ConsesLow.listS( $sym111$DO_ALL_LITS_AS_ASENTS, ConsesLow.list( lit_var, clause, $kw108$SENSE, $kw109$POS, $kw25$DONE,
        done ), ConsesLow.append( body, NIL ) ) ), ConsesLow.list( ConsesLow.list( EQ, $kw110$NEG, sense ), ConsesLow.listS( $sym111$DO_ALL_LITS_AS_ASENTS, ConsesLow.list( lit_var, clause, $kw108$SENSE, $kw110$NEG,
            $kw25$DONE, done ), ConsesLow.append( body, NIL ) ) ), ConsesLow.list( T, ConsesLow.list( $sym113$ERROR, $str114$Invalid_sense__s, sense ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 15194L)
  public static SubLObject do_literals_numbered(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list115 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject lit_var = NIL;
    SubLObject index_var = NIL;
    SubLObject sense_var = NIL;
    SubLObject clause = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list115 );
    lit_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list115 );
    index_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list115 );
    sense_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list115 );
    clause = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$11 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list115 );
      current_$11 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list115 );
      if( NIL == conses_high.member( current_$11, $list99, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$11 == $kw21$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list115 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw25$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.list( $sym75$PROGN, ConsesLow.list( $sym116$DO_NEG_LITS_NUMBERED, ConsesLow.list( lit_var, index_var, clause, $kw25$DONE, done ), ConsesLow.listS( $sym2$CLET, ConsesLow.list( reader.bq_cons(
        sense_var, $list117 ) ), ConsesLow.append( body, NIL ) ) ), ConsesLow.list( $sym118$DO_POS_LITS_NUMBERED, ConsesLow.list( lit_var, index_var, clause, $kw25$DONE, done ), ConsesLow.listS( $sym2$CLET, ConsesLow
            .list( reader.bq_cons( sense_var, $list119 ) ), ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 15672L)
  public static SubLObject do_clause_asents(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list120 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject asent_var = NIL;
    SubLObject sense_var = NIL;
    SubLObject clause = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list120 );
    asent_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list120 );
    sense_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list120 );
    clause = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject index_var = $sym121$INDEX_VAR;
      return ConsesLow.listS( $sym122$DO_LITERALS_NUMBERED, ConsesLow.list( asent_var, index_var, sense_var, clause ), ConsesLow.list( $sym123$IGNORE, index_var ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list120 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 16017L)
  public static SubLObject do_clauses_asents(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list124 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject lit_var = NIL;
    SubLObject v_clauses = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list124 );
    lit_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list124 );
    v_clauses = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$12 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list124 );
      current_$12 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list124 );
      if( NIL == conses_high.member( current_$12, $list125, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$12 == $kw21$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list124 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw25$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject sense_var_tail = cdestructuring_bind.property_list_member( $kw126$SENSE_VAR, current );
    final SubLObject sense_var = ( NIL != sense_var_tail ) ? conses_high.cadr( sense_var_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject clause = $sym127$CLAUSE;
    return ConsesLow.list( $sym31$DO_LIST, ConsesLow.list( clause, v_clauses, $kw25$DONE, done ), ConsesLow.listS( $sym111$DO_ALL_LITS_AS_ASENTS, ConsesLow.list( lit_var, clause, $kw108$SENSE, sense_var, $kw25$DONE,
        done ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 16411L)
  public static SubLObject do_clauses_literals_numbered(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list128 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject lit_var = NIL;
    SubLObject literal_index_var = NIL;
    SubLObject sense_var = NIL;
    SubLObject clause_index_var = NIL;
    SubLObject v_clauses = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list128 );
    lit_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list128 );
    literal_index_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list128 );
    sense_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list128 );
    clause_index_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list128 );
    v_clauses = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject clause = $sym129$CLAUSE;
      return ConsesLow.list( $sym130$CDOLIST_NUMBERED, ConsesLow.list( clause, clause_index_var, v_clauses ), ConsesLow.listS( $sym122$DO_LITERALS_NUMBERED, ConsesLow.list( lit_var, literal_index_var, sense_var,
          clause ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list128 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 16855L)
  public static SubLObject destructure_binding(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list131 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject variable_var = NIL;
    SubLObject value_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list131 );
    variable_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list131 );
    value_var = current.first();
    current = current.rest();
    if( NIL == current )
    {
      current = temp;
      SubLObject binding = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list131 );
      binding = current.first();
      final SubLObject body;
      current = ( body = current.rest() );
      return ConsesLow.listS( $sym132$CDESTRUCTURING_BIND, reader.bq_cons( variable_var, value_var ), binding, ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list131 );
    return NIL;
  }

  public static SubLObject declare_el_macros_file()
  {
    SubLFiles.declareMacro( me, "ignoring_sequence_vars", "IGNORING-SEQUENCE-VARS" );
    SubLFiles.declareMacro( me, "regularizing_sequence_vars", "REGULARIZING-SEQUENCE-VARS" );
    SubLFiles.declareMacro( me, "return_after_ignoring_sequence_vars", "RETURN-AFTER-IGNORING-SEQUENCE-VARS" );
    SubLFiles.declareMacro( me, "return_after_regularizing_sequence_vars", "RETURN-AFTER-REGULARIZING-SEQUENCE-VARS" );
    SubLFiles.declareMacro( me, "do_formula_args", "DO-FORMULA-ARGS" );
    SubLFiles.declareMacro( me, "do_formula_args_numbered", "DO-FORMULA-ARGS-NUMBERED" );
    SubLFiles.declareMacro( me, "some_el_formula_args", "SOME-EL-FORMULA-ARGS" );
    SubLFiles.declareMacro( me, "some_el_formula_args_numbered", "SOME-EL-FORMULA-ARGS-NUMBERED" );
    SubLFiles.declareMacro( me, "do_formula_terms", "DO-FORMULA-TERMS" );
    SubLFiles.declareMacro( me, "do_formula_terms_numbered", "DO-FORMULA-TERMS-NUMBERED" );
    SubLFiles.declareMacro( me, "some_el_formula_terms", "SOME-EL-FORMULA-TERMS" );
    SubLFiles.declareMacro( me, "some_el_formula_terms_numbered", "SOME-EL-FORMULA-TERMS-NUMBERED" );
    SubLFiles.declareMacro( me, "some_el_literal_args", "SOME-EL-LITERAL-ARGS" );
    SubLFiles.declareMacro( me, "some_el_literal_args_numbered", "SOME-EL-LITERAL-ARGS-NUMBERED" );
    SubLFiles.declareMacro( me, "some_el_literal_terms", "SOME-EL-LITERAL-TERMS" );
    SubLFiles.declareMacro( me, "some_el_literal_terms_numbered", "SOME-EL-LITERAL-TERMS-NUMBERED" );
    SubLFiles.declareMacro( me, "do_el_formula_literals", "DO-EL-FORMULA-LITERALS" );
    SubLFiles.declareMacro( me, "do_el_formula_args_recursive", "DO-EL-FORMULA-ARGS-RECURSIVE" );
    SubLFiles.declareMacro( me, "do_formula_terms_and_positions_recursive", "DO-FORMULA-TERMS-AND-POSITIONS-RECURSIVE" );
    SubLFiles.declareMacro( me, "without_wff_semantics", "WITHOUT-WFF-SEMANTICS" );
    SubLFiles.declareMacro( me, "with_wff_semantics", "WITH-WFF-SEMANTICS" );
    SubLFiles.declareMacro( me, "without_wff_semantics_or_arity", "WITHOUT-WFF-SEMANTICS-OR-ARITY" );
    SubLFiles.declareMacro( me, "without_wff_semantics_or_arity_or_kb", "WITHOUT-WFF-SEMANTICS-OR-ARITY-OR-KB" );
    SubLFiles.declareMacro( me, "with_el_var_namespace", "WITH-EL-VAR-NAMESPACE" );
    SubLFiles.declareMacro( me, "with_clean_el_var_namespace", "WITH-CLEAN-EL-VAR-NAMESPACE" );
    SubLFiles.declareMacro( me, "without_encapsulation", "WITHOUT-ENCAPSULATION" );
    SubLFiles.declareMacro( me, "do_clauses", "DO-CLAUSES" );
    SubLFiles.declareMacro( me, "do_neg_lits", "DO-NEG-LITS" );
    SubLFiles.declareMacro( me, "do_neg_lits_numbered", "DO-NEG-LITS-NUMBERED" );
    SubLFiles.declareMacro( me, "do_pos_lits", "DO-POS-LITS" );
    SubLFiles.declareMacro( me, "do_pos_lits_numbered", "DO-POS-LITS-NUMBERED" );
    SubLFiles.declareMacro( me, "do_all_lits_as_asents", "DO-ALL-LITS-AS-ASENTS" );
    SubLFiles.declareMacro( me, "do_literals_numbered", "DO-LITERALS-NUMBERED" );
    SubLFiles.declareMacro( me, "do_clause_asents", "DO-CLAUSE-ASENTS" );
    SubLFiles.declareMacro( me, "do_clauses_asents", "DO-CLAUSES-ASENTS" );
    SubLFiles.declareMacro( me, "do_clauses_literals_numbered", "DO-CLAUSES-LITERALS-NUMBERED" );
    SubLFiles.declareMacro( me, "destructure_binding", "DESTRUCTURE-BINDING" );
    return NIL;
  }

  public static SubLObject init_el_macros_file()
  {
    return NIL;
  }

  public static SubLObject setup_el_macros_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_el_macros_file();
  }

  @Override
  public void initializeVariables()
  {
    init_el_macros_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_el_macros_file();
  }
  static
  {
    me = new el_macros();
    $list0 = ConsesLow.list( ConsesLow.list( makeSymbol( "FORMULA" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym1$TEMPFORMULA = makeUninternedSymbol( "TEMPFORMULA" );
    $sym2$CLET = makeSymbol( "CLET" );
    $sym3$FIF = makeSymbol( "FIF" );
    $sym4$SEQUENCE_VAR = makeSymbol( "SEQUENCE-VAR" );
    $sym5$STRIP_SEQUENCE_VAR = makeSymbol( "STRIP-SEQUENCE-VAR" );
    $sym6$SEQVAR = makeUninternedSymbol( "SEQVAR" );
    $sym7$TEMPFORMULA = makeUninternedSymbol( "TEMPFORMULA" );
    $sym8$APPEND = makeSymbol( "APPEND" );
    $sym9$LIST = makeSymbol( "LIST" );
    $list10 = ConsesLow.list( ConsesLow.list( makeSymbol( "FORMULA" ), makeSymbol( "RESULT" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym11$SEQVAR = makeUninternedSymbol( "SEQVAR" );
    $sym12$TEMPFORMULA = makeUninternedSymbol( "TEMPFORMULA" );
    $list13 = ConsesLow.list( NIL );
    $sym14$PIF = makeSymbol( "PIF" );
    $sym15$RET = makeSymbol( "RET" );
    $sym16$NADD_SEQUENCE_VAR_TO_END = makeSymbol( "NADD-SEQUENCE-VAR-TO-END" );
    $sym17$SEQVAR = makeUninternedSymbol( "SEQVAR" );
    $sym18$TEMPFORMULA = makeUninternedSymbol( "TEMPFORMULA" );
    $list19 = ConsesLow.list( ConsesLow.list( makeSymbol( "ARG-VAR" ), makeSymbol( "FORMULA" ), makeSymbol( "&KEY" ), makeSymbol( "ARGNUM" ), ConsesLow.list( makeSymbol( "SEQVAR-HANDLING" ), makeKeyword( "IGNORE" ) ),
        makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list20 = ConsesLow.list( makeKeyword( "ARGNUM" ), makeKeyword( "SEQVAR-HANDLING" ), makeKeyword( "DONE" ) );
    $kw21$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw22$ARGNUM = makeKeyword( "ARGNUM" );
    $kw23$SEQVAR_HANDLING = makeKeyword( "SEQVAR-HANDLING" );
    $kw24$IGNORE = makeKeyword( "IGNORE" );
    $kw25$DONE = makeKeyword( "DONE" );
    $list26 = ConsesLow.list( ZERO_INTEGER );
    $sym27$DO_FORMULA_ARGS = makeSymbol( "DO-FORMULA-ARGS" );
    $sym28$CINC = makeSymbol( "CINC" );
    $sym29$ARGS = makeUninternedSymbol( "ARGS" );
    $sym30$FORMULA_ARGS = makeSymbol( "FORMULA-ARGS" );
    $sym31$DO_LIST = makeSymbol( "DO-LIST" );
    $list32 = ConsesLow.list( ConsesLow.list( makeSymbol( "ARG-VAR" ), makeSymbol( "ARGNUM-VAR" ), makeSymbol( "FORMULA" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "SEQVAR-HANDLING" ), makeKeyword(
        "IGNORE" ) ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list33 = ConsesLow.list( makeKeyword( "SEQVAR-HANDLING" ), makeKeyword( "DONE" ) );
    $list34 = ConsesLow.list( ConsesLow.list( makeSymbol( "ARG-VAR" ), makeSymbol( "FORMULA" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "DONE-VAR" ), NIL ), ConsesLow.list( makeSymbol( "SEQVAR-HANDLING" ),
        makeKeyword( "IGNORE" ) ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list35 = ConsesLow.list( ConsesLow.list( makeSymbol( "ARG-VAR" ), makeSymbol( "ARGNUM-VAR" ), makeSymbol( "FORMULA" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "DONE-VAR" ), NIL ), ConsesLow.list(
        makeSymbol( "SEQVAR-HANDLING" ), makeKeyword( "IGNORE" ) ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym36$DO_FORMULA_ARGS_NUMBERED = makeSymbol( "DO-FORMULA-ARGS-NUMBERED" );
    $list37 = ConsesLow.list( ConsesLow.list( makeSymbol( "TERM-VAR" ), makeSymbol( "FORMULA" ), makeSymbol( "&KEY" ), makeSymbol( "ARGNUM" ), ConsesLow.list( makeSymbol( "SEQVAR-HANDLING" ), makeKeyword( "IGNORE" ) ),
        makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym38$TERMS = makeUninternedSymbol( "TERMS" );
    $sym39$FORMULA_TERMS = makeSymbol( "FORMULA-TERMS" );
    $sym40$DO_LIST_INDEX = makeSymbol( "DO-LIST-INDEX" );
    $sym41$TERMS = makeUninternedSymbol( "TERMS" );
    $list42 = ConsesLow.list( ConsesLow.list( makeSymbol( "TERM-VAR" ), makeSymbol( "ARGNUM-VAR" ), makeSymbol( "FORMULA" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "SEQVAR-HANDLING" ), makeKeyword(
        "IGNORE" ) ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym43$DO_FORMULA_TERMS = makeSymbol( "DO-FORMULA-TERMS" );
    $list44 = ConsesLow.list( ConsesLow.list( makeSymbol( "TERM-VAR" ), makeSymbol( "FORMULA" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "DONE-VAR" ), NIL ), ConsesLow.list( makeSymbol(
        "SEQVAR-HANDLING" ), makeKeyword( "IGNORE" ) ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list45 = ConsesLow.list( ConsesLow.list( makeSymbol( "TERM-VAR" ), makeSymbol( "ARGNUM-VAR" ), makeSymbol( "FORMULA" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "DONE-VAR" ), NIL ), ConsesLow.list(
        makeSymbol( "SEQVAR-HANDLING" ), makeKeyword( "IGNORE" ) ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym46$DO_FORMULA_TERMS_NUMBERED = makeSymbol( "DO-FORMULA-TERMS-NUMBERED" );
    $list47 = ConsesLow.list( ConsesLow.list( makeSymbol( "ARG-VAR" ), makeSymbol( "LITERAL" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "DONE-VAR" ), NIL ), ConsesLow.list( makeSymbol( "SEQVAR-HANDLING" ),
        makeKeyword( "IGNORE" ) ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym48$ARGS = makeUninternedSymbol( "ARGS" );
    $sym49$LITERAL_ARGS = makeSymbol( "LITERAL-ARGS" );
    $list50 = ConsesLow.list( ConsesLow.list( makeSymbol( "ARG-VAR" ), makeSymbol( "ARGNUM-VAR" ), makeSymbol( "LITERAL" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "DONE-VAR" ), NIL ), ConsesLow.list(
        makeSymbol( "SEQVAR-HANDLING" ), makeKeyword( "IGNORE" ) ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym51$ARGS = makeUninternedSymbol( "ARGS" );
    $sym52$LIST_VAR = makeUninternedSymbol( "LIST-VAR" );
    $sym53$CDO = makeSymbol( "CDO" );
    $sym54$CDR = makeSymbol( "CDR" );
    $sym55$CAR = makeSymbol( "CAR" );
    $sym56$_ = makeSymbol( "+" );
    $sym57$COR = makeSymbol( "COR" );
    $sym58$NULL = makeSymbol( "NULL" );
    $list59 = ConsesLow.list( ConsesLow.list( makeSymbol( "TERM-VAR" ), makeSymbol( "LITERAL" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "DONE-VAR" ), NIL ), ConsesLow.list( makeSymbol(
        "SEQVAR-HANDLING" ), makeKeyword( "IGNORE" ) ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym60$TERMS = makeUninternedSymbol( "TERMS" );
    $sym61$LITERAL_TERMS = makeSymbol( "LITERAL-TERMS" );
    $list62 = ConsesLow.list( ConsesLow.list( makeSymbol( "TERM-VAR" ), makeSymbol( "ARGNUM-VAR" ), makeSymbol( "LITERAL" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "DONE-VAR" ), NIL ), ConsesLow.list(
        makeSymbol( "SEQVAR-HANDLING" ), makeKeyword( "IGNORE" ) ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym63$TERMS = makeUninternedSymbol( "TERMS" );
    $sym64$LIST_VAR = makeUninternedSymbol( "LIST-VAR" );
    $list65 = ConsesLow.list( ConsesLow.list( makeSymbol( "LITERAL" ), makeSymbol( "FORMULA" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym66$STACK = makeUninternedSymbol( "STACK" );
    $sym67$ENTRY = makeUninternedSymbol( "ENTRY" );
    $list68 = ConsesLow.list( ConsesLow.list( makeSymbol( "CREATE-STACK" ) ) );
    $sym69$STACK_PUSH = makeSymbol( "STACK-PUSH" );
    $sym70$UNTIL = makeSymbol( "UNTIL" );
    $sym71$STACK_EMPTY_P = makeSymbol( "STACK-EMPTY-P" );
    $sym72$STACK_POP = makeSymbol( "STACK-POP" );
    $sym73$PWHEN = makeSymbol( "PWHEN" );
    $sym74$LITERAL_ = makeSymbol( "LITERAL?" );
    $sym75$PROGN = makeSymbol( "PROGN" );
    $sym76$CSETQ = makeSymbol( "CSETQ" );
    $sym77$CDOLIST = makeSymbol( "CDOLIST" );
    $sym78$ARG = makeSymbol( "ARG" );
    $list79 = ConsesLow.list( ConsesLow.list( makeSymbol( "ARG" ), makeSymbol( "FORMULA" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym80$STACK = makeUninternedSymbol( "STACK" );
    $sym81$ENTRY = makeUninternedSymbol( "ENTRY" );
    $list82 = ConsesLow.list( ConsesLow.list( makeSymbol( "ARG" ), makeSymbol( "ARGPOS" ), makeSymbol( "FORMULA" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym83$ARG_STACK = makeUninternedSymbol( "ARG-STACK" );
    $sym84$POS_STACK = makeUninternedSymbol( "POS-STACK" );
    $sym85$ENTRY = makeUninternedSymbol( "ENTRY" );
    $sym86$POS_ENTRY = makeUninternedSymbol( "POS-ENTRY" );
    $sym87$ARG_NUM = makeUninternedSymbol( "ARG-NUM" );
    $sym88$SNOC = makeSymbol( "SNOC" );
    $list89 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "*WITHIN-ASSERT*" ), NIL ), ConsesLow.list( makeSymbol( "*CHECK-ARG-TYPES?*" ), NIL ), ConsesLow.list( makeSymbol( "*AT-CHECK-ARG-TYPES?*" ),
        NIL ), ConsesLow.list( makeSymbol( "*CHECK-WFF-SEMANTICS?*" ), NIL ), ConsesLow.list( makeSymbol( "*CHECK-WFF-COHERENCE?*" ), NIL ), ConsesLow.list( makeSymbol( "*CHECK-VAR-TYPES?*" ), NIL ), ConsesLow.list(
            makeSymbol( "*SIMPLIFY-LITERAL?*" ), NIL ), ConsesLow.list( makeSymbol( "*AT-CHECK-RELATOR-CONSTRAINTS?*" ), NIL ), ConsesLow.list( makeSymbol( "*AT-CHECK-ARG-FORMAT?*" ), NIL ), ConsesLow.list( makeSymbol(
                "*VALIDATE-CONSTANTS?*" ), NIL ), ConsesLow.list( makeSymbol( "*SUSPEND-SBHL-TYPE-CHECKING?*" ), T )
    } );
    $list90 = ConsesLow.list( ConsesLow.list( makeSymbol( "*CHECK-WFF-SEMANTICS?*" ), T ) );
    $sym91$WITHOUT_WFF_SEMANTICS = makeSymbol( "WITHOUT-WFF-SEMANTICS" );
    $list92 = ConsesLow.list( ConsesLow.list( makeSymbol( "*CHECK-ARITY?*" ), NIL ) );
    $sym93$WITHOUT_WFF_SEMANTICS_OR_ARITY = makeSymbol( "WITHOUT-WFF-SEMANTICS-OR-ARITY" );
    $sym94$WITHOUT_GRAMMAR_USING_KB = makeSymbol( "WITHOUT-GRAMMAR-USING-KB" );
    $list95 = ConsesLow.list( ConsesLow.list( makeSymbol( "*EL-SYMBOL-SUFFIX-TABLE*" ), ConsesLow.list( makeSymbol( "FIF" ), makeSymbol( "*EL-SYMBOL-SUFFIX-TABLE*" ), makeSymbol( "*EL-SYMBOL-SUFFIX-TABLE*" ), ConsesLow
        .list( makeSymbol( "MAKE-HASH-TABLE" ), makeInteger( 32 ), ConsesLow.list( makeSymbol( "FUNCTION" ), EQL ) ) ) ), ConsesLow.list( makeSymbol( "*STANDARDIZE-VARIABLES-MEMORY*" ), ConsesLow.list( makeSymbol(
            "FIF" ), makeSymbol( "*STANDARDIZE-VARIABLES-MEMORY*" ), makeSymbol( "*STANDARDIZE-VARIABLES-MEMORY*" ), NIL ) ) );
    $list96 = ConsesLow.list( ConsesLow.list( makeSymbol( "*EL-SYMBOL-SUFFIX-TABLE*" ), ConsesLow.list( makeSymbol( "MAKE-HASH-TABLE" ), FOUR_INTEGER, ConsesLow.list( makeSymbol( "FUNCTION" ), EQL ) ) ), ConsesLow.list(
        makeSymbol( "*STANDARDIZE-VARIABLES-MEMORY*" ), NIL ) );
    $list97 = ConsesLow.list( ConsesLow.list( makeSymbol( "*ENCAPSULATE-VAR-FORMULA?*" ), NIL ), ConsesLow.list( makeSymbol( "*ENCAPSULATE-INTENSIONAL-FORMULA?*" ), NIL ) );
    $list98 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLAUSE-VAR" ), makeSymbol( "CLAUSES" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list99 = ConsesLow.list( makeKeyword( "DONE" ) );
    $list100 = ConsesLow.list( ConsesLow.list( makeSymbol( "LIT-VAR" ), makeSymbol( "CNF" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym101$NEG_LITS = makeSymbol( "NEG-LITS" );
    $list102 = ConsesLow.list( ConsesLow.list( makeSymbol( "LIT-VAR" ), makeSymbol( "INDEX" ), makeSymbol( "CNF" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym103$DO_NEG_LITS = makeSymbol( "DO-NEG-LITS" );
    $sym104$POS_LITS = makeSymbol( "POS-LITS" );
    $sym105$DO_POS_LITS = makeSymbol( "DO-POS-LITS" );
    $list106 = ConsesLow.list( ConsesLow.list( makeSymbol( "LIT-VAR" ), makeSymbol( "CLAUSE" ), makeSymbol( "&KEY" ), makeSymbol( "SENSE" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list107 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "DONE" ) );
    $kw108$SENSE = makeKeyword( "SENSE" );
    $kw109$POS = makeKeyword( "POS" );
    $kw110$NEG = makeKeyword( "NEG" );
    $sym111$DO_ALL_LITS_AS_ASENTS = makeSymbol( "DO-ALL-LITS-AS-ASENTS" );
    $sym112$PCOND = makeSymbol( "PCOND" );
    $sym113$ERROR = makeSymbol( "ERROR" );
    $str114$Invalid_sense__s = makeString( "Invalid sense ~s" );
    $list115 = ConsesLow.list( ConsesLow.list( makeSymbol( "LIT-VAR" ), makeSymbol( "INDEX-VAR" ), makeSymbol( "SENSE-VAR" ), makeSymbol( "CLAUSE" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ),
        makeSymbol( "BODY" ) );
    $sym116$DO_NEG_LITS_NUMBERED = makeSymbol( "DO-NEG-LITS-NUMBERED" );
    $list117 = ConsesLow.list( makeKeyword( "NEG" ) );
    $sym118$DO_POS_LITS_NUMBERED = makeSymbol( "DO-POS-LITS-NUMBERED" );
    $list119 = ConsesLow.list( makeKeyword( "POS" ) );
    $list120 = ConsesLow.list( ConsesLow.list( makeSymbol( "ASENT-VAR" ), makeSymbol( "SENSE-VAR" ), makeSymbol( "CLAUSE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym121$INDEX_VAR = makeUninternedSymbol( "INDEX-VAR" );
    $sym122$DO_LITERALS_NUMBERED = makeSymbol( "DO-LITERALS-NUMBERED" );
    $sym123$IGNORE = makeSymbol( "IGNORE" );
    $list124 = ConsesLow.list( ConsesLow.list( makeSymbol( "LIT-VAR" ), makeSymbol( "CLAUSES" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ), makeSymbol( "SENSE-VAR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list125 = ConsesLow.list( makeKeyword( "DONE" ), makeKeyword( "SENSE-VAR" ) );
    $kw126$SENSE_VAR = makeKeyword( "SENSE-VAR" );
    $sym127$CLAUSE = makeUninternedSymbol( "CLAUSE" );
    $list128 = ConsesLow.list( ConsesLow.list( makeSymbol( "LIT-VAR" ), makeSymbol( "LITERAL-INDEX-VAR" ), makeSymbol( "SENSE-VAR" ), makeSymbol( "CLAUSE-INDEX-VAR" ), makeSymbol( "CLAUSES" ) ), makeSymbol( "&BODY" ),
        makeSymbol( "BODY" ) );
    $sym129$CLAUSE = makeUninternedSymbol( "CLAUSE" );
    $sym130$CDOLIST_NUMBERED = makeSymbol( "CDOLIST-NUMBERED" );
    $list131 = ConsesLow.list( ConsesLow.list( makeSymbol( "VARIABLE-VAR" ), makeSymbol( "VALUE-VAR" ) ), makeSymbol( "BINDING" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym132$CDESTRUCTURING_BIND = makeSymbol( "CDESTRUCTURING-BIND" );
  }
}
/*
 * 
 * Total time: 1988 ms
 * 
 */