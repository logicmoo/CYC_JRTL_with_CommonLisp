//
//
package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class assertions_high
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.assertions_high";
  public static final String myFingerPrint = "c6dc687939519d69446fa9a4d6b82299b6e4cd544b3594edfdea38d57acf472b";
  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 27436L)
  private static SubLSymbol $tl_assertion_lookaside_table$;
  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 27595L)
  private static SubLSymbol $tl_assertion_capacity$;
  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 42198L)
  public static SubLSymbol $assertion_dump_id_table$;
  private static final SubLList $list0;
  private static final SubLList $list1;
  private static final SubLSymbol $kw2$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw3$DONE;
  private static final SubLSymbol $sym4$DO_LIST;
  private static final SubLSymbol $sym5$ASSERTION_ARGUMENTS;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$DO_SET_CONTENTS;
  private static final SubLSymbol $sym8$ASSERTION_DEPENDENTS;
  private static final SubLList $list9;
  private static final SubLList $list10;
  private static final SubLSymbol $kw11$SENSE;
  private static final SubLSymbol $kw12$PREDICATE;
  private static final SubLSymbol $sym13$PREDICATE_VAR;
  private static final SubLSymbol $sym14$CLET;
  private static final SubLSymbol $sym15$DO_ASSERTION_LITERALS;
  private static final SubLSymbol $sym16$PWHEN;
  private static final SubLSymbol $sym17$ATOMIC_SENTENCE_PREDICATE;
  private static final SubLSymbol $sym18$CNF_VAR;
  private static final SubLSymbol $sym19$ASSERTION_VAR;
  private static final SubLSymbol $sym20$ASSERTION_CNF;
  private static final SubLSymbol $sym21$DO_ALL_LITS_AS_ASENTS;
  private static final SubLList $list22;
  private static final SubLList $list23;
  private static final SubLSymbol $kw24$NUM;
  private static final SubLSymbol $kw25$PROGRESS_MESSAGE;
  private static final SubLString $str26$mapping_assertions_for_sweep;
  private static final SubLSymbol $sym27$PIF;
  private static final SubLSymbol $sym28$POSITIVE_INTEGER_P;
  private static final SubLSymbol $sym29$PROGRESS_CSOME;
  private static final SubLSymbol $sym30$ASSERTIONS_AROUND;
  private static final SubLList $list31;
  private static final SubLSymbol $sym32$DO_ASSERTIONS;
  private static final SubLSymbol $sym33$ASSERTION_P;
  private static final SubLList $list34;
  private static final SubLString $str35$Return_the_cnf_of_ASSERTION______;
  private static final SubLList $list36;
  private static final SubLList $list37;
  private static final SubLSymbol $kw38$FALSE;
  private static final SubLSymbol $sym39$ASSERTION_MT;
  private static final SubLString $str40$Return_the_mt_of_ASSERTION_;
  private static final SubLList $list41;
  private static final SubLSymbol $sym42$ASSERTION_DIRECTION;
  private static final SubLString $str43$Return_the_direction_of_ASSERTION;
  private static final SubLList $list44;
  private static final SubLSymbol $sym45$ASSERTION_TRUTH;
  private static final SubLString $str46$Return_the_current_truth_of_ASSER;
  private static final SubLList $list47;
  private static final SubLSymbol $sym48$ASSERTION_STRENGTH;
  private static final SubLString $str49$Return_the_current_argumentation_;
  private static final SubLList $list50;
  private static final SubLSymbol $sym51$ASSERTION_VARIABLE_NAMES;
  private static final SubLString $str52$Return_the_variable_names_for_ASS;
  private static final SubLList $list53;
  private static final SubLSymbol $sym54$ASSERTED_BY;
  private static final SubLString $str55$Returns_the_cyclist_who_asserted_;
  private static final SubLSymbol $sym56$ASSERTED_WHEN;
  private static final SubLString $str57$Returns_the_day_when_ASSERTION_wa;
  private static final SubLList $list58;
  private static final SubLSymbol $sym59$ASSERTION_FORMULA;
  private static final SubLString $str60$Return_a_formula_for_ASSERTION_;
  private static final SubLList $list61;
  private static final SubLObject $const62$ist;
  private static final SubLSymbol $sym63$ASSERTION_IST_FORMULA;
  private static final SubLString $str64$Return_a_formula_in___ist_format_;
  private static final SubLSymbol $sym65$HL_TERM_P;
  private static final SubLSymbol $sym66$ASSERTION_MENTIONS_TERM_;
  private static final SubLList $list67;
  private static final SubLString $str68$Return_T_iff_ASSERTION_s_formula_;
  private static final SubLList $list69;
  private static final SubLList $list70;
  private static final SubLSymbol $sym71$ASSERTION_MENTIONS_TERM;
  private static final SubLString $str72$_see_assertion_mentions_term_;
  private static final SubLObject $const73$performSubL;
  private static final SubLSymbol $sym74$KB_TMS_METHOD_;
  private static final SubLList $list75;
  private static final SubLList $list76;
  private static final SubLSymbol $kw77$GAF;
  private static final SubLSymbol $kw78$RULE;
  private static final SubLString $str79$Could_not_determine_assertion_typ;
  private static final SubLSymbol $sym80$ASSERTION_TYPE_P;
  private static final SubLSymbol $sym81$ASSERTION_HAS_TYPE;
  private static final SubLList $list82;
  private static final SubLSymbol $sym83$GAF_ASSERTION_;
  private static final SubLSymbol $sym84$GAF_PREDICATE;
  private static final SubLString $str85$Return_the_predicate_of_gaf_ASSER;
  private static final SubLSymbol $sym86$GAF_ARG0;
  private static final SubLString $str87$Return_arg_0__the_predicate__of_t;
  private static final SubLSymbol $sym88$GAF_ARG1;
  private static final SubLString $str89$Return_arg_1_of_the_gaf_ASSERTION;
  private static final SubLSymbol $sym90$GAF_ARG2;
  private static final SubLString $str91$Return_arg_2_of_the_gaf_ASSERTION;
  private static final SubLSymbol $sym92$GAF_ARG3;
  private static final SubLString $str93$Return_arg_3_of_the_gaf_ASSERTION;
  private static final SubLSymbol $sym94$GAF_ARG4;
  private static final SubLString $str95$Return_arg_4_of_the_gaf_ASSERTION;
  private static final SubLSymbol $sym96$GAF_ARG5;
  private static final SubLString $str97$Return_arg_5_of_the_gaf_ASSERTION;
  private static final SubLSymbol $sym98$DIRECTION_P;
  private static final SubLSymbol $sym99$ASSERTION_HAS_DIRECTION;
  private static final SubLList $list100;
  private static final SubLSymbol $kw101$FORWARD;
  private static final SubLSymbol $sym102$FORWARD_ASSERTION_;
  private static final SubLString $str103$Predicate_returns_T_iff_ASSERTION;
  private static final SubLSymbol $kw104$BACKWARD;
  private static final SubLSymbol $sym105$BACKWARD_ASSERTION_;
  private static final SubLString $str106$Predicate_returns_T_iff_ASSERTION;
  private static final SubLSymbol $kw107$CODE;
  private static final SubLSymbol $sym108$CODE_ASSERTION_;
  private static final SubLString $str109$Predicate_returns_T_iff_ASSERTION;
  private static final SubLSymbol $sym110$TRUTH_P;
  private static final SubLSymbol $sym111$ASSERTION_HAS_TRUTH_;
  private static final SubLList $list112;
  private static final SubLString $str113$Return_T_iff_ASSERTION_s_current_;
  private static final SubLList $list114;
  private static final SubLSymbol $sym115$ASSERTION_HAS_TRUTH;
  private static final SubLString $str116$_see_assertion_has_truth_;
  private static final SubLInteger $int117$1000000;
  private static final SubLSymbol $sym118$GENERALIZED_DATE_P;
  private static final SubLSymbol $sym119$ASSERTION_ASSERTED_DATE_;
  private static final SubLSymbol $sym120$INTERN_EL_VAR;
  private static final SubLSymbol $sym121$EL_VARIABLE_P;
  private static final SubLSymbol $sym122$VARIABLE_P;
  private static final SubLSymbol $sym123$MAKE_VARIABLE_BINDING;
  private static final SubLSymbol $sym124$TL_TIMESTAMP_ASSERTED_ASSERTION;
  private static final SubLSymbol $sym125$_TL_ASSERTION_LOOKASIDE_TABLE_;
  private static final SubLSymbol $sym126$NART_P;
  private static final SubLSymbol $sym127$VALID_ASSERTION;
  private static final SubLList $list128;
  private static final SubLSymbol $sym129$INVALID_ASSERTION;
  private static final SubLList $list130;
  private static final SubLInteger $int131$100;
  private static final SubLSymbol $sym132$NON_NEGATIVE_INTEGER_P;
  private static final SubLSymbol $sym133$FIND_ASSERTION_BY_ID;
  private static final SubLSymbol $kw134$TRUE;
  private static final SubLSymbol $kw135$DEFAULT;
  private static final SubLSymbol $sym136$CNF_P;
  private static final SubLSymbol $sym137$HLMT_P;
  private static final SubLSymbol $sym138$EL_FORMULA_P;
  private static final SubLString $str139$Removing_broken_assertions__pass_;
  private static final SubLSymbol $sym140$STRINGP;
  private static final SubLSymbol $kw141$SKIP;
  private static final SubLSymbol $kw142$OK;
  private static final SubLString $str143$_______removed_assertion___A__rea;
  private static final SubLSymbol $sym144$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLList $list145;
  private static final SubLSymbol $kw146$TAUTOLOGY;
  private static final SubLSymbol $kw147$NO_SENTENCE;
  private static final SubLSymbol $sym148$INVALID_INDEXED_TERM_;
  private static final SubLSymbol $kw149$INVALID_SENTENCE_TERM;
  private static final SubLSymbol $kw150$INVALID_MT_TERM;
  private static final SubLSymbol $kw151$BAD_VAR_NAMES;
  private static final SubLSymbol $kw152$CANNOT_UNPACK;
  private static final SubLSymbol $kw153$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym154$IGNORE_ERRORS_HANDLER;
  private static final SubLSymbol $kw155$NOT_AN_ASSERTION;
  private static final SubLSymbol $sym156$ARGUMENT_P;
  private static final SubLSymbol $sym157$ARGUMENT_EQUAL;
  private static final SubLSymbol $sym158$NOT_EQL;
  private static final SubLSymbol $sym159$ASSERTED_ARGUMENT_P;
  private static final SubLSymbol $sym160$ASSERTED_ASSERTION_;
  private static final SubLString $str161$Return_non_nil_IFF_assertion_has_;
  private static final SubLSymbol $sym162$DEDUCTION_P;
  private static final SubLSymbol $sym163$DEDUCED_ASSERTION_;
  private static final SubLString $str164$Return_non_nil_IFF_assertion_has_;
  private static final SubLSymbol $sym165$FORWARD_DEDUCTION_;
  private static final SubLSymbol $sym166$FORWARD_NOT_CODE_DEDUCTION_;
  private static final SubLSymbol $sym167$GET_ASSERTED_ARGUMENT;
  private static final SubLString $str168$Return_the_asserted_argument_for_;
  private static final SubLList $list169;
  private static final SubLSymbol $sym170$ASSERTION_HAS_DEPENDENTS_P;
  private static final SubLString $str171$Return_non_nil_IFF_assertion_has_;
  private static final SubLSymbol $sym172$TRUE;
  private static final SubLInteger $int173$500;
  private static final SubLList $list174;
  private static final SubLList $list175;

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 1226L)
  public static SubLObject do_assertion_arguments(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject argument_var = NIL;
    SubLObject assertion = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    argument_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    assertion = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list0 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list0 );
      if( NIL == conses_high.member( current_$1, $list1, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw2$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw3$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym4$DO_LIST, ConsesLow.list( argument_var, ConsesLow.list( $sym5$ASSERTION_ARGUMENTS, assertion ), $kw3$DONE, done ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 1684L)
  public static SubLObject do_assertion_dependents(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list6 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject deduction_var = NIL;
    SubLObject assertion = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list6 );
    deduction_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list6 );
    assertion = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$2 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list6 );
      current_$2 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list6 );
      if( NIL == conses_high.member( current_$2, $list1, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$2 == $kw2$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list6 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw3$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym7$DO_SET_CONTENTS, ConsesLow.list( deduction_var, ConsesLow.list( $sym8$ASSERTION_DEPENDENTS, assertion ), $kw3$DONE, done ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 2126L)
  public static SubLObject do_assertion_literals(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject lit_var = NIL;
    SubLObject assertion = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
    lit_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
    assertion = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$3 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list9 );
      current_$3 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list9 );
      if( NIL == conses_high.member( current_$3, $list10, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$3 == $kw2$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list9 );
    }
    final SubLObject sense_tail = cdestructuring_bind.property_list_member( $kw11$SENSE, current );
    final SubLObject sense = ( NIL != sense_tail ) ? conses_high.cadr( sense_tail ) : NIL;
    final SubLObject predicate_tail = cdestructuring_bind.property_list_member( $kw12$PREDICATE, current );
    final SubLObject predicate = ( NIL != predicate_tail ) ? conses_high.cadr( predicate_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw3$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    if( NIL != predicate )
    {
      final SubLObject predicate_var = $sym13$PREDICATE_VAR;
      return ConsesLow.list( $sym14$CLET, ConsesLow.list( ConsesLow.list( predicate_var, predicate ) ), ConsesLow.list( $sym15$DO_ASSERTION_LITERALS, ConsesLow.list( lit_var, assertion, $kw11$SENSE, sense, $kw3$DONE,
          done ), ConsesLow.listS( $sym16$PWHEN, ConsesLow.list( EQL, predicate_var, ConsesLow.list( $sym17$ATOMIC_SENTENCE_PREDICATE, lit_var ) ), ConsesLow.append( body, NIL ) ) ) );
    }
    final SubLObject cnf_var = $sym18$CNF_VAR;
    final SubLObject assertion_var = $sym19$ASSERTION_VAR;
    return ConsesLow.list( $sym14$CLET, ConsesLow.list( ConsesLow.list( assertion_var, assertion ) ), ConsesLow.list( $sym14$CLET, ConsesLow.list( ConsesLow.list( cnf_var, ConsesLow.list( $sym20$ASSERTION_CNF,
        assertion_var ) ) ), ConsesLow.listS( $sym21$DO_ALL_LITS_AS_ASENTS, ConsesLow.list( lit_var, cnf_var, $kw11$SENSE, sense, $kw3$DONE, done ), ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 3064L)
  public static SubLObject do_recent_assertions(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list22 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list22 );
    var = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$4 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list22 );
      current_$4 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list22 );
      if( NIL == conses_high.member( current_$4, $list23, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$4 == $kw2$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list22 );
    }
    final SubLObject num_tail = cdestructuring_bind.property_list_member( $kw24$NUM, current );
    final SubLObject num = ( NIL != num_tail ) ? conses_high.cadr( num_tail ) : NIL;
    final SubLObject progress_message_tail = cdestructuring_bind.property_list_member( $kw25$PROGRESS_MESSAGE, current );
    final SubLObject progress_message = ( NIL != progress_message_tail ) ? conses_high.cadr( progress_message_tail ) : $str26$mapping_assertions_for_sweep;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw3$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.list( $sym27$PIF, ConsesLow.list( $sym28$POSITIVE_INTEGER_P, num ), ConsesLow.listS( $sym29$PROGRESS_CSOME, ConsesLow.list( var, ConsesLow.list( $sym30$ASSERTIONS_AROUND, $list31, num, num ),
        progress_message, done ), ConsesLow.append( body, NIL ) ), ConsesLow.listS( $sym32$DO_ASSERTIONS, ConsesLow.list( var, progress_message, $kw3$DONE, done ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 3641L)
  public static SubLObject assertion_cnf(final SubLObject assertion)
  {
    enforceType( assertion, $sym33$ASSERTION_P );
    return ( NIL != assertion_handles.assertion_handle_validP( assertion ) ) ? assertions_interface.kb_assertion_cnf( assertion ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 4109L)
  public static SubLObject intuitive_assertion_cnf(final SubLObject assertion)
  {
    if( NIL == assertion_handles.assertion_handle_validP( assertion ) )
    {
      return NIL;
    }
    if( NIL != assertion_utilities.false_assertionP( assertion ) && NIL != gaf_assertionP( assertion ) )
    {
      return clause_utilities.make_false_gaf_cnf( gaf_formula( assertion ) );
    }
    return assertions_interface.kb_assertion_cnf( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 4500L)
  public static SubLObject intuitive_cnf(final SubLObject cnf, final SubLObject truth)
  {
    if( NIL != clauses.gaf_cnfP( cnf ) && $kw38$FALSE == truth )
    {
      return clause_utilities.make_false_gaf_cnf( clause_utilities.gaf_cnf_literal( cnf ) );
    }
    return cnf;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 4795L)
  public static SubLObject possibly_assertion_cnf(final SubLObject assertion)
  {
    return ( NIL != assertion_handles.assertion_handle_validP( assertion ) ) ? assertions_interface.kb_possibly_assertion_cnf( assertion ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 5001L)
  public static SubLObject assertion_mt(final SubLObject assertion)
  {
    enforceType( assertion, $sym33$ASSERTION_P );
    return ( NIL != assertion_handles.assertion_handle_validP( assertion ) ) ? assertions_interface.kb_assertion_mt( assertion ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 5226L)
  public static SubLObject assertion_gaf_hl_formula(final SubLObject assertion)
  {
    return ( NIL != assertion_handles.assertion_handle_validP( assertion ) ) ? assertions_interface.kb_assertion_gaf_hl_formula( assertion ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 5374L)
  public static SubLObject assertion_cons(final SubLObject assertion)
  {
    return ( NIL != assertion_handles.assertion_handle_validP( assertion ) ) ? assertions_interface.kb_assertion_cons( assertion ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 5673L)
  public static SubLObject gaf_assertionP(final SubLObject assertion)
  {
    return makeBoolean( NIL != assertion_handles.valid_assertion_handleP( assertion ) && NIL != assertions_interface.kb_gaf_assertionP( assertion ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 5865L)
  public static SubLObject rule_assertionP(final SubLObject assertion)
  {
    return makeBoolean( NIL != assertion_handles.valid_assertion_handleP( assertion ) && NIL != assertions_interface.kb_rule_assertionP( assertion ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 6076L)
  public static SubLObject assertion_direction(final SubLObject assertion)
  {
    enforceType( assertion, $sym33$ASSERTION_P );
    return ( NIL != assertion_handles.assertion_handle_validP( assertion ) ) ? assertions_interface.kb_assertion_direction( assertion ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 6365L)
  public static SubLObject assertion_truth(final SubLObject assertion)
  {
    enforceType( assertion, $sym33$ASSERTION_P );
    return ( NIL != assertion_handles.assertion_handle_validP( assertion ) ) ? assertions_interface.kb_assertion_truth( assertion ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 6643L)
  public static SubLObject assertion_strength(final SubLObject assertion)
  {
    enforceType( assertion, $sym33$ASSERTION_P );
    return ( NIL != assertion_handles.assertion_handle_validP( assertion ) ) ? assertions_interface.kb_assertion_strength( assertion ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 6959L)
  public static SubLObject assertion_variable_names(final SubLObject assertion)
  {
    enforceType( assertion, $sym33$ASSERTION_P );
    return ( NIL != assertion_handles.assertion_handle_validP( assertion ) ) ? assertions_interface.kb_assertion_variable_names( assertion ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 7224L)
  public static SubLObject asserted_by(final SubLObject assertion)
  {
    enforceType( assertion, $sym33$ASSERTION_P );
    return ( NIL != assertion_handles.assertion_handle_validP( assertion ) ) ? assertions_interface.kb_assertion_asserted_by( assertion ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 7472L)
  public static SubLObject asserted_when(final SubLObject assertion)
  {
    enforceType( assertion, $sym33$ASSERTION_P );
    return ( NIL != assertion_handles.assertion_handle_validP( assertion ) ) ? assertions_interface.kb_assertion_asserted_when( assertion ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 7732L)
  public static SubLObject asserted_why(final SubLObject assertion)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    return ( NIL != assertion_handles.assertion_handle_validP( assertion ) ) ? assertions_interface.kb_assertion_asserted_why( assertion ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 7954L)
  public static SubLObject asserted_second(final SubLObject assertion)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    return ( NIL != assertion_handles.assertion_handle_validP( assertion ) ) ? assertions_interface.kb_assertion_asserted_second( assertion ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 8194L)
  public static SubLObject assertion_arguments(final SubLObject assertion)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    return ( NIL != assertion_handles.assertion_handle_validP( assertion ) ) ? assertions_interface.kb_assertion_arguments( assertion ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 8419L)
  public static SubLObject assertion_dependents(final SubLObject assertion)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    return ( NIL != assertion_handles.assertion_handle_validP( assertion ) ) ? assertions_interface.kb_assertion_dependents( assertion ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 8656L)
  public static SubLObject assertion_dependent_list(final SubLObject assertion)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    return ( NIL != assertion_handles.assertion_handle_validP( assertion ) ) ? set_contents.set_contents_element_list( assertions_interface.kb_assertion_dependents( assertion ) ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 8915L)
  public static SubLObject cyc_assertion_tv(final SubLObject assertion)
  {
    final SubLObject truth = assertion_truth( assertion );
    final SubLObject strength = assertion_strength( assertion );
    return enumeration_types.tv_from_truth_strength( truth, strength );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 9426L)
  public static SubLObject assertion_formula(final SubLObject assertion)
  {
    enforceType( assertion, $sym33$ASSERTION_P );
    if( NIL != gaf_assertionP( assertion ) )
    {
      return gaf_el_formula( assertion );
    }
    final SubLObject cnf = assertion_cnf( assertion );
    if( NIL != clauses.cnf_p( cnf ) )
    {
      return clauses.cnf_formula( cnf, assertion_truth( assertion ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 9897L)
  public static SubLObject assertion_ist_formula(final SubLObject assertion)
  {
    enforceType( assertion, $sym33$ASSERTION_P );
    return ConsesLow.list( $const62$ist, assertion_mt( assertion ), assertion_formula( assertion ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 10149L)
  public static SubLObject assertion_ist_sentence(final SubLObject assertion)
  {
    return assertion_ist_formula( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 10243L)
  public static SubLObject assertion_to_hl_assertion_spec(final SubLObject assertion)
  {
    final SubLObject cnf = assertion_cnf( assertion );
    final SubLObject mt = assertion_mt( assertion );
    final SubLObject direction = assertion_direction( assertion );
    final SubLObject variable_map = assertion_variable_names( assertion );
    return hl_storage_modules.new_hl_assertion_spec( cnf, mt, direction, variable_map );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 10635L)
  public static SubLObject assertion_to_hl_assertibles(final SubLObject assertion)
  {
    SubLObject assertibles = NIL;
    final SubLObject hl_assertion_spec = assertion_to_hl_assertion_spec( assertion );
    SubLObject cdolist_list_var;
    final SubLObject v_arguments = cdolist_list_var = assertion_arguments( assertion );
    SubLObject argument = NIL;
    argument = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject argument_spec = arguments.argument_to_argument_spec( argument );
      final SubLObject assertible = hl_storage_modules.new_hl_assertible( hl_assertion_spec, argument_spec );
      assertibles = ConsesLow.cons( assertible, assertibles );
      cdolist_list_var = cdolist_list_var.rest();
      argument = cdolist_list_var.first();
    }
    return assertibles;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 11170L)
  public static SubLObject assertion_mentions_termP(final SubLObject assertion, final SubLObject v_term)
  {
    enforceType( assertion, $sym33$ASSERTION_P );
    enforceType( v_term, $sym65$HL_TERM_P );
    final SubLObject cons = assertion_cons( assertion );
    if( NIL != list_utilities.tree_find( v_term, cons, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
    {
      return T;
    }
    final SubLObject mt = assertion_mt( assertion );
    if( NIL != list_utilities.tree_find( v_term, mt, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
    {
      return T;
    }
    if( NIL != list_utilities.tree_find_if( Symbols.symbol_function( $sym33$ASSERTION_P ), cons, UNPROVIDED ) )
    {
      SubLObject cdolist_list_var;
      final SubLObject sub_assertions = cdolist_list_var = list_utilities.tree_gather( cons, Symbols.symbol_function( $sym33$ASSERTION_P ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
      SubLObject sub_assertion = NIL;
      sub_assertion = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != assertion_mentions_termP( sub_assertion, v_term ) )
        {
          return T;
        }
        cdolist_list_var = cdolist_list_var.rest();
        sub_assertion = cdolist_list_var.first();
      }
      return NIL;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 12044L)
  public static SubLObject assertion_mentions_term(final SubLObject assertion, final SubLObject v_term)
  {
    enforceType( assertion, $sym33$ASSERTION_P );
    enforceType( v_term, $sym65$HL_TERM_P );
    return assertion_mentions_termP( assertion, v_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 12289L)
  public static SubLObject assertion_cnf_or_gaf_hl_formula(final SubLObject assertion)
  {
    return ( NIL != gaf_assertionP( assertion ) ) ? assertion_gaf_hl_formula( assertion ) : assertion_cnf( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 12579L)
  public static SubLObject backward_ruleP(final SubLObject assertion)
  {
    return makeBoolean( NIL != rule_assertionP( assertion ) && NIL != backward_assertionP( assertion ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 12729L)
  public static SubLObject forward_ruleP(final SubLObject assertion)
  {
    return makeBoolean( NIL != rule_assertionP( assertion ) && NIL != forward_assertionP( assertion ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 12852L)
  public static SubLObject single_literal_ruleP(final SubLObject assertion)
  {
    if( NIL != rule_assertionP( assertion ) )
    {
      final SubLObject cnf = assertion_cnf( assertion );
      final SubLObject pos_lit_count = Sequences.length( clauses.pos_lits( cnf ) );
      final SubLObject neg_lit_count = Sequences.length( clauses.neg_lits( cnf ) );
      return Numbers.numE( ONE_INTEGER, Numbers.add( pos_lit_count, neg_lit_count ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 13175L)
  public static SubLObject single_literal_antecedent_ruleP(final SubLObject assertion)
  {
    if( NIL != rule_assertionP( assertion ) )
    {
      final SubLObject cnf = assertion_cnf( assertion );
      final SubLObject pos_lit_count = Sequences.length( clauses.pos_lits( cnf ) );
      final SubLObject neg_lit_count = Sequences.length( clauses.neg_lits( cnf ) );
      return makeBoolean( ONE_INTEGER.numE( pos_lit_count ) && ONE_INTEGER.numE( neg_lit_count ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 13550L)
  public static SubLObject two_literal_antecedent_ruleP(final SubLObject assertion)
  {
    if( NIL != rule_assertionP( assertion ) )
    {
      final SubLObject cnf = assertion_cnf( assertion );
      final SubLObject pos_lit_count = Sequences.length( clauses.pos_lits( cnf ) );
      final SubLObject neg_lit_count = Sequences.length( clauses.neg_lits( cnf ) );
      return makeBoolean( ONE_INTEGER.numE( pos_lit_count ) && TWO_INTEGER.numE( neg_lit_count ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 13923L)
  public static SubLObject forward_tms_ruleP(final SubLObject rule)
  {
    if( NIL != forward_ruleP( rule ) )
    {
      final SubLObject cnf = assertion_cnf( rule );
      final SubLObject pos_lits = clauses.pos_lits( cnf );
      SubLObject witness = NIL;
      if( NIL == witness )
      {
        SubLObject csome_list_var = pos_lits;
        SubLObject pos_lit = NIL;
        pos_lit = csome_list_var.first();
        while ( NIL == witness && NIL != csome_list_var)
        {
          final SubLObject operator = cycl_utilities.el_formula_operator( pos_lit );
          if( NIL != cycl_tms_predicateP( operator ) || ( NIL != kb_utilities.kbeq( operator, $const73$performSubL ) && NIL != list_utilities.tree_find_if( $sym74$KB_TMS_METHOD_, pos_lit, UNPROVIDED ) ) )
          {
            witness = pos_lit;
          }
          csome_list_var = csome_list_var.rest();
          pos_lit = csome_list_var.first();
        }
      }
      return list_utilities.sublisp_boolean( witness );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 14464L)
  public static SubLObject cycl_tms_predicateP(final SubLObject operator)
  {
    return list_utilities.member_kbeqP( operator, $list75 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 14698L)
  public static SubLObject kb_tms_methodP(final SubLObject method)
  {
    return makeBoolean( NIL != subl_promotions.function_symbol_p( method ) && NIL != list_utilities.member_eqP( method, $list76 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 14959L)
  public static SubLObject backward_gafP(final SubLObject assertion)
  {
    return makeBoolean( NIL != gaf_assertionP( assertion ) && NIL != backward_assertionP( assertion ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 15083L)
  public static SubLObject forward_gafP(final SubLObject assertion)
  {
    return makeBoolean( NIL != gaf_assertionP( assertion ) && NIL != forward_assertionP( assertion ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 15204L)
  public static SubLObject assertion_type(final SubLObject assertion)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    if( NIL != gaf_assertionP( assertion ) )
    {
      return $kw77$GAF;
    }
    if( NIL != rule_assertionP( assertion ) )
    {
      return $kw78$RULE;
    }
    Errors.warn( $str79$Could_not_determine_assertion_typ, assertion );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 15549L)
  public static SubLObject assertion_has_mtP(final SubLObject assertion, final SubLObject mt)
  {
    return hlmt.hlmt_equal( mt, assertion_mt( assertion ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 15683L)
  public static SubLObject assertion_has_typeP(final SubLObject assertion, final SubLObject type)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    assert NIL != enumeration_types.assertion_type_p( type ) : type;
    return Equality.eq( type, assertion_type( assertion ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 15907L)
  public static SubLObject assertion_has_type(final SubLObject assertion, final SubLObject type)
  {
    return assertion_has_typeP( assertion, type );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 16045L)
  public static SubLObject ground_assertionP(final SubLObject assertion)
  {
    return makeBoolean( NIL != assertion_handles.assertion_p( assertion ) && ( NIL != gaf_assertionP( assertion ) || NIL != clauses.ground_clause_p( assertion_cnf( assertion ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 16285L)
  public static SubLObject atomic_assertionP(final SubLObject assertion)
  {
    return makeBoolean( NIL != assertion_handles.assertion_p( assertion ) && ( NIL != gaf_assertionP( assertion ) || NIL != clauses.atomic_clause_p( assertion_cnf( assertion ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 16528L)
  public static SubLObject meta_assertionP(final SubLObject assertion)
  {
    return makeBoolean( NIL != assertion_handles.assertion_p( assertion ) && NIL != list_utilities.tree_find_if( Symbols.symbol_function( $sym33$ASSERTION_P ), assertion_cons( assertion ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 16732L)
  public static SubLObject lifting_assertion_p(final SubLObject assertion)
  {
    return makeBoolean( NIL != rule_assertionP( assertion ) && NIL != clauses.lifting_clause_p( assertion_cnf( assertion ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 16971L)
  public static SubLObject assertion_forts(final SubLObject assertion, SubLObject penetrate_hl_structuresP, SubLObject subs_tooP, SubLObject include_mtP, SubLObject delete_duplicatesP)
  {
    if( penetrate_hl_structuresP == UNPROVIDED )
    {
      penetrate_hl_structuresP = T;
    }
    if( subs_tooP == UNPROVIDED )
    {
      subs_tooP = T;
    }
    if( include_mtP == UNPROVIDED )
    {
      include_mtP = T;
    }
    if( delete_duplicatesP == UNPROVIDED )
    {
      delete_duplicatesP = T;
    }
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    SubLObject result = cycl_utilities.formula_forts( assertion_cnf_or_gaf_hl_formula( assertion ), penetrate_hl_structuresP, subs_tooP, delete_duplicatesP );
    if( NIL != include_mtP )
    {
      final SubLObject mt_forts = cycl_utilities.expression_forts( assertion_mt( assertion ), penetrate_hl_structuresP, subs_tooP, UNPROVIDED );
      result = ConsesLow.append( result, mt_forts );
      if( NIL != delete_duplicatesP )
      {
        result = list_utilities.fast_delete_duplicates( result, Symbols.symbol_function( EQL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 17929L)
  public static SubLObject assertion_constants(final SubLObject assertion)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    return cycl_utilities.formula_constants( ConsesLow.list( assertion_cnf_or_gaf_hl_formula( assertion ), assertion_mt( assertion ) ), T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 18328L)
  public static SubLObject gaf_formula(final SubLObject assertion)
  {
    return gaf_hl_formula( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 18701L)
  public static SubLObject gaf_hl_formula(final SubLObject assertion)
  {
    assert NIL != gaf_assertionP( assertion ) : assertion;
    return assertion_gaf_hl_formula( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 18949L)
  public static SubLObject gaf_el_formula(final SubLObject assertion)
  {
    assert NIL != gaf_assertionP( assertion ) : assertion;
    return assertion_gaf_el_formula( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 19268L)
  public static SubLObject assertion_gaf_el_formula(final SubLObject assertion)
  {
    final SubLObject formula = assertion_gaf_hl_formula( assertion );
    return ( NIL != formula && $kw38$FALSE == assertion_truth( assertion ) ) ? cycl_utilities.negate( formula ) : formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 19628L)
  public static SubLObject gaf_args(final SubLObject assertion)
  {
    return cycl_utilities.formula_args( gaf_formula( assertion ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 19751L)
  public static SubLObject gaf_arg(final SubLObject assertion, final SubLObject n)
  {
    return ConsesLow.nth( n, gaf_formula( assertion ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 19922L)
  public static SubLObject gaf_predicate(final SubLObject assertion)
  {
    enforceType( assertion, $sym33$ASSERTION_P );
    return cycl_utilities.formula_arg0( gaf_hl_formula( assertion ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 20101L)
  public static SubLObject gaf_arg0(final SubLObject assertion)
  {
    enforceType( assertion, $sym33$ASSERTION_P );
    return cycl_utilities.formula_arg0( gaf_hl_formula( assertion ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 20287L)
  public static SubLObject gaf_arg1(final SubLObject assertion)
  {
    enforceType( assertion, $sym33$ASSERTION_P );
    return gaf_arg( assertion, ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 20437L)
  public static SubLObject gaf_arg2(final SubLObject assertion)
  {
    enforceType( assertion, $sym33$ASSERTION_P );
    return gaf_arg( assertion, TWO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 20587L)
  public static SubLObject gaf_arg3(final SubLObject assertion)
  {
    enforceType( assertion, $sym33$ASSERTION_P );
    return gaf_arg( assertion, THREE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 20737L)
  public static SubLObject gaf_arg4(final SubLObject assertion)
  {
    enforceType( assertion, $sym33$ASSERTION_P );
    return gaf_arg( assertion, FOUR_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 20887L)
  public static SubLObject gaf_arg5(final SubLObject assertion)
  {
    enforceType( assertion, $sym33$ASSERTION_P );
    return gaf_arg( assertion, FIVE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 21037L)
  public static SubLObject assertion_has_directionP(final SubLObject assertion, final SubLObject direction)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    assert NIL != enumeration_types.direction_p( direction ) : direction;
    return Equality.eq( direction, assertion_direction( assertion ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 21329L)
  public static SubLObject assertion_has_direction(final SubLObject assertion, final SubLObject direction)
  {
    return assertion_has_directionP( assertion, direction );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 21492L)
  public static SubLObject forward_assertionP(final SubLObject assertion)
  {
    return makeBoolean( NIL != assertion_handles.assertion_p( assertion ) && $kw101$FORWARD == assertion_direction( assertion ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 21720L)
  public static SubLObject backward_assertionP(final SubLObject assertion)
  {
    return makeBoolean( NIL != assertion_handles.assertion_p( assertion ) && $kw104$BACKWARD == assertion_direction( assertion ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 21951L)
  public static SubLObject code_assertionP(final SubLObject assertion)
  {
    return makeBoolean( NIL != assertion_handles.assertion_p( assertion ) && $kw107$CODE == assertion_direction( assertion ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 22170L)
  public static SubLObject assertion_has_truthP(final SubLObject assertion, final SubLObject truth)
  {
    enforceType( assertion, $sym33$ASSERTION_P );
    enforceType( truth, $sym110$TRUTH_P );
    return Equality.eq( assertion_truth( assertion ), truth );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 22447L)
  public static SubLObject assertion_has_truth(final SubLObject assertion, final SubLObject truth)
  {
    enforceType( assertion, $sym33$ASSERTION_P );
    enforceType( truth, $sym110$TRUTH_P );
    return assertion_has_truthP( assertion, truth );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 22681L)
  public static SubLObject assertion_date(final SubLObject assertion)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    final SubLObject day = asserted_when( assertion );
    final SubLObject second = asserted_second( assertion );
    if( NIL == day )
    {
      return NIL;
    }
    if( NIL == second )
    {
      return date_utilities.universal_date_to_cycl_date( day );
    }
    return date_utilities.extended_universal_date_to_cycl_date( Numbers.add( Numbers.multiply( day, $int117$1000000 ), second ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 22681L)
  public static SubLObject assertion_asserted_dateP(final SubLObject assertion, final SubLObject cycl_date)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    assert NIL != date_utilities.generalized_date_p( cycl_date ) : cycl_date;
    final SubLObject ass_date = assertion_date( assertion );
    return ( NIL != ass_date ) ? time_interval_utilities.date_interval_subsumesP( cycl_date, ass_date ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 22681L)
  public static SubLObject new_assertion_asserted_date_iterator(final SubLObject cycl_date)
  {
    assert NIL != date_utilities.generalized_date_p( cycl_date ) : cycl_date;
    final SubLObject input_iterator = assertion_handles.new_assertions_iterator();
    final SubLObject filter_args = ConsesLow.list( cycl_date );
    return iteration.new_filter_iterator( input_iterator, $sym119$ASSERTION_ASSERTED_DATE_, filter_args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 22681L)
  public static SubLObject all_assertions_asserted_date(final SubLObject cycl_date)
  {
    assert NIL != date_utilities.generalized_date_p( cycl_date ) : cycl_date;
    SubLObject assertions = NIL;
    final SubLObject iterator_var = new_assertion_asserted_date_iterator( cycl_date );
    SubLObject done_var = NIL;
    final SubLObject token_var = NIL;
    while ( NIL == done_var)
    {
      final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
      final SubLObject valid = makeBoolean( !token_var.eql( assertion ) );
      if( NIL != valid )
      {
        assertions = ConsesLow.cons( assertion, assertions );
      }
      done_var = makeBoolean( NIL == valid );
    }
    return Sequences.nreverse( assertions );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 24855L)
  public static SubLObject assertion_el_variables(final SubLObject assertion)
  {
    return Mapping.mapcar( Symbols.symbol_function( $sym120$INTERN_EL_VAR ), assertion_variable_names( assertion ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 25051L)
  public static SubLObject assertion_hl_variables(final SubLObject assertion)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    return ( NIL != gaf_assertionP( assertion ) ) ? NIL : variables.gather_hl_variables( assertion_cnf( assertion ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 25287L)
  public static SubLObject assertion_free_hl_variables(final SubLObject assertion)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    return backward_utilities.inference_clause_free_variables( assertion_cnf( assertion ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 25580L)
  public static SubLObject assertion_el_variable_to_hl(final SubLObject assertion, final SubLObject el_variable)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    assert NIL != cycl_grammar.el_variable_p( el_variable ) : el_variable;
    final SubLObject variable_names = assertion_variable_names( assertion );
    final SubLObject el_variable_name = cycl_variables.el_var_name( el_variable );
    final SubLObject hl_variable_id = Sequences.position( el_variable_name, variable_names, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != hl_variable_id )
    {
      return variables.find_variable_by_id( hl_variable_id );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 26071L)
  public static SubLObject assertion_hl_variable_to_el(final SubLObject assertion, final SubLObject variable)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    assert NIL != variables.variable_p( variable ) : variable;
    final SubLObject variable_names = assertion_variable_names( assertion );
    final SubLObject hl_variable_id = variables.variable_id( variable );
    final SubLObject el_variable_name = ConsesLow.nth( hl_variable_id, variable_names );
    if( el_variable_name.isString() )
    {
      return cycl_variables.make_el_var( el_variable_name );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 26541L)
  public static SubLObject assertion_hl_to_el_variable_map(final SubLObject assertion)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    return Mapping.mapcar( Symbols.symbol_function( $sym123$MAKE_VARIABLE_BINDING ), assertion_hl_variables( assertion ), new SubLObject[] { assertion_el_variables( assertion )
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 26842L)
  public static SubLObject timestamp_asserted_assertion(final SubLObject assertion, SubLObject who, SubLObject when, SubLObject why, SubLObject second)
  {
    if( who == UNPROVIDED )
    {
      who = NIL;
    }
    if( when == UNPROVIDED )
    {
      when = NIL;
    }
    if( why == UNPROVIDED )
    {
      why = NIL;
    }
    if( second == UNPROVIDED )
    {
      second = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != kb_control_vars.$recording_hl_transcript_operationsP$.getDynamicValue( thread ) )
    {
      kb_control_vars.record_hl_transcript_operation( ConsesLow.list( $sym124$TL_TIMESTAMP_ASSERTED_ASSERTION, canon_tl.tl_quotify( assertion ), list_utilities.quotify( who ), list_utilities.quotify( when ),
          list_utilities.quotify( why ), list_utilities.quotify( second ) ) );
    }
    return assertions_interface.kb_timestamp_asserted_assertion( assertion, who, when, why, second );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 27189L)
  public static SubLObject remove_asserted_assertion_timestamp(final SubLObject assertion)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    final SubLObject result = assertions_low.asserted_assertion_timestampedP( assertion );
    timestamp_asserted_assertion( assertion, NIL, NIL, NIL, NIL );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 27642L)
  public static SubLObject tl_timestamp_asserted_assertion(final SubLObject tl_assertion, final SubLObject who, final SubLObject when, final SubLObject why, final SubLObject second)
  {
    return timestamp_asserted_assertion( tl_find_assertion( tl_assertion ), canon_tl.transform_tl_terms_to_hl( who ), canon_tl.transform_tl_terms_to_hl( when ), canon_tl.transform_tl_terms_to_hl( why ), canon_tl
        .transform_tl_terms_to_hl( second ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 27926L)
  public static SubLObject tl_cache_assertion(final SubLObject tl_assertion, final SubLObject hl_assertion)
  {
    $tl_assertion_lookaside_table$.setGlobalValue( list_utilities.alist_capacity_enter_without_values( $tl_assertion_lookaside_table$.getGlobalValue(), tl_assertion, hl_assertion, $tl_assertion_capacity$
        .getGlobalValue(), Symbols.symbol_function( EQUAL ) ) );
    return tl_assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 28182L)
  public static SubLObject tl_find_assertion(final SubLObject tl_assertion)
  {
    SubLObject hl_assertion = list_utilities.alist_lookup_without_values( $tl_assertion_lookaside_table$.getGlobalValue(), tl_assertion, Symbols.symbol_function( EQUAL ), UNPROVIDED );
    if( NIL != hl_assertion )
    {
      $tl_assertion_lookaside_table$.setGlobalValue( list_utilities.alist_promote( $tl_assertion_lookaside_table$.getGlobalValue(), tl_assertion, Symbols.symbol_function( EQUAL ) ) );
    }
    else
    {
      hl_assertion = canon_tl.tl_term_to_hl( tl_assertion );
      tl_cache_assertion( tl_assertion, hl_assertion );
    }
    return hl_assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 28623L)
  public static SubLObject invalid_assertionP(final SubLObject assertion, SubLObject robustP)
  {
    if( robustP == UNPROVIDED )
    {
      robustP = NIL;
    }
    return makeBoolean( NIL != assertion_handles.assertion_p( assertion ) && NIL == assertion_handles.valid_assertionP( assertion, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 28884L)
  public static SubLObject invalid_assertion_robustP(final SubLObject assertion)
  {
    final SubLObject invalidP = makeBoolean( NIL != assertion_handles.assertion_p( assertion ) && NIL == assertions_low.valid_assertion_robustP( assertion ) );
    if( NIL == invalidP )
    {
      SubLObject cdolist_list_var;
      final SubLObject narts = cdolist_list_var = cycl_utilities.expression_gather( assertion, Symbols.symbol_function( $sym126$NART_P ), T, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      SubLObject nart = NIL;
      nart = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != narts_high.invalid_nart_robustP( nart ) )
        {
          return T;
        }
        cdolist_list_var = cdolist_list_var.rest();
        nart = cdolist_list_var.first();
      }
    }
    return invalidP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 29268L)
  public static SubLObject valid_assertion(final SubLObject assertion, SubLObject robustP)
  {
    if( robustP == UNPROVIDED )
    {
      robustP = NIL;
    }
    return assertion_handles.valid_assertionP( assertion, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 29456L)
  public static SubLObject invalid_assertion(final SubLObject assertion, SubLObject robustP)
  {
    if( robustP == UNPROVIDED )
    {
      robustP = NIL;
    }
    return invalid_assertionP( assertion, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 29637L)
  public static SubLObject assertion_id_from_recipe(final SubLObject cnf, final SubLObject mt)
  {
    final SubLObject assertion = kb_indexing.find_assertion( cnf, mt );
    return ( NIL != assertion_handles.assertion_p( assertion ) ) ? assertion_handles.assertion_id( assertion ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 29869L)
  public static SubLObject assertions_around_assertion(final SubLObject assertion, SubLObject total, SubLObject before, SubLObject after)
  {
    if( total == UNPROVIDED )
    {
      total = $int131$100;
    }
    if( before == UNPROVIDED )
    {
      before = ZERO_INTEGER;
    }
    if( after == UNPROVIDED )
    {
      after = Numbers.subtract( total, before );
    }
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    return assertions_around( assertion_handles.assertion_id( assertion ), total, before, after );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 30329L)
  public static SubLObject assertions_around(final SubLObject assertion_id, SubLObject total, SubLObject before, SubLObject after)
  {
    if( total == UNPROVIDED )
    {
      total = $int131$100;
    }
    if( before == UNPROVIDED )
    {
      before = ZERO_INTEGER;
    }
    if( after == UNPROVIDED )
    {
      after = Numbers.subtract( total, before );
    }
    assert NIL != subl_promotions.non_negative_integer_p( assertion_id ) : assertion_id;
    return kb_objects_around_id( $sym133$FIND_ASSERTION_BY_ID, ZERO_INTEGER, assertion_id, assertion_handles.next_assertion_id(), total, before, after );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 30840L)
  public static SubLObject kb_objects_around_id(final SubLObject lookup_method, final SubLObject min_id, SubLObject focal_id, final SubLObject high_limit, final SubLObject total, SubLObject before, SubLObject after)
  {
    SubLObject before_objects = NIL;
    SubLObject after_objects = NIL;
    SubLObject before_sofar = ZERO_INTEGER;
    SubLObject after_sofar = ZERO_INTEGER;
    focal_id = Numbers.max( ZERO_INTEGER, Numbers.min( focal_id, high_limit ) );
    before = Numbers.min( before, total );
    after = Numbers.min( after, total );
    SubLObject doneP = makeBoolean( before_sofar.numGE( before ) || focal_id.numLE( min_id ) );
    if( NIL == doneP )
    {
      SubLObject id;
      SubLObject v_object;
      for( id = NIL, id = number_utilities.f_1_( focal_id ); NIL == doneP; doneP = makeBoolean( before_sofar.numGE( before ) || id.numLE( min_id ) ), id = Numbers.add( id, MINUS_ONE_INTEGER ) )
      {
        v_object = Functions.funcall( lookup_method, id );
        if( NIL != v_object )
        {
          before_objects = ConsesLow.cons( v_object, before_objects );
          before_sofar = Numbers.add( before_sofar, ONE_INTEGER );
        }
      }
    }
    doneP = makeBoolean( after_sofar.numGE( after ) || focal_id.numGE( high_limit ) );
    if( NIL == doneP )
    {
      SubLObject id;
      SubLObject v_object;
      for( id = NIL, id = focal_id; NIL == doneP; doneP = makeBoolean( after_sofar.numGE( after ) || id.numGE( high_limit ) ), id = number_utilities.f_1X( id ) )
      {
        v_object = Functions.funcall( lookup_method, id );
        if( NIL != v_object )
        {
          after_objects = ConsesLow.cons( v_object, after_objects );
          after_sofar = Numbers.add( after_sofar, ONE_INTEGER );
        }
      }
    }
    return ConsesLow.nconc( before_objects, Sequences.nreverse( after_objects ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 31998L)
  public static SubLObject create_assertion(final SubLObject cnf, final SubLObject mt, SubLObject var_names, SubLObject direction, SubLObject truth, SubLObject strength, SubLObject asserted_argument)
  {
    if( var_names == UNPROVIDED )
    {
      var_names = NIL;
    }
    if( direction == UNPROVIDED )
    {
      direction = $kw104$BACKWARD;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw134$TRUE;
    }
    if( strength == UNPROVIDED )
    {
      strength = $kw135$DEFAULT;
    }
    if( asserted_argument == UNPROVIDED )
    {
      asserted_argument = NIL;
    }
    assert NIL != clauses.cnf_p( cnf ) : cnf;
    assert NIL != hlmt.hlmt_p( mt ) : mt;
    assert NIL != enumeration_types.direction_p( direction ) : direction;
    return create_assertion_int( cnf, mt, var_names, direction, truth, strength, asserted_argument );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 32592L)
  public static SubLObject create_gaf(final SubLObject gaf, final SubLObject mt, SubLObject direction, SubLObject truth, SubLObject strength, SubLObject asserted_argument)
  {
    if( direction == UNPROVIDED )
    {
      direction = $kw101$FORWARD;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw134$TRUE;
    }
    if( strength == UNPROVIDED )
    {
      strength = $kw135$DEFAULT;
    }
    if( asserted_argument == UNPROVIDED )
    {
      asserted_argument = NIL;
    }
    assert NIL != el_utilities.el_formula_p( gaf ) : gaf;
    assert NIL != hlmt.hlmt_p( mt ) : mt;
    assert NIL != enumeration_types.direction_p( direction ) : direction;
    return create_assertion_int( clause_utilities.make_gaf_cnf( gaf ), mt, NIL, direction, truth, strength, asserted_argument );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 32986L)
  public static SubLObject find_or_create_assertion(final SubLObject cnf, final SubLObject mt, SubLObject var_names, SubLObject direction, SubLObject truth, SubLObject strength, SubLObject asserted_argument)
  {
    if( var_names == UNPROVIDED )
    {
      var_names = NIL;
    }
    if( direction == UNPROVIDED )
    {
      direction = $kw104$BACKWARD;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw134$TRUE;
    }
    if( strength == UNPROVIDED )
    {
      strength = $kw135$DEFAULT;
    }
    if( asserted_argument == UNPROVIDED )
    {
      asserted_argument = NIL;
    }
    assert NIL != clauses.cnf_p( cnf ) : cnf;
    assert NIL != hlmt.hlmt_p( mt ) : mt;
    assert NIL != enumeration_types.direction_p( direction ) : direction;
    SubLObject new_assertionP = NIL;
    SubLObject assertion = kb_indexing.find_assertion( cnf, mt );
    if( NIL == assertion )
    {
      assertion = create_assertion( cnf, mt, var_names, direction, truth, strength, asserted_argument );
      new_assertionP = T;
    }
    return Values.values( assertion, new_assertionP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 33568L)
  public static SubLObject find_or_create_gaf(final SubLObject gaf, final SubLObject mt, SubLObject direction, SubLObject truth, SubLObject strength, SubLObject asserted_argument)
  {
    if( direction == UNPROVIDED )
    {
      direction = $kw101$FORWARD;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw134$TRUE;
    }
    if( strength == UNPROVIDED )
    {
      strength = $kw135$DEFAULT;
    }
    if( asserted_argument == UNPROVIDED )
    {
      asserted_argument = NIL;
    }
    assert NIL != hlmt.hlmt_p( mt ) : mt;
    assert NIL != enumeration_types.direction_p( direction ) : direction;
    final SubLObject assertion = kb_indexing.find_gaf( gaf, mt );
    return ( NIL != assertion ) ? assertion : create_gaf( gaf, mt, direction, truth, strength, asserted_argument );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 33988L)
  public static SubLObject create_assertion_int(final SubLObject cnf, final SubLObject mt, SubLObject var_names, SubLObject direction, SubLObject truth, SubLObject strength, SubLObject asserted_argument)
  {
    if( var_names == UNPROVIDED )
    {
      var_names = NIL;
    }
    if( direction == UNPROVIDED )
    {
      direction = ( NIL != clauses.gaf_cnfP( cnf ) ) ? $kw101$FORWARD : $kw104$BACKWARD;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw134$TRUE;
    }
    if( strength == UNPROVIDED )
    {
      strength = $kw135$DEFAULT;
    }
    if( asserted_argument == UNPROVIDED )
    {
      asserted_argument = NIL;
    }
    return assertions_interface.kb_create_assertion( cnf, mt, var_names, direction, truth, strength, asserted_argument );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 34451L)
  public static SubLObject remove_assertion(final SubLObject assertion)
  {
    return assertions_interface.kb_remove_assertion( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 34632L)
  public static SubLObject remove_broken_assertions()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject grand_total = ZERO_INTEGER;
    SubLObject passes = ZERO_INTEGER;
    SubLObject total;
    for( SubLObject doneP = NIL; NIL == doneP; doneP = Numbers.zerop( total ) )
    {
      passes = Numbers.add( passes, ONE_INTEGER );
      final SubLObject message = PrintLow.format( NIL, $str139$Removing_broken_assertions__pass_, passes );
      total = ZERO_INTEGER;
      final SubLObject idx = assertion_handles.do_assertions_table();
      final SubLObject mess = message;
      final SubLObject total_$5 = id_index.id_index_count( idx );
      SubLObject sofar = ZERO_INTEGER;
      assert NIL != Types.stringp( mess ) : mess;
      final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( mess );
          final SubLObject idx_$6 = idx;
          if( NIL == id_index.id_index_objects_empty_p( idx_$6, $kw141$SKIP ) )
          {
            final SubLObject idx_$7 = idx_$6;
            if( NIL == id_index.id_index_dense_objects_empty_p( idx_$7, $kw141$SKIP ) )
            {
              final SubLObject vector_var = id_index.id_index_dense_objects( idx_$7 );
              final SubLObject backwardP_var = NIL;
              SubLObject length;
              SubLObject v_iteration;
              SubLObject a_id;
              SubLObject a_handle;
              SubLObject ass;
              SubLObject id;
              SubLObject reason;
              for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
              {
                a_id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                a_handle = Vectors.aref( vector_var, a_id );
                if( NIL == id_index.id_index_tombstone_p( a_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw141$SKIP ) )
                {
                  if( NIL != id_index.id_index_tombstone_p( a_handle ) )
                  {
                    a_handle = $kw141$SKIP;
                  }
                  ass = assertion_handles.resolve_assertion_id_value_pair( a_id, a_handle );
                  id = assertion_handles.assertion_id( ass );
                  reason = possibly_remove_broken_assertion( ass );
                  if( $kw142$OK != reason )
                  {
                    PrintLow.format( T, $str143$_______removed_assertion___A__rea, id, reason );
                    total = Numbers.add( total, ONE_INTEGER );
                  }
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total_$5 );
                }
              }
            }
            final SubLObject idx_$8 = idx_$6;
            if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$8 ) || NIL == id_index.id_index_skip_tombstones_p( $kw141$SKIP ) )
            {
              final SubLObject sparse = id_index.id_index_sparse_objects( idx_$8 );
              SubLObject a_id2 = id_index.id_index_sparse_id_threshold( idx_$8 );
              final SubLObject end_id = id_index.id_index_next_id( idx_$8 );
              final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw141$SKIP ) ) ? NIL : $kw141$SKIP;
              while ( a_id2.numL( end_id ))
              {
                final SubLObject a_handle2 = Hashtables.gethash_without_values( a_id2, sparse, v_default );
                if( NIL == id_index.id_index_skip_tombstones_p( $kw141$SKIP ) || NIL == id_index.id_index_tombstone_p( a_handle2 ) )
                {
                  final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair( a_id2, a_handle2 );
                  final SubLObject id2 = assertion_handles.assertion_id( ass2 );
                  final SubLObject reason2 = possibly_remove_broken_assertion( ass2 );
                  if( $kw142$OK != reason2 )
                  {
                    PrintLow.format( T, $str143$_______removed_assertion___A__rea, id2, reason2 );
                    total = Numbers.add( total, ONE_INTEGER );
                  }
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total_$5 );
                }
                a_id2 = Numbers.add( a_id2, ONE_INTEGER );
              }
            }
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$9, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
      }
      grand_total = Numbers.add( grand_total, total );
    }
    return Values.values( grand_total, passes );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 35352L)
  public static SubLObject possibly_remove_broken_assertion(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    if( NIL != assertion_handles.valid_assertionP( assertion, UNPROVIDED ) )
    {
      SubLObject brokenP = NIL;
      SubLObject msg = NIL;
      SubLObject reason = $kw142$OK;
      try
      {
        thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( $sym144$CATCH_ERROR_MESSAGE_HANDLER, thread );
          try
          {
            final SubLObject cons = assertion_cons( assertion );
            final SubLObject mt = assertion_mt( assertion );
            final SubLObject variable_names = assertion_variable_names( assertion );
            if( $list145.equal( cons ) )
            {
              reason = $kw146$TAUTOLOGY;
            }
            else if( NIL == cons )
            {
              reason = $kw147$NO_SENTENCE;
            }
            else if( NIL != list_utilities.tree_find_if( Symbols.symbol_function( $sym148$INVALID_INDEXED_TERM_ ), cons, UNPROVIDED ) )
            {
              reason = $kw149$INVALID_SENTENCE_TERM;
            }
            else if( NIL != list_utilities.tree_find_if( Symbols.symbol_function( $sym148$INVALID_INDEXED_TERM_ ), mt, UNPROVIDED ) )
            {
              reason = $kw150$INVALID_MT_TERM;
            }
            else if( !variable_names.isList() )
            {
              reason = $kw151$BAD_VAR_NAMES;
            }
          }
          catch( final Throwable catch_var )
          {
            Errors.handleThrowable( catch_var, NIL );
          }
        }
        finally
        {
          Errors.$error_handler$.rebind( _prev_bind_0, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        msg = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      }
      finally
      {
        thread.throwStack.pop();
      }
      if( msg.isString() )
      {
        reason = $kw152$CANNOT_UNPACK;
      }
      brokenP = ( $kw142$OK == reason ) ? NIL : T;
      if( NIL != brokenP )
      {
        SubLObject ignore_errors_tag = NIL;
        try
        {
          thread.throwStack.push( $kw153$IGNORE_ERRORS_TARGET );
          final SubLObject _prev_bind_2 = Errors.$error_handler$.currentBinding( thread );
          try
          {
            Errors.$error_handler$.bind( Symbols.symbol_function( $sym154$IGNORE_ERRORS_HANDLER ), thread );
            try
            {
              final SubLObject _prev_bind_0_$10 = Errors.$continue_cerrorP$.currentBinding( thread );
              try
              {
                Errors.$continue_cerrorP$.bind( T, thread );
                try
                {
                  tms.tms_remove_assertion( assertion );
                }
                finally
                {
                  final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values = Values.getValuesAsVector();
                    if( NIL != assertion_handles.valid_assertionP( assertion, UNPROVIDED ) )
                    {
                      try
                      {
                        remove_assertion( assertion );
                      }
                      finally
                      {
                        final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                        try
                        {
                          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                          final SubLObject _values_$13 = Values.getValuesAsVector();
                          if( NIL != assertion_handles.valid_assertionP( assertion, UNPROVIDED ) )
                          {
                            assertion_handles.deregister_assertion_id( assertion_handles.assertion_id( assertion ) );
                          }
                          Values.restoreValuesFromVector( _values_$13 );
                        }
                        finally
                        {
                          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$12, thread );
                        }
                      }
                    }
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$11, thread );
                  }
                }
              }
              finally
              {
                Errors.$continue_cerrorP$.rebind( _prev_bind_0_$10, thread );
              }
            }
            catch( final Throwable catch_var2 )
            {
              Errors.handleThrowable( catch_var2, NIL );
            }
          }
          finally
          {
            Errors.$error_handler$.rebind( _prev_bind_2, thread );
          }
        }
        catch( final Throwable ccatch_env_var2 )
        {
          ignore_errors_tag = Errors.handleThrowable( ccatch_env_var2, $kw153$IGNORE_ERRORS_TARGET );
        }
        finally
        {
          thread.throwStack.pop();
        }
      }
      return reason;
    }
    return $kw155$NOT_AN_ASSERTION;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 36822L)
  public static SubLObject matching_argument_on_assertion(final SubLObject assertion, final SubLObject argument)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    assert NIL != arguments.argument_p( argument ) : argument;
    return Sequences.find( argument, assertion_arguments( assertion ), Symbols.symbol_function( $sym157$ARGUMENT_EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 37360L)
  public static SubLObject only_argument_of_assertion_p(final SubLObject assertion, final SubLObject argument)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    assert NIL != arguments.argument_p( argument ) : argument;
    return makeBoolean( NIL == assertion_has_some_argument_other_thanP( assertion, argument ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 37691L)
  public static SubLObject assertion_has_some_argument_other_thanP(final SubLObject assertion, final SubLObject argument)
  {
    return subl_promotions.memberP( argument, assertion_arguments( assertion ), $sym158$NOT_EQL, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 37837L)
  public static SubLObject asserted_assertionP(final SubLObject assertion)
  {
    enforceType( assertion, $sym33$ASSERTION_P );
    return list_utilities.sublisp_boolean( Sequences.find_if( Symbols.symbol_function( $sym159$ASSERTED_ARGUMENT_P ), assertion_arguments( assertion ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 38137L)
  public static SubLObject deduced_assertionP(final SubLObject assertion)
  {
    enforceType( assertion, $sym33$ASSERTION_P );
    return list_utilities.sublisp_boolean( Sequences.find_if( Symbols.symbol_function( $sym162$DEDUCTION_P ), assertion_arguments( assertion ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 38393L)
  public static SubLObject only_deduced_assertionP(final SubLObject assertion)
  {
    return makeBoolean( NIL != deduced_assertionP( assertion ) && NIL == asserted_assertionP( assertion ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 38604L)
  public static SubLObject forward_deduced_assertionP(final SubLObject assertion, SubLObject include_code_deduced_assertionsP)
  {
    if( include_code_deduced_assertionsP == UNPROVIDED )
    {
      include_code_deduced_assertionsP = T;
    }
    return list_utilities.sublisp_boolean( Sequences.find_if( ( NIL != include_code_deduced_assertionsP ) ? Symbols.symbol_function( $sym165$FORWARD_DEDUCTION_ )
        : Symbols.symbol_function( $sym166$FORWARD_NOT_CODE_DEDUCTION_ ), assertion_arguments( assertion ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 39043L)
  public static SubLObject get_asserted_argument(final SubLObject assertion)
  {
    enforceType( assertion, $sym33$ASSERTION_P );
    return Sequences.find_if( Symbols.symbol_function( $sym159$ASSERTED_ARGUMENT_P ), assertion_arguments( assertion ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 39391L)
  public static SubLObject get_asserted_argument_and_more(final SubLObject assertion)
  {
    final SubLObject v_arguments = assertion_arguments( assertion );
    final SubLObject asserted_argument = Sequences.find_if( Symbols.symbol_function( $sym159$ASSERTED_ARGUMENT_P ), v_arguments, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject last_argumentP = ( NIL != asserted_argument ) ? list_utilities.singletonP( v_arguments ) : NIL;
    return Values.values( asserted_argument, last_argumentP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 39693L)
  public static SubLObject assertion_deductions(final SubLObject assertion)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    return list_utilities.remove_if_not( Symbols.symbol_function( $sym162$DEDUCTION_P ), assertion_arguments( assertion ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 39919L)
  public static SubLObject assertion_dependent_count(final SubLObject assertion)
  {
    return assertions_low.assertion_dependent_count_internal( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 40208L)
  public static SubLObject assertion_has_dependents_p(final SubLObject assertion)
  {
    enforceType( assertion, $sym33$ASSERTION_P );
    return assertions_low.assertion_has_dependents_p_internal( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 40444L)
  public static SubLObject random_assertion(SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( $sym172$TRUE );
    }
    return assertions_low.random_assertion_internal( test );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 40608L)
  public static SubLObject sample_assertions(SubLObject n, SubLObject allow_repeatsP, SubLObject test)
  {
    if( n == UNPROVIDED )
    {
      n = $int173$500;
    }
    if( allow_repeatsP == UNPROVIDED )
    {
      allow_repeatsP = NIL;
    }
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( $sym172$TRUE );
    }
    assert NIL != subl_promotions.non_negative_integer_p( n ) : n;
    if( NIL != allow_repeatsP )
    {
      SubLObject result = NIL;
      SubLObject i;
      for( i = NIL, i = ZERO_INTEGER; i.numL( n ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        result = ConsesLow.cons( random_assertion( test ), result );
      }
      return result;
    }
    SubLObject result;
    for( result = set_contents.new_set_contents( n, Symbols.symbol_function( EQL ) ); set_contents.set_contents_size( result ).numL( n ); result = set_contents.set_contents_add( random_assertion( test ), result, Symbols
        .symbol_function( EQL ) ) )
    {
    }
    return set_contents.set_contents_element_list( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 41202L)
  public static SubLObject random_rule()
  {
    return assertions_low.random_rule_internal();
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 41265L)
  public static SubLObject random_gaf()
  {
    return assertions_low.random_gaf_internal();
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 41326L)
  public static SubLObject assertion_checkpoint_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != list_utilities.proper_list_p( v_object ) && NIL != list_utilities.lengthE( v_object, TWO_INTEGER, UNPROVIDED ) && NIL != list_utilities.every_in_list( $sym132$NON_NEGATIVE_INTEGER_P,
        v_object, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 41618L)
  public static SubLObject new_assertion_checkpoint()
  {
    final SubLObject assertion_count = assertion_handles.assertion_count();
    final SubLObject next_assertion_id = assertion_handles.next_assertion_id();
    return ConsesLow.list( assertion_count, next_assertion_id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 41875L)
  public static SubLObject assertion_checkpoint_currentP(final SubLObject assertion_checkpoint)
  {
    SubLObject checkpoint_count = NIL;
    SubLObject checkpoint_next_id = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( assertion_checkpoint, assertion_checkpoint, $list174 );
    checkpoint_count = assertion_checkpoint.first();
    SubLObject current = assertion_checkpoint.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, assertion_checkpoint, $list174 );
    checkpoint_next_id = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return makeBoolean( checkpoint_count.numE( assertion_handles.assertion_count() ) && checkpoint_next_id.numE( assertion_handles.next_assertion_id() ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( assertion_checkpoint, $list174 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 42315L)
  public static SubLObject with_assertion_dump_id_table(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym14$CLET, $list175, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 42527L)
  public static SubLObject assertion_dump_id(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject id = assertion_handles.assertion_id( assertion );
    final SubLObject dump_table = $assertion_dump_id_table$.getDynamicValue( thread );
    if( NIL != dump_table )
    {
      id = id_index.id_index_lookup( dump_table, id, UNPROVIDED );
    }
    return id;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 42797L)
  public static SubLObject find_assertion_by_dump_id(final SubLObject dump_id)
  {
    return assertion_handles.find_assertion_by_id( dump_id );
  }

  public static SubLObject declare_assertions_high_file()
  {
    SubLFiles.declareMacro(me, "do_assertion_arguments", "DO-ASSERTION-ARGUMENTS" );
    SubLFiles.declareMacro(me, "do_assertion_dependents", "DO-ASSERTION-DEPENDENTS" );
    SubLFiles.declareMacro(me, "do_assertion_literals", "DO-ASSERTION-LITERALS" );
    SubLFiles.declareMacro(me, "do_recent_assertions", "DO-RECENT-ASSERTIONS" );
    SubLFiles.declareFunction(me, "assertion_cnf", "ASSERTION-CNF", 1, 0, false );
    SubLFiles.declareFunction(me, "intuitive_assertion_cnf", "INTUITIVE-ASSERTION-CNF", 1, 0, false );
    SubLFiles.declareFunction(me, "intuitive_cnf", "INTUITIVE-CNF", 2, 0, false );
    SubLFiles.declareFunction(me, "possibly_assertion_cnf", "POSSIBLY-ASSERTION-CNF", 1, 0, false );
    SubLFiles.declareFunction(me, "assertion_mt", "ASSERTION-MT", 1, 0, false );
    new $assertion_mt$UnaryFunction();
    SubLFiles.declareFunction(me, "assertion_gaf_hl_formula", "ASSERTION-GAF-HL-FORMULA", 1, 0, false );
    SubLFiles.declareFunction(me, "assertion_cons", "ASSERTION-CONS", 1, 0, false );
    SubLFiles.declareFunction(me, "gaf_assertionP", "GAF-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction(me, "rule_assertionP", "RULE-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction(me, "assertion_direction", "ASSERTION-DIRECTION", 1, 0, false );
    SubLFiles.declareFunction(me, "assertion_truth", "ASSERTION-TRUTH", 1, 0, false );
    SubLFiles.declareFunction(me, "assertion_strength", "ASSERTION-STRENGTH", 1, 0, false );
    SubLFiles.declareFunction(me, "assertion_variable_names", "ASSERTION-VARIABLE-NAMES", 1, 0, false );
    SubLFiles.declareFunction(me, "asserted_by", "ASSERTED-BY", 1, 0, false );
    SubLFiles.declareFunction(me, "asserted_when", "ASSERTED-WHEN", 1, 0, false );
    SubLFiles.declareFunction(me, "asserted_why", "ASSERTED-WHY", 1, 0, false );
    SubLFiles.declareFunction(me, "asserted_second", "ASSERTED-SECOND", 1, 0, false );
    SubLFiles.declareFunction(me, "assertion_arguments", "ASSERTION-ARGUMENTS", 1, 0, false );
    SubLFiles.declareFunction(me, "assertion_dependents", "ASSERTION-DEPENDENTS", 1, 0, false );
    SubLFiles.declareFunction(me, "assertion_dependent_list", "ASSERTION-DEPENDENT-LIST", 1, 0, false );
    SubLFiles.declareFunction(me, "cyc_assertion_tv", "CYC-ASSERTION-TV", 1, 0, false );
    SubLFiles.declareFunction(me, "assertion_formula", "ASSERTION-FORMULA", 1, 0, false );
    new $assertion_formula$UnaryFunction();
    SubLFiles.declareFunction(me, "assertion_ist_formula", "ASSERTION-IST-FORMULA", 1, 0, false );
    SubLFiles.declareFunction(me, "assertion_ist_sentence", "ASSERTION-IST-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction(me, "assertion_to_hl_assertion_spec", "ASSERTION-TO-HL-ASSERTION-SPEC", 1, 0, false );
    SubLFiles.declareFunction(me, "assertion_to_hl_assertibles", "ASSERTION-TO-HL-ASSERTIBLES", 1, 0, false );
    SubLFiles.declareFunction(me, "assertion_mentions_termP", "ASSERTION-MENTIONS-TERM?", 2, 0, false );
    SubLFiles.declareFunction(me, "assertion_mentions_term", "ASSERTION-MENTIONS-TERM", 2, 0, false );
    SubLFiles.declareFunction(me, "assertion_cnf_or_gaf_hl_formula", "ASSERTION-CNF-OR-GAF-HL-FORMULA", 1, 0, false );
    SubLFiles.declareFunction(me, "backward_ruleP", "BACKWARD-RULE?", 1, 0, false );
    SubLFiles.declareFunction(me, "forward_ruleP", "FORWARD-RULE?", 1, 0, false );
    SubLFiles.declareFunction(me, "single_literal_ruleP", "SINGLE-LITERAL-RULE?", 1, 0, false );
    SubLFiles.declareFunction(me, "single_literal_antecedent_ruleP", "SINGLE-LITERAL-ANTECEDENT-RULE?", 1, 0, false );
    SubLFiles.declareFunction(me, "two_literal_antecedent_ruleP", "TWO-LITERAL-ANTECEDENT-RULE?", 1, 0, false );
    SubLFiles.declareFunction(me, "forward_tms_ruleP", "FORWARD-TMS-RULE?", 1, 0, false );
    SubLFiles.declareFunction(me, "cycl_tms_predicateP", "CYCL-TMS-PREDICATE?", 1, 0, false );
    SubLFiles.declareFunction(me, "kb_tms_methodP", "KB-TMS-METHOD?", 1, 0, false );
    SubLFiles.declareFunction(me, "backward_gafP", "BACKWARD-GAF?", 1, 0, false );
    SubLFiles.declareFunction(me, "forward_gafP", "FORWARD-GAF?", 1, 0, false );
    SubLFiles.declareFunction(me, "assertion_type", "ASSERTION-TYPE", 1, 0, false );
    SubLFiles.declareFunction(me, "assertion_has_mtP", "ASSERTION-HAS-MT?", 2, 0, false );
    SubLFiles.declareFunction(me, "assertion_has_typeP", "ASSERTION-HAS-TYPE?", 2, 0, false );
    SubLFiles.declareFunction(me, "assertion_has_type", "ASSERTION-HAS-TYPE", 2, 0, false );
    SubLFiles.declareFunction(me, "ground_assertionP", "GROUND-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction(me, "atomic_assertionP", "ATOMIC-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction(me, "meta_assertionP", "META-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction(me, "lifting_assertion_p", "LIFTING-ASSERTION-P", 1, 0, false );
    SubLFiles.declareFunction(me, "assertion_forts", "ASSERTION-FORTS", 1, 4, false );
    SubLFiles.declareFunction(me, "assertion_constants", "ASSERTION-CONSTANTS", 1, 0, false );
    SubLFiles.declareFunction(me, "gaf_formula", "GAF-FORMULA", 1, 0, false );
    new $gaf_formula$UnaryFunction();
    SubLFiles.declareFunction(me, "gaf_hl_formula", "GAF-HL-FORMULA", 1, 0, false );
    SubLFiles.declareFunction(me, "gaf_el_formula", "GAF-EL-FORMULA", 1, 0, false );
    SubLFiles.declareFunction(me, "assertion_gaf_el_formula", "ASSERTION-GAF-EL-FORMULA", 1, 0, false );
    SubLFiles.declareFunction(me, "gaf_args", "GAF-ARGS", 1, 0, false );
    SubLFiles.declareFunction(me, "gaf_arg", "GAF-ARG", 2, 0, false );
    SubLFiles.declareFunction(me, "gaf_predicate", "GAF-PREDICATE", 1, 0, false );
    SubLFiles.declareFunction(me, "gaf_arg0", "GAF-ARG0", 1, 0, false );
    SubLFiles.declareFunction(me, "gaf_arg1", "GAF-ARG1", 1, 0, false );
    SubLFiles.declareFunction(me, "gaf_arg2", "GAF-ARG2", 1, 0, false );
    SubLFiles.declareFunction(me, "gaf_arg3", "GAF-ARG3", 1, 0, false );
    SubLFiles.declareFunction(me, "gaf_arg4", "GAF-ARG4", 1, 0, false );
    SubLFiles.declareFunction(me, "gaf_arg5", "GAF-ARG5", 1, 0, false );
    SubLFiles.declareFunction(me, "assertion_has_directionP", "ASSERTION-HAS-DIRECTION?", 2, 0, false );
    SubLFiles.declareFunction(me, "assertion_has_direction", "ASSERTION-HAS-DIRECTION", 2, 0, false );
    SubLFiles.declareFunction(me, "forward_assertionP", "FORWARD-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction(me, "backward_assertionP", "BACKWARD-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction(me, "code_assertionP", "CODE-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction(me, "assertion_has_truthP", "ASSERTION-HAS-TRUTH?", 2, 0, false );
    SubLFiles.declareFunction(me, "assertion_has_truth", "ASSERTION-HAS-TRUTH", 2, 0, false );
    SubLFiles.declareFunction(me, "assertion_date", "ASSERTION-DATE", 1, 0, false );
    SubLFiles.declareFunction(me, "assertion_asserted_dateP", "ASSERTION-ASSERTED-DATE?", 2, 0, false );
    SubLFiles.declareFunction(me, "new_assertion_asserted_date_iterator", "NEW-ASSERTION-ASSERTED-DATE-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction(me, "all_assertions_asserted_date", "ALL-ASSERTIONS-ASSERTED-DATE", 1, 0, false );
    SubLFiles.declareFunction(me, "assertion_el_variables", "ASSERTION-EL-VARIABLES", 1, 0, false );
    SubLFiles.declareFunction(me, "assertion_hl_variables", "ASSERTION-HL-VARIABLES", 1, 0, false );
    SubLFiles.declareFunction(me, "assertion_free_hl_variables", "ASSERTION-FREE-HL-VARIABLES", 1, 0, false );
    SubLFiles.declareFunction(me, "assertion_el_variable_to_hl", "ASSERTION-EL-VARIABLE-TO-HL", 2, 0, false );
    SubLFiles.declareFunction(me, "assertion_hl_variable_to_el", "ASSERTION-HL-VARIABLE-TO-EL", 2, 0, false );
    SubLFiles.declareFunction(me, "assertion_hl_to_el_variable_map", "ASSERTION-HL-TO-EL-VARIABLE-MAP", 1, 0, false );
    SubLFiles.declareFunction(me, "timestamp_asserted_assertion", "TIMESTAMP-ASSERTED-ASSERTION", 1, 4, false );
    SubLFiles.declareFunction(me, "remove_asserted_assertion_timestamp", "REMOVE-ASSERTED-ASSERTION-TIMESTAMP", 1, 0, false );
    SubLFiles.declareFunction(me, "tl_timestamp_asserted_assertion", "TL-TIMESTAMP-ASSERTED-ASSERTION", 5, 0, false );
    SubLFiles.declareFunction(me, "tl_cache_assertion", "TL-CACHE-ASSERTION", 2, 0, false );
    SubLFiles.declareFunction(me, "tl_find_assertion", "TL-FIND-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction(me, "invalid_assertionP", "INVALID-ASSERTION?", 1, 1, false );
    new $invalid_assertionP$UnaryFunction();
    new $invalid_assertionP$BinaryFunction();
    SubLFiles.declareFunction(me, "invalid_assertion_robustP", "INVALID-ASSERTION-ROBUST?", 1, 0, false );
    SubLFiles.declareFunction(me, "valid_assertion", "VALID-ASSERTION", 1, 1, false );
    new $valid_assertion$UnaryFunction();
    new $valid_assertion$BinaryFunction();
    SubLFiles.declareFunction(me, "invalid_assertion", "INVALID-ASSERTION", 1, 1, false );
    SubLFiles.declareFunction(me, "assertion_id_from_recipe", "ASSERTION-ID-FROM-RECIPE", 2, 0, false );
    SubLFiles.declareFunction(me, "assertions_around_assertion", "ASSERTIONS-AROUND-ASSERTION", 1, 3, false );
    SubLFiles.declareFunction(me, "assertions_around", "ASSERTIONS-AROUND", 1, 3, false );
    SubLFiles.declareFunction(me, "kb_objects_around_id", "KB-OBJECTS-AROUND-ID", 7, 0, false );
    SubLFiles.declareFunction(me, "create_assertion", "CREATE-ASSERTION", 2, 5, false );
    SubLFiles.declareFunction(me, "create_gaf", "CREATE-GAF", 2, 4, false );
    SubLFiles.declareFunction(me, "find_or_create_assertion", "FIND-OR-CREATE-ASSERTION", 2, 5, false );
    SubLFiles.declareFunction(me, "find_or_create_gaf", "FIND-OR-CREATE-GAF", 2, 4, false );
    SubLFiles.declareFunction(me, "create_assertion_int", "CREATE-ASSERTION-INT", 2, 5, false );
    SubLFiles.declareFunction(me, "remove_assertion", "REMOVE-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction(me, "remove_broken_assertions", "REMOVE-BROKEN-ASSERTIONS", 0, 0, false );
    SubLFiles.declareFunction(me, "possibly_remove_broken_assertion", "POSSIBLY-REMOVE-BROKEN-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction(me, "matching_argument_on_assertion", "MATCHING-ARGUMENT-ON-ASSERTION", 2, 0, false );
    SubLFiles.declareFunction(me, "only_argument_of_assertion_p", "ONLY-ARGUMENT-OF-ASSERTION-P", 2, 0, false );
    SubLFiles.declareFunction(me, "assertion_has_some_argument_other_thanP", "ASSERTION-HAS-SOME-ARGUMENT-OTHER-THAN?", 2, 0, false );
    SubLFiles.declareFunction(me, "asserted_assertionP", "ASSERTED-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction(me, "deduced_assertionP", "DEDUCED-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction(me, "only_deduced_assertionP", "ONLY-DEDUCED-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction(me, "forward_deduced_assertionP", "FORWARD-DEDUCED-ASSERTION?", 1, 1, false );
    SubLFiles.declareFunction(me, "get_asserted_argument", "GET-ASSERTED-ARGUMENT", 1, 0, false );
    SubLFiles.declareFunction(me, "get_asserted_argument_and_more", "GET-ASSERTED-ARGUMENT-AND-MORE", 1, 0, false );
    SubLFiles.declareFunction(me, "assertion_deductions", "ASSERTION-DEDUCTIONS", 1, 0, false );
    SubLFiles.declareFunction(me, "assertion_dependent_count", "ASSERTION-DEPENDENT-COUNT", 1, 0, false );
    SubLFiles.declareFunction(me, "assertion_has_dependents_p", "ASSERTION-HAS-DEPENDENTS-P", 1, 0, false );
    SubLFiles.declareFunction(me, "random_assertion", "RANDOM-ASSERTION", 0, 1, false );
    SubLFiles.declareFunction(me, "sample_assertions", "SAMPLE-ASSERTIONS", 0, 3, false );
    SubLFiles.declareFunction(me, "random_rule", "RANDOM-RULE", 0, 0, false );
    SubLFiles.declareFunction(me, "random_gaf", "RANDOM-GAF", 0, 0, false );
    SubLFiles.declareFunction(me, "assertion_checkpoint_p", "ASSERTION-CHECKPOINT-P", 1, 0, false );
    SubLFiles.declareFunction(me, "new_assertion_checkpoint", "NEW-ASSERTION-CHECKPOINT", 0, 0, false );
    SubLFiles.declareFunction(me, "assertion_checkpoint_currentP", "ASSERTION-CHECKPOINT-CURRENT?", 1, 0, false );
    SubLFiles.declareMacro(me, "with_assertion_dump_id_table", "WITH-ASSERTION-DUMP-ID-TABLE" );
    SubLFiles.declareFunction(me, "assertion_dump_id", "ASSERTION-DUMP-ID", 1, 0, false );
    SubLFiles.declareFunction(me, "find_assertion_by_dump_id", "FIND-ASSERTION-BY-DUMP-ID", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_assertions_high_file()
  {
    $tl_assertion_lookaside_table$ = SubLFiles.deflexical( "*TL-ASSERTION-LOOKASIDE-TABLE*", ( maybeDefault( $sym125$_TL_ASSERTION_LOOKASIDE_TABLE_, $tl_assertion_lookaside_table$, NIL ) ) );
    $tl_assertion_capacity$ = SubLFiles.deflexical( "*TL-ASSERTION-CAPACITY*", FIVE_INTEGER );
    $assertion_dump_id_table$ = SubLFiles.defparameter( "*ASSERTION-DUMP-ID-TABLE*", NIL );
    return NIL;
  }

  public static SubLObject setup_assertions_high_file()
  {
    utilities_macros.register_cyc_api_function( $sym20$ASSERTION_CNF, $list34, $str35$Return_the_cnf_of_ASSERTION______, $list36, $list37 );
    utilities_macros.register_cyc_api_function( $sym39$ASSERTION_MT, $list34, $str40$Return_the_mt_of_ASSERTION_, $list36, $list41 );
    utilities_macros.register_cyc_api_function( $sym42$ASSERTION_DIRECTION, $list34, $str43$Return_the_direction_of_ASSERTION, $list36, $list44 );
    utilities_macros.register_cyc_api_function( $sym45$ASSERTION_TRUTH, $list34, $str46$Return_the_current_truth_of_ASSER, $list36, $list47 );
    utilities_macros.register_cyc_api_function( $sym48$ASSERTION_STRENGTH, $list34, $str49$Return_the_current_argumentation_, $list36, $list50 );
    utilities_macros.register_cyc_api_function( $sym51$ASSERTION_VARIABLE_NAMES, $list34, $str52$Return_the_variable_names_for_ASS, $list36, $list53 );
    utilities_macros.register_cyc_api_function( $sym54$ASSERTED_BY, $list34, $str55$Returns_the_cyclist_who_asserted_, $list36, NIL );
    utilities_macros.register_cyc_api_function( $sym56$ASSERTED_WHEN, $list34, $str57$Returns_the_day_when_ASSERTION_wa, $list36, $list58 );
    utilities_macros.register_cyc_api_function( $sym59$ASSERTION_FORMULA, $list34, $str60$Return_a_formula_for_ASSERTION_, $list36, $list61 );
    utilities_macros.register_cyc_api_function( $sym63$ASSERTION_IST_FORMULA, $list34, $str64$Return_a_formula_in___ist_format_, $list36, $list61 );
    utilities_macros.register_cyc_api_function( $sym66$ASSERTION_MENTIONS_TERM_, $list67, $str68$Return_T_iff_ASSERTION_s_formula_, $list69, $list70 );
    utilities_macros.register_obsolete_cyc_api_function( $sym71$ASSERTION_MENTIONS_TERM, NIL, $list67, $str72$_see_assertion_mentions_term_, $list69, $list70 );
    access_macros.define_obsolete_register( $sym81$ASSERTION_HAS_TYPE, $list82 );
    utilities_macros.register_cyc_api_function( $sym84$GAF_PREDICATE, $list34, $str85$Return_the_predicate_of_gaf_ASSER, $list36, NIL );
    utilities_macros.register_cyc_api_function( $sym86$GAF_ARG0, $list34, $str87$Return_arg_0__the_predicate__of_t, $list36, NIL );
    utilities_macros.register_cyc_api_function( $sym88$GAF_ARG1, $list34, $str89$Return_arg_1_of_the_gaf_ASSERTION, $list36, NIL );
    utilities_macros.register_cyc_api_function( $sym90$GAF_ARG2, $list34, $str91$Return_arg_2_of_the_gaf_ASSERTION, $list36, NIL );
    utilities_macros.register_cyc_api_function( $sym92$GAF_ARG3, $list34, $str93$Return_arg_3_of_the_gaf_ASSERTION, $list36, NIL );
    utilities_macros.register_cyc_api_function( $sym94$GAF_ARG4, $list34, $str95$Return_arg_4_of_the_gaf_ASSERTION, $list36, NIL );
    utilities_macros.register_cyc_api_function( $sym96$GAF_ARG5, $list34, $str97$Return_arg_5_of_the_gaf_ASSERTION, $list36, NIL );
    access_macros.define_obsolete_register( $sym99$ASSERTION_HAS_DIRECTION, $list100 );
    utilities_macros.register_cyc_api_function( $sym102$FORWARD_ASSERTION_, $list34, $str103$Predicate_returns_T_iff_ASSERTION, NIL, $list70 );
    utilities_macros.register_cyc_api_function( $sym105$BACKWARD_ASSERTION_, $list34, $str106$Predicate_returns_T_iff_ASSERTION, NIL, $list70 );
    utilities_macros.register_cyc_api_function( $sym108$CODE_ASSERTION_, $list34, $str109$Predicate_returns_T_iff_ASSERTION, NIL, $list70 );
    utilities_macros.register_cyc_api_function( $sym111$ASSERTION_HAS_TRUTH_, $list112, $str113$Return_T_iff_ASSERTION_s_current_, $list114, $list70 );
    utilities_macros.register_obsolete_cyc_api_function( $sym115$ASSERTION_HAS_TRUTH, NIL, $list112, $str116$_see_assertion_has_truth_, $list114, $list70 );
    subl_macro_promotions.declare_defglobal( $sym125$_TL_ASSERTION_LOOKASIDE_TABLE_ );
    access_macros.define_obsolete_register( $sym127$VALID_ASSERTION, $list128 );
    access_macros.define_obsolete_register( $sym129$INVALID_ASSERTION, $list130 );
    utilities_macros.register_cyc_api_function( $sym160$ASSERTED_ASSERTION_, $list34, $str161$Return_non_nil_IFF_assertion_has_, $list36, $list70 );
    utilities_macros.register_cyc_api_function( $sym163$DEDUCED_ASSERTION_, $list34, $str164$Return_non_nil_IFF_assertion_has_, $list36, $list70 );
    utilities_macros.register_cyc_api_function( $sym167$GET_ASSERTED_ARGUMENT, $list34, $str168$Return_the_asserted_argument_for_, $list36, $list169 );
    utilities_macros.register_cyc_api_function( $sym170$ASSERTION_HAS_DEPENDENTS_P, $list34, $str171$Return_non_nil_IFF_assertion_has_, $list36, $list70 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_assertions_high_file();
  }

  @Override
  public void initializeVariables()
  {
    init_assertions_high_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_assertions_high_file();
  }
  static
  {
    me = new assertions_high();
    $tl_assertion_lookaside_table$ = null;
    $tl_assertion_capacity$ = null;
    $assertion_dump_id_table$ = null;
    $list0 = ConsesLow.list( ConsesLow.list( makeSymbol( "ARGUMENT-VAR" ), makeSymbol( "ASSERTION" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list1 = ConsesLow.list( makeKeyword( "DONE" ) );
    $kw2$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw3$DONE = makeKeyword( "DONE" );
    $sym4$DO_LIST = makeSymbol( "DO-LIST" );
    $sym5$ASSERTION_ARGUMENTS = makeSymbol( "ASSERTION-ARGUMENTS" );
    $list6 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEDUCTION-VAR" ), makeSymbol( "ASSERTION" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym7$DO_SET_CONTENTS = makeSymbol( "DO-SET-CONTENTS" );
    $sym8$ASSERTION_DEPENDENTS = makeSymbol( "ASSERTION-DEPENDENTS" );
    $list9 = ConsesLow.list( ConsesLow.list( makeSymbol( "LIT-VAR" ), makeSymbol( "ASSERTION" ), makeSymbol( "&KEY" ), makeSymbol( "SENSE" ), makeSymbol( "PREDICATE" ), makeSymbol( "DONE" ) ), SubLObjectFactory
        .makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list10 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "PREDICATE" ), makeKeyword( "DONE" ) );
    $kw11$SENSE = makeKeyword( "SENSE" );
    $kw12$PREDICATE = makeKeyword( "PREDICATE" );
    $sym13$PREDICATE_VAR = makeUninternedSymbol( "PREDICATE-VAR" );
    $sym14$CLET = makeSymbol( "CLET" );
    $sym15$DO_ASSERTION_LITERALS = makeSymbol( "DO-ASSERTION-LITERALS" );
    $sym16$PWHEN = makeSymbol( "PWHEN" );
    $sym17$ATOMIC_SENTENCE_PREDICATE = makeSymbol( "ATOMIC-SENTENCE-PREDICATE" );
    $sym18$CNF_VAR = makeUninternedSymbol( "CNF-VAR" );
    $sym19$ASSERTION_VAR = makeUninternedSymbol( "ASSERTION-VAR" );
    $sym20$ASSERTION_CNF = makeSymbol( "ASSERTION-CNF" );
    $sym21$DO_ALL_LITS_AS_ASENTS = makeSymbol( "DO-ALL-LITS-AS-ASENTS" );
    $list22 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "&KEY" ), makeSymbol( "NUM" ), ConsesLow.list( makeSymbol( "PROGRESS-MESSAGE" ), makeString( "mapping assertions for sweep" ) ),
        SubLObjectFactory.makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list23 = ConsesLow.list( makeKeyword( "NUM" ), makeKeyword( "PROGRESS-MESSAGE" ), makeKeyword( "DONE" ) );
    $kw24$NUM = makeKeyword( "NUM" );
    $kw25$PROGRESS_MESSAGE = makeKeyword( "PROGRESS-MESSAGE" );
    $str26$mapping_assertions_for_sweep = makeString( "mapping assertions for sweep" );
    $sym27$PIF = makeSymbol( "PIF" );
    $sym28$POSITIVE_INTEGER_P = makeSymbol( "POSITIVE-INTEGER-P" );
    $sym29$PROGRESS_CSOME = makeSymbol( "PROGRESS-CSOME" );
    $sym30$ASSERTIONS_AROUND = makeSymbol( "ASSERTIONS-AROUND" );
    $list31 = ConsesLow.list( makeSymbol( "NEXT-ASSERTION-ID" ) );
    $sym32$DO_ASSERTIONS = makeSymbol( "DO-ASSERTIONS" );
    $sym33$ASSERTION_P = makeSymbol( "ASSERTION-P" );
    $list34 = ConsesLow.list( makeSymbol( "ASSERTION" ) );
    $str35$Return_the_cnf_of_ASSERTION______ = makeString( "Return the cnf of ASSERTION.\n   @note If you know the assertion is a gaf,\n   consider using gaf-formula instead,\n   if you do not explicitly need a CNF." );
    $list36 = ConsesLow.list( ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "ASSERTION-P" ) ) );
    $list37 = ConsesLow.list( makeSymbol( "CNF-P" ) );
    $kw38$FALSE = makeKeyword( "FALSE" );
    $sym39$ASSERTION_MT = makeSymbol( "ASSERTION-MT" );
    $str40$Return_the_mt_of_ASSERTION_ = makeString( "Return the mt of ASSERTION." );
    $list41 = ConsesLow.list( makeSymbol( "HLMT-P" ) );
    $sym42$ASSERTION_DIRECTION = makeSymbol( "ASSERTION-DIRECTION" );
    $str43$Return_the_direction_of_ASSERTION = makeString( "Return the direction of ASSERTION (either :backward, :forward or :code)." );
    $list44 = ConsesLow.list( makeSymbol( "DIRECTION-P" ) );
    $sym45$ASSERTION_TRUTH = makeSymbol( "ASSERTION-TRUTH" );
    $str46$Return_the_current_truth_of_ASSER = makeString( "Return the current truth of ASSERTION -- either :true :false or :unknown." );
    $list47 = ConsesLow.list( makeSymbol( "TRUTH-P" ) );
    $sym48$ASSERTION_STRENGTH = makeSymbol( "ASSERTION-STRENGTH" );
    $str49$Return_the_current_argumentation_ = makeString( "Return the current argumentation strength of ASSERTION -- either :monotonic, :default, or :unknown." );
    $list50 = ConsesLow.list( makeSymbol( "EL-STRENGTH-P" ) );
    $sym51$ASSERTION_VARIABLE_NAMES = makeSymbol( "ASSERTION-VARIABLE-NAMES" );
    $str52$Return_the_variable_names_for_ASS = makeString( "Return the variable names for ASSERTION." );
    $list53 = ConsesLow.list( makeSymbol( "LISTP" ) );
    $sym54$ASSERTED_BY = makeSymbol( "ASSERTED-BY" );
    $str55$Returns_the_cyclist_who_asserted_ = makeString( "Returns the cyclist who asserted ASSERTION." );
    $sym56$ASSERTED_WHEN = makeSymbol( "ASSERTED-WHEN" );
    $str57$Returns_the_day_when_ASSERTION_wa = makeString( "Returns the day when ASSERTION was asserted." );
    $list58 = ConsesLow.list( makeSymbol( "INTEGERP" ) );
    $sym59$ASSERTION_FORMULA = makeSymbol( "ASSERTION-FORMULA" );
    $str60$Return_a_formula_for_ASSERTION_ = makeString( "Return a formula for ASSERTION." );
    $list61 = ConsesLow.list( makeSymbol( "EL-FORMULA-P" ) );
    $const62$ist = constant_handles.reader_make_constant_shell( makeString( "ist" ) );
    $sym63$ASSERTION_IST_FORMULA = makeSymbol( "ASSERTION-IST-FORMULA" );
    $str64$Return_a_formula_in___ist_format_ = makeString( "Return a formula in #$ist format for ASSERTION." );
    $sym65$HL_TERM_P = makeSymbol( "HL-TERM-P" );
    $sym66$ASSERTION_MENTIONS_TERM_ = makeSymbol( "ASSERTION-MENTIONS-TERM?" );
    $list67 = ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "TERM" ) );
    $str68$Return_T_iff_ASSERTION_s_formula_ = makeString(
        "Return T iff ASSERTION's formula or mt contains TERM.\n   If assertion is a meta-assertion, recurse down sub-assertions.\n   By convention, negated gafs do not necessarily mention the term #$not." );
    $list69 = ConsesLow.list( ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "ASSERTION-P" ) ), ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "HL-TERM-P" ) ) );
    $list70 = ConsesLow.list( makeSymbol( "BOOLEANP" ) );
    $sym71$ASSERTION_MENTIONS_TERM = makeSymbol( "ASSERTION-MENTIONS-TERM" );
    $str72$_see_assertion_mentions_term_ = makeString( "@see assertion-mentions-term?" );
    $const73$performSubL = constant_handles.reader_make_constant_shell( makeString( "performSubL" ) );
    $sym74$KB_TMS_METHOD_ = makeSymbol( "KB-TMS-METHOD?" );
    $list75 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "reconsiderAssertionDeductions" ) ), constant_handles.reader_make_constant_shell( makeString( "repropagateAssertion" ) ) );
    $list76 = ConsesLow.list( makeSymbol( "TMS-RECONSIDER-ASSERTION-DEDUCTIONS" ), makeSymbol( "REPROPAGATE-FORWARD-ASSERTION" ) );
    $kw77$GAF = makeKeyword( "GAF" );
    $kw78$RULE = makeKeyword( "RULE" );
    $str79$Could_not_determine_assertion_typ = makeString( "Could not determine assertion type for ~S" );
    $sym80$ASSERTION_TYPE_P = makeSymbol( "ASSERTION-TYPE-P" );
    $sym81$ASSERTION_HAS_TYPE = makeSymbol( "ASSERTION-HAS-TYPE" );
    $list82 = ConsesLow.list( makeSymbol( "ASSERTION-HAS-TYPE?" ) );
    $sym83$GAF_ASSERTION_ = makeSymbol( "GAF-ASSERTION?" );
    $sym84$GAF_PREDICATE = makeSymbol( "GAF-PREDICATE" );
    $str85$Return_the_predicate_of_gaf_ASSER = makeString( "Return the predicate of gaf ASSERTION." );
    $sym86$GAF_ARG0 = makeSymbol( "GAF-ARG0" );
    $str87$Return_arg_0__the_predicate__of_t = makeString( "Return arg 0 (the predicate) of the gaf ASSERTION." );
    $sym88$GAF_ARG1 = makeSymbol( "GAF-ARG1" );
    $str89$Return_arg_1_of_the_gaf_ASSERTION = makeString( "Return arg 1 of the gaf ASSERTION." );
    $sym90$GAF_ARG2 = makeSymbol( "GAF-ARG2" );
    $str91$Return_arg_2_of_the_gaf_ASSERTION = makeString( "Return arg 2 of the gaf ASSERTION." );
    $sym92$GAF_ARG3 = makeSymbol( "GAF-ARG3" );
    $str93$Return_arg_3_of_the_gaf_ASSERTION = makeString( "Return arg 3 of the gaf ASSERTION." );
    $sym94$GAF_ARG4 = makeSymbol( "GAF-ARG4" );
    $str95$Return_arg_4_of_the_gaf_ASSERTION = makeString( "Return arg 4 of the gaf ASSERTION." );
    $sym96$GAF_ARG5 = makeSymbol( "GAF-ARG5" );
    $str97$Return_arg_5_of_the_gaf_ASSERTION = makeString( "Return arg 5 of the gaf ASSERTION." );
    $sym98$DIRECTION_P = makeSymbol( "DIRECTION-P" );
    $sym99$ASSERTION_HAS_DIRECTION = makeSymbol( "ASSERTION-HAS-DIRECTION" );
    $list100 = ConsesLow.list( makeSymbol( "ASSERTION-HAS-DIRECTION?" ) );
    $kw101$FORWARD = makeKeyword( "FORWARD" );
    $sym102$FORWARD_ASSERTION_ = makeSymbol( "FORWARD-ASSERTION?" );
    $str103$Predicate_returns_T_iff_ASSERTION = makeString( "Predicate returns T iff ASSERTION's direction is :FORWARD." );
    $kw104$BACKWARD = makeKeyword( "BACKWARD" );
    $sym105$BACKWARD_ASSERTION_ = makeSymbol( "BACKWARD-ASSERTION?" );
    $str106$Predicate_returns_T_iff_ASSERTION = makeString( "Predicate returns T iff ASSERTION's direction is :BACKWARD." );
    $kw107$CODE = makeKeyword( "CODE" );
    $sym108$CODE_ASSERTION_ = makeSymbol( "CODE-ASSERTION?" );
    $str109$Predicate_returns_T_iff_ASSERTION = makeString( "Predicate returns T iff ASSERTION's direction is :CODE." );
    $sym110$TRUTH_P = makeSymbol( "TRUTH-P" );
    $sym111$ASSERTION_HAS_TRUTH_ = makeSymbol( "ASSERTION-HAS-TRUTH?" );
    $list112 = ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "TRUTH" ) );
    $str113$Return_T_iff_ASSERTION_s_current_ = makeString( "Return T iff ASSERTION's current truth is TRUTH." );
    $list114 = ConsesLow.list( ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "ASSERTION-P" ) ), ConsesLow.list( makeSymbol( "TRUTH" ), makeSymbol( "TRUTH-P" ) ) );
    $sym115$ASSERTION_HAS_TRUTH = makeSymbol( "ASSERTION-HAS-TRUTH" );
    $str116$_see_assertion_has_truth_ = makeString( "@see assertion-has-truth?" );
    $int117$1000000 = makeInteger( 1000000 );
    $sym118$GENERALIZED_DATE_P = makeSymbol( "GENERALIZED-DATE-P" );
    $sym119$ASSERTION_ASSERTED_DATE_ = makeSymbol( "ASSERTION-ASSERTED-DATE?" );
    $sym120$INTERN_EL_VAR = makeSymbol( "INTERN-EL-VAR" );
    $sym121$EL_VARIABLE_P = makeSymbol( "EL-VARIABLE-P" );
    $sym122$VARIABLE_P = makeSymbol( "VARIABLE-P" );
    $sym123$MAKE_VARIABLE_BINDING = makeSymbol( "MAKE-VARIABLE-BINDING" );
    $sym124$TL_TIMESTAMP_ASSERTED_ASSERTION = makeSymbol( "TL-TIMESTAMP-ASSERTED-ASSERTION" );
    $sym125$_TL_ASSERTION_LOOKASIDE_TABLE_ = makeSymbol( "*TL-ASSERTION-LOOKASIDE-TABLE*" );
    $sym126$NART_P = makeSymbol( "NART-P" );
    $sym127$VALID_ASSERTION = makeSymbol( "VALID-ASSERTION" );
    $list128 = ConsesLow.list( makeSymbol( "VALID-ASSERTION?" ) );
    $sym129$INVALID_ASSERTION = makeSymbol( "INVALID-ASSERTION" );
    $list130 = ConsesLow.list( makeSymbol( "INVALID-ASSERTION?" ) );
    $int131$100 = makeInteger( 100 );
    $sym132$NON_NEGATIVE_INTEGER_P = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $sym133$FIND_ASSERTION_BY_ID = makeSymbol( "FIND-ASSERTION-BY-ID" );
    $kw134$TRUE = makeKeyword( "TRUE" );
    $kw135$DEFAULT = makeKeyword( "DEFAULT" );
    $sym136$CNF_P = makeSymbol( "CNF-P" );
    $sym137$HLMT_P = makeSymbol( "HLMT-P" );
    $sym138$EL_FORMULA_P = makeSymbol( "EL-FORMULA-P" );
    $str139$Removing_broken_assertions__pass_ = makeString( "Removing broken assertions: pass ~S" );
    $sym140$STRINGP = makeSymbol( "STRINGP" );
    $kw141$SKIP = makeKeyword( "SKIP" );
    $kw142$OK = makeKeyword( "OK" );
    $str143$_______removed_assertion___A__rea = makeString( "~& ... removed assertion #~A (reason = ~S) ...~%" );
    $sym144$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $list145 = ConsesLow.list( NIL );
    $kw146$TAUTOLOGY = makeKeyword( "TAUTOLOGY" );
    $kw147$NO_SENTENCE = makeKeyword( "NO-SENTENCE" );
    $sym148$INVALID_INDEXED_TERM_ = makeSymbol( "INVALID-INDEXED-TERM?" );
    $kw149$INVALID_SENTENCE_TERM = makeKeyword( "INVALID-SENTENCE-TERM" );
    $kw150$INVALID_MT_TERM = makeKeyword( "INVALID-MT-TERM" );
    $kw151$BAD_VAR_NAMES = makeKeyword( "BAD-VAR-NAMES" );
    $kw152$CANNOT_UNPACK = makeKeyword( "CANNOT-UNPACK" );
    $kw153$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym154$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $kw155$NOT_AN_ASSERTION = makeKeyword( "NOT-AN-ASSERTION" );
    $sym156$ARGUMENT_P = makeSymbol( "ARGUMENT-P" );
    $sym157$ARGUMENT_EQUAL = makeSymbol( "ARGUMENT-EQUAL" );
    $sym158$NOT_EQL = makeSymbol( "NOT-EQL" );
    $sym159$ASSERTED_ARGUMENT_P = makeSymbol( "ASSERTED-ARGUMENT-P" );
    $sym160$ASSERTED_ASSERTION_ = makeSymbol( "ASSERTED-ASSERTION?" );
    $str161$Return_non_nil_IFF_assertion_has_ = makeString( "Return non-nil IFF assertion has an asserted argument." );
    $sym162$DEDUCTION_P = makeSymbol( "DEDUCTION-P" );
    $sym163$DEDUCED_ASSERTION_ = makeSymbol( "DEDUCED-ASSERTION?" );
    $str164$Return_non_nil_IFF_assertion_has_ = makeString( "Return non-nil IFF assertion has some deduced argument" );
    $sym165$FORWARD_DEDUCTION_ = makeSymbol( "FORWARD-DEDUCTION?" );
    $sym166$FORWARD_NOT_CODE_DEDUCTION_ = makeSymbol( "FORWARD-NOT-CODE-DEDUCTION?" );
    $sym167$GET_ASSERTED_ARGUMENT = makeSymbol( "GET-ASSERTED-ARGUMENT" );
    $str168$Return_the_asserted_argument_for_ = makeString( "Return the asserted argument for ASSERTION, or nil if none present." );
    $list169 = ConsesLow.list( ConsesLow.list( makeSymbol( "NIL-OR" ), makeSymbol( "ASSERTED-ARGUMENT-P" ) ) );
    $sym170$ASSERTION_HAS_DEPENDENTS_P = makeSymbol( "ASSERTION-HAS-DEPENDENTS-P" );
    $str171$Return_non_nil_IFF_assertion_has_ = makeString( "Return non-nil IFF assertion has dependents." );
    $sym172$TRUE = makeSymbol( "TRUE" );
    $int173$500 = makeInteger( 500 );
    $list174 = ConsesLow.list( makeSymbol( "CHECKPOINT-COUNT" ), makeSymbol( "CHECKPOINT-NEXT-ID" ) );
    $list175 = ConsesLow.list( ConsesLow.list( makeSymbol( "*ASSERTION-DUMP-ID-TABLE*" ), ConsesLow.list( makeSymbol( "CREATE-ASSERTION-DUMP-ID-TABLE" ) ) ), ConsesLow.list( makeSymbol( "*CFASL-ASSERTION-HANDLE-FUNC*" ),
        ConsesLow.list( SubLObjectFactory.makeSymbol( "QUOTE" ), makeSymbol( "ASSERTION-DUMP-ID" ) ) ) );
  }

  public static final class $assertion_mt$UnaryFunction
      extends
        UnaryFunction
  {
    public $assertion_mt$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "ASSERTION-MT" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return assertion_mt( arg1 );
    }
  }

  public static final class $assertion_formula$UnaryFunction
      extends
        UnaryFunction
  {
    public $assertion_formula$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "ASSERTION-FORMULA" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return assertion_formula( arg1 );
    }
  }

  public static final class $gaf_formula$UnaryFunction
      extends
        UnaryFunction
  {
    public $gaf_formula$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "GAF-FORMULA" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return gaf_formula( arg1 );
    }
  }

  public static final class $invalid_assertionP$UnaryFunction
      extends
        UnaryFunction
  {
    public $invalid_assertionP$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "INVALID-ASSERTION?" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return invalid_assertionP( arg1, $invalid_assertionP$UnaryFunction.UNPROVIDED );
    }
  }

  public static final class $invalid_assertionP$BinaryFunction
      extends
        BinaryFunction
  {
    public $invalid_assertionP$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "INVALID-ASSERTION?" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return invalid_assertionP( arg1, arg2 );
    }
  }

  public static final class $valid_assertion$UnaryFunction
      extends
        UnaryFunction
  {
    public $valid_assertion$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "VALID-ASSERTION" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return valid_assertion( arg1, $valid_assertion$UnaryFunction.UNPROVIDED );
    }
  }

  public static final class $valid_assertion$BinaryFunction
      extends
        BinaryFunction
  {
    public $valid_assertion$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "VALID-ASSERTION" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return valid_assertion( arg1, arg2 );
    }
  }
}
