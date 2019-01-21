package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
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

public final class wff_suggest extends SubLTranslatedFile
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
    public static SubLObject non_wffness_repairs(final SubLObject sentence, final SubLObject mt) {
        final SubLObject wff_violations = wff.why_not_wff(sentence, mt, (SubLObject)wff_suggest.UNPROVIDED);
        return wff_violations_repairs(wff_violations);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 1017L)
    public static SubLObject wff_violations_repairs(final SubLObject wff_violations) {
        SubLObject isa_repairs = (SubLObject)wff_suggest.NIL;
        SubLObject quoted_isa_repairs = (SubLObject)wff_suggest.NIL;
        SubLObject genl_repairs = (SubLObject)wff_suggest.NIL;
        SubLObject other_repairs = (SubLObject)wff_suggest.NIL;
        SubLObject irreparableP = (SubLObject)wff_suggest.NIL;
        if (wff_suggest.NIL == irreparableP) {
            SubLObject csome_list_var = wff_violations;
            SubLObject violation = (SubLObject)wff_suggest.NIL;
            violation = csome_list_var.first();
            while (wff_suggest.NIL == irreparableP && wff_suggest.NIL != csome_list_var) {
                final SubLObject pcase_var = at_utilities.violation_type(violation);
                if (pcase_var.eql((SubLObject)wff_suggest.$kw0$MAL_ARG_WRT_ARG_ISA)) {
                    SubLObject current;
                    final SubLObject datum = current = violation;
                    SubLObject wff_module = (SubLObject)wff_suggest.NIL;
                    SubLObject arg = (SubLObject)wff_suggest.NIL;
                    SubLObject reln = (SubLObject)wff_suggest.NIL;
                    SubLObject pos = (SubLObject)wff_suggest.NIL;
                    SubLObject col = (SubLObject)wff_suggest.NIL;
                    SubLObject mt = (SubLObject)wff_suggest.NIL;
                    SubLObject data = (SubLObject)wff_suggest.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_suggest.$list1);
                    wff_module = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_suggest.$list1);
                    arg = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_suggest.$list1);
                    reln = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_suggest.$list1);
                    pos = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_suggest.$list1);
                    col = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_suggest.$list1);
                    mt = current.first();
                    current = (data = current.rest());
                    if (wff_suggest.NIL != at_defns.quiet_not_has_typeP(arg, col, mt)) {
                        irreparableP = (SubLObject)wff_suggest.T;
                    }
                    else {
                        final SubLObject item_var = el_utilities.make_binary_formula(wff_suggest.$const2$isa, arg, col);
                        if (wff_suggest.NIL == conses_high.member(item_var, isa_repairs, Symbols.symbol_function((SubLObject)wff_suggest.EQUAL), Symbols.symbol_function((SubLObject)wff_suggest.IDENTITY))) {
                            isa_repairs = (SubLObject)ConsesLow.cons(item_var, isa_repairs);
                        }
                    }
                }
                else if (pcase_var.eql((SubLObject)wff_suggest.$kw3$MAL_ARG_WRT_ARG_QUOTED_ISA)) {
                    SubLObject current;
                    final SubLObject datum = current = violation;
                    SubLObject wff_module = (SubLObject)wff_suggest.NIL;
                    SubLObject arg = (SubLObject)wff_suggest.NIL;
                    SubLObject reln = (SubLObject)wff_suggest.NIL;
                    SubLObject pos = (SubLObject)wff_suggest.NIL;
                    SubLObject col = (SubLObject)wff_suggest.NIL;
                    SubLObject mt = (SubLObject)wff_suggest.NIL;
                    SubLObject data = (SubLObject)wff_suggest.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_suggest.$list1);
                    wff_module = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_suggest.$list1);
                    arg = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_suggest.$list1);
                    reln = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_suggest.$list1);
                    pos = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_suggest.$list1);
                    col = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_suggest.$list1);
                    mt = current.first();
                    current = (data = current.rest());
                    if (wff_suggest.NIL != at_defns.quiet_not_quoted_has_typeP(arg, col, mt)) {
                        irreparableP = (SubLObject)wff_suggest.T;
                    }
                    else {
                        final SubLObject item_var = el_utilities.make_binary_formula(wff_suggest.$const4$quotedIsa, arg, col);
                        if (wff_suggest.NIL == conses_high.member(item_var, isa_repairs, Symbols.symbol_function((SubLObject)wff_suggest.EQUAL), Symbols.symbol_function((SubLObject)wff_suggest.IDENTITY))) {
                            isa_repairs = (SubLObject)ConsesLow.cons(item_var, isa_repairs);
                        }
                    }
                }
                else if (pcase_var.eql((SubLObject)wff_suggest.$kw5$MAL_ARG_WRT_ARG_GENLS)) {
                    SubLObject current;
                    final SubLObject datum = current = violation;
                    SubLObject wff_module = (SubLObject)wff_suggest.NIL;
                    SubLObject arg = (SubLObject)wff_suggest.NIL;
                    SubLObject reln = (SubLObject)wff_suggest.NIL;
                    SubLObject pos = (SubLObject)wff_suggest.NIL;
                    SubLObject col = (SubLObject)wff_suggest.NIL;
                    SubLObject mt = (SubLObject)wff_suggest.NIL;
                    SubLObject data = (SubLObject)wff_suggest.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_suggest.$list1);
                    wff_module = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_suggest.$list1);
                    arg = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_suggest.$list1);
                    reln = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_suggest.$list1);
                    pos = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_suggest.$list1);
                    col = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_suggest.$list1);
                    mt = current.first();
                    current = (data = current.rest());
                    if (wff_suggest.NIL != genls.not_genlP(arg, col, mt, (SubLObject)wff_suggest.UNPROVIDED)) {
                        irreparableP = (SubLObject)wff_suggest.T;
                    }
                    else {
                        final SubLObject item_var = el_utilities.make_binary_formula(wff_suggest.$const6$genls, arg, col);
                        if (wff_suggest.NIL == conses_high.member(item_var, genl_repairs, Symbols.symbol_function((SubLObject)wff_suggest.EQUAL), Symbols.symbol_function((SubLObject)wff_suggest.IDENTITY))) {
                            genl_repairs = (SubLObject)ConsesLow.cons(item_var, genl_repairs);
                        }
                    }
                }
                else if (pcase_var.eql((SubLObject)wff_suggest.$kw7$MAL_ARG_WRT_ARG_NOT_ISA_DISJOINT) || pcase_var.eql((SubLObject)wff_suggest.$kw8$MAL_ARG_WRT_ARG_NOT_QUOTED_ISA_DISJOINT) || pcase_var.eql((SubLObject)wff_suggest.$kw9$MAL_ARG_WRT_ARG_NOT_GENLS_DISJOINT)) {
                    irreparableP = (SubLObject)wff_suggest.T;
                }
                else if (!pcase_var.eql((SubLObject)wff_suggest.$kw10$MAL_ARG_WRT_INTER_ARG_ISA)) {
                    if (!pcase_var.eql((SubLObject)wff_suggest.$kw11$MAL_ARG_WRT_INTER_ARG_NOT_ISA)) {
                        if (!pcase_var.eql((SubLObject)wff_suggest.$kw12$MAL_ARG_WRT_INTER_ARG_GENL)) {
                            if (pcase_var.eql((SubLObject)wff_suggest.$kw13$MAL_ARG_WRT_INTER_ARG_NOT_ISA_DISJOINT) || pcase_var.eql((SubLObject)wff_suggest.$kw14$MAL_ARG_WRT_INTER_ARG_NOT_GENL_DISJOINT)) {
                                irreparableP = (SubLObject)wff_suggest.T;
                            }
                            else if (pcase_var.eql((SubLObject)wff_suggest.$kw15$MAL_ARG_WRT_ARG_FORMAT) || pcase_var.eql((SubLObject)wff_suggest.$kw16$MAL_ARG_WRT_INTER_ARG_FORMAT)) {
                                irreparableP = (SubLObject)wff_suggest.T;
                            }
                            else if (pcase_var.eql((SubLObject)wff_suggest.$kw17$MAL_ARG_WRT_INTER_ARG_DIFFERENT)) {
                                SubLObject current;
                                final SubLObject datum = current = violation;
                                SubLObject wff_module = (SubLObject)wff_suggest.NIL;
                                SubLObject reln2 = (SubLObject)wff_suggest.NIL;
                                SubLObject arg2 = (SubLObject)wff_suggest.NIL;
                                SubLObject psn1 = (SubLObject)wff_suggest.NIL;
                                SubLObject arg3 = (SubLObject)wff_suggest.NIL;
                                SubLObject psn2 = (SubLObject)wff_suggest.NIL;
                                SubLObject mt2 = (SubLObject)wff_suggest.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_suggest.$list18);
                                wff_module = current.first();
                                current = current.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_suggest.$list18);
                                reln2 = current.first();
                                current = current.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_suggest.$list18);
                                arg2 = current.first();
                                current = current.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_suggest.$list18);
                                psn1 = current.first();
                                current = current.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_suggest.$list18);
                                arg3 = current.first();
                                current = current.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_suggest.$list18);
                                psn2 = current.first();
                                current = current.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_suggest.$list18);
                                mt2 = current.first();
                                current = current.rest();
                                final SubLObject via = (SubLObject)(current.isCons() ? current.first() : wff_suggest.NIL);
                                cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)wff_suggest.$list18);
                                current = current.rest();
                                if (wff_suggest.NIL == current) {
                                    if (wff_suggest.NIL != equals.equalsP(arg2, arg3, mt2, (SubLObject)wff_suggest.UNPROVIDED)) {
                                        irreparableP = (SubLObject)wff_suggest.T;
                                    }
                                    else {
                                        final SubLObject item_var2 = el_utilities.make_binary_formula(wff_suggest.$const19$different, arg2, arg3);
                                        if (wff_suggest.NIL == conses_high.member(item_var2, other_repairs, Symbols.symbol_function((SubLObject)wff_suggest.EQUAL), Symbols.symbol_function((SubLObject)wff_suggest.IDENTITY))) {
                                            other_repairs = (SubLObject)ConsesLow.cons(item_var2, other_repairs);
                                        }
                                    }
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)wff_suggest.$list18);
                                }
                            }
                            else if (pcase_var.eql((SubLObject)wff_suggest.$kw20$MAL_RELN_WRT_ARG_ISA_REQUIRED)) {
                                irreparableP = (SubLObject)wff_suggest.T;
                            }
                            else if (pcase_var.eql((SubLObject)wff_suggest.$kw21$CONFLICT_ASSERTING_TRUE_SBHL) || pcase_var.eql((SubLObject)wff_suggest.$kw22$CONFLICT_ASSERTING_FALSE_SBHL)) {
                                irreparableP = (SubLObject)wff_suggest.T;
                            }
                            else if (pcase_var.eql((SubLObject)wff_suggest.$kw23$DISJOINT_ARG_ISA) || pcase_var.eql((SubLObject)wff_suggest.$kw24$DISJOINT_ARG_QUOTED_ISA) || pcase_var.eql((SubLObject)wff_suggest.$kw25$DISJOINT_ARG_GENL)) {
                                irreparableP = (SubLObject)wff_suggest.T;
                            }
                            else if (pcase_var.eql((SubLObject)wff_suggest.$kw26$RESTRICTED_SKOLEM_ASSERTION) || pcase_var.eql((SubLObject)wff_suggest.$kw27$RESTRICTED_PREDICATE_ASSERTION) || pcase_var.eql((SubLObject)wff_suggest.$kw28$RESTRICTED_COLLECTION_ASSERTION) || pcase_var.eql((SubLObject)wff_suggest.$kw29$RESTRICTED_MT_ASSERTION)) {
                                irreparableP = (SubLObject)wff_suggest.T;
                            }
                            else if (pcase_var.eql((SubLObject)wff_suggest.$kw30$EVALUATABLE_LITERAL_FALSE) || pcase_var.eql((SubLObject)wff_suggest.$kw31$MAL_PRECANONICALIZATIONS) || pcase_var.eql((SubLObject)wff_suggest.$kw32$INVALID_EXPANSION) || pcase_var.eql((SubLObject)wff_suggest.$kw33$RECURSION_LIMIT_EXCEEDED) || pcase_var.eql((SubLObject)wff_suggest.$kw34$EL_UNEVALUATABLE_EXPRESSION)) {
                                irreparableP = (SubLObject)wff_suggest.T;
                            }
                            else if (pcase_var.eql((SubLObject)wff_suggest.$kw35$QUANTIFIED_SEQUENCE_VARIABLE) || pcase_var.eql((SubLObject)wff_suggest.$kw36$TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE) || pcase_var.eql((SubLObject)wff_suggest.$kw37$AMBIGUOUS_VAR_TYPE_IN_SKOLEM_SCOPE) || pcase_var.eql((SubLObject)wff_suggest.$kw38$INHIBITED_SEQUENCE_VARIABLE)) {
                                irreparableP = (SubLObject)wff_suggest.T;
                            }
                            else if (pcase_var.eql((SubLObject)wff_suggest.$kw39$TOO_MANY_COMMUTATIVE_IN_ARGS_AND_REST)) {
                                irreparableP = (SubLObject)wff_suggest.T;
                            }
                        }
                    }
                }
                csome_list_var = csome_list_var.rest();
                violation = csome_list_var.first();
            }
        }
        isa_repairs = list_utilities.delete_subsumed_items(isa_repairs, (SubLObject)wff_suggest.$sym40$GENL_, (SubLObject)wff_suggest.$sym41$FORMULA_ARG2);
        quoted_isa_repairs = list_utilities.delete_subsumed_items(quoted_isa_repairs, (SubLObject)wff_suggest.$sym40$GENL_, (SubLObject)wff_suggest.$sym41$FORMULA_ARG2);
        genl_repairs = list_utilities.delete_subsumed_items(genl_repairs, (SubLObject)wff_suggest.$sym40$GENL_, (SubLObject)wff_suggest.$sym41$FORMULA_ARG2);
        return (SubLObject)((wff_suggest.NIL != irreparableP) ? wff_suggest.NIL : ConsesLow.append(isa_repairs, quoted_isa_repairs, genl_repairs, other_repairs));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 4425L)
    public static SubLObject suggestions_for_mal_arg_wrt_arg_isa(final SubLObject why_not, SubLObject io_mode) {
        if (io_mode == wff_suggest.UNPROVIDED) {
            io_mode = (SubLObject)wff_suggest.$kw42$EL;
        }
        SubLObject module = (SubLObject)wff_suggest.NIL;
        SubLObject arg = (SubLObject)wff_suggest.NIL;
        SubLObject relation = (SubLObject)wff_suggest.NIL;
        SubLObject argnum = (SubLObject)wff_suggest.NIL;
        SubLObject col = (SubLObject)wff_suggest.NIL;
        SubLObject mt = (SubLObject)wff_suggest.NIL;
        SubLObject data = (SubLObject)wff_suggest.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(why_not, why_not, (SubLObject)wff_suggest.$list43);
        module = why_not.first();
        SubLObject current = why_not.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, why_not, (SubLObject)wff_suggest.$list43);
        arg = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, why_not, (SubLObject)wff_suggest.$list43);
        relation = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, why_not, (SubLObject)wff_suggest.$list43);
        argnum = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, why_not, (SubLObject)wff_suggest.$list43);
        col = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, why_not, (SubLObject)wff_suggest.$list43);
        mt = current.first();
        current = (data = current.rest());
        final SubLObject via_genl_pred = conses_high.cadr(conses_high.assoc((SubLObject)wff_suggest.$kw44$VIA_GENL_PRED, data, (SubLObject)wff_suggest.UNPROVIDED, (SubLObject)wff_suggest.UNPROVIDED));
        final SubLObject rejected_formula = conses_high.cadr(conses_high.assoc((SubLObject)wff_suggest.$kw45$WFF_FORMULA, data, (SubLObject)wff_suggest.UNPROVIDED, (SubLObject)wff_suggest.UNPROVIDED));
        final SubLObject pcase_var = io_mode;
        if (pcase_var.eql((SubLObject)wff_suggest.$kw46$NL)) {
            return PrintLow.format((SubLObject)wff_suggest.NIL, (SubLObject)wff_suggest.$str47$dont_know_how_to_describe_fixes_f, module);
        }
        if (pcase_var.eql((SubLObject)wff_suggest.$kw42$EL)) {
            final SubLObject constraint_assertion = conses_high.cadr(conses_high.assoc((SubLObject)wff_suggest.$kw48$AT_CONSTRAINT_GAF, data, (SubLObject)wff_suggest.UNPROVIDED, (SubLObject)wff_suggest.UNPROVIDED));
            final SubLObject constraint_formula = assertions_high.gaf_formula(constraint_assertion);
            final SubLObject constraint_mt = assertions_high.assertion_mt(constraint_assertion);
            return ConsesLow.append(new SubLObject[] { sake_fix_arg_isa_via_make_it_so(module, arg, col, mt), sake_fix_arg_type_via_make_exception(module, arg, constraint_formula, mt), sake_fix_arg_type_via_correct_formula(module, wff_suggest.$const2$isa, relation, argnum, arg, col, rejected_formula, mt), sake_fix_via_deny_constraint_applicability(module, relation, mt, via_genl_pred, constraint_formula, constraint_mt), sake_fix_arg_type_via_correct_constraint(module, wff_suggest.$const2$isa, arg, col, mt, constraint_formula, constraint_mt) });
        }
        return (SubLObject)wff_suggest.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 5551L)
    public static SubLObject suggestions_for_mal_arg_wrt_arg_not_isa_disjoint(final SubLObject why_not, SubLObject io_mode) {
        if (io_mode == wff_suggest.UNPROVIDED) {
            io_mode = (SubLObject)wff_suggest.$kw42$EL;
        }
        SubLObject module = (SubLObject)wff_suggest.NIL;
        SubLObject arg = (SubLObject)wff_suggest.NIL;
        SubLObject relation = (SubLObject)wff_suggest.NIL;
        SubLObject argnum = (SubLObject)wff_suggest.NIL;
        SubLObject col = (SubLObject)wff_suggest.NIL;
        SubLObject mt = (SubLObject)wff_suggest.NIL;
        SubLObject data = (SubLObject)wff_suggest.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(why_not, why_not, (SubLObject)wff_suggest.$list43);
        module = why_not.first();
        SubLObject current = why_not.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, why_not, (SubLObject)wff_suggest.$list43);
        arg = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, why_not, (SubLObject)wff_suggest.$list43);
        relation = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, why_not, (SubLObject)wff_suggest.$list43);
        argnum = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, why_not, (SubLObject)wff_suggest.$list43);
        col = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, why_not, (SubLObject)wff_suggest.$list43);
        mt = current.first();
        current = (data = current.rest());
        final SubLObject via_genl_pred = conses_high.cadr(conses_high.assoc((SubLObject)wff_suggest.$kw44$VIA_GENL_PRED, data, (SubLObject)wff_suggest.UNPROVIDED, (SubLObject)wff_suggest.UNPROVIDED));
        final SubLObject rejected_formula = conses_high.cadr(conses_high.assoc((SubLObject)wff_suggest.$kw45$WFF_FORMULA, data, (SubLObject)wff_suggest.UNPROVIDED, (SubLObject)wff_suggest.UNPROVIDED));
        final SubLObject pcase_var = io_mode;
        if (pcase_var.eql((SubLObject)wff_suggest.$kw46$NL)) {
            return PrintLow.format((SubLObject)wff_suggest.NIL, (SubLObject)wff_suggest.$str47$dont_know_how_to_describe_fixes_f, module);
        }
        if (pcase_var.eql((SubLObject)wff_suggest.$kw42$EL)) {
            final SubLObject constraint_assertion = conses_high.cadr(conses_high.assoc((SubLObject)wff_suggest.$kw48$AT_CONSTRAINT_GAF, data, (SubLObject)wff_suggest.UNPROVIDED, (SubLObject)wff_suggest.UNPROVIDED));
            final SubLObject constraint_formula = (SubLObject)((wff_suggest.NIL != constraint_assertion) ? assertions_high.gaf_formula(constraint_assertion) : wff_suggest.NIL);
            final SubLObject constraint_mt = (SubLObject)((wff_suggest.NIL != constraint_assertion) ? assertions_high.assertion_mt(constraint_assertion) : wff_suggest.NIL);
            return ConsesLow.append(new SubLObject[] { sake_fix_arg_isa_disjoint_via_make_it_unknown(module, arg, col, mt), sake_fix_arg_type_via_make_exception(module, arg, constraint_formula, mt), sake_fix_arg_type_via_correct_formula(module, wff_suggest.$const2$isa, relation, argnum, arg, col, rejected_formula, mt), sake_fix_via_deny_constraint_applicability(module, relation, mt, via_genl_pred, constraint_formula, constraint_mt), sake_fix_arg_type_via_correct_constraint(module, wff_suggest.$const2$isa, arg, col, mt, constraint_formula, constraint_mt) });
        }
        return (SubLObject)wff_suggest.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 6716L)
    public static SubLObject suggestions_for_mal_arg_wrt_arg_genl(final SubLObject why_not, SubLObject io_mode) {
        if (io_mode == wff_suggest.UNPROVIDED) {
            io_mode = (SubLObject)wff_suggest.$kw42$EL;
        }
        SubLObject module = (SubLObject)wff_suggest.NIL;
        SubLObject arg = (SubLObject)wff_suggest.NIL;
        SubLObject relation = (SubLObject)wff_suggest.NIL;
        SubLObject argnum = (SubLObject)wff_suggest.NIL;
        SubLObject col = (SubLObject)wff_suggest.NIL;
        SubLObject mt = (SubLObject)wff_suggest.NIL;
        SubLObject data = (SubLObject)wff_suggest.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(why_not, why_not, (SubLObject)wff_suggest.$list43);
        module = why_not.first();
        SubLObject current = why_not.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, why_not, (SubLObject)wff_suggest.$list43);
        arg = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, why_not, (SubLObject)wff_suggest.$list43);
        relation = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, why_not, (SubLObject)wff_suggest.$list43);
        argnum = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, why_not, (SubLObject)wff_suggest.$list43);
        col = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, why_not, (SubLObject)wff_suggest.$list43);
        mt = current.first();
        current = (data = current.rest());
        final SubLObject via_genl_pred = conses_high.cadr(conses_high.assoc((SubLObject)wff_suggest.$kw44$VIA_GENL_PRED, data, (SubLObject)wff_suggest.UNPROVIDED, (SubLObject)wff_suggest.UNPROVIDED));
        final SubLObject rejected_formula = conses_high.cadr(conses_high.assoc((SubLObject)wff_suggest.$kw45$WFF_FORMULA, data, (SubLObject)wff_suggest.UNPROVIDED, (SubLObject)wff_suggest.UNPROVIDED));
        final SubLObject pcase_var = io_mode;
        if (pcase_var.eql((SubLObject)wff_suggest.$kw46$NL)) {
            return PrintLow.format((SubLObject)wff_suggest.NIL, (SubLObject)wff_suggest.$str47$dont_know_how_to_describe_fixes_f, module);
        }
        if (pcase_var.eql((SubLObject)wff_suggest.$kw42$EL)) {
            final SubLObject constraint_assertion = conses_high.cadr(conses_high.assoc((SubLObject)wff_suggest.$kw48$AT_CONSTRAINT_GAF, data, (SubLObject)wff_suggest.UNPROVIDED, (SubLObject)wff_suggest.UNPROVIDED));
            final SubLObject constraint_formula = assertions_high.gaf_formula(constraint_assertion);
            final SubLObject constraint_mt = assertions_high.assertion_mt(constraint_assertion);
            return ConsesLow.append(new SubLObject[] { sake_fix_arg_genl_via_make_it_so(module, arg, col, mt), sake_fix_arg_type_via_make_exception(module, arg, constraint_formula, mt), sake_fix_arg_type_via_correct_formula(module, wff_suggest.$const6$genls, relation, argnum, arg, col, rejected_formula, mt), sake_fix_via_deny_constraint_applicability(module, relation, mt, via_genl_pred, constraint_formula, constraint_mt), sake_fix_arg_type_via_correct_constraint(module, wff_suggest.$const6$genls, arg, col, mt, constraint_formula, constraint_mt) });
        }
        return (SubLObject)wff_suggest.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 7802L)
    public static SubLObject sake_fix_arg_isa_via_make_it_so(final SubLObject wff_module, final SubLObject arg, final SubLObject col, final SubLObject mt) {
        if (wff_suggest.NIL != accessible_wf_fixP(wff_module, (SubLObject)wff_suggest.$kw49$MAKE_IT_SO, (SubLObject)wff_suggest.UNPROVIDED)) {
            final SubLObject strategy = (SubLObject)wff_suggest.$list50;
            return ConsesLow.append(sake_fix_assert_gaf2(wff_module, wff_suggest.$const2$isa, arg, col, mt, strategy), sake_fix_edit_sufficient_defn(wff_module, arg, col, mt, strategy), sake_fix_solicit_sufficient_defn(wff_module, arg, col, mt, strategy));
        }
        return (SubLObject)wff_suggest.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 8234L)
    public static SubLObject sake_fix_arg_isa_disjoint_via_make_it_unknown(final SubLObject wff_module, final SubLObject arg, final SubLObject col, final SubLObject mt) {
        if (wff_suggest.NIL != accessible_wf_fixP(wff_module, (SubLObject)wff_suggest.$kw49$MAKE_IT_SO, (SubLObject)wff_suggest.UNPROVIDED)) {
            final SubLObject strategy = (SubLObject)wff_suggest.$list50;
            final SubLObject literal = cycl_utilities.negate(el_utilities.make_binary_formula(wff_suggest.$const2$isa, arg, col));
            return ConsesLow.append(sake_fix_deny_hl_literal(wff_module, (SubLObject)wff_suggest.$kw51$ISA, literal, mt, strategy), sake_fix_arg_isa_via_make_it_so(wff_module, arg, col, mt));
        }
        return (SubLObject)wff_suggest.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 8644L)
    public static SubLObject sake_fix_arg_genl_via_make_it_so(final SubLObject wff_module, final SubLObject arg, final SubLObject col, final SubLObject mt) {
        if (wff_suggest.NIL != accessible_wf_fixP(wff_module, (SubLObject)wff_suggest.$kw49$MAKE_IT_SO, (SubLObject)wff_suggest.UNPROVIDED)) {
            final SubLObject strategy = (SubLObject)wff_suggest.$list50;
            return sake_fix_assert_gaf2(wff_module, wff_suggest.$const6$genls, arg, col, mt, strategy);
        }
        return (SubLObject)wff_suggest.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 8911L)
    public static SubLObject sake_fix_arg_type_via_make_exception(final SubLObject wff_module, final SubLObject arg, final SubLObject formula, final SubLObject mt) {
        if (wff_suggest.NIL != accessible_wf_fixP(wff_module, (SubLObject)wff_suggest.$kw52$MAKE_EXCEPTION, (SubLObject)wff_suggest.UNPROVIDED)) {
            final SubLObject strategy = (SubLObject)wff_suggest.$list53;
            return ConsesLow.append(sake_fix_assert_arg_except_for(wff_module, arg, formula, mt, strategy), sake_fix_assert_arg_except_when(wff_module, arg, formula, mt, strategy));
        }
        return (SubLObject)wff_suggest.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 9275L)
    public static SubLObject sake_fix_arg_type_via_correct_formula(final SubLObject wff_module, final SubLObject predicate, final SubLObject relation, final SubLObject argnum, final SubLObject arg, final SubLObject col, final SubLObject formula, final SubLObject mt) {
        if (wff_suggest.NIL != accessible_wf_fixP(wff_module, (SubLObject)wff_suggest.$kw54$CORRECT_FORMULA, (SubLObject)wff_suggest.UNPROVIDED)) {
            final SubLObject strategy = (SubLObject)wff_suggest.$list55;
            return ConsesLow.append(new SubLObject[] { sake_fix_change_formula_level(wff_module, predicate, relation, argnum, arg, col, formula, mt, strategy), sake_fix_change_formula_term(wff_module, predicate, arg, col, formula, mt, strategy), sake_fix_change_formula_relation(wff_module, relation, argnum, arg, formula, mt, strategy), sake_fix_weaken_formula_relation(wff_module, relation, argnum, arg, formula, mt, strategy), sake_fix_change_formula_mt(wff_module, predicate, arg, col, mt, formula, strategy), sake_fix_retract_formula(wff_module, formula, mt, strategy) });
        }
        return (SubLObject)wff_suggest.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 10040L)
    public static SubLObject sake_fix_via_deny_constraint_applicability(final SubLObject wff_module, final SubLObject relation, final SubLObject mt, final SubLObject via_genl_pred, final SubLObject constraint_formula, final SubLObject constraint_mt) {
        if (wff_suggest.NIL != accessible_wf_fixP(wff_module, (SubLObject)wff_suggest.$kw56$DENY_APPLICABLILITY, (SubLObject)wff_suggest.UNPROVIDED)) {
            final SubLObject strategy = (SubLObject)wff_suggest.$list57;
            return ConsesLow.append(sake_fix_change_constraint_mt(wff_module, mt, constraint_formula, constraint_mt, strategy), sake_fix_deny_constraint_applies_to_spec_pred(wff_module, relation, mt, via_genl_pred, strategy));
        }
        return (SubLObject)wff_suggest.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 10509L)
    public static SubLObject sake_fix_arg_type_via_correct_constraint(final SubLObject wff_module, final SubLObject predicate, final SubLObject arg, final SubLObject col, final SubLObject mt, final SubLObject constraint_formula, final SubLObject constraint_mt) {
        if (wff_suggest.NIL != accessible_wf_fixP(wff_module, (SubLObject)wff_suggest.$kw58$CORRECT_CONSTRAINT, (SubLObject)wff_suggest.UNPROVIDED)) {
            final SubLObject strategy = (SubLObject)wff_suggest.$list59;
            return ConsesLow.append(sake_fix_weaken_arg_type_constraint(wff_module, predicate, arg, col, mt, constraint_formula, constraint_mt, strategy), sake_fix_change_arg_type_constraint(wff_module, predicate, arg, col, mt, constraint_formula, constraint_mt, strategy), sake_fix_unassert_constraint(wff_module, constraint_formula, constraint_mt, strategy));
        }
        return (SubLObject)wff_suggest.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 11100L)
    public static SubLObject sake_fix_assert_gaf2(final SubLObject wff_module, final SubLObject predicate, final SubLObject arg1, final SubLObject arg2, final SubLObject mt, final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (wff_suggest.NIL != accessible_wf_fixP(wff_module, strategy, (SubLObject)wff_suggest.$kw60$ASSERT_GAF)) {
            final SubLObject gaf_formula = el_utilities.make_binary_formula(predicate, arg1, arg2);
            final SubLObject tactics = (SubLObject)wff_suggest.$list61;
            final SubLObject skills = (SubLObject)wff_suggest.$list62;
            final SubLObject formula_status = sake_formula_status(gaf_formula, mt);
            if (wff_suggest.NIL == wff_suggest.$sake_suppress_unviableP$.getDynamicValue(thread) || wff_suggest.NIL != sake_viableP(formula_status)) {
                return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)wff_suggest.$kw63$ASSERT, gaf_formula, (SubLObject)ConsesLow.list((SubLObject)wff_suggest.$kw64$MT, mt), ConsesLow.append(formula_status, (SubLObject)ConsesLow.list(strategy, tactics, skills))));
            }
        }
        return (SubLObject)wff_suggest.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 11654L)
    public static SubLObject sake_fix_edit_sufficient_defn(final SubLObject wff_module, final SubLObject arg, final SubLObject col, final SubLObject mt, final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (wff_suggest.NIL != accessible_wf_fixP(wff_module, strategy, (SubLObject)wff_suggest.$kw65$EDIT_DEFN)) {
            final SubLObject tactics = (SubLObject)wff_suggest.$list66;
            final SubLObject skills = (SubLObject)wff_suggest.$list67;
            SubLObject result = (SubLObject)wff_suggest.NIL;
            SubLObject cdolist_list_var = kb_accessors.sufficient_defns(col, mt);
            SubLObject defn = (SubLObject)wff_suggest.NIL;
            defn = cdolist_list_var.first();
            while (wff_suggest.NIL != cdolist_list_var) {
                final SubLObject constraint_formula = (SubLObject)ConsesLow.list(wff_suggest.$const68$ist, mt, (SubLObject)ConsesLow.list(wff_suggest.$const69$defnAdmits, defn, arg));
                final SubLObject constraint_status = sake_formula_status(constraint_formula, mt);
                if (wff_suggest.NIL == wff_suggest.$sake_suppress_unviableP$.getDynamicValue(thread) || wff_suggest.NIL != sake_viableP(constraint_status)) {
                    result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)wff_suggest.$kw70$EDIT_SUBL, defn, (SubLObject)ConsesLow.listS((SubLObject)wff_suggest.$kw71$CONSTRAINTS, constraint_formula, ConsesLow.append(constraint_status, (SubLObject)wff_suggest.NIL)), strategy, tactics, skills), result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                defn = cdolist_list_var.first();
            }
            return result;
        }
        return (SubLObject)wff_suggest.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 12329L)
    public static SubLObject sake_fix_solicit_sufficient_defn(final SubLObject wff_module, final SubLObject arg, final SubLObject col, final SubLObject mt, final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (wff_suggest.NIL != accessible_wf_fixP(wff_module, strategy, (SubLObject)wff_suggest.$kw72$SOLICIT_DEFN) && wff_suggest.NIL != accessible_wf_fixP(wff_module, strategy, (SubLObject)wff_suggest.$kw73$ASSERT_DEFN)) {
            final SubLObject tactics = (SubLObject)wff_suggest.$list74;
            final SubLObject skills = (SubLObject)wff_suggest.$list67;
            final SubLObject defn_formula = (SubLObject)ConsesLow.listS(wff_suggest.$const75$defnSufficient, col, (SubLObject)wff_suggest.$list76);
            final SubLObject formula_status = sake_formula_status(defn_formula, mt);
            final SubLObject constraint_formula = (SubLObject)ConsesLow.list(wff_suggest.$const68$ist, mt, (SubLObject)ConsesLow.list(wff_suggest.$const69$defnAdmits, (SubLObject)wff_suggest.$sym77$_DEFN, arg));
            final SubLObject constraint_status = sake_formula_status(constraint_formula, mt);
            final SubLObject solicit_data = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)wff_suggest.$kw78$SOLICIT_VARIABLE_BINDING, (SubLObject)wff_suggest.$sym77$_DEFN, (SubLObject)ConsesLow.listS((SubLObject)wff_suggest.$kw71$CONSTRAINTS, constraint_formula, ConsesLow.append(constraint_status, (SubLObject)wff_suggest.NIL))));
            if (wff_suggest.NIL == wff_suggest.$sake_suppress_unviableP$.getDynamicValue(thread) || (wff_suggest.NIL != sake_viableP(formula_status) && wff_suggest.NIL != sake_viableP(constraint_status))) {
                return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)wff_suggest.$kw63$ASSERT, defn_formula, (SubLObject)ConsesLow.list((SubLObject)wff_suggest.$kw64$MT, mt), ConsesLow.append(formula_status, solicit_data, (SubLObject)ConsesLow.list(strategy, tactics, skills))));
            }
        }
        return (SubLObject)wff_suggest.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 13260L)
    public static SubLObject sake_fix_assert_arg_except_for(final SubLObject wff_module, final SubLObject arg, final SubLObject formula, final SubLObject mt, final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (wff_suggest.NIL != accessible_wf_fixP(wff_module, strategy, (SubLObject)wff_suggest.$kw79$ASSERT_EXCEPT_FOR)) {
            final SubLObject tactics = (SubLObject)wff_suggest.$list80;
            final SubLObject skills = (SubLObject)wff_suggest.$list81;
            final SubLObject except_formula = (SubLObject)ConsesLow.list(wff_suggest.$const82$exceptFor, arg, formula);
            final SubLObject formula_status = sake_formula_status(except_formula, mt);
            if (wff_suggest.NIL == wff_suggest.$sake_suppress_unviableP$.getDynamicValue(thread) || wff_suggest.NIL != sake_viableP(formula_status)) {
                return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)wff_suggest.$kw63$ASSERT, except_formula, (SubLObject)ConsesLow.list((SubLObject)wff_suggest.$kw64$MT, mt), ConsesLow.append(formula_status, (SubLObject)ConsesLow.list(strategy, tactics, skills))));
            }
        }
        return (SubLObject)wff_suggest.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 13812L)
    public static SubLObject sake_fix_assert_arg_except_when(final SubLObject wff_module, final SubLObject arg, final SubLObject formula, final SubLObject mt, final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (wff_suggest.NIL != accessible_wf_fixP(wff_module, strategy, (SubLObject)wff_suggest.$kw83$ASSERT_EXCEPT_WHEN)) {
            final SubLObject tactics = (SubLObject)wff_suggest.$list84;
            final SubLObject skills = (SubLObject)wff_suggest.$list81;
            final SubLObject constraint_formula = (SubLObject)ConsesLow.list(wff_suggest.$const68$ist, mt, (SubLObject)ConsesLow.listS(wff_suggest.$const85$implies, (SubLObject)ConsesLow.list(wff_suggest.$const86$evaluate, (SubLObject)wff_suggest.$sym87$_FORMULA_WRT_ARG, (SubLObject)ConsesLow.listS(wff_suggest.$const88$SubstituteFormulaFn, arg, (SubLObject)wff_suggest.$list89)), (SubLObject)wff_suggest.$list90));
            final SubLObject constraint_status = sake_formula_status(constraint_formula, mt);
            final SubLObject solicit_data = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)wff_suggest.$kw78$SOLICIT_VARIABLE_BINDING, (SubLObject)wff_suggest.$sym91$_FORMULA, (SubLObject)ConsesLow.listS((SubLObject)wff_suggest.$kw71$CONSTRAINTS, constraint_formula, ConsesLow.append(constraint_status, (SubLObject)wff_suggest.NIL))));
            if (wff_suggest.NIL == wff_suggest.$sake_suppress_unviableP$.getDynamicValue(thread) || wff_suggest.NIL != sake_viableP(constraint_status)) {
                return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)wff_suggest.$kw63$ASSERT, (SubLObject)ConsesLow.list(wff_suggest.$const92$exceptWhen, (SubLObject)wff_suggest.$sym91$_FORMULA, formula), (SubLObject)ConsesLow.list((SubLObject)wff_suggest.$kw64$MT, mt), ConsesLow.append(solicit_data, (SubLObject)ConsesLow.list(strategy, tactics, skills))));
            }
        }
        return (SubLObject)wff_suggest.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 14628L)
    public static SubLObject sake_fix_change_formula_level(final SubLObject wff_module, final SubLObject predicate, final SubLObject relation, final SubLObject argnum, final SubLObject arg, final SubLObject col, final SubLObject formula, final SubLObject mt, final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (wff_suggest.NIL != accessible_wf_fixP(wff_module, strategy, (SubLObject)wff_suggest.$kw93$CHANGE_LEVEL) && predicate.eql(wff_suggest.$const2$isa) && wff_suggest.NIL != genls.genlsP(arg, col, mt, (SubLObject)wff_suggest.UNPROVIDED) && wff_suggest.NIL != el_utilities.el_binary_formula_p(formula) && wff_suggest.NIL != fort_types_interface.predicateP(relation)) {
            final SubLObject tactics = (SubLObject)wff_suggest.$list94;
            final SubLObject skills = (SubLObject)wff_suggest.$list95;
            final SubLObject new_predicate = wff_suggest.ONE_INTEGER.numE(argnum) ? wff_suggest.$const96$relationAllInstance : wff_suggest.$const97$relationInstanceAll;
            final SubLObject sentence_pred = cycl_utilities.sentence_arg0(formula);
            final SubLObject sentence_arg1 = cycl_utilities.sentence_arg1(formula, (SubLObject)wff_suggest.UNPROVIDED);
            final SubLObject sentence_arg2 = cycl_utilities.sentence_arg2(formula, (SubLObject)wff_suggest.UNPROVIDED);
            final SubLObject new_formula = el_utilities.make_ternary_formula(new_predicate, sentence_pred, sentence_arg1, sentence_arg2);
            final SubLObject formula_status = (SubLObject)((wff_suggest.NIL != wff_suggest.$sake_suppress_unviableP$.getDynamicValue(thread)) ? sake_formula_status(new_formula, mt) : wff_suggest.NIL);
            if (wff_suggest.NIL == wff_suggest.$sake_suppress_unviableP$.getDynamicValue(thread) || wff_suggest.NIL != sake_viableP(formula_status)) {
                return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)wff_suggest.$kw98$EDIT_FORMULA, formula, (SubLObject)ConsesLow.list((SubLObject)wff_suggest.$kw64$MT, mt), (SubLObject)ConsesLow.listS((SubLObject)wff_suggest.$kw99$NEW_FORMULA, new_formula, (SubLObject)ConsesLow.list((SubLObject)wff_suggest.$kw64$MT, mt), ConsesLow.append(formula_status, (SubLObject)wff_suggest.NIL)), strategy, tactics, skills));
            }
        }
        return (SubLObject)wff_suggest.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 15768L)
    public static SubLObject sake_fix_change_formula_term(final SubLObject wff_module, final SubLObject predicate, final SubLObject arg, final SubLObject col, final SubLObject formula, final SubLObject mt, final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (wff_suggest.NIL != accessible_wf_fixP(wff_module, strategy, (SubLObject)wff_suggest.$kw100$CHANGE_TERM)) {
            final SubLObject tactics = (SubLObject)wff_suggest.$list101;
            final SubLObject skills = (SubLObject)wff_suggest.$list95;
            final SubLObject new_formula = conses_high.subst((SubLObject)wff_suggest.$sym102$_NEW_TERM, arg, formula, (SubLObject)wff_suggest.UNPROVIDED, (SubLObject)wff_suggest.UNPROVIDED);
            final SubLObject constraint_formula = (SubLObject)ConsesLow.list(wff_suggest.$const68$ist, mt, (SubLObject)ConsesLow.list(wff_suggest.$const103$knownSentence, (SubLObject)ConsesLow.list(predicate, (SubLObject)wff_suggest.$sym102$_NEW_TERM, col)));
            final SubLObject use_preference = (SubLObject)ConsesLow.list(wff_suggest.$const104$conceptuallyRelated, (SubLObject)wff_suggest.$sym102$_NEW_TERM, arg);
            final SubLObject constraint_status = sake_formula_status(constraint_formula, mt);
            final SubLObject solicit_data = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)wff_suggest.$kw78$SOLICIT_VARIABLE_BINDING, (SubLObject)wff_suggest.$sym102$_NEW_TERM, (SubLObject)ConsesLow.list((SubLObject)wff_suggest.$kw71$CONSTRAINTS, constraint_formula), (SubLObject)ConsesLow.list((SubLObject)wff_suggest.$kw105$PREFERENCES, use_preference), ConsesLow.append(constraint_status, (SubLObject)wff_suggest.NIL)));
            if (wff_suggest.NIL == wff_suggest.$sake_suppress_unviableP$.getDynamicValue(thread) || wff_suggest.NIL != sake_viableP(constraint_status)) {
                return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)wff_suggest.$kw98$EDIT_FORMULA, formula, (SubLObject)ConsesLow.list((SubLObject)wff_suggest.$kw64$MT, mt), (SubLObject)ConsesLow.listS((SubLObject)wff_suggest.$kw99$NEW_FORMULA, new_formula, (SubLObject)ConsesLow.list((SubLObject)wff_suggest.$kw64$MT, mt), ConsesLow.append(solicit_data, (SubLObject)wff_suggest.NIL)), strategy, tactics, skills));
            }
        }
        return (SubLObject)wff_suggest.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 16696L)
    public static SubLObject sake_fix_change_formula_relation(final SubLObject wff_module, final SubLObject relation, final SubLObject argnum, final SubLObject arg, final SubLObject formula, final SubLObject mt, final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (wff_suggest.NIL != accessible_wf_fixP(wff_module, strategy, (SubLObject)wff_suggest.$kw106$CHANGE_RELATION)) {
            final SubLObject tactics = (SubLObject)wff_suggest.$list107;
            final SubLObject skills = (SubLObject)wff_suggest.$list95;
            final SubLObject new_formula = conses_high.subst((SubLObject)wff_suggest.$sym108$_NEW_RELATION, relation, formula, (SubLObject)wff_suggest.UNPROVIDED, (SubLObject)wff_suggest.UNPROVIDED);
            final SubLObject args = cycl_utilities.formula_args(formula, (SubLObject)wff_suggest.UNPROVIDED);
            final SubLObject other_args = list_utilities.remove_nth(argnum, args);
            final SubLObject candidates = (SubLObject)((wff_suggest.NIL != list_utilities.singletonP(other_args)) ? ke_tools.legal_preds_of_forts_isa(arg, other_args.first(), (SubLObject)wff_suggest.UNPROVIDED) : wff_suggest.NIL);
            final SubLObject min_candidates = (SubLObject)((wff_suggest.NIL != candidates) ? genl_predicates.min_predicates(candidates, mt, (SubLObject)wff_suggest.UNPROVIDED) : wff_suggest.NIL);
            final SubLObject candidate_count = (SubLObject)((wff_suggest.NIL != candidates && Sequences.length(min_candidates).numG(wff_suggest.$sake_candidate_threshold$.getDynamicValue(thread))) ? Sequences.length(candidates) : wff_suggest.NIL);
            final SubLObject promissing = promissing_relation_analogs(relation, mt);
            SubLObject solicit_data = (SubLObject)wff_suggest.NIL;
            if (wff_suggest.NIL != promissing) {
                solicit_data = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons((SubLObject)wff_suggest.$kw109$PROMISSING_BINDINGS, promissing), solicit_data);
            }
            if (wff_suggest.NIL != candidate_count) {
                solicit_data = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)wff_suggest.$kw110$CANDIDATE_COUNT, candidate_count), solicit_data);
            }
            else if (wff_suggest.NIL != min_candidates) {
                solicit_data = (SubLObject)ConsesLow.cons(reader.bq_cons((SubLObject)wff_suggest.$kw111$MIN_CANDIDATES, ConsesLow.append(min_candidates, (SubLObject)wff_suggest.NIL)), solicit_data);
            }
            solicit_data = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)wff_suggest.$kw71$CONSTRAINTS, (SubLObject)ConsesLow.list(wff_suggest.$const68$ist, mt, (SubLObject)ConsesLow.list(wff_suggest.$const112$admittedArgument, (SubLObject)wff_suggest.$sym108$_NEW_RELATION, arg, argnum))), solicit_data);
            solicit_data = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)wff_suggest.$kw78$SOLICIT_VARIABLE_BINDING, (SubLObject)wff_suggest.$sym108$_NEW_RELATION, ConsesLow.append(solicit_data, (SubLObject)wff_suggest.NIL)));
            return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)wff_suggest.$kw98$EDIT_FORMULA, formula, (SubLObject)ConsesLow.list((SubLObject)wff_suggest.$kw64$MT, mt), (SubLObject)ConsesLow.listS((SubLObject)wff_suggest.$kw99$NEW_FORMULA, new_formula, (SubLObject)ConsesLow.list((SubLObject)wff_suggest.$kw64$MT, mt), ConsesLow.append(solicit_data, (SubLObject)wff_suggest.NIL)), strategy, tactics, skills));
        }
        return (SubLObject)wff_suggest.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 18330L)
    public static SubLObject sake_fix_weaken_formula_relation(final SubLObject wff_module, final SubLObject relation, final SubLObject argnum, final SubLObject arg, final SubLObject formula, final SubLObject mt, final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (wff_suggest.NIL != accessible_wf_fixP(wff_module, strategy, (SubLObject)wff_suggest.$kw113$WEAKEN_RELATION) && wff_suggest.NIL != fort_types_interface.predicateP(relation)) {
            final SubLObject tactics = (SubLObject)wff_suggest.$list114;
            final SubLObject skills = (SubLObject)wff_suggest.$list95;
            final SubLObject new_formula = el_utilities.make_el_formula((SubLObject)wff_suggest.$sym115$_NEW_PREDICATE, cycl_utilities.formula_args(formula, (SubLObject)wff_suggest.UNPROVIDED), (SubLObject)wff_suggest.UNPROVIDED);
            final SubLObject min_candidates = (SubLObject)((wff_suggest.NIL != forts.fort_p(arg)) ? at_utilities.min_genl_preds_admitting_fort_as_arg(arg, argnum, relation, mt) : wff_suggest.NIL);
            final SubLObject candidate_count = (SubLObject)(Sequences.length(min_candidates).numG(wff_suggest.$sake_candidate_threshold$.getDynamicValue(thread)) ? Sequences.length(min_candidates) : wff_suggest.NIL);
            SubLObject solicit_data = (SubLObject)wff_suggest.NIL;
            if (wff_suggest.NIL != min_candidates) {
                solicit_data = (SubLObject)ConsesLow.cons(reader.bq_cons((SubLObject)wff_suggest.$kw111$MIN_CANDIDATES, ConsesLow.append(min_candidates, (SubLObject)wff_suggest.NIL)), solicit_data);
            }
            else if (wff_suggest.NIL != candidate_count) {
                solicit_data = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)wff_suggest.$kw110$CANDIDATE_COUNT, candidate_count), solicit_data);
            }
            solicit_data = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)wff_suggest.$kw71$CONSTRAINTS, (SubLObject)ConsesLow.list(wff_suggest.$const68$ist, mt, (SubLObject)ConsesLow.list(wff_suggest.$const116$and, (SubLObject)ConsesLow.listS(wff_suggest.$const117$genlPreds, relation, (SubLObject)wff_suggest.$list118), (SubLObject)ConsesLow.list(wff_suggest.$const112$admittedArgument, (SubLObject)wff_suggest.$sym115$_NEW_PREDICATE, arg, argnum)))), solicit_data);
            solicit_data = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)wff_suggest.$kw78$SOLICIT_VARIABLE_BINDING, (SubLObject)wff_suggest.$sym115$_NEW_PREDICATE, ConsesLow.append(solicit_data, (SubLObject)wff_suggest.NIL)));
            return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)wff_suggest.$kw98$EDIT_FORMULA, formula, (SubLObject)ConsesLow.list((SubLObject)wff_suggest.$kw64$MT, mt), (SubLObject)ConsesLow.listS((SubLObject)wff_suggest.$kw99$NEW_FORMULA, new_formula, (SubLObject)ConsesLow.list((SubLObject)wff_suggest.$kw64$MT, mt), (SubLObject)wff_suggest.$list119, ConsesLow.append(solicit_data, (SubLObject)wff_suggest.NIL)), strategy, tactics, skills));
        }
        return (SubLObject)wff_suggest.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 19628L)
    public static SubLObject sake_fix_change_formula_mt(final SubLObject wff_module, final SubLObject predicate, final SubLObject arg, final SubLObject col, final SubLObject formula, final SubLObject mt, final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (wff_suggest.NIL != accessible_wf_fixP(wff_module, strategy, (SubLObject)wff_suggest.$kw120$CHANGE_MT)) {
            final SubLObject tactics = (SubLObject)wff_suggest.$list121;
            final SubLObject skills = (SubLObject)wff_suggest.$list95;
            SubLObject solicit_data = (SubLObject)wff_suggest.NIL;
            SubLObject candidate_mts = (SubLObject)wff_suggest.NIL;
            SubLObject candidate_count = (SubLObject)wff_suggest.NIL;
            if (predicate.eql(wff_suggest.$const2$isa)) {
                candidate_mts = isa.max_floor_mts_of_isa_paths(arg, col, (SubLObject)wff_suggest.UNPROVIDED);
            }
            else if (predicate.eql(wff_suggest.$const6$genls)) {
                candidate_mts = genls.max_floor_mts_of_genls_paths(arg, col, (SubLObject)wff_suggest.UNPROVIDED);
            }
            if (wff_suggest.NIL != candidate_mts) {
                if (Sequences.length(candidate_mts).numG(wff_suggest.$sake_candidate_threshold$.getDynamicValue(thread))) {
                    candidate_count = Sequences.length(candidate_mts);
                }
                if (wff_suggest.NIL != candidate_count) {
                    solicit_data = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)wff_suggest.$kw110$CANDIDATE_COUNT, candidate_count), solicit_data);
                }
                else if (wff_suggest.NIL != candidate_mts) {
                    solicit_data = (SubLObject)ConsesLow.cons(reader.bq_cons((SubLObject)wff_suggest.$kw122$MAX_CANDIDATES, ConsesLow.append(candidate_mts, (SubLObject)wff_suggest.NIL)), solicit_data);
                }
                solicit_data = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)wff_suggest.$kw78$SOLICIT_VARIABLE_BINDING, (SubLObject)wff_suggest.$sym115$_NEW_PREDICATE, ConsesLow.append(solicit_data, (SubLObject)wff_suggest.NIL)));
                return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)wff_suggest.$kw123$CHANGE_FORMULA_MT, formula, (SubLObject)ConsesLow.list((SubLObject)wff_suggest.$kw124$FROM_MT, mt), (SubLObject)wff_suggest.$list125, ConsesLow.append(solicit_data, (SubLObject)ConsesLow.list(strategy, tactics, skills))));
            }
        }
        return (SubLObject)wff_suggest.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 20608L)
    public static SubLObject sake_fix_retract_formula(final SubLObject wff_module, final SubLObject formula, final SubLObject mt, final SubLObject strategy) {
        if (wff_suggest.NIL != accessible_wf_fixP(wff_module, strategy, (SubLObject)wff_suggest.$kw126$RETRACT_FORMULA)) {
            final SubLObject tactics = (SubLObject)wff_suggest.$list127;
            final SubLObject skills = (SubLObject)wff_suggest.$list95;
            return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)wff_suggest.$kw126$RETRACT_FORMULA, formula, (SubLObject)ConsesLow.list((SubLObject)wff_suggest.$kw64$MT, mt), strategy, tactics, skills));
        }
        return (SubLObject)wff_suggest.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 20927L)
    public static SubLObject sake_fix_weaken_arg_type_constraint(final SubLObject wff_module, final SubLObject predicate, final SubLObject arg, final SubLObject col, final SubLObject mt, final SubLObject formula, final SubLObject constraint_mt, final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (wff_suggest.NIL != accessible_wf_fixP(wff_module, strategy, (SubLObject)wff_suggest.$kw128$WEAKEN_CONSTRAINT)) {
            final SubLObject tactics = (SubLObject)wff_suggest.$list129;
            final SubLObject skills = (SubLObject)wff_suggest.$list81;
            final SubLObject new_formula = conses_high.subst((SubLObject)wff_suggest.$sym130$_NEW_COL, col, formula, (SubLObject)wff_suggest.UNPROVIDED, (SubLObject)wff_suggest.UNPROVIDED);
            final SubLObject constraint_formula = (SubLObject)ConsesLow.list(wff_suggest.$const68$ist, mt, (SubLObject)ConsesLow.list(wff_suggest.$const103$knownSentence, (SubLObject)ConsesLow.list(wff_suggest.$const116$and, (SubLObject)ConsesLow.listS(wff_suggest.$const6$genls, col, (SubLObject)wff_suggest.$list131), (SubLObject)ConsesLow.listS(predicate, arg, (SubLObject)wff_suggest.$list131))));
            final SubLObject constraint_status = sake_formula_status(constraint_formula, mt);
            SubLObject min_candidates = (SubLObject)wff_suggest.NIL;
            if (wff_suggest.NIL == wff_suggest.$sake_suppress_unviableP$.getDynamicValue(thread) || wff_suggest.NIL != sake_viableP(constraint_status)) {
                if (predicate.eql(wff_suggest.$const2$isa)) {
                    min_candidates = min_isa_covering(arg, col, mt);
                }
                else if (predicate.eql(wff_suggest.$const6$genls)) {
                    min_candidates = genls.min_ceiling_cols((SubLObject)ConsesLow.list(arg, col), (SubLObject)wff_suggest.NIL, mt, (SubLObject)wff_suggest.UNPROVIDED);
                }
                if (wff_suggest.NIL != min_candidates) {
                    final SubLObject candidate_count = (SubLObject)(Sequences.length(min_candidates).numG(wff_suggest.$sake_candidate_threshold$.getDynamicValue(thread)) ? Sequences.length(min_candidates) : wff_suggest.NIL);
                    SubLObject solicit_data = (SubLObject)wff_suggest.NIL;
                    if (wff_suggest.NIL != candidate_count) {
                        solicit_data = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)wff_suggest.$kw110$CANDIDATE_COUNT, candidate_count), solicit_data);
                    }
                    else if (wff_suggest.NIL != min_candidates) {
                        solicit_data = (SubLObject)ConsesLow.cons(reader.bq_cons((SubLObject)wff_suggest.$kw111$MIN_CANDIDATES, ConsesLow.append(min_candidates, (SubLObject)wff_suggest.NIL)), solicit_data);
                    }
                    solicit_data = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS((SubLObject)wff_suggest.$kw71$CONSTRAINTS, constraint_formula, ConsesLow.append(constraint_status, (SubLObject)wff_suggest.NIL)), solicit_data);
                    solicit_data = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)wff_suggest.$kw78$SOLICIT_VARIABLE_BINDING, (SubLObject)wff_suggest.$sym130$_NEW_COL, ConsesLow.append(solicit_data, (SubLObject)wff_suggest.NIL)));
                    return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)wff_suggest.$kw132$EDIT_ASSERTION, formula, (SubLObject)ConsesLow.list((SubLObject)wff_suggest.$kw64$MT, constraint_mt), (SubLObject)ConsesLow.listS((SubLObject)wff_suggest.$kw99$NEW_FORMULA, new_formula, (SubLObject)ConsesLow.list((SubLObject)wff_suggest.$kw64$MT, constraint_mt), (SubLObject)wff_suggest.$list119, ConsesLow.append(solicit_data, (SubLObject)wff_suggest.NIL)), strategy, tactics, skills));
                }
            }
        }
        return (SubLObject)wff_suggest.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 22404L)
    public static SubLObject sake_fix_change_arg_type_constraint(final SubLObject wff_module, final SubLObject predicate, final SubLObject arg, final SubLObject col, final SubLObject mt, final SubLObject formula, final SubLObject constraint_mt, final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (wff_suggest.NIL != accessible_wf_fixP(wff_module, strategy, (SubLObject)wff_suggest.$kw133$CHANGE_CONSTRAINT)) {
            final SubLObject tactics = (SubLObject)wff_suggest.$list134;
            final SubLObject skills = (SubLObject)wff_suggest.$list81;
            final SubLObject new_formula = conses_high.subst((SubLObject)wff_suggest.$sym130$_NEW_COL, col, formula, (SubLObject)wff_suggest.UNPROVIDED, (SubLObject)wff_suggest.UNPROVIDED);
            final SubLObject constraint_formula = (SubLObject)ConsesLow.list(wff_suggest.$const68$ist, mt, (SubLObject)ConsesLow.list(wff_suggest.$const103$knownSentence, (SubLObject)ConsesLow.listS(predicate, arg, (SubLObject)wff_suggest.$list131)));
            final SubLObject constraint_status = sake_formula_status(constraint_formula, mt);
            if (wff_suggest.NIL == wff_suggest.$sake_suppress_unviableP$.getDynamicValue(thread) || wff_suggest.NIL != sake_viableP(constraint_status)) {
                final SubLObject min_candidates = (SubLObject)((wff_suggest.NIL != forts.fort_p(arg)) ? isa.min_isa(arg, mt, (SubLObject)wff_suggest.UNPROVIDED) : wff_suggest.NIL);
                final SubLObject candidate_count = (SubLObject)(Sequences.length(min_candidates).numG(wff_suggest.$sake_candidate_threshold$.getDynamicValue(thread)) ? Sequences.length(min_candidates) : wff_suggest.NIL);
                SubLObject solicit_data = (SubLObject)wff_suggest.NIL;
                if (wff_suggest.NIL != candidate_count) {
                    solicit_data = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)wff_suggest.$kw110$CANDIDATE_COUNT, candidate_count), solicit_data);
                }
                else if (wff_suggest.NIL != min_candidates) {
                    solicit_data = (SubLObject)ConsesLow.cons(reader.bq_cons((SubLObject)wff_suggest.$kw111$MIN_CANDIDATES, ConsesLow.append(min_candidates, (SubLObject)wff_suggest.NIL)), solicit_data);
                }
                solicit_data = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS((SubLObject)wff_suggest.$kw71$CONSTRAINTS, constraint_formula, ConsesLow.append(constraint_status, (SubLObject)wff_suggest.NIL)), solicit_data);
                solicit_data = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)wff_suggest.$kw78$SOLICIT_VARIABLE_BINDING, (SubLObject)wff_suggest.$sym130$_NEW_COL, ConsesLow.append(solicit_data, (SubLObject)wff_suggest.NIL)));
                return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)wff_suggest.$kw132$EDIT_ASSERTION, formula, (SubLObject)ConsesLow.list((SubLObject)wff_suggest.$kw64$MT, constraint_mt), (SubLObject)ConsesLow.listS((SubLObject)wff_suggest.$kw99$NEW_FORMULA, new_formula, (SubLObject)ConsesLow.list((SubLObject)wff_suggest.$kw64$MT, constraint_mt), ConsesLow.append(solicit_data, (SubLObject)wff_suggest.NIL)), strategy, tactics, skills));
            }
        }
        return (SubLObject)wff_suggest.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 23675L)
    public static SubLObject sake_fix_unassert_constraint(final SubLObject wff_module, final SubLObject formula, final SubLObject mt, final SubLObject strategy) {
        if (wff_suggest.NIL != accessible_wf_fixP(wff_module, strategy, (SubLObject)wff_suggest.$kw135$UNASSERT_CONSTRAINT)) {
            final SubLObject tactics = (SubLObject)wff_suggest.$list121;
            final SubLObject skills = (SubLObject)wff_suggest.$list81;
            return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)wff_suggest.$kw136$UNASSERT, formula, (SubLObject)ConsesLow.list((SubLObject)wff_suggest.$kw64$MT, mt), strategy, tactics, skills));
        }
        return (SubLObject)wff_suggest.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 23989L)
    public static SubLObject sake_fix_change_constraint_mt(final SubLObject wff_module, final SubLObject mt, final SubLObject formula, final SubLObject constraint_mt, final SubLObject strategy) {
        if (wff_suggest.NIL != accessible_wf_fixP(wff_module, strategy, (SubLObject)wff_suggest.$kw120$CHANGE_MT)) {
            final SubLObject tactics = (SubLObject)wff_suggest.$list121;
            final SubLObject skills = (SubLObject)wff_suggest.$list81;
            final SubLObject solicit_data = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)wff_suggest.$kw78$SOLICIT_VARIABLE_BINDING, (SubLObject)wff_suggest.$sym137$_NEW_MT, (SubLObject)ConsesLow.list((SubLObject)wff_suggest.$kw71$CONSTRAINTS, (SubLObject)ConsesLow.list(wff_suggest.$const138$unknownSentence, (SubLObject)ConsesLow.listS(wff_suggest.$const139$genlMt, mt, (SubLObject)wff_suggest.$list140)))));
            return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)wff_suggest.$kw141$CHANGE_ASSERTION_MT, formula, (SubLObject)ConsesLow.list((SubLObject)wff_suggest.$kw124$FROM_MT, constraint_mt), (SubLObject)wff_suggest.$list125, ConsesLow.append(solicit_data, (SubLObject)ConsesLow.list(strategy, tactics, skills))));
        }
        return (SubLObject)wff_suggest.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 24490L)
    public static SubLObject sake_fix_deny_constraint_applies_to_spec_pred(final SubLObject wff_module, final SubLObject relation, final SubLObject mt, final SubLObject via_genl_pred, final SubLObject strategy) {
        if (wff_suggest.NIL != via_genl_pred && wff_suggest.NIL != accessible_wf_fixP(wff_module, strategy, (SubLObject)wff_suggest.$kw142$DENY_HL_SUPPORT) && wff_suggest.NIL != fort_types_interface.predicateP(relation)) {
            final SubLObject tactics = (SubLObject)wff_suggest.$list143;
            final SubLObject skills = (SubLObject)wff_suggest.$list81;
            final SubLObject genl_preds_literal = (SubLObject)ConsesLow.list(wff_suggest.$const117$genlPreds, relation, via_genl_pred);
            final SubLObject genl_pred_support = arguments.make_hl_support((SubLObject)wff_suggest.$kw144$GENLPREDS, genl_preds_literal, mt, (SubLObject)wff_suggest.UNPROVIDED);
            return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)wff_suggest.$kw142$DENY_HL_SUPPORT, genl_pred_support, strategy, tactics, skills));
        }
        return (SubLObject)wff_suggest.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 25040L)
    public static SubLObject sake_fix_deny_hl_literal(final SubLObject wff_module, final SubLObject module, final SubLObject literal, final SubLObject mt, final SubLObject strategy) {
        if (wff_suggest.NIL != accessible_wf_fixP(wff_module, strategy, (SubLObject)wff_suggest.$kw142$DENY_HL_SUPPORT)) {
            final SubLObject tactics = (SubLObject)wff_suggest.$list145;
            final SubLObject skills = (SubLObject)wff_suggest.$list81;
            final SubLObject hl_support = arguments.make_hl_support(module, literal, mt, (SubLObject)wff_suggest.UNPROVIDED);
            return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)wff_suggest.$kw142$DENY_HL_SUPPORT, hl_support, strategy, tactics, skills));
        }
        return (SubLObject)wff_suggest.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 25811L)
    public static SubLObject accessible_wf_fixP(SubLObject module, SubLObject strategy, SubLObject tactic) {
        if (module == wff_suggest.UNPROVIDED) {
            module = (SubLObject)wff_suggest.NIL;
        }
        if (strategy == wff_suggest.UNPROVIDED) {
            strategy = (SubLObject)wff_suggest.NIL;
        }
        if (tactic == wff_suggest.UNPROVIDED) {
            tactic = (SubLObject)wff_suggest.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean((wff_suggest.NIL == module || wff_suggest.NIL != accessible_wf_fix_moduleP(module)) && (wff_suggest.NIL == strategy || wff_suggest.NIL != accessible_wf_fix_strategyP(strategy)) && (wff_suggest.NIL == tactic || wff_suggest.NIL != accessible_wf_fix_tacticP(tactic)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 26069L)
    public static SubLObject accessible_wf_fix_moduleP(final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(wff_suggest.$kw146$ALL.eql(wff_suggest.$accessible_wf_fix_modules$.getDynamicValue(thread)) || wff_suggest.NIL != subl_promotions.memberP(module, wff_suggest.$accessible_wf_fix_modules$.getDynamicValue(thread), (SubLObject)wff_suggest.UNPROVIDED, (SubLObject)wff_suggest.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 26218L)
    public static SubLObject accessible_wf_fix_strategyP(final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(wff_suggest.$kw146$ALL.eql(wff_suggest.$accessible_wf_fix_strategies$.getDynamicValue(thread)) || wff_suggest.NIL != subl_promotions.memberP(strategy, wff_suggest.$accessible_wf_fix_strategies$.getDynamicValue(thread), (SubLObject)wff_suggest.UNPROVIDED, (SubLObject)wff_suggest.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 26379L)
    public static SubLObject accessible_wf_fix_tacticP(final SubLObject tactic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(wff_suggest.$kw146$ALL.eql(wff_suggest.$accessible_wf_fix_tactics$.getDynamicValue(thread)) || wff_suggest.NIL != subl_promotions.memberP(tactic, wff_suggest.$accessible_wf_fix_tactics$.getDynamicValue(thread), (SubLObject)wff_suggest.UNPROVIDED, (SubLObject)wff_suggest.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 26528L)
    public static SubLObject sake_viableP(final SubLObject sake_data) {
        return (SubLObject)SubLObjectFactory.makeBoolean(wff_suggest.NIL == list_utilities.tree_find((SubLObject)wff_suggest.$kw147$UNVIABLE, sake_data, (SubLObject)wff_suggest.UNPROVIDED, (SubLObject)wff_suggest.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 26620L)
    public static SubLObject sake_formula_status(final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject formula_status = conses_high.copy_list(sake_formula_consistency_status(formula, mt));
        final SubLObject _prev_bind_0 = wff_vars.$provide_wff_suggestionsP$.currentBinding(thread);
        try {
            wff_vars.$provide_wff_suggestionsP$.bind((SubLObject)wff_suggest.NIL, thread);
            if (wff_suggest.NIL != wff.el_wffP(formula, mt, (SubLObject)wff_suggest.UNPROVIDED)) {
                formula_status = (SubLObject)ConsesLow.cons((SubLObject)wff_suggest.$list148, formula_status);
            }
            else {
                formula_status = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)wff_suggest.$kw149$WHY_NOT_WFF, wff.why_not_wff(formula, mt, (SubLObject)wff_suggest.UNPROVIDED)), formula_status);
            }
        }
        finally {
            wff_vars.$provide_wff_suggestionsP$.rebind(_prev_bind_0, thread);
        }
        if (wff_suggest.NIL != list_utilities.tree_find((SubLObject)wff_suggest.$kw149$WHY_NOT_WFF, formula_status, (SubLObject)wff_suggest.UNPROVIDED, (SubLObject)wff_suggest.UNPROVIDED) || wff_suggest.NIL != list_utilities.tree_find((SubLObject)wff_suggest.$kw150$WHY_NOT_CONSISTENT, formula_status, (SubLObject)wff_suggest.UNPROVIDED, (SubLObject)wff_suggest.UNPROVIDED)) {
            formula_status = (SubLObject)ConsesLow.cons((SubLObject)wff_suggest.$list151, formula_status);
        }
        return Sequences.nreverse(formula_status);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 27142L)
    public static SubLObject sake_formula_consistency_status(final SubLObject formula, final SubLObject mt) {
        final SubLObject pcase_var;
        final SubLObject relation = pcase_var = cycl_utilities.formula_arg0(formula);
        if (pcase_var.eql(wff_suggest.$const68$ist)) {
            return sake_formula_consistency_status(cycl_utilities.formula_arg2(formula, (SubLObject)wff_suggest.UNPROVIDED), cycl_utilities.formula_arg1(formula, (SubLObject)wff_suggest.UNPROVIDED));
        }
        if (pcase_var.eql(wff_suggest.$const103$knownSentence) || pcase_var.eql(wff_suggest.$const138$unknownSentence)) {
            return sake_formula_consistency_status(cycl_utilities.formula_arg1(formula, (SubLObject)wff_suggest.UNPROVIDED), mt);
        }
        if (pcase_var.eql(wff_suggest.$const116$and)) {
            SubLObject result = (SubLObject)wff_suggest.NIL;
            SubLObject cdolist_list_var = cycl_utilities.formula_args(formula, (SubLObject)wff_suggest.UNPROVIDED);
            SubLObject conjunct = (SubLObject)wff_suggest.NIL;
            conjunct = cdolist_list_var.first();
            while (wff_suggest.NIL != cdolist_list_var) {
                final SubLObject item_var = sake_formula_consistency_status(conjunct, mt);
                if (wff_suggest.NIL == conses_high.member(item_var, result, Symbols.symbol_function((SubLObject)wff_suggest.EQUAL), Symbols.symbol_function((SubLObject)wff_suggest.IDENTITY))) {
                    result = (SubLObject)ConsesLow.cons(item_var, result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                conjunct = cdolist_list_var.first();
            }
            return result;
        }
        if (wff_suggest.NIL == el_utilities.closedP(formula, (SubLObject)wff_suggest.$sym152$CYC_VAR_)) {
            return (SubLObject)wff_suggest.$list154;
        }
        final SubLObject pcase_var_$1 = relation;
        if (pcase_var_$1.eql(wff_suggest.$const2$isa)) {
            final SubLObject v_term = cycl_utilities.formula_arg1(formula, (SubLObject)wff_suggest.UNPROVIDED);
            final SubLObject col = cycl_utilities.formula_arg2(formula, (SubLObject)wff_suggest.UNPROVIDED);
            if (wff_suggest.NIL != isa.not_isaP(v_term, col, mt, (SubLObject)wff_suggest.UNPROVIDED)) {
                return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)wff_suggest.$kw150$WHY_NOT_CONSISTENT, isa.why_not_isaP(v_term, col, mt, (SubLObject)wff_suggest.UNPROVIDED, (SubLObject)wff_suggest.UNPROVIDED)));
            }
            return (SubLObject)wff_suggest.$list153;
        }
        else if (pcase_var_$1.eql(wff_suggest.$const6$genls)) {
            final SubLObject v_term = cycl_utilities.formula_arg1(formula, (SubLObject)wff_suggest.UNPROVIDED);
            final SubLObject col = cycl_utilities.formula_arg2(formula, (SubLObject)wff_suggest.UNPROVIDED);
            if (wff_suggest.NIL != genls.not_genlP(v_term, col, mt, (SubLObject)wff_suggest.UNPROVIDED)) {
                return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)wff_suggest.$kw150$WHY_NOT_CONSISTENT, genls.why_not_genlP(v_term, col, mt, (SubLObject)wff_suggest.UNPROVIDED, (SubLObject)wff_suggest.UNPROVIDED)));
            }
            return (SubLObject)wff_suggest.$list153;
        }
        else {
            if (wff_suggest.NIL != fi.fi_ask_int(cycl_utilities.negate(formula), mt, (SubLObject)wff_suggest.UNPROVIDED, (SubLObject)wff_suggest.UNPROVIDED, (SubLObject)wff_suggest.UNPROVIDED, (SubLObject)wff_suggest.UNPROVIDED)) {
                return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)wff_suggest.$kw150$WHY_NOT_CONSISTENT, fi.fi_justify_int(cycl_utilities.negate(formula), mt, (SubLObject)wff_suggest.UNPROVIDED)));
            }
            return (SubLObject)wff_suggest.$list153;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 28429L)
    public static SubLObject promissing_relation_analogs(final SubLObject rel, SubLObject mt) {
        if (mt == wff_suggest.UNPROVIDED) {
            mt = (SubLObject)wff_suggest.NIL;
        }
        final SubLObject promissing_via_expansion_inverses = promissing_relation_analogs_via_contractions(rel, mt);
        return promissing_via_expansion_inverses;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 28717L)
    public static SubLObject promissing_relation_analogs_via_contractions(final SubLObject relation, SubLObject mt) {
        if (mt == wff_suggest.UNPROVIDED) {
            mt = (SubLObject)wff_suggest.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)wff_suggest.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = control_vars.$mapping_answer$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_suggest.$target_relation$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            control_vars.$mapping_answer$.bind((SubLObject)wff_suggest.NIL, thread);
            wff_suggest.$target_relation$.bind(relation, thread);
            kb_mapping.map_other_index((SubLObject)wff_suggest.$sym155$GATHER_CONTRACTIONS_INT, relation, (SubLObject)wff_suggest.$kw156$TRUE, (SubLObject)wff_suggest.T);
            result = control_vars.$mapping_answer$.getDynamicValue(thread);
        }
        finally {
            wff_suggest.$target_relation$.rebind(_prev_bind_4, thread);
            control_vars.$mapping_answer$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 29034L)
    public static SubLObject gather_contractions_int(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = assertions_high.gaf_arg0(assertion);
        if (predicate.eql(wff_suggest.$const157$expansion) && wff_suggest.NIL != list_utilities.tree_find_if(Symbols.symbol_function((SubLObject)wff_suggest.$sym158$TARGET_RELATION_EXPRESSION_), assertions_high.gaf_arg2(assertion), (SubLObject)wff_suggest.UNPROVIDED)) {
            control_vars.$mapping_answer$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(assertions_high.gaf_arg1(assertion), (SubLObject)ConsesLow.list((SubLObject)wff_suggest.$kw159$SOURCE, assertion)), control_vars.$mapping_answer$.getDynamicValue(thread)), thread);
        }
        return (SubLObject)wff_suggest.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 29343L)
    public static SubLObject target_relation_expressionP(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (wff_suggest.NIL != el_utilities.el_formula_p(formula)) {
            return Equality.eql(cycl_utilities.formula_arg0(formula), wff_suggest.$target_relation$.getDynamicValue(thread));
        }
        return (SubLObject)wff_suggest.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-suggest.lisp", position = 29627L)
    public static SubLObject min_isa_covering(final SubLObject v_term, final SubLObject collection, SubLObject mt) {
        if (mt == wff_suggest.UNPROVIDED) {
            mt = (SubLObject)wff_suggest.NIL;
        }
        SubLObject result = (SubLObject)wff_suggest.NIL;
        SubLObject cdolist_list_var = isa.min_isa(v_term, mt, (SubLObject)wff_suggest.UNPROVIDED);
        SubLObject v_isa = (SubLObject)wff_suggest.NIL;
        v_isa = cdolist_list_var.first();
        while (wff_suggest.NIL != cdolist_list_var) {
            result = conses_high.nunion(result, genls.min_ceiling_cols((SubLObject)ConsesLow.list(v_isa, collection), (SubLObject)wff_suggest.NIL, mt, (SubLObject)wff_suggest.UNPROVIDED), (SubLObject)wff_suggest.UNPROVIDED, (SubLObject)wff_suggest.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            v_isa = cdolist_list_var.first();
        }
        return genls.min_cols(result, (SubLObject)wff_suggest.UNPROVIDED, (SubLObject)wff_suggest.UNPROVIDED);
    }
    
    public static SubLObject declare_wff_suggest_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_suggest", "non_wffness_repairs", "NON-WFFNESS-REPAIRS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_suggest", "wff_violations_repairs", "WFF-VIOLATIONS-REPAIRS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_suggest", "suggestions_for_mal_arg_wrt_arg_isa", "SUGGESTIONS-FOR-MAL-ARG-WRT-ARG-ISA", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_suggest", "suggestions_for_mal_arg_wrt_arg_not_isa_disjoint", "SUGGESTIONS-FOR-MAL-ARG-WRT-ARG-NOT-ISA-DISJOINT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_suggest", "suggestions_for_mal_arg_wrt_arg_genl", "SUGGESTIONS-FOR-MAL-ARG-WRT-ARG-GENL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_suggest", "sake_fix_arg_isa_via_make_it_so", "SAKE-FIX-ARG-ISA-VIA-MAKE-IT-SO", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_suggest", "sake_fix_arg_isa_disjoint_via_make_it_unknown", "SAKE-FIX-ARG-ISA-DISJOINT-VIA-MAKE-IT-UNKNOWN", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_suggest", "sake_fix_arg_genl_via_make_it_so", "SAKE-FIX-ARG-GENL-VIA-MAKE-IT-SO", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_suggest", "sake_fix_arg_type_via_make_exception", "SAKE-FIX-ARG-TYPE-VIA-MAKE-EXCEPTION", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_suggest", "sake_fix_arg_type_via_correct_formula", "SAKE-FIX-ARG-TYPE-VIA-CORRECT-FORMULA", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_suggest", "sake_fix_via_deny_constraint_applicability", "SAKE-FIX-VIA-DENY-CONSTRAINT-APPLICABILITY", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_suggest", "sake_fix_arg_type_via_correct_constraint", "SAKE-FIX-ARG-TYPE-VIA-CORRECT-CONSTRAINT", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_suggest", "sake_fix_assert_gaf2", "SAKE-FIX-ASSERT-GAF2", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_suggest", "sake_fix_edit_sufficient_defn", "SAKE-FIX-EDIT-SUFFICIENT-DEFN", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_suggest", "sake_fix_solicit_sufficient_defn", "SAKE-FIX-SOLICIT-SUFFICIENT-DEFN", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_suggest", "sake_fix_assert_arg_except_for", "SAKE-FIX-ASSERT-ARG-EXCEPT-FOR", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_suggest", "sake_fix_assert_arg_except_when", "SAKE-FIX-ASSERT-ARG-EXCEPT-WHEN", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_suggest", "sake_fix_change_formula_level", "SAKE-FIX-CHANGE-FORMULA-LEVEL", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_suggest", "sake_fix_change_formula_term", "SAKE-FIX-CHANGE-FORMULA-TERM", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_suggest", "sake_fix_change_formula_relation", "SAKE-FIX-CHANGE-FORMULA-RELATION", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_suggest", "sake_fix_weaken_formula_relation", "SAKE-FIX-WEAKEN-FORMULA-RELATION", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_suggest", "sake_fix_change_formula_mt", "SAKE-FIX-CHANGE-FORMULA-MT", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_suggest", "sake_fix_retract_formula", "SAKE-FIX-RETRACT-FORMULA", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_suggest", "sake_fix_weaken_arg_type_constraint", "SAKE-FIX-WEAKEN-ARG-TYPE-CONSTRAINT", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_suggest", "sake_fix_change_arg_type_constraint", "SAKE-FIX-CHANGE-ARG-TYPE-CONSTRAINT", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_suggest", "sake_fix_unassert_constraint", "SAKE-FIX-UNASSERT-CONSTRAINT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_suggest", "sake_fix_change_constraint_mt", "SAKE-FIX-CHANGE-CONSTRAINT-MT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_suggest", "sake_fix_deny_constraint_applies_to_spec_pred", "SAKE-FIX-DENY-CONSTRAINT-APPLIES-TO-SPEC-PRED", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_suggest", "sake_fix_deny_hl_literal", "SAKE-FIX-DENY-HL-LITERAL", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_suggest", "accessible_wf_fixP", "ACCESSIBLE-WF-FIX?", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_suggest", "accessible_wf_fix_moduleP", "ACCESSIBLE-WF-FIX-MODULE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_suggest", "accessible_wf_fix_strategyP", "ACCESSIBLE-WF-FIX-STRATEGY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_suggest", "accessible_wf_fix_tacticP", "ACCESSIBLE-WF-FIX-TACTIC?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_suggest", "sake_viableP", "SAKE-VIABLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_suggest", "sake_formula_status", "SAKE-FORMULA-STATUS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_suggest", "sake_formula_consistency_status", "SAKE-FORMULA-CONSISTENCY-STATUS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_suggest", "promissing_relation_analogs", "PROMISSING-RELATION-ANALOGS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_suggest", "promissing_relation_analogs_via_contractions", "PROMISSING-RELATION-ANALOGS-VIA-CONTRACTIONS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_suggest", "gather_contractions_int", "GATHER-CONTRACTIONS-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_suggest", "target_relation_expressionP", "TARGET-RELATION-EXPRESSION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_suggest", "min_isa_covering", "MIN-ISA-COVERING", 2, 1, false);
        return (SubLObject)wff_suggest.NIL;
    }
    
    public static SubLObject init_wff_suggest_file() {
        wff_suggest.$sake_candidate_threshold$ = SubLFiles.defparameter("*SAKE-CANDIDATE-THRESHOLD*", (SubLObject)wff_suggest.TEN_INTEGER);
        wff_suggest.$sake_suppress_unviableP$ = SubLFiles.defparameter("*SAKE-SUPPRESS-UNVIABLE?*", (SubLObject)wff_suggest.T);
        wff_suggest.$accessible_wf_fix_modules$ = SubLFiles.defparameter("*ACCESSIBLE-WF-FIX-MODULES*", (SubLObject)wff_suggest.$kw146$ALL);
        wff_suggest.$accessible_wf_fix_strategies$ = SubLFiles.defparameter("*ACCESSIBLE-WF-FIX-STRATEGIES*", (SubLObject)wff_suggest.$kw146$ALL);
        wff_suggest.$accessible_wf_fix_tactics$ = SubLFiles.defparameter("*ACCESSIBLE-WF-FIX-TACTICS*", (SubLObject)wff_suggest.$kw146$ALL);
        wff_suggest.$target_relation$ = SubLFiles.defparameter("*TARGET-RELATION*", (SubLObject)wff_suggest.NIL);
        return (SubLObject)wff_suggest.NIL;
    }
    
    public static SubLObject setup_wff_suggest_file() {
        return (SubLObject)wff_suggest.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_wff_suggest_file();
    }
    
    @Override
	public void initializeVariables() {
        init_wff_suggest_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_wff_suggest_file();
    }
    
    static {
        me = (SubLFile)new wff_suggest();
        wff_suggest.$sake_candidate_threshold$ = null;
        wff_suggest.$sake_suppress_unviableP$ = null;
        wff_suggest.$accessible_wf_fix_modules$ = null;
        wff_suggest.$accessible_wf_fix_strategies$ = null;
        wff_suggest.$accessible_wf_fix_tactics$ = null;
        wff_suggest.$target_relation$ = null;
        $kw0$MAL_ARG_WRT_ARG_ISA = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-ARG-ISA");
        $list1 = ConsesLow.listS((SubLObject)SubLObjectFactory.makeSymbol("WFF-MODULE"), new SubLObject[] { SubLObjectFactory.makeSymbol("ARG"), SubLObjectFactory.makeSymbol("RELN"), SubLObjectFactory.makeSymbol("POS"), SubLObjectFactory.makeSymbol("COL"), SubLObjectFactory.makeSymbol("MT"), SubLObjectFactory.makeSymbol("DATA") });
        $const2$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $kw3$MAL_ARG_WRT_ARG_QUOTED_ISA = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-ARG-QUOTED-ISA");
        $const4$quotedIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedIsa"));
        $kw5$MAL_ARG_WRT_ARG_GENLS = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-ARG-GENLS");
        $const6$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $kw7$MAL_ARG_WRT_ARG_NOT_ISA_DISJOINT = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-ARG-NOT-ISA-DISJOINT");
        $kw8$MAL_ARG_WRT_ARG_NOT_QUOTED_ISA_DISJOINT = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-ARG-NOT-QUOTED-ISA-DISJOINT");
        $kw9$MAL_ARG_WRT_ARG_NOT_GENLS_DISJOINT = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-ARG-NOT-GENLS-DISJOINT");
        $kw10$MAL_ARG_WRT_INTER_ARG_ISA = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-INTER-ARG-ISA");
        $kw11$MAL_ARG_WRT_INTER_ARG_NOT_ISA = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-INTER-ARG-NOT-ISA");
        $kw12$MAL_ARG_WRT_INTER_ARG_GENL = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-INTER-ARG-GENL");
        $kw13$MAL_ARG_WRT_INTER_ARG_NOT_ISA_DISJOINT = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-INTER-ARG-NOT-ISA-DISJOINT");
        $kw14$MAL_ARG_WRT_INTER_ARG_NOT_GENL_DISJOINT = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-INTER-ARG-NOT-GENL-DISJOINT");
        $kw15$MAL_ARG_WRT_ARG_FORMAT = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-ARG-FORMAT");
        $kw16$MAL_ARG_WRT_INTER_ARG_FORMAT = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-INTER-ARG-FORMAT");
        $kw17$MAL_ARG_WRT_INTER_ARG_DIFFERENT = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-INTER-ARG-DIFFERENT");
        $list18 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("WFF-MODULE"), SubLObjectFactory.makeSymbol("RELN"), SubLObjectFactory.makeSymbol("ARG1"), SubLObjectFactory.makeSymbol("PSN1"), SubLObjectFactory.makeSymbol("ARG2"), SubLObjectFactory.makeSymbol("PSN2"), SubLObjectFactory.makeSymbol("MT"), SubLObjectFactory.makeSymbol("&OPTIONAL"), SubLObjectFactory.makeSymbol("VIA") });
        $const19$different = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("different"));
        $kw20$MAL_RELN_WRT_ARG_ISA_REQUIRED = SubLObjectFactory.makeKeyword("MAL-RELN-WRT-ARG-ISA-REQUIRED");
        $kw21$CONFLICT_ASSERTING_TRUE_SBHL = SubLObjectFactory.makeKeyword("CONFLICT-ASSERTING-TRUE-SBHL");
        $kw22$CONFLICT_ASSERTING_FALSE_SBHL = SubLObjectFactory.makeKeyword("CONFLICT-ASSERTING-FALSE-SBHL");
        $kw23$DISJOINT_ARG_ISA = SubLObjectFactory.makeKeyword("DISJOINT-ARG-ISA");
        $kw24$DISJOINT_ARG_QUOTED_ISA = SubLObjectFactory.makeKeyword("DISJOINT-ARG-QUOTED-ISA");
        $kw25$DISJOINT_ARG_GENL = SubLObjectFactory.makeKeyword("DISJOINT-ARG-GENL");
        $kw26$RESTRICTED_SKOLEM_ASSERTION = SubLObjectFactory.makeKeyword("RESTRICTED-SKOLEM-ASSERTION");
        $kw27$RESTRICTED_PREDICATE_ASSERTION = SubLObjectFactory.makeKeyword("RESTRICTED-PREDICATE-ASSERTION");
        $kw28$RESTRICTED_COLLECTION_ASSERTION = SubLObjectFactory.makeKeyword("RESTRICTED-COLLECTION-ASSERTION");
        $kw29$RESTRICTED_MT_ASSERTION = SubLObjectFactory.makeKeyword("RESTRICTED-MT-ASSERTION");
        $kw30$EVALUATABLE_LITERAL_FALSE = SubLObjectFactory.makeKeyword("EVALUATABLE-LITERAL-FALSE");
        $kw31$MAL_PRECANONICALIZATIONS = SubLObjectFactory.makeKeyword("MAL-PRECANONICALIZATIONS");
        $kw32$INVALID_EXPANSION = SubLObjectFactory.makeKeyword("INVALID-EXPANSION");
        $kw33$RECURSION_LIMIT_EXCEEDED = SubLObjectFactory.makeKeyword("RECURSION-LIMIT-EXCEEDED");
        $kw34$EL_UNEVALUATABLE_EXPRESSION = SubLObjectFactory.makeKeyword("EL-UNEVALUATABLE-EXPRESSION");
        $kw35$QUANTIFIED_SEQUENCE_VARIABLE = SubLObjectFactory.makeKeyword("QUANTIFIED-SEQUENCE-VARIABLE");
        $kw36$TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE = SubLObjectFactory.makeKeyword("TOO-MANY-SEQUENCE-VARS-IN-SKOLEM-SCOPE");
        $kw37$AMBIGUOUS_VAR_TYPE_IN_SKOLEM_SCOPE = SubLObjectFactory.makeKeyword("AMBIGUOUS-VAR-TYPE-IN-SKOLEM-SCOPE");
        $kw38$INHIBITED_SEQUENCE_VARIABLE = SubLObjectFactory.makeKeyword("INHIBITED-SEQUENCE-VARIABLE");
        $kw39$TOO_MANY_COMMUTATIVE_IN_ARGS_AND_REST = SubLObjectFactory.makeKeyword("TOO-MANY-COMMUTATIVE-IN-ARGS-AND-REST");
        $sym40$GENL_ = SubLObjectFactory.makeSymbol("GENL?");
        $sym41$FORMULA_ARG2 = SubLObjectFactory.makeSymbol("FORMULA-ARG2");
        $kw42$EL = SubLObjectFactory.makeKeyword("EL");
        $list43 = ConsesLow.listS((SubLObject)SubLObjectFactory.makeSymbol("MODULE"), new SubLObject[] { SubLObjectFactory.makeSymbol("ARG"), SubLObjectFactory.makeSymbol("RELATION"), SubLObjectFactory.makeSymbol("ARGNUM"), SubLObjectFactory.makeSymbol("COL"), SubLObjectFactory.makeSymbol("MT"), SubLObjectFactory.makeSymbol("DATA") });
        $kw44$VIA_GENL_PRED = SubLObjectFactory.makeKeyword("VIA-GENL-PRED");
        $kw45$WFF_FORMULA = SubLObjectFactory.makeKeyword("WFF-FORMULA");
        $kw46$NL = SubLObjectFactory.makeKeyword("NL");
        $str47$dont_know_how_to_describe_fixes_f = SubLObjectFactory.makeString("dont know how to describe fixes for ~a in NL.");
        $kw48$AT_CONSTRAINT_GAF = SubLObjectFactory.makeKeyword("AT-CONSTRAINT-GAF");
        $kw49$MAKE_IT_SO = SubLObjectFactory.makeKeyword("MAKE-IT-SO");
        $list50 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SAKE-STRATEGY"), (SubLObject)SubLObjectFactory.makeKeyword("SATISFY-CONSTRAINT"));
        $kw51$ISA = SubLObjectFactory.makeKeyword("ISA");
        $kw52$MAKE_EXCEPTION = SubLObjectFactory.makeKeyword("MAKE-EXCEPTION");
        $list53 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SAKE-STRATEGY"), (SubLObject)SubLObjectFactory.makeKeyword("MAKE-EXCPETION"));
        $kw54$CORRECT_FORMULA = SubLObjectFactory.makeKeyword("CORRECT-FORMULA");
        $list55 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SAKE-STRATEGY"), (SubLObject)SubLObjectFactory.makeKeyword("CORRECT-FORMULA"));
        $kw56$DENY_APPLICABLILITY = SubLObjectFactory.makeKeyword("DENY-APPLICABLILITY");
        $list57 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SAKE-STRATEGY"), (SubLObject)SubLObjectFactory.makeKeyword("DENY-APPLICABLILITY"));
        $kw58$CORRECT_CONSTRAINT = SubLObjectFactory.makeKeyword("CORRECT-CONSTRAINT");
        $list59 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SAKE-STRATEGY"), (SubLObject)SubLObjectFactory.makeKeyword("CORRECT-CONSTRAINT"));
        $kw60$ASSERT_GAF = SubLObjectFactory.makeKeyword("ASSERT-GAF");
        $list61 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SAKE-TACTICS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ASSERT-GAF"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE")));
        $list62 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("USER-SKILLS"), (SubLObject)SubLObjectFactory.makeKeyword("KE-1"));
        $kw63$ASSERT = SubLObjectFactory.makeKeyword("ASSERT");
        $kw64$MT = SubLObjectFactory.makeKeyword("MT");
        $kw65$EDIT_DEFN = SubLObjectFactory.makeKeyword("EDIT-DEFN");
        $list66 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SAKE-TACTICS"), (SubLObject)SubLObjectFactory.makeKeyword("EDIT-DEFN"));
        $list67 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("USER-SKILLS"), (SubLObject)SubLObjectFactory.makeKeyword("SE-3"));
        $const68$ist = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist"));
        $const69$defnAdmits = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("defnAdmits"));
        $kw70$EDIT_SUBL = SubLObjectFactory.makeKeyword("EDIT-SUBL");
        $kw71$CONSTRAINTS = SubLObjectFactory.makeKeyword("CONSTRAINTS");
        $kw72$SOLICIT_DEFN = SubLObjectFactory.makeKeyword("SOLICIT-DEFN");
        $kw73$ASSERT_DEFN = SubLObjectFactory.makeKeyword("ASSERT-DEFN");
        $list74 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SAKE-TACTICS"), (SubLObject)SubLObjectFactory.makeKeyword("SOLICIT-SUFFICIENT-DEFN"));
        $const75$defnSufficient = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("defnSufficient"));
        $list76 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubLQuoteFn")), (SubLObject)SubLObjectFactory.makeSymbol("?DEFN")));
        $sym77$_DEFN = SubLObjectFactory.makeSymbol("?DEFN");
        $kw78$SOLICIT_VARIABLE_BINDING = SubLObjectFactory.makeKeyword("SOLICIT-VARIABLE-BINDING");
        $kw79$ASSERT_EXCEPT_FOR = SubLObjectFactory.makeKeyword("ASSERT-EXCEPT-FOR");
        $list80 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SAKE-TACTICS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ASSERT-GAF"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("exceptFor"))));
        $list81 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("USER-SKILLS"), (SubLObject)SubLObjectFactory.makeKeyword("KE-3"));
        $const82$exceptFor = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("exceptFor"));
        $kw83$ASSERT_EXCEPT_WHEN = SubLObjectFactory.makeKeyword("ASSERT-EXCEPT-WHEN");
        $list84 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SAKE-TACTICS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ASSERT-GAF"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("exceptWhen"))));
        $const85$implies = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies"));
        $const86$evaluate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluate"));
        $sym87$_FORMULA_WRT_ARG = SubLObjectFactory.makeSymbol("?FORMULA-WRT-ARG");
        $const88$SubstituteFormulaFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubstituteFormulaFn"));
        $list89 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("?ARG")), (SubLObject)SubLObjectFactory.makeSymbol("?FORMULA"));
        $list90 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("knownSentence")), (SubLObject)SubLObjectFactory.makeSymbol("?FORMULA-WRT-ARG")));
        $sym91$_FORMULA = SubLObjectFactory.makeSymbol("?FORMULA");
        $const92$exceptWhen = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("exceptWhen"));
        $kw93$CHANGE_LEVEL = SubLObjectFactory.makeKeyword("CHANGE-LEVEL");
        $list94 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SAKE-TACTICS"), (SubLObject)SubLObjectFactory.makeKeyword("CHANGE-REFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("TERM-TO-ALL"));
        $list95 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("USER-SKILLS"), (SubLObject)SubLObjectFactory.makeKeyword("KE-2"));
        $const96$relationAllInstance = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAllInstance"));
        $const97$relationInstanceAll = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationInstanceAll"));
        $kw98$EDIT_FORMULA = SubLObjectFactory.makeKeyword("EDIT-FORMULA");
        $kw99$NEW_FORMULA = SubLObjectFactory.makeKeyword("NEW-FORMULA");
        $kw100$CHANGE_TERM = SubLObjectFactory.makeKeyword("CHANGE-TERM");
        $list101 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SAKE-TACTICS"), (SubLObject)SubLObjectFactory.makeKeyword("CHANGE-TERM"));
        $sym102$_NEW_TERM = SubLObjectFactory.makeSymbol("?NEW-TERM");
        $const103$knownSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("knownSentence"));
        $const104$conceptuallyRelated = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conceptuallyRelated"));
        $kw105$PREFERENCES = SubLObjectFactory.makeKeyword("PREFERENCES");
        $kw106$CHANGE_RELATION = SubLObjectFactory.makeKeyword("CHANGE-RELATION");
        $list107 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SAKE-TACTICS"), (SubLObject)SubLObjectFactory.makeKeyword("CHANGE-RELATION"));
        $sym108$_NEW_RELATION = SubLObjectFactory.makeSymbol("?NEW-RELATION");
        $kw109$PROMISSING_BINDINGS = SubLObjectFactory.makeKeyword("PROMISSING-BINDINGS");
        $kw110$CANDIDATE_COUNT = SubLObjectFactory.makeKeyword("CANDIDATE-COUNT");
        $kw111$MIN_CANDIDATES = SubLObjectFactory.makeKeyword("MIN-CANDIDATES");
        $const112$admittedArgument = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("admittedArgument"));
        $kw113$WEAKEN_RELATION = SubLObjectFactory.makeKeyword("WEAKEN-RELATION");
        $list114 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SAKE-TACTICS"), (SubLObject)SubLObjectFactory.makeKeyword("WEAKEN-PREDICATE"));
        $sym115$_NEW_PREDICATE = SubLObjectFactory.makeSymbol("?NEW-PREDICATE");
        $const116$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $const117$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $list118 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?NEW-PREDICATE"));
        $list119 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EDIT-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("WEAKEN"));
        $kw120$CHANGE_MT = SubLObjectFactory.makeKeyword("CHANGE-MT");
        $list121 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SAKE-TACTICS"), (SubLObject)SubLObjectFactory.makeKeyword("CHANGE-MT"));
        $kw122$MAX_CANDIDATES = SubLObjectFactory.makeKeyword("MAX-CANDIDATES");
        $kw123$CHANGE_FORMULA_MT = SubLObjectFactory.makeKeyword("CHANGE-FORMULA-MT");
        $kw124$FROM_MT = SubLObjectFactory.makeKeyword("FROM-MT");
        $list125 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TO-MT"), (SubLObject)SubLObjectFactory.makeSymbol("?NEW-MT"));
        $kw126$RETRACT_FORMULA = SubLObjectFactory.makeKeyword("RETRACT-FORMULA");
        $list127 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SAKE-TACTICS"), (SubLObject)SubLObjectFactory.makeKeyword("RETRACT-FORMULA"));
        $kw128$WEAKEN_CONSTRAINT = SubLObjectFactory.makeKeyword("WEAKEN-CONSTRAINT");
        $list129 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SAKE-TACTICS"), (SubLObject)SubLObjectFactory.makeKeyword("WEAKEN-CONSTRAINT"));
        $sym130$_NEW_COL = SubLObjectFactory.makeSymbol("?NEW-COL");
        $list131 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?NEW-COL"));
        $kw132$EDIT_ASSERTION = SubLObjectFactory.makeKeyword("EDIT-ASSERTION");
        $kw133$CHANGE_CONSTRAINT = SubLObjectFactory.makeKeyword("CHANGE-CONSTRAINT");
        $list134 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SAKE-TACTICS"), (SubLObject)SubLObjectFactory.makeKeyword("CHANGE-CONSTRAINT"));
        $kw135$UNASSERT_CONSTRAINT = SubLObjectFactory.makeKeyword("UNASSERT-CONSTRAINT");
        $kw136$UNASSERT = SubLObjectFactory.makeKeyword("UNASSERT");
        $sym137$_NEW_MT = SubLObjectFactory.makeSymbol("?NEW-MT");
        $const138$unknownSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentence"));
        $const139$genlMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt"));
        $list140 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?NEW-MT"));
        $kw141$CHANGE_ASSERTION_MT = SubLObjectFactory.makeKeyword("CHANGE-ASSERTION-MT");
        $kw142$DENY_HL_SUPPORT = SubLObjectFactory.makeKeyword("DENY-HL-SUPPORT");
        $list143 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SAKE-TACTICS"), (SubLObject)SubLObjectFactory.makeKeyword("DENY-SUPPRT"));
        $kw144$GENLPREDS = SubLObjectFactory.makeKeyword("GENLPREDS");
        $list145 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SAKE-TACTICS"), (SubLObject)SubLObjectFactory.makeKeyword("DENY-SUPPORT"));
        $kw146$ALL = SubLObjectFactory.makeKeyword("ALL");
        $kw147$UNVIABLE = SubLObjectFactory.makeKeyword("UNVIABLE");
        $list148 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("WFF"), (SubLObject)wff_suggest.T);
        $kw149$WHY_NOT_WFF = SubLObjectFactory.makeKeyword("WHY-NOT-WFF");
        $kw150$WHY_NOT_CONSISTENT = SubLObjectFactory.makeKeyword("WHY-NOT-CONSISTENT");
        $list151 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SAKE-STATUS"), (SubLObject)SubLObjectFactory.makeKeyword("UNVIABLE"));
        $sym152$CYC_VAR_ = SubLObjectFactory.makeSymbol("CYC-VAR?");
        $list153 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CONSISTENT"), (SubLObject)wff_suggest.T));
        $list154 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CONSISTENT"), (SubLObject)SubLObjectFactory.makeKeyword("ASSUMED")));
        $sym155$GATHER_CONTRACTIONS_INT = SubLObjectFactory.makeSymbol("GATHER-CONTRACTIONS-INT");
        $kw156$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $const157$expansion = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("expansion"));
        $sym158$TARGET_RELATION_EXPRESSION_ = SubLObjectFactory.makeSymbol("TARGET-RELATION-EXPRESSION?");
        $kw159$SOURCE = SubLObjectFactory.makeKeyword("SOURCE");
    }
}

/*

	Total time: 635 ms
	
*/