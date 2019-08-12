/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sbhl;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class sbhl_time_vars extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new sbhl_time_vars();

 public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_time_vars";


    // defparameter
    // Definitions
    /**
     * Gates whether the hl data structure will be updated when temporal relation
     * literals are asserted and unasserted, and whether removal modules will be
     * triggered in response to temporal relation queries.
     */
    @LispMethod(comment = "Gates whether the hl data structure will be updated when temporal relation\r\nliterals are asserted and unasserted, and whether removal modules will be\r\ntriggered in response to temporal relation queries.\ndefparameter\nGates whether the hl data structure will be updated when temporal relation\nliterals are asserted and unasserted, and whether removal modules will be\ntriggered in response to temporal relation queries.")
    public static final SubLSymbol $sbhl_temporality_activeP$ = makeSymbol("*SBHL-TEMPORALITY-ACTIVE?*");



    // defparameter
    /**
     * Include links of the form (<link-type keyword> <node> <node> <mt>) in
     * temporal relation justifications?
     */
    @LispMethod(comment = "Include links of the form (<link-type keyword> <node> <node> <mt>) in\r\ntemporal relation justifications?\ndefparameter\nInclude links of the form (<link-type keyword> <node> <node> <mt>) in\ntemporal relation justifications?")
    public static final SubLSymbol $sbhl_temporality_verbose_justsP$ = makeSymbol("*SBHL-TEMPORALITY-VERBOSE-JUSTS?*");

    // defparameter
    /**
     * Include only links of the form (<link-type keyword> <node> <node> <mt>) in
     * temporal relation justifications - that is, exclude assertions - when the
     * value of *sbhl-temporality-verbose-justs?* is t?
     */
    @LispMethod(comment = "Include only links of the form (<link-type keyword> <node> <node> <mt>) in\r\ntemporal relation justifications - that is, exclude assertions - when the\r\nvalue of *sbhl-temporality-verbose-justs?* is t?\ndefparameter\nInclude only links of the form (<link-type keyword> <node> <node> <mt>) in\ntemporal relation justifications - that is, exclude assertions - when the\nvalue of *sbhl-temporality-verbose-justs?* is t?")
    public static final SubLSymbol $sbhl_temporality_include_only_links_in_verbose_justsP$ = makeSymbol("*SBHL-TEMPORALITY-INCLUDE-ONLY-LINKS-IN-VERBOSE-JUSTS?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $sbhl_temporal_points_being_removed$ = makeSymbol("*SBHL-TEMPORAL-POINTS-BEING-REMOVED*");

    // defparameter
    /**
     * a dynamically-created hashtable that records consequents of temporal link
     * disjunctions
     */
    @LispMethod(comment = "a dynamically-created hashtable that records consequents of temporal link\r\ndisjunctions\ndefparameter\na dynamically-created hashtable that records consequents of temporal link\ndisjunctions")
    public static final SubLSymbol $sbhl_temporal_link_disjunction_consequent_table$ = makeSymbol("*SBHL-TEMPORAL-LINK-DISJUNCTION-CONSEQUENT-TABLE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $sbhl_temporality_dont_collect_dates_when_all_accessingP$ = makeSymbol("*SBHL-TEMPORALITY-DONT-COLLECT-DATES-WHEN-ALL-ACCESSING?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $sbhl_temporality_consequent_links_search_passed_through$ = makeSymbol("*SBHL-TEMPORALITY-CONSEQUENT-LINKS-SEARCH-PASSED-THROUGH*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $sbhl_temporality_succession_depth_threshold$ = makeSymbol("*SBHL-TEMPORALITY-SUCCESSION-DEPTH-THRESHOLD*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $sbhl_temporality_date_succession$ = makeSymbol("*SBHL-TEMPORALITY-DATE-SUCCESSION*");

    // defparameter
    /**
     * dynamically bound to T on the winding of a justification search if the search
     * passed through a date node.
     */
    @LispMethod(comment = "dynamically bound to T on the winding of a justification search if the search\r\npassed through a date node.\ndefparameter\ndynamically bound to T on the winding of a justification search if the search\npassed through a date node.")
    public static final SubLSymbol $sbhl_temporality_search_passed_through_dateP$ = makeSymbol("*SBHL-TEMPORALITY-SEARCH-PASSED-THROUGH-DATE?*");

    // defparameter
    /**
     * used during the unwind of a justification search, so that no justification is
     * made between the first date encountered during the search (as noted by @see
     * sbhl-temporality-search-passed-through-date?*), and the last date
     * encountered.
     */
    @LispMethod(comment = "used during the unwind of a justification search, so that no justification is\r\nmade between the first date encountered during the search (as noted by @see\r\nsbhl-temporality-search-passed-through-date?*), and the last date\r\nencountered.\ndefparameter\nused during the unwind of a justification search, so that no justification is\nmade between the first date encountered during the search (as noted by @see\nsbhl-temporality-search-passed-through-date?*), and the last date\nencountered.")
    public static final SubLSymbol $sbhl_temporality_justification_gathering_passed_through_dateP$ = makeSymbol("*SBHL-TEMPORALITY-JUSTIFICATION-GATHERING-PASSED-THROUGH-DATE?*");

    // deflexical
    // The HL predicates used for temporal links
    /**
     * The HL predicates used for temporal links
     */
    @LispMethod(comment = "The HL predicates used for temporal links\ndeflexical")
    private static final SubLSymbol $sbhl_hl_time_predicates$ = makeSymbol("*SBHL-HL-TIME-PREDICATES*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    public static final SubLSymbol $sbhl_temporality_consider_link_disjunctionsP$ = makeSymbol("*SBHL-TEMPORALITY-CONSIDER-LINK-DISJUNCTIONS?*");

    static private final SubLString $str1$Consider_disjunctive_temporal_rel = makeString("Consider disjunctive temporal relation literals");

    static private final SubLString $str2$This_controls_whether_the_HL_modu = makeString("This controls whether the HL module that handles temporal relation\n   queries will consider temporal relation literal assertions the\n   information content of which is disjunctive.  Typically, such literals\n   are negated ground atomic formulas.  (Considering them adds some expense.)");

    static private final SubLList $list3 = list(list(makeKeyword("VALUE"), NIL, makeString("No")), list(makeKeyword("VALUE"), T, makeString("Yes")));

    static private final SubLList $list4 = list(makeSymbol("MT"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list6 = list(makeSymbol("*SBHL-TEMPORAL-LINK-DISJUNCTION-CONSEQUENT-TABLE*"));

    static private final SubLList $list10 = list(list(makeSymbol("CNOT"), list(makeSymbol("COR"), list(makeSymbol("ALL-MTS-ARE-RELEVANT?")), list(makeSymbol("ANY-MT-IS-RELEVANT?")))));

    static private final SubLList $list12 = list(makeSymbol("*MT*"));

    private static final SubLSymbol ADD_TEMPORAL_LINK_DISJUNCTION_CONSEQUENTS = makeSymbol("ADD-TEMPORAL-LINK-DISJUNCTION-CONSEQUENTS");

    private static final SubLSymbol REMOVE_TEMPORAL_LINK_DISJUNCTION_CONSEQUENTS = makeSymbol("REMOVE-TEMPORAL-LINK-DISJUNCTION-CONSEQUENTS");

    public static final SubLSymbol $sbhl_temporal_link_support_table$ = makeSymbol("*SBHL-TEMPORAL-LINK-SUPPORT-TABLE*");

    private static final SubLInteger $int$40000 = makeInteger(40000);

    public static final SubLSymbol $sbhl_temporal_link_disjunction_support_table$ = makeSymbol("*SBHL-TEMPORAL-LINK-DISJUNCTION-SUPPORT-TABLE*");

    private static final SubLInteger $int$4000 = makeInteger(4000);

    public static final SubLSymbol $sbhl_temporal_link_disjunction_term_table$ = makeSymbol("*SBHL-TEMPORAL-LINK-DISJUNCTION-TERM-TABLE*");

    public static final SubLSymbol $sbhl_extended_universal_date_list$ = makeSymbol("*SBHL-EXTENDED-UNIVERSAL-DATE-LIST*");

    public static final SubLSymbol $sbhl_time_predicates$ = makeSymbol("*SBHL-TIME-PREDICATES*");

    public static final SubLSymbol $sbhl_time_modules$ = makeSymbol("*SBHL-TIME-MODULES*");

    static private final SubLList $list23 = list(list(makeSymbol("*SBHL-TEMPORALITY-DONT-COLLECT-DATES-WHEN-ALL-ACCESSING?*"), T));

    static private final SubLList $list24 = list(makeSymbol("POLARITY"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list27 = list(makeSymbol("KEYWORDP"));

    public static final SubLSymbol $sbhl_temporality_all_accesses_polarity_filter$ = makeSymbol("*SBHL-TEMPORALITY-ALL-ACCESSES-POLARITY-FILTER*");

    static private final SubLList $list29 = list(list(makeSymbol("*SBHL-TEMPORALITY-ALL-ACCESSES-POLARITY-FILTER*"), NIL));

    static private final SubLList $list30 = list(makeSymbol("INTEGER"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list31 = list(makeSymbol("INTEGERP"));

    public static final SubLSymbol $sbhl_temporality_succession_depth$ = makeSymbol("*SBHL-TEMPORALITY-SUCCESSION-DEPTH*");

    static private final SubLList $list33 = list(list(makeSymbol("*SBHL-TEMPORALITY-JUSTIFICATION-GATHERING-PASSED-THROUGH-DATE?*"), NIL), list(makeSymbol("*SBHL-TEMPORALITY-SEARCH-PASSED-THROUGH-DATE?*"), NIL));

    static private final SubLList $list34 = list(reader_make_constant_shell("weak-HL-TimePrecedence"), reader_make_constant_shell("strict-HL-TimePrecedence"), reader_make_constant_shell("successorStrict-HL-TimePrecedence"), reader_make_constant_shell("weakSuccessor-HL-TimePrecedence"));

    static private final SubLList $list35 = list(list(makeSymbol("PRED-VAR"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol SMART_CSOME = makeSymbol("SMART-CSOME");

    static private final SubLList $list37 = list(makeSymbol("GET-SBHL-HL-TIME-PREDICATES"));

    /**
     *
     *
     * @return booleanp; @xref *sbhl-temporality-active?*. Whether to add
    and remove temporal relation literals.
     */
    @LispMethod(comment = "@return booleanp; @xref *sbhl-temporality-active?*. Whether to add\r\nand remove temporal relation literals.")
    public static final SubLObject sbhl_temporality_activeP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL != $sbhl_temporality_activeP$.getDynamicValue(thread)) && (NIL != kb_control_vars.time_kb_loaded_p()));
        }
    }

    /**
     *
     *
     * @return booleanp; @xref *sbhl-temporality-active?*. Whether to add
    and remove temporal relation literals.
     */
    @LispMethod(comment = "@return booleanp; @xref *sbhl-temporality-active?*. Whether to add\r\nand remove temporal relation literals.")
    public static SubLObject sbhl_temporality_activeP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != $sbhl_temporality_activeP$.getDynamicValue(thread)) && (NIL != kb_control_vars.time_kb_loaded_p()));
    }

    /**
     *
     *
     * @unknown *sbhl-temporal-link-disjunction-consequent-table*. If the search considers disjunctions (@see *sbhl-temporality-consider-link-disjunctions?*), disjunction consequents in MT / *mt* are added before the BODY and removed when the BODY is done executing.
     */
    @LispMethod(comment = "@unknown *sbhl-temporal-link-disjunction-consequent-table*. If the search considers disjunctions (@see *sbhl-temporality-consider-link-disjunctions?*), disjunction consequents in MT / *mt* are added before the BODY and removed when the BODY is done executing.")
    public static final SubLObject possibly_considering_link_disjunctions_in_mt_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject mt = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt4);
            mt = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, $list_alt6, list(PWHEN, listS(CAND, list(NULL, mt), $list_alt10), listS(CSETQ, mt, $list_alt12)), list(PWHEN, $sbhl_temporality_consider_link_disjunctionsP$, list(ADD_TEMPORAL_LINK_DISJUNCTION_CONSEQUENTS, mt)), append(body, list(list(PWHEN, $sbhl_temporality_consider_link_disjunctionsP$, list(REMOVE_TEMPORAL_LINK_DISJUNCTION_CONSEQUENTS, mt)))));
            }
        }
    }

    /**
     *
     *
     * @unknown *sbhl-temporal-link-disjunction-consequent-table*. If the search considers disjunctions (@see *sbhl-temporality-consider-link-disjunctions?*), disjunction consequents in MT / *mt* are added before the BODY and removed when the BODY is done executing.
     */
    @LispMethod(comment = "@unknown *sbhl-temporal-link-disjunction-consequent-table*. If the search considers disjunctions (@see *sbhl-temporality-consider-link-disjunctions?*), disjunction consequents in MT / *mt* are added before the BODY and removed when the BODY is done executing.")
    public static SubLObject possibly_considering_link_disjunctions_in_mt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mt = NIL;
        destructuring_bind_must_consp(current, datum, $list4);
        mt = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, $list6, list(PWHEN, listS(CAND, list(NULL, mt), $list10), listS(CSETQ, mt, $list12)), list(PWHEN, $sbhl_temporality_consider_link_disjunctionsP$, list(ADD_TEMPORAL_LINK_DISJUNCTION_CONSEQUENTS, mt)), append(body, list(list(PWHEN, $sbhl_temporality_consider_link_disjunctionsP$, list(REMOVE_TEMPORAL_LINK_DISJUNCTION_CONSEQUENTS, mt)))));
    }

    public static final SubLObject without_collecting_dates_in_sbhl_search_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt23, append(body, NIL));
        }
    }

    public static SubLObject without_collecting_dates_in_sbhl_search(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list23, append(body, NIL));
    }

    public static final SubLObject in_sbhl_search_only_collecting_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject polarity = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt24);
            polarity = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(PROGN, listS(CHECK_TYPE, polarity, $list_alt27), listS(CLET, list(list($sbhl_temporality_all_accesses_polarity_filter$, polarity)), append(body, NIL)));
            }
        }
    }

    public static SubLObject in_sbhl_search_only_collecting(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject polarity = NIL;
        destructuring_bind_must_consp(current, datum, $list24);
        polarity = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PROGN, listS(CHECK_TYPE, polarity, $list27), listS(CLET, list(list($sbhl_temporality_all_accesses_polarity_filter$, polarity)), append(body, NIL)));
    }

    public static final SubLObject in_sbhl_search_collecting_all_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt29, append(body, NIL));
        }
    }

    public static SubLObject in_sbhl_search_collecting_all(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list29, append(body, NIL));
    }

    public static final SubLObject sbhl_temporality_consequent_links_search_passed_through_link_p_alt(SubLObject link) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return subl_promotions.memberP(link, $sbhl_temporality_consequent_links_search_passed_through$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject sbhl_temporality_consequent_links_search_passed_through_link_p(final SubLObject link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(link, $sbhl_temporality_consequent_links_search_passed_through$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject with_sbhl_temporality_succession_depth_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject integer = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt30);
            integer = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(PROGN, listS(CHECK_TYPE, integer, $list_alt31), listS(CLET, list(list($sbhl_temporality_succession_depth$, integer)), append(body, NIL)));
            }
        }
    }

    public static SubLObject with_sbhl_temporality_succession_depth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject integer = NIL;
        destructuring_bind_must_consp(current, datum, $list30);
        integer = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PROGN, listS(CHECK_TYPE, integer, $list31), listS(CLET, list(list($sbhl_temporality_succession_depth$, integer)), append(body, NIL)));
    }

    /**
     * used when marking it not being tested.
     */
    @LispMethod(comment = "used when marking it not being tested.")
    public static final SubLObject sbhl_succession_depth_non_negative_p_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean(!$sbhl_temporality_succession_depth$.getDynamicValue(thread).isNegative());
        }
    }

    /**
     * used when marking it not being tested.
     */
    @LispMethod(comment = "used when marking it not being tested.")
    public static SubLObject sbhl_succession_depth_non_negative_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(!$sbhl_temporality_succession_depth$.getDynamicValue(thread).isNegative());
    }

    public static final SubLObject sbhl_temporality_date_succession_alt() {
        return $sbhl_temporality_date_succession$.getGlobalValue();
    }

    public static SubLObject sbhl_temporality_date_succession() {
        return $sbhl_temporality_date_succession$.getGlobalValue();
    }

    public static final SubLObject with_new_sbhl_temporality_passed_through_date_vars_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt33, append(body, NIL));
        }
    }

    public static SubLObject with_new_sbhl_temporality_passed_through_date_vars(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list33, append(body, NIL));
    }

    /**
     *
     *
     * @return booleanp; whether PREDICATE is a member of @see *sbhl-hl-time-predicates*
     */
    @LispMethod(comment = "@return booleanp; whether PREDICATE is a member of @see *sbhl-hl-time-predicates*")
    public static final SubLObject sbhl_hl_time_predicate_p_alt(SubLObject predicate) {
        return list_utilities.member_eqP(predicate, $sbhl_hl_time_predicates$.getGlobalValue());
    }

    /**
     *
     *
     * @return booleanp; whether PREDICATE is a member of @see *sbhl-hl-time-predicates*
     */
    @LispMethod(comment = "@return booleanp; whether PREDICATE is a member of @see *sbhl-hl-time-predicates*")
    public static SubLObject sbhl_hl_time_predicate_p(final SubLObject predicate) {
        return subl_promotions.memberP(predicate, $sbhl_hl_time_predicates$.getGlobalValue(), symbol_function(EQL), UNPROVIDED);
    }

    /**
     *
     *
     * @return listp; the HL predicates used for temporal links.
     */
    @LispMethod(comment = "@return listp; the HL predicates used for temporal links.")
    public static final SubLObject get_sbhl_hl_time_predicates_alt() {
        return $sbhl_hl_time_predicates$.getGlobalValue();
    }

    /**
     *
     *
     * @return listp; the HL predicates used for temporal links.
     */
    @LispMethod(comment = "@return listp; the HL predicates used for temporal links.")
    public static SubLObject get_sbhl_hl_time_predicates() {
        return $sbhl_hl_time_predicates$.getGlobalValue();
    }

    /**
     *
     *
     * @unknown PRED-VAR, to each of the @see *sbhl-hl-time-predicates*. iterates over all of them or until DONE-VAR is non-nil.
     */
    @LispMethod(comment = "@unknown PRED-VAR, to each of the @see *sbhl-hl-time-predicates*. iterates over all of them or until DONE-VAR is non-nil.")
    public static final SubLObject do_sbhl_hl_time_predicates_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt35);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject pred_var = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt35);
                    pred_var = current.first();
                    current = current.rest();
                    {
                        SubLObject done_var = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt35);
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(SMART_CSOME, list(pred_var, $list_alt37, done_var), append(body, NIL));
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt35);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @unknown PRED-VAR, to each of the @see *sbhl-hl-time-predicates*. iterates over all of them or until DONE-VAR is non-nil.
     */
    @LispMethod(comment = "@unknown PRED-VAR, to each of the @see *sbhl-hl-time-predicates*. iterates over all of them or until DONE-VAR is non-nil.")
    public static SubLObject do_sbhl_hl_time_predicates(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list35);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject pred_var = NIL;
        destructuring_bind_must_consp(current, datum, $list35);
        pred_var = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list35);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(SMART_CSOME, list(pred_var, $list37, done_var), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list35);
        return NIL;
    }

    public static SubLObject declare_sbhl_time_vars_file() {
        declareFunction("sbhl_temporality_activeP", "SBHL-TEMPORALITY-ACTIVE?", 0, 0, false);
        declareMacro("possibly_considering_link_disjunctions_in_mt", "POSSIBLY-CONSIDERING-LINK-DISJUNCTIONS-IN-MT");
        declareMacro("without_collecting_dates_in_sbhl_search", "WITHOUT-COLLECTING-DATES-IN-SBHL-SEARCH");
        declareMacro("in_sbhl_search_only_collecting", "IN-SBHL-SEARCH-ONLY-COLLECTING");
        declareMacro("in_sbhl_search_collecting_all", "IN-SBHL-SEARCH-COLLECTING-ALL");
        declareFunction("sbhl_temporality_consequent_links_search_passed_through_link_p", "SBHL-TEMPORALITY-CONSEQUENT-LINKS-SEARCH-PASSED-THROUGH-LINK-P", 1, 0, false);
        declareMacro("with_sbhl_temporality_succession_depth", "WITH-SBHL-TEMPORALITY-SUCCESSION-DEPTH");
        declareFunction("sbhl_succession_depth_non_negative_p", "SBHL-SUCCESSION-DEPTH-NON-NEGATIVE-P", 0, 0, false);
        declareFunction("sbhl_temporality_date_succession", "SBHL-TEMPORALITY-DATE-SUCCESSION", 0, 0, false);
        declareMacro("with_new_sbhl_temporality_passed_through_date_vars", "WITH-NEW-SBHL-TEMPORALITY-PASSED-THROUGH-DATE-VARS");
        declareFunction("sbhl_hl_time_predicate_p", "SBHL-HL-TIME-PREDICATE-P", 1, 0, false);
        declareFunction("get_sbhl_hl_time_predicates", "GET-SBHL-HL-TIME-PREDICATES", 0, 0, false);
        declareMacro("do_sbhl_hl_time_predicates", "DO-SBHL-HL-TIME-PREDICATES");
        return NIL;
    }

    public static final SubLObject init_sbhl_time_vars_file_alt() {
        defparameter("*SBHL-TEMPORALITY-ACTIVE?*", T);
        defparameter("*SBHL-TEMPORALITY-CONSIDER-LINK-DISJUNCTIONS?*", NIL);
        defparameter("*SBHL-TEMPORALITY-VERBOSE-JUSTS?*", NIL);
        defparameter("*SBHL-TEMPORALITY-INCLUDE-ONLY-LINKS-IN-VERBOSE-JUSTS?*", NIL);
        deflexical("*SBHL-TEMPORAL-LINK-SUPPORT-TABLE*", NIL != boundp($sbhl_temporal_link_support_table$) ? ((SubLObject) ($sbhl_temporal_link_support_table$.getGlobalValue())) : make_hash_table($int$40000, symbol_function(EQUAL), UNPROVIDED));
        deflexical("*SBHL-TEMPORAL-LINK-DISJUNCTION-SUPPORT-TABLE*", NIL != boundp($sbhl_temporal_link_disjunction_support_table$) ? ((SubLObject) ($sbhl_temporal_link_disjunction_support_table$.getGlobalValue())) : make_hash_table($int$4000, symbol_function(EQUAL), UNPROVIDED));
        deflexical("*SBHL-TEMPORAL-LINK-DISJUNCTION-TERM-TABLE*", NIL != boundp($sbhl_temporal_link_disjunction_term_table$) ? ((SubLObject) ($sbhl_temporal_link_disjunction_term_table$.getGlobalValue())) : make_hash_table($int$4000, UNPROVIDED, UNPROVIDED));
        deflexical("*SBHL-EXTENDED-UNIVERSAL-DATE-LIST*", NIL != boundp($sbhl_extended_universal_date_list$) ? ((SubLObject) ($sbhl_extended_universal_date_list$.getGlobalValue())) : NIL);
        deflexical("*SBHL-TIME-PREDICATES*", NIL != boundp($sbhl_time_predicates$) ? ((SubLObject) ($sbhl_time_predicates$.getGlobalValue())) : NIL);
        deflexical("*SBHL-TIME-MODULES*", NIL != boundp($sbhl_time_modules$) ? ((SubLObject) ($sbhl_time_modules$.getGlobalValue())) : dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        defparameter("*SBHL-TEMPORAL-POINTS-BEING-REMOVED*", NIL);
        defparameter("*SBHL-TEMPORAL-LINK-DISJUNCTION-CONSEQUENT-TABLE*", NIL);
        defparameter("*SBHL-TEMPORALITY-DONT-COLLECT-DATES-WHEN-ALL-ACCESSING?*", NIL);
        defparameter("*SBHL-TEMPORALITY-ALL-ACCESSES-POLARITY-FILTER*", NIL);
        defparameter("*SBHL-TEMPORALITY-CONSEQUENT-LINKS-SEARCH-PASSED-THROUGH*", NIL);
        defparameter("*SBHL-TEMPORALITY-SUCCESSION-DEPTH*", NIL);
        defparameter("*SBHL-TEMPORALITY-SUCCESSION-DEPTH-THRESHOLD*", TEN_INTEGER);
        deflexical("*SBHL-TEMPORALITY-DATE-SUCCESSION*", TEN_INTEGER);
        defparameter("*SBHL-TEMPORALITY-SEARCH-PASSED-THROUGH-DATE?*", NIL);
        defparameter("*SBHL-TEMPORALITY-JUSTIFICATION-GATHERING-PASSED-THROUGH-DATE?*", NIL);
        deflexical("*SBHL-HL-TIME-PREDICATES*", $list_alt34);
        return NIL;
    }

    public static SubLObject init_sbhl_time_vars_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*SBHL-TEMPORALITY-ACTIVE?*", T);
            defparameter("*SBHL-TEMPORALITY-CONSIDER-LINK-DISJUNCTIONS?*", NIL);
            defparameter("*SBHL-TEMPORALITY-VERBOSE-JUSTS?*", NIL);
            defparameter("*SBHL-TEMPORALITY-INCLUDE-ONLY-LINKS-IN-VERBOSE-JUSTS?*", NIL);
            deflexical("*SBHL-TEMPORAL-LINK-SUPPORT-TABLE*", SubLTrampolineFile.maybeDefault($sbhl_temporal_link_support_table$, $sbhl_temporal_link_support_table$, () -> make_hash_table($int$40000, symbol_function(EQUAL), UNPROVIDED)));
            deflexical("*SBHL-TEMPORAL-LINK-DISJUNCTION-SUPPORT-TABLE*", SubLTrampolineFile.maybeDefault($sbhl_temporal_link_disjunction_support_table$, $sbhl_temporal_link_disjunction_support_table$, () -> make_hash_table($int$4000, symbol_function(EQUAL), UNPROVIDED)));
            deflexical("*SBHL-TEMPORAL-LINK-DISJUNCTION-TERM-TABLE*", SubLTrampolineFile.maybeDefault($sbhl_temporal_link_disjunction_term_table$, $sbhl_temporal_link_disjunction_term_table$, () -> make_hash_table($int$4000, UNPROVIDED, UNPROVIDED)));
            deflexical("*SBHL-EXTENDED-UNIVERSAL-DATE-LIST*", SubLTrampolineFile.maybeDefault($sbhl_extended_universal_date_list$, $sbhl_extended_universal_date_list$, NIL));
            deflexical("*SBHL-TIME-PREDICATES*", SubLTrampolineFile.maybeDefault($sbhl_time_predicates$, $sbhl_time_predicates$, NIL));
            deflexical("*SBHL-TIME-MODULES*", SubLTrampolineFile.maybeDefault($sbhl_time_modules$, $sbhl_time_modules$, () -> dictionary.new_dictionary(UNPROVIDED, UNPROVIDED)));
            defparameter("*SBHL-TEMPORAL-POINTS-BEING-REMOVED*", NIL);
            defparameter("*SBHL-TEMPORAL-LINK-DISJUNCTION-CONSEQUENT-TABLE*", NIL);
            defparameter("*SBHL-TEMPORALITY-DONT-COLLECT-DATES-WHEN-ALL-ACCESSING?*", NIL);
            defparameter("*SBHL-TEMPORALITY-ALL-ACCESSES-POLARITY-FILTER*", NIL);
            defparameter("*SBHL-TEMPORALITY-CONSEQUENT-LINKS-SEARCH-PASSED-THROUGH*", NIL);
            defparameter("*SBHL-TEMPORALITY-SUCCESSION-DEPTH*", NIL);
            defparameter("*SBHL-TEMPORALITY-SUCCESSION-DEPTH-THRESHOLD*", TEN_INTEGER);
            deflexical("*SBHL-TEMPORALITY-DATE-SUCCESSION*", TEN_INTEGER);
            defparameter("*SBHL-TEMPORALITY-SEARCH-PASSED-THROUGH-DATE?*", NIL);
            defparameter("*SBHL-TEMPORALITY-JUSTIFICATION-GATHERING-PASSED-THROUGH-DATE?*", NIL);
            deflexical("*SBHL-HL-TIME-PREDICATES*", $list34);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*SBHL-TEMPORAL-LINK-SUPPORT-TABLE*", NIL != boundp($sbhl_temporal_link_support_table$) ? ((SubLObject) ($sbhl_temporal_link_support_table$.getGlobalValue())) : make_hash_table($int$40000, symbol_function(EQUAL), UNPROVIDED));
            deflexical("*SBHL-TEMPORAL-LINK-DISJUNCTION-SUPPORT-TABLE*", NIL != boundp($sbhl_temporal_link_disjunction_support_table$) ? ((SubLObject) ($sbhl_temporal_link_disjunction_support_table$.getGlobalValue())) : make_hash_table($int$4000, symbol_function(EQUAL), UNPROVIDED));
            deflexical("*SBHL-TEMPORAL-LINK-DISJUNCTION-TERM-TABLE*", NIL != boundp($sbhl_temporal_link_disjunction_term_table$) ? ((SubLObject) ($sbhl_temporal_link_disjunction_term_table$.getGlobalValue())) : make_hash_table($int$4000, UNPROVIDED, UNPROVIDED));
            deflexical("*SBHL-EXTENDED-UNIVERSAL-DATE-LIST*", NIL != boundp($sbhl_extended_universal_date_list$) ? ((SubLObject) ($sbhl_extended_universal_date_list$.getGlobalValue())) : NIL);
            deflexical("*SBHL-TIME-PREDICATES*", NIL != boundp($sbhl_time_predicates$) ? ((SubLObject) ($sbhl_time_predicates$.getGlobalValue())) : NIL);
            deflexical("*SBHL-TIME-MODULES*", NIL != boundp($sbhl_time_modules$) ? ((SubLObject) ($sbhl_time_modules$.getGlobalValue())) : dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject init_sbhl_time_vars_file_Previous() {
        defparameter("*SBHL-TEMPORALITY-ACTIVE?*", T);
        defparameter("*SBHL-TEMPORALITY-CONSIDER-LINK-DISJUNCTIONS?*", NIL);
        defparameter("*SBHL-TEMPORALITY-VERBOSE-JUSTS?*", NIL);
        defparameter("*SBHL-TEMPORALITY-INCLUDE-ONLY-LINKS-IN-VERBOSE-JUSTS?*", NIL);
        deflexical("*SBHL-TEMPORAL-LINK-SUPPORT-TABLE*", SubLTrampolineFile.maybeDefault($sbhl_temporal_link_support_table$, $sbhl_temporal_link_support_table$, () -> make_hash_table($int$40000, symbol_function(EQUAL), UNPROVIDED)));
        deflexical("*SBHL-TEMPORAL-LINK-DISJUNCTION-SUPPORT-TABLE*", SubLTrampolineFile.maybeDefault($sbhl_temporal_link_disjunction_support_table$, $sbhl_temporal_link_disjunction_support_table$, () -> make_hash_table($int$4000, symbol_function(EQUAL), UNPROVIDED)));
        deflexical("*SBHL-TEMPORAL-LINK-DISJUNCTION-TERM-TABLE*", SubLTrampolineFile.maybeDefault($sbhl_temporal_link_disjunction_term_table$, $sbhl_temporal_link_disjunction_term_table$, () -> make_hash_table($int$4000, UNPROVIDED, UNPROVIDED)));
        deflexical("*SBHL-EXTENDED-UNIVERSAL-DATE-LIST*", SubLTrampolineFile.maybeDefault($sbhl_extended_universal_date_list$, $sbhl_extended_universal_date_list$, NIL));
        deflexical("*SBHL-TIME-PREDICATES*", SubLTrampolineFile.maybeDefault($sbhl_time_predicates$, $sbhl_time_predicates$, NIL));
        deflexical("*SBHL-TIME-MODULES*", SubLTrampolineFile.maybeDefault($sbhl_time_modules$, $sbhl_time_modules$, () -> dictionary.new_dictionary(UNPROVIDED, UNPROVIDED)));
        defparameter("*SBHL-TEMPORAL-POINTS-BEING-REMOVED*", NIL);
        defparameter("*SBHL-TEMPORAL-LINK-DISJUNCTION-CONSEQUENT-TABLE*", NIL);
        defparameter("*SBHL-TEMPORALITY-DONT-COLLECT-DATES-WHEN-ALL-ACCESSING?*", NIL);
        defparameter("*SBHL-TEMPORALITY-ALL-ACCESSES-POLARITY-FILTER*", NIL);
        defparameter("*SBHL-TEMPORALITY-CONSEQUENT-LINKS-SEARCH-PASSED-THROUGH*", NIL);
        defparameter("*SBHL-TEMPORALITY-SUCCESSION-DEPTH*", NIL);
        defparameter("*SBHL-TEMPORALITY-SUCCESSION-DEPTH-THRESHOLD*", TEN_INTEGER);
        deflexical("*SBHL-TEMPORALITY-DATE-SUCCESSION*", TEN_INTEGER);
        defparameter("*SBHL-TEMPORALITY-SEARCH-PASSED-THROUGH-DATE?*", NIL);
        defparameter("*SBHL-TEMPORALITY-JUSTIFICATION-GATHERING-PASSED-THROUGH-DATE?*", NIL);
        deflexical("*SBHL-HL-TIME-PREDICATES*", $list34);
        return NIL;
    }

    static private final SubLString $str_alt1$Consider_disjunctive_temporal_rel = makeString("Consider disjunctive temporal relation literals");

    static private final SubLString $str_alt2$This_controls_whether_the_HL_modu = makeString("This controls whether the HL module that handles temporal relation\n   queries will consider temporal relation literal assertions the\n   information content of which is disjunctive.  Typically, such literals\n   are negated ground atomic formulas.  (Considering them adds some expense.)");

    static private final SubLList $list_alt3 = list(list(makeKeyword("VALUE"), NIL, makeString("No")), list(makeKeyword("VALUE"), T, makeString("Yes")));

    static private final SubLList $list_alt4 = list(makeSymbol("MT"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt6 = list(makeSymbol("*SBHL-TEMPORAL-LINK-DISJUNCTION-CONSEQUENT-TABLE*"));

    static private final SubLList $list_alt10 = list(list(makeSymbol("CNOT"), list(makeSymbol("COR"), list(makeSymbol("ALL-MTS-ARE-RELEVANT?")), list(makeSymbol("ANY-MT-IS-RELEVANT?")))));

    static private final SubLList $list_alt12 = list(makeSymbol("*MT*"));

    public static SubLObject setup_sbhl_time_vars_file() {
        declare_control_parameter_internal($sbhl_temporality_consider_link_disjunctionsP$, $str1$Consider_disjunctive_temporal_rel, $str2$This_controls_whether_the_HL_modu, $list3);
        declare_defglobal($sbhl_temporal_link_support_table$);
        declare_defglobal($sbhl_temporal_link_disjunction_support_table$);
        declare_defglobal($sbhl_temporal_link_disjunction_term_table$);
        declare_defglobal($sbhl_extended_universal_date_list$);
        declare_defglobal($sbhl_time_predicates$);
        declare_defglobal($sbhl_time_modules$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sbhl_time_vars_file();
    }

    @Override
    public void initializeVariables() {
        init_sbhl_time_vars_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sbhl_time_vars_file();
    }

    static {
    }

    static private final SubLList $list_alt23 = list(list(makeSymbol("*SBHL-TEMPORALITY-DONT-COLLECT-DATES-WHEN-ALL-ACCESSING?*"), T));

    static private final SubLList $list_alt24 = list(makeSymbol("POLARITY"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt27 = list(makeSymbol("KEYWORDP"));

    static private final SubLList $list_alt29 = list(list(makeSymbol("*SBHL-TEMPORALITY-ALL-ACCESSES-POLARITY-FILTER*"), NIL));

    static private final SubLList $list_alt30 = list(makeSymbol("INTEGER"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt31 = list(makeSymbol("INTEGERP"));

    static private final SubLList $list_alt33 = list(list(makeSymbol("*SBHL-TEMPORALITY-JUSTIFICATION-GATHERING-PASSED-THROUGH-DATE?*"), NIL), list(makeSymbol("*SBHL-TEMPORALITY-SEARCH-PASSED-THROUGH-DATE?*"), NIL));

    static private final SubLList $list_alt34 = list(reader_make_constant_shell("weak-HL-TimePrecedence"), reader_make_constant_shell("strict-HL-TimePrecedence"), reader_make_constant_shell("successorStrict-HL-TimePrecedence"), reader_make_constant_shell("weakSuccessor-HL-TimePrecedence"));

    static private final SubLList $list_alt35 = list(list(makeSymbol("PRED-VAR"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt37 = list(makeSymbol("GET-SBHL-HL-TIME-PREDICATES"));
}

/**
 * Total time: 99 ms
 */
