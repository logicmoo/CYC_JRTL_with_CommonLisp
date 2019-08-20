/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.floor;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_term_browser;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      BBN-STRENGTHENING-METRICS
 *  source file: /cyc/top/cycl/bbn-strengthening-metrics.lisp
 *  created:     2019/07/03 17:38:35
 */
public final class bbn_strengthening_metrics extends SubLTranslatedFile implements V02 {
    // // Constructor
    private bbn_strengthening_metrics() {
    }

    public static final SubLFile me = new bbn_strengthening_metrics();


    // // Definitions
    // deflexical
    private static final SubLSymbol $bbn_strengthening_metrics$ = makeSymbol("*BBN-STRENGTHENING-METRICS*");



    public static final SubLObject clear_bbn_strengthening_metrics() {
        {
            SubLObject cs = $bbn_strengthening_metrics_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_bbn_strengthening_metrics() {
        return memoization_state.caching_state_remove_function_results_with_args($bbn_strengthening_metrics_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject bbn_strengthening_metrics_internal() {
        return Mapping.mapcar(symbol_function(FIRST), $bbn_strengthening_metrics$.getGlobalValue());
    }

    public static final SubLObject bbn_strengthening_metrics() {
        {
            SubLObject caching_state = $bbn_strengthening_metrics_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(BBN_STRENGTHENING_METRICS, $bbn_strengthening_metrics_caching_state$, NIL, EQ, ZERO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
                if (results == $kw4$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(bbn_strengthening_metrics_internal()));
                    memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static final SubLObject bbn_strengthening_metric_p(SubLObject v_object) {
        return subl_promotions.memberP(v_object, bbn_strengthening_metrics(), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject bbn_strengthening_metric_value_type(SubLObject metric) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(metric, BBN_STRENGTHENING_METRIC_P);
            {
                SubLObject value_type = list_utilities.alist_lookup($bbn_strengthening_metrics$.getGlobalValue(), metric, UNPROVIDED, UNPROVIDED).first();
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!value_type.isSymbol()) {
                        Errors.error($str_alt6$Value_type_for__S_is__S__should_b, metric, value_type);
                    }
                }
                return value_type;
            }
        }
    }

    public static final SubLObject bbn_strengthening_metric_value_default(SubLObject metric) {
        if (NON_NEGATIVE_INTEGER_P == bbn_strengthening_metric_value_type(metric)) {
            return ZERO_INTEGER;
        } else {
            return NIL;
        }
    }

    public static final SubLObject bbn_strengthening_metric_has_subheadings_p(SubLObject metric) {
        return list_utilities.sublisp_boolean(bbn_strengthening_metric_subheading_type(metric));
    }

    public static final SubLObject bbn_strengthening_metric_subheading_type(SubLObject metric) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(metric, BBN_STRENGTHENING_METRIC_P);
            {
                SubLObject plist = third(list_utilities.alist_lookup($bbn_strengthening_metrics$.getGlobalValue(), metric, UNPROVIDED, UNPROVIDED));
                SubLObject subheading_type = getf(plist, $SUBHEADING, NIL);
                if (NIL != subheading_type) {
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (!subheading_type.isSymbol()) {
                            Errors.error($str_alt6$Value_type_for__S_is__S__should_b, metric, subheading_type);
                        }
                    }
                }
                return subheading_type;
            }
        }
    }

    public static final SubLObject bbn_strengthening_metric_header(SubLObject metric) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(metric, BBN_STRENGTHENING_METRIC_P);
            {
                SubLObject header = second(list_utilities.alist_lookup($bbn_strengthening_metrics$.getGlobalValue(), metric, UNPROVIDED, UNPROVIDED));
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!header.isString()) {
                        Errors.error($str_alt9$Value_type_for__S_is__S__should_b, metric, header);
                    }
                }
                return header;
            }
        }
    }

    public static final SubLObject bbn_strengthening_metric_lookup(SubLObject metric, SubLObject subheading, SubLObject store) {
        if (subheading == UNPROVIDED) {
            subheading = NIL;
        }
        if (store == UNPROVIDED) {
            store = bbn_metrics_store();
        }
        SubLTrampolineFile.checkType(metric, BBN_STRENGTHENING_METRIC_P);
        {
            SubLObject value = NIL;
            SubLObject v_default = bbn_strengthening_metric_value_default(metric);
            if (NIL != bbn_metrics_store_p(store)) {
                {
                    SubLObject metrics = bbn_metrics_store_metrics(store);
                    if (NIL != subheading) {
                        {
                            SubLObject submetrics = dictionary.dictionary_lookup(metrics, metric, UNPROVIDED);
                            if (NIL == dictionary.dictionary_p(submetrics)) {
                                submetrics = dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED);
                                dictionary.dictionary_enter(metrics, metric, submetrics);
                            }
                            value = dictionary.dictionary_lookup(submetrics, subheading, v_default);
                        }
                    } else {
                        value = dictionary.dictionary_lookup(metrics, metric, v_default);
                    }
                }
            }
            return value;
        }
    }

    public static final class $bbn_metrics_store_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return bbn_strengthening_metrics.$bbn_metrics_store_native.structDecl;
        }

        public SubLObject getField2() {
            return $document;
        }

        public SubLObject getField3() {
            return $metrics;
        }

        public SubLObject setField2(SubLObject value) {
            return $document = value;
        }

        public SubLObject setField3(SubLObject value) {
            return $metrics = value;
        }

        public SubLObject $document = Lisp.NIL;

        public SubLObject $metrics = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(bbn_strengthening_metrics.$bbn_metrics_store_native.class, BBN_METRICS_STORE, BBN_METRICS_STORE_P, $list_alt12, $list_alt13, new String[]{ "$document", "$metrics" }, $list_alt14, $list_alt15, PRINT_BBN_METRICS_STORE);
    }

    // defconstant
    public static final SubLSymbol $dtp_bbn_metrics_store$ = makeSymbol("*DTP-BBN-METRICS-STORE*");

    public static final SubLObject bbn_metrics_store_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        print_bbn_metrics_store(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject bbn_metrics_store_p(SubLObject v_object) {
        return v_object.getClass() == bbn_strengthening_metrics.$bbn_metrics_store_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static final class $bbn_metrics_store_p$UnaryFunction extends UnaryFunction {
        public $bbn_metrics_store_p$UnaryFunction() {
            super(extractFunctionNamed("BBN-METRICS-STORE-P"));
        }

        public SubLObject processItem(SubLObject arg1) {
            return bbn_metrics_store_p(arg1);
        }
    }

    public static final SubLObject bbn_metrics_store_document(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, BBN_METRICS_STORE_P);
        return v_object.getField2();
    }

    public static final SubLObject bbn_metrics_store_metrics(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, BBN_METRICS_STORE_P);
        return v_object.getField3();
    }

    public static final SubLObject _csetf_bbn_metrics_store_document(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, BBN_METRICS_STORE_P);
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_bbn_metrics_store_metrics(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, BBN_METRICS_STORE_P);
        return v_object.setField3(value);
    }

    public static final SubLObject make_bbn_metrics_store(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new bbn_strengthening_metrics.$bbn_metrics_store_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($DOCUMENT)) {
                        _csetf_bbn_metrics_store_document(v_new, current_value);
                    } else
                        if (pcase_var.eql($METRICS)) {
                            _csetf_bbn_metrics_store_metrics(v_new, current_value);
                        } else {
                            Errors.error($str_alt24$Invalid_slot__S_for_construction_, current_arg);
                        }

                }
            }
            return v_new;
        }
    }

    public static final SubLObject print_bbn_metrics_store(SubLObject store, SubLObject stream, SubLObject depth) {
        if (stream == UNPROVIDED) {
            stream = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        format(stream, $str_alt25$_BBN_METRICS_STORE__S_size___D_, bbn_metrics_store_document(store), dictionary.dictionary_length(bbn_metrics_store_metrics(store)));
        return store;
    }

    public static final SubLObject new_bbn_metrics_store(SubLObject v_document) {
        {
            SubLObject store = make_bbn_metrics_store(list($DOCUMENT, v_document, $METRICS, dictionary.new_dictionary(UNPROVIDED, UNPROVIDED)));
            SubLObject document_id = (NIL != sksi_external_term_browser.sksi_supported_external_termP(v_document)) ? ((SubLObject) (cycl_utilities.nat_arg2(v_document, UNPROVIDED))) : NIL;
            bbn_log_strengthening_metric($DOCUMENT_ID, document_id, NIL, store);
            return store;
        }
    }



    public static final SubLObject bbn_metrics_store() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $bbn_metrics_store$.getDynamicValue(thread);
        }
    }

    public static final SubLObject with_bbn_metrics_store_for_document(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt28);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject v_document = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt28);
                    v_document = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CLET, list(list($bbn_metrics_store$, list(NEW_BBN_METRICS_STORE, v_document))), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt28);
                    }
                }
            }
        }
        return NIL;
    }

    // deflexical
    private static final SubLSymbol $serif_entity_types$ = makeSymbol("*SERIF-ENTITY-TYPES*");

    // deflexical
    private static final SubLSymbol $serif_relationship_types$ = makeSymbol("*SERIF-RELATIONSHIP-TYPES*");

    public static final SubLObject serif_entity_types() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!$serif_entity_types$.getGlobalValue().isList()) {
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        $serif_entity_types$.setGlobalValue(isa.all_fort_instances($$BBNEntityType, UNPROVIDED, UNPROVIDED));
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return $serif_entity_types$.getGlobalValue();
        }
    }

    public static final SubLObject serif_relationship_types() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!$serif_relationship_types$.getGlobalValue().isList()) {
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        $serif_relationship_types$.setGlobalValue(isa.all_fort_instances($$BBNRelationTypePredicate, UNPROVIDED, UNPROVIDED));
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return $serif_relationship_types$.getGlobalValue();
        }
    }

    public static final SubLObject serif_entity_type_p(SubLObject v_object) {
        return makeBoolean((NIL != forts.fort_p(v_object)) && (NIL != subl_promotions.memberP(v_object, serif_entity_types(), UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject serif_relationship_type_p(SubLObject v_object) {
        return makeBoolean((NIL != forts.fort_p(v_object)) && (NIL != subl_promotions.memberP(v_object, serif_relationship_types(), UNPROVIDED, UNPROVIDED)));
    }

    /**
     * Note in the current *BBN-METRICS-STORE* that the value for (SUBHEADING of)
     * METRIC is VALUE.
     */
    public static final SubLObject bbn_log_strengthening_metric(SubLObject metric, SubLObject value, SubLObject subheading, SubLObject store) {
        if (subheading == UNPROVIDED) {
            subheading = NIL;
        }
        if (store == UNPROVIDED) {
            store = bbn_metrics_store();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(metric, BBN_STRENGTHENING_METRIC_P);
            {
                SubLObject value_type = bbn_strengthening_metric_value_type(metric);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == funcall(value_type, value)) {
                        Errors.error($str_alt36$_S_is_not_a__S, value, VALUE_TYPE);
                    }
                }
            }
            if (NIL != subheading) {
                SubLTrampolineFile.checkType(metric, BBN_STRENGTHENING_METRIC_HAS_SUBHEADINGS_P);
                {
                    SubLObject subheading_type = bbn_strengthening_metric_subheading_type(metric);
                    SubLTrampolineFile.checkType(subheading_type, FBOUNDP);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (NIL == funcall(subheading_type, subheading)) {
                            Errors.error($str_alt36$_S_is_not_a__S, subheading, SUBHEADING_TYPE);
                        }
                    }
                }
            }
            if (NIL != bbn_metrics_store_p(store)) {
                {
                    SubLObject metrics = bbn_metrics_store_metrics(store);
                    if (NIL != subheading) {
                        {
                            SubLObject submetrics = dictionary.dictionary_lookup(metrics, metric, UNPROVIDED);
                            if (NIL == dictionary.dictionary_p(submetrics)) {
                                submetrics = dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED);
                                dictionary.dictionary_enter(metrics, metric, submetrics);
                            }
                            dictionary.dictionary_enter(submetrics, subheading, value);
                        }
                    } else {
                        dictionary.dictionary_enter(metrics, metric, value);
                    }
                }
                return bbn_strengthening_metric_lookup(metric, subheading, store);
            }
            return NIL;
        }
    }

    /**
     * In the current *BBN-METRICS-STORE*, increment the value for (SUBHEADING of)
     * METRIC by DELTA.
     *
     * @unknown - Assumes initial value is 0.
     */
    public static final SubLObject bbn_increment_strengthening_metric(SubLObject metric, SubLObject delta, SubLObject subheading, SubLObject store) {
        if (delta == UNPROVIDED) {
            delta = ONE_INTEGER;
        }
        if (subheading == UNPROVIDED) {
            subheading = NIL;
        }
        if (store == UNPROVIDED) {
            store = bbn_metrics_store();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(metric, BBN_STRENGTHENING_METRIC_P);
            if (NIL != subheading) {
                SubLTrampolineFile.checkType(metric, BBN_STRENGTHENING_METRIC_HAS_SUBHEADINGS_P);
                {
                    SubLObject subheading_type = bbn_strengthening_metric_subheading_type(metric);
                    SubLTrampolineFile.checkType(subheading_type, FBOUNDP);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (NIL == funcall(subheading_type, subheading)) {
                            Errors.error($str_alt36$_S_is_not_a__S, subheading, SUBHEADING_TYPE);
                        }
                    }
                }
            }
            if (NIL != bbn_metrics_store_p(store)) {
                {
                    SubLObject metrics = bbn_metrics_store_metrics(store);
                    if (NIL != subheading) {
                        {
                            SubLObject submetrics = dictionary.dictionary_lookup(metrics, metric, UNPROVIDED);
                            if (NIL == dictionary.dictionary_p(submetrics)) {
                                submetrics = dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED);
                                dictionary.dictionary_enter(metrics, metric, submetrics);
                            }
                            dictionary_utilities.dictionary_increment(submetrics, subheading, delta);
                        }
                    } else {
                        dictionary_utilities.dictionary_increment(metrics, metric, delta);
                    }
                }
                return bbn_strengthening_metric_lookup(metric, subheading, store);
            }
            return NIL;
        }
    }



    public static final SubLObject with_bbn_metrics_file(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt42);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject file_name = (current.isCons()) ? ((SubLObject) (current.first())) : $str_alt43$BBN_strengthening_stats_txt;
                    destructuring_bind_must_listp(current, datum, $list_alt42);
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CLET, list(list($bbn_metrics_file$, list(INITIALIZE_BBN_METRICS_FILE, file_name))), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt42);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject initialize_bbn_metrics_file(SubLObject file_name) {
        if (NIL != Filesys.probe_file(file_name)) {
            Filesys.delete_file(file_name);
        }
        {
            SubLObject stream_var = NIL;
            try {
                stream_var = StreamsLow.open(file_name, new SubLObject[]{ $DIRECTION, $OUTPUT, $IF_DOES_NOT_EXIST, $CREATE });
                {
                    SubLObject out_stream = stream_var;
                    bbn_output_strengthening_metrics_headers(out_stream);
                }
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        if (NIL != stream_var) {
                            close(stream_var, UNPROVIDED);
                        }
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
        }
        return file_name;
    }

    /**
     * Append the current metrics to the current metrics file,
     * if it is specified (@see WITH-BBN-METRICS-FILE).
     */
    public static final SubLObject bbn_maybe_output_current_metrics(SubLObject time) {
        if (time == UNPROVIDED) {
            time = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != time) {
                bbn_log_strengthening_metric($ELAPSED_TIME, floor(time, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }
            {
                SubLObject file_name = $bbn_metrics_file$.getDynamicValue(thread);
                if (file_name.isString() && (NIL != Filesys.probe_file(file_name))) {
                    {
                        SubLObject stream_var = NIL;
                        try {
                            stream_var = StreamsLow.open(file_name, new SubLObject[]{ $DIRECTION, $OUTPUT, $IF_EXISTS, $APPEND });
                            {
                                SubLObject out_stream = stream_var;
                                bbn_output_strengthening_metrics(out_stream, UNPROVIDED);
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    if (NIL != stream_var) {
                                        close(stream_var, UNPROVIDED);
                                    }
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                }
                return file_name;
            }
        }
    }

    public static final SubLObject bbn_output_strengthening_metrics_headers(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLTrampolineFile.checkType(stream, STREAMP);
        {
            SubLObject cdolist_list_var = bbn_strengthening_metrics();
            SubLObject metric = NIL;
            for (metric = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , metric = cdolist_list_var.first()) {
                if (NIL != bbn_strengthening_metric_has_subheadings_p(metric)) {
                    {
                        SubLObject pcase_var = bbn_strengthening_metric_subheading_type(metric);
                        if (pcase_var.eql(QUOTE) || pcase_var.eql(SERIF_ENTITY_TYPE_P)) {
                            {
                                SubLObject cdotimes_end_var = length(serif_entity_types());
                                SubLObject i = NIL;
                                for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                                    {
                                        SubLObject header = (i.isZero()) ? ((SubLObject) (bbn_strengthening_metric_header(metric))) : NIL;
                                        bbn_output_strengthening_metric_header(header, stream);
                                    }
                                }
                            }
                        } else
                            if (pcase_var.eql(QUOTE) || pcase_var.eql(SERIF_RELATIONSHIP_TYPE_P)) {
                                {
                                    SubLObject cdotimes_end_var = length(serif_relationship_types());
                                    SubLObject i = NIL;
                                    for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                                        {
                                            SubLObject header = (i.isZero()) ? ((SubLObject) (bbn_strengthening_metric_header(metric))) : NIL;
                                            bbn_output_strengthening_metric_header(header, stream);
                                        }
                                    }
                                }
                            } else {
                                Errors.warn($str_alt58$Can_t_output_subheading_type__S_f, bbn_strengthening_metric_subheading_type(metric), metric);
                            }

                    }
                } else {
                    {
                        SubLObject header = bbn_strengthening_metric_header(metric);
                        bbn_output_strengthening_metric_header(header, stream);
                    }
                }
            }
        }
        terpri(stream);
        {
            SubLObject cdolist_list_var = bbn_strengthening_metrics();
            SubLObject metric = NIL;
            for (metric = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , metric = cdolist_list_var.first()) {
                if (NIL != bbn_strengthening_metric_has_subheadings_p(metric)) {
                    {
                        SubLObject pcase_var = bbn_strengthening_metric_subheading_type(metric);
                        if (pcase_var.eql(QUOTE) || pcase_var.eql(SERIF_ENTITY_TYPE_P)) {
                            {
                                SubLObject cdolist_list_var_1 = serif_entity_types();
                                SubLObject subheading = NIL;
                                for (subheading = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , subheading = cdolist_list_var_1.first()) {
                                    bbn_output_strengthening_metric_header(subheading, stream);
                                }
                            }
                        } else
                            if (pcase_var.eql(QUOTE) || pcase_var.eql(SERIF_RELATIONSHIP_TYPE_P)) {
                                {
                                    SubLObject cdolist_list_var_2 = serif_relationship_types();
                                    SubLObject subheading = NIL;
                                    for (subheading = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , subheading = cdolist_list_var_2.first()) {
                                        bbn_output_strengthening_metric_header(subheading, stream);
                                    }
                                }
                            } else {
                                Errors.warn($str_alt58$Can_t_output_subheading_type__S_f, bbn_strengthening_metric_subheading_type(metric), metric);
                            }

                    }
                } else {
                    bbn_output_strengthening_metric_header(NIL, stream);
                }
            }
        }
        terpri(stream);
        force_output(stream);
        return NIL;
    }

    public static final SubLObject bbn_output_strengthening_metrics(SubLObject stream, SubLObject store) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (store == UNPROVIDED) {
            store = bbn_metrics_store();
        }
        SubLTrampolineFile.checkType(stream, STREAMP);
        SubLTrampolineFile.checkType(store, BBN_METRICS_STORE_P);
        {
            SubLObject cdolist_list_var = bbn_strengthening_metrics();
            SubLObject metric = NIL;
            for (metric = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , metric = cdolist_list_var.first()) {
                bbn_output_strengthening_metric(metric, stream, store);
            }
        }
        terpri(stream);
        force_output(stream);
        return store;
    }

    public static final SubLObject bbn_output_strengthening_metric(SubLObject metric, SubLObject stream, SubLObject store) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (store == UNPROVIDED) {
            store = bbn_metrics_store();
        }
        if (NIL != bbn_strengthening_metric_has_subheadings_p(metric)) {
            {
                SubLObject pcase_var = bbn_strengthening_metric_subheading_type(metric);
                if (pcase_var.eql(QUOTE) || pcase_var.eql(SERIF_ENTITY_TYPE_P)) {
                    {
                        SubLObject cdolist_list_var = serif_entity_types();
                        SubLObject subheading = NIL;
                        for (subheading = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subheading = cdolist_list_var.first()) {
                            {
                                SubLObject value = bbn_strengthening_metric_lookup(metric, subheading, store);
                                bbn_output_strengthening_metric_value(value, stream);
                            }
                        }
                    }
                    return metric;
                } else
                    if (pcase_var.eql(QUOTE) || pcase_var.eql(SERIF_RELATIONSHIP_TYPE_P)) {
                        {
                            SubLObject cdolist_list_var = serif_relationship_types();
                            SubLObject subheading = NIL;
                            for (subheading = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subheading = cdolist_list_var.first()) {
                                {
                                    SubLObject value = bbn_strengthening_metric_lookup(metric, subheading, store);
                                    bbn_output_strengthening_metric_value(value, stream);
                                }
                            }
                        }
                        return metric;
                    } else {
                        return metric;
                    }

            }
        } else {
            {
                SubLObject value = bbn_strengthening_metric_lookup(metric, NIL, store);
                bbn_output_strengthening_metric_value(value, stream);
                return value;
            }
        }
    }

    public static final SubLObject bbn_output_strengthening_metric_value(SubLObject value, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        format(stream, $str_alt59$_A__, NIL == value ? ((SubLObject) ($str_alt60$)) : value);
        return value;
    }

    public static final SubLObject bbn_output_strengthening_metric_header(SubLObject header, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        format(stream, $str_alt59$_A__, NIL == header ? ((SubLObject) ($str_alt60$)) : header);
        return header;
    }

    public static final SubLObject declare_bbn_strengthening_metrics_file() {
        declareFunction("clear_bbn_strengthening_metrics", "CLEAR-BBN-STRENGTHENING-METRICS", 0, 0, false);
        declareFunction("remove_bbn_strengthening_metrics", "REMOVE-BBN-STRENGTHENING-METRICS", 0, 0, false);
        declareFunction("bbn_strengthening_metrics_internal", "BBN-STRENGTHENING-METRICS-INTERNAL", 0, 0, false);
        declareFunction("bbn_strengthening_metrics", "BBN-STRENGTHENING-METRICS", 0, 0, false);
        declareFunction("bbn_strengthening_metric_p", "BBN-STRENGTHENING-METRIC-P", 1, 0, false);
        declareFunction("bbn_strengthening_metric_value_type", "BBN-STRENGTHENING-METRIC-VALUE-TYPE", 1, 0, false);
        declareFunction("bbn_strengthening_metric_value_default", "BBN-STRENGTHENING-METRIC-VALUE-DEFAULT", 1, 0, false);
        declareFunction("bbn_strengthening_metric_has_subheadings_p", "BBN-STRENGTHENING-METRIC-HAS-SUBHEADINGS-P", 1, 0, false);
        declareFunction("bbn_strengthening_metric_subheading_type", "BBN-STRENGTHENING-METRIC-SUBHEADING-TYPE", 1, 0, false);
        declareFunction("bbn_strengthening_metric_header", "BBN-STRENGTHENING-METRIC-HEADER", 1, 0, false);
        declareFunction("bbn_strengthening_metric_lookup", "BBN-STRENGTHENING-METRIC-LOOKUP", 1, 2, false);
        declareFunction("bbn_metrics_store_print_function_trampoline", "BBN-METRICS-STORE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("bbn_metrics_store_p", "BBN-METRICS-STORE-P", 1, 0, false);
        new bbn_strengthening_metrics.$bbn_metrics_store_p$UnaryFunction();
        declareFunction("bbn_metrics_store_document", "BBN-METRICS-STORE-DOCUMENT", 1, 0, false);
        declareFunction("bbn_metrics_store_metrics", "BBN-METRICS-STORE-METRICS", 1, 0, false);
        declareFunction("_csetf_bbn_metrics_store_document", "_CSETF-BBN-METRICS-STORE-DOCUMENT", 2, 0, false);
        declareFunction("_csetf_bbn_metrics_store_metrics", "_CSETF-BBN-METRICS-STORE-METRICS", 2, 0, false);
        declareFunction("make_bbn_metrics_store", "MAKE-BBN-METRICS-STORE", 0, 1, false);
        declareFunction("print_bbn_metrics_store", "PRINT-BBN-METRICS-STORE", 1, 2, false);
        declareFunction("new_bbn_metrics_store", "NEW-BBN-METRICS-STORE", 1, 0, false);
        declareFunction("bbn_metrics_store", "BBN-METRICS-STORE", 0, 0, false);
        declareMacro("with_bbn_metrics_store_for_document", "WITH-BBN-METRICS-STORE-FOR-DOCUMENT");
        declareFunction("serif_entity_types", "SERIF-ENTITY-TYPES", 0, 0, false);
        declareFunction("serif_relationship_types", "SERIF-RELATIONSHIP-TYPES", 0, 0, false);
        declareFunction("serif_entity_type_p", "SERIF-ENTITY-TYPE-P", 1, 0, false);
        declareFunction("serif_relationship_type_p", "SERIF-RELATIONSHIP-TYPE-P", 1, 0, false);
        declareFunction("bbn_log_strengthening_metric", "BBN-LOG-STRENGTHENING-METRIC", 2, 2, false);
        declareFunction("bbn_increment_strengthening_metric", "BBN-INCREMENT-STRENGTHENING-METRIC", 1, 3, false);
        declareMacro("with_bbn_metrics_file", "WITH-BBN-METRICS-FILE");
        declareFunction("initialize_bbn_metrics_file", "INITIALIZE-BBN-METRICS-FILE", 1, 0, false);
        declareFunction("bbn_maybe_output_current_metrics", "BBN-MAYBE-OUTPUT-CURRENT-METRICS", 0, 1, false);
        declareFunction("bbn_output_strengthening_metrics_headers", "BBN-OUTPUT-STRENGTHENING-METRICS-HEADERS", 0, 1, false);
        declareFunction("bbn_output_strengthening_metrics", "BBN-OUTPUT-STRENGTHENING-METRICS", 0, 2, false);
        declareFunction("bbn_output_strengthening_metric", "BBN-OUTPUT-STRENGTHENING-METRIC", 1, 2, false);
        declareFunction("bbn_output_strengthening_metric_value", "BBN-OUTPUT-STRENGTHENING-METRIC-VALUE", 1, 1, false);
        declareFunction("bbn_output_strengthening_metric_header", "BBN-OUTPUT-STRENGTHENING-METRIC-HEADER", 1, 1, false);
        return NIL;
    }

    public static final SubLObject init_bbn_strengthening_metrics_file() {
        deflexical("*BBN-STRENGTHENING-METRICS*", $list_alt0);
        deflexical("*BBN-STRENGTHENING-METRICS-CACHING-STATE*", NIL);
        defconstant("*DTP-BBN-METRICS-STORE*", BBN_METRICS_STORE);
        defparameter("*BBN-METRICS-STORE*", $UNINITIALIZED);
        deflexical("*SERIF-ENTITY-TYPES*", $UNINITIALIZED);
        deflexical("*SERIF-RELATIONSHIP-TYPES*", $UNINITIALIZED);
        defparameter("*BBN-METRICS-FILE*", $UNSPECIFIED);
        return NIL;
    }

    public static final SubLObject setup_bbn_strengthening_metrics_file() {
                memoization_state.note_globally_cached_function(BBN_STRENGTHENING_METRICS);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_bbn_metrics_store$.getGlobalValue(), symbol_function(BBN_METRICS_STORE_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(BBN_METRICS_STORE_DOCUMENT, _CSETF_BBN_METRICS_STORE_DOCUMENT);
        def_csetf(BBN_METRICS_STORE_METRICS, _CSETF_BBN_METRICS_STORE_METRICS);
        identity(BBN_METRICS_STORE);
        access_macros.register_macro_helper(INITIALIZE_BBN_METRICS_FILE, WITH_BBN_METRICS_FILE);
        return NIL;
    }

    // // Internal Constants
    static private final SubLList $list_alt0 = list(new SubLObject[]{ list(makeKeyword("DOCUMENT-ID"), makeSymbol("NON-NEGATIVE-INTEGER-P"), makeString("Document ID")), list(makeKeyword("HYPOTHESES-INVESTIGATED"), makeSymbol("NON-NEGATIVE-INTEGER-P"), makeString("Hypotheses Investigated")), list(makeKeyword("HYPOTHESES-ACCEPTED"), makeSymbol("NON-NEGATIVE-INTEGER-P"), makeString("Hypotheses Accepted")), list(makeKeyword("HYPOTHESES-REJECTED"), makeSymbol("NON-NEGATIVE-INTEGER-P"), makeString("Hypotheses Rejected")), list(makeKeyword("HYPOTHESES-STRENGTHENED"), makeSymbol("NON-NEGATIVE-INTEGER-P"), makeString("Hypotheses Strengthened")), list(makeKeyword("ENTITIES-INVESTIGATED"), makeSymbol("NON-NEGATIVE-INTEGER-P"), makeString("Entities Investigated")), list(makeKeyword("KNOWN-SERIF-ENTITIES-STRENGTHENED"), makeSymbol("NON-NEGATIVE-INTEGER-P"), makeString("Known SERIF Entities Strengthened"), list(makeKeyword("SUBHEADING"), makeSymbol("SERIF-ENTITY-TYPE-P"))), list(makeKeyword("KNOWN-SERIF-RELATIONSHIPS-STRENGTHENED"), makeSymbol("NON-NEGATIVE-INTEGER-P"), makeString("Known SERIF Relationships Strengthened"), list(makeKeyword("SUBHEADING"), makeSymbol("SERIF-RELATIONSHIP-TYPE-P"))), list(makeKeyword("UNKNOWN-SERIF-ENTITIES-STRENGTHENED"), makeSymbol("NON-NEGATIVE-INTEGER-P"), makeString("Unknown SERIF Entities Strengthened")), list(makeKeyword("UNKNOWN-SERIF-RELATIONSHIPS-STRENGTHENED"), makeSymbol("NON-NEGATIVE-INTEGER-P"), makeString("Unknown SERIF Relationships Strengthened")), list(makeKeyword("ASSERTIONS-USED"), makeSymbol("NON-NEGATIVE-INTEGER-P"), makeString("Assertions Used")), list(makeKeyword("ERRORS"), makeSymbol("NON-NEGATIVE-INTEGER-P"), makeString("Error Count")), list(makeKeyword("ELAPSED-TIME"), makeSymbol("NON-NEGATIVE-INTEGER-P"), makeString("Elapsed Time (seconds)")) });

    private static final SubLSymbol BBN_STRENGTHENING_METRICS = makeSymbol("BBN-STRENGTHENING-METRICS");



    public static final SubLSymbol $bbn_strengthening_metrics_caching_state$ = makeSymbol("*BBN-STRENGTHENING-METRICS-CACHING-STATE*");

    public static final SubLSymbol $kw4$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    private static final SubLSymbol BBN_STRENGTHENING_METRIC_P = makeSymbol("BBN-STRENGTHENING-METRIC-P");

    static private final SubLString $str_alt6$Value_type_for__S_is__S__should_b = makeString("Value type for ~S is ~S, should be SYMBOLP.");



    private static final SubLSymbol $SUBHEADING = makeKeyword("SUBHEADING");

    static private final SubLString $str_alt9$Value_type_for__S_is__S__should_b = makeString("Value type for ~S is ~S, should be STRINGP.");

    private static final SubLSymbol BBN_METRICS_STORE = makeSymbol("BBN-METRICS-STORE");

    private static final SubLSymbol BBN_METRICS_STORE_P = makeSymbol("BBN-METRICS-STORE-P");

    static private final SubLList $list_alt12 = list(makeSymbol("DOCUMENT"), makeSymbol("METRICS"));

    static private final SubLList $list_alt13 = list(makeKeyword("DOCUMENT"), makeKeyword("METRICS"));

    static private final SubLList $list_alt14 = list(makeSymbol("BBN-METRICS-STORE-DOCUMENT"), makeSymbol("BBN-METRICS-STORE-METRICS"));

    static private final SubLList $list_alt15 = list(makeSymbol("_CSETF-BBN-METRICS-STORE-DOCUMENT"), makeSymbol("_CSETF-BBN-METRICS-STORE-METRICS"));

    private static final SubLSymbol PRINT_BBN_METRICS_STORE = makeSymbol("PRINT-BBN-METRICS-STORE");

    private static final SubLSymbol BBN_METRICS_STORE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("BBN-METRICS-STORE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLSymbol BBN_METRICS_STORE_DOCUMENT = makeSymbol("BBN-METRICS-STORE-DOCUMENT");

    public static final SubLSymbol _CSETF_BBN_METRICS_STORE_DOCUMENT = makeSymbol("_CSETF-BBN-METRICS-STORE-DOCUMENT");

    private static final SubLSymbol BBN_METRICS_STORE_METRICS = makeSymbol("BBN-METRICS-STORE-METRICS");

    public static final SubLSymbol _CSETF_BBN_METRICS_STORE_METRICS = makeSymbol("_CSETF-BBN-METRICS-STORE-METRICS");





    static private final SubLString $str_alt24$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt25$_BBN_METRICS_STORE__S_size___D_ = makeString("<BBN-METRICS-STORE ~S size: ~D>");

    private static final SubLSymbol $DOCUMENT_ID = makeKeyword("DOCUMENT-ID");



    static private final SubLList $list_alt28 = list(list(makeSymbol("DOCUMENT")), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLSymbol $bbn_metrics_store$ = makeSymbol("*BBN-METRICS-STORE*");

    private static final SubLSymbol NEW_BBN_METRICS_STORE = makeSymbol("NEW-BBN-METRICS-STORE");



    public static final SubLObject $$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));

    public static final SubLObject $$BBNEntityType = constant_handles.reader_make_constant_shell(makeString("BBNEntityType"));

    public static final SubLObject $$BBNRelationTypePredicate = constant_handles.reader_make_constant_shell(makeString("BBNRelationTypePredicate"));

    static private final SubLString $str_alt36$_S_is_not_a__S = makeString("~S is not a ~S");

    private static final SubLSymbol VALUE_TYPE = makeSymbol("VALUE-TYPE");

    private static final SubLSymbol BBN_STRENGTHENING_METRIC_HAS_SUBHEADINGS_P = makeSymbol("BBN-STRENGTHENING-METRIC-HAS-SUBHEADINGS-P");



    private static final SubLSymbol SUBHEADING_TYPE = makeSymbol("SUBHEADING-TYPE");



    static private final SubLList $list_alt42 = list(list(makeSymbol("&OPTIONAL"), list(makeSymbol("FILE-NAME"), makeString("BBN-strengthening-stats.txt"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt43$BBN_strengthening_stats_txt = makeString("BBN-strengthening-stats.txt");

    public static final SubLSymbol $bbn_metrics_file$ = makeSymbol("*BBN-METRICS-FILE*");

    private static final SubLSymbol INITIALIZE_BBN_METRICS_FILE = makeSymbol("INITIALIZE-BBN-METRICS-FILE");

    private static final SubLSymbol WITH_BBN_METRICS_FILE = makeSymbol("WITH-BBN-METRICS-FILE");





    private static final SubLSymbol $IF_DOES_NOT_EXIST = makeKeyword("IF-DOES-NOT-EXIST");



    private static final SubLSymbol $ELAPSED_TIME = makeKeyword("ELAPSED-TIME");









    private static final SubLSymbol SERIF_ENTITY_TYPE_P = makeSymbol("SERIF-ENTITY-TYPE-P");

    private static final SubLSymbol SERIF_RELATIONSHIP_TYPE_P = makeSymbol("SERIF-RELATIONSHIP-TYPE-P");

    static private final SubLString $str_alt58$Can_t_output_subheading_type__S_f = makeString("Can't output subheading type ~S for ~S");

    static private final SubLString $str_alt59$_A__ = makeString("~A, ");

    static private final SubLString $str_alt60$ = makeString("");

    // // Initializers
    public void declareFunctions() {
        declare_bbn_strengthening_metrics_file();
    }

    public void initializeVariables() {
        init_bbn_strengthening_metrics_file();
    }

    public void runTopLevelForms() {
        setup_bbn_strengthening_metrics_file();
    }
}

