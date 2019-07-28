package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.lexicon_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.lexicon_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class lexicon_macros extends SubLTranslatedFile {
    public static final SubLFile me = new lexicon_macros();

    public static final String myName = "com.cyc.cycjava.cycl.lexicon_macros";

    public static final String myFingerPrint = "e4c748af1818ebbbecd6d689fb27405affb060fcccbfd84b3fe7ae66698aa126";

    // defparameter
    // Should entries in the NL trie be assumed to be valid?
    public static final SubLSymbol $nl_trie_assumed_validP$ = makeSymbol("*NL-TRIE-ASSUMED-VALID?*");





    // defparameter
    /**
     * Should NL trie accessors assume any strings passed them are already
     * standardized?
     */
    public static final SubLSymbol $nl_trie_assume_standardized_stringsP$ = makeSymbol("*NL-TRIE-ASSUME-STANDARDIZED-STRINGS?*");

    // defparameter
    // The current memoization state of the paraphrase code.
    public static final SubLSymbol $lexicon_memoization_state$ = makeSymbol("*LEXICON-MEMOIZATION-STATE*");

    // Internal Constants
    public static final SubLList $list0 = list(makeSymbol("FILTERS"), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLSymbol $sym2$_EXCLUDE_VULGARITIES__ = makeSymbol("*EXCLUDE-VULGARITIES?*");

    public static final SubLSymbol $sym3$MEMBER_ = makeSymbol("MEMBER?");

    public static final SubLList $list4 = list(makeSymbol("QUOTE"), makeSymbol("*EXCLUDE-VULGARITIES?*"));

    public static final SubLSymbol $sym5$_EXCLUDE_SLANG__ = makeSymbol("*EXCLUDE-SLANG?*");

    public static final SubLList $list6 = list(makeSymbol("QUOTE"), makeSymbol("*EXCLUDE-SLANG?*"));

    public static final SubLSymbol $sym7$_EXCLUDE_ARCHAIC_SPEECH__ = makeSymbol("*EXCLUDE-ARCHAIC-SPEECH?*");

    public static final SubLList $list8 = list(makeSymbol("QUOTE"), makeSymbol("*EXCLUDE-ARCHAIC-SPEECH?*"));

    private static final SubLSymbol $sym9$_EXCLUDE_INDIRECT_RELATIONS__ = makeSymbol("*EXCLUDE-INDIRECT-RELATIONS?*");

    private static final SubLList $list10 = list(makeSymbol("QUOTE"), makeSymbol("*EXCLUDE-INDIRECT-RELATIONS?*"));

    private static final SubLList $list11 = list(list(makeSymbol("REIFIED-AFFIX"), makeSymbol("&OPTIONAL"), list(makeSymbol("AFFIX-TYPE"), reader_make_constant_shell(makeString("LexicalAffix"))), list(makeSymbol("MESSAGE"), makeString("Mapping reified affixes"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLObject $$LexicalAffix = reader_make_constant_shell(makeString("LexicalAffix"));

    private static final SubLString $$$Mapping_reified_affixes = makeString("Mapping reified affixes");

    private static final SubLSymbol $sym14$TOTAL = makeUninternedSymbol("TOTAL");

    private static final SubLSymbol $sym15$SO_FAR = makeUninternedSymbol("SO-FAR");

    private static final SubLSymbol $sym16$REIFIED_AFFIXES = makeUninternedSymbol("REIFIED-AFFIXES");

    private static final SubLSymbol ALL_FORT_INSTANCES = makeSymbol("ALL-FORT-INSTANCES");



    private static final SubLList $list19 = list(ZERO_INTEGER);









    private static final SubLList $list24 = list(list(makeSymbol("DERIVED-PRED"), makeSymbol("&KEY"), list(makeSymbol("MT"), makeKeyword("ANY"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list25 = list(makeKeyword("MT"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");





    private static final SubLList $list29 = list(list(makeSymbol("HASH-TABLE-KEYS"), list(makeSymbol("DERIVED-PREDS"))));



    private static final SubLSymbol $sym31$DERIVED_PRED_ = makeSymbol("DERIVED-PRED?");

    private static final SubLList $list32 = list(list(makeSymbol("BASE-PRED"), makeSymbol("SUFFIX"), makeSymbol("PRED"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list33 = list(makeKeyword("DONE"));



    private static final SubLSymbol $sym35$RULE = makeUninternedSymbol("RULE");



    private static final SubLSymbol SUFFIX_RULES_FOR_PRED = makeSymbol("SUFFIX-RULES-FOR-PRED");





    private static final SubLSymbol GAF_ARGS = makeSymbol("GAF-ARGS");

    public static final SubLList $list41 = list(list(makeSymbol("*NL-TRIE-ASSUMED-VALID?*"), T));



    public static final SubLList $list43 = list(list(makeSymbol("BOOL")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $nl_trie_accessor_default_case_sensitivity$ = makeSymbol("*NL-TRIE-ACCESSOR-DEFAULT-CASE-SENSITIVITY*");



    private static final SubLList $list46 = list(makeKeyword("ON"), makeKeyword("OFF"));

    private static final SubLList $list47 = list(list(makeSymbol("*NL-TRIE-ACCESSOR-DEFAULT-CASE-SENSITIVITY*"), makeKeyword("ON")));

    public static final SubLList $list48 = list(list(makeSymbol("*NL-TRIE-ACCESSOR-DEFAULT-CASE-SENSITIVITY*"), makeKeyword("OFF")));

    public static final SubLList $list49 = list(list(makeSymbol("*NL-TRIE-ACCESSOR-DEFAULT-CASE-SENSITIVITY*"), makeKeyword("PREFERRED")));

    public static final SubLList $list50 = list(makeSymbol("TEST"), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLList $list52 = list(list(makeSymbol("*NL-TRIE-SUBWORD-INDEX-DEFAULT-CASE-SENSITIVITY*"), makeKeyword("ON")));

    private static final SubLList $list53 = list(list(makeSymbol("*NL-TRIE-SUBWORD-INDEX-DEFAULT-CASE-SENSITIVITY*"), makeKeyword("OFF")));

    private static final SubLList $list54 = list(list(makeSymbol("*NL-TRIE-SUBWORD-INDEX-DEFAULT-CASE-SENSITIVITY*"), makeKeyword("PREFERRED")));

    public static final SubLSymbol $nl_trie_subword_index_default_case_sensitivity$ = makeSymbol("*NL-TRIE-SUBWORD-INDEX-DEFAULT-CASE-SENSITIVITY*");

    private static final SubLList $list56 = list(list(makeSymbol("*NL-TRIE-ASSUME-STANDARDIZED-STRINGS?*"), T));

    public static final SubLList $list57 = list(list(makeSymbol("CURRENT-STATE"), list(makeSymbol("CURRENT-MEMOIZATION-STATE"))), list(makeSymbol("*LEXICON-MEMOIZATION-STATE*"), list(makeSymbol("FIRST-OF"), makeSymbol("CURRENT-STATE"), list(makeSymbol("FIND-OR-CREATE-LEXICON-MEMOIZATION-STATE")))));



    public static final SubLList $list59 = list(makeSymbol("*LEXICON-MEMOIZATION-STATE*"));

    private static final SubLSymbol FIND_OR_CREATE_LEXICON_MEMOIZATION_STATE = makeSymbol("FIND-OR-CREATE-LEXICON-MEMOIZATION-STATE");

    private static final SubLSymbol WITH_LEXICON_MEMOIZATION = makeSymbol("WITH-LEXICON-MEMOIZATION");





    private static final SubLList $list64 = list(list(makeSymbol("FALLBACK?")), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLList $list66 = list(list(makeSymbol("*PARSE-MORPHOLOGICALLY*"), makeKeyword("NEVER")));

    private static final SubLList $list67 = list(list(makeSymbol("*PARSE-MORPHOLOGICALLY*"), makeKeyword("ONLY")));

    private static final SubLList $list68 = list(makeSymbol("USE-SME-LEXWIZ?"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $use_sme_lexwiz$ = makeSymbol("*USE-SME-LEXWIZ*");

    private static final SubLSymbol WITH_SME_LEXWIZ_CONDITIONED = makeSymbol("WITH-SME-LEXWIZ-CONDITIONED");

    public static SubLObject with_lexicon_filters(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject filters = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        filters = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($sym2$_EXCLUDE_VULGARITIES__, list($sym3$MEMBER_, $list4, filters)), list($sym5$_EXCLUDE_SLANG__, list($sym3$MEMBER_, $list6, filters)), list($sym7$_EXCLUDE_ARCHAIC_SPEECH__, list($sym3$MEMBER_, $list8, filters)), list($sym9$_EXCLUDE_INDIRECT_RELATIONS__, list($sym3$MEMBER_, $list10, filters))), append(body, NIL));
    }

    public static SubLObject do_reified_affixes(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list11);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject reified_affix = NIL;
        destructuring_bind_must_consp(current, datum, $list11);
        reified_affix = current.first();
        current = current.rest();
        final SubLObject affix_type = (current.isCons()) ? current.first() : $$LexicalAffix;
        destructuring_bind_must_listp(current, datum, $list11);
        current = current.rest();
        final SubLObject message = (current.isCons()) ? current.first() : $$$Mapping_reified_affixes;
        destructuring_bind_must_listp(current, datum, $list11);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject total = $sym14$TOTAL;
            final SubLObject so_far = $sym15$SO_FAR;
            final SubLObject reified_affixes = $sym16$REIFIED_AFFIXES;
            return list(CLET, list(list(reified_affixes, list(ALL_FORT_INSTANCES, affix_type)), list(total, list(LENGTH, reified_affixes)), bq_cons(so_far, $list19)), list(NOTING_PERCENT_PROGRESS, message, listS(CDOLIST, list(reified_affix, reified_affixes), append(body, list(list(CINC, so_far), list(NOTE_PERCENT_PROGRESS, so_far, total))))));
        }
        cdestructuring_bind_error(datum, $list11);
        return NIL;
    }

    public static SubLObject do_derived_preds(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list24);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject derived_pred = NIL;
        destructuring_bind_must_consp(current, datum, $list24);
        derived_pred = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list24);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list24);
            if (NIL == member(current_$1, $list25, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list24);
        }
        final SubLObject mt_tail = property_list_member($MT, current);
        final SubLObject mt = (NIL != mt_tail) ? cadr(mt_tail) : $ANY;
        final SubLObject body;
        current = body = temp;
        return list(CDOLIST, bq_cons(derived_pred, $list29), listS(PWHEN, list($sym31$DERIVED_PRED_, derived_pred, mt), append(body, NIL)));
    }

    public static SubLObject do_suffix_rules_for_pred(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list32);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject base_pred = NIL;
        SubLObject suffix = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list32);
        base_pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list32);
        suffix = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list32);
        pred = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list32);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list32);
            if (NIL == member(current_$2, $list33, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list32);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject rule = $sym35$RULE;
        return list(CSOME, list(rule, list(SUFFIX_RULES_FOR_PRED, pred), done), listS(CDESTRUCTURING_BIND, list(base_pred, suffix), list(REST, list(GAF_ARGS, rule)), append(body, NIL)));
    }

    public static SubLObject assuming_nl_trie_validity(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list41, append(body, NIL));
    }

    public static SubLObject assume_nl_trie_validP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $nl_trie_assumed_validP$.getDynamicValue(thread);
    }

    public static SubLObject with_nl_trie_case_sensitivity_boolean(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list43);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject bool = NIL;
        destructuring_bind_must_consp(current, datum, $list43);
        bool = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list(list($nl_trie_accessor_default_case_sensitivity$, listS(FIF, bool, $list46))), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list43);
        return NIL;
    }

    public static SubLObject with_nl_trie_case_sensitivity_on(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list47, append(body, NIL));
    }

    public static SubLObject with_nl_trie_case_sensitivity_off(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list48, append(body, NIL));
    }

    public static SubLObject with_nl_trie_case_sensitivity_preferred(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list49, append(body, NIL));
    }

    public static SubLObject with_nl_trie_case_sensitivity_on_unless(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject test = NIL;
        destructuring_bind_must_consp(current, datum, $list50);
        test = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($nl_trie_accessor_default_case_sensitivity$, listS(FIF, list(CNOT, test), $list46))), append(body, NIL));
    }

    public static SubLObject with_nl_trie_subword_index_case_sensitivity_on(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list52, append(body, NIL));
    }

    public static SubLObject with_nl_trie_subword_index_case_sensitivity_off(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list53, append(body, NIL));
    }

    public static SubLObject with_nl_trie_subword_index_case_sensitivity_preferred(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list54, append(body, NIL));
    }

    public static SubLObject with_nl_trie_subword_index_case_sensitivity_on_unless(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject test = NIL;
        destructuring_bind_must_consp(current, datum, $list50);
        test = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($nl_trie_subword_index_default_case_sensitivity$, listS(FIF, list(CNOT, test), $list46))), append(body, NIL));
    }

    public static SubLObject with_nl_trie_standard_strings(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list56, append(body, NIL));
    }

    public static SubLObject with_lexicon_memoization(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(CLET, $list57, listS(WITH_MEMOIZATION_STATE, $list59, append(body, NIL)));
    }

    public static SubLObject find_or_create_lexicon_memoization_state() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != memoization_state.memoization_state_p($lexicon_memoization_state$.getDynamicValue(thread)) ? values($lexicon_memoization_state$.getDynamicValue(thread), $REUSED) : values(memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), $NEW);
    }

    public static SubLObject parsing_morphologically_as_fallback(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list64);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject fallbackP = NIL;
        destructuring_bind_must_consp(current, datum, $list64);
        fallbackP = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(PROGN, listS(CLET, $list66, append(body, NIL)), list(PWHEN, fallbackP, listS(CLET, $list67, append(body, NIL))));
        }
        cdestructuring_bind_error(datum, $list64);
        return NIL;
    }

    public static SubLObject with_sme_lexwiz_conditioned(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject use_sme_lexwizP = NIL;
        destructuring_bind_must_consp(current, datum, $list68);
        use_sme_lexwizP = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($use_sme_lexwiz$, use_sme_lexwizP)), append(body, NIL));
    }

    public static SubLObject with_sme_lexwiz(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_SME_LEXWIZ_CONDITIONED, T, append(body, NIL));
    }

    public static SubLObject with_oe_lexwiz(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_SME_LEXWIZ_CONDITIONED, NIL, append(body, NIL));
    }

    public static SubLObject declare_lexicon_macros_file() {
        declareMacro(me, "with_lexicon_filters", "WITH-LEXICON-FILTERS");
        declareMacro(me, "do_reified_affixes", "DO-REIFIED-AFFIXES");
        declareMacro(me, "do_derived_preds", "DO-DERIVED-PREDS");
        declareMacro(me, "do_suffix_rules_for_pred", "DO-SUFFIX-RULES-FOR-PRED");
        declareMacro(me, "assuming_nl_trie_validity", "ASSUMING-NL-TRIE-VALIDITY");
        declareFunction(me, "assume_nl_trie_validP", "ASSUME-NL-TRIE-VALID?", 0, 0, false);
        declareMacro(me, "with_nl_trie_case_sensitivity_boolean", "WITH-NL-TRIE-CASE-SENSITIVITY-BOOLEAN");
        declareMacro(me, "with_nl_trie_case_sensitivity_on", "WITH-NL-TRIE-CASE-SENSITIVITY-ON");
        declareMacro(me, "with_nl_trie_case_sensitivity_off", "WITH-NL-TRIE-CASE-SENSITIVITY-OFF");
        declareMacro(me, "with_nl_trie_case_sensitivity_preferred", "WITH-NL-TRIE-CASE-SENSITIVITY-PREFERRED");
        declareMacro(me, "with_nl_trie_case_sensitivity_on_unless", "WITH-NL-TRIE-CASE-SENSITIVITY-ON-UNLESS");
        declareMacro(me, "with_nl_trie_subword_index_case_sensitivity_on", "WITH-NL-TRIE-SUBWORD-INDEX-CASE-SENSITIVITY-ON");
        declareMacro(me, "with_nl_trie_subword_index_case_sensitivity_off", "WITH-NL-TRIE-SUBWORD-INDEX-CASE-SENSITIVITY-OFF");
        declareMacro(me, "with_nl_trie_subword_index_case_sensitivity_preferred", "WITH-NL-TRIE-SUBWORD-INDEX-CASE-SENSITIVITY-PREFERRED");
        declareMacro(me, "with_nl_trie_subword_index_case_sensitivity_on_unless", "WITH-NL-TRIE-SUBWORD-INDEX-CASE-SENSITIVITY-ON-UNLESS");
        declareMacro(me, "with_nl_trie_standard_strings", "WITH-NL-TRIE-STANDARD-STRINGS");
        declareMacro(me, "with_lexicon_memoization", "WITH-LEXICON-MEMOIZATION");
        declareFunction(me, "find_or_create_lexicon_memoization_state", "FIND-OR-CREATE-LEXICON-MEMOIZATION-STATE", 0, 0, false);
        declareMacro(me, "parsing_morphologically_as_fallback", "PARSING-MORPHOLOGICALLY-AS-FALLBACK");
        declareMacro(me, "with_sme_lexwiz_conditioned", "WITH-SME-LEXWIZ-CONDITIONED");
        declareMacro(me, "with_sme_lexwiz", "WITH-SME-LEXWIZ");
        declareMacro(me, "with_oe_lexwiz", "WITH-OE-LEXWIZ");
        return NIL;
    }

    public static SubLObject init_lexicon_macros_file() {
        defparameter("*NL-TRIE-ASSUMED-VALID?*", NIL);
        defparameter("*NL-TRIE-ACCESSOR-DEFAULT-CASE-SENSITIVITY*", $OFF);
        defparameter("*NL-TRIE-SUBWORD-INDEX-DEFAULT-CASE-SENSITIVITY*", $OFF);
        defparameter("*NL-TRIE-ASSUME-STANDARDIZED-STRINGS?*", NIL);
        defparameter("*LEXICON-MEMOIZATION-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_lexicon_macros_file() {
        register_macro_helper(FIND_OR_CREATE_LEXICON_MEMOIZATION_STATE, WITH_LEXICON_MEMOIZATION);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_lexicon_macros_file();
    }

    @Override
    public void initializeVariables() {
        init_lexicon_macros_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_lexicon_macros_file();
    }

    static {













































































    }
}

/**
 * Total time: 129 ms
 */
