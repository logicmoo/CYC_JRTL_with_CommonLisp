/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.owl;


import static com.cyc.cycjava.cycl.format_nil.*;
import static com.cyc.cycjava.cycl.numeric_date_utilities.*;
import static com.cyc.cycjava.cycl.string_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.misc_utilities;
import com.cyc.cycjava.cycl.numeric_date_utilities;
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
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class owl_uris_and_prefixes extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new owl_uris_and_prefixes();

 public static final String myName = "com.cyc.cycjava.cycl.owl.owl_uris_and_prefixes";


    // deflexical
    // Definitions
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $owl_cyc_base_uri$ = makeSymbol("*OWL-CYC-BASE-URI*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $owl_opencyc_base_uri$ = makeSymbol("*OWL-OPENCYC-BASE-URI*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $owl_uri_concept_prefix$ = makeSymbol("*OWL-URI-CONCEPT-PREFIX*");

    // deflexical
    // Dates that have been used in previous published OpenCyc exports.
    /**
     * Dates that have been used in previous published OpenCyc exports.
     */
    @LispMethod(comment = "Dates that have been used in previous published OpenCyc exports.\ndeflexical")
    private static final SubLSymbol $previous_owl_export_version_dates$ = makeSymbol("*PREVIOUS-OWL-EXPORT-VERSION-DATES*");

    // defparameter
    /**
     * UNIVERSAL-DATE-P to use in our URLs for versioning, or NIL for an unversioned
     * export.
     */
    @LispMethod(comment = "UNIVERSAL-DATE-P to use in our URLs for versioning, or NIL for an unversioned\r\nexport.\ndefparameter\nUNIVERSAL-DATE-P to use in our URLs for versioning, or NIL for an unversioned\nexport.")
    public static final SubLSymbol $owl_export_version_date$ = makeSymbol("*OWL-EXPORT-VERSION-DATE*");

    // defparameter
    // Are we exporting terms qua OpenCyc terms?
    /**
     * Are we exporting terms qua OpenCyc terms?
     */
    @LispMethod(comment = "Are we exporting terms qua OpenCyc terms?\ndefparameter")
    public static final SubLSymbol $owl_export_limited_to_opencyc_contentP$ = makeSymbol("*OWL-EXPORT-LIMITED-TO-OPENCYC-CONTENT?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $owl_export_include_sameas_links_to_cyc_urisP$ = makeSymbol("*OWL-EXPORT-INCLUDE-SAMEAS-LINKS-TO-CYC-URIS?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $owl_export_suppress_ontology_nodeP$ = makeSymbol("*OWL-EXPORT-SUPPRESS-ONTOLOGY-NODE?*");

    // defparameter
    // Parameter to allow explicit setting of base URI for export.
    /**
     * Parameter to allow explicit setting of base URI for export.
     */
    @LispMethod(comment = "Parameter to allow explicit setting of base URI for export.\ndefparameter")
    public static final SubLSymbol $owl_export_base_uri$ = makeSymbol("*OWL-EXPORT-BASE-URI*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $cyc_annotation_prefix$ = makeSymbol("*CYC-ANNOTATION-PREFIX*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $cyc_annotation_base_uri$ = makeSymbol("*CYC-ANNOTATION-BASE-URI*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $owl_export_entity_map$ = makeSymbol("*OWL-EXPORT-ENTITY-MAP*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $owl_export_default_namespace$ = makeSymbol("*OWL-EXPORT-DEFAULT-NAMESPACE*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str0$http___sw_cyc_com_ = makeString("http://sw.cyc.com/");

    static private final SubLString $str1$http___sw_opencyc_org_ = makeString("http://sw.opencyc.org/");

    static private final SubLString $str2$concept_ = makeString("concept/");

    private static final SubLSymbol OWL_ENGLISH_OPENCYC_BASE_URI = makeSymbol("OWL-ENGLISH-OPENCYC-BASE-URI");

    static private final SubLString $str4$en_ = makeString("en/");

    private static final SubLList $list5 = list(makeInteger(20080610), makeInteger(20090407));

    private static final SubLInteger $int$20120510 = makeInteger(20120510);

    private static final SubLSymbol OWL_OPENCYC_BASE_URI = makeSymbol("OWL-OPENCYC-BASE-URI");

    private static final SubLSymbol OWL_OPENCYC_UNVERSIONED_BASE_URI = makeSymbol("OWL-OPENCYC-UNVERSIONED-BASE-URI");

    private static final SubLSymbol OWL_CYC_BASE_URI = makeSymbol("OWL-CYC-BASE-URI");

    private static final SubLSymbol OWL_CYC_UNVERSIONED_BASE_URI = makeSymbol("OWL-CYC-UNVERSIONED-BASE-URI");

    private static final SubLSymbol OWL_URL_VERSION_PORTION = makeSymbol("OWL-URL-VERSION-PORTION");

    private static final SubLString $str13$_ = makeString("/");

    private static final SubLString $$$cycAnnot = makeString("cycAnnot");

    private static final SubLString $str15$http___sw_cyc_com_CycAnnotations_ = makeString("http://sw.cyc.com/CycAnnotations_v1#");

    static private final SubLList $list16 = cons(makeString("owl"), makeString("http://www.w3.org/2002/07/owl#"));

    static private final SubLList $list17 = cons(makeString("rdf"), makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#"));

    static private final SubLList $list18 = cons(makeString("rdfs"), makeString("http://www.w3.org/2000/01/rdf-schema#"));

    private static final SubLList $list19 = cons(makeString("skos"), makeString("http://www.w3.org/2004/02/skos/core#"));

    private static final SubLList $list20 = cons(makeString("xsd"), makeString("http://www.w3.org/2001/XMLSchema#"));

    private static final SubLString $$$cyc = makeString("cyc");

    private static final SubLString $$$opencyc = makeString("opencyc");

    static private final SubLString $str23$_ = makeString("&");

    static private final SubLString $str24$_ = makeString(";");

    private static final SubLList $list25 = cons(makeUninternedSymbol("KEY"), makeSymbol("NAMESPACE"));

    private static final SubLList $list26 = cons(makeSymbol("PREFIX"), makeSymbol("NAMESPACE"));

    private static final SubLString $str27$_ = makeString(":");

    public static final SubLObject owl_english_opencyc_base_uri_internal_alt(SubLObject version_date) {
        if (version_date == UNPROVIDED) {
            version_date = $owl_export_version_date$.getDynamicValue();
        }
        return cconcatenate(com.cyc.cycjava.cycl.owl.owl_uris_and_prefixes.owl_opencyc_base_uri(version_date), $str_alt4$en_);
    }

    public static SubLObject owl_english_opencyc_base_uri_internal(SubLObject version_date) {
        if (version_date == UNPROVIDED) {
            version_date = $owl_export_version_date$.getDynamicValue();
        }
        return cconcatenate(owl_opencyc_base_uri(version_date), $str4$en_);
    }

    public static final SubLObject owl_english_opencyc_base_uri_alt(SubLObject version_date) {
        if (version_date == UNPROVIDED) {
            version_date = $owl_export_version_date$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.owl.owl_uris_and_prefixes.owl_english_opencyc_base_uri_internal(version_date);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, OWL_ENGLISH_OPENCYC_BASE_URI, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), OWL_ENGLISH_OPENCYC_BASE_URI, ONE_INTEGER, NIL, EQL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, OWL_ENGLISH_OPENCYC_BASE_URI, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, version_date, $kw5$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw5$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.owl.owl_uris_and_prefixes.owl_english_opencyc_base_uri_internal(version_date)));
                        memoization_state.caching_state_put(caching_state, version_date, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
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

    public static final SubLObject previous_owl_export_version_dates_alt() {
        return copy_list($previous_owl_export_version_dates$.getGlobalValue());
    }

    public static SubLObject previous_owl_export_version_dates() {
        return copy_list($previous_owl_export_version_dates$.getGlobalValue());
    }

    public static final SubLObject owl_opencyc_base_uri_internal_alt(SubLObject version_date) {
        if (version_date == UNPROVIDED) {
            version_date = $owl_export_version_date$.getDynamicValue();
        }
        return cconcatenate($owl_opencyc_base_uri$.getGlobalValue(), new SubLObject[]{ com.cyc.cycjava.cycl.owl.owl_uris_and_prefixes.owl_url_version_portion(version_date), $owl_uri_concept_prefix$.getGlobalValue() });
    }

    public static SubLObject owl_opencyc_base_uri_internal(SubLObject version_date) {
        if (version_date == UNPROVIDED) {
            version_date = $owl_export_version_date$.getDynamicValue();
        }
        return cconcatenate($owl_opencyc_base_uri$.getGlobalValue(), new SubLObject[]{ owl_url_version_portion(version_date), $owl_uri_concept_prefix$.getGlobalValue() });
    }

    public static final SubLObject owl_opencyc_base_uri_alt(SubLObject version_date) {
        if (version_date == UNPROVIDED) {
            version_date = $owl_export_version_date$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.owl.owl_uris_and_prefixes.owl_opencyc_base_uri_internal(version_date);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, OWL_OPENCYC_BASE_URI, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), OWL_OPENCYC_BASE_URI, ONE_INTEGER, NIL, EQL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, OWL_OPENCYC_BASE_URI, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, version_date, $kw5$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw5$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.owl.owl_uris_and_prefixes.owl_opencyc_base_uri_internal(version_date)));
                        memoization_state.caching_state_put(caching_state, version_date, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
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

    public static final SubLObject owl_cyc_base_uri_internal_alt(SubLObject version_date) {
        if (version_date == UNPROVIDED) {
            version_date = $owl_export_version_date$.getDynamicValue();
        }
        return cconcatenate($owl_cyc_base_uri$.getGlobalValue(), new SubLObject[]{ com.cyc.cycjava.cycl.owl.owl_uris_and_prefixes.owl_url_version_portion(version_date), $owl_uri_concept_prefix$.getGlobalValue() });
    }

    public static SubLObject owl_cyc_base_uri_internal(SubLObject version_date) {
        if (version_date == UNPROVIDED) {
            version_date = $owl_export_version_date$.getDynamicValue();
        }
        return cconcatenate($owl_cyc_base_uri$.getGlobalValue(), new SubLObject[]{ owl_url_version_portion(version_date), $owl_uri_concept_prefix$.getGlobalValue() });
    }

    public static final SubLObject owl_cyc_base_uri_alt(SubLObject version_date) {
        if (version_date == UNPROVIDED) {
            version_date = $owl_export_version_date$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.owl.owl_uris_and_prefixes.owl_cyc_base_uri_internal(version_date);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, OWL_CYC_BASE_URI, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), OWL_CYC_BASE_URI, ONE_INTEGER, NIL, EQL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, OWL_CYC_BASE_URI, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, version_date, $kw5$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw5$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.owl.owl_uris_and_prefixes.owl_cyc_base_uri_internal(version_date)));
                        memoization_state.caching_state_put(caching_state, version_date, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
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
        assert NIL != numeric_date_utilities.universal_date_p(version_date) : "! numeric_date_utilities.universal_date_p(version_date) " + ("numeric_date_utilities.universal_date_p(version_date) " + "CommonSymbols.NIL != numeric_date_utilities.universal_date_p(version_date) ") + version_date;
        final SubLObject standard_datestring = numeric_date_utilities.datestring(version_date);
        final SubLObject year = string_utilities.substring(standard_datestring, SIX_INTEGER, TEN_INTEGER);
        final SubLObject month = string_utilities.substring(standard_datestring, ZERO_INTEGER, TWO_INTEGER);
        final SubLObject day = string_utilities.substring(standard_datestring, THREE_INTEGER, FIVE_INTEGER);
        return cconcatenate(format_nil.format_nil_a_no_copy(year), new SubLObject[]{ $str13$_, format_nil.format_nil_a_no_copy(month), $str13$_, format_nil.format_nil_a_no_copy(day), $str13$_ });
    }

    /**
     *
     *
     * @param VERSION-DATE;
     * 		UNIVERSAL-DATE-P to use in our URLs for versioning, or NIL for an unversioned export.
     */
    @LispMethod(comment = "@param VERSION-DATE;\r\n\t\tUNIVERSAL-DATE-P to use in our URLs for versioning, or NIL for an unversioned export.")
    public static final SubLObject owl_url_version_portion_alt(SubLObject version_date) {
        if (version_date == UNPROVIDED) {
            version_date = $owl_export_version_date$.getDynamicValue();
        }
        if (NIL == version_date) {
            return $empty_string$.getGlobalValue();
        }
        SubLTrampolineFile.checkType(version_date, UNIVERSAL_DATE_P);
        {
            SubLObject standard_datestring = datestring(version_date);
            SubLObject year = substring(standard_datestring, SIX_INTEGER, TEN_INTEGER);
            SubLObject month = substring(standard_datestring, ZERO_INTEGER, TWO_INTEGER);
            SubLObject day = substring(standard_datestring, THREE_INTEGER, FIVE_INTEGER);
            return cconcatenate(format_nil_a_no_copy(year), new SubLObject[]{ $str_alt11$_, format_nil_a_no_copy(month), $str_alt11$_, format_nil_a_no_copy(day), $str_alt11$_ });
        }
    }

    /**
     *
     *
     * @param VERSION-DATE;
     * 		UNIVERSAL-DATE-P to use in our URLs for versioning, or NIL for an unversioned export.
     */
    @LispMethod(comment = "@param VERSION-DATE;\r\n\t\tUNIVERSAL-DATE-P to use in our URLs for versioning, or NIL for an unversioned export.")
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

    public static final SubLObject owl_export_base_uri_alt(SubLObject version_date) {
        if (version_date == UNPROVIDED) {
            version_date = $owl_export_version_date$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != misc_utilities.initialized_p($owl_export_base_uri$.getDynamicValue(thread))) {
                return $owl_export_base_uri$.getDynamicValue(thread);
            } else {
                if (NIL == owlification.$owl_use_external_ids_for_namesP$.getDynamicValue(thread)) {
                    return com.cyc.cycjava.cycl.owl.owl_uris_and_prefixes.owl_english_opencyc_base_uri(version_date);
                } else {
                    if (NIL != $owl_export_limited_to_opencyc_contentP$.getDynamicValue(thread)) {
                        return com.cyc.cycjava.cycl.owl.owl_uris_and_prefixes.owl_opencyc_base_uri(version_date);
                    } else {
                        return com.cyc.cycjava.cycl.owl.owl_uris_and_prefixes.owl_cyc_base_uri(version_date);
                    }
                }
            }
        }
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

    public static final SubLObject cyc_annotation_prefix_alt() {
        return copy_string($cyc_annotation_prefix$.getGlobalValue());
    }

    public static SubLObject cyc_annotation_prefix() {
        return string_utilities.copy_string($cyc_annotation_prefix$.getGlobalValue());
    }

    public static final SubLObject cyc_annotation_base_uri_alt() {
        return copy_string($cyc_annotation_base_uri$.getGlobalValue());
    }

    public static SubLObject cyc_annotation_base_uri() {
        return string_utilities.copy_string($cyc_annotation_base_uri$.getGlobalValue());
    }

    public static SubLObject possibly_entity_reference_for_base_uri(final SubLObject base_uri) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject abbrev = list_utilities.alist_reverse_lookup_without_values($owl_export_entity_map$.getDynamicValue(thread), base_uri, symbol_function(EQUAL), UNPROVIDED);
        return NIL != abbrev ? cconcatenate($str23$_, new SubLObject[]{ format_nil.format_nil_a_no_copy(abbrev), $str24$_ }) : base_uri;
    }

    public static final SubLObject owl_export_default_namespace_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return NIL != misc_utilities.initialized_p($owl_export_default_namespace$.getDynamicValue(thread)) ? ((SubLObject) ($owl_export_default_namespace$.getDynamicValue(thread))) : com.cyc.cycjava.cycl.owl.owl_uris_and_prefixes.owl_export_base_uri(UNPROVIDED);
        }
    }

    public static SubLObject owl_export_default_namespace() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != misc_utilities.initialized_p($owl_export_default_namespace$.getDynamicValue(thread)) ? $owl_export_default_namespace$.getDynamicValue(thread) : owl_export_base_uri(UNPROVIDED);
    }

    public static final SubLObject uri_in_entity_map_namespaceP_alt(SubLObject uri) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdolist_list_var = $owl_export_entity_map$.getDynamicValue(thread);
                SubLObject cons = NIL;
                for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                    {
                        SubLObject datum = cons;
                        SubLObject current = datum;
                        SubLObject key = NIL;
                        SubLObject namespace = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt21);
                        key = current.first();
                        current = current.rest();
                        namespace = current;
                        if (NIL != starts_with(uri, namespace)) {
                            return T;
                        }
                    }
                }
            }
            return NIL;
        }
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

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str_alt0$http___sw_cyc_com_ = makeString("http://sw.cyc.com/");

    static private final SubLString $str_alt1$http___sw_opencyc_org_ = makeString("http://sw.opencyc.org/");

    static private final SubLString $str_alt2$concept_ = makeString("concept/");

    public static final SubLObject possibly_abbreviate_uri_alt(SubLObject uri) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdolist_list_var = $owl_export_entity_map$.getDynamicValue(thread);
                SubLObject cons = NIL;
                for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                    {
                        SubLObject datum = cons;
                        SubLObject current = datum;
                        SubLObject prefix = NIL;
                        SubLObject namespace = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt22);
                        prefix = current.first();
                        current = current.rest();
                        namespace = current;
                        if (NIL != starts_with(uri, namespace)) {
                            return cconcatenate(prefix, new SubLObject[]{ $str_alt23$_, pre_remove(uri, namespace, UNPROVIDED) });
                        }
                    }
                }
            }
            return uri;
        }
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

    static private final SubLString $str_alt4$en_ = makeString("en/");

    public static final SubLSymbol $kw5$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLList $list_alt6 = list(makeInteger(20080610));

    public static final SubLInteger $int$20090407 = makeInteger(20090407);

    static private final SubLString $str_alt11$_ = makeString("/");

    static private final SubLString $str_alt13$http___sw_cyc_com_CycAnnotations_ = makeString("http://sw.cyc.com/CycAnnotations_v1#");

    static private final SubLList $list_alt14 = cons(makeString("owl"), makeString("http://www.w3.org/2002/07/owl#"));

    static private final SubLList $list_alt15 = cons(makeString("rdf"), makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#"));

    static private final SubLList $list_alt16 = cons(makeString("rdfs"), makeString("http://www.w3.org/2000/01/rdf-schema#"));

    public static final SubLObject possibly_use_entity_reference_alt(SubLObject uri) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != owlification.$owl_use_entity_referencesP$.getDynamicValue(thread)) {
                {
                    SubLObject cdolist_list_var = $owl_export_entity_map$.getDynamicValue(thread);
                    SubLObject cons = NIL;
                    for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                        {
                            SubLObject datum = cons;
                            SubLObject current = datum;
                            SubLObject prefix = NIL;
                            SubLObject namespace = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt22);
                            prefix = current.first();
                            current = current.rest();
                            namespace = current;
                            if (uri.equal(namespace)) {
                                return cconcatenate($str_alt24$_, new SubLObject[]{ format_nil_a_no_copy(prefix), $str_alt25$_ });
                            } else {
                                if (NIL != starts_with(uri, namespace)) {
                                    return cconcatenate($str_alt24$_, new SubLObject[]{ format_nil_a_no_copy(prefix), $str_alt25$_, format_nil_a_no_copy(pre_remove(uri, namespace, UNPROVIDED)) });
                                }
                            }
                        }
                    }
                }
            }
            return uri;
        }
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

    static private final SubLList $list_alt17 = cons(makeString("skos"), makeString("http://www.w3.org/2004/02/skos/core#"));

    static private final SubLList $list_alt18 = cons(makeString("xsd"), makeString("http://www.w3.org/2001/XMLSchema#"));

    static private final SubLList $list_alt21 = cons(makeUninternedSymbol("KEY"), makeSymbol("NAMESPACE"));

    static private final SubLList $list_alt22 = cons(makeSymbol("PREFIX"), makeSymbol("NAMESPACE"));

    static private final SubLString $str_alt23$_ = makeString(":");

    static private final SubLString $str_alt24$_ = makeString("&");

    static private final SubLString $str_alt25$_ = makeString(";");

    public static SubLObject declare_owl_uris_and_prefixes_file() {
        declareFunction("owl_english_opencyc_base_uri_internal", "OWL-ENGLISH-OPENCYC-BASE-URI-INTERNAL", 0, 1, false);
        declareFunction("owl_english_opencyc_base_uri", "OWL-ENGLISH-OPENCYC-BASE-URI", 0, 1, false);
        declareFunction("previous_owl_export_version_dates", "PREVIOUS-OWL-EXPORT-VERSION-DATES", 0, 0, false);
        declareFunction("owl_opencyc_base_uri_internal", "OWL-OPENCYC-BASE-URI-INTERNAL", 0, 1, false);
        declareFunction("owl_opencyc_base_uri", "OWL-OPENCYC-BASE-URI", 0, 1, false);
        declareFunction("owl_opencyc_unversioned_base_uri_internal", "OWL-OPENCYC-UNVERSIONED-BASE-URI-INTERNAL", 0, 0, false);
        declareFunction("owl_opencyc_unversioned_base_uri", "OWL-OPENCYC-UNVERSIONED-BASE-URI", 0, 0, false);
        declareFunction("owl_cyc_base_uri_internal", "OWL-CYC-BASE-URI-INTERNAL", 0, 1, false);
        declareFunction("owl_cyc_base_uri", "OWL-CYC-BASE-URI", 0, 1, false);
        declareFunction("owl_cyc_unversioned_base_uri_internal", "OWL-CYC-UNVERSIONED-BASE-URI-INTERNAL", 0, 0, false);
        declareFunction("owl_cyc_unversioned_base_uri", "OWL-CYC-UNVERSIONED-BASE-URI", 0, 0, false);
        declareFunction("owl_url_version_portion_internal", "OWL-URL-VERSION-PORTION-INTERNAL", 0, 1, false);
        declareFunction("owl_url_version_portion", "OWL-URL-VERSION-PORTION", 0, 1, false);
        declareFunction("owl_export_base_uri", "OWL-EXPORT-BASE-URI", 0, 1, false);
        declareFunction("cyc_annotation_prefix", "CYC-ANNOTATION-PREFIX", 0, 0, false);
        declareFunction("cyc_annotation_base_uri", "CYC-ANNOTATION-BASE-URI", 0, 0, false);
        declareFunction("possibly_entity_reference_for_base_uri", "POSSIBLY-ENTITY-REFERENCE-FOR-BASE-URI", 1, 0, false);
        declareFunction("owl_export_default_namespace", "OWL-EXPORT-DEFAULT-NAMESPACE", 0, 0, false);
        declareFunction("uri_in_entity_map_namespaceP", "URI-IN-ENTITY-MAP-NAMESPACE?", 1, 0, false);
        declareFunction("possibly_abbreviate_uri", "POSSIBLY-ABBREVIATE-URI", 1, 0, false);
        declareFunction("possibly_use_entity_reference", "POSSIBLY-USE-ENTITY-REFERENCE", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_owl_uris_and_prefixes_file_alt() {
        deflexical("*OWL-CYC-BASE-URI*", $str_alt0$http___sw_cyc_com_);
        deflexical("*OWL-OPENCYC-BASE-URI*", $str_alt1$http___sw_opencyc_org_);
        deflexical("*OWL-URI-CONCEPT-PREFIX*", $str_alt2$concept_);
        deflexical("*PREVIOUS-OWL-EXPORT-VERSION-DATES*", $list_alt6);
        defparameter("*OWL-EXPORT-VERSION-DATE*", $int$20090407);
        defparameter("*OWL-EXPORT-LIMITED-TO-OPENCYC-CONTENT?*", NIL);
        defparameter("*OWL-EXPORT-INCLUDE-SAMEAS-LINKS-TO-CYC-URIS?*", T);
        defparameter("*OWL-EXPORT-SUPPRESS-ONTOLOGY-NODE?*", NIL);
        defparameter("*OWL-EXPORT-BASE-URI*", misc_utilities.uninitialized());
        deflexical("*CYC-ANNOTATION-PREFIX*", $$$cycAnnot);
        deflexical("*CYC-ANNOTATION-BASE-URI*", $str_alt13$http___sw_cyc_com_CycAnnotations_);
        defparameter("*OWL-EXPORT-ENTITY-MAP*", list($list_alt14, $list_alt15, $list_alt16, $list_alt17, $list_alt18, bq_cons($$$cyc, $owl_cyc_base_uri$.getGlobalValue()), bq_cons($$$opencyc, $owl_opencyc_base_uri$.getGlobalValue()), bq_cons(com.cyc.cycjava.cycl.owl.owl_uris_and_prefixes.cyc_annotation_prefix(), com.cyc.cycjava.cycl.owl.owl_uris_and_prefixes.cyc_annotation_base_uri())));
        defparameter("*OWL-EXPORT-DEFAULT-NAMESPACE*", misc_utilities.uninitialized());
        return NIL;
    }

    public static SubLObject init_owl_uris_and_prefixes_file() {
        if (SubLFiles.USE_V1) {
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
        }
        if (SubLFiles.USE_V2) {
            deflexical("*PREVIOUS-OWL-EXPORT-VERSION-DATES*", $list_alt6);
            defparameter("*OWL-EXPORT-VERSION-DATE*", $int$20090407);
            deflexical("*CYC-ANNOTATION-BASE-URI*", $str_alt13$http___sw_cyc_com_CycAnnotations_);
            defparameter("*OWL-EXPORT-ENTITY-MAP*", list($list_alt14, $list_alt15, $list_alt16, $list_alt17, $list_alt18, bq_cons($$$cyc, $owl_cyc_base_uri$.getGlobalValue()), bq_cons($$$opencyc, $owl_opencyc_base_uri$.getGlobalValue()), bq_cons(com.cyc.cycjava.cycl.owl.owl_uris_and_prefixes.cyc_annotation_prefix(), com.cyc.cycjava.cycl.owl.owl_uris_and_prefixes.cyc_annotation_base_uri())));
        }
        return NIL;
    }

    public static SubLObject init_owl_uris_and_prefixes_file_Previous() {
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
