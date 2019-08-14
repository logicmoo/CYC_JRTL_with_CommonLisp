/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class lexicon_macros extends SubLTranslatedFile implements V12 {
    // Definitions
    /**
     * Execute BODY with the pragmatic filters FILTERS active.
     */
    @LispMethod(comment = "Execute BODY with the pragmatic filters FILTERS active.")
    public static final SubLObject with_pragmatic_filters(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject filters = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            filters = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($exclude_vulgaritiesP$, list($sym3$MEMBER_, $list_alt4, filters)), list($exclude_slangP$, list($sym3$MEMBER_, $list_alt6, filters)), list($exclude_archaic_speechP$, list($sym3$MEMBER_, $list_alt8, filters))), append(body, NIL));
            }
        }
    }

    public static final SubLFile me = new lexicon_macros();

 public static final String myName = "com.cyc.cycjava.cycl.lexicon_macros";


    // defparameter
    // Should entries in the NL trie be assumed to be valid?
    /**
     * Should entries in the NL trie be assumed to be valid?
     */
    @LispMethod(comment = "Should entries in the NL trie be assumed to be valid?\ndefparameter")
    public static final SubLSymbol $nl_trie_assumed_validP$ = makeSymbol("*NL-TRIE-ASSUMED-VALID?*");

    // defparameter
    /**
     * Should NL trie accessors assume any strings passed them are already
     * standardized?
     */
    @LispMethod(comment = "Should NL trie accessors assume any strings passed them are already\r\nstandardized?\ndefparameter\nShould NL trie accessors assume any strings passed them are already\nstandardized?")
    public static final SubLSymbol $nl_trie_assume_standardized_stringsP$ = makeSymbol("*NL-TRIE-ASSUME-STANDARDIZED-STRINGS?*");

    // defparameter
    // The current memoization state of the paraphrase code.
    /**
     * The current memoization state of the paraphrase code.
     */
    @LispMethod(comment = "The current memoization state of the paraphrase code.\ndefparameter")
    public static final SubLSymbol $lexicon_memoization_state$ = makeSymbol("*LEXICON-MEMOIZATION-STATE*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(makeSymbol("FILTERS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $exclude_vulgaritiesP$ = makeSymbol("*EXCLUDE-VULGARITIES?*");

    static private final SubLSymbol $sym3$MEMBER_ = makeSymbol("MEMBER?");

    static private final SubLList $list4 = list(QUOTE, makeSymbol("*EXCLUDE-VULGARITIES?*"));

    public static final SubLSymbol $exclude_slangP$ = makeSymbol("*EXCLUDE-SLANG?*");

    static private final SubLList $list6 = list(QUOTE, makeSymbol("*EXCLUDE-SLANG?*"));

    public static final SubLSymbol $exclude_archaic_speechP$ = makeSymbol("*EXCLUDE-ARCHAIC-SPEECH?*");

    static private final SubLList $list8 = list(QUOTE, makeSymbol("*EXCLUDE-ARCHAIC-SPEECH?*"));

    private static final SubLSymbol $exclude_indirect_relationsP$ = makeSymbol("*EXCLUDE-INDIRECT-RELATIONS?*");

    private static final SubLList $list10 = list(QUOTE, makeSymbol("*EXCLUDE-INDIRECT-RELATIONS?*"));

    private static final SubLList $list11 = list(list(makeSymbol("REIFIED-AFFIX"), makeSymbol("&OPTIONAL"), list(makeSymbol("AFFIX-TYPE"), reader_make_constant_shell("LexicalAffix")), list(makeSymbol("MESSAGE"), makeString("Mapping reified affixes"))), makeSymbol("&BODY"), makeSymbol("BODY"));



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

    private static final SubLList $list33 = list($DONE);

    private static final SubLSymbol $sym35$RULE = makeUninternedSymbol("RULE");

    private static final SubLSymbol SUFFIX_RULES_FOR_PRED = makeSymbol("SUFFIX-RULES-FOR-PRED");

    private static final SubLSymbol GAF_ARGS = makeSymbol("GAF-ARGS");

    static private final SubLList $list41 = list(list(makeSymbol("*NL-TRIE-ASSUMED-VALID?*"), T));

    static private final SubLList $list43 = list(list(makeSymbol("BOOL")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $nl_trie_accessor_default_case_sensitivity$ = makeSymbol("*NL-TRIE-ACCESSOR-DEFAULT-CASE-SENSITIVITY*");

    private static final SubLList $list46 = list(makeKeyword("ON"), makeKeyword("OFF"));

    private static final SubLList $list47 = list(list(makeSymbol("*NL-TRIE-ACCESSOR-DEFAULT-CASE-SENSITIVITY*"), makeKeyword("ON")));

    static private final SubLList $list48 = list(list(makeSymbol("*NL-TRIE-ACCESSOR-DEFAULT-CASE-SENSITIVITY*"), makeKeyword("OFF")));

    static private final SubLList $list49 = list(list(makeSymbol("*NL-TRIE-ACCESSOR-DEFAULT-CASE-SENSITIVITY*"), makeKeyword("PREFERRED")));

    static private final SubLList $list50 = list(makeSymbol("TEST"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list52 = list(list(makeSymbol("*NL-TRIE-SUBWORD-INDEX-DEFAULT-CASE-SENSITIVITY*"), makeKeyword("ON")));

    private static final SubLList $list53 = list(list(makeSymbol("*NL-TRIE-SUBWORD-INDEX-DEFAULT-CASE-SENSITIVITY*"), makeKeyword("OFF")));

    private static final SubLList $list54 = list(list(makeSymbol("*NL-TRIE-SUBWORD-INDEX-DEFAULT-CASE-SENSITIVITY*"), makeKeyword("PREFERRED")));

    public static final SubLSymbol $nl_trie_subword_index_default_case_sensitivity$ = makeSymbol("*NL-TRIE-SUBWORD-INDEX-DEFAULT-CASE-SENSITIVITY*");

    private static final SubLList $list56 = list(list(makeSymbol("*NL-TRIE-ASSUME-STANDARDIZED-STRINGS?*"), T));

    static private final SubLList $list57 = list(list(makeSymbol("CURRENT-STATE"), list(makeSymbol("CURRENT-MEMOIZATION-STATE"))), list(makeSymbol("*LEXICON-MEMOIZATION-STATE*"), list(makeSymbol("FIRST-OF"), makeSymbol("CURRENT-STATE"), list(makeSymbol("FIND-OR-CREATE-LEXICON-MEMOIZATION-STATE")))));

    static private final SubLList $list59 = list(makeSymbol("*LEXICON-MEMOIZATION-STATE*"));

    private static final SubLSymbol FIND_OR_CREATE_LEXICON_MEMOIZATION_STATE = makeSymbol("FIND-OR-CREATE-LEXICON-MEMOIZATION-STATE");

    private static final SubLSymbol WITH_LEXICON_MEMOIZATION = makeSymbol("WITH-LEXICON-MEMOIZATION");

    private static final SubLList $list64 = list(list(makeSymbol("FALLBACK?")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list66 = list(list(makeSymbol("*PARSE-MORPHOLOGICALLY*"), makeKeyword("NEVER")));

    private static final SubLList $list67 = list(list(makeSymbol("*PARSE-MORPHOLOGICALLY*"), $ONLY));

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
        return listS(CLET, list(list($exclude_vulgaritiesP$, list($sym3$MEMBER_, $list4, filters)), list($exclude_slangP$, list($sym3$MEMBER_, $list6, filters)), list($exclude_archaic_speechP$, list($sym3$MEMBER_, $list8, filters)), list($exclude_indirect_relationsP$, list($sym3$MEMBER_, $list10, filters))), append(body, NIL));
    }

    /**
     * Execute BODY with REIFIED-AFFIX bound iteratively to each instance of AFFIX-TYPE visible.
     *
     * @unknown mt is set from outside
     */
    @LispMethod(comment = "Execute BODY with REIFIED-AFFIX bound iteratively to each instance of AFFIX-TYPE visible.\r\n\r\n@unknown mt is set from outside")
    public static final SubLObject do_reified_affixes_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt9);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject reified_affix = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt9);
                    reified_affix = current.first();
                    current = current.rest();
                    {
                        SubLObject affix_type = (current.isCons()) ? ((SubLObject) (current.first())) : $$LexicalAffix;
                        destructuring_bind_must_listp(current, datum, $list_alt9);
                        current = current.rest();
                        {
                            SubLObject message = (current.isCons()) ? ((SubLObject) (current.first())) : $$$Mapping_reified_affixes;
                            destructuring_bind_must_listp(current, datum, $list_alt9);
                            current = current.rest();
                            if (NIL == current) {
                                current = temp;
                                {
                                    SubLObject body = current;
                                    SubLObject total = $sym12$TOTAL;
                                    SubLObject so_far = $sym13$SO_FAR;
                                    SubLObject reified_affixes = $sym14$REIFIED_AFFIXES;
                                    return list(CLET, list(list(reified_affixes, list(ALL_FORT_INSTANCES, affix_type)), list(total, list(LENGTH, reified_affixes)), bq_cons(so_far, $list_alt17)), list(NOTING_PERCENT_PROGRESS, message, listS(CDOLIST, list(reified_affix, reified_affixes), append(body, list(list(CINC, so_far), list(NOTE_PERCENT_PROGRESS, so_far, total))))));
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt9);
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Execute BODY with REIFIED-AFFIX bound iteratively to each instance of AFFIX-TYPE visible.
     *
     * @unknown mt is set from outside
     */
    @LispMethod(comment = "Execute BODY with REIFIED-AFFIX bound iteratively to each instance of AFFIX-TYPE visible.\r\n\r\n@unknown mt is set from outside")
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

    /**
     * Iterate over all derived speech-part predicates
     */
    @LispMethod(comment = "Iterate over all derived speech-part predicates")
    public static final SubLObject do_derived_preds_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt22);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject derived_pred = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt22);
                    derived_pred = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt22);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt22);
                            if (NIL == member(current_1, $list_alt23, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt22);
                        }
                        {
                            SubLObject mt_tail = property_list_member($MT, current);
                            SubLObject mt = (NIL != mt_tail) ? ((SubLObject) (cadr(mt_tail))) : $ANY;
                            current = temp;
                            {
                                SubLObject body = current;
                                return list(CDOLIST, bq_cons(derived_pred, $list_alt27), listS(PWHEN, list($sym29$DERIVED_PRED_, derived_pred, mt), append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Iterate over all derived speech-part predicates
     */
    @LispMethod(comment = "Iterate over all derived speech-part predicates")
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

    public static final SubLObject do_suffix_rules_for_pred_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt30);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject base_pred = NIL;
                    SubLObject suffix = NIL;
                    SubLObject pred = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt30);
                    base_pred = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt30);
                    suffix = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt30);
                    pred = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_2 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt30);
                            current_2 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt30);
                            if (NIL == member(current_2, $list_alt31, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_2 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt30);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject rule = $sym33$RULE;
                                return list(CSOME, list(rule, list(SUFFIX_RULES_FOR_PRED, pred), done), listS(CDESTRUCTURING_BIND, list(base_pred, suffix), list(REST, list(GAF_ARGS, rule)), append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
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

    /**
     * Execute BODY with NL trie entry validation turned off
     */
    @LispMethod(comment = "Execute BODY with NL trie entry validation turned off")
    public static final SubLObject assuming_nl_trie_validity_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt39, append(body, NIL));
        }
    }

    /**
     * Execute BODY with NL trie entry validation turned off
     */
    @LispMethod(comment = "Execute BODY with NL trie entry validation turned off")
    public static SubLObject assuming_nl_trie_validity(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list41, append(body, NIL));
    }

    public static final SubLObject assume_nl_trie_validP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $nl_trie_assumed_validP$.getDynamicValue(thread);
        }
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

    /**
     * Execute BODY with NL trie accessors in case-sensitive mode.
     */
    @LispMethod(comment = "Execute BODY with NL trie accessors in case-sensitive mode.")
    public static final SubLObject with_nl_trie_case_sensitivity_on_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt41, append(body, NIL));
        }
    }

    /**
     * Execute BODY with NL trie accessors in case-sensitive mode.
     */
    @LispMethod(comment = "Execute BODY with NL trie accessors in case-sensitive mode.")
    public static SubLObject with_nl_trie_case_sensitivity_on(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list47, append(body, NIL));
    }

    /**
     * Execute BODY with NL trie accessors in case-insensitive mode.
     */
    @LispMethod(comment = "Execute BODY with NL trie accessors in case-insensitive mode.")
    public static final SubLObject with_nl_trie_case_sensitivity_off_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt42, append(body, NIL));
        }
    }

    /**
     * Execute BODY with NL trie accessors in case-insensitive mode.
     */
    @LispMethod(comment = "Execute BODY with NL trie accessors in case-insensitive mode.")
    public static SubLObject with_nl_trie_case_sensitivity_off(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list48, append(body, NIL));
    }

    /**
     * Execute BODY with NL trie accessors in case-sensitive-preferred mode.
     */
    @LispMethod(comment = "Execute BODY with NL trie accessors in case-sensitive-preferred mode.")
    public static final SubLObject with_nl_trie_case_sensitivity_preferred_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt43, append(body, NIL));
        }
    }

    /**
     * Execute BODY with NL trie accessors in case-sensitive-preferred mode.
     */
    @LispMethod(comment = "Execute BODY with NL trie accessors in case-sensitive-preferred mode.")
    public static SubLObject with_nl_trie_case_sensitivity_preferred(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list49, append(body, NIL));
    }

    /**
     * Execute BODY with NL trie accessors in case-sensitive mode, unless
     * TEST is non-NIL.
     */
    @LispMethod(comment = "Execute BODY with NL trie accessors in case-sensitive mode, unless\r\nTEST is non-NIL.\nExecute BODY with NL trie accessors in case-sensitive mode, unless\nTEST is non-NIL.")
    public static final SubLObject with_nl_trie_case_sensitivity_on_unless_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject test = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt44);
            test = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($nl_trie_accessor_default_case_sensitivity$, listS(FIF, list(CNOT, test), $list_alt48))), append(body, NIL));
            }
        }
    }

    /**
     * Execute BODY with NL trie accessors in case-sensitive mode, unless
     * TEST is non-NIL.
     */
    @LispMethod(comment = "Execute BODY with NL trie accessors in case-sensitive mode, unless\r\nTEST is non-NIL.\nExecute BODY with NL trie accessors in case-sensitive mode, unless\nTEST is non-NIL.")
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

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(makeSymbol("FILTERS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt4 = list(QUOTE, makeSymbol("*EXCLUDE-VULGARITIES?*"));

    /**
     * Execute BODY under the assumption that all strings passed to NL trie
     * accessors are already in NL-trie-standard form.
     */
    @LispMethod(comment = "Execute BODY under the assumption that all strings passed to NL trie\r\naccessors are already in NL-trie-standard form.\nExecute BODY under the assumption that all strings passed to NL trie\naccessors are already in NL-trie-standard form.")
    public static final SubLObject with_nl_trie_standard_strings_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt49, append(body, NIL));
        }
    }

    /**
     * Execute BODY under the assumption that all strings passed to NL trie
     * accessors are already in NL-trie-standard form.
     */
    @LispMethod(comment = "Execute BODY under the assumption that all strings passed to NL trie\r\naccessors are already in NL-trie-standard form.\nExecute BODY under the assumption that all strings passed to NL trie\naccessors are already in NL-trie-standard form.")
    public static SubLObject with_nl_trie_standard_strings(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list56, append(body, NIL));
    }

    static private final SubLList $list_alt6 = list(QUOTE, makeSymbol("*EXCLUDE-SLANG?*"));

    /**
     * Execute BODY using the memoization state associated with the outermost
     * use of this macro. Memoized paraphrase functions will not be cleared inside this macro.
     */
    @LispMethod(comment = "Execute BODY using the memoization state associated with the outermost\r\nuse of this macro. Memoized paraphrase functions will not be cleared inside this macro.\nExecute BODY using the memoization state associated with the outermost\nuse of this macro. Memoized paraphrase functions will not be cleared inside this macro.")
    public static final SubLObject with_lexicon_memoization_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(CLET, $list_alt50, listS(WITH_MEMOIZATION_STATE, $list_alt52, append(body, NIL)));
        }
    }

    /**
     * Execute BODY using the memoization state associated with the outermost
     * use of this macro. Memoized paraphrase functions will not be cleared inside this macro.
     */
    @LispMethod(comment = "Execute BODY using the memoization state associated with the outermost\r\nuse of this macro. Memoized paraphrase functions will not be cleared inside this macro.\nExecute BODY using the memoization state associated with the outermost\nuse of this macro. Memoized paraphrase functions will not be cleared inside this macro.")
    public static SubLObject with_lexicon_memoization(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(CLET, $list57, listS(WITH_MEMOIZATION_STATE, $list59, append(body, NIL)));
    }

    static private final SubLList $list_alt8 = list(QUOTE, makeSymbol("*EXCLUDE-ARCHAIC-SPEECH?*"));

    static private final SubLList $list_alt9 = list(list(makeSymbol("REIFIED-AFFIX"), makeSymbol("&OPTIONAL"), list(makeSymbol("AFFIX-TYPE"), reader_make_constant_shell("LexicalAffix")), list(makeSymbol("MESSAGE"), makeString("Mapping reified affixes"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLObject find_or_create_lexicon_memoization_state_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return NIL != memoization_state.memoization_state_p($lexicon_memoization_state$.getDynamicValue(thread)) ? ((SubLObject) (values($lexicon_memoization_state$.getDynamicValue(thread), $REUSED))) : values(memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), $NEW);
        }
    }

    public static SubLObject find_or_create_lexicon_memoization_state() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != memoization_state.memoization_state_p($lexicon_memoization_state$.getDynamicValue(thread)) ? values($lexicon_memoization_state$.getDynamicValue(thread), $REUSED) : values(memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), $NEW);
    }

    static private final SubLSymbol $sym12$TOTAL = makeUninternedSymbol("TOTAL");

    static private final SubLSymbol $sym13$SO_FAR = makeUninternedSymbol("SO-FAR");

    /**
     * Execute BODY with morphological parsing off, then if FALLBACK? is non-NIL, again
     * with morphological parsing on.
     */
    @LispMethod(comment = "Execute BODY with morphological parsing off, then if FALLBACK? is non-NIL, again\r\nwith morphological parsing on.\nExecute BODY with morphological parsing off, then if FALLBACK? is non-NIL, again\nwith morphological parsing on.")
    public static final SubLObject parsing_morphologically_as_fallback_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt57);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject fallbackP = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt57);
                    fallbackP = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return list(PROGN, listS(CLET, $list_alt59, append(body, NIL)), list(PWHEN, fallbackP, listS(CLET, $list_alt60, append(body, NIL))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt57);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Execute BODY with morphological parsing off, then if FALLBACK? is non-NIL, again
     * with morphological parsing on.
     */
    @LispMethod(comment = "Execute BODY with morphological parsing off, then if FALLBACK? is non-NIL, again\r\nwith morphological parsing on.\nExecute BODY with morphological parsing off, then if FALLBACK? is non-NIL, again\nwith morphological parsing on.")
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

    static private final SubLSymbol $sym14$REIFIED_AFFIXES = makeUninternedSymbol("REIFIED-AFFIXES");

    static private final SubLList $list_alt17 = list(ZERO_INTEGER);

    static private final SubLList $list_alt22 = list(list(makeSymbol("DERIVED-PRED"), makeSymbol("&KEY"), list(makeSymbol("MT"), makeKeyword("ANY"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt23 = list(makeKeyword("MT"));

    static private final SubLList $list_alt27 = list(list(makeSymbol("HASH-TABLE-KEYS"), list(makeSymbol("DERIVED-PREDS"))));

    static private final SubLSymbol $sym29$DERIVED_PRED_ = makeSymbol("DERIVED-PRED?");

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

    static private final SubLList $list_alt30 = list(list(makeSymbol("BASE-PRED"), makeSymbol("SUFFIX"), makeSymbol("PRED"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt31 = list($DONE);

    static private final SubLSymbol $sym33$RULE = makeUninternedSymbol("RULE");

    public static SubLObject with_sme_lexwiz(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_SME_LEXWIZ_CONDITIONED, T, append(body, NIL));
    }

    static private final SubLList $list_alt39 = list(list(makeSymbol("*NL-TRIE-ASSUMED-VALID?*"), T));

    static private final SubLList $list_alt41 = list(list(makeSymbol("*NL-TRIE-ACCESSOR-DEFAULT-CASE-SENSITIVITY*"), makeKeyword("ON")));

    public static SubLObject with_oe_lexwiz(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_SME_LEXWIZ_CONDITIONED, NIL, append(body, NIL));
    }

    static private final SubLList $list_alt42 = list(list(makeSymbol("*NL-TRIE-ACCESSOR-DEFAULT-CASE-SENSITIVITY*"), makeKeyword("OFF")));

    static private final SubLList $list_alt43 = list(list(makeSymbol("*NL-TRIE-ACCESSOR-DEFAULT-CASE-SENSITIVITY*"), makeKeyword("PREFERRED")));

    static private final SubLList $list_alt44 = list(makeSymbol("TEST"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLObject declare_lexicon_macros_file_alt() {
        declareMacro("with_pragmatic_filters", "WITH-PRAGMATIC-FILTERS");
        declareMacro("do_reified_affixes", "DO-REIFIED-AFFIXES");
        declareMacro("do_derived_preds", "DO-DERIVED-PREDS");
        declareMacro("do_suffix_rules_for_pred", "DO-SUFFIX-RULES-FOR-PRED");
        declareMacro("assuming_nl_trie_validity", "ASSUMING-NL-TRIE-VALIDITY");
        declareFunction("assume_nl_trie_validP", "ASSUME-NL-TRIE-VALID?", 0, 0, false);
        declareMacro("with_nl_trie_case_sensitivity_on", "WITH-NL-TRIE-CASE-SENSITIVITY-ON");
        declareMacro("with_nl_trie_case_sensitivity_off", "WITH-NL-TRIE-CASE-SENSITIVITY-OFF");
        declareMacro("with_nl_trie_case_sensitivity_preferred", "WITH-NL-TRIE-CASE-SENSITIVITY-PREFERRED");
        declareMacro("with_nl_trie_case_sensitivity_on_unless", "WITH-NL-TRIE-CASE-SENSITIVITY-ON-UNLESS");
        declareMacro("with_nl_trie_standard_strings", "WITH-NL-TRIE-STANDARD-STRINGS");
        declareMacro("with_lexicon_memoization", "WITH-LEXICON-MEMOIZATION");
        declareFunction("find_or_create_lexicon_memoization_state", "FIND-OR-CREATE-LEXICON-MEMOIZATION-STATE", 0, 0, false);
        declareMacro("parsing_morphologically_as_fallback", "PARSING-MORPHOLOGICALLY-AS-FALLBACK");
        return NIL;
    }

    public static SubLObject declare_lexicon_macros_file() {
        if (SubLFiles.USE_V1) {
            declareMacro("with_lexicon_filters", "WITH-LEXICON-FILTERS");
            declareMacro("do_reified_affixes", "DO-REIFIED-AFFIXES");
            declareMacro("do_derived_preds", "DO-DERIVED-PREDS");
            declareMacro("do_suffix_rules_for_pred", "DO-SUFFIX-RULES-FOR-PRED");
            declareMacro("assuming_nl_trie_validity", "ASSUMING-NL-TRIE-VALIDITY");
            declareFunction("assume_nl_trie_validP", "ASSUME-NL-TRIE-VALID?", 0, 0, false);
            declareMacro("with_nl_trie_case_sensitivity_boolean", "WITH-NL-TRIE-CASE-SENSITIVITY-BOOLEAN");
            declareMacro("with_nl_trie_case_sensitivity_on", "WITH-NL-TRIE-CASE-SENSITIVITY-ON");
            declareMacro("with_nl_trie_case_sensitivity_off", "WITH-NL-TRIE-CASE-SENSITIVITY-OFF");
            declareMacro("with_nl_trie_case_sensitivity_preferred", "WITH-NL-TRIE-CASE-SENSITIVITY-PREFERRED");
            declareMacro("with_nl_trie_case_sensitivity_on_unless", "WITH-NL-TRIE-CASE-SENSITIVITY-ON-UNLESS");
            declareMacro("with_nl_trie_subword_index_case_sensitivity_on", "WITH-NL-TRIE-SUBWORD-INDEX-CASE-SENSITIVITY-ON");
            declareMacro("with_nl_trie_subword_index_case_sensitivity_off", "WITH-NL-TRIE-SUBWORD-INDEX-CASE-SENSITIVITY-OFF");
            declareMacro("with_nl_trie_subword_index_case_sensitivity_preferred", "WITH-NL-TRIE-SUBWORD-INDEX-CASE-SENSITIVITY-PREFERRED");
            declareMacro("with_nl_trie_subword_index_case_sensitivity_on_unless", "WITH-NL-TRIE-SUBWORD-INDEX-CASE-SENSITIVITY-ON-UNLESS");
            declareMacro("with_nl_trie_standard_strings", "WITH-NL-TRIE-STANDARD-STRINGS");
            declareMacro("with_lexicon_memoization", "WITH-LEXICON-MEMOIZATION");
            declareFunction("find_or_create_lexicon_memoization_state", "FIND-OR-CREATE-LEXICON-MEMOIZATION-STATE", 0, 0, false);
            declareMacro("parsing_morphologically_as_fallback", "PARSING-MORPHOLOGICALLY-AS-FALLBACK");
            declareMacro("with_sme_lexwiz_conditioned", "WITH-SME-LEXWIZ-CONDITIONED");
            declareMacro("with_sme_lexwiz", "WITH-SME-LEXWIZ");
            declareMacro("with_oe_lexwiz", "WITH-OE-LEXWIZ");
        }
        if (SubLFiles.USE_V2) {
            declareMacro("with_pragmatic_filters", "WITH-PRAGMATIC-FILTERS");
        }
        return NIL;
    }

    public static SubLObject declare_lexicon_macros_file_Previous() {
        declareMacro("with_lexicon_filters", "WITH-LEXICON-FILTERS");
        declareMacro("do_reified_affixes", "DO-REIFIED-AFFIXES");
        declareMacro("do_derived_preds", "DO-DERIVED-PREDS");
        declareMacro("do_suffix_rules_for_pred", "DO-SUFFIX-RULES-FOR-PRED");
        declareMacro("assuming_nl_trie_validity", "ASSUMING-NL-TRIE-VALIDITY");
        declareFunction("assume_nl_trie_validP", "ASSUME-NL-TRIE-VALID?", 0, 0, false);
        declareMacro("with_nl_trie_case_sensitivity_boolean", "WITH-NL-TRIE-CASE-SENSITIVITY-BOOLEAN");
        declareMacro("with_nl_trie_case_sensitivity_on", "WITH-NL-TRIE-CASE-SENSITIVITY-ON");
        declareMacro("with_nl_trie_case_sensitivity_off", "WITH-NL-TRIE-CASE-SENSITIVITY-OFF");
        declareMacro("with_nl_trie_case_sensitivity_preferred", "WITH-NL-TRIE-CASE-SENSITIVITY-PREFERRED");
        declareMacro("with_nl_trie_case_sensitivity_on_unless", "WITH-NL-TRIE-CASE-SENSITIVITY-ON-UNLESS");
        declareMacro("with_nl_trie_subword_index_case_sensitivity_on", "WITH-NL-TRIE-SUBWORD-INDEX-CASE-SENSITIVITY-ON");
        declareMacro("with_nl_trie_subword_index_case_sensitivity_off", "WITH-NL-TRIE-SUBWORD-INDEX-CASE-SENSITIVITY-OFF");
        declareMacro("with_nl_trie_subword_index_case_sensitivity_preferred", "WITH-NL-TRIE-SUBWORD-INDEX-CASE-SENSITIVITY-PREFERRED");
        declareMacro("with_nl_trie_subword_index_case_sensitivity_on_unless", "WITH-NL-TRIE-SUBWORD-INDEX-CASE-SENSITIVITY-ON-UNLESS");
        declareMacro("with_nl_trie_standard_strings", "WITH-NL-TRIE-STANDARD-STRINGS");
        declareMacro("with_lexicon_memoization", "WITH-LEXICON-MEMOIZATION");
        declareFunction("find_or_create_lexicon_memoization_state", "FIND-OR-CREATE-LEXICON-MEMOIZATION-STATE", 0, 0, false);
        declareMacro("parsing_morphologically_as_fallback", "PARSING-MORPHOLOGICALLY-AS-FALLBACK");
        declareMacro("with_sme_lexwiz_conditioned", "WITH-SME-LEXWIZ-CONDITIONED");
        declareMacro("with_sme_lexwiz", "WITH-SME-LEXWIZ");
        declareMacro("with_oe_lexwiz", "WITH-OE-LEXWIZ");
        return NIL;
    }

    static private final SubLList $list_alt48 = list(makeKeyword("ON"), makeKeyword("OFF"));

    static private final SubLList $list_alt49 = list(list(makeSymbol("*NL-TRIE-ASSUME-STANDARDIZED-STRINGS?*"), T));

    static private final SubLList $list_alt50 = list(list(makeSymbol("CURRENT-STATE"), list(makeSymbol("CURRENT-MEMOIZATION-STATE"))), list(makeSymbol("*LEXICON-MEMOIZATION-STATE*"), list(makeSymbol("FIRST-OF"), makeSymbol("CURRENT-STATE"), list(makeSymbol("FIND-OR-CREATE-LEXICON-MEMOIZATION-STATE")))));

    static private final SubLList $list_alt52 = list(makeSymbol("*LEXICON-MEMOIZATION-STATE*"));

    static private final SubLList $list_alt57 = list(list(makeSymbol("FALLBACK?")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt59 = list(list(makeSymbol("*PARSE-MORPHOLOGICALLY*"), makeKeyword("NEVER")));

    static private final SubLList $list_alt60 = list(list(makeSymbol("*PARSE-MORPHOLOGICALLY*"), $ONLY));

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
