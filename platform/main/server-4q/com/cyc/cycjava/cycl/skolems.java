package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.cycjava.cycl.inference.harness.hl_prototypes;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class skolems
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.skolems";
  public static final String myFingerPrint = "2a6baf66be2821603583f01291d4d7a4df28438c4c2482b0d8630acfe0079b85";
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7597L)
  private static SubLSymbol $skolem_arg_sort$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13044L)
  private static SubLSymbol $formula_constant_str_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29964L)
  private static SubLSymbol $recompute_skolem_defn_info$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 59748L)
  private static SubLSymbol $skolems_with_known_issues$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 63152L)
  private static SubLSymbol $skolems_safe_to_recanonicalize_at_el$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 72810L)
  private static SubLSymbol $target_consequent_literal_count$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 82839L)
  private static SubLSymbol $skolems_known_to_be_unfindable_via_el$;
  private static final SubLList $list0;
  private static final SubLObject $const1$termOfUnit;
  private static final SubLList $list2;
  private static final SubLObject $const3$SkolemFunctionFn;
  private static final SubLObject $const4$SkolemFunction;
  private static final SubLObject $const5$SkolemFuncN;
  private static final SubLObject $const6$SkolemFuncNFn;
  private static final SubLString $str7$unreified_skolem_term_references_;
  private static final SubLSymbol $sym8$CAR;
  private static final SubLSymbol $sym9$_;
  private static final SubLSymbol $sym10$CDR;
  private static final SubLString $str11$skolem_args____s_vs__s;
  private static final SubLSymbol $sym12$CLAUSE_FREE_SEQUENCE_VARIABLES;
  private static final SubLSymbol $sym13$CLAUSE_FREE_TERM_VARIABLES;
  private static final SubLSymbol $kw14$TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE;
  private static final SubLSymbol $sym15$EL_VAR_;
  private static final SubLSymbol $sym16$UNREIFIED_SKOLEM_TERM_;
  private static final SubLSymbol $sym17$SKOLEM_FUNCTION_VAR;
  private static final SubLList $list18;
  private static final SubLObject $const19$VariableAritySkolemFuncN;
  private static final SubLObject $const20$FixedAritySkolemFuncN;
  private static final SubLObject $const21$VariableAritySkolemFunction;
  private static final SubLObject $const22$FixedAritySkolemFunction;
  private static final SubLSymbol $sym23$STRING_;
  private static final SubLSymbol $sym24$FORMULA_CONSTANT_STR;
  private static final SubLSymbol $kw25$EL_VAR;
  private static final SubLSymbol $sym26$CYC_VAR_EXCEPT_FOR_X_0_;
  private static final SubLSymbol $sym27$_FORMULA_CONSTANT_STR_CACHING_STATE_;
  private static final SubLInteger $int28$512;
  private static final SubLInteger $int29$64;
  private static final SubLSymbol $sym30$_X_0;
  private static final SubLSymbol $kw31$MAPPING_DONE;
  private static final SubLList $list32;
  private static final SubLString $str33$Multiple_skolem_sequence_variable;
  private static final SubLString $str34$SkolemFuncN_appears_as_SkolemFunc;
  private static final SubLSymbol $sym35$_X;
  private static final SubLList $list36;
  private static final SubLSymbol $sym37$FALSE;
  private static final SubLSymbol $kw38$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym39$IGNORE_ERRORS_HANDLER;
  private static final SubLSymbol $sym40$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const41$EverythingPSC;
  private static final SubLObject $const42$skolem;
  private static final SubLSymbol $sym43$ASSERTION_IST_FORMULA;
  private static final SubLSymbol $sym44$SKOLEM_FUNCTION_P;
  private static final SubLSymbol $sym45$RELEVANT_MT_IS_GENL_MT;
  private static final SubLSymbol $sym46$OPAQUE_ARG_WRT_EL_TEMPLATE_;
  private static final SubLString $str47$_in_gaf_has_corresponding_cnf_in_;
  private static final SubLObject $const48$isa;
  private static final SubLSymbol $sym49$REIFIED_SKOLEM_FN_;
  private static final SubLSymbol $sym50$SENTENCE_ARG0;
  private static final SubLSymbol $sym51$DEDUCTION_ASSERTION;
  private static final SubLSymbol $sym52$ASSERTION_FORMULA;
  private static final SubLSymbol $sym53$REIFIED_SKOLEM_FN_IN_ANY_MT_;
  private static final SubLString $str54$recomputing_skolem_defn_info_cons;
  private static final SubLString $str55$recomputing_skolem_defn_info_var_;
  private static final SubLString $str56$really_recomputing_skolem_defn__c;
  private static final SubLString $str57$recomputing_skolem_defn_info_defn;
  private static final SubLString $str58$recomputing_skolem_defn_info_key_;
  private static final SubLString $str59$recomputing_skolem_defn_info_blis;
  private static final SubLString $str60$set_recomputing_skolem_defn_resul;
  private static final SubLString $str61$set_recomputing_skolem_defn_blist;
  private static final SubLSymbol $kw62$GAF;
  private static final SubLString $str63$note_skolem_binding_called_when_n;
  private static final SubLString $str64$Total_KB_Skolems___a;
  private static final SubLString $str65$building_skolem_defn_table;
  private static final SubLString $str66$cdolist;
  private static final SubLSymbol $sym67$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__;
  private static final SubLList $list68;
  private static final SubLSymbol $sym69$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLSymbol $sym70$CSETQ;
  private static final SubLString $str71$_A;
  private static final SubLString $str72$____reified_skolem__a_not_known_t;
  private static final SubLString $str73$No_skolem_defn_assertions_for___S;
  private static final SubLObject $const74$IntervalMinFn;
  private static final SubLObject $const75$IntervalMaxFn;
  private static final SubLObject $const76$ScalarInterval;
  private static final SubLSymbol $kw77$UNNAMED_SKOLEM_FN;
  private static final SubLString $str78$__disjoint_result_types___s____s;
  private static final SubLString $str79$__explicit_result_types___s____s;
  private static final SubLString $str80$__tacit_result_isa___s____s;
  private static final SubLString $str81$__no_result_types___s;
  private static final SubLString $str82$__tacit_result_genl___s____s;
  private static final SubLObject $const83$CycLReifiableDenotationalTerm;
  private static final SubLList $list84;
  private static final SubLString $str85$mapping_skolem_defn_table;
  private static final SubLList $list86;
  private static final SubLString $str87$__tacit_arg__s_type___s____s;
  private static final SubLString $str88$__no_arg__s_type___s____s;
  private static final SubLString $str89$mapping_skolem_axiom_table;
  private static final SubLList $list90;
  private static final SubLSymbol $sym91$CYC_CONST_GENERAL_EXISTENTIAL_OPERATOR_P;
  private static final SubLString $str92$fixing_skolems_w_o_mts;
  private static final SubLList $list93;
  private static final SubLSymbol $kw94$SKOLEM_DEFN_NOT_LIST;
  private static final SubLSymbol $kw95$SKOLEM_DEFN_MAL_LENGTH;
  private static final SubLList $list96;
  private static final SubLSymbol $kw97$SKOLEM_DEFN_ORTS;
  private static final SubLSymbol $kw98$SKOLEM_DEFN_MAL_SKOLEM_FORT;
  private static final SubLSymbol $kw99$SKOLEM_DEFN_MAL_UNREIFIED_FN_LENGTH;
  private static final SubLList $list100;
  private static final SubLSymbol $kw101$SKOLEM_DEFN_MAL_SKOLEM_FN_TYPE;
  private static final SubLSymbol $kw102$SKOLEM_DEFN_MAL_SKOLEM_FN_ARGS;
  private static final SubLSymbol $kw103$SKOLEM_DEFN_ARGS_W_O_NUMBER;
  private static final SubLSymbol $kw104$SKOLEM_DEFN_NON_VAR_ARGS;
  private static final SubLSymbol $kw105$SKOLEM_DEFN_MAL_SK_VAR;
  private static final SubLSymbol $kw106$SKOLEM_DEFN_ARGS_SK_TYPE_NUMBER_MISMATCH;
  private static final SubLObject $const107$Unity;
  private static final SubLSymbol $kw108$SKOLEM_DEFN_OBSOLETE_NUMBER;
  private static final SubLSymbol $kw109$SKOLEM_DEFN_MAL_MT;
  private static final SubLList $list110;
  private static final SubLList $list111;
  private static final SubLObject $list112;
  private static final SubLString $str113$_a__a__s__;
  private static final SubLSymbol $sym114$DIAGNOSE_JUST_THIS_SKOLEM;
  private static final SubLSymbol $kw115$PARTIALLY_UNFINDABLE;
  private static final SubLSymbol $kw116$UNFINDABLE;
  private static final SubLSymbol $kw117$FREE_VARIABLE;
  private static final SubLSymbol $kw118$MULTIPLE_MTS;
  private static final SubLSymbol $kw119$RAW_SKOLEM;
  private static final SubLSymbol $kw120$UNREIFIED_SKOLEM;
  private static final SubLSymbol $kw121$KNOWN_ISSUE;
  private static final SubLList $list122;
  private static final SubLSymbol $kw123$UNINITIALIZED;
  private static final SubLString $str124$different_el_formulas_for__a____s;
  private static final SubLList $list125;
  private static final SubLList $list126;
  private static final SubLList $list127;
  private static final SubLList $list128;
  private static final SubLList $list129;
  private static final SubLList $list130;
  private static final SubLList $list131;
  private static final SubLList $list132;
  private static final SubLList $list133;
  private static final SubLSymbol $kw134$IGNORE;
  private static final SubLList $list135;
  private static final SubLString $str136$Skolem_type_mismatch___a__a__a;
  private static final SubLString $str137$;
  private static final SubLString $str138$temporalMicrotheoriesIntersect_;
  private static final SubLString $str139$___amismatch_for__a___a___a__;
  private static final SubLList $list140;
  private static final SubLString $str141$Error;
  private static final SubLList $list142;
  private static final SubLSymbol $sym143$SKOLEM_SCALAR_TERM_;
  private static final SubLList $list144;
  private static final SubLObject $const145$temporalMicrotheoriesIntersect;
  private static final SubLList $list146;
  private static final SubLObject $const147$thereExists;
  private static final SubLSymbol $sym148$_TIME;
  private static final SubLObject $const149$ist;
  private static final SubLObject $const150$MtSpace;
  private static final SubLList $list151;
  private static final SubLObject $const152$and;
  private static final SubLList $list153;
  private static final SubLObject $const154$BaseKB;
  private static final SubLList $list155;
  private static final SubLString $str156$recanonicalizing_skolems;
  private static final SubLList $list157;
  private static final SubLSymbol $kw158$BREADTH;
  private static final SubLSymbol $kw159$QUEUE;
  private static final SubLSymbol $kw160$STACK;
  private static final SubLSymbol $sym161$RELEVANT_SBHL_TV_IS_GENERAL_TV;
  private static final SubLSymbol $kw162$ERROR;
  private static final SubLString $str163$_A_is_not_a__A;
  private static final SubLSymbol $sym164$SBHL_TRUE_TV_P;
  private static final SubLSymbol $kw165$CERROR;
  private static final SubLString $str166$continue_anyway;
  private static final SubLSymbol $kw167$WARN;
  private static final SubLString $str168$_A_is_not_a_valid__sbhl_type_erro;
  private static final SubLString $str169$_A_is_neither_SET_P_nor_LISTP_;
  private static final SubLString $str170$attempting_to_bind_direction_link;
  private static final SubLList $list171;
  private static final SubLString $str172$Node__a_does_not_pass_sbhl_type_t;
  private static final SubLString $str173$Bad_skolem_function___A__;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 486L)
  public static SubLObject reify_skolems_in(final SubLObject unreified_sk_terms, SubLObject v_clauses, final SubLObject mt, final SubLObject createP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject pairs = NIL;
    SubLObject cdolist_list_var = unreified_sk_terms;
    SubLObject unreified_sk_term = NIL;
    unreified_sk_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      unreified_sk_term = canonicalize_fns_in_sk_term( unreified_sk_term );
      final SubLObject sk_clauses = clause_utilities.term_clauses_including_refd_vars( unreified_sk_term, v_clauses, Symbols.symbol_function( EQUAL ) );
      final SubLObject skolem_term = canonicalize_skolem_term( unreified_sk_term, sk_clauses, mt, createP );
      if( NIL != misc_utilities.initialized_p( czer_main.$tou_skolem_blist$.getDynamicValue( thread ) ) )
      {
        final SubLObject orig_var = skolem_function_var( unreified_sk_term );
        final SubLObject sk_functor = cycl_utilities.nat_functor( skolem_term );
        czer_main.$tou_skolem_blist$.setDynamicValue( ConsesLow.cons( ConsesLow.cons( sk_functor, orig_var ), czer_main.$tou_skolem_blist$.getDynamicValue( thread ) ), thread );
      }
      pairs = ConsesLow.cons( ConsesLow.list( unreified_sk_term, skolem_term ), pairs );
      cdolist_list_var = cdolist_list_var.rest();
      unreified_sk_term = cdolist_list_var.first();
    }
    cdolist_list_var = pairs;
    SubLObject pair = NIL;
    pair = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = pair;
      SubLObject unreified_sk_term2 = NIL;
      SubLObject skolem_term2 = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
      unreified_sk_term2 = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
      skolem_term2 = current.first();
      current = current.rest();
      if( NIL == current )
      {
        v_clauses = subst_skolem_in( unreified_sk_term2, skolem_term2, v_clauses );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      pair = cdolist_list_var.first();
    }
    return v_clauses;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4211L)
  public static SubLObject canonicalize_fns_in_sk_term(final SubLObject sk_term)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = sk_term;
    SubLObject v_term = NIL;
    v_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != term.function_termP( v_term ) )
      {
        result = ConsesLow.cons( czer_main.canonicalize_fn_term_if_reified( v_term ), result );
      }
      else
      {
        result = ConsesLow.cons( v_term, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_term = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4458L)
  public static SubLObject subst_skolem_in(final SubLObject unreified_sk_term, final SubLObject skolem_term, final SubLObject v_clauses)
  {
    if( NIL != term.reified_skolem_constant_termP( skolem_term ) )
    {
      return czer_main.reify_function_in( skolem_term, conses_high.subst( skolem_term, unreified_sk_term, v_clauses, Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
    }
    if( NIL != term.reified_skolem_function_termP( skolem_term ) )
    {
      final SubLObject sk_var = skolem_function_var( unreified_sk_term );
      final SubLObject tou_lit = ConsesLow.list( $const1$termOfUnit, sk_var, skolem_term );
      SubLObject result = NIL;
      SubLObject cdolist_list_var = conses_high.subst( sk_var, unreified_sk_term, v_clauses, Symbols.symbol_function( EQUAL ), UNPROVIDED );
      SubLObject clause = NIL;
      clause = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != list_utilities.cons_tree_find( sk_var, clause, UNPROVIDED, UNPROVIDED ) )
        {
          SubLObject current;
          final SubLObject datum = current = clause;
          SubLObject neg_lits = NIL;
          SubLObject pos_lits = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list2 );
          neg_lits = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list2 );
          pos_lits = current.first();
          current = current.rest();
          if( NIL == current )
          {
            result = ConsesLow.cons( ConsesLow.list( list_utilities.nadd_to_end( tou_lit, neg_lits ), pos_lits ), result );
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list2 );
          }
        }
        else
        {
          result = ConsesLow.cons( clause, result );
        }
        cdolist_list_var = cdolist_list_var.rest();
        clause = cdolist_list_var.first();
      }
      return Sequences.nreverse( result );
    }
    if( NIL != skolem_term )
    {
      return conses_high.subst( skolem_term, unreified_sk_term, v_clauses, Symbols.symbol_function( EQUAL ), UNPROVIDED );
    }
    return v_clauses;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5250L)
  public static SubLObject skolem_function_dependent_vars(final SubLObject unreified_skolem_term)
  {
    SubLObject result = cycl_utilities.nat_arg1( unreified_skolem_term, UNPROVIDED );
    final SubLObject sequence_var = cycl_utilities.nat_arg3( unreified_skolem_term, UNPROVIDED );
    if( NIL != sequence_var )
    {
      result = ConsesLow.cons( sequence_var, result );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5569L)
  public static SubLObject skolem_function_var(final SubLObject unreified_skolem_term)
  {
    final SubLObject pcase_var = cycl_utilities.nat_functor( unreified_skolem_term );
    if( pcase_var.eql( $const3$SkolemFunctionFn ) )
    {
      return cycl_utilities.nat_arg2( unreified_skolem_term, UNPROVIDED );
    }
    if( pcase_var.eql( $const4$SkolemFunction ) )
    {
      return list_utilities.last_one( unreified_skolem_term );
    }
    if( pcase_var.eql( $const5$SkolemFuncN ) )
    {
      return list_utilities.penultimate_one( unreified_skolem_term );
    }
    if( pcase_var.eql( $const6$SkolemFuncNFn ) )
    {
      return cycl_utilities.nat_arg2( unreified_skolem_term, UNPROVIDED );
    }
    el_utilities.el_error( FIVE_INTEGER, $str7$unreified_skolem_term_references_, unreified_skolem_term, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6268L)
  public static SubLObject skolem_args(final SubLObject unreified_skolem_term, final SubLObject v_clauses, final SubLObject arg_sort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject sk_number = skolem_number( unreified_skolem_term );
    SubLObject args = NIL;
    SubLObject cdolist_list_var = Mapping.mapcar( Symbols.symbol_function( $sym8$CAR ), Sort.sort( conses_high.copy_list( arg_sort ), Symbols.symbol_function( $sym9$_ ), Symbols.symbol_function( $sym10$CDR ) ) );
    SubLObject arg = NIL;
    arg = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != subl_promotions.memberP( arg, conses_high.second( unreified_skolem_term ), UNPROVIDED, UNPROVIDED ) )
      {
        args = ConsesLow.cons( arg, args );
      }
      cdolist_list_var = cdolist_list_var.rest();
      arg = cdolist_list_var.first();
    }
    args = Sequences.nreverse( args );
    if( czer_vars.$el_trace_level$.getDynamicValue( thread ).numGE( ONE_INTEGER ) && ( NIL != conses_high.set_difference( conses_high.second( unreified_skolem_term ), args, UNPROVIDED, UNPROVIDED ) || NIL != conses_high
        .set_difference( args, conses_high.second( unreified_skolem_term ), UNPROVIDED, UNPROVIDED ) ) )
    {
      el_utilities.el_error( THREE_INTEGER, $str11$skolem_args____s_vs__s, conses_high.second( unreified_skolem_term ), args, UNPROVIDED );
    }
    final SubLObject sequence_vars = list_utilities.mapunion( Symbols.symbol_function( $sym12$CLAUSE_FREE_SEQUENCE_VARIABLES ), v_clauses, UNPROVIDED );
    final SubLObject term_vars = list_utilities.mapunion( Symbols.symbol_function( $sym13$CLAUSE_FREE_TERM_VARIABLES ), v_clauses, UNPROVIDED );
    SubLObject ans = NIL;
    if( Sequences.length( sequence_vars ).numG( ONE_INTEGER ) )
    {
      Dynamic.sublisp_throw( $kw14$TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE, ConsesLow.list( $kw14$TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE, skolem_seqvar( unreified_skolem_term ), sequence_vars ) );
    }
    if( NIL == czer_vars.$minimal_skolem_arityP$.getDynamicValue( thread ) )
    {
      SubLObject cdolist_list_var2 = args;
      SubLObject arg2 = NIL;
      arg2 = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        if( NIL != subl_promotions.memberP( arg2, term_vars, UNPROVIDED, UNPROVIDED ) )
        {
          ans = ConsesLow.cons( arg2, ans );
        }
        cdolist_list_var2 = cdolist_list_var2.rest();
        arg2 = cdolist_list_var2.first();
      }
      return Sequences.nreverse( list_utilities.cons_if( sk_number, ans ) );
    }
    if( NIL != sk_number )
    {
      return list_utilities.nadd_to_end( sk_number, args );
    }
    return args;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7686L)
  public static SubLObject canonicalize_skolem_term(final SubLObject unreified_sk_term, final SubLObject skolem_clauses, final SubLObject mt, final SubLObject createP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject defn = NIL;
    SubLObject arg_sort = NIL;
    final SubLObject sortable_skolem_clauses = replace_unreified_skolem_terms_with_variables( skolem_clauses );
    final SubLObject _prev_bind_0 = $skolem_arg_sort$.currentBinding( thread );
    try
    {
      $skolem_arg_sort$.bind( NIL, thread );
      defn = sk_defn_from_clauses( skolem_function_var( unreified_sk_term ), sortable_skolem_clauses, Symbols.symbol_function( $sym15$EL_VAR_ ) );
      arg_sort = $skolem_arg_sort$.getDynamicValue( thread );
    }
    finally
    {
      $skolem_arg_sort$.rebind( _prev_bind_0, thread );
    }
    final SubLObject term_args = skolem_args( unreified_sk_term, skolem_clauses, arg_sort );
    final SubLObject seqvar = skolem_seqvar( unreified_sk_term );
    final SubLObject possibly_dotted_args = ( NIL != seqvar ) ? ( ( NIL != term_args ) ? el_utilities.add_sequence_var_to_end( seqvar, term_args ) : seqvar ) : term_args;
    final SubLObject arity_min = Sequences.length( term_args );
    if( NIL != recomputing_skolem_defn_ofP( unreified_sk_term ) )
    {
      recompute_skolem_defn( unreified_sk_term, term_args, skolem_clauses, mt, defn, arity_min );
    }
    final SubLObject sk_defns = skolem_defns_from_key_specification( arity_min, defn );
    final SubLObject sk_constant = lookup_sk_constant_from_defns( defn, mt, sk_defns );
    if( NIL != sk_constant )
    {
      return ConsesLow.cons( sk_constant, possibly_dotted_args );
    }
    if( NIL != createP )
    {
      final SubLObject arg_isas = skolem_arg_isa_constraints( unreified_sk_term, skolem_clauses, UNPROVIDED );
      final SubLObject defn_unreified_sk_term = defn_unreified_sk_term( unreified_sk_term, term_args, skolem_clauses );
      return create_skolem( defn_unreified_sk_term, possibly_dotted_args, mt, defn, arg_isas );
    }
    if( NIL != list_utilities.not_equal( term_args, conses_high.second( unreified_sk_term ) ) )
    {
      return ConsesLow.cons( unreified_sk_term.first(), ConsesLow.cons( term_args, conses_high.cddr( unreified_sk_term ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9776L)
  public static SubLObject replace_unreified_skolem_terms_with_variables(final SubLObject v_clauses)
  {
    return transform_list_utilities.transform( v_clauses, $sym16$UNREIFIED_SKOLEM_TERM_, $sym17$SKOLEM_FUNCTION_VAR, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9923L)
  public static SubLObject lookup_sk_constant_from_defns(final SubLObject defn, final SubLObject mt, final SubLObject sk_defns)
  {
    SubLObject sk_constant = NIL;
    if( NIL == sk_constant )
    {
      SubLObject csome_list_var = sk_defns;
      SubLObject sk_defn = NIL;
      sk_defn = csome_list_var.first();
      while ( NIL == sk_constant && NIL != csome_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = sk_defn;
        SubLObject old_sk_constant = NIL;
        SubLObject old_unreified_sk_term = NIL;
        SubLObject sk_mt = NIL;
        SubLObject old_defn = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
        old_sk_constant = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
        old_unreified_sk_term = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
        sk_mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
        old_defn = current.first();
        current = current.rest();
        if( NIL == current )
        {
          if( defn.equal( old_defn ) && NIL != hlmt.hlmt_equalP( mt, sk_mt ) )
          {
            sk_constant = old_sk_constant;
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list18 );
        }
        csome_list_var = csome_list_var.rest();
        sk_defn = csome_list_var.first();
      }
    }
    return sk_constant;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10316L)
  public static SubLObject defn_unreified_sk_term(final SubLObject unreified_sk_term, final SubLObject args, final SubLObject skolem_clauses)
  {
    return list_utilities.replace_nth( ONE_INTEGER, args, czer_main.el_nununiquify_vars_wrt( unreified_sk_term, skolem_clauses ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10485L)
  public static SubLObject skolem_collection(final SubLObject unreified_sk_term)
  {
    return ( NIL != skolem_number( unreified_sk_term ) ) ? ( ( NIL != skolem_seqvar( unreified_sk_term ) ) ? ( ( NIL != czer_vars.$el_supports_variable_arity_skolemsP$.getGlobalValue() )
        ? $const19$VariableAritySkolemFuncN
        : $const5$SkolemFuncN ) : ( ( NIL != czer_vars.$el_supports_variable_arity_skolemsP$.getGlobalValue() ) ? $const20$FixedAritySkolemFuncN : $const5$SkolemFuncN ) )
        : ( ( NIL != skolem_seqvar( unreified_sk_term ) ) ? ( ( NIL != czer_vars.$el_supports_variable_arity_skolemsP$.getGlobalValue() ) ? $const21$VariableAritySkolemFunction : $const4$SkolemFunction )
            : ( ( NIL != czer_vars.$el_supports_variable_arity_skolemsP$.getGlobalValue() ) ? $const22$FixedAritySkolemFunction : $const4$SkolemFunction ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11140L)
  public static SubLObject create_skolem(final SubLObject unreified_sk_term, final SubLObject args, final SubLObject mt, final SubLObject cnfs, final SubLObject arg_types)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject skolem = NIL;
    final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding( thread );
    try
    {
      api_control_vars.$use_local_queueP$.bind( NIL, thread );
      final SubLObject tl_cnfs = canon_tl.convert_assertions_to_tl_ist_formulas( cnfs );
      skolem = fi.fi_create_skolem( constants_high.make_skolem_id(), unreified_sk_term, mt, tl_cnfs, arg_types );
      czer_vars.$subordinate_fi_opsP$.setDynamicValue( T, thread );
      if( NIL != skolem )
      {
        fi.fi_timestamp_constant( operation_communication.the_cyclist(), numeric_date_utilities.get_universal_date( UNPROVIDED, UNPROVIDED ), fi.ke_purpose(), numeric_date_utilities.get_universal_second( UNPROVIDED ) );
      }
    }
    finally
    {
      api_control_vars.$use_local_queueP$.rebind( _prev_bind_0, thread );
    }
    return ConsesLow.cons( skolem, args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11619L)
  public static SubLObject sk_defn_from_clauses(final SubLObject unreified_sk_term, final SubLObject v_clauses, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = Symbols.symbol_function( $sym15$EL_VAR_ );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject sorted_clauses = NIL;
    SubLObject cdolist_list_var = v_clauses;
    SubLObject clause = NIL;
    clause = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      sorted_clauses = ConsesLow.cons( czer_main.canonicalize_skolem_clause( clause, UNPROVIDED ), sorted_clauses );
      cdolist_list_var = cdolist_list_var.rest();
      clause = cdolist_list_var.first();
    }
    if( NIL == czer_vars.$control_2$.getDynamicValue( thread ) )
    {
      sorted_clauses = conses_high.subst( sk_defn_var(), unreified_sk_term, sorted_clauses, Symbols.symbol_function( EQUAL ), UNPROVIDED );
    }
    sorted_clauses = ( cdolist_list_var = alpha_sort_clauses( Sequences.nreverse( sorted_clauses ) ) );
    clause = NIL;
    clause = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      result = ConsesLow.cons( rename_skolem_clause_vars( unreified_sk_term, clause, varP ), result );
      cdolist_list_var = cdolist_list_var.rest();
      clause = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12175L)
  public static SubLObject alpha_sort_clauses(final SubLObject v_clauses)
  {
    if( NIL != list_utilities.singletonP( v_clauses ) )
    {
      return v_clauses;
    }
    return Sort.stable_sort( conses_high.copy_list( v_clauses ), Symbols.symbol_function( $sym23$STRING_ ), Symbols.symbol_function( $sym24$FORMULA_CONSTANT_STR ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12352L)
  public static SubLObject rename_skolem_clause_vars(final SubLObject unreified_sk_term, final SubLObject clause, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = Symbols.symbol_function( $sym15$EL_VAR_ );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_new = sk_defn_var();
    SubLObject blist = ConsesLow.list( ConsesLow.cons( unreified_sk_term, v_new ) );
    SubLObject count = ONE_INTEGER;
    SubLObject cdolist_list_var = clausifier.sort_vars( clause_utilities.clause_variables( clause, varP ) );
    SubLObject var = NIL;
    var = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( !var.equal( unreified_sk_term ) && !var.equal( sk_defn_var() ) )
      {
        if( NIL == conses_high.assoc( var, $skolem_arg_sort$.getDynamicValue( thread ), Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
        {
          $skolem_arg_sort$.setDynamicValue( ConsesLow.cons( ConsesLow.cons( var, count ), $skolem_arg_sort$.getDynamicValue( thread ) ), thread );
        }
        v_new = czer_utilities.get_nth_canonical_variable( count, $kw25$EL_VAR );
        count = Numbers.add( count, ONE_INTEGER );
        blist = ConsesLow.cons( ConsesLow.cons( var, v_new ), blist );
      }
      cdolist_list_var = cdolist_list_var.rest();
      var = cdolist_list_var.first();
    }
    return conses_high.sublis( blist, clause, Symbols.symbol_function( EQUAL ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12941L)
  public static SubLObject sk_defn_var()
  {
    return czer_utilities.get_nth_canonical_variable( ZERO_INTEGER, $kw25$EL_VAR );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13044L)
  public static SubLObject clear_formula_constant_str()
  {
    final SubLObject cs = $formula_constant_str_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13044L)
  public static SubLObject remove_formula_constant_str(final SubLObject formula)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $formula_constant_str_caching_state$.getGlobalValue(), ConsesLow.list( formula ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13044L)
  public static SubLObject formula_constant_str_internal(final SubLObject formula)
  {
    return string_utilities.str( el_utilities.formula_non_var_symbols( formula, Symbols.symbol_function( $sym26$CYC_VAR_EXCEPT_FOR_X_0_ ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13044L)
  public static SubLObject formula_constant_str(final SubLObject formula)
  {
    SubLObject caching_state = $formula_constant_str_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym24$FORMULA_CONSTANT_STR, $sym27$_FORMULA_CONSTANT_STR_CACHING_STATE_, $int28$512, EQUAL, ONE_INTEGER, $int29$64 );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, formula, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( formula_constant_str_internal( formula ) ) );
      memoization_state.caching_state_put( caching_state, formula, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13209L)
  public static SubLObject cyc_var_except_for_x_0P(final SubLObject v_object)
  {
    if( $sym30$_X_0.eql( v_object ) )
    {
      return NIL;
    }
    return cycl_variables.cyc_varP( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13434L)
  public static SubLObject make_sk_defn(final SubLObject sk_constant, final SubLObject unreified_sk_term, final SubLObject mt, final SubLObject cnfs)
  {
    return ConsesLow.list( sk_constant, unreified_sk_term, mt, cnfs );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13650L)
  public static SubLObject sk_arity(final SubLObject sk_args, SubLObject sk_number)
  {
    if( sk_number == UNPROVIDED )
    {
      sk_number = NIL;
    }
    if( NIL != sk_number )
    {
      return Numbers.add( ONE_INTEGER, Sequences.length( sk_args ) );
    }
    return Sequences.length( sk_args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13791L)
  public static SubLObject make_unreified_sk_nat(final SubLObject sk_args, final SubLObject sk_var, final SubLObject sk_seqvar, final SubLObject sk_number)
  {
    if( NIL != sk_number )
    {
      return ConsesLow.list( $const6$SkolemFuncNFn, sk_args, sk_var, sk_seqvar, sk_number );
    }
    return ConsesLow.list( $const3$SkolemFunctionFn, sk_args, sk_var, sk_seqvar );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14021L)
  public static SubLObject skolem_defn(final SubLObject skolem)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_answer = NIL;
    SubLObject catch_var = NIL;
    try
    {
      thread.throwStack.push( $kw31$MAPPING_DONE );
      SubLObject key = NIL;
      SubLObject v_defns = NIL;
      final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( czer_vars.$skolem_axiom_table$.getGlobalValue() );
      try
      {
        while ( Hashtables.iteratorHasNext( cdohash_iterator ))
        {
          final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
          key = Hashtables.getEntryKey( cdohash_entry );
          SubLObject cdolist_list_var;
          v_defns = ( cdolist_list_var = Hashtables.getEntryValue( cdohash_entry ) );
          SubLObject defn = NIL;
          defn = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            if( defn.first().eql( skolem ) )
            {
              v_answer = defn;
              utilities_macros.mapping_finished();
            }
            cdolist_list_var = cdolist_list_var.rest();
            defn = cdolist_list_var.first();
          }
        }
      }
      finally
      {
        Hashtables.releaseEntrySetIterator( cdohash_iterator );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var = Errors.handleThrowable( ccatch_env_var, $kw31$MAPPING_DONE );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14320L)
  public static SubLObject skolem_defnXkey(final SubLObject skolem)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_answer = NIL;
    SubLObject catch_var = NIL;
    try
    {
      thread.throwStack.push( $kw31$MAPPING_DONE );
      SubLObject key = NIL;
      SubLObject v_defns = NIL;
      final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( czer_vars.$skolem_axiom_table$.getGlobalValue() );
      try
      {
        while ( Hashtables.iteratorHasNext( cdohash_iterator ))
        {
          final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
          key = Hashtables.getEntryKey( cdohash_entry );
          SubLObject cdolist_list_var;
          v_defns = ( cdolist_list_var = Hashtables.getEntryValue( cdohash_entry ) );
          SubLObject defn = NIL;
          defn = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            if( defn.first().eql( skolem ) )
            {
              v_answer = ConsesLow.list( defn, key );
              utilities_macros.mapping_finished();
            }
            cdolist_list_var = cdolist_list_var.rest();
            defn = cdolist_list_var.first();
          }
        }
      }
      finally
      {
        Hashtables.releaseEntrySetIterator( cdohash_iterator );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var = Errors.handleThrowable( ccatch_env_var, $kw31$MAPPING_DONE );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14594L)
  public static SubLObject skolem_defn_key(final SubLObject skolem)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_answer = NIL;
    SubLObject catch_var = NIL;
    try
    {
      thread.throwStack.push( $kw31$MAPPING_DONE );
      SubLObject key = NIL;
      SubLObject v_defns = NIL;
      final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( czer_vars.$skolem_axiom_table$.getGlobalValue() );
      try
      {
        while ( Hashtables.iteratorHasNext( cdohash_iterator ))
        {
          final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
          key = Hashtables.getEntryKey( cdohash_entry );
          SubLObject cdolist_list_var;
          v_defns = ( cdolist_list_var = Hashtables.getEntryValue( cdohash_entry ) );
          SubLObject defn = NIL;
          defn = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            if( defn.first().eql( skolem ) )
            {
              v_answer = key;
              utilities_macros.mapping_finished();
            }
            cdolist_list_var = cdolist_list_var.rest();
            defn = cdolist_list_var.first();
          }
        }
      }
      finally
      {
        Hashtables.releaseEntrySetIterator( cdohash_iterator );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var = Errors.handleThrowable( ccatch_env_var, $kw31$MAPPING_DONE );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14882L)
  public static SubLObject skolem_of_defn(final SubLObject skolem_defn)
  {
    return skolem_defn.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14957L)
  public static SubLObject unreified_sk_term(final SubLObject skolem)
  {
    return conses_high.second( skolem_defn( skolem ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15066L)
  public static SubLObject skolem_defn_mt(final SubLObject constant)
  {
    return conses_high.third( skolem_defn( constant ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15175L)
  public static SubLObject skolem_seqvar(final SubLObject unreified_skolem_term)
  {
    if( NIL != old_format_skolemP( unreified_skolem_term ) )
    {
      return NIL;
    }
    return cycl_utilities.nat_arg3( unreified_skolem_term, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15384L)
  public static SubLObject skolem_defn_seqvar(final SubLObject skolem)
  {
    return skolem_seqvar( unreified_sk_term( skolem ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15522L)
  public static SubLObject old_format_skolemP(final SubLObject unreified_skolem_term)
  {
    if( $const3$SkolemFunctionFn.eql( cycl_utilities.nat_functor( unreified_skolem_term ) ) )
    {
      return el_utilities.formula_arityE( unreified_skolem_term, TWO_INTEGER, UNPROVIDED );
    }
    if( $const6$SkolemFuncNFn.eql( cycl_utilities.nat_functor( unreified_skolem_term ) ) )
    {
      return el_utilities.formula_arityE( unreified_skolem_term, THREE_INTEGER, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16066L)
  public static SubLObject skolem_number(final SubLObject unreified_skolem_term)
  {
    if( NIL != old_format_skolemP( unreified_skolem_term ) )
    {
      return cycl_utilities.nat_arg3( unreified_skolem_term, UNPROVIDED );
    }
    return cycl_utilities.nat_arg4( unreified_skolem_term, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16423L)
  public static SubLObject skolem_defn_number(final SubLObject skolem)
  {
    return skolem_number( unreified_sk_term( skolem ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16546L)
  public static SubLObject skolem_defn_args(final SubLObject skolem)
  {
    return conses_high.second( unreified_sk_term( skolem ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16722L)
  public static SubLObject skolem_var(final SubLObject skolem)
  {
    return skolem_function_var( unreified_sk_term( skolem ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16867L)
  public static SubLObject el_unreified_sk_term(final SubLObject constant)
  {
    final SubLObject unreified_sk_term = compute_unreified_sk_term_via_hl( constant );
    final SubLObject skolem_number = skolem_number( unreified_sk_term );
    if( NIL == skolem_number )
    {
      return ( NIL != old_format_skolemP( unreified_sk_term ) ) ? list_utilities.nadd_to_end( NIL, unreified_sk_term ) : unreified_sk_term;
    }
    SubLObject current;
    final SubLObject datum = current = unreified_sk_term;
    SubLObject skolem_type = NIL;
    SubLObject vars = NIL;
    SubLObject sk_var = NIL;
    SubLObject seqvar_or_number = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list32 );
    skolem_type = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list32 );
    vars = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list32 );
    sk_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list32 );
    seqvar_or_number = current.first();
    current = current.rest();
    final SubLObject number = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list32 );
    current = current.rest();
    if( NIL == current )
    {
      return ( NIL != old_format_skolemP( unreified_sk_term ) ) ? el_utilities.make_el_formula( skolem_type, ConsesLow.list( conses_high.butlast( vars, UNPROVIDED ), sk_var, NIL, seqvar_or_number ), UNPROVIDED )
          : el_utilities.make_el_formula( skolem_type, ConsesLow.list( conses_high.butlast( vars, UNPROVIDED ), sk_var, seqvar_or_number, number ), UNPROVIDED );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list32 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17822L)
  public static SubLObject compute_unreified_sk_term_via_hl(final SubLObject skolem)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject sk_args = compute_skolem_info_from_assertions( skolem, skolem_defn_assertions( skolem, UNPROVIDED ) );
    final SubLObject sk_var = thread.secondMultipleValue();
    final SubLObject sk_seqvar = thread.thirdMultipleValue();
    final SubLObject sk_number = thread.fourthMultipleValue();
    thread.resetMultipleValues();
    if( NIL != sk_var )
    {
      final SubLObject args = clausifier.sort_vars( sk_args );
      final SubLObject sk_defn_args = ( NIL != sk_number ) ? Sequences.nreverse( ConsesLow.cons( sk_number, Sequences.nreverse( args ) ) ) : args;
      final SubLObject unreified_sk_term = make_unreified_sk_nat( sk_defn_args, sk_var, sk_seqvar, sk_number );
      return unreified_sk_term;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18478L)
  public static SubLObject compute_skolem_info_from_assertions(final SubLObject skolem, final SubLObject assertions)
  {
    SubLObject cnfs = NIL;
    SubLObject args = NIL;
    SubLObject sk_args = NIL;
    SubLObject sk_var = NIL;
    SubLObject sk_seqvar = NIL;
    SubLObject sk_number = NIL;
    SubLObject generate_sk_varP = NIL;
    SubLObject cdolist_list_var = assertions;
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject cnf = fi.assertion_cnf_with_el_vars( assertion );
      final SubLObject tou_lits = uncanonicalizer.tou_lits_to_remove( cnf );
      SubLObject pos_lits = NIL;
      SubLObject neg_lits = NIL;
      SubLObject sk_cnf = NIL;
      if( NIL == tou_lits && arity.arity( skolem ).eql( ZERO_INTEGER ) )
      {
        cnfs = ConsesLow.cons( cnf, cnfs );
        generate_sk_varP = T;
      }
      else
      {
        pos_lits = conses_high.set_difference( clauses.pos_lits( cnf ), tou_lits, Symbols.symbol_function( EQUAL ), UNPROVIDED );
        neg_lits = conses_high.set_difference( clauses.neg_lits( cnf ), tou_lits, Symbols.symbol_function( EQUAL ), UNPROVIDED );
        sk_cnf = clauses.make_cnf( neg_lits, pos_lits );
        SubLObject cdolist_list_var_$1 = tou_lits;
        SubLObject lit = NIL;
        lit = cdolist_list_var_$1.first();
        while ( NIL != cdolist_list_var_$1)
        {
          if( NIL == term.reified_skolem_termP( el_utilities.literal_arg2( lit, UNPROVIDED ) ) )
          {
            sk_cnf = conses_high.subst( el_utilities.literal_arg2( lit, UNPROVIDED ), el_utilities.literal_arg1( lit, UNPROVIDED ), sk_cnf, Symbols.symbol_function( EQUAL ), UNPROVIDED );
          }
          cdolist_list_var_$1 = cdolist_list_var_$1.rest();
          lit = cdolist_list_var_$1.first();
        }
        SubLObject cdolist_list_var_$2 = tou_lits;
        lit = NIL;
        lit = cdolist_list_var_$2.first();
        while ( NIL != cdolist_list_var_$2)
        {
          if( skolem.eql( cycl_utilities.nat_functor( el_utilities.literal_arg2( lit, UNPROVIDED ) ) ) && NIL == sk_var )
          {
            sk_var = el_utilities.literal_arg1( lit, UNPROVIDED );
            if( NIL == args )
            {
              args = cycl_utilities.nat_args( el_utilities.literal_arg2( lit, UNPROVIDED ), UNPROVIDED );
              final SubLObject seqvar = el_utilities.sequence_var( el_utilities.literal_arg2( lit, UNPROVIDED ), UNPROVIDED );
              if( NIL != seqvar )
              {
                if( NIL != sk_seqvar && !seqvar.eql( sk_seqvar ) )
                {
                  Errors.warn( $str33$Multiple_skolem_sequence_variable, skolem, sk_seqvar, seqvar );
                }
                else
                {
                  sk_seqvar = seqvar;
                }
              }
              SubLObject cdolist_list_var_$3 = args;
              SubLObject arg = NIL;
              arg = cdolist_list_var_$3.first();
              while ( NIL != cdolist_list_var_$3)
              {
                if( NIL != collection_defns.el_variableP( arg ) )
                {
                  sk_args = ConsesLow.cons( arg, sk_args );
                }
                else if( NIL != skolem_scalar_termP( arg, assertions_high.assertion_mt( assertion ) ) && arg.equal( list_utilities.last_one( args ) ) )
                {
                  if( NIL == sk_number )
                  {
                    sk_number = arg;
                  }
                }
                else
                {
                  Errors.warn( $str34$SkolemFuncN_appears_as_SkolemFunc, skolem );
                  sk_args = ConsesLow.cons( arg, sk_args );
                }
                cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                arg = cdolist_list_var_$3.first();
              }
              sk_args = Sequences.nreverse( sk_args );
            }
          }
          cdolist_list_var_$2 = cdolist_list_var_$2.rest();
          lit = cdolist_list_var_$2.first();
        }
        cnfs = ConsesLow.cons( sk_cnf, cnfs );
      }
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    cnfs = Sequences.nreverse( cnfs );
    if( NIL != generate_sk_varP && NIL == sk_var )
    {
      final SubLObject skolem_nart = narts_high.find_nart( ConsesLow.list( skolem ) );
      if( NIL != skolem_nart )
      {
        sk_var = czer_utilities.unique_el_var_wrt_expression( cnfs, UNPROVIDED );
        if( !$sym35$_X.eql( sk_var ) )
        {
          print_high.print( sk_var, UNPROVIDED );
        }
      }
    }
    return Values.values( sk_args, sk_var, sk_seqvar, sk_number );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20553L)
  public static SubLObject skolem_table_key_from_defn(final SubLObject defn)
  {
    if( NIL != defn )
    {
      SubLObject sk_constant = NIL;
      SubLObject unreified_sk_term = NIL;
      SubLObject mt = NIL;
      SubLObject cnfs = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( defn, defn, $list36 );
      sk_constant = defn.first();
      SubLObject current = defn.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, defn, $list36 );
      unreified_sk_term = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, defn, $list36 );
      mt = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, defn, $list36 );
      cnfs = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject sk_args = conses_high.second( unreified_sk_term );
        return skolem_hash_key( Sequences.length( sk_args ), cnfs );
      }
      cdestructuring_bind.cdestructuring_bind_error( defn, $list36 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20882L)
  public static SubLObject skolem_table_key_from_constant(final SubLObject skolem)
  {
    return skolem_table_key_from_defn( skolem_defn( skolem ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20998L)
  public static SubLObject skolem_hash_key(final SubLObject v_arity, final SubLObject skolem_clauses)
  {
    return ConsesLow.cons( v_arity, czer_main.fort_sort_by_type_and_id( cycl_utilities.formula_forts( opaquify_unreified_skolem_terms( skolem_clauses ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21344L)
  public static SubLObject opaquify_unreified_skolem_terms(final SubLObject v_clauses)
  {
    return transform_list_utilities.transform( v_clauses, $sym16$UNREIFIED_SKOLEM_TERM_, $sym37$FALSE, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21463L)
  public static SubLObject skolem_defns_from_key_specification(final SubLObject v_arity, final SubLObject skolem_clauses)
  {
    final SubLObject key = skolem_hash_key( v_arity, skolem_clauses );
    final SubLObject v_defns = Hashtables.gethash( key, czer_vars.$skolem_axiom_table$.getGlobalValue(), UNPROVIDED );
    final SubLObject ort_key = ConsesLow.cons( v_arity, czer_main.fort_sort_by_type_and_id( cycl_utilities.formula_constants( skolem_clauses, UNPROVIDED ) ) );
    final SubLObject ort_defns = Hashtables.gethash( ort_key, czer_vars.$skolem_axiom_table$.getGlobalValue(), UNPROVIDED );
    if( NIL != ort_defns )
    {
      return ConsesLow.append( v_defns, ort_defns );
    }
    return v_defns;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22277L)
  public static SubLObject cnfs_of_skolem_defn(final SubLObject skolem_defn)
  {
    SubLObject sk_constant = NIL;
    SubLObject unreified_sk_term = NIL;
    SubLObject mt = NIL;
    SubLObject cnfs = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( skolem_defn, skolem_defn, $list36 );
    sk_constant = skolem_defn.first();
    SubLObject current = skolem_defn.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, skolem_defn, $list36 );
    unreified_sk_term = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, skolem_defn, $list36 );
    mt = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, skolem_defn, $list36 );
    cnfs = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return cnfs;
    }
    cdestructuring_bind.cdestructuring_bind_error( skolem_defn, $list36 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22466L)
  public static SubLObject mt_of_skolem_defn(final SubLObject skolem_defn)
  {
    SubLObject sk_constant = NIL;
    SubLObject unreified_sk_term = NIL;
    SubLObject mt = NIL;
    SubLObject cnfs = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( skolem_defn, skolem_defn, $list36 );
    sk_constant = skolem_defn.first();
    SubLObject current = skolem_defn.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, skolem_defn, $list36 );
    unreified_sk_term = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, skolem_defn, $list36 );
    mt = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, skolem_defn, $list36 );
    cnfs = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return mt;
    }
    cdestructuring_bind.cdestructuring_bind_error( skolem_defn, $list36 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22653L)
  public static SubLObject skolem_defn_cnfs(final SubLObject skolem)
  {
    SubLObject cnfs = NIL;
    SubLObject cdolist_list_var = skolem_defn_assertions( skolem, UNPROVIDED );
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject item_var = assertions_high.assertion_cnf( assertion );
      if( NIL == conses_high.member( item_var, cnfs, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        cnfs = ConsesLow.cons( item_var, cnfs );
      }
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    return Sequences.nreverse( cnfs );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22853L)
  public static SubLObject skolem_defn_assertions_robust(final SubLObject skolem, SubLObject printP)
  {
    if( printP == UNPROVIDED )
    {
      printP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw38$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym39$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          result = skolem_defn_assertions( skolem, printP );
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
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw38$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL == result )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym40$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const41$EverythingPSC, thread );
        result = kb_mapping.gather_function_rule_index( skolem, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23375L)
  public static SubLObject skolem_function_has_no_defn_assertions_robustP(final SubLObject skolem_function)
  {
    return Types.sublisp_null( skolem_defn_assertions_robust( skolem_function, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23523L)
  public static SubLObject skolem_function_has_no_defn_assertionsP(final SubLObject skolem_function)
  {
    return Types.sublisp_null( skolem_defn_assertions( skolem_function, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23657L)
  public static SubLObject skolem_defining_bookkeeping_assertion(final SubLObject skolem)
  {
    return kb_mapping_utilities.fpred_value_gaf_in_any_mt( skolem, $const42$skolem, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23776L)
  public static SubLObject skolem_defn_assertions(final SubLObject skolem, SubLObject printP)
  {
    if( printP == UNPROVIDED )
    {
      printP = NIL;
    }
    final SubLObject defining_bookeeping_assertion = skolem_defining_bookkeeping_assertion( skolem );
    if( NIL != defining_bookeeping_assertion )
    {
      final SubLObject deduction = assertions_high.assertion_arguments( defining_bookeeping_assertion ).first();
      if( NIL != deduction_handles.deduction_p( deduction ) )
      {
        return deductions_high.deduction_supports( deduction );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24225L)
  public static SubLObject skolems_defn_assertions(final SubLObject v_skolems)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = v_skolems;
    SubLObject skolem = NIL;
    skolem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject items_var = skolem_defn_assertions( skolem, UNPROVIDED );
      if( items_var.isVector() )
      {
        final SubLObject vector_var = items_var;
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject item;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          item = Vectors.aref( vector_var, element_num );
          result = ConsesLow.cons( item, result );
        }
      }
      else
      {
        SubLObject cdolist_list_var_$4 = items_var;
        SubLObject item2 = NIL;
        item2 = cdolist_list_var_$4.first();
        while ( NIL != cdolist_list_var_$4)
        {
          result = ConsesLow.cons( item2, result );
          cdolist_list_var_$4 = cdolist_list_var_$4.rest();
          item2 = cdolist_list_var_$4.first();
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      skolem = cdolist_list_var.first();
    }
    return Sequences.delete_duplicates( Sequences.nreverse( result ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24438L)
  public static SubLObject skolem_defn_siblings(final SubLObject skolem)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = czer_vars.$assertion_key$.currentBinding( thread );
    try
    {
      czer_vars.$assertion_key$.bind( $sym43$ASSERTION_IST_FORMULA, thread );
      result = cycl_utilities.expression_gather( skolem_defn_assertions( skolem, NIL ), $sym44$SKOLEM_FUNCTION_P, T, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      czer_vars.$assertion_key$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24795L)
  public static SubLObject skolem_defn_proper_siblings(final SubLObject skolem)
  {
    return Sequences.remove( skolem, skolem_defn_siblings( skolem ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25002L)
  public static SubLObject skolem_canonical_sibling(final SubLObject skolem)
  {
    return kb_utilities.sort_forts( conses_high.copy_list( skolem_defn_siblings( skolem ) ) ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25228L)
  public static SubLObject skolems_min_mt(final SubLObject v_skolems)
  {
    return assertion_utilities.assertions_min_mt( skolems_defn_assertions( v_skolems ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25335L)
  public static SubLObject skolem_only_mentioned_in_el_templatesP(final SubLObject skolem, final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != assertions_high.gaf_assertionP( assertion ) )
    {
      SubLObject found_outside_of_templateP = NIL;
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_3 = cycl_utilities.$opaque_arg_function$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym45$RELEVANT_MT_IS_GENL_MT, thread );
        mt_relevance_macros.$mt$.bind( assertions_high.assertion_mt( assertion ), thread );
        cycl_utilities.$opaque_arg_function$.bind( $sym46$OPAQUE_ARG_WRT_EL_TEMPLATE_, thread );
        found_outside_of_templateP = cycl_utilities.assertion_find( skolem, assertion, NIL, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        cycl_utilities.$opaque_arg_function$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
      return makeBoolean( NIL == found_outside_of_templateP );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26127L)
  public static SubLObject skolem_defn_assertionP(final SubLObject skolem, final SubLObject assertion, SubLObject printP)
  {
    if( printP == UNPROVIDED )
    {
      printP = NIL;
    }
    return subl_promotions.memberP( assertion, skolem_defn_assertions( skolem, printP ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26297L)
  public static SubLObject gaf_has_corresponding_cnf_in_skolem_defnP(final SubLObject skolem, final SubLObject gaf_assertion, SubLObject gaf_skolem)
  {
    if( gaf_skolem == UNPROVIDED )
    {
      gaf_skolem = NIL;
    }
    final SubLObject skolem_defn = skolem_defn( skolem );
    final SubLObject mt = assertions_high.assertion_mt( gaf_assertion );
    if( NIL != skolem_defn )
    {
      if( NIL != hlmt.hlmt_equalP( mt, mt_of_skolem_defn( skolem_defn ) ) )
      {
        final SubLObject cnfs = cnfs_of_skolem_defn( skolem_defn );
        final SubLObject cnf_skolem = ( NIL != gaf_skolem ) ? gaf_skolem : skolem;
        final SubLObject cnf = conses_high.subst( sk_defn_var(), cnf_skolem, assertions_high.assertion_cnf( gaf_assertion ), UNPROVIDED, UNPROVIDED );
        if( NIL != el_utilities.el_tracing_p( TWO_INTEGER ) && NIL != list_utilities.tree_find( cnf_skolem, assertions_high.assertion_cnf( gaf_assertion ), UNPROVIDED, UNPROVIDED )
            && NIL == constant_denoting_reified_skolem_fnP( skolem ) )
        {
          el_utilities.el_warn( TWO_INTEGER, $str47$_in_gaf_has_corresponding_cnf_in_, skolem, UNPROVIDED, UNPROVIDED );
        }
        return subl_promotions.memberP( cnf, cnfs, Symbols.symbol_function( EQUAL ), UNPROVIDED );
      }
    }
    else if( NIL != term.skolem_constantP( skolem ) )
    {
      final SubLObject skolem_to_use = cycl_utilities.nat_arg0( skolem );
      return gaf_has_corresponding_cnf_in_skolem_defnP( skolem_to_use, gaf_assertion, skolem );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27501L)
  public static SubLObject constant_denoting_reified_skolem_fnP(final SubLObject functor)
  {
    return makeBoolean( NIL != term.reified_skolem_fnP( functor ) && ZERO_INTEGER.eql( arity.arity( functor ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27640L)
  public static SubLObject computed_skolem_assertionP(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL == assertions_high.asserted_assertionP( assertion ) || ( NIL != assertions_high.gaf_assertionP( assertion ) && NIL != subl_promotions.memberP( assertions_high.gaf_arg0( assertion ),
        czer_vars.$preds_of_computed_skolem_gafs$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) && ( !assertions_high.gaf_arg0( assertion ).eql( $const48$isa ) || ( NIL != term.reified_skolem_fnP( assertions_high
            .gaf_arg1( assertion ) ) && NIL != genls.genlP( assertions_high.gaf_arg2( assertion ), $const4$SkolemFunction, assertions_high.assertion_mt( assertion ), UNPROVIDED ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28037L)
  public static SubLObject skolem_defining_assertionP(final SubLObject assertion)
  {
    if( NIL != cycl_utilities.expression_find_if( $sym49$REIFIED_SKOLEM_FN_, assertions_high.assertion_cons( assertion ), T, UNPROVIDED ) || NIL != cycl_utilities.expression_find_if( $sym49$REIFIED_SKOLEM_FN_,
        assertions_high.assertion_mt( assertion ), T, UNPROVIDED ) )
    {
      final SubLObject dependents = assertions_high.assertion_dependent_list( assertion );
      return subl_promotions.memberP( $const42$skolem, Mapping.mapcar( $sym50$SENTENCE_ARG0, Mapping.mapcar( $sym51$DEDUCTION_ASSERTION, dependents ) ), UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28545L)
  public static SubLObject defn_assertion_of_skolemP(final SubLObject skolem, final SubLObject assertion)
  {
    return makeBoolean( NIL != cycl_utilities.expression_find( skolem, assertion, T, UNPROVIDED, UNPROVIDED ) && NIL != skolem_defn_assertionP( skolem, assertion, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28708L)
  public static SubLObject assertion_skolems(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = czer_vars.$assertion_key$.currentBinding( thread );
    try
    {
      czer_vars.$assertion_key$.bind( $sym52$ASSERTION_FORMULA, thread );
      result = cycl_utilities.expression_gather( assertion, Symbols.symbol_function( $sym53$REIFIED_SKOLEM_FN_IN_ANY_MT_ ), NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      czer_vars.$assertion_key$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29398L)
  public static SubLObject defn_assertion_skolems(final SubLObject assertion)
  {
    SubLObject v_skolems = NIL;
    SubLObject cdolist_list_var = assertion_skolems( assertion );
    SubLObject skolem = NIL;
    skolem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != defn_assertion_of_skolemP( skolem, assertion ) )
      {
        v_skolems = ConsesLow.cons( skolem, v_skolems );
      }
      cdolist_list_var = cdolist_list_var.rest();
      skolem = cdolist_list_var.first();
    }
    return Sequences.nreverse( v_skolems );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29634L)
  public static SubLObject all_skolem_mt_defn_assertions(final SubLObject skolem, final SubLObject mt, SubLObject printP)
  {
    if( printP == UNPROVIDED )
    {
      printP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt, thread );
      SubLObject cdolist_list_var = skolem_defn_assertions( skolem, printP );
      SubLObject assertion = NIL;
      assertion = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject item_var = assertion;
        if( NIL == conses_high.member( item_var, result, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          result = ConsesLow.cons( item_var, result );
        }
        cdolist_list_var = cdolist_list_var.rest();
        assertion = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30206L)
  public static SubLObject recomputing_skolem_defn_info_constant()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == recomputing_skolem_defnP() )
    {
      Errors.error( $str54$recomputing_skolem_defn_info_cons );
    }
    return $recompute_skolem_defn_info$.getDynamicValue( thread ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30524L)
  public static SubLObject recomputing_skolem_defn_info_var()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == recomputing_skolem_defnP() )
    {
      Errors.error( $str55$recomputing_skolem_defn_info_var_ );
    }
    return conses_high.second( $recompute_skolem_defn_info$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30827L)
  public static SubLObject really_recomputing_skolem_defnP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == recomputing_skolem_defnP() )
    {
      Errors.error( $str56$really_recomputing_skolem_defn__c );
    }
    return conses_high.third( $recompute_skolem_defn_info$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 31106L)
  public static SubLObject recomputing_skolem_defn_info_defn()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == recomputing_skolem_defnP() )
    {
      Errors.error( $str57$recomputing_skolem_defn_info_defn );
    }
    return conses_high.fourth( $recompute_skolem_defn_info$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 31387L)
  public static SubLObject recomputing_skolem_defn_info_key()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == recomputing_skolem_defnP() )
    {
      Errors.error( $str58$recomputing_skolem_defn_info_key_ );
    }
    return conses_high.fifth( $recompute_skolem_defn_info$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 31664L)
  public static SubLObject recomputing_skolem_defn_info_blist()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == recomputing_skolem_defnP() )
    {
      Errors.error( $str59$recomputing_skolem_defn_info_blis );
    }
    return conses_high.sixth( $recompute_skolem_defn_info$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 32004L)
  public static SubLObject set_recomputing_skolem_defn_result(final SubLObject defn, final SubLObject key)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == recomputing_skolem_defnP() )
    {
      Errors.error( $str60$set_recomputing_skolem_defn_resul );
    }
    list_utilities.nreplace_nth( THREE_INTEGER, defn, $recompute_skolem_defn_info$.getDynamicValue( thread ) );
    list_utilities.nreplace_nth( FOUR_INTEGER, key, $recompute_skolem_defn_info$.getDynamicValue( thread ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 32312L)
  public static SubLObject set_recomputing_skolem_defn_blist(final SubLObject blist)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == recomputing_skolem_defnP() )
    {
      Errors.error( $str61$set_recomputing_skolem_defn_blist );
    }
    list_utilities.nreplace_nth( FIVE_INTEGER, blist, $recompute_skolem_defn_info$.getDynamicValue( thread ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 32552L)
  public static SubLObject recomputing_skolem_defnP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return list_utilities.sublisp_boolean( $recompute_skolem_defn_info$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 32659L)
  public static SubLObject recomputing_defn_of_skolemP(final SubLObject skolem)
  {
    return makeBoolean( NIL != recomputing_skolem_defnP() && skolem.eql( recomputing_skolem_defn_info_constant() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 32845L)
  public static SubLObject recomputing_skolem_defn_ofP(final SubLObject unreified_sk_term)
  {
    return makeBoolean( NIL != recomputing_skolem_defnP() && ( ( $kw62$GAF == recomputing_skolem_defn_info_var() && NIL != cycl_utilities.expression_find( bindings.variable_binding_variable(
        recomputing_skolem_defn_info_blist().first() ), unreified_sk_term, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) || skolem_function_var( unreified_sk_term ).eql( recomputing_skolem_defn_info_var() ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 33213L)
  public static SubLObject note_skolem_binding(final SubLObject uniq_var, final SubLObject orig_var)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == recomputing_skolem_defnP() )
    {
      Errors.error( $str63$note_skolem_binding_called_when_n );
    }
    final SubLObject new_binding = ConsesLow.cons( uniq_var, orig_var );
    if( NIL == list_utilities.member_equalP( new_binding, recomputing_skolem_defn_info_blist() ) )
    {
      set_recomputing_skolem_defn_blist( ConsesLow.cons( new_binding, recomputing_skolem_defn_info_blist() ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 33655L)
  public static SubLObject recompute_skolem_defn(final SubLObject unreified_sk_term, final SubLObject term_args, final SubLObject skolem_clauses, final SubLObject mt, final SubLObject defn, final SubLObject arity_min)
  {
    final SubLObject ununiquified_unreified_sk_term = cycl_utilities.expression_sublis( recomputing_skolem_defn_info_blist(), unreified_sk_term, UNPROVIDED, UNPROVIDED );
    final SubLObject defn_unreified_sk_term = defn_unreified_sk_term( ununiquified_unreified_sk_term, term_args, skolem_clauses );
    final SubLObject key = skolem_hash_key( arity_min, defn );
    final SubLObject sk_defn = make_sk_defn( recomputing_skolem_defn_info_constant(), defn_unreified_sk_term, mt, defn );
    set_recomputing_skolem_defn_result( sk_defn, key );
    if( NIL != really_recomputing_skolem_defnP() )
    {
      add_skolem_defn( sk_defn, key );
    }
    return Values.values( sk_defn, key );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 34299L)
  public static SubLObject remove_defn_of_skolem(final SubLObject skolem, SubLObject key)
  {
    if( key == UNPROVIDED )
    {
      key = skolem_defn_key( skolem );
    }
    SubLObject new_table_value = NIL;
    SubLObject cdolist_list_var = Hashtables.gethash( key, czer_vars.$skolem_axiom_table$.getGlobalValue(), UNPROVIDED );
    SubLObject defn = NIL;
    defn = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( !skolem.eql( defn.first() ) )
      {
        new_table_value = ConsesLow.cons( defn, new_table_value );
      }
      cdolist_list_var = cdolist_list_var.rest();
      defn = cdolist_list_var.first();
    }
    Hashtables.sethash( key, czer_vars.$skolem_axiom_table$.getGlobalValue(), Sequences.nreverse( new_table_value ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 34656L)
  public static SubLObject add_skolem_defn(final SubLObject defn, SubLObject key)
  {
    if( key == UNPROVIDED )
    {
      key = skolem_table_key_from_defn( defn );
    }
    hl_transcript_tracing.note_hlt_add_skolem_defn( defn, key );
    Hashtables.sethash( key, czer_vars.$skolem_axiom_table$.getGlobalValue(), ConsesLow.cons( defn, Hashtables.gethash( key, czer_vars.$skolem_axiom_table$.getGlobalValue(), UNPROVIDED ) ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 34880L)
  public static SubLObject kb_skolems()
  {
    return fort_types_interface.all_forts_of_type( $const4$SkolemFunction );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 34957L)
  public static SubLObject skolem_table_contains_old_format_skolemsP()
  {
    SubLObject key = NIL;
    SubLObject v_defns = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( czer_vars.$skolem_axiom_table$.getGlobalValue() );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        key = Hashtables.getEntryKey( cdohash_entry );
        SubLObject cdolist_list_var;
        v_defns = ( cdolist_list_var = Hashtables.getEntryValue( cdohash_entry ) );
        SubLObject defn = NIL;
        defn = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject unreified_sk_term = conses_high.second( defn );
          if( NIL != old_format_skolemP( unreified_sk_term ) )
          {
            return T;
          }
          cdolist_list_var = cdolist_list_var.rest();
          defn = cdolist_list_var.first();
        }
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 35229L)
  public static SubLObject reset_skolem_defn_table(SubLObject do_itP, SubLObject printP)
  {
    if( do_itP == UNPROVIDED )
    {
      do_itP = NIL;
    }
    if( printP == UNPROVIDED )
    {
      printP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    Hashtables.clrhash( czer_vars.$skolem_axiom_table$.getGlobalValue() );
    czer_vars.$empty_skolems$.setDynamicValue( NIL, thread );
    czer_vars.$mal_skolems$.setDynamicValue( NIL, thread );
    final SubLObject v_skolems = kb_skolems();
    if( NIL != printP )
    {
      PrintLow.format( T, $str64$Total_KB_Skolems___a, Sequences.length( v_skolems ) );
    }
    final SubLObject list_var = v_skolems;
    final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( $str65$building_skolem_defn_table, thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject csome_list_var = list_var;
        SubLObject skolem = NIL;
        skolem = csome_list_var.first();
        while ( NIL != csome_list_var)
        {
          if( NIL == hl_prototypes.hl_prototypical_instanceP( skolem ) )
          {
            SubLObject message_var = NIL;
            final SubLObject was_appendingP = Eval.eval( $sym67$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ );
            Eval.eval( $list68 );
            try
            {
              try
              {
                thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                final SubLObject _prev_bind_0_$5 = Errors.$error_handler$.currentBinding( thread );
                try
                {
                  Errors.$error_handler$.bind( $sym69$CATCH_ERROR_MESSAGE_HANDLER, thread );
                  try
                  {
                    reset_defn_of_skolem( skolem, do_itP );
                  }
                  catch( final Throwable catch_var )
                  {
                    Errors.handleThrowable( catch_var, NIL );
                  }
                }
                finally
                {
                  Errors.$error_handler$.rebind( _prev_bind_0_$5, thread );
                }
              }
              catch( final Throwable ccatch_env_var )
              {
                message_var = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
              }
              finally
              {
                thread.throwStack.pop();
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                Eval.eval( ConsesLow.list( $sym70$CSETQ, $sym67$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP ) );
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$6, thread );
              }
            }
            if( message_var.isString() )
            {
              Errors.warn( $str71$_A, message_var );
            }
          }
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
          csome_list_var = csome_list_var.rest();
          skolem = csome_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$7, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 35752L)
  public static SubLObject reset_defn_of_skolem(final SubLObject skolem, SubLObject do_itP)
  {
    if( do_itP == UNPROVIDED )
    {
      do_itP = NIL;
    }
    return reset_skolem_defn_from_assertions( skolem, skolem_defn_assertions( skolem, UNPROVIDED ), do_itP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 35907L)
  public static SubLObject skolem_defn_from_assertions(final SubLObject skolem, SubLObject assertions)
  {
    if( assertions == UNPROVIDED )
    {
      assertions = skolem_defn_assertions( skolem, UNPROVIDED );
    }
    return reset_skolem_defn_from_assertions( skolem, assertions, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 36109L)
  public static SubLObject reset_skolem_defn_from_assertions(final SubLObject skolem, SubLObject assertions, SubLObject do_itP)
  {
    if( assertions == UNPROVIDED )
    {
      assertions = skolem_defn_assertions( skolem, UNPROVIDED );
    }
    if( do_itP == UNPROVIDED )
    {
      do_itP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result_defn = NIL;
    SubLObject result_key = NIL;
    if( NIL == isa.isaP( skolem, $const4$SkolemFunction, UNPROVIDED, UNPROVIDED ) )
    {
      Errors.warn( $str72$____reified_skolem__a_not_known_t, skolem );
    }
    if( NIL == assertions )
    {
      Errors.warn( $str73$No_skolem_defn_assertions_for___S, skolem );
    }
    if( NIL != assertions )
    {
      final SubLObject _prev_bind_0 = $recompute_skolem_defn_info$.currentBinding( thread );
      try
      {
        $recompute_skolem_defn_info$.bind( ConsesLow.list( skolem, skolem_variable_from_assertions( skolem, assertions ), do_itP, NIL, NIL, NIL ), thread );
        final SubLObject ass = assertions.first();
        thread.resetMultipleValues();
        final SubLObject el_formula = uncanonicalizer.assertion_el_formula( ass );
        final SubLObject el_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        czer_main.canonicalize_wf_cycl( el_formula, el_mt );
        result_defn = recomputing_skolem_defn_info_defn();
        result_key = recomputing_skolem_defn_info_key();
      }
      finally
      {
        $recompute_skolem_defn_info$.rebind( _prev_bind_0, thread );
      }
    }
    return Values.values( result_defn, result_key );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 37019L)
  public static SubLObject skolem_variable_from_assertions(final SubLObject skolem, final SubLObject assertions)
  {
    SubLObject cdolist_list_var = assertions;
    SubLObject ass = NIL;
    ass = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != assertions_high.gaf_assertionP( ass ) )
      {
        return $kw62$GAF;
      }
      SubLObject cdolist_list_var_$8 = clauses.neg_lits( fi.assertion_cnf_with_el_vars( ass ) );
      SubLObject lit = NIL;
      lit = cdolist_list_var_$8.first();
      while ( NIL != cdolist_list_var_$8)
      {
        if( NIL != el_utilities.tou_litP( lit ) && skolem.eql( cycl_utilities.nat_functor( el_utilities.literal_arg2( lit, UNPROVIDED ) ) ) )
        {
          return el_utilities.literal_arg1( lit, UNPROVIDED );
        }
        cdolist_list_var_$8 = cdolist_list_var_$8.rest();
        lit = cdolist_list_var_$8.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      ass = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 37343L)
  public static SubLObject skolem_scalar_termP(final SubLObject v_object, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return makeBoolean( NIL != el_utilities.el_formula_with_operator_p( v_object, $const74$IntervalMinFn ) || NIL != el_utilities.el_formula_with_operator_p( v_object, $const75$IntervalMaxFn ) || NIL != term
        .scalar_termP( v_object, mt ) || ( NIL != el_utilities.possibly_naut_p( v_object ) && NIL != genls.any_specP( $const76$ScalarInterval, kb_accessors.result_isa( cycl_utilities.nat_functor( v_object ), mt ),
            UNPROVIDED, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 37664L)
  public static SubLObject skolem_result_types_from_cnfs(final SubLObject sk_term, final SubLObject cnfs, SubLObject mt, SubLObject traceP)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    if( traceP == UNPROVIDED )
    {
      traceP = NIL;
    }
    return guess_skolem_result_types_from_cnfs( $kw77$UNNAMED_SKOLEM_FN, sk_term, cnfs, mt, traceP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 37921L)
  public static SubLObject guess_skolem_result_types_from_cnfs(final SubLObject skolem, final SubLObject sk_term, final SubLObject cnfs, SubLObject mt, SubLObject traceP)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    if( traceP == UNPROVIDED )
    {
      traceP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    SubLObject result_isas = skolem_cnfs_pos_lit_types( sk_term, cnfs, mt );
    final SubLObject result_isa_args = thread.secondMultipleValue();
    SubLObject result_genls = thread.thirdMultipleValue();
    final SubLObject result_genl_args = thread.fourthMultipleValue();
    thread.resetMultipleValues();
    result_isas = genls.min_cols( result_isas, mt, UNPROVIDED );
    if( NIL != result_isas )
    {
      if( NIL != disjoint_with.any_disjoint_collection_pair( result_isas, mt ) )
      {
        if( NIL != traceP )
        {
          PrintLow.format( T, $str78$__disjoint_result_types___s____s, skolem, result_isas );
        }
      }
      else if( NIL != traceP )
      {
        PrintLow.format( T, $str79$__explicit_result_types___s____s, skolem, result_isas );
      }
    }
    else
    {
      final SubLObject cols = skolem_var_isa_constraints_wrt_cnfs( sk_term, cnfs, mt );
      if( NIL != cols && NIL == disjoint_with.any_disjoint_collection_pair( cols, mt ) )
      {
        result_isas = cols;
        if( NIL != traceP )
        {
          PrintLow.format( T, $str80$__tacit_result_isa___s____s, skolem, result_isas );
        }
      }
    }
    if( NIL == result_isas && NIL != traceP )
    {
      PrintLow.format( T, $str81$__no_result_types___s, skolem );
    }
    result_genls = genls.min_cols( result_genls, mt, UNPROVIDED );
    if( NIL != result_genls )
    {
      if( NIL != disjoint_with.any_disjoint_collection_pair( result_genls, mt ) )
      {
        if( NIL != traceP )
        {
          PrintLow.format( T, $str78$__disjoint_result_types___s____s, skolem, result_genls );
        }
      }
      else if( NIL != traceP )
      {
        PrintLow.format( T, $str79$__explicit_result_types___s____s, skolem, result_genls );
      }
    }
    else
    {
      final SubLObject cols = skolem_var_genl_constraints_wrt_cnfs( sk_term, cnfs, mt );
      if( NIL != cols && NIL == disjoint_with.any_disjoint_collection_pair( cols, mt ) )
      {
        result_genls = cols;
        if( NIL != traceP )
        {
          PrintLow.format( T, $str82$__tacit_result_genl___s____s, skolem, result_genls );
        }
      }
    }
    if( NIL == result_genls && NIL != traceP )
    {
      PrintLow.format( T, $str81$__no_result_types___s, skolem );
    }
    return Values.values( result_isas, result_isa_args, result_genls, result_genl_args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 40391L)
  public static SubLObject skolem_cnfs_pos_lit_types(final SubLObject v_term, final SubLObject cnfs, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject isas = NIL;
    SubLObject isa_args = NIL;
    SubLObject v_genls = NIL;
    SubLObject genl_args = NIL;
    SubLObject cdolist_list_var = cnfs;
    SubLObject cnf = NIL;
    cnf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$9;
      final SubLObject pos_lits = cdolist_list_var_$9 = clauses.pos_lits( cnf );
      SubLObject pos_lit = NIL;
      pos_lit = cdolist_list_var_$9.first();
      while ( NIL != cdolist_list_var_$9)
      {
        final SubLObject second_term = el_utilities.literal_arg1( pos_lit, UNPROVIDED );
        final SubLObject third_term = el_utilities.literal_arg2( pos_lit, UNPROVIDED );
        if( NIL != el_utilities.isa_litP( pos_lit ) && second_term.equal( v_term ) )
        {
          if( NIL != fort_types_interface.collectionP( third_term ) )
          {
            final SubLObject item_var = third_term;
            if( NIL == conses_high.member( item_var, isas, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              isas = ConsesLow.cons( item_var, isas );
            }
          }
          else if( NIL != cycl_variables.cyc_varP( third_term ) )
          {
            final SubLObject item_var = czer_utilities.canonical_variable_number( third_term );
            if( NIL == conses_high.member( item_var, isa_args, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              isa_args = ConsesLow.cons( item_var, isa_args );
            }
          }
        }
        else if( NIL != el_utilities.genls_litP( pos_lit ) && second_term.equal( v_term ) )
        {
          if( NIL != fort_types_interface.collectionP( third_term ) )
          {
            final SubLObject item_var = third_term;
            if( NIL == conses_high.member( item_var, v_genls, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              v_genls = ConsesLow.cons( item_var, v_genls );
            }
          }
          else if( NIL != cycl_variables.cyc_varP( third_term ) )
          {
            final SubLObject item_var = czer_utilities.canonical_variable_number( third_term );
            if( NIL == conses_high.member( item_var, genl_args, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              genl_args = ConsesLow.cons( item_var, genl_args );
            }
          }
        }
        cdolist_list_var_$9 = cdolist_list_var_$9.rest();
        pos_lit = cdolist_list_var_$9.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      cnf = cdolist_list_var.first();
    }
    if( NIL == list_utilities.singletonP( isas ) )
    {
      final SubLObject _prev_bind_0 = czer_vars.$interpolate_singleton_arg_isaP$.currentBinding( thread );
      try
      {
        czer_vars.$interpolate_singleton_arg_isaP$.bind( T, thread );
        isas = interpolate_arg_type( isas, mt );
      }
      finally
      {
        czer_vars.$interpolate_singleton_arg_isaP$.rebind( _prev_bind_0, thread );
      }
    }
    if( NIL == list_utilities.singletonP( v_genls ) )
    {
      final SubLObject _prev_bind_0 = czer_vars.$interpolate_singleton_arg_isaP$.currentBinding( thread );
      try
      {
        czer_vars.$interpolate_singleton_arg_isaP$.bind( T, thread );
        v_genls = interpolate_arg_type( v_genls, mt );
      }
      finally
      {
        czer_vars.$interpolate_singleton_arg_isaP$.rebind( _prev_bind_0, thread );
      }
    }
    return Values.values( isas, isa_args, v_genls, genl_args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 41509L)
  public static SubLObject skolem_var_isa_constraints_wrt_cnfs(final SubLObject sk_var, final SubLObject cnfs, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != czer_vars.$infer_skolem_result_isa_via_arg_constraintsP$.getDynamicValue( thread ) )
    {
      return genls.min_cols( Sequences.remove( $const83$CycLReifiableDenotationalTerm, at_var_types.var_isa_constraints_wrt_cnfs( sk_var, cnfs, mt, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
          UNPROVIDED ), mt, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 41758L)
  public static SubLObject skolem_var_genl_constraints_wrt_cnfs(final SubLObject sk_var, final SubLObject cnfs, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != czer_vars.$infer_skolem_result_isa_via_arg_constraintsP$.getDynamicValue( thread ) )
    {
      return genls.min_cols( at_var_types.var_genl_constraints_wrt_cnfs( sk_var, cnfs, mt, UNPROVIDED ), mt, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 41968L)
  public static SubLObject skolem_arg_isa_constraints(final SubLObject unreified_sk_term, final SubLObject cnfs, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLObject args = conses_high.second( unreified_sk_term );
    final SubLObject sk_number = skolem_number( unreified_sk_term );
    final SubLObject sk_position = ( NIL != sk_number ) ? Numbers.add( ONE_INTEGER, Sequences.length( args ) ) : NIL;
    SubLObject argXtypes = NIL;
    SubLObject cdolist_list_var = args;
    SubLObject arg = NIL;
    arg = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      argXtypes = ConsesLow.cons( ConsesLow.cons( arg, interpolate_arg_type( at_var_types.cnfs_variable_isa_constraints( arg, cnfs, mt ), mt ) ), argXtypes );
      cdolist_list_var = cdolist_list_var.rest();
      arg = cdolist_list_var.first();
    }
    if( NIL != subl_promotions.memberP( sk_position, czer_vars.$arg_positions$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) )
    {
      argXtypes = ConsesLow.cons( ConsesLow.cons( sk_number, $list84 ), argXtypes );
    }
    return Sequences.nreverse( argXtypes );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 42545L)
  public static SubLObject install_skolem_arg_types(SubLObject do_itP, SubLObject traceP)
  {
    if( do_itP == UNPROVIDED )
    {
      do_itP = NIL;
    }
    if( traceP == UNPROVIDED )
    {
      traceP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject total = Hashtables.hash_table_count( czer_vars.$skolem_axiom_table$.getGlobalValue() );
    SubLObject n = ZERO_INTEGER;
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
        utilities_macros.noting_percent_progress_preamble( $str85$mapping_skolem_defn_table );
        SubLObject key = NIL;
        SubLObject v_defns = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( czer_vars.$skolem_axiom_table$.getGlobalValue() );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            key = Hashtables.getEntryKey( cdohash_entry );
            v_defns = Hashtables.getEntryValue( cdohash_entry );
            n = Numbers.add( n, ONE_INTEGER );
            utilities_macros.note_percent_progress( n, total );
            SubLObject cdolist_list_var = v_defns;
            SubLObject defn = NIL;
            defn = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              SubLObject current;
              final SubLObject datum = current = defn;
              SubLObject skolem = NIL;
              SubLObject unreified_sk_term = NIL;
              SubLObject mt = NIL;
              SubLObject cnfs = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list86 );
              skolem = current.first();
              current = current.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list86 );
              unreified_sk_term = current.first();
              current = current.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list86 );
              mt = current.first();
              current = current.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list86 );
              cnfs = current.first();
              current = current.rest();
              if( NIL == current )
              {
                final SubLObject sk_args = conses_high.second( unreified_sk_term );
                final SubLObject cnfs_$10 = skolem_defn_cnfs( skolem );
                SubLObject cdotimes_end_var;
                SubLObject n_$11;
                SubLObject types;
                SubLObject arg_types;
                SubLObject arg_psn;
                SubLObject cdolist_list_var_$12;
                SubLObject cnf;
                SubLObject _prev_bind_0_$13;
                SubLObject arg_isa_pred;
                SubLObject cdolist_list_var_$13;
                SubLObject v_arg_type;
                for( cdotimes_end_var = Sequences.length( sk_args ), n_$11 = NIL, n_$11 = ZERO_INTEGER; n_$11.numL( cdotimes_end_var ); n_$11 = Numbers.add( n_$11, ONE_INTEGER ) )
                {
                  types = NIL;
                  arg_types = NIL;
                  arg_psn = Numbers.add( ONE_INTEGER, n_$11 );
                  if( NIL == kb_accessors.argn_isa( skolem, arg_psn, mt ) )
                  {
                    cdolist_list_var_$12 = cnfs_$10;
                    cnf = NIL;
                    cnf = cdolist_list_var_$12.first();
                    while ( NIL != cdolist_list_var_$12)
                    {
                      types = conses_high.nunion( types, cnf_fn_argn_isa( skolem, arg_psn, cnf, mt ), UNPROVIDED, UNPROVIDED );
                      cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                      cnf = cdolist_list_var_$12.first();
                    }
                    arg_types = interpolate_arg_type( types, mt );
                    if( NIL != arg_types )
                    {
                      if( NIL != traceP )
                      {
                        PrintLow.format( T, $str87$__tacit_arg__s_type___s____s, new SubLObject[] { arg_psn, skolem, arg_types
                        } );
                      }
                      if( NIL != do_itP && NIL == kb_accessors.argn_isa( skolem, arg_psn, mt ) )
                      {
                        _prev_bind_0_$13 = api_control_vars.$use_local_queueP$.currentBinding( thread );
                        try
                        {
                          api_control_vars.$use_local_queueP$.bind( NIL, thread );
                          if( NIL != el_utilities.valid_argnum_p( arg_psn ) )
                          {
                            arg_isa_pred = kb_accessors.arg_isa_pred( arg_psn, UNPROVIDED, UNPROVIDED );
                            if( NIL != forts.fort_p( arg_isa_pred ) )
                            {
                              cdolist_list_var_$13 = arg_types;
                              v_arg_type = NIL;
                              v_arg_type = cdolist_list_var_$13.first();
                              while ( NIL != cdolist_list_var_$13)
                              {
                                ke.ke_assert( ConsesLow.list( arg_isa_pred, skolem, v_arg_type ), mt, UNPROVIDED, UNPROVIDED );
                                cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                                v_arg_type = cdolist_list_var_$13.first();
                              }
                            }
                          }
                        }
                        finally
                        {
                          api_control_vars.$use_local_queueP$.rebind( _prev_bind_0_$13, thread );
                        }
                      }
                    }
                    else if( NIL != traceP )
                    {
                      PrintLow.format( T, $str88$__no_arg__s_type___s____s, new SubLObject[] { arg_psn, skolem, arg_types
                      } );
                    }
                  }
                }
              }
              else
              {
                cdestructuring_bind.cdestructuring_bind_error( datum, $list86 );
              }
              cdolist_list_var = cdolist_list_var.rest();
              defn = cdolist_list_var.first();
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$14 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$14, thread );
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
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 43865L)
  public static SubLObject cnf_fn_argn_isa(final SubLObject fn, final SubLObject arg_psn, final SubLObject cnf, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLObject var = cnf_fn_argn_var( fn, arg_psn, cnf );
    if( NIL != var )
    {
      return at_var_types.cnf_variable_isa_constraints( var, cnf, mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 44056L)
  public static SubLObject cnf_fn_argn_var(final SubLObject fn, final SubLObject arg_psn, final SubLObject cnf)
  {
    SubLObject cdolist_list_var = el_utilities.tou_lits( clauses.neg_lits( cnf ) );
    SubLObject tou_lit = NIL;
    tou_lit = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( fn.eql( cycl_utilities.nat_functor( conses_high.third( tou_lit ) ) ) )
      {
        return ConsesLow.nth( arg_psn, conses_high.third( tou_lit ) );
      }
      cdolist_list_var = cdolist_list_var.rest();
      tou_lit = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 44249L)
  public static SubLObject interpolate_arg_type(SubLObject types, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != types )
    {
      types = genls.min_cols( Sequences.remove_duplicates( types, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), mt, UNPROVIDED );
      if( NIL != conses_high.second( types ) )
      {
        types = Sequences.remove( $const83$CycLReifiableDenotationalTerm, types, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      if( NIL == disjoint_with.any_disjoint_collection_pair( types, mt ) )
      {
        if( NIL == czer_vars.$interpolate_singleton_arg_isaP$.getDynamicValue( thread ) )
        {
          return types;
        }
        if( NIL != list_utilities.singletonP( types ) )
        {
          return types;
        }
        final SubLObject floors = genls.max_floor_cols( types, NIL, mt, UNPROVIDED );
        if( NIL != list_utilities.singletonP( floors ) )
        {
          return floors;
        }
        final SubLObject ceilings = genls.min_ceiling_cols( types, NIL, mt, UNPROVIDED );
        if( NIL != list_utilities.singletonP( ceilings ) )
        {
          return ceilings;
        }
        if( NIL != floors )
        {
          return ConsesLow.list( floors.first() );
        }
        if( NIL != ceilings )
        {
          return ConsesLow.list( ceilings.first() );
        }
        return NIL;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 45012L)
  public static SubLObject max_skolem_arity()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject total = Hashtables.hash_table_count( czer_vars.$skolem_axiom_table$.getGlobalValue() );
    SubLObject n = ZERO_INTEGER;
    SubLObject max = ZERO_INTEGER;
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
        utilities_macros.noting_percent_progress_preamble( $str89$mapping_skolem_axiom_table );
        SubLObject key = NIL;
        SubLObject v_defns = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( czer_vars.$skolem_axiom_table$.getGlobalValue() );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            key = Hashtables.getEntryKey( cdohash_entry );
            v_defns = Hashtables.getEntryValue( cdohash_entry );
            n = Numbers.add( n, ONE_INTEGER );
            utilities_macros.note_percent_progress( n, total );
            SubLObject cdolist_list_var = v_defns;
            SubLObject defn = NIL;
            defn = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              SubLObject current;
              final SubLObject datum = current = defn;
              SubLObject constant = NIL;
              SubLObject lispy = NIL;
              SubLObject mt = NIL;
              SubLObject cnfs = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list90 );
              constant = current.first();
              current = current.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list90 );
              lispy = current.first();
              current = current.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list90 );
              mt = current.first();
              current = current.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list90 );
              cnfs = current.first();
              current = current.rest();
              if( NIL == current )
              {
                if( max.numL( Sequences.length( conses_high.second( lispy ) ) ) )
                {
                  max = Sequences.length( conses_high.second( lispy ) );
                }
              }
              else
              {
                cdestructuring_bind.cdestructuring_bind_error( datum, $list90 );
              }
              cdolist_list_var = cdolist_list_var.rest();
              defn = cdolist_list_var.first();
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$16 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$16, thread );
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
    return max;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 45603L)
  public static SubLObject skolems_of_arity(SubLObject v_arity)
  {
    if( v_arity == UNPROVIDED )
    {
      v_arity = max_skolem_arity();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject total = Hashtables.hash_table_count( czer_vars.$skolem_axiom_table$.getGlobalValue() );
    SubLObject n = ZERO_INTEGER;
    SubLObject result = NIL;
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
        utilities_macros.noting_percent_progress_preamble( $str89$mapping_skolem_axiom_table );
        SubLObject key = NIL;
        SubLObject v_defns = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( czer_vars.$skolem_axiom_table$.getGlobalValue() );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            key = Hashtables.getEntryKey( cdohash_entry );
            v_defns = Hashtables.getEntryValue( cdohash_entry );
            n = Numbers.add( n, ONE_INTEGER );
            utilities_macros.note_percent_progress( n, total );
            SubLObject cdolist_list_var = v_defns;
            SubLObject defn = NIL;
            defn = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              SubLObject current;
              final SubLObject datum = current = defn;
              SubLObject constant = NIL;
              SubLObject lispy = NIL;
              SubLObject mt = NIL;
              SubLObject cnfs = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list90 );
              constant = current.first();
              current = current.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list90 );
              lispy = current.first();
              current = current.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list90 );
              mt = current.first();
              current = current.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list90 );
              cnfs = current.first();
              current = current.rest();
              if( NIL == current )
              {
                if( v_arity.numE( Sequences.length( conses_high.second( lispy ) ) ) )
                {
                  result = ConsesLow.cons( constant, result );
                }
              }
              else
              {
                cdestructuring_bind.cdestructuring_bind_error( datum, $list90 );
              }
              cdolist_list_var = cdolist_list_var.rest();
              defn = cdolist_list_var.first();
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$17 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$17, thread );
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
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 46120L)
  public static SubLObject skolem_hosedP(final SubLObject skf)
  {
    if( NIL != skolem_ill_formedP( skf ) )
    {
      return T;
    }
    SubLObject cdolist_list_var = assertion_utilities.rules_mentioning( skf );
    SubLObject rule = NIL;
    rule = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != skolem_rule_hosedP( rule, skf ) )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      rule = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 46568L)
  public static SubLObject skolem_ill_formedP(final SubLObject skf)
  {
    final SubLObject defining_bookkeeping_assertion = skolem_defining_bookkeeping_assertion( skf );
    return makeBoolean( NIL == defining_bookkeeping_assertion || NIL == assertions_high.deduced_assertionP( defining_bookkeeping_assertion ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 46821L)
  public static SubLObject skolem_rule_hosedP(final SubLObject rule, final SubLObject skf)
  {
    final SubLObject el_sentence = uncanonicalizer.assertion_el_formula( rule );
    if( NIL == cycl_utilities.expression_find_if( $sym91$CYC_CONST_GENERAL_EXISTENTIAL_OPERATOR_P, el_sentence, UNPROVIDED, UNPROVIDED ) )
    {
      return T;
    }
    if( NIL != cycl_utilities.expression_find( skf, el_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47278L)
  public static SubLObject all_hosed_skolems()
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = kb_skolems();
    SubLObject skf = NIL;
    skf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != skolem_hosedP( skf ) )
      {
        result = ConsesLow.cons( skf, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      skf = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47455L)
  public static SubLObject multi_skolem_skolems()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject total = Hashtables.hash_table_count( czer_vars.$skolem_axiom_table$.getGlobalValue() );
    SubLObject n = ZERO_INTEGER;
    SubLObject result = NIL;
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
        utilities_macros.noting_percent_progress_preamble( $str89$mapping_skolem_axiom_table );
        SubLObject key = NIL;
        SubLObject v_defns = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( czer_vars.$skolem_axiom_table$.getGlobalValue() );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            key = Hashtables.getEntryKey( cdohash_entry );
            v_defns = Hashtables.getEntryValue( cdohash_entry );
            n = Numbers.add( n, ONE_INTEGER );
            utilities_macros.note_percent_progress( n, total );
            SubLObject cdolist_list_var = v_defns;
            SubLObject defn = NIL;
            defn = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              SubLObject current;
              final SubLObject datum = current = defn;
              SubLObject constant = NIL;
              SubLObject lispy = NIL;
              SubLObject mt = NIL;
              SubLObject cnfs = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list90 );
              constant = current.first();
              current = current.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list90 );
              lispy = current.first();
              current = current.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list90 );
              mt = current.first();
              current = current.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list90 );
              cnfs = current.first();
              current = current.rest();
              if( NIL == current )
              {
                SubLObject v_2nd_skolem = NIL;
                if( NIL == v_2nd_skolem )
                {
                  SubLObject csome_list_var = Sequences.remove( constant, Sequences.remove_duplicates( list_utilities.flatten( cnfs ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED,
                      UNPROVIDED, UNPROVIDED );
                  SubLObject v_term = NIL;
                  v_term = csome_list_var.first();
                  while ( NIL == v_2nd_skolem && NIL != csome_list_var)
                  {
                    if( NIL != isa.isaP( v_term, $const4$SkolemFunction, mt, UNPROVIDED ) )
                    {
                      v_2nd_skolem = v_term;
                    }
                    csome_list_var = csome_list_var.rest();
                    v_term = csome_list_var.first();
                  }
                }
                if( NIL != v_2nd_skolem )
                {
                  result = ConsesLow.cons( constant, result );
                }
              }
              else
              {
                cdestructuring_bind.cdestructuring_bind_error( datum, $list90 );
              }
              cdolist_list_var = cdolist_list_var.rest();
              defn = cdolist_list_var.first();
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$18, thread );
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
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 52506L)
  public static SubLObject misindexed_skolem_keys(SubLObject fixP)
  {
    if( fixP == UNPROVIDED )
    {
      fixP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject total = Hashtables.hash_table_count( czer_vars.$skolem_axiom_table$.getGlobalValue() );
    SubLObject n = ZERO_INTEGER;
    SubLObject result = NIL;
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
        utilities_macros.noting_percent_progress_preamble( $str89$mapping_skolem_axiom_table );
        SubLObject key = NIL;
        SubLObject v_defns = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( czer_vars.$skolem_axiom_table$.getGlobalValue() );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            key = Hashtables.getEntryKey( cdohash_entry );
            v_defns = Hashtables.getEntryValue( cdohash_entry );
            n = Numbers.add( n, ONE_INTEGER );
            utilities_macros.note_percent_progress( n, total );
            SubLObject cdolist_list_var = v_defns;
            SubLObject defn = NIL;
            defn = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              final SubLObject constant = defn.first();
              if( NIL != forts.fort_p( constant ) && !key.equal( skolem_table_key_from_constant( constant ) ) )
              {
                result = ConsesLow.cons( constant, result );
                if( NIL != fixP )
                {
                  reset_defn_of_skolem( constant, T );
                }
              }
              cdolist_list_var = cdolist_list_var.rest();
              defn = cdolist_list_var.first();
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$19, thread );
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
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 53127L)
  public static SubLObject sk_defns_wXo_sk_constants(SubLObject removeP)
  {
    if( removeP == UNPROVIDED )
    {
      removeP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject total = Hashtables.hash_table_count( czer_vars.$skolem_axiom_table$.getGlobalValue() );
    SubLObject n = ZERO_INTEGER;
    SubLObject result = NIL;
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
        utilities_macros.noting_percent_progress_preamble( $str89$mapping_skolem_axiom_table );
        SubLObject key = NIL;
        SubLObject v_defns = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( czer_vars.$skolem_axiom_table$.getGlobalValue() );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            key = Hashtables.getEntryKey( cdohash_entry );
            v_defns = Hashtables.getEntryValue( cdohash_entry );
            n = Numbers.add( n, ONE_INTEGER );
            utilities_macros.note_percent_progress( n, total );
            SubLObject cdolist_list_var = v_defns;
            SubLObject defn = NIL;
            defn = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              final SubLObject constant = defn.first();
              if( NIL == forts.fort_p( constant ) )
              {
                result = ConsesLow.cons( ConsesLow.list( key, defn ), result );
                if( NIL != removeP )
                {
                  final SubLObject new_defns = Sequences.remove( defn, v_defns, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  if( NIL != new_defns )
                  {
                    Hashtables.sethash( key, czer_vars.$skolem_axiom_table$.getGlobalValue(), new_defns );
                  }
                  else
                  {
                    Hashtables.remhash( key, czer_vars.$skolem_axiom_table$.getGlobalValue() );
                  }
                }
              }
              cdolist_list_var = cdolist_list_var.rest();
              defn = cdolist_list_var.first();
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$20 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$20, thread );
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
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 53860L)
  public static SubLObject sk_keys_wXo_sk_defns(SubLObject removeP)
  {
    if( removeP == UNPROVIDED )
    {
      removeP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject total = Hashtables.hash_table_count( czer_vars.$skolem_axiom_table$.getGlobalValue() );
    SubLObject n = ZERO_INTEGER;
    SubLObject result = NIL;
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
        utilities_macros.noting_percent_progress_preamble( $str89$mapping_skolem_axiom_table );
        SubLObject key = NIL;
        SubLObject v_defns = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( czer_vars.$skolem_axiom_table$.getGlobalValue() );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            key = Hashtables.getEntryKey( cdohash_entry );
            v_defns = Hashtables.getEntryValue( cdohash_entry );
            n = Numbers.add( n, ONE_INTEGER );
            utilities_macros.note_percent_progress( n, total );
            if( NIL == v_defns )
            {
              result = ConsesLow.cons( key, result );
              if( NIL == removeP )
              {
                continue;
              }
              Hashtables.remhash( key, czer_vars.$skolem_axiom_table$.getGlobalValue() );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$21 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$21, thread );
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
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 54354L)
  public static SubLObject install_skolemfunction_fn_in_skolem_defns(SubLObject printP, SubLObject removeP)
  {
    if( printP == UNPROVIDED )
    {
      printP = NIL;
    }
    if( removeP == UNPROVIDED )
    {
      removeP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject total = Hashtables.hash_table_count( czer_vars.$skolem_axiom_table$.getGlobalValue() );
    SubLObject n = ZERO_INTEGER;
    final SubLObject result = NIL;
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
        utilities_macros.noting_percent_progress_preamble( $str89$mapping_skolem_axiom_table );
        SubLObject key = NIL;
        SubLObject v_defns = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( czer_vars.$skolem_axiom_table$.getGlobalValue() );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            key = Hashtables.getEntryKey( cdohash_entry );
            v_defns = Hashtables.getEntryValue( cdohash_entry );
            n = Numbers.add( n, ONE_INTEGER );
            utilities_macros.note_percent_progress( n, total );
            final SubLObject new_defns = conses_high.subst( $const6$SkolemFuncNFn, $const5$SkolemFuncN, conses_high.subst( $const3$SkolemFunctionFn, $const4$SkolemFunction, v_defns, UNPROVIDED, UNPROVIDED ), UNPROVIDED,
                UNPROVIDED );
            if( NIL != new_defns )
            {
              if( NIL != printP )
              {
                print_high.print( new_defns, UNPROVIDED );
              }
              if( NIL == removeP )
              {
                continue;
              }
              Hashtables.sethash( key, czer_vars.$skolem_axiom_table$.getGlobalValue(), new_defns );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$22 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$22, thread );
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
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 54925L)
  public static SubLObject sk_defns_wXo_mts(SubLObject fixP)
  {
    if( fixP == UNPROVIDED )
    {
      fixP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject table_var = czer_vars.$skolem_axiom_table$.getGlobalValue();
    final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( $str89$mapping_skolem_axiom_table, thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( Hashtables.hash_table_count( table_var ), thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject key = NIL;
        SubLObject v_defns = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( table_var );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            key = Hashtables.getEntryKey( cdohash_entry );
            SubLObject cdolist_list_var;
            v_defns = ( cdolist_list_var = Hashtables.getEntryValue( cdohash_entry ) );
            SubLObject defn = NIL;
            defn = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              final SubLObject constant = defn.first();
              final SubLObject mt = conses_high.third( defn );
              if( NIL == mt )
              {
                result = ConsesLow.cons( constant, result );
              }
              cdolist_list_var = cdolist_list_var.rest();
              defn = cdolist_list_var.first();
            }
            utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
            utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$23 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$23, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
    }
    if( NIL != fixP )
    {
      final SubLObject list_var = result;
      final SubLObject _prev_bind_9 = utilities_macros.$progress_note$.currentBinding( thread );
      final SubLObject _prev_bind_10 = utilities_macros.$progress_start_time$.currentBinding( thread );
      final SubLObject _prev_bind_11 = utilities_macros.$progress_total$.currentBinding( thread );
      final SubLObject _prev_bind_12 = utilities_macros.$progress_sofar$.currentBinding( thread );
      final SubLObject _prev_bind_13 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_14 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_15 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_16 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_note$.bind( $str92$fixing_skolems_w_o_mts, thread );
        utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
        utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
        utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
          SubLObject csome_list_var = list_var;
          SubLObject constant2 = NIL;
          constant2 = csome_list_var.first();
          while ( NIL != csome_list_var)
          {
            reset_defn_of_skolem( constant2, T );
            utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
            utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
            csome_list_var = csome_list_var.rest();
            constant2 = csome_list_var.first();
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$24 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$24, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_16, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_15, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_14, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_13, thread );
        utilities_macros.$progress_sofar$.rebind( _prev_bind_12, thread );
        utilities_macros.$progress_total$.rebind( _prev_bind_11, thread );
        utilities_macros.$progress_start_time$.rebind( _prev_bind_10, thread );
        utilities_macros.$progress_note$.rebind( _prev_bind_9, thread );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 55440L)
  public static SubLObject skolem_wffP(final SubLObject skolem)
  {
    return makeBoolean( NIL == skolem_defn_not_wffP( skolem_defn( skolem ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 55629L)
  public static SubLObject skolem_not_wffP(final SubLObject skolem)
  {
    return list_utilities.sublisp_boolean( skolem_defn_not_wffP( skolem_defn( skolem ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 55733L)
  public static SubLObject why_skolem_not_wff(final SubLObject skolem)
  {
    return why_skolem_defn_not_wff( skolem_defn( skolem ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 55833L)
  public static SubLObject skolem_defn_wffP(final SubLObject skolem_defn)
  {
    return makeBoolean( NIL == why_skolem_defn_not_wff( skolem_defn ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 55934L)
  public static SubLObject skolem_defn_not_wffP(final SubLObject skolem_defn)
  {
    return list_utilities.sublisp_boolean( why_skolem_defn_not_wff( skolem_defn ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 56042L)
  public static SubLObject why_skolem_defn_not_wff(final SubLObject skolem_defn)
  {
    SubLObject result = NIL;
    if( NIL == skolem_defn )
    {
      result = ConsesLow.cons( $list93, result );
    }
    else if( skolem_defn.isAtom() )
    {
      result = ConsesLow.cons( ConsesLow.list( $kw94$SKOLEM_DEFN_NOT_LIST, skolem_defn ), result );
    }
    if( NIL != result )
    {
      return result;
    }
    if( !FOUR_INTEGER.numE( Sequences.length( skolem_defn ) ) )
    {
      result = ConsesLow.cons( ConsesLow.list( $kw95$SKOLEM_DEFN_MAL_LENGTH, skolem_defn ), result );
      if( NIL != result )
      {
        Sequences.nreverse( result );
      }
    }
    SubLObject first = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( skolem_defn, skolem_defn, $list96 );
    first = skolem_defn.first();
    SubLObject current = skolem_defn.rest();
    final SubLObject second = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, skolem_defn, $list96 );
    current = current.rest();
    final SubLObject third = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, skolem_defn, $list96 );
    current = current.rest();
    final SubLObject fourth = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, skolem_defn, $list96 );
    final SubLObject orts;
    current = ( orts = current.rest() );
    if( NIL != orts )
    {
      result = ConsesLow.cons( ConsesLow.list( $kw97$SKOLEM_DEFN_ORTS, orts ), result );
      if( NIL != result )
      {
        return Sequences.nreverse( result );
      }
    }
    if( NIL == term.reified_skolem_fnP( first ) )
    {
      result = ConsesLow.cons( ConsesLow.list( $kw98$SKOLEM_DEFN_MAL_SKOLEM_FORT, first ), result );
      if( NIL != result )
      {
        return Sequences.nreverse( result );
      }
    }
    if( NIL != second )
    {
      if( !second.isCons() || ( !THREE_INTEGER.numE( Sequences.length( second ) ) && !FOUR_INTEGER.numE( Sequences.length( second ) ) && !FIVE_INTEGER.numE( Sequences.length( second ) ) ) )
      {
        result = ConsesLow.cons( ConsesLow.list( $kw99$SKOLEM_DEFN_MAL_UNREIFIED_FN_LENGTH, second ), result );
      }
      else
      {
        SubLObject current_$26;
        final SubLObject datum_$25 = current_$26 = second;
        SubLObject skolem_fn_function = NIL;
        SubLObject args = NIL;
        SubLObject var = NIL;
        SubLObject seqvar_or_number = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current_$26, datum_$25, $list100 );
        skolem_fn_function = current_$26.first();
        current_$26 = current_$26.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current_$26, datum_$25, $list100 );
        args = current_$26.first();
        current_$26 = current_$26.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current_$26, datum_$25, $list100 );
        var = current_$26.first();
        current_$26 = current_$26.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current_$26, datum_$25, $list100 );
        seqvar_or_number = current_$26.first();
        current_$26 = current_$26.rest();
        SubLObject number = current_$26.isCons() ? current_$26.first() : NIL;
        cdestructuring_bind.destructuring_bind_must_listp( current_$26, datum_$25, $list100 );
        current_$26 = current_$26.rest();
        if( NIL == current_$26 )
        {
          if( NIL != old_format_skolemP( second ) )
          {
            number = seqvar_or_number;
          }
          if( NIL == term.skolem_fn_functionP( skolem_fn_function ) )
          {
            result = ConsesLow.cons( ConsesLow.list( $kw101$SKOLEM_DEFN_MAL_SKOLEM_FN_TYPE, skolem_fn_function ), result );
            if( NIL != result )
            {
              return Sequences.nreverse( result );
            }
          }
          if( NIL != args && !args.isList() )
          {
            result = ConsesLow.cons( ConsesLow.list( $kw102$SKOLEM_DEFN_MAL_SKOLEM_FN_ARGS, args ), result );
            if( NIL != result )
            {
              return Sequences.nreverse( result );
            }
          }
          if( NIL != number && NIL == subl_promotions.memberP( number, args, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
          {
            result = ConsesLow.cons( ConsesLow.list( $kw103$SKOLEM_DEFN_ARGS_W_O_NUMBER, args, number ), result );
            if( NIL != result )
            {
              return Sequences.nreverse( result );
            }
          }
          if( NIL == el_utilities.el_var_listP( Sequences.remove( number, args, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) )
          {
            result = ConsesLow.cons( ConsesLow.list( $kw104$SKOLEM_DEFN_NON_VAR_ARGS, args ), result );
            if( NIL != result )
            {
              return Sequences.nreverse( result );
            }
          }
          if( NIL == var || NIL == cycl_variables.el_varP( var ) )
          {
            result = ConsesLow.cons( ConsesLow.list( $kw105$SKOLEM_DEFN_MAL_SK_VAR, var ), result );
            if( NIL != result )
            {
              return Sequences.nreverse( result );
            }
          }
          if( ( NIL != number && !skolem_fn_function.eql( $const6$SkolemFuncNFn ) ) || ( skolem_fn_function.eql( $const6$SkolemFuncNFn ) && NIL == number ) )
          {
            result = ConsesLow.cons( ConsesLow.list( $kw106$SKOLEM_DEFN_ARGS_SK_TYPE_NUMBER_MISMATCH, skolem_fn_function, number ), result );
            if( NIL != result )
            {
              return Sequences.nreverse( result );
            }
          }
          if( NIL != number && number.isList() && number.first().eql( $const107$Unity ) )
          {
            result = ConsesLow.cons( ConsesLow.list( $kw108$SKOLEM_DEFN_OBSOLETE_NUMBER, number ), result );
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum_$25, $list100 );
        }
      }
      if( NIL != result )
      {
        return Sequences.nreverse( result );
      }
    }
    if( NIL != third && NIL == hlmt.hlmtP( third ) )
    {
      result = ConsesLow.cons( ConsesLow.list( $kw109$SKOLEM_DEFN_MAL_MT, third ), result );
      if( NIL != result )
      {
        return Sequences.nreverse( result );
      }
    }
    if( NIL == fourth )
    {
      result = ConsesLow.cons( $list110, result );
      if( NIL != result )
      {
        return Sequences.nreverse( result );
      }
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 58659L)
  public static SubLObject skolem_all_goodP(final SubLObject skf)
  {
    return makeBoolean( NIL != skolem_function_skolem_assertion_goodP( skf ) && NIL == skolem_hosedP( skf ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 58888L)
  public static SubLObject skolem_function_skolem_assertion_goodP(final SubLObject skf)
  {
    SubLObject skolem_assertion_count = ZERO_INTEGER;
    SubLObject bad_assertionP = NIL;
    final SubLObject pred_var = $const42$skolem;
    if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( skf, ONE_INTEGER, pred_var ) )
    {
      final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( skf, ONE_INTEGER, pred_var );
      SubLObject done_var = bad_assertionP;
      final SubLObject token_var = NIL;
      while ( NIL == done_var)
      {
        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
        final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
        if( NIL != valid )
        {
          SubLObject final_index_iterator = NIL;
          try
          {
            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw62$GAF, NIL, NIL );
            SubLObject done_var_$27 = bad_assertionP;
            final SubLObject token_var_$28 = NIL;
            while ( NIL == done_var_$27)
            {
              final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$28 );
              final SubLObject valid_$29 = makeBoolean( !token_var_$28.eql( ass ) );
              if( NIL != valid_$29 )
              {
                skolem_assertion_count = Numbers.add( skolem_assertion_count, ONE_INTEGER );
                final SubLObject v_arguments = assertions_high.assertion_arguments( ass );
                if( NIL == list_utilities.singletonP( v_arguments ) )
                {
                  bad_assertionP = ass;
                  final SubLObject argument = v_arguments.first();
                  if( NIL == deduction_handles.deduction_p( argument ) )
                  {
                    bad_assertionP = ass;
                  }
                }
              }
              done_var_$27 = makeBoolean( NIL == valid_$29 || NIL != bad_assertionP );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
            try
            {
              Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
              final SubLObject _values = Values.getValuesAsVector();
              if( NIL != final_index_iterator )
              {
                kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
              }
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
            }
          }
        }
        done_var = makeBoolean( NIL == valid || NIL != bad_assertionP );
      }
    }
    if( NIL != bad_assertionP )
    {
      return NIL;
    }
    if( !ONE_INTEGER.numE( skolem_assertion_count ) )
    {
      return NIL;
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 59467L)
  public static SubLObject skolem_functions_with_bad_skolem_assertions()
  {
    SubLObject bad_skfs = NIL;
    SubLObject cdolist_list_var = kb_skolems();
    SubLObject skf = NIL;
    skf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == hl_prototypes.hl_prototypical_instanceP( skf ) && NIL == skolem_function_skolem_assertion_goodP( skf ) )
      {
        bad_skfs = ConsesLow.cons( skf, bad_skfs );
      }
      cdolist_list_var = cdolist_list_var.rest();
      skf = cdolist_list_var.first();
    }
    return Sequences.nreverse( bad_skfs );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 70205L)
  public static SubLObject diagnose_all_skolems()
  {
    return diagnose_skolems( kb_skolems(), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 70287L)
  public static SubLObject diagnose_skolems(final SubLObject v_skolems, SubLObject print_allP)
  {
    if( print_allP == UNPROVIDED )
    {
      print_allP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    final SubLObject local_state;
    final SubLObject state = local_state = memoization_state.new_memoization_state( UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        SubLObject cdolist_list_var = v_skolems;
        SubLObject skolem = NIL;
        skolem = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject maladies = diagnose_skolem( skolem );
          if( NIL != maladies )
          {
            count = Numbers.add( count, ONE_INTEGER );
          }
          if( NIL != maladies || NIL != print_allP )
          {
            format_nil.force_format( T, $str113$_a__a__s__, isa.isa( skolem, UNPROVIDED, UNPROVIDED ).first(), skolem, maladies, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
          cdolist_list_var = cdolist_list_var.rest();
          skolem = cdolist_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$30 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$30, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 70649L)
  public static SubLObject diagnose_skolem(final SubLObject skolem)
  {
    SubLObject maladies = diagnose_just_this_skolem( skolem );
    SubLObject cdolist_list_var = skolem_defn_proper_siblings( skolem );
    SubLObject sibling = NIL;
    sibling = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject items_var;
      final SubLObject sibling_maladies = items_var = diagnose_just_this_skolem( sibling );
      if( items_var.isVector() )
      {
        final SubLObject vector_var = items_var;
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject item_var;
        SubLObject item;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          item = ( item_var = Vectors.aref( vector_var, element_num ) );
          if( NIL == conses_high.member( item_var, maladies, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            maladies = ConsesLow.cons( item_var, maladies );
          }
        }
      }
      else
      {
        SubLObject cdolist_list_var_$31 = items_var;
        SubLObject item2 = NIL;
        item2 = cdolist_list_var_$31.first();
        while ( NIL != cdolist_list_var_$31)
        {
          final SubLObject item_var2 = item2;
          if( NIL == conses_high.member( item_var2, maladies, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            maladies = ConsesLow.cons( item_var2, maladies );
          }
          cdolist_list_var_$31 = cdolist_list_var_$31.rest();
          item2 = cdolist_list_var_$31.first();
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      sibling = cdolist_list_var.first();
    }
    return maladies;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 70941L)
  public static SubLObject diagnose_just_this_skolem_internal(final SubLObject skolem)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject maladies = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym40$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const41$EverythingPSC, thread );
      final SubLObject assertions = skolem_defn_assertions( skolem, UNPROVIDED );
      if( NIL != assertions )
      {
        SubLObject previous_mt = NIL;
        SubLObject cdolist_list_var = assertions;
        SubLObject ass = NIL;
        ass = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          thread.resetMultipleValues();
          final SubLObject formula = uncanonicalizer.assertion_el_formula( ass );
          final SubLObject mt = thread.secondMultipleValue();
          thread.resetMultipleValues();
          final SubLObject ist_sentence = el_utilities.make_ist_sentence( mt, formula );
          thread.resetMultipleValues();
          final SubLObject assertions_$32 = czer_meta.find_assertions_cycl( formula, mt );
          final SubLObject not_foundP = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if( NIL != not_foundP )
          {
            if( NIL != assertions_$32 )
            {
              final SubLObject item_var = $kw115$PARTIALLY_UNFINDABLE;
              if( NIL == conses_high.member( item_var, maladies, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
              {
                maladies = ConsesLow.cons( item_var, maladies );
              }
            }
            else
            {
              final SubLObject item_var = $kw116$UNFINDABLE;
              if( NIL == conses_high.member( item_var, maladies, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
              {
                maladies = ConsesLow.cons( item_var, maladies );
              }
            }
          }
          if( NIL != assertions_high.rule_assertionP( ass ) && NIL != assertion_utilities.rule_has_unlabelled_dont_care_variableP( ass ) )
          {
            final SubLObject item_var2 = $kw117$FREE_VARIABLE;
            if( NIL == conses_high.member( item_var2, maladies, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              maladies = ConsesLow.cons( item_var2, maladies );
            }
          }
          if( NIL != previous_mt && NIL == hlmt.hlmt_equalP( mt, previous_mt ) )
          {
            final SubLObject item_var2 = $kw118$MULTIPLE_MTS;
            if( NIL == conses_high.member( item_var2, maladies, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              maladies = ConsesLow.cons( item_var2, maladies );
            }
          }
          previous_mt = mt;
          if( NIL != list_utilities.simple_tree_findP( skolem, ist_sentence ) )
          {
            final SubLObject item_var2 = $kw119$RAW_SKOLEM;
            if( NIL == conses_high.member( item_var2, maladies, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              maladies = ConsesLow.cons( item_var2, maladies );
            }
          }
          if( NIL != list_utilities.simple_tree_findP( $const3$SkolemFunctionFn, ist_sentence ) )
          {
            final SubLObject item_var2 = $kw120$UNREIFIED_SKOLEM;
            if( NIL == conses_high.member( item_var2, maladies, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              maladies = ConsesLow.cons( item_var2, maladies );
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          ass = cdolist_list_var.first();
        }
      }
      if( NIL != subl_promotions.memberP( skolem, $skolems_with_known_issues$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) )
      {
        maladies = ConsesLow.cons( $kw121$KNOWN_ISSUE, maladies );
      }
      final SubLObject items_var = why_skolem_not_wff( skolem );
      if( items_var.isVector() )
      {
        final SubLObject vector_var = items_var;
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject item;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          item = Vectors.aref( vector_var, element_num );
          maladies = ConsesLow.cons( item, maladies );
        }
      }
      else
      {
        SubLObject cdolist_list_var = items_var;
        SubLObject item2 = NIL;
        item2 = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          maladies = ConsesLow.cons( item2, maladies );
          cdolist_list_var = cdolist_list_var.rest();
          item2 = cdolist_list_var.first();
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    if( NIL != maladies && NIL == conses_high.intersection( maladies, $list122, UNPROVIDED, UNPROVIDED ) && NIL != skolem_safe_to_recanonicalize_at_elP( skolem ) )
    {
      maladies = NIL;
    }
    return Sequences.nreverse( maladies );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 70941L)
  public static SubLObject diagnose_just_this_skolem(final SubLObject skolem)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return diagnose_just_this_skolem_internal( skolem );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym114$DIAGNOSE_JUST_THIS_SKOLEM, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym114$DIAGNOSE_JUST_THIS_SKOLEM, ONE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym114$DIAGNOSE_JUST_THIS_SKOLEM, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, skolem, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( diagnose_just_this_skolem_internal( skolem ) ) );
      memoization_state.caching_state_put( caching_state, skolem, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 72419L)
  public static SubLObject recanonicalize_skolem_defn_assertions(final SubLObject skolem)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject ass = skolem_defn_assertions( skolem, UNPROVIDED ).first();
    if( NIL != assertion_handles.valid_assertionP( ass, UNPROVIDED ) )
    {
      SubLObject message_var = NIL;
      final SubLObject was_appendingP = Eval.eval( $sym67$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ );
      Eval.eval( $list68 );
      try
      {
        try
        {
          thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
          final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
          try
          {
            Errors.$error_handler$.bind( $sym69$CATCH_ERROR_MESSAGE_HANDLER, thread );
            try
            {
              result = ConsesLow.cons( ke.ke_recanonicalize_assertion_now( ass, assertion_utilities.meta_assertion_list_for_editing( ass ) ), result );
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
          message_var = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        }
        finally
        {
          thread.throwStack.pop();
        }
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          Eval.eval( ConsesLow.list( $sym70$CSETQ, $sym67$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP ) );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
      if( message_var.isString() )
      {
        Errors.warn( $str71$_A, message_var );
      }
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 72883L)
  public static SubLObject skolem_safe_to_recanonicalize_at_elP(final SubLObject skolem)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != subl_promotions.memberP( skolem, $skolems_safe_to_recanonicalize_at_el$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) )
    {
      return T;
    }
    SubLObject el_formula = NIL;
    SubLObject el_mt = NIL;
    SubLObject opaque_el_formula = NIL;
    SubLObject cdolist_list_var = skolem_defn_assertions( skolem, UNPROVIDED );
    SubLObject ass = NIL;
    ass = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      thread.resetMultipleValues();
      final SubLObject this_el_formula = uncanonicalizer.assertion_el_formula( ass );
      final SubLObject this_el_mt = thread.secondMultipleValue();
      thread.resetMultipleValues();
      final SubLObject this_opaque_el_formula = cycl_utilities.expression_transform( this_el_formula, $sym15$EL_VAR_, $sym37$FALSE, UNPROVIDED, UNPROVIDED );
      if( NIL != el_formula && NIL != list_utilities.not_equal( opaque_el_formula, this_opaque_el_formula ) )
      {
        Errors.warn( $str124$different_el_formulas_for__a____s, skolem, el_formula, this_el_formula );
        return NIL;
      }
      el_formula = this_el_formula;
      el_mt = this_el_mt;
      opaque_el_formula = this_opaque_el_formula;
      cdolist_list_var = cdolist_list_var.rest();
      ass = cdolist_list_var.first();
    }
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = $target_consequent_literal_count$.currentBinding( thread );
    try
    {
      $target_consequent_literal_count$.bind( compute_target_consequent_literal_count( skolem ), thread );
      result = makeBoolean( NIL != formula_pattern_match.formula_matches_pattern( el_formula, $list125 ) || NIL != formula_pattern_match.formula_matches_pattern( el_formula, $list126 ) || NIL != formula_pattern_match
          .formula_matches_pattern( el_formula, $list127 ) || NIL != formula_pattern_match.formula_matches_pattern( el_formula, $list128 ) || NIL != formula_pattern_match.formula_matches_pattern( el_formula, $list129 )
          || NIL != formula_pattern_match.formula_matches_pattern( el_formula, $list130 ) || NIL != formula_pattern_match.formula_matches_pattern( el_formula, $list131 ) || NIL != formula_pattern_match
              .formula_matches_pattern( el_formula, $list132 ) || NIL != formula_pattern_match.formula_matches_pattern( el_formula, $list133 ) );
    }
    finally
    {
      $target_consequent_literal_count$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 75638L)
  public static SubLObject compute_target_consequent_literal_count(final SubLObject skolem)
  {
    final SubLObject v_set = set.new_set( Symbols.symbol_function( EQUAL ), UNPROVIDED );
    SubLObject cdolist_list_var = skolem_defn_assertions( skolem, UNPROVIDED );
    SubLObject ass = NIL;
    ass = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      set.set_add( assertions_high.assertion_cnf( ass ), v_set );
      cdolist_list_var = cdolist_list_var.rest();
      ass = cdolist_list_var.first();
    }
    return set.set_size( v_set );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 75997L)
  public static SubLObject conjunction_of_literalsP(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != el_utilities.el_conjunction_p( v_object ) )
    {
      if( NIL != el_utilities.formula_arityE( v_object, $target_consequent_literal_count$.getDynamicValue( thread ), UNPROVIDED ) )
      {
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( v_object, $kw134$IGNORE );
        SubLObject lit = NIL;
        lit = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL == el_grammar.el_literal_p( lit ) )
          {
            return NIL;
          }
          cdolist_list_var = cdolist_list_var.rest();
          lit = cdolist_list_var.first();
        }
      }
      return T;
    }
    if( NIL != el_grammar.el_literal_p( v_object ) )
    {
      return number_utilities.onep( $target_consequent_literal_count$.getDynamicValue( thread ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 76327L)
  public static SubLObject modernize_skolem_axiom_table()
  {
    SubLObject key = NIL;
    SubLObject v_defns = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( czer_vars.$skolem_axiom_table$.getGlobalValue() );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        key = Hashtables.getEntryKey( cdohash_entry );
        SubLObject cdolist_list_var;
        v_defns = ( cdolist_list_var = Hashtables.getEntryValue( cdohash_entry ) );
        SubLObject defn = NIL;
        defn = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject unreified_sk_term = conses_high.second( defn );
          final SubLObject modern_unreified_sk_term = possibly_modernize_unreified_sk_term( unreified_sk_term );
          list_utilities.nreplace_nth( ONE_INTEGER, modern_unreified_sk_term, defn );
          cdolist_list_var = cdolist_list_var.rest();
          defn = cdolist_list_var.first();
        }
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 76665L)
  public static SubLObject possibly_modernize_unreified_sk_term(final SubLObject unreified_sk_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != old_format_skolemP( unreified_sk_term ) )
    {
      SubLObject skolem_type = NIL;
      SubLObject vars = NIL;
      SubLObject sk_var = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( unreified_sk_term, unreified_sk_term, $list135 );
      skolem_type = unreified_sk_term.first();
      SubLObject current = unreified_sk_term.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, unreified_sk_term, $list135 );
      vars = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, unreified_sk_term, $list135 );
      sk_var = current.first();
      current = current.rest();
      final SubLObject number = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, unreified_sk_term, $list135 );
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject result = make_unreified_sk_nat( vars, sk_var, NIL, number );
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !skolem_type.eql( cycl_utilities.nat_functor( result ) ) )
        {
          Errors.error( $str136$Skolem_type_mismatch___a__a__a, unreified_sk_term, skolem_type, result );
        }
        return result;
      }
      cdestructuring_bind.cdestructuring_bind_error( unreified_sk_term, $list135 );
    }
    return unreified_sk_term;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 77179L)
  public static SubLObject skolems_with_mismatched_unreified_sk_terms()
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = kb_skolems();
    SubLObject skolem = NIL;
    skolem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject matchP = skolem_unreified_sk_terms_matchP( skolem );
      if( NIL == matchP )
      {
        result = ConsesLow.cons( skolem, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      skolem = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 77439L)
  public static SubLObject skolem_unreified_sk_terms_matchP(final SubLObject skolem)
  {
    SubLObject mismatchP = NIL;
    if( NIL == list_utilities.member_eqP( skolem, $skolems_with_known_issues$.getGlobalValue() ) && NIL == list_utilities.member_eqP( skolem, $skolems_safe_to_recanonicalize_at_el$.getGlobalValue() ) )
    {
      final SubLObject fresh_unreified_sk_term = conses_high.second( skolem_defn_from_assertions( skolem, UNPROVIDED ) );
      final SubLObject hl_unreified_sk_term = compute_unreified_sk_term_via_hl( skolem );
      if( !fresh_unreified_sk_term.equal( hl_unreified_sk_term ) )
      {
        mismatchP = T;
        SubLObject reason_string = $str137$;
        if( NIL != tmi_skolemP( skolem ) )
        {
          reason_string = $str138$temporalMicrotheoriesIntersect_;
        }
        format_nil.force_format( T, $str139$___amismatch_for__a___a___a__, reason_string, skolem, fresh_unreified_sk_term, hl_unreified_sk_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
    }
    return makeBoolean( NIL == mismatchP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 78177L)
  public static SubLObject possibly_nrepair_skolems_with_duplicate_vars(final SubLObject v_skolems)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = v_skolems;
    SubLObject skolem = NIL;
    skolem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != possibly_nrepair_skolem_with_duplicate_vars( skolem ) )
      {
        result = ConsesLow.cons( skolem, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      skolem = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 78422L)
  public static SubLObject possibly_nrepair_skolem_with_duplicate_vars(final SubLObject skolem)
  {
    if( NIL != list_utilities.duplicatesP( conses_high.second( conses_high.second( skolem_defn( skolem ) ) ), UNPROVIDED, UNPROVIDED ) )
    {
      return nrepair_skolem_with_duplicate_vars( skolem );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 78610L)
  public static SubLObject nrepair_skolem_with_duplicate_vars(final SubLObject skolem)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject defn = skolem_defn( skolem );
    final SubLObject unreified_sk_term = possibly_modernize_unreified_sk_term( conses_high.second( defn ) );
    SubLObject current;
    final SubLObject datum = current = unreified_sk_term;
    SubLObject sk_fn = NIL;
    SubLObject vars = NIL;
    SubLObject var = NIL;
    SubLObject seqvar = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list140 );
    sk_fn = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list140 );
    vars = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list140 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list140 );
    seqvar = current.first();
    current = current.rest();
    if( NIL == current )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !sk_fn.eql( $const3$SkolemFunctionFn ) )
      {
        Errors.error( $str141$Error );
      }
      final SubLObject dupe_var = list_utilities.only_one( list_utilities.duplicates( vars, UNPROVIDED, UNPROVIDED ) );
      final SubLObject new_vars = list_utilities.remove_first( dupe_var, vars, UNPROVIDED );
      final SubLObject new_unreified_sk_term = make_unreified_sk_nat( new_vars, var, seqvar, dupe_var );
      list_utilities.nreplace_nth( ONE_INTEGER, new_unreified_sk_term, defn );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list140 );
    }
    return defn;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 79158L)
  public static SubLObject possibly_nrepair_skolems_with_malformed_numbers(final SubLObject v_skolems)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = v_skolems;
    SubLObject skolem = NIL;
    skolem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != possibly_nrepair_skolem_with_malformed_numbers( skolem ) )
      {
        result = ConsesLow.cons( skolem, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      skolem = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 79409L)
  public static SubLObject possibly_nrepair_skolem_with_malformed_numbers(final SubLObject skolem)
  {
    SubLObject cdolist_list_var = conses_high.second( conses_high.second( skolem_defn( skolem ) ) );
    SubLObject var = NIL;
    var = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != skolem_scalar_termP( var, UNPROVIDED ) )
      {
        return nrepair_skolem_with_malformed_numbers( skolem );
      }
      cdolist_list_var = cdolist_list_var.rest();
      var = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 79637L)
  public static SubLObject nrepair_skolem_with_malformed_numbers(final SubLObject skolem)
  {
    final SubLObject defn = skolem_defn( skolem );
    final SubLObject unreified_sk_term = possibly_modernize_unreified_sk_term( conses_high.second( defn ) );
    SubLObject current;
    final SubLObject datum = current = unreified_sk_term;
    SubLObject sk_fn = NIL;
    SubLObject vars = NIL;
    SubLObject var = NIL;
    SubLObject seqvar = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list142 );
    sk_fn = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list142 );
    vars = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list142 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list142 );
    seqvar = current.first();
    current = current.rest();
    final SubLObject existing_number = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list142 );
    current = current.rest();
    if( NIL == current )
    {
      if( $const3$SkolemFunctionFn.eql( sk_fn ) )
      {
        final SubLObject sk_number = list_utilities.only_one( list_utilities.remove_if_not( $sym143$SKOLEM_SCALAR_TERM_, vars, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
        final SubLObject new_vars = Sequences.remove_if( $sym143$SKOLEM_SCALAR_TERM_, vars, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        final SubLObject new_unreified_sk_term = make_unreified_sk_nat( new_vars, var, seqvar, sk_number );
        list_utilities.nreplace_nth( ONE_INTEGER, new_unreified_sk_term, defn );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list142 );
    }
    return defn;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 80262L)
  public static SubLObject tmi_skolemP(final SubLObject skolem)
  {
    if( NIL != constant_handles.valid_constantP( skolem, UNPROVIDED ) )
    {
      final SubLObject assertions = skolem_defn_assertions( skolem, UNPROVIDED );
      if( NIL != list_utilities.lengthE( assertions, TWO_INTEGER, UNPROVIDED ) )
      {
        SubLObject current;
        final SubLObject datum = current = assertions;
        SubLObject ass1 = NIL;
        SubLObject ass2 = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list144 );
        ass1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list144 );
        ass2 = current.first();
        current = current.rest();
        if( NIL == current )
        {
          if( NIL != assertions_high.gaf_assertionP( ass1 ) && NIL != assertions_high.gaf_assertionP( ass2 ) && NIL != el_utilities.el_formula_with_operator_p( assertions_high.gaf_formula( ass2 ),
              $const145$temporalMicrotheoriesIntersect ) && NIL != list_utilities.tree_find( $const3$SkolemFunctionFn, assertions_high.assertion_mt( ass1 ), UNPROVIDED, UNPROVIDED ) && NIL != list_utilities.tree_find(
                  $const3$SkolemFunctionFn, assertions_high.assertion_mt( ass2 ), UNPROVIDED, UNPROVIDED ) )
          {
            return T;
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list144 );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 80771L)
  public static SubLObject recanonicalize_tmi_skolems(final SubLObject v_skolems)
  {
    SubLObject cdolist_list_var = v_skolems;
    SubLObject skolem = NIL;
    skolem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      recanonicalize_tmi_skolem( skolem );
      cdolist_list_var = cdolist_list_var.rest();
      skolem = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 80906L)
  public static SubLObject recanonicalize_tmi_skolem(final SubLObject skolem)
  {
    if( NIL != tmi_skolemP( skolem ) )
    {
      SubLObject current;
      final SubLObject datum = current = skolem_defn_assertions( skolem, UNPROVIDED );
      SubLObject content_ass = NIL;
      SubLObject tmi_ass = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list146 );
      content_ass = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list146 );
      tmi_ass = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject sentence = assertions_high.gaf_formula( content_ass );
        final SubLObject monad = hlmt.hlmt_monad_mt( assertions_high.assertion_mt( content_ass ) );
        cyc_kernel.cyc_assert_wff( ConsesLow.list( $const147$thereExists, $sym148$_TIME, ConsesLow.list( $const149$ist, ConsesLow.listS( $const150$MtSpace, monad, $list151 ), ConsesLow.listS( $const152$and, sentence,
            $list153 ) ) ), $const154$BaseKB, UNPROVIDED );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list146 );
      }
      cyc_kernel.cyc_kill( skolem );
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 81646L)
  public static SubLObject possibly_rehabilitate_skolem_defn_table()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != skolem_table_contains_old_format_skolemsP() )
    {
      modernize_skolem_axiom_table();
      possibly_nrepair_skolems_with_duplicate_vars( fort_types_interface.all_forts_of_type( $const4$SkolemFunction ) );
      possibly_nrepair_skolems_with_malformed_numbers( fort_types_interface.all_forts_of_type( $const4$SkolemFunction ) );
      recanonicalize_tmi_skolems( $list155 );
      final SubLObject list_var = $skolems_safe_to_recanonicalize_at_el$.getGlobalValue();
      final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
      final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
      final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_note$.bind( $str156$recanonicalizing_skolems, thread );
        utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
        utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
        utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
          SubLObject csome_list_var = list_var;
          SubLObject skolem = NIL;
          skolem = csome_list_var.first();
          while ( NIL != csome_list_var)
          {
            if( NIL != constant_handles.valid_constantP( skolem, UNPROVIDED ) )
            {
              recanonicalize_skolem_defn_assertions( skolem );
            }
            utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
            utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
            csome_list_var = csome_list_var.rest();
            skolem = csome_list_var.first();
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$33 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$33, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
        utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
        utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
        utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
        utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
      }
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 86276L)
  public static SubLObject skolems_that_are_unfindable_via_el()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject node_var = $const4$SkolemFunction;
    final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
    try
    {
      sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const48$isa ), thread );
      sbhl_marking_vars.$sbhl_gather_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
      try
      {
        SubLObject node_var_$34 = node_var;
        final SubLObject deck_type = $kw160$STACK;
        final SubLObject recur_deck = deck.create_deck( deck_type );
        final SubLObject _prev_bind_0_$35 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
          try
          {
            final SubLObject tv_var = NIL;
            final SubLObject _prev_bind_0_$36 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
            final SubLObject _prev_bind_1_$37 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
            try
            {
              sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
              sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym161$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
              if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
              {
                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                if( pcase_var.eql( $kw162$ERROR ) )
                {
                  sbhl_paranoia.sbhl_error( ONE_INTEGER, $str163$_A_is_not_a__A, tv_var, $sym164$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw165$CERROR ) )
                {
                  sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str166$continue_anyway, $str163$_A_is_not_a__A, tv_var, $sym164$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw167$WARN ) )
                {
                  Errors.warn( $str163$_A_is_not_a__A, tv_var, $sym164$SBHL_TRUE_TV_P );
                }
                else
                {
                  Errors.warn( $str168$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                  Errors.cerror( $str166$continue_anyway, $str163$_A_is_not_a__A, tv_var, $sym164$SBHL_TRUE_TV_P );
                }
              }
              final SubLObject _prev_bind_0_$37 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
              final SubLObject _prev_bind_1_$38 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
              final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
              final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
              final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const48$isa ) ), thread );
                sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const48$isa ) ) ),
                    thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                    $const48$isa ) ) ), thread );
                sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                sbhl_module_vars.$sbhl_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const48$isa ) ), thread );
                if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( node_var, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                {
                  final SubLObject _prev_bind_0_$38 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$39 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_2_$42 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                    sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities
                        .get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const48$isa ) ) ), thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                    sbhl_marking_utilities.sbhl_mark_node_marked( node_var_$34, UNPROVIDED );
                    while ( NIL != node_var_$34)
                    {
                      final SubLObject tt_node_var = node_var_$34;
                      SubLObject cdolist_list_var;
                      final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const48$isa ) );
                      SubLObject module_var = NIL;
                      module_var = cdolist_list_var.first();
                      while ( NIL != cdolist_list_var)
                      {
                        final SubLObject _prev_bind_0_$39 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$40 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                        try
                        {
                          sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                          sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                              .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                          final SubLObject node = function_terms.naut_to_nart( tt_node_var );
                          if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                          {
                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != d_link )
                            {
                              final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const48$isa ) ),
                                  sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != mt_links )
                              {
                                SubLObject iteration_state;
                                for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                    iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                {
                                  thread.resetMultipleValues();
                                  final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                  final SubLObject tv_links = thread.secondMultipleValue();
                                  thread.resetMultipleValues();
                                  if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                  {
                                    final SubLObject _prev_bind_0_$40 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                    try
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                      SubLObject iteration_state_$46;
                                      for( iteration_state_$46 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                          iteration_state_$46 ); iteration_state_$46 = dictionary_contents.do_dictionary_contents_next( iteration_state_$46 ) )
                                      {
                                        thread.resetMultipleValues();
                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$46 );
                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                        {
                                          final SubLObject _prev_bind_0_$41 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                            final SubLObject sol = link_nodes;
                                            if( NIL != set.set_p( sol ) )
                                            {
                                              final SubLObject set_contents_var = set.do_set_internal( sol );
                                              SubLObject basis_object;
                                              SubLObject state;
                                              SubLObject skolem;
                                              for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                  set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                              {
                                                skolem = set_contents.do_set_contents_next( basis_object, state );
                                                if( NIL != set_contents.do_set_contents_element_validP( state, skolem ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( skolem,
                                                    sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( skolem, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                  if( NIL == subl_promotions.memberP( skolem, $skolems_known_to_be_unfindable_via_el$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) && NIL != skolem_unfindable_via_elP(
                                                      skolem ) )
                                                  {
                                                    result = ConsesLow.cons( skolem, result );
                                                  }
                                                }
                                              }
                                            }
                                            else if( sol.isList() )
                                            {
                                              SubLObject csome_list_var = sol;
                                              SubLObject skolem2 = NIL;
                                              skolem2 = csome_list_var.first();
                                              while ( NIL != csome_list_var)
                                              {
                                                if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( skolem2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( skolem2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                  if( NIL == subl_promotions.memberP( skolem2, $skolems_known_to_be_unfindable_via_el$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) && NIL != skolem_unfindable_via_elP(
                                                      skolem2 ) )
                                                  {
                                                    result = ConsesLow.cons( skolem2, result );
                                                  }
                                                }
                                                csome_list_var = csome_list_var.rest();
                                                skolem2 = csome_list_var.first();
                                              }
                                            }
                                            else
                                            {
                                              Errors.error( $str169$_A_is_neither_SET_P_nor_LISTP_, sol );
                                            }
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$41, thread );
                                          }
                                        }
                                      }
                                      dictionary_contents.do_dictionary_contents_finalize( iteration_state_$46 );
                                    }
                                    finally
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$40, thread );
                                    }
                                  }
                                }
                                dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                              }
                            }
                            else
                            {
                              sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str170$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                            }
                            if( NIL != sbhl_macros.do_sbhl_non_fort_linksP( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                            {
                              SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup( node );
                              SubLObject instance_tuple = NIL;
                              instance_tuple = csome_list_var2.first();
                              while ( NIL != csome_list_var2)
                              {
                                SubLObject current;
                                final SubLObject datum = current = instance_tuple;
                                SubLObject link_node = NIL;
                                SubLObject mt2 = NIL;
                                SubLObject tv2 = NIL;
                                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list171 );
                                link_node = current.first();
                                current = current.rest();
                                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list171 );
                                mt2 = current.first();
                                current = current.rest();
                                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list171 );
                                tv2 = current.first();
                                current = current.rest();
                                if( NIL == current )
                                {
                                  if( NIL != mt_relevance_macros.relevant_mtP( mt2 ) )
                                  {
                                    final SubLObject _prev_bind_0_$42 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                    try
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.bind( mt2, thread );
                                      if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv2 ) )
                                      {
                                        final SubLObject _prev_bind_0_$43 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.bind( tv2, thread );
                                          final SubLObject sol;
                                          final SubLObject link_nodes2 = sol = ConsesLow.list( link_node );
                                          if( NIL != set.set_p( sol ) )
                                          {
                                            final SubLObject set_contents_var = set.do_set_internal( sol );
                                            SubLObject basis_object;
                                            SubLObject state;
                                            SubLObject skolem;
                                            for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                            {
                                              skolem = set_contents.do_set_contents_next( basis_object, state );
                                              if( NIL != set_contents.do_set_contents_element_validP( state, skolem ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( skolem,
                                                  sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                              {
                                                sbhl_marking_utilities.sbhl_mark_node_marked( skolem, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                if( NIL == subl_promotions.memberP( skolem, $skolems_known_to_be_unfindable_via_el$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) && NIL != skolem_unfindable_via_elP(
                                                    skolem ) )
                                                {
                                                  result = ConsesLow.cons( skolem, result );
                                                }
                                              }
                                            }
                                          }
                                          else if( sol.isList() )
                                          {
                                            SubLObject csome_list_var_$50 = sol;
                                            SubLObject skolem2 = NIL;
                                            skolem2 = csome_list_var_$50.first();
                                            while ( NIL != csome_list_var_$50)
                                            {
                                              if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( skolem2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                              {
                                                sbhl_marking_utilities.sbhl_mark_node_marked( skolem2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                if( NIL == subl_promotions.memberP( skolem2, $skolems_known_to_be_unfindable_via_el$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) && NIL != skolem_unfindable_via_elP(
                                                    skolem2 ) )
                                                {
                                                  result = ConsesLow.cons( skolem2, result );
                                                }
                                              }
                                              csome_list_var_$50 = csome_list_var_$50.rest();
                                              skolem2 = csome_list_var_$50.first();
                                            }
                                          }
                                          else
                                          {
                                            Errors.error( $str169$_A_is_neither_SET_P_nor_LISTP_, sol );
                                          }
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$43, thread );
                                        }
                                      }
                                    }
                                    finally
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$42, thread );
                                    }
                                  }
                                }
                                else
                                {
                                  cdestructuring_bind.cdestructuring_bind_error( datum, $list171 );
                                }
                                csome_list_var2 = csome_list_var2.rest();
                                instance_tuple = csome_list_var2.first();
                              }
                            }
                          }
                          else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                          {
                            SubLObject cdolist_list_var_$51;
                            final SubLObject new_list = cdolist_list_var_$51 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                .get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const48$isa ) ), sbhl_search_vars.$sbhl_tv$
                                    .getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const48$isa ) ),
                                    sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) );
                            SubLObject generating_fn = NIL;
                            generating_fn = cdolist_list_var_$51.first();
                            while ( NIL != cdolist_list_var_$51)
                            {
                              final SubLObject _prev_bind_0_$44 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                              try
                              {
                                sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                final SubLObject sol2;
                                final SubLObject link_nodes3 = sol2 = Functions.funcall( generating_fn, node );
                                if( NIL != set.set_p( sol2 ) )
                                {
                                  final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                  SubLObject basis_object2;
                                  SubLObject state2;
                                  SubLObject skolem3;
                                  for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                      set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                  {
                                    skolem3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                    if( NIL != set_contents.do_set_contents_element_validP( state2, skolem3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( skolem3,
                                        sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( skolem3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                      if( NIL == subl_promotions.memberP( skolem3, $skolems_known_to_be_unfindable_via_el$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) && NIL != skolem_unfindable_via_elP( skolem3 ) )
                                      {
                                        result = ConsesLow.cons( skolem3, result );
                                      }
                                    }
                                  }
                                }
                                else if( sol2.isList() )
                                {
                                  SubLObject csome_list_var3 = sol2;
                                  SubLObject skolem4 = NIL;
                                  skolem4 = csome_list_var3.first();
                                  while ( NIL != csome_list_var3)
                                  {
                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( skolem4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( skolem4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                      if( NIL == subl_promotions.memberP( skolem4, $skolems_known_to_be_unfindable_via_el$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) && NIL != skolem_unfindable_via_elP( skolem4 ) )
                                      {
                                        result = ConsesLow.cons( skolem4, result );
                                      }
                                    }
                                    csome_list_var3 = csome_list_var3.rest();
                                    skolem4 = csome_list_var3.first();
                                  }
                                }
                                else
                                {
                                  Errors.error( $str169$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                }
                              }
                              finally
                              {
                                sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$44, thread );
                              }
                              cdolist_list_var_$51 = cdolist_list_var_$51.rest();
                              generating_fn = cdolist_list_var_$51.first();
                            }
                          }
                        }
                        finally
                        {
                          sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$40, thread );
                          sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$39, thread );
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        module_var = cdolist_list_var.first();
                      }
                      SubLObject cdolist_list_var2;
                      final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                          $const48$isa ) ) );
                      SubLObject module_var2 = NIL;
                      module_var2 = cdolist_list_var2.first();
                      while ( NIL != cdolist_list_var2)
                      {
                        final SubLObject _prev_bind_0_$45 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$41 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                        try
                        {
                          sbhl_module_vars.$sbhl_module$.bind( module_var2, thread );
                          sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                              .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                          final SubLObject node2 = function_terms.naut_to_nart( node_var_$34 );
                          if( NIL != sbhl_link_vars.sbhl_node_object_p( node2 ) )
                          {
                            final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link( node2, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != d_link2 )
                            {
                              final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links( d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != mt_links2 )
                              {
                                SubLObject iteration_state2;
                                for( iteration_state2 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links2 ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                    iteration_state2 ); iteration_state2 = dictionary_contents.do_dictionary_contents_next( iteration_state2 ) )
                                {
                                  thread.resetMultipleValues();
                                  final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value( iteration_state2 );
                                  final SubLObject tv_links2 = thread.secondMultipleValue();
                                  thread.resetMultipleValues();
                                  if( NIL != mt_relevance_macros.relevant_mtP( mt3 ) )
                                  {
                                    final SubLObject _prev_bind_0_$46 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                    try
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.bind( mt3, thread );
                                      SubLObject iteration_state_$47;
                                      for( iteration_state_$47 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links2 ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                          iteration_state_$47 ); iteration_state_$47 = dictionary_contents.do_dictionary_contents_next( iteration_state_$47 ) )
                                      {
                                        thread.resetMultipleValues();
                                        final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$47 );
                                        final SubLObject link_nodes4 = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv2 ) )
                                        {
                                          final SubLObject _prev_bind_0_$47 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.bind( tv2, thread );
                                            final SubLObject sol3 = link_nodes4;
                                            if( NIL != set.set_p( sol3 ) )
                                            {
                                              final SubLObject set_contents_var3 = set.do_set_internal( sol3 );
                                              SubLObject basis_object3;
                                              SubLObject state3;
                                              SubLObject node_vars_link_node;
                                              for( basis_object3 = set_contents.do_set_contents_basis_object( set_contents_var3 ), state3 = NIL, state3 = set_contents.do_set_contents_initial_state( basis_object3,
                                                  set_contents_var3 ); NIL == set_contents.do_set_contents_doneP( basis_object3, state3 ); state3 = set_contents.do_set_contents_update_state( state3 ) )
                                              {
                                                node_vars_link_node = set_contents.do_set_contents_next( basis_object3, state3 );
                                                if( NIL != set_contents.do_set_contents_element_validP( state3, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                    UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                  deck.deck_push( node_vars_link_node, recur_deck );
                                                }
                                              }
                                            }
                                            else if( sol3.isList() )
                                            {
                                              SubLObject csome_list_var4 = sol3;
                                              SubLObject node_vars_link_node2 = NIL;
                                              node_vars_link_node2 = csome_list_var4.first();
                                              while ( NIL != csome_list_var4)
                                              {
                                                if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                  deck.deck_push( node_vars_link_node2, recur_deck );
                                                }
                                                csome_list_var4 = csome_list_var4.rest();
                                                node_vars_link_node2 = csome_list_var4.first();
                                              }
                                            }
                                            else
                                            {
                                              Errors.error( $str169$_A_is_neither_SET_P_nor_LISTP_, sol3 );
                                            }
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$47, thread );
                                          }
                                        }
                                      }
                                      dictionary_contents.do_dictionary_contents_finalize( iteration_state_$47 );
                                    }
                                    finally
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$46, thread );
                                    }
                                  }
                                }
                                dictionary_contents.do_dictionary_contents_finalize( iteration_state2 );
                              }
                            }
                            else
                            {
                              sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str170$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                            }
                          }
                          else if( NIL != obsolete.cnat_p( node2, UNPROVIDED ) )
                          {
                            SubLObject cdolist_list_var_$52;
                            final SubLObject new_list2 = cdolist_list_var_$52 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                    UNPROVIDED ) ) )
                                : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                    .get_sbhl_module( UNPROVIDED ) ) );
                            SubLObject generating_fn2 = NIL;
                            generating_fn2 = cdolist_list_var_$52.first();
                            while ( NIL != cdolist_list_var_$52)
                            {
                              final SubLObject _prev_bind_0_$48 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                              try
                              {
                                sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn2, thread );
                                final SubLObject sol4;
                                final SubLObject link_nodes5 = sol4 = Functions.funcall( generating_fn2, node2 );
                                if( NIL != set.set_p( sol4 ) )
                                {
                                  final SubLObject set_contents_var4 = set.do_set_internal( sol4 );
                                  SubLObject basis_object4;
                                  SubLObject state4;
                                  SubLObject node_vars_link_node3;
                                  for( basis_object4 = set_contents.do_set_contents_basis_object( set_contents_var4 ), state4 = NIL, state4 = set_contents.do_set_contents_initial_state( basis_object4,
                                      set_contents_var4 ); NIL == set_contents.do_set_contents_doneP( basis_object4, state4 ); state4 = set_contents.do_set_contents_update_state( state4 ) )
                                  {
                                    node_vars_link_node3 = set_contents.do_set_contents_next( basis_object4, state4 );
                                    if( NIL != set_contents.do_set_contents_element_validP( state4, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                        UNPROVIDED ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                      deck.deck_push( node_vars_link_node3, recur_deck );
                                    }
                                  }
                                }
                                else if( sol4.isList() )
                                {
                                  SubLObject csome_list_var5 = sol4;
                                  SubLObject node_vars_link_node4 = NIL;
                                  node_vars_link_node4 = csome_list_var5.first();
                                  while ( NIL != csome_list_var5)
                                  {
                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                      deck.deck_push( node_vars_link_node4, recur_deck );
                                    }
                                    csome_list_var5 = csome_list_var5.rest();
                                    node_vars_link_node4 = csome_list_var5.first();
                                  }
                                }
                                else
                                {
                                  Errors.error( $str169$_A_is_neither_SET_P_nor_LISTP_, sol4 );
                                }
                              }
                              finally
                              {
                                sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$48, thread );
                              }
                              cdolist_list_var_$52 = cdolist_list_var_$52.rest();
                              generating_fn2 = cdolist_list_var_$52.first();
                            }
                          }
                        }
                        finally
                        {
                          sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$41, thread );
                          sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$45, thread );
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        module_var2 = cdolist_list_var2.first();
                      }
                      node_var_$34 = deck.deck_pop( recur_deck );
                    }
                  }
                  finally
                  {
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$42, thread );
                    sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$39, thread );
                    sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$38, thread );
                  }
                }
                else
                {
                  sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str172$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED,
                      UNPROVIDED, UNPROVIDED );
                }
              }
              finally
              {
                sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
                sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$38, thread );
                sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$37, thread );
              }
            }
            finally
            {
              sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$37, thread );
              sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$36, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$49 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$49, thread );
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$35, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$50 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$50, thread );
        }
      }
    }
    finally
    {
      sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_2, thread );
      sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0, thread );
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 86576L)
  public static SubLObject skolem_unfindable_via_elP(final SubLObject skolem)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cdolist_list_var = skolem_defn_assertions( skolem, UNPROVIDED );
    SubLObject ass = NIL;
    ass = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      thread.resetMultipleValues();
      final SubLObject formula = uncanonicalizer.assertion_el_formula( ass );
      final SubLObject mt = thread.secondMultipleValue();
      thread.resetMultipleValues();
      thread.resetMultipleValues();
      final SubLObject assertions = czer_meta.find_assertions_cycl( formula, mt );
      final SubLObject not_foundP = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != not_foundP )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      ass = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 86899L)
  public static SubLObject bad_skolem_assertions(SubLObject verboseP)
  {
    if( verboseP == UNPROVIDED )
    {
      verboseP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject bad_skfs = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym40$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const41$EverythingPSC, thread );
      final SubLObject node_var = $const4$SkolemFunction;
      final SubLObject _prev_bind_0_$62 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
      final SubLObject _prev_bind_1_$63 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
      try
      {
        sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const48$isa ), thread );
        sbhl_marking_vars.$sbhl_gather_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
        try
        {
          SubLObject node_var_$64 = node_var;
          final SubLObject deck_type = $kw160$STACK;
          final SubLObject recur_deck = deck.create_deck( deck_type );
          final SubLObject _prev_bind_0_$63 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
            try
            {
              final SubLObject tv_var = NIL;
              final SubLObject _prev_bind_0_$64 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
              final SubLObject _prev_bind_1_$64 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
                sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym161$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
                if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
                {
                  final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                  if( pcase_var.eql( $kw162$ERROR ) )
                  {
                    sbhl_paranoia.sbhl_error( ONE_INTEGER, $str163$_A_is_not_a__A, tv_var, $sym164$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                  else if( pcase_var.eql( $kw165$CERROR ) )
                  {
                    sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str166$continue_anyway, $str163$_A_is_not_a__A, tv_var, $sym164$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                  else if( pcase_var.eql( $kw167$WARN ) )
                  {
                    Errors.warn( $str163$_A_is_not_a__A, tv_var, $sym164$SBHL_TRUE_TV_P );
                  }
                  else
                  {
                    Errors.warn( $str168$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                    Errors.cerror( $str166$continue_anyway, $str163$_A_is_not_a__A, tv_var, $sym164$SBHL_TRUE_TV_P );
                  }
                }
                final SubLObject _prev_bind_0_$65 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                final SubLObject _prev_bind_1_$65 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const48$isa ) ), thread );
                  sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                      $const48$isa ) ) ), thread );
                  sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                      $const48$isa ) ) ), thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  sbhl_module_vars.$sbhl_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const48$isa ) ), thread );
                  if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( node_var, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                  {
                    final SubLObject _prev_bind_0_$66 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                    final SubLObject _prev_bind_1_$66 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                    final SubLObject _prev_bind_2_$72 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                    try
                    {
                      sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                      sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities
                          .get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const48$isa ) ) ), thread );
                      sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                      sbhl_marking_utilities.sbhl_mark_node_marked( node_var_$64, UNPROVIDED );
                      while ( NIL != node_var_$64)
                      {
                        final SubLObject tt_node_var = node_var_$64;
                        SubLObject cdolist_list_var;
                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const48$isa ) );
                        SubLObject module_var = NIL;
                        module_var = cdolist_list_var.first();
                        while ( NIL != cdolist_list_var)
                        {
                          final SubLObject _prev_bind_0_$67 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                          final SubLObject _prev_bind_1_$67 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                          try
                          {
                            sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                            sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                            final SubLObject node = function_terms.naut_to_nart( tt_node_var );
                            if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                            {
                              final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != d_link )
                              {
                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const48$isa ) ),
                                    sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != mt_links )
                                {
                                  SubLObject iteration_state;
                                  for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                      iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                  {
                                    thread.resetMultipleValues();
                                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                    final SubLObject tv_links = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                    {
                                      final SubLObject _prev_bind_0_$68 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                        SubLObject iteration_state_$76;
                                        for( iteration_state_$76 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                            iteration_state_$76 ); iteration_state_$76 = dictionary_contents.do_dictionary_contents_next( iteration_state_$76 ) )
                                        {
                                          thread.resetMultipleValues();
                                          final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$76 );
                                          final SubLObject link_nodes = thread.secondMultipleValue();
                                          thread.resetMultipleValues();
                                          if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                          {
                                            final SubLObject _prev_bind_0_$69 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                              final SubLObject sol = link_nodes;
                                              if( NIL != set.set_p( sol ) )
                                              {
                                                final SubLObject set_contents_var = set.do_set_internal( sol );
                                                SubLObject basis_object;
                                                SubLObject state;
                                                SubLObject skf;
                                                for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                    set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                {
                                                  skf = set_contents.do_set_contents_next( basis_object, state );
                                                  if( NIL != set_contents.do_set_contents_element_validP( state, skf ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( skf,
                                                      sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( skf, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                    if( NIL == hl_prototypes.hl_prototypical_instanceP( skf ) && NIL == skolem_function_skolem_assertion_goodP( skf ) )
                                                    {
                                                      if( NIL != verboseP )
                                                      {
                                                        PrintLow.format( T, $str173$Bad_skolem_function___A__, skf );
                                                      }
                                                      bad_skfs = ConsesLow.cons( skf, bad_skfs );
                                                    }
                                                  }
                                                }
                                              }
                                              else if( sol.isList() )
                                              {
                                                SubLObject csome_list_var = sol;
                                                SubLObject skf2 = NIL;
                                                skf2 = csome_list_var.first();
                                                while ( NIL != csome_list_var)
                                                {
                                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( skf2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( skf2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                    if( NIL == hl_prototypes.hl_prototypical_instanceP( skf2 ) && NIL == skolem_function_skolem_assertion_goodP( skf2 ) )
                                                    {
                                                      if( NIL != verboseP )
                                                      {
                                                        PrintLow.format( T, $str173$Bad_skolem_function___A__, skf2 );
                                                      }
                                                      bad_skfs = ConsesLow.cons( skf2, bad_skfs );
                                                    }
                                                  }
                                                  csome_list_var = csome_list_var.rest();
                                                  skf2 = csome_list_var.first();
                                                }
                                              }
                                              else
                                              {
                                                Errors.error( $str169$_A_is_neither_SET_P_nor_LISTP_, sol );
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$69, thread );
                                            }
                                          }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize( iteration_state_$76 );
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$68, thread );
                                      }
                                    }
                                  }
                                  dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                }
                              }
                              else
                              {
                                sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str170$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                              }
                              if( NIL != sbhl_macros.do_sbhl_non_fort_linksP( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                              {
                                SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup( node );
                                SubLObject instance_tuple = NIL;
                                instance_tuple = csome_list_var2.first();
                                while ( NIL != csome_list_var2)
                                {
                                  SubLObject current;
                                  final SubLObject datum = current = instance_tuple;
                                  SubLObject link_node = NIL;
                                  SubLObject mt2 = NIL;
                                  SubLObject tv2 = NIL;
                                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list171 );
                                  link_node = current.first();
                                  current = current.rest();
                                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list171 );
                                  mt2 = current.first();
                                  current = current.rest();
                                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list171 );
                                  tv2 = current.first();
                                  current = current.rest();
                                  if( NIL == current )
                                  {
                                    if( NIL != mt_relevance_macros.relevant_mtP( mt2 ) )
                                    {
                                      final SubLObject _prev_bind_0_$70 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.bind( mt2, thread );
                                        if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv2 ) )
                                        {
                                          final SubLObject _prev_bind_0_$71 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.bind( tv2, thread );
                                            final SubLObject sol;
                                            final SubLObject link_nodes2 = sol = ConsesLow.list( link_node );
                                            if( NIL != set.set_p( sol ) )
                                            {
                                              final SubLObject set_contents_var = set.do_set_internal( sol );
                                              SubLObject basis_object;
                                              SubLObject state;
                                              SubLObject skf;
                                              for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                  set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                              {
                                                skf = set_contents.do_set_contents_next( basis_object, state );
                                                if( NIL != set_contents.do_set_contents_element_validP( state, skf ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( skf,
                                                    sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( skf, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                  if( NIL == hl_prototypes.hl_prototypical_instanceP( skf ) && NIL == skolem_function_skolem_assertion_goodP( skf ) )
                                                  {
                                                    if( NIL != verboseP )
                                                    {
                                                      PrintLow.format( T, $str173$Bad_skolem_function___A__, skf );
                                                    }
                                                    bad_skfs = ConsesLow.cons( skf, bad_skfs );
                                                  }
                                                }
                                              }
                                            }
                                            else if( sol.isList() )
                                            {
                                              SubLObject csome_list_var_$80 = sol;
                                              SubLObject skf2 = NIL;
                                              skf2 = csome_list_var_$80.first();
                                              while ( NIL != csome_list_var_$80)
                                              {
                                                if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( skf2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( skf2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                  if( NIL == hl_prototypes.hl_prototypical_instanceP( skf2 ) && NIL == skolem_function_skolem_assertion_goodP( skf2 ) )
                                                  {
                                                    if( NIL != verboseP )
                                                    {
                                                      PrintLow.format( T, $str173$Bad_skolem_function___A__, skf2 );
                                                    }
                                                    bad_skfs = ConsesLow.cons( skf2, bad_skfs );
                                                  }
                                                }
                                                csome_list_var_$80 = csome_list_var_$80.rest();
                                                skf2 = csome_list_var_$80.first();
                                              }
                                            }
                                            else
                                            {
                                              Errors.error( $str169$_A_is_neither_SET_P_nor_LISTP_, sol );
                                            }
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$71, thread );
                                          }
                                        }
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$70, thread );
                                      }
                                    }
                                  }
                                  else
                                  {
                                    cdestructuring_bind.cdestructuring_bind_error( datum, $list171 );
                                  }
                                  csome_list_var2 = csome_list_var2.rest();
                                  instance_tuple = csome_list_var2.first();
                                }
                              }
                            }
                            else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                            {
                              SubLObject cdolist_list_var_$81;
                              final SubLObject new_list = cdolist_list_var_$81 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                  .get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const48$isa ) ), sbhl_search_vars.$sbhl_tv$
                                      .getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                  : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const48$isa ) ),
                                      sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) );
                              SubLObject generating_fn = NIL;
                              generating_fn = cdolist_list_var_$81.first();
                              while ( NIL != cdolist_list_var_$81)
                              {
                                final SubLObject _prev_bind_0_$72 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                try
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                  final SubLObject sol2;
                                  final SubLObject link_nodes3 = sol2 = Functions.funcall( generating_fn, node );
                                  if( NIL != set.set_p( sol2 ) )
                                  {
                                    final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                    SubLObject basis_object2;
                                    SubLObject state2;
                                    SubLObject skf3;
                                    for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                        set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                    {
                                      skf3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                      if( NIL != set_contents.do_set_contents_element_validP( state2, skf3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( skf3, sbhl_marking_vars.$sbhl_gather_space$
                                          .getDynamicValue( thread ) ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( skf3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                        if( NIL == hl_prototypes.hl_prototypical_instanceP( skf3 ) && NIL == skolem_function_skolem_assertion_goodP( skf3 ) )
                                        {
                                          if( NIL != verboseP )
                                          {
                                            PrintLow.format( T, $str173$Bad_skolem_function___A__, skf3 );
                                          }
                                          bad_skfs = ConsesLow.cons( skf3, bad_skfs );
                                        }
                                      }
                                    }
                                  }
                                  else if( sol2.isList() )
                                  {
                                    SubLObject csome_list_var3 = sol2;
                                    SubLObject skf4 = NIL;
                                    skf4 = csome_list_var3.first();
                                    while ( NIL != csome_list_var3)
                                    {
                                      if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( skf4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( skf4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                        if( NIL == hl_prototypes.hl_prototypical_instanceP( skf4 ) && NIL == skolem_function_skolem_assertion_goodP( skf4 ) )
                                        {
                                          if( NIL != verboseP )
                                          {
                                            PrintLow.format( T, $str173$Bad_skolem_function___A__, skf4 );
                                          }
                                          bad_skfs = ConsesLow.cons( skf4, bad_skfs );
                                        }
                                      }
                                      csome_list_var3 = csome_list_var3.rest();
                                      skf4 = csome_list_var3.first();
                                    }
                                  }
                                  else
                                  {
                                    Errors.error( $str169$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                  }
                                }
                                finally
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$72, thread );
                                }
                                cdolist_list_var_$81 = cdolist_list_var_$81.rest();
                                generating_fn = cdolist_list_var_$81.first();
                              }
                            }
                          }
                          finally
                          {
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$67, thread );
                            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$67, thread );
                          }
                          cdolist_list_var = cdolist_list_var.rest();
                          module_var = cdolist_list_var.first();
                        }
                        SubLObject cdolist_list_var2;
                        final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                            $const48$isa ) ) );
                        SubLObject module_var2 = NIL;
                        module_var2 = cdolist_list_var2.first();
                        while ( NIL != cdolist_list_var2)
                        {
                          final SubLObject _prev_bind_0_$73 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                          final SubLObject _prev_bind_1_$68 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                          try
                          {
                            sbhl_module_vars.$sbhl_module$.bind( module_var2, thread );
                            sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                            final SubLObject node2 = function_terms.naut_to_nart( node_var_$64 );
                            if( NIL != sbhl_link_vars.sbhl_node_object_p( node2 ) )
                            {
                              final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link( node2, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != d_link2 )
                              {
                                final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links( d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != mt_links2 )
                                {
                                  SubLObject iteration_state2;
                                  for( iteration_state2 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links2 ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                      iteration_state2 ); iteration_state2 = dictionary_contents.do_dictionary_contents_next( iteration_state2 ) )
                                  {
                                    thread.resetMultipleValues();
                                    final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value( iteration_state2 );
                                    final SubLObject tv_links2 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if( NIL != mt_relevance_macros.relevant_mtP( mt3 ) )
                                    {
                                      final SubLObject _prev_bind_0_$74 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.bind( mt3, thread );
                                        SubLObject iteration_state_$77;
                                        for( iteration_state_$77 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links2 ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                            iteration_state_$77 ); iteration_state_$77 = dictionary_contents.do_dictionary_contents_next( iteration_state_$77 ) )
                                        {
                                          thread.resetMultipleValues();
                                          final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$77 );
                                          final SubLObject link_nodes4 = thread.secondMultipleValue();
                                          thread.resetMultipleValues();
                                          if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv2 ) )
                                          {
                                            final SubLObject _prev_bind_0_$75 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.bind( tv2, thread );
                                              final SubLObject sol3 = link_nodes4;
                                              if( NIL != set.set_p( sol3 ) )
                                              {
                                                final SubLObject set_contents_var3 = set.do_set_internal( sol3 );
                                                SubLObject basis_object3;
                                                SubLObject state3;
                                                SubLObject node_vars_link_node;
                                                for( basis_object3 = set_contents.do_set_contents_basis_object( set_contents_var3 ), state3 = NIL, state3 = set_contents.do_set_contents_initial_state( basis_object3,
                                                    set_contents_var3 ); NIL == set_contents.do_set_contents_doneP( basis_object3, state3 ); state3 = set_contents.do_set_contents_update_state( state3 ) )
                                                {
                                                  node_vars_link_node = set_contents.do_set_contents_next( basis_object3, state3 );
                                                  if( NIL != set_contents.do_set_contents_element_validP( state3, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                      node_vars_link_node, UNPROVIDED ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                    deck.deck_push( node_vars_link_node, recur_deck );
                                                  }
                                                }
                                              }
                                              else if( sol3.isList() )
                                              {
                                                SubLObject csome_list_var4 = sol3;
                                                SubLObject node_vars_link_node2 = NIL;
                                                node_vars_link_node2 = csome_list_var4.first();
                                                while ( NIL != csome_list_var4)
                                                {
                                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                    deck.deck_push( node_vars_link_node2, recur_deck );
                                                  }
                                                  csome_list_var4 = csome_list_var4.rest();
                                                  node_vars_link_node2 = csome_list_var4.first();
                                                }
                                              }
                                              else
                                              {
                                                Errors.error( $str169$_A_is_neither_SET_P_nor_LISTP_, sol3 );
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$75, thread );
                                            }
                                          }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize( iteration_state_$77 );
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$74, thread );
                                      }
                                    }
                                  }
                                  dictionary_contents.do_dictionary_contents_finalize( iteration_state2 );
                                }
                              }
                              else
                              {
                                sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str170$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                              }
                            }
                            else if( NIL != obsolete.cnat_p( node2, UNPROVIDED ) )
                            {
                              SubLObject cdolist_list_var_$82;
                              final SubLObject new_list2 = cdolist_list_var_$82 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                  .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                      UNPROVIDED ) ) )
                                  : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                      .get_sbhl_module( UNPROVIDED ) ) );
                              SubLObject generating_fn2 = NIL;
                              generating_fn2 = cdolist_list_var_$82.first();
                              while ( NIL != cdolist_list_var_$82)
                              {
                                final SubLObject _prev_bind_0_$76 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                try
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn2, thread );
                                  final SubLObject sol4;
                                  final SubLObject link_nodes5 = sol4 = Functions.funcall( generating_fn2, node2 );
                                  if( NIL != set.set_p( sol4 ) )
                                  {
                                    final SubLObject set_contents_var4 = set.do_set_internal( sol4 );
                                    SubLObject basis_object4;
                                    SubLObject state4;
                                    SubLObject node_vars_link_node3;
                                    for( basis_object4 = set_contents.do_set_contents_basis_object( set_contents_var4 ), state4 = NIL, state4 = set_contents.do_set_contents_initial_state( basis_object4,
                                        set_contents_var4 ); NIL == set_contents.do_set_contents_doneP( basis_object4, state4 ); state4 = set_contents.do_set_contents_update_state( state4 ) )
                                    {
                                      node_vars_link_node3 = set_contents.do_set_contents_next( basis_object4, state4 );
                                      if( NIL != set_contents.do_set_contents_element_validP( state4, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                          UNPROVIDED ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                        deck.deck_push( node_vars_link_node3, recur_deck );
                                      }
                                    }
                                  }
                                  else if( sol4.isList() )
                                  {
                                    SubLObject csome_list_var5 = sol4;
                                    SubLObject node_vars_link_node4 = NIL;
                                    node_vars_link_node4 = csome_list_var5.first();
                                    while ( NIL != csome_list_var5)
                                    {
                                      if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                        deck.deck_push( node_vars_link_node4, recur_deck );
                                      }
                                      csome_list_var5 = csome_list_var5.rest();
                                      node_vars_link_node4 = csome_list_var5.first();
                                    }
                                  }
                                  else
                                  {
                                    Errors.error( $str169$_A_is_neither_SET_P_nor_LISTP_, sol4 );
                                  }
                                }
                                finally
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$76, thread );
                                }
                                cdolist_list_var_$82 = cdolist_list_var_$82.rest();
                                generating_fn2 = cdolist_list_var_$82.first();
                              }
                            }
                          }
                          finally
                          {
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$68, thread );
                            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$73, thread );
                          }
                          cdolist_list_var2 = cdolist_list_var2.rest();
                          module_var2 = cdolist_list_var2.first();
                        }
                        node_var_$64 = deck.deck_pop( recur_deck );
                      }
                    }
                    finally
                    {
                      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$72, thread );
                      sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$66, thread );
                      sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$66, thread );
                    }
                  }
                  else
                  {
                    sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str172$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED,
                        UNPROVIDED, UNPROVIDED );
                  }
                }
                finally
                {
                  sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                  sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
                  sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$65, thread );
                  sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$65, thread );
                }
              }
              finally
              {
                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$64, thread );
                sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$64, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$77 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$77, thread );
              }
            }
          }
          finally
          {
            sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$63, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$78 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$78, thread );
          }
        }
      }
      finally
      {
        sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_1_$63, thread );
        sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$62, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return Sequences.nreverse( bad_skfs );
  }

  public static SubLObject declare_skolems_file()
  {
    SubLFiles.declareFunction( me, "reify_skolems_in", "REIFY-SKOLEMS-IN", 4, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_fns_in_sk_term", "CANONICALIZE-FNS-IN-SK-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "subst_skolem_in", "SUBST-SKOLEM-IN", 3, 0, false );
    SubLFiles.declareFunction( me, "skolem_function_dependent_vars", "SKOLEM-FUNCTION-DEPENDENT-VARS", 1, 0, false );
    SubLFiles.declareFunction( me, "skolem_function_var", "SKOLEM-FUNCTION-VAR", 1, 0, false );
    SubLFiles.declareFunction( me, "skolem_args", "SKOLEM-ARGS", 3, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_skolem_term", "CANONICALIZE-SKOLEM-TERM", 4, 0, false );
    SubLFiles.declareFunction( me, "replace_unreified_skolem_terms_with_variables", "REPLACE-UNREIFIED-SKOLEM-TERMS-WITH-VARIABLES", 1, 0, false );
    SubLFiles.declareFunction( me, "lookup_sk_constant_from_defns", "LOOKUP-SK-CONSTANT-FROM-DEFNS", 3, 0, false );
    SubLFiles.declareFunction( me, "defn_unreified_sk_term", "DEFN-UNREIFIED-SK-TERM", 3, 0, false );
    SubLFiles.declareFunction( me, "skolem_collection", "SKOLEM-COLLECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "create_skolem", "CREATE-SKOLEM", 5, 0, false );
    SubLFiles.declareFunction( me, "sk_defn_from_clauses", "SK-DEFN-FROM-CLAUSES", 2, 1, false );
    SubLFiles.declareFunction( me, "alpha_sort_clauses", "ALPHA-SORT-CLAUSES", 1, 0, false );
    SubLFiles.declareFunction( me, "rename_skolem_clause_vars", "RENAME-SKOLEM-CLAUSE-VARS", 2, 1, false );
    SubLFiles.declareFunction( me, "sk_defn_var", "SK-DEFN-VAR", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_formula_constant_str", "CLEAR-FORMULA-CONSTANT-STR", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_formula_constant_str", "REMOVE-FORMULA-CONSTANT-STR", 1, 0, false );
    SubLFiles.declareFunction( me, "formula_constant_str_internal", "FORMULA-CONSTANT-STR-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "formula_constant_str", "FORMULA-CONSTANT-STR", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_var_except_for_x_0P", "CYC-VAR-EXCEPT-FOR-X-0?", 1, 0, false );
    SubLFiles.declareFunction( me, "make_sk_defn", "MAKE-SK-DEFN", 4, 0, false );
    SubLFiles.declareFunction( me, "sk_arity", "SK-ARITY", 1, 1, false );
    SubLFiles.declareFunction( me, "make_unreified_sk_nat", "MAKE-UNREIFIED-SK-NAT", 4, 0, false );
    SubLFiles.declareFunction( me, "skolem_defn", "SKOLEM-DEFN", 1, 0, false );
    SubLFiles.declareFunction( me, "skolem_defnXkey", "SKOLEM-DEFN&KEY", 1, 0, false );
    SubLFiles.declareFunction( me, "skolem_defn_key", "SKOLEM-DEFN-KEY", 1, 0, false );
    SubLFiles.declareFunction( me, "skolem_of_defn", "SKOLEM-OF-DEFN", 1, 0, false );
    SubLFiles.declareFunction( me, "unreified_sk_term", "UNREIFIED-SK-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "skolem_defn_mt", "SKOLEM-DEFN-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "skolem_seqvar", "SKOLEM-SEQVAR", 1, 0, false );
    SubLFiles.declareFunction( me, "skolem_defn_seqvar", "SKOLEM-DEFN-SEQVAR", 1, 0, false );
    SubLFiles.declareFunction( me, "old_format_skolemP", "OLD-FORMAT-SKOLEM?", 1, 0, false );
    SubLFiles.declareFunction( me, "skolem_number", "SKOLEM-NUMBER", 1, 0, false );
    SubLFiles.declareFunction( me, "skolem_defn_number", "SKOLEM-DEFN-NUMBER", 1, 0, false );
    SubLFiles.declareFunction( me, "skolem_defn_args", "SKOLEM-DEFN-ARGS", 1, 0, false );
    SubLFiles.declareFunction( me, "skolem_var", "SKOLEM-VAR", 1, 0, false );
    SubLFiles.declareFunction( me, "el_unreified_sk_term", "EL-UNREIFIED-SK-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "compute_unreified_sk_term_via_hl", "COMPUTE-UNREIFIED-SK-TERM-VIA-HL", 1, 0, false );
    SubLFiles.declareFunction( me, "compute_skolem_info_from_assertions", "COMPUTE-SKOLEM-INFO-FROM-ASSERTIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "skolem_table_key_from_defn", "SKOLEM-TABLE-KEY-FROM-DEFN", 1, 0, false );
    SubLFiles.declareFunction( me, "skolem_table_key_from_constant", "SKOLEM-TABLE-KEY-FROM-CONSTANT", 1, 0, false );
    SubLFiles.declareFunction( me, "skolem_hash_key", "SKOLEM-HASH-KEY", 2, 0, false );
    SubLFiles.declareFunction( me, "opaquify_unreified_skolem_terms", "OPAQUIFY-UNREIFIED-SKOLEM-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "skolem_defns_from_key_specification", "SKOLEM-DEFNS-FROM-KEY-SPECIFICATION", 2, 0, false );
    SubLFiles.declareFunction( me, "cnfs_of_skolem_defn", "CNFS-OF-SKOLEM-DEFN", 1, 0, false );
    SubLFiles.declareFunction( me, "mt_of_skolem_defn", "MT-OF-SKOLEM-DEFN", 1, 0, false );
    SubLFiles.declareFunction( me, "skolem_defn_cnfs", "SKOLEM-DEFN-CNFS", 1, 0, false );
    SubLFiles.declareFunction( me, "skolem_defn_assertions_robust", "SKOLEM-DEFN-ASSERTIONS-ROBUST", 1, 1, false );
    SubLFiles.declareFunction( me, "skolem_function_has_no_defn_assertions_robustP", "SKOLEM-FUNCTION-HAS-NO-DEFN-ASSERTIONS-ROBUST?", 1, 0, false );
    SubLFiles.declareFunction( me, "skolem_function_has_no_defn_assertionsP", "SKOLEM-FUNCTION-HAS-NO-DEFN-ASSERTIONS?", 1, 0, false );
    SubLFiles.declareFunction( me, "skolem_defining_bookkeeping_assertion", "SKOLEM-DEFINING-BOOKKEEPING-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "skolem_defn_assertions", "SKOLEM-DEFN-ASSERTIONS", 1, 1, false );
    SubLFiles.declareFunction( me, "skolems_defn_assertions", "SKOLEMS-DEFN-ASSERTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "skolem_defn_siblings", "SKOLEM-DEFN-SIBLINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "skolem_defn_proper_siblings", "SKOLEM-DEFN-PROPER-SIBLINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "skolem_canonical_sibling", "SKOLEM-CANONICAL-SIBLING", 1, 0, false );
    SubLFiles.declareFunction( me, "skolems_min_mt", "SKOLEMS-MIN-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "skolem_only_mentioned_in_el_templatesP", "SKOLEM-ONLY-MENTIONED-IN-EL-TEMPLATES?", 2, 0, false );
    SubLFiles.declareFunction( me, "skolem_defn_assertionP", "SKOLEM-DEFN-ASSERTION?", 2, 1, false );
    SubLFiles.declareFunction( me, "gaf_has_corresponding_cnf_in_skolem_defnP", "GAF-HAS-CORRESPONDING-CNF-IN-SKOLEM-DEFN?", 2, 1, false );
    SubLFiles.declareFunction( me, "constant_denoting_reified_skolem_fnP", "CONSTANT-DENOTING-REIFIED-SKOLEM-FN?", 1, 0, false );
    SubLFiles.declareFunction( me, "computed_skolem_assertionP", "COMPUTED-SKOLEM-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "skolem_defining_assertionP", "SKOLEM-DEFINING-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "defn_assertion_of_skolemP", "DEFN-ASSERTION-OF-SKOLEM?", 2, 0, false );
    SubLFiles.declareFunction( me, "assertion_skolems", "ASSERTION-SKOLEMS", 1, 0, false );
    SubLFiles.declareFunction( me, "defn_assertion_skolems", "DEFN-ASSERTION-SKOLEMS", 1, 0, false );
    SubLFiles.declareFunction( me, "all_skolem_mt_defn_assertions", "ALL-SKOLEM-MT-DEFN-ASSERTIONS", 2, 1, false );
    SubLFiles.declareFunction( me, "recomputing_skolem_defn_info_constant", "RECOMPUTING-SKOLEM-DEFN-INFO-CONSTANT", 0, 0, false );
    SubLFiles.declareFunction( me, "recomputing_skolem_defn_info_var", "RECOMPUTING-SKOLEM-DEFN-INFO-VAR", 0, 0, false );
    SubLFiles.declareFunction( me, "really_recomputing_skolem_defnP", "REALLY-RECOMPUTING-SKOLEM-DEFN?", 0, 0, false );
    SubLFiles.declareFunction( me, "recomputing_skolem_defn_info_defn", "RECOMPUTING-SKOLEM-DEFN-INFO-DEFN", 0, 0, false );
    SubLFiles.declareFunction( me, "recomputing_skolem_defn_info_key", "RECOMPUTING-SKOLEM-DEFN-INFO-KEY", 0, 0, false );
    SubLFiles.declareFunction( me, "recomputing_skolem_defn_info_blist", "RECOMPUTING-SKOLEM-DEFN-INFO-BLIST", 0, 0, false );
    SubLFiles.declareFunction( me, "set_recomputing_skolem_defn_result", "SET-RECOMPUTING-SKOLEM-DEFN-RESULT", 2, 0, false );
    SubLFiles.declareFunction( me, "set_recomputing_skolem_defn_blist", "SET-RECOMPUTING-SKOLEM-DEFN-BLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "recomputing_skolem_defnP", "RECOMPUTING-SKOLEM-DEFN?", 0, 0, false );
    SubLFiles.declareFunction( me, "recomputing_defn_of_skolemP", "RECOMPUTING-DEFN-OF-SKOLEM?", 1, 0, false );
    SubLFiles.declareFunction( me, "recomputing_skolem_defn_ofP", "RECOMPUTING-SKOLEM-DEFN-OF?", 1, 0, false );
    SubLFiles.declareFunction( me, "note_skolem_binding", "NOTE-SKOLEM-BINDING", 2, 0, false );
    SubLFiles.declareFunction( me, "recompute_skolem_defn", "RECOMPUTE-SKOLEM-DEFN", 6, 0, false );
    SubLFiles.declareFunction( me, "remove_defn_of_skolem", "REMOVE-DEFN-OF-SKOLEM", 1, 1, false );
    SubLFiles.declareFunction( me, "add_skolem_defn", "ADD-SKOLEM-DEFN", 1, 1, false );
    SubLFiles.declareFunction( me, "kb_skolems", "KB-SKOLEMS", 0, 0, false );
    SubLFiles.declareFunction( me, "skolem_table_contains_old_format_skolemsP", "SKOLEM-TABLE-CONTAINS-OLD-FORMAT-SKOLEMS?", 0, 0, false );
    SubLFiles.declareFunction( me, "reset_skolem_defn_table", "RESET-SKOLEM-DEFN-TABLE", 0, 2, false );
    SubLFiles.declareFunction( me, "reset_defn_of_skolem", "RESET-DEFN-OF-SKOLEM", 1, 1, false );
    SubLFiles.declareFunction( me, "skolem_defn_from_assertions", "SKOLEM-DEFN-FROM-ASSERTIONS", 1, 1, false );
    SubLFiles.declareFunction( me, "reset_skolem_defn_from_assertions", "RESET-SKOLEM-DEFN-FROM-ASSERTIONS", 1, 2, false );
    SubLFiles.declareFunction( me, "skolem_variable_from_assertions", "SKOLEM-VARIABLE-FROM-ASSERTIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "skolem_scalar_termP", "SKOLEM-SCALAR-TERM?", 1, 1, false );
    SubLFiles.declareFunction( me, "skolem_result_types_from_cnfs", "SKOLEM-RESULT-TYPES-FROM-CNFS", 2, 2, false );
    SubLFiles.declareFunction( me, "guess_skolem_result_types_from_cnfs", "GUESS-SKOLEM-RESULT-TYPES-FROM-CNFS", 3, 2, false );
    SubLFiles.declareFunction( me, "skolem_cnfs_pos_lit_types", "SKOLEM-CNFS-POS-LIT-TYPES", 2, 1, false );
    SubLFiles.declareFunction( me, "skolem_var_isa_constraints_wrt_cnfs", "SKOLEM-VAR-ISA-CONSTRAINTS-WRT-CNFS", 2, 1, false );
    SubLFiles.declareFunction( me, "skolem_var_genl_constraints_wrt_cnfs", "SKOLEM-VAR-GENL-CONSTRAINTS-WRT-CNFS", 2, 1, false );
    SubLFiles.declareFunction( me, "skolem_arg_isa_constraints", "SKOLEM-ARG-ISA-CONSTRAINTS", 2, 1, false );
    SubLFiles.declareFunction( me, "install_skolem_arg_types", "INSTALL-SKOLEM-ARG-TYPES", 0, 2, false );
    SubLFiles.declareFunction( me, "cnf_fn_argn_isa", "CNF-FN-ARGN-ISA", 3, 1, false );
    SubLFiles.declareFunction( me, "cnf_fn_argn_var", "CNF-FN-ARGN-VAR", 3, 0, false );
    SubLFiles.declareFunction( me, "interpolate_arg_type", "INTERPOLATE-ARG-TYPE", 1, 1, false );
    SubLFiles.declareFunction( me, "max_skolem_arity", "MAX-SKOLEM-ARITY", 0, 0, false );
    SubLFiles.declareFunction( me, "skolems_of_arity", "SKOLEMS-OF-ARITY", 0, 1, false );
    SubLFiles.declareFunction( me, "skolem_hosedP", "SKOLEM-HOSED?", 1, 0, false );
    SubLFiles.declareFunction( me, "skolem_ill_formedP", "SKOLEM-ILL-FORMED?", 1, 0, false );
    SubLFiles.declareFunction( me, "skolem_rule_hosedP", "SKOLEM-RULE-HOSED?", 2, 0, false );
    SubLFiles.declareFunction( me, "all_hosed_skolems", "ALL-HOSED-SKOLEMS", 0, 0, false );
    SubLFiles.declareFunction( me, "multi_skolem_skolems", "MULTI-SKOLEM-SKOLEMS", 0, 0, false );
    SubLFiles.declareFunction( me, "misindexed_skolem_keys", "MISINDEXED-SKOLEM-KEYS", 0, 1, false );
    SubLFiles.declareFunction( me, "sk_defns_wXo_sk_constants", "SK-DEFNS-W/O-SK-CONSTANTS", 0, 1, false );
    SubLFiles.declareFunction( me, "sk_keys_wXo_sk_defns", "SK-KEYS-W/O-SK-DEFNS", 0, 1, false );
    SubLFiles.declareFunction( me, "install_skolemfunction_fn_in_skolem_defns", "INSTALL-SKOLEMFUNCTION-FN-IN-SKOLEM-DEFNS", 0, 2, false );
    SubLFiles.declareFunction( me, "sk_defns_wXo_mts", "SK-DEFNS-W/O-MTS", 0, 1, false );
    SubLFiles.declareFunction( me, "skolem_wffP", "SKOLEM-WFF?", 1, 0, false );
    SubLFiles.declareFunction( me, "skolem_not_wffP", "SKOLEM-NOT-WFF?", 1, 0, false );
    SubLFiles.declareFunction( me, "why_skolem_not_wff", "WHY-SKOLEM-NOT-WFF", 1, 0, false );
    SubLFiles.declareFunction( me, "skolem_defn_wffP", "SKOLEM-DEFN-WFF?", 1, 0, false );
    SubLFiles.declareFunction( me, "skolem_defn_not_wffP", "SKOLEM-DEFN-NOT-WFF?", 1, 0, false );
    SubLFiles.declareFunction( me, "why_skolem_defn_not_wff", "WHY-SKOLEM-DEFN-NOT-WFF", 1, 0, false );
    SubLFiles.declareFunction( me, "skolem_all_goodP", "SKOLEM-ALL-GOOD?", 1, 0, false );
    SubLFiles.declareFunction( me, "skolem_function_skolem_assertion_goodP", "SKOLEM-FUNCTION-SKOLEM-ASSERTION-GOOD?", 1, 0, false );
    SubLFiles.declareFunction( me, "skolem_functions_with_bad_skolem_assertions", "SKOLEM-FUNCTIONS-WITH-BAD-SKOLEM-ASSERTIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "diagnose_all_skolems", "DIAGNOSE-ALL-SKOLEMS", 0, 0, false );
    SubLFiles.declareFunction( me, "diagnose_skolems", "DIAGNOSE-SKOLEMS", 1, 1, false );
    SubLFiles.declareFunction( me, "diagnose_skolem", "DIAGNOSE-SKOLEM", 1, 0, false );
    SubLFiles.declareFunction( me, "diagnose_just_this_skolem_internal", "DIAGNOSE-JUST-THIS-SKOLEM-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "diagnose_just_this_skolem", "DIAGNOSE-JUST-THIS-SKOLEM", 1, 0, false );
    SubLFiles.declareFunction( me, "recanonicalize_skolem_defn_assertions", "RECANONICALIZE-SKOLEM-DEFN-ASSERTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "skolem_safe_to_recanonicalize_at_elP", "SKOLEM-SAFE-TO-RECANONICALIZE-AT-EL?", 1, 0, false );
    SubLFiles.declareFunction( me, "compute_target_consequent_literal_count", "COMPUTE-TARGET-CONSEQUENT-LITERAL-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "conjunction_of_literalsP", "CONJUNCTION-OF-LITERALS?", 1, 0, false );
    SubLFiles.declareFunction( me, "modernize_skolem_axiom_table", "MODERNIZE-SKOLEM-AXIOM-TABLE", 0, 0, false );
    SubLFiles.declareFunction( me, "possibly_modernize_unreified_sk_term", "POSSIBLY-MODERNIZE-UNREIFIED-SK-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "skolems_with_mismatched_unreified_sk_terms", "SKOLEMS-WITH-MISMATCHED-UNREIFIED-SK-TERMS", 0, 0, false );
    SubLFiles.declareFunction( me, "skolem_unreified_sk_terms_matchP", "SKOLEM-UNREIFIED-SK-TERMS-MATCH?", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_nrepair_skolems_with_duplicate_vars", "POSSIBLY-NREPAIR-SKOLEMS-WITH-DUPLICATE-VARS", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_nrepair_skolem_with_duplicate_vars", "POSSIBLY-NREPAIR-SKOLEM-WITH-DUPLICATE-VARS", 1, 0, false );
    SubLFiles.declareFunction( me, "nrepair_skolem_with_duplicate_vars", "NREPAIR-SKOLEM-WITH-DUPLICATE-VARS", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_nrepair_skolems_with_malformed_numbers", "POSSIBLY-NREPAIR-SKOLEMS-WITH-MALFORMED-NUMBERS", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_nrepair_skolem_with_malformed_numbers", "POSSIBLY-NREPAIR-SKOLEM-WITH-MALFORMED-NUMBERS", 1, 0, false );
    SubLFiles.declareFunction( me, "nrepair_skolem_with_malformed_numbers", "NREPAIR-SKOLEM-WITH-MALFORMED-NUMBERS", 1, 0, false );
    SubLFiles.declareFunction( me, "tmi_skolemP", "TMI-SKOLEM?", 1, 0, false );
    SubLFiles.declareFunction( me, "recanonicalize_tmi_skolems", "RECANONICALIZE-TMI-SKOLEMS", 1, 0, false );
    SubLFiles.declareFunction( me, "recanonicalize_tmi_skolem", "RECANONICALIZE-TMI-SKOLEM", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_rehabilitate_skolem_defn_table", "POSSIBLY-REHABILITATE-SKOLEM-DEFN-TABLE", 0, 0, false );
    SubLFiles.declareFunction( me, "skolems_that_are_unfindable_via_el", "SKOLEMS-THAT-ARE-UNFINDABLE-VIA-EL", 0, 0, false );
    SubLFiles.declareFunction( me, "skolem_unfindable_via_elP", "SKOLEM-UNFINDABLE-VIA-EL?", 1, 0, false );
    SubLFiles.declareFunction( me, "bad_skolem_assertions", "BAD-SKOLEM-ASSERTIONS", 0, 1, false );
    return NIL;
  }

  public static SubLObject init_skolems_file()
  {
    $skolem_arg_sort$ = SubLFiles.defparameter( "*SKOLEM-ARG-SORT*", NIL );
    $formula_constant_str_caching_state$ = SubLFiles.deflexical( "*FORMULA-CONSTANT-STR-CACHING-STATE*", NIL );
    $recompute_skolem_defn_info$ = SubLFiles.defparameter( "*RECOMPUTE-SKOLEM-DEFN-INFO*", NIL );
    $skolems_with_known_issues$ = SubLFiles.deflexical( "*SKOLEMS-WITH-KNOWN-ISSUES*", $list111 );
    $skolems_safe_to_recanonicalize_at_el$ = SubLFiles.deflexical( "*SKOLEMS-SAFE-TO-RECANONICALIZE-AT-EL*", $list112 );
    $target_consequent_literal_count$ = SubLFiles.defparameter( "*TARGET-CONSEQUENT-LITERAL-COUNT*", $kw123$UNINITIALIZED );
    $skolems_known_to_be_unfindable_via_el$ = SubLFiles.deflexical( "*SKOLEMS-KNOWN-TO-BE-UNFINDABLE-VIA-EL*", $list157 );
    return NIL;
  }

  public static SubLObject setup_skolems_file()
  {
    memoization_state.note_globally_cached_function( $sym24$FORMULA_CONSTANT_STR );
    memoization_state.note_memoized_function( $sym114$DIAGNOSE_JUST_THIS_SKOLEM );
    return NIL;
  }

  private static SubLObject _constant_112_initializer()
  {
    return ConsesLow.list( new SubLObject[] { constant_handles.reader_make_constant_shell( makeString( "SKF-16971619" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-9662286" ) ), constant_handles
        .reader_make_constant_shell( makeString( "SKF-45878693" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-27834981" ) ), constant_handles.reader_make_constant_shell( makeString(
            "SKF-12369461" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-10688698" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-45547787" ) ), constant_handles
                .reader_make_constant_shell( makeString( "SKF-31789746" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-26692934" ) ), constant_handles.reader_make_constant_shell( makeString(
                    "SKF-48466118" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-60531811" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-29624762" ) ), constant_handles
                        .reader_make_constant_shell( makeString( "SKF-22643466" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-29472649" ) ), constant_handles.reader_make_constant_shell( makeString(
                            "SKF-6535610808" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-6391880459" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-6069753105" ) ),
      constant_handles.reader_make_constant_shell( makeString( "SKF-1836062444" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-1140288587" ) ), constant_handles.reader_make_constant_shell( makeString(
          "SKF-0975510193" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-0417114039" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-2399775374" ) ), constant_handles
              .reader_make_constant_shell( makeString( "SKF-9741300383" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-0828551493" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "SKF-2588418129" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-1857929740" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-9771221235" ) ), constant_handles
                      .reader_make_constant_shell( makeString( "SKF-5248881133" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-30037247" ) ), constant_handles.reader_make_constant_shell( makeString(
                          "SKF-60060919" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-10786079" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-14077376" ) ), constant_handles
                              .reader_make_constant_shell( makeString( "SKF-55914574" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-16648407" ) ), constant_handles.reader_make_constant_shell(
                                  makeString( "SKF-44601733" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-7913899905" ) ), constant_handles.reader_make_constant_shell( makeString(
                                      "SKF-4396958760" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-8020199718" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-20333" ) ),
      constant_handles.reader_make_constant_shell( makeString( "SKF-3701677947" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-2758282998" ) ), constant_handles.reader_make_constant_shell( makeString(
          "SKF-32592026" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-15476867" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-11623545" ) ), constant_handles
              .reader_make_constant_shell( makeString( "SKF-39071040" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-22133371" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "SKF-49114437" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-6397777" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-27545347" ) ), constant_handles
                      .reader_make_constant_shell( makeString( "SKF-44682034" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-55141454" ) ), constant_handles.reader_make_constant_shell( makeString(
                          "SKF-29896988" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-42443574" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-13447977" ) ), constant_handles
                              .reader_make_constant_shell( makeString( "SKF-30519480" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-62227276" ) ), constant_handles.reader_make_constant_shell(
                                  makeString( "SKF-17408839" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-58430677" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-59662976" ) ),
      constant_handles.reader_make_constant_shell( makeString( "SKF-12620975" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-9433064" ) ), constant_handles.reader_make_constant_shell( makeString(
          "SKF-9205245" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-DepictedGroupMember" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-19625320" ) ), constant_handles
              .reader_make_constant_shell( makeString( "SKF-3784346661" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-6544284149" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "SKF-0614825063" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-0016213450" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-22649603" ) ), constant_handles
                      .reader_make_constant_shell( makeString( "SKF-4118636" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-19878232" ) ), constant_handles.reader_make_constant_shell( makeString(
                          "SKF-15013378" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-65815517" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-56452378" ) ), constant_handles
                              .reader_make_constant_shell( makeString( "SKF-49139121" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-12749049" ) ), constant_handles.reader_make_constant_shell(
                                  makeString( "SKF-2910558946" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-2910558946" ) ), constant_handles.reader_make_constant_shell( makeString(
                                      "SKF-8609688279" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-3254220233" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-4116454483" ) ),
      constant_handles.reader_make_constant_shell( makeString( "SKF-9882206036" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-7876960574" ) ), constant_handles.reader_make_constant_shell( makeString(
          "SKF-7849157406" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-0013694801" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-3786700124" ) ), constant_handles
              .reader_make_constant_shell( makeString( "SKF-1714230847" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-7566265665" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "SKF-8055872557" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-6624619390" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-4749393956" ) ), constant_handles
                      .reader_make_constant_shell( makeString( "SKF-9902000475" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-2176445673" ) ), constant_handles.reader_make_constant_shell( makeString(
                          "SKF-9582976901" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-62641426" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-37581079" ) ), constant_handles
                              .reader_make_constant_shell( makeString( "SKF-9780389" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-51938893" ) ), constant_handles.reader_make_constant_shell(
                                  makeString( "SKF-33012437" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-9412760" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-22314298" ) ),
      constant_handles.reader_make_constant_shell( makeString( "SKF-52903378" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-59517423" ) ), constant_handles.reader_make_constant_shell( makeString(
          "SKF-24705784" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-22566254" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-35236481" ) ), constant_handles
              .reader_make_constant_shell( makeString( "SKF-26725746" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-55356852" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "SKF-3634339" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-65815517" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-56452378" ) ), constant_handles
                      .reader_make_constant_shell( makeString( "SKF-49139121" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-12749049" ) ), constant_handles.reader_make_constant_shell( makeString(
                          "SKF-4408119749" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-3789312666" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-0283155048" ) ),
      constant_handles.reader_make_constant_shell( makeString( "SKF-9294061441" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-4876245588" ) ), constant_handles.reader_make_constant_shell( makeString(
          "SKF-2809645919" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-1124554131" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-0220610914" ) ), constant_handles
              .reader_make_constant_shell( makeString( "SKF-4790221775" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-1168015263" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "SKF-4318796173" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-1828131226" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-2199671088" ) ), constant_handles
                      .reader_make_constant_shell( makeString( "SKF-9895165404" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-6604522774" ) ), constant_handles.reader_make_constant_shell( makeString(
                          "SKF-6086634185" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-0428133650" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-7899934995" ) ),
      constant_handles.reader_make_constant_shell( makeString( "SKF-0860923384" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-4146570201" ) ), constant_handles.reader_make_constant_shell( makeString(
          "SKF-0406242321" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-4468030352" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-8519691249" ) ), constant_handles
              .reader_make_constant_shell( makeString( "SKF-6471415053" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-6816884555" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "SKF-2207590761" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-4785728462" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-6959780810" ) ), constant_handles
                      .reader_make_constant_shell( makeString( "SKF-2698165023" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-1592332182" ) ), constant_handles.reader_make_constant_shell( makeString(
                          "SKF-9127604959" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-3352641286" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-9726105841" ) ),
      constant_handles.reader_make_constant_shell( makeString( "SKF-0624682876" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-9673514545" ) ), constant_handles.reader_make_constant_shell( makeString(
          "SKF-1902545429" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-6876074534" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-8288491486" ) ), constant_handles
              .reader_make_constant_shell( makeString( "SKF-4637358284" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-0635199939" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "SKF-4292973565" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-7798353664" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-34523039" ) ), constant_handles
                      .reader_make_constant_shell( makeString( "SKF-33538847" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-58036047" ) ), constant_handles.reader_make_constant_shell( makeString(
                          "SKF-9708075" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-13094314" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-27004431" ) ), constant_handles
                              .reader_make_constant_shell( makeString( "SKF-47290403" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-49713991" ) ), constant_handles.reader_make_constant_shell(
                                  makeString( "SKF-40178904" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-62659908" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-61484227" ) ),
      constant_handles.reader_make_constant_shell( makeString( "SKF-35458681" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-17599345" ) ), constant_handles.reader_make_constant_shell( makeString(
          "SKF-53668837" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-24102297" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-32709431" ) ), constant_handles
              .reader_make_constant_shell( makeString( "SKF-51752162" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-35359227" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "SKF-20847759" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-51781280" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-51473172" ) ), constant_handles
                      .reader_make_constant_shell( makeString( "SKF-36777684" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-27183984" ) ), constant_handles.reader_make_constant_shell( makeString(
                          "SKF-24538299" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-51270566" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-6498804" ) ), constant_handles
                              .reader_make_constant_shell( makeString( "SKF-52375281" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-59156909" ) ), constant_handles.reader_make_constant_shell(
                                  makeString( "SKF-59507392" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-21555986" ) ), constant_handles.reader_make_constant_shell( makeString(
                                      "SKF-0925186357" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-6223276020" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-5400448981" ) ),
      constant_handles.reader_make_constant_shell( makeString( "SKF-0033649819" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-8779626658" ) ), constant_handles.reader_make_constant_shell( makeString(
          "SKF-2650598318" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-1317366451" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-5713244721" ) ), constant_handles
              .reader_make_constant_shell( makeString( "SKF-5494021688" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-50021281" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "SKF-52700384" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-27017330" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-6926447" ) ), constant_handles
                      .reader_make_constant_shell( makeString( "SKF-57742011" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-32797409" ) ), constant_handles.reader_make_constant_shell( makeString(
                          "SKF-36775099" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-8803460" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-11685259" ) ), constant_handles
                              .reader_make_constant_shell( makeString( "SKF-49596986" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-1515868" ) ), constant_handles.reader_make_constant_shell(
                                  makeString( "SKF-12425256" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-26526786" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-757265" ) ),
      constant_handles.reader_make_constant_shell( makeString( "SKF-66361621" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-50135687" ) ), constant_handles.reader_make_constant_shell( makeString(
          "SKF-28256974" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-52059331" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-60879947" ) ), constant_handles
              .reader_make_constant_shell( makeString( "SKF-10095100" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-20576203" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "SKF-49828332" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-44916076" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-63714570" ) ), constant_handles
                      .reader_make_constant_shell( makeString( "SKF-3886762" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-14991605" ) ), constant_handles.reader_make_constant_shell( makeString(
                          "SKF-35022890" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-9692584" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-56789029" ) ), constant_handles
                              .reader_make_constant_shell( makeString( "SKF-63331999" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-60839916" ) ), constant_handles.reader_make_constant_shell(
                                  makeString( "SKF-11805601" ) ), constant_handles.reader_make_constant_shell( makeString( "MarriedCoupleFn" ) ), constant_handles.reader_make_constant_shell( makeString(
                                      "SKF-54717125" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-47103024" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-32504795" ) ),
      constant_handles.reader_make_constant_shell( makeString( "SKF-50991035" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-54893967" ) ), constant_handles.reader_make_constant_shell( makeString(
          "SKF-4588740" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-34044423" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-23158350" ) ), constant_handles
              .reader_make_constant_shell( makeString( "SKF-26216492" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-23792367" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "SKF-26655735" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-36384184" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-28223401" ) ), constant_handles
                      .reader_make_constant_shell( makeString( "SKF-30705866" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-31089449" ) ), constant_handles.reader_make_constant_shell( makeString(
                          "SKF-43795517" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-54692934" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-62874373" ) ), constant_handles
                              .reader_make_constant_shell( makeString( "SKF-13198899" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-6598020" ) ), constant_handles.reader_make_constant_shell(
                                  makeString( "SKF-66712623" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-61590093" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-4298210" ) ),
      constant_handles.reader_make_constant_shell( makeString( "SKF-13358052" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-1077450" ) ), constant_handles.reader_make_constant_shell( makeString(
          "SKF-27216176" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-28083191" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-539243" ) ), constant_handles
              .reader_make_constant_shell( makeString( "SKF-14104209" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-6066610" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "SKF-14779626" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-1007216" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-49463821" ) ), constant_handles
                      .reader_make_constant_shell( makeString( "SKF-764714" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-59277817" ) ), constant_handles.reader_make_constant_shell( makeString(
                          "SKF-24473185" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-22799176" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-13378825" ) ), constant_handles
                              .reader_make_constant_shell( makeString( "SKF-8692086" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-59150515" ) ), constant_handles.reader_make_constant_shell(
                                  makeString( "SKF-6649426" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-18423567" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-61014428" ) ),
      constant_handles.reader_make_constant_shell( makeString( "SKF-612301" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-390407" ) ), constant_handles.reader_make_constant_shell( makeString(
          "SKF-469762" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-57350382" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-550621" ) ), constant_handles
              .reader_make_constant_shell( makeString( "SKF-41449368" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-20918103" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "SKF-447007" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-1383963" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-348190" ) ), constant_handles
                      .reader_make_constant_shell( makeString( "SKF-693803" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-133452" ) ), constant_handles.reader_make_constant_shell( makeString(
                          "SKF-2813385" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-31097107" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-57888" ) ), constant_handles
                              .reader_make_constant_shell( makeString( "SKF-10895131" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-13225721" ) ), constant_handles.reader_make_constant_shell(
                                  makeString( "SKF-43450038" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-21119958" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-47744038" ) ),
      constant_handles.reader_make_constant_shell( makeString( "SKF-466900" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-46555292" ) ), constant_handles.reader_make_constant_shell( makeString(
          "SKF-23253528" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-924570" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-BandMemPlaying" ) ), constant_handles
              .reader_make_constant_shell( makeString( "SKF-48376054" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-121716" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "SKF-7364934" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-14760742" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-17172575" ) ), constant_handles
                      .reader_make_constant_shell( makeString( "SKF-23584353" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-53200158" ) ), constant_handles.reader_make_constant_shell( makeString(
                          "SKF-48653451" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-55897365" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-52891476" ) ), constant_handles
                              .reader_make_constant_shell( makeString( "SKF-33105457" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-10518089" ) ), constant_handles.reader_make_constant_shell(
                                  makeString( "SKF-33158362" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-66304485" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-810295" ) ),
      constant_handles.reader_make_constant_shell( makeString( "SKF-968219" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-9855449" ) ), constant_handles.reader_make_constant_shell( makeString(
          "SKF-51029398" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-9874778" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-14008069" ) ), constant_handles
              .reader_make_constant_shell( makeString( "SKF-197207" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-9176578" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "SKF-62825" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-476059" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-366078" ) ), constant_handles
                      .reader_make_constant_shell( makeString( "SKF-17345463" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-51339287" ) ), constant_handles.reader_make_constant_shell( makeString(
                          "SKF-1046930" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-828757" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-51633710" ) ), constant_handles
                              .reader_make_constant_shell( makeString( "SKF-19769806" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-46906520" ) ), constant_handles.reader_make_constant_shell(
                                  makeString( "SKF-20309046" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-7477821" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-21294579" ) ),
      constant_handles.reader_make_constant_shell( makeString( "SKF-17746" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-42407080" ) ), constant_handles.reader_make_constant_shell( makeString(
          "SKF-32539269" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-17651656" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-49636199" ) ), constant_handles
              .reader_make_constant_shell( makeString( "SKF-63665039" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-923916" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "SKF-41511095" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-402998" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-1827166" ) ), constant_handles
                      .reader_make_constant_shell( makeString( "SKF-25558723" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-92235" ) ), constant_handles.reader_make_constant_shell( makeString(
                          "SKF-24405989" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-37741853" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-681210" ) ), constant_handles
                              .reader_make_constant_shell( makeString( "SKF-16612795" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-55392675" ) ), constant_handles.reader_make_constant_shell(
                                  makeString( "SKF-41395088" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-427687" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-46187940" ) ),
      constant_handles.reader_make_constant_shell( makeString( "SKF-18860364" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-846216" ) ), constant_handles.reader_make_constant_shell( makeString(
          "SKF-5393361" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-12316220" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-54217404" ) ), constant_handles
              .reader_make_constant_shell( makeString( "SKF-5169399" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-920133" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "SKF-3247485" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-2269494" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-13038949" ) ), constant_handles
                      .reader_make_constant_shell( makeString( "SKF-28759634" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-17122972" ) ), constant_handles.reader_make_constant_shell( makeString(
                          "SKF-953550" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-906137" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-14962533" ) ), constant_handles
                              .reader_make_constant_shell( makeString( "SKF-8254998" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-46599863" ) ), constant_handles.reader_make_constant_shell(
                                  makeString( "SKF-36778441" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-45777401" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-45356858" ) ),
      constant_handles.reader_make_constant_shell( makeString( "SKF-28542904" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-33462840" ) ), constant_handles.reader_make_constant_shell( makeString(
          "SKF-18834377" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-23165858" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-171447" ) ), constant_handles
              .reader_make_constant_shell( makeString( "SKF-38743072" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-62752838" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "SKF-46799967" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-38741805" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-22034341" ) ), constant_handles
                      .reader_make_constant_shell( makeString( "SKF-49949893" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-750835" ) ), constant_handles.reader_make_constant_shell( makeString(
                          "SKF-27330810" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-61593935" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-29534329" ) ), constant_handles
                              .reader_make_constant_shell( makeString( "SKF-8780298" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-10230735" ) ), constant_handles.reader_make_constant_shell(
                                  makeString( "SKF-28051850" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-15346572" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-38351646" ) ),
      constant_handles.reader_make_constant_shell( makeString( "SKF-54477051" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-58577410" ) ), constant_handles.reader_make_constant_shell( makeString(
          "SKF-41179398" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-9098087" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-464896" ) ), constant_handles
              .reader_make_constant_shell( makeString( "SKF-13765056" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-54796118" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "SKF-892012" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-5733810632" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-9732365118" ) ), constant_handles
                      .reader_make_constant_shell( makeString( "SKF-8062776921" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-9356282252" ) ), constant_handles.reader_make_constant_shell( makeString(
                          "SKF-7770326773" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-9303451156" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-7682359700" ) ),
      constant_handles.reader_make_constant_shell( makeString( "SKF-0472592080" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-5868767078" ) ), constant_handles.reader_make_constant_shell( makeString(
          "SKF-6969827182" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-8235654414" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-9268693067" ) ), constant_handles
              .reader_make_constant_shell( makeString( "SKF-4188164665" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-3268848892" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "SKF-3954038304" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-8411301306" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-6870027660" ) ), constant_handles
                      .reader_make_constant_shell( makeString( "SKF-2200319382" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-8663443543" ) ), constant_handles.reader_make_constant_shell( makeString(
                          "SKF-6270260084" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-7428624994" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-6367907452" ) ),
      constant_handles.reader_make_constant_shell( makeString( "SKF-7752915649" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-4786775108" ) ), constant_handles.reader_make_constant_shell( makeString(
          "SKF-5640043419" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-6071218505" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-3183844767" ) ), constant_handles
              .reader_make_constant_shell( makeString( "SKF-7356970316" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-4272845489" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "SKF-5224425512" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-3795912959" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-7714022869" ) ), constant_handles
                      .reader_make_constant_shell( makeString( "SKF-8565886278" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-0519624184" ) ), constant_handles.reader_make_constant_shell( makeString(
                          "SKF-4286299680" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-3516286017" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-8782865500" ) ),
      constant_handles.reader_make_constant_shell( makeString( "SKF-4515155650" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-5391096127" ) ), constant_handles.reader_make_constant_shell( makeString(
          "SKF-8826617065" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-6950497514" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-4751258604" ) ), constant_handles
              .reader_make_constant_shell( makeString( "SKF-3616130689" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-7131788917" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "SKF-4848573733" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-2401054776" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-0985467323" ) )
    } );
  }

  @Override
  public void declareFunctions()
  {
    declare_skolems_file();
  }

  @Override
  public void initializeVariables()
  {
    init_skolems_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_skolems_file();
  }
  static
  {
    me = new skolems();
    $skolem_arg_sort$ = null;
    $formula_constant_str_caching_state$ = null;
    $recompute_skolem_defn_info$ = null;
    $skolems_with_known_issues$ = null;
    $skolems_safe_to_recanonicalize_at_el$ = null;
    $target_consequent_literal_count$ = null;
    $skolems_known_to_be_unfindable_via_el$ = null;
    $list0 = ConsesLow.list( makeSymbol( "UNREIFIED-SK-TERM" ), makeSymbol( "SKOLEM-TERM" ) );
    $const1$termOfUnit = constant_handles.reader_make_constant_shell( makeString( "termOfUnit" ) );
    $list2 = ConsesLow.list( makeSymbol( "NEG-LITS" ), makeSymbol( "POS-LITS" ) );
    $const3$SkolemFunctionFn = constant_handles.reader_make_constant_shell( makeString( "SkolemFunctionFn" ) );
    $const4$SkolemFunction = constant_handles.reader_make_constant_shell( makeString( "SkolemFunction" ) );
    $const5$SkolemFuncN = constant_handles.reader_make_constant_shell( makeString( "SkolemFuncN" ) );
    $const6$SkolemFuncNFn = constant_handles.reader_make_constant_shell( makeString( "SkolemFuncNFn" ) );
    $str7$unreified_skolem_term_references_ = makeString( "unreified-skolem-term references unknown skolem type: ~s" );
    $sym8$CAR = makeSymbol( "CAR" );
    $sym9$_ = makeSymbol( "<" );
    $sym10$CDR = makeSymbol( "CDR" );
    $str11$skolem_args____s_vs__s = makeString( "skolem-args : ~s vs ~s" );
    $sym12$CLAUSE_FREE_SEQUENCE_VARIABLES = makeSymbol( "CLAUSE-FREE-SEQUENCE-VARIABLES" );
    $sym13$CLAUSE_FREE_TERM_VARIABLES = makeSymbol( "CLAUSE-FREE-TERM-VARIABLES" );
    $kw14$TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE = makeKeyword( "TOO-MANY-SEQUENCE-VARS-IN-SKOLEM-SCOPE" );
    $sym15$EL_VAR_ = makeSymbol( "EL-VAR?" );
    $sym16$UNREIFIED_SKOLEM_TERM_ = makeSymbol( "UNREIFIED-SKOLEM-TERM?" );
    $sym17$SKOLEM_FUNCTION_VAR = makeSymbol( "SKOLEM-FUNCTION-VAR" );
    $list18 = ConsesLow.list( makeSymbol( "OLD-SK-CONSTANT" ), makeSymbol( "OLD-UNREIFIED-SK-TERM" ), makeSymbol( "SK-MT" ), makeSymbol( "OLD-DEFN" ) );
    $const19$VariableAritySkolemFuncN = constant_handles.reader_make_constant_shell( makeString( "VariableAritySkolemFuncN" ) );
    $const20$FixedAritySkolemFuncN = constant_handles.reader_make_constant_shell( makeString( "FixedAritySkolemFuncN" ) );
    $const21$VariableAritySkolemFunction = constant_handles.reader_make_constant_shell( makeString( "VariableAritySkolemFunction" ) );
    $const22$FixedAritySkolemFunction = constant_handles.reader_make_constant_shell( makeString( "FixedAritySkolemFunction" ) );
    $sym23$STRING_ = makeSymbol( "STRING<" );
    $sym24$FORMULA_CONSTANT_STR = makeSymbol( "FORMULA-CONSTANT-STR" );
    $kw25$EL_VAR = makeKeyword( "EL-VAR" );
    $sym26$CYC_VAR_EXCEPT_FOR_X_0_ = makeSymbol( "CYC-VAR-EXCEPT-FOR-X-0?" );
    $sym27$_FORMULA_CONSTANT_STR_CACHING_STATE_ = makeSymbol( "*FORMULA-CONSTANT-STR-CACHING-STATE*" );
    $int28$512 = makeInteger( 512 );
    $int29$64 = makeInteger( 64 );
    $sym30$_X_0 = makeSymbol( "?X-0" );
    $kw31$MAPPING_DONE = makeKeyword( "MAPPING-DONE" );
    $list32 = ConsesLow.list( makeSymbol( "SKOLEM-TYPE" ), makeSymbol( "VARS" ), makeSymbol( "SK-VAR" ), makeSymbol( "SEQVAR-OR-NUMBER" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "NUMBER" ) );
    $str33$Multiple_skolem_sequence_variable = makeString( "Multiple skolem sequence variables: ~a ~a ~a" );
    $str34$SkolemFuncN_appears_as_SkolemFunc = makeString( "SkolemFuncN appears as SkolemFunction: ~a" );
    $sym35$_X = makeSymbol( "?X" );
    $list36 = ConsesLow.list( makeSymbol( "SK-CONSTANT" ), makeSymbol( "UNREIFIED-SK-TERM" ), makeSymbol( "MT" ), makeSymbol( "CNFS" ) );
    $sym37$FALSE = makeSymbol( "FALSE" );
    $kw38$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym39$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $sym40$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const41$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $const42$skolem = constant_handles.reader_make_constant_shell( makeString( "skolem" ) );
    $sym43$ASSERTION_IST_FORMULA = makeSymbol( "ASSERTION-IST-FORMULA" );
    $sym44$SKOLEM_FUNCTION_P = makeSymbol( "SKOLEM-FUNCTION-P" );
    $sym45$RELEVANT_MT_IS_GENL_MT = makeSymbol( "RELEVANT-MT-IS-GENL-MT" );
    $sym46$OPAQUE_ARG_WRT_EL_TEMPLATE_ = makeSymbol( "OPAQUE-ARG-WRT-EL-TEMPLATE?" );
    $str47$_in_gaf_has_corresponding_cnf_in_ = makeString( "[in gaf-has-corresponding-cnf-in-skolem-defn?] skolem ~s is not a skolem constant" );
    $const48$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $sym49$REIFIED_SKOLEM_FN_ = makeSymbol( "REIFIED-SKOLEM-FN?" );
    $sym50$SENTENCE_ARG0 = makeSymbol( "SENTENCE-ARG0" );
    $sym51$DEDUCTION_ASSERTION = makeSymbol( "DEDUCTION-ASSERTION" );
    $sym52$ASSERTION_FORMULA = makeSymbol( "ASSERTION-FORMULA" );
    $sym53$REIFIED_SKOLEM_FN_IN_ANY_MT_ = makeSymbol( "REIFIED-SKOLEM-FN-IN-ANY-MT?" );
    $str54$recomputing_skolem_defn_info_cons = makeString( "recomputing-skolem-defn-info-constant called when not recomputing a skolem defn" );
    $str55$recomputing_skolem_defn_info_var_ = makeString( "recomputing-skolem-defn-info-var called when not recomputing a skolem defn" );
    $str56$really_recomputing_skolem_defn__c = makeString( "really-recomputing-skolem-defn? called when not recomputing a skolem defn" );
    $str57$recomputing_skolem_defn_info_defn = makeString( "recomputing-skolem-defn-info-defn called when not recomputing a skolem defn" );
    $str58$recomputing_skolem_defn_info_key_ = makeString( "recomputing-skolem-defn-info-key called when not recomputing a skolem defn" );
    $str59$recomputing_skolem_defn_info_blis = makeString( "recomputing-skolem-defn-info-blist called when not recomputing a skolem defn" );
    $str60$set_recomputing_skolem_defn_resul = makeString( "set-recomputing-skolem-defn-result called when not recomputing a skolem defn" );
    $str61$set_recomputing_skolem_defn_blist = makeString( "set-recomputing-skolem-defn-blist called when not recomputing a skolem defn" );
    $kw62$GAF = makeKeyword( "GAF" );
    $str63$note_skolem_binding_called_when_n = makeString( "note-skolem-binding called when not recomputing a skolem defn" );
    $str64$Total_KB_Skolems___a = makeString( "Total KB Skolems: ~a" );
    $str65$building_skolem_defn_table = makeString( "building skolem defn table" );
    $str66$cdolist = makeString( "cdolist" );
    $sym67$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ = makeSymbol( "*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*" );
    $list68 = ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*" ), NIL );
    $sym69$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $sym70$CSETQ = makeSymbol( "CSETQ" );
    $str71$_A = makeString( "~A" );
    $str72$____reified_skolem__a_not_known_t = makeString( "~%~%reified skolem ~a not known to be an instance of #$SkolemFunction" );
    $str73$No_skolem_defn_assertions_for___S = makeString( "No skolem defn assertions for: ~S" );
    $const74$IntervalMinFn = constant_handles.reader_make_constant_shell( makeString( "IntervalMinFn" ) );
    $const75$IntervalMaxFn = constant_handles.reader_make_constant_shell( makeString( "IntervalMaxFn" ) );
    $const76$ScalarInterval = constant_handles.reader_make_constant_shell( makeString( "ScalarInterval" ) );
    $kw77$UNNAMED_SKOLEM_FN = makeKeyword( "UNNAMED-SKOLEM-FN" );
    $str78$__disjoint_result_types___s____s = makeString( "~%disjoint result types: ~s : ~s" );
    $str79$__explicit_result_types___s____s = makeString( "~%explicit result types: ~s : ~s" );
    $str80$__tacit_result_isa___s____s = makeString( "~%tacit result isa: ~s : ~s" );
    $str81$__no_result_types___s = makeString( "~%no result types: ~s" );
    $str82$__tacit_result_genl___s____s = makeString( "~%tacit result genl: ~s : ~s" );
    $const83$CycLReifiableDenotationalTerm = constant_handles.reader_make_constant_shell( makeString( "CycLReifiableDenotationalTerm" ) );
    $list84 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "NonNegativeScalarInterval" ) ) );
    $str85$mapping_skolem_defn_table = makeString( "mapping skolem defn table" );
    $list86 = ConsesLow.list( makeSymbol( "SKOLEM" ), makeSymbol( "UNREIFIED-SK-TERM" ), makeSymbol( "MT" ), makeSymbol( "CNFS" ) );
    $str87$__tacit_arg__s_type___s____s = makeString( "~%tacit arg ~s type: ~s : ~s" );
    $str88$__no_arg__s_type___s____s = makeString( "~%no arg ~s type: ~s : ~s" );
    $str89$mapping_skolem_axiom_table = makeString( "mapping skolem axiom table" );
    $list90 = ConsesLow.list( makeSymbol( "CONSTANT" ), makeSymbol( "LISPY" ), makeSymbol( "MT" ), makeSymbol( "CNFS" ) );
    $sym91$CYC_CONST_GENERAL_EXISTENTIAL_OPERATOR_P = makeSymbol( "CYC-CONST-GENERAL-EXISTENTIAL-OPERATOR-P" );
    $str92$fixing_skolems_w_o_mts = makeString( "fixing skolems w/o mts" );
    $list93 = ConsesLow.list( makeKeyword( "SKOLEM-DEFN-MISSING" ) );
    $kw94$SKOLEM_DEFN_NOT_LIST = makeKeyword( "SKOLEM-DEFN-NOT-LIST" );
    $kw95$SKOLEM_DEFN_MAL_LENGTH = makeKeyword( "SKOLEM-DEFN-MAL-LENGTH" );
    $list96 = ConsesLow.listS( makeSymbol( "FIRST" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "SECOND" ), makeSymbol( "THIRD" ), makeSymbol( "FOURTH" ), makeSymbol( "ORTS" ) );
    $kw97$SKOLEM_DEFN_ORTS = makeKeyword( "SKOLEM-DEFN-ORTS" );
    $kw98$SKOLEM_DEFN_MAL_SKOLEM_FORT = makeKeyword( "SKOLEM-DEFN-MAL-SKOLEM-FORT" );
    $kw99$SKOLEM_DEFN_MAL_UNREIFIED_FN_LENGTH = makeKeyword( "SKOLEM-DEFN-MAL-UNREIFIED-FN-LENGTH" );
    $list100 = ConsesLow.list( makeSymbol( "SKOLEM-FN-FUNCTION" ), makeSymbol( "ARGS" ), makeSymbol( "VAR" ), makeSymbol( "SEQVAR-OR-NUMBER" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "NUMBER" ) );
    $kw101$SKOLEM_DEFN_MAL_SKOLEM_FN_TYPE = makeKeyword( "SKOLEM-DEFN-MAL-SKOLEM-FN-TYPE" );
    $kw102$SKOLEM_DEFN_MAL_SKOLEM_FN_ARGS = makeKeyword( "SKOLEM-DEFN-MAL-SKOLEM-FN-ARGS" );
    $kw103$SKOLEM_DEFN_ARGS_W_O_NUMBER = makeKeyword( "SKOLEM-DEFN-ARGS-W/O-NUMBER" );
    $kw104$SKOLEM_DEFN_NON_VAR_ARGS = makeKeyword( "SKOLEM-DEFN-NON-VAR-ARGS" );
    $kw105$SKOLEM_DEFN_MAL_SK_VAR = makeKeyword( "SKOLEM-DEFN-MAL-SK-VAR" );
    $kw106$SKOLEM_DEFN_ARGS_SK_TYPE_NUMBER_MISMATCH = makeKeyword( "SKOLEM-DEFN-ARGS-SK-TYPE/NUMBER-MISMATCH" );
    $const107$Unity = constant_handles.reader_make_constant_shell( makeString( "Unity" ) );
    $kw108$SKOLEM_DEFN_OBSOLETE_NUMBER = makeKeyword( "SKOLEM-DEFN-OBSOLETE-NUMBER" );
    $kw109$SKOLEM_DEFN_MAL_MT = makeKeyword( "SKOLEM-DEFN-MAL-MT" );
    $list110 = ConsesLow.list( makeKeyword( "SKOLEM-DEFN-W/O-CLAUSES" ) );
    $list111 = ConsesLow.list( new SubLObject[] { constant_handles.reader_make_constant_shell( makeString( "ThePrototypicalFixedAritySkolemFunction" ) ), constant_handles.reader_make_constant_shell( makeString(
        "SKF-4855075916" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-9401565" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-30608153" ) ), constant_handles
            .reader_make_constant_shell( makeString( "SKF-358427" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-981029" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-378457" ) ),
      constant_handles.reader_make_constant_shell( makeString( "SKF-7897525238" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-23426283" ) ), constant_handles.reader_make_constant_shell( makeString(
          "SKF-4978723980" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-8095780367" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-2283707389" ) ), constant_handles
              .reader_make_constant_shell( makeString( "SKF-3819196850" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-2177078880" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "SKF-9178370244" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-2313708415" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-54808499" ) ), constant_handles
                      .reader_make_constant_shell( makeString( "SKF-2396342019" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-0540013113" ) ), constant_handles.reader_make_constant_shell( makeString(
                          "SKF-7329112212" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-2463549462" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-7267986583" ) ),
      constant_handles.reader_make_constant_shell( makeString( "SKF-2341431804" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-5635570701" ) ), constant_handles.reader_make_constant_shell( makeString(
          "SKF-8712676684" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-6439069748" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-3035846539" ) ), constant_handles
              .reader_make_constant_shell( makeString( "SKF-9609006789" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-2094656502" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "SKF-1622895730" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-6034791567" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-8429706273" ) ), constant_handles
                      .reader_make_constant_shell( makeString( "SKF-5002539315" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-7731242586" ) ), constant_handles.reader_make_constant_shell( makeString(
                          "SKF-1935351914" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-5819554541" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-7665225690" ) ),
      constant_handles.reader_make_constant_shell( makeString( "SKF-5742181768" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-7774820049" ) ), constant_handles.reader_make_constant_shell( makeString(
          "SKF-9832002172" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-9099460346" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-6802057837" ) ), constant_handles
              .reader_make_constant_shell( makeString( "SKF-0233545031" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-7143243607" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "SKF-5547792583" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-1970550724" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-2043784885" ) ), constant_handles
                      .reader_make_constant_shell( makeString( "SKF-1714183462" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-6071957396" ) ), constant_handles.reader_make_constant_shell( makeString(
                          "SKF-7004599156" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-0633671947" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-4928965872" ) ),
      constant_handles.reader_make_constant_shell( makeString( "SKF-4365040835" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-9778251013" ) ), constant_handles.reader_make_constant_shell( makeString(
          "SKF-8146092452" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-0882987459" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-6693421741" ) ), constant_handles
              .reader_make_constant_shell( makeString( "SKF-1800635573" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-5174206356" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "SKF-8137704160" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-6138620537" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-6954747722" ) ), constant_handles
                      .reader_make_constant_shell( makeString( "SKF-8822929547" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-6574888924" ) ), constant_handles.reader_make_constant_shell( makeString(
                          "SKF-4648710733" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-3574121958" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-7111033530" ) ),
      constant_handles.reader_make_constant_shell( makeString( "SKF-1259710929" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-9511328868" ) ), constant_handles.reader_make_constant_shell( makeString(
          "SKF-7988430072" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-9334424285" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-0241028856" ) ), constant_handles
              .reader_make_constant_shell( makeString( "SKF-8824048486" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-4709173148" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "SKF-9085853324" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-5615627058" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-6491665291" ) ), constant_handles
                      .reader_make_constant_shell( makeString( "SKF-0256832978" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-1494753028" ) ), constant_handles.reader_make_constant_shell( makeString(
                          "SKF-3439360561" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-4359556905" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-1746016905" ) ),
      constant_handles.reader_make_constant_shell( makeString( "SKF-4430979996" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-5792768502" ) ), constant_handles.reader_make_constant_shell( makeString(
          "SKF-5965884944" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-4975731367" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-2918153882" ) ), constant_handles
              .reader_make_constant_shell( makeString( "SKF-0992686716" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-8537516687" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "SKF-7685719048" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-1488659619" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-9837174340" ) ), constant_handles
                      .reader_make_constant_shell( makeString( "SKF-0372211184" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-6796242698" ) ), constant_handles.reader_make_constant_shell( makeString(
                          "SKF-4631282123" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-8747036173" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-9214557550" ) ),
      constant_handles.reader_make_constant_shell( makeString( "SKF-2969771224" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-3201009743" ) ), constant_handles.reader_make_constant_shell( makeString(
          "SKF-8199787846" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-1857924337" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-2577476768" ) ), constant_handles
              .reader_make_constant_shell( makeString( "SKF-9606922473" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-3890236588" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "SKF-2976547342" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-2734536924" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-4107434815" ) ), constant_handles
                      .reader_make_constant_shell( makeString( "SKF-8121330546" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-0714339318" ) ), constant_handles.reader_make_constant_shell( makeString(
                          "SKF-3616130689" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-4918966" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-12370394" ) ), constant_handles
                              .reader_make_constant_shell( makeString( "SKF-58467056" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-61049284" ) ), constant_handles.reader_make_constant_shell(
                                  makeString( "SKF-14302329" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-4779393528" ) ), constant_handles.reader_make_constant_shell( makeString(
                                      "SKF-1305979122" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-3277105" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-23116387" ) ),
      constant_handles.reader_make_constant_shell( makeString( "SKF-55356852" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-4332265" ) ), constant_handles.reader_make_constant_shell( makeString(
          "SKF-DepictedFamilyMem2" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-38156889" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-DepictedFamilyMem1" ) ), constant_handles
              .reader_make_constant_shell( makeString( "SKF-0858093676" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-7924901403" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "SKF-7033956451" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-4442841559" ) )
    } );
    $list112 = _constant_112_initializer();
    $str113$_a__a__s__ = makeString( "~a ~a ~s~%" );
    $sym114$DIAGNOSE_JUST_THIS_SKOLEM = makeSymbol( "DIAGNOSE-JUST-THIS-SKOLEM" );
    $kw115$PARTIALLY_UNFINDABLE = makeKeyword( "PARTIALLY-UNFINDABLE" );
    $kw116$UNFINDABLE = makeKeyword( "UNFINDABLE" );
    $kw117$FREE_VARIABLE = makeKeyword( "FREE-VARIABLE" );
    $kw118$MULTIPLE_MTS = makeKeyword( "MULTIPLE-MTS" );
    $kw119$RAW_SKOLEM = makeKeyword( "RAW-SKOLEM" );
    $kw120$UNREIFIED_SKOLEM = makeKeyword( "UNREIFIED-SKOLEM" );
    $kw121$KNOWN_ISSUE = makeKeyword( "KNOWN-ISSUE" );
    $list122 = ConsesLow.list( makeKeyword( "RAW-SKOLEM" ), makeKeyword( "UNREIFIED-SKOLEM" ), makeKeyword( "FREE-VARIABLE" ) );
    $kw123$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $str124$different_el_formulas_for__a____s = makeString( "different el formulas for ~a:~%~s~%~s" );
    $list125 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "thereExists" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "EL-VAR?" ) ), ConsesLow.list( makeKeyword( "TEST" ),
        makeSymbol( "CONJUNCTION-OF-LITERALS?" ) ) );
    $list126 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "thereExists" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "EL-VAR?" ) ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "thereExists" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "EL-VAR?" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "CONJUNCTION-OF-LITERALS?" ) ) ) );
    $list127 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "thereExists" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "EL-VAR?" ) ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "thereExists" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "EL-VAR?" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
            "thereExists" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "EL-VAR?" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "CONJUNCTION-OF-LITERALS?" ) ) ) ) );
    $list128 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "implies" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
        "thereExists" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "EL-VAR?" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "CONJUNCTION-OF-LITERALS?" ) ) ) );
    $list129 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "implies" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
        "thereExists" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "EL-VAR?" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "thereExists" ) ), ConsesLow.list( makeKeyword(
            "TEST" ), makeSymbol( "EL-VAR?" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "CONJUNCTION-OF-LITERALS?" ) ) ) ) );
    $list130 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "implies" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
        "thereExists" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "EL-VAR?" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "thereExists" ) ), ConsesLow.list( makeKeyword(
            "TEST" ), makeSymbol( "EL-VAR?" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "thereExists" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "EL-VAR?" ) ), ConsesLow
                .list( makeKeyword( "TEST" ), makeSymbol( "CONJUNCTION-OF-LITERALS?" ) ) ) ) ) );
    $list131 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "implies" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
        "CYC-CONST-BOUNDED-EXISTENTIAL-OPERATOR-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "GROUND?" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "EL-VAR?" ) ), ConsesLow.list( makeKeyword(
            "TEST" ), makeSymbol( "CONJUNCTION-OF-LITERALS?" ) ) ) );
    $list132 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "EL-LITERAL-P" ) ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "thereExists" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "EL-VAR?" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
            "temporalMicrotheoriesIntersect" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "ANYTHING" ) ) ) );
    $list133 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "thereExists" ) ), ConsesLow.list( makeKeyword(
        "TEST" ), makeSymbol( "EL-VAR?" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporalMicrotheoriesIntersect" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "ANYTHING" ) ) ),
        ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "EL-LITERAL-P" ) ) );
    $kw134$IGNORE = makeKeyword( "IGNORE" );
    $list135 = ConsesLow.list( makeSymbol( "SKOLEM-TYPE" ), makeSymbol( "VARS" ), makeSymbol( "SK-VAR" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "NUMBER" ) );
    $str136$Skolem_type_mismatch___a__a__a = makeString( "Skolem type mismatch: ~a ~a ~a" );
    $str137$ = makeString( "" );
    $str138$temporalMicrotheoriesIntersect_ = makeString( "temporalMicrotheoriesIntersect " );
    $str139$___amismatch_for__a___a___a__ = makeString( "~%~amismatch for ~a~%~a~%~a~%" );
    $list140 = ConsesLow.list( makeSymbol( "SK-FN" ), makeSymbol( "VARS" ), makeSymbol( "VAR" ), makeSymbol( "SEQVAR" ) );
    $str141$Error = makeString( "Error" );
    $list142 = ConsesLow.list( makeSymbol( "SK-FN" ), makeSymbol( "VARS" ), makeSymbol( "VAR" ), makeSymbol( "SEQVAR" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "EXISTING-NUMBER" ) );
    $sym143$SKOLEM_SCALAR_TERM_ = makeSymbol( "SKOLEM-SCALAR-TERM?" );
    $list144 = ConsesLow.list( makeSymbol( "ASS1" ), makeSymbol( "ASS2" ) );
    $const145$temporalMicrotheoriesIntersect = constant_handles.reader_make_constant_shell( makeString( "temporalMicrotheoriesIntersect" ) );
    $list146 = ConsesLow.list( makeSymbol( "CONTENT-ASS" ), makeSymbol( "TMI-ASS" ) );
    $const147$thereExists = constant_handles.reader_make_constant_shell( makeString( "thereExists" ) );
    $sym148$_TIME = makeSymbol( "?TIME" );
    $const149$ist = constant_handles.reader_make_constant_shell( makeString( "ist" ) );
    $const150$MtSpace = constant_handles.reader_make_constant_shell( makeString( "MtSpace" ) );
    $list151 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MtTimeDimFn" ) ), makeSymbol( "?TIME" ) ) );
    $const152$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $list153 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporalMicrotheoriesIntersect" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
        "MtTimeDimFn" ) ), makeSymbol( "?TIME" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MtTimeWithGranularityDimFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
            makeString( "IntervalEndedByFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Now-Indexical" ) ) ), constant_handles.reader_make_constant_shell( makeString( "TimePoint" ) ) ) ) );
    $const154$BaseKB = constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) );
    $list155 = ConsesLow.list( new SubLObject[] { constant_handles.reader_make_constant_shell( makeString( "SKF-2172650888" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-6548862369" ) ),
      constant_handles.reader_make_constant_shell( makeString( "SKF-8409811003" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-7363528201" ) ), constant_handles.reader_make_constant_shell( makeString(
          "SKF-1358114357" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-4072021064" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-1681761679" ) ), constant_handles
              .reader_make_constant_shell( makeString( "SKF-2548755082" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-6067931751" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "SKF-5709128133" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-1590734700" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-5134195828" ) ), constant_handles
                      .reader_make_constant_shell( makeString( "SKF-3907269039" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-6454474627" ) ), constant_handles.reader_make_constant_shell( makeString(
                          "SKF-9567857250" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-5128698501" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-0849952130" ) ),
      constant_handles.reader_make_constant_shell( makeString( "SKF-5716409094" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-9715593487" ) ), constant_handles.reader_make_constant_shell( makeString(
          "SKF-4012481774" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-9973400181" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-4749210628" ) ), constant_handles
              .reader_make_constant_shell( makeString( "SKF-7688139609" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-7103881989" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "SKF-5296958920" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-9684239747" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-9283857452" ) ), constant_handles
                      .reader_make_constant_shell( makeString( "SKF-8076090600" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-8853185369" ) ), constant_handles.reader_make_constant_shell( makeString(
                          "SKF-2870709283" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-4865105368" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-6632523431" ) ),
      constant_handles.reader_make_constant_shell( makeString( "SKF-8236383708" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-0341790583" ) ), constant_handles.reader_make_constant_shell( makeString(
          "SKF-5342612010" ) )
    } );
    $str156$recanonicalizing_skolems = makeString( "recanonicalizing skolems" );
    $list157 = ConsesLow.list( new SubLObject[] { constant_handles.reader_make_constant_shell( makeString( "ThePrototypicalFixedAritySkolemFunction" ) ), constant_handles.reader_make_constant_shell( makeString(
        "SKF-4855075916" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-9401565" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-30608153" ) ), constant_handles
            .reader_make_constant_shell( makeString( "SKF-358427" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-981029" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-378457" ) ),
      constant_handles.reader_make_constant_shell( makeString( "SKF-7897525238" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-23426283" ) ), constant_handles.reader_make_constant_shell( makeString(
          "SKF-4978723980" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-8095780367" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-2283707389" ) ), constant_handles
              .reader_make_constant_shell( makeString( "SKF-3819196850" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-2177078880" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "SKF-9178370244" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-2313708415" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-54808499" ) ), constant_handles
                      .reader_make_constant_shell( makeString( "SKF-2396342019" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-0540013113" ) ), constant_handles.reader_make_constant_shell( makeString(
                          "SKF-7329112212" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-2463549462" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-7267986583" ) ),
      constant_handles.reader_make_constant_shell( makeString( "SKF-2341431804" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-5635570701" ) ), constant_handles.reader_make_constant_shell( makeString(
          "SKF-8712676684" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-6439069748" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-3035846539" ) ), constant_handles
              .reader_make_constant_shell( makeString( "SKF-9609006789" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-2094656502" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "SKF-1622895730" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-6034791567" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-8429706273" ) ), constant_handles
                      .reader_make_constant_shell( makeString( "SKF-5002539315" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-7731242586" ) ), constant_handles.reader_make_constant_shell( makeString(
                          "SKF-1935351914" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-5819554541" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-7665225690" ) ),
      constant_handles.reader_make_constant_shell( makeString( "SKF-5742181768" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-7774820049" ) ), constant_handles.reader_make_constant_shell( makeString(
          "SKF-9832002172" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-9099460346" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-6802057837" ) ), constant_handles
              .reader_make_constant_shell( makeString( "SKF-0233545031" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-7143243607" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "SKF-5547792583" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-1970550724" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-2043784885" ) ), constant_handles
                      .reader_make_constant_shell( makeString( "SKF-1714183462" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-6071957396" ) ), constant_handles.reader_make_constant_shell( makeString(
                          "SKF-7004599156" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-0633671947" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-4928965872" ) ),
      constant_handles.reader_make_constant_shell( makeString( "SKF-4365040835" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-9778251013" ) ), constant_handles.reader_make_constant_shell( makeString(
          "SKF-8146092452" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-0882987459" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-6693421741" ) ), constant_handles
              .reader_make_constant_shell( makeString( "SKF-1800635573" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-5174206356" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "SKF-8137704160" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-6138620537" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-6954747722" ) ), constant_handles
                      .reader_make_constant_shell( makeString( "SKF-8822929547" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-6574888924" ) ), constant_handles.reader_make_constant_shell( makeString(
                          "SKF-4648710733" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-3574121958" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-7111033530" ) ),
      constant_handles.reader_make_constant_shell( makeString( "SKF-1259710929" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-9511328868" ) ), constant_handles.reader_make_constant_shell( makeString(
          "SKF-7988430072" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-9334424285" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-0241028856" ) ), constant_handles
              .reader_make_constant_shell( makeString( "SKF-8824048486" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-4709173148" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "SKF-9085853324" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-5615627058" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-6491665291" ) ), constant_handles
                      .reader_make_constant_shell( makeString( "SKF-0256832978" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-1494753028" ) ), constant_handles.reader_make_constant_shell( makeString(
                          "SKF-3439360561" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-4359556905" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-1746016905" ) ),
      constant_handles.reader_make_constant_shell( makeString( "SKF-4430979996" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-5792768502" ) ), constant_handles.reader_make_constant_shell( makeString(
          "SKF-5965884944" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-4975731367" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-2918153882" ) ), constant_handles
              .reader_make_constant_shell( makeString( "SKF-0992686716" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-8537516687" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "SKF-7685719048" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-1488659619" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-9837174340" ) ), constant_handles
                      .reader_make_constant_shell( makeString( "SKF-0372211184" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-6796242698" ) ), constant_handles.reader_make_constant_shell( makeString(
                          "SKF-4631282123" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-8747036173" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-9214557550" ) ),
      constant_handles.reader_make_constant_shell( makeString( "SKF-2969771224" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-3201009743" ) ), constant_handles.reader_make_constant_shell( makeString(
          "SKF-8199787846" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-1857924337" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-2577476768" ) ), constant_handles
              .reader_make_constant_shell( makeString( "SKF-9606922473" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-3890236588" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "SKF-2976547342" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-2734536924" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-4107434815" ) ), constant_handles
                      .reader_make_constant_shell( makeString( "SKF-8121330546" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-0714339318" ) ), constant_handles.reader_make_constant_shell( makeString(
                          "SKF-3616130689" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-4918966" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-12370394" ) ), constant_handles
                              .reader_make_constant_shell( makeString( "SKF-58467056" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-61049284" ) ), constant_handles.reader_make_constant_shell(
                                  makeString( "SKF-14302329" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-4779393528" ) ), constant_handles.reader_make_constant_shell( makeString(
                                      "SKF-1305979122" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-0519624184" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-8565886278" ) ),
      constant_handles.reader_make_constant_shell( makeString( "SKF-5224425512" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-4272845489" ) ), constant_handles.reader_make_constant_shell( makeString(
          "SKF-8653559423" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-6875965541" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-3326030935" ) ), constant_handles
              .reader_make_constant_shell( makeString( "SKF-5171360072" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-1849376525" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "SKF-9027182255" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-9111966754" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-3322944904" ) ), constant_handles
                      .reader_make_constant_shell( makeString( "SKF-6974073305" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-9804613947" ) ), constant_handles.reader_make_constant_shell( makeString(
                          "SKF-4372359165" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-59006438" ) ), constant_handles.reader_make_constant_shell( makeString( "SKF-7033956451" ) ), constant_handles
                              .reader_make_constant_shell( makeString( "SKF-4442841559" ) )
    } );
    $kw158$BREADTH = makeKeyword( "BREADTH" );
    $kw159$QUEUE = makeKeyword( "QUEUE" );
    $kw160$STACK = makeKeyword( "STACK" );
    $sym161$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol( "RELEVANT-SBHL-TV-IS-GENERAL-TV" );
    $kw162$ERROR = makeKeyword( "ERROR" );
    $str163$_A_is_not_a__A = makeString( "~A is not a ~A" );
    $sym164$SBHL_TRUE_TV_P = makeSymbol( "SBHL-TRUE-TV-P" );
    $kw165$CERROR = makeKeyword( "CERROR" );
    $str166$continue_anyway = makeString( "continue anyway" );
    $kw167$WARN = makeKeyword( "WARN" );
    $str168$_A_is_not_a_valid__sbhl_type_erro = makeString( "~A is not a valid *sbhl-type-error-action* value" );
    $str169$_A_is_neither_SET_P_nor_LISTP_ = makeString( "~A is neither SET-P nor LISTP." );
    $str170$attempting_to_bind_direction_link = makeString( "attempting to bind direction link variable, to NIL. macro body not executed." );
    $list171 = ConsesLow.list( makeUninternedSymbol( "LINK-NODE" ), makeUninternedSymbol( "MT" ), makeUninternedSymbol( "TV" ) );
    $str172$Node__a_does_not_pass_sbhl_type_t = makeString( "Node ~a does not pass sbhl-type-test ~a~%" );
    $str173$Bad_skolem_function___A__ = makeString( "Bad skolem function: ~A~%" );
  }
}
/*
 * 
 * Total time: 3425 ms
 * 
 */