// 
// 

package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation;
import com.cyc.cycjava.cycl.inference.harness.abnormal;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_formula_arg_n;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
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

public final class assertion_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.assertion_utilities";
    public static final String myFingerPrint = "0ab08b0403205f3813b3cec84279d3ea6a45638e5b2a623b98936e7c7864caea";
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 16957L)
    public static SubLSymbol $excepted_assertion_max_depth$;
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 20669L)
    public static SubLSymbol $excepted_assertion_shallow_max_depth$;
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 20994L)
    public static SubLSymbol $doomed_assertion_max_depth$;
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 26659L)
    private static SubLSymbol $assertion_mentions_any_of_terms_set_watermark$;
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 27514L)
    private static SubLSymbol $assertion_mentions_any_of_terms_set_lambda$;
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 28237L)
    private static SubLSymbol $assertion_mentions_any_of_terms_dict_lambda$;
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 38482L)
    private static SubLSymbol $newest_constant_of_assertions$;
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 46389L)
    private static SubLSymbol $cached_self_looping_rule_assertionP_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 46800L)
    private static SubLSymbol $cached_self_expanding_rule_assertionP_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 47186L)
    private static SubLSymbol $all_forward_rules_relevant_to_term_threshold$;
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 47527L)
    private static SubLSymbol $within_safe_all_forward_rules_relevant_to_termP$;
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 50132L)
    private static SubLSymbol $all_forward_rules_relevant_to_term_argument_set$;
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 50250L)
    private static SubLSymbol $all_forward_rules_relevant_to_term_dependent_set$;
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 50371L)
    private static SubLSymbol $all_forward_rules_relevant_to_term_nart_set$;
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 50489L)
    private static SubLSymbol $all_forward_rules_relevant_to_term_result_set$;
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 53760L)
    private static SubLSymbol $deduction_asserted_assertion_supports_deductions_processed$;
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 53976L)
    private static SubLSymbol $deduction_asserted_assertion_counts$;
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 63205L)
    private static SubLSymbol $rarest_term$;
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 63294L)
    private static SubLSymbol $rarest_count$;
    private static final SubLList $list0;
    private static final SubLList $list1;
    private static final SubLSymbol $kw2$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw3$PROGRESS_MESSAGE;
    private static final SubLString $str4$mapping_Cyc_rules;
    private static final SubLSymbol $kw5$DONE;
    private static final SubLSymbol $sym6$DO_ITERATOR;
    private static final SubLList $list7;
    private static final SubLSymbol $sym8$MESSAGE_VAR;
    private static final SubLSymbol $sym9$TOTAL;
    private static final SubLSymbol $sym10$SOFAR;
    private static final SubLSymbol $sym11$CLET;
    private static final SubLList $list12;
    private static final SubLList $list13;
    private static final SubLSymbol $sym14$NOTING_PERCENT_PROGRESS;
    private static final SubLSymbol $sym15$DO_RULES;
    private static final SubLSymbol $sym16$CINC;
    private static final SubLSymbol $sym17$NOTE_PERCENT_PROGRESS;
    private static final SubLList $list18;
    private static final SubLString $str19$mapping_Cyc_GAFs;
    private static final SubLSymbol $sym20$DO_ASSERTIONS;
    private static final SubLSymbol $sym21$PWHEN;
    private static final SubLSymbol $sym22$GAF_ASSERTION_;
    private static final SubLList $list23;
    private static final SubLSymbol $sym24$PROGRESS_MESSAGE_VAR;
    private static final SubLSymbol $sym25$DO_ASSERTIONS_BACKWARDS;
    private static final SubLSymbol $sym26$SOFAR_VAR;
    private static final SubLSymbol $sym27$TOTAL_VAR;
    private static final SubLList $list28;
    private static final SubLSymbol $sym29$ID_VAR;
    private static final SubLSymbol $sym30$DO_NUMBERS;
    private static final SubLSymbol $kw31$START;
    private static final SubLList $list32;
    private static final SubLSymbol $kw33$END;
    private static final SubLSymbol $kw34$DELTA;
    private static final SubLSymbol $sym35$FIND_ASSERTION_BY_ID;
    private static final SubLList $list36;
    private static final SubLSymbol $sym37$DEDUCTION;
    private static final SubLSymbol $sym38$DO_ASSERTION_DEPENDENTS;
    private static final SubLSymbol $sym39$DEDUCTION_ASSERTION;
    private static final SubLSymbol $sym40$ASSERTION_P;
    private static final SubLList $list41;
    private static final SubLList $list42;
    private static final SubLSymbol $sym43$ARGUMENT;
    private static final SubLSymbol $sym44$DO_ASSERTION_ARGUMENTS;
    private static final SubLSymbol $sym45$DEDUCTION_P;
    private static final SubLSymbol $sym46$DO_DEDUCTION_SUPPORTS;
    private static final SubLString $str47$Gathering_mt_relevant_dependents_;
    private static final SubLString $str48$_assertions;
    private static final SubLObject $const49$except;
    private static final SubLString $str50$Removing_;
    private static final SubLString $str51$_mt_relevant_dependents;
    private static final SubLString $str52$Deduction__A_supporting_missing_K;
    private static final SubLString $str53$deduction_dependent_deductions_ca;
    private static final SubLSymbol $kw54$TRUE;
    private static final SubLSymbol $kw55$FALSE;
    private static final SubLSymbol $kw56$UNKNOWN;
    private static final SubLObject $const57$NLSemanticPredicate;
    private static final SubLSymbol $sym58$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const59$EverythingPSC;
    private static final SubLSymbol $sym60$_EXIT;
    private static final SubLObject $const61$obsoleteRule;
    private static final SubLObject $const62$isa;
    private static final SubLObject $const63$genls;
    private static final SubLSymbol $sym64$ABNORMAL_ASSERTION_P;
    private static final SubLObject $const65$exceptMt;
    private static final SubLSymbol $sym66$SUPPORT_P;
    private static final SubLObject $const67$assertedMoreSpecifically;
    private static final SubLInteger $int68$30;
    private static final SubLSymbol $sym69$ASSERTION_MENTIONS_ANY_OF_TERMS_IN_SET_LAMBDA;
    private static final SubLSymbol $sym70$ASSERTION_MENTIONS_ANY_OF_TERMS_IN_DICT_LAMBDA;
    private static final SubLInteger $int71$10000;
    private static final SubLSymbol $kw72$GAF;
    private static final SubLSymbol $kw73$RULE;
    private static final SubLSymbol $sym74$ASSERTED_WHEN;
    private static final SubLSymbol $sym75$INTEGERP;
    private static final SubLSymbol $sym76$ASSERTED_SECOND;
    private static final SubLSymbol $sym77$EL_VAR_NAME;
    private static final SubLObject $const78$knownSentence;
    private static final SubLObject $const79$unknownSentence;
    private static final SubLSymbol $sym80$FORWARD_ASSERTION_;
    private static final SubLSymbol $sym81$ASSERTION_DEPENDENT_COUNT;
    private static final SubLString $str82$Sorting_newest_constants___Part_2;
    private static final SubLSymbol $sym83$STRINGP;
    private static final SubLSymbol $kw84$SKIP;
    private static final SubLString $str85$Computing_newest_constants;
    private static final SubLString $str86$Sorting_newest_constants___Part_1;
    private static final SubLSymbol $sym87$ASSERTION_HAS_META_ASSERTIONS_;
    private static final SubLList $list88;
    private static final SubLString $str89$Return_T_iff_ASSERTION_has_some_m;
    private static final SubLList $list90;
    private static final SubLList $list91;
    private static final SubLSymbol $sym92$ALL_META_ASSERTIONS;
    private static final SubLSymbol $sym93$RULE_ASSERTION_;
    private static final SubLObject $const94$meetsPragmaticRequirement;
    private static final SubLSymbol $sym95$META_ASSERTION_P;
    private static final SubLSymbol $sym96$HLMT_P;
    private static final SubLSymbol $sym97$ASSERTION_LIST_P;
    private static final SubLSymbol $sym98$ASSERTION_MT;
    private static final SubLSymbol $sym99$SAFE__;
    private static final SubLSymbol $sym100$ASSERTION_ID;
    private static final SubLSymbol $sym101$TERM__;
    private static final SubLSymbol $sym102$DEFINITIONAL_PRED__;
    private static final SubLSymbol $sym103$GAF_PREDICATE;
    private static final SubLSymbol $sym104$GAF_ARG1;
    private static final SubLSymbol $sym105$ISA_HL_VAR_THING_LIT_;
    private static final SubLString $str106$Type_constraint__Mt_should_be_can;
    private static final SubLString $str107$Expected_a_single_DNF_clause_of_c;
    private static final SubLSymbol $sym108$CACHED_SELF_LOOPING_RULE_ASSERTION_;
    private static final SubLSymbol $sym109$_CACHED_SELF_LOOPING_RULE_ASSERTION__CACHING_STATE_;
    private static final SubLSymbol $sym110$CACHED_SELF_EXPANDING_RULE_ASSERTION_;
    private static final SubLSymbol $sym111$_CACHED_SELF_EXPANDING_RULE_ASSERTION__CACHING_STATE_;
    private static final SubLInteger $int112$212;
    private static final SubLSymbol $sym113$FORT_P;
    private static final SubLSymbol $kw114$ALL_FORWARD_RULES_RELEVANT_TO_TERMS_THRESHOLD_EXCEEDED;
    private static final SubLSymbol $sym115$_;
    private static final SubLSymbol $kw116$ALL;
    private static final SubLSymbol $sym117$NON_DOTTED_LIST_P;
    private static final SubLList $list118;
    private static final SubLObject $const119$trueRule;
    private static final SubLSymbol $kw120$ARGUMENT_;
    private static final SubLSymbol $kw121$DEPENDENT_;
    private static final SubLString $str122$can_t_handle_argument__S_yet;
    private static final SubLString $str123$can_t_handle_sub_support__S_yet;
    private static final SubLString $str124$gathering_exception_rules;
    private static final SubLString $str125$gathering_pragma_rules;
    private static final SubLString $str126$gathering_lifting_rules;
    private static final SubLObject $const127$ist;
    private static final SubLObject $const128$universalLiftingRule;
    private static final SubLString $str129$__;
    private static final SubLSymbol $sym130$FALSE;
    private static final SubLString $str131$Verifying_that_all_embedded_asser;
    private static final SubLString $str132$Looking_for_assertions_with_no_ar;
    private static final SubLString $str133$mapping_Cyc_assertions;
    private static final SubLSymbol $kw134$UNSPECIFIED;
    private static final SubLSymbol $sym135$UPDATE_RAREST_TERM;
    private static final SubLSymbol $sym136$_;
    private static final SubLSymbol $sym137$MEMOIZED_ASSERTION_TERM_RARITY;
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 996L)
    public static SubLObject do_rules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)assertion_utilities.$list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject rule_var = (SubLObject)assertion_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)assertion_utilities.$list0);
        rule_var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)assertion_utilities.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)assertion_utilities.NIL;
        SubLObject current_$1 = (SubLObject)assertion_utilities.NIL;
        while (assertion_utilities.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)assertion_utilities.$list0);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)assertion_utilities.$list0);
            if (assertion_utilities.NIL == conses_high.member(current_$1, (SubLObject)assertion_utilities.$list1, (SubLObject)assertion_utilities.UNPROVIDED, (SubLObject)assertion_utilities.UNPROVIDED)) {
                bad = (SubLObject)assertion_utilities.T;
            }
            if (current_$1 == assertion_utilities.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (assertion_utilities.NIL != bad && assertion_utilities.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)assertion_utilities.$list0);
        }
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)assertion_utilities.$kw3$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((assertion_utilities.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : assertion_utilities.$str4$mapping_Cyc_rules);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)assertion_utilities.$kw5$DONE, current);
        final SubLObject done = (SubLObject)((assertion_utilities.NIL != done_tail) ? conses_high.cadr(done_tail) : assertion_utilities.NIL);
        final SubLObject body;
        current = (body = temp);
        if (assertion_utilities.NIL == progress_message) {
            return (SubLObject)ConsesLow.listS((SubLObject)assertion_utilities.$sym6$DO_ITERATOR, (SubLObject)ConsesLow.list(rule_var, (SubLObject)assertion_utilities.$list7, (SubLObject)assertion_utilities.$kw5$DONE, done), ConsesLow.append(body, (SubLObject)assertion_utilities.NIL));
        }
        final SubLObject message_var = (SubLObject)assertion_utilities.$sym8$MESSAGE_VAR;
        final SubLObject total = (SubLObject)assertion_utilities.$sym9$TOTAL;
        final SubLObject sofar = (SubLObject)assertion_utilities.$sym10$SOFAR;
        return (SubLObject)ConsesLow.list((SubLObject)assertion_utilities.$sym11$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(message_var, progress_message), reader.bq_cons(total, (SubLObject)assertion_utilities.$list12), reader.bq_cons(sofar, (SubLObject)assertion_utilities.$list13)), (SubLObject)ConsesLow.list((SubLObject)assertion_utilities.$sym14$NOTING_PERCENT_PROGRESS, message_var, (SubLObject)ConsesLow.listS((SubLObject)assertion_utilities.$sym15$DO_RULES, (SubLObject)ConsesLow.list(rule_var, (SubLObject)assertion_utilities.$kw3$PROGRESS_MESSAGE, (SubLObject)assertion_utilities.NIL, (SubLObject)assertion_utilities.$kw5$DONE, done), (SubLObject)ConsesLow.list((SubLObject)assertion_utilities.$sym16$CINC, sofar), (SubLObject)ConsesLow.list((SubLObject)assertion_utilities.$sym17$NOTE_PERCENT_PROGRESS, sofar, total), ConsesLow.append(body, (SubLObject)assertion_utilities.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 1994L)
    public static SubLObject do_gafs(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)assertion_utilities.$list18);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject gaf_var = (SubLObject)assertion_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)assertion_utilities.$list18);
        gaf_var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)assertion_utilities.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)assertion_utilities.NIL;
        SubLObject current_$2 = (SubLObject)assertion_utilities.NIL;
        while (assertion_utilities.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)assertion_utilities.$list18);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)assertion_utilities.$list18);
            if (assertion_utilities.NIL == conses_high.member(current_$2, (SubLObject)assertion_utilities.$list1, (SubLObject)assertion_utilities.UNPROVIDED, (SubLObject)assertion_utilities.UNPROVIDED)) {
                bad = (SubLObject)assertion_utilities.T;
            }
            if (current_$2 == assertion_utilities.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (assertion_utilities.NIL != bad && assertion_utilities.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)assertion_utilities.$list18);
        }
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)assertion_utilities.$kw3$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((assertion_utilities.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : assertion_utilities.$str19$mapping_Cyc_GAFs);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)assertion_utilities.$kw5$DONE, current);
        final SubLObject done = (SubLObject)((assertion_utilities.NIL != done_tail) ? conses_high.cadr(done_tail) : assertion_utilities.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)assertion_utilities.$sym20$DO_ASSERTIONS, (SubLObject)ConsesLow.list(gaf_var, progress_message, (SubLObject)assertion_utilities.$kw5$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)assertion_utilities.$sym21$PWHEN, (SubLObject)ConsesLow.list((SubLObject)assertion_utilities.$sym22$GAF_ASSERTION_, gaf_var), ConsesLow.append(body, (SubLObject)assertion_utilities.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 2421L)
    public static SubLObject do_assertions_backwards(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)assertion_utilities.$list23);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion_var = (SubLObject)assertion_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)assertion_utilities.$list23);
        assertion_var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)assertion_utilities.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)assertion_utilities.NIL;
        SubLObject current_$3 = (SubLObject)assertion_utilities.NIL;
        while (assertion_utilities.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)assertion_utilities.$list23);
            current_$3 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)assertion_utilities.$list23);
            if (assertion_utilities.NIL == conses_high.member(current_$3, (SubLObject)assertion_utilities.$list1, (SubLObject)assertion_utilities.UNPROVIDED, (SubLObject)assertion_utilities.UNPROVIDED)) {
                bad = (SubLObject)assertion_utilities.T;
            }
            if (current_$3 == assertion_utilities.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (assertion_utilities.NIL != bad && assertion_utilities.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)assertion_utilities.$list23);
        }
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)assertion_utilities.$kw3$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((assertion_utilities.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : assertion_utilities.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)assertion_utilities.$kw5$DONE, current);
        final SubLObject done = (SubLObject)((assertion_utilities.NIL != done_tail) ? conses_high.cadr(done_tail) : assertion_utilities.NIL);
        final SubLObject body;
        current = (body = temp);
        if (!progress_message.isAtom()) {
            final SubLObject progress_message_var = (SubLObject)assertion_utilities.$sym24$PROGRESS_MESSAGE_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)assertion_utilities.$sym11$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(progress_message_var, progress_message)), (SubLObject)ConsesLow.listS((SubLObject)assertion_utilities.$sym25$DO_ASSERTIONS_BACKWARDS, (SubLObject)ConsesLow.list(assertion_var, (SubLObject)assertion_utilities.$kw3$PROGRESS_MESSAGE, progress_message_var, (SubLObject)assertion_utilities.$kw5$DONE, done), ConsesLow.append(body, (SubLObject)assertion_utilities.NIL)));
        }
        if (assertion_utilities.NIL != progress_message) {
            final SubLObject sofar_var = (SubLObject)assertion_utilities.$sym26$SOFAR_VAR;
            final SubLObject total_var = (SubLObject)assertion_utilities.$sym27$TOTAL_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)assertion_utilities.$sym11$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(total_var, (SubLObject)assertion_utilities.$list28), reader.bq_cons(sofar_var, (SubLObject)assertion_utilities.$list13)), (SubLObject)ConsesLow.list((SubLObject)assertion_utilities.$sym14$NOTING_PERCENT_PROGRESS, progress_message, (SubLObject)ConsesLow.listS((SubLObject)assertion_utilities.$sym25$DO_ASSERTIONS_BACKWARDS, (SubLObject)ConsesLow.list(assertion_var, (SubLObject)assertion_utilities.$kw5$DONE, done), (SubLObject)ConsesLow.list((SubLObject)assertion_utilities.$sym17$NOTE_PERCENT_PROGRESS, sofar_var, total_var), (SubLObject)ConsesLow.list((SubLObject)assertion_utilities.$sym16$CINC, sofar_var), ConsesLow.append(body, (SubLObject)assertion_utilities.NIL))));
        }
        final SubLObject id_var = (SubLObject)assertion_utilities.$sym29$ID_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)assertion_utilities.$sym30$DO_NUMBERS, (SubLObject)ConsesLow.list(new SubLObject[] { id_var, assertion_utilities.$kw31$START, assertion_utilities.$list32, assertion_utilities.$kw33$END, assertion_utilities.MINUS_ONE_INTEGER, assertion_utilities.$kw34$DELTA, assertion_utilities.MINUS_ONE_INTEGER, assertion_utilities.$kw5$DONE, done }), (SubLObject)ConsesLow.list((SubLObject)assertion_utilities.$sym11$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(assertion_var, (SubLObject)ConsesLow.list((SubLObject)assertion_utilities.$sym35$FIND_ASSERTION_BY_ID, id_var))), (SubLObject)ConsesLow.listS((SubLObject)assertion_utilities.$sym21$PWHEN, assertion_var, ConsesLow.append(body, (SubLObject)assertion_utilities.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 3435L)
    public static SubLObject do_assertion_dependent_assertions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)assertion_utilities.$list36);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject dependent_assertion = (SubLObject)assertion_utilities.NIL;
        SubLObject assertion = (SubLObject)assertion_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)assertion_utilities.$list36);
        dependent_assertion = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)assertion_utilities.$list36);
        assertion = current.first();
        current = current.rest();
        if (assertion_utilities.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject deduction = (SubLObject)assertion_utilities.$sym37$DEDUCTION;
            return (SubLObject)ConsesLow.list((SubLObject)assertion_utilities.$sym38$DO_ASSERTION_DEPENDENTS, (SubLObject)ConsesLow.list(deduction, assertion), (SubLObject)ConsesLow.list((SubLObject)assertion_utilities.$sym11$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(dependent_assertion, (SubLObject)ConsesLow.list((SubLObject)assertion_utilities.$sym39$DEDUCTION_ASSERTION, deduction))), (SubLObject)ConsesLow.listS((SubLObject)assertion_utilities.$sym21$PWHEN, (SubLObject)ConsesLow.list((SubLObject)assertion_utilities.$sym40$ASSERTION_P, dependent_assertion), ConsesLow.append(body, (SubLObject)assertion_utilities.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)assertion_utilities.$list36);
        return (SubLObject)assertion_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 3754L)
    public static SubLObject do_assertion_supporting_assertions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)assertion_utilities.$list41);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject supporting_assertion = (SubLObject)assertion_utilities.NIL;
        SubLObject assertion = (SubLObject)assertion_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)assertion_utilities.$list41);
        supporting_assertion = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)assertion_utilities.$list41);
        assertion = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)assertion_utilities.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)assertion_utilities.NIL;
        SubLObject current_$4 = (SubLObject)assertion_utilities.NIL;
        while (assertion_utilities.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)assertion_utilities.$list41);
            current_$4 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)assertion_utilities.$list41);
            if (assertion_utilities.NIL == conses_high.member(current_$4, (SubLObject)assertion_utilities.$list42, (SubLObject)assertion_utilities.UNPROVIDED, (SubLObject)assertion_utilities.UNPROVIDED)) {
                bad = (SubLObject)assertion_utilities.T;
            }
            if (current_$4 == assertion_utilities.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (assertion_utilities.NIL != bad && assertion_utilities.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)assertion_utilities.$list41);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)assertion_utilities.$kw5$DONE, current);
        final SubLObject done = (SubLObject)((assertion_utilities.NIL != done_tail) ? conses_high.cadr(done_tail) : assertion_utilities.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject argument = (SubLObject)assertion_utilities.$sym43$ARGUMENT;
        return (SubLObject)ConsesLow.list((SubLObject)assertion_utilities.$sym44$DO_ASSERTION_ARGUMENTS, (SubLObject)ConsesLow.list(argument, assertion, (SubLObject)assertion_utilities.$kw5$DONE, done), (SubLObject)ConsesLow.list((SubLObject)assertion_utilities.$sym21$PWHEN, (SubLObject)ConsesLow.list((SubLObject)assertion_utilities.$sym45$DEDUCTION_P, argument), (SubLObject)ConsesLow.list((SubLObject)assertion_utilities.$sym46$DO_DEDUCTION_SUPPORTS, (SubLObject)ConsesLow.list(supporting_assertion, argument, (SubLObject)assertion_utilities.$kw5$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)assertion_utilities.$sym21$PWHEN, (SubLObject)ConsesLow.list((SubLObject)assertion_utilities.$sym40$ASSERTION_P, supporting_assertion), ConsesLow.append(body, (SubLObject)assertion_utilities.NIL)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 4136L)
    public static SubLObject assertion_list_p(final SubLObject v_object) {
        if (assertion_utilities.NIL != list_utilities.non_dotted_list_p(v_object)) {
            SubLObject cdolist_list_var = v_object;
            SubLObject subobject = (SubLObject)assertion_utilities.NIL;
            subobject = cdolist_list_var.first();
            while (assertion_utilities.NIL != cdolist_list_var) {
                if (assertion_utilities.NIL == assertion_handles.assertion_p(subobject)) {
                    return (SubLObject)assertion_utilities.NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                subobject = cdolist_list_var.first();
            }
            return (SubLObject)assertion_utilities.T;
        }
        return (SubLObject)assertion_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 4472L)
    public static SubLObject list_of_rule_assertion_p(final SubLObject v_object) {
        if (assertion_utilities.NIL != list_utilities.non_dotted_list_p(v_object)) {
            SubLObject cdolist_list_var = v_object;
            SubLObject subobject = (SubLObject)assertion_utilities.NIL;
            subobject = cdolist_list_var.first();
            while (assertion_utilities.NIL != cdolist_list_var) {
                if (assertion_utilities.NIL == assertions_high.rule_assertionP(subobject)) {
                    return (SubLObject)assertion_utilities.NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                subobject = cdolist_list_var.first();
            }
            return (SubLObject)assertion_utilities.T;
        }
        return (SubLObject)assertion_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 4727L)
    public static SubLObject assertion_dependent_assertions(final SubLObject assertion) {
        if (assertion_utilities.NIL != assertions_high.assertion_has_dependents_p(assertion)) {
            SubLObject result_set = set_contents.new_set_contents(assertions_high.assertion_dependent_count(assertion), Symbols.symbol_function((SubLObject)assertion_utilities.EQL));
            final SubLObject set_contents_var = assertions_high.assertion_dependents(assertion);
            SubLObject basis_object;
            SubLObject state;
            SubLObject deduction;
            SubLObject dependent_supported_object;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)assertion_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); assertion_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                deduction = set_contents.do_set_contents_next(basis_object, state);
                if (assertion_utilities.NIL != set_contents.do_set_contents_element_validP(state, deduction)) {
                    dependent_supported_object = deductions_high.deduction_supported_object(deduction);
                    if (assertion_utilities.NIL != assertion_handles.assertion_p(dependent_supported_object)) {
                        result_set = set_contents.set_contents_add(dependent_supported_object, result_set, Symbols.symbol_function((SubLObject)assertion_utilities.EQL));
                    }
                }
            }
            return set_contents.set_contents_element_list(result_set);
        }
        return (SubLObject)assertion_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 5374L)
    public static SubLObject remove_relevant_assertion_dependents(final SubLObject assertion, final SubLObject possibly_relevant_mt) {
        return remove_relevant_assertions_dependents((SubLObject)ConsesLow.list(assertion), possibly_relevant_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 5647L)
    public static SubLObject remove_relevant_assertions_dependents(final SubLObject assertions, final SubLObject possibly_relevant_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject checked_deduction_count = (SubLObject)assertion_utilities.ZERO_INTEGER;
        SubLObject removed_deduction_count = (SubLObject)assertion_utilities.ZERO_INTEGER;
        SubLObject checked_deductions = set_contents.new_set_contents((SubLObject)assertion_utilities.UNPROVIDED, (SubLObject)assertion_utilities.UNPROVIDED);
        SubLObject deductions_to_check = (SubLObject)assertion_utilities.NIL;
        SubLObject deductions_to_remove = (SubLObject)assertion_utilities.NIL;
        SubLObject cdolist_list_var = assertions;
        SubLObject assertion = (SubLObject)assertion_utilities.NIL;
        assertion = cdolist_list_var.first();
        while (assertion_utilities.NIL != cdolist_list_var) {
            final SubLObject set_contents_var = assertions_high.assertion_dependents(assertion);
            SubLObject basis_object;
            SubLObject state;
            SubLObject dependent;
            SubLObject item_var;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)assertion_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); assertion_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                dependent = set_contents.do_set_contents_next(basis_object, state);
                if (assertion_utilities.NIL != set_contents.do_set_contents_element_validP(state, dependent)) {
                    item_var = dependent;
                    if (assertion_utilities.NIL == conses_high.member(item_var, deductions_to_check, Symbols.symbol_function((SubLObject)assertion_utilities.EQL), Symbols.symbol_function((SubLObject)assertion_utilities.IDENTITY))) {
                        deductions_to_check = (SubLObject)ConsesLow.cons(item_var, deductions_to_check);
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        SubLObject _prev_bind_0 = utilities_macros.$percent_progress_delayed_mode_seconds$.currentBinding(thread);
        SubLObject _prev_bind_2 = utilities_macros.$percent_progress_delayed_mode_string$.currentBinding(thread);
        SubLObject _prev_bind_3 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        SubLObject _prev_bind_4 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        SubLObject _prev_bind_5 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        SubLObject _prev_bind_6 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$percent_progress_delayed_mode_seconds$.bind((SubLObject)assertion_utilities.THREE_INTEGER, thread);
            utilities_macros.$percent_progress_delayed_mode_string$.bind(Sequences.cconcatenate((SubLObject)assertion_utilities.$str47$Gathering_mt_relevant_dependents_, new SubLObject[] { format_nil.format_nil_a_no_copy(Sequences.length(assertions)), assertion_utilities.$str48$_assertions }), thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)assertion_utilities.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)assertion_utilities.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)assertion_utilities.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(Sequences.cconcatenate((SubLObject)assertion_utilities.$str47$Gathering_mt_relevant_dependents_, new SubLObject[] { format_nil.format_nil_a_no_copy(Sequences.length(assertions)), assertion_utilities.$str48$_assertions }));
                while (assertion_utilities.NIL != deductions_to_check) {
                    final SubLObject deduction = deductions_to_check.first();
                    deductions_to_check = deductions_to_check.rest();
                    if (assertion_utilities.NIL != assertion_handles.assertion_p(deductions_high.deduction_supported_object(deduction)) && assertion_utilities.NIL != sksi_infrastructure_utilities.mt_relevant_to_mt_memoizedP(deductions_high.deduction_mt(deduction), possibly_relevant_mt, (SubLObject)assertion_utilities.UNPROVIDED)) {
                        final SubLObject possible_assertion = deductions_high.deduction_supported_object(deduction);
                        SubLObject deduction_excepting_its_own_supportP = (SubLObject)assertion_utilities.NIL;
                        if (assertion_utilities.NIL != assertion_handles.assertion_p(possible_assertion) && assertion_utilities.NIL != gaf_assertion_with_pred_p(possible_assertion, assertion_utilities.$const49$except) && assertion_utilities.NIL != list_utilities.member_equalP(assertions_high.gaf_arg1(possible_assertion), deductions_high.deduction_supports(deduction))) {
                            deduction_excepting_its_own_supportP = (SubLObject)assertion_utilities.T;
                        }
                        if (assertion_utilities.NIL == deduction_excepting_its_own_supportP) {
                            deductions_to_remove = (SubLObject)ConsesLow.cons(deduction, deductions_to_remove);
                        }
                    }
                    SubLObject cdolist_list_var2 = deduction_dependent_deductions(deduction);
                    SubLObject sub_deduction = (SubLObject)assertion_utilities.NIL;
                    sub_deduction = cdolist_list_var2.first();
                    while (assertion_utilities.NIL != cdolist_list_var2) {
                        if (assertion_utilities.NIL == set_contents.set_contents_memberP(sub_deduction, checked_deductions, (SubLObject)assertion_utilities.UNPROVIDED)) {
                            deductions_to_check = (SubLObject)ConsesLow.cons(sub_deduction, deductions_to_check);
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        sub_deduction = cdolist_list_var2.first();
                    }
                    checked_deductions = set_contents.set_contents_add(deduction, checked_deductions, (SubLObject)assertion_utilities.UNPROVIDED);
                    checked_deduction_count = Numbers.add(checked_deduction_count, (SubLObject)assertion_utilities.ONE_INTEGER);
                    utilities_macros.note_percent_progress(set_contents.set_contents_size(checked_deductions), Numbers.add(set_contents.set_contents_size(checked_deductions), Sequences.length(deductions_to_check)));
                }
            }
            finally {
                final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)assertion_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_6, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_5, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_4, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_3, thread);
            utilities_macros.$percent_progress_delayed_mode_string$.rebind(_prev_bind_2, thread);
            utilities_macros.$percent_progress_delayed_mode_seconds$.rebind(_prev_bind_0, thread);
        }
        _prev_bind_0 = utilities_macros.$percent_progress_delayed_mode_seconds$.currentBinding(thread);
        _prev_bind_2 = utilities_macros.$percent_progress_delayed_mode_string$.currentBinding(thread);
        _prev_bind_3 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        _prev_bind_4 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        _prev_bind_5 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        _prev_bind_6 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$percent_progress_delayed_mode_seconds$.bind((SubLObject)assertion_utilities.THREE_INTEGER, thread);
            utilities_macros.$percent_progress_delayed_mode_string$.bind(Sequences.cconcatenate((SubLObject)assertion_utilities.$str50$Removing_, new SubLObject[] { format_nil.format_nil_a_no_copy(Sequences.length(deductions_to_remove)), assertion_utilities.$str51$_mt_relevant_dependents }), thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)assertion_utilities.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)assertion_utilities.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)assertion_utilities.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(Sequences.cconcatenate((SubLObject)assertion_utilities.$str50$Removing_, new SubLObject[] { format_nil.format_nil_a_no_copy(Sequences.length(deductions_to_remove)), assertion_utilities.$str51$_mt_relevant_dependents }));
                SubLObject cdolist_list_var3 = deductions_to_remove;
                SubLObject deduction2 = (SubLObject)assertion_utilities.NIL;
                deduction2 = cdolist_list_var3.first();
                while (assertion_utilities.NIL != cdolist_list_var3) {
                    if (assertion_utilities.NIL != deduction_handles.valid_deductionP(deduction2, (SubLObject)assertion_utilities.UNPROVIDED)) {
                        tms.tms_remove_deduction(deduction2);
                        removed_deduction_count = Numbers.add(removed_deduction_count, (SubLObject)assertion_utilities.ONE_INTEGER);
                    }
                    cdolist_list_var3 = cdolist_list_var3.rest();
                    deduction2 = cdolist_list_var3.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)assertion_utilities.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_6, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_5, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_4, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_3, thread);
            utilities_macros.$percent_progress_delayed_mode_string$.rebind(_prev_bind_2, thread);
            utilities_macros.$percent_progress_delayed_mode_seconds$.rebind(_prev_bind_0, thread);
        }
        return removed_deduction_count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 8337L)
    public static SubLObject deduction_dependent_deductions(final SubLObject deduction) {
        final SubLObject supported_object = deductions_high.deduction_supported_object(deduction);
        if (assertion_utilities.NIL != assertion_handles.assertion_p(supported_object)) {
            return assertions_high.assertion_dependent_list(supported_object);
        }
        if (assertion_utilities.NIL != kb_hl_support_handles.kb_hl_support_p(supported_object)) {
            return kb_hl_supports_interface.kb_kb_hl_support_dependents(supported_object);
        }
        if (assertion_utilities.NIL == arguments.hl_support_p(supported_object)) {
            Errors.warn((SubLObject)assertion_utilities.$str53$deduction_dependent_deductions_ca, deduction_handles.deduction_id(deduction), supported_object);
            return (SubLObject)assertion_utilities.NIL;
        }
        final SubLObject kb_hl_support = kb_hl_supports_high.find_kb_hl_support(supported_object);
        if (assertion_utilities.NIL == kb_hl_support) {
            Errors.warn((SubLObject)assertion_utilities.$str52$Deduction__A_supporting_missing_K, deduction, supported_object);
            return (SubLObject)assertion_utilities.NIL;
        }
        return kb_hl_supports_interface.kb_kb_hl_support_dependents(kb_hl_support);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 9183L)
    public static SubLObject assertion_dependent_supported_object_counts(final SubLObject assertion) {
        if (assertion_utilities.NIL != assertions_high.assertion_has_dependents_p(assertion)) {
            SubLObject assertion_set = set_contents.new_set_contents((SubLObject)assertion_utilities.ZERO_INTEGER, Symbols.symbol_function((SubLObject)assertion_utilities.EQL));
            SubLObject kb_hl_support_set = set_contents.new_set_contents((SubLObject)assertion_utilities.ZERO_INTEGER, Symbols.symbol_function((SubLObject)assertion_utilities.EQUAL));
            SubLObject clause_struct_set = set_contents.new_set_contents((SubLObject)assertion_utilities.ZERO_INTEGER, Symbols.symbol_function((SubLObject)assertion_utilities.EQL));
            final SubLObject set_contents_var = assertions_high.assertion_dependents(assertion);
            SubLObject basis_object;
            SubLObject state;
            SubLObject deduction;
            SubLObject dependent_supported_object;
            SubLObject clause_struct;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)assertion_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); assertion_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                deduction = set_contents.do_set_contents_next(basis_object, state);
                if (assertion_utilities.NIL != set_contents.do_set_contents_element_validP(state, deduction)) {
                    dependent_supported_object = deductions_high.deduction_supported_object(deduction);
                    if (assertion_utilities.NIL != assertion_handles.assertion_p(dependent_supported_object)) {
                        assertion_set = set_contents.set_contents_add(dependent_supported_object, assertion_set, Symbols.symbol_function((SubLObject)assertion_utilities.EQL));
                        clause_struct = assertions_low.assertion_clause_struc(dependent_supported_object);
                        if (assertion_utilities.NIL != clause_struct) {
                            clause_struct_set = set_contents.set_contents_add(clause_struct, clause_struct_set, (SubLObject)assertion_utilities.UNPROVIDED);
                        }
                        else {
                            clause_struct_set = set_contents.set_contents_add(dependent_supported_object, clause_struct_set, (SubLObject)assertion_utilities.UNPROVIDED);
                        }
                    }
                    else if (assertion_utilities.NIL != kb_hl_support_handles.kb_hl_support_p(dependent_supported_object)) {
                        kb_hl_support_set = set_contents.set_contents_add(dependent_supported_object, kb_hl_support_set, Symbols.symbol_function((SubLObject)assertion_utilities.EQUAL));
                    }
                    else if (assertion_utilities.NIL != arguments.hl_support_p(dependent_supported_object)) {
                        kb_hl_support_set = set_contents.set_contents_add(dependent_supported_object, kb_hl_support_set, Symbols.symbol_function((SubLObject)assertion_utilities.EQUAL));
                    }
                }
            }
            return Values.values(set_contents.set_contents_size(assertion_set), set_contents.set_contents_size(kb_hl_support_set), set_contents.set_contents_size(clause_struct_set));
        }
        return Values.values((SubLObject)assertion_utilities.ZERO_INTEGER, (SubLObject)assertion_utilities.ZERO_INTEGER, (SubLObject)assertion_utilities.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 10990L)
    public static SubLObject true_assertionP(final SubLObject assertion) {
        return (SubLObject)SubLObjectFactory.makeBoolean(assertion_utilities.NIL != assertion_handles.assertion_p(assertion) && assertion_utilities.NIL != assertions_high.assertion_has_truthP(assertion, (SubLObject)assertion_utilities.$kw54$TRUE));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 11119L)
    public static SubLObject false_assertionP(final SubLObject assertion) {
        return (SubLObject)SubLObjectFactory.makeBoolean(assertion_utilities.NIL != assertion_handles.assertion_p(assertion) && assertion_utilities.NIL != assertions_high.assertion_has_truthP(assertion, (SubLObject)assertion_utilities.$kw55$FALSE));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 11250L)
    public static SubLObject unknown_assertionP(final SubLObject assertion) {
        return (SubLObject)SubLObjectFactory.makeBoolean(assertion_utilities.NIL != assertion_handles.assertion_p(assertion) && assertion_utilities.NIL != assertions_high.assertion_has_truthP(assertion, (SubLObject)assertion_utilities.$kw56$UNKNOWN));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 11385L)
    public static SubLObject true_gaf_assertionP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(assertion_utilities.NIL != assertions_high.gaf_assertionP(v_object) && assertion_utilities.NIL != true_assertionP(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 11501L)
    public static SubLObject false_gaf_assertionP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(assertion_utilities.NIL != assertions_high.gaf_assertionP(v_object) && assertion_utilities.NIL != false_assertionP(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 11619L)
    public static SubLObject nl_semantic_assertionP(final SubLObject assertion) {
        return (SubLObject)SubLObjectFactory.makeBoolean(assertion_utilities.NIL != assertion_handles.assertion_p(assertion) && assertion_utilities.NIL != isa.isa_in_any_mtP(cycl_utilities.formula_operator(assertions_high.assertion_formula(assertion)), assertion_utilities.$const57$NLSemanticPredicate));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 11890L)
    public static SubLObject obsolete_ruleP(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)assertion_utilities.$sym58$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(assertion_utilities.$const59$EverythingPSC, thread);
            return Numbers.numG(kb_indexing.num_gaf_arg_index(assertion, (SubLObject)assertion_utilities.ONE_INTEGER, assertion_utilities.$const61$obsoleteRule, (SubLObject)assertion_utilities.UNPROVIDED), (SubLObject)assertion_utilities.ZERO_INTEGER);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 12014L)
    public static SubLObject assertion_matches_typeP(final SubLObject assertion, final SubLObject type_spec) {
        return (SubLObject)SubLObjectFactory.makeBoolean(assertion_utilities.NIL == type_spec || assertion_utilities.NIL != assertions_high.assertion_has_typeP(assertion, type_spec));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 12155L)
    public static SubLObject assertion_matches_truthP(final SubLObject assertion, final SubLObject truth_spec) {
        return (SubLObject)SubLObjectFactory.makeBoolean(assertion_utilities.NIL == truth_spec || assertion_utilities.NIL != assertions_high.assertion_has_truth(assertion, truth_spec));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 12300L)
    public static SubLObject assertion_matches_directionP(final SubLObject assertion, final SubLObject direction_spec) {
        return (SubLObject)SubLObjectFactory.makeBoolean(assertion_utilities.NIL == direction_spec || assertion_utilities.NIL != assertions_high.assertion_has_direction(assertion, direction_spec));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 12465L)
    public static SubLObject assertion_matches_truth_and_directionP(final SubLObject assertion, final SubLObject truth_spec, final SubLObject direction_spec) {
        return (SubLObject)SubLObjectFactory.makeBoolean(assertion_utilities.NIL != assertion_matches_truthP(assertion, truth_spec) && assertion_utilities.NIL != assertion_matches_directionP(assertion, direction_spec));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 12684L)
    public static SubLObject assertion_matches_type_truth_and_directionP(final SubLObject assertion, final SubLObject type_spec, final SubLObject truth_spec, final SubLObject direction_spec) {
        return (SubLObject)SubLObjectFactory.makeBoolean(assertion_utilities.NIL != assertion_matches_typeP(assertion, type_spec) && assertion_utilities.NIL != assertion_matches_truthP(assertion, truth_spec) && assertion_utilities.NIL != assertion_matches_directionP(assertion, direction_spec));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 12970L)
    public static SubLObject gaf_has_term_in_argnumP(final SubLObject assertion, final SubLObject v_term, final SubLObject argnum) {
        final SubLObject arg = assertions_high.gaf_arg(assertion, argnum);
        return Equality.equal(v_term, arg);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 13106L)
    public static SubLObject gaf_has_term_in_some_argnumP(final SubLObject assertion, final SubLObject v_term) {
        return el_utilities.term_is_one_of_argsP(v_term, assertions_high.gaf_formula(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 13313L)
    public static SubLObject true_gaf_assertion_with_pred_p(final SubLObject assertion, final SubLObject pred) {
        return (SubLObject)SubLObjectFactory.makeBoolean(assertion_utilities.NIL != true_assertionP(assertion) && pred.eql(assertions_high.gaf_predicate(assertion)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 13700L)
    public static SubLObject gaf_assertion_with_pred_p(final SubLObject assertion, final SubLObject pred) {
        return (SubLObject)SubLObjectFactory.makeBoolean(assertion_utilities.NIL != assertions_high.gaf_assertionP(assertion) && pred.eql(assertions_high.gaf_predicate(assertion)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 14021L)
    public static SubLObject gaf_assertion_has_pred_p(final SubLObject gaf_assertion, final SubLObject pred) {
        return Equality.eql(pred, assertions_high.gaf_predicate(gaf_assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 14279L)
    public static SubLObject gaf_assertion_with_any_of_preds_p(final SubLObject assertion, final SubLObject pred_list) {
        if (assertion_utilities.NIL != assertions_high.gaf_assertionP(assertion)) {
            return subl_promotions.memberP(assertions_high.gaf_predicate(assertion), pred_list, (SubLObject)assertion_utilities.UNPROVIDED, (SubLObject)assertion_utilities.UNPROVIDED);
        }
        return (SubLObject)assertion_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 14589L)
    public static SubLObject isa_gaf_p(final SubLObject assertion) {
        return gaf_assertion_with_pred_p(assertion, assertion_utilities.$const62$isa);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 15130L)
    public static SubLObject genls_gaf_p(final SubLObject assertion) {
        return gaf_assertion_with_pred_p(assertion, assertion_utilities.$const63$genls);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 15297L)
    public static SubLObject assertion_cnf_with_el_vars_only(final SubLObject assertion) {
        return cycl_utilities.cnf_sublis_el_variables(assertions_high.assertion_cnf(assertion), assertions_high.assertion_el_variables(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 15546L)
    public static SubLObject except_when_rule_p(final SubLObject v_object) {
        if (assertion_utilities.NIL != assertions_high.rule_assertionP(v_object)) {
            SubLObject cdolist_list_var = clauses.pos_lits(assertions_high.assertion_cnf(v_object));
            SubLObject pos_lit = (SubLObject)assertion_utilities.NIL;
            pos_lit = cdolist_list_var.first();
            while (assertion_utilities.NIL != cdolist_list_var) {
                if (assertion_utilities.NIL != el_utilities.el_abnormal_p(pos_lit)) {
                    return (SubLObject)assertion_utilities.T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                pos_lit = cdolist_list_var.first();
            }
        }
        return (SubLObject)assertion_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 15876L)
    public static SubLObject except_for_gaf_p(final SubLObject v_object) {
        if (assertion_utilities.NIL != assertions_high.gaf_assertionP(v_object) && assertion_utilities.NIL != el_utilities.el_abnormal_p(assertions_high.gaf_formula(v_object))) {
            return (SubLObject)assertion_utilities.T;
        }
        return (SubLObject)assertion_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 16172L)
    public static SubLObject abnormal_assertion_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(assertion_utilities.NIL != except_when_rule_p(v_object) || assertion_utilities.NIL != except_for_gaf_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 16292L)
    public static SubLObject abnormal_literal_from_assertion(final SubLObject assertion) {
        assert assertion_utilities.NIL != abnormal_assertion_p(assertion) : assertion;
        if (assertion_utilities.NIL != except_for_gaf_p(assertion)) {
            return clause_utilities.gaf_cnf_literal(assertions_high.assertion_cnf(assertion));
        }
        SubLObject cdolist_list_var = clauses.pos_lits(assertions_high.assertion_cnf(assertion));
        SubLObject pos_lit = (SubLObject)assertion_utilities.NIL;
        pos_lit = cdolist_list_var.first();
        while (assertion_utilities.NIL != cdolist_list_var) {
            if (assertion_utilities.NIL != el_utilities.el_abnormal_p(pos_lit)) {
                return pos_lit;
            }
            cdolist_list_var = cdolist_list_var.rest();
            pos_lit = cdolist_list_var.first();
        }
        return (SubLObject)assertion_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 16652L)
    public static SubLObject somewhere_excepted_assertionP(final SubLObject assertion, SubLObject justifyP) {
        if (justifyP == assertion_utilities.UNPROVIDED) {
            justifyP = (SubLObject)assertion_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)assertion_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)assertion_utilities.$sym58$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(assertion_utilities.$const59$EverythingPSC, thread);
            result = excepted_assertionP_int(assertion, (SubLObject)assertion_utilities.NIL, justifyP, (SubLObject)assertion_utilities.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 17018L)
    public static SubLObject excepted_assertionP(final SubLObject assertion, SubLObject justifyP, SubLObject depth) {
        if (justifyP == assertion_utilities.UNPROVIDED) {
            justifyP = (SubLObject)assertion_utilities.NIL;
        }
        if (depth == assertion_utilities.UNPROVIDED) {
            depth = assertion_utilities.$excepted_assertion_max_depth$.getDynamicValue();
        }
        if (assertion_utilities.NIL != mt_relevance_macros.any_or_all_mts_are_relevantP()) {
            return (SubLObject)assertion_utilities.NIL;
        }
        return excepted_assertionP_int(assertion, (SubLObject)assertion_utilities.NIL, justifyP, depth);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 17455L)
    public static SubLObject excepted_assertion_in_any_mtP(final SubLObject assertion, SubLObject justifyP, SubLObject depth) {
        if (justifyP == assertion_utilities.UNPROVIDED) {
            justifyP = (SubLObject)assertion_utilities.NIL;
        }
        if (depth == assertion_utilities.UNPROVIDED) {
            depth = assertion_utilities.$excepted_assertion_max_depth$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)assertion_utilities.$sym58$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(assertion_utilities.$const59$EverythingPSC, thread);
            return excepted_assertionP_int(assertion, (SubLObject)assertion_utilities.NIL, justifyP, depth);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 17654L)
    public static SubLObject excepted_assertionP_int(final SubLObject assertion, SubLObject checked_assertions, SubLObject justifyP, SubLObject depth) {
        if (checked_assertions == assertion_utilities.UNPROVIDED) {
            checked_assertions = (SubLObject)assertion_utilities.NIL;
        }
        if (justifyP == assertion_utilities.UNPROVIDED) {
            justifyP = (SubLObject)assertion_utilities.NIL;
        }
        if (depth == assertion_utilities.UNPROVIDED) {
            depth = (SubLObject)assertion_utilities.NIL;
        }
        assert assertion_utilities.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (depth.isInteger() && depth.numLE((SubLObject)assertion_utilities.ZERO_INTEGER)) {
            return (SubLObject)assertion_utilities.NIL;
        }
        if (assertion_utilities.NIL == assertion_handles.valid_assertionP(assertion, (SubLObject)assertion_utilities.UNPROVIDED)) {
            return (SubLObject)assertion_utilities.NIL;
        }
        if (assertion_utilities.NIL == checked_assertions) {
            checked_assertions = set.new_set(Symbols.symbol_function((SubLObject)assertion_utilities.EQL), (SubLObject)assertion_utilities.ZERO_INTEGER);
        }
        if (assertion_utilities.NIL != set.set_memberP(assertion, checked_assertions)) {
            return (SubLObject)assertion_utilities.NIL;
        }
        set.set_add(assertion, checked_assertions);
        SubLObject excepted_assertionP = (SubLObject)assertion_utilities.NIL;
        SubLObject justification = (SubLObject)assertion_utilities.NIL;
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        if (assertion_utilities.NIL != forts.fort_p(mt) && assertion_utilities.NIL != somewhere_cache.some_pred_assertion_somewhereP(assertion_utilities.$const65$exceptMt, mt, (SubLObject)assertion_utilities.ONE_INTEGER, (SubLObject)assertion_utilities.UNPROVIDED)) {
            final SubLObject exceptions = kb_mapping_utilities.pred_value_gafs(mt, assertion_utilities.$const65$exceptMt, (SubLObject)assertion_utilities.ONE_INTEGER, (SubLObject)assertion_utilities.UNPROVIDED);
            if (assertion_utilities.NIL == excepted_assertionP) {
                SubLObject csome_list_var = exceptions;
                SubLObject exception = (SubLObject)assertion_utilities.NIL;
                exception = csome_list_var.first();
                while (assertion_utilities.NIL == excepted_assertionP && assertion_utilities.NIL != csome_list_var) {
                    if (assertion_utilities.NIL == excepted_assertionP_int(exception, checked_assertions, (SubLObject)assertion_utilities.NIL, (SubLObject)(depth.isInteger() ? Numbers.subtract(depth, (SubLObject)assertion_utilities.ONE_INTEGER) : assertion_utilities.NIL))) {
                        excepted_assertionP = (SubLObject)assertion_utilities.T;
                        final SubLObject item_var = exception;
                        if (assertion_utilities.NIL == conses_high.member(item_var, justification, Symbols.symbol_function((SubLObject)assertion_utilities.EQL), Symbols.symbol_function((SubLObject)assertion_utilities.IDENTITY))) {
                            justification = (SubLObject)ConsesLow.cons(item_var, justification);
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    exception = csome_list_var.first();
                }
            }
        }
        if (assertion_utilities.NIL == excepted_assertionP && assertion_utilities.NIL != somewhere_cache.some_pred_assertion_somewhereP(assertion_utilities.$const49$except, assertion, (SubLObject)assertion_utilities.ONE_INTEGER, (SubLObject)assertion_utilities.UNPROVIDED)) {
            final SubLObject exceptions = kb_mapping_utilities.pred_value_gafs(assertion, assertion_utilities.$const49$except, (SubLObject)assertion_utilities.ONE_INTEGER, (SubLObject)assertion_utilities.UNPROVIDED);
            if (assertion_utilities.NIL == excepted_assertionP) {
                SubLObject csome_list_var = exceptions;
                SubLObject exception = (SubLObject)assertion_utilities.NIL;
                exception = csome_list_var.first();
                while (assertion_utilities.NIL == excepted_assertionP && assertion_utilities.NIL != csome_list_var) {
                    if (assertion_utilities.NIL == excepted_assertionP_int(exception, checked_assertions, (SubLObject)assertion_utilities.NIL, (SubLObject)(depth.isInteger() ? Numbers.subtract(depth, (SubLObject)assertion_utilities.ONE_INTEGER) : assertion_utilities.NIL))) {
                        excepted_assertionP = (SubLObject)assertion_utilities.T;
                        final SubLObject item_var = exception;
                        if (assertion_utilities.NIL == conses_high.member(item_var, justification, Symbols.symbol_function((SubLObject)assertion_utilities.EQL), Symbols.symbol_function((SubLObject)assertion_utilities.IDENTITY))) {
                            justification = (SubLObject)ConsesLow.cons(item_var, justification);
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    exception = csome_list_var.first();
                }
            }
        }
        if (assertion_utilities.NIL == excepted_assertionP) {
            SubLObject non_excepted_support_foundP = (SubLObject)assertion_utilities.NIL;
            SubLObject some_excepted_support_justification = (SubLObject)assertion_utilities.NIL;
            SubLObject rest;
            SubLObject argument;
            SubLObject excepted_support_foundP;
            SubLObject rest_$7;
            SubLObject support;
            SubLObject excepted_supportP;
            for (rest = (SubLObject)assertion_utilities.NIL, rest = assertions_high.assertion_arguments(assertion); assertion_utilities.NIL == non_excepted_support_foundP && assertion_utilities.NIL != rest; rest = rest.rest()) {
                argument = rest.first();
                if (assertion_utilities.NIL != arguments.asserted_argument_p(argument)) {
                    non_excepted_support_foundP = (SubLObject)assertion_utilities.T;
                }
                else {
                    for (excepted_support_foundP = (SubLObject)assertion_utilities.NIL, rest_$7 = (SubLObject)assertion_utilities.NIL, rest_$7 = deductions_high.deduction_supports(argument); assertion_utilities.NIL == excepted_support_foundP && assertion_utilities.NIL != rest_$7; rest_$7 = rest_$7.rest()) {
                        support = rest_$7.first();
                        if (assertion_utilities.NIL != assertion_handles.assertion_p(support)) {
                            excepted_supportP = excepted_assertionP_int(support, checked_assertions, justifyP, (SubLObject)(depth.isInteger() ? Numbers.subtract(depth, (SubLObject)assertion_utilities.ONE_INTEGER) : assertion_utilities.NIL));
                            if (assertion_utilities.NIL != excepted_supportP) {
                                excepted_support_foundP = (SubLObject)assertion_utilities.T;
                                some_excepted_support_justification = excepted_supportP;
                            }
                        }
                    }
                    if (assertion_utilities.NIL == excepted_support_foundP) {
                        non_excepted_support_foundP = (SubLObject)assertion_utilities.T;
                    }
                }
            }
            excepted_assertionP = (SubLObject)SubLObjectFactory.makeBoolean(assertion_utilities.NIL == non_excepted_support_foundP && assertion_utilities.NIL != some_excepted_support_justification);
            if (assertion_utilities.NIL != excepted_assertionP && assertion_utilities.NIL != justifyP) {
                justification = some_excepted_support_justification;
            }
        }
        return (assertion_utilities.NIL != justifyP) ? justification : excepted_assertionP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 20446L)
    public static SubLObject excepted_assertion_in_mtP(final SubLObject assertion, final SubLObject mt, SubLObject justifyP, SubLObject depth) {
        if (justifyP == assertion_utilities.UNPROVIDED) {
            justifyP = (SubLObject)assertion_utilities.NIL;
        }
        if (depth == assertion_utilities.UNPROVIDED) {
            depth = (SubLObject)assertion_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)assertion_utilities.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = excepted_assertionP(assertion, justifyP, depth);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 20736L)
    public static SubLObject excepted_assertion_in_mtP_shallow(final SubLObject assertion, final SubLObject mt, SubLObject justifyP) {
        if (justifyP == assertion_utilities.UNPROVIDED) {
            justifyP = (SubLObject)assertion_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)assertion_utilities.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = excepted_assertionP(assertion, justifyP, assertion_utilities.$excepted_assertion_shallow_max_depth$.getDynamicValue(thread));
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 21217L)
    public static SubLObject doomed_assertionP(final SubLObject assertion, SubLObject justifyP, SubLObject depth) {
        if (justifyP == assertion_utilities.UNPROVIDED) {
            justifyP = (SubLObject)assertion_utilities.NIL;
        }
        if (depth == assertion_utilities.UNPROVIDED) {
            depth = assertion_utilities.$doomed_assertion_max_depth$.getDynamicValue();
        }
        if (assertion_utilities.NIL != mt_relevance_macros.any_or_all_mts_are_relevantP()) {
            return (SubLObject)assertion_utilities.NIL;
        }
        return doomed_assertionP_int(assertion, (SubLObject)assertion_utilities.NIL, justifyP, depth);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 21648L)
    public static SubLObject doomed_assertionP_int(final SubLObject assertion, SubLObject checked_assertions, SubLObject justifyP, SubLObject depth) {
        if (checked_assertions == assertion_utilities.UNPROVIDED) {
            checked_assertions = (SubLObject)assertion_utilities.NIL;
        }
        if (justifyP == assertion_utilities.UNPROVIDED) {
            justifyP = (SubLObject)assertion_utilities.NIL;
        }
        if (depth == assertion_utilities.UNPROVIDED) {
            depth = (SubLObject)assertion_utilities.NIL;
        }
        assert assertion_utilities.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (depth.isInteger() && depth.numLE((SubLObject)assertion_utilities.ZERO_INTEGER)) {
            return (SubLObject)assertion_utilities.NIL;
        }
        if (assertion_utilities.NIL == assertion_handles.valid_assertionP(assertion, (SubLObject)assertion_utilities.UNPROVIDED)) {
            return (SubLObject)assertion_utilities.NIL;
        }
        if (assertion_utilities.NIL == checked_assertions) {
            checked_assertions = set.new_set(Symbols.symbol_function((SubLObject)assertion_utilities.EQL), (SubLObject)assertion_utilities.ZERO_INTEGER);
        }
        if (assertion_utilities.NIL != set.set_memberP(assertion, checked_assertions)) {
            return (SubLObject)assertion_utilities.NIL;
        }
        set.set_add(assertion, checked_assertions);
        SubLObject doomed_assertionP = (SubLObject)assertion_utilities.NIL;
        SubLObject justification = (SubLObject)assertion_utilities.NIL;
        if (assertion_utilities.NIL == doomed_assertionP && assertion_utilities.NIL == assertions_high.assertion_arguments(assertion)) {
            doomed_assertionP = (SubLObject)assertion_utilities.T;
            if (assertion_utilities.NIL == conses_high.member(assertion, justification, Symbols.symbol_function((SubLObject)assertion_utilities.EQL), Symbols.symbol_function((SubLObject)assertion_utilities.IDENTITY))) {
                justification = (SubLObject)ConsesLow.cons(assertion, justification);
            }
        }
        if (assertion_utilities.NIL == doomed_assertionP && assertion_utilities.NIL == doomed_assertionP) {
            SubLObject csome_list_var = cycl_utilities.expression_gather(assertions_high.assertion_cnf(assertion), (SubLObject)assertion_utilities.$sym40$ASSERTION_P, (SubLObject)assertion_utilities.UNPROVIDED, (SubLObject)assertion_utilities.UNPROVIDED, (SubLObject)assertion_utilities.UNPROVIDED, (SubLObject)assertion_utilities.UNPROVIDED);
            SubLObject sub_assertion = (SubLObject)assertion_utilities.NIL;
            sub_assertion = csome_list_var.first();
            while (assertion_utilities.NIL == doomed_assertionP && assertion_utilities.NIL != csome_list_var) {
                final SubLObject doomed_supportP = doomed_assertionP_int(sub_assertion, checked_assertions, justifyP, (SubLObject)(depth.isInteger() ? Numbers.subtract(depth, (SubLObject)assertion_utilities.ONE_INTEGER) : assertion_utilities.NIL));
                if (assertion_utilities.NIL != doomed_supportP) {
                    doomed_assertionP = (SubLObject)assertion_utilities.T;
                    final SubLObject item_var = sub_assertion;
                    if (assertion_utilities.NIL == conses_high.member(item_var, justification, Symbols.symbol_function((SubLObject)assertion_utilities.EQL), Symbols.symbol_function((SubLObject)assertion_utilities.IDENTITY))) {
                        justification = (SubLObject)ConsesLow.cons(item_var, justification);
                    }
                }
                csome_list_var = csome_list_var.rest();
                sub_assertion = csome_list_var.first();
            }
        }
        if (assertion_utilities.NIL == doomed_assertionP) {
            SubLObject non_doomed_support_foundP = (SubLObject)assertion_utilities.NIL;
            SubLObject some_doomed_support_justification = (SubLObject)assertion_utilities.NIL;
            SubLObject rest;
            SubLObject argument;
            SubLObject doomed_support_foundP;
            SubLObject rest_$8;
            SubLObject support;
            SubLObject doomed_supportP2;
            for (rest = (SubLObject)assertion_utilities.NIL, rest = assertions_high.assertion_arguments(assertion); assertion_utilities.NIL == non_doomed_support_foundP && assertion_utilities.NIL != rest; rest = rest.rest()) {
                argument = rest.first();
                if (assertion_utilities.NIL != arguments.asserted_argument_p(argument)) {
                    non_doomed_support_foundP = (SubLObject)assertion_utilities.T;
                }
                else {
                    for (doomed_support_foundP = (SubLObject)assertion_utilities.NIL, rest_$8 = (SubLObject)assertion_utilities.NIL, rest_$8 = deductions_high.deduction_supports(argument); assertion_utilities.NIL == doomed_support_foundP && assertion_utilities.NIL != rest_$8; rest_$8 = rest_$8.rest()) {
                        support = rest_$8.first();
                        if (assertion_utilities.NIL != assertion_handles.assertion_p(support)) {
                            doomed_supportP2 = doomed_assertionP_int(support, checked_assertions, justifyP, (SubLObject)(depth.isInteger() ? Numbers.subtract(depth, (SubLObject)assertion_utilities.ONE_INTEGER) : assertion_utilities.NIL));
                            if (assertion_utilities.NIL != doomed_supportP2) {
                                doomed_support_foundP = (SubLObject)assertion_utilities.T;
                                some_doomed_support_justification = doomed_supportP2;
                            }
                        }
                    }
                    if (assertion_utilities.NIL == doomed_support_foundP) {
                        non_doomed_support_foundP = (SubLObject)assertion_utilities.T;
                    }
                }
            }
            doomed_assertionP = (SubLObject)SubLObjectFactory.makeBoolean(assertion_utilities.NIL == non_doomed_support_foundP && assertion_utilities.NIL != some_doomed_support_justification);
            if (assertion_utilities.NIL != doomed_assertionP && assertion_utilities.NIL != justifyP) {
                justification = some_doomed_support_justification;
            }
        }
        return (assertion_utilities.NIL != justifyP) ? justification : doomed_assertionP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 23974L)
    public static SubLObject assertion_matches_mtP(final SubLObject assertion) {
        return mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 24155L)
    public static SubLObject assertion_has_argumentsP(final SubLObject assertion) {
        return list_utilities.sublisp_boolean(assertions_high.assertion_arguments(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 24358L)
    public static SubLObject assertion_argument_count(final SubLObject assertion) {
        return Sequences.length(assertions_high.assertion_arguments(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 24461L)
    public static SubLObject assertion_has_deduction_with_supportP(final SubLObject assertion, final SubLObject support) {
        assert assertion_utilities.NIL != assertion_handles.assertion_p(assertion) : assertion;
        assert assertion_utilities.NIL != arguments.support_p(support) : support;
        SubLObject cdolist_list_var = assertions_high.assertion_arguments(assertion);
        SubLObject deduction = (SubLObject)assertion_utilities.NIL;
        deduction = cdolist_list_var.first();
        while (assertion_utilities.NIL != cdolist_list_var) {
            if (assertion_utilities.NIL != deduction_handles.deduction_p(deduction)) {
                SubLObject cdolist_list_var_$9 = deductions_high.deduction_supports(deduction);
                SubLObject deduction_support = (SubLObject)assertion_utilities.NIL;
                deduction_support = cdolist_list_var_$9.first();
                while (assertion_utilities.NIL != cdolist_list_var_$9) {
                    if (assertion_utilities.NIL != arguments.support_equal(deduction_support, support)) {
                        return (SubLObject)assertion_utilities.T;
                    }
                    cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                    deduction_support = cdolist_list_var_$9.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            deduction = cdolist_list_var.first();
        }
        return (SubLObject)assertion_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 24903L)
    public static SubLObject assertion_has_dependent_with_supportP(final SubLObject assertion, final SubLObject support) {
        assert assertion_utilities.NIL != assertion_handles.assertion_p(assertion) : assertion;
        assert assertion_utilities.NIL != arguments.support_p(support) : support;
        final SubLObject set_contents_var = assertions_high.assertion_dependents(assertion);
        SubLObject basis_object;
        SubLObject state;
        SubLObject deduction;
        SubLObject cdolist_list_var;
        SubLObject deduction_support;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)assertion_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); assertion_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            deduction = set_contents.do_set_contents_next(basis_object, state);
            if (assertion_utilities.NIL != set_contents.do_set_contents_element_validP(state, deduction)) {
                cdolist_list_var = deductions_high.deduction_supports(deduction);
                deduction_support = (SubLObject)assertion_utilities.NIL;
                deduction_support = cdolist_list_var.first();
                while (assertion_utilities.NIL != cdolist_list_var) {
                    if (assertion_utilities.NIL != arguments.support_equal(deduction_support, support)) {
                        return (SubLObject)assertion_utilities.T;
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    deduction_support = cdolist_list_var.first();
                }
            }
        }
        return (SubLObject)assertion_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 25351L)
    public static SubLObject assertion_has_dependent_with_supportP_kb_hl_support_aware_version(final SubLObject assertion, final SubLObject support) {
        assert assertion_utilities.NIL != assertion_handles.assertion_p(assertion) : assertion;
        assert assertion_utilities.NIL != arguments.support_p(support) : support;
        SubLObject deductions_to_check = (SubLObject)assertion_utilities.NIL;
        final SubLObject set_contents_var = assertions_high.assertion_dependents(assertion);
        SubLObject basis_object;
        SubLObject state;
        SubLObject deduction;
        SubLObject supported_object;
        SubLObject item_var;
        SubLObject cdolist_list_var;
        SubLObject dependent_deduction;
        SubLObject item_var2;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)assertion_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); assertion_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            deduction = set_contents.do_set_contents_next(basis_object, state);
            if (assertion_utilities.NIL != set_contents.do_set_contents_element_validP(state, deduction)) {
                supported_object = deductions_high.deduction_supported_object(deduction);
                if (assertion_utilities.NIL != assertion_handles.assertion_p(supported_object)) {
                    item_var = deduction;
                    if (assertion_utilities.NIL == conses_high.member(item_var, deductions_to_check, Symbols.symbol_function((SubLObject)assertion_utilities.EQL), Symbols.symbol_function((SubLObject)assertion_utilities.IDENTITY))) {
                        deductions_to_check = (SubLObject)ConsesLow.cons(item_var, deductions_to_check);
                    }
                }
                else {
                    cdolist_list_var = deduction_dependent_deductions(deduction);
                    dependent_deduction = (SubLObject)assertion_utilities.NIL;
                    dependent_deduction = cdolist_list_var.first();
                    while (assertion_utilities.NIL != cdolist_list_var) {
                        item_var2 = dependent_deduction;
                        if (assertion_utilities.NIL == conses_high.member(item_var2, deductions_to_check, Symbols.symbol_function((SubLObject)assertion_utilities.EQL), Symbols.symbol_function((SubLObject)assertion_utilities.IDENTITY))) {
                            deductions_to_check = (SubLObject)ConsesLow.cons(item_var2, deductions_to_check);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        dependent_deduction = cdolist_list_var.first();
                    }
                }
            }
        }
        SubLObject cdolist_list_var2 = deductions_to_check;
        SubLObject deduction_to_check = (SubLObject)assertion_utilities.NIL;
        deduction_to_check = cdolist_list_var2.first();
        while (assertion_utilities.NIL != cdolist_list_var2) {
            SubLObject cdolist_list_var_$10 = deductions_high.deduction_supports(deduction_to_check);
            SubLObject deduction_support = (SubLObject)assertion_utilities.NIL;
            deduction_support = cdolist_list_var_$10.first();
            while (assertion_utilities.NIL != cdolist_list_var_$10) {
                if (assertion_utilities.NIL != arguments.support_equal(deduction_support, support)) {
                    return (SubLObject)assertion_utilities.T;
                }
                cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                deduction_support = cdolist_list_var_$10.first();
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            deduction_to_check = cdolist_list_var2.first();
        }
        return (SubLObject)assertion_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 26376L)
    public static SubLObject assertion_mentions_asserted_more_specificallyP(final SubLObject assertion) {
        return (SubLObject)SubLObjectFactory.makeBoolean(assertion_utilities.NIL != assertion_handles.assertion_p(assertion) && assertion_utilities.NIL != cycl_utilities.assertion_find(assertion_utilities.$const67$assertedMoreSpecifically, assertion, (SubLObject)assertion_utilities.NIL, (SubLObject)assertion_utilities.UNPROVIDED, (SubLObject)assertion_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 26873L)
    public static SubLObject assertion_mentions_any_of_termsP(final SubLObject assertion, final SubLObject terms) {
        if (assertion_utilities.NIL != list_utilities.lengthG(terms, assertion_utilities.$assertion_mentions_any_of_terms_set_watermark$.getGlobalValue(), (SubLObject)assertion_utilities.UNPROVIDED)) {
            final SubLObject term_set = set_utilities.construct_set_from_list(terms, Symbols.symbol_function((SubLObject)assertion_utilities.EQUAL), (SubLObject)assertion_utilities.UNPROVIDED);
            return assertion_mentions_any_of_terms_in_setP(assertion, term_set);
        }
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = (SubLObject)assertion_utilities.NIL;
        v_term = cdolist_list_var.first();
        while (assertion_utilities.NIL != cdolist_list_var) {
            if (assertion_utilities.NIL != assertions_high.assertion_mentions_termP(assertion, v_term)) {
                return (SubLObject)assertion_utilities.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        }
        return (SubLObject)assertion_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 27587L)
    public static SubLObject assertion_mentions_any_of_terms_in_set_lambda(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return set.set_memberP(v_object, assertion_utilities.$assertion_mentions_any_of_terms_set_lambda$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 27734L)
    public static SubLObject assertion_mentions_any_of_terms_in_setP(final SubLObject assertion, final SubLObject term_set) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject resultP = (SubLObject)assertion_utilities.NIL;
        final SubLObject _prev_bind_0 = assertion_utilities.$assertion_mentions_any_of_terms_set_lambda$.currentBinding(thread);
        try {
            assertion_utilities.$assertion_mentions_any_of_terms_set_lambda$.bind(term_set, thread);
            resultP = list_utilities.sublisp_boolean(cycl_utilities.assertion_find_if((SubLObject)assertion_utilities.$sym69$ASSERTION_MENTIONS_ANY_OF_TERMS_IN_SET_LAMBDA, assertion, (SubLObject)assertion_utilities.T, (SubLObject)assertion_utilities.UNPROVIDED));
        }
        finally {
            assertion_utilities.$assertion_mentions_any_of_terms_set_lambda$.rebind(_prev_bind_0, thread);
        }
        return resultP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 28311L)
    public static SubLObject assertion_mentions_any_of_terms_in_dict_lambda(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return dictionary_utilities.dictionary_has_keyP(assertion_utilities.$assertion_mentions_any_of_terms_dict_lambda$.getDynamicValue(thread), v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 28468L)
    public static SubLObject assertion_mentions_any_of_terms_in_dictionary_keysP(final SubLObject assertion, final SubLObject term_dictionary) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject resultP = (SubLObject)assertion_utilities.NIL;
        final SubLObject _prev_bind_0 = assertion_utilities.$assertion_mentions_any_of_terms_dict_lambda$.currentBinding(thread);
        try {
            assertion_utilities.$assertion_mentions_any_of_terms_dict_lambda$.bind(term_dictionary, thread);
            resultP = list_utilities.sublisp_boolean(cycl_utilities.assertion_find_if((SubLObject)assertion_utilities.$sym70$ASSERTION_MENTIONS_ANY_OF_TERMS_IN_DICT_LAMBDA, assertion, (SubLObject)assertion_utilities.T, (SubLObject)assertion_utilities.UNPROVIDED));
        }
        finally {
            assertion_utilities.$assertion_mentions_any_of_terms_dict_lambda$.rebind(_prev_bind_0, thread);
        }
        return resultP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 29016L)
    public static SubLObject random_gaf_with_pred(final SubLObject pred) {
        return random_gaf_with_predicate(pred);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 29102L)
    public static SubLObject random_gaf_with_predicate(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)assertion_utilities.NIL;
        if (kb_indexing.num_predicate_extent_index(pred, (SubLObject)assertion_utilities.UNPROVIDED).numG((SubLObject)assertion_utilities.$int71$10000)) {
            while (assertion_utilities.NIL == gaf_assertion_with_pred_p(result, pred)) {
                result = assertions_high.random_assertion((SubLObject)assertion_utilities.UNPROVIDED);
            }
        }
        else {
            final SubLObject total = kb_indexing.num_predicate_extent_index(pred, (SubLObject)assertion_utilities.UNPROVIDED);
            final SubLObject i = random.random(total);
            SubLObject count = (SubLObject)assertion_utilities.ZERO_INTEGER;
            SubLObject result_$11 = (SubLObject)assertion_utilities.NIL;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)assertion_utilities.$sym58$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(assertion_utilities.$const59$EverythingPSC, thread);
                if (assertion_utilities.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred)) {
                    final SubLObject str = (SubLObject)assertion_utilities.NIL;
                    final SubLObject _prev_bind_0_$12 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$13 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_notification_count$.bind((SubLObject)assertion_utilities.ZERO_INTEGER, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)assertion_utilities.ZERO_INTEGER, thread);
                        utilities_macros.$progress_count$.bind((SubLObject)assertion_utilities.ZERO_INTEGER, thread);
                        utilities_macros.$is_noting_progressP$.bind((SubLObject)assertion_utilities.T, thread);
                        utilities_macros.$silent_progressP$.bind((SubLObject)((assertion_utilities.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : assertion_utilities.T), thread);
                        utilities_macros.noting_progress_preamble(str);
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred);
                        SubLObject done_var = result_$11;
                        final SubLObject token_var = (SubLObject)assertion_utilities.NIL;
                        while (assertion_utilities.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (assertion_utilities.NIL != valid) {
                                utilities_macros.note_progress();
                                SubLObject final_index_iterator = (SubLObject)assertion_utilities.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)assertion_utilities.$kw72$GAF, (SubLObject)assertion_utilities.NIL, (SubLObject)assertion_utilities.NIL);
                                    SubLObject done_var_$14 = result_$11;
                                    final SubLObject token_var_$15 = (SubLObject)assertion_utilities.NIL;
                                    while (assertion_utilities.NIL == done_var_$14) {
                                        final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$15);
                                        final SubLObject valid_$16 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$15.eql(gaf));
                                        if (assertion_utilities.NIL != valid_$16) {
                                            if (i.numE(count)) {
                                                result_$11 = gaf;
                                            }
                                            else {
                                                count = Numbers.add(count, (SubLObject)assertion_utilities.ONE_INTEGER);
                                            }
                                        }
                                        done_var_$14 = (SubLObject)SubLObjectFactory.makeBoolean(assertion_utilities.NIL == valid_$16 || assertion_utilities.NIL != result_$11);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)assertion_utilities.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (assertion_utilities.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(assertion_utilities.NIL == valid || assertion_utilities.NIL != result_$11);
                        }
                        utilities_macros.noting_progress_postamble();
                    }
                    finally {
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                        utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                        utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                        utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                        utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$13, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$12, thread);
                    }
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 29621L)
    public static SubLObject random_gaf_with_predicate_and_arg(final SubLObject pred, final SubLObject arg, final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject total = kb_indexing.num_gaf_arg_index(arg, argnum, pred, (SubLObject)assertion_utilities.UNPROVIDED);
        final SubLObject i = random.random(total);
        SubLObject count = (SubLObject)assertion_utilities.ZERO_INTEGER;
        SubLObject result = (SubLObject)assertion_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)assertion_utilities.$sym58$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(assertion_utilities.$const59$EverythingPSC, thread);
            if (assertion_utilities.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(arg, argnum, pred)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(arg, argnum, pred);
                SubLObject done_var = result;
                final SubLObject token_var = (SubLObject)assertion_utilities.NIL;
                while (assertion_utilities.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (assertion_utilities.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)assertion_utilities.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)assertion_utilities.$kw72$GAF, (SubLObject)assertion_utilities.NIL, (SubLObject)assertion_utilities.NIL);
                            SubLObject done_var_$18 = result;
                            final SubLObject token_var_$19 = (SubLObject)assertion_utilities.NIL;
                            while (assertion_utilities.NIL == done_var_$18) {
                                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$19);
                                final SubLObject valid_$20 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$19.eql(gaf));
                                if (assertion_utilities.NIL != valid_$20) {
                                    if (i.numE(count)) {
                                        result = gaf;
                                    }
                                    else {
                                        count = Numbers.add(count, (SubLObject)assertion_utilities.ONE_INTEGER);
                                    }
                                }
                                done_var_$18 = (SubLObject)SubLObjectFactory.makeBoolean(assertion_utilities.NIL == valid_$20 || assertion_utilities.NIL != result);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$21 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)assertion_utilities.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (assertion_utilities.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(assertion_utilities.NIL == valid || assertion_utilities.NIL != result);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 30047L)
    public static SubLObject random_rule_mentioning(final SubLObject fort) {
        return list_utilities.random_element(rules_mentioning(fort));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 30143L)
    public static SubLObject rules_mentioning(final SubLObject fort) {
        SubLObject result = (SubLObject)assertion_utilities.NIL;
        if (assertion_utilities.NIL != kb_mapping_macros.do_term_index_key_validator(fort, (SubLObject)assertion_utilities.$kw73$RULE)) {
            final SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(fort, (SubLObject)assertion_utilities.$kw73$RULE);
            SubLObject done_var = (SubLObject)assertion_utilities.NIL;
            final SubLObject token_var = (SubLObject)assertion_utilities.NIL;
            while (assertion_utilities.NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                if (assertion_utilities.NIL != valid) {
                    SubLObject final_index_iterator = (SubLObject)assertion_utilities.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)assertion_utilities.$kw73$RULE, (SubLObject)assertion_utilities.NIL, (SubLObject)assertion_utilities.NIL);
                        SubLObject done_var_$22 = (SubLObject)assertion_utilities.NIL;
                        final SubLObject token_var_$23 = (SubLObject)assertion_utilities.NIL;
                        while (assertion_utilities.NIL == done_var_$22) {
                            final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$23);
                            final SubLObject valid_$24 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$23.eql(ass));
                            if (assertion_utilities.NIL != valid_$24 && assertion_utilities.NIL != kb_mapping_macros.do_term_index_assertion_match_p(ass, final_index_spec)) {
                                result = (SubLObject)ConsesLow.cons(ass, result);
                            }
                            done_var_$22 = (SubLObject)SubLObjectFactory.makeBoolean(assertion_utilities.NIL == valid_$24);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)assertion_utilities.T);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (assertion_utilities.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = (SubLObject)SubLObjectFactory.makeBoolean(assertion_utilities.NIL == valid);
            }
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 30303L)
    public static SubLObject rule_count_mentioning(final SubLObject fort) {
        SubLObject count = (SubLObject)assertion_utilities.ZERO_INTEGER;
        if (assertion_utilities.NIL != kb_mapping_macros.do_term_index_key_validator(fort, (SubLObject)assertion_utilities.$kw73$RULE)) {
            final SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(fort, (SubLObject)assertion_utilities.$kw73$RULE);
            SubLObject done_var = (SubLObject)assertion_utilities.NIL;
            final SubLObject token_var = (SubLObject)assertion_utilities.NIL;
            while (assertion_utilities.NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                if (assertion_utilities.NIL != valid) {
                    SubLObject final_index_iterator = (SubLObject)assertion_utilities.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)assertion_utilities.$kw73$RULE, (SubLObject)assertion_utilities.NIL, (SubLObject)assertion_utilities.NIL);
                        SubLObject done_var_$25 = (SubLObject)assertion_utilities.NIL;
                        final SubLObject token_var_$26 = (SubLObject)assertion_utilities.NIL;
                        while (assertion_utilities.NIL == done_var_$25) {
                            final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$26);
                            final SubLObject valid_$27 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$26.eql(ass));
                            if (assertion_utilities.NIL != valid_$27 && assertion_utilities.NIL != kb_mapping_macros.do_term_index_assertion_match_p(ass, final_index_spec)) {
                                count = Numbers.add(count, (SubLObject)assertion_utilities.ONE_INTEGER);
                            }
                            done_var_$25 = (SubLObject)SubLObjectFactory.makeBoolean(assertion_utilities.NIL == valid_$27);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)assertion_utilities.T);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (assertion_utilities.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = (SubLObject)SubLObjectFactory.makeBoolean(assertion_utilities.NIL == valid);
            }
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 30529L)
    public static SubLObject random_assertions(final SubLObject n) {
        SubLObject result = (SubLObject)assertion_utilities.NIL;
        SubLObject i;
        for (i = (SubLObject)assertion_utilities.NIL, i = (SubLObject)assertion_utilities.ZERO_INTEGER; i.numL(n); i = Numbers.add(i, (SubLObject)assertion_utilities.ONE_INTEGER)) {
            result = (SubLObject)ConsesLow.cons(assertions_high.random_assertion((SubLObject)assertion_utilities.UNPROVIDED), result);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 30686L)
    public static SubLObject assertion_earlierP(final SubLObject assertion1, final SubLObject assertion2) {
        final SubLObject date1 = assertions_high.asserted_when(assertion1);
        final SubLObject date2 = assertions_high.asserted_when(assertion2);
        if (assertion_utilities.NIL == date1) {
            return (SubLObject)assertion_utilities.NIL;
        }
        if (assertion_utilities.NIL == date2) {
            return (SubLObject)assertion_utilities.NIL;
        }
        if (date1.numL(date2)) {
            return (SubLObject)assertion_utilities.T;
        }
        if (date1.numG(date2)) {
            return (SubLObject)assertion_utilities.NIL;
        }
        final SubLObject second1 = assertions_high.asserted_second(assertion1);
        final SubLObject second2 = assertions_high.asserted_second(assertion2);
        if (assertion_utilities.NIL == second1) {
            return (SubLObject)assertion_utilities.NIL;
        }
        if (assertion_utilities.NIL == second2) {
            return (SubLObject)assertion_utilities.NIL;
        }
        if (second1.numL(second2)) {
            return (SubLObject)assertion_utilities.T;
        }
        if (second1.numG(second2)) {
            return (SubLObject)assertion_utilities.NIL;
        }
        return (SubLObject)assertion_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 31446L)
    public static SubLObject assertion_laterP(final SubLObject assertion1, final SubLObject assertion2) {
        final SubLObject date1 = assertions_high.asserted_when(assertion1);
        final SubLObject date2 = assertions_high.asserted_when(assertion2);
        if (assertion_utilities.NIL == date1) {
            return (SubLObject)assertion_utilities.NIL;
        }
        if (assertion_utilities.NIL == date2) {
            return (SubLObject)assertion_utilities.NIL;
        }
        if (date1.numG(date2)) {
            return (SubLObject)assertion_utilities.T;
        }
        if (date1.numL(date2)) {
            return (SubLObject)assertion_utilities.NIL;
        }
        final SubLObject second1 = assertions_high.asserted_second(assertion1);
        final SubLObject second2 = assertions_high.asserted_second(assertion2);
        if (assertion_utilities.NIL == second1) {
            return (SubLObject)assertion_utilities.NIL;
        }
        if (assertion_utilities.NIL == second2) {
            return (SubLObject)assertion_utilities.NIL;
        }
        if (second1.numG(second2)) {
            return (SubLObject)assertion_utilities.T;
        }
        if (second1.numL(second2)) {
            return (SubLObject)assertion_utilities.NIL;
        }
        return (SubLObject)assertion_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 32202L)
    public static SubLObject earliest_assertion(final SubLObject assertions) {
        if (assertion_utilities.NIL == assertions) {
            return (SubLObject)assertion_utilities.NIL;
        }
        if (assertion_utilities.NIL != list_utilities.singletonP(assertions)) {
            return assertions.first();
        }
        final SubLObject dates = Mapping.mapcar((SubLObject)assertion_utilities.$sym74$ASSERTED_WHEN, assertions);
        if (assertion_utilities.NIL == list_utilities.every_in_list((SubLObject)assertion_utilities.$sym75$INTEGERP, dates, (SubLObject)assertion_utilities.UNPROVIDED)) {
            return (SubLObject)assertion_utilities.NIL;
        }
        final SubLObject earliest_date = number_utilities.minimum(dates, (SubLObject)assertion_utilities.UNPROVIDED);
        SubLObject earliest_date_assertions = (SubLObject)assertion_utilities.NIL;
        SubLObject cdolist_list_var = assertions;
        SubLObject ass = (SubLObject)assertion_utilities.NIL;
        ass = cdolist_list_var.first();
        while (assertion_utilities.NIL != cdolist_list_var) {
            if (earliest_date.numE(assertions_high.asserted_when(ass))) {
                earliest_date_assertions = (SubLObject)ConsesLow.cons(ass, earliest_date_assertions);
            }
            cdolist_list_var = cdolist_list_var.rest();
            ass = cdolist_list_var.first();
        }
        if (assertion_utilities.NIL != list_utilities.singletonP(earliest_date_assertions)) {
            return earliest_date_assertions.first();
        }
        final SubLObject times = Mapping.mapcar((SubLObject)assertion_utilities.$sym76$ASSERTED_SECOND, earliest_date_assertions);
        if (assertion_utilities.NIL == list_utilities.every_in_list((SubLObject)assertion_utilities.$sym75$INTEGERP, times, (SubLObject)assertion_utilities.UNPROVIDED)) {
            return (SubLObject)assertion_utilities.NIL;
        }
        final SubLObject earliest_time = number_utilities.minimum(times, (SubLObject)assertion_utilities.UNPROVIDED);
        SubLObject earliest_time_assertions = (SubLObject)assertion_utilities.NIL;
        SubLObject cdolist_list_var2 = earliest_date_assertions;
        SubLObject ass2 = (SubLObject)assertion_utilities.NIL;
        ass2 = cdolist_list_var2.first();
        while (assertion_utilities.NIL != cdolist_list_var2) {
            if (earliest_time.numE(assertions_high.asserted_second(ass2))) {
                earliest_time_assertions = (SubLObject)ConsesLow.cons(ass2, earliest_time_assertions);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            ass2 = cdolist_list_var2.first();
        }
        if (assertion_utilities.NIL != list_utilities.singletonP(earliest_time_assertions)) {
            return earliest_time_assertions.first();
        }
        return (SubLObject)assertion_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 33367L)
    public static SubLObject rename_assertion_variables(final SubLObject assertion, final SubLObject rename_variable_map) {
        final SubLObject assertion_old_el_variables = assertions_high.assertion_el_variables(assertion);
        final SubLObject assertion_new_el_variables = bindings.apply_bindings(rename_variable_map, assertion_old_el_variables);
        final SubLObject assertion_new_el_variable_names = Mapping.mapcar((SubLObject)assertion_utilities.$sym77$EL_VAR_NAME, assertion_new_el_variables);
        assertions_interface.kb_set_assertion_variable_names(assertion, assertion_new_el_variable_names);
        return (SubLObject)assertion_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 34221L)
    public static SubLObject possibly_rename_assertion_variables(final SubLObject assertion, final SubLObject rename_variable_alist) {
        if (assertion_utilities.NIL != el_utilities.simple_variable_rename_impossibleP(assertion, rename_variable_alist)) {
            return (SubLObject)assertion_utilities.NIL;
        }
        return rename_assertion_variables(assertion, rename_variable_alist);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 34754L)
    public static SubLObject assertion_antecedent_query_formula(final SubLObject assertion) {
        assert assertion_utilities.NIL != assertion_handles.assertion_p(assertion) : assertion;
        final SubLObject antecedent_lits = clauses.neg_lits(assertions_high.assertion_cnf(assertion));
        final SubLObject antecedent_dnf = clauses.make_dnf((SubLObject)assertion_utilities.NIL, antecedent_lits);
        final SubLObject antecedent_hl_formula = clauses.dnf_formula(antecedent_dnf);
        return fi.perform_fi_substitutions(conses_high.copy_tree(antecedent_hl_formula), assertions_high.assertion_el_variables(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 35202L)
    public static SubLObject assertion_known_extent_query_formula(final SubLObject assertion) {
        return assertion_known_extent_query_formula_int(assertion, assertion_utilities.$const78$knownSentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 35419L)
    public static SubLObject assertion_unknown_extent_query_formula(final SubLObject assertion) {
        return assertion_known_extent_query_formula_int(assertion, assertion_utilities.$const79$unknownSentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 35644L)
    public static SubLObject assertion_known_extent_query_formula_int(final SubLObject assertion, final SubLObject known_pred) {
        assert assertion_utilities.NIL != assertion_handles.assertion_p(assertion) : assertion;
        final SubLObject antecedent_lits = clauses.neg_lits(assertions_high.assertion_cnf(assertion));
        final SubLObject antecedent_dnf = clauses.make_dnf((SubLObject)assertion_utilities.NIL, antecedent_lits);
        final SubLObject antecedent_hl_formula = clauses.dnf_formula(antecedent_dnf);
        final SubLObject consequent_lits = clauses.pos_lits(assertions_high.assertion_cnf(assertion));
        final SubLObject consequent_dnf = clauses.make_dnf((SubLObject)assertion_utilities.NIL, consequent_lits);
        final SubLObject consequent_hl_formula = clauses.dnf_formula(consequent_dnf);
        final SubLObject known_consequent_formula = el_utilities.make_unary_formula(known_pred, consequent_hl_formula);
        final SubLObject query_hl_formula = simplifier.simplify_cycl_sentence(el_utilities.make_conjunction((SubLObject)ConsesLow.list(antecedent_hl_formula, known_consequent_formula)), (SubLObject)assertion_utilities.UNPROVIDED);
        return fi.perform_fi_substitutions(conses_high.copy_tree(query_hl_formula), assertions_high.assertion_el_variables(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 36418L)
    public static SubLObject assertion_info(final SubLObject assertion) {
        return (SubLObject)ConsesLow.list(fi.assertion_hl_formula(assertion, (SubLObject)assertion_utilities.UNPROVIDED), assertions_high.assertion_mt(assertion), assertions_high.cyc_assertion_tv(assertion), assertions_high.assertion_direction(assertion), assertions_high.assertion_arguments(assertion), assertions_high.gaf_assertionP(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 36741L)
    public static SubLObject assertion_literal_count(final SubLObject assertion) {
        if (assertion_utilities.NIL != assertions_high.gaf_assertionP(assertion)) {
            return (SubLObject)assertion_utilities.ONE_INTEGER;
        }
        return rule_literal_count(assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 36888L)
    public static SubLObject rule_literal_count(final SubLObject rule) {
        final SubLObject cnf = assertions_high.assertion_cnf(rule);
        return clause_utilities.clause_literal_count(cnf);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 37006L)
    public static SubLObject assertion_supporting_assertions(final SubLObject assertion) {
        SubLObject result = (SubLObject)assertion_utilities.NIL;
        SubLObject cdolist_list_var = assertions_high.assertion_arguments(assertion);
        SubLObject argument = (SubLObject)assertion_utilities.NIL;
        argument = cdolist_list_var.first();
        while (assertion_utilities.NIL != cdolist_list_var) {
            if (assertion_utilities.NIL != deduction_handles.deduction_p(argument)) {
                SubLObject cdolist_list_var_$28 = deductions_high.deduction_supports(argument);
                SubLObject supporting_assertion = (SubLObject)assertion_utilities.NIL;
                supporting_assertion = cdolist_list_var_$28.first();
                while (assertion_utilities.NIL != cdolist_list_var_$28) {
                    if (assertion_utilities.NIL != assertion_handles.assertion_p(supporting_assertion)) {
                        result = (SubLObject)ConsesLow.cons(supporting_assertion, result);
                    }
                    cdolist_list_var_$28 = cdolist_list_var_$28.rest();
                    supporting_assertion = cdolist_list_var_$28.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            argument = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 37234L)
    public static SubLObject assertion_supporting_forward_assertions(final SubLObject assertion) {
        return list_utilities.remove_if_not((SubLObject)assertion_utilities.$sym80$FORWARD_ASSERTION_, assertion_supporting_assertions(assertion), (SubLObject)assertion_utilities.UNPROVIDED, (SubLObject)assertion_utilities.UNPROVIDED, (SubLObject)assertion_utilities.UNPROVIDED, (SubLObject)assertion_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 37391L)
    public static SubLObject assertion_cheapest_forward_supporting_assertion(final SubLObject assertion) {
        final SubLObject supporting_forward_assertions = assertion_supporting_forward_assertions(assertion);
        return (SubLObject)((assertion_utilities.NIL != supporting_forward_assertions) ? number_utilities.minimum(supporting_forward_assertions, (SubLObject)assertion_utilities.$sym81$ASSERTION_DEPENDENT_COUNT) : assertion_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 37911L)
    public static SubLObject assertion_universal_time(final SubLObject assertion) {
        final SubLObject universal_second = assertions_high.asserted_second(assertion);
        if (assertion_utilities.NIL != universal_second) {
            final SubLObject universal_date = assertions_high.asserted_when(assertion);
            if (assertion_utilities.NIL != universal_date) {
                return numeric_date_utilities.universal_time_from_date_and_second(universal_date, universal_second);
            }
        }
        return (SubLObject)assertion_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 38723L)
    public static SubLObject all_assertions_sorted_by_creation_time_estimate() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)assertion_utilities.NIL;
        final SubLObject _prev_bind_0 = assertion_utilities.$newest_constant_of_assertions$.currentBinding(thread);
        try {
            assertion_utilities.$newest_constant_of_assertions$.bind((SubLObject)assertion_utilities.NIL, thread);
            initialize_newest_constant_table();
            final SubLObject idx = constant_handles.do_constants_table();
            final SubLObject mess = (SubLObject)assertion_utilities.$str82$Sorting_newest_constants___Part_2;
            final SubLObject total = id_index.id_index_count(idx);
            SubLObject sofar = (SubLObject)assertion_utilities.ZERO_INTEGER;
            assert assertion_utilities.NIL != Types.stringp(mess) : mess;
            final SubLObject _prev_bind_0_$29 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)assertion_utilities.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)assertion_utilities.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)assertion_utilities.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(mess);
                    final SubLObject idx_$30 = idx;
                    if (assertion_utilities.NIL == id_index.id_index_objects_empty_p(idx_$30, (SubLObject)assertion_utilities.$kw84$SKIP)) {
                        final SubLObject idx_$31 = idx_$30;
                        if (assertion_utilities.NIL == id_index.id_index_dense_objects_empty_p(idx_$31, (SubLObject)assertion_utilities.$kw84$SKIP)) {
                            final SubLObject vector_var = id_index.id_index_dense_objects(idx_$31);
                            final SubLObject backwardP_var = (SubLObject)assertion_utilities.NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject id;
                            SubLObject constant;
                            SubLObject cdolist_list_var;
                            SubLObject assertions;
                            SubLObject ass;
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)assertion_utilities.NIL, v_iteration = (SubLObject)assertion_utilities.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)assertion_utilities.ONE_INTEGER)) {
                                id = ((assertion_utilities.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)assertion_utilities.ONE_INTEGER) : v_iteration);
                                constant = Vectors.aref(vector_var, id);
                                if (assertion_utilities.NIL == id_index.id_index_tombstone_p(constant) || assertion_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)assertion_utilities.$kw84$SKIP)) {
                                    if (assertion_utilities.NIL != id_index.id_index_tombstone_p(constant)) {
                                        constant = (SubLObject)assertion_utilities.$kw84$SKIP;
                                    }
                                    assertions = (cdolist_list_var = Hashtables.gethash(constant, assertion_utilities.$newest_constant_of_assertions$.getDynamicValue(thread), (SubLObject)assertion_utilities.NIL));
                                    ass = (SubLObject)assertion_utilities.NIL;
                                    ass = cdolist_list_var.first();
                                    while (assertion_utilities.NIL != cdolist_list_var) {
                                        v_answer = (SubLObject)ConsesLow.cons(ass, v_answer);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        ass = cdolist_list_var.first();
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)assertion_utilities.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                }
                            }
                        }
                        final SubLObject idx_$32 = idx_$30;
                        if (assertion_utilities.NIL == id_index.id_index_sparse_objects_empty_p(idx_$32) || assertion_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)assertion_utilities.$kw84$SKIP)) {
                            final SubLObject sparse = id_index.id_index_sparse_objects(idx_$32);
                            SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$32);
                            final SubLObject end_id = id_index.id_index_next_id(idx_$32);
                            final SubLObject v_default = (SubLObject)((assertion_utilities.NIL != id_index.id_index_skip_tombstones_p((SubLObject)assertion_utilities.$kw84$SKIP)) ? assertion_utilities.NIL : assertion_utilities.$kw84$SKIP);
                            while (id2.numL(end_id)) {
                                final SubLObject constant2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                                if (assertion_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)assertion_utilities.$kw84$SKIP) || assertion_utilities.NIL == id_index.id_index_tombstone_p(constant2)) {
                                    SubLObject cdolist_list_var2;
                                    final SubLObject assertions2 = cdolist_list_var2 = Hashtables.gethash(constant2, assertion_utilities.$newest_constant_of_assertions$.getDynamicValue(thread), (SubLObject)assertion_utilities.NIL);
                                    SubLObject ass2 = (SubLObject)assertion_utilities.NIL;
                                    ass2 = cdolist_list_var2.first();
                                    while (assertion_utilities.NIL != cdolist_list_var2) {
                                        v_answer = (SubLObject)ConsesLow.cons(ass2, v_answer);
                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                        ass2 = cdolist_list_var2.first();
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)assertion_utilities.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                }
                                id2 = Numbers.add(id2, (SubLObject)assertion_utilities.ONE_INTEGER);
                            }
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$30 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)assertion_utilities.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$30, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_$29, thread);
            }
        }
        finally {
            assertion_utilities.$newest_constant_of_assertions$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(v_answer);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 39219L)
    public static SubLObject assertion_newest_constant(final SubLObject assertion) {
        SubLObject newest_suid = (SubLObject)assertion_utilities.MINUS_ONE_INTEGER;
        SubLObject cdolist_list_var;
        final SubLObject constants = cdolist_list_var = assertions_high.assertion_constants(assertion);
        SubLObject constant = (SubLObject)assertion_utilities.NIL;
        constant = cdolist_list_var.first();
        while (assertion_utilities.NIL != cdolist_list_var) {
            if (assertion_utilities.NIL != constant_handles.valid_constantP(constant, (SubLObject)assertion_utilities.UNPROVIDED)) {
                final SubLObject suid = constant_handles.constant_suid(constant);
                if (suid.numG(newest_suid)) {
                    newest_suid = suid;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            constant = cdolist_list_var.first();
        }
        return constant_handles.find_constant_by_suid(newest_suid);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 39738L)
    public static SubLObject initialize_newest_constant_table() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assertion_utilities.$newest_constant_of_assertions$.setDynamicValue(Hashtables.make_hash_table(constant_handles.constant_count(), Symbols.symbol_function((SubLObject)assertion_utilities.EQL), (SubLObject)assertion_utilities.UNPROVIDED), thread);
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = (SubLObject)assertion_utilities.$str85$Computing_newest_constants;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)assertion_utilities.ZERO_INTEGER;
        assert assertion_utilities.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)assertion_utilities.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)assertion_utilities.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)assertion_utilities.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$34 = idx;
                if (assertion_utilities.NIL == id_index.id_index_objects_empty_p(idx_$34, (SubLObject)assertion_utilities.$kw84$SKIP)) {
                    final SubLObject idx_$35 = idx_$34;
                    if (assertion_utilities.NIL == id_index.id_index_dense_objects_empty_p(idx_$35, (SubLObject)assertion_utilities.$kw84$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$35);
                        final SubLObject backwardP_var = (SubLObject)assertion_utilities.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject ass;
                        SubLObject newest_constant;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)assertion_utilities.NIL, v_iteration = (SubLObject)assertion_utilities.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)assertion_utilities.ONE_INTEGER)) {
                            a_id = ((assertion_utilities.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)assertion_utilities.ONE_INTEGER) : v_iteration);
                            a_handle = Vectors.aref(vector_var, a_id);
                            if (assertion_utilities.NIL == id_index.id_index_tombstone_p(a_handle) || assertion_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)assertion_utilities.$kw84$SKIP)) {
                                if (assertion_utilities.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                    a_handle = (SubLObject)assertion_utilities.$kw84$SKIP;
                                }
                                ass = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                newest_constant = assertion_newest_constant(ass);
                                Hashtables.sethash(newest_constant, assertion_utilities.$newest_constant_of_assertions$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(ass, Hashtables.gethash(newest_constant, assertion_utilities.$newest_constant_of_assertions$.getDynamicValue(thread), (SubLObject)assertion_utilities.NIL)));
                                sofar = Numbers.add(sofar, (SubLObject)assertion_utilities.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$36 = idx_$34;
                    if (assertion_utilities.NIL == id_index.id_index_sparse_objects_empty_p(idx_$36) || assertion_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)assertion_utilities.$kw84$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$36);
                        SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$36);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$36);
                        final SubLObject v_default = (SubLObject)((assertion_utilities.NIL != id_index.id_index_skip_tombstones_p((SubLObject)assertion_utilities.$kw84$SKIP)) ? assertion_utilities.NIL : assertion_utilities.$kw84$SKIP);
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                            if (assertion_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)assertion_utilities.$kw84$SKIP) || assertion_utilities.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                final SubLObject newest_constant2 = assertion_newest_constant(ass2);
                                Hashtables.sethash(newest_constant2, assertion_utilities.$newest_constant_of_assertions$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(ass2, Hashtables.gethash(newest_constant2, assertion_utilities.$newest_constant_of_assertions$.getDynamicValue(thread), (SubLObject)assertion_utilities.NIL)));
                                sofar = Numbers.add(sofar, (SubLObject)assertion_utilities.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            a_id2 = Numbers.add(a_id2, (SubLObject)assertion_utilities.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$37 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)assertion_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$37, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        final SubLObject table_var = assertion_utilities.$newest_constant_of_assertions$.getDynamicValue(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_9 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_10 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_11 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_12 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)assertion_utilities.$str86$Sorting_newest_constants___Part_1, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Hashtables.hash_table_count(table_var), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)assertion_utilities.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)assertion_utilities.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)assertion_utilities.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)assertion_utilities.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject constant = (SubLObject)assertion_utilities.NIL;
                SubLObject assertions = (SubLObject)assertion_utilities.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(table_var);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        constant = Hashtables.getEntryKey(cdohash_entry);
                        assertions = Hashtables.getEntryValue(cdohash_entry);
                        Hashtables.sethash(constant, assertion_utilities.$newest_constant_of_assertions$.getDynamicValue(thread), Sequences.nreverse(assertions));
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)assertion_utilities.ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$38 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)assertion_utilities.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$38, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_12, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_11, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_10, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_9, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_8, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_7, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_6, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_5, thread);
        }
        return (SubLObject)assertion_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 40294L)
    public static SubLObject assertion_has_meta_assertionsP(final SubLObject assertion) {
        enforceType(assertion, assertion_utilities.$sym40$ASSERTION_P);
        return list_utilities.sublisp_boolean(assertions_low.assertion_index(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 40637L)
    public static SubLObject all_meta_assertions(final SubLObject assertion) {
        assert assertion_utilities.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (assertion_utilities.NIL == assertion_has_meta_assertionsP(assertion)) {
            return (SubLObject)assertion_utilities.NIL;
        }
        final SubLObject meta_assertions = kb_accessors.all_term_assertions(assertion, (SubLObject)assertion_utilities.UNPROVIDED);
        return Sequences.delete_duplicates(ConsesLow.nconc(meta_assertions, Mapping.mapcan(Symbols.symbol_function((SubLObject)assertion_utilities.$sym92$ALL_META_ASSERTIONS), meta_assertions, assertion_utilities.EMPTY_SUBL_OBJECT_ARRAY)), (SubLObject)assertion_utilities.UNPROVIDED, (SubLObject)assertion_utilities.UNPROVIDED, (SubLObject)assertion_utilities.UNPROVIDED, (SubLObject)assertion_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 41272L)
    public static SubLObject meta_assertion_list_for_editing(final SubLObject assertion) {
        final SubLObject meta_assertions = all_meta_assertions(assertion);
        SubLObject meta_assertion_list = (SubLObject)assertion_utilities.NIL;
        SubLObject cdolist_list_var = meta_assertions;
        SubLObject meta_assertion = (SubLObject)assertion_utilities.NIL;
        meta_assertion = cdolist_list_var.first();
        while (assertion_utilities.NIL != cdolist_list_var) {
            meta_assertion_list = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(meta_assertion, assertions_high.assertion_mt(meta_assertion)), meta_assertion_list);
            cdolist_list_var = cdolist_list_var.rest();
            meta_assertion = cdolist_list_var.first();
        }
        return Sequences.nreverse(meta_assertion_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 41605L)
    public static SubLObject meta_assertion_p(final SubLObject assertion) {
        return (SubLObject)SubLObjectFactory.makeBoolean(assertion_utilities.NIL != assertion_handles.assertion_p(assertion) && assertion_utilities.NIL != cycl_utilities.assertion_find_if((SubLObject)assertion_utilities.$sym40$ASSERTION_P, assertion, (SubLObject)assertion_utilities.UNPROVIDED, (SubLObject)assertion_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 41808L)
    public static SubLObject rule_meta_assertion_p(final SubLObject assertion) {
        return (SubLObject)SubLObjectFactory.makeBoolean(assertion_utilities.NIL != assertion_handles.assertion_p(assertion) && assertion_utilities.NIL != cycl_utilities.assertion_find_if((SubLObject)assertion_utilities.$sym93$RULE_ASSERTION_, assertion, (SubLObject)assertion_utilities.UNPROVIDED, (SubLObject)assertion_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 42012L)
    public static SubLObject pragmatic_requirement_rule_p(final SubLObject assertion) {
        return (SubLObject)SubLObjectFactory.makeBoolean(assertion_utilities.NIL != assertions_high.rule_assertionP(assertion) && assertion_utilities.NIL != rule_meta_assertion_p(assertion) && assertion_utilities.NIL != removal_modules_formula_arg_n.formula_has_operatorP(clauses.pos_lits(assertions_high.assertion_cnf(assertion)).first(), assertion_utilities.$const94$meetsPragmaticRequirement));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 42330L)
    public static SubLObject meta_assertion_el_formula(final SubLObject meta_assertion, final SubLObject assertion, final SubLObject assertion_indexical) {
        assert assertion_utilities.NIL != meta_assertion_p(meta_assertion) : meta_assertion;
        assert assertion_utilities.NIL != assertion_handles.assertion_p(assertion) : assertion;
        SubLObject meta_assertion_el_formula = uncanonicalizer.assertion_el_formula(meta_assertion);
        if (assertion_utilities.NIL != cycl_utilities.expression_find(assertion, assertions_high.assertion_cons(meta_assertion), (SubLObject)assertion_utilities.UNPROVIDED, (SubLObject)assertion_utilities.UNPROVIDED, (SubLObject)assertion_utilities.UNPROVIDED)) {
            if (assertion_utilities.NIL != hlmt.hlmt_equal(assertions_high.assertion_mt(assertion), assertions_high.assertion_mt(meta_assertion))) {
                final SubLObject assertion_el_formula = uncanonicalizer.assertion_el_formula(assertion);
                meta_assertion_el_formula = cycl_utilities.expression_subst(assertion_indexical, assertion_el_formula, meta_assertion_el_formula, Symbols.symbol_function((SubLObject)assertion_utilities.EQUAL), (SubLObject)assertion_utilities.UNPROVIDED);
            }
            else {
                final SubLObject assertion_el_ist_formula = uncanonicalizer.assertion_el_ist_formula(assertion);
                meta_assertion_el_formula = cycl_utilities.expression_subst(assertion_indexical, assertion_el_ist_formula, meta_assertion_el_formula, Symbols.symbol_function((SubLObject)assertion_utilities.EQUAL), (SubLObject)assertion_utilities.UNPROVIDED);
            }
        }
        return meta_assertion_el_formula;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 43375L)
    public static SubLObject mt_of_assertions_p(final SubLObject mt, final SubLObject assertions) {
        assert assertion_utilities.NIL != hlmt.hlmt_p(mt) : mt;
        assert assertion_utilities.NIL != assertion_list_p(assertions) : assertions;
        SubLObject mal_mtP = (SubLObject)assertion_utilities.NIL;
        if (assertion_utilities.NIL == mal_mtP) {
            SubLObject csome_list_var;
            SubLObject assertion;
            for (csome_list_var = assertions, assertion = (SubLObject)assertion_utilities.NIL, assertion = csome_list_var.first(); assertion_utilities.NIL == mal_mtP && assertion_utilities.NIL != csome_list_var; mal_mtP = (SubLObject)SubLObjectFactory.makeBoolean(assertion_utilities.NIL == hlmt.hlmt_equal(mt, assertions_high.assertion_mt(assertion))), csome_list_var = csome_list_var.rest(), assertion = csome_list_var.first()) {}
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(assertion_utilities.NIL == mal_mtP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 43769L)
    public static SubLObject assertions_of_mt(final SubLObject assertions, final SubLObject mt) {
        assert assertion_utilities.NIL != hlmt.hlmt_p(mt) : mt;
        assert assertion_utilities.NIL != assertion_list_p(assertions) : assertions;
        SubLObject result = (SubLObject)assertion_utilities.NIL;
        SubLObject cdolist_list_var = assertions;
        SubLObject assertion = (SubLObject)assertion_utilities.NIL;
        assertion = cdolist_list_var.first();
        while (assertion_utilities.NIL != cdolist_list_var) {
            if (assertion_utilities.NIL != hlmt.hlmt_equal(mt, assertions_high.assertion_mt(assertion))) {
                result = (SubLObject)ConsesLow.cons(assertion, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 44130L)
    public static SubLObject mts_of_assertions(final SubLObject assertions) {
        assert assertion_utilities.NIL != assertion_list_p(assertions) : assertions;
        SubLObject result = (SubLObject)assertion_utilities.NIL;
        SubLObject cdolist_list_var = assertions;
        SubLObject assertion = (SubLObject)assertion_utilities.NIL;
        assertion = cdolist_list_var.first();
        while (assertion_utilities.NIL != cdolist_list_var) {
            result = (SubLObject)ConsesLow.cons(assertions_high.assertion_mt(assertion), result);
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return list_utilities.fast_delete_duplicates(result, (SubLObject)assertion_utilities.UNPROVIDED, (SubLObject)assertion_utilities.UNPROVIDED, (SubLObject)assertion_utilities.UNPROVIDED, (SubLObject)assertion_utilities.UNPROVIDED, (SubLObject)assertion_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 44482L)
    public static SubLObject assertions_min_mt(final SubLObject assertions) {
        final SubLObject mts = genl_mts.min_mts(Mapping.mapcar((SubLObject)assertion_utilities.$sym98$ASSERTION_MT, assertions), (SubLObject)assertion_utilities.UNPROVIDED);
        if (assertion_utilities.NIL != list_utilities.singletonP(mts)) {
            return list_utilities.only_one(mts);
        }
        return (SubLObject)assertion_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 44765L)
    public static SubLObject sort_assertions(final SubLObject assertions) {
        return Sort.sort(assertions, Symbols.symbol_function((SubLObject)assertion_utilities.$sym99$SAFE__), Symbols.symbol_function((SubLObject)assertion_utilities.$sym100$ASSERTION_ID));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 44979L)
    public static SubLObject sort_gafs_by_term(SubLObject gafs, SubLObject term_sort_func, SubLObject pred_sort_func) {
        if (term_sort_func == assertion_utilities.UNPROVIDED) {
            term_sort_func = (SubLObject)assertion_utilities.$sym101$TERM__;
        }
        if (pred_sort_func == assertion_utilities.UNPROVIDED) {
            pred_sort_func = (SubLObject)assertion_utilities.$sym102$DEFINITIONAL_PRED__;
        }
        gafs = sort_assertions(gafs);
        gafs = Sort.stable_sort(gafs, pred_sort_func, Symbols.symbol_function((SubLObject)assertion_utilities.$sym103$GAF_PREDICATE));
        gafs = Sort.stable_sort(gafs, term_sort_func, Symbols.symbol_function((SubLObject)assertion_utilities.$sym104$GAF_ARG1));
        return gafs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 45274L)
    public static SubLObject rule_type_constraints(final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cnf = assertions_high.assertion_cnf(rule);
        final SubLObject mt = assertions_high.assertion_mt(rule);
        SubLObject constraints = (SubLObject)assertion_utilities.NIL;
        final SubLObject _prev_bind_0 = at_vars.$at_check_inter_arg_isaP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$at_check_inter_arg_genlP$.currentBinding(thread);
        try {
            at_vars.$at_check_inter_arg_isaP$.bind((SubLObject)assertion_utilities.T, thread);
            at_vars.$at_check_inter_arg_genlP$.bind((SubLObject)assertion_utilities.T, thread);
            constraints = at_var_types.hl_cnf_variables_arg_constraints(cnf, mt);
        }
        finally {
            at_vars.$at_check_inter_arg_genlP$.rebind(_prev_bind_2, thread);
            at_vars.$at_check_inter_arg_isaP$.rebind(_prev_bind_0, thread);
        }
        constraints = Sequences.remove_if((SubLObject)assertion_utilities.$sym105$ISA_HL_VAR_THING_LIT_, constraints, (SubLObject)assertion_utilities.UNPROVIDED, (SubLObject)assertion_utilities.UNPROVIDED, (SubLObject)assertion_utilities.UNPROVIDED, (SubLObject)assertion_utilities.UNPROVIDED);
        if (assertion_utilities.NIL != constraints && assertion_utilities.NIL != cycl_utilities.formula_args(constraints, (SubLObject)assertion_utilities.UNPROVIDED)) {
            thread.resetMultipleValues();
            final SubLObject dnf_constraint_clauses = clausifier.dnf_clausal_form(constraints, mt);
            final SubLObject new_mt = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (assertion_utilities.NIL == hlmt.hlmt_equal(new_mt, mt)) {
                Errors.warn((SubLObject)assertion_utilities.$str106$Type_constraint__Mt_should_be_can, mt, new_mt);
            }
            if (assertion_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && assertion_utilities.NIL == list_utilities.singletonP(dnf_constraint_clauses)) {
                Errors.error((SubLObject)assertion_utilities.$str107$Expected_a_single_DNF_clause_of_c, rule, dnf_constraint_clauses);
            }
            return dnf_constraint_clauses.first();
        }
        return (SubLObject)assertion_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 46238L)
    public static SubLObject self_looping_ruleP(final SubLObject rule) {
        if (assertion_utilities.NIL != assertions_high.rule_assertionP(rule)) {
            return cached_self_looping_rule_assertionP(rule);
        }
        return (SubLObject)assertion_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 46389L)
    public static SubLObject clear_cached_self_looping_rule_assertionP() {
        final SubLObject cs = assertion_utilities.$cached_self_looping_rule_assertionP_caching_state$.getGlobalValue();
        if (assertion_utilities.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)assertion_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 46389L)
    public static SubLObject remove_cached_self_looping_rule_assertionP(final SubLObject rule) {
        return memoization_state.caching_state_remove_function_results_with_args(assertion_utilities.$cached_self_looping_rule_assertionP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(rule), (SubLObject)assertion_utilities.UNPROVIDED, (SubLObject)assertion_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 46389L)
    public static SubLObject cached_self_looping_rule_assertionP_internal(final SubLObject rule) {
        final SubLObject cnf = assertions_high.assertion_cnf(rule);
        SubLObject cdolist_list_var = clauses.pos_lits(cnf);
        SubLObject pos_lit = (SubLObject)assertion_utilities.NIL;
        pos_lit = cdolist_list_var.first();
        while (assertion_utilities.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$39 = clauses.neg_lits(cnf);
            SubLObject neg_lit = (SubLObject)assertion_utilities.NIL;
            neg_lit = cdolist_list_var_$39.first();
            while (assertion_utilities.NIL != cdolist_list_var_$39) {
                if (assertion_utilities.NIL != unification.unify_possible(pos_lit, neg_lit)) {
                    return (SubLObject)assertion_utilities.T;
                }
                cdolist_list_var_$39 = cdolist_list_var_$39.rest();
                neg_lit = cdolist_list_var_$39.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            pos_lit = cdolist_list_var.first();
        }
        return (SubLObject)assertion_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 46389L)
    public static SubLObject cached_self_looping_rule_assertionP(final SubLObject rule) {
        SubLObject caching_state = assertion_utilities.$cached_self_looping_rule_assertionP_caching_state$.getGlobalValue();
        if (assertion_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)assertion_utilities.$sym108$CACHED_SELF_LOOPING_RULE_ASSERTION_, (SubLObject)assertion_utilities.$sym109$_CACHED_SELF_LOOPING_RULE_ASSERTION__CACHING_STATE_, (SubLObject)assertion_utilities.NIL, (SubLObject)assertion_utilities.EQL, (SubLObject)assertion_utilities.ONE_INTEGER, (SubLObject)assertion_utilities.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, rule, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cached_self_looping_rule_assertionP_internal(rule)));
            memoization_state.caching_state_put(caching_state, rule, results, (SubLObject)assertion_utilities.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 46643L)
    public static SubLObject self_expanding_ruleP(final SubLObject rule) {
        if (assertion_utilities.NIL != assertions_high.rule_assertionP(rule)) {
            return cached_self_expanding_rule_assertionP(rule);
        }
        return (SubLObject)assertion_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 46800L)
    public static SubLObject clear_cached_self_expanding_rule_assertionP() {
        final SubLObject cs = assertion_utilities.$cached_self_expanding_rule_assertionP_caching_state$.getGlobalValue();
        if (assertion_utilities.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)assertion_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 46800L)
    public static SubLObject remove_cached_self_expanding_rule_assertionP(final SubLObject rule) {
        return memoization_state.caching_state_remove_function_results_with_args(assertion_utilities.$cached_self_expanding_rule_assertionP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(rule), (SubLObject)assertion_utilities.UNPROVIDED, (SubLObject)assertion_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 46800L)
    public static SubLObject cached_self_expanding_rule_assertionP_internal(final SubLObject rule) {
        final SubLObject cnf = assertions_high.assertion_cnf(rule);
        SubLObject witness;
        SubLObject rest;
        SubLObject pos_lit;
        SubLObject count;
        SubLObject cdolist_list_var;
        SubLObject neg_lit;
        for (witness = (SubLObject)assertion_utilities.NIL, rest = (SubLObject)assertion_utilities.NIL, rest = clauses.pos_lits(cnf); assertion_utilities.NIL == witness && assertion_utilities.NIL != rest; rest = rest.rest()) {
            pos_lit = rest.first();
            count = (SubLObject)assertion_utilities.ZERO_INTEGER;
            cdolist_list_var = clauses.neg_lits(cnf);
            neg_lit = (SubLObject)assertion_utilities.NIL;
            neg_lit = cdolist_list_var.first();
            while (assertion_utilities.NIL != cdolist_list_var) {
                if (assertion_utilities.NIL != unification.unify_possible(pos_lit, neg_lit)) {
                    count = Numbers.add(count, (SubLObject)assertion_utilities.ONE_INTEGER);
                }
                cdolist_list_var = cdolist_list_var.rest();
                neg_lit = cdolist_list_var.first();
            }
            if (count.numGE((SubLObject)assertion_utilities.TWO_INTEGER)) {
                witness = pos_lit;
            }
        }
        return list_utilities.sublisp_boolean(witness);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 46800L)
    public static SubLObject cached_self_expanding_rule_assertionP(final SubLObject rule) {
        SubLObject caching_state = assertion_utilities.$cached_self_expanding_rule_assertionP_caching_state$.getGlobalValue();
        if (assertion_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)assertion_utilities.$sym110$CACHED_SELF_EXPANDING_RULE_ASSERTION_, (SubLObject)assertion_utilities.$sym111$_CACHED_SELF_EXPANDING_RULE_ASSERTION__CACHING_STATE_, (SubLObject)assertion_utilities.NIL, (SubLObject)assertion_utilities.EQL, (SubLObject)assertion_utilities.ONE_INTEGER, (SubLObject)assertion_utilities.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, rule, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cached_self_expanding_rule_assertionP_internal(rule)));
            memoization_state.caching_state_put(caching_state, rule, results, (SubLObject)assertion_utilities.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 47666L)
    public static SubLObject safe_all_forward_rules_relevant_to_term(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert assertion_utilities.NIL != forts.fort_p(fort) : fort;
        SubLObject rules = (SubLObject)assertion_utilities.NIL;
        SubLObject threshold_exceededP = (SubLObject)assertion_utilities.NIL;
        try {
            thread.throwStack.push(assertion_utilities.$kw114$ALL_FORWARD_RULES_RELEVANT_TO_TERMS_THRESHOLD_EXCEEDED);
            final SubLObject _prev_bind_0 = assertion_utilities.$within_safe_all_forward_rules_relevant_to_termP$.currentBinding(thread);
            try {
                assertion_utilities.$within_safe_all_forward_rules_relevant_to_termP$.bind((SubLObject)assertion_utilities.T, thread);
                rules = all_forward_rules_relevant_to_term_int(fort);
            }
            finally {
                assertion_utilities.$within_safe_all_forward_rules_relevant_to_termP$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            threshold_exceededP = Errors.handleThrowable(ccatch_env_var, (SubLObject)assertion_utilities.$kw114$ALL_FORWARD_RULES_RELEVANT_TO_TERMS_THRESHOLD_EXCEEDED);
        }
        finally {
            thread.throwStack.pop();
        }
        rules = Sort.sort(rules, Symbols.symbol_function((SubLObject)assertion_utilities.$sym115$_), Symbols.symbol_function((SubLObject)assertion_utilities.$sym81$ASSERTION_DEPENDENT_COUNT));
        if (assertion_utilities.NIL != threshold_exceededP) {
            return (SubLObject)assertion_utilities.$kw116$ALL;
        }
        return rules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 48276L)
    public static SubLObject all_forward_rules_relevant_to_term(final SubLObject fort) {
        assert assertion_utilities.NIL != forts.fort_p(fort) : fort;
        SubLObject rules = all_forward_rules_relevant_to_term_int(fort);
        rules = Sort.sort(rules, Symbols.symbol_function((SubLObject)assertion_utilities.$sym115$_), Symbols.symbol_function((SubLObject)assertion_utilities.$sym81$ASSERTION_DEPENDENT_COUNT));
        return rules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 48738L)
    public static SubLObject safe_all_forward_rules_relevant_to_terms(final SubLObject v_forts) {
        return possibly_safe_all_forward_rules_relevant_to_terms(v_forts, (SubLObject)assertion_utilities.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 48872L)
    public static SubLObject all_forward_rules_relevant_to_terms(final SubLObject v_forts) {
        return possibly_safe_all_forward_rules_relevant_to_terms(v_forts, (SubLObject)assertion_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 49003L)
    public static SubLObject possibly_safe_all_forward_rules_relevant_to_term(final SubLObject fort, final SubLObject safeP) {
        return (assertion_utilities.NIL != safeP) ? safe_all_forward_rules_relevant_to_term(fort) : all_forward_rules_relevant_to_term(fort);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 49216L)
    public static SubLObject possibly_safe_all_forward_rules_relevant_to_terms(final SubLObject v_forts, final SubLObject safeP) {
        assert assertion_utilities.NIL != list_utilities.non_dotted_list_p(v_forts) : v_forts;
        SubLObject cdolist_list_var = v_forts;
        SubLObject elem = (SubLObject)assertion_utilities.NIL;
        elem = cdolist_list_var.first();
        while (assertion_utilities.NIL != cdolist_list_var) {
            assert assertion_utilities.NIL != forts.fort_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        SubLObject rules = (SubLObject)assertion_utilities.NIL;
        cdolist_list_var = v_forts;
        SubLObject fort = (SubLObject)assertion_utilities.NIL;
        fort = cdolist_list_var.first();
        while (assertion_utilities.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$40 = possibly_safe_all_forward_rules_relevant_to_term(fort, safeP);
            SubLObject rule = (SubLObject)assertion_utilities.NIL;
            rule = cdolist_list_var_$40.first();
            while (assertion_utilities.NIL != cdolist_list_var_$40) {
                final SubLObject item_var = rule;
                if (assertion_utilities.NIL == conses_high.member(item_var, rules, Symbols.symbol_function((SubLObject)assertion_utilities.EQL), Symbols.symbol_function((SubLObject)assertion_utilities.IDENTITY))) {
                    rules = (SubLObject)ConsesLow.cons(item_var, rules);
                }
                cdolist_list_var_$40 = cdolist_list_var_$40.rest();
                rule = cdolist_list_var_$40.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            fort = cdolist_list_var.first();
        }
        rules = Sort.sort(rules, Symbols.symbol_function((SubLObject)assertion_utilities.$sym115$_), Symbols.symbol_function((SubLObject)assertion_utilities.$sym81$ASSERTION_DEPENDENT_COUNT));
        return rules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 49826L)
    public static SubLObject deduction_forward_rule_supports(final SubLObject deduction) {
        SubLObject forward_rules = (SubLObject)assertion_utilities.NIL;
        SubLObject cdolist_list_var = deductions_high.deduction_supports(deduction);
        SubLObject support = (SubLObject)assertion_utilities.NIL;
        support = cdolist_list_var.first();
        while (assertion_utilities.NIL != cdolist_list_var) {
            if (assertion_utilities.NIL != assertions_high.forward_ruleP(support)) {
                forward_rules = (SubLObject)ConsesLow.cons(support, forward_rules);
            }
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        }
        return Sequences.nreverse(forward_rules);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 50604L)
    public static SubLObject all_forward_rules_relevant_to_term_int(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rules = (SubLObject)assertion_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = assertion_utilities.$all_forward_rules_relevant_to_term_argument_set$.currentBinding(thread);
        final SubLObject _prev_bind_4 = assertion_utilities.$all_forward_rules_relevant_to_term_dependent_set$.currentBinding(thread);
        final SubLObject _prev_bind_5 = assertion_utilities.$all_forward_rules_relevant_to_term_nart_set$.currentBinding(thread);
        final SubLObject _prev_bind_6 = assertion_utilities.$all_forward_rules_relevant_to_term_result_set$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)assertion_utilities.$sym58$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(assertion_utilities.$const59$EverythingPSC, thread);
            assertion_utilities.$all_forward_rules_relevant_to_term_argument_set$.bind(set.new_set(Symbols.symbol_function((SubLObject)assertion_utilities.EQL), (SubLObject)assertion_utilities.UNPROVIDED), thread);
            assertion_utilities.$all_forward_rules_relevant_to_term_dependent_set$.bind(set.new_set(Symbols.symbol_function((SubLObject)assertion_utilities.EQL), (SubLObject)assertion_utilities.UNPROVIDED), thread);
            assertion_utilities.$all_forward_rules_relevant_to_term_nart_set$.bind(set.new_set(Symbols.symbol_function((SubLObject)assertion_utilities.EQL), (SubLObject)assertion_utilities.UNPROVIDED), thread);
            assertion_utilities.$all_forward_rules_relevant_to_term_result_set$.bind(set.new_set(Symbols.symbol_function((SubLObject)assertion_utilities.EQL), (SubLObject)assertion_utilities.UNPROVIDED), thread);
            compute_all_forward_rules_relevant_to_term(fort, (SubLObject)assertion_utilities.$list118);
            rules = assertion_utilities.$all_forward_rules_relevant_to_term_result_set$.getDynamicValue(thread);
        }
        finally {
            assertion_utilities.$all_forward_rules_relevant_to_term_result_set$.rebind(_prev_bind_6, thread);
            assertion_utilities.$all_forward_rules_relevant_to_term_nart_set$.rebind(_prev_bind_5, thread);
            assertion_utilities.$all_forward_rules_relevant_to_term_dependent_set$.rebind(_prev_bind_4, thread);
            assertion_utilities.$all_forward_rules_relevant_to_term_argument_set$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return set.set_element_list(rules);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 51216L)
    public static SubLObject compute_all_forward_rules_relevant_to_term(final SubLObject fort, final SubLObject walk_directions) {
        if (assertion_utilities.NIL != kb_mapping_macros.do_term_index_key_validator(fort, (SubLObject)assertion_utilities.NIL)) {
            final SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(fort, (SubLObject)assertion_utilities.NIL);
            SubLObject done_var = (SubLObject)assertion_utilities.NIL;
            final SubLObject token_var = (SubLObject)assertion_utilities.NIL;
            while (assertion_utilities.NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                if (assertion_utilities.NIL != valid) {
                    SubLObject final_index_iterator = (SubLObject)assertion_utilities.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)assertion_utilities.NIL, (SubLObject)assertion_utilities.NIL, (SubLObject)assertion_utilities.NIL);
                        SubLObject done_var_$41 = (SubLObject)assertion_utilities.NIL;
                        final SubLObject token_var_$42 = (SubLObject)assertion_utilities.NIL;
                        while (assertion_utilities.NIL == done_var_$41) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$42);
                            final SubLObject valid_$43 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$42.eql(assertion));
                            if (assertion_utilities.NIL != valid_$43 && assertion_utilities.NIL != kb_mapping_macros.do_term_index_assertion_match_p(assertion, final_index_spec)) {
                                SubLObject cdolist_list_var = walk_directions;
                                SubLObject walk_direction = (SubLObject)assertion_utilities.NIL;
                                walk_direction = cdolist_list_var.first();
                                while (assertion_utilities.NIL != cdolist_list_var) {
                                    compute_all_forward_rules_relevant_to_assertion(assertion, walk_direction);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    walk_direction = cdolist_list_var.first();
                                }
                            }
                            done_var_$41 = (SubLObject)SubLObjectFactory.makeBoolean(assertion_utilities.NIL == valid_$43);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)assertion_utilities.T);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (assertion_utilities.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = (SubLObject)SubLObjectFactory.makeBoolean(assertion_utilities.NIL == valid);
            }
        }
        return (SubLObject)assertion_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 51475L)
    public static SubLObject compute_all_forward_rules_relevant_to_assertion(final SubLObject assertion, final SubLObject walk_direction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (assertion_utilities.NIL != gaf_assertion_with_pred_p(assertion, assertion_utilities.$const119$trueRule)) {
            return (SubLObject)assertion_utilities.NIL;
        }
        if (assertion_utilities.NIL == assertions_high.forward_deduced_assertionP(assertion, (SubLObject)assertion_utilities.NIL)) {
            return (SubLObject)assertion_utilities.NIL;
        }
        if (walk_direction.eql((SubLObject)assertion_utilities.$kw120$ARGUMENT_)) {
            if (assertion_utilities.NIL != set.set_memberP(assertion, assertion_utilities.$all_forward_rules_relevant_to_term_argument_set$.getDynamicValue(thread))) {
                return (SubLObject)assertion_utilities.NIL;
            }
            set.set_add(assertion, assertion_utilities.$all_forward_rules_relevant_to_term_argument_set$.getDynamicValue(thread));
        }
        else if (walk_direction.eql((SubLObject)assertion_utilities.$kw121$DEPENDENT_)) {
            if (assertion_utilities.NIL != set.set_memberP(assertion, assertion_utilities.$all_forward_rules_relevant_to_term_dependent_set$.getDynamicValue(thread))) {
                return (SubLObject)assertion_utilities.NIL;
            }
            set.set_add(assertion, assertion_utilities.$all_forward_rules_relevant_to_term_dependent_set$.getDynamicValue(thread));
        }
        SubLObject cdolist_list_var = cycl_utilities.expression_narts(assertion, (SubLObject)assertion_utilities.T, (SubLObject)assertion_utilities.UNPROVIDED);
        SubLObject nart = (SubLObject)assertion_utilities.NIL;
        nart = cdolist_list_var.first();
        while (assertion_utilities.NIL != cdolist_list_var) {
            if (assertion_utilities.NIL == set.set_memberP(nart, assertion_utilities.$all_forward_rules_relevant_to_term_nart_set$.getDynamicValue(thread))) {
                set.set_add(nart, assertion_utilities.$all_forward_rules_relevant_to_term_nart_set$.getDynamicValue(thread));
                if (assertion_utilities.NIL != kb_accessors.skolemize_forwardP(cycl_utilities.nat_functor(nart), assertions_high.assertion_mt(assertion))) {
                    compute_all_forward_rules_relevant_to_term(nart, (SubLObject)ConsesLow.list(walk_direction));
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            nart = cdolist_list_var.first();
        }
        compute_all_forward_rules_relevant_to_assertion_int(assertion, walk_direction);
        return (SubLObject)assertion_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 52752L)
    public static SubLObject compute_all_forward_rules_relevant_to_assertion_int(final SubLObject assertion, final SubLObject walk_direction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = assertions_high.assertion_arguments(assertion);
        SubLObject argument = (SubLObject)assertion_utilities.NIL;
        argument = cdolist_list_var.first();
        while (assertion_utilities.NIL != cdolist_list_var) {
            if (assertion_utilities.NIL != deduction_handles.deduction_p(argument)) {
                final SubLObject supports = deduction_forward_rule_supports(argument);
                set_utilities.set_add_all(supports, assertion_utilities.$all_forward_rules_relevant_to_term_result_set$.getDynamicValue(thread));
                if (assertion_utilities.NIL != assertion_utilities.$within_safe_all_forward_rules_relevant_to_termP$.getDynamicValue(thread)) {
                    final SubLObject size = set.set_size(assertion_utilities.$all_forward_rules_relevant_to_term_result_set$.getDynamicValue(thread));
                    if (size.numG(assertion_utilities.$all_forward_rules_relevant_to_term_threshold$.getDynamicValue(thread))) {
                        Dynamic.sublisp_throw((SubLObject)assertion_utilities.$kw114$ALL_FORWARD_RULES_RELEVANT_TO_TERMS_THRESHOLD_EXCEEDED, size);
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            argument = cdolist_list_var.first();
        }
        if (walk_direction.eql((SubLObject)assertion_utilities.$kw120$ARGUMENT_)) {
            SubLObject cdolist_list_var2 = assertions_high.assertion_arguments(assertion);
            SubLObject argument2 = (SubLObject)assertion_utilities.NIL;
            argument2 = cdolist_list_var2.first();
            while (assertion_utilities.NIL != cdolist_list_var2) {
                if (assertion_utilities.NIL != deduction_handles.deduction_p(argument2)) {
                    SubLObject cdolist_list_var_$44 = deductions_high.deduction_supports(argument2);
                    SubLObject supporting_assertion = (SubLObject)assertion_utilities.NIL;
                    supporting_assertion = cdolist_list_var_$44.first();
                    while (assertion_utilities.NIL != cdolist_list_var_$44) {
                        if (assertion_utilities.NIL != assertion_handles.assertion_p(supporting_assertion)) {
                            compute_all_forward_rules_relevant_to_assertion(supporting_assertion, walk_direction);
                        }
                        cdolist_list_var_$44 = cdolist_list_var_$44.rest();
                        supporting_assertion = cdolist_list_var_$44.first();
                    }
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                argument2 = cdolist_list_var2.first();
            }
        }
        else if (walk_direction.eql((SubLObject)assertion_utilities.$kw121$DEPENDENT_)) {
            final SubLObject set_contents_var = assertions_high.assertion_dependents(assertion);
            SubLObject basis_object;
            SubLObject state;
            SubLObject deduction;
            SubLObject dependent_assertion;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)assertion_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); assertion_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                deduction = set_contents.do_set_contents_next(basis_object, state);
                if (assertion_utilities.NIL != set_contents.do_set_contents_element_validP(state, deduction)) {
                    dependent_assertion = deductions_high.deduction_assertion(deduction);
                    if (assertion_utilities.NIL != assertion_handles.assertion_p(dependent_assertion)) {
                        compute_all_forward_rules_relevant_to_assertion(dependent_assertion, walk_direction);
                    }
                }
            }
        }
        return (SubLObject)assertion_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 54041L)
    public static SubLObject deduction_asserted_assertion_supports(final SubLObject deduction, SubLObject depth_limit) {
        if (depth_limit == assertion_utilities.UNPROVIDED) {
            depth_limit = (SubLObject)assertion_utilities.ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = assertion_utilities.$deduction_asserted_assertion_supports_deductions_processed$.currentBinding(thread);
        final SubLObject _prev_bind_2 = assertion_utilities.$deduction_asserted_assertion_counts$.currentBinding(thread);
        try {
            assertion_utilities.$deduction_asserted_assertion_supports_deductions_processed$.bind(dictionary.new_dictionary((SubLObject)assertion_utilities.UNPROVIDED, (SubLObject)assertion_utilities.UNPROVIDED), thread);
            assertion_utilities.$deduction_asserted_assertion_counts$.bind(dictionary.new_dictionary((SubLObject)assertion_utilities.UNPROVIDED, (SubLObject)assertion_utilities.UNPROVIDED), thread);
            deduction_asserted_assertion_supports_int(deduction, depth_limit);
            return dictionary_utilities.copy_dictionary(assertion_utilities.$deduction_asserted_assertion_counts$.getDynamicValue(thread));
        }
        finally {
            assertion_utilities.$deduction_asserted_assertion_counts$.rebind(_prev_bind_2, thread);
            assertion_utilities.$deduction_asserted_assertion_supports_deductions_processed$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 54677L)
    public static SubLObject deduction_asserted_assertion_supports_int(final SubLObject deduction, final SubLObject depth_limit) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (assertion_utilities.NIL != dictionary.dictionary_lookup(assertion_utilities.$deduction_asserted_assertion_supports_deductions_processed$.getDynamicValue(thread), deduction, (SubLObject)assertion_utilities.UNPROVIDED)) {
            return (SubLObject)assertion_utilities.NIL;
        }
        dictionary.dictionary_enter(assertion_utilities.$deduction_asserted_assertion_supports_deductions_processed$.getDynamicValue(thread), deduction, (SubLObject)assertion_utilities.T);
        SubLObject supports_to_descend = deductions_high.deduction_supports(deduction);
        SubLObject deductions_to_descend = (SubLObject)assertion_utilities.NIL;
        SubLObject done_supports = (SubLObject)assertion_utilities.NIL;
        SubLObject support = (SubLObject)assertion_utilities.NIL;
        while (assertion_utilities.NIL != supports_to_descend) {
            support = supports_to_descend.first();
            supports_to_descend = supports_to_descend.rest();
            if (assertion_utilities.NIL != assertion_handles.assertion_p(support) && assertion_utilities.NIL != assertions_high.asserted_assertionP(support)) {
                dictionary_utilities.dictionary_increment(assertion_utilities.$deduction_asserted_assertion_counts$.getDynamicValue(thread), support, (SubLObject)assertion_utilities.UNPROVIDED);
            }
            else if (assertion_utilities.NIL != assertion_handles.assertion_p(support) && assertion_utilities.NIL != assertions_high.deduced_assertionP(support)) {
                SubLObject cdolist_list_var = assertions_high.assertion_arguments(support);
                SubLObject argument = (SubLObject)assertion_utilities.NIL;
                argument = cdolist_list_var.first();
                while (assertion_utilities.NIL != cdolist_list_var) {
                    if (assertion_utilities.NIL != assertion_handles.assertion_p(argument) && assertion_utilities.NIL != assertions_high.asserted_assertionP(argument)) {
                        dictionary_utilities.dictionary_increment(assertion_utilities.$deduction_asserted_assertion_counts$.getDynamicValue(thread), support, (SubLObject)assertion_utilities.UNPROVIDED);
                    }
                    else if (assertion_utilities.NIL != deduction_handles.deduction_p(argument)) {
                        final SubLObject item_var = argument;
                        if (assertion_utilities.NIL == conses_high.member(item_var, deductions_to_descend, Symbols.symbol_function((SubLObject)assertion_utilities.EQL), Symbols.symbol_function((SubLObject)assertion_utilities.IDENTITY))) {
                            deductions_to_descend = (SubLObject)ConsesLow.cons(item_var, deductions_to_descend);
                        }
                    }
                    else {
                        Errors.sublisp_break((SubLObject)assertion_utilities.$str122$can_t_handle_argument__S_yet, new SubLObject[] { argument });
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    argument = cdolist_list_var.first();
                }
            }
            else {
                SubLObject cdolist_list_var = arguments.support_justification(support);
                SubLObject sub_support = (SubLObject)assertion_utilities.NIL;
                sub_support = cdolist_list_var.first();
                while (assertion_utilities.NIL != cdolist_list_var) {
                    if (assertion_utilities.NIL != deduction_handles.deduction_p(sub_support)) {
                        final SubLObject item_var = sub_support;
                        if (assertion_utilities.NIL == conses_high.member(item_var, deductions_to_descend, Symbols.symbol_function((SubLObject)assertion_utilities.EQL), Symbols.symbol_function((SubLObject)assertion_utilities.IDENTITY))) {
                            deductions_to_descend = (SubLObject)ConsesLow.cons(item_var, deductions_to_descend);
                        }
                    }
                    else if (assertion_utilities.NIL != arguments.support_p(sub_support)) {
                        if (assertion_utilities.NIL == list_utilities.member_equalP(sub_support, done_supports)) {
                            final SubLObject item_var = sub_support;
                            if (assertion_utilities.NIL == conses_high.member(item_var, supports_to_descend, Symbols.symbol_function((SubLObject)assertion_utilities.EQL), Symbols.symbol_function((SubLObject)assertion_utilities.IDENTITY))) {
                                supports_to_descend = (SubLObject)ConsesLow.cons(item_var, supports_to_descend);
                            }
                        }
                    }
                    else {
                        Errors.sublisp_break((SubLObject)assertion_utilities.$str123$can_t_handle_sub_support__S_yet, new SubLObject[] { sub_support });
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    sub_support = cdolist_list_var.first();
                }
            }
            final SubLObject item_var2 = support;
            if (assertion_utilities.NIL == conses_high.member(item_var2, done_supports, Symbols.symbol_function((SubLObject)assertion_utilities.EQL), Symbols.symbol_function((SubLObject)assertion_utilities.IDENTITY))) {
                done_supports = (SubLObject)ConsesLow.cons(item_var2, done_supports);
            }
        }
        if (!depth_limit.eql((SubLObject)assertion_utilities.ONE_INTEGER)) {
            SubLObject cdolist_list_var = deductions_to_descend;
            SubLObject deduction_to_descend = (SubLObject)assertion_utilities.NIL;
            deduction_to_descend = cdolist_list_var.first();
            while (assertion_utilities.NIL != cdolist_list_var) {
                deduction_asserted_assertion_supports_int(deduction_to_descend, Numbers.subtract(depth_limit, (SubLObject)assertion_utilities.ONE_INTEGER));
                cdolist_list_var = cdolist_list_var.rest();
                deduction_to_descend = cdolist_list_var.first();
            }
        }
        return (SubLObject)assertion_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 56422L)
    public static SubLObject assertion_asserted_assertion_supports(final SubLObject assertion, SubLObject depth_limit) {
        if (depth_limit == assertion_utilities.UNPROVIDED) {
            depth_limit = (SubLObject)assertion_utilities.ZERO_INTEGER;
        }
        final SubLObject result = set.new_set(Symbols.symbol_function((SubLObject)assertion_utilities.EQUAL), (SubLObject)assertion_utilities.UNPROVIDED);
        SubLObject cdolist_list_var = assertions_high.assertion_deductions(assertion);
        SubLObject deduction = (SubLObject)assertion_utilities.NIL;
        deduction = cdolist_list_var.first();
        while (assertion_utilities.NIL != cdolist_list_var) {
            final SubLObject assertion_supports = deduction_asserted_assertion_supports(deduction, depth_limit);
            set_utilities.set_add_all(dictionary.dictionary_keys(assertion_supports), result);
            cdolist_list_var = cdolist_list_var.rest();
            deduction = cdolist_list_var.first();
        }
        return set.set_element_list(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 57158L)
    public static SubLObject gather_all_exception_rules(SubLObject mt) {
        if (mt == assertion_utilities.UNPROVIDED) {
            mt = (SubLObject)assertion_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject exceptions = set.new_set(Symbols.symbol_function((SubLObject)assertion_utilities.EQL), (SubLObject)assertion_utilities.UNPROVIDED);
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject message_var = (SubLObject)assertion_utilities.$str124$gathering_exception_rules;
            final SubLObject total = assertions_low.rule_count();
            SubLObject sofar = (SubLObject)assertion_utilities.ZERO_INTEGER;
            final SubLObject _prev_bind_0_$45 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_1_$46 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_2_$47 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)assertion_utilities.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)assertion_utilities.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)assertion_utilities.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(message_var);
                    final SubLObject iterator_var = kb_iterators.new_rule_iterator();
                    SubLObject valid;
                    for (SubLObject done_var = (SubLObject)assertion_utilities.NIL; assertion_utilities.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(assertion_utilities.NIL == valid)) {
                        thread.resetMultipleValues();
                        final SubLObject rule = iteration.iteration_next(iterator_var);
                        valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (assertion_utilities.NIL != valid) {
                            sofar = Numbers.add(sofar, (SubLObject)assertion_utilities.ONE_INTEGER);
                            utilities_macros.note_percent_progress(sofar, total);
                            if (assertion_utilities.NIL != abnormal.rule_has_exceptionsP(rule) && assertion_utilities.NIL != kb_mapping_macros.do_exception_rule_index_key_validator(rule, (SubLObject)assertion_utilities.NIL)) {
                                final SubLObject iterator_var_$48 = kb_mapping_macros.new_exception_rule_final_index_spec_iterator(rule, (SubLObject)assertion_utilities.NIL);
                                SubLObject done_var_$49 = (SubLObject)assertion_utilities.NIL;
                                final SubLObject token_var = (SubLObject)assertion_utilities.NIL;
                                while (assertion_utilities.NIL == done_var_$49) {
                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var_$48, token_var);
                                    final SubLObject valid_$50 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                    if (assertion_utilities.NIL != valid_$50) {
                                        SubLObject final_index_iterator = (SubLObject)assertion_utilities.NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)assertion_utilities.$kw73$RULE, (SubLObject)assertion_utilities.NIL, (SubLObject)assertion_utilities.NIL);
                                            SubLObject done_var_$50 = (SubLObject)assertion_utilities.NIL;
                                            final SubLObject token_var_$52 = (SubLObject)assertion_utilities.NIL;
                                            while (assertion_utilities.NIL == done_var_$50) {
                                                final SubLObject except = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$52);
                                                final SubLObject valid_$51 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$52.eql(except));
                                                if (assertion_utilities.NIL != valid_$51) {
                                                    set.set_add(except, exceptions);
                                                }
                                                done_var_$50 = (SubLObject)SubLObjectFactory.makeBoolean(assertion_utilities.NIL == valid_$51);
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$46 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)assertion_utilities.T, thread);
                                                final SubLObject _values = Values.getValuesAsVector();
                                                if (assertion_utilities.NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                Values.restoreValuesFromVector(_values);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$46, thread);
                                            }
                                        }
                                    }
                                    done_var_$49 = (SubLObject)SubLObjectFactory.makeBoolean(assertion_utilities.NIL == valid_$50);
                                }
                            }
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$47 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)assertion_utilities.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$47, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2_$47, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1_$46, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_$45, thread);
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return sort_assertions(set.set_element_list(exceptions));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 57741L)
    public static SubLObject gather_all_pragma_rules(SubLObject mt) {
        if (mt == assertion_utilities.UNPROVIDED) {
            mt = (SubLObject)assertion_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pragmas = set.new_set(Symbols.symbol_function((SubLObject)assertion_utilities.EQL), (SubLObject)assertion_utilities.UNPROVIDED);
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject message_var = (SubLObject)assertion_utilities.$str125$gathering_pragma_rules;
            final SubLObject total = assertions_low.rule_count();
            SubLObject sofar = (SubLObject)assertion_utilities.ZERO_INTEGER;
            final SubLObject _prev_bind_0_$56 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_1_$57 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_2_$58 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)assertion_utilities.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)assertion_utilities.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)assertion_utilities.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(message_var);
                    final SubLObject iterator_var = kb_iterators.new_rule_iterator();
                    SubLObject valid;
                    for (SubLObject done_var = (SubLObject)assertion_utilities.NIL; assertion_utilities.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(assertion_utilities.NIL == valid)) {
                        thread.resetMultipleValues();
                        final SubLObject rule = iteration.iteration_next(iterator_var);
                        valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (assertion_utilities.NIL != valid) {
                            sofar = Numbers.add(sofar, (SubLObject)assertion_utilities.ONE_INTEGER);
                            utilities_macros.note_percent_progress(sofar, total);
                            if (assertion_utilities.NIL != inference_worker_transformation.rule_assertion_has_some_pragmatic_requirementP(rule, (SubLObject)assertion_utilities.UNPROVIDED) && assertion_utilities.NIL != kb_mapping_macros.do_pragma_rule_index_key_validator(rule, (SubLObject)assertion_utilities.NIL)) {
                                final SubLObject iterator_var_$59 = kb_mapping_macros.new_pragma_rule_final_index_spec_iterator(rule, (SubLObject)assertion_utilities.NIL);
                                SubLObject done_var_$60 = (SubLObject)assertion_utilities.NIL;
                                final SubLObject token_var = (SubLObject)assertion_utilities.NIL;
                                while (assertion_utilities.NIL == done_var_$60) {
                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var_$59, token_var);
                                    final SubLObject valid_$61 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                    if (assertion_utilities.NIL != valid_$61) {
                                        SubLObject final_index_iterator = (SubLObject)assertion_utilities.NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)assertion_utilities.$kw73$RULE, (SubLObject)assertion_utilities.NIL, (SubLObject)assertion_utilities.NIL);
                                            SubLObject done_var_$61 = (SubLObject)assertion_utilities.NIL;
                                            final SubLObject token_var_$63 = (SubLObject)assertion_utilities.NIL;
                                            while (assertion_utilities.NIL == done_var_$61) {
                                                final SubLObject pragma = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$63);
                                                final SubLObject valid_$62 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$63.eql(pragma));
                                                if (assertion_utilities.NIL != valid_$62) {
                                                    set.set_add(pragma, pragmas);
                                                }
                                                done_var_$61 = (SubLObject)SubLObjectFactory.makeBoolean(assertion_utilities.NIL == valid_$62);
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$57 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)assertion_utilities.T, thread);
                                                final SubLObject _values = Values.getValuesAsVector();
                                                if (assertion_utilities.NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                Values.restoreValuesFromVector(_values);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$57, thread);
                                            }
                                        }
                                    }
                                    done_var_$60 = (SubLObject)SubLObjectFactory.makeBoolean(assertion_utilities.NIL == valid_$61);
                                }
                            }
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$58 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)assertion_utilities.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$58, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2_$58, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1_$57, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_$56, thread);
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return sort_assertions(set.set_element_list(pragmas));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 58253L)
    public static SubLObject gather_all_lifting_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject lifting_rules = set.new_set(Symbols.symbol_function((SubLObject)assertion_utilities.EQL), (SubLObject)assertion_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)assertion_utilities.$sym58$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(assertion_utilities.$const59$EverythingPSC, thread);
            final SubLObject message_var = (SubLObject)assertion_utilities.$str126$gathering_lifting_rules;
            final SubLObject total = assertions_low.rule_count();
            SubLObject sofar = (SubLObject)assertion_utilities.ZERO_INTEGER;
            final SubLObject _prev_bind_0_$67 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_1_$68 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)assertion_utilities.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)assertion_utilities.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)assertion_utilities.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(message_var);
                    final SubLObject iterator_var = kb_iterators.new_rule_iterator();
                    SubLObject valid;
                    for (SubLObject done_var = (SubLObject)assertion_utilities.NIL; assertion_utilities.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(assertion_utilities.NIL == valid)) {
                        thread.resetMultipleValues();
                        final SubLObject rule = iteration.iteration_next(iterator_var);
                        valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (assertion_utilities.NIL != valid) {
                            sofar = Numbers.add(sofar, (SubLObject)assertion_utilities.ONE_INTEGER);
                            utilities_macros.note_percent_progress(sofar, total);
                            if (assertion_utilities.NIL != lifting_ruleP(rule)) {
                                set.set_add(rule, lifting_rules);
                            }
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$68 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)assertion_utilities.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$68, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1_$68, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_$67, thread);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return sort_assertions(set.set_element_list(lifting_rules));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 58591L)
    public static SubLObject lifting_ruleP(final SubLObject rule) {
        if (assertion_utilities.NIL != assertions_high.rule_assertionP(rule)) {
            final SubLObject cnf = assertions_high.assertion_cnf(rule);
            SubLObject cdolist_list_var = clauses.neg_lits(cnf);
            SubLObject neg_lit = (SubLObject)assertion_utilities.NIL;
            neg_lit = cdolist_list_var.first();
            while (assertion_utilities.NIL != cdolist_list_var) {
                if (assertion_utilities.NIL != el_utilities.el_formula_with_operator_p(neg_lit, assertion_utilities.$const127$ist)) {
                    return neg_lit;
                }
                cdolist_list_var = cdolist_list_var.rest();
                neg_lit = cdolist_list_var.first();
            }
            cdolist_list_var = clauses.pos_lits(cnf);
            SubLObject pos_lit = (SubLObject)assertion_utilities.NIL;
            pos_lit = cdolist_list_var.first();
            while (assertion_utilities.NIL != cdolist_list_var) {
                if (assertion_utilities.NIL != el_utilities.el_formula_with_operator_p(pos_lit, assertion_utilities.$const127$ist)) {
                    return pos_lit;
                }
                cdolist_list_var = cdolist_list_var.rest();
                pos_lit = cdolist_list_var.first();
            }
        }
        return (SubLObject)assertion_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 58965L)
    public static SubLObject lifting_consequent_ruleP(final SubLObject rule) {
        if (assertion_utilities.NIL != assertions_high.rule_assertionP(rule)) {
            final SubLObject cnf = assertions_high.assertion_cnf(rule);
            SubLObject cdolist_list_var = clauses.pos_lits(cnf);
            SubLObject pos_lit = (SubLObject)assertion_utilities.NIL;
            pos_lit = cdolist_list_var.first();
            while (assertion_utilities.NIL != cdolist_list_var) {
                if (assertion_utilities.NIL != el_utilities.el_formula_with_operator_p(pos_lit, assertion_utilities.$const127$ist)) {
                    return pos_lit;
                }
                cdolist_list_var = cdolist_list_var.rest();
                pos_lit = cdolist_list_var.first();
            }
        }
        return (SubLObject)assertion_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 59251L)
    public static SubLObject universal_lifting_ruleP(final SubLObject rule) {
        return (SubLObject)SubLObjectFactory.makeBoolean(assertion_utilities.NIL != lifting_consequent_ruleP(rule) && assertion_utilities.NIL != kb_mapping_utilities.fpred_value_in_any_mt(rule, assertion_utilities.$const128$universalLiftingRule, (SubLObject)assertion_utilities.ONE_INTEGER, (SubLObject)assertion_utilities.ONE_INTEGER, (SubLObject)assertion_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 59413L)
    public static SubLObject rule_has_unlabelled_dont_care_variableP(final SubLObject rule) {
        assert assertion_utilities.NIL != assertions_high.rule_assertionP(rule) : rule;
        if (assertion_utilities.NIL != assertions_high.single_literal_ruleP(rule)) {
            return (SubLObject)assertion_utilities.NIL;
        }
        final SubLObject cnf = assertions_high.assertion_cnf(rule);
        final SubLObject names = assertions_high.assertion_variable_names(rule);
        SubLObject list_var = (SubLObject)assertion_utilities.NIL;
        SubLObject name = (SubLObject)assertion_utilities.NIL;
        SubLObject id = (SubLObject)assertion_utilities.NIL;
        list_var = names;
        name = list_var.first();
        for (id = (SubLObject)assertion_utilities.ZERO_INTEGER; assertion_utilities.NIL != list_var; list_var = list_var.rest(), name = list_var.first(), id = Numbers.add((SubLObject)assertion_utilities.ONE_INTEGER, id)) {
            final SubLObject variable = variables.find_variable_by_id(id);
            SubLObject lit_count = (SubLObject)assertion_utilities.ZERO_INTEGER;
            SubLObject cdolist_list_var = clauses.neg_lits(cnf);
            SubLObject lit = (SubLObject)assertion_utilities.NIL;
            lit = cdolist_list_var.first();
            while (assertion_utilities.NIL != cdolist_list_var) {
                if (assertion_utilities.NIL != cycl_utilities.expression_find(variable, lit, (SubLObject)assertion_utilities.UNPROVIDED, (SubLObject)assertion_utilities.UNPROVIDED, (SubLObject)assertion_utilities.UNPROVIDED)) {
                    lit_count = Numbers.add(lit_count, (SubLObject)assertion_utilities.ONE_INTEGER);
                }
                cdolist_list_var = cdolist_list_var.rest();
                lit = cdolist_list_var.first();
            }
            cdolist_list_var = clauses.pos_lits(cnf);
            lit = (SubLObject)assertion_utilities.NIL;
            lit = cdolist_list_var.first();
            while (assertion_utilities.NIL != cdolist_list_var) {
                if (assertion_utilities.NIL != cycl_utilities.expression_find(variable, lit, (SubLObject)assertion_utilities.UNPROVIDED, (SubLObject)assertion_utilities.UNPROVIDED, (SubLObject)assertion_utilities.UNPROVIDED)) {
                    lit_count = Numbers.add(lit_count, (SubLObject)assertion_utilities.ONE_INTEGER);
                }
                cdolist_list_var = cdolist_list_var.rest();
                lit = cdolist_list_var.first();
            }
            if (assertion_utilities.ONE_INTEGER.numE(lit_count) && assertion_utilities.NIL == string_utilities.starts_with(name, (SubLObject)assertion_utilities.$str129$__)) {
                return variable;
            }
        }
        return (SubLObject)assertion_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 60133L)
    public static SubLObject rule_unlabelled_dont_care_variables(final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert assertion_utilities.NIL != assertions_high.rule_assertionP(rule) : rule;
        if (assertion_utilities.NIL != assertions_high.single_literal_ruleP(rule)) {
            return (SubLObject)assertion_utilities.NIL;
        }
        final SubLObject cnf = assertions_high.assertion_cnf(rule);
        final SubLObject names = assertions_high.assertion_variable_names(rule);
        SubLObject unlabelled_dont_care_variables = (SubLObject)assertion_utilities.NIL;
        final SubLObject _prev_bind_0 = cycl_utilities.$opaque_arg_function$.currentBinding(thread);
        try {
            cycl_utilities.$opaque_arg_function$.bind((SubLObject)assertion_utilities.$sym130$FALSE, thread);
            SubLObject list_var = (SubLObject)assertion_utilities.NIL;
            SubLObject name = (SubLObject)assertion_utilities.NIL;
            SubLObject id = (SubLObject)assertion_utilities.NIL;
            list_var = names;
            name = list_var.first();
            for (id = (SubLObject)assertion_utilities.ZERO_INTEGER; assertion_utilities.NIL != list_var; list_var = list_var.rest(), name = list_var.first(), id = Numbers.add((SubLObject)assertion_utilities.ONE_INTEGER, id)) {
                final SubLObject variable = variables.find_variable_by_id(id);
                SubLObject lit_count = (SubLObject)assertion_utilities.ZERO_INTEGER;
                SubLObject cdolist_list_var = clauses.neg_lits(cnf);
                SubLObject lit = (SubLObject)assertion_utilities.NIL;
                lit = cdolist_list_var.first();
                while (assertion_utilities.NIL != cdolist_list_var) {
                    if (assertion_utilities.NIL != cycl_utilities.expression_find(variable, lit, (SubLObject)assertion_utilities.UNPROVIDED, (SubLObject)assertion_utilities.UNPROVIDED, (SubLObject)assertion_utilities.UNPROVIDED)) {
                        lit_count = Numbers.add(lit_count, (SubLObject)assertion_utilities.ONE_INTEGER);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    lit = cdolist_list_var.first();
                }
                cdolist_list_var = clauses.pos_lits(cnf);
                lit = (SubLObject)assertion_utilities.NIL;
                lit = cdolist_list_var.first();
                while (assertion_utilities.NIL != cdolist_list_var) {
                    if (assertion_utilities.NIL != cycl_utilities.expression_find(variable, lit, (SubLObject)assertion_utilities.UNPROVIDED, (SubLObject)assertion_utilities.UNPROVIDED, (SubLObject)assertion_utilities.UNPROVIDED)) {
                        lit_count = Numbers.add(lit_count, (SubLObject)assertion_utilities.ONE_INTEGER);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    lit = cdolist_list_var.first();
                }
                if (assertion_utilities.ONE_INTEGER.numE(lit_count) && assertion_utilities.NIL == string_utilities.starts_with(name, (SubLObject)assertion_utilities.$str129$__)) {
                    unlabelled_dont_care_variables = (SubLObject)ConsesLow.cons(variable, unlabelled_dont_care_variables);
                }
            }
        }
        finally {
            cycl_utilities.$opaque_arg_function$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(unlabelled_dont_care_variables);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 60956L)
    public static SubLObject assertion_findable_by_idP(final SubLObject assertion) {
        return Equality.eql(assertion, assertion_handles.find_assertion_by_id(assertion_handles.assertion_id(assertion)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 61173L)
    public static SubLObject embedded_assertions(final SubLObject assertion, SubLObject include_selfP, SubLObject penetrate_hl_structuresP) {
        if (include_selfP == assertion_utilities.UNPROVIDED) {
            include_selfP = (SubLObject)assertion_utilities.NIL;
        }
        if (penetrate_hl_structuresP == assertion_utilities.UNPROVIDED) {
            penetrate_hl_structuresP = (SubLObject)assertion_utilities.NIL;
        }
        final SubLObject embedded_assertions = (assertion_utilities.NIL != include_selfP) ? cycl_utilities.expression_gather(assertion, (SubLObject)assertion_utilities.$sym40$ASSERTION_P, (SubLObject)assertion_utilities.T, (SubLObject)assertion_utilities.UNPROVIDED, (SubLObject)assertion_utilities.UNPROVIDED, (SubLObject)assertion_utilities.UNPROVIDED) : cycl_utilities.expression_gather(fi.assertion_hl_formula(assertion, (SubLObject)assertion_utilities.UNPROVIDED), (SubLObject)assertion_utilities.$sym40$ASSERTION_P, penetrate_hl_structuresP, (SubLObject)assertion_utilities.UNPROVIDED, (SubLObject)assertion_utilities.UNPROVIDED, (SubLObject)assertion_utilities.UNPROVIDED);
        return embedded_assertions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 61504L)
    public static SubLObject embedded_assertions_findable_by_idP(final SubLObject assertion, SubLObject include_selfP) {
        if (include_selfP == assertion_utilities.UNPROVIDED) {
            include_selfP = (SubLObject)assertion_utilities.NIL;
        }
        SubLObject cdolist_list_var;
        final SubLObject embedded_assertions = cdolist_list_var = embedded_assertions(assertion, include_selfP, (SubLObject)assertion_utilities.UNPROVIDED);
        SubLObject embedded_assertion = (SubLObject)assertion_utilities.NIL;
        embedded_assertion = cdolist_list_var.first();
        while (assertion_utilities.NIL != cdolist_list_var) {
            if (assertion_utilities.NIL == assertion_findable_by_idP(embedded_assertion)) {
                return (SubLObject)assertion_utilities.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            embedded_assertion = cdolist_list_var.first();
        }
        return (SubLObject)assertion_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 62011L)
    public static SubLObject assertions_containing_assertions_not_findable_by_id() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hosed_assertions = (SubLObject)assertion_utilities.NIL;
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = (SubLObject)assertion_utilities.$str131$Verifying_that_all_embedded_asser;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)assertion_utilities.ZERO_INTEGER;
        assert assertion_utilities.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)assertion_utilities.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)assertion_utilities.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)assertion_utilities.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$70 = idx;
                if (assertion_utilities.NIL == id_index.id_index_objects_empty_p(idx_$70, (SubLObject)assertion_utilities.$kw84$SKIP)) {
                    final SubLObject idx_$71 = idx_$70;
                    if (assertion_utilities.NIL == id_index.id_index_dense_objects_empty_p(idx_$71, (SubLObject)assertion_utilities.$kw84$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$71);
                        final SubLObject backwardP_var = (SubLObject)assertion_utilities.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject ass;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)assertion_utilities.NIL, v_iteration = (SubLObject)assertion_utilities.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)assertion_utilities.ONE_INTEGER)) {
                            a_id = ((assertion_utilities.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)assertion_utilities.ONE_INTEGER) : v_iteration);
                            a_handle = Vectors.aref(vector_var, a_id);
                            if (assertion_utilities.NIL == id_index.id_index_tombstone_p(a_handle) || assertion_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)assertion_utilities.$kw84$SKIP)) {
                                if (assertion_utilities.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                    a_handle = (SubLObject)assertion_utilities.$kw84$SKIP;
                                }
                                ass = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                if (assertion_utilities.NIL != meta_assertion_p(ass) && assertion_utilities.NIL == embedded_assertions_findable_by_idP(ass, (SubLObject)assertion_utilities.NIL)) {
                                    hosed_assertions = (SubLObject)ConsesLow.cons(ass, hosed_assertions);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)assertion_utilities.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$72 = idx_$70;
                    if (assertion_utilities.NIL == id_index.id_index_sparse_objects_empty_p(idx_$72) || assertion_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)assertion_utilities.$kw84$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$72);
                        SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$72);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$72);
                        final SubLObject v_default = (SubLObject)((assertion_utilities.NIL != id_index.id_index_skip_tombstones_p((SubLObject)assertion_utilities.$kw84$SKIP)) ? assertion_utilities.NIL : assertion_utilities.$kw84$SKIP);
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                            if (assertion_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)assertion_utilities.$kw84$SKIP) || assertion_utilities.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                if (assertion_utilities.NIL != meta_assertion_p(ass2) && assertion_utilities.NIL == embedded_assertions_findable_by_idP(ass2, (SubLObject)assertion_utilities.NIL)) {
                                    hosed_assertions = (SubLObject)ConsesLow.cons(ass2, hosed_assertions);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)assertion_utilities.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            a_id2 = Numbers.add(a_id2, (SubLObject)assertion_utilities.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$73 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)assertion_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$73, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(hosed_assertions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 62367L)
    public static SubLObject assertions_with_no_arguments(SubLObject verboseP) {
        if (verboseP == assertion_utilities.UNPROVIDED) {
            verboseP = (SubLObject)assertion_utilities.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertions = (SubLObject)assertion_utilities.NIL;
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = (SubLObject)assertion_utilities.$str132$Looking_for_assertions_with_no_ar;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)assertion_utilities.ZERO_INTEGER;
        assert assertion_utilities.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)assertion_utilities.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)assertion_utilities.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)assertion_utilities.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$74 = idx;
                if (assertion_utilities.NIL == id_index.id_index_objects_empty_p(idx_$74, (SubLObject)assertion_utilities.$kw84$SKIP)) {
                    final SubLObject idx_$75 = idx_$74;
                    if (assertion_utilities.NIL == id_index.id_index_dense_objects_empty_p(idx_$75, (SubLObject)assertion_utilities.$kw84$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$75);
                        final SubLObject backwardP_var = (SubLObject)assertion_utilities.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject ass;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)assertion_utilities.NIL, v_iteration = (SubLObject)assertion_utilities.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)assertion_utilities.ONE_INTEGER)) {
                            a_id = ((assertion_utilities.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)assertion_utilities.ONE_INTEGER) : v_iteration);
                            a_handle = Vectors.aref(vector_var, a_id);
                            if (assertion_utilities.NIL == id_index.id_index_tombstone_p(a_handle) || assertion_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)assertion_utilities.$kw84$SKIP)) {
                                if (assertion_utilities.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                    a_handle = (SubLObject)assertion_utilities.$kw84$SKIP;
                                }
                                ass = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                if (assertion_utilities.NIL == assertions_high.assertion_arguments(ass)) {
                                    if (assertion_utilities.NIL != verboseP) {
                                        print_high.print(ass, (SubLObject)assertion_utilities.UNPROVIDED);
                                        streams_high.force_output((SubLObject)assertion_utilities.UNPROVIDED);
                                    }
                                    assertions = (SubLObject)ConsesLow.cons(ass, assertions);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)assertion_utilities.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$76 = idx_$74;
                    if (assertion_utilities.NIL == id_index.id_index_sparse_objects_empty_p(idx_$76) || assertion_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)assertion_utilities.$kw84$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$76);
                        SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$76);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$76);
                        final SubLObject v_default = (SubLObject)((assertion_utilities.NIL != id_index.id_index_skip_tombstones_p((SubLObject)assertion_utilities.$kw84$SKIP)) ? assertion_utilities.NIL : assertion_utilities.$kw84$SKIP);
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                            if (assertion_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)assertion_utilities.$kw84$SKIP) || assertion_utilities.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                if (assertion_utilities.NIL == assertions_high.assertion_arguments(ass2)) {
                                    if (assertion_utilities.NIL != verboseP) {
                                        print_high.print(ass2, (SubLObject)assertion_utilities.UNPROVIDED);
                                        streams_high.force_output((SubLObject)assertion_utilities.UNPROVIDED);
                                    }
                                    assertions = (SubLObject)ConsesLow.cons(ass2, assertions);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)assertion_utilities.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            a_id2 = Numbers.add(a_id2, (SubLObject)assertion_utilities.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$77 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)assertion_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$77, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(assertions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 62683L)
    public static SubLObject syntactically_ill_formed_assertion_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = (SubLObject)assertion_utilities.ZERO_INTEGER;
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = (SubLObject)assertion_utilities.$str133$mapping_Cyc_assertions;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)assertion_utilities.ZERO_INTEGER;
        assert assertion_utilities.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)assertion_utilities.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)assertion_utilities.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)assertion_utilities.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$78 = idx;
                if (assertion_utilities.NIL == id_index.id_index_objects_empty_p(idx_$78, (SubLObject)assertion_utilities.$kw84$SKIP)) {
                    final SubLObject idx_$79 = idx_$78;
                    if (assertion_utilities.NIL == id_index.id_index_dense_objects_empty_p(idx_$79, (SubLObject)assertion_utilities.$kw84$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$79);
                        final SubLObject backwardP_var = (SubLObject)assertion_utilities.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject ass;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)assertion_utilities.NIL, v_iteration = (SubLObject)assertion_utilities.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)assertion_utilities.ONE_INTEGER)) {
                            a_id = ((assertion_utilities.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)assertion_utilities.ONE_INTEGER) : v_iteration);
                            a_handle = Vectors.aref(vector_var, a_id);
                            if (assertion_utilities.NIL == id_index.id_index_tombstone_p(a_handle) || assertion_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)assertion_utilities.$kw84$SKIP)) {
                                if (assertion_utilities.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                    a_handle = (SubLObject)assertion_utilities.$kw84$SKIP;
                                }
                                ass = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                if (assertion_utilities.NIL != syntactically_ill_formed_assertionP(ass)) {
                                    count = Numbers.add(count, (SubLObject)assertion_utilities.ONE_INTEGER);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)assertion_utilities.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$80 = idx_$78;
                    if (assertion_utilities.NIL == id_index.id_index_sparse_objects_empty_p(idx_$80) || assertion_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)assertion_utilities.$kw84$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$80);
                        SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$80);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$80);
                        final SubLObject v_default = (SubLObject)((assertion_utilities.NIL != id_index.id_index_skip_tombstones_p((SubLObject)assertion_utilities.$kw84$SKIP)) ? assertion_utilities.NIL : assertion_utilities.$kw84$SKIP);
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                            if (assertion_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)assertion_utilities.$kw84$SKIP) || assertion_utilities.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                if (assertion_utilities.NIL != syntactically_ill_formed_assertionP(ass2)) {
                                    count = Numbers.add(count, (SubLObject)assertion_utilities.ONE_INTEGER);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)assertion_utilities.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            a_id2 = Numbers.add(a_id2, (SubLObject)assertion_utilities.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$81 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)assertion_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$81, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 62877L)
    public static SubLObject syntactically_ill_formed_assertions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)assertion_utilities.NIL;
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = (SubLObject)assertion_utilities.$str133$mapping_Cyc_assertions;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)assertion_utilities.ZERO_INTEGER;
        assert assertion_utilities.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)assertion_utilities.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)assertion_utilities.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)assertion_utilities.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$82 = idx;
                if (assertion_utilities.NIL == id_index.id_index_objects_empty_p(idx_$82, (SubLObject)assertion_utilities.$kw84$SKIP)) {
                    final SubLObject idx_$83 = idx_$82;
                    if (assertion_utilities.NIL == id_index.id_index_dense_objects_empty_p(idx_$83, (SubLObject)assertion_utilities.$kw84$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$83);
                        final SubLObject backwardP_var = (SubLObject)assertion_utilities.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject ass;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)assertion_utilities.NIL, v_iteration = (SubLObject)assertion_utilities.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)assertion_utilities.ONE_INTEGER)) {
                            a_id = ((assertion_utilities.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)assertion_utilities.ONE_INTEGER) : v_iteration);
                            a_handle = Vectors.aref(vector_var, a_id);
                            if (assertion_utilities.NIL == id_index.id_index_tombstone_p(a_handle) || assertion_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)assertion_utilities.$kw84$SKIP)) {
                                if (assertion_utilities.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                    a_handle = (SubLObject)assertion_utilities.$kw84$SKIP;
                                }
                                ass = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                if (assertion_utilities.NIL != syntactically_ill_formed_assertionP(ass)) {
                                    result = (SubLObject)ConsesLow.cons(ass, result);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)assertion_utilities.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$84 = idx_$82;
                    if (assertion_utilities.NIL == id_index.id_index_sparse_objects_empty_p(idx_$84) || assertion_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)assertion_utilities.$kw84$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$84);
                        SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$84);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$84);
                        final SubLObject v_default = (SubLObject)((assertion_utilities.NIL != id_index.id_index_skip_tombstones_p((SubLObject)assertion_utilities.$kw84$SKIP)) ? assertion_utilities.NIL : assertion_utilities.$kw84$SKIP);
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                            if (assertion_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)assertion_utilities.$kw84$SKIP) || assertion_utilities.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                if (assertion_utilities.NIL != syntactically_ill_formed_assertionP(ass2)) {
                                    result = (SubLObject)ConsesLow.cons(ass2, result);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)assertion_utilities.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            a_id2 = Numbers.add(a_id2, (SubLObject)assertion_utilities.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$85 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)assertion_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$85, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 63086L)
    public static SubLObject syntactically_ill_formed_assertionP(final SubLObject ass) {
        return (SubLObject)SubLObjectFactory.makeBoolean(assertion_utilities.NIL == cycl_grammar.cycl_sentence_p(fi.assertion_hl_formula(ass, (SubLObject)assertion_utilities.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 63336L)
    public static SubLObject assertion_rarest_term(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_term = (SubLObject)assertion_utilities.NIL;
        SubLObject count = (SubLObject)assertion_utilities.NIL;
        final SubLObject _prev_bind_0 = assertion_utilities.$rarest_term$.currentBinding(thread);
        final SubLObject _prev_bind_2 = assertion_utilities.$rarest_count$.currentBinding(thread);
        try {
            assertion_utilities.$rarest_term$.bind((SubLObject)assertion_utilities.$kw134$UNSPECIFIED, thread);
            assertion_utilities.$rarest_count$.bind(Numbers.$most_positive_fixnum$.getGlobalValue(), thread);
            cycl_utilities.assertion_map(Symbols.symbol_function((SubLObject)assertion_utilities.$sym135$UPDATE_RAREST_TERM), assertion, (SubLObject)assertion_utilities.UNPROVIDED, (SubLObject)assertion_utilities.UNPROVIDED);
            v_term = assertion_utilities.$rarest_term$.getDynamicValue(thread);
            count = assertion_utilities.$rarest_count$.getDynamicValue(thread);
        }
        finally {
            assertion_utilities.$rarest_count$.rebind(_prev_bind_2, thread);
            assertion_utilities.$rarest_term$.rebind(_prev_bind_0, thread);
        }
        return Values.values(v_term, count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 63760L)
    public static SubLObject assertion_term_rarity(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_term = assertion_rarest_term(assertion);
        final SubLObject count = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return Values.values(count, v_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 64059L)
    public static SubLObject sort_assertions_via_term_rarity(SubLObject assertions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state((SubLObject)assertion_utilities.UNPROVIDED, (SubLObject)assertion_utilities.UNPROVIDED, (SubLObject)assertion_utilities.UNPROVIDED, (SubLObject)assertion_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                assertions = Sort.stable_sort(assertions, Symbols.symbol_function((SubLObject)assertion_utilities.$sym136$_), Symbols.symbol_function((SubLObject)assertion_utilities.$sym137$MEMOIZED_ASSERTION_TERM_RARITY));
            }
            finally {
                final SubLObject _prev_bind_0_$86 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)assertion_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$86, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return assertions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 64330L)
    public static SubLObject update_rarest_term(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (assertion_utilities.NIL != kb_indexing_datastructures.indexed_term_p(v_term)) {
            final SubLObject count = kb_indexing.num_index(v_term);
            if (count.numL(assertion_utilities.$rarest_count$.getDynamicValue(thread))) {
                assertion_utilities.$rarest_term$.setDynamicValue(v_term, thread);
                assertion_utilities.$rarest_count$.setDynamicValue(count, thread);
            }
        }
        return (SubLObject)assertion_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 64568L)
    public static SubLObject memoized_assertion_term_rarity_internal(final SubLObject assertion) {
        return assertion_term_rarity(assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 64568L)
    public static SubLObject memoized_assertion_term_rarity(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)assertion_utilities.NIL;
        if (assertion_utilities.NIL == v_memoization_state) {
            return memoized_assertion_term_rarity_internal(assertion);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)assertion_utilities.$sym137$MEMOIZED_ASSERTION_TERM_RARITY, (SubLObject)assertion_utilities.UNPROVIDED);
        if (assertion_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)assertion_utilities.$sym137$MEMOIZED_ASSERTION_TERM_RARITY, (SubLObject)assertion_utilities.ONE_INTEGER, (SubLObject)assertion_utilities.NIL, (SubLObject)assertion_utilities.EQL, (SubLObject)assertion_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)assertion_utilities.$sym137$MEMOIZED_ASSERTION_TERM_RARITY, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, assertion, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(memoized_assertion_term_rarity_internal(assertion)));
            memoization_state.caching_state_put(caching_state, assertion, results, (SubLObject)assertion_utilities.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    public static SubLObject declare_assertion_utilities_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.assertion_utilities", "do_rules", "DO-RULES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.assertion_utilities", "do_gafs", "DO-GAFS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.assertion_utilities", "do_assertions_backwards", "DO-ASSERTIONS-BACKWARDS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.assertion_utilities", "do_assertion_dependent_assertions", "DO-ASSERTION-DEPENDENT-ASSERTIONS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.assertion_utilities", "do_assertion_supporting_assertions", "DO-ASSERTION-SUPPORTING-ASSERTIONS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "assertion_list_p", "ASSERTION-LIST-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "list_of_rule_assertion_p", "LIST-OF-RULE-ASSERTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "assertion_dependent_assertions", "ASSERTION-DEPENDENT-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "remove_relevant_assertion_dependents", "REMOVE-RELEVANT-ASSERTION-DEPENDENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "remove_relevant_assertions_dependents", "REMOVE-RELEVANT-ASSERTIONS-DEPENDENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "deduction_dependent_deductions", "DEDUCTION-DEPENDENT-DEDUCTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "assertion_dependent_supported_object_counts", "ASSERTION-DEPENDENT-SUPPORTED-OBJECT-COUNTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "true_assertionP", "TRUE-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "false_assertionP", "FALSE-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "unknown_assertionP", "UNKNOWN-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "true_gaf_assertionP", "TRUE-GAF-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "false_gaf_assertionP", "FALSE-GAF-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "nl_semantic_assertionP", "NL-SEMANTIC-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "obsolete_ruleP", "OBSOLETE-RULE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "assertion_matches_typeP", "ASSERTION-MATCHES-TYPE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "assertion_matches_truthP", "ASSERTION-MATCHES-TRUTH?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "assertion_matches_directionP", "ASSERTION-MATCHES-DIRECTION?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "assertion_matches_truth_and_directionP", "ASSERTION-MATCHES-TRUTH-AND-DIRECTION?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "assertion_matches_type_truth_and_directionP", "ASSERTION-MATCHES-TYPE-TRUTH-AND-DIRECTION?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "gaf_has_term_in_argnumP", "GAF-HAS-TERM-IN-ARGNUM?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "gaf_has_term_in_some_argnumP", "GAF-HAS-TERM-IN-SOME-ARGNUM?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "true_gaf_assertion_with_pred_p", "TRUE-GAF-ASSERTION-WITH-PRED-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "gaf_assertion_with_pred_p", "GAF-ASSERTION-WITH-PRED-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "gaf_assertion_has_pred_p", "GAF-ASSERTION-HAS-PRED-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "gaf_assertion_with_any_of_preds_p", "GAF-ASSERTION-WITH-ANY-OF-PREDS-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "isa_gaf_p", "ISA-GAF-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "genls_gaf_p", "GENLS-GAF-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "assertion_cnf_with_el_vars_only", "ASSERTION-CNF-WITH-EL-VARS-ONLY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "except_when_rule_p", "EXCEPT-WHEN-RULE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "except_for_gaf_p", "EXCEPT-FOR-GAF-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "abnormal_assertion_p", "ABNORMAL-ASSERTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "abnormal_literal_from_assertion", "ABNORMAL-LITERAL-FROM-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "somewhere_excepted_assertionP", "SOMEWHERE-EXCEPTED-ASSERTION?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "excepted_assertionP", "EXCEPTED-ASSERTION?", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "excepted_assertion_in_any_mtP", "EXCEPTED-ASSERTION-IN-ANY-MT?", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "excepted_assertionP_int", "EXCEPTED-ASSERTION?-INT", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "excepted_assertion_in_mtP", "EXCEPTED-ASSERTION-IN-MT?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "excepted_assertion_in_mtP_shallow", "EXCEPTED-ASSERTION-IN-MT?-SHALLOW", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "doomed_assertionP", "DOOMED-ASSERTION?", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "doomed_assertionP_int", "DOOMED-ASSERTION?-INT", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "assertion_matches_mtP", "ASSERTION-MATCHES-MT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "assertion_has_argumentsP", "ASSERTION-HAS-ARGUMENTS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "assertion_argument_count", "ASSERTION-ARGUMENT-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "assertion_has_deduction_with_supportP", "ASSERTION-HAS-DEDUCTION-WITH-SUPPORT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "assertion_has_dependent_with_supportP", "ASSERTION-HAS-DEPENDENT-WITH-SUPPORT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "assertion_has_dependent_with_supportP_kb_hl_support_aware_version", "ASSERTION-HAS-DEPENDENT-WITH-SUPPORT?-KB-HL-SUPPORT-AWARE-VERSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "assertion_mentions_asserted_more_specificallyP", "ASSERTION-MENTIONS-ASSERTED-MORE-SPECIFICALLY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "assertion_mentions_any_of_termsP", "ASSERTION-MENTIONS-ANY-OF-TERMS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "assertion_mentions_any_of_terms_in_set_lambda", "ASSERTION-MENTIONS-ANY-OF-TERMS-IN-SET-LAMBDA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "assertion_mentions_any_of_terms_in_setP", "ASSERTION-MENTIONS-ANY-OF-TERMS-IN-SET?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "assertion_mentions_any_of_terms_in_dict_lambda", "ASSERTION-MENTIONS-ANY-OF-TERMS-IN-DICT-LAMBDA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "assertion_mentions_any_of_terms_in_dictionary_keysP", "ASSERTION-MENTIONS-ANY-OF-TERMS-IN-DICTIONARY-KEYS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "random_gaf_with_pred", "RANDOM-GAF-WITH-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "random_gaf_with_predicate", "RANDOM-GAF-WITH-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "random_gaf_with_predicate_and_arg", "RANDOM-GAF-WITH-PREDICATE-AND-ARG", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "random_rule_mentioning", "RANDOM-RULE-MENTIONING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "rules_mentioning", "RULES-MENTIONING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "rule_count_mentioning", "RULE-COUNT-MENTIONING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "random_assertions", "RANDOM-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "assertion_earlierP", "ASSERTION-EARLIER?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "assertion_laterP", "ASSERTION-LATER?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "earliest_assertion", "EARLIEST-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "rename_assertion_variables", "RENAME-ASSERTION-VARIABLES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "possibly_rename_assertion_variables", "POSSIBLY-RENAME-ASSERTION-VARIABLES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "assertion_antecedent_query_formula", "ASSERTION-ANTECEDENT-QUERY-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "assertion_known_extent_query_formula", "ASSERTION-KNOWN-EXTENT-QUERY-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "assertion_unknown_extent_query_formula", "ASSERTION-UNKNOWN-EXTENT-QUERY-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "assertion_known_extent_query_formula_int", "ASSERTION-KNOWN-EXTENT-QUERY-FORMULA-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "assertion_info", "ASSERTION-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "assertion_literal_count", "ASSERTION-LITERAL-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "rule_literal_count", "RULE-LITERAL-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "assertion_supporting_assertions", "ASSERTION-SUPPORTING-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "assertion_supporting_forward_assertions", "ASSERTION-SUPPORTING-FORWARD-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "assertion_cheapest_forward_supporting_assertion", "ASSERTION-CHEAPEST-FORWARD-SUPPORTING-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "assertion_universal_time", "ASSERTION-UNIVERSAL-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "all_assertions_sorted_by_creation_time_estimate", "ALL-ASSERTIONS-SORTED-BY-CREATION-TIME-ESTIMATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "assertion_newest_constant", "ASSERTION-NEWEST-CONSTANT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "initialize_newest_constant_table", "INITIALIZE-NEWEST-CONSTANT-TABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "assertion_has_meta_assertionsP", "ASSERTION-HAS-META-ASSERTIONS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "all_meta_assertions", "ALL-META-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "meta_assertion_list_for_editing", "META-ASSERTION-LIST-FOR-EDITING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "meta_assertion_p", "META-ASSERTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "rule_meta_assertion_p", "RULE-META-ASSERTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "pragmatic_requirement_rule_p", "PRAGMATIC-REQUIREMENT-RULE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "meta_assertion_el_formula", "META-ASSERTION-EL-FORMULA", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "mt_of_assertions_p", "MT-OF-ASSERTIONS-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "assertions_of_mt", "ASSERTIONS-OF-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "mts_of_assertions", "MTS-OF-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "assertions_min_mt", "ASSERTIONS-MIN-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "sort_assertions", "SORT-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "sort_gafs_by_term", "SORT-GAFS-BY-TERM", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "rule_type_constraints", "RULE-TYPE-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "self_looping_ruleP", "SELF-LOOPING-RULE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "clear_cached_self_looping_rule_assertionP", "CLEAR-CACHED-SELF-LOOPING-RULE-ASSERTION?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "remove_cached_self_looping_rule_assertionP", "REMOVE-CACHED-SELF-LOOPING-RULE-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "cached_self_looping_rule_assertionP_internal", "CACHED-SELF-LOOPING-RULE-ASSERTION?-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "cached_self_looping_rule_assertionP", "CACHED-SELF-LOOPING-RULE-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "self_expanding_ruleP", "SELF-EXPANDING-RULE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "clear_cached_self_expanding_rule_assertionP", "CLEAR-CACHED-SELF-EXPANDING-RULE-ASSERTION?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "remove_cached_self_expanding_rule_assertionP", "REMOVE-CACHED-SELF-EXPANDING-RULE-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "cached_self_expanding_rule_assertionP_internal", "CACHED-SELF-EXPANDING-RULE-ASSERTION?-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "cached_self_expanding_rule_assertionP", "CACHED-SELF-EXPANDING-RULE-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "safe_all_forward_rules_relevant_to_term", "SAFE-ALL-FORWARD-RULES-RELEVANT-TO-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "all_forward_rules_relevant_to_term", "ALL-FORWARD-RULES-RELEVANT-TO-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "safe_all_forward_rules_relevant_to_terms", "SAFE-ALL-FORWARD-RULES-RELEVANT-TO-TERMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "all_forward_rules_relevant_to_terms", "ALL-FORWARD-RULES-RELEVANT-TO-TERMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "possibly_safe_all_forward_rules_relevant_to_term", "POSSIBLY-SAFE-ALL-FORWARD-RULES-RELEVANT-TO-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "possibly_safe_all_forward_rules_relevant_to_terms", "POSSIBLY-SAFE-ALL-FORWARD-RULES-RELEVANT-TO-TERMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "deduction_forward_rule_supports", "DEDUCTION-FORWARD-RULE-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "all_forward_rules_relevant_to_term_int", "ALL-FORWARD-RULES-RELEVANT-TO-TERM-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "compute_all_forward_rules_relevant_to_term", "COMPUTE-ALL-FORWARD-RULES-RELEVANT-TO-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "compute_all_forward_rules_relevant_to_assertion", "COMPUTE-ALL-FORWARD-RULES-RELEVANT-TO-ASSERTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "compute_all_forward_rules_relevant_to_assertion_int", "COMPUTE-ALL-FORWARD-RULES-RELEVANT-TO-ASSERTION-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "deduction_asserted_assertion_supports", "DEDUCTION-ASSERTED-ASSERTION-SUPPORTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "deduction_asserted_assertion_supports_int", "DEDUCTION-ASSERTED-ASSERTION-SUPPORTS-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "assertion_asserted_assertion_supports", "ASSERTION-ASSERTED-ASSERTION-SUPPORTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "gather_all_exception_rules", "GATHER-ALL-EXCEPTION-RULES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "gather_all_pragma_rules", "GATHER-ALL-PRAGMA-RULES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "gather_all_lifting_rules", "GATHER-ALL-LIFTING-RULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "lifting_ruleP", "LIFTING-RULE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "lifting_consequent_ruleP", "LIFTING-CONSEQUENT-RULE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "universal_lifting_ruleP", "UNIVERSAL-LIFTING-RULE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "rule_has_unlabelled_dont_care_variableP", "RULE-HAS-UNLABELLED-DONT-CARE-VARIABLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "rule_unlabelled_dont_care_variables", "RULE-UNLABELLED-DONT-CARE-VARIABLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "assertion_findable_by_idP", "ASSERTION-FINDABLE-BY-ID?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "embedded_assertions", "EMBEDDED-ASSERTIONS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "embedded_assertions_findable_by_idP", "EMBEDDED-ASSERTIONS-FINDABLE-BY-ID?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "assertions_containing_assertions_not_findable_by_id", "ASSERTIONS-CONTAINING-ASSERTIONS-NOT-FINDABLE-BY-ID", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "assertions_with_no_arguments", "ASSERTIONS-WITH-NO-ARGUMENTS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "syntactically_ill_formed_assertion_count", "SYNTACTICALLY-ILL-FORMED-ASSERTION-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "syntactically_ill_formed_assertions", "SYNTACTICALLY-ILL-FORMED-ASSERTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "syntactically_ill_formed_assertionP", "SYNTACTICALLY-ILL-FORMED-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "assertion_rarest_term", "ASSERTION-RAREST-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "assertion_term_rarity", "ASSERTION-TERM-RARITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "sort_assertions_via_term_rarity", "SORT-ASSERTIONS-VIA-TERM-RARITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "update_rarest_term", "UPDATE-RAREST-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "memoized_assertion_term_rarity_internal", "MEMOIZED-ASSERTION-TERM-RARITY-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_utilities", "memoized_assertion_term_rarity", "MEMOIZED-ASSERTION-TERM-RARITY", 1, 0, false);
        return (SubLObject)assertion_utilities.NIL;
    }
    
    public static SubLObject init_assertion_utilities_file() {
        assertion_utilities.$excepted_assertion_max_depth$ = SubLFiles.defparameter("*EXCEPTED-ASSERTION-MAX-DEPTH*", (SubLObject)assertion_utilities.NIL);
        assertion_utilities.$excepted_assertion_shallow_max_depth$ = SubLFiles.defparameter("*EXCEPTED-ASSERTION-SHALLOW-MAX-DEPTH*", (SubLObject)assertion_utilities.FIVE_INTEGER);
        assertion_utilities.$doomed_assertion_max_depth$ = SubLFiles.defparameter("*DOOMED-ASSERTION-MAX-DEPTH*", (SubLObject)assertion_utilities.NIL);
        assertion_utilities.$assertion_mentions_any_of_terms_set_watermark$ = SubLFiles.deflexical("*ASSERTION-MENTIONS-ANY-OF-TERMS-SET-WATERMARK*", (SubLObject)assertion_utilities.$int68$30);
        assertion_utilities.$assertion_mentions_any_of_terms_set_lambda$ = SubLFiles.defparameter("*ASSERTION-MENTIONS-ANY-OF-TERMS-SET-LAMBDA*", (SubLObject)assertion_utilities.NIL);
        assertion_utilities.$assertion_mentions_any_of_terms_dict_lambda$ = SubLFiles.defparameter("*ASSERTION-MENTIONS-ANY-OF-TERMS-DICT-LAMBDA*", (SubLObject)assertion_utilities.NIL);
        assertion_utilities.$newest_constant_of_assertions$ = SubLFiles.defparameter("*NEWEST-CONSTANT-OF-ASSERTIONS*", (SubLObject)assertion_utilities.NIL);
        assertion_utilities.$cached_self_looping_rule_assertionP_caching_state$ = SubLFiles.deflexical("*CACHED-SELF-LOOPING-RULE-ASSERTION?-CACHING-STATE*", (SubLObject)assertion_utilities.NIL);
        assertion_utilities.$cached_self_expanding_rule_assertionP_caching_state$ = SubLFiles.deflexical("*CACHED-SELF-EXPANDING-RULE-ASSERTION?-CACHING-STATE*", (SubLObject)assertion_utilities.NIL);
        assertion_utilities.$all_forward_rules_relevant_to_term_threshold$ = SubLFiles.defparameter("*ALL-FORWARD-RULES-RELEVANT-TO-TERM-THRESHOLD*", (SubLObject)assertion_utilities.$int112$212);
        assertion_utilities.$within_safe_all_forward_rules_relevant_to_termP$ = SubLFiles.defparameter("*WITHIN-SAFE-ALL-FORWARD-RULES-RELEVANT-TO-TERM?*", (SubLObject)assertion_utilities.NIL);
        assertion_utilities.$all_forward_rules_relevant_to_term_argument_set$ = SubLFiles.defparameter("*ALL-FORWARD-RULES-RELEVANT-TO-TERM-ARGUMENT-SET*", (SubLObject)assertion_utilities.NIL);
        assertion_utilities.$all_forward_rules_relevant_to_term_dependent_set$ = SubLFiles.defparameter("*ALL-FORWARD-RULES-RELEVANT-TO-TERM-DEPENDENT-SET*", (SubLObject)assertion_utilities.NIL);
        assertion_utilities.$all_forward_rules_relevant_to_term_nart_set$ = SubLFiles.defparameter("*ALL-FORWARD-RULES-RELEVANT-TO-TERM-NART-SET*", (SubLObject)assertion_utilities.NIL);
        assertion_utilities.$all_forward_rules_relevant_to_term_result_set$ = SubLFiles.defparameter("*ALL-FORWARD-RULES-RELEVANT-TO-TERM-RESULT-SET*", (SubLObject)assertion_utilities.NIL);
        assertion_utilities.$deduction_asserted_assertion_supports_deductions_processed$ = SubLFiles.defparameter("*DEDUCTION-ASSERTED-ASSERTION-SUPPORTS-DEDUCTIONS-PROCESSED*", (SubLObject)assertion_utilities.NIL);
        assertion_utilities.$deduction_asserted_assertion_counts$ = SubLFiles.defparameter("*DEDUCTION-ASSERTED-ASSERTION-COUNTS*", (SubLObject)assertion_utilities.NIL);
        assertion_utilities.$rarest_term$ = SubLFiles.defparameter("*RAREST-TERM*", (SubLObject)assertion_utilities.NIL);
        assertion_utilities.$rarest_count$ = SubLFiles.defparameter("*RAREST-COUNT*", (SubLObject)assertion_utilities.NIL);
        return (SubLObject)assertion_utilities.NIL;
    }
    
    public static SubLObject setup_assertion_utilities_file() {
        utilities_macros.register_cyc_api_function((SubLObject)assertion_utilities.$sym87$ASSERTION_HAS_META_ASSERTIONS_, (SubLObject)assertion_utilities.$list88, (SubLObject)assertion_utilities.$str89$Return_T_iff_ASSERTION_has_some_m, (SubLObject)assertion_utilities.$list90, (SubLObject)assertion_utilities.$list91);
        memoization_state.note_globally_cached_function((SubLObject)assertion_utilities.$sym108$CACHED_SELF_LOOPING_RULE_ASSERTION_);
        memoization_state.note_globally_cached_function((SubLObject)assertion_utilities.$sym110$CACHED_SELF_EXPANDING_RULE_ASSERTION_);
        memoization_state.note_memoized_function((SubLObject)assertion_utilities.$sym137$MEMOIZED_ASSERTION_TERM_RARITY);
        return (SubLObject)assertion_utilities.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_assertion_utilities_file();
    }
    
    @Override
	public void initializeVariables() {
        init_assertion_utilities_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_assertion_utilities_file();
    }
    
    static {
        me = (SubLFile)new assertion_utilities();
        assertion_utilities.$excepted_assertion_max_depth$ = null;
        assertion_utilities.$excepted_assertion_shallow_max_depth$ = null;
        assertion_utilities.$doomed_assertion_max_depth$ = null;
        assertion_utilities.$assertion_mentions_any_of_terms_set_watermark$ = null;
        assertion_utilities.$assertion_mentions_any_of_terms_set_lambda$ = null;
        assertion_utilities.$assertion_mentions_any_of_terms_dict_lambda$ = null;
        assertion_utilities.$newest_constant_of_assertions$ = null;
        assertion_utilities.$cached_self_looping_rule_assertionP_caching_state$ = null;
        assertion_utilities.$cached_self_expanding_rule_assertionP_caching_state$ = null;
        assertion_utilities.$all_forward_rules_relevant_to_term_threshold$ = null;
        assertion_utilities.$within_safe_all_forward_rules_relevant_to_termP$ = null;
        assertion_utilities.$all_forward_rules_relevant_to_term_argument_set$ = null;
        assertion_utilities.$all_forward_rules_relevant_to_term_dependent_set$ = null;
        assertion_utilities.$all_forward_rules_relevant_to_term_nart_set$ = null;
        assertion_utilities.$all_forward_rules_relevant_to_term_result_set$ = null;
        assertion_utilities.$deduction_asserted_assertion_supports_deductions_processed$ = null;
        assertion_utilities.$deduction_asserted_assertion_counts$ = null;
        assertion_utilities.$rarest_term$ = null;
        assertion_utilities.$rarest_count$ = null;
        $list0 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RULE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeString("mapping Cyc rules")), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw2$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw3$PROGRESS_MESSAGE = SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE");
        $str4$mapping_Cyc_rules = SubLObjectFactory.makeString("mapping Cyc rules");
        $kw5$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym6$DO_ITERATOR = SubLObjectFactory.makeSymbol("DO-ITERATOR");
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-RULE-ITERATOR"));
        $sym8$MESSAGE_VAR = SubLObjectFactory.makeUninternedSymbol("MESSAGE-VAR");
        $sym9$TOTAL = SubLObjectFactory.makeUninternedSymbol("TOTAL");
        $sym10$SOFAR = SubLObjectFactory.makeUninternedSymbol("SOFAR");
        $sym11$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list12 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RULE-COUNT")));
        $list13 = ConsesLow.list((SubLObject)assertion_utilities.ZERO_INTEGER);
        $sym14$NOTING_PERCENT_PROGRESS = SubLObjectFactory.makeSymbol("NOTING-PERCENT-PROGRESS");
        $sym15$DO_RULES = SubLObjectFactory.makeSymbol("DO-RULES");
        $sym16$CINC = SubLObjectFactory.makeSymbol("CINC");
        $sym17$NOTE_PERCENT_PROGRESS = SubLObjectFactory.makeSymbol("NOTE-PERCENT-PROGRESS");
        $list18 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GAF-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeString("mapping Cyc GAFs")), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $str19$mapping_Cyc_GAFs = SubLObjectFactory.makeString("mapping Cyc GAFs");
        $sym20$DO_ASSERTIONS = SubLObjectFactory.makeSymbol("DO-ASSERTIONS");
        $sym21$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym22$GAF_ASSERTION_ = SubLObjectFactory.makeSymbol("GAF-ASSERTION?");
        $list23 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym24$PROGRESS_MESSAGE_VAR = SubLObjectFactory.makeUninternedSymbol("PROGRESS-MESSAGE-VAR");
        $sym25$DO_ASSERTIONS_BACKWARDS = SubLObjectFactory.makeSymbol("DO-ASSERTIONS-BACKWARDS");
        $sym26$SOFAR_VAR = SubLObjectFactory.makeUninternedSymbol("SOFAR-VAR");
        $sym27$TOTAL_VAR = SubLObjectFactory.makeUninternedSymbol("TOTAL-VAR");
        $list28 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-COUNT")));
        $sym29$ID_VAR = SubLObjectFactory.makeUninternedSymbol("ID-VAR");
        $sym30$DO_NUMBERS = SubLObjectFactory.makeSymbol("DO-NUMBERS");
        $kw31$START = SubLObjectFactory.makeKeyword("START");
        $list32 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEXT-ASSERTION-ID"));
        $kw33$END = SubLObjectFactory.makeKeyword("END");
        $kw34$DELTA = SubLObjectFactory.makeKeyword("DELTA");
        $sym35$FIND_ASSERTION_BY_ID = SubLObjectFactory.makeSymbol("FIND-ASSERTION-BY-ID");
        $list36 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEPENDENT-ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym37$DEDUCTION = SubLObjectFactory.makeUninternedSymbol("DEDUCTION");
        $sym38$DO_ASSERTION_DEPENDENTS = SubLObjectFactory.makeSymbol("DO-ASSERTION-DEPENDENTS");
        $sym39$DEDUCTION_ASSERTION = SubLObjectFactory.makeSymbol("DEDUCTION-ASSERTION");
        $sym40$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $list41 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUPPORTING-ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list42 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $sym43$ARGUMENT = SubLObjectFactory.makeUninternedSymbol("ARGUMENT");
        $sym44$DO_ASSERTION_ARGUMENTS = SubLObjectFactory.makeSymbol("DO-ASSERTION-ARGUMENTS");
        $sym45$DEDUCTION_P = SubLObjectFactory.makeSymbol("DEDUCTION-P");
        $sym46$DO_DEDUCTION_SUPPORTS = SubLObjectFactory.makeSymbol("DO-DEDUCTION-SUPPORTS");
        $str47$Gathering_mt_relevant_dependents_ = SubLObjectFactory.makeString("Gathering mt-relevant dependents from root set of ");
        $str48$_assertions = SubLObjectFactory.makeString(" assertions");
        $const49$except = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("except"));
        $str50$Removing_ = SubLObjectFactory.makeString("Removing ");
        $str51$_mt_relevant_dependents = SubLObjectFactory.makeString(" mt-relevant dependents");
        $str52$Deduction__A_supporting_missing_K = SubLObjectFactory.makeString("Deduction ~A supporting missing KB HL support?! ~A~%");
        $str53$deduction_dependent_deductions_ca = SubLObjectFactory.makeString("deduction-dependent-deductions called on deduction ~A supporting invalid object ~A");
        $kw54$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $kw55$FALSE = SubLObjectFactory.makeKeyword("FALSE");
        $kw56$UNKNOWN = SubLObjectFactory.makeKeyword("UNKNOWN");
        $const57$NLSemanticPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLSemanticPredicate"));
        $sym58$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const59$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $sym60$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $const61$obsoleteRule = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("obsoleteRule"));
        $const62$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $const63$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $sym64$ABNORMAL_ASSERTION_P = SubLObjectFactory.makeSymbol("ABNORMAL-ASSERTION-P");
        $const65$exceptMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("exceptMt"));
        $sym66$SUPPORT_P = SubLObjectFactory.makeSymbol("SUPPORT-P");
        $const67$assertedMoreSpecifically = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedMoreSpecifically"));
        $int68$30 = SubLObjectFactory.makeInteger(30);
        $sym69$ASSERTION_MENTIONS_ANY_OF_TERMS_IN_SET_LAMBDA = SubLObjectFactory.makeSymbol("ASSERTION-MENTIONS-ANY-OF-TERMS-IN-SET-LAMBDA");
        $sym70$ASSERTION_MENTIONS_ANY_OF_TERMS_IN_DICT_LAMBDA = SubLObjectFactory.makeSymbol("ASSERTION-MENTIONS-ANY-OF-TERMS-IN-DICT-LAMBDA");
        $int71$10000 = SubLObjectFactory.makeInteger(10000);
        $kw72$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw73$RULE = SubLObjectFactory.makeKeyword("RULE");
        $sym74$ASSERTED_WHEN = SubLObjectFactory.makeSymbol("ASSERTED-WHEN");
        $sym75$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $sym76$ASSERTED_SECOND = SubLObjectFactory.makeSymbol("ASSERTED-SECOND");
        $sym77$EL_VAR_NAME = SubLObjectFactory.makeSymbol("EL-VAR-NAME");
        $const78$knownSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("knownSentence"));
        $const79$unknownSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentence"));
        $sym80$FORWARD_ASSERTION_ = SubLObjectFactory.makeSymbol("FORWARD-ASSERTION?");
        $sym81$ASSERTION_DEPENDENT_COUNT = SubLObjectFactory.makeSymbol("ASSERTION-DEPENDENT-COUNT");
        $str82$Sorting_newest_constants___Part_2 = SubLObjectFactory.makeString("Sorting newest constants : Part 2");
        $sym83$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $kw84$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $str85$Computing_newest_constants = SubLObjectFactory.makeString("Computing newest constants");
        $str86$Sorting_newest_constants___Part_1 = SubLObjectFactory.makeString("Sorting newest constants : Part 1");
        $sym87$ASSERTION_HAS_META_ASSERTIONS_ = SubLObjectFactory.makeSymbol("ASSERTION-HAS-META-ASSERTIONS?");
        $list88 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"));
        $str89$Return_T_iff_ASSERTION_has_some_m = SubLObjectFactory.makeString("Return T iff ASSERTION has some meta-assertions.");
        $list90 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-P")));
        $list91 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"));
        $sym92$ALL_META_ASSERTIONS = SubLObjectFactory.makeSymbol("ALL-META-ASSERTIONS");
        $sym93$RULE_ASSERTION_ = SubLObjectFactory.makeSymbol("RULE-ASSERTION?");
        $const94$meetsPragmaticRequirement = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("meetsPragmaticRequirement"));
        $sym95$META_ASSERTION_P = SubLObjectFactory.makeSymbol("META-ASSERTION-P");
        $sym96$HLMT_P = SubLObjectFactory.makeSymbol("HLMT-P");
        $sym97$ASSERTION_LIST_P = SubLObjectFactory.makeSymbol("ASSERTION-LIST-P");
        $sym98$ASSERTION_MT = SubLObjectFactory.makeSymbol("ASSERTION-MT");
        $sym99$SAFE__ = SubLObjectFactory.makeSymbol("SAFE-<");
        $sym100$ASSERTION_ID = SubLObjectFactory.makeSymbol("ASSERTION-ID");
        $sym101$TERM__ = SubLObjectFactory.makeSymbol("TERM-<");
        $sym102$DEFINITIONAL_PRED__ = SubLObjectFactory.makeSymbol("DEFINITIONAL-PRED-<");
        $sym103$GAF_PREDICATE = SubLObjectFactory.makeSymbol("GAF-PREDICATE");
        $sym104$GAF_ARG1 = SubLObjectFactory.makeSymbol("GAF-ARG1");
        $sym105$ISA_HL_VAR_THING_LIT_ = SubLObjectFactory.makeSymbol("ISA-HL-VAR-THING-LIT?");
        $str106$Type_constraint__Mt_should_be_can = SubLObjectFactory.makeString("Type constraint: Mt should be canonical ~a, but isn't ~a");
        $str107$Expected_a_single_DNF_clause_of_c = SubLObjectFactory.makeString("Expected a single DNF clause of constraints for ~a but got more than one: ~a");
        $sym108$CACHED_SELF_LOOPING_RULE_ASSERTION_ = SubLObjectFactory.makeSymbol("CACHED-SELF-LOOPING-RULE-ASSERTION?");
        $sym109$_CACHED_SELF_LOOPING_RULE_ASSERTION__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CACHED-SELF-LOOPING-RULE-ASSERTION?-CACHING-STATE*");
        $sym110$CACHED_SELF_EXPANDING_RULE_ASSERTION_ = SubLObjectFactory.makeSymbol("CACHED-SELF-EXPANDING-RULE-ASSERTION?");
        $sym111$_CACHED_SELF_EXPANDING_RULE_ASSERTION__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CACHED-SELF-EXPANDING-RULE-ASSERTION?-CACHING-STATE*");
        $int112$212 = SubLObjectFactory.makeInteger(212);
        $sym113$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $kw114$ALL_FORWARD_RULES_RELEVANT_TO_TERMS_THRESHOLD_EXCEEDED = SubLObjectFactory.makeKeyword("ALL-FORWARD-RULES-RELEVANT-TO-TERMS-THRESHOLD-EXCEEDED");
        $sym115$_ = SubLObjectFactory.makeSymbol(">");
        $kw116$ALL = SubLObjectFactory.makeKeyword("ALL");
        $sym117$NON_DOTTED_LIST_P = SubLObjectFactory.makeSymbol("NON-DOTTED-LIST-P");
        $list118 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ARGUMENT*"), (SubLObject)SubLObjectFactory.makeKeyword("DEPENDENT*"));
        $const119$trueRule = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("trueRule"));
        $kw120$ARGUMENT_ = SubLObjectFactory.makeKeyword("ARGUMENT*");
        $kw121$DEPENDENT_ = SubLObjectFactory.makeKeyword("DEPENDENT*");
        $str122$can_t_handle_argument__S_yet = SubLObjectFactory.makeString("can't handle argument ~S yet");
        $str123$can_t_handle_sub_support__S_yet = SubLObjectFactory.makeString("can't handle sub-support ~S yet");
        $str124$gathering_exception_rules = SubLObjectFactory.makeString("gathering exception rules");
        $str125$gathering_pragma_rules = SubLObjectFactory.makeString("gathering pragma rules");
        $str126$gathering_lifting_rules = SubLObjectFactory.makeString("gathering lifting rules");
        $const127$ist = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist"));
        $const128$universalLiftingRule = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("universalLiftingRule"));
        $str129$__ = SubLObjectFactory.makeString("??");
        $sym130$FALSE = SubLObjectFactory.makeSymbol("FALSE");
        $str131$Verifying_that_all_embedded_asser = SubLObjectFactory.makeString("Verifying that all embedded assertions are findable via ID");
        $str132$Looking_for_assertions_with_no_ar = SubLObjectFactory.makeString("Looking for assertions with no arguments");
        $str133$mapping_Cyc_assertions = SubLObjectFactory.makeString("mapping Cyc assertions");
        $kw134$UNSPECIFIED = SubLObjectFactory.makeKeyword("UNSPECIFIED");
        $sym135$UPDATE_RAREST_TERM = SubLObjectFactory.makeSymbol("UPDATE-RAREST-TERM");
        $sym136$_ = SubLObjectFactory.makeSymbol("<");
        $sym137$MEMOIZED_ASSERTION_TERM_RARITY = SubLObjectFactory.makeSymbol("MEMOIZED-ASSERTION-TERM-RARITY");
    }
}
