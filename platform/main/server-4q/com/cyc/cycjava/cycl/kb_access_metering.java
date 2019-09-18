package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.make_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.round;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class kb_access_metering extends SubLTranslatedFile {
    public static final SubLFile me = new kb_access_metering();

    public static final String myName = "com.cyc.cycjava.cycl.kb_access_metering";

    public static final String myFingerPrint = "3a4ffddef5888aa8b183e3155ae0380412b3689fb1742bca3cc9967af58f7aa9";

    // defparameter
    public static final SubLSymbol $arete_log_kb_touchesP$ = makeSymbol("*ARETE-LOG-KB-TOUCHES?*");

    // defparameter
    public static final SubLSymbol $arete_log_last_kb_touchP$ = makeSymbol("*ARETE-LOG-LAST-KB-TOUCH?*");

    // defparameter
    public static final SubLSymbol $arete_log_kb_touch_countsP$ = makeSymbol("*ARETE-LOG-KB-TOUCH-COUNTS?*");

    // defparameter
    public static final SubLSymbol $arete_assertions_touched$ = makeSymbol("*ARETE-ASSERTIONS-TOUCHED*");

    // defparameter
    public static final SubLSymbol $arete_constants_touched$ = makeSymbol("*ARETE-CONSTANTS-TOUCHED*");

    // defparameter
    public static final SubLSymbol $arete_narts_touched$ = makeSymbol("*ARETE-NARTS-TOUCHED*");









    // defparameter
    public static final SubLSymbol $arete_assertions_touched_count$ = makeSymbol("*ARETE-ASSERTIONS-TOUCHED-COUNT*");

    // defparameter
    public static final SubLSymbol $arete_terms_touched_count$ = makeSymbol("*ARETE-TERMS-TOUCHED-COUNT*");

    // deflexical
    // Definitions
    // A control variable that gates whether KB access metering is enabled.
    public static final SubLSymbol $kb_access_metering_enabledP$ = makeSymbol("*KB-ACCESS-METERING-ENABLED?*");





    public static final SubLSymbol $arete_last_assertion_touched$ = makeSymbol("*ARETE-LAST-ASSERTION-TOUCHED*");

    public static final SubLSymbol $arete_last_term_touched$ = makeSymbol("*ARETE-LAST-TERM-TOUCHED*");

    public static final SubLSymbol $arete_last_constant_touched$ = makeSymbol("*ARETE-LAST-CONSTANT-TOUCHED*");

    public static final SubLSymbol $arete_last_nart_touched$ = makeSymbol("*ARETE-LAST-NART-TOUCHED*");

    private static final SubLSymbol $sym4$_KB_ACCESS_METERING_ENABLED__ = makeSymbol("*KB-ACCESS-METERING-ENABLED?*");

    public static final SubLList $list5 = list(list(makeSymbol("RESULT-VAR"), makeSymbol("&KEY"), list(makeSymbol("DOMAINS"), list(makeSymbol("QUOTE"), list(makeSymbol("QUOTE"), list(makeKeyword("ASSERTION"))))), makeSymbol("OPTIONS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list6 = list(makeKeyword("DOMAINS"), makeKeyword("OPTIONS"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");



    private static final SubLList $list9 = list(makeSymbol("QUOTE"), list(makeKeyword("ASSERTION")));



    private static final SubLSymbol $sym11$DOMAINS_VAR = makeUninternedSymbol("DOMAINS-VAR");

    private static final SubLSymbol $sym12$OPTIONS_VAR = makeUninternedSymbol("OPTIONS-VAR");

    private static final SubLSymbol $sym13$TABLE_VAR = makeUninternedSymbol("TABLE-VAR");



    private static final SubLSymbol NEW_KB_ACCESS_METERING_TABLE = makeSymbol("NEW-KB-ACCESS-METERING-TABLE");

    public static final SubLSymbol $kb_access_metering_domains$ = makeSymbol("*KB-ACCESS-METERING-DOMAINS*");

    public static final SubLSymbol $kb_access_metering_table$ = makeSymbol("*KB-ACCESS-METERING-TABLE*");







    private static final SubLSymbol POSTPROCESS_KB_ACCESS_METERING_TABLE = makeSymbol("POSTPROCESS-KB-ACCESS-METERING-TABLE");

    private static final SubLList $list22 = list(makeKeyword("ASSERTION"));

    private static final SubLSymbol WITH_KB_ACCESS_METERING = makeSymbol("WITH-KB-ACCESS-METERING");







    private static final SubLList $list27 = list(makeSymbol("NODE"), makeSymbol("LINK-NODE"));



    private static final SubLList $list29 = list(makeSymbol("CAND"), makeSymbol("*KB-ACCESS-METERING-ENABLED?*"), list(makeSymbol("NOTE-KB-ACCESS-SBHL?")));

    private static final SubLSymbol NOTE_KB_ACCESS_SBHL_LINK = makeSymbol("NOTE-KB-ACCESS-SBHL-LINK");

    private static final SubLSymbol $sym31$NOTE_KB_ACCESS_SBHL_ = makeSymbol("NOTE-KB-ACCESS-SBHL?");

    private static final SubLSymbol POSSIBLY_NOTE_KB_ACCESS_SBHL_LINK = makeSymbol("POSSIBLY-NOTE-KB-ACCESS-SBHL-LINK");





    private static final SubLSymbol UNIVERSAL_TIME_FOR_START_OF_UNIVERSAL_DATE = makeSymbol("UNIVERSAL-TIME-FOR-START-OF-UNIVERSAL-DATE");

    private static final SubLSymbol $sym36$_ = makeSymbol("<");

    private static final SubLSymbol $sym37$__ = makeSymbol("<=");



    private static final SubLList $list39 = list(makeSymbol("ASSERTION"), makeSymbol("DATE"), makeSymbol("COUNT"));

    private static final SubLString $str40$______A = makeString("~%;; ~A");

    public static SubLObject with_kb_access_metering(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list5);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject result_var = NIL;
        destructuring_bind_must_consp(current, datum, $list5);
        result_var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list5);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list5);
            if (NIL == member(current_$1, $list6, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list5);
        }
        final SubLObject domains_tail = property_list_member($DOMAINS, current);
        final SubLObject domains = (NIL != domains_tail) ? cadr(domains_tail) : $list9;
        final SubLObject options_tail = property_list_member($OPTIONS, current);
        final SubLObject options = (NIL != options_tail) ? cadr(options_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject domains_var = $sym11$DOMAINS_VAR;
        final SubLObject options_var = $sym12$OPTIONS_VAR;
        final SubLObject table_var = $sym13$TABLE_VAR;
        return list(CLET, list(list(domains_var, domains), list(options_var, options), list(table_var, list(NEW_KB_ACCESS_METERING_TABLE, domains_var, options_var))), list(CLET, list(list($kb_access_metering_domains$, domains_var), list($kb_access_metering_table$, table_var)), list(CUNWIND_PROTECT, bq_cons(PROGN, append(body, NIL)), list(CSETQ, result_var, list(POSTPROCESS_KB_ACCESS_METERING_TABLE, table_var, domains_var, options_var)))));
    }

    public static SubLObject eval_with_kb_access_metering(final SubLObject form, SubLObject domains, SubLObject options) {
        if (domains == UNPROVIDED) {
            domains = $list22;
        }
        if (options == UNPROVIDED) {
            options = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject metering_result = NIL;
        SubLObject eval_result = NIL;
        final SubLObject domains_var = domains;
        final SubLObject options_var = options;
        final SubLObject table_var = new_kb_access_metering_table(domains_var, options_var);
        final SubLObject _prev_bind_0 = $kb_access_metering_domains$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $kb_access_metering_table$.currentBinding(thread);
        try {
            $kb_access_metering_domains$.bind(domains_var, thread);
            $kb_access_metering_table$.bind(table_var, thread);
            try {
                eval_result = arg2(thread.resetMultipleValues(), multiple_value_list(eval(form)));
            } finally {
                final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    metering_result = postprocess_kb_access_metering_table(table_var, domains_var, options_var);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                }
            }
        } finally {
            $kb_access_metering_table$.rebind(_prev_bind_2, thread);
            $kb_access_metering_domains$.rebind(_prev_bind_0, thread);
        }
        return values(metering_result, eval_result);
    }

    public static SubLObject new_kb_access_metering_table(final SubLObject domains, final SubLObject options) {
        return dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
    }

    public static SubLObject postprocess_kb_access_metering_table(final SubLObject table, final SubLObject domains, final SubLObject options) {
        return table;
    }

    public static SubLObject possibly_note_kb_access_constant(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != $kb_access_metering_enabledP$.getGlobalValue()) && (NIL != list_utilities.member_eqP($CONSTANT, $kb_access_metering_domains$.getDynamicValue(thread)))) {
            dictionary_utilities.dictionary_increment($kb_access_metering_table$.getDynamicValue(thread), constant, UNPROVIDED);
            return T;
        }
        return NIL;
    }

    public static SubLObject possibly_note_kb_access_nart(final SubLObject nart) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != $kb_access_metering_enabledP$.getGlobalValue()) && (NIL != list_utilities.member_eqP($NART, $kb_access_metering_domains$.getDynamicValue(thread)))) {
            dictionary_utilities.dictionary_increment($kb_access_metering_table$.getDynamicValue(thread), nart, UNPROVIDED);
            return T;
        }
        return NIL;
    }

    public static SubLObject possibly_note_kb_access_assertion(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != $kb_access_metering_enabledP$.getGlobalValue()) && (NIL != list_utilities.member_eqP($ASSERTION, $kb_access_metering_domains$.getDynamicValue(thread)))) {
            return note_kb_access_assertion(assertion);
        }
        return NIL;
    }

    public static SubLObject note_kb_access_assertion(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        dictionary_utilities.dictionary_increment($kb_access_metering_table$.getDynamicValue(thread), assertion, UNPROVIDED);
        return T;
    }

    public static SubLObject possibly_note_kb_access_sbhl_link(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject node = NIL;
        SubLObject link_node = NIL;
        destructuring_bind_must_consp(current, datum, $list27);
        node = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list27);
        link_node = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(PWHEN, $list29, list(NOTE_KB_ACCESS_SBHL_LINK, node, link_node));
        }
        cdestructuring_bind_error(datum, $list27);
        return NIL;
    }

    public static SubLObject note_kb_access_sbhlP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.member_eqP($SBHL, $kb_access_metering_domains$.getDynamicValue(thread));
    }

    public static SubLObject kb_access_metering_asserted_assertions(final SubLObject kbam_result) {
        return list_utilities.remove_if_not(symbol_function(ASSERTED_WHEN), dictionary.dictionary_keys(kbam_result), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject mean_asserted_assertion_dates(final SubLObject kbam_result) {
        final SubLObject assertions = kb_access_metering_asserted_assertions(kbam_result);
        final SubLObject dates = Mapping.mapcar(symbol_function(ASSERTED_WHEN), assertions);
        final SubLObject times = Mapping.mapcar(symbol_function(UNIVERSAL_TIME_FOR_START_OF_UNIVERSAL_DATE), dates);
        final SubLObject mean_time = round(number_utilities.mean(times), UNPROVIDED);
        final SubLObject mean_date = numeric_date_utilities.get_universal_date(mean_time, UNPROVIDED);
        return mean_date;
    }

    public static SubLObject median_asserted_assertion_dates(final SubLObject kbam_result) {
        final SubLObject assertions = kb_access_metering_asserted_assertions(kbam_result);
        final SubLObject dates = Mapping.mapcar(symbol_function(ASSERTED_WHEN), assertions);
        final SubLObject times = Mapping.mapcar(symbol_function(UNIVERSAL_TIME_FOR_START_OF_UNIVERSAL_DATE), dates);
        final SubLObject median_time = round(number_utilities.median(times, UNPROVIDED, UNPROVIDED), UNPROVIDED);
        final SubLObject median_date = numeric_date_utilities.get_universal_date(median_time, UNPROVIDED);
        return median_date;
    }

    public static SubLObject weighted_mean_asserted_assertion_dates(final SubLObject kbam_result) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject times = ZERO_INTEGER;
        SubLObject total = ZERO_INTEGER;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(kbam_result)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject assertion = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject count = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject date = assertions_high.asserted_when(assertion);
            if (NIL != date) {
                final SubLObject time = numeric_date_utilities.universal_time_for_start_of_universal_date(date, UNPROVIDED);
                total = add(total, count);
                times = add(times, multiply(count, time));
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        final SubLObject mean_time = integerDivide(times, total);
        final SubLObject mean_date = numeric_date_utilities.get_universal_date(mean_time, UNPROVIDED);
        return mean_date;
    }

    public static SubLObject weighted_median_asserted_assertion_dates(final SubLObject kbam_result) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject dates = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(kbam_result)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject assertion = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject count = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject date = assertions_high.asserted_when(assertion);
            if (NIL != date) {
                dates = nconc(make_list(count, date), dates);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        final SubLObject median_date = round(number_utilities.median(dates, UNPROVIDED, UNPROVIDED), UNPROVIDED);
        return median_date;
    }

    public static SubLObject percent_before_date(final SubLObject universal_date, final SubLObject kbam_result) {
        final SubLObject assertions = kb_access_metering_asserted_assertions(kbam_result);
        SubLObject dates = Mapping.mapcar(symbol_function(ASSERTED_WHEN), assertions);
        dates = Sort.sort(dates, symbol_function($sym36$_), UNPROVIDED);
        final SubLObject date_position = position(universal_date, dates, symbol_function($sym37$__), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject percent = number_utilities.percent(date_position, length(dates), THREE_INTEGER);
        return percent;
    }

    public static SubLObject weighted_percent_before_date(final SubLObject universal_date, final SubLObject kbam_result) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject dates = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(kbam_result)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject assertion = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject count = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject date = assertions_high.asserted_when(assertion);
            if (NIL != date) {
                dates = nconc(make_list(count, date), dates);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        dates = Sort.sort(dates, symbol_function($sym36$_), UNPROVIDED);
        final SubLObject date_position = position(universal_date, dates, symbol_function($sym37$__), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject percent = number_utilities.percent(date_position, length(dates), THREE_INTEGER);
        return percent;
    }

    public static SubLObject print_asserted_assertions_by_date(final SubLObject kbam_result, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tuples = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(kbam_result)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject assertion = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject count = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject date = assertions_high.asserted_when(assertion);
            if (NIL != date) {
                tuples = cons(list(assertion, date, count), tuples);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        tuples = Sort.sort(tuples, symbol_function($sym36$_), symbol_function(SECOND));
        SubLObject previous_date = ZERO_INTEGER;
        SubLObject cdolist_list_var = tuples;
        SubLObject tuple = NIL;
        tuple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = tuple;
            SubLObject assertion2 = NIL;
            SubLObject date2 = NIL;
            SubLObject count2 = NIL;
            destructuring_bind_must_consp(current, datum, $list39);
            assertion2 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list39);
            date2 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list39);
            count2 = current.first();
            current = current.rest();
            if (NIL == current) {
                if (date2.numG(previous_date)) {
                    format(stream, $str40$______A, numeric_date_utilities.datestring(date2));
                    previous_date = date2;
                }
                print(assertion2, stream);
            } else {
                cdestructuring_bind_error(datum, $list39);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject declare_kb_access_metering_file() {
        declareMacro(me, "with_kb_access_metering", "WITH-KB-ACCESS-METERING");
        declareFunction(me, "eval_with_kb_access_metering", "EVAL-WITH-KB-ACCESS-METERING", 1, 2, false);
        declareFunction(me, "new_kb_access_metering_table", "NEW-KB-ACCESS-METERING-TABLE", 2, 0, false);
        declareFunction(me, "postprocess_kb_access_metering_table", "POSTPROCESS-KB-ACCESS-METERING-TABLE", 3, 0, false);
        declareFunction(me, "possibly_note_kb_access_constant", "POSSIBLY-NOTE-KB-ACCESS-CONSTANT", 1, 0, false);
        declareFunction(me, "possibly_note_kb_access_nart", "POSSIBLY-NOTE-KB-ACCESS-NART", 1, 0, false);
        declareFunction(me, "possibly_note_kb_access_assertion", "POSSIBLY-NOTE-KB-ACCESS-ASSERTION", 1, 0, false);
        declareFunction(me, "note_kb_access_assertion", "NOTE-KB-ACCESS-ASSERTION", 1, 0, false);
        declareMacro(me, "possibly_note_kb_access_sbhl_link", "POSSIBLY-NOTE-KB-ACCESS-SBHL-LINK");
        declareFunction(me, "note_kb_access_sbhlP", "NOTE-KB-ACCESS-SBHL?", 0, 0, false);
        declareFunction(me, "kb_access_metering_asserted_assertions", "KB-ACCESS-METERING-ASSERTED-ASSERTIONS", 1, 0, false);
        declareFunction(me, "mean_asserted_assertion_dates", "MEAN-ASSERTED-ASSERTION-DATES", 1, 0, false);
        declareFunction(me, "median_asserted_assertion_dates", "MEDIAN-ASSERTED-ASSERTION-DATES", 1, 0, false);
        declareFunction(me, "weighted_mean_asserted_assertion_dates", "WEIGHTED-MEAN-ASSERTED-ASSERTION-DATES", 1, 0, false);
        declareFunction(me, "weighted_median_asserted_assertion_dates", "WEIGHTED-MEDIAN-ASSERTED-ASSERTION-DATES", 1, 0, false);
        declareFunction(me, "percent_before_date", "PERCENT-BEFORE-DATE", 2, 0, false);
        declareFunction(me, "weighted_percent_before_date", "WEIGHTED-PERCENT-BEFORE-DATE", 2, 0, false);
        declareFunction(me, "print_asserted_assertions_by_date", "PRINT-ASSERTED-ASSERTIONS-BY-DATE", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_kb_access_metering_file() {
        defparameter("*ARETE-LOG-KB-TOUCHES?*", NIL);
        defparameter("*ARETE-LOG-LAST-KB-TOUCH?*", NIL);
        defparameter("*ARETE-LOG-KB-TOUCH-COUNTS?*", NIL);
        defparameter("*ARETE-ASSERTIONS-TOUCHED*", NIL);
        defparameter("*ARETE-CONSTANTS-TOUCHED*", NIL);
        defparameter("*ARETE-NARTS-TOUCHED*", NIL);
        deflexical("*ARETE-LAST-ASSERTION-TOUCHED*", SubLSystemTrampolineFile.maybeDefault($arete_last_assertion_touched$, $arete_last_assertion_touched$, NIL));
        deflexical("*ARETE-LAST-TERM-TOUCHED*", SubLSystemTrampolineFile.maybeDefault($arete_last_term_touched$, $arete_last_term_touched$, NIL));
        deflexical("*ARETE-LAST-CONSTANT-TOUCHED*", SubLSystemTrampolineFile.maybeDefault($arete_last_constant_touched$, $arete_last_constant_touched$, NIL));
        deflexical("*ARETE-LAST-NART-TOUCHED*", SubLSystemTrampolineFile.maybeDefault($arete_last_nart_touched$, $arete_last_nart_touched$, NIL));
        defparameter("*ARETE-ASSERTIONS-TOUCHED-COUNT*", NIL);
        defparameter("*ARETE-TERMS-TOUCHED-COUNT*", NIL);
        deflexical("*KB-ACCESS-METERING-ENABLED?*", SubLSystemTrampolineFile.maybeDefault($sym4$_KB_ACCESS_METERING_ENABLED__, $kb_access_metering_enabledP$, NIL));
        defparameter("*KB-ACCESS-METERING-DOMAINS*", NIL);
        defparameter("*KB-ACCESS-METERING-TABLE*", NIL);
        return NIL;
    }

    public static SubLObject setup_kb_access_metering_file() {
        declare_defglobal($arete_last_assertion_touched$);
        declare_defglobal($arete_last_term_touched$);
        declare_defglobal($arete_last_constant_touched$);
        declare_defglobal($arete_last_nart_touched$);
        declare_defglobal($sym4$_KB_ACCESS_METERING_ENABLED__);
        register_macro_helper(NEW_KB_ACCESS_METERING_TABLE, WITH_KB_ACCESS_METERING);
        register_macro_helper(POSTPROCESS_KB_ACCESS_METERING_TABLE, WITH_KB_ACCESS_METERING);
        register_macro_helper($sym31$NOTE_KB_ACCESS_SBHL_, POSSIBLY_NOTE_KB_ACCESS_SBHL_LINK);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_kb_access_metering_file();
    }

    @Override
    public void initializeVariables() {
        init_kb_access_metering_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_kb_access_metering_file();
    }

    
}

/**
 * Total time: 307 ms
 */
