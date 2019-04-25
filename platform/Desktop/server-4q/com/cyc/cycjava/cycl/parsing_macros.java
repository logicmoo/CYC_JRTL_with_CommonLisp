package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class parsing_macros extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.parsing_macros";
    public static final String myFingerPrint = "e90cf7d0bfb32707a32f8fdb6ebd04ce84cb90f2d1845bfc1406ce0e838ec290";
    @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 796L)
    public static SubLSymbol $parsing_timeout_time$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 849L)
    public static SubLSymbol $parsing_timeout_reachedP$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 905L)
    public static SubLSymbol $parsing_timeout_time_check_count$;
    @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 6074L)
    public static SubLSymbol $psp_sbhl_resourcing_limit$;
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$CLET;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$_PARSING_TIMEOUT_TIME_;
    private static final SubLSymbol $sym4$PARSING_COMPUTE_TIMEOUT_TIME;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$PUNLESS;
    private static final SubLSymbol $sym8$_PARSING_TIMEOUT_REACHED__;
    private static final SubLSymbol $sym9$CSETQ;
    private static final SubLList $list10;
    private static final SubLSymbol $sym11$PIF;
    private static final SubLSymbol $sym12$WITH_PARSING_TIMEOUT;
    private static final SubLSymbol $sym13$PROGN;
    private static final SubLList $list14;
    private static final SubLList $list15;
    private static final SubLSymbol $sym16$CHART;
    private static final SubLSymbol $sym17$WITH_MEMOIZATION_STATE;
    private static final SubLSymbol $sym18$PSP_CHART_MEMOIZATION_STATE;
    private static final SubLSymbol $sym19$_PSP_CHART_;
    private static final SubLList $list20;
    private static final SubLList $list21;
    private static final SubLSymbol $kw22$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw23$GAP_TYPE;
    private static final SubLSymbol $kw24$NONE;
    private static final SubLSymbol $sym25$START_INDEX;
    private static final SubLSymbol $sym26$END_INDEX;
    private static final SubLSymbol $sym27$CHART;
    private static final SubLSymbol $sym28$PWHEN;
    private static final SubLSymbol $sym29$COR;
    private static final SubLList $list30;
    private static final SubLSymbol $sym31$PSP_CHART_MATCHES_GAP_TYPE_P;
    private static final SubLSymbol $sym32$CMULTIPLE_VALUE_SETQ;
    private static final SubLSymbol $sym33$PSP_FIND_STRING_IN_CHARTS;
    private static final SubLList $list34;
    private static final SubLSymbol $sym35$_PSP_CHART_START_INDEX_;
    private static final SubLSymbol $sym36$_PSP_CHART_END_INDEX_;
    private static final SubLSymbol $sym37$PSP_CHART_DO_SYNTACTIC_PARSING;
    private static final SubLList $list38;
    private static final SubLSymbol $sym39$WITH_PSP_CHART;
    private static final SubLSymbol $sym40$PSP_CHART_FOR_STRING;
    private static final SubLList $list41;
    private static final SubLList $list42;
    private static final SubLSymbol $sym43$GET_PSP_LEXICON;
    private static final SubLSymbol $sym44$WITH_PSP_CHART_FOR_STRING;
    private static final SubLList $list45;
    private static final SubLSymbol $sym46$_PSP_EXTRA_CHARTS_;
    private static final SubLSymbol $sym47$WITH_INFERENCE_MT_RELEVANCE;
    private static final SubLList $list48;
    private static final SubLList $list49;
    private static final SubLList $list50;
    private static final SubLSymbol $kw51$DONE;
    private static final SubLSymbol $sym52$CSOME;
    private static final SubLSymbol $sym53$PSP_EDGE_DTRS;
    private static final SubLList $list54;
    private static final SubLSymbol $sym55$I;
    private static final SubLSymbol $sym56$CSOME_NUMBERED;
    private static final SubLSymbol $sym57$1_;
    private static final SubLSymbol $sym58$WITH_SBHL_RESOURCED_MARKING_SPACES;
    private static final SubLSymbol $sym59$_PSP_SBHL_RESOURCING_LIMIT_;
    private static final SubLList $list60;
    private static final SubLSymbol $sym61$CHECK_TYPE;
    private static final SubLList $list62;
    private static final SubLSymbol $sym63$_PARSER_CYCL_BLACKLIST_;
    private static final SubLList $list64;
    private static final SubLList $list65;
    private static final SubLSymbol $sym66$ENVIRONMENT;
    private static final SubLSymbol $sym67$STRING;
    private static final SubLSymbol $sym68$BEST;
    private static final SubLSymbol $sym69$REST;
    private static final SubLSymbol $sym70$EDGE;
    private static final SubLSymbol $sym71$EDGE_SETS;
    private static final SubLSymbol $sym72$_OPTIONAL;
    private static final SubLList $list73;
    private static final SubLString $str74$_CACHED;
    private static final SubLString $str75$CLEAR_;
    private static final SubLString $str76$_CACHED_INTERNAL;
    private static final SubLString $str77$_EDGE_SETS;
    private static final SubLString $str78$_EDGE_CYCLS;
    private static final SubLSymbol $sym79$DECLAIM;
    private static final SubLSymbol $sym80$FACCESS;
    private static final SubLSymbol $sym81$PRIVATE;
    private static final SubLSymbol $sym82$DEFINE_CACHED_NEW;
    private static final SubLList $list83;
    private static final SubLSymbol $sym84$IGNORE;
    private static final SubLList $list85;
    private static final SubLSymbol $sym86$CAND;
    private static final SubLSymbol $sym87$_REIFY_PARSE_NODES__;
    private static final SubLSymbol $sym88$SET_PARSE_ROOT_NODE;
    private static final SubLSymbol $sym89$PSP_FIND_OR_CREATE_NODE_FOR_EDGES;
    private static final SubLSymbol $sym90$SET_UNION;
    private static final SubLList $list91;
    private static final SubLSymbol $sym92$PSP_ACCUMULATE_ANSWERS;
    private static final SubLSymbol $sym93$RET;
    private static final SubLSymbol $sym94$VALUES;
    private static final SubLSymbol $sym95$DEFINE;
    private static final SubLList $list96;
    private static final SubLList $list97;
    private static final SubLSymbol $sym98$DEFINE_PRIVATE;
    private static final SubLList $list99;
    private static final SubLList $list100;
    private static final SubLSymbol $sym101$WITH_PSP_SBHL_RESOURCING;
    private static final SubLList $list102;
    private static final SubLSymbol $sym103$DEFINE_PSP_INTERFACE_HELPER;
    private static final SubLSymbol $sym104$BYPASS_PSP_CACHES_;
    private static final SubLList $list105;
    private static final SubLList $list106;
    private static final SubLSymbol $sym107$BOUNDP;
    private static final SubLList $list108;
    private static final SubLList $list109;
    private static final SubLList $list110;
    private static final SubLSymbol $sym111$NL_TAG_TEMPLATES;
    private static final SubLSymbol $sym112$PSP_STRIP_AND_REMEMBER_NL_TAGS;
    private static final SubLSymbol $sym113$PSP_ADD_NL_TAG_TEMPLATES;
    private static final SubLSymbol $sym114$PSP_PROMOTING_NL_TAGS;
    private static final SubLList $list115;
    private static final SubLSymbol $sym116$_SPEAKER_REFERENT_;
    private static final SubLList $list117;
    private static final SubLSymbol $sym118$_NPP_USE_STRINGS_FOR_SEMANTICS__;
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 967L)
    public static SubLObject with_parsing_timeout(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parsing_macros.$list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject delay_in_seconds = (SubLObject)parsing_macros.NIL;
        SubLObject timed_outP = (SubLObject)parsing_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parsing_macros.$list0);
        delay_in_seconds = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parsing_macros.$list0);
        timed_outP = current.first();
        current = current.rest();
        if (parsing_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)parsing_macros.$sym1$CLET, (SubLObject)ConsesLow.listS((SubLObject)parsing_macros.$list2, (SubLObject)ConsesLow.list((SubLObject)parsing_macros.$sym3$_PARSING_TIMEOUT_TIME_, (SubLObject)ConsesLow.list((SubLObject)parsing_macros.$sym4$PARSING_COMPUTE_TIMEOUT_TIME, delay_in_seconds)), (SubLObject)parsing_macros.$list5), (SubLObject)parsing_macros.$list6, (SubLObject)ConsesLow.listS((SubLObject)parsing_macros.$sym7$PUNLESS, (SubLObject)parsing_macros.$sym8$_PARSING_TIMEOUT_REACHED__, ConsesLow.append(body, (SubLObject)parsing_macros.NIL)), (SubLObject)ConsesLow.listS((SubLObject)parsing_macros.$sym9$CSETQ, timed_outP, (SubLObject)parsing_macros.$list10));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)parsing_macros.$list0);
        return (SubLObject)parsing_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 1976L)
    public static SubLObject possibly_with_parsing_timeout(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parsing_macros.$list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject delay_in_seconds = (SubLObject)parsing_macros.NIL;
        SubLObject timed_outP = (SubLObject)parsing_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parsing_macros.$list0);
        delay_in_seconds = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parsing_macros.$list0);
        timed_outP = current.first();
        current = current.rest();
        if (parsing_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)parsing_macros.$sym11$PIF, delay_in_seconds, (SubLObject)ConsesLow.listS((SubLObject)parsing_macros.$sym12$WITH_PARSING_TIMEOUT, (SubLObject)ConsesLow.list(delay_in_seconds, timed_outP), ConsesLow.append(body, (SubLObject)parsing_macros.NIL)), reader.bq_cons((SubLObject)parsing_macros.$sym13$PROGN, ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)parsing_macros.$sym9$CSETQ, timed_outP, (SubLObject)parsing_macros.$list14)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)parsing_macros.$list0);
        return (SubLObject)parsing_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 2222L)
    public static SubLObject parsing_timeout_time_reachedP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!parsing_macros.$parsing_timeout_time$.getDynamicValue(thread).isNumber()) {
            return (SubLObject)parsing_macros.NIL;
        }
        if (parsing_macros.NIL != parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread)) {
            return (SubLObject)parsing_macros.T;
        }
        if (parsing_timeout_current_time().numGE(parsing_macros.$parsing_timeout_time$.getDynamicValue(thread))) {
            parsing_macros.$parsing_timeout_reachedP$.setDynamicValue((SubLObject)parsing_macros.T, thread);
            return (SubLObject)parsing_macros.T;
        }
        return (SubLObject)parsing_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 2574L)
    public static SubLObject parsing_timeout_time_passed_by() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (parsing_macros.NIL != parsing_timeout_time_reachedP()) {
            return Numbers.subtract(parsing_timeout_current_time(), parsing_macros.$parsing_timeout_time$.getDynamicValue(thread));
        }
        return (SubLObject)parsing_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 2836L)
    public static SubLObject parsing_timeout_time_remaining() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!parsing_macros.$parsing_timeout_time$.getDynamicValue(thread).isNumber()) {
            return (SubLObject)parsing_macros.NIL;
        }
        if (parsing_macros.NIL != parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread)) {
            return (SubLObject)parsing_macros.ZERO_INTEGER;
        }
        final SubLObject computed = Numbers.subtract(parsing_macros.$parsing_timeout_time$.getDynamicValue(thread), parsing_timeout_current_time());
        if (parsing_macros.NIL == number_utilities.positive_number_p(computed)) {
            parsing_macros.$parsing_timeout_reachedP$.setDynamicValue((SubLObject)parsing_macros.T, thread);
        }
        return (SubLObject)((parsing_macros.NIL != parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread)) ? parsing_macros.ZERO_INTEGER : Numbers.divide(computed, time_high.$internal_time_units_per_second$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 3336L)
    public static SubLObject parsing_timeout_current_time() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        parsing_macros.$parsing_timeout_time_check_count$.setDynamicValue(Numbers.add(parsing_macros.$parsing_timeout_time_check_count$.getDynamicValue(thread), (SubLObject)parsing_macros.ONE_INTEGER), thread);
        return Time.get_internal_real_time();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 3465L)
    public static SubLObject parsing_compute_timeout_time(final SubLObject delay_in_seconds) {
        final SubLObject current_time = parsing_timeout_current_time();
        final SubLObject offset = Numbers.floor(Numbers.multiply(delay_in_seconds, time_high.$internal_time_units_per_second$.getGlobalValue()), (SubLObject)parsing_macros.UNPROVIDED);
        return Numbers.add(current_time, offset);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 3732L)
    public static SubLObject with_psp_chart(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject chart_form = (SubLObject)parsing_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parsing_macros.$list15);
        chart_form = current.first();
        final SubLObject body;
        current = (body = current.rest());
        final SubLObject chart = (SubLObject)parsing_macros.$sym16$CHART;
        return (SubLObject)ConsesLow.list((SubLObject)parsing_macros.$sym1$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(chart, chart_form)), (SubLObject)ConsesLow.list((SubLObject)parsing_macros.$sym17$WITH_MEMOIZATION_STATE, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)parsing_macros.$sym18$PSP_CHART_MEMOIZATION_STATE, chart)), (SubLObject)ConsesLow.listS((SubLObject)parsing_macros.$sym1$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)parsing_macros.$sym19$_PSP_CHART_, chart)), ConsesLow.append(body, (SubLObject)parsing_macros.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 4091L)
    public static SubLObject with_psp_chart_for_string(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parsing_macros.$list20);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject input_string = (SubLObject)parsing_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parsing_macros.$list20);
        input_string = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)parsing_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)parsing_macros.NIL;
        SubLObject current_$1 = (SubLObject)parsing_macros.NIL;
        while (parsing_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)parsing_macros.$list20);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)parsing_macros.$list20);
            if (parsing_macros.NIL == conses_high.member(current_$1, (SubLObject)parsing_macros.$list21, (SubLObject)parsing_macros.UNPROVIDED, (SubLObject)parsing_macros.UNPROVIDED)) {
                bad = (SubLObject)parsing_macros.T;
            }
            if (current_$1 == parsing_macros.$kw22$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (parsing_macros.NIL != bad && parsing_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)parsing_macros.$list20);
        }
        final SubLObject gap_type_tail = cdestructuring_bind.property_list_member((SubLObject)parsing_macros.$kw23$GAP_TYPE, current);
        final SubLObject gap_type = (SubLObject)((parsing_macros.NIL != gap_type_tail) ? conses_high.cadr(gap_type_tail) : parsing_macros.$kw24$NONE);
        final SubLObject body;
        current = (body = temp);
        final SubLObject start_index = (SubLObject)parsing_macros.$sym25$START_INDEX;
        final SubLObject end_index = (SubLObject)parsing_macros.$sym26$END_INDEX;
        final SubLObject chart = (SubLObject)parsing_macros.$sym27$CHART;
        return (SubLObject)ConsesLow.list((SubLObject)parsing_macros.$sym1$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(start_index, (SubLObject)parsing_macros.$list14), reader.bq_cons(end_index, (SubLObject)parsing_macros.$list14), reader.bq_cons(chart, (SubLObject)parsing_macros.$list14)), (SubLObject)ConsesLow.list((SubLObject)parsing_macros.$sym28$PWHEN, (SubLObject)ConsesLow.list((SubLObject)parsing_macros.$sym29$COR, (SubLObject)parsing_macros.$list30, (SubLObject)ConsesLow.list((SubLObject)parsing_macros.$sym31$PSP_CHART_MATCHES_GAP_TYPE_P, (SubLObject)parsing_macros.$sym19$_PSP_CHART_, gap_type)), (SubLObject)ConsesLow.list((SubLObject)parsing_macros.$sym32$CMULTIPLE_VALUE_SETQ, (SubLObject)ConsesLow.list(start_index, end_index, chart), (SubLObject)ConsesLow.listS((SubLObject)parsing_macros.$sym33$PSP_FIND_STRING_IN_CHARTS, input_string, (SubLObject)parsing_macros.$list34))), (SubLObject)ConsesLow.list((SubLObject)parsing_macros.$sym11$PIF, start_index, (SubLObject)ConsesLow.listS((SubLObject)parsing_macros.$sym1$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)parsing_macros.$sym35$_PSP_CHART_START_INDEX_, start_index), (SubLObject)ConsesLow.list((SubLObject)parsing_macros.$sym36$_PSP_CHART_END_INDEX_, end_index), (SubLObject)ConsesLow.list((SubLObject)parsing_macros.$sym19$_PSP_CHART_, chart)), (SubLObject)ConsesLow.list((SubLObject)parsing_macros.$sym37$PSP_CHART_DO_SYNTACTIC_PARSING, chart), ConsesLow.append(body, (SubLObject)parsing_macros.NIL)), (SubLObject)ConsesLow.list((SubLObject)parsing_macros.$sym1$CLET, (SubLObject)parsing_macros.$list38, (SubLObject)ConsesLow.listS((SubLObject)parsing_macros.$sym39$WITH_PSP_CHART, (SubLObject)ConsesLow.list((SubLObject)parsing_macros.$sym40$PSP_CHART_FOR_STRING, input_string, (SubLObject)parsing_macros.$list41, gap_type), ConsesLow.append(body, (SubLObject)parsing_macros.$list42)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 5070L)
    public static SubLObject get_psp_lexicon() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (parsing_macros.NIL != misc_utilities.initialized_p(parsing_vars.$psp_lexicon$.getDynamicValue(thread))) ? parsing_vars.$psp_lexicon$.getDynamicValue(thread) : psp_lexicon.get_default_psp_lexicon((SubLObject)parsing_macros.UNPROVIDED, (SubLObject)parsing_macros.UNPROVIDED, (SubLObject)parsing_macros.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 5243L)
    public static SubLObject psp_chart_matches_gap_type_p(final SubLObject chart, final SubLObject gap_type) {
        return (SubLObject)SubLObjectFactory.makeBoolean(parsing_macros.NIL != psp_chart.phrase_structure_parser_chart_p(chart) && psp_chart.psp_chart_gap_type(chart).equal(gap_type));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 5454L)
    public static SubLObject with_extra_psp_charts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parsing_macros.$list45);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject charts = (SubLObject)parsing_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parsing_macros.$list45);
        charts = current.first();
        current = current.rest();
        if (parsing_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)parsing_macros.$sym1$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)parsing_macros.$sym46$_PSP_EXTRA_CHARTS_, charts)), ConsesLow.append(body, (SubLObject)parsing_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)parsing_macros.$list45);
        return (SubLObject)parsing_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 5577L)
    public static SubLObject with_psp_lexicon_mt_relevance(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)parsing_macros.$sym47$WITH_INFERENCE_MT_RELEVANCE, (SubLObject)parsing_macros.$list48, ConsesLow.append(body, (SubLObject)parsing_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 5713L)
    public static SubLObject psp_edge_do_dtrs(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parsing_macros.$list49);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject dtr = (SubLObject)parsing_macros.NIL;
        SubLObject edge = (SubLObject)parsing_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parsing_macros.$list49);
        dtr = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parsing_macros.$list49);
        edge = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)parsing_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)parsing_macros.NIL;
        SubLObject current_$2 = (SubLObject)parsing_macros.NIL;
        while (parsing_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)parsing_macros.$list49);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)parsing_macros.$list49);
            if (parsing_macros.NIL == conses_high.member(current_$2, (SubLObject)parsing_macros.$list50, (SubLObject)parsing_macros.UNPROVIDED, (SubLObject)parsing_macros.UNPROVIDED)) {
                bad = (SubLObject)parsing_macros.T;
            }
            if (current_$2 == parsing_macros.$kw22$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (parsing_macros.NIL != bad && parsing_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)parsing_macros.$list49);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)parsing_macros.$kw51$DONE, current);
        final SubLObject done = (SubLObject)((parsing_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : parsing_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)parsing_macros.$sym52$CSOME, (SubLObject)ConsesLow.list(dtr, (SubLObject)ConsesLow.list((SubLObject)parsing_macros.$sym53$PSP_EDGE_DTRS, edge), done), ConsesLow.append(body, (SubLObject)parsing_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 5848L)
    public static SubLObject psp_edge_do_dtrs_numbered(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parsing_macros.$list54);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject dtr = (SubLObject)parsing_macros.NIL;
        SubLObject dtr_num = (SubLObject)parsing_macros.NIL;
        SubLObject edge = (SubLObject)parsing_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parsing_macros.$list54);
        dtr = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parsing_macros.$list54);
        dtr_num = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parsing_macros.$list54);
        edge = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)parsing_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)parsing_macros.NIL;
        SubLObject current_$3 = (SubLObject)parsing_macros.NIL;
        while (parsing_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)parsing_macros.$list54);
            current_$3 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)parsing_macros.$list54);
            if (parsing_macros.NIL == conses_high.member(current_$3, (SubLObject)parsing_macros.$list50, (SubLObject)parsing_macros.UNPROVIDED, (SubLObject)parsing_macros.UNPROVIDED)) {
                bad = (SubLObject)parsing_macros.T;
            }
            if (current_$3 == parsing_macros.$kw22$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (parsing_macros.NIL != bad && parsing_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)parsing_macros.$list54);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)parsing_macros.$kw51$DONE, current);
        final SubLObject done = (SubLObject)((parsing_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : parsing_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject i = (SubLObject)parsing_macros.$sym55$I;
        return (SubLObject)ConsesLow.list((SubLObject)parsing_macros.$sym56$CSOME_NUMBERED, (SubLObject)ConsesLow.list(dtr, i, (SubLObject)ConsesLow.list((SubLObject)parsing_macros.$sym53$PSP_EDGE_DTRS, edge), done), (SubLObject)ConsesLow.listS((SubLObject)parsing_macros.$sym1$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(dtr_num, (SubLObject)ConsesLow.list((SubLObject)parsing_macros.$sym57$1_, i))), ConsesLow.append(body, (SubLObject)parsing_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 6222L)
    public static SubLObject with_psp_sbhl_resourcing(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)parsing_macros.$sym58$WITH_SBHL_RESOURCED_MARKING_SPACES, (SubLObject)parsing_macros.$sym59$_PSP_SBHL_RESOURCING_LIMIT_, ConsesLow.append(body, (SubLObject)parsing_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 6366L)
    public static SubLObject with_parser_blacklist(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject blacklist = (SubLObject)parsing_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parsing_macros.$list60);
        blacklist = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)parsing_macros.$sym13$PROGN, (SubLObject)ConsesLow.listS((SubLObject)parsing_macros.$sym61$CHECK_TYPE, blacklist, (SubLObject)parsing_macros.$list62), (SubLObject)ConsesLow.listS((SubLObject)parsing_macros.$sym1$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)parsing_macros.$sym63$_PARSER_CYCL_BLACKLIST_, blacklist)), ConsesLow.append(body, (SubLObject)parsing_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 6608L)
    public static SubLObject with_pos_pred_parse_filter(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)parsing_macros.$sym1$CLET, (SubLObject)parsing_macros.$list64, ConsesLow.append(body, (SubLObject)parsing_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 6758L)
    public static SubLObject define_psp_interface_helper(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)parsing_macros.NIL;
        SubLObject edge_set_args = (SubLObject)parsing_macros.NIL;
        SubLObject edge_set_fn_def = (SubLObject)parsing_macros.NIL;
        SubLObject edge_cycls_fn_def = (SubLObject)parsing_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parsing_macros.$list65);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parsing_macros.$list65);
        edge_set_args = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parsing_macros.$list65);
        edge_set_fn_def = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parsing_macros.$list65);
        edge_cycls_fn_def = current.first();
        current = current.rest();
        if (parsing_macros.NIL == current) {
            final SubLObject environment_$4 = (SubLObject)parsing_macros.$sym66$ENVIRONMENT;
            final SubLObject string = (SubLObject)parsing_macros.$sym67$STRING;
            final SubLObject best = (SubLObject)parsing_macros.$sym68$BEST;
            final SubLObject rest = (SubLObject)parsing_macros.$sym69$REST;
            final SubLObject edge = (SubLObject)parsing_macros.$sym70$EDGE;
            final SubLObject edge_sets = (SubLObject)parsing_macros.$sym71$EDGE_SETS;
            final SubLObject basic_arg_list = (SubLObject)ConsesLow.cons(string, edge_set_args);
            final SubLObject full_arg_list = ConsesLow.append(basic_arg_list, (SubLObject)ConsesLow.list((SubLObject)parsing_macros.$sym72$_OPTIONAL, reader.bq_cons(environment_$4, (SubLObject)parsing_macros.$list73)));
            final SubLObject cached_fn = Packages.intern(Sequences.cconcatenate(Symbols.symbol_name(name), (SubLObject)parsing_macros.$str74$_CACHED), (SubLObject)parsing_macros.UNPROVIDED);
            final SubLObject clearer = Packages.intern(Sequences.cconcatenate((SubLObject)parsing_macros.$str75$CLEAR_, Symbols.symbol_name(cached_fn)), (SubLObject)parsing_macros.UNPROVIDED);
            final SubLObject cached_internal_fn = Packages.intern(Sequences.cconcatenate(Symbols.symbol_name(name), (SubLObject)parsing_macros.$str76$_CACHED_INTERNAL), (SubLObject)parsing_macros.UNPROVIDED);
            final SubLObject edge_set_fn = Packages.intern(Sequences.cconcatenate(Symbols.symbol_name(name), (SubLObject)parsing_macros.$str77$_EDGE_SETS), (SubLObject)parsing_macros.UNPROVIDED);
            final SubLObject edge_cycls_fn = Packages.intern(Sequences.cconcatenate(Symbols.symbol_name(name), (SubLObject)parsing_macros.$str78$_EDGE_CYCLS), (SubLObject)parsing_macros.UNPROVIDED);
            final SubLObject item_var = clearer;
            if (parsing_macros.NIL == conses_high.member(item_var, parsing_vars.$psp_cached_interface_helper_clearing_functions$.getGlobalValue(), Symbols.symbol_function((SubLObject)parsing_macros.EQL), Symbols.symbol_function((SubLObject)parsing_macros.IDENTITY))) {
                parsing_vars.$psp_cached_interface_helper_clearing_functions$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, parsing_vars.$psp_cached_interface_helper_clearing_functions$.getGlobalValue()));
            }
            return (SubLObject)ConsesLow.list((SubLObject)parsing_macros.$sym13$PROGN, (SubLObject)ConsesLow.list((SubLObject)parsing_macros.$sym79$DECLAIM, (SubLObject)ConsesLow.list((SubLObject)parsing_macros.$sym80$FACCESS, (SubLObject)parsing_macros.$sym81$PRIVATE, name, cached_fn, cached_internal_fn)), (SubLObject)ConsesLow.list((SubLObject)parsing_macros.$sym82$DEFINE_CACHED_NEW, cached_fn, full_arg_list, (SubLObject)parsing_macros.$list83, (SubLObject)ConsesLow.list((SubLObject)parsing_macros.$sym84$IGNORE, environment_$4), (SubLObject)ConsesLow.list((SubLObject)parsing_macros.$sym1$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(best, (SubLObject)parsing_macros.$list14), reader.bq_cons(rest, (SubLObject)parsing_macros.$list14)), (SubLObject)ConsesLow.list((SubLObject)parsing_macros.$sym44$WITH_PSP_CHART_FOR_STRING, reader.bq_cons(string, (SubLObject)parsing_macros.$list85), (SubLObject)ConsesLow.list((SubLObject)parsing_macros.$sym1$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(edge_sets, reader.bq_cons(edge_set_fn, edge_set_args))), (SubLObject)ConsesLow.list((SubLObject)parsing_macros.$sym28$PWHEN, (SubLObject)ConsesLow.list((SubLObject)parsing_macros.$sym86$CAND, (SubLObject)parsing_macros.$sym87$_REIFY_PARSE_NODES__, edge_sets), (SubLObject)ConsesLow.list((SubLObject)parsing_macros.$sym88$SET_PARSE_ROOT_NODE, (SubLObject)ConsesLow.list((SubLObject)parsing_macros.$sym89$PSP_FIND_OR_CREATE_NODE_FOR_EDGES, (SubLObject)ConsesLow.listS((SubLObject)parsing_macros.$sym90$SET_UNION, edge_sets, (SubLObject)parsing_macros.$list91)))), (SubLObject)ConsesLow.list((SubLObject)parsing_macros.$sym92$PSP_ACCUMULATE_ANSWERS, (SubLObject)ConsesLow.list(edge, edge_sets, best, rest), (SubLObject)ConsesLow.list(edge_cycls_fn, edge)))), (SubLObject)ConsesLow.list((SubLObject)parsing_macros.$sym93$RET, (SubLObject)ConsesLow.list((SubLObject)parsing_macros.$sym94$VALUES, best, rest)))), (SubLObject)ConsesLow.list((SubLObject)parsing_macros.$sym95$DEFINE, name, basic_arg_list, (SubLObject)ConsesLow.list((SubLObject)parsing_macros.$sym11$PIF, (SubLObject)parsing_macros.$list96, (SubLObject)ConsesLow.list((SubLObject)parsing_macros.$sym93$RET, reader.bq_cons(cached_internal_fn, ConsesLow.append(basic_arg_list, (SubLObject)ConsesLow.list((SubLObject)parsing_macros.$list97)))), (SubLObject)ConsesLow.list((SubLObject)parsing_macros.$sym93$RET, reader.bq_cons(cached_fn, basic_arg_list)))), (SubLObject)ConsesLow.list((SubLObject)parsing_macros.$sym98$DEFINE_PRIVATE, edge_set_fn, edge_set_args, edge_set_fn_def), (SubLObject)ConsesLow.list((SubLObject)parsing_macros.$sym98$DEFINE_PRIVATE, edge_cycls_fn, (SubLObject)parsing_macros.$list99, (SubLObject)ConsesLow.listS((SubLObject)parsing_macros.$sym1$CLET, (SubLObject)parsing_macros.$list100, (SubLObject)ConsesLow.list((SubLObject)parsing_macros.$sym101$WITH_PSP_SBHL_RESOURCING, edge_cycls_fn_def), (SubLObject)parsing_macros.$list102)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)parsing_macros.$list65);
        return (SubLObject)parsing_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 9117L)
    public static SubLObject set_parse_root_node(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        parsing_vars.$parse_root_node$.setDynamicValue(node, thread);
        return parsing_vars.$parse_root_node$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 9265L)
    public static SubLObject bypass_psp_cachesP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(parsing_macros.NIL != parsing_vars.$reify_parse_nodesP$.getDynamicValue(thread) || parsing_macros.NIL != parsing_vars.$bypass_psp_cachesP$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 9410L)
    public static SubLObject setting_parse_root_node(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parsing_macros.$list105);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject root_var = (SubLObject)parsing_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parsing_macros.$list105);
        root_var = current.first();
        current = current.rest();
        if (parsing_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)parsing_macros.$sym1$CLET, (SubLObject)ConsesLow.list((SubLObject)parsing_macros.$list106, (SubLObject)ConsesLow.list((SubLObject)parsing_macros.$sym87$_REIFY_PARSE_NODES__, (SubLObject)ConsesLow.list((SubLObject)parsing_macros.$sym107$BOUNDP, root_var))), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)parsing_macros.$sym9$CSETQ, root_var, (SubLObject)parsing_macros.$list108))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)parsing_macros.$list105);
        return (SubLObject)parsing_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 9734L)
    public static SubLObject with_new_variable_uniquification_state(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)parsing_macros.$sym1$CLET, (SubLObject)parsing_macros.$list109, ConsesLow.append(body, (SubLObject)parsing_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 9896L)
    public static SubLObject psp_promoting_nl_tags(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parsing_macros.$list110);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject from_psp_cycl = (SubLObject)parsing_macros.NIL;
        SubLObject to_psp_cycl = (SubLObject)parsing_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parsing_macros.$list110);
        from_psp_cycl = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parsing_macros.$list110);
        to_psp_cycl = current.first();
        current = current.rest();
        if (parsing_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject nl_tag_templates = (SubLObject)parsing_macros.$sym111$NL_TAG_TEMPLATES;
            return (SubLObject)ConsesLow.listS((SubLObject)parsing_macros.$sym1$CLET, (SubLObject)ConsesLow.list(nl_tag_templates), (SubLObject)ConsesLow.list((SubLObject)parsing_macros.$sym32$CMULTIPLE_VALUE_SETQ, (SubLObject)ConsesLow.list(from_psp_cycl, nl_tag_templates), (SubLObject)ConsesLow.list((SubLObject)parsing_macros.$sym112$PSP_STRIP_AND_REMEMBER_NL_TAGS, from_psp_cycl)), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)parsing_macros.$sym9$CSETQ, to_psp_cycl, (SubLObject)ConsesLow.list((SubLObject)parsing_macros.$sym113$PSP_ADD_NL_TAG_TEMPLATES, to_psp_cycl, nl_tag_templates)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)parsing_macros.$list110);
        return (SubLObject)parsing_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 10400L)
    public static SubLObject psp_strip_and_remember_nl_tags(final SubLObject psp_cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (parsing_macros.NIL != psp_semantics.psp_weighted_cycl_p(psp_cycl)) {
            final SubLObject cycl = psp_semantics.psp_cycl_cycl(psp_cycl);
            thread.resetMultipleValues();
            final SubLObject stripped = parsing_utilities.strip_nl_tags_top_level(cycl);
            final SubLObject nl_tag_templates = thread.secondMultipleValue();
            thread.resetMultipleValues();
            psp_semantics.psp_weighted_cycl_set_cycl(psp_cycl, stripped);
            return Values.values(psp_cycl, nl_tag_templates);
        }
        return parsing_utilities.strip_nl_tags_top_level(psp_cycl);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 10819L)
    public static SubLObject psp_add_nl_tag_templates(SubLObject psp_cycl, final SubLObject nl_tag_templates) {
        SubLObject cdolist_list_var = nl_tag_templates;
        SubLObject nl_tag_template = (SubLObject)parsing_macros.NIL;
        nl_tag_template = cdolist_list_var.first();
        while (parsing_macros.NIL != cdolist_list_var) {
            psp_cycl = psp_add_nl_tag_template(psp_cycl, nl_tag_template);
            cdolist_list_var = cdolist_list_var.rest();
            nl_tag_template = cdolist_list_var.first();
        }
        return psp_cycl;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 11064L)
    public static SubLObject psp_add_nl_tag_template(final SubLObject psp_cycl, final SubLObject nl_tag_template) {
        if (parsing_macros.NIL != psp_semantics.psp_weighted_cycl_p(psp_cycl)) {
            final SubLObject cycl = psp_semantics.psp_cycl_cycl(psp_cycl);
            final SubLObject replaced = psp_add_nl_tag_template(cycl, nl_tag_template);
            psp_semantics.psp_weighted_cycl_set_cycl(psp_cycl, replaced);
            return psp_cycl;
        }
        return parsing_utilities.add_nl_tag_template(psp_cycl, nl_tag_template);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 11411L)
    public static SubLObject with_speaker_referent(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject referent = (SubLObject)parsing_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parsing_macros.$list115);
        referent = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)parsing_macros.$sym1$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)parsing_macros.$sym116$_SPEAKER_REFERENT_, referent)), ConsesLow.append(body, (SubLObject)parsing_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 11610L)
    public static SubLObject with_new_ncs_using_stringsP(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject new_string_based_ncsP = (SubLObject)parsing_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parsing_macros.$list117);
        new_string_based_ncsP = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)parsing_macros.$sym1$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)parsing_macros.$sym118$_NPP_USE_STRINGS_FOR_SEMANTICS__, new_string_based_ncsP)), ConsesLow.append(body, (SubLObject)parsing_macros.NIL));
    }
    
    public static SubLObject declare_parsing_macros_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.parsing_macros", "with_parsing_timeout", "WITH-PARSING-TIMEOUT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.parsing_macros", "possibly_with_parsing_timeout", "POSSIBLY-WITH-PARSING-TIMEOUT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_macros", "parsing_timeout_time_reachedP", "PARSING-TIMEOUT-TIME-REACHED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_macros", "parsing_timeout_time_passed_by", "PARSING-TIMEOUT-TIME-PASSED-BY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_macros", "parsing_timeout_time_remaining", "PARSING-TIMEOUT-TIME-REMAINING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_macros", "parsing_timeout_current_time", "PARSING-TIMEOUT-CURRENT-TIME", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_macros", "parsing_compute_timeout_time", "PARSING-COMPUTE-TIMEOUT-TIME", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.parsing_macros", "with_psp_chart", "WITH-PSP-CHART");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.parsing_macros", "with_psp_chart_for_string", "WITH-PSP-CHART-FOR-STRING");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_macros", "get_psp_lexicon", "GET-PSP-LEXICON", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_macros", "psp_chart_matches_gap_type_p", "PSP-CHART-MATCHES-GAP-TYPE-P", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.parsing_macros", "with_extra_psp_charts", "WITH-EXTRA-PSP-CHARTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.parsing_macros", "with_psp_lexicon_mt_relevance", "WITH-PSP-LEXICON-MT-RELEVANCE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.parsing_macros", "psp_edge_do_dtrs", "PSP-EDGE-DO-DTRS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.parsing_macros", "psp_edge_do_dtrs_numbered", "PSP-EDGE-DO-DTRS-NUMBERED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.parsing_macros", "with_psp_sbhl_resourcing", "WITH-PSP-SBHL-RESOURCING");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.parsing_macros", "with_parser_blacklist", "WITH-PARSER-BLACKLIST");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.parsing_macros", "with_pos_pred_parse_filter", "WITH-POS-PRED-PARSE-FILTER");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.parsing_macros", "define_psp_interface_helper", "DEFINE-PSP-INTERFACE-HELPER");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_macros", "set_parse_root_node", "SET-PARSE-ROOT-NODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_macros", "bypass_psp_cachesP", "BYPASS-PSP-CACHES?", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.parsing_macros", "setting_parse_root_node", "SETTING-PARSE-ROOT-NODE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.parsing_macros", "with_new_variable_uniquification_state", "WITH-NEW-VARIABLE-UNIQUIFICATION-STATE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.parsing_macros", "psp_promoting_nl_tags", "PSP-PROMOTING-NL-TAGS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_macros", "psp_strip_and_remember_nl_tags", "PSP-STRIP-AND-REMEMBER-NL-TAGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_macros", "psp_add_nl_tag_templates", "PSP-ADD-NL-TAG-TEMPLATES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.parsing_macros", "psp_add_nl_tag_template", "PSP-ADD-NL-TAG-TEMPLATE", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.parsing_macros", "with_speaker_referent", "WITH-SPEAKER-REFERENT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.parsing_macros", "with_new_ncs_using_stringsP", "WITH-NEW-NCS-USING-STRINGS?");
        return (SubLObject)parsing_macros.NIL;
    }
    
    public static SubLObject init_parsing_macros_file() {
        parsing_macros.$parsing_timeout_time$ = SubLFiles.defparameter("*PARSING-TIMEOUT-TIME*", (SubLObject)parsing_macros.NIL);
        parsing_macros.$parsing_timeout_reachedP$ = SubLFiles.defparameter("*PARSING-TIMEOUT-REACHED?*", (SubLObject)parsing_macros.NIL);
        parsing_macros.$parsing_timeout_time_check_count$ = SubLFiles.defparameter("*PARSING-TIMEOUT-TIME-CHECK-COUNT*", (SubLObject)parsing_macros.ZERO_INTEGER);
        parsing_macros.$psp_sbhl_resourcing_limit$ = SubLFiles.defconstant("*PSP-SBHL-RESOURCING-LIMIT*", (SubLObject)parsing_macros.SIX_INTEGER);
        return (SubLObject)parsing_macros.NIL;
    }
    
    public static SubLObject setup_parsing_macros_file() {
        access_macros.register_macro_helper((SubLObject)parsing_macros.$sym4$PARSING_COMPUTE_TIMEOUT_TIME, (SubLObject)parsing_macros.$sym12$WITH_PARSING_TIMEOUT);
        access_macros.register_macro_helper((SubLObject)parsing_macros.$sym43$GET_PSP_LEXICON, (SubLObject)parsing_macros.$sym44$WITH_PSP_CHART_FOR_STRING);
        access_macros.register_macro_helper((SubLObject)parsing_macros.$sym31$PSP_CHART_MATCHES_GAP_TYPE_P, (SubLObject)parsing_macros.$sym44$WITH_PSP_CHART_FOR_STRING);
        access_macros.register_macro_helper((SubLObject)parsing_macros.$sym88$SET_PARSE_ROOT_NODE, (SubLObject)parsing_macros.$sym103$DEFINE_PSP_INTERFACE_HELPER);
        access_macros.register_macro_helper((SubLObject)parsing_macros.$sym104$BYPASS_PSP_CACHES_, (SubLObject)parsing_macros.$sym103$DEFINE_PSP_INTERFACE_HELPER);
        access_macros.register_macro_helper((SubLObject)parsing_macros.$sym112$PSP_STRIP_AND_REMEMBER_NL_TAGS, (SubLObject)parsing_macros.$sym114$PSP_PROMOTING_NL_TAGS);
        access_macros.register_macro_helper((SubLObject)parsing_macros.$sym113$PSP_ADD_NL_TAG_TEMPLATES, (SubLObject)parsing_macros.$sym114$PSP_PROMOTING_NL_TAGS);
        return (SubLObject)parsing_macros.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_parsing_macros_file();
    }
    
    @Override
	public void initializeVariables() {
        init_parsing_macros_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_parsing_macros_file();
    }
    
    static {
        me = (SubLFile)new parsing_macros();
        parsing_macros.$parsing_timeout_time$ = null;
        parsing_macros.$parsing_timeout_reachedP$ = null;
        parsing_macros.$parsing_timeout_time_check_count$ = null;
        parsing_macros.$psp_sbhl_resourcing_limit$ = null;
        $list0 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DELAY-IN-SECONDS"), (SubLObject)SubLObjectFactory.makeSymbol("TIMED-OUT?")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym1$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PARSING-TIMEOUT-TIME-CHECK-COUNT*"), (SubLObject)parsing_macros.ZERO_INTEGER);
        $sym3$_PARSING_TIMEOUT_TIME_ = SubLObjectFactory.makeSymbol("*PARSING-TIMEOUT-TIME*");
        $sym4$PARSING_COMPUTE_TIMEOUT_TIME = SubLObjectFactory.makeSymbol("PARSING-COMPUTE-TIMEOUT-TIME");
        $list5 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PARSING-TIMEOUT-REACHED?*"), (SubLObject)SubLObjectFactory.makeSymbol("*PARSING-TIMEOUT-REACHED?*")));
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("*PARSING-TIMEOUT-REACHED?*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARSING-TIMEOUT-TIME-REACHED?")));
        $sym7$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $sym8$_PARSING_TIMEOUT_REACHED__ = SubLObjectFactory.makeSymbol("*PARSING-TIMEOUT-REACHED?*");
        $sym9$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $list10 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARSING-TIMEOUT-TIME-REACHED?")));
        $sym11$PIF = SubLObjectFactory.makeSymbol("PIF");
        $sym12$WITH_PARSING_TIMEOUT = SubLObjectFactory.makeSymbol("WITH-PARSING-TIMEOUT");
        $sym13$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $list14 = ConsesLow.list((SubLObject)parsing_macros.NIL);
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHART-FORM"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym16$CHART = SubLObjectFactory.makeUninternedSymbol("CHART");
        $sym17$WITH_MEMOIZATION_STATE = SubLObjectFactory.makeSymbol("WITH-MEMOIZATION-STATE");
        $sym18$PSP_CHART_MEMOIZATION_STATE = SubLObjectFactory.makeSymbol("PSP-CHART-MEMOIZATION-STATE");
        $sym19$_PSP_CHART_ = SubLObjectFactory.makeSymbol("*PSP-CHART*");
        $list20 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INPUT-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GAP-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("NONE"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list21 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("GAP-TYPE"));
        $kw22$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw23$GAP_TYPE = SubLObjectFactory.makeKeyword("GAP-TYPE");
        $kw24$NONE = SubLObjectFactory.makeKeyword("NONE");
        $sym25$START_INDEX = SubLObjectFactory.makeUninternedSymbol("START-INDEX");
        $sym26$END_INDEX = SubLObjectFactory.makeUninternedSymbol("END-INDEX");
        $sym27$CHART = SubLObjectFactory.makeUninternedSymbol("CHART");
        $sym28$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym29$COR = SubLObjectFactory.makeSymbol("COR");
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("*PSP-CHART*"));
        $sym31$PSP_CHART_MATCHES_GAP_TYPE_P = SubLObjectFactory.makeSymbol("PSP-CHART-MATCHES-GAP-TYPE-P");
        $sym32$CMULTIPLE_VALUE_SETQ = SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-SETQ");
        $sym33$PSP_FIND_STRING_IN_CHARTS = SubLObjectFactory.makeSymbol("PSP-FIND-STRING-IN-CHARTS");
        $list34 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PSP-CHART*"), (SubLObject)SubLObjectFactory.makeSymbol("*PSP-EXTRA-CHARTS*"));
        $sym35$_PSP_CHART_START_INDEX_ = SubLObjectFactory.makeSymbol("*PSP-CHART-START-INDEX*");
        $sym36$_PSP_CHART_END_INDEX_ = SubLObjectFactory.makeSymbol("*PSP-CHART-END-INDEX*");
        $sym37$PSP_CHART_DO_SYNTACTIC_PARSING = SubLObjectFactory.makeSymbol("PSP-CHART-DO-SYNTACTIC-PARSING");
        $list38 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PSP-CHART-START-INDEX*"), (SubLObject)parsing_macros.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PSP-CHART-END-INDEX*"), (SubLObject)parsing_macros.NIL));
        $sym39$WITH_PSP_CHART = SubLObjectFactory.makeSymbol("WITH-PSP-CHART");
        $sym40$PSP_CHART_FOR_STRING = SubLObjectFactory.makeSymbol("PSP-CHART-FOR-STRING");
        $list41 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-PSP-LEXICON"));
        $list42 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("*PSP-DONT-DESTROY-CHART?*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DESTROY-PSP-CHART"))));
        $sym43$GET_PSP_LEXICON = SubLObjectFactory.makeSymbol("GET-PSP-LEXICON");
        $sym44$WITH_PSP_CHART_FOR_STRING = SubLObjectFactory.makeSymbol("WITH-PSP-CHART-FOR-STRING");
        $list45 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHARTS")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym46$_PSP_EXTRA_CHARTS_ = SubLObjectFactory.makeSymbol("*PSP-EXTRA-CHARTS*");
        $sym47$WITH_INFERENCE_MT_RELEVANCE = SubLObjectFactory.makeSymbol("WITH-INFERENCE-MT-RELEVANCE");
        $list48 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PSP-LEXICON-ROOT-MT"));
        $list49 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DTR"), (SubLObject)SubLObjectFactory.makeSymbol("EDGE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list50 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw51$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym52$CSOME = SubLObjectFactory.makeSymbol("CSOME");
        $sym53$PSP_EDGE_DTRS = SubLObjectFactory.makeSymbol("PSP-EDGE-DTRS");
        $list54 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DTR"), (SubLObject)SubLObjectFactory.makeSymbol("DTR-NUM"), (SubLObject)SubLObjectFactory.makeSymbol("EDGE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym55$I = SubLObjectFactory.makeUninternedSymbol("I");
        $sym56$CSOME_NUMBERED = SubLObjectFactory.makeSymbol("CSOME-NUMBERED");
        $sym57$1_ = SubLObjectFactory.makeSymbol("1+");
        $sym58$WITH_SBHL_RESOURCED_MARKING_SPACES = SubLObjectFactory.makeSymbol("WITH-SBHL-RESOURCED-MARKING-SPACES");
        $sym59$_PSP_SBHL_RESOURCING_LIMIT_ = SubLObjectFactory.makeSymbol("*PSP-SBHL-RESOURCING-LIMIT*");
        $list60 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BLACKLIST"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym61$CHECK_TYPE = SubLObjectFactory.makeSymbol("CHECK-TYPE");
        $list62 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LISTP"));
        $sym63$_PARSER_CYCL_BLACKLIST_ = SubLObjectFactory.makeSymbol("*PARSER-CYCL-BLACKLIST*");
        $list64 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PSP-POS-PRED-FILTER?*"), (SubLObject)parsing_macros.T));
        $list65 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("EDGE-SET-ARGS"), (SubLObject)SubLObjectFactory.makeSymbol("EDGE-SET-FN-DEF"), (SubLObject)SubLObjectFactory.makeSymbol("EDGE-CYCLS-FN-DEF"));
        $sym66$ENVIRONMENT = SubLObjectFactory.makeUninternedSymbol("ENVIRONMENT");
        $sym67$STRING = SubLObjectFactory.makeUninternedSymbol("STRING");
        $sym68$BEST = SubLObjectFactory.makeUninternedSymbol("BEST");
        $sym69$REST = SubLObjectFactory.makeUninternedSymbol("REST");
        $sym70$EDGE = SubLObjectFactory.makeUninternedSymbol("EDGE");
        $sym71$EDGE_SETS = SubLObjectFactory.makeUninternedSymbol("EDGE-SETS");
        $sym72$_OPTIONAL = SubLObjectFactory.makeSymbol("&OPTIONAL");
        $list73 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PSP-ENVIRONMENTAL-STATE")));
        $str74$_CACHED = SubLObjectFactory.makeString("-CACHED");
        $str75$CLEAR_ = SubLObjectFactory.makeString("CLEAR-");
        $str76$_CACHED_INTERNAL = SubLObjectFactory.makeString("-CACHED-INTERNAL");
        $str77$_EDGE_SETS = SubLObjectFactory.makeString("-EDGE-SETS");
        $str78$_EDGE_CYCLS = SubLObjectFactory.makeString("-EDGE-CYCLS");
        $sym79$DECLAIM = SubLObjectFactory.makeSymbol("DECLAIM");
        $sym80$FACCESS = SubLObjectFactory.makeSymbol("FACCESS");
        $sym81$PRIVATE = SubLObjectFactory.makeSymbol("PRIVATE");
        $sym82$DEFINE_CACHED_NEW = SubLObjectFactory.makeSymbol("DEFINE-CACHED-NEW");
        $list83 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SIZE"), (SubLObject)SubLObjectFactory.makeInteger(256), (SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)parsing_macros.EQUAL));
        $sym84$IGNORE = SubLObjectFactory.makeSymbol("IGNORE");
        $list85 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("GAP-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("*PSP-GAP-TYPE-ALLOWED*"));
        $sym86$CAND = SubLObjectFactory.makeSymbol("CAND");
        $sym87$_REIFY_PARSE_NODES__ = SubLObjectFactory.makeSymbol("*REIFY-PARSE-NODES?*");
        $sym88$SET_PARSE_ROOT_NODE = SubLObjectFactory.makeSymbol("SET-PARSE-ROOT-NODE");
        $sym89$PSP_FIND_OR_CREATE_NODE_FOR_EDGES = SubLObjectFactory.makeSymbol("PSP-FIND-OR-CREATE-NODE-FOR-EDGES");
        $sym90$SET_UNION = SubLObjectFactory.makeSymbol("SET-UNION");
        $list91 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)parsing_macros.EQL));
        $sym92$PSP_ACCUMULATE_ANSWERS = SubLObjectFactory.makeSymbol("PSP-ACCUMULATE-ANSWERS");
        $sym93$RET = SubLObjectFactory.makeSymbol("RET");
        $sym94$VALUES = SubLObjectFactory.makeSymbol("VALUES");
        $sym95$DEFINE = SubLObjectFactory.makeSymbol("DEFINE");
        $list96 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BYPASS-PSP-CACHES?"));
        $list97 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PSP-ENVIRONMENTAL-STATE"));
        $sym98$DEFINE_PRIVATE = SubLObjectFactory.makeSymbol("DEFINE-PRIVATE");
        $list99 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EDGE"));
        $list100 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCLS"), (SubLObject)parsing_macros.NIL));
        $sym101$WITH_PSP_SBHL_RESOURCING = SubLObjectFactory.makeSymbol("WITH-PSP-SBHL-RESOURCING");
        $list102 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLS")));
        $sym103$DEFINE_PSP_INTERFACE_HELPER = SubLObjectFactory.makeSymbol("DEFINE-PSP-INTERFACE-HELPER");
        $sym104$BYPASS_PSP_CACHES_ = SubLObjectFactory.makeSymbol("BYPASS-PSP-CACHES?");
        $list105 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ROOT-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list106 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PARSE-ROOT-NODE*"), (SubLObject)parsing_macros.NIL);
        $sym107$BOUNDP = SubLObjectFactory.makeSymbol("BOUNDP");
        $list108 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PARSE-ROOT-NODE*"));
        $list109 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*VARIABLE-UNIQUIFICATION-STORE*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-DICTIONARY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)parsing_macros.EQUALP))));
        $list110 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FROM-PSP-CYCL"), (SubLObject)SubLObjectFactory.makeSymbol("TO-PSP-CYCL")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym111$NL_TAG_TEMPLATES = SubLObjectFactory.makeUninternedSymbol("NL-TAG-TEMPLATES");
        $sym112$PSP_STRIP_AND_REMEMBER_NL_TAGS = SubLObjectFactory.makeSymbol("PSP-STRIP-AND-REMEMBER-NL-TAGS");
        $sym113$PSP_ADD_NL_TAG_TEMPLATES = SubLObjectFactory.makeSymbol("PSP-ADD-NL-TAG-TEMPLATES");
        $sym114$PSP_PROMOTING_NL_TAGS = SubLObjectFactory.makeSymbol("PSP-PROMOTING-NL-TAGS");
        $list115 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REFERENT"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym116$_SPEAKER_REFERENT_ = SubLObjectFactory.makeSymbol("*SPEAKER-REFERENT*");
        $list117 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-STRING-BASED-NCS?"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym118$_NPP_USE_STRINGS_FOR_SEMANTICS__ = SubLObjectFactory.makeSymbol("*NPP-USE-STRINGS-FOR-SEMANTICS?*");
    }
}

/*

	Total time: 195 ms
	
*/