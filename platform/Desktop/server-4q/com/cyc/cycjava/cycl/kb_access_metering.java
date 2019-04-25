package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class kb_access_metering extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.kb_access_metering";
    public static final String myFingerPrint = "3a4ffddef5888aa8b183e3155ae0380412b3689fb1742bca3cc9967af58f7aa9";
    @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 1056L)
    public static SubLSymbol $arete_log_kb_touchesP$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 1256L)
    public static SubLSymbol $arete_log_last_kb_touchP$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 1430L)
    public static SubLSymbol $arete_log_kb_touch_countsP$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 1620L)
    public static SubLSymbol $arete_assertions_touched$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 1678L)
    public static SubLSymbol $arete_constants_touched$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 1735L)
    public static SubLSymbol $arete_narts_touched$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 1792L)
    public static SubLSymbol $arete_last_assertion_touched$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 1850L)
    public static SubLSymbol $arete_last_term_touched$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 1907L)
    public static SubLSymbol $arete_last_constant_touched$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 1964L)
    public static SubLSymbol $arete_last_nart_touched$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 2021L)
    public static SubLSymbol $arete_assertions_touched_count$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 2099L)
    public static SubLSymbol $arete_terms_touched_count$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 2171L)
    public static SubLSymbol $kb_access_metering_enabledP$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 2354L)
    public static SubLSymbol $kb_access_metering_domains$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 2457L)
    public static SubLSymbol $kb_access_metering_table$;
    private static final SubLSymbol $sym0$_ARETE_LAST_ASSERTION_TOUCHED_;
    private static final SubLSymbol $sym1$_ARETE_LAST_TERM_TOUCHED_;
    private static final SubLSymbol $sym2$_ARETE_LAST_CONSTANT_TOUCHED_;
    private static final SubLSymbol $sym3$_ARETE_LAST_NART_TOUCHED_;
    private static final SubLSymbol $sym4$_KB_ACCESS_METERING_ENABLED__;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLSymbol $kw7$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw8$DOMAINS;
    private static final SubLList $list9;
    private static final SubLSymbol $kw10$OPTIONS;
    private static final SubLSymbol $sym11$DOMAINS_VAR;
    private static final SubLSymbol $sym12$OPTIONS_VAR;
    private static final SubLSymbol $sym13$TABLE_VAR;
    private static final SubLSymbol $sym14$CLET;
    private static final SubLSymbol $sym15$NEW_KB_ACCESS_METERING_TABLE;
    private static final SubLSymbol $sym16$_KB_ACCESS_METERING_DOMAINS_;
    private static final SubLSymbol $sym17$_KB_ACCESS_METERING_TABLE_;
    private static final SubLSymbol $sym18$CUNWIND_PROTECT;
    private static final SubLSymbol $sym19$PROGN;
    private static final SubLSymbol $sym20$CSETQ;
    private static final SubLSymbol $sym21$POSTPROCESS_KB_ACCESS_METERING_TABLE;
    private static final SubLList $list22;
    private static final SubLSymbol $sym23$WITH_KB_ACCESS_METERING;
    private static final SubLSymbol $kw24$CONSTANT;
    private static final SubLSymbol $kw25$NART;
    private static final SubLSymbol $kw26$ASSERTION;
    private static final SubLList $list27;
    private static final SubLSymbol $sym28$PWHEN;
    private static final SubLList $list29;
    private static final SubLSymbol $sym30$NOTE_KB_ACCESS_SBHL_LINK;
    private static final SubLSymbol $sym31$NOTE_KB_ACCESS_SBHL_;
    private static final SubLSymbol $sym32$POSSIBLY_NOTE_KB_ACCESS_SBHL_LINK;
    private static final SubLSymbol $kw33$SBHL;
    private static final SubLSymbol $sym34$ASSERTED_WHEN;
    private static final SubLSymbol $sym35$UNIVERSAL_TIME_FOR_START_OF_UNIVERSAL_DATE;
    private static final SubLSymbol $sym36$_;
    private static final SubLSymbol $sym37$__;
    private static final SubLSymbol $sym38$SECOND;
    private static final SubLList $list39;
    private static final SubLString $str40$______A;
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 2558L)
    public static SubLObject with_kb_access_metering(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_access_metering.$list5);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject result_var = (SubLObject)kb_access_metering.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_access_metering.$list5);
        result_var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_access_metering.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_access_metering.NIL;
        SubLObject current_$1 = (SubLObject)kb_access_metering.NIL;
        while (kb_access_metering.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_access_metering.$list5);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_access_metering.$list5);
            if (kb_access_metering.NIL == conses_high.member(current_$1, (SubLObject)kb_access_metering.$list6, (SubLObject)kb_access_metering.UNPROVIDED, (SubLObject)kb_access_metering.UNPROVIDED)) {
                bad = (SubLObject)kb_access_metering.T;
            }
            if (current_$1 == kb_access_metering.$kw7$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_access_metering.NIL != bad && kb_access_metering.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_access_metering.$list5);
        }
        final SubLObject domains_tail = cdestructuring_bind.property_list_member((SubLObject)kb_access_metering.$kw8$DOMAINS, current);
        final SubLObject domains = (SubLObject)((kb_access_metering.NIL != domains_tail) ? conses_high.cadr(domains_tail) : kb_access_metering.$list9);
        final SubLObject options_tail = cdestructuring_bind.property_list_member((SubLObject)kb_access_metering.$kw10$OPTIONS, current);
        final SubLObject options = (SubLObject)((kb_access_metering.NIL != options_tail) ? conses_high.cadr(options_tail) : kb_access_metering.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject domains_var = (SubLObject)kb_access_metering.$sym11$DOMAINS_VAR;
        final SubLObject options_var = (SubLObject)kb_access_metering.$sym12$OPTIONS_VAR;
        final SubLObject table_var = (SubLObject)kb_access_metering.$sym13$TABLE_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)kb_access_metering.$sym14$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(domains_var, domains), (SubLObject)ConsesLow.list(options_var, options), (SubLObject)ConsesLow.list(table_var, (SubLObject)ConsesLow.list((SubLObject)kb_access_metering.$sym15$NEW_KB_ACCESS_METERING_TABLE, domains_var, options_var))), (SubLObject)ConsesLow.list((SubLObject)kb_access_metering.$sym14$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)kb_access_metering.$sym16$_KB_ACCESS_METERING_DOMAINS_, domains_var), (SubLObject)ConsesLow.list((SubLObject)kb_access_metering.$sym17$_KB_ACCESS_METERING_TABLE_, table_var)), (SubLObject)ConsesLow.list((SubLObject)kb_access_metering.$sym18$CUNWIND_PROTECT, reader.bq_cons((SubLObject)kb_access_metering.$sym19$PROGN, ConsesLow.append(body, (SubLObject)kb_access_metering.NIL)), (SubLObject)ConsesLow.list((SubLObject)kb_access_metering.$sym20$CSETQ, result_var, (SubLObject)ConsesLow.list((SubLObject)kb_access_metering.$sym21$POSTPROCESS_KB_ACCESS_METERING_TABLE, table_var, domains_var, options_var)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 3401L)
    public static SubLObject eval_with_kb_access_metering(final SubLObject form, SubLObject domains, SubLObject options) {
        if (domains == kb_access_metering.UNPROVIDED) {
            domains = (SubLObject)kb_access_metering.$list22;
        }
        if (options == kb_access_metering.UNPROVIDED) {
            options = (SubLObject)kb_access_metering.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject metering_result = (SubLObject)kb_access_metering.NIL;
        SubLObject eval_result = (SubLObject)kb_access_metering.NIL;
        final SubLObject domains_var = domains;
        final SubLObject options_var = options;
        final SubLObject table_var = new_kb_access_metering_table(domains_var, options_var);
        final SubLObject _prev_bind_0 = kb_access_metering.$kb_access_metering_domains$.currentBinding(thread);
        final SubLObject _prev_bind_2 = kb_access_metering.$kb_access_metering_table$.currentBinding(thread);
        try {
            kb_access_metering.$kb_access_metering_domains$.bind(domains_var, thread);
            kb_access_metering.$kb_access_metering_table$.bind(table_var, thread);
            try {
                eval_result = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(Eval.eval(form)));
            }
            finally {
                final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_access_metering.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    metering_result = postprocess_kb_access_metering_table(table_var, domains_var, options_var);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                }
            }
        }
        finally {
            kb_access_metering.$kb_access_metering_table$.rebind(_prev_bind_2, thread);
            kb_access_metering.$kb_access_metering_domains$.rebind(_prev_bind_0, thread);
        }
        return Values.values(metering_result, eval_result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 4061L)
    public static SubLObject new_kb_access_metering_table(final SubLObject domains, final SubLObject options) {
        return dictionary.new_dictionary(Symbols.symbol_function((SubLObject)kb_access_metering.EQ), (SubLObject)kb_access_metering.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 4241L)
    public static SubLObject postprocess_kb_access_metering_table(final SubLObject table, final SubLObject domains, final SubLObject options) {
        return table;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 4401L)
    public static SubLObject possibly_note_kb_access_constant(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_access_metering.NIL != kb_access_metering.$kb_access_metering_enabledP$.getGlobalValue() && kb_access_metering.NIL != list_utilities.member_eqP((SubLObject)kb_access_metering.$kw24$CONSTANT, kb_access_metering.$kb_access_metering_domains$.getDynamicValue(thread))) {
            dictionary_utilities.dictionary_increment(kb_access_metering.$kb_access_metering_table$.getDynamicValue(thread), constant, (SubLObject)kb_access_metering.UNPROVIDED);
            return (SubLObject)kb_access_metering.T;
        }
        return (SubLObject)kb_access_metering.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 4715L)
    public static SubLObject possibly_note_kb_access_nart(final SubLObject nart) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_access_metering.NIL != kb_access_metering.$kb_access_metering_enabledP$.getGlobalValue() && kb_access_metering.NIL != list_utilities.member_eqP((SubLObject)kb_access_metering.$kw25$NART, kb_access_metering.$kb_access_metering_domains$.getDynamicValue(thread))) {
            dictionary_utilities.dictionary_increment(kb_access_metering.$kb_access_metering_table$.getDynamicValue(thread), nart, (SubLObject)kb_access_metering.UNPROVIDED);
            return (SubLObject)kb_access_metering.T;
        }
        return (SubLObject)kb_access_metering.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 4946L)
    public static SubLObject possibly_note_kb_access_assertion(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_access_metering.NIL != kb_access_metering.$kb_access_metering_enabledP$.getGlobalValue() && kb_access_metering.NIL != list_utilities.member_eqP((SubLObject)kb_access_metering.$kw26$ASSERTION, kb_access_metering.$kb_access_metering_domains$.getDynamicValue(thread))) {
            return note_kb_access_assertion(assertion);
        }
        return (SubLObject)kb_access_metering.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 5166L)
    public static SubLObject note_kb_access_assertion(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        dictionary_utilities.dictionary_increment(kb_access_metering.$kb_access_metering_table$.getDynamicValue(thread), assertion, (SubLObject)kb_access_metering.UNPROVIDED);
        return (SubLObject)kb_access_metering.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 5295L)
    public static SubLObject possibly_note_kb_access_sbhl_link(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject node = (SubLObject)kb_access_metering.NIL;
        SubLObject link_node = (SubLObject)kb_access_metering.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_access_metering.$list27);
        node = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_access_metering.$list27);
        link_node = current.first();
        current = current.rest();
        if (kb_access_metering.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)kb_access_metering.$sym28$PWHEN, (SubLObject)kb_access_metering.$list29, (SubLObject)ConsesLow.list((SubLObject)kb_access_metering.$sym30$NOTE_KB_ACCESS_SBHL_LINK, node, link_node));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_access_metering.$list27);
        return (SubLObject)kb_access_metering.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 5564L)
    public static SubLObject note_kb_access_sbhlP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.member_eqP((SubLObject)kb_access_metering.$kw33$SBHL, kb_access_metering.$kb_access_metering_domains$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 5712L)
    public static SubLObject kb_access_metering_asserted_assertions(final SubLObject kbam_result) {
        return list_utilities.remove_if_not(Symbols.symbol_function((SubLObject)kb_access_metering.$sym34$ASSERTED_WHEN), dictionary.dictionary_keys(kbam_result), (SubLObject)kb_access_metering.UNPROVIDED, (SubLObject)kb_access_metering.UNPROVIDED, (SubLObject)kb_access_metering.UNPROVIDED, (SubLObject)kb_access_metering.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 6029L)
    public static SubLObject mean_asserted_assertion_dates(final SubLObject kbam_result) {
        final SubLObject assertions = kb_access_metering_asserted_assertions(kbam_result);
        final SubLObject dates = Mapping.mapcar(Symbols.symbol_function((SubLObject)kb_access_metering.$sym34$ASSERTED_WHEN), assertions);
        final SubLObject times = Mapping.mapcar(Symbols.symbol_function((SubLObject)kb_access_metering.$sym35$UNIVERSAL_TIME_FOR_START_OF_UNIVERSAL_DATE), dates);
        final SubLObject mean_time = Numbers.round(number_utilities.mean(times), (SubLObject)kb_access_metering.UNPROVIDED);
        final SubLObject mean_date = numeric_date_utilities.get_universal_date(mean_time, (SubLObject)kb_access_metering.UNPROVIDED);
        return mean_date;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 6384L)
    public static SubLObject median_asserted_assertion_dates(final SubLObject kbam_result) {
        final SubLObject assertions = kb_access_metering_asserted_assertions(kbam_result);
        final SubLObject dates = Mapping.mapcar(Symbols.symbol_function((SubLObject)kb_access_metering.$sym34$ASSERTED_WHEN), assertions);
        final SubLObject times = Mapping.mapcar(Symbols.symbol_function((SubLObject)kb_access_metering.$sym35$UNIVERSAL_TIME_FOR_START_OF_UNIVERSAL_DATE), dates);
        final SubLObject median_time = Numbers.round(number_utilities.median(times, (SubLObject)kb_access_metering.UNPROVIDED, (SubLObject)kb_access_metering.UNPROVIDED), (SubLObject)kb_access_metering.UNPROVIDED);
        final SubLObject median_date = numeric_date_utilities.get_universal_date(median_time, (SubLObject)kb_access_metering.UNPROVIDED);
        return median_date;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 6751L)
    public static SubLObject weighted_mean_asserted_assertion_dates(final SubLObject kbam_result) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject times = (SubLObject)kb_access_metering.ZERO_INTEGER;
        SubLObject total = (SubLObject)kb_access_metering.ZERO_INTEGER;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(kbam_result)); kb_access_metering.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject assertion = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject count = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject date = assertions_high.asserted_when(assertion);
            if (kb_access_metering.NIL != date) {
                final SubLObject time = numeric_date_utilities.universal_time_for_start_of_universal_date(date, (SubLObject)kb_access_metering.UNPROVIDED);
                total = Numbers.add(total, count);
                times = Numbers.add(times, Numbers.multiply(count, time));
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        final SubLObject mean_time = Numbers.integerDivide(times, total);
        final SubLObject mean_date = numeric_date_utilities.get_universal_date(mean_time, (SubLObject)kb_access_metering.UNPROVIDED);
        return mean_date;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 7206L)
    public static SubLObject weighted_median_asserted_assertion_dates(final SubLObject kbam_result) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject dates = (SubLObject)kb_access_metering.NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(kbam_result)); kb_access_metering.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject assertion = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject count = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject date = assertions_high.asserted_when(assertion);
            if (kb_access_metering.NIL != date) {
                dates = ConsesLow.nconc((SubLObject)ConsesLow.make_list(count, date), dates);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        final SubLObject median_date = Numbers.round(number_utilities.median(dates, (SubLObject)kb_access_metering.UNPROVIDED, (SubLObject)kb_access_metering.UNPROVIDED), (SubLObject)kb_access_metering.UNPROVIDED);
        return median_date;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 7541L)
    public static SubLObject percent_before_date(final SubLObject universal_date, final SubLObject kbam_result) {
        final SubLObject assertions = kb_access_metering_asserted_assertions(kbam_result);
        SubLObject dates = Mapping.mapcar(Symbols.symbol_function((SubLObject)kb_access_metering.$sym34$ASSERTED_WHEN), assertions);
        dates = Sort.sort(dates, Symbols.symbol_function((SubLObject)kb_access_metering.$sym36$_), (SubLObject)kb_access_metering.UNPROVIDED);
        final SubLObject date_position = Sequences.position(universal_date, dates, Symbols.symbol_function((SubLObject)kb_access_metering.$sym37$__), (SubLObject)kb_access_metering.UNPROVIDED, (SubLObject)kb_access_metering.UNPROVIDED, (SubLObject)kb_access_metering.UNPROVIDED);
        final SubLObject percent = number_utilities.percent(date_position, Sequences.length(dates), (SubLObject)kb_access_metering.THREE_INTEGER);
        return percent;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 7907L)
    public static SubLObject weighted_percent_before_date(final SubLObject universal_date, final SubLObject kbam_result) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject dates = (SubLObject)kb_access_metering.NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(kbam_result)); kb_access_metering.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject assertion = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject count = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject date = assertions_high.asserted_when(assertion);
            if (kb_access_metering.NIL != date) {
                dates = ConsesLow.nconc((SubLObject)ConsesLow.make_list(count, date), dates);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        dates = Sort.sort(dates, Symbols.symbol_function((SubLObject)kb_access_metering.$sym36$_), (SubLObject)kb_access_metering.UNPROVIDED);
        final SubLObject date_position = Sequences.position(universal_date, dates, Symbols.symbol_function((SubLObject)kb_access_metering.$sym37$__), (SubLObject)kb_access_metering.UNPROVIDED, (SubLObject)kb_access_metering.UNPROVIDED, (SubLObject)kb_access_metering.UNPROVIDED);
        final SubLObject percent = number_utilities.percent(date_position, Sequences.length(dates), (SubLObject)kb_access_metering.THREE_INTEGER);
        return percent;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 8347L)
    public static SubLObject print_asserted_assertions_by_date(final SubLObject kbam_result, SubLObject stream) {
        if (stream == kb_access_metering.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tuples = (SubLObject)kb_access_metering.NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(kbam_result)); kb_access_metering.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject assertion = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject count = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject date = assertions_high.asserted_when(assertion);
            if (kb_access_metering.NIL != date) {
                tuples = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(assertion, date, count), tuples);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        tuples = Sort.sort(tuples, Symbols.symbol_function((SubLObject)kb_access_metering.$sym36$_), Symbols.symbol_function((SubLObject)kb_access_metering.$sym38$SECOND));
        SubLObject previous_date = (SubLObject)kb_access_metering.ZERO_INTEGER;
        SubLObject cdolist_list_var = tuples;
        SubLObject tuple = (SubLObject)kb_access_metering.NIL;
        tuple = cdolist_list_var.first();
        while (kb_access_metering.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = tuple;
            SubLObject assertion2 = (SubLObject)kb_access_metering.NIL;
            SubLObject date2 = (SubLObject)kb_access_metering.NIL;
            SubLObject count2 = (SubLObject)kb_access_metering.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_access_metering.$list39);
            assertion2 = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_access_metering.$list39);
            date2 = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_access_metering.$list39);
            count2 = current.first();
            current = current.rest();
            if (kb_access_metering.NIL == current) {
                if (date2.numG(previous_date)) {
                    PrintLow.format(stream, (SubLObject)kb_access_metering.$str40$______A, numeric_date_utilities.datestring(date2));
                    previous_date = date2;
                }
                print_high.print(assertion2, stream);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_access_metering.$list39);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        }
        return (SubLObject)kb_access_metering.NIL;
    }
    
    public static SubLObject declare_kb_access_metering_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_access_metering", "with_kb_access_metering", "WITH-KB-ACCESS-METERING");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_access_metering", "eval_with_kb_access_metering", "EVAL-WITH-KB-ACCESS-METERING", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_access_metering", "new_kb_access_metering_table", "NEW-KB-ACCESS-METERING-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_access_metering", "postprocess_kb_access_metering_table", "POSTPROCESS-KB-ACCESS-METERING-TABLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_access_metering", "possibly_note_kb_access_constant", "POSSIBLY-NOTE-KB-ACCESS-CONSTANT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_access_metering", "possibly_note_kb_access_nart", "POSSIBLY-NOTE-KB-ACCESS-NART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_access_metering", "possibly_note_kb_access_assertion", "POSSIBLY-NOTE-KB-ACCESS-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_access_metering", "note_kb_access_assertion", "NOTE-KB-ACCESS-ASSERTION", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_access_metering", "possibly_note_kb_access_sbhl_link", "POSSIBLY-NOTE-KB-ACCESS-SBHL-LINK");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_access_metering", "note_kb_access_sbhlP", "NOTE-KB-ACCESS-SBHL?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_access_metering", "kb_access_metering_asserted_assertions", "KB-ACCESS-METERING-ASSERTED-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_access_metering", "mean_asserted_assertion_dates", "MEAN-ASSERTED-ASSERTION-DATES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_access_metering", "median_asserted_assertion_dates", "MEDIAN-ASSERTED-ASSERTION-DATES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_access_metering", "weighted_mean_asserted_assertion_dates", "WEIGHTED-MEAN-ASSERTED-ASSERTION-DATES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_access_metering", "weighted_median_asserted_assertion_dates", "WEIGHTED-MEDIAN-ASSERTED-ASSERTION-DATES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_access_metering", "percent_before_date", "PERCENT-BEFORE-DATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_access_metering", "weighted_percent_before_date", "WEIGHTED-PERCENT-BEFORE-DATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_access_metering", "print_asserted_assertions_by_date", "PRINT-ASSERTED-ASSERTIONS-BY-DATE", 1, 1, false);
        return (SubLObject)kb_access_metering.NIL;
    }
    
    public static SubLObject init_kb_access_metering_file() {
        kb_access_metering.$arete_log_kb_touchesP$ = SubLFiles.defparameter("*ARETE-LOG-KB-TOUCHES?*", (SubLObject)kb_access_metering.NIL);
        kb_access_metering.$arete_log_last_kb_touchP$ = SubLFiles.defparameter("*ARETE-LOG-LAST-KB-TOUCH?*", (SubLObject)kb_access_metering.NIL);
        kb_access_metering.$arete_log_kb_touch_countsP$ = SubLFiles.defparameter("*ARETE-LOG-KB-TOUCH-COUNTS?*", (SubLObject)kb_access_metering.NIL);
        kb_access_metering.$arete_assertions_touched$ = SubLFiles.defparameter("*ARETE-ASSERTIONS-TOUCHED*", (SubLObject)kb_access_metering.NIL);
        kb_access_metering.$arete_constants_touched$ = SubLFiles.defparameter("*ARETE-CONSTANTS-TOUCHED*", (SubLObject)kb_access_metering.NIL);
        kb_access_metering.$arete_narts_touched$ = SubLFiles.defparameter("*ARETE-NARTS-TOUCHED*", (SubLObject)kb_access_metering.NIL);
        kb_access_metering.$arete_last_assertion_touched$ = SubLFiles.deflexical("*ARETE-LAST-ASSERTION-TOUCHED*", (SubLObject)(maybeDefault((SubLObject)kb_access_metering.$sym0$_ARETE_LAST_ASSERTION_TOUCHED_, kb_access_metering.$arete_last_assertion_touched$, kb_access_metering.NIL)));
        kb_access_metering.$arete_last_term_touched$ = SubLFiles.deflexical("*ARETE-LAST-TERM-TOUCHED*", (SubLObject)(maybeDefault((SubLObject)kb_access_metering.$sym1$_ARETE_LAST_TERM_TOUCHED_, kb_access_metering.$arete_last_term_touched$, kb_access_metering.NIL)));
        kb_access_metering.$arete_last_constant_touched$ = SubLFiles.deflexical("*ARETE-LAST-CONSTANT-TOUCHED*", (SubLObject)(maybeDefault((SubLObject)kb_access_metering.$sym2$_ARETE_LAST_CONSTANT_TOUCHED_, kb_access_metering.$arete_last_constant_touched$, kb_access_metering.NIL)));
        kb_access_metering.$arete_last_nart_touched$ = SubLFiles.deflexical("*ARETE-LAST-NART-TOUCHED*", (SubLObject)(maybeDefault((SubLObject)kb_access_metering.$sym3$_ARETE_LAST_NART_TOUCHED_, kb_access_metering.$arete_last_nart_touched$, kb_access_metering.NIL)));
        kb_access_metering.$arete_assertions_touched_count$ = SubLFiles.defparameter("*ARETE-ASSERTIONS-TOUCHED-COUNT*", (SubLObject)kb_access_metering.NIL);
        kb_access_metering.$arete_terms_touched_count$ = SubLFiles.defparameter("*ARETE-TERMS-TOUCHED-COUNT*", (SubLObject)kb_access_metering.NIL);
        kb_access_metering.$kb_access_metering_enabledP$ = SubLFiles.deflexical("*KB-ACCESS-METERING-ENABLED?*", (SubLObject)(maybeDefault((SubLObject)kb_access_metering.$sym4$_KB_ACCESS_METERING_ENABLED__, kb_access_metering.$kb_access_metering_enabledP$, kb_access_metering.NIL)));
        kb_access_metering.$kb_access_metering_domains$ = SubLFiles.defparameter("*KB-ACCESS-METERING-DOMAINS*", (SubLObject)kb_access_metering.NIL);
        kb_access_metering.$kb_access_metering_table$ = SubLFiles.defparameter("*KB-ACCESS-METERING-TABLE*", (SubLObject)kb_access_metering.NIL);
        return (SubLObject)kb_access_metering.NIL;
    }
    
    public static SubLObject setup_kb_access_metering_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)kb_access_metering.$sym0$_ARETE_LAST_ASSERTION_TOUCHED_);
        subl_macro_promotions.declare_defglobal((SubLObject)kb_access_metering.$sym1$_ARETE_LAST_TERM_TOUCHED_);
        subl_macro_promotions.declare_defglobal((SubLObject)kb_access_metering.$sym2$_ARETE_LAST_CONSTANT_TOUCHED_);
        subl_macro_promotions.declare_defglobal((SubLObject)kb_access_metering.$sym3$_ARETE_LAST_NART_TOUCHED_);
        subl_macro_promotions.declare_defglobal((SubLObject)kb_access_metering.$sym4$_KB_ACCESS_METERING_ENABLED__);
        access_macros.register_macro_helper((SubLObject)kb_access_metering.$sym15$NEW_KB_ACCESS_METERING_TABLE, (SubLObject)kb_access_metering.$sym23$WITH_KB_ACCESS_METERING);
        access_macros.register_macro_helper((SubLObject)kb_access_metering.$sym21$POSTPROCESS_KB_ACCESS_METERING_TABLE, (SubLObject)kb_access_metering.$sym23$WITH_KB_ACCESS_METERING);
        access_macros.register_macro_helper((SubLObject)kb_access_metering.$sym31$NOTE_KB_ACCESS_SBHL_, (SubLObject)kb_access_metering.$sym32$POSSIBLY_NOTE_KB_ACCESS_SBHL_LINK);
        return (SubLObject)kb_access_metering.NIL;
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
    
    static {
        me = (SubLFile)new kb_access_metering();
        kb_access_metering.$arete_log_kb_touchesP$ = null;
        kb_access_metering.$arete_log_last_kb_touchP$ = null;
        kb_access_metering.$arete_log_kb_touch_countsP$ = null;
        kb_access_metering.$arete_assertions_touched$ = null;
        kb_access_metering.$arete_constants_touched$ = null;
        kb_access_metering.$arete_narts_touched$ = null;
        kb_access_metering.$arete_last_assertion_touched$ = null;
        kb_access_metering.$arete_last_term_touched$ = null;
        kb_access_metering.$arete_last_constant_touched$ = null;
        kb_access_metering.$arete_last_nart_touched$ = null;
        kb_access_metering.$arete_assertions_touched_count$ = null;
        kb_access_metering.$arete_terms_touched_count$ = null;
        kb_access_metering.$kb_access_metering_enabledP$ = null;
        kb_access_metering.$kb_access_metering_domains$ = null;
        kb_access_metering.$kb_access_metering_table$ = null;
        $sym0$_ARETE_LAST_ASSERTION_TOUCHED_ = SubLObjectFactory.makeSymbol("*ARETE-LAST-ASSERTION-TOUCHED*");
        $sym1$_ARETE_LAST_TERM_TOUCHED_ = SubLObjectFactory.makeSymbol("*ARETE-LAST-TERM-TOUCHED*");
        $sym2$_ARETE_LAST_CONSTANT_TOUCHED_ = SubLObjectFactory.makeSymbol("*ARETE-LAST-CONSTANT-TOUCHED*");
        $sym3$_ARETE_LAST_NART_TOUCHED_ = SubLObjectFactory.makeSymbol("*ARETE-LAST-NART-TOUCHED*");
        $sym4$_KB_ACCESS_METERING_ENABLED__ = SubLObjectFactory.makeSymbol("*KB-ACCESS-METERING-ENABLED?*");
        $list5 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DOMAINS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"))))), (SubLObject)SubLObjectFactory.makeSymbol("OPTIONS")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DOMAINS"), (SubLObject)SubLObjectFactory.makeKeyword("OPTIONS"));
        $kw7$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw8$DOMAINS = SubLObjectFactory.makeKeyword("DOMAINS");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ASSERTION")));
        $kw10$OPTIONS = SubLObjectFactory.makeKeyword("OPTIONS");
        $sym11$DOMAINS_VAR = SubLObjectFactory.makeUninternedSymbol("DOMAINS-VAR");
        $sym12$OPTIONS_VAR = SubLObjectFactory.makeUninternedSymbol("OPTIONS-VAR");
        $sym13$TABLE_VAR = SubLObjectFactory.makeUninternedSymbol("TABLE-VAR");
        $sym14$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym15$NEW_KB_ACCESS_METERING_TABLE = SubLObjectFactory.makeSymbol("NEW-KB-ACCESS-METERING-TABLE");
        $sym16$_KB_ACCESS_METERING_DOMAINS_ = SubLObjectFactory.makeSymbol("*KB-ACCESS-METERING-DOMAINS*");
        $sym17$_KB_ACCESS_METERING_TABLE_ = SubLObjectFactory.makeSymbol("*KB-ACCESS-METERING-TABLE*");
        $sym18$CUNWIND_PROTECT = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $sym19$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym20$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym21$POSTPROCESS_KB_ACCESS_METERING_TABLE = SubLObjectFactory.makeSymbol("POSTPROCESS-KB-ACCESS-METERING-TABLE");
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"));
        $sym23$WITH_KB_ACCESS_METERING = SubLObjectFactory.makeSymbol("WITH-KB-ACCESS-METERING");
        $kw24$CONSTANT = SubLObjectFactory.makeKeyword("CONSTANT");
        $kw25$NART = SubLObjectFactory.makeKeyword("NART");
        $kw26$ASSERTION = SubLObjectFactory.makeKeyword("ASSERTION");
        $list27 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NODE"), (SubLObject)SubLObjectFactory.makeSymbol("LINK-NODE"));
        $sym28$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $list29 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("*KB-ACCESS-METERING-ENABLED?*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NOTE-KB-ACCESS-SBHL?")));
        $sym30$NOTE_KB_ACCESS_SBHL_LINK = SubLObjectFactory.makeSymbol("NOTE-KB-ACCESS-SBHL-LINK");
        $sym31$NOTE_KB_ACCESS_SBHL_ = SubLObjectFactory.makeSymbol("NOTE-KB-ACCESS-SBHL?");
        $sym32$POSSIBLY_NOTE_KB_ACCESS_SBHL_LINK = SubLObjectFactory.makeSymbol("POSSIBLY-NOTE-KB-ACCESS-SBHL-LINK");
        $kw33$SBHL = SubLObjectFactory.makeKeyword("SBHL");
        $sym34$ASSERTED_WHEN = SubLObjectFactory.makeSymbol("ASSERTED-WHEN");
        $sym35$UNIVERSAL_TIME_FOR_START_OF_UNIVERSAL_DATE = SubLObjectFactory.makeSymbol("UNIVERSAL-TIME-FOR-START-OF-UNIVERSAL-DATE");
        $sym36$_ = SubLObjectFactory.makeSymbol("<");
        $sym37$__ = SubLObjectFactory.makeSymbol("<=");
        $sym38$SECOND = SubLObjectFactory.makeSymbol("SECOND");
        $list39 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("DATE"), (SubLObject)SubLObjectFactory.makeSymbol("COUNT"));
        $str40$______A = SubLObjectFactory.makeString("~%;; ~A");
    }
}

/*

	Total time: 307 ms
	
*/