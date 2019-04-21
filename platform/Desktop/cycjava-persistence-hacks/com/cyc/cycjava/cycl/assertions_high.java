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

public final class assertions_high extends SubLTranslatedFile
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
    public static SubLObject do_assertion_arguments(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)assertions_high.$list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject argument_var = (SubLObject)assertions_high.NIL;
        SubLObject assertion = (SubLObject)assertions_high.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)assertions_high.$list0);
        argument_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)assertions_high.$list0);
        assertion = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)assertions_high.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)assertions_high.NIL;
        SubLObject current_$1 = (SubLObject)assertions_high.NIL;
        while (assertions_high.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)assertions_high.$list0);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)assertions_high.$list0);
            if (assertions_high.NIL == conses_high.member(current_$1, (SubLObject)assertions_high.$list1, (SubLObject)assertions_high.UNPROVIDED, (SubLObject)assertions_high.UNPROVIDED)) {
                bad = (SubLObject)assertions_high.T;
            }
            if (current_$1 == assertions_high.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (assertions_high.NIL != bad && assertions_high.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)assertions_high.$list0);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)assertions_high.$kw3$DONE, current);
        final SubLObject done = (SubLObject)((assertions_high.NIL != done_tail) ? conses_high.cadr(done_tail) : assertions_high.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)assertions_high.$sym4$DO_LIST, (SubLObject)ConsesLow.list(argument_var, (SubLObject)ConsesLow.list((SubLObject)assertions_high.$sym5$ASSERTION_ARGUMENTS, assertion), (SubLObject)assertions_high.$kw3$DONE, done), ConsesLow.append(body, (SubLObject)assertions_high.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 1684L)
    public static SubLObject do_assertion_dependents(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)assertions_high.$list6);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject deduction_var = (SubLObject)assertions_high.NIL;
        SubLObject assertion = (SubLObject)assertions_high.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)assertions_high.$list6);
        deduction_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)assertions_high.$list6);
        assertion = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)assertions_high.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)assertions_high.NIL;
        SubLObject current_$2 = (SubLObject)assertions_high.NIL;
        while (assertions_high.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)assertions_high.$list6);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)assertions_high.$list6);
            if (assertions_high.NIL == conses_high.member(current_$2, (SubLObject)assertions_high.$list1, (SubLObject)assertions_high.UNPROVIDED, (SubLObject)assertions_high.UNPROVIDED)) {
                bad = (SubLObject)assertions_high.T;
            }
            if (current_$2 == assertions_high.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (assertions_high.NIL != bad && assertions_high.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)assertions_high.$list6);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)assertions_high.$kw3$DONE, current);
        final SubLObject done = (SubLObject)((assertions_high.NIL != done_tail) ? conses_high.cadr(done_tail) : assertions_high.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)assertions_high.$sym7$DO_SET_CONTENTS, (SubLObject)ConsesLow.list(deduction_var, (SubLObject)ConsesLow.list((SubLObject)assertions_high.$sym8$ASSERTION_DEPENDENTS, assertion), (SubLObject)assertions_high.$kw3$DONE, done), ConsesLow.append(body, (SubLObject)assertions_high.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 2126L)
    public static SubLObject do_assertion_literals(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)assertions_high.$list9);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject lit_var = (SubLObject)assertions_high.NIL;
        SubLObject assertion = (SubLObject)assertions_high.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)assertions_high.$list9);
        lit_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)assertions_high.$list9);
        assertion = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)assertions_high.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)assertions_high.NIL;
        SubLObject current_$3 = (SubLObject)assertions_high.NIL;
        while (assertions_high.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)assertions_high.$list9);
            current_$3 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)assertions_high.$list9);
            if (assertions_high.NIL == conses_high.member(current_$3, (SubLObject)assertions_high.$list10, (SubLObject)assertions_high.UNPROVIDED, (SubLObject)assertions_high.UNPROVIDED)) {
                bad = (SubLObject)assertions_high.T;
            }
            if (current_$3 == assertions_high.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (assertions_high.NIL != bad && assertions_high.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)assertions_high.$list9);
        }
        final SubLObject sense_tail = cdestructuring_bind.property_list_member((SubLObject)assertions_high.$kw11$SENSE, current);
        final SubLObject sense = (SubLObject)((assertions_high.NIL != sense_tail) ? conses_high.cadr(sense_tail) : assertions_high.NIL);
        final SubLObject predicate_tail = cdestructuring_bind.property_list_member((SubLObject)assertions_high.$kw12$PREDICATE, current);
        final SubLObject predicate = (SubLObject)((assertions_high.NIL != predicate_tail) ? conses_high.cadr(predicate_tail) : assertions_high.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)assertions_high.$kw3$DONE, current);
        final SubLObject done = (SubLObject)((assertions_high.NIL != done_tail) ? conses_high.cadr(done_tail) : assertions_high.NIL);
        final SubLObject body;
        current = (body = temp);
        if (assertions_high.NIL != predicate) {
            final SubLObject predicate_var = (SubLObject)assertions_high.$sym13$PREDICATE_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)assertions_high.$sym14$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(predicate_var, predicate)), (SubLObject)ConsesLow.list((SubLObject)assertions_high.$sym15$DO_ASSERTION_LITERALS, (SubLObject)ConsesLow.list(lit_var, assertion, (SubLObject)assertions_high.$kw11$SENSE, sense, (SubLObject)assertions_high.$kw3$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)assertions_high.$sym16$PWHEN, (SubLObject)ConsesLow.list((SubLObject)assertions_high.EQL, predicate_var, (SubLObject)ConsesLow.list((SubLObject)assertions_high.$sym17$ATOMIC_SENTENCE_PREDICATE, lit_var)), ConsesLow.append(body, (SubLObject)assertions_high.NIL))));
        }
        final SubLObject cnf_var = (SubLObject)assertions_high.$sym18$CNF_VAR;
        final SubLObject assertion_var = (SubLObject)assertions_high.$sym19$ASSERTION_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)assertions_high.$sym14$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(assertion_var, assertion)), (SubLObject)ConsesLow.list((SubLObject)assertions_high.$sym14$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(cnf_var, (SubLObject)ConsesLow.list((SubLObject)assertions_high.$sym20$ASSERTION_CNF, assertion_var))), (SubLObject)ConsesLow.listS((SubLObject)assertions_high.$sym21$DO_ALL_LITS_AS_ASENTS, (SubLObject)ConsesLow.list(lit_var, cnf_var, (SubLObject)assertions_high.$kw11$SENSE, sense, (SubLObject)assertions_high.$kw3$DONE, done), ConsesLow.append(body, (SubLObject)assertions_high.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 3064L)
    public static SubLObject do_recent_assertions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)assertions_high.$list22);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)assertions_high.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)assertions_high.$list22);
        var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)assertions_high.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)assertions_high.NIL;
        SubLObject current_$4 = (SubLObject)assertions_high.NIL;
        while (assertions_high.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)assertions_high.$list22);
            current_$4 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)assertions_high.$list22);
            if (assertions_high.NIL == conses_high.member(current_$4, (SubLObject)assertions_high.$list23, (SubLObject)assertions_high.UNPROVIDED, (SubLObject)assertions_high.UNPROVIDED)) {
                bad = (SubLObject)assertions_high.T;
            }
            if (current_$4 == assertions_high.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (assertions_high.NIL != bad && assertions_high.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)assertions_high.$list22);
        }
        final SubLObject num_tail = cdestructuring_bind.property_list_member((SubLObject)assertions_high.$kw24$NUM, current);
        final SubLObject num = (SubLObject)((assertions_high.NIL != num_tail) ? conses_high.cadr(num_tail) : assertions_high.NIL);
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)assertions_high.$kw25$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((assertions_high.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : assertions_high.$str26$mapping_assertions_for_sweep);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)assertions_high.$kw3$DONE, current);
        final SubLObject done = (SubLObject)((assertions_high.NIL != done_tail) ? conses_high.cadr(done_tail) : assertions_high.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)assertions_high.$sym27$PIF, (SubLObject)ConsesLow.list((SubLObject)assertions_high.$sym28$POSITIVE_INTEGER_P, num), (SubLObject)ConsesLow.listS((SubLObject)assertions_high.$sym29$PROGRESS_CSOME, (SubLObject)ConsesLow.list(var, (SubLObject)ConsesLow.list((SubLObject)assertions_high.$sym30$ASSERTIONS_AROUND, (SubLObject)assertions_high.$list31, num, num), progress_message, done), ConsesLow.append(body, (SubLObject)assertions_high.NIL)), (SubLObject)ConsesLow.listS((SubLObject)assertions_high.$sym32$DO_ASSERTIONS, (SubLObject)ConsesLow.list(var, progress_message, (SubLObject)assertions_high.$kw3$DONE, done), ConsesLow.append(body, (SubLObject)assertions_high.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 3641L)
    public static SubLObject assertion_cnf(final SubLObject assertion) {
        enforceType(assertion, assertions_high.$sym33$ASSERTION_P);
        return (SubLObject)((assertions_high.NIL != assertion_handles.assertion_handle_validP(assertion)) ? assertions_interface.kb_assertion_cnf(assertion) : assertions_high.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 4109L)
    public static SubLObject intuitive_assertion_cnf(final SubLObject assertion) {
        if (assertions_high.NIL == assertion_handles.assertion_handle_validP(assertion)) {
            return (SubLObject)assertions_high.NIL;
        }
        if (assertions_high.NIL != assertion_utilities.false_assertionP(assertion) && assertions_high.NIL != gaf_assertionP(assertion)) {
            return clause_utilities.make_false_gaf_cnf(gaf_formula(assertion));
        }
        return assertions_interface.kb_assertion_cnf(assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 4500L)
    public static SubLObject intuitive_cnf(final SubLObject cnf, final SubLObject truth) {
        if (assertions_high.NIL != clauses.gaf_cnfP(cnf) && assertions_high.$kw38$FALSE == truth) {
            return clause_utilities.make_false_gaf_cnf(clause_utilities.gaf_cnf_literal(cnf));
        }
        return cnf;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 4795L)
    public static SubLObject possibly_assertion_cnf(final SubLObject assertion) {
        return (SubLObject)((assertions_high.NIL != assertion_handles.assertion_handle_validP(assertion)) ? assertions_interface.kb_possibly_assertion_cnf(assertion) : assertions_high.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 5001L)
    public static SubLObject assertion_mt(final SubLObject assertion) {
        enforceType(assertion, assertions_high.$sym33$ASSERTION_P);
        return (SubLObject)((assertions_high.NIL != assertion_handles.assertion_handle_validP(assertion)) ? assertions_interface.kb_assertion_mt(assertion) : assertions_high.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 5226L)
    public static SubLObject assertion_gaf_hl_formula(final SubLObject assertion) {
        return (SubLObject)((assertions_high.NIL != assertion_handles.assertion_handle_validP(assertion)) ? assertions_interface.kb_assertion_gaf_hl_formula(assertion) : assertions_high.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 5374L)
    public static SubLObject assertion_cons(final SubLObject assertion) {
        return (SubLObject)((assertions_high.NIL != assertion_handles.assertion_handle_validP(assertion)) ? assertions_interface.kb_assertion_cons(assertion) : assertions_high.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 5673L)
    public static SubLObject gaf_assertionP(final SubLObject assertion) {
        return (SubLObject)SubLObjectFactory.makeBoolean(assertions_high.NIL != assertion_handles.valid_assertion_handleP(assertion) && assertions_high.NIL != assertions_interface.kb_gaf_assertionP(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 5865L)
    public static SubLObject rule_assertionP(final SubLObject assertion) {
        return (SubLObject)SubLObjectFactory.makeBoolean(assertions_high.NIL != assertion_handles.valid_assertion_handleP(assertion) && assertions_high.NIL != assertions_interface.kb_rule_assertionP(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 6076L)
    public static SubLObject assertion_direction(final SubLObject assertion) {
        enforceType(assertion, assertions_high.$sym33$ASSERTION_P);
        return (SubLObject)((assertions_high.NIL != assertion_handles.assertion_handle_validP(assertion)) ? assertions_interface.kb_assertion_direction(assertion) : assertions_high.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 6365L)
    public static SubLObject assertion_truth(final SubLObject assertion) {
        enforceType(assertion, assertions_high.$sym33$ASSERTION_P);
        return (SubLObject)((assertions_high.NIL != assertion_handles.assertion_handle_validP(assertion)) ? assertions_interface.kb_assertion_truth(assertion) : assertions_high.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 6643L)
    public static SubLObject assertion_strength(final SubLObject assertion) {
        enforceType(assertion, assertions_high.$sym33$ASSERTION_P);
        return (SubLObject)((assertions_high.NIL != assertion_handles.assertion_handle_validP(assertion)) ? assertions_interface.kb_assertion_strength(assertion) : assertions_high.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 6959L)
    public static SubLObject assertion_variable_names(final SubLObject assertion) {
        enforceType(assertion, assertions_high.$sym33$ASSERTION_P);
        return (SubLObject)((assertions_high.NIL != assertion_handles.assertion_handle_validP(assertion)) ? assertions_interface.kb_assertion_variable_names(assertion) : assertions_high.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 7224L)
    public static SubLObject asserted_by(final SubLObject assertion) {
        enforceType(assertion, assertions_high.$sym33$ASSERTION_P);
        return (SubLObject)((assertions_high.NIL != assertion_handles.assertion_handle_validP(assertion)) ? assertions_interface.kb_assertion_asserted_by(assertion) : assertions_high.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 7472L)
    public static SubLObject asserted_when(final SubLObject assertion) {
        enforceType(assertion, assertions_high.$sym33$ASSERTION_P);
        return (SubLObject)((assertions_high.NIL != assertion_handles.assertion_handle_validP(assertion)) ? assertions_interface.kb_assertion_asserted_when(assertion) : assertions_high.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 7732L)
    public static SubLObject asserted_why(final SubLObject assertion) {
        assert assertions_high.NIL != assertion_handles.assertion_p(assertion) : assertion;
        return (SubLObject)((assertions_high.NIL != assertion_handles.assertion_handle_validP(assertion)) ? assertions_interface.kb_assertion_asserted_why(assertion) : assertions_high.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 7954L)
    public static SubLObject asserted_second(final SubLObject assertion) {
        assert assertions_high.NIL != assertion_handles.assertion_p(assertion) : assertion;
        return (SubLObject)((assertions_high.NIL != assertion_handles.assertion_handle_validP(assertion)) ? assertions_interface.kb_assertion_asserted_second(assertion) : assertions_high.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 8194L)
    public static SubLObject assertion_arguments(final SubLObject assertion) {
        assert assertions_high.NIL != assertion_handles.assertion_p(assertion) : assertion;
        return (SubLObject)((assertions_high.NIL != assertion_handles.assertion_handle_validP(assertion)) ? assertions_interface.kb_assertion_arguments(assertion) : assertions_high.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 8419L)
    public static SubLObject assertion_dependents(final SubLObject assertion) {
        assert assertions_high.NIL != assertion_handles.assertion_p(assertion) : assertion;
        return (SubLObject)((assertions_high.NIL != assertion_handles.assertion_handle_validP(assertion)) ? assertions_interface.kb_assertion_dependents(assertion) : assertions_high.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 8656L)
    public static SubLObject assertion_dependent_list(final SubLObject assertion) {
        assert assertions_high.NIL != assertion_handles.assertion_p(assertion) : assertion;
        return (SubLObject)((assertions_high.NIL != assertion_handles.assertion_handle_validP(assertion)) ? set_contents.set_contents_element_list(assertions_interface.kb_assertion_dependents(assertion)) : assertions_high.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 8915L)
    public static SubLObject cyc_assertion_tv(final SubLObject assertion) {
        final SubLObject truth = assertion_truth(assertion);
        final SubLObject strength = assertion_strength(assertion);
        return enumeration_types.tv_from_truth_strength(truth, strength);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 9426L)
    public static SubLObject assertion_formula(final SubLObject assertion) {
        enforceType(assertion, assertions_high.$sym33$ASSERTION_P);
        if (assertions_high.NIL != gaf_assertionP(assertion)) {
            return gaf_el_formula(assertion);
        }
        final SubLObject cnf = assertion_cnf(assertion);
        if (assertions_high.NIL != clauses.cnf_p(cnf)) {
            return clauses.cnf_formula(cnf, assertion_truth(assertion));
        }
        return (SubLObject)assertions_high.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 9897L)
    public static SubLObject assertion_ist_formula(final SubLObject assertion) {
        enforceType(assertion, assertions_high.$sym33$ASSERTION_P);
        return (SubLObject)ConsesLow.list(assertions_high.$const62$ist, assertion_mt(assertion), assertion_formula(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 10149L)
    public static SubLObject assertion_ist_sentence(final SubLObject assertion) {
        return assertion_ist_formula(assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 10243L)
    public static SubLObject assertion_to_hl_assertion_spec(final SubLObject assertion) {
        final SubLObject cnf = assertion_cnf(assertion);
        final SubLObject mt = assertion_mt(assertion);
        final SubLObject direction = assertion_direction(assertion);
        final SubLObject variable_map = assertion_variable_names(assertion);
        return hl_storage_modules.new_hl_assertion_spec(cnf, mt, direction, variable_map);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 10635L)
    public static SubLObject assertion_to_hl_assertibles(final SubLObject assertion) {
        SubLObject assertibles = (SubLObject)assertions_high.NIL;
        final SubLObject hl_assertion_spec = assertion_to_hl_assertion_spec(assertion);
        SubLObject cdolist_list_var;
        final SubLObject v_arguments = cdolist_list_var = assertion_arguments(assertion);
        SubLObject argument = (SubLObject)assertions_high.NIL;
        argument = cdolist_list_var.first();
        while (assertions_high.NIL != cdolist_list_var) {
            final SubLObject argument_spec = arguments.argument_to_argument_spec(argument);
            final SubLObject assertible = hl_storage_modules.new_hl_assertible(hl_assertion_spec, argument_spec);
            assertibles = (SubLObject)ConsesLow.cons(assertible, assertibles);
            cdolist_list_var = cdolist_list_var.rest();
            argument = cdolist_list_var.first();
        }
        return assertibles;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 11170L)
    public static SubLObject assertion_mentions_termP(final SubLObject assertion, final SubLObject v_term) {
        enforceType(assertion, assertions_high.$sym33$ASSERTION_P);
        enforceType(v_term, assertions_high.$sym65$HL_TERM_P);
        final SubLObject cons = assertion_cons(assertion);
        if (assertions_high.NIL != list_utilities.tree_find(v_term, cons, Symbols.symbol_function((SubLObject)assertions_high.EQUAL), (SubLObject)assertions_high.UNPROVIDED)) {
            return (SubLObject)assertions_high.T;
        }
        final SubLObject mt = assertion_mt(assertion);
        if (assertions_high.NIL != list_utilities.tree_find(v_term, mt, Symbols.symbol_function((SubLObject)assertions_high.EQUAL), (SubLObject)assertions_high.UNPROVIDED)) {
            return (SubLObject)assertions_high.T;
        }
        if (assertions_high.NIL != list_utilities.tree_find_if(Symbols.symbol_function((SubLObject)assertions_high.$sym33$ASSERTION_P), cons, (SubLObject)assertions_high.UNPROVIDED)) {
            SubLObject cdolist_list_var;
            final SubLObject sub_assertions = cdolist_list_var = list_utilities.tree_gather(cons, Symbols.symbol_function((SubLObject)assertions_high.$sym33$ASSERTION_P), (SubLObject)assertions_high.UNPROVIDED, (SubLObject)assertions_high.UNPROVIDED, (SubLObject)assertions_high.UNPROVIDED);
            SubLObject sub_assertion = (SubLObject)assertions_high.NIL;
            sub_assertion = cdolist_list_var.first();
            while (assertions_high.NIL != cdolist_list_var) {
                if (assertions_high.NIL != assertion_mentions_termP(sub_assertion, v_term)) {
                    return (SubLObject)assertions_high.T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                sub_assertion = cdolist_list_var.first();
            }
            return (SubLObject)assertions_high.NIL;
        }
        return (SubLObject)assertions_high.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 12044L)
    public static SubLObject assertion_mentions_term(final SubLObject assertion, final SubLObject v_term) {
        enforceType(assertion, assertions_high.$sym33$ASSERTION_P);
        enforceType(v_term, assertions_high.$sym65$HL_TERM_P);
        return assertion_mentions_termP(assertion, v_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 12289L)
    public static SubLObject assertion_cnf_or_gaf_hl_formula(final SubLObject assertion) {
        return (assertions_high.NIL != gaf_assertionP(assertion)) ? assertion_gaf_hl_formula(assertion) : assertion_cnf(assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 12579L)
    public static SubLObject backward_ruleP(final SubLObject assertion) {
        return (SubLObject)SubLObjectFactory.makeBoolean(assertions_high.NIL != rule_assertionP(assertion) && assertions_high.NIL != backward_assertionP(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 12729L)
    public static SubLObject forward_ruleP(final SubLObject assertion) {
        return (SubLObject)SubLObjectFactory.makeBoolean(assertions_high.NIL != rule_assertionP(assertion) && assertions_high.NIL != forward_assertionP(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 12852L)
    public static SubLObject single_literal_ruleP(final SubLObject assertion) {
        if (assertions_high.NIL != rule_assertionP(assertion)) {
            final SubLObject cnf = assertion_cnf(assertion);
            final SubLObject pos_lit_count = Sequences.length(clauses.pos_lits(cnf));
            final SubLObject neg_lit_count = Sequences.length(clauses.neg_lits(cnf));
            return Numbers.numE((SubLObject)assertions_high.ONE_INTEGER, Numbers.add(pos_lit_count, neg_lit_count));
        }
        return (SubLObject)assertions_high.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 13175L)
    public static SubLObject single_literal_antecedent_ruleP(final SubLObject assertion) {
        if (assertions_high.NIL != rule_assertionP(assertion)) {
            final SubLObject cnf = assertion_cnf(assertion);
            final SubLObject pos_lit_count = Sequences.length(clauses.pos_lits(cnf));
            final SubLObject neg_lit_count = Sequences.length(clauses.neg_lits(cnf));
            return (SubLObject)SubLObjectFactory.makeBoolean(assertions_high.ONE_INTEGER.numE(pos_lit_count) && assertions_high.ONE_INTEGER.numE(neg_lit_count));
        }
        return (SubLObject)assertions_high.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 13550L)
    public static SubLObject two_literal_antecedent_ruleP(final SubLObject assertion) {
        if (assertions_high.NIL != rule_assertionP(assertion)) {
            final SubLObject cnf = assertion_cnf(assertion);
            final SubLObject pos_lit_count = Sequences.length(clauses.pos_lits(cnf));
            final SubLObject neg_lit_count = Sequences.length(clauses.neg_lits(cnf));
            return (SubLObject)SubLObjectFactory.makeBoolean(assertions_high.ONE_INTEGER.numE(pos_lit_count) && assertions_high.TWO_INTEGER.numE(neg_lit_count));
        }
        return (SubLObject)assertions_high.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 13923L)
    public static SubLObject forward_tms_ruleP(final SubLObject rule) {
        if (assertions_high.NIL != forward_ruleP(rule)) {
            final SubLObject cnf = assertion_cnf(rule);
            final SubLObject pos_lits = clauses.pos_lits(cnf);
            SubLObject witness = (SubLObject)assertions_high.NIL;
            if (assertions_high.NIL == witness) {
                SubLObject csome_list_var = pos_lits;
                SubLObject pos_lit = (SubLObject)assertions_high.NIL;
                pos_lit = csome_list_var.first();
                while (assertions_high.NIL == witness && assertions_high.NIL != csome_list_var) {
                    final SubLObject operator = cycl_utilities.el_formula_operator(pos_lit);
                    if (assertions_high.NIL != cycl_tms_predicateP(operator) || (assertions_high.NIL != kb_utilities.kbeq(operator, assertions_high.$const73$performSubL) && assertions_high.NIL != list_utilities.tree_find_if((SubLObject)assertions_high.$sym74$KB_TMS_METHOD_, pos_lit, (SubLObject)assertions_high.UNPROVIDED))) {
                        witness = pos_lit;
                    }
                    csome_list_var = csome_list_var.rest();
                    pos_lit = csome_list_var.first();
                }
            }
            return list_utilities.sublisp_boolean(witness);
        }
        return (SubLObject)assertions_high.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 14464L)
    public static SubLObject cycl_tms_predicateP(final SubLObject operator) {
        return list_utilities.member_kbeqP(operator, (SubLObject)assertions_high.$list75);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 14698L)
    public static SubLObject kb_tms_methodP(final SubLObject method) {
        return (SubLObject)SubLObjectFactory.makeBoolean(assertions_high.NIL != subl_promotions.function_symbol_p(method) && assertions_high.NIL != list_utilities.member_eqP(method, (SubLObject)assertions_high.$list76));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 14959L)
    public static SubLObject backward_gafP(final SubLObject assertion) {
        return (SubLObject)SubLObjectFactory.makeBoolean(assertions_high.NIL != gaf_assertionP(assertion) && assertions_high.NIL != backward_assertionP(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 15083L)
    public static SubLObject forward_gafP(final SubLObject assertion) {
        return (SubLObject)SubLObjectFactory.makeBoolean(assertions_high.NIL != gaf_assertionP(assertion) && assertions_high.NIL != forward_assertionP(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 15204L)
    public static SubLObject assertion_type(final SubLObject assertion) {
        assert assertions_high.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (assertions_high.NIL != gaf_assertionP(assertion)) {
            return (SubLObject)assertions_high.$kw77$GAF;
        }
        if (assertions_high.NIL != rule_assertionP(assertion)) {
            return (SubLObject)assertions_high.$kw78$RULE;
        }
        Errors.warn((SubLObject)assertions_high.$str79$Could_not_determine_assertion_typ, assertion);
        return (SubLObject)assertions_high.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 15549L)
    public static SubLObject assertion_has_mtP(final SubLObject assertion, final SubLObject mt) {
        return hlmt.hlmt_equal(mt, assertion_mt(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 15683L)
    public static SubLObject assertion_has_typeP(final SubLObject assertion, final SubLObject type) {
        assert assertions_high.NIL != assertion_handles.assertion_p(assertion) : assertion;
        assert assertions_high.NIL != enumeration_types.assertion_type_p(type) : type;
        return Equality.eq(type, assertion_type(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 15907L)
    public static SubLObject assertion_has_type(final SubLObject assertion, final SubLObject type) {
        return assertion_has_typeP(assertion, type);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 16045L)
    public static SubLObject ground_assertionP(final SubLObject assertion) {
        return (SubLObject)SubLObjectFactory.makeBoolean(assertions_high.NIL != assertion_handles.assertion_p(assertion) && (assertions_high.NIL != gaf_assertionP(assertion) || assertions_high.NIL != clauses.ground_clause_p(assertion_cnf(assertion))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 16285L)
    public static SubLObject atomic_assertionP(final SubLObject assertion) {
        return (SubLObject)SubLObjectFactory.makeBoolean(assertions_high.NIL != assertion_handles.assertion_p(assertion) && (assertions_high.NIL != gaf_assertionP(assertion) || assertions_high.NIL != clauses.atomic_clause_p(assertion_cnf(assertion))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 16528L)
    public static SubLObject meta_assertionP(final SubLObject assertion) {
        return (SubLObject)SubLObjectFactory.makeBoolean(assertions_high.NIL != assertion_handles.assertion_p(assertion) && assertions_high.NIL != list_utilities.tree_find_if(Symbols.symbol_function((SubLObject)assertions_high.$sym33$ASSERTION_P), assertion_cons(assertion), (SubLObject)assertions_high.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 16732L)
    public static SubLObject lifting_assertion_p(final SubLObject assertion) {
        return (SubLObject)SubLObjectFactory.makeBoolean(assertions_high.NIL != rule_assertionP(assertion) && assertions_high.NIL != clauses.lifting_clause_p(assertion_cnf(assertion)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 16971L)
    public static SubLObject assertion_forts(final SubLObject assertion, SubLObject penetrate_hl_structuresP, SubLObject subs_tooP, SubLObject include_mtP, SubLObject delete_duplicatesP) {
        if (penetrate_hl_structuresP == assertions_high.UNPROVIDED) {
            penetrate_hl_structuresP = (SubLObject)assertions_high.T;
        }
        if (subs_tooP == assertions_high.UNPROVIDED) {
            subs_tooP = (SubLObject)assertions_high.T;
        }
        if (include_mtP == assertions_high.UNPROVIDED) {
            include_mtP = (SubLObject)assertions_high.T;
        }
        if (delete_duplicatesP == assertions_high.UNPROVIDED) {
            delete_duplicatesP = (SubLObject)assertions_high.T;
        }
        assert assertions_high.NIL != assertion_handles.assertion_p(assertion) : assertion;
        SubLObject result = cycl_utilities.formula_forts(assertion_cnf_or_gaf_hl_formula(assertion), penetrate_hl_structuresP, subs_tooP, delete_duplicatesP);
        if (assertions_high.NIL != include_mtP) {
            final SubLObject mt_forts = cycl_utilities.expression_forts(assertion_mt(assertion), penetrate_hl_structuresP, subs_tooP, (SubLObject)assertions_high.UNPROVIDED);
            result = ConsesLow.append(result, mt_forts);
            if (assertions_high.NIL != delete_duplicatesP) {
                result = list_utilities.fast_delete_duplicates(result, Symbols.symbol_function((SubLObject)assertions_high.EQL), (SubLObject)assertions_high.UNPROVIDED, (SubLObject)assertions_high.UNPROVIDED, (SubLObject)assertions_high.UNPROVIDED, (SubLObject)assertions_high.UNPROVIDED);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 17929L)
    public static SubLObject assertion_constants(final SubLObject assertion) {
        assert assertions_high.NIL != assertion_handles.assertion_p(assertion) : assertion;
        return cycl_utilities.formula_constants((SubLObject)ConsesLow.list(assertion_cnf_or_gaf_hl_formula(assertion), assertion_mt(assertion)), (SubLObject)assertions_high.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 18328L)
    public static SubLObject gaf_formula(final SubLObject assertion) {
        return gaf_hl_formula(assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 18701L)
    public static SubLObject gaf_hl_formula(final SubLObject assertion) {
        assert assertions_high.NIL != gaf_assertionP(assertion) : assertion;
        return assertion_gaf_hl_formula(assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 18949L)
    public static SubLObject gaf_el_formula(final SubLObject assertion) {
        assert assertions_high.NIL != gaf_assertionP(assertion) : assertion;
        return assertion_gaf_el_formula(assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 19268L)
    public static SubLObject assertion_gaf_el_formula(final SubLObject assertion) {
        final SubLObject formula = assertion_gaf_hl_formula(assertion);
        return (assertions_high.NIL != formula && assertions_high.$kw38$FALSE == assertion_truth(assertion)) ? cycl_utilities.negate(formula) : formula;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 19628L)
    public static SubLObject gaf_args(final SubLObject assertion) {
        return cycl_utilities.formula_args(gaf_formula(assertion), (SubLObject)assertions_high.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 19751L)
    public static SubLObject gaf_arg(final SubLObject assertion, final SubLObject n) {
        return ConsesLow.nth(n, gaf_formula(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 19922L)
    public static SubLObject gaf_predicate(final SubLObject assertion) {
        enforceType(assertion, assertions_high.$sym33$ASSERTION_P);
        return cycl_utilities.formula_arg0(gaf_hl_formula(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 20101L)
    public static SubLObject gaf_arg0(final SubLObject assertion) {
        enforceType(assertion, assertions_high.$sym33$ASSERTION_P);
        return cycl_utilities.formula_arg0(gaf_hl_formula(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 20287L)
    public static SubLObject gaf_arg1(final SubLObject assertion) {
        enforceType(assertion, assertions_high.$sym33$ASSERTION_P);
        return gaf_arg(assertion, (SubLObject)assertions_high.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 20437L)
    public static SubLObject gaf_arg2(final SubLObject assertion) {
        enforceType(assertion, assertions_high.$sym33$ASSERTION_P);
        return gaf_arg(assertion, (SubLObject)assertions_high.TWO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 20587L)
    public static SubLObject gaf_arg3(final SubLObject assertion) {
        enforceType(assertion, assertions_high.$sym33$ASSERTION_P);
        return gaf_arg(assertion, (SubLObject)assertions_high.THREE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 20737L)
    public static SubLObject gaf_arg4(final SubLObject assertion) {
        enforceType(assertion, assertions_high.$sym33$ASSERTION_P);
        return gaf_arg(assertion, (SubLObject)assertions_high.FOUR_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 20887L)
    public static SubLObject gaf_arg5(final SubLObject assertion) {
        enforceType(assertion, assertions_high.$sym33$ASSERTION_P);
        return gaf_arg(assertion, (SubLObject)assertions_high.FIVE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 21037L)
    public static SubLObject assertion_has_directionP(final SubLObject assertion, final SubLObject direction) {
        assert assertions_high.NIL != assertion_handles.assertion_p(assertion) : assertion;
        assert assertions_high.NIL != enumeration_types.direction_p(direction) : direction;
        return Equality.eq(direction, assertion_direction(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 21329L)
    public static SubLObject assertion_has_direction(final SubLObject assertion, final SubLObject direction) {
        return assertion_has_directionP(assertion, direction);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 21492L)
    public static SubLObject forward_assertionP(final SubLObject assertion) {
        return (SubLObject)SubLObjectFactory.makeBoolean(assertions_high.NIL != assertion_handles.assertion_p(assertion) && assertions_high.$kw101$FORWARD == assertion_direction(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 21720L)
    public static SubLObject backward_assertionP(final SubLObject assertion) {
        return (SubLObject)SubLObjectFactory.makeBoolean(assertions_high.NIL != assertion_handles.assertion_p(assertion) && assertions_high.$kw104$BACKWARD == assertion_direction(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 21951L)
    public static SubLObject code_assertionP(final SubLObject assertion) {
        return (SubLObject)SubLObjectFactory.makeBoolean(assertions_high.NIL != assertion_handles.assertion_p(assertion) && assertions_high.$kw107$CODE == assertion_direction(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 22170L)
    public static SubLObject assertion_has_truthP(final SubLObject assertion, final SubLObject truth) {
        enforceType(assertion, assertions_high.$sym33$ASSERTION_P);
        enforceType(truth, assertions_high.$sym110$TRUTH_P);
        return Equality.eq(assertion_truth(assertion), truth);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 22447L)
    public static SubLObject assertion_has_truth(final SubLObject assertion, final SubLObject truth) {
        enforceType(assertion, assertions_high.$sym33$ASSERTION_P);
        enforceType(truth, assertions_high.$sym110$TRUTH_P);
        return assertion_has_truthP(assertion, truth);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 22681L)
    public static SubLObject assertion_date(final SubLObject assertion) {
        assert assertions_high.NIL != assertion_handles.assertion_p(assertion) : assertion;
        final SubLObject day = asserted_when(assertion);
        final SubLObject second = asserted_second(assertion);
        if (assertions_high.NIL == day) {
            return (SubLObject)assertions_high.NIL;
        }
        if (assertions_high.NIL == second) {
            return date_utilities.universal_date_to_cycl_date(day);
        }
        return date_utilities.extended_universal_date_to_cycl_date(Numbers.add(Numbers.multiply(day, (SubLObject)assertions_high.$int117$1000000), second));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 22681L)
    public static SubLObject assertion_asserted_dateP(final SubLObject assertion, final SubLObject cycl_date) {
        assert assertions_high.NIL != assertion_handles.assertion_p(assertion) : assertion;
        assert assertions_high.NIL != date_utilities.generalized_date_p(cycl_date) : cycl_date;
        final SubLObject ass_date = assertion_date(assertion);
        return (SubLObject)((assertions_high.NIL != ass_date) ? time_interval_utilities.date_interval_subsumesP(cycl_date, ass_date) : assertions_high.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 22681L)
    public static SubLObject new_assertion_asserted_date_iterator(final SubLObject cycl_date) {
        assert assertions_high.NIL != date_utilities.generalized_date_p(cycl_date) : cycl_date;
        final SubLObject input_iterator = assertion_handles.new_assertions_iterator();
        final SubLObject filter_args = (SubLObject)ConsesLow.list(cycl_date);
        return iteration.new_filter_iterator(input_iterator, (SubLObject)assertions_high.$sym119$ASSERTION_ASSERTED_DATE_, filter_args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 22681L)
    public static SubLObject all_assertions_asserted_date(final SubLObject cycl_date) {
        assert assertions_high.NIL != date_utilities.generalized_date_p(cycl_date) : cycl_date;
        SubLObject assertions = (SubLObject)assertions_high.NIL;
        final SubLObject iterator_var = new_assertion_asserted_date_iterator(cycl_date);
        SubLObject done_var = (SubLObject)assertions_high.NIL;
        final SubLObject token_var = (SubLObject)assertions_high.NIL;
        while (assertions_high.NIL == done_var) {
            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(assertion));
            if (assertions_high.NIL != valid) {
                assertions = (SubLObject)ConsesLow.cons(assertion, assertions);
            }
            done_var = (SubLObject)SubLObjectFactory.makeBoolean(assertions_high.NIL == valid);
        }
        return Sequences.nreverse(assertions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 24855L)
    public static SubLObject assertion_el_variables(final SubLObject assertion) {
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)assertions_high.$sym120$INTERN_EL_VAR), assertion_variable_names(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 25051L)
    public static SubLObject assertion_hl_variables(final SubLObject assertion) {
        assert assertions_high.NIL != assertion_handles.assertion_p(assertion) : assertion;
        return (SubLObject)((assertions_high.NIL != gaf_assertionP(assertion)) ? assertions_high.NIL : variables.gather_hl_variables(assertion_cnf(assertion)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 25287L)
    public static SubLObject assertion_free_hl_variables(final SubLObject assertion) {
        assert assertions_high.NIL != assertion_handles.assertion_p(assertion) : assertion;
        return backward_utilities.inference_clause_free_variables(assertion_cnf(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 25580L)
    public static SubLObject assertion_el_variable_to_hl(final SubLObject assertion, final SubLObject el_variable) {
        assert assertions_high.NIL != assertion_handles.assertion_p(assertion) : assertion;
        assert assertions_high.NIL != cycl_grammar.el_variable_p(el_variable) : el_variable;
        final SubLObject variable_names = assertion_variable_names(assertion);
        final SubLObject el_variable_name = cycl_variables.el_var_name(el_variable);
        final SubLObject hl_variable_id = Sequences.position(el_variable_name, variable_names, Symbols.symbol_function((SubLObject)assertions_high.EQUAL), (SubLObject)assertions_high.UNPROVIDED, (SubLObject)assertions_high.UNPROVIDED, (SubLObject)assertions_high.UNPROVIDED);
        if (assertions_high.NIL != hl_variable_id) {
            return variables.find_variable_by_id(hl_variable_id);
        }
        return (SubLObject)assertions_high.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 26071L)
    public static SubLObject assertion_hl_variable_to_el(final SubLObject assertion, final SubLObject variable) {
        assert assertions_high.NIL != assertion_handles.assertion_p(assertion) : assertion;
        assert assertions_high.NIL != variables.variable_p(variable) : variable;
        final SubLObject variable_names = assertion_variable_names(assertion);
        final SubLObject hl_variable_id = variables.variable_id(variable);
        final SubLObject el_variable_name = ConsesLow.nth(hl_variable_id, variable_names);
        if (el_variable_name.isString()) {
            return cycl_variables.make_el_var(el_variable_name);
        }
        return (SubLObject)assertions_high.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 26541L)
    public static SubLObject assertion_hl_to_el_variable_map(final SubLObject assertion) {
        assert assertions_high.NIL != assertion_handles.assertion_p(assertion) : assertion;
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)assertions_high.$sym123$MAKE_VARIABLE_BINDING), assertion_hl_variables(assertion), new SubLObject[] { assertion_el_variables(assertion) });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 26842L)
    public static SubLObject timestamp_asserted_assertion(final SubLObject assertion, SubLObject who, SubLObject when, SubLObject why, SubLObject second) {
        if (who == assertions_high.UNPROVIDED) {
            who = (SubLObject)assertions_high.NIL;
        }
        if (when == assertions_high.UNPROVIDED) {
            when = (SubLObject)assertions_high.NIL;
        }
        if (why == assertions_high.UNPROVIDED) {
            why = (SubLObject)assertions_high.NIL;
        }
        if (second == assertions_high.UNPROVIDED) {
            second = (SubLObject)assertions_high.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (assertions_high.NIL != kb_control_vars.$recording_hl_transcript_operationsP$.getDynamicValue(thread)) {
            kb_control_vars.record_hl_transcript_operation((SubLObject)ConsesLow.list((SubLObject)assertions_high.$sym124$TL_TIMESTAMP_ASSERTED_ASSERTION, canon_tl.tl_quotify(assertion), list_utilities.quotify(who), list_utilities.quotify(when), list_utilities.quotify(why), list_utilities.quotify(second)));
        }
        return assertions_interface.kb_timestamp_asserted_assertion(assertion, who, when, why, second);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 27189L)
    public static SubLObject remove_asserted_assertion_timestamp(final SubLObject assertion) {
        assert assertions_high.NIL != assertion_handles.assertion_p(assertion) : assertion;
        final SubLObject result = assertions_low.asserted_assertion_timestampedP(assertion);
        timestamp_asserted_assertion(assertion, (SubLObject)assertions_high.NIL, (SubLObject)assertions_high.NIL, (SubLObject)assertions_high.NIL, (SubLObject)assertions_high.NIL);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 27642L)
    public static SubLObject tl_timestamp_asserted_assertion(final SubLObject tl_assertion, final SubLObject who, final SubLObject when, final SubLObject why, final SubLObject second) {
        return timestamp_asserted_assertion(tl_find_assertion(tl_assertion), canon_tl.transform_tl_terms_to_hl(who), canon_tl.transform_tl_terms_to_hl(when), canon_tl.transform_tl_terms_to_hl(why), canon_tl.transform_tl_terms_to_hl(second));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 27926L)
    public static SubLObject tl_cache_assertion(final SubLObject tl_assertion, final SubLObject hl_assertion) {
        assertions_high.$tl_assertion_lookaside_table$.setGlobalValue(list_utilities.alist_capacity_enter_without_values(assertions_high.$tl_assertion_lookaside_table$.getGlobalValue(), tl_assertion, hl_assertion, assertions_high.$tl_assertion_capacity$.getGlobalValue(), Symbols.symbol_function((SubLObject)assertions_high.EQUAL)));
        return tl_assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 28182L)
    public static SubLObject tl_find_assertion(final SubLObject tl_assertion) {
        SubLObject hl_assertion = list_utilities.alist_lookup_without_values(assertions_high.$tl_assertion_lookaside_table$.getGlobalValue(), tl_assertion, Symbols.symbol_function((SubLObject)assertions_high.EQUAL), (SubLObject)assertions_high.UNPROVIDED);
        if (assertions_high.NIL != hl_assertion) {
            assertions_high.$tl_assertion_lookaside_table$.setGlobalValue(list_utilities.alist_promote(assertions_high.$tl_assertion_lookaside_table$.getGlobalValue(), tl_assertion, Symbols.symbol_function((SubLObject)assertions_high.EQUAL)));
        }
        else {
            hl_assertion = canon_tl.tl_term_to_hl(tl_assertion);
            tl_cache_assertion(tl_assertion, hl_assertion);
        }
        return hl_assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 28623L)
    public static SubLObject invalid_assertionP(final SubLObject assertion, SubLObject robustP) {
        if (robustP == assertions_high.UNPROVIDED) {
            robustP = (SubLObject)assertions_high.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(assertions_high.NIL != assertion_handles.assertion_p(assertion) && assertions_high.NIL == assertion_handles.valid_assertionP(assertion, (SubLObject)assertions_high.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 28884L)
    public static SubLObject invalid_assertion_robustP(final SubLObject assertion) {
        final SubLObject invalidP = (SubLObject)SubLObjectFactory.makeBoolean(assertions_high.NIL != assertion_handles.assertion_p(assertion) && assertions_high.NIL == assertions_low.valid_assertion_robustP(assertion));
        if (assertions_high.NIL == invalidP) {
            SubLObject cdolist_list_var;
            final SubLObject narts = cdolist_list_var = cycl_utilities.expression_gather(assertion, Symbols.symbol_function((SubLObject)assertions_high.$sym126$NART_P), (SubLObject)assertions_high.T, (SubLObject)assertions_high.UNPROVIDED, (SubLObject)assertions_high.UNPROVIDED, (SubLObject)assertions_high.UNPROVIDED);
            SubLObject nart = (SubLObject)assertions_high.NIL;
            nart = cdolist_list_var.first();
            while (assertions_high.NIL != cdolist_list_var) {
                if (assertions_high.NIL != narts_high.invalid_nart_robustP(nart)) {
                    return (SubLObject)assertions_high.T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                nart = cdolist_list_var.first();
            }
        }
        return invalidP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 29268L)
    public static SubLObject valid_assertion(final SubLObject assertion, SubLObject robustP) {
        if (robustP == assertions_high.UNPROVIDED) {
            robustP = (SubLObject)assertions_high.NIL;
        }
        return assertion_handles.valid_assertionP(assertion, (SubLObject)assertions_high.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 29456L)
    public static SubLObject invalid_assertion(final SubLObject assertion, SubLObject robustP) {
        if (robustP == assertions_high.UNPROVIDED) {
            robustP = (SubLObject)assertions_high.NIL;
        }
        return invalid_assertionP(assertion, (SubLObject)assertions_high.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 29637L)
    public static SubLObject assertion_id_from_recipe(final SubLObject cnf, final SubLObject mt) {
        final SubLObject assertion = kb_indexing.find_assertion(cnf, mt);
        return (SubLObject)((assertions_high.NIL != assertion_handles.assertion_p(assertion)) ? assertion_handles.assertion_id(assertion) : assertions_high.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 29869L)
    public static SubLObject assertions_around_assertion(final SubLObject assertion, SubLObject total, SubLObject before, SubLObject after) {
        if (total == assertions_high.UNPROVIDED) {
            total = (SubLObject)assertions_high.$int131$100;
        }
        if (before == assertions_high.UNPROVIDED) {
            before = (SubLObject)assertions_high.ZERO_INTEGER;
        }
        if (after == assertions_high.UNPROVIDED) {
            after = Numbers.subtract(total, before);
        }
        assert assertions_high.NIL != assertion_handles.assertion_p(assertion) : assertion;
        return assertions_around(assertion_handles.assertion_id(assertion), total, before, after);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 30329L)
    public static SubLObject assertions_around(final SubLObject assertion_id, SubLObject total, SubLObject before, SubLObject after) {
        if (total == assertions_high.UNPROVIDED) {
            total = (SubLObject)assertions_high.$int131$100;
        }
        if (before == assertions_high.UNPROVIDED) {
            before = (SubLObject)assertions_high.ZERO_INTEGER;
        }
        if (after == assertions_high.UNPROVIDED) {
            after = Numbers.subtract(total, before);
        }
        assert assertions_high.NIL != subl_promotions.non_negative_integer_p(assertion_id) : assertion_id;
        return kb_objects_around_id((SubLObject)assertions_high.$sym133$FIND_ASSERTION_BY_ID, (SubLObject)assertions_high.ZERO_INTEGER, assertion_id, assertion_handles.next_assertion_id(), total, before, after);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 30840L)
    public static SubLObject kb_objects_around_id(final SubLObject lookup_method, final SubLObject min_id, SubLObject focal_id, final SubLObject high_limit, final SubLObject total, SubLObject before, SubLObject after) {
        SubLObject before_objects = (SubLObject)assertions_high.NIL;
        SubLObject after_objects = (SubLObject)assertions_high.NIL;
        SubLObject before_sofar = (SubLObject)assertions_high.ZERO_INTEGER;
        SubLObject after_sofar = (SubLObject)assertions_high.ZERO_INTEGER;
        focal_id = Numbers.max((SubLObject)assertions_high.ZERO_INTEGER, Numbers.min(focal_id, high_limit));
        before = Numbers.min(before, total);
        after = Numbers.min(after, total);
        SubLObject doneP = (SubLObject)SubLObjectFactory.makeBoolean(before_sofar.numGE(before) || focal_id.numLE(min_id));
        if (assertions_high.NIL == doneP) {
            SubLObject id;
            SubLObject v_object;
            for (id = (SubLObject)assertions_high.NIL, id = number_utilities.f_1_(focal_id); assertions_high.NIL == doneP; doneP = (SubLObject)SubLObjectFactory.makeBoolean(before_sofar.numGE(before) || id.numLE(min_id)), id = Numbers.add(id, (SubLObject)assertions_high.MINUS_ONE_INTEGER)) {
                v_object = Functions.funcall(lookup_method, id);
                if (assertions_high.NIL != v_object) {
                    before_objects = (SubLObject)ConsesLow.cons(v_object, before_objects);
                    before_sofar = Numbers.add(before_sofar, (SubLObject)assertions_high.ONE_INTEGER);
                }
            }
        }
        doneP = (SubLObject)SubLObjectFactory.makeBoolean(after_sofar.numGE(after) || focal_id.numGE(high_limit));
        if (assertions_high.NIL == doneP) {
            SubLObject id;
            SubLObject v_object;
            for (id = (SubLObject)assertions_high.NIL, id = focal_id; assertions_high.NIL == doneP; doneP = (SubLObject)SubLObjectFactory.makeBoolean(after_sofar.numGE(after) || id.numGE(high_limit)), id = number_utilities.f_1X(id)) {
                v_object = Functions.funcall(lookup_method, id);
                if (assertions_high.NIL != v_object) {
                    after_objects = (SubLObject)ConsesLow.cons(v_object, after_objects);
                    after_sofar = Numbers.add(after_sofar, (SubLObject)assertions_high.ONE_INTEGER);
                }
            }
        }
        return ConsesLow.nconc(before_objects, Sequences.nreverse(after_objects));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 31998L)
    public static SubLObject create_assertion(final SubLObject cnf, final SubLObject mt, SubLObject var_names, SubLObject direction, SubLObject truth, SubLObject strength, SubLObject asserted_argument) {
        if (var_names == assertions_high.UNPROVIDED) {
            var_names = (SubLObject)assertions_high.NIL;
        }
        if (direction == assertions_high.UNPROVIDED) {
            direction = (SubLObject)assertions_high.$kw104$BACKWARD;
        }
        if (truth == assertions_high.UNPROVIDED) {
            truth = (SubLObject)assertions_high.$kw134$TRUE;
        }
        if (strength == assertions_high.UNPROVIDED) {
            strength = (SubLObject)assertions_high.$kw135$DEFAULT;
        }
        if (asserted_argument == assertions_high.UNPROVIDED) {
            asserted_argument = (SubLObject)assertions_high.NIL;
        }
        assert assertions_high.NIL != clauses.cnf_p(cnf) : cnf;
        assert assertions_high.NIL != hlmt.hlmt_p(mt) : mt;
        assert assertions_high.NIL != enumeration_types.direction_p(direction) : direction;
        return create_assertion_int(cnf, mt, var_names, direction, truth, strength, asserted_argument);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 32592L)
    public static SubLObject create_gaf(final SubLObject gaf, final SubLObject mt, SubLObject direction, SubLObject truth, SubLObject strength, SubLObject asserted_argument) {
        if (direction == assertions_high.UNPROVIDED) {
            direction = (SubLObject)assertions_high.$kw101$FORWARD;
        }
        if (truth == assertions_high.UNPROVIDED) {
            truth = (SubLObject)assertions_high.$kw134$TRUE;
        }
        if (strength == assertions_high.UNPROVIDED) {
            strength = (SubLObject)assertions_high.$kw135$DEFAULT;
        }
        if (asserted_argument == assertions_high.UNPROVIDED) {
            asserted_argument = (SubLObject)assertions_high.NIL;
        }
        assert assertions_high.NIL != el_utilities.el_formula_p(gaf) : gaf;
        assert assertions_high.NIL != hlmt.hlmt_p(mt) : mt;
        assert assertions_high.NIL != enumeration_types.direction_p(direction) : direction;
        return create_assertion_int(clause_utilities.make_gaf_cnf(gaf), mt, (SubLObject)assertions_high.NIL, direction, truth, strength, asserted_argument);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 32986L)
    public static SubLObject find_or_create_assertion(final SubLObject cnf, final SubLObject mt, SubLObject var_names, SubLObject direction, SubLObject truth, SubLObject strength, SubLObject asserted_argument) {
        if (var_names == assertions_high.UNPROVIDED) {
            var_names = (SubLObject)assertions_high.NIL;
        }
        if (direction == assertions_high.UNPROVIDED) {
            direction = (SubLObject)assertions_high.$kw104$BACKWARD;
        }
        if (truth == assertions_high.UNPROVIDED) {
            truth = (SubLObject)assertions_high.$kw134$TRUE;
        }
        if (strength == assertions_high.UNPROVIDED) {
            strength = (SubLObject)assertions_high.$kw135$DEFAULT;
        }
        if (asserted_argument == assertions_high.UNPROVIDED) {
            asserted_argument = (SubLObject)assertions_high.NIL;
        }
        assert assertions_high.NIL != clauses.cnf_p(cnf) : cnf;
        assert assertions_high.NIL != hlmt.hlmt_p(mt) : mt;
        assert assertions_high.NIL != enumeration_types.direction_p(direction) : direction;
        SubLObject new_assertionP = (SubLObject)assertions_high.NIL;
        SubLObject assertion = kb_indexing.find_assertion(cnf, mt);
        if (assertions_high.NIL == assertion) {
            assertion = create_assertion(cnf, mt, var_names, direction, truth, strength, asserted_argument);
            new_assertionP = (SubLObject)assertions_high.T;
        }
        return Values.values(assertion, new_assertionP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 33568L)
    public static SubLObject find_or_create_gaf(final SubLObject gaf, final SubLObject mt, SubLObject direction, SubLObject truth, SubLObject strength, SubLObject asserted_argument) {
        if (direction == assertions_high.UNPROVIDED) {
            direction = (SubLObject)assertions_high.$kw101$FORWARD;
        }
        if (truth == assertions_high.UNPROVIDED) {
            truth = (SubLObject)assertions_high.$kw134$TRUE;
        }
        if (strength == assertions_high.UNPROVIDED) {
            strength = (SubLObject)assertions_high.$kw135$DEFAULT;
        }
        if (asserted_argument == assertions_high.UNPROVIDED) {
            asserted_argument = (SubLObject)assertions_high.NIL;
        }
        assert assertions_high.NIL != hlmt.hlmt_p(mt) : mt;
        assert assertions_high.NIL != enumeration_types.direction_p(direction) : direction;
        final SubLObject assertion = kb_indexing.find_gaf(gaf, mt);
        return (assertions_high.NIL != assertion) ? assertion : create_gaf(gaf, mt, direction, truth, strength, asserted_argument);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 33988L)
    public static SubLObject create_assertion_int(final SubLObject cnf, final SubLObject mt, SubLObject var_names, SubLObject direction, SubLObject truth, SubLObject strength, SubLObject asserted_argument) {
        if (var_names == assertions_high.UNPROVIDED) {
            var_names = (SubLObject)assertions_high.NIL;
        }
        if (direction == assertions_high.UNPROVIDED) {
            direction = (SubLObject)((assertions_high.NIL != clauses.gaf_cnfP(cnf)) ? assertions_high.$kw101$FORWARD : assertions_high.$kw104$BACKWARD);
        }
        if (truth == assertions_high.UNPROVIDED) {
            truth = (SubLObject)assertions_high.$kw134$TRUE;
        }
        if (strength == assertions_high.UNPROVIDED) {
            strength = (SubLObject)assertions_high.$kw135$DEFAULT;
        }
        if (asserted_argument == assertions_high.UNPROVIDED) {
            asserted_argument = (SubLObject)assertions_high.NIL;
        }
        return assertions_interface.kb_create_assertion(cnf, mt, var_names, direction, truth, strength, asserted_argument);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 34451L)
    public static SubLObject remove_assertion(final SubLObject assertion) {
        return assertions_interface.kb_remove_assertion(assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 34632L)
    public static SubLObject remove_broken_assertions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject grand_total = (SubLObject)assertions_high.ZERO_INTEGER;
        SubLObject passes = (SubLObject)assertions_high.ZERO_INTEGER;
        SubLObject total;
        for (SubLObject doneP = (SubLObject)assertions_high.NIL; assertions_high.NIL == doneP; doneP = Numbers.zerop(total)) {
            passes = Numbers.add(passes, (SubLObject)assertions_high.ONE_INTEGER);
            final SubLObject message = PrintLow.format((SubLObject)assertions_high.NIL, (SubLObject)assertions_high.$str139$Removing_broken_assertions__pass_, passes);
            total = (SubLObject)assertions_high.ZERO_INTEGER;
            final SubLObject idx = assertion_handles.do_assertions_table();
            final SubLObject mess = message;
            final SubLObject total_$5 = id_index.id_index_count(idx);
            SubLObject sofar = (SubLObject)assertions_high.ZERO_INTEGER;
            assert assertions_high.NIL != Types.stringp(mess) : mess;
            final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)assertions_high.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)assertions_high.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)assertions_high.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(mess);
                    final SubLObject idx_$6 = idx;
                    if (assertions_high.NIL == id_index.id_index_objects_empty_p(idx_$6, (SubLObject)assertions_high.$kw141$SKIP)) {
                        final SubLObject idx_$7 = idx_$6;
                        if (assertions_high.NIL == id_index.id_index_dense_objects_empty_p(idx_$7, (SubLObject)assertions_high.$kw141$SKIP)) {
                            final SubLObject vector_var = id_index.id_index_dense_objects(idx_$7);
                            final SubLObject backwardP_var = (SubLObject)assertions_high.NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject a_id;
                            SubLObject a_handle;
                            SubLObject ass;
                            SubLObject id;
                            SubLObject reason;
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)assertions_high.NIL, v_iteration = (SubLObject)assertions_high.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)assertions_high.ONE_INTEGER)) {
                                a_id = ((assertions_high.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)assertions_high.ONE_INTEGER) : v_iteration);
                                a_handle = Vectors.aref(vector_var, a_id);
                                if (assertions_high.NIL == id_index.id_index_tombstone_p(a_handle) || assertions_high.NIL == id_index.id_index_skip_tombstones_p((SubLObject)assertions_high.$kw141$SKIP)) {
                                    if (assertions_high.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                        a_handle = (SubLObject)assertions_high.$kw141$SKIP;
                                    }
                                    ass = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                    id = assertion_handles.assertion_id(ass);
                                    reason = possibly_remove_broken_assertion(ass);
                                    if (assertions_high.$kw142$OK != reason) {
                                        PrintLow.format((SubLObject)assertions_high.T, (SubLObject)assertions_high.$str143$_______removed_assertion___A__rea, id, reason);
                                        total = Numbers.add(total, (SubLObject)assertions_high.ONE_INTEGER);
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)assertions_high.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total_$5);
                                }
                            }
                        }
                        final SubLObject idx_$8 = idx_$6;
                        if (assertions_high.NIL == id_index.id_index_sparse_objects_empty_p(idx_$8) || assertions_high.NIL == id_index.id_index_skip_tombstones_p((SubLObject)assertions_high.$kw141$SKIP)) {
                            final SubLObject sparse = id_index.id_index_sparse_objects(idx_$8);
                            SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$8);
                            final SubLObject end_id = id_index.id_index_next_id(idx_$8);
                            final SubLObject v_default = (SubLObject)((assertions_high.NIL != id_index.id_index_skip_tombstones_p((SubLObject)assertions_high.$kw141$SKIP)) ? assertions_high.NIL : assertions_high.$kw141$SKIP);
                            while (a_id2.numL(end_id)) {
                                final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                                if (assertions_high.NIL == id_index.id_index_skip_tombstones_p((SubLObject)assertions_high.$kw141$SKIP) || assertions_high.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                    final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                    final SubLObject id2 = assertion_handles.assertion_id(ass2);
                                    final SubLObject reason2 = possibly_remove_broken_assertion(ass2);
                                    if (assertions_high.$kw142$OK != reason2) {
                                        PrintLow.format((SubLObject)assertions_high.T, (SubLObject)assertions_high.$str143$_______removed_assertion___A__rea, id2, reason2);
                                        total = Numbers.add(total, (SubLObject)assertions_high.ONE_INTEGER);
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)assertions_high.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total_$5);
                                }
                                a_id2 = Numbers.add(a_id2, (SubLObject)assertions_high.ONE_INTEGER);
                            }
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)assertions_high.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
            grand_total = Numbers.add(grand_total, total);
        }
        return Values.values(grand_total, passes);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 35352L)
    public static SubLObject possibly_remove_broken_assertion(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert assertions_high.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (assertions_high.NIL != assertion_handles.valid_assertionP(assertion, (SubLObject)assertions_high.UNPROVIDED)) {
            SubLObject brokenP = (SubLObject)assertions_high.NIL;
            SubLObject msg = (SubLObject)assertions_high.NIL;
            SubLObject reason = (SubLObject)assertions_high.$kw142$OK;
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)assertions_high.$sym144$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        final SubLObject cons = assertion_cons(assertion);
                        final SubLObject mt = assertion_mt(assertion);
                        final SubLObject variable_names = assertion_variable_names(assertion);
                        if (assertions_high.$list145.equal(cons)) {
                            reason = (SubLObject)assertions_high.$kw146$TAUTOLOGY;
                        }
                        else if (assertions_high.NIL == cons) {
                            reason = (SubLObject)assertions_high.$kw147$NO_SENTENCE;
                        }
                        else if (assertions_high.NIL != list_utilities.tree_find_if(Symbols.symbol_function((SubLObject)assertions_high.$sym148$INVALID_INDEXED_TERM_), cons, (SubLObject)assertions_high.UNPROVIDED)) {
                            reason = (SubLObject)assertions_high.$kw149$INVALID_SENTENCE_TERM;
                        }
                        else if (assertions_high.NIL != list_utilities.tree_find_if(Symbols.symbol_function((SubLObject)assertions_high.$sym148$INVALID_INDEXED_TERM_), mt, (SubLObject)assertions_high.UNPROVIDED)) {
                            reason = (SubLObject)assertions_high.$kw150$INVALID_MT_TERM;
                        }
                        else if (!variable_names.isList()) {
                            reason = (SubLObject)assertions_high.$kw151$BAD_VAR_NAMES;
                        }
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)assertions_high.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                msg = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            finally {
                thread.throwStack.pop();
            }
            if (msg.isString()) {
                reason = (SubLObject)assertions_high.$kw152$CANNOT_UNPACK;
            }
            brokenP = (SubLObject)((assertions_high.$kw142$OK == reason) ? assertions_high.NIL : assertions_high.T);
            if (assertions_high.NIL != brokenP) {
                SubLObject ignore_errors_tag = (SubLObject)assertions_high.NIL;
                try {
                    thread.throwStack.push(assertions_high.$kw153$IGNORE_ERRORS_TARGET);
                    final SubLObject _prev_bind_2 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)assertions_high.$sym154$IGNORE_ERRORS_HANDLER), thread);
                        try {
                            final SubLObject _prev_bind_0_$10 = Errors.$continue_cerrorP$.currentBinding(thread);
                            try {
                                Errors.$continue_cerrorP$.bind((SubLObject)assertions_high.T, thread);
                                try {
                                    tms.tms_remove_assertion(assertion);
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)assertions_high.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (assertions_high.NIL != assertion_handles.valid_assertionP(assertion, (SubLObject)assertions_high.UNPROVIDED)) {
                                            try {
                                                remove_assertion(assertion);
                                            }
                                            finally {
                                                final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)assertions_high.T, thread);
                                                    final SubLObject _values_$13 = Values.getValuesAsVector();
                                                    if (assertions_high.NIL != assertion_handles.valid_assertionP(assertion, (SubLObject)assertions_high.UNPROVIDED)) {
                                                        assertion_handles.deregister_assertion_id(assertion_handles.assertion_id(assertion));
                                                    }
                                                    Values.restoreValuesFromVector(_values_$13);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                                                }
                                            }
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                                    }
                                }
                            }
                            finally {
                                Errors.$continue_cerrorP$.rebind(_prev_bind_0_$10, thread);
                            }
                        }
                        catch (Throwable catch_var2) {
                            Errors.handleThrowable(catch_var2, (SubLObject)assertions_high.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(_prev_bind_2, thread);
                    }
                }
                catch (Throwable ccatch_env_var2) {
                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var2, (SubLObject)assertions_high.$kw153$IGNORE_ERRORS_TARGET);
                }
                finally {
                    thread.throwStack.pop();
                }
            }
            return reason;
        }
        return (SubLObject)assertions_high.$kw155$NOT_AN_ASSERTION;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 36822L)
    public static SubLObject matching_argument_on_assertion(final SubLObject assertion, final SubLObject argument) {
        assert assertions_high.NIL != assertion_handles.assertion_p(assertion) : assertion;
        assert assertions_high.NIL != arguments.argument_p(argument) : argument;
        return Sequences.find(argument, assertion_arguments(assertion), Symbols.symbol_function((SubLObject)assertions_high.$sym157$ARGUMENT_EQUAL), (SubLObject)assertions_high.UNPROVIDED, (SubLObject)assertions_high.UNPROVIDED, (SubLObject)assertions_high.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 37360L)
    public static SubLObject only_argument_of_assertion_p(final SubLObject assertion, final SubLObject argument) {
        assert assertions_high.NIL != assertion_handles.assertion_p(assertion) : assertion;
        assert assertions_high.NIL != arguments.argument_p(argument) : argument;
        return (SubLObject)SubLObjectFactory.makeBoolean(assertions_high.NIL == assertion_has_some_argument_other_thanP(assertion, argument));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 37691L)
    public static SubLObject assertion_has_some_argument_other_thanP(final SubLObject assertion, final SubLObject argument) {
        return subl_promotions.memberP(argument, assertion_arguments(assertion), (SubLObject)assertions_high.$sym158$NOT_EQL, (SubLObject)assertions_high.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 37837L)
    public static SubLObject asserted_assertionP(final SubLObject assertion) {
        enforceType(assertion, assertions_high.$sym33$ASSERTION_P);
        return list_utilities.sublisp_boolean(Sequences.find_if(Symbols.symbol_function((SubLObject)assertions_high.$sym159$ASSERTED_ARGUMENT_P), assertion_arguments(assertion), (SubLObject)assertions_high.UNPROVIDED, (SubLObject)assertions_high.UNPROVIDED, (SubLObject)assertions_high.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 38137L)
    public static SubLObject deduced_assertionP(final SubLObject assertion) {
        enforceType(assertion, assertions_high.$sym33$ASSERTION_P);
        return list_utilities.sublisp_boolean(Sequences.find_if(Symbols.symbol_function((SubLObject)assertions_high.$sym162$DEDUCTION_P), assertion_arguments(assertion), (SubLObject)assertions_high.UNPROVIDED, (SubLObject)assertions_high.UNPROVIDED, (SubLObject)assertions_high.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 38393L)
    public static SubLObject only_deduced_assertionP(final SubLObject assertion) {
        return (SubLObject)SubLObjectFactory.makeBoolean(assertions_high.NIL != deduced_assertionP(assertion) && assertions_high.NIL == asserted_assertionP(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 38604L)
    public static SubLObject forward_deduced_assertionP(final SubLObject assertion, SubLObject include_code_deduced_assertionsP) {
        if (include_code_deduced_assertionsP == assertions_high.UNPROVIDED) {
            include_code_deduced_assertionsP = (SubLObject)assertions_high.T;
        }
        return list_utilities.sublisp_boolean(Sequences.find_if((assertions_high.NIL != include_code_deduced_assertionsP) ? Symbols.symbol_function((SubLObject)assertions_high.$sym165$FORWARD_DEDUCTION_) : Symbols.symbol_function((SubLObject)assertions_high.$sym166$FORWARD_NOT_CODE_DEDUCTION_), assertion_arguments(assertion), (SubLObject)assertions_high.UNPROVIDED, (SubLObject)assertions_high.UNPROVIDED, (SubLObject)assertions_high.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 39043L)
    public static SubLObject get_asserted_argument(final SubLObject assertion) {
        enforceType(assertion, assertions_high.$sym33$ASSERTION_P);
        return Sequences.find_if(Symbols.symbol_function((SubLObject)assertions_high.$sym159$ASSERTED_ARGUMENT_P), assertion_arguments(assertion), (SubLObject)assertions_high.UNPROVIDED, (SubLObject)assertions_high.UNPROVIDED, (SubLObject)assertions_high.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 39391L)
    public static SubLObject get_asserted_argument_and_more(final SubLObject assertion) {
        final SubLObject v_arguments = assertion_arguments(assertion);
        final SubLObject asserted_argument = Sequences.find_if(Symbols.symbol_function((SubLObject)assertions_high.$sym159$ASSERTED_ARGUMENT_P), v_arguments, (SubLObject)assertions_high.UNPROVIDED, (SubLObject)assertions_high.UNPROVIDED, (SubLObject)assertions_high.UNPROVIDED);
        final SubLObject last_argumentP = (SubLObject)((assertions_high.NIL != asserted_argument) ? list_utilities.singletonP(v_arguments) : assertions_high.NIL);
        return Values.values(asserted_argument, last_argumentP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 39693L)
    public static SubLObject assertion_deductions(final SubLObject assertion) {
        assert assertions_high.NIL != assertion_handles.assertion_p(assertion) : assertion;
        return list_utilities.remove_if_not(Symbols.symbol_function((SubLObject)assertions_high.$sym162$DEDUCTION_P), assertion_arguments(assertion), (SubLObject)assertions_high.UNPROVIDED, (SubLObject)assertions_high.UNPROVIDED, (SubLObject)assertions_high.UNPROVIDED, (SubLObject)assertions_high.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 39919L)
    public static SubLObject assertion_dependent_count(final SubLObject assertion) {
        return assertions_low.assertion_dependent_count_internal(assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 40208L)
    public static SubLObject assertion_has_dependents_p(final SubLObject assertion) {
        enforceType(assertion, assertions_high.$sym33$ASSERTION_P);
        return assertions_low.assertion_has_dependents_p_internal(assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 40444L)
    public static SubLObject random_assertion(SubLObject test) {
        if (test == assertions_high.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)assertions_high.$sym172$TRUE);
        }
        return assertions_low.random_assertion_internal(test);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 40608L)
    public static SubLObject sample_assertions(SubLObject n, SubLObject allow_repeatsP, SubLObject test) {
        if (n == assertions_high.UNPROVIDED) {
            n = (SubLObject)assertions_high.$int173$500;
        }
        if (allow_repeatsP == assertions_high.UNPROVIDED) {
            allow_repeatsP = (SubLObject)assertions_high.NIL;
        }
        if (test == assertions_high.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)assertions_high.$sym172$TRUE);
        }
        assert assertions_high.NIL != subl_promotions.non_negative_integer_p(n) : n;
        if (assertions_high.NIL != allow_repeatsP) {
            SubLObject result = (SubLObject)assertions_high.NIL;
            SubLObject i;
            for (i = (SubLObject)assertions_high.NIL, i = (SubLObject)assertions_high.ZERO_INTEGER; i.numL(n); i = Numbers.add(i, (SubLObject)assertions_high.ONE_INTEGER)) {
                result = (SubLObject)ConsesLow.cons(random_assertion(test), result);
            }
            return result;
        }
        SubLObject result;
        for (result = set_contents.new_set_contents(n, Symbols.symbol_function((SubLObject)assertions_high.EQL)); set_contents.set_contents_size(result).numL(n); result = set_contents.set_contents_add(random_assertion(test), result, Symbols.symbol_function((SubLObject)assertions_high.EQL))) {}
        return set_contents.set_contents_element_list(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 41202L)
    public static SubLObject random_rule() {
        return assertions_low.random_rule_internal();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 41265L)
    public static SubLObject random_gaf() {
        return assertions_low.random_gaf_internal();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 41326L)
    public static SubLObject assertion_checkpoint_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(assertions_high.NIL != list_utilities.proper_list_p(v_object) && assertions_high.NIL != list_utilities.lengthE(v_object, (SubLObject)assertions_high.TWO_INTEGER, (SubLObject)assertions_high.UNPROVIDED) && assertions_high.NIL != list_utilities.every_in_list((SubLObject)assertions_high.$sym132$NON_NEGATIVE_INTEGER_P, v_object, (SubLObject)assertions_high.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 41618L)
    public static SubLObject new_assertion_checkpoint() {
        final SubLObject assertion_count = assertion_handles.assertion_count();
        final SubLObject next_assertion_id = assertion_handles.next_assertion_id();
        return (SubLObject)ConsesLow.list(assertion_count, next_assertion_id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 41875L)
    public static SubLObject assertion_checkpoint_currentP(final SubLObject assertion_checkpoint) {
        SubLObject checkpoint_count = (SubLObject)assertions_high.NIL;
        SubLObject checkpoint_next_id = (SubLObject)assertions_high.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(assertion_checkpoint, assertion_checkpoint, (SubLObject)assertions_high.$list174);
        checkpoint_count = assertion_checkpoint.first();
        SubLObject current = assertion_checkpoint.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, assertion_checkpoint, (SubLObject)assertions_high.$list174);
        checkpoint_next_id = current.first();
        current = current.rest();
        if (assertions_high.NIL == current) {
            return (SubLObject)SubLObjectFactory.makeBoolean(checkpoint_count.numE(assertion_handles.assertion_count()) && checkpoint_next_id.numE(assertion_handles.next_assertion_id()));
        }
        cdestructuring_bind.cdestructuring_bind_error(assertion_checkpoint, (SubLObject)assertions_high.$list174);
        return (SubLObject)assertions_high.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 42315L)
    public static SubLObject with_assertion_dump_id_table(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)assertions_high.$sym14$CLET, (SubLObject)assertions_high.$list175, ConsesLow.append(body, (SubLObject)assertions_high.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 42527L)
    public static SubLObject assertion_dump_id(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject id = assertion_handles.assertion_id(assertion);
        final SubLObject dump_table = assertions_high.$assertion_dump_id_table$.getDynamicValue(thread);
        if (assertions_high.NIL != dump_table) {
            id = id_index.id_index_lookup(dump_table, id, (SubLObject)assertions_high.UNPROVIDED);
        }
        return id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-high.lisp", position = 42797L)
    public static SubLObject find_assertion_by_dump_id(final SubLObject dump_id) {
        return assertion_handles.find_assertion_by_id(dump_id);
    }
    
    public static SubLObject declare_assertions_high_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.assertions_high", "do_assertion_arguments", "DO-ASSERTION-ARGUMENTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.assertions_high", "do_assertion_dependents", "DO-ASSERTION-DEPENDENTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.assertions_high", "do_assertion_literals", "DO-ASSERTION-LITERALS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.assertions_high", "do_recent_assertions", "DO-RECENT-ASSERTIONS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "assertion_cnf", "ASSERTION-CNF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "intuitive_assertion_cnf", "INTUITIVE-ASSERTION-CNF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "intuitive_cnf", "INTUITIVE-CNF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "possibly_assertion_cnf", "POSSIBLY-ASSERTION-CNF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "assertion_mt", "ASSERTION-MT", 1, 0, false);
        new $assertion_mt$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "assertion_gaf_hl_formula", "ASSERTION-GAF-HL-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "assertion_cons", "ASSERTION-CONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "gaf_assertionP", "GAF-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "rule_assertionP", "RULE-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "assertion_direction", "ASSERTION-DIRECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "assertion_truth", "ASSERTION-TRUTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "assertion_strength", "ASSERTION-STRENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "assertion_variable_names", "ASSERTION-VARIABLE-NAMES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "asserted_by", "ASSERTED-BY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "asserted_when", "ASSERTED-WHEN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "asserted_why", "ASSERTED-WHY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "asserted_second", "ASSERTED-SECOND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "assertion_arguments", "ASSERTION-ARGUMENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "assertion_dependents", "ASSERTION-DEPENDENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "assertion_dependent_list", "ASSERTION-DEPENDENT-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "cyc_assertion_tv", "CYC-ASSERTION-TV", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "assertion_formula", "ASSERTION-FORMULA", 1, 0, false);
        new $assertion_formula$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "assertion_ist_formula", "ASSERTION-IST-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "assertion_ist_sentence", "ASSERTION-IST-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "assertion_to_hl_assertion_spec", "ASSERTION-TO-HL-ASSERTION-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "assertion_to_hl_assertibles", "ASSERTION-TO-HL-ASSERTIBLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "assertion_mentions_termP", "ASSERTION-MENTIONS-TERM?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "assertion_mentions_term", "ASSERTION-MENTIONS-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "assertion_cnf_or_gaf_hl_formula", "ASSERTION-CNF-OR-GAF-HL-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "backward_ruleP", "BACKWARD-RULE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "forward_ruleP", "FORWARD-RULE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "single_literal_ruleP", "SINGLE-LITERAL-RULE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "single_literal_antecedent_ruleP", "SINGLE-LITERAL-ANTECEDENT-RULE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "two_literal_antecedent_ruleP", "TWO-LITERAL-ANTECEDENT-RULE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "forward_tms_ruleP", "FORWARD-TMS-RULE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "cycl_tms_predicateP", "CYCL-TMS-PREDICATE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "kb_tms_methodP", "KB-TMS-METHOD?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "backward_gafP", "BACKWARD-GAF?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "forward_gafP", "FORWARD-GAF?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "assertion_type", "ASSERTION-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "assertion_has_mtP", "ASSERTION-HAS-MT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "assertion_has_typeP", "ASSERTION-HAS-TYPE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "assertion_has_type", "ASSERTION-HAS-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "ground_assertionP", "GROUND-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "atomic_assertionP", "ATOMIC-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "meta_assertionP", "META-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "lifting_assertion_p", "LIFTING-ASSERTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "assertion_forts", "ASSERTION-FORTS", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "assertion_constants", "ASSERTION-CONSTANTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "gaf_formula", "GAF-FORMULA", 1, 0, false);
        new $gaf_formula$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "gaf_hl_formula", "GAF-HL-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "gaf_el_formula", "GAF-EL-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "assertion_gaf_el_formula", "ASSERTION-GAF-EL-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "gaf_args", "GAF-ARGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "gaf_arg", "GAF-ARG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "gaf_predicate", "GAF-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "gaf_arg0", "GAF-ARG0", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "gaf_arg1", "GAF-ARG1", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "gaf_arg2", "GAF-ARG2", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "gaf_arg3", "GAF-ARG3", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "gaf_arg4", "GAF-ARG4", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "gaf_arg5", "GAF-ARG5", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "assertion_has_directionP", "ASSERTION-HAS-DIRECTION?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "assertion_has_direction", "ASSERTION-HAS-DIRECTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "forward_assertionP", "FORWARD-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "backward_assertionP", "BACKWARD-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "code_assertionP", "CODE-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "assertion_has_truthP", "ASSERTION-HAS-TRUTH?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "assertion_has_truth", "ASSERTION-HAS-TRUTH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "assertion_date", "ASSERTION-DATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "assertion_asserted_dateP", "ASSERTION-ASSERTED-DATE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "new_assertion_asserted_date_iterator", "NEW-ASSERTION-ASSERTED-DATE-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "all_assertions_asserted_date", "ALL-ASSERTIONS-ASSERTED-DATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "assertion_el_variables", "ASSERTION-EL-VARIABLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "assertion_hl_variables", "ASSERTION-HL-VARIABLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "assertion_free_hl_variables", "ASSERTION-FREE-HL-VARIABLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "assertion_el_variable_to_hl", "ASSERTION-EL-VARIABLE-TO-HL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "assertion_hl_variable_to_el", "ASSERTION-HL-VARIABLE-TO-EL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "assertion_hl_to_el_variable_map", "ASSERTION-HL-TO-EL-VARIABLE-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "timestamp_asserted_assertion", "TIMESTAMP-ASSERTED-ASSERTION", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "remove_asserted_assertion_timestamp", "REMOVE-ASSERTED-ASSERTION-TIMESTAMP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "tl_timestamp_asserted_assertion", "TL-TIMESTAMP-ASSERTED-ASSERTION", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "tl_cache_assertion", "TL-CACHE-ASSERTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "tl_find_assertion", "TL-FIND-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "invalid_assertionP", "INVALID-ASSERTION?", 1, 1, false);
        new $invalid_assertionP$UnaryFunction();
        new $invalid_assertionP$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "invalid_assertion_robustP", "INVALID-ASSERTION-ROBUST?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "valid_assertion", "VALID-ASSERTION", 1, 1, false);
        new $valid_assertion$UnaryFunction();
        new $valid_assertion$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "invalid_assertion", "INVALID-ASSERTION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "assertion_id_from_recipe", "ASSERTION-ID-FROM-RECIPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "assertions_around_assertion", "ASSERTIONS-AROUND-ASSERTION", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "assertions_around", "ASSERTIONS-AROUND", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "kb_objects_around_id", "KB-OBJECTS-AROUND-ID", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "create_assertion", "CREATE-ASSERTION", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "create_gaf", "CREATE-GAF", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "find_or_create_assertion", "FIND-OR-CREATE-ASSERTION", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "find_or_create_gaf", "FIND-OR-CREATE-GAF", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "create_assertion_int", "CREATE-ASSERTION-INT", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "remove_assertion", "REMOVE-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "remove_broken_assertions", "REMOVE-BROKEN-ASSERTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "possibly_remove_broken_assertion", "POSSIBLY-REMOVE-BROKEN-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "matching_argument_on_assertion", "MATCHING-ARGUMENT-ON-ASSERTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "only_argument_of_assertion_p", "ONLY-ARGUMENT-OF-ASSERTION-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "assertion_has_some_argument_other_thanP", "ASSERTION-HAS-SOME-ARGUMENT-OTHER-THAN?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "asserted_assertionP", "ASSERTED-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "deduced_assertionP", "DEDUCED-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "only_deduced_assertionP", "ONLY-DEDUCED-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "forward_deduced_assertionP", "FORWARD-DEDUCED-ASSERTION?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "get_asserted_argument", "GET-ASSERTED-ARGUMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "get_asserted_argument_and_more", "GET-ASSERTED-ARGUMENT-AND-MORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "assertion_deductions", "ASSERTION-DEDUCTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "assertion_dependent_count", "ASSERTION-DEPENDENT-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "assertion_has_dependents_p", "ASSERTION-HAS-DEPENDENTS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "random_assertion", "RANDOM-ASSERTION", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "sample_assertions", "SAMPLE-ASSERTIONS", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "random_rule", "RANDOM-RULE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "random_gaf", "RANDOM-GAF", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "assertion_checkpoint_p", "ASSERTION-CHECKPOINT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "new_assertion_checkpoint", "NEW-ASSERTION-CHECKPOINT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "assertion_checkpoint_currentP", "ASSERTION-CHECKPOINT-CURRENT?", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.assertions_high", "with_assertion_dump_id_table", "WITH-ASSERTION-DUMP-ID-TABLE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "assertion_dump_id", "ASSERTION-DUMP-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_high", "find_assertion_by_dump_id", "FIND-ASSERTION-BY-DUMP-ID", 1, 0, false);
        return (SubLObject)assertions_high.NIL;
    }
    
    public static SubLObject init_assertions_high_file() {
        assertions_high.$tl_assertion_lookaside_table$ = SubLFiles.deflexical("*TL-ASSERTION-LOOKASIDE-TABLE*", (SubLObject)(maybeDefault((SubLObject)assertions_high.$sym125$_TL_ASSERTION_LOOKASIDE_TABLE_, assertions_high.$tl_assertion_lookaside_table$, assertions_high.NIL)));
        assertions_high.$tl_assertion_capacity$ = SubLFiles.deflexical("*TL-ASSERTION-CAPACITY*", (SubLObject)assertions_high.FIVE_INTEGER);
        assertions_high.$assertion_dump_id_table$ = SubLFiles.defparameter("*ASSERTION-DUMP-ID-TABLE*", (SubLObject)assertions_high.NIL);
        return (SubLObject)assertions_high.NIL;
    }
    
    public static SubLObject setup_assertions_high_file() {
        utilities_macros.register_cyc_api_function((SubLObject)assertions_high.$sym20$ASSERTION_CNF, (SubLObject)assertions_high.$list34, (SubLObject)assertions_high.$str35$Return_the_cnf_of_ASSERTION______, (SubLObject)assertions_high.$list36, (SubLObject)assertions_high.$list37);
        utilities_macros.register_cyc_api_function((SubLObject)assertions_high.$sym39$ASSERTION_MT, (SubLObject)assertions_high.$list34, (SubLObject)assertions_high.$str40$Return_the_mt_of_ASSERTION_, (SubLObject)assertions_high.$list36, (SubLObject)assertions_high.$list41);
        utilities_macros.register_cyc_api_function((SubLObject)assertions_high.$sym42$ASSERTION_DIRECTION, (SubLObject)assertions_high.$list34, (SubLObject)assertions_high.$str43$Return_the_direction_of_ASSERTION, (SubLObject)assertions_high.$list36, (SubLObject)assertions_high.$list44);
        utilities_macros.register_cyc_api_function((SubLObject)assertions_high.$sym45$ASSERTION_TRUTH, (SubLObject)assertions_high.$list34, (SubLObject)assertions_high.$str46$Return_the_current_truth_of_ASSER, (SubLObject)assertions_high.$list36, (SubLObject)assertions_high.$list47);
        utilities_macros.register_cyc_api_function((SubLObject)assertions_high.$sym48$ASSERTION_STRENGTH, (SubLObject)assertions_high.$list34, (SubLObject)assertions_high.$str49$Return_the_current_argumentation_, (SubLObject)assertions_high.$list36, (SubLObject)assertions_high.$list50);
        utilities_macros.register_cyc_api_function((SubLObject)assertions_high.$sym51$ASSERTION_VARIABLE_NAMES, (SubLObject)assertions_high.$list34, (SubLObject)assertions_high.$str52$Return_the_variable_names_for_ASS, (SubLObject)assertions_high.$list36, (SubLObject)assertions_high.$list53);
        utilities_macros.register_cyc_api_function((SubLObject)assertions_high.$sym54$ASSERTED_BY, (SubLObject)assertions_high.$list34, (SubLObject)assertions_high.$str55$Returns_the_cyclist_who_asserted_, (SubLObject)assertions_high.$list36, (SubLObject)assertions_high.NIL);
        utilities_macros.register_cyc_api_function((SubLObject)assertions_high.$sym56$ASSERTED_WHEN, (SubLObject)assertions_high.$list34, (SubLObject)assertions_high.$str57$Returns_the_day_when_ASSERTION_wa, (SubLObject)assertions_high.$list36, (SubLObject)assertions_high.$list58);
        utilities_macros.register_cyc_api_function((SubLObject)assertions_high.$sym59$ASSERTION_FORMULA, (SubLObject)assertions_high.$list34, (SubLObject)assertions_high.$str60$Return_a_formula_for_ASSERTION_, (SubLObject)assertions_high.$list36, (SubLObject)assertions_high.$list61);
        utilities_macros.register_cyc_api_function((SubLObject)assertions_high.$sym63$ASSERTION_IST_FORMULA, (SubLObject)assertions_high.$list34, (SubLObject)assertions_high.$str64$Return_a_formula_in___ist_format_, (SubLObject)assertions_high.$list36, (SubLObject)assertions_high.$list61);
        utilities_macros.register_cyc_api_function((SubLObject)assertions_high.$sym66$ASSERTION_MENTIONS_TERM_, (SubLObject)assertions_high.$list67, (SubLObject)assertions_high.$str68$Return_T_iff_ASSERTION_s_formula_, (SubLObject)assertions_high.$list69, (SubLObject)assertions_high.$list70);
        utilities_macros.register_obsolete_cyc_api_function((SubLObject)assertions_high.$sym71$ASSERTION_MENTIONS_TERM, (SubLObject)assertions_high.NIL, (SubLObject)assertions_high.$list67, (SubLObject)assertions_high.$str72$_see_assertion_mentions_term_, (SubLObject)assertions_high.$list69, (SubLObject)assertions_high.$list70);
        access_macros.define_obsolete_register((SubLObject)assertions_high.$sym81$ASSERTION_HAS_TYPE, (SubLObject)assertions_high.$list82);
        utilities_macros.register_cyc_api_function((SubLObject)assertions_high.$sym84$GAF_PREDICATE, (SubLObject)assertions_high.$list34, (SubLObject)assertions_high.$str85$Return_the_predicate_of_gaf_ASSER, (SubLObject)assertions_high.$list36, (SubLObject)assertions_high.NIL);
        utilities_macros.register_cyc_api_function((SubLObject)assertions_high.$sym86$GAF_ARG0, (SubLObject)assertions_high.$list34, (SubLObject)assertions_high.$str87$Return_arg_0__the_predicate__of_t, (SubLObject)assertions_high.$list36, (SubLObject)assertions_high.NIL);
        utilities_macros.register_cyc_api_function((SubLObject)assertions_high.$sym88$GAF_ARG1, (SubLObject)assertions_high.$list34, (SubLObject)assertions_high.$str89$Return_arg_1_of_the_gaf_ASSERTION, (SubLObject)assertions_high.$list36, (SubLObject)assertions_high.NIL);
        utilities_macros.register_cyc_api_function((SubLObject)assertions_high.$sym90$GAF_ARG2, (SubLObject)assertions_high.$list34, (SubLObject)assertions_high.$str91$Return_arg_2_of_the_gaf_ASSERTION, (SubLObject)assertions_high.$list36, (SubLObject)assertions_high.NIL);
        utilities_macros.register_cyc_api_function((SubLObject)assertions_high.$sym92$GAF_ARG3, (SubLObject)assertions_high.$list34, (SubLObject)assertions_high.$str93$Return_arg_3_of_the_gaf_ASSERTION, (SubLObject)assertions_high.$list36, (SubLObject)assertions_high.NIL);
        utilities_macros.register_cyc_api_function((SubLObject)assertions_high.$sym94$GAF_ARG4, (SubLObject)assertions_high.$list34, (SubLObject)assertions_high.$str95$Return_arg_4_of_the_gaf_ASSERTION, (SubLObject)assertions_high.$list36, (SubLObject)assertions_high.NIL);
        utilities_macros.register_cyc_api_function((SubLObject)assertions_high.$sym96$GAF_ARG5, (SubLObject)assertions_high.$list34, (SubLObject)assertions_high.$str97$Return_arg_5_of_the_gaf_ASSERTION, (SubLObject)assertions_high.$list36, (SubLObject)assertions_high.NIL);
        access_macros.define_obsolete_register((SubLObject)assertions_high.$sym99$ASSERTION_HAS_DIRECTION, (SubLObject)assertions_high.$list100);
        utilities_macros.register_cyc_api_function((SubLObject)assertions_high.$sym102$FORWARD_ASSERTION_, (SubLObject)assertions_high.$list34, (SubLObject)assertions_high.$str103$Predicate_returns_T_iff_ASSERTION, (SubLObject)assertions_high.NIL, (SubLObject)assertions_high.$list70);
        utilities_macros.register_cyc_api_function((SubLObject)assertions_high.$sym105$BACKWARD_ASSERTION_, (SubLObject)assertions_high.$list34, (SubLObject)assertions_high.$str106$Predicate_returns_T_iff_ASSERTION, (SubLObject)assertions_high.NIL, (SubLObject)assertions_high.$list70);
        utilities_macros.register_cyc_api_function((SubLObject)assertions_high.$sym108$CODE_ASSERTION_, (SubLObject)assertions_high.$list34, (SubLObject)assertions_high.$str109$Predicate_returns_T_iff_ASSERTION, (SubLObject)assertions_high.NIL, (SubLObject)assertions_high.$list70);
        utilities_macros.register_cyc_api_function((SubLObject)assertions_high.$sym111$ASSERTION_HAS_TRUTH_, (SubLObject)assertions_high.$list112, (SubLObject)assertions_high.$str113$Return_T_iff_ASSERTION_s_current_, (SubLObject)assertions_high.$list114, (SubLObject)assertions_high.$list70);
        utilities_macros.register_obsolete_cyc_api_function((SubLObject)assertions_high.$sym115$ASSERTION_HAS_TRUTH, (SubLObject)assertions_high.NIL, (SubLObject)assertions_high.$list112, (SubLObject)assertions_high.$str116$_see_assertion_has_truth_, (SubLObject)assertions_high.$list114, (SubLObject)assertions_high.$list70);
        subl_macro_promotions.declare_defglobal((SubLObject)assertions_high.$sym125$_TL_ASSERTION_LOOKASIDE_TABLE_);
        access_macros.define_obsolete_register((SubLObject)assertions_high.$sym127$VALID_ASSERTION, (SubLObject)assertions_high.$list128);
        access_macros.define_obsolete_register((SubLObject)assertions_high.$sym129$INVALID_ASSERTION, (SubLObject)assertions_high.$list130);
        utilities_macros.register_cyc_api_function((SubLObject)assertions_high.$sym160$ASSERTED_ASSERTION_, (SubLObject)assertions_high.$list34, (SubLObject)assertions_high.$str161$Return_non_nil_IFF_assertion_has_, (SubLObject)assertions_high.$list36, (SubLObject)assertions_high.$list70);
        utilities_macros.register_cyc_api_function((SubLObject)assertions_high.$sym163$DEDUCED_ASSERTION_, (SubLObject)assertions_high.$list34, (SubLObject)assertions_high.$str164$Return_non_nil_IFF_assertion_has_, (SubLObject)assertions_high.$list36, (SubLObject)assertions_high.$list70);
        utilities_macros.register_cyc_api_function((SubLObject)assertions_high.$sym167$GET_ASSERTED_ARGUMENT, (SubLObject)assertions_high.$list34, (SubLObject)assertions_high.$str168$Return_the_asserted_argument_for_, (SubLObject)assertions_high.$list36, (SubLObject)assertions_high.$list169);
        utilities_macros.register_cyc_api_function((SubLObject)assertions_high.$sym170$ASSERTION_HAS_DEPENDENTS_P, (SubLObject)assertions_high.$list34, (SubLObject)assertions_high.$str171$Return_non_nil_IFF_assertion_has_, (SubLObject)assertions_high.$list36, (SubLObject)assertions_high.$list70);
        return (SubLObject)assertions_high.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_assertions_high_file();
    }
    
    @Override
	public void initializeVariables() {
        init_assertions_high_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_assertions_high_file();
    }
    
    static {
        me = (SubLFile)new assertions_high();
        assertions_high.$tl_assertion_lookaside_table$ = null;
        assertions_high.$tl_assertion_capacity$ = null;
        assertions_high.$assertion_dump_id_table$ = null;
        $list0 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARGUMENT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw2$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw3$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym4$DO_LIST = SubLObjectFactory.makeSymbol("DO-LIST");
        $sym5$ASSERTION_ARGUMENTS = SubLObjectFactory.makeSymbol("ASSERTION-ARGUMENTS");
        $list6 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEDUCTION-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym7$DO_SET_CONTENTS = SubLObjectFactory.makeSymbol("DO-SET-CONTENTS");
        $sym8$ASSERTION_DEPENDENTS = SubLObjectFactory.makeSymbol("ASSERTION-DEPENDENTS");
        $list9 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("SENSE"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw11$SENSE = SubLObjectFactory.makeKeyword("SENSE");
        $kw12$PREDICATE = SubLObjectFactory.makeKeyword("PREDICATE");
        $sym13$PREDICATE_VAR = SubLObjectFactory.makeUninternedSymbol("PREDICATE-VAR");
        $sym14$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym15$DO_ASSERTION_LITERALS = SubLObjectFactory.makeSymbol("DO-ASSERTION-LITERALS");
        $sym16$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym17$ATOMIC_SENTENCE_PREDICATE = SubLObjectFactory.makeSymbol("ATOMIC-SENTENCE-PREDICATE");
        $sym18$CNF_VAR = SubLObjectFactory.makeUninternedSymbol("CNF-VAR");
        $sym19$ASSERTION_VAR = SubLObjectFactory.makeUninternedSymbol("ASSERTION-VAR");
        $sym20$ASSERTION_CNF = SubLObjectFactory.makeSymbol("ASSERTION-CNF");
        $sym21$DO_ALL_LITS_AS_ASENTS = SubLObjectFactory.makeSymbol("DO-ALL-LITS-AS-ASENTS");
        $list22 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("NUM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeString("mapping assertions for sweep")), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NUM"), (SubLObject)SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw24$NUM = SubLObjectFactory.makeKeyword("NUM");
        $kw25$PROGRESS_MESSAGE = SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE");
        $str26$mapping_assertions_for_sweep = SubLObjectFactory.makeString("mapping assertions for sweep");
        $sym27$PIF = SubLObjectFactory.makeSymbol("PIF");
        $sym28$POSITIVE_INTEGER_P = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $sym29$PROGRESS_CSOME = SubLObjectFactory.makeSymbol("PROGRESS-CSOME");
        $sym30$ASSERTIONS_AROUND = SubLObjectFactory.makeSymbol("ASSERTIONS-AROUND");
        $list31 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEXT-ASSERTION-ID"));
        $sym32$DO_ASSERTIONS = SubLObjectFactory.makeSymbol("DO-ASSERTIONS");
        $sym33$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $list34 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"));
        $str35$Return_the_cnf_of_ASSERTION______ = SubLObjectFactory.makeString("Return the cnf of ASSERTION.\n   @note If you know the assertion is a gaf,\n   consider using gaf-formula instead,\n   if you do not explicitly need a CNF.");
        $list36 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-P")));
        $list37 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNF-P"));
        $kw38$FALSE = SubLObjectFactory.makeKeyword("FALSE");
        $sym39$ASSERTION_MT = SubLObjectFactory.makeSymbol("ASSERTION-MT");
        $str40$Return_the_mt_of_ASSERTION_ = SubLObjectFactory.makeString("Return the mt of ASSERTION.");
        $list41 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HLMT-P"));
        $sym42$ASSERTION_DIRECTION = SubLObjectFactory.makeSymbol("ASSERTION-DIRECTION");
        $str43$Return_the_direction_of_ASSERTION = SubLObjectFactory.makeString("Return the direction of ASSERTION (either :backward, :forward or :code).");
        $list44 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DIRECTION-P"));
        $sym45$ASSERTION_TRUTH = SubLObjectFactory.makeSymbol("ASSERTION-TRUTH");
        $str46$Return_the_current_truth_of_ASSER = SubLObjectFactory.makeString("Return the current truth of ASSERTION -- either :true :false or :unknown.");
        $list47 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRUTH-P"));
        $sym48$ASSERTION_STRENGTH = SubLObjectFactory.makeSymbol("ASSERTION-STRENGTH");
        $str49$Return_the_current_argumentation_ = SubLObjectFactory.makeString("Return the current argumentation strength of ASSERTION -- either :monotonic, :default, or :unknown.");
        $list50 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EL-STRENGTH-P"));
        $sym51$ASSERTION_VARIABLE_NAMES = SubLObjectFactory.makeSymbol("ASSERTION-VARIABLE-NAMES");
        $str52$Return_the_variable_names_for_ASS = SubLObjectFactory.makeString("Return the variable names for ASSERTION.");
        $list53 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LISTP"));
        $sym54$ASSERTED_BY = SubLObjectFactory.makeSymbol("ASSERTED-BY");
        $str55$Returns_the_cyclist_who_asserted_ = SubLObjectFactory.makeString("Returns the cyclist who asserted ASSERTION.");
        $sym56$ASSERTED_WHEN = SubLObjectFactory.makeSymbol("ASSERTED-WHEN");
        $str57$Returns_the_day_when_ASSERTION_wa = SubLObjectFactory.makeString("Returns the day when ASSERTION was asserted.");
        $list58 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTEGERP"));
        $sym59$ASSERTION_FORMULA = SubLObjectFactory.makeSymbol("ASSERTION-FORMULA");
        $str60$Return_a_formula_for_ASSERTION_ = SubLObjectFactory.makeString("Return a formula for ASSERTION.");
        $list61 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EL-FORMULA-P"));
        $const62$ist = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist"));
        $sym63$ASSERTION_IST_FORMULA = SubLObjectFactory.makeSymbol("ASSERTION-IST-FORMULA");
        $str64$Return_a_formula_in___ist_format_ = SubLObjectFactory.makeString("Return a formula in #$ist format for ASSERTION.");
        $sym65$HL_TERM_P = SubLObjectFactory.makeSymbol("HL-TERM-P");
        $sym66$ASSERTION_MENTIONS_TERM_ = SubLObjectFactory.makeSymbol("ASSERTION-MENTIONS-TERM?");
        $list67 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"));
        $str68$Return_T_iff_ASSERTION_s_formula_ = SubLObjectFactory.makeString("Return T iff ASSERTION's formula or mt contains TERM.\n   If assertion is a meta-assertion, recurse down sub-assertions.\n   By convention, negated gafs do not necessarily mention the term #$not.");
        $list69 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("HL-TERM-P")));
        $list70 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"));
        $sym71$ASSERTION_MENTIONS_TERM = SubLObjectFactory.makeSymbol("ASSERTION-MENTIONS-TERM");
        $str72$_see_assertion_mentions_term_ = SubLObjectFactory.makeString("@see assertion-mentions-term?");
        $const73$performSubL = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("performSubL"));
        $sym74$KB_TMS_METHOD_ = SubLObjectFactory.makeSymbol("KB-TMS-METHOD?");
        $list75 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("reconsiderAssertionDeductions")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("repropagateAssertion")));
        $list76 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TMS-RECONSIDER-ASSERTION-DEDUCTIONS"), (SubLObject)SubLObjectFactory.makeSymbol("REPROPAGATE-FORWARD-ASSERTION"));
        $kw77$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw78$RULE = SubLObjectFactory.makeKeyword("RULE");
        $str79$Could_not_determine_assertion_typ = SubLObjectFactory.makeString("Could not determine assertion type for ~S");
        $sym80$ASSERTION_TYPE_P = SubLObjectFactory.makeSymbol("ASSERTION-TYPE-P");
        $sym81$ASSERTION_HAS_TYPE = SubLObjectFactory.makeSymbol("ASSERTION-HAS-TYPE");
        $list82 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-HAS-TYPE?"));
        $sym83$GAF_ASSERTION_ = SubLObjectFactory.makeSymbol("GAF-ASSERTION?");
        $sym84$GAF_PREDICATE = SubLObjectFactory.makeSymbol("GAF-PREDICATE");
        $str85$Return_the_predicate_of_gaf_ASSER = SubLObjectFactory.makeString("Return the predicate of gaf ASSERTION.");
        $sym86$GAF_ARG0 = SubLObjectFactory.makeSymbol("GAF-ARG0");
        $str87$Return_arg_0__the_predicate__of_t = SubLObjectFactory.makeString("Return arg 0 (the predicate) of the gaf ASSERTION.");
        $sym88$GAF_ARG1 = SubLObjectFactory.makeSymbol("GAF-ARG1");
        $str89$Return_arg_1_of_the_gaf_ASSERTION = SubLObjectFactory.makeString("Return arg 1 of the gaf ASSERTION.");
        $sym90$GAF_ARG2 = SubLObjectFactory.makeSymbol("GAF-ARG2");
        $str91$Return_arg_2_of_the_gaf_ASSERTION = SubLObjectFactory.makeString("Return arg 2 of the gaf ASSERTION.");
        $sym92$GAF_ARG3 = SubLObjectFactory.makeSymbol("GAF-ARG3");
        $str93$Return_arg_3_of_the_gaf_ASSERTION = SubLObjectFactory.makeString("Return arg 3 of the gaf ASSERTION.");
        $sym94$GAF_ARG4 = SubLObjectFactory.makeSymbol("GAF-ARG4");
        $str95$Return_arg_4_of_the_gaf_ASSERTION = SubLObjectFactory.makeString("Return arg 4 of the gaf ASSERTION.");
        $sym96$GAF_ARG5 = SubLObjectFactory.makeSymbol("GAF-ARG5");
        $str97$Return_arg_5_of_the_gaf_ASSERTION = SubLObjectFactory.makeString("Return arg 5 of the gaf ASSERTION.");
        $sym98$DIRECTION_P = SubLObjectFactory.makeSymbol("DIRECTION-P");
        $sym99$ASSERTION_HAS_DIRECTION = SubLObjectFactory.makeSymbol("ASSERTION-HAS-DIRECTION");
        $list100 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-HAS-DIRECTION?"));
        $kw101$FORWARD = SubLObjectFactory.makeKeyword("FORWARD");
        $sym102$FORWARD_ASSERTION_ = SubLObjectFactory.makeSymbol("FORWARD-ASSERTION?");
        $str103$Predicate_returns_T_iff_ASSERTION = SubLObjectFactory.makeString("Predicate returns T iff ASSERTION's direction is :FORWARD.");
        $kw104$BACKWARD = SubLObjectFactory.makeKeyword("BACKWARD");
        $sym105$BACKWARD_ASSERTION_ = SubLObjectFactory.makeSymbol("BACKWARD-ASSERTION?");
        $str106$Predicate_returns_T_iff_ASSERTION = SubLObjectFactory.makeString("Predicate returns T iff ASSERTION's direction is :BACKWARD.");
        $kw107$CODE = SubLObjectFactory.makeKeyword("CODE");
        $sym108$CODE_ASSERTION_ = SubLObjectFactory.makeSymbol("CODE-ASSERTION?");
        $str109$Predicate_returns_T_iff_ASSERTION = SubLObjectFactory.makeString("Predicate returns T iff ASSERTION's direction is :CODE.");
        $sym110$TRUTH_P = SubLObjectFactory.makeSymbol("TRUTH-P");
        $sym111$ASSERTION_HAS_TRUTH_ = SubLObjectFactory.makeSymbol("ASSERTION-HAS-TRUTH?");
        $list112 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH"));
        $str113$Return_T_iff_ASSERTION_s_current_ = SubLObjectFactory.makeString("Return T iff ASSERTION's current truth is TRUTH.");
        $list114 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH-P")));
        $sym115$ASSERTION_HAS_TRUTH = SubLObjectFactory.makeSymbol("ASSERTION-HAS-TRUTH");
        $str116$_see_assertion_has_truth_ = SubLObjectFactory.makeString("@see assertion-has-truth?");
        $int117$1000000 = SubLObjectFactory.makeInteger(1000000);
        $sym118$GENERALIZED_DATE_P = SubLObjectFactory.makeSymbol("GENERALIZED-DATE-P");
        $sym119$ASSERTION_ASSERTED_DATE_ = SubLObjectFactory.makeSymbol("ASSERTION-ASSERTED-DATE?");
        $sym120$INTERN_EL_VAR = SubLObjectFactory.makeSymbol("INTERN-EL-VAR");
        $sym121$EL_VARIABLE_P = SubLObjectFactory.makeSymbol("EL-VARIABLE-P");
        $sym122$VARIABLE_P = SubLObjectFactory.makeSymbol("VARIABLE-P");
        $sym123$MAKE_VARIABLE_BINDING = SubLObjectFactory.makeSymbol("MAKE-VARIABLE-BINDING");
        $sym124$TL_TIMESTAMP_ASSERTED_ASSERTION = SubLObjectFactory.makeSymbol("TL-TIMESTAMP-ASSERTED-ASSERTION");
        $sym125$_TL_ASSERTION_LOOKASIDE_TABLE_ = SubLObjectFactory.makeSymbol("*TL-ASSERTION-LOOKASIDE-TABLE*");
        $sym126$NART_P = SubLObjectFactory.makeSymbol("NART-P");
        $sym127$VALID_ASSERTION = SubLObjectFactory.makeSymbol("VALID-ASSERTION");
        $list128 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALID-ASSERTION?"));
        $sym129$INVALID_ASSERTION = SubLObjectFactory.makeSymbol("INVALID-ASSERTION");
        $list130 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INVALID-ASSERTION?"));
        $int131$100 = SubLObjectFactory.makeInteger(100);
        $sym132$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $sym133$FIND_ASSERTION_BY_ID = SubLObjectFactory.makeSymbol("FIND-ASSERTION-BY-ID");
        $kw134$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $kw135$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $sym136$CNF_P = SubLObjectFactory.makeSymbol("CNF-P");
        $sym137$HLMT_P = SubLObjectFactory.makeSymbol("HLMT-P");
        $sym138$EL_FORMULA_P = SubLObjectFactory.makeSymbol("EL-FORMULA-P");
        $str139$Removing_broken_assertions__pass_ = SubLObjectFactory.makeString("Removing broken assertions: pass ~S");
        $sym140$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $kw141$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $kw142$OK = SubLObjectFactory.makeKeyword("OK");
        $str143$_______removed_assertion___A__rea = SubLObjectFactory.makeString("~& ... removed assertion #~A (reason = ~S) ...~%");
        $sym144$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $list145 = ConsesLow.list((SubLObject)assertions_high.NIL);
        $kw146$TAUTOLOGY = SubLObjectFactory.makeKeyword("TAUTOLOGY");
        $kw147$NO_SENTENCE = SubLObjectFactory.makeKeyword("NO-SENTENCE");
        $sym148$INVALID_INDEXED_TERM_ = SubLObjectFactory.makeSymbol("INVALID-INDEXED-TERM?");
        $kw149$INVALID_SENTENCE_TERM = SubLObjectFactory.makeKeyword("INVALID-SENTENCE-TERM");
        $kw150$INVALID_MT_TERM = SubLObjectFactory.makeKeyword("INVALID-MT-TERM");
        $kw151$BAD_VAR_NAMES = SubLObjectFactory.makeKeyword("BAD-VAR-NAMES");
        $kw152$CANNOT_UNPACK = SubLObjectFactory.makeKeyword("CANNOT-UNPACK");
        $kw153$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym154$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $kw155$NOT_AN_ASSERTION = SubLObjectFactory.makeKeyword("NOT-AN-ASSERTION");
        $sym156$ARGUMENT_P = SubLObjectFactory.makeSymbol("ARGUMENT-P");
        $sym157$ARGUMENT_EQUAL = SubLObjectFactory.makeSymbol("ARGUMENT-EQUAL");
        $sym158$NOT_EQL = SubLObjectFactory.makeSymbol("NOT-EQL");
        $sym159$ASSERTED_ARGUMENT_P = SubLObjectFactory.makeSymbol("ASSERTED-ARGUMENT-P");
        $sym160$ASSERTED_ASSERTION_ = SubLObjectFactory.makeSymbol("ASSERTED-ASSERTION?");
        $str161$Return_non_nil_IFF_assertion_has_ = SubLObjectFactory.makeString("Return non-nil IFF assertion has an asserted argument.");
        $sym162$DEDUCTION_P = SubLObjectFactory.makeSymbol("DEDUCTION-P");
        $sym163$DEDUCED_ASSERTION_ = SubLObjectFactory.makeSymbol("DEDUCED-ASSERTION?");
        $str164$Return_non_nil_IFF_assertion_has_ = SubLObjectFactory.makeString("Return non-nil IFF assertion has some deduced argument");
        $sym165$FORWARD_DEDUCTION_ = SubLObjectFactory.makeSymbol("FORWARD-DEDUCTION?");
        $sym166$FORWARD_NOT_CODE_DEDUCTION_ = SubLObjectFactory.makeSymbol("FORWARD-NOT-CODE-DEDUCTION?");
        $sym167$GET_ASSERTED_ARGUMENT = SubLObjectFactory.makeSymbol("GET-ASSERTED-ARGUMENT");
        $str168$Return_the_asserted_argument_for_ = SubLObjectFactory.makeString("Return the asserted argument for ASSERTION, or nil if none present.");
        $list169 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NIL-OR"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTED-ARGUMENT-P")));
        $sym170$ASSERTION_HAS_DEPENDENTS_P = SubLObjectFactory.makeSymbol("ASSERTION-HAS-DEPENDENTS-P");
        $str171$Return_non_nil_IFF_assertion_has_ = SubLObjectFactory.makeString("Return non-nil IFF assertion has dependents.");
        $sym172$TRUE = SubLObjectFactory.makeSymbol("TRUE");
        $int173$500 = SubLObjectFactory.makeInteger(500);
        $list174 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECKPOINT-COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("CHECKPOINT-NEXT-ID"));
        $list175 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*ASSERTION-DUMP-ID-TABLE*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CREATE-ASSERTION-DUMP-ID-TABLE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CFASL-ASSERTION-HANDLE-FUNC*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-DUMP-ID"))));
    }
    
    public static final class $assertion_mt$UnaryFunction extends UnaryFunction
    {
        public $assertion_mt$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("ASSERTION-MT"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return assertions_high.assertion_mt(arg1);
        }
    }
    
    public static final class $assertion_formula$UnaryFunction extends UnaryFunction
    {
        public $assertion_formula$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("ASSERTION-FORMULA"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return assertions_high.assertion_formula(arg1);
        }
    }
    
    public static final class $gaf_formula$UnaryFunction extends UnaryFunction
    {
        public $gaf_formula$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("GAF-FORMULA"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return assertions_high.gaf_formula(arg1);
        }
    }
    
    public static final class $invalid_assertionP$UnaryFunction extends UnaryFunction
    {
        public $invalid_assertionP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("INVALID-ASSERTION?"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return assertions_high.invalid_assertionP(arg1, (SubLObject)$invalid_assertionP$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $invalid_assertionP$BinaryFunction extends BinaryFunction
    {
        public $invalid_assertionP$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("INVALID-ASSERTION?"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return assertions_high.invalid_assertionP(arg1, arg2);
        }
    }
    
    public static final class $valid_assertion$UnaryFunction extends UnaryFunction
    {
        public $valid_assertion$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("VALID-ASSERTION"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return assertions_high.valid_assertion(arg1, (SubLObject)$valid_assertion$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $valid_assertion$BinaryFunction extends BinaryFunction
    {
        public $valid_assertion$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("VALID-ASSERTION"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return assertions_high.valid_assertion(arg1, arg2);
        }
    }
}
