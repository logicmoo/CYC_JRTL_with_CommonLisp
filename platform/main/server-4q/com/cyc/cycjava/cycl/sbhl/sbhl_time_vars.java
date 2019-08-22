package com.cyc.cycjava.cycl.sbhl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.declare_control_parameter_internal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.kb_control_vars;
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


public final class sbhl_time_vars extends SubLTranslatedFile {
    public static final SubLFile me = new sbhl_time_vars();

    public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_time_vars";

    public static final String myFingerPrint = "f5f18d0472059a35b4c8a133e1b4b25aeb8094293b1ac5c68a1daa7936e1595d";

    // defparameter
    // Definitions
    /**
     * Gates whether the hl data structure will be updated when temporal relation
     * literals are asserted and unasserted, and whether removal modules will be
     * triggered in response to temporal relation queries.
     */
    public static final SubLSymbol $sbhl_temporality_activeP$ = makeSymbol("*SBHL-TEMPORALITY-ACTIVE?*");

    // defparameter
    /**
     * Do we determine the consequences of temporal link disjunctions before
     * answering a query?
     */
    public static final SubLSymbol $sbhl_temporality_consider_link_disjunctionsP$ = makeSymbol("*SBHL-TEMPORALITY-CONSIDER-LINK-DISJUNCTIONS?*");

    // defparameter
    /**
     * Include links of the form (<link-type keyword> <node> <node> <mt>) in
     * temporal relation justifications?
     */
    public static final SubLSymbol $sbhl_temporality_verbose_justsP$ = makeSymbol("*SBHL-TEMPORALITY-VERBOSE-JUSTS?*");

    // defparameter
    /**
     * Include only links of the form (<link-type keyword> <node> <node> <mt>) in
     * temporal relation justifications - that is, exclude assertions - when the
     * value of *sbhl-temporality-verbose-justs?* is t?
     */
    public static final SubLSymbol $sbhl_temporality_include_only_links_in_verbose_justsP$ = makeSymbol("*SBHL-TEMPORALITY-INCLUDE-ONLY-LINKS-IN-VERBOSE-JUSTS?*");













    // defparameter
    public static final SubLSymbol $sbhl_temporal_points_being_removed$ = makeSymbol("*SBHL-TEMPORAL-POINTS-BEING-REMOVED*");

    // defparameter
    /**
     * a dynamically-created hashtable that records consequents of temporal link
     * disjunctions
     */
    public static final SubLSymbol $sbhl_temporal_link_disjunction_consequent_table$ = makeSymbol("*SBHL-TEMPORAL-LINK-DISJUNCTION-CONSEQUENT-TABLE*");

    // defparameter
    public static final SubLSymbol $sbhl_temporality_dont_collect_dates_when_all_accessingP$ = makeSymbol("*SBHL-TEMPORALITY-DONT-COLLECT-DATES-WHEN-ALL-ACCESSING?*");



    // defparameter
    public static final SubLSymbol $sbhl_temporality_consequent_links_search_passed_through$ = makeSymbol("*SBHL-TEMPORALITY-CONSEQUENT-LINKS-SEARCH-PASSED-THROUGH*");



    // defparameter
    public static final SubLSymbol $sbhl_temporality_succession_depth_threshold$ = makeSymbol("*SBHL-TEMPORALITY-SUCCESSION-DEPTH-THRESHOLD*");

    // deflexical
    private static final SubLSymbol $sbhl_temporality_date_succession$ = makeSymbol("*SBHL-TEMPORALITY-DATE-SUCCESSION*");

    // defparameter
    /**
     * dynamically bound to T on the winding of a justification search if the search
     * passed through a date node.
     */
    public static final SubLSymbol $sbhl_temporality_search_passed_through_dateP$ = makeSymbol("*SBHL-TEMPORALITY-SEARCH-PASSED-THROUGH-DATE?*");

    // defparameter
    /**
     * used during the unwind of a justification search, so that no justification is
     * made between the first date encountered during the search (as noted by @see
     * sbhl-temporality-search-passed-through-date?*), and the last date
     * encountered.
     */
    public static final SubLSymbol $sbhl_temporality_justification_gathering_passed_through_dateP$ = makeSymbol("*SBHL-TEMPORALITY-JUSTIFICATION-GATHERING-PASSED-THROUGH-DATE?*");

    // deflexical
    // The HL predicates used for temporal links
    private static final SubLSymbol $sbhl_hl_time_predicates$ = makeSymbol("*SBHL-HL-TIME-PREDICATES*");

    // Internal Constants
    public static final SubLSymbol $sym0$_SBHL_TEMPORALITY_CONSIDER_LINK_DISJUNCTIONS__ = makeSymbol("*SBHL-TEMPORALITY-CONSIDER-LINK-DISJUNCTIONS?*");

    public static final SubLString $str1$Consider_disjunctive_temporal_rel = makeString("Consider disjunctive temporal relation literals");

    public static final SubLString $str2$This_controls_whether_the_HL_modu = makeString("This controls whether the HL module that handles temporal relation\n   queries will consider temporal relation literal assertions the\n   information content of which is disjunctive.  Typically, such literals\n   are negated ground atomic formulas.  (Considering them adds some expense.)");

    public static final SubLList $list3 = list(list(makeKeyword("VALUE"), NIL, makeString("No")), list(makeKeyword("VALUE"), T, makeString("Yes")));

    public static final SubLList $list4 = list(makeSymbol("MT"), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLList $list6 = list(makeSymbol("*SBHL-TEMPORAL-LINK-DISJUNCTION-CONSEQUENT-TABLE*"));







    public static final SubLList $list10 = list(list(makeSymbol("CNOT"), list(makeSymbol("COR"), list(makeSymbol("ALL-MTS-ARE-RELEVANT?")), list(makeSymbol("ANY-MT-IS-RELEVANT?")))));



    public static final SubLList $list12 = list(makeSymbol("*MT*"));

    public static final SubLSymbol ADD_TEMPORAL_LINK_DISJUNCTION_CONSEQUENTS = makeSymbol("ADD-TEMPORAL-LINK-DISJUNCTION-CONSEQUENTS");

    public static final SubLSymbol REMOVE_TEMPORAL_LINK_DISJUNCTION_CONSEQUENTS = makeSymbol("REMOVE-TEMPORAL-LINK-DISJUNCTION-CONSEQUENTS");

    public static final SubLSymbol $sbhl_temporal_link_support_table$ = makeSymbol("*SBHL-TEMPORAL-LINK-SUPPORT-TABLE*");

    private static final SubLInteger $int$40000 = makeInteger(40000);

    public static final SubLSymbol $sbhl_temporal_link_disjunction_support_table$ = makeSymbol("*SBHL-TEMPORAL-LINK-DISJUNCTION-SUPPORT-TABLE*");

    private static final SubLInteger $int$4000 = makeInteger(4000);

    public static final SubLSymbol $sbhl_temporal_link_disjunction_term_table$ = makeSymbol("*SBHL-TEMPORAL-LINK-DISJUNCTION-TERM-TABLE*");

    public static final SubLSymbol $sbhl_extended_universal_date_list$ = makeSymbol("*SBHL-EXTENDED-UNIVERSAL-DATE-LIST*");

    public static final SubLSymbol $sbhl_time_predicates$ = makeSymbol("*SBHL-TIME-PREDICATES*");

    public static final SubLSymbol $sbhl_time_modules$ = makeSymbol("*SBHL-TIME-MODULES*");

    public static final SubLList $list23 = list(list(makeSymbol("*SBHL-TEMPORALITY-DONT-COLLECT-DATES-WHEN-ALL-ACCESSING?*"), T));

    public static final SubLList $list24 = list(makeSymbol("POLARITY"), makeSymbol("&BODY"), makeSymbol("BODY"));





    public static final SubLList $list27 = list(makeSymbol("KEYWORDP"));

    public static final SubLSymbol $sbhl_temporality_all_accesses_polarity_filter$ = makeSymbol("*SBHL-TEMPORALITY-ALL-ACCESSES-POLARITY-FILTER*");

    public static final SubLList $list29 = list(list(makeSymbol("*SBHL-TEMPORALITY-ALL-ACCESSES-POLARITY-FILTER*"), NIL));

    public static final SubLList $list30 = list(makeSymbol("INTEGER"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list31 = list(makeSymbol("INTEGERP"));

    public static final SubLSymbol $sbhl_temporality_succession_depth$ = makeSymbol("*SBHL-TEMPORALITY-SUCCESSION-DEPTH*");

    public static final SubLList $list33 = list(list(makeSymbol("*SBHL-TEMPORALITY-JUSTIFICATION-GATHERING-PASSED-THROUGH-DATE?*"), NIL), list(makeSymbol("*SBHL-TEMPORALITY-SEARCH-PASSED-THROUGH-DATE?*"), NIL));

    public static final SubLList $list34 = list(reader_make_constant_shell(makeString("weak-HL-TimePrecedence")), reader_make_constant_shell(makeString("strict-HL-TimePrecedence")), reader_make_constant_shell(makeString("successorStrict-HL-TimePrecedence")), reader_make_constant_shell(makeString("weakSuccessor-HL-TimePrecedence")));

    public static final SubLList $list35 = list(list(makeSymbol("PRED-VAR"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol SMART_CSOME = makeSymbol("SMART-CSOME");

    public static final SubLList $list37 = list(makeSymbol("GET-SBHL-HL-TIME-PREDICATES"));

    public static SubLObject sbhl_temporality_activeP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != $sbhl_temporality_activeP$.getDynamicValue(thread)) && (NIL != kb_control_vars.time_kb_loaded_p()));
    }

    public static SubLObject possibly_considering_link_disjunctions_in_mt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mt = NIL;
        destructuring_bind_must_consp(current, datum, $list4);
        mt = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, $list6, list(PWHEN, listS(CAND, list(NULL, mt), $list10), listS(CSETQ, mt, $list12)), list(PWHEN, $sym0$_SBHL_TEMPORALITY_CONSIDER_LINK_DISJUNCTIONS__, list(ADD_TEMPORAL_LINK_DISJUNCTION_CONSEQUENTS, mt)), append(body, list(list(PWHEN, $sym0$_SBHL_TEMPORALITY_CONSIDER_LINK_DISJUNCTIONS__, list(REMOVE_TEMPORAL_LINK_DISJUNCTION_CONSEQUENTS, mt)))));
    }

    public static SubLObject without_collecting_dates_in_sbhl_search(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list23, append(body, NIL));
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

    public static SubLObject in_sbhl_search_collecting_all(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list29, append(body, NIL));
    }

    public static SubLObject sbhl_temporality_consequent_links_search_passed_through_link_p(final SubLObject link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(link, $sbhl_temporality_consequent_links_search_passed_through$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
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

    public static SubLObject sbhl_succession_depth_non_negative_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(!$sbhl_temporality_succession_depth$.getDynamicValue(thread).isNegative());
    }

    public static SubLObject sbhl_temporality_date_succession() {
        return $sbhl_temporality_date_succession$.getGlobalValue();
    }

    public static SubLObject with_new_sbhl_temporality_passed_through_date_vars(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list33, append(body, NIL));
    }

    public static SubLObject sbhl_hl_time_predicate_p(final SubLObject predicate) {
        return subl_promotions.memberP(predicate, $sbhl_hl_time_predicates$.getGlobalValue(), symbol_function(EQL), UNPROVIDED);
    }

    public static SubLObject get_sbhl_hl_time_predicates() {
        return $sbhl_hl_time_predicates$.getGlobalValue();
    }

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
        declareFunction(me, "sbhl_temporality_activeP", "SBHL-TEMPORALITY-ACTIVE?", 0, 0, false);
        declareMacro(me, "possibly_considering_link_disjunctions_in_mt", "POSSIBLY-CONSIDERING-LINK-DISJUNCTIONS-IN-MT");
        declareMacro(me, "without_collecting_dates_in_sbhl_search", "WITHOUT-COLLECTING-DATES-IN-SBHL-SEARCH");
        declareMacro(me, "in_sbhl_search_only_collecting", "IN-SBHL-SEARCH-ONLY-COLLECTING");
        declareMacro(me, "in_sbhl_search_collecting_all", "IN-SBHL-SEARCH-COLLECTING-ALL");
        declareFunction(me, "sbhl_temporality_consequent_links_search_passed_through_link_p", "SBHL-TEMPORALITY-CONSEQUENT-LINKS-SEARCH-PASSED-THROUGH-LINK-P", 1, 0, false);
        declareMacro(me, "with_sbhl_temporality_succession_depth", "WITH-SBHL-TEMPORALITY-SUCCESSION-DEPTH");
        declareFunction(me, "sbhl_succession_depth_non_negative_p", "SBHL-SUCCESSION-DEPTH-NON-NEGATIVE-P", 0, 0, false);
        declareFunction(me, "sbhl_temporality_date_succession", "SBHL-TEMPORALITY-DATE-SUCCESSION", 0, 0, false);
        declareMacro(me, "with_new_sbhl_temporality_passed_through_date_vars", "WITH-NEW-SBHL-TEMPORALITY-PASSED-THROUGH-DATE-VARS");
        declareFunction(me, "sbhl_hl_time_predicate_p", "SBHL-HL-TIME-PREDICATE-P", 1, 0, false);
        declareFunction(me, "get_sbhl_hl_time_predicates", "GET-SBHL-HL-TIME-PREDICATES", 0, 0, false);
        declareMacro(me, "do_sbhl_hl_time_predicates", "DO-SBHL-HL-TIME-PREDICATES");
        return NIL;
    }

    public static SubLObject init_sbhl_time_vars_file() {
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

    public static SubLObject setup_sbhl_time_vars_file() {
        declare_control_parameter_internal($sym0$_SBHL_TEMPORALITY_CONSIDER_LINK_DISJUNCTIONS__, $str1$Consider_disjunctive_temporal_rel, $str2$This_controls_whether_the_HL_modu, $list3);
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

    
}

/**
 * Total time: 99 ms
 */
