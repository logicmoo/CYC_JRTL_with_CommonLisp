package com.cyc.cycjava.cycl.owl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.xml_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.misc_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class owl_uris_and_prefixes extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.owl.owl_uris_and_prefixes";
    public static final String myFingerPrint = "3d5711314f62ee583e024638a1ecf6dcca32d6ef9cb11bbbcb95a23780941992";
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-uris-and-prefixes.lisp", position = 844L)
    private static SubLSymbol $owl_cyc_base_uri$;
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-uris-and-prefixes.lisp", position = 907L)
    private static SubLSymbol $owl_opencyc_base_uri$;
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-uris-and-prefixes.lisp", position = 976L)
    private static SubLSymbol $owl_uri_concept_prefix$;
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-uris-and-prefixes.lisp", position = 1222L)
    private static SubLSymbol $previous_owl_export_version_dates$;
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-uris-and-prefixes.lisp", position = 1483L)
    public static SubLSymbol $owl_export_version_date$;
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-uris-and-prefixes.lisp", position = 2987L)
    public static SubLSymbol $owl_export_limited_to_opencyc_contentP$;
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-uris-and-prefixes.lisp", position = 3143L)
    public static SubLSymbol $owl_export_include_sameas_links_to_cyc_urisP$;
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-uris-and-prefixes.lisp", position = 3218L)
    public static SubLSymbol $owl_export_suppress_ontology_nodeP$;
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-uris-and-prefixes.lisp", position = 3285L)
    public static SubLSymbol $owl_export_base_uri$;
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-uris-and-prefixes.lisp", position = 3858L)
    private static SubLSymbol $cyc_annotation_prefix$;
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-uris-and-prefixes.lisp", position = 4006L)
    private static SubLSymbol $cyc_annotation_base_uri$;
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-uris-and-prefixes.lisp", position = 4188L)
    public static SubLSymbol $owl_export_entity_map$;
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-uris-and-prefixes.lisp", position = 4885L)
    public static SubLSymbol $owl_export_default_namespace$;
    private static final SubLString $str0$http___sw_cyc_com_;
    private static final SubLString $str1$http___sw_opencyc_org_;
    private static final SubLString $str2$concept_;
    private static final SubLSymbol $sym3$OWL_ENGLISH_OPENCYC_BASE_URI;
    private static final SubLString $str4$en_;
    private static final SubLList $list5;
    private static final SubLInteger $int6$20120510;
    private static final SubLSymbol $sym7$OWL_OPENCYC_BASE_URI;
    private static final SubLSymbol $sym8$OWL_OPENCYC_UNVERSIONED_BASE_URI;
    private static final SubLSymbol $sym9$OWL_CYC_BASE_URI;
    private static final SubLSymbol $sym10$OWL_CYC_UNVERSIONED_BASE_URI;
    private static final SubLSymbol $sym11$OWL_URL_VERSION_PORTION;
    private static final SubLSymbol $sym12$UNIVERSAL_DATE_P;
    private static final SubLString $str13$_;
    private static final SubLString $str14$cycAnnot;
    private static final SubLString $str15$http___sw_cyc_com_CycAnnotations_;
    private static final SubLList $list16;
    private static final SubLList $list17;
    private static final SubLList $list18;
    private static final SubLList $list19;
    private static final SubLList $list20;
    private static final SubLString $str21$cyc;
    private static final SubLString $str22$opencyc;
    private static final SubLString $str23$_;
    private static final SubLString $str24$_;
    private static final SubLList $list25;
    private static final SubLList $list26;
    private static final SubLString $str27$_;
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-uris-and-prefixes.lisp", position = 1033L)
    public static SubLObject owl_english_opencyc_base_uri_internal(SubLObject version_date) {
        if (version_date == owl_uris_and_prefixes.UNPROVIDED) {
            version_date = owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue();
        }
        return Sequences.cconcatenate(owl_opencyc_base_uri(version_date), (SubLObject)owl_uris_and_prefixes.$str4$en_);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-uris-and-prefixes.lisp", position = 1033L)
    public static SubLObject owl_english_opencyc_base_uri(SubLObject version_date) {
        if (version_date == owl_uris_and_prefixes.UNPROVIDED) {
            version_date = owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)owl_uris_and_prefixes.NIL;
        if (owl_uris_and_prefixes.NIL == v_memoization_state) {
            return owl_english_opencyc_base_uri_internal(version_date);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)owl_uris_and_prefixes.$sym3$OWL_ENGLISH_OPENCYC_BASE_URI, (SubLObject)owl_uris_and_prefixes.UNPROVIDED);
        if (owl_uris_and_prefixes.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)owl_uris_and_prefixes.$sym3$OWL_ENGLISH_OPENCYC_BASE_URI, (SubLObject)owl_uris_and_prefixes.ONE_INTEGER, (SubLObject)owl_uris_and_prefixes.NIL, (SubLObject)owl_uris_and_prefixes.EQL, (SubLObject)owl_uris_and_prefixes.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)owl_uris_and_prefixes.$sym3$OWL_ENGLISH_OPENCYC_BASE_URI, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, version_date, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(owl_english_opencyc_base_uri_internal(version_date)));
            memoization_state.caching_state_put(caching_state, version_date, results, (SubLObject)owl_uris_and_prefixes.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-uris-and-prefixes.lisp", position = 1370L)
    public static SubLObject previous_owl_export_version_dates() {
        return conses_high.copy_list(owl_uris_and_prefixes.$previous_owl_export_version_dates$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-uris-and-prefixes.lisp", position = 1634L)
    public static SubLObject owl_opencyc_base_uri_internal(SubLObject version_date) {
        if (version_date == owl_uris_and_prefixes.UNPROVIDED) {
            version_date = owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue();
        }
        return Sequences.cconcatenate(owl_uris_and_prefixes.$owl_opencyc_base_uri$.getGlobalValue(), new SubLObject[] { owl_url_version_portion(version_date), owl_uris_and_prefixes.$owl_uri_concept_prefix$.getGlobalValue() });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-uris-and-prefixes.lisp", position = 1634L)
    public static SubLObject owl_opencyc_base_uri(SubLObject version_date) {
        if (version_date == owl_uris_and_prefixes.UNPROVIDED) {
            version_date = owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)owl_uris_and_prefixes.NIL;
        if (owl_uris_and_prefixes.NIL == v_memoization_state) {
            return owl_opencyc_base_uri_internal(version_date);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)owl_uris_and_prefixes.$sym7$OWL_OPENCYC_BASE_URI, (SubLObject)owl_uris_and_prefixes.UNPROVIDED);
        if (owl_uris_and_prefixes.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)owl_uris_and_prefixes.$sym7$OWL_OPENCYC_BASE_URI, (SubLObject)owl_uris_and_prefixes.ONE_INTEGER, (SubLObject)owl_uris_and_prefixes.NIL, (SubLObject)owl_uris_and_prefixes.EQL, (SubLObject)owl_uris_and_prefixes.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)owl_uris_and_prefixes.$sym7$OWL_OPENCYC_BASE_URI, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, version_date, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(owl_opencyc_base_uri_internal(version_date)));
            memoization_state.caching_state_put(caching_state, version_date, results, (SubLObject)owl_uris_and_prefixes.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-uris-and-prefixes.lisp", position = 1865L)
    public static SubLObject owl_opencyc_unversioned_base_uri_internal() {
        return Sequences.cconcatenate(owl_uris_and_prefixes.$owl_opencyc_base_uri$.getGlobalValue(), owl_uris_and_prefixes.$owl_uri_concept_prefix$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-uris-and-prefixes.lisp", position = 1865L)
    public static SubLObject owl_opencyc_unversioned_base_uri() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)owl_uris_and_prefixes.NIL;
        if (owl_uris_and_prefixes.NIL == v_memoization_state) {
            return owl_opencyc_unversioned_base_uri_internal();
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)owl_uris_and_prefixes.$sym8$OWL_OPENCYC_UNVERSIONED_BASE_URI, (SubLObject)owl_uris_and_prefixes.UNPROVIDED);
        if (owl_uris_and_prefixes.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)owl_uris_and_prefixes.$sym8$OWL_OPENCYC_UNVERSIONED_BASE_URI, (SubLObject)owl_uris_and_prefixes.ZERO_INTEGER, (SubLObject)owl_uris_and_prefixes.NIL, (SubLObject)owl_uris_and_prefixes.EQL, (SubLObject)owl_uris_and_prefixes.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)owl_uris_and_prefixes.$sym8$OWL_OPENCYC_UNVERSIONED_BASE_URI, caching_state);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)owl_uris_and_prefixes.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(owl_opencyc_unversioned_base_uri_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)owl_uris_and_prefixes.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-uris-and-prefixes.lisp", position = 2014L)
    public static SubLObject owl_cyc_base_uri_internal(SubLObject version_date) {
        if (version_date == owl_uris_and_prefixes.UNPROVIDED) {
            version_date = owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue();
        }
        return Sequences.cconcatenate(owl_uris_and_prefixes.$owl_cyc_base_uri$.getGlobalValue(), new SubLObject[] { owl_url_version_portion(version_date), owl_uris_and_prefixes.$owl_uri_concept_prefix$.getGlobalValue() });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-uris-and-prefixes.lisp", position = 2014L)
    public static SubLObject owl_cyc_base_uri(SubLObject version_date) {
        if (version_date == owl_uris_and_prefixes.UNPROVIDED) {
            version_date = owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)owl_uris_and_prefixes.NIL;
        if (owl_uris_and_prefixes.NIL == v_memoization_state) {
            return owl_cyc_base_uri_internal(version_date);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)owl_uris_and_prefixes.$sym9$OWL_CYC_BASE_URI, (SubLObject)owl_uris_and_prefixes.UNPROVIDED);
        if (owl_uris_and_prefixes.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)owl_uris_and_prefixes.$sym9$OWL_CYC_BASE_URI, (SubLObject)owl_uris_and_prefixes.ONE_INTEGER, (SubLObject)owl_uris_and_prefixes.NIL, (SubLObject)owl_uris_and_prefixes.EQL, (SubLObject)owl_uris_and_prefixes.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)owl_uris_and_prefixes.$sym9$OWL_CYC_BASE_URI, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, version_date, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(owl_cyc_base_uri_internal(version_date)));
            memoization_state.caching_state_put(caching_state, version_date, results, (SubLObject)owl_uris_and_prefixes.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-uris-and-prefixes.lisp", position = 2237L)
    public static SubLObject owl_cyc_unversioned_base_uri_internal() {
        return Sequences.cconcatenate(owl_uris_and_prefixes.$owl_cyc_base_uri$.getGlobalValue(), owl_uris_and_prefixes.$owl_uri_concept_prefix$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-uris-and-prefixes.lisp", position = 2237L)
    public static SubLObject owl_cyc_unversioned_base_uri() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)owl_uris_and_prefixes.NIL;
        if (owl_uris_and_prefixes.NIL == v_memoization_state) {
            return owl_cyc_unversioned_base_uri_internal();
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)owl_uris_and_prefixes.$sym10$OWL_CYC_UNVERSIONED_BASE_URI, (SubLObject)owl_uris_and_prefixes.UNPROVIDED);
        if (owl_uris_and_prefixes.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)owl_uris_and_prefixes.$sym10$OWL_CYC_UNVERSIONED_BASE_URI, (SubLObject)owl_uris_and_prefixes.ZERO_INTEGER, (SubLObject)owl_uris_and_prefixes.NIL, (SubLObject)owl_uris_and_prefixes.EQL, (SubLObject)owl_uris_and_prefixes.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)owl_uris_and_prefixes.$sym10$OWL_CYC_UNVERSIONED_BASE_URI, caching_state);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)owl_uris_and_prefixes.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(owl_cyc_unversioned_base_uri_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)owl_uris_and_prefixes.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-uris-and-prefixes.lisp", position = 2378L)
    public static SubLObject owl_url_version_portion_internal(SubLObject version_date) {
        if (version_date == owl_uris_and_prefixes.UNPROVIDED) {
            version_date = owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue();
        }
        if (owl_uris_and_prefixes.NIL == version_date) {
            return string_utilities.$empty_string$.getGlobalValue();
        }
        assert owl_uris_and_prefixes.NIL != numeric_date_utilities.universal_date_p(version_date) : version_date;
        final SubLObject standard_datestring = numeric_date_utilities.datestring(version_date);
        final SubLObject year = string_utilities.substring(standard_datestring, (SubLObject)owl_uris_and_prefixes.SIX_INTEGER, (SubLObject)owl_uris_and_prefixes.TEN_INTEGER);
        final SubLObject month = string_utilities.substring(standard_datestring, (SubLObject)owl_uris_and_prefixes.ZERO_INTEGER, (SubLObject)owl_uris_and_prefixes.TWO_INTEGER);
        final SubLObject day = string_utilities.substring(standard_datestring, (SubLObject)owl_uris_and_prefixes.THREE_INTEGER, (SubLObject)owl_uris_and_prefixes.FIVE_INTEGER);
        return Sequences.cconcatenate(format_nil.format_nil_a_no_copy(year), new SubLObject[] { owl_uris_and_prefixes.$str13$_, format_nil.format_nil_a_no_copy(month), owl_uris_and_prefixes.$str13$_, format_nil.format_nil_a_no_copy(day), owl_uris_and_prefixes.$str13$_ });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-uris-and-prefixes.lisp", position = 2378L)
    public static SubLObject owl_url_version_portion(SubLObject version_date) {
        if (version_date == owl_uris_and_prefixes.UNPROVIDED) {
            version_date = owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)owl_uris_and_prefixes.NIL;
        if (owl_uris_and_prefixes.NIL == v_memoization_state) {
            return owl_url_version_portion_internal(version_date);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)owl_uris_and_prefixes.$sym11$OWL_URL_VERSION_PORTION, (SubLObject)owl_uris_and_prefixes.UNPROVIDED);
        if (owl_uris_and_prefixes.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)owl_uris_and_prefixes.$sym11$OWL_URL_VERSION_PORTION, (SubLObject)owl_uris_and_prefixes.ONE_INTEGER, (SubLObject)owl_uris_and_prefixes.NIL, (SubLObject)owl_uris_and_prefixes.EQL, (SubLObject)owl_uris_and_prefixes.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)owl_uris_and_prefixes.$sym11$OWL_URL_VERSION_PORTION, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, version_date, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(owl_url_version_portion_internal(version_date)));
            memoization_state.caching_state_put(caching_state, version_date, results, (SubLObject)owl_uris_and_prefixes.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-uris-and-prefixes.lisp", position = 3413L)
    public static SubLObject owl_export_base_uri(SubLObject version_date) {
        if (version_date == owl_uris_and_prefixes.UNPROVIDED) {
            version_date = owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (owl_uris_and_prefixes.NIL != misc_utilities.initialized_p(owl_uris_and_prefixes.$owl_export_base_uri$.getDynamicValue(thread))) {
            return owl_uris_and_prefixes.$owl_export_base_uri$.getDynamicValue(thread);
        }
        if (owl_uris_and_prefixes.NIL == owlification.$owl_use_external_ids_for_namesP$.getDynamicValue(thread)) {
            return owl_english_opencyc_base_uri(version_date);
        }
        if (owl_uris_and_prefixes.NIL != owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.getDynamicValue(thread)) {
            return owl_opencyc_base_uri(version_date);
        }
        return owl_cyc_base_uri(version_date);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-uris-and-prefixes.lisp", position = 3915L)
    public static SubLObject cyc_annotation_prefix() {
        return string_utilities.copy_string(owl_uris_and_prefixes.$cyc_annotation_prefix$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-uris-and-prefixes.lisp", position = 4093L)
    public static SubLObject cyc_annotation_base_uri() {
        return string_utilities.copy_string(owl_uris_and_prefixes.$cyc_annotation_base_uri$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-uris-and-prefixes.lisp", position = 4657L)
    public static SubLObject possibly_entity_reference_for_base_uri(final SubLObject base_uri) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject abbrev = list_utilities.alist_reverse_lookup_without_values(owl_uris_and_prefixes.$owl_export_entity_map$.getDynamicValue(thread), base_uri, Symbols.symbol_function((SubLObject)owl_uris_and_prefixes.EQUAL), (SubLObject)owl_uris_and_prefixes.UNPROVIDED);
        return (owl_uris_and_prefixes.NIL != abbrev) ? Sequences.cconcatenate((SubLObject)owl_uris_and_prefixes.$str23$_, new SubLObject[] { format_nil.format_nil_a_no_copy(abbrev), owl_uris_and_prefixes.$str24$_ }) : base_uri;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-uris-and-prefixes.lisp", position = 4958L)
    public static SubLObject owl_export_default_namespace() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (owl_uris_and_prefixes.NIL != misc_utilities.initialized_p(owl_uris_and_prefixes.$owl_export_default_namespace$.getDynamicValue(thread))) ? owl_uris_and_prefixes.$owl_export_default_namespace$.getDynamicValue(thread) : owl_export_base_uri((SubLObject)owl_uris_and_prefixes.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-uris-and-prefixes.lisp", position = 5134L)
    public static SubLObject uri_in_entity_map_namespaceP(final SubLObject uri) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = owl_uris_and_prefixes.$owl_export_entity_map$.getDynamicValue(thread);
        SubLObject cons = (SubLObject)owl_uris_and_prefixes.NIL;
        cons = cdolist_list_var.first();
        while (owl_uris_and_prefixes.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject key = (SubLObject)owl_uris_and_prefixes.NIL;
            SubLObject namespace = (SubLObject)owl_uris_and_prefixes.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)owl_uris_and_prefixes.$list25);
            key = current.first();
            current = (namespace = current.rest());
            if (owl_uris_and_prefixes.NIL != string_utilities.starts_with(uri, namespace)) {
                return (SubLObject)owl_uris_and_prefixes.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        return (SubLObject)owl_uris_and_prefixes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-uris-and-prefixes.lisp", position = 5311L)
    public static SubLObject possibly_abbreviate_uri(final SubLObject uri) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = owl_uris_and_prefixes.$owl_export_entity_map$.getDynamicValue(thread);
        SubLObject cons = (SubLObject)owl_uris_and_prefixes.NIL;
        cons = cdolist_list_var.first();
        while (owl_uris_and_prefixes.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject prefix = (SubLObject)owl_uris_and_prefixes.NIL;
            SubLObject namespace = (SubLObject)owl_uris_and_prefixes.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)owl_uris_and_prefixes.$list26);
            prefix = current.first();
            current = (namespace = current.rest());
            if (owl_uris_and_prefixes.NIL != string_utilities.starts_with(uri, namespace)) {
                final SubLObject local_part = string_utilities.pre_remove(uri, namespace, (SubLObject)owl_uris_and_prefixes.UNPROVIDED);
                if (owl_uris_and_prefixes.NIL != xml_utilities.valid_xml_name_p(local_part)) {
                    return Sequences.cconcatenate(prefix, new SubLObject[] { owl_uris_and_prefixes.$str27$_, local_part });
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        return uri;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-uris-and-prefixes.lisp", position = 5611L)
    public static SubLObject possibly_use_entity_reference(final SubLObject uri) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (owl_uris_and_prefixes.NIL != owlification.$owl_use_entity_referencesP$.getDynamicValue(thread)) {
            SubLObject cdolist_list_var = owl_uris_and_prefixes.$owl_export_entity_map$.getDynamicValue(thread);
            SubLObject cons = (SubLObject)owl_uris_and_prefixes.NIL;
            cons = cdolist_list_var.first();
            while (owl_uris_and_prefixes.NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = cons;
                SubLObject prefix = (SubLObject)owl_uris_and_prefixes.NIL;
                SubLObject namespace = (SubLObject)owl_uris_and_prefixes.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)owl_uris_and_prefixes.$list26);
                prefix = current.first();
                current = (namespace = current.rest());
                if (uri.equal(namespace)) {
                    return Sequences.cconcatenate((SubLObject)owl_uris_and_prefixes.$str23$_, new SubLObject[] { format_nil.format_nil_a_no_copy(prefix), owl_uris_and_prefixes.$str24$_ });
                }
                if (owl_uris_and_prefixes.NIL != string_utilities.starts_with(uri, namespace)) {
                    return Sequences.cconcatenate((SubLObject)owl_uris_and_prefixes.$str23$_, new SubLObject[] { format_nil.format_nil_a_no_copy(prefix), owl_uris_and_prefixes.$str24$_, format_nil.format_nil_a_no_copy(string_utilities.pre_remove(uri, namespace, (SubLObject)owl_uris_and_prefixes.UNPROVIDED)) });
                }
                cdolist_list_var = cdolist_list_var.rest();
                cons = cdolist_list_var.first();
            }
        }
        return uri;
    }
    
    public static SubLObject declare_owl_uris_and_prefixes_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_uris_and_prefixes", "owl_english_opencyc_base_uri_internal", "OWL-ENGLISH-OPENCYC-BASE-URI-INTERNAL", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_uris_and_prefixes", "owl_english_opencyc_base_uri", "OWL-ENGLISH-OPENCYC-BASE-URI", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_uris_and_prefixes", "previous_owl_export_version_dates", "PREVIOUS-OWL-EXPORT-VERSION-DATES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_uris_and_prefixes", "owl_opencyc_base_uri_internal", "OWL-OPENCYC-BASE-URI-INTERNAL", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_uris_and_prefixes", "owl_opencyc_base_uri", "OWL-OPENCYC-BASE-URI", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_uris_and_prefixes", "owl_opencyc_unversioned_base_uri_internal", "OWL-OPENCYC-UNVERSIONED-BASE-URI-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_uris_and_prefixes", "owl_opencyc_unversioned_base_uri", "OWL-OPENCYC-UNVERSIONED-BASE-URI", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_uris_and_prefixes", "owl_cyc_base_uri_internal", "OWL-CYC-BASE-URI-INTERNAL", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_uris_and_prefixes", "owl_cyc_base_uri", "OWL-CYC-BASE-URI", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_uris_and_prefixes", "owl_cyc_unversioned_base_uri_internal", "OWL-CYC-UNVERSIONED-BASE-URI-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_uris_and_prefixes", "owl_cyc_unversioned_base_uri", "OWL-CYC-UNVERSIONED-BASE-URI", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_uris_and_prefixes", "owl_url_version_portion_internal", "OWL-URL-VERSION-PORTION-INTERNAL", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_uris_and_prefixes", "owl_url_version_portion", "OWL-URL-VERSION-PORTION", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_uris_and_prefixes", "owl_export_base_uri", "OWL-EXPORT-BASE-URI", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_uris_and_prefixes", "cyc_annotation_prefix", "CYC-ANNOTATION-PREFIX", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_uris_and_prefixes", "cyc_annotation_base_uri", "CYC-ANNOTATION-BASE-URI", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_uris_and_prefixes", "possibly_entity_reference_for_base_uri", "POSSIBLY-ENTITY-REFERENCE-FOR-BASE-URI", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_uris_and_prefixes", "owl_export_default_namespace", "OWL-EXPORT-DEFAULT-NAMESPACE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_uris_and_prefixes", "uri_in_entity_map_namespaceP", "URI-IN-ENTITY-MAP-NAMESPACE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_uris_and_prefixes", "possibly_abbreviate_uri", "POSSIBLY-ABBREVIATE-URI", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_uris_and_prefixes", "possibly_use_entity_reference", "POSSIBLY-USE-ENTITY-REFERENCE", 1, 0, false);
        return (SubLObject)owl_uris_and_prefixes.NIL;
    }
    
    public static SubLObject init_owl_uris_and_prefixes_file() {
        owl_uris_and_prefixes.$owl_cyc_base_uri$ = SubLFiles.deflexical("*OWL-CYC-BASE-URI*", (SubLObject)owl_uris_and_prefixes.$str0$http___sw_cyc_com_);
        owl_uris_and_prefixes.$owl_opencyc_base_uri$ = SubLFiles.deflexical("*OWL-OPENCYC-BASE-URI*", (SubLObject)owl_uris_and_prefixes.$str1$http___sw_opencyc_org_);
        owl_uris_and_prefixes.$owl_uri_concept_prefix$ = SubLFiles.deflexical("*OWL-URI-CONCEPT-PREFIX*", (SubLObject)owl_uris_and_prefixes.$str2$concept_);
        owl_uris_and_prefixes.$previous_owl_export_version_dates$ = SubLFiles.deflexical("*PREVIOUS-OWL-EXPORT-VERSION-DATES*", (SubLObject)owl_uris_and_prefixes.$list5);
        owl_uris_and_prefixes.$owl_export_version_date$ = SubLFiles.defparameter("*OWL-EXPORT-VERSION-DATE*", (SubLObject)owl_uris_and_prefixes.$int6$20120510);
        owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$ = SubLFiles.defparameter("*OWL-EXPORT-LIMITED-TO-OPENCYC-CONTENT?*", (SubLObject)owl_uris_and_prefixes.NIL);
        owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$ = SubLFiles.defparameter("*OWL-EXPORT-INCLUDE-SAMEAS-LINKS-TO-CYC-URIS?*", (SubLObject)owl_uris_and_prefixes.T);
        owl_uris_and_prefixes.$owl_export_suppress_ontology_nodeP$ = SubLFiles.defparameter("*OWL-EXPORT-SUPPRESS-ONTOLOGY-NODE?*", (SubLObject)owl_uris_and_prefixes.NIL);
        owl_uris_and_prefixes.$owl_export_base_uri$ = SubLFiles.defparameter("*OWL-EXPORT-BASE-URI*", misc_utilities.uninitialized());
        owl_uris_and_prefixes.$cyc_annotation_prefix$ = SubLFiles.deflexical("*CYC-ANNOTATION-PREFIX*", (SubLObject)owl_uris_and_prefixes.$str14$cycAnnot);
        owl_uris_and_prefixes.$cyc_annotation_base_uri$ = SubLFiles.deflexical("*CYC-ANNOTATION-BASE-URI*", (SubLObject)owl_uris_and_prefixes.$str15$http___sw_cyc_com_CycAnnotations_);
        owl_uris_and_prefixes.$owl_export_entity_map$ = SubLFiles.defparameter("*OWL-EXPORT-ENTITY-MAP*", (SubLObject)ConsesLow.list((SubLObject)owl_uris_and_prefixes.$list16, (SubLObject)owl_uris_and_prefixes.$list17, (SubLObject)owl_uris_and_prefixes.$list18, (SubLObject)owl_uris_and_prefixes.$list19, (SubLObject)owl_uris_and_prefixes.$list20, reader.bq_cons((SubLObject)owl_uris_and_prefixes.$str21$cyc, owl_uris_and_prefixes.$owl_cyc_base_uri$.getGlobalValue()), reader.bq_cons((SubLObject)owl_uris_and_prefixes.$str22$opencyc, owl_uris_and_prefixes.$owl_opencyc_base_uri$.getGlobalValue()), reader.bq_cons(cyc_annotation_prefix(), cyc_annotation_base_uri())));
        owl_uris_and_prefixes.$owl_export_default_namespace$ = SubLFiles.defparameter("*OWL-EXPORT-DEFAULT-NAMESPACE*", misc_utilities.uninitialized());
        return (SubLObject)owl_uris_and_prefixes.NIL;
    }
    
    public static SubLObject setup_owl_uris_and_prefixes_file() {
        memoization_state.note_memoized_function((SubLObject)owl_uris_and_prefixes.$sym3$OWL_ENGLISH_OPENCYC_BASE_URI);
        memoization_state.note_memoized_function((SubLObject)owl_uris_and_prefixes.$sym7$OWL_OPENCYC_BASE_URI);
        memoization_state.note_memoized_function((SubLObject)owl_uris_and_prefixes.$sym8$OWL_OPENCYC_UNVERSIONED_BASE_URI);
        memoization_state.note_memoized_function((SubLObject)owl_uris_and_prefixes.$sym9$OWL_CYC_BASE_URI);
        memoization_state.note_memoized_function((SubLObject)owl_uris_and_prefixes.$sym10$OWL_CYC_UNVERSIONED_BASE_URI);
        memoization_state.note_memoized_function((SubLObject)owl_uris_and_prefixes.$sym11$OWL_URL_VERSION_PORTION);
        return (SubLObject)owl_uris_and_prefixes.NIL;
    }
    
    public void declareFunctions() {
        declare_owl_uris_and_prefixes_file();
    }
    
    public void initializeVariables() {
        init_owl_uris_and_prefixes_file();
    }
    
    public void runTopLevelForms() {
        setup_owl_uris_and_prefixes_file();
    }
    
    static {
        me = (SubLFile)new owl_uris_and_prefixes();
        owl_uris_and_prefixes.$owl_cyc_base_uri$ = null;
        owl_uris_and_prefixes.$owl_opencyc_base_uri$ = null;
        owl_uris_and_prefixes.$owl_uri_concept_prefix$ = null;
        owl_uris_and_prefixes.$previous_owl_export_version_dates$ = null;
        owl_uris_and_prefixes.$owl_export_version_date$ = null;
        owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$ = null;
        owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$ = null;
        owl_uris_and_prefixes.$owl_export_suppress_ontology_nodeP$ = null;
        owl_uris_and_prefixes.$owl_export_base_uri$ = null;
        owl_uris_and_prefixes.$cyc_annotation_prefix$ = null;
        owl_uris_and_prefixes.$cyc_annotation_base_uri$ = null;
        owl_uris_and_prefixes.$owl_export_entity_map$ = null;
        owl_uris_and_prefixes.$owl_export_default_namespace$ = null;
        $str0$http___sw_cyc_com_ = SubLObjectFactory.makeString("http://sw.cyc.com/");
        $str1$http___sw_opencyc_org_ = SubLObjectFactory.makeString("http://sw.opencyc.org/");
        $str2$concept_ = SubLObjectFactory.makeString("concept/");
        $sym3$OWL_ENGLISH_OPENCYC_BASE_URI = SubLObjectFactory.makeSymbol("OWL-ENGLISH-OPENCYC-BASE-URI");
        $str4$en_ = SubLObjectFactory.makeString("en/");
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(20080610), (SubLObject)SubLObjectFactory.makeInteger(20090407));
        $int6$20120510 = SubLObjectFactory.makeInteger(20120510);
        $sym7$OWL_OPENCYC_BASE_URI = SubLObjectFactory.makeSymbol("OWL-OPENCYC-BASE-URI");
        $sym8$OWL_OPENCYC_UNVERSIONED_BASE_URI = SubLObjectFactory.makeSymbol("OWL-OPENCYC-UNVERSIONED-BASE-URI");
        $sym9$OWL_CYC_BASE_URI = SubLObjectFactory.makeSymbol("OWL-CYC-BASE-URI");
        $sym10$OWL_CYC_UNVERSIONED_BASE_URI = SubLObjectFactory.makeSymbol("OWL-CYC-UNVERSIONED-BASE-URI");
        $sym11$OWL_URL_VERSION_PORTION = SubLObjectFactory.makeSymbol("OWL-URL-VERSION-PORTION");
        $sym12$UNIVERSAL_DATE_P = SubLObjectFactory.makeSymbol("UNIVERSAL-DATE-P");
        $str13$_ = SubLObjectFactory.makeString("/");
        $str14$cycAnnot = SubLObjectFactory.makeString("cycAnnot");
        $str15$http___sw_cyc_com_CycAnnotations_ = SubLObjectFactory.makeString("http://sw.cyc.com/CycAnnotations_v1#");
        $list16 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("owl"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2002/07/owl#"));
        $list17 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#"));
        $list18 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdfs"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2000/01/rdf-schema#"));
        $list19 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("skos"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2004/02/skos/core#"));
        $list20 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("xsd"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2001/XMLSchema#"));
        $str21$cyc = SubLObjectFactory.makeString("cyc");
        $str22$opencyc = SubLObjectFactory.makeString("opencyc");
        $str23$_ = SubLObjectFactory.makeString("&");
        $str24$_ = SubLObjectFactory.makeString(";");
        $list25 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeUninternedSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("NAMESPACE"));
        $list26 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("PREFIX"), (SubLObject)SubLObjectFactory.makeSymbol("NAMESPACE"));
        $str27$_ = SubLObjectFactory.makeString(":");
    }
}

/*

	Total time: 130 ms
	
*/