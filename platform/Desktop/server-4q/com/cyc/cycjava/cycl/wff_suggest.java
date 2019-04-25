package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class wff_suggest
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.wff_suggest";
  public static final String myFingerPrint = "3fa0065d757a10722c716f1f07565eb0af751f209f5563b90c68c6d1560e0a29";
  @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 4103L)
  private static SubLSymbol $sake_candidate_threshold$;
  @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 4306L)
  private static SubLSymbol $sake_suppress_unviableP$;
  @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 25409L)
  public static SubLSymbol $accessible_wf_fix_modules$;
  @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 25563L)
  public static SubLSymbol $accessible_wf_fix_strategies$;
  @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 25690L)
  public static SubLSymbol $accessible_wf_fix_tactics$;
  @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 28632L)
  public static SubLSymbol $target_relation$;
  private static final SubLSymbol $kw0$MAL_ARG_WRT_ARG_ISA;
  private static final SubLList $list1;
  private static final SubLObject $const2$isa;
  private static final SubLSymbol $kw3$MAL_ARG_WRT_ARG_QUOTED_ISA;
  private static final SubLObject $const4$quotedIsa;
  private static final SubLSymbol $kw5$MAL_ARG_WRT_ARG_GENLS;
  private static final SubLObject $const6$genls;
  private static final SubLSymbol $kw7$MAL_ARG_WRT_ARG_NOT_ISA_DISJOINT;
  private static final SubLSymbol $kw8$MAL_ARG_WRT_ARG_NOT_QUOTED_ISA_DISJOINT;
  private static final SubLSymbol $kw9$MAL_ARG_WRT_ARG_NOT_GENLS_DISJOINT;
  private static final SubLSymbol $kw10$MAL_ARG_WRT_INTER_ARG_ISA;
  private static final SubLSymbol $kw11$MAL_ARG_WRT_INTER_ARG_NOT_ISA;
  private static final SubLSymbol $kw12$MAL_ARG_WRT_INTER_ARG_GENL;
  private static final SubLSymbol $kw13$MAL_ARG_WRT_INTER_ARG_NOT_ISA_DISJOINT;
  private static final SubLSymbol $kw14$MAL_ARG_WRT_INTER_ARG_NOT_GENL_DISJOINT;
  private static final SubLSymbol $kw15$MAL_ARG_WRT_ARG_FORMAT;
  private static final SubLSymbol $kw16$MAL_ARG_WRT_INTER_ARG_FORMAT;
  private static final SubLSymbol $kw17$MAL_ARG_WRT_INTER_ARG_DIFFERENT;
  private static final SubLList $list18;
  private static final SubLObject $const19$different;
  private static final SubLSymbol $kw20$MAL_RELN_WRT_ARG_ISA_REQUIRED;
  private static final SubLSymbol $kw21$CONFLICT_ASSERTING_TRUE_SBHL;
  private static final SubLSymbol $kw22$CONFLICT_ASSERTING_FALSE_SBHL;
  private static final SubLSymbol $kw23$DISJOINT_ARG_ISA;
  private static final SubLSymbol $kw24$DISJOINT_ARG_QUOTED_ISA;
  private static final SubLSymbol $kw25$DISJOINT_ARG_GENL;
  private static final SubLSymbol $kw26$RESTRICTED_SKOLEM_ASSERTION;
  private static final SubLSymbol $kw27$RESTRICTED_PREDICATE_ASSERTION;
  private static final SubLSymbol $kw28$RESTRICTED_COLLECTION_ASSERTION;
  private static final SubLSymbol $kw29$RESTRICTED_MT_ASSERTION;
  private static final SubLSymbol $kw30$EVALUATABLE_LITERAL_FALSE;
  private static final SubLSymbol $kw31$MAL_PRECANONICALIZATIONS;
  private static final SubLSymbol $kw32$INVALID_EXPANSION;
  private static final SubLSymbol $kw33$RECURSION_LIMIT_EXCEEDED;
  private static final SubLSymbol $kw34$EL_UNEVALUATABLE_EXPRESSION;
  private static final SubLSymbol $kw35$QUANTIFIED_SEQUENCE_VARIABLE;
  private static final SubLSymbol $kw36$TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE;
  private static final SubLSymbol $kw37$AMBIGUOUS_VAR_TYPE_IN_SKOLEM_SCOPE;
  private static final SubLSymbol $kw38$INHIBITED_SEQUENCE_VARIABLE;
  private static final SubLSymbol $kw39$TOO_MANY_COMMUTATIVE_IN_ARGS_AND_REST;
  private static final SubLSymbol $sym40$GENL_;
  private static final SubLSymbol $sym41$FORMULA_ARG2;
  private static final SubLSymbol $kw42$EL;
  private static final SubLList $list43;
  private static final SubLSymbol $kw44$VIA_GENL_PRED;
  private static final SubLSymbol $kw45$WFF_FORMULA;
  private static final SubLSymbol $kw46$NL;
  private static final SubLString $str47$dont_know_how_to_describe_fixes_f;
  private static final SubLSymbol $kw48$AT_CONSTRAINT_GAF;
  private static final SubLSymbol $kw49$MAKE_IT_SO;
  private static final SubLList $list50;
  private static final SubLSymbol $kw51$ISA;
  private static final SubLSymbol $kw52$MAKE_EXCEPTION;
  private static final SubLList $list53;
  private static final SubLSymbol $kw54$CORRECT_FORMULA;
  private static final SubLList $list55;
  private static final SubLSymbol $kw56$DENY_APPLICABLILITY;
  private static final SubLList $list57;
  private static final SubLSymbol $kw58$CORRECT_CONSTRAINT;
  private static final SubLList $list59;
  private static final SubLSymbol $kw60$ASSERT_GAF;
  private static final SubLList $list61;
  private static final SubLList $list62;
  private static final SubLSymbol $kw63$ASSERT;
  private static final SubLSymbol $kw64$MT;
  private static final SubLSymbol $kw65$EDIT_DEFN;
  private static final SubLList $list66;
  private static final SubLList $list67;
  private static final SubLObject $const68$ist;
  private static final SubLObject $const69$defnAdmits;
  private static final SubLSymbol $kw70$EDIT_SUBL;
  private static final SubLSymbol $kw71$CONSTRAINTS;
  private static final SubLSymbol $kw72$SOLICIT_DEFN;
  private static final SubLSymbol $kw73$ASSERT_DEFN;
  private static final SubLList $list74;
  private static final SubLObject $const75$defnSufficient;
  private static final SubLList $list76;
  private static final SubLSymbol $sym77$_DEFN;
  private static final SubLSymbol $kw78$SOLICIT_VARIABLE_BINDING;
  private static final SubLSymbol $kw79$ASSERT_EXCEPT_FOR;
  private static final SubLList $list80;
  private static final SubLList $list81;
  private static final SubLObject $const82$exceptFor;
  private static final SubLSymbol $kw83$ASSERT_EXCEPT_WHEN;
  private static final SubLList $list84;
  private static final SubLObject $const85$implies;
  private static final SubLObject $const86$evaluate;
  private static final SubLSymbol $sym87$_FORMULA_WRT_ARG;
  private static final SubLObject $const88$SubstituteFormulaFn;
  private static final SubLList $list89;
  private static final SubLList $list90;
  private static final SubLSymbol $sym91$_FORMULA;
  private static final SubLObject $const92$exceptWhen;
  private static final SubLSymbol $kw93$CHANGE_LEVEL;
  private static final SubLList $list94;
  private static final SubLList $list95;
  private static final SubLObject $const96$relationAllInstance;
  private static final SubLObject $const97$relationInstanceAll;
  private static final SubLSymbol $kw98$EDIT_FORMULA;
  private static final SubLSymbol $kw99$NEW_FORMULA;
  private static final SubLSymbol $kw100$CHANGE_TERM;
  private static final SubLList $list101;
  private static final SubLSymbol $sym102$_NEW_TERM;
  private static final SubLObject $const103$knownSentence;
  private static final SubLObject $const104$conceptuallyRelated;
  private static final SubLSymbol $kw105$PREFERENCES;
  private static final SubLSymbol $kw106$CHANGE_RELATION;
  private static final SubLList $list107;
  private static final SubLSymbol $sym108$_NEW_RELATION;
  private static final SubLSymbol $kw109$PROMISSING_BINDINGS;
  private static final SubLSymbol $kw110$CANDIDATE_COUNT;
  private static final SubLSymbol $kw111$MIN_CANDIDATES;
  private static final SubLObject $const112$admittedArgument;
  private static final SubLSymbol $kw113$WEAKEN_RELATION;
  private static final SubLList $list114;
  private static final SubLSymbol $sym115$_NEW_PREDICATE;
  private static final SubLObject $const116$and;
  private static final SubLObject $const117$genlPreds;
  private static final SubLList $list118;
  private static final SubLList $list119;
  private static final SubLSymbol $kw120$CHANGE_MT;
  private static final SubLList $list121;
  private static final SubLSymbol $kw122$MAX_CANDIDATES;
  private static final SubLSymbol $kw123$CHANGE_FORMULA_MT;
  private static final SubLSymbol $kw124$FROM_MT;
  private static final SubLList $list125;
  private static final SubLSymbol $kw126$RETRACT_FORMULA;
  private static final SubLList $list127;
  private static final SubLSymbol $kw128$WEAKEN_CONSTRAINT;
  private static final SubLList $list129;
  private static final SubLSymbol $sym130$_NEW_COL;
  private static final SubLList $list131;
  private static final SubLSymbol $kw132$EDIT_ASSERTION;
  private static final SubLSymbol $kw133$CHANGE_CONSTRAINT;
  private static final SubLList $list134;
  private static final SubLSymbol $kw135$UNASSERT_CONSTRAINT;
  private static final SubLSymbol $kw136$UNASSERT;
  private static final SubLSymbol $sym137$_NEW_MT;
  private static final SubLObject $const138$unknownSentence;
  private static final SubLObject $const139$genlMt;
  private static final SubLList $list140;
  private static final SubLSymbol $kw141$CHANGE_ASSERTION_MT;
  private static final SubLSymbol $kw142$DENY_HL_SUPPORT;
  private static final SubLList $list143;
  private static final SubLSymbol $kw144$GENLPREDS;
  private static final SubLList $list145;
  private static final SubLSymbol $kw146$ALL;
  private static final SubLSymbol $kw147$UNVIABLE;
  private static final SubLList $list148;
  private static final SubLSymbol $kw149$WHY_NOT_WFF;
  private static final SubLSymbol $kw150$WHY_NOT_CONSISTENT;
  private static final SubLList $list151;
  private static final SubLSymbol $sym152$CYC_VAR_;
  private static final SubLList $list153;
  private static final SubLList $list154;
  private static final SubLSymbol $sym155$GATHER_CONTRACTIONS_INT;
  private static final SubLSymbol $kw156$TRUE;
  private static final SubLObject $const157$expansion;
  private static final SubLSymbol $sym158$TARGET_RELATION_EXPRESSION_;
  private static final SubLSymbol $kw159$SOURCE;

  @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 859L)
  public static SubLObject non_wffness_repairs(final SubLObject sentence, final SubLObject mt)
  {
    final SubLObject wff_violations = wff.why_not_wff( sentence, mt, UNPROVIDED );
    return wff_violations_repairs( wff_violations );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 1017L)
  public static SubLObject wff_violations_repairs(final SubLObject wff_violations)
  {
    SubLObject isa_repairs = NIL;
    SubLObject quoted_isa_repairs = NIL;
    SubLObject genl_repairs = NIL;
    SubLObject other_repairs = NIL;
    SubLObject irreparableP = NIL;
    if( NIL == irreparableP )
    {
      SubLObject csome_list_var = wff_violations;
      SubLObject violation = NIL;
      violation = csome_list_var.first();
      while ( NIL == irreparableP && NIL != csome_list_var)
      {
        final SubLObject pcase_var = at_utilities.violation_type( violation );
        if( pcase_var.eql( $kw0$MAL_ARG_WRT_ARG_ISA ) )
        {
          SubLObject current;
          final SubLObject datum = current = violation;
          SubLObject wff_module = NIL;
          SubLObject arg = NIL;
          SubLObject reln = NIL;
          SubLObject pos = NIL;
          SubLObject col = NIL;
          SubLObject mt = NIL;
          SubLObject data = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
          wff_module = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
          arg = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
          reln = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
          pos = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
          col = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
          mt = current.first();
          current = ( data = current.rest() );
          if( NIL != at_defns.quiet_not_has_typeP( arg, col, mt ) )
          {
            irreparableP = T;
          }
          else
          {
            final SubLObject item_var = el_utilities.make_binary_formula( $const2$isa, arg, col );
            if( NIL == conses_high.member( item_var, isa_repairs, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              isa_repairs = ConsesLow.cons( item_var, isa_repairs );
            }
          }
        }
        else if( pcase_var.eql( $kw3$MAL_ARG_WRT_ARG_QUOTED_ISA ) )
        {
          SubLObject current;
          final SubLObject datum = current = violation;
          SubLObject wff_module = NIL;
          SubLObject arg = NIL;
          SubLObject reln = NIL;
          SubLObject pos = NIL;
          SubLObject col = NIL;
          SubLObject mt = NIL;
          SubLObject data = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
          wff_module = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
          arg = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
          reln = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
          pos = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
          col = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
          mt = current.first();
          current = ( data = current.rest() );
          if( NIL != at_defns.quiet_not_quoted_has_typeP( arg, col, mt ) )
          {
            irreparableP = T;
          }
          else
          {
            final SubLObject item_var = el_utilities.make_binary_formula( $const4$quotedIsa, arg, col );
            if( NIL == conses_high.member( item_var, isa_repairs, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              isa_repairs = ConsesLow.cons( item_var, isa_repairs );
            }
          }
        }
        else if( pcase_var.eql( $kw5$MAL_ARG_WRT_ARG_GENLS ) )
        {
          SubLObject current;
          final SubLObject datum = current = violation;
          SubLObject wff_module = NIL;
          SubLObject arg = NIL;
          SubLObject reln = NIL;
          SubLObject pos = NIL;
          SubLObject col = NIL;
          SubLObject mt = NIL;
          SubLObject data = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
          wff_module = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
          arg = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
          reln = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
          pos = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
          col = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
          mt = current.first();
          current = ( data = current.rest() );
          if( NIL != genls.not_genlP( arg, col, mt, UNPROVIDED ) )
          {
            irreparableP = T;
          }
          else
          {
            final SubLObject item_var = el_utilities.make_binary_formula( $const6$genls, arg, col );
            if( NIL == conses_high.member( item_var, genl_repairs, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              genl_repairs = ConsesLow.cons( item_var, genl_repairs );
            }
          }
        }
        else if( pcase_var.eql( $kw7$MAL_ARG_WRT_ARG_NOT_ISA_DISJOINT ) || pcase_var.eql( $kw8$MAL_ARG_WRT_ARG_NOT_QUOTED_ISA_DISJOINT ) || pcase_var.eql( $kw9$MAL_ARG_WRT_ARG_NOT_GENLS_DISJOINT ) )
        {
          irreparableP = T;
        }
        else if( !pcase_var.eql( $kw10$MAL_ARG_WRT_INTER_ARG_ISA ) )
        {
          if( !pcase_var.eql( $kw11$MAL_ARG_WRT_INTER_ARG_NOT_ISA ) )
          {
            if( !pcase_var.eql( $kw12$MAL_ARG_WRT_INTER_ARG_GENL ) )
            {
              if( pcase_var.eql( $kw13$MAL_ARG_WRT_INTER_ARG_NOT_ISA_DISJOINT ) || pcase_var.eql( $kw14$MAL_ARG_WRT_INTER_ARG_NOT_GENL_DISJOINT ) )
              {
                irreparableP = T;
              }
              else if( pcase_var.eql( $kw15$MAL_ARG_WRT_ARG_FORMAT ) || pcase_var.eql( $kw16$MAL_ARG_WRT_INTER_ARG_FORMAT ) )
              {
                irreparableP = T;
              }
              else if( pcase_var.eql( $kw17$MAL_ARG_WRT_INTER_ARG_DIFFERENT ) )
              {
                SubLObject current;
                final SubLObject datum = current = violation;
                SubLObject wff_module = NIL;
                SubLObject reln2 = NIL;
                SubLObject arg2 = NIL;
                SubLObject psn1 = NIL;
                SubLObject arg3 = NIL;
                SubLObject psn2 = NIL;
                SubLObject mt2 = NIL;
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
                wff_module = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
                reln2 = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
                arg2 = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
                psn1 = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
                arg3 = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
                psn2 = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
                mt2 = current.first();
                current = current.rest();
                final SubLObject via = current.isCons() ? current.first() : NIL;
                cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list18 );
                current = current.rest();
                if( NIL == current )
                {
                  if( NIL != equals.equalsP( arg2, arg3, mt2, UNPROVIDED ) )
                  {
                    irreparableP = T;
                  }
                  else
                  {
                    final SubLObject item_var2 = el_utilities.make_binary_formula( $const19$different, arg2, arg3 );
                    if( NIL == conses_high.member( item_var2, other_repairs, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
                    {
                      other_repairs = ConsesLow.cons( item_var2, other_repairs );
                    }
                  }
                }
                else
                {
                  cdestructuring_bind.cdestructuring_bind_error( datum, $list18 );
                }
              }
              else if( pcase_var.eql( $kw20$MAL_RELN_WRT_ARG_ISA_REQUIRED ) )
              {
                irreparableP = T;
              }
              else if( pcase_var.eql( $kw21$CONFLICT_ASSERTING_TRUE_SBHL ) || pcase_var.eql( $kw22$CONFLICT_ASSERTING_FALSE_SBHL ) )
              {
                irreparableP = T;
              }
              else if( pcase_var.eql( $kw23$DISJOINT_ARG_ISA ) || pcase_var.eql( $kw24$DISJOINT_ARG_QUOTED_ISA ) || pcase_var.eql( $kw25$DISJOINT_ARG_GENL ) )
              {
                irreparableP = T;
              }
              else if( pcase_var.eql( $kw26$RESTRICTED_SKOLEM_ASSERTION ) || pcase_var.eql( $kw27$RESTRICTED_PREDICATE_ASSERTION ) || pcase_var.eql( $kw28$RESTRICTED_COLLECTION_ASSERTION ) || pcase_var.eql(
                  $kw29$RESTRICTED_MT_ASSERTION ) )
              {
                irreparableP = T;
              }
              else if( pcase_var.eql( $kw30$EVALUATABLE_LITERAL_FALSE ) || pcase_var.eql( $kw31$MAL_PRECANONICALIZATIONS ) || pcase_var.eql( $kw32$INVALID_EXPANSION ) || pcase_var.eql( $kw33$RECURSION_LIMIT_EXCEEDED )
                  || pcase_var.eql( $kw34$EL_UNEVALUATABLE_EXPRESSION ) )
              {
                irreparableP = T;
              }
              else if( pcase_var.eql( $kw35$QUANTIFIED_SEQUENCE_VARIABLE ) || pcase_var.eql( $kw36$TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE ) || pcase_var.eql( $kw37$AMBIGUOUS_VAR_TYPE_IN_SKOLEM_SCOPE ) || pcase_var.eql(
                  $kw38$INHIBITED_SEQUENCE_VARIABLE ) )
              {
                irreparableP = T;
              }
              else if( pcase_var.eql( $kw39$TOO_MANY_COMMUTATIVE_IN_ARGS_AND_REST ) )
              {
                irreparableP = T;
              }
            }
          }
        }
        csome_list_var = csome_list_var.rest();
        violation = csome_list_var.first();
      }
    }
    isa_repairs = list_utilities.delete_subsumed_items( isa_repairs, $sym40$GENL_, $sym41$FORMULA_ARG2 );
    quoted_isa_repairs = list_utilities.delete_subsumed_items( quoted_isa_repairs, $sym40$GENL_, $sym41$FORMULA_ARG2 );
    genl_repairs = list_utilities.delete_subsumed_items( genl_repairs, $sym40$GENL_, $sym41$FORMULA_ARG2 );
    return ( NIL != irreparableP ) ? NIL : ConsesLow.append( isa_repairs, quoted_isa_repairs, genl_repairs, other_repairs );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 4425L)
  public static SubLObject suggestions_for_mal_arg_wrt_arg_isa(final SubLObject why_not, SubLObject io_mode)
  {
    if( io_mode == UNPROVIDED )
    {
      io_mode = $kw42$EL;
    }
    SubLObject module = NIL;
    SubLObject arg = NIL;
    SubLObject relation = NIL;
    SubLObject argnum = NIL;
    SubLObject col = NIL;
    SubLObject mt = NIL;
    SubLObject data = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( why_not, why_not, $list43 );
    module = why_not.first();
    SubLObject current = why_not.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, why_not, $list43 );
    arg = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, why_not, $list43 );
    relation = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, why_not, $list43 );
    argnum = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, why_not, $list43 );
    col = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, why_not, $list43 );
    mt = current.first();
    current = ( data = current.rest() );
    final SubLObject via_genl_pred = conses_high.cadr( conses_high.assoc( $kw44$VIA_GENL_PRED, data, UNPROVIDED, UNPROVIDED ) );
    final SubLObject rejected_formula = conses_high.cadr( conses_high.assoc( $kw45$WFF_FORMULA, data, UNPROVIDED, UNPROVIDED ) );
    final SubLObject pcase_var = io_mode;
    if( pcase_var.eql( $kw46$NL ) )
    {
      return PrintLow.format( NIL, $str47$dont_know_how_to_describe_fixes_f, module );
    }
    if( pcase_var.eql( $kw42$EL ) )
    {
      final SubLObject constraint_assertion = conses_high.cadr( conses_high.assoc( $kw48$AT_CONSTRAINT_GAF, data, UNPROVIDED, UNPROVIDED ) );
      final SubLObject constraint_formula = assertions_high.gaf_formula( constraint_assertion );
      final SubLObject constraint_mt = assertions_high.assertion_mt( constraint_assertion );
      return ConsesLow.append( new SubLObject[] { sake_fix_arg_isa_via_make_it_so( module, arg, col, mt ), sake_fix_arg_type_via_make_exception( module, arg, constraint_formula, mt ),
        sake_fix_arg_type_via_correct_formula( module, $const2$isa, relation, argnum, arg, col, rejected_formula, mt ), sake_fix_via_deny_constraint_applicability( module, relation, mt, via_genl_pred, constraint_formula,
            constraint_mt ), sake_fix_arg_type_via_correct_constraint( module, $const2$isa, arg, col, mt, constraint_formula, constraint_mt )
      } );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 5551L)
  public static SubLObject suggestions_for_mal_arg_wrt_arg_not_isa_disjoint(final SubLObject why_not, SubLObject io_mode)
  {
    if( io_mode == UNPROVIDED )
    {
      io_mode = $kw42$EL;
    }
    SubLObject module = NIL;
    SubLObject arg = NIL;
    SubLObject relation = NIL;
    SubLObject argnum = NIL;
    SubLObject col = NIL;
    SubLObject mt = NIL;
    SubLObject data = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( why_not, why_not, $list43 );
    module = why_not.first();
    SubLObject current = why_not.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, why_not, $list43 );
    arg = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, why_not, $list43 );
    relation = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, why_not, $list43 );
    argnum = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, why_not, $list43 );
    col = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, why_not, $list43 );
    mt = current.first();
    current = ( data = current.rest() );
    final SubLObject via_genl_pred = conses_high.cadr( conses_high.assoc( $kw44$VIA_GENL_PRED, data, UNPROVIDED, UNPROVIDED ) );
    final SubLObject rejected_formula = conses_high.cadr( conses_high.assoc( $kw45$WFF_FORMULA, data, UNPROVIDED, UNPROVIDED ) );
    final SubLObject pcase_var = io_mode;
    if( pcase_var.eql( $kw46$NL ) )
    {
      return PrintLow.format( NIL, $str47$dont_know_how_to_describe_fixes_f, module );
    }
    if( pcase_var.eql( $kw42$EL ) )
    {
      final SubLObject constraint_assertion = conses_high.cadr( conses_high.assoc( $kw48$AT_CONSTRAINT_GAF, data, UNPROVIDED, UNPROVIDED ) );
      final SubLObject constraint_formula = ( NIL != constraint_assertion ) ? assertions_high.gaf_formula( constraint_assertion ) : NIL;
      final SubLObject constraint_mt = ( NIL != constraint_assertion ) ? assertions_high.assertion_mt( constraint_assertion ) : NIL;
      return ConsesLow.append( new SubLObject[] { sake_fix_arg_isa_disjoint_via_make_it_unknown( module, arg, col, mt ), sake_fix_arg_type_via_make_exception( module, arg, constraint_formula, mt ),
        sake_fix_arg_type_via_correct_formula( module, $const2$isa, relation, argnum, arg, col, rejected_formula, mt ), sake_fix_via_deny_constraint_applicability( module, relation, mt, via_genl_pred, constraint_formula,
            constraint_mt ), sake_fix_arg_type_via_correct_constraint( module, $const2$isa, arg, col, mt, constraint_formula, constraint_mt )
      } );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 6716L)
  public static SubLObject suggestions_for_mal_arg_wrt_arg_genl(final SubLObject why_not, SubLObject io_mode)
  {
    if( io_mode == UNPROVIDED )
    {
      io_mode = $kw42$EL;
    }
    SubLObject module = NIL;
    SubLObject arg = NIL;
    SubLObject relation = NIL;
    SubLObject argnum = NIL;
    SubLObject col = NIL;
    SubLObject mt = NIL;
    SubLObject data = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( why_not, why_not, $list43 );
    module = why_not.first();
    SubLObject current = why_not.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, why_not, $list43 );
    arg = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, why_not, $list43 );
    relation = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, why_not, $list43 );
    argnum = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, why_not, $list43 );
    col = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, why_not, $list43 );
    mt = current.first();
    current = ( data = current.rest() );
    final SubLObject via_genl_pred = conses_high.cadr( conses_high.assoc( $kw44$VIA_GENL_PRED, data, UNPROVIDED, UNPROVIDED ) );
    final SubLObject rejected_formula = conses_high.cadr( conses_high.assoc( $kw45$WFF_FORMULA, data, UNPROVIDED, UNPROVIDED ) );
    final SubLObject pcase_var = io_mode;
    if( pcase_var.eql( $kw46$NL ) )
    {
      return PrintLow.format( NIL, $str47$dont_know_how_to_describe_fixes_f, module );
    }
    if( pcase_var.eql( $kw42$EL ) )
    {
      final SubLObject constraint_assertion = conses_high.cadr( conses_high.assoc( $kw48$AT_CONSTRAINT_GAF, data, UNPROVIDED, UNPROVIDED ) );
      final SubLObject constraint_formula = assertions_high.gaf_formula( constraint_assertion );
      final SubLObject constraint_mt = assertions_high.assertion_mt( constraint_assertion );
      return ConsesLow.append( new SubLObject[] { sake_fix_arg_genl_via_make_it_so( module, arg, col, mt ), sake_fix_arg_type_via_make_exception( module, arg, constraint_formula, mt ),
        sake_fix_arg_type_via_correct_formula( module, $const6$genls, relation, argnum, arg, col, rejected_formula, mt ), sake_fix_via_deny_constraint_applicability( module, relation, mt, via_genl_pred,
            constraint_formula, constraint_mt ), sake_fix_arg_type_via_correct_constraint( module, $const6$genls, arg, col, mt, constraint_formula, constraint_mt )
      } );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 7802L)
  public static SubLObject sake_fix_arg_isa_via_make_it_so(final SubLObject wff_module, final SubLObject arg, final SubLObject col, final SubLObject mt)
  {
    if( NIL != accessible_wf_fixP( wff_module, $kw49$MAKE_IT_SO, UNPROVIDED ) )
    {
      final SubLObject strategy = $list50;
      return ConsesLow.append( sake_fix_assert_gaf2( wff_module, $const2$isa, arg, col, mt, strategy ), sake_fix_edit_sufficient_defn( wff_module, arg, col, mt, strategy ), sake_fix_solicit_sufficient_defn( wff_module,
          arg, col, mt, strategy ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 8234L)
  public static SubLObject sake_fix_arg_isa_disjoint_via_make_it_unknown(final SubLObject wff_module, final SubLObject arg, final SubLObject col, final SubLObject mt)
  {
    if( NIL != accessible_wf_fixP( wff_module, $kw49$MAKE_IT_SO, UNPROVIDED ) )
    {
      final SubLObject strategy = $list50;
      final SubLObject literal = cycl_utilities.negate( el_utilities.make_binary_formula( $const2$isa, arg, col ) );
      return ConsesLow.append( sake_fix_deny_hl_literal( wff_module, $kw51$ISA, literal, mt, strategy ), sake_fix_arg_isa_via_make_it_so( wff_module, arg, col, mt ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 8644L)
  public static SubLObject sake_fix_arg_genl_via_make_it_so(final SubLObject wff_module, final SubLObject arg, final SubLObject col, final SubLObject mt)
  {
    if( NIL != accessible_wf_fixP( wff_module, $kw49$MAKE_IT_SO, UNPROVIDED ) )
    {
      final SubLObject strategy = $list50;
      return sake_fix_assert_gaf2( wff_module, $const6$genls, arg, col, mt, strategy );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 8911L)
  public static SubLObject sake_fix_arg_type_via_make_exception(final SubLObject wff_module, final SubLObject arg, final SubLObject formula, final SubLObject mt)
  {
    if( NIL != accessible_wf_fixP( wff_module, $kw52$MAKE_EXCEPTION, UNPROVIDED ) )
    {
      final SubLObject strategy = $list53;
      return ConsesLow.append( sake_fix_assert_arg_except_for( wff_module, arg, formula, mt, strategy ), sake_fix_assert_arg_except_when( wff_module, arg, formula, mt, strategy ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 9275L)
  public static SubLObject sake_fix_arg_type_via_correct_formula(final SubLObject wff_module, final SubLObject predicate, final SubLObject relation, final SubLObject argnum, final SubLObject arg, final SubLObject col,
      final SubLObject formula, final SubLObject mt)
  {
    if( NIL != accessible_wf_fixP( wff_module, $kw54$CORRECT_FORMULA, UNPROVIDED ) )
    {
      final SubLObject strategy = $list55;
      return ConsesLow.append( new SubLObject[] { sake_fix_change_formula_level( wff_module, predicate, relation, argnum, arg, col, formula, mt, strategy ), sake_fix_change_formula_term( wff_module, predicate, arg, col,
          formula, mt, strategy ), sake_fix_change_formula_relation( wff_module, relation, argnum, arg, formula, mt, strategy ), sake_fix_weaken_formula_relation( wff_module, relation, argnum, arg, formula, mt,
              strategy ), sake_fix_change_formula_mt( wff_module, predicate, arg, col, mt, formula, strategy ), sake_fix_retract_formula( wff_module, formula, mt, strategy )
      } );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 10040L)
  public static SubLObject sake_fix_via_deny_constraint_applicability(final SubLObject wff_module, final SubLObject relation, final SubLObject mt, final SubLObject via_genl_pred, final SubLObject constraint_formula,
      final SubLObject constraint_mt)
  {
    if( NIL != accessible_wf_fixP( wff_module, $kw56$DENY_APPLICABLILITY, UNPROVIDED ) )
    {
      final SubLObject strategy = $list57;
      return ConsesLow.append( sake_fix_change_constraint_mt( wff_module, mt, constraint_formula, constraint_mt, strategy ), sake_fix_deny_constraint_applies_to_spec_pred( wff_module, relation, mt, via_genl_pred,
          strategy ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 10509L)
  public static SubLObject sake_fix_arg_type_via_correct_constraint(final SubLObject wff_module, final SubLObject predicate, final SubLObject arg, final SubLObject col, final SubLObject mt,
      final SubLObject constraint_formula, final SubLObject constraint_mt)
  {
    if( NIL != accessible_wf_fixP( wff_module, $kw58$CORRECT_CONSTRAINT, UNPROVIDED ) )
    {
      final SubLObject strategy = $list59;
      return ConsesLow.append( sake_fix_weaken_arg_type_constraint( wff_module, predicate, arg, col, mt, constraint_formula, constraint_mt, strategy ), sake_fix_change_arg_type_constraint( wff_module, predicate, arg,
          col, mt, constraint_formula, constraint_mt, strategy ), sake_fix_unassert_constraint( wff_module, constraint_formula, constraint_mt, strategy ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 11100L)
  public static SubLObject sake_fix_assert_gaf2(final SubLObject wff_module, final SubLObject predicate, final SubLObject arg1, final SubLObject arg2, final SubLObject mt, final SubLObject strategy)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != accessible_wf_fixP( wff_module, strategy, $kw60$ASSERT_GAF ) )
    {
      final SubLObject gaf_formula = el_utilities.make_binary_formula( predicate, arg1, arg2 );
      final SubLObject tactics = $list61;
      final SubLObject skills = $list62;
      final SubLObject formula_status = sake_formula_status( gaf_formula, mt );
      if( NIL == $sake_suppress_unviableP$.getDynamicValue( thread ) || NIL != sake_viableP( formula_status ) )
      {
        return ConsesLow.list( ConsesLow.listS( $kw63$ASSERT, gaf_formula, ConsesLow.list( $kw64$MT, mt ), ConsesLow.append( formula_status, ConsesLow.list( strategy, tactics, skills ) ) ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 11654L)
  public static SubLObject sake_fix_edit_sufficient_defn(final SubLObject wff_module, final SubLObject arg, final SubLObject col, final SubLObject mt, final SubLObject strategy)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != accessible_wf_fixP( wff_module, strategy, $kw65$EDIT_DEFN ) )
    {
      final SubLObject tactics = $list66;
      final SubLObject skills = $list67;
      SubLObject result = NIL;
      SubLObject cdolist_list_var = kb_accessors.sufficient_defns( col, mt );
      SubLObject defn = NIL;
      defn = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject constraint_formula = ConsesLow.list( $const68$ist, mt, ConsesLow.list( $const69$defnAdmits, defn, arg ) );
        final SubLObject constraint_status = sake_formula_status( constraint_formula, mt );
        if( NIL == $sake_suppress_unviableP$.getDynamicValue( thread ) || NIL != sake_viableP( constraint_status ) )
        {
          result = ConsesLow.cons( ConsesLow.list( $kw70$EDIT_SUBL, defn, ConsesLow.listS( $kw71$CONSTRAINTS, constraint_formula, ConsesLow.append( constraint_status, NIL ) ), strategy, tactics, skills ), result );
        }
        cdolist_list_var = cdolist_list_var.rest();
        defn = cdolist_list_var.first();
      }
      return result;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 12329L)
  public static SubLObject sake_fix_solicit_sufficient_defn(final SubLObject wff_module, final SubLObject arg, final SubLObject col, final SubLObject mt, final SubLObject strategy)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != accessible_wf_fixP( wff_module, strategy, $kw72$SOLICIT_DEFN ) && NIL != accessible_wf_fixP( wff_module, strategy, $kw73$ASSERT_DEFN ) )
    {
      final SubLObject tactics = $list74;
      final SubLObject skills = $list67;
      final SubLObject defn_formula = ConsesLow.listS( $const75$defnSufficient, col, $list76 );
      final SubLObject formula_status = sake_formula_status( defn_formula, mt );
      final SubLObject constraint_formula = ConsesLow.list( $const68$ist, mt, ConsesLow.list( $const69$defnAdmits, $sym77$_DEFN, arg ) );
      final SubLObject constraint_status = sake_formula_status( constraint_formula, mt );
      final SubLObject solicit_data = ConsesLow.list( ConsesLow.list( $kw78$SOLICIT_VARIABLE_BINDING, $sym77$_DEFN, ConsesLow.listS( $kw71$CONSTRAINTS, constraint_formula, ConsesLow.append( constraint_status,
          NIL ) ) ) );
      if( NIL == $sake_suppress_unviableP$.getDynamicValue( thread ) || ( NIL != sake_viableP( formula_status ) && NIL != sake_viableP( constraint_status ) ) )
      {
        return ConsesLow.list( ConsesLow.listS( $kw63$ASSERT, defn_formula, ConsesLow.list( $kw64$MT, mt ), ConsesLow.append( formula_status, solicit_data, ConsesLow.list( strategy, tactics, skills ) ) ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 13260L)
  public static SubLObject sake_fix_assert_arg_except_for(final SubLObject wff_module, final SubLObject arg, final SubLObject formula, final SubLObject mt, final SubLObject strategy)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != accessible_wf_fixP( wff_module, strategy, $kw79$ASSERT_EXCEPT_FOR ) )
    {
      final SubLObject tactics = $list80;
      final SubLObject skills = $list81;
      final SubLObject except_formula = ConsesLow.list( $const82$exceptFor, arg, formula );
      final SubLObject formula_status = sake_formula_status( except_formula, mt );
      if( NIL == $sake_suppress_unviableP$.getDynamicValue( thread ) || NIL != sake_viableP( formula_status ) )
      {
        return ConsesLow.list( ConsesLow.listS( $kw63$ASSERT, except_formula, ConsesLow.list( $kw64$MT, mt ), ConsesLow.append( formula_status, ConsesLow.list( strategy, tactics, skills ) ) ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 13812L)
  public static SubLObject sake_fix_assert_arg_except_when(final SubLObject wff_module, final SubLObject arg, final SubLObject formula, final SubLObject mt, final SubLObject strategy)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != accessible_wf_fixP( wff_module, strategy, $kw83$ASSERT_EXCEPT_WHEN ) )
    {
      final SubLObject tactics = $list84;
      final SubLObject skills = $list81;
      final SubLObject constraint_formula = ConsesLow.list( $const68$ist, mt, ConsesLow.listS( $const85$implies, ConsesLow.list( $const86$evaluate, $sym87$_FORMULA_WRT_ARG, ConsesLow.listS( $const88$SubstituteFormulaFn,
          arg, $list89 ) ), $list90 ) );
      final SubLObject constraint_status = sake_formula_status( constraint_formula, mt );
      final SubLObject solicit_data = ConsesLow.list( ConsesLow.list( $kw78$SOLICIT_VARIABLE_BINDING, $sym91$_FORMULA, ConsesLow.listS( $kw71$CONSTRAINTS, constraint_formula, ConsesLow.append( constraint_status,
          NIL ) ) ) );
      if( NIL == $sake_suppress_unviableP$.getDynamicValue( thread ) || NIL != sake_viableP( constraint_status ) )
      {
        return ConsesLow.list( ConsesLow.listS( $kw63$ASSERT, ConsesLow.list( $const92$exceptWhen, $sym91$_FORMULA, formula ), ConsesLow.list( $kw64$MT, mt ), ConsesLow.append( solicit_data, ConsesLow.list( strategy,
            tactics, skills ) ) ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 14628L)
  public static SubLObject sake_fix_change_formula_level(final SubLObject wff_module, final SubLObject predicate, final SubLObject relation, final SubLObject argnum, final SubLObject arg, final SubLObject col,
      final SubLObject formula, final SubLObject mt, final SubLObject strategy)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != accessible_wf_fixP( wff_module, strategy, $kw93$CHANGE_LEVEL ) && predicate.eql( $const2$isa ) && NIL != genls.genlsP( arg, col, mt, UNPROVIDED ) && NIL != el_utilities.el_binary_formula_p( formula )
        && NIL != fort_types_interface.predicateP( relation ) )
    {
      final SubLObject tactics = $list94;
      final SubLObject skills = $list95;
      final SubLObject new_predicate = ONE_INTEGER.numE( argnum ) ? $const96$relationAllInstance : $const97$relationInstanceAll;
      final SubLObject sentence_pred = cycl_utilities.sentence_arg0( formula );
      final SubLObject sentence_arg1 = cycl_utilities.sentence_arg1( formula, UNPROVIDED );
      final SubLObject sentence_arg2 = cycl_utilities.sentence_arg2( formula, UNPROVIDED );
      final SubLObject new_formula = el_utilities.make_ternary_formula( new_predicate, sentence_pred, sentence_arg1, sentence_arg2 );
      final SubLObject formula_status = ( NIL != $sake_suppress_unviableP$.getDynamicValue( thread ) ) ? sake_formula_status( new_formula, mt ) : NIL;
      if( NIL == $sake_suppress_unviableP$.getDynamicValue( thread ) || NIL != sake_viableP( formula_status ) )
      {
        return ConsesLow.list( ConsesLow.list( $kw98$EDIT_FORMULA, formula, ConsesLow.list( $kw64$MT, mt ), ConsesLow.listS( $kw99$NEW_FORMULA, new_formula, ConsesLow.list( $kw64$MT, mt ), ConsesLow.append(
            formula_status, NIL ) ), strategy, tactics, skills ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 15768L)
  public static SubLObject sake_fix_change_formula_term(final SubLObject wff_module, final SubLObject predicate, final SubLObject arg, final SubLObject col, final SubLObject formula, final SubLObject mt,
      final SubLObject strategy)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != accessible_wf_fixP( wff_module, strategy, $kw100$CHANGE_TERM ) )
    {
      final SubLObject tactics = $list101;
      final SubLObject skills = $list95;
      final SubLObject new_formula = conses_high.subst( $sym102$_NEW_TERM, arg, formula, UNPROVIDED, UNPROVIDED );
      final SubLObject constraint_formula = ConsesLow.list( $const68$ist, mt, ConsesLow.list( $const103$knownSentence, ConsesLow.list( predicate, $sym102$_NEW_TERM, col ) ) );
      final SubLObject use_preference = ConsesLow.list( $const104$conceptuallyRelated, $sym102$_NEW_TERM, arg );
      final SubLObject constraint_status = sake_formula_status( constraint_formula, mt );
      final SubLObject solicit_data = ConsesLow.list( ConsesLow.listS( $kw78$SOLICIT_VARIABLE_BINDING, $sym102$_NEW_TERM, ConsesLow.list( $kw71$CONSTRAINTS, constraint_formula ), ConsesLow.list( $kw105$PREFERENCES,
          use_preference ), ConsesLow.append( constraint_status, NIL ) ) );
      if( NIL == $sake_suppress_unviableP$.getDynamicValue( thread ) || NIL != sake_viableP( constraint_status ) )
      {
        return ConsesLow.list( ConsesLow.list( $kw98$EDIT_FORMULA, formula, ConsesLow.list( $kw64$MT, mt ), ConsesLow.listS( $kw99$NEW_FORMULA, new_formula, ConsesLow.list( $kw64$MT, mt ), ConsesLow.append( solicit_data,
            NIL ) ), strategy, tactics, skills ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 16696L)
  public static SubLObject sake_fix_change_formula_relation(final SubLObject wff_module, final SubLObject relation, final SubLObject argnum, final SubLObject arg, final SubLObject formula, final SubLObject mt,
      final SubLObject strategy)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != accessible_wf_fixP( wff_module, strategy, $kw106$CHANGE_RELATION ) )
    {
      final SubLObject tactics = $list107;
      final SubLObject skills = $list95;
      final SubLObject new_formula = conses_high.subst( $sym108$_NEW_RELATION, relation, formula, UNPROVIDED, UNPROVIDED );
      final SubLObject args = cycl_utilities.formula_args( formula, UNPROVIDED );
      final SubLObject other_args = list_utilities.remove_nth( argnum, args );
      final SubLObject candidates = ( NIL != list_utilities.singletonP( other_args ) ) ? ke_tools.legal_preds_of_forts_isa( arg, other_args.first(), UNPROVIDED ) : NIL;
      final SubLObject min_candidates = ( NIL != candidates ) ? genl_predicates.min_predicates( candidates, mt, UNPROVIDED ) : NIL;
      final SubLObject candidate_count = ( NIL != candidates && Sequences.length( min_candidates ).numG( $sake_candidate_threshold$.getDynamicValue( thread ) ) ) ? Sequences.length( candidates ) : NIL;
      final SubLObject promissing = promissing_relation_analogs( relation, mt );
      SubLObject solicit_data = NIL;
      if( NIL != promissing )
      {
        solicit_data = ConsesLow.cons( ConsesLow.cons( $kw109$PROMISSING_BINDINGS, promissing ), solicit_data );
      }
      if( NIL != candidate_count )
      {
        solicit_data = ConsesLow.cons( ConsesLow.list( $kw110$CANDIDATE_COUNT, candidate_count ), solicit_data );
      }
      else if( NIL != min_candidates )
      {
        solicit_data = ConsesLow.cons( reader.bq_cons( $kw111$MIN_CANDIDATES, ConsesLow.append( min_candidates, NIL ) ), solicit_data );
      }
      solicit_data = ConsesLow.cons( ConsesLow.list( $kw71$CONSTRAINTS, ConsesLow.list( $const68$ist, mt, ConsesLow.list( $const112$admittedArgument, $sym108$_NEW_RELATION, arg, argnum ) ) ), solicit_data );
      solicit_data = ConsesLow.list( ConsesLow.listS( $kw78$SOLICIT_VARIABLE_BINDING, $sym108$_NEW_RELATION, ConsesLow.append( solicit_data, NIL ) ) );
      return ConsesLow.list( ConsesLow.list( $kw98$EDIT_FORMULA, formula, ConsesLow.list( $kw64$MT, mt ), ConsesLow.listS( $kw99$NEW_FORMULA, new_formula, ConsesLow.list( $kw64$MT, mt ), ConsesLow.append( solicit_data,
          NIL ) ), strategy, tactics, skills ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 18330L)
  public static SubLObject sake_fix_weaken_formula_relation(final SubLObject wff_module, final SubLObject relation, final SubLObject argnum, final SubLObject arg, final SubLObject formula, final SubLObject mt,
      final SubLObject strategy)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != accessible_wf_fixP( wff_module, strategy, $kw113$WEAKEN_RELATION ) && NIL != fort_types_interface.predicateP( relation ) )
    {
      final SubLObject tactics = $list114;
      final SubLObject skills = $list95;
      final SubLObject new_formula = el_utilities.make_el_formula( $sym115$_NEW_PREDICATE, cycl_utilities.formula_args( formula, UNPROVIDED ), UNPROVIDED );
      final SubLObject min_candidates = ( NIL != forts.fort_p( arg ) ) ? at_utilities.min_genl_preds_admitting_fort_as_arg( arg, argnum, relation, mt ) : NIL;
      final SubLObject candidate_count = Sequences.length( min_candidates ).numG( $sake_candidate_threshold$.getDynamicValue( thread ) ) ? Sequences.length( min_candidates ) : NIL;
      SubLObject solicit_data = NIL;
      if( NIL != min_candidates )
      {
        solicit_data = ConsesLow.cons( reader.bq_cons( $kw111$MIN_CANDIDATES, ConsesLow.append( min_candidates, NIL ) ), solicit_data );
      }
      else if( NIL != candidate_count )
      {
        solicit_data = ConsesLow.cons( ConsesLow.list( $kw110$CANDIDATE_COUNT, candidate_count ), solicit_data );
      }
      solicit_data = ConsesLow.cons( ConsesLow.list( $kw71$CONSTRAINTS, ConsesLow.list( $const68$ist, mt, ConsesLow.list( $const116$and, ConsesLow.listS( $const117$genlPreds, relation, $list118 ), ConsesLow.list(
          $const112$admittedArgument, $sym115$_NEW_PREDICATE, arg, argnum ) ) ) ), solicit_data );
      solicit_data = ConsesLow.list( ConsesLow.listS( $kw78$SOLICIT_VARIABLE_BINDING, $sym115$_NEW_PREDICATE, ConsesLow.append( solicit_data, NIL ) ) );
      return ConsesLow.list( ConsesLow.list( $kw98$EDIT_FORMULA, formula, ConsesLow.list( $kw64$MT, mt ), ConsesLow.listS( $kw99$NEW_FORMULA, new_formula, ConsesLow.list( $kw64$MT, mt ), $list119, ConsesLow.append(
          solicit_data, NIL ) ), strategy, tactics, skills ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 19628L)
  public static SubLObject sake_fix_change_formula_mt(final SubLObject wff_module, final SubLObject predicate, final SubLObject arg, final SubLObject col, final SubLObject formula, final SubLObject mt,
      final SubLObject strategy)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != accessible_wf_fixP( wff_module, strategy, $kw120$CHANGE_MT ) )
    {
      final SubLObject tactics = $list121;
      final SubLObject skills = $list95;
      SubLObject solicit_data = NIL;
      SubLObject candidate_mts = NIL;
      SubLObject candidate_count = NIL;
      if( predicate.eql( $const2$isa ) )
      {
        candidate_mts = isa.max_floor_mts_of_isa_paths( arg, col, UNPROVIDED );
      }
      else if( predicate.eql( $const6$genls ) )
      {
        candidate_mts = genls.max_floor_mts_of_genls_paths( arg, col, UNPROVIDED );
      }
      if( NIL != candidate_mts )
      {
        if( Sequences.length( candidate_mts ).numG( $sake_candidate_threshold$.getDynamicValue( thread ) ) )
        {
          candidate_count = Sequences.length( candidate_mts );
        }
        if( NIL != candidate_count )
        {
          solicit_data = ConsesLow.cons( ConsesLow.list( $kw110$CANDIDATE_COUNT, candidate_count ), solicit_data );
        }
        else if( NIL != candidate_mts )
        {
          solicit_data = ConsesLow.cons( reader.bq_cons( $kw122$MAX_CANDIDATES, ConsesLow.append( candidate_mts, NIL ) ), solicit_data );
        }
        solicit_data = ConsesLow.list( ConsesLow.listS( $kw78$SOLICIT_VARIABLE_BINDING, $sym115$_NEW_PREDICATE, ConsesLow.append( solicit_data, NIL ) ) );
        return ConsesLow.list( ConsesLow.listS( $kw123$CHANGE_FORMULA_MT, formula, ConsesLow.list( $kw124$FROM_MT, mt ), $list125, ConsesLow.append( solicit_data, ConsesLow.list( strategy, tactics, skills ) ) ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 20608L)
  public static SubLObject sake_fix_retract_formula(final SubLObject wff_module, final SubLObject formula, final SubLObject mt, final SubLObject strategy)
  {
    if( NIL != accessible_wf_fixP( wff_module, strategy, $kw126$RETRACT_FORMULA ) )
    {
      final SubLObject tactics = $list127;
      final SubLObject skills = $list95;
      return ConsesLow.list( ConsesLow.list( $kw126$RETRACT_FORMULA, formula, ConsesLow.list( $kw64$MT, mt ), strategy, tactics, skills ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 20927L)
  public static SubLObject sake_fix_weaken_arg_type_constraint(final SubLObject wff_module, final SubLObject predicate, final SubLObject arg, final SubLObject col, final SubLObject mt, final SubLObject formula,
      final SubLObject constraint_mt, final SubLObject strategy)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != accessible_wf_fixP( wff_module, strategy, $kw128$WEAKEN_CONSTRAINT ) )
    {
      final SubLObject tactics = $list129;
      final SubLObject skills = $list81;
      final SubLObject new_formula = conses_high.subst( $sym130$_NEW_COL, col, formula, UNPROVIDED, UNPROVIDED );
      final SubLObject constraint_formula = ConsesLow.list( $const68$ist, mt, ConsesLow.list( $const103$knownSentence, ConsesLow.list( $const116$and, ConsesLow.listS( $const6$genls, col, $list131 ), ConsesLow.listS(
          predicate, arg, $list131 ) ) ) );
      final SubLObject constraint_status = sake_formula_status( constraint_formula, mt );
      SubLObject min_candidates = NIL;
      if( NIL == $sake_suppress_unviableP$.getDynamicValue( thread ) || NIL != sake_viableP( constraint_status ) )
      {
        if( predicate.eql( $const2$isa ) )
        {
          min_candidates = min_isa_covering( arg, col, mt );
        }
        else if( predicate.eql( $const6$genls ) )
        {
          min_candidates = genls.min_ceiling_cols( ConsesLow.list( arg, col ), NIL, mt, UNPROVIDED );
        }
        if( NIL != min_candidates )
        {
          final SubLObject candidate_count = Sequences.length( min_candidates ).numG( $sake_candidate_threshold$.getDynamicValue( thread ) ) ? Sequences.length( min_candidates ) : NIL;
          SubLObject solicit_data = NIL;
          if( NIL != candidate_count )
          {
            solicit_data = ConsesLow.cons( ConsesLow.list( $kw110$CANDIDATE_COUNT, candidate_count ), solicit_data );
          }
          else if( NIL != min_candidates )
          {
            solicit_data = ConsesLow.cons( reader.bq_cons( $kw111$MIN_CANDIDATES, ConsesLow.append( min_candidates, NIL ) ), solicit_data );
          }
          solicit_data = ConsesLow.cons( ConsesLow.listS( $kw71$CONSTRAINTS, constraint_formula, ConsesLow.append( constraint_status, NIL ) ), solicit_data );
          solicit_data = ConsesLow.list( ConsesLow.listS( $kw78$SOLICIT_VARIABLE_BINDING, $sym130$_NEW_COL, ConsesLow.append( solicit_data, NIL ) ) );
          return ConsesLow.list( ConsesLow.list( $kw132$EDIT_ASSERTION, formula, ConsesLow.list( $kw64$MT, constraint_mt ), ConsesLow.listS( $kw99$NEW_FORMULA, new_formula, ConsesLow.list( $kw64$MT, constraint_mt ),
              $list119, ConsesLow.append( solicit_data, NIL ) ), strategy, tactics, skills ) );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 22404L)
  public static SubLObject sake_fix_change_arg_type_constraint(final SubLObject wff_module, final SubLObject predicate, final SubLObject arg, final SubLObject col, final SubLObject mt, final SubLObject formula,
      final SubLObject constraint_mt, final SubLObject strategy)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != accessible_wf_fixP( wff_module, strategy, $kw133$CHANGE_CONSTRAINT ) )
    {
      final SubLObject tactics = $list134;
      final SubLObject skills = $list81;
      final SubLObject new_formula = conses_high.subst( $sym130$_NEW_COL, col, formula, UNPROVIDED, UNPROVIDED );
      final SubLObject constraint_formula = ConsesLow.list( $const68$ist, mt, ConsesLow.list( $const103$knownSentence, ConsesLow.listS( predicate, arg, $list131 ) ) );
      final SubLObject constraint_status = sake_formula_status( constraint_formula, mt );
      if( NIL == $sake_suppress_unviableP$.getDynamicValue( thread ) || NIL != sake_viableP( constraint_status ) )
      {
        final SubLObject min_candidates = ( NIL != forts.fort_p( arg ) ) ? isa.min_isa( arg, mt, UNPROVIDED ) : NIL;
        final SubLObject candidate_count = Sequences.length( min_candidates ).numG( $sake_candidate_threshold$.getDynamicValue( thread ) ) ? Sequences.length( min_candidates ) : NIL;
        SubLObject solicit_data = NIL;
        if( NIL != candidate_count )
        {
          solicit_data = ConsesLow.cons( ConsesLow.list( $kw110$CANDIDATE_COUNT, candidate_count ), solicit_data );
        }
        else if( NIL != min_candidates )
        {
          solicit_data = ConsesLow.cons( reader.bq_cons( $kw111$MIN_CANDIDATES, ConsesLow.append( min_candidates, NIL ) ), solicit_data );
        }
        solicit_data = ConsesLow.cons( ConsesLow.listS( $kw71$CONSTRAINTS, constraint_formula, ConsesLow.append( constraint_status, NIL ) ), solicit_data );
        solicit_data = ConsesLow.list( ConsesLow.listS( $kw78$SOLICIT_VARIABLE_BINDING, $sym130$_NEW_COL, ConsesLow.append( solicit_data, NIL ) ) );
        return ConsesLow.list( ConsesLow.list( $kw132$EDIT_ASSERTION, formula, ConsesLow.list( $kw64$MT, constraint_mt ), ConsesLow.listS( $kw99$NEW_FORMULA, new_formula, ConsesLow.list( $kw64$MT, constraint_mt ),
            ConsesLow.append( solicit_data, NIL ) ), strategy, tactics, skills ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 23675L)
  public static SubLObject sake_fix_unassert_constraint(final SubLObject wff_module, final SubLObject formula, final SubLObject mt, final SubLObject strategy)
  {
    if( NIL != accessible_wf_fixP( wff_module, strategy, $kw135$UNASSERT_CONSTRAINT ) )
    {
      final SubLObject tactics = $list121;
      final SubLObject skills = $list81;
      return ConsesLow.list( ConsesLow.list( $kw136$UNASSERT, formula, ConsesLow.list( $kw64$MT, mt ), strategy, tactics, skills ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 23989L)
  public static SubLObject sake_fix_change_constraint_mt(final SubLObject wff_module, final SubLObject mt, final SubLObject formula, final SubLObject constraint_mt, final SubLObject strategy)
  {
    if( NIL != accessible_wf_fixP( wff_module, strategy, $kw120$CHANGE_MT ) )
    {
      final SubLObject tactics = $list121;
      final SubLObject skills = $list81;
      final SubLObject solicit_data = ConsesLow.list( ConsesLow.list( $kw78$SOLICIT_VARIABLE_BINDING, $sym137$_NEW_MT, ConsesLow.list( $kw71$CONSTRAINTS, ConsesLow.list( $const138$unknownSentence, ConsesLow.listS(
          $const139$genlMt, mt, $list140 ) ) ) ) );
      return ConsesLow.list( ConsesLow.listS( $kw141$CHANGE_ASSERTION_MT, formula, ConsesLow.list( $kw124$FROM_MT, constraint_mt ), $list125, ConsesLow.append( solicit_data, ConsesLow.list( strategy, tactics,
          skills ) ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 24490L)
  public static SubLObject sake_fix_deny_constraint_applies_to_spec_pred(final SubLObject wff_module, final SubLObject relation, final SubLObject mt, final SubLObject via_genl_pred, final SubLObject strategy)
  {
    if( NIL != via_genl_pred && NIL != accessible_wf_fixP( wff_module, strategy, $kw142$DENY_HL_SUPPORT ) && NIL != fort_types_interface.predicateP( relation ) )
    {
      final SubLObject tactics = $list143;
      final SubLObject skills = $list81;
      final SubLObject genl_preds_literal = ConsesLow.list( $const117$genlPreds, relation, via_genl_pred );
      final SubLObject genl_pred_support = arguments.make_hl_support( $kw144$GENLPREDS, genl_preds_literal, mt, UNPROVIDED );
      return ConsesLow.list( ConsesLow.list( $kw142$DENY_HL_SUPPORT, genl_pred_support, strategy, tactics, skills ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 25040L)
  public static SubLObject sake_fix_deny_hl_literal(final SubLObject wff_module, final SubLObject module, final SubLObject literal, final SubLObject mt, final SubLObject strategy)
  {
    if( NIL != accessible_wf_fixP( wff_module, strategy, $kw142$DENY_HL_SUPPORT ) )
    {
      final SubLObject tactics = $list145;
      final SubLObject skills = $list81;
      final SubLObject hl_support = arguments.make_hl_support( module, literal, mt, UNPROVIDED );
      return ConsesLow.list( ConsesLow.list( $kw142$DENY_HL_SUPPORT, hl_support, strategy, tactics, skills ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 25811L)
  public static SubLObject accessible_wf_fixP(SubLObject module, SubLObject strategy, SubLObject tactic)
  {
    if( module == UNPROVIDED )
    {
      module = NIL;
    }
    if( strategy == UNPROVIDED )
    {
      strategy = NIL;
    }
    if( tactic == UNPROVIDED )
    {
      tactic = NIL;
    }
    return makeBoolean( ( NIL == module || NIL != accessible_wf_fix_moduleP( module ) ) && ( NIL == strategy || NIL != accessible_wf_fix_strategyP( strategy ) ) && ( NIL == tactic || NIL != accessible_wf_fix_tacticP(
        tactic ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 26069L)
  public static SubLObject accessible_wf_fix_moduleP(final SubLObject module)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( $kw146$ALL.eql( $accessible_wf_fix_modules$.getDynamicValue( thread ) ) || NIL != subl_promotions.memberP( module, $accessible_wf_fix_modules$.getDynamicValue( thread ), UNPROVIDED,
        UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 26218L)
  public static SubLObject accessible_wf_fix_strategyP(final SubLObject strategy)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( $kw146$ALL.eql( $accessible_wf_fix_strategies$.getDynamicValue( thread ) ) || NIL != subl_promotions.memberP( strategy, $accessible_wf_fix_strategies$.getDynamicValue( thread ), UNPROVIDED,
        UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 26379L)
  public static SubLObject accessible_wf_fix_tacticP(final SubLObject tactic)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( $kw146$ALL.eql( $accessible_wf_fix_tactics$.getDynamicValue( thread ) ) || NIL != subl_promotions.memberP( tactic, $accessible_wf_fix_tactics$.getDynamicValue( thread ), UNPROVIDED,
        UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 26528L)
  public static SubLObject sake_viableP(final SubLObject sake_data)
  {
    return makeBoolean( NIL == list_utilities.tree_find( $kw147$UNVIABLE, sake_data, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 26620L)
  public static SubLObject sake_formula_status(final SubLObject formula, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject formula_status = conses_high.copy_list( sake_formula_consistency_status( formula, mt ) );
    final SubLObject _prev_bind_0 = wff_vars.$provide_wff_suggestionsP$.currentBinding( thread );
    try
    {
      wff_vars.$provide_wff_suggestionsP$.bind( NIL, thread );
      if( NIL != wff.el_wffP( formula, mt, UNPROVIDED ) )
      {
        formula_status = ConsesLow.cons( $list148, formula_status );
      }
      else
      {
        formula_status = ConsesLow.cons( ConsesLow.list( $kw149$WHY_NOT_WFF, wff.why_not_wff( formula, mt, UNPROVIDED ) ), formula_status );
      }
    }
    finally
    {
      wff_vars.$provide_wff_suggestionsP$.rebind( _prev_bind_0, thread );
    }
    if( NIL != list_utilities.tree_find( $kw149$WHY_NOT_WFF, formula_status, UNPROVIDED, UNPROVIDED ) || NIL != list_utilities.tree_find( $kw150$WHY_NOT_CONSISTENT, formula_status, UNPROVIDED, UNPROVIDED ) )
    {
      formula_status = ConsesLow.cons( $list151, formula_status );
    }
    return Sequences.nreverse( formula_status );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 27142L)
  public static SubLObject sake_formula_consistency_status(final SubLObject formula, final SubLObject mt)
  {
    final SubLObject pcase_var;
    final SubLObject relation = pcase_var = cycl_utilities.formula_arg0( formula );
    if( pcase_var.eql( $const68$ist ) )
    {
      return sake_formula_consistency_status( cycl_utilities.formula_arg2( formula, UNPROVIDED ), cycl_utilities.formula_arg1( formula, UNPROVIDED ) );
    }
    if( pcase_var.eql( $const103$knownSentence ) || pcase_var.eql( $const138$unknownSentence ) )
    {
      return sake_formula_consistency_status( cycl_utilities.formula_arg1( formula, UNPROVIDED ), mt );
    }
    if( pcase_var.eql( $const116$and ) )
    {
      SubLObject result = NIL;
      SubLObject cdolist_list_var = cycl_utilities.formula_args( formula, UNPROVIDED );
      SubLObject conjunct = NIL;
      conjunct = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject item_var = sake_formula_consistency_status( conjunct, mt );
        if( NIL == conses_high.member( item_var, result, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          result = ConsesLow.cons( item_var, result );
        }
        cdolist_list_var = cdolist_list_var.rest();
        conjunct = cdolist_list_var.first();
      }
      return result;
    }
    if( NIL == el_utilities.closedP( formula, $sym152$CYC_VAR_ ) )
    {
      return $list154;
    }
    final SubLObject pcase_var_$1 = relation;
    if( pcase_var_$1.eql( $const2$isa ) )
    {
      final SubLObject v_term = cycl_utilities.formula_arg1( formula, UNPROVIDED );
      final SubLObject col = cycl_utilities.formula_arg2( formula, UNPROVIDED );
      if( NIL != isa.not_isaP( v_term, col, mt, UNPROVIDED ) )
      {
        return ConsesLow.list( ConsesLow.list( $kw150$WHY_NOT_CONSISTENT, isa.why_not_isaP( v_term, col, mt, UNPROVIDED, UNPROVIDED ) ) );
      }
      return $list153;
    }
    else if( pcase_var_$1.eql( $const6$genls ) )
    {
      final SubLObject v_term = cycl_utilities.formula_arg1( formula, UNPROVIDED );
      final SubLObject col = cycl_utilities.formula_arg2( formula, UNPROVIDED );
      if( NIL != genls.not_genlP( v_term, col, mt, UNPROVIDED ) )
      {
        return ConsesLow.list( ConsesLow.list( $kw150$WHY_NOT_CONSISTENT, genls.why_not_genlP( v_term, col, mt, UNPROVIDED, UNPROVIDED ) ) );
      }
      return $list153;
    }
    else
    {
      if( NIL != fi.fi_ask_int( cycl_utilities.negate( formula ), mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        return ConsesLow.list( ConsesLow.list( $kw150$WHY_NOT_CONSISTENT, fi.fi_justify_int( cycl_utilities.negate( formula ), mt, UNPROVIDED ) ) );
      }
      return $list153;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 28429L)
  public static SubLObject promissing_relation_analogs(final SubLObject rel, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLObject promissing_via_expansion_inverses = promissing_relation_analogs_via_contractions( rel, mt );
    return promissing_via_expansion_inverses;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 28717L)
  public static SubLObject promissing_relation_analogs_via_contractions(final SubLObject relation, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_3 = control_vars.$mapping_answer$.currentBinding( thread );
    final SubLObject _prev_bind_4 = $target_relation$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      control_vars.$mapping_answer$.bind( NIL, thread );
      $target_relation$.bind( relation, thread );
      kb_mapping.map_other_index( $sym155$GATHER_CONTRACTIONS_INT, relation, $kw156$TRUE, T );
      result = control_vars.$mapping_answer$.getDynamicValue( thread );
    }
    finally
    {
      $target_relation$.rebind( _prev_bind_4, thread );
      control_vars.$mapping_answer$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 29034L)
  public static SubLObject gather_contractions_int(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject predicate = assertions_high.gaf_arg0( assertion );
    if( predicate.eql( $const157$expansion ) && NIL != list_utilities.tree_find_if( Symbols.symbol_function( $sym158$TARGET_RELATION_EXPRESSION_ ), assertions_high.gaf_arg2( assertion ), UNPROVIDED ) )
    {
      control_vars.$mapping_answer$.setDynamicValue( ConsesLow.cons( ConsesLow.list( assertions_high.gaf_arg1( assertion ), ConsesLow.list( $kw159$SOURCE, assertion ) ), control_vars.$mapping_answer$.getDynamicValue(
          thread ) ), thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 29343L)
  public static SubLObject target_relation_expressionP(final SubLObject formula)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != el_utilities.el_formula_p( formula ) )
    {
      return Equality.eql( cycl_utilities.formula_arg0( formula ), $target_relation$.getDynamicValue( thread ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 29627L)
  public static SubLObject min_isa_covering(final SubLObject v_term, final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    SubLObject result = NIL;
    SubLObject cdolist_list_var = isa.min_isa( v_term, mt, UNPROVIDED );
    SubLObject v_isa = NIL;
    v_isa = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      result = conses_high.nunion( result, genls.min_ceiling_cols( ConsesLow.list( v_isa, collection ), NIL, mt, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      v_isa = cdolist_list_var.first();
    }
    return genls.min_cols( result, UNPROVIDED, UNPROVIDED );
  }

  public static SubLObject declare_wff_suggest_file()
  {
    SubLFiles.declareFunction( me, "non_wffness_repairs", "NON-WFFNESS-REPAIRS", 2, 0, false );
    SubLFiles.declareFunction( me, "wff_violations_repairs", "WFF-VIOLATIONS-REPAIRS", 1, 0, false );
    SubLFiles.declareFunction( me, "suggestions_for_mal_arg_wrt_arg_isa", "SUGGESTIONS-FOR-MAL-ARG-WRT-ARG-ISA", 1, 1, false );
    SubLFiles.declareFunction( me, "suggestions_for_mal_arg_wrt_arg_not_isa_disjoint", "SUGGESTIONS-FOR-MAL-ARG-WRT-ARG-NOT-ISA-DISJOINT", 1, 1, false );
    SubLFiles.declareFunction( me, "suggestions_for_mal_arg_wrt_arg_genl", "SUGGESTIONS-FOR-MAL-ARG-WRT-ARG-GENL", 1, 1, false );
    SubLFiles.declareFunction( me, "sake_fix_arg_isa_via_make_it_so", "SAKE-FIX-ARG-ISA-VIA-MAKE-IT-SO", 4, 0, false );
    SubLFiles.declareFunction( me, "sake_fix_arg_isa_disjoint_via_make_it_unknown", "SAKE-FIX-ARG-ISA-DISJOINT-VIA-MAKE-IT-UNKNOWN", 4, 0, false );
    SubLFiles.declareFunction( me, "sake_fix_arg_genl_via_make_it_so", "SAKE-FIX-ARG-GENL-VIA-MAKE-IT-SO", 4, 0, false );
    SubLFiles.declareFunction( me, "sake_fix_arg_type_via_make_exception", "SAKE-FIX-ARG-TYPE-VIA-MAKE-EXCEPTION", 4, 0, false );
    SubLFiles.declareFunction( me, "sake_fix_arg_type_via_correct_formula", "SAKE-FIX-ARG-TYPE-VIA-CORRECT-FORMULA", 8, 0, false );
    SubLFiles.declareFunction( me, "sake_fix_via_deny_constraint_applicability", "SAKE-FIX-VIA-DENY-CONSTRAINT-APPLICABILITY", 6, 0, false );
    SubLFiles.declareFunction( me, "sake_fix_arg_type_via_correct_constraint", "SAKE-FIX-ARG-TYPE-VIA-CORRECT-CONSTRAINT", 7, 0, false );
    SubLFiles.declareFunction( me, "sake_fix_assert_gaf2", "SAKE-FIX-ASSERT-GAF2", 6, 0, false );
    SubLFiles.declareFunction( me, "sake_fix_edit_sufficient_defn", "SAKE-FIX-EDIT-SUFFICIENT-DEFN", 5, 0, false );
    SubLFiles.declareFunction( me, "sake_fix_solicit_sufficient_defn", "SAKE-FIX-SOLICIT-SUFFICIENT-DEFN", 5, 0, false );
    SubLFiles.declareFunction( me, "sake_fix_assert_arg_except_for", "SAKE-FIX-ASSERT-ARG-EXCEPT-FOR", 5, 0, false );
    SubLFiles.declareFunction( me, "sake_fix_assert_arg_except_when", "SAKE-FIX-ASSERT-ARG-EXCEPT-WHEN", 5, 0, false );
    SubLFiles.declareFunction( me, "sake_fix_change_formula_level", "SAKE-FIX-CHANGE-FORMULA-LEVEL", 9, 0, false );
    SubLFiles.declareFunction( me, "sake_fix_change_formula_term", "SAKE-FIX-CHANGE-FORMULA-TERM", 7, 0, false );
    SubLFiles.declareFunction( me, "sake_fix_change_formula_relation", "SAKE-FIX-CHANGE-FORMULA-RELATION", 7, 0, false );
    SubLFiles.declareFunction( me, "sake_fix_weaken_formula_relation", "SAKE-FIX-WEAKEN-FORMULA-RELATION", 7, 0, false );
    SubLFiles.declareFunction( me, "sake_fix_change_formula_mt", "SAKE-FIX-CHANGE-FORMULA-MT", 7, 0, false );
    SubLFiles.declareFunction( me, "sake_fix_retract_formula", "SAKE-FIX-RETRACT-FORMULA", 4, 0, false );
    SubLFiles.declareFunction( me, "sake_fix_weaken_arg_type_constraint", "SAKE-FIX-WEAKEN-ARG-TYPE-CONSTRAINT", 8, 0, false );
    SubLFiles.declareFunction( me, "sake_fix_change_arg_type_constraint", "SAKE-FIX-CHANGE-ARG-TYPE-CONSTRAINT", 8, 0, false );
    SubLFiles.declareFunction( me, "sake_fix_unassert_constraint", "SAKE-FIX-UNASSERT-CONSTRAINT", 4, 0, false );
    SubLFiles.declareFunction( me, "sake_fix_change_constraint_mt", "SAKE-FIX-CHANGE-CONSTRAINT-MT", 5, 0, false );
    SubLFiles.declareFunction( me, "sake_fix_deny_constraint_applies_to_spec_pred", "SAKE-FIX-DENY-CONSTRAINT-APPLIES-TO-SPEC-PRED", 5, 0, false );
    SubLFiles.declareFunction( me, "sake_fix_deny_hl_literal", "SAKE-FIX-DENY-HL-LITERAL", 5, 0, false );
    SubLFiles.declareFunction( me, "accessible_wf_fixP", "ACCESSIBLE-WF-FIX?", 0, 3, false );
    SubLFiles.declareFunction( me, "accessible_wf_fix_moduleP", "ACCESSIBLE-WF-FIX-MODULE?", 1, 0, false );
    SubLFiles.declareFunction( me, "accessible_wf_fix_strategyP", "ACCESSIBLE-WF-FIX-STRATEGY?", 1, 0, false );
    SubLFiles.declareFunction( me, "accessible_wf_fix_tacticP", "ACCESSIBLE-WF-FIX-TACTIC?", 1, 0, false );
    SubLFiles.declareFunction( me, "sake_viableP", "SAKE-VIABLE?", 1, 0, false );
    SubLFiles.declareFunction( me, "sake_formula_status", "SAKE-FORMULA-STATUS", 2, 0, false );
    SubLFiles.declareFunction( me, "sake_formula_consistency_status", "SAKE-FORMULA-CONSISTENCY-STATUS", 2, 0, false );
    SubLFiles.declareFunction( me, "promissing_relation_analogs", "PROMISSING-RELATION-ANALOGS", 1, 1, false );
    SubLFiles.declareFunction( me, "promissing_relation_analogs_via_contractions", "PROMISSING-RELATION-ANALOGS-VIA-CONTRACTIONS", 1, 1, false );
    SubLFiles.declareFunction( me, "gather_contractions_int", "GATHER-CONTRACTIONS-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "target_relation_expressionP", "TARGET-RELATION-EXPRESSION?", 1, 0, false );
    SubLFiles.declareFunction( me, "min_isa_covering", "MIN-ISA-COVERING", 2, 1, false );
    return NIL;
  }

  public static SubLObject init_wff_suggest_file()
  {
    $sake_candidate_threshold$ = SubLFiles.defparameter( "*SAKE-CANDIDATE-THRESHOLD*", TEN_INTEGER );
    $sake_suppress_unviableP$ = SubLFiles.defparameter( "*SAKE-SUPPRESS-UNVIABLE?*", T );
    $accessible_wf_fix_modules$ = SubLFiles.defparameter( "*ACCESSIBLE-WF-FIX-MODULES*", $kw146$ALL );
    $accessible_wf_fix_strategies$ = SubLFiles.defparameter( "*ACCESSIBLE-WF-FIX-STRATEGIES*", $kw146$ALL );
    $accessible_wf_fix_tactics$ = SubLFiles.defparameter( "*ACCESSIBLE-WF-FIX-TACTICS*", $kw146$ALL );
    $target_relation$ = SubLFiles.defparameter( "*TARGET-RELATION*", NIL );
    return NIL;
  }

  public static SubLObject setup_wff_suggest_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_wff_suggest_file();
  }

  @Override
  public void initializeVariables()
  {
    init_wff_suggest_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_wff_suggest_file();
  }
  static
  {
    me = new wff_suggest();
    $sake_candidate_threshold$ = null;
    $sake_suppress_unviableP$ = null;
    $accessible_wf_fix_modules$ = null;
    $accessible_wf_fix_strategies$ = null;
    $accessible_wf_fix_tactics$ = null;
    $target_relation$ = null;
    $kw0$MAL_ARG_WRT_ARG_ISA = makeKeyword( "MAL-ARG-WRT-ARG-ISA" );
    $list1 = ConsesLow.listS( makeSymbol( "WFF-MODULE" ), new SubLObject[] { makeSymbol( "ARG" ), makeSymbol( "RELN" ), makeSymbol( "POS" ), makeSymbol( "COL" ), makeSymbol( "MT" ), makeSymbol( "DATA" )
    } );
    $const2$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $kw3$MAL_ARG_WRT_ARG_QUOTED_ISA = makeKeyword( "MAL-ARG-WRT-ARG-QUOTED-ISA" );
    $const4$quotedIsa = constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) );
    $kw5$MAL_ARG_WRT_ARG_GENLS = makeKeyword( "MAL-ARG-WRT-ARG-GENLS" );
    $const6$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $kw7$MAL_ARG_WRT_ARG_NOT_ISA_DISJOINT = makeKeyword( "MAL-ARG-WRT-ARG-NOT-ISA-DISJOINT" );
    $kw8$MAL_ARG_WRT_ARG_NOT_QUOTED_ISA_DISJOINT = makeKeyword( "MAL-ARG-WRT-ARG-NOT-QUOTED-ISA-DISJOINT" );
    $kw9$MAL_ARG_WRT_ARG_NOT_GENLS_DISJOINT = makeKeyword( "MAL-ARG-WRT-ARG-NOT-GENLS-DISJOINT" );
    $kw10$MAL_ARG_WRT_INTER_ARG_ISA = makeKeyword( "MAL-ARG-WRT-INTER-ARG-ISA" );
    $kw11$MAL_ARG_WRT_INTER_ARG_NOT_ISA = makeKeyword( "MAL-ARG-WRT-INTER-ARG-NOT-ISA" );
    $kw12$MAL_ARG_WRT_INTER_ARG_GENL = makeKeyword( "MAL-ARG-WRT-INTER-ARG-GENL" );
    $kw13$MAL_ARG_WRT_INTER_ARG_NOT_ISA_DISJOINT = makeKeyword( "MAL-ARG-WRT-INTER-ARG-NOT-ISA-DISJOINT" );
    $kw14$MAL_ARG_WRT_INTER_ARG_NOT_GENL_DISJOINT = makeKeyword( "MAL-ARG-WRT-INTER-ARG-NOT-GENL-DISJOINT" );
    $kw15$MAL_ARG_WRT_ARG_FORMAT = makeKeyword( "MAL-ARG-WRT-ARG-FORMAT" );
    $kw16$MAL_ARG_WRT_INTER_ARG_FORMAT = makeKeyword( "MAL-ARG-WRT-INTER-ARG-FORMAT" );
    $kw17$MAL_ARG_WRT_INTER_ARG_DIFFERENT = makeKeyword( "MAL-ARG-WRT-INTER-ARG-DIFFERENT" );
    $list18 = ConsesLow.list( new SubLObject[] { makeSymbol( "WFF-MODULE" ), makeSymbol( "RELN" ), makeSymbol( "ARG1" ), makeSymbol( "PSN1" ), makeSymbol( "ARG2" ), makeSymbol( "PSN2" ), makeSymbol( "MT" ), makeSymbol(
        "&OPTIONAL" ), makeSymbol( "VIA" )
    } );
    $const19$different = constant_handles.reader_make_constant_shell( makeString( "different" ) );
    $kw20$MAL_RELN_WRT_ARG_ISA_REQUIRED = makeKeyword( "MAL-RELN-WRT-ARG-ISA-REQUIRED" );
    $kw21$CONFLICT_ASSERTING_TRUE_SBHL = makeKeyword( "CONFLICT-ASSERTING-TRUE-SBHL" );
    $kw22$CONFLICT_ASSERTING_FALSE_SBHL = makeKeyword( "CONFLICT-ASSERTING-FALSE-SBHL" );
    $kw23$DISJOINT_ARG_ISA = makeKeyword( "DISJOINT-ARG-ISA" );
    $kw24$DISJOINT_ARG_QUOTED_ISA = makeKeyword( "DISJOINT-ARG-QUOTED-ISA" );
    $kw25$DISJOINT_ARG_GENL = makeKeyword( "DISJOINT-ARG-GENL" );
    $kw26$RESTRICTED_SKOLEM_ASSERTION = makeKeyword( "RESTRICTED-SKOLEM-ASSERTION" );
    $kw27$RESTRICTED_PREDICATE_ASSERTION = makeKeyword( "RESTRICTED-PREDICATE-ASSERTION" );
    $kw28$RESTRICTED_COLLECTION_ASSERTION = makeKeyword( "RESTRICTED-COLLECTION-ASSERTION" );
    $kw29$RESTRICTED_MT_ASSERTION = makeKeyword( "RESTRICTED-MT-ASSERTION" );
    $kw30$EVALUATABLE_LITERAL_FALSE = makeKeyword( "EVALUATABLE-LITERAL-FALSE" );
    $kw31$MAL_PRECANONICALIZATIONS = makeKeyword( "MAL-PRECANONICALIZATIONS" );
    $kw32$INVALID_EXPANSION = makeKeyword( "INVALID-EXPANSION" );
    $kw33$RECURSION_LIMIT_EXCEEDED = makeKeyword( "RECURSION-LIMIT-EXCEEDED" );
    $kw34$EL_UNEVALUATABLE_EXPRESSION = makeKeyword( "EL-UNEVALUATABLE-EXPRESSION" );
    $kw35$QUANTIFIED_SEQUENCE_VARIABLE = makeKeyword( "QUANTIFIED-SEQUENCE-VARIABLE" );
    $kw36$TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE = makeKeyword( "TOO-MANY-SEQUENCE-VARS-IN-SKOLEM-SCOPE" );
    $kw37$AMBIGUOUS_VAR_TYPE_IN_SKOLEM_SCOPE = makeKeyword( "AMBIGUOUS-VAR-TYPE-IN-SKOLEM-SCOPE" );
    $kw38$INHIBITED_SEQUENCE_VARIABLE = makeKeyword( "INHIBITED-SEQUENCE-VARIABLE" );
    $kw39$TOO_MANY_COMMUTATIVE_IN_ARGS_AND_REST = makeKeyword( "TOO-MANY-COMMUTATIVE-IN-ARGS-AND-REST" );
    $sym40$GENL_ = makeSymbol( "GENL?" );
    $sym41$FORMULA_ARG2 = makeSymbol( "FORMULA-ARG2" );
    $kw42$EL = makeKeyword( "EL" );
    $list43 = ConsesLow.listS( makeSymbol( "MODULE" ), new SubLObject[] { makeSymbol( "ARG" ), makeSymbol( "RELATION" ), makeSymbol( "ARGNUM" ), makeSymbol( "COL" ), makeSymbol( "MT" ), makeSymbol( "DATA" )
    } );
    $kw44$VIA_GENL_PRED = makeKeyword( "VIA-GENL-PRED" );
    $kw45$WFF_FORMULA = makeKeyword( "WFF-FORMULA" );
    $kw46$NL = makeKeyword( "NL" );
    $str47$dont_know_how_to_describe_fixes_f = makeString( "dont know how to describe fixes for ~a in NL." );
    $kw48$AT_CONSTRAINT_GAF = makeKeyword( "AT-CONSTRAINT-GAF" );
    $kw49$MAKE_IT_SO = makeKeyword( "MAKE-IT-SO" );
    $list50 = ConsesLow.list( makeKeyword( "SAKE-STRATEGY" ), makeKeyword( "SATISFY-CONSTRAINT" ) );
    $kw51$ISA = makeKeyword( "ISA" );
    $kw52$MAKE_EXCEPTION = makeKeyword( "MAKE-EXCEPTION" );
    $list53 = ConsesLow.list( makeKeyword( "SAKE-STRATEGY" ), makeKeyword( "MAKE-EXCPETION" ) );
    $kw54$CORRECT_FORMULA = makeKeyword( "CORRECT-FORMULA" );
    $list55 = ConsesLow.list( makeKeyword( "SAKE-STRATEGY" ), makeKeyword( "CORRECT-FORMULA" ) );
    $kw56$DENY_APPLICABLILITY = makeKeyword( "DENY-APPLICABLILITY" );
    $list57 = ConsesLow.list( makeKeyword( "SAKE-STRATEGY" ), makeKeyword( "DENY-APPLICABLILITY" ) );
    $kw58$CORRECT_CONSTRAINT = makeKeyword( "CORRECT-CONSTRAINT" );
    $list59 = ConsesLow.list( makeKeyword( "SAKE-STRATEGY" ), makeKeyword( "CORRECT-CONSTRAINT" ) );
    $kw60$ASSERT_GAF = makeKeyword( "ASSERT-GAF" );
    $list61 = ConsesLow.list( makeKeyword( "SAKE-TACTICS" ), ConsesLow.list( makeKeyword( "ASSERT-GAF" ), makeSymbol( "PREDICATE" ) ) );
    $list62 = ConsesLow.list( makeKeyword( "USER-SKILLS" ), makeKeyword( "KE-1" ) );
    $kw63$ASSERT = makeKeyword( "ASSERT" );
    $kw64$MT = makeKeyword( "MT" );
    $kw65$EDIT_DEFN = makeKeyword( "EDIT-DEFN" );
    $list66 = ConsesLow.list( makeKeyword( "SAKE-TACTICS" ), makeKeyword( "EDIT-DEFN" ) );
    $list67 = ConsesLow.list( makeKeyword( "USER-SKILLS" ), makeKeyword( "SE-3" ) );
    $const68$ist = constant_handles.reader_make_constant_shell( makeString( "ist" ) );
    $const69$defnAdmits = constant_handles.reader_make_constant_shell( makeString( "defnAdmits" ) );
    $kw70$EDIT_SUBL = makeKeyword( "EDIT-SUBL" );
    $kw71$CONSTRAINTS = makeKeyword( "CONSTRAINTS" );
    $kw72$SOLICIT_DEFN = makeKeyword( "SOLICIT-DEFN" );
    $kw73$ASSERT_DEFN = makeKeyword( "ASSERT-DEFN" );
    $list74 = ConsesLow.list( makeKeyword( "SAKE-TACTICS" ), makeKeyword( "SOLICIT-SUFFICIENT-DEFN" ) );
    $const75$defnSufficient = constant_handles.reader_make_constant_shell( makeString( "defnSufficient" ) );
    $list76 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SubLQuoteFn" ) ), makeSymbol( "?DEFN" ) ) );
    $sym77$_DEFN = makeSymbol( "?DEFN" );
    $kw78$SOLICIT_VARIABLE_BINDING = makeKeyword( "SOLICIT-VARIABLE-BINDING" );
    $kw79$ASSERT_EXCEPT_FOR = makeKeyword( "ASSERT-EXCEPT-FOR" );
    $list80 = ConsesLow.list( makeKeyword( "SAKE-TACTICS" ), ConsesLow.list( makeKeyword( "ASSERT-GAF" ), constant_handles.reader_make_constant_shell( makeString( "exceptFor" ) ) ) );
    $list81 = ConsesLow.list( makeKeyword( "USER-SKILLS" ), makeKeyword( "KE-3" ) );
    $const82$exceptFor = constant_handles.reader_make_constant_shell( makeString( "exceptFor" ) );
    $kw83$ASSERT_EXCEPT_WHEN = makeKeyword( "ASSERT-EXCEPT-WHEN" );
    $list84 = ConsesLow.list( makeKeyword( "SAKE-TACTICS" ), ConsesLow.list( makeKeyword( "ASSERT-GAF" ), constant_handles.reader_make_constant_shell( makeString( "exceptWhen" ) ) ) );
    $const85$implies = constant_handles.reader_make_constant_shell( makeString( "implies" ) );
    $const86$evaluate = constant_handles.reader_make_constant_shell( makeString( "evaluate" ) );
    $sym87$_FORMULA_WRT_ARG = makeSymbol( "?FORMULA-WRT-ARG" );
    $const88$SubstituteFormulaFn = constant_handles.reader_make_constant_shell( makeString( "SubstituteFormulaFn" ) );
    $list89 = ConsesLow.list( ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "?ARG" ) ), makeSymbol( "?FORMULA" ) );
    $list90 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "knownSentence" ) ), makeSymbol( "?FORMULA-WRT-ARG" ) ) );
    $sym91$_FORMULA = makeSymbol( "?FORMULA" );
    $const92$exceptWhen = constant_handles.reader_make_constant_shell( makeString( "exceptWhen" ) );
    $kw93$CHANGE_LEVEL = makeKeyword( "CHANGE-LEVEL" );
    $list94 = ConsesLow.list( makeKeyword( "SAKE-TACTICS" ), makeKeyword( "CHANGE-REFERENCE-LEVEL" ), makeKeyword( "TERM-TO-ALL" ) );
    $list95 = ConsesLow.list( makeKeyword( "USER-SKILLS" ), makeKeyword( "KE-2" ) );
    $const96$relationAllInstance = constant_handles.reader_make_constant_shell( makeString( "relationAllInstance" ) );
    $const97$relationInstanceAll = constant_handles.reader_make_constant_shell( makeString( "relationInstanceAll" ) );
    $kw98$EDIT_FORMULA = makeKeyword( "EDIT-FORMULA" );
    $kw99$NEW_FORMULA = makeKeyword( "NEW-FORMULA" );
    $kw100$CHANGE_TERM = makeKeyword( "CHANGE-TERM" );
    $list101 = ConsesLow.list( makeKeyword( "SAKE-TACTICS" ), makeKeyword( "CHANGE-TERM" ) );
    $sym102$_NEW_TERM = makeSymbol( "?NEW-TERM" );
    $const103$knownSentence = constant_handles.reader_make_constant_shell( makeString( "knownSentence" ) );
    $const104$conceptuallyRelated = constant_handles.reader_make_constant_shell( makeString( "conceptuallyRelated" ) );
    $kw105$PREFERENCES = makeKeyword( "PREFERENCES" );
    $kw106$CHANGE_RELATION = makeKeyword( "CHANGE-RELATION" );
    $list107 = ConsesLow.list( makeKeyword( "SAKE-TACTICS" ), makeKeyword( "CHANGE-RELATION" ) );
    $sym108$_NEW_RELATION = makeSymbol( "?NEW-RELATION" );
    $kw109$PROMISSING_BINDINGS = makeKeyword( "PROMISSING-BINDINGS" );
    $kw110$CANDIDATE_COUNT = makeKeyword( "CANDIDATE-COUNT" );
    $kw111$MIN_CANDIDATES = makeKeyword( "MIN-CANDIDATES" );
    $const112$admittedArgument = constant_handles.reader_make_constant_shell( makeString( "admittedArgument" ) );
    $kw113$WEAKEN_RELATION = makeKeyword( "WEAKEN-RELATION" );
    $list114 = ConsesLow.list( makeKeyword( "SAKE-TACTICS" ), makeKeyword( "WEAKEN-PREDICATE" ) );
    $sym115$_NEW_PREDICATE = makeSymbol( "?NEW-PREDICATE" );
    $const116$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $const117$genlPreds = constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) );
    $list118 = ConsesLow.list( makeSymbol( "?NEW-PREDICATE" ) );
    $list119 = ConsesLow.list( makeKeyword( "EDIT-TYPE" ), makeKeyword( "WEAKEN" ) );
    $kw120$CHANGE_MT = makeKeyword( "CHANGE-MT" );
    $list121 = ConsesLow.list( makeKeyword( "SAKE-TACTICS" ), makeKeyword( "CHANGE-MT" ) );
    $kw122$MAX_CANDIDATES = makeKeyword( "MAX-CANDIDATES" );
    $kw123$CHANGE_FORMULA_MT = makeKeyword( "CHANGE-FORMULA-MT" );
    $kw124$FROM_MT = makeKeyword( "FROM-MT" );
    $list125 = ConsesLow.list( makeKeyword( "TO-MT" ), makeSymbol( "?NEW-MT" ) );
    $kw126$RETRACT_FORMULA = makeKeyword( "RETRACT-FORMULA" );
    $list127 = ConsesLow.list( makeKeyword( "SAKE-TACTICS" ), makeKeyword( "RETRACT-FORMULA" ) );
    $kw128$WEAKEN_CONSTRAINT = makeKeyword( "WEAKEN-CONSTRAINT" );
    $list129 = ConsesLow.list( makeKeyword( "SAKE-TACTICS" ), makeKeyword( "WEAKEN-CONSTRAINT" ) );
    $sym130$_NEW_COL = makeSymbol( "?NEW-COL" );
    $list131 = ConsesLow.list( makeSymbol( "?NEW-COL" ) );
    $kw132$EDIT_ASSERTION = makeKeyword( "EDIT-ASSERTION" );
    $kw133$CHANGE_CONSTRAINT = makeKeyword( "CHANGE-CONSTRAINT" );
    $list134 = ConsesLow.list( makeKeyword( "SAKE-TACTICS" ), makeKeyword( "CHANGE-CONSTRAINT" ) );
    $kw135$UNASSERT_CONSTRAINT = makeKeyword( "UNASSERT-CONSTRAINT" );
    $kw136$UNASSERT = makeKeyword( "UNASSERT" );
    $sym137$_NEW_MT = makeSymbol( "?NEW-MT" );
    $const138$unknownSentence = constant_handles.reader_make_constant_shell( makeString( "unknownSentence" ) );
    $const139$genlMt = constant_handles.reader_make_constant_shell( makeString( "genlMt" ) );
    $list140 = ConsesLow.list( makeSymbol( "?NEW-MT" ) );
    $kw141$CHANGE_ASSERTION_MT = makeKeyword( "CHANGE-ASSERTION-MT" );
    $kw142$DENY_HL_SUPPORT = makeKeyword( "DENY-HL-SUPPORT" );
    $list143 = ConsesLow.list( makeKeyword( "SAKE-TACTICS" ), makeKeyword( "DENY-SUPPRT" ) );
    $kw144$GENLPREDS = makeKeyword( "GENLPREDS" );
    $list145 = ConsesLow.list( makeKeyword( "SAKE-TACTICS" ), makeKeyword( "DENY-SUPPORT" ) );
    $kw146$ALL = makeKeyword( "ALL" );
    $kw147$UNVIABLE = makeKeyword( "UNVIABLE" );
    $list148 = ConsesLow.list( makeKeyword( "WFF" ), T );
    $kw149$WHY_NOT_WFF = makeKeyword( "WHY-NOT-WFF" );
    $kw150$WHY_NOT_CONSISTENT = makeKeyword( "WHY-NOT-CONSISTENT" );
    $list151 = ConsesLow.list( makeKeyword( "SAKE-STATUS" ), makeKeyword( "UNVIABLE" ) );
    $sym152$CYC_VAR_ = makeSymbol( "CYC-VAR?" );
    $list153 = ConsesLow.list( ConsesLow.list( makeKeyword( "CONSISTENT" ), T ) );
    $list154 = ConsesLow.list( ConsesLow.list( makeKeyword( "CONSISTENT" ), makeKeyword( "ASSUMED" ) ) );
    $sym155$GATHER_CONTRACTIONS_INT = makeSymbol( "GATHER-CONTRACTIONS-INT" );
    $kw156$TRUE = makeKeyword( "TRUE" );
    $const157$expansion = constant_handles.reader_make_constant_shell( makeString( "expansion" ) );
    $sym158$TARGET_RELATION_EXPRESSION_ = makeSymbol( "TARGET-RELATION-EXPRESSION?" );
    $kw159$SOURCE = makeKeyword( "SOURCE" );
  }
}
/*
 * 
 * Total time: 635 ms
 * 
 */