package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.cycjava.cycl.access_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inference_macros
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_macros";
  public static final String myFingerPrint = "e0262c5ae6eab43218eb3a8aeec595534794dedcd6d3f2dfeb492b03196ade88";
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 7737L)
  public static SubLSymbol $controlling_inferences$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 8560L)
  public static SubLSymbol $controlling_strategy$;
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$SYMBOLP;
  private static final SubLSymbol $sym2$CLET;
  private static final SubLSymbol $sym3$CUNWIND_PROTECT;
  private static final SubLSymbol $sym4$PROGN;
  private static final SubLSymbol $sym5$DESTROY_INFERENCE_AND_PROBLEM_STORE;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$DESTROY_PROBLEM_STORE;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$WITH_PROBLEM_STORE_VAR;
  private static final SubLSymbol $sym10$CSETQ;
  private static final SubLSymbol $sym11$NEW_PROBLEM_STORE;
  private static final SubLList $list12;
  private static final SubLList $list13;
  private static final SubLSymbol $kw14$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw15$TYPE;
  private static final SubLSymbol $kw16$DONE;
  private static final SubLSymbol $sym17$DO_SET_CONTENTS;
  private static final SubLSymbol $sym18$PROBLEM_ARGUMENT_LINKS;
  private static final SubLSymbol $sym19$DO_PROBLEM_ARGUMENT_LINKS;
  private static final SubLSymbol $sym20$PWHEN;
  private static final SubLSymbol $sym21$PROBLEM_LINK_HAS_TYPE_;
  private static final SubLList $list22;
  private static final SubLList $list23;
  private static final SubLSymbol $kw24$OPEN_;
  private static final SubLSymbol $sym25$LINK_VAR;
  private static final SubLSymbol $sym26$DO_LIST;
  private static final SubLSymbol $sym27$PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEMS;
  private static final SubLSymbol $sym28$DO_PROBLEM_LINK_OPEN_MATCH_;
  private static final SubLSymbol $sym29$DO_PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEMS;
  private static final SubLList $list30;
  private static final SubLList $list31;
  private static final SubLSymbol $sym32$CINC;
  private static final SubLList $list33;
  private static final SubLSymbol $sym34$SUPPORTING_MAPPED_PROBLEM;
  private static final SubLSymbol $sym35$MAPPED_PROBLEM_PROBLEM;
  private static final SubLSymbol $sym36$MAPPED_PROBLEM_VARIABLE_MAP;
  private static final SubLList $list37;
  private static final SubLList $list38;
  private static final SubLSymbol $sym39$SUPPORTED_PROBLEM;
  private static final SubLSymbol $sym40$LINK_VAR;
  private static final SubLSymbol $sym41$PROBLEM_LINK_SUPPORTED_PROBLEM;
  private static final SubLSymbol $sym42$PUNLESS;
  private static final SubLList $list43;
  private static final SubLList $list44;
  private static final SubLSymbol $kw45$LINK_TYPE;
  private static final SubLSymbol $sym46$SUPPORTED_PROBLEM;
  private static final SubLSymbol $sym47$DO_PROBLEM_DEPENDENT_LINKS;
  private static final SubLList $list48;
  private static final SubLList $list49;
  private static final SubLSymbol $sym50$SUPPORTING_PROBLEM;
  private static final SubLSymbol $sym51$VARIABLE_MAP;
  private static final SubLSymbol $sym52$DO_PROBLEM_LINK_SUPPORTING_PROBLEMS;
  private static final SubLSymbol $sym53$IGNORE;
  private static final SubLList $list54;
  private static final SubLList $list55;
  private static final SubLSymbol $kw56$PROOF_STATUS;
  private static final SubLSymbol $sym57$CDOLIST;
  private static final SubLSymbol $sym58$PROBLEM_LINK_PROOFS;
  private static final SubLSymbol $sym59$PROOF_HAS_STATUS_;
  private static final SubLList $list60;
  private static final SubLSymbol $sym61$JO_LINK_VAR;
  private static final SubLSymbol $sym62$MOTIVATING_CONJUNCTION_PROBLEM;
  private static final SubLSymbol $kw63$RESIDUAL_TRANSFORMATION;
  private static final SubLSymbol $sym64$RESIDUAL_TRANSFORMATION_LINK_MOTIVATED_BY_JOIN_ORDERED_LINK_;
  private static final SubLList $list65;
  private static final SubLSymbol $sym66$T_LINK_VAR;
  private static final SubLSymbol $sym67$JO_LINK_VAR;
  private static final SubLSymbol $sym68$DO_PROBLEM_LINK_DEPENDENT_LINKS;
  private static final SubLSymbol $kw69$JOIN_ORDERED;
  private static final SubLSymbol $sym70$DO_JOIN_ORDERED_LINK_MOTIVATED_RESIDUAL_TRANSFORMATION_LINKS;
  private static final SubLSymbol $sym71$RESIDUAL_TRANSFORMATION_LINK_MOTIVATED_BY_TRANSFORMATION_LINK_;
  private static final SubLList $list72;
  private static final SubLList $list73;
  private static final SubLList $list74;
  private static final SubLList $list75;
  private static final SubLSymbol $sym76$_FORWARD_INFERENCE_ALLOWED_RULES_;
  private static final SubLSymbol $sym77$WITH_FORWARD_INFERENCE_ALLOWED_RULES;
  private static final SubLSymbol $kw78$ALL;
  private static final SubLSymbol $sym79$_FORWARD_INFERENCE_FORBIDDEN_RULES_;
  private static final SubLSymbol $sym80$WITH_FORWARD_INFERENCE_FORBIDDEN_RULES;
  private static final SubLSymbol $kw81$NONE;
  private static final SubLSymbol $sym82$INFERENCE_P;
  private static final SubLList $list83;
  private static final SubLSymbol $sym84$_CONTROLLING_INFERENCES_;
  private static final SubLSymbol $sym85$CONS;
  private static final SubLList $list86;
  private static final SubLSymbol $sym87$WITHIN_CONTROLLING_INFERENCE;
  private static final SubLSymbol $sym88$WITHIN_NO_CONTROLLING_STRATEGY;
  private static final SubLList $list89;
  private static final SubLSymbol $sym90$_CONTROLLING_STRATEGY_;
  private static final SubLSymbol $sym91$WITHIN_CONTROLLING_STRATEGY;
  private static final SubLList $list92;
  private static final SubLSymbol $kw93$CYC_MAINT;
  private static final SubLSymbol $sym94$GATHER_TICK_DATA_;
  private static final SubLSymbol $sym95$INITIAL_ARETE_TERMS_TOUCHED_COUNT;
  private static final SubLSymbol $sym96$INITIAL_ARETE_ASSERTIONS_TOUCHED_COUNT;
  private static final SubLSymbol $sym97$INITIAL_ARETE_LOG_LAST_KB_TOUCH_;
  private static final SubLSymbol $sym98$INITIAL_ARETE_LOG_KB_TOUCH_COUNTS_;
  private static final SubLSymbol $sym99$FINAL_ARETE_TERMS_TOUCHED_COUNT;
  private static final SubLSymbol $sym100$FINAL_ARETE_ASSERTIONS_TOUCHED_COUNT;
  private static final SubLSymbol $sym101$INFERENCE_GATHERS_TICK_INDEXED_PROGRESS_DATA_;
  private static final SubLList $list102;
  private static final SubLList $list103;
  private static final SubLList $list104;
  private static final SubLList $list105;
  private static final SubLSymbol $sym106$_ARETE_TERMS_TOUCHED_COUNT_;
  private static final SubLSymbol $sym107$FIF;
  private static final SubLSymbol $sym108$_ARETE_ASSERTIONS_TOUCHED_COUNT_;
  private static final SubLSymbol $sym109$_ARETE_LOG_LAST_KB_TOUCH__;
  private static final SubLSymbol $sym110$_ARETE_LOG_KB_TOUCH_COUNTS__;
  private static final SubLSymbol $sym111$_;
  private static final SubLSymbol $sym112$GATHER_TICK_DATA_;
  private static final SubLSymbol $sym113$INITIAL_ARETE_ASSERTIONS_TOUCHED;
  private static final SubLSymbol $sym114$INITIAL_ARETE_CONSTANTS_TOUCHED;
  private static final SubLSymbol $sym115$INITIAL_ARETE_NARTS_TOUCHED;
  private static final SubLSymbol $sym116$INITIAL_ARETE_LOG_LAST_KB_TOUCH_;
  private static final SubLSymbol $sym117$INITIAL_ARETE_LOG_KB_TOUCHES_;
  private static final SubLSymbol $sym118$FINAL_ARETE_ASSERTIONS_TOUCHED;
  private static final SubLSymbol $sym119$FINAL_ARETE_CONSTANTS_TOUCHED;
  private static final SubLSymbol $sym120$FINAL_ARETE_NARTS_TOUCHED;
  private static final SubLSymbol $sym121$INFERENCE_SHOULD_GATHER_TICK_INDEXED_PROGRESS_DATA_;
  private static final SubLList $list122;
  private static final SubLList $list123;
  private static final SubLList $list124;
  private static final SubLList $list125;
  private static final SubLSymbol $sym126$_ARETE_ASSERTIONS_TOUCHED_;
  private static final SubLList $list127;
  private static final SubLSymbol $sym128$_ARETE_CONSTANTS_TOUCHED_;
  private static final SubLSymbol $sym129$_ARETE_NARTS_TOUCHED_;
  private static final SubLSymbol $sym130$_ARETE_LOG_KB_TOUCHES__;
  private static final SubLSymbol $sym131$SET_NMERGE;
  private static final SubLList $list132;
  private static final SubLSymbol $sym133$PATTERN_VAR;
  private static final SubLSymbol $sym134$PIF;
  private static final SubLSymbol $sym135$OR_PATTERN_P;
  private static final SubLSymbol $sym136$REST;
  private static final SubLList $list137;
  private static final SubLList $list138;
  private static final SubLSymbol $kw139$ELEMENT_NUM;
  private static final SubLSymbol $kw140$DONE_;
  private static final SubLSymbol $sym141$DONE_VAR_;
  private static final SubLSymbol $sym142$I;
  private static final SubLSymbol $sym143$INPUT_STREAM;
  private static final SubLList $list144;
  private static final SubLSymbol $sym145$WITH_PRIVATE_BINARY_FILE;
  private static final SubLList $list146;
  private static final SubLSymbol $sym147$WITH_CFASL_COMMON_SYMBOLS;
  private static final SubLList $list148;
  private static final SubLSymbol $sym149$UNTIL;
  private static final SubLSymbol $sym150$LOAD_ASKED_QUERY_FROM_STREAM;
  private static final SubLSymbol $sym151$PCOND;
  private static final SubLSymbol $kw152$EOF;
  private static final SubLList $list153;
  private static final SubLSymbol $sym154$STRINGP;
  private static final SubLSymbol $sym155$WARN;
  private static final SubLString $str156$Read_invalid_query_info__s;
  private static final SubLList $list157;
  private static final SubLList $list158;
  private static final SubLSymbol $sym159$DO_DIRECTORY_CONTENTS;
  private static final SubLSymbol $sym160$ASKED_QUERIES_FILENAME_;
  private static final SubLSymbol $sym161$DO_ASKED_QUERIES;
  private static final SubLList $list162;
  private static final SubLSymbol $sym163$__;
  private static final SubLSymbol $sym164$_INFERENCE_TRACE_LEVEL_;
  private static final SubLSymbol $sym165$FORCE_FORMAT;

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 801L)
  public static SubLObject with_inference_var(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject inference_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    inference_var = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
      return NIL;
    }
    final SubLObject body;
    current = ( body = temp );
    assert NIL != Types.symbolp( inference_var ) : inference_var;
    return ConsesLow.list( $sym2$CLET, ConsesLow.list( inference_var ), ConsesLow.list( $sym3$CUNWIND_PROTECT, reader.bq_cons( $sym4$PROGN, ConsesLow.append( body, NIL ) ), ConsesLow.list(
        $sym5$DESTROY_INFERENCE_AND_PROBLEM_STORE, inference_var ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 1207L)
  public static SubLObject with_problem_store_var(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list6 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject problem_store_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list6 );
    problem_store_var = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list6 );
      return NIL;
    }
    final SubLObject body;
    current = ( body = temp );
    assert NIL != Types.symbolp( problem_store_var ) : problem_store_var;
    return ConsesLow.list( $sym2$CLET, ConsesLow.list( problem_store_var ), ConsesLow.list( $sym3$CUNWIND_PROTECT, reader.bq_cons( $sym4$PROGN, ConsesLow.append( body, NIL ) ), ConsesLow.list(
        $sym7$DESTROY_PROBLEM_STORE, problem_store_var ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 1597L)
  public static SubLObject with_new_problem_store(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list8 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject problem_store_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list8 );
    problem_store_var = current.first();
    current = current.rest();
    final SubLObject v_properties = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list8 );
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list8 );
      return NIL;
    }
    final SubLObject body;
    current = ( body = temp );
    assert NIL != Types.symbolp( problem_store_var ) : problem_store_var;
    return ConsesLow.listS( $sym9$WITH_PROBLEM_STORE_VAR, ConsesLow.list( problem_store_var ), ConsesLow.list( $sym10$CSETQ, problem_store_var, ConsesLow.list( $sym11$NEW_PROBLEM_STORE, v_properties ) ), ConsesLow
        .append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 1985L)
  public static SubLObject do_problem_argument_links(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list12 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject link_var = NIL;
    SubLObject problem = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list12 );
    link_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list12 );
    problem = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list12 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list12 );
      if( NIL == conses_high.member( current_$1, $list13, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw14$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list12 );
    }
    final SubLObject type_tail = cdestructuring_bind.property_list_member( $kw15$TYPE, current );
    final SubLObject type = ( NIL != type_tail ) ? conses_high.cadr( type_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw16$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    if( NIL == type )
    {
      return ConsesLow.listS( $sym17$DO_SET_CONTENTS, ConsesLow.list( link_var, ConsesLow.list( $sym18$PROBLEM_ARGUMENT_LINKS, problem ), $kw16$DONE, done ), ConsesLow.append( body, NIL ) );
    }
    return ConsesLow.list( $sym19$DO_PROBLEM_ARGUMENT_LINKS, ConsesLow.list( link_var, problem, $kw16$DONE, done ), ConsesLow.listS( $sym20$PWHEN, ConsesLow.list( $sym21$PROBLEM_LINK_HAS_TYPE_, link_var, type ),
        ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 2348L)
  public static SubLObject do_problem_link_supporting_mapped_problems(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list22 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject supporting_mapped_problem_var = NIL;
    SubLObject link = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list22 );
    supporting_mapped_problem_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list22 );
    link = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$2 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list22 );
      current_$2 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list22 );
      if( NIL == conses_high.member( current_$2, $list23, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$2 == $kw14$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list22 );
    }
    final SubLObject openP_tail = cdestructuring_bind.property_list_member( $kw24$OPEN_, current );
    final SubLObject openP = ( NIL != openP_tail ) ? conses_high.cadr( openP_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw16$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject link_var = $sym25$LINK_VAR;
    return ConsesLow.list( $sym2$CLET, ConsesLow.list( ConsesLow.list( link_var, link ) ), ConsesLow.list( $sym26$DO_LIST, ConsesLow.list( supporting_mapped_problem_var, ConsesLow.list(
        $sym27$PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEMS, link_var ), $kw16$DONE, done ), ConsesLow.listS( $sym20$PWHEN, ConsesLow.list( $sym28$DO_PROBLEM_LINK_OPEN_MATCH_, openP, link_var, supporting_mapped_problem_var ),
            ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 2788L)
  public static SubLObject do_problem_link_open_matchP(final SubLObject openP, final SubLObject link, final SubLObject supporting_mapped_problem)
  {
    return makeBoolean( NIL == openP || NIL != inference_datastructures_problem_link.problem_link_supporting_mapped_problem_openP( link, supporting_mapped_problem ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 3042L)
  public static SubLObject do_problem_link_supporting_mapped_problems_numbered(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list30 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject supporting_mapped_problem_var = NIL;
    SubLObject index_var = NIL;
    SubLObject link = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list30 );
    supporting_mapped_problem_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list30 );
    index_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list30 );
    link = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$3 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list30 );
      current_$3 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list30 );
      if( NIL == conses_high.member( current_$3, $list23, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$3 == $kw14$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list30 );
    }
    final SubLObject openP_tail = cdestructuring_bind.property_list_member( $kw24$OPEN_, current );
    final SubLObject openP = ( NIL != openP_tail ) ? conses_high.cadr( openP_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw16$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.list( $sym2$CLET, ConsesLow.list( reader.bq_cons( index_var, $list31 ) ), ConsesLow.listS( $sym29$DO_PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEMS, ConsesLow.list( supporting_mapped_problem_var, link,
        $kw24$OPEN_, openP, $kw16$DONE, done ), ConsesLow.append( body, ConsesLow.list( ConsesLow.list( $sym32$CINC, index_var ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 3373L)
  public static SubLObject do_problem_link_supporting_problems(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list33 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject supporting_problem_var = NIL;
    SubLObject variable_map_var = NIL;
    SubLObject link = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list33 );
    supporting_problem_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list33 );
    variable_map_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list33 );
    link = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$4 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list33 );
      current_$4 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list33 );
      if( NIL == conses_high.member( current_$4, $list23, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$4 == $kw14$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list33 );
    }
    final SubLObject openP_tail = cdestructuring_bind.property_list_member( $kw24$OPEN_, current );
    final SubLObject openP = ( NIL != openP_tail ) ? conses_high.cadr( openP_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw16$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject supporting_mapped_problem = $sym34$SUPPORTING_MAPPED_PROBLEM;
    return ConsesLow.list( $sym29$DO_PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEMS, ConsesLow.list( supporting_mapped_problem, link, $kw24$OPEN_, openP, $kw16$DONE, done ), ConsesLow.listS( $sym2$CLET, ConsesLow.list(
        ConsesLow.list( supporting_problem_var, ConsesLow.list( $sym35$MAPPED_PROBLEM_PROBLEM, supporting_mapped_problem ) ), ConsesLow.list( variable_map_var, ConsesLow.list( $sym36$MAPPED_PROBLEM_VARIABLE_MAP,
            supporting_mapped_problem ) ) ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 3870L)
  public static SubLObject do_problem_link_sibling_links(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list37 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject sibling_link_var = NIL;
    SubLObject link = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list37 );
    sibling_link_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list37 );
    link = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$5 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list37 );
      current_$5 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list37 );
      if( NIL == conses_high.member( current_$5, $list38, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$5 == $kw14$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list37 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw16$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject supported_problem = $sym39$SUPPORTED_PROBLEM;
    final SubLObject link_var = $sym40$LINK_VAR;
    return ConsesLow.list( $sym2$CLET, ConsesLow.list( ConsesLow.list( link_var, link ), ConsesLow.list( supported_problem, ConsesLow.list( $sym41$PROBLEM_LINK_SUPPORTED_PROBLEM, link_var ) ) ), ConsesLow.list(
        $sym19$DO_PROBLEM_ARGUMENT_LINKS, ConsesLow.list( sibling_link_var, supported_problem, $kw16$DONE, done ), ConsesLow.listS( $sym42$PUNLESS, ConsesLow.list( EQ, link_var, sibling_link_var ), ConsesLow.append(
            body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 4265L)
  public static SubLObject do_problem_link_dependent_links(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list43 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject dependent_link_var = NIL;
    SubLObject link = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list43 );
    dependent_link_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list43 );
    link = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$6 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list43 );
      current_$6 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list43 );
      if( NIL == conses_high.member( current_$6, $list44, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$6 == $kw14$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list43 );
    }
    final SubLObject link_type_tail = cdestructuring_bind.property_list_member( $kw45$LINK_TYPE, current );
    final SubLObject link_type = ( NIL != link_type_tail ) ? conses_high.cadr( link_type_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw16$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject supported_problem = $sym46$SUPPORTED_PROBLEM;
    return ConsesLow.list( $sym2$CLET, ConsesLow.list( ConsesLow.list( supported_problem, ConsesLow.list( $sym41$PROBLEM_LINK_SUPPORTED_PROBLEM, link ) ) ), ConsesLow.listS( $sym47$DO_PROBLEM_DEPENDENT_LINKS, ConsesLow
        .list( dependent_link_var, supported_problem, $kw15$TYPE, link_type, $kw16$DONE, done ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 4697L)
  public static SubLObject do_problem_link_argument_links(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list48 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject argument_link_var = NIL;
    SubLObject link = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list48 );
    argument_link_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list48 );
    link = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$7 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list48 );
      current_$7 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list48 );
      if( NIL == conses_high.member( current_$7, $list49, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$7 == $kw14$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list48 );
    }
    final SubLObject openP_tail = cdestructuring_bind.property_list_member( $kw24$OPEN_, current );
    final SubLObject openP = ( NIL != openP_tail ) ? conses_high.cadr( openP_tail ) : NIL;
    final SubLObject link_type_tail = cdestructuring_bind.property_list_member( $kw45$LINK_TYPE, current );
    final SubLObject link_type = ( NIL != link_type_tail ) ? conses_high.cadr( link_type_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw16$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject supporting_problem = $sym50$SUPPORTING_PROBLEM;
    final SubLObject variable_map = $sym51$VARIABLE_MAP;
    return ConsesLow.list( $sym52$DO_PROBLEM_LINK_SUPPORTING_PROBLEMS, ConsesLow.list( supporting_problem, variable_map, link, $kw24$OPEN_, openP, $kw16$DONE, done ), ConsesLow.list( $sym53$IGNORE, variable_map ),
        ConsesLow.listS( $sym19$DO_PROBLEM_ARGUMENT_LINKS, ConsesLow.list( argument_link_var, supporting_problem, $kw15$TYPE, link_type, $kw16$DONE, done ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 5242L)
  public static SubLObject do_problem_link_proofs(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list54 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject proof_var = NIL;
    SubLObject link = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list54 );
    proof_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list54 );
    link = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$8 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list54 );
      current_$8 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list54 );
      if( NIL == conses_high.member( current_$8, $list55, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$8 == $kw14$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list54 );
    }
    final SubLObject proof_status_tail = cdestructuring_bind.property_list_member( $kw56$PROOF_STATUS, current );
    final SubLObject proof_status = ( NIL != proof_status_tail ) ? conses_high.cadr( proof_status_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.list( $sym57$CDOLIST, ConsesLow.list( proof_var, ConsesLow.list( $sym58$PROBLEM_LINK_PROOFS, link ) ), ConsesLow.listS( $sym20$PWHEN, ConsesLow.list( $sym59$PROOF_HAS_STATUS_, proof_var,
        proof_status ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 5463L)
  public static SubLObject do_join_ordered_link_motivated_residual_transformation_links(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list60 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject rt_link_var = NIL;
    SubLObject jo_link = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list60 );
    rt_link_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list60 );
    jo_link = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$9 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list60 );
      current_$9 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list60 );
      if( NIL == conses_high.member( current_$9, $list38, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$9 == $kw14$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list60 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw16$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject jo_link_var = $sym61$JO_LINK_VAR;
    final SubLObject motivating_conjunction_problem = $sym62$MOTIVATING_CONJUNCTION_PROBLEM;
    return ConsesLow.list( $sym2$CLET, ConsesLow.list( ConsesLow.list( jo_link_var, jo_link ), ConsesLow.list( motivating_conjunction_problem, ConsesLow.list( $sym41$PROBLEM_LINK_SUPPORTED_PROBLEM, jo_link_var ) ) ),
        ConsesLow.list( $sym19$DO_PROBLEM_ARGUMENT_LINKS, ConsesLow.list( rt_link_var, motivating_conjunction_problem, $kw15$TYPE, $kw63$RESIDUAL_TRANSFORMATION, $kw16$DONE, done ), ConsesLow.listS( $sym20$PWHEN,
            ConsesLow.list( $sym64$RESIDUAL_TRANSFORMATION_LINK_MOTIVATED_BY_JOIN_ORDERED_LINK_, rt_link_var, jo_link_var ), ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 6015L)
  public static SubLObject do_transformation_link_motivated_residual_transformation_links(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list65 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject rt_link_var = NIL;
    SubLObject t_link = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list65 );
    rt_link_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list65 );
    t_link = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$10 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list65 );
      current_$10 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list65 );
      if( NIL == conses_high.member( current_$10, $list38, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$10 == $kw14$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list65 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw16$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject t_link_var = $sym66$T_LINK_VAR;
    final SubLObject jo_link_var = $sym67$JO_LINK_VAR;
    return ConsesLow.list( $sym2$CLET, ConsesLow.list( ConsesLow.list( t_link_var, t_link ) ), ConsesLow.list( $sym68$DO_PROBLEM_LINK_DEPENDENT_LINKS, ConsesLow.list( jo_link_var, t_link_var, $kw45$LINK_TYPE,
        $kw69$JOIN_ORDERED, $kw16$DONE, done ), ConsesLow.list( $sym70$DO_JOIN_ORDERED_LINK_MOTIVATED_RESIDUAL_TRANSFORMATION_LINKS, ConsesLow.list( rt_link_var, jo_link_var, $kw16$DONE, done ), ConsesLow.listS(
            $sym20$PWHEN, ConsesLow.list( $sym71$RESIDUAL_TRANSFORMATION_LINK_MOTIVATED_BY_TRANSFORMATION_LINK_, rt_link_var, t_link_var ), ConsesLow.append( body, NIL ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 6624L)
  public static SubLObject with_forward_problem_store_reuse(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym2$CLET, $list72, ConsesLow.listS( $sym3$CUNWIND_PROTECT, reader.bq_cons( $sym4$PROGN, ConsesLow.append( body, NIL ) ), $list73 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 6889L)
  public static SubLObject with_forward_dnf_type_filtering(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym2$CLET, $list74, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 7014L)
  public static SubLObject with_forward_inference_allowed_rules(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject rules = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list75 );
    rules = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym2$CLET, ConsesLow.list( ConsesLow.list( $sym76$_FORWARD_INFERENCE_ALLOWED_RULES_, rules ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 7164L)
  public static SubLObject with_forward_inference_all_rules_allowed(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym77$WITH_FORWARD_INFERENCE_ALLOWED_RULES, $kw78$ALL, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 7303L)
  public static SubLObject with_forward_inference_no_rules_allowed(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym77$WITH_FORWARD_INFERENCE_ALLOWED_RULES, NIL, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 7440L)
  public static SubLObject with_forward_inference_forbidden_rules(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject rules = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list75 );
    rules = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym2$CLET, ConsesLow.list( ConsesLow.list( $sym79$_FORWARD_INFERENCE_FORBIDDEN_RULES_, rules ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 7594L)
  public static SubLObject with_forward_inference_no_rules_forbidden(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym80$WITH_FORWARD_INFERENCE_FORBIDDEN_RULES, $kw81$NONE, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 7905L)
  public static SubLObject current_controlling_inference()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $controlling_inferences$.getDynamicValue( thread ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 8108L)
  public static SubLObject current_controlling_inferences()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return list_utilities.find_all_if( $sym82$INFERENCE_P, $controlling_inferences$.getDynamicValue( thread ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 8222L)
  public static SubLObject within_controlling_inference(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject inference = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list83 );
    inference = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym2$CLET, ConsesLow.list( ConsesLow.list( $sym84$_CONTROLLING_INFERENCES_, ConsesLow.listS( $sym85$CONS, inference, $list86 ) ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 8394L)
  public static SubLObject within_no_controlling_inference(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym87$WITHIN_CONTROLLING_INFERENCE, NIL, reader.bq_cons( $sym88$WITHIN_NO_CONTROLLING_STRATEGY, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 8723L)
  public static SubLObject current_controlling_strategy()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $controlling_strategy$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 8915L)
  public static SubLObject within_controlling_strategy(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject strategy = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list89 );
    strategy = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym2$CLET, ConsesLow.list( ConsesLow.list( $sym90$_CONTROLLING_STRATEGY_, strategy ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 9050L)
  public static SubLObject within_no_controlling_strategy(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym91$WITHIN_CONTROLLING_STRATEGY, NIL, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 9429L)
  public static SubLObject possibly_gathering_pad_metrics(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject inference = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
    inference = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list92 );
      return NIL;
    }
    final SubLObject body;
    current = ( body = temp );
    if( NIL == list_utilities.member_eqP( $kw93$CYC_MAINT, reader.$features$.getDynamicValue( thread ) ) )
    {
      return reader.bq_cons( $sym4$PROGN, ConsesLow.append( body, NIL ) );
    }
    return reader.bq_cons( $sym4$PROGN, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 9857L)
  public static SubLObject possibly_gathering_tick_indexed_inference_progress_metrics_count_method(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject inference = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
    inference = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject gather_tick_dataP = $sym94$GATHER_TICK_DATA_;
      final SubLObject initial_arete_terms_touched_count = $sym95$INITIAL_ARETE_TERMS_TOUCHED_COUNT;
      final SubLObject initial_arete_assertions_touched_count = $sym96$INITIAL_ARETE_ASSERTIONS_TOUCHED_COUNT;
      final SubLObject initial_arete_log_last_kb_touchP = $sym97$INITIAL_ARETE_LOG_LAST_KB_TOUCH_;
      final SubLObject initial_arete_log_kb_touch_countsP = $sym98$INITIAL_ARETE_LOG_KB_TOUCH_COUNTS_;
      final SubLObject final_arete_terms_touched_count = $sym99$FINAL_ARETE_TERMS_TOUCHED_COUNT;
      final SubLObject final_arete_assertions_touched_count = $sym100$FINAL_ARETE_ASSERTIONS_TOUCHED_COUNT;
      return ConsesLow.list( $sym2$CLET, ConsesLow.list( ConsesLow.list( gather_tick_dataP, ConsesLow.list( $sym101$INFERENCE_GATHERS_TICK_INDEXED_PROGRESS_DATA_, inference ) ), reader.bq_cons(
          initial_arete_terms_touched_count, $list102 ), reader.bq_cons( initial_arete_assertions_touched_count, $list103 ), reader.bq_cons( initial_arete_log_last_kb_touchP, $list104 ), reader.bq_cons(
              initial_arete_log_kb_touch_countsP, $list105 ), final_arete_terms_touched_count, final_arete_assertions_touched_count ), ConsesLow.listS( $sym2$CLET, ConsesLow.list( ConsesLow.list(
                  $sym106$_ARETE_TERMS_TOUCHED_COUNT_, ConsesLow.list( $sym107$FIF, gather_tick_dataP, ZERO_INTEGER, initial_arete_terms_touched_count ) ), ConsesLow.list( $sym108$_ARETE_ASSERTIONS_TOUCHED_COUNT_,
                      ConsesLow.list( $sym107$FIF, gather_tick_dataP, ZERO_INTEGER, initial_arete_assertions_touched_count ) ), ConsesLow.list( $sym109$_ARETE_LOG_LAST_KB_TOUCH__, ConsesLow.list( $sym107$FIF,
                          gather_tick_dataP, T, initial_arete_log_last_kb_touchP ) ), ConsesLow.list( $sym110$_ARETE_LOG_KB_TOUCH_COUNTS__, ConsesLow.list( $sym107$FIF, gather_tick_dataP, T,
                              initial_arete_log_kb_touch_countsP ) ) ), ConsesLow.append( body, ConsesLow.list( ConsesLow.listS( $sym10$CSETQ, final_arete_terms_touched_count, $list102 ), ConsesLow.listS( $sym10$CSETQ,
                                  final_arete_assertions_touched_count, $list103 ) ) ) ), ConsesLow.list( $sym20$PWHEN, initial_arete_terms_touched_count, ConsesLow.list( $sym10$CSETQ,
                                      $sym106$_ARETE_TERMS_TOUCHED_COUNT_, ConsesLow.list( $sym107$FIF, gather_tick_dataP, ConsesLow.list( $sym111$_, initial_arete_terms_touched_count,
                                          final_arete_assertions_touched_count ), final_arete_terms_touched_count ) ) ), ConsesLow.list( $sym20$PWHEN, initial_arete_assertions_touched_count, ConsesLow.list( $sym10$CSETQ,
                                              $sym108$_ARETE_ASSERTIONS_TOUCHED_COUNT_, ConsesLow.list( $sym107$FIF, gather_tick_dataP, ConsesLow.list( $sym111$_, initial_arete_assertions_touched_count,
                                                  final_arete_assertions_touched_count ), final_arete_assertions_touched_count ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list92 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 11917L)
  public static SubLObject possibly_gathering_tick_indexed_inference_progress_metrics(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject inference = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
    inference = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject gather_tick_dataP = $sym112$GATHER_TICK_DATA_;
      final SubLObject initial_arete_assertions_touched = $sym113$INITIAL_ARETE_ASSERTIONS_TOUCHED;
      final SubLObject initial_arete_constants_touched = $sym114$INITIAL_ARETE_CONSTANTS_TOUCHED;
      final SubLObject initial_arete_narts_touched = $sym115$INITIAL_ARETE_NARTS_TOUCHED;
      final SubLObject initial_arete_log_last_kb_touchP = $sym116$INITIAL_ARETE_LOG_LAST_KB_TOUCH_;
      final SubLObject initial_arete_log_kb_touchesP = $sym117$INITIAL_ARETE_LOG_KB_TOUCHES_;
      final SubLObject final_arete_assertions_touched = $sym118$FINAL_ARETE_ASSERTIONS_TOUCHED;
      final SubLObject final_arete_constants_touched = $sym119$FINAL_ARETE_CONSTANTS_TOUCHED;
      final SubLObject final_arete_narts_touched = $sym120$FINAL_ARETE_NARTS_TOUCHED;
      return ConsesLow.list( $sym2$CLET, ConsesLow.list( new SubLObject[] { ConsesLow.list( gather_tick_dataP, ConsesLow.list( $sym121$INFERENCE_SHOULD_GATHER_TICK_INDEXED_PROGRESS_DATA_, inference ) ), reader.bq_cons(
          initial_arete_assertions_touched, $list122 ), reader.bq_cons( initial_arete_constants_touched, $list123 ), reader.bq_cons( initial_arete_narts_touched, $list124 ), reader.bq_cons(
              initial_arete_log_last_kb_touchP, $list104 ), reader.bq_cons( initial_arete_log_kb_touchesP, $list125 ), final_arete_assertions_touched, final_arete_constants_touched, final_arete_narts_touched
      } ), ConsesLow.listS( $sym2$CLET, ConsesLow.list( ConsesLow.list( $sym126$_ARETE_ASSERTIONS_TOUCHED_, ConsesLow.list( $sym107$FIF, gather_tick_dataP, $list127, initial_arete_assertions_touched ) ), ConsesLow.list(
          $sym128$_ARETE_CONSTANTS_TOUCHED_, ConsesLow.list( $sym107$FIF, gather_tick_dataP, $list127, initial_arete_constants_touched ) ), ConsesLow.list( $sym129$_ARETE_NARTS_TOUCHED_, ConsesLow.list( $sym107$FIF,
              gather_tick_dataP, $list127, initial_arete_narts_touched ) ), ConsesLow.list( $sym109$_ARETE_LOG_LAST_KB_TOUCH__, ConsesLow.list( $sym107$FIF, gather_tick_dataP, T, initial_arete_log_last_kb_touchP ) ),
          ConsesLow.list( $sym130$_ARETE_LOG_KB_TOUCHES__, ConsesLow.list( $sym107$FIF, gather_tick_dataP, T, initial_arete_log_kb_touchesP ) ) ), ConsesLow.append( body, ConsesLow.list( ConsesLow.listS( $sym10$CSETQ,
              final_arete_assertions_touched, $list122 ), ConsesLow.listS( $sym10$CSETQ, final_arete_constants_touched, $list123 ), ConsesLow.listS( $sym10$CSETQ, final_arete_narts_touched, $list124 ) ) ) ), ConsesLow
                  .list( $sym20$PWHEN, initial_arete_assertions_touched, ConsesLow.list( $sym10$CSETQ, $sym126$_ARETE_ASSERTIONS_TOUCHED_, ConsesLow.list( $sym107$FIF, gather_tick_dataP, ConsesLow.list(
                      $sym131$SET_NMERGE, initial_arete_assertions_touched, final_arete_assertions_touched ), final_arete_assertions_touched ) ) ), ConsesLow.list( $sym20$PWHEN, initial_arete_constants_touched, ConsesLow
                          .list( $sym10$CSETQ, $sym128$_ARETE_CONSTANTS_TOUCHED_, ConsesLow.list( $sym107$FIF, gather_tick_dataP, ConsesLow.list( $sym131$SET_NMERGE, initial_arete_constants_touched,
                              final_arete_constants_touched ), final_arete_constants_touched ) ) ), ConsesLow.list( $sym20$PWHEN, initial_arete_narts_touched, ConsesLow.list( $sym10$CSETQ, $sym129$_ARETE_NARTS_TOUCHED_,
                                  ConsesLow.list( $sym107$FIF, gather_tick_dataP, ConsesLow.list( $sym131$SET_NMERGE, initial_arete_narts_touched, final_arete_narts_touched ), final_arete_narts_touched ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list92 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 14375L)
  public static SubLObject do_pattern_possible_disjuncts(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list132 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject disjunct_var = NIL;
    SubLObject pattern = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list132 );
    disjunct_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list132 );
    pattern = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject pattern_var = $sym133$PATTERN_VAR;
      return ConsesLow.list( $sym2$CLET, ConsesLow.list( ConsesLow.list( pattern_var, pattern ) ), ConsesLow.list( $sym134$PIF, ConsesLow.list( $sym135$OR_PATTERN_P, pattern_var ), ConsesLow.listS( $sym57$CDOLIST,
          ConsesLow.list( disjunct_var, ConsesLow.list( $sym136$REST, pattern_var ) ), ConsesLow.append( body, NIL ) ), ConsesLow.listS( $sym2$CLET, ConsesLow.list( ConsesLow.list( disjunct_var, pattern_var ) ),
              ConsesLow.append( body, NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list132 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 14708L)
  public static SubLObject do_asked_queries(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list137 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject query_info_var = NIL;
    SubLObject filename = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list137 );
    query_info_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list137 );
    filename = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$11 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list137 );
      current_$11 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list137 );
      if( NIL == conses_high.member( current_$11, $list138, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$11 == $kw14$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list137 );
    }
    final SubLObject element_num_tail = cdestructuring_bind.property_list_member( $kw139$ELEMENT_NUM, current );
    final SubLObject element_num = ( NIL != element_num_tail ) ? conses_high.cadr( element_num_tail ) : NIL;
    final SubLObject doneP_tail = cdestructuring_bind.property_list_member( $kw140$DONE_, current );
    final SubLObject doneP = ( NIL != doneP_tail ) ? conses_high.cadr( doneP_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject done_varP = $sym141$DONE_VAR_;
    final SubLObject i = $sym142$I;
    final SubLObject input_stream = $sym143$INPUT_STREAM;
    return ConsesLow.list( $sym2$CLET, ConsesLow.list( reader.bq_cons( done_varP, $list144 ), reader.bq_cons( i, $list31 ) ), ConsesLow.list( $sym145$WITH_PRIVATE_BINARY_FILE, ConsesLow.listS( input_stream, filename,
        $list146 ), ConsesLow.list( $sym147$WITH_CFASL_COMMON_SYMBOLS, $list148, ConsesLow.list( $sym149$UNTIL, done_varP, ConsesLow.list( $sym2$CLET, ConsesLow.list( ConsesLow.list( query_info_var, ConsesLow.list(
            $sym150$LOAD_ASKED_QUERY_FROM_STREAM, input_stream ) ) ), ConsesLow.list( $sym151$PCOND, ConsesLow.list( ConsesLow.list( EQ, $kw152$EOF, query_info_var ), ConsesLow.listS( $sym10$CSETQ, done_varP,
                $list153 ) ), ConsesLow.list( ConsesLow.list( $sym154$STRINGP, query_info_var ), ConsesLow.list( $sym155$WARN, $str156$Read_invalid_query_info__s, query_info_var ) ), ConsesLow.list( T,
                    ( NIL != element_num ) ? ConsesLow.listS( $sym2$CLET, ConsesLow.list( ConsesLow.list( element_num, i ) ), ConsesLow.append( body, NIL ) )
                        : reader.bq_cons( $sym4$PROGN, ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym32$CINC, i ) ) ) ), ConsesLow.list( $sym20$PWHEN, doneP, ConsesLow.list( $sym10$CSETQ, done_varP,
                            doneP ) ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 15493L)
  public static SubLObject do_asked_queries_in_directory(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list157 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject query_info_var = NIL;
    SubLObject filename_var = NIL;
    SubLObject directory = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list157 );
    query_info_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list157 );
    filename_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list157 );
    directory = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$12 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list157 );
      current_$12 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list157 );
      if( NIL == conses_high.member( current_$12, $list158, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$12 == $kw14$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list157 );
    }
    final SubLObject doneP_tail = cdestructuring_bind.property_list_member( $kw140$DONE_, current );
    final SubLObject doneP = ( NIL != doneP_tail ) ? conses_high.cadr( doneP_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.list( $sym159$DO_DIRECTORY_CONTENTS, ConsesLow.list( filename_var, directory, $kw16$DONE, doneP ), ConsesLow.list( $sym20$PWHEN, ConsesLow.list( $sym160$ASKED_QUERIES_FILENAME_, filename_var ),
        ConsesLow.listS( $sym161$DO_ASKED_QUERIES, ConsesLow.list( query_info_var, filename_var, $kw140$DONE_, doneP ), ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 15814L)
  public static SubLObject inference_trace(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject trace_level = NIL;
    SubLObject control_string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list162 );
    trace_level = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list162 );
    control_string = current.first();
    current = current.rest();
    final SubLObject arg1 = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list162 );
    current = current.rest();
    final SubLObject arg2 = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list162 );
    current = current.rest();
    final SubLObject arg3 = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list162 );
    current = current.rest();
    final SubLObject arg4 = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list162 );
    current = current.rest();
    final SubLObject arg5 = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list162 );
    current = current.rest();
    final SubLObject arg6 = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list162 );
    current = current.rest();
    final SubLObject arg7 = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list162 );
    current = current.rest();
    final SubLObject arg8 = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list162 );
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym20$PWHEN, ConsesLow.list( $sym163$__, $sym164$_INFERENCE_TRACE_LEVEL_, trace_level ), ConsesLow.list( new SubLObject[] { $sym165$FORCE_FORMAT, T, control_string, arg1, arg2, arg3, arg4,
        arg5, arg6, arg7, arg8
      } ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list162 );
    return NIL;
  }

  public static SubLObject declare_inference_macros_file()
  {
    SubLFiles.declareMacro( me, "with_inference_var", "WITH-INFERENCE-VAR" );
    SubLFiles.declareMacro( me, "with_problem_store_var", "WITH-PROBLEM-STORE-VAR" );
    SubLFiles.declareMacro( me, "with_new_problem_store", "WITH-NEW-PROBLEM-STORE" );
    SubLFiles.declareMacro( me, "do_problem_argument_links", "DO-PROBLEM-ARGUMENT-LINKS" );
    SubLFiles.declareMacro( me, "do_problem_link_supporting_mapped_problems", "DO-PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEMS" );
    SubLFiles.declareFunction( me, "do_problem_link_open_matchP", "DO-PROBLEM-LINK-OPEN-MATCH?", 3, 0, false );
    SubLFiles.declareMacro( me, "do_problem_link_supporting_mapped_problems_numbered", "DO-PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEMS-NUMBERED" );
    SubLFiles.declareMacro( me, "do_problem_link_supporting_problems", "DO-PROBLEM-LINK-SUPPORTING-PROBLEMS" );
    SubLFiles.declareMacro( me, "do_problem_link_sibling_links", "DO-PROBLEM-LINK-SIBLING-LINKS" );
    SubLFiles.declareMacro( me, "do_problem_link_dependent_links", "DO-PROBLEM-LINK-DEPENDENT-LINKS" );
    SubLFiles.declareMacro( me, "do_problem_link_argument_links", "DO-PROBLEM-LINK-ARGUMENT-LINKS" );
    SubLFiles.declareMacro( me, "do_problem_link_proofs", "DO-PROBLEM-LINK-PROOFS" );
    SubLFiles.declareMacro( me, "do_join_ordered_link_motivated_residual_transformation_links", "DO-JOIN-ORDERED-LINK-MOTIVATED-RESIDUAL-TRANSFORMATION-LINKS" );
    SubLFiles.declareMacro( me, "do_transformation_link_motivated_residual_transformation_links", "DO-TRANSFORMATION-LINK-MOTIVATED-RESIDUAL-TRANSFORMATION-LINKS" );
    SubLFiles.declareMacro( me, "with_forward_problem_store_reuse", "WITH-FORWARD-PROBLEM-STORE-REUSE" );
    SubLFiles.declareMacro( me, "with_forward_dnf_type_filtering", "WITH-FORWARD-DNF-TYPE-FILTERING" );
    SubLFiles.declareMacro( me, "with_forward_inference_allowed_rules", "WITH-FORWARD-INFERENCE-ALLOWED-RULES" );
    SubLFiles.declareMacro( me, "with_forward_inference_all_rules_allowed", "WITH-FORWARD-INFERENCE-ALL-RULES-ALLOWED" );
    SubLFiles.declareMacro( me, "with_forward_inference_no_rules_allowed", "WITH-FORWARD-INFERENCE-NO-RULES-ALLOWED" );
    SubLFiles.declareMacro( me, "with_forward_inference_forbidden_rules", "WITH-FORWARD-INFERENCE-FORBIDDEN-RULES" );
    SubLFiles.declareMacro( me, "with_forward_inference_no_rules_forbidden", "WITH-FORWARD-INFERENCE-NO-RULES-FORBIDDEN" );
    SubLFiles.declareFunction( me, "current_controlling_inference", "CURRENT-CONTROLLING-INFERENCE", 0, 0, false );
    SubLFiles.declareFunction( me, "current_controlling_inferences", "CURRENT-CONTROLLING-INFERENCES", 0, 0, false );
    SubLFiles.declareMacro( me, "within_controlling_inference", "WITHIN-CONTROLLING-INFERENCE" );
    SubLFiles.declareMacro( me, "within_no_controlling_inference", "WITHIN-NO-CONTROLLING-INFERENCE" );
    SubLFiles.declareFunction( me, "current_controlling_strategy", "CURRENT-CONTROLLING-STRATEGY", 0, 0, false );
    SubLFiles.declareMacro( me, "within_controlling_strategy", "WITHIN-CONTROLLING-STRATEGY" );
    SubLFiles.declareMacro( me, "within_no_controlling_strategy", "WITHIN-NO-CONTROLLING-STRATEGY" );
    SubLFiles.declareMacro( me, "possibly_gathering_pad_metrics", "POSSIBLY-GATHERING-PAD-METRICS" );
    SubLFiles.declareMacro( me, "possibly_gathering_tick_indexed_inference_progress_metrics_count_method", "POSSIBLY-GATHERING-TICK-INDEXED-INFERENCE-PROGRESS-METRICS-COUNT-METHOD" );
    SubLFiles.declareMacro( me, "possibly_gathering_tick_indexed_inference_progress_metrics", "POSSIBLY-GATHERING-TICK-INDEXED-INFERENCE-PROGRESS-METRICS" );
    SubLFiles.declareMacro( me, "do_pattern_possible_disjuncts", "DO-PATTERN-POSSIBLE-DISJUNCTS" );
    SubLFiles.declareMacro( me, "do_asked_queries", "DO-ASKED-QUERIES" );
    SubLFiles.declareMacro( me, "do_asked_queries_in_directory", "DO-ASKED-QUERIES-IN-DIRECTORY" );
    SubLFiles.declareMacro( me, "inference_trace", "INFERENCE-TRACE" );
    return NIL;
  }

  public static SubLObject init_inference_macros_file()
  {
    $controlling_inferences$ = SubLFiles.defparameter( "*CONTROLLING-INFERENCES*", NIL );
    $controlling_strategy$ = SubLFiles.defparameter( "*CONTROLLING-STRATEGY*", NIL );
    return NIL;
  }

  public static SubLObject setup_inference_macros_file()
  {
    access_macros.register_macro_helper( $sym28$DO_PROBLEM_LINK_OPEN_MATCH_, $sym29$DO_PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEMS );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_inference_macros_file();
  }

  @Override
  public void initializeVariables()
  {
    init_inference_macros_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_inference_macros_file();
  }
  static
  {
    me = new inference_macros();
    $controlling_inferences$ = null;
    $controlling_strategy$ = null;
    $list0 = ConsesLow.list( ConsesLow.list( makeSymbol( "INFERENCE-VAR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym1$SYMBOLP = makeSymbol( "SYMBOLP" );
    $sym2$CLET = makeSymbol( "CLET" );
    $sym3$CUNWIND_PROTECT = makeSymbol( "CUNWIND-PROTECT" );
    $sym4$PROGN = makeSymbol( "PROGN" );
    $sym5$DESTROY_INFERENCE_AND_PROBLEM_STORE = makeSymbol( "DESTROY-INFERENCE-AND-PROBLEM-STORE" );
    $list6 = ConsesLow.list( ConsesLow.list( makeSymbol( "PROBLEM-STORE-VAR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym7$DESTROY_PROBLEM_STORE = makeSymbol( "DESTROY-PROBLEM-STORE" );
    $list8 = ConsesLow.list( ConsesLow.list( makeSymbol( "PROBLEM-STORE-VAR" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "PROPERTIES" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym9$WITH_PROBLEM_STORE_VAR = makeSymbol( "WITH-PROBLEM-STORE-VAR" );
    $sym10$CSETQ = makeSymbol( "CSETQ" );
    $sym11$NEW_PROBLEM_STORE = makeSymbol( "NEW-PROBLEM-STORE" );
    $list12 = ConsesLow.list( ConsesLow.list( makeSymbol( "LINK-VAR" ), makeSymbol( "PROBLEM" ), makeSymbol( "&KEY" ), makeSymbol( "TYPE" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list13 = ConsesLow.list( makeKeyword( "TYPE" ), makeKeyword( "DONE" ) );
    $kw14$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw15$TYPE = makeKeyword( "TYPE" );
    $kw16$DONE = makeKeyword( "DONE" );
    $sym17$DO_SET_CONTENTS = makeSymbol( "DO-SET-CONTENTS" );
    $sym18$PROBLEM_ARGUMENT_LINKS = makeSymbol( "PROBLEM-ARGUMENT-LINKS" );
    $sym19$DO_PROBLEM_ARGUMENT_LINKS = makeSymbol( "DO-PROBLEM-ARGUMENT-LINKS" );
    $sym20$PWHEN = makeSymbol( "PWHEN" );
    $sym21$PROBLEM_LINK_HAS_TYPE_ = makeSymbol( "PROBLEM-LINK-HAS-TYPE?" );
    $list22 = ConsesLow.list( ConsesLow.list( makeSymbol( "SUPPORTING-MAPPED-PROBLEM-VAR" ), makeSymbol( "LINK" ), makeSymbol( "&KEY" ), makeSymbol( "OPEN?" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol(
        "BODY" ) );
    $list23 = ConsesLow.list( makeKeyword( "OPEN?" ), makeKeyword( "DONE" ) );
    $kw24$OPEN_ = makeKeyword( "OPEN?" );
    $sym25$LINK_VAR = makeUninternedSymbol( "LINK-VAR" );
    $sym26$DO_LIST = makeSymbol( "DO-LIST" );
    $sym27$PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEMS = makeSymbol( "PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEMS" );
    $sym28$DO_PROBLEM_LINK_OPEN_MATCH_ = makeSymbol( "DO-PROBLEM-LINK-OPEN-MATCH?" );
    $sym29$DO_PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEMS = makeSymbol( "DO-PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEMS" );
    $list30 = ConsesLow.list( ConsesLow.list( makeSymbol( "SUPPORTING-MAPPED-PROBLEM-VAR" ), makeSymbol( "INDEX-VAR" ), makeSymbol( "LINK" ), makeSymbol( "&KEY" ), makeSymbol( "OPEN?" ), makeSymbol( "DONE" ) ),
        makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list31 = ConsesLow.list( ZERO_INTEGER );
    $sym32$CINC = makeSymbol( "CINC" );
    $list33 = ConsesLow.list( ConsesLow.list( makeSymbol( "SUPPORTING-PROBLEM-VAR" ), makeSymbol( "VARIABLE-MAP-VAR" ), makeSymbol( "LINK" ), makeSymbol( "&KEY" ), makeSymbol( "OPEN?" ), makeSymbol( "DONE" ) ),
        makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym34$SUPPORTING_MAPPED_PROBLEM = makeUninternedSymbol( "SUPPORTING-MAPPED-PROBLEM" );
    $sym35$MAPPED_PROBLEM_PROBLEM = makeSymbol( "MAPPED-PROBLEM-PROBLEM" );
    $sym36$MAPPED_PROBLEM_VARIABLE_MAP = makeSymbol( "MAPPED-PROBLEM-VARIABLE-MAP" );
    $list37 = ConsesLow.list( ConsesLow.list( makeSymbol( "SIBLING-LINK-VAR" ), makeSymbol( "LINK" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list38 = ConsesLow.list( makeKeyword( "DONE" ) );
    $sym39$SUPPORTED_PROBLEM = makeUninternedSymbol( "SUPPORTED-PROBLEM" );
    $sym40$LINK_VAR = makeUninternedSymbol( "LINK-VAR" );
    $sym41$PROBLEM_LINK_SUPPORTED_PROBLEM = makeSymbol( "PROBLEM-LINK-SUPPORTED-PROBLEM" );
    $sym42$PUNLESS = makeSymbol( "PUNLESS" );
    $list43 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEPENDENT-LINK-VAR" ), makeSymbol( "LINK" ), makeSymbol( "&KEY" ), makeSymbol( "LINK-TYPE" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol(
        "BODY" ) );
    $list44 = ConsesLow.list( makeKeyword( "LINK-TYPE" ), makeKeyword( "DONE" ) );
    $kw45$LINK_TYPE = makeKeyword( "LINK-TYPE" );
    $sym46$SUPPORTED_PROBLEM = makeUninternedSymbol( "SUPPORTED-PROBLEM" );
    $sym47$DO_PROBLEM_DEPENDENT_LINKS = makeSymbol( "DO-PROBLEM-DEPENDENT-LINKS" );
    $list48 = ConsesLow.list( ConsesLow.list( makeSymbol( "ARGUMENT-LINK-VAR" ), makeSymbol( "LINK" ), makeSymbol( "&KEY" ), makeSymbol( "OPEN?" ), makeSymbol( "LINK-TYPE" ), makeSymbol( "DONE" ) ), makeSymbol(
        "&BODY" ), makeSymbol( "BODY" ) );
    $list49 = ConsesLow.list( makeKeyword( "OPEN?" ), makeKeyword( "LINK-TYPE" ), makeKeyword( "DONE" ) );
    $sym50$SUPPORTING_PROBLEM = makeUninternedSymbol( "SUPPORTING-PROBLEM" );
    $sym51$VARIABLE_MAP = makeUninternedSymbol( "VARIABLE-MAP" );
    $sym52$DO_PROBLEM_LINK_SUPPORTING_PROBLEMS = makeSymbol( "DO-PROBLEM-LINK-SUPPORTING-PROBLEMS" );
    $sym53$IGNORE = makeSymbol( "IGNORE" );
    $list54 = ConsesLow.list( ConsesLow.list( makeSymbol( "PROOF-VAR" ), makeSymbol( "LINK" ), makeSymbol( "&KEY" ), makeSymbol( "PROOF-STATUS" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list55 = ConsesLow.list( makeKeyword( "PROOF-STATUS" ) );
    $kw56$PROOF_STATUS = makeKeyword( "PROOF-STATUS" );
    $sym57$CDOLIST = makeSymbol( "CDOLIST" );
    $sym58$PROBLEM_LINK_PROOFS = makeSymbol( "PROBLEM-LINK-PROOFS" );
    $sym59$PROOF_HAS_STATUS_ = makeSymbol( "PROOF-HAS-STATUS?" );
    $list60 = ConsesLow.list( ConsesLow.list( makeSymbol( "RT-LINK-VAR" ), makeSymbol( "JO-LINK" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym61$JO_LINK_VAR = makeUninternedSymbol( "JO-LINK-VAR" );
    $sym62$MOTIVATING_CONJUNCTION_PROBLEM = makeUninternedSymbol( "MOTIVATING-CONJUNCTION-PROBLEM" );
    $kw63$RESIDUAL_TRANSFORMATION = makeKeyword( "RESIDUAL-TRANSFORMATION" );
    $sym64$RESIDUAL_TRANSFORMATION_LINK_MOTIVATED_BY_JOIN_ORDERED_LINK_ = makeSymbol( "RESIDUAL-TRANSFORMATION-LINK-MOTIVATED-BY-JOIN-ORDERED-LINK?" );
    $list65 = ConsesLow.list( ConsesLow.list( makeSymbol( "RT-LINK-VAR" ), makeSymbol( "T-LINK" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym66$T_LINK_VAR = makeUninternedSymbol( "T-LINK-VAR" );
    $sym67$JO_LINK_VAR = makeUninternedSymbol( "JO-LINK-VAR" );
    $sym68$DO_PROBLEM_LINK_DEPENDENT_LINKS = makeSymbol( "DO-PROBLEM-LINK-DEPENDENT-LINKS" );
    $kw69$JOIN_ORDERED = makeKeyword( "JOIN-ORDERED" );
    $sym70$DO_JOIN_ORDERED_LINK_MOTIVATED_RESIDUAL_TRANSFORMATION_LINKS = makeSymbol( "DO-JOIN-ORDERED-LINK-MOTIVATED-RESIDUAL-TRANSFORMATION-LINKS" );
    $sym71$RESIDUAL_TRANSFORMATION_LINK_MOTIVATED_BY_TRANSFORMATION_LINK_ = makeSymbol( "RESIDUAL-TRANSFORMATION-LINK-MOTIVATED-BY-TRANSFORMATION-LINK?" );
    $list72 = ConsesLow.list( ConsesLow.list( makeSymbol( "*CURRENT-FORWARD-PROBLEM-STORE*" ), NIL ) );
    $list73 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLEAR-CURRENT-FORWARD-PROBLEM-STORE" ) ) );
    $list74 = ConsesLow.list( ConsesLow.list( makeSymbol( "*TYPE-FILTER-FORWARD-DNF*" ), T ) );
    $list75 = ConsesLow.list( makeSymbol( "RULES" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym76$_FORWARD_INFERENCE_ALLOWED_RULES_ = makeSymbol( "*FORWARD-INFERENCE-ALLOWED-RULES*" );
    $sym77$WITH_FORWARD_INFERENCE_ALLOWED_RULES = makeSymbol( "WITH-FORWARD-INFERENCE-ALLOWED-RULES" );
    $kw78$ALL = makeKeyword( "ALL" );
    $sym79$_FORWARD_INFERENCE_FORBIDDEN_RULES_ = makeSymbol( "*FORWARD-INFERENCE-FORBIDDEN-RULES*" );
    $sym80$WITH_FORWARD_INFERENCE_FORBIDDEN_RULES = makeSymbol( "WITH-FORWARD-INFERENCE-FORBIDDEN-RULES" );
    $kw81$NONE = makeKeyword( "NONE" );
    $sym82$INFERENCE_P = makeSymbol( "INFERENCE-P" );
    $list83 = ConsesLow.list( makeSymbol( "INFERENCE" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym84$_CONTROLLING_INFERENCES_ = makeSymbol( "*CONTROLLING-INFERENCES*" );
    $sym85$CONS = makeSymbol( "CONS" );
    $list86 = ConsesLow.list( makeSymbol( "*CONTROLLING-INFERENCES*" ) );
    $sym87$WITHIN_CONTROLLING_INFERENCE = makeSymbol( "WITHIN-CONTROLLING-INFERENCE" );
    $sym88$WITHIN_NO_CONTROLLING_STRATEGY = makeSymbol( "WITHIN-NO-CONTROLLING-STRATEGY" );
    $list89 = ConsesLow.list( makeSymbol( "STRATEGY" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym90$_CONTROLLING_STRATEGY_ = makeSymbol( "*CONTROLLING-STRATEGY*" );
    $sym91$WITHIN_CONTROLLING_STRATEGY = makeSymbol( "WITHIN-CONTROLLING-STRATEGY" );
    $list92 = ConsesLow.list( ConsesLow.list( makeSymbol( "INFERENCE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $kw93$CYC_MAINT = makeKeyword( "CYC-MAINT" );
    $sym94$GATHER_TICK_DATA_ = makeUninternedSymbol( "GATHER-TICK-DATA?" );
    $sym95$INITIAL_ARETE_TERMS_TOUCHED_COUNT = makeUninternedSymbol( "INITIAL-ARETE-TERMS-TOUCHED-COUNT" );
    $sym96$INITIAL_ARETE_ASSERTIONS_TOUCHED_COUNT = makeUninternedSymbol( "INITIAL-ARETE-ASSERTIONS-TOUCHED-COUNT" );
    $sym97$INITIAL_ARETE_LOG_LAST_KB_TOUCH_ = makeUninternedSymbol( "INITIAL-ARETE-LOG-LAST-KB-TOUCH?" );
    $sym98$INITIAL_ARETE_LOG_KB_TOUCH_COUNTS_ = makeUninternedSymbol( "INITIAL-ARETE-LOG-KB-TOUCH-COUNTS?" );
    $sym99$FINAL_ARETE_TERMS_TOUCHED_COUNT = makeUninternedSymbol( "FINAL-ARETE-TERMS-TOUCHED-COUNT" );
    $sym100$FINAL_ARETE_ASSERTIONS_TOUCHED_COUNT = makeUninternedSymbol( "FINAL-ARETE-ASSERTIONS-TOUCHED-COUNT" );
    $sym101$INFERENCE_GATHERS_TICK_INDEXED_PROGRESS_DATA_ = makeSymbol( "INFERENCE-GATHERS-TICK-INDEXED-PROGRESS-DATA?" );
    $list102 = ConsesLow.list( makeSymbol( "*ARETE-TERMS-TOUCHED-COUNT*" ) );
    $list103 = ConsesLow.list( makeSymbol( "*ARETE-ASSERTIONS-TOUCHED-COUNT*" ) );
    $list104 = ConsesLow.list( makeSymbol( "*ARETE-LOG-LAST-KB-TOUCH?*" ) );
    $list105 = ConsesLow.list( makeSymbol( "*ARETE-LOG-KB-TOUCH-COUNTS?*" ) );
    $sym106$_ARETE_TERMS_TOUCHED_COUNT_ = makeSymbol( "*ARETE-TERMS-TOUCHED-COUNT*" );
    $sym107$FIF = makeSymbol( "FIF" );
    $sym108$_ARETE_ASSERTIONS_TOUCHED_COUNT_ = makeSymbol( "*ARETE-ASSERTIONS-TOUCHED-COUNT*" );
    $sym109$_ARETE_LOG_LAST_KB_TOUCH__ = makeSymbol( "*ARETE-LOG-LAST-KB-TOUCH?*" );
    $sym110$_ARETE_LOG_KB_TOUCH_COUNTS__ = makeSymbol( "*ARETE-LOG-KB-TOUCH-COUNTS?*" );
    $sym111$_ = makeSymbol( "+" );
    $sym112$GATHER_TICK_DATA_ = makeUninternedSymbol( "GATHER-TICK-DATA?" );
    $sym113$INITIAL_ARETE_ASSERTIONS_TOUCHED = makeUninternedSymbol( "INITIAL-ARETE-ASSERTIONS-TOUCHED" );
    $sym114$INITIAL_ARETE_CONSTANTS_TOUCHED = makeUninternedSymbol( "INITIAL-ARETE-CONSTANTS-TOUCHED" );
    $sym115$INITIAL_ARETE_NARTS_TOUCHED = makeUninternedSymbol( "INITIAL-ARETE-NARTS-TOUCHED" );
    $sym116$INITIAL_ARETE_LOG_LAST_KB_TOUCH_ = makeUninternedSymbol( "INITIAL-ARETE-LOG-LAST-KB-TOUCH?" );
    $sym117$INITIAL_ARETE_LOG_KB_TOUCHES_ = makeUninternedSymbol( "INITIAL-ARETE-LOG-KB-TOUCHES?" );
    $sym118$FINAL_ARETE_ASSERTIONS_TOUCHED = makeUninternedSymbol( "FINAL-ARETE-ASSERTIONS-TOUCHED" );
    $sym119$FINAL_ARETE_CONSTANTS_TOUCHED = makeUninternedSymbol( "FINAL-ARETE-CONSTANTS-TOUCHED" );
    $sym120$FINAL_ARETE_NARTS_TOUCHED = makeUninternedSymbol( "FINAL-ARETE-NARTS-TOUCHED" );
    $sym121$INFERENCE_SHOULD_GATHER_TICK_INDEXED_PROGRESS_DATA_ = makeSymbol( "INFERENCE-SHOULD-GATHER-TICK-INDEXED-PROGRESS-DATA?" );
    $list122 = ConsesLow.list( makeSymbol( "*ARETE-ASSERTIONS-TOUCHED*" ) );
    $list123 = ConsesLow.list( makeSymbol( "*ARETE-CONSTANTS-TOUCHED*" ) );
    $list124 = ConsesLow.list( makeSymbol( "*ARETE-NARTS-TOUCHED*" ) );
    $list125 = ConsesLow.list( makeSymbol( "*ARETE-LOG-KB-TOUCHES?*" ) );
    $sym126$_ARETE_ASSERTIONS_TOUCHED_ = makeSymbol( "*ARETE-ASSERTIONS-TOUCHED*" );
    $list127 = ConsesLow.list( makeSymbol( "NEW-SET" ) );
    $sym128$_ARETE_CONSTANTS_TOUCHED_ = makeSymbol( "*ARETE-CONSTANTS-TOUCHED*" );
    $sym129$_ARETE_NARTS_TOUCHED_ = makeSymbol( "*ARETE-NARTS-TOUCHED*" );
    $sym130$_ARETE_LOG_KB_TOUCHES__ = makeSymbol( "*ARETE-LOG-KB-TOUCHES?*" );
    $sym131$SET_NMERGE = makeSymbol( "SET-NMERGE" );
    $list132 = ConsesLow.list( ConsesLow.list( makeSymbol( "DISJUNCT-VAR" ), makeSymbol( "PATTERN" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym133$PATTERN_VAR = makeUninternedSymbol( "PATTERN-VAR" );
    $sym134$PIF = makeSymbol( "PIF" );
    $sym135$OR_PATTERN_P = makeSymbol( "OR-PATTERN-P" );
    $sym136$REST = makeSymbol( "REST" );
    $list137 = ConsesLow.list( ConsesLow.list( makeSymbol( "QUERY-INFO-VAR" ), makeSymbol( "FILENAME" ), makeSymbol( "&KEY" ), makeSymbol( "ELEMENT-NUM" ), makeSymbol( "DONE?" ) ), makeSymbol( "&BODY" ), makeSymbol(
        "BODY" ) );
    $list138 = ConsesLow.list( makeKeyword( "ELEMENT-NUM" ), makeKeyword( "DONE?" ) );
    $kw139$ELEMENT_NUM = makeKeyword( "ELEMENT-NUM" );
    $kw140$DONE_ = makeKeyword( "DONE?" );
    $sym141$DONE_VAR_ = makeUninternedSymbol( "DONE-VAR?" );
    $sym142$I = makeUninternedSymbol( "I" );
    $sym143$INPUT_STREAM = makeUninternedSymbol( "INPUT-STREAM" );
    $list144 = ConsesLow.list( NIL );
    $sym145$WITH_PRIVATE_BINARY_FILE = makeSymbol( "WITH-PRIVATE-BINARY-FILE" );
    $list146 = ConsesLow.list( makeKeyword( "INPUT" ) );
    $sym147$WITH_CFASL_COMMON_SYMBOLS = makeSymbol( "WITH-CFASL-COMMON-SYMBOLS" );
    $list148 = ConsesLow.list( makeSymbol( "ASKED-QUERY-COMMON-SYMBOLS" ) );
    $sym149$UNTIL = makeSymbol( "UNTIL" );
    $sym150$LOAD_ASKED_QUERY_FROM_STREAM = makeSymbol( "LOAD-ASKED-QUERY-FROM-STREAM" );
    $sym151$PCOND = makeSymbol( "PCOND" );
    $kw152$EOF = makeKeyword( "EOF" );
    $list153 = ConsesLow.list( T );
    $sym154$STRINGP = makeSymbol( "STRINGP" );
    $sym155$WARN = makeSymbol( "WARN" );
    $str156$Read_invalid_query_info__s = makeString( "Read invalid query info ~s" );
    $list157 = ConsesLow.list( ConsesLow.list( makeSymbol( "QUERY-INFO-VAR" ), makeSymbol( "FILENAME-VAR" ), makeSymbol( "DIRECTORY" ), makeSymbol( "&KEY" ), makeSymbol( "DONE?" ) ), makeSymbol( "&BODY" ), makeSymbol(
        "BODY" ) );
    $list158 = ConsesLow.list( makeKeyword( "DONE?" ) );
    $sym159$DO_DIRECTORY_CONTENTS = makeSymbol( "DO-DIRECTORY-CONTENTS" );
    $sym160$ASKED_QUERIES_FILENAME_ = makeSymbol( "ASKED-QUERIES-FILENAME?" );
    $sym161$DO_ASKED_QUERIES = makeSymbol( "DO-ASKED-QUERIES" );
    $list162 = ConsesLow.list( new SubLObject[] { makeSymbol( "TRACE-LEVEL" ), makeSymbol( "CONTROL-STRING" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "ARG1" ), makeSymbol( "ARG2" ), makeSymbol( "ARG3" ), makeSymbol(
        "ARG4" ), makeSymbol( "ARG5" ), makeSymbol( "ARG6" ), makeSymbol( "ARG7" ), makeSymbol( "ARG8" )
    } );
    $sym163$__ = makeSymbol( ">=" );
    $sym164$_INFERENCE_TRACE_LEVEL_ = makeSymbol( "*INFERENCE-TRACE-LEVEL*" );
    $sym165$FORCE_FORMAT = makeSymbol( "FORCE-FORMAT" );
  }
}
/*
 * 
 * Total time: 368 ms
 * 
 */