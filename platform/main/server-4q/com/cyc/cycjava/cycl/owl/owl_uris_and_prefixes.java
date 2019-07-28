package com.cyc.cycjava.cycl.owl;


import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.misc_utilities;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.owl.owl_uris_and_prefixes;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.xml_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.owl.owl_uris_and_prefixes.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SIX_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class owl_uris_and_prefixes extends SubLTranslatedFile {
    public static final SubLFile me = new owl_uris_and_prefixes();

    public static final String myName = "com.cyc.cycjava.cycl.owl.owl_uris_and_prefixes";

    public static final String myFingerPrint = "3d5711314f62ee583e024638a1ecf6dcca32d6ef9cb11bbbcb95a23780941992";

    // deflexical
    // Definitions
    private static final SubLSymbol $owl_cyc_base_uri$ = makeSymbol("*OWL-CYC-BASE-URI*");

    // deflexical
    private static final SubLSymbol $owl_opencyc_base_uri$ = makeSymbol("*OWL-OPENCYC-BASE-URI*");

    // deflexical
    private static final SubLSymbol $owl_uri_concept_prefix$ = makeSymbol("*OWL-URI-CONCEPT-PREFIX*");

    // deflexical
    // Dates that have been used in previous published OpenCyc exports.
    private static final SubLSymbol $previous_owl_export_version_dates$ = makeSymbol("*PREVIOUS-OWL-EXPORT-VERSION-DATES*");

    // defparameter
    /**
     * UNIVERSAL-DATE-P to use in our URLs for versioning, or NIL for an unversioned
     * export.
     */
    public static final SubLSymbol $owl_export_version_date$ = makeSymbol("*OWL-EXPORT-VERSION-DATE*");

    // defparameter
    // Are we exporting terms qua OpenCyc terms?
    public static final SubLSymbol $owl_export_limited_to_opencyc_contentP$ = makeSymbol("*OWL-EXPORT-LIMITED-TO-OPENCYC-CONTENT?*");

    // defparameter
    public static final SubLSymbol $owl_export_include_sameas_links_to_cyc_urisP$ = makeSymbol("*OWL-EXPORT-INCLUDE-SAMEAS-LINKS-TO-CYC-URIS?*");

    // defparameter
    public static final SubLSymbol $owl_export_suppress_ontology_nodeP$ = makeSymbol("*OWL-EXPORT-SUPPRESS-ONTOLOGY-NODE?*");

    // defparameter
    // Parameter to allow explicit setting of base URI for export.
    public static final SubLSymbol $owl_export_base_uri$ = makeSymbol("*OWL-EXPORT-BASE-URI*");

    // deflexical
    private static final SubLSymbol $cyc_annotation_prefix$ = makeSymbol("*CYC-ANNOTATION-PREFIX*");

    // deflexical
    private static final SubLSymbol $cyc_annotation_base_uri$ = makeSymbol("*CYC-ANNOTATION-BASE-URI*");

    // defparameter
    public static final SubLSymbol $owl_export_entity_map$ = makeSymbol("*OWL-EXPORT-ENTITY-MAP*");

    // defparameter
    public static final SubLSymbol $owl_export_default_namespace$ = makeSymbol("*OWL-EXPORT-DEFAULT-NAMESPACE*");

    // Internal Constants
    public static final SubLString $str0$http___sw_cyc_com_ = makeString("http://sw.cyc.com/");

    public static final SubLString $str1$http___sw_opencyc_org_ = makeString("http://sw.opencyc.org/");

    public static final SubLString $str2$concept_ = makeString("concept/");

    public static final SubLSymbol OWL_ENGLISH_OPENCYC_BASE_URI = makeSymbol("OWL-ENGLISH-OPENCYC-BASE-URI");

    public static final SubLString $str4$en_ = makeString("en/");

    private static final SubLList $list5 = list(makeInteger(20080610), makeInteger(20090407));

    private static final SubLInteger $int$20120510 = makeInteger(20120510);

    private static final SubLSymbol OWL_OPENCYC_BASE_URI = makeSymbol("OWL-OPENCYC-BASE-URI");

    private static final SubLSymbol OWL_OPENCYC_UNVERSIONED_BASE_URI = makeSymbol("OWL-OPENCYC-UNVERSIONED-BASE-URI");

    public static final SubLSymbol OWL_CYC_BASE_URI = makeSymbol("OWL-CYC-BASE-URI");

    private static final SubLSymbol OWL_CYC_UNVERSIONED_BASE_URI = makeSymbol("OWL-CYC-UNVERSIONED-BASE-URI");

    private static final SubLSymbol OWL_URL_VERSION_PORTION = makeSymbol("OWL-URL-VERSION-PORTION");



    private static final SubLString $str13$_ = makeString("/");

    private static final SubLString $$$cycAnnot = makeString("cycAnnot");

    private static final SubLString $str15$http___sw_cyc_com_CycAnnotations_ = makeString("http://sw.cyc.com/CycAnnotations_v1#");

    public static final SubLList $list16 = cons(makeString("owl"), makeString("http://www.w3.org/2002/07/owl#"));

    public static final SubLList $list17 = cons(makeString("rdf"), makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#"));

    public static final SubLList $list18 = cons(makeString("rdfs"), makeString("http://www.w3.org/2000/01/rdf-schema#"));

    private static final SubLList $list19 = cons(makeString("skos"), makeString("http://www.w3.org/2004/02/skos/core#"));

    private static final SubLList $list20 = cons(makeString("xsd"), makeString("http://www.w3.org/2001/XMLSchema#"));

    private static final SubLString $$$cyc = makeString("cyc");

    private static final SubLString $$$opencyc = makeString("opencyc");

    public static final SubLString $str23$_ = makeString("&");

    public static final SubLString $str24$_ = makeString(";");

    private static final SubLList $list25 = cons(makeUninternedSymbol("KEY"), makeSymbol("NAMESPACE"));

    private static final SubLList $list26 = cons(makeSymbol("PREFIX"), makeSymbol("NAMESPACE"));

    private static final SubLString $str27$_ = makeString(":");

    public static SubLObject owl_english_opencyc_base_uri_internal(SubLObject version_date) {
        if (version_date == UNPROVIDED) {
            version_date = $owl_export_version_date$.getDynamicValue();
        }
        return cconcatenate(owl_opencyc_base_uri(version_date), $str4$en_);
    }

    public static SubLObject owl_english_opencyc_base_uri(SubLObject version_date) {
        if (version_date == UNPROVIDED) {
            version_date = $owl_export_version_date$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return owl_english_opencyc_base_uri_internal(version_date);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, OWL_ENGLISH_OPENCYC_BASE_URI, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), OWL_ENGLISH_OPENCYC_BASE_URI, ONE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, OWL_ENGLISH_OPENCYC_BASE_URI, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, version_date, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(owl_english_opencyc_base_uri_internal(version_date)));
            memoization_state.caching_state_put(caching_state, version_date, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject previous_owl_export_version_dates() {
        return copy_list($previous_owl_export_version_dates$.getGlobalValue());
    }

    public static SubLObject owl_opencyc_base_uri_internal(SubLObject version_date) {
        if (version_date == UNPROVIDED) {
            version_date = $owl_export_version_date$.getDynamicValue();
        }
        return cconcatenate($owl_opencyc_base_uri$.getGlobalValue(), new SubLObject[]{ owl_url_version_portion(version_date), $owl_uri_concept_prefix$.getGlobalValue() });
    }

    public static SubLObject owl_opencyc_base_uri(SubLObject version_date) {
        if (version_date == UNPROVIDED) {
            version_date = $owl_export_version_date$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return owl_opencyc_base_uri_internal(version_date);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, OWL_OPENCYC_BASE_URI, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), OWL_OPENCYC_BASE_URI, ONE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, OWL_OPENCYC_BASE_URI, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, version_date, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(owl_opencyc_base_uri_internal(version_date)));
            memoization_state.caching_state_put(caching_state, version_date, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject owl_opencyc_unversioned_base_uri_internal() {
        return cconcatenate($owl_opencyc_base_uri$.getGlobalValue(), $owl_uri_concept_prefix$.getGlobalValue());
    }

    public static SubLObject owl_opencyc_unversioned_base_uri() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return owl_opencyc_unversioned_base_uri_internal();
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, OWL_OPENCYC_UNVERSIONED_BASE_URI, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), OWL_OPENCYC_UNVERSIONED_BASE_URI, ZERO_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, OWL_OPENCYC_UNVERSIONED_BASE_URI, caching_state);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(owl_opencyc_unversioned_base_uri_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject owl_cyc_base_uri_internal(SubLObject version_date) {
        if (version_date == UNPROVIDED) {
            version_date = $owl_export_version_date$.getDynamicValue();
        }
        return cconcatenate($owl_cyc_base_uri$.getGlobalValue(), new SubLObject[]{ owl_url_version_portion(version_date), $owl_uri_concept_prefix$.getGlobalValue() });
    }

    public static SubLObject owl_cyc_base_uri(SubLObject version_date) {
        if (version_date == UNPROVIDED) {
            version_date = $owl_export_version_date$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return owl_cyc_base_uri_internal(version_date);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, OWL_CYC_BASE_URI, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), OWL_CYC_BASE_URI, ONE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, OWL_CYC_BASE_URI, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, version_date, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(owl_cyc_base_uri_internal(version_date)));
            memoization_state.caching_state_put(caching_state, version_date, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject owl_cyc_unversioned_base_uri_internal() {
        return cconcatenate($owl_cyc_base_uri$.getGlobalValue(), $owl_uri_concept_prefix$.getGlobalValue());
    }

    public static SubLObject owl_cyc_unversioned_base_uri() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return owl_cyc_unversioned_base_uri_internal();
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, OWL_CYC_UNVERSIONED_BASE_URI, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), OWL_CYC_UNVERSIONED_BASE_URI, ZERO_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, OWL_CYC_UNVERSIONED_BASE_URI, caching_state);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(owl_cyc_unversioned_base_uri_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject owl_url_version_portion_internal(SubLObject version_date) {
        if (version_date == UNPROVIDED) {
            version_date = $owl_export_version_date$.getDynamicValue();
        }
        if (NIL == version_date) {
            return string_utilities.$empty_string$.getGlobalValue();
        }
        assert NIL != numeric_date_utilities.universal_date_p(version_date) : "numeric_date_utilities.universal_date_p(version_date) " + "CommonSymbols.NIL != numeric_date_utilities.universal_date_p(version_date) " + version_date;
        final SubLObject standard_datestring = numeric_date_utilities.datestring(version_date);
        final SubLObject year = string_utilities.substring(standard_datestring, SIX_INTEGER, TEN_INTEGER);
        final SubLObject month = string_utilities.substring(standard_datestring, ZERO_INTEGER, TWO_INTEGER);
        final SubLObject day = string_utilities.substring(standard_datestring, THREE_INTEGER, FIVE_INTEGER);
        return cconcatenate(format_nil.format_nil_a_no_copy(year), new SubLObject[]{ $str13$_, format_nil.format_nil_a_no_copy(month), $str13$_, format_nil.format_nil_a_no_copy(day), $str13$_ });
    }

    public static SubLObject owl_url_version_portion(SubLObject version_date) {
        if (version_date == UNPROVIDED) {
            version_date = $owl_export_version_date$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return owl_url_version_portion_internal(version_date);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, OWL_URL_VERSION_PORTION, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), OWL_URL_VERSION_PORTION, ONE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, OWL_URL_VERSION_PORTION, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, version_date, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(owl_url_version_portion_internal(version_date)));
            memoization_state.caching_state_put(caching_state, version_date, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject owl_export_base_uri(SubLObject version_date) {
        if (version_date == UNPROVIDED) {
            version_date = $owl_export_version_date$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != misc_utilities.initialized_p($owl_export_base_uri$.getDynamicValue(thread))) {
            return $owl_export_base_uri$.getDynamicValue(thread);
        }
        if (NIL == owlification.$owl_use_external_ids_for_namesP$.getDynamicValue(thread)) {
            return owl_english_opencyc_base_uri(version_date);
        }
        if (NIL != $owl_export_limited_to_opencyc_contentP$.getDynamicValue(thread)) {
            return owl_opencyc_base_uri(version_date);
        }
        return owl_cyc_base_uri(version_date);
    }

    public static SubLObject cyc_annotation_prefix() {
        return string_utilities.copy_string($cyc_annotation_prefix$.getGlobalValue());
    }

    public static SubLObject cyc_annotation_base_uri() {
        return string_utilities.copy_string($cyc_annotation_base_uri$.getGlobalValue());
    }

    public static SubLObject possibly_entity_reference_for_base_uri(final SubLObject base_uri) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject abbrev = list_utilities.alist_reverse_lookup_without_values($owl_export_entity_map$.getDynamicValue(thread), base_uri, symbol_function(EQUAL), UNPROVIDED);
        return NIL != abbrev ? cconcatenate($str23$_, new SubLObject[]{ format_nil.format_nil_a_no_copy(abbrev), $str24$_ }) : base_uri;
    }

    public static SubLObject owl_export_default_namespace() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != misc_utilities.initialized_p($owl_export_default_namespace$.getDynamicValue(thread)) ? $owl_export_default_namespace$.getDynamicValue(thread) : owl_export_base_uri(UNPROVIDED);
    }

    public static SubLObject uri_in_entity_map_namespaceP(final SubLObject uri) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = $owl_export_entity_map$.getDynamicValue(thread);
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject key = NIL;
            SubLObject namespace = NIL;
            destructuring_bind_must_consp(current, datum, $list25);
            key = current.first();
            current = namespace = current.rest();
            if (NIL != string_utilities.starts_with(uri, namespace)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject possibly_abbreviate_uri(final SubLObject uri) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = $owl_export_entity_map$.getDynamicValue(thread);
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject prefix = NIL;
            SubLObject namespace = NIL;
            destructuring_bind_must_consp(current, datum, $list26);
            prefix = current.first();
            current = namespace = current.rest();
            if (NIL != string_utilities.starts_with(uri, namespace)) {
                final SubLObject local_part = string_utilities.pre_remove(uri, namespace, UNPROVIDED);
                if (NIL != xml_utilities.valid_xml_name_p(local_part)) {
                    return cconcatenate(prefix, new SubLObject[]{ $str27$_, local_part });
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return uri;
    }

    public static SubLObject possibly_use_entity_reference(final SubLObject uri) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != owlification.$owl_use_entity_referencesP$.getDynamicValue(thread)) {
            SubLObject cdolist_list_var = $owl_export_entity_map$.getDynamicValue(thread);
            SubLObject cons = NIL;
            cons = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = cons;
                SubLObject prefix = NIL;
                SubLObject namespace = NIL;
                destructuring_bind_must_consp(current, datum, $list26);
                prefix = current.first();
                current = namespace = current.rest();
                if (uri.equal(namespace)) {
                    return cconcatenate($str23$_, new SubLObject[]{ format_nil.format_nil_a_no_copy(prefix), $str24$_ });
                }
                if (NIL != string_utilities.starts_with(uri, namespace)) {
                    return cconcatenate($str23$_, new SubLObject[]{ format_nil.format_nil_a_no_copy(prefix), $str24$_, format_nil.format_nil_a_no_copy(string_utilities.pre_remove(uri, namespace, UNPROVIDED)) });
                }
                cdolist_list_var = cdolist_list_var.rest();
                cons = cdolist_list_var.first();
            } 
        }
        return uri;
    }

    public static SubLObject declare_owl_uris_and_prefixes_file() {
        declareFunction(me, "owl_english_opencyc_base_uri_internal", "OWL-ENGLISH-OPENCYC-BASE-URI-INTERNAL", 0, 1, false);
        declareFunction(me, "owl_english_opencyc_base_uri", "OWL-ENGLISH-OPENCYC-BASE-URI", 0, 1, false);
        declareFunction(me, "previous_owl_export_version_dates", "PREVIOUS-OWL-EXPORT-VERSION-DATES", 0, 0, false);
        declareFunction(me, "owl_opencyc_base_uri_internal", "OWL-OPENCYC-BASE-URI-INTERNAL", 0, 1, false);
        declareFunction(me, "owl_opencyc_base_uri", "OWL-OPENCYC-BASE-URI", 0, 1, false);
        declareFunction(me, "owl_opencyc_unversioned_base_uri_internal", "OWL-OPENCYC-UNVERSIONED-BASE-URI-INTERNAL", 0, 0, false);
        declareFunction(me, "owl_opencyc_unversioned_base_uri", "OWL-OPENCYC-UNVERSIONED-BASE-URI", 0, 0, false);
        declareFunction(me, "owl_cyc_base_uri_internal", "OWL-CYC-BASE-URI-INTERNAL", 0, 1, false);
        declareFunction(me, "owl_cyc_base_uri", "OWL-CYC-BASE-URI", 0, 1, false);
        declareFunction(me, "owl_cyc_unversioned_base_uri_internal", "OWL-CYC-UNVERSIONED-BASE-URI-INTERNAL", 0, 0, false);
        declareFunction(me, "owl_cyc_unversioned_base_uri", "OWL-CYC-UNVERSIONED-BASE-URI", 0, 0, false);
        declareFunction(me, "owl_url_version_portion_internal", "OWL-URL-VERSION-PORTION-INTERNAL", 0, 1, false);
        declareFunction(me, "owl_url_version_portion", "OWL-URL-VERSION-PORTION", 0, 1, false);
        declareFunction(me, "owl_export_base_uri", "OWL-EXPORT-BASE-URI", 0, 1, false);
        declareFunction(me, "cyc_annotation_prefix", "CYC-ANNOTATION-PREFIX", 0, 0, false);
        declareFunction(me, "cyc_annotation_base_uri", "CYC-ANNOTATION-BASE-URI", 0, 0, false);
        declareFunction(me, "possibly_entity_reference_for_base_uri", "POSSIBLY-ENTITY-REFERENCE-FOR-BASE-URI", 1, 0, false);
        declareFunction(me, "owl_export_default_namespace", "OWL-EXPORT-DEFAULT-NAMESPACE", 0, 0, false);
        declareFunction(me, "uri_in_entity_map_namespaceP", "URI-IN-ENTITY-MAP-NAMESPACE?", 1, 0, false);
        declareFunction(me, "possibly_abbreviate_uri", "POSSIBLY-ABBREVIATE-URI", 1, 0, false);
        declareFunction(me, "possibly_use_entity_reference", "POSSIBLY-USE-ENTITY-REFERENCE", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_owl_uris_and_prefixes_file() {
        deflexical("*OWL-CYC-BASE-URI*", $str0$http___sw_cyc_com_);
        deflexical("*OWL-OPENCYC-BASE-URI*", $str1$http___sw_opencyc_org_);
        deflexical("*OWL-URI-CONCEPT-PREFIX*", $str2$concept_);
        deflexical("*PREVIOUS-OWL-EXPORT-VERSION-DATES*", $list5);
        defparameter("*OWL-EXPORT-VERSION-DATE*", $int$20120510);
        defparameter("*OWL-EXPORT-LIMITED-TO-OPENCYC-CONTENT?*", NIL);
        defparameter("*OWL-EXPORT-INCLUDE-SAMEAS-LINKS-TO-CYC-URIS?*", T);
        defparameter("*OWL-EXPORT-SUPPRESS-ONTOLOGY-NODE?*", NIL);
        defparameter("*OWL-EXPORT-BASE-URI*", misc_utilities.uninitialized());
        deflexical("*CYC-ANNOTATION-PREFIX*", $$$cycAnnot);
        deflexical("*CYC-ANNOTATION-BASE-URI*", $str15$http___sw_cyc_com_CycAnnotations_);
        defparameter("*OWL-EXPORT-ENTITY-MAP*", list($list16, $list17, $list18, $list19, $list20, bq_cons($$$cyc, $owl_cyc_base_uri$.getGlobalValue()), bq_cons($$$opencyc, $owl_opencyc_base_uri$.getGlobalValue()), bq_cons(cyc_annotation_prefix(), cyc_annotation_base_uri())));
        defparameter("*OWL-EXPORT-DEFAULT-NAMESPACE*", misc_utilities.uninitialized());
        return NIL;
    }

    public static SubLObject setup_owl_uris_and_prefixes_file() {
        memoization_state.note_memoized_function(OWL_ENGLISH_OPENCYC_BASE_URI);
        memoization_state.note_memoized_function(OWL_OPENCYC_BASE_URI);
        memoization_state.note_memoized_function(OWL_OPENCYC_UNVERSIONED_BASE_URI);
        memoization_state.note_memoized_function(OWL_CYC_BASE_URI);
        memoization_state.note_memoized_function(OWL_CYC_UNVERSIONED_BASE_URI);
        memoization_state.note_memoized_function(OWL_URL_VERSION_PORTION);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_owl_uris_and_prefixes_file();
    }

    @Override
    public void initializeVariables() {
        init_owl_uris_and_prefixes_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_owl_uris_and_prefixes_file();
    }

    static {










































    }
}

/**
 * Total time: 130 ms
 */
